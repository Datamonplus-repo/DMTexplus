package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrincaca_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Estructura - TRINCACA (Inciden", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAcIdReg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttrincaca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrincaca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrincaca_impl.class ));
   }

   public ttrincaca_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrIncACA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Identificación Registro", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcIdReg_Internalname, GXutil.ltrim( localUtil.ntoc( A11306AcIdReg, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcIdReg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11306AcIdReg), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11306AcIdReg), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcIdReg_Jsonclick, 0, "", "", "", "", "", 1, edtAcIdReg_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "IAFec Mov", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAcFecMov_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcFecMov_Internalname, localUtil.ttoc( A11308AcFecMov, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11308AcFecMov, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcFecMov_Jsonclick, 0, "", "", "", "", "", 1, edtAcFecMov_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrIncACA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAcFecMov_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAcFecMov_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrIncACA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Tipo Movimiento", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcTipMov_Internalname, GXutil.rtrim( A11307AcTipMov), GXutil.rtrim( localUtil.format( A11307AcTipMov, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcTipMov_Jsonclick, 0, "", "", "", "", "", 1, edtAcTipMov_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Empresa", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcEmprCod_Internalname, GXutil.rtrim( A11313AcEmprCod), GXutil.rtrim( localUtil.format( A11313AcEmprCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtAcEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "BarCod", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11309AcBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11309AcBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11309AcBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtAcBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "BarReo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A11310AcBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11310AcBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A11310AcBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtAcBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "BarPar", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcBarPar_Internalname, GXutil.rtrim( A11311AcBarPar), GXutil.rtrim( localUtil.format( A11311AcBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtAcBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código de Pieza", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcBarPie_Internalname, GXutil.rtrim( A11314AcBarPie), GXutil.rtrim( localUtil.format( A11314AcBarPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcBarPie_Jsonclick, 0, "", "", "", "", "", 1, edtAcBarPie_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Pieza Hija (trozo)", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcPieHija_Internalname, GXutil.rtrim( A11315AcPieHija), GXutil.rtrim( localUtil.format( A11315AcPieHija, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcPieHija_Jsonclick, 0, "", "", "", "", "", 1, edtAcPieHija_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Situación Registro", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcSitReg_Internalname, GXutil.ltrim( localUtil.ntoc( A11312AcSitReg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcSitReg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11312AcSitReg), "9") : localUtil.format( DecimalUtil.doubleToDec(A11312AcSitReg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcSitReg_Jsonclick, 0, "", "", "", "", "", 1, edtAcSitReg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "VxFoNuCo", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcFoNuCo_Internalname, GXutil.ltrim( localUtil.ntoc( A11316AcFoNuCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcFoNuCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11316AcFoNuCo), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11316AcFoNuCo), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcFoNuCo_Jsonclick, 0, "", "", "", "", "", 1, edtAcFoNuCo_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrIncACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrIncACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrIncACA.htm");
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
         Z11306AcIdReg = (int)(localUtil.ctol( httpContext.cgiGet( "Z11306AcIdReg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11308AcFecMov = localUtil.ctot( httpContext.cgiGet( "Z11308AcFecMov"), 0) ;
         Z11307AcTipMov = httpContext.cgiGet( "Z11307AcTipMov") ;
         Z11313AcEmprCod = httpContext.cgiGet( "Z11313AcEmprCod") ;
         Z11309AcBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z11309AcBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11310AcBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11310AcBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11311AcBarPar = httpContext.cgiGet( "Z11311AcBarPar") ;
         Z11314AcBarPie = httpContext.cgiGet( "Z11314AcBarPie") ;
         Z11315AcPieHija = httpContext.cgiGet( "Z11315AcPieHija") ;
         Z11312AcSitReg = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11312AcSitReg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11316AcFoNuCo = (int)(localUtil.ctol( httpContext.cgiGet( "Z11316AcFoNuCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAcIdReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAcIdReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACIDREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcIdReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11306AcIdReg = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
         }
         else
         {
            A11306AcIdReg = (int)(localUtil.ctol( httpContext.cgiGet( edtAcIdReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtAcFecMov_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ACFECMOV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcFecMov_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
            n11308AcFecMov = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11308AcFecMov", localUtil.ttoc( A11308AcFecMov, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11308AcFecMov = localUtil.ctot( httpContext.cgiGet( edtAcFecMov_Internalname)) ;
            n11308AcFecMov = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11308AcFecMov", localUtil.ttoc( A11308AcFecMov, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A11307AcTipMov = httpContext.cgiGet( edtAcTipMov_Internalname) ;
         n11307AcTipMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11307AcTipMov", A11307AcTipMov);
         A11313AcEmprCod = httpContext.cgiGet( edtAcEmprCod_Internalname) ;
         n11313AcEmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11313AcEmprCod", A11313AcEmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAcBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAcBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11309AcBarCod = 0 ;
            n11309AcBarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11309AcBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11309AcBarCod), 8, 0));
         }
         else
         {
            A11309AcBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAcBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11309AcBarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11309AcBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11309AcBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAcBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAcBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACBARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcBarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11310AcBarReo = (byte)(0) ;
            n11310AcBarReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11310AcBarReo", GXutil.str( A11310AcBarReo, 1, 0));
         }
         else
         {
            A11310AcBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtAcBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11310AcBarReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11310AcBarReo", GXutil.str( A11310AcBarReo, 1, 0));
         }
         A11311AcBarPar = httpContext.cgiGet( edtAcBarPar_Internalname) ;
         n11311AcBarPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11311AcBarPar", A11311AcBarPar);
         A11314AcBarPie = httpContext.cgiGet( edtAcBarPie_Internalname) ;
         n11314AcBarPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11314AcBarPie", A11314AcBarPie);
         A11315AcPieHija = httpContext.cgiGet( edtAcPieHija_Internalname) ;
         n11315AcPieHija = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11315AcPieHija", A11315AcPieHija);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAcSitReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAcSitReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACSITREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcSitReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11312AcSitReg = (byte)(0) ;
            n11312AcSitReg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11312AcSitReg", GXutil.str( A11312AcSitReg, 1, 0));
         }
         else
         {
            A11312AcSitReg = (byte)(localUtil.ctol( httpContext.cgiGet( edtAcSitReg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11312AcSitReg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11312AcSitReg", GXutil.str( A11312AcSitReg, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAcFoNuCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAcFoNuCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACFONUCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcFoNuCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11316AcFoNuCo = 0 ;
            n11316AcFoNuCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11316AcFoNuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11316AcFoNuCo), 6, 0));
         }
         else
         {
            A11316AcFoNuCo = (int)(localUtil.ctol( httpContext.cgiGet( edtAcFoNuCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11316AcFoNuCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11316AcFoNuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11316AcFoNuCo), 6, 0));
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
            A11306AcIdReg = (int)(GXutil.lval( httpContext.GetPar( "AcIdReg"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
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
            initAll1BK1510( ) ;
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
      disableAttributes1BK1510( ) ;
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

   public void confirm_1BK0( )
   {
      beforeValidate1BK1510( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BK1510( ) ;
         }
         else
         {
            checkExtendedTable1BK1510( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1BK1510( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1BK0( ) ;
      }
   }

   public void resetCaption1BK0( )
   {
   }

   public void zm1BK1510( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11308AcFecMov = T01BK3_A11308AcFecMov[0] ;
            Z11307AcTipMov = T01BK3_A11307AcTipMov[0] ;
            Z11313AcEmprCod = T01BK3_A11313AcEmprCod[0] ;
            Z11309AcBarCod = T01BK3_A11309AcBarCod[0] ;
            Z11310AcBarReo = T01BK3_A11310AcBarReo[0] ;
            Z11311AcBarPar = T01BK3_A11311AcBarPar[0] ;
            Z11314AcBarPie = T01BK3_A11314AcBarPie[0] ;
            Z11315AcPieHija = T01BK3_A11315AcPieHija[0] ;
            Z11312AcSitReg = T01BK3_A11312AcSitReg[0] ;
            Z11316AcFoNuCo = T01BK3_A11316AcFoNuCo[0] ;
         }
         else
         {
            Z11308AcFecMov = A11308AcFecMov ;
            Z11307AcTipMov = A11307AcTipMov ;
            Z11313AcEmprCod = A11313AcEmprCod ;
            Z11309AcBarCod = A11309AcBarCod ;
            Z11310AcBarReo = A11310AcBarReo ;
            Z11311AcBarPar = A11311AcBarPar ;
            Z11314AcBarPie = A11314AcBarPie ;
            Z11315AcPieHija = A11315AcPieHija ;
            Z11312AcSitReg = A11312AcSitReg ;
            Z11316AcFoNuCo = A11316AcFoNuCo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11306AcIdReg = A11306AcIdReg ;
         Z11308AcFecMov = A11308AcFecMov ;
         Z11307AcTipMov = A11307AcTipMov ;
         Z11313AcEmprCod = A11313AcEmprCod ;
         Z11309AcBarCod = A11309AcBarCod ;
         Z11310AcBarReo = A11310AcBarReo ;
         Z11311AcBarPar = A11311AcBarPar ;
         Z11314AcBarPie = A11314AcBarPie ;
         Z11315AcPieHija = A11315AcPieHija ;
         Z11312AcSitReg = A11312AcSitReg ;
         Z11316AcFoNuCo = A11316AcFoNuCo ;
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

   public void load1BK1510( )
   {
      /* Using cursor T01BK4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A11306AcIdReg)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1510 = (short)(1) ;
         A11308AcFecMov = T01BK4_A11308AcFecMov[0] ;
         n11308AcFecMov = T01BK4_n11308AcFecMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11308AcFecMov", localUtil.ttoc( A11308AcFecMov, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11307AcTipMov = T01BK4_A11307AcTipMov[0] ;
         n11307AcTipMov = T01BK4_n11307AcTipMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11307AcTipMov", A11307AcTipMov);
         A11313AcEmprCod = T01BK4_A11313AcEmprCod[0] ;
         n11313AcEmprCod = T01BK4_n11313AcEmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11313AcEmprCod", A11313AcEmprCod);
         A11309AcBarCod = T01BK4_A11309AcBarCod[0] ;
         n11309AcBarCod = T01BK4_n11309AcBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11309AcBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11309AcBarCod), 8, 0));
         A11310AcBarReo = T01BK4_A11310AcBarReo[0] ;
         n11310AcBarReo = T01BK4_n11310AcBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11310AcBarReo", GXutil.str( A11310AcBarReo, 1, 0));
         A11311AcBarPar = T01BK4_A11311AcBarPar[0] ;
         n11311AcBarPar = T01BK4_n11311AcBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11311AcBarPar", A11311AcBarPar);
         A11314AcBarPie = T01BK4_A11314AcBarPie[0] ;
         n11314AcBarPie = T01BK4_n11314AcBarPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11314AcBarPie", A11314AcBarPie);
         A11315AcPieHija = T01BK4_A11315AcPieHija[0] ;
         n11315AcPieHija = T01BK4_n11315AcPieHija[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11315AcPieHija", A11315AcPieHija);
         A11312AcSitReg = T01BK4_A11312AcSitReg[0] ;
         n11312AcSitReg = T01BK4_n11312AcSitReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11312AcSitReg", GXutil.str( A11312AcSitReg, 1, 0));
         A11316AcFoNuCo = T01BK4_A11316AcFoNuCo[0] ;
         n11316AcFoNuCo = T01BK4_n11316AcFoNuCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11316AcFoNuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11316AcFoNuCo), 6, 0));
         zm1BK1510( -1) ;
      }
      pr_default.close(2);
      onLoadActions1BK1510( ) ;
   }

   public void onLoadActions1BK1510( )
   {
   }

   public void checkExtendedTable1BK1510( )
   {
      nIsDirty_1510 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1BK1510( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1BK1510( )
   {
      /* Using cursor T01BK5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A11306AcIdReg)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1510 = (short)(1) ;
      }
      else
      {
         RcdFound1510 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BK3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A11306AcIdReg)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1BK1510( 1) ;
         RcdFound1510 = (short)(1) ;
         A11306AcIdReg = T01BK3_A11306AcIdReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
         A11308AcFecMov = T01BK3_A11308AcFecMov[0] ;
         n11308AcFecMov = T01BK3_n11308AcFecMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11308AcFecMov", localUtil.ttoc( A11308AcFecMov, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11307AcTipMov = T01BK3_A11307AcTipMov[0] ;
         n11307AcTipMov = T01BK3_n11307AcTipMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11307AcTipMov", A11307AcTipMov);
         A11313AcEmprCod = T01BK3_A11313AcEmprCod[0] ;
         n11313AcEmprCod = T01BK3_n11313AcEmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11313AcEmprCod", A11313AcEmprCod);
         A11309AcBarCod = T01BK3_A11309AcBarCod[0] ;
         n11309AcBarCod = T01BK3_n11309AcBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11309AcBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11309AcBarCod), 8, 0));
         A11310AcBarReo = T01BK3_A11310AcBarReo[0] ;
         n11310AcBarReo = T01BK3_n11310AcBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11310AcBarReo", GXutil.str( A11310AcBarReo, 1, 0));
         A11311AcBarPar = T01BK3_A11311AcBarPar[0] ;
         n11311AcBarPar = T01BK3_n11311AcBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11311AcBarPar", A11311AcBarPar);
         A11314AcBarPie = T01BK3_A11314AcBarPie[0] ;
         n11314AcBarPie = T01BK3_n11314AcBarPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11314AcBarPie", A11314AcBarPie);
         A11315AcPieHija = T01BK3_A11315AcPieHija[0] ;
         n11315AcPieHija = T01BK3_n11315AcPieHija[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11315AcPieHija", A11315AcPieHija);
         A11312AcSitReg = T01BK3_A11312AcSitReg[0] ;
         n11312AcSitReg = T01BK3_n11312AcSitReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11312AcSitReg", GXutil.str( A11312AcSitReg, 1, 0));
         A11316AcFoNuCo = T01BK3_A11316AcFoNuCo[0] ;
         n11316AcFoNuCo = T01BK3_n11316AcFoNuCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11316AcFoNuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11316AcFoNuCo), 6, 0));
         Z11306AcIdReg = A11306AcIdReg ;
         sMode1510 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BK1510( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1510 = (short)(0) ;
            initializeNonKey1BK1510( ) ;
         }
         Gx_mode = sMode1510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1510 = (short)(0) ;
         initializeNonKey1BK1510( ) ;
         sMode1510 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1BK1510( ) ;
      if ( RcdFound1510 == 0 )
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
      RcdFound1510 = (short)(0) ;
      /* Using cursor T01BK6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A11306AcIdReg)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01BK6_A11306AcIdReg[0] < A11306AcIdReg ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01BK6_A11306AcIdReg[0] > A11306AcIdReg ) ) )
         {
            A11306AcIdReg = T01BK6_A11306AcIdReg[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
            RcdFound1510 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1510 = (short)(0) ;
      /* Using cursor T01BK7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A11306AcIdReg)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01BK7_A11306AcIdReg[0] > A11306AcIdReg ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01BK7_A11306AcIdReg[0] < A11306AcIdReg ) ) )
         {
            A11306AcIdReg = T01BK7_A11306AcIdReg[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
            RcdFound1510 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BK1510( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAcIdReg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BK1510( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1510 == 1 )
         {
            if ( A11306AcIdReg != Z11306AcIdReg )
            {
               A11306AcIdReg = Z11306AcIdReg ;
               httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ACIDREG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAcIdReg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAcIdReg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1BK1510( ) ;
               GX_FocusControl = edtAcIdReg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A11306AcIdReg != Z11306AcIdReg )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAcIdReg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BK1510( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ACIDREG");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAcIdReg_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtAcIdReg_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1BK1510( ) ;
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
      if ( A11306AcIdReg != Z11306AcIdReg )
      {
         A11306AcIdReg = Z11306AcIdReg ;
         httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ACIDREG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAcIdReg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAcIdReg_Internalname ;
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
      getKey1BK1510( ) ;
      if ( RcdFound1510 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "ACIDREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcIdReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A11306AcIdReg != Z11306AcIdReg )
         {
            A11306AcIdReg = Z11306AcIdReg ;
            httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "ACIDREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAcIdReg_Internalname ;
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
         if ( A11306AcIdReg != Z11306AcIdReg )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ACIDREG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAcIdReg_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrincaca");
      GX_FocusControl = edtAcFecMov_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BK0( ) ;
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
      if ( RcdFound1510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "ACIDREG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAcIdReg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAcFecMov_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1BK1510( ) ;
      if ( RcdFound1510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAcFecMov_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BK1510( ) ;
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
      if ( RcdFound1510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAcFecMov_Internalname ;
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
      if ( RcdFound1510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAcFecMov_Internalname ;
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
      scanStart1BK1510( ) ;
      if ( RcdFound1510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1510 != 0 )
         {
            scanNext1BK1510( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAcFecMov_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BK1510( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BK1510( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BK2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A11306AcIdReg)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXTRINCACA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z11308AcFecMov, T01BK2_A11308AcFecMov[0]) ) || ( GXutil.strcmp(Z11307AcTipMov, T01BK2_A11307AcTipMov[0]) != 0 ) || ( GXutil.strcmp(Z11313AcEmprCod, T01BK2_A11313AcEmprCod[0]) != 0 ) || ( Z11309AcBarCod != T01BK2_A11309AcBarCod[0] ) || ( Z11310AcBarReo != T01BK2_A11310AcBarReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11311AcBarPar, T01BK2_A11311AcBarPar[0]) != 0 ) || ( GXutil.strcmp(Z11314AcBarPie, T01BK2_A11314AcBarPie[0]) != 0 ) || ( GXutil.strcmp(Z11315AcPieHija, T01BK2_A11315AcPieHija[0]) != 0 ) || ( Z11312AcSitReg != T01BK2_A11312AcSitReg[0] ) || ( Z11316AcFoNuCo != T01BK2_A11316AcFoNuCo[0] ) )
         {
            if ( !( GXutil.dateCompare(Z11308AcFecMov, T01BK2_A11308AcFecMov[0]) ) )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcFecMov");
               GXutil.writeLogRaw("Old: ",Z11308AcFecMov);
               GXutil.writeLogRaw("Current: ",T01BK2_A11308AcFecMov[0]);
            }
            if ( GXutil.strcmp(Z11307AcTipMov, T01BK2_A11307AcTipMov[0]) != 0 )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcTipMov");
               GXutil.writeLogRaw("Old: ",Z11307AcTipMov);
               GXutil.writeLogRaw("Current: ",T01BK2_A11307AcTipMov[0]);
            }
            if ( GXutil.strcmp(Z11313AcEmprCod, T01BK2_A11313AcEmprCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcEmprCod");
               GXutil.writeLogRaw("Old: ",Z11313AcEmprCod);
               GXutil.writeLogRaw("Current: ",T01BK2_A11313AcEmprCod[0]);
            }
            if ( Z11309AcBarCod != T01BK2_A11309AcBarCod[0] )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcBarCod");
               GXutil.writeLogRaw("Old: ",Z11309AcBarCod);
               GXutil.writeLogRaw("Current: ",T01BK2_A11309AcBarCod[0]);
            }
            if ( Z11310AcBarReo != T01BK2_A11310AcBarReo[0] )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcBarReo");
               GXutil.writeLogRaw("Old: ",Z11310AcBarReo);
               GXutil.writeLogRaw("Current: ",T01BK2_A11310AcBarReo[0]);
            }
            if ( GXutil.strcmp(Z11311AcBarPar, T01BK2_A11311AcBarPar[0]) != 0 )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcBarPar");
               GXutil.writeLogRaw("Old: ",Z11311AcBarPar);
               GXutil.writeLogRaw("Current: ",T01BK2_A11311AcBarPar[0]);
            }
            if ( GXutil.strcmp(Z11314AcBarPie, T01BK2_A11314AcBarPie[0]) != 0 )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcBarPie");
               GXutil.writeLogRaw("Old: ",Z11314AcBarPie);
               GXutil.writeLogRaw("Current: ",T01BK2_A11314AcBarPie[0]);
            }
            if ( GXutil.strcmp(Z11315AcPieHija, T01BK2_A11315AcPieHija[0]) != 0 )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcPieHija");
               GXutil.writeLogRaw("Old: ",Z11315AcPieHija);
               GXutil.writeLogRaw("Current: ",T01BK2_A11315AcPieHija[0]);
            }
            if ( Z11312AcSitReg != T01BK2_A11312AcSitReg[0] )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcSitReg");
               GXutil.writeLogRaw("Old: ",Z11312AcSitReg);
               GXutil.writeLogRaw("Current: ",T01BK2_A11312AcSitReg[0]);
            }
            if ( Z11316AcFoNuCo != T01BK2_A11316AcFoNuCo[0] )
            {
               GXutil.writeLogln("ttrincaca:[seudo value changed for attri]"+"AcFoNuCo");
               GXutil.writeLogRaw("Old: ",Z11316AcFoNuCo);
               GXutil.writeLogRaw("Current: ",T01BK2_A11316AcFoNuCo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXTRINCACA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BK1510( )
   {
      beforeValidate1BK1510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BK1510( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BK1510( 0) ;
         checkOptimisticConcurrency1BK1510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BK1510( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BK1510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BK8 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n11308AcFecMov), A11308AcFecMov, Boolean.valueOf(n11307AcTipMov), A11307AcTipMov, Boolean.valueOf(n11313AcEmprCod), A11313AcEmprCod, Boolean.valueOf(n11309AcBarCod), Integer.valueOf(A11309AcBarCod), Boolean.valueOf(n11310AcBarReo), Byte.valueOf(A11310AcBarReo), Boolean.valueOf(n11311AcBarPar), A11311AcBarPar, Boolean.valueOf(n11314AcBarPie), A11314AcBarPie, Boolean.valueOf(n11315AcPieHija), A11315AcPieHija, Boolean.valueOf(n11312AcSitReg), Byte.valueOf(A11312AcSitReg), Boolean.valueOf(n11316AcFoNuCo), Integer.valueOf(A11316AcFoNuCo)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01BK9 */
                  pr_default.execute(7);
                  A11306AcIdReg = T01BK9_A11306AcIdReg[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTRINCACA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1BK0( ) ;
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
            load1BK1510( ) ;
         }
         endLevel1BK1510( ) ;
      }
      closeExtendedTableCursors1BK1510( ) ;
   }

   public void update1BK1510( )
   {
      beforeValidate1BK1510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BK1510( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BK1510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BK1510( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BK1510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BK10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n11308AcFecMov), A11308AcFecMov, Boolean.valueOf(n11307AcTipMov), A11307AcTipMov, Boolean.valueOf(n11313AcEmprCod), A11313AcEmprCod, Boolean.valueOf(n11309AcBarCod), Integer.valueOf(A11309AcBarCod), Boolean.valueOf(n11310AcBarReo), Byte.valueOf(A11310AcBarReo), Boolean.valueOf(n11311AcBarPar), A11311AcBarPar, Boolean.valueOf(n11314AcBarPie), A11314AcBarPie, Boolean.valueOf(n11315AcPieHija), A11315AcPieHija, Boolean.valueOf(n11312AcSitReg), Byte.valueOf(A11312AcSitReg), Boolean.valueOf(n11316AcFoNuCo), Integer.valueOf(A11316AcFoNuCo), Integer.valueOf(A11306AcIdReg)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTRINCACA");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXTRINCACA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BK1510( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1BK0( ) ;
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
         endLevel1BK1510( ) ;
      }
      closeExtendedTableCursors1BK1510( ) ;
   }

   public void deferredUpdate1BK1510( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BK1510( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BK1510( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BK1510( ) ;
         afterConfirm1BK1510( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BK1510( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BK11 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A11306AcIdReg)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTRINCACA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1510 == 0 )
                     {
                        initAll1BK1510( ) ;
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
                     resetCaption1BK0( ) ;
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
      sMode1510 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BK1510( ) ;
      Gx_mode = sMode1510 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BK1510( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BK1510( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BK1510( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrincaca");
         if ( AnyError == 0 )
         {
            confirmValues1BK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrincaca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BK1510( )
   {
      /* Using cursor T01BK12 */
      pr_default.execute(10);
      RcdFound1510 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1510 = (short)(1) ;
         A11306AcIdReg = T01BK12_A11306AcIdReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BK1510( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1510 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1510 = (short)(1) ;
         A11306AcIdReg = T01BK12_A11306AcIdReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
      }
   }

   public void scanEnd1BK1510( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1BK1510( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BK1510( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BK1510( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BK1510( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BK1510( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BK1510( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BK1510( )
   {
      edtAcIdReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcIdReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcIdReg_Enabled), 5, 0), true);
      edtAcFecMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcFecMov_Enabled), 5, 0), true);
      edtAcTipMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcTipMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcTipMov_Enabled), 5, 0), true);
      edtAcEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcEmprCod_Enabled), 5, 0), true);
      edtAcBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcBarCod_Enabled), 5, 0), true);
      edtAcBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcBarReo_Enabled), 5, 0), true);
      edtAcBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcBarPar_Enabled), 5, 0), true);
      edtAcBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcBarPie_Enabled), 5, 0), true);
      edtAcPieHija_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcPieHija_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcPieHija_Enabled), 5, 0), true);
      edtAcSitReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcSitReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcSitReg_Enabled), 5, 0), true);
      edtAcFoNuCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcFoNuCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcFoNuCo_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1BK1510( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1BK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrincaca", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11306AcIdReg", GXutil.ltrim( localUtil.ntoc( Z11306AcIdReg, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11308AcFecMov", localUtil.ttoc( Z11308AcFecMov, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11307AcTipMov", GXutil.rtrim( Z11307AcTipMov));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11313AcEmprCod", GXutil.rtrim( Z11313AcEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11309AcBarCod", GXutil.ltrim( localUtil.ntoc( Z11309AcBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11310AcBarReo", GXutil.ltrim( localUtil.ntoc( Z11310AcBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11311AcBarPar", GXutil.rtrim( Z11311AcBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11314AcBarPie", GXutil.rtrim( Z11314AcBarPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11315AcPieHija", GXutil.rtrim( Z11315AcPieHija));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11312AcSitReg", GXutil.ltrim( localUtil.ntoc( Z11312AcSitReg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11316AcFoNuCo", GXutil.ltrim( localUtil.ntoc( Z11316AcFoNuCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrincaca", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrIncACA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estructura - TRINCACA (Inciden", "") ;
   }

   public void initializeNonKey1BK1510( )
   {
      A11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      n11308AcFecMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11308AcFecMov", localUtil.ttoc( A11308AcFecMov, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11307AcTipMov = "" ;
      n11307AcTipMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11307AcTipMov", A11307AcTipMov);
      A11313AcEmprCod = "" ;
      n11313AcEmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11313AcEmprCod", A11313AcEmprCod);
      A11309AcBarCod = 0 ;
      n11309AcBarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11309AcBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11309AcBarCod), 8, 0));
      A11310AcBarReo = (byte)(0) ;
      n11310AcBarReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11310AcBarReo", GXutil.str( A11310AcBarReo, 1, 0));
      A11311AcBarPar = "" ;
      n11311AcBarPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11311AcBarPar", A11311AcBarPar);
      A11314AcBarPie = "" ;
      n11314AcBarPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11314AcBarPie", A11314AcBarPie);
      A11315AcPieHija = "" ;
      n11315AcPieHija = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11315AcPieHija", A11315AcPieHija);
      A11312AcSitReg = (byte)(0) ;
      n11312AcSitReg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11312AcSitReg", GXutil.str( A11312AcSitReg, 1, 0));
      A11316AcFoNuCo = 0 ;
      n11316AcFoNuCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11316AcFoNuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11316AcFoNuCo), 6, 0));
      Z11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      Z11307AcTipMov = "" ;
      Z11313AcEmprCod = "" ;
      Z11309AcBarCod = 0 ;
      Z11310AcBarReo = (byte)(0) ;
      Z11311AcBarPar = "" ;
      Z11314AcBarPie = "" ;
      Z11315AcPieHija = "" ;
      Z11312AcSitReg = (byte)(0) ;
      Z11316AcFoNuCo = 0 ;
   }

   public void initAll1BK1510( )
   {
      A11306AcIdReg = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11306AcIdReg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11306AcIdReg), 8, 0));
      initializeNonKey1BK1510( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251924375", true, true);
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
      httpContext.AddJavascriptSource("ttrincaca.js", "?20261251924375", false, true);
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
      edtAcIdReg_Internalname = "ACIDREG" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtAcFecMov_Internalname = "ACFECMOV" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtAcTipMov_Internalname = "ACTIPMOV" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAcEmprCod_Internalname = "ACEMPRCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAcBarCod_Internalname = "ACBARCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAcBarReo_Internalname = "ACBARREO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAcBarPar_Internalname = "ACBARPAR" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAcBarPie_Internalname = "ACBARPIE" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAcPieHija_Internalname = "ACPIEHIJA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAcSitReg_Internalname = "ACSITREG" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAcFoNuCo_Internalname = "ACFONUCO" ;
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
      Form.setCaption( httpContext.getMessage( "Estructura - TRINCACA (Inciden", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAcFoNuCo_Jsonclick = "" ;
      edtAcFoNuCo_Backcolor = (int)(0xFFFFFF) ;
      edtAcFoNuCo_Enabled = 1 ;
      edtAcSitReg_Jsonclick = "" ;
      edtAcSitReg_Backcolor = (int)(0xFFFFFF) ;
      edtAcSitReg_Enabled = 1 ;
      edtAcPieHija_Jsonclick = "" ;
      edtAcPieHija_Backcolor = (int)(0xFFFFFF) ;
      edtAcPieHija_Enabled = 1 ;
      edtAcBarPie_Jsonclick = "" ;
      edtAcBarPie_Backcolor = (int)(0xFFFFFF) ;
      edtAcBarPie_Enabled = 1 ;
      edtAcBarPar_Jsonclick = "" ;
      edtAcBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtAcBarPar_Enabled = 1 ;
      edtAcBarReo_Jsonclick = "" ;
      edtAcBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtAcBarReo_Enabled = 1 ;
      edtAcBarCod_Jsonclick = "" ;
      edtAcBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtAcBarCod_Enabled = 1 ;
      edtAcEmprCod_Jsonclick = "" ;
      edtAcEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtAcEmprCod_Enabled = 1 ;
      edtAcTipMov_Jsonclick = "" ;
      edtAcTipMov_Backcolor = (int)(0xFFFFFF) ;
      edtAcTipMov_Enabled = 1 ;
      edtAcFecMov_Jsonclick = "" ;
      edtAcFecMov_Backcolor = (int)(0xFFFFFF) ;
      edtAcFecMov_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAcIdReg_Jsonclick = "" ;
      edtAcIdReg_Backcolor = (int)(0xFFFFFF) ;
      edtAcIdReg_Enabled = 1 ;
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
      GX_FocusControl = edtAcFecMov_Internalname ;
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

   public void valid_Acidreg( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11308AcFecMov", localUtil.ttoc( A11308AcFecMov, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11307AcTipMov", GXutil.rtrim( A11307AcTipMov));
      httpContext.ajax_rsp_assign_attri("", false, "A11313AcEmprCod", GXutil.rtrim( A11313AcEmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A11309AcBarCod", GXutil.ltrim( localUtil.ntoc( A11309AcBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11310AcBarReo", GXutil.ltrim( localUtil.ntoc( A11310AcBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11311AcBarPar", GXutil.rtrim( A11311AcBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A11314AcBarPie", GXutil.rtrim( A11314AcBarPie));
      httpContext.ajax_rsp_assign_attri("", false, "A11315AcPieHija", GXutil.rtrim( A11315AcPieHija));
      httpContext.ajax_rsp_assign_attri("", false, "A11312AcSitReg", GXutil.ltrim( localUtil.ntoc( A11312AcSitReg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11316AcFoNuCo", GXutil.ltrim( localUtil.ntoc( A11316AcFoNuCo, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11306AcIdReg", GXutil.ltrim( localUtil.ntoc( Z11306AcIdReg, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11308AcFecMov", localUtil.ttoc( Z11308AcFecMov, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11307AcTipMov", GXutil.rtrim( Z11307AcTipMov));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11313AcEmprCod", GXutil.rtrim( Z11313AcEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11309AcBarCod", GXutil.ltrim( localUtil.ntoc( Z11309AcBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11310AcBarReo", GXutil.ltrim( localUtil.ntoc( Z11310AcBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11311AcBarPar", GXutil.rtrim( Z11311AcBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11314AcBarPie", GXutil.rtrim( Z11314AcBarPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11315AcPieHija", GXutil.rtrim( Z11315AcPieHija));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11312AcSitReg", GXutil.ltrim( localUtil.ntoc( Z11312AcSitReg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11316AcFoNuCo", GXutil.ltrim( localUtil.ntoc( Z11316AcFoNuCo, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_ACIDREG","{handler:'valid_Acidreg',iparms:[{av:'A11306AcIdReg',fld:'ACIDREG',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ACIDREG",",oparms:[{av:'A11308AcFecMov',fld:'ACFECMOV',pic:'99/99/99 99:99'},{av:'A11307AcTipMov',fld:'ACTIPMOV',pic:''},{av:'A11313AcEmprCod',fld:'ACEMPRCOD',pic:''},{av:'A11309AcBarCod',fld:'ACBARCOD',pic:'ZZZZZZZ9'},{av:'A11310AcBarReo',fld:'ACBARREO',pic:'9'},{av:'A11311AcBarPar',fld:'ACBARPAR',pic:''},{av:'A11314AcBarPie',fld:'ACBARPIE',pic:''},{av:'A11315AcPieHija',fld:'ACPIEHIJA',pic:''},{av:'A11312AcSitReg',fld:'ACSITREG',pic:'9'},{av:'A11316AcFoNuCo',fld:'ACFONUCO',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z11306AcIdReg'},{av:'Z11308AcFecMov'},{av:'Z11307AcTipMov'},{av:'Z11313AcEmprCod'},{av:'Z11309AcBarCod'},{av:'Z11310AcBarReo'},{av:'Z11311AcBarPar'},{av:'Z11314AcBarPie'},{av:'Z11315AcPieHija'},{av:'Z11312AcSitReg'},{av:'Z11316AcFoNuCo'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      Z11307AcTipMov = "" ;
      Z11313AcEmprCod = "" ;
      Z11311AcBarPar = "" ;
      Z11314AcBarPie = "" ;
      Z11315AcPieHija = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock3_Jsonclick = "" ;
      A11307AcTipMov = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11313AcEmprCod = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11311AcBarPar = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11314AcBarPie = "" ;
      lblTextblock9_Jsonclick = "" ;
      A11315AcPieHija = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
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
      T01BK4_A11306AcIdReg = new int[1] ;
      T01BK4_A11308AcFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01BK4_n11308AcFecMov = new boolean[] {false} ;
      T01BK4_A11307AcTipMov = new String[] {""} ;
      T01BK4_n11307AcTipMov = new boolean[] {false} ;
      T01BK4_A11313AcEmprCod = new String[] {""} ;
      T01BK4_n11313AcEmprCod = new boolean[] {false} ;
      T01BK4_A11309AcBarCod = new int[1] ;
      T01BK4_n11309AcBarCod = new boolean[] {false} ;
      T01BK4_A11310AcBarReo = new byte[1] ;
      T01BK4_n11310AcBarReo = new boolean[] {false} ;
      T01BK4_A11311AcBarPar = new String[] {""} ;
      T01BK4_n11311AcBarPar = new boolean[] {false} ;
      T01BK4_A11314AcBarPie = new String[] {""} ;
      T01BK4_n11314AcBarPie = new boolean[] {false} ;
      T01BK4_A11315AcPieHija = new String[] {""} ;
      T01BK4_n11315AcPieHija = new boolean[] {false} ;
      T01BK4_A11312AcSitReg = new byte[1] ;
      T01BK4_n11312AcSitReg = new boolean[] {false} ;
      T01BK4_A11316AcFoNuCo = new int[1] ;
      T01BK4_n11316AcFoNuCo = new boolean[] {false} ;
      T01BK5_A11306AcIdReg = new int[1] ;
      T01BK3_A11306AcIdReg = new int[1] ;
      T01BK3_A11308AcFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01BK3_n11308AcFecMov = new boolean[] {false} ;
      T01BK3_A11307AcTipMov = new String[] {""} ;
      T01BK3_n11307AcTipMov = new boolean[] {false} ;
      T01BK3_A11313AcEmprCod = new String[] {""} ;
      T01BK3_n11313AcEmprCod = new boolean[] {false} ;
      T01BK3_A11309AcBarCod = new int[1] ;
      T01BK3_n11309AcBarCod = new boolean[] {false} ;
      T01BK3_A11310AcBarReo = new byte[1] ;
      T01BK3_n11310AcBarReo = new boolean[] {false} ;
      T01BK3_A11311AcBarPar = new String[] {""} ;
      T01BK3_n11311AcBarPar = new boolean[] {false} ;
      T01BK3_A11314AcBarPie = new String[] {""} ;
      T01BK3_n11314AcBarPie = new boolean[] {false} ;
      T01BK3_A11315AcPieHija = new String[] {""} ;
      T01BK3_n11315AcPieHija = new boolean[] {false} ;
      T01BK3_A11312AcSitReg = new byte[1] ;
      T01BK3_n11312AcSitReg = new boolean[] {false} ;
      T01BK3_A11316AcFoNuCo = new int[1] ;
      T01BK3_n11316AcFoNuCo = new boolean[] {false} ;
      sMode1510 = "" ;
      T01BK6_A11306AcIdReg = new int[1] ;
      T01BK7_A11306AcIdReg = new int[1] ;
      T01BK2_A11306AcIdReg = new int[1] ;
      T01BK2_A11308AcFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01BK2_n11308AcFecMov = new boolean[] {false} ;
      T01BK2_A11307AcTipMov = new String[] {""} ;
      T01BK2_n11307AcTipMov = new boolean[] {false} ;
      T01BK2_A11313AcEmprCod = new String[] {""} ;
      T01BK2_n11313AcEmprCod = new boolean[] {false} ;
      T01BK2_A11309AcBarCod = new int[1] ;
      T01BK2_n11309AcBarCod = new boolean[] {false} ;
      T01BK2_A11310AcBarReo = new byte[1] ;
      T01BK2_n11310AcBarReo = new boolean[] {false} ;
      T01BK2_A11311AcBarPar = new String[] {""} ;
      T01BK2_n11311AcBarPar = new boolean[] {false} ;
      T01BK2_A11314AcBarPie = new String[] {""} ;
      T01BK2_n11314AcBarPie = new boolean[] {false} ;
      T01BK2_A11315AcPieHija = new String[] {""} ;
      T01BK2_n11315AcPieHija = new boolean[] {false} ;
      T01BK2_A11312AcSitReg = new byte[1] ;
      T01BK2_n11312AcSitReg = new boolean[] {false} ;
      T01BK2_A11316AcFoNuCo = new int[1] ;
      T01BK2_n11316AcFoNuCo = new boolean[] {false} ;
      T01BK9_A11306AcIdReg = new int[1] ;
      T01BK12_A11306AcIdReg = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      ZZ11307AcTipMov = "" ;
      ZZ11313AcEmprCod = "" ;
      ZZ11311AcBarPar = "" ;
      ZZ11314AcBarPie = "" ;
      ZZ11315AcPieHija = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrincaca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrincaca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrincaca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrincaca__default(),
         new Object[] {
             new Object[] {
            T01BK2_A11306AcIdReg, T01BK2_A11308AcFecMov, T01BK2_n11308AcFecMov, T01BK2_A11307AcTipMov, T01BK2_n11307AcTipMov, T01BK2_A11313AcEmprCod, T01BK2_n11313AcEmprCod, T01BK2_A11309AcBarCod, T01BK2_n11309AcBarCod, T01BK2_A11310AcBarReo,
            T01BK2_n11310AcBarReo, T01BK2_A11311AcBarPar, T01BK2_n11311AcBarPar, T01BK2_A11314AcBarPie, T01BK2_n11314AcBarPie, T01BK2_A11315AcPieHija, T01BK2_n11315AcPieHija, T01BK2_A11312AcSitReg, T01BK2_n11312AcSitReg, T01BK2_A11316AcFoNuCo,
            T01BK2_n11316AcFoNuCo
            }
            , new Object[] {
            T01BK3_A11306AcIdReg, T01BK3_A11308AcFecMov, T01BK3_n11308AcFecMov, T01BK3_A11307AcTipMov, T01BK3_n11307AcTipMov, T01BK3_A11313AcEmprCod, T01BK3_n11313AcEmprCod, T01BK3_A11309AcBarCod, T01BK3_n11309AcBarCod, T01BK3_A11310AcBarReo,
            T01BK3_n11310AcBarReo, T01BK3_A11311AcBarPar, T01BK3_n11311AcBarPar, T01BK3_A11314AcBarPie, T01BK3_n11314AcBarPie, T01BK3_A11315AcPieHija, T01BK3_n11315AcPieHija, T01BK3_A11312AcSitReg, T01BK3_n11312AcSitReg, T01BK3_A11316AcFoNuCo,
            T01BK3_n11316AcFoNuCo
            }
            , new Object[] {
            T01BK4_A11306AcIdReg, T01BK4_A11308AcFecMov, T01BK4_n11308AcFecMov, T01BK4_A11307AcTipMov, T01BK4_n11307AcTipMov, T01BK4_A11313AcEmprCod, T01BK4_n11313AcEmprCod, T01BK4_A11309AcBarCod, T01BK4_n11309AcBarCod, T01BK4_A11310AcBarReo,
            T01BK4_n11310AcBarReo, T01BK4_A11311AcBarPar, T01BK4_n11311AcBarPar, T01BK4_A11314AcBarPie, T01BK4_n11314AcBarPie, T01BK4_A11315AcPieHija, T01BK4_n11315AcPieHija, T01BK4_A11312AcSitReg, T01BK4_n11312AcSitReg, T01BK4_A11316AcFoNuCo,
            T01BK4_n11316AcFoNuCo
            }
            , new Object[] {
            T01BK5_A11306AcIdReg
            }
            , new Object[] {
            T01BK6_A11306AcIdReg
            }
            , new Object[] {
            T01BK7_A11306AcIdReg
            }
            , new Object[] {
            }
            , new Object[] {
            T01BK9_A11306AcIdReg
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BK12_A11306AcIdReg
            }
         }
      );
   }

   private byte Z11310AcBarReo ;
   private byte Z11312AcSitReg ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11310AcBarReo ;
   private byte A11312AcSitReg ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11310AcBarReo ;
   private byte ZZ11312AcSitReg ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1510 ;
   private short nIsDirty_1510 ;
   private int Z11306AcIdReg ;
   private int Z11309AcBarCod ;
   private int Z11316AcFoNuCo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A11306AcIdReg ;
   private int edtAcIdReg_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAcFecMov_Enabled ;
   private int edtAcTipMov_Enabled ;
   private int edtAcEmprCod_Enabled ;
   private int A11309AcBarCod ;
   private int edtAcBarCod_Enabled ;
   private int edtAcBarReo_Enabled ;
   private int edtAcBarPar_Enabled ;
   private int edtAcBarPie_Enabled ;
   private int edtAcPieHija_Enabled ;
   private int edtAcSitReg_Enabled ;
   private int A11316AcFoNuCo ;
   private int edtAcFoNuCo_Enabled ;
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
   private int edtAcFoNuCo_Backcolor ;
   private int edtAcSitReg_Backcolor ;
   private int edtAcPieHija_Backcolor ;
   private int edtAcBarPie_Backcolor ;
   private int edtAcBarPar_Backcolor ;
   private int edtAcBarReo_Backcolor ;
   private int edtAcBarCod_Backcolor ;
   private int edtAcEmprCod_Backcolor ;
   private int edtAcTipMov_Backcolor ;
   private int edtAcFecMov_Backcolor ;
   private int edtAcIdReg_Backcolor ;
   private int ZZ11306AcIdReg ;
   private int ZZ11309AcBarCod ;
   private int ZZ11316AcFoNuCo ;
   private String sPrefix ;
   private String Z11307AcTipMov ;
   private String Z11313AcEmprCod ;
   private String Z11311AcBarPar ;
   private String Z11314AcBarPie ;
   private String Z11315AcPieHija ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAcIdReg_Internalname ;
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
   private String edtAcIdReg_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtAcFecMov_Internalname ;
   private String edtAcFecMov_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtAcTipMov_Internalname ;
   private String A11307AcTipMov ;
   private String edtAcTipMov_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAcEmprCod_Internalname ;
   private String A11313AcEmprCod ;
   private String edtAcEmprCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAcBarCod_Internalname ;
   private String edtAcBarCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAcBarReo_Internalname ;
   private String edtAcBarReo_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAcBarPar_Internalname ;
   private String A11311AcBarPar ;
   private String edtAcBarPar_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAcBarPie_Internalname ;
   private String A11314AcBarPie ;
   private String edtAcBarPie_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAcPieHija_Internalname ;
   private String A11315AcPieHija ;
   private String edtAcPieHija_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAcSitReg_Internalname ;
   private String edtAcSitReg_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAcFoNuCo_Internalname ;
   private String edtAcFoNuCo_Jsonclick ;
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
   private String sMode1510 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ11307AcTipMov ;
   private String ZZ11313AcEmprCod ;
   private String ZZ11311AcBarPar ;
   private String ZZ11314AcBarPie ;
   private String ZZ11315AcPieHija ;
   private java.util.Date Z11308AcFecMov ;
   private java.util.Date A11308AcFecMov ;
   private java.util.Date ZZ11308AcFecMov ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11308AcFecMov ;
   private boolean n11307AcTipMov ;
   private boolean n11313AcEmprCod ;
   private boolean n11309AcBarCod ;
   private boolean n11310AcBarReo ;
   private boolean n11311AcBarPar ;
   private boolean n11314AcBarPie ;
   private boolean n11315AcPieHija ;
   private boolean n11312AcSitReg ;
   private boolean n11316AcFoNuCo ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01BK4_A11306AcIdReg ;
   private java.util.Date[] T01BK4_A11308AcFecMov ;
   private boolean[] T01BK4_n11308AcFecMov ;
   private String[] T01BK4_A11307AcTipMov ;
   private boolean[] T01BK4_n11307AcTipMov ;
   private String[] T01BK4_A11313AcEmprCod ;
   private boolean[] T01BK4_n11313AcEmprCod ;
   private int[] T01BK4_A11309AcBarCod ;
   private boolean[] T01BK4_n11309AcBarCod ;
   private byte[] T01BK4_A11310AcBarReo ;
   private boolean[] T01BK4_n11310AcBarReo ;
   private String[] T01BK4_A11311AcBarPar ;
   private boolean[] T01BK4_n11311AcBarPar ;
   private String[] T01BK4_A11314AcBarPie ;
   private boolean[] T01BK4_n11314AcBarPie ;
   private String[] T01BK4_A11315AcPieHija ;
   private boolean[] T01BK4_n11315AcPieHija ;
   private byte[] T01BK4_A11312AcSitReg ;
   private boolean[] T01BK4_n11312AcSitReg ;
   private int[] T01BK4_A11316AcFoNuCo ;
   private boolean[] T01BK4_n11316AcFoNuCo ;
   private int[] T01BK5_A11306AcIdReg ;
   private int[] T01BK3_A11306AcIdReg ;
   private java.util.Date[] T01BK3_A11308AcFecMov ;
   private boolean[] T01BK3_n11308AcFecMov ;
   private String[] T01BK3_A11307AcTipMov ;
   private boolean[] T01BK3_n11307AcTipMov ;
   private String[] T01BK3_A11313AcEmprCod ;
   private boolean[] T01BK3_n11313AcEmprCod ;
   private int[] T01BK3_A11309AcBarCod ;
   private boolean[] T01BK3_n11309AcBarCod ;
   private byte[] T01BK3_A11310AcBarReo ;
   private boolean[] T01BK3_n11310AcBarReo ;
   private String[] T01BK3_A11311AcBarPar ;
   private boolean[] T01BK3_n11311AcBarPar ;
   private String[] T01BK3_A11314AcBarPie ;
   private boolean[] T01BK3_n11314AcBarPie ;
   private String[] T01BK3_A11315AcPieHija ;
   private boolean[] T01BK3_n11315AcPieHija ;
   private byte[] T01BK3_A11312AcSitReg ;
   private boolean[] T01BK3_n11312AcSitReg ;
   private int[] T01BK3_A11316AcFoNuCo ;
   private boolean[] T01BK3_n11316AcFoNuCo ;
   private int[] T01BK6_A11306AcIdReg ;
   private int[] T01BK7_A11306AcIdReg ;
   private int[] T01BK2_A11306AcIdReg ;
   private java.util.Date[] T01BK2_A11308AcFecMov ;
   private boolean[] T01BK2_n11308AcFecMov ;
   private String[] T01BK2_A11307AcTipMov ;
   private boolean[] T01BK2_n11307AcTipMov ;
   private String[] T01BK2_A11313AcEmprCod ;
   private boolean[] T01BK2_n11313AcEmprCod ;
   private int[] T01BK2_A11309AcBarCod ;
   private boolean[] T01BK2_n11309AcBarCod ;
   private byte[] T01BK2_A11310AcBarReo ;
   private boolean[] T01BK2_n11310AcBarReo ;
   private String[] T01BK2_A11311AcBarPar ;
   private boolean[] T01BK2_n11311AcBarPar ;
   private String[] T01BK2_A11314AcBarPie ;
   private boolean[] T01BK2_n11314AcBarPie ;
   private String[] T01BK2_A11315AcPieHija ;
   private boolean[] T01BK2_n11315AcPieHija ;
   private byte[] T01BK2_A11312AcSitReg ;
   private boolean[] T01BK2_n11312AcSitReg ;
   private int[] T01BK2_A11316AcFoNuCo ;
   private boolean[] T01BK2_n11316AcFoNuCo ;
   private int[] T01BK9_A11306AcIdReg ;
   private int[] T01BK12_A11306AcIdReg ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrincaca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrincaca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrincaca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrincaca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BK2", "SELECT IAIdReg, IAFecMov, IATipMov, IAEmpCod, IABarCod, IABarReo, IABarPar, IABarPie, IaPieHija, IASitReg, IAFoColNu FROM VTXTRINCACA WHERE IAIdReg = ?  FOR UPDATE OF IAFecMov, IATipMov, IAEmpCod, IABarCod, IABarReo, IABarPar, IABarPie, IaPieHija, IASitReg, IAFoColNu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BK3", "SELECT IAIdReg, IAFecMov, IATipMov, IAEmpCod, IABarCod, IABarReo, IABarPar, IABarPie, IaPieHija, IASitReg, IAFoColNu FROM VTXTRINCACA WHERE IAIdReg = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BK4", "SELECT /*+ FIRST_ROWS(100) */ TM1.IAIdReg, TM1.IAFecMov, TM1.IATipMov, TM1.IAEmpCod, TM1.IABarCod, TM1.IABarReo, TM1.IABarPar, TM1.IABarPie, TM1.IaPieHija, TM1.IASitReg, TM1.IAFoColNu FROM VTXTRINCACA TM1 WHERE TM1.IAIdReg = ? ORDER BY TM1.IAIdReg ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BK5", "SELECT /*+ FIRST_ROWS(1) */ IAIdReg FROM VTXTRINCACA WHERE IAIdReg = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BK6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ IAIdReg FROM VTXTRINCACA WHERE ( IAIdReg > ?) ORDER BY IAIdReg) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BK7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ IAIdReg FROM VTXTRINCACA WHERE ( IAIdReg < ?) ORDER BY IAIdReg DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BK8", "INSERT INTO VTXTRINCACA(IAFecMov, IATipMov, IAEmpCod, IABarCod, IABarReo, IABarPar, IABarPie, IaPieHija, IASitReg, IAFoColNu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXTRINCACA")
         ,new ForEachCursor("T01BK9", "SELECT IAIdReg.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BK10", "UPDATE VTXTRINCACA SET IAFecMov=?, IATipMov=?, IAEmpCod=?, IABarCod=?, IABarReo=?, IABarPar=?, IABarPie=?, IaPieHija=?, IASitReg=?, IAFoColNu=?  WHERE IAIdReg = ?", GX_NOMASK, "VTXTRINCACA")
         ,new UpdateCursor("T01BK11", "DELETE FROM VTXTRINCACA  WHERE IAIdReg = ?", GX_NOMASK, "VTXTRINCACA")
         ,new ForEachCursor("T01BK12", "SELECT /*+ FIRST_ROWS(100) */ IAIdReg FROM VTXTRINCACA ORDER BY IAIdReg ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               stmt.setInt(11, ((Number) parms[20]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

