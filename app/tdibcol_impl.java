package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdibcol_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
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
         gxload_5( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DIBUJOS/ COLORES CLIENTE-Ribes", ""), (short)(0)) ;
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

   public tdibcol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdibcol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdibcol_impl.class ));
   }

   public tdibcol_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDIBCOL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Dibujo Estampacion Ribes", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibColDib_Internalname, GXutil.rtrim( A4876DibColDib), GXutil.rtrim( localUtil.format( A4876DibColDib, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColDib_Jsonclick, 0, "", "", "", "", "", 1, edtDibColDib_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Color Dibujo Estampar Ribes", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibColCol_Internalname, GXutil.rtrim( A4877DibColCol), GXutil.rtrim( localUtil.format( A4877DibColCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColCol_Jsonclick, 0, "", "", "", "", "", 1, edtDibColCol_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N.Color Estampar Ribes", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibColColN_Internalname, GXutil.ltrim( localUtil.ntoc( A4879DibColColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibColColN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4879DibColColN), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4879DibColColN), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColColN_Jsonclick, 0, "", "", "", "", "", 1, edtDibColColN_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N.Cilindro Estampar Ribes", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibColDibN_Internalname, GXutil.ltrim( localUtil.ntoc( A4878DibColDibN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibColDibN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4878DibColDibN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4878DibColDibN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColDibN_Jsonclick, 0, "", "", "", "", "", 1, edtDibColDibN_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha Alta Dibujo Estamp.Ribes", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDibColFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibColFec_Internalname, localUtil.format(A4880DibColFec, "99/99/99"), localUtil.format( A4880DibColFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibColFec_Jsonclick, 0, "", "", "", "", "", 1, edtDibColFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBCOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDibColFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDibColFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDIBCOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Obs.Dibujo Estampar Ribes", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDibColObs_Internalname, A4881DibColObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", (short)(0), 1, edtDibColObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDIBCOL.htm");
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
      e111EZ2 ();
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
            Z4876DibColDib = httpContext.cgiGet( "Z4876DibColDib") ;
            Z4877DibColCol = httpContext.cgiGet( "Z4877DibColCol") ;
            Z4879DibColColN = (int)(localUtil.ctol( httpContext.cgiGet( "Z4879DibColColN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4878DibColDibN = (int)(localUtil.ctol( httpContext.cgiGet( "Z4878DibColDibN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4880DibColFec = localUtil.ctod( httpContext.cgiGet( "Z4880DibColFec"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
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
            A4876DibColDib = httpContext.cgiGet( edtDibColDib_Internalname) ;
            n4876DibColDib = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
            A4877DibColCol = httpContext.cgiGet( edtDibColCol_Internalname) ;
            n4877DibColCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibColColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibColColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBCOLCOLN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibColColN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4879DibColColN = 0 ;
               n4879DibColColN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
            }
            else
            {
               A4879DibColColN = (int)(localUtil.ctol( httpContext.cgiGet( edtDibColColN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4879DibColColN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibColDibN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibColDibN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBCOLDIBN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibColDibN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4878DibColDibN = 0 ;
               n4878DibColDibN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4878DibColDibN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4878DibColDibN), 8, 0));
            }
            else
            {
               A4878DibColDibN = (int)(localUtil.ctol( httpContext.cgiGet( edtDibColDibN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4878DibColDibN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4878DibColDibN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4878DibColDibN), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDibColFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DIBCOLFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibColFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4880DibColFec = GXutil.nullDate() ;
               n4880DibColFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
            }
            else
            {
               A4880DibColFec = localUtil.ctod( httpContext.cgiGet( edtDibColFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4880DibColFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
            }
            A4881DibColObs = httpContext.cgiGet( edtDibColObs_Internalname) ;
            n4881DibColObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4881DibColObs", A4881DibColObs);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A4876DibColDib = httpContext.GetPar( "DibColDib") ;
               n4876DibColDib = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
               A4877DibColCol = httpContext.GetPar( "DibColCol") ;
               n4877DibColCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
               A4879DibColColN = (int)(GXutil.lval( httpContext.GetPar( "DibColColN"))) ;
               n4879DibColColN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
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
                        e111EZ2 ();
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
            initAll1EZ1560( ) ;
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
      disableAttributes1EZ1560( ) ;
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

   public void confirm_1EZ0( )
   {
      beforeValidate1EZ1560( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EZ1560( ) ;
         }
         else
         {
            checkExtendedTable1EZ1560( ) ;
            if ( AnyError == 0 )
            {
               zm1EZ1560( 4) ;
               zm1EZ1560( 5) ;
            }
            closeExtendedTableCursors1EZ1560( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1EZ0( ) ;
      }
   }

   public void resetCaption1EZ0( )
   {
   }

   public void e111EZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char1 = AV18Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit0", AV18Lit0);
      AV40Lit2 = httpContext.getMessage( "MTO. DIBUJOS COLORES POR CLIENTE", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit2", AV40Lit2);
      GXt_char1 = AV46Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Lit3", AV46Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1095_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char1 = AV24Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char1 = AV22Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT660_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit6", AV22Lit6);
      GXt_char1 = AV25Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN076_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit7", AV25Lit7);
      GXt_char1 = AV26Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit8", AV26Lit8);
      GXt_char1 = AV27Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char2) ;
      tdibcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit9", AV27Lit9);
      AV20Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdibcol_impl.this.A396EmprCod = GXv_char2[0] ;
      tdibcol_impl.this.AV16EmprNom = GXv_char3[0] ;
      tdibcol_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zm1EZ1560( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4878DibColDibN = T01EZ3_A4878DibColDibN[0] ;
            Z4880DibColFec = T01EZ3_A4880DibColFec[0] ;
         }
         else
         {
            Z4878DibColDibN = A4878DibColDibN ;
            Z4880DibColFec = A4880DibColFec ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z4876DibColDib = A4876DibColDib ;
         Z4877DibColCol = A4877DibColCol ;
         Z4879DibColColN = A4879DibColColN ;
         Z4878DibColDibN = A4878DibColDibN ;
         Z4880DibColFec = A4880DibColFec ;
         Z4881DibColObs = A4881DibColObs ;
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
      /* Using cursor T01EZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EZ4_A407EmprNom[0] ;
      n407EmprNom = T01EZ4_n407EmprNom[0] ;
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4880DibColFec)) && ( Gx_BScreen == 0 ) )
      {
         A4880DibColFec = GXutil.today( ) ;
         n4880DibColFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
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

   public void load1EZ1560( )
   {
      /* Using cursor T01EZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1560 = (short)(1) ;
         A4881DibColObs = T01EZ6_A4881DibColObs[0] ;
         n4881DibColObs = T01EZ6_n4881DibColObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4881DibColObs", A4881DibColObs);
         A4878DibColDibN = T01EZ6_A4878DibColDibN[0] ;
         n4878DibColDibN = T01EZ6_n4878DibColDibN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4878DibColDibN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4878DibColDibN), 8, 0));
         A4880DibColFec = T01EZ6_A4880DibColFec[0] ;
         n4880DibColFec = T01EZ6_n4880DibColFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
         A279CliNom = T01EZ6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T01EZ6_A407EmprNom[0] ;
         n407EmprNom = T01EZ6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1EZ1560( -3) ;
      }
      pr_default.close(4);
      onLoadActions1EZ1560( ) ;
   }

   public void onLoadActions1EZ1560( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable1EZ1560( )
   {
      nIsDirty_1560 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T01EZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01EZ5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1EZ1560( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01EZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01EZ7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1EZ1560( )
   {
      /* Using cursor T01EZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1560 = (short)(1) ;
      }
      else
      {
         RcdFound1560 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EZ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EZ1560( 3) ;
         RcdFound1560 = (short)(1) ;
         A4881DibColObs = T01EZ3_A4881DibColObs[0] ;
         n4881DibColObs = T01EZ3_n4881DibColObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4881DibColObs", A4881DibColObs);
         A4876DibColDib = T01EZ3_A4876DibColDib[0] ;
         n4876DibColDib = T01EZ3_n4876DibColDib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
         A4877DibColCol = T01EZ3_A4877DibColCol[0] ;
         n4877DibColCol = T01EZ3_n4877DibColCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
         A4879DibColColN = T01EZ3_A4879DibColColN[0] ;
         n4879DibColColN = T01EZ3_n4879DibColColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
         A4878DibColDibN = T01EZ3_A4878DibColDibN[0] ;
         n4878DibColDibN = T01EZ3_n4878DibColDibN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4878DibColDibN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4878DibColDibN), 8, 0));
         A4880DibColFec = T01EZ3_A4880DibColFec[0] ;
         n4880DibColFec = T01EZ3_n4880DibColFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
         A252CliCod = T01EZ3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z4876DibColDib = A4876DibColDib ;
         Z4877DibColCol = A4877DibColCol ;
         Z4879DibColColN = A4879DibColColN ;
         sMode1560 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EZ1560( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1560 = (short)(0) ;
            initializeNonKey1EZ1560( ) ;
         }
         Gx_mode = sMode1560 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1560 = (short)(0) ;
         initializeNonKey1EZ1560( ) ;
         sMode1560 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1560 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1EZ1560( ) ;
      if ( RcdFound1560 == 0 )
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
      RcdFound1560 = (short)(0) ;
      /* Using cursor T01EZ9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Integer.valueOf(A252CliCod), Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Integer.valueOf(A252CliCod), Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01EZ9_A252CliCod[0] < A252CliCod ) || ( T01EZ9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ9_A4876DibColDib[0], A4876DibColDib) < 0 ) || ( GXutil.strcmp(T01EZ9_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ9_A4877DibColCol[0], A4877DibColCol) < 0 ) || ( GXutil.strcmp(T01EZ9_A4877DibColCol[0], A4877DibColCol) == 0 ) && ( GXutil.strcmp(T01EZ9_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ9_A252CliCod[0] == A252CliCod ) && ( T01EZ9_A4879DibColColN[0] < A4879DibColColN ) ) && ( GXutil.strcmp(T01EZ9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01EZ9_A252CliCod[0] > A252CliCod ) || ( T01EZ9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ9_A4876DibColDib[0], A4876DibColDib) > 0 ) || ( GXutil.strcmp(T01EZ9_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ9_A4877DibColCol[0], A4877DibColCol) > 0 ) || ( GXutil.strcmp(T01EZ9_A4877DibColCol[0], A4877DibColCol) == 0 ) && ( GXutil.strcmp(T01EZ9_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ9_A252CliCod[0] == A252CliCod ) && ( T01EZ9_A4879DibColColN[0] > A4879DibColColN ) ) && ( GXutil.strcmp(T01EZ9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01EZ9_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4876DibColDib = T01EZ9_A4876DibColDib[0] ;
            n4876DibColDib = T01EZ9_n4876DibColDib[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
            A4877DibColCol = T01EZ9_A4877DibColCol[0] ;
            n4877DibColCol = T01EZ9_n4877DibColCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
            A4879DibColColN = T01EZ9_A4879DibColColN[0] ;
            n4879DibColColN = T01EZ9_n4879DibColColN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
            RcdFound1560 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1560 = (short)(0) ;
      /* Using cursor T01EZ10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Integer.valueOf(A252CliCod), Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Integer.valueOf(A252CliCod), Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01EZ10_A252CliCod[0] > A252CliCod ) || ( T01EZ10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ10_A4876DibColDib[0], A4876DibColDib) > 0 ) || ( GXutil.strcmp(T01EZ10_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ10_A4877DibColCol[0], A4877DibColCol) > 0 ) || ( GXutil.strcmp(T01EZ10_A4877DibColCol[0], A4877DibColCol) == 0 ) && ( GXutil.strcmp(T01EZ10_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ10_A252CliCod[0] == A252CliCod ) && ( T01EZ10_A4879DibColColN[0] > A4879DibColColN ) ) && ( GXutil.strcmp(T01EZ10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01EZ10_A252CliCod[0] < A252CliCod ) || ( T01EZ10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ10_A4876DibColDib[0], A4876DibColDib) < 0 ) || ( GXutil.strcmp(T01EZ10_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EZ10_A4877DibColCol[0], A4877DibColCol) < 0 ) || ( GXutil.strcmp(T01EZ10_A4877DibColCol[0], A4877DibColCol) == 0 ) && ( GXutil.strcmp(T01EZ10_A4876DibColDib[0], A4876DibColDib) == 0 ) && ( T01EZ10_A252CliCod[0] == A252CliCod ) && ( T01EZ10_A4879DibColColN[0] < A4879DibColColN ) ) && ( GXutil.strcmp(T01EZ10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01EZ10_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4876DibColDib = T01EZ10_A4876DibColDib[0] ;
            n4876DibColDib = T01EZ10_n4876DibColDib[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
            A4877DibColCol = T01EZ10_A4877DibColCol[0] ;
            n4877DibColCol = T01EZ10_n4877DibColCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
            A4879DibColColN = T01EZ10_A4879DibColColN[0] ;
            n4879DibColColN = T01EZ10_n4879DibColColN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
            RcdFound1560 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EZ1560( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1EZ1560( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1560 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A4876DibColDib, Z4876DibColDib) != 0 ) || ( GXutil.strcmp(A4877DibColCol, Z4877DibColCol) != 0 ) || ( A4879DibColColN != Z4879DibColColN ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A4876DibColDib = Z4876DibColDib ;
               n4876DibColDib = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
               A4877DibColCol = Z4877DibColCol ;
               n4877DibColCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
               A4879DibColColN = Z4879DibColColN ;
               n4879DibColColN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
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
               update1EZ1560( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A4876DibColDib, Z4876DibColDib) != 0 ) || ( GXutil.strcmp(A4877DibColCol, Z4877DibColCol) != 0 ) || ( A4879DibColColN != Z4879DibColColN ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1EZ1560( ) ;
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
                  insert1EZ1560( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A4876DibColDib, Z4876DibColDib) != 0 ) || ( GXutil.strcmp(A4877DibColCol, Z4877DibColCol) != 0 ) || ( A4879DibColColN != Z4879DibColColN ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4876DibColDib = Z4876DibColDib ;
         n4876DibColDib = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
         A4877DibColCol = Z4877DibColCol ;
         n4877DibColCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
         A4879DibColColN = Z4879DibColColN ;
         n4879DibColColN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
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
      getKey1EZ1560( ) ;
      if ( RcdFound1560 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A4876DibColDib, Z4876DibColDib) != 0 ) || ( GXutil.strcmp(A4877DibColCol, Z4877DibColCol) != 0 ) || ( A4879DibColColN != Z4879DibColColN ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4876DibColDib = Z4876DibColDib ;
            n4876DibColDib = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
            A4877DibColCol = Z4877DibColCol ;
            n4877DibColCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
            A4879DibColColN = Z4879DibColColN ;
            n4879DibColColN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A4876DibColDib, Z4876DibColDib) != 0 ) || ( GXutil.strcmp(A4877DibColCol, Z4877DibColCol) != 0 ) || ( A4879DibColColN != Z4879DibColColN ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdibcol");
      GX_FocusControl = edtDibColDibN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1EZ0( ) ;
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
      if ( RcdFound1560 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDibColDibN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1EZ1560( ) ;
      if ( RcdFound1560 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibColDibN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EZ1560( ) ;
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
      if ( RcdFound1560 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibColDibN_Internalname ;
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
      if ( RcdFound1560 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibColDibN_Internalname ;
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
      scanStart1EZ1560( ) ;
      if ( RcdFound1560 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1560 != 0 )
         {
            scanNext1EZ1560( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDibColDibN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EZ1560( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EZ1560( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIBCOL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z4878DibColDibN != T01EZ2_A4878DibColDibN[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4880DibColFec), GXutil.resetTime(T01EZ2_A4880DibColFec[0])) ) )
         {
            if ( Z4878DibColDibN != T01EZ2_A4878DibColDibN[0] )
            {
               GXutil.writeLogln("tdibcol:[seudo value changed for attri]"+"DibColDibN");
               GXutil.writeLogRaw("Old: ",Z4878DibColDibN);
               GXutil.writeLogRaw("Current: ",T01EZ2_A4878DibColDibN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4880DibColFec), GXutil.resetTime(T01EZ2_A4880DibColFec[0])) ) )
            {
               GXutil.writeLogln("tdibcol:[seudo value changed for attri]"+"DibColFec");
               GXutil.writeLogRaw("Old: ",Z4880DibColFec);
               GXutil.writeLogRaw("Current: ",T01EZ2_A4880DibColFec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDIBCOL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EZ1560( )
   {
      beforeValidate1EZ1560( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EZ1560( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EZ1560( 0) ;
         checkOptimisticConcurrency1EZ1560( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EZ1560( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EZ1560( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EZ11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), Boolean.valueOf(n4878DibColDibN), Integer.valueOf(A4878DibColDibN), Boolean.valueOf(n4880DibColFec), A4880DibColFec, Boolean.valueOf(n4881DibColObs), A4881DibColObs, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBCOL");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1EZ0( ) ;
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
            load1EZ1560( ) ;
         }
         endLevel1EZ1560( ) ;
      }
      closeExtendedTableCursors1EZ1560( ) ;
   }

   public void update1EZ1560( )
   {
      beforeValidate1EZ1560( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EZ1560( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EZ1560( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EZ1560( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EZ1560( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EZ12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4878DibColDibN), Integer.valueOf(A4878DibColDibN), Boolean.valueOf(n4880DibColFec), A4880DibColFec, Boolean.valueOf(n4881DibColObs), A4881DibColObs, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBCOL");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDIBCOL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EZ1560( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1EZ0( ) ;
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
         endLevel1EZ1560( ) ;
      }
      closeExtendedTableCursors1EZ1560( ) ;
   }

   public void deferredUpdate1EZ1560( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EZ1560( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EZ1560( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EZ1560( ) ;
         afterConfirm1EZ1560( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EZ1560( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EZ13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBCOL");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1560 == 0 )
                     {
                        initAll1EZ1560( ) ;
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
                     resetCaption1EZ0( ) ;
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
      sMode1560 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EZ1560( ) ;
      Gx_mode = sMode1560 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EZ1560( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T01EZ14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01EZ14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01EZ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n4876DibColDib), A4876DibColDib, Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevel1EZ1560( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1EZ1560( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdibcol");
         if ( AnyError == 0 )
         {
            confirmValues1EZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdibcol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EZ1560( )
   {
      /* Scan By routine */
      /* Using cursor T01EZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1560 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1560 = (short)(1) ;
         A252CliCod = T01EZ16_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4876DibColDib = T01EZ16_A4876DibColDib[0] ;
         n4876DibColDib = T01EZ16_n4876DibColDib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
         A4877DibColCol = T01EZ16_A4877DibColCol[0] ;
         n4877DibColCol = T01EZ16_n4877DibColCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
         A4879DibColColN = T01EZ16_A4879DibColColN[0] ;
         n4879DibColColN = T01EZ16_n4879DibColColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EZ1560( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1560 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1560 = (short)(1) ;
         A252CliCod = T01EZ16_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4876DibColDib = T01EZ16_A4876DibColDib[0] ;
         n4876DibColDib = T01EZ16_n4876DibColDib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
         A4877DibColCol = T01EZ16_A4877DibColCol[0] ;
         n4877DibColCol = T01EZ16_n4877DibColCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
         A4879DibColColN = T01EZ16_A4879DibColColN[0] ;
         n4879DibColColN = T01EZ16_n4879DibColColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
      }
   }

   public void scanEnd1EZ1560( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1EZ1560( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EZ1560( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EZ1560( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EZ1560( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EZ1560( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EZ1560( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EZ1560( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDibColDib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibColDib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibColDib_Enabled), 5, 0), true);
      edtDibColCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibColCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibColCol_Enabled), 5, 0), true);
      edtDibColColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibColColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibColColN_Enabled), 5, 0), true);
      edtDibColDibN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibColDibN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibColDibN_Enabled), 5, 0), true);
      edtDibColFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibColFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibColFec_Enabled), 5, 0), true);
      edtDibColObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibColObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibColObs_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1EZ1560( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1EZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdibcol", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4876DibColDib", GXutil.rtrim( Z4876DibColDib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4877DibColCol", GXutil.rtrim( Z4877DibColCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4879DibColColN", GXutil.ltrim( localUtil.ntoc( Z4879DibColColN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4878DibColDibN", GXutil.ltrim( localUtil.ntoc( Z4878DibColDibN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4880DibColFec", localUtil.dtoc( Z4880DibColFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.tdibcol", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDIBCOL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DIBUJOS/ COLORES CLIENTE-Ribes", "") ;
   }

   public void initializeNonKey1EZ1560( )
   {
      A4878DibColDibN = 0 ;
      n4878DibColDibN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4878DibColDibN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4878DibColDibN), 8, 0));
      A4881DibColObs = "" ;
      n4881DibColObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4881DibColObs", A4881DibColObs);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4880DibColFec = GXutil.today( ) ;
      n4880DibColFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
      Z4878DibColDibN = 0 ;
      Z4880DibColFec = GXutil.nullDate() ;
   }

   public void initAll1EZ1560( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A4876DibColDib = "" ;
      n4876DibColDib = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4876DibColDib", A4876DibColDib);
      A4877DibColCol = "" ;
      n4877DibColCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4877DibColCol", A4877DibColCol);
      A4879DibColColN = 0 ;
      n4879DibColColN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4879DibColColN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4879DibColColN), 6, 0));
      initializeNonKey1EZ1560( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4880DibColFec = i4880DibColFec ;
      n4880DibColFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565945", true, true);
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
      httpContext.AddJavascriptSource("tdibcol.js", "?20268241565945", false, true);
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
      edtDibColDib_Internalname = "DIBCOLDIB" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibColCol_Internalname = "DIBCOLCOL" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDibColColN_Internalname = "DIBCOLCOLN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDibColDibN_Internalname = "DIBCOLDIBN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDibColFec_Internalname = "DIBCOLFEC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDibColObs_Internalname = "DIBCOLOBS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "DIBUJOS/ COLORES CLIENTE-Ribes", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtDibColObs_Backcolor = (int)(0xFFFFFF) ;
      edtDibColObs_Enabled = 1 ;
      edtDibColFec_Jsonclick = "" ;
      edtDibColFec_Backcolor = (int)(0xFFFFFF) ;
      edtDibColFec_Enabled = 1 ;
      edtDibColDibN_Jsonclick = "" ;
      edtDibColDibN_Backcolor = (int)(0xFFFFFF) ;
      edtDibColDibN_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDibColColN_Jsonclick = "" ;
      edtDibColColN_Backcolor = (int)(0xFFFFFF) ;
      edtDibColColN_Enabled = 1 ;
      edtDibColCol_Jsonclick = "" ;
      edtDibColCol_Backcolor = (int)(0xFFFFFF) ;
      edtDibColCol_Enabled = 1 ;
      edtDibColDib_Jsonclick = "" ;
      edtDibColDib_Backcolor = (int)(0xFFFFFF) ;
      edtDibColDib_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01EZ17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EZ17_A407EmprNom[0] ;
      n407EmprNom = T01EZ17_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T01EZ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01EZ14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(12);
      GX_FocusControl = edtDibColDibN_Internalname ;
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
      /* Using cursor T01EZ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01EZ14_A279CliNom[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Dibcolcoln( )
   {
      n4876DibColDib = false ;
      n4877DibColCol = false ;
      n4879DibColColN = false ;
      n4880DibColFec = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4878DibColDibN", GXutil.ltrim( localUtil.ntoc( A4878DibColDibN, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4880DibColFec", localUtil.format(A4880DibColFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4881DibColObs", A4881DibColObs);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4876DibColDib", GXutil.rtrim( Z4876DibColDib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4877DibColCol", GXutil.rtrim( Z4877DibColCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4879DibColColN", GXutil.ltrim( localUtil.ntoc( Z4879DibColColN, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4878DibColDibN", GXutil.ltrim( localUtil.ntoc( Z4878DibColDibN, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4880DibColFec", localUtil.format(Z4880DibColFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4881DibColObs", Z4881DibColObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
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
      setEventMetadata("VALID_DIBCOLDIB","{handler:'valid_Dibcoldib',iparms:[]");
      setEventMetadata("VALID_DIBCOLDIB",",oparms:[]}");
      setEventMetadata("VALID_DIBCOLCOL","{handler:'valid_Dibcolcol',iparms:[]");
      setEventMetadata("VALID_DIBCOLCOL",",oparms:[]}");
      setEventMetadata("VALID_DIBCOLCOLN","{handler:'valid_Dibcolcoln',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4876DibColDib',fld:'DIBCOLDIB',pic:''},{av:'A4877DibColCol',fld:'DIBCOLCOL',pic:''},{av:'A4879DibColColN',fld:'DIBCOLCOLN',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A4880DibColFec',fld:'DIBCOLFEC',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_DIBCOLCOLN",",oparms:[{av:'A4878DibColDibN',fld:'DIBCOLDIBN',pic:'ZZZZZZZ9'},{av:'A4880DibColFec',fld:'DIBCOLFEC',pic:''},{av:'A4881DibColObs',fld:'DIBCOLOBS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z4876DibColDib'},{av:'Z4877DibColCol'},{av:'Z4879DibColColN'},{av:'Z4878DibColDibN'},{av:'Z4880DibColFec'},{av:'Z4881DibColObs'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(12);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4876DibColDib = "" ;
      Z4877DibColCol = "" ;
      Z4880DibColFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A4876DibColDib = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4877DibColCol = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4880DibColFec = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A4881DibColObs = "" ;
      lblTextblock9_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      A407EmprNom = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV17UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV21LitFe = "" ;
      AV18Lit0 = "" ;
      AV40Lit2 = "" ;
      AV46Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV22Lit6 = "" ;
      AV25Lit7 = "" ;
      AV26Lit8 = "" ;
      AV27Lit9 = "" ;
      GXt_char1 = "" ;
      AV20Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z4881DibColObs = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01EZ4_A407EmprNom = new String[] {""} ;
      T01EZ4_n407EmprNom = new boolean[] {false} ;
      T01EZ6_A4881DibColObs = new String[] {""} ;
      T01EZ6_n4881DibColObs = new boolean[] {false} ;
      T01EZ6_A4876DibColDib = new String[] {""} ;
      T01EZ6_n4876DibColDib = new boolean[] {false} ;
      T01EZ6_A4877DibColCol = new String[] {""} ;
      T01EZ6_n4877DibColCol = new boolean[] {false} ;
      T01EZ6_A4879DibColColN = new int[1] ;
      T01EZ6_n4879DibColColN = new boolean[] {false} ;
      T01EZ6_A4878DibColDibN = new int[1] ;
      T01EZ6_n4878DibColDibN = new boolean[] {false} ;
      T01EZ6_A4880DibColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01EZ6_n4880DibColFec = new boolean[] {false} ;
      T01EZ6_A279CliNom = new String[] {""} ;
      T01EZ6_A407EmprNom = new String[] {""} ;
      T01EZ6_n407EmprNom = new boolean[] {false} ;
      T01EZ6_A396EmprCod = new String[] {""} ;
      T01EZ6_A252CliCod = new int[1] ;
      T01EZ5_A279CliNom = new String[] {""} ;
      T01EZ7_A279CliNom = new String[] {""} ;
      T01EZ8_A396EmprCod = new String[] {""} ;
      T01EZ8_A252CliCod = new int[1] ;
      T01EZ8_A4876DibColDib = new String[] {""} ;
      T01EZ8_n4876DibColDib = new boolean[] {false} ;
      T01EZ8_A4877DibColCol = new String[] {""} ;
      T01EZ8_n4877DibColCol = new boolean[] {false} ;
      T01EZ8_A4879DibColColN = new int[1] ;
      T01EZ8_n4879DibColColN = new boolean[] {false} ;
      T01EZ3_A4881DibColObs = new String[] {""} ;
      T01EZ3_n4881DibColObs = new boolean[] {false} ;
      T01EZ3_A4876DibColDib = new String[] {""} ;
      T01EZ3_n4876DibColDib = new boolean[] {false} ;
      T01EZ3_A4877DibColCol = new String[] {""} ;
      T01EZ3_n4877DibColCol = new boolean[] {false} ;
      T01EZ3_A4879DibColColN = new int[1] ;
      T01EZ3_n4879DibColColN = new boolean[] {false} ;
      T01EZ3_A4878DibColDibN = new int[1] ;
      T01EZ3_n4878DibColDibN = new boolean[] {false} ;
      T01EZ3_A4880DibColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01EZ3_n4880DibColFec = new boolean[] {false} ;
      T01EZ3_A396EmprCod = new String[] {""} ;
      T01EZ3_A252CliCod = new int[1] ;
      sMode1560 = "" ;
      T01EZ9_A396EmprCod = new String[] {""} ;
      T01EZ9_A252CliCod = new int[1] ;
      T01EZ9_A4876DibColDib = new String[] {""} ;
      T01EZ9_n4876DibColDib = new boolean[] {false} ;
      T01EZ9_A4877DibColCol = new String[] {""} ;
      T01EZ9_n4877DibColCol = new boolean[] {false} ;
      T01EZ9_A4879DibColColN = new int[1] ;
      T01EZ9_n4879DibColColN = new boolean[] {false} ;
      T01EZ10_A396EmprCod = new String[] {""} ;
      T01EZ10_A252CliCod = new int[1] ;
      T01EZ10_A4876DibColDib = new String[] {""} ;
      T01EZ10_n4876DibColDib = new boolean[] {false} ;
      T01EZ10_A4877DibColCol = new String[] {""} ;
      T01EZ10_n4877DibColCol = new boolean[] {false} ;
      T01EZ10_A4879DibColColN = new int[1] ;
      T01EZ10_n4879DibColColN = new boolean[] {false} ;
      T01EZ2_A4881DibColObs = new String[] {""} ;
      T01EZ2_n4881DibColObs = new boolean[] {false} ;
      T01EZ2_A4876DibColDib = new String[] {""} ;
      T01EZ2_n4876DibColDib = new boolean[] {false} ;
      T01EZ2_A4877DibColCol = new String[] {""} ;
      T01EZ2_n4877DibColCol = new boolean[] {false} ;
      T01EZ2_A4879DibColColN = new int[1] ;
      T01EZ2_n4879DibColColN = new boolean[] {false} ;
      T01EZ2_A4878DibColDibN = new int[1] ;
      T01EZ2_n4878DibColDibN = new boolean[] {false} ;
      T01EZ2_A4880DibColFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01EZ2_n4880DibColFec = new boolean[] {false} ;
      T01EZ2_A396EmprCod = new String[] {""} ;
      T01EZ2_A252CliCod = new int[1] ;
      T01EZ14_A279CliNom = new String[] {""} ;
      T01EZ15_A396EmprCod = new String[] {""} ;
      T01EZ15_A361DisCod = new int[1] ;
      T01EZ16_A396EmprCod = new String[] {""} ;
      T01EZ16_A252CliCod = new int[1] ;
      T01EZ16_A4876DibColDib = new String[] {""} ;
      T01EZ16_n4876DibColDib = new boolean[] {false} ;
      T01EZ16_A4877DibColCol = new String[] {""} ;
      T01EZ16_n4877DibColCol = new boolean[] {false} ;
      T01EZ16_A4879DibColColN = new int[1] ;
      T01EZ16_n4879DibColColN = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4880DibColFec = GXutil.nullDate() ;
      T01EZ17_A407EmprNom = new String[] {""} ;
      T01EZ17_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ4876DibColDib = "" ;
      ZZ4877DibColCol = "" ;
      ZZ4880DibColFec = GXutil.nullDate() ;
      ZZ4881DibColObs = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdibcol__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdibcol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdibcol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdibcol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdibcol__default(),
         new Object[] {
             new Object[] {
            T01EZ2_A4881DibColObs, T01EZ2_n4881DibColObs, T01EZ2_A4876DibColDib, T01EZ2_A4877DibColCol, T01EZ2_A4879DibColColN, T01EZ2_A4878DibColDibN, T01EZ2_n4878DibColDibN, T01EZ2_A4880DibColFec, T01EZ2_n4880DibColFec, T01EZ2_A396EmprCod,
            T01EZ2_A252CliCod
            }
            , new Object[] {
            T01EZ3_A4881DibColObs, T01EZ3_n4881DibColObs, T01EZ3_A4876DibColDib, T01EZ3_A4877DibColCol, T01EZ3_A4879DibColColN, T01EZ3_A4878DibColDibN, T01EZ3_n4878DibColDibN, T01EZ3_A4880DibColFec, T01EZ3_n4880DibColFec, T01EZ3_A396EmprCod,
            T01EZ3_A252CliCod
            }
            , new Object[] {
            T01EZ4_A407EmprNom, T01EZ4_n407EmprNom
            }
            , new Object[] {
            T01EZ5_A279CliNom
            }
            , new Object[] {
            T01EZ6_A4881DibColObs, T01EZ6_n4881DibColObs, T01EZ6_A4876DibColDib, T01EZ6_A4877DibColCol, T01EZ6_A4879DibColColN, T01EZ6_A4878DibColDibN, T01EZ6_n4878DibColDibN, T01EZ6_A4880DibColFec, T01EZ6_n4880DibColFec, T01EZ6_A279CliNom,
            T01EZ6_A407EmprNom, T01EZ6_n407EmprNom, T01EZ6_A396EmprCod, T01EZ6_A252CliCod
            }
            , new Object[] {
            T01EZ7_A279CliNom
            }
            , new Object[] {
            T01EZ8_A396EmprCod, T01EZ8_A252CliCod, T01EZ8_A4876DibColDib, T01EZ8_A4877DibColCol, T01EZ8_A4879DibColColN
            }
            , new Object[] {
            T01EZ9_A396EmprCod, T01EZ9_A252CliCod, T01EZ9_A4876DibColDib, T01EZ9_A4877DibColCol, T01EZ9_A4879DibColColN
            }
            , new Object[] {
            T01EZ10_A396EmprCod, T01EZ10_A252CliCod, T01EZ10_A4876DibColDib, T01EZ10_A4877DibColCol, T01EZ10_A4879DibColColN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EZ14_A279CliNom
            }
            , new Object[] {
            T01EZ15_A396EmprCod, T01EZ15_A361DisCod
            }
            , new Object[] {
            T01EZ16_A396EmprCod, T01EZ16_A252CliCod, T01EZ16_A4876DibColDib, T01EZ16_A4877DibColCol, T01EZ16_A4879DibColColN
            }
            , new Object[] {
            T01EZ17_A407EmprNom, T01EZ17_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z4880DibColFec = GXutil.today( ) ;
      n4880DibColFec = false ;
      A4880DibColFec = GXutil.today( ) ;
      n4880DibColFec = false ;
      i4880DibColFec = GXutil.today( ) ;
      n4880DibColFec = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1560 ;
   private short nIsDirty_1560 ;
   private int Z252CliCod ;
   private int Z4879DibColColN ;
   private int Z4878DibColDibN ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtDibColDib_Enabled ;
   private int edtDibColCol_Enabled ;
   private int A4879DibColColN ;
   private int edtDibColColN_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A4878DibColDibN ;
   private int edtDibColDibN_Enabled ;
   private int edtDibColFec_Enabled ;
   private int edtDibColObs_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
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
   private int edtEmprNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtDibColObs_Backcolor ;
   private int edtDibColFec_Backcolor ;
   private int edtDibColDibN_Backcolor ;
   private int edtDibColColN_Backcolor ;
   private int edtDibColCol_Backcolor ;
   private int edtDibColDib_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ4879DibColColN ;
   private int ZZ4878DibColDibN ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4876DibColDib ;
   private String Z4877DibColCol ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtDibColDib_Internalname ;
   private String A4876DibColDib ;
   private String edtDibColDib_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibColCol_Internalname ;
   private String A4877DibColCol ;
   private String edtDibColCol_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDibColColN_Internalname ;
   private String edtDibColColN_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDibColDibN_Internalname ;
   private String edtDibColDibN_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDibColFec_Internalname ;
   private String edtDibColFec_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDibColObs_Internalname ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
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
   private String AV17UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV21LitFe ;
   private String AV18Lit0 ;
   private String AV40Lit2 ;
   private String AV46Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV22Lit6 ;
   private String AV25Lit7 ;
   private String AV26Lit8 ;
   private String AV27Lit9 ;
   private String GXt_char1 ;
   private String AV20Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1560 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ4876DibColDib ;
   private String ZZ4877DibColCol ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private String ZZ279CliNom ;
   private java.util.Date Z4880DibColFec ;
   private java.util.Date A4880DibColFec ;
   private java.util.Date i4880DibColFec ;
   private java.util.Date ZZ4880DibColFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4876DibColDib ;
   private boolean n4877DibColCol ;
   private boolean n4879DibColColN ;
   private boolean n4878DibColDibN ;
   private boolean n4880DibColFec ;
   private boolean n4881DibColObs ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String A4881DibColObs ;
   private String Z4881DibColObs ;
   private String ZZ4881DibColObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01EZ4_A407EmprNom ;
   private boolean[] T01EZ4_n407EmprNom ;
   private String[] T01EZ6_A4881DibColObs ;
   private boolean[] T01EZ6_n4881DibColObs ;
   private String[] T01EZ6_A4876DibColDib ;
   private boolean[] T01EZ6_n4876DibColDib ;
   private String[] T01EZ6_A4877DibColCol ;
   private boolean[] T01EZ6_n4877DibColCol ;
   private int[] T01EZ6_A4879DibColColN ;
   private boolean[] T01EZ6_n4879DibColColN ;
   private int[] T01EZ6_A4878DibColDibN ;
   private boolean[] T01EZ6_n4878DibColDibN ;
   private java.util.Date[] T01EZ6_A4880DibColFec ;
   private boolean[] T01EZ6_n4880DibColFec ;
   private String[] T01EZ6_A279CliNom ;
   private String[] T01EZ6_A407EmprNom ;
   private boolean[] T01EZ6_n407EmprNom ;
   private String[] T01EZ6_A396EmprCod ;
   private int[] T01EZ6_A252CliCod ;
   private String[] T01EZ5_A279CliNom ;
   private String[] T01EZ7_A279CliNom ;
   private String[] T01EZ8_A396EmprCod ;
   private int[] T01EZ8_A252CliCod ;
   private String[] T01EZ8_A4876DibColDib ;
   private boolean[] T01EZ8_n4876DibColDib ;
   private String[] T01EZ8_A4877DibColCol ;
   private boolean[] T01EZ8_n4877DibColCol ;
   private int[] T01EZ8_A4879DibColColN ;
   private boolean[] T01EZ8_n4879DibColColN ;
   private String[] T01EZ3_A4881DibColObs ;
   private boolean[] T01EZ3_n4881DibColObs ;
   private String[] T01EZ3_A4876DibColDib ;
   private boolean[] T01EZ3_n4876DibColDib ;
   private String[] T01EZ3_A4877DibColCol ;
   private boolean[] T01EZ3_n4877DibColCol ;
   private int[] T01EZ3_A4879DibColColN ;
   private boolean[] T01EZ3_n4879DibColColN ;
   private int[] T01EZ3_A4878DibColDibN ;
   private boolean[] T01EZ3_n4878DibColDibN ;
   private java.util.Date[] T01EZ3_A4880DibColFec ;
   private boolean[] T01EZ3_n4880DibColFec ;
   private String[] T01EZ3_A396EmprCod ;
   private int[] T01EZ3_A252CliCod ;
   private String[] T01EZ9_A396EmprCod ;
   private int[] T01EZ9_A252CliCod ;
   private String[] T01EZ9_A4876DibColDib ;
   private boolean[] T01EZ9_n4876DibColDib ;
   private String[] T01EZ9_A4877DibColCol ;
   private boolean[] T01EZ9_n4877DibColCol ;
   private int[] T01EZ9_A4879DibColColN ;
   private boolean[] T01EZ9_n4879DibColColN ;
   private String[] T01EZ10_A396EmprCod ;
   private int[] T01EZ10_A252CliCod ;
   private String[] T01EZ10_A4876DibColDib ;
   private boolean[] T01EZ10_n4876DibColDib ;
   private String[] T01EZ10_A4877DibColCol ;
   private boolean[] T01EZ10_n4877DibColCol ;
   private int[] T01EZ10_A4879DibColColN ;
   private boolean[] T01EZ10_n4879DibColColN ;
   private String[] T01EZ2_A4881DibColObs ;
   private boolean[] T01EZ2_n4881DibColObs ;
   private String[] T01EZ2_A4876DibColDib ;
   private boolean[] T01EZ2_n4876DibColDib ;
   private String[] T01EZ2_A4877DibColCol ;
   private boolean[] T01EZ2_n4877DibColCol ;
   private int[] T01EZ2_A4879DibColColN ;
   private boolean[] T01EZ2_n4879DibColColN ;
   private int[] T01EZ2_A4878DibColDibN ;
   private boolean[] T01EZ2_n4878DibColDibN ;
   private java.util.Date[] T01EZ2_A4880DibColFec ;
   private boolean[] T01EZ2_n4880DibColFec ;
   private String[] T01EZ2_A396EmprCod ;
   private int[] T01EZ2_A252CliCod ;
   private String[] T01EZ14_A279CliNom ;
   private String[] T01EZ15_A396EmprCod ;
   private int[] T01EZ15_A361DisCod ;
   private String[] T01EZ16_A396EmprCod ;
   private int[] T01EZ16_A252CliCod ;
   private String[] T01EZ16_A4876DibColDib ;
   private boolean[] T01EZ16_n4876DibColDib ;
   private String[] T01EZ16_A4877DibColCol ;
   private boolean[] T01EZ16_n4877DibColCol ;
   private int[] T01EZ16_A4879DibColColN ;
   private boolean[] T01EZ16_n4879DibColColN ;
   private String[] T01EZ17_A407EmprNom ;
   private boolean[] T01EZ17_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdibcol__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibcol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibcol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibcol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EZ2", "SELECT DibColObs, DibColDib, DibColCol, DibColColN, DibColDibN, DibColFec, EmprCod, CliCod FROM TXPDIBCOL WHERE EmprCod = ? AND CliCod = ? AND DibColDib = ? AND DibColCol = ? AND DibColColN = ?  FOR UPDATE OF DibColDibN, DibColFec, DibColObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ3", "SELECT DibColObs, DibColDib, DibColCol, DibColColN, DibColDibN, DibColFec, EmprCod, CliCod FROM TXPDIBCOL WHERE EmprCod = ? AND CliCod = ? AND DibColDib = ? AND DibColCol = ? AND DibColColN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.DibColObs, TM1.DibColDib, TM1.DibColCol, TM1.DibColColN, TM1.DibColDibN, TM1.DibColFec, T3.CliNom, T2.EmprNom, TM1.EmprCod, TM1.CliCod FROM ((TXPDIBCOL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.DibColDib = ? and TM1.DibColCol = ? and TM1.DibColColN = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.DibColDib, TM1.DibColCol, TM1.DibColColN ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, DibColDib, DibColCol, DibColColN FROM TXPDIBCOL WHERE EmprCod = ? AND CliCod = ? AND DibColDib = ? AND DibColCol = ? AND DibColColN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, DibColDib, DibColCol, DibColColN FROM TXPDIBCOL WHERE ( CliCod > ? or CliCod = ? and DibColDib > ? or DibColDib = ? and CliCod = ? and DibColCol > ? or DibColCol = ? and DibColDib = ? and CliCod = ? and DibColColN > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, DibColDib, DibColCol, DibColColN) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EZ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, DibColDib, DibColCol, DibColColN FROM TXPDIBCOL WHERE ( CliCod < ? or CliCod = ? and DibColDib < ? or DibColDib = ? and CliCod = ? and DibColCol < ? or DibColCol = ? and DibColDib = ? and CliCod = ? and DibColColN < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, DibColDib DESC, DibColCol DESC, DibColColN DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EZ11", "INSERT INTO TXPDIBCOL(DibColDib, DibColCol, DibColColN, DibColDibN, DibColFec, DibColObs, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDIBCOL")
         ,new UpdateCursor("T01EZ12", "UPDATE TXPDIBCOL SET DibColDibN=?, DibColFec=?, DibColObs=?  WHERE EmprCod = ? AND CliCod = ? AND DibColDib = ? AND DibColCol = ? AND DibColColN = ?", GX_NOMASK, "TXPDIBCOL")
         ,new UpdateCursor("T01EZ13", "DELETE FROM TXPDIBCOL  WHERE EmprCod = ? AND CliCod = ? AND DibColDib = ? AND DibColCol = ? AND DibColColN = ?", GX_NOMASK, "TXPDIBCOL")
         ,new ForEachCursor("T01EZ14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ15", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND CliCod = ? AND DibColDib = ? AND DibColCol = ? AND DibColColN = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EZ16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, DibColDib, DibColCol, DibColColN FROM TXPDIBCOL WHERE EmprCod = ? ORDER BY EmprCod, CliCod, DibColDib, DibColCol, DibColColN ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EZ17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 15 :
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 30);
               }
               stmt.setInt(5, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 12);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 12);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 30);
               }
               stmt.setInt(9, ((Number) parms[13]).intValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 30);
               }
               stmt.setInt(5, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 12);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 12);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 30);
               }
               stmt.setInt(9, ((Number) parms[13]).intValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 12);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
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
                  stmt.setNull( 6 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(6, (String)parms[11]);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               return;
            case 10 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[5]);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 12);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[13]).intValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 12);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

