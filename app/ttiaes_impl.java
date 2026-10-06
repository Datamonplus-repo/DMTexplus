package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttiaes_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TBV_PRODUCCION_TIAES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtID_TIAES_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttiaes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttiaes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttiaes_impl.class ));
   }

   public ttiaes_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTIAES.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "ID", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtID_TIAES_Internalname, A12574ID_TIAES, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", (short)(0), 1, edtID_TIAES_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "360", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ID_ EMPRESA", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMPRESA_Internalname, GXutil.rtrim( A12540ID_EMPRESA), GXutil.rtrim( localUtil.format( A12540ID_EMPRESA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMPRESA_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMPRESA_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "FECHA", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFECHA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFECHA_Internalname, localUtil.format(A12541FECHA, "99/99/99"), localUtil.format( A12541FECHA, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFECHA_Jsonclick, 0, "", "", "", "", "", 1, edtFECHA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFECHA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFECHA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTIAES.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "ID_ CLIENTE", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_CLIENTE_Internalname, GXutil.ltrim( localUtil.ntoc( A12542ID_CLIENTE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtID_CLIENTE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12542ID_CLIENTE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12542ID_CLIENTE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_CLIENTE_Jsonclick, 0, "", "", "", "", "", 1, edtID_CLIENTE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "ID_ EMP_ CLI", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_CLI_Internalname, A12543ID_EMP_CLI, GXutil.rtrim( localUtil.format( A12543ID_EMP_CLI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_CLI_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_CLI_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "ID_ EMP_ ZONA", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_ZON_Internalname, A12544ID_EMP_ZON, GXutil.rtrim( localUtil.format( A12544ID_EMP_ZON, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_ZON_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_ZON_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "ID_ MAQUINA", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_MAQUINA_Internalname, A12545ID_MAQUINA, GXutil.rtrim( localUtil.format( A12545ID_MAQUINA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_MAQUINA_Jsonclick, 0, "", "", "", "", "", 1, edtID_MAQUINA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "ID_ EMP_ MAQ", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_MAQ_Internalname, A12546ID_EMP_MAQ, GXutil.rtrim( localUtil.format( A12546ID_EMP_MAQ, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_MAQ_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_MAQ_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "ID_ EMP_ HDR", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_HDR_Internalname, A12547ID_EMP_HDR, GXutil.rtrim( localUtil.format( A12547ID_EMP_HDR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_HDR_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_HDR_Enabled, 0, "text", "", 80, "chr", 1, "row", 84, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "HOJA_ DE_ RUTA", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHOJA_DE_RU_Internalname, A12548HOJA_DE_RU, GXutil.rtrim( localUtil.format( A12548HOJA_DE_RU, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHOJA_DE_RU_Jsonclick, 0, "", "", "", "", "", 1, edtHOJA_DE_RU_Enabled, 0, "text", "", 80, "chr", 1, "row", 81, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "TIPO", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTIPO_Internalname, GXutil.ltrim( localUtil.ntoc( A12549TIPO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTIPO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12549TIPO), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12549TIPO), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIPO_Jsonclick, 0, "", "", "", "", "", 1, edtTIPO_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "ID_ PROCESO", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_PROCESO_Internalname, A12550ID_PROCESO, GXutil.rtrim( localUtil.format( A12550ID_PROCESO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_PROCESO_Jsonclick, 0, "", "", "", "", "", 1, edtID_PROCESO_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "ID_ EMP_ PRO", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_PRO_Internalname, A12551ID_EMP_PRO, GXutil.rtrim( localUtil.format( A12551ID_EMP_PRO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_PRO_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_PRO_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "ID_ SECCION", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_SECCION_Internalname, A12552ID_SECCION, GXutil.rtrim( localUtil.format( A12552ID_SECCION, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_SECCION_Jsonclick, 0, "", "", "", "", "", 1, edtID_SECCION_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "ID_ EMP_ SEC", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_SEC_Internalname, A12553ID_EMP_SEC, GXutil.rtrim( localUtil.format( A12553ID_EMP_SEC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_SEC_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_SEC_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "ID_ ANO_ MES_ SECCION", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_ANO_MES_Internalname, A12554ID_ANO_MES, GXutil.rtrim( localUtil.format( A12554ID_ANO_MES, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_ANO_MES_Jsonclick, 0, "", "", "", "", "", 1, edtID_ANO_MES_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "ID_ EMP_ ANO_ MES_ SECCION", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_ANO_Internalname, A12555ID_EMP_ANO, GXutil.rtrim( localUtil.format( A12555ID_EMP_ANO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_ANO_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_ANO_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "ID_ PARO", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_PARO_Internalname, GXutil.ltrim( localUtil.ntoc( A12556ID_PARO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtID_PARO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12556ID_PARO), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12556ID_PARO), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_PARO_Jsonclick, 0, "", "", "", "", "", 1, edtID_PARO_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "ID_ EMP_ PAR", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_PAR_Internalname, A12557ID_EMP_PAR, GXutil.rtrim( localUtil.format( A12557ID_EMP_PAR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_PAR_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_PAR_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "ID_ COLORANTE", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_COLORAN_Internalname, GXutil.ltrim( localUtil.ntoc( A12558ID_COLORAN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtID_COLORAN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12558ID_COLORAN), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12558ID_COLORAN), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_COLORAN_Jsonclick, 0, "", "", "", "", "", 1, edtID_COLORAN_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "ID_ EMP_ COL", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_COL_Internalname, A12559ID_EMP_COL, GXutil.rtrim( localUtil.format( A12559ID_EMP_COL, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_COL_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_COL_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "ID_ INTENSIDAD", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_INTENSI_Internalname, GXutil.ltrim( localUtil.ntoc( A12560ID_INTENSI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtID_INTENSI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12560ID_INTENSI), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12560ID_INTENSI), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_INTENSI_Jsonclick, 0, "", "", "", "", "", 1, edtID_INTENSI_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "ID_ EMP_ INT", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_INT_Internalname, A12561ID_EMP_INT, GXutil.rtrim( localUtil.format( A12561ID_EMP_INT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_INT_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_INT_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "TIPO_ PRODUCCION", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTIPO_PRODU_Internalname, A12562TIPO_PRODU, GXutil.rtrim( localUtil.format( A12562TIPO_PRODU, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIPO_PRODU_Jsonclick, 0, "", "", "", "", "", 1, edtTIPO_PRODU_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "ID_ DEFECTO", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_DEFECTO_Internalname, GXutil.ltrim( localUtil.ntoc( A12563ID_DEFECTO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtID_DEFECTO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12563ID_DEFECTO), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12563ID_DEFECTO), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_DEFECTO_Jsonclick, 0, "", "", "", "", "", 1, edtID_DEFECTO_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "ID_ EMP_ DEF", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_DEF_Internalname, A12564ID_EMP_DEF, GXutil.rtrim( localUtil.format( A12564ID_EMP_DEF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_DEF_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_DEF_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "ID_ RESPONSABLE", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_RESPONS_Internalname, GXutil.ltrim( localUtil.ntoc( A12565ID_RESPONS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtID_RESPONS_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12565ID_RESPONS), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12565ID_RESPONS), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_RESPONS_Jsonclick, 0, "", "", "", "", "", 1, edtID_RESPONS_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "ID_ EMP_ RES", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_RES_Internalname, A12566ID_EMP_RES, GXutil.rtrim( localUtil.format( A12566ID_EMP_RES, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_RES_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_RES_Enabled, 0, "text", "", 43, "chr", 1, "row", 43, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "FACTURADO", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFACTURADO_Internalname, GXutil.rtrim( A12567FACTURADO), GXutil.rtrim( localUtil.format( A12567FACTURADO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFACTURADO_Jsonclick, 0, "", "", "", "", "", 1, edtFACTURADO_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "ID_ PASTA", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_PASTA_Internalname, A12568ID_PASTA, GXutil.rtrim( localUtil.format( A12568ID_PASTA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_PASTA_Jsonclick, 0, "", "", "", "", "", 1, edtID_PASTA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "ID_ EMP_ PAS", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_EMP_PAS_Internalname, GXutil.rtrim( A12569ID_EMP_PAS), GXutil.rtrim( localUtil.format( A12569ID_EMP_PAS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_EMP_PAS_Jsonclick, 0, "", "", "", "", "", 1, edtID_EMP_PAS_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "UNIDADES", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUNIDADES_Internalname, GXutil.ltrim( localUtil.ntoc( A12570UNIDADES, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUNIDADES_Enabled!=0) ? localUtil.format( A12570UNIDADES, "ZZZZZ9.99") : localUtil.format( A12570UNIDADES, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUNIDADES_Jsonclick, 0, "", "", "", "", "", 1, edtUNIDADES_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "TIPO_ UNIDADES", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTIPO_UNIDA_Internalname, GXutil.rtrim( A12571TIPO_UNIDA), GXutil.rtrim( localUtil.format( A12571TIPO_UNIDA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTIPO_UNIDA_Jsonclick, 0, "", "", "", "", "", 1, edtTIPO_UNIDA_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "METROS", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMETROS_P_Internalname, GXutil.ltrim( localUtil.ntoc( A12572METROS_P, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMETROS_P_Enabled!=0) ? localUtil.format( A12572METROS_P, "ZZZZZ9.99") : localUtil.format( A12572METROS_P, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMETROS_P_Jsonclick, 0, "", "", "", "", "", 1, edtMETROS_P_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "KILOS", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKILOS_P_Internalname, GXutil.ltrim( localUtil.ntoc( A12573KILOS_P, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKILOS_P_Enabled!=0) ? localUtil.format( A12573KILOS_P, "ZZZZZ9.99") : localUtil.format( A12573KILOS_P, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKILOS_P_Jsonclick, 0, "", "", "", "", "", 1, edtKILOS_P_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIAES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIAES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTIAES.htm");
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
         Z12574ID_TIAES = httpContext.cgiGet( "Z12574ID_TIAES") ;
         Z12540ID_EMPRESA = httpContext.cgiGet( "Z12540ID_EMPRESA") ;
         Z12541FECHA = localUtil.ctod( httpContext.cgiGet( "Z12541FECHA"), 0) ;
         Z12542ID_CLIENTE = (int)(localUtil.ctol( httpContext.cgiGet( "Z12542ID_CLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12543ID_EMP_CLI = httpContext.cgiGet( "Z12543ID_EMP_CLI") ;
         Z12544ID_EMP_ZON = httpContext.cgiGet( "Z12544ID_EMP_ZON") ;
         Z12545ID_MAQUINA = httpContext.cgiGet( "Z12545ID_MAQUINA") ;
         Z12546ID_EMP_MAQ = httpContext.cgiGet( "Z12546ID_EMP_MAQ") ;
         Z12547ID_EMP_HDR = httpContext.cgiGet( "Z12547ID_EMP_HDR") ;
         Z12548HOJA_DE_RU = httpContext.cgiGet( "Z12548HOJA_DE_RU") ;
         Z12549TIPO = (short)(localUtil.ctol( httpContext.cgiGet( "Z12549TIPO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12550ID_PROCESO = httpContext.cgiGet( "Z12550ID_PROCESO") ;
         Z12551ID_EMP_PRO = httpContext.cgiGet( "Z12551ID_EMP_PRO") ;
         Z12552ID_SECCION = httpContext.cgiGet( "Z12552ID_SECCION") ;
         Z12553ID_EMP_SEC = httpContext.cgiGet( "Z12553ID_EMP_SEC") ;
         Z12554ID_ANO_MES = httpContext.cgiGet( "Z12554ID_ANO_MES") ;
         Z12555ID_EMP_ANO = httpContext.cgiGet( "Z12555ID_EMP_ANO") ;
         Z12556ID_PARO = (short)(localUtil.ctol( httpContext.cgiGet( "Z12556ID_PARO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12557ID_EMP_PAR = httpContext.cgiGet( "Z12557ID_EMP_PAR") ;
         Z12558ID_COLORAN = (short)(localUtil.ctol( httpContext.cgiGet( "Z12558ID_COLORAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12559ID_EMP_COL = httpContext.cgiGet( "Z12559ID_EMP_COL") ;
         Z12560ID_INTENSI = (short)(localUtil.ctol( httpContext.cgiGet( "Z12560ID_INTENSI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12561ID_EMP_INT = httpContext.cgiGet( "Z12561ID_EMP_INT") ;
         Z12562TIPO_PRODU = httpContext.cgiGet( "Z12562TIPO_PRODU") ;
         Z12563ID_DEFECTO = (short)(localUtil.ctol( httpContext.cgiGet( "Z12563ID_DEFECTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12564ID_EMP_DEF = httpContext.cgiGet( "Z12564ID_EMP_DEF") ;
         Z12565ID_RESPONS = (short)(localUtil.ctol( httpContext.cgiGet( "Z12565ID_RESPONS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12566ID_EMP_RES = httpContext.cgiGet( "Z12566ID_EMP_RES") ;
         Z12567FACTURADO = httpContext.cgiGet( "Z12567FACTURADO") ;
         Z12568ID_PASTA = httpContext.cgiGet( "Z12568ID_PASTA") ;
         Z12569ID_EMP_PAS = httpContext.cgiGet( "Z12569ID_EMP_PAS") ;
         Z12570UNIDADES = localUtil.ctond( httpContext.cgiGet( "Z12570UNIDADES")) ;
         Z12571TIPO_UNIDA = httpContext.cgiGet( "Z12571TIPO_UNIDA") ;
         Z12572METROS_P = localUtil.ctond( httpContext.cgiGet( "Z12572METROS_P")) ;
         Z12573KILOS_P = localUtil.ctond( httpContext.cgiGet( "Z12573KILOS_P")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A12574ID_TIAES = httpContext.cgiGet( edtID_TIAES_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
         A12540ID_EMPRESA = httpContext.cgiGet( edtID_EMPRESA_Internalname) ;
         n12540ID_EMPRESA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12540ID_EMPRESA", A12540ID_EMPRESA);
         if ( localUtil.vcdate( httpContext.cgiGet( edtFECHA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FECHA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFECHA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12541FECHA = GXutil.nullDate() ;
            n12541FECHA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12541FECHA", localUtil.format(A12541FECHA, "99/99/99"));
         }
         else
         {
            A12541FECHA = localUtil.ctod( httpContext.cgiGet( edtFECHA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12541FECHA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12541FECHA", localUtil.format(A12541FECHA, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_CLIENTE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_CLIENTE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_CLIENTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_CLIENTE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12542ID_CLIENTE = 0 ;
            n12542ID_CLIENTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12542ID_CLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12542ID_CLIENTE), 6, 0));
         }
         else
         {
            A12542ID_CLIENTE = (int)(localUtil.ctol( httpContext.cgiGet( edtID_CLIENTE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12542ID_CLIENTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12542ID_CLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12542ID_CLIENTE), 6, 0));
         }
         A12543ID_EMP_CLI = httpContext.cgiGet( edtID_EMP_CLI_Internalname) ;
         n12543ID_EMP_CLI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12543ID_EMP_CLI", A12543ID_EMP_CLI);
         A12544ID_EMP_ZON = httpContext.cgiGet( edtID_EMP_ZON_Internalname) ;
         n12544ID_EMP_ZON = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12544ID_EMP_ZON", A12544ID_EMP_ZON);
         A12545ID_MAQUINA = httpContext.cgiGet( edtID_MAQUINA_Internalname) ;
         n12545ID_MAQUINA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12545ID_MAQUINA", A12545ID_MAQUINA);
         A12546ID_EMP_MAQ = httpContext.cgiGet( edtID_EMP_MAQ_Internalname) ;
         n12546ID_EMP_MAQ = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12546ID_EMP_MAQ", A12546ID_EMP_MAQ);
         A12547ID_EMP_HDR = httpContext.cgiGet( edtID_EMP_HDR_Internalname) ;
         n12547ID_EMP_HDR = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12547ID_EMP_HDR", A12547ID_EMP_HDR);
         A12548HOJA_DE_RU = httpContext.cgiGet( edtHOJA_DE_RU_Internalname) ;
         n12548HOJA_DE_RU = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12548HOJA_DE_RU", A12548HOJA_DE_RU);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTIPO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTIPO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTIPO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12549TIPO = (short)(0) ;
            n12549TIPO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12549TIPO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12549TIPO), 4, 0));
         }
         else
         {
            A12549TIPO = (short)(localUtil.ctol( httpContext.cgiGet( edtTIPO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12549TIPO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12549TIPO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12549TIPO), 4, 0));
         }
         A12550ID_PROCESO = httpContext.cgiGet( edtID_PROCESO_Internalname) ;
         n12550ID_PROCESO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12550ID_PROCESO", A12550ID_PROCESO);
         A12551ID_EMP_PRO = httpContext.cgiGet( edtID_EMP_PRO_Internalname) ;
         n12551ID_EMP_PRO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12551ID_EMP_PRO", A12551ID_EMP_PRO);
         A12552ID_SECCION = httpContext.cgiGet( edtID_SECCION_Internalname) ;
         n12552ID_SECCION = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12552ID_SECCION", A12552ID_SECCION);
         A12553ID_EMP_SEC = httpContext.cgiGet( edtID_EMP_SEC_Internalname) ;
         n12553ID_EMP_SEC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12553ID_EMP_SEC", A12553ID_EMP_SEC);
         A12554ID_ANO_MES = httpContext.cgiGet( edtID_ANO_MES_Internalname) ;
         n12554ID_ANO_MES = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12554ID_ANO_MES", A12554ID_ANO_MES);
         A12555ID_EMP_ANO = httpContext.cgiGet( edtID_EMP_ANO_Internalname) ;
         n12555ID_EMP_ANO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12555ID_EMP_ANO", A12555ID_EMP_ANO);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_PARO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_PARO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_PARO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_PARO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12556ID_PARO = (short)(0) ;
            n12556ID_PARO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12556ID_PARO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12556ID_PARO), 4, 0));
         }
         else
         {
            A12556ID_PARO = (short)(localUtil.ctol( httpContext.cgiGet( edtID_PARO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12556ID_PARO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12556ID_PARO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12556ID_PARO), 4, 0));
         }
         A12557ID_EMP_PAR = httpContext.cgiGet( edtID_EMP_PAR_Internalname) ;
         n12557ID_EMP_PAR = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12557ID_EMP_PAR", A12557ID_EMP_PAR);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_COLORAN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_COLORAN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_COLORAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_COLORAN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12558ID_COLORAN = (short)(0) ;
            n12558ID_COLORAN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12558ID_COLORAN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12558ID_COLORAN), 4, 0));
         }
         else
         {
            A12558ID_COLORAN = (short)(localUtil.ctol( httpContext.cgiGet( edtID_COLORAN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12558ID_COLORAN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12558ID_COLORAN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12558ID_COLORAN), 4, 0));
         }
         A12559ID_EMP_COL = httpContext.cgiGet( edtID_EMP_COL_Internalname) ;
         n12559ID_EMP_COL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12559ID_EMP_COL", A12559ID_EMP_COL);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_INTENSI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_INTENSI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_INTENSI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_INTENSI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12560ID_INTENSI = (short)(0) ;
            n12560ID_INTENSI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12560ID_INTENSI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12560ID_INTENSI), 4, 0));
         }
         else
         {
            A12560ID_INTENSI = (short)(localUtil.ctol( httpContext.cgiGet( edtID_INTENSI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12560ID_INTENSI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12560ID_INTENSI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12560ID_INTENSI), 4, 0));
         }
         A12561ID_EMP_INT = httpContext.cgiGet( edtID_EMP_INT_Internalname) ;
         n12561ID_EMP_INT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12561ID_EMP_INT", A12561ID_EMP_INT);
         A12562TIPO_PRODU = httpContext.cgiGet( edtTIPO_PRODU_Internalname) ;
         n12562TIPO_PRODU = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12562TIPO_PRODU", A12562TIPO_PRODU);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_DEFECTO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_DEFECTO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_DEFECTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_DEFECTO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12563ID_DEFECTO = (short)(0) ;
            n12563ID_DEFECTO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12563ID_DEFECTO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12563ID_DEFECTO), 4, 0));
         }
         else
         {
            A12563ID_DEFECTO = (short)(localUtil.ctol( httpContext.cgiGet( edtID_DEFECTO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12563ID_DEFECTO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12563ID_DEFECTO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12563ID_DEFECTO), 4, 0));
         }
         A12564ID_EMP_DEF = httpContext.cgiGet( edtID_EMP_DEF_Internalname) ;
         n12564ID_EMP_DEF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12564ID_EMP_DEF", A12564ID_EMP_DEF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtID_RESPONS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtID_RESPONS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ID_RESPONS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_RESPONS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12565ID_RESPONS = (short)(0) ;
            n12565ID_RESPONS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12565ID_RESPONS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12565ID_RESPONS), 4, 0));
         }
         else
         {
            A12565ID_RESPONS = (short)(localUtil.ctol( httpContext.cgiGet( edtID_RESPONS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12565ID_RESPONS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12565ID_RESPONS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12565ID_RESPONS), 4, 0));
         }
         A12566ID_EMP_RES = httpContext.cgiGet( edtID_EMP_RES_Internalname) ;
         n12566ID_EMP_RES = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12566ID_EMP_RES", A12566ID_EMP_RES);
         A12567FACTURADO = httpContext.cgiGet( edtFACTURADO_Internalname) ;
         n12567FACTURADO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12567FACTURADO", A12567FACTURADO);
         A12568ID_PASTA = httpContext.cgiGet( edtID_PASTA_Internalname) ;
         n12568ID_PASTA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12568ID_PASTA", A12568ID_PASTA);
         A12569ID_EMP_PAS = httpContext.cgiGet( edtID_EMP_PAS_Internalname) ;
         n12569ID_EMP_PAS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12569ID_EMP_PAS", A12569ID_EMP_PAS);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtUNIDADES_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtUNIDADES_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UNIDADES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUNIDADES_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12570UNIDADES = DecimalUtil.ZERO ;
            n12570UNIDADES = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12570UNIDADES", GXutil.ltrimstr( A12570UNIDADES, 9, 2));
         }
         else
         {
            A12570UNIDADES = localUtil.ctond( httpContext.cgiGet( edtUNIDADES_Internalname)) ;
            n12570UNIDADES = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12570UNIDADES", GXutil.ltrimstr( A12570UNIDADES, 9, 2));
         }
         A12571TIPO_UNIDA = httpContext.cgiGet( edtTIPO_UNIDA_Internalname) ;
         n12571TIPO_UNIDA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12571TIPO_UNIDA", A12571TIPO_UNIDA);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMETROS_P_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMETROS_P_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METROS_P");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMETROS_P_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12572METROS_P = DecimalUtil.ZERO ;
            n12572METROS_P = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12572METROS_P", GXutil.ltrimstr( A12572METROS_P, 9, 2));
         }
         else
         {
            A12572METROS_P = localUtil.ctond( httpContext.cgiGet( edtMETROS_P_Internalname)) ;
            n12572METROS_P = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12572METROS_P", GXutil.ltrimstr( A12572METROS_P, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKILOS_P_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKILOS_P_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KILOS_P");
            AnyError = (short)(1) ;
            GX_FocusControl = edtKILOS_P_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12573KILOS_P = DecimalUtil.ZERO ;
            n12573KILOS_P = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12573KILOS_P", GXutil.ltrimstr( A12573KILOS_P, 9, 2));
         }
         else
         {
            A12573KILOS_P = localUtil.ctond( httpContext.cgiGet( edtKILOS_P_Internalname)) ;
            n12573KILOS_P = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12573KILOS_P", GXutil.ltrimstr( A12573KILOS_P, 9, 2));
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
            A12574ID_TIAES = httpContext.GetPar( "ID_TIAES") ;
            httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
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
            initAll1KM1734( ) ;
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
      disableAttributes1KM1734( ) ;
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

   public void confirm_1KM0( )
   {
      beforeValidate1KM1734( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KM1734( ) ;
         }
         else
         {
            checkExtendedTable1KM1734( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1KM1734( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1KM0( ) ;
      }
   }

   public void resetCaption1KM0( )
   {
   }

   public void zm1KM1734( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12540ID_EMPRESA = T01KM3_A12540ID_EMPRESA[0] ;
            Z12541FECHA = T01KM3_A12541FECHA[0] ;
            Z12542ID_CLIENTE = T01KM3_A12542ID_CLIENTE[0] ;
            Z12543ID_EMP_CLI = T01KM3_A12543ID_EMP_CLI[0] ;
            Z12544ID_EMP_ZON = T01KM3_A12544ID_EMP_ZON[0] ;
            Z12545ID_MAQUINA = T01KM3_A12545ID_MAQUINA[0] ;
            Z12546ID_EMP_MAQ = T01KM3_A12546ID_EMP_MAQ[0] ;
            Z12547ID_EMP_HDR = T01KM3_A12547ID_EMP_HDR[0] ;
            Z12548HOJA_DE_RU = T01KM3_A12548HOJA_DE_RU[0] ;
            Z12549TIPO = T01KM3_A12549TIPO[0] ;
            Z12550ID_PROCESO = T01KM3_A12550ID_PROCESO[0] ;
            Z12551ID_EMP_PRO = T01KM3_A12551ID_EMP_PRO[0] ;
            Z12552ID_SECCION = T01KM3_A12552ID_SECCION[0] ;
            Z12553ID_EMP_SEC = T01KM3_A12553ID_EMP_SEC[0] ;
            Z12554ID_ANO_MES = T01KM3_A12554ID_ANO_MES[0] ;
            Z12555ID_EMP_ANO = T01KM3_A12555ID_EMP_ANO[0] ;
            Z12556ID_PARO = T01KM3_A12556ID_PARO[0] ;
            Z12557ID_EMP_PAR = T01KM3_A12557ID_EMP_PAR[0] ;
            Z12558ID_COLORAN = T01KM3_A12558ID_COLORAN[0] ;
            Z12559ID_EMP_COL = T01KM3_A12559ID_EMP_COL[0] ;
            Z12560ID_INTENSI = T01KM3_A12560ID_INTENSI[0] ;
            Z12561ID_EMP_INT = T01KM3_A12561ID_EMP_INT[0] ;
            Z12562TIPO_PRODU = T01KM3_A12562TIPO_PRODU[0] ;
            Z12563ID_DEFECTO = T01KM3_A12563ID_DEFECTO[0] ;
            Z12564ID_EMP_DEF = T01KM3_A12564ID_EMP_DEF[0] ;
            Z12565ID_RESPONS = T01KM3_A12565ID_RESPONS[0] ;
            Z12566ID_EMP_RES = T01KM3_A12566ID_EMP_RES[0] ;
            Z12567FACTURADO = T01KM3_A12567FACTURADO[0] ;
            Z12568ID_PASTA = T01KM3_A12568ID_PASTA[0] ;
            Z12569ID_EMP_PAS = T01KM3_A12569ID_EMP_PAS[0] ;
            Z12570UNIDADES = T01KM3_A12570UNIDADES[0] ;
            Z12571TIPO_UNIDA = T01KM3_A12571TIPO_UNIDA[0] ;
            Z12572METROS_P = T01KM3_A12572METROS_P[0] ;
            Z12573KILOS_P = T01KM3_A12573KILOS_P[0] ;
         }
         else
         {
            Z12540ID_EMPRESA = A12540ID_EMPRESA ;
            Z12541FECHA = A12541FECHA ;
            Z12542ID_CLIENTE = A12542ID_CLIENTE ;
            Z12543ID_EMP_CLI = A12543ID_EMP_CLI ;
            Z12544ID_EMP_ZON = A12544ID_EMP_ZON ;
            Z12545ID_MAQUINA = A12545ID_MAQUINA ;
            Z12546ID_EMP_MAQ = A12546ID_EMP_MAQ ;
            Z12547ID_EMP_HDR = A12547ID_EMP_HDR ;
            Z12548HOJA_DE_RU = A12548HOJA_DE_RU ;
            Z12549TIPO = A12549TIPO ;
            Z12550ID_PROCESO = A12550ID_PROCESO ;
            Z12551ID_EMP_PRO = A12551ID_EMP_PRO ;
            Z12552ID_SECCION = A12552ID_SECCION ;
            Z12553ID_EMP_SEC = A12553ID_EMP_SEC ;
            Z12554ID_ANO_MES = A12554ID_ANO_MES ;
            Z12555ID_EMP_ANO = A12555ID_EMP_ANO ;
            Z12556ID_PARO = A12556ID_PARO ;
            Z12557ID_EMP_PAR = A12557ID_EMP_PAR ;
            Z12558ID_COLORAN = A12558ID_COLORAN ;
            Z12559ID_EMP_COL = A12559ID_EMP_COL ;
            Z12560ID_INTENSI = A12560ID_INTENSI ;
            Z12561ID_EMP_INT = A12561ID_EMP_INT ;
            Z12562TIPO_PRODU = A12562TIPO_PRODU ;
            Z12563ID_DEFECTO = A12563ID_DEFECTO ;
            Z12564ID_EMP_DEF = A12564ID_EMP_DEF ;
            Z12565ID_RESPONS = A12565ID_RESPONS ;
            Z12566ID_EMP_RES = A12566ID_EMP_RES ;
            Z12567FACTURADO = A12567FACTURADO ;
            Z12568ID_PASTA = A12568ID_PASTA ;
            Z12569ID_EMP_PAS = A12569ID_EMP_PAS ;
            Z12570UNIDADES = A12570UNIDADES ;
            Z12571TIPO_UNIDA = A12571TIPO_UNIDA ;
            Z12572METROS_P = A12572METROS_P ;
            Z12573KILOS_P = A12573KILOS_P ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12574ID_TIAES = A12574ID_TIAES ;
         Z12540ID_EMPRESA = A12540ID_EMPRESA ;
         Z12541FECHA = A12541FECHA ;
         Z12542ID_CLIENTE = A12542ID_CLIENTE ;
         Z12543ID_EMP_CLI = A12543ID_EMP_CLI ;
         Z12544ID_EMP_ZON = A12544ID_EMP_ZON ;
         Z12545ID_MAQUINA = A12545ID_MAQUINA ;
         Z12546ID_EMP_MAQ = A12546ID_EMP_MAQ ;
         Z12547ID_EMP_HDR = A12547ID_EMP_HDR ;
         Z12548HOJA_DE_RU = A12548HOJA_DE_RU ;
         Z12549TIPO = A12549TIPO ;
         Z12550ID_PROCESO = A12550ID_PROCESO ;
         Z12551ID_EMP_PRO = A12551ID_EMP_PRO ;
         Z12552ID_SECCION = A12552ID_SECCION ;
         Z12553ID_EMP_SEC = A12553ID_EMP_SEC ;
         Z12554ID_ANO_MES = A12554ID_ANO_MES ;
         Z12555ID_EMP_ANO = A12555ID_EMP_ANO ;
         Z12556ID_PARO = A12556ID_PARO ;
         Z12557ID_EMP_PAR = A12557ID_EMP_PAR ;
         Z12558ID_COLORAN = A12558ID_COLORAN ;
         Z12559ID_EMP_COL = A12559ID_EMP_COL ;
         Z12560ID_INTENSI = A12560ID_INTENSI ;
         Z12561ID_EMP_INT = A12561ID_EMP_INT ;
         Z12562TIPO_PRODU = A12562TIPO_PRODU ;
         Z12563ID_DEFECTO = A12563ID_DEFECTO ;
         Z12564ID_EMP_DEF = A12564ID_EMP_DEF ;
         Z12565ID_RESPONS = A12565ID_RESPONS ;
         Z12566ID_EMP_RES = A12566ID_EMP_RES ;
         Z12567FACTURADO = A12567FACTURADO ;
         Z12568ID_PASTA = A12568ID_PASTA ;
         Z12569ID_EMP_PAS = A12569ID_EMP_PAS ;
         Z12570UNIDADES = A12570UNIDADES ;
         Z12571TIPO_UNIDA = A12571TIPO_UNIDA ;
         Z12572METROS_P = A12572METROS_P ;
         Z12573KILOS_P = A12573KILOS_P ;
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

   public void load1KM1734( )
   {
      /* Using cursor T01KM4 */
      pr_default.execute(2, new Object[] {A12574ID_TIAES});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1734 = (short)(1) ;
         A12540ID_EMPRESA = T01KM4_A12540ID_EMPRESA[0] ;
         n12540ID_EMPRESA = T01KM4_n12540ID_EMPRESA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12540ID_EMPRESA", A12540ID_EMPRESA);
         A12541FECHA = T01KM4_A12541FECHA[0] ;
         n12541FECHA = T01KM4_n12541FECHA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12541FECHA", localUtil.format(A12541FECHA, "99/99/99"));
         A12542ID_CLIENTE = T01KM4_A12542ID_CLIENTE[0] ;
         n12542ID_CLIENTE = T01KM4_n12542ID_CLIENTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12542ID_CLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12542ID_CLIENTE), 6, 0));
         A12543ID_EMP_CLI = T01KM4_A12543ID_EMP_CLI[0] ;
         n12543ID_EMP_CLI = T01KM4_n12543ID_EMP_CLI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12543ID_EMP_CLI", A12543ID_EMP_CLI);
         A12544ID_EMP_ZON = T01KM4_A12544ID_EMP_ZON[0] ;
         n12544ID_EMP_ZON = T01KM4_n12544ID_EMP_ZON[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12544ID_EMP_ZON", A12544ID_EMP_ZON);
         A12545ID_MAQUINA = T01KM4_A12545ID_MAQUINA[0] ;
         n12545ID_MAQUINA = T01KM4_n12545ID_MAQUINA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12545ID_MAQUINA", A12545ID_MAQUINA);
         A12546ID_EMP_MAQ = T01KM4_A12546ID_EMP_MAQ[0] ;
         n12546ID_EMP_MAQ = T01KM4_n12546ID_EMP_MAQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12546ID_EMP_MAQ", A12546ID_EMP_MAQ);
         A12547ID_EMP_HDR = T01KM4_A12547ID_EMP_HDR[0] ;
         n12547ID_EMP_HDR = T01KM4_n12547ID_EMP_HDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12547ID_EMP_HDR", A12547ID_EMP_HDR);
         A12548HOJA_DE_RU = T01KM4_A12548HOJA_DE_RU[0] ;
         n12548HOJA_DE_RU = T01KM4_n12548HOJA_DE_RU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12548HOJA_DE_RU", A12548HOJA_DE_RU);
         A12549TIPO = T01KM4_A12549TIPO[0] ;
         n12549TIPO = T01KM4_n12549TIPO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12549TIPO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12549TIPO), 4, 0));
         A12550ID_PROCESO = T01KM4_A12550ID_PROCESO[0] ;
         n12550ID_PROCESO = T01KM4_n12550ID_PROCESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12550ID_PROCESO", A12550ID_PROCESO);
         A12551ID_EMP_PRO = T01KM4_A12551ID_EMP_PRO[0] ;
         n12551ID_EMP_PRO = T01KM4_n12551ID_EMP_PRO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12551ID_EMP_PRO", A12551ID_EMP_PRO);
         A12552ID_SECCION = T01KM4_A12552ID_SECCION[0] ;
         n12552ID_SECCION = T01KM4_n12552ID_SECCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12552ID_SECCION", A12552ID_SECCION);
         A12553ID_EMP_SEC = T01KM4_A12553ID_EMP_SEC[0] ;
         n12553ID_EMP_SEC = T01KM4_n12553ID_EMP_SEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12553ID_EMP_SEC", A12553ID_EMP_SEC);
         A12554ID_ANO_MES = T01KM4_A12554ID_ANO_MES[0] ;
         n12554ID_ANO_MES = T01KM4_n12554ID_ANO_MES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12554ID_ANO_MES", A12554ID_ANO_MES);
         A12555ID_EMP_ANO = T01KM4_A12555ID_EMP_ANO[0] ;
         n12555ID_EMP_ANO = T01KM4_n12555ID_EMP_ANO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12555ID_EMP_ANO", A12555ID_EMP_ANO);
         A12556ID_PARO = T01KM4_A12556ID_PARO[0] ;
         n12556ID_PARO = T01KM4_n12556ID_PARO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12556ID_PARO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12556ID_PARO), 4, 0));
         A12557ID_EMP_PAR = T01KM4_A12557ID_EMP_PAR[0] ;
         n12557ID_EMP_PAR = T01KM4_n12557ID_EMP_PAR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12557ID_EMP_PAR", A12557ID_EMP_PAR);
         A12558ID_COLORAN = T01KM4_A12558ID_COLORAN[0] ;
         n12558ID_COLORAN = T01KM4_n12558ID_COLORAN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12558ID_COLORAN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12558ID_COLORAN), 4, 0));
         A12559ID_EMP_COL = T01KM4_A12559ID_EMP_COL[0] ;
         n12559ID_EMP_COL = T01KM4_n12559ID_EMP_COL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12559ID_EMP_COL", A12559ID_EMP_COL);
         A12560ID_INTENSI = T01KM4_A12560ID_INTENSI[0] ;
         n12560ID_INTENSI = T01KM4_n12560ID_INTENSI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12560ID_INTENSI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12560ID_INTENSI), 4, 0));
         A12561ID_EMP_INT = T01KM4_A12561ID_EMP_INT[0] ;
         n12561ID_EMP_INT = T01KM4_n12561ID_EMP_INT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12561ID_EMP_INT", A12561ID_EMP_INT);
         A12562TIPO_PRODU = T01KM4_A12562TIPO_PRODU[0] ;
         n12562TIPO_PRODU = T01KM4_n12562TIPO_PRODU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12562TIPO_PRODU", A12562TIPO_PRODU);
         A12563ID_DEFECTO = T01KM4_A12563ID_DEFECTO[0] ;
         n12563ID_DEFECTO = T01KM4_n12563ID_DEFECTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12563ID_DEFECTO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12563ID_DEFECTO), 4, 0));
         A12564ID_EMP_DEF = T01KM4_A12564ID_EMP_DEF[0] ;
         n12564ID_EMP_DEF = T01KM4_n12564ID_EMP_DEF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12564ID_EMP_DEF", A12564ID_EMP_DEF);
         A12565ID_RESPONS = T01KM4_A12565ID_RESPONS[0] ;
         n12565ID_RESPONS = T01KM4_n12565ID_RESPONS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12565ID_RESPONS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12565ID_RESPONS), 4, 0));
         A12566ID_EMP_RES = T01KM4_A12566ID_EMP_RES[0] ;
         n12566ID_EMP_RES = T01KM4_n12566ID_EMP_RES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12566ID_EMP_RES", A12566ID_EMP_RES);
         A12567FACTURADO = T01KM4_A12567FACTURADO[0] ;
         n12567FACTURADO = T01KM4_n12567FACTURADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12567FACTURADO", A12567FACTURADO);
         A12568ID_PASTA = T01KM4_A12568ID_PASTA[0] ;
         n12568ID_PASTA = T01KM4_n12568ID_PASTA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12568ID_PASTA", A12568ID_PASTA);
         A12569ID_EMP_PAS = T01KM4_A12569ID_EMP_PAS[0] ;
         n12569ID_EMP_PAS = T01KM4_n12569ID_EMP_PAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12569ID_EMP_PAS", A12569ID_EMP_PAS);
         A12570UNIDADES = T01KM4_A12570UNIDADES[0] ;
         n12570UNIDADES = T01KM4_n12570UNIDADES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12570UNIDADES", GXutil.ltrimstr( A12570UNIDADES, 9, 2));
         A12571TIPO_UNIDA = T01KM4_A12571TIPO_UNIDA[0] ;
         n12571TIPO_UNIDA = T01KM4_n12571TIPO_UNIDA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12571TIPO_UNIDA", A12571TIPO_UNIDA);
         A12572METROS_P = T01KM4_A12572METROS_P[0] ;
         n12572METROS_P = T01KM4_n12572METROS_P[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12572METROS_P", GXutil.ltrimstr( A12572METROS_P, 9, 2));
         A12573KILOS_P = T01KM4_A12573KILOS_P[0] ;
         n12573KILOS_P = T01KM4_n12573KILOS_P[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12573KILOS_P", GXutil.ltrimstr( A12573KILOS_P, 9, 2));
         zm1KM1734( -1) ;
      }
      pr_default.close(2);
      onLoadActions1KM1734( ) ;
   }

   public void onLoadActions1KM1734( )
   {
   }

   public void checkExtendedTable1KM1734( )
   {
      nIsDirty_1734 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KM1734( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KM1734( )
   {
      /* Using cursor T01KM5 */
      pr_default.execute(3, new Object[] {A12574ID_TIAES});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1734 = (short)(1) ;
      }
      else
      {
         RcdFound1734 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KM3 */
      pr_default.execute(1, new Object[] {A12574ID_TIAES});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KM1734( 1) ;
         RcdFound1734 = (short)(1) ;
         A12574ID_TIAES = T01KM3_A12574ID_TIAES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
         A12540ID_EMPRESA = T01KM3_A12540ID_EMPRESA[0] ;
         n12540ID_EMPRESA = T01KM3_n12540ID_EMPRESA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12540ID_EMPRESA", A12540ID_EMPRESA);
         A12541FECHA = T01KM3_A12541FECHA[0] ;
         n12541FECHA = T01KM3_n12541FECHA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12541FECHA", localUtil.format(A12541FECHA, "99/99/99"));
         A12542ID_CLIENTE = T01KM3_A12542ID_CLIENTE[0] ;
         n12542ID_CLIENTE = T01KM3_n12542ID_CLIENTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12542ID_CLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12542ID_CLIENTE), 6, 0));
         A12543ID_EMP_CLI = T01KM3_A12543ID_EMP_CLI[0] ;
         n12543ID_EMP_CLI = T01KM3_n12543ID_EMP_CLI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12543ID_EMP_CLI", A12543ID_EMP_CLI);
         A12544ID_EMP_ZON = T01KM3_A12544ID_EMP_ZON[0] ;
         n12544ID_EMP_ZON = T01KM3_n12544ID_EMP_ZON[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12544ID_EMP_ZON", A12544ID_EMP_ZON);
         A12545ID_MAQUINA = T01KM3_A12545ID_MAQUINA[0] ;
         n12545ID_MAQUINA = T01KM3_n12545ID_MAQUINA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12545ID_MAQUINA", A12545ID_MAQUINA);
         A12546ID_EMP_MAQ = T01KM3_A12546ID_EMP_MAQ[0] ;
         n12546ID_EMP_MAQ = T01KM3_n12546ID_EMP_MAQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12546ID_EMP_MAQ", A12546ID_EMP_MAQ);
         A12547ID_EMP_HDR = T01KM3_A12547ID_EMP_HDR[0] ;
         n12547ID_EMP_HDR = T01KM3_n12547ID_EMP_HDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12547ID_EMP_HDR", A12547ID_EMP_HDR);
         A12548HOJA_DE_RU = T01KM3_A12548HOJA_DE_RU[0] ;
         n12548HOJA_DE_RU = T01KM3_n12548HOJA_DE_RU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12548HOJA_DE_RU", A12548HOJA_DE_RU);
         A12549TIPO = T01KM3_A12549TIPO[0] ;
         n12549TIPO = T01KM3_n12549TIPO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12549TIPO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12549TIPO), 4, 0));
         A12550ID_PROCESO = T01KM3_A12550ID_PROCESO[0] ;
         n12550ID_PROCESO = T01KM3_n12550ID_PROCESO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12550ID_PROCESO", A12550ID_PROCESO);
         A12551ID_EMP_PRO = T01KM3_A12551ID_EMP_PRO[0] ;
         n12551ID_EMP_PRO = T01KM3_n12551ID_EMP_PRO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12551ID_EMP_PRO", A12551ID_EMP_PRO);
         A12552ID_SECCION = T01KM3_A12552ID_SECCION[0] ;
         n12552ID_SECCION = T01KM3_n12552ID_SECCION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12552ID_SECCION", A12552ID_SECCION);
         A12553ID_EMP_SEC = T01KM3_A12553ID_EMP_SEC[0] ;
         n12553ID_EMP_SEC = T01KM3_n12553ID_EMP_SEC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12553ID_EMP_SEC", A12553ID_EMP_SEC);
         A12554ID_ANO_MES = T01KM3_A12554ID_ANO_MES[0] ;
         n12554ID_ANO_MES = T01KM3_n12554ID_ANO_MES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12554ID_ANO_MES", A12554ID_ANO_MES);
         A12555ID_EMP_ANO = T01KM3_A12555ID_EMP_ANO[0] ;
         n12555ID_EMP_ANO = T01KM3_n12555ID_EMP_ANO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12555ID_EMP_ANO", A12555ID_EMP_ANO);
         A12556ID_PARO = T01KM3_A12556ID_PARO[0] ;
         n12556ID_PARO = T01KM3_n12556ID_PARO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12556ID_PARO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12556ID_PARO), 4, 0));
         A12557ID_EMP_PAR = T01KM3_A12557ID_EMP_PAR[0] ;
         n12557ID_EMP_PAR = T01KM3_n12557ID_EMP_PAR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12557ID_EMP_PAR", A12557ID_EMP_PAR);
         A12558ID_COLORAN = T01KM3_A12558ID_COLORAN[0] ;
         n12558ID_COLORAN = T01KM3_n12558ID_COLORAN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12558ID_COLORAN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12558ID_COLORAN), 4, 0));
         A12559ID_EMP_COL = T01KM3_A12559ID_EMP_COL[0] ;
         n12559ID_EMP_COL = T01KM3_n12559ID_EMP_COL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12559ID_EMP_COL", A12559ID_EMP_COL);
         A12560ID_INTENSI = T01KM3_A12560ID_INTENSI[0] ;
         n12560ID_INTENSI = T01KM3_n12560ID_INTENSI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12560ID_INTENSI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12560ID_INTENSI), 4, 0));
         A12561ID_EMP_INT = T01KM3_A12561ID_EMP_INT[0] ;
         n12561ID_EMP_INT = T01KM3_n12561ID_EMP_INT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12561ID_EMP_INT", A12561ID_EMP_INT);
         A12562TIPO_PRODU = T01KM3_A12562TIPO_PRODU[0] ;
         n12562TIPO_PRODU = T01KM3_n12562TIPO_PRODU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12562TIPO_PRODU", A12562TIPO_PRODU);
         A12563ID_DEFECTO = T01KM3_A12563ID_DEFECTO[0] ;
         n12563ID_DEFECTO = T01KM3_n12563ID_DEFECTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12563ID_DEFECTO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12563ID_DEFECTO), 4, 0));
         A12564ID_EMP_DEF = T01KM3_A12564ID_EMP_DEF[0] ;
         n12564ID_EMP_DEF = T01KM3_n12564ID_EMP_DEF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12564ID_EMP_DEF", A12564ID_EMP_DEF);
         A12565ID_RESPONS = T01KM3_A12565ID_RESPONS[0] ;
         n12565ID_RESPONS = T01KM3_n12565ID_RESPONS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12565ID_RESPONS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12565ID_RESPONS), 4, 0));
         A12566ID_EMP_RES = T01KM3_A12566ID_EMP_RES[0] ;
         n12566ID_EMP_RES = T01KM3_n12566ID_EMP_RES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12566ID_EMP_RES", A12566ID_EMP_RES);
         A12567FACTURADO = T01KM3_A12567FACTURADO[0] ;
         n12567FACTURADO = T01KM3_n12567FACTURADO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12567FACTURADO", A12567FACTURADO);
         A12568ID_PASTA = T01KM3_A12568ID_PASTA[0] ;
         n12568ID_PASTA = T01KM3_n12568ID_PASTA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12568ID_PASTA", A12568ID_PASTA);
         A12569ID_EMP_PAS = T01KM3_A12569ID_EMP_PAS[0] ;
         n12569ID_EMP_PAS = T01KM3_n12569ID_EMP_PAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12569ID_EMP_PAS", A12569ID_EMP_PAS);
         A12570UNIDADES = T01KM3_A12570UNIDADES[0] ;
         n12570UNIDADES = T01KM3_n12570UNIDADES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12570UNIDADES", GXutil.ltrimstr( A12570UNIDADES, 9, 2));
         A12571TIPO_UNIDA = T01KM3_A12571TIPO_UNIDA[0] ;
         n12571TIPO_UNIDA = T01KM3_n12571TIPO_UNIDA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12571TIPO_UNIDA", A12571TIPO_UNIDA);
         A12572METROS_P = T01KM3_A12572METROS_P[0] ;
         n12572METROS_P = T01KM3_n12572METROS_P[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12572METROS_P", GXutil.ltrimstr( A12572METROS_P, 9, 2));
         A12573KILOS_P = T01KM3_A12573KILOS_P[0] ;
         n12573KILOS_P = T01KM3_n12573KILOS_P[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12573KILOS_P", GXutil.ltrimstr( A12573KILOS_P, 9, 2));
         Z12574ID_TIAES = A12574ID_TIAES ;
         sMode1734 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KM1734( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1734 = (short)(0) ;
            initializeNonKey1KM1734( ) ;
         }
         Gx_mode = sMode1734 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1734 = (short)(0) ;
         initializeNonKey1KM1734( ) ;
         sMode1734 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1734 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1KM1734( ) ;
      if ( RcdFound1734 == 0 )
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
      RcdFound1734 = (short)(0) ;
      /* Using cursor T01KM6 */
      pr_default.execute(4, new Object[] {A12574ID_TIAES});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01KM6_A12574ID_TIAES[0], A12574ID_TIAES) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01KM6_A12574ID_TIAES[0], A12574ID_TIAES) > 0 ) ) )
         {
            A12574ID_TIAES = T01KM6_A12574ID_TIAES[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
            RcdFound1734 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1734 = (short)(0) ;
      /* Using cursor T01KM7 */
      pr_default.execute(5, new Object[] {A12574ID_TIAES});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01KM7_A12574ID_TIAES[0], A12574ID_TIAES) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01KM7_A12574ID_TIAES[0], A12574ID_TIAES) < 0 ) ) )
         {
            A12574ID_TIAES = T01KM7_A12574ID_TIAES[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
            RcdFound1734 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KM1734( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtID_TIAES_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KM1734( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1734 == 1 )
         {
            if ( GXutil.strcmp(A12574ID_TIAES, Z12574ID_TIAES) != 0 )
            {
               A12574ID_TIAES = Z12574ID_TIAES ;
               httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ID_TIAES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtID_TIAES_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtID_TIAES_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KM1734( ) ;
               GX_FocusControl = edtID_TIAES_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A12574ID_TIAES, Z12574ID_TIAES) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtID_TIAES_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KM1734( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ID_TIAES");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtID_TIAES_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtID_TIAES_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KM1734( ) ;
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
      if ( GXutil.strcmp(A12574ID_TIAES, Z12574ID_TIAES) != 0 )
      {
         A12574ID_TIAES = Z12574ID_TIAES ;
         httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ID_TIAES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtID_TIAES_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtID_TIAES_Internalname ;
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
      getKey1KM1734( ) ;
      if ( RcdFound1734 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "ID_TIAES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_TIAES_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A12574ID_TIAES, Z12574ID_TIAES) != 0 )
         {
            A12574ID_TIAES = Z12574ID_TIAES ;
            httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "ID_TIAES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtID_TIAES_Internalname ;
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
         if ( GXutil.strcmp(A12574ID_TIAES, Z12574ID_TIAES) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ID_TIAES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtID_TIAES_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttiaes");
      GX_FocusControl = edtID_EMPRESA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KM0( ) ;
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
      if ( RcdFound1734 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "ID_TIAES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtID_TIAES_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtID_EMPRESA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KM1734( ) ;
      if ( RcdFound1734 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtID_EMPRESA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KM1734( ) ;
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
      if ( RcdFound1734 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtID_EMPRESA_Internalname ;
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
      if ( RcdFound1734 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtID_EMPRESA_Internalname ;
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
      scanStart1KM1734( ) ;
      if ( RcdFound1734 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1734 != 0 )
         {
            scanNext1KM1734( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtID_EMPRESA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KM1734( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KM1734( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KM2 */
         pr_default.execute(0, new Object[] {A12574ID_TIAES});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIAES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12540ID_EMPRESA, T01KM2_A12540ID_EMPRESA[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12541FECHA), GXutil.resetTime(T01KM2_A12541FECHA[0])) ) || ( Z12542ID_CLIENTE != T01KM2_A12542ID_CLIENTE[0] ) || ( GXutil.strcmp(Z12543ID_EMP_CLI, T01KM2_A12543ID_EMP_CLI[0]) != 0 ) || ( GXutil.strcmp(Z12544ID_EMP_ZON, T01KM2_A12544ID_EMP_ZON[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12545ID_MAQUINA, T01KM2_A12545ID_MAQUINA[0]) != 0 ) || ( GXutil.strcmp(Z12546ID_EMP_MAQ, T01KM2_A12546ID_EMP_MAQ[0]) != 0 ) || ( GXutil.strcmp(Z12547ID_EMP_HDR, T01KM2_A12547ID_EMP_HDR[0]) != 0 ) || ( GXutil.strcmp(Z12548HOJA_DE_RU, T01KM2_A12548HOJA_DE_RU[0]) != 0 ) || ( Z12549TIPO != T01KM2_A12549TIPO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12550ID_PROCESO, T01KM2_A12550ID_PROCESO[0]) != 0 ) || ( GXutil.strcmp(Z12551ID_EMP_PRO, T01KM2_A12551ID_EMP_PRO[0]) != 0 ) || ( GXutil.strcmp(Z12552ID_SECCION, T01KM2_A12552ID_SECCION[0]) != 0 ) || ( GXutil.strcmp(Z12553ID_EMP_SEC, T01KM2_A12553ID_EMP_SEC[0]) != 0 ) || ( GXutil.strcmp(Z12554ID_ANO_MES, T01KM2_A12554ID_ANO_MES[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12555ID_EMP_ANO, T01KM2_A12555ID_EMP_ANO[0]) != 0 ) || ( Z12556ID_PARO != T01KM2_A12556ID_PARO[0] ) || ( GXutil.strcmp(Z12557ID_EMP_PAR, T01KM2_A12557ID_EMP_PAR[0]) != 0 ) || ( Z12558ID_COLORAN != T01KM2_A12558ID_COLORAN[0] ) || ( GXutil.strcmp(Z12559ID_EMP_COL, T01KM2_A12559ID_EMP_COL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12560ID_INTENSI != T01KM2_A12560ID_INTENSI[0] ) || ( GXutil.strcmp(Z12561ID_EMP_INT, T01KM2_A12561ID_EMP_INT[0]) != 0 ) || ( GXutil.strcmp(Z12562TIPO_PRODU, T01KM2_A12562TIPO_PRODU[0]) != 0 ) || ( Z12563ID_DEFECTO != T01KM2_A12563ID_DEFECTO[0] ) || ( GXutil.strcmp(Z12564ID_EMP_DEF, T01KM2_A12564ID_EMP_DEF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12565ID_RESPONS != T01KM2_A12565ID_RESPONS[0] ) || ( GXutil.strcmp(Z12566ID_EMP_RES, T01KM2_A12566ID_EMP_RES[0]) != 0 ) || ( GXutil.strcmp(Z12567FACTURADO, T01KM2_A12567FACTURADO[0]) != 0 ) || ( GXutil.strcmp(Z12568ID_PASTA, T01KM2_A12568ID_PASTA[0]) != 0 ) || ( GXutil.strcmp(Z12569ID_EMP_PAS, T01KM2_A12569ID_EMP_PAS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12570UNIDADES, T01KM2_A12570UNIDADES[0]) != 0 ) || ( GXutil.strcmp(Z12571TIPO_UNIDA, T01KM2_A12571TIPO_UNIDA[0]) != 0 ) || ( DecimalUtil.compareTo(Z12572METROS_P, T01KM2_A12572METROS_P[0]) != 0 ) || ( DecimalUtil.compareTo(Z12573KILOS_P, T01KM2_A12573KILOS_P[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12540ID_EMPRESA, T01KM2_A12540ID_EMPRESA[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMPRESA");
               GXutil.writeLogRaw("Old: ",Z12540ID_EMPRESA);
               GXutil.writeLogRaw("Current: ",T01KM2_A12540ID_EMPRESA[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12541FECHA), GXutil.resetTime(T01KM2_A12541FECHA[0])) ) )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"FECHA");
               GXutil.writeLogRaw("Old: ",Z12541FECHA);
               GXutil.writeLogRaw("Current: ",T01KM2_A12541FECHA[0]);
            }
            if ( Z12542ID_CLIENTE != T01KM2_A12542ID_CLIENTE[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_CLIENTE");
               GXutil.writeLogRaw("Old: ",Z12542ID_CLIENTE);
               GXutil.writeLogRaw("Current: ",T01KM2_A12542ID_CLIENTE[0]);
            }
            if ( GXutil.strcmp(Z12543ID_EMP_CLI, T01KM2_A12543ID_EMP_CLI[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_CLI");
               GXutil.writeLogRaw("Old: ",Z12543ID_EMP_CLI);
               GXutil.writeLogRaw("Current: ",T01KM2_A12543ID_EMP_CLI[0]);
            }
            if ( GXutil.strcmp(Z12544ID_EMP_ZON, T01KM2_A12544ID_EMP_ZON[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_ZON");
               GXutil.writeLogRaw("Old: ",Z12544ID_EMP_ZON);
               GXutil.writeLogRaw("Current: ",T01KM2_A12544ID_EMP_ZON[0]);
            }
            if ( GXutil.strcmp(Z12545ID_MAQUINA, T01KM2_A12545ID_MAQUINA[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_MAQUINA");
               GXutil.writeLogRaw("Old: ",Z12545ID_MAQUINA);
               GXutil.writeLogRaw("Current: ",T01KM2_A12545ID_MAQUINA[0]);
            }
            if ( GXutil.strcmp(Z12546ID_EMP_MAQ, T01KM2_A12546ID_EMP_MAQ[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_MAQ");
               GXutil.writeLogRaw("Old: ",Z12546ID_EMP_MAQ);
               GXutil.writeLogRaw("Current: ",T01KM2_A12546ID_EMP_MAQ[0]);
            }
            if ( GXutil.strcmp(Z12547ID_EMP_HDR, T01KM2_A12547ID_EMP_HDR[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_HDR");
               GXutil.writeLogRaw("Old: ",Z12547ID_EMP_HDR);
               GXutil.writeLogRaw("Current: ",T01KM2_A12547ID_EMP_HDR[0]);
            }
            if ( GXutil.strcmp(Z12548HOJA_DE_RU, T01KM2_A12548HOJA_DE_RU[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"HOJA_DE_RU");
               GXutil.writeLogRaw("Old: ",Z12548HOJA_DE_RU);
               GXutil.writeLogRaw("Current: ",T01KM2_A12548HOJA_DE_RU[0]);
            }
            if ( Z12549TIPO != T01KM2_A12549TIPO[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"TIPO");
               GXutil.writeLogRaw("Old: ",Z12549TIPO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12549TIPO[0]);
            }
            if ( GXutil.strcmp(Z12550ID_PROCESO, T01KM2_A12550ID_PROCESO[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_PROCESO");
               GXutil.writeLogRaw("Old: ",Z12550ID_PROCESO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12550ID_PROCESO[0]);
            }
            if ( GXutil.strcmp(Z12551ID_EMP_PRO, T01KM2_A12551ID_EMP_PRO[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_PRO");
               GXutil.writeLogRaw("Old: ",Z12551ID_EMP_PRO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12551ID_EMP_PRO[0]);
            }
            if ( GXutil.strcmp(Z12552ID_SECCION, T01KM2_A12552ID_SECCION[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_SECCION");
               GXutil.writeLogRaw("Old: ",Z12552ID_SECCION);
               GXutil.writeLogRaw("Current: ",T01KM2_A12552ID_SECCION[0]);
            }
            if ( GXutil.strcmp(Z12553ID_EMP_SEC, T01KM2_A12553ID_EMP_SEC[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_SEC");
               GXutil.writeLogRaw("Old: ",Z12553ID_EMP_SEC);
               GXutil.writeLogRaw("Current: ",T01KM2_A12553ID_EMP_SEC[0]);
            }
            if ( GXutil.strcmp(Z12554ID_ANO_MES, T01KM2_A12554ID_ANO_MES[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_ANO_MES");
               GXutil.writeLogRaw("Old: ",Z12554ID_ANO_MES);
               GXutil.writeLogRaw("Current: ",T01KM2_A12554ID_ANO_MES[0]);
            }
            if ( GXutil.strcmp(Z12555ID_EMP_ANO, T01KM2_A12555ID_EMP_ANO[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_ANO");
               GXutil.writeLogRaw("Old: ",Z12555ID_EMP_ANO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12555ID_EMP_ANO[0]);
            }
            if ( Z12556ID_PARO != T01KM2_A12556ID_PARO[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_PARO");
               GXutil.writeLogRaw("Old: ",Z12556ID_PARO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12556ID_PARO[0]);
            }
            if ( GXutil.strcmp(Z12557ID_EMP_PAR, T01KM2_A12557ID_EMP_PAR[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_PAR");
               GXutil.writeLogRaw("Old: ",Z12557ID_EMP_PAR);
               GXutil.writeLogRaw("Current: ",T01KM2_A12557ID_EMP_PAR[0]);
            }
            if ( Z12558ID_COLORAN != T01KM2_A12558ID_COLORAN[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_COLORAN");
               GXutil.writeLogRaw("Old: ",Z12558ID_COLORAN);
               GXutil.writeLogRaw("Current: ",T01KM2_A12558ID_COLORAN[0]);
            }
            if ( GXutil.strcmp(Z12559ID_EMP_COL, T01KM2_A12559ID_EMP_COL[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_COL");
               GXutil.writeLogRaw("Old: ",Z12559ID_EMP_COL);
               GXutil.writeLogRaw("Current: ",T01KM2_A12559ID_EMP_COL[0]);
            }
            if ( Z12560ID_INTENSI != T01KM2_A12560ID_INTENSI[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_INTENSI");
               GXutil.writeLogRaw("Old: ",Z12560ID_INTENSI);
               GXutil.writeLogRaw("Current: ",T01KM2_A12560ID_INTENSI[0]);
            }
            if ( GXutil.strcmp(Z12561ID_EMP_INT, T01KM2_A12561ID_EMP_INT[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_INT");
               GXutil.writeLogRaw("Old: ",Z12561ID_EMP_INT);
               GXutil.writeLogRaw("Current: ",T01KM2_A12561ID_EMP_INT[0]);
            }
            if ( GXutil.strcmp(Z12562TIPO_PRODU, T01KM2_A12562TIPO_PRODU[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"TIPO_PRODU");
               GXutil.writeLogRaw("Old: ",Z12562TIPO_PRODU);
               GXutil.writeLogRaw("Current: ",T01KM2_A12562TIPO_PRODU[0]);
            }
            if ( Z12563ID_DEFECTO != T01KM2_A12563ID_DEFECTO[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_DEFECTO");
               GXutil.writeLogRaw("Old: ",Z12563ID_DEFECTO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12563ID_DEFECTO[0]);
            }
            if ( GXutil.strcmp(Z12564ID_EMP_DEF, T01KM2_A12564ID_EMP_DEF[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_DEF");
               GXutil.writeLogRaw("Old: ",Z12564ID_EMP_DEF);
               GXutil.writeLogRaw("Current: ",T01KM2_A12564ID_EMP_DEF[0]);
            }
            if ( Z12565ID_RESPONS != T01KM2_A12565ID_RESPONS[0] )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_RESPONS");
               GXutil.writeLogRaw("Old: ",Z12565ID_RESPONS);
               GXutil.writeLogRaw("Current: ",T01KM2_A12565ID_RESPONS[0]);
            }
            if ( GXutil.strcmp(Z12566ID_EMP_RES, T01KM2_A12566ID_EMP_RES[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_RES");
               GXutil.writeLogRaw("Old: ",Z12566ID_EMP_RES);
               GXutil.writeLogRaw("Current: ",T01KM2_A12566ID_EMP_RES[0]);
            }
            if ( GXutil.strcmp(Z12567FACTURADO, T01KM2_A12567FACTURADO[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"FACTURADO");
               GXutil.writeLogRaw("Old: ",Z12567FACTURADO);
               GXutil.writeLogRaw("Current: ",T01KM2_A12567FACTURADO[0]);
            }
            if ( GXutil.strcmp(Z12568ID_PASTA, T01KM2_A12568ID_PASTA[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_PASTA");
               GXutil.writeLogRaw("Old: ",Z12568ID_PASTA);
               GXutil.writeLogRaw("Current: ",T01KM2_A12568ID_PASTA[0]);
            }
            if ( GXutil.strcmp(Z12569ID_EMP_PAS, T01KM2_A12569ID_EMP_PAS[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"ID_EMP_PAS");
               GXutil.writeLogRaw("Old: ",Z12569ID_EMP_PAS);
               GXutil.writeLogRaw("Current: ",T01KM2_A12569ID_EMP_PAS[0]);
            }
            if ( DecimalUtil.compareTo(Z12570UNIDADES, T01KM2_A12570UNIDADES[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"UNIDADES");
               GXutil.writeLogRaw("Old: ",Z12570UNIDADES);
               GXutil.writeLogRaw("Current: ",T01KM2_A12570UNIDADES[0]);
            }
            if ( GXutil.strcmp(Z12571TIPO_UNIDA, T01KM2_A12571TIPO_UNIDA[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"TIPO_UNIDA");
               GXutil.writeLogRaw("Old: ",Z12571TIPO_UNIDA);
               GXutil.writeLogRaw("Current: ",T01KM2_A12571TIPO_UNIDA[0]);
            }
            if ( DecimalUtil.compareTo(Z12572METROS_P, T01KM2_A12572METROS_P[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"METROS_P");
               GXutil.writeLogRaw("Old: ",Z12572METROS_P);
               GXutil.writeLogRaw("Current: ",T01KM2_A12572METROS_P[0]);
            }
            if ( DecimalUtil.compareTo(Z12573KILOS_P, T01KM2_A12573KILOS_P[0]) != 0 )
            {
               GXutil.writeLogln("ttiaes:[seudo value changed for attri]"+"KILOS_P");
               GXutil.writeLogRaw("Old: ",Z12573KILOS_P);
               GXutil.writeLogRaw("Current: ",T01KM2_A12573KILOS_P[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIAES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KM1734( )
   {
      beforeValidate1KM1734( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KM1734( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KM1734( 0) ;
         checkOptimisticConcurrency1KM1734( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KM1734( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KM1734( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KM8 */
                  pr_default.execute(6, new Object[] {A12574ID_TIAES, Boolean.valueOf(n12540ID_EMPRESA), A12540ID_EMPRESA, Boolean.valueOf(n12541FECHA), A12541FECHA, Boolean.valueOf(n12542ID_CLIENTE), Integer.valueOf(A12542ID_CLIENTE), Boolean.valueOf(n12543ID_EMP_CLI), A12543ID_EMP_CLI, Boolean.valueOf(n12544ID_EMP_ZON), A12544ID_EMP_ZON, Boolean.valueOf(n12545ID_MAQUINA), A12545ID_MAQUINA, Boolean.valueOf(n12546ID_EMP_MAQ), A12546ID_EMP_MAQ, Boolean.valueOf(n12547ID_EMP_HDR), A12547ID_EMP_HDR, Boolean.valueOf(n12548HOJA_DE_RU), A12548HOJA_DE_RU, Boolean.valueOf(n12549TIPO), Short.valueOf(A12549TIPO), Boolean.valueOf(n12550ID_PROCESO), A12550ID_PROCESO, Boolean.valueOf(n12551ID_EMP_PRO), A12551ID_EMP_PRO, Boolean.valueOf(n12552ID_SECCION), A12552ID_SECCION, Boolean.valueOf(n12553ID_EMP_SEC), A12553ID_EMP_SEC, Boolean.valueOf(n12554ID_ANO_MES), A12554ID_ANO_MES, Boolean.valueOf(n12555ID_EMP_ANO), A12555ID_EMP_ANO, Boolean.valueOf(n12556ID_PARO), Short.valueOf(A12556ID_PARO), Boolean.valueOf(n12557ID_EMP_PAR), A12557ID_EMP_PAR, Boolean.valueOf(n12558ID_COLORAN), Short.valueOf(A12558ID_COLORAN), Boolean.valueOf(n12559ID_EMP_COL), A12559ID_EMP_COL, Boolean.valueOf(n12560ID_INTENSI), Short.valueOf(A12560ID_INTENSI), Boolean.valueOf(n12561ID_EMP_INT), A12561ID_EMP_INT, Boolean.valueOf(n12562TIPO_PRODU), A12562TIPO_PRODU, Boolean.valueOf(n12563ID_DEFECTO), Short.valueOf(A12563ID_DEFECTO), Boolean.valueOf(n12564ID_EMP_DEF), A12564ID_EMP_DEF, Boolean.valueOf(n12565ID_RESPONS), Short.valueOf(A12565ID_RESPONS), Boolean.valueOf(n12566ID_EMP_RES), A12566ID_EMP_RES, Boolean.valueOf(n12567FACTURADO), A12567FACTURADO, Boolean.valueOf(n12568ID_PASTA), A12568ID_PASTA, Boolean.valueOf(n12569ID_EMP_PAS), A12569ID_EMP_PAS, Boolean.valueOf(n12570UNIDADES), A12570UNIDADES, Boolean.valueOf(n12571TIPO_UNIDA), A12571TIPO_UNIDA, Boolean.valueOf(n12572METROS_P), A12572METROS_P, Boolean.valueOf(n12573KILOS_P), A12573KILOS_P});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
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
                        resetCaption1KM0( ) ;
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
            load1KM1734( ) ;
         }
         endLevel1KM1734( ) ;
      }
      closeExtendedTableCursors1KM1734( ) ;
   }

   public void update1KM1734( )
   {
      beforeValidate1KM1734( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KM1734( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KM1734( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KM1734( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KM1734( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KM9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n12540ID_EMPRESA), A12540ID_EMPRESA, Boolean.valueOf(n12541FECHA), A12541FECHA, Boolean.valueOf(n12542ID_CLIENTE), Integer.valueOf(A12542ID_CLIENTE), Boolean.valueOf(n12543ID_EMP_CLI), A12543ID_EMP_CLI, Boolean.valueOf(n12544ID_EMP_ZON), A12544ID_EMP_ZON, Boolean.valueOf(n12545ID_MAQUINA), A12545ID_MAQUINA, Boolean.valueOf(n12546ID_EMP_MAQ), A12546ID_EMP_MAQ, Boolean.valueOf(n12547ID_EMP_HDR), A12547ID_EMP_HDR, Boolean.valueOf(n12548HOJA_DE_RU), A12548HOJA_DE_RU, Boolean.valueOf(n12549TIPO), Short.valueOf(A12549TIPO), Boolean.valueOf(n12550ID_PROCESO), A12550ID_PROCESO, Boolean.valueOf(n12551ID_EMP_PRO), A12551ID_EMP_PRO, Boolean.valueOf(n12552ID_SECCION), A12552ID_SECCION, Boolean.valueOf(n12553ID_EMP_SEC), A12553ID_EMP_SEC, Boolean.valueOf(n12554ID_ANO_MES), A12554ID_ANO_MES, Boolean.valueOf(n12555ID_EMP_ANO), A12555ID_EMP_ANO, Boolean.valueOf(n12556ID_PARO), Short.valueOf(A12556ID_PARO), Boolean.valueOf(n12557ID_EMP_PAR), A12557ID_EMP_PAR, Boolean.valueOf(n12558ID_COLORAN), Short.valueOf(A12558ID_COLORAN), Boolean.valueOf(n12559ID_EMP_COL), A12559ID_EMP_COL, Boolean.valueOf(n12560ID_INTENSI), Short.valueOf(A12560ID_INTENSI), Boolean.valueOf(n12561ID_EMP_INT), A12561ID_EMP_INT, Boolean.valueOf(n12562TIPO_PRODU), A12562TIPO_PRODU, Boolean.valueOf(n12563ID_DEFECTO), Short.valueOf(A12563ID_DEFECTO), Boolean.valueOf(n12564ID_EMP_DEF), A12564ID_EMP_DEF, Boolean.valueOf(n12565ID_RESPONS), Short.valueOf(A12565ID_RESPONS), Boolean.valueOf(n12566ID_EMP_RES), A12566ID_EMP_RES, Boolean.valueOf(n12567FACTURADO), A12567FACTURADO, Boolean.valueOf(n12568ID_PASTA), A12568ID_PASTA, Boolean.valueOf(n12569ID_EMP_PAS), A12569ID_EMP_PAS, Boolean.valueOf(n12570UNIDADES), A12570UNIDADES, Boolean.valueOf(n12571TIPO_UNIDA), A12571TIPO_UNIDA, Boolean.valueOf(n12572METROS_P), A12572METROS_P, Boolean.valueOf(n12573KILOS_P), A12573KILOS_P, A12574ID_TIAES});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIAES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KM1734( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1KM0( ) ;
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
         endLevel1KM1734( ) ;
      }
      closeExtendedTableCursors1KM1734( ) ;
   }

   public void deferredUpdate1KM1734( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KM1734( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KM1734( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KM1734( ) ;
         afterConfirm1KM1734( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KM1734( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KM10 */
               pr_default.execute(8, new Object[] {A12574ID_TIAES});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIAES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1734 == 0 )
                     {
                        initAll1KM1734( ) ;
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
                     resetCaption1KM0( ) ;
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
      sMode1734 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KM1734( ) ;
      Gx_mode = sMode1734 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KM1734( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KM1734( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KM1734( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttiaes");
         if ( AnyError == 0 )
         {
            confirmValues1KM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttiaes");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KM1734( )
   {
      /* Using cursor T01KM11 */
      pr_default.execute(9);
      RcdFound1734 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1734 = (short)(1) ;
         A12574ID_TIAES = T01KM11_A12574ID_TIAES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KM1734( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1734 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1734 = (short)(1) ;
         A12574ID_TIAES = T01KM11_A12574ID_TIAES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
      }
   }

   public void scanEnd1KM1734( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1KM1734( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KM1734( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KM1734( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KM1734( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KM1734( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KM1734( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KM1734( )
   {
      edtID_TIAES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_TIAES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_TIAES_Enabled), 5, 0), true);
      edtID_EMPRESA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMPRESA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMPRESA_Enabled), 5, 0), true);
      edtFECHA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFECHA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFECHA_Enabled), 5, 0), true);
      edtID_CLIENTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_CLIENTE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_CLIENTE_Enabled), 5, 0), true);
      edtID_EMP_CLI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_CLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_CLI_Enabled), 5, 0), true);
      edtID_EMP_ZON_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_ZON_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_ZON_Enabled), 5, 0), true);
      edtID_MAQUINA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_MAQUINA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_MAQUINA_Enabled), 5, 0), true);
      edtID_EMP_MAQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_MAQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_MAQ_Enabled), 5, 0), true);
      edtID_EMP_HDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_HDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_HDR_Enabled), 5, 0), true);
      edtHOJA_DE_RU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHOJA_DE_RU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHOJA_DE_RU_Enabled), 5, 0), true);
      edtTIPO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIPO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTIPO_Enabled), 5, 0), true);
      edtID_PROCESO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_PROCESO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_PROCESO_Enabled), 5, 0), true);
      edtID_EMP_PRO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_PRO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_PRO_Enabled), 5, 0), true);
      edtID_SECCION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_SECCION_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_SECCION_Enabled), 5, 0), true);
      edtID_EMP_SEC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_SEC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_SEC_Enabled), 5, 0), true);
      edtID_ANO_MES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_ANO_MES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_ANO_MES_Enabled), 5, 0), true);
      edtID_EMP_ANO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_ANO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_ANO_Enabled), 5, 0), true);
      edtID_PARO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_PARO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_PARO_Enabled), 5, 0), true);
      edtID_EMP_PAR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_PAR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_PAR_Enabled), 5, 0), true);
      edtID_COLORAN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_COLORAN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_COLORAN_Enabled), 5, 0), true);
      edtID_EMP_COL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_COL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_COL_Enabled), 5, 0), true);
      edtID_INTENSI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_INTENSI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_INTENSI_Enabled), 5, 0), true);
      edtID_EMP_INT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_INT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_INT_Enabled), 5, 0), true);
      edtTIPO_PRODU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIPO_PRODU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTIPO_PRODU_Enabled), 5, 0), true);
      edtID_DEFECTO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_DEFECTO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_DEFECTO_Enabled), 5, 0), true);
      edtID_EMP_DEF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_DEF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_DEF_Enabled), 5, 0), true);
      edtID_RESPONS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_RESPONS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_RESPONS_Enabled), 5, 0), true);
      edtID_EMP_RES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_RES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_RES_Enabled), 5, 0), true);
      edtFACTURADO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFACTURADO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFACTURADO_Enabled), 5, 0), true);
      edtID_PASTA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_PASTA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_PASTA_Enabled), 5, 0), true);
      edtID_EMP_PAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_EMP_PAS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_EMP_PAS_Enabled), 5, 0), true);
      edtUNIDADES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUNIDADES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUNIDADES_Enabled), 5, 0), true);
      edtTIPO_UNIDA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTIPO_UNIDA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTIPO_UNIDA_Enabled), 5, 0), true);
      edtMETROS_P_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMETROS_P_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMETROS_P_Enabled), 5, 0), true);
      edtKILOS_P_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKILOS_P_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKILOS_P_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1KM1734( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1KM0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttiaes", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12574ID_TIAES", Z12574ID_TIAES);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12540ID_EMPRESA", GXutil.rtrim( Z12540ID_EMPRESA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12541FECHA", localUtil.dtoc( Z12541FECHA, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12542ID_CLIENTE", GXutil.ltrim( localUtil.ntoc( Z12542ID_CLIENTE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12543ID_EMP_CLI", Z12543ID_EMP_CLI);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12544ID_EMP_ZON", Z12544ID_EMP_ZON);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12545ID_MAQUINA", Z12545ID_MAQUINA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12546ID_EMP_MAQ", Z12546ID_EMP_MAQ);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12547ID_EMP_HDR", Z12547ID_EMP_HDR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12548HOJA_DE_RU", Z12548HOJA_DE_RU);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12549TIPO", GXutil.ltrim( localUtil.ntoc( Z12549TIPO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12550ID_PROCESO", Z12550ID_PROCESO);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12551ID_EMP_PRO", Z12551ID_EMP_PRO);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12552ID_SECCION", Z12552ID_SECCION);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12553ID_EMP_SEC", Z12553ID_EMP_SEC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12554ID_ANO_MES", Z12554ID_ANO_MES);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12555ID_EMP_ANO", Z12555ID_EMP_ANO);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12556ID_PARO", GXutil.ltrim( localUtil.ntoc( Z12556ID_PARO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12557ID_EMP_PAR", Z12557ID_EMP_PAR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12558ID_COLORAN", GXutil.ltrim( localUtil.ntoc( Z12558ID_COLORAN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12559ID_EMP_COL", Z12559ID_EMP_COL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12560ID_INTENSI", GXutil.ltrim( localUtil.ntoc( Z12560ID_INTENSI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12561ID_EMP_INT", Z12561ID_EMP_INT);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12562TIPO_PRODU", Z12562TIPO_PRODU);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12563ID_DEFECTO", GXutil.ltrim( localUtil.ntoc( Z12563ID_DEFECTO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12564ID_EMP_DEF", Z12564ID_EMP_DEF);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12565ID_RESPONS", GXutil.ltrim( localUtil.ntoc( Z12565ID_RESPONS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12566ID_EMP_RES", Z12566ID_EMP_RES);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12567FACTURADO", GXutil.rtrim( Z12567FACTURADO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12568ID_PASTA", Z12568ID_PASTA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12569ID_EMP_PAS", GXutil.rtrim( Z12569ID_EMP_PAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12570UNIDADES", GXutil.ltrim( localUtil.ntoc( Z12570UNIDADES, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12571TIPO_UNIDA", GXutil.rtrim( Z12571TIPO_UNIDA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12572METROS_P", GXutil.ltrim( localUtil.ntoc( Z12572METROS_P, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12573KILOS_P", GXutil.ltrim( localUtil.ntoc( Z12573KILOS_P, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttiaes", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTIAES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TBV_PRODUCCION_TIAES", "") ;
   }

   public void initializeNonKey1KM1734( )
   {
      A12540ID_EMPRESA = "" ;
      n12540ID_EMPRESA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12540ID_EMPRESA", A12540ID_EMPRESA);
      A12541FECHA = GXutil.nullDate() ;
      n12541FECHA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12541FECHA", localUtil.format(A12541FECHA, "99/99/99"));
      A12542ID_CLIENTE = 0 ;
      n12542ID_CLIENTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12542ID_CLIENTE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12542ID_CLIENTE), 6, 0));
      A12543ID_EMP_CLI = "" ;
      n12543ID_EMP_CLI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12543ID_EMP_CLI", A12543ID_EMP_CLI);
      A12544ID_EMP_ZON = "" ;
      n12544ID_EMP_ZON = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12544ID_EMP_ZON", A12544ID_EMP_ZON);
      A12545ID_MAQUINA = "" ;
      n12545ID_MAQUINA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12545ID_MAQUINA", A12545ID_MAQUINA);
      A12546ID_EMP_MAQ = "" ;
      n12546ID_EMP_MAQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12546ID_EMP_MAQ", A12546ID_EMP_MAQ);
      A12547ID_EMP_HDR = "" ;
      n12547ID_EMP_HDR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12547ID_EMP_HDR", A12547ID_EMP_HDR);
      A12548HOJA_DE_RU = "" ;
      n12548HOJA_DE_RU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12548HOJA_DE_RU", A12548HOJA_DE_RU);
      A12549TIPO = (short)(0) ;
      n12549TIPO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12549TIPO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12549TIPO), 4, 0));
      A12550ID_PROCESO = "" ;
      n12550ID_PROCESO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12550ID_PROCESO", A12550ID_PROCESO);
      A12551ID_EMP_PRO = "" ;
      n12551ID_EMP_PRO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12551ID_EMP_PRO", A12551ID_EMP_PRO);
      A12552ID_SECCION = "" ;
      n12552ID_SECCION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12552ID_SECCION", A12552ID_SECCION);
      A12553ID_EMP_SEC = "" ;
      n12553ID_EMP_SEC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12553ID_EMP_SEC", A12553ID_EMP_SEC);
      A12554ID_ANO_MES = "" ;
      n12554ID_ANO_MES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12554ID_ANO_MES", A12554ID_ANO_MES);
      A12555ID_EMP_ANO = "" ;
      n12555ID_EMP_ANO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12555ID_EMP_ANO", A12555ID_EMP_ANO);
      A12556ID_PARO = (short)(0) ;
      n12556ID_PARO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12556ID_PARO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12556ID_PARO), 4, 0));
      A12557ID_EMP_PAR = "" ;
      n12557ID_EMP_PAR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12557ID_EMP_PAR", A12557ID_EMP_PAR);
      A12558ID_COLORAN = (short)(0) ;
      n12558ID_COLORAN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12558ID_COLORAN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12558ID_COLORAN), 4, 0));
      A12559ID_EMP_COL = "" ;
      n12559ID_EMP_COL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12559ID_EMP_COL", A12559ID_EMP_COL);
      A12560ID_INTENSI = (short)(0) ;
      n12560ID_INTENSI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12560ID_INTENSI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12560ID_INTENSI), 4, 0));
      A12561ID_EMP_INT = "" ;
      n12561ID_EMP_INT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12561ID_EMP_INT", A12561ID_EMP_INT);
      A12562TIPO_PRODU = "" ;
      n12562TIPO_PRODU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12562TIPO_PRODU", A12562TIPO_PRODU);
      A12563ID_DEFECTO = (short)(0) ;
      n12563ID_DEFECTO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12563ID_DEFECTO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12563ID_DEFECTO), 4, 0));
      A12564ID_EMP_DEF = "" ;
      n12564ID_EMP_DEF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12564ID_EMP_DEF", A12564ID_EMP_DEF);
      A12565ID_RESPONS = (short)(0) ;
      n12565ID_RESPONS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12565ID_RESPONS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12565ID_RESPONS), 4, 0));
      A12566ID_EMP_RES = "" ;
      n12566ID_EMP_RES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12566ID_EMP_RES", A12566ID_EMP_RES);
      A12567FACTURADO = "" ;
      n12567FACTURADO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12567FACTURADO", A12567FACTURADO);
      A12568ID_PASTA = "" ;
      n12568ID_PASTA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12568ID_PASTA", A12568ID_PASTA);
      A12569ID_EMP_PAS = "" ;
      n12569ID_EMP_PAS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12569ID_EMP_PAS", A12569ID_EMP_PAS);
      A12570UNIDADES = DecimalUtil.ZERO ;
      n12570UNIDADES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12570UNIDADES", GXutil.ltrimstr( A12570UNIDADES, 9, 2));
      A12571TIPO_UNIDA = "" ;
      n12571TIPO_UNIDA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12571TIPO_UNIDA", A12571TIPO_UNIDA);
      A12572METROS_P = DecimalUtil.ZERO ;
      n12572METROS_P = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12572METROS_P", GXutil.ltrimstr( A12572METROS_P, 9, 2));
      A12573KILOS_P = DecimalUtil.ZERO ;
      n12573KILOS_P = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12573KILOS_P", GXutil.ltrimstr( A12573KILOS_P, 9, 2));
      Z12540ID_EMPRESA = "" ;
      Z12541FECHA = GXutil.nullDate() ;
      Z12542ID_CLIENTE = 0 ;
      Z12543ID_EMP_CLI = "" ;
      Z12544ID_EMP_ZON = "" ;
      Z12545ID_MAQUINA = "" ;
      Z12546ID_EMP_MAQ = "" ;
      Z12547ID_EMP_HDR = "" ;
      Z12548HOJA_DE_RU = "" ;
      Z12549TIPO = (short)(0) ;
      Z12550ID_PROCESO = "" ;
      Z12551ID_EMP_PRO = "" ;
      Z12552ID_SECCION = "" ;
      Z12553ID_EMP_SEC = "" ;
      Z12554ID_ANO_MES = "" ;
      Z12555ID_EMP_ANO = "" ;
      Z12556ID_PARO = (short)(0) ;
      Z12557ID_EMP_PAR = "" ;
      Z12558ID_COLORAN = (short)(0) ;
      Z12559ID_EMP_COL = "" ;
      Z12560ID_INTENSI = (short)(0) ;
      Z12561ID_EMP_INT = "" ;
      Z12562TIPO_PRODU = "" ;
      Z12563ID_DEFECTO = (short)(0) ;
      Z12564ID_EMP_DEF = "" ;
      Z12565ID_RESPONS = (short)(0) ;
      Z12566ID_EMP_RES = "" ;
      Z12567FACTURADO = "" ;
      Z12568ID_PASTA = "" ;
      Z12569ID_EMP_PAS = "" ;
      Z12570UNIDADES = DecimalUtil.ZERO ;
      Z12571TIPO_UNIDA = "" ;
      Z12572METROS_P = DecimalUtil.ZERO ;
      Z12573KILOS_P = DecimalUtil.ZERO ;
   }

   public void initAll1KM1734( )
   {
      A12574ID_TIAES = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12574ID_TIAES", A12574ID_TIAES);
      initializeNonKey1KM1734( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016332964", true, true);
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
      httpContext.AddJavascriptSource("ttiaes.js", "?202661016332965", false, true);
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
      edtID_TIAES_Internalname = "ID_TIAES" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtID_EMPRESA_Internalname = "ID_EMPRESA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtFECHA_Internalname = "FECHA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtID_CLIENTE_Internalname = "ID_CLIENTE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtID_EMP_CLI_Internalname = "ID_EMP_CLI" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtID_EMP_ZON_Internalname = "ID_EMP_ZON" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtID_MAQUINA_Internalname = "ID_MAQUINA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtID_EMP_MAQ_Internalname = "ID_EMP_MAQ" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtID_EMP_HDR_Internalname = "ID_EMP_HDR" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHOJA_DE_RU_Internalname = "HOJA_DE_RU" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTIPO_Internalname = "TIPO" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtID_PROCESO_Internalname = "ID_PROCESO" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtID_EMP_PRO_Internalname = "ID_EMP_PRO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtID_SECCION_Internalname = "ID_SECCION" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtID_EMP_SEC_Internalname = "ID_EMP_SEC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtID_ANO_MES_Internalname = "ID_ANO_MES" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtID_EMP_ANO_Internalname = "ID_EMP_ANO" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtID_PARO_Internalname = "ID_PARO" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtID_EMP_PAR_Internalname = "ID_EMP_PAR" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtID_COLORAN_Internalname = "ID_COLORAN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtID_EMP_COL_Internalname = "ID_EMP_COL" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtID_INTENSI_Internalname = "ID_INTENSI" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtID_EMP_INT_Internalname = "ID_EMP_INT" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTIPO_PRODU_Internalname = "TIPO_PRODU" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtID_DEFECTO_Internalname = "ID_DEFECTO" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtID_EMP_DEF_Internalname = "ID_EMP_DEF" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtID_RESPONS_Internalname = "ID_RESPONS" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtID_EMP_RES_Internalname = "ID_EMP_RES" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtFACTURADO_Internalname = "FACTURADO" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtID_PASTA_Internalname = "ID_PASTA" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtID_EMP_PAS_Internalname = "ID_EMP_PAS" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtUNIDADES_Internalname = "UNIDADES" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtTIPO_UNIDA_Internalname = "TIPO_UNIDA" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtMETROS_P_Internalname = "METROS_P" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtKILOS_P_Internalname = "KILOS_P" ;
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
      Form.setCaption( httpContext.getMessage( "TBV_PRODUCCION_TIAES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtKILOS_P_Jsonclick = "" ;
      edtKILOS_P_Backcolor = (int)(0xFFFFFF) ;
      edtKILOS_P_Enabled = 1 ;
      edtMETROS_P_Jsonclick = "" ;
      edtMETROS_P_Backcolor = (int)(0xFFFFFF) ;
      edtMETROS_P_Enabled = 1 ;
      edtTIPO_UNIDA_Jsonclick = "" ;
      edtTIPO_UNIDA_Backcolor = (int)(0xFFFFFF) ;
      edtTIPO_UNIDA_Enabled = 1 ;
      edtUNIDADES_Jsonclick = "" ;
      edtUNIDADES_Backcolor = (int)(0xFFFFFF) ;
      edtUNIDADES_Enabled = 1 ;
      edtID_EMP_PAS_Jsonclick = "" ;
      edtID_EMP_PAS_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_PAS_Enabled = 1 ;
      edtID_PASTA_Jsonclick = "" ;
      edtID_PASTA_Backcolor = (int)(0xFFFFFF) ;
      edtID_PASTA_Enabled = 1 ;
      edtFACTURADO_Jsonclick = "" ;
      edtFACTURADO_Backcolor = (int)(0xFFFFFF) ;
      edtFACTURADO_Enabled = 1 ;
      edtID_EMP_RES_Jsonclick = "" ;
      edtID_EMP_RES_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_RES_Enabled = 1 ;
      edtID_RESPONS_Jsonclick = "" ;
      edtID_RESPONS_Backcolor = (int)(0xFFFFFF) ;
      edtID_RESPONS_Enabled = 1 ;
      edtID_EMP_DEF_Jsonclick = "" ;
      edtID_EMP_DEF_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_DEF_Enabled = 1 ;
      edtID_DEFECTO_Jsonclick = "" ;
      edtID_DEFECTO_Backcolor = (int)(0xFFFFFF) ;
      edtID_DEFECTO_Enabled = 1 ;
      edtTIPO_PRODU_Jsonclick = "" ;
      edtTIPO_PRODU_Backcolor = (int)(0xFFFFFF) ;
      edtTIPO_PRODU_Enabled = 1 ;
      edtID_EMP_INT_Jsonclick = "" ;
      edtID_EMP_INT_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_INT_Enabled = 1 ;
      edtID_INTENSI_Jsonclick = "" ;
      edtID_INTENSI_Backcolor = (int)(0xFFFFFF) ;
      edtID_INTENSI_Enabled = 1 ;
      edtID_EMP_COL_Jsonclick = "" ;
      edtID_EMP_COL_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_COL_Enabled = 1 ;
      edtID_COLORAN_Jsonclick = "" ;
      edtID_COLORAN_Backcolor = (int)(0xFFFFFF) ;
      edtID_COLORAN_Enabled = 1 ;
      edtID_EMP_PAR_Jsonclick = "" ;
      edtID_EMP_PAR_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_PAR_Enabled = 1 ;
      edtID_PARO_Jsonclick = "" ;
      edtID_PARO_Backcolor = (int)(0xFFFFFF) ;
      edtID_PARO_Enabled = 1 ;
      edtID_EMP_ANO_Jsonclick = "" ;
      edtID_EMP_ANO_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_ANO_Enabled = 1 ;
      edtID_ANO_MES_Jsonclick = "" ;
      edtID_ANO_MES_Backcolor = (int)(0xFFFFFF) ;
      edtID_ANO_MES_Enabled = 1 ;
      edtID_EMP_SEC_Jsonclick = "" ;
      edtID_EMP_SEC_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_SEC_Enabled = 1 ;
      edtID_SECCION_Jsonclick = "" ;
      edtID_SECCION_Backcolor = (int)(0xFFFFFF) ;
      edtID_SECCION_Enabled = 1 ;
      edtID_EMP_PRO_Jsonclick = "" ;
      edtID_EMP_PRO_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_PRO_Enabled = 1 ;
      edtID_PROCESO_Jsonclick = "" ;
      edtID_PROCESO_Backcolor = (int)(0xFFFFFF) ;
      edtID_PROCESO_Enabled = 1 ;
      edtTIPO_Jsonclick = "" ;
      edtTIPO_Backcolor = (int)(0xFFFFFF) ;
      edtTIPO_Enabled = 1 ;
      edtHOJA_DE_RU_Jsonclick = "" ;
      edtHOJA_DE_RU_Backcolor = (int)(0xFFFFFF) ;
      edtHOJA_DE_RU_Enabled = 1 ;
      edtID_EMP_HDR_Jsonclick = "" ;
      edtID_EMP_HDR_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_HDR_Enabled = 1 ;
      edtID_EMP_MAQ_Jsonclick = "" ;
      edtID_EMP_MAQ_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_MAQ_Enabled = 1 ;
      edtID_MAQUINA_Jsonclick = "" ;
      edtID_MAQUINA_Backcolor = (int)(0xFFFFFF) ;
      edtID_MAQUINA_Enabled = 1 ;
      edtID_EMP_ZON_Jsonclick = "" ;
      edtID_EMP_ZON_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_ZON_Enabled = 1 ;
      edtID_EMP_CLI_Jsonclick = "" ;
      edtID_EMP_CLI_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMP_CLI_Enabled = 1 ;
      edtID_CLIENTE_Jsonclick = "" ;
      edtID_CLIENTE_Backcolor = (int)(0xFFFFFF) ;
      edtID_CLIENTE_Enabled = 1 ;
      edtFECHA_Jsonclick = "" ;
      edtFECHA_Backcolor = (int)(0xFFFFFF) ;
      edtFECHA_Enabled = 1 ;
      edtID_EMPRESA_Jsonclick = "" ;
      edtID_EMPRESA_Backcolor = (int)(0xFFFFFF) ;
      edtID_EMPRESA_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtID_TIAES_Backcolor = (int)(0xFFFFFF) ;
      edtID_TIAES_Enabled = 1 ;
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
      GX_FocusControl = edtID_EMPRESA_Internalname ;
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

   public void valid_Id_tiaes( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12540ID_EMPRESA", GXutil.rtrim( A12540ID_EMPRESA));
      httpContext.ajax_rsp_assign_attri("", false, "A12541FECHA", localUtil.format(A12541FECHA, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12542ID_CLIENTE", GXutil.ltrim( localUtil.ntoc( A12542ID_CLIENTE, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12543ID_EMP_CLI", A12543ID_EMP_CLI);
      httpContext.ajax_rsp_assign_attri("", false, "A12544ID_EMP_ZON", A12544ID_EMP_ZON);
      httpContext.ajax_rsp_assign_attri("", false, "A12545ID_MAQUINA", A12545ID_MAQUINA);
      httpContext.ajax_rsp_assign_attri("", false, "A12546ID_EMP_MAQ", A12546ID_EMP_MAQ);
      httpContext.ajax_rsp_assign_attri("", false, "A12547ID_EMP_HDR", A12547ID_EMP_HDR);
      httpContext.ajax_rsp_assign_attri("", false, "A12548HOJA_DE_RU", A12548HOJA_DE_RU);
      httpContext.ajax_rsp_assign_attri("", false, "A12549TIPO", GXutil.ltrim( localUtil.ntoc( A12549TIPO, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12550ID_PROCESO", A12550ID_PROCESO);
      httpContext.ajax_rsp_assign_attri("", false, "A12551ID_EMP_PRO", A12551ID_EMP_PRO);
      httpContext.ajax_rsp_assign_attri("", false, "A12552ID_SECCION", A12552ID_SECCION);
      httpContext.ajax_rsp_assign_attri("", false, "A12553ID_EMP_SEC", A12553ID_EMP_SEC);
      httpContext.ajax_rsp_assign_attri("", false, "A12554ID_ANO_MES", A12554ID_ANO_MES);
      httpContext.ajax_rsp_assign_attri("", false, "A12555ID_EMP_ANO", A12555ID_EMP_ANO);
      httpContext.ajax_rsp_assign_attri("", false, "A12556ID_PARO", GXutil.ltrim( localUtil.ntoc( A12556ID_PARO, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12557ID_EMP_PAR", A12557ID_EMP_PAR);
      httpContext.ajax_rsp_assign_attri("", false, "A12558ID_COLORAN", GXutil.ltrim( localUtil.ntoc( A12558ID_COLORAN, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12559ID_EMP_COL", A12559ID_EMP_COL);
      httpContext.ajax_rsp_assign_attri("", false, "A12560ID_INTENSI", GXutil.ltrim( localUtil.ntoc( A12560ID_INTENSI, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12561ID_EMP_INT", A12561ID_EMP_INT);
      httpContext.ajax_rsp_assign_attri("", false, "A12562TIPO_PRODU", A12562TIPO_PRODU);
      httpContext.ajax_rsp_assign_attri("", false, "A12563ID_DEFECTO", GXutil.ltrim( localUtil.ntoc( A12563ID_DEFECTO, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12564ID_EMP_DEF", A12564ID_EMP_DEF);
      httpContext.ajax_rsp_assign_attri("", false, "A12565ID_RESPONS", GXutil.ltrim( localUtil.ntoc( A12565ID_RESPONS, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12566ID_EMP_RES", A12566ID_EMP_RES);
      httpContext.ajax_rsp_assign_attri("", false, "A12567FACTURADO", GXutil.rtrim( A12567FACTURADO));
      httpContext.ajax_rsp_assign_attri("", false, "A12568ID_PASTA", A12568ID_PASTA);
      httpContext.ajax_rsp_assign_attri("", false, "A12569ID_EMP_PAS", GXutil.rtrim( A12569ID_EMP_PAS));
      httpContext.ajax_rsp_assign_attri("", false, "A12570UNIDADES", GXutil.ltrim( localUtil.ntoc( A12570UNIDADES, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12571TIPO_UNIDA", GXutil.rtrim( A12571TIPO_UNIDA));
      httpContext.ajax_rsp_assign_attri("", false, "A12572METROS_P", GXutil.ltrim( localUtil.ntoc( A12572METROS_P, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12573KILOS_P", GXutil.ltrim( localUtil.ntoc( A12573KILOS_P, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12574ID_TIAES", Z12574ID_TIAES);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12540ID_EMPRESA", GXutil.rtrim( Z12540ID_EMPRESA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12541FECHA", localUtil.format(Z12541FECHA, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12542ID_CLIENTE", GXutil.ltrim( localUtil.ntoc( Z12542ID_CLIENTE, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12543ID_EMP_CLI", Z12543ID_EMP_CLI);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12544ID_EMP_ZON", Z12544ID_EMP_ZON);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12545ID_MAQUINA", Z12545ID_MAQUINA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12546ID_EMP_MAQ", Z12546ID_EMP_MAQ);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12547ID_EMP_HDR", Z12547ID_EMP_HDR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12548HOJA_DE_RU", Z12548HOJA_DE_RU);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12549TIPO", GXutil.ltrim( localUtil.ntoc( Z12549TIPO, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12550ID_PROCESO", Z12550ID_PROCESO);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12551ID_EMP_PRO", Z12551ID_EMP_PRO);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12552ID_SECCION", Z12552ID_SECCION);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12553ID_EMP_SEC", Z12553ID_EMP_SEC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12554ID_ANO_MES", Z12554ID_ANO_MES);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12555ID_EMP_ANO", Z12555ID_EMP_ANO);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12556ID_PARO", GXutil.ltrim( localUtil.ntoc( Z12556ID_PARO, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12557ID_EMP_PAR", Z12557ID_EMP_PAR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12558ID_COLORAN", GXutil.ltrim( localUtil.ntoc( Z12558ID_COLORAN, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12559ID_EMP_COL", Z12559ID_EMP_COL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12560ID_INTENSI", GXutil.ltrim( localUtil.ntoc( Z12560ID_INTENSI, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12561ID_EMP_INT", Z12561ID_EMP_INT);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12562TIPO_PRODU", Z12562TIPO_PRODU);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12563ID_DEFECTO", GXutil.ltrim( localUtil.ntoc( Z12563ID_DEFECTO, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12564ID_EMP_DEF", Z12564ID_EMP_DEF);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12565ID_RESPONS", GXutil.ltrim( localUtil.ntoc( Z12565ID_RESPONS, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12566ID_EMP_RES", Z12566ID_EMP_RES);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12567FACTURADO", GXutil.rtrim( Z12567FACTURADO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12568ID_PASTA", Z12568ID_PASTA);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12569ID_EMP_PAS", GXutil.rtrim( Z12569ID_EMP_PAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12570UNIDADES", GXutil.ltrim( localUtil.ntoc( Z12570UNIDADES, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12571TIPO_UNIDA", GXutil.rtrim( Z12571TIPO_UNIDA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12572METROS_P", GXutil.ltrim( localUtil.ntoc( Z12572METROS_P, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12573KILOS_P", GXutil.ltrim( localUtil.ntoc( Z12573KILOS_P, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_ID_TIAES","{handler:'valid_Id_tiaes',iparms:[{av:'A12574ID_TIAES',fld:'ID_TIAES',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ID_TIAES",",oparms:[{av:'A12540ID_EMPRESA',fld:'ID_EMPRESA',pic:''},{av:'A12541FECHA',fld:'FECHA',pic:''},{av:'A12542ID_CLIENTE',fld:'ID_CLIENTE',pic:'ZZZZZ9'},{av:'A12543ID_EMP_CLI',fld:'ID_EMP_CLI',pic:''},{av:'A12544ID_EMP_ZON',fld:'ID_EMP_ZON',pic:''},{av:'A12545ID_MAQUINA',fld:'ID_MAQUINA',pic:''},{av:'A12546ID_EMP_MAQ',fld:'ID_EMP_MAQ',pic:''},{av:'A12547ID_EMP_HDR',fld:'ID_EMP_HDR',pic:''},{av:'A12548HOJA_DE_RU',fld:'HOJA_DE_RU',pic:''},{av:'A12549TIPO',fld:'TIPO',pic:'ZZZ9'},{av:'A12550ID_PROCESO',fld:'ID_PROCESO',pic:''},{av:'A12551ID_EMP_PRO',fld:'ID_EMP_PRO',pic:''},{av:'A12552ID_SECCION',fld:'ID_SECCION',pic:''},{av:'A12553ID_EMP_SEC',fld:'ID_EMP_SEC',pic:''},{av:'A12554ID_ANO_MES',fld:'ID_ANO_MES',pic:''},{av:'A12555ID_EMP_ANO',fld:'ID_EMP_ANO',pic:''},{av:'A12556ID_PARO',fld:'ID_PARO',pic:'ZZZ9'},{av:'A12557ID_EMP_PAR',fld:'ID_EMP_PAR',pic:''},{av:'A12558ID_COLORAN',fld:'ID_COLORAN',pic:'ZZZ9'},{av:'A12559ID_EMP_COL',fld:'ID_EMP_COL',pic:''},{av:'A12560ID_INTENSI',fld:'ID_INTENSI',pic:'ZZZ9'},{av:'A12561ID_EMP_INT',fld:'ID_EMP_INT',pic:''},{av:'A12562TIPO_PRODU',fld:'TIPO_PRODU',pic:''},{av:'A12563ID_DEFECTO',fld:'ID_DEFECTO',pic:'ZZZ9'},{av:'A12564ID_EMP_DEF',fld:'ID_EMP_DEF',pic:''},{av:'A12565ID_RESPONS',fld:'ID_RESPONS',pic:'ZZZ9'},{av:'A12566ID_EMP_RES',fld:'ID_EMP_RES',pic:''},{av:'A12567FACTURADO',fld:'FACTURADO',pic:''},{av:'A12568ID_PASTA',fld:'ID_PASTA',pic:''},{av:'A12569ID_EMP_PAS',fld:'ID_EMP_PAS',pic:''},{av:'A12570UNIDADES',fld:'UNIDADES',pic:'ZZZZZ9.99'},{av:'A12571TIPO_UNIDA',fld:'TIPO_UNIDA',pic:''},{av:'A12572METROS_P',fld:'METROS_P',pic:'ZZZZZ9.99'},{av:'A12573KILOS_P',fld:'KILOS_P',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12574ID_TIAES'},{av:'Z12540ID_EMPRESA'},{av:'Z12541FECHA'},{av:'Z12542ID_CLIENTE'},{av:'Z12543ID_EMP_CLI'},{av:'Z12544ID_EMP_ZON'},{av:'Z12545ID_MAQUINA'},{av:'Z12546ID_EMP_MAQ'},{av:'Z12547ID_EMP_HDR'},{av:'Z12548HOJA_DE_RU'},{av:'Z12549TIPO'},{av:'Z12550ID_PROCESO'},{av:'Z12551ID_EMP_PRO'},{av:'Z12552ID_SECCION'},{av:'Z12553ID_EMP_SEC'},{av:'Z12554ID_ANO_MES'},{av:'Z12555ID_EMP_ANO'},{av:'Z12556ID_PARO'},{av:'Z12557ID_EMP_PAR'},{av:'Z12558ID_COLORAN'},{av:'Z12559ID_EMP_COL'},{av:'Z12560ID_INTENSI'},{av:'Z12561ID_EMP_INT'},{av:'Z12562TIPO_PRODU'},{av:'Z12563ID_DEFECTO'},{av:'Z12564ID_EMP_DEF'},{av:'Z12565ID_RESPONS'},{av:'Z12566ID_EMP_RES'},{av:'Z12567FACTURADO'},{av:'Z12568ID_PASTA'},{av:'Z12569ID_EMP_PAS'},{av:'Z12570UNIDADES'},{av:'Z12571TIPO_UNIDA'},{av:'Z12572METROS_P'},{av:'Z12573KILOS_P'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z12574ID_TIAES = "" ;
      Z12540ID_EMPRESA = "" ;
      Z12541FECHA = GXutil.nullDate() ;
      Z12543ID_EMP_CLI = "" ;
      Z12544ID_EMP_ZON = "" ;
      Z12545ID_MAQUINA = "" ;
      Z12546ID_EMP_MAQ = "" ;
      Z12547ID_EMP_HDR = "" ;
      Z12548HOJA_DE_RU = "" ;
      Z12550ID_PROCESO = "" ;
      Z12551ID_EMP_PRO = "" ;
      Z12552ID_SECCION = "" ;
      Z12553ID_EMP_SEC = "" ;
      Z12554ID_ANO_MES = "" ;
      Z12555ID_EMP_ANO = "" ;
      Z12557ID_EMP_PAR = "" ;
      Z12559ID_EMP_COL = "" ;
      Z12561ID_EMP_INT = "" ;
      Z12562TIPO_PRODU = "" ;
      Z12564ID_EMP_DEF = "" ;
      Z12566ID_EMP_RES = "" ;
      Z12567FACTURADO = "" ;
      Z12568ID_PASTA = "" ;
      Z12569ID_EMP_PAS = "" ;
      Z12570UNIDADES = DecimalUtil.ZERO ;
      Z12571TIPO_UNIDA = "" ;
      Z12572METROS_P = DecimalUtil.ZERO ;
      Z12573KILOS_P = DecimalUtil.ZERO ;
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
      A12574ID_TIAES = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A12540ID_EMPRESA = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12541FECHA = GXutil.nullDate() ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12543ID_EMP_CLI = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12544ID_EMP_ZON = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12545ID_MAQUINA = "" ;
      lblTextblock8_Jsonclick = "" ;
      A12546ID_EMP_MAQ = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12547ID_EMP_HDR = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12548HOJA_DE_RU = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12550ID_PROCESO = "" ;
      lblTextblock13_Jsonclick = "" ;
      A12551ID_EMP_PRO = "" ;
      lblTextblock14_Jsonclick = "" ;
      A12552ID_SECCION = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12553ID_EMP_SEC = "" ;
      lblTextblock16_Jsonclick = "" ;
      A12554ID_ANO_MES = "" ;
      lblTextblock17_Jsonclick = "" ;
      A12555ID_EMP_ANO = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A12557ID_EMP_PAR = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A12559ID_EMP_COL = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A12561ID_EMP_INT = "" ;
      lblTextblock24_Jsonclick = "" ;
      A12562TIPO_PRODU = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A12564ID_EMP_DEF = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      A12566ID_EMP_RES = "" ;
      lblTextblock29_Jsonclick = "" ;
      A12567FACTURADO = "" ;
      lblTextblock30_Jsonclick = "" ;
      A12568ID_PASTA = "" ;
      lblTextblock31_Jsonclick = "" ;
      A12569ID_EMP_PAS = "" ;
      lblTextblock32_Jsonclick = "" ;
      A12570UNIDADES = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A12571TIPO_UNIDA = "" ;
      lblTextblock34_Jsonclick = "" ;
      A12572METROS_P = DecimalUtil.ZERO ;
      lblTextblock35_Jsonclick = "" ;
      A12573KILOS_P = DecimalUtil.ZERO ;
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
      T01KM4_A12574ID_TIAES = new String[] {""} ;
      T01KM4_A12540ID_EMPRESA = new String[] {""} ;
      T01KM4_n12540ID_EMPRESA = new boolean[] {false} ;
      T01KM4_A12541FECHA = new java.util.Date[] {GXutil.nullDate()} ;
      T01KM4_n12541FECHA = new boolean[] {false} ;
      T01KM4_A12542ID_CLIENTE = new int[1] ;
      T01KM4_n12542ID_CLIENTE = new boolean[] {false} ;
      T01KM4_A12543ID_EMP_CLI = new String[] {""} ;
      T01KM4_n12543ID_EMP_CLI = new boolean[] {false} ;
      T01KM4_A12544ID_EMP_ZON = new String[] {""} ;
      T01KM4_n12544ID_EMP_ZON = new boolean[] {false} ;
      T01KM4_A12545ID_MAQUINA = new String[] {""} ;
      T01KM4_n12545ID_MAQUINA = new boolean[] {false} ;
      T01KM4_A12546ID_EMP_MAQ = new String[] {""} ;
      T01KM4_n12546ID_EMP_MAQ = new boolean[] {false} ;
      T01KM4_A12547ID_EMP_HDR = new String[] {""} ;
      T01KM4_n12547ID_EMP_HDR = new boolean[] {false} ;
      T01KM4_A12548HOJA_DE_RU = new String[] {""} ;
      T01KM4_n12548HOJA_DE_RU = new boolean[] {false} ;
      T01KM4_A12549TIPO = new short[1] ;
      T01KM4_n12549TIPO = new boolean[] {false} ;
      T01KM4_A12550ID_PROCESO = new String[] {""} ;
      T01KM4_n12550ID_PROCESO = new boolean[] {false} ;
      T01KM4_A12551ID_EMP_PRO = new String[] {""} ;
      T01KM4_n12551ID_EMP_PRO = new boolean[] {false} ;
      T01KM4_A12552ID_SECCION = new String[] {""} ;
      T01KM4_n12552ID_SECCION = new boolean[] {false} ;
      T01KM4_A12553ID_EMP_SEC = new String[] {""} ;
      T01KM4_n12553ID_EMP_SEC = new boolean[] {false} ;
      T01KM4_A12554ID_ANO_MES = new String[] {""} ;
      T01KM4_n12554ID_ANO_MES = new boolean[] {false} ;
      T01KM4_A12555ID_EMP_ANO = new String[] {""} ;
      T01KM4_n12555ID_EMP_ANO = new boolean[] {false} ;
      T01KM4_A12556ID_PARO = new short[1] ;
      T01KM4_n12556ID_PARO = new boolean[] {false} ;
      T01KM4_A12557ID_EMP_PAR = new String[] {""} ;
      T01KM4_n12557ID_EMP_PAR = new boolean[] {false} ;
      T01KM4_A12558ID_COLORAN = new short[1] ;
      T01KM4_n12558ID_COLORAN = new boolean[] {false} ;
      T01KM4_A12559ID_EMP_COL = new String[] {""} ;
      T01KM4_n12559ID_EMP_COL = new boolean[] {false} ;
      T01KM4_A12560ID_INTENSI = new short[1] ;
      T01KM4_n12560ID_INTENSI = new boolean[] {false} ;
      T01KM4_A12561ID_EMP_INT = new String[] {""} ;
      T01KM4_n12561ID_EMP_INT = new boolean[] {false} ;
      T01KM4_A12562TIPO_PRODU = new String[] {""} ;
      T01KM4_n12562TIPO_PRODU = new boolean[] {false} ;
      T01KM4_A12563ID_DEFECTO = new short[1] ;
      T01KM4_n12563ID_DEFECTO = new boolean[] {false} ;
      T01KM4_A12564ID_EMP_DEF = new String[] {""} ;
      T01KM4_n12564ID_EMP_DEF = new boolean[] {false} ;
      T01KM4_A12565ID_RESPONS = new short[1] ;
      T01KM4_n12565ID_RESPONS = new boolean[] {false} ;
      T01KM4_A12566ID_EMP_RES = new String[] {""} ;
      T01KM4_n12566ID_EMP_RES = new boolean[] {false} ;
      T01KM4_A12567FACTURADO = new String[] {""} ;
      T01KM4_n12567FACTURADO = new boolean[] {false} ;
      T01KM4_A12568ID_PASTA = new String[] {""} ;
      T01KM4_n12568ID_PASTA = new boolean[] {false} ;
      T01KM4_A12569ID_EMP_PAS = new String[] {""} ;
      T01KM4_n12569ID_EMP_PAS = new boolean[] {false} ;
      T01KM4_A12570UNIDADES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM4_n12570UNIDADES = new boolean[] {false} ;
      T01KM4_A12571TIPO_UNIDA = new String[] {""} ;
      T01KM4_n12571TIPO_UNIDA = new boolean[] {false} ;
      T01KM4_A12572METROS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM4_n12572METROS_P = new boolean[] {false} ;
      T01KM4_A12573KILOS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM4_n12573KILOS_P = new boolean[] {false} ;
      T01KM5_A12574ID_TIAES = new String[] {""} ;
      T01KM3_A12574ID_TIAES = new String[] {""} ;
      T01KM3_A12540ID_EMPRESA = new String[] {""} ;
      T01KM3_n12540ID_EMPRESA = new boolean[] {false} ;
      T01KM3_A12541FECHA = new java.util.Date[] {GXutil.nullDate()} ;
      T01KM3_n12541FECHA = new boolean[] {false} ;
      T01KM3_A12542ID_CLIENTE = new int[1] ;
      T01KM3_n12542ID_CLIENTE = new boolean[] {false} ;
      T01KM3_A12543ID_EMP_CLI = new String[] {""} ;
      T01KM3_n12543ID_EMP_CLI = new boolean[] {false} ;
      T01KM3_A12544ID_EMP_ZON = new String[] {""} ;
      T01KM3_n12544ID_EMP_ZON = new boolean[] {false} ;
      T01KM3_A12545ID_MAQUINA = new String[] {""} ;
      T01KM3_n12545ID_MAQUINA = new boolean[] {false} ;
      T01KM3_A12546ID_EMP_MAQ = new String[] {""} ;
      T01KM3_n12546ID_EMP_MAQ = new boolean[] {false} ;
      T01KM3_A12547ID_EMP_HDR = new String[] {""} ;
      T01KM3_n12547ID_EMP_HDR = new boolean[] {false} ;
      T01KM3_A12548HOJA_DE_RU = new String[] {""} ;
      T01KM3_n12548HOJA_DE_RU = new boolean[] {false} ;
      T01KM3_A12549TIPO = new short[1] ;
      T01KM3_n12549TIPO = new boolean[] {false} ;
      T01KM3_A12550ID_PROCESO = new String[] {""} ;
      T01KM3_n12550ID_PROCESO = new boolean[] {false} ;
      T01KM3_A12551ID_EMP_PRO = new String[] {""} ;
      T01KM3_n12551ID_EMP_PRO = new boolean[] {false} ;
      T01KM3_A12552ID_SECCION = new String[] {""} ;
      T01KM3_n12552ID_SECCION = new boolean[] {false} ;
      T01KM3_A12553ID_EMP_SEC = new String[] {""} ;
      T01KM3_n12553ID_EMP_SEC = new boolean[] {false} ;
      T01KM3_A12554ID_ANO_MES = new String[] {""} ;
      T01KM3_n12554ID_ANO_MES = new boolean[] {false} ;
      T01KM3_A12555ID_EMP_ANO = new String[] {""} ;
      T01KM3_n12555ID_EMP_ANO = new boolean[] {false} ;
      T01KM3_A12556ID_PARO = new short[1] ;
      T01KM3_n12556ID_PARO = new boolean[] {false} ;
      T01KM3_A12557ID_EMP_PAR = new String[] {""} ;
      T01KM3_n12557ID_EMP_PAR = new boolean[] {false} ;
      T01KM3_A12558ID_COLORAN = new short[1] ;
      T01KM3_n12558ID_COLORAN = new boolean[] {false} ;
      T01KM3_A12559ID_EMP_COL = new String[] {""} ;
      T01KM3_n12559ID_EMP_COL = new boolean[] {false} ;
      T01KM3_A12560ID_INTENSI = new short[1] ;
      T01KM3_n12560ID_INTENSI = new boolean[] {false} ;
      T01KM3_A12561ID_EMP_INT = new String[] {""} ;
      T01KM3_n12561ID_EMP_INT = new boolean[] {false} ;
      T01KM3_A12562TIPO_PRODU = new String[] {""} ;
      T01KM3_n12562TIPO_PRODU = new boolean[] {false} ;
      T01KM3_A12563ID_DEFECTO = new short[1] ;
      T01KM3_n12563ID_DEFECTO = new boolean[] {false} ;
      T01KM3_A12564ID_EMP_DEF = new String[] {""} ;
      T01KM3_n12564ID_EMP_DEF = new boolean[] {false} ;
      T01KM3_A12565ID_RESPONS = new short[1] ;
      T01KM3_n12565ID_RESPONS = new boolean[] {false} ;
      T01KM3_A12566ID_EMP_RES = new String[] {""} ;
      T01KM3_n12566ID_EMP_RES = new boolean[] {false} ;
      T01KM3_A12567FACTURADO = new String[] {""} ;
      T01KM3_n12567FACTURADO = new boolean[] {false} ;
      T01KM3_A12568ID_PASTA = new String[] {""} ;
      T01KM3_n12568ID_PASTA = new boolean[] {false} ;
      T01KM3_A12569ID_EMP_PAS = new String[] {""} ;
      T01KM3_n12569ID_EMP_PAS = new boolean[] {false} ;
      T01KM3_A12570UNIDADES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM3_n12570UNIDADES = new boolean[] {false} ;
      T01KM3_A12571TIPO_UNIDA = new String[] {""} ;
      T01KM3_n12571TIPO_UNIDA = new boolean[] {false} ;
      T01KM3_A12572METROS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM3_n12572METROS_P = new boolean[] {false} ;
      T01KM3_A12573KILOS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM3_n12573KILOS_P = new boolean[] {false} ;
      sMode1734 = "" ;
      T01KM6_A12574ID_TIAES = new String[] {""} ;
      T01KM7_A12574ID_TIAES = new String[] {""} ;
      T01KM2_A12574ID_TIAES = new String[] {""} ;
      T01KM2_A12540ID_EMPRESA = new String[] {""} ;
      T01KM2_n12540ID_EMPRESA = new boolean[] {false} ;
      T01KM2_A12541FECHA = new java.util.Date[] {GXutil.nullDate()} ;
      T01KM2_n12541FECHA = new boolean[] {false} ;
      T01KM2_A12542ID_CLIENTE = new int[1] ;
      T01KM2_n12542ID_CLIENTE = new boolean[] {false} ;
      T01KM2_A12543ID_EMP_CLI = new String[] {""} ;
      T01KM2_n12543ID_EMP_CLI = new boolean[] {false} ;
      T01KM2_A12544ID_EMP_ZON = new String[] {""} ;
      T01KM2_n12544ID_EMP_ZON = new boolean[] {false} ;
      T01KM2_A12545ID_MAQUINA = new String[] {""} ;
      T01KM2_n12545ID_MAQUINA = new boolean[] {false} ;
      T01KM2_A12546ID_EMP_MAQ = new String[] {""} ;
      T01KM2_n12546ID_EMP_MAQ = new boolean[] {false} ;
      T01KM2_A12547ID_EMP_HDR = new String[] {""} ;
      T01KM2_n12547ID_EMP_HDR = new boolean[] {false} ;
      T01KM2_A12548HOJA_DE_RU = new String[] {""} ;
      T01KM2_n12548HOJA_DE_RU = new boolean[] {false} ;
      T01KM2_A12549TIPO = new short[1] ;
      T01KM2_n12549TIPO = new boolean[] {false} ;
      T01KM2_A12550ID_PROCESO = new String[] {""} ;
      T01KM2_n12550ID_PROCESO = new boolean[] {false} ;
      T01KM2_A12551ID_EMP_PRO = new String[] {""} ;
      T01KM2_n12551ID_EMP_PRO = new boolean[] {false} ;
      T01KM2_A12552ID_SECCION = new String[] {""} ;
      T01KM2_n12552ID_SECCION = new boolean[] {false} ;
      T01KM2_A12553ID_EMP_SEC = new String[] {""} ;
      T01KM2_n12553ID_EMP_SEC = new boolean[] {false} ;
      T01KM2_A12554ID_ANO_MES = new String[] {""} ;
      T01KM2_n12554ID_ANO_MES = new boolean[] {false} ;
      T01KM2_A12555ID_EMP_ANO = new String[] {""} ;
      T01KM2_n12555ID_EMP_ANO = new boolean[] {false} ;
      T01KM2_A12556ID_PARO = new short[1] ;
      T01KM2_n12556ID_PARO = new boolean[] {false} ;
      T01KM2_A12557ID_EMP_PAR = new String[] {""} ;
      T01KM2_n12557ID_EMP_PAR = new boolean[] {false} ;
      T01KM2_A12558ID_COLORAN = new short[1] ;
      T01KM2_n12558ID_COLORAN = new boolean[] {false} ;
      T01KM2_A12559ID_EMP_COL = new String[] {""} ;
      T01KM2_n12559ID_EMP_COL = new boolean[] {false} ;
      T01KM2_A12560ID_INTENSI = new short[1] ;
      T01KM2_n12560ID_INTENSI = new boolean[] {false} ;
      T01KM2_A12561ID_EMP_INT = new String[] {""} ;
      T01KM2_n12561ID_EMP_INT = new boolean[] {false} ;
      T01KM2_A12562TIPO_PRODU = new String[] {""} ;
      T01KM2_n12562TIPO_PRODU = new boolean[] {false} ;
      T01KM2_A12563ID_DEFECTO = new short[1] ;
      T01KM2_n12563ID_DEFECTO = new boolean[] {false} ;
      T01KM2_A12564ID_EMP_DEF = new String[] {""} ;
      T01KM2_n12564ID_EMP_DEF = new boolean[] {false} ;
      T01KM2_A12565ID_RESPONS = new short[1] ;
      T01KM2_n12565ID_RESPONS = new boolean[] {false} ;
      T01KM2_A12566ID_EMP_RES = new String[] {""} ;
      T01KM2_n12566ID_EMP_RES = new boolean[] {false} ;
      T01KM2_A12567FACTURADO = new String[] {""} ;
      T01KM2_n12567FACTURADO = new boolean[] {false} ;
      T01KM2_A12568ID_PASTA = new String[] {""} ;
      T01KM2_n12568ID_PASTA = new boolean[] {false} ;
      T01KM2_A12569ID_EMP_PAS = new String[] {""} ;
      T01KM2_n12569ID_EMP_PAS = new boolean[] {false} ;
      T01KM2_A12570UNIDADES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM2_n12570UNIDADES = new boolean[] {false} ;
      T01KM2_A12571TIPO_UNIDA = new String[] {""} ;
      T01KM2_n12571TIPO_UNIDA = new boolean[] {false} ;
      T01KM2_A12572METROS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM2_n12572METROS_P = new boolean[] {false} ;
      T01KM2_A12573KILOS_P = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KM2_n12573KILOS_P = new boolean[] {false} ;
      T01KM11_A12574ID_TIAES = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ12574ID_TIAES = "" ;
      ZZ12540ID_EMPRESA = "" ;
      ZZ12541FECHA = GXutil.nullDate() ;
      ZZ12543ID_EMP_CLI = "" ;
      ZZ12544ID_EMP_ZON = "" ;
      ZZ12545ID_MAQUINA = "" ;
      ZZ12546ID_EMP_MAQ = "" ;
      ZZ12547ID_EMP_HDR = "" ;
      ZZ12548HOJA_DE_RU = "" ;
      ZZ12550ID_PROCESO = "" ;
      ZZ12551ID_EMP_PRO = "" ;
      ZZ12552ID_SECCION = "" ;
      ZZ12553ID_EMP_SEC = "" ;
      ZZ12554ID_ANO_MES = "" ;
      ZZ12555ID_EMP_ANO = "" ;
      ZZ12557ID_EMP_PAR = "" ;
      ZZ12559ID_EMP_COL = "" ;
      ZZ12561ID_EMP_INT = "" ;
      ZZ12562TIPO_PRODU = "" ;
      ZZ12564ID_EMP_DEF = "" ;
      ZZ12566ID_EMP_RES = "" ;
      ZZ12567FACTURADO = "" ;
      ZZ12568ID_PASTA = "" ;
      ZZ12569ID_EMP_PAS = "" ;
      ZZ12570UNIDADES = DecimalUtil.ZERO ;
      ZZ12571TIPO_UNIDA = "" ;
      ZZ12572METROS_P = DecimalUtil.ZERO ;
      ZZ12573KILOS_P = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttiaes__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttiaes__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttiaes__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttiaes__default(),
         new Object[] {
             new Object[] {
            T01KM2_A12574ID_TIAES, T01KM2_A12540ID_EMPRESA, T01KM2_n12540ID_EMPRESA, T01KM2_A12541FECHA, T01KM2_n12541FECHA, T01KM2_A12542ID_CLIENTE, T01KM2_n12542ID_CLIENTE, T01KM2_A12543ID_EMP_CLI, T01KM2_n12543ID_EMP_CLI, T01KM2_A12544ID_EMP_ZON,
            T01KM2_n12544ID_EMP_ZON, T01KM2_A12545ID_MAQUINA, T01KM2_n12545ID_MAQUINA, T01KM2_A12546ID_EMP_MAQ, T01KM2_n12546ID_EMP_MAQ, T01KM2_A12547ID_EMP_HDR, T01KM2_n12547ID_EMP_HDR, T01KM2_A12548HOJA_DE_RU, T01KM2_n12548HOJA_DE_RU, T01KM2_A12549TIPO,
            T01KM2_n12549TIPO, T01KM2_A12550ID_PROCESO, T01KM2_n12550ID_PROCESO, T01KM2_A12551ID_EMP_PRO, T01KM2_n12551ID_EMP_PRO, T01KM2_A12552ID_SECCION, T01KM2_n12552ID_SECCION, T01KM2_A12553ID_EMP_SEC, T01KM2_n12553ID_EMP_SEC, T01KM2_A12554ID_ANO_MES,
            T01KM2_n12554ID_ANO_MES, T01KM2_A12555ID_EMP_ANO, T01KM2_n12555ID_EMP_ANO, T01KM2_A12556ID_PARO, T01KM2_n12556ID_PARO, T01KM2_A12557ID_EMP_PAR, T01KM2_n12557ID_EMP_PAR, T01KM2_A12558ID_COLORAN, T01KM2_n12558ID_COLORAN, T01KM2_A12559ID_EMP_COL,
            T01KM2_n12559ID_EMP_COL, T01KM2_A12560ID_INTENSI, T01KM2_n12560ID_INTENSI, T01KM2_A12561ID_EMP_INT, T01KM2_n12561ID_EMP_INT, T01KM2_A12562TIPO_PRODU, T01KM2_n12562TIPO_PRODU, T01KM2_A12563ID_DEFECTO, T01KM2_n12563ID_DEFECTO, T01KM2_A12564ID_EMP_DEF,
            T01KM2_n12564ID_EMP_DEF, T01KM2_A12565ID_RESPONS, T01KM2_n12565ID_RESPONS, T01KM2_A12566ID_EMP_RES, T01KM2_n12566ID_EMP_RES, T01KM2_A12567FACTURADO, T01KM2_n12567FACTURADO, T01KM2_A12568ID_PASTA, T01KM2_n12568ID_PASTA, T01KM2_A12569ID_EMP_PAS,
            T01KM2_n12569ID_EMP_PAS, T01KM2_A12570UNIDADES, T01KM2_n12570UNIDADES, T01KM2_A12571TIPO_UNIDA, T01KM2_n12571TIPO_UNIDA, T01KM2_A12572METROS_P, T01KM2_n12572METROS_P, T01KM2_A12573KILOS_P, T01KM2_n12573KILOS_P
            }
            , new Object[] {
            T01KM3_A12574ID_TIAES, T01KM3_A12540ID_EMPRESA, T01KM3_n12540ID_EMPRESA, T01KM3_A12541FECHA, T01KM3_n12541FECHA, T01KM3_A12542ID_CLIENTE, T01KM3_n12542ID_CLIENTE, T01KM3_A12543ID_EMP_CLI, T01KM3_n12543ID_EMP_CLI, T01KM3_A12544ID_EMP_ZON,
            T01KM3_n12544ID_EMP_ZON, T01KM3_A12545ID_MAQUINA, T01KM3_n12545ID_MAQUINA, T01KM3_A12546ID_EMP_MAQ, T01KM3_n12546ID_EMP_MAQ, T01KM3_A12547ID_EMP_HDR, T01KM3_n12547ID_EMP_HDR, T01KM3_A12548HOJA_DE_RU, T01KM3_n12548HOJA_DE_RU, T01KM3_A12549TIPO,
            T01KM3_n12549TIPO, T01KM3_A12550ID_PROCESO, T01KM3_n12550ID_PROCESO, T01KM3_A12551ID_EMP_PRO, T01KM3_n12551ID_EMP_PRO, T01KM3_A12552ID_SECCION, T01KM3_n12552ID_SECCION, T01KM3_A12553ID_EMP_SEC, T01KM3_n12553ID_EMP_SEC, T01KM3_A12554ID_ANO_MES,
            T01KM3_n12554ID_ANO_MES, T01KM3_A12555ID_EMP_ANO, T01KM3_n12555ID_EMP_ANO, T01KM3_A12556ID_PARO, T01KM3_n12556ID_PARO, T01KM3_A12557ID_EMP_PAR, T01KM3_n12557ID_EMP_PAR, T01KM3_A12558ID_COLORAN, T01KM3_n12558ID_COLORAN, T01KM3_A12559ID_EMP_COL,
            T01KM3_n12559ID_EMP_COL, T01KM3_A12560ID_INTENSI, T01KM3_n12560ID_INTENSI, T01KM3_A12561ID_EMP_INT, T01KM3_n12561ID_EMP_INT, T01KM3_A12562TIPO_PRODU, T01KM3_n12562TIPO_PRODU, T01KM3_A12563ID_DEFECTO, T01KM3_n12563ID_DEFECTO, T01KM3_A12564ID_EMP_DEF,
            T01KM3_n12564ID_EMP_DEF, T01KM3_A12565ID_RESPONS, T01KM3_n12565ID_RESPONS, T01KM3_A12566ID_EMP_RES, T01KM3_n12566ID_EMP_RES, T01KM3_A12567FACTURADO, T01KM3_n12567FACTURADO, T01KM3_A12568ID_PASTA, T01KM3_n12568ID_PASTA, T01KM3_A12569ID_EMP_PAS,
            T01KM3_n12569ID_EMP_PAS, T01KM3_A12570UNIDADES, T01KM3_n12570UNIDADES, T01KM3_A12571TIPO_UNIDA, T01KM3_n12571TIPO_UNIDA, T01KM3_A12572METROS_P, T01KM3_n12572METROS_P, T01KM3_A12573KILOS_P, T01KM3_n12573KILOS_P
            }
            , new Object[] {
            T01KM4_A12574ID_TIAES, T01KM4_A12540ID_EMPRESA, T01KM4_n12540ID_EMPRESA, T01KM4_A12541FECHA, T01KM4_n12541FECHA, T01KM4_A12542ID_CLIENTE, T01KM4_n12542ID_CLIENTE, T01KM4_A12543ID_EMP_CLI, T01KM4_n12543ID_EMP_CLI, T01KM4_A12544ID_EMP_ZON,
            T01KM4_n12544ID_EMP_ZON, T01KM4_A12545ID_MAQUINA, T01KM4_n12545ID_MAQUINA, T01KM4_A12546ID_EMP_MAQ, T01KM4_n12546ID_EMP_MAQ, T01KM4_A12547ID_EMP_HDR, T01KM4_n12547ID_EMP_HDR, T01KM4_A12548HOJA_DE_RU, T01KM4_n12548HOJA_DE_RU, T01KM4_A12549TIPO,
            T01KM4_n12549TIPO, T01KM4_A12550ID_PROCESO, T01KM4_n12550ID_PROCESO, T01KM4_A12551ID_EMP_PRO, T01KM4_n12551ID_EMP_PRO, T01KM4_A12552ID_SECCION, T01KM4_n12552ID_SECCION, T01KM4_A12553ID_EMP_SEC, T01KM4_n12553ID_EMP_SEC, T01KM4_A12554ID_ANO_MES,
            T01KM4_n12554ID_ANO_MES, T01KM4_A12555ID_EMP_ANO, T01KM4_n12555ID_EMP_ANO, T01KM4_A12556ID_PARO, T01KM4_n12556ID_PARO, T01KM4_A12557ID_EMP_PAR, T01KM4_n12557ID_EMP_PAR, T01KM4_A12558ID_COLORAN, T01KM4_n12558ID_COLORAN, T01KM4_A12559ID_EMP_COL,
            T01KM4_n12559ID_EMP_COL, T01KM4_A12560ID_INTENSI, T01KM4_n12560ID_INTENSI, T01KM4_A12561ID_EMP_INT, T01KM4_n12561ID_EMP_INT, T01KM4_A12562TIPO_PRODU, T01KM4_n12562TIPO_PRODU, T01KM4_A12563ID_DEFECTO, T01KM4_n12563ID_DEFECTO, T01KM4_A12564ID_EMP_DEF,
            T01KM4_n12564ID_EMP_DEF, T01KM4_A12565ID_RESPONS, T01KM4_n12565ID_RESPONS, T01KM4_A12566ID_EMP_RES, T01KM4_n12566ID_EMP_RES, T01KM4_A12567FACTURADO, T01KM4_n12567FACTURADO, T01KM4_A12568ID_PASTA, T01KM4_n12568ID_PASTA, T01KM4_A12569ID_EMP_PAS,
            T01KM4_n12569ID_EMP_PAS, T01KM4_A12570UNIDADES, T01KM4_n12570UNIDADES, T01KM4_A12571TIPO_UNIDA, T01KM4_n12571TIPO_UNIDA, T01KM4_A12572METROS_P, T01KM4_n12572METROS_P, T01KM4_A12573KILOS_P, T01KM4_n12573KILOS_P
            }
            , new Object[] {
            T01KM5_A12574ID_TIAES
            }
            , new Object[] {
            T01KM6_A12574ID_TIAES
            }
            , new Object[] {
            T01KM7_A12574ID_TIAES
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KM11_A12574ID_TIAES
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z12549TIPO ;
   private short Z12556ID_PARO ;
   private short Z12558ID_COLORAN ;
   private short Z12560ID_INTENSI ;
   private short Z12563ID_DEFECTO ;
   private short Z12565ID_RESPONS ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12549TIPO ;
   private short A12556ID_PARO ;
   private short A12558ID_COLORAN ;
   private short A12560ID_INTENSI ;
   private short A12563ID_DEFECTO ;
   private short A12565ID_RESPONS ;
   private short RcdFound1734 ;
   private short nIsDirty_1734 ;
   private short ZZ12549TIPO ;
   private short ZZ12556ID_PARO ;
   private short ZZ12558ID_COLORAN ;
   private short ZZ12560ID_INTENSI ;
   private short ZZ12563ID_DEFECTO ;
   private short ZZ12565ID_RESPONS ;
   private int Z12542ID_CLIENTE ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtID_TIAES_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtID_EMPRESA_Enabled ;
   private int edtFECHA_Enabled ;
   private int A12542ID_CLIENTE ;
   private int edtID_CLIENTE_Enabled ;
   private int edtID_EMP_CLI_Enabled ;
   private int edtID_EMP_ZON_Enabled ;
   private int edtID_MAQUINA_Enabled ;
   private int edtID_EMP_MAQ_Enabled ;
   private int edtID_EMP_HDR_Enabled ;
   private int edtHOJA_DE_RU_Enabled ;
   private int edtTIPO_Enabled ;
   private int edtID_PROCESO_Enabled ;
   private int edtID_EMP_PRO_Enabled ;
   private int edtID_SECCION_Enabled ;
   private int edtID_EMP_SEC_Enabled ;
   private int edtID_ANO_MES_Enabled ;
   private int edtID_EMP_ANO_Enabled ;
   private int edtID_PARO_Enabled ;
   private int edtID_EMP_PAR_Enabled ;
   private int edtID_COLORAN_Enabled ;
   private int edtID_EMP_COL_Enabled ;
   private int edtID_INTENSI_Enabled ;
   private int edtID_EMP_INT_Enabled ;
   private int edtTIPO_PRODU_Enabled ;
   private int edtID_DEFECTO_Enabled ;
   private int edtID_EMP_DEF_Enabled ;
   private int edtID_RESPONS_Enabled ;
   private int edtID_EMP_RES_Enabled ;
   private int edtFACTURADO_Enabled ;
   private int edtID_PASTA_Enabled ;
   private int edtID_EMP_PAS_Enabled ;
   private int edtUNIDADES_Enabled ;
   private int edtTIPO_UNIDA_Enabled ;
   private int edtMETROS_P_Enabled ;
   private int edtKILOS_P_Enabled ;
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
   private int edtKILOS_P_Backcolor ;
   private int edtMETROS_P_Backcolor ;
   private int edtTIPO_UNIDA_Backcolor ;
   private int edtUNIDADES_Backcolor ;
   private int edtID_EMP_PAS_Backcolor ;
   private int edtID_PASTA_Backcolor ;
   private int edtFACTURADO_Backcolor ;
   private int edtID_EMP_RES_Backcolor ;
   private int edtID_RESPONS_Backcolor ;
   private int edtID_EMP_DEF_Backcolor ;
   private int edtID_DEFECTO_Backcolor ;
   private int edtTIPO_PRODU_Backcolor ;
   private int edtID_EMP_INT_Backcolor ;
   private int edtID_INTENSI_Backcolor ;
   private int edtID_EMP_COL_Backcolor ;
   private int edtID_COLORAN_Backcolor ;
   private int edtID_EMP_PAR_Backcolor ;
   private int edtID_PARO_Backcolor ;
   private int edtID_EMP_ANO_Backcolor ;
   private int edtID_ANO_MES_Backcolor ;
   private int edtID_EMP_SEC_Backcolor ;
   private int edtID_SECCION_Backcolor ;
   private int edtID_EMP_PRO_Backcolor ;
   private int edtID_PROCESO_Backcolor ;
   private int edtTIPO_Backcolor ;
   private int edtHOJA_DE_RU_Backcolor ;
   private int edtID_EMP_HDR_Backcolor ;
   private int edtID_EMP_MAQ_Backcolor ;
   private int edtID_MAQUINA_Backcolor ;
   private int edtID_EMP_ZON_Backcolor ;
   private int edtID_EMP_CLI_Backcolor ;
   private int edtID_CLIENTE_Backcolor ;
   private int edtFECHA_Backcolor ;
   private int edtID_EMPRESA_Backcolor ;
   private int edtID_TIAES_Backcolor ;
   private int ZZ12542ID_CLIENTE ;
   private java.math.BigDecimal Z12570UNIDADES ;
   private java.math.BigDecimal Z12572METROS_P ;
   private java.math.BigDecimal Z12573KILOS_P ;
   private java.math.BigDecimal A12570UNIDADES ;
   private java.math.BigDecimal A12572METROS_P ;
   private java.math.BigDecimal A12573KILOS_P ;
   private java.math.BigDecimal ZZ12570UNIDADES ;
   private java.math.BigDecimal ZZ12572METROS_P ;
   private java.math.BigDecimal ZZ12573KILOS_P ;
   private String sPrefix ;
   private String Z12540ID_EMPRESA ;
   private String Z12567FACTURADO ;
   private String Z12569ID_EMP_PAS ;
   private String Z12571TIPO_UNIDA ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtID_TIAES_Internalname ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtID_EMPRESA_Internalname ;
   private String A12540ID_EMPRESA ;
   private String edtID_EMPRESA_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtFECHA_Internalname ;
   private String edtFECHA_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtID_CLIENTE_Internalname ;
   private String edtID_CLIENTE_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtID_EMP_CLI_Internalname ;
   private String edtID_EMP_CLI_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtID_EMP_ZON_Internalname ;
   private String edtID_EMP_ZON_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtID_MAQUINA_Internalname ;
   private String edtID_MAQUINA_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtID_EMP_MAQ_Internalname ;
   private String edtID_EMP_MAQ_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtID_EMP_HDR_Internalname ;
   private String edtID_EMP_HDR_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHOJA_DE_RU_Internalname ;
   private String edtHOJA_DE_RU_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTIPO_Internalname ;
   private String edtTIPO_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtID_PROCESO_Internalname ;
   private String edtID_PROCESO_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtID_EMP_PRO_Internalname ;
   private String edtID_EMP_PRO_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtID_SECCION_Internalname ;
   private String edtID_SECCION_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtID_EMP_SEC_Internalname ;
   private String edtID_EMP_SEC_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtID_ANO_MES_Internalname ;
   private String edtID_ANO_MES_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtID_EMP_ANO_Internalname ;
   private String edtID_EMP_ANO_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtID_PARO_Internalname ;
   private String edtID_PARO_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtID_EMP_PAR_Internalname ;
   private String edtID_EMP_PAR_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtID_COLORAN_Internalname ;
   private String edtID_COLORAN_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtID_EMP_COL_Internalname ;
   private String edtID_EMP_COL_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtID_INTENSI_Internalname ;
   private String edtID_INTENSI_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtID_EMP_INT_Internalname ;
   private String edtID_EMP_INT_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTIPO_PRODU_Internalname ;
   private String edtTIPO_PRODU_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtID_DEFECTO_Internalname ;
   private String edtID_DEFECTO_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtID_EMP_DEF_Internalname ;
   private String edtID_EMP_DEF_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtID_RESPONS_Internalname ;
   private String edtID_RESPONS_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtID_EMP_RES_Internalname ;
   private String edtID_EMP_RES_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtFACTURADO_Internalname ;
   private String A12567FACTURADO ;
   private String edtFACTURADO_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtID_PASTA_Internalname ;
   private String edtID_PASTA_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtID_EMP_PAS_Internalname ;
   private String A12569ID_EMP_PAS ;
   private String edtID_EMP_PAS_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtUNIDADES_Internalname ;
   private String edtUNIDADES_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtTIPO_UNIDA_Internalname ;
   private String A12571TIPO_UNIDA ;
   private String edtTIPO_UNIDA_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtMETROS_P_Internalname ;
   private String edtMETROS_P_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtKILOS_P_Internalname ;
   private String edtKILOS_P_Jsonclick ;
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
   private String sMode1734 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ12540ID_EMPRESA ;
   private String ZZ12567FACTURADO ;
   private String ZZ12569ID_EMP_PAS ;
   private String ZZ12571TIPO_UNIDA ;
   private java.util.Date Z12541FECHA ;
   private java.util.Date A12541FECHA ;
   private java.util.Date ZZ12541FECHA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12540ID_EMPRESA ;
   private boolean n12541FECHA ;
   private boolean n12542ID_CLIENTE ;
   private boolean n12543ID_EMP_CLI ;
   private boolean n12544ID_EMP_ZON ;
   private boolean n12545ID_MAQUINA ;
   private boolean n12546ID_EMP_MAQ ;
   private boolean n12547ID_EMP_HDR ;
   private boolean n12548HOJA_DE_RU ;
   private boolean n12549TIPO ;
   private boolean n12550ID_PROCESO ;
   private boolean n12551ID_EMP_PRO ;
   private boolean n12552ID_SECCION ;
   private boolean n12553ID_EMP_SEC ;
   private boolean n12554ID_ANO_MES ;
   private boolean n12555ID_EMP_ANO ;
   private boolean n12556ID_PARO ;
   private boolean n12557ID_EMP_PAR ;
   private boolean n12558ID_COLORAN ;
   private boolean n12559ID_EMP_COL ;
   private boolean n12560ID_INTENSI ;
   private boolean n12561ID_EMP_INT ;
   private boolean n12562TIPO_PRODU ;
   private boolean n12563ID_DEFECTO ;
   private boolean n12564ID_EMP_DEF ;
   private boolean n12565ID_RESPONS ;
   private boolean n12566ID_EMP_RES ;
   private boolean n12567FACTURADO ;
   private boolean n12568ID_PASTA ;
   private boolean n12569ID_EMP_PAS ;
   private boolean n12570UNIDADES ;
   private boolean n12571TIPO_UNIDA ;
   private boolean n12572METROS_P ;
   private boolean n12573KILOS_P ;
   private boolean Gx_longc ;
   private String Z12574ID_TIAES ;
   private String Z12543ID_EMP_CLI ;
   private String Z12544ID_EMP_ZON ;
   private String Z12545ID_MAQUINA ;
   private String Z12546ID_EMP_MAQ ;
   private String Z12547ID_EMP_HDR ;
   private String Z12548HOJA_DE_RU ;
   private String Z12550ID_PROCESO ;
   private String Z12551ID_EMP_PRO ;
   private String Z12552ID_SECCION ;
   private String Z12553ID_EMP_SEC ;
   private String Z12554ID_ANO_MES ;
   private String Z12555ID_EMP_ANO ;
   private String Z12557ID_EMP_PAR ;
   private String Z12559ID_EMP_COL ;
   private String Z12561ID_EMP_INT ;
   private String Z12562TIPO_PRODU ;
   private String Z12564ID_EMP_DEF ;
   private String Z12566ID_EMP_RES ;
   private String Z12568ID_PASTA ;
   private String A12574ID_TIAES ;
   private String A12543ID_EMP_CLI ;
   private String A12544ID_EMP_ZON ;
   private String A12545ID_MAQUINA ;
   private String A12546ID_EMP_MAQ ;
   private String A12547ID_EMP_HDR ;
   private String A12548HOJA_DE_RU ;
   private String A12550ID_PROCESO ;
   private String A12551ID_EMP_PRO ;
   private String A12552ID_SECCION ;
   private String A12553ID_EMP_SEC ;
   private String A12554ID_ANO_MES ;
   private String A12555ID_EMP_ANO ;
   private String A12557ID_EMP_PAR ;
   private String A12559ID_EMP_COL ;
   private String A12561ID_EMP_INT ;
   private String A12562TIPO_PRODU ;
   private String A12564ID_EMP_DEF ;
   private String A12566ID_EMP_RES ;
   private String A12568ID_PASTA ;
   private String ZZ12574ID_TIAES ;
   private String ZZ12543ID_EMP_CLI ;
   private String ZZ12544ID_EMP_ZON ;
   private String ZZ12545ID_MAQUINA ;
   private String ZZ12546ID_EMP_MAQ ;
   private String ZZ12547ID_EMP_HDR ;
   private String ZZ12548HOJA_DE_RU ;
   private String ZZ12550ID_PROCESO ;
   private String ZZ12551ID_EMP_PRO ;
   private String ZZ12552ID_SECCION ;
   private String ZZ12553ID_EMP_SEC ;
   private String ZZ12554ID_ANO_MES ;
   private String ZZ12555ID_EMP_ANO ;
   private String ZZ12557ID_EMP_PAR ;
   private String ZZ12559ID_EMP_COL ;
   private String ZZ12561ID_EMP_INT ;
   private String ZZ12562TIPO_PRODU ;
   private String ZZ12564ID_EMP_DEF ;
   private String ZZ12566ID_EMP_RES ;
   private String ZZ12568ID_PASTA ;
   private IDataStoreProvider pr_default ;
   private String[] T01KM4_A12574ID_TIAES ;
   private String[] T01KM4_A12540ID_EMPRESA ;
   private boolean[] T01KM4_n12540ID_EMPRESA ;
   private java.util.Date[] T01KM4_A12541FECHA ;
   private boolean[] T01KM4_n12541FECHA ;
   private int[] T01KM4_A12542ID_CLIENTE ;
   private boolean[] T01KM4_n12542ID_CLIENTE ;
   private String[] T01KM4_A12543ID_EMP_CLI ;
   private boolean[] T01KM4_n12543ID_EMP_CLI ;
   private String[] T01KM4_A12544ID_EMP_ZON ;
   private boolean[] T01KM4_n12544ID_EMP_ZON ;
   private String[] T01KM4_A12545ID_MAQUINA ;
   private boolean[] T01KM4_n12545ID_MAQUINA ;
   private String[] T01KM4_A12546ID_EMP_MAQ ;
   private boolean[] T01KM4_n12546ID_EMP_MAQ ;
   private String[] T01KM4_A12547ID_EMP_HDR ;
   private boolean[] T01KM4_n12547ID_EMP_HDR ;
   private String[] T01KM4_A12548HOJA_DE_RU ;
   private boolean[] T01KM4_n12548HOJA_DE_RU ;
   private short[] T01KM4_A12549TIPO ;
   private boolean[] T01KM4_n12549TIPO ;
   private String[] T01KM4_A12550ID_PROCESO ;
   private boolean[] T01KM4_n12550ID_PROCESO ;
   private String[] T01KM4_A12551ID_EMP_PRO ;
   private boolean[] T01KM4_n12551ID_EMP_PRO ;
   private String[] T01KM4_A12552ID_SECCION ;
   private boolean[] T01KM4_n12552ID_SECCION ;
   private String[] T01KM4_A12553ID_EMP_SEC ;
   private boolean[] T01KM4_n12553ID_EMP_SEC ;
   private String[] T01KM4_A12554ID_ANO_MES ;
   private boolean[] T01KM4_n12554ID_ANO_MES ;
   private String[] T01KM4_A12555ID_EMP_ANO ;
   private boolean[] T01KM4_n12555ID_EMP_ANO ;
   private short[] T01KM4_A12556ID_PARO ;
   private boolean[] T01KM4_n12556ID_PARO ;
   private String[] T01KM4_A12557ID_EMP_PAR ;
   private boolean[] T01KM4_n12557ID_EMP_PAR ;
   private short[] T01KM4_A12558ID_COLORAN ;
   private boolean[] T01KM4_n12558ID_COLORAN ;
   private String[] T01KM4_A12559ID_EMP_COL ;
   private boolean[] T01KM4_n12559ID_EMP_COL ;
   private short[] T01KM4_A12560ID_INTENSI ;
   private boolean[] T01KM4_n12560ID_INTENSI ;
   private String[] T01KM4_A12561ID_EMP_INT ;
   private boolean[] T01KM4_n12561ID_EMP_INT ;
   private String[] T01KM4_A12562TIPO_PRODU ;
   private boolean[] T01KM4_n12562TIPO_PRODU ;
   private short[] T01KM4_A12563ID_DEFECTO ;
   private boolean[] T01KM4_n12563ID_DEFECTO ;
   private String[] T01KM4_A12564ID_EMP_DEF ;
   private boolean[] T01KM4_n12564ID_EMP_DEF ;
   private short[] T01KM4_A12565ID_RESPONS ;
   private boolean[] T01KM4_n12565ID_RESPONS ;
   private String[] T01KM4_A12566ID_EMP_RES ;
   private boolean[] T01KM4_n12566ID_EMP_RES ;
   private String[] T01KM4_A12567FACTURADO ;
   private boolean[] T01KM4_n12567FACTURADO ;
   private String[] T01KM4_A12568ID_PASTA ;
   private boolean[] T01KM4_n12568ID_PASTA ;
   private String[] T01KM4_A12569ID_EMP_PAS ;
   private boolean[] T01KM4_n12569ID_EMP_PAS ;
   private java.math.BigDecimal[] T01KM4_A12570UNIDADES ;
   private boolean[] T01KM4_n12570UNIDADES ;
   private String[] T01KM4_A12571TIPO_UNIDA ;
   private boolean[] T01KM4_n12571TIPO_UNIDA ;
   private java.math.BigDecimal[] T01KM4_A12572METROS_P ;
   private boolean[] T01KM4_n12572METROS_P ;
   private java.math.BigDecimal[] T01KM4_A12573KILOS_P ;
   private boolean[] T01KM4_n12573KILOS_P ;
   private String[] T01KM5_A12574ID_TIAES ;
   private String[] T01KM3_A12574ID_TIAES ;
   private String[] T01KM3_A12540ID_EMPRESA ;
   private boolean[] T01KM3_n12540ID_EMPRESA ;
   private java.util.Date[] T01KM3_A12541FECHA ;
   private boolean[] T01KM3_n12541FECHA ;
   private int[] T01KM3_A12542ID_CLIENTE ;
   private boolean[] T01KM3_n12542ID_CLIENTE ;
   private String[] T01KM3_A12543ID_EMP_CLI ;
   private boolean[] T01KM3_n12543ID_EMP_CLI ;
   private String[] T01KM3_A12544ID_EMP_ZON ;
   private boolean[] T01KM3_n12544ID_EMP_ZON ;
   private String[] T01KM3_A12545ID_MAQUINA ;
   private boolean[] T01KM3_n12545ID_MAQUINA ;
   private String[] T01KM3_A12546ID_EMP_MAQ ;
   private boolean[] T01KM3_n12546ID_EMP_MAQ ;
   private String[] T01KM3_A12547ID_EMP_HDR ;
   private boolean[] T01KM3_n12547ID_EMP_HDR ;
   private String[] T01KM3_A12548HOJA_DE_RU ;
   private boolean[] T01KM3_n12548HOJA_DE_RU ;
   private short[] T01KM3_A12549TIPO ;
   private boolean[] T01KM3_n12549TIPO ;
   private String[] T01KM3_A12550ID_PROCESO ;
   private boolean[] T01KM3_n12550ID_PROCESO ;
   private String[] T01KM3_A12551ID_EMP_PRO ;
   private boolean[] T01KM3_n12551ID_EMP_PRO ;
   private String[] T01KM3_A12552ID_SECCION ;
   private boolean[] T01KM3_n12552ID_SECCION ;
   private String[] T01KM3_A12553ID_EMP_SEC ;
   private boolean[] T01KM3_n12553ID_EMP_SEC ;
   private String[] T01KM3_A12554ID_ANO_MES ;
   private boolean[] T01KM3_n12554ID_ANO_MES ;
   private String[] T01KM3_A12555ID_EMP_ANO ;
   private boolean[] T01KM3_n12555ID_EMP_ANO ;
   private short[] T01KM3_A12556ID_PARO ;
   private boolean[] T01KM3_n12556ID_PARO ;
   private String[] T01KM3_A12557ID_EMP_PAR ;
   private boolean[] T01KM3_n12557ID_EMP_PAR ;
   private short[] T01KM3_A12558ID_COLORAN ;
   private boolean[] T01KM3_n12558ID_COLORAN ;
   private String[] T01KM3_A12559ID_EMP_COL ;
   private boolean[] T01KM3_n12559ID_EMP_COL ;
   private short[] T01KM3_A12560ID_INTENSI ;
   private boolean[] T01KM3_n12560ID_INTENSI ;
   private String[] T01KM3_A12561ID_EMP_INT ;
   private boolean[] T01KM3_n12561ID_EMP_INT ;
   private String[] T01KM3_A12562TIPO_PRODU ;
   private boolean[] T01KM3_n12562TIPO_PRODU ;
   private short[] T01KM3_A12563ID_DEFECTO ;
   private boolean[] T01KM3_n12563ID_DEFECTO ;
   private String[] T01KM3_A12564ID_EMP_DEF ;
   private boolean[] T01KM3_n12564ID_EMP_DEF ;
   private short[] T01KM3_A12565ID_RESPONS ;
   private boolean[] T01KM3_n12565ID_RESPONS ;
   private String[] T01KM3_A12566ID_EMP_RES ;
   private boolean[] T01KM3_n12566ID_EMP_RES ;
   private String[] T01KM3_A12567FACTURADO ;
   private boolean[] T01KM3_n12567FACTURADO ;
   private String[] T01KM3_A12568ID_PASTA ;
   private boolean[] T01KM3_n12568ID_PASTA ;
   private String[] T01KM3_A12569ID_EMP_PAS ;
   private boolean[] T01KM3_n12569ID_EMP_PAS ;
   private java.math.BigDecimal[] T01KM3_A12570UNIDADES ;
   private boolean[] T01KM3_n12570UNIDADES ;
   private String[] T01KM3_A12571TIPO_UNIDA ;
   private boolean[] T01KM3_n12571TIPO_UNIDA ;
   private java.math.BigDecimal[] T01KM3_A12572METROS_P ;
   private boolean[] T01KM3_n12572METROS_P ;
   private java.math.BigDecimal[] T01KM3_A12573KILOS_P ;
   private boolean[] T01KM3_n12573KILOS_P ;
   private String[] T01KM6_A12574ID_TIAES ;
   private String[] T01KM7_A12574ID_TIAES ;
   private String[] T01KM2_A12574ID_TIAES ;
   private String[] T01KM2_A12540ID_EMPRESA ;
   private boolean[] T01KM2_n12540ID_EMPRESA ;
   private java.util.Date[] T01KM2_A12541FECHA ;
   private boolean[] T01KM2_n12541FECHA ;
   private int[] T01KM2_A12542ID_CLIENTE ;
   private boolean[] T01KM2_n12542ID_CLIENTE ;
   private String[] T01KM2_A12543ID_EMP_CLI ;
   private boolean[] T01KM2_n12543ID_EMP_CLI ;
   private String[] T01KM2_A12544ID_EMP_ZON ;
   private boolean[] T01KM2_n12544ID_EMP_ZON ;
   private String[] T01KM2_A12545ID_MAQUINA ;
   private boolean[] T01KM2_n12545ID_MAQUINA ;
   private String[] T01KM2_A12546ID_EMP_MAQ ;
   private boolean[] T01KM2_n12546ID_EMP_MAQ ;
   private String[] T01KM2_A12547ID_EMP_HDR ;
   private boolean[] T01KM2_n12547ID_EMP_HDR ;
   private String[] T01KM2_A12548HOJA_DE_RU ;
   private boolean[] T01KM2_n12548HOJA_DE_RU ;
   private short[] T01KM2_A12549TIPO ;
   private boolean[] T01KM2_n12549TIPO ;
   private String[] T01KM2_A12550ID_PROCESO ;
   private boolean[] T01KM2_n12550ID_PROCESO ;
   private String[] T01KM2_A12551ID_EMP_PRO ;
   private boolean[] T01KM2_n12551ID_EMP_PRO ;
   private String[] T01KM2_A12552ID_SECCION ;
   private boolean[] T01KM2_n12552ID_SECCION ;
   private String[] T01KM2_A12553ID_EMP_SEC ;
   private boolean[] T01KM2_n12553ID_EMP_SEC ;
   private String[] T01KM2_A12554ID_ANO_MES ;
   private boolean[] T01KM2_n12554ID_ANO_MES ;
   private String[] T01KM2_A12555ID_EMP_ANO ;
   private boolean[] T01KM2_n12555ID_EMP_ANO ;
   private short[] T01KM2_A12556ID_PARO ;
   private boolean[] T01KM2_n12556ID_PARO ;
   private String[] T01KM2_A12557ID_EMP_PAR ;
   private boolean[] T01KM2_n12557ID_EMP_PAR ;
   private short[] T01KM2_A12558ID_COLORAN ;
   private boolean[] T01KM2_n12558ID_COLORAN ;
   private String[] T01KM2_A12559ID_EMP_COL ;
   private boolean[] T01KM2_n12559ID_EMP_COL ;
   private short[] T01KM2_A12560ID_INTENSI ;
   private boolean[] T01KM2_n12560ID_INTENSI ;
   private String[] T01KM2_A12561ID_EMP_INT ;
   private boolean[] T01KM2_n12561ID_EMP_INT ;
   private String[] T01KM2_A12562TIPO_PRODU ;
   private boolean[] T01KM2_n12562TIPO_PRODU ;
   private short[] T01KM2_A12563ID_DEFECTO ;
   private boolean[] T01KM2_n12563ID_DEFECTO ;
   private String[] T01KM2_A12564ID_EMP_DEF ;
   private boolean[] T01KM2_n12564ID_EMP_DEF ;
   private short[] T01KM2_A12565ID_RESPONS ;
   private boolean[] T01KM2_n12565ID_RESPONS ;
   private String[] T01KM2_A12566ID_EMP_RES ;
   private boolean[] T01KM2_n12566ID_EMP_RES ;
   private String[] T01KM2_A12567FACTURADO ;
   private boolean[] T01KM2_n12567FACTURADO ;
   private String[] T01KM2_A12568ID_PASTA ;
   private boolean[] T01KM2_n12568ID_PASTA ;
   private String[] T01KM2_A12569ID_EMP_PAS ;
   private boolean[] T01KM2_n12569ID_EMP_PAS ;
   private java.math.BigDecimal[] T01KM2_A12570UNIDADES ;
   private boolean[] T01KM2_n12570UNIDADES ;
   private String[] T01KM2_A12571TIPO_UNIDA ;
   private boolean[] T01KM2_n12571TIPO_UNIDA ;
   private java.math.BigDecimal[] T01KM2_A12572METROS_P ;
   private boolean[] T01KM2_n12572METROS_P ;
   private java.math.BigDecimal[] T01KM2_A12573KILOS_P ;
   private boolean[] T01KM2_n12573KILOS_P ;
   private String[] T01KM11_A12574ID_TIAES ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttiaes__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttiaes__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttiaes__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttiaes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KM2", "SELECT ID_TIAES, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P FROM TXPTIAES WHERE ID_TIAES = ?  FOR UPDATE OF ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KM3", "SELECT ID_TIAES, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P FROM TXPTIAES WHERE ID_TIAES = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KM4", "SELECT /*+ FIRST_ROWS(100) */ TM1.ID_TIAES, TM1.ID_EMPRESA, TM1.FECHA, TM1.ID_CLIENTE, TM1.ID_EMP_CLI, TM1.ID_EMP_ZON, TM1.ID_MAQUINA, TM1.ID_EMP_MAQ, TM1.ID_EMP_HDR, TM1.HOJA_DE_RU, TM1.TIPO, TM1.ID_PROCESO, TM1.ID_EMP_PRO, TM1.ID_SECCION, TM1.ID_EMP_SEC, TM1.ID_ANO_MES, TM1.ID_EMP_ANO, TM1.ID_PARO, TM1.ID_EMP_PAR, TM1.ID_COLORAN, TM1.ID_EMP_COL, TM1.ID_INTENSI, TM1.ID_EMP_INT, TM1.TIPO_PRODU, TM1.ID_DEFECTO, TM1.ID_EMP_DEF, TM1.ID_RESPONS, TM1.ID_EMP_RES, TM1.FACTURADO, TM1.ID_PASTA, TM1.ID_EMP_PAS, TM1.UNIDADES, TM1.TIPO_UNIDA, TM1.METROS_P, TM1.KILOS_P FROM TXPTIAES TM1 WHERE TM1.ID_TIAES = ? ORDER BY TM1.ID_TIAES ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KM5", "SELECT /*+ FIRST_ROWS(1) */ ID_TIAES FROM TXPTIAES WHERE ID_TIAES = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KM6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ID_TIAES FROM TXPTIAES WHERE ( ID_TIAES > ?) ORDER BY ID_TIAES) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KM7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ID_TIAES FROM TXPTIAES WHERE ( ID_TIAES < ?) ORDER BY ID_TIAES DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KM8", "INSERT INTO TXPTIAES(ID_TIAES, ID_EMPRESA, FECHA, ID_CLIENTE, ID_EMP_CLI, ID_EMP_ZON, ID_MAQUINA, ID_EMP_MAQ, ID_EMP_HDR, HOJA_DE_RU, TIPO, ID_PROCESO, ID_EMP_PRO, ID_SECCION, ID_EMP_SEC, ID_ANO_MES, ID_EMP_ANO, ID_PARO, ID_EMP_PAR, ID_COLORAN, ID_EMP_COL, ID_INTENSI, ID_EMP_INT, TIPO_PRODU, ID_DEFECTO, ID_EMP_DEF, ID_RESPONS, ID_EMP_RES, FACTURADO, ID_PASTA, ID_EMP_PAS, UNIDADES, TIPO_UNIDA, METROS_P, KILOS_P) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTIAES")
         ,new UpdateCursor("T01KM9", "UPDATE TXPTIAES SET ID_EMPRESA=?, FECHA=?, ID_CLIENTE=?, ID_EMP_CLI=?, ID_EMP_ZON=?, ID_MAQUINA=?, ID_EMP_MAQ=?, ID_EMP_HDR=?, HOJA_DE_RU=?, TIPO=?, ID_PROCESO=?, ID_EMP_PRO=?, ID_SECCION=?, ID_EMP_SEC=?, ID_ANO_MES=?, ID_EMP_ANO=?, ID_PARO=?, ID_EMP_PAR=?, ID_COLORAN=?, ID_EMP_COL=?, ID_INTENSI=?, ID_EMP_INT=?, TIPO_PRODU=?, ID_DEFECTO=?, ID_EMP_DEF=?, ID_RESPONS=?, ID_EMP_RES=?, FACTURADO=?, ID_PASTA=?, ID_EMP_PAS=?, UNIDADES=?, TIPO_UNIDA=?, METROS_P=?, KILOS_P=?  WHERE ID_TIAES = ?", GX_NOMASK, "TXPTIAES")
         ,new UpdateCursor("T01KM10", "DELETE FROM TXPTIAES  WHERE ID_TIAES = ?", GX_NOMASK, "TXPTIAES")
         ,new ForEachCursor("T01KM11", "SELECT /*+ FIRST_ROWS(100) */ ID_TIAES FROM TXPTIAES ORDER BY ID_TIAES ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 9);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 9);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 9);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 43);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 43);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 9);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 84);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 81);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 8);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 11);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 7);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 10);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 13);
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
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 43);
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
                  stmt.setVarchar(21, (String)parms[40], 43);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[44], 43);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 11);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 43);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 43);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 9);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[68], 2);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 43);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 43);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 84);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 81);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 8);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 11);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 7);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 13);
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 43);
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
                  stmt.setVarchar(20, (String)parms[39], 43);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 43);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 11);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 43);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 43);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 6);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 9);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[67], 2);
               }
               stmt.setVarchar(35, (String)parms[68], 360, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 360, false);
               return;
      }
   }

}

