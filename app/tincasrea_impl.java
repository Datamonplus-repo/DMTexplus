package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tincasrea_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INCASREA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tincasrea_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tincasrea_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tincasrea_impl.class ));
   }

   public tincasrea_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TINCASREA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "ID", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVID_Internalname, GXutil.ltrim( localUtil.ntoc( A13254VID, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13254VID), "ZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13254VID), "ZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVID_Jsonclick, 0, "", "", "", "", "", 1, edtVID_Enabled, 0, "text", "1", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "TIPOPER", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTIPOPER_Internalname, GXutil.rtrim( A13255VTIPOPER), GXutil.rtrim( localUtil.format( A13255VTIPOPER, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTIPOPER_Jsonclick, 0, "", "", "", "", "", 1, edtVTIPOPER_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "FECGRA", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVFECGRA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVFECGRA_Internalname, localUtil.format(A13256VFECGRA, "99/99/99"), localUtil.format( A13256VFECGRA, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVFECGRA_Jsonclick, 0, "", "", "", "", "", 1, edtVFECGRA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVFECGRA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVFECGRA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TINCASREA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "HORGRA", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVHORGRA_Internalname, GXutil.rtrim( A13257VHORGRA), GXutil.rtrim( localUtil.format( A13257VHORGRA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVHORGRA_Jsonclick, 0, "", "", "", "", "", 1, edtVHORGRA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "FECLEC", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVFECLEC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVFECLEC_Internalname, localUtil.format(A13258VFECLEC, "99/99/99"), localUtil.format( A13258VFECLEC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVFECLEC_Jsonclick, 0, "", "", "", "", "", 1, edtVFECLEC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVFECLEC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVFECLEC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TINCASREA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "HORLEC", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVHORLEC_Internalname, GXutil.rtrim( A13259VHORLEC), GXutil.rtrim( localUtil.format( A13259VHORLEC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVHORLEC_Jsonclick, 0, "", "", "", "", "", 1, edtVHORLEC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "STATUS", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVSTATUS_Internalname, GXutil.rtrim( A13260VSTATUS), GXutil.rtrim( localUtil.format( A13260VSTATUS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVSTATUS_Jsonclick, 0, "", "", "", "", "", 1, edtVSTATUS_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "ERRDES", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtVERRDES_Internalname, GXutil.rtrim( A13261VERRDES), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", (short)(0), 1, edtVERRDES_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "250", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "SERIE", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVSERIE_Internalname, GXutil.ltrim( localUtil.ntoc( A13262VSERIE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVSERIE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13262VSERIE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13262VSERIE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVSERIE_Jsonclick, 0, "", "", "", "", "", 1, edtVSERIE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "COLOR", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVCOLOR_Internalname, GXutil.ltrim( localUtil.ntoc( A13263VCOLOR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVCOLOR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13263VCOLOR), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13263VCOLOR), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVCOLOR_Jsonclick, 0, "", "", "", "", "", 1, edtVCOLOR_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "PIEZA", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVPIEZA_Internalname, GXutil.rtrim( A13264VPIEZA), GXutil.rtrim( localUtil.format( A13264VPIEZA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVPIEZA_Jsonclick, 0, "", "", "", "", "", 1, edtVPIEZA_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "METROS", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVMETROS_Internalname, GXutil.ltrim( localUtil.ntoc( A13265VMETROS, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVMETROS_Enabled!=0) ? localUtil.format( A13265VMETROS, "ZZZZ9.99") : localUtil.format( A13265VMETROS, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVMETROS_Jsonclick, 0, "", "", "", "", "", 1, edtVMETROS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "ABONO", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVABONO_Internalname, GXutil.ltrim( localUtil.ntoc( A13266VABONO, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVABONO_Enabled!=0) ? localUtil.format( A13266VABONO, "ZZZZ9.99") : localUtil.format( A13266VABONO, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVABONO_Jsonclick, 0, "", "", "", "", "", 1, edtVABONO_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "KILOS", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVKILOS_Internalname, GXutil.ltrim( localUtil.ntoc( A13267VKILOS, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVKILOS_Enabled!=0) ? localUtil.format( A13267VKILOS, "ZZZZ9.99") : localUtil.format( A13267VKILOS, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVKILOS_Jsonclick, 0, "", "", "", "", "", 1, edtVKILOS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "DATA", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVDATA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVDATA_Internalname, localUtil.format(A13268VDATA, "99/99/99"), localUtil.format( A13268VDATA, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVDATA_Jsonclick, 0, "", "", "", "", "", 1, edtVDATA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVDATA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVDATA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TINCASREA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "ALBARA", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVALBARA_Internalname, GXutil.ltrim( localUtil.ntoc( A13269VALBARA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVALBARA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13269VALBARA), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13269VALBARA), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVALBARA_Jsonclick, 0, "", "", "", "", "", 1, edtVALBARA_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "TARA1", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTARA1_Internalname, GXutil.ltrim( localUtil.ntoc( A13270VTARA1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVTARA1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13270VTARA1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13270VTARA1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTARA1_Jsonclick, 0, "", "", "", "", "", 1, edtVTARA1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "TARA2", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTARA2_Internalname, GXutil.ltrim( localUtil.ntoc( A13271VTARA2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVTARA2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13271VTARA2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13271VTARA2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTARA2_Jsonclick, 0, "", "", "", "", "", 1, edtVTARA2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "TARA3", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTARA3_Internalname, GXutil.ltrim( localUtil.ntoc( A13272VTARA3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVTARA3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13272VTARA3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13272VTARA3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTARA3_Jsonclick, 0, "", "", "", "", "", 1, edtVTARA3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "TARA4", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTARA4_Internalname, GXutil.ltrim( localUtil.ntoc( A13273VTARA4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVTARA4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13273VTARA4), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13273VTARA4), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTARA4_Jsonclick, 0, "", "", "", "", "", 1, edtVTARA4_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "SERIEVIN", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVSERIEVIN_Internalname, GXutil.rtrim( A13274VSERIEVIN), GXutil.rtrim( localUtil.format( A13274VSERIEVIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVSERIEVIN_Jsonclick, 0, "", "", "", "", "", 1, edtVSERIEVIN_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "USUARI", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVUSUARI_Internalname, GXutil.rtrim( A13275VUSUARI), GXutil.rtrim( localUtil.format( A13275VUSUARI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVUSUARI_Jsonclick, 0, "", "", "", "", "", 1, edtVUSUARI_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "NTARA1", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVNTARA1_Internalname, GXutil.ltrim( localUtil.ntoc( A13276VNTARA1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVNTARA1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13276VNTARA1), "9") : localUtil.format( DecimalUtil.doubleToDec(A13276VNTARA1), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVNTARA1_Jsonclick, 0, "", "", "", "", "", 1, edtVNTARA1_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "NTARA2", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVNTARA2_Internalname, GXutil.ltrim( localUtil.ntoc( A13277VNTARA2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVNTARA2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13277VNTARA2), "9") : localUtil.format( DecimalUtil.doubleToDec(A13277VNTARA2), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVNTARA2_Jsonclick, 0, "", "", "", "", "", 1, edtVNTARA2_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "NTARA3", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVNTARA3_Internalname, GXutil.ltrim( localUtil.ntoc( A13278VNTARA3, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVNTARA3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13278VNTARA3), "9") : localUtil.format( DecimalUtil.doubleToDec(A13278VNTARA3), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVNTARA3_Jsonclick, 0, "", "", "", "", "", 1, edtVNTARA3_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "NTARA4", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVNTARA4_Internalname, GXutil.ltrim( localUtil.ntoc( A13279VNTARA4, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVNTARA4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13279VNTARA4), "9") : localUtil.format( DecimalUtil.doubleToDec(A13279VNTARA4), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVNTARA4_Jsonclick, 0, "", "", "", "", "", 1, edtVNTARA4_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "A_ REPAS", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVA_REPAS_Internalname, GXutil.rtrim( A13280VA_REPAS), GXutil.rtrim( localUtil.format( A13280VA_REPAS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVA_REPAS_Jsonclick, 0, "", "", "", "", "", 1, edtVA_REPAS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "DESTINO", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVDESTINO_Internalname, GXutil.ltrim( localUtil.ntoc( A13281VDESTINO, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVDESTINO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13281VDESTINO), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13281VDESTINO), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVDESTINO_Jsonclick, 0, "", "", "", "", "", 1, edtVDESTINO_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "CLIENTE", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVCLIENTE_Internalname, GXutil.ltrim( localUtil.ntoc( A13282VCLIENTE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVCLIENTE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13282VCLIENTE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13282VCLIENTE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVCLIENTE_Jsonclick, 0, "", "", "", "", "", 1, edtVCLIENTE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "PEDIDO", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVPEDIDO_Internalname, GXutil.ltrim( localUtil.ntoc( A13283VPEDIDO, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVPEDIDO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13283VPEDIDO), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13283VPEDIDO), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVPEDIDO_Jsonclick, 0, "", "", "", "", "", 1, edtVPEDIDO_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "OBSER", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVOBSER_Internalname, A13284VOBSER, A13284VOBSER, TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVOBSER_Jsonclick, 0, "", "", "", "", "", 1, edtVOBSER_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "CALIDAD", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVCALIDAD_Internalname, GXutil.ltrim( localUtil.ntoc( A13285VCALIDAD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVCALIDAD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13285VCALIDAD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13285VCALIDAD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVCALIDAD_Jsonclick, 0, "", "", "", "", "", 1, edtVCALIDAD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "LINEA", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVLINEA_Internalname, GXutil.ltrim( localUtil.ntoc( A13286VLINEA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVLINEA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13286VLINEA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13286VLINEA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVLINEA_Jsonclick, 0, "", "", "", "", "", 1, edtVLINEA_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "BARCADAX", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVBARCADAX_Internalname, GXutil.rtrim( A13287VBARCADAX), GXutil.rtrim( localUtil.format( A13287VBARCADAX, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVBARCADAX_Jsonclick, 0, "", "", "", "", "", 1, edtVBARCADAX_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "GABIA", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVGABIA_Internalname, GXutil.rtrim( A13288VGABIA), GXutil.rtrim( localUtil.format( A13288VGABIA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVGABIA_Jsonclick, 0, "", "", "", "", "", 1, edtVGABIA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "FINDISPO", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVFINDISPO_Internalname, GXutil.ltrim( localUtil.ntoc( A13289VFINDISPO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVFINDISPO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13289VFINDISPO), "9") : localUtil.format( DecimalUtil.doubleToDec(A13289VFINDISPO), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVFINDISPO_Jsonclick, 0, "", "", "", "", "", 1, edtVFINDISPO_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "CONTADO", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVCONTADO_Internalname, GXutil.rtrim( A13290VCONTADO), GXutil.rtrim( localUtil.format( A13290VCONTADO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVCONTADO_Jsonclick, 0, "", "", "", "", "", 1, edtVCONTADO_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINCASREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINCASREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TINCASREA.htm");
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
      e111NN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z13254VID = localUtil.ctol( httpContext.cgiGet( "Z13254VID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z13255VTIPOPER = httpContext.cgiGet( "Z13255VTIPOPER") ;
            Z13256VFECGRA = localUtil.ctod( httpContext.cgiGet( "Z13256VFECGRA"), 0) ;
            Z13257VHORGRA = httpContext.cgiGet( "Z13257VHORGRA") ;
            Z13258VFECLEC = localUtil.ctod( httpContext.cgiGet( "Z13258VFECLEC"), 0) ;
            Z13259VHORLEC = httpContext.cgiGet( "Z13259VHORLEC") ;
            Z13260VSTATUS = httpContext.cgiGet( "Z13260VSTATUS") ;
            Z13261VERRDES = httpContext.cgiGet( "Z13261VERRDES") ;
            Z13262VSERIE = (int)(localUtil.ctol( httpContext.cgiGet( "Z13262VSERIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13263VCOLOR = (short)(localUtil.ctol( httpContext.cgiGet( "Z13263VCOLOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13264VPIEZA = httpContext.cgiGet( "Z13264VPIEZA") ;
            Z13265VMETROS = localUtil.ctond( httpContext.cgiGet( "Z13265VMETROS")) ;
            Z13266VABONO = localUtil.ctond( httpContext.cgiGet( "Z13266VABONO")) ;
            Z13267VKILOS = localUtil.ctond( httpContext.cgiGet( "Z13267VKILOS")) ;
            Z13268VDATA = localUtil.ctod( httpContext.cgiGet( "Z13268VDATA"), 0) ;
            Z13269VALBARA = (int)(localUtil.ctol( httpContext.cgiGet( "Z13269VALBARA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13270VTARA1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13270VTARA1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13271VTARA2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13271VTARA2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13272VTARA3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13272VTARA3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13273VTARA4 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13273VTARA4"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13274VSERIEVIN = httpContext.cgiGet( "Z13274VSERIEVIN") ;
            Z13275VUSUARI = httpContext.cgiGet( "Z13275VUSUARI") ;
            Z13276VNTARA1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13276VNTARA1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13277VNTARA2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13277VNTARA2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13278VNTARA3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13278VNTARA3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13279VNTARA4 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13279VNTARA4"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13280VA_REPAS = httpContext.cgiGet( "Z13280VA_REPAS") ;
            Z13281VDESTINO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13281VDESTINO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13282VCLIENTE = (int)(localUtil.ctol( httpContext.cgiGet( "Z13282VCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13283VPEDIDO = (int)(localUtil.ctol( httpContext.cgiGet( "Z13283VPEDIDO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13285VCALIDAD = (short)(localUtil.ctol( httpContext.cgiGet( "Z13285VCALIDAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13286VLINEA = (short)(localUtil.ctol( httpContext.cgiGet( "Z13286VLINEA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13287VBARCADAX = httpContext.cgiGet( "Z13287VBARCADAX") ;
            Z13288VGABIA = httpContext.cgiGet( "Z13288VGABIA") ;
            Z13289VFINDISPO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13289VFINDISPO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13290VCONTADO = httpContext.cgiGet( "Z13290VCONTADO") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13254VID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
            }
            else
            {
               A13254VID = localUtil.ctol( httpContext.cgiGet( edtVID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
            }
            A13255VTIPOPER = httpContext.cgiGet( edtVTIPOPER_Internalname) ;
            n13255VTIPOPER = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13255VTIPOPER", A13255VTIPOPER);
            if ( localUtil.vcdate( httpContext.cgiGet( edtVFECGRA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VFECGRA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVFECGRA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13256VFECGRA = GXutil.nullDate() ;
               n13256VFECGRA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13256VFECGRA", localUtil.format(A13256VFECGRA, "99/99/99"));
            }
            else
            {
               A13256VFECGRA = localUtil.ctod( httpContext.cgiGet( edtVFECGRA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13256VFECGRA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13256VFECGRA", localUtil.format(A13256VFECGRA, "99/99/99"));
            }
            A13257VHORGRA = httpContext.cgiGet( edtVHORGRA_Internalname) ;
            n13257VHORGRA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13257VHORGRA", A13257VHORGRA);
            if ( localUtil.vcdate( httpContext.cgiGet( edtVFECLEC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VFECLEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVFECLEC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13258VFECLEC = GXutil.nullDate() ;
               n13258VFECLEC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13258VFECLEC", localUtil.format(A13258VFECLEC, "99/99/99"));
            }
            else
            {
               A13258VFECLEC = localUtil.ctod( httpContext.cgiGet( edtVFECLEC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13258VFECLEC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13258VFECLEC", localUtil.format(A13258VFECLEC, "99/99/99"));
            }
            A13259VHORLEC = httpContext.cgiGet( edtVHORLEC_Internalname) ;
            n13259VHORLEC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13259VHORLEC", A13259VHORLEC);
            A13260VSTATUS = httpContext.cgiGet( edtVSTATUS_Internalname) ;
            n13260VSTATUS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13260VSTATUS", A13260VSTATUS);
            A13261VERRDES = httpContext.cgiGet( edtVERRDES_Internalname) ;
            n13261VERRDES = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13261VERRDES", A13261VERRDES);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVSERIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVSERIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VSERIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVSERIE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13262VSERIE = 0 ;
               n13262VSERIE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13262VSERIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13262VSERIE), 6, 0));
            }
            else
            {
               A13262VSERIE = (int)(localUtil.ctol( httpContext.cgiGet( edtVSERIE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13262VSERIE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13262VSERIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13262VSERIE), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVCOLOR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVCOLOR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VCOLOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVCOLOR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13263VCOLOR = (short)(0) ;
               n13263VCOLOR = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13263VCOLOR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13263VCOLOR), 4, 0));
            }
            else
            {
               A13263VCOLOR = (short)(localUtil.ctol( httpContext.cgiGet( edtVCOLOR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13263VCOLOR = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13263VCOLOR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13263VCOLOR), 4, 0));
            }
            A13264VPIEZA = httpContext.cgiGet( edtVPIEZA_Internalname) ;
            n13264VPIEZA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13264VPIEZA", A13264VPIEZA);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVMETROS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVMETROS_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VMETROS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVMETROS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13265VMETROS = DecimalUtil.ZERO ;
               n13265VMETROS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13265VMETROS", GXutil.ltrimstr( A13265VMETROS, 8, 2));
            }
            else
            {
               A13265VMETROS = localUtil.ctond( httpContext.cgiGet( edtVMETROS_Internalname)) ;
               n13265VMETROS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13265VMETROS", GXutil.ltrimstr( A13265VMETROS, 8, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVABONO_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVABONO_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VABONO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVABONO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13266VABONO = DecimalUtil.ZERO ;
               n13266VABONO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13266VABONO", GXutil.ltrimstr( A13266VABONO, 8, 2));
            }
            else
            {
               A13266VABONO = localUtil.ctond( httpContext.cgiGet( edtVABONO_Internalname)) ;
               n13266VABONO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13266VABONO", GXutil.ltrimstr( A13266VABONO, 8, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVKILOS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVKILOS_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VKILOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVKILOS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13267VKILOS = DecimalUtil.ZERO ;
               n13267VKILOS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13267VKILOS", GXutil.ltrimstr( A13267VKILOS, 8, 2));
            }
            else
            {
               A13267VKILOS = localUtil.ctond( httpContext.cgiGet( edtVKILOS_Internalname)) ;
               n13267VKILOS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13267VKILOS", GXutil.ltrimstr( A13267VKILOS, 8, 2));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtVDATA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VDATA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVDATA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13268VDATA = GXutil.nullDate() ;
               n13268VDATA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13268VDATA", localUtil.format(A13268VDATA, "99/99/99"));
            }
            else
            {
               A13268VDATA = localUtil.ctod( httpContext.cgiGet( edtVDATA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13268VDATA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13268VDATA", localUtil.format(A13268VDATA, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVALBARA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVALBARA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VALBARA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVALBARA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13269VALBARA = 0 ;
               n13269VALBARA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13269VALBARA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13269VALBARA), 6, 0));
            }
            else
            {
               A13269VALBARA = (int)(localUtil.ctol( httpContext.cgiGet( edtVALBARA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13269VALBARA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13269VALBARA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13269VALBARA), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTARA1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTARA1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13270VTARA1 = (short)(0) ;
               n13270VTARA1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13270VTARA1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13270VTARA1), 3, 0));
            }
            else
            {
               A13270VTARA1 = (short)(localUtil.ctol( httpContext.cgiGet( edtVTARA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13270VTARA1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13270VTARA1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13270VTARA1), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTARA2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTARA2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13271VTARA2 = (short)(0) ;
               n13271VTARA2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13271VTARA2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13271VTARA2), 3, 0));
            }
            else
            {
               A13271VTARA2 = (short)(localUtil.ctol( httpContext.cgiGet( edtVTARA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13271VTARA2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13271VTARA2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13271VTARA2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTARA3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTARA3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13272VTARA3 = (short)(0) ;
               n13272VTARA3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13272VTARA3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13272VTARA3), 3, 0));
            }
            else
            {
               A13272VTARA3 = (short)(localUtil.ctol( httpContext.cgiGet( edtVTARA3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13272VTARA3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13272VTARA3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13272VTARA3), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVTARA4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTARA4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTARA4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13273VTARA4 = (short)(0) ;
               n13273VTARA4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13273VTARA4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13273VTARA4), 3, 0));
            }
            else
            {
               A13273VTARA4 = (short)(localUtil.ctol( httpContext.cgiGet( edtVTARA4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13273VTARA4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13273VTARA4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13273VTARA4), 3, 0));
            }
            A13274VSERIEVIN = httpContext.cgiGet( edtVSERIEVIN_Internalname) ;
            n13274VSERIEVIN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13274VSERIEVIN", A13274VSERIEVIN);
            A13275VUSUARI = httpContext.cgiGet( edtVUSUARI_Internalname) ;
            n13275VUSUARI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13275VUSUARI", A13275VUSUARI);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VNTARA1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVNTARA1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13276VNTARA1 = (byte)(0) ;
               n13276VNTARA1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13276VNTARA1", GXutil.str( A13276VNTARA1, 1, 0));
            }
            else
            {
               A13276VNTARA1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtVNTARA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13276VNTARA1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13276VNTARA1", GXutil.str( A13276VNTARA1, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VNTARA2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVNTARA2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13277VNTARA2 = (byte)(0) ;
               n13277VNTARA2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13277VNTARA2", GXutil.str( A13277VNTARA2, 1, 0));
            }
            else
            {
               A13277VNTARA2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtVNTARA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13277VNTARA2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13277VNTARA2", GXutil.str( A13277VNTARA2, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VNTARA3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVNTARA3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13278VNTARA3 = (byte)(0) ;
               n13278VNTARA3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13278VNTARA3", GXutil.str( A13278VNTARA3, 1, 0));
            }
            else
            {
               A13278VNTARA3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtVNTARA3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13278VNTARA3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13278VNTARA3", GXutil.str( A13278VNTARA3, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVNTARA4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VNTARA4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVNTARA4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13279VNTARA4 = (byte)(0) ;
               n13279VNTARA4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13279VNTARA4", GXutil.str( A13279VNTARA4, 1, 0));
            }
            else
            {
               A13279VNTARA4 = (byte)(localUtil.ctol( httpContext.cgiGet( edtVNTARA4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13279VNTARA4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13279VNTARA4", GXutil.str( A13279VNTARA4, 1, 0));
            }
            A13280VA_REPAS = httpContext.cgiGet( edtVA_REPAS_Internalname) ;
            n13280VA_REPAS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13280VA_REPAS", A13280VA_REPAS);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVDESTINO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVDESTINO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VDESTINO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVDESTINO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13281VDESTINO = (byte)(0) ;
               n13281VDESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13281VDESTINO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13281VDESTINO), 2, 0));
            }
            else
            {
               A13281VDESTINO = (byte)(localUtil.ctol( httpContext.cgiGet( edtVDESTINO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13281VDESTINO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13281VDESTINO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13281VDESTINO), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVCLIENTE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVCLIENTE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VCLIENTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVCLIENTE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13282VCLIENTE = 0 ;
               n13282VCLIENTE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13282VCLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13282VCLIENTE), 6, 0));
            }
            else
            {
               A13282VCLIENTE = (int)(localUtil.ctol( httpContext.cgiGet( edtVCLIENTE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13282VCLIENTE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13282VCLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13282VCLIENTE), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVPEDIDO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVPEDIDO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VPEDIDO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVPEDIDO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13283VPEDIDO = 0 ;
               n13283VPEDIDO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13283VPEDIDO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13283VPEDIDO), 6, 0));
            }
            else
            {
               A13283VPEDIDO = (int)(localUtil.ctol( httpContext.cgiGet( edtVPEDIDO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13283VPEDIDO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13283VPEDIDO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13283VPEDIDO), 6, 0));
            }
            A13284VOBSER = httpContext.cgiGet( edtVOBSER_Internalname) ;
            n13284VOBSER = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13284VOBSER", A13284VOBSER);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVCALIDAD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVCALIDAD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VCALIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVCALIDAD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13285VCALIDAD = (short)(0) ;
               n13285VCALIDAD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13285VCALIDAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13285VCALIDAD), 4, 0));
            }
            else
            {
               A13285VCALIDAD = (short)(localUtil.ctol( httpContext.cgiGet( edtVCALIDAD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13285VCALIDAD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13285VCALIDAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13285VCALIDAD), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVLINEA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVLINEA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VLINEA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVLINEA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13286VLINEA = (short)(0) ;
               n13286VLINEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13286VLINEA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13286VLINEA), 4, 0));
            }
            else
            {
               A13286VLINEA = (short)(localUtil.ctol( httpContext.cgiGet( edtVLINEA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13286VLINEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13286VLINEA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13286VLINEA), 4, 0));
            }
            A13287VBARCADAX = httpContext.cgiGet( edtVBARCADAX_Internalname) ;
            n13287VBARCADAX = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13287VBARCADAX", A13287VBARCADAX);
            A13288VGABIA = httpContext.cgiGet( edtVGABIA_Internalname) ;
            n13288VGABIA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13288VGABIA", A13288VGABIA);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVFINDISPO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVFINDISPO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VFINDISPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVFINDISPO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13289VFINDISPO = (byte)(0) ;
               n13289VFINDISPO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13289VFINDISPO", GXutil.str( A13289VFINDISPO, 1, 0));
            }
            else
            {
               A13289VFINDISPO = (byte)(localUtil.ctol( httpContext.cgiGet( edtVFINDISPO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13289VFINDISPO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13289VFINDISPO", GXutil.str( A13289VFINDISPO, 1, 0));
            }
            A13290VCONTADO = httpContext.cgiGet( edtVCONTADO_Internalname) ;
            n13290VCONTADO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13290VCONTADO", A13290VCONTADO);
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
               A13254VID = GXutil.lval( httpContext.GetPar( "VID")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
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
                        e111NN2 ();
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
            initAll1NN1816( ) ;
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
      disableAttributes1NN1816( ) ;
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

   public void confirm_1NN0( )
   {
      beforeValidate1NN1816( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NN1816( ) ;
         }
         else
         {
            checkExtendedTable1NN1816( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1NN1816( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1NN0( ) ;
      }
   }

   public void resetCaption1NN0( )
   {
   }

   public void e111NN2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm1NN1816( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13255VTIPOPER = T01NN3_A13255VTIPOPER[0] ;
            Z13256VFECGRA = T01NN3_A13256VFECGRA[0] ;
            Z13257VHORGRA = T01NN3_A13257VHORGRA[0] ;
            Z13258VFECLEC = T01NN3_A13258VFECLEC[0] ;
            Z13259VHORLEC = T01NN3_A13259VHORLEC[0] ;
            Z13260VSTATUS = T01NN3_A13260VSTATUS[0] ;
            Z13261VERRDES = T01NN3_A13261VERRDES[0] ;
            Z13262VSERIE = T01NN3_A13262VSERIE[0] ;
            Z13263VCOLOR = T01NN3_A13263VCOLOR[0] ;
            Z13264VPIEZA = T01NN3_A13264VPIEZA[0] ;
            Z13265VMETROS = T01NN3_A13265VMETROS[0] ;
            Z13266VABONO = T01NN3_A13266VABONO[0] ;
            Z13267VKILOS = T01NN3_A13267VKILOS[0] ;
            Z13268VDATA = T01NN3_A13268VDATA[0] ;
            Z13269VALBARA = T01NN3_A13269VALBARA[0] ;
            Z13270VTARA1 = T01NN3_A13270VTARA1[0] ;
            Z13271VTARA2 = T01NN3_A13271VTARA2[0] ;
            Z13272VTARA3 = T01NN3_A13272VTARA3[0] ;
            Z13273VTARA4 = T01NN3_A13273VTARA4[0] ;
            Z13274VSERIEVIN = T01NN3_A13274VSERIEVIN[0] ;
            Z13275VUSUARI = T01NN3_A13275VUSUARI[0] ;
            Z13276VNTARA1 = T01NN3_A13276VNTARA1[0] ;
            Z13277VNTARA2 = T01NN3_A13277VNTARA2[0] ;
            Z13278VNTARA3 = T01NN3_A13278VNTARA3[0] ;
            Z13279VNTARA4 = T01NN3_A13279VNTARA4[0] ;
            Z13280VA_REPAS = T01NN3_A13280VA_REPAS[0] ;
            Z13281VDESTINO = T01NN3_A13281VDESTINO[0] ;
            Z13282VCLIENTE = T01NN3_A13282VCLIENTE[0] ;
            Z13283VPEDIDO = T01NN3_A13283VPEDIDO[0] ;
            Z13285VCALIDAD = T01NN3_A13285VCALIDAD[0] ;
            Z13286VLINEA = T01NN3_A13286VLINEA[0] ;
            Z13287VBARCADAX = T01NN3_A13287VBARCADAX[0] ;
            Z13288VGABIA = T01NN3_A13288VGABIA[0] ;
            Z13289VFINDISPO = T01NN3_A13289VFINDISPO[0] ;
            Z13290VCONTADO = T01NN3_A13290VCONTADO[0] ;
         }
         else
         {
            Z13255VTIPOPER = A13255VTIPOPER ;
            Z13256VFECGRA = A13256VFECGRA ;
            Z13257VHORGRA = A13257VHORGRA ;
            Z13258VFECLEC = A13258VFECLEC ;
            Z13259VHORLEC = A13259VHORLEC ;
            Z13260VSTATUS = A13260VSTATUS ;
            Z13261VERRDES = A13261VERRDES ;
            Z13262VSERIE = A13262VSERIE ;
            Z13263VCOLOR = A13263VCOLOR ;
            Z13264VPIEZA = A13264VPIEZA ;
            Z13265VMETROS = A13265VMETROS ;
            Z13266VABONO = A13266VABONO ;
            Z13267VKILOS = A13267VKILOS ;
            Z13268VDATA = A13268VDATA ;
            Z13269VALBARA = A13269VALBARA ;
            Z13270VTARA1 = A13270VTARA1 ;
            Z13271VTARA2 = A13271VTARA2 ;
            Z13272VTARA3 = A13272VTARA3 ;
            Z13273VTARA4 = A13273VTARA4 ;
            Z13274VSERIEVIN = A13274VSERIEVIN ;
            Z13275VUSUARI = A13275VUSUARI ;
            Z13276VNTARA1 = A13276VNTARA1 ;
            Z13277VNTARA2 = A13277VNTARA2 ;
            Z13278VNTARA3 = A13278VNTARA3 ;
            Z13279VNTARA4 = A13279VNTARA4 ;
            Z13280VA_REPAS = A13280VA_REPAS ;
            Z13281VDESTINO = A13281VDESTINO ;
            Z13282VCLIENTE = A13282VCLIENTE ;
            Z13283VPEDIDO = A13283VPEDIDO ;
            Z13285VCALIDAD = A13285VCALIDAD ;
            Z13286VLINEA = A13286VLINEA ;
            Z13287VBARCADAX = A13287VBARCADAX ;
            Z13288VGABIA = A13288VGABIA ;
            Z13289VFINDISPO = A13289VFINDISPO ;
            Z13290VCONTADO = A13290VCONTADO ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13254VID = A13254VID ;
         Z13255VTIPOPER = A13255VTIPOPER ;
         Z13256VFECGRA = A13256VFECGRA ;
         Z13257VHORGRA = A13257VHORGRA ;
         Z13258VFECLEC = A13258VFECLEC ;
         Z13259VHORLEC = A13259VHORLEC ;
         Z13260VSTATUS = A13260VSTATUS ;
         Z13261VERRDES = A13261VERRDES ;
         Z13262VSERIE = A13262VSERIE ;
         Z13263VCOLOR = A13263VCOLOR ;
         Z13264VPIEZA = A13264VPIEZA ;
         Z13265VMETROS = A13265VMETROS ;
         Z13266VABONO = A13266VABONO ;
         Z13267VKILOS = A13267VKILOS ;
         Z13268VDATA = A13268VDATA ;
         Z13269VALBARA = A13269VALBARA ;
         Z13270VTARA1 = A13270VTARA1 ;
         Z13271VTARA2 = A13271VTARA2 ;
         Z13272VTARA3 = A13272VTARA3 ;
         Z13273VTARA4 = A13273VTARA4 ;
         Z13274VSERIEVIN = A13274VSERIEVIN ;
         Z13275VUSUARI = A13275VUSUARI ;
         Z13276VNTARA1 = A13276VNTARA1 ;
         Z13277VNTARA2 = A13277VNTARA2 ;
         Z13278VNTARA3 = A13278VNTARA3 ;
         Z13279VNTARA4 = A13279VNTARA4 ;
         Z13280VA_REPAS = A13280VA_REPAS ;
         Z13281VDESTINO = A13281VDESTINO ;
         Z13282VCLIENTE = A13282VCLIENTE ;
         Z13283VPEDIDO = A13283VPEDIDO ;
         Z13284VOBSER = A13284VOBSER ;
         Z13285VCALIDAD = A13285VCALIDAD ;
         Z13286VLINEA = A13286VLINEA ;
         Z13287VBARCADAX = A13287VBARCADAX ;
         Z13288VGABIA = A13288VGABIA ;
         Z13289VFINDISPO = A13289VFINDISPO ;
         Z13290VCONTADO = A13290VCONTADO ;
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

   public void load1NN1816( )
   {
      /* Using cursor T01NN4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A13254VID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1816 = (short)(1) ;
         A13284VOBSER = T01NN4_A13284VOBSER[0] ;
         n13284VOBSER = T01NN4_n13284VOBSER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13284VOBSER", A13284VOBSER);
         A13255VTIPOPER = T01NN4_A13255VTIPOPER[0] ;
         n13255VTIPOPER = T01NN4_n13255VTIPOPER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13255VTIPOPER", A13255VTIPOPER);
         A13256VFECGRA = T01NN4_A13256VFECGRA[0] ;
         n13256VFECGRA = T01NN4_n13256VFECGRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13256VFECGRA", localUtil.format(A13256VFECGRA, "99/99/99"));
         A13257VHORGRA = T01NN4_A13257VHORGRA[0] ;
         n13257VHORGRA = T01NN4_n13257VHORGRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13257VHORGRA", A13257VHORGRA);
         A13258VFECLEC = T01NN4_A13258VFECLEC[0] ;
         n13258VFECLEC = T01NN4_n13258VFECLEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13258VFECLEC", localUtil.format(A13258VFECLEC, "99/99/99"));
         A13259VHORLEC = T01NN4_A13259VHORLEC[0] ;
         n13259VHORLEC = T01NN4_n13259VHORLEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13259VHORLEC", A13259VHORLEC);
         A13260VSTATUS = T01NN4_A13260VSTATUS[0] ;
         n13260VSTATUS = T01NN4_n13260VSTATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13260VSTATUS", A13260VSTATUS);
         A13261VERRDES = T01NN4_A13261VERRDES[0] ;
         n13261VERRDES = T01NN4_n13261VERRDES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13261VERRDES", A13261VERRDES);
         A13262VSERIE = T01NN4_A13262VSERIE[0] ;
         n13262VSERIE = T01NN4_n13262VSERIE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13262VSERIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13262VSERIE), 6, 0));
         A13263VCOLOR = T01NN4_A13263VCOLOR[0] ;
         n13263VCOLOR = T01NN4_n13263VCOLOR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13263VCOLOR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13263VCOLOR), 4, 0));
         A13264VPIEZA = T01NN4_A13264VPIEZA[0] ;
         n13264VPIEZA = T01NN4_n13264VPIEZA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13264VPIEZA", A13264VPIEZA);
         A13265VMETROS = T01NN4_A13265VMETROS[0] ;
         n13265VMETROS = T01NN4_n13265VMETROS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13265VMETROS", GXutil.ltrimstr( A13265VMETROS, 8, 2));
         A13266VABONO = T01NN4_A13266VABONO[0] ;
         n13266VABONO = T01NN4_n13266VABONO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13266VABONO", GXutil.ltrimstr( A13266VABONO, 8, 2));
         A13267VKILOS = T01NN4_A13267VKILOS[0] ;
         n13267VKILOS = T01NN4_n13267VKILOS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13267VKILOS", GXutil.ltrimstr( A13267VKILOS, 8, 2));
         A13268VDATA = T01NN4_A13268VDATA[0] ;
         n13268VDATA = T01NN4_n13268VDATA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13268VDATA", localUtil.format(A13268VDATA, "99/99/99"));
         A13269VALBARA = T01NN4_A13269VALBARA[0] ;
         n13269VALBARA = T01NN4_n13269VALBARA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13269VALBARA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13269VALBARA), 6, 0));
         A13270VTARA1 = T01NN4_A13270VTARA1[0] ;
         n13270VTARA1 = T01NN4_n13270VTARA1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13270VTARA1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13270VTARA1), 3, 0));
         A13271VTARA2 = T01NN4_A13271VTARA2[0] ;
         n13271VTARA2 = T01NN4_n13271VTARA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13271VTARA2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13271VTARA2), 3, 0));
         A13272VTARA3 = T01NN4_A13272VTARA3[0] ;
         n13272VTARA3 = T01NN4_n13272VTARA3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13272VTARA3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13272VTARA3), 3, 0));
         A13273VTARA4 = T01NN4_A13273VTARA4[0] ;
         n13273VTARA4 = T01NN4_n13273VTARA4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13273VTARA4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13273VTARA4), 3, 0));
         A13274VSERIEVIN = T01NN4_A13274VSERIEVIN[0] ;
         n13274VSERIEVIN = T01NN4_n13274VSERIEVIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13274VSERIEVIN", A13274VSERIEVIN);
         A13275VUSUARI = T01NN4_A13275VUSUARI[0] ;
         n13275VUSUARI = T01NN4_n13275VUSUARI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13275VUSUARI", A13275VUSUARI);
         A13276VNTARA1 = T01NN4_A13276VNTARA1[0] ;
         n13276VNTARA1 = T01NN4_n13276VNTARA1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13276VNTARA1", GXutil.str( A13276VNTARA1, 1, 0));
         A13277VNTARA2 = T01NN4_A13277VNTARA2[0] ;
         n13277VNTARA2 = T01NN4_n13277VNTARA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13277VNTARA2", GXutil.str( A13277VNTARA2, 1, 0));
         A13278VNTARA3 = T01NN4_A13278VNTARA3[0] ;
         n13278VNTARA3 = T01NN4_n13278VNTARA3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13278VNTARA3", GXutil.str( A13278VNTARA3, 1, 0));
         A13279VNTARA4 = T01NN4_A13279VNTARA4[0] ;
         n13279VNTARA4 = T01NN4_n13279VNTARA4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13279VNTARA4", GXutil.str( A13279VNTARA4, 1, 0));
         A13280VA_REPAS = T01NN4_A13280VA_REPAS[0] ;
         n13280VA_REPAS = T01NN4_n13280VA_REPAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13280VA_REPAS", A13280VA_REPAS);
         A13281VDESTINO = T01NN4_A13281VDESTINO[0] ;
         n13281VDESTINO = T01NN4_n13281VDESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13281VDESTINO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13281VDESTINO), 2, 0));
         A13282VCLIENTE = T01NN4_A13282VCLIENTE[0] ;
         n13282VCLIENTE = T01NN4_n13282VCLIENTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13282VCLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13282VCLIENTE), 6, 0));
         A13283VPEDIDO = T01NN4_A13283VPEDIDO[0] ;
         n13283VPEDIDO = T01NN4_n13283VPEDIDO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13283VPEDIDO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13283VPEDIDO), 6, 0));
         A13285VCALIDAD = T01NN4_A13285VCALIDAD[0] ;
         n13285VCALIDAD = T01NN4_n13285VCALIDAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13285VCALIDAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13285VCALIDAD), 4, 0));
         A13286VLINEA = T01NN4_A13286VLINEA[0] ;
         n13286VLINEA = T01NN4_n13286VLINEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13286VLINEA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13286VLINEA), 4, 0));
         A13287VBARCADAX = T01NN4_A13287VBARCADAX[0] ;
         n13287VBARCADAX = T01NN4_n13287VBARCADAX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13287VBARCADAX", A13287VBARCADAX);
         A13288VGABIA = T01NN4_A13288VGABIA[0] ;
         n13288VGABIA = T01NN4_n13288VGABIA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13288VGABIA", A13288VGABIA);
         A13289VFINDISPO = T01NN4_A13289VFINDISPO[0] ;
         n13289VFINDISPO = T01NN4_n13289VFINDISPO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13289VFINDISPO", GXutil.str( A13289VFINDISPO, 1, 0));
         A13290VCONTADO = T01NN4_A13290VCONTADO[0] ;
         n13290VCONTADO = T01NN4_n13290VCONTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13290VCONTADO", A13290VCONTADO);
         zm1NN1816( -1) ;
      }
      pr_default.close(2);
      onLoadActions1NN1816( ) ;
   }

   public void onLoadActions1NN1816( )
   {
   }

   public void checkExtendedTable1NN1816( )
   {
      nIsDirty_1816 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1NN1816( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NN1816( )
   {
      /* Using cursor T01NN5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A13254VID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1816 = (short)(1) ;
      }
      else
      {
         RcdFound1816 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NN3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A13254VID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1NN1816( 1) ;
         RcdFound1816 = (short)(1) ;
         A13284VOBSER = T01NN3_A13284VOBSER[0] ;
         n13284VOBSER = T01NN3_n13284VOBSER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13284VOBSER", A13284VOBSER);
         A13254VID = T01NN3_A13254VID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
         A13255VTIPOPER = T01NN3_A13255VTIPOPER[0] ;
         n13255VTIPOPER = T01NN3_n13255VTIPOPER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13255VTIPOPER", A13255VTIPOPER);
         A13256VFECGRA = T01NN3_A13256VFECGRA[0] ;
         n13256VFECGRA = T01NN3_n13256VFECGRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13256VFECGRA", localUtil.format(A13256VFECGRA, "99/99/99"));
         A13257VHORGRA = T01NN3_A13257VHORGRA[0] ;
         n13257VHORGRA = T01NN3_n13257VHORGRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13257VHORGRA", A13257VHORGRA);
         A13258VFECLEC = T01NN3_A13258VFECLEC[0] ;
         n13258VFECLEC = T01NN3_n13258VFECLEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13258VFECLEC", localUtil.format(A13258VFECLEC, "99/99/99"));
         A13259VHORLEC = T01NN3_A13259VHORLEC[0] ;
         n13259VHORLEC = T01NN3_n13259VHORLEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13259VHORLEC", A13259VHORLEC);
         A13260VSTATUS = T01NN3_A13260VSTATUS[0] ;
         n13260VSTATUS = T01NN3_n13260VSTATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13260VSTATUS", A13260VSTATUS);
         A13261VERRDES = T01NN3_A13261VERRDES[0] ;
         n13261VERRDES = T01NN3_n13261VERRDES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13261VERRDES", A13261VERRDES);
         A13262VSERIE = T01NN3_A13262VSERIE[0] ;
         n13262VSERIE = T01NN3_n13262VSERIE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13262VSERIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13262VSERIE), 6, 0));
         A13263VCOLOR = T01NN3_A13263VCOLOR[0] ;
         n13263VCOLOR = T01NN3_n13263VCOLOR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13263VCOLOR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13263VCOLOR), 4, 0));
         A13264VPIEZA = T01NN3_A13264VPIEZA[0] ;
         n13264VPIEZA = T01NN3_n13264VPIEZA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13264VPIEZA", A13264VPIEZA);
         A13265VMETROS = T01NN3_A13265VMETROS[0] ;
         n13265VMETROS = T01NN3_n13265VMETROS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13265VMETROS", GXutil.ltrimstr( A13265VMETROS, 8, 2));
         A13266VABONO = T01NN3_A13266VABONO[0] ;
         n13266VABONO = T01NN3_n13266VABONO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13266VABONO", GXutil.ltrimstr( A13266VABONO, 8, 2));
         A13267VKILOS = T01NN3_A13267VKILOS[0] ;
         n13267VKILOS = T01NN3_n13267VKILOS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13267VKILOS", GXutil.ltrimstr( A13267VKILOS, 8, 2));
         A13268VDATA = T01NN3_A13268VDATA[0] ;
         n13268VDATA = T01NN3_n13268VDATA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13268VDATA", localUtil.format(A13268VDATA, "99/99/99"));
         A13269VALBARA = T01NN3_A13269VALBARA[0] ;
         n13269VALBARA = T01NN3_n13269VALBARA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13269VALBARA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13269VALBARA), 6, 0));
         A13270VTARA1 = T01NN3_A13270VTARA1[0] ;
         n13270VTARA1 = T01NN3_n13270VTARA1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13270VTARA1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13270VTARA1), 3, 0));
         A13271VTARA2 = T01NN3_A13271VTARA2[0] ;
         n13271VTARA2 = T01NN3_n13271VTARA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13271VTARA2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13271VTARA2), 3, 0));
         A13272VTARA3 = T01NN3_A13272VTARA3[0] ;
         n13272VTARA3 = T01NN3_n13272VTARA3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13272VTARA3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13272VTARA3), 3, 0));
         A13273VTARA4 = T01NN3_A13273VTARA4[0] ;
         n13273VTARA4 = T01NN3_n13273VTARA4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13273VTARA4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13273VTARA4), 3, 0));
         A13274VSERIEVIN = T01NN3_A13274VSERIEVIN[0] ;
         n13274VSERIEVIN = T01NN3_n13274VSERIEVIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13274VSERIEVIN", A13274VSERIEVIN);
         A13275VUSUARI = T01NN3_A13275VUSUARI[0] ;
         n13275VUSUARI = T01NN3_n13275VUSUARI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13275VUSUARI", A13275VUSUARI);
         A13276VNTARA1 = T01NN3_A13276VNTARA1[0] ;
         n13276VNTARA1 = T01NN3_n13276VNTARA1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13276VNTARA1", GXutil.str( A13276VNTARA1, 1, 0));
         A13277VNTARA2 = T01NN3_A13277VNTARA2[0] ;
         n13277VNTARA2 = T01NN3_n13277VNTARA2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13277VNTARA2", GXutil.str( A13277VNTARA2, 1, 0));
         A13278VNTARA3 = T01NN3_A13278VNTARA3[0] ;
         n13278VNTARA3 = T01NN3_n13278VNTARA3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13278VNTARA3", GXutil.str( A13278VNTARA3, 1, 0));
         A13279VNTARA4 = T01NN3_A13279VNTARA4[0] ;
         n13279VNTARA4 = T01NN3_n13279VNTARA4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13279VNTARA4", GXutil.str( A13279VNTARA4, 1, 0));
         A13280VA_REPAS = T01NN3_A13280VA_REPAS[0] ;
         n13280VA_REPAS = T01NN3_n13280VA_REPAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13280VA_REPAS", A13280VA_REPAS);
         A13281VDESTINO = T01NN3_A13281VDESTINO[0] ;
         n13281VDESTINO = T01NN3_n13281VDESTINO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13281VDESTINO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13281VDESTINO), 2, 0));
         A13282VCLIENTE = T01NN3_A13282VCLIENTE[0] ;
         n13282VCLIENTE = T01NN3_n13282VCLIENTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13282VCLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13282VCLIENTE), 6, 0));
         A13283VPEDIDO = T01NN3_A13283VPEDIDO[0] ;
         n13283VPEDIDO = T01NN3_n13283VPEDIDO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13283VPEDIDO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13283VPEDIDO), 6, 0));
         A13285VCALIDAD = T01NN3_A13285VCALIDAD[0] ;
         n13285VCALIDAD = T01NN3_n13285VCALIDAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13285VCALIDAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13285VCALIDAD), 4, 0));
         A13286VLINEA = T01NN3_A13286VLINEA[0] ;
         n13286VLINEA = T01NN3_n13286VLINEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13286VLINEA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13286VLINEA), 4, 0));
         A13287VBARCADAX = T01NN3_A13287VBARCADAX[0] ;
         n13287VBARCADAX = T01NN3_n13287VBARCADAX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13287VBARCADAX", A13287VBARCADAX);
         A13288VGABIA = T01NN3_A13288VGABIA[0] ;
         n13288VGABIA = T01NN3_n13288VGABIA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13288VGABIA", A13288VGABIA);
         A13289VFINDISPO = T01NN3_A13289VFINDISPO[0] ;
         n13289VFINDISPO = T01NN3_n13289VFINDISPO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13289VFINDISPO", GXutil.str( A13289VFINDISPO, 1, 0));
         A13290VCONTADO = T01NN3_A13290VCONTADO[0] ;
         n13290VCONTADO = T01NN3_n13290VCONTADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13290VCONTADO", A13290VCONTADO);
         Z13254VID = A13254VID ;
         sMode1816 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1NN1816( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1816 = (short)(0) ;
            initializeNonKey1NN1816( ) ;
         }
         Gx_mode = sMode1816 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1816 = (short)(0) ;
         initializeNonKey1NN1816( ) ;
         sMode1816 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1816 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1NN1816( ) ;
      if ( RcdFound1816 == 0 )
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
      RcdFound1816 = (short)(0) ;
      /* Using cursor T01NN6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A13254VID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01NN6_A13254VID[0] < A13254VID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01NN6_A13254VID[0] > A13254VID ) ) )
         {
            A13254VID = T01NN6_A13254VID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
            RcdFound1816 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1816 = (short)(0) ;
      /* Using cursor T01NN7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A13254VID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01NN7_A13254VID[0] > A13254VID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01NN7_A13254VID[0] < A13254VID ) ) )
         {
            A13254VID = T01NN7_A13254VID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
            RcdFound1816 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NN1816( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NN1816( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1816 == 1 )
         {
            if ( A13254VID != Z13254VID )
            {
               A13254VID = Z13254VID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1NN1816( ) ;
               GX_FocusControl = edtVID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A13254VID != Z13254VID )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NN1816( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NN1816( ) ;
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
      if ( A13254VID != Z13254VID )
      {
         A13254VID = Z13254VID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVID_Internalname ;
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
      getKey1NN1816( ) ;
      if ( RcdFound1816 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A13254VID != Z13254VID )
         {
            A13254VID = Z13254VID ;
            httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVID_Internalname ;
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
         if ( A13254VID != Z13254VID )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVID_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tincasrea");
      GX_FocusControl = edtVTIPOPER_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1NN0( ) ;
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
      if ( RcdFound1816 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVTIPOPER_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1NN1816( ) ;
      if ( RcdFound1816 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVTIPOPER_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NN1816( ) ;
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
      if ( RcdFound1816 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVTIPOPER_Internalname ;
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
      if ( RcdFound1816 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVTIPOPER_Internalname ;
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
      scanStart1NN1816( ) ;
      if ( RcdFound1816 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1816 != 0 )
         {
            scanNext1NN1816( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVTIPOPER_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NN1816( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1NN1816( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NN2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A13254VID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINCASREA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13255VTIPOPER, T01NN2_A13255VTIPOPER[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13256VFECGRA), GXutil.resetTime(T01NN2_A13256VFECGRA[0])) ) || ( GXutil.strcmp(Z13257VHORGRA, T01NN2_A13257VHORGRA[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13258VFECLEC), GXutil.resetTime(T01NN2_A13258VFECLEC[0])) ) || ( GXutil.strcmp(Z13259VHORLEC, T01NN2_A13259VHORLEC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13260VSTATUS, T01NN2_A13260VSTATUS[0]) != 0 ) || ( GXutil.strcmp(Z13261VERRDES, T01NN2_A13261VERRDES[0]) != 0 ) || ( Z13262VSERIE != T01NN2_A13262VSERIE[0] ) || ( Z13263VCOLOR != T01NN2_A13263VCOLOR[0] ) || ( GXutil.strcmp(Z13264VPIEZA, T01NN2_A13264VPIEZA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13265VMETROS, T01NN2_A13265VMETROS[0]) != 0 ) || ( DecimalUtil.compareTo(Z13266VABONO, T01NN2_A13266VABONO[0]) != 0 ) || ( DecimalUtil.compareTo(Z13267VKILOS, T01NN2_A13267VKILOS[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13268VDATA), GXutil.resetTime(T01NN2_A13268VDATA[0])) ) || ( Z13269VALBARA != T01NN2_A13269VALBARA[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13270VTARA1 != T01NN2_A13270VTARA1[0] ) || ( Z13271VTARA2 != T01NN2_A13271VTARA2[0] ) || ( Z13272VTARA3 != T01NN2_A13272VTARA3[0] ) || ( Z13273VTARA4 != T01NN2_A13273VTARA4[0] ) || ( GXutil.strcmp(Z13274VSERIEVIN, T01NN2_A13274VSERIEVIN[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13275VUSUARI, T01NN2_A13275VUSUARI[0]) != 0 ) || ( Z13276VNTARA1 != T01NN2_A13276VNTARA1[0] ) || ( Z13277VNTARA2 != T01NN2_A13277VNTARA2[0] ) || ( Z13278VNTARA3 != T01NN2_A13278VNTARA3[0] ) || ( Z13279VNTARA4 != T01NN2_A13279VNTARA4[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13280VA_REPAS, T01NN2_A13280VA_REPAS[0]) != 0 ) || ( Z13281VDESTINO != T01NN2_A13281VDESTINO[0] ) || ( Z13282VCLIENTE != T01NN2_A13282VCLIENTE[0] ) || ( Z13283VPEDIDO != T01NN2_A13283VPEDIDO[0] ) || ( Z13285VCALIDAD != T01NN2_A13285VCALIDAD[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13286VLINEA != T01NN2_A13286VLINEA[0] ) || ( GXutil.strcmp(Z13287VBARCADAX, T01NN2_A13287VBARCADAX[0]) != 0 ) || ( GXutil.strcmp(Z13288VGABIA, T01NN2_A13288VGABIA[0]) != 0 ) || ( Z13289VFINDISPO != T01NN2_A13289VFINDISPO[0] ) || ( GXutil.strcmp(Z13290VCONTADO, T01NN2_A13290VCONTADO[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13255VTIPOPER, T01NN2_A13255VTIPOPER[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VTIPOPER");
               GXutil.writeLogRaw("Old: ",Z13255VTIPOPER);
               GXutil.writeLogRaw("Current: ",T01NN2_A13255VTIPOPER[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13256VFECGRA), GXutil.resetTime(T01NN2_A13256VFECGRA[0])) ) )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VFECGRA");
               GXutil.writeLogRaw("Old: ",Z13256VFECGRA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13256VFECGRA[0]);
            }
            if ( GXutil.strcmp(Z13257VHORGRA, T01NN2_A13257VHORGRA[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VHORGRA");
               GXutil.writeLogRaw("Old: ",Z13257VHORGRA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13257VHORGRA[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13258VFECLEC), GXutil.resetTime(T01NN2_A13258VFECLEC[0])) ) )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VFECLEC");
               GXutil.writeLogRaw("Old: ",Z13258VFECLEC);
               GXutil.writeLogRaw("Current: ",T01NN2_A13258VFECLEC[0]);
            }
            if ( GXutil.strcmp(Z13259VHORLEC, T01NN2_A13259VHORLEC[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VHORLEC");
               GXutil.writeLogRaw("Old: ",Z13259VHORLEC);
               GXutil.writeLogRaw("Current: ",T01NN2_A13259VHORLEC[0]);
            }
            if ( GXutil.strcmp(Z13260VSTATUS, T01NN2_A13260VSTATUS[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VSTATUS");
               GXutil.writeLogRaw("Old: ",Z13260VSTATUS);
               GXutil.writeLogRaw("Current: ",T01NN2_A13260VSTATUS[0]);
            }
            if ( GXutil.strcmp(Z13261VERRDES, T01NN2_A13261VERRDES[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VERRDES");
               GXutil.writeLogRaw("Old: ",Z13261VERRDES);
               GXutil.writeLogRaw("Current: ",T01NN2_A13261VERRDES[0]);
            }
            if ( Z13262VSERIE != T01NN2_A13262VSERIE[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VSERIE");
               GXutil.writeLogRaw("Old: ",Z13262VSERIE);
               GXutil.writeLogRaw("Current: ",T01NN2_A13262VSERIE[0]);
            }
            if ( Z13263VCOLOR != T01NN2_A13263VCOLOR[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VCOLOR");
               GXutil.writeLogRaw("Old: ",Z13263VCOLOR);
               GXutil.writeLogRaw("Current: ",T01NN2_A13263VCOLOR[0]);
            }
            if ( GXutil.strcmp(Z13264VPIEZA, T01NN2_A13264VPIEZA[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VPIEZA");
               GXutil.writeLogRaw("Old: ",Z13264VPIEZA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13264VPIEZA[0]);
            }
            if ( DecimalUtil.compareTo(Z13265VMETROS, T01NN2_A13265VMETROS[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VMETROS");
               GXutil.writeLogRaw("Old: ",Z13265VMETROS);
               GXutil.writeLogRaw("Current: ",T01NN2_A13265VMETROS[0]);
            }
            if ( DecimalUtil.compareTo(Z13266VABONO, T01NN2_A13266VABONO[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VABONO");
               GXutil.writeLogRaw("Old: ",Z13266VABONO);
               GXutil.writeLogRaw("Current: ",T01NN2_A13266VABONO[0]);
            }
            if ( DecimalUtil.compareTo(Z13267VKILOS, T01NN2_A13267VKILOS[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VKILOS");
               GXutil.writeLogRaw("Old: ",Z13267VKILOS);
               GXutil.writeLogRaw("Current: ",T01NN2_A13267VKILOS[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13268VDATA), GXutil.resetTime(T01NN2_A13268VDATA[0])) ) )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VDATA");
               GXutil.writeLogRaw("Old: ",Z13268VDATA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13268VDATA[0]);
            }
            if ( Z13269VALBARA != T01NN2_A13269VALBARA[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VALBARA");
               GXutil.writeLogRaw("Old: ",Z13269VALBARA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13269VALBARA[0]);
            }
            if ( Z13270VTARA1 != T01NN2_A13270VTARA1[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VTARA1");
               GXutil.writeLogRaw("Old: ",Z13270VTARA1);
               GXutil.writeLogRaw("Current: ",T01NN2_A13270VTARA1[0]);
            }
            if ( Z13271VTARA2 != T01NN2_A13271VTARA2[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VTARA2");
               GXutil.writeLogRaw("Old: ",Z13271VTARA2);
               GXutil.writeLogRaw("Current: ",T01NN2_A13271VTARA2[0]);
            }
            if ( Z13272VTARA3 != T01NN2_A13272VTARA3[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VTARA3");
               GXutil.writeLogRaw("Old: ",Z13272VTARA3);
               GXutil.writeLogRaw("Current: ",T01NN2_A13272VTARA3[0]);
            }
            if ( Z13273VTARA4 != T01NN2_A13273VTARA4[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VTARA4");
               GXutil.writeLogRaw("Old: ",Z13273VTARA4);
               GXutil.writeLogRaw("Current: ",T01NN2_A13273VTARA4[0]);
            }
            if ( GXutil.strcmp(Z13274VSERIEVIN, T01NN2_A13274VSERIEVIN[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VSERIEVIN");
               GXutil.writeLogRaw("Old: ",Z13274VSERIEVIN);
               GXutil.writeLogRaw("Current: ",T01NN2_A13274VSERIEVIN[0]);
            }
            if ( GXutil.strcmp(Z13275VUSUARI, T01NN2_A13275VUSUARI[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VUSUARI");
               GXutil.writeLogRaw("Old: ",Z13275VUSUARI);
               GXutil.writeLogRaw("Current: ",T01NN2_A13275VUSUARI[0]);
            }
            if ( Z13276VNTARA1 != T01NN2_A13276VNTARA1[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VNTARA1");
               GXutil.writeLogRaw("Old: ",Z13276VNTARA1);
               GXutil.writeLogRaw("Current: ",T01NN2_A13276VNTARA1[0]);
            }
            if ( Z13277VNTARA2 != T01NN2_A13277VNTARA2[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VNTARA2");
               GXutil.writeLogRaw("Old: ",Z13277VNTARA2);
               GXutil.writeLogRaw("Current: ",T01NN2_A13277VNTARA2[0]);
            }
            if ( Z13278VNTARA3 != T01NN2_A13278VNTARA3[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VNTARA3");
               GXutil.writeLogRaw("Old: ",Z13278VNTARA3);
               GXutil.writeLogRaw("Current: ",T01NN2_A13278VNTARA3[0]);
            }
            if ( Z13279VNTARA4 != T01NN2_A13279VNTARA4[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VNTARA4");
               GXutil.writeLogRaw("Old: ",Z13279VNTARA4);
               GXutil.writeLogRaw("Current: ",T01NN2_A13279VNTARA4[0]);
            }
            if ( GXutil.strcmp(Z13280VA_REPAS, T01NN2_A13280VA_REPAS[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VA_REPAS");
               GXutil.writeLogRaw("Old: ",Z13280VA_REPAS);
               GXutil.writeLogRaw("Current: ",T01NN2_A13280VA_REPAS[0]);
            }
            if ( Z13281VDESTINO != T01NN2_A13281VDESTINO[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VDESTINO");
               GXutil.writeLogRaw("Old: ",Z13281VDESTINO);
               GXutil.writeLogRaw("Current: ",T01NN2_A13281VDESTINO[0]);
            }
            if ( Z13282VCLIENTE != T01NN2_A13282VCLIENTE[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VCLIENTE");
               GXutil.writeLogRaw("Old: ",Z13282VCLIENTE);
               GXutil.writeLogRaw("Current: ",T01NN2_A13282VCLIENTE[0]);
            }
            if ( Z13283VPEDIDO != T01NN2_A13283VPEDIDO[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VPEDIDO");
               GXutil.writeLogRaw("Old: ",Z13283VPEDIDO);
               GXutil.writeLogRaw("Current: ",T01NN2_A13283VPEDIDO[0]);
            }
            if ( Z13285VCALIDAD != T01NN2_A13285VCALIDAD[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VCALIDAD");
               GXutil.writeLogRaw("Old: ",Z13285VCALIDAD);
               GXutil.writeLogRaw("Current: ",T01NN2_A13285VCALIDAD[0]);
            }
            if ( Z13286VLINEA != T01NN2_A13286VLINEA[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VLINEA");
               GXutil.writeLogRaw("Old: ",Z13286VLINEA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13286VLINEA[0]);
            }
            if ( GXutil.strcmp(Z13287VBARCADAX, T01NN2_A13287VBARCADAX[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VBARCADAX");
               GXutil.writeLogRaw("Old: ",Z13287VBARCADAX);
               GXutil.writeLogRaw("Current: ",T01NN2_A13287VBARCADAX[0]);
            }
            if ( GXutil.strcmp(Z13288VGABIA, T01NN2_A13288VGABIA[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VGABIA");
               GXutil.writeLogRaw("Old: ",Z13288VGABIA);
               GXutil.writeLogRaw("Current: ",T01NN2_A13288VGABIA[0]);
            }
            if ( Z13289VFINDISPO != T01NN2_A13289VFINDISPO[0] )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VFINDISPO");
               GXutil.writeLogRaw("Old: ",Z13289VFINDISPO);
               GXutil.writeLogRaw("Current: ",T01NN2_A13289VFINDISPO[0]);
            }
            if ( GXutil.strcmp(Z13290VCONTADO, T01NN2_A13290VCONTADO[0]) != 0 )
            {
               GXutil.writeLogln("tincasrea:[seudo value changed for attri]"+"VCONTADO");
               GXutil.writeLogRaw("Old: ",Z13290VCONTADO);
               GXutil.writeLogRaw("Current: ",T01NN2_A13290VCONTADO[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINCASREA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NN1816( )
   {
      beforeValidate1NN1816( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NN1816( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NN1816( 0) ;
         checkOptimisticConcurrency1NN1816( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NN1816( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NN1816( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NN8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A13254VID), Boolean.valueOf(n13255VTIPOPER), A13255VTIPOPER, Boolean.valueOf(n13256VFECGRA), A13256VFECGRA, Boolean.valueOf(n13257VHORGRA), A13257VHORGRA, Boolean.valueOf(n13258VFECLEC), A13258VFECLEC, Boolean.valueOf(n13259VHORLEC), A13259VHORLEC, Boolean.valueOf(n13260VSTATUS), A13260VSTATUS, Boolean.valueOf(n13261VERRDES), A13261VERRDES, Boolean.valueOf(n13262VSERIE), Integer.valueOf(A13262VSERIE), Boolean.valueOf(n13263VCOLOR), Short.valueOf(A13263VCOLOR), Boolean.valueOf(n13264VPIEZA), A13264VPIEZA, Boolean.valueOf(n13265VMETROS), A13265VMETROS, Boolean.valueOf(n13266VABONO), A13266VABONO, Boolean.valueOf(n13267VKILOS), A13267VKILOS, Boolean.valueOf(n13268VDATA), A13268VDATA, Boolean.valueOf(n13269VALBARA), Integer.valueOf(A13269VALBARA), Boolean.valueOf(n13270VTARA1), Short.valueOf(A13270VTARA1), Boolean.valueOf(n13271VTARA2), Short.valueOf(A13271VTARA2), Boolean.valueOf(n13272VTARA3), Short.valueOf(A13272VTARA3), Boolean.valueOf(n13273VTARA4), Short.valueOf(A13273VTARA4), Boolean.valueOf(n13274VSERIEVIN), A13274VSERIEVIN, Boolean.valueOf(n13275VUSUARI), A13275VUSUARI, Boolean.valueOf(n13276VNTARA1), Byte.valueOf(A13276VNTARA1), Boolean.valueOf(n13277VNTARA2), Byte.valueOf(A13277VNTARA2), Boolean.valueOf(n13278VNTARA3), Byte.valueOf(A13278VNTARA3), Boolean.valueOf(n13279VNTARA4), Byte.valueOf(A13279VNTARA4), Boolean.valueOf(n13280VA_REPAS), A13280VA_REPAS, Boolean.valueOf(n13281VDESTINO), Byte.valueOf(A13281VDESTINO), Boolean.valueOf(n13282VCLIENTE), Integer.valueOf(A13282VCLIENTE), Boolean.valueOf(n13283VPEDIDO), Integer.valueOf(A13283VPEDIDO), Boolean.valueOf(n13284VOBSER), A13284VOBSER, Boolean.valueOf(n13285VCALIDAD), Short.valueOf(A13285VCALIDAD), Boolean.valueOf(n13286VLINEA), Short.valueOf(A13286VLINEA), Boolean.valueOf(n13287VBARCADAX), A13287VBARCADAX, Boolean.valueOf(n13288VGABIA), A13288VGABIA, Boolean.valueOf(n13289VFINDISPO), Byte.valueOf(A13289VFINDISPO), Boolean.valueOf(n13290VCONTADO), A13290VCONTADO});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCASREA");
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
                        resetCaption1NN0( ) ;
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
            load1NN1816( ) ;
         }
         endLevel1NN1816( ) ;
      }
      closeExtendedTableCursors1NN1816( ) ;
   }

   public void update1NN1816( )
   {
      beforeValidate1NN1816( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NN1816( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NN1816( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NN1816( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NN1816( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NN9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n13255VTIPOPER), A13255VTIPOPER, Boolean.valueOf(n13256VFECGRA), A13256VFECGRA, Boolean.valueOf(n13257VHORGRA), A13257VHORGRA, Boolean.valueOf(n13258VFECLEC), A13258VFECLEC, Boolean.valueOf(n13259VHORLEC), A13259VHORLEC, Boolean.valueOf(n13260VSTATUS), A13260VSTATUS, Boolean.valueOf(n13261VERRDES), A13261VERRDES, Boolean.valueOf(n13262VSERIE), Integer.valueOf(A13262VSERIE), Boolean.valueOf(n13263VCOLOR), Short.valueOf(A13263VCOLOR), Boolean.valueOf(n13264VPIEZA), A13264VPIEZA, Boolean.valueOf(n13265VMETROS), A13265VMETROS, Boolean.valueOf(n13266VABONO), A13266VABONO, Boolean.valueOf(n13267VKILOS), A13267VKILOS, Boolean.valueOf(n13268VDATA), A13268VDATA, Boolean.valueOf(n13269VALBARA), Integer.valueOf(A13269VALBARA), Boolean.valueOf(n13270VTARA1), Short.valueOf(A13270VTARA1), Boolean.valueOf(n13271VTARA2), Short.valueOf(A13271VTARA2), Boolean.valueOf(n13272VTARA3), Short.valueOf(A13272VTARA3), Boolean.valueOf(n13273VTARA4), Short.valueOf(A13273VTARA4), Boolean.valueOf(n13274VSERIEVIN), A13274VSERIEVIN, Boolean.valueOf(n13275VUSUARI), A13275VUSUARI, Boolean.valueOf(n13276VNTARA1), Byte.valueOf(A13276VNTARA1), Boolean.valueOf(n13277VNTARA2), Byte.valueOf(A13277VNTARA2), Boolean.valueOf(n13278VNTARA3), Byte.valueOf(A13278VNTARA3), Boolean.valueOf(n13279VNTARA4), Byte.valueOf(A13279VNTARA4), Boolean.valueOf(n13280VA_REPAS), A13280VA_REPAS, Boolean.valueOf(n13281VDESTINO), Byte.valueOf(A13281VDESTINO), Boolean.valueOf(n13282VCLIENTE), Integer.valueOf(A13282VCLIENTE), Boolean.valueOf(n13283VPEDIDO), Integer.valueOf(A13283VPEDIDO), Boolean.valueOf(n13284VOBSER), A13284VOBSER, Boolean.valueOf(n13285VCALIDAD), Short.valueOf(A13285VCALIDAD), Boolean.valueOf(n13286VLINEA), Short.valueOf(A13286VLINEA), Boolean.valueOf(n13287VBARCADAX), A13287VBARCADAX, Boolean.valueOf(n13288VGABIA), A13288VGABIA, Boolean.valueOf(n13289VFINDISPO), Byte.valueOf(A13289VFINDISPO), Boolean.valueOf(n13290VCONTADO), A13290VCONTADO, Long.valueOf(A13254VID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCASREA");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINCASREA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NN1816( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1NN0( ) ;
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
         endLevel1NN1816( ) ;
      }
      closeExtendedTableCursors1NN1816( ) ;
   }

   public void deferredUpdate1NN1816( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NN1816( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NN1816( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NN1816( ) ;
         afterConfirm1NN1816( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NN1816( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NN10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A13254VID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCASREA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1816 == 0 )
                     {
                        initAll1NN1816( ) ;
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
                     resetCaption1NN0( ) ;
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
      sMode1816 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NN1816( ) ;
      Gx_mode = sMode1816 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NN1816( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1NN1816( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NN1816( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tincasrea");
         if ( AnyError == 0 )
         {
            confirmValues1NN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tincasrea");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NN1816( )
   {
      /* Using cursor T01NN11 */
      pr_default.execute(9);
      RcdFound1816 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1816 = (short)(1) ;
         A13254VID = T01NN11_A13254VID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NN1816( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1816 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1816 = (short)(1) ;
         A13254VID = T01NN11_A13254VID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
      }
   }

   public void scanEnd1NN1816( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1NN1816( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NN1816( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NN1816( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NN1816( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NN1816( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NN1816( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NN1816( )
   {
      edtVID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVID_Enabled), 5, 0), true);
      edtVTIPOPER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTIPOPER_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTIPOPER_Enabled), 5, 0), true);
      edtVFECGRA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVFECGRA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVFECGRA_Enabled), 5, 0), true);
      edtVHORGRA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVHORGRA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVHORGRA_Enabled), 5, 0), true);
      edtVFECLEC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVFECLEC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVFECLEC_Enabled), 5, 0), true);
      edtVHORLEC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVHORLEC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVHORLEC_Enabled), 5, 0), true);
      edtVSTATUS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVSTATUS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVSTATUS_Enabled), 5, 0), true);
      edtVERRDES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVERRDES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVERRDES_Enabled), 5, 0), true);
      edtVSERIE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVSERIE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVSERIE_Enabled), 5, 0), true);
      edtVCOLOR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVCOLOR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVCOLOR_Enabled), 5, 0), true);
      edtVPIEZA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVPIEZA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVPIEZA_Enabled), 5, 0), true);
      edtVMETROS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVMETROS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVMETROS_Enabled), 5, 0), true);
      edtVABONO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVABONO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVABONO_Enabled), 5, 0), true);
      edtVKILOS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVKILOS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVKILOS_Enabled), 5, 0), true);
      edtVDATA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVDATA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVDATA_Enabled), 5, 0), true);
      edtVALBARA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVALBARA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVALBARA_Enabled), 5, 0), true);
      edtVTARA1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTARA1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTARA1_Enabled), 5, 0), true);
      edtVTARA2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTARA2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTARA2_Enabled), 5, 0), true);
      edtVTARA3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTARA3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTARA3_Enabled), 5, 0), true);
      edtVTARA4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTARA4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTARA4_Enabled), 5, 0), true);
      edtVSERIEVIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVSERIEVIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVSERIEVIN_Enabled), 5, 0), true);
      edtVUSUARI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVUSUARI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVUSUARI_Enabled), 5, 0), true);
      edtVNTARA1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVNTARA1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVNTARA1_Enabled), 5, 0), true);
      edtVNTARA2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVNTARA2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVNTARA2_Enabled), 5, 0), true);
      edtVNTARA3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVNTARA3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVNTARA3_Enabled), 5, 0), true);
      edtVNTARA4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVNTARA4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVNTARA4_Enabled), 5, 0), true);
      edtVA_REPAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVA_REPAS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVA_REPAS_Enabled), 5, 0), true);
      edtVDESTINO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVDESTINO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVDESTINO_Enabled), 5, 0), true);
      edtVCLIENTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVCLIENTE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVCLIENTE_Enabled), 5, 0), true);
      edtVPEDIDO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVPEDIDO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVPEDIDO_Enabled), 5, 0), true);
      edtVOBSER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVOBSER_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVOBSER_Enabled), 5, 0), true);
      edtVCALIDAD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVCALIDAD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVCALIDAD_Enabled), 5, 0), true);
      edtVLINEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVLINEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVLINEA_Enabled), 5, 0), true);
      edtVBARCADAX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVBARCADAX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVBARCADAX_Enabled), 5, 0), true);
      edtVGABIA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVGABIA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVGABIA_Enabled), 5, 0), true);
      edtVFINDISPO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVFINDISPO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVFINDISPO_Enabled), 5, 0), true);
      edtVCONTADO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVCONTADO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVCONTADO_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1NN1816( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1NN0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tincasrea", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13254VID", GXutil.ltrim( localUtil.ntoc( Z13254VID, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13255VTIPOPER", GXutil.rtrim( Z13255VTIPOPER));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13256VFECGRA", localUtil.dtoc( Z13256VFECGRA, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13257VHORGRA", GXutil.rtrim( Z13257VHORGRA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13258VFECLEC", localUtil.dtoc( Z13258VFECLEC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13259VHORLEC", GXutil.rtrim( Z13259VHORLEC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13260VSTATUS", GXutil.rtrim( Z13260VSTATUS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13261VERRDES", GXutil.rtrim( Z13261VERRDES));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13262VSERIE", GXutil.ltrim( localUtil.ntoc( Z13262VSERIE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13263VCOLOR", GXutil.ltrim( localUtil.ntoc( Z13263VCOLOR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13264VPIEZA", GXutil.rtrim( Z13264VPIEZA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13265VMETROS", GXutil.ltrim( localUtil.ntoc( Z13265VMETROS, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13266VABONO", GXutil.ltrim( localUtil.ntoc( Z13266VABONO, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13267VKILOS", GXutil.ltrim( localUtil.ntoc( Z13267VKILOS, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13268VDATA", localUtil.dtoc( Z13268VDATA, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13269VALBARA", GXutil.ltrim( localUtil.ntoc( Z13269VALBARA, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13270VTARA1", GXutil.ltrim( localUtil.ntoc( Z13270VTARA1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13271VTARA2", GXutil.ltrim( localUtil.ntoc( Z13271VTARA2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13272VTARA3", GXutil.ltrim( localUtil.ntoc( Z13272VTARA3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13273VTARA4", GXutil.ltrim( localUtil.ntoc( Z13273VTARA4, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13274VSERIEVIN", GXutil.rtrim( Z13274VSERIEVIN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13275VUSUARI", GXutil.rtrim( Z13275VUSUARI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13276VNTARA1", GXutil.ltrim( localUtil.ntoc( Z13276VNTARA1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13277VNTARA2", GXutil.ltrim( localUtil.ntoc( Z13277VNTARA2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13278VNTARA3", GXutil.ltrim( localUtil.ntoc( Z13278VNTARA3, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13279VNTARA4", GXutil.ltrim( localUtil.ntoc( Z13279VNTARA4, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13280VA_REPAS", GXutil.rtrim( Z13280VA_REPAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13281VDESTINO", GXutil.ltrim( localUtil.ntoc( Z13281VDESTINO, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13282VCLIENTE", GXutil.ltrim( localUtil.ntoc( Z13282VCLIENTE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13283VPEDIDO", GXutil.ltrim( localUtil.ntoc( Z13283VPEDIDO, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13285VCALIDAD", GXutil.ltrim( localUtil.ntoc( Z13285VCALIDAD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13286VLINEA", GXutil.ltrim( localUtil.ntoc( Z13286VLINEA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13287VBARCADAX", GXutil.rtrim( Z13287VBARCADAX));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13288VGABIA", GXutil.rtrim( Z13288VGABIA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13289VFINDISPO", GXutil.ltrim( localUtil.ntoc( Z13289VFINDISPO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13290VCONTADO", GXutil.rtrim( Z13290VCONTADO));
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
      return formatLink("app.tincasrea", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TINCASREA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INCASREA", "") ;
   }

   public void initializeNonKey1NN1816( )
   {
      A13255VTIPOPER = "" ;
      n13255VTIPOPER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13255VTIPOPER", A13255VTIPOPER);
      A13256VFECGRA = GXutil.nullDate() ;
      n13256VFECGRA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13256VFECGRA", localUtil.format(A13256VFECGRA, "99/99/99"));
      A13257VHORGRA = "" ;
      n13257VHORGRA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13257VHORGRA", A13257VHORGRA);
      A13258VFECLEC = GXutil.nullDate() ;
      n13258VFECLEC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13258VFECLEC", localUtil.format(A13258VFECLEC, "99/99/99"));
      A13259VHORLEC = "" ;
      n13259VHORLEC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13259VHORLEC", A13259VHORLEC);
      A13260VSTATUS = "" ;
      n13260VSTATUS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13260VSTATUS", A13260VSTATUS);
      A13261VERRDES = "" ;
      n13261VERRDES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13261VERRDES", A13261VERRDES);
      A13262VSERIE = 0 ;
      n13262VSERIE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13262VSERIE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13262VSERIE), 6, 0));
      A13263VCOLOR = (short)(0) ;
      n13263VCOLOR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13263VCOLOR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13263VCOLOR), 4, 0));
      A13264VPIEZA = "" ;
      n13264VPIEZA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13264VPIEZA", A13264VPIEZA);
      A13265VMETROS = DecimalUtil.ZERO ;
      n13265VMETROS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13265VMETROS", GXutil.ltrimstr( A13265VMETROS, 8, 2));
      A13266VABONO = DecimalUtil.ZERO ;
      n13266VABONO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13266VABONO", GXutil.ltrimstr( A13266VABONO, 8, 2));
      A13267VKILOS = DecimalUtil.ZERO ;
      n13267VKILOS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13267VKILOS", GXutil.ltrimstr( A13267VKILOS, 8, 2));
      A13268VDATA = GXutil.nullDate() ;
      n13268VDATA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13268VDATA", localUtil.format(A13268VDATA, "99/99/99"));
      A13269VALBARA = 0 ;
      n13269VALBARA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13269VALBARA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13269VALBARA), 6, 0));
      A13270VTARA1 = (short)(0) ;
      n13270VTARA1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13270VTARA1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13270VTARA1), 3, 0));
      A13271VTARA2 = (short)(0) ;
      n13271VTARA2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13271VTARA2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13271VTARA2), 3, 0));
      A13272VTARA3 = (short)(0) ;
      n13272VTARA3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13272VTARA3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13272VTARA3), 3, 0));
      A13273VTARA4 = (short)(0) ;
      n13273VTARA4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13273VTARA4", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13273VTARA4), 3, 0));
      A13274VSERIEVIN = "" ;
      n13274VSERIEVIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13274VSERIEVIN", A13274VSERIEVIN);
      A13275VUSUARI = "" ;
      n13275VUSUARI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13275VUSUARI", A13275VUSUARI);
      A13276VNTARA1 = (byte)(0) ;
      n13276VNTARA1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13276VNTARA1", GXutil.str( A13276VNTARA1, 1, 0));
      A13277VNTARA2 = (byte)(0) ;
      n13277VNTARA2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13277VNTARA2", GXutil.str( A13277VNTARA2, 1, 0));
      A13278VNTARA3 = (byte)(0) ;
      n13278VNTARA3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13278VNTARA3", GXutil.str( A13278VNTARA3, 1, 0));
      A13279VNTARA4 = (byte)(0) ;
      n13279VNTARA4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13279VNTARA4", GXutil.str( A13279VNTARA4, 1, 0));
      A13280VA_REPAS = "" ;
      n13280VA_REPAS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13280VA_REPAS", A13280VA_REPAS);
      A13281VDESTINO = (byte)(0) ;
      n13281VDESTINO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13281VDESTINO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13281VDESTINO), 2, 0));
      A13282VCLIENTE = 0 ;
      n13282VCLIENTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13282VCLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13282VCLIENTE), 6, 0));
      A13283VPEDIDO = 0 ;
      n13283VPEDIDO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13283VPEDIDO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13283VPEDIDO), 6, 0));
      A13284VOBSER = "" ;
      n13284VOBSER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13284VOBSER", A13284VOBSER);
      A13285VCALIDAD = (short)(0) ;
      n13285VCALIDAD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13285VCALIDAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13285VCALIDAD), 4, 0));
      A13286VLINEA = (short)(0) ;
      n13286VLINEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13286VLINEA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13286VLINEA), 4, 0));
      A13287VBARCADAX = "" ;
      n13287VBARCADAX = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13287VBARCADAX", A13287VBARCADAX);
      A13288VGABIA = "" ;
      n13288VGABIA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13288VGABIA", A13288VGABIA);
      A13289VFINDISPO = (byte)(0) ;
      n13289VFINDISPO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13289VFINDISPO", GXutil.str( A13289VFINDISPO, 1, 0));
      A13290VCONTADO = "" ;
      n13290VCONTADO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13290VCONTADO", A13290VCONTADO);
      Z13255VTIPOPER = "" ;
      Z13256VFECGRA = GXutil.nullDate() ;
      Z13257VHORGRA = "" ;
      Z13258VFECLEC = GXutil.nullDate() ;
      Z13259VHORLEC = "" ;
      Z13260VSTATUS = "" ;
      Z13261VERRDES = "" ;
      Z13262VSERIE = 0 ;
      Z13263VCOLOR = (short)(0) ;
      Z13264VPIEZA = "" ;
      Z13265VMETROS = DecimalUtil.ZERO ;
      Z13266VABONO = DecimalUtil.ZERO ;
      Z13267VKILOS = DecimalUtil.ZERO ;
      Z13268VDATA = GXutil.nullDate() ;
      Z13269VALBARA = 0 ;
      Z13270VTARA1 = (short)(0) ;
      Z13271VTARA2 = (short)(0) ;
      Z13272VTARA3 = (short)(0) ;
      Z13273VTARA4 = (short)(0) ;
      Z13274VSERIEVIN = "" ;
      Z13275VUSUARI = "" ;
      Z13276VNTARA1 = (byte)(0) ;
      Z13277VNTARA2 = (byte)(0) ;
      Z13278VNTARA3 = (byte)(0) ;
      Z13279VNTARA4 = (byte)(0) ;
      Z13280VA_REPAS = "" ;
      Z13281VDESTINO = (byte)(0) ;
      Z13282VCLIENTE = 0 ;
      Z13283VPEDIDO = 0 ;
      Z13285VCALIDAD = (short)(0) ;
      Z13286VLINEA = (short)(0) ;
      Z13287VBARCADAX = "" ;
      Z13288VGABIA = "" ;
      Z13289VFINDISPO = (byte)(0) ;
      Z13290VCONTADO = "" ;
   }

   public void initAll1NN1816( )
   {
      A13254VID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13254VID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13254VID), 15, 0));
      initializeNonKey1NN1816( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016351352", true, true);
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
      httpContext.AddJavascriptSource("tincasrea.js", "?202661016351353", false, true);
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
      edtVID_Internalname = "VID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVTIPOPER_Internalname = "VTIPOPER" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVFECGRA_Internalname = "VFECGRA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVHORGRA_Internalname = "VHORGRA" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVFECLEC_Internalname = "VFECLEC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVHORLEC_Internalname = "VHORLEC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVSTATUS_Internalname = "VSTATUS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVERRDES_Internalname = "VERRDES" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVSERIE_Internalname = "VSERIE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtVCOLOR_Internalname = "VCOLOR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtVPIEZA_Internalname = "VPIEZA" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtVMETROS_Internalname = "VMETROS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtVABONO_Internalname = "VABONO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtVKILOS_Internalname = "VKILOS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtVDATA_Internalname = "VDATA" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtVALBARA_Internalname = "VALBARA" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtVTARA1_Internalname = "VTARA1" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtVTARA2_Internalname = "VTARA2" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtVTARA3_Internalname = "VTARA3" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtVTARA4_Internalname = "VTARA4" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtVSERIEVIN_Internalname = "VSERIEVIN" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtVUSUARI_Internalname = "VUSUARI" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtVNTARA1_Internalname = "VNTARA1" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtVNTARA2_Internalname = "VNTARA2" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtVNTARA3_Internalname = "VNTARA3" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtVNTARA4_Internalname = "VNTARA4" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtVA_REPAS_Internalname = "VA_REPAS" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtVDESTINO_Internalname = "VDESTINO" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtVCLIENTE_Internalname = "VCLIENTE" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtVPEDIDO_Internalname = "VPEDIDO" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtVOBSER_Internalname = "VOBSER" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtVCALIDAD_Internalname = "VCALIDAD" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtVLINEA_Internalname = "VLINEA" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtVBARCADAX_Internalname = "VBARCADAX" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtVGABIA_Internalname = "VGABIA" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtVFINDISPO_Internalname = "VFINDISPO" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtVCONTADO_Internalname = "VCONTADO" ;
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
      Form.setCaption( httpContext.getMessage( "INCASREA", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVCONTADO_Jsonclick = "" ;
      edtVCONTADO_Backcolor = (int)(0xFFFFFF) ;
      edtVCONTADO_Enabled = 1 ;
      edtVFINDISPO_Jsonclick = "" ;
      edtVFINDISPO_Backcolor = (int)(0xFFFFFF) ;
      edtVFINDISPO_Enabled = 1 ;
      edtVGABIA_Jsonclick = "" ;
      edtVGABIA_Backcolor = (int)(0xFFFFFF) ;
      edtVGABIA_Enabled = 1 ;
      edtVBARCADAX_Jsonclick = "" ;
      edtVBARCADAX_Backcolor = (int)(0xFFFFFF) ;
      edtVBARCADAX_Enabled = 1 ;
      edtVLINEA_Jsonclick = "" ;
      edtVLINEA_Backcolor = (int)(0xFFFFFF) ;
      edtVLINEA_Enabled = 1 ;
      edtVCALIDAD_Jsonclick = "" ;
      edtVCALIDAD_Backcolor = (int)(0xFFFFFF) ;
      edtVCALIDAD_Enabled = 1 ;
      edtVOBSER_Jsonclick = "" ;
      edtVOBSER_Backcolor = (int)(0xFFFFFF) ;
      edtVOBSER_Enabled = 1 ;
      edtVPEDIDO_Jsonclick = "" ;
      edtVPEDIDO_Backcolor = (int)(0xFFFFFF) ;
      edtVPEDIDO_Enabled = 1 ;
      edtVCLIENTE_Jsonclick = "" ;
      edtVCLIENTE_Backcolor = (int)(0xFFFFFF) ;
      edtVCLIENTE_Enabled = 1 ;
      edtVDESTINO_Jsonclick = "" ;
      edtVDESTINO_Backcolor = (int)(0xFFFFFF) ;
      edtVDESTINO_Enabled = 1 ;
      edtVA_REPAS_Jsonclick = "" ;
      edtVA_REPAS_Backcolor = (int)(0xFFFFFF) ;
      edtVA_REPAS_Enabled = 1 ;
      edtVNTARA4_Jsonclick = "" ;
      edtVNTARA4_Backcolor = (int)(0xFFFFFF) ;
      edtVNTARA4_Enabled = 1 ;
      edtVNTARA3_Jsonclick = "" ;
      edtVNTARA3_Backcolor = (int)(0xFFFFFF) ;
      edtVNTARA3_Enabled = 1 ;
      edtVNTARA2_Jsonclick = "" ;
      edtVNTARA2_Backcolor = (int)(0xFFFFFF) ;
      edtVNTARA2_Enabled = 1 ;
      edtVNTARA1_Jsonclick = "" ;
      edtVNTARA1_Backcolor = (int)(0xFFFFFF) ;
      edtVNTARA1_Enabled = 1 ;
      edtVUSUARI_Jsonclick = "" ;
      edtVUSUARI_Backcolor = (int)(0xFFFFFF) ;
      edtVUSUARI_Enabled = 1 ;
      edtVSERIEVIN_Jsonclick = "" ;
      edtVSERIEVIN_Backcolor = (int)(0xFFFFFF) ;
      edtVSERIEVIN_Enabled = 1 ;
      edtVTARA4_Jsonclick = "" ;
      edtVTARA4_Backcolor = (int)(0xFFFFFF) ;
      edtVTARA4_Enabled = 1 ;
      edtVTARA3_Jsonclick = "" ;
      edtVTARA3_Backcolor = (int)(0xFFFFFF) ;
      edtVTARA3_Enabled = 1 ;
      edtVTARA2_Jsonclick = "" ;
      edtVTARA2_Backcolor = (int)(0xFFFFFF) ;
      edtVTARA2_Enabled = 1 ;
      edtVTARA1_Jsonclick = "" ;
      edtVTARA1_Backcolor = (int)(0xFFFFFF) ;
      edtVTARA1_Enabled = 1 ;
      edtVALBARA_Jsonclick = "" ;
      edtVALBARA_Backcolor = (int)(0xFFFFFF) ;
      edtVALBARA_Enabled = 1 ;
      edtVDATA_Jsonclick = "" ;
      edtVDATA_Backcolor = (int)(0xFFFFFF) ;
      edtVDATA_Enabled = 1 ;
      edtVKILOS_Jsonclick = "" ;
      edtVKILOS_Backcolor = (int)(0xFFFFFF) ;
      edtVKILOS_Enabled = 1 ;
      edtVABONO_Jsonclick = "" ;
      edtVABONO_Backcolor = (int)(0xFFFFFF) ;
      edtVABONO_Enabled = 1 ;
      edtVMETROS_Jsonclick = "" ;
      edtVMETROS_Backcolor = (int)(0xFFFFFF) ;
      edtVMETROS_Enabled = 1 ;
      edtVPIEZA_Jsonclick = "" ;
      edtVPIEZA_Backcolor = (int)(0xFFFFFF) ;
      edtVPIEZA_Enabled = 1 ;
      edtVCOLOR_Jsonclick = "" ;
      edtVCOLOR_Backcolor = (int)(0xFFFFFF) ;
      edtVCOLOR_Enabled = 1 ;
      edtVSERIE_Jsonclick = "" ;
      edtVSERIE_Backcolor = (int)(0xFFFFFF) ;
      edtVSERIE_Enabled = 1 ;
      edtVERRDES_Backcolor = (int)(0xFFFFFF) ;
      edtVERRDES_Enabled = 1 ;
      edtVSTATUS_Jsonclick = "" ;
      edtVSTATUS_Backcolor = (int)(0xFFFFFF) ;
      edtVSTATUS_Enabled = 1 ;
      edtVHORLEC_Jsonclick = "" ;
      edtVHORLEC_Backcolor = (int)(0xFFFFFF) ;
      edtVHORLEC_Enabled = 1 ;
      edtVFECLEC_Jsonclick = "" ;
      edtVFECLEC_Backcolor = (int)(0xFFFFFF) ;
      edtVFECLEC_Enabled = 1 ;
      edtVHORGRA_Jsonclick = "" ;
      edtVHORGRA_Backcolor = (int)(0xFFFFFF) ;
      edtVHORGRA_Enabled = 1 ;
      edtVFECGRA_Jsonclick = "" ;
      edtVFECGRA_Backcolor = (int)(0xFFFFFF) ;
      edtVFECGRA_Enabled = 1 ;
      edtVTIPOPER_Jsonclick = "" ;
      edtVTIPOPER_Backcolor = (int)(0xFFFFFF) ;
      edtVTIPOPER_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVID_Jsonclick = "" ;
      edtVID_Backcolor = (int)(0xFFFFFF) ;
      edtVID_Enabled = 1 ;
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
      GX_FocusControl = edtVTIPOPER_Internalname ;
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

   public void valid_Vid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13255VTIPOPER", GXutil.rtrim( A13255VTIPOPER));
      httpContext.ajax_rsp_assign_attri("", false, "A13256VFECGRA", localUtil.format(A13256VFECGRA, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13257VHORGRA", GXutil.rtrim( A13257VHORGRA));
      httpContext.ajax_rsp_assign_attri("", false, "A13258VFECLEC", localUtil.format(A13258VFECLEC, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13259VHORLEC", GXutil.rtrim( A13259VHORLEC));
      httpContext.ajax_rsp_assign_attri("", false, "A13260VSTATUS", GXutil.rtrim( A13260VSTATUS));
      httpContext.ajax_rsp_assign_attri("", false, "A13261VERRDES", GXutil.rtrim( A13261VERRDES));
      httpContext.ajax_rsp_assign_attri("", false, "A13262VSERIE", GXutil.ltrim( localUtil.ntoc( A13262VSERIE, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13263VCOLOR", GXutil.ltrim( localUtil.ntoc( A13263VCOLOR, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13264VPIEZA", GXutil.rtrim( A13264VPIEZA));
      httpContext.ajax_rsp_assign_attri("", false, "A13265VMETROS", GXutil.ltrim( localUtil.ntoc( A13265VMETROS, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13266VABONO", GXutil.ltrim( localUtil.ntoc( A13266VABONO, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13267VKILOS", GXutil.ltrim( localUtil.ntoc( A13267VKILOS, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13268VDATA", localUtil.format(A13268VDATA, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13269VALBARA", GXutil.ltrim( localUtil.ntoc( A13269VALBARA, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13270VTARA1", GXutil.ltrim( localUtil.ntoc( A13270VTARA1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13271VTARA2", GXutil.ltrim( localUtil.ntoc( A13271VTARA2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13272VTARA3", GXutil.ltrim( localUtil.ntoc( A13272VTARA3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13273VTARA4", GXutil.ltrim( localUtil.ntoc( A13273VTARA4, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13274VSERIEVIN", GXutil.rtrim( A13274VSERIEVIN));
      httpContext.ajax_rsp_assign_attri("", false, "A13275VUSUARI", GXutil.rtrim( A13275VUSUARI));
      httpContext.ajax_rsp_assign_attri("", false, "A13276VNTARA1", GXutil.ltrim( localUtil.ntoc( A13276VNTARA1, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13277VNTARA2", GXutil.ltrim( localUtil.ntoc( A13277VNTARA2, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13278VNTARA3", GXutil.ltrim( localUtil.ntoc( A13278VNTARA3, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13279VNTARA4", GXutil.ltrim( localUtil.ntoc( A13279VNTARA4, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13280VA_REPAS", GXutil.rtrim( A13280VA_REPAS));
      httpContext.ajax_rsp_assign_attri("", false, "A13281VDESTINO", GXutil.ltrim( localUtil.ntoc( A13281VDESTINO, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13282VCLIENTE", GXutil.ltrim( localUtil.ntoc( A13282VCLIENTE, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13283VPEDIDO", GXutil.ltrim( localUtil.ntoc( A13283VPEDIDO, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13284VOBSER", A13284VOBSER);
      httpContext.ajax_rsp_assign_attri("", false, "A13285VCALIDAD", GXutil.ltrim( localUtil.ntoc( A13285VCALIDAD, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13286VLINEA", GXutil.ltrim( localUtil.ntoc( A13286VLINEA, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13287VBARCADAX", GXutil.rtrim( A13287VBARCADAX));
      httpContext.ajax_rsp_assign_attri("", false, "A13288VGABIA", GXutil.rtrim( A13288VGABIA));
      httpContext.ajax_rsp_assign_attri("", false, "A13289VFINDISPO", GXutil.ltrim( localUtil.ntoc( A13289VFINDISPO, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13290VCONTADO", GXutil.rtrim( A13290VCONTADO));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13254VID", GXutil.ltrim( localUtil.ntoc( Z13254VID, (byte)(15), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13255VTIPOPER", GXutil.rtrim( Z13255VTIPOPER));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13256VFECGRA", localUtil.format(Z13256VFECGRA, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13257VHORGRA", GXutil.rtrim( Z13257VHORGRA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13258VFECLEC", localUtil.format(Z13258VFECLEC, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13259VHORLEC", GXutil.rtrim( Z13259VHORLEC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13260VSTATUS", GXutil.rtrim( Z13260VSTATUS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13261VERRDES", GXutil.rtrim( Z13261VERRDES));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13262VSERIE", GXutil.ltrim( localUtil.ntoc( Z13262VSERIE, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13263VCOLOR", GXutil.ltrim( localUtil.ntoc( Z13263VCOLOR, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13264VPIEZA", GXutil.rtrim( Z13264VPIEZA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13265VMETROS", GXutil.ltrim( localUtil.ntoc( Z13265VMETROS, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13266VABONO", GXutil.ltrim( localUtil.ntoc( Z13266VABONO, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13267VKILOS", GXutil.ltrim( localUtil.ntoc( Z13267VKILOS, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13268VDATA", localUtil.format(Z13268VDATA, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13269VALBARA", GXutil.ltrim( localUtil.ntoc( Z13269VALBARA, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13270VTARA1", GXutil.ltrim( localUtil.ntoc( Z13270VTARA1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13271VTARA2", GXutil.ltrim( localUtil.ntoc( Z13271VTARA2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13272VTARA3", GXutil.ltrim( localUtil.ntoc( Z13272VTARA3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13273VTARA4", GXutil.ltrim( localUtil.ntoc( Z13273VTARA4, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13274VSERIEVIN", GXutil.rtrim( Z13274VSERIEVIN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13275VUSUARI", GXutil.rtrim( Z13275VUSUARI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13276VNTARA1", GXutil.ltrim( localUtil.ntoc( Z13276VNTARA1, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13277VNTARA2", GXutil.ltrim( localUtil.ntoc( Z13277VNTARA2, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13278VNTARA3", GXutil.ltrim( localUtil.ntoc( Z13278VNTARA3, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13279VNTARA4", GXutil.ltrim( localUtil.ntoc( Z13279VNTARA4, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13280VA_REPAS", GXutil.rtrim( Z13280VA_REPAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13281VDESTINO", GXutil.ltrim( localUtil.ntoc( Z13281VDESTINO, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13282VCLIENTE", GXutil.ltrim( localUtil.ntoc( Z13282VCLIENTE, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13283VPEDIDO", GXutil.ltrim( localUtil.ntoc( Z13283VPEDIDO, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13284VOBSER", Z13284VOBSER);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13285VCALIDAD", GXutil.ltrim( localUtil.ntoc( Z13285VCALIDAD, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13286VLINEA", GXutil.ltrim( localUtil.ntoc( Z13286VLINEA, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13287VBARCADAX", GXutil.rtrim( Z13287VBARCADAX));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13288VGABIA", GXutil.rtrim( Z13288VGABIA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13289VFINDISPO", GXutil.ltrim( localUtil.ntoc( Z13289VFINDISPO, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13290VCONTADO", GXutil.rtrim( Z13290VCONTADO));
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
      setEventMetadata("VALID_VID","{handler:'valid_Vid',iparms:[{av:'A13254VID',fld:'VID',pic:'ZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VID",",oparms:[{av:'A13255VTIPOPER',fld:'VTIPOPER',pic:''},{av:'A13256VFECGRA',fld:'VFECGRA',pic:''},{av:'A13257VHORGRA',fld:'VHORGRA',pic:''},{av:'A13258VFECLEC',fld:'VFECLEC',pic:''},{av:'A13259VHORLEC',fld:'VHORLEC',pic:''},{av:'A13260VSTATUS',fld:'VSTATUS',pic:''},{av:'A13261VERRDES',fld:'VERRDES',pic:''},{av:'A13262VSERIE',fld:'VSERIE',pic:'ZZZZZ9'},{av:'A13263VCOLOR',fld:'VCOLOR',pic:'ZZZ9'},{av:'A13264VPIEZA',fld:'VPIEZA',pic:''},{av:'A13265VMETROS',fld:'VMETROS',pic:'ZZZZ9.99'},{av:'A13266VABONO',fld:'VABONO',pic:'ZZZZ9.99'},{av:'A13267VKILOS',fld:'VKILOS',pic:'ZZZZ9.99'},{av:'A13268VDATA',fld:'VDATA',pic:''},{av:'A13269VALBARA',fld:'VALBARA',pic:'ZZZZZ9'},{av:'A13270VTARA1',fld:'VTARA1',pic:'ZZ9'},{av:'A13271VTARA2',fld:'VTARA2',pic:'ZZ9'},{av:'A13272VTARA3',fld:'VTARA3',pic:'ZZ9'},{av:'A13273VTARA4',fld:'VTARA4',pic:'ZZ9'},{av:'A13274VSERIEVIN',fld:'VSERIEVIN',pic:''},{av:'A13275VUSUARI',fld:'VUSUARI',pic:''},{av:'A13276VNTARA1',fld:'VNTARA1',pic:'9'},{av:'A13277VNTARA2',fld:'VNTARA2',pic:'9'},{av:'A13278VNTARA3',fld:'VNTARA3',pic:'9'},{av:'A13279VNTARA4',fld:'VNTARA4',pic:'9'},{av:'A13280VA_REPAS',fld:'VA_REPAS',pic:''},{av:'A13281VDESTINO',fld:'VDESTINO',pic:'Z9'},{av:'A13282VCLIENTE',fld:'VCLIENTE',pic:'ZZZZZ9'},{av:'A13283VPEDIDO',fld:'VPEDIDO',pic:'ZZZZZ9'},{av:'A13284VOBSER',fld:'VOBSER',pic:''},{av:'A13285VCALIDAD',fld:'VCALIDAD',pic:'ZZZ9'},{av:'A13286VLINEA',fld:'VLINEA',pic:'ZZZ9'},{av:'A13287VBARCADAX',fld:'VBARCADAX',pic:''},{av:'A13288VGABIA',fld:'VGABIA',pic:''},{av:'A13289VFINDISPO',fld:'VFINDISPO',pic:'9'},{av:'A13290VCONTADO',fld:'VCONTADO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z13254VID'},{av:'Z13255VTIPOPER'},{av:'Z13256VFECGRA'},{av:'Z13257VHORGRA'},{av:'Z13258VFECLEC'},{av:'Z13259VHORLEC'},{av:'Z13260VSTATUS'},{av:'Z13261VERRDES'},{av:'Z13262VSERIE'},{av:'Z13263VCOLOR'},{av:'Z13264VPIEZA'},{av:'Z13265VMETROS'},{av:'Z13266VABONO'},{av:'Z13267VKILOS'},{av:'Z13268VDATA'},{av:'Z13269VALBARA'},{av:'Z13270VTARA1'},{av:'Z13271VTARA2'},{av:'Z13272VTARA3'},{av:'Z13273VTARA4'},{av:'Z13274VSERIEVIN'},{av:'Z13275VUSUARI'},{av:'Z13276VNTARA1'},{av:'Z13277VNTARA2'},{av:'Z13278VNTARA3'},{av:'Z13279VNTARA4'},{av:'Z13280VA_REPAS'},{av:'Z13281VDESTINO'},{av:'Z13282VCLIENTE'},{av:'Z13283VPEDIDO'},{av:'Z13284VOBSER'},{av:'Z13285VCALIDAD'},{av:'Z13286VLINEA'},{av:'Z13287VBARCADAX'},{av:'Z13288VGABIA'},{av:'Z13289VFINDISPO'},{av:'Z13290VCONTADO'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z13255VTIPOPER = "" ;
      Z13256VFECGRA = GXutil.nullDate() ;
      Z13257VHORGRA = "" ;
      Z13258VFECLEC = GXutil.nullDate() ;
      Z13259VHORLEC = "" ;
      Z13260VSTATUS = "" ;
      Z13261VERRDES = "" ;
      Z13264VPIEZA = "" ;
      Z13265VMETROS = DecimalUtil.ZERO ;
      Z13266VABONO = DecimalUtil.ZERO ;
      Z13267VKILOS = DecimalUtil.ZERO ;
      Z13268VDATA = GXutil.nullDate() ;
      Z13274VSERIEVIN = "" ;
      Z13275VUSUARI = "" ;
      Z13280VA_REPAS = "" ;
      Z13287VBARCADAX = "" ;
      Z13288VGABIA = "" ;
      Z13290VCONTADO = "" ;
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
      A13255VTIPOPER = "" ;
      lblTextblock3_Jsonclick = "" ;
      A13256VFECGRA = GXutil.nullDate() ;
      lblTextblock4_Jsonclick = "" ;
      A13257VHORGRA = "" ;
      lblTextblock5_Jsonclick = "" ;
      A13258VFECLEC = GXutil.nullDate() ;
      lblTextblock6_Jsonclick = "" ;
      A13259VHORLEC = "" ;
      lblTextblock7_Jsonclick = "" ;
      A13260VSTATUS = "" ;
      lblTextblock8_Jsonclick = "" ;
      A13261VERRDES = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13264VPIEZA = "" ;
      lblTextblock12_Jsonclick = "" ;
      A13265VMETROS = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A13266VABONO = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A13267VKILOS = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A13268VDATA = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A13274VSERIEVIN = "" ;
      lblTextblock22_Jsonclick = "" ;
      A13275VUSUARI = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A13280VA_REPAS = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A13284VOBSER = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A13287VBARCADAX = "" ;
      lblTextblock35_Jsonclick = "" ;
      A13288VGABIA = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      A13290VCONTADO = "" ;
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
      Z13284VOBSER = "" ;
      T01NN4_A13284VOBSER = new String[] {""} ;
      T01NN4_n13284VOBSER = new boolean[] {false} ;
      T01NN4_A13254VID = new long[1] ;
      T01NN4_A13255VTIPOPER = new String[] {""} ;
      T01NN4_n13255VTIPOPER = new boolean[] {false} ;
      T01NN4_A13256VFECGRA = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN4_n13256VFECGRA = new boolean[] {false} ;
      T01NN4_A13257VHORGRA = new String[] {""} ;
      T01NN4_n13257VHORGRA = new boolean[] {false} ;
      T01NN4_A13258VFECLEC = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN4_n13258VFECLEC = new boolean[] {false} ;
      T01NN4_A13259VHORLEC = new String[] {""} ;
      T01NN4_n13259VHORLEC = new boolean[] {false} ;
      T01NN4_A13260VSTATUS = new String[] {""} ;
      T01NN4_n13260VSTATUS = new boolean[] {false} ;
      T01NN4_A13261VERRDES = new String[] {""} ;
      T01NN4_n13261VERRDES = new boolean[] {false} ;
      T01NN4_A13262VSERIE = new int[1] ;
      T01NN4_n13262VSERIE = new boolean[] {false} ;
      T01NN4_A13263VCOLOR = new short[1] ;
      T01NN4_n13263VCOLOR = new boolean[] {false} ;
      T01NN4_A13264VPIEZA = new String[] {""} ;
      T01NN4_n13264VPIEZA = new boolean[] {false} ;
      T01NN4_A13265VMETROS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN4_n13265VMETROS = new boolean[] {false} ;
      T01NN4_A13266VABONO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN4_n13266VABONO = new boolean[] {false} ;
      T01NN4_A13267VKILOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN4_n13267VKILOS = new boolean[] {false} ;
      T01NN4_A13268VDATA = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN4_n13268VDATA = new boolean[] {false} ;
      T01NN4_A13269VALBARA = new int[1] ;
      T01NN4_n13269VALBARA = new boolean[] {false} ;
      T01NN4_A13270VTARA1 = new short[1] ;
      T01NN4_n13270VTARA1 = new boolean[] {false} ;
      T01NN4_A13271VTARA2 = new short[1] ;
      T01NN4_n13271VTARA2 = new boolean[] {false} ;
      T01NN4_A13272VTARA3 = new short[1] ;
      T01NN4_n13272VTARA3 = new boolean[] {false} ;
      T01NN4_A13273VTARA4 = new short[1] ;
      T01NN4_n13273VTARA4 = new boolean[] {false} ;
      T01NN4_A13274VSERIEVIN = new String[] {""} ;
      T01NN4_n13274VSERIEVIN = new boolean[] {false} ;
      T01NN4_A13275VUSUARI = new String[] {""} ;
      T01NN4_n13275VUSUARI = new boolean[] {false} ;
      T01NN4_A13276VNTARA1 = new byte[1] ;
      T01NN4_n13276VNTARA1 = new boolean[] {false} ;
      T01NN4_A13277VNTARA2 = new byte[1] ;
      T01NN4_n13277VNTARA2 = new boolean[] {false} ;
      T01NN4_A13278VNTARA3 = new byte[1] ;
      T01NN4_n13278VNTARA3 = new boolean[] {false} ;
      T01NN4_A13279VNTARA4 = new byte[1] ;
      T01NN4_n13279VNTARA4 = new boolean[] {false} ;
      T01NN4_A13280VA_REPAS = new String[] {""} ;
      T01NN4_n13280VA_REPAS = new boolean[] {false} ;
      T01NN4_A13281VDESTINO = new byte[1] ;
      T01NN4_n13281VDESTINO = new boolean[] {false} ;
      T01NN4_A13282VCLIENTE = new int[1] ;
      T01NN4_n13282VCLIENTE = new boolean[] {false} ;
      T01NN4_A13283VPEDIDO = new int[1] ;
      T01NN4_n13283VPEDIDO = new boolean[] {false} ;
      T01NN4_A13285VCALIDAD = new short[1] ;
      T01NN4_n13285VCALIDAD = new boolean[] {false} ;
      T01NN4_A13286VLINEA = new short[1] ;
      T01NN4_n13286VLINEA = new boolean[] {false} ;
      T01NN4_A13287VBARCADAX = new String[] {""} ;
      T01NN4_n13287VBARCADAX = new boolean[] {false} ;
      T01NN4_A13288VGABIA = new String[] {""} ;
      T01NN4_n13288VGABIA = new boolean[] {false} ;
      T01NN4_A13289VFINDISPO = new byte[1] ;
      T01NN4_n13289VFINDISPO = new boolean[] {false} ;
      T01NN4_A13290VCONTADO = new String[] {""} ;
      T01NN4_n13290VCONTADO = new boolean[] {false} ;
      T01NN5_A13254VID = new long[1] ;
      T01NN3_A13284VOBSER = new String[] {""} ;
      T01NN3_n13284VOBSER = new boolean[] {false} ;
      T01NN3_A13254VID = new long[1] ;
      T01NN3_A13255VTIPOPER = new String[] {""} ;
      T01NN3_n13255VTIPOPER = new boolean[] {false} ;
      T01NN3_A13256VFECGRA = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN3_n13256VFECGRA = new boolean[] {false} ;
      T01NN3_A13257VHORGRA = new String[] {""} ;
      T01NN3_n13257VHORGRA = new boolean[] {false} ;
      T01NN3_A13258VFECLEC = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN3_n13258VFECLEC = new boolean[] {false} ;
      T01NN3_A13259VHORLEC = new String[] {""} ;
      T01NN3_n13259VHORLEC = new boolean[] {false} ;
      T01NN3_A13260VSTATUS = new String[] {""} ;
      T01NN3_n13260VSTATUS = new boolean[] {false} ;
      T01NN3_A13261VERRDES = new String[] {""} ;
      T01NN3_n13261VERRDES = new boolean[] {false} ;
      T01NN3_A13262VSERIE = new int[1] ;
      T01NN3_n13262VSERIE = new boolean[] {false} ;
      T01NN3_A13263VCOLOR = new short[1] ;
      T01NN3_n13263VCOLOR = new boolean[] {false} ;
      T01NN3_A13264VPIEZA = new String[] {""} ;
      T01NN3_n13264VPIEZA = new boolean[] {false} ;
      T01NN3_A13265VMETROS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN3_n13265VMETROS = new boolean[] {false} ;
      T01NN3_A13266VABONO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN3_n13266VABONO = new boolean[] {false} ;
      T01NN3_A13267VKILOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN3_n13267VKILOS = new boolean[] {false} ;
      T01NN3_A13268VDATA = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN3_n13268VDATA = new boolean[] {false} ;
      T01NN3_A13269VALBARA = new int[1] ;
      T01NN3_n13269VALBARA = new boolean[] {false} ;
      T01NN3_A13270VTARA1 = new short[1] ;
      T01NN3_n13270VTARA1 = new boolean[] {false} ;
      T01NN3_A13271VTARA2 = new short[1] ;
      T01NN3_n13271VTARA2 = new boolean[] {false} ;
      T01NN3_A13272VTARA3 = new short[1] ;
      T01NN3_n13272VTARA3 = new boolean[] {false} ;
      T01NN3_A13273VTARA4 = new short[1] ;
      T01NN3_n13273VTARA4 = new boolean[] {false} ;
      T01NN3_A13274VSERIEVIN = new String[] {""} ;
      T01NN3_n13274VSERIEVIN = new boolean[] {false} ;
      T01NN3_A13275VUSUARI = new String[] {""} ;
      T01NN3_n13275VUSUARI = new boolean[] {false} ;
      T01NN3_A13276VNTARA1 = new byte[1] ;
      T01NN3_n13276VNTARA1 = new boolean[] {false} ;
      T01NN3_A13277VNTARA2 = new byte[1] ;
      T01NN3_n13277VNTARA2 = new boolean[] {false} ;
      T01NN3_A13278VNTARA3 = new byte[1] ;
      T01NN3_n13278VNTARA3 = new boolean[] {false} ;
      T01NN3_A13279VNTARA4 = new byte[1] ;
      T01NN3_n13279VNTARA4 = new boolean[] {false} ;
      T01NN3_A13280VA_REPAS = new String[] {""} ;
      T01NN3_n13280VA_REPAS = new boolean[] {false} ;
      T01NN3_A13281VDESTINO = new byte[1] ;
      T01NN3_n13281VDESTINO = new boolean[] {false} ;
      T01NN3_A13282VCLIENTE = new int[1] ;
      T01NN3_n13282VCLIENTE = new boolean[] {false} ;
      T01NN3_A13283VPEDIDO = new int[1] ;
      T01NN3_n13283VPEDIDO = new boolean[] {false} ;
      T01NN3_A13285VCALIDAD = new short[1] ;
      T01NN3_n13285VCALIDAD = new boolean[] {false} ;
      T01NN3_A13286VLINEA = new short[1] ;
      T01NN3_n13286VLINEA = new boolean[] {false} ;
      T01NN3_A13287VBARCADAX = new String[] {""} ;
      T01NN3_n13287VBARCADAX = new boolean[] {false} ;
      T01NN3_A13288VGABIA = new String[] {""} ;
      T01NN3_n13288VGABIA = new boolean[] {false} ;
      T01NN3_A13289VFINDISPO = new byte[1] ;
      T01NN3_n13289VFINDISPO = new boolean[] {false} ;
      T01NN3_A13290VCONTADO = new String[] {""} ;
      T01NN3_n13290VCONTADO = new boolean[] {false} ;
      sMode1816 = "" ;
      T01NN6_A13254VID = new long[1] ;
      T01NN7_A13254VID = new long[1] ;
      T01NN2_A13284VOBSER = new String[] {""} ;
      T01NN2_n13284VOBSER = new boolean[] {false} ;
      T01NN2_A13254VID = new long[1] ;
      T01NN2_A13255VTIPOPER = new String[] {""} ;
      T01NN2_n13255VTIPOPER = new boolean[] {false} ;
      T01NN2_A13256VFECGRA = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN2_n13256VFECGRA = new boolean[] {false} ;
      T01NN2_A13257VHORGRA = new String[] {""} ;
      T01NN2_n13257VHORGRA = new boolean[] {false} ;
      T01NN2_A13258VFECLEC = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN2_n13258VFECLEC = new boolean[] {false} ;
      T01NN2_A13259VHORLEC = new String[] {""} ;
      T01NN2_n13259VHORLEC = new boolean[] {false} ;
      T01NN2_A13260VSTATUS = new String[] {""} ;
      T01NN2_n13260VSTATUS = new boolean[] {false} ;
      T01NN2_A13261VERRDES = new String[] {""} ;
      T01NN2_n13261VERRDES = new boolean[] {false} ;
      T01NN2_A13262VSERIE = new int[1] ;
      T01NN2_n13262VSERIE = new boolean[] {false} ;
      T01NN2_A13263VCOLOR = new short[1] ;
      T01NN2_n13263VCOLOR = new boolean[] {false} ;
      T01NN2_A13264VPIEZA = new String[] {""} ;
      T01NN2_n13264VPIEZA = new boolean[] {false} ;
      T01NN2_A13265VMETROS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN2_n13265VMETROS = new boolean[] {false} ;
      T01NN2_A13266VABONO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN2_n13266VABONO = new boolean[] {false} ;
      T01NN2_A13267VKILOS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NN2_n13267VKILOS = new boolean[] {false} ;
      T01NN2_A13268VDATA = new java.util.Date[] {GXutil.nullDate()} ;
      T01NN2_n13268VDATA = new boolean[] {false} ;
      T01NN2_A13269VALBARA = new int[1] ;
      T01NN2_n13269VALBARA = new boolean[] {false} ;
      T01NN2_A13270VTARA1 = new short[1] ;
      T01NN2_n13270VTARA1 = new boolean[] {false} ;
      T01NN2_A13271VTARA2 = new short[1] ;
      T01NN2_n13271VTARA2 = new boolean[] {false} ;
      T01NN2_A13272VTARA3 = new short[1] ;
      T01NN2_n13272VTARA3 = new boolean[] {false} ;
      T01NN2_A13273VTARA4 = new short[1] ;
      T01NN2_n13273VTARA4 = new boolean[] {false} ;
      T01NN2_A13274VSERIEVIN = new String[] {""} ;
      T01NN2_n13274VSERIEVIN = new boolean[] {false} ;
      T01NN2_A13275VUSUARI = new String[] {""} ;
      T01NN2_n13275VUSUARI = new boolean[] {false} ;
      T01NN2_A13276VNTARA1 = new byte[1] ;
      T01NN2_n13276VNTARA1 = new boolean[] {false} ;
      T01NN2_A13277VNTARA2 = new byte[1] ;
      T01NN2_n13277VNTARA2 = new boolean[] {false} ;
      T01NN2_A13278VNTARA3 = new byte[1] ;
      T01NN2_n13278VNTARA3 = new boolean[] {false} ;
      T01NN2_A13279VNTARA4 = new byte[1] ;
      T01NN2_n13279VNTARA4 = new boolean[] {false} ;
      T01NN2_A13280VA_REPAS = new String[] {""} ;
      T01NN2_n13280VA_REPAS = new boolean[] {false} ;
      T01NN2_A13281VDESTINO = new byte[1] ;
      T01NN2_n13281VDESTINO = new boolean[] {false} ;
      T01NN2_A13282VCLIENTE = new int[1] ;
      T01NN2_n13282VCLIENTE = new boolean[] {false} ;
      T01NN2_A13283VPEDIDO = new int[1] ;
      T01NN2_n13283VPEDIDO = new boolean[] {false} ;
      T01NN2_A13285VCALIDAD = new short[1] ;
      T01NN2_n13285VCALIDAD = new boolean[] {false} ;
      T01NN2_A13286VLINEA = new short[1] ;
      T01NN2_n13286VLINEA = new boolean[] {false} ;
      T01NN2_A13287VBARCADAX = new String[] {""} ;
      T01NN2_n13287VBARCADAX = new boolean[] {false} ;
      T01NN2_A13288VGABIA = new String[] {""} ;
      T01NN2_n13288VGABIA = new boolean[] {false} ;
      T01NN2_A13289VFINDISPO = new byte[1] ;
      T01NN2_n13289VFINDISPO = new boolean[] {false} ;
      T01NN2_A13290VCONTADO = new String[] {""} ;
      T01NN2_n13290VCONTADO = new boolean[] {false} ;
      T01NN11_A13254VID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ13255VTIPOPER = "" ;
      ZZ13256VFECGRA = GXutil.nullDate() ;
      ZZ13257VHORGRA = "" ;
      ZZ13258VFECLEC = GXutil.nullDate() ;
      ZZ13259VHORLEC = "" ;
      ZZ13260VSTATUS = "" ;
      ZZ13261VERRDES = "" ;
      ZZ13264VPIEZA = "" ;
      ZZ13265VMETROS = DecimalUtil.ZERO ;
      ZZ13266VABONO = DecimalUtil.ZERO ;
      ZZ13267VKILOS = DecimalUtil.ZERO ;
      ZZ13268VDATA = GXutil.nullDate() ;
      ZZ13274VSERIEVIN = "" ;
      ZZ13275VUSUARI = "" ;
      ZZ13280VA_REPAS = "" ;
      ZZ13284VOBSER = "" ;
      ZZ13287VBARCADAX = "" ;
      ZZ13288VGABIA = "" ;
      ZZ13290VCONTADO = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tincasrea__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tincasrea__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tincasrea__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tincasrea__default(),
         new Object[] {
             new Object[] {
            T01NN2_A13284VOBSER, T01NN2_n13284VOBSER, T01NN2_A13254VID, T01NN2_A13255VTIPOPER, T01NN2_n13255VTIPOPER, T01NN2_A13256VFECGRA, T01NN2_n13256VFECGRA, T01NN2_A13257VHORGRA, T01NN2_n13257VHORGRA, T01NN2_A13258VFECLEC,
            T01NN2_n13258VFECLEC, T01NN2_A13259VHORLEC, T01NN2_n13259VHORLEC, T01NN2_A13260VSTATUS, T01NN2_n13260VSTATUS, T01NN2_A13261VERRDES, T01NN2_n13261VERRDES, T01NN2_A13262VSERIE, T01NN2_n13262VSERIE, T01NN2_A13263VCOLOR,
            T01NN2_n13263VCOLOR, T01NN2_A13264VPIEZA, T01NN2_n13264VPIEZA, T01NN2_A13265VMETROS, T01NN2_n13265VMETROS, T01NN2_A13266VABONO, T01NN2_n13266VABONO, T01NN2_A13267VKILOS, T01NN2_n13267VKILOS, T01NN2_A13268VDATA,
            T01NN2_n13268VDATA, T01NN2_A13269VALBARA, T01NN2_n13269VALBARA, T01NN2_A13270VTARA1, T01NN2_n13270VTARA1, T01NN2_A13271VTARA2, T01NN2_n13271VTARA2, T01NN2_A13272VTARA3, T01NN2_n13272VTARA3, T01NN2_A13273VTARA4,
            T01NN2_n13273VTARA4, T01NN2_A13274VSERIEVIN, T01NN2_n13274VSERIEVIN, T01NN2_A13275VUSUARI, T01NN2_n13275VUSUARI, T01NN2_A13276VNTARA1, T01NN2_n13276VNTARA1, T01NN2_A13277VNTARA2, T01NN2_n13277VNTARA2, T01NN2_A13278VNTARA3,
            T01NN2_n13278VNTARA3, T01NN2_A13279VNTARA4, T01NN2_n13279VNTARA4, T01NN2_A13280VA_REPAS, T01NN2_n13280VA_REPAS, T01NN2_A13281VDESTINO, T01NN2_n13281VDESTINO, T01NN2_A13282VCLIENTE, T01NN2_n13282VCLIENTE, T01NN2_A13283VPEDIDO,
            T01NN2_n13283VPEDIDO, T01NN2_A13285VCALIDAD, T01NN2_n13285VCALIDAD, T01NN2_A13286VLINEA, T01NN2_n13286VLINEA, T01NN2_A13287VBARCADAX, T01NN2_n13287VBARCADAX, T01NN2_A13288VGABIA, T01NN2_n13288VGABIA, T01NN2_A13289VFINDISPO,
            T01NN2_n13289VFINDISPO, T01NN2_A13290VCONTADO, T01NN2_n13290VCONTADO
            }
            , new Object[] {
            T01NN3_A13284VOBSER, T01NN3_n13284VOBSER, T01NN3_A13254VID, T01NN3_A13255VTIPOPER, T01NN3_n13255VTIPOPER, T01NN3_A13256VFECGRA, T01NN3_n13256VFECGRA, T01NN3_A13257VHORGRA, T01NN3_n13257VHORGRA, T01NN3_A13258VFECLEC,
            T01NN3_n13258VFECLEC, T01NN3_A13259VHORLEC, T01NN3_n13259VHORLEC, T01NN3_A13260VSTATUS, T01NN3_n13260VSTATUS, T01NN3_A13261VERRDES, T01NN3_n13261VERRDES, T01NN3_A13262VSERIE, T01NN3_n13262VSERIE, T01NN3_A13263VCOLOR,
            T01NN3_n13263VCOLOR, T01NN3_A13264VPIEZA, T01NN3_n13264VPIEZA, T01NN3_A13265VMETROS, T01NN3_n13265VMETROS, T01NN3_A13266VABONO, T01NN3_n13266VABONO, T01NN3_A13267VKILOS, T01NN3_n13267VKILOS, T01NN3_A13268VDATA,
            T01NN3_n13268VDATA, T01NN3_A13269VALBARA, T01NN3_n13269VALBARA, T01NN3_A13270VTARA1, T01NN3_n13270VTARA1, T01NN3_A13271VTARA2, T01NN3_n13271VTARA2, T01NN3_A13272VTARA3, T01NN3_n13272VTARA3, T01NN3_A13273VTARA4,
            T01NN3_n13273VTARA4, T01NN3_A13274VSERIEVIN, T01NN3_n13274VSERIEVIN, T01NN3_A13275VUSUARI, T01NN3_n13275VUSUARI, T01NN3_A13276VNTARA1, T01NN3_n13276VNTARA1, T01NN3_A13277VNTARA2, T01NN3_n13277VNTARA2, T01NN3_A13278VNTARA3,
            T01NN3_n13278VNTARA3, T01NN3_A13279VNTARA4, T01NN3_n13279VNTARA4, T01NN3_A13280VA_REPAS, T01NN3_n13280VA_REPAS, T01NN3_A13281VDESTINO, T01NN3_n13281VDESTINO, T01NN3_A13282VCLIENTE, T01NN3_n13282VCLIENTE, T01NN3_A13283VPEDIDO,
            T01NN3_n13283VPEDIDO, T01NN3_A13285VCALIDAD, T01NN3_n13285VCALIDAD, T01NN3_A13286VLINEA, T01NN3_n13286VLINEA, T01NN3_A13287VBARCADAX, T01NN3_n13287VBARCADAX, T01NN3_A13288VGABIA, T01NN3_n13288VGABIA, T01NN3_A13289VFINDISPO,
            T01NN3_n13289VFINDISPO, T01NN3_A13290VCONTADO, T01NN3_n13290VCONTADO
            }
            , new Object[] {
            T01NN4_A13284VOBSER, T01NN4_n13284VOBSER, T01NN4_A13254VID, T01NN4_A13255VTIPOPER, T01NN4_n13255VTIPOPER, T01NN4_A13256VFECGRA, T01NN4_n13256VFECGRA, T01NN4_A13257VHORGRA, T01NN4_n13257VHORGRA, T01NN4_A13258VFECLEC,
            T01NN4_n13258VFECLEC, T01NN4_A13259VHORLEC, T01NN4_n13259VHORLEC, T01NN4_A13260VSTATUS, T01NN4_n13260VSTATUS, T01NN4_A13261VERRDES, T01NN4_n13261VERRDES, T01NN4_A13262VSERIE, T01NN4_n13262VSERIE, T01NN4_A13263VCOLOR,
            T01NN4_n13263VCOLOR, T01NN4_A13264VPIEZA, T01NN4_n13264VPIEZA, T01NN4_A13265VMETROS, T01NN4_n13265VMETROS, T01NN4_A13266VABONO, T01NN4_n13266VABONO, T01NN4_A13267VKILOS, T01NN4_n13267VKILOS, T01NN4_A13268VDATA,
            T01NN4_n13268VDATA, T01NN4_A13269VALBARA, T01NN4_n13269VALBARA, T01NN4_A13270VTARA1, T01NN4_n13270VTARA1, T01NN4_A13271VTARA2, T01NN4_n13271VTARA2, T01NN4_A13272VTARA3, T01NN4_n13272VTARA3, T01NN4_A13273VTARA4,
            T01NN4_n13273VTARA4, T01NN4_A13274VSERIEVIN, T01NN4_n13274VSERIEVIN, T01NN4_A13275VUSUARI, T01NN4_n13275VUSUARI, T01NN4_A13276VNTARA1, T01NN4_n13276VNTARA1, T01NN4_A13277VNTARA2, T01NN4_n13277VNTARA2, T01NN4_A13278VNTARA3,
            T01NN4_n13278VNTARA3, T01NN4_A13279VNTARA4, T01NN4_n13279VNTARA4, T01NN4_A13280VA_REPAS, T01NN4_n13280VA_REPAS, T01NN4_A13281VDESTINO, T01NN4_n13281VDESTINO, T01NN4_A13282VCLIENTE, T01NN4_n13282VCLIENTE, T01NN4_A13283VPEDIDO,
            T01NN4_n13283VPEDIDO, T01NN4_A13285VCALIDAD, T01NN4_n13285VCALIDAD, T01NN4_A13286VLINEA, T01NN4_n13286VLINEA, T01NN4_A13287VBARCADAX, T01NN4_n13287VBARCADAX, T01NN4_A13288VGABIA, T01NN4_n13288VGABIA, T01NN4_A13289VFINDISPO,
            T01NN4_n13289VFINDISPO, T01NN4_A13290VCONTADO, T01NN4_n13290VCONTADO
            }
            , new Object[] {
            T01NN5_A13254VID
            }
            , new Object[] {
            T01NN6_A13254VID
            }
            , new Object[] {
            T01NN7_A13254VID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NN11_A13254VID
            }
         }
      );
   }

   private byte Z13276VNTARA1 ;
   private byte Z13277VNTARA2 ;
   private byte Z13278VNTARA3 ;
   private byte Z13279VNTARA4 ;
   private byte Z13281VDESTINO ;
   private byte Z13289VFINDISPO ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13276VNTARA1 ;
   private byte A13277VNTARA2 ;
   private byte A13278VNTARA3 ;
   private byte A13279VNTARA4 ;
   private byte A13281VDESTINO ;
   private byte A13289VFINDISPO ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ13276VNTARA1 ;
   private byte ZZ13277VNTARA2 ;
   private byte ZZ13278VNTARA3 ;
   private byte ZZ13279VNTARA4 ;
   private byte ZZ13281VDESTINO ;
   private byte ZZ13289VFINDISPO ;
   private short Z13263VCOLOR ;
   private short Z13270VTARA1 ;
   private short Z13271VTARA2 ;
   private short Z13272VTARA3 ;
   private short Z13273VTARA4 ;
   private short Z13285VCALIDAD ;
   private short Z13286VLINEA ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13263VCOLOR ;
   private short A13270VTARA1 ;
   private short A13271VTARA2 ;
   private short A13272VTARA3 ;
   private short A13273VTARA4 ;
   private short A13285VCALIDAD ;
   private short A13286VLINEA ;
   private short RcdFound1816 ;
   private short nIsDirty_1816 ;
   private short ZZ13263VCOLOR ;
   private short ZZ13270VTARA1 ;
   private short ZZ13271VTARA2 ;
   private short ZZ13272VTARA3 ;
   private short ZZ13273VTARA4 ;
   private short ZZ13285VCALIDAD ;
   private short ZZ13286VLINEA ;
   private int Z13262VSERIE ;
   private int Z13269VALBARA ;
   private int Z13282VCLIENTE ;
   private int Z13283VPEDIDO ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVTIPOPER_Enabled ;
   private int edtVFECGRA_Enabled ;
   private int edtVHORGRA_Enabled ;
   private int edtVFECLEC_Enabled ;
   private int edtVHORLEC_Enabled ;
   private int edtVSTATUS_Enabled ;
   private int edtVERRDES_Enabled ;
   private int A13262VSERIE ;
   private int edtVSERIE_Enabled ;
   private int edtVCOLOR_Enabled ;
   private int edtVPIEZA_Enabled ;
   private int edtVMETROS_Enabled ;
   private int edtVABONO_Enabled ;
   private int edtVKILOS_Enabled ;
   private int edtVDATA_Enabled ;
   private int A13269VALBARA ;
   private int edtVALBARA_Enabled ;
   private int edtVTARA1_Enabled ;
   private int edtVTARA2_Enabled ;
   private int edtVTARA3_Enabled ;
   private int edtVTARA4_Enabled ;
   private int edtVSERIEVIN_Enabled ;
   private int edtVUSUARI_Enabled ;
   private int edtVNTARA1_Enabled ;
   private int edtVNTARA2_Enabled ;
   private int edtVNTARA3_Enabled ;
   private int edtVNTARA4_Enabled ;
   private int edtVA_REPAS_Enabled ;
   private int edtVDESTINO_Enabled ;
   private int A13282VCLIENTE ;
   private int edtVCLIENTE_Enabled ;
   private int A13283VPEDIDO ;
   private int edtVPEDIDO_Enabled ;
   private int edtVOBSER_Enabled ;
   private int edtVCALIDAD_Enabled ;
   private int edtVLINEA_Enabled ;
   private int edtVBARCADAX_Enabled ;
   private int edtVGABIA_Enabled ;
   private int edtVFINDISPO_Enabled ;
   private int edtVCONTADO_Enabled ;
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
   private int edtVCONTADO_Backcolor ;
   private int edtVFINDISPO_Backcolor ;
   private int edtVGABIA_Backcolor ;
   private int edtVBARCADAX_Backcolor ;
   private int edtVLINEA_Backcolor ;
   private int edtVCALIDAD_Backcolor ;
   private int edtVOBSER_Backcolor ;
   private int edtVPEDIDO_Backcolor ;
   private int edtVCLIENTE_Backcolor ;
   private int edtVDESTINO_Backcolor ;
   private int edtVA_REPAS_Backcolor ;
   private int edtVNTARA4_Backcolor ;
   private int edtVNTARA3_Backcolor ;
   private int edtVNTARA2_Backcolor ;
   private int edtVNTARA1_Backcolor ;
   private int edtVUSUARI_Backcolor ;
   private int edtVSERIEVIN_Backcolor ;
   private int edtVTARA4_Backcolor ;
   private int edtVTARA3_Backcolor ;
   private int edtVTARA2_Backcolor ;
   private int edtVTARA1_Backcolor ;
   private int edtVALBARA_Backcolor ;
   private int edtVDATA_Backcolor ;
   private int edtVKILOS_Backcolor ;
   private int edtVABONO_Backcolor ;
   private int edtVMETROS_Backcolor ;
   private int edtVPIEZA_Backcolor ;
   private int edtVCOLOR_Backcolor ;
   private int edtVSERIE_Backcolor ;
   private int edtVERRDES_Backcolor ;
   private int edtVSTATUS_Backcolor ;
   private int edtVHORLEC_Backcolor ;
   private int edtVFECLEC_Backcolor ;
   private int edtVHORGRA_Backcolor ;
   private int edtVFECGRA_Backcolor ;
   private int edtVTIPOPER_Backcolor ;
   private int edtVID_Backcolor ;
   private int ZZ13262VSERIE ;
   private int ZZ13269VALBARA ;
   private int ZZ13282VCLIENTE ;
   private int ZZ13283VPEDIDO ;
   private long Z13254VID ;
   private long A13254VID ;
   private long ZZ13254VID ;
   private java.math.BigDecimal Z13265VMETROS ;
   private java.math.BigDecimal Z13266VABONO ;
   private java.math.BigDecimal Z13267VKILOS ;
   private java.math.BigDecimal A13265VMETROS ;
   private java.math.BigDecimal A13266VABONO ;
   private java.math.BigDecimal A13267VKILOS ;
   private java.math.BigDecimal ZZ13265VMETROS ;
   private java.math.BigDecimal ZZ13266VABONO ;
   private java.math.BigDecimal ZZ13267VKILOS ;
   private String sPrefix ;
   private String Z13255VTIPOPER ;
   private String Z13257VHORGRA ;
   private String Z13259VHORLEC ;
   private String Z13260VSTATUS ;
   private String Z13261VERRDES ;
   private String Z13264VPIEZA ;
   private String Z13274VSERIEVIN ;
   private String Z13275VUSUARI ;
   private String Z13280VA_REPAS ;
   private String Z13287VBARCADAX ;
   private String Z13288VGABIA ;
   private String Z13290VCONTADO ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVID_Internalname ;
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
   private String edtVID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVTIPOPER_Internalname ;
   private String A13255VTIPOPER ;
   private String edtVTIPOPER_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVFECGRA_Internalname ;
   private String edtVFECGRA_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVHORGRA_Internalname ;
   private String A13257VHORGRA ;
   private String edtVHORGRA_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVFECLEC_Internalname ;
   private String edtVFECLEC_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVHORLEC_Internalname ;
   private String A13259VHORLEC ;
   private String edtVHORLEC_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVSTATUS_Internalname ;
   private String A13260VSTATUS ;
   private String edtVSTATUS_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVERRDES_Internalname ;
   private String A13261VERRDES ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVSERIE_Internalname ;
   private String edtVSERIE_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtVCOLOR_Internalname ;
   private String edtVCOLOR_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtVPIEZA_Internalname ;
   private String A13264VPIEZA ;
   private String edtVPIEZA_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtVMETROS_Internalname ;
   private String edtVMETROS_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtVABONO_Internalname ;
   private String edtVABONO_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtVKILOS_Internalname ;
   private String edtVKILOS_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtVDATA_Internalname ;
   private String edtVDATA_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtVALBARA_Internalname ;
   private String edtVALBARA_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtVTARA1_Internalname ;
   private String edtVTARA1_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtVTARA2_Internalname ;
   private String edtVTARA2_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtVTARA3_Internalname ;
   private String edtVTARA3_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtVTARA4_Internalname ;
   private String edtVTARA4_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtVSERIEVIN_Internalname ;
   private String A13274VSERIEVIN ;
   private String edtVSERIEVIN_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtVUSUARI_Internalname ;
   private String A13275VUSUARI ;
   private String edtVUSUARI_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtVNTARA1_Internalname ;
   private String edtVNTARA1_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtVNTARA2_Internalname ;
   private String edtVNTARA2_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtVNTARA3_Internalname ;
   private String edtVNTARA3_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtVNTARA4_Internalname ;
   private String edtVNTARA4_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtVA_REPAS_Internalname ;
   private String A13280VA_REPAS ;
   private String edtVA_REPAS_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtVDESTINO_Internalname ;
   private String edtVDESTINO_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtVCLIENTE_Internalname ;
   private String edtVCLIENTE_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtVPEDIDO_Internalname ;
   private String edtVPEDIDO_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtVOBSER_Internalname ;
   private String edtVOBSER_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtVCALIDAD_Internalname ;
   private String edtVCALIDAD_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtVLINEA_Internalname ;
   private String edtVLINEA_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtVBARCADAX_Internalname ;
   private String A13287VBARCADAX ;
   private String edtVBARCADAX_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtVGABIA_Internalname ;
   private String A13288VGABIA ;
   private String edtVGABIA_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtVFINDISPO_Internalname ;
   private String edtVFINDISPO_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtVCONTADO_Internalname ;
   private String A13290VCONTADO ;
   private String edtVCONTADO_Jsonclick ;
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
   private String sMode1816 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ13255VTIPOPER ;
   private String ZZ13257VHORGRA ;
   private String ZZ13259VHORLEC ;
   private String ZZ13260VSTATUS ;
   private String ZZ13261VERRDES ;
   private String ZZ13264VPIEZA ;
   private String ZZ13274VSERIEVIN ;
   private String ZZ13275VUSUARI ;
   private String ZZ13280VA_REPAS ;
   private String ZZ13287VBARCADAX ;
   private String ZZ13288VGABIA ;
   private String ZZ13290VCONTADO ;
   private java.util.Date Z13256VFECGRA ;
   private java.util.Date Z13258VFECLEC ;
   private java.util.Date Z13268VDATA ;
   private java.util.Date A13256VFECGRA ;
   private java.util.Date A13258VFECLEC ;
   private java.util.Date A13268VDATA ;
   private java.util.Date ZZ13256VFECGRA ;
   private java.util.Date ZZ13258VFECLEC ;
   private java.util.Date ZZ13268VDATA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n13255VTIPOPER ;
   private boolean n13256VFECGRA ;
   private boolean n13257VHORGRA ;
   private boolean n13258VFECLEC ;
   private boolean n13259VHORLEC ;
   private boolean n13260VSTATUS ;
   private boolean n13261VERRDES ;
   private boolean n13262VSERIE ;
   private boolean n13263VCOLOR ;
   private boolean n13264VPIEZA ;
   private boolean n13265VMETROS ;
   private boolean n13266VABONO ;
   private boolean n13267VKILOS ;
   private boolean n13268VDATA ;
   private boolean n13269VALBARA ;
   private boolean n13270VTARA1 ;
   private boolean n13271VTARA2 ;
   private boolean n13272VTARA3 ;
   private boolean n13273VTARA4 ;
   private boolean n13274VSERIEVIN ;
   private boolean n13275VUSUARI ;
   private boolean n13276VNTARA1 ;
   private boolean n13277VNTARA2 ;
   private boolean n13278VNTARA3 ;
   private boolean n13279VNTARA4 ;
   private boolean n13280VA_REPAS ;
   private boolean n13281VDESTINO ;
   private boolean n13282VCLIENTE ;
   private boolean n13283VPEDIDO ;
   private boolean n13284VOBSER ;
   private boolean n13285VCALIDAD ;
   private boolean n13286VLINEA ;
   private boolean n13287VBARCADAX ;
   private boolean n13288VGABIA ;
   private boolean n13289VFINDISPO ;
   private boolean n13290VCONTADO ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13284VOBSER ;
   private String Z13284VOBSER ;
   private String ZZ13284VOBSER ;
   private IDataStoreProvider pr_default ;
   private String[] T01NN4_A13284VOBSER ;
   private boolean[] T01NN4_n13284VOBSER ;
   private long[] T01NN4_A13254VID ;
   private String[] T01NN4_A13255VTIPOPER ;
   private boolean[] T01NN4_n13255VTIPOPER ;
   private java.util.Date[] T01NN4_A13256VFECGRA ;
   private boolean[] T01NN4_n13256VFECGRA ;
   private String[] T01NN4_A13257VHORGRA ;
   private boolean[] T01NN4_n13257VHORGRA ;
   private java.util.Date[] T01NN4_A13258VFECLEC ;
   private boolean[] T01NN4_n13258VFECLEC ;
   private String[] T01NN4_A13259VHORLEC ;
   private boolean[] T01NN4_n13259VHORLEC ;
   private String[] T01NN4_A13260VSTATUS ;
   private boolean[] T01NN4_n13260VSTATUS ;
   private String[] T01NN4_A13261VERRDES ;
   private boolean[] T01NN4_n13261VERRDES ;
   private int[] T01NN4_A13262VSERIE ;
   private boolean[] T01NN4_n13262VSERIE ;
   private short[] T01NN4_A13263VCOLOR ;
   private boolean[] T01NN4_n13263VCOLOR ;
   private String[] T01NN4_A13264VPIEZA ;
   private boolean[] T01NN4_n13264VPIEZA ;
   private java.math.BigDecimal[] T01NN4_A13265VMETROS ;
   private boolean[] T01NN4_n13265VMETROS ;
   private java.math.BigDecimal[] T01NN4_A13266VABONO ;
   private boolean[] T01NN4_n13266VABONO ;
   private java.math.BigDecimal[] T01NN4_A13267VKILOS ;
   private boolean[] T01NN4_n13267VKILOS ;
   private java.util.Date[] T01NN4_A13268VDATA ;
   private boolean[] T01NN4_n13268VDATA ;
   private int[] T01NN4_A13269VALBARA ;
   private boolean[] T01NN4_n13269VALBARA ;
   private short[] T01NN4_A13270VTARA1 ;
   private boolean[] T01NN4_n13270VTARA1 ;
   private short[] T01NN4_A13271VTARA2 ;
   private boolean[] T01NN4_n13271VTARA2 ;
   private short[] T01NN4_A13272VTARA3 ;
   private boolean[] T01NN4_n13272VTARA3 ;
   private short[] T01NN4_A13273VTARA4 ;
   private boolean[] T01NN4_n13273VTARA4 ;
   private String[] T01NN4_A13274VSERIEVIN ;
   private boolean[] T01NN4_n13274VSERIEVIN ;
   private String[] T01NN4_A13275VUSUARI ;
   private boolean[] T01NN4_n13275VUSUARI ;
   private byte[] T01NN4_A13276VNTARA1 ;
   private boolean[] T01NN4_n13276VNTARA1 ;
   private byte[] T01NN4_A13277VNTARA2 ;
   private boolean[] T01NN4_n13277VNTARA2 ;
   private byte[] T01NN4_A13278VNTARA3 ;
   private boolean[] T01NN4_n13278VNTARA3 ;
   private byte[] T01NN4_A13279VNTARA4 ;
   private boolean[] T01NN4_n13279VNTARA4 ;
   private String[] T01NN4_A13280VA_REPAS ;
   private boolean[] T01NN4_n13280VA_REPAS ;
   private byte[] T01NN4_A13281VDESTINO ;
   private boolean[] T01NN4_n13281VDESTINO ;
   private int[] T01NN4_A13282VCLIENTE ;
   private boolean[] T01NN4_n13282VCLIENTE ;
   private int[] T01NN4_A13283VPEDIDO ;
   private boolean[] T01NN4_n13283VPEDIDO ;
   private short[] T01NN4_A13285VCALIDAD ;
   private boolean[] T01NN4_n13285VCALIDAD ;
   private short[] T01NN4_A13286VLINEA ;
   private boolean[] T01NN4_n13286VLINEA ;
   private String[] T01NN4_A13287VBARCADAX ;
   private boolean[] T01NN4_n13287VBARCADAX ;
   private String[] T01NN4_A13288VGABIA ;
   private boolean[] T01NN4_n13288VGABIA ;
   private byte[] T01NN4_A13289VFINDISPO ;
   private boolean[] T01NN4_n13289VFINDISPO ;
   private String[] T01NN4_A13290VCONTADO ;
   private boolean[] T01NN4_n13290VCONTADO ;
   private long[] T01NN5_A13254VID ;
   private String[] T01NN3_A13284VOBSER ;
   private boolean[] T01NN3_n13284VOBSER ;
   private long[] T01NN3_A13254VID ;
   private String[] T01NN3_A13255VTIPOPER ;
   private boolean[] T01NN3_n13255VTIPOPER ;
   private java.util.Date[] T01NN3_A13256VFECGRA ;
   private boolean[] T01NN3_n13256VFECGRA ;
   private String[] T01NN3_A13257VHORGRA ;
   private boolean[] T01NN3_n13257VHORGRA ;
   private java.util.Date[] T01NN3_A13258VFECLEC ;
   private boolean[] T01NN3_n13258VFECLEC ;
   private String[] T01NN3_A13259VHORLEC ;
   private boolean[] T01NN3_n13259VHORLEC ;
   private String[] T01NN3_A13260VSTATUS ;
   private boolean[] T01NN3_n13260VSTATUS ;
   private String[] T01NN3_A13261VERRDES ;
   private boolean[] T01NN3_n13261VERRDES ;
   private int[] T01NN3_A13262VSERIE ;
   private boolean[] T01NN3_n13262VSERIE ;
   private short[] T01NN3_A13263VCOLOR ;
   private boolean[] T01NN3_n13263VCOLOR ;
   private String[] T01NN3_A13264VPIEZA ;
   private boolean[] T01NN3_n13264VPIEZA ;
   private java.math.BigDecimal[] T01NN3_A13265VMETROS ;
   private boolean[] T01NN3_n13265VMETROS ;
   private java.math.BigDecimal[] T01NN3_A13266VABONO ;
   private boolean[] T01NN3_n13266VABONO ;
   private java.math.BigDecimal[] T01NN3_A13267VKILOS ;
   private boolean[] T01NN3_n13267VKILOS ;
   private java.util.Date[] T01NN3_A13268VDATA ;
   private boolean[] T01NN3_n13268VDATA ;
   private int[] T01NN3_A13269VALBARA ;
   private boolean[] T01NN3_n13269VALBARA ;
   private short[] T01NN3_A13270VTARA1 ;
   private boolean[] T01NN3_n13270VTARA1 ;
   private short[] T01NN3_A13271VTARA2 ;
   private boolean[] T01NN3_n13271VTARA2 ;
   private short[] T01NN3_A13272VTARA3 ;
   private boolean[] T01NN3_n13272VTARA3 ;
   private short[] T01NN3_A13273VTARA4 ;
   private boolean[] T01NN3_n13273VTARA4 ;
   private String[] T01NN3_A13274VSERIEVIN ;
   private boolean[] T01NN3_n13274VSERIEVIN ;
   private String[] T01NN3_A13275VUSUARI ;
   private boolean[] T01NN3_n13275VUSUARI ;
   private byte[] T01NN3_A13276VNTARA1 ;
   private boolean[] T01NN3_n13276VNTARA1 ;
   private byte[] T01NN3_A13277VNTARA2 ;
   private boolean[] T01NN3_n13277VNTARA2 ;
   private byte[] T01NN3_A13278VNTARA3 ;
   private boolean[] T01NN3_n13278VNTARA3 ;
   private byte[] T01NN3_A13279VNTARA4 ;
   private boolean[] T01NN3_n13279VNTARA4 ;
   private String[] T01NN3_A13280VA_REPAS ;
   private boolean[] T01NN3_n13280VA_REPAS ;
   private byte[] T01NN3_A13281VDESTINO ;
   private boolean[] T01NN3_n13281VDESTINO ;
   private int[] T01NN3_A13282VCLIENTE ;
   private boolean[] T01NN3_n13282VCLIENTE ;
   private int[] T01NN3_A13283VPEDIDO ;
   private boolean[] T01NN3_n13283VPEDIDO ;
   private short[] T01NN3_A13285VCALIDAD ;
   private boolean[] T01NN3_n13285VCALIDAD ;
   private short[] T01NN3_A13286VLINEA ;
   private boolean[] T01NN3_n13286VLINEA ;
   private String[] T01NN3_A13287VBARCADAX ;
   private boolean[] T01NN3_n13287VBARCADAX ;
   private String[] T01NN3_A13288VGABIA ;
   private boolean[] T01NN3_n13288VGABIA ;
   private byte[] T01NN3_A13289VFINDISPO ;
   private boolean[] T01NN3_n13289VFINDISPO ;
   private String[] T01NN3_A13290VCONTADO ;
   private boolean[] T01NN3_n13290VCONTADO ;
   private long[] T01NN6_A13254VID ;
   private long[] T01NN7_A13254VID ;
   private String[] T01NN2_A13284VOBSER ;
   private boolean[] T01NN2_n13284VOBSER ;
   private long[] T01NN2_A13254VID ;
   private String[] T01NN2_A13255VTIPOPER ;
   private boolean[] T01NN2_n13255VTIPOPER ;
   private java.util.Date[] T01NN2_A13256VFECGRA ;
   private boolean[] T01NN2_n13256VFECGRA ;
   private String[] T01NN2_A13257VHORGRA ;
   private boolean[] T01NN2_n13257VHORGRA ;
   private java.util.Date[] T01NN2_A13258VFECLEC ;
   private boolean[] T01NN2_n13258VFECLEC ;
   private String[] T01NN2_A13259VHORLEC ;
   private boolean[] T01NN2_n13259VHORLEC ;
   private String[] T01NN2_A13260VSTATUS ;
   private boolean[] T01NN2_n13260VSTATUS ;
   private String[] T01NN2_A13261VERRDES ;
   private boolean[] T01NN2_n13261VERRDES ;
   private int[] T01NN2_A13262VSERIE ;
   private boolean[] T01NN2_n13262VSERIE ;
   private short[] T01NN2_A13263VCOLOR ;
   private boolean[] T01NN2_n13263VCOLOR ;
   private String[] T01NN2_A13264VPIEZA ;
   private boolean[] T01NN2_n13264VPIEZA ;
   private java.math.BigDecimal[] T01NN2_A13265VMETROS ;
   private boolean[] T01NN2_n13265VMETROS ;
   private java.math.BigDecimal[] T01NN2_A13266VABONO ;
   private boolean[] T01NN2_n13266VABONO ;
   private java.math.BigDecimal[] T01NN2_A13267VKILOS ;
   private boolean[] T01NN2_n13267VKILOS ;
   private java.util.Date[] T01NN2_A13268VDATA ;
   private boolean[] T01NN2_n13268VDATA ;
   private int[] T01NN2_A13269VALBARA ;
   private boolean[] T01NN2_n13269VALBARA ;
   private short[] T01NN2_A13270VTARA1 ;
   private boolean[] T01NN2_n13270VTARA1 ;
   private short[] T01NN2_A13271VTARA2 ;
   private boolean[] T01NN2_n13271VTARA2 ;
   private short[] T01NN2_A13272VTARA3 ;
   private boolean[] T01NN2_n13272VTARA3 ;
   private short[] T01NN2_A13273VTARA4 ;
   private boolean[] T01NN2_n13273VTARA4 ;
   private String[] T01NN2_A13274VSERIEVIN ;
   private boolean[] T01NN2_n13274VSERIEVIN ;
   private String[] T01NN2_A13275VUSUARI ;
   private boolean[] T01NN2_n13275VUSUARI ;
   private byte[] T01NN2_A13276VNTARA1 ;
   private boolean[] T01NN2_n13276VNTARA1 ;
   private byte[] T01NN2_A13277VNTARA2 ;
   private boolean[] T01NN2_n13277VNTARA2 ;
   private byte[] T01NN2_A13278VNTARA3 ;
   private boolean[] T01NN2_n13278VNTARA3 ;
   private byte[] T01NN2_A13279VNTARA4 ;
   private boolean[] T01NN2_n13279VNTARA4 ;
   private String[] T01NN2_A13280VA_REPAS ;
   private boolean[] T01NN2_n13280VA_REPAS ;
   private byte[] T01NN2_A13281VDESTINO ;
   private boolean[] T01NN2_n13281VDESTINO ;
   private int[] T01NN2_A13282VCLIENTE ;
   private boolean[] T01NN2_n13282VCLIENTE ;
   private int[] T01NN2_A13283VPEDIDO ;
   private boolean[] T01NN2_n13283VPEDIDO ;
   private short[] T01NN2_A13285VCALIDAD ;
   private boolean[] T01NN2_n13285VCALIDAD ;
   private short[] T01NN2_A13286VLINEA ;
   private boolean[] T01NN2_n13286VLINEA ;
   private String[] T01NN2_A13287VBARCADAX ;
   private boolean[] T01NN2_n13287VBARCADAX ;
   private String[] T01NN2_A13288VGABIA ;
   private boolean[] T01NN2_n13288VGABIA ;
   private byte[] T01NN2_A13289VFINDISPO ;
   private boolean[] T01NN2_n13289VFINDISPO ;
   private String[] T01NN2_A13290VCONTADO ;
   private boolean[] T01NN2_n13290VCONTADO ;
   private long[] T01NN11_A13254VID ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tincasrea__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincasrea__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincasrea__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincasrea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NN2", "SELECT OBSER, ID, TIPOPER, FECGRA, HORGRA, FECLEC, HORLEC, STATUS, ERRDES, SERIE, COLOR, PIEZA, METROS, ABONO, KILOS, DATA, ALBARA, TARA1, TARA2, TARA3, TARA4, SERIEVIN, USUARI, NTARA1, NTARA2, NTARA3, NTARA4, A_REPAS, DESTINO, CLIENTE, PEDIDO, CALIDAD, LINEA, BARCADAX, GABIA, FINDISPO, CONTADO FROM TXPINCASREA WHERE ID = ?  FOR UPDATE OF TIPOPER, FECGRA, HORGRA, FECLEC, HORLEC, STATUS, ERRDES, SERIE, COLOR, PIEZA, METROS, ABONO, KILOS, DATA, ALBARA, TARA1, TARA2, TARA3, TARA4, SERIEVIN, USUARI, NTARA1, NTARA2, NTARA3, NTARA4, A_REPAS, DESTINO, CLIENTE, PEDIDO, OBSER, CALIDAD, LINEA, BARCADAX, GABIA, FINDISPO, CONTADO NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NN3", "SELECT OBSER, ID, TIPOPER, FECGRA, HORGRA, FECLEC, HORLEC, STATUS, ERRDES, SERIE, COLOR, PIEZA, METROS, ABONO, KILOS, DATA, ALBARA, TARA1, TARA2, TARA3, TARA4, SERIEVIN, USUARI, NTARA1, NTARA2, NTARA3, NTARA4, A_REPAS, DESTINO, CLIENTE, PEDIDO, CALIDAD, LINEA, BARCADAX, GABIA, FINDISPO, CONTADO FROM TXPINCASREA WHERE ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NN4", "SELECT /*+ FIRST_ROWS(100) */ TM1.OBSER, TM1.ID, TM1.TIPOPER, TM1.FECGRA, TM1.HORGRA, TM1.FECLEC, TM1.HORLEC, TM1.STATUS, TM1.ERRDES, TM1.SERIE, TM1.COLOR, TM1.PIEZA, TM1.METROS, TM1.ABONO, TM1.KILOS, TM1.DATA, TM1.ALBARA, TM1.TARA1, TM1.TARA2, TM1.TARA3, TM1.TARA4, TM1.SERIEVIN, TM1.USUARI, TM1.NTARA1, TM1.NTARA2, TM1.NTARA3, TM1.NTARA4, TM1.A_REPAS, TM1.DESTINO, TM1.CLIENTE, TM1.PEDIDO, TM1.CALIDAD, TM1.LINEA, TM1.BARCADAX, TM1.GABIA, TM1.FINDISPO, TM1.CONTADO FROM TXPINCASREA TM1 WHERE TM1.ID = ? ORDER BY TM1.ID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NN5", "SELECT /*+ FIRST_ROWS(1) */ ID FROM TXPINCASREA WHERE ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NN6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ID FROM TXPINCASREA WHERE ( ID > ?) ORDER BY ID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NN7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ID FROM TXPINCASREA WHERE ( ID < ?) ORDER BY ID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NN8", "INSERT INTO TXPINCASREA(ID, TIPOPER, FECGRA, HORGRA, FECLEC, HORLEC, STATUS, ERRDES, SERIE, COLOR, PIEZA, METROS, ABONO, KILOS, DATA, ALBARA, TARA1, TARA2, TARA3, TARA4, SERIEVIN, USUARI, NTARA1, NTARA2, NTARA3, NTARA4, A_REPAS, DESTINO, CLIENTE, PEDIDO, OBSER, CALIDAD, LINEA, BARCADAX, GABIA, FINDISPO, CONTADO) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINCASREA")
         ,new UpdateCursor("T01NN9", "UPDATE TXPINCASREA SET TIPOPER=?, FECGRA=?, HORGRA=?, FECLEC=?, HORLEC=?, STATUS=?, ERRDES=?, SERIE=?, COLOR=?, PIEZA=?, METROS=?, ABONO=?, KILOS=?, DATA=?, ALBARA=?, TARA1=?, TARA2=?, TARA3=?, TARA4=?, SERIEVIN=?, USUARI=?, NTARA1=?, NTARA2=?, NTARA3=?, NTARA4=?, A_REPAS=?, DESTINO=?, CLIENTE=?, PEDIDO=?, OBSER=?, CALIDAD=?, LINEA=?, BARCADAX=?, GABIA=?, FINDISPO=?, CONTADO=?  WHERE ID = ?", GX_NOMASK, "TXPINCASREA")
         ,new UpdateCursor("T01NN10", "DELETE FROM TXPINCASREA  WHERE ID = ?", GX_NOMASK, "TXPINCASREA")
         ,new ForEachCursor("T01NN11", "SELECT /*+ FIRST_ROWS(100) */ ID FROM TXPINCASREA ORDER BY ID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 250);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((int[]) buf[59])[0] = rslt.getInt(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 15);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((byte[]) buf[69])[0] = rslt.getByte(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 250);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((int[]) buf[59])[0] = rslt.getInt(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 15);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((byte[]) buf[69])[0] = rslt.getByte(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 250);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((int[]) buf[59])[0] = rslt.getInt(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 15);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((byte[]) buf[69])[0] = rslt.getByte(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 250);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 12);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[28]);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 10);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[44]).byteValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[54]).byteValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[58]).intValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(31, (String)parms[60]);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[66], 15);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 6);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[70]).byteValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 250);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 12);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 20);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 10);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[43]).byteValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[49]).byteValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[55]).intValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[57]).intValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(30, (String)parms[59]);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 15);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 6);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[69]).byteValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 1);
               }
               stmt.setLong(37, ((Number) parms[72]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

