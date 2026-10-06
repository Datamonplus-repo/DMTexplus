package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trlicrn_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Registro de LicRnd", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRlrFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public trlicrn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trlicrn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trlicrn_impl.class ));
   }

   public trlicrn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRLICRN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "RlrFch", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRlrFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrFch_Internalname, localUtil.ttoc( A8714RlrFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8714RlrFch, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrFch_Jsonclick, 0, "", "", "", "", "", 1, edtRlrFch_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRLICRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRlrFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRlrFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRLICRN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "RlrUsu", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrUsu_Internalname, GXutil.rtrim( A8715RlrUsu), GXutil.rtrim( localUtil.format( A8715RlrUsu, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrUsu_Jsonclick, 0, "", "", "", "", "", 1, edtRlrUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "RlrFchA", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRlrFchA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrFchA_Internalname, localUtil.format(A8716RlrFchA, "99/99/99"), localUtil.format( A8716RlrFchA, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrFchA_Jsonclick, 0, "", "", "", "", "", 1, edtRlrFchA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRLICRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRlrFchA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRlrFchA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRLICRN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "RlrFchE", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRlrFchE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrFchE_Internalname, localUtil.format(A8717RlrFchE, "99/99/99"), localUtil.format( A8717RlrFchE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrFchE_Jsonclick, 0, "", "", "", "", "", 1, edtRlrFchE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRLICRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRlrFchE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRlrFchE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRLICRN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "RlrPgm", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrPgm_Internalname, A8718RlrPgm, GXutil.rtrim( localUtil.format( A8718RlrPgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrPgm_Jsonclick, 0, "", "", "", "", "", 1, edtRlrPgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "RlrTrCod", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrTrCod_Internalname, GXutil.rtrim( A8719RlrTrCod), GXutil.rtrim( localUtil.format( A8719RlrTrCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrTrCod_Jsonclick, 0, "", "", "", "", "", 1, edtRlrTrCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "RlrDia", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrDia_Internalname, GXutil.ltrim( localUtil.ntoc( A8720RlrDia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRlrDia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8720RlrDia), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8720RlrDia), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrDia_Jsonclick, 0, "", "", "", "", "", 1, edtRlrDia_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "RlrDiaDif", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrDiaDif_Internalname, GXutil.ltrim( localUtil.ntoc( A8721RlrDiaDif, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRlrDiaDif_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8721RlrDiaDif), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8721RlrDiaDif), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrDiaDif_Jsonclick, 0, "", "", "", "", "", 1, edtRlrDiaDif_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "RlrRnd", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrRnd_Internalname, GXutil.ltrim( localUtil.ntoc( A8722RlrRnd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRlrRnd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8722RlrRnd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8722RlrRnd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrRnd_Jsonclick, 0, "", "", "", "", "", 1, edtRlrRnd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Rlr Fch A1", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrFchA1_Internalname, GXutil.rtrim( A12847RlrFchA1), GXutil.rtrim( localUtil.format( A12847RlrFchA1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrFchA1_Jsonclick, 0, "", "", "", "", "", 1, edtRlrFchA1_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Clave1", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClave1_Internalname, GXutil.rtrim( A12845Clave1), GXutil.rtrim( localUtil.format( A12845Clave1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClave1_Jsonclick, 0, "", "", "", "", "", 1, edtClave1_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Rlr Fch E1", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRlrFchE1_Internalname, GXutil.rtrim( A12848RlrFchE1), GXutil.rtrim( localUtil.format( A12848RlrFchE1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRlrFchE1_Jsonclick, 0, "", "", "", "", "", 1, edtRlrFchE1_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Clave2", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClave2_Internalname, GXutil.rtrim( A12846Clave2), GXutil.rtrim( localUtil.format( A12846Clave2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClave2_Jsonclick, 0, "", "", "", "", "", 1, edtClave2_Enabled, 0, "text", "", 32, "chr", 1, "row", 32, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRLICRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRLICRN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRLICRN.htm");
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
      e1112N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z8714RlrFch = localUtil.ctot( httpContext.cgiGet( "Z8714RlrFch"), 0) ;
            Z8715RlrUsu = httpContext.cgiGet( "Z8715RlrUsu") ;
            Z8716RlrFchA = localUtil.ctod( httpContext.cgiGet( "Z8716RlrFchA"), 0) ;
            Z8717RlrFchE = localUtil.ctod( httpContext.cgiGet( "Z8717RlrFchE"), 0) ;
            Z8718RlrPgm = httpContext.cgiGet( "Z8718RlrPgm") ;
            Z8719RlrTrCod = httpContext.cgiGet( "Z8719RlrTrCod") ;
            Z8720RlrDia = (short)(localUtil.ctol( httpContext.cgiGet( "Z8720RlrDia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8721RlrDiaDif = (short)(localUtil.ctol( httpContext.cgiGet( "Z8721RlrDiaDif"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8722RlrRnd = (short)(localUtil.ctol( httpContext.cgiGet( "Z8722RlrRnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12847RlrFchA1 = httpContext.cgiGet( "Z12847RlrFchA1") ;
            Z12845Clave1 = httpContext.cgiGet( "Z12845Clave1") ;
            Z12848RlrFchE1 = httpContext.cgiGet( "Z12848RlrFchE1") ;
            Z12846Clave2 = httpContext.cgiGet( "Z12846Clave2") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            if ( localUtil.vcdtime( httpContext.cgiGet( edtRlrFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RLRFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A8714RlrFch = localUtil.ctot( httpContext.cgiGet( edtRlrFch_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A8715RlrUsu = GXutil.upper( httpContext.cgiGet( edtRlrUsu_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
            if ( localUtil.vcdate( httpContext.cgiGet( edtRlrFchA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RLRFCHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrFchA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8716RlrFchA = GXutil.nullDate() ;
               n8716RlrFchA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8716RlrFchA", localUtil.format(A8716RlrFchA, "99/99/99"));
            }
            else
            {
               A8716RlrFchA = localUtil.ctod( httpContext.cgiGet( edtRlrFchA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8716RlrFchA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8716RlrFchA", localUtil.format(A8716RlrFchA, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtRlrFchE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RLRFCHE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrFchE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8717RlrFchE = GXutil.nullDate() ;
               n8717RlrFchE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8717RlrFchE", localUtil.format(A8717RlrFchE, "99/99/99"));
            }
            else
            {
               A8717RlrFchE = localUtil.ctod( httpContext.cgiGet( edtRlrFchE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8717RlrFchE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8717RlrFchE", localUtil.format(A8717RlrFchE, "99/99/99"));
            }
            A8718RlrPgm = httpContext.cgiGet( edtRlrPgm_Internalname) ;
            n8718RlrPgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8718RlrPgm", A8718RlrPgm);
            A8719RlrTrCod = httpContext.cgiGet( edtRlrTrCod_Internalname) ;
            n8719RlrTrCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8719RlrTrCod", A8719RlrTrCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRlrDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRlrDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RLRDIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrDia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8720RlrDia = (short)(0) ;
               n8720RlrDia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8720RlrDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8720RlrDia), 4, 0));
            }
            else
            {
               A8720RlrDia = (short)(localUtil.ctol( httpContext.cgiGet( edtRlrDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8720RlrDia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8720RlrDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8720RlrDia), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRlrDiaDif_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRlrDiaDif_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RLRDIADIF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrDiaDif_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8721RlrDiaDif = (short)(0) ;
               n8721RlrDiaDif = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8721RlrDiaDif", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8721RlrDiaDif), 4, 0));
            }
            else
            {
               A8721RlrDiaDif = (short)(localUtil.ctol( httpContext.cgiGet( edtRlrDiaDif_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8721RlrDiaDif = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8721RlrDiaDif", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8721RlrDiaDif), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRlrRnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRlrRnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RLRRND");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrRnd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8722RlrRnd = (short)(0) ;
               n8722RlrRnd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8722RlrRnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8722RlrRnd), 4, 0));
            }
            else
            {
               A8722RlrRnd = (short)(localUtil.ctol( httpContext.cgiGet( edtRlrRnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8722RlrRnd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8722RlrRnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8722RlrRnd), 4, 0));
            }
            A12847RlrFchA1 = httpContext.cgiGet( edtRlrFchA1_Internalname) ;
            n12847RlrFchA1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12847RlrFchA1", A12847RlrFchA1);
            A12845Clave1 = httpContext.cgiGet( edtClave1_Internalname) ;
            n12845Clave1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12845Clave1", A12845Clave1);
            A12848RlrFchE1 = httpContext.cgiGet( edtRlrFchE1_Internalname) ;
            n12848RlrFchE1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12848RlrFchE1", A12848RlrFchE1);
            A12846Clave2 = httpContext.cgiGet( edtClave2_Internalname) ;
            n12846Clave2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12846Clave2", A12846Clave2);
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
               A8714RlrFch = localUtil.parseDTimeParm( httpContext.GetPar( "RlrFch")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               A8715RlrUsu = httpContext.GetPar( "RlrUsu") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
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
                        e1112N2 ();
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
            initAll12N1190( ) ;
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
      disableAttributes12N1190( ) ;
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

   public void confirm_12N0( )
   {
      beforeValidate12N1190( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12N1190( ) ;
         }
         else
         {
            checkExtendedTable12N1190( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors12N1190( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues12N0( ) ;
      }
   }

   public void resetCaption12N0( )
   {
   }

   public void e1112N2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trlicrn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      trlicrn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trlicrn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trlicrn_impl.this.AV32EmprCod = GXv_char2[0] ;
      trlicrn_impl.this.AV11EmprNom = GXv_char3[0] ;
      trlicrn_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm12N1190( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8716RlrFchA = T012N3_A8716RlrFchA[0] ;
            Z8717RlrFchE = T012N3_A8717RlrFchE[0] ;
            Z8718RlrPgm = T012N3_A8718RlrPgm[0] ;
            Z8719RlrTrCod = T012N3_A8719RlrTrCod[0] ;
            Z8720RlrDia = T012N3_A8720RlrDia[0] ;
            Z8721RlrDiaDif = T012N3_A8721RlrDiaDif[0] ;
            Z8722RlrRnd = T012N3_A8722RlrRnd[0] ;
            Z12847RlrFchA1 = T012N3_A12847RlrFchA1[0] ;
            Z12845Clave1 = T012N3_A12845Clave1[0] ;
            Z12848RlrFchE1 = T012N3_A12848RlrFchE1[0] ;
            Z12846Clave2 = T012N3_A12846Clave2[0] ;
         }
         else
         {
            Z8716RlrFchA = A8716RlrFchA ;
            Z8717RlrFchE = A8717RlrFchE ;
            Z8718RlrPgm = A8718RlrPgm ;
            Z8719RlrTrCod = A8719RlrTrCod ;
            Z8720RlrDia = A8720RlrDia ;
            Z8721RlrDiaDif = A8721RlrDiaDif ;
            Z8722RlrRnd = A8722RlrRnd ;
            Z12847RlrFchA1 = A12847RlrFchA1 ;
            Z12845Clave1 = A12845Clave1 ;
            Z12848RlrFchE1 = A12848RlrFchE1 ;
            Z12846Clave2 = A12846Clave2 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z8714RlrFch = A8714RlrFch ;
         Z8715RlrUsu = A8715RlrUsu ;
         Z8716RlrFchA = A8716RlrFchA ;
         Z8717RlrFchE = A8717RlrFchE ;
         Z8718RlrPgm = A8718RlrPgm ;
         Z8719RlrTrCod = A8719RlrTrCod ;
         Z8720RlrDia = A8720RlrDia ;
         Z8721RlrDiaDif = A8721RlrDiaDif ;
         Z8722RlrRnd = A8722RlrRnd ;
         Z12847RlrFchA1 = A12847RlrFchA1 ;
         Z12845Clave1 = A12845Clave1 ;
         Z12848RlrFchE1 = A12848RlrFchE1 ;
         Z12846Clave2 = A12846Clave2 ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TRLICRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
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

   public void load12N1190( )
   {
      /* Using cursor T012N4 */
      pr_default.execute(2, new Object[] {A8714RlrFch, A8715RlrUsu});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1190 = (short)(1) ;
         A8716RlrFchA = T012N4_A8716RlrFchA[0] ;
         n8716RlrFchA = T012N4_n8716RlrFchA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8716RlrFchA", localUtil.format(A8716RlrFchA, "99/99/99"));
         A8717RlrFchE = T012N4_A8717RlrFchE[0] ;
         n8717RlrFchE = T012N4_n8717RlrFchE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8717RlrFchE", localUtil.format(A8717RlrFchE, "99/99/99"));
         A8718RlrPgm = T012N4_A8718RlrPgm[0] ;
         n8718RlrPgm = T012N4_n8718RlrPgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8718RlrPgm", A8718RlrPgm);
         A8719RlrTrCod = T012N4_A8719RlrTrCod[0] ;
         n8719RlrTrCod = T012N4_n8719RlrTrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8719RlrTrCod", A8719RlrTrCod);
         A8720RlrDia = T012N4_A8720RlrDia[0] ;
         n8720RlrDia = T012N4_n8720RlrDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8720RlrDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8720RlrDia), 4, 0));
         A8721RlrDiaDif = T012N4_A8721RlrDiaDif[0] ;
         n8721RlrDiaDif = T012N4_n8721RlrDiaDif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8721RlrDiaDif", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8721RlrDiaDif), 4, 0));
         A8722RlrRnd = T012N4_A8722RlrRnd[0] ;
         n8722RlrRnd = T012N4_n8722RlrRnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8722RlrRnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8722RlrRnd), 4, 0));
         A12847RlrFchA1 = T012N4_A12847RlrFchA1[0] ;
         n12847RlrFchA1 = T012N4_n12847RlrFchA1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12847RlrFchA1", A12847RlrFchA1);
         A12845Clave1 = T012N4_A12845Clave1[0] ;
         n12845Clave1 = T012N4_n12845Clave1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12845Clave1", A12845Clave1);
         A12848RlrFchE1 = T012N4_A12848RlrFchE1[0] ;
         n12848RlrFchE1 = T012N4_n12848RlrFchE1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12848RlrFchE1", A12848RlrFchE1);
         A12846Clave2 = T012N4_A12846Clave2[0] ;
         n12846Clave2 = T012N4_n12846Clave2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12846Clave2", A12846Clave2);
         zm12N1190( -1) ;
      }
      pr_default.close(2);
      onLoadActions12N1190( ) ;
   }

   public void onLoadActions12N1190( )
   {
   }

   public void checkExtendedTable12N1190( )
   {
      nIsDirty_1190 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors12N1190( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey12N1190( )
   {
      /* Using cursor T012N5 */
      pr_default.execute(3, new Object[] {A8714RlrFch, A8715RlrUsu});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1190 = (short)(1) ;
      }
      else
      {
         RcdFound1190 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012N3 */
      pr_default.execute(1, new Object[] {A8714RlrFch, A8715RlrUsu});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm12N1190( 1) ;
         RcdFound1190 = (short)(1) ;
         A8714RlrFch = T012N3_A8714RlrFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8715RlrUsu = T012N3_A8715RlrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
         A8716RlrFchA = T012N3_A8716RlrFchA[0] ;
         n8716RlrFchA = T012N3_n8716RlrFchA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8716RlrFchA", localUtil.format(A8716RlrFchA, "99/99/99"));
         A8717RlrFchE = T012N3_A8717RlrFchE[0] ;
         n8717RlrFchE = T012N3_n8717RlrFchE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8717RlrFchE", localUtil.format(A8717RlrFchE, "99/99/99"));
         A8718RlrPgm = T012N3_A8718RlrPgm[0] ;
         n8718RlrPgm = T012N3_n8718RlrPgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8718RlrPgm", A8718RlrPgm);
         A8719RlrTrCod = T012N3_A8719RlrTrCod[0] ;
         n8719RlrTrCod = T012N3_n8719RlrTrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8719RlrTrCod", A8719RlrTrCod);
         A8720RlrDia = T012N3_A8720RlrDia[0] ;
         n8720RlrDia = T012N3_n8720RlrDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8720RlrDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8720RlrDia), 4, 0));
         A8721RlrDiaDif = T012N3_A8721RlrDiaDif[0] ;
         n8721RlrDiaDif = T012N3_n8721RlrDiaDif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8721RlrDiaDif", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8721RlrDiaDif), 4, 0));
         A8722RlrRnd = T012N3_A8722RlrRnd[0] ;
         n8722RlrRnd = T012N3_n8722RlrRnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8722RlrRnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8722RlrRnd), 4, 0));
         A12847RlrFchA1 = T012N3_A12847RlrFchA1[0] ;
         n12847RlrFchA1 = T012N3_n12847RlrFchA1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12847RlrFchA1", A12847RlrFchA1);
         A12845Clave1 = T012N3_A12845Clave1[0] ;
         n12845Clave1 = T012N3_n12845Clave1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12845Clave1", A12845Clave1);
         A12848RlrFchE1 = T012N3_A12848RlrFchE1[0] ;
         n12848RlrFchE1 = T012N3_n12848RlrFchE1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12848RlrFchE1", A12848RlrFchE1);
         A12846Clave2 = T012N3_A12846Clave2[0] ;
         n12846Clave2 = T012N3_n12846Clave2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12846Clave2", A12846Clave2);
         Z8714RlrFch = A8714RlrFch ;
         Z8715RlrUsu = A8715RlrUsu ;
         sMode1190 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12N1190( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1190 = (short)(0) ;
            initializeNonKey12N1190( ) ;
         }
         Gx_mode = sMode1190 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1190 = (short)(0) ;
         initializeNonKey12N1190( ) ;
         sMode1190 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1190 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey12N1190( ) ;
      if ( RcdFound1190 == 0 )
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
      RcdFound1190 = (short)(0) ;
      /* Using cursor T012N6 */
      pr_default.execute(4, new Object[] {A8714RlrFch, A8714RlrFch, A8715RlrUsu});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( T012N6_A8714RlrFch[0].before( A8714RlrFch ) || GXutil.dateCompare(T012N6_A8714RlrFch[0], A8714RlrFch) && ( GXutil.strcmp(T012N6_A8715RlrUsu[0], A8715RlrUsu) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( T012N6_A8714RlrFch[0].after( A8714RlrFch ) || GXutil.dateCompare(T012N6_A8714RlrFch[0], A8714RlrFch) && ( GXutil.strcmp(T012N6_A8715RlrUsu[0], A8715RlrUsu) > 0 ) ) )
         {
            A8714RlrFch = T012N6_A8714RlrFch[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A8715RlrUsu = T012N6_A8715RlrUsu[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
            RcdFound1190 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1190 = (short)(0) ;
      /* Using cursor T012N7 */
      pr_default.execute(5, new Object[] {A8714RlrFch, A8714RlrFch, A8715RlrUsu});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( T012N7_A8714RlrFch[0].after( A8714RlrFch ) || GXutil.dateCompare(T012N7_A8714RlrFch[0], A8714RlrFch) && ( GXutil.strcmp(T012N7_A8715RlrUsu[0], A8715RlrUsu) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( T012N7_A8714RlrFch[0].before( A8714RlrFch ) || GXutil.dateCompare(T012N7_A8714RlrFch[0], A8714RlrFch) && ( GXutil.strcmp(T012N7_A8715RlrUsu[0], A8715RlrUsu) < 0 ) ) )
         {
            A8714RlrFch = T012N7_A8714RlrFch[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A8715RlrUsu = T012N7_A8715RlrUsu[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
            RcdFound1190 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12N1190( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRlrFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12N1190( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1190 == 1 )
         {
            if ( !( GXutil.dateCompare(A8714RlrFch, Z8714RlrFch) ) || ( GXutil.strcmp(A8715RlrUsu, Z8715RlrUsu) != 0 ) )
            {
               A8714RlrFch = Z8714RlrFch ;
               httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               A8715RlrUsu = Z8715RlrUsu ;
               httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RLRFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRlrFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update12N1190( ) ;
               GX_FocusControl = edtRlrFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( !( GXutil.dateCompare(A8714RlrFch, Z8714RlrFch) ) || ( GXutil.strcmp(A8715RlrUsu, Z8715RlrUsu) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRlrFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert12N1190( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RLRFCH");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRlrFch_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtRlrFch_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert12N1190( ) ;
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
      if ( !( GXutil.dateCompare(A8714RlrFch, Z8714RlrFch) ) || ( GXutil.strcmp(A8715RlrUsu, Z8715RlrUsu) != 0 ) )
      {
         A8714RlrFch = Z8714RlrFch ;
         httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8715RlrUsu = Z8715RlrUsu ;
         httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RLRFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRlrFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRlrFch_Internalname ;
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
      getKey12N1190( ) ;
      if ( RcdFound1190 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "RLRFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRlrFch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( !( GXutil.dateCompare(A8714RlrFch, Z8714RlrFch) ) || ( GXutil.strcmp(A8715RlrUsu, Z8715RlrUsu) != 0 ) )
         {
            A8714RlrFch = Z8714RlrFch ;
            httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A8715RlrUsu = Z8715RlrUsu ;
            httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "RLRFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRlrFch_Internalname ;
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
         if ( !( GXutil.dateCompare(A8714RlrFch, Z8714RlrFch) ) || ( GXutil.strcmp(A8715RlrUsu, Z8715RlrUsu) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RLRFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRlrFch_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trlicrn");
      GX_FocusControl = edtRlrFchA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_12N0( ) ;
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
      if ( RcdFound1190 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "RLRFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRlrFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRlrFchA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart12N1190( ) ;
      if ( RcdFound1190 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRlrFchA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12N1190( ) ;
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
      if ( RcdFound1190 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRlrFchA_Internalname ;
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
      if ( RcdFound1190 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRlrFchA_Internalname ;
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
      scanStart12N1190( ) ;
      if ( RcdFound1190 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1190 != 0 )
         {
            scanNext12N1190( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRlrFchA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12N1190( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12N1190( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012N2 */
         pr_default.execute(0, new Object[] {A8714RlrFch, A8715RlrUsu});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRLICRN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z8716RlrFchA), GXutil.resetTime(T012N2_A8716RlrFchA[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z8717RlrFchE), GXutil.resetTime(T012N2_A8717RlrFchE[0])) ) || ( GXutil.strcmp(Z8718RlrPgm, T012N2_A8718RlrPgm[0]) != 0 ) || ( GXutil.strcmp(Z8719RlrTrCod, T012N2_A8719RlrTrCod[0]) != 0 ) || ( Z8720RlrDia != T012N2_A8720RlrDia[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8721RlrDiaDif != T012N2_A8721RlrDiaDif[0] ) || ( Z8722RlrRnd != T012N2_A8722RlrRnd[0] ) || ( GXutil.strcmp(Z12847RlrFchA1, T012N2_A12847RlrFchA1[0]) != 0 ) || ( GXutil.strcmp(Z12845Clave1, T012N2_A12845Clave1[0]) != 0 ) || ( GXutil.strcmp(Z12848RlrFchE1, T012N2_A12848RlrFchE1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12846Clave2, T012N2_A12846Clave2[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8716RlrFchA), GXutil.resetTime(T012N2_A8716RlrFchA[0])) ) )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrFchA");
               GXutil.writeLogRaw("Old: ",Z8716RlrFchA);
               GXutil.writeLogRaw("Current: ",T012N2_A8716RlrFchA[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8717RlrFchE), GXutil.resetTime(T012N2_A8717RlrFchE[0])) ) )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrFchE");
               GXutil.writeLogRaw("Old: ",Z8717RlrFchE);
               GXutil.writeLogRaw("Current: ",T012N2_A8717RlrFchE[0]);
            }
            if ( GXutil.strcmp(Z8718RlrPgm, T012N2_A8718RlrPgm[0]) != 0 )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrPgm");
               GXutil.writeLogRaw("Old: ",Z8718RlrPgm);
               GXutil.writeLogRaw("Current: ",T012N2_A8718RlrPgm[0]);
            }
            if ( GXutil.strcmp(Z8719RlrTrCod, T012N2_A8719RlrTrCod[0]) != 0 )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrTrCod");
               GXutil.writeLogRaw("Old: ",Z8719RlrTrCod);
               GXutil.writeLogRaw("Current: ",T012N2_A8719RlrTrCod[0]);
            }
            if ( Z8720RlrDia != T012N2_A8720RlrDia[0] )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrDia");
               GXutil.writeLogRaw("Old: ",Z8720RlrDia);
               GXutil.writeLogRaw("Current: ",T012N2_A8720RlrDia[0]);
            }
            if ( Z8721RlrDiaDif != T012N2_A8721RlrDiaDif[0] )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrDiaDif");
               GXutil.writeLogRaw("Old: ",Z8721RlrDiaDif);
               GXutil.writeLogRaw("Current: ",T012N2_A8721RlrDiaDif[0]);
            }
            if ( Z8722RlrRnd != T012N2_A8722RlrRnd[0] )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrRnd");
               GXutil.writeLogRaw("Old: ",Z8722RlrRnd);
               GXutil.writeLogRaw("Current: ",T012N2_A8722RlrRnd[0]);
            }
            if ( GXutil.strcmp(Z12847RlrFchA1, T012N2_A12847RlrFchA1[0]) != 0 )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrFchA1");
               GXutil.writeLogRaw("Old: ",Z12847RlrFchA1);
               GXutil.writeLogRaw("Current: ",T012N2_A12847RlrFchA1[0]);
            }
            if ( GXutil.strcmp(Z12845Clave1, T012N2_A12845Clave1[0]) != 0 )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"Clave1");
               GXutil.writeLogRaw("Old: ",Z12845Clave1);
               GXutil.writeLogRaw("Current: ",T012N2_A12845Clave1[0]);
            }
            if ( GXutil.strcmp(Z12848RlrFchE1, T012N2_A12848RlrFchE1[0]) != 0 )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"RlrFchE1");
               GXutil.writeLogRaw("Old: ",Z12848RlrFchE1);
               GXutil.writeLogRaw("Current: ",T012N2_A12848RlrFchE1[0]);
            }
            if ( GXutil.strcmp(Z12846Clave2, T012N2_A12846Clave2[0]) != 0 )
            {
               GXutil.writeLogln("trlicrn:[seudo value changed for attri]"+"Clave2");
               GXutil.writeLogRaw("Old: ",Z12846Clave2);
               GXutil.writeLogRaw("Current: ",T012N2_A12846Clave2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRLICRN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12N1190( )
   {
      beforeValidate12N1190( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12N1190( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12N1190( 0) ;
         checkOptimisticConcurrency12N1190( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12N1190( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12N1190( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012N8 */
                  pr_default.execute(6, new Object[] {A8714RlrFch, A8715RlrUsu, Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd), Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1, Boolean.valueOf(n12846Clave2), A12846Clave2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaption12N0( ) ;
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
            load12N1190( ) ;
         }
         endLevel12N1190( ) ;
      }
      closeExtendedTableCursors12N1190( ) ;
   }

   public void update12N1190( )
   {
      beforeValidate12N1190( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12N1190( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12N1190( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12N1190( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12N1190( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012N9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n8718RlrPgm), A8718RlrPgm, Boolean.valueOf(n8719RlrTrCod), A8719RlrTrCod, Boolean.valueOf(n8720RlrDia), Short.valueOf(A8720RlrDia), Boolean.valueOf(n8721RlrDiaDif), Short.valueOf(A8721RlrDiaDif), Boolean.valueOf(n8722RlrRnd), Short.valueOf(A8722RlrRnd), Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1, Boolean.valueOf(n12846Clave2), A12846Clave2, A8714RlrFch, A8715RlrUsu});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRLICRN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12N1190( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption12N0( ) ;
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
         endLevel12N1190( ) ;
      }
      closeExtendedTableCursors12N1190( ) ;
   }

   public void deferredUpdate12N1190( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12N1190( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12N1190( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12N1190( ) ;
         afterConfirm12N1190( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12N1190( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012N10 */
               pr_default.execute(8, new Object[] {A8714RlrFch, A8715RlrUsu});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1190 == 0 )
                     {
                        initAll12N1190( ) ;
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
                     resetCaption12N0( ) ;
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
      sMode1190 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12N1190( ) ;
      Gx_mode = sMode1190 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12N1190( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel12N1190( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12N1190( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trlicrn");
         if ( AnyError == 0 )
         {
            confirmValues12N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trlicrn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12N1190( )
   {
      /* Scan By routine */
      /* Using cursor T012N11 */
      pr_default.execute(9);
      RcdFound1190 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1190 = (short)(1) ;
         A8714RlrFch = T012N11_A8714RlrFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8715RlrUsu = T012N11_A8715RlrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12N1190( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1190 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1190 = (short)(1) ;
         A8714RlrFch = T012N11_A8714RlrFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8715RlrUsu = T012N11_A8715RlrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
      }
   }

   public void scanEnd12N1190( )
   {
      pr_default.close(9);
   }

   public void afterConfirm12N1190( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12N1190( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12N1190( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12N1190( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12N1190( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12N1190( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12N1190( )
   {
      edtRlrFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrFch_Enabled), 5, 0), true);
      edtRlrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrUsu_Enabled), 5, 0), true);
      edtRlrFchA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrFchA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrFchA_Enabled), 5, 0), true);
      edtRlrFchE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrFchE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrFchE_Enabled), 5, 0), true);
      edtRlrPgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrPgm_Enabled), 5, 0), true);
      edtRlrTrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrTrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrTrCod_Enabled), 5, 0), true);
      edtRlrDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrDia_Enabled), 5, 0), true);
      edtRlrDiaDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrDiaDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrDiaDif_Enabled), 5, 0), true);
      edtRlrRnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrRnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrRnd_Enabled), 5, 0), true);
      edtRlrFchA1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrFchA1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrFchA1_Enabled), 5, 0), true);
      edtClave1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClave1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClave1_Enabled), 5, 0), true);
      edtRlrFchE1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRlrFchE1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRlrFchE1_Enabled), 5, 0), true);
      edtClave2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClave2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClave2_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes12N1190( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues12N0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trlicrn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8714RlrFch", localUtil.ttoc( Z8714RlrFch, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8715RlrUsu", GXutil.rtrim( Z8715RlrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8716RlrFchA", localUtil.dtoc( Z8716RlrFchA, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8717RlrFchE", localUtil.dtoc( Z8717RlrFchE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8718RlrPgm", Z8718RlrPgm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8719RlrTrCod", GXutil.rtrim( Z8719RlrTrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8720RlrDia", GXutil.ltrim( localUtil.ntoc( Z8720RlrDia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8721RlrDiaDif", GXutil.ltrim( localUtil.ntoc( Z8721RlrDiaDif, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8722RlrRnd", GXutil.ltrim( localUtil.ntoc( Z8722RlrRnd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12847RlrFchA1", GXutil.rtrim( Z12847RlrFchA1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12845Clave1", GXutil.rtrim( Z12845Clave1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12848RlrFchE1", GXutil.rtrim( Z12848RlrFchE1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12846Clave2", GXutil.rtrim( Z12846Clave2));
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
      return formatLink("app.trlicrn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRLICRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Registro de LicRnd", "") ;
   }

   public void initializeNonKey12N1190( )
   {
      A8716RlrFchA = GXutil.nullDate() ;
      n8716RlrFchA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8716RlrFchA", localUtil.format(A8716RlrFchA, "99/99/99"));
      A8717RlrFchE = GXutil.nullDate() ;
      n8717RlrFchE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8717RlrFchE", localUtil.format(A8717RlrFchE, "99/99/99"));
      A8718RlrPgm = "" ;
      n8718RlrPgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8718RlrPgm", A8718RlrPgm);
      A8719RlrTrCod = "" ;
      n8719RlrTrCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8719RlrTrCod", A8719RlrTrCod);
      A8720RlrDia = (short)(0) ;
      n8720RlrDia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8720RlrDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8720RlrDia), 4, 0));
      A8721RlrDiaDif = (short)(0) ;
      n8721RlrDiaDif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8721RlrDiaDif", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8721RlrDiaDif), 4, 0));
      A8722RlrRnd = (short)(0) ;
      n8722RlrRnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8722RlrRnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8722RlrRnd), 4, 0));
      A12847RlrFchA1 = "" ;
      n12847RlrFchA1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12847RlrFchA1", A12847RlrFchA1);
      A12845Clave1 = "" ;
      n12845Clave1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12845Clave1", A12845Clave1);
      A12848RlrFchE1 = "" ;
      n12848RlrFchE1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12848RlrFchE1", A12848RlrFchE1);
      A12846Clave2 = "" ;
      n12846Clave2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12846Clave2", A12846Clave2);
      Z8716RlrFchA = GXutil.nullDate() ;
      Z8717RlrFchE = GXutil.nullDate() ;
      Z8718RlrPgm = "" ;
      Z8719RlrTrCod = "" ;
      Z8720RlrDia = (short)(0) ;
      Z8721RlrDiaDif = (short)(0) ;
      Z8722RlrRnd = (short)(0) ;
      Z12847RlrFchA1 = "" ;
      Z12845Clave1 = "" ;
      Z12848RlrFchE1 = "" ;
      Z12846Clave2 = "" ;
   }

   public void initAll12N1190( )
   {
      A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A8714RlrFch", localUtil.ttoc( A8714RlrFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8715RlrUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8715RlrUsu", A8715RlrUsu);
      initializeNonKey12N1190( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268313572136", true, true);
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
      httpContext.AddJavascriptSource("trlicrn.js", "?20268313572137", false, true);
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
      edtRlrFch_Internalname = "RLRFCH" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtRlrUsu_Internalname = "RLRUSU" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtRlrFchA_Internalname = "RLRFCHA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtRlrFchE_Internalname = "RLRFCHE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRlrPgm_Internalname = "RLRPGM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRlrTrCod_Internalname = "RLRTRCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRlrDia_Internalname = "RLRDIA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtRlrDiaDif_Internalname = "RLRDIADIF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtRlrRnd_Internalname = "RLRRND" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtRlrFchA1_Internalname = "RLRFCHA1" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtClave1_Internalname = "CLAVE1" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtRlrFchE1_Internalname = "RLRFCHE1" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtClave2_Internalname = "CLAVE2" ;
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
      Form.setCaption( httpContext.getMessage( "Registro de LicRnd", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtClave2_Jsonclick = "" ;
      edtClave2_Backcolor = (int)(0xFFFFFF) ;
      edtClave2_Enabled = 1 ;
      edtRlrFchE1_Jsonclick = "" ;
      edtRlrFchE1_Backcolor = (int)(0xFFFFFF) ;
      edtRlrFchE1_Enabled = 1 ;
      edtClave1_Jsonclick = "" ;
      edtClave1_Backcolor = (int)(0xFFFFFF) ;
      edtClave1_Enabled = 1 ;
      edtRlrFchA1_Jsonclick = "" ;
      edtRlrFchA1_Backcolor = (int)(0xFFFFFF) ;
      edtRlrFchA1_Enabled = 1 ;
      edtRlrRnd_Jsonclick = "" ;
      edtRlrRnd_Backcolor = (int)(0xFFFFFF) ;
      edtRlrRnd_Enabled = 1 ;
      edtRlrDiaDif_Jsonclick = "" ;
      edtRlrDiaDif_Backcolor = (int)(0xFFFFFF) ;
      edtRlrDiaDif_Enabled = 1 ;
      edtRlrDia_Jsonclick = "" ;
      edtRlrDia_Backcolor = (int)(0xFFFFFF) ;
      edtRlrDia_Enabled = 1 ;
      edtRlrTrCod_Jsonclick = "" ;
      edtRlrTrCod_Backcolor = (int)(0xFFFFFF) ;
      edtRlrTrCod_Enabled = 1 ;
      edtRlrPgm_Jsonclick = "" ;
      edtRlrPgm_Backcolor = (int)(0xFFFFFF) ;
      edtRlrPgm_Enabled = 1 ;
      edtRlrFchE_Jsonclick = "" ;
      edtRlrFchE_Backcolor = (int)(0xFFFFFF) ;
      edtRlrFchE_Enabled = 1 ;
      edtRlrFchA_Jsonclick = "" ;
      edtRlrFchA_Backcolor = (int)(0xFFFFFF) ;
      edtRlrFchA_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRlrUsu_Jsonclick = "" ;
      edtRlrUsu_Backcolor = (int)(0xFFFFFF) ;
      edtRlrUsu_Enabled = 1 ;
      edtRlrFch_Jsonclick = "" ;
      edtRlrFch_Backcolor = (int)(0xFFFFFF) ;
      edtRlrFch_Enabled = 1 ;
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
      GX_FocusControl = edtRlrFchA_Internalname ;
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

   public void valid_Rlrusu( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8716RlrFchA", localUtil.format(A8716RlrFchA, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8717RlrFchE", localUtil.format(A8717RlrFchE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8718RlrPgm", A8718RlrPgm);
      httpContext.ajax_rsp_assign_attri("", false, "A8719RlrTrCod", GXutil.rtrim( A8719RlrTrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A8720RlrDia", GXutil.ltrim( localUtil.ntoc( A8720RlrDia, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8721RlrDiaDif", GXutil.ltrim( localUtil.ntoc( A8721RlrDiaDif, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8722RlrRnd", GXutil.ltrim( localUtil.ntoc( A8722RlrRnd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12847RlrFchA1", GXutil.rtrim( A12847RlrFchA1));
      httpContext.ajax_rsp_assign_attri("", false, "A12845Clave1", GXutil.rtrim( A12845Clave1));
      httpContext.ajax_rsp_assign_attri("", false, "A12848RlrFchE1", GXutil.rtrim( A12848RlrFchE1));
      httpContext.ajax_rsp_assign_attri("", false, "A12846Clave2", GXutil.rtrim( A12846Clave2));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8714RlrFch", localUtil.ttoc( Z8714RlrFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8715RlrUsu", GXutil.rtrim( Z8715RlrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8716RlrFchA", localUtil.format(Z8716RlrFchA, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8717RlrFchE", localUtil.format(Z8717RlrFchE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8718RlrPgm", Z8718RlrPgm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8719RlrTrCod", GXutil.rtrim( Z8719RlrTrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8720RlrDia", GXutil.ltrim( localUtil.ntoc( Z8720RlrDia, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8721RlrDiaDif", GXutil.ltrim( localUtil.ntoc( Z8721RlrDiaDif, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8722RlrRnd", GXutil.ltrim( localUtil.ntoc( Z8722RlrRnd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12847RlrFchA1", GXutil.rtrim( Z12847RlrFchA1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12845Clave1", GXutil.rtrim( Z12845Clave1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12848RlrFchE1", GXutil.rtrim( Z12848RlrFchE1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12846Clave2", GXutil.rtrim( Z12846Clave2));
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
      setEventMetadata("VALID_RLRFCH","{handler:'valid_Rlrfch',iparms:[]");
      setEventMetadata("VALID_RLRFCH",",oparms:[]}");
      setEventMetadata("VALID_RLRUSU","{handler:'valid_Rlrusu',iparms:[{av:'A8714RlrFch',fld:'RLRFCH',pic:'99/99/99 99:99'},{av:'A8715RlrUsu',fld:'RLRUSU',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RLRUSU",",oparms:[{av:'A8716RlrFchA',fld:'RLRFCHA',pic:''},{av:'A8717RlrFchE',fld:'RLRFCHE',pic:''},{av:'A8718RlrPgm',fld:'RLRPGM',pic:''},{av:'A8719RlrTrCod',fld:'RLRTRCOD',pic:''},{av:'A8720RlrDia',fld:'RLRDIA',pic:'ZZZ9'},{av:'A8721RlrDiaDif',fld:'RLRDIADIF',pic:'ZZZ9'},{av:'A8722RlrRnd',fld:'RLRRND',pic:'ZZZ9'},{av:'A12847RlrFchA1',fld:'RLRFCHA1',pic:''},{av:'A12845Clave1',fld:'CLAVE1',pic:''},{av:'A12848RlrFchE1',fld:'RLRFCHE1',pic:''},{av:'A12846Clave2',fld:'CLAVE2',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z8714RlrFch'},{av:'Z8715RlrUsu'},{av:'Z8716RlrFchA'},{av:'Z8717RlrFchE'},{av:'Z8718RlrPgm'},{av:'Z8719RlrTrCod'},{av:'Z8720RlrDia'},{av:'Z8721RlrDiaDif'},{av:'Z8722RlrRnd'},{av:'Z12847RlrFchA1'},{av:'Z12845Clave1'},{av:'Z12848RlrFchE1'},{av:'Z12846Clave2'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      Z8715RlrUsu = "" ;
      Z8716RlrFchA = GXutil.nullDate() ;
      Z8717RlrFchE = GXutil.nullDate() ;
      Z8718RlrPgm = "" ;
      Z8719RlrTrCod = "" ;
      Z12847RlrFchA1 = "" ;
      Z12845Clave1 = "" ;
      Z12848RlrFchE1 = "" ;
      Z12846Clave2 = "" ;
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
      A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock2_Jsonclick = "" ;
      A8715RlrUsu = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A8716RlrFchA = GXutil.nullDate() ;
      lblTextblock4_Jsonclick = "" ;
      A8717RlrFchE = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      A8718RlrPgm = "" ;
      lblTextblock6_Jsonclick = "" ;
      A8719RlrTrCod = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12847RlrFchA1 = "" ;
      lblTextblock11_Jsonclick = "" ;
      A12845Clave1 = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12848RlrFchE1 = "" ;
      lblTextblock13_Jsonclick = "" ;
      A12846Clave2 = "" ;
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
      AV32EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T012N4_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N4_A8715RlrUsu = new String[] {""} ;
      T012N4_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      T012N4_n8716RlrFchA = new boolean[] {false} ;
      T012N4_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      T012N4_n8717RlrFchE = new boolean[] {false} ;
      T012N4_A8718RlrPgm = new String[] {""} ;
      T012N4_n8718RlrPgm = new boolean[] {false} ;
      T012N4_A8719RlrTrCod = new String[] {""} ;
      T012N4_n8719RlrTrCod = new boolean[] {false} ;
      T012N4_A8720RlrDia = new short[1] ;
      T012N4_n8720RlrDia = new boolean[] {false} ;
      T012N4_A8721RlrDiaDif = new short[1] ;
      T012N4_n8721RlrDiaDif = new boolean[] {false} ;
      T012N4_A8722RlrRnd = new short[1] ;
      T012N4_n8722RlrRnd = new boolean[] {false} ;
      T012N4_A12847RlrFchA1 = new String[] {""} ;
      T012N4_n12847RlrFchA1 = new boolean[] {false} ;
      T012N4_A12845Clave1 = new String[] {""} ;
      T012N4_n12845Clave1 = new boolean[] {false} ;
      T012N4_A12848RlrFchE1 = new String[] {""} ;
      T012N4_n12848RlrFchE1 = new boolean[] {false} ;
      T012N4_A12846Clave2 = new String[] {""} ;
      T012N4_n12846Clave2 = new boolean[] {false} ;
      T012N5_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N5_A8715RlrUsu = new String[] {""} ;
      T012N3_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N3_A8715RlrUsu = new String[] {""} ;
      T012N3_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      T012N3_n8716RlrFchA = new boolean[] {false} ;
      T012N3_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      T012N3_n8717RlrFchE = new boolean[] {false} ;
      T012N3_A8718RlrPgm = new String[] {""} ;
      T012N3_n8718RlrPgm = new boolean[] {false} ;
      T012N3_A8719RlrTrCod = new String[] {""} ;
      T012N3_n8719RlrTrCod = new boolean[] {false} ;
      T012N3_A8720RlrDia = new short[1] ;
      T012N3_n8720RlrDia = new boolean[] {false} ;
      T012N3_A8721RlrDiaDif = new short[1] ;
      T012N3_n8721RlrDiaDif = new boolean[] {false} ;
      T012N3_A8722RlrRnd = new short[1] ;
      T012N3_n8722RlrRnd = new boolean[] {false} ;
      T012N3_A12847RlrFchA1 = new String[] {""} ;
      T012N3_n12847RlrFchA1 = new boolean[] {false} ;
      T012N3_A12845Clave1 = new String[] {""} ;
      T012N3_n12845Clave1 = new boolean[] {false} ;
      T012N3_A12848RlrFchE1 = new String[] {""} ;
      T012N3_n12848RlrFchE1 = new boolean[] {false} ;
      T012N3_A12846Clave2 = new String[] {""} ;
      T012N3_n12846Clave2 = new boolean[] {false} ;
      sMode1190 = "" ;
      T012N6_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N6_A8715RlrUsu = new String[] {""} ;
      T012N7_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N7_A8715RlrUsu = new String[] {""} ;
      T012N2_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N2_A8715RlrUsu = new String[] {""} ;
      T012N2_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      T012N2_n8716RlrFchA = new boolean[] {false} ;
      T012N2_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      T012N2_n8717RlrFchE = new boolean[] {false} ;
      T012N2_A8718RlrPgm = new String[] {""} ;
      T012N2_n8718RlrPgm = new boolean[] {false} ;
      T012N2_A8719RlrTrCod = new String[] {""} ;
      T012N2_n8719RlrTrCod = new boolean[] {false} ;
      T012N2_A8720RlrDia = new short[1] ;
      T012N2_n8720RlrDia = new boolean[] {false} ;
      T012N2_A8721RlrDiaDif = new short[1] ;
      T012N2_n8721RlrDiaDif = new boolean[] {false} ;
      T012N2_A8722RlrRnd = new short[1] ;
      T012N2_n8722RlrRnd = new boolean[] {false} ;
      T012N2_A12847RlrFchA1 = new String[] {""} ;
      T012N2_n12847RlrFchA1 = new boolean[] {false} ;
      T012N2_A12845Clave1 = new String[] {""} ;
      T012N2_n12845Clave1 = new boolean[] {false} ;
      T012N2_A12848RlrFchE1 = new String[] {""} ;
      T012N2_n12848RlrFchE1 = new boolean[] {false} ;
      T012N2_A12846Clave2 = new String[] {""} ;
      T012N2_n12846Clave2 = new boolean[] {false} ;
      T012N11_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      T012N11_A8715RlrUsu = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      ZZ8715RlrUsu = "" ;
      ZZ8716RlrFchA = GXutil.nullDate() ;
      ZZ8717RlrFchE = GXutil.nullDate() ;
      ZZ8718RlrPgm = "" ;
      ZZ8719RlrTrCod = "" ;
      ZZ12847RlrFchA1 = "" ;
      ZZ12845Clave1 = "" ;
      ZZ12848RlrFchE1 = "" ;
      ZZ12846Clave2 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trlicrn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trlicrn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trlicrn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trlicrn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trlicrn__default(),
         new Object[] {
             new Object[] {
            T012N2_A8714RlrFch, T012N2_A8715RlrUsu, T012N2_A8716RlrFchA, T012N2_n8716RlrFchA, T012N2_A8717RlrFchE, T012N2_n8717RlrFchE, T012N2_A8718RlrPgm, T012N2_n8718RlrPgm, T012N2_A8719RlrTrCod, T012N2_n8719RlrTrCod,
            T012N2_A8720RlrDia, T012N2_n8720RlrDia, T012N2_A8721RlrDiaDif, T012N2_n8721RlrDiaDif, T012N2_A8722RlrRnd, T012N2_n8722RlrRnd, T012N2_A12847RlrFchA1, T012N2_n12847RlrFchA1, T012N2_A12845Clave1, T012N2_n12845Clave1,
            T012N2_A12848RlrFchE1, T012N2_n12848RlrFchE1, T012N2_A12846Clave2, T012N2_n12846Clave2
            }
            , new Object[] {
            T012N3_A8714RlrFch, T012N3_A8715RlrUsu, T012N3_A8716RlrFchA, T012N3_n8716RlrFchA, T012N3_A8717RlrFchE, T012N3_n8717RlrFchE, T012N3_A8718RlrPgm, T012N3_n8718RlrPgm, T012N3_A8719RlrTrCod, T012N3_n8719RlrTrCod,
            T012N3_A8720RlrDia, T012N3_n8720RlrDia, T012N3_A8721RlrDiaDif, T012N3_n8721RlrDiaDif, T012N3_A8722RlrRnd, T012N3_n8722RlrRnd, T012N3_A12847RlrFchA1, T012N3_n12847RlrFchA1, T012N3_A12845Clave1, T012N3_n12845Clave1,
            T012N3_A12848RlrFchE1, T012N3_n12848RlrFchE1, T012N3_A12846Clave2, T012N3_n12846Clave2
            }
            , new Object[] {
            T012N4_A8714RlrFch, T012N4_A8715RlrUsu, T012N4_A8716RlrFchA, T012N4_n8716RlrFchA, T012N4_A8717RlrFchE, T012N4_n8717RlrFchE, T012N4_A8718RlrPgm, T012N4_n8718RlrPgm, T012N4_A8719RlrTrCod, T012N4_n8719RlrTrCod,
            T012N4_A8720RlrDia, T012N4_n8720RlrDia, T012N4_A8721RlrDiaDif, T012N4_n8721RlrDiaDif, T012N4_A8722RlrRnd, T012N4_n8722RlrRnd, T012N4_A12847RlrFchA1, T012N4_n12847RlrFchA1, T012N4_A12845Clave1, T012N4_n12845Clave1,
            T012N4_A12848RlrFchE1, T012N4_n12848RlrFchE1, T012N4_A12846Clave2, T012N4_n12846Clave2
            }
            , new Object[] {
            T012N5_A8714RlrFch, T012N5_A8715RlrUsu
            }
            , new Object[] {
            T012N6_A8714RlrFch, T012N6_A8715RlrUsu
            }
            , new Object[] {
            T012N7_A8714RlrFch, T012N7_A8715RlrUsu
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012N11_A8714RlrFch, T012N11_A8715RlrUsu
            }
         }
      );
      AV33Pgmname = "TRLICRN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z8720RlrDia ;
   private short Z8721RlrDiaDif ;
   private short Z8722RlrRnd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8720RlrDia ;
   private short A8721RlrDiaDif ;
   private short A8722RlrRnd ;
   private short RcdFound1190 ;
   private short nIsDirty_1190 ;
   private short ZZ8720RlrDia ;
   private short ZZ8721RlrDiaDif ;
   private short ZZ8722RlrRnd ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRlrFch_Enabled ;
   private int edtRlrUsu_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtRlrFchA_Enabled ;
   private int edtRlrFchE_Enabled ;
   private int edtRlrPgm_Enabled ;
   private int edtRlrTrCod_Enabled ;
   private int edtRlrDia_Enabled ;
   private int edtRlrDiaDif_Enabled ;
   private int edtRlrRnd_Enabled ;
   private int edtRlrFchA1_Enabled ;
   private int edtClave1_Enabled ;
   private int edtRlrFchE1_Enabled ;
   private int edtClave2_Enabled ;
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
   private int edtClave2_Backcolor ;
   private int edtRlrFchE1_Backcolor ;
   private int edtClave1_Backcolor ;
   private int edtRlrFchA1_Backcolor ;
   private int edtRlrRnd_Backcolor ;
   private int edtRlrDiaDif_Backcolor ;
   private int edtRlrDia_Backcolor ;
   private int edtRlrTrCod_Backcolor ;
   private int edtRlrPgm_Backcolor ;
   private int edtRlrFchE_Backcolor ;
   private int edtRlrFchA_Backcolor ;
   private int edtRlrUsu_Backcolor ;
   private int edtRlrFch_Backcolor ;
   private String sPrefix ;
   private String Z8715RlrUsu ;
   private String Z8719RlrTrCod ;
   private String Z12847RlrFchA1 ;
   private String Z12845Clave1 ;
   private String Z12848RlrFchE1 ;
   private String Z12846Clave2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRlrFch_Internalname ;
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
   private String edtRlrFch_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtRlrUsu_Internalname ;
   private String A8715RlrUsu ;
   private String edtRlrUsu_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtRlrFchA_Internalname ;
   private String edtRlrFchA_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtRlrFchE_Internalname ;
   private String edtRlrFchE_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRlrPgm_Internalname ;
   private String edtRlrPgm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRlrTrCod_Internalname ;
   private String A8719RlrTrCod ;
   private String edtRlrTrCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRlrDia_Internalname ;
   private String edtRlrDia_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtRlrDiaDif_Internalname ;
   private String edtRlrDiaDif_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtRlrRnd_Internalname ;
   private String edtRlrRnd_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtRlrFchA1_Internalname ;
   private String A12847RlrFchA1 ;
   private String edtRlrFchA1_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtClave1_Internalname ;
   private String A12845Clave1 ;
   private String edtClave1_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtRlrFchE1_Internalname ;
   private String A12848RlrFchE1 ;
   private String edtRlrFchE1_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtClave2_Internalname ;
   private String A12846Clave2 ;
   private String edtClave2_Jsonclick ;
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
   private String AV32EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sMode1190 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ8715RlrUsu ;
   private String ZZ8719RlrTrCod ;
   private String ZZ12847RlrFchA1 ;
   private String ZZ12845Clave1 ;
   private String ZZ12848RlrFchE1 ;
   private String ZZ12846Clave2 ;
   private java.util.Date Z8714RlrFch ;
   private java.util.Date A8714RlrFch ;
   private java.util.Date ZZ8714RlrFch ;
   private java.util.Date Z8716RlrFchA ;
   private java.util.Date Z8717RlrFchE ;
   private java.util.Date A8716RlrFchA ;
   private java.util.Date A8717RlrFchE ;
   private java.util.Date ZZ8716RlrFchA ;
   private java.util.Date ZZ8717RlrFchE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n8716RlrFchA ;
   private boolean n8717RlrFchE ;
   private boolean n8718RlrPgm ;
   private boolean n8719RlrTrCod ;
   private boolean n8720RlrDia ;
   private boolean n8721RlrDiaDif ;
   private boolean n8722RlrRnd ;
   private boolean n12847RlrFchA1 ;
   private boolean n12845Clave1 ;
   private boolean n12848RlrFchE1 ;
   private boolean n12846Clave2 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z8718RlrPgm ;
   private String A8718RlrPgm ;
   private String ZZ8718RlrPgm ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T012N4_A8714RlrFch ;
   private String[] T012N4_A8715RlrUsu ;
   private java.util.Date[] T012N4_A8716RlrFchA ;
   private boolean[] T012N4_n8716RlrFchA ;
   private java.util.Date[] T012N4_A8717RlrFchE ;
   private boolean[] T012N4_n8717RlrFchE ;
   private String[] T012N4_A8718RlrPgm ;
   private boolean[] T012N4_n8718RlrPgm ;
   private String[] T012N4_A8719RlrTrCod ;
   private boolean[] T012N4_n8719RlrTrCod ;
   private short[] T012N4_A8720RlrDia ;
   private boolean[] T012N4_n8720RlrDia ;
   private short[] T012N4_A8721RlrDiaDif ;
   private boolean[] T012N4_n8721RlrDiaDif ;
   private short[] T012N4_A8722RlrRnd ;
   private boolean[] T012N4_n8722RlrRnd ;
   private String[] T012N4_A12847RlrFchA1 ;
   private boolean[] T012N4_n12847RlrFchA1 ;
   private String[] T012N4_A12845Clave1 ;
   private boolean[] T012N4_n12845Clave1 ;
   private String[] T012N4_A12848RlrFchE1 ;
   private boolean[] T012N4_n12848RlrFchE1 ;
   private String[] T012N4_A12846Clave2 ;
   private boolean[] T012N4_n12846Clave2 ;
   private java.util.Date[] T012N5_A8714RlrFch ;
   private String[] T012N5_A8715RlrUsu ;
   private java.util.Date[] T012N3_A8714RlrFch ;
   private String[] T012N3_A8715RlrUsu ;
   private java.util.Date[] T012N3_A8716RlrFchA ;
   private boolean[] T012N3_n8716RlrFchA ;
   private java.util.Date[] T012N3_A8717RlrFchE ;
   private boolean[] T012N3_n8717RlrFchE ;
   private String[] T012N3_A8718RlrPgm ;
   private boolean[] T012N3_n8718RlrPgm ;
   private String[] T012N3_A8719RlrTrCod ;
   private boolean[] T012N3_n8719RlrTrCod ;
   private short[] T012N3_A8720RlrDia ;
   private boolean[] T012N3_n8720RlrDia ;
   private short[] T012N3_A8721RlrDiaDif ;
   private boolean[] T012N3_n8721RlrDiaDif ;
   private short[] T012N3_A8722RlrRnd ;
   private boolean[] T012N3_n8722RlrRnd ;
   private String[] T012N3_A12847RlrFchA1 ;
   private boolean[] T012N3_n12847RlrFchA1 ;
   private String[] T012N3_A12845Clave1 ;
   private boolean[] T012N3_n12845Clave1 ;
   private String[] T012N3_A12848RlrFchE1 ;
   private boolean[] T012N3_n12848RlrFchE1 ;
   private String[] T012N3_A12846Clave2 ;
   private boolean[] T012N3_n12846Clave2 ;
   private java.util.Date[] T012N6_A8714RlrFch ;
   private String[] T012N6_A8715RlrUsu ;
   private java.util.Date[] T012N7_A8714RlrFch ;
   private String[] T012N7_A8715RlrUsu ;
   private java.util.Date[] T012N2_A8714RlrFch ;
   private String[] T012N2_A8715RlrUsu ;
   private java.util.Date[] T012N2_A8716RlrFchA ;
   private boolean[] T012N2_n8716RlrFchA ;
   private java.util.Date[] T012N2_A8717RlrFchE ;
   private boolean[] T012N2_n8717RlrFchE ;
   private String[] T012N2_A8718RlrPgm ;
   private boolean[] T012N2_n8718RlrPgm ;
   private String[] T012N2_A8719RlrTrCod ;
   private boolean[] T012N2_n8719RlrTrCod ;
   private short[] T012N2_A8720RlrDia ;
   private boolean[] T012N2_n8720RlrDia ;
   private short[] T012N2_A8721RlrDiaDif ;
   private boolean[] T012N2_n8721RlrDiaDif ;
   private short[] T012N2_A8722RlrRnd ;
   private boolean[] T012N2_n8722RlrRnd ;
   private String[] T012N2_A12847RlrFchA1 ;
   private boolean[] T012N2_n12847RlrFchA1 ;
   private String[] T012N2_A12845Clave1 ;
   private boolean[] T012N2_n12845Clave1 ;
   private String[] T012N2_A12848RlrFchE1 ;
   private boolean[] T012N2_n12848RlrFchE1 ;
   private String[] T012N2_A12846Clave2 ;
   private boolean[] T012N2_n12846Clave2 ;
   private java.util.Date[] T012N11_A8714RlrFch ;
   private String[] T012N11_A8715RlrUsu ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trlicrn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trlicrn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trlicrn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trlicrn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trlicrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012N2", "SELECT RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, RlrFchA1, Clave1, RlrFchE1, Clave2 FROM TXPRLICRN WHERE RlrFch = ? AND RlrUsu = ?  FOR UPDATE OF RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, RlrFchA1, Clave1, RlrFchE1, Clave2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012N3", "SELECT RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, RlrFchA1, Clave1, RlrFchE1, Clave2 FROM TXPRLICRN WHERE RlrFch = ? AND RlrUsu = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012N4", "SELECT /*+ FIRST_ROWS(100) */ TM1.RlrFch, TM1.RlrUsu, TM1.RlrFchA, TM1.RlrFchE, TM1.RlrPgm, TM1.RlrTrCod, TM1.RlrDia, TM1.RlrDiaDif, TM1.RlrRnd, TM1.RlrFchA1, TM1.Clave1, TM1.RlrFchE1, TM1.Clave2 FROM TXPRLICRN TM1 WHERE TM1.RlrFch = ? and TM1.RlrUsu = ? ORDER BY TM1.RlrFch, TM1.RlrUsu ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012N5", "SELECT /*+ FIRST_ROWS(1) */ RlrFch, RlrUsu FROM TXPRLICRN WHERE RlrFch = ? AND RlrUsu = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012N6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RlrFch, RlrUsu FROM TXPRLICRN WHERE ( RlrFch > ? or RlrFch = ? and RlrUsu > ?) ORDER BY RlrFch, RlrUsu) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012N7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RlrFch, RlrUsu FROM TXPRLICRN WHERE ( RlrFch < ? or RlrFch = ? and RlrUsu < ?) ORDER BY RlrFch DESC, RlrUsu DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012N8", "INSERT INTO TXPRLICRN(RlrFch, RlrUsu, RlrFchA, RlrFchE, RlrPgm, RlrTrCod, RlrDia, RlrDiaDif, RlrRnd, RlrFchA1, Clave1, RlrFchE1, Clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRLICRN")
         ,new UpdateCursor("T012N9", "UPDATE TXPRLICRN SET RlrFchA=?, RlrFchE=?, RlrPgm=?, RlrTrCod=?, RlrDia=?, RlrDiaDif=?, RlrRnd=?, RlrFchA1=?, Clave1=?, RlrFchE1=?, Clave2=?  WHERE RlrFch = ? AND RlrUsu = ?", GX_NOMASK, "TXPRLICRN")
         ,new UpdateCursor("T012N10", "DELETE FROM TXPRLICRN  WHERE RlrFch = ? AND RlrUsu = ?", GX_NOMASK, "TXPRLICRN")
         ,new ForEachCursor("T012N11", "SELECT /*+ FIRST_ROWS(100) */ RlrFch, RlrUsu FROM TXPRLICRN ORDER BY RlrFch, RlrUsu ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 32);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 32);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 32);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 32);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 32);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 32);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 32);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 32);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 32);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 32);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 32);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 32);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 9 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 5 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 6 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 32);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 32);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 32);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 32);
               }
               return;
            case 7 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 32);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 32);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 32);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 32);
               }
               stmt.setDateTime(12, (java.util.Date)parms[22], false);
               stmt.setString(13, (String)parms[23], 8);
               return;
            case 8 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

