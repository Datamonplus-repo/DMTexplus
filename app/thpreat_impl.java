package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thpreat_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A252CliCod, A65ArtCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", ""), (short)(0)) ;
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

   public thpreat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thpreat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thpreat_impl.class ));
   }

   public thpreat_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THPREAT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Dia Modificacion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtH_DiaA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_DiaA_Internalname, localUtil.format(A11084H_DiaA, "99/99/99"), localUtil.format( A11084H_DiaA, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_DiaA_Jsonclick, 0, "", "", "", "", "", 1, edtH_DiaA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREAT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtH_DiaA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtH_DiaA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THPREAT.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultimo movimiento dia", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_UltlA_Internalname, GXutil.ltrim( localUtil.ntoc( A11085H_UltlA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_UltlA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11085H_UltlA), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11085H_UltlA), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_UltlA_Jsonclick, 0, "", "", "", "", "", 1, edtH_UltlA_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREAT.htm");
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
         nBlankRcdCount1480 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1480 = (short)(1) ;
            scanStart1AN1480( ) ;
            while ( RcdFound1480 != 0 )
            {
               init_level_properties1480( ) ;
               getByPrimaryKey1AN1480( ) ;
               addRow1AN1480( ) ;
               scanNext1AN1480( ) ;
            }
            scanEnd1AN1480( ) ;
            nBlankRcdCount1480 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AN1480( ) ;
         standaloneModal1AN1480( ) ;
         sMode1480 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1AN1480( ) ;
            edtavnRcdDeleted_1480_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1480_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1480_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1480_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_linA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_linA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_PkA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_PkA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PkA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_PmA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PMA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_PmA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PmA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_TmA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TMA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_TmA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_TmA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_UsA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_USA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_UsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UsA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_HhA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_HHA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_HhA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_HhA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtH_obsa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_OBSA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_obsa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_obsa_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1480 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AN1480( ) ;
            }
            sendRow1AN1480( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1480 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1480 = (short)(5) ;
         nRcdExists_1480 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AN1480( ) ;
            while ( RcdFound1480 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601480( ) ;
               init_level_properties1480( ) ;
               standaloneNotModal1AN1480( ) ;
               getByPrimaryKey1AN1480( ) ;
               standaloneModal1AN1480( ) ;
               addRow1AN1480( ) ;
               scanNext1AN1480( ) ;
            }
            scanEnd1AN1480( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1480 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601480( ) ;
      initAll1AN1480( ) ;
      init_level_properties1480( ) ;
      nRcdExists_1480 = (short)(0) ;
      nIsMod_1480 = (short)(0) ;
      nRcdDeleted_1480 = (short)(0) ;
      nBlankRcdCount1480 = (short)(nBlankRcdUsr1480+nBlankRcdCount1480) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1480 > 0 )
      {
         standaloneNotModal1AN1480( ) ;
         standaloneModal1AN1480( ) ;
         addRow1AN1480( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtH_linA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1480 = (short)(nBlankRcdCount1480-1) ;
      }
      Gx_mode = sMode1480 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THPREAT.htm");
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
      e111AN2 ();
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
            Z11084H_DiaA = localUtil.ctod( httpContext.cgiGet( "Z11084H_DiaA"), 0) ;
            Z11085H_UltlA = (int)(localUtil.ctol( httpContext.cgiGet( "Z11085H_UltlA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtH_DiaA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "H_DIAA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_DiaA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11084H_DiaA = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
            }
            else
            {
               A11084H_DiaA = localUtil.ctod( httpContext.cgiGet( edtH_DiaA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltlA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltlA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_ULTLA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_UltlA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11085H_UltlA = 0 ;
               n11085H_UltlA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11085H_UltlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11085H_UltlA), 6, 0));
            }
            else
            {
               A11085H_UltlA = (int)(localUtil.ctol( httpContext.cgiGet( edtH_UltlA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11085H_UltlA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11085H_UltlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11085H_UltlA), 6, 0));
            }
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
               A11084H_DiaA = localUtil.parseDateParm( httpContext.GetPar( "H_DiaA")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
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
                        e111AN2 ();
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
            initAll1AN1479( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1480_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1480_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1AN1479( ) ;
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

   public void confirm_1AN0( )
   {
      beforeValidate1AN1479( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AN1479( ) ;
         }
         else
         {
            checkExtendedTable1AN1479( ) ;
            if ( AnyError == 0 )
            {
               zm1AN1479( 2) ;
               zm1AN1479( 3) ;
               zm1AN1479( 4) ;
            }
            closeExtendedTableCursors1AN1479( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1479 = Gx_mode ;
         confirm_1AN1480( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1479 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1479 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AN0( ) ;
      }
   }

   public void confirm_1AN1480( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1AN1480( ) ;
         if ( ( nRcdExists_1480 != 0 ) || ( nIsMod_1480 != 0 ) )
         {
            getKey1AN1480( ) ;
            if ( ( nRcdExists_1480 == 0 ) && ( nRcdDeleted_1480 == 0 ) )
            {
               if ( RcdFound1480 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AN1480( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AN1480( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1AN1480( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "H_LINA_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtH_linA_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1480 != 0 )
               {
                  if ( nRcdDeleted_1480 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AN1480( ) ;
                     load1AN1480( ) ;
                     beforeValidate1AN1480( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AN1480( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1480 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AN1480( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AN1480( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1AN1480( ) ;
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
                  if ( nRcdDeleted_1480 == 0 )
                  {
                     GXCCtl = "H_LINA_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_linA_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1480_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_linA_Internalname, GXutil.ltrim( localUtil.ntoc( A11086H_linA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PkA_Internalname, GXutil.ltrim( localUtil.ntoc( A11087H_PkA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PmA_Internalname, GXutil.ltrim( localUtil.ntoc( A11088H_PmA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_TmA_Internalname, GXutil.rtrim( A11089H_TmA)) ;
         httpContext.changePostValue( edtH_UsA_Internalname, GXutil.rtrim( A11090H_UsA)) ;
         httpContext.changePostValue( edtH_HhA_Internalname, localUtil.ttoc( A11091H_HhA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtH_obsa_Internalname, A11101H_obsa) ;
         httpContext.changePostValue( "ZT_"+"Z11086H_linA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11086H_linA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11087H_PkA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11087H_PkA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11088H_PmA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11088H_PmA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11089H_TmA_"+sGXsfl_60_idx, GXutil.rtrim( Z11089H_TmA)) ;
         httpContext.changePostValue( "ZT_"+"Z11090H_UsA_"+sGXsfl_60_idx, GXutil.rtrim( Z11090H_UsA)) ;
         httpContext.changePostValue( "ZT_"+"Z11091H_HhA_"+sGXsfl_60_idx, localUtil.ttoc( Z11091H_HhA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11101H_obsa_"+sGXsfl_60_idx, Z11101H_obsa) ;
         httpContext.changePostValue( "nRcdDeleted_1480_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1480_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1480_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1480 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1480_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1480_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PMA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TMA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_USA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_HHA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_OBSA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AN0( )
   {
   }

   public void e111AN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thpreat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thpreat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thpreat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thpreat_impl.this.A396EmprCod = GXv_char2[0] ;
      thpreat_impl.this.AV11EmprNom = GXv_char3[0] ;
      thpreat_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1AN1479( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11085H_UltlA = T01AN5_A11085H_UltlA[0] ;
         }
         else
         {
            Z11085H_UltlA = A11085H_UltlA ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11084H_DiaA = A11084H_DiaA ;
         Z11085H_UltlA = A11085H_UltlA ;
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
      AV32Pgmname = "THPREAT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01AN6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AN6_A407EmprNom[0] ;
      n407EmprNom = T01AN6_n407EmprNom[0] ;
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

   public void load1AN1479( )
   {
      /* Using cursor T01AN9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1479 = (short)(1) ;
         A407EmprNom = T01AN9_A407EmprNom[0] ;
         n407EmprNom = T01AN9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AN9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01AN9_A69ArtDsc[0] ;
         n69ArtDsc = T01AN9_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A11085H_UltlA = T01AN9_A11085H_UltlA[0] ;
         n11085H_UltlA = T01AN9_n11085H_UltlA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11085H_UltlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11085H_UltlA), 6, 0));
         zm1AN1479( -1) ;
      }
      pr_default.close(7);
      onLoadActions1AN1479( ) ;
   }

   public void onLoadActions1AN1479( )
   {
   }

   public void checkExtendedTable1AN1479( )
   {
      nIsDirty_1479 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01AN7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AN7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01AN8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AN8_A69ArtDsc[0] ;
      n69ArtDsc = T01AN8_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1AN1479( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01AN10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AN10_A279CliNom[0] ;
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

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01AN11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AN11_A69ArtDsc[0] ;
      n69ArtDsc = T01AN11_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1AN1479( )
   {
      /* Using cursor T01AN12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1479 = (short)(1) ;
      }
      else
      {
         RcdFound1479 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01AN5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AN1479( 1) ;
         RcdFound1479 = (short)(1) ;
         A11084H_DiaA = T01AN5_A11084H_DiaA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
         A11085H_UltlA = T01AN5_A11085H_UltlA[0] ;
         n11085H_UltlA = T01AN5_n11085H_UltlA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11085H_UltlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11085H_UltlA), 6, 0));
         A252CliCod = T01AN5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AN5_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z11084H_DiaA = A11084H_DiaA ;
         sMode1479 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AN1479( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1479 = (short)(0) ;
            initializeNonKey1AN1479( ) ;
         }
         Gx_mode = sMode1479 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1479 = (short)(0) ;
         initializeNonKey1AN1479( ) ;
         sMode1479 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1479 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1AN1479( ) ;
      if ( RcdFound1479 == 0 )
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
      RcdFound1479 = (short)(0) ;
      /* Using cursor T01AN13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A11084H_DiaA, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01AN13_A252CliCod[0] < A252CliCod ) || ( T01AN13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AN13_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01AN13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AN13_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AN13_A11084H_DiaA[0]).before( GXutil.resetTime( A11084H_DiaA )) ) && ( GXutil.strcmp(T01AN13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01AN13_A252CliCod[0] > A252CliCod ) || ( T01AN13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AN13_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01AN13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AN13_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AN13_A11084H_DiaA[0]).after( GXutil.resetTime( A11084H_DiaA )) ) && ( GXutil.strcmp(T01AN13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AN13_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01AN13_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A11084H_DiaA = T01AN13_A11084H_DiaA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
            RcdFound1479 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1479 = (short)(0) ;
      /* Using cursor T01AN14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A11084H_DiaA, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01AN14_A252CliCod[0] > A252CliCod ) || ( T01AN14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AN14_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01AN14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AN14_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AN14_A11084H_DiaA[0]).after( GXutil.resetTime( A11084H_DiaA )) ) && ( GXutil.strcmp(T01AN14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01AN14_A252CliCod[0] < A252CliCod ) || ( T01AN14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AN14_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01AN14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AN14_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AN14_A11084H_DiaA[0]).before( GXutil.resetTime( A11084H_DiaA )) ) && ( GXutil.strcmp(T01AN14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AN14_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01AN14_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A11084H_DiaA = T01AN14_A11084H_DiaA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
            RcdFound1479 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AN1479( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AN1479( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1479 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11084H_DiaA), GXutil.resetTime(Z11084H_DiaA)) ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A11084H_DiaA = Z11084H_DiaA ;
               httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
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
               update1AN1479( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11084H_DiaA), GXutil.resetTime(Z11084H_DiaA)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AN1479( ) ;
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
                  insert1AN1479( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11084H_DiaA), GXutil.resetTime(Z11084H_DiaA)) ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A11084H_DiaA = Z11084H_DiaA ;
         httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
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
      getKey1AN1479( ) ;
      if ( RcdFound1479 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11084H_DiaA), GXutil.resetTime(Z11084H_DiaA)) ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A11084H_DiaA = Z11084H_DiaA ;
            httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11084H_DiaA), GXutil.resetTime(Z11084H_DiaA)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thpreat");
      GX_FocusControl = edtH_UltlA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AN0( ) ;
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
      if ( RcdFound1479 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtH_UltlA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AN1479( ) ;
      if ( RcdFound1479 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltlA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AN1479( ) ;
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
      if ( RcdFound1479 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltlA_Internalname ;
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
      if ( RcdFound1479 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltlA_Internalname ;
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
      scanStart1AN1479( ) ;
      if ( RcdFound1479 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1479 != 0 )
         {
            scanNext1AN1479( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltlA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AN1479( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AN1479( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREAT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11085H_UltlA != T01AN4_A11085H_UltlA[0] ) )
         {
            if ( Z11085H_UltlA != T01AN4_A11085H_UltlA[0] )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_UltlA");
               GXutil.writeLogRaw("Old: ",Z11085H_UltlA);
               GXutil.writeLogRaw("Current: ",T01AN4_A11085H_UltlA[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREAT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AN1479( )
   {
      beforeValidate1AN1479( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AN1479( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AN1479( 0) ;
         checkOptimisticConcurrency1AN1479( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AN1479( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AN1479( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AN15 */
                  pr_default.execute(13, new Object[] {A11084H_DiaA, Boolean.valueOf(n11085H_UltlA), Integer.valueOf(A11085H_UltlA), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREAT");
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
                        processLevel1AN1479( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AN0( ) ;
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
            load1AN1479( ) ;
         }
         endLevel1AN1479( ) ;
      }
      closeExtendedTableCursors1AN1479( ) ;
   }

   public void update1AN1479( )
   {
      beforeValidate1AN1479( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AN1479( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AN1479( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AN1479( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AN1479( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AN16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n11085H_UltlA), Integer.valueOf(A11085H_UltlA), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREAT");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREAT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AN1479( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AN1479( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AN0( ) ;
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
         endLevel1AN1479( ) ;
      }
      closeExtendedTableCursors1AN1479( ) ;
   }

   public void deferredUpdate1AN1479( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AN1479( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AN1479( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AN1479( ) ;
         afterConfirm1AN1479( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AN1479( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AN1480( ) ;
               while ( RcdFound1480 != 0 )
               {
                  getByPrimaryKey1AN1480( ) ;
                  delete1AN1480( ) ;
                  scanNext1AN1480( ) ;
               }
               scanEnd1AN1480( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AN17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREAT");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1479 == 0 )
                        {
                           initAll1AN1479( ) ;
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
                        resetCaption1AN0( ) ;
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
      sMode1479 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AN1479( ) ;
      Gx_mode = sMode1479 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AN1479( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AN18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01AN18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
         /* Using cursor T01AN19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01AN19_A69ArtDsc[0] ;
         n69ArtDsc = T01AN19_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(17);
      }
   }

   public void processNestedLevel1AN1480( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1AN1480( ) ;
         if ( ( nRcdExists_1480 != 0 ) || ( nIsMod_1480 != 0 ) )
         {
            standaloneNotModal1AN1480( ) ;
            getKey1AN1480( ) ;
            if ( ( nRcdExists_1480 == 0 ) && ( nRcdDeleted_1480 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AN1480( ) ;
            }
            else
            {
               if ( RcdFound1480 != 0 )
               {
                  if ( ( nRcdDeleted_1480 != 0 ) && ( nRcdExists_1480 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AN1480( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1480 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AN1480( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1480 == 0 )
                  {
                     GXCCtl = "H_LINA_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_linA_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1480_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_linA_Internalname, GXutil.ltrim( localUtil.ntoc( A11086H_linA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PkA_Internalname, GXutil.ltrim( localUtil.ntoc( A11087H_PkA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PmA_Internalname, GXutil.ltrim( localUtil.ntoc( A11088H_PmA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_TmA_Internalname, GXutil.rtrim( A11089H_TmA)) ;
         httpContext.changePostValue( edtH_UsA_Internalname, GXutil.rtrim( A11090H_UsA)) ;
         httpContext.changePostValue( edtH_HhA_Internalname, localUtil.ttoc( A11091H_HhA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtH_obsa_Internalname, A11101H_obsa) ;
         httpContext.changePostValue( "ZT_"+"Z11086H_linA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11086H_linA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11087H_PkA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11087H_PkA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11088H_PmA_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11088H_PmA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11089H_TmA_"+sGXsfl_60_idx, GXutil.rtrim( Z11089H_TmA)) ;
         httpContext.changePostValue( "ZT_"+"Z11090H_UsA_"+sGXsfl_60_idx, GXutil.rtrim( Z11090H_UsA)) ;
         httpContext.changePostValue( "ZT_"+"Z11091H_HhA_"+sGXsfl_60_idx, localUtil.ttoc( Z11091H_HhA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11101H_obsa_"+sGXsfl_60_idx, Z11101H_obsa) ;
         httpContext.changePostValue( "nRcdDeleted_1480_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1480_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1480_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1480 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1480_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1480_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PMA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TMA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_USA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_HHA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_OBSA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AN1480( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1480 = (short)(0) ;
      nIsMod_1480 = (short)(0) ;
      nRcdDeleted_1480 = (short)(0) ;
   }

   public void processLevel1AN1479( )
   {
      /* Save parent mode. */
      sMode1479 = Gx_mode ;
      processNestedLevel1AN1480( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1479 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AN1479( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AN1479( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thpreat");
         if ( AnyError == 0 )
         {
            confirmValues1AN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thpreat");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AN1479( )
   {
      /* Scan By routine */
      /* Using cursor T01AN20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound1479 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1479 = (short)(1) ;
         A252CliCod = T01AN20_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AN20_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A11084H_DiaA = T01AN20_A11084H_DiaA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AN1479( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1479 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1479 = (short)(1) ;
         A252CliCod = T01AN20_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AN20_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A11084H_DiaA = T01AN20_A11084H_DiaA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
      }
   }

   public void scanEnd1AN1479( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1AN1479( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AN1479( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AN1479( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AN1479( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AN1479( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AN1479( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AN1479( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtH_DiaA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_DiaA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_DiaA_Enabled), 5, 0), true);
      edtH_UltlA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UltlA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UltlA_Enabled), 5, 0), true);
   }

   public void zm1AN1480( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11087H_PkA = T01AN3_A11087H_PkA[0] ;
            Z11088H_PmA = T01AN3_A11088H_PmA[0] ;
            Z11089H_TmA = T01AN3_A11089H_TmA[0] ;
            Z11090H_UsA = T01AN3_A11090H_UsA[0] ;
            Z11091H_HhA = T01AN3_A11091H_HhA[0] ;
            Z11101H_obsa = T01AN3_A11101H_obsa[0] ;
         }
         else
         {
            Z11087H_PkA = A11087H_PkA ;
            Z11088H_PmA = A11088H_PmA ;
            Z11089H_TmA = A11089H_TmA ;
            Z11090H_UsA = A11090H_UsA ;
            Z11091H_HhA = A11091H_HhA ;
            Z11101H_obsa = A11101H_obsa ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z11084H_DiaA = A11084H_DiaA ;
         Z11086H_linA = A11086H_linA ;
         Z11087H_PkA = A11087H_PkA ;
         Z11088H_PmA = A11088H_PmA ;
         Z11089H_TmA = A11089H_TmA ;
         Z11090H_UsA = A11090H_UsA ;
         Z11091H_HhA = A11091H_HhA ;
         Z11101H_obsa = A11101H_obsa ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1AN1480( )
   {
   }

   public void standaloneModal1AN1480( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_linA_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_linA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtH_linA_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_linA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1AN1480( )
   {
      /* Using cursor T01AN21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1480 = (short)(1) ;
         A11087H_PkA = T01AN21_A11087H_PkA[0] ;
         n11087H_PkA = T01AN21_n11087H_PkA[0] ;
         A11088H_PmA = T01AN21_A11088H_PmA[0] ;
         n11088H_PmA = T01AN21_n11088H_PmA[0] ;
         A11089H_TmA = T01AN21_A11089H_TmA[0] ;
         n11089H_TmA = T01AN21_n11089H_TmA[0] ;
         A11090H_UsA = T01AN21_A11090H_UsA[0] ;
         n11090H_UsA = T01AN21_n11090H_UsA[0] ;
         A11091H_HhA = T01AN21_A11091H_HhA[0] ;
         n11091H_HhA = T01AN21_n11091H_HhA[0] ;
         A11101H_obsa = T01AN21_A11101H_obsa[0] ;
         n11101H_obsa = T01AN21_n11101H_obsa[0] ;
         zm1AN1480( -5) ;
      }
      pr_default.close(19);
      onLoadActions1AN1480( ) ;
   }

   public void onLoadActions1AN1480( )
   {
   }

   public void checkExtendedTable1AN1480( )
   {
      nIsDirty_1480 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AN1480( ) ;
   }

   public void closeExtendedTableCursors1AN1480( )
   {
   }

   public void enableDisable1AN1480( )
   {
   }

   public void getKey1AN1480( )
   {
      /* Using cursor T01AN22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1480 = (short)(1) ;
      }
      else
      {
         RcdFound1480 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1AN1480( )
   {
      /* Using cursor T01AN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AN3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AN1480( 5) ;
         RcdFound1480 = (short)(1) ;
         initializeNonKey1AN1480( ) ;
         A11086H_linA = T01AN3_A11086H_linA[0] ;
         A11087H_PkA = T01AN3_A11087H_PkA[0] ;
         n11087H_PkA = T01AN3_n11087H_PkA[0] ;
         A11088H_PmA = T01AN3_A11088H_PmA[0] ;
         n11088H_PmA = T01AN3_n11088H_PmA[0] ;
         A11089H_TmA = T01AN3_A11089H_TmA[0] ;
         n11089H_TmA = T01AN3_n11089H_TmA[0] ;
         A11090H_UsA = T01AN3_A11090H_UsA[0] ;
         n11090H_UsA = T01AN3_n11090H_UsA[0] ;
         A11091H_HhA = T01AN3_A11091H_HhA[0] ;
         n11091H_HhA = T01AN3_n11091H_HhA[0] ;
         A11101H_obsa = T01AN3_A11101H_obsa[0] ;
         n11101H_obsa = T01AN3_n11101H_obsa[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z11084H_DiaA = A11084H_DiaA ;
         Z11086H_linA = A11086H_linA ;
         sMode1480 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AN1480( ) ;
         load1AN1480( ) ;
         Gx_mode = sMode1480 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1480 = (short)(0) ;
         initializeNonKey1AN1480( ) ;
         sMode1480 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AN1480( ) ;
         Gx_mode = sMode1480 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AN1480( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AN1480( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREA1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11087H_PkA, T01AN2_A11087H_PkA[0]) != 0 ) || ( DecimalUtil.compareTo(Z11088H_PmA, T01AN2_A11088H_PmA[0]) != 0 ) || ( GXutil.strcmp(Z11089H_TmA, T01AN2_A11089H_TmA[0]) != 0 ) || ( GXutil.strcmp(Z11090H_UsA, T01AN2_A11090H_UsA[0]) != 0 ) || !( GXutil.dateCompare(Z11091H_HhA, T01AN2_A11091H_HhA[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11101H_obsa, T01AN2_A11101H_obsa[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11087H_PkA, T01AN2_A11087H_PkA[0]) != 0 )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_PkA");
               GXutil.writeLogRaw("Old: ",Z11087H_PkA);
               GXutil.writeLogRaw("Current: ",T01AN2_A11087H_PkA[0]);
            }
            if ( DecimalUtil.compareTo(Z11088H_PmA, T01AN2_A11088H_PmA[0]) != 0 )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_PmA");
               GXutil.writeLogRaw("Old: ",Z11088H_PmA);
               GXutil.writeLogRaw("Current: ",T01AN2_A11088H_PmA[0]);
            }
            if ( GXutil.strcmp(Z11089H_TmA, T01AN2_A11089H_TmA[0]) != 0 )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_TmA");
               GXutil.writeLogRaw("Old: ",Z11089H_TmA);
               GXutil.writeLogRaw("Current: ",T01AN2_A11089H_TmA[0]);
            }
            if ( GXutil.strcmp(Z11090H_UsA, T01AN2_A11090H_UsA[0]) != 0 )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_UsA");
               GXutil.writeLogRaw("Old: ",Z11090H_UsA);
               GXutil.writeLogRaw("Current: ",T01AN2_A11090H_UsA[0]);
            }
            if ( !( GXutil.dateCompare(Z11091H_HhA, T01AN2_A11091H_HhA[0]) ) )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_HhA");
               GXutil.writeLogRaw("Old: ",Z11091H_HhA);
               GXutil.writeLogRaw("Current: ",T01AN2_A11091H_HhA[0]);
            }
            if ( GXutil.strcmp(Z11101H_obsa, T01AN2_A11101H_obsa[0]) != 0 )
            {
               GXutil.writeLogln("thpreat:[seudo value changed for attri]"+"H_obsa");
               GXutil.writeLogRaw("Old: ",Z11101H_obsa);
               GXutil.writeLogRaw("Current: ",T01AN2_A11101H_obsa[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREA1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AN1480( )
   {
      beforeValidate1AN1480( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AN1480( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AN1480( 0) ;
         checkOptimisticConcurrency1AN1480( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AN1480( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AN1480( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AN23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA), Boolean.valueOf(n11087H_PkA), A11087H_PkA, Boolean.valueOf(n11088H_PmA), A11088H_PmA, Boolean.valueOf(n11089H_TmA), A11089H_TmA, Boolean.valueOf(n11090H_UsA), A11090H_UsA, Boolean.valueOf(n11091H_HhA), A11091H_HhA, Boolean.valueOf(n11101H_obsa), A11101H_obsa, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREA1");
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
            load1AN1480( ) ;
         }
         endLevel1AN1480( ) ;
      }
      closeExtendedTableCursors1AN1480( ) ;
   }

   public void update1AN1480( )
   {
      beforeValidate1AN1480( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AN1480( ) ;
      }
      if ( ( nIsMod_1480 != 0 ) || ( nIsDirty_1480 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AN1480( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AN1480( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AN1480( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AN24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n11087H_PkA), A11087H_PkA, Boolean.valueOf(n11088H_PmA), A11088H_PmA, Boolean.valueOf(n11089H_TmA), A11089H_TmA, Boolean.valueOf(n11090H_UsA), A11090H_UsA, Boolean.valueOf(n11091H_HhA), A11091H_HhA, Boolean.valueOf(n11101H_obsa), A11101H_obsa, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREA1");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREA1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AN1480( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AN1480( ) ;
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
            endLevel1AN1480( ) ;
         }
      }
      closeExtendedTableCursors1AN1480( ) ;
   }

   public void deferredUpdate1AN1480( )
   {
   }

   public void delete1AN1480( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AN1480( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AN1480( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AN1480( ) ;
         afterConfirm1AN1480( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AN1480( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AN25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA, Integer.valueOf(A11086H_linA)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREA1");
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
      sMode1480 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AN1480( ) ;
      Gx_mode = sMode1480 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AN1480( )
   {
      standaloneModal1AN1480( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1AN1480( )
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

   public void scanStart1AN1480( )
   {
      /* Scan By routine */
      /* Using cursor T01AN26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A11084H_DiaA});
      RcdFound1480 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1480 = (short)(1) ;
         A11086H_linA = T01AN26_A11086H_linA[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AN1480( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1480 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1480 = (short)(1) ;
         A11086H_linA = T01AN26_A11086H_linA[0] ;
      }
   }

   public void scanEnd1AN1480( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1AN1480( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AN1480( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AN1480( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AN1480( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AN1480( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AN1480( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AN1480( )
   {
      edtH_linA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_linA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtH_PkA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_PkA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PkA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtH_PmA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_PmA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PmA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtH_TmA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_TmA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_TmA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtH_UsA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UsA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UsA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtH_HhA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_HhA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_HhA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtH_obsa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_obsa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_obsa_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1AN1480( )
   {
   }

   public void send_integrity_lvl_hashes1AN1479( )
   {
   }

   public void subsflControlProps_601480( )
   {
      edtavnRcdDeleted_1480_Internalname = "vNRCDDELETED_1480_"+sGXsfl_60_idx ;
      edtH_linA_Internalname = "H_LINA_"+sGXsfl_60_idx ;
      edtH_PkA_Internalname = "H_PKA_"+sGXsfl_60_idx ;
      edtH_PmA_Internalname = "H_PMA_"+sGXsfl_60_idx ;
      edtH_TmA_Internalname = "H_TMA_"+sGXsfl_60_idx ;
      edtH_UsA_Internalname = "H_USA_"+sGXsfl_60_idx ;
      edtH_HhA_Internalname = "H_HHA_"+sGXsfl_60_idx ;
      edtH_obsa_Internalname = "H_OBSA_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601480( )
   {
      edtavnRcdDeleted_1480_Internalname = "vNRCDDELETED_1480_"+sGXsfl_60_fel_idx ;
      edtH_linA_Internalname = "H_LINA_"+sGXsfl_60_fel_idx ;
      edtH_PkA_Internalname = "H_PKA_"+sGXsfl_60_fel_idx ;
      edtH_PmA_Internalname = "H_PMA_"+sGXsfl_60_fel_idx ;
      edtH_TmA_Internalname = "H_TMA_"+sGXsfl_60_fel_idx ;
      edtH_UsA_Internalname = "H_USA_"+sGXsfl_60_fel_idx ;
      edtH_HhA_Internalname = "H_HHA_"+sGXsfl_60_fel_idx ;
      edtH_obsa_Internalname = "H_OBSA_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1AN1480( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601480( ) ;
      sendRow1AN1480( ) ;
   }

   public void sendRow1AN1480( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1480_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1480_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1480), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1480), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1480_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1480_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_linA_Internalname,GXutil.ltrim( localUtil.ntoc( A11086H_linA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11086H_linA), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_linA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_linA_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_PkA_Internalname,GXutil.ltrim( localUtil.ntoc( A11087H_PkA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_PkA_Enabled!=0) ? localUtil.format( A11087H_PkA, "ZZZZZ9.99999") : localUtil.format( A11087H_PkA, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_PkA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_PkA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_PmA_Internalname,GXutil.ltrim( localUtil.ntoc( A11088H_PmA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_PmA_Enabled!=0) ? localUtil.format( A11088H_PmA, "ZZZZZ9.99999") : localUtil.format( A11088H_PmA, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_PmA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_PmA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_TmA_Internalname,GXutil.rtrim( A11089H_TmA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_TmA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_TmA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_UsA_Internalname,GXutil.rtrim( A11090H_UsA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_UsA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_UsA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_HhA_Internalname,localUtil.ttoc( A11091H_HhA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11091H_HhA, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_HhA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_HhA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1480_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_obsa_Internalname,A11101H_obsa,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_obsa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_obsa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AN1480( ) ;
      GXCCtl = "Z11086H_linA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11086H_linA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11087H_PkA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11087H_PkA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11088H_PmA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11088H_PmA, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11089H_TmA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11089H_TmA));
      GXCCtl = "Z11090H_UsA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11090H_UsA));
      GXCCtl = "Z11091H_HhA_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z11091H_HhA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z11101H_obsa_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11101H_obsa);
      GXCCtl = "nRcdDeleted_1480_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1480_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1480_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1480, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1480_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1480_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_LINA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PKA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PMA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_TMA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_USA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_HHA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_OBSA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsa_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AN1480( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601480( ) ;
      edtavnRcdDeleted_1480_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1480_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_linA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_PkA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_PmA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PMA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_TmA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TMA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_UsA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_USA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_HhA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_HHA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_obsa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_OBSA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1480_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1480_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1480");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1480_Internalname ;
         wbErr = true ;
         nRcdDeleted_1480 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1480 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1480_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_linA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_linA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "H_LINA_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_linA_Internalname ;
         wbErr = true ;
         A11086H_linA = 0 ;
      }
      else
      {
         A11086H_linA = (int)(localUtil.ctol( httpContext.cgiGet( edtH_linA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_PkA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_PkA_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PKA_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_PkA_Internalname ;
         wbErr = true ;
         A11087H_PkA = DecimalUtil.ZERO ;
         n11087H_PkA = false ;
      }
      else
      {
         A11087H_PkA = localUtil.ctond( httpContext.cgiGet( edtH_PkA_Internalname)) ;
         n11087H_PkA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_PmA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_PmA_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PMA_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_PmA_Internalname ;
         wbErr = true ;
         A11088H_PmA = DecimalUtil.ZERO ;
         n11088H_PmA = false ;
      }
      else
      {
         A11088H_PmA = localUtil.ctond( httpContext.cgiGet( edtH_PmA_Internalname)) ;
         n11088H_PmA = false ;
      }
      A11089H_TmA = httpContext.cgiGet( edtH_TmA_Internalname) ;
      n11089H_TmA = false ;
      A11090H_UsA = httpContext.cgiGet( edtH_UsA_Internalname) ;
      n11090H_UsA = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtH_HhA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "H_HHA_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_HhA_Internalname ;
         wbErr = true ;
         A11091H_HhA = GXutil.resetTime( GXutil.nullDate() );
         n11091H_HhA = false ;
      }
      else
      {
         A11091H_HhA = localUtil.ctot( httpContext.cgiGet( edtH_HhA_Internalname)) ;
         n11091H_HhA = false ;
      }
      A11101H_obsa = httpContext.cgiGet( edtH_obsa_Internalname) ;
      n11101H_obsa = false ;
      GXCCtl = "Z11086H_linA_" + sGXsfl_60_idx ;
      Z11086H_linA = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11087H_PkA_" + sGXsfl_60_idx ;
      Z11087H_PkA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11088H_PmA_" + sGXsfl_60_idx ;
      Z11088H_PmA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11089H_TmA_" + sGXsfl_60_idx ;
      Z11089H_TmA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11090H_UsA_" + sGXsfl_60_idx ;
      Z11090H_UsA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11091H_HhA_" + sGXsfl_60_idx ;
      Z11091H_HhA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11101H_obsa_" + sGXsfl_60_idx ;
      Z11101H_obsa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1480_" + sGXsfl_60_idx ;
      nRcdDeleted_1480 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1480_" + sGXsfl_60_idx ;
      nRcdExists_1480 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1480_" + sGXsfl_60_idx ;
      nIsMod_1480 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtH_linA_Enabled = edtH_linA_Enabled ;
   }

   public void confirmValues1AN0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601480( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601480( ) ;
         httpContext.changePostValue( "Z11086H_linA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11086H_linA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11086H_linA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11087H_PkA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11087H_PkA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11087H_PkA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11088H_PmA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11088H_PmA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11088H_PmA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11089H_TmA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11089H_TmA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11089H_TmA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11090H_UsA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11090H_UsA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11090H_UsA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11091H_HhA_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11091H_HhA_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11091H_HhA_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11101H_obsa_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11101H_obsa_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11101H_obsa_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thpreat", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11084H_DiaA", localUtil.dtoc( Z11084H_DiaA, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11085H_UltlA", GXutil.ltrim( localUtil.ntoc( Z11085H_UltlA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thpreat", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THPREAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "") ;
   }

   public void initializeNonKey1AN1479( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A11085H_UltlA = 0 ;
      n11085H_UltlA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11085H_UltlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11085H_UltlA), 6, 0));
      Z11085H_UltlA = 0 ;
   }

   public void initAll1AN1479( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A11084H_DiaA = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11084H_DiaA", localUtil.format(A11084H_DiaA, "99/99/99"));
      initializeNonKey1AN1479( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AN1480( )
   {
      A11087H_PkA = DecimalUtil.ZERO ;
      n11087H_PkA = false ;
      A11088H_PmA = DecimalUtil.ZERO ;
      n11088H_PmA = false ;
      A11089H_TmA = "" ;
      n11089H_TmA = false ;
      A11090H_UsA = "" ;
      n11090H_UsA = false ;
      A11091H_HhA = GXutil.resetTime( GXutil.nullDate() );
      n11091H_HhA = false ;
      A11101H_obsa = "" ;
      n11101H_obsa = false ;
      Z11087H_PkA = DecimalUtil.ZERO ;
      Z11088H_PmA = DecimalUtil.ZERO ;
      Z11089H_TmA = "" ;
      Z11090H_UsA = "" ;
      Z11091H_HhA = GXutil.resetTime( GXutil.nullDate() );
      Z11101H_obsa = "" ;
   }

   public void initAll1AN1480( )
   {
      A11086H_linA = 0 ;
      initializeNonKey1AN1480( ) ;
   }

   public void standaloneModalInsert1AN1480( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563047", true, true);
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
      httpContext.AddJavascriptSource("thpreat.js", "?20268241563048", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1480( )
   {
      edtH_linA_Enabled = defedtH_linA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_linA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linA_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1480, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1480_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11086H_linA, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11087H_PkA, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11088H_PmA, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11089H_TmA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11090H_UsA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A11091H_HhA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11101H_obsa);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsa_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtH_DiaA_Internalname = "H_DIAA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtH_UltlA_Internalname = "H_ULTLA" ;
      edtavnRcdDeleted_1480_Internalname = "vNRCDDELETED_1480" ;
      edtH_linA_Internalname = "H_LINA" ;
      edtH_PkA_Internalname = "H_PKA" ;
      edtH_PmA_Internalname = "H_PMA" ;
      edtH_TmA_Internalname = "H_TMA" ;
      edtH_UsA_Internalname = "H_USA" ;
      edtH_HhA_Internalname = "H_HHA" ;
      edtH_obsa_Internalname = "H_OBSA" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "") );
      edtH_obsa_Jsonclick = "" ;
      edtH_HhA_Jsonclick = "" ;
      edtH_UsA_Jsonclick = "" ;
      edtH_TmA_Jsonclick = "" ;
      edtH_PmA_Jsonclick = "" ;
      edtH_PkA_Jsonclick = "" ;
      edtH_linA_Jsonclick = "" ;
      edtavnRcdDeleted_1480_Jsonclick = "" ;
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
      edtH_obsa_Enabled = 1 ;
      edtH_HhA_Enabled = 1 ;
      edtH_UsA_Enabled = 1 ;
      edtH_TmA_Enabled = 1 ;
      edtH_PmA_Enabled = 1 ;
      edtH_PkA_Enabled = 1 ;
      edtH_linA_Enabled = 1 ;
      edtavnRcdDeleted_1480_Enabled = 1 ;
      edtH_UltlA_Jsonclick = "" ;
      edtH_UltlA_Backcolor = (int)(0xFFFFFF) ;
      edtH_UltlA_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtH_DiaA_Jsonclick = "" ;
      edtH_DiaA_Backcolor = (int)(0xFFFFFF) ;
      edtH_DiaA_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      subsflControlProps_601480( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AN1480( ) ;
         standaloneModal1AN1480( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AN1480( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601480( ) ;
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
      /* Using cursor T01AN27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AN27_A407EmprNom[0] ;
      n407EmprNom = T01AN27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01AN18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AN18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      /* Using cursor T01AN19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AN19_A69ArtDsc[0] ;
      n69ArtDsc = T01AN19_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(17);
      GX_FocusControl = edtH_UltlA_Internalname ;
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
      /* Using cursor T01AN18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01AN18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01AN19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01AN19_A69ArtDsc[0] ;
      n69ArtDsc = T01AN19_n69ArtDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_H_diaa( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11085H_UltlA", GXutil.ltrim( localUtil.ntoc( A11085H_UltlA, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11084H_DiaA", localUtil.format(Z11084H_DiaA, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11085H_UltlA", GXutil.ltrim( localUtil.ntoc( Z11085H_UltlA, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
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
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_H_DIAA","{handler:'valid_H_diaa',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A11084H_DiaA',fld:'H_DIAA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_H_DIAA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11085H_UltlA',fld:'H_ULTLA',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z11084H_DiaA'},{av:'Z407EmprNom'},{av:'Z11085H_UltlA'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_H_LINA","{handler:'valid_H_lina',iparms:[]");
      setEventMetadata("VALID_H_LINA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_H_obsa',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(16);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z11084H_DiaA = GXutil.nullDate() ;
      Z11087H_PkA = DecimalUtil.ZERO ;
      Z11088H_PmA = DecimalUtil.ZERO ;
      Z11089H_TmA = "" ;
      Z11090H_UsA = "" ;
      Z11091H_HhA = GXutil.resetTime( GXutil.nullDate() );
      Z11101H_obsa = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11084H_DiaA = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1480 = "" ;
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
      sMode1479 = "" ;
      GXCCtl = "" ;
      A11087H_PkA = DecimalUtil.ZERO ;
      A11088H_PmA = DecimalUtil.ZERO ;
      A11089H_TmA = "" ;
      A11090H_UsA = "" ;
      A11091H_HhA = GXutil.resetTime( GXutil.nullDate() );
      A11101H_obsa = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      T01AN6_A407EmprNom = new String[] {""} ;
      T01AN6_n407EmprNom = new boolean[] {false} ;
      T01AN9_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN9_A407EmprNom = new String[] {""} ;
      T01AN9_n407EmprNom = new boolean[] {false} ;
      T01AN9_A279CliNom = new String[] {""} ;
      T01AN9_A69ArtDsc = new String[] {""} ;
      T01AN9_n69ArtDsc = new boolean[] {false} ;
      T01AN9_A11085H_UltlA = new int[1] ;
      T01AN9_n11085H_UltlA = new boolean[] {false} ;
      T01AN9_A396EmprCod = new String[] {""} ;
      T01AN9_A252CliCod = new int[1] ;
      T01AN9_A65ArtCod = new String[] {""} ;
      T01AN7_A279CliNom = new String[] {""} ;
      T01AN8_A69ArtDsc = new String[] {""} ;
      T01AN8_n69ArtDsc = new boolean[] {false} ;
      T01AN10_A279CliNom = new String[] {""} ;
      T01AN11_A69ArtDsc = new String[] {""} ;
      T01AN11_n69ArtDsc = new boolean[] {false} ;
      T01AN12_A396EmprCod = new String[] {""} ;
      T01AN12_A252CliCod = new int[1] ;
      T01AN12_A65ArtCod = new String[] {""} ;
      T01AN12_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN5_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN5_A11085H_UltlA = new int[1] ;
      T01AN5_n11085H_UltlA = new boolean[] {false} ;
      T01AN5_A396EmprCod = new String[] {""} ;
      T01AN5_A252CliCod = new int[1] ;
      T01AN5_A65ArtCod = new String[] {""} ;
      T01AN13_A396EmprCod = new String[] {""} ;
      T01AN13_A252CliCod = new int[1] ;
      T01AN13_A65ArtCod = new String[] {""} ;
      T01AN13_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN14_A396EmprCod = new String[] {""} ;
      T01AN14_A252CliCod = new int[1] ;
      T01AN14_A65ArtCod = new String[] {""} ;
      T01AN14_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN4_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN4_A11085H_UltlA = new int[1] ;
      T01AN4_n11085H_UltlA = new boolean[] {false} ;
      T01AN4_A396EmprCod = new String[] {""} ;
      T01AN4_A252CliCod = new int[1] ;
      T01AN4_A65ArtCod = new String[] {""} ;
      T01AN18_A279CliNom = new String[] {""} ;
      T01AN19_A69ArtDsc = new String[] {""} ;
      T01AN19_n69ArtDsc = new boolean[] {false} ;
      T01AN20_A396EmprCod = new String[] {""} ;
      T01AN20_A252CliCod = new int[1] ;
      T01AN20_A65ArtCod = new String[] {""} ;
      T01AN20_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN21_A252CliCod = new int[1] ;
      T01AN21_A65ArtCod = new String[] {""} ;
      T01AN21_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN21_A11086H_linA = new int[1] ;
      T01AN21_A11087H_PkA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AN21_n11087H_PkA = new boolean[] {false} ;
      T01AN21_A11088H_PmA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AN21_n11088H_PmA = new boolean[] {false} ;
      T01AN21_A11089H_TmA = new String[] {""} ;
      T01AN21_n11089H_TmA = new boolean[] {false} ;
      T01AN21_A11090H_UsA = new String[] {""} ;
      T01AN21_n11090H_UsA = new boolean[] {false} ;
      T01AN21_A11091H_HhA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN21_n11091H_HhA = new boolean[] {false} ;
      T01AN21_A11101H_obsa = new String[] {""} ;
      T01AN21_n11101H_obsa = new boolean[] {false} ;
      T01AN21_A396EmprCod = new String[] {""} ;
      T01AN22_A396EmprCod = new String[] {""} ;
      T01AN22_A252CliCod = new int[1] ;
      T01AN22_A65ArtCod = new String[] {""} ;
      T01AN22_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN22_A11086H_linA = new int[1] ;
      T01AN3_A252CliCod = new int[1] ;
      T01AN3_A65ArtCod = new String[] {""} ;
      T01AN3_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN3_A11086H_linA = new int[1] ;
      T01AN3_A11087H_PkA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AN3_n11087H_PkA = new boolean[] {false} ;
      T01AN3_A11088H_PmA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AN3_n11088H_PmA = new boolean[] {false} ;
      T01AN3_A11089H_TmA = new String[] {""} ;
      T01AN3_n11089H_TmA = new boolean[] {false} ;
      T01AN3_A11090H_UsA = new String[] {""} ;
      T01AN3_n11090H_UsA = new boolean[] {false} ;
      T01AN3_A11091H_HhA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN3_n11091H_HhA = new boolean[] {false} ;
      T01AN3_A11101H_obsa = new String[] {""} ;
      T01AN3_n11101H_obsa = new boolean[] {false} ;
      T01AN3_A396EmprCod = new String[] {""} ;
      T01AN2_A252CliCod = new int[1] ;
      T01AN2_A65ArtCod = new String[] {""} ;
      T01AN2_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN2_A11086H_linA = new int[1] ;
      T01AN2_A11087H_PkA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AN2_n11087H_PkA = new boolean[] {false} ;
      T01AN2_A11088H_PmA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AN2_n11088H_PmA = new boolean[] {false} ;
      T01AN2_A11089H_TmA = new String[] {""} ;
      T01AN2_n11089H_TmA = new boolean[] {false} ;
      T01AN2_A11090H_UsA = new String[] {""} ;
      T01AN2_n11090H_UsA = new boolean[] {false} ;
      T01AN2_A11091H_HhA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN2_n11091H_HhA = new boolean[] {false} ;
      T01AN2_A11101H_obsa = new String[] {""} ;
      T01AN2_n11101H_obsa = new boolean[] {false} ;
      T01AN2_A396EmprCod = new String[] {""} ;
      T01AN26_A396EmprCod = new String[] {""} ;
      T01AN26_A252CliCod = new int[1] ;
      T01AN26_A65ArtCod = new String[] {""} ;
      T01AN26_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AN26_A11086H_linA = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AN27_A407EmprNom = new String[] {""} ;
      T01AN27_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ11084H_DiaA = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thpreat__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thpreat__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thpreat__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thpreat__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thpreat__default(),
         new Object[] {
             new Object[] {
            T01AN2_A252CliCod, T01AN2_A65ArtCod, T01AN2_A11084H_DiaA, T01AN2_A11086H_linA, T01AN2_A11087H_PkA, T01AN2_n11087H_PkA, T01AN2_A11088H_PmA, T01AN2_n11088H_PmA, T01AN2_A11089H_TmA, T01AN2_n11089H_TmA,
            T01AN2_A11090H_UsA, T01AN2_n11090H_UsA, T01AN2_A11091H_HhA, T01AN2_n11091H_HhA, T01AN2_A11101H_obsa, T01AN2_n11101H_obsa, T01AN2_A396EmprCod
            }
            , new Object[] {
            T01AN3_A252CliCod, T01AN3_A65ArtCod, T01AN3_A11084H_DiaA, T01AN3_A11086H_linA, T01AN3_A11087H_PkA, T01AN3_n11087H_PkA, T01AN3_A11088H_PmA, T01AN3_n11088H_PmA, T01AN3_A11089H_TmA, T01AN3_n11089H_TmA,
            T01AN3_A11090H_UsA, T01AN3_n11090H_UsA, T01AN3_A11091H_HhA, T01AN3_n11091H_HhA, T01AN3_A11101H_obsa, T01AN3_n11101H_obsa, T01AN3_A396EmprCod
            }
            , new Object[] {
            T01AN4_A11084H_DiaA, T01AN4_A11085H_UltlA, T01AN4_n11085H_UltlA, T01AN4_A396EmprCod, T01AN4_A252CliCod, T01AN4_A65ArtCod
            }
            , new Object[] {
            T01AN5_A11084H_DiaA, T01AN5_A11085H_UltlA, T01AN5_n11085H_UltlA, T01AN5_A396EmprCod, T01AN5_A252CliCod, T01AN5_A65ArtCod
            }
            , new Object[] {
            T01AN6_A407EmprNom, T01AN6_n407EmprNom
            }
            , new Object[] {
            T01AN7_A279CliNom
            }
            , new Object[] {
            T01AN8_A69ArtDsc, T01AN8_n69ArtDsc
            }
            , new Object[] {
            T01AN9_A11084H_DiaA, T01AN9_A407EmprNom, T01AN9_n407EmprNom, T01AN9_A279CliNom, T01AN9_A69ArtDsc, T01AN9_n69ArtDsc, T01AN9_A11085H_UltlA, T01AN9_n11085H_UltlA, T01AN9_A396EmprCod, T01AN9_A252CliCod,
            T01AN9_A65ArtCod
            }
            , new Object[] {
            T01AN10_A279CliNom
            }
            , new Object[] {
            T01AN11_A69ArtDsc, T01AN11_n69ArtDsc
            }
            , new Object[] {
            T01AN12_A396EmprCod, T01AN12_A252CliCod, T01AN12_A65ArtCod, T01AN12_A11084H_DiaA
            }
            , new Object[] {
            T01AN13_A396EmprCod, T01AN13_A252CliCod, T01AN13_A65ArtCod, T01AN13_A11084H_DiaA
            }
            , new Object[] {
            T01AN14_A396EmprCod, T01AN14_A252CliCod, T01AN14_A65ArtCod, T01AN14_A11084H_DiaA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AN18_A279CliNom
            }
            , new Object[] {
            T01AN19_A69ArtDsc, T01AN19_n69ArtDsc
            }
            , new Object[] {
            T01AN20_A396EmprCod, T01AN20_A252CliCod, T01AN20_A65ArtCod, T01AN20_A11084H_DiaA
            }
            , new Object[] {
            T01AN21_A252CliCod, T01AN21_A65ArtCod, T01AN21_A11084H_DiaA, T01AN21_A11086H_linA, T01AN21_A11087H_PkA, T01AN21_n11087H_PkA, T01AN21_A11088H_PmA, T01AN21_n11088H_PmA, T01AN21_A11089H_TmA, T01AN21_n11089H_TmA,
            T01AN21_A11090H_UsA, T01AN21_n11090H_UsA, T01AN21_A11091H_HhA, T01AN21_n11091H_HhA, T01AN21_A11101H_obsa, T01AN21_n11101H_obsa, T01AN21_A396EmprCod
            }
            , new Object[] {
            T01AN22_A396EmprCod, T01AN22_A252CliCod, T01AN22_A65ArtCod, T01AN22_A11084H_DiaA, T01AN22_A11086H_linA
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AN26_A396EmprCod, T01AN26_A252CliCod, T01AN26_A65ArtCod, T01AN26_A11084H_DiaA, T01AN26_A11086H_linA
            }
            , new Object[] {
            T01AN27_A407EmprNom, T01AN27_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THPREAT" ;
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
   private short nRcdDeleted_1480 ;
   private short nRcdExists_1480 ;
   private short nIsMod_1480 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1480 ;
   private short RcdFound1480 ;
   private short nBlankRcdUsr1480 ;
   private short RcdFound1479 ;
   private short nIsDirty_1479 ;
   private short nIsDirty_1480 ;
   private int Z252CliCod ;
   private int Z11085H_UltlA ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int Z11086H_linA ;
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
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtH_DiaA_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A11085H_UltlA ;
   private int edtH_UltlA_Enabled ;
   private int edtavnRcdDeleted_1480_Enabled ;
   private int edtH_linA_Enabled ;
   private int edtH_PkA_Enabled ;
   private int edtH_PmA_Enabled ;
   private int edtH_TmA_Enabled ;
   private int edtH_UsA_Enabled ;
   private int edtH_HhA_Enabled ;
   private int edtH_obsa_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A11086H_linA ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtH_linA_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtH_UltlA_Backcolor ;
   private int edtH_DiaA_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ11085H_UltlA ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11087H_PkA ;
   private java.math.BigDecimal Z11088H_PmA ;
   private java.math.BigDecimal A11087H_PkA ;
   private java.math.BigDecimal A11088H_PmA ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z11089H_TmA ;
   private String Z11090H_UsA ;
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
   private String sGXsfl_60_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtH_DiaA_Internalname ;
   private String edtH_DiaA_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtH_UltlA_Internalname ;
   private String edtH_UltlA_Jsonclick ;
   private String sMode1480 ;
   private String edtavnRcdDeleted_1480_Internalname ;
   private String edtH_linA_Internalname ;
   private String edtH_PkA_Internalname ;
   private String edtH_PmA_Internalname ;
   private String edtH_TmA_Internalname ;
   private String edtH_UsA_Internalname ;
   private String edtH_HhA_Internalname ;
   private String edtH_obsa_Internalname ;
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
   private String sMode1479 ;
   private String GXCCtl ;
   private String A11089H_TmA ;
   private String A11090H_UsA ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1480_Jsonclick ;
   private String edtH_linA_Jsonclick ;
   private String edtH_PkA_Jsonclick ;
   private String edtH_PmA_Jsonclick ;
   private String edtH_TmA_Jsonclick ;
   private String edtH_UsA_Jsonclick ;
   private String edtH_HhA_Jsonclick ;
   private String edtH_obsa_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private java.util.Date Z11091H_HhA ;
   private java.util.Date A11091H_HhA ;
   private java.util.Date Z11084H_DiaA ;
   private java.util.Date A11084H_DiaA ;
   private java.util.Date ZZ11084H_DiaA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n11085H_UltlA ;
   private boolean returnInSub ;
   private boolean n11087H_PkA ;
   private boolean n11088H_PmA ;
   private boolean n11089H_TmA ;
   private boolean n11090H_UsA ;
   private boolean n11091H_HhA ;
   private boolean n11101H_obsa ;
   private boolean Gx_longc ;
   private String Z11101H_obsa ;
   private String A11101H_obsa ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01AN6_A407EmprNom ;
   private boolean[] T01AN6_n407EmprNom ;
   private java.util.Date[] T01AN9_A11084H_DiaA ;
   private String[] T01AN9_A407EmprNom ;
   private boolean[] T01AN9_n407EmprNom ;
   private String[] T01AN9_A279CliNom ;
   private String[] T01AN9_A69ArtDsc ;
   private boolean[] T01AN9_n69ArtDsc ;
   private int[] T01AN9_A11085H_UltlA ;
   private boolean[] T01AN9_n11085H_UltlA ;
   private String[] T01AN9_A396EmprCod ;
   private int[] T01AN9_A252CliCod ;
   private String[] T01AN9_A65ArtCod ;
   private String[] T01AN7_A279CliNom ;
   private String[] T01AN8_A69ArtDsc ;
   private boolean[] T01AN8_n69ArtDsc ;
   private String[] T01AN10_A279CliNom ;
   private String[] T01AN11_A69ArtDsc ;
   private boolean[] T01AN11_n69ArtDsc ;
   private String[] T01AN12_A396EmprCod ;
   private int[] T01AN12_A252CliCod ;
   private String[] T01AN12_A65ArtCod ;
   private java.util.Date[] T01AN12_A11084H_DiaA ;
   private java.util.Date[] T01AN5_A11084H_DiaA ;
   private int[] T01AN5_A11085H_UltlA ;
   private boolean[] T01AN5_n11085H_UltlA ;
   private String[] T01AN5_A396EmprCod ;
   private int[] T01AN5_A252CliCod ;
   private String[] T01AN5_A65ArtCod ;
   private String[] T01AN13_A396EmprCod ;
   private int[] T01AN13_A252CliCod ;
   private String[] T01AN13_A65ArtCod ;
   private java.util.Date[] T01AN13_A11084H_DiaA ;
   private String[] T01AN14_A396EmprCod ;
   private int[] T01AN14_A252CliCod ;
   private String[] T01AN14_A65ArtCod ;
   private java.util.Date[] T01AN14_A11084H_DiaA ;
   private java.util.Date[] T01AN4_A11084H_DiaA ;
   private int[] T01AN4_A11085H_UltlA ;
   private boolean[] T01AN4_n11085H_UltlA ;
   private String[] T01AN4_A396EmprCod ;
   private int[] T01AN4_A252CliCod ;
   private String[] T01AN4_A65ArtCod ;
   private String[] T01AN18_A279CliNom ;
   private String[] T01AN19_A69ArtDsc ;
   private boolean[] T01AN19_n69ArtDsc ;
   private String[] T01AN20_A396EmprCod ;
   private int[] T01AN20_A252CliCod ;
   private String[] T01AN20_A65ArtCod ;
   private java.util.Date[] T01AN20_A11084H_DiaA ;
   private int[] T01AN21_A252CliCod ;
   private String[] T01AN21_A65ArtCod ;
   private java.util.Date[] T01AN21_A11084H_DiaA ;
   private int[] T01AN21_A11086H_linA ;
   private java.math.BigDecimal[] T01AN21_A11087H_PkA ;
   private boolean[] T01AN21_n11087H_PkA ;
   private java.math.BigDecimal[] T01AN21_A11088H_PmA ;
   private boolean[] T01AN21_n11088H_PmA ;
   private String[] T01AN21_A11089H_TmA ;
   private boolean[] T01AN21_n11089H_TmA ;
   private String[] T01AN21_A11090H_UsA ;
   private boolean[] T01AN21_n11090H_UsA ;
   private java.util.Date[] T01AN21_A11091H_HhA ;
   private boolean[] T01AN21_n11091H_HhA ;
   private String[] T01AN21_A11101H_obsa ;
   private boolean[] T01AN21_n11101H_obsa ;
   private String[] T01AN21_A396EmprCod ;
   private String[] T01AN22_A396EmprCod ;
   private int[] T01AN22_A252CliCod ;
   private String[] T01AN22_A65ArtCod ;
   private java.util.Date[] T01AN22_A11084H_DiaA ;
   private int[] T01AN22_A11086H_linA ;
   private int[] T01AN3_A252CliCod ;
   private String[] T01AN3_A65ArtCod ;
   private java.util.Date[] T01AN3_A11084H_DiaA ;
   private int[] T01AN3_A11086H_linA ;
   private java.math.BigDecimal[] T01AN3_A11087H_PkA ;
   private boolean[] T01AN3_n11087H_PkA ;
   private java.math.BigDecimal[] T01AN3_A11088H_PmA ;
   private boolean[] T01AN3_n11088H_PmA ;
   private String[] T01AN3_A11089H_TmA ;
   private boolean[] T01AN3_n11089H_TmA ;
   private String[] T01AN3_A11090H_UsA ;
   private boolean[] T01AN3_n11090H_UsA ;
   private java.util.Date[] T01AN3_A11091H_HhA ;
   private boolean[] T01AN3_n11091H_HhA ;
   private String[] T01AN3_A11101H_obsa ;
   private boolean[] T01AN3_n11101H_obsa ;
   private String[] T01AN3_A396EmprCod ;
   private int[] T01AN2_A252CliCod ;
   private String[] T01AN2_A65ArtCod ;
   private java.util.Date[] T01AN2_A11084H_DiaA ;
   private int[] T01AN2_A11086H_linA ;
   private java.math.BigDecimal[] T01AN2_A11087H_PkA ;
   private boolean[] T01AN2_n11087H_PkA ;
   private java.math.BigDecimal[] T01AN2_A11088H_PmA ;
   private boolean[] T01AN2_n11088H_PmA ;
   private String[] T01AN2_A11089H_TmA ;
   private boolean[] T01AN2_n11089H_TmA ;
   private String[] T01AN2_A11090H_UsA ;
   private boolean[] T01AN2_n11090H_UsA ;
   private java.util.Date[] T01AN2_A11091H_HhA ;
   private boolean[] T01AN2_n11091H_HhA ;
   private String[] T01AN2_A11101H_obsa ;
   private boolean[] T01AN2_n11101H_obsa ;
   private String[] T01AN2_A396EmprCod ;
   private String[] T01AN26_A396EmprCod ;
   private int[] T01AN26_A252CliCod ;
   private String[] T01AN26_A65ArtCod ;
   private java.util.Date[] T01AN26_A11084H_DiaA ;
   private int[] T01AN26_A11086H_linA ;
   private String[] T01AN27_A407EmprNom ;
   private boolean[] T01AN27_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thpreat__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreat__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreat__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreat__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AN2", "SELECT CliCod, ArtCod, H_DiaA, H_linA, H_PkA, H_PmA, H_TmA, H_UsA, H_HhA, H_obsa, EmprCod FROM TXPHPREA1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? AND H_linA = ?  FOR UPDATE OF H_PkA, H_PmA, H_TmA, H_UsA, H_HhA, H_obsa NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN3", "SELECT CliCod, ArtCod, H_DiaA, H_linA, H_PkA, H_PmA, H_TmA, H_UsA, H_HhA, H_obsa, EmprCod FROM TXPHPREA1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? AND H_linA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN4", "SELECT H_DiaA, H_UltlA, EmprCod, CliCod, ArtCod FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ?  FOR UPDATE OF H_UltlA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN5", "SELECT H_DiaA, H_UltlA, EmprCod, CliCod, ArtCod FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN8", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN9", "SELECT /*+ FIRST_ROWS(100) */ TM1.H_DiaA, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.H_UltlA, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM (((TXPHPREAT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.H_DiaA = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.H_DiaA ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN11", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and H_DiaA > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, H_DiaA) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AN14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and H_DiaA < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, H_DiaA DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AN15", "INSERT INTO TXPHPREAT(H_DiaA, H_UltlA, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPREAT")
         ,new UpdateCursor("T01AN16", "UPDATE TXPHPREAT SET H_UltlA=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ?", GX_NOMASK, "TXPHPREAT")
         ,new UpdateCursor("T01AN17", "DELETE FROM TXPHPREAT  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ?", GX_NOMASK, "TXPHPREAT")
         ,new ForEachCursor("T01AN18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN19", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, H_DiaA ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN21", "SELECT CliCod, ArtCod, H_DiaA, H_linA, H_PkA, H_PmA, H_TmA, H_UsA, H_HhA, H_obsa, EmprCod FROM TXPHPREA1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and H_DiaA = ? and H_linA = ? ORDER BY EmprCod, CliCod, ArtCod, H_DiaA, H_linA ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN22", "SELECT EmprCod, CliCod, ArtCod, H_DiaA, H_linA FROM TXPHPREA1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? AND H_linA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AN23", "INSERT INTO TXPHPREA1(CliCod, ArtCod, H_DiaA, H_linA, H_PkA, H_PmA, H_TmA, H_UsA, H_HhA, H_obsa, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPREA1")
         ,new UpdateCursor("T01AN24", "UPDATE TXPHPREA1 SET H_PkA=?, H_PmA=?, H_TmA=?, H_UsA=?, H_HhA=?, H_obsa=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? AND H_linA = ?", GX_NOMASK, "TXPHPREA1")
         ,new UpdateCursor("T01AN25", "DELETE FROM TXPHPREA1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND H_DiaA = ? AND H_linA = ?", GX_NOMASK, "TXPHPREA1")
         ,new ForEachCursor("T01AN26", "SELECT EmprCod, CliCod, ArtCod, H_DiaA, H_linA FROM TXPHPREA1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and H_DiaA = ? ORDER BY EmprCod, CliCod, ArtCod, H_DiaA, H_linA ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AN27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 25 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
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
               stmt.setDate(4, (java.util.Date)parms[3]);
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
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 13 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setDate(5, (java.util.Date)parms[5]);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 200);
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 22 :
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
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 16);
               stmt.setDate(10, (java.util.Date)parms[15]);
               stmt.setInt(11, ((Number) parms[16]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

