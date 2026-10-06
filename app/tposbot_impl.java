package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tposbot_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A652OpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2855CodBota = (int)(GXutil.lval( httpContext.GetPar( "CodBota"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A2855CodBota) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "POSICION BOTA EN ALMACEN", ""), (short)(0)) ;
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

   public tposbot_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tposbot_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tposbot_impl.class ));
   }

   public tposbot_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPOSBOT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Posicion Bota Almacen", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPosBotCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5994PosBotCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPosBotCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5994PosBotCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5994PosBotCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPosBotCod_Jsonclick, 0, "", "", "", "", "", 1, edtPosBotCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion Posicion Alm.Bota", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPosBotDsc_Internalname, GXutil.rtrim( A5995PosBotDsc), GXutil.rtrim( localUtil.format( A5995PosBotDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPosBotDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPosBotDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Largada Bota", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPosBotLar_Internalname, GXutil.rtrim( A5996PosBotLar), GXutil.rtrim( localUtil.format( A5996PosBotLar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPosBotLar_Jsonclick, 0, "", "", "", "", "", 1, edtPosBotLar_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Diametro Bota", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPOSBOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPosBotDia_Internalname, GXutil.rtrim( A5997PosBotDia), GXutil.rtrim( localUtil.format( A5997PosBotDia, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPosBotDia_Jsonclick, 0, "", "", "", "", "", 1, edtPosBotDia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPOSBOT.htm");
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
         nBlankRcdCount1563 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1563 = (short)(1) ;
            scanStart1F51563( ) ;
            while ( RcdFound1563 != 0 )
            {
               init_level_properties1563( ) ;
               getByPrimaryKey1F51563( ) ;
               addRow1F51563( ) ;
               scanNext1F51563( ) ;
            }
            scanEnd1F51563( ) ;
            nBlankRcdCount1563 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1F51563( ) ;
         standaloneModal1F51563( ) ;
         sMode1563 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1F51563( ) ;
            edtavnRcdDeleted_1563_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1563_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1563_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1563_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCodBota_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODBOTA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodBota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBota_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPosBotFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POSBOTFEC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPosBotFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPosBotFec_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1563 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1F51563( ) ;
            }
            sendRow1F51563( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1563 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1563 = (short)(5) ;
         nRcdExists_1563 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1F51563( ) ;
            while ( RcdFound1563 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501563( ) ;
               init_level_properties1563( ) ;
               standaloneNotModal1F51563( ) ;
               getByPrimaryKey1F51563( ) ;
               standaloneModal1F51563( ) ;
               addRow1F51563( ) ;
               scanNext1F51563( ) ;
            }
            scanEnd1F51563( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1563 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501563( ) ;
      initAll1F51563( ) ;
      init_level_properties1563( ) ;
      nRcdExists_1563 = (short)(0) ;
      nIsMod_1563 = (short)(0) ;
      nRcdDeleted_1563 = (short)(0) ;
      nBlankRcdCount1563 = (short)(nBlankRcdUsr1563+nBlankRcdCount1563) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1563 > 0 )
      {
         standaloneNotModal1F51563( ) ;
         standaloneModal1F51563( ) ;
         addRow1F51563( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCodBota_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1563 = (short)(nBlankRcdCount1563-1) ;
      }
      Gx_mode = sMode1563 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPOSBOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPOSBOT.htm");
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
         Z5994PosBotCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z5994PosBotCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5995PosBotDsc = httpContext.cgiGet( "Z5995PosBotDsc") ;
         Z5996PosBotLar = httpContext.cgiGet( "Z5996PosBotLar") ;
         Z5997PosBotDia = httpContext.cgiGet( "Z5997PosBotDia") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPosBotCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPosBotCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "POSBOTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPosBotCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5994PosBotCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
         }
         else
         {
            A5994PosBotCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPosBotCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
         }
         A5995PosBotDsc = httpContext.cgiGet( edtPosBotDsc_Internalname) ;
         n5995PosBotDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5995PosBotDsc", A5995PosBotDsc);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5996PosBotLar = httpContext.cgiGet( edtPosBotLar_Internalname) ;
         n5996PosBotLar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5996PosBotLar", A5996PosBotLar);
         A5997PosBotDia = httpContext.cgiGet( edtPosBotDia_Internalname) ;
         n5997PosBotDia = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5997PosBotDia", A5997PosBotDia);
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
            A5994PosBotCod = (short)(GXutil.lval( httpContext.GetPar( "PosBotCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
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
            initAll1F51562( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1563_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1563_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1F51562( ) ;
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

   public void confirm_1F50( )
   {
      beforeValidate1F51562( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1F51562( ) ;
         }
         else
         {
            checkExtendedTable1F51562( ) ;
            if ( AnyError == 0 )
            {
               zm1F51562( 2) ;
            }
            closeExtendedTableCursors1F51562( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1562 = Gx_mode ;
         confirm_1F51563( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1562 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1562 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1F50( ) ;
      }
   }

   public void confirm_1F51563( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1F51563( ) ;
         if ( ( nRcdExists_1563 != 0 ) || ( nIsMod_1563 != 0 ) )
         {
            getKey1F51563( ) ;
            if ( ( nRcdExists_1563 == 0 ) && ( nRcdDeleted_1563 == 0 ) )
            {
               if ( RcdFound1563 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1F51563( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1F51563( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1F51563( 4) ;
                        zm1F51563( 5) ;
                     }
                     closeExtendedTableCursors1F51563( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CODBOTA_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCodBota_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1563 != 0 )
               {
                  if ( nRcdDeleted_1563 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1F51563( ) ;
                     load1F51563( ) ;
                     beforeValidate1F51563( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1F51563( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1563 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1F51563( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1F51563( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1F51563( 4) ;
                              zm1F51563( 5) ;
                           }
                           closeExtendedTableCursors1F51563( ) ;
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
                  if ( nRcdDeleted_1563 == 0 )
                  {
                     GXCCtl = "CODBOTA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodBota_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1563_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodBota_Internalname, GXutil.ltrim( localUtil.ntoc( A2855CodBota, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPosBotFec_Internalname, localUtil.format(A5998PosBotFec, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z2855CodBota_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2855CodBota, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5998PosBotFec_"+sGXsfl_50_idx, localUtil.dtoc( Z5998PosBotFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1563_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1563_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1563_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1563 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1563_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1563_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODBOTA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodBota_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POSBOTFEC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPosBotFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1F50( )
   {
   }

   public void zm1F51562( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5995PosBotDsc = T01F57_A5995PosBotDsc[0] ;
            Z5996PosBotLar = T01F57_A5996PosBotLar[0] ;
            Z5997PosBotDia = T01F57_A5997PosBotDia[0] ;
         }
         else
         {
            Z5995PosBotDsc = A5995PosBotDsc ;
            Z5996PosBotLar = A5996PosBotLar ;
            Z5997PosBotDia = A5997PosBotDia ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z5994PosBotCod = A5994PosBotCod ;
         Z5995PosBotDsc = A5995PosBotDsc ;
         Z5996PosBotLar = A5996PosBotLar ;
         Z5997PosBotDia = A5997PosBotDia ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void load1F51562( )
   {
      /* Using cursor T01F59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1562 = (short)(1) ;
         A5995PosBotDsc = T01F59_A5995PosBotDsc[0] ;
         n5995PosBotDsc = T01F59_n5995PosBotDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5995PosBotDsc", A5995PosBotDsc);
         A407EmprNom = T01F59_A407EmprNom[0] ;
         n407EmprNom = T01F59_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5996PosBotLar = T01F59_A5996PosBotLar[0] ;
         n5996PosBotLar = T01F59_n5996PosBotLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5996PosBotLar", A5996PosBotLar);
         A5997PosBotDia = T01F59_A5997PosBotDia[0] ;
         n5997PosBotDia = T01F59_n5997PosBotDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5997PosBotDia", A5997PosBotDia);
         zm1F51562( -1) ;
      }
      pr_default.close(7);
      onLoadActions1F51562( ) ;
   }

   public void onLoadActions1F51562( )
   {
   }

   public void checkExtendedTable1F51562( )
   {
      nIsDirty_1562 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01F58 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01F58_A407EmprNom[0] ;
      n407EmprNom = T01F58_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1F51562( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01F510 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01F510_A407EmprNom[0] ;
      n407EmprNom = T01F510_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1F51562( )
   {
      /* Using cursor T01F511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1562 = (short)(1) ;
      }
      else
      {
         RcdFound1562 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01F57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1F51562( 1) ;
         RcdFound1562 = (short)(1) ;
         A5994PosBotCod = T01F57_A5994PosBotCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
         A5995PosBotDsc = T01F57_A5995PosBotDsc[0] ;
         n5995PosBotDsc = T01F57_n5995PosBotDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5995PosBotDsc", A5995PosBotDsc);
         A5996PosBotLar = T01F57_A5996PosBotLar[0] ;
         n5996PosBotLar = T01F57_n5996PosBotLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5996PosBotLar", A5996PosBotLar);
         A5997PosBotDia = T01F57_A5997PosBotDia[0] ;
         n5997PosBotDia = T01F57_n5997PosBotDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5997PosBotDia", A5997PosBotDia);
         A396EmprCod = T01F57_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z5994PosBotCod = A5994PosBotCod ;
         sMode1562 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1F51562( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1562 = (short)(0) ;
            initializeNonKey1F51562( ) ;
         }
         Gx_mode = sMode1562 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1562 = (short)(0) ;
         initializeNonKey1F51562( ) ;
         sMode1562 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1562 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1F51562( ) ;
      if ( RcdFound1562 == 0 )
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
      RcdFound1562 = (short)(0) ;
      /* Using cursor T01F512 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A5994PosBotCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01F512_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01F512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F512_A5994PosBotCod[0] < A5994PosBotCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01F512_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01F512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F512_A5994PosBotCod[0] > A5994PosBotCod ) ) )
         {
            A396EmprCod = T01F512_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5994PosBotCod = T01F512_A5994PosBotCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
            RcdFound1562 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1562 = (short)(0) ;
      /* Using cursor T01F513 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A5994PosBotCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01F513_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01F513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F513_A5994PosBotCod[0] > A5994PosBotCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01F513_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01F513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F513_A5994PosBotCod[0] < A5994PosBotCod ) ) )
         {
            A396EmprCod = T01F513_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5994PosBotCod = T01F513_A5994PosBotCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
            RcdFound1562 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F51562( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F51562( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1562 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5994PosBotCod != Z5994PosBotCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5994PosBotCod = Z5994PosBotCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
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
               update1F51562( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5994PosBotCod != Z5994PosBotCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F51562( ) ;
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
                  insert1F51562( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5994PosBotCod != Z5994PosBotCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5994PosBotCod = Z5994PosBotCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
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
      getKey1F51562( ) ;
      if ( RcdFound1562 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5994PosBotCod != Z5994PosBotCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5994PosBotCod = Z5994PosBotCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5994PosBotCod != Z5994PosBotCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tposbot");
      GX_FocusControl = edtPosBotDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1F50( ) ;
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
      if ( RcdFound1562 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPosBotDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1F51562( ) ;
      if ( RcdFound1562 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPosBotDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F51562( ) ;
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
      if ( RcdFound1562 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPosBotDsc_Internalname ;
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
      if ( RcdFound1562 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPosBotDsc_Internalname ;
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
      scanStart1F51562( ) ;
      if ( RcdFound1562 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1562 != 0 )
         {
            scanNext1F51562( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPosBotDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F51562( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F51562( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPOSALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z5995PosBotDsc, T01F56_A5995PosBotDsc[0]) != 0 ) || ( GXutil.strcmp(Z5996PosBotLar, T01F56_A5996PosBotLar[0]) != 0 ) || ( GXutil.strcmp(Z5997PosBotDia, T01F56_A5997PosBotDia[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5995PosBotDsc, T01F56_A5995PosBotDsc[0]) != 0 )
            {
               GXutil.writeLogln("tposbot:[seudo value changed for attri]"+"PosBotDsc");
               GXutil.writeLogRaw("Old: ",Z5995PosBotDsc);
               GXutil.writeLogRaw("Current: ",T01F56_A5995PosBotDsc[0]);
            }
            if ( GXutil.strcmp(Z5996PosBotLar, T01F56_A5996PosBotLar[0]) != 0 )
            {
               GXutil.writeLogln("tposbot:[seudo value changed for attri]"+"PosBotLar");
               GXutil.writeLogRaw("Old: ",Z5996PosBotLar);
               GXutil.writeLogRaw("Current: ",T01F56_A5996PosBotLar[0]);
            }
            if ( GXutil.strcmp(Z5997PosBotDia, T01F56_A5997PosBotDia[0]) != 0 )
            {
               GXutil.writeLogln("tposbot:[seudo value changed for attri]"+"PosBotDia");
               GXutil.writeLogRaw("Old: ",Z5997PosBotDia);
               GXutil.writeLogRaw("Current: ",T01F56_A5997PosBotDia[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPOSALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F51562( )
   {
      beforeValidate1F51562( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F51562( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F51562( 0) ;
         checkOptimisticConcurrency1F51562( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F51562( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F51562( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F514 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A5994PosBotCod), Boolean.valueOf(n5995PosBotDsc), A5995PosBotDsc, Boolean.valueOf(n5996PosBotLar), A5996PosBotLar, Boolean.valueOf(n5997PosBotDia), A5997PosBotDia, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPOSALM");
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
                        processLevel1F51562( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1F50( ) ;
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
            load1F51562( ) ;
         }
         endLevel1F51562( ) ;
      }
      closeExtendedTableCursors1F51562( ) ;
   }

   public void update1F51562( )
   {
      beforeValidate1F51562( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F51562( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F51562( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F51562( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F51562( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F515 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n5995PosBotDsc), A5995PosBotDsc, Boolean.valueOf(n5996PosBotLar), A5996PosBotLar, Boolean.valueOf(n5997PosBotDia), A5997PosBotDia, A396EmprCod, Short.valueOf(A5994PosBotCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPOSALM");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPOSALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F51562( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1F51562( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1F50( ) ;
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
         endLevel1F51562( ) ;
      }
      closeExtendedTableCursors1F51562( ) ;
   }

   public void deferredUpdate1F51562( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F51562( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F51562( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F51562( ) ;
         afterConfirm1F51562( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F51562( ) ;
            if ( AnyError == 0 )
            {
               scanStart1F51563( ) ;
               while ( RcdFound1563 != 0 )
               {
                  getByPrimaryKey1F51563( ) ;
                  delete1F51563( ) ;
                  scanNext1F51563( ) ;
               }
               scanEnd1F51563( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F516 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPOSALM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1562 == 0 )
                        {
                           initAll1F51562( ) ;
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
                        resetCaption1F50( ) ;
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
      sMode1562 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F51562( ) ;
      Gx_mode = sMode1562 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F51562( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01F517 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T01F517_A407EmprNom[0] ;
         n407EmprNom = T01F517_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
      }
   }

   public void processNestedLevel1F51563( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1F51563( ) ;
         if ( ( nRcdExists_1563 != 0 ) || ( nIsMod_1563 != 0 ) )
         {
            standaloneNotModal1F51563( ) ;
            getKey1F51563( ) ;
            if ( ( nRcdExists_1563 == 0 ) && ( nRcdDeleted_1563 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1F51563( ) ;
            }
            else
            {
               if ( RcdFound1563 != 0 )
               {
                  if ( ( nRcdDeleted_1563 != 0 ) && ( nRcdExists_1563 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1F51563( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1563 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1F51563( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1563 == 0 )
                  {
                     GXCCtl = "CODBOTA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodBota_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1563_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodBota_Internalname, GXutil.ltrim( localUtil.ntoc( A2855CodBota, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPosBotFec_Internalname, localUtil.format(A5998PosBotFec, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z2855CodBota_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2855CodBota, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5998PosBotFec_"+sGXsfl_50_idx, localUtil.dtoc( Z5998PosBotFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1563_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1563_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1563_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1563 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1563_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1563_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODBOTA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodBota_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OPECOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POSBOTFEC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPosBotFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1F51563( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1563 = (short)(0) ;
      nIsMod_1563 = (short)(0) ;
      nRcdDeleted_1563 = (short)(0) ;
   }

   public void processLevel1F51562( )
   {
      /* Save parent mode. */
      sMode1562 = Gx_mode ;
      processNestedLevel1F51563( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1562 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1F51562( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F51562( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tposbot");
         if ( AnyError == 0 )
         {
            confirmValues1F50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tposbot");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F51562( )
   {
      /* Using cursor T01F518 */
      pr_default.execute(16);
      RcdFound1562 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1562 = (short)(1) ;
         A396EmprCod = T01F518_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5994PosBotCod = T01F518_A5994PosBotCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F51562( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1562 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1562 = (short)(1) ;
         A396EmprCod = T01F518_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5994PosBotCod = T01F518_A5994PosBotCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
      }
   }

   public void scanEnd1F51562( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1F51562( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F51562( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F51562( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F51562( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F51562( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F51562( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F51562( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPosBotCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPosBotCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPosBotCod_Enabled), 5, 0), true);
      edtPosBotDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPosBotDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPosBotDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPosBotLar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPosBotLar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPosBotLar_Enabled), 5, 0), true);
      edtPosBotDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPosBotDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPosBotDia_Enabled), 5, 0), true);
   }

   public void zm1F51563( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5998PosBotFec = T01F53_A5998PosBotFec[0] ;
            Z652OpeCod = T01F53_A652OpeCod[0] ;
         }
         else
         {
            Z5998PosBotFec = A5998PosBotFec ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z5994PosBotCod = A5994PosBotCod ;
         Z5998PosBotFec = A5998PosBotFec ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z2855CodBota = A2855CodBota ;
      }
   }

   public void standaloneNotModal1F51563( )
   {
   }

   public void standaloneModal1F51563( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCodBota_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodBota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBota_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtCodBota_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodBota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBota_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1F51563( )
   {
      /* Using cursor T01F519 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod), Integer.valueOf(A2855CodBota)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1563 = (short)(1) ;
         A5998PosBotFec = T01F519_A5998PosBotFec[0] ;
         n5998PosBotFec = T01F519_n5998PosBotFec[0] ;
         A652OpeCod = T01F519_A652OpeCod[0] ;
         n652OpeCod = T01F519_n652OpeCod[0] ;
         zm1F51563( -3) ;
      }
      pr_default.close(17);
      onLoadActions1F51563( ) ;
   }

   public void onLoadActions1F51563( )
   {
   }

   public void checkExtendedTable1F51563( )
   {
      nIsDirty_1563 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1F51563( ) ;
      /* Using cursor T01F54 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01F55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A2855CodBota)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "CODBOTA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CBOTAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodBota_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1F51563( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1F51563( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T01F520 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_5( String A396EmprCod ,
                         int A2855CodBota )
   {
      /* Using cursor T01F521 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A2855CodBota)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "CODBOTA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CBOTAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodBota_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1F51563( )
   {
      /* Using cursor T01F522 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod), Integer.valueOf(A2855CodBota)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1563 = (short)(1) ;
      }
      else
      {
         RcdFound1563 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1F51563( )
   {
      /* Using cursor T01F53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod), Integer.valueOf(A2855CodBota)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1F51563( 3) ;
         RcdFound1563 = (short)(1) ;
         initializeNonKey1F51563( ) ;
         A5998PosBotFec = T01F53_A5998PosBotFec[0] ;
         n5998PosBotFec = T01F53_n5998PosBotFec[0] ;
         A652OpeCod = T01F53_A652OpeCod[0] ;
         n652OpeCod = T01F53_n652OpeCod[0] ;
         A2855CodBota = T01F53_A2855CodBota[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5994PosBotCod = A5994PosBotCod ;
         Z2855CodBota = A2855CodBota ;
         sMode1563 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F51563( ) ;
         load1F51563( ) ;
         Gx_mode = sMode1563 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1563 = (short)(0) ;
         initializeNonKey1F51563( ) ;
         sMode1563 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F51563( ) ;
         Gx_mode = sMode1563 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1F51563( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1F51563( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod), Integer.valueOf(A2855CodBota)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPOSBOT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z5998PosBotFec), GXutil.resetTime(T01F52_A5998PosBotFec[0])) ) || ( Z652OpeCod != T01F52_A652OpeCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5998PosBotFec), GXutil.resetTime(T01F52_A5998PosBotFec[0])) ) )
            {
               GXutil.writeLogln("tposbot:[seudo value changed for attri]"+"PosBotFec");
               GXutil.writeLogRaw("Old: ",Z5998PosBotFec);
               GXutil.writeLogRaw("Current: ",T01F52_A5998PosBotFec[0]);
            }
            if ( Z652OpeCod != T01F52_A652OpeCod[0] )
            {
               GXutil.writeLogln("tposbot:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01F52_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPOSBOT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F51563( )
   {
      beforeValidate1F51563( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F51563( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F51563( 0) ;
         checkOptimisticConcurrency1F51563( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F51563( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F51563( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F523 */
                  pr_default.execute(21, new Object[] {Short.valueOf(A5994PosBotCod), Boolean.valueOf(n5998PosBotFec), A5998PosBotFec, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), Integer.valueOf(A2855CodBota)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPOSBOT");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1F51563( ) ;
         }
         endLevel1F51563( ) ;
      }
      closeExtendedTableCursors1F51563( ) ;
   }

   public void update1F51563( )
   {
      beforeValidate1F51563( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F51563( ) ;
      }
      if ( ( nIsMod_1563 != 0 ) || ( nIsDirty_1563 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1F51563( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1F51563( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1F51563( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01F524 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n5998PosBotFec), A5998PosBotFec, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Short.valueOf(A5994PosBotCod), Integer.valueOf(A2855CodBota)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPOSBOT");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPOSBOT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1F51563( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1F51563( ) ;
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
            endLevel1F51563( ) ;
         }
      }
      closeExtendedTableCursors1F51563( ) ;
   }

   public void deferredUpdate1F51563( )
   {
   }

   public void delete1F51563( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F51563( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F51563( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F51563( ) ;
         afterConfirm1F51563( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F51563( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01F525 */
               pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod), Integer.valueOf(A2855CodBota)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPOSBOT");
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
      sMode1563 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F51563( ) ;
      Gx_mode = sMode1563 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F51563( )
   {
      standaloneModal1F51563( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1F51563( )
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

   public void scanStart1F51563( )
   {
      /* Scan By routine */
      /* Using cursor T01F526 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A5994PosBotCod)});
      RcdFound1563 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1563 = (short)(1) ;
         A2855CodBota = T01F526_A2855CodBota[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F51563( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1563 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1563 = (short)(1) ;
         A2855CodBota = T01F526_A2855CodBota[0] ;
      }
   }

   public void scanEnd1F51563( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1F51563( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F51563( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F51563( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F51563( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F51563( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F51563( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F51563( )
   {
      edtCodBota_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodBota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBota_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPosBotFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPosBotFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPosBotFec_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1F51563( )
   {
   }

   public void send_integrity_lvl_hashes1F51562( )
   {
   }

   public void subsflControlProps_501563( )
   {
      edtavnRcdDeleted_1563_Internalname = "vNRCDDELETED_1563_"+sGXsfl_50_idx ;
      edtCodBota_Internalname = "CODBOTA_"+sGXsfl_50_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_50_idx ;
      edtPosBotFec_Internalname = "POSBOTFEC_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501563( )
   {
      edtavnRcdDeleted_1563_Internalname = "vNRCDDELETED_1563_"+sGXsfl_50_fel_idx ;
      edtCodBota_Internalname = "CODBOTA_"+sGXsfl_50_fel_idx ;
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_50_fel_idx ;
      edtPosBotFec_Internalname = "POSBOTFEC_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1F51563( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501563( ) ;
      sendRow1F51563( ) ;
   }

   public void sendRow1F51563( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1563_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1563_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1563_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1563), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1563), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1563_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1563_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1563_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodBota_Internalname,GXutil.ltrim( localUtil.ntoc( A2855CodBota, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2855CodBota), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodBota_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodBota_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1563_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOpeCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1563_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPosBotFec_Internalname,localUtil.format(A5998PosBotFec, "99/99/99"),localUtil.format( A5998PosBotFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPosBotFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPosBotFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1F51563( ) ;
      GXCCtl = "Z2855CodBota_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2855CodBota, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5998PosBotFec_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5998PosBotFec, 0, "/"));
      GXCCtl = "Z652OpeCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1563_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1563_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1563_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1563, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1563_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1563_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODBOTA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodBota_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POSBOTFEC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPosBotFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1F51563( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501563( ) ;
      edtavnRcdDeleted_1563_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1563_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodBota_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODBOTA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OPECOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPosBotFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POSBOTFEC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1563_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1563_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1563");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1563_Internalname ;
         wbErr = true ;
         nRcdDeleted_1563 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1563 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1563_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCodBota_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCodBota_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CODBOTA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodBota_Internalname ;
         wbErr = true ;
         A2855CodBota = 0 ;
      }
      else
      {
         A2855CodBota = (int)(localUtil.ctol( httpContext.cgiGet( edtCodBota_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "OPECOD_" + sGXsfl_50_idx ;
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
      if ( localUtil.vcdate( httpContext.cgiGet( edtPosBotFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "POSBOTFEC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPosBotFec_Internalname ;
         wbErr = true ;
         A5998PosBotFec = GXutil.nullDate() ;
         n5998PosBotFec = false ;
      }
      else
      {
         A5998PosBotFec = localUtil.ctod( httpContext.cgiGet( edtPosBotFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n5998PosBotFec = false ;
      }
      GXCCtl = "Z2855CodBota_" + sGXsfl_50_idx ;
      Z2855CodBota = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5998PosBotFec_" + sGXsfl_50_idx ;
      Z5998PosBotFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z652OpeCod_" + sGXsfl_50_idx ;
      Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1563_" + sGXsfl_50_idx ;
      nRcdDeleted_1563 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1563_" + sGXsfl_50_idx ;
      nRcdExists_1563 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1563_" + sGXsfl_50_idx ;
      nIsMod_1563 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCodBota_Enabled = edtCodBota_Enabled ;
   }

   public void confirmValues1F50( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501563( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501563( ) ;
         httpContext.changePostValue( "Z2855CodBota_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2855CodBota_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2855CodBota_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5998PosBotFec_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5998PosBotFec_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5998PosBotFec_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z652OpeCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z652OpeCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z652OpeCod_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tposbot", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5994PosBotCod", GXutil.ltrim( localUtil.ntoc( Z5994PosBotCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5995PosBotDsc", GXutil.rtrim( Z5995PosBotDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5996PosBotLar", GXutil.rtrim( Z5996PosBotLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5997PosBotDia", GXutil.rtrim( Z5997PosBotDia));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tposbot", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPOSBOT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "POSICION BOTA EN ALMACEN", "") ;
   }

   public void initializeNonKey1F51562( )
   {
      A5995PosBotDsc = "" ;
      n5995PosBotDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5995PosBotDsc", A5995PosBotDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A5996PosBotLar = "" ;
      n5996PosBotLar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5996PosBotLar", A5996PosBotLar);
      A5997PosBotDia = "" ;
      n5997PosBotDia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5997PosBotDia", A5997PosBotDia);
      Z5995PosBotDsc = "" ;
      Z5996PosBotLar = "" ;
      Z5997PosBotDia = "" ;
   }

   public void initAll1F51562( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5994PosBotCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5994PosBotCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5994PosBotCod), 3, 0));
      initializeNonKey1F51562( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1F51563( )
   {
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      A5998PosBotFec = GXutil.nullDate() ;
      n5998PosBotFec = false ;
      Z5998PosBotFec = GXutil.nullDate() ;
      Z652OpeCod = 0 ;
   }

   public void initAll1F51563( )
   {
      A2855CodBota = 0 ;
      initializeNonKey1F51563( ) ;
   }

   public void standaloneModalInsert1F51563( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824157888", true, true);
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
      httpContext.AddJavascriptSource("tposbot.js", "?2026824157888", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1563( )
   {
      edtCodBota_Enabled = defedtCodBota_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodBota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBota_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1563, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1563_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2855CodBota, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodBota_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A5998PosBotFec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPosBotFec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPosBotCod_Internalname = "POSBOTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPosBotDsc_Internalname = "POSBOTDSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPosBotLar_Internalname = "POSBOTLAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPosBotDia_Internalname = "POSBOTDIA" ;
      edtavnRcdDeleted_1563_Internalname = "vNRCDDELETED_1563" ;
      edtCodBota_Internalname = "CODBOTA" ;
      edtOpeCod_Internalname = "OPECOD" ;
      edtPosBotFec_Internalname = "POSBOTFEC" ;
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
      Form.setCaption( httpContext.getMessage( "POSICION BOTA EN ALMACEN", "") );
      edtPosBotFec_Jsonclick = "" ;
      edtOpeCod_Jsonclick = "" ;
      edtCodBota_Jsonclick = "" ;
      edtavnRcdDeleted_1563_Jsonclick = "" ;
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
      edtPosBotFec_Enabled = 1 ;
      edtOpeCod_Enabled = 1 ;
      edtCodBota_Enabled = 1 ;
      edtavnRcdDeleted_1563_Enabled = 1 ;
      edtPosBotDia_Jsonclick = "" ;
      edtPosBotDia_Backcolor = (int)(0xFFFFFF) ;
      edtPosBotDia_Enabled = 1 ;
      edtPosBotLar_Jsonclick = "" ;
      edtPosBotLar_Backcolor = (int)(0xFFFFFF) ;
      edtPosBotLar_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtPosBotDsc_Jsonclick = "" ;
      edtPosBotDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPosBotDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPosBotCod_Jsonclick = "" ;
      edtPosBotCod_Backcolor = (int)(0xFFFFFF) ;
      edtPosBotCod_Enabled = 1 ;
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
      subsflControlProps_501563( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1F51563( ) ;
         standaloneModal1F51563( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1F51563( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501563( ) ;
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
      /* Using cursor T01F517 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01F517_A407EmprNom[0] ;
      n407EmprNom = T01F517_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      GX_FocusControl = edtPosBotDsc_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01F517 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01F517_A407EmprNom[0] ;
      n407EmprNom = T01F517_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Posbotcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5995PosBotDsc", GXutil.rtrim( A5995PosBotDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5996PosBotLar", GXutil.rtrim( A5996PosBotLar));
      httpContext.ajax_rsp_assign_attri("", false, "A5997PosBotDia", GXutil.rtrim( A5997PosBotDia));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5994PosBotCod", GXutil.ltrim( localUtil.ntoc( Z5994PosBotCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5995PosBotDsc", GXutil.rtrim( Z5995PosBotDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5996PosBotLar", GXutil.rtrim( Z5996PosBotLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5997PosBotDia", GXutil.rtrim( Z5997PosBotDia));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Codbota( )
   {
      /* Using cursor T01F527 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A2855CodBota)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CBOTAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODBOTA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodBota_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      /* Using cursor T01F528 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_POSBOTCOD","{handler:'valid_Posbotcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5994PosBotCod',fld:'POSBOTCOD',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_POSBOTCOD",",oparms:[{av:'A5995PosBotDsc',fld:'POSBOTDSC',pic:''},{av:'A5996PosBotLar',fld:'POSBOTLAR',pic:''},{av:'A5997PosBotDia',fld:'POSBOTDIA',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z5994PosBotCod'},{av:'Z5995PosBotDsc'},{av:'Z5996PosBotLar'},{av:'Z5997PosBotDia'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CODBOTA","{handler:'valid_Codbota',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2855CodBota',fld:'CODBOTA',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CODBOTA",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_OPECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Posbotfec',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z5995PosBotDsc = "" ;
      Z5996PosBotLar = "" ;
      Z5997PosBotDia = "" ;
      Z5998PosBotFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A5995PosBotDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A5996PosBotLar = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5997PosBotDia = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1563 = "" ;
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
      sMode1562 = "" ;
      GXCCtl = "" ;
      A5998PosBotFec = GXutil.nullDate() ;
      Z407EmprNom = "" ;
      T01F59_A5994PosBotCod = new short[1] ;
      T01F59_A5995PosBotDsc = new String[] {""} ;
      T01F59_n5995PosBotDsc = new boolean[] {false} ;
      T01F59_A407EmprNom = new String[] {""} ;
      T01F59_n407EmprNom = new boolean[] {false} ;
      T01F59_A5996PosBotLar = new String[] {""} ;
      T01F59_n5996PosBotLar = new boolean[] {false} ;
      T01F59_A5997PosBotDia = new String[] {""} ;
      T01F59_n5997PosBotDia = new boolean[] {false} ;
      T01F59_A396EmprCod = new String[] {""} ;
      T01F58_A407EmprNom = new String[] {""} ;
      T01F58_n407EmprNom = new boolean[] {false} ;
      T01F510_A407EmprNom = new String[] {""} ;
      T01F510_n407EmprNom = new boolean[] {false} ;
      T01F511_A396EmprCod = new String[] {""} ;
      T01F511_A5994PosBotCod = new short[1] ;
      T01F57_A5994PosBotCod = new short[1] ;
      T01F57_A5995PosBotDsc = new String[] {""} ;
      T01F57_n5995PosBotDsc = new boolean[] {false} ;
      T01F57_A5996PosBotLar = new String[] {""} ;
      T01F57_n5996PosBotLar = new boolean[] {false} ;
      T01F57_A5997PosBotDia = new String[] {""} ;
      T01F57_n5997PosBotDia = new boolean[] {false} ;
      T01F57_A396EmprCod = new String[] {""} ;
      T01F512_A396EmprCod = new String[] {""} ;
      T01F512_A5994PosBotCod = new short[1] ;
      T01F513_A396EmprCod = new String[] {""} ;
      T01F513_A5994PosBotCod = new short[1] ;
      T01F56_A5994PosBotCod = new short[1] ;
      T01F56_A5995PosBotDsc = new String[] {""} ;
      T01F56_n5995PosBotDsc = new boolean[] {false} ;
      T01F56_A5996PosBotLar = new String[] {""} ;
      T01F56_n5996PosBotLar = new boolean[] {false} ;
      T01F56_A5997PosBotDia = new String[] {""} ;
      T01F56_n5997PosBotDia = new boolean[] {false} ;
      T01F56_A396EmprCod = new String[] {""} ;
      T01F517_A407EmprNom = new String[] {""} ;
      T01F517_n407EmprNom = new boolean[] {false} ;
      T01F518_A396EmprCod = new String[] {""} ;
      T01F518_A5994PosBotCod = new short[1] ;
      T01F519_A5994PosBotCod = new short[1] ;
      T01F519_A5998PosBotFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01F519_n5998PosBotFec = new boolean[] {false} ;
      T01F519_A396EmprCod = new String[] {""} ;
      T01F519_A652OpeCod = new int[1] ;
      T01F519_n652OpeCod = new boolean[] {false} ;
      T01F519_A2855CodBota = new int[1] ;
      T01F54_A396EmprCod = new String[] {""} ;
      T01F55_A396EmprCod = new String[] {""} ;
      T01F520_A396EmprCod = new String[] {""} ;
      T01F521_A396EmprCod = new String[] {""} ;
      T01F522_A396EmprCod = new String[] {""} ;
      T01F522_A5994PosBotCod = new short[1] ;
      T01F522_A2855CodBota = new int[1] ;
      T01F53_A5994PosBotCod = new short[1] ;
      T01F53_A5998PosBotFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01F53_n5998PosBotFec = new boolean[] {false} ;
      T01F53_A396EmprCod = new String[] {""} ;
      T01F53_A652OpeCod = new int[1] ;
      T01F53_n652OpeCod = new boolean[] {false} ;
      T01F53_A2855CodBota = new int[1] ;
      T01F52_A5994PosBotCod = new short[1] ;
      T01F52_A5998PosBotFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01F52_n5998PosBotFec = new boolean[] {false} ;
      T01F52_A396EmprCod = new String[] {""} ;
      T01F52_A652OpeCod = new int[1] ;
      T01F52_n652OpeCod = new boolean[] {false} ;
      T01F52_A2855CodBota = new int[1] ;
      T01F526_A396EmprCod = new String[] {""} ;
      T01F526_A5994PosBotCod = new short[1] ;
      T01F526_A2855CodBota = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ5995PosBotDsc = "" ;
      ZZ5996PosBotLar = "" ;
      ZZ5997PosBotDia = "" ;
      ZZ407EmprNom = "" ;
      T01F527_A396EmprCod = new String[] {""} ;
      T01F528_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tposbot__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tposbot__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tposbot__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tposbot__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tposbot__default(),
         new Object[] {
             new Object[] {
            T01F52_A5994PosBotCod, T01F52_A5998PosBotFec, T01F52_n5998PosBotFec, T01F52_A396EmprCod, T01F52_A652OpeCod, T01F52_n652OpeCod, T01F52_A2855CodBota
            }
            , new Object[] {
            T01F53_A5994PosBotCod, T01F53_A5998PosBotFec, T01F53_n5998PosBotFec, T01F53_A396EmprCod, T01F53_A652OpeCod, T01F53_n652OpeCod, T01F53_A2855CodBota
            }
            , new Object[] {
            T01F54_A396EmprCod
            }
            , new Object[] {
            T01F55_A396EmprCod
            }
            , new Object[] {
            T01F56_A5994PosBotCod, T01F56_A5995PosBotDsc, T01F56_n5995PosBotDsc, T01F56_A5996PosBotLar, T01F56_n5996PosBotLar, T01F56_A5997PosBotDia, T01F56_n5997PosBotDia, T01F56_A396EmprCod
            }
            , new Object[] {
            T01F57_A5994PosBotCod, T01F57_A5995PosBotDsc, T01F57_n5995PosBotDsc, T01F57_A5996PosBotLar, T01F57_n5996PosBotLar, T01F57_A5997PosBotDia, T01F57_n5997PosBotDia, T01F57_A396EmprCod
            }
            , new Object[] {
            T01F58_A407EmprNom, T01F58_n407EmprNom
            }
            , new Object[] {
            T01F59_A5994PosBotCod, T01F59_A5995PosBotDsc, T01F59_n5995PosBotDsc, T01F59_A407EmprNom, T01F59_n407EmprNom, T01F59_A5996PosBotLar, T01F59_n5996PosBotLar, T01F59_A5997PosBotDia, T01F59_n5997PosBotDia, T01F59_A396EmprCod
            }
            , new Object[] {
            T01F510_A407EmprNom, T01F510_n407EmprNom
            }
            , new Object[] {
            T01F511_A396EmprCod, T01F511_A5994PosBotCod
            }
            , new Object[] {
            T01F512_A396EmprCod, T01F512_A5994PosBotCod
            }
            , new Object[] {
            T01F513_A396EmprCod, T01F513_A5994PosBotCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F517_A407EmprNom, T01F517_n407EmprNom
            }
            , new Object[] {
            T01F518_A396EmprCod, T01F518_A5994PosBotCod
            }
            , new Object[] {
            T01F519_A5994PosBotCod, T01F519_A5998PosBotFec, T01F519_n5998PosBotFec, T01F519_A396EmprCod, T01F519_A652OpeCod, T01F519_n652OpeCod, T01F519_A2855CodBota
            }
            , new Object[] {
            T01F520_A396EmprCod
            }
            , new Object[] {
            T01F521_A396EmprCod
            }
            , new Object[] {
            T01F522_A396EmprCod, T01F522_A5994PosBotCod, T01F522_A2855CodBota
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F526_A396EmprCod, T01F526_A5994PosBotCod, T01F526_A2855CodBota
            }
            , new Object[] {
            T01F527_A396EmprCod
            }
            , new Object[] {
            T01F528_A396EmprCod
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
   private short Z5994PosBotCod ;
   private short nRcdDeleted_1563 ;
   private short nRcdExists_1563 ;
   private short nIsMod_1563 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5994PosBotCod ;
   private short nBlankRcdCount1563 ;
   private short RcdFound1563 ;
   private short nBlankRcdUsr1563 ;
   private short RcdFound1562 ;
   private short nIsDirty_1562 ;
   private short nIsDirty_1563 ;
   private short ZZ5994PosBotCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z2855CodBota ;
   private int Z652OpeCod ;
   private int A652OpeCod ;
   private int A2855CodBota ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPosBotCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPosBotDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPosBotLar_Enabled ;
   private int edtPosBotDia_Enabled ;
   private int edtavnRcdDeleted_1563_Enabled ;
   private int edtCodBota_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtPosBotFec_Enabled ;
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
   private int defedtCodBota_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPosBotDia_Backcolor ;
   private int edtPosBotLar_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPosBotDsc_Backcolor ;
   private int edtPosBotCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z5995PosBotDsc ;
   private String Z5996PosBotLar ;
   private String Z5997PosBotDia ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtPosBotCod_Internalname ;
   private String edtPosBotCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPosBotDsc_Internalname ;
   private String A5995PosBotDsc ;
   private String edtPosBotDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPosBotLar_Internalname ;
   private String A5996PosBotLar ;
   private String edtPosBotLar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPosBotDia_Internalname ;
   private String A5997PosBotDia ;
   private String edtPosBotDia_Jsonclick ;
   private String sMode1563 ;
   private String edtavnRcdDeleted_1563_Internalname ;
   private String edtCodBota_Internalname ;
   private String edtOpeCod_Internalname ;
   private String edtPosBotFec_Internalname ;
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
   private String sMode1562 ;
   private String GXCCtl ;
   private String Z407EmprNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1563_Jsonclick ;
   private String edtCodBota_Jsonclick ;
   private String edtOpeCod_Jsonclick ;
   private String edtPosBotFec_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ5995PosBotDsc ;
   private String ZZ5996PosBotLar ;
   private String ZZ5997PosBotDia ;
   private String ZZ407EmprNom ;
   private java.util.Date Z5998PosBotFec ;
   private java.util.Date A5998PosBotFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n5995PosBotDsc ;
   private boolean n407EmprNom ;
   private boolean n5996PosBotLar ;
   private boolean n5997PosBotDia ;
   private boolean n5998PosBotFec ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private short[] T01F59_A5994PosBotCod ;
   private String[] T01F59_A5995PosBotDsc ;
   private boolean[] T01F59_n5995PosBotDsc ;
   private String[] T01F59_A407EmprNom ;
   private boolean[] T01F59_n407EmprNom ;
   private String[] T01F59_A5996PosBotLar ;
   private boolean[] T01F59_n5996PosBotLar ;
   private String[] T01F59_A5997PosBotDia ;
   private boolean[] T01F59_n5997PosBotDia ;
   private String[] T01F59_A396EmprCod ;
   private String[] T01F58_A407EmprNom ;
   private boolean[] T01F58_n407EmprNom ;
   private String[] T01F510_A407EmprNom ;
   private boolean[] T01F510_n407EmprNom ;
   private String[] T01F511_A396EmprCod ;
   private short[] T01F511_A5994PosBotCod ;
   private short[] T01F57_A5994PosBotCod ;
   private String[] T01F57_A5995PosBotDsc ;
   private boolean[] T01F57_n5995PosBotDsc ;
   private String[] T01F57_A5996PosBotLar ;
   private boolean[] T01F57_n5996PosBotLar ;
   private String[] T01F57_A5997PosBotDia ;
   private boolean[] T01F57_n5997PosBotDia ;
   private String[] T01F57_A396EmprCod ;
   private String[] T01F512_A396EmprCod ;
   private short[] T01F512_A5994PosBotCod ;
   private String[] T01F513_A396EmprCod ;
   private short[] T01F513_A5994PosBotCod ;
   private short[] T01F56_A5994PosBotCod ;
   private String[] T01F56_A5995PosBotDsc ;
   private boolean[] T01F56_n5995PosBotDsc ;
   private String[] T01F56_A5996PosBotLar ;
   private boolean[] T01F56_n5996PosBotLar ;
   private String[] T01F56_A5997PosBotDia ;
   private boolean[] T01F56_n5997PosBotDia ;
   private String[] T01F56_A396EmprCod ;
   private String[] T01F517_A407EmprNom ;
   private boolean[] T01F517_n407EmprNom ;
   private String[] T01F518_A396EmprCod ;
   private short[] T01F518_A5994PosBotCod ;
   private short[] T01F519_A5994PosBotCod ;
   private java.util.Date[] T01F519_A5998PosBotFec ;
   private boolean[] T01F519_n5998PosBotFec ;
   private String[] T01F519_A396EmprCod ;
   private int[] T01F519_A652OpeCod ;
   private boolean[] T01F519_n652OpeCod ;
   private int[] T01F519_A2855CodBota ;
   private String[] T01F54_A396EmprCod ;
   private String[] T01F55_A396EmprCod ;
   private String[] T01F520_A396EmprCod ;
   private String[] T01F521_A396EmprCod ;
   private String[] T01F522_A396EmprCod ;
   private short[] T01F522_A5994PosBotCod ;
   private int[] T01F522_A2855CodBota ;
   private short[] T01F53_A5994PosBotCod ;
   private java.util.Date[] T01F53_A5998PosBotFec ;
   private boolean[] T01F53_n5998PosBotFec ;
   private String[] T01F53_A396EmprCod ;
   private int[] T01F53_A652OpeCod ;
   private boolean[] T01F53_n652OpeCod ;
   private int[] T01F53_A2855CodBota ;
   private short[] T01F52_A5994PosBotCod ;
   private java.util.Date[] T01F52_A5998PosBotFec ;
   private boolean[] T01F52_n5998PosBotFec ;
   private String[] T01F52_A396EmprCod ;
   private int[] T01F52_A652OpeCod ;
   private boolean[] T01F52_n652OpeCod ;
   private int[] T01F52_A2855CodBota ;
   private String[] T01F526_A396EmprCod ;
   private short[] T01F526_A5994PosBotCod ;
   private int[] T01F526_A2855CodBota ;
   private String[] T01F527_A396EmprCod ;
   private String[] T01F528_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tposbot__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tposbot__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tposbot__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tposbot__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tposbot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01F52", "SELECT PosBotCod, PosBotFec, EmprCod, OpeCod, CodBota FROM TXPPOSBOT WHERE EmprCod = ? AND PosBotCod = ? AND CodBota = ?  FOR UPDATE OF PosBotFec, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F53", "SELECT PosBotCod, PosBotFec, EmprCod, OpeCod, CodBota FROM TXPPOSBOT WHERE EmprCod = ? AND PosBotCod = ? AND CodBota = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F54", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F55", "SELECT EmprCod FROM TXPCBOTAS WHERE EmprCod = ? AND CodBota = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F56", "SELECT PosBotCod, PosBotDsc, PosBotLar, PosBotDia, EmprCod FROM TXPPOSALM WHERE EmprCod = ? AND PosBotCod = ?  FOR UPDATE OF PosBotDsc, PosBotLar, PosBotDia NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F57", "SELECT PosBotCod, PosBotDsc, PosBotLar, PosBotDia, EmprCod FROM TXPPOSALM WHERE EmprCod = ? AND PosBotCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F58", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F59", "SELECT /*+ FIRST_ROWS(100) */ TM1.PosBotCod, TM1.PosBotDsc, T2.EmprNom, TM1.PosBotLar, TM1.PosBotDia, TM1.EmprCod FROM (TXPPOSALM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PosBotCod = ? ORDER BY TM1.EmprCod, TM1.PosBotCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F510", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F511", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PosBotCod FROM TXPPOSALM WHERE EmprCod = ? AND PosBotCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PosBotCod FROM TXPPOSALM WHERE ( EmprCod > ? or EmprCod = ? and PosBotCod > ?) ORDER BY EmprCod, PosBotCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F513", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PosBotCod FROM TXPPOSALM WHERE ( EmprCod < ? or EmprCod = ? and PosBotCod < ?) ORDER BY EmprCod DESC, PosBotCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F514", "INSERT INTO TXPPOSALM(PosBotCod, PosBotDsc, PosBotLar, PosBotDia, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPOSALM")
         ,new UpdateCursor("T01F515", "UPDATE TXPPOSALM SET PosBotDsc=?, PosBotLar=?, PosBotDia=?  WHERE EmprCod = ? AND PosBotCod = ?", GX_NOMASK, "TXPPOSALM")
         ,new UpdateCursor("T01F516", "DELETE FROM TXPPOSALM  WHERE EmprCod = ? AND PosBotCod = ?", GX_NOMASK, "TXPPOSALM")
         ,new ForEachCursor("T01F517", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F518", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PosBotCod FROM TXPPOSALM ORDER BY EmprCod, PosBotCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F519", "SELECT PosBotCod, PosBotFec, EmprCod, OpeCod, CodBota FROM TXPPOSBOT WHERE EmprCod = ? and PosBotCod = ? and CodBota = ? ORDER BY EmprCod, PosBotCod, CodBota ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F520", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F521", "SELECT EmprCod FROM TXPCBOTAS WHERE EmprCod = ? AND CodBota = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F522", "SELECT EmprCod, PosBotCod, CodBota FROM TXPPOSBOT WHERE EmprCod = ? AND PosBotCod = ? AND CodBota = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01F523", "INSERT INTO TXPPOSBOT(PosBotCod, PosBotFec, EmprCod, OpeCod, CodBota) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPOSBOT")
         ,new UpdateCursor("T01F524", "UPDATE TXPPOSBOT SET PosBotFec=?, OpeCod=?  WHERE EmprCod = ? AND PosBotCod = ? AND CodBota = ?", GX_NOMASK, "TXPPOSBOT")
         ,new UpdateCursor("T01F525", "DELETE FROM TXPPOSBOT  WHERE EmprCod = ? AND PosBotCod = ? AND CodBota = ?", GX_NOMASK, "TXPPOSBOT")
         ,new ForEachCursor("T01F526", "SELECT EmprCod, PosBotCod, CodBota FROM TXPPOSBOT WHERE EmprCod = ? and PosBotCod = ? ORDER BY EmprCod, PosBotCod, CodBota ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F527", "SELECT EmprCod FROM TXPCBOTAS WHERE EmprCod = ? AND CodBota = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F528", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 26 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 26);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               stmt.setString(5, (String)parms[7], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
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
      }
   }

}

