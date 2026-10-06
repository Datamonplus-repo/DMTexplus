package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class topbcvto_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OP_FechaVto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBCVtoNOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public topbcvto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public topbcvto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( topbcvto_impl.class ));
   }

   public topbcvto_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TOPBCVTO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "NumeroOP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCVtoNOP_Internalname, GXutil.ltrim( localUtil.ntoc( A13516BCVtoNOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCVtoNOP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13516BCVtoNOP), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13516BCVtoNOP), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCVtoNOP_Jsonclick, 0, "", "", "", "", "", 1, edtBCVtoNOP_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCFecVto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCFecVto_Internalname, localUtil.format(A13510BCFecVto, "99/99/99"), localUtil.format( A13510BCFecVto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCFecVto_Jsonclick, 0, "", "", "", "", "", 1, edtBCFecVto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCVTO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCFecVto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCFecVto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOPBCVTO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Procesado", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCVtoProce_Internalname, GXutil.ltrim( localUtil.ntoc( A13511BCVtoProce, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCVtoProce_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13511BCVtoProce), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13511BCVtoProce), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCVtoProce_Jsonclick, 0, "", "", "", "", "", 1, edtBCVtoProce_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Error", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCVtoError_Internalname, GXutil.ltrim( localUtil.ntoc( A13512BCVtoError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCVtoError_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13512BCVtoError), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13512BCVtoError), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCVtoError_Jsonclick, 0, "", "", "", "", "", 1, edtBCVtoError_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripción error", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCVtoDescE_Internalname, A13513BCVtoDescE, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", (short)(0), 1, edtBCVtoDescE_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha y hora error", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCVtoFecEr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCVtoFecEr_Internalname, localUtil.ttoc( A13514BCVtoFecEr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13514BCVtoFecEr, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCVtoFecEr_Jsonclick, 0, "", "", "", "", "", 1, edtBCVtoFecEr_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCVTO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCVtoFecEr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCVtoFecEr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOPBCVTO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Pila error", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCVtoPilae_Internalname, A13515BCVtoPilae, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", (short)(0), 1, edtBCVtoPilae_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TOPBCVTO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCVTO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TOPBCVTO.htm");
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
      e111OG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13516BCVtoNOP = (int)(localUtil.ctol( httpContext.cgiGet( "Z13516BCVtoNOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13510BCFecVto = localUtil.ctod( httpContext.cgiGet( "Z13510BCFecVto"), 0) ;
            Z13511BCVtoProce = (short)(localUtil.ctol( httpContext.cgiGet( "Z13511BCVtoProce"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13512BCVtoError = (short)(localUtil.ctol( httpContext.cgiGet( "Z13512BCVtoError"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13513BCVtoDescE = httpContext.cgiGet( "Z13513BCVtoDescE") ;
            Z13514BCVtoFecEr = localUtil.ctot( httpContext.cgiGet( "Z13514BCVtoFecEr"), 0) ;
            Z13515BCVtoPilae = httpContext.cgiGet( "Z13515BCVtoPilae") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCVtoNOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCVtoNOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCVTONOP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCVtoNOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13516BCVtoNOP = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
            }
            else
            {
               A13516BCVtoNOP = (int)(localUtil.ctol( httpContext.cgiGet( edtBCVtoNOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtBCFecVto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BCFECVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCFecVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13510BCFecVto = GXutil.nullDate() ;
               n13510BCFecVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13510BCFecVto", localUtil.format(A13510BCFecVto, "99/99/99"));
            }
            else
            {
               A13510BCFecVto = localUtil.ctod( httpContext.cgiGet( edtBCFecVto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13510BCFecVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13510BCFecVto", localUtil.format(A13510BCFecVto, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCVtoProce_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCVtoProce_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCVTOPROCE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCVtoProce_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13511BCVtoProce = (short)(0) ;
               n13511BCVtoProce = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13511BCVtoProce", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13511BCVtoProce), 4, 0));
            }
            else
            {
               A13511BCVtoProce = (short)(localUtil.ctol( httpContext.cgiGet( edtBCVtoProce_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13511BCVtoProce = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13511BCVtoProce", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13511BCVtoProce), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCVtoError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCVtoError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCVTOERROR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCVtoError_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13512BCVtoError = (short)(0) ;
               n13512BCVtoError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13512BCVtoError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13512BCVtoError), 4, 0));
            }
            else
            {
               A13512BCVtoError = (short)(localUtil.ctol( httpContext.cgiGet( edtBCVtoError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13512BCVtoError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13512BCVtoError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13512BCVtoError), 4, 0));
            }
            A13513BCVtoDescE = httpContext.cgiGet( edtBCVtoDescE_Internalname) ;
            n13513BCVtoDescE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13513BCVtoDescE", A13513BCVtoDescE);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBCVtoFecEr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BCVTOFECER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCVtoFecEr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13514BCVtoFecEr = GXutil.resetTime( GXutil.nullDate() );
               n13514BCVtoFecEr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13514BCVtoFecEr", localUtil.ttoc( A13514BCVtoFecEr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13514BCVtoFecEr = localUtil.ctot( httpContext.cgiGet( edtBCVtoFecEr_Internalname)) ;
               n13514BCVtoFecEr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13514BCVtoFecEr", localUtil.ttoc( A13514BCVtoFecEr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A13515BCVtoPilae = httpContext.cgiGet( edtBCVtoPilae_Internalname) ;
            n13515BCVtoPilae = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13515BCVtoPilae", A13515BCVtoPilae);
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
               A13516BCVtoNOP = (int)(GXutil.lval( httpContext.GetPar( "BCVtoNOP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
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
                        e111OG2 ();
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
            initAll1OG1848( ) ;
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
      disableAttributes1OG1848( ) ;
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

   public void confirm_1OG0( )
   {
      beforeValidate1OG1848( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OG1848( ) ;
         }
         else
         {
            checkExtendedTable1OG1848( ) ;
            if ( AnyError == 0 )
            {
               zm1OG1848( 2) ;
            }
            closeExtendedTableCursors1OG1848( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1OG0( ) ;
      }
   }

   public void resetCaption1OG0( )
   {
   }

   public void e111OG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      topbcvto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      topbcvto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      topbcvto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      topbcvto_impl.this.A396EmprCod = GXv_char2[0] ;
      topbcvto_impl.this.AV11EmprNom = GXv_char3[0] ;
      topbcvto_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1OG1848( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13510BCFecVto = T01OG3_A13510BCFecVto[0] ;
            Z13511BCVtoProce = T01OG3_A13511BCVtoProce[0] ;
            Z13512BCVtoError = T01OG3_A13512BCVtoError[0] ;
            Z13513BCVtoDescE = T01OG3_A13513BCVtoDescE[0] ;
            Z13514BCVtoFecEr = T01OG3_A13514BCVtoFecEr[0] ;
            Z13515BCVtoPilae = T01OG3_A13515BCVtoPilae[0] ;
         }
         else
         {
            Z13510BCFecVto = A13510BCFecVto ;
            Z13511BCVtoProce = A13511BCVtoProce ;
            Z13512BCVtoError = A13512BCVtoError ;
            Z13513BCVtoDescE = A13513BCVtoDescE ;
            Z13514BCVtoFecEr = A13514BCVtoFecEr ;
            Z13515BCVtoPilae = A13515BCVtoPilae ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13516BCVtoNOP = A13516BCVtoNOP ;
         Z13510BCFecVto = A13510BCFecVto ;
         Z13511BCVtoProce = A13511BCVtoProce ;
         Z13512BCVtoError = A13512BCVtoError ;
         Z13513BCVtoDescE = A13513BCVtoDescE ;
         Z13514BCVtoFecEr = A13514BCVtoFecEr ;
         Z13515BCVtoPilae = A13515BCVtoPilae ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TOPBCVTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01OG4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OG4_A407EmprNom[0] ;
      n407EmprNom = T01OG4_n407EmprNom[0] ;
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

   public void load1OG1848( )
   {
      /* Using cursor T01OG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13516BCVtoNOP)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1848 = (short)(1) ;
         A407EmprNom = T01OG5_A407EmprNom[0] ;
         n407EmprNom = T01OG5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13510BCFecVto = T01OG5_A13510BCFecVto[0] ;
         n13510BCFecVto = T01OG5_n13510BCFecVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13510BCFecVto", localUtil.format(A13510BCFecVto, "99/99/99"));
         A13511BCVtoProce = T01OG5_A13511BCVtoProce[0] ;
         n13511BCVtoProce = T01OG5_n13511BCVtoProce[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13511BCVtoProce", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13511BCVtoProce), 4, 0));
         A13512BCVtoError = T01OG5_A13512BCVtoError[0] ;
         n13512BCVtoError = T01OG5_n13512BCVtoError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13512BCVtoError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13512BCVtoError), 4, 0));
         A13513BCVtoDescE = T01OG5_A13513BCVtoDescE[0] ;
         n13513BCVtoDescE = T01OG5_n13513BCVtoDescE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13513BCVtoDescE", A13513BCVtoDescE);
         A13514BCVtoFecEr = T01OG5_A13514BCVtoFecEr[0] ;
         n13514BCVtoFecEr = T01OG5_n13514BCVtoFecEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13514BCVtoFecEr", localUtil.ttoc( A13514BCVtoFecEr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13515BCVtoPilae = T01OG5_A13515BCVtoPilae[0] ;
         n13515BCVtoPilae = T01OG5_n13515BCVtoPilae[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13515BCVtoPilae", A13515BCVtoPilae);
         zm1OG1848( -1) ;
      }
      pr_default.close(3);
      onLoadActions1OG1848( ) ;
   }

   public void onLoadActions1OG1848( )
   {
   }

   public void checkExtendedTable1OG1848( )
   {
      nIsDirty_1848 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1OG1848( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1OG1848( )
   {
      /* Using cursor T01OG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13516BCVtoNOP)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1848 = (short)(1) ;
      }
      else
      {
         RcdFound1848 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13516BCVtoNOP)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OG1848( 1) ;
         RcdFound1848 = (short)(1) ;
         A13516BCVtoNOP = T01OG3_A13516BCVtoNOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
         A13510BCFecVto = T01OG3_A13510BCFecVto[0] ;
         n13510BCFecVto = T01OG3_n13510BCFecVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13510BCFecVto", localUtil.format(A13510BCFecVto, "99/99/99"));
         A13511BCVtoProce = T01OG3_A13511BCVtoProce[0] ;
         n13511BCVtoProce = T01OG3_n13511BCVtoProce[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13511BCVtoProce", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13511BCVtoProce), 4, 0));
         A13512BCVtoError = T01OG3_A13512BCVtoError[0] ;
         n13512BCVtoError = T01OG3_n13512BCVtoError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13512BCVtoError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13512BCVtoError), 4, 0));
         A13513BCVtoDescE = T01OG3_A13513BCVtoDescE[0] ;
         n13513BCVtoDescE = T01OG3_n13513BCVtoDescE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13513BCVtoDescE", A13513BCVtoDescE);
         A13514BCVtoFecEr = T01OG3_A13514BCVtoFecEr[0] ;
         n13514BCVtoFecEr = T01OG3_n13514BCVtoFecEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13514BCVtoFecEr", localUtil.ttoc( A13514BCVtoFecEr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13515BCVtoPilae = T01OG3_A13515BCVtoPilae[0] ;
         n13515BCVtoPilae = T01OG3_n13515BCVtoPilae[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13515BCVtoPilae", A13515BCVtoPilae);
         Z396EmprCod = A396EmprCod ;
         Z13516BCVtoNOP = A13516BCVtoNOP ;
         sMode1848 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OG1848( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1848 = (short)(0) ;
            initializeNonKey1OG1848( ) ;
         }
         Gx_mode = sMode1848 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1848 = (short)(0) ;
         initializeNonKey1OG1848( ) ;
         sMode1848 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1848 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1OG1848( ) ;
      if ( RcdFound1848 == 0 )
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
      RcdFound1848 = (short)(0) ;
      /* Using cursor T01OG7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A13516BCVtoNOP), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01OG7_A13516BCVtoNOP[0] < A13516BCVtoNOP ) ) && ( GXutil.strcmp(T01OG7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01OG7_A13516BCVtoNOP[0] > A13516BCVtoNOP ) ) && ( GXutil.strcmp(T01OG7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13516BCVtoNOP = T01OG7_A13516BCVtoNOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
            RcdFound1848 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1848 = (short)(0) ;
      /* Using cursor T01OG8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A13516BCVtoNOP), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01OG8_A13516BCVtoNOP[0] > A13516BCVtoNOP ) ) && ( GXutil.strcmp(T01OG8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01OG8_A13516BCVtoNOP[0] < A13516BCVtoNOP ) ) && ( GXutil.strcmp(T01OG8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13516BCVtoNOP = T01OG8_A13516BCVtoNOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
            RcdFound1848 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OG1848( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBCVtoNOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OG1848( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1848 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13516BCVtoNOP != Z13516BCVtoNOP ) )
            {
               A13516BCVtoNOP = Z13516BCVtoNOP ;
               httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBCVtoNOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1OG1848( ) ;
               GX_FocusControl = edtBCVtoNOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13516BCVtoNOP != Z13516BCVtoNOP ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBCVtoNOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OG1848( ) ;
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
                  GX_FocusControl = edtBCVtoNOP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OG1848( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13516BCVtoNOP != Z13516BCVtoNOP ) )
      {
         A13516BCVtoNOP = Z13516BCVtoNOP ;
         httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBCVtoNOP_Internalname ;
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
      getKey1OG1848( ) ;
      if ( RcdFound1848 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13516BCVtoNOP != Z13516BCVtoNOP ) )
         {
            A13516BCVtoNOP = Z13516BCVtoNOP ;
            httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13516BCVtoNOP != Z13516BCVtoNOP ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "topbcvto");
      GX_FocusControl = edtBCFecVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1OG0( ) ;
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
      if ( RcdFound1848 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBCFecVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OG1848( ) ;
      if ( RcdFound1848 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFecVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OG1848( ) ;
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
      if ( RcdFound1848 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFecVto_Internalname ;
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
      if ( RcdFound1848 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFecVto_Internalname ;
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
      scanStart1OG1848( ) ;
      if ( RcdFound1848 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1848 != 0 )
         {
            scanNext1OG1848( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFecVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OG1848( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OG1848( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13516BCVtoNOP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCVT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z13510BCFecVto), GXutil.resetTime(T01OG2_A13510BCFecVto[0])) ) || ( Z13511BCVtoProce != T01OG2_A13511BCVtoProce[0] ) || ( Z13512BCVtoError != T01OG2_A13512BCVtoError[0] ) || ( GXutil.strcmp(Z13513BCVtoDescE, T01OG2_A13513BCVtoDescE[0]) != 0 ) || !( GXutil.dateCompare(Z13514BCVtoFecEr, T01OG2_A13514BCVtoFecEr[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13515BCVtoPilae, T01OG2_A13515BCVtoPilae[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13510BCFecVto), GXutil.resetTime(T01OG2_A13510BCFecVto[0])) ) )
            {
               GXutil.writeLogln("topbcvto:[seudo value changed for attri]"+"BCFecVto");
               GXutil.writeLogRaw("Old: ",Z13510BCFecVto);
               GXutil.writeLogRaw("Current: ",T01OG2_A13510BCFecVto[0]);
            }
            if ( Z13511BCVtoProce != T01OG2_A13511BCVtoProce[0] )
            {
               GXutil.writeLogln("topbcvto:[seudo value changed for attri]"+"BCVtoProce");
               GXutil.writeLogRaw("Old: ",Z13511BCVtoProce);
               GXutil.writeLogRaw("Current: ",T01OG2_A13511BCVtoProce[0]);
            }
            if ( Z13512BCVtoError != T01OG2_A13512BCVtoError[0] )
            {
               GXutil.writeLogln("topbcvto:[seudo value changed for attri]"+"BCVtoError");
               GXutil.writeLogRaw("Old: ",Z13512BCVtoError);
               GXutil.writeLogRaw("Current: ",T01OG2_A13512BCVtoError[0]);
            }
            if ( GXutil.strcmp(Z13513BCVtoDescE, T01OG2_A13513BCVtoDescE[0]) != 0 )
            {
               GXutil.writeLogln("topbcvto:[seudo value changed for attri]"+"BCVtoDescE");
               GXutil.writeLogRaw("Old: ",Z13513BCVtoDescE);
               GXutil.writeLogRaw("Current: ",T01OG2_A13513BCVtoDescE[0]);
            }
            if ( !( GXutil.dateCompare(Z13514BCVtoFecEr, T01OG2_A13514BCVtoFecEr[0]) ) )
            {
               GXutil.writeLogln("topbcvto:[seudo value changed for attri]"+"BCVtoFecEr");
               GXutil.writeLogRaw("Old: ",Z13514BCVtoFecEr);
               GXutil.writeLogRaw("Current: ",T01OG2_A13514BCVtoFecEr[0]);
            }
            if ( GXutil.strcmp(Z13515BCVtoPilae, T01OG2_A13515BCVtoPilae[0]) != 0 )
            {
               GXutil.writeLogln("topbcvto:[seudo value changed for attri]"+"BCVtoPilae");
               GXutil.writeLogRaw("Old: ",Z13515BCVtoPilae);
               GXutil.writeLogRaw("Current: ",T01OG2_A13515BCVtoPilae[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPBCVT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OG1848( )
   {
      beforeValidate1OG1848( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OG1848( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OG1848( 0) ;
         checkOptimisticConcurrency1OG1848( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OG1848( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OG1848( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OG9 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A13516BCVtoNOP), Boolean.valueOf(n13510BCFecVto), A13510BCFecVto, Boolean.valueOf(n13511BCVtoProce), Short.valueOf(A13511BCVtoProce), Boolean.valueOf(n13512BCVtoError), Short.valueOf(A13512BCVtoError), Boolean.valueOf(n13513BCVtoDescE), A13513BCVtoDescE, Boolean.valueOf(n13514BCVtoFecEr), A13514BCVtoFecEr, Boolean.valueOf(n13515BCVtoPilae), A13515BCVtoPilae, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCVT");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption1OG0( ) ;
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
            load1OG1848( ) ;
         }
         endLevel1OG1848( ) ;
      }
      closeExtendedTableCursors1OG1848( ) ;
   }

   public void update1OG1848( )
   {
      beforeValidate1OG1848( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OG1848( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OG1848( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OG1848( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OG1848( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OG10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n13510BCFecVto), A13510BCFecVto, Boolean.valueOf(n13511BCVtoProce), Short.valueOf(A13511BCVtoProce), Boolean.valueOf(n13512BCVtoError), Short.valueOf(A13512BCVtoError), Boolean.valueOf(n13513BCVtoDescE), A13513BCVtoDescE, Boolean.valueOf(n13514BCVtoFecEr), A13514BCVtoFecEr, Boolean.valueOf(n13515BCVtoPilae), A13515BCVtoPilae, A396EmprCod, Integer.valueOf(A13516BCVtoNOP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCVT");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCVT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OG1848( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1OG0( ) ;
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
         endLevel1OG1848( ) ;
      }
      closeExtendedTableCursors1OG1848( ) ;
   }

   public void deferredUpdate1OG1848( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OG1848( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OG1848( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OG1848( ) ;
         afterConfirm1OG1848( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OG1848( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OG11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13516BCVtoNOP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCVT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1848 == 0 )
                     {
                        initAll1OG1848( ) ;
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
                     resetCaption1OG0( ) ;
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
      sMode1848 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OG1848( ) ;
      Gx_mode = sMode1848 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OG1848( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OG1848( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OG1848( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "topbcvto");
         if ( AnyError == 0 )
         {
            confirmValues1OG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "topbcvto");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OG1848( )
   {
      /* Scan By routine */
      /* Using cursor T01OG12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1848 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1848 = (short)(1) ;
         A13516BCVtoNOP = T01OG12_A13516BCVtoNOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OG1848( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1848 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1848 = (short)(1) ;
         A13516BCVtoNOP = T01OG12_A13516BCVtoNOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
      }
   }

   public void scanEnd1OG1848( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1OG1848( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OG1848( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OG1848( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OG1848( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OG1848( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OG1848( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OG1848( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBCVtoNOP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCVtoNOP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCVtoNOP_Enabled), 5, 0), true);
      edtBCFecVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCFecVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCFecVto_Enabled), 5, 0), true);
      edtBCVtoProce_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCVtoProce_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCVtoProce_Enabled), 5, 0), true);
      edtBCVtoError_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCVtoError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCVtoError_Enabled), 5, 0), true);
      edtBCVtoDescE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCVtoDescE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCVtoDescE_Enabled), 5, 0), true);
      edtBCVtoFecEr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCVtoFecEr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCVtoFecEr_Enabled), 5, 0), true);
      edtBCVtoPilae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCVtoPilae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCVtoPilae_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1OG1848( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1OG0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.topbcvto", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13516BCVtoNOP", GXutil.ltrim( localUtil.ntoc( Z13516BCVtoNOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13510BCFecVto", localUtil.dtoc( Z13510BCFecVto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13511BCVtoProce", GXutil.ltrim( localUtil.ntoc( Z13511BCVtoProce, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13512BCVtoError", GXutil.ltrim( localUtil.ntoc( Z13512BCVtoError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13513BCVtoDescE", Z13513BCVtoDescE);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13514BCVtoFecEr", localUtil.ttoc( Z13514BCVtoFecEr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13515BCVtoPilae", Z13515BCVtoPilae);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.topbcvto", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TOPBCVTO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OP_FechaVto", "") ;
   }

   public void initializeNonKey1OG1848( )
   {
      A13510BCFecVto = GXutil.nullDate() ;
      n13510BCFecVto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13510BCFecVto", localUtil.format(A13510BCFecVto, "99/99/99"));
      A13511BCVtoProce = (short)(0) ;
      n13511BCVtoProce = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13511BCVtoProce", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13511BCVtoProce), 4, 0));
      A13512BCVtoError = (short)(0) ;
      n13512BCVtoError = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13512BCVtoError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13512BCVtoError), 4, 0));
      A13513BCVtoDescE = "" ;
      n13513BCVtoDescE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13513BCVtoDescE", A13513BCVtoDescE);
      A13514BCVtoFecEr = GXutil.resetTime( GXutil.nullDate() );
      n13514BCVtoFecEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13514BCVtoFecEr", localUtil.ttoc( A13514BCVtoFecEr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13515BCVtoPilae = "" ;
      n13515BCVtoPilae = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13515BCVtoPilae", A13515BCVtoPilae);
      Z13510BCFecVto = GXutil.nullDate() ;
      Z13511BCVtoProce = (short)(0) ;
      Z13512BCVtoError = (short)(0) ;
      Z13513BCVtoDescE = "" ;
      Z13514BCVtoFecEr = GXutil.resetTime( GXutil.nullDate() );
      Z13515BCVtoPilae = "" ;
   }

   public void initAll1OG1848( )
   {
      A13516BCVtoNOP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13516BCVtoNOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13516BCVtoNOP), 8, 0));
      initializeNonKey1OG1848( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415104429", true, true);
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
      httpContext.AddJavascriptSource("topbcvto.js", "?202682415104429", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBCVtoNOP_Internalname = "BCVTONOP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBCFecVto_Internalname = "BCFECVTO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBCVtoProce_Internalname = "BCVTOPROCE" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBCVtoError_Internalname = "BCVTOERROR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBCVtoDescE_Internalname = "BCVTODESCE" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBCVtoFecEr_Internalname = "BCVTOFECER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBCVtoPilae_Internalname = "BCVTOPILAE" ;
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
      Form.setCaption( httpContext.getMessage( "OP_FechaVto", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBCVtoPilae_Backcolor = (int)(0xFFFFFF) ;
      edtBCVtoPilae_Enabled = 1 ;
      edtBCVtoFecEr_Jsonclick = "" ;
      edtBCVtoFecEr_Backcolor = (int)(0xFFFFFF) ;
      edtBCVtoFecEr_Enabled = 1 ;
      edtBCVtoDescE_Backcolor = (int)(0xFFFFFF) ;
      edtBCVtoDescE_Enabled = 1 ;
      edtBCVtoError_Jsonclick = "" ;
      edtBCVtoError_Backcolor = (int)(0xFFFFFF) ;
      edtBCVtoError_Enabled = 1 ;
      edtBCVtoProce_Jsonclick = "" ;
      edtBCVtoProce_Backcolor = (int)(0xFFFFFF) ;
      edtBCVtoProce_Enabled = 1 ;
      edtBCFecVto_Jsonclick = "" ;
      edtBCFecVto_Backcolor = (int)(0xFFFFFF) ;
      edtBCFecVto_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBCVtoNOP_Jsonclick = "" ;
      edtBCVtoNOP_Backcolor = (int)(0xFFFFFF) ;
      edtBCVtoNOP_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01OG13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OG13_A407EmprNom[0] ;
      n407EmprNom = T01OG13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtBCFecVto_Internalname ;
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

   public void valid_Bcvtonop( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13510BCFecVto", localUtil.format(A13510BCFecVto, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13511BCVtoProce", GXutil.ltrim( localUtil.ntoc( A13511BCVtoProce, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13512BCVtoError", GXutil.ltrim( localUtil.ntoc( A13512BCVtoError, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13513BCVtoDescE", A13513BCVtoDescE);
      httpContext.ajax_rsp_assign_attri("", false, "A13514BCVtoFecEr", localUtil.ttoc( A13514BCVtoFecEr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A13515BCVtoPilae", A13515BCVtoPilae);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13516BCVtoNOP", GXutil.ltrim( localUtil.ntoc( Z13516BCVtoNOP, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13510BCFecVto", localUtil.format(Z13510BCFecVto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13511BCVtoProce", GXutil.ltrim( localUtil.ntoc( Z13511BCVtoProce, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13512BCVtoError", GXutil.ltrim( localUtil.ntoc( Z13512BCVtoError, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13513BCVtoDescE", Z13513BCVtoDescE);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13514BCVtoFecEr", localUtil.ttoc( Z13514BCVtoFecEr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13515BCVtoPilae", Z13515BCVtoPilae);
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
      setEventMetadata("VALID_BCVTONOP","{handler:'valid_Bcvtonop',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13516BCVtoNOP',fld:'BCVTONOP',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BCVTONOP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13510BCFecVto',fld:'BCFECVTO',pic:''},{av:'A13511BCVtoProce',fld:'BCVTOPROCE',pic:'ZZZ9'},{av:'A13512BCVtoError',fld:'BCVTOERROR',pic:'ZZZ9'},{av:'A13513BCVtoDescE',fld:'BCVTODESCE',pic:''},{av:'A13514BCVtoFecEr',fld:'BCVTOFECER',pic:'99/99/99 99:99'},{av:'A13515BCVtoPilae',fld:'BCVTOPILAE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13516BCVtoNOP'},{av:'Z407EmprNom'},{av:'Z13510BCFecVto'},{av:'Z13511BCVtoProce'},{av:'Z13512BCVtoError'},{av:'Z13513BCVtoDescE'},{av:'Z13514BCVtoFecEr'},{av:'Z13515BCVtoPilae'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13510BCFecVto = GXutil.nullDate() ;
      Z13513BCVtoDescE = "" ;
      Z13514BCVtoFecEr = GXutil.resetTime( GXutil.nullDate() );
      Z13515BCVtoPilae = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A13510BCFecVto = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A13513BCVtoDescE = "" ;
      lblTextblock8_Jsonclick = "" ;
      A13514BCVtoFecEr = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock9_Jsonclick = "" ;
      A13515BCVtoPilae = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      T01OG4_A407EmprNom = new String[] {""} ;
      T01OG4_n407EmprNom = new boolean[] {false} ;
      T01OG5_A13516BCVtoNOP = new int[1] ;
      T01OG5_A407EmprNom = new String[] {""} ;
      T01OG5_n407EmprNom = new boolean[] {false} ;
      T01OG5_A13510BCFecVto = new java.util.Date[] {GXutil.nullDate()} ;
      T01OG5_n13510BCFecVto = new boolean[] {false} ;
      T01OG5_A13511BCVtoProce = new short[1] ;
      T01OG5_n13511BCVtoProce = new boolean[] {false} ;
      T01OG5_A13512BCVtoError = new short[1] ;
      T01OG5_n13512BCVtoError = new boolean[] {false} ;
      T01OG5_A13513BCVtoDescE = new String[] {""} ;
      T01OG5_n13513BCVtoDescE = new boolean[] {false} ;
      T01OG5_A13514BCVtoFecEr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OG5_n13514BCVtoFecEr = new boolean[] {false} ;
      T01OG5_A13515BCVtoPilae = new String[] {""} ;
      T01OG5_n13515BCVtoPilae = new boolean[] {false} ;
      T01OG5_A396EmprCod = new String[] {""} ;
      T01OG6_A396EmprCod = new String[] {""} ;
      T01OG6_A13516BCVtoNOP = new int[1] ;
      T01OG3_A13516BCVtoNOP = new int[1] ;
      T01OG3_A13510BCFecVto = new java.util.Date[] {GXutil.nullDate()} ;
      T01OG3_n13510BCFecVto = new boolean[] {false} ;
      T01OG3_A13511BCVtoProce = new short[1] ;
      T01OG3_n13511BCVtoProce = new boolean[] {false} ;
      T01OG3_A13512BCVtoError = new short[1] ;
      T01OG3_n13512BCVtoError = new boolean[] {false} ;
      T01OG3_A13513BCVtoDescE = new String[] {""} ;
      T01OG3_n13513BCVtoDescE = new boolean[] {false} ;
      T01OG3_A13514BCVtoFecEr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OG3_n13514BCVtoFecEr = new boolean[] {false} ;
      T01OG3_A13515BCVtoPilae = new String[] {""} ;
      T01OG3_n13515BCVtoPilae = new boolean[] {false} ;
      T01OG3_A396EmprCod = new String[] {""} ;
      sMode1848 = "" ;
      T01OG7_A396EmprCod = new String[] {""} ;
      T01OG7_A13516BCVtoNOP = new int[1] ;
      T01OG8_A396EmprCod = new String[] {""} ;
      T01OG8_A13516BCVtoNOP = new int[1] ;
      T01OG2_A13516BCVtoNOP = new int[1] ;
      T01OG2_A13510BCFecVto = new java.util.Date[] {GXutil.nullDate()} ;
      T01OG2_n13510BCFecVto = new boolean[] {false} ;
      T01OG2_A13511BCVtoProce = new short[1] ;
      T01OG2_n13511BCVtoProce = new boolean[] {false} ;
      T01OG2_A13512BCVtoError = new short[1] ;
      T01OG2_n13512BCVtoError = new boolean[] {false} ;
      T01OG2_A13513BCVtoDescE = new String[] {""} ;
      T01OG2_n13513BCVtoDescE = new boolean[] {false} ;
      T01OG2_A13514BCVtoFecEr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OG2_n13514BCVtoFecEr = new boolean[] {false} ;
      T01OG2_A13515BCVtoPilae = new String[] {""} ;
      T01OG2_n13515BCVtoPilae = new boolean[] {false} ;
      T01OG2_A396EmprCod = new String[] {""} ;
      T01OG12_A396EmprCod = new String[] {""} ;
      T01OG12_A13516BCVtoNOP = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01OG13_A407EmprNom = new String[] {""} ;
      T01OG13_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ13510BCFecVto = GXutil.nullDate() ;
      ZZ13513BCVtoDescE = "" ;
      ZZ13514BCVtoFecEr = GXutil.resetTime( GXutil.nullDate() );
      ZZ13515BCVtoPilae = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.topbcvto__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.topbcvto__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.topbcvto__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.topbcvto__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.topbcvto__default(),
         new Object[] {
             new Object[] {
            T01OG2_A13516BCVtoNOP, T01OG2_A13510BCFecVto, T01OG2_n13510BCFecVto, T01OG2_A13511BCVtoProce, T01OG2_n13511BCVtoProce, T01OG2_A13512BCVtoError, T01OG2_n13512BCVtoError, T01OG2_A13513BCVtoDescE, T01OG2_n13513BCVtoDescE, T01OG2_A13514BCVtoFecEr,
            T01OG2_n13514BCVtoFecEr, T01OG2_A13515BCVtoPilae, T01OG2_n13515BCVtoPilae, T01OG2_A396EmprCod
            }
            , new Object[] {
            T01OG3_A13516BCVtoNOP, T01OG3_A13510BCFecVto, T01OG3_n13510BCFecVto, T01OG3_A13511BCVtoProce, T01OG3_n13511BCVtoProce, T01OG3_A13512BCVtoError, T01OG3_n13512BCVtoError, T01OG3_A13513BCVtoDescE, T01OG3_n13513BCVtoDescE, T01OG3_A13514BCVtoFecEr,
            T01OG3_n13514BCVtoFecEr, T01OG3_A13515BCVtoPilae, T01OG3_n13515BCVtoPilae, T01OG3_A396EmprCod
            }
            , new Object[] {
            T01OG4_A407EmprNom, T01OG4_n407EmprNom
            }
            , new Object[] {
            T01OG5_A13516BCVtoNOP, T01OG5_A407EmprNom, T01OG5_n407EmprNom, T01OG5_A13510BCFecVto, T01OG5_n13510BCFecVto, T01OG5_A13511BCVtoProce, T01OG5_n13511BCVtoProce, T01OG5_A13512BCVtoError, T01OG5_n13512BCVtoError, T01OG5_A13513BCVtoDescE,
            T01OG5_n13513BCVtoDescE, T01OG5_A13514BCVtoFecEr, T01OG5_n13514BCVtoFecEr, T01OG5_A13515BCVtoPilae, T01OG5_n13515BCVtoPilae, T01OG5_A396EmprCod
            }
            , new Object[] {
            T01OG6_A396EmprCod, T01OG6_A13516BCVtoNOP
            }
            , new Object[] {
            T01OG7_A396EmprCod, T01OG7_A13516BCVtoNOP
            }
            , new Object[] {
            T01OG8_A396EmprCod, T01OG8_A13516BCVtoNOP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OG12_A396EmprCod, T01OG12_A13516BCVtoNOP
            }
            , new Object[] {
            T01OG13_A407EmprNom, T01OG13_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TOPBCVTO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z13511BCVtoProce ;
   private short Z13512BCVtoError ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13511BCVtoProce ;
   private short A13512BCVtoError ;
   private short RcdFound1848 ;
   private short nIsDirty_1848 ;
   private short ZZ13511BCVtoProce ;
   private short ZZ13512BCVtoError ;
   private int Z13516BCVtoNOP ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A13516BCVtoNOP ;
   private int edtBCVtoNOP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBCFecVto_Enabled ;
   private int edtBCVtoProce_Enabled ;
   private int edtBCVtoError_Enabled ;
   private int edtBCVtoDescE_Enabled ;
   private int edtBCVtoFecEr_Enabled ;
   private int edtBCVtoPilae_Enabled ;
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
   private int edtBCVtoPilae_Backcolor ;
   private int edtBCVtoFecEr_Backcolor ;
   private int edtBCVtoDescE_Backcolor ;
   private int edtBCVtoError_Backcolor ;
   private int edtBCVtoProce_Backcolor ;
   private int edtBCFecVto_Backcolor ;
   private int edtBCVtoNOP_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13516BCVtoNOP ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBCVtoNOP_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBCVtoNOP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBCFecVto_Internalname ;
   private String edtBCFecVto_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBCVtoProce_Internalname ;
   private String edtBCVtoProce_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBCVtoError_Internalname ;
   private String edtBCVtoError_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBCVtoDescE_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBCVtoFecEr_Internalname ;
   private String edtBCVtoFecEr_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBCVtoPilae_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private String sMode1848 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z13514BCVtoFecEr ;
   private java.util.Date A13514BCVtoFecEr ;
   private java.util.Date ZZ13514BCVtoFecEr ;
   private java.util.Date Z13510BCFecVto ;
   private java.util.Date A13510BCFecVto ;
   private java.util.Date ZZ13510BCFecVto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n13510BCFecVto ;
   private boolean n13511BCVtoProce ;
   private boolean n13512BCVtoError ;
   private boolean n13513BCVtoDescE ;
   private boolean n13514BCVtoFecEr ;
   private boolean n13515BCVtoPilae ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z13513BCVtoDescE ;
   private String Z13515BCVtoPilae ;
   private String A13513BCVtoDescE ;
   private String A13515BCVtoPilae ;
   private String ZZ13513BCVtoDescE ;
   private String ZZ13515BCVtoPilae ;
   private IDataStoreProvider pr_default ;
   private String[] T01OG4_A407EmprNom ;
   private boolean[] T01OG4_n407EmprNom ;
   private int[] T01OG5_A13516BCVtoNOP ;
   private String[] T01OG5_A407EmprNom ;
   private boolean[] T01OG5_n407EmprNom ;
   private java.util.Date[] T01OG5_A13510BCFecVto ;
   private boolean[] T01OG5_n13510BCFecVto ;
   private short[] T01OG5_A13511BCVtoProce ;
   private boolean[] T01OG5_n13511BCVtoProce ;
   private short[] T01OG5_A13512BCVtoError ;
   private boolean[] T01OG5_n13512BCVtoError ;
   private String[] T01OG5_A13513BCVtoDescE ;
   private boolean[] T01OG5_n13513BCVtoDescE ;
   private java.util.Date[] T01OG5_A13514BCVtoFecEr ;
   private boolean[] T01OG5_n13514BCVtoFecEr ;
   private String[] T01OG5_A13515BCVtoPilae ;
   private boolean[] T01OG5_n13515BCVtoPilae ;
   private String[] T01OG5_A396EmprCod ;
   private String[] T01OG6_A396EmprCod ;
   private int[] T01OG6_A13516BCVtoNOP ;
   private int[] T01OG3_A13516BCVtoNOP ;
   private java.util.Date[] T01OG3_A13510BCFecVto ;
   private boolean[] T01OG3_n13510BCFecVto ;
   private short[] T01OG3_A13511BCVtoProce ;
   private boolean[] T01OG3_n13511BCVtoProce ;
   private short[] T01OG3_A13512BCVtoError ;
   private boolean[] T01OG3_n13512BCVtoError ;
   private String[] T01OG3_A13513BCVtoDescE ;
   private boolean[] T01OG3_n13513BCVtoDescE ;
   private java.util.Date[] T01OG3_A13514BCVtoFecEr ;
   private boolean[] T01OG3_n13514BCVtoFecEr ;
   private String[] T01OG3_A13515BCVtoPilae ;
   private boolean[] T01OG3_n13515BCVtoPilae ;
   private String[] T01OG3_A396EmprCod ;
   private String[] T01OG7_A396EmprCod ;
   private int[] T01OG7_A13516BCVtoNOP ;
   private String[] T01OG8_A396EmprCod ;
   private int[] T01OG8_A13516BCVtoNOP ;
   private int[] T01OG2_A13516BCVtoNOP ;
   private java.util.Date[] T01OG2_A13510BCFecVto ;
   private boolean[] T01OG2_n13510BCFecVto ;
   private short[] T01OG2_A13511BCVtoProce ;
   private boolean[] T01OG2_n13511BCVtoProce ;
   private short[] T01OG2_A13512BCVtoError ;
   private boolean[] T01OG2_n13512BCVtoError ;
   private String[] T01OG2_A13513BCVtoDescE ;
   private boolean[] T01OG2_n13513BCVtoDescE ;
   private java.util.Date[] T01OG2_A13514BCVtoFecEr ;
   private boolean[] T01OG2_n13514BCVtoFecEr ;
   private String[] T01OG2_A13515BCVtoPilae ;
   private boolean[] T01OG2_n13515BCVtoPilae ;
   private String[] T01OG2_A396EmprCod ;
   private String[] T01OG12_A396EmprCod ;
   private int[] T01OG12_A13516BCVtoNOP ;
   private String[] T01OG13_A407EmprNom ;
   private boolean[] T01OG13_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class topbcvto__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcvto__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcvto__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcvto__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcvto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OG2", "SELECT BCVtoNOP, BCFecVto, BCVtoProce, BCVtoError, BCVtoDescE, BCVtoFecEr, BCVtoPilae, EmprCod FROM TXPOPBCVT WHERE EmprCod = ? AND BCVtoNOP = ?  FOR UPDATE OF BCFecVto, BCVtoProce, BCVtoError, BCVtoDescE, BCVtoFecEr, BCVtoPilae NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OG3", "SELECT BCVtoNOP, BCFecVto, BCVtoProce, BCVtoError, BCVtoDescE, BCVtoFecEr, BCVtoPilae, EmprCod FROM TXPOPBCVT WHERE EmprCod = ? AND BCVtoNOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OG4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OG5", "SELECT /*+ FIRST_ROWS(100) */ TM1.BCVtoNOP, T2.EmprNom, TM1.BCFecVto, TM1.BCVtoProce, TM1.BCVtoError, TM1.BCVtoDescE, TM1.BCVtoFecEr, TM1.BCVtoPilae, TM1.EmprCod FROM (TXPOPBCVT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BCVtoNOP = ? ORDER BY TM1.EmprCod, TM1.BCVtoNOP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OG6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCVtoNOP FROM TXPOPBCVT WHERE EmprCod = ? AND BCVtoNOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OG7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCVtoNOP FROM TXPOPBCVT WHERE ( BCVtoNOP > ?) and EmprCod = ? ORDER BY EmprCod, BCVtoNOP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OG8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCVtoNOP FROM TXPOPBCVT WHERE ( BCVtoNOP < ?) and EmprCod = ? ORDER BY EmprCod DESC, BCVtoNOP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OG9", "INSERT INTO TXPOPBCVT(BCVtoNOP, BCFecVto, BCVtoProce, BCVtoError, BCVtoDescE, BCVtoFecEr, BCVtoPilae, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOPBCVT")
         ,new UpdateCursor("T01OG10", "UPDATE TXPOPBCVT SET BCFecVto=?, BCVtoProce=?, BCVtoError=?, BCVtoDescE=?, BCVtoFecEr=?, BCVtoPilae=?  WHERE EmprCod = ? AND BCVtoNOP = ?", GX_NOMASK, "TXPOPBCVT")
         ,new UpdateCursor("T01OG11", "DELETE FROM TXPOPBCVT  WHERE EmprCod = ? AND BCVtoNOP = ?", GX_NOMASK, "TXPOPBCVT")
         ,new ForEachCursor("T01OG12", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BCVtoNOP FROM TXPOPBCVT WHERE EmprCod = ? ORDER BY EmprCod, BCVtoNOP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OG13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
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
                  stmt.setVarchar(5, (String)parms[8], 200);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 200);
               }
               stmt.setString(8, (String)parms[13], 3);
               return;
            case 8 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setVarchar(4, (String)parms[7], 200);
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

