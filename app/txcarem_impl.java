package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txcarem_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "XCAREM", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXCAREMID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public txcarem_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txcarem_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txcarem_impl.class ));
   }

   public txcarem_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXCAREM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Id de Recepcion de Mercadería", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMID_Internalname, GXutil.rtrim( A6750XCAREMID), GXutil.rtrim( localUtil.format( A6750XCAREMID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMID_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMID_Enabled, 0, "text", "", 27, "chr", 1, "row", 27, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Orden de Compra (Calipso)", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMORDI_Internalname, GXutil.rtrim( A6751XCAREMORDI), GXutil.rtrim( localUtil.format( A6751XCAREMORDI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMORDI_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMORDI_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha de Recepción", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXCAREMRECF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMRECF_Internalname, localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6752XCAREMRECF, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMRECF_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMRECF_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXCAREM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXCAREMRECF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXCAREMRECF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXCAREM.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha de Registro", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXCAREMREGF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMREGF_Internalname, localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6753XCAREMREGF, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMREGF_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMREGF_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXCAREM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXCAREMREGF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXCAREMREGF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXCAREM.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Artículo (Calipso)", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMARTI_Internalname, GXutil.rtrim( A6754XCAREMARTI), GXutil.rtrim( localUtil.format( A6754XCAREMARTI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMARTI_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMARTI_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Proveedor (Calipso)", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMPRVI_Internalname, GXutil.rtrim( A6755XCAREMPRVI), GXutil.rtrim( localUtil.format( A6755XCAREMPRVI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMPRVI_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMPRVI_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cantidad Recibida", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMRECC_Internalname, GXutil.ltrim( localUtil.ntoc( A6756XCAREMRECC, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCAREMRECC_Enabled!=0) ? localUtil.format( A6756XCAREMRECC, "ZZZZZZZ.999") : localUtil.format( A6756XCAREMRECC, "ZZZZZZZ.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMRECC_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMRECC_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cantidad Pesada", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMPESC_Internalname, GXutil.ltrim( localUtil.ntoc( A6757XCAREMPESC, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCAREMPESC_Enabled!=0) ? localUtil.format( A6757XCAREMPESC, "ZZZZZZZ.999") : localUtil.format( A6757XCAREMPESC, "ZZZZZZZ.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMPESC_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMPESC_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Remito", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMALB_Internalname, GXutil.rtrim( A6758XCAREMALB), GXutil.rtrim( localUtil.format( A6758XCAREMALB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMALB_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMALB_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXCAREM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCAREMEST_Internalname, GXutil.rtrim( A6759XCAREMEST), GXutil.rtrim( localUtil.format( A6759XCAREMEST, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCAREMEST_Jsonclick, 0, "", "", "", "", "", 1, edtXCAREMEST_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXCAREM.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXCAREM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXCAREM.htm");
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
         Z6750XCAREMID = httpContext.cgiGet( "Z6750XCAREMID") ;
         Z6751XCAREMORDI = httpContext.cgiGet( "Z6751XCAREMORDI") ;
         Z6752XCAREMRECF = localUtil.ctot( httpContext.cgiGet( "Z6752XCAREMRECF"), 0) ;
         Z6753XCAREMREGF = localUtil.ctot( httpContext.cgiGet( "Z6753XCAREMREGF"), 0) ;
         Z6754XCAREMARTI = httpContext.cgiGet( "Z6754XCAREMARTI") ;
         Z6755XCAREMPRVI = httpContext.cgiGet( "Z6755XCAREMPRVI") ;
         Z6756XCAREMRECC = localUtil.ctond( httpContext.cgiGet( "Z6756XCAREMRECC")) ;
         Z6757XCAREMPESC = localUtil.ctond( httpContext.cgiGet( "Z6757XCAREMPESC")) ;
         Z6758XCAREMALB = httpContext.cgiGet( "Z6758XCAREMALB") ;
         Z6759XCAREMEST = httpContext.cgiGet( "Z6759XCAREMEST") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A6750XCAREMID = httpContext.cgiGet( edtXCAREMID_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
         A6751XCAREMORDI = httpContext.cgiGet( edtXCAREMORDI_Internalname) ;
         n6751XCAREMORDI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6751XCAREMORDI", A6751XCAREMORDI);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtXCAREMRECF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "XCAREMRECF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCAREMRECF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6752XCAREMRECF = GXutil.resetTime( GXutil.nullDate() );
            n6752XCAREMRECF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6752XCAREMRECF", localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6752XCAREMRECF = localUtil.ctot( httpContext.cgiGet( edtXCAREMRECF_Internalname)) ;
            n6752XCAREMRECF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6752XCAREMRECF", localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtXCAREMREGF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "XCAREMREGF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCAREMREGF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6753XCAREMREGF = GXutil.resetTime( GXutil.nullDate() );
            n6753XCAREMREGF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6753XCAREMREGF", localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6753XCAREMREGF = localUtil.ctot( httpContext.cgiGet( edtXCAREMREGF_Internalname)) ;
            n6753XCAREMREGF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6753XCAREMREGF", localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A6754XCAREMARTI = httpContext.cgiGet( edtXCAREMARTI_Internalname) ;
         n6754XCAREMARTI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6754XCAREMARTI", A6754XCAREMARTI);
         A6755XCAREMPRVI = httpContext.cgiGet( edtXCAREMPRVI_Internalname) ;
         n6755XCAREMPRVI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6755XCAREMPRVI", A6755XCAREMPRVI);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXCAREMRECC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXCAREMRECC_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XCAREMRECC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCAREMRECC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6756XCAREMRECC = DecimalUtil.ZERO ;
            n6756XCAREMRECC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6756XCAREMRECC", GXutil.ltrimstr( A6756XCAREMRECC, 11, 3));
         }
         else
         {
            A6756XCAREMRECC = localUtil.ctond( httpContext.cgiGet( edtXCAREMRECC_Internalname)) ;
            n6756XCAREMRECC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6756XCAREMRECC", GXutil.ltrimstr( A6756XCAREMRECC, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXCAREMPESC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXCAREMPESC_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XCAREMPESC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCAREMPESC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6757XCAREMPESC = DecimalUtil.ZERO ;
            n6757XCAREMPESC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6757XCAREMPESC", GXutil.ltrimstr( A6757XCAREMPESC, 11, 3));
         }
         else
         {
            A6757XCAREMPESC = localUtil.ctond( httpContext.cgiGet( edtXCAREMPESC_Internalname)) ;
            n6757XCAREMPESC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6757XCAREMPESC", GXutil.ltrimstr( A6757XCAREMPESC, 11, 3));
         }
         A6758XCAREMALB = httpContext.cgiGet( edtXCAREMALB_Internalname) ;
         n6758XCAREMALB = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6758XCAREMALB", A6758XCAREMALB);
         A6759XCAREMEST = httpContext.cgiGet( edtXCAREMEST_Internalname) ;
         n6759XCAREMEST = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6759XCAREMEST", A6759XCAREMEST);
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
            A6750XCAREMID = httpContext.GetPar( "XCAREMID") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
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
            initAllWM968( ) ;
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
      disableAttributesWM968( ) ;
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

   public void confirm_WM0( )
   {
      beforeValidateWM968( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsWM968( ) ;
         }
         else
         {
            checkExtendedTableWM968( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursorsWM968( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesWM0( ) ;
      }
   }

   public void resetCaptionWM0( )
   {
   }

   public void zmWM968( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6751XCAREMORDI = T00WM3_A6751XCAREMORDI[0] ;
            Z6752XCAREMRECF = T00WM3_A6752XCAREMRECF[0] ;
            Z6753XCAREMREGF = T00WM3_A6753XCAREMREGF[0] ;
            Z6754XCAREMARTI = T00WM3_A6754XCAREMARTI[0] ;
            Z6755XCAREMPRVI = T00WM3_A6755XCAREMPRVI[0] ;
            Z6756XCAREMRECC = T00WM3_A6756XCAREMRECC[0] ;
            Z6757XCAREMPESC = T00WM3_A6757XCAREMPESC[0] ;
            Z6758XCAREMALB = T00WM3_A6758XCAREMALB[0] ;
            Z6759XCAREMEST = T00WM3_A6759XCAREMEST[0] ;
         }
         else
         {
            Z6751XCAREMORDI = A6751XCAREMORDI ;
            Z6752XCAREMRECF = A6752XCAREMRECF ;
            Z6753XCAREMREGF = A6753XCAREMREGF ;
            Z6754XCAREMARTI = A6754XCAREMARTI ;
            Z6755XCAREMPRVI = A6755XCAREMPRVI ;
            Z6756XCAREMRECC = A6756XCAREMRECC ;
            Z6757XCAREMPESC = A6757XCAREMPESC ;
            Z6758XCAREMALB = A6758XCAREMALB ;
            Z6759XCAREMEST = A6759XCAREMEST ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6750XCAREMID = A6750XCAREMID ;
         Z6751XCAREMORDI = A6751XCAREMORDI ;
         Z6752XCAREMRECF = A6752XCAREMRECF ;
         Z6753XCAREMREGF = A6753XCAREMREGF ;
         Z6754XCAREMARTI = A6754XCAREMARTI ;
         Z6755XCAREMPRVI = A6755XCAREMPRVI ;
         Z6756XCAREMRECC = A6756XCAREMRECC ;
         Z6757XCAREMPESC = A6757XCAREMPESC ;
         Z6758XCAREMALB = A6758XCAREMALB ;
         Z6759XCAREMEST = A6759XCAREMEST ;
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

   public void loadWM968( )
   {
      /* Using cursor T00WM4 */
      pr_default.execute(2, new Object[] {A6750XCAREMID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound968 = (short)(1) ;
         A6751XCAREMORDI = T00WM4_A6751XCAREMORDI[0] ;
         n6751XCAREMORDI = T00WM4_n6751XCAREMORDI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6751XCAREMORDI", A6751XCAREMORDI);
         A6752XCAREMRECF = T00WM4_A6752XCAREMRECF[0] ;
         n6752XCAREMRECF = T00WM4_n6752XCAREMRECF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6752XCAREMRECF", localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6753XCAREMREGF = T00WM4_A6753XCAREMREGF[0] ;
         n6753XCAREMREGF = T00WM4_n6753XCAREMREGF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6753XCAREMREGF", localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6754XCAREMARTI = T00WM4_A6754XCAREMARTI[0] ;
         n6754XCAREMARTI = T00WM4_n6754XCAREMARTI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6754XCAREMARTI", A6754XCAREMARTI);
         A6755XCAREMPRVI = T00WM4_A6755XCAREMPRVI[0] ;
         n6755XCAREMPRVI = T00WM4_n6755XCAREMPRVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6755XCAREMPRVI", A6755XCAREMPRVI);
         A6756XCAREMRECC = T00WM4_A6756XCAREMRECC[0] ;
         n6756XCAREMRECC = T00WM4_n6756XCAREMRECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6756XCAREMRECC", GXutil.ltrimstr( A6756XCAREMRECC, 11, 3));
         A6757XCAREMPESC = T00WM4_A6757XCAREMPESC[0] ;
         n6757XCAREMPESC = T00WM4_n6757XCAREMPESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6757XCAREMPESC", GXutil.ltrimstr( A6757XCAREMPESC, 11, 3));
         A6758XCAREMALB = T00WM4_A6758XCAREMALB[0] ;
         n6758XCAREMALB = T00WM4_n6758XCAREMALB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6758XCAREMALB", A6758XCAREMALB);
         A6759XCAREMEST = T00WM4_A6759XCAREMEST[0] ;
         n6759XCAREMEST = T00WM4_n6759XCAREMEST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6759XCAREMEST", A6759XCAREMEST);
         zmWM968( -1) ;
      }
      pr_default.close(2);
      onLoadActionsWM968( ) ;
   }

   public void onLoadActionsWM968( )
   {
   }

   public void checkExtendedTableWM968( )
   {
      nIsDirty_968 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsWM968( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyWM968( )
   {
      /* Using cursor T00WM5 */
      pr_default.execute(3, new Object[] {A6750XCAREMID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound968 = (short)(1) ;
      }
      else
      {
         RcdFound968 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00WM3 */
      pr_default.execute(1, new Object[] {A6750XCAREMID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmWM968( 1) ;
         RcdFound968 = (short)(1) ;
         A6750XCAREMID = T00WM3_A6750XCAREMID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
         A6751XCAREMORDI = T00WM3_A6751XCAREMORDI[0] ;
         n6751XCAREMORDI = T00WM3_n6751XCAREMORDI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6751XCAREMORDI", A6751XCAREMORDI);
         A6752XCAREMRECF = T00WM3_A6752XCAREMRECF[0] ;
         n6752XCAREMRECF = T00WM3_n6752XCAREMRECF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6752XCAREMRECF", localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6753XCAREMREGF = T00WM3_A6753XCAREMREGF[0] ;
         n6753XCAREMREGF = T00WM3_n6753XCAREMREGF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6753XCAREMREGF", localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6754XCAREMARTI = T00WM3_A6754XCAREMARTI[0] ;
         n6754XCAREMARTI = T00WM3_n6754XCAREMARTI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6754XCAREMARTI", A6754XCAREMARTI);
         A6755XCAREMPRVI = T00WM3_A6755XCAREMPRVI[0] ;
         n6755XCAREMPRVI = T00WM3_n6755XCAREMPRVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6755XCAREMPRVI", A6755XCAREMPRVI);
         A6756XCAREMRECC = T00WM3_A6756XCAREMRECC[0] ;
         n6756XCAREMRECC = T00WM3_n6756XCAREMRECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6756XCAREMRECC", GXutil.ltrimstr( A6756XCAREMRECC, 11, 3));
         A6757XCAREMPESC = T00WM3_A6757XCAREMPESC[0] ;
         n6757XCAREMPESC = T00WM3_n6757XCAREMPESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6757XCAREMPESC", GXutil.ltrimstr( A6757XCAREMPESC, 11, 3));
         A6758XCAREMALB = T00WM3_A6758XCAREMALB[0] ;
         n6758XCAREMALB = T00WM3_n6758XCAREMALB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6758XCAREMALB", A6758XCAREMALB);
         A6759XCAREMEST = T00WM3_A6759XCAREMEST[0] ;
         n6759XCAREMEST = T00WM3_n6759XCAREMEST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6759XCAREMEST", A6759XCAREMEST);
         Z6750XCAREMID = A6750XCAREMID ;
         sMode968 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadWM968( ) ;
         if ( AnyError == 1 )
         {
            RcdFound968 = (short)(0) ;
            initializeNonKeyWM968( ) ;
         }
         Gx_mode = sMode968 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound968 = (short)(0) ;
         initializeNonKeyWM968( ) ;
         sMode968 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode968 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyWM968( ) ;
      if ( RcdFound968 == 0 )
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
      RcdFound968 = (short)(0) ;
      /* Using cursor T00WM6 */
      pr_default.execute(4, new Object[] {A6750XCAREMID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00WM6_A6750XCAREMID[0], A6750XCAREMID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00WM6_A6750XCAREMID[0], A6750XCAREMID) > 0 ) ) )
         {
            A6750XCAREMID = T00WM6_A6750XCAREMID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
            RcdFound968 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound968 = (short)(0) ;
      /* Using cursor T00WM7 */
      pr_default.execute(5, new Object[] {A6750XCAREMID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00WM7_A6750XCAREMID[0], A6750XCAREMID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00WM7_A6750XCAREMID[0], A6750XCAREMID) < 0 ) ) )
         {
            A6750XCAREMID = T00WM7_A6750XCAREMID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
            RcdFound968 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyWM968( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXCAREMID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertWM968( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound968 == 1 )
         {
            if ( GXutil.strcmp(A6750XCAREMID, Z6750XCAREMID) != 0 )
            {
               A6750XCAREMID = Z6750XCAREMID ;
               httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "XCAREMID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXCAREMID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXCAREMID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateWM968( ) ;
               GX_FocusControl = edtXCAREMID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A6750XCAREMID, Z6750XCAREMID) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtXCAREMID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertWM968( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XCAREMID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXCAREMID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtXCAREMID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertWM968( ) ;
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
      if ( GXutil.strcmp(A6750XCAREMID, Z6750XCAREMID) != 0 )
      {
         A6750XCAREMID = Z6750XCAREMID ;
         httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "XCAREMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXCAREMID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXCAREMID_Internalname ;
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
      getKeyWM968( ) ;
      if ( RcdFound968 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "XCAREMID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCAREMID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A6750XCAREMID, Z6750XCAREMID) != 0 )
         {
            A6750XCAREMID = Z6750XCAREMID ;
            httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "XCAREMID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXCAREMID_Internalname ;
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
         if ( GXutil.strcmp(A6750XCAREMID, Z6750XCAREMID) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XCAREMID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXCAREMID_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txcarem");
      GX_FocusControl = edtXCAREMORDI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_WM0( ) ;
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
      if ( RcdFound968 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "XCAREMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXCAREMID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtXCAREMORDI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartWM968( ) ;
      if ( RcdFound968 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCAREMORDI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndWM968( ) ;
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
      if ( RcdFound968 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCAREMORDI_Internalname ;
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
      if ( RcdFound968 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCAREMORDI_Internalname ;
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
      scanStartWM968( ) ;
      if ( RcdFound968 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound968 != 0 )
         {
            scanNextWM968( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCAREMORDI_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndWM968( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyWM968( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00WM2 */
         pr_default.execute(0, new Object[] {A6750XCAREMID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXCAREM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6751XCAREMORDI, T00WM2_A6751XCAREMORDI[0]) != 0 ) || !( GXutil.dateCompare(Z6752XCAREMRECF, T00WM2_A6752XCAREMRECF[0]) ) || !( GXutil.dateCompare(Z6753XCAREMREGF, T00WM2_A6753XCAREMREGF[0]) ) || ( GXutil.strcmp(Z6754XCAREMARTI, T00WM2_A6754XCAREMARTI[0]) != 0 ) || ( GXutil.strcmp(Z6755XCAREMPRVI, T00WM2_A6755XCAREMPRVI[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6756XCAREMRECC, T00WM2_A6756XCAREMRECC[0]) != 0 ) || ( DecimalUtil.compareTo(Z6757XCAREMPESC, T00WM2_A6757XCAREMPESC[0]) != 0 ) || ( GXutil.strcmp(Z6758XCAREMALB, T00WM2_A6758XCAREMALB[0]) != 0 ) || ( GXutil.strcmp(Z6759XCAREMEST, T00WM2_A6759XCAREMEST[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6751XCAREMORDI, T00WM2_A6751XCAREMORDI[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMORDI");
               GXutil.writeLogRaw("Old: ",Z6751XCAREMORDI);
               GXutil.writeLogRaw("Current: ",T00WM2_A6751XCAREMORDI[0]);
            }
            if ( !( GXutil.dateCompare(Z6752XCAREMRECF, T00WM2_A6752XCAREMRECF[0]) ) )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMRECF");
               GXutil.writeLogRaw("Old: ",Z6752XCAREMRECF);
               GXutil.writeLogRaw("Current: ",T00WM2_A6752XCAREMRECF[0]);
            }
            if ( !( GXutil.dateCompare(Z6753XCAREMREGF, T00WM2_A6753XCAREMREGF[0]) ) )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMREGF");
               GXutil.writeLogRaw("Old: ",Z6753XCAREMREGF);
               GXutil.writeLogRaw("Current: ",T00WM2_A6753XCAREMREGF[0]);
            }
            if ( GXutil.strcmp(Z6754XCAREMARTI, T00WM2_A6754XCAREMARTI[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMARTI");
               GXutil.writeLogRaw("Old: ",Z6754XCAREMARTI);
               GXutil.writeLogRaw("Current: ",T00WM2_A6754XCAREMARTI[0]);
            }
            if ( GXutil.strcmp(Z6755XCAREMPRVI, T00WM2_A6755XCAREMPRVI[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMPRVI");
               GXutil.writeLogRaw("Old: ",Z6755XCAREMPRVI);
               GXutil.writeLogRaw("Current: ",T00WM2_A6755XCAREMPRVI[0]);
            }
            if ( DecimalUtil.compareTo(Z6756XCAREMRECC, T00WM2_A6756XCAREMRECC[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMRECC");
               GXutil.writeLogRaw("Old: ",Z6756XCAREMRECC);
               GXutil.writeLogRaw("Current: ",T00WM2_A6756XCAREMRECC[0]);
            }
            if ( DecimalUtil.compareTo(Z6757XCAREMPESC, T00WM2_A6757XCAREMPESC[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMPESC");
               GXutil.writeLogRaw("Old: ",Z6757XCAREMPESC);
               GXutil.writeLogRaw("Current: ",T00WM2_A6757XCAREMPESC[0]);
            }
            if ( GXutil.strcmp(Z6758XCAREMALB, T00WM2_A6758XCAREMALB[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMALB");
               GXutil.writeLogRaw("Old: ",Z6758XCAREMALB);
               GXutil.writeLogRaw("Current: ",T00WM2_A6758XCAREMALB[0]);
            }
            if ( GXutil.strcmp(Z6759XCAREMEST, T00WM2_A6759XCAREMEST[0]) != 0 )
            {
               GXutil.writeLogln("txcarem:[seudo value changed for attri]"+"XCAREMEST");
               GXutil.writeLogRaw("Old: ",Z6759XCAREMEST);
               GXutil.writeLogRaw("Current: ",T00WM2_A6759XCAREMEST[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXCAREM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertWM968( )
   {
      beforeValidateWM968( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWM968( ) ;
      }
      if ( AnyError == 0 )
      {
         zmWM968( 0) ;
         checkOptimisticConcurrencyWM968( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWM968( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertWM968( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WM8 */
                  pr_default.execute(6, new Object[] {A6750XCAREMID, Boolean.valueOf(n6751XCAREMORDI), A6751XCAREMORDI, Boolean.valueOf(n6752XCAREMRECF), A6752XCAREMRECF, Boolean.valueOf(n6753XCAREMREGF), A6753XCAREMREGF, Boolean.valueOf(n6754XCAREMARTI), A6754XCAREMARTI, Boolean.valueOf(n6755XCAREMPRVI), A6755XCAREMPRVI, Boolean.valueOf(n6756XCAREMRECC), A6756XCAREMRECC, Boolean.valueOf(n6757XCAREMPESC), A6757XCAREMPESC, Boolean.valueOf(n6758XCAREMALB), A6758XCAREMALB, Boolean.valueOf(n6759XCAREMEST), A6759XCAREMEST});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXCAREM");
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
                        resetCaptionWM0( ) ;
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
            loadWM968( ) ;
         }
         endLevelWM968( ) ;
      }
      closeExtendedTableCursorsWM968( ) ;
   }

   public void updateWM968( )
   {
      beforeValidateWM968( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableWM968( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWM968( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmWM968( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateWM968( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00WM9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n6751XCAREMORDI), A6751XCAREMORDI, Boolean.valueOf(n6752XCAREMRECF), A6752XCAREMRECF, Boolean.valueOf(n6753XCAREMREGF), A6753XCAREMREGF, Boolean.valueOf(n6754XCAREMARTI), A6754XCAREMARTI, Boolean.valueOf(n6755XCAREMPRVI), A6755XCAREMPRVI, Boolean.valueOf(n6756XCAREMRECC), A6756XCAREMRECC, Boolean.valueOf(n6757XCAREMPESC), A6757XCAREMPESC, Boolean.valueOf(n6758XCAREMALB), A6758XCAREMALB, Boolean.valueOf(n6759XCAREMEST), A6759XCAREMEST, A6750XCAREMID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXCAREM");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXCAREM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateWM968( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionWM0( ) ;
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
         endLevelWM968( ) ;
      }
      closeExtendedTableCursorsWM968( ) ;
   }

   public void deferredUpdateWM968( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateWM968( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyWM968( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsWM968( ) ;
         afterConfirmWM968( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteWM968( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00WM10 */
               pr_default.execute(8, new Object[] {A6750XCAREMID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXCAREM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound968 == 0 )
                     {
                        initAllWM968( ) ;
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
                     resetCaptionWM0( ) ;
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
      sMode968 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelWM968( ) ;
      Gx_mode = sMode968 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsWM968( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelWM968( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteWM968( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txcarem");
         if ( AnyError == 0 )
         {
            confirmValuesWM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txcarem");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartWM968( )
   {
      /* Using cursor T00WM11 */
      pr_default.execute(9);
      RcdFound968 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound968 = (short)(1) ;
         A6750XCAREMID = T00WM11_A6750XCAREMID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextWM968( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound968 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound968 = (short)(1) ;
         A6750XCAREMID = T00WM11_A6750XCAREMID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
      }
   }

   public void scanEndWM968( )
   {
      pr_default.close(9);
   }

   public void afterConfirmWM968( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertWM968( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateWM968( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteWM968( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteWM968( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateWM968( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesWM968( )
   {
      edtXCAREMID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMID_Enabled), 5, 0), true);
      edtXCAREMORDI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMORDI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMORDI_Enabled), 5, 0), true);
      edtXCAREMRECF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMRECF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMRECF_Enabled), 5, 0), true);
      edtXCAREMREGF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMREGF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMREGF_Enabled), 5, 0), true);
      edtXCAREMARTI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMARTI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMARTI_Enabled), 5, 0), true);
      edtXCAREMPRVI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMPRVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMPRVI_Enabled), 5, 0), true);
      edtXCAREMRECC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMRECC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMRECC_Enabled), 5, 0), true);
      edtXCAREMPESC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMPESC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMPESC_Enabled), 5, 0), true);
      edtXCAREMALB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMALB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMALB_Enabled), 5, 0), true);
      edtXCAREMEST_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCAREMEST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCAREMEST_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesWM968( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesWM0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txcarem", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6750XCAREMID", GXutil.rtrim( Z6750XCAREMID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6751XCAREMORDI", GXutil.rtrim( Z6751XCAREMORDI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6752XCAREMRECF", localUtil.ttoc( Z6752XCAREMRECF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6753XCAREMREGF", localUtil.ttoc( Z6753XCAREMREGF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6754XCAREMARTI", GXutil.rtrim( Z6754XCAREMARTI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6755XCAREMPRVI", GXutil.rtrim( Z6755XCAREMPRVI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6756XCAREMRECC", GXutil.ltrim( localUtil.ntoc( Z6756XCAREMRECC, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6757XCAREMPESC", GXutil.ltrim( localUtil.ntoc( Z6757XCAREMPESC, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6758XCAREMALB", GXutil.rtrim( Z6758XCAREMALB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6759XCAREMEST", GXutil.rtrim( Z6759XCAREMEST));
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
      return formatLink("app.txcarem", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TXCAREM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "XCAREM", "") ;
   }

   public void initializeNonKeyWM968( )
   {
      A6751XCAREMORDI = "" ;
      n6751XCAREMORDI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6751XCAREMORDI", A6751XCAREMORDI);
      A6752XCAREMRECF = GXutil.resetTime( GXutil.nullDate() );
      n6752XCAREMRECF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6752XCAREMRECF", localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6753XCAREMREGF = GXutil.resetTime( GXutil.nullDate() );
      n6753XCAREMREGF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6753XCAREMREGF", localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6754XCAREMARTI = "" ;
      n6754XCAREMARTI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6754XCAREMARTI", A6754XCAREMARTI);
      A6755XCAREMPRVI = "" ;
      n6755XCAREMPRVI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6755XCAREMPRVI", A6755XCAREMPRVI);
      A6756XCAREMRECC = DecimalUtil.ZERO ;
      n6756XCAREMRECC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6756XCAREMRECC", GXutil.ltrimstr( A6756XCAREMRECC, 11, 3));
      A6757XCAREMPESC = DecimalUtil.ZERO ;
      n6757XCAREMPESC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6757XCAREMPESC", GXutil.ltrimstr( A6757XCAREMPESC, 11, 3));
      A6758XCAREMALB = "" ;
      n6758XCAREMALB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6758XCAREMALB", A6758XCAREMALB);
      A6759XCAREMEST = "" ;
      n6759XCAREMEST = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6759XCAREMEST", A6759XCAREMEST);
      Z6751XCAREMORDI = "" ;
      Z6752XCAREMRECF = GXutil.resetTime( GXutil.nullDate() );
      Z6753XCAREMREGF = GXutil.resetTime( GXutil.nullDate() );
      Z6754XCAREMARTI = "" ;
      Z6755XCAREMPRVI = "" ;
      Z6756XCAREMRECC = DecimalUtil.ZERO ;
      Z6757XCAREMPESC = DecimalUtil.ZERO ;
      Z6758XCAREMALB = "" ;
      Z6759XCAREMEST = "" ;
   }

   public void initAllWM968( )
   {
      A6750XCAREMID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6750XCAREMID", A6750XCAREMID);
      initializeNonKeyWM968( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612518591926", true, true);
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
      httpContext.AddJavascriptSource("txcarem.js", "?202612518591926", false, true);
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
      edtXCAREMID_Internalname = "XCAREMID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtXCAREMORDI_Internalname = "XCAREMORDI" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXCAREMRECF_Internalname = "XCAREMRECF" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXCAREMREGF_Internalname = "XCAREMREGF" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXCAREMARTI_Internalname = "XCAREMARTI" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXCAREMPRVI_Internalname = "XCAREMPRVI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXCAREMRECC_Internalname = "XCAREMRECC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXCAREMPESC_Internalname = "XCAREMPESC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXCAREMALB_Internalname = "XCAREMALB" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXCAREMEST_Internalname = "XCAREMEST" ;
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
      Form.setCaption( httpContext.getMessage( "XCAREM", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXCAREMEST_Jsonclick = "" ;
      edtXCAREMEST_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMEST_Enabled = 1 ;
      edtXCAREMALB_Jsonclick = "" ;
      edtXCAREMALB_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMALB_Enabled = 1 ;
      edtXCAREMPESC_Jsonclick = "" ;
      edtXCAREMPESC_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMPESC_Enabled = 1 ;
      edtXCAREMRECC_Jsonclick = "" ;
      edtXCAREMRECC_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMRECC_Enabled = 1 ;
      edtXCAREMPRVI_Jsonclick = "" ;
      edtXCAREMPRVI_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMPRVI_Enabled = 1 ;
      edtXCAREMARTI_Jsonclick = "" ;
      edtXCAREMARTI_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMARTI_Enabled = 1 ;
      edtXCAREMREGF_Jsonclick = "" ;
      edtXCAREMREGF_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMREGF_Enabled = 1 ;
      edtXCAREMRECF_Jsonclick = "" ;
      edtXCAREMRECF_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMRECF_Enabled = 1 ;
      edtXCAREMORDI_Jsonclick = "" ;
      edtXCAREMORDI_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMORDI_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXCAREMID_Jsonclick = "" ;
      edtXCAREMID_Backcolor = (int)(0xFFFFFF) ;
      edtXCAREMID_Enabled = 1 ;
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
      GX_FocusControl = edtXCAREMORDI_Internalname ;
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

   public void valid_Xcaremid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6751XCAREMORDI", GXutil.rtrim( A6751XCAREMORDI));
      httpContext.ajax_rsp_assign_attri("", false, "A6752XCAREMRECF", localUtil.ttoc( A6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6753XCAREMREGF", localUtil.ttoc( A6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6754XCAREMARTI", GXutil.rtrim( A6754XCAREMARTI));
      httpContext.ajax_rsp_assign_attri("", false, "A6755XCAREMPRVI", GXutil.rtrim( A6755XCAREMPRVI));
      httpContext.ajax_rsp_assign_attri("", false, "A6756XCAREMRECC", GXutil.ltrim( localUtil.ntoc( A6756XCAREMRECC, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6757XCAREMPESC", GXutil.ltrim( localUtil.ntoc( A6757XCAREMPESC, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6758XCAREMALB", GXutil.rtrim( A6758XCAREMALB));
      httpContext.ajax_rsp_assign_attri("", false, "A6759XCAREMEST", GXutil.rtrim( A6759XCAREMEST));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6750XCAREMID", GXutil.rtrim( Z6750XCAREMID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6751XCAREMORDI", GXutil.rtrim( Z6751XCAREMORDI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6752XCAREMRECF", localUtil.ttoc( Z6752XCAREMRECF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6753XCAREMREGF", localUtil.ttoc( Z6753XCAREMREGF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6754XCAREMARTI", GXutil.rtrim( Z6754XCAREMARTI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6755XCAREMPRVI", GXutil.rtrim( Z6755XCAREMPRVI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6756XCAREMRECC", GXutil.ltrim( localUtil.ntoc( Z6756XCAREMRECC, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6757XCAREMPESC", GXutil.ltrim( localUtil.ntoc( Z6757XCAREMPESC, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6758XCAREMALB", GXutil.rtrim( Z6758XCAREMALB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6759XCAREMEST", GXutil.rtrim( Z6759XCAREMEST));
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
      setEventMetadata("VALID_XCAREMID","{handler:'valid_Xcaremid',iparms:[{av:'A6750XCAREMID',fld:'XCAREMID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XCAREMID",",oparms:[{av:'A6751XCAREMORDI',fld:'XCAREMORDI',pic:''},{av:'A6752XCAREMRECF',fld:'XCAREMRECF',pic:'99/99/9999 99:99:99'},{av:'A6753XCAREMREGF',fld:'XCAREMREGF',pic:'99/99/9999 99:99:99'},{av:'A6754XCAREMARTI',fld:'XCAREMARTI',pic:''},{av:'A6755XCAREMPRVI',fld:'XCAREMPRVI',pic:''},{av:'A6756XCAREMRECC',fld:'XCAREMRECC',pic:'ZZZZZZZ.999'},{av:'A6757XCAREMPESC',fld:'XCAREMPESC',pic:'ZZZZZZZ.999'},{av:'A6758XCAREMALB',fld:'XCAREMALB',pic:''},{av:'A6759XCAREMEST',fld:'XCAREMEST',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z6750XCAREMID'},{av:'Z6751XCAREMORDI'},{av:'Z6752XCAREMRECF'},{av:'Z6753XCAREMREGF'},{av:'Z6754XCAREMARTI'},{av:'Z6755XCAREMPRVI'},{av:'Z6756XCAREMRECC'},{av:'Z6757XCAREMPESC'},{av:'Z6758XCAREMALB'},{av:'Z6759XCAREMEST'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z6750XCAREMID = "" ;
      Z6751XCAREMORDI = "" ;
      Z6752XCAREMRECF = GXutil.resetTime( GXutil.nullDate() );
      Z6753XCAREMREGF = GXutil.resetTime( GXutil.nullDate() );
      Z6754XCAREMARTI = "" ;
      Z6755XCAREMPRVI = "" ;
      Z6756XCAREMRECC = DecimalUtil.ZERO ;
      Z6757XCAREMPESC = DecimalUtil.ZERO ;
      Z6758XCAREMALB = "" ;
      Z6759XCAREMEST = "" ;
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
      A6750XCAREMID = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A6751XCAREMORDI = "" ;
      lblTextblock3_Jsonclick = "" ;
      A6752XCAREMRECF = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock4_Jsonclick = "" ;
      A6753XCAREMREGF = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock5_Jsonclick = "" ;
      A6754XCAREMARTI = "" ;
      lblTextblock6_Jsonclick = "" ;
      A6755XCAREMPRVI = "" ;
      lblTextblock7_Jsonclick = "" ;
      A6756XCAREMRECC = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A6757XCAREMPESC = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A6758XCAREMALB = "" ;
      lblTextblock10_Jsonclick = "" ;
      A6759XCAREMEST = "" ;
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
      T00WM4_A6750XCAREMID = new String[] {""} ;
      T00WM4_A6751XCAREMORDI = new String[] {""} ;
      T00WM4_n6751XCAREMORDI = new boolean[] {false} ;
      T00WM4_A6752XCAREMRECF = new java.util.Date[] {GXutil.nullDate()} ;
      T00WM4_n6752XCAREMRECF = new boolean[] {false} ;
      T00WM4_A6753XCAREMREGF = new java.util.Date[] {GXutil.nullDate()} ;
      T00WM4_n6753XCAREMREGF = new boolean[] {false} ;
      T00WM4_A6754XCAREMARTI = new String[] {""} ;
      T00WM4_n6754XCAREMARTI = new boolean[] {false} ;
      T00WM4_A6755XCAREMPRVI = new String[] {""} ;
      T00WM4_n6755XCAREMPRVI = new boolean[] {false} ;
      T00WM4_A6756XCAREMRECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WM4_n6756XCAREMRECC = new boolean[] {false} ;
      T00WM4_A6757XCAREMPESC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WM4_n6757XCAREMPESC = new boolean[] {false} ;
      T00WM4_A6758XCAREMALB = new String[] {""} ;
      T00WM4_n6758XCAREMALB = new boolean[] {false} ;
      T00WM4_A6759XCAREMEST = new String[] {""} ;
      T00WM4_n6759XCAREMEST = new boolean[] {false} ;
      T00WM5_A6750XCAREMID = new String[] {""} ;
      T00WM3_A6750XCAREMID = new String[] {""} ;
      T00WM3_A6751XCAREMORDI = new String[] {""} ;
      T00WM3_n6751XCAREMORDI = new boolean[] {false} ;
      T00WM3_A6752XCAREMRECF = new java.util.Date[] {GXutil.nullDate()} ;
      T00WM3_n6752XCAREMRECF = new boolean[] {false} ;
      T00WM3_A6753XCAREMREGF = new java.util.Date[] {GXutil.nullDate()} ;
      T00WM3_n6753XCAREMREGF = new boolean[] {false} ;
      T00WM3_A6754XCAREMARTI = new String[] {""} ;
      T00WM3_n6754XCAREMARTI = new boolean[] {false} ;
      T00WM3_A6755XCAREMPRVI = new String[] {""} ;
      T00WM3_n6755XCAREMPRVI = new boolean[] {false} ;
      T00WM3_A6756XCAREMRECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WM3_n6756XCAREMRECC = new boolean[] {false} ;
      T00WM3_A6757XCAREMPESC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WM3_n6757XCAREMPESC = new boolean[] {false} ;
      T00WM3_A6758XCAREMALB = new String[] {""} ;
      T00WM3_n6758XCAREMALB = new boolean[] {false} ;
      T00WM3_A6759XCAREMEST = new String[] {""} ;
      T00WM3_n6759XCAREMEST = new boolean[] {false} ;
      sMode968 = "" ;
      T00WM6_A6750XCAREMID = new String[] {""} ;
      T00WM7_A6750XCAREMID = new String[] {""} ;
      T00WM2_A6750XCAREMID = new String[] {""} ;
      T00WM2_A6751XCAREMORDI = new String[] {""} ;
      T00WM2_n6751XCAREMORDI = new boolean[] {false} ;
      T00WM2_A6752XCAREMRECF = new java.util.Date[] {GXutil.nullDate()} ;
      T00WM2_n6752XCAREMRECF = new boolean[] {false} ;
      T00WM2_A6753XCAREMREGF = new java.util.Date[] {GXutil.nullDate()} ;
      T00WM2_n6753XCAREMREGF = new boolean[] {false} ;
      T00WM2_A6754XCAREMARTI = new String[] {""} ;
      T00WM2_n6754XCAREMARTI = new boolean[] {false} ;
      T00WM2_A6755XCAREMPRVI = new String[] {""} ;
      T00WM2_n6755XCAREMPRVI = new boolean[] {false} ;
      T00WM2_A6756XCAREMRECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WM2_n6756XCAREMRECC = new boolean[] {false} ;
      T00WM2_A6757XCAREMPESC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00WM2_n6757XCAREMPESC = new boolean[] {false} ;
      T00WM2_A6758XCAREMALB = new String[] {""} ;
      T00WM2_n6758XCAREMALB = new boolean[] {false} ;
      T00WM2_A6759XCAREMEST = new String[] {""} ;
      T00WM2_n6759XCAREMEST = new boolean[] {false} ;
      T00WM11_A6750XCAREMID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ6750XCAREMID = "" ;
      ZZ6751XCAREMORDI = "" ;
      ZZ6752XCAREMRECF = GXutil.resetTime( GXutil.nullDate() );
      ZZ6753XCAREMREGF = GXutil.resetTime( GXutil.nullDate() );
      ZZ6754XCAREMARTI = "" ;
      ZZ6755XCAREMPRVI = "" ;
      ZZ6756XCAREMRECC = DecimalUtil.ZERO ;
      ZZ6757XCAREMPESC = DecimalUtil.ZERO ;
      ZZ6758XCAREMALB = "" ;
      ZZ6759XCAREMEST = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txcarem__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txcarem__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txcarem__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txcarem__default(),
         new Object[] {
             new Object[] {
            T00WM2_A6750XCAREMID, T00WM2_A6751XCAREMORDI, T00WM2_n6751XCAREMORDI, T00WM2_A6752XCAREMRECF, T00WM2_n6752XCAREMRECF, T00WM2_A6753XCAREMREGF, T00WM2_n6753XCAREMREGF, T00WM2_A6754XCAREMARTI, T00WM2_n6754XCAREMARTI, T00WM2_A6755XCAREMPRVI,
            T00WM2_n6755XCAREMPRVI, T00WM2_A6756XCAREMRECC, T00WM2_n6756XCAREMRECC, T00WM2_A6757XCAREMPESC, T00WM2_n6757XCAREMPESC, T00WM2_A6758XCAREMALB, T00WM2_n6758XCAREMALB, T00WM2_A6759XCAREMEST, T00WM2_n6759XCAREMEST
            }
            , new Object[] {
            T00WM3_A6750XCAREMID, T00WM3_A6751XCAREMORDI, T00WM3_n6751XCAREMORDI, T00WM3_A6752XCAREMRECF, T00WM3_n6752XCAREMRECF, T00WM3_A6753XCAREMREGF, T00WM3_n6753XCAREMREGF, T00WM3_A6754XCAREMARTI, T00WM3_n6754XCAREMARTI, T00WM3_A6755XCAREMPRVI,
            T00WM3_n6755XCAREMPRVI, T00WM3_A6756XCAREMRECC, T00WM3_n6756XCAREMRECC, T00WM3_A6757XCAREMPESC, T00WM3_n6757XCAREMPESC, T00WM3_A6758XCAREMALB, T00WM3_n6758XCAREMALB, T00WM3_A6759XCAREMEST, T00WM3_n6759XCAREMEST
            }
            , new Object[] {
            T00WM4_A6750XCAREMID, T00WM4_A6751XCAREMORDI, T00WM4_n6751XCAREMORDI, T00WM4_A6752XCAREMRECF, T00WM4_n6752XCAREMRECF, T00WM4_A6753XCAREMREGF, T00WM4_n6753XCAREMREGF, T00WM4_A6754XCAREMARTI, T00WM4_n6754XCAREMARTI, T00WM4_A6755XCAREMPRVI,
            T00WM4_n6755XCAREMPRVI, T00WM4_A6756XCAREMRECC, T00WM4_n6756XCAREMRECC, T00WM4_A6757XCAREMPESC, T00WM4_n6757XCAREMPESC, T00WM4_A6758XCAREMALB, T00WM4_n6758XCAREMALB, T00WM4_A6759XCAREMEST, T00WM4_n6759XCAREMEST
            }
            , new Object[] {
            T00WM5_A6750XCAREMID
            }
            , new Object[] {
            T00WM6_A6750XCAREMID
            }
            , new Object[] {
            T00WM7_A6750XCAREMID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00WM11_A6750XCAREMID
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound968 ;
   private short nIsDirty_968 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtXCAREMID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXCAREMORDI_Enabled ;
   private int edtXCAREMRECF_Enabled ;
   private int edtXCAREMREGF_Enabled ;
   private int edtXCAREMARTI_Enabled ;
   private int edtXCAREMPRVI_Enabled ;
   private int edtXCAREMRECC_Enabled ;
   private int edtXCAREMPESC_Enabled ;
   private int edtXCAREMALB_Enabled ;
   private int edtXCAREMEST_Enabled ;
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
   private int edtXCAREMEST_Backcolor ;
   private int edtXCAREMALB_Backcolor ;
   private int edtXCAREMPESC_Backcolor ;
   private int edtXCAREMRECC_Backcolor ;
   private int edtXCAREMPRVI_Backcolor ;
   private int edtXCAREMARTI_Backcolor ;
   private int edtXCAREMREGF_Backcolor ;
   private int edtXCAREMRECF_Backcolor ;
   private int edtXCAREMORDI_Backcolor ;
   private int edtXCAREMID_Backcolor ;
   private java.math.BigDecimal Z6756XCAREMRECC ;
   private java.math.BigDecimal Z6757XCAREMPESC ;
   private java.math.BigDecimal A6756XCAREMRECC ;
   private java.math.BigDecimal A6757XCAREMPESC ;
   private java.math.BigDecimal ZZ6756XCAREMRECC ;
   private java.math.BigDecimal ZZ6757XCAREMPESC ;
   private String sPrefix ;
   private String Z6750XCAREMID ;
   private String Z6751XCAREMORDI ;
   private String Z6754XCAREMARTI ;
   private String Z6755XCAREMPRVI ;
   private String Z6758XCAREMALB ;
   private String Z6759XCAREMEST ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXCAREMID_Internalname ;
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
   private String A6750XCAREMID ;
   private String edtXCAREMID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtXCAREMORDI_Internalname ;
   private String A6751XCAREMORDI ;
   private String edtXCAREMORDI_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXCAREMRECF_Internalname ;
   private String edtXCAREMRECF_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXCAREMREGF_Internalname ;
   private String edtXCAREMREGF_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXCAREMARTI_Internalname ;
   private String A6754XCAREMARTI ;
   private String edtXCAREMARTI_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXCAREMPRVI_Internalname ;
   private String A6755XCAREMPRVI ;
   private String edtXCAREMPRVI_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXCAREMRECC_Internalname ;
   private String edtXCAREMRECC_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXCAREMPESC_Internalname ;
   private String edtXCAREMPESC_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXCAREMALB_Internalname ;
   private String A6758XCAREMALB ;
   private String edtXCAREMALB_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXCAREMEST_Internalname ;
   private String A6759XCAREMEST ;
   private String edtXCAREMEST_Jsonclick ;
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
   private String sMode968 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ6750XCAREMID ;
   private String ZZ6751XCAREMORDI ;
   private String ZZ6754XCAREMARTI ;
   private String ZZ6755XCAREMPRVI ;
   private String ZZ6758XCAREMALB ;
   private String ZZ6759XCAREMEST ;
   private java.util.Date Z6752XCAREMRECF ;
   private java.util.Date Z6753XCAREMREGF ;
   private java.util.Date A6752XCAREMRECF ;
   private java.util.Date A6753XCAREMREGF ;
   private java.util.Date ZZ6752XCAREMRECF ;
   private java.util.Date ZZ6753XCAREMREGF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6751XCAREMORDI ;
   private boolean n6752XCAREMRECF ;
   private boolean n6753XCAREMREGF ;
   private boolean n6754XCAREMARTI ;
   private boolean n6755XCAREMPRVI ;
   private boolean n6756XCAREMRECC ;
   private boolean n6757XCAREMPESC ;
   private boolean n6758XCAREMALB ;
   private boolean n6759XCAREMEST ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T00WM4_A6750XCAREMID ;
   private String[] T00WM4_A6751XCAREMORDI ;
   private boolean[] T00WM4_n6751XCAREMORDI ;
   private java.util.Date[] T00WM4_A6752XCAREMRECF ;
   private boolean[] T00WM4_n6752XCAREMRECF ;
   private java.util.Date[] T00WM4_A6753XCAREMREGF ;
   private boolean[] T00WM4_n6753XCAREMREGF ;
   private String[] T00WM4_A6754XCAREMARTI ;
   private boolean[] T00WM4_n6754XCAREMARTI ;
   private String[] T00WM4_A6755XCAREMPRVI ;
   private boolean[] T00WM4_n6755XCAREMPRVI ;
   private java.math.BigDecimal[] T00WM4_A6756XCAREMRECC ;
   private boolean[] T00WM4_n6756XCAREMRECC ;
   private java.math.BigDecimal[] T00WM4_A6757XCAREMPESC ;
   private boolean[] T00WM4_n6757XCAREMPESC ;
   private String[] T00WM4_A6758XCAREMALB ;
   private boolean[] T00WM4_n6758XCAREMALB ;
   private String[] T00WM4_A6759XCAREMEST ;
   private boolean[] T00WM4_n6759XCAREMEST ;
   private String[] T00WM5_A6750XCAREMID ;
   private String[] T00WM3_A6750XCAREMID ;
   private String[] T00WM3_A6751XCAREMORDI ;
   private boolean[] T00WM3_n6751XCAREMORDI ;
   private java.util.Date[] T00WM3_A6752XCAREMRECF ;
   private boolean[] T00WM3_n6752XCAREMRECF ;
   private java.util.Date[] T00WM3_A6753XCAREMREGF ;
   private boolean[] T00WM3_n6753XCAREMREGF ;
   private String[] T00WM3_A6754XCAREMARTI ;
   private boolean[] T00WM3_n6754XCAREMARTI ;
   private String[] T00WM3_A6755XCAREMPRVI ;
   private boolean[] T00WM3_n6755XCAREMPRVI ;
   private java.math.BigDecimal[] T00WM3_A6756XCAREMRECC ;
   private boolean[] T00WM3_n6756XCAREMRECC ;
   private java.math.BigDecimal[] T00WM3_A6757XCAREMPESC ;
   private boolean[] T00WM3_n6757XCAREMPESC ;
   private String[] T00WM3_A6758XCAREMALB ;
   private boolean[] T00WM3_n6758XCAREMALB ;
   private String[] T00WM3_A6759XCAREMEST ;
   private boolean[] T00WM3_n6759XCAREMEST ;
   private String[] T00WM6_A6750XCAREMID ;
   private String[] T00WM7_A6750XCAREMID ;
   private String[] T00WM2_A6750XCAREMID ;
   private String[] T00WM2_A6751XCAREMORDI ;
   private boolean[] T00WM2_n6751XCAREMORDI ;
   private java.util.Date[] T00WM2_A6752XCAREMRECF ;
   private boolean[] T00WM2_n6752XCAREMRECF ;
   private java.util.Date[] T00WM2_A6753XCAREMREGF ;
   private boolean[] T00WM2_n6753XCAREMREGF ;
   private String[] T00WM2_A6754XCAREMARTI ;
   private boolean[] T00WM2_n6754XCAREMARTI ;
   private String[] T00WM2_A6755XCAREMPRVI ;
   private boolean[] T00WM2_n6755XCAREMPRVI ;
   private java.math.BigDecimal[] T00WM2_A6756XCAREMRECC ;
   private boolean[] T00WM2_n6756XCAREMRECC ;
   private java.math.BigDecimal[] T00WM2_A6757XCAREMPESC ;
   private boolean[] T00WM2_n6757XCAREMPESC ;
   private String[] T00WM2_A6758XCAREMALB ;
   private boolean[] T00WM2_n6758XCAREMALB ;
   private String[] T00WM2_A6759XCAREMEST ;
   private boolean[] T00WM2_n6759XCAREMEST ;
   private String[] T00WM11_A6750XCAREMID ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txcarem__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txcarem__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txcarem__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txcarem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00WM2", "SELECT XCAREMID, XCAREMORDI, XCAREMRECF, XCAREMREGF, XCAREMARTI, XCAREMPRVI, XCAREMRECC, XCAREMPESC, XCAREMALB, XCAREMEST FROM TXPXCAREM WHERE XCAREMID = ?  FOR UPDATE OF XCAREMORDI, XCAREMRECF, XCAREMREGF, XCAREMARTI, XCAREMPRVI, XCAREMRECC, XCAREMPESC, XCAREMALB, XCAREMEST NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WM3", "SELECT XCAREMID, XCAREMORDI, XCAREMRECF, XCAREMREGF, XCAREMARTI, XCAREMPRVI, XCAREMRECC, XCAREMPESC, XCAREMALB, XCAREMEST FROM TXPXCAREM WHERE XCAREMID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WM4", "SELECT /*+ FIRST_ROWS(100) */ TM1.XCAREMID, TM1.XCAREMORDI, TM1.XCAREMRECF, TM1.XCAREMREGF, TM1.XCAREMARTI, TM1.XCAREMPRVI, TM1.XCAREMRECC, TM1.XCAREMPESC, TM1.XCAREMALB, TM1.XCAREMEST FROM TXPXCAREM TM1 WHERE TM1.XCAREMID = ? ORDER BY TM1.XCAREMID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WM5", "SELECT /*+ FIRST_ROWS(1) */ XCAREMID FROM TXPXCAREM WHERE XCAREMID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00WM6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XCAREMID FROM TXPXCAREM WHERE ( XCAREMID > ?) ORDER BY XCAREMID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00WM7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XCAREMID FROM TXPXCAREM WHERE ( XCAREMID < ?) ORDER BY XCAREMID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00WM8", "INSERT INTO TXPXCAREM(XCAREMID, XCAREMORDI, XCAREMRECF, XCAREMREGF, XCAREMARTI, XCAREMPRVI, XCAREMRECC, XCAREMPESC, XCAREMALB, XCAREMEST) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXCAREM")
         ,new UpdateCursor("T00WM9", "UPDATE TXPXCAREM SET XCAREMORDI=?, XCAREMRECF=?, XCAREMREGF=?, XCAREMARTI=?, XCAREMPRVI=?, XCAREMRECC=?, XCAREMPESC=?, XCAREMALB=?, XCAREMEST=?  WHERE XCAREMID = ?", GX_NOMASK, "TXPXCAREM")
         ,new UpdateCursor("T00WM10", "DELETE FROM TXPXCAREM  WHERE XCAREMID = ?", GX_NOMASK, "TXPXCAREM")
         ,new ForEachCursor("T00WM11", "SELECT /*+ FIRST_ROWS(100) */ XCAREMID FROM TXPXCAREM ORDER BY XCAREMID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 27);
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
               stmt.setString(1, (String)parms[0], 27);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 27);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 27);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 27);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 27);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 27);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 27);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 10);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 12);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 12);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               stmt.setString(10, (String)parms[18], 27);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 27);
               return;
      }
   }

}

