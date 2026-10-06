package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdrrev_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8095Rev_hora = httpContext.GetPar( "Rev_hora") ;
         n8095Rev_hora = false ;
         A8057Rev_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rev_Cod"))) ;
         n8057Rev_Cod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1111134( Gx_mode, A396EmprCod, A8095Rev_hora, A8057Rev_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A652OpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8057Rev_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rev_Cod"))) ;
         n8057Rev_Cod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A8057Rev_Cod) ;
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
            A8059Rev_Hd = (int)(GXutil.lval( httpContext.GetPar( "Rev_Hd"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8059Rev_Hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8059Rev_Hd), 8, 0));
            A8060Rev_Hdr = (byte)(GXutil.lval( httpContext.GetPar( "Rev_Hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8060Rev_Hdr", GXutil.str( A8060Rev_Hdr, 1, 0));
            A8061Rev_Hdp = httpContext.GetPar( "Rev_Hdp") ;
            httpContext.ajax_rsp_assign_attri("", false, "A8061Rev_Hdp", A8061Rev_Hdp);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA CODIGOS REVISTA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRev_obs_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A8062Rev_Ult = (short)(GXutil.lval( httpContext.GetPar( "Rev_Ult"))) ;
      n8062Rev_Ult = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV8UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public thdrrev_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdrrev_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdrrev_impl.class ));
   }

   public thdrrev_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THDRrev.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRev_Hd_Internalname, GXutil.ltrim( localUtil.ntoc( A8059Rev_Hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRev_Hd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8059Rev_Hd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8059Rev_Hd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRev_Hd_Jsonclick, 0, "", "", "", "", "", 1, edtRev_Hd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRev_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A8060Rev_Hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRev_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8060Rev_Hdr), "9") : localUtil.format( DecimalUtil.doubleToDec(A8060Rev_Hdr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRev_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtRev_Hdr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRev_Hdp_Internalname, GXutil.rtrim( A8061Rev_Hdp), GXutil.rtrim( localUtil.format( A8061Rev_Hdp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRev_Hdp_Jsonclick, 0, "", "", "", "", "", 1, edtRev_Hdp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Codigo Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRev_Ult_Internalname, GXutil.ltrim( localUtil.ntoc( A8062Rev_Ult, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRev_Ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8062Rev_Ult), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8062Rev_Ult), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRev_Ult_Jsonclick, 0, "", "", "", "", "", 1, edtRev_Ult_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRev_obs_Internalname, A8064Rev_obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", (short)(0), 1, edtRev_obs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THDRrev.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1134 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1134 = (short)(1) ;
            scanStart1111134( ) ;
            while ( RcdFound1134 != 0 )
            {
               init_level_properties1134( ) ;
               getByPrimaryKey1111134( ) ;
               addRow1111134( ) ;
               scanNext1111134( ) ;
            }
            scanEnd1111134( ) ;
            nBlankRcdCount1134 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8062Rev_Ult = A8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         standaloneNotModal1111134( ) ;
         standaloneModal1111134( ) ;
         sMode1134 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1111134( ) ;
            edtavnRcdDeleted_1134_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1134_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1134_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1134_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_Ln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_LN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ln_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_COD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Cod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_DSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Dsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPENOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_USU_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_usu_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_fec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_FEC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_fec_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_hora_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_HORA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_hora_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRev_obsl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_OBSL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRev_obsl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_obsl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1134 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1111134( ) ;
            }
            sendRow1111134( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1134 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8062Rev_Ult = B8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1134 = (short)(5) ;
         nRcdExists_1134 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1111134( ) ;
            while ( RcdFound1134 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551134( ) ;
               init_level_properties1134( ) ;
               standaloneNotModal1111134( ) ;
               getByPrimaryKey1111134( ) ;
               standaloneModal1111134( ) ;
               addRow1111134( ) ;
               scanNext1111134( ) ;
            }
            scanEnd1111134( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1134 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551134( ) ;
      initAll1111134( ) ;
      init_level_properties1134( ) ;
      B8062Rev_Ult = A8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      nRcdExists_1134 = (short)(0) ;
      nIsMod_1134 = (short)(0) ;
      nRcdDeleted_1134 = (short)(0) ;
      nBlankRcdCount1134 = (short)(nBlankRcdUsr1134+nBlankRcdCount1134) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1134 > 0 )
      {
         standaloneNotModal1111134( ) ;
         standaloneModal1111134( ) ;
         addRow1111134( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRev_Ln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1134 = (short)(nBlankRcdCount1134-1) ;
      }
      Gx_mode = sMode1134 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A8062Rev_Ult = B8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRrev.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THDRrev.htm");
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
      e111112 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z8059Rev_Hd = (int)(localUtil.ctol( httpContext.cgiGet( "Z8059Rev_Hd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8060Rev_Hdr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8060Rev_Hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8061Rev_Hdp = httpContext.cgiGet( "Z8061Rev_Hdp") ;
            Z8062Rev_Ult = (short)(localUtil.ctol( httpContext.cgiGet( "Z8062Rev_Ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8064Rev_obs = httpContext.cgiGet( "Z8064Rev_obs") ;
            O8062Rev_Ult = (short)(localUtil.ctol( httpContext.cgiGet( "O8062Rev_Ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A8059Rev_Hd = (int)(localUtil.ctol( httpContext.cgiGet( edtRev_Hd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8059Rev_Hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8059Rev_Hd), 8, 0));
            A8060Rev_Hdr = (byte)(localUtil.ctol( httpContext.cgiGet( edtRev_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8060Rev_Hdr", GXutil.str( A8060Rev_Hdr, 1, 0));
            A8061Rev_Hdp = httpContext.cgiGet( edtRev_Hdp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8061Rev_Hdp", A8061Rev_Hdp);
            A8062Rev_Ult = (short)(localUtil.ctol( httpContext.cgiGet( edtRev_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8062Rev_Ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
            A8064Rev_obs = httpContext.cgiGet( edtRev_obs_Internalname) ;
            n8064Rev_obs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8064Rev_obs", A8064Rev_obs);
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
               A8059Rev_Hd = (int)(GXutil.lval( httpContext.GetPar( "Rev_Hd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8059Rev_Hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8059Rev_Hd), 8, 0));
               A8060Rev_Hdr = (byte)(GXutil.lval( httpContext.GetPar( "Rev_Hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8060Rev_Hdr", GXutil.str( A8060Rev_Hdr, 1, 0));
               A8061Rev_Hdp = httpContext.GetPar( "Rev_Hdp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8061Rev_Hdp", A8061Rev_Hdp);
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
                        e111112 ();
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
            initAll1111133( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1134_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1134_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1111133( ) ;
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

   public void confirm_1110( )
   {
      beforeValidate1111133( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1111133( ) ;
         }
         else
         {
            checkExtendedTable1111133( ) ;
            if ( AnyError == 0 )
            {
               zm1111133( 10) ;
            }
            closeExtendedTableCursors1111133( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1133 = Gx_mode ;
         confirm_1111134( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1133 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1133 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1110( ) ;
      }
   }

   public void confirm_1111134( )
   {
      s8062Rev_Ult = O8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1111134( ) ;
         if ( ( nRcdExists_1134 != 0 ) || ( nIsMod_1134 != 0 ) )
         {
            getKey1111134( ) ;
            if ( ( nRcdExists_1134 == 0 ) && ( nRcdDeleted_1134 == 0 ) )
            {
               if ( RcdFound1134 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1111134( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1111134( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1111134( 12) ;
                        zm1111134( 13) ;
                     }
                     closeExtendedTableCursors1111134( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8062Rev_Ult = A8062Rev_Ult ;
                     n8062Rev_Ult = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "REV_LN_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRev_Ln_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1134 != 0 )
               {
                  if ( nRcdDeleted_1134 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1111134( ) ;
                     load1111134( ) ;
                     beforeValidate1111134( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1111134( ) ;
                        O8062Rev_Ult = A8062Rev_Ult ;
                        n8062Rev_Ult = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1134 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1111134( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1111134( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1111134( 12) ;
                              zm1111134( 13) ;
                           }
                           closeExtendedTableCursors1111134( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8062Rev_Ult = A8062Rev_Ult ;
                           n8062Rev_Ult = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1134 == 0 )
                  {
                     GXCCtl = "REV_LN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRev_Ln_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1134_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRev_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A8063Rev_Ln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRev_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A8057Rev_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRev_Dsc_Internalname, GXutil.rtrim( A8058Rev_Dsc)) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom)) ;
         httpContext.changePostValue( edtRev_usu_Internalname, GXutil.rtrim( A8092Rev_usu)) ;
         httpContext.changePostValue( edtRev_fec_Internalname, localUtil.format(A8093Rev_fec, "99/99/99")) ;
         httpContext.changePostValue( edtRev_hora_Internalname, GXutil.rtrim( A8095Rev_hora)) ;
         httpContext.changePostValue( edtRev_obsl_Internalname, GXutil.rtrim( A8094Rev_obsl)) ;
         httpContext.changePostValue( "ZT_"+"Z8063Rev_Ln_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8063Rev_Ln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8092Rev_usu_"+sGXsfl_55_idx, GXutil.rtrim( Z8092Rev_usu)) ;
         httpContext.changePostValue( "ZT_"+"Z8093Rev_fec_"+sGXsfl_55_idx, localUtil.dtoc( Z8093Rev_fec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8095Rev_hora_"+sGXsfl_55_idx, GXutil.rtrim( Z8095Rev_hora)) ;
         httpContext.changePostValue( "ZT_"+"Z8094Rev_obsl_"+sGXsfl_55_idx, GXutil.rtrim( Z8094Rev_obsl)) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8057Rev_Cod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8057Rev_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1134_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1134_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1134_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1134 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1134_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1134_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_LN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Ln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_COD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_DSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPENOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_USU_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_FEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_fec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_HORA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_hora_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_OBSL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_obsl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8062Rev_Ult = s8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1110( )
   {
   }

   public void e111112( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thdrrev_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      thdrrev_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thdrrev_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thdrrev_impl.this.A396EmprCod = GXv_char2[0] ;
      thdrrev_impl.this.AV11EmprNom = GXv_char3[0] ;
      thdrrev_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1111133( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8062Rev_Ult = T01117_A8062Rev_Ult[0] ;
            Z8064Rev_obs = T01117_A8064Rev_obs[0] ;
         }
         else
         {
            Z8062Rev_Ult = A8062Rev_Ult ;
            Z8064Rev_obs = A8064Rev_obs ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z8059Rev_Hd = A8059Rev_Hd ;
         Z8060Rev_Hdr = A8060Rev_Hdr ;
         Z8061Rev_Hdp = A8061Rev_Hdp ;
         Z8062Rev_Ult = A8062Rev_Ult ;
         Z8064Rev_obs = A8064Rev_obs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtRev_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ult_Enabled), 5, 0), true);
      AV37Pgmname = "THDRrev" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtRev_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ult_Enabled), 5, 0), true);
      /* Using cursor T01118 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01118_A407EmprNom[0] ;
      n407EmprNom = T01118_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
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

   public void load1111133( )
   {
      /* Using cursor T01119 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1133 = (short)(1) ;
         A407EmprNom = T01119_A407EmprNom[0] ;
         n407EmprNom = T01119_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8062Rev_Ult = T01119_A8062Rev_Ult[0] ;
         n8062Rev_Ult = T01119_n8062Rev_Ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         A8064Rev_obs = T01119_A8064Rev_obs[0] ;
         n8064Rev_obs = T01119_n8064Rev_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8064Rev_obs", A8064Rev_obs);
         zm1111133( -9) ;
      }
      pr_default.close(7);
      onLoadActions1111133( ) ;
   }

   public void onLoadActions1111133( )
   {
   }

   public void checkExtendedTable1111133( )
   {
      nIsDirty_1133 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1111133( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1111133( )
   {
      /* Using cursor T011110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1133 = (short)(1) ;
      }
      else
      {
         RcdFound1133 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01117 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      if ( (pr_default.getStatus(5) != 101) && ( T01117_A8059Rev_Hd[0] == A8059Rev_Hd ) && ( T01117_A8060Rev_Hdr[0] == A8060Rev_Hdr ) && ( GXutil.strcmp(T01117_A8061Rev_Hdp[0], A8061Rev_Hdp) == 0 ) && ( GXutil.strcmp(T01117_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1111133( 9) ;
         RcdFound1133 = (short)(1) ;
         A8062Rev_Ult = T01117_A8062Rev_Ult[0] ;
         n8062Rev_Ult = T01117_n8062Rev_Ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         A8064Rev_obs = T01117_A8064Rev_obs[0] ;
         n8064Rev_obs = T01117_n8064Rev_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8064Rev_obs", A8064Rev_obs);
         O8062Rev_Ult = A8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z8059Rev_Hd = A8059Rev_Hd ;
         Z8060Rev_Hdr = A8060Rev_Hdr ;
         Z8061Rev_Hdp = A8061Rev_Hdp ;
         sMode1133 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1111133( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1133 = (short)(0) ;
            initializeNonKey1111133( ) ;
         }
         Gx_mode = sMode1133 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1133 = (short)(0) ;
         initializeNonKey1111133( ) ;
         sMode1133 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1133 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1111133( ) ;
      if ( RcdFound1133 == 0 )
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
      RcdFound1133 = (short)(0) ;
      /* Using cursor T011111 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T011111_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011111_A8059Rev_Hd[0] == A8059Rev_Hd ) && ( T011111_A8060Rev_Hdr[0] == A8060Rev_Hdr ) && ( GXutil.strcmp(T011111_A8061Rev_Hdp[0], A8061Rev_Hdp) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T011111_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011111_A8059Rev_Hd[0] == A8059Rev_Hd ) && ( T011111_A8060Rev_Hdr[0] == A8060Rev_Hdr ) && ( GXutil.strcmp(T011111_A8061Rev_Hdp[0], A8061Rev_Hdp) == 0 ) )
         {
            RcdFound1133 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1133 = (short)(0) ;
      /* Using cursor T011112 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T011112_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011112_A8059Rev_Hd[0] == A8059Rev_Hd ) && ( T011112_A8060Rev_Hdr[0] == A8060Rev_Hdr ) && ( GXutil.strcmp(T011112_A8061Rev_Hdp[0], A8061Rev_Hdp) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T011112_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011112_A8059Rev_Hd[0] == A8059Rev_Hd ) && ( T011112_A8060Rev_Hdr[0] == A8060Rev_Hdr ) && ( GXutil.strcmp(T011112_A8061Rev_Hdp[0], A8061Rev_Hdp) == 0 ) )
         {
            RcdFound1133 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1111133( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8062Rev_Ult = O8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         GX_FocusControl = edtRev_obs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1111133( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1133 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8059Rev_Hd != Z8059Rev_Hd ) || ( A8060Rev_Hdr != Z8060Rev_Hdr ) || ( GXutil.strcmp(A8061Rev_Hdp, Z8061Rev_Hdp) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A8062Rev_Ult = O8062Rev_Ult ;
               n8062Rev_Ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRev_obs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A8062Rev_Ult = O8062Rev_Ult ;
               n8062Rev_Ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
               update1111133( ) ;
               GX_FocusControl = edtRev_obs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8059Rev_Hd != Z8059Rev_Hd ) || ( A8060Rev_Hdr != Z8060Rev_Hdr ) || ( GXutil.strcmp(A8061Rev_Hdp, Z8061Rev_Hdp) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A8062Rev_Ult = O8062Rev_Ult ;
               n8062Rev_Ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
               GX_FocusControl = edtRev_obs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1111133( ) ;
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
                  A8062Rev_Ult = O8062Rev_Ult ;
                  n8062Rev_Ult = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
                  GX_FocusControl = edtRev_obs_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1111133( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8059Rev_Hd != Z8059Rev_Hd ) || ( A8060Rev_Hdr != Z8060Rev_Hdr ) || ( GXutil.strcmp(A8061Rev_Hdp, Z8061Rev_Hdp) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A8062Rev_Ult = O8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRev_obs_Internalname ;
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
      getKey1111133( ) ;
      if ( RcdFound1133 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8059Rev_Hd != Z8059Rev_Hd ) || ( A8060Rev_Hdr != Z8060Rev_Hdr ) || ( GXutil.strcmp(A8061Rev_Hdp, Z8061Rev_Hdp) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8059Rev_Hd != Z8059Rev_Hd ) || ( A8060Rev_Hdr != Z8060Rev_Hdr ) || ( GXutil.strcmp(A8061Rev_Hdp, Z8061Rev_Hdp) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thdrrev");
      GX_FocusControl = edtRev_obs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1110( ) ;
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
      if ( RcdFound1133 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRev_obs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1111133( ) ;
      if ( RcdFound1133 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRev_obs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1111133( ) ;
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
      if ( RcdFound1133 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRev_obs_Internalname ;
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
      if ( RcdFound1133 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRev_obs_Internalname ;
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
      scanStart1111133( ) ;
      if ( RcdFound1133 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1133 != 0 )
         {
            scanNext1111133( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRev_obs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1111133( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1111133( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01116 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRrev"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z8062Rev_Ult != T01116_A8062Rev_Ult[0] ) || ( GXutil.strcmp(Z8064Rev_obs, T01116_A8064Rev_obs[0]) != 0 ) )
         {
            if ( Z8062Rev_Ult != T01116_A8062Rev_Ult[0] )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_Ult");
               GXutil.writeLogRaw("Old: ",Z8062Rev_Ult);
               GXutil.writeLogRaw("Current: ",T01116_A8062Rev_Ult[0]);
            }
            if ( GXutil.strcmp(Z8064Rev_obs, T01116_A8064Rev_obs[0]) != 0 )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_obs");
               GXutil.writeLogRaw("Old: ",Z8064Rev_obs);
               GXutil.writeLogRaw("Current: ",T01116_A8064Rev_obs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRrev"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1111133( )
   {
      beforeValidate1111133( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1111133( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1111133( 0) ;
         checkOptimisticConcurrency1111133( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1111133( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1111133( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011113 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Boolean.valueOf(n8062Rev_Ult), Short.valueOf(A8062Rev_Ult), Boolean.valueOf(n8064Rev_obs), A8064Rev_obs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRrev");
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
                        processLevel1111133( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1110( ) ;
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
            load1111133( ) ;
         }
         endLevel1111133( ) ;
      }
      closeExtendedTableCursors1111133( ) ;
   }

   public void update1111133( )
   {
      beforeValidate1111133( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1111133( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1111133( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1111133( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1111133( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011114 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n8062Rev_Ult), Short.valueOf(A8062Rev_Ult), Boolean.valueOf(n8064Rev_obs), A8064Rev_obs, A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRrev");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRrev"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1111133( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1111133( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1110( ) ;
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
         endLevel1111133( ) ;
      }
      closeExtendedTableCursors1111133( ) ;
   }

   public void deferredUpdate1111133( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1111133( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1111133( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1111133( ) ;
         afterConfirm1111133( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1111133( ) ;
            if ( AnyError == 0 )
            {
               A8062Rev_Ult = O8062Rev_Ult ;
               n8062Rev_Ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
               scanStart1111134( ) ;
               while ( RcdFound1134 != 0 )
               {
                  getByPrimaryKey1111134( ) ;
                  delete1111134( ) ;
                  scanNext1111134( ) ;
                  O8062Rev_Ult = A8062Rev_Ult ;
                  n8062Rev_Ult = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
               }
               scanEnd1111134( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011115 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRrev");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1133 == 0 )
                        {
                           initAll1111133( ) ;
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
                        resetCaption1110( ) ;
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
      sMode1133 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1111133( ) ;
      Gx_mode = sMode1133 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1111133( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1111134( )
   {
      s8062Rev_Ult = O8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1111134( ) ;
         if ( ( nRcdExists_1134 != 0 ) || ( nIsMod_1134 != 0 ) )
         {
            standaloneNotModal1111134( ) ;
            getKey1111134( ) ;
            if ( ( nRcdExists_1134 == 0 ) && ( nRcdDeleted_1134 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1111134( ) ;
            }
            else
            {
               if ( RcdFound1134 != 0 )
               {
                  if ( ( nRcdDeleted_1134 != 0 ) && ( nRcdExists_1134 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1111134( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1134 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1111134( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1134 == 0 )
                  {
                     GXCCtl = "REV_LN_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRev_Ln_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8062Rev_Ult = A8062Rev_Ult ;
            n8062Rev_Ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1134_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRev_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A8063Rev_Ln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRev_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A8057Rev_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRev_Dsc_Internalname, GXutil.rtrim( A8058Rev_Dsc)) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom)) ;
         httpContext.changePostValue( edtRev_usu_Internalname, GXutil.rtrim( A8092Rev_usu)) ;
         httpContext.changePostValue( edtRev_fec_Internalname, localUtil.format(A8093Rev_fec, "99/99/99")) ;
         httpContext.changePostValue( edtRev_hora_Internalname, GXutil.rtrim( A8095Rev_hora)) ;
         httpContext.changePostValue( edtRev_obsl_Internalname, GXutil.rtrim( A8094Rev_obsl)) ;
         httpContext.changePostValue( "ZT_"+"Z8063Rev_Ln_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8063Rev_Ln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8092Rev_usu_"+sGXsfl_55_idx, GXutil.rtrim( Z8092Rev_usu)) ;
         httpContext.changePostValue( "ZT_"+"Z8093Rev_fec_"+sGXsfl_55_idx, localUtil.dtoc( Z8093Rev_fec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8095Rev_hora_"+sGXsfl_55_idx, GXutil.rtrim( Z8095Rev_hora)) ;
         httpContext.changePostValue( "ZT_"+"Z8094Rev_obsl_"+sGXsfl_55_idx, GXutil.rtrim( Z8094Rev_obsl)) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8057Rev_Cod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8057Rev_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1134_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1134_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1134_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1134 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1134_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1134_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_LN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Ln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_COD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_DSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Dsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPENOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_USU_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_FEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_fec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_HORA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_hora_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REV_OBSL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_obsl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1111134( ) ;
      if ( AnyError != 0 )
      {
         O8062Rev_Ult = s8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      }
      nRcdExists_1134 = (short)(0) ;
      nIsMod_1134 = (short)(0) ;
      nRcdDeleted_1134 = (short)(0) ;
   }

   public void processLevel1111133( )
   {
      /* Save parent mode. */
      sMode1133 = Gx_mode ;
      processNestedLevel1111134( ) ;
      if ( AnyError != 0 )
      {
         O8062Rev_Ult = s8062Rev_Ult ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1133 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T011116 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n8062Rev_Ult), Short.valueOf(A8062Rev_Ult), A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRrev");
   }

   public void endLevel1111133( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete1111133( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdrrev");
         if ( AnyError == 0 )
         {
            confirmValues1110( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdrrev");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1111133( )
   {
      /* Scan By routine */
      /* Using cursor T011117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      RcdFound1133 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1133 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1111133( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1133 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1133 = (short)(1) ;
      }
   }

   public void scanEnd1111133( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1111133( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1111133( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1111133( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1111133( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1111133( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1111133( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1111133( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtRev_Hd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Hd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Hd_Enabled), 5, 0), true);
      edtRev_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Hdr_Enabled), 5, 0), true);
      edtRev_Hdp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Hdp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Hdp_Enabled), 5, 0), true);
      edtRev_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ult_Enabled), 5, 0), true);
      edtRev_obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_obs_Enabled), 5, 0), true);
   }

   public void zm1111134( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8092Rev_usu = T01113_A8092Rev_usu[0] ;
            Z8093Rev_fec = T01113_A8093Rev_fec[0] ;
            Z8095Rev_hora = T01113_A8095Rev_hora[0] ;
            Z8094Rev_obsl = T01113_A8094Rev_obsl[0] ;
            Z652OpeCod = T01113_A652OpeCod[0] ;
            Z8057Rev_Cod = T01113_A8057Rev_Cod[0] ;
         }
         else
         {
            Z8092Rev_usu = A8092Rev_usu ;
            Z8093Rev_fec = A8093Rev_fec ;
            Z8095Rev_hora = A8095Rev_hora ;
            Z8094Rev_obsl = A8094Rev_obsl ;
            Z652OpeCod = A652OpeCod ;
            Z8057Rev_Cod = A8057Rev_Cod ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z8059Rev_Hd = A8059Rev_Hd ;
         Z8060Rev_Hdr = A8060Rev_Hdr ;
         Z8061Rev_Hdp = A8061Rev_Hdp ;
         Z8063Rev_Ln = A8063Rev_Ln ;
         Z8092Rev_usu = A8092Rev_usu ;
         Z8093Rev_fec = A8093Rev_fec ;
         Z8095Rev_hora = A8095Rev_hora ;
         Z8094Rev_obsl = A8094Rev_obsl ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z8057Rev_Cod = A8057Rev_Cod ;
         Z8058Rev_Dsc = A8058Rev_Dsc ;
         Z653OpeNom = A653OpeNom ;
      }
   }

   public void standaloneNotModal1111134( )
   {
      edtRev_usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_usu_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ult_Enabled), 5, 0), true);
      edtRev_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ult_Enabled), 5, 0), true);
   }

   public void standaloneModal1111134( )
   {
      if ( isIns( )  )
      {
         A8062Rev_Ult = (short)(O8062Rev_Ult+1) ;
         n8062Rev_Ult = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A8063Rev_Ln = A8062Rev_Ult ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8092Rev_usu)==0) && ( Gx_BScreen == 0 ) )
      {
         A8092Rev_usu = AV8UsurCod ;
         n8092Rev_usu = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A8093Rev_fec)) && ( Gx_BScreen == 0 ) )
      {
         A8093Rev_fec = GXutil.today( ) ;
         n8093Rev_fec = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRev_Ln_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRev_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ln_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtRev_Ln_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRev_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ln_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1111134( )
   {
      /* Using cursor T011118 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1134 = (short)(1) ;
         A8092Rev_usu = T011118_A8092Rev_usu[0] ;
         n8092Rev_usu = T011118_n8092Rev_usu[0] ;
         A8093Rev_fec = T011118_A8093Rev_fec[0] ;
         n8093Rev_fec = T011118_n8093Rev_fec[0] ;
         A8058Rev_Dsc = T011118_A8058Rev_Dsc[0] ;
         n8058Rev_Dsc = T011118_n8058Rev_Dsc[0] ;
         A653OpeNom = T011118_A653OpeNom[0] ;
         n653OpeNom = T011118_n653OpeNom[0] ;
         A8095Rev_hora = T011118_A8095Rev_hora[0] ;
         n8095Rev_hora = T011118_n8095Rev_hora[0] ;
         A8094Rev_obsl = T011118_A8094Rev_obsl[0] ;
         n8094Rev_obsl = T011118_n8094Rev_obsl[0] ;
         A652OpeCod = T011118_A652OpeCod[0] ;
         n652OpeCod = T011118_n652OpeCod[0] ;
         A8057Rev_Cod = T011118_A8057Rev_Cod[0] ;
         n8057Rev_Cod = T011118_n8057Rev_Cod[0] ;
         zm1111134( -11) ;
      }
      pr_default.close(16);
      onLoadActions1111134( ) ;
   }

   public void onLoadActions1111134( )
   {
   }

   public void checkExtendedTable1111134( )
   {
      nIsDirty_1134 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1111134( ) ;
      /* Using cursor T01114 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01114_A653OpeNom[0] ;
      n653OpeNom = T01114_n653OpeNom[0] ;
      pr_default.close(2);
      /* Using cursor T01115 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n8057Rev_Cod), Short.valueOf(A8057Rev_Cod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "REV_COD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REVCOD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRev_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8058Rev_Dsc = T01115_A8058Rev_Dsc[0] ;
      n8058Rev_Dsc = T01115_n8058Rev_Dsc[0] ;
      pr_default.close(3);
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A8095Rev_hora ;
         new app.pverhhmm(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         thdrrev_impl.this.A396EmprCod = GXv_char4[0] ;
         thdrrev_impl.this.A8095Rev_hora = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void closeExtendedTableCursors1111134( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1111134( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A652OpeCod )
   {
      /* Using cursor T011119 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T011119_A653OpeNom[0] ;
      n653OpeNom = T011119_n653OpeNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_13( String A396EmprCod ,
                          short A8057Rev_Cod )
   {
      /* Using cursor T011120 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n8057Rev_Cod), Short.valueOf(A8057Rev_Cod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "REV_COD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REVCOD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRev_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8058Rev_Dsc = T011120_A8058Rev_Dsc[0] ;
      n8058Rev_Dsc = T011120_n8058Rev_Dsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8058Rev_Dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1111134( )
   {
      /* Using cursor T011121 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1134 = (short)(1) ;
      }
      else
      {
         RcdFound1134 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1111134( )
   {
      /* Using cursor T01113 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln)});
      if ( (pr_default.getStatus(1) != 101) && ( T01113_A8059Rev_Hd[0] == A8059Rev_Hd ) && ( T01113_A8060Rev_Hdr[0] == A8060Rev_Hdr ) && ( GXutil.strcmp(T01113_A8061Rev_Hdp[0], A8061Rev_Hdp) == 0 ) && ( GXutil.strcmp(T01113_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1111134( 11) ;
         RcdFound1134 = (short)(1) ;
         initializeNonKey1111134( ) ;
         A8063Rev_Ln = T01113_A8063Rev_Ln[0] ;
         A8092Rev_usu = T01113_A8092Rev_usu[0] ;
         n8092Rev_usu = T01113_n8092Rev_usu[0] ;
         A8093Rev_fec = T01113_A8093Rev_fec[0] ;
         n8093Rev_fec = T01113_n8093Rev_fec[0] ;
         A8095Rev_hora = T01113_A8095Rev_hora[0] ;
         n8095Rev_hora = T01113_n8095Rev_hora[0] ;
         A8094Rev_obsl = T01113_A8094Rev_obsl[0] ;
         n8094Rev_obsl = T01113_n8094Rev_obsl[0] ;
         A652OpeCod = T01113_A652OpeCod[0] ;
         n652OpeCod = T01113_n652OpeCod[0] ;
         A8057Rev_Cod = T01113_A8057Rev_Cod[0] ;
         n8057Rev_Cod = T01113_n8057Rev_Cod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z8059Rev_Hd = A8059Rev_Hd ;
         Z8060Rev_Hdr = A8060Rev_Hdr ;
         Z8061Rev_Hdp = A8061Rev_Hdp ;
         Z8063Rev_Ln = A8063Rev_Ln ;
         sMode1134 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1111134( ) ;
         load1111134( ) ;
         Gx_mode = sMode1134 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1134 = (short)(0) ;
         initializeNonKey1111134( ) ;
         sMode1134 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1111134( ) ;
         Gx_mode = sMode1134 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1111134( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1111134( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01112 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRTA1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8092Rev_usu, T01112_A8092Rev_usu[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8093Rev_fec), GXutil.resetTime(T01112_A8093Rev_fec[0])) ) || ( GXutil.strcmp(Z8095Rev_hora, T01112_A8095Rev_hora[0]) != 0 ) || ( GXutil.strcmp(Z8094Rev_obsl, T01112_A8094Rev_obsl[0]) != 0 ) || ( Z652OpeCod != T01112_A652OpeCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8057Rev_Cod != T01112_A8057Rev_Cod[0] ) )
         {
            if ( GXutil.strcmp(Z8092Rev_usu, T01112_A8092Rev_usu[0]) != 0 )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_usu");
               GXutil.writeLogRaw("Old: ",Z8092Rev_usu);
               GXutil.writeLogRaw("Current: ",T01112_A8092Rev_usu[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8093Rev_fec), GXutil.resetTime(T01112_A8093Rev_fec[0])) ) )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_fec");
               GXutil.writeLogRaw("Old: ",Z8093Rev_fec);
               GXutil.writeLogRaw("Current: ",T01112_A8093Rev_fec[0]);
            }
            if ( GXutil.strcmp(Z8095Rev_hora, T01112_A8095Rev_hora[0]) != 0 )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_hora");
               GXutil.writeLogRaw("Old: ",Z8095Rev_hora);
               GXutil.writeLogRaw("Current: ",T01112_A8095Rev_hora[0]);
            }
            if ( GXutil.strcmp(Z8094Rev_obsl, T01112_A8094Rev_obsl[0]) != 0 )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_obsl");
               GXutil.writeLogRaw("Old: ",Z8094Rev_obsl);
               GXutil.writeLogRaw("Current: ",T01112_A8094Rev_obsl[0]);
            }
            if ( Z652OpeCod != T01112_A652OpeCod[0] )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01112_A652OpeCod[0]);
            }
            if ( Z8057Rev_Cod != T01112_A8057Rev_Cod[0] )
            {
               GXutil.writeLogln("thdrrev:[seudo value changed for attri]"+"Rev_Cod");
               GXutil.writeLogRaw("Old: ",Z8057Rev_Cod);
               GXutil.writeLogRaw("Current: ",T01112_A8057Rev_Cod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRTA1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1111134( )
   {
      beforeValidate1111134( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1111134( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1111134( 0) ;
         checkOptimisticConcurrency1111134( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1111134( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1111134( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011122 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln), Boolean.valueOf(n8092Rev_usu), A8092Rev_usu, Boolean.valueOf(n8093Rev_fec), A8093Rev_fec, Boolean.valueOf(n8095Rev_hora), A8095Rev_hora, Boolean.valueOf(n8094Rev_obsl), A8094Rev_obsl, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), Boolean.valueOf(n8057Rev_Cod), Short.valueOf(A8057Rev_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRTA1");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1111134( ) ;
         }
         endLevel1111134( ) ;
      }
      closeExtendedTableCursors1111134( ) ;
   }

   public void update1111134( )
   {
      beforeValidate1111134( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1111134( ) ;
      }
      if ( ( nIsMod_1134 != 0 ) || ( nIsDirty_1134 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1111134( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1111134( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1111134( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011123 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n8092Rev_usu), A8092Rev_usu, Boolean.valueOf(n8093Rev_fec), A8093Rev_fec, Boolean.valueOf(n8095Rev_hora), A8095Rev_hora, Boolean.valueOf(n8094Rev_obsl), A8094Rev_obsl, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), Boolean.valueOf(n8057Rev_Cod), Short.valueOf(A8057Rev_Cod), A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRTA1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRTA1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1111134( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1111134( ) ;
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
            endLevel1111134( ) ;
         }
      }
      closeExtendedTableCursors1111134( ) ;
   }

   public void deferredUpdate1111134( )
   {
   }

   public void delete1111134( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1111134( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1111134( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1111134( ) ;
         afterConfirm1111134( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1111134( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011124 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp, Short.valueOf(A8063Rev_Ln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRTA1");
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
      sMode1134 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1111134( ) ;
      Gx_mode = sMode1134 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1111134( )
   {
      standaloneModal1111134( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A8095Rev_hora ;
            new app.pverhhmm(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
            thdrrev_impl.this.A396EmprCod = GXv_char4[0] ;
            thdrrev_impl.this.A8095Rev_hora = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         }
         /* Using cursor T011125 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n8057Rev_Cod), Short.valueOf(A8057Rev_Cod)});
         A8058Rev_Dsc = T011125_A8058Rev_Dsc[0] ;
         n8058Rev_Dsc = T011125_n8058Rev_Dsc[0] ;
         pr_default.close(23);
         /* Using cursor T011126 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T011126_A653OpeNom[0] ;
         n653OpeNom = T011126_n653OpeNom[0] ;
         pr_default.close(24);
      }
   }

   public void endLevel1111134( )
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

   public void scanStart1111134( )
   {
      /* Scan By routine */
      /* Using cursor T011127 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A8059Rev_Hd), Byte.valueOf(A8060Rev_Hdr), A8061Rev_Hdp});
      RcdFound1134 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1134 = (short)(1) ;
         A8063Rev_Ln = T011127_A8063Rev_Ln[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1111134( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1134 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1134 = (short)(1) ;
         A8063Rev_Ln = T011127_A8063Rev_Ln[0] ;
      }
   }

   public void scanEnd1111134( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1111134( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1111134( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1111134( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1111134( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1111134( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1111134( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1111134( )
   {
      edtRev_Ln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ln_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Cod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Dsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_usu_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_fec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_fec_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_hora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_hora_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_obsl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_obsl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_obsl_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1111134( )
   {
   }

   public void send_integrity_lvl_hashes1111133( )
   {
   }

   public void subsflControlProps_551134( )
   {
      edtavnRcdDeleted_1134_Internalname = "vNRCDDELETED_1134_"+sGXsfl_55_idx ;
      edtRev_Ln_Internalname = "REV_LN_"+sGXsfl_55_idx ;
      edtRev_Cod_Internalname = "REV_COD_"+sGXsfl_55_idx ;
      edtRev_Dsc_Internalname = "REV_DSC_"+sGXsfl_55_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_55_idx ;
      edtOpeNom_Internalname = "OPENOM_"+sGXsfl_55_idx ;
      edtRev_usu_Internalname = "REV_USU_"+sGXsfl_55_idx ;
      edtRev_fec_Internalname = "REV_FEC_"+sGXsfl_55_idx ;
      edtRev_hora_Internalname = "REV_HORA_"+sGXsfl_55_idx ;
      edtRev_obsl_Internalname = "REV_OBSL_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551134( )
   {
      edtavnRcdDeleted_1134_Internalname = "vNRCDDELETED_1134_"+sGXsfl_55_fel_idx ;
      edtRev_Ln_Internalname = "REV_LN_"+sGXsfl_55_fel_idx ;
      edtRev_Cod_Internalname = "REV_COD_"+sGXsfl_55_fel_idx ;
      edtRev_Dsc_Internalname = "REV_DSC_"+sGXsfl_55_fel_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_55_fel_idx ;
      edtOpeNom_Internalname = "OPENOM_"+sGXsfl_55_fel_idx ;
      edtRev_usu_Internalname = "REV_USU_"+sGXsfl_55_fel_idx ;
      edtRev_fec_Internalname = "REV_FEC_"+sGXsfl_55_fel_idx ;
      edtRev_hora_Internalname = "REV_HORA_"+sGXsfl_55_fel_idx ;
      edtRev_obsl_Internalname = "REV_OBSL_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1111134( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551134( ) ;
      sendRow1111134( ) ;
   }

   public void sendRow1111134( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1134_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1134_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1134), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1134), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1134_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1134_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_Ln_Internalname,GXutil.ltrim( localUtil.ntoc( A8063Rev_Ln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8063Rev_Ln), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_Ln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_Ln_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A8057Rev_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRev_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8057Rev_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8057Rev_Cod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_Cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_Cod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_Dsc_Internalname,GXutil.rtrim( A8058Rev_Dsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_Dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOpeCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeNom_Internalname,GXutil.rtrim( A653OpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOpeNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_usu_Internalname,GXutil.rtrim( A8092Rev_usu),GXutil.rtrim( localUtil.format( A8092Rev_usu, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_usu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_usu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_fec_Internalname,localUtil.format(A8093Rev_fec, "99/99/99"),localUtil.format( A8093Rev_fec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_fec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_fec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_hora_Internalname,GXutil.rtrim( A8095Rev_hora),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_hora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_hora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1134_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRev_obsl_Internalname,GXutil.rtrim( A8094Rev_obsl),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRev_obsl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRev_obsl_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1111134( ) ;
      GXCCtl = "Z8063Rev_Ln_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8063Rev_Ln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8092Rev_usu_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8092Rev_usu));
      GXCCtl = "Z8093Rev_fec_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z8093Rev_fec, 0, "/"));
      GXCCtl = "Z8095Rev_hora_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8095Rev_hora));
      GXCCtl = "Z8094Rev_obsl_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8094Rev_obsl));
      GXCCtl = "Z652OpeCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8057Rev_Cod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8057Rev_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1134_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1134_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1134_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1134, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1134_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1134_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_LN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Ln_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_COD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_DSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPENOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_USU_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_FEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_fec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_HORA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_hora_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REV_OBSL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_obsl_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1111134( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551134( ) ;
      edtavnRcdDeleted_1134_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1134_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_Ln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_LN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_COD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_Dsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_DSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPENOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_USU_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_fec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_FEC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_hora_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_HORA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRev_obsl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REV_OBSL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1134_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1134_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1134");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1134_Internalname ;
         wbErr = true ;
         nRcdDeleted_1134 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1134 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1134_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRev_Ln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRev_Ln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "REV_LN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRev_Ln_Internalname ;
         wbErr = true ;
         A8063Rev_Ln = (short)(0) ;
      }
      else
      {
         A8063Rev_Ln = (short)(localUtil.ctol( httpContext.cgiGet( edtRev_Ln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRev_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRev_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "REV_COD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRev_Cod_Internalname ;
         wbErr = true ;
         A8057Rev_Cod = (short)(0) ;
         n8057Rev_Cod = false ;
      }
      else
      {
         A8057Rev_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRev_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8057Rev_Cod = false ;
      }
      A8058Rev_Dsc = httpContext.cgiGet( edtRev_Dsc_Internalname) ;
      n8058Rev_Dsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         wbErr = true ;
         A652OpeCod = 0 ;
         n652OpeCod = false ;
      }
      else
      {
         A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n652OpeCod = false ;
      }
      A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
      n653OpeNom = false ;
      A8092Rev_usu = GXutil.upper( httpContext.cgiGet( edtRev_usu_Internalname)) ;
      n8092Rev_usu = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtRev_fec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "REV_FEC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRev_fec_Internalname ;
         wbErr = true ;
         A8093Rev_fec = GXutil.nullDate() ;
         n8093Rev_fec = false ;
      }
      else
      {
         A8093Rev_fec = localUtil.ctod( httpContext.cgiGet( edtRev_fec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n8093Rev_fec = false ;
      }
      A8095Rev_hora = httpContext.cgiGet( edtRev_hora_Internalname) ;
      n8095Rev_hora = false ;
      A8094Rev_obsl = httpContext.cgiGet( edtRev_obsl_Internalname) ;
      n8094Rev_obsl = false ;
      GXCCtl = "Z8063Rev_Ln_" + sGXsfl_55_idx ;
      Z8063Rev_Ln = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8092Rev_usu_" + sGXsfl_55_idx ;
      Z8092Rev_usu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8093Rev_fec_" + sGXsfl_55_idx ;
      Z8093Rev_fec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8095Rev_hora_" + sGXsfl_55_idx ;
      Z8095Rev_hora = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8094Rev_obsl_" + sGXsfl_55_idx ;
      Z8094Rev_obsl = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z652OpeCod_" + sGXsfl_55_idx ;
      Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8057Rev_Cod_" + sGXsfl_55_idx ;
      Z8057Rev_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1134_" + sGXsfl_55_idx ;
      nRcdDeleted_1134 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1134_" + sGXsfl_55_idx ;
      nRcdExists_1134 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1134_" + sGXsfl_55_idx ;
      nIsMod_1134 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRev_usu_Enabled = edtRev_usu_Enabled ;
      defedtRev_Ln_Enabled = edtRev_Ln_Enabled ;
   }

   public void confirmValues1110( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551134( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551134( ) ;
         httpContext.changePostValue( "Z8063Rev_Ln_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8063Rev_Ln_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8063Rev_Ln_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8092Rev_usu_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8092Rev_usu_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8092Rev_usu_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8093Rev_fec_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8093Rev_fec_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8093Rev_fec_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8095Rev_hora_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8095Rev_hora_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8095Rev_hora_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8094Rev_obsl_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8094Rev_obsl_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8094Rev_obsl_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z652OpeCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8057Rev_Cod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8057Rev_Cod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8057Rev_Cod_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thdrrev", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A8059Rev_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A8060Rev_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A8061Rev_Hdp))}, new String[] {"EmprCod","Rev_Hd","Rev_Hdr","Rev_Hdp"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8059Rev_Hd", GXutil.ltrim( localUtil.ntoc( Z8059Rev_Hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8060Rev_Hdr", GXutil.ltrim( localUtil.ntoc( Z8060Rev_Hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8061Rev_Hdp", GXutil.rtrim( Z8061Rev_Hdp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8062Rev_Ult", GXutil.ltrim( localUtil.ntoc( Z8062Rev_Ult, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8064Rev_obs", Z8064Rev_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "O8062Rev_Ult", GXutil.ltrim( localUtil.ntoc( O8062Rev_Ult, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
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
      return formatLink("app.thdrrev", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A8059Rev_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A8060Rev_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A8061Rev_Hdp))}, new String[] {"EmprCod","Rev_Hd","Rev_Hdr","Rev_Hdp"})  ;
   }

   public String getPgmname( )
   {
      return "THDRrev" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA CODIGOS REVISTA", "") ;
   }

   public void initializeNonKey1111133( )
   {
      A8062Rev_Ult = (short)(0) ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      A8064Rev_obs = "" ;
      n8064Rev_obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8064Rev_obs", A8064Rev_obs);
      O8062Rev_Ult = A8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      Z8062Rev_Ult = (short)(0) ;
      Z8064Rev_obs = "" ;
   }

   public void initAll1111133( )
   {
      initializeNonKey1111133( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1111134( )
   {
      A8057Rev_Cod = (short)(0) ;
      n8057Rev_Cod = false ;
      A8058Rev_Dsc = "" ;
      n8058Rev_Dsc = false ;
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      A653OpeNom = "" ;
      n653OpeNom = false ;
      A8095Rev_hora = "" ;
      n8095Rev_hora = false ;
      A8094Rev_obsl = "" ;
      n8094Rev_obsl = false ;
      A8092Rev_usu = AV8UsurCod ;
      n8092Rev_usu = false ;
      A8093Rev_fec = GXutil.today( ) ;
      n8093Rev_fec = false ;
      Z8092Rev_usu = "" ;
      Z8093Rev_fec = GXutil.nullDate() ;
      Z8095Rev_hora = "" ;
      Z8094Rev_obsl = "" ;
      Z652OpeCod = 0 ;
      Z8057Rev_Cod = (short)(0) ;
   }

   public void initAll1111134( )
   {
      A8063Rev_Ln = (short)(0) ;
      initializeNonKey1111134( ) ;
   }

   public void standaloneModalInsert1111134( )
   {
      A8062Rev_Ult = i8062Rev_Ult ;
      n8062Rev_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8062Rev_Ult), 4, 0));
      A8092Rev_usu = i8092Rev_usu ;
      n8092Rev_usu = false ;
      A8093Rev_fec = i8093Rev_fec ;
      n8093Rev_fec = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533833", true, true);
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
      httpContext.AddJavascriptSource("thdrrev.js", "?20268241533833", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1134( )
   {
      edtRev_usu_Enabled = defedtRev_usu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_usu_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRev_Ln_Enabled = defedtRev_Ln_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRev_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRev_Ln_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1134, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1134_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8063Rev_Ln, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Ln_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8057Rev_Cod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8058Rev_Dsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_Dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A653OpeNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8092Rev_usu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A8093Rev_fec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_fec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8095Rev_hora));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_hora_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8094Rev_obsl));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRev_obsl_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtRev_Hd_Internalname = "REV_HD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtRev_Hdr_Internalname = "REV_HDR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRev_Hdp_Internalname = "REV_HDP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRev_Ult_Internalname = "REV_ULT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRev_obs_Internalname = "REV_OBS" ;
      edtavnRcdDeleted_1134_Internalname = "vNRCDDELETED_1134" ;
      edtRev_Ln_Internalname = "REV_LN" ;
      edtRev_Cod_Internalname = "REV_COD" ;
      edtRev_Dsc_Internalname = "REV_DSC" ;
      edtOpeCod_Internalname = "OPECOD" ;
      edtOpeNom_Internalname = "OPENOM" ;
      edtRev_usu_Internalname = "REV_USU" ;
      edtRev_fec_Internalname = "REV_FEC" ;
      edtRev_hora_Internalname = "REV_HORA" ;
      edtRev_obsl_Internalname = "REV_OBSL" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADA CODIGOS REVISTA", "") );
      edtRev_obsl_Jsonclick = "" ;
      edtRev_hora_Jsonclick = "" ;
      edtRev_fec_Jsonclick = "" ;
      edtRev_usu_Jsonclick = "" ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeCod_Jsonclick = "" ;
      edtRev_Dsc_Jsonclick = "" ;
      edtRev_Cod_Jsonclick = "" ;
      edtRev_Ln_Jsonclick = "" ;
      edtavnRcdDeleted_1134_Jsonclick = "" ;
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
      edtRev_obsl_Enabled = 1 ;
      edtRev_hora_Enabled = 1 ;
      edtRev_fec_Enabled = 1 ;
      edtRev_usu_Enabled = 0 ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Enabled = 1 ;
      edtRev_Dsc_Enabled = 0 ;
      edtRev_Cod_Enabled = 1 ;
      edtRev_Ln_Enabled = 1 ;
      edtavnRcdDeleted_1134_Enabled = 1 ;
      edtRev_obs_Backcolor = (int)(0xFFFFFF) ;
      edtRev_obs_Enabled = 1 ;
      edtRev_Ult_Jsonclick = "" ;
      edtRev_Ult_Backcolor = (int)(0xFFFFFF) ;
      edtRev_Ult_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRev_Hdp_Jsonclick = "" ;
      edtRev_Hdp_Backcolor = (int)(0xFFFFFF) ;
      edtRev_Hdp_Enabled = 0 ;
      edtRev_Hdr_Jsonclick = "" ;
      edtRev_Hdr_Backcolor = (int)(0xFFFFFF) ;
      edtRev_Hdr_Enabled = 0 ;
      edtRev_Hd_Jsonclick = "" ;
      edtRev_Hd_Backcolor = (int)(0xFFFFFF) ;
      edtRev_Hd_Enabled = 0 ;
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

   public void xc_8_1111134( String Gx_mode ,
                             String A396EmprCod ,
                             String A8095Rev_hora ,
                             short A8057Rev_Cod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A8095Rev_hora ;
         new app.pverhhmm(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A8095Rev_hora = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8095Rev_hora))+"\"") ;
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
      subsflControlProps_551134( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1111134( ) ;
         standaloneModal1111134( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1111134( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551134( ) ;
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
      /* Using cursor T011128 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T011128_A407EmprNom[0] ;
      n407EmprNom = T011128_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      GX_FocusControl = edtRev_obs_Internalname ;
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

   public void valid_Rev_hdp( )
   {
      n8062Rev_Ult = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8062Rev_Ult", GXutil.ltrim( localUtil.ntoc( A8062Rev_Ult, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8064Rev_obs", A8064Rev_obs);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8059Rev_Hd", GXutil.ltrim( localUtil.ntoc( Z8059Rev_Hd, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8060Rev_Hdr", GXutil.ltrim( localUtil.ntoc( Z8060Rev_Hdr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8061Rev_Hdp", GXutil.rtrim( Z8061Rev_Hdp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8062Rev_Ult", GXutil.ltrim( localUtil.ntoc( Z8062Rev_Ult, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8064Rev_obs", Z8064Rev_obs);
      httpContext.ajax_rsp_assign_attri("", false, "O8062Rev_Ult", GXutil.ltrim( localUtil.ntoc( O8062Rev_Ult, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Rev_cod( )
   {
      n8095Rev_hora = false ;
      n8057Rev_Cod = false ;
      n8058Rev_Dsc = false ;
      /* Using cursor T011125 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n8057Rev_Cod), Short.valueOf(A8057Rev_Cod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REVCOD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "REV_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRev_Cod_Internalname ;
      }
      A8058Rev_Dsc = T011125_A8058Rev_Dsc[0] ;
      n8058Rev_Dsc = T011125_n8058Rev_Dsc[0] ;
      pr_default.close(23);
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A8095Rev_hora ;
         new app.pverhhmm(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         thdrrev_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         thdrrev_impl.this.A8095Rev_hora = GXv_char3[0] ;
         A8095Rev_hora = this.A8095Rev_hora ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8058Rev_Dsc", GXutil.rtrim( A8058Rev_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A8095Rev_hora", GXutil.rtrim( A8095Rev_hora));
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T011126 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T011126_A653OpeNom[0] ;
      n653OpeNom = T011126_n653OpeNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8059Rev_Hd',fld:'REV_HD',pic:'ZZZZZZZ9'},{av:'A8060Rev_Hdr',fld:'REV_HDR',pic:'9'},{av:'A8061Rev_Hdp',fld:'REV_HDP',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_REV_HD","{handler:'valid_Rev_hd',iparms:[]");
      setEventMetadata("VALID_REV_HD",",oparms:[]}");
      setEventMetadata("VALID_REV_HDR","{handler:'valid_Rev_hdr',iparms:[]");
      setEventMetadata("VALID_REV_HDR",",oparms:[]}");
      setEventMetadata("VALID_REV_HDP","{handler:'valid_Rev_hdp',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A8062Rev_Ult',fld:'REV_ULT',pic:'ZZZ9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8059Rev_Hd',fld:'REV_HD',pic:'ZZZZZZZ9'},{av:'A8060Rev_Hdr',fld:'REV_HDR',pic:'9'},{av:'A8061Rev_Hdp',fld:'REV_HDP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_REV_HDP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8062Rev_Ult',fld:'REV_ULT',pic:'ZZZ9'},{av:'A8064Rev_obs',fld:'REV_OBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z8059Rev_Hd'},{av:'Z8060Rev_Hdr'},{av:'Z8061Rev_Hdp'},{av:'Z407EmprNom'},{av:'Z8062Rev_Ult'},{av:'Z8064Rev_obs'},{av:'O8062Rev_Ult'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_REV_ULT","{handler:'valid_Rev_ult',iparms:[]");
      setEventMetadata("VALID_REV_ULT",",oparms:[]}");
      setEventMetadata("VALID_REV_LN","{handler:'valid_Rev_ln',iparms:[]");
      setEventMetadata("VALID_REV_LN",",oparms:[]}");
      setEventMetadata("VALID_REV_COD","{handler:'valid_Rev_cod',iparms:[{av:'A8095Rev_hora',fld:'REV_HORA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8057Rev_Cod',fld:'REV_COD',pic:'ZZZ9'},{av:'A8058Rev_Dsc',fld:'REV_DSC',pic:''}]");
      setEventMetadata("VALID_REV_COD",",oparms:[{av:'A8058Rev_Dsc',fld:'REV_DSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8095Rev_hora',fld:'REV_HORA',pic:''}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Rev_obsl',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(23);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA8061Rev_Hdp = "" ;
      Z396EmprCod = "" ;
      Z8061Rev_Hdp = "" ;
      Z8064Rev_obs = "" ;
      Z8092Rev_usu = "" ;
      Z8093Rev_fec = GXutil.nullDate() ;
      Z8095Rev_hora = "" ;
      Z8094Rev_obsl = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A8095Rev_hora = "" ;
      A8061Rev_Hdp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV8UsurCod = "" ;
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
      A8064Rev_obs = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1134 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1133 = "" ;
      GXCCtl = "" ;
      A8058Rev_Dsc = "" ;
      A653OpeNom = "" ;
      A8092Rev_usu = "" ;
      A8093Rev_fec = GXutil.nullDate() ;
      A8094Rev_obsl = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      Z407EmprNom = "" ;
      T01118_A407EmprNom = new String[] {""} ;
      T01118_n407EmprNom = new boolean[] {false} ;
      T01119_A8059Rev_Hd = new int[1] ;
      T01119_A8060Rev_Hdr = new byte[1] ;
      T01119_A8061Rev_Hdp = new String[] {""} ;
      T01119_A407EmprNom = new String[] {""} ;
      T01119_n407EmprNom = new boolean[] {false} ;
      T01119_A8062Rev_Ult = new short[1] ;
      T01119_n8062Rev_Ult = new boolean[] {false} ;
      T01119_A8064Rev_obs = new String[] {""} ;
      T01119_n8064Rev_obs = new boolean[] {false} ;
      T01119_A396EmprCod = new String[] {""} ;
      T011110_A396EmprCod = new String[] {""} ;
      T011110_A8059Rev_Hd = new int[1] ;
      T011110_A8060Rev_Hdr = new byte[1] ;
      T011110_A8061Rev_Hdp = new String[] {""} ;
      T01117_A8059Rev_Hd = new int[1] ;
      T01117_A8060Rev_Hdr = new byte[1] ;
      T01117_A8061Rev_Hdp = new String[] {""} ;
      T01117_A8062Rev_Ult = new short[1] ;
      T01117_n8062Rev_Ult = new boolean[] {false} ;
      T01117_A8064Rev_obs = new String[] {""} ;
      T01117_n8064Rev_obs = new boolean[] {false} ;
      T01117_A396EmprCod = new String[] {""} ;
      T011111_A396EmprCod = new String[] {""} ;
      T011111_A8059Rev_Hd = new int[1] ;
      T011111_A8060Rev_Hdr = new byte[1] ;
      T011111_A8061Rev_Hdp = new String[] {""} ;
      T011112_A396EmprCod = new String[] {""} ;
      T011112_A8059Rev_Hd = new int[1] ;
      T011112_A8060Rev_Hdr = new byte[1] ;
      T011112_A8061Rev_Hdp = new String[] {""} ;
      T01116_A8059Rev_Hd = new int[1] ;
      T01116_A8060Rev_Hdr = new byte[1] ;
      T01116_A8061Rev_Hdp = new String[] {""} ;
      T01116_A8062Rev_Ult = new short[1] ;
      T01116_n8062Rev_Ult = new boolean[] {false} ;
      T01116_A8064Rev_obs = new String[] {""} ;
      T01116_n8064Rev_obs = new boolean[] {false} ;
      T01116_A396EmprCod = new String[] {""} ;
      T011117_A396EmprCod = new String[] {""} ;
      T011117_A8059Rev_Hd = new int[1] ;
      T011117_A8060Rev_Hdr = new byte[1] ;
      T011117_A8061Rev_Hdp = new String[] {""} ;
      Z8058Rev_Dsc = "" ;
      Z653OpeNom = "" ;
      T011118_A8059Rev_Hd = new int[1] ;
      T011118_A8060Rev_Hdr = new byte[1] ;
      T011118_A8061Rev_Hdp = new String[] {""} ;
      T011118_A8063Rev_Ln = new short[1] ;
      T011118_A8092Rev_usu = new String[] {""} ;
      T011118_n8092Rev_usu = new boolean[] {false} ;
      T011118_A8093Rev_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T011118_n8093Rev_fec = new boolean[] {false} ;
      T011118_A8058Rev_Dsc = new String[] {""} ;
      T011118_n8058Rev_Dsc = new boolean[] {false} ;
      T011118_A653OpeNom = new String[] {""} ;
      T011118_n653OpeNom = new boolean[] {false} ;
      T011118_A8095Rev_hora = new String[] {""} ;
      T011118_n8095Rev_hora = new boolean[] {false} ;
      T011118_A8094Rev_obsl = new String[] {""} ;
      T011118_n8094Rev_obsl = new boolean[] {false} ;
      T011118_A396EmprCod = new String[] {""} ;
      T011118_A652OpeCod = new int[1] ;
      T011118_n652OpeCod = new boolean[] {false} ;
      T011118_A8057Rev_Cod = new short[1] ;
      T011118_n8057Rev_Cod = new boolean[] {false} ;
      T01114_A653OpeNom = new String[] {""} ;
      T01114_n653OpeNom = new boolean[] {false} ;
      T01115_A8058Rev_Dsc = new String[] {""} ;
      T01115_n8058Rev_Dsc = new boolean[] {false} ;
      T011119_A653OpeNom = new String[] {""} ;
      T011119_n653OpeNom = new boolean[] {false} ;
      T011120_A8058Rev_Dsc = new String[] {""} ;
      T011120_n8058Rev_Dsc = new boolean[] {false} ;
      T011121_A396EmprCod = new String[] {""} ;
      T011121_A8059Rev_Hd = new int[1] ;
      T011121_A8060Rev_Hdr = new byte[1] ;
      T011121_A8061Rev_Hdp = new String[] {""} ;
      T011121_A8063Rev_Ln = new short[1] ;
      T01113_A8059Rev_Hd = new int[1] ;
      T01113_A8060Rev_Hdr = new byte[1] ;
      T01113_A8061Rev_Hdp = new String[] {""} ;
      T01113_A8063Rev_Ln = new short[1] ;
      T01113_A8092Rev_usu = new String[] {""} ;
      T01113_n8092Rev_usu = new boolean[] {false} ;
      T01113_A8093Rev_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01113_n8093Rev_fec = new boolean[] {false} ;
      T01113_A8095Rev_hora = new String[] {""} ;
      T01113_n8095Rev_hora = new boolean[] {false} ;
      T01113_A8094Rev_obsl = new String[] {""} ;
      T01113_n8094Rev_obsl = new boolean[] {false} ;
      T01113_A396EmprCod = new String[] {""} ;
      T01113_A652OpeCod = new int[1] ;
      T01113_n652OpeCod = new boolean[] {false} ;
      T01113_A8057Rev_Cod = new short[1] ;
      T01113_n8057Rev_Cod = new boolean[] {false} ;
      T01112_A8059Rev_Hd = new int[1] ;
      T01112_A8060Rev_Hdr = new byte[1] ;
      T01112_A8061Rev_Hdp = new String[] {""} ;
      T01112_A8063Rev_Ln = new short[1] ;
      T01112_A8092Rev_usu = new String[] {""} ;
      T01112_n8092Rev_usu = new boolean[] {false} ;
      T01112_A8093Rev_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01112_n8093Rev_fec = new boolean[] {false} ;
      T01112_A8095Rev_hora = new String[] {""} ;
      T01112_n8095Rev_hora = new boolean[] {false} ;
      T01112_A8094Rev_obsl = new String[] {""} ;
      T01112_n8094Rev_obsl = new boolean[] {false} ;
      T01112_A396EmprCod = new String[] {""} ;
      T01112_A652OpeCod = new int[1] ;
      T01112_n652OpeCod = new boolean[] {false} ;
      T01112_A8057Rev_Cod = new short[1] ;
      T01112_n8057Rev_Cod = new boolean[] {false} ;
      T011125_A8058Rev_Dsc = new String[] {""} ;
      T011125_n8058Rev_Dsc = new boolean[] {false} ;
      T011126_A653OpeNom = new String[] {""} ;
      T011126_n653OpeNom = new boolean[] {false} ;
      T011127_A396EmprCod = new String[] {""} ;
      T011127_A8059Rev_Hd = new int[1] ;
      T011127_A8060Rev_Hdr = new byte[1] ;
      T011127_A8061Rev_Hdp = new String[] {""} ;
      T011127_A8063Rev_Ln = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8092Rev_usu = "" ;
      i8093Rev_fec = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T011128_A407EmprNom = new String[] {""} ;
      T011128_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ8061Rev_Hdp = "" ;
      ZZ407EmprNom = "" ;
      ZZ8064Rev_obs = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdrrev__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdrrev__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdrrev__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdrrev__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdrrev__default(),
         new Object[] {
             new Object[] {
            T01112_A8059Rev_Hd, T01112_A8060Rev_Hdr, T01112_A8061Rev_Hdp, T01112_A8063Rev_Ln, T01112_A8092Rev_usu, T01112_n8092Rev_usu, T01112_A8093Rev_fec, T01112_n8093Rev_fec, T01112_A8095Rev_hora, T01112_n8095Rev_hora,
            T01112_A8094Rev_obsl, T01112_n8094Rev_obsl, T01112_A396EmprCod, T01112_A652OpeCod, T01112_n652OpeCod, T01112_A8057Rev_Cod, T01112_n8057Rev_Cod
            }
            , new Object[] {
            T01113_A8059Rev_Hd, T01113_A8060Rev_Hdr, T01113_A8061Rev_Hdp, T01113_A8063Rev_Ln, T01113_A8092Rev_usu, T01113_n8092Rev_usu, T01113_A8093Rev_fec, T01113_n8093Rev_fec, T01113_A8095Rev_hora, T01113_n8095Rev_hora,
            T01113_A8094Rev_obsl, T01113_n8094Rev_obsl, T01113_A396EmprCod, T01113_A652OpeCod, T01113_n652OpeCod, T01113_A8057Rev_Cod, T01113_n8057Rev_Cod
            }
            , new Object[] {
            T01114_A653OpeNom, T01114_n653OpeNom
            }
            , new Object[] {
            T01115_A8058Rev_Dsc, T01115_n8058Rev_Dsc
            }
            , new Object[] {
            T01116_A8059Rev_Hd, T01116_A8060Rev_Hdr, T01116_A8061Rev_Hdp, T01116_A8062Rev_Ult, T01116_n8062Rev_Ult, T01116_A8064Rev_obs, T01116_n8064Rev_obs, T01116_A396EmprCod
            }
            , new Object[] {
            T01117_A8059Rev_Hd, T01117_A8060Rev_Hdr, T01117_A8061Rev_Hdp, T01117_A8062Rev_Ult, T01117_n8062Rev_Ult, T01117_A8064Rev_obs, T01117_n8064Rev_obs, T01117_A396EmprCod
            }
            , new Object[] {
            T01118_A407EmprNom, T01118_n407EmprNom
            }
            , new Object[] {
            T01119_A8059Rev_Hd, T01119_A8060Rev_Hdr, T01119_A8061Rev_Hdp, T01119_A407EmprNom, T01119_n407EmprNom, T01119_A8062Rev_Ult, T01119_n8062Rev_Ult, T01119_A8064Rev_obs, T01119_n8064Rev_obs, T01119_A396EmprCod
            }
            , new Object[] {
            T011110_A396EmprCod, T011110_A8059Rev_Hd, T011110_A8060Rev_Hdr, T011110_A8061Rev_Hdp
            }
            , new Object[] {
            T011111_A396EmprCod, T011111_A8059Rev_Hd, T011111_A8060Rev_Hdr, T011111_A8061Rev_Hdp
            }
            , new Object[] {
            T011112_A396EmprCod, T011112_A8059Rev_Hd, T011112_A8060Rev_Hdr, T011112_A8061Rev_Hdp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011117_A396EmprCod, T011117_A8059Rev_Hd, T011117_A8060Rev_Hdr, T011117_A8061Rev_Hdp
            }
            , new Object[] {
            T011118_A8059Rev_Hd, T011118_A8060Rev_Hdr, T011118_A8061Rev_Hdp, T011118_A8063Rev_Ln, T011118_A8092Rev_usu, T011118_n8092Rev_usu, T011118_A8093Rev_fec, T011118_n8093Rev_fec, T011118_A8058Rev_Dsc, T011118_n8058Rev_Dsc,
            T011118_A653OpeNom, T011118_n653OpeNom, T011118_A8095Rev_hora, T011118_n8095Rev_hora, T011118_A8094Rev_obsl, T011118_n8094Rev_obsl, T011118_A396EmprCod, T011118_A652OpeCod, T011118_n652OpeCod, T011118_A8057Rev_Cod,
            T011118_n8057Rev_Cod
            }
            , new Object[] {
            T011119_A653OpeNom, T011119_n653OpeNom
            }
            , new Object[] {
            T011120_A8058Rev_Dsc, T011120_n8058Rev_Dsc
            }
            , new Object[] {
            T011121_A396EmprCod, T011121_A8059Rev_Hd, T011121_A8060Rev_Hdr, T011121_A8061Rev_Hdp, T011121_A8063Rev_Ln
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011125_A8058Rev_Dsc, T011125_n8058Rev_Dsc
            }
            , new Object[] {
            T011126_A653OpeNom, T011126_n653OpeNom
            }
            , new Object[] {
            T011127_A396EmprCod, T011127_A8059Rev_Hd, T011127_A8060Rev_Hdr, T011127_A8061Rev_Hdp, T011127_A8063Rev_Ln
            }
            , new Object[] {
            T011128_A407EmprNom, T011128_n407EmprNom
            }
         }
      );
      Z8061Rev_Hdp = "" ;
      A8061Rev_Hdp = "" ;
      Z8060Rev_Hdr = (byte)(0) ;
      A8060Rev_Hdr = (byte)(0) ;
      Z8059Rev_Hd = 0 ;
      A8059Rev_Hd = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "THDRrev" ;
      Z8093Rev_fec = GXutil.today( ) ;
      n8093Rev_fec = false ;
      A8093Rev_fec = GXutil.today( ) ;
      n8093Rev_fec = false ;
      i8093Rev_fec = GXutil.today( ) ;
      n8093Rev_fec = false ;
      Z8092Rev_usu = "" ;
      n8092Rev_usu = false ;
      A8092Rev_usu = "" ;
      n8092Rev_usu = false ;
      i8092Rev_usu = "" ;
      n8092Rev_usu = false ;
   }

   private byte wcpOA8060Rev_Hdr ;
   private byte Z8060Rev_Hdr ;
   private byte GxWebError ;
   private byte A8060Rev_Hdr ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ8060Rev_Hdr ;
   private short Z8062Rev_Ult ;
   private short O8062Rev_Ult ;
   private short Z8063Rev_Ln ;
   private short Z8057Rev_Cod ;
   private short nRcdDeleted_1134 ;
   private short nRcdExists_1134 ;
   private short nIsMod_1134 ;
   private short A8057Rev_Cod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8062Rev_Ult ;
   private short nBlankRcdCount1134 ;
   private short RcdFound1134 ;
   private short B8062Rev_Ult ;
   private short nBlankRcdUsr1134 ;
   private short s8062Rev_Ult ;
   private short A8063Rev_Ln ;
   private short RcdFound1133 ;
   private short nIsDirty_1133 ;
   private short nIsDirty_1134 ;
   private short i8062Rev_Ult ;
   private short ZZ8062Rev_Ult ;
   private short ZO8062Rev_Ult ;
   private int wcpOA8059Rev_Hd ;
   private int Z8059Rev_Hd ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z652OpeCod ;
   private int A652OpeCod ;
   private int A8059Rev_Hd ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtRev_Hd_Enabled ;
   private int edtRev_Hdr_Enabled ;
   private int edtRev_Hdp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtRev_Ult_Enabled ;
   private int edtRev_obs_Enabled ;
   private int edtavnRcdDeleted_1134_Enabled ;
   private int edtRev_Ln_Enabled ;
   private int edtRev_Cod_Enabled ;
   private int edtRev_Dsc_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtRev_usu_Enabled ;
   private int edtRev_fec_Enabled ;
   private int edtRev_hora_Enabled ;
   private int edtRev_obsl_Enabled ;
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
   private int defedtRev_usu_Enabled ;
   private int defedtRev_Ln_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtRev_obs_Backcolor ;
   private int edtRev_Ult_Backcolor ;
   private int edtRev_Hdp_Backcolor ;
   private int edtRev_Hdr_Backcolor ;
   private int edtRev_Hd_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ8059Rev_Hd ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA8061Rev_Hdp ;
   private String Z396EmprCod ;
   private String Z8061Rev_Hdp ;
   private String Z8092Rev_usu ;
   private String Z8095Rev_hora ;
   private String Z8094Rev_obsl ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A8095Rev_hora ;
   private String A8061Rev_Hdp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRev_obs_Internalname ;
   private String sGXsfl_55_idx="0001" ;
   private String AV8UsurCod ;
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
   private String edtRev_Hd_Internalname ;
   private String edtRev_Hd_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtRev_Hdr_Internalname ;
   private String edtRev_Hdr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRev_Hdp_Internalname ;
   private String edtRev_Hdp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRev_Ult_Internalname ;
   private String edtRev_Ult_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String sMode1134 ;
   private String edtavnRcdDeleted_1134_Internalname ;
   private String edtRev_Ln_Internalname ;
   private String edtRev_Cod_Internalname ;
   private String edtRev_Dsc_Internalname ;
   private String edtOpeCod_Internalname ;
   private String edtOpeNom_Internalname ;
   private String edtRev_usu_Internalname ;
   private String edtRev_fec_Internalname ;
   private String edtRev_hora_Internalname ;
   private String edtRev_obsl_Internalname ;
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
   private String AV37Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1133 ;
   private String GXCCtl ;
   private String A8058Rev_Dsc ;
   private String A653OpeNom ;
   private String A8092Rev_usu ;
   private String A8094Rev_obsl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String Z8058Rev_Dsc ;
   private String Z653OpeNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1134_Jsonclick ;
   private String edtRev_Ln_Jsonclick ;
   private String edtRev_Cod_Jsonclick ;
   private String edtRev_Dsc_Jsonclick ;
   private String edtOpeCod_Jsonclick ;
   private String edtOpeNom_Jsonclick ;
   private String edtRev_usu_Jsonclick ;
   private String edtRev_fec_Jsonclick ;
   private String edtRev_hora_Jsonclick ;
   private String edtRev_obsl_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i8092Rev_usu ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ8061Rev_Hdp ;
   private String ZZ407EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z8093Rev_fec ;
   private java.util.Date A8093Rev_fec ;
   private java.util.Date i8093Rev_fec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8095Rev_hora ;
   private boolean n8057Rev_Cod ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean n8062Rev_Ult ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8064Rev_obs ;
   private boolean returnInSub ;
   private boolean n8092Rev_usu ;
   private boolean n8093Rev_fec ;
   private boolean n8058Rev_Dsc ;
   private boolean n653OpeNom ;
   private boolean n8094Rev_obsl ;
   private boolean Gx_longc ;
   private String Z8064Rev_obs ;
   private String A8064Rev_obs ;
   private String ZZ8064Rev_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01118_A407EmprNom ;
   private boolean[] T01118_n407EmprNom ;
   private int[] T01119_A8059Rev_Hd ;
   private byte[] T01119_A8060Rev_Hdr ;
   private String[] T01119_A8061Rev_Hdp ;
   private String[] T01119_A407EmprNom ;
   private boolean[] T01119_n407EmprNom ;
   private short[] T01119_A8062Rev_Ult ;
   private boolean[] T01119_n8062Rev_Ult ;
   private String[] T01119_A8064Rev_obs ;
   private boolean[] T01119_n8064Rev_obs ;
   private String[] T01119_A396EmprCod ;
   private String[] T011110_A396EmprCod ;
   private int[] T011110_A8059Rev_Hd ;
   private byte[] T011110_A8060Rev_Hdr ;
   private String[] T011110_A8061Rev_Hdp ;
   private int[] T01117_A8059Rev_Hd ;
   private byte[] T01117_A8060Rev_Hdr ;
   private String[] T01117_A8061Rev_Hdp ;
   private short[] T01117_A8062Rev_Ult ;
   private boolean[] T01117_n8062Rev_Ult ;
   private String[] T01117_A8064Rev_obs ;
   private boolean[] T01117_n8064Rev_obs ;
   private String[] T01117_A396EmprCod ;
   private String[] T011111_A396EmprCod ;
   private int[] T011111_A8059Rev_Hd ;
   private byte[] T011111_A8060Rev_Hdr ;
   private String[] T011111_A8061Rev_Hdp ;
   private String[] T011112_A396EmprCod ;
   private int[] T011112_A8059Rev_Hd ;
   private byte[] T011112_A8060Rev_Hdr ;
   private String[] T011112_A8061Rev_Hdp ;
   private int[] T01116_A8059Rev_Hd ;
   private byte[] T01116_A8060Rev_Hdr ;
   private String[] T01116_A8061Rev_Hdp ;
   private short[] T01116_A8062Rev_Ult ;
   private boolean[] T01116_n8062Rev_Ult ;
   private String[] T01116_A8064Rev_obs ;
   private boolean[] T01116_n8064Rev_obs ;
   private String[] T01116_A396EmprCod ;
   private String[] T011117_A396EmprCod ;
   private int[] T011117_A8059Rev_Hd ;
   private byte[] T011117_A8060Rev_Hdr ;
   private String[] T011117_A8061Rev_Hdp ;
   private int[] T011118_A8059Rev_Hd ;
   private byte[] T011118_A8060Rev_Hdr ;
   private String[] T011118_A8061Rev_Hdp ;
   private short[] T011118_A8063Rev_Ln ;
   private String[] T011118_A8092Rev_usu ;
   private boolean[] T011118_n8092Rev_usu ;
   private java.util.Date[] T011118_A8093Rev_fec ;
   private boolean[] T011118_n8093Rev_fec ;
   private String[] T011118_A8058Rev_Dsc ;
   private boolean[] T011118_n8058Rev_Dsc ;
   private String[] T011118_A653OpeNom ;
   private boolean[] T011118_n653OpeNom ;
   private String[] T011118_A8095Rev_hora ;
   private boolean[] T011118_n8095Rev_hora ;
   private String[] T011118_A8094Rev_obsl ;
   private boolean[] T011118_n8094Rev_obsl ;
   private String[] T011118_A396EmprCod ;
   private int[] T011118_A652OpeCod ;
   private boolean[] T011118_n652OpeCod ;
   private short[] T011118_A8057Rev_Cod ;
   private boolean[] T011118_n8057Rev_Cod ;
   private String[] T01114_A653OpeNom ;
   private boolean[] T01114_n653OpeNom ;
   private String[] T01115_A8058Rev_Dsc ;
   private boolean[] T01115_n8058Rev_Dsc ;
   private String[] T011119_A653OpeNom ;
   private boolean[] T011119_n653OpeNom ;
   private String[] T011120_A8058Rev_Dsc ;
   private boolean[] T011120_n8058Rev_Dsc ;
   private String[] T011121_A396EmprCod ;
   private int[] T011121_A8059Rev_Hd ;
   private byte[] T011121_A8060Rev_Hdr ;
   private String[] T011121_A8061Rev_Hdp ;
   private short[] T011121_A8063Rev_Ln ;
   private int[] T01113_A8059Rev_Hd ;
   private byte[] T01113_A8060Rev_Hdr ;
   private String[] T01113_A8061Rev_Hdp ;
   private short[] T01113_A8063Rev_Ln ;
   private String[] T01113_A8092Rev_usu ;
   private boolean[] T01113_n8092Rev_usu ;
   private java.util.Date[] T01113_A8093Rev_fec ;
   private boolean[] T01113_n8093Rev_fec ;
   private String[] T01113_A8095Rev_hora ;
   private boolean[] T01113_n8095Rev_hora ;
   private String[] T01113_A8094Rev_obsl ;
   private boolean[] T01113_n8094Rev_obsl ;
   private String[] T01113_A396EmprCod ;
   private int[] T01113_A652OpeCod ;
   private boolean[] T01113_n652OpeCod ;
   private short[] T01113_A8057Rev_Cod ;
   private boolean[] T01113_n8057Rev_Cod ;
   private int[] T01112_A8059Rev_Hd ;
   private byte[] T01112_A8060Rev_Hdr ;
   private String[] T01112_A8061Rev_Hdp ;
   private short[] T01112_A8063Rev_Ln ;
   private String[] T01112_A8092Rev_usu ;
   private boolean[] T01112_n8092Rev_usu ;
   private java.util.Date[] T01112_A8093Rev_fec ;
   private boolean[] T01112_n8093Rev_fec ;
   private String[] T01112_A8095Rev_hora ;
   private boolean[] T01112_n8095Rev_hora ;
   private String[] T01112_A8094Rev_obsl ;
   private boolean[] T01112_n8094Rev_obsl ;
   private String[] T01112_A396EmprCod ;
   private int[] T01112_A652OpeCod ;
   private boolean[] T01112_n652OpeCod ;
   private short[] T01112_A8057Rev_Cod ;
   private boolean[] T01112_n8057Rev_Cod ;
   private String[] T011125_A8058Rev_Dsc ;
   private boolean[] T011125_n8058Rev_Dsc ;
   private String[] T011126_A653OpeNom ;
   private boolean[] T011126_n653OpeNom ;
   private String[] T011127_A396EmprCod ;
   private int[] T011127_A8059Rev_Hd ;
   private byte[] T011127_A8060Rev_Hdr ;
   private String[] T011127_A8061Rev_Hdp ;
   private short[] T011127_A8063Rev_Ln ;
   private String[] T011128_A407EmprNom ;
   private boolean[] T011128_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thdrrev__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrrev__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrrev__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrrev__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrrev__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01112", "SELECT Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln, Rev_usu, Rev_fec, Rev_hora, Rev_obsl, EmprCod, OpeCod, Rev_Cod FROM TXPHDRTA1 WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? AND Rev_Ln = ?  FOR UPDATE OF Rev_usu, Rev_fec, Rev_hora, Rev_obsl, OpeCod, Rev_Cod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01113", "SELECT Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln, Rev_usu, Rev_fec, Rev_hora, Rev_obsl, EmprCod, OpeCod, Rev_Cod FROM TXPHDRTA1 WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? AND Rev_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01114", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01115", "SELECT Rev_Dsc FROM TXPREVCOD WHERE EmprCod = ? AND Rev_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01116", "SELECT Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ult, Rev_obs, EmprCod FROM TXPHDRrev WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ?  FOR UPDATE OF Rev_Ult, Rev_obs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01117", "SELECT Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ult, Rev_obs, EmprCod FROM TXPHDRrev WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01118", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01119", "SELECT /*+ FIRST_ROWS(1) */ TM1.Rev_Hd, TM1.Rev_Hdr, TM1.Rev_Hdp, T2.EmprNom, TM1.Rev_Ult, TM1.Rev_obs, TM1.EmprCod FROM (TXPHDRrev TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Rev_Hd = ? and TM1.Rev_Hdr = ? and TM1.Rev_Hdp = ? ORDER BY TM1.EmprCod, TM1.Rev_Hd, TM1.Rev_Hdr, TM1.Rev_Hdp ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011110", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp FROM TXPHDRrev WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011111", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp FROM TXPHDRrev WHERE EmprCod = ? and Rev_Hd = ? and Rev_Hdr = ? and Rev_Hdp = ? ORDER BY EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011112", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp FROM TXPHDRrev WHERE EmprCod = ? and Rev_Hd = ? and Rev_Hdr = ? and Rev_Hdp = ? ORDER BY EmprCod DESC, Rev_Hd DESC, Rev_Hdr DESC, Rev_Hdp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011113", "INSERT INTO TXPHDRrev(Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ult, Rev_obs, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRrev")
         ,new UpdateCursor("T011114", "UPDATE TXPHDRrev SET Rev_Ult=?, Rev_obs=?  WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ?", GX_NOMASK, "TXPHDRrev")
         ,new UpdateCursor("T011115", "DELETE FROM TXPHDRrev  WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ?", GX_NOMASK, "TXPHDRrev")
         ,new UpdateCursor("T011116", "UPDATE TXPHDRrev SET Rev_Ult=?  WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ?", GX_NOMASK, "TXPHDRrev")
         ,new ForEachCursor("T011117", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp FROM TXPHDRrev WHERE EmprCod = ? and Rev_Hd = ? and Rev_Hdr = ? and Rev_Hdp = ? ORDER BY EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011118", "SELECT T1.Rev_Hd, T1.Rev_Hdr, T1.Rev_Hdp, T1.Rev_Ln, T1.Rev_usu, T1.Rev_fec, T2.Rev_Dsc, T3.OpeNom, T1.Rev_hora, T1.Rev_obsl, T1.EmprCod, T1.OpeCod, T1.Rev_Cod FROM ((TXPHDRTA1 T1 LEFT JOIN TXPREVCOD T2 ON T2.EmprCod = T1.EmprCod AND T2.Rev_Cod = T1.Rev_Cod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = T1.EmprCod AND T3.OpeCod = T1.OpeCod) WHERE T1.EmprCod = ? and T1.Rev_Hd = ? and T1.Rev_Hdr = ? and T1.Rev_Hdp = ? and T1.Rev_Ln = ? ORDER BY T1.EmprCod, T1.Rev_Hd, T1.Rev_Hdr, T1.Rev_Hdp, T1.Rev_Ln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011119", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011120", "SELECT Rev_Dsc FROM TXPREVCOD WHERE EmprCod = ? AND Rev_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011121", "SELECT EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln FROM TXPHDRTA1 WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? AND Rev_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011122", "INSERT INTO TXPHDRTA1(Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln, Rev_usu, Rev_fec, Rev_hora, Rev_obsl, EmprCod, OpeCod, Rev_Cod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRTA1")
         ,new UpdateCursor("T011123", "UPDATE TXPHDRTA1 SET Rev_usu=?, Rev_fec=?, Rev_hora=?, Rev_obsl=?, OpeCod=?, Rev_Cod=?  WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? AND Rev_Ln = ?", GX_NOMASK, "TXPHDRTA1")
         ,new UpdateCursor("T011124", "DELETE FROM TXPHDRTA1  WHERE EmprCod = ? AND Rev_Hd = ? AND Rev_Hdr = ? AND Rev_Hdp = ? AND Rev_Ln = ?", GX_NOMASK, "TXPHDRTA1")
         ,new ForEachCursor("T011125", "SELECT Rev_Dsc FROM TXPREVCOD WHERE EmprCod = ? AND Rev_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011126", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011127", "SELECT EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln FROM TXPHDRTA1 WHERE EmprCod = ? and Rev_Hd = ? and Rev_Hdr = ? and Rev_Hdp = ? ORDER BY EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011128", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
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
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 400);
               }
               stmt.setString(6, (String)parms[7], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 400);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 100);
               }
               stmt.setString(9, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setByte(9, ((Number) parms[14]).byteValue());
               stmt.setString(10, (String)parms[15], 1);
               stmt.setShort(11, ((Number) parms[16]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

