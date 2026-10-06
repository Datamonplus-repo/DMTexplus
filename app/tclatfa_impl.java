package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclatfa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10042ArtMqFa = httpContext.GetPar( "ArtMqFa") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A10042ArtMqFa) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FACTOR ABSORCION CL-ART-S_H-MQ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtArtSH_Internalname ;
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

   public tclatfa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclatfa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclatfa_impl.class ));
   }

   public tclatfa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLATFA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Seco o Humedo?", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLATFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtSH_Internalname, GXutil.rtrim( A10041ArtSH), GXutil.rtrim( localUtil.format( A10041ArtSH, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtSH_Jsonclick, 0, "", "", "", "", "", 1, edtArtSH_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
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
         nBlankRcdCount1365 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1365 = (short)(1) ;
            scanStart16V1365( ) ;
            while ( RcdFound1365 != 0 )
            {
               init_level_properties1365( ) ;
               getByPrimaryKey16V1365( ) ;
               addRow16V1365( ) ;
               scanNext16V1365( ) ;
            }
            scanEnd16V1365( ) ;
            nBlankRcdCount1365 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal16V1365( ) ;
         standaloneModal16V1365( ) ;
         sMode1365 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow16V1365( ) ;
            edtavnRcdDeleted_1365_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1365_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1365_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1365_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtArtMqFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTMQFA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtMqFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqFa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtArtMqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTMQDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtMqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtArtFaMq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTFAMQ_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtFaMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFaMq_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1365 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16V1365( ) ;
            }
            sendRow16V1365( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1365 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1365 = (short)(5) ;
         nRcdExists_1365 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16V1365( ) ;
            while ( RcdFound1365 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551365( ) ;
               init_level_properties1365( ) ;
               standaloneNotModal16V1365( ) ;
               getByPrimaryKey16V1365( ) ;
               standaloneModal16V1365( ) ;
               addRow16V1365( ) ;
               scanNext16V1365( ) ;
            }
            scanEnd16V1365( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1365 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551365( ) ;
      initAll16V1365( ) ;
      init_level_properties1365( ) ;
      nRcdExists_1365 = (short)(0) ;
      nIsMod_1365 = (short)(0) ;
      nRcdDeleted_1365 = (short)(0) ;
      nBlankRcdCount1365 = (short)(nBlankRcdUsr1365+nBlankRcdCount1365) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1365 > 0 )
      {
         standaloneNotModal16V1365( ) ;
         standaloneModal16V1365( ) ;
         addRow16V1365( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtArtMqFa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1365 = (short)(nBlankRcdCount1365-1) ;
      }
      Gx_mode = sMode1365 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLATFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLATFA.htm");
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
      e1116V2 ();
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
            Z10041ArtSH = httpContext.cgiGet( "Z10041ArtSH") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A10041ArtSH = httpContext.cgiGet( edtArtSH_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
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
               A10041ArtSH = httpContext.GetPar( "ArtSH") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
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
                        e1116V2 ();
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
            initAll16V1364( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1365_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1365_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes16V1364( ) ;
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

   public void confirm_16V0( )
   {
      beforeValidate16V1364( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16V1364( ) ;
         }
         else
         {
            checkExtendedTable16V1364( ) ;
            if ( AnyError == 0 )
            {
               zm16V1364( 4) ;
               zm16V1364( 5) ;
               zm16V1364( 6) ;
            }
            closeExtendedTableCursors16V1364( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1364 = Gx_mode ;
         confirm_16V1365( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1364 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1364 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues16V0( ) ;
      }
   }

   public void confirm_16V1365( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16V1365( ) ;
         if ( ( nRcdExists_1365 != 0 ) || ( nIsMod_1365 != 0 ) )
         {
            getKey16V1365( ) ;
            if ( ( nRcdExists_1365 == 0 ) && ( nRcdDeleted_1365 == 0 ) )
            {
               if ( RcdFound1365 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16V1365( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16V1365( ) ;
                     if ( AnyError == 0 )
                     {
                        zm16V1365( 8) ;
                     }
                     closeExtendedTableCursors16V1365( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ARTMQFA_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtArtMqFa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1365 != 0 )
               {
                  if ( nRcdDeleted_1365 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16V1365( ) ;
                     load16V1365( ) ;
                     beforeValidate16V1365( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16V1365( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1365 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16V1365( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16V1365( ) ;
                           if ( AnyError == 0 )
                           {
                              zm16V1365( 8) ;
                           }
                           closeExtendedTableCursors16V1365( ) ;
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
                  if ( nRcdDeleted_1365 == 0 )
                  {
                     GXCCtl = "ARTMQFA_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArtMqFa_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1365_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtMqFa_Internalname, GXutil.rtrim( A10042ArtMqFa)) ;
         httpContext.changePostValue( edtArtMqDsc_Internalname, GXutil.rtrim( A10043ArtMqDsc)) ;
         httpContext.changePostValue( edtArtFaMq_Internalname, GXutil.ltrim( localUtil.ntoc( A10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10042ArtMqFa_"+sGXsfl_55_idx, GXutil.rtrim( Z10042ArtMqFa)) ;
         httpContext.changePostValue( "ZT_"+"Z10044ArtFaMq_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1365_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1365_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1365_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1365 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1365_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1365_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTMQFA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTMQDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTFAMQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFaMq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16V0( )
   {
   }

   public void e1116V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tclatfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tclatfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tclatfa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Seco o Humedo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclatfa_impl.this.A396EmprCod = GXv_char2[0] ;
      tclatfa_impl.this.AV11EmprNom = GXv_char3[0] ;
      tclatfa_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm16V1364( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z10041ArtSH = A10041ArtSH ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TCLATFA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T016V7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016V7_A407EmprNom[0] ;
      n407EmprNom = T016V7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T016V8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T016V8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T016V9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T016V9_A69ArtDsc[0] ;
      n69ArtDsc = T016V9_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(7);
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

   public void load16V1364( )
   {
      /* Using cursor T016V10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1364 = (short)(1) ;
         A407EmprNom = T016V10_A407EmprNom[0] ;
         n407EmprNom = T016V10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T016V10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T016V10_A69ArtDsc[0] ;
         n69ArtDsc = T016V10_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         zm16V1364( -3) ;
      }
      pr_default.close(8);
      onLoadActions16V1364( ) ;
   }

   public void onLoadActions16V1364( )
   {
   }

   public void checkExtendedTable16V1364( )
   {
      nIsDirty_1364 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A10041ArtSH, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(A10041ArtSH, httpContext.getMessage( "H", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar S o M", ""), 1, "ARTSH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtSH_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors16V1364( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16V1364( )
   {
      /* Using cursor T016V11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1364 = (short)(1) ;
      }
      else
      {
         RcdFound1364 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016V6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T016V6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016V6_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T016V6_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zm16V1364( 3) ;
         RcdFound1364 = (short)(1) ;
         A10041ArtSH = T016V6_A10041ArtSH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10041ArtSH = A10041ArtSH ;
         sMode1364 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16V1364( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1364 = (short)(0) ;
            initializeNonKey16V1364( ) ;
         }
         Gx_mode = sMode1364 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1364 = (short)(0) ;
         initializeNonKey16V1364( ) ;
         sMode1364 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1364 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16V1364( ) ;
      if ( RcdFound1364 == 0 )
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
      RcdFound1364 = (short)(0) ;
      /* Using cursor T016V12 */
      pr_default.execute(10, new Object[] {A10041ArtSH, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T016V12_A10041ArtSH[0], A10041ArtSH) < 0 ) ) && ( GXutil.strcmp(T016V12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016V12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T016V12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T016V12_A10041ArtSH[0], A10041ArtSH) > 0 ) ) && ( GXutil.strcmp(T016V12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016V12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T016V12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            A10041ArtSH = T016V12_A10041ArtSH[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
            RcdFound1364 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1364 = (short)(0) ;
      /* Using cursor T016V13 */
      pr_default.execute(11, new Object[] {A10041ArtSH, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T016V13_A10041ArtSH[0], A10041ArtSH) > 0 ) ) && ( GXutil.strcmp(T016V13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016V13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T016V13_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T016V13_A10041ArtSH[0], A10041ArtSH) < 0 ) ) && ( GXutil.strcmp(T016V13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016V13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T016V13_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            A10041ArtSH = T016V13_A10041ArtSH[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
            RcdFound1364 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16V1364( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtArtSH_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16V1364( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1364 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10041ArtSH, Z10041ArtSH) != 0 ) )
            {
               A10041ArtSH = Z10041ArtSH ;
               httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtArtSH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update16V1364( ) ;
               GX_FocusControl = edtArtSH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10041ArtSH, Z10041ArtSH) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtArtSH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16V1364( ) ;
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
                  GX_FocusControl = edtArtSH_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16V1364( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10041ArtSH, Z10041ArtSH) != 0 ) )
      {
         A10041ArtSH = Z10041ArtSH ;
         httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtArtSH_Internalname ;
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
      getKey16V1364( ) ;
      if ( RcdFound1364 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10041ArtSH, Z10041ArtSH) != 0 ) )
         {
            A10041ArtSH = Z10041ArtSH ;
            httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10041ArtSH, Z10041ArtSH) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclatfa");
   }

   public void insert_check( )
   {
      confirm_16V0( ) ;
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
      if ( RcdFound1364 == 0 )
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
      scanStart16V1364( ) ;
      if ( RcdFound1364 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16V1364( ) ;
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
      if ( RcdFound1364 == 0 )
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
      if ( RcdFound1364 == 0 )
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
      scanStart16V1364( ) ;
      if ( RcdFound1364 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1364 != 0 )
         {
            scanNext16V1364( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16V1364( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16V1364( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016V5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLATFA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLATFA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16V1364( )
   {
      beforeValidate16V1364( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16V1364( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16V1364( 0) ;
         checkOptimisticConcurrency16V1364( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16V1364( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16V1364( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016V14 */
                  pr_default.execute(12, new Object[] {A10041ArtSH, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLATFA");
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
                        processLevel16V1364( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16V0( ) ;
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
            load16V1364( ) ;
         }
         endLevel16V1364( ) ;
      }
      closeExtendedTableCursors16V1364( ) ;
   }

   public void update16V1364( )
   {
      beforeValidate16V1364( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16V1364( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16V1364( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16V1364( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16V1364( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCLATFA */
                  deferredUpdate16V1364( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16V1364( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16V0( ) ;
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
         endLevel16V1364( ) ;
      }
      closeExtendedTableCursors16V1364( ) ;
   }

   public void deferredUpdate16V1364( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16V1364( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16V1364( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16V1364( ) ;
         afterConfirm16V1364( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16V1364( ) ;
            if ( AnyError == 0 )
            {
               scanStart16V1365( ) ;
               while ( RcdFound1365 != 0 )
               {
                  getByPrimaryKey16V1365( ) ;
                  delete16V1365( ) ;
                  scanNext16V1365( ) ;
               }
               scanEnd16V1365( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016V15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLATFA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1364 == 0 )
                        {
                           initAll16V1364( ) ;
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
                        resetCaption16V0( ) ;
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
      sMode1364 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16V1364( ) ;
      Gx_mode = sMode1364 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16V1364( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel16V1365( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16V1365( ) ;
         if ( ( nRcdExists_1365 != 0 ) || ( nIsMod_1365 != 0 ) )
         {
            standaloneNotModal16V1365( ) ;
            getKey16V1365( ) ;
            if ( ( nRcdExists_1365 == 0 ) && ( nRcdDeleted_1365 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16V1365( ) ;
            }
            else
            {
               if ( RcdFound1365 != 0 )
               {
                  if ( ( nRcdDeleted_1365 != 0 ) && ( nRcdExists_1365 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16V1365( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1365 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16V1365( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1365 == 0 )
                  {
                     GXCCtl = "ARTMQFA_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArtMqFa_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1365_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtMqFa_Internalname, GXutil.rtrim( A10042ArtMqFa)) ;
         httpContext.changePostValue( edtArtMqDsc_Internalname, GXutil.rtrim( A10043ArtMqDsc)) ;
         httpContext.changePostValue( edtArtFaMq_Internalname, GXutil.ltrim( localUtil.ntoc( A10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10042ArtMqFa_"+sGXsfl_55_idx, GXutil.rtrim( Z10042ArtMqFa)) ;
         httpContext.changePostValue( "ZT_"+"Z10044ArtFaMq_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1365_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1365_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1365_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1365 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1365_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1365_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTMQFA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTMQDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTFAMQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFaMq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16V1365( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1365 = (short)(0) ;
      nIsMod_1365 = (short)(0) ;
      nRcdDeleted_1365 = (short)(0) ;
   }

   public void processLevel16V1364( )
   {
      /* Save parent mode. */
      sMode1364 = Gx_mode ;
      processNestedLevel16V1365( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1364 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16V1364( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16V1364( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclatfa");
         if ( AnyError == 0 )
         {
            confirmValues16V0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclatfa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16V1364( )
   {
      /* Scan By routine */
      /* Using cursor T016V16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      RcdFound1364 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1364 = (short)(1) ;
         A10041ArtSH = T016V16_A10041ArtSH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16V1364( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1364 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1364 = (short)(1) ;
         A10041ArtSH = T016V16_A10041ArtSH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
      }
   }

   public void scanEnd16V1364( )
   {
      pr_default.close(14);
   }

   public void afterConfirm16V1364( )
   {
      /* After Confirm Rules */
      if ( ! ( ( GXutil.strcmp(A10041ArtSH, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A10041ArtSH, httpContext.getMessage( "H", "")) == 0 ) ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Seco o Humedo", ""), 1, "ARTSH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtSH_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert16V1364( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16V1364( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16V1364( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16V1364( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16V1364( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16V1364( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtArtSH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtSH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtSH_Enabled), 5, 0), true);
   }

   public void zm16V1365( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10044ArtFaMq = T016V3_A10044ArtFaMq[0] ;
         }
         else
         {
            Z10044ArtFaMq = A10044ArtFaMq ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10041ArtSH = A10041ArtSH ;
         Z10044ArtFaMq = A10044ArtFaMq ;
         Z396EmprCod = A396EmprCod ;
         Z10042ArtMqFa = A10042ArtMqFa ;
         Z10043ArtMqDsc = A10043ArtMqDsc ;
      }
   }

   public void standaloneNotModal16V1365( )
   {
   }

   public void standaloneModal16V1365( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtArtMqFa_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtMqFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqFa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtArtMqFa_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtMqFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqFa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load16V1365( )
   {
      /* Using cursor T016V17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, A10042ArtMqFa});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1365 = (short)(1) ;
         A10043ArtMqDsc = T016V17_A10043ArtMqDsc[0] ;
         n10043ArtMqDsc = T016V17_n10043ArtMqDsc[0] ;
         A10044ArtFaMq = T016V17_A10044ArtFaMq[0] ;
         n10044ArtFaMq = T016V17_n10044ArtFaMq[0] ;
         zm16V1365( -7) ;
      }
      pr_default.close(15);
      onLoadActions16V1365( ) ;
   }

   public void onLoadActions16V1365( )
   {
   }

   public void checkExtendedTable16V1365( )
   {
      nIsDirty_1365 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16V1365( ) ;
      /* Using cursor T016V4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A10042ArtMqFa});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ARTMQFA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Maq fa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtMqFa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10043ArtMqDsc = T016V4_A10043ArtMqDsc[0] ;
      n10043ArtMqDsc = T016V4_n10043ArtMqDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors16V1365( )
   {
      pr_default.close(2);
   }

   public void enableDisable16V1365( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         String A10042ArtMqFa )
   {
      /* Using cursor T016V18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A10042ArtMqFa});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "ARTMQFA_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Maq fa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtMqFa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10043ArtMqDsc = T016V18_A10043ArtMqDsc[0] ;
      n10043ArtMqDsc = T016V18_n10043ArtMqDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10043ArtMqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey16V1365( )
   {
      /* Using cursor T016V19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, A10042ArtMqFa});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1365 = (short)(1) ;
      }
      else
      {
         RcdFound1365 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey16V1365( )
   {
      /* Using cursor T016V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, A10042ArtMqFa});
      if ( (pr_default.getStatus(1) != 101) && ( T016V3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T016V3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T016V3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16V1365( 7) ;
         RcdFound1365 = (short)(1) ;
         initializeNonKey16V1365( ) ;
         A10044ArtFaMq = T016V3_A10044ArtFaMq[0] ;
         n10044ArtFaMq = T016V3_n10044ArtFaMq[0] ;
         A10042ArtMqFa = T016V3_A10042ArtMqFa[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10041ArtSH = A10041ArtSH ;
         Z10042ArtMqFa = A10042ArtMqFa ;
         sMode1365 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16V1365( ) ;
         load16V1365( ) ;
         Gx_mode = sMode1365 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1365 = (short)(0) ;
         initializeNonKey16V1365( ) ;
         sMode1365 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16V1365( ) ;
         Gx_mode = sMode1365 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16V1365( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16V1365( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016V2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, A10042ArtMqFa});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLATF1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10044ArtFaMq, T016V2_A10044ArtFaMq[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10044ArtFaMq, T016V2_A10044ArtFaMq[0]) != 0 )
            {
               GXutil.writeLogln("tclatfa:[seudo value changed for attri]"+"ArtFaMq");
               GXutil.writeLogRaw("Old: ",Z10044ArtFaMq);
               GXutil.writeLogRaw("Current: ",T016V2_A10044ArtFaMq[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLATF1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16V1365( )
   {
      beforeValidate16V1365( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16V1365( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16V1365( 0) ;
         checkOptimisticConcurrency16V1365( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16V1365( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16V1365( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016V20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, Boolean.valueOf(n10044ArtFaMq), A10044ArtFaMq, A396EmprCod, A10042ArtMqFa});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLATF1");
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
            load16V1365( ) ;
         }
         endLevel16V1365( ) ;
      }
      closeExtendedTableCursors16V1365( ) ;
   }

   public void update16V1365( )
   {
      beforeValidate16V1365( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16V1365( ) ;
      }
      if ( ( nIsMod_1365 != 0 ) || ( nIsDirty_1365 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16V1365( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16V1365( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16V1365( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016V21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n10044ArtFaMq), A10044ArtFaMq, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, A10042ArtMqFa});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLATF1");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLATF1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16V1365( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16V1365( ) ;
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
            endLevel16V1365( ) ;
         }
      }
      closeExtendedTableCursors16V1365( ) ;
   }

   public void deferredUpdate16V1365( )
   {
   }

   public void delete16V1365( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16V1365( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16V1365( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16V1365( ) ;
         afterConfirm16V1365( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16V1365( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016V22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH, A10042ArtMqFa});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLATF1");
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
      sMode1365 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16V1365( ) ;
      Gx_mode = sMode1365 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16V1365( )
   {
      standaloneModal16V1365( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016V23 */
         pr_default.execute(21, new Object[] {A396EmprCod, A10042ArtMqFa});
         A10043ArtMqDsc = T016V23_A10043ArtMqDsc[0] ;
         n10043ArtMqDsc = T016V23_n10043ArtMqDsc[0] ;
         pr_default.close(21);
      }
   }

   public void endLevel16V1365( )
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

   public void scanStart16V1365( )
   {
      /* Scan By routine */
      /* Using cursor T016V24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10041ArtSH});
      RcdFound1365 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1365 = (short)(1) ;
         A10042ArtMqFa = T016V24_A10042ArtMqFa[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16V1365( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1365 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1365 = (short)(1) ;
         A10042ArtMqFa = T016V24_A10042ArtMqFa[0] ;
      }
   }

   public void scanEnd16V1365( )
   {
      pr_default.close(22);
   }

   public void afterConfirm16V1365( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16V1365( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16V1365( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16V1365( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16V1365( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16V1365( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16V1365( )
   {
      edtArtMqFa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMqFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqFa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtArtMqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtArtFaMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFaMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFaMq_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes16V1365( )
   {
   }

   public void send_integrity_lvl_hashes16V1364( )
   {
   }

   public void subsflControlProps_551365( )
   {
      edtavnRcdDeleted_1365_Internalname = "vNRCDDELETED_1365_"+sGXsfl_55_idx ;
      edtArtMqFa_Internalname = "ARTMQFA_"+sGXsfl_55_idx ;
      edtArtMqDsc_Internalname = "ARTMQDSC_"+sGXsfl_55_idx ;
      edtArtFaMq_Internalname = "ARTFAMQ_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551365( )
   {
      edtavnRcdDeleted_1365_Internalname = "vNRCDDELETED_1365_"+sGXsfl_55_fel_idx ;
      edtArtMqFa_Internalname = "ARTMQFA_"+sGXsfl_55_fel_idx ;
      edtArtMqDsc_Internalname = "ARTMQDSC_"+sGXsfl_55_fel_idx ;
      edtArtFaMq_Internalname = "ARTFAMQ_"+sGXsfl_55_fel_idx ;
   }

   public void addRow16V1365( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551365( ) ;
      sendRow16V1365( ) ;
   }

   public void sendRow16V1365( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1365_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1365_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1365_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1365), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1365), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1365_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1365_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1365_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtMqFa_Internalname,GXutil.rtrim( A10042ArtMqFa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtMqFa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtMqFa_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtMqDsc_Internalname,GXutil.rtrim( A10043ArtMqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtMqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtMqDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1365_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtFaMq_Internalname,GXutil.ltrim( localUtil.ntoc( A10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtArtFaMq_Enabled!=0) ? localUtil.format( A10044ArtFaMq, "ZZ9.99") : localUtil.format( A10044ArtFaMq, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtFaMq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtFaMq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16V1365( ) ;
      GXCCtl = "Z10042ArtMqFa_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10042ArtMqFa));
      GXCCtl = "Z10044ArtFaMq_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10044ArtFaMq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1365_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1365_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1365_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1365, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1365_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1365_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTMQFA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTMQDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFAMQ_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFaMq_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16V1365( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551365( ) ;
      edtavnRcdDeleted_1365_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1365_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtMqFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTMQFA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtMqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTMQDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtFaMq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTFAMQ_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1365_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1365_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1365");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1365_Internalname ;
         wbErr = true ;
         nRcdDeleted_1365 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1365 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1365_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10042ArtMqFa = httpContext.cgiGet( edtArtMqFa_Internalname) ;
      A10043ArtMqDsc = httpContext.cgiGet( edtArtMqDsc_Internalname) ;
      n10043ArtMqDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtFaMq_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtFaMq_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ARTFAMQ_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtFaMq_Internalname ;
         wbErr = true ;
         A10044ArtFaMq = DecimalUtil.ZERO ;
         n10044ArtFaMq = false ;
      }
      else
      {
         A10044ArtFaMq = localUtil.ctond( httpContext.cgiGet( edtArtFaMq_Internalname)) ;
         n10044ArtFaMq = false ;
      }
      GXCCtl = "Z10042ArtMqFa_" + sGXsfl_55_idx ;
      Z10042ArtMqFa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10044ArtFaMq_" + sGXsfl_55_idx ;
      Z10044ArtFaMq = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1365_" + sGXsfl_55_idx ;
      nRcdDeleted_1365 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1365_" + sGXsfl_55_idx ;
      nRcdExists_1365 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1365_" + sGXsfl_55_idx ;
      nIsMod_1365 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtArtMqFa_Enabled = edtArtMqFa_Enabled ;
   }

   public void confirmValues16V0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551365( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551365( ) ;
         httpContext.changePostValue( "Z10042ArtMqFa_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10042ArtMqFa_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10042ArtMqFa_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10044ArtFaMq_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10044ArtFaMq_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10044ArtFaMq_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclatfa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10041ArtSH", GXutil.rtrim( Z10041ArtSH));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.tclatfa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCLATFA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FACTOR ABSORCION CL-ART-S_H-MQ", "") ;
   }

   public void initializeNonKey16V1364( )
   {
   }

   public void initAll16V1364( )
   {
      A10041ArtSH = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10041ArtSH", A10041ArtSH);
      initializeNonKey16V1364( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16V1365( )
   {
      A10043ArtMqDsc = "" ;
      n10043ArtMqDsc = false ;
      A10044ArtFaMq = DecimalUtil.ZERO ;
      n10044ArtFaMq = false ;
      Z10044ArtFaMq = DecimalUtil.ZERO ;
   }

   public void initAll16V1365( )
   {
      A10042ArtMqFa = "" ;
      initializeNonKey16V1365( ) ;
   }

   public void standaloneModalInsert16V1365( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241545978", true, true);
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
      httpContext.AddJavascriptSource("tclatfa.js", "?20268241545978", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1365( )
   {
      edtArtMqFa_Enabled = defedtArtMqFa_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMqFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMqFa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1365, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1365_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10042ArtMqFa));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10043ArtMqDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtMqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10044ArtFaMq, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFaMq_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtArtSH_Internalname = "ARTSH" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1365_Internalname = "vNRCDDELETED_1365" ;
      edtArtMqFa_Internalname = "ARTMQFA" ;
      edtArtMqDsc_Internalname = "ARTMQDSC" ;
      edtArtFaMq_Internalname = "ARTFAMQ" ;
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
      Form.setCaption( httpContext.getMessage( "FACTOR ABSORCION CL-ART-S_H-MQ", "") );
      edtArtFaMq_Jsonclick = "" ;
      edtArtMqDsc_Jsonclick = "" ;
      edtArtMqFa_Jsonclick = "" ;
      edtavnRcdDeleted_1365_Jsonclick = "" ;
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
      edtArtFaMq_Enabled = 1 ;
      edtArtMqDsc_Enabled = 0 ;
      edtArtMqFa_Enabled = 1 ;
      edtavnRcdDeleted_1365_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtSH_Jsonclick = "" ;
      edtArtSH_Backcolor = (int)(0xFFFFFF) ;
      edtArtSH_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_551365( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16V1365( ) ;
         standaloneModal16V1365( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16V1365( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551365( ) ;
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
      /* Using cursor T016V25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016V25_A407EmprNom[0] ;
      n407EmprNom = T016V25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T016V26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T016V26_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(24);
      /* Using cursor T016V27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T016V27_A69ArtDsc[0] ;
      n69ArtDsc = T016V27_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(25);
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

   public void valid_Artsh( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A10041ArtSH, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(A10041ArtSH, httpContext.getMessage( "H", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar S o M", ""), 1, "ARTSH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtSH_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10041ArtSH", GXutil.rtrim( Z10041ArtSH));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Artmqfa( )
   {
      n10043ArtMqDsc = false ;
      /* Using cursor T016V23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A10042ArtMqFa});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Maq fa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTMQFA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtMqFa_Internalname ;
      }
      A10043ArtMqDsc = T016V23_A10043ArtMqDsc[0] ;
      n10043ArtMqDsc = T016V23_n10043ArtMqDsc[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10043ArtMqDsc", GXutil.rtrim( A10043ArtMqDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ARTSH","{handler:'valid_Artsh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10041ArtSH',fld:'ARTSH',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ARTSH",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z10041ArtSH'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ARTMQFA","{handler:'valid_Artmqfa',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10042ArtMqFa',fld:'ARTMQFA',pic:''},{av:'A10043ArtMqDsc',fld:'ARTMQDSC',pic:''}]");
      setEventMetadata("VALID_ARTMQFA",",oparms:[{av:'A10043ArtMqDsc',fld:'ARTMQDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Artfamq',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z10041ArtSH = "" ;
      Z10042ArtMqFa = "" ;
      Z10044ArtFaMq = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10042ArtMqFa = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10041ArtSH = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1365 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1364 = "" ;
      GXCCtl = "" ;
      A10043ArtMqDsc = "" ;
      A10044ArtFaMq = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      T016V7_A407EmprNom = new String[] {""} ;
      T016V7_n407EmprNom = new boolean[] {false} ;
      T016V8_A279CliNom = new String[] {""} ;
      T016V9_A69ArtDsc = new String[] {""} ;
      T016V9_n69ArtDsc = new boolean[] {false} ;
      T016V10_A10041ArtSH = new String[] {""} ;
      T016V10_A407EmprNom = new String[] {""} ;
      T016V10_n407EmprNom = new boolean[] {false} ;
      T016V10_A279CliNom = new String[] {""} ;
      T016V10_A69ArtDsc = new String[] {""} ;
      T016V10_n69ArtDsc = new boolean[] {false} ;
      T016V10_A396EmprCod = new String[] {""} ;
      T016V10_A252CliCod = new int[1] ;
      T016V10_A65ArtCod = new String[] {""} ;
      T016V11_A396EmprCod = new String[] {""} ;
      T016V11_A252CliCod = new int[1] ;
      T016V11_A65ArtCod = new String[] {""} ;
      T016V11_A10041ArtSH = new String[] {""} ;
      T016V6_A10041ArtSH = new String[] {""} ;
      T016V6_A396EmprCod = new String[] {""} ;
      T016V6_A252CliCod = new int[1] ;
      T016V6_A65ArtCod = new String[] {""} ;
      T016V12_A396EmprCod = new String[] {""} ;
      T016V12_A252CliCod = new int[1] ;
      T016V12_A65ArtCod = new String[] {""} ;
      T016V12_A10041ArtSH = new String[] {""} ;
      T016V13_A396EmprCod = new String[] {""} ;
      T016V13_A252CliCod = new int[1] ;
      T016V13_A65ArtCod = new String[] {""} ;
      T016V13_A10041ArtSH = new String[] {""} ;
      T016V5_A10041ArtSH = new String[] {""} ;
      T016V5_A396EmprCod = new String[] {""} ;
      T016V5_A252CliCod = new int[1] ;
      T016V5_A65ArtCod = new String[] {""} ;
      T016V16_A396EmprCod = new String[] {""} ;
      T016V16_A252CliCod = new int[1] ;
      T016V16_A65ArtCod = new String[] {""} ;
      T016V16_A10041ArtSH = new String[] {""} ;
      Z10043ArtMqDsc = "" ;
      T016V17_A252CliCod = new int[1] ;
      T016V17_A65ArtCod = new String[] {""} ;
      T016V17_A10041ArtSH = new String[] {""} ;
      T016V17_A10043ArtMqDsc = new String[] {""} ;
      T016V17_n10043ArtMqDsc = new boolean[] {false} ;
      T016V17_A10044ArtFaMq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016V17_n10044ArtFaMq = new boolean[] {false} ;
      T016V17_A396EmprCod = new String[] {""} ;
      T016V17_A10042ArtMqFa = new String[] {""} ;
      T016V4_A10043ArtMqDsc = new String[] {""} ;
      T016V4_n10043ArtMqDsc = new boolean[] {false} ;
      T016V18_A10043ArtMqDsc = new String[] {""} ;
      T016V18_n10043ArtMqDsc = new boolean[] {false} ;
      T016V19_A396EmprCod = new String[] {""} ;
      T016V19_A252CliCod = new int[1] ;
      T016V19_A65ArtCod = new String[] {""} ;
      T016V19_A10041ArtSH = new String[] {""} ;
      T016V19_A10042ArtMqFa = new String[] {""} ;
      T016V3_A252CliCod = new int[1] ;
      T016V3_A65ArtCod = new String[] {""} ;
      T016V3_A10041ArtSH = new String[] {""} ;
      T016V3_A10044ArtFaMq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016V3_n10044ArtFaMq = new boolean[] {false} ;
      T016V3_A396EmprCod = new String[] {""} ;
      T016V3_A10042ArtMqFa = new String[] {""} ;
      T016V2_A252CliCod = new int[1] ;
      T016V2_A65ArtCod = new String[] {""} ;
      T016V2_A10041ArtSH = new String[] {""} ;
      T016V2_A10044ArtFaMq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016V2_n10044ArtFaMq = new boolean[] {false} ;
      T016V2_A396EmprCod = new String[] {""} ;
      T016V2_A10042ArtMqFa = new String[] {""} ;
      T016V23_A10043ArtMqDsc = new String[] {""} ;
      T016V23_n10043ArtMqDsc = new boolean[] {false} ;
      T016V24_A396EmprCod = new String[] {""} ;
      T016V24_A252CliCod = new int[1] ;
      T016V24_A65ArtCod = new String[] {""} ;
      T016V24_A10041ArtSH = new String[] {""} ;
      T016V24_A10042ArtMqFa = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016V25_A407EmprNom = new String[] {""} ;
      T016V25_n407EmprNom = new boolean[] {false} ;
      T016V26_A279CliNom = new String[] {""} ;
      T016V27_A69ArtDsc = new String[] {""} ;
      T016V27_n69ArtDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ10041ArtSH = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclatfa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclatfa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclatfa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclatfa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclatfa__default(),
         new Object[] {
             new Object[] {
            T016V2_A252CliCod, T016V2_A65ArtCod, T016V2_A10041ArtSH, T016V2_A10044ArtFaMq, T016V2_n10044ArtFaMq, T016V2_A396EmprCod, T016V2_A10042ArtMqFa
            }
            , new Object[] {
            T016V3_A252CliCod, T016V3_A65ArtCod, T016V3_A10041ArtSH, T016V3_A10044ArtFaMq, T016V3_n10044ArtFaMq, T016V3_A396EmprCod, T016V3_A10042ArtMqFa
            }
            , new Object[] {
            T016V4_A10043ArtMqDsc, T016V4_n10043ArtMqDsc
            }
            , new Object[] {
            T016V5_A10041ArtSH, T016V5_A396EmprCod, T016V5_A252CliCod, T016V5_A65ArtCod
            }
            , new Object[] {
            T016V6_A10041ArtSH, T016V6_A396EmprCod, T016V6_A252CliCod, T016V6_A65ArtCod
            }
            , new Object[] {
            T016V7_A407EmprNom, T016V7_n407EmprNom
            }
            , new Object[] {
            T016V8_A279CliNom
            }
            , new Object[] {
            T016V9_A69ArtDsc, T016V9_n69ArtDsc
            }
            , new Object[] {
            T016V10_A10041ArtSH, T016V10_A407EmprNom, T016V10_n407EmprNom, T016V10_A279CliNom, T016V10_A69ArtDsc, T016V10_n69ArtDsc, T016V10_A396EmprCod, T016V10_A252CliCod, T016V10_A65ArtCod
            }
            , new Object[] {
            T016V11_A396EmprCod, T016V11_A252CliCod, T016V11_A65ArtCod, T016V11_A10041ArtSH
            }
            , new Object[] {
            T016V12_A396EmprCod, T016V12_A252CliCod, T016V12_A65ArtCod, T016V12_A10041ArtSH
            }
            , new Object[] {
            T016V13_A396EmprCod, T016V13_A252CliCod, T016V13_A65ArtCod, T016V13_A10041ArtSH
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016V16_A396EmprCod, T016V16_A252CliCod, T016V16_A65ArtCod, T016V16_A10041ArtSH
            }
            , new Object[] {
            T016V17_A252CliCod, T016V17_A65ArtCod, T016V17_A10041ArtSH, T016V17_A10043ArtMqDsc, T016V17_n10043ArtMqDsc, T016V17_A10044ArtFaMq, T016V17_n10044ArtFaMq, T016V17_A396EmprCod, T016V17_A10042ArtMqFa
            }
            , new Object[] {
            T016V18_A10043ArtMqDsc, T016V18_n10043ArtMqDsc
            }
            , new Object[] {
            T016V19_A396EmprCod, T016V19_A252CliCod, T016V19_A65ArtCod, T016V19_A10041ArtSH, T016V19_A10042ArtMqFa
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016V23_A10043ArtMqDsc, T016V23_n10043ArtMqDsc
            }
            , new Object[] {
            T016V24_A396EmprCod, T016V24_A252CliCod, T016V24_A65ArtCod, T016V24_A10041ArtSH, T016V24_A10042ArtMqFa
            }
            , new Object[] {
            T016V25_A407EmprNom, T016V25_n407EmprNom
            }
            , new Object[] {
            T016V26_A279CliNom
            }
            , new Object[] {
            T016V27_A69ArtDsc, T016V27_n69ArtDsc
            }
         }
      );
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TCLATFA" ;
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
   private short nRcdDeleted_1365 ;
   private short nRcdExists_1365 ;
   private short nIsMod_1365 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1365 ;
   private short RcdFound1365 ;
   private short nBlankRcdUsr1365 ;
   private short RcdFound1364 ;
   private short nIsDirty_1364 ;
   private short nIsDirty_1365 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtArtSH_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1365_Enabled ;
   private int edtArtMqFa_Enabled ;
   private int edtArtMqDsc_Enabled ;
   private int edtArtFaMq_Enabled ;
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
   private int defedtArtMqFa_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtArtSH_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10044ArtFaMq ;
   private java.math.BigDecimal A10044ArtFaMq ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z10041ArtSH ;
   private String Z10042ArtMqFa ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10042ArtMqFa ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtArtSH_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String A10041ArtSH ;
   private String edtArtSH_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1365 ;
   private String edtavnRcdDeleted_1365_Internalname ;
   private String edtArtMqFa_Internalname ;
   private String edtArtMqDsc_Internalname ;
   private String edtArtFaMq_Internalname ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1364 ;
   private String GXCCtl ;
   private String A10043ArtMqDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z10043ArtMqDsc ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1365_Jsonclick ;
   private String edtArtMqFa_Jsonclick ;
   private String edtArtMqDsc_Jsonclick ;
   private String edtArtFaMq_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ10041ArtSH ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private boolean n10043ArtMqDsc ;
   private boolean n10044ArtFaMq ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T016V7_A407EmprNom ;
   private boolean[] T016V7_n407EmprNom ;
   private String[] T016V8_A279CliNom ;
   private String[] T016V9_A69ArtDsc ;
   private boolean[] T016V9_n69ArtDsc ;
   private String[] T016V10_A10041ArtSH ;
   private String[] T016V10_A407EmprNom ;
   private boolean[] T016V10_n407EmprNom ;
   private String[] T016V10_A279CliNom ;
   private String[] T016V10_A69ArtDsc ;
   private boolean[] T016V10_n69ArtDsc ;
   private String[] T016V10_A396EmprCod ;
   private int[] T016V10_A252CliCod ;
   private String[] T016V10_A65ArtCod ;
   private String[] T016V11_A396EmprCod ;
   private int[] T016V11_A252CliCod ;
   private String[] T016V11_A65ArtCod ;
   private String[] T016V11_A10041ArtSH ;
   private String[] T016V6_A10041ArtSH ;
   private String[] T016V6_A396EmprCod ;
   private int[] T016V6_A252CliCod ;
   private String[] T016V6_A65ArtCod ;
   private String[] T016V12_A396EmprCod ;
   private int[] T016V12_A252CliCod ;
   private String[] T016V12_A65ArtCod ;
   private String[] T016V12_A10041ArtSH ;
   private String[] T016V13_A396EmprCod ;
   private int[] T016V13_A252CliCod ;
   private String[] T016V13_A65ArtCod ;
   private String[] T016V13_A10041ArtSH ;
   private String[] T016V5_A10041ArtSH ;
   private String[] T016V5_A396EmprCod ;
   private int[] T016V5_A252CliCod ;
   private String[] T016V5_A65ArtCod ;
   private String[] T016V16_A396EmprCod ;
   private int[] T016V16_A252CliCod ;
   private String[] T016V16_A65ArtCod ;
   private String[] T016V16_A10041ArtSH ;
   private int[] T016V17_A252CliCod ;
   private String[] T016V17_A65ArtCod ;
   private String[] T016V17_A10041ArtSH ;
   private String[] T016V17_A10043ArtMqDsc ;
   private boolean[] T016V17_n10043ArtMqDsc ;
   private java.math.BigDecimal[] T016V17_A10044ArtFaMq ;
   private boolean[] T016V17_n10044ArtFaMq ;
   private String[] T016V17_A396EmprCod ;
   private String[] T016V17_A10042ArtMqFa ;
   private String[] T016V4_A10043ArtMqDsc ;
   private boolean[] T016V4_n10043ArtMqDsc ;
   private String[] T016V18_A10043ArtMqDsc ;
   private boolean[] T016V18_n10043ArtMqDsc ;
   private String[] T016V19_A396EmprCod ;
   private int[] T016V19_A252CliCod ;
   private String[] T016V19_A65ArtCod ;
   private String[] T016V19_A10041ArtSH ;
   private String[] T016V19_A10042ArtMqFa ;
   private int[] T016V3_A252CliCod ;
   private String[] T016V3_A65ArtCod ;
   private String[] T016V3_A10041ArtSH ;
   private java.math.BigDecimal[] T016V3_A10044ArtFaMq ;
   private boolean[] T016V3_n10044ArtFaMq ;
   private String[] T016V3_A396EmprCod ;
   private String[] T016V3_A10042ArtMqFa ;
   private int[] T016V2_A252CliCod ;
   private String[] T016V2_A65ArtCod ;
   private String[] T016V2_A10041ArtSH ;
   private java.math.BigDecimal[] T016V2_A10044ArtFaMq ;
   private boolean[] T016V2_n10044ArtFaMq ;
   private String[] T016V2_A396EmprCod ;
   private String[] T016V2_A10042ArtMqFa ;
   private String[] T016V23_A10043ArtMqDsc ;
   private boolean[] T016V23_n10043ArtMqDsc ;
   private String[] T016V24_A396EmprCod ;
   private int[] T016V24_A252CliCod ;
   private String[] T016V24_A65ArtCod ;
   private String[] T016V24_A10041ArtSH ;
   private String[] T016V24_A10042ArtMqFa ;
   private String[] T016V25_A407EmprNom ;
   private boolean[] T016V25_n407EmprNom ;
   private String[] T016V26_A279CliNom ;
   private String[] T016V27_A69ArtDsc ;
   private boolean[] T016V27_n69ArtDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclatfa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclatfa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclatfa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclatfa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclatfa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016V2", "SELECT CliCod, ArtCod, ArtSH, ArtFaMq, EmprCod, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? AND ArtMqFa = ?  FOR UPDATE OF ArtFaMq NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V3", "SELECT CliCod, ArtCod, ArtSH, ArtFaMq, EmprCod, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? AND ArtMqFa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V4", "SELECT MaqDsc AS ArtMqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V5", "SELECT ArtSH, EmprCod, CliCod, ArtCod FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ?  FOR UPDATE OF ArtSH NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V6", "SELECT ArtSH, EmprCod, CliCod, ArtCod FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V9", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V10", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtSH, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM (((TXPCLATFA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ArtSH = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ArtSH ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE ( ArtSH > ?) and EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ArtSH) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016V13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE ( ArtSH < ?) and EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ArtSH DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016V14", "INSERT INTO TXPCLATFA(ArtSH, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCLATFA")
         ,new UpdateCursor("T016V15", "DELETE FROM TXPCLATFA  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ?", GX_NOMASK, "TXPCLATFA")
         ,new ForEachCursor("T016V16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ArtSH ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V17", "SELECT T1.CliCod, T1.ArtCod, T1.ArtSH, T2.MaqDsc AS ArtMqDsc, T1.ArtFaMq, T1.EmprCod, T1.ArtMqFa AS ArtMqFa FROM (TXPCLATF1 T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.ArtMqFa) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ArtSH = ? and T1.ArtMqFa = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtSH, T1.ArtMqFa ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V18", "SELECT MaqDsc AS ArtMqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V19", "SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? AND ArtMqFa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016V20", "INSERT INTO TXPCLATF1(CliCod, ArtCod, ArtSH, ArtFaMq, EmprCod, ArtMqFa) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLATF1")
         ,new UpdateCursor("T016V21", "UPDATE TXPCLATF1 SET ArtFaMq=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? AND ArtMqFa = ?", GX_NOMASK, "TXPCLATF1")
         ,new UpdateCursor("T016V22", "DELETE FROM TXPCLATF1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtSH = ? AND ArtMqFa = ?", GX_NOMASK, "TXPCLATF1")
         ,new ForEachCursor("T016V23", "SELECT MaqDsc AS ArtMqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V24", "SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtSH = ? ORDER BY EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V26", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016V27", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setString(6, (String)parms[6], 6);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

