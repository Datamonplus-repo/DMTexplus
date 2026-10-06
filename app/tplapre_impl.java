package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplapre_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Preparación", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_25 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_25"))) ;
      nGXsfl_25_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_25_idx"))) ;
      sGXsfl_25_idx = httpContext.GetPar( "sGXsfl_25_idx") ;
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

   public tplapre_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplapre_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplapre_impl.class ));
   }

   public tplapre_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPlaPre.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaPre.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol25( ) ;
      nGXsfl_25_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount879 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_879 = (short)(1) ;
            scanStartSL879( ) ;
            while ( RcdFound879 != 0 )
            {
               init_level_properties879( ) ;
               getByPrimaryKeySL879( ) ;
               addRowSL879( ) ;
               scanNextSL879( ) ;
            }
            scanEndSL879( ) ;
            nBlankRcdCount879 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalSL879( ) ;
         standaloneModalSL879( ) ;
         sMode879 = Gx_mode ;
         while ( nGXsfl_25_idx < nRC_GXsfl_25 )
         {
            bGXsfl_25_Refreshing = true ;
            readRowSL879( ) ;
            edtavnRcdDeleted_879_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_879_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_879_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_879_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            edtPlaPreOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPREORD_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaPreOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreOrd_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            edtPlaPreCHP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECHP_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCHP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCHP_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            edtPlaPreCFP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECFP_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCFP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCFP_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            edtPlaPreCHA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECHA_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCHA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCHA_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            edtPlaPreCFA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECFA_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCFA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCFA_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            edtPlaPreTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRETIE_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaPreTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreTie_Enabled), 5, 0), !bGXsfl_25_Refreshing);
            if ( ( nRcdExists_879 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalSL879( ) ;
            }
            sendRowSL879( ) ;
            bGXsfl_25_Refreshing = false ;
         }
         Gx_mode = sMode879 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount879 = (short)(5) ;
         nRcdExists_879 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartSL879( ) ;
            while ( RcdFound879 != 0 )
            {
               sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_25879( ) ;
               init_level_properties879( ) ;
               standaloneNotModalSL879( ) ;
               getByPrimaryKeySL879( ) ;
               standaloneModalSL879( ) ;
               addRowSL879( ) ;
               scanNextSL879( ) ;
            }
            scanEndSL879( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode879 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_25879( ) ;
      initAllSL879( ) ;
      init_level_properties879( ) ;
      nRcdExists_879 = (short)(0) ;
      nIsMod_879 = (short)(0) ;
      nRcdDeleted_879 = (short)(0) ;
      nBlankRcdCount879 = (short)(nBlankRcdUsr879+nBlankRcdCount879) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount879 > 0 )
      {
         standaloneNotModalSL879( ) ;
         standaloneModalSL879( ) ;
         addRowSL879( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPlaPreOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount879 = (short)(nBlankRcdCount879-1) ;
      }
      Gx_mode = sMode879 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaPre.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPlaPre.htm");
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
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_25 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            initAllSL27( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_879_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_879_Enabled), 5, 0), !bGXsfl_25_Refreshing);
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
      disableAttributesSL27( ) ;
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

   public void confirm_SL0( )
   {
      beforeValidateSL27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsSL27( ) ;
         }
         else
         {
            checkExtendedTableSL27( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursorsSL27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode27 = Gx_mode ;
         confirm_SL879( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode27 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesSL0( ) ;
      }
   }

   public void confirm_SL879( )
   {
      nGXsfl_25_idx = 0 ;
      while ( nGXsfl_25_idx < nRC_GXsfl_25 )
      {
         readRowSL879( ) ;
         if ( ( nRcdExists_879 != 0 ) || ( nIsMod_879 != 0 ) )
         {
            getKeySL879( ) ;
            if ( ( nRcdExists_879 == 0 ) && ( nRcdDeleted_879 == 0 ) )
            {
               if ( RcdFound879 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateSL879( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableSL879( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsSL879( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PLAPREORD_" + sGXsfl_25_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPlaPreOrd_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound879 != 0 )
               {
                  if ( nRcdDeleted_879 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeySL879( ) ;
                     loadSL879( ) ;
                     beforeValidateSL879( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsSL879( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_879 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateSL879( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableSL879( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsSL879( ) ;
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
                  if ( nRcdDeleted_879 == 0 )
                  {
                     GXCCtl = "PLAPREORD_" + sGXsfl_25_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaPreOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_879_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaPreOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A6007PlaPreOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaPreCHP_Internalname, GXutil.rtrim( A6027PlaPreCHP)) ;
         httpContext.changePostValue( edtPlaPreCFP_Internalname, GXutil.rtrim( A6028PlaPreCFP)) ;
         httpContext.changePostValue( edtPlaPreCHA_Internalname, GXutil.rtrim( A6029PlaPreCHA)) ;
         httpContext.changePostValue( edtPlaPreCFA_Internalname, GXutil.rtrim( A6030PlaPreCFA)) ;
         httpContext.changePostValue( edtPlaPreTie_Internalname, GXutil.ltrim( localUtil.ntoc( A6010PlaPreTie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6007PlaPreOrd_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( Z6007PlaPreOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6027PlaPreCHP_"+sGXsfl_25_idx, GXutil.rtrim( Z6027PlaPreCHP)) ;
         httpContext.changePostValue( "ZT_"+"Z6028PlaPreCFP_"+sGXsfl_25_idx, GXutil.rtrim( Z6028PlaPreCFP)) ;
         httpContext.changePostValue( "ZT_"+"Z6029PlaPreCHA_"+sGXsfl_25_idx, GXutil.rtrim( Z6029PlaPreCHA)) ;
         httpContext.changePostValue( "ZT_"+"Z6030PlaPreCFA_"+sGXsfl_25_idx, GXutil.rtrim( Z6030PlaPreCFA)) ;
         httpContext.changePostValue( "ZT_"+"Z6010PlaPreTie_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( Z6010PlaPreTie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_879_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_879_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_879_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_879 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_879_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_879_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPREORD_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECHP_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECFP_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECHA_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECFA_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRETIE_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionSL0( )
   {
   }

   public void zmSL27( int GX_JID )
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
         Z396EmprCod = A396EmprCod ;
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

   public void loadSL27( )
   {
      /* Using cursor T00SL6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound27 = (short)(1) ;
         zmSL27( -1) ;
      }
      pr_default.close(4);
      onLoadActionsSL27( ) ;
   }

   public void onLoadActionsSL27( )
   {
   }

   public void checkExtendedTableSL27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsSL27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeySL27( )
   {
      /* Using cursor T00SL7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00SL5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmSL27( 1) ;
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00SL5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadSL27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKeySL27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKeySL27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeySL27( ) ;
      if ( RcdFound27 == 0 )
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
      RcdFound27 = (short)(0) ;
      /* Using cursor T00SL8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00SL8_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00SL8_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A396EmprCod = T00SL8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T00SL9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00SL9_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00SL9_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A396EmprCod = T00SL9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeySL27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertSL27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateSL27( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertSL27( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertSL27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKeySL27( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplapre");
   }

   public void insert_check( )
   {
      confirm_SL0( ) ;
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
      if ( RcdFound27 == 0 )
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
      scanStartSL27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndSL27( ) ;
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
      if ( RcdFound27 == 0 )
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
      if ( RcdFound27 == 0 )
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
      scanStartSL27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound27 != 0 )
         {
            scanNextSL27( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndSL27( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencySL27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SL4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSL27( )
   {
      beforeValidateSL27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSL27( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSL27( 0) ;
         checkOptimisticConcurrencySL27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSL27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSL27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SL10 */
                  pr_default.execute(8, new Object[] {A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevelSL27( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionSL0( ) ;
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
            loadSL27( ) ;
         }
         endLevelSL27( ) ;
      }
      closeExtendedTableCursorsSL27( ) ;
   }

   public void updateSL27( )
   {
      beforeValidateSL27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSL27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySL27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSL27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateSL27( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPEMPRES */
                  deferredUpdateSL27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelSL27( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionSL0( ) ;
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
         endLevelSL27( ) ;
      }
      closeExtendedTableCursorsSL27( ) ;
   }

   public void deferredUpdateSL27( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSL27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySL27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSL27( ) ;
         afterConfirmSL27( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSL27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SL11 */
               pr_default.execute(9, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound27 == 0 )
                     {
                        initAllSL27( ) ;
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
                     resetCaptionSL0( ) ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSL27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSL27( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00SL12 */
         pr_default.execute(10, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00SL13 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00SL14 */
         pr_default.execute(12, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00SL15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00SL16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00SL17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00SL18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00SL19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00SL20 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00SL21 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00SL22 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00SL23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPRESENTANTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00SL24 */
         pr_default.execute(22, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00SL25 */
         pr_default.execute(23, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maestro de Parametros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00SL26 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Código de calidad", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00SL27 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00SL28 */
         pr_default.execute(26, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGKSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00SL29 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DKGSLA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00SL30 */
         pr_default.execute(28, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00SL31 */
         pr_default.execute(29, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00SL32 */
         pr_default.execute(30, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00SL33 */
         pr_default.execute(31, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00SL34 */
         pr_default.execute(32, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00SL35 */
         pr_default.execute(33, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00SL36 */
         pr_default.execute(34, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00SL37 */
         pr_default.execute(35, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LBOTAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00SL38 */
         pr_default.execute(36, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPBOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00SL39 */
         pr_default.execute(37, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00SL40 */
         pr_default.execute(38, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00SL41 */
         pr_default.execute(39, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00SL42 */
         pr_default.execute(40, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00SL43 */
         pr_default.execute(41, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00SL44 */
         pr_default.execute(42, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00SL45 */
         pr_default.execute(43, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00SL46 */
         pr_default.execute(44, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00SL47 */
         pr_default.execute(45, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NUMTEX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00SL48 */
         pr_default.execute(46, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00SL49 */
         pr_default.execute(47, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00SL50 */
         pr_default.execute(48, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00SL51 */
         pr_default.execute(49, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00SL52 */
         pr_default.execute(50, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENVTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00SL53 */
         pr_default.execute(51, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00SL54 */
         pr_default.execute(52, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00SL55 */
         pr_default.execute(53, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00SL56 */
         pr_default.execute(54, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00SL57 */
         pr_default.execute(55, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00SL58 */
         pr_default.execute(56, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00SL59 */
         pr_default.execute(57, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00SL60 */
         pr_default.execute(58, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00SL61 */
         pr_default.execute(59, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MANUFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00SL62 */
         pr_default.execute(60, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00SL63 */
         pr_default.execute(61, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00SL64 */
         pr_default.execute(62, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00SL65 */
         pr_default.execute(63, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00SL66 */
         pr_default.execute(64, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T00SL67 */
         pr_default.execute(65, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T00SL68 */
         pr_default.execute(66, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARLAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T00SL69 */
         pr_default.execute(67, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T00SL70 */
         pr_default.execute(68, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T00SL71 */
         pr_default.execute(69, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZONGEO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T00SL72 */
         pr_default.execute(70, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T00SL73 */
         pr_default.execute(71, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T00SL74 */
         pr_default.execute(72, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T00SL75 */
         pr_default.execute(73, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTMAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T00SL76 */
         pr_default.execute(74, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TUBOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T00SL77 */
         pr_default.execute(75, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T00SL78 */
         pr_default.execute(76, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T00SL79 */
         pr_default.execute(77, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DESTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T00SL80 */
         pr_default.execute(78, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTRAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T00SL81 */
         pr_default.execute(79, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T00SL82 */
         pr_default.execute(80, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LECTOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T00SL83 */
         pr_default.execute(81, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TURNOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T00SL84 */
         pr_default.execute(82, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T00SL85 */
         pr_default.execute(83, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T00SL86 */
         pr_default.execute(84, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T00SL87 */
         pr_default.execute(85, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T00SL88 */
         pr_default.execute(86, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T00SL89 */
         pr_default.execute(87, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T00SL90 */
         pr_default.execute(88, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T00SL91 */
         pr_default.execute(89, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T00SL92 */
         pr_default.execute(90, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UNMEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T00SL93 */
         pr_default.execute(91, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TRANSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T00SL94 */
         pr_default.execute(92, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPVAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T00SL95 */
         pr_default.execute(93, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPUNI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T00SL96 */
         pr_default.execute(94, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T00SL97 */
         pr_default.execute(95, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T00SL98 */
         pr_default.execute(96, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T00SL99 */
         pr_default.execute(97, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T00SL100 */
         pr_default.execute(98, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T00SL101 */
         pr_default.execute(99, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T00SL102 */
         pr_default.execute(100, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T00SL103 */
         pr_default.execute(101, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T00SL104 */
         pr_default.execute(102, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T00SL105 */
         pr_default.execute(103, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T00SL106 */
         pr_default.execute(104, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T00SL107 */
         pr_default.execute(105, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T00SL108 */
         pr_default.execute(106, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T00SL109 */
         pr_default.execute(107, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPERAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T00SL110 */
         pr_default.execute(108, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T00SL111 */
         pr_default.execute(109, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATICE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor T00SL112 */
         pr_default.execute(110, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQUIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor T00SL113 */
         pr_default.execute(111, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INTENS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor T00SL114 */
         pr_default.execute(112, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor T00SL115 */
         pr_default.execute(113, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRUOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor T00SL116 */
         pr_default.execute(114, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor T00SL117 */
         pr_default.execute(115, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUFAM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor T00SL118 */
         pr_default.execute(116, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor T00SL119 */
         pr_default.execute(117, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T00SL120 */
         pr_default.execute(118, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T00SL121 */
         pr_default.execute(119, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EMPLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T00SL122 */
         pr_default.execute(120, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T00SL123 */
         pr_default.execute(121, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T00SL124 */
         pr_default.execute(122, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T00SL125 */
         pr_default.execute(123, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T00SL126 */
         pr_default.execute(124, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T00SL127 */
         pr_default.execute(125, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
         /* Using cursor T00SL128 */
         pr_default.execute(126, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(126) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(126);
         /* Using cursor T00SL129 */
         pr_default.execute(127, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(127) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CIETIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(127);
         /* Using cursor T00SL130 */
         pr_default.execute(128, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(128) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(128);
         /* Using cursor T00SL131 */
         pr_default.execute(129, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(129) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(129);
         /* Using cursor T00SL132 */
         pr_default.execute(130, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(130) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(130);
         /* Using cursor T00SL133 */
         pr_default.execute(131, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(131) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(131);
         /* Using cursor T00SL134 */
         pr_default.execute(132, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(132) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(132);
      }
   }

   public void processNestedLevelSL879( )
   {
      nGXsfl_25_idx = 0 ;
      while ( nGXsfl_25_idx < nRC_GXsfl_25 )
      {
         readRowSL879( ) ;
         if ( ( nRcdExists_879 != 0 ) || ( nIsMod_879 != 0 ) )
         {
            standaloneNotModalSL879( ) ;
            getKeySL879( ) ;
            if ( ( nRcdExists_879 == 0 ) && ( nRcdDeleted_879 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertSL879( ) ;
            }
            else
            {
               if ( RcdFound879 != 0 )
               {
                  if ( ( nRcdDeleted_879 != 0 ) && ( nRcdExists_879 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteSL879( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_879 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateSL879( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_879 == 0 )
                  {
                     GXCCtl = "PLAPREORD_" + sGXsfl_25_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaPreOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_879_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaPreOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A6007PlaPreOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaPreCHP_Internalname, GXutil.rtrim( A6027PlaPreCHP)) ;
         httpContext.changePostValue( edtPlaPreCFP_Internalname, GXutil.rtrim( A6028PlaPreCFP)) ;
         httpContext.changePostValue( edtPlaPreCHA_Internalname, GXutil.rtrim( A6029PlaPreCHA)) ;
         httpContext.changePostValue( edtPlaPreCFA_Internalname, GXutil.rtrim( A6030PlaPreCFA)) ;
         httpContext.changePostValue( edtPlaPreTie_Internalname, GXutil.ltrim( localUtil.ntoc( A6010PlaPreTie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6007PlaPreOrd_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( Z6007PlaPreOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6027PlaPreCHP_"+sGXsfl_25_idx, GXutil.rtrim( Z6027PlaPreCHP)) ;
         httpContext.changePostValue( "ZT_"+"Z6028PlaPreCFP_"+sGXsfl_25_idx, GXutil.rtrim( Z6028PlaPreCFP)) ;
         httpContext.changePostValue( "ZT_"+"Z6029PlaPreCHA_"+sGXsfl_25_idx, GXutil.rtrim( Z6029PlaPreCHA)) ;
         httpContext.changePostValue( "ZT_"+"Z6030PlaPreCFA_"+sGXsfl_25_idx, GXutil.rtrim( Z6030PlaPreCFA)) ;
         httpContext.changePostValue( "ZT_"+"Z6010PlaPreTie_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( Z6010PlaPreTie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_879_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_879_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_879_"+sGXsfl_25_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_879 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_879_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_879_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPREORD_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECHP_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECFP_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECHA_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRECFA_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAPRETIE_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllSL879( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_879 = (short)(0) ;
      nIsMod_879 = (short)(0) ;
      nRcdDeleted_879 = (short)(0) ;
   }

   public void processLevelSL27( )
   {
      /* Save parent mode. */
      sMode27 = Gx_mode ;
      processNestedLevelSL879( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelSL27( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteSL27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplapre");
         if ( AnyError == 0 )
         {
            confirmValuesSL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplapre");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartSL27( )
   {
      /* Using cursor T00SL135 */
      pr_default.execute(133);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(133) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00SL135_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSL27( )
   {
      /* Scan next routine */
      pr_default.readNext(133);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(133) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00SL135_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void scanEndSL27( )
   {
      pr_default.close(133);
   }

   public void afterConfirmSL27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSL27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSL27( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSL27( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSL27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSL27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSL27( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void zmSL879( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6027PlaPreCHP = T00SL3_A6027PlaPreCHP[0] ;
            Z6028PlaPreCFP = T00SL3_A6028PlaPreCFP[0] ;
            Z6029PlaPreCHA = T00SL3_A6029PlaPreCHA[0] ;
            Z6030PlaPreCFA = T00SL3_A6030PlaPreCFA[0] ;
            Z6010PlaPreTie = T00SL3_A6010PlaPreTie[0] ;
         }
         else
         {
            Z6027PlaPreCHP = A6027PlaPreCHP ;
            Z6028PlaPreCFP = A6028PlaPreCFP ;
            Z6029PlaPreCHA = A6029PlaPreCHA ;
            Z6030PlaPreCFA = A6030PlaPreCFA ;
            Z6010PlaPreTie = A6010PlaPreTie ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z396EmprCod = A396EmprCod ;
         Z6007PlaPreOrd = A6007PlaPreOrd ;
         Z6027PlaPreCHP = A6027PlaPreCHP ;
         Z6028PlaPreCFP = A6028PlaPreCFP ;
         Z6029PlaPreCHA = A6029PlaPreCHA ;
         Z6030PlaPreCFA = A6030PlaPreCFA ;
         Z6010PlaPreTie = A6010PlaPreTie ;
      }
   }

   public void standaloneNotModalSL879( )
   {
   }

   public void standaloneModalSL879( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPlaPreOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaPreOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreOrd_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      }
      else
      {
         edtPlaPreOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaPreOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreOrd_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      }
   }

   public void loadSL879( )
   {
      /* Using cursor T00SL136 */
      pr_default.execute(134, new Object[] {A396EmprCod, Integer.valueOf(A6007PlaPreOrd)});
      if ( (pr_default.getStatus(134) != 101) )
      {
         RcdFound879 = (short)(1) ;
         A6027PlaPreCHP = T00SL136_A6027PlaPreCHP[0] ;
         n6027PlaPreCHP = T00SL136_n6027PlaPreCHP[0] ;
         A6028PlaPreCFP = T00SL136_A6028PlaPreCFP[0] ;
         n6028PlaPreCFP = T00SL136_n6028PlaPreCFP[0] ;
         A6029PlaPreCHA = T00SL136_A6029PlaPreCHA[0] ;
         n6029PlaPreCHA = T00SL136_n6029PlaPreCHA[0] ;
         A6030PlaPreCFA = T00SL136_A6030PlaPreCFA[0] ;
         n6030PlaPreCFA = T00SL136_n6030PlaPreCFA[0] ;
         A6010PlaPreTie = T00SL136_A6010PlaPreTie[0] ;
         n6010PlaPreTie = T00SL136_n6010PlaPreTie[0] ;
         zmSL879( -2) ;
      }
      pr_default.close(134);
      onLoadActionsSL879( ) ;
   }

   public void onLoadActionsSL879( )
   {
   }

   public void checkExtendedTableSL879( )
   {
      nIsDirty_879 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalSL879( ) ;
   }

   public void closeExtendedTableCursorsSL879( )
   {
   }

   public void enableDisableSL879( )
   {
   }

   public void getKeySL879( )
   {
      /* Using cursor T00SL137 */
      pr_default.execute(135, new Object[] {A396EmprCod, Integer.valueOf(A6007PlaPreOrd)});
      if ( (pr_default.getStatus(135) != 101) )
      {
         RcdFound879 = (short)(1) ;
      }
      else
      {
         RcdFound879 = (short)(0) ;
      }
      pr_default.close(135);
   }

   public void getByPrimaryKeySL879( )
   {
      /* Using cursor T00SL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6007PlaPreOrd)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmSL879( 2) ;
         RcdFound879 = (short)(1) ;
         initializeNonKeySL879( ) ;
         A6007PlaPreOrd = T00SL3_A6007PlaPreOrd[0] ;
         A6027PlaPreCHP = T00SL3_A6027PlaPreCHP[0] ;
         n6027PlaPreCHP = T00SL3_n6027PlaPreCHP[0] ;
         A6028PlaPreCFP = T00SL3_A6028PlaPreCFP[0] ;
         n6028PlaPreCFP = T00SL3_n6028PlaPreCFP[0] ;
         A6029PlaPreCHA = T00SL3_A6029PlaPreCHA[0] ;
         n6029PlaPreCHA = T00SL3_n6029PlaPreCHA[0] ;
         A6030PlaPreCFA = T00SL3_A6030PlaPreCFA[0] ;
         n6030PlaPreCFA = T00SL3_n6030PlaPreCFA[0] ;
         A6010PlaPreTie = T00SL3_A6010PlaPreTie[0] ;
         n6010PlaPreTie = T00SL3_n6010PlaPreTie[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6007PlaPreOrd = A6007PlaPreOrd ;
         sMode879 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSL879( ) ;
         loadSL879( ) ;
         Gx_mode = sMode879 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound879 = (short)(0) ;
         initializeNonKeySL879( ) ;
         sMode879 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSL879( ) ;
         Gx_mode = sMode879 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesSL879( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencySL879( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6007PlaPreOrd)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaPre"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6027PlaPreCHP, T00SL2_A6027PlaPreCHP[0]) != 0 ) || ( GXutil.strcmp(Z6028PlaPreCFP, T00SL2_A6028PlaPreCFP[0]) != 0 ) || ( GXutil.strcmp(Z6029PlaPreCHA, T00SL2_A6029PlaPreCHA[0]) != 0 ) || ( GXutil.strcmp(Z6030PlaPreCFA, T00SL2_A6030PlaPreCFA[0]) != 0 ) || ( Z6010PlaPreTie != T00SL2_A6010PlaPreTie[0] ) )
         {
            if ( GXutil.strcmp(Z6027PlaPreCHP, T00SL2_A6027PlaPreCHP[0]) != 0 )
            {
               GXutil.writeLogln("tplapre:[seudo value changed for attri]"+"PlaPreCHP");
               GXutil.writeLogRaw("Old: ",Z6027PlaPreCHP);
               GXutil.writeLogRaw("Current: ",T00SL2_A6027PlaPreCHP[0]);
            }
            if ( GXutil.strcmp(Z6028PlaPreCFP, T00SL2_A6028PlaPreCFP[0]) != 0 )
            {
               GXutil.writeLogln("tplapre:[seudo value changed for attri]"+"PlaPreCFP");
               GXutil.writeLogRaw("Old: ",Z6028PlaPreCFP);
               GXutil.writeLogRaw("Current: ",T00SL2_A6028PlaPreCFP[0]);
            }
            if ( GXutil.strcmp(Z6029PlaPreCHA, T00SL2_A6029PlaPreCHA[0]) != 0 )
            {
               GXutil.writeLogln("tplapre:[seudo value changed for attri]"+"PlaPreCHA");
               GXutil.writeLogRaw("Old: ",Z6029PlaPreCHA);
               GXutil.writeLogRaw("Current: ",T00SL2_A6029PlaPreCHA[0]);
            }
            if ( GXutil.strcmp(Z6030PlaPreCFA, T00SL2_A6030PlaPreCFA[0]) != 0 )
            {
               GXutil.writeLogln("tplapre:[seudo value changed for attri]"+"PlaPreCFA");
               GXutil.writeLogRaw("Old: ",Z6030PlaPreCFA);
               GXutil.writeLogRaw("Current: ",T00SL2_A6030PlaPreCFA[0]);
            }
            if ( Z6010PlaPreTie != T00SL2_A6010PlaPreTie[0] )
            {
               GXutil.writeLogln("tplapre:[seudo value changed for attri]"+"PlaPreTie");
               GXutil.writeLogRaw("Old: ",Z6010PlaPreTie);
               GXutil.writeLogRaw("Current: ",T00SL2_A6010PlaPreTie[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPlaPre"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSL879( )
   {
      beforeValidateSL879( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSL879( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSL879( 0) ;
         checkOptimisticConcurrencySL879( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSL879( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSL879( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SL138 */
                  pr_default.execute(136, new Object[] {A396EmprCod, Integer.valueOf(A6007PlaPreOrd), Boolean.valueOf(n6027PlaPreCHP), A6027PlaPreCHP, Boolean.valueOf(n6028PlaPreCFP), A6028PlaPreCFP, Boolean.valueOf(n6029PlaPreCHA), A6029PlaPreCHA, Boolean.valueOf(n6030PlaPreCFA), A6030PlaPreCFA, Boolean.valueOf(n6010PlaPreTie), Short.valueOf(A6010PlaPreTie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaPre");
                  if ( (pr_default.getStatus(136) == 1) )
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
            loadSL879( ) ;
         }
         endLevelSL879( ) ;
      }
      closeExtendedTableCursorsSL879( ) ;
   }

   public void updateSL879( )
   {
      beforeValidateSL879( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSL879( ) ;
      }
      if ( ( nIsMod_879 != 0 ) || ( nIsDirty_879 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencySL879( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmSL879( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateSL879( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00SL139 */
                     pr_default.execute(137, new Object[] {Boolean.valueOf(n6027PlaPreCHP), A6027PlaPreCHP, Boolean.valueOf(n6028PlaPreCFP), A6028PlaPreCFP, Boolean.valueOf(n6029PlaPreCHA), A6029PlaPreCHA, Boolean.valueOf(n6030PlaPreCFA), A6030PlaPreCFA, Boolean.valueOf(n6010PlaPreTie), Short.valueOf(A6010PlaPreTie), A396EmprCod, Integer.valueOf(A6007PlaPreOrd)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaPre");
                     if ( (pr_default.getStatus(137) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaPre"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateSL879( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeySL879( ) ;
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
            endLevelSL879( ) ;
         }
      }
      closeExtendedTableCursorsSL879( ) ;
   }

   public void deferredUpdateSL879( )
   {
   }

   public void deleteSL879( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSL879( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySL879( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSL879( ) ;
         afterConfirmSL879( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSL879( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SL140 */
               pr_default.execute(138, new Object[] {A396EmprCod, Integer.valueOf(A6007PlaPreOrd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaPre");
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
      sMode879 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSL879( ) ;
      Gx_mode = sMode879 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSL879( )
   {
      standaloneModalSL879( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelSL879( )
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

   public void scanStartSL879( )
   {
      /* Scan By routine */
      /* Using cursor T00SL141 */
      pr_default.execute(139, new Object[] {A396EmprCod});
      RcdFound879 = (short)(0) ;
      if ( (pr_default.getStatus(139) != 101) )
      {
         RcdFound879 = (short)(1) ;
         A6007PlaPreOrd = T00SL141_A6007PlaPreOrd[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSL879( )
   {
      /* Scan next routine */
      pr_default.readNext(139);
      RcdFound879 = (short)(0) ;
      if ( (pr_default.getStatus(139) != 101) )
      {
         RcdFound879 = (short)(1) ;
         A6007PlaPreOrd = T00SL141_A6007PlaPreOrd[0] ;
      }
   }

   public void scanEndSL879( )
   {
      pr_default.close(139);
   }

   public void afterConfirmSL879( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSL879( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSL879( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSL879( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSL879( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSL879( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSL879( )
   {
      edtPlaPreOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreOrd_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtPlaPreCHP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCHP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCHP_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtPlaPreCFP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCFP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCFP_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtPlaPreCHA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCHA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCHA_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtPlaPreCFA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreCFA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreCFA_Enabled), 5, 0), !bGXsfl_25_Refreshing);
      edtPlaPreTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreTie_Enabled), 5, 0), !bGXsfl_25_Refreshing);
   }

   public void send_integrity_lvl_hashesSL879( )
   {
   }

   public void send_integrity_lvl_hashesSL27( )
   {
   }

   public void subsflControlProps_25879( )
   {
      edtavnRcdDeleted_879_Internalname = "vNRCDDELETED_879_"+sGXsfl_25_idx ;
      edtPlaPreOrd_Internalname = "PLAPREORD_"+sGXsfl_25_idx ;
      edtPlaPreCHP_Internalname = "PLAPRECHP_"+sGXsfl_25_idx ;
      edtPlaPreCFP_Internalname = "PLAPRECFP_"+sGXsfl_25_idx ;
      edtPlaPreCHA_Internalname = "PLAPRECHA_"+sGXsfl_25_idx ;
      edtPlaPreCFA_Internalname = "PLAPRECFA_"+sGXsfl_25_idx ;
      edtPlaPreTie_Internalname = "PLAPRETIE_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_25879( )
   {
      edtavnRcdDeleted_879_Internalname = "vNRCDDELETED_879_"+sGXsfl_25_fel_idx ;
      edtPlaPreOrd_Internalname = "PLAPREORD_"+sGXsfl_25_fel_idx ;
      edtPlaPreCHP_Internalname = "PLAPRECHP_"+sGXsfl_25_fel_idx ;
      edtPlaPreCFP_Internalname = "PLAPRECFP_"+sGXsfl_25_fel_idx ;
      edtPlaPreCHA_Internalname = "PLAPRECHA_"+sGXsfl_25_fel_idx ;
      edtPlaPreCFA_Internalname = "PLAPRECFA_"+sGXsfl_25_fel_idx ;
      edtPlaPreTie_Internalname = "PLAPRETIE_"+sGXsfl_25_fel_idx ;
   }

   public void addRowSL879( )
   {
      nGXsfl_25_idx = (int)(nGXsfl_25_idx+1) ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_25879( ) ;
      sendRowSL879( ) ;
   }

   public void sendRowSL879( )
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
         if ( ((int)((nGXsfl_25_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_879_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_879_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_879), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_879), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_879_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_879_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaPreOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A6007PlaPreOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6007PlaPreOrd), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaPreOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaPreOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaPreCHP_Internalname,GXutil.rtrim( A6027PlaPreCHP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaPreCHP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaPreCHP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaPreCFP_Internalname,GXutil.rtrim( A6028PlaPreCFP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaPreCFP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaPreCFP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaPreCHA_Internalname,GXutil.rtrim( A6029PlaPreCHA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaPreCHA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaPreCHA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaPreCFA_Internalname,GXutil.rtrim( A6030PlaPreCFA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaPreCFA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaPreCFA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_879_" + sGXsfl_25_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_25_idx + "',25)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaPreTie_Internalname,GXutil.ltrim( localUtil.ntoc( A6010PlaPreTie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaPreTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6010PlaPreTie), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6010PlaPreTie), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaPreTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaPreTie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesSL879( ) ;
      GXCCtl = "Z6007PlaPreOrd_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6007PlaPreOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6027PlaPreCHP_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6027PlaPreCHP));
      GXCCtl = "Z6028PlaPreCFP_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6028PlaPreCFP));
      GXCCtl = "Z6029PlaPreCHA_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6029PlaPreCHA));
      GXCCtl = "Z6030PlaPreCFA_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6030PlaPreCFA));
      GXCCtl = "Z6010PlaPreTie_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6010PlaPreTie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_879_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_879_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_879_" + sGXsfl_25_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_879, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_879_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_879_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAPREORD_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAPRECHP_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAPRECFP_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAPRECHA_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAPRECFA_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAPRETIE_"+sGXsfl_25_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowSL879( )
   {
      nGXsfl_25_idx = (int)(nGXsfl_25_idx+1) ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_25879( ) ;
      edtavnRcdDeleted_879_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_879_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaPreOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPREORD_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaPreCHP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECHP_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaPreCFP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECFP_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaPreCHA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECHA_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaPreCFA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRECFA_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaPreTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAPRETIE_"+sGXsfl_25_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_879_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_879_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_879");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_879_Internalname ;
         wbErr = true ;
         nRcdDeleted_879 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_879 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_879_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaPreOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaPreOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PLAPREORD_" + sGXsfl_25_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaPreOrd_Internalname ;
         wbErr = true ;
         A6007PlaPreOrd = 0 ;
      }
      else
      {
         A6007PlaPreOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtPlaPreOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6027PlaPreCHP = httpContext.cgiGet( edtPlaPreCHP_Internalname) ;
      n6027PlaPreCHP = false ;
      A6028PlaPreCFP = httpContext.cgiGet( edtPlaPreCFP_Internalname) ;
      n6028PlaPreCFP = false ;
      A6029PlaPreCHA = httpContext.cgiGet( edtPlaPreCHA_Internalname) ;
      n6029PlaPreCHA = false ;
      A6030PlaPreCFA = httpContext.cgiGet( edtPlaPreCFA_Internalname) ;
      n6030PlaPreCFA = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaPreTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaPreTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLAPRETIE_" + sGXsfl_25_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaPreTie_Internalname ;
         wbErr = true ;
         A6010PlaPreTie = (short)(0) ;
         n6010PlaPreTie = false ;
      }
      else
      {
         A6010PlaPreTie = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaPreTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6010PlaPreTie = false ;
      }
      GXCCtl = "Z6007PlaPreOrd_" + sGXsfl_25_idx ;
      Z6007PlaPreOrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6027PlaPreCHP_" + sGXsfl_25_idx ;
      Z6027PlaPreCHP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6028PlaPreCFP_" + sGXsfl_25_idx ;
      Z6028PlaPreCFP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6029PlaPreCHA_" + sGXsfl_25_idx ;
      Z6029PlaPreCHA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6030PlaPreCFA_" + sGXsfl_25_idx ;
      Z6030PlaPreCFA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6010PlaPreTie_" + sGXsfl_25_idx ;
      Z6010PlaPreTie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_879_" + sGXsfl_25_idx ;
      nRcdDeleted_879 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_879_" + sGXsfl_25_idx ;
      nRcdExists_879 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_879_" + sGXsfl_25_idx ;
      nIsMod_879 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPlaPreOrd_Enabled = edtPlaPreOrd_Enabled ;
   }

   public void confirmValuesSL0( )
   {
      nGXsfl_25_idx = 0 ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_25879( ) ;
      while ( nGXsfl_25_idx < nRC_GXsfl_25 )
      {
         nGXsfl_25_idx = (int)(nGXsfl_25_idx+1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_25879( ) ;
         httpContext.changePostValue( "Z6007PlaPreOrd_"+sGXsfl_25_idx, httpContext.cgiGet( "ZT_"+"Z6007PlaPreOrd_"+sGXsfl_25_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6007PlaPreOrd_"+sGXsfl_25_idx) ;
         httpContext.changePostValue( "Z6027PlaPreCHP_"+sGXsfl_25_idx, httpContext.cgiGet( "ZT_"+"Z6027PlaPreCHP_"+sGXsfl_25_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6027PlaPreCHP_"+sGXsfl_25_idx) ;
         httpContext.changePostValue( "Z6028PlaPreCFP_"+sGXsfl_25_idx, httpContext.cgiGet( "ZT_"+"Z6028PlaPreCFP_"+sGXsfl_25_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6028PlaPreCFP_"+sGXsfl_25_idx) ;
         httpContext.changePostValue( "Z6029PlaPreCHA_"+sGXsfl_25_idx, httpContext.cgiGet( "ZT_"+"Z6029PlaPreCHA_"+sGXsfl_25_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6029PlaPreCHA_"+sGXsfl_25_idx) ;
         httpContext.changePostValue( "Z6030PlaPreCFA_"+sGXsfl_25_idx, httpContext.cgiGet( "ZT_"+"Z6030PlaPreCFA_"+sGXsfl_25_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6030PlaPreCFA_"+sGXsfl_25_idx) ;
         httpContext.changePostValue( "Z6010PlaPreTie_"+sGXsfl_25_idx, httpContext.cgiGet( "ZT_"+"Z6010PlaPreTie_"+sGXsfl_25_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6010PlaPreTie_"+sGXsfl_25_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplapre", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_25", GXutil.ltrim( localUtil.ntoc( nGXsfl_25_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tplapre", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPlaPre" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparación", "") ;
   }

   public void initializeNonKeySL27( )
   {
   }

   public void initAllSL27( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      initializeNonKeySL27( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeySL879( )
   {
      A6027PlaPreCHP = "" ;
      n6027PlaPreCHP = false ;
      A6028PlaPreCFP = "" ;
      n6028PlaPreCFP = false ;
      A6029PlaPreCHA = "" ;
      n6029PlaPreCHA = false ;
      A6030PlaPreCFA = "" ;
      n6030PlaPreCFA = false ;
      A6010PlaPreTie = (short)(0) ;
      n6010PlaPreTie = false ;
      Z6027PlaPreCHP = "" ;
      Z6028PlaPreCFP = "" ;
      Z6029PlaPreCHA = "" ;
      Z6030PlaPreCFA = "" ;
      Z6010PlaPreTie = (short)(0) ;
   }

   public void initAllSL879( )
   {
      A6007PlaPreOrd = 0 ;
      initializeNonKeySL879( ) ;
   }

   public void standaloneModalInsertSL879( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153381", true, true);
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
      httpContext.AddJavascriptSource("tplapre.js", "?2026824153381", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties879( )
   {
      edtPlaPreOrd_Enabled = defedtPlaPreOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaPreOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaPreOrd_Enabled), 5, 0), !bGXsfl_25_Refreshing);
   }

   public void startgridcontrol25( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_879, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_879_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6007PlaPreOrd, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6027PlaPreCHP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6028PlaPreCFP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6029PlaPreCHA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCHA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6030PlaPreCFA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreCFA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6010PlaPreTie, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaPreTie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_879_Internalname = "vNRCDDELETED_879" ;
      edtPlaPreOrd_Internalname = "PLAPREORD" ;
      edtPlaPreCHP_Internalname = "PLAPRECHP" ;
      edtPlaPreCFP_Internalname = "PLAPRECFP" ;
      edtPlaPreCHA_Internalname = "PLAPRECHA" ;
      edtPlaPreCFA_Internalname = "PLAPRECFA" ;
      edtPlaPreTie_Internalname = "PLAPRETIE" ;
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
      Form.setCaption( httpContext.getMessage( "Preparación", "") );
      edtPlaPreTie_Jsonclick = "" ;
      edtPlaPreCFA_Jsonclick = "" ;
      edtPlaPreCHA_Jsonclick = "" ;
      edtPlaPreCFP_Jsonclick = "" ;
      edtPlaPreCHP_Jsonclick = "" ;
      edtPlaPreOrd_Jsonclick = "" ;
      edtavnRcdDeleted_879_Jsonclick = "" ;
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
      edtPlaPreTie_Enabled = 1 ;
      edtPlaPreCFA_Enabled = 1 ;
      edtPlaPreCHA_Enabled = 1 ;
      edtPlaPreCFP_Enabled = 1 ;
      edtPlaPreCHP_Enabled = 1 ;
      edtPlaPreOrd_Enabled = 1 ;
      edtavnRcdDeleted_879_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_25879( ) ;
      while ( nGXsfl_25_idx <= nRC_GXsfl_25 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalSL879( ) ;
         standaloneModalSL879( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowSL879( ) ;
         nGXsfl_25_idx = (int)(nGXsfl_25_idx+1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_25_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_25879( ) ;
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PLAPREORD","{handler:'valid_Plapreord',iparms:[]");
      setEventMetadata("VALID_PLAPREORD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Plapretie',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z6027PlaPreCHP = "" ;
      Z6028PlaPreCFP = "" ;
      Z6029PlaPreCHA = "" ;
      Z6030PlaPreCFA = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode879 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode27 = "" ;
      GXCCtl = "" ;
      A6027PlaPreCHP = "" ;
      A6028PlaPreCFP = "" ;
      A6029PlaPreCHA = "" ;
      A6030PlaPreCFA = "" ;
      T00SL6_A396EmprCod = new String[] {""} ;
      T00SL7_A396EmprCod = new String[] {""} ;
      T00SL5_A396EmprCod = new String[] {""} ;
      T00SL8_A396EmprCod = new String[] {""} ;
      T00SL9_A396EmprCod = new String[] {""} ;
      T00SL4_A396EmprCod = new String[] {""} ;
      T00SL12_A396EmprCod = new String[] {""} ;
      T00SL12_A3331LanBroCod = new byte[1] ;
      T00SL13_A396EmprCod = new String[] {""} ;
      T00SL13_A252CliCod = new int[1] ;
      T00SL13_n252CliCod = new boolean[] {false} ;
      T00SL13_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SL14_A396EmprCod = new String[] {""} ;
      T00SL14_A252CliCod = new int[1] ;
      T00SL14_n252CliCod = new boolean[] {false} ;
      T00SL14_A65ArtCod = new String[] {""} ;
      T00SL14_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SL15_A396EmprCod = new String[] {""} ;
      T00SL15_A3316CodSol = new short[1] ;
      T00SL16_A396EmprCod = new String[] {""} ;
      T00SL16_A3288CCalCod = new String[] {""} ;
      T00SL17_A396EmprCod = new String[] {""} ;
      T00SL17_A3253SolTraCod = new int[1] ;
      T00SL17_A3269SolTraLin = new byte[1] ;
      T00SL18_A396EmprCod = new String[] {""} ;
      T00SL18_A3235SolSubCod = new int[1] ;
      T00SL18_A3251SolSubLin = new byte[1] ;
      T00SL19_A396EmprCod = new String[] {""} ;
      T00SL19_A3218SolLuzCod = new int[1] ;
      T00SL19_A3233SolLuzLin = new byte[1] ;
      T00SL20_A396EmprCod = new String[] {""} ;
      T00SL20_A3196SolFriCod = new int[1] ;
      T00SL20_A3216SolFriLin = new byte[1] ;
      T00SL21_A396EmprCod = new String[] {""} ;
      T00SL21_A3165SolPilCod = new int[1] ;
      T00SL21_A3185SolPilLin = new byte[1] ;
      T00SL22_A396EmprCod = new String[] {""} ;
      T00SL22_A3153CodCod = new String[] {""} ;
      T00SL23_A396EmprCod = new String[] {""} ;
      T00SL23_A3073RepCod = new String[] {""} ;
      T00SL24_A396EmprCod = new String[] {""} ;
      T00SL24_A3061Codia = new byte[1] ;
      T00SL24_A3062CoMes = new byte[1] ;
      T00SL24_A3063CoAny = new short[1] ;
      T00SL25_A396EmprCod = new String[] {""} ;
      T00SL25_A3047LOParId = new String[] {""} ;
      T00SL26_A396EmprCod = new String[] {""} ;
      T00SL26_A3033CCCod = new String[] {""} ;
      T00SL27_A396EmprCod = new String[] {""} ;
      T00SL27_A2971SabFacCod = new int[1] ;
      T00SL28_A396EmprCod = new String[] {""} ;
      T00SL28_A2954TiDia = new byte[1] ;
      T00SL28_A2955TiMes = new byte[1] ;
      T00SL28_A2956TiAny = new short[1] ;
      T00SL29_A396EmprCod = new String[] {""} ;
      T00SL29_A2942LzaDia = new byte[1] ;
      T00SL29_A2943LzaMes = new byte[1] ;
      T00SL29_A2944LzaAny = new short[1] ;
      T00SL30_A396EmprCod = new String[] {""} ;
      T00SL30_A252CliCod = new int[1] ;
      T00SL30_n252CliCod = new boolean[] {false} ;
      T00SL30_A65ArtCod = new String[] {""} ;
      T00SL30_A2937RecIntCod = new byte[1] ;
      T00SL31_A396EmprCod = new String[] {""} ;
      T00SL31_A252CliCod = new int[1] ;
      T00SL31_n252CliCod = new boolean[] {false} ;
      T00SL31_A2933RecTipCon = new short[1] ;
      T00SL32_A396EmprCod = new String[] {""} ;
      T00SL32_A252CliCod = new int[1] ;
      T00SL32_n252CliCod = new boolean[] {false} ;
      T00SL32_A65ArtCod = new String[] {""} ;
      T00SL32_A2931Limite2 = new short[1] ;
      T00SL33_A396EmprCod = new String[] {""} ;
      T00SL33_A252CliCod = new int[1] ;
      T00SL33_n252CliCod = new boolean[] {false} ;
      T00SL33_A2927RecProCod = new String[] {""} ;
      T00SL34_A396EmprCod = new String[] {""} ;
      T00SL34_A2921HisProTiCo = new String[] {""} ;
      T00SL34_A2922HisProTiLP = new short[1] ;
      T00SL34_A2913HisProTiFe = new java.util.Date[] {GXutil.nullDate()} ;
      T00SL34_A2923HisProTiL = new short[1] ;
      T00SL35_A396EmprCod = new String[] {""} ;
      T00SL35_A252CliCod = new int[1] ;
      T00SL35_n252CliCod = new boolean[] {false} ;
      T00SL35_A2891HMaForSer = new String[] {""} ;
      T00SL35_A2892HMaForCNom = new String[] {""} ;
      T00SL35_A2893HMaForCNum = new int[1] ;
      T00SL35_A2894HMaTipCCod = new byte[1] ;
      T00SL35_A2895HMaForNumC = new int[1] ;
      T00SL35_A2897HMaColLin = new short[1] ;
      T00SL35_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00SL35_A2907HmaLin = new short[1] ;
      T00SL36_A396EmprCod = new String[] {""} ;
      T00SL36_A129BarCod = new int[1] ;
      T00SL36_n129BarCod = new boolean[] {false} ;
      T00SL36_A132BarCodReo = new byte[1] ;
      T00SL36_n132BarCodReo = new boolean[] {false} ;
      T00SL36_A130BarCodPar = new String[] {""} ;
      T00SL36_n130BarCodPar = new boolean[] {false} ;
      T00SL36_A2872HAnRLinMaq = new short[1] ;
      T00SL36_A2873HAnRLinPro = new byte[1] ;
      T00SL36_A2874HAnRLin = new short[1] ;
      T00SL36_A2875HAnNumAny = new byte[1] ;
      T00SL37_A396EmprCod = new String[] {""} ;
      T00SL37_A2855CodBota = new int[1] ;
      T00SL37_A2859BotLin = new short[1] ;
      T00SL38_A396EmprCod = new String[] {""} ;
      T00SL38_A2853TipBotCod = new byte[1] ;
      T00SL39_A396EmprCod = new String[] {""} ;
      T00SL39_A2817PlaTer = new String[] {""} ;
      T00SL39_A2818PlaOrd = new short[1] ;
      T00SL40_A396EmprCod = new String[] {""} ;
      T00SL40_A2809MetTerCod = new String[] {""} ;
      T00SL40_A129BarCod = new int[1] ;
      T00SL40_n129BarCod = new boolean[] {false} ;
      T00SL40_A132BarCodReo = new byte[1] ;
      T00SL40_n132BarCodReo = new boolean[] {false} ;
      T00SL40_A130BarCodPar = new String[] {""} ;
      T00SL40_n130BarCodPar = new boolean[] {false} ;
      T00SL41_A396EmprCod = new String[] {""} ;
      T00SL41_A129BarCod = new int[1] ;
      T00SL41_n129BarCod = new boolean[] {false} ;
      T00SL41_A132BarCodReo = new byte[1] ;
      T00SL41_n132BarCodReo = new boolean[] {false} ;
      T00SL41_A130BarCodPar = new String[] {""} ;
      T00SL41_n130BarCodPar = new boolean[] {false} ;
      T00SL41_A2808RecLinMAL = new short[1] ;
      T00SL41_A1377RecNumAny = new byte[1] ;
      T00SL41_A719PrdNum = new String[] {""} ;
      T00SL42_A396EmprCod = new String[] {""} ;
      T00SL42_A2792TermiCod = new String[] {""} ;
      T00SL42_A129BarCod = new int[1] ;
      T00SL42_n129BarCod = new boolean[] {false} ;
      T00SL42_A132BarCodReo = new byte[1] ;
      T00SL42_n132BarCodReo = new boolean[] {false} ;
      T00SL42_A130BarCodPar = new String[] {""} ;
      T00SL42_n130BarCodPar = new boolean[] {false} ;
      T00SL43_A396EmprCod = new String[] {""} ;
      T00SL43_A30AlbProCod = new long[1] ;
      T00SL43_A129BarCod = new int[1] ;
      T00SL43_n129BarCod = new boolean[] {false} ;
      T00SL43_A132BarCodReo = new byte[1] ;
      T00SL43_n132BarCodReo = new boolean[] {false} ;
      T00SL43_A130BarCodPar = new String[] {""} ;
      T00SL43_n130BarCodPar = new boolean[] {false} ;
      T00SL43_A2764AlbHdrLin = new short[1] ;
      T00SL44_A396EmprCod = new String[] {""} ;
      T00SL44_A252CliCod = new int[1] ;
      T00SL44_n252CliCod = new boolean[] {false} ;
      T00SL44_A65ArtCod = new String[] {""} ;
      T00SL44_A71ArtEstAny = new short[1] ;
      T00SL44_A2756ArtEstSer = new String[] {""} ;
      T00SL45_A396EmprCod = new String[] {""} ;
      T00SL45_A252CliCod = new int[1] ;
      T00SL45_n252CliCod = new boolean[] {false} ;
      T00SL45_A425EstAny = new short[1] ;
      T00SL45_A2755EstSerFac = new String[] {""} ;
      T00SL46_A396EmprCod = new String[] {""} ;
      T00SL46_A2730RecTipCo = new short[1] ;
      T00SL46_A252CliCod = new int[1] ;
      T00SL46_n252CliCod = new boolean[] {false} ;
      T00SL47_A396EmprCod = new String[] {""} ;
      T00SL47_A2707NumTexCod = new String[] {""} ;
      T00SL48_A396EmprCod = new String[] {""} ;
      T00SL48_A129BarCod = new int[1] ;
      T00SL48_n129BarCod = new boolean[] {false} ;
      T00SL48_A132BarCodReo = new byte[1] ;
      T00SL48_n132BarCodReo = new boolean[] {false} ;
      T00SL48_A130BarCodPar = new String[] {""} ;
      T00SL48_n130BarCodPar = new boolean[] {false} ;
      T00SL48_A2494BarDosPro = new String[] {""} ;
      T00SL48_A719PrdNum = new String[] {""} ;
      T00SL49_A396EmprCod = new String[] {""} ;
      T00SL49_A658PedCod = new int[1] ;
      T00SL49_A2501PedObsLin = new byte[1] ;
      T00SL50_A396EmprCod = new String[] {""} ;
      T00SL50_A129BarCod = new int[1] ;
      T00SL50_n129BarCod = new boolean[] {false} ;
      T00SL50_A132BarCodReo = new byte[1] ;
      T00SL50_n132BarCodReo = new boolean[] {false} ;
      T00SL50_A130BarCodPar = new String[] {""} ;
      T00SL50_n130BarCodPar = new boolean[] {false} ;
      T00SL50_A2457BarObLin = new short[1] ;
      T00SL51_A396EmprCod = new String[] {""} ;
      T00SL51_A129BarCod = new int[1] ;
      T00SL51_n129BarCod = new boolean[] {false} ;
      T00SL51_A132BarCodReo = new byte[1] ;
      T00SL51_n132BarCodReo = new boolean[] {false} ;
      T00SL51_A130BarCodPar = new String[] {""} ;
      T00SL51_n130BarCodPar = new boolean[] {false} ;
      T00SL51_A2444BarEnLin = new short[1] ;
      T00SL52_A396EmprCod = new String[] {""} ;
      T00SL52_A2429TerBarCod = new int[1] ;
      T00SL52_A2431TerBarReo = new byte[1] ;
      T00SL52_A2430TerBarPar = new String[] {""} ;
      T00SL53_A396EmprCod = new String[] {""} ;
      T00SL53_A2420OpeAntCod = new int[1] ;
      T00SL54_A396EmprCod = new String[] {""} ;
      T00SL54_A2406ExhAlbCod = new int[1] ;
      T00SL54_A2416ExhObsLin = new short[1] ;
      T00SL55_A396EmprCod = new String[] {""} ;
      T00SL55_A2406ExhAlbCod = new int[1] ;
      T00SL55_A129BarCod = new int[1] ;
      T00SL55_n129BarCod = new boolean[] {false} ;
      T00SL55_A132BarCodReo = new byte[1] ;
      T00SL55_n132BarCodReo = new boolean[] {false} ;
      T00SL55_A130BarCodPar = new String[] {""} ;
      T00SL55_n130BarCodPar = new boolean[] {false} ;
      T00SL56_A396EmprCod = new String[] {""} ;
      T00SL56_A14AlbComCod = new int[1] ;
      T00SL56_A2386AlbCObsLin = new byte[1] ;
      T00SL57_A396EmprCod = new String[] {""} ;
      T00SL57_A2382AbcTerCod = new String[] {""} ;
      T00SL57_A2381AbcSec = new String[] {""} ;
      T00SL57_A252CliCod = new int[1] ;
      T00SL57_n252CliCod = new boolean[] {false} ;
      T00SL58_A396EmprCod = new String[] {""} ;
      T00SL58_A252CliCod = new int[1] ;
      T00SL58_n252CliCod = new boolean[] {false} ;
      T00SL58_A2308CliDesCod = new int[1] ;
      T00SL59_A396EmprCod = new String[] {""} ;
      T00SL59_A2268MovParCod = new String[] {""} ;
      T00SL59_A252CliCod = new int[1] ;
      T00SL59_n252CliCod = new boolean[] {false} ;
      T00SL59_A2276MovParLin = new short[1] ;
      T00SL60_A396EmprCod = new String[] {""} ;
      T00SL60_A2253SalExtAlb = new int[1] ;
      T00SL60_A129BarCod = new int[1] ;
      T00SL60_n129BarCod = new boolean[] {false} ;
      T00SL60_A132BarCodReo = new byte[1] ;
      T00SL60_n132BarCodReo = new boolean[] {false} ;
      T00SL60_A130BarCodPar = new String[] {""} ;
      T00SL60_n130BarCodPar = new boolean[] {false} ;
      T00SL61_A396EmprCod = new String[] {""} ;
      T00SL61_A2248ManCod = new short[1] ;
      T00SL62_A396EmprCod = new String[] {""} ;
      T00SL62_A44AlbRecCod = new int[1] ;
      T00SL62_A2159AlbRecPie = new String[] {""} ;
      T00SL63_A396EmprCod = new String[] {""} ;
      T00SL63_A44AlbRecCod = new int[1] ;
      T00SL63_A2165HisEmpLin = new short[1] ;
      T00SL64_A396EmprCod = new String[] {""} ;
      T00SL64_A1794GruLecMaq = new String[] {""} ;
      T00SL64_A1795GruOrd = new byte[1] ;
      T00SL64_A1791GruBarCod = new int[1] ;
      T00SL64_A1793GruBarReo = new byte[1] ;
      T00SL64_A1792GruBarPar = new String[] {""} ;
      T00SL65_A396EmprCod = new String[] {""} ;
      T00SL65_A1664ParFasCod = new short[1] ;
      T00SL66_A396EmprCod = new String[] {""} ;
      T00SL66_A1514MacProCod = new String[] {""} ;
      T00SL67_A396EmprCod = new String[] {""} ;
      T00SL67_A252CliCod = new int[1] ;
      T00SL67_n252CliCod = new boolean[] {false} ;
      T00SL67_A1504CliProCod = new String[] {""} ;
      T00SL67_A65ArtCod = new String[] {""} ;
      T00SL68_A396EmprCod = new String[] {""} ;
      T00SL68_A1438BarTerCod = new String[] {""} ;
      T00SL68_A172BarLanLin = new short[1] ;
      T00SL69_A396EmprCod = new String[] {""} ;
      T00SL69_A1387AlbPrvCod = new int[1] ;
      T00SL70_A396EmprCod = new String[] {""} ;
      T00SL70_A44AlbRecCod = new int[1] ;
      T00SL70_A1299AlbRLin = new byte[1] ;
      T00SL71_A396EmprCod = new String[] {""} ;
      T00SL71_A858ZonGeoCod = new short[1] ;
      T00SL72_A396EmprCod = new String[] {""} ;
      T00SL72_A1348SolColCod = new int[1] ;
      T00SL72_A1351SolColLin = new byte[1] ;
      T00SL73_A396EmprCod = new String[] {""} ;
      T00SL73_A1333EstDimCod = new int[1] ;
      T00SL73_A1339EstDimLin = new byte[1] ;
      T00SL74_A396EmprCod = new String[] {""} ;
      T00SL74_A1314EnsLabCod = new int[1] ;
      T00SL75_A396EmprCod = new String[] {""} ;
      T00SL75_A252CliCod = new int[1] ;
      T00SL75_n252CliCod = new boolean[] {false} ;
      T00SL75_A1213TalCod = new String[] {""} ;
      T00SL75_A1293EntMarRef = new String[] {""} ;
      T00SL76_A396EmprCod = new String[] {""} ;
      T00SL76_A1206TubCod = new short[1] ;
      T00SL77_A396EmprCod = new String[] {""} ;
      T00SL77_A252CliCod = new int[1] ;
      T00SL77_n252CliCod = new boolean[] {false} ;
      T00SL77_A1213TalCod = new String[] {""} ;
      T00SL77_A1217EntMalLin = new short[1] ;
      T00SL78_A396EmprCod = new String[] {""} ;
      T00SL78_A1199MacCod = new int[1] ;
      T00SL79_A396EmprCod = new String[] {""} ;
      T00SL79_A1209DesCod = new short[1] ;
      T00SL80_A396EmprCod = new String[] {""} ;
      T00SL80_A1211TipEntCod = new short[1] ;
      T00SL81_A396EmprCod = new String[] {""} ;
      T00SL81_A688PrdComCod = new String[] {""} ;
      T00SL82_A396EmprCod = new String[] {""} ;
      T00SL82_A1166LecMaqCod = new String[] {""} ;
      T00SL83_A396EmprCod = new String[] {""} ;
      T00SL83_A1161TurnCod = new byte[1] ;
      T00SL84_A396EmprCod = new String[] {""} ;
      T00SL84_A1146DisDisCod = new int[1] ;
      T00SL84_A1139DisBarCod = new int[1] ;
      T00SL84_A1140DisBarReo = new byte[1] ;
      T00SL84_A1141DisBarPar = new String[] {""} ;
      T00SL85_A396EmprCod = new String[] {""} ;
      T00SL85_A996TipCon = new short[1] ;
      T00SL86_A396EmprCod = new String[] {""} ;
      T00SL86_A970ProceCod = new short[1] ;
      T00SL87_A396EmprCod = new String[] {""} ;
      T00SL87_A30AlbProCod = new long[1] ;
      T00SL87_A915AlbPObsLin = new byte[1] ;
      T00SL88_A396EmprCod = new String[] {""} ;
      T00SL88_A910Workstat = new String[] {""} ;
      T00SL89_A396EmprCod = new String[] {""} ;
      T00SL89_A129BarCod = new int[1] ;
      T00SL89_n129BarCod = new boolean[] {false} ;
      T00SL89_A132BarCodReo = new byte[1] ;
      T00SL89_n132BarCodReo = new boolean[] {false} ;
      T00SL89_A130BarCodPar = new String[] {""} ;
      T00SL89_n130BarCodPar = new boolean[] {false} ;
      T00SL89_A906ObsReoLin = new byte[1] ;
      T00SL90_A396EmprCod = new String[] {""} ;
      T00SL90_A656ParCod = new short[1] ;
      T00SL91_A396EmprCod = new String[] {""} ;
      T00SL91_A859CumCodCont = new int[1] ;
      T00SL92_A396EmprCod = new String[] {""} ;
      T00SL92_A490ForPrdUMe = new byte[1] ;
      T00SL93_A396EmprCod = new String[] {""} ;
      T00SL93_A840TrnCod = new short[1] ;
      T00SL94_A396EmprCod = new String[] {""} ;
      T00SL94_A856ValCod = new byte[1] ;
      T00SL95_A396EmprCod = new String[] {""} ;
      T00SL95_A848UniCod = new byte[1] ;
      T00SL96_A396EmprCod = new String[] {""} ;
      T00SL96_A687PrdCod = new byte[1] ;
      T00SL97_A396EmprCod = new String[] {""} ;
      T00SL97_A835TipDtoCod = new byte[1] ;
      T00SL98_A396EmprCod = new String[] {""} ;
      T00SL98_A833TipDefCod = new short[1] ;
      T00SL99_A396EmprCod = new String[] {""} ;
      T00SL99_A831TipColCod = new byte[1] ;
      T00SL100_A396EmprCod = new String[] {""} ;
      T00SL100_A829TipArtCod = new short[1] ;
      T00SL101_A396EmprCod = new String[] {""} ;
      T00SL101_A719PrdNum = new String[] {""} ;
      T00SL101_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00SL102_A396EmprCod = new String[] {""} ;
      T00SL102_A252CliCod = new int[1] ;
      T00SL102_n252CliCod = new boolean[] {false} ;
      T00SL102_A65ArtCod = new String[] {""} ;
      T00SL102_A598LinRec = new byte[1] ;
      T00SL103_A396EmprCod = new String[] {""} ;
      T00SL103_A764ProForCod = new String[] {""} ;
      T00SL104_A396EmprCod = new String[] {""} ;
      T00SL104_A758ProCod = new String[] {""} ;
      T00SL105_A396EmprCod = new String[] {""} ;
      T00SL105_A252CliCod = new int[1] ;
      T00SL105_n252CliCod = new boolean[] {false} ;
      T00SL105_A457FasCod = new String[] {""} ;
      T00SL106_A396EmprCod = new String[] {""} ;
      T00SL106_A719PrdNum = new String[] {""} ;
      T00SL106_A681PrdAny = new short[1] ;
      T00SL107_A396EmprCod = new String[] {""} ;
      T00SL107_A719PrdNum = new String[] {""} ;
      T00SL107_A680PrdAltNum = new String[] {""} ;
      T00SL108_A396EmprCod = new String[] {""} ;
      T00SL108_A658PedCod = new int[1] ;
      T00SL108_A719PrdNum = new String[] {""} ;
      T00SL109_A396EmprCod = new String[] {""} ;
      T00SL109_A652OpeCod = new int[1] ;
      T00SL110_A396EmprCod = new String[] {""} ;
      T00SL110_A629MetCod = new byte[1] ;
      T00SL111_A396EmprCod = new String[] {""} ;
      T00SL111_A626MatCod = new short[1] ;
      T00SL112_A396EmprCod = new String[] {""} ;
      T00SL112_A602MaqCod = new String[] {""} ;
      T00SL113_A396EmprCod = new String[] {""} ;
      T00SL113_A583IntCod = new byte[1] ;
      T00SL114_A396EmprCod = new String[] {""} ;
      T00SL114_A506HbaBarCod = new int[1] ;
      T00SL114_A508HbaBarReo = new byte[1] ;
      T00SL114_A507HbaBarPar = new String[] {""} ;
      T00SL115_A396EmprCod = new String[] {""} ;
      T00SL115_A503GruOpeCod = new int[1] ;
      T00SL116_A396EmprCod = new String[] {""} ;
      T00SL116_A501GruMaqCod = new String[] {""} ;
      T00SL117_A396EmprCod = new String[] {""} ;
      T00SL117_A499GrpFamCod = new byte[1] ;
      T00SL118_A396EmprCod = new String[] {""} ;
      T00SL118_A497FpgCod = new String[] {""} ;
      T00SL119_A396EmprCod = new String[] {""} ;
      T00SL119_A457FasCod = new String[] {""} ;
      T00SL119_A463FasNumLin = new byte[1] ;
      T00SL120_A396EmprCod = new String[] {""} ;
      T00SL120_A430FacCod = new int[1] ;
      T00SL121_A396EmprCod = new String[] {""} ;
      T00SL121_A313ContCod = new String[] {""} ;
      T00SL122_A396EmprCod = new String[] {""} ;
      T00SL122_A361DisCod = new int[1] ;
      T00SL122_A376DisObsLin = new byte[1] ;
      T00SL123_A396EmprCod = new String[] {""} ;
      T00SL123_A361DisCod = new int[1] ;
      T00SL123_A44AlbRecCod = new int[1] ;
      T00SL124_A396EmprCod = new String[] {""} ;
      T00SL124_A486ForNumCol = new int[1] ;
      T00SL125_A396EmprCod = new String[] {""} ;
      T00SL125_A323DevGenCod = new int[1] ;
      T00SL126_A396EmprCod = new String[] {""} ;
      T00SL126_A719PrdNum = new String[] {""} ;
      T00SL126_A647NumCon = new int[1] ;
      T00SL127_A396EmprCod = new String[] {""} ;
      T00SL127_A252CliCod = new int[1] ;
      T00SL127_n252CliCod = new boolean[] {false} ;
      T00SL127_A287CliPagLin = new byte[1] ;
      T00SL128_A396EmprCod = new String[] {""} ;
      T00SL128_A252CliCod = new int[1] ;
      T00SL128_n252CliCod = new boolean[] {false} ;
      T00SL128_A266CliEnvLin = new byte[1] ;
      T00SL129_A396EmprCod = new String[] {""} ;
      T00SL129_A241CieBarCod = new int[1] ;
      T00SL129_A243CieBarReo = new byte[1] ;
      T00SL129_A242CieBarPar = new String[] {""} ;
      T00SL130_A396EmprCod = new String[] {""} ;
      T00SL130_A129BarCod = new int[1] ;
      T00SL130_n129BarCod = new boolean[] {false} ;
      T00SL130_A132BarCodReo = new byte[1] ;
      T00SL130_n132BarCodReo = new boolean[] {false} ;
      T00SL130_A130BarCodPar = new String[] {""} ;
      T00SL130_n130BarCodPar = new boolean[] {false} ;
      T00SL130_A200BarPieCod = new String[] {""} ;
      T00SL131_A396EmprCod = new String[] {""} ;
      T00SL131_A129BarCod = new int[1] ;
      T00SL131_n129BarCod = new boolean[] {false} ;
      T00SL131_A132BarCodReo = new byte[1] ;
      T00SL131_n132BarCodReo = new boolean[] {false} ;
      T00SL131_A130BarCodPar = new String[] {""} ;
      T00SL131_n130BarCodPar = new boolean[] {false} ;
      T00SL131_A188BarNotLin = new byte[1] ;
      T00SL132_A396EmprCod = new String[] {""} ;
      T00SL132_A129BarCod = new int[1] ;
      T00SL132_n129BarCod = new boolean[] {false} ;
      T00SL132_A132BarCodReo = new byte[1] ;
      T00SL132_n132BarCodReo = new boolean[] {false} ;
      T00SL132_A130BarCodPar = new String[] {""} ;
      T00SL132_n130BarCodPar = new boolean[] {false} ;
      T00SL132_A119BarAgrCod = new int[1] ;
      T00SL132_A124BarAgrReo = new byte[1] ;
      T00SL132_A122BarAgrPar = new String[] {""} ;
      T00SL133_A396EmprCod = new String[] {""} ;
      T00SL133_A30AlbProCod = new long[1] ;
      T00SL134_A396EmprCod = new String[] {""} ;
      T00SL134_A14AlbComCod = new int[1] ;
      T00SL134_A20AlbComLin = new short[1] ;
      T00SL135_A396EmprCod = new String[] {""} ;
      T00SL136_A396EmprCod = new String[] {""} ;
      T00SL136_A6007PlaPreOrd = new int[1] ;
      T00SL136_A6027PlaPreCHP = new String[] {""} ;
      T00SL136_n6027PlaPreCHP = new boolean[] {false} ;
      T00SL136_A6028PlaPreCFP = new String[] {""} ;
      T00SL136_n6028PlaPreCFP = new boolean[] {false} ;
      T00SL136_A6029PlaPreCHA = new String[] {""} ;
      T00SL136_n6029PlaPreCHA = new boolean[] {false} ;
      T00SL136_A6030PlaPreCFA = new String[] {""} ;
      T00SL136_n6030PlaPreCFA = new boolean[] {false} ;
      T00SL136_A6010PlaPreTie = new short[1] ;
      T00SL136_n6010PlaPreTie = new boolean[] {false} ;
      T00SL137_A396EmprCod = new String[] {""} ;
      T00SL137_A6007PlaPreOrd = new int[1] ;
      T00SL3_A396EmprCod = new String[] {""} ;
      T00SL3_A6007PlaPreOrd = new int[1] ;
      T00SL3_A6027PlaPreCHP = new String[] {""} ;
      T00SL3_n6027PlaPreCHP = new boolean[] {false} ;
      T00SL3_A6028PlaPreCFP = new String[] {""} ;
      T00SL3_n6028PlaPreCFP = new boolean[] {false} ;
      T00SL3_A6029PlaPreCHA = new String[] {""} ;
      T00SL3_n6029PlaPreCHA = new boolean[] {false} ;
      T00SL3_A6030PlaPreCFA = new String[] {""} ;
      T00SL3_n6030PlaPreCFA = new boolean[] {false} ;
      T00SL3_A6010PlaPreTie = new short[1] ;
      T00SL3_n6010PlaPreTie = new boolean[] {false} ;
      T00SL2_A396EmprCod = new String[] {""} ;
      T00SL2_A6007PlaPreOrd = new int[1] ;
      T00SL2_A6027PlaPreCHP = new String[] {""} ;
      T00SL2_n6027PlaPreCHP = new boolean[] {false} ;
      T00SL2_A6028PlaPreCFP = new String[] {""} ;
      T00SL2_n6028PlaPreCFP = new boolean[] {false} ;
      T00SL2_A6029PlaPreCHA = new String[] {""} ;
      T00SL2_n6029PlaPreCHA = new boolean[] {false} ;
      T00SL2_A6030PlaPreCFA = new String[] {""} ;
      T00SL2_n6030PlaPreCFA = new boolean[] {false} ;
      T00SL2_A6010PlaPreTie = new short[1] ;
      T00SL2_n6010PlaPreTie = new boolean[] {false} ;
      T00SL141_A396EmprCod = new String[] {""} ;
      T00SL141_A6007PlaPreOrd = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplapre__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplapre__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplapre__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplapre__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplapre__default(),
         new Object[] {
             new Object[] {
            T00SL2_A396EmprCod, T00SL2_A6007PlaPreOrd, T00SL2_A6027PlaPreCHP, T00SL2_n6027PlaPreCHP, T00SL2_A6028PlaPreCFP, T00SL2_n6028PlaPreCFP, T00SL2_A6029PlaPreCHA, T00SL2_n6029PlaPreCHA, T00SL2_A6030PlaPreCFA, T00SL2_n6030PlaPreCFA,
            T00SL2_A6010PlaPreTie, T00SL2_n6010PlaPreTie
            }
            , new Object[] {
            T00SL3_A396EmprCod, T00SL3_A6007PlaPreOrd, T00SL3_A6027PlaPreCHP, T00SL3_n6027PlaPreCHP, T00SL3_A6028PlaPreCFP, T00SL3_n6028PlaPreCFP, T00SL3_A6029PlaPreCHA, T00SL3_n6029PlaPreCHA, T00SL3_A6030PlaPreCFA, T00SL3_n6030PlaPreCFA,
            T00SL3_A6010PlaPreTie, T00SL3_n6010PlaPreTie
            }
            , new Object[] {
            T00SL4_A396EmprCod
            }
            , new Object[] {
            T00SL5_A396EmprCod
            }
            , new Object[] {
            T00SL6_A396EmprCod
            }
            , new Object[] {
            T00SL7_A396EmprCod
            }
            , new Object[] {
            T00SL8_A396EmprCod
            }
            , new Object[] {
            T00SL9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SL12_A396EmprCod, T00SL12_A3331LanBroCod
            }
            , new Object[] {
            T00SL13_A396EmprCod, T00SL13_A252CliCod, T00SL13_A3320CliLimKgs
            }
            , new Object[] {
            T00SL14_A396EmprCod, T00SL14_A252CliCod, T00SL14_A65ArtCod, T00SL14_A3319ArtCapKgs
            }
            , new Object[] {
            T00SL15_A396EmprCod, T00SL15_A3316CodSol
            }
            , new Object[] {
            T00SL16_A396EmprCod, T00SL16_A3288CCalCod
            }
            , new Object[] {
            T00SL17_A396EmprCod, T00SL17_A3253SolTraCod, T00SL17_A3269SolTraLin
            }
            , new Object[] {
            T00SL18_A396EmprCod, T00SL18_A3235SolSubCod, T00SL18_A3251SolSubLin
            }
            , new Object[] {
            T00SL19_A396EmprCod, T00SL19_A3218SolLuzCod, T00SL19_A3233SolLuzLin
            }
            , new Object[] {
            T00SL20_A396EmprCod, T00SL20_A3196SolFriCod, T00SL20_A3216SolFriLin
            }
            , new Object[] {
            T00SL21_A396EmprCod, T00SL21_A3165SolPilCod, T00SL21_A3185SolPilLin
            }
            , new Object[] {
            T00SL22_A396EmprCod, T00SL22_A3153CodCod
            }
            , new Object[] {
            T00SL23_A396EmprCod, T00SL23_A3073RepCod
            }
            , new Object[] {
            T00SL24_A396EmprCod, T00SL24_A3061Codia, T00SL24_A3062CoMes, T00SL24_A3063CoAny
            }
            , new Object[] {
            T00SL25_A396EmprCod, T00SL25_A3047LOParId
            }
            , new Object[] {
            T00SL26_A396EmprCod, T00SL26_A3033CCCod
            }
            , new Object[] {
            T00SL27_A396EmprCod, T00SL27_A2971SabFacCod
            }
            , new Object[] {
            T00SL28_A396EmprCod, T00SL28_A2954TiDia, T00SL28_A2955TiMes, T00SL28_A2956TiAny
            }
            , new Object[] {
            T00SL29_A396EmprCod, T00SL29_A2942LzaDia, T00SL29_A2943LzaMes, T00SL29_A2944LzaAny
            }
            , new Object[] {
            T00SL30_A396EmprCod, T00SL30_A252CliCod, T00SL30_A65ArtCod, T00SL30_A2937RecIntCod
            }
            , new Object[] {
            T00SL31_A396EmprCod, T00SL31_A252CliCod, T00SL31_A2933RecTipCon
            }
            , new Object[] {
            T00SL32_A396EmprCod, T00SL32_A252CliCod, T00SL32_A65ArtCod, T00SL32_A2931Limite2
            }
            , new Object[] {
            T00SL33_A396EmprCod, T00SL33_A252CliCod, T00SL33_A2927RecProCod
            }
            , new Object[] {
            T00SL34_A396EmprCod, T00SL34_A2921HisProTiCo, T00SL34_A2922HisProTiLP, T00SL34_A2913HisProTiFe, T00SL34_A2923HisProTiL
            }
            , new Object[] {
            T00SL35_A396EmprCod, T00SL35_A252CliCod, T00SL35_A2891HMaForSer, T00SL35_A2892HMaForCNom, T00SL35_A2893HMaForCNum, T00SL35_A2894HMaTipCCod, T00SL35_A2895HMaForNumC, T00SL35_A2897HMaColLin, T00SL35_A2896HMaFec, T00SL35_A2907HmaLin
            }
            , new Object[] {
            T00SL36_A396EmprCod, T00SL36_A129BarCod, T00SL36_A132BarCodReo, T00SL36_A130BarCodPar, T00SL36_A2872HAnRLinMaq, T00SL36_A2873HAnRLinPro, T00SL36_A2874HAnRLin, T00SL36_A2875HAnNumAny
            }
            , new Object[] {
            T00SL37_A396EmprCod, T00SL37_A2855CodBota, T00SL37_A2859BotLin
            }
            , new Object[] {
            T00SL38_A396EmprCod, T00SL38_A2853TipBotCod
            }
            , new Object[] {
            T00SL39_A396EmprCod, T00SL39_A2817PlaTer, T00SL39_A2818PlaOrd
            }
            , new Object[] {
            T00SL40_A396EmprCod, T00SL40_A2809MetTerCod, T00SL40_A129BarCod, T00SL40_A132BarCodReo, T00SL40_A130BarCodPar
            }
            , new Object[] {
            T00SL41_A396EmprCod, T00SL41_A129BarCod, T00SL41_A132BarCodReo, T00SL41_A130BarCodPar, T00SL41_A2808RecLinMAL, T00SL41_A1377RecNumAny, T00SL41_A719PrdNum
            }
            , new Object[] {
            T00SL42_A396EmprCod, T00SL42_A2792TermiCod, T00SL42_A129BarCod, T00SL42_A132BarCodReo, T00SL42_A130BarCodPar
            }
            , new Object[] {
            T00SL43_A396EmprCod, T00SL43_A30AlbProCod, T00SL43_A129BarCod, T00SL43_A132BarCodReo, T00SL43_A130BarCodPar, T00SL43_A2764AlbHdrLin
            }
            , new Object[] {
            T00SL44_A396EmprCod, T00SL44_A252CliCod, T00SL44_A65ArtCod, T00SL44_A71ArtEstAny, T00SL44_A2756ArtEstSer
            }
            , new Object[] {
            T00SL45_A396EmprCod, T00SL45_A252CliCod, T00SL45_A425EstAny, T00SL45_A2755EstSerFac
            }
            , new Object[] {
            T00SL46_A396EmprCod, T00SL46_A2730RecTipCo, T00SL46_A252CliCod
            }
            , new Object[] {
            T00SL47_A396EmprCod, T00SL47_A2707NumTexCod
            }
            , new Object[] {
            T00SL48_A396EmprCod, T00SL48_A129BarCod, T00SL48_A132BarCodReo, T00SL48_A130BarCodPar, T00SL48_A2494BarDosPro, T00SL48_A719PrdNum
            }
            , new Object[] {
            T00SL49_A396EmprCod, T00SL49_A658PedCod, T00SL49_A2501PedObsLin
            }
            , new Object[] {
            T00SL50_A396EmprCod, T00SL50_A129BarCod, T00SL50_A132BarCodReo, T00SL50_A130BarCodPar, T00SL50_A2457BarObLin
            }
            , new Object[] {
            T00SL51_A396EmprCod, T00SL51_A129BarCod, T00SL51_A132BarCodReo, T00SL51_A130BarCodPar, T00SL51_A2444BarEnLin
            }
            , new Object[] {
            T00SL52_A396EmprCod, T00SL52_A2429TerBarCod, T00SL52_A2431TerBarReo, T00SL52_A2430TerBarPar
            }
            , new Object[] {
            T00SL53_A396EmprCod, T00SL53_A2420OpeAntCod
            }
            , new Object[] {
            T00SL54_A396EmprCod, T00SL54_A2406ExhAlbCod, T00SL54_A2416ExhObsLin
            }
            , new Object[] {
            T00SL55_A396EmprCod, T00SL55_A2406ExhAlbCod, T00SL55_A129BarCod, T00SL55_A132BarCodReo, T00SL55_A130BarCodPar
            }
            , new Object[] {
            T00SL56_A396EmprCod, T00SL56_A14AlbComCod, T00SL56_A2386AlbCObsLin
            }
            , new Object[] {
            T00SL57_A396EmprCod, T00SL57_A2382AbcTerCod, T00SL57_A2381AbcSec, T00SL57_A252CliCod
            }
            , new Object[] {
            T00SL58_A396EmprCod, T00SL58_A252CliCod, T00SL58_A2308CliDesCod
            }
            , new Object[] {
            T00SL59_A396EmprCod, T00SL59_A2268MovParCod, T00SL59_A252CliCod, T00SL59_A2276MovParLin
            }
            , new Object[] {
            T00SL60_A396EmprCod, T00SL60_A2253SalExtAlb, T00SL60_A129BarCod, T00SL60_A132BarCodReo, T00SL60_A130BarCodPar
            }
            , new Object[] {
            T00SL61_A396EmprCod, T00SL61_A2248ManCod
            }
            , new Object[] {
            T00SL62_A396EmprCod, T00SL62_A44AlbRecCod, T00SL62_A2159AlbRecPie
            }
            , new Object[] {
            T00SL63_A396EmprCod, T00SL63_A44AlbRecCod, T00SL63_A2165HisEmpLin
            }
            , new Object[] {
            T00SL64_A396EmprCod, T00SL64_A1794GruLecMaq, T00SL64_A1795GruOrd, T00SL64_A1791GruBarCod, T00SL64_A1793GruBarReo, T00SL64_A1792GruBarPar
            }
            , new Object[] {
            T00SL65_A396EmprCod, T00SL65_A1664ParFasCod
            }
            , new Object[] {
            T00SL66_A396EmprCod, T00SL66_A1514MacProCod
            }
            , new Object[] {
            T00SL67_A396EmprCod, T00SL67_A252CliCod, T00SL67_A1504CliProCod, T00SL67_A65ArtCod
            }
            , new Object[] {
            T00SL68_A396EmprCod, T00SL68_A1438BarTerCod, T00SL68_A172BarLanLin
            }
            , new Object[] {
            T00SL69_A396EmprCod, T00SL69_A1387AlbPrvCod
            }
            , new Object[] {
            T00SL70_A396EmprCod, T00SL70_A44AlbRecCod, T00SL70_A1299AlbRLin
            }
            , new Object[] {
            T00SL71_A396EmprCod, T00SL71_A858ZonGeoCod
            }
            , new Object[] {
            T00SL72_A396EmprCod, T00SL72_A1348SolColCod, T00SL72_A1351SolColLin
            }
            , new Object[] {
            T00SL73_A396EmprCod, T00SL73_A1333EstDimCod, T00SL73_A1339EstDimLin
            }
            , new Object[] {
            T00SL74_A396EmprCod, T00SL74_A1314EnsLabCod
            }
            , new Object[] {
            T00SL75_A396EmprCod, T00SL75_A252CliCod, T00SL75_A1213TalCod, T00SL75_A1293EntMarRef
            }
            , new Object[] {
            T00SL76_A396EmprCod, T00SL76_A1206TubCod
            }
            , new Object[] {
            T00SL77_A396EmprCod, T00SL77_A252CliCod, T00SL77_A1213TalCod, T00SL77_A1217EntMalLin
            }
            , new Object[] {
            T00SL78_A396EmprCod, T00SL78_A1199MacCod
            }
            , new Object[] {
            T00SL79_A396EmprCod, T00SL79_A1209DesCod
            }
            , new Object[] {
            T00SL80_A396EmprCod, T00SL80_A1211TipEntCod
            }
            , new Object[] {
            T00SL81_A396EmprCod, T00SL81_A688PrdComCod
            }
            , new Object[] {
            T00SL82_A396EmprCod, T00SL82_A1166LecMaqCod
            }
            , new Object[] {
            T00SL83_A396EmprCod, T00SL83_A1161TurnCod
            }
            , new Object[] {
            T00SL84_A396EmprCod, T00SL84_A1146DisDisCod, T00SL84_A1139DisBarCod, T00SL84_A1140DisBarReo, T00SL84_A1141DisBarPar
            }
            , new Object[] {
            T00SL85_A396EmprCod, T00SL85_A996TipCon
            }
            , new Object[] {
            T00SL86_A396EmprCod, T00SL86_A970ProceCod
            }
            , new Object[] {
            T00SL87_A396EmprCod, T00SL87_A30AlbProCod, T00SL87_A915AlbPObsLin
            }
            , new Object[] {
            T00SL88_A396EmprCod, T00SL88_A910Workstat
            }
            , new Object[] {
            T00SL89_A396EmprCod, T00SL89_A129BarCod, T00SL89_A132BarCodReo, T00SL89_A130BarCodPar, T00SL89_A906ObsReoLin
            }
            , new Object[] {
            T00SL90_A396EmprCod, T00SL90_A656ParCod
            }
            , new Object[] {
            T00SL91_A396EmprCod, T00SL91_A859CumCodCont
            }
            , new Object[] {
            T00SL92_A396EmprCod, T00SL92_A490ForPrdUMe
            }
            , new Object[] {
            T00SL93_A396EmprCod, T00SL93_A840TrnCod
            }
            , new Object[] {
            T00SL94_A396EmprCod, T00SL94_A856ValCod
            }
            , new Object[] {
            T00SL95_A396EmprCod, T00SL95_A848UniCod
            }
            , new Object[] {
            T00SL96_A396EmprCod, T00SL96_A687PrdCod
            }
            , new Object[] {
            T00SL97_A396EmprCod, T00SL97_A835TipDtoCod
            }
            , new Object[] {
            T00SL98_A396EmprCod, T00SL98_A833TipDefCod
            }
            , new Object[] {
            T00SL99_A396EmprCod, T00SL99_A831TipColCod
            }
            , new Object[] {
            T00SL100_A396EmprCod, T00SL100_A829TipArtCod
            }
            , new Object[] {
            T00SL101_A396EmprCod, T00SL101_A719PrdNum, T00SL101_A810RecFec
            }
            , new Object[] {
            T00SL102_A396EmprCod, T00SL102_A252CliCod, T00SL102_A65ArtCod, T00SL102_A598LinRec
            }
            , new Object[] {
            T00SL103_A396EmprCod, T00SL103_A764ProForCod
            }
            , new Object[] {
            T00SL104_A396EmprCod, T00SL104_A758ProCod
            }
            , new Object[] {
            T00SL105_A396EmprCod, T00SL105_A252CliCod, T00SL105_A457FasCod
            }
            , new Object[] {
            T00SL106_A396EmprCod, T00SL106_A719PrdNum, T00SL106_A681PrdAny
            }
            , new Object[] {
            T00SL107_A396EmprCod, T00SL107_A719PrdNum, T00SL107_A680PrdAltNum
            }
            , new Object[] {
            T00SL108_A396EmprCod, T00SL108_A658PedCod, T00SL108_A719PrdNum
            }
            , new Object[] {
            T00SL109_A396EmprCod, T00SL109_A652OpeCod
            }
            , new Object[] {
            T00SL110_A396EmprCod, T00SL110_A629MetCod
            }
            , new Object[] {
            T00SL111_A396EmprCod, T00SL111_A626MatCod
            }
            , new Object[] {
            T00SL112_A396EmprCod, T00SL112_A602MaqCod
            }
            , new Object[] {
            T00SL113_A396EmprCod, T00SL113_A583IntCod
            }
            , new Object[] {
            T00SL114_A396EmprCod, T00SL114_A506HbaBarCod, T00SL114_A508HbaBarReo, T00SL114_A507HbaBarPar
            }
            , new Object[] {
            T00SL115_A396EmprCod, T00SL115_A503GruOpeCod
            }
            , new Object[] {
            T00SL116_A396EmprCod, T00SL116_A501GruMaqCod
            }
            , new Object[] {
            T00SL117_A396EmprCod, T00SL117_A499GrpFamCod
            }
            , new Object[] {
            T00SL118_A396EmprCod, T00SL118_A497FpgCod
            }
            , new Object[] {
            T00SL119_A396EmprCod, T00SL119_A457FasCod, T00SL119_A463FasNumLin
            }
            , new Object[] {
            T00SL120_A396EmprCod, T00SL120_A430FacCod
            }
            , new Object[] {
            T00SL121_A396EmprCod, T00SL121_A313ContCod
            }
            , new Object[] {
            T00SL122_A396EmprCod, T00SL122_A361DisCod, T00SL122_A376DisObsLin
            }
            , new Object[] {
            T00SL123_A396EmprCod, T00SL123_A361DisCod, T00SL123_A44AlbRecCod
            }
            , new Object[] {
            T00SL124_A396EmprCod, T00SL124_A486ForNumCol
            }
            , new Object[] {
            T00SL125_A396EmprCod, T00SL125_A323DevGenCod
            }
            , new Object[] {
            T00SL126_A396EmprCod, T00SL126_A719PrdNum, T00SL126_A647NumCon
            }
            , new Object[] {
            T00SL127_A396EmprCod, T00SL127_A252CliCod, T00SL127_A287CliPagLin
            }
            , new Object[] {
            T00SL128_A396EmprCod, T00SL128_A252CliCod, T00SL128_A266CliEnvLin
            }
            , new Object[] {
            T00SL129_A396EmprCod, T00SL129_A241CieBarCod, T00SL129_A243CieBarReo, T00SL129_A242CieBarPar
            }
            , new Object[] {
            T00SL130_A396EmprCod, T00SL130_A129BarCod, T00SL130_A132BarCodReo, T00SL130_A130BarCodPar, T00SL130_A200BarPieCod
            }
            , new Object[] {
            T00SL131_A396EmprCod, T00SL131_A129BarCod, T00SL131_A132BarCodReo, T00SL131_A130BarCodPar, T00SL131_A188BarNotLin
            }
            , new Object[] {
            T00SL132_A396EmprCod, T00SL132_A129BarCod, T00SL132_A132BarCodReo, T00SL132_A130BarCodPar, T00SL132_A119BarAgrCod, T00SL132_A124BarAgrReo, T00SL132_A122BarAgrPar
            }
            , new Object[] {
            T00SL133_A396EmprCod, T00SL133_A30AlbProCod
            }
            , new Object[] {
            T00SL134_A396EmprCod, T00SL134_A14AlbComCod, T00SL134_A20AlbComLin
            }
            , new Object[] {
            T00SL135_A396EmprCod
            }
            , new Object[] {
            T00SL136_A396EmprCod, T00SL136_A6007PlaPreOrd, T00SL136_A6027PlaPreCHP, T00SL136_n6027PlaPreCHP, T00SL136_A6028PlaPreCFP, T00SL136_n6028PlaPreCFP, T00SL136_A6029PlaPreCHA, T00SL136_n6029PlaPreCHA, T00SL136_A6030PlaPreCFA, T00SL136_n6030PlaPreCFA,
            T00SL136_A6010PlaPreTie, T00SL136_n6010PlaPreTie
            }
            , new Object[] {
            T00SL137_A396EmprCod, T00SL137_A6007PlaPreOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SL141_A396EmprCod, T00SL141_A6007PlaPreOrd
            }
         }
      );
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
   private short Z6010PlaPreTie ;
   private short nRcdDeleted_879 ;
   private short nRcdExists_879 ;
   private short nIsMod_879 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount879 ;
   private short RcdFound879 ;
   private short nBlankRcdUsr879 ;
   private short A6010PlaPreTie ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private short nIsDirty_879 ;
   private int nRC_GXsfl_25 ;
   private int nGXsfl_25_idx=1 ;
   private int Z6007PlaPreOrd ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_879_Enabled ;
   private int edtPlaPreOrd_Enabled ;
   private int edtPlaPreCHP_Enabled ;
   private int edtPlaPreCFP_Enabled ;
   private int edtPlaPreCHA_Enabled ;
   private int edtPlaPreCFA_Enabled ;
   private int edtPlaPreTie_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A6007PlaPreOrd ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPlaPreOrd_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6027PlaPreCHP ;
   private String Z6028PlaPreCFP ;
   private String Z6029PlaPreCHA ;
   private String Z6030PlaPreCFA ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_25_idx="0001" ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode879 ;
   private String edtavnRcdDeleted_879_Internalname ;
   private String edtPlaPreOrd_Internalname ;
   private String edtPlaPreCHP_Internalname ;
   private String edtPlaPreCFP_Internalname ;
   private String edtPlaPreCHA_Internalname ;
   private String edtPlaPreCFA_Internalname ;
   private String edtPlaPreTie_Internalname ;
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
   private String sMode27 ;
   private String GXCCtl ;
   private String A6027PlaPreCHP ;
   private String A6028PlaPreCFP ;
   private String A6029PlaPreCHA ;
   private String A6030PlaPreCFA ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_879_Jsonclick ;
   private String edtPlaPreOrd_Jsonclick ;
   private String edtPlaPreCHP_Jsonclick ;
   private String edtPlaPreCFP_Jsonclick ;
   private String edtPlaPreCHA_Jsonclick ;
   private String edtPlaPreCFA_Jsonclick ;
   private String edtPlaPreTie_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean n6027PlaPreCHP ;
   private boolean n6028PlaPreCFP ;
   private boolean n6029PlaPreCHA ;
   private boolean n6030PlaPreCFA ;
   private boolean n6010PlaPreTie ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00SL6_A396EmprCod ;
   private String[] T00SL7_A396EmprCod ;
   private String[] T00SL5_A396EmprCod ;
   private String[] T00SL8_A396EmprCod ;
   private String[] T00SL9_A396EmprCod ;
   private String[] T00SL4_A396EmprCod ;
   private String[] T00SL12_A396EmprCod ;
   private byte[] T00SL12_A3331LanBroCod ;
   private String[] T00SL13_A396EmprCod ;
   private int[] T00SL13_A252CliCod ;
   private boolean[] T00SL13_n252CliCod ;
   private java.math.BigDecimal[] T00SL13_A3320CliLimKgs ;
   private String[] T00SL14_A396EmprCod ;
   private int[] T00SL14_A252CliCod ;
   private boolean[] T00SL14_n252CliCod ;
   private String[] T00SL14_A65ArtCod ;
   private java.math.BigDecimal[] T00SL14_A3319ArtCapKgs ;
   private String[] T00SL15_A396EmprCod ;
   private short[] T00SL15_A3316CodSol ;
   private String[] T00SL16_A396EmprCod ;
   private String[] T00SL16_A3288CCalCod ;
   private String[] T00SL17_A396EmprCod ;
   private int[] T00SL17_A3253SolTraCod ;
   private byte[] T00SL17_A3269SolTraLin ;
   private String[] T00SL18_A396EmprCod ;
   private int[] T00SL18_A3235SolSubCod ;
   private byte[] T00SL18_A3251SolSubLin ;
   private String[] T00SL19_A396EmprCod ;
   private int[] T00SL19_A3218SolLuzCod ;
   private byte[] T00SL19_A3233SolLuzLin ;
   private String[] T00SL20_A396EmprCod ;
   private int[] T00SL20_A3196SolFriCod ;
   private byte[] T00SL20_A3216SolFriLin ;
   private String[] T00SL21_A396EmprCod ;
   private int[] T00SL21_A3165SolPilCod ;
   private byte[] T00SL21_A3185SolPilLin ;
   private String[] T00SL22_A396EmprCod ;
   private String[] T00SL22_A3153CodCod ;
   private String[] T00SL23_A396EmprCod ;
   private String[] T00SL23_A3073RepCod ;
   private String[] T00SL24_A396EmprCod ;
   private byte[] T00SL24_A3061Codia ;
   private byte[] T00SL24_A3062CoMes ;
   private short[] T00SL24_A3063CoAny ;
   private String[] T00SL25_A396EmprCod ;
   private String[] T00SL25_A3047LOParId ;
   private String[] T00SL26_A396EmprCod ;
   private String[] T00SL26_A3033CCCod ;
   private String[] T00SL27_A396EmprCod ;
   private int[] T00SL27_A2971SabFacCod ;
   private String[] T00SL28_A396EmprCod ;
   private byte[] T00SL28_A2954TiDia ;
   private byte[] T00SL28_A2955TiMes ;
   private short[] T00SL28_A2956TiAny ;
   private String[] T00SL29_A396EmprCod ;
   private byte[] T00SL29_A2942LzaDia ;
   private byte[] T00SL29_A2943LzaMes ;
   private short[] T00SL29_A2944LzaAny ;
   private String[] T00SL30_A396EmprCod ;
   private int[] T00SL30_A252CliCod ;
   private boolean[] T00SL30_n252CliCod ;
   private String[] T00SL30_A65ArtCod ;
   private byte[] T00SL30_A2937RecIntCod ;
   private String[] T00SL31_A396EmprCod ;
   private int[] T00SL31_A252CliCod ;
   private boolean[] T00SL31_n252CliCod ;
   private short[] T00SL31_A2933RecTipCon ;
   private String[] T00SL32_A396EmprCod ;
   private int[] T00SL32_A252CliCod ;
   private boolean[] T00SL32_n252CliCod ;
   private String[] T00SL32_A65ArtCod ;
   private short[] T00SL32_A2931Limite2 ;
   private String[] T00SL33_A396EmprCod ;
   private int[] T00SL33_A252CliCod ;
   private boolean[] T00SL33_n252CliCod ;
   private String[] T00SL33_A2927RecProCod ;
   private String[] T00SL34_A396EmprCod ;
   private String[] T00SL34_A2921HisProTiCo ;
   private short[] T00SL34_A2922HisProTiLP ;
   private java.util.Date[] T00SL34_A2913HisProTiFe ;
   private short[] T00SL34_A2923HisProTiL ;
   private String[] T00SL35_A396EmprCod ;
   private int[] T00SL35_A252CliCod ;
   private boolean[] T00SL35_n252CliCod ;
   private String[] T00SL35_A2891HMaForSer ;
   private String[] T00SL35_A2892HMaForCNom ;
   private int[] T00SL35_A2893HMaForCNum ;
   private byte[] T00SL35_A2894HMaTipCCod ;
   private int[] T00SL35_A2895HMaForNumC ;
   private short[] T00SL35_A2897HMaColLin ;
   private java.util.Date[] T00SL35_A2896HMaFec ;
   private short[] T00SL35_A2907HmaLin ;
   private String[] T00SL36_A396EmprCod ;
   private int[] T00SL36_A129BarCod ;
   private boolean[] T00SL36_n129BarCod ;
   private byte[] T00SL36_A132BarCodReo ;
   private boolean[] T00SL36_n132BarCodReo ;
   private String[] T00SL36_A130BarCodPar ;
   private boolean[] T00SL36_n130BarCodPar ;
   private short[] T00SL36_A2872HAnRLinMaq ;
   private byte[] T00SL36_A2873HAnRLinPro ;
   private short[] T00SL36_A2874HAnRLin ;
   private byte[] T00SL36_A2875HAnNumAny ;
   private String[] T00SL37_A396EmprCod ;
   private int[] T00SL37_A2855CodBota ;
   private short[] T00SL37_A2859BotLin ;
   private String[] T00SL38_A396EmprCod ;
   private byte[] T00SL38_A2853TipBotCod ;
   private String[] T00SL39_A396EmprCod ;
   private String[] T00SL39_A2817PlaTer ;
   private short[] T00SL39_A2818PlaOrd ;
   private String[] T00SL40_A396EmprCod ;
   private String[] T00SL40_A2809MetTerCod ;
   private int[] T00SL40_A129BarCod ;
   private boolean[] T00SL40_n129BarCod ;
   private byte[] T00SL40_A132BarCodReo ;
   private boolean[] T00SL40_n132BarCodReo ;
   private String[] T00SL40_A130BarCodPar ;
   private boolean[] T00SL40_n130BarCodPar ;
   private String[] T00SL41_A396EmprCod ;
   private int[] T00SL41_A129BarCod ;
   private boolean[] T00SL41_n129BarCod ;
   private byte[] T00SL41_A132BarCodReo ;
   private boolean[] T00SL41_n132BarCodReo ;
   private String[] T00SL41_A130BarCodPar ;
   private boolean[] T00SL41_n130BarCodPar ;
   private short[] T00SL41_A2808RecLinMAL ;
   private byte[] T00SL41_A1377RecNumAny ;
   private String[] T00SL41_A719PrdNum ;
   private String[] T00SL42_A396EmprCod ;
   private String[] T00SL42_A2792TermiCod ;
   private int[] T00SL42_A129BarCod ;
   private boolean[] T00SL42_n129BarCod ;
   private byte[] T00SL42_A132BarCodReo ;
   private boolean[] T00SL42_n132BarCodReo ;
   private String[] T00SL42_A130BarCodPar ;
   private boolean[] T00SL42_n130BarCodPar ;
   private String[] T00SL43_A396EmprCod ;
   private long[] T00SL43_A30AlbProCod ;
   private int[] T00SL43_A129BarCod ;
   private boolean[] T00SL43_n129BarCod ;
   private byte[] T00SL43_A132BarCodReo ;
   private boolean[] T00SL43_n132BarCodReo ;
   private String[] T00SL43_A130BarCodPar ;
   private boolean[] T00SL43_n130BarCodPar ;
   private short[] T00SL43_A2764AlbHdrLin ;
   private String[] T00SL44_A396EmprCod ;
   private int[] T00SL44_A252CliCod ;
   private boolean[] T00SL44_n252CliCod ;
   private String[] T00SL44_A65ArtCod ;
   private short[] T00SL44_A71ArtEstAny ;
   private String[] T00SL44_A2756ArtEstSer ;
   private String[] T00SL45_A396EmprCod ;
   private int[] T00SL45_A252CliCod ;
   private boolean[] T00SL45_n252CliCod ;
   private short[] T00SL45_A425EstAny ;
   private String[] T00SL45_A2755EstSerFac ;
   private String[] T00SL46_A396EmprCod ;
   private short[] T00SL46_A2730RecTipCo ;
   private int[] T00SL46_A252CliCod ;
   private boolean[] T00SL46_n252CliCod ;
   private String[] T00SL47_A396EmprCod ;
   private String[] T00SL47_A2707NumTexCod ;
   private String[] T00SL48_A396EmprCod ;
   private int[] T00SL48_A129BarCod ;
   private boolean[] T00SL48_n129BarCod ;
   private byte[] T00SL48_A132BarCodReo ;
   private boolean[] T00SL48_n132BarCodReo ;
   private String[] T00SL48_A130BarCodPar ;
   private boolean[] T00SL48_n130BarCodPar ;
   private String[] T00SL48_A2494BarDosPro ;
   private String[] T00SL48_A719PrdNum ;
   private String[] T00SL49_A396EmprCod ;
   private int[] T00SL49_A658PedCod ;
   private byte[] T00SL49_A2501PedObsLin ;
   private String[] T00SL50_A396EmprCod ;
   private int[] T00SL50_A129BarCod ;
   private boolean[] T00SL50_n129BarCod ;
   private byte[] T00SL50_A132BarCodReo ;
   private boolean[] T00SL50_n132BarCodReo ;
   private String[] T00SL50_A130BarCodPar ;
   private boolean[] T00SL50_n130BarCodPar ;
   private short[] T00SL50_A2457BarObLin ;
   private String[] T00SL51_A396EmprCod ;
   private int[] T00SL51_A129BarCod ;
   private boolean[] T00SL51_n129BarCod ;
   private byte[] T00SL51_A132BarCodReo ;
   private boolean[] T00SL51_n132BarCodReo ;
   private String[] T00SL51_A130BarCodPar ;
   private boolean[] T00SL51_n130BarCodPar ;
   private short[] T00SL51_A2444BarEnLin ;
   private String[] T00SL52_A396EmprCod ;
   private int[] T00SL52_A2429TerBarCod ;
   private byte[] T00SL52_A2431TerBarReo ;
   private String[] T00SL52_A2430TerBarPar ;
   private String[] T00SL53_A396EmprCod ;
   private int[] T00SL53_A2420OpeAntCod ;
   private String[] T00SL54_A396EmprCod ;
   private int[] T00SL54_A2406ExhAlbCod ;
   private short[] T00SL54_A2416ExhObsLin ;
   private String[] T00SL55_A396EmprCod ;
   private int[] T00SL55_A2406ExhAlbCod ;
   private int[] T00SL55_A129BarCod ;
   private boolean[] T00SL55_n129BarCod ;
   private byte[] T00SL55_A132BarCodReo ;
   private boolean[] T00SL55_n132BarCodReo ;
   private String[] T00SL55_A130BarCodPar ;
   private boolean[] T00SL55_n130BarCodPar ;
   private String[] T00SL56_A396EmprCod ;
   private int[] T00SL56_A14AlbComCod ;
   private byte[] T00SL56_A2386AlbCObsLin ;
   private String[] T00SL57_A396EmprCod ;
   private String[] T00SL57_A2382AbcTerCod ;
   private String[] T00SL57_A2381AbcSec ;
   private int[] T00SL57_A252CliCod ;
   private boolean[] T00SL57_n252CliCod ;
   private String[] T00SL58_A396EmprCod ;
   private int[] T00SL58_A252CliCod ;
   private boolean[] T00SL58_n252CliCod ;
   private int[] T00SL58_A2308CliDesCod ;
   private String[] T00SL59_A396EmprCod ;
   private String[] T00SL59_A2268MovParCod ;
   private int[] T00SL59_A252CliCod ;
   private boolean[] T00SL59_n252CliCod ;
   private short[] T00SL59_A2276MovParLin ;
   private String[] T00SL60_A396EmprCod ;
   private int[] T00SL60_A2253SalExtAlb ;
   private int[] T00SL60_A129BarCod ;
   private boolean[] T00SL60_n129BarCod ;
   private byte[] T00SL60_A132BarCodReo ;
   private boolean[] T00SL60_n132BarCodReo ;
   private String[] T00SL60_A130BarCodPar ;
   private boolean[] T00SL60_n130BarCodPar ;
   private String[] T00SL61_A396EmprCod ;
   private short[] T00SL61_A2248ManCod ;
   private String[] T00SL62_A396EmprCod ;
   private int[] T00SL62_A44AlbRecCod ;
   private String[] T00SL62_A2159AlbRecPie ;
   private String[] T00SL63_A396EmprCod ;
   private int[] T00SL63_A44AlbRecCod ;
   private short[] T00SL63_A2165HisEmpLin ;
   private String[] T00SL64_A396EmprCod ;
   private String[] T00SL64_A1794GruLecMaq ;
   private byte[] T00SL64_A1795GruOrd ;
   private int[] T00SL64_A1791GruBarCod ;
   private byte[] T00SL64_A1793GruBarReo ;
   private String[] T00SL64_A1792GruBarPar ;
   private String[] T00SL65_A396EmprCod ;
   private short[] T00SL65_A1664ParFasCod ;
   private String[] T00SL66_A396EmprCod ;
   private String[] T00SL66_A1514MacProCod ;
   private String[] T00SL67_A396EmprCod ;
   private int[] T00SL67_A252CliCod ;
   private boolean[] T00SL67_n252CliCod ;
   private String[] T00SL67_A1504CliProCod ;
   private String[] T00SL67_A65ArtCod ;
   private String[] T00SL68_A396EmprCod ;
   private String[] T00SL68_A1438BarTerCod ;
   private short[] T00SL68_A172BarLanLin ;
   private String[] T00SL69_A396EmprCod ;
   private int[] T00SL69_A1387AlbPrvCod ;
   private String[] T00SL70_A396EmprCod ;
   private int[] T00SL70_A44AlbRecCod ;
   private byte[] T00SL70_A1299AlbRLin ;
   private String[] T00SL71_A396EmprCod ;
   private short[] T00SL71_A858ZonGeoCod ;
   private String[] T00SL72_A396EmprCod ;
   private int[] T00SL72_A1348SolColCod ;
   private byte[] T00SL72_A1351SolColLin ;
   private String[] T00SL73_A396EmprCod ;
   private int[] T00SL73_A1333EstDimCod ;
   private byte[] T00SL73_A1339EstDimLin ;
   private String[] T00SL74_A396EmprCod ;
   private int[] T00SL74_A1314EnsLabCod ;
   private String[] T00SL75_A396EmprCod ;
   private int[] T00SL75_A252CliCod ;
   private boolean[] T00SL75_n252CliCod ;
   private String[] T00SL75_A1213TalCod ;
   private String[] T00SL75_A1293EntMarRef ;
   private String[] T00SL76_A396EmprCod ;
   private short[] T00SL76_A1206TubCod ;
   private String[] T00SL77_A396EmprCod ;
   private int[] T00SL77_A252CliCod ;
   private boolean[] T00SL77_n252CliCod ;
   private String[] T00SL77_A1213TalCod ;
   private short[] T00SL77_A1217EntMalLin ;
   private String[] T00SL78_A396EmprCod ;
   private int[] T00SL78_A1199MacCod ;
   private String[] T00SL79_A396EmprCod ;
   private short[] T00SL79_A1209DesCod ;
   private String[] T00SL80_A396EmprCod ;
   private short[] T00SL80_A1211TipEntCod ;
   private String[] T00SL81_A396EmprCod ;
   private String[] T00SL81_A688PrdComCod ;
   private String[] T00SL82_A396EmprCod ;
   private String[] T00SL82_A1166LecMaqCod ;
   private String[] T00SL83_A396EmprCod ;
   private byte[] T00SL83_A1161TurnCod ;
   private String[] T00SL84_A396EmprCod ;
   private int[] T00SL84_A1146DisDisCod ;
   private int[] T00SL84_A1139DisBarCod ;
   private byte[] T00SL84_A1140DisBarReo ;
   private String[] T00SL84_A1141DisBarPar ;
   private String[] T00SL85_A396EmprCod ;
   private short[] T00SL85_A996TipCon ;
   private String[] T00SL86_A396EmprCod ;
   private short[] T00SL86_A970ProceCod ;
   private String[] T00SL87_A396EmprCod ;
   private long[] T00SL87_A30AlbProCod ;
   private byte[] T00SL87_A915AlbPObsLin ;
   private String[] T00SL88_A396EmprCod ;
   private String[] T00SL88_A910Workstat ;
   private String[] T00SL89_A396EmprCod ;
   private int[] T00SL89_A129BarCod ;
   private boolean[] T00SL89_n129BarCod ;
   private byte[] T00SL89_A132BarCodReo ;
   private boolean[] T00SL89_n132BarCodReo ;
   private String[] T00SL89_A130BarCodPar ;
   private boolean[] T00SL89_n130BarCodPar ;
   private byte[] T00SL89_A906ObsReoLin ;
   private String[] T00SL90_A396EmprCod ;
   private short[] T00SL90_A656ParCod ;
   private String[] T00SL91_A396EmprCod ;
   private int[] T00SL91_A859CumCodCont ;
   private String[] T00SL92_A396EmprCod ;
   private byte[] T00SL92_A490ForPrdUMe ;
   private String[] T00SL93_A396EmprCod ;
   private short[] T00SL93_A840TrnCod ;
   private String[] T00SL94_A396EmprCod ;
   private byte[] T00SL94_A856ValCod ;
   private String[] T00SL95_A396EmprCod ;
   private byte[] T00SL95_A848UniCod ;
   private String[] T00SL96_A396EmprCod ;
   private byte[] T00SL96_A687PrdCod ;
   private String[] T00SL97_A396EmprCod ;
   private byte[] T00SL97_A835TipDtoCod ;
   private String[] T00SL98_A396EmprCod ;
   private short[] T00SL98_A833TipDefCod ;
   private String[] T00SL99_A396EmprCod ;
   private byte[] T00SL99_A831TipColCod ;
   private String[] T00SL100_A396EmprCod ;
   private short[] T00SL100_A829TipArtCod ;
   private String[] T00SL101_A396EmprCod ;
   private String[] T00SL101_A719PrdNum ;
   private java.util.Date[] T00SL101_A810RecFec ;
   private String[] T00SL102_A396EmprCod ;
   private int[] T00SL102_A252CliCod ;
   private boolean[] T00SL102_n252CliCod ;
   private String[] T00SL102_A65ArtCod ;
   private byte[] T00SL102_A598LinRec ;
   private String[] T00SL103_A396EmprCod ;
   private String[] T00SL103_A764ProForCod ;
   private String[] T00SL104_A396EmprCod ;
   private String[] T00SL104_A758ProCod ;
   private String[] T00SL105_A396EmprCod ;
   private int[] T00SL105_A252CliCod ;
   private boolean[] T00SL105_n252CliCod ;
   private String[] T00SL105_A457FasCod ;
   private String[] T00SL106_A396EmprCod ;
   private String[] T00SL106_A719PrdNum ;
   private short[] T00SL106_A681PrdAny ;
   private String[] T00SL107_A396EmprCod ;
   private String[] T00SL107_A719PrdNum ;
   private String[] T00SL107_A680PrdAltNum ;
   private String[] T00SL108_A396EmprCod ;
   private int[] T00SL108_A658PedCod ;
   private String[] T00SL108_A719PrdNum ;
   private String[] T00SL109_A396EmprCod ;
   private int[] T00SL109_A652OpeCod ;
   private String[] T00SL110_A396EmprCod ;
   private byte[] T00SL110_A629MetCod ;
   private String[] T00SL111_A396EmprCod ;
   private short[] T00SL111_A626MatCod ;
   private String[] T00SL112_A396EmprCod ;
   private String[] T00SL112_A602MaqCod ;
   private String[] T00SL113_A396EmprCod ;
   private byte[] T00SL113_A583IntCod ;
   private String[] T00SL114_A396EmprCod ;
   private int[] T00SL114_A506HbaBarCod ;
   private byte[] T00SL114_A508HbaBarReo ;
   private String[] T00SL114_A507HbaBarPar ;
   private String[] T00SL115_A396EmprCod ;
   private int[] T00SL115_A503GruOpeCod ;
   private String[] T00SL116_A396EmprCod ;
   private String[] T00SL116_A501GruMaqCod ;
   private String[] T00SL117_A396EmprCod ;
   private byte[] T00SL117_A499GrpFamCod ;
   private String[] T00SL118_A396EmprCod ;
   private String[] T00SL118_A497FpgCod ;
   private String[] T00SL119_A396EmprCod ;
   private String[] T00SL119_A457FasCod ;
   private byte[] T00SL119_A463FasNumLin ;
   private String[] T00SL120_A396EmprCod ;
   private int[] T00SL120_A430FacCod ;
   private String[] T00SL121_A396EmprCod ;
   private String[] T00SL121_A313ContCod ;
   private String[] T00SL122_A396EmprCod ;
   private int[] T00SL122_A361DisCod ;
   private byte[] T00SL122_A376DisObsLin ;
   private String[] T00SL123_A396EmprCod ;
   private int[] T00SL123_A361DisCod ;
   private int[] T00SL123_A44AlbRecCod ;
   private String[] T00SL124_A396EmprCod ;
   private int[] T00SL124_A486ForNumCol ;
   private String[] T00SL125_A396EmprCod ;
   private int[] T00SL125_A323DevGenCod ;
   private String[] T00SL126_A396EmprCod ;
   private String[] T00SL126_A719PrdNum ;
   private int[] T00SL126_A647NumCon ;
   private String[] T00SL127_A396EmprCod ;
   private int[] T00SL127_A252CliCod ;
   private boolean[] T00SL127_n252CliCod ;
   private byte[] T00SL127_A287CliPagLin ;
   private String[] T00SL128_A396EmprCod ;
   private int[] T00SL128_A252CliCod ;
   private boolean[] T00SL128_n252CliCod ;
   private byte[] T00SL128_A266CliEnvLin ;
   private String[] T00SL129_A396EmprCod ;
   private int[] T00SL129_A241CieBarCod ;
   private byte[] T00SL129_A243CieBarReo ;
   private String[] T00SL129_A242CieBarPar ;
   private String[] T00SL130_A396EmprCod ;
   private int[] T00SL130_A129BarCod ;
   private boolean[] T00SL130_n129BarCod ;
   private byte[] T00SL130_A132BarCodReo ;
   private boolean[] T00SL130_n132BarCodReo ;
   private String[] T00SL130_A130BarCodPar ;
   private boolean[] T00SL130_n130BarCodPar ;
   private String[] T00SL130_A200BarPieCod ;
   private String[] T00SL131_A396EmprCod ;
   private int[] T00SL131_A129BarCod ;
   private boolean[] T00SL131_n129BarCod ;
   private byte[] T00SL131_A132BarCodReo ;
   private boolean[] T00SL131_n132BarCodReo ;
   private String[] T00SL131_A130BarCodPar ;
   private boolean[] T00SL131_n130BarCodPar ;
   private byte[] T00SL131_A188BarNotLin ;
   private String[] T00SL132_A396EmprCod ;
   private int[] T00SL132_A129BarCod ;
   private boolean[] T00SL132_n129BarCod ;
   private byte[] T00SL132_A132BarCodReo ;
   private boolean[] T00SL132_n132BarCodReo ;
   private String[] T00SL132_A130BarCodPar ;
   private boolean[] T00SL132_n130BarCodPar ;
   private int[] T00SL132_A119BarAgrCod ;
   private byte[] T00SL132_A124BarAgrReo ;
   private String[] T00SL132_A122BarAgrPar ;
   private String[] T00SL133_A396EmprCod ;
   private long[] T00SL133_A30AlbProCod ;
   private String[] T00SL134_A396EmprCod ;
   private int[] T00SL134_A14AlbComCod ;
   private short[] T00SL134_A20AlbComLin ;
   private String[] T00SL135_A396EmprCod ;
   private String[] T00SL136_A396EmprCod ;
   private int[] T00SL136_A6007PlaPreOrd ;
   private String[] T00SL136_A6027PlaPreCHP ;
   private boolean[] T00SL136_n6027PlaPreCHP ;
   private String[] T00SL136_A6028PlaPreCFP ;
   private boolean[] T00SL136_n6028PlaPreCFP ;
   private String[] T00SL136_A6029PlaPreCHA ;
   private boolean[] T00SL136_n6029PlaPreCHA ;
   private String[] T00SL136_A6030PlaPreCFA ;
   private boolean[] T00SL136_n6030PlaPreCFA ;
   private short[] T00SL136_A6010PlaPreTie ;
   private boolean[] T00SL136_n6010PlaPreTie ;
   private String[] T00SL137_A396EmprCod ;
   private int[] T00SL137_A6007PlaPreOrd ;
   private String[] T00SL3_A396EmprCod ;
   private int[] T00SL3_A6007PlaPreOrd ;
   private String[] T00SL3_A6027PlaPreCHP ;
   private boolean[] T00SL3_n6027PlaPreCHP ;
   private String[] T00SL3_A6028PlaPreCFP ;
   private boolean[] T00SL3_n6028PlaPreCFP ;
   private String[] T00SL3_A6029PlaPreCHA ;
   private boolean[] T00SL3_n6029PlaPreCHA ;
   private String[] T00SL3_A6030PlaPreCFA ;
   private boolean[] T00SL3_n6030PlaPreCFA ;
   private short[] T00SL3_A6010PlaPreTie ;
   private boolean[] T00SL3_n6010PlaPreTie ;
   private String[] T00SL2_A396EmprCod ;
   private int[] T00SL2_A6007PlaPreOrd ;
   private String[] T00SL2_A6027PlaPreCHP ;
   private boolean[] T00SL2_n6027PlaPreCHP ;
   private String[] T00SL2_A6028PlaPreCFP ;
   private boolean[] T00SL2_n6028PlaPreCFP ;
   private String[] T00SL2_A6029PlaPreCHA ;
   private boolean[] T00SL2_n6029PlaPreCHA ;
   private String[] T00SL2_A6030PlaPreCFA ;
   private boolean[] T00SL2_n6030PlaPreCFA ;
   private short[] T00SL2_A6010PlaPreTie ;
   private boolean[] T00SL2_n6010PlaPreTie ;
   private String[] T00SL141_A396EmprCod ;
   private int[] T00SL141_A6007PlaPreOrd ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplapre__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplapre__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplapre__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplapre__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplapre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00SL2", "SELECT EmprCod, PlaPreOrd, PlaPreCHP, PlaPreCFP, PlaPreCHA, PlaPreCFA, PlaPreTie FROM TXPPlaPre WHERE EmprCod = ? AND PlaPreOrd = ?  FOR UPDATE OF PlaPreCHP, PlaPreCFP, PlaPreCHA, PlaPreCFA, PlaPreTie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL3", "SELECT EmprCod, PlaPreOrd, PlaPreCHP, PlaPreCFP, PlaPreCHA, PlaPreCFA, PlaPreTie FROM TXPPlaPre WHERE EmprCod = ? AND PlaPreOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL4", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL5", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL6", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprCod FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod > ?) ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod < ?) ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00SL10", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Colombia, Auc_ULin, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmpItm7, PtosUltID, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00SL11", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T00SL12", "SELECT * FROM (SELECT EmprCod, LanBroCod FROM TXPLANBRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL13", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL14", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL15", "SELECT * FROM (SELECT EmprCod, CodSol FROM TXPSOLIDE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL16", "SELECT * FROM (SELECT EmprCod, CCalCod FROM TXPCONCAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL17", "SELECT * FROM (SELECT EmprCod, SolTraCod, SolTraLin FROM TXPLTRASP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL18", "SELECT * FROM (SELECT EmprCod, SolSubCod, SolSubLin FROM TXPLSUBLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL19", "SELECT * FROM (SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL20", "SELECT * FROM (SELECT EmprCod, SolFriCod, SolFriLin FROM TXPLFRICC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL21", "SELECT * FROM (SELECT EmprCod, SolPilCod, SolPilLin FROM TXPLPILLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL22", "SELECT * FROM (SELECT EmprCod, CodCod FROM TXPCODFAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL23", "SELECT * FROM (SELECT EmprCod, RepCod FROM TXPREPRES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL24", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny FROM TXPCCOSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL25", "SELECT * FROM (SELECT EmprCod, LOParId FROM TXPLOPara WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL26", "SELECT * FROM (SELECT EmprCod, CCCod FROM TXPCCSer WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL27", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL28", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL29", "SELECT * FROM (SELECT EmprCod, LzaDia, LzaMes, LzaAny FROM TXPCKGSLA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL31", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL33", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL34", "SELECT * FROM (SELECT EmprCod, HisProTiCo, HisProTiLP, HisProTiFe, HisProTiL FROM TXPHISTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL35", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL37", "SELECT * FROM (SELECT EmprCod, CodBota, BotLin FROM TXPLBOTAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL38", "SELECT * FROM (SELECT EmprCod, TipBotCod FROM TXPTIPBOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL39", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL40", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL42", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL43", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL45", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL46", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL47", "SELECT * FROM (SELECT EmprCod, NumTexCod FROM TXPNUMTEX WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL49", "SELECT * FROM (SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL50", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL51", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL52", "SELECT * FROM (SELECT EmprCod, TerBarCod, TerBarReo, TerBarPar FROM TXPENVTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL53", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprOpe = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL54", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, ExhObsLin FROM TXPOEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL55", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL56", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL57", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL58", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL59", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod, MovParLin FROM TXPLMOVPD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL60", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL61", "SELECT * FROM (SELECT EmprCod, ManCod FROM TXPMANUFA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL62", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL63", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL64", "SELECT * FROM (SELECT EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar FROM TXPGRULEC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL65", "SELECT * FROM (SELECT EmprCod, ParFasCod FROM TXPPARFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL66", "SELECT * FROM (SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL67", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL68", "SELECT * FROM (SELECT EmprCod, BarTerCod, BarLanLin FROM TXPBARLAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL69", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL70", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL71", "SELECT * FROM (SELECT EmprCod, ZonGeoCod FROM TXPZONGEO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL72", "SELECT * FROM (SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL73", "SELECT * FROM (SELECT EmprCod, EstDimCod, EstDimLin FROM TXPLESDIM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL74", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL75", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMarRef FROM TXPENTMAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL76", "SELECT * FROM (SELECT EmprCod, TubCod FROM TXPTUBOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL77", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMalLin FROM TXPLENTMA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL78", "SELECT * FROM (SELECT EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL79", "SELECT * FROM (SELECT EmprCod, DesCod FROM TXPDESTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL80", "SELECT * FROM (SELECT EmprCod, TipEntCod FROM TXPENTRAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL81", "SELECT * FROM (SELECT EmprCod, PrdComCod FROM TXPCPRDCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL82", "SELECT * FROM (SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL83", "SELECT * FROM (SELECT EmprCod, TurnCod FROM TXPTURNOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL84", "SELECT * FROM (SELECT EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar FROM TXPDISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL85", "SELECT * FROM (SELECT EmprCod, TipCon FROM TXPTIPCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL86", "SELECT * FROM (SELECT EmprCod, ProceCod FROM TXPPROCED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL87", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL88", "SELECT * FROM (SELECT EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL89", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL90", "SELECT * FROM (SELECT EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL91", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL92", "SELECT * FROM (SELECT EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL93", "SELECT * FROM (SELECT EmprCod, TrnCod FROM TXPTRANSP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL94", "SELECT * FROM (SELECT EmprCod, ValCod FROM TXPTIPVAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL95", "SELECT * FROM (SELECT EmprCod, UniCod FROM TXPTIPUNI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL96", "SELECT * FROM (SELECT EmprCod, PrdCod FROM TXPTIPPRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL97", "SELECT * FROM (SELECT EmprCod, TipDtoCod FROM TXPTIPDTO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL98", "SELECT * FROM (SELECT EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL99", "SELECT * FROM (SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL100", "SELECT * FROM (SELECT EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL101", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL102", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL103", "SELECT * FROM (SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL104", "SELECT * FROM (SELECT EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL105", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL106", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL107", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL108", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL109", "SELECT * FROM (SELECT EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL110", "SELECT * FROM (SELECT EmprCod, MetCod FROM TXPMETPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL111", "SELECT * FROM (SELECT EmprCod, MatCod FROM TXPMATICE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL112", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL113", "SELECT * FROM (SELECT EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL114", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL115", "SELECT * FROM (SELECT EmprCod, GruOpeCod FROM TXPCGRUOP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL116", "SELECT * FROM (SELECT EmprCod, GruMaqCod FROM TXPGRUMAQ WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL117", "SELECT * FROM (SELECT EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL118", "SELECT * FROM (SELECT EmprCod, FpgCod FROM TXPFORPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL119", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL120", "SELECT * FROM (SELECT EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL121", "SELECT * FROM (SELECT EmprCod, ContCod FROM TXPEMPLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL122", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL123", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL124", "SELECT * FROM (SELECT EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL125", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL126", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL127", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL128", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL129", "SELECT * FROM (SELECT EmprCod, CieBarCod, CieBarReo, CieBarPar FROM TXPCIETIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL130", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL131", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL132", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL133", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL134", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SL135", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL136", "SELECT EmprCod, PlaPreOrd, PlaPreCHP, PlaPreCFP, PlaPreCHA, PlaPreCFA, PlaPreTie FROM TXPPlaPre WHERE EmprCod = ? and PlaPreOrd = ? ORDER BY EmprCod, PlaPreOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SL137", "SELECT EmprCod, PlaPreOrd FROM TXPPlaPre WHERE EmprCod = ? AND PlaPreOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00SL138", "INSERT INTO TXPPlaPre(EmprCod, PlaPreOrd, PlaPreCHP, PlaPreCFP, PlaPreCHA, PlaPreCFA, PlaPreTie) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPlaPre")
         ,new UpdateCursor("T00SL139", "UPDATE TXPPlaPre SET PlaPreCHP=?, PlaPreCFP=?, PlaPreCHA=?, PlaPreCFA=?, PlaPreTie=?  WHERE EmprCod = ? AND PlaPreOrd = ?", GX_NOMASK, "TXPPlaPre")
         ,new UpdateCursor("T00SL140", "DELETE FROM TXPPlaPre  WHERE EmprCod = ? AND PlaPreOrd = ?", GX_NOMASK, "TXPPlaPre")
         ,new ForEachCursor("T00SL141", "SELECT EmprCod, PlaPreOrd FROM TXPPlaPre WHERE EmprCod = ? ORDER BY EmprCod, PlaPreOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 255);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 255);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 255);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 255);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 255);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 255);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 255);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 255);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 127 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 128 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 130 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 131 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 132 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 133 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 134 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 255);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 255);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 255);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 255);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 135 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 139 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 105 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 111 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 115 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 116 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 117 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 124 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 126 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 127 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 128 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 129 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 130 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 131 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 132 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 134 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 135 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 136 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 255);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 255);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 255);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 255);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               return;
            case 137 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 255);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 255);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 255);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 255);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 138 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 139 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

