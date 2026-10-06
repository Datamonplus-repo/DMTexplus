package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbartro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3733AlbTar = httpContext.GetPar( "AlbTar") ;
         n3733AlbTar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3733AlbTar", A3733AlbTar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A3733AlbTar) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trozos de una Pieza", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarTroFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbartro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbartro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbartro_impl.class ));
   }

   public tbartro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARTRO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Número de Trozo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha del Trozo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarTroFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroFec_Internalname, localUtil.format(A3859BarTroFec, "99/99/99"), localUtil.format( A3859BarTroFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroFec_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarTroFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarTroFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBARTRO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros del trozo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroMet_Enabled!=0) ? localUtil.format( A3860BarTroMet, "ZZZZZ9.99") : localUtil.format( A3860BarTroMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroMet_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Acho real", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3861BarTroAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3861BarTroAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroAnc_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Identificación de la pieza", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroIden_Internalname, GXutil.rtrim( A3862BarTroIden), GXutil.rtrim( localUtil.format( A3862BarTroIden, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroIden_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroIden_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Tara", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTar_Internalname, GXutil.rtrim( A3733AlbTar), GXutil.rtrim( localUtil.format( A3733AlbTar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTar_Jsonclick, 0, "", "", "", "", "", 1, edtAlbTar_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Indicativo Fin de Pieza", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroFinP_Internalname, GXutil.ltrim( localUtil.ntoc( A3863BarTroFinP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroFinP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3863BarTroFinP), "9") : localUtil.format( DecimalUtil.doubleToDec(A3863BarTroFinP), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroFinP_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroFinP_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroEst_Internalname, GXutil.ltrim( localUtil.ntoc( A3864BarTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3864BarTroEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A3864BarTroEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Hora Corte", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarTroHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroHor_Internalname, localUtil.ttoc( A13253BarTroHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13253BarTroHor, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroHor_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroHor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarTroHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarTroHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBARTRO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARTRO.htm");
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
      e11EZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3858BarTroCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3859BarTroFec = localUtil.ctod( httpContext.cgiGet( "Z3859BarTroFec"), 0) ;
            Z3860BarTroMet = localUtil.ctond( httpContext.cgiGet( "Z3860BarTroMet")) ;
            Z3861BarTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3861BarTroAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3862BarTroIden = httpContext.cgiGet( "Z3862BarTroIden") ;
            Z3863BarTroFinP = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3863BarTroFinP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3864BarTroEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3864BarTroEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13253BarTroHor = localUtil.ctot( httpContext.cgiGet( "Z13253BarTroHor"), 0) ;
            Z3733AlbTar = httpContext.cgiGet( "Z3733AlbTar") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtBarTroFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARTROFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3859BarTroFec = GXutil.nullDate() ;
               n3859BarTroFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
            }
            else
            {
               A3859BarTroFec = localUtil.ctod( httpContext.cgiGet( edtBarTroFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3859BarTroFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROMET");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3860BarTroMet = DecimalUtil.ZERO ;
               n3860BarTroMet = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
            }
            else
            {
               A3860BarTroMet = localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)) ;
               n3860BarTroMet = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3861BarTroAnc = (short)(0) ;
               n3861BarTroAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3861BarTroAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3861BarTroAnc), 4, 0));
            }
            else
            {
               A3861BarTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3861BarTroAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3861BarTroAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3861BarTroAnc), 4, 0));
            }
            A3862BarTroIden = httpContext.cgiGet( edtBarTroIden_Internalname) ;
            n3862BarTroIden = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
            A3733AlbTar = httpContext.cgiGet( edtAlbTar_Internalname) ;
            n3733AlbTar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3733AlbTar", A3733AlbTar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroFinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroFinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROFINP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroFinP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3863BarTroFinP = (byte)(0) ;
               n3863BarTroFinP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3863BarTroFinP", GXutil.str( A3863BarTroFinP, 1, 0));
            }
            else
            {
               A3863BarTroFinP = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTroFinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3863BarTroFinP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3863BarTroFinP", GXutil.str( A3863BarTroFinP, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3864BarTroEst = (byte)(0) ;
               n3864BarTroEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
            }
            else
            {
               A3864BarTroEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3864BarTroEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBarTroHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BARTROHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13253BarTroHor = GXutil.resetTime( GXutil.nullDate() );
               n13253BarTroHor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13253BarTroHor", localUtil.ttoc( A13253BarTroHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13253BarTroHor = localUtil.ctot( httpContext.cgiGet( edtBarTroHor_Internalname)) ;
               n13253BarTroHor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13253BarTroHor", localUtil.ttoc( A13253BarTroHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBARTRO");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbartro:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
               A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode531 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode531 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound531 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_EZ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                        e11EZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAllEZ531( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributesEZ531( ) ;
      }
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

   public void confirm_EZ0( )
   {
      beforeValidateEZ531( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsEZ531( ) ;
         }
         else
         {
            checkExtendedTableEZ531( ) ;
            if ( AnyError == 0 )
            {
               zmEZ531( 5) ;
               zmEZ531( 6) ;
            }
            closeExtendedTableCursorsEZ531( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesEZ0( ) ;
      }
   }

   public void resetCaptionEZ0( )
   {
   }

   public void e11EZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV8UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV13Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char1[0] = AV17EmprCod ;
      GXv_char2[0] = AV12EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char1, GXv_char2, GXv_char3) ;
      tbartro_impl.this.AV17EmprCod = GXv_char1[0] ;
      tbartro_impl.this.AV12EmprNom = GXv_char2[0] ;
      tbartro_impl.this.AV8UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprNom", AV12EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char4 = AV7Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV7Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char4 = AV9LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV9LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char4 = AV11Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV11Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lit5", AV11Lit5);
      AV10Lit1 = httpContext.getMessage( "MANTENIMIENTO DE TROZOS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char4 = AV15LitPza ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN144_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV15LitPza = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15LitPza", AV15LitPza);
      GXt_char4 = AV18Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT427_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV18Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char4 = AV19Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char4 = AV20Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT34_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char4 = AV16LitAncho ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1023_", ""), (byte)(99), GXv_char3) ;
      tbartro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV16LitAncho = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16LitAncho", AV16LitAncho);
      GXv_int5[0] = AV14Estamp ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int5) ;
      tbartro_impl.this.AV14Estamp = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Estamp", GXutil.str( AV14Estamp, 1, 0));
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
   }

   public void zmEZ531( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3859BarTroFec = T00EZ3_A3859BarTroFec[0] ;
            Z3860BarTroMet = T00EZ3_A3860BarTroMet[0] ;
            Z3861BarTroAnc = T00EZ3_A3861BarTroAnc[0] ;
            Z3862BarTroIden = T00EZ3_A3862BarTroIden[0] ;
            Z3863BarTroFinP = T00EZ3_A3863BarTroFinP[0] ;
            Z3864BarTroEst = T00EZ3_A3864BarTroEst[0] ;
            Z13253BarTroHor = T00EZ3_A13253BarTroHor[0] ;
            Z3733AlbTar = T00EZ3_A3733AlbTar[0] ;
         }
         else
         {
            Z3859BarTroFec = A3859BarTroFec ;
            Z3860BarTroMet = A3860BarTroMet ;
            Z3861BarTroAnc = A3861BarTroAnc ;
            Z3862BarTroIden = A3862BarTroIden ;
            Z3863BarTroFinP = A3863BarTroFinP ;
            Z3864BarTroEst = A3864BarTroEst ;
            Z13253BarTroHor = A13253BarTroHor ;
            Z3733AlbTar = A3733AlbTar ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z3858BarTroCod = A3858BarTroCod ;
         Z3859BarTroFec = A3859BarTroFec ;
         Z3860BarTroMet = A3860BarTroMet ;
         Z3861BarTroAnc = A3861BarTroAnc ;
         Z3862BarTroIden = A3862BarTroIden ;
         Z3863BarTroFinP = A3863BarTroFinP ;
         Z3864BarTroEst = A3864BarTroEst ;
         Z13253BarTroHor = A13253BarTroHor ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3733AlbTar = A3733AlbTar ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T00EZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite altas", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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

   public void loadEZ531( )
   {
      /* Using cursor T00EZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A3859BarTroFec = T00EZ6_A3859BarTroFec[0] ;
         n3859BarTroFec = T00EZ6_n3859BarTroFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
         A3860BarTroMet = T00EZ6_A3860BarTroMet[0] ;
         n3860BarTroMet = T00EZ6_n3860BarTroMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
         A3861BarTroAnc = T00EZ6_A3861BarTroAnc[0] ;
         n3861BarTroAnc = T00EZ6_n3861BarTroAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3861BarTroAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3861BarTroAnc), 4, 0));
         A3862BarTroIden = T00EZ6_A3862BarTroIden[0] ;
         n3862BarTroIden = T00EZ6_n3862BarTroIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
         A3863BarTroFinP = T00EZ6_A3863BarTroFinP[0] ;
         n3863BarTroFinP = T00EZ6_n3863BarTroFinP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3863BarTroFinP", GXutil.str( A3863BarTroFinP, 1, 0));
         A3864BarTroEst = T00EZ6_A3864BarTroEst[0] ;
         n3864BarTroEst = T00EZ6_n3864BarTroEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
         A13253BarTroHor = T00EZ6_A13253BarTroHor[0] ;
         n13253BarTroHor = T00EZ6_n13253BarTroHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13253BarTroHor", localUtil.ttoc( A13253BarTroHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A3733AlbTar = T00EZ6_A3733AlbTar[0] ;
         n3733AlbTar = T00EZ6_n3733AlbTar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3733AlbTar", A3733AlbTar);
         zmEZ531( -4) ;
      }
      pr_default.close(4);
      onLoadActionsEZ531( ) ;
   }

   public void onLoadActionsEZ531( )
   {
   }

   public void checkExtendedTableEZ531( )
   {
      nIsDirty_531 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00EZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n3733AlbTar), A3733AlbTar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Maestro de TARAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBTAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbTar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( A3860BarTroMet.doubleValue() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se han entrado metros", ""), 0, "BARTROMET");
      }
      if ( A3863BarTroFinP > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin? debe ser 0 (No)  o 1 (Sí)", ""), 1, "BARTROFINP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroFinP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsEZ531( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A3733AlbTar )
   {
      /* Using cursor T00EZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n3733AlbTar), A3733AlbTar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Maestro de TARAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBTAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbTar_Internalname ;
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

   public void getKeyEZ531( )
   {
      /* Using cursor T00EZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
      else
      {
         RcdFound531 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00EZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T00EZ3_A3858BarTroCod[0] == A3858BarTroCod ) && ( GXutil.strcmp(T00EZ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EZ3_A129BarCod[0] == A129BarCod ) && ( T00EZ3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00EZ3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00EZ3_A200BarPieCod[0], A200BarPieCod) == 0 ) )
      {
         zmEZ531( 4) ;
         RcdFound531 = (short)(1) ;
         A3859BarTroFec = T00EZ3_A3859BarTroFec[0] ;
         n3859BarTroFec = T00EZ3_n3859BarTroFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
         A3860BarTroMet = T00EZ3_A3860BarTroMet[0] ;
         n3860BarTroMet = T00EZ3_n3860BarTroMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
         A3861BarTroAnc = T00EZ3_A3861BarTroAnc[0] ;
         n3861BarTroAnc = T00EZ3_n3861BarTroAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3861BarTroAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3861BarTroAnc), 4, 0));
         A3862BarTroIden = T00EZ3_A3862BarTroIden[0] ;
         n3862BarTroIden = T00EZ3_n3862BarTroIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
         A3863BarTroFinP = T00EZ3_A3863BarTroFinP[0] ;
         n3863BarTroFinP = T00EZ3_n3863BarTroFinP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3863BarTroFinP", GXutil.str( A3863BarTroFinP, 1, 0));
         A3864BarTroEst = T00EZ3_A3864BarTroEst[0] ;
         n3864BarTroEst = T00EZ3_n3864BarTroEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
         A13253BarTroHor = T00EZ3_A13253BarTroHor[0] ;
         n13253BarTroHor = T00EZ3_n13253BarTroHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13253BarTroHor", localUtil.ttoc( A13253BarTroHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A3733AlbTar = T00EZ3_A3733AlbTar[0] ;
         n3733AlbTar = T00EZ3_n3733AlbTar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3733AlbTar", A3733AlbTar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadEZ531( ) ;
         if ( AnyError == 1 )
         {
            RcdFound531 = (short)(0) ;
            initializeNonKeyEZ531( ) ;
         }
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound531 = (short)(0) ;
         initializeNonKeyEZ531( ) ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyEZ531( ) ;
      if ( RcdFound531 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound531 = (short)(0) ;
      /* Using cursor T00EZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00EZ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EZ9_A129BarCod[0] == A129BarCod ) && ( T00EZ9_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00EZ9_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00EZ9_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00EZ9_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00EZ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EZ9_A129BarCod[0] == A129BarCod ) && ( T00EZ9_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00EZ9_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00EZ9_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00EZ9_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            RcdFound531 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound531 = (short)(0) ;
      /* Using cursor T00EZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00EZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EZ10_A129BarCod[0] == A129BarCod ) && ( T00EZ10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00EZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00EZ10_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00EZ10_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00EZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EZ10_A129BarCod[0] == A129BarCod ) && ( T00EZ10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00EZ10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00EZ10_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00EZ10_A3858BarTroCod[0] == A3858BarTroCod ) )
         {
            RcdFound531 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyEZ531( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarTroFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertEZ531( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound531 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
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
               GX_FocusControl = edtBarTroFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateEZ531( ) ;
               GX_FocusControl = edtBarTroFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtBarTroFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertEZ531( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtBarTroFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertEZ531( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
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
         GX_FocusControl = edtBarTroFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKeyEZ531( ) ;
      if ( RcdFound531 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbartro");
      GX_FocusControl = edtBarTroFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_EZ0( ) ;
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

   public void checkOptimisticConcurrencyEZ531( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00EZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z3859BarTroFec), GXutil.resetTime(T00EZ2_A3859BarTroFec[0])) ) || ( DecimalUtil.compareTo(Z3860BarTroMet, T00EZ2_A3860BarTroMet[0]) != 0 ) || ( Z3861BarTroAnc != T00EZ2_A3861BarTroAnc[0] ) || ( GXutil.strcmp(Z3862BarTroIden, T00EZ2_A3862BarTroIden[0]) != 0 ) || ( Z3863BarTroFinP != T00EZ2_A3863BarTroFinP[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3864BarTroEst != T00EZ2_A3864BarTroEst[0] ) || !( GXutil.dateCompare(Z13253BarTroHor, T00EZ2_A13253BarTroHor[0]) ) || ( GXutil.strcmp(Z3733AlbTar, T00EZ2_A3733AlbTar[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3859BarTroFec), GXutil.resetTime(T00EZ2_A3859BarTroFec[0])) ) )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroFec");
               GXutil.writeLogRaw("Old: ",Z3859BarTroFec);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3859BarTroFec[0]);
            }
            if ( DecimalUtil.compareTo(Z3860BarTroMet, T00EZ2_A3860BarTroMet[0]) != 0 )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroMet");
               GXutil.writeLogRaw("Old: ",Z3860BarTroMet);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3860BarTroMet[0]);
            }
            if ( Z3861BarTroAnc != T00EZ2_A3861BarTroAnc[0] )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroAnc");
               GXutil.writeLogRaw("Old: ",Z3861BarTroAnc);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3861BarTroAnc[0]);
            }
            if ( GXutil.strcmp(Z3862BarTroIden, T00EZ2_A3862BarTroIden[0]) != 0 )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroIden");
               GXutil.writeLogRaw("Old: ",Z3862BarTroIden);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3862BarTroIden[0]);
            }
            if ( Z3863BarTroFinP != T00EZ2_A3863BarTroFinP[0] )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroFinP");
               GXutil.writeLogRaw("Old: ",Z3863BarTroFinP);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3863BarTroFinP[0]);
            }
            if ( Z3864BarTroEst != T00EZ2_A3864BarTroEst[0] )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroEst");
               GXutil.writeLogRaw("Old: ",Z3864BarTroEst);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3864BarTroEst[0]);
            }
            if ( !( GXutil.dateCompare(Z13253BarTroHor, T00EZ2_A13253BarTroHor[0]) ) )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"BarTroHor");
               GXutil.writeLogRaw("Old: ",Z13253BarTroHor);
               GXutil.writeLogRaw("Current: ",T00EZ2_A13253BarTroHor[0]);
            }
            if ( GXutil.strcmp(Z3733AlbTar, T00EZ2_A3733AlbTar[0]) != 0 )
            {
               GXutil.writeLogln("tbartro:[seudo value changed for attri]"+"AlbTar");
               GXutil.writeLogRaw("Old: ",Z3733AlbTar);
               GXutil.writeLogRaw("Current: ",T00EZ2_A3733AlbTar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARTRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertEZ531( )
   {
      beforeValidateEZ531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableEZ531( ) ;
      }
      if ( AnyError == 0 )
      {
         zmEZ531( 0) ;
         checkOptimisticConcurrencyEZ531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmEZ531( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertEZ531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00EZ11 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A3858BarTroCod), Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n3861BarTroAnc), Short.valueOf(A3861BarTroAnc), Boolean.valueOf(n3862BarTroIden), A3862BarTroIden, Boolean.valueOf(n3863BarTroFinP), Byte.valueOf(A3863BarTroFinP), Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), Boolean.valueOf(n13253BarTroHor), A13253BarTroHor, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Boolean.valueOf(n3733AlbTar), A3733AlbTar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
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
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
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
            loadEZ531( ) ;
         }
         endLevelEZ531( ) ;
      }
      closeExtendedTableCursorsEZ531( ) ;
   }

   public void updateEZ531( )
   {
      beforeValidateEZ531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableEZ531( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyEZ531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmEZ531( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateEZ531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00EZ12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n3861BarTroAnc), Short.valueOf(A3861BarTroAnc), Boolean.valueOf(n3862BarTroIden), A3862BarTroIden, Boolean.valueOf(n3863BarTroFinP), Byte.valueOf(A3863BarTroFinP), Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), Boolean.valueOf(n13253BarTroHor), A13253BarTroHor, Boolean.valueOf(n3733AlbTar), A3733AlbTar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateEZ531( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
         endLevelEZ531( ) ;
      }
      closeExtendedTableCursorsEZ531( ) ;
   }

   public void deferredUpdateEZ531( )
   {
   }

   public void delete( )
   {
      beforeValidateEZ531( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyEZ531( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsEZ531( ) ;
         afterConfirmEZ531( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteEZ531( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00EZ13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isIns( ) || isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
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
      }
      sMode531 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelEZ531( ) ;
      Gx_mode = sMode531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsEZ531( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00EZ14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00EZ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarTrDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevelEZ531( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteEZ531( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbartro");
         if ( AnyError == 0 )
         {
            confirmValuesEZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbartro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartEZ531( )
   {
      /* Scan By routine */
      /* Using cursor T00EZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextEZ531( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
   }

   public void scanEndEZ531( )
   {
      pr_default.close(14);
   }

   public void afterConfirmEZ531( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertEZ531( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateEZ531( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteEZ531( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteEZ531( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateEZ531( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesEZ531( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtBarTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), true);
      edtBarTroFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroFec_Enabled), 5, 0), true);
      edtBarTroMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroMet_Enabled), 5, 0), true);
      edtBarTroAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroAnc_Enabled), 5, 0), true);
      edtBarTroIden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroIden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroIden_Enabled), 5, 0), true);
      edtAlbTar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTar_Enabled), 5, 0), true);
      edtBarTroFinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroFinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroFinP_Enabled), 5, 0), true);
      edtBarTroEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroEst_Enabled), 5, 0), true);
      edtBarTroHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroHor_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesEZ531( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesEZ0( )
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbartro", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarTroCod","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARTRO");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbartro:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3858BarTroCod", GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3859BarTroFec", localUtil.dtoc( Z3859BarTroFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3860BarTroMet", GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3861BarTroAnc", GXutil.ltrim( localUtil.ntoc( Z3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3862BarTroIden", GXutil.rtrim( Z3862BarTroIden));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3863BarTroFinP", GXutil.ltrim( localUtil.ntoc( Z3863BarTroFinP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3864BarTroEst", GXutil.ltrim( localUtil.ntoc( Z3864BarTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13253BarTroHor", localUtil.ttoc( Z13253BarTroHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3733AlbTar", GXutil.rtrim( Z3733AlbTar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tbartro", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarTroCod","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TBARTRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trozos de una Pieza", "") ;
   }

   public void initializeNonKeyEZ531( )
   {
      A3859BarTroFec = GXutil.nullDate() ;
      n3859BarTroFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
      A3860BarTroMet = DecimalUtil.ZERO ;
      n3860BarTroMet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
      A3861BarTroAnc = (short)(0) ;
      n3861BarTroAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3861BarTroAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3861BarTroAnc), 4, 0));
      A3862BarTroIden = "" ;
      n3862BarTroIden = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
      A3733AlbTar = "" ;
      n3733AlbTar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3733AlbTar", A3733AlbTar);
      A3863BarTroFinP = (byte)(0) ;
      n3863BarTroFinP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3863BarTroFinP", GXutil.str( A3863BarTroFinP, 1, 0));
      A3864BarTroEst = (byte)(0) ;
      n3864BarTroEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
      A13253BarTroHor = GXutil.resetTime( GXutil.nullDate() );
      n13253BarTroHor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13253BarTroHor", localUtil.ttoc( A13253BarTroHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z3859BarTroFec = GXutil.nullDate() ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z3861BarTroAnc = (short)(0) ;
      Z3862BarTroIden = "" ;
      Z3863BarTroFinP = (byte)(0) ;
      Z3864BarTroEst = (byte)(0) ;
      Z13253BarTroHor = GXutil.resetTime( GXutil.nullDate() );
      Z3733AlbTar = "" ;
   }

   public void initAllEZ531( )
   {
      initializeNonKeyEZ531( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101625681", true, true);
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
      httpContext.AddJavascriptSource("tbartro.js", "?20266101625681", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarTroCod_Internalname = "BARTROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarTroFec_Internalname = "BARTROFEC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarTroMet_Internalname = "BARTROMET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarTroAnc_Internalname = "BARTROANC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarTroIden_Internalname = "BARTROIDEN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlbTar_Internalname = "ALBTAR" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarTroFinP_Internalname = "BARTROFINP" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarTroEst_Internalname = "BARTROEST" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarTroHor_Internalname = "BARTROHOR" ;
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
      Form.setCaption( httpContext.getMessage( "Trozos de una Pieza", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarTroHor_Jsonclick = "" ;
      edtBarTroHor_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroHor_Enabled = 1 ;
      edtBarTroEst_Jsonclick = "" ;
      edtBarTroEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroEst_Enabled = 1 ;
      edtBarTroFinP_Jsonclick = "" ;
      edtBarTroFinP_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroFinP_Enabled = 1 ;
      edtAlbTar_Jsonclick = "" ;
      edtAlbTar_Backcolor = (int)(0xFFFFFF) ;
      edtAlbTar_Enabled = 1 ;
      edtBarTroIden_Jsonclick = "" ;
      edtBarTroIden_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroIden_Enabled = 1 ;
      edtBarTroAnc_Jsonclick = "" ;
      edtBarTroAnc_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroAnc_Enabled = 1 ;
      edtBarTroMet_Jsonclick = "" ;
      edtBarTroMet_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroMet_Enabled = 1 ;
      edtBarTroFec_Jsonclick = "" ;
      edtBarTroFec_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroFec_Enabled = 1 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtBarTroCod_Jsonclick = "" ;
      edtBarTroCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroCod_Enabled = 0 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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

   public void valid_Albtar( )
   {
      n3733AlbTar = false ;
      /* Using cursor T00EZ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n3733AlbTar), A3733AlbTar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Maestro de TARAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBTAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbTar_Internalname ;
      }
      pr_default.close(15);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALID_BARTROCOD","{handler:'valid_Bartrocod',iparms:[]");
      setEventMetadata("VALID_BARTROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARTROMET","{handler:'valid_Bartromet',iparms:[]");
      setEventMetadata("VALID_BARTROMET",",oparms:[]}");
      setEventMetadata("VALID_ALBTAR","{handler:'valid_Albtar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3733AlbTar',fld:'ALBTAR',pic:''}]");
      setEventMetadata("VALID_ALBTAR",",oparms:[]}");
      setEventMetadata("VALID_BARTROFINP","{handler:'valid_Bartrofinp',iparms:[]");
      setEventMetadata("VALID_BARTROFINP",",oparms:[]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA200BarPieCod = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z3859BarTroFec = GXutil.nullDate() ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z3862BarTroIden = "" ;
      Z13253BarTroHor = GXutil.resetTime( GXutil.nullDate() );
      Z3733AlbTar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3733AlbTar = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      Gx_mode = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A3859BarTroFec = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3862BarTroIden = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A13253BarTroHor = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode531 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV8UsurCod = "" ;
      AV13Station = "" ;
      AV17EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV12EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV11Lit5 = "" ;
      AV10Lit1 = "" ;
      AV15LitPza = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      AV16LitAncho = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      T00EZ4_A396EmprCod = new String[] {""} ;
      T00EZ6_A3858BarTroCod = new short[1] ;
      T00EZ6_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00EZ6_n3859BarTroFec = new boolean[] {false} ;
      T00EZ6_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EZ6_n3860BarTroMet = new boolean[] {false} ;
      T00EZ6_A3861BarTroAnc = new short[1] ;
      T00EZ6_n3861BarTroAnc = new boolean[] {false} ;
      T00EZ6_A3862BarTroIden = new String[] {""} ;
      T00EZ6_n3862BarTroIden = new boolean[] {false} ;
      T00EZ6_A3863BarTroFinP = new byte[1] ;
      T00EZ6_n3863BarTroFinP = new boolean[] {false} ;
      T00EZ6_A3864BarTroEst = new byte[1] ;
      T00EZ6_n3864BarTroEst = new boolean[] {false} ;
      T00EZ6_A13253BarTroHor = new java.util.Date[] {GXutil.nullDate()} ;
      T00EZ6_n13253BarTroHor = new boolean[] {false} ;
      T00EZ6_A396EmprCod = new String[] {""} ;
      T00EZ6_A129BarCod = new int[1] ;
      T00EZ6_A132BarCodReo = new byte[1] ;
      T00EZ6_A130BarCodPar = new String[] {""} ;
      T00EZ6_A200BarPieCod = new String[] {""} ;
      T00EZ6_A3733AlbTar = new String[] {""} ;
      T00EZ6_n3733AlbTar = new boolean[] {false} ;
      T00EZ5_A396EmprCod = new String[] {""} ;
      T00EZ7_A396EmprCod = new String[] {""} ;
      T00EZ8_A396EmprCod = new String[] {""} ;
      T00EZ8_A129BarCod = new int[1] ;
      T00EZ8_A132BarCodReo = new byte[1] ;
      T00EZ8_A130BarCodPar = new String[] {""} ;
      T00EZ8_A200BarPieCod = new String[] {""} ;
      T00EZ8_A3858BarTroCod = new short[1] ;
      T00EZ3_A3858BarTroCod = new short[1] ;
      T00EZ3_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00EZ3_n3859BarTroFec = new boolean[] {false} ;
      T00EZ3_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EZ3_n3860BarTroMet = new boolean[] {false} ;
      T00EZ3_A3861BarTroAnc = new short[1] ;
      T00EZ3_n3861BarTroAnc = new boolean[] {false} ;
      T00EZ3_A3862BarTroIden = new String[] {""} ;
      T00EZ3_n3862BarTroIden = new boolean[] {false} ;
      T00EZ3_A3863BarTroFinP = new byte[1] ;
      T00EZ3_n3863BarTroFinP = new boolean[] {false} ;
      T00EZ3_A3864BarTroEst = new byte[1] ;
      T00EZ3_n3864BarTroEst = new boolean[] {false} ;
      T00EZ3_A13253BarTroHor = new java.util.Date[] {GXutil.nullDate()} ;
      T00EZ3_n13253BarTroHor = new boolean[] {false} ;
      T00EZ3_A396EmprCod = new String[] {""} ;
      T00EZ3_A129BarCod = new int[1] ;
      T00EZ3_A132BarCodReo = new byte[1] ;
      T00EZ3_A130BarCodPar = new String[] {""} ;
      T00EZ3_A200BarPieCod = new String[] {""} ;
      T00EZ3_A3733AlbTar = new String[] {""} ;
      T00EZ3_n3733AlbTar = new boolean[] {false} ;
      T00EZ9_A396EmprCod = new String[] {""} ;
      T00EZ9_A129BarCod = new int[1] ;
      T00EZ9_A132BarCodReo = new byte[1] ;
      T00EZ9_A130BarCodPar = new String[] {""} ;
      T00EZ9_A200BarPieCod = new String[] {""} ;
      T00EZ9_A3858BarTroCod = new short[1] ;
      T00EZ10_A396EmprCod = new String[] {""} ;
      T00EZ10_A129BarCod = new int[1] ;
      T00EZ10_A132BarCodReo = new byte[1] ;
      T00EZ10_A130BarCodPar = new String[] {""} ;
      T00EZ10_A200BarPieCod = new String[] {""} ;
      T00EZ10_A3858BarTroCod = new short[1] ;
      T00EZ2_A3858BarTroCod = new short[1] ;
      T00EZ2_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00EZ2_n3859BarTroFec = new boolean[] {false} ;
      T00EZ2_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EZ2_n3860BarTroMet = new boolean[] {false} ;
      T00EZ2_A3861BarTroAnc = new short[1] ;
      T00EZ2_n3861BarTroAnc = new boolean[] {false} ;
      T00EZ2_A3862BarTroIden = new String[] {""} ;
      T00EZ2_n3862BarTroIden = new boolean[] {false} ;
      T00EZ2_A3863BarTroFinP = new byte[1] ;
      T00EZ2_n3863BarTroFinP = new boolean[] {false} ;
      T00EZ2_A3864BarTroEst = new byte[1] ;
      T00EZ2_n3864BarTroEst = new boolean[] {false} ;
      T00EZ2_A13253BarTroHor = new java.util.Date[] {GXutil.nullDate()} ;
      T00EZ2_n13253BarTroHor = new boolean[] {false} ;
      T00EZ2_A396EmprCod = new String[] {""} ;
      T00EZ2_A129BarCod = new int[1] ;
      T00EZ2_A132BarCodReo = new byte[1] ;
      T00EZ2_A130BarCodPar = new String[] {""} ;
      T00EZ2_A200BarPieCod = new String[] {""} ;
      T00EZ2_A3733AlbTar = new String[] {""} ;
      T00EZ2_n3733AlbTar = new boolean[] {false} ;
      T00EZ14_A396EmprCod = new String[] {""} ;
      T00EZ14_A129BarCod = new int[1] ;
      T00EZ14_A132BarCodReo = new byte[1] ;
      T00EZ14_A130BarCodPar = new String[] {""} ;
      T00EZ14_A200BarPieCod = new String[] {""} ;
      T00EZ14_A3858BarTroCod = new short[1] ;
      T00EZ14_A12649TRDefcod = new short[1] ;
      T00EZ14_A12650TRFasCod = new String[] {""} ;
      T00EZ15_A396EmprCod = new String[] {""} ;
      T00EZ15_A129BarCod = new int[1] ;
      T00EZ15_A132BarCodReo = new byte[1] ;
      T00EZ15_A130BarCodPar = new String[] {""} ;
      T00EZ15_A200BarPieCod = new String[] {""} ;
      T00EZ15_A3858BarTroCod = new short[1] ;
      T00EZ15_A4993BarTroDef = new short[1] ;
      T00EZ16_A396EmprCod = new String[] {""} ;
      T00EZ16_A129BarCod = new int[1] ;
      T00EZ16_A132BarCodReo = new byte[1] ;
      T00EZ16_A130BarCodPar = new String[] {""} ;
      T00EZ16_A200BarPieCod = new String[] {""} ;
      T00EZ16_A3858BarTroCod = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00EZ17_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbartro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbartro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbartro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbartro__default(),
         new Object[] {
             new Object[] {
            T00EZ2_A3858BarTroCod, T00EZ2_A3859BarTroFec, T00EZ2_n3859BarTroFec, T00EZ2_A3860BarTroMet, T00EZ2_n3860BarTroMet, T00EZ2_A3861BarTroAnc, T00EZ2_n3861BarTroAnc, T00EZ2_A3862BarTroIden, T00EZ2_n3862BarTroIden, T00EZ2_A3863BarTroFinP,
            T00EZ2_n3863BarTroFinP, T00EZ2_A3864BarTroEst, T00EZ2_n3864BarTroEst, T00EZ2_A13253BarTroHor, T00EZ2_n13253BarTroHor, T00EZ2_A396EmprCod, T00EZ2_A129BarCod, T00EZ2_A132BarCodReo, T00EZ2_A130BarCodPar, T00EZ2_A200BarPieCod,
            T00EZ2_A3733AlbTar, T00EZ2_n3733AlbTar
            }
            , new Object[] {
            T00EZ3_A3858BarTroCod, T00EZ3_A3859BarTroFec, T00EZ3_n3859BarTroFec, T00EZ3_A3860BarTroMet, T00EZ3_n3860BarTroMet, T00EZ3_A3861BarTroAnc, T00EZ3_n3861BarTroAnc, T00EZ3_A3862BarTroIden, T00EZ3_n3862BarTroIden, T00EZ3_A3863BarTroFinP,
            T00EZ3_n3863BarTroFinP, T00EZ3_A3864BarTroEst, T00EZ3_n3864BarTroEst, T00EZ3_A13253BarTroHor, T00EZ3_n13253BarTroHor, T00EZ3_A396EmprCod, T00EZ3_A129BarCod, T00EZ3_A132BarCodReo, T00EZ3_A130BarCodPar, T00EZ3_A200BarPieCod,
            T00EZ3_A3733AlbTar, T00EZ3_n3733AlbTar
            }
            , new Object[] {
            T00EZ4_A396EmprCod
            }
            , new Object[] {
            T00EZ5_A396EmprCod
            }
            , new Object[] {
            T00EZ6_A3858BarTroCod, T00EZ6_A3859BarTroFec, T00EZ6_n3859BarTroFec, T00EZ6_A3860BarTroMet, T00EZ6_n3860BarTroMet, T00EZ6_A3861BarTroAnc, T00EZ6_n3861BarTroAnc, T00EZ6_A3862BarTroIden, T00EZ6_n3862BarTroIden, T00EZ6_A3863BarTroFinP,
            T00EZ6_n3863BarTroFinP, T00EZ6_A3864BarTroEst, T00EZ6_n3864BarTroEst, T00EZ6_A13253BarTroHor, T00EZ6_n13253BarTroHor, T00EZ6_A396EmprCod, T00EZ6_A129BarCod, T00EZ6_A132BarCodReo, T00EZ6_A130BarCodPar, T00EZ6_A200BarPieCod,
            T00EZ6_A3733AlbTar, T00EZ6_n3733AlbTar
            }
            , new Object[] {
            T00EZ7_A396EmprCod
            }
            , new Object[] {
            T00EZ8_A396EmprCod, T00EZ8_A129BarCod, T00EZ8_A132BarCodReo, T00EZ8_A130BarCodPar, T00EZ8_A200BarPieCod, T00EZ8_A3858BarTroCod
            }
            , new Object[] {
            T00EZ9_A396EmprCod, T00EZ9_A129BarCod, T00EZ9_A132BarCodReo, T00EZ9_A130BarCodPar, T00EZ9_A200BarPieCod, T00EZ9_A3858BarTroCod
            }
            , new Object[] {
            T00EZ10_A396EmprCod, T00EZ10_A129BarCod, T00EZ10_A132BarCodReo, T00EZ10_A130BarCodPar, T00EZ10_A200BarPieCod, T00EZ10_A3858BarTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00EZ14_A396EmprCod, T00EZ14_A129BarCod, T00EZ14_A132BarCodReo, T00EZ14_A130BarCodPar, T00EZ14_A200BarPieCod, T00EZ14_A3858BarTroCod, T00EZ14_A12649TRDefcod, T00EZ14_A12650TRFasCod
            }
            , new Object[] {
            T00EZ15_A396EmprCod, T00EZ15_A129BarCod, T00EZ15_A132BarCodReo, T00EZ15_A130BarCodPar, T00EZ15_A200BarPieCod, T00EZ15_A3858BarTroCod, T00EZ15_A4993BarTroDef
            }
            , new Object[] {
            T00EZ16_A396EmprCod, T00EZ16_A129BarCod, T00EZ16_A132BarCodReo, T00EZ16_A130BarCodPar, T00EZ16_A200BarPieCod, T00EZ16_A3858BarTroCod
            }
            , new Object[] {
            T00EZ17_A396EmprCod
            }
         }
      );
      Z3858BarTroCod = (short)(0) ;
      A3858BarTroCod = (short)(0) ;
      Z200BarPieCod = "" ;
      A200BarPieCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z3863BarTroFinP ;
   private byte Z3864BarTroEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3863BarTroFinP ;
   private byte A3864BarTroEst ;
   private byte AV14Estamp ;
   private byte GXv_int5[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOA3858BarTroCod ;
   private short Z3858BarTroCod ;
   private short Z3861BarTroAnc ;
   private short A3858BarTroCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3861BarTroAnc ;
   private short RcdFound531 ;
   private short nIsDirty_531 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int edtBarTroCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarTroFec_Enabled ;
   private int edtBarTroMet_Enabled ;
   private int edtBarTroAnc_Enabled ;
   private int edtBarTroIden_Enabled ;
   private int edtAlbTar_Enabled ;
   private int edtBarTroFinP_Enabled ;
   private int edtBarTroEst_Enabled ;
   private int edtBarTroHor_Enabled ;
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
   private int edtBarTroHor_Backcolor ;
   private int edtBarTroEst_Backcolor ;
   private int edtBarTroFinP_Backcolor ;
   private int edtAlbTar_Backcolor ;
   private int edtBarTroIden_Backcolor ;
   private int edtBarTroAnc_Backcolor ;
   private int edtBarTroMet_Backcolor ;
   private int edtBarTroFec_Backcolor ;
   private int edtBarTroCod_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z3860BarTroMet ;
   private java.math.BigDecimal A3860BarTroMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA200BarPieCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z3862BarTroIden ;
   private String Z3733AlbTar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3733AlbTar ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarTroFec_Internalname ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarPieCod_Internalname ;
   private String edtBarPieCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarTroCod_Internalname ;
   private String edtBarTroCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarTroFec_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarTroMet_Internalname ;
   private String edtBarTroMet_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarTroAnc_Internalname ;
   private String edtBarTroAnc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarTroIden_Internalname ;
   private String A3862BarTroIden ;
   private String edtBarTroIden_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlbTar_Internalname ;
   private String edtAlbTar_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarTroFinP_Internalname ;
   private String edtBarTroFinP_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarTroEst_Internalname ;
   private String edtBarTroEst_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarTroHor_Internalname ;
   private String edtBarTroHor_Jsonclick ;
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
   private String hsh ;
   private String sMode531 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV8UsurCod ;
   private String AV13Station ;
   private String AV17EmprCod ;
   private String GXv_char1[] ;
   private String AV12EmprNom ;
   private String GXv_char2[] ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV11Lit5 ;
   private String AV10Lit1 ;
   private String AV15LitPza ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String AV16LitAncho ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z13253BarTroHor ;
   private java.util.Date A13253BarTroHor ;
   private java.util.Date Z3859BarTroFec ;
   private java.util.Date A3859BarTroFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3733AlbTar ;
   private boolean wbErr ;
   private boolean n3859BarTroFec ;
   private boolean n3860BarTroMet ;
   private boolean n3861BarTroAnc ;
   private boolean n3862BarTroIden ;
   private boolean n3863BarTroFinP ;
   private boolean n3864BarTroEst ;
   private boolean n13253BarTroHor ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00EZ4_A396EmprCod ;
   private short[] T00EZ6_A3858BarTroCod ;
   private java.util.Date[] T00EZ6_A3859BarTroFec ;
   private boolean[] T00EZ6_n3859BarTroFec ;
   private java.math.BigDecimal[] T00EZ6_A3860BarTroMet ;
   private boolean[] T00EZ6_n3860BarTroMet ;
   private short[] T00EZ6_A3861BarTroAnc ;
   private boolean[] T00EZ6_n3861BarTroAnc ;
   private String[] T00EZ6_A3862BarTroIden ;
   private boolean[] T00EZ6_n3862BarTroIden ;
   private byte[] T00EZ6_A3863BarTroFinP ;
   private boolean[] T00EZ6_n3863BarTroFinP ;
   private byte[] T00EZ6_A3864BarTroEst ;
   private boolean[] T00EZ6_n3864BarTroEst ;
   private java.util.Date[] T00EZ6_A13253BarTroHor ;
   private boolean[] T00EZ6_n13253BarTroHor ;
   private String[] T00EZ6_A396EmprCod ;
   private int[] T00EZ6_A129BarCod ;
   private byte[] T00EZ6_A132BarCodReo ;
   private String[] T00EZ6_A130BarCodPar ;
   private String[] T00EZ6_A200BarPieCod ;
   private String[] T00EZ6_A3733AlbTar ;
   private boolean[] T00EZ6_n3733AlbTar ;
   private String[] T00EZ5_A396EmprCod ;
   private String[] T00EZ7_A396EmprCod ;
   private String[] T00EZ8_A396EmprCod ;
   private int[] T00EZ8_A129BarCod ;
   private byte[] T00EZ8_A132BarCodReo ;
   private String[] T00EZ8_A130BarCodPar ;
   private String[] T00EZ8_A200BarPieCod ;
   private short[] T00EZ8_A3858BarTroCod ;
   private short[] T00EZ3_A3858BarTroCod ;
   private java.util.Date[] T00EZ3_A3859BarTroFec ;
   private boolean[] T00EZ3_n3859BarTroFec ;
   private java.math.BigDecimal[] T00EZ3_A3860BarTroMet ;
   private boolean[] T00EZ3_n3860BarTroMet ;
   private short[] T00EZ3_A3861BarTroAnc ;
   private boolean[] T00EZ3_n3861BarTroAnc ;
   private String[] T00EZ3_A3862BarTroIden ;
   private boolean[] T00EZ3_n3862BarTroIden ;
   private byte[] T00EZ3_A3863BarTroFinP ;
   private boolean[] T00EZ3_n3863BarTroFinP ;
   private byte[] T00EZ3_A3864BarTroEst ;
   private boolean[] T00EZ3_n3864BarTroEst ;
   private java.util.Date[] T00EZ3_A13253BarTroHor ;
   private boolean[] T00EZ3_n13253BarTroHor ;
   private String[] T00EZ3_A396EmprCod ;
   private int[] T00EZ3_A129BarCod ;
   private byte[] T00EZ3_A132BarCodReo ;
   private String[] T00EZ3_A130BarCodPar ;
   private String[] T00EZ3_A200BarPieCod ;
   private String[] T00EZ3_A3733AlbTar ;
   private boolean[] T00EZ3_n3733AlbTar ;
   private String[] T00EZ9_A396EmprCod ;
   private int[] T00EZ9_A129BarCod ;
   private byte[] T00EZ9_A132BarCodReo ;
   private String[] T00EZ9_A130BarCodPar ;
   private String[] T00EZ9_A200BarPieCod ;
   private short[] T00EZ9_A3858BarTroCod ;
   private String[] T00EZ10_A396EmprCod ;
   private int[] T00EZ10_A129BarCod ;
   private byte[] T00EZ10_A132BarCodReo ;
   private String[] T00EZ10_A130BarCodPar ;
   private String[] T00EZ10_A200BarPieCod ;
   private short[] T00EZ10_A3858BarTroCod ;
   private short[] T00EZ2_A3858BarTroCod ;
   private java.util.Date[] T00EZ2_A3859BarTroFec ;
   private boolean[] T00EZ2_n3859BarTroFec ;
   private java.math.BigDecimal[] T00EZ2_A3860BarTroMet ;
   private boolean[] T00EZ2_n3860BarTroMet ;
   private short[] T00EZ2_A3861BarTroAnc ;
   private boolean[] T00EZ2_n3861BarTroAnc ;
   private String[] T00EZ2_A3862BarTroIden ;
   private boolean[] T00EZ2_n3862BarTroIden ;
   private byte[] T00EZ2_A3863BarTroFinP ;
   private boolean[] T00EZ2_n3863BarTroFinP ;
   private byte[] T00EZ2_A3864BarTroEst ;
   private boolean[] T00EZ2_n3864BarTroEst ;
   private java.util.Date[] T00EZ2_A13253BarTroHor ;
   private boolean[] T00EZ2_n13253BarTroHor ;
   private String[] T00EZ2_A396EmprCod ;
   private int[] T00EZ2_A129BarCod ;
   private byte[] T00EZ2_A132BarCodReo ;
   private String[] T00EZ2_A130BarCodPar ;
   private String[] T00EZ2_A200BarPieCod ;
   private String[] T00EZ2_A3733AlbTar ;
   private boolean[] T00EZ2_n3733AlbTar ;
   private String[] T00EZ14_A396EmprCod ;
   private int[] T00EZ14_A129BarCod ;
   private byte[] T00EZ14_A132BarCodReo ;
   private String[] T00EZ14_A130BarCodPar ;
   private String[] T00EZ14_A200BarPieCod ;
   private short[] T00EZ14_A3858BarTroCod ;
   private short[] T00EZ14_A12649TRDefcod ;
   private String[] T00EZ14_A12650TRFasCod ;
   private String[] T00EZ15_A396EmprCod ;
   private int[] T00EZ15_A129BarCod ;
   private byte[] T00EZ15_A132BarCodReo ;
   private String[] T00EZ15_A130BarCodPar ;
   private String[] T00EZ15_A200BarPieCod ;
   private short[] T00EZ15_A3858BarTroCod ;
   private short[] T00EZ15_A4993BarTroDef ;
   private String[] T00EZ16_A396EmprCod ;
   private int[] T00EZ16_A129BarCod ;
   private byte[] T00EZ16_A132BarCodReo ;
   private String[] T00EZ16_A130BarCodPar ;
   private String[] T00EZ16_A200BarPieCod ;
   private short[] T00EZ16_A3858BarTroCod ;
   private String[] T00EZ17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbartro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00EZ2", "SELECT BarTroCod, BarTroFec, BarTroMet, BarTroAnc, BarTroIden, BarTroFinP, BarTroEst, BarTroHor, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbTar FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?  FOR UPDATE OF BarTroFec, BarTroMet, BarTroAnc, BarTroIden, BarTroFinP, BarTroEst, BarTroHor, AlbTar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ3", "SELECT BarTroCod, BarTroFec, BarTroMet, BarTroAnc, BarTroIden, BarTroFinP, BarTroEst, BarTroHor, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbTar FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ4", "SELECT EmprCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ5", "SELECT EmprCod FROM TXPALBTAR WHERE EmprCod = ? AND AlbTar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ6", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarTroCod, TM1.BarTroFec, TM1.BarTroMet, TM1.BarTroAnc, TM1.BarTroIden, TM1.BarTroFinP, TM1.BarTroEst, TM1.BarTroHor, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod, TM1.AlbTar FROM TXPBARTRO TM1 WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? and TM1.BarTroCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod, TM1.BarTroCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ7", "SELECT EmprCod FROM TXPALBTAR WHERE EmprCod = ? AND AlbTar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC, BarTroCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00EZ11", "INSERT INTO TXPBARTRO(BarTroCod, BarTroFec, BarTroMet, BarTroAnc, BarTroIden, BarTroFinP, BarTroEst, BarTroHor, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbTar, BarTroCal, BarTroOpeC, BarTroUltD, BarTroJau, BarTroObs, BarTroKil, BarTroCarr, BarTroOb) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', 0, 0, ' ')", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T00EZ12", "UPDATE TXPBARTRO SET BarTroFec=?, BarTroMet=?, BarTroAnc=?, BarTroIden=?, BarTroFinP=?, BarTroEst=?, BarTroHor=?, AlbTar=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T00EZ13", "DELETE FROM TXPBARTRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new ForEachCursor("T00EZ14", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, TRDefcod, TRFasCod FROM TXPPZTRD0 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EZ17", "SELECT EmprCod FROM TXPALBTAR WHERE EmprCod = ? AND AlbTar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((String[]) buf[19])[0] = rslt.getString(13, 9);
               ((String[]) buf[20])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((String[]) buf[19])[0] = rslt.getString(13, 9);
               ((String[]) buf[20])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((String[]) buf[19])[0] = rslt.getString(13, 9);
               ((String[]) buf[20])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 15);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], false);
               }
               stmt.setString(9, (String)parms[15], 3);
               stmt.setInt(10, ((Number) parms[16]).intValue());
               stmt.setByte(11, ((Number) parms[17]).byteValue());
               stmt.setString(12, (String)parms[18], 1);
               stmt.setString(13, (String)parms[19], 9);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 2);
               }
               return;
            case 10 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 15);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setString(13, (String)parms[20], 9);
               stmt.setShort(14, ((Number) parms[21]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
      }
   }

}

