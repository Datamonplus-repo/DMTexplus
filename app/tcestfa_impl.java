package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcestfa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_1FY1570( ) ;
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
         xc_5_1FY1570( ) ;
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
         xc_6_1FY1570( ) ;
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
         xc_7_1FY1570( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
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
         gxload_10( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A252CliCod, A65ArtCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANT FORMULAS TRAVER", ""), (short)(0)) ;
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
      nRC_GXsfl_110 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_110"))) ;
      nGXsfl_110_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_110_idx"))) ;
      sGXsfl_110_idx = httpContext.GetPar( "sGXsfl_110_idx") ;
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

   public tcestfa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcestfa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcestfa_impl.class ));
   }

   public tcestfa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCESTFA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNomCol_Internalname, GXutil.rtrim( A4061EstNomCol), GXutil.rtrim( localUtil.format( A4061EstNomCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNomCol_Jsonclick, 0, "", "", "", "", "", 1, edtEstNomCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Acabado del color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstAcab_Internalname, GXutil.rtrim( A4062EstAcab), GXutil.rtrim( localUtil.format( A4062EstAcab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstAcab_Jsonclick, 0, "", "", "", "", "", 1, edtEstAcab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cuba", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCuba_Internalname, GXutil.ltrim( localUtil.ntoc( A4063EstCuba, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCuba_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4063EstCuba), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4063EstCuba), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCuba_Jsonclick, 0, "", "", "", "", "", 1, edtEstCuba_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Separación", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSepara_Internalname, GXutil.ltrim( localUtil.ntoc( A4064EstSepara, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSepara_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4064EstSepara), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4064EstSepara), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSepara_Jsonclick, 0, "", "", "", "", "", 1, edtEstSepara_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEstFechaE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstFechaE_Internalname, localUtil.format(A4065EstFechaE, "99/99/99"), localUtil.format( A4065EstFechaE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstFechaE_Jsonclick, 0, "", "", "", "", "", 1, edtEstFechaE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEstFechaE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEstFechaE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCESTFA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Ultima Utilización", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEstFechaU_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstFechaU_Internalname, localUtil.format(A4066EstFechaU, "99/99/99"), localUtil.format( A4066EstFechaU, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstFechaU_Jsonclick, 0, "", "", "", "", "", 1, edtEstFechaU_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEstFechaU_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEstFechaU_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCESTFA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Barcada", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4067EstBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4067EstBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4067EstBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtEstBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Reoperado barcada", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstBarREo_Internalname, GXutil.ltrim( localUtil.ntoc( A4068EstBarREo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstBarREo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4068EstBarREo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4068EstBarREo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstBarREo_Jsonclick, 0, "", "", "", "", "", 1, edtEstBarREo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "BarCodPar", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstBarPar_Internalname, GXutil.rtrim( A4069EstBarPar), GXutil.rtrim( localUtil.format( A4069EstBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtEstBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero de formula Interno", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNumFor_Internalname, GXutil.ltrim( localUtil.ntoc( A4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstNumFor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNumFor_Jsonclick, 0, "", "", "", "", "", 1, edtEstNumFor_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Precio Facturación", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstPreKg_Internalname, GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstPreKg_Enabled!=0) ? localUtil.format( A4070EstPreKg, "ZZZZZ9.99") : localUtil.format( A4070EstPreKg, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstPreKg_Jsonclick, 0, "", "", "", "", "", 1, edtEstPreKg_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Definitivo (S/N)", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstPreDef_Internalname, GXutil.rtrim( A4071EstPreDef), GXutil.rtrim( localUtil.format( A4071EstPreDef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstPreDef_Jsonclick, 0, "", "", "", "", "", 1, edtEstPreDef_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Ultima linea observaciones", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstObsUlt2_Internalname, GXutil.ltrim( localUtil.ntoc( A4072EstObsUlt2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstObsUlt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4072EstObsUlt2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4072EstObsUlt2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstObsUlt2_Jsonclick, 0, "", "", "", "", "", 1, edtEstObsUlt2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol110( ) ;
      nGXsfl_110_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1592 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1592 = (short)(1) ;
            scanStart1FY1592( ) ;
            while ( RcdFound1592 != 0 )
            {
               init_level_properties1592( ) ;
               getByPrimaryKey1FY1592( ) ;
               addRow1FY1592( ) ;
               scanNext1FY1592( ) ;
            }
            scanEnd1FY1592( ) ;
            nBlankRcdCount1592 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FY1592( ) ;
         standaloneModal1FY1592( ) ;
         sMode1592 = Gx_mode ;
         while ( nGXsfl_110_idx < nRC_GXsfl_110 )
         {
            bGXsfl_110_Refreshing = true ;
            readRow1FY1592( ) ;
            edtavnRcdDeleted_1592_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1592_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1592_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1592_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtEstObsLin2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBSLIN2_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtEstobs2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBS2_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            if ( ( nRcdExists_1592 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FY1592( ) ;
            }
            sendRow1FY1592( ) ;
            bGXsfl_110_Refreshing = false ;
         }
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1592 = (short)(5) ;
         nRcdExists_1592 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FY1592( ) ;
            while ( RcdFound1592 != 0 )
            {
               sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1101592( ) ;
               init_level_properties1592( ) ;
               standaloneNotModal1FY1592( ) ;
               getByPrimaryKey1FY1592( ) ;
               standaloneModal1FY1592( ) ;
               addRow1FY1592( ) ;
               scanNext1FY1592( ) ;
            }
            scanEnd1FY1592( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1592 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101592( ) ;
      initAll1FY1592( ) ;
      init_level_properties1592( ) ;
      nRcdExists_1592 = (short)(0) ;
      nIsMod_1592 = (short)(0) ;
      nRcdDeleted_1592 = (short)(0) ;
      nBlankRcdCount1592 = (short)(nBlankRcdUsr1592+nBlankRcdCount1592) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1592 > 0 )
      {
         standaloneNotModal1FY1592( ) ;
         standaloneModal1FY1592( ) ;
         addRow1FY1592( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstObsLin2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1592 = (short)(nBlankRcdCount1592-1) ;
      }
      Gx_mode = sMode1592 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCESTFA.htm");
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
      e111FY2 ();
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
            Z4072EstObsUlt2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4072EstObsUlt2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_110 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_110"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32contador = (int)(localUtil.ctol( httpContext.cgiGet( "vCONTADOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( localUtil.vcdate( httpContext.cgiGet( edtEstFechaU_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ESTFECHAU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstFechaU_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4066EstFechaU = GXutil.nullDate() ;
               n4066EstFechaU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
            }
            else
            {
               A4066EstFechaU = localUtil.ctod( httpContext.cgiGet( edtEstFechaU_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4066EstFechaU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
            }
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstObsUlt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstObsUlt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTOBSULT2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstObsUlt2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4072EstObsUlt2 = (byte)(0) ;
               n4072EstObsUlt2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
            }
            else
            {
               A4072EstObsUlt2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsUlt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4072EstObsUlt2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111FY2 ();
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
            initAll1FY1570( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1592_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1592_Enabled), 5, 0), !bGXsfl_110_Refreshing);
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
      disableAttributes1FY1570( ) ;
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

   public void confirm_1FY0( )
   {
      beforeValidate1FY1570( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FY1570( ) ;
         }
         else
         {
            checkExtendedTable1FY1570( ) ;
            if ( AnyError == 0 )
            {
               zm1FY1570( 9) ;
               zm1FY1570( 10) ;
               zm1FY1570( 11) ;
            }
            closeExtendedTableCursors1FY1570( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1570 = Gx_mode ;
         confirm_1FY1592( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1570 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FY0( ) ;
      }
   }

   public void confirm_1FY1592( )
   {
      nGXsfl_110_idx = 0 ;
      while ( nGXsfl_110_idx < nRC_GXsfl_110 )
      {
         readRow1FY1592( ) ;
         if ( ( nRcdExists_1592 != 0 ) || ( nIsMod_1592 != 0 ) )
         {
            getKey1FY1592( ) ;
            if ( ( nRcdExists_1592 == 0 ) && ( nRcdDeleted_1592 == 0 ) )
            {
               if ( RcdFound1592 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FY1592( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FY1592( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FY1592( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ESTOBSLIN2_" + sGXsfl_110_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstObsLin2_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1592 != 0 )
               {
                  if ( nRcdDeleted_1592 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FY1592( ) ;
                     load1FY1592( ) ;
                     beforeValidate1FY1592( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FY1592( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1592 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FY1592( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FY1592( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FY1592( ) ;
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
                  if ( nRcdDeleted_1592 == 0 )
                  {
                     GXCCtl = "ESTOBSLIN2_" + sGXsfl_110_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstObsLin2_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1592_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstObsLin2_Internalname, GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstobs2_Internalname, GXutil.rtrim( A4074Estobs2)) ;
         httpContext.changePostValue( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4074Estobs2_"+sGXsfl_110_idx, GXutil.rtrim( Z4074Estobs2)) ;
         httpContext.changePostValue( "nRcdDeleted_1592_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1592_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1592_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1592 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1592_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBSLIN2_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBS2_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FY0( )
   {
   }

   public void e111FY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcestfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tcestfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV29station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29station", AV29station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV30emprnom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29station, GXv_char2, GXv_char3, GXv_char4) ;
      tcestfa_impl.this.A396EmprCod = GXv_char2[0] ;
      tcestfa_impl.this.AV30emprnom = GXv_char3[0] ;
      tcestfa_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30emprnom", AV30emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_int5[0] = AV32contador ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "estnum", ""), GXv_int5) ;
      tcestfa_impl.this.AV32contador = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32contador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32contador), 8, 0));
   }

   public void zm1FY1570( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4052EstNumFor = T01FY5_A4052EstNumFor[0] ;
            Z4062EstAcab = T01FY5_A4062EstAcab[0] ;
            Z4063EstCuba = T01FY5_A4063EstCuba[0] ;
            Z4064EstSepara = T01FY5_A4064EstSepara[0] ;
            Z4065EstFechaE = T01FY5_A4065EstFechaE[0] ;
            Z4066EstFechaU = T01FY5_A4066EstFechaU[0] ;
            Z4067EstBarCod = T01FY5_A4067EstBarCod[0] ;
            Z4068EstBarREo = T01FY5_A4068EstBarREo[0] ;
            Z4069EstBarPar = T01FY5_A4069EstBarPar[0] ;
            Z4070EstPreKg = T01FY5_A4070EstPreKg[0] ;
            Z4071EstPreDef = T01FY5_A4071EstPreDef[0] ;
            Z4072EstObsUlt2 = T01FY5_A4072EstObsUlt2[0] ;
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
            Z4072EstObsUlt2 = A4072EstObsUlt2 ;
         }
      }
      if ( GX_JID == -8 )
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
         Z4072EstObsUlt2 = A4072EstObsUlt2 ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      /* Using cursor T01FY6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FY6_A407EmprNom[0] ;
      n407EmprNom = T01FY6_n407EmprNom[0] ;
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
      A4052EstNumFor = AV32contador ;
      n4052EstNumFor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4065EstFechaE)) && ( Gx_BScreen == 0 ) )
      {
         A4065EstFechaE = Gx_date ;
         n4065EstFechaE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
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

   public void load1FY1570( )
   {
      /* Using cursor T01FY9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A4052EstNumFor = T01FY9_A4052EstNumFor[0] ;
         n4052EstNumFor = T01FY9_n4052EstNumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
         A4062EstAcab = T01FY9_A4062EstAcab[0] ;
         n4062EstAcab = T01FY9_n4062EstAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         A4063EstCuba = T01FY9_A4063EstCuba[0] ;
         n4063EstCuba = T01FY9_n4063EstCuba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
         A4064EstSepara = T01FY9_A4064EstSepara[0] ;
         n4064EstSepara = T01FY9_n4064EstSepara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
         A4065EstFechaE = T01FY9_A4065EstFechaE[0] ;
         n4065EstFechaE = T01FY9_n4065EstFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
         A4066EstFechaU = T01FY9_A4066EstFechaU[0] ;
         n4066EstFechaU = T01FY9_n4066EstFechaU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
         A4067EstBarCod = T01FY9_A4067EstBarCod[0] ;
         n4067EstBarCod = T01FY9_n4067EstBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
         A4068EstBarREo = T01FY9_A4068EstBarREo[0] ;
         n4068EstBarREo = T01FY9_n4068EstBarREo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
         A4069EstBarPar = T01FY9_A4069EstBarPar[0] ;
         n4069EstBarPar = T01FY9_n4069EstBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", A4069EstBarPar);
         A4070EstPreKg = T01FY9_A4070EstPreKg[0] ;
         n4070EstPreKg = T01FY9_n4070EstPreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
         A4071EstPreDef = T01FY9_A4071EstPreDef[0] ;
         n4071EstPreDef = T01FY9_n4071EstPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", A4071EstPreDef);
         A407EmprNom = T01FY9_A407EmprNom[0] ;
         n407EmprNom = T01FY9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4072EstObsUlt2 = T01FY9_A4072EstObsUlt2[0] ;
         n4072EstObsUlt2 = T01FY9_n4072EstObsUlt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         A279CliNom = T01FY9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm1FY1570( -8) ;
      }
      pr_default.close(7);
      onLoadActions1FY1570( ) ;
   }

   public void onLoadActions1FY1570( )
   {
   }

   public void checkExtendedTable1FY1570( )
   {
      nIsDirty_1570 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01FY7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FY7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01FY8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      if ( ! ( ( GXutil.strcmp(A4071EstPreDef, "S") == 0 ) || ( GXutil.strcmp(A4071EstPreDef, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Definitivo (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ESTPREDEF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstPreDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FY1570( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01FY10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FY10_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_11( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01FY11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1FY1570( )
   {
      /* Using cursor T01FY12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1570 = (short)(1) ;
      }
      else
      {
         RcdFound1570 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FY5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FY1570( 8) ;
         RcdFound1570 = (short)(1) ;
         A4061EstNomCol = T01FY5_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         A4052EstNumFor = T01FY5_A4052EstNumFor[0] ;
         n4052EstNumFor = T01FY5_n4052EstNumFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
         A4062EstAcab = T01FY5_A4062EstAcab[0] ;
         n4062EstAcab = T01FY5_n4062EstAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
         A4063EstCuba = T01FY5_A4063EstCuba[0] ;
         n4063EstCuba = T01FY5_n4063EstCuba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
         A4064EstSepara = T01FY5_A4064EstSepara[0] ;
         n4064EstSepara = T01FY5_n4064EstSepara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4064EstSepara", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4064EstSepara), 4, 0));
         A4065EstFechaE = T01FY5_A4065EstFechaE[0] ;
         n4065EstFechaE = T01FY5_n4065EstFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
         A4066EstFechaU = T01FY5_A4066EstFechaU[0] ;
         n4066EstFechaU = T01FY5_n4066EstFechaU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4066EstFechaU", localUtil.format(A4066EstFechaU, "99/99/99"));
         A4067EstBarCod = T01FY5_A4067EstBarCod[0] ;
         n4067EstBarCod = T01FY5_n4067EstBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4067EstBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4067EstBarCod), 8, 0));
         A4068EstBarREo = T01FY5_A4068EstBarREo[0] ;
         n4068EstBarREo = T01FY5_n4068EstBarREo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4068EstBarREo", GXutil.str( A4068EstBarREo, 1, 0));
         A4069EstBarPar = T01FY5_A4069EstBarPar[0] ;
         n4069EstBarPar = T01FY5_n4069EstBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4069EstBarPar", A4069EstBarPar);
         A4070EstPreKg = T01FY5_A4070EstPreKg[0] ;
         n4070EstPreKg = T01FY5_n4070EstPreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4070EstPreKg", GXutil.ltrimstr( A4070EstPreKg, 9, 2));
         A4071EstPreDef = T01FY5_A4071EstPreDef[0] ;
         n4071EstPreDef = T01FY5_n4071EstPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4071EstPreDef", A4071EstPreDef);
         A4072EstObsUlt2 = T01FY5_A4072EstObsUlt2[0] ;
         n4072EstObsUlt2 = T01FY5_n4072EstObsUlt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         A252CliCod = T01FY5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FY5_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FY1570( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1570 = (short)(0) ;
            initializeNonKey1FY1570( ) ;
         }
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1570 = (short)(0) ;
         initializeNonKey1FY1570( ) ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FY1570( ) ;
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
      /* Using cursor T01FY13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A4061EstNomCol, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01FY13_A252CliCod[0] < A252CliCod ) || ( T01FY13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY13_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01FY13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FY13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY13_A4061EstNomCol[0], A4061EstNomCol) < 0 ) ) && ( GXutil.strcmp(T01FY13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01FY13_A252CliCod[0] > A252CliCod ) || ( T01FY13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY13_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01FY13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FY13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY13_A4061EstNomCol[0], A4061EstNomCol) > 0 ) ) && ( GXutil.strcmp(T01FY13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01FY13_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01FY13_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = T01FY13_A4061EstNomCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            RcdFound1570 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1570 = (short)(0) ;
      /* Using cursor T01FY14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A4061EstNomCol, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01FY14_A252CliCod[0] > A252CliCod ) || ( T01FY14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY14_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01FY14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FY14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY14_A4061EstNomCol[0], A4061EstNomCol) > 0 ) ) && ( GXutil.strcmp(T01FY14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01FY14_A252CliCod[0] < A252CliCod ) || ( T01FY14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY14_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01FY14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FY14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FY14_A4061EstNomCol[0], A4061EstNomCol) < 0 ) ) && ( GXutil.strcmp(T01FY14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01FY14_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01FY14_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = T01FY14_A4061EstNomCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            RcdFound1570 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FY1570( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FY1570( ) ;
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
               update1FY1570( ) ;
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
               insert1FY1570( ) ;
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
                  insert1FY1570( ) ;
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
      getKey1FY1570( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcestfa");
      GX_FocusControl = edtEstAcab_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FY0( ) ;
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
      scanStart1FY1570( ) ;
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
      scanEnd1FY1570( ) ;
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
      scanStart1FY1570( ) ;
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1570 != 0 )
         {
            scanNext1FY1570( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstAcab_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FY1570( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FY1570( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z4052EstNumFor != T01FY4_A4052EstNumFor[0] ) || ( GXutil.strcmp(Z4062EstAcab, T01FY4_A4062EstAcab[0]) != 0 ) || ( Z4063EstCuba != T01FY4_A4063EstCuba[0] ) || ( Z4064EstSepara != T01FY4_A4064EstSepara[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4065EstFechaE), GXutil.resetTime(T01FY4_A4065EstFechaE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4066EstFechaU), GXutil.resetTime(T01FY4_A4066EstFechaU[0])) ) || ( Z4067EstBarCod != T01FY4_A4067EstBarCod[0] ) || ( Z4068EstBarREo != T01FY4_A4068EstBarREo[0] ) || ( GXutil.strcmp(Z4069EstBarPar, T01FY4_A4069EstBarPar[0]) != 0 ) || ( DecimalUtil.compareTo(Z4070EstPreKg, T01FY4_A4070EstPreKg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4071EstPreDef, T01FY4_A4071EstPreDef[0]) != 0 ) || ( Z4072EstObsUlt2 != T01FY4_A4072EstObsUlt2[0] ) )
         {
            if ( Z4052EstNumFor != T01FY4_A4052EstNumFor[0] )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstNumFor");
               GXutil.writeLogRaw("Old: ",Z4052EstNumFor);
               GXutil.writeLogRaw("Current: ",T01FY4_A4052EstNumFor[0]);
            }
            if ( GXutil.strcmp(Z4062EstAcab, T01FY4_A4062EstAcab[0]) != 0 )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstAcab");
               GXutil.writeLogRaw("Old: ",Z4062EstAcab);
               GXutil.writeLogRaw("Current: ",T01FY4_A4062EstAcab[0]);
            }
            if ( Z4063EstCuba != T01FY4_A4063EstCuba[0] )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstCuba");
               GXutil.writeLogRaw("Old: ",Z4063EstCuba);
               GXutil.writeLogRaw("Current: ",T01FY4_A4063EstCuba[0]);
            }
            if ( Z4064EstSepara != T01FY4_A4064EstSepara[0] )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstSepara");
               GXutil.writeLogRaw("Old: ",Z4064EstSepara);
               GXutil.writeLogRaw("Current: ",T01FY4_A4064EstSepara[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4065EstFechaE), GXutil.resetTime(T01FY4_A4065EstFechaE[0])) ) )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstFechaE");
               GXutil.writeLogRaw("Old: ",Z4065EstFechaE);
               GXutil.writeLogRaw("Current: ",T01FY4_A4065EstFechaE[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4066EstFechaU), GXutil.resetTime(T01FY4_A4066EstFechaU[0])) ) )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstFechaU");
               GXutil.writeLogRaw("Old: ",Z4066EstFechaU);
               GXutil.writeLogRaw("Current: ",T01FY4_A4066EstFechaU[0]);
            }
            if ( Z4067EstBarCod != T01FY4_A4067EstBarCod[0] )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstBarCod");
               GXutil.writeLogRaw("Old: ",Z4067EstBarCod);
               GXutil.writeLogRaw("Current: ",T01FY4_A4067EstBarCod[0]);
            }
            if ( Z4068EstBarREo != T01FY4_A4068EstBarREo[0] )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstBarREo");
               GXutil.writeLogRaw("Old: ",Z4068EstBarREo);
               GXutil.writeLogRaw("Current: ",T01FY4_A4068EstBarREo[0]);
            }
            if ( GXutil.strcmp(Z4069EstBarPar, T01FY4_A4069EstBarPar[0]) != 0 )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstBarPar");
               GXutil.writeLogRaw("Old: ",Z4069EstBarPar);
               GXutil.writeLogRaw("Current: ",T01FY4_A4069EstBarPar[0]);
            }
            if ( DecimalUtil.compareTo(Z4070EstPreKg, T01FY4_A4070EstPreKg[0]) != 0 )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstPreKg");
               GXutil.writeLogRaw("Old: ",Z4070EstPreKg);
               GXutil.writeLogRaw("Current: ",T01FY4_A4070EstPreKg[0]);
            }
            if ( GXutil.strcmp(Z4071EstPreDef, T01FY4_A4071EstPreDef[0]) != 0 )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstPreDef");
               GXutil.writeLogRaw("Old: ",Z4071EstPreDef);
               GXutil.writeLogRaw("Current: ",T01FY4_A4071EstPreDef[0]);
            }
            if ( Z4072EstObsUlt2 != T01FY4_A4072EstObsUlt2[0] )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"EstObsUlt2");
               GXutil.writeLogRaw("Old: ",Z4072EstObsUlt2);
               GXutil.writeLogRaw("Current: ",T01FY4_A4072EstObsUlt2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESTAM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FY1570( )
   {
      beforeValidate1FY1570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FY1570( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FY1570( 0) ;
         checkOptimisticConcurrency1FY1570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FY1570( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FY1570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FY15 */
                  pr_default.execute(13, new Object[] {A4061EstNomCol, Boolean.valueOf(n4052EstNumFor), Integer.valueOf(A4052EstNumFor), Boolean.valueOf(n4062EstAcab), A4062EstAcab, Boolean.valueOf(n4063EstCuba), Short.valueOf(A4063EstCuba), Boolean.valueOf(n4064EstSepara), Short.valueOf(A4064EstSepara), Boolean.valueOf(n4065EstFechaE), A4065EstFechaE, Boolean.valueOf(n4066EstFechaU), A4066EstFechaU, Boolean.valueOf(n4067EstBarCod), Integer.valueOf(A4067EstBarCod), Boolean.valueOf(n4068EstBarREo), Byte.valueOf(A4068EstBarREo), Boolean.valueOf(n4069EstBarPar), A4069EstBarPar, Boolean.valueOf(n4070EstPreKg), A4070EstPreKg, Boolean.valueOf(n4071EstPreDef), A4071EstPreDef, Boolean.valueOf(n4072EstObsUlt2), Byte.valueOf(A4072EstObsUlt2), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1FY1570( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FY0( ) ;
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
            load1FY1570( ) ;
         }
         endLevel1FY1570( ) ;
      }
      closeExtendedTableCursors1FY1570( ) ;
   }

   public void update1FY1570( )
   {
      beforeValidate1FY1570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FY1570( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FY1570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FY1570( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FY1570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FY16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n4052EstNumFor), Integer.valueOf(A4052EstNumFor), Boolean.valueOf(n4062EstAcab), A4062EstAcab, Boolean.valueOf(n4063EstCuba), Short.valueOf(A4063EstCuba), Boolean.valueOf(n4064EstSepara), Short.valueOf(A4064EstSepara), Boolean.valueOf(n4065EstFechaE), A4065EstFechaE, Boolean.valueOf(n4066EstFechaU), A4066EstFechaU, Boolean.valueOf(n4067EstBarCod), Integer.valueOf(A4067EstBarCod), Boolean.valueOf(n4068EstBarREo), Byte.valueOf(A4068EstBarREo), Boolean.valueOf(n4069EstBarPar), A4069EstBarPar, Boolean.valueOf(n4070EstPreKg), A4070EstPreKg, Boolean.valueOf(n4071EstPreDef), A4071EstPreDef, Boolean.valueOf(n4072EstObsUlt2), Byte.valueOf(A4072EstObsUlt2), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FY1570( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FY1570( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FY0( ) ;
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
         endLevel1FY1570( ) ;
      }
      closeExtendedTableCursors1FY1570( ) ;
   }

   public void deferredUpdate1FY1570( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FY1570( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FY1570( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FY1570( ) ;
         afterConfirm1FY1570( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FY1570( ) ;
            if ( AnyError == 0 )
            {
               scanStart1FY1592( ) ;
               while ( RcdFound1592 != 0 )
               {
                  getByPrimaryKey1FY1592( ) ;
                  delete1FY1592( ) ;
                  scanNext1FY1592( ) ;
               }
               scanEnd1FY1592( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FY17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
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
                           initAll1FY1570( ) ;
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
                        resetCaption1FY0( ) ;
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
      sMode1570 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FY1570( ) ;
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FY1570( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FY18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01FY18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
      }
   }

   public void processNestedLevel1FY1592( )
   {
      nGXsfl_110_idx = 0 ;
      while ( nGXsfl_110_idx < nRC_GXsfl_110 )
      {
         readRow1FY1592( ) ;
         if ( ( nRcdExists_1592 != 0 ) || ( nIsMod_1592 != 0 ) )
         {
            standaloneNotModal1FY1592( ) ;
            getKey1FY1592( ) ;
            if ( ( nRcdExists_1592 == 0 ) && ( nRcdDeleted_1592 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FY1592( ) ;
            }
            else
            {
               if ( RcdFound1592 != 0 )
               {
                  if ( ( nRcdDeleted_1592 != 0 ) && ( nRcdExists_1592 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FY1592( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1592 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FY1592( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1592 == 0 )
                  {
                     GXCCtl = "ESTOBSLIN2_" + sGXsfl_110_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstObsLin2_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1592_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstObsLin2_Internalname, GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstobs2_Internalname, GXutil.rtrim( A4074Estobs2)) ;
         httpContext.changePostValue( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4074Estobs2_"+sGXsfl_110_idx, GXutil.rtrim( Z4074Estobs2)) ;
         httpContext.changePostValue( "nRcdDeleted_1592_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1592_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1592_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1592 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1592_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBSLIN2_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBS2_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FY1592( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1592 = (short)(0) ;
      nIsMod_1592 = (short)(0) ;
      nRcdDeleted_1592 = (short)(0) ;
   }

   public void processLevel1FY1570( )
   {
      /* Save parent mode. */
      sMode1570 = Gx_mode ;
      processNestedLevel1FY1592( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FY1570( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FY1570( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcestfa");
         if ( AnyError == 0 )
         {
            confirmValues1FY0( ) ;
         }
         /* After transaction rules */
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
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcestfa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FY1570( )
   {
      /* Scan By routine */
      /* Using cursor T01FY19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A252CliCod = T01FY19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FY19_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01FY19_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FY1570( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A252CliCod = T01FY19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FY19_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01FY19_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      }
   }

   public void scanEnd1FY1570( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1FY1570( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FY1570( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FY1570( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FY1570( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FY1570( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FY1570( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FY1570( )
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
      edtEstObsUlt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt2_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1FY1592( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4074Estobs2 = T01FY3_A4074Estobs2[0] ;
         }
         else
         {
            Z4074Estobs2 = A4074Estobs2 ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z4073EstObsLin2 = A4073EstObsLin2 ;
         Z4074Estobs2 = A4074Estobs2 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1FY1592( )
   {
   }

   public void standaloneModal1FY1592( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEstObsLin2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      }
      else
      {
         edtEstObsLin2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      }
   }

   public void load1FY1592( )
   {
      /* Using cursor T01FY20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A4074Estobs2 = T01FY20_A4074Estobs2[0] ;
         n4074Estobs2 = T01FY20_n4074Estobs2[0] ;
         zm1FY1592( -12) ;
      }
      pr_default.close(18);
      onLoadActions1FY1592( ) ;
   }

   public void onLoadActions1FY1592( )
   {
   }

   public void checkExtendedTable1FY1592( )
   {
      nIsDirty_1592 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FY1592( ) ;
   }

   public void closeExtendedTableCursors1FY1592( )
   {
   }

   public void enableDisable1FY1592( )
   {
   }

   public void getKey1FY1592( )
   {
      /* Using cursor T01FY21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1592 = (short)(1) ;
      }
      else
      {
         RcdFound1592 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1FY1592( )
   {
      /* Using cursor T01FY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FY3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FY1592( 12) ;
         RcdFound1592 = (short)(1) ;
         initializeNonKey1FY1592( ) ;
         A4073EstObsLin2 = T01FY3_A4073EstObsLin2[0] ;
         A4074Estobs2 = T01FY3_A4074Estobs2[0] ;
         n4074Estobs2 = T01FY3_n4074Estobs2[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z4073EstObsLin2 = A4073EstObsLin2 ;
         sMode1592 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FY1592( ) ;
         load1FY1592( ) ;
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1592 = (short)(0) ;
         initializeNonKey1FY1592( ) ;
         sMode1592 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FY1592( ) ;
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FY1592( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FY1592( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPObsest"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4074Estobs2, T01FY2_A4074Estobs2[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4074Estobs2, T01FY2_A4074Estobs2[0]) != 0 )
            {
               GXutil.writeLogln("tcestfa:[seudo value changed for attri]"+"Estobs2");
               GXutil.writeLogRaw("Old: ",Z4074Estobs2);
               GXutil.writeLogRaw("Current: ",T01FY2_A4074Estobs2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPObsest"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FY1592( )
   {
      beforeValidate1FY1592( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FY1592( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FY1592( 0) ;
         checkOptimisticConcurrency1FY1592( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FY1592( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FY1592( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FY22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2), Boolean.valueOf(n4074Estobs2), A4074Estobs2, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
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
            load1FY1592( ) ;
         }
         endLevel1FY1592( ) ;
      }
      closeExtendedTableCursors1FY1592( ) ;
   }

   public void update1FY1592( )
   {
      beforeValidate1FY1592( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FY1592( ) ;
      }
      if ( ( nIsMod_1592 != 0 ) || ( nIsDirty_1592 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FY1592( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FY1592( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FY1592( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FY23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n4074Estobs2), A4074Estobs2, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPObsest"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FY1592( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FY1592( ) ;
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
            endLevel1FY1592( ) ;
         }
      }
      closeExtendedTableCursors1FY1592( ) ;
   }

   public void deferredUpdate1FY1592( )
   {
   }

   public void delete1FY1592( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FY1592( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FY1592( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FY1592( ) ;
         afterConfirm1FY1592( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FY1592( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FY24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
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
      sMode1592 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FY1592( ) ;
      Gx_mode = sMode1592 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FY1592( )
   {
      standaloneModal1FY1592( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FY1592( )
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

   public void scanStart1FY1592( )
   {
      /* Scan By routine */
      /* Using cursor T01FY25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      RcdFound1592 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A4073EstObsLin2 = T01FY25_A4073EstObsLin2[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FY1592( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1592 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A4073EstObsLin2 = T01FY25_A4073EstObsLin2[0] ;
      }
   }

   public void scanEnd1FY1592( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1FY1592( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FY1592( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FY1592( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FY1592( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FY1592( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FY1592( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FY1592( )
   {
      edtEstObsLin2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      edtEstobs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
   }

   public void send_integrity_lvl_hashes1FY1592( )
   {
   }

   public void send_integrity_lvl_hashes1FY1570( )
   {
   }

   public void subsflControlProps_1101592( )
   {
      edtavnRcdDeleted_1592_Internalname = "vNRCDDELETED_1592_"+sGXsfl_110_idx ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2_"+sGXsfl_110_idx ;
      edtEstobs2_Internalname = "ESTOBS2_"+sGXsfl_110_idx ;
   }

   public void subsflControlProps_fel_1101592( )
   {
      edtavnRcdDeleted_1592_Internalname = "vNRCDDELETED_1592_"+sGXsfl_110_fel_idx ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2_"+sGXsfl_110_fel_idx ;
      edtEstobs2_Internalname = "ESTOBS2_"+sGXsfl_110_fel_idx ;
   }

   public void addRow1FY1592( )
   {
      nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101592( ) ;
      sendRow1FY1592( ) ;
   }

   public void sendRow1FY1592( )
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
         if ( ((int)((nGXsfl_110_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1592_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1592_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1592_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1592), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1592), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1592_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1592_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1592_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstObsLin2_Internalname,GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4073EstObsLin2), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstObsLin2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstObsLin2_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1592_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstobs2_Internalname,GXutil.rtrim( A4074Estobs2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstobs2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstobs2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FY1592( ) ;
      GXCCtl = "Z4073EstObsLin2_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4074Estobs2_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4074Estobs2));
      GXCCtl = "nRcdDeleted_1592_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1592_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1592_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1592_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTOBSLIN2_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTOBS2_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FY1592( )
   {
      nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101592( ) ;
      edtavnRcdDeleted_1592_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1592_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstObsLin2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBSLIN2_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstobs2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBS2_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1592_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1592_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1592");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1592_Internalname ;
         wbErr = true ;
         nRcdDeleted_1592 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1592 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1592_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ESTOBSLIN2_" + sGXsfl_110_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstObsLin2_Internalname ;
         wbErr = true ;
         A4073EstObsLin2 = (byte)(0) ;
      }
      else
      {
         A4073EstObsLin2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4074Estobs2 = httpContext.cgiGet( edtEstobs2_Internalname) ;
      n4074Estobs2 = false ;
      GXCCtl = "Z4073EstObsLin2_" + sGXsfl_110_idx ;
      Z4073EstObsLin2 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4074Estobs2_" + sGXsfl_110_idx ;
      Z4074Estobs2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1592_" + sGXsfl_110_idx ;
      nRcdDeleted_1592 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1592_" + sGXsfl_110_idx ;
      nRcdExists_1592 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1592_" + sGXsfl_110_idx ;
      nIsMod_1592 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstObsLin2_Enabled = edtEstObsLin2_Enabled ;
   }

   public void confirmValues1FY0( )
   {
      nGXsfl_110_idx = 0 ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101592( ) ;
      while ( nGXsfl_110_idx < nRC_GXsfl_110 )
      {
         nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1101592( ) ;
         httpContext.changePostValue( "Z4073EstObsLin2_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_110_idx) ;
         httpContext.changePostValue( "Z4074Estobs2_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z4074Estobs2_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4074Estobs2_"+sGXsfl_110_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcestfa", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( Z4072EstObsUlt2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_110", GXutil.ltrim( localUtil.ntoc( nGXsfl_110_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTADOR", GXutil.ltrim( localUtil.ntoc( AV32contador, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
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
      return formatLink("app.tcestfa", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCESTFA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANT FORMULAS TRAVER", "") ;
   }

   public void initializeNonKey1FY1570( )
   {
      A4052EstNumFor = 0 ;
      n4052EstNumFor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
      A4062EstAcab = "" ;
      n4062EstAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4062EstAcab", A4062EstAcab);
      A4063EstCuba = (short)(0) ;
      n4063EstCuba = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4063EstCuba", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4063EstCuba), 4, 0));
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
      A4072EstObsUlt2 = (byte)(0) ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4065EstFechaE = Gx_date ;
      n4065EstFechaE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
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
      Z4072EstObsUlt2 = (byte)(0) ;
   }

   public void initAll1FY1570( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A4061EstNomCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      initializeNonKey1FY1570( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4065EstFechaE = i4065EstFechaE ;
      n4065EstFechaE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4065EstFechaE", localUtil.format(A4065EstFechaE, "99/99/99"));
   }

   public void initializeNonKey1FY1592( )
   {
      A4074Estobs2 = "" ;
      n4074Estobs2 = false ;
      Z4074Estobs2 = "" ;
   }

   public void initAll1FY1592( )
   {
      A4073EstObsLin2 = (byte)(0) ;
      initializeNonKey1FY1592( ) ;
   }

   public void standaloneModalInsert1FY1592( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573557", true, true);
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
      httpContext.AddJavascriptSource("tcestfa.js", "?20268241573557", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1592( )
   {
      edtEstObsLin2_Enabled = defedtEstObsLin2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_110_Refreshing);
   }

   public void startgridcontrol110( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4074Estobs2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEstObsUlt2_Internalname = "ESTOBSULT2" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtavnRcdDeleted_1592_Internalname = "vNRCDDELETED_1592" ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2" ;
      edtEstobs2_Internalname = "ESTOBS2" ;
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
      Form.setCaption( httpContext.getMessage( "MANT FORMULAS TRAVER", "") );
      edtEstobs2_Jsonclick = "" ;
      edtEstObsLin2_Jsonclick = "" ;
      edtavnRcdDeleted_1592_Jsonclick = "" ;
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
      edtEstobs2_Enabled = 1 ;
      edtEstObsLin2_Enabled = 1 ;
      edtavnRcdDeleted_1592_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEstObsUlt2_Jsonclick = "" ;
      edtEstObsUlt2_Backcolor = (int)(0xFFFFFF) ;
      edtEstObsUlt2_Enabled = 1 ;
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
      edtEstFechaU_Enabled = 1 ;
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

   public void xc_4_1FY1570( )
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

   public void xc_5_1FY1570( )
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

   public void xc_6_1FY1570( )
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

   public void xc_7_1FY1570( )
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1101592( ) ;
      while ( nGXsfl_110_idx <= nRC_GXsfl_110 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FY1592( ) ;
         standaloneModal1FY1592( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FY1592( ) ;
         nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1101592( ) ;
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
      /* Using cursor T01FY26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FY26_A407EmprNom[0] ;
      n407EmprNom = T01FY26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T01FY18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FY18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      /* Using cursor T01FY27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(25);
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
      /* Using cursor T01FY18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01FY18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      /* Using cursor T01FY27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Estnomcol( )
   {
      n4052EstNumFor = false ;
      n4065EstFechaE = false ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( A4072EstObsUlt2, (byte)(2), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( Z4072EstObsUlt2, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
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
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTNOMCOL","{handler:'valid_Estnomcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''},{av:'AV32contador',fld:'vCONTADOR',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A4065EstFechaE',fld:'ESTFECHAE',pic:''}]");
      setEventMetadata("VALID_ESTNOMCOL",",oparms:[{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A4062EstAcab',fld:'ESTACAB',pic:''},{av:'A4063EstCuba',fld:'ESTCUBA',pic:'ZZZ9'},{av:'A4064EstSepara',fld:'ESTSEPARA',pic:'ZZZ9'},{av:'A4065EstFechaE',fld:'ESTFECHAE',pic:''},{av:'A4066EstFechaU',fld:'ESTFECHAU',pic:''},{av:'A4067EstBarCod',fld:'ESTBARCOD',pic:'ZZZZZZZ9'},{av:'A4068EstBarREo',fld:'ESTBARREO',pic:'9'},{av:'A4069EstBarPar',fld:'ESTBARPAR',pic:''},{av:'A4070EstPreKg',fld:'ESTPREKG',pic:'ZZZZZ9.99'},{av:'A4071EstPreDef',fld:'ESTPREDEF',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4072EstObsUlt2',fld:'ESTOBSULT2',pic:'Z9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4061EstNomCol'},{av:'Z4052EstNumFor'},{av:'Z4062EstAcab'},{av:'Z4063EstCuba'},{av:'Z4064EstSepara'},{av:'Z4065EstFechaE'},{av:'Z4066EstFechaU'},{av:'Z4067EstBarCod'},{av:'Z4068EstBarREo'},{av:'Z4069EstBarPar'},{av:'Z4070EstPreKg'},{av:'Z4071EstPreDef'},{av:'Z407EmprNom'},{av:'Z4072EstObsUlt2'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTNUMFOR","{handler:'valid_Estnumfor',iparms:[]");
      setEventMetadata("VALID_ESTNUMFOR",",oparms:[]}");
      setEventMetadata("VALID_ESTPREDEF","{handler:'valid_Estpredef',iparms:[]");
      setEventMetadata("VALID_ESTPREDEF",",oparms:[]}");
      setEventMetadata("VALID_ESTOBSLIN2","{handler:'valid_Estobslin2',iparms:[]");
      setEventMetadata("VALID_ESTOBSLIN2",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Estobs2',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(16);
      pr_default.close(24);
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
      Z4074Estobs2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4061EstNomCol = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A4062EstAcab = "" ;
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
      lblTextblock18_Jsonclick = "" ;
      A279CliNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1592 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_date = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1570 = "" ;
      GXCCtl = "" ;
      A4074Estobs2 = "" ;
      AV9LitFe = "" ;
      AV7Lit0 = "" ;
      GXt_char1 = "" ;
      AV29station = "" ;
      GXv_char2 = new String[1] ;
      AV30emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01FY6_A407EmprNom = new String[] {""} ;
      T01FY6_n407EmprNom = new boolean[] {false} ;
      T01FY9_A4061EstNomCol = new String[] {""} ;
      T01FY9_A4052EstNumFor = new int[1] ;
      T01FY9_n4052EstNumFor = new boolean[] {false} ;
      T01FY9_A4062EstAcab = new String[] {""} ;
      T01FY9_n4062EstAcab = new boolean[] {false} ;
      T01FY9_A4063EstCuba = new short[1] ;
      T01FY9_n4063EstCuba = new boolean[] {false} ;
      T01FY9_A4064EstSepara = new short[1] ;
      T01FY9_n4064EstSepara = new boolean[] {false} ;
      T01FY9_A4065EstFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01FY9_n4065EstFechaE = new boolean[] {false} ;
      T01FY9_A4066EstFechaU = new java.util.Date[] {GXutil.nullDate()} ;
      T01FY9_n4066EstFechaU = new boolean[] {false} ;
      T01FY9_A4067EstBarCod = new int[1] ;
      T01FY9_n4067EstBarCod = new boolean[] {false} ;
      T01FY9_A4068EstBarREo = new byte[1] ;
      T01FY9_n4068EstBarREo = new boolean[] {false} ;
      T01FY9_A4069EstBarPar = new String[] {""} ;
      T01FY9_n4069EstBarPar = new boolean[] {false} ;
      T01FY9_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FY9_n4070EstPreKg = new boolean[] {false} ;
      T01FY9_A4071EstPreDef = new String[] {""} ;
      T01FY9_n4071EstPreDef = new boolean[] {false} ;
      T01FY9_A407EmprNom = new String[] {""} ;
      T01FY9_n407EmprNom = new boolean[] {false} ;
      T01FY9_A4072EstObsUlt2 = new byte[1] ;
      T01FY9_n4072EstObsUlt2 = new boolean[] {false} ;
      T01FY9_A279CliNom = new String[] {""} ;
      T01FY9_A396EmprCod = new String[] {""} ;
      T01FY9_A252CliCod = new int[1] ;
      T01FY9_A65ArtCod = new String[] {""} ;
      T01FY7_A279CliNom = new String[] {""} ;
      T01FY8_A396EmprCod = new String[] {""} ;
      T01FY10_A279CliNom = new String[] {""} ;
      T01FY11_A396EmprCod = new String[] {""} ;
      T01FY12_A396EmprCod = new String[] {""} ;
      T01FY12_A252CliCod = new int[1] ;
      T01FY12_A65ArtCod = new String[] {""} ;
      T01FY12_A4061EstNomCol = new String[] {""} ;
      T01FY5_A4061EstNomCol = new String[] {""} ;
      T01FY5_A4052EstNumFor = new int[1] ;
      T01FY5_n4052EstNumFor = new boolean[] {false} ;
      T01FY5_A4062EstAcab = new String[] {""} ;
      T01FY5_n4062EstAcab = new boolean[] {false} ;
      T01FY5_A4063EstCuba = new short[1] ;
      T01FY5_n4063EstCuba = new boolean[] {false} ;
      T01FY5_A4064EstSepara = new short[1] ;
      T01FY5_n4064EstSepara = new boolean[] {false} ;
      T01FY5_A4065EstFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01FY5_n4065EstFechaE = new boolean[] {false} ;
      T01FY5_A4066EstFechaU = new java.util.Date[] {GXutil.nullDate()} ;
      T01FY5_n4066EstFechaU = new boolean[] {false} ;
      T01FY5_A4067EstBarCod = new int[1] ;
      T01FY5_n4067EstBarCod = new boolean[] {false} ;
      T01FY5_A4068EstBarREo = new byte[1] ;
      T01FY5_n4068EstBarREo = new boolean[] {false} ;
      T01FY5_A4069EstBarPar = new String[] {""} ;
      T01FY5_n4069EstBarPar = new boolean[] {false} ;
      T01FY5_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FY5_n4070EstPreKg = new boolean[] {false} ;
      T01FY5_A4071EstPreDef = new String[] {""} ;
      T01FY5_n4071EstPreDef = new boolean[] {false} ;
      T01FY5_A4072EstObsUlt2 = new byte[1] ;
      T01FY5_n4072EstObsUlt2 = new boolean[] {false} ;
      T01FY5_A396EmprCod = new String[] {""} ;
      T01FY5_A252CliCod = new int[1] ;
      T01FY5_A65ArtCod = new String[] {""} ;
      T01FY13_A396EmprCod = new String[] {""} ;
      T01FY13_A252CliCod = new int[1] ;
      T01FY13_A65ArtCod = new String[] {""} ;
      T01FY13_A4061EstNomCol = new String[] {""} ;
      T01FY14_A396EmprCod = new String[] {""} ;
      T01FY14_A252CliCod = new int[1] ;
      T01FY14_A65ArtCod = new String[] {""} ;
      T01FY14_A4061EstNomCol = new String[] {""} ;
      T01FY4_A4061EstNomCol = new String[] {""} ;
      T01FY4_A4052EstNumFor = new int[1] ;
      T01FY4_n4052EstNumFor = new boolean[] {false} ;
      T01FY4_A4062EstAcab = new String[] {""} ;
      T01FY4_n4062EstAcab = new boolean[] {false} ;
      T01FY4_A4063EstCuba = new short[1] ;
      T01FY4_n4063EstCuba = new boolean[] {false} ;
      T01FY4_A4064EstSepara = new short[1] ;
      T01FY4_n4064EstSepara = new boolean[] {false} ;
      T01FY4_A4065EstFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01FY4_n4065EstFechaE = new boolean[] {false} ;
      T01FY4_A4066EstFechaU = new java.util.Date[] {GXutil.nullDate()} ;
      T01FY4_n4066EstFechaU = new boolean[] {false} ;
      T01FY4_A4067EstBarCod = new int[1] ;
      T01FY4_n4067EstBarCod = new boolean[] {false} ;
      T01FY4_A4068EstBarREo = new byte[1] ;
      T01FY4_n4068EstBarREo = new boolean[] {false} ;
      T01FY4_A4069EstBarPar = new String[] {""} ;
      T01FY4_n4069EstBarPar = new boolean[] {false} ;
      T01FY4_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FY4_n4070EstPreKg = new boolean[] {false} ;
      T01FY4_A4071EstPreDef = new String[] {""} ;
      T01FY4_n4071EstPreDef = new boolean[] {false} ;
      T01FY4_A4072EstObsUlt2 = new byte[1] ;
      T01FY4_n4072EstObsUlt2 = new boolean[] {false} ;
      T01FY4_A396EmprCod = new String[] {""} ;
      T01FY4_A252CliCod = new int[1] ;
      T01FY4_A65ArtCod = new String[] {""} ;
      T01FY18_A279CliNom = new String[] {""} ;
      T01FY19_A396EmprCod = new String[] {""} ;
      T01FY19_A252CliCod = new int[1] ;
      T01FY19_A65ArtCod = new String[] {""} ;
      T01FY19_A4061EstNomCol = new String[] {""} ;
      T01FY20_A252CliCod = new int[1] ;
      T01FY20_A65ArtCod = new String[] {""} ;
      T01FY20_A4061EstNomCol = new String[] {""} ;
      T01FY20_A4073EstObsLin2 = new byte[1] ;
      T01FY20_A4074Estobs2 = new String[] {""} ;
      T01FY20_n4074Estobs2 = new boolean[] {false} ;
      T01FY20_A396EmprCod = new String[] {""} ;
      T01FY21_A396EmprCod = new String[] {""} ;
      T01FY21_A252CliCod = new int[1] ;
      T01FY21_A65ArtCod = new String[] {""} ;
      T01FY21_A4061EstNomCol = new String[] {""} ;
      T01FY21_A4073EstObsLin2 = new byte[1] ;
      T01FY3_A252CliCod = new int[1] ;
      T01FY3_A65ArtCod = new String[] {""} ;
      T01FY3_A4061EstNomCol = new String[] {""} ;
      T01FY3_A4073EstObsLin2 = new byte[1] ;
      T01FY3_A4074Estobs2 = new String[] {""} ;
      T01FY3_n4074Estobs2 = new boolean[] {false} ;
      T01FY3_A396EmprCod = new String[] {""} ;
      T01FY2_A252CliCod = new int[1] ;
      T01FY2_A65ArtCod = new String[] {""} ;
      T01FY2_A4061EstNomCol = new String[] {""} ;
      T01FY2_A4073EstObsLin2 = new byte[1] ;
      T01FY2_A4074Estobs2 = new String[] {""} ;
      T01FY2_n4074Estobs2 = new boolean[] {false} ;
      T01FY2_A396EmprCod = new String[] {""} ;
      T01FY25_A396EmprCod = new String[] {""} ;
      T01FY25_A252CliCod = new int[1] ;
      T01FY25_A65ArtCod = new String[] {""} ;
      T01FY25_A4061EstNomCol = new String[] {""} ;
      T01FY25_A4073EstObsLin2 = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4065EstFechaE = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FY26_A407EmprNom = new String[] {""} ;
      T01FY26_n407EmprNom = new boolean[] {false} ;
      T01FY27_A396EmprCod = new String[] {""} ;
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
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcestfa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcestfa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcestfa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcestfa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcestfa__default(),
         new Object[] {
             new Object[] {
            T01FY2_A252CliCod, T01FY2_A65ArtCod, T01FY2_A4061EstNomCol, T01FY2_A4073EstObsLin2, T01FY2_A4074Estobs2, T01FY2_n4074Estobs2, T01FY2_A396EmprCod
            }
            , new Object[] {
            T01FY3_A252CliCod, T01FY3_A65ArtCod, T01FY3_A4061EstNomCol, T01FY3_A4073EstObsLin2, T01FY3_A4074Estobs2, T01FY3_n4074Estobs2, T01FY3_A396EmprCod
            }
            , new Object[] {
            T01FY4_A4061EstNomCol, T01FY4_A4052EstNumFor, T01FY4_n4052EstNumFor, T01FY4_A4062EstAcab, T01FY4_n4062EstAcab, T01FY4_A4063EstCuba, T01FY4_n4063EstCuba, T01FY4_A4064EstSepara, T01FY4_n4064EstSepara, T01FY4_A4065EstFechaE,
            T01FY4_n4065EstFechaE, T01FY4_A4066EstFechaU, T01FY4_n4066EstFechaU, T01FY4_A4067EstBarCod, T01FY4_n4067EstBarCod, T01FY4_A4068EstBarREo, T01FY4_n4068EstBarREo, T01FY4_A4069EstBarPar, T01FY4_n4069EstBarPar, T01FY4_A4070EstPreKg,
            T01FY4_n4070EstPreKg, T01FY4_A4071EstPreDef, T01FY4_n4071EstPreDef, T01FY4_A4072EstObsUlt2, T01FY4_n4072EstObsUlt2, T01FY4_A396EmprCod, T01FY4_A252CliCod, T01FY4_A65ArtCod
            }
            , new Object[] {
            T01FY5_A4061EstNomCol, T01FY5_A4052EstNumFor, T01FY5_n4052EstNumFor, T01FY5_A4062EstAcab, T01FY5_n4062EstAcab, T01FY5_A4063EstCuba, T01FY5_n4063EstCuba, T01FY5_A4064EstSepara, T01FY5_n4064EstSepara, T01FY5_A4065EstFechaE,
            T01FY5_n4065EstFechaE, T01FY5_A4066EstFechaU, T01FY5_n4066EstFechaU, T01FY5_A4067EstBarCod, T01FY5_n4067EstBarCod, T01FY5_A4068EstBarREo, T01FY5_n4068EstBarREo, T01FY5_A4069EstBarPar, T01FY5_n4069EstBarPar, T01FY5_A4070EstPreKg,
            T01FY5_n4070EstPreKg, T01FY5_A4071EstPreDef, T01FY5_n4071EstPreDef, T01FY5_A4072EstObsUlt2, T01FY5_n4072EstObsUlt2, T01FY5_A396EmprCod, T01FY5_A252CliCod, T01FY5_A65ArtCod
            }
            , new Object[] {
            T01FY6_A407EmprNom, T01FY6_n407EmprNom
            }
            , new Object[] {
            T01FY7_A279CliNom
            }
            , new Object[] {
            T01FY8_A396EmprCod
            }
            , new Object[] {
            T01FY9_A4061EstNomCol, T01FY9_A4052EstNumFor, T01FY9_n4052EstNumFor, T01FY9_A4062EstAcab, T01FY9_n4062EstAcab, T01FY9_A4063EstCuba, T01FY9_n4063EstCuba, T01FY9_A4064EstSepara, T01FY9_n4064EstSepara, T01FY9_A4065EstFechaE,
            T01FY9_n4065EstFechaE, T01FY9_A4066EstFechaU, T01FY9_n4066EstFechaU, T01FY9_A4067EstBarCod, T01FY9_n4067EstBarCod, T01FY9_A4068EstBarREo, T01FY9_n4068EstBarREo, T01FY9_A4069EstBarPar, T01FY9_n4069EstBarPar, T01FY9_A4070EstPreKg,
            T01FY9_n4070EstPreKg, T01FY9_A4071EstPreDef, T01FY9_n4071EstPreDef, T01FY9_A407EmprNom, T01FY9_n407EmprNom, T01FY9_A4072EstObsUlt2, T01FY9_n4072EstObsUlt2, T01FY9_A279CliNom, T01FY9_A396EmprCod, T01FY9_A252CliCod,
            T01FY9_A65ArtCod
            }
            , new Object[] {
            T01FY10_A279CliNom
            }
            , new Object[] {
            T01FY11_A396EmprCod
            }
            , new Object[] {
            T01FY12_A396EmprCod, T01FY12_A252CliCod, T01FY12_A65ArtCod, T01FY12_A4061EstNomCol
            }
            , new Object[] {
            T01FY13_A396EmprCod, T01FY13_A252CliCod, T01FY13_A65ArtCod, T01FY13_A4061EstNomCol
            }
            , new Object[] {
            T01FY14_A396EmprCod, T01FY14_A252CliCod, T01FY14_A65ArtCod, T01FY14_A4061EstNomCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FY18_A279CliNom
            }
            , new Object[] {
            T01FY19_A396EmprCod, T01FY19_A252CliCod, T01FY19_A65ArtCod, T01FY19_A4061EstNomCol
            }
            , new Object[] {
            T01FY20_A252CliCod, T01FY20_A65ArtCod, T01FY20_A4061EstNomCol, T01FY20_A4073EstObsLin2, T01FY20_A4074Estobs2, T01FY20_n4074Estobs2, T01FY20_A396EmprCod
            }
            , new Object[] {
            T01FY21_A396EmprCod, T01FY21_A252CliCod, T01FY21_A65ArtCod, T01FY21_A4061EstNomCol, T01FY21_A4073EstObsLin2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FY25_A396EmprCod, T01FY25_A252CliCod, T01FY25_A65ArtCod, T01FY25_A4061EstNomCol, T01FY25_A4073EstObsLin2
            }
            , new Object[] {
            T01FY26_A407EmprNom, T01FY26_n407EmprNom
            }
            , new Object[] {
            T01FY27_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z4065EstFechaE = GXutil.nullDate() ;
      n4065EstFechaE = false ;
      A4065EstFechaE = GXutil.nullDate() ;
      n4065EstFechaE = false ;
      i4065EstFechaE = GXutil.nullDate() ;
      n4065EstFechaE = false ;
      Gx_date = GXutil.today( ) ;
   }

   private byte Z4068EstBarREo ;
   private byte Z4072EstObsUlt2 ;
   private byte Z4073EstObsLin2 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4068EstBarREo ;
   private byte A4072EstObsUlt2 ;
   private byte Gx_BScreen ;
   private byte A4073EstObsLin2 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4068EstBarREo ;
   private byte ZZ4072EstObsUlt2 ;
   private short Z4063EstCuba ;
   private short Z4064EstSepara ;
   private short nRcdDeleted_1592 ;
   private short nRcdExists_1592 ;
   private short nIsMod_1592 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4063EstCuba ;
   private short A4064EstSepara ;
   private short nBlankRcdCount1592 ;
   private short RcdFound1592 ;
   private short nBlankRcdUsr1592 ;
   private short RcdFound1570 ;
   private short nIsDirty_1570 ;
   private short nIsDirty_1592 ;
   private short ZZ4063EstCuba ;
   private short ZZ4064EstSepara ;
   private int Z252CliCod ;
   private int Z4052EstNumFor ;
   private int Z4067EstBarCod ;
   private int nRC_GXsfl_110 ;
   private int nGXsfl_110_idx=1 ;
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
   private int edtEstObsUlt2_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtavnRcdDeleted_1592_Enabled ;
   private int edtEstObsLin2_Enabled ;
   private int edtEstobs2_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV32contador ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtEstObsLin2_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEstObsUlt2_Backcolor ;
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
   private int ZZ252CliCod ;
   private int ZZ4052EstNumFor ;
   private int ZZ4067EstBarCod ;
   private long GRID1_nFirstRecordOnPage ;
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
   private String Z4074Estobs2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_110_idx="0001" ;
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
   private String A4062EstAcab ;
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
   private String edtEstObsUlt2_Internalname ;
   private String edtEstObsUlt2_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sMode1592 ;
   private String edtavnRcdDeleted_1592_Internalname ;
   private String edtEstObsLin2_Internalname ;
   private String edtEstobs2_Internalname ;
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
   private String sMode1570 ;
   private String GXCCtl ;
   private String A4074Estobs2 ;
   private String AV9LitFe ;
   private String AV7Lit0 ;
   private String GXt_char1 ;
   private String AV29station ;
   private String GXv_char2[] ;
   private String AV30emprnom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_110_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1592_Jsonclick ;
   private String edtEstObsLin2_Jsonclick ;
   private String edtEstobs2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4061EstNomCol ;
   private String ZZ4062EstAcab ;
   private String ZZ4069EstBarPar ;
   private String ZZ4071EstPreDef ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
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
   private boolean wbErr ;
   private boolean bGXsfl_110_Refreshing=false ;
   private boolean n4062EstAcab ;
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
   private boolean n4072EstObsUlt2 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n4074Estobs2 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FY6_A407EmprNom ;
   private boolean[] T01FY6_n407EmprNom ;
   private String[] T01FY9_A4061EstNomCol ;
   private int[] T01FY9_A4052EstNumFor ;
   private boolean[] T01FY9_n4052EstNumFor ;
   private String[] T01FY9_A4062EstAcab ;
   private boolean[] T01FY9_n4062EstAcab ;
   private short[] T01FY9_A4063EstCuba ;
   private boolean[] T01FY9_n4063EstCuba ;
   private short[] T01FY9_A4064EstSepara ;
   private boolean[] T01FY9_n4064EstSepara ;
   private java.util.Date[] T01FY9_A4065EstFechaE ;
   private boolean[] T01FY9_n4065EstFechaE ;
   private java.util.Date[] T01FY9_A4066EstFechaU ;
   private boolean[] T01FY9_n4066EstFechaU ;
   private int[] T01FY9_A4067EstBarCod ;
   private boolean[] T01FY9_n4067EstBarCod ;
   private byte[] T01FY9_A4068EstBarREo ;
   private boolean[] T01FY9_n4068EstBarREo ;
   private String[] T01FY9_A4069EstBarPar ;
   private boolean[] T01FY9_n4069EstBarPar ;
   private java.math.BigDecimal[] T01FY9_A4070EstPreKg ;
   private boolean[] T01FY9_n4070EstPreKg ;
   private String[] T01FY9_A4071EstPreDef ;
   private boolean[] T01FY9_n4071EstPreDef ;
   private String[] T01FY9_A407EmprNom ;
   private boolean[] T01FY9_n407EmprNom ;
   private byte[] T01FY9_A4072EstObsUlt2 ;
   private boolean[] T01FY9_n4072EstObsUlt2 ;
   private String[] T01FY9_A279CliNom ;
   private String[] T01FY9_A396EmprCod ;
   private int[] T01FY9_A252CliCod ;
   private String[] T01FY9_A65ArtCod ;
   private String[] T01FY7_A279CliNom ;
   private String[] T01FY8_A396EmprCod ;
   private String[] T01FY10_A279CliNom ;
   private String[] T01FY11_A396EmprCod ;
   private String[] T01FY12_A396EmprCod ;
   private int[] T01FY12_A252CliCod ;
   private String[] T01FY12_A65ArtCod ;
   private String[] T01FY12_A4061EstNomCol ;
   private String[] T01FY5_A4061EstNomCol ;
   private int[] T01FY5_A4052EstNumFor ;
   private boolean[] T01FY5_n4052EstNumFor ;
   private String[] T01FY5_A4062EstAcab ;
   private boolean[] T01FY5_n4062EstAcab ;
   private short[] T01FY5_A4063EstCuba ;
   private boolean[] T01FY5_n4063EstCuba ;
   private short[] T01FY5_A4064EstSepara ;
   private boolean[] T01FY5_n4064EstSepara ;
   private java.util.Date[] T01FY5_A4065EstFechaE ;
   private boolean[] T01FY5_n4065EstFechaE ;
   private java.util.Date[] T01FY5_A4066EstFechaU ;
   private boolean[] T01FY5_n4066EstFechaU ;
   private int[] T01FY5_A4067EstBarCod ;
   private boolean[] T01FY5_n4067EstBarCod ;
   private byte[] T01FY5_A4068EstBarREo ;
   private boolean[] T01FY5_n4068EstBarREo ;
   private String[] T01FY5_A4069EstBarPar ;
   private boolean[] T01FY5_n4069EstBarPar ;
   private java.math.BigDecimal[] T01FY5_A4070EstPreKg ;
   private boolean[] T01FY5_n4070EstPreKg ;
   private String[] T01FY5_A4071EstPreDef ;
   private boolean[] T01FY5_n4071EstPreDef ;
   private byte[] T01FY5_A4072EstObsUlt2 ;
   private boolean[] T01FY5_n4072EstObsUlt2 ;
   private String[] T01FY5_A396EmprCod ;
   private int[] T01FY5_A252CliCod ;
   private String[] T01FY5_A65ArtCod ;
   private String[] T01FY13_A396EmprCod ;
   private int[] T01FY13_A252CliCod ;
   private String[] T01FY13_A65ArtCod ;
   private String[] T01FY13_A4061EstNomCol ;
   private String[] T01FY14_A396EmprCod ;
   private int[] T01FY14_A252CliCod ;
   private String[] T01FY14_A65ArtCod ;
   private String[] T01FY14_A4061EstNomCol ;
   private String[] T01FY4_A4061EstNomCol ;
   private int[] T01FY4_A4052EstNumFor ;
   private boolean[] T01FY4_n4052EstNumFor ;
   private String[] T01FY4_A4062EstAcab ;
   private boolean[] T01FY4_n4062EstAcab ;
   private short[] T01FY4_A4063EstCuba ;
   private boolean[] T01FY4_n4063EstCuba ;
   private short[] T01FY4_A4064EstSepara ;
   private boolean[] T01FY4_n4064EstSepara ;
   private java.util.Date[] T01FY4_A4065EstFechaE ;
   private boolean[] T01FY4_n4065EstFechaE ;
   private java.util.Date[] T01FY4_A4066EstFechaU ;
   private boolean[] T01FY4_n4066EstFechaU ;
   private int[] T01FY4_A4067EstBarCod ;
   private boolean[] T01FY4_n4067EstBarCod ;
   private byte[] T01FY4_A4068EstBarREo ;
   private boolean[] T01FY4_n4068EstBarREo ;
   private String[] T01FY4_A4069EstBarPar ;
   private boolean[] T01FY4_n4069EstBarPar ;
   private java.math.BigDecimal[] T01FY4_A4070EstPreKg ;
   private boolean[] T01FY4_n4070EstPreKg ;
   private String[] T01FY4_A4071EstPreDef ;
   private boolean[] T01FY4_n4071EstPreDef ;
   private byte[] T01FY4_A4072EstObsUlt2 ;
   private boolean[] T01FY4_n4072EstObsUlt2 ;
   private String[] T01FY4_A396EmprCod ;
   private int[] T01FY4_A252CliCod ;
   private String[] T01FY4_A65ArtCod ;
   private String[] T01FY18_A279CliNom ;
   private String[] T01FY19_A396EmprCod ;
   private int[] T01FY19_A252CliCod ;
   private String[] T01FY19_A65ArtCod ;
   private String[] T01FY19_A4061EstNomCol ;
   private int[] T01FY20_A252CliCod ;
   private String[] T01FY20_A65ArtCod ;
   private String[] T01FY20_A4061EstNomCol ;
   private byte[] T01FY20_A4073EstObsLin2 ;
   private String[] T01FY20_A4074Estobs2 ;
   private boolean[] T01FY20_n4074Estobs2 ;
   private String[] T01FY20_A396EmprCod ;
   private String[] T01FY21_A396EmprCod ;
   private int[] T01FY21_A252CliCod ;
   private String[] T01FY21_A65ArtCod ;
   private String[] T01FY21_A4061EstNomCol ;
   private byte[] T01FY21_A4073EstObsLin2 ;
   private int[] T01FY3_A252CliCod ;
   private String[] T01FY3_A65ArtCod ;
   private String[] T01FY3_A4061EstNomCol ;
   private byte[] T01FY3_A4073EstObsLin2 ;
   private String[] T01FY3_A4074Estobs2 ;
   private boolean[] T01FY3_n4074Estobs2 ;
   private String[] T01FY3_A396EmprCod ;
   private int[] T01FY2_A252CliCod ;
   private String[] T01FY2_A65ArtCod ;
   private String[] T01FY2_A4061EstNomCol ;
   private byte[] T01FY2_A4073EstObsLin2 ;
   private String[] T01FY2_A4074Estobs2 ;
   private boolean[] T01FY2_n4074Estobs2 ;
   private String[] T01FY2_A396EmprCod ;
   private String[] T01FY25_A396EmprCod ;
   private int[] T01FY25_A252CliCod ;
   private String[] T01FY25_A65ArtCod ;
   private String[] T01FY25_A4061EstNomCol ;
   private byte[] T01FY25_A4073EstObsLin2 ;
   private String[] T01FY26_A407EmprNom ;
   private boolean[] T01FY26_n407EmprNom ;
   private String[] T01FY27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcestfa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestfa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestfa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestfa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestfa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FY2", "SELECT CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?  FOR UPDATE OF Estobs2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY3", "SELECT CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY4", "SELECT EstNomCol, EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EstObsUlt2, EmprCod, CliCod, ArtCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?  FOR UPDATE OF EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EstObsUlt2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY5", "SELECT EstNomCol, EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EstObsUlt2, EmprCod, CliCod, ArtCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY8", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY9", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstNomCol, TM1.EstNumFor, TM1.EstAcab, TM1.EstCuba, TM1.EstSepara, TM1.EstFechaE, TM1.EstFechaU, TM1.EstBarCod, TM1.EstBarREo, TM1.EstBarPar, TM1.EstPreKg, TM1.EstPreDef, T2.EmprNom, TM1.EstObsUlt2, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM ((TXPCESTAM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.EstNomCol = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.EstNomCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY11", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EstNomCol > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FY14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EstNomCol < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, EstNomCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FY15", "INSERT INTO TXPCESTAM(EstNomCol, EstNumFor, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstPreKg, EstPreDef, EstObsUlt2, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FY16", "UPDATE TXPCESTAM SET EstNumFor=?, EstAcab=?, EstCuba=?, EstSepara=?, EstFechaE=?, EstFechaU=?, EstBarCod=?, EstBarREo=?, EstBarPar=?, EstPreKg=?, EstPreDef=?, EstObsUlt2=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FY17", "DELETE FROM TXPCESTAM  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new ForEachCursor("T01FY18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY20", "SELECT CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod FROM TXPObsest WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? and EstObsLin2 = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY21", "SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FY22", "INSERT INTO TXPObsest(CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPObsest")
         ,new UpdateCursor("T01FY23", "UPDATE TXPObsest SET Estobs2=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?", GX_NOMASK, "TXPObsest")
         ,new UpdateCursor("T01FY24", "DELETE FROM TXPObsest  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?", GX_NOMASK, "TXPObsest")
         ,new ForEachCursor("T01FY25", "SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FY27", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 2 :
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
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               return;
            case 3 :
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
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
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
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((String[]) buf[28])[0] = rslt.getString(16, 3);
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 13 :
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
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[24]).byteValue());
               }
               stmt.setString(14, (String)parms[25], 3);
               stmt.setInt(15, ((Number) parms[26]).intValue());
               stmt.setString(16, (String)parms[27], 16);
               return;
            case 14 :
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
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               stmt.setString(13, (String)parms[24], 3);
               stmt.setInt(14, ((Number) parms[25]).intValue());
               stmt.setString(15, (String)parms[26], 16);
               stmt.setString(16, (String)parms[27], 13);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               stmt.setString(6, (String)parms[6], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

