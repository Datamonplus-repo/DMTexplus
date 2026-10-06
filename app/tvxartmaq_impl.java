package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxartmaq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A7420VxArtCod = httpContext.GetPar( "VxArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7420VxArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A11765VxMaqGrp = GXutil.lval( httpContext.GetPar( "VxMaqGrp")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A11765VxMaqGrp) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Artículo/Grupo de Máquinas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tvxartmaq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxartmaq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxartmaq_impl.class ));
   }

   public tvxartmaq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxArtMaq.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Artículo", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArtMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtCod_Internalname, GXutil.rtrim( A7420VxArtCod), GXutil.rtrim( localUtil.format( A7420VxArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArtMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nro Ficha Técnica", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArtMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxFTecNr_Internalname, GXutil.ltrim( localUtil.ntoc( A11764VxFTecNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxFTecNr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11764VxFTecNr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11764VxFTecNr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxFTecNr_Jsonclick, 0, "", "", "", "", "", 1, edtVxFTecNr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArtMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Grupo de Máquinas", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArtMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxMaqGrp_Internalname, GXutil.ltrim( localUtil.ntoc( A11765VxMaqGrp, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxMaqGrp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11765VxMaqGrp), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11765VxMaqGrp), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxMaqGrp_Jsonclick, 0, "", "", "", "", "", 1, edtVxMaqGrp_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArtMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxArtMaq.htm");
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
         Z7420VxArtCod = httpContext.cgiGet( "Z7420VxArtCod") ;
         Z11764VxFTecNr = (short)(localUtil.ctol( httpContext.cgiGet( "Z11764VxFTecNr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11765VxMaqGrp = localUtil.ctol( httpContext.cgiGet( "Z11765VxMaqGrp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A7420VxArtCod = httpContext.cgiGet( edtVxArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxFTecNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxFTecNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXFTECNR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxFTecNr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11764VxFTecNr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
         }
         else
         {
            A11764VxFTecNr = (short)(localUtil.ctol( httpContext.cgiGet( edtVxFTecNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxMaqGrp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxMaqGrp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXMAQGRP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxMaqGrp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11765VxMaqGrp = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
         }
         else
         {
            A11765VxMaqGrp = localUtil.ctol( httpContext.cgiGet( edtVxMaqGrp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A7420VxArtCod = httpContext.GetPar( "VxArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            A11764VxFTecNr = (short)(GXutil.lval( httpContext.GetPar( "VxFTecNr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
            A11765VxMaqGrp = GXutil.lval( httpContext.GetPar( "VxMaqGrp")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
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
            initAll1HW1653( ) ;
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
      disableAttributes1HW1653( ) ;
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

   public void confirm_1HW0( )
   {
      beforeValidate1HW1653( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HW1653( ) ;
         }
         else
         {
            checkExtendedTable1HW1653( ) ;
            if ( AnyError == 0 )
            {
               zm1HW1653( 2) ;
               zm1HW1653( 3) ;
            }
            closeExtendedTableCursors1HW1653( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HW0( ) ;
      }
   }

   public void resetCaption1HW0( )
   {
   }

   public void zm1HW1653( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z11764VxFTecNr = A11764VxFTecNr ;
         Z7420VxArtCod = A7420VxArtCod ;
         Z11765VxMaqGrp = A11765VxMaqGrp ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load1HW1653( )
   {
      /* Using cursor T01HW6 */
      pr_default.execute(4, new Object[] {A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1653 = (short)(1) ;
         zm1HW1653( -1) ;
      }
      pr_default.close(4);
      onLoadActions1HW1653( ) ;
   }

   public void onLoadActions1HW1653( )
   {
   }

   public void checkExtendedTable1HW1653( )
   {
      nIsDirty_1653 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01HW4 */
      pr_default.execute(2, new Object[] {A7420VxArtCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01HW5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Grupos de Máquinas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXMAQGRP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxMaqGrp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1HW1653( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A7420VxArtCod )
   {
      /* Using cursor T01HW7 */
      pr_default.execute(5, new Object[] {A7420VxArtCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( long A11765VxMaqGrp )
   {
      /* Using cursor T01HW8 */
      pr_default.execute(6, new Object[] {Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Grupos de Máquinas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXMAQGRP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxMaqGrp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1HW1653( )
   {
      /* Using cursor T01HW9 */
      pr_default.execute(7, new Object[] {A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1653 = (short)(1) ;
      }
      else
      {
         RcdFound1653 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HW3 */
      pr_default.execute(1, new Object[] {A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HW1653( 1) ;
         RcdFound1653 = (short)(1) ;
         A11764VxFTecNr = T01HW3_A11764VxFTecNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
         A7420VxArtCod = T01HW3_A7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A11765VxMaqGrp = T01HW3_A11765VxMaqGrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
         Z7420VxArtCod = A7420VxArtCod ;
         Z11764VxFTecNr = A11764VxFTecNr ;
         Z11765VxMaqGrp = A11765VxMaqGrp ;
         sMode1653 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HW1653( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1653 = (short)(0) ;
            initializeNonKey1HW1653( ) ;
         }
         Gx_mode = sMode1653 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1653 = (short)(0) ;
         initializeNonKey1HW1653( ) ;
         sMode1653 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1653 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HW1653( ) ;
      if ( RcdFound1653 == 0 )
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
      RcdFound1653 = (short)(0) ;
      /* Using cursor T01HW10 */
      pr_default.execute(8, new Object[] {A7420VxArtCod, A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Short.valueOf(A11764VxFTecNr), A7420VxArtCod, Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HW10_A7420VxArtCod[0], A7420VxArtCod) < 0 ) || ( GXutil.strcmp(T01HW10_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW10_A11764VxFTecNr[0] < A11764VxFTecNr ) || ( T01HW10_A11764VxFTecNr[0] == A11764VxFTecNr ) && ( GXutil.strcmp(T01HW10_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW10_A11765VxMaqGrp[0] < A11765VxMaqGrp ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HW10_A7420VxArtCod[0], A7420VxArtCod) > 0 ) || ( GXutil.strcmp(T01HW10_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW10_A11764VxFTecNr[0] > A11764VxFTecNr ) || ( T01HW10_A11764VxFTecNr[0] == A11764VxFTecNr ) && ( GXutil.strcmp(T01HW10_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW10_A11765VxMaqGrp[0] > A11765VxMaqGrp ) ) )
         {
            A7420VxArtCod = T01HW10_A7420VxArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            A11764VxFTecNr = T01HW10_A11764VxFTecNr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
            A11765VxMaqGrp = T01HW10_A11765VxMaqGrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
            RcdFound1653 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1653 = (short)(0) ;
      /* Using cursor T01HW11 */
      pr_default.execute(9, new Object[] {A7420VxArtCod, A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Short.valueOf(A11764VxFTecNr), A7420VxArtCod, Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HW11_A7420VxArtCod[0], A7420VxArtCod) > 0 ) || ( GXutil.strcmp(T01HW11_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW11_A11764VxFTecNr[0] > A11764VxFTecNr ) || ( T01HW11_A11764VxFTecNr[0] == A11764VxFTecNr ) && ( GXutil.strcmp(T01HW11_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW11_A11765VxMaqGrp[0] > A11765VxMaqGrp ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HW11_A7420VxArtCod[0], A7420VxArtCod) < 0 ) || ( GXutil.strcmp(T01HW11_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW11_A11764VxFTecNr[0] < A11764VxFTecNr ) || ( T01HW11_A11764VxFTecNr[0] == A11764VxFTecNr ) && ( GXutil.strcmp(T01HW11_A7420VxArtCod[0], A7420VxArtCod) == 0 ) && ( T01HW11_A11765VxMaqGrp[0] < A11765VxMaqGrp ) ) )
         {
            A7420VxArtCod = T01HW11_A7420VxArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            A11764VxFTecNr = T01HW11_A11764VxFTecNr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
            A11765VxMaqGrp = T01HW11_A11765VxMaqGrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
            RcdFound1653 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HW1653( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HW1653( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1653 == 1 )
         {
            if ( ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 ) || ( A11764VxFTecNr != Z11764VxFTecNr ) || ( A11765VxMaqGrp != Z11765VxMaqGrp ) )
            {
               A7420VxArtCod = Z7420VxArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
               A11764VxFTecNr = Z11764VxFTecNr ;
               httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
               A11765VxMaqGrp = Z11765VxMaqGrp ;
               httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXARTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1HW1653( ) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 ) || ( A11764VxFTecNr != Z11764VxFTecNr ) || ( A11765VxMaqGrp != Z11765VxMaqGrp ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HW1653( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXARTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1HW1653( ) ;
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
      if ( ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 ) || ( A11764VxFTecNr != Z11764VxFTecNr ) || ( A11765VxMaqGrp != Z11765VxMaqGrp ) )
      {
         A7420VxArtCod = Z7420VxArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A11764VxFTecNr = Z11764VxFTecNr ;
         httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
         A11765VxMaqGrp = Z11765VxMaqGrp ;
         httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
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
      getKey1HW1653( ) ;
      if ( RcdFound1653 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXARTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 ) || ( A11764VxFTecNr != Z11764VxFTecNr ) || ( A11765VxMaqGrp != Z11765VxMaqGrp ) )
         {
            A7420VxArtCod = Z7420VxArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            A11764VxFTecNr = Z11764VxFTecNr ;
            httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
            A11765VxMaqGrp = Z11765VxMaqGrp ;
            httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXARTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtCod_Internalname ;
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
         if ( ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 ) || ( A11764VxFTecNr != Z11764VxFTecNr ) || ( A11765VxMaqGrp != Z11765VxMaqGrp ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXARTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxartmaq");
   }

   public void insert_check( )
   {
      confirm_1HW0( ) ;
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
      if ( RcdFound1653 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
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
      scanStart1HW1653( ) ;
      if ( RcdFound1653 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1HW1653( ) ;
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
      if ( RcdFound1653 == 0 )
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
      if ( RcdFound1653 == 0 )
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
      scanStart1HW1653( ) ;
      if ( RcdFound1653 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1653 != 0 )
         {
            scanNext1HW1653( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1HW1653( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HW1653( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HW2 */
         pr_default.execute(0, new Object[] {A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Long.valueOf(A11765VxMaqGrp)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVxArtM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPVxArtM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HW1653( )
   {
      beforeValidate1HW1653( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HW1653( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HW1653( 0) ;
         checkOptimisticConcurrency1HW1653( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HW1653( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HW1653( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HW12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A11764VxFTecNr), A7420VxArtCod, Long.valueOf(A11765VxMaqGrp)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVxArtM");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1HW0( ) ;
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
            load1HW1653( ) ;
         }
         endLevel1HW1653( ) ;
      }
      closeExtendedTableCursors1HW1653( ) ;
   }

   public void update1HW1653( )
   {
      beforeValidate1HW1653( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HW1653( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HW1653( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HW1653( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HW1653( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPVxArtM */
                  deferredUpdate1HW1653( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HW0( ) ;
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
         endLevel1HW1653( ) ;
      }
      closeExtendedTableCursors1HW1653( ) ;
   }

   public void deferredUpdate1HW1653( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HW1653( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HW1653( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HW1653( ) ;
         afterConfirm1HW1653( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HW1653( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HW13 */
               pr_default.execute(11, new Object[] {A7420VxArtCod, Short.valueOf(A11764VxFTecNr), Long.valueOf(A11765VxMaqGrp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVxArtM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1653 == 0 )
                     {
                        initAll1HW1653( ) ;
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
                     resetCaption1HW0( ) ;
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
      sMode1653 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HW1653( ) ;
      Gx_mode = sMode1653 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HW1653( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1HW1653( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HW1653( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxartmaq");
         if ( AnyError == 0 )
         {
            confirmValues1HW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxartmaq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HW1653( )
   {
      /* Using cursor T01HW14 */
      pr_default.execute(12);
      RcdFound1653 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1653 = (short)(1) ;
         A7420VxArtCod = T01HW14_A7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A11764VxFTecNr = T01HW14_A11764VxFTecNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
         A11765VxMaqGrp = T01HW14_A11765VxMaqGrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HW1653( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1653 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1653 = (short)(1) ;
         A7420VxArtCod = T01HW14_A7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A11764VxFTecNr = T01HW14_A11764VxFTecNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
         A11765VxMaqGrp = T01HW14_A11765VxMaqGrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
      }
   }

   public void scanEnd1HW1653( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1HW1653( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HW1653( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HW1653( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HW1653( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HW1653( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HW1653( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HW1653( )
   {
      edtVxArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtCod_Enabled), 5, 0), true);
      edtVxFTecNr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxFTecNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxFTecNr_Enabled), 5, 0), true);
      edtVxMaqGrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxMaqGrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxMaqGrp_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HW1653( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HW0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxartmaq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11764VxFTecNr", GXutil.ltrim( localUtil.ntoc( Z11764VxFTecNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11765VxMaqGrp", GXutil.ltrim( localUtil.ntoc( Z11765VxMaqGrp, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tvxartmaq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxArtMaq" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Artículo/Grupo de Máquinas", "") ;
   }

   public void initializeNonKey1HW1653( )
   {
   }

   public void initAll1HW1653( )
   {
      A7420VxArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
      A11764VxFTecNr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11764VxFTecNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11764VxFTecNr), 4, 0));
      A11765VxMaqGrp = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11765VxMaqGrp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11765VxMaqGrp), 10, 0));
      initializeNonKey1HW1653( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251944478", true, true);
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
      httpContext.AddJavascriptSource("tvxartmaq.js", "?20261251944478", false, true);
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
      edtVxArtCod_Internalname = "VXARTCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxFTecNr_Internalname = "VXFTECNR" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxMaqGrp_Internalname = "VXMAQGRP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Artículo/Grupo de Máquinas", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxMaqGrp_Jsonclick = "" ;
      edtVxMaqGrp_Backcolor = (int)(0xFFFFFF) ;
      edtVxMaqGrp_Enabled = 1 ;
      edtVxFTecNr_Jsonclick = "" ;
      edtVxFTecNr_Backcolor = (int)(0xFFFFFF) ;
      edtVxFTecNr_Enabled = 1 ;
      edtVxArtCod_Jsonclick = "" ;
      edtVxArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01HW15 */
      pr_default.execute(13, new Object[] {A7420VxArtCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      /* Using cursor T01HW16 */
      pr_default.execute(14, new Object[] {Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Grupos de Máquinas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXMAQGRP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxMaqGrp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
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

   public void valid_Vxartcod( )
   {
      /* Using cursor T01HW15 */
      pr_default.execute(13, new Object[] {A7420VxArtCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VxArtic", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxmaqgrp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01HW16 */
      pr_default.execute(14, new Object[] {Long.valueOf(A11765VxMaqGrp)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Grupos de Máquinas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXMAQGRP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxMaqGrp_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11764VxFTecNr", GXutil.ltrim( localUtil.ntoc( Z11764VxFTecNr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11765VxMaqGrp", GXutil.ltrim( localUtil.ntoc( Z11765VxMaqGrp, (byte)(10), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_VXARTCOD","{handler:'valid_Vxartcod',iparms:[{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''}]");
      setEventMetadata("VALID_VXARTCOD",",oparms:[]}");
      setEventMetadata("VALID_VXFTECNR","{handler:'valid_Vxftecnr',iparms:[]");
      setEventMetadata("VALID_VXFTECNR",",oparms:[]}");
      setEventMetadata("VALID_VXMAQGRP","{handler:'valid_Vxmaqgrp',iparms:[{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''},{av:'A11764VxFTecNr',fld:'VXFTECNR',pic:'ZZZ9'},{av:'A11765VxMaqGrp',fld:'VXMAQGRP',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXMAQGRP",",oparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7420VxArtCod'},{av:'Z11764VxFTecNr'},{av:'Z11765VxMaqGrp'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z7420VxArtCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A7420VxArtCod = "" ;
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
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T01HW6_A11764VxFTecNr = new short[1] ;
      T01HW6_A7420VxArtCod = new String[] {""} ;
      T01HW6_A11765VxMaqGrp = new long[1] ;
      T01HW4_A7420VxArtCod = new String[] {""} ;
      T01HW5_A11765VxMaqGrp = new long[1] ;
      T01HW7_A7420VxArtCod = new String[] {""} ;
      T01HW8_A11765VxMaqGrp = new long[1] ;
      T01HW9_A7420VxArtCod = new String[] {""} ;
      T01HW9_A11764VxFTecNr = new short[1] ;
      T01HW9_A11765VxMaqGrp = new long[1] ;
      T01HW3_A11764VxFTecNr = new short[1] ;
      T01HW3_A7420VxArtCod = new String[] {""} ;
      T01HW3_A11765VxMaqGrp = new long[1] ;
      sMode1653 = "" ;
      T01HW10_A7420VxArtCod = new String[] {""} ;
      T01HW10_A11764VxFTecNr = new short[1] ;
      T01HW10_A11765VxMaqGrp = new long[1] ;
      T01HW11_A7420VxArtCod = new String[] {""} ;
      T01HW11_A11764VxFTecNr = new short[1] ;
      T01HW11_A11765VxMaqGrp = new long[1] ;
      T01HW2_A11764VxFTecNr = new short[1] ;
      T01HW2_A7420VxArtCod = new String[] {""} ;
      T01HW2_A11765VxMaqGrp = new long[1] ;
      T01HW14_A7420VxArtCod = new String[] {""} ;
      T01HW14_A11764VxFTecNr = new short[1] ;
      T01HW14_A11765VxMaqGrp = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01HW15_A7420VxArtCod = new String[] {""} ;
      T01HW16_A11765VxMaqGrp = new long[1] ;
      ZZ7420VxArtCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxartmaq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxartmaq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxartmaq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxartmaq__default(),
         new Object[] {
             new Object[] {
            T01HW2_A11764VxFTecNr, T01HW2_A7420VxArtCod, T01HW2_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW3_A11764VxFTecNr, T01HW3_A7420VxArtCod, T01HW3_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW4_A7420VxArtCod
            }
            , new Object[] {
            T01HW5_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW6_A11764VxFTecNr, T01HW6_A7420VxArtCod, T01HW6_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW7_A7420VxArtCod
            }
            , new Object[] {
            T01HW8_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW9_A7420VxArtCod, T01HW9_A11764VxFTecNr, T01HW9_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW10_A7420VxArtCod, T01HW10_A11764VxFTecNr, T01HW10_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW11_A7420VxArtCod, T01HW11_A11764VxFTecNr, T01HW11_A11765VxMaqGrp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HW14_A7420VxArtCod, T01HW14_A11764VxFTecNr, T01HW14_A11765VxMaqGrp
            }
            , new Object[] {
            T01HW15_A7420VxArtCod
            }
            , new Object[] {
            T01HW16_A11765VxMaqGrp
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z11764VxFTecNr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11764VxFTecNr ;
   private short RcdFound1653 ;
   private short nIsDirty_1653 ;
   private short ZZ11764VxFTecNr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxArtCod_Enabled ;
   private int edtVxFTecNr_Enabled ;
   private int edtVxMaqGrp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtVxMaqGrp_Backcolor ;
   private int edtVxFTecNr_Backcolor ;
   private int edtVxArtCod_Backcolor ;
   private long Z11765VxMaqGrp ;
   private long A11765VxMaqGrp ;
   private long ZZ11765VxMaqGrp ;
   private String sPrefix ;
   private String Z7420VxArtCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A7420VxArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxArtCod_Internalname ;
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
   private String edtVxArtCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxFTecNr_Internalname ;
   private String edtVxFTecNr_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxMaqGrp_Internalname ;
   private String edtVxMaqGrp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1653 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ7420VxArtCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private IDataStoreProvider pr_default ;
   private short[] T01HW6_A11764VxFTecNr ;
   private String[] T01HW6_A7420VxArtCod ;
   private long[] T01HW6_A11765VxMaqGrp ;
   private String[] T01HW4_A7420VxArtCod ;
   private long[] T01HW5_A11765VxMaqGrp ;
   private String[] T01HW7_A7420VxArtCod ;
   private long[] T01HW8_A11765VxMaqGrp ;
   private String[] T01HW9_A7420VxArtCod ;
   private short[] T01HW9_A11764VxFTecNr ;
   private long[] T01HW9_A11765VxMaqGrp ;
   private short[] T01HW3_A11764VxFTecNr ;
   private String[] T01HW3_A7420VxArtCod ;
   private long[] T01HW3_A11765VxMaqGrp ;
   private String[] T01HW10_A7420VxArtCod ;
   private short[] T01HW10_A11764VxFTecNr ;
   private long[] T01HW10_A11765VxMaqGrp ;
   private String[] T01HW11_A7420VxArtCod ;
   private short[] T01HW11_A11764VxFTecNr ;
   private long[] T01HW11_A11765VxMaqGrp ;
   private short[] T01HW2_A11764VxFTecNr ;
   private String[] T01HW2_A7420VxArtCod ;
   private long[] T01HW2_A11765VxMaqGrp ;
   private String[] T01HW14_A7420VxArtCod ;
   private short[] T01HW14_A11764VxFTecNr ;
   private long[] T01HW14_A11765VxMaqGrp ;
   private String[] T01HW15_A7420VxArtCod ;
   private long[] T01HW16_A11765VxMaqGrp ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxartmaq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxartmaq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxartmaq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxartmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HW2", "SELECT VxFTecNr, VxArtCod, VxMaqGrp FROM TXPVxArtM WHERE VxArtCod = ? AND VxFTecNr = ? AND VxMaqGrp = ?  FOR UPDATE OF VxFTecNr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW3", "SELECT VxFTecNr, VxArtCod, VxMaqGrp FROM TXPVxArtM WHERE VxArtCod = ? AND VxFTecNr = ? AND VxMaqGrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW4", "SELECT ArtCod FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW5", "SELECT VxMaqGrp FROM TXPVxMaqG WHERE VxMaqGrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW6", "SELECT /*+ FIRST_ROWS(100) */ TM1.VxFTecNr, TM1.VxArtCod, TM1.VxMaqGrp FROM TXPVxArtM TM1 WHERE TM1.VxArtCod = ? and TM1.VxFTecNr = ? and TM1.VxMaqGrp = ? ORDER BY TM1.VxArtCod, TM1.VxFTecNr, TM1.VxMaqGrp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW7", "SELECT ArtCod FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW8", "SELECT VxMaqGrp FROM TXPVxMaqG WHERE VxMaqGrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW9", "SELECT /*+ FIRST_ROWS(1) */ VxArtCod, VxFTecNr, VxMaqGrp FROM TXPVxArtM WHERE VxArtCod = ? AND VxFTecNr = ? AND VxMaqGrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ VxArtCod, VxFTecNr, VxMaqGrp FROM TXPVxArtM WHERE ( VxArtCod > ? or VxArtCod = ? and VxFTecNr > ? or VxFTecNr = ? and VxArtCod = ? and VxMaqGrp > ?) ORDER BY VxArtCod, VxFTecNr, VxMaqGrp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HW11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ VxArtCod, VxFTecNr, VxMaqGrp FROM TXPVxArtM WHERE ( VxArtCod < ? or VxArtCod = ? and VxFTecNr < ? or VxFTecNr = ? and VxArtCod = ? and VxMaqGrp < ?) ORDER BY VxArtCod DESC, VxFTecNr DESC, VxMaqGrp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HW12", "INSERT INTO TXPVxArtM(VxFTecNr, VxArtCod, VxMaqGrp) VALUES(?, ?, ?)", GX_NOMASK, "TXPVxArtM")
         ,new UpdateCursor("T01HW13", "DELETE FROM TXPVxArtM  WHERE VxArtCod = ? AND VxFTecNr = ? AND VxMaqGrp = ?", GX_NOMASK, "TXPVxArtM")
         ,new ForEachCursor("T01HW14", "SELECT /*+ FIRST_ROWS(100) */ VxArtCod, VxFTecNr, VxMaqGrp FROM TXPVxArtM ORDER BY VxArtCod, VxFTecNr, VxMaqGrp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW15", "SELECT ArtCod FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HW16", "SELECT VxMaqGrp FROM TXPVxMaqG WHERE VxMaqGrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

