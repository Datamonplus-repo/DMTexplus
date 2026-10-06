package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trenfas_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RENUMERACION DE FASES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRenTerCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public trenfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trenfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trenfas_impl.class ));
   }

   public trenfas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRENFAS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Codigo de Terminal", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenTerCod_Internalname, GXutil.rtrim( A1654RenTerCod), GXutil.rtrim( localUtil.format( A1654RenTerCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenTerCod_Jsonclick, 0, "", "", "", "", "", 1, edtRenTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "CodPro", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodPro_Internalname, GXutil.rtrim( A308CodPro), GXutil.rtrim( localUtil.format( A308CodPro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodPro_Jsonclick, 0, "", "", "", "", "", 1, edtCodPro_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "OrdLin", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "RenFasEst", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A816RenFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A816RenFasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A816RenFasEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasEst_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "RenFecTeo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRenFecTeo_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFecTeo_Internalname, localUtil.format(A818RenFecTeo, "99/99/99"), localUtil.format( A818RenFecTeo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFecTeo_Jsonclick, 0, "", "", "", "", "", 1, edtRenFecTeo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRenFecTeo_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRenFecTeo_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRENFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "RenFecRea", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRenFecRea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFecRea_Internalname, localUtil.format(A817RenFecRea, "99/99/99"), localUtil.format( A817RenFecRea, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFecRea_Jsonclick, 0, "", "", "", "", "", 1, edtRenFecRea_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRenFecRea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRenFecRea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRENFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha real de inicio", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRenFecRIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFecRIni_Internalname, localUtil.format(A3297RenFecRIni, "99/99/99"), localUtil.format( A3297RenFecRIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFecRIni_Jsonclick, 0, "", "", "", "", "", 1, edtRenFecRIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRenFecRIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRenFecRIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRENFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "RenTieTeo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenTieTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A824RenTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenTieTeo_Enabled!=0) ? localUtil.format( A824RenTieTeo, "Z9.99") : localUtil.format( A824RenTieTeo, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenTieTeo_Jsonclick, 0, "", "", "", "", "", 1, edtRenTieTeo_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "RenUni", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenUni_Internalname, GXutil.ltrim( localUtil.ntoc( A825RenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenUni_Enabled!=0) ? localUtil.format( A825RenUni, "ZZZZZ9.99") : localUtil.format( A825RenUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenUni_Jsonclick, 0, "", "", "", "", "", 1, edtRenUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "RenLoc", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenLoc_Internalname, GXutil.rtrim( A821RenLoc), GXutil.rtrim( localUtil.format( A821RenLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenLoc_Jsonclick, 0, "", "", "", "", "", 1, edtRenLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "RenHorIni", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenHorIni_Internalname, GXutil.ltrim( localUtil.ntoc( A820RenHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenHorIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A820RenHorIni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A820RenHorIni), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenHorIni_Jsonclick, 0, "", "", "", "", "", 1, edtRenHorIni_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "RenHorFin", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenHorFin_Internalname, GXutil.ltrim( localUtil.ntoc( A819RenHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenHorFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A819RenHorFin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A819RenHorFin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenHorFin_Jsonclick, 0, "", "", "", "", "", 1, edtRenHorFin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "RenTieRea", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenTieRea_Internalname, GXutil.ltrim( localUtil.ntoc( A823RenTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenTieRea_Enabled!=0) ? localUtil.format( A823RenTieRea, "Z9.99") : localUtil.format( A823RenTieRea, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenTieRea_Jsonclick, 0, "", "", "", "", "", 1, edtRenTieRea_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "RenMaqCod", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenMaqCod_Internalname, GXutil.rtrim( A822RenMaqCod), GXutil.rtrim( localUtil.format( A822RenMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtRenMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "RenFasCon", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasCon_Internalname, GXutil.rtrim( A815RenFasCon), GXutil.rtrim( localUtil.format( A815RenFasCon, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasCon_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasCon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "RenFacTin", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFacTin_Internalname, GXutil.rtrim( A814RenFacTin), GXutil.rtrim( localUtil.format( A814RenFacTin, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFacTin_Jsonclick, 0, "", "", "", "", "", 1, edtRenFacTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "RenOrdLin", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4593RenOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4593RenOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4593RenOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtRenOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "RenFasPri", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasPri_Internalname, GXutil.ltrim( localUtil.ntoc( A4734RenFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4734RenFasPri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4734RenFasPri), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasPri_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasPri_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "RenFasKgm", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A4735RenFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasKgm_Enabled!=0) ? localUtil.format( A4735RenFasKgm, "ZZZZZ9.99") : localUtil.format( A4735RenFasKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasKgm_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "RenFasMtr", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4736RenFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasMtr_Enabled!=0) ? localUtil.format( A4736RenFasMtr, "ZZZZZ9.99") : localUtil.format( A4736RenFasMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasMtr_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "RenFasBot", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasBot_Internalname, GXutil.rtrim( A4737RenFasBot), GXutil.rtrim( localUtil.format( A4737RenFasBot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasBot_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasBot_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "RenNumBot", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenNumBot_Internalname, GXutil.ltrim( localUtil.ntoc( A4738RenNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenNumBot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4738RenNumBot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4738RenNumBot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenNumBot_Jsonclick, 0, "", "", "", "", "", 1, edtRenNumBot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "RenFasFor", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasFor_Internalname, GXutil.rtrim( A4739RenFasFor), GXutil.rtrim( localUtil.format( A4739RenFasFor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasFor_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasFor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "RenFasPzas", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4740RenFasPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4740RenFasPzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4740RenFasPzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasPzas_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasPzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "RenFasCop", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasCop_Internalname, GXutil.rtrim( A4741RenFasCop), GXutil.rtrim( localUtil.format( A4741RenFasCop, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasCop_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasCop_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "RenBarUltL", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenBarUltL_Internalname, GXutil.ltrim( localUtil.ntoc( A4742RenBarUltL, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenBarUltL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4742RenBarUltL), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4742RenBarUltL), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenBarUltL_Jsonclick, 0, "", "", "", "", "", 1, edtRenBarUltL_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "RenFasCara", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasCara_Internalname, GXutil.rtrim( A4743RenFasCara), GXutil.rtrim( localUtil.format( A4743RenFasCara, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasCara_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasCara_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Fase de Acabado", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasAcab_Internalname, GXutil.rtrim( A4904RenFasAcab), GXutil.rtrim( localUtil.format( A4904RenFasAcab, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasAcab_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasAcab_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Fase Generica?", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasGral_Internalname, GXutil.rtrim( A5370RenFasGral), GXutil.rtrim( localUtil.format( A5370RenFasGral, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasGral_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasGral_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Maquina Planing", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenMaqPlan_Internalname, GXutil.rtrim( A5897RenMaqPlan), GXutil.rtrim( localUtil.format( A5897RenMaqPlan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenMaqPlan_Jsonclick, 0, "", "", "", "", "", 1, edtRenMaqPlan_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Kgs Totales", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasKgT_Internalname, GXutil.ltrim( localUtil.ntoc( A5992RenFasKgT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasKgT_Enabled!=0) ? localUtil.format( A5992RenFasKgT, "ZZZZZ9.99") : localUtil.format( A5992RenFasKgT, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasKgT_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasKgT_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Metros Totales", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasMtT_Internalname, GXutil.ltrim( localUtil.ntoc( A5993RenFasMtT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenFasMtT_Enabled!=0) ? localUtil.format( A5993RenFasMtT, "ZZZZZ9.99") : localUtil.format( A5993RenFasMtT, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasMtT_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasMtT_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Tipo Fase (L o T)", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasTip_Internalname, GXutil.rtrim( A6013RenFasTip), GXutil.rtrim( localUtil.format( A6013RenFasTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasTip_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasSec_Internalname, GXutil.rtrim( A6172RenFasSec), GXutil.rtrim( localUtil.format( A6172RenFasSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasSec_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasSec_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Hdr Minina", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenFasMn_Internalname, GXutil.rtrim( A6393RenFasMn), GXutil.rtrim( localUtil.format( A6393RenFasMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenFasMn_Jsonclick, 0, "", "", "", "", "", 1, edtRenFasMn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Orden secuencia Planing", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasOP_Internalname, GXutil.ltrim( localUtil.ntoc( A6394RenfasOP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfasOP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6394RenfasOP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6394RenfasOP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasOP_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasOP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Hdr Minina Agrupada Tinte", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenHdMn_Internalname, GXutil.rtrim( A6395RenHdMn), GXutil.rtrim( localUtil.format( A6395RenHdMn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenHdMn_Jsonclick, 0, "", "", "", "", "", 1, edtRenHdMn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "RenfasRb", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasRb_Internalname, GXutil.ltrim( localUtil.ntoc( A8472RenfasRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfasRb_Enabled!=0) ? localUtil.format( A8472RenfasRb, "ZZZ9.99") : localUtil.format( A8472RenfasRb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasRb_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasRb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Renfasinc", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasinc_Internalname, GXutil.ltrim( localUtil.ntoc( A8490Renfasinc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfasinc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8490Renfasinc), "9") : localUtil.format( DecimalUtil.doubleToDec(A8490Renfasinc), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasinc_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasinc_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Renfasdti", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRenfasdti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasdti_Internalname, localUtil.ttoc( A8491Renfasdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8491Renfasdti, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasdti_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasdti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRenfasdti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRenfasdti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRENFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Renfasdtf", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRenfasdtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasdtf_Internalname, localUtil.ttoc( A8492Renfasdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8492Renfasdtf, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasdtf_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasdtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRenfasdtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRenfasdtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRENFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Renfaskpr", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfaskpr_Internalname, GXutil.ltrim( localUtil.ntoc( A8493Renfaskpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfaskpr_Enabled!=0) ? localUtil.format( A8493Renfaskpr, "ZZZZZ9.99") : localUtil.format( A8493Renfaskpr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfaskpr_Jsonclick, 0, "", "", "", "", "", 1, edtRenfaskpr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "RenfasPpr", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasPpr_Internalname, GXutil.ltrim( localUtil.ntoc( A8494RenfasPpr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfasPpr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8494RenfasPpr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8494RenfasPpr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasPpr_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasPpr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Renfasagr", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasagr_Internalname, GXutil.rtrim( A8495Renfasagr), GXutil.rtrim( localUtil.format( A8495Renfasagr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasagr_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasagr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Renfasprp", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasprp_Internalname, GXutil.rtrim( A8496Renfasprp), GXutil.rtrim( localUtil.format( A8496Renfasprp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasprp_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasprp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Renfasfpl", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRenfasfpl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasfpl_Internalname, localUtil.format(A8497Renfasfpl, "99/99/99"), localUtil.format( A8497Renfasfpl, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasfpl_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasfpl_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRenfasfpl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRenfasfpl_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRENFAS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Renfasusu", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasusu_Internalname, GXutil.rtrim( A8498Renfasusu), GXutil.rtrim( localUtil.format( A8498Renfasusu, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasusu_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasusu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Renquiul", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenquiul_Internalname, GXutil.ltrim( localUtil.ntoc( A8499Renquiul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenquiul_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8499Renquiul), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8499Renquiul), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenquiul_Jsonclick, 0, "", "", "", "", "", 1, edtRenquiul_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Renfascr", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfascr_Internalname, GXutil.ltrim( localUtil.ntoc( A8500Renfascr, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfascr_Enabled!=0) ? localUtil.format( A8500Renfascr, "ZZZZ9.99999") : localUtil.format( A8500Renfascr, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfascr_Jsonclick, 0, "", "", "", "", "", 1, edtRenfascr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Rentieaut", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRentieaut_Internalname, GXutil.ltrim( localUtil.ntoc( A8501Rentieaut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRentieaut_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8501Rentieaut), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8501Rentieaut), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRentieaut_Jsonclick, 0, "", "", "", "", "", 1, edtRentieaut_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Renfasnpl", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasnpl_Internalname, GXutil.ltrim( localUtil.ntoc( A8502Renfasnpl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfasnpl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8502Renfasnpl), "9") : localUtil.format( DecimalUtil.doubleToDec(A8502Renfasnpl), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasnpl_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasnpl_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Renfastpp", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfastpp_Internalname, GXutil.ltrim( localUtil.ntoc( A8503Renfastpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfastpp_Enabled!=0) ? localUtil.format( A8503Renfastpp, "ZZZ9.99") : localUtil.format( A8503Renfastpp, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfastpp_Jsonclick, 0, "", "", "", "", "", 1, edtRenfastpp_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Renfasunpl", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfasunpl_Internalname, GXutil.ltrim( localUtil.ntoc( A8504Renfasunpl, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfasunpl_Enabled!=0) ? localUtil.format( A8504Renfasunpl, "ZZZ9.99") : localUtil.format( A8504Renfasunpl, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfasunpl_Jsonclick, 0, "", "", "", "", "", 1, edtRenfasunpl_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Renuord", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenuord_Internalname, GXutil.ltrim( localUtil.ntoc( A8505Renuord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenuord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8505Renuord), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8505Renuord), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenuord_Jsonclick, 0, "", "", "", "", "", 1, edtRenuord_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Hdr Origen", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenHdrO_Internalname, GXutil.rtrim( A8595RenHdrO), GXutil.rtrim( localUtil.format( A8595RenHdrO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenHdrO_Jsonclick, 0, "", "", "", "", "", 1, edtRenHdrO_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Renfaspri2", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRenfaspri2_Internalname, GXutil.ltrim( localUtil.ntoc( A8939Renfaspri2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRenfaspri2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8939Renfaspri2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8939Renfaspri2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRenfaspri2_Jsonclick, 0, "", "", "", "", "", 1, edtRenfaspri2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "RenObsF", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRenObsF_Internalname, A9856RenObsF, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,306);\"", (short)(0), 1, edtRenObsF_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Observaciones Blanqueo", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRenObsB_Internalname, A10130RenObsB, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,311);\"", (short)(0), 1, edtRenObsB_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TRENFAS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 315,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 317,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRENFAS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 318,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRENFAS.htm");
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
         Z1654RenTerCod = httpContext.cgiGet( "Z1654RenTerCod") ;
         Z308CodPro = httpContext.cgiGet( "Z308CodPro") ;
         Z654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z654OrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         Z816RenFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z816RenFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z818RenFecTeo = localUtil.ctod( httpContext.cgiGet( "Z818RenFecTeo"), 0) ;
         Z817RenFecRea = localUtil.ctod( httpContext.cgiGet( "Z817RenFecRea"), 0) ;
         Z3297RenFecRIni = localUtil.ctod( httpContext.cgiGet( "Z3297RenFecRIni"), 0) ;
         Z824RenTieTeo = localUtil.ctond( httpContext.cgiGet( "Z824RenTieTeo")) ;
         Z825RenUni = localUtil.ctond( httpContext.cgiGet( "Z825RenUni")) ;
         Z821RenLoc = httpContext.cgiGet( "Z821RenLoc") ;
         Z820RenHorIni = (short)(localUtil.ctol( httpContext.cgiGet( "Z820RenHorIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z819RenHorFin = (short)(localUtil.ctol( httpContext.cgiGet( "Z819RenHorFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z823RenTieRea = localUtil.ctond( httpContext.cgiGet( "Z823RenTieRea")) ;
         Z822RenMaqCod = httpContext.cgiGet( "Z822RenMaqCod") ;
         Z815RenFasCon = httpContext.cgiGet( "Z815RenFasCon") ;
         Z814RenFacTin = httpContext.cgiGet( "Z814RenFacTin") ;
         Z4593RenOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4593RenOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4734RenFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4734RenFasPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4735RenFasKgm = localUtil.ctond( httpContext.cgiGet( "Z4735RenFasKgm")) ;
         Z4736RenFasMtr = localUtil.ctond( httpContext.cgiGet( "Z4736RenFasMtr")) ;
         Z4737RenFasBot = httpContext.cgiGet( "Z4737RenFasBot") ;
         Z4738RenNumBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4738RenNumBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4739RenFasFor = httpContext.cgiGet( "Z4739RenFasFor") ;
         Z4740RenFasPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z4740RenFasPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4741RenFasCop = httpContext.cgiGet( "Z4741RenFasCop") ;
         Z4742RenBarUltL = (int)(localUtil.ctol( httpContext.cgiGet( "Z4742RenBarUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4743RenFasCara = httpContext.cgiGet( "Z4743RenFasCara") ;
         Z4904RenFasAcab = httpContext.cgiGet( "Z4904RenFasAcab") ;
         Z5370RenFasGral = httpContext.cgiGet( "Z5370RenFasGral") ;
         Z5897RenMaqPlan = httpContext.cgiGet( "Z5897RenMaqPlan") ;
         Z5992RenFasKgT = localUtil.ctond( httpContext.cgiGet( "Z5992RenFasKgT")) ;
         Z5993RenFasMtT = localUtil.ctond( httpContext.cgiGet( "Z5993RenFasMtT")) ;
         Z6013RenFasTip = httpContext.cgiGet( "Z6013RenFasTip") ;
         Z6172RenFasSec = httpContext.cgiGet( "Z6172RenFasSec") ;
         Z6393RenFasMn = httpContext.cgiGet( "Z6393RenFasMn") ;
         Z6394RenfasOP = (short)(localUtil.ctol( httpContext.cgiGet( "Z6394RenfasOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6395RenHdMn = httpContext.cgiGet( "Z6395RenHdMn") ;
         Z8472RenfasRb = localUtil.ctond( httpContext.cgiGet( "Z8472RenfasRb")) ;
         Z8490Renfasinc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8490Renfasinc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8491Renfasdti = localUtil.ctot( httpContext.cgiGet( "Z8491Renfasdti"), 0) ;
         Z8492Renfasdtf = localUtil.ctot( httpContext.cgiGet( "Z8492Renfasdtf"), 0) ;
         Z8493Renfaskpr = localUtil.ctond( httpContext.cgiGet( "Z8493Renfaskpr")) ;
         Z8494RenfasPpr = (short)(localUtil.ctol( httpContext.cgiGet( "Z8494RenfasPpr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8495Renfasagr = httpContext.cgiGet( "Z8495Renfasagr") ;
         Z8496Renfasprp = httpContext.cgiGet( "Z8496Renfasprp") ;
         Z8497Renfasfpl = localUtil.ctod( httpContext.cgiGet( "Z8497Renfasfpl"), 0) ;
         Z8498Renfasusu = httpContext.cgiGet( "Z8498Renfasusu") ;
         Z8499Renquiul = (short)(localUtil.ctol( httpContext.cgiGet( "Z8499Renquiul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8500Renfascr = localUtil.ctond( httpContext.cgiGet( "Z8500Renfascr")) ;
         Z8501Rentieaut = (short)(localUtil.ctol( httpContext.cgiGet( "Z8501Rentieaut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8502Renfasnpl = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8502Renfasnpl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8503Renfastpp = localUtil.ctond( httpContext.cgiGet( "Z8503Renfastpp")) ;
         Z8504Renfasunpl = localUtil.ctond( httpContext.cgiGet( "Z8504Renfasunpl")) ;
         Z8505Renuord = (short)(localUtil.ctol( httpContext.cgiGet( "Z8505Renuord"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8595RenHdrO = httpContext.cgiGet( "Z8595RenHdrO") ;
         Z8939Renfaspri2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z8939Renfaspri2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9856RenObsF = httpContext.cgiGet( "Z9856RenObsF") ;
         Z10130RenObsB = httpContext.cgiGet( "Z10130RenObsB") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A1654RenTerCod = httpContext.cgiGet( edtRenTerCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
         A308CodPro = httpContext.cgiGet( edtCodPro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ORDLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A654OrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         }
         else
         {
            A654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         }
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A816RenFasEst = (byte)(0) ;
            n816RenFasEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A816RenFasEst", GXutil.str( A816RenFasEst, 1, 0));
         }
         else
         {
            A816RenFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtRenFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n816RenFasEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A816RenFasEst", GXutil.str( A816RenFasEst, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtRenFecTeo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RENFECTEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFecTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A818RenFecTeo = GXutil.nullDate() ;
            n818RenFecTeo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A818RenFecTeo", localUtil.format(A818RenFecTeo, "99/99/99"));
         }
         else
         {
            A818RenFecTeo = localUtil.ctod( httpContext.cgiGet( edtRenFecTeo_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n818RenFecTeo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A818RenFecTeo", localUtil.format(A818RenFecTeo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtRenFecRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RENFECREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFecRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A817RenFecRea = GXutil.nullDate() ;
            n817RenFecRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A817RenFecRea", localUtil.format(A817RenFecRea, "99/99/99"));
         }
         else
         {
            A817RenFecRea = localUtil.ctod( httpContext.cgiGet( edtRenFecRea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n817RenFecRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A817RenFecRea", localUtil.format(A817RenFecRea, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtRenFecRIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RENFECRINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFecRIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3297RenFecRIni = GXutil.nullDate() ;
            n3297RenFecRIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3297RenFecRIni", localUtil.format(A3297RenFecRIni, "99/99/99"));
         }
         else
         {
            A3297RenFecRIni = localUtil.ctod( httpContext.cgiGet( edtRenFecRIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3297RenFecRIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3297RenFecRIni", localUtil.format(A3297RenFecRIni, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenTieTeo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenTieTeo_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENTIETEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenTieTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A824RenTieTeo = DecimalUtil.ZERO ;
            n824RenTieTeo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A824RenTieTeo", GXutil.ltrimstr( A824RenTieTeo, 5, 2));
         }
         else
         {
            A824RenTieTeo = localUtil.ctond( httpContext.cgiGet( edtRenTieTeo_Internalname)) ;
            n824RenTieTeo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A824RenTieTeo", GXutil.ltrimstr( A824RenTieTeo, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENUNI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A825RenUni = DecimalUtil.ZERO ;
            n825RenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A825RenUni", GXutil.ltrimstr( A825RenUni, 9, 2));
         }
         else
         {
            A825RenUni = localUtil.ctond( httpContext.cgiGet( edtRenUni_Internalname)) ;
            n825RenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A825RenUni", GXutil.ltrimstr( A825RenUni, 9, 2));
         }
         A821RenLoc = httpContext.cgiGet( edtRenLoc_Internalname) ;
         n821RenLoc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A821RenLoc", A821RenLoc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENHORINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenHorIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A820RenHorIni = (short)(0) ;
            n820RenHorIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A820RenHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A820RenHorIni), 4, 0));
         }
         else
         {
            A820RenHorIni = (short)(localUtil.ctol( httpContext.cgiGet( edtRenHorIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n820RenHorIni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A820RenHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A820RenHorIni), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENHORFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenHorFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A819RenHorFin = (short)(0) ;
            n819RenHorFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A819RenHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A819RenHorFin), 4, 0));
         }
         else
         {
            A819RenHorFin = (short)(localUtil.ctol( httpContext.cgiGet( edtRenHorFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n819RenHorFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A819RenHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A819RenHorFin), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenTieRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenTieRea_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENTIEREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenTieRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A823RenTieRea = DecimalUtil.ZERO ;
            n823RenTieRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A823RenTieRea", GXutil.ltrimstr( A823RenTieRea, 5, 2));
         }
         else
         {
            A823RenTieRea = localUtil.ctond( httpContext.cgiGet( edtRenTieRea_Internalname)) ;
            n823RenTieRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A823RenTieRea", GXutil.ltrimstr( A823RenTieRea, 5, 2));
         }
         A822RenMaqCod = httpContext.cgiGet( edtRenMaqCod_Internalname) ;
         n822RenMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A822RenMaqCod", A822RenMaqCod);
         A815RenFasCon = GXutil.upper( httpContext.cgiGet( edtRenFasCon_Internalname)) ;
         n815RenFasCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A815RenFasCon", A815RenFasCon);
         A814RenFacTin = GXutil.upper( httpContext.cgiGet( edtRenFacTin_Internalname)) ;
         n814RenFacTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A814RenFacTin", A814RenFacTin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENORDLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenOrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4593RenOrdLin = (short)(0) ;
            n4593RenOrdLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4593RenOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4593RenOrdLin), 4, 0));
         }
         else
         {
            A4593RenOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRenOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4593RenOrdLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4593RenOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4593RenOrdLin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASPRI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasPri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4734RenFasPri = (byte)(0) ;
            n4734RenFasPri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4734RenFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4734RenFasPri), 2, 0));
         }
         else
         {
            A4734RenFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtRenFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4734RenFasPri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4734RenFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4734RenFasPri), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenFasKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenFasKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4735RenFasKgm = DecimalUtil.ZERO ;
            n4735RenFasKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4735RenFasKgm", GXutil.ltrimstr( A4735RenFasKgm, 9, 2));
         }
         else
         {
            A4735RenFasKgm = localUtil.ctond( httpContext.cgiGet( edtRenFasKgm_Internalname)) ;
            n4735RenFasKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4735RenFasKgm", GXutil.ltrimstr( A4735RenFasKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenFasMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenFasMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4736RenFasMtr = DecimalUtil.ZERO ;
            n4736RenFasMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4736RenFasMtr", GXutil.ltrimstr( A4736RenFasMtr, 9, 2));
         }
         else
         {
            A4736RenFasMtr = localUtil.ctond( httpContext.cgiGet( edtRenFasMtr_Internalname)) ;
            n4736RenFasMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4736RenFasMtr", GXutil.ltrimstr( A4736RenFasMtr, 9, 2));
         }
         A4737RenFasBot = httpContext.cgiGet( edtRenFasBot_Internalname) ;
         n4737RenFasBot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4737RenFasBot", A4737RenFasBot);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENNUMBOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenNumBot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4738RenNumBot = 0 ;
            n4738RenNumBot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4738RenNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4738RenNumBot), 6, 0));
         }
         else
         {
            A4738RenNumBot = (int)(localUtil.ctol( httpContext.cgiGet( edtRenNumBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4738RenNumBot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4738RenNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4738RenNumBot), 6, 0));
         }
         A4739RenFasFor = httpContext.cgiGet( edtRenFasFor_Internalname) ;
         n4739RenFasFor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4739RenFasFor", A4739RenFasFor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenFasPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenFasPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASPZAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasPzas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4740RenFasPzas = 0 ;
            n4740RenFasPzas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4740RenFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4740RenFasPzas), 6, 0));
         }
         else
         {
            A4740RenFasPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtRenFasPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4740RenFasPzas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4740RenFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4740RenFasPzas), 6, 0));
         }
         A4741RenFasCop = httpContext.cgiGet( edtRenFasCop_Internalname) ;
         n4741RenFasCop = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4741RenFasCop", A4741RenFasCop);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenBarUltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenBarUltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENBARULTL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenBarUltL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4742RenBarUltL = 0 ;
            n4742RenBarUltL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4742RenBarUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4742RenBarUltL), 6, 0));
         }
         else
         {
            A4742RenBarUltL = (int)(localUtil.ctol( httpContext.cgiGet( edtRenBarUltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4742RenBarUltL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4742RenBarUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4742RenBarUltL), 6, 0));
         }
         A4743RenFasCara = httpContext.cgiGet( edtRenFasCara_Internalname) ;
         n4743RenFasCara = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4743RenFasCara", A4743RenFasCara);
         A4904RenFasAcab = GXutil.upper( httpContext.cgiGet( edtRenFasAcab_Internalname)) ;
         n4904RenFasAcab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4904RenFasAcab", A4904RenFasAcab);
         A5370RenFasGral = httpContext.cgiGet( edtRenFasGral_Internalname) ;
         n5370RenFasGral = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5370RenFasGral", A5370RenFasGral);
         A5897RenMaqPlan = httpContext.cgiGet( edtRenMaqPlan_Internalname) ;
         n5897RenMaqPlan = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5897RenMaqPlan", A5897RenMaqPlan);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenFasKgT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenFasKgT_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASKGT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasKgT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5992RenFasKgT = DecimalUtil.ZERO ;
            n5992RenFasKgT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5992RenFasKgT", GXutil.ltrimstr( A5992RenFasKgT, 9, 2));
         }
         else
         {
            A5992RenFasKgT = localUtil.ctond( httpContext.cgiGet( edtRenFasKgT_Internalname)) ;
            n5992RenFasKgT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5992RenFasKgT", GXutil.ltrimstr( A5992RenFasKgT, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenFasMtT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenFasMtT_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASMTT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenFasMtT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5993RenFasMtT = DecimalUtil.ZERO ;
            n5993RenFasMtT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5993RenFasMtT", GXutil.ltrimstr( A5993RenFasMtT, 9, 2));
         }
         else
         {
            A5993RenFasMtT = localUtil.ctond( httpContext.cgiGet( edtRenFasMtT_Internalname)) ;
            n5993RenFasMtT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5993RenFasMtT", GXutil.ltrimstr( A5993RenFasMtT, 9, 2));
         }
         A6013RenFasTip = httpContext.cgiGet( edtRenFasTip_Internalname) ;
         n6013RenFasTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6013RenFasTip", A6013RenFasTip);
         A6172RenFasSec = httpContext.cgiGet( edtRenFasSec_Internalname) ;
         n6172RenFasSec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6172RenFasSec", A6172RenFasSec);
         A6393RenFasMn = httpContext.cgiGet( edtRenFasMn_Internalname) ;
         n6393RenFasMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6393RenFasMn", A6393RenFasMn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASOP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasOP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6394RenfasOP = (short)(0) ;
            n6394RenfasOP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6394RenfasOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6394RenfasOP), 4, 0));
         }
         else
         {
            A6394RenfasOP = (short)(localUtil.ctol( httpContext.cgiGet( edtRenfasOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6394RenfasOP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6394RenfasOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6394RenfasOP), 4, 0));
         }
         A6395RenHdMn = httpContext.cgiGet( edtRenHdMn_Internalname) ;
         n6395RenHdMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6395RenHdMn", A6395RenHdMn);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenfasRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenfasRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASRB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8472RenfasRb = DecimalUtil.ZERO ;
            n8472RenfasRb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8472RenfasRb", GXutil.ltrimstr( A8472RenfasRb, 7, 2));
         }
         else
         {
            A8472RenfasRb = localUtil.ctond( httpContext.cgiGet( edtRenfasRb_Internalname)) ;
            n8472RenfasRb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8472RenfasRb", GXutil.ltrimstr( A8472RenfasRb, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasinc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasinc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASINC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasinc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8490Renfasinc = (byte)(0) ;
            n8490Renfasinc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8490Renfasinc", GXutil.str( A8490Renfasinc, 1, 0));
         }
         else
         {
            A8490Renfasinc = (byte)(localUtil.ctol( httpContext.cgiGet( edtRenfasinc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8490Renfasinc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8490Renfasinc", GXutil.str( A8490Renfasinc, 1, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtRenfasdti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RENFASDTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasdti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
            n8491Renfasdti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8491Renfasdti", localUtil.ttoc( A8491Renfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8491Renfasdti = localUtil.ctot( httpContext.cgiGet( edtRenfasdti_Internalname)) ;
            n8491Renfasdti = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8491Renfasdti", localUtil.ttoc( A8491Renfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtRenfasdtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RENFASDTF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasdtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
            n8492Renfasdtf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8492Renfasdtf", localUtil.ttoc( A8492Renfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8492Renfasdtf = localUtil.ctot( httpContext.cgiGet( edtRenfasdtf_Internalname)) ;
            n8492Renfasdtf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8492Renfasdtf", localUtil.ttoc( A8492Renfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenfaskpr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenfaskpr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASKPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfaskpr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8493Renfaskpr = DecimalUtil.ZERO ;
            n8493Renfaskpr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8493Renfaskpr", GXutil.ltrimstr( A8493Renfaskpr, 9, 2));
         }
         else
         {
            A8493Renfaskpr = localUtil.ctond( httpContext.cgiGet( edtRenfaskpr_Internalname)) ;
            n8493Renfaskpr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8493Renfaskpr", GXutil.ltrimstr( A8493Renfaskpr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasPpr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasPpr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASPPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasPpr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8494RenfasPpr = (short)(0) ;
            n8494RenfasPpr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8494RenfasPpr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8494RenfasPpr), 4, 0));
         }
         else
         {
            A8494RenfasPpr = (short)(localUtil.ctol( httpContext.cgiGet( edtRenfasPpr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8494RenfasPpr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8494RenfasPpr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8494RenfasPpr), 4, 0));
         }
         A8495Renfasagr = httpContext.cgiGet( edtRenfasagr_Internalname) ;
         n8495Renfasagr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8495Renfasagr", A8495Renfasagr);
         A8496Renfasprp = httpContext.cgiGet( edtRenfasprp_Internalname) ;
         n8496Renfasprp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8496Renfasprp", A8496Renfasprp);
         if ( localUtil.vcdate( httpContext.cgiGet( edtRenfasfpl_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RENFASFPL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasfpl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8497Renfasfpl = GXutil.nullDate() ;
            n8497Renfasfpl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8497Renfasfpl", localUtil.format(A8497Renfasfpl, "99/99/99"));
         }
         else
         {
            A8497Renfasfpl = localUtil.ctod( httpContext.cgiGet( edtRenfasfpl_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n8497Renfasfpl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8497Renfasfpl", localUtil.format(A8497Renfasfpl, "99/99/99"));
         }
         A8498Renfasusu = GXutil.upper( httpContext.cgiGet( edtRenfasusu_Internalname)) ;
         n8498Renfasusu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8498Renfasusu", A8498Renfasusu);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenquiul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenquiul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENQUIUL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenquiul_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8499Renquiul = (short)(0) ;
            n8499Renquiul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8499Renquiul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8499Renquiul), 4, 0));
         }
         else
         {
            A8499Renquiul = (short)(localUtil.ctol( httpContext.cgiGet( edtRenquiul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8499Renquiul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8499Renquiul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8499Renquiul), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenfascr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenfascr_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfascr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8500Renfascr = DecimalUtil.ZERO ;
            n8500Renfascr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8500Renfascr", GXutil.ltrimstr( A8500Renfascr, 11, 5));
         }
         else
         {
            A8500Renfascr = localUtil.ctond( httpContext.cgiGet( edtRenfascr_Internalname)) ;
            n8500Renfascr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8500Renfascr", GXutil.ltrimstr( A8500Renfascr, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRentieaut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRentieaut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENTIEAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRentieaut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8501Rentieaut = (short)(0) ;
            n8501Rentieaut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8501Rentieaut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8501Rentieaut), 4, 0));
         }
         else
         {
            A8501Rentieaut = (short)(localUtil.ctol( httpContext.cgiGet( edtRentieaut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8501Rentieaut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8501Rentieaut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8501Rentieaut), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasnpl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenfasnpl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASNPL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasnpl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8502Renfasnpl = (byte)(0) ;
            n8502Renfasnpl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8502Renfasnpl", GXutil.str( A8502Renfasnpl, 1, 0));
         }
         else
         {
            A8502Renfasnpl = (byte)(localUtil.ctol( httpContext.cgiGet( edtRenfasnpl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8502Renfasnpl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8502Renfasnpl", GXutil.str( A8502Renfasnpl, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenfastpp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenfastpp_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASTPP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfastpp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8503Renfastpp = DecimalUtil.ZERO ;
            n8503Renfastpp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8503Renfastpp", GXutil.ltrimstr( A8503Renfastpp, 7, 2));
         }
         else
         {
            A8503Renfastpp = localUtil.ctond( httpContext.cgiGet( edtRenfastpp_Internalname)) ;
            n8503Renfastpp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8503Renfastpp", GXutil.ltrimstr( A8503Renfastpp, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRenfasunpl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRenfasunpl_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASUNPL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfasunpl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8504Renfasunpl = DecimalUtil.ZERO ;
            n8504Renfasunpl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8504Renfasunpl", GXutil.ltrimstr( A8504Renfasunpl, 7, 2));
         }
         else
         {
            A8504Renfasunpl = localUtil.ctond( httpContext.cgiGet( edtRenfasunpl_Internalname)) ;
            n8504Renfasunpl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8504Renfasunpl", GXutil.ltrimstr( A8504Renfasunpl, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenuord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenuord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENUORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenuord_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8505Renuord = (short)(0) ;
            n8505Renuord = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8505Renuord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8505Renuord), 4, 0));
         }
         else
         {
            A8505Renuord = (short)(localUtil.ctol( httpContext.cgiGet( edtRenuord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8505Renuord = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8505Renuord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8505Renuord), 4, 0));
         }
         A8595RenHdrO = httpContext.cgiGet( edtRenHdrO_Internalname) ;
         n8595RenHdrO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8595RenHdrO", A8595RenHdrO);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRenfaspri2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRenfaspri2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RENFASPRI2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenfaspri2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8939Renfaspri2 = (short)(0) ;
            n8939Renfaspri2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8939Renfaspri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8939Renfaspri2), 3, 0));
         }
         else
         {
            A8939Renfaspri2 = (short)(localUtil.ctol( httpContext.cgiGet( edtRenfaspri2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8939Renfaspri2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8939Renfaspri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8939Renfaspri2), 3, 0));
         }
         A9856RenObsF = httpContext.cgiGet( edtRenObsF_Internalname) ;
         n9856RenObsF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9856RenObsF", A9856RenObsF);
         A10130RenObsB = httpContext.cgiGet( edtRenObsB_Internalname) ;
         n10130RenObsB = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10130RenObsB", A10130RenObsB);
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
            A1654RenTerCod = httpContext.GetPar( "RenTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
            A308CodPro = httpContext.GetPar( "CodPro") ;
            httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
            A654OrdLin = (short)(GXutil.lval( httpContext.GetPar( "OrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
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
            initAll2B227( ) ;
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
      disableAttributes2B227( ) ;
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

   public void confirm_2B0( )
   {
      beforeValidate2B227( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2B227( ) ;
         }
         else
         {
            checkExtendedTable2B227( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors2B227( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues2B0( ) ;
      }
   }

   public void resetCaption2B0( )
   {
   }

   public void zm2B227( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z457FasCod = T002B3_A457FasCod[0] ;
            Z816RenFasEst = T002B3_A816RenFasEst[0] ;
            Z818RenFecTeo = T002B3_A818RenFecTeo[0] ;
            Z817RenFecRea = T002B3_A817RenFecRea[0] ;
            Z3297RenFecRIni = T002B3_A3297RenFecRIni[0] ;
            Z824RenTieTeo = T002B3_A824RenTieTeo[0] ;
            Z825RenUni = T002B3_A825RenUni[0] ;
            Z821RenLoc = T002B3_A821RenLoc[0] ;
            Z820RenHorIni = T002B3_A820RenHorIni[0] ;
            Z819RenHorFin = T002B3_A819RenHorFin[0] ;
            Z823RenTieRea = T002B3_A823RenTieRea[0] ;
            Z822RenMaqCod = T002B3_A822RenMaqCod[0] ;
            Z815RenFasCon = T002B3_A815RenFasCon[0] ;
            Z814RenFacTin = T002B3_A814RenFacTin[0] ;
            Z4593RenOrdLin = T002B3_A4593RenOrdLin[0] ;
            Z4734RenFasPri = T002B3_A4734RenFasPri[0] ;
            Z4735RenFasKgm = T002B3_A4735RenFasKgm[0] ;
            Z4736RenFasMtr = T002B3_A4736RenFasMtr[0] ;
            Z4737RenFasBot = T002B3_A4737RenFasBot[0] ;
            Z4738RenNumBot = T002B3_A4738RenNumBot[0] ;
            Z4739RenFasFor = T002B3_A4739RenFasFor[0] ;
            Z4740RenFasPzas = T002B3_A4740RenFasPzas[0] ;
            Z4741RenFasCop = T002B3_A4741RenFasCop[0] ;
            Z4742RenBarUltL = T002B3_A4742RenBarUltL[0] ;
            Z4743RenFasCara = T002B3_A4743RenFasCara[0] ;
            Z4904RenFasAcab = T002B3_A4904RenFasAcab[0] ;
            Z5370RenFasGral = T002B3_A5370RenFasGral[0] ;
            Z5897RenMaqPlan = T002B3_A5897RenMaqPlan[0] ;
            Z5992RenFasKgT = T002B3_A5992RenFasKgT[0] ;
            Z5993RenFasMtT = T002B3_A5993RenFasMtT[0] ;
            Z6013RenFasTip = T002B3_A6013RenFasTip[0] ;
            Z6172RenFasSec = T002B3_A6172RenFasSec[0] ;
            Z6393RenFasMn = T002B3_A6393RenFasMn[0] ;
            Z6394RenfasOP = T002B3_A6394RenfasOP[0] ;
            Z6395RenHdMn = T002B3_A6395RenHdMn[0] ;
            Z8472RenfasRb = T002B3_A8472RenfasRb[0] ;
            Z8490Renfasinc = T002B3_A8490Renfasinc[0] ;
            Z8491Renfasdti = T002B3_A8491Renfasdti[0] ;
            Z8492Renfasdtf = T002B3_A8492Renfasdtf[0] ;
            Z8493Renfaskpr = T002B3_A8493Renfaskpr[0] ;
            Z8494RenfasPpr = T002B3_A8494RenfasPpr[0] ;
            Z8495Renfasagr = T002B3_A8495Renfasagr[0] ;
            Z8496Renfasprp = T002B3_A8496Renfasprp[0] ;
            Z8497Renfasfpl = T002B3_A8497Renfasfpl[0] ;
            Z8498Renfasusu = T002B3_A8498Renfasusu[0] ;
            Z8499Renquiul = T002B3_A8499Renquiul[0] ;
            Z8500Renfascr = T002B3_A8500Renfascr[0] ;
            Z8501Rentieaut = T002B3_A8501Rentieaut[0] ;
            Z8502Renfasnpl = T002B3_A8502Renfasnpl[0] ;
            Z8503Renfastpp = T002B3_A8503Renfastpp[0] ;
            Z8504Renfasunpl = T002B3_A8504Renfasunpl[0] ;
            Z8505Renuord = T002B3_A8505Renuord[0] ;
            Z8595RenHdrO = T002B3_A8595RenHdrO[0] ;
            Z8939Renfaspri2 = T002B3_A8939Renfaspri2[0] ;
            Z9856RenObsF = T002B3_A9856RenObsF[0] ;
            Z10130RenObsB = T002B3_A10130RenObsB[0] ;
         }
         else
         {
            Z457FasCod = A457FasCod ;
            Z816RenFasEst = A816RenFasEst ;
            Z818RenFecTeo = A818RenFecTeo ;
            Z817RenFecRea = A817RenFecRea ;
            Z3297RenFecRIni = A3297RenFecRIni ;
            Z824RenTieTeo = A824RenTieTeo ;
            Z825RenUni = A825RenUni ;
            Z821RenLoc = A821RenLoc ;
            Z820RenHorIni = A820RenHorIni ;
            Z819RenHorFin = A819RenHorFin ;
            Z823RenTieRea = A823RenTieRea ;
            Z822RenMaqCod = A822RenMaqCod ;
            Z815RenFasCon = A815RenFasCon ;
            Z814RenFacTin = A814RenFacTin ;
            Z4593RenOrdLin = A4593RenOrdLin ;
            Z4734RenFasPri = A4734RenFasPri ;
            Z4735RenFasKgm = A4735RenFasKgm ;
            Z4736RenFasMtr = A4736RenFasMtr ;
            Z4737RenFasBot = A4737RenFasBot ;
            Z4738RenNumBot = A4738RenNumBot ;
            Z4739RenFasFor = A4739RenFasFor ;
            Z4740RenFasPzas = A4740RenFasPzas ;
            Z4741RenFasCop = A4741RenFasCop ;
            Z4742RenBarUltL = A4742RenBarUltL ;
            Z4743RenFasCara = A4743RenFasCara ;
            Z4904RenFasAcab = A4904RenFasAcab ;
            Z5370RenFasGral = A5370RenFasGral ;
            Z5897RenMaqPlan = A5897RenMaqPlan ;
            Z5992RenFasKgT = A5992RenFasKgT ;
            Z5993RenFasMtT = A5993RenFasMtT ;
            Z6013RenFasTip = A6013RenFasTip ;
            Z6172RenFasSec = A6172RenFasSec ;
            Z6393RenFasMn = A6393RenFasMn ;
            Z6394RenfasOP = A6394RenfasOP ;
            Z6395RenHdMn = A6395RenHdMn ;
            Z8472RenfasRb = A8472RenfasRb ;
            Z8490Renfasinc = A8490Renfasinc ;
            Z8491Renfasdti = A8491Renfasdti ;
            Z8492Renfasdtf = A8492Renfasdtf ;
            Z8493Renfaskpr = A8493Renfaskpr ;
            Z8494RenfasPpr = A8494RenfasPpr ;
            Z8495Renfasagr = A8495Renfasagr ;
            Z8496Renfasprp = A8496Renfasprp ;
            Z8497Renfasfpl = A8497Renfasfpl ;
            Z8498Renfasusu = A8498Renfasusu ;
            Z8499Renquiul = A8499Renquiul ;
            Z8500Renfascr = A8500Renfascr ;
            Z8501Rentieaut = A8501Rentieaut ;
            Z8502Renfasnpl = A8502Renfasnpl ;
            Z8503Renfastpp = A8503Renfastpp ;
            Z8504Renfasunpl = A8504Renfasunpl ;
            Z8505Renuord = A8505Renuord ;
            Z8595RenHdrO = A8595RenHdrO ;
            Z8939Renfaspri2 = A8939Renfaspri2 ;
            Z9856RenObsF = A9856RenObsF ;
            Z10130RenObsB = A10130RenObsB ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z1654RenTerCod = A1654RenTerCod ;
         Z308CodPro = A308CodPro ;
         Z654OrdLin = A654OrdLin ;
         Z457FasCod = A457FasCod ;
         Z816RenFasEst = A816RenFasEst ;
         Z818RenFecTeo = A818RenFecTeo ;
         Z817RenFecRea = A817RenFecRea ;
         Z3297RenFecRIni = A3297RenFecRIni ;
         Z824RenTieTeo = A824RenTieTeo ;
         Z825RenUni = A825RenUni ;
         Z821RenLoc = A821RenLoc ;
         Z820RenHorIni = A820RenHorIni ;
         Z819RenHorFin = A819RenHorFin ;
         Z823RenTieRea = A823RenTieRea ;
         Z822RenMaqCod = A822RenMaqCod ;
         Z815RenFasCon = A815RenFasCon ;
         Z814RenFacTin = A814RenFacTin ;
         Z4593RenOrdLin = A4593RenOrdLin ;
         Z4734RenFasPri = A4734RenFasPri ;
         Z4735RenFasKgm = A4735RenFasKgm ;
         Z4736RenFasMtr = A4736RenFasMtr ;
         Z4737RenFasBot = A4737RenFasBot ;
         Z4738RenNumBot = A4738RenNumBot ;
         Z4739RenFasFor = A4739RenFasFor ;
         Z4740RenFasPzas = A4740RenFasPzas ;
         Z4741RenFasCop = A4741RenFasCop ;
         Z4742RenBarUltL = A4742RenBarUltL ;
         Z4743RenFasCara = A4743RenFasCara ;
         Z4904RenFasAcab = A4904RenFasAcab ;
         Z5370RenFasGral = A5370RenFasGral ;
         Z5897RenMaqPlan = A5897RenMaqPlan ;
         Z5992RenFasKgT = A5992RenFasKgT ;
         Z5993RenFasMtT = A5993RenFasMtT ;
         Z6013RenFasTip = A6013RenFasTip ;
         Z6172RenFasSec = A6172RenFasSec ;
         Z6393RenFasMn = A6393RenFasMn ;
         Z6394RenfasOP = A6394RenfasOP ;
         Z6395RenHdMn = A6395RenHdMn ;
         Z8472RenfasRb = A8472RenfasRb ;
         Z8490Renfasinc = A8490Renfasinc ;
         Z8491Renfasdti = A8491Renfasdti ;
         Z8492Renfasdtf = A8492Renfasdtf ;
         Z8493Renfaskpr = A8493Renfaskpr ;
         Z8494RenfasPpr = A8494RenfasPpr ;
         Z8495Renfasagr = A8495Renfasagr ;
         Z8496Renfasprp = A8496Renfasprp ;
         Z8497Renfasfpl = A8497Renfasfpl ;
         Z8498Renfasusu = A8498Renfasusu ;
         Z8499Renquiul = A8499Renquiul ;
         Z8500Renfascr = A8500Renfascr ;
         Z8501Rentieaut = A8501Rentieaut ;
         Z8502Renfasnpl = A8502Renfasnpl ;
         Z8503Renfastpp = A8503Renfastpp ;
         Z8504Renfasunpl = A8504Renfasunpl ;
         Z8505Renuord = A8505Renuord ;
         Z8595RenHdrO = A8595RenHdrO ;
         Z8939Renfaspri2 = A8939Renfaspri2 ;
         Z9856RenObsF = A9856RenObsF ;
         Z10130RenObsB = A10130RenObsB ;
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

   public void load2B227( )
   {
      /* Using cursor T002B4 */
      pr_default.execute(2, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound227 = (short)(1) ;
         A457FasCod = T002B4_A457FasCod[0] ;
         n457FasCod = T002B4_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A816RenFasEst = T002B4_A816RenFasEst[0] ;
         n816RenFasEst = T002B4_n816RenFasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A816RenFasEst", GXutil.str( A816RenFasEst, 1, 0));
         A818RenFecTeo = T002B4_A818RenFecTeo[0] ;
         n818RenFecTeo = T002B4_n818RenFecTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818RenFecTeo", localUtil.format(A818RenFecTeo, "99/99/99"));
         A817RenFecRea = T002B4_A817RenFecRea[0] ;
         n817RenFecRea = T002B4_n817RenFecRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A817RenFecRea", localUtil.format(A817RenFecRea, "99/99/99"));
         A3297RenFecRIni = T002B4_A3297RenFecRIni[0] ;
         n3297RenFecRIni = T002B4_n3297RenFecRIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3297RenFecRIni", localUtil.format(A3297RenFecRIni, "99/99/99"));
         A824RenTieTeo = T002B4_A824RenTieTeo[0] ;
         n824RenTieTeo = T002B4_n824RenTieTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A824RenTieTeo", GXutil.ltrimstr( A824RenTieTeo, 5, 2));
         A825RenUni = T002B4_A825RenUni[0] ;
         n825RenUni = T002B4_n825RenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A825RenUni", GXutil.ltrimstr( A825RenUni, 9, 2));
         A821RenLoc = T002B4_A821RenLoc[0] ;
         n821RenLoc = T002B4_n821RenLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A821RenLoc", A821RenLoc);
         A820RenHorIni = T002B4_A820RenHorIni[0] ;
         n820RenHorIni = T002B4_n820RenHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820RenHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A820RenHorIni), 4, 0));
         A819RenHorFin = T002B4_A819RenHorFin[0] ;
         n819RenHorFin = T002B4_n819RenHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819RenHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A819RenHorFin), 4, 0));
         A823RenTieRea = T002B4_A823RenTieRea[0] ;
         n823RenTieRea = T002B4_n823RenTieRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A823RenTieRea", GXutil.ltrimstr( A823RenTieRea, 5, 2));
         A822RenMaqCod = T002B4_A822RenMaqCod[0] ;
         n822RenMaqCod = T002B4_n822RenMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A822RenMaqCod", A822RenMaqCod);
         A815RenFasCon = T002B4_A815RenFasCon[0] ;
         n815RenFasCon = T002B4_n815RenFasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815RenFasCon", A815RenFasCon);
         A814RenFacTin = T002B4_A814RenFacTin[0] ;
         n814RenFacTin = T002B4_n814RenFacTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814RenFacTin", A814RenFacTin);
         A4593RenOrdLin = T002B4_A4593RenOrdLin[0] ;
         n4593RenOrdLin = T002B4_n4593RenOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4593RenOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4593RenOrdLin), 4, 0));
         A4734RenFasPri = T002B4_A4734RenFasPri[0] ;
         n4734RenFasPri = T002B4_n4734RenFasPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4734RenFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4734RenFasPri), 2, 0));
         A4735RenFasKgm = T002B4_A4735RenFasKgm[0] ;
         n4735RenFasKgm = T002B4_n4735RenFasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4735RenFasKgm", GXutil.ltrimstr( A4735RenFasKgm, 9, 2));
         A4736RenFasMtr = T002B4_A4736RenFasMtr[0] ;
         n4736RenFasMtr = T002B4_n4736RenFasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4736RenFasMtr", GXutil.ltrimstr( A4736RenFasMtr, 9, 2));
         A4737RenFasBot = T002B4_A4737RenFasBot[0] ;
         n4737RenFasBot = T002B4_n4737RenFasBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4737RenFasBot", A4737RenFasBot);
         A4738RenNumBot = T002B4_A4738RenNumBot[0] ;
         n4738RenNumBot = T002B4_n4738RenNumBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4738RenNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4738RenNumBot), 6, 0));
         A4739RenFasFor = T002B4_A4739RenFasFor[0] ;
         n4739RenFasFor = T002B4_n4739RenFasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4739RenFasFor", A4739RenFasFor);
         A4740RenFasPzas = T002B4_A4740RenFasPzas[0] ;
         n4740RenFasPzas = T002B4_n4740RenFasPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4740RenFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4740RenFasPzas), 6, 0));
         A4741RenFasCop = T002B4_A4741RenFasCop[0] ;
         n4741RenFasCop = T002B4_n4741RenFasCop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4741RenFasCop", A4741RenFasCop);
         A4742RenBarUltL = T002B4_A4742RenBarUltL[0] ;
         n4742RenBarUltL = T002B4_n4742RenBarUltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4742RenBarUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4742RenBarUltL), 6, 0));
         A4743RenFasCara = T002B4_A4743RenFasCara[0] ;
         n4743RenFasCara = T002B4_n4743RenFasCara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4743RenFasCara", A4743RenFasCara);
         A4904RenFasAcab = T002B4_A4904RenFasAcab[0] ;
         n4904RenFasAcab = T002B4_n4904RenFasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4904RenFasAcab", A4904RenFasAcab);
         A5370RenFasGral = T002B4_A5370RenFasGral[0] ;
         n5370RenFasGral = T002B4_n5370RenFasGral[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5370RenFasGral", A5370RenFasGral);
         A5897RenMaqPlan = T002B4_A5897RenMaqPlan[0] ;
         n5897RenMaqPlan = T002B4_n5897RenMaqPlan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5897RenMaqPlan", A5897RenMaqPlan);
         A5992RenFasKgT = T002B4_A5992RenFasKgT[0] ;
         n5992RenFasKgT = T002B4_n5992RenFasKgT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5992RenFasKgT", GXutil.ltrimstr( A5992RenFasKgT, 9, 2));
         A5993RenFasMtT = T002B4_A5993RenFasMtT[0] ;
         n5993RenFasMtT = T002B4_n5993RenFasMtT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5993RenFasMtT", GXutil.ltrimstr( A5993RenFasMtT, 9, 2));
         A6013RenFasTip = T002B4_A6013RenFasTip[0] ;
         n6013RenFasTip = T002B4_n6013RenFasTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6013RenFasTip", A6013RenFasTip);
         A6172RenFasSec = T002B4_A6172RenFasSec[0] ;
         n6172RenFasSec = T002B4_n6172RenFasSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6172RenFasSec", A6172RenFasSec);
         A6393RenFasMn = T002B4_A6393RenFasMn[0] ;
         n6393RenFasMn = T002B4_n6393RenFasMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6393RenFasMn", A6393RenFasMn);
         A6394RenfasOP = T002B4_A6394RenfasOP[0] ;
         n6394RenfasOP = T002B4_n6394RenfasOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6394RenfasOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6394RenfasOP), 4, 0));
         A6395RenHdMn = T002B4_A6395RenHdMn[0] ;
         n6395RenHdMn = T002B4_n6395RenHdMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6395RenHdMn", A6395RenHdMn);
         A8472RenfasRb = T002B4_A8472RenfasRb[0] ;
         n8472RenfasRb = T002B4_n8472RenfasRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8472RenfasRb", GXutil.ltrimstr( A8472RenfasRb, 7, 2));
         A8490Renfasinc = T002B4_A8490Renfasinc[0] ;
         n8490Renfasinc = T002B4_n8490Renfasinc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8490Renfasinc", GXutil.str( A8490Renfasinc, 1, 0));
         A8491Renfasdti = T002B4_A8491Renfasdti[0] ;
         n8491Renfasdti = T002B4_n8491Renfasdti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8491Renfasdti", localUtil.ttoc( A8491Renfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8492Renfasdtf = T002B4_A8492Renfasdtf[0] ;
         n8492Renfasdtf = T002B4_n8492Renfasdtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8492Renfasdtf", localUtil.ttoc( A8492Renfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8493Renfaskpr = T002B4_A8493Renfaskpr[0] ;
         n8493Renfaskpr = T002B4_n8493Renfaskpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8493Renfaskpr", GXutil.ltrimstr( A8493Renfaskpr, 9, 2));
         A8494RenfasPpr = T002B4_A8494RenfasPpr[0] ;
         n8494RenfasPpr = T002B4_n8494RenfasPpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8494RenfasPpr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8494RenfasPpr), 4, 0));
         A8495Renfasagr = T002B4_A8495Renfasagr[0] ;
         n8495Renfasagr = T002B4_n8495Renfasagr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8495Renfasagr", A8495Renfasagr);
         A8496Renfasprp = T002B4_A8496Renfasprp[0] ;
         n8496Renfasprp = T002B4_n8496Renfasprp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8496Renfasprp", A8496Renfasprp);
         A8497Renfasfpl = T002B4_A8497Renfasfpl[0] ;
         n8497Renfasfpl = T002B4_n8497Renfasfpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8497Renfasfpl", localUtil.format(A8497Renfasfpl, "99/99/99"));
         A8498Renfasusu = T002B4_A8498Renfasusu[0] ;
         n8498Renfasusu = T002B4_n8498Renfasusu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8498Renfasusu", A8498Renfasusu);
         A8499Renquiul = T002B4_A8499Renquiul[0] ;
         n8499Renquiul = T002B4_n8499Renquiul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8499Renquiul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8499Renquiul), 4, 0));
         A8500Renfascr = T002B4_A8500Renfascr[0] ;
         n8500Renfascr = T002B4_n8500Renfascr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8500Renfascr", GXutil.ltrimstr( A8500Renfascr, 11, 5));
         A8501Rentieaut = T002B4_A8501Rentieaut[0] ;
         n8501Rentieaut = T002B4_n8501Rentieaut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8501Rentieaut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8501Rentieaut), 4, 0));
         A8502Renfasnpl = T002B4_A8502Renfasnpl[0] ;
         n8502Renfasnpl = T002B4_n8502Renfasnpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8502Renfasnpl", GXutil.str( A8502Renfasnpl, 1, 0));
         A8503Renfastpp = T002B4_A8503Renfastpp[0] ;
         n8503Renfastpp = T002B4_n8503Renfastpp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8503Renfastpp", GXutil.ltrimstr( A8503Renfastpp, 7, 2));
         A8504Renfasunpl = T002B4_A8504Renfasunpl[0] ;
         n8504Renfasunpl = T002B4_n8504Renfasunpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8504Renfasunpl", GXutil.ltrimstr( A8504Renfasunpl, 7, 2));
         A8505Renuord = T002B4_A8505Renuord[0] ;
         n8505Renuord = T002B4_n8505Renuord[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8505Renuord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8505Renuord), 4, 0));
         A8595RenHdrO = T002B4_A8595RenHdrO[0] ;
         n8595RenHdrO = T002B4_n8595RenHdrO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8595RenHdrO", A8595RenHdrO);
         A8939Renfaspri2 = T002B4_A8939Renfaspri2[0] ;
         n8939Renfaspri2 = T002B4_n8939Renfaspri2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8939Renfaspri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8939Renfaspri2), 3, 0));
         A9856RenObsF = T002B4_A9856RenObsF[0] ;
         n9856RenObsF = T002B4_n9856RenObsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9856RenObsF", A9856RenObsF);
         A10130RenObsB = T002B4_A10130RenObsB[0] ;
         n10130RenObsB = T002B4_n10130RenObsB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10130RenObsB", A10130RenObsB);
         zm2B227( -5) ;
      }
      pr_default.close(2);
      onLoadActions2B227( ) ;
   }

   public void onLoadActions2B227( )
   {
   }

   public void checkExtendedTable2B227( )
   {
      nIsDirty_227 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( A816RenFasEst == 0 ) || ( A816RenFasEst == 1 ) || ( A816RenFasEst == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "RenFasEst", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "RENFASEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRenFasEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A815RenFasCon, "S") == 0 ) || ( GXutil.strcmp(A815RenFasCon, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "RenFasCon", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "RENFASCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRenFasCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A814RenFacTin, "S") == 0 ) || ( GXutil.strcmp(A814RenFacTin, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "RenFacTin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "RENFACTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRenFacTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4904RenFasAcab, "S") == 0 ) || ( GXutil.strcmp(A4904RenFasAcab, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Fase de Acabado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "RENFASACAB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRenFasAcab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors2B227( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2B227( )
   {
      /* Using cursor T002B5 */
      pr_default.execute(3, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound227 = (short)(1) ;
      }
      else
      {
         RcdFound227 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002B3 */
      pr_default.execute(1, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2B227( 5) ;
         RcdFound227 = (short)(1) ;
         A1654RenTerCod = T002B3_A1654RenTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
         A308CodPro = T002B3_A308CodPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
         A654OrdLin = T002B3_A654OrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         A457FasCod = T002B3_A457FasCod[0] ;
         n457FasCod = T002B3_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A816RenFasEst = T002B3_A816RenFasEst[0] ;
         n816RenFasEst = T002B3_n816RenFasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A816RenFasEst", GXutil.str( A816RenFasEst, 1, 0));
         A818RenFecTeo = T002B3_A818RenFecTeo[0] ;
         n818RenFecTeo = T002B3_n818RenFecTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818RenFecTeo", localUtil.format(A818RenFecTeo, "99/99/99"));
         A817RenFecRea = T002B3_A817RenFecRea[0] ;
         n817RenFecRea = T002B3_n817RenFecRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A817RenFecRea", localUtil.format(A817RenFecRea, "99/99/99"));
         A3297RenFecRIni = T002B3_A3297RenFecRIni[0] ;
         n3297RenFecRIni = T002B3_n3297RenFecRIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3297RenFecRIni", localUtil.format(A3297RenFecRIni, "99/99/99"));
         A824RenTieTeo = T002B3_A824RenTieTeo[0] ;
         n824RenTieTeo = T002B3_n824RenTieTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A824RenTieTeo", GXutil.ltrimstr( A824RenTieTeo, 5, 2));
         A825RenUni = T002B3_A825RenUni[0] ;
         n825RenUni = T002B3_n825RenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A825RenUni", GXutil.ltrimstr( A825RenUni, 9, 2));
         A821RenLoc = T002B3_A821RenLoc[0] ;
         n821RenLoc = T002B3_n821RenLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A821RenLoc", A821RenLoc);
         A820RenHorIni = T002B3_A820RenHorIni[0] ;
         n820RenHorIni = T002B3_n820RenHorIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820RenHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A820RenHorIni), 4, 0));
         A819RenHorFin = T002B3_A819RenHorFin[0] ;
         n819RenHorFin = T002B3_n819RenHorFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819RenHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A819RenHorFin), 4, 0));
         A823RenTieRea = T002B3_A823RenTieRea[0] ;
         n823RenTieRea = T002B3_n823RenTieRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A823RenTieRea", GXutil.ltrimstr( A823RenTieRea, 5, 2));
         A822RenMaqCod = T002B3_A822RenMaqCod[0] ;
         n822RenMaqCod = T002B3_n822RenMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A822RenMaqCod", A822RenMaqCod);
         A815RenFasCon = T002B3_A815RenFasCon[0] ;
         n815RenFasCon = T002B3_n815RenFasCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815RenFasCon", A815RenFasCon);
         A814RenFacTin = T002B3_A814RenFacTin[0] ;
         n814RenFacTin = T002B3_n814RenFacTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814RenFacTin", A814RenFacTin);
         A4593RenOrdLin = T002B3_A4593RenOrdLin[0] ;
         n4593RenOrdLin = T002B3_n4593RenOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4593RenOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4593RenOrdLin), 4, 0));
         A4734RenFasPri = T002B3_A4734RenFasPri[0] ;
         n4734RenFasPri = T002B3_n4734RenFasPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4734RenFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4734RenFasPri), 2, 0));
         A4735RenFasKgm = T002B3_A4735RenFasKgm[0] ;
         n4735RenFasKgm = T002B3_n4735RenFasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4735RenFasKgm", GXutil.ltrimstr( A4735RenFasKgm, 9, 2));
         A4736RenFasMtr = T002B3_A4736RenFasMtr[0] ;
         n4736RenFasMtr = T002B3_n4736RenFasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4736RenFasMtr", GXutil.ltrimstr( A4736RenFasMtr, 9, 2));
         A4737RenFasBot = T002B3_A4737RenFasBot[0] ;
         n4737RenFasBot = T002B3_n4737RenFasBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4737RenFasBot", A4737RenFasBot);
         A4738RenNumBot = T002B3_A4738RenNumBot[0] ;
         n4738RenNumBot = T002B3_n4738RenNumBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4738RenNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4738RenNumBot), 6, 0));
         A4739RenFasFor = T002B3_A4739RenFasFor[0] ;
         n4739RenFasFor = T002B3_n4739RenFasFor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4739RenFasFor", A4739RenFasFor);
         A4740RenFasPzas = T002B3_A4740RenFasPzas[0] ;
         n4740RenFasPzas = T002B3_n4740RenFasPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4740RenFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4740RenFasPzas), 6, 0));
         A4741RenFasCop = T002B3_A4741RenFasCop[0] ;
         n4741RenFasCop = T002B3_n4741RenFasCop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4741RenFasCop", A4741RenFasCop);
         A4742RenBarUltL = T002B3_A4742RenBarUltL[0] ;
         n4742RenBarUltL = T002B3_n4742RenBarUltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4742RenBarUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4742RenBarUltL), 6, 0));
         A4743RenFasCara = T002B3_A4743RenFasCara[0] ;
         n4743RenFasCara = T002B3_n4743RenFasCara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4743RenFasCara", A4743RenFasCara);
         A4904RenFasAcab = T002B3_A4904RenFasAcab[0] ;
         n4904RenFasAcab = T002B3_n4904RenFasAcab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4904RenFasAcab", A4904RenFasAcab);
         A5370RenFasGral = T002B3_A5370RenFasGral[0] ;
         n5370RenFasGral = T002B3_n5370RenFasGral[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5370RenFasGral", A5370RenFasGral);
         A5897RenMaqPlan = T002B3_A5897RenMaqPlan[0] ;
         n5897RenMaqPlan = T002B3_n5897RenMaqPlan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5897RenMaqPlan", A5897RenMaqPlan);
         A5992RenFasKgT = T002B3_A5992RenFasKgT[0] ;
         n5992RenFasKgT = T002B3_n5992RenFasKgT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5992RenFasKgT", GXutil.ltrimstr( A5992RenFasKgT, 9, 2));
         A5993RenFasMtT = T002B3_A5993RenFasMtT[0] ;
         n5993RenFasMtT = T002B3_n5993RenFasMtT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5993RenFasMtT", GXutil.ltrimstr( A5993RenFasMtT, 9, 2));
         A6013RenFasTip = T002B3_A6013RenFasTip[0] ;
         n6013RenFasTip = T002B3_n6013RenFasTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6013RenFasTip", A6013RenFasTip);
         A6172RenFasSec = T002B3_A6172RenFasSec[0] ;
         n6172RenFasSec = T002B3_n6172RenFasSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6172RenFasSec", A6172RenFasSec);
         A6393RenFasMn = T002B3_A6393RenFasMn[0] ;
         n6393RenFasMn = T002B3_n6393RenFasMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6393RenFasMn", A6393RenFasMn);
         A6394RenfasOP = T002B3_A6394RenfasOP[0] ;
         n6394RenfasOP = T002B3_n6394RenfasOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6394RenfasOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6394RenfasOP), 4, 0));
         A6395RenHdMn = T002B3_A6395RenHdMn[0] ;
         n6395RenHdMn = T002B3_n6395RenHdMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6395RenHdMn", A6395RenHdMn);
         A8472RenfasRb = T002B3_A8472RenfasRb[0] ;
         n8472RenfasRb = T002B3_n8472RenfasRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8472RenfasRb", GXutil.ltrimstr( A8472RenfasRb, 7, 2));
         A8490Renfasinc = T002B3_A8490Renfasinc[0] ;
         n8490Renfasinc = T002B3_n8490Renfasinc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8490Renfasinc", GXutil.str( A8490Renfasinc, 1, 0));
         A8491Renfasdti = T002B3_A8491Renfasdti[0] ;
         n8491Renfasdti = T002B3_n8491Renfasdti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8491Renfasdti", localUtil.ttoc( A8491Renfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8492Renfasdtf = T002B3_A8492Renfasdtf[0] ;
         n8492Renfasdtf = T002B3_n8492Renfasdtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8492Renfasdtf", localUtil.ttoc( A8492Renfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8493Renfaskpr = T002B3_A8493Renfaskpr[0] ;
         n8493Renfaskpr = T002B3_n8493Renfaskpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8493Renfaskpr", GXutil.ltrimstr( A8493Renfaskpr, 9, 2));
         A8494RenfasPpr = T002B3_A8494RenfasPpr[0] ;
         n8494RenfasPpr = T002B3_n8494RenfasPpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8494RenfasPpr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8494RenfasPpr), 4, 0));
         A8495Renfasagr = T002B3_A8495Renfasagr[0] ;
         n8495Renfasagr = T002B3_n8495Renfasagr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8495Renfasagr", A8495Renfasagr);
         A8496Renfasprp = T002B3_A8496Renfasprp[0] ;
         n8496Renfasprp = T002B3_n8496Renfasprp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8496Renfasprp", A8496Renfasprp);
         A8497Renfasfpl = T002B3_A8497Renfasfpl[0] ;
         n8497Renfasfpl = T002B3_n8497Renfasfpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8497Renfasfpl", localUtil.format(A8497Renfasfpl, "99/99/99"));
         A8498Renfasusu = T002B3_A8498Renfasusu[0] ;
         n8498Renfasusu = T002B3_n8498Renfasusu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8498Renfasusu", A8498Renfasusu);
         A8499Renquiul = T002B3_A8499Renquiul[0] ;
         n8499Renquiul = T002B3_n8499Renquiul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8499Renquiul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8499Renquiul), 4, 0));
         A8500Renfascr = T002B3_A8500Renfascr[0] ;
         n8500Renfascr = T002B3_n8500Renfascr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8500Renfascr", GXutil.ltrimstr( A8500Renfascr, 11, 5));
         A8501Rentieaut = T002B3_A8501Rentieaut[0] ;
         n8501Rentieaut = T002B3_n8501Rentieaut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8501Rentieaut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8501Rentieaut), 4, 0));
         A8502Renfasnpl = T002B3_A8502Renfasnpl[0] ;
         n8502Renfasnpl = T002B3_n8502Renfasnpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8502Renfasnpl", GXutil.str( A8502Renfasnpl, 1, 0));
         A8503Renfastpp = T002B3_A8503Renfastpp[0] ;
         n8503Renfastpp = T002B3_n8503Renfastpp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8503Renfastpp", GXutil.ltrimstr( A8503Renfastpp, 7, 2));
         A8504Renfasunpl = T002B3_A8504Renfasunpl[0] ;
         n8504Renfasunpl = T002B3_n8504Renfasunpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8504Renfasunpl", GXutil.ltrimstr( A8504Renfasunpl, 7, 2));
         A8505Renuord = T002B3_A8505Renuord[0] ;
         n8505Renuord = T002B3_n8505Renuord[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8505Renuord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8505Renuord), 4, 0));
         A8595RenHdrO = T002B3_A8595RenHdrO[0] ;
         n8595RenHdrO = T002B3_n8595RenHdrO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8595RenHdrO", A8595RenHdrO);
         A8939Renfaspri2 = T002B3_A8939Renfaspri2[0] ;
         n8939Renfaspri2 = T002B3_n8939Renfaspri2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8939Renfaspri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8939Renfaspri2), 3, 0));
         A9856RenObsF = T002B3_A9856RenObsF[0] ;
         n9856RenObsF = T002B3_n9856RenObsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9856RenObsF", A9856RenObsF);
         A10130RenObsB = T002B3_A10130RenObsB[0] ;
         n10130RenObsB = T002B3_n10130RenObsB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10130RenObsB", A10130RenObsB);
         Z1654RenTerCod = A1654RenTerCod ;
         Z308CodPro = A308CodPro ;
         Z654OrdLin = A654OrdLin ;
         sMode227 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load2B227( ) ;
         if ( AnyError == 1 )
         {
            RcdFound227 = (short)(0) ;
            initializeNonKey2B227( ) ;
         }
         Gx_mode = sMode227 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound227 = (short)(0) ;
         initializeNonKey2B227( ) ;
         sMode227 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode227 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2B227( ) ;
      if ( RcdFound227 == 0 )
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
      RcdFound227 = (short)(0) ;
      /* Using cursor T002B6 */
      pr_default.execute(4, new Object[] {A1654RenTerCod, A1654RenTerCod, A308CodPro, A308CodPro, A1654RenTerCod, Short.valueOf(A654OrdLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T002B6_A1654RenTerCod[0], A1654RenTerCod) < 0 ) || ( GXutil.strcmp(T002B6_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( GXutil.strcmp(T002B6_A308CodPro[0], A308CodPro) < 0 ) || ( GXutil.strcmp(T002B6_A308CodPro[0], A308CodPro) == 0 ) && ( GXutil.strcmp(T002B6_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( T002B6_A654OrdLin[0] < A654OrdLin ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T002B6_A1654RenTerCod[0], A1654RenTerCod) > 0 ) || ( GXutil.strcmp(T002B6_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( GXutil.strcmp(T002B6_A308CodPro[0], A308CodPro) > 0 ) || ( GXutil.strcmp(T002B6_A308CodPro[0], A308CodPro) == 0 ) && ( GXutil.strcmp(T002B6_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( T002B6_A654OrdLin[0] > A654OrdLin ) ) )
         {
            A1654RenTerCod = T002B6_A1654RenTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
            A308CodPro = T002B6_A308CodPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
            A654OrdLin = T002B6_A654OrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
            RcdFound227 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound227 = (short)(0) ;
      /* Using cursor T002B7 */
      pr_default.execute(5, new Object[] {A1654RenTerCod, A1654RenTerCod, A308CodPro, A308CodPro, A1654RenTerCod, Short.valueOf(A654OrdLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T002B7_A1654RenTerCod[0], A1654RenTerCod) > 0 ) || ( GXutil.strcmp(T002B7_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( GXutil.strcmp(T002B7_A308CodPro[0], A308CodPro) > 0 ) || ( GXutil.strcmp(T002B7_A308CodPro[0], A308CodPro) == 0 ) && ( GXutil.strcmp(T002B7_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( T002B7_A654OrdLin[0] > A654OrdLin ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T002B7_A1654RenTerCod[0], A1654RenTerCod) < 0 ) || ( GXutil.strcmp(T002B7_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( GXutil.strcmp(T002B7_A308CodPro[0], A308CodPro) < 0 ) || ( GXutil.strcmp(T002B7_A308CodPro[0], A308CodPro) == 0 ) && ( GXutil.strcmp(T002B7_A1654RenTerCod[0], A1654RenTerCod) == 0 ) && ( T002B7_A654OrdLin[0] < A654OrdLin ) ) )
         {
            A1654RenTerCod = T002B7_A1654RenTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
            A308CodPro = T002B7_A308CodPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
            A654OrdLin = T002B7_A654OrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
            RcdFound227 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2B227( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRenTerCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2B227( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound227 == 1 )
         {
            if ( ( GXutil.strcmp(A1654RenTerCod, Z1654RenTerCod) != 0 ) || ( GXutil.strcmp(A308CodPro, Z308CodPro) != 0 ) || ( A654OrdLin != Z654OrdLin ) )
            {
               A1654RenTerCod = Z1654RenTerCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
               A308CodPro = Z308CodPro ;
               httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
               A654OrdLin = Z654OrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RENTERCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRenTerCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRenTerCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update2B227( ) ;
               GX_FocusControl = edtRenTerCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A1654RenTerCod, Z1654RenTerCod) != 0 ) || ( GXutil.strcmp(A308CodPro, Z308CodPro) != 0 ) || ( A654OrdLin != Z654OrdLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRenTerCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2B227( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RENTERCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRenTerCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtRenTerCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2B227( ) ;
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
      if ( ( GXutil.strcmp(A1654RenTerCod, Z1654RenTerCod) != 0 ) || ( GXutil.strcmp(A308CodPro, Z308CodPro) != 0 ) || ( A654OrdLin != Z654OrdLin ) )
      {
         A1654RenTerCod = Z1654RenTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
         A308CodPro = Z308CodPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
         A654OrdLin = Z654OrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RENTERCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRenTerCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRenTerCod_Internalname ;
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
      getKey2B227( ) ;
      if ( RcdFound227 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "RENTERCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenTerCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A1654RenTerCod, Z1654RenTerCod) != 0 ) || ( GXutil.strcmp(A308CodPro, Z308CodPro) != 0 ) || ( A654OrdLin != Z654OrdLin ) )
         {
            A1654RenTerCod = Z1654RenTerCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
            A308CodPro = Z308CodPro ;
            httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
            A654OrdLin = Z654OrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "RENTERCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRenTerCod_Internalname ;
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
         if ( ( GXutil.strcmp(A1654RenTerCod, Z1654RenTerCod) != 0 ) || ( GXutil.strcmp(A308CodPro, Z308CodPro) != 0 ) || ( A654OrdLin != Z654OrdLin ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RENTERCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRenTerCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trenfas");
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_2B0( ) ;
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
      if ( RcdFound227 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "RENTERCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRenTerCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2B227( ) ;
      if ( RcdFound227 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2B227( ) ;
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
      if ( RcdFound227 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound227 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart2B227( ) ;
      if ( RcdFound227 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound227 != 0 )
         {
            scanNext2B227( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2B227( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency2B227( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002B2 */
         pr_default.execute(0, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRENFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z457FasCod, T002B2_A457FasCod[0]) != 0 ) || ( Z816RenFasEst != T002B2_A816RenFasEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z818RenFecTeo), GXutil.resetTime(T002B2_A818RenFecTeo[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z817RenFecRea), GXutil.resetTime(T002B2_A817RenFecRea[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z3297RenFecRIni), GXutil.resetTime(T002B2_A3297RenFecRIni[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z824RenTieTeo, T002B2_A824RenTieTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z825RenUni, T002B2_A825RenUni[0]) != 0 ) || ( GXutil.strcmp(Z821RenLoc, T002B2_A821RenLoc[0]) != 0 ) || ( Z820RenHorIni != T002B2_A820RenHorIni[0] ) || ( Z819RenHorFin != T002B2_A819RenHorFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z823RenTieRea, T002B2_A823RenTieRea[0]) != 0 ) || ( GXutil.strcmp(Z822RenMaqCod, T002B2_A822RenMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z815RenFasCon, T002B2_A815RenFasCon[0]) != 0 ) || ( GXutil.strcmp(Z814RenFacTin, T002B2_A814RenFacTin[0]) != 0 ) || ( Z4593RenOrdLin != T002B2_A4593RenOrdLin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4734RenFasPri != T002B2_A4734RenFasPri[0] ) || ( DecimalUtil.compareTo(Z4735RenFasKgm, T002B2_A4735RenFasKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4736RenFasMtr, T002B2_A4736RenFasMtr[0]) != 0 ) || ( GXutil.strcmp(Z4737RenFasBot, T002B2_A4737RenFasBot[0]) != 0 ) || ( Z4738RenNumBot != T002B2_A4738RenNumBot[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4739RenFasFor, T002B2_A4739RenFasFor[0]) != 0 ) || ( Z4740RenFasPzas != T002B2_A4740RenFasPzas[0] ) || ( GXutil.strcmp(Z4741RenFasCop, T002B2_A4741RenFasCop[0]) != 0 ) || ( Z4742RenBarUltL != T002B2_A4742RenBarUltL[0] ) || ( GXutil.strcmp(Z4743RenFasCara, T002B2_A4743RenFasCara[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4904RenFasAcab, T002B2_A4904RenFasAcab[0]) != 0 ) || ( GXutil.strcmp(Z5370RenFasGral, T002B2_A5370RenFasGral[0]) != 0 ) || ( GXutil.strcmp(Z5897RenMaqPlan, T002B2_A5897RenMaqPlan[0]) != 0 ) || ( DecimalUtil.compareTo(Z5992RenFasKgT, T002B2_A5992RenFasKgT[0]) != 0 ) || ( DecimalUtil.compareTo(Z5993RenFasMtT, T002B2_A5993RenFasMtT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6013RenFasTip, T002B2_A6013RenFasTip[0]) != 0 ) || ( GXutil.strcmp(Z6172RenFasSec, T002B2_A6172RenFasSec[0]) != 0 ) || ( GXutil.strcmp(Z6393RenFasMn, T002B2_A6393RenFasMn[0]) != 0 ) || ( Z6394RenfasOP != T002B2_A6394RenfasOP[0] ) || ( GXutil.strcmp(Z6395RenHdMn, T002B2_A6395RenHdMn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8472RenfasRb, T002B2_A8472RenfasRb[0]) != 0 ) || ( Z8490Renfasinc != T002B2_A8490Renfasinc[0] ) || !( GXutil.dateCompare(Z8491Renfasdti, T002B2_A8491Renfasdti[0]) ) || !( GXutil.dateCompare(Z8492Renfasdtf, T002B2_A8492Renfasdtf[0]) ) || ( DecimalUtil.compareTo(Z8493Renfaskpr, T002B2_A8493Renfaskpr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8494RenfasPpr != T002B2_A8494RenfasPpr[0] ) || ( GXutil.strcmp(Z8495Renfasagr, T002B2_A8495Renfasagr[0]) != 0 ) || ( GXutil.strcmp(Z8496Renfasprp, T002B2_A8496Renfasprp[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8497Renfasfpl), GXutil.resetTime(T002B2_A8497Renfasfpl[0])) ) || ( GXutil.strcmp(Z8498Renfasusu, T002B2_A8498Renfasusu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8499Renquiul != T002B2_A8499Renquiul[0] ) || ( DecimalUtil.compareTo(Z8500Renfascr, T002B2_A8500Renfascr[0]) != 0 ) || ( Z8501Rentieaut != T002B2_A8501Rentieaut[0] ) || ( Z8502Renfasnpl != T002B2_A8502Renfasnpl[0] ) || ( DecimalUtil.compareTo(Z8503Renfastpp, T002B2_A8503Renfastpp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8504Renfasunpl, T002B2_A8504Renfasunpl[0]) != 0 ) || ( Z8505Renuord != T002B2_A8505Renuord[0] ) || ( GXutil.strcmp(Z8595RenHdrO, T002B2_A8595RenHdrO[0]) != 0 ) || ( Z8939Renfaspri2 != T002B2_A8939Renfaspri2[0] ) || ( GXutil.strcmp(Z9856RenObsF, T002B2_A9856RenObsF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10130RenObsB, T002B2_A10130RenObsB[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z457FasCod, T002B2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T002B2_A457FasCod[0]);
            }
            if ( Z816RenFasEst != T002B2_A816RenFasEst[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasEst");
               GXutil.writeLogRaw("Old: ",Z816RenFasEst);
               GXutil.writeLogRaw("Current: ",T002B2_A816RenFasEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z818RenFecTeo), GXutil.resetTime(T002B2_A818RenFecTeo[0])) ) )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFecTeo");
               GXutil.writeLogRaw("Old: ",Z818RenFecTeo);
               GXutil.writeLogRaw("Current: ",T002B2_A818RenFecTeo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z817RenFecRea), GXutil.resetTime(T002B2_A817RenFecRea[0])) ) )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFecRea");
               GXutil.writeLogRaw("Old: ",Z817RenFecRea);
               GXutil.writeLogRaw("Current: ",T002B2_A817RenFecRea[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3297RenFecRIni), GXutil.resetTime(T002B2_A3297RenFecRIni[0])) ) )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFecRIni");
               GXutil.writeLogRaw("Old: ",Z3297RenFecRIni);
               GXutil.writeLogRaw("Current: ",T002B2_A3297RenFecRIni[0]);
            }
            if ( DecimalUtil.compareTo(Z824RenTieTeo, T002B2_A824RenTieTeo[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenTieTeo");
               GXutil.writeLogRaw("Old: ",Z824RenTieTeo);
               GXutil.writeLogRaw("Current: ",T002B2_A824RenTieTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z825RenUni, T002B2_A825RenUni[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenUni");
               GXutil.writeLogRaw("Old: ",Z825RenUni);
               GXutil.writeLogRaw("Current: ",T002B2_A825RenUni[0]);
            }
            if ( GXutil.strcmp(Z821RenLoc, T002B2_A821RenLoc[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenLoc");
               GXutil.writeLogRaw("Old: ",Z821RenLoc);
               GXutil.writeLogRaw("Current: ",T002B2_A821RenLoc[0]);
            }
            if ( Z820RenHorIni != T002B2_A820RenHorIni[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenHorIni");
               GXutil.writeLogRaw("Old: ",Z820RenHorIni);
               GXutil.writeLogRaw("Current: ",T002B2_A820RenHorIni[0]);
            }
            if ( Z819RenHorFin != T002B2_A819RenHorFin[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenHorFin");
               GXutil.writeLogRaw("Old: ",Z819RenHorFin);
               GXutil.writeLogRaw("Current: ",T002B2_A819RenHorFin[0]);
            }
            if ( DecimalUtil.compareTo(Z823RenTieRea, T002B2_A823RenTieRea[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenTieRea");
               GXutil.writeLogRaw("Old: ",Z823RenTieRea);
               GXutil.writeLogRaw("Current: ",T002B2_A823RenTieRea[0]);
            }
            if ( GXutil.strcmp(Z822RenMaqCod, T002B2_A822RenMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenMaqCod");
               GXutil.writeLogRaw("Old: ",Z822RenMaqCod);
               GXutil.writeLogRaw("Current: ",T002B2_A822RenMaqCod[0]);
            }
            if ( GXutil.strcmp(Z815RenFasCon, T002B2_A815RenFasCon[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasCon");
               GXutil.writeLogRaw("Old: ",Z815RenFasCon);
               GXutil.writeLogRaw("Current: ",T002B2_A815RenFasCon[0]);
            }
            if ( GXutil.strcmp(Z814RenFacTin, T002B2_A814RenFacTin[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFacTin");
               GXutil.writeLogRaw("Old: ",Z814RenFacTin);
               GXutil.writeLogRaw("Current: ",T002B2_A814RenFacTin[0]);
            }
            if ( Z4593RenOrdLin != T002B2_A4593RenOrdLin[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenOrdLin");
               GXutil.writeLogRaw("Old: ",Z4593RenOrdLin);
               GXutil.writeLogRaw("Current: ",T002B2_A4593RenOrdLin[0]);
            }
            if ( Z4734RenFasPri != T002B2_A4734RenFasPri[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasPri");
               GXutil.writeLogRaw("Old: ",Z4734RenFasPri);
               GXutil.writeLogRaw("Current: ",T002B2_A4734RenFasPri[0]);
            }
            if ( DecimalUtil.compareTo(Z4735RenFasKgm, T002B2_A4735RenFasKgm[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasKgm");
               GXutil.writeLogRaw("Old: ",Z4735RenFasKgm);
               GXutil.writeLogRaw("Current: ",T002B2_A4735RenFasKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z4736RenFasMtr, T002B2_A4736RenFasMtr[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasMtr");
               GXutil.writeLogRaw("Old: ",Z4736RenFasMtr);
               GXutil.writeLogRaw("Current: ",T002B2_A4736RenFasMtr[0]);
            }
            if ( GXutil.strcmp(Z4737RenFasBot, T002B2_A4737RenFasBot[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasBot");
               GXutil.writeLogRaw("Old: ",Z4737RenFasBot);
               GXutil.writeLogRaw("Current: ",T002B2_A4737RenFasBot[0]);
            }
            if ( Z4738RenNumBot != T002B2_A4738RenNumBot[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenNumBot");
               GXutil.writeLogRaw("Old: ",Z4738RenNumBot);
               GXutil.writeLogRaw("Current: ",T002B2_A4738RenNumBot[0]);
            }
            if ( GXutil.strcmp(Z4739RenFasFor, T002B2_A4739RenFasFor[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasFor");
               GXutil.writeLogRaw("Old: ",Z4739RenFasFor);
               GXutil.writeLogRaw("Current: ",T002B2_A4739RenFasFor[0]);
            }
            if ( Z4740RenFasPzas != T002B2_A4740RenFasPzas[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasPzas");
               GXutil.writeLogRaw("Old: ",Z4740RenFasPzas);
               GXutil.writeLogRaw("Current: ",T002B2_A4740RenFasPzas[0]);
            }
            if ( GXutil.strcmp(Z4741RenFasCop, T002B2_A4741RenFasCop[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasCop");
               GXutil.writeLogRaw("Old: ",Z4741RenFasCop);
               GXutil.writeLogRaw("Current: ",T002B2_A4741RenFasCop[0]);
            }
            if ( Z4742RenBarUltL != T002B2_A4742RenBarUltL[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenBarUltL");
               GXutil.writeLogRaw("Old: ",Z4742RenBarUltL);
               GXutil.writeLogRaw("Current: ",T002B2_A4742RenBarUltL[0]);
            }
            if ( GXutil.strcmp(Z4743RenFasCara, T002B2_A4743RenFasCara[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasCara");
               GXutil.writeLogRaw("Old: ",Z4743RenFasCara);
               GXutil.writeLogRaw("Current: ",T002B2_A4743RenFasCara[0]);
            }
            if ( GXutil.strcmp(Z4904RenFasAcab, T002B2_A4904RenFasAcab[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasAcab");
               GXutil.writeLogRaw("Old: ",Z4904RenFasAcab);
               GXutil.writeLogRaw("Current: ",T002B2_A4904RenFasAcab[0]);
            }
            if ( GXutil.strcmp(Z5370RenFasGral, T002B2_A5370RenFasGral[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasGral");
               GXutil.writeLogRaw("Old: ",Z5370RenFasGral);
               GXutil.writeLogRaw("Current: ",T002B2_A5370RenFasGral[0]);
            }
            if ( GXutil.strcmp(Z5897RenMaqPlan, T002B2_A5897RenMaqPlan[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenMaqPlan");
               GXutil.writeLogRaw("Old: ",Z5897RenMaqPlan);
               GXutil.writeLogRaw("Current: ",T002B2_A5897RenMaqPlan[0]);
            }
            if ( DecimalUtil.compareTo(Z5992RenFasKgT, T002B2_A5992RenFasKgT[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasKgT");
               GXutil.writeLogRaw("Old: ",Z5992RenFasKgT);
               GXutil.writeLogRaw("Current: ",T002B2_A5992RenFasKgT[0]);
            }
            if ( DecimalUtil.compareTo(Z5993RenFasMtT, T002B2_A5993RenFasMtT[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasMtT");
               GXutil.writeLogRaw("Old: ",Z5993RenFasMtT);
               GXutil.writeLogRaw("Current: ",T002B2_A5993RenFasMtT[0]);
            }
            if ( GXutil.strcmp(Z6013RenFasTip, T002B2_A6013RenFasTip[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasTip");
               GXutil.writeLogRaw("Old: ",Z6013RenFasTip);
               GXutil.writeLogRaw("Current: ",T002B2_A6013RenFasTip[0]);
            }
            if ( GXutil.strcmp(Z6172RenFasSec, T002B2_A6172RenFasSec[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasSec");
               GXutil.writeLogRaw("Old: ",Z6172RenFasSec);
               GXutil.writeLogRaw("Current: ",T002B2_A6172RenFasSec[0]);
            }
            if ( GXutil.strcmp(Z6393RenFasMn, T002B2_A6393RenFasMn[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenFasMn");
               GXutil.writeLogRaw("Old: ",Z6393RenFasMn);
               GXutil.writeLogRaw("Current: ",T002B2_A6393RenFasMn[0]);
            }
            if ( Z6394RenfasOP != T002B2_A6394RenfasOP[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenfasOP");
               GXutil.writeLogRaw("Old: ",Z6394RenfasOP);
               GXutil.writeLogRaw("Current: ",T002B2_A6394RenfasOP[0]);
            }
            if ( GXutil.strcmp(Z6395RenHdMn, T002B2_A6395RenHdMn[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenHdMn");
               GXutil.writeLogRaw("Old: ",Z6395RenHdMn);
               GXutil.writeLogRaw("Current: ",T002B2_A6395RenHdMn[0]);
            }
            if ( DecimalUtil.compareTo(Z8472RenfasRb, T002B2_A8472RenfasRb[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenfasRb");
               GXutil.writeLogRaw("Old: ",Z8472RenfasRb);
               GXutil.writeLogRaw("Current: ",T002B2_A8472RenfasRb[0]);
            }
            if ( Z8490Renfasinc != T002B2_A8490Renfasinc[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasinc");
               GXutil.writeLogRaw("Old: ",Z8490Renfasinc);
               GXutil.writeLogRaw("Current: ",T002B2_A8490Renfasinc[0]);
            }
            if ( !( GXutil.dateCompare(Z8491Renfasdti, T002B2_A8491Renfasdti[0]) ) )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasdti");
               GXutil.writeLogRaw("Old: ",Z8491Renfasdti);
               GXutil.writeLogRaw("Current: ",T002B2_A8491Renfasdti[0]);
            }
            if ( !( GXutil.dateCompare(Z8492Renfasdtf, T002B2_A8492Renfasdtf[0]) ) )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasdtf");
               GXutil.writeLogRaw("Old: ",Z8492Renfasdtf);
               GXutil.writeLogRaw("Current: ",T002B2_A8492Renfasdtf[0]);
            }
            if ( DecimalUtil.compareTo(Z8493Renfaskpr, T002B2_A8493Renfaskpr[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfaskpr");
               GXutil.writeLogRaw("Old: ",Z8493Renfaskpr);
               GXutil.writeLogRaw("Current: ",T002B2_A8493Renfaskpr[0]);
            }
            if ( Z8494RenfasPpr != T002B2_A8494RenfasPpr[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenfasPpr");
               GXutil.writeLogRaw("Old: ",Z8494RenfasPpr);
               GXutil.writeLogRaw("Current: ",T002B2_A8494RenfasPpr[0]);
            }
            if ( GXutil.strcmp(Z8495Renfasagr, T002B2_A8495Renfasagr[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasagr");
               GXutil.writeLogRaw("Old: ",Z8495Renfasagr);
               GXutil.writeLogRaw("Current: ",T002B2_A8495Renfasagr[0]);
            }
            if ( GXutil.strcmp(Z8496Renfasprp, T002B2_A8496Renfasprp[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasprp");
               GXutil.writeLogRaw("Old: ",Z8496Renfasprp);
               GXutil.writeLogRaw("Current: ",T002B2_A8496Renfasprp[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8497Renfasfpl), GXutil.resetTime(T002B2_A8497Renfasfpl[0])) ) )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasfpl");
               GXutil.writeLogRaw("Old: ",Z8497Renfasfpl);
               GXutil.writeLogRaw("Current: ",T002B2_A8497Renfasfpl[0]);
            }
            if ( GXutil.strcmp(Z8498Renfasusu, T002B2_A8498Renfasusu[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasusu");
               GXutil.writeLogRaw("Old: ",Z8498Renfasusu);
               GXutil.writeLogRaw("Current: ",T002B2_A8498Renfasusu[0]);
            }
            if ( Z8499Renquiul != T002B2_A8499Renquiul[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renquiul");
               GXutil.writeLogRaw("Old: ",Z8499Renquiul);
               GXutil.writeLogRaw("Current: ",T002B2_A8499Renquiul[0]);
            }
            if ( DecimalUtil.compareTo(Z8500Renfascr, T002B2_A8500Renfascr[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfascr");
               GXutil.writeLogRaw("Old: ",Z8500Renfascr);
               GXutil.writeLogRaw("Current: ",T002B2_A8500Renfascr[0]);
            }
            if ( Z8501Rentieaut != T002B2_A8501Rentieaut[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Rentieaut");
               GXutil.writeLogRaw("Old: ",Z8501Rentieaut);
               GXutil.writeLogRaw("Current: ",T002B2_A8501Rentieaut[0]);
            }
            if ( Z8502Renfasnpl != T002B2_A8502Renfasnpl[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasnpl");
               GXutil.writeLogRaw("Old: ",Z8502Renfasnpl);
               GXutil.writeLogRaw("Current: ",T002B2_A8502Renfasnpl[0]);
            }
            if ( DecimalUtil.compareTo(Z8503Renfastpp, T002B2_A8503Renfastpp[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfastpp");
               GXutil.writeLogRaw("Old: ",Z8503Renfastpp);
               GXutil.writeLogRaw("Current: ",T002B2_A8503Renfastpp[0]);
            }
            if ( DecimalUtil.compareTo(Z8504Renfasunpl, T002B2_A8504Renfasunpl[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfasunpl");
               GXutil.writeLogRaw("Old: ",Z8504Renfasunpl);
               GXutil.writeLogRaw("Current: ",T002B2_A8504Renfasunpl[0]);
            }
            if ( Z8505Renuord != T002B2_A8505Renuord[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renuord");
               GXutil.writeLogRaw("Old: ",Z8505Renuord);
               GXutil.writeLogRaw("Current: ",T002B2_A8505Renuord[0]);
            }
            if ( GXutil.strcmp(Z8595RenHdrO, T002B2_A8595RenHdrO[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenHdrO");
               GXutil.writeLogRaw("Old: ",Z8595RenHdrO);
               GXutil.writeLogRaw("Current: ",T002B2_A8595RenHdrO[0]);
            }
            if ( Z8939Renfaspri2 != T002B2_A8939Renfaspri2[0] )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"Renfaspri2");
               GXutil.writeLogRaw("Old: ",Z8939Renfaspri2);
               GXutil.writeLogRaw("Current: ",T002B2_A8939Renfaspri2[0]);
            }
            if ( GXutil.strcmp(Z9856RenObsF, T002B2_A9856RenObsF[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenObsF");
               GXutil.writeLogRaw("Old: ",Z9856RenObsF);
               GXutil.writeLogRaw("Current: ",T002B2_A9856RenObsF[0]);
            }
            if ( GXutil.strcmp(Z10130RenObsB, T002B2_A10130RenObsB[0]) != 0 )
            {
               GXutil.writeLogln("trenfas:[seudo value changed for attri]"+"RenObsB");
               GXutil.writeLogRaw("Old: ",Z10130RenObsB);
               GXutil.writeLogRaw("Current: ",T002B2_A10130RenObsB[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRENFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2B227( )
   {
      beforeValidate2B227( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2B227( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2B227( 0) ;
         checkOptimisticConcurrency2B227( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2B227( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2B227( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002B8 */
                  pr_default.execute(6, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n816RenFasEst), Byte.valueOf(A816RenFasEst), Boolean.valueOf(n818RenFecTeo), A818RenFecTeo, Boolean.valueOf(n817RenFecRea), A817RenFecRea, Boolean.valueOf(n3297RenFecRIni), A3297RenFecRIni, Boolean.valueOf(n824RenTieTeo), A824RenTieTeo, Boolean.valueOf(n825RenUni), A825RenUni, Boolean.valueOf(n821RenLoc), A821RenLoc, Boolean.valueOf(n820RenHorIni), Short.valueOf(A820RenHorIni), Boolean.valueOf(n819RenHorFin), Short.valueOf(A819RenHorFin), Boolean.valueOf(n823RenTieRea), A823RenTieRea, Boolean.valueOf(n822RenMaqCod), A822RenMaqCod, Boolean.valueOf(n815RenFasCon), A815RenFasCon, Boolean.valueOf(n814RenFacTin), A814RenFacTin, Boolean.valueOf(n4593RenOrdLin), Short.valueOf(A4593RenOrdLin), Boolean.valueOf(n4734RenFasPri), Byte.valueOf(A4734RenFasPri), Boolean.valueOf(n4735RenFasKgm), A4735RenFasKgm, Boolean.valueOf(n4736RenFasMtr), A4736RenFasMtr, Boolean.valueOf(n4737RenFasBot), A4737RenFasBot, Boolean.valueOf(n4738RenNumBot), Integer.valueOf(A4738RenNumBot), Boolean.valueOf(n4739RenFasFor), A4739RenFasFor, Boolean.valueOf(n4740RenFasPzas), Integer.valueOf(A4740RenFasPzas), Boolean.valueOf(n4741RenFasCop), A4741RenFasCop, Boolean.valueOf(n4742RenBarUltL), Integer.valueOf(A4742RenBarUltL), Boolean.valueOf(n4743RenFasCara), A4743RenFasCara, Boolean.valueOf(n4904RenFasAcab), A4904RenFasAcab, Boolean.valueOf(n5370RenFasGral), A5370RenFasGral, Boolean.valueOf(n5897RenMaqPlan), A5897RenMaqPlan, Boolean.valueOf(n5992RenFasKgT), A5992RenFasKgT, Boolean.valueOf(n5993RenFasMtT), A5993RenFasMtT, Boolean.valueOf(n6013RenFasTip), A6013RenFasTip, Boolean.valueOf(n6172RenFasSec), A6172RenFasSec, Boolean.valueOf(n6393RenFasMn), A6393RenFasMn, Boolean.valueOf(n6394RenfasOP), Short.valueOf(A6394RenfasOP), Boolean.valueOf(n6395RenHdMn), A6395RenHdMn, Boolean.valueOf(n8472RenfasRb), A8472RenfasRb, Boolean.valueOf(n8490Renfasinc), Byte.valueOf(A8490Renfasinc), Boolean.valueOf(n8491Renfasdti), A8491Renfasdti, Boolean.valueOf(n8492Renfasdtf), A8492Renfasdtf, Boolean.valueOf(n8493Renfaskpr), A8493Renfaskpr, Boolean.valueOf(n8494RenfasPpr), Short.valueOf(A8494RenfasPpr), Boolean.valueOf(n8495Renfasagr), A8495Renfasagr, Boolean.valueOf(n8496Renfasprp), A8496Renfasprp, Boolean.valueOf(n8497Renfasfpl), A8497Renfasfpl, Boolean.valueOf(n8498Renfasusu), A8498Renfasusu, Boolean.valueOf(n8499Renquiul), Short.valueOf(A8499Renquiul), Boolean.valueOf(n8500Renfascr), A8500Renfascr, Boolean.valueOf(n8501Rentieaut), Short.valueOf(A8501Rentieaut), Boolean.valueOf(n8502Renfasnpl), Byte.valueOf(A8502Renfasnpl), Boolean.valueOf(n8503Renfastpp), A8503Renfastpp, Boolean.valueOf(n8504Renfasunpl), A8504Renfasunpl, Boolean.valueOf(n8505Renuord), Short.valueOf(A8505Renuord), Boolean.valueOf(n8595RenHdrO), A8595RenHdrO, Boolean.valueOf(n8939Renfaspri2), Short.valueOf(A8939Renfaspri2), Boolean.valueOf(n9856RenObsF), A9856RenObsF, Boolean.valueOf(n10130RenObsB), A10130RenObsB});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRENFAS");
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
                        resetCaption2B0( ) ;
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
            load2B227( ) ;
         }
         endLevel2B227( ) ;
      }
      closeExtendedTableCursors2B227( ) ;
   }

   public void update2B227( )
   {
      beforeValidate2B227( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2B227( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2B227( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2B227( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2B227( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002B9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n816RenFasEst), Byte.valueOf(A816RenFasEst), Boolean.valueOf(n818RenFecTeo), A818RenFecTeo, Boolean.valueOf(n817RenFecRea), A817RenFecRea, Boolean.valueOf(n3297RenFecRIni), A3297RenFecRIni, Boolean.valueOf(n824RenTieTeo), A824RenTieTeo, Boolean.valueOf(n825RenUni), A825RenUni, Boolean.valueOf(n821RenLoc), A821RenLoc, Boolean.valueOf(n820RenHorIni), Short.valueOf(A820RenHorIni), Boolean.valueOf(n819RenHorFin), Short.valueOf(A819RenHorFin), Boolean.valueOf(n823RenTieRea), A823RenTieRea, Boolean.valueOf(n822RenMaqCod), A822RenMaqCod, Boolean.valueOf(n815RenFasCon), A815RenFasCon, Boolean.valueOf(n814RenFacTin), A814RenFacTin, Boolean.valueOf(n4593RenOrdLin), Short.valueOf(A4593RenOrdLin), Boolean.valueOf(n4734RenFasPri), Byte.valueOf(A4734RenFasPri), Boolean.valueOf(n4735RenFasKgm), A4735RenFasKgm, Boolean.valueOf(n4736RenFasMtr), A4736RenFasMtr, Boolean.valueOf(n4737RenFasBot), A4737RenFasBot, Boolean.valueOf(n4738RenNumBot), Integer.valueOf(A4738RenNumBot), Boolean.valueOf(n4739RenFasFor), A4739RenFasFor, Boolean.valueOf(n4740RenFasPzas), Integer.valueOf(A4740RenFasPzas), Boolean.valueOf(n4741RenFasCop), A4741RenFasCop, Boolean.valueOf(n4742RenBarUltL), Integer.valueOf(A4742RenBarUltL), Boolean.valueOf(n4743RenFasCara), A4743RenFasCara, Boolean.valueOf(n4904RenFasAcab), A4904RenFasAcab, Boolean.valueOf(n5370RenFasGral), A5370RenFasGral, Boolean.valueOf(n5897RenMaqPlan), A5897RenMaqPlan, Boolean.valueOf(n5992RenFasKgT), A5992RenFasKgT, Boolean.valueOf(n5993RenFasMtT), A5993RenFasMtT, Boolean.valueOf(n6013RenFasTip), A6013RenFasTip, Boolean.valueOf(n6172RenFasSec), A6172RenFasSec, Boolean.valueOf(n6393RenFasMn), A6393RenFasMn, Boolean.valueOf(n6394RenfasOP), Short.valueOf(A6394RenfasOP), Boolean.valueOf(n6395RenHdMn), A6395RenHdMn, Boolean.valueOf(n8472RenfasRb), A8472RenfasRb, Boolean.valueOf(n8490Renfasinc), Byte.valueOf(A8490Renfasinc), Boolean.valueOf(n8491Renfasdti), A8491Renfasdti, Boolean.valueOf(n8492Renfasdtf), A8492Renfasdtf, Boolean.valueOf(n8493Renfaskpr), A8493Renfaskpr, Boolean.valueOf(n8494RenfasPpr), Short.valueOf(A8494RenfasPpr), Boolean.valueOf(n8495Renfasagr), A8495Renfasagr, Boolean.valueOf(n8496Renfasprp), A8496Renfasprp, Boolean.valueOf(n8497Renfasfpl), A8497Renfasfpl, Boolean.valueOf(n8498Renfasusu), A8498Renfasusu, Boolean.valueOf(n8499Renquiul), Short.valueOf(A8499Renquiul), Boolean.valueOf(n8500Renfascr), A8500Renfascr, Boolean.valueOf(n8501Rentieaut), Short.valueOf(A8501Rentieaut), Boolean.valueOf(n8502Renfasnpl), Byte.valueOf(A8502Renfasnpl), Boolean.valueOf(n8503Renfastpp), A8503Renfastpp, Boolean.valueOf(n8504Renfasunpl), A8504Renfasunpl, Boolean.valueOf(n8505Renuord), Short.valueOf(A8505Renuord), Boolean.valueOf(n8595RenHdrO), A8595RenHdrO, Boolean.valueOf(n8939Renfaspri2), Short.valueOf(A8939Renfaspri2), Boolean.valueOf(n9856RenObsF), A9856RenObsF, Boolean.valueOf(n10130RenObsB), A10130RenObsB, A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRENFAS");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRENFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2B227( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption2B0( ) ;
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
         endLevel2B227( ) ;
      }
      closeExtendedTableCursors2B227( ) ;
   }

   public void deferredUpdate2B227( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2B227( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2B227( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2B227( ) ;
         afterConfirm2B227( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2B227( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002B10 */
               pr_default.execute(8, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRENFAS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound227 == 0 )
                     {
                        initAll2B227( ) ;
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
                     resetCaption2B0( ) ;
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
      sMode227 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2B227( ) ;
      Gx_mode = sMode227 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2B227( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel2B227( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2B227( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trenfas");
         if ( AnyError == 0 )
         {
            confirmValues2B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trenfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2B227( )
   {
      /* Using cursor T002B11 */
      pr_default.execute(9);
      RcdFound227 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound227 = (short)(1) ;
         A1654RenTerCod = T002B11_A1654RenTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
         A308CodPro = T002B11_A308CodPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
         A654OrdLin = T002B11_A654OrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2B227( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound227 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound227 = (short)(1) ;
         A1654RenTerCod = T002B11_A1654RenTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
         A308CodPro = T002B11_A308CodPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
         A654OrdLin = T002B11_A654OrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
      }
   }

   public void scanEnd2B227( )
   {
      pr_default.close(9);
   }

   public void afterConfirm2B227( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2B227( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2B227( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2B227( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2B227( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2B227( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2B227( )
   {
      edtRenTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenTerCod_Enabled), 5, 0), true);
      edtCodPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodPro_Enabled), 5, 0), true);
      edtOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtRenFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasEst_Enabled), 5, 0), true);
      edtRenFecTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFecTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFecTeo_Enabled), 5, 0), true);
      edtRenFecRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFecRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFecRea_Enabled), 5, 0), true);
      edtRenFecRIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFecRIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFecRIni_Enabled), 5, 0), true);
      edtRenTieTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenTieTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenTieTeo_Enabled), 5, 0), true);
      edtRenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenUni_Enabled), 5, 0), true);
      edtRenLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenLoc_Enabled), 5, 0), true);
      edtRenHorIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenHorIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenHorIni_Enabled), 5, 0), true);
      edtRenHorFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenHorFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenHorFin_Enabled), 5, 0), true);
      edtRenTieRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenTieRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenTieRea_Enabled), 5, 0), true);
      edtRenMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenMaqCod_Enabled), 5, 0), true);
      edtRenFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasCon_Enabled), 5, 0), true);
      edtRenFacTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFacTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFacTin_Enabled), 5, 0), true);
      edtRenOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenOrdLin_Enabled), 5, 0), true);
      edtRenFasPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasPri_Enabled), 5, 0), true);
      edtRenFasKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasKgm_Enabled), 5, 0), true);
      edtRenFasMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasMtr_Enabled), 5, 0), true);
      edtRenFasBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasBot_Enabled), 5, 0), true);
      edtRenNumBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenNumBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenNumBot_Enabled), 5, 0), true);
      edtRenFasFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasFor_Enabled), 5, 0), true);
      edtRenFasPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasPzas_Enabled), 5, 0), true);
      edtRenFasCop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasCop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasCop_Enabled), 5, 0), true);
      edtRenBarUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenBarUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenBarUltL_Enabled), 5, 0), true);
      edtRenFasCara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasCara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasCara_Enabled), 5, 0), true);
      edtRenFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasAcab_Enabled), 5, 0), true);
      edtRenFasGral_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasGral_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasGral_Enabled), 5, 0), true);
      edtRenMaqPlan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenMaqPlan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenMaqPlan_Enabled), 5, 0), true);
      edtRenFasKgT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasKgT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasKgT_Enabled), 5, 0), true);
      edtRenFasMtT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasMtT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasMtT_Enabled), 5, 0), true);
      edtRenFasTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasTip_Enabled), 5, 0), true);
      edtRenFasSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasSec_Enabled), 5, 0), true);
      edtRenFasMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenFasMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenFasMn_Enabled), 5, 0), true);
      edtRenfasOP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasOP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasOP_Enabled), 5, 0), true);
      edtRenHdMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenHdMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenHdMn_Enabled), 5, 0), true);
      edtRenfasRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasRb_Enabled), 5, 0), true);
      edtRenfasinc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasinc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasinc_Enabled), 5, 0), true);
      edtRenfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasdti_Enabled), 5, 0), true);
      edtRenfasdtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasdtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasdtf_Enabled), 5, 0), true);
      edtRenfaskpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfaskpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfaskpr_Enabled), 5, 0), true);
      edtRenfasPpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasPpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasPpr_Enabled), 5, 0), true);
      edtRenfasagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasagr_Enabled), 5, 0), true);
      edtRenfasprp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasprp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasprp_Enabled), 5, 0), true);
      edtRenfasfpl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasfpl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasfpl_Enabled), 5, 0), true);
      edtRenfasusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasusu_Enabled), 5, 0), true);
      edtRenquiul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenquiul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenquiul_Enabled), 5, 0), true);
      edtRenfascr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfascr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfascr_Enabled), 5, 0), true);
      edtRentieaut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRentieaut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRentieaut_Enabled), 5, 0), true);
      edtRenfasnpl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasnpl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasnpl_Enabled), 5, 0), true);
      edtRenfastpp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfastpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfastpp_Enabled), 5, 0), true);
      edtRenfasunpl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfasunpl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfasunpl_Enabled), 5, 0), true);
      edtRenuord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenuord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenuord_Enabled), 5, 0), true);
      edtRenHdrO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenHdrO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenHdrO_Enabled), 5, 0), true);
      edtRenfaspri2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenfaspri2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenfaspri2_Enabled), 5, 0), true);
      edtRenObsF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenObsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenObsF_Enabled), 5, 0), true);
      edtRenObsB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRenObsB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRenObsB_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2B227( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2B0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trenfas", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1654RenTerCod", GXutil.rtrim( Z1654RenTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z308CodPro", GXutil.rtrim( Z308CodPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z654OrdLin", GXutil.ltrim( localUtil.ntoc( Z654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z816RenFasEst", GXutil.ltrim( localUtil.ntoc( Z816RenFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z818RenFecTeo", localUtil.dtoc( Z818RenFecTeo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z817RenFecRea", localUtil.dtoc( Z817RenFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3297RenFecRIni", localUtil.dtoc( Z3297RenFecRIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z824RenTieTeo", GXutil.ltrim( localUtil.ntoc( Z824RenTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z825RenUni", GXutil.ltrim( localUtil.ntoc( Z825RenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z821RenLoc", GXutil.rtrim( Z821RenLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z820RenHorIni", GXutil.ltrim( localUtil.ntoc( Z820RenHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z819RenHorFin", GXutil.ltrim( localUtil.ntoc( Z819RenHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z823RenTieRea", GXutil.ltrim( localUtil.ntoc( Z823RenTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z822RenMaqCod", GXutil.rtrim( Z822RenMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z815RenFasCon", GXutil.rtrim( Z815RenFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z814RenFacTin", GXutil.rtrim( Z814RenFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4593RenOrdLin", GXutil.ltrim( localUtil.ntoc( Z4593RenOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4734RenFasPri", GXutil.ltrim( localUtil.ntoc( Z4734RenFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4735RenFasKgm", GXutil.ltrim( localUtil.ntoc( Z4735RenFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4736RenFasMtr", GXutil.ltrim( localUtil.ntoc( Z4736RenFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4737RenFasBot", GXutil.rtrim( Z4737RenFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4738RenNumBot", GXutil.ltrim( localUtil.ntoc( Z4738RenNumBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4739RenFasFor", GXutil.rtrim( Z4739RenFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4740RenFasPzas", GXutil.ltrim( localUtil.ntoc( Z4740RenFasPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4741RenFasCop", GXutil.rtrim( Z4741RenFasCop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4742RenBarUltL", GXutil.ltrim( localUtil.ntoc( Z4742RenBarUltL, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4743RenFasCara", GXutil.rtrim( Z4743RenFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4904RenFasAcab", GXutil.rtrim( Z4904RenFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5370RenFasGral", GXutil.rtrim( Z5370RenFasGral));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5897RenMaqPlan", GXutil.rtrim( Z5897RenMaqPlan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5992RenFasKgT", GXutil.ltrim( localUtil.ntoc( Z5992RenFasKgT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5993RenFasMtT", GXutil.ltrim( localUtil.ntoc( Z5993RenFasMtT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6013RenFasTip", GXutil.rtrim( Z6013RenFasTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6172RenFasSec", GXutil.rtrim( Z6172RenFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6393RenFasMn", GXutil.rtrim( Z6393RenFasMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6394RenfasOP", GXutil.ltrim( localUtil.ntoc( Z6394RenfasOP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6395RenHdMn", GXutil.rtrim( Z6395RenHdMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8472RenfasRb", GXutil.ltrim( localUtil.ntoc( Z8472RenfasRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8490Renfasinc", GXutil.ltrim( localUtil.ntoc( Z8490Renfasinc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8491Renfasdti", localUtil.ttoc( Z8491Renfasdti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8492Renfasdtf", localUtil.ttoc( Z8492Renfasdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8493Renfaskpr", GXutil.ltrim( localUtil.ntoc( Z8493Renfaskpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8494RenfasPpr", GXutil.ltrim( localUtil.ntoc( Z8494RenfasPpr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8495Renfasagr", GXutil.rtrim( Z8495Renfasagr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8496Renfasprp", GXutil.rtrim( Z8496Renfasprp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8497Renfasfpl", localUtil.dtoc( Z8497Renfasfpl, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8498Renfasusu", GXutil.rtrim( Z8498Renfasusu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8499Renquiul", GXutil.ltrim( localUtil.ntoc( Z8499Renquiul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8500Renfascr", GXutil.ltrim( localUtil.ntoc( Z8500Renfascr, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8501Rentieaut", GXutil.ltrim( localUtil.ntoc( Z8501Rentieaut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8502Renfasnpl", GXutil.ltrim( localUtil.ntoc( Z8502Renfasnpl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8503Renfastpp", GXutil.ltrim( localUtil.ntoc( Z8503Renfastpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8504Renfasunpl", GXutil.ltrim( localUtil.ntoc( Z8504Renfasunpl, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8505Renuord", GXutil.ltrim( localUtil.ntoc( Z8505Renuord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8595RenHdrO", GXutil.rtrim( Z8595RenHdrO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8939Renfaspri2", GXutil.ltrim( localUtil.ntoc( Z8939Renfaspri2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9856RenObsF", Z9856RenObsF);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10130RenObsB", Z10130RenObsB);
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
      return formatLink("app.trenfas", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRENFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RENUMERACION DE FASES", "") ;
   }

   public void initializeNonKey2B227( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A816RenFasEst = (byte)(0) ;
      n816RenFasEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A816RenFasEst", GXutil.str( A816RenFasEst, 1, 0));
      A818RenFecTeo = GXutil.nullDate() ;
      n818RenFecTeo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A818RenFecTeo", localUtil.format(A818RenFecTeo, "99/99/99"));
      A817RenFecRea = GXutil.nullDate() ;
      n817RenFecRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A817RenFecRea", localUtil.format(A817RenFecRea, "99/99/99"));
      A3297RenFecRIni = GXutil.nullDate() ;
      n3297RenFecRIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3297RenFecRIni", localUtil.format(A3297RenFecRIni, "99/99/99"));
      A824RenTieTeo = DecimalUtil.ZERO ;
      n824RenTieTeo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A824RenTieTeo", GXutil.ltrimstr( A824RenTieTeo, 5, 2));
      A825RenUni = DecimalUtil.ZERO ;
      n825RenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A825RenUni", GXutil.ltrimstr( A825RenUni, 9, 2));
      A821RenLoc = "" ;
      n821RenLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A821RenLoc", A821RenLoc);
      A820RenHorIni = (short)(0) ;
      n820RenHorIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A820RenHorIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A820RenHorIni), 4, 0));
      A819RenHorFin = (short)(0) ;
      n819RenHorFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A819RenHorFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A819RenHorFin), 4, 0));
      A823RenTieRea = DecimalUtil.ZERO ;
      n823RenTieRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A823RenTieRea", GXutil.ltrimstr( A823RenTieRea, 5, 2));
      A822RenMaqCod = "" ;
      n822RenMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A822RenMaqCod", A822RenMaqCod);
      A815RenFasCon = "" ;
      n815RenFasCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A815RenFasCon", A815RenFasCon);
      A814RenFacTin = "" ;
      n814RenFacTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A814RenFacTin", A814RenFacTin);
      A4593RenOrdLin = (short)(0) ;
      n4593RenOrdLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4593RenOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4593RenOrdLin), 4, 0));
      A4734RenFasPri = (byte)(0) ;
      n4734RenFasPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4734RenFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4734RenFasPri), 2, 0));
      A4735RenFasKgm = DecimalUtil.ZERO ;
      n4735RenFasKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4735RenFasKgm", GXutil.ltrimstr( A4735RenFasKgm, 9, 2));
      A4736RenFasMtr = DecimalUtil.ZERO ;
      n4736RenFasMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4736RenFasMtr", GXutil.ltrimstr( A4736RenFasMtr, 9, 2));
      A4737RenFasBot = "" ;
      n4737RenFasBot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4737RenFasBot", A4737RenFasBot);
      A4738RenNumBot = 0 ;
      n4738RenNumBot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4738RenNumBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4738RenNumBot), 6, 0));
      A4739RenFasFor = "" ;
      n4739RenFasFor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4739RenFasFor", A4739RenFasFor);
      A4740RenFasPzas = 0 ;
      n4740RenFasPzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4740RenFasPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4740RenFasPzas), 6, 0));
      A4741RenFasCop = "" ;
      n4741RenFasCop = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4741RenFasCop", A4741RenFasCop);
      A4742RenBarUltL = 0 ;
      n4742RenBarUltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4742RenBarUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4742RenBarUltL), 6, 0));
      A4743RenFasCara = "" ;
      n4743RenFasCara = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4743RenFasCara", A4743RenFasCara);
      A4904RenFasAcab = "" ;
      n4904RenFasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4904RenFasAcab", A4904RenFasAcab);
      A5370RenFasGral = "" ;
      n5370RenFasGral = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5370RenFasGral", A5370RenFasGral);
      A5897RenMaqPlan = "" ;
      n5897RenMaqPlan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5897RenMaqPlan", A5897RenMaqPlan);
      A5992RenFasKgT = DecimalUtil.ZERO ;
      n5992RenFasKgT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5992RenFasKgT", GXutil.ltrimstr( A5992RenFasKgT, 9, 2));
      A5993RenFasMtT = DecimalUtil.ZERO ;
      n5993RenFasMtT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5993RenFasMtT", GXutil.ltrimstr( A5993RenFasMtT, 9, 2));
      A6013RenFasTip = "" ;
      n6013RenFasTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6013RenFasTip", A6013RenFasTip);
      A6172RenFasSec = "" ;
      n6172RenFasSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6172RenFasSec", A6172RenFasSec);
      A6393RenFasMn = "" ;
      n6393RenFasMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6393RenFasMn", A6393RenFasMn);
      A6394RenfasOP = (short)(0) ;
      n6394RenfasOP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6394RenfasOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6394RenfasOP), 4, 0));
      A6395RenHdMn = "" ;
      n6395RenHdMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6395RenHdMn", A6395RenHdMn);
      A8472RenfasRb = DecimalUtil.ZERO ;
      n8472RenfasRb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8472RenfasRb", GXutil.ltrimstr( A8472RenfasRb, 7, 2));
      A8490Renfasinc = (byte)(0) ;
      n8490Renfasinc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8490Renfasinc", GXutil.str( A8490Renfasinc, 1, 0));
      A8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
      n8491Renfasdti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8491Renfasdti", localUtil.ttoc( A8491Renfasdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
      n8492Renfasdtf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8492Renfasdtf", localUtil.ttoc( A8492Renfasdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8493Renfaskpr = DecimalUtil.ZERO ;
      n8493Renfaskpr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8493Renfaskpr", GXutil.ltrimstr( A8493Renfaskpr, 9, 2));
      A8494RenfasPpr = (short)(0) ;
      n8494RenfasPpr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8494RenfasPpr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8494RenfasPpr), 4, 0));
      A8495Renfasagr = "" ;
      n8495Renfasagr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8495Renfasagr", A8495Renfasagr);
      A8496Renfasprp = "" ;
      n8496Renfasprp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8496Renfasprp", A8496Renfasprp);
      A8497Renfasfpl = GXutil.nullDate() ;
      n8497Renfasfpl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8497Renfasfpl", localUtil.format(A8497Renfasfpl, "99/99/99"));
      A8498Renfasusu = "" ;
      n8498Renfasusu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8498Renfasusu", A8498Renfasusu);
      A8499Renquiul = (short)(0) ;
      n8499Renquiul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8499Renquiul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8499Renquiul), 4, 0));
      A8500Renfascr = DecimalUtil.ZERO ;
      n8500Renfascr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8500Renfascr", GXutil.ltrimstr( A8500Renfascr, 11, 5));
      A8501Rentieaut = (short)(0) ;
      n8501Rentieaut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8501Rentieaut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8501Rentieaut), 4, 0));
      A8502Renfasnpl = (byte)(0) ;
      n8502Renfasnpl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8502Renfasnpl", GXutil.str( A8502Renfasnpl, 1, 0));
      A8503Renfastpp = DecimalUtil.ZERO ;
      n8503Renfastpp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8503Renfastpp", GXutil.ltrimstr( A8503Renfastpp, 7, 2));
      A8504Renfasunpl = DecimalUtil.ZERO ;
      n8504Renfasunpl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8504Renfasunpl", GXutil.ltrimstr( A8504Renfasunpl, 7, 2));
      A8505Renuord = (short)(0) ;
      n8505Renuord = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8505Renuord", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8505Renuord), 4, 0));
      A8595RenHdrO = "" ;
      n8595RenHdrO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8595RenHdrO", A8595RenHdrO);
      A8939Renfaspri2 = (short)(0) ;
      n8939Renfaspri2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8939Renfaspri2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8939Renfaspri2), 3, 0));
      A9856RenObsF = "" ;
      n9856RenObsF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9856RenObsF", A9856RenObsF);
      A10130RenObsB = "" ;
      n10130RenObsB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10130RenObsB", A10130RenObsB);
      Z457FasCod = "" ;
      Z816RenFasEst = (byte)(0) ;
      Z818RenFecTeo = GXutil.nullDate() ;
      Z817RenFecRea = GXutil.nullDate() ;
      Z3297RenFecRIni = GXutil.nullDate() ;
      Z824RenTieTeo = DecimalUtil.ZERO ;
      Z825RenUni = DecimalUtil.ZERO ;
      Z821RenLoc = "" ;
      Z820RenHorIni = (short)(0) ;
      Z819RenHorFin = (short)(0) ;
      Z823RenTieRea = DecimalUtil.ZERO ;
      Z822RenMaqCod = "" ;
      Z815RenFasCon = "" ;
      Z814RenFacTin = "" ;
      Z4593RenOrdLin = (short)(0) ;
      Z4734RenFasPri = (byte)(0) ;
      Z4735RenFasKgm = DecimalUtil.ZERO ;
      Z4736RenFasMtr = DecimalUtil.ZERO ;
      Z4737RenFasBot = "" ;
      Z4738RenNumBot = 0 ;
      Z4739RenFasFor = "" ;
      Z4740RenFasPzas = 0 ;
      Z4741RenFasCop = "" ;
      Z4742RenBarUltL = 0 ;
      Z4743RenFasCara = "" ;
      Z4904RenFasAcab = "" ;
      Z5370RenFasGral = "" ;
      Z5897RenMaqPlan = "" ;
      Z5992RenFasKgT = DecimalUtil.ZERO ;
      Z5993RenFasMtT = DecimalUtil.ZERO ;
      Z6013RenFasTip = "" ;
      Z6172RenFasSec = "" ;
      Z6393RenFasMn = "" ;
      Z6394RenfasOP = (short)(0) ;
      Z6395RenHdMn = "" ;
      Z8472RenfasRb = DecimalUtil.ZERO ;
      Z8490Renfasinc = (byte)(0) ;
      Z8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
      Z8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
      Z8493Renfaskpr = DecimalUtil.ZERO ;
      Z8494RenfasPpr = (short)(0) ;
      Z8495Renfasagr = "" ;
      Z8496Renfasprp = "" ;
      Z8497Renfasfpl = GXutil.nullDate() ;
      Z8498Renfasusu = "" ;
      Z8499Renquiul = (short)(0) ;
      Z8500Renfascr = DecimalUtil.ZERO ;
      Z8501Rentieaut = (short)(0) ;
      Z8502Renfasnpl = (byte)(0) ;
      Z8503Renfastpp = DecimalUtil.ZERO ;
      Z8504Renfasunpl = DecimalUtil.ZERO ;
      Z8505Renuord = (short)(0) ;
      Z8595RenHdrO = "" ;
      Z8939Renfaspri2 = (short)(0) ;
      Z9856RenObsF = "" ;
      Z10130RenObsB = "" ;
   }

   public void initAll2B227( )
   {
      A1654RenTerCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1654RenTerCod", A1654RenTerCod);
      A308CodPro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A308CodPro", A308CodPro);
      A654OrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
      initializeNonKey2B227( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612518554218", true, true);
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
      httpContext.AddJavascriptSource("trenfas.js", "?202612518554218", false, true);
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
      edtRenTerCod_Internalname = "RENTERCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtCodPro_Internalname = "CODPRO" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtOrdLin_Internalname = "ORDLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRenFasEst_Internalname = "RENFASEST" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRenFecTeo_Internalname = "RENFECTEO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRenFecRea_Internalname = "RENFECREA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtRenFecRIni_Internalname = "RENFECRINI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtRenTieTeo_Internalname = "RENTIETEO" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtRenUni_Internalname = "RENUNI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtRenLoc_Internalname = "RENLOC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtRenHorIni_Internalname = "RENHORINI" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtRenHorFin_Internalname = "RENHORFIN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtRenTieRea_Internalname = "RENTIEREA" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtRenMaqCod_Internalname = "RENMAQCOD" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtRenFasCon_Internalname = "RENFASCON" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtRenFacTin_Internalname = "RENFACTIN" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtRenOrdLin_Internalname = "RENORDLIN" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtRenFasPri_Internalname = "RENFASPRI" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtRenFasKgm_Internalname = "RENFASKGM" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtRenFasMtr_Internalname = "RENFASMTR" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtRenFasBot_Internalname = "RENFASBOT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtRenNumBot_Internalname = "RENNUMBOT" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtRenFasFor_Internalname = "RENFASFOR" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtRenFasPzas_Internalname = "RENFASPZAS" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtRenFasCop_Internalname = "RENFASCOP" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtRenBarUltL_Internalname = "RENBARULTL" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtRenFasCara_Internalname = "RENFASCARA" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtRenFasAcab_Internalname = "RENFASACAB" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtRenFasGral_Internalname = "RENFASGRAL" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtRenMaqPlan_Internalname = "RENMAQPLAN" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtRenFasKgT_Internalname = "RENFASKGT" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtRenFasMtT_Internalname = "RENFASMTT" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtRenFasTip_Internalname = "RENFASTIP" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtRenFasSec_Internalname = "RENFASSEC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtRenFasMn_Internalname = "RENFASMN" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtRenfasOP_Internalname = "RENFASOP" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtRenHdMn_Internalname = "RENHDMN" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtRenfasRb_Internalname = "RENFASRB" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtRenfasinc_Internalname = "RENFASINC" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtRenfasdti_Internalname = "RENFASDTI" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtRenfasdtf_Internalname = "RENFASDTF" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtRenfaskpr_Internalname = "RENFASKPR" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtRenfasPpr_Internalname = "RENFASPPR" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtRenfasagr_Internalname = "RENFASAGR" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtRenfasprp_Internalname = "RENFASPRP" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtRenfasfpl_Internalname = "RENFASFPL" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtRenfasusu_Internalname = "RENFASUSU" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtRenquiul_Internalname = "RENQUIUL" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtRenfascr_Internalname = "RENFASCR" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtRentieaut_Internalname = "RENTIEAUT" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtRenfasnpl_Internalname = "RENFASNPL" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtRenfastpp_Internalname = "RENFASTPP" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtRenfasunpl_Internalname = "RENFASUNPL" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtRenuord_Internalname = "RENUORD" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtRenHdrO_Internalname = "RENHDRO" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtRenfaspri2_Internalname = "RENFASPRI2" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtRenObsF_Internalname = "RENOBSF" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtRenObsB_Internalname = "RENOBSB" ;
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
      Form.setCaption( httpContext.getMessage( "RENUMERACION DE FASES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRenObsB_Backcolor = (int)(0xFFFFFF) ;
      edtRenObsB_Enabled = 1 ;
      edtRenObsF_Backcolor = (int)(0xFFFFFF) ;
      edtRenObsF_Enabled = 1 ;
      edtRenfaspri2_Jsonclick = "" ;
      edtRenfaspri2_Backcolor = (int)(0xFFFFFF) ;
      edtRenfaspri2_Enabled = 1 ;
      edtRenHdrO_Jsonclick = "" ;
      edtRenHdrO_Backcolor = (int)(0xFFFFFF) ;
      edtRenHdrO_Enabled = 1 ;
      edtRenuord_Jsonclick = "" ;
      edtRenuord_Backcolor = (int)(0xFFFFFF) ;
      edtRenuord_Enabled = 1 ;
      edtRenfasunpl_Jsonclick = "" ;
      edtRenfasunpl_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasunpl_Enabled = 1 ;
      edtRenfastpp_Jsonclick = "" ;
      edtRenfastpp_Backcolor = (int)(0xFFFFFF) ;
      edtRenfastpp_Enabled = 1 ;
      edtRenfasnpl_Jsonclick = "" ;
      edtRenfasnpl_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasnpl_Enabled = 1 ;
      edtRentieaut_Jsonclick = "" ;
      edtRentieaut_Backcolor = (int)(0xFFFFFF) ;
      edtRentieaut_Enabled = 1 ;
      edtRenfascr_Jsonclick = "" ;
      edtRenfascr_Backcolor = (int)(0xFFFFFF) ;
      edtRenfascr_Enabled = 1 ;
      edtRenquiul_Jsonclick = "" ;
      edtRenquiul_Backcolor = (int)(0xFFFFFF) ;
      edtRenquiul_Enabled = 1 ;
      edtRenfasusu_Jsonclick = "" ;
      edtRenfasusu_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasusu_Enabled = 1 ;
      edtRenfasfpl_Jsonclick = "" ;
      edtRenfasfpl_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasfpl_Enabled = 1 ;
      edtRenfasprp_Jsonclick = "" ;
      edtRenfasprp_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasprp_Enabled = 1 ;
      edtRenfasagr_Jsonclick = "" ;
      edtRenfasagr_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasagr_Enabled = 1 ;
      edtRenfasPpr_Jsonclick = "" ;
      edtRenfasPpr_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasPpr_Enabled = 1 ;
      edtRenfaskpr_Jsonclick = "" ;
      edtRenfaskpr_Backcolor = (int)(0xFFFFFF) ;
      edtRenfaskpr_Enabled = 1 ;
      edtRenfasdtf_Jsonclick = "" ;
      edtRenfasdtf_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasdtf_Enabled = 1 ;
      edtRenfasdti_Jsonclick = "" ;
      edtRenfasdti_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasdti_Enabled = 1 ;
      edtRenfasinc_Jsonclick = "" ;
      edtRenfasinc_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasinc_Enabled = 1 ;
      edtRenfasRb_Jsonclick = "" ;
      edtRenfasRb_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasRb_Enabled = 1 ;
      edtRenHdMn_Jsonclick = "" ;
      edtRenHdMn_Backcolor = (int)(0xFFFFFF) ;
      edtRenHdMn_Enabled = 1 ;
      edtRenfasOP_Jsonclick = "" ;
      edtRenfasOP_Backcolor = (int)(0xFFFFFF) ;
      edtRenfasOP_Enabled = 1 ;
      edtRenFasMn_Jsonclick = "" ;
      edtRenFasMn_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasMn_Enabled = 1 ;
      edtRenFasSec_Jsonclick = "" ;
      edtRenFasSec_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasSec_Enabled = 1 ;
      edtRenFasTip_Jsonclick = "" ;
      edtRenFasTip_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasTip_Enabled = 1 ;
      edtRenFasMtT_Jsonclick = "" ;
      edtRenFasMtT_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasMtT_Enabled = 1 ;
      edtRenFasKgT_Jsonclick = "" ;
      edtRenFasKgT_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasKgT_Enabled = 1 ;
      edtRenMaqPlan_Jsonclick = "" ;
      edtRenMaqPlan_Backcolor = (int)(0xFFFFFF) ;
      edtRenMaqPlan_Enabled = 1 ;
      edtRenFasGral_Jsonclick = "" ;
      edtRenFasGral_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasGral_Enabled = 1 ;
      edtRenFasAcab_Jsonclick = "" ;
      edtRenFasAcab_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasAcab_Enabled = 1 ;
      edtRenFasCara_Jsonclick = "" ;
      edtRenFasCara_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasCara_Enabled = 1 ;
      edtRenBarUltL_Jsonclick = "" ;
      edtRenBarUltL_Backcolor = (int)(0xFFFFFF) ;
      edtRenBarUltL_Enabled = 1 ;
      edtRenFasCop_Jsonclick = "" ;
      edtRenFasCop_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasCop_Enabled = 1 ;
      edtRenFasPzas_Jsonclick = "" ;
      edtRenFasPzas_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasPzas_Enabled = 1 ;
      edtRenFasFor_Jsonclick = "" ;
      edtRenFasFor_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasFor_Enabled = 1 ;
      edtRenNumBot_Jsonclick = "" ;
      edtRenNumBot_Backcolor = (int)(0xFFFFFF) ;
      edtRenNumBot_Enabled = 1 ;
      edtRenFasBot_Jsonclick = "" ;
      edtRenFasBot_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasBot_Enabled = 1 ;
      edtRenFasMtr_Jsonclick = "" ;
      edtRenFasMtr_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasMtr_Enabled = 1 ;
      edtRenFasKgm_Jsonclick = "" ;
      edtRenFasKgm_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasKgm_Enabled = 1 ;
      edtRenFasPri_Jsonclick = "" ;
      edtRenFasPri_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasPri_Enabled = 1 ;
      edtRenOrdLin_Jsonclick = "" ;
      edtRenOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtRenOrdLin_Enabled = 1 ;
      edtRenFacTin_Jsonclick = "" ;
      edtRenFacTin_Backcolor = (int)(0xFFFFFF) ;
      edtRenFacTin_Enabled = 1 ;
      edtRenFasCon_Jsonclick = "" ;
      edtRenFasCon_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasCon_Enabled = 1 ;
      edtRenMaqCod_Jsonclick = "" ;
      edtRenMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtRenMaqCod_Enabled = 1 ;
      edtRenTieRea_Jsonclick = "" ;
      edtRenTieRea_Backcolor = (int)(0xFFFFFF) ;
      edtRenTieRea_Enabled = 1 ;
      edtRenHorFin_Jsonclick = "" ;
      edtRenHorFin_Backcolor = (int)(0xFFFFFF) ;
      edtRenHorFin_Enabled = 1 ;
      edtRenHorIni_Jsonclick = "" ;
      edtRenHorIni_Backcolor = (int)(0xFFFFFF) ;
      edtRenHorIni_Enabled = 1 ;
      edtRenLoc_Jsonclick = "" ;
      edtRenLoc_Backcolor = (int)(0xFFFFFF) ;
      edtRenLoc_Enabled = 1 ;
      edtRenUni_Jsonclick = "" ;
      edtRenUni_Backcolor = (int)(0xFFFFFF) ;
      edtRenUni_Enabled = 1 ;
      edtRenTieTeo_Jsonclick = "" ;
      edtRenTieTeo_Backcolor = (int)(0xFFFFFF) ;
      edtRenTieTeo_Enabled = 1 ;
      edtRenFecRIni_Jsonclick = "" ;
      edtRenFecRIni_Backcolor = (int)(0xFFFFFF) ;
      edtRenFecRIni_Enabled = 1 ;
      edtRenFecRea_Jsonclick = "" ;
      edtRenFecRea_Backcolor = (int)(0xFFFFFF) ;
      edtRenFecRea_Enabled = 1 ;
      edtRenFecTeo_Jsonclick = "" ;
      edtRenFecTeo_Backcolor = (int)(0xFFFFFF) ;
      edtRenFecTeo_Enabled = 1 ;
      edtRenFasEst_Jsonclick = "" ;
      edtRenFasEst_Backcolor = (int)(0xFFFFFF) ;
      edtRenFasEst_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOrdLin_Jsonclick = "" ;
      edtOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtOrdLin_Enabled = 1 ;
      edtCodPro_Jsonclick = "" ;
      edtCodPro_Backcolor = (int)(0xFFFFFF) ;
      edtCodPro_Enabled = 1 ;
      edtRenTerCod_Jsonclick = "" ;
      edtRenTerCod_Backcolor = (int)(0xFFFFFF) ;
      edtRenTerCod_Enabled = 1 ;
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
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Ordlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A816RenFasEst", GXutil.ltrim( localUtil.ntoc( A816RenFasEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A818RenFecTeo", localUtil.format(A818RenFecTeo, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A817RenFecRea", localUtil.format(A817RenFecRea, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3297RenFecRIni", localUtil.format(A3297RenFecRIni, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A824RenTieTeo", GXutil.ltrim( localUtil.ntoc( A824RenTieTeo, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A825RenUni", GXutil.ltrim( localUtil.ntoc( A825RenUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A821RenLoc", GXutil.rtrim( A821RenLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A820RenHorIni", GXutil.ltrim( localUtil.ntoc( A820RenHorIni, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A819RenHorFin", GXutil.ltrim( localUtil.ntoc( A819RenHorFin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A823RenTieRea", GXutil.ltrim( localUtil.ntoc( A823RenTieRea, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A822RenMaqCod", GXutil.rtrim( A822RenMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A815RenFasCon", GXutil.rtrim( A815RenFasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A814RenFacTin", GXutil.rtrim( A814RenFacTin));
      httpContext.ajax_rsp_assign_attri("", false, "A4593RenOrdLin", GXutil.ltrim( localUtil.ntoc( A4593RenOrdLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4734RenFasPri", GXutil.ltrim( localUtil.ntoc( A4734RenFasPri, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4735RenFasKgm", GXutil.ltrim( localUtil.ntoc( A4735RenFasKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4736RenFasMtr", GXutil.ltrim( localUtil.ntoc( A4736RenFasMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4737RenFasBot", GXutil.rtrim( A4737RenFasBot));
      httpContext.ajax_rsp_assign_attri("", false, "A4738RenNumBot", GXutil.ltrim( localUtil.ntoc( A4738RenNumBot, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4739RenFasFor", GXutil.rtrim( A4739RenFasFor));
      httpContext.ajax_rsp_assign_attri("", false, "A4740RenFasPzas", GXutil.ltrim( localUtil.ntoc( A4740RenFasPzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4741RenFasCop", GXutil.rtrim( A4741RenFasCop));
      httpContext.ajax_rsp_assign_attri("", false, "A4742RenBarUltL", GXutil.ltrim( localUtil.ntoc( A4742RenBarUltL, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4743RenFasCara", GXutil.rtrim( A4743RenFasCara));
      httpContext.ajax_rsp_assign_attri("", false, "A4904RenFasAcab", GXutil.rtrim( A4904RenFasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A5370RenFasGral", GXutil.rtrim( A5370RenFasGral));
      httpContext.ajax_rsp_assign_attri("", false, "A5897RenMaqPlan", GXutil.rtrim( A5897RenMaqPlan));
      httpContext.ajax_rsp_assign_attri("", false, "A5992RenFasKgT", GXutil.ltrim( localUtil.ntoc( A5992RenFasKgT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5993RenFasMtT", GXutil.ltrim( localUtil.ntoc( A5993RenFasMtT, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6013RenFasTip", GXutil.rtrim( A6013RenFasTip));
      httpContext.ajax_rsp_assign_attri("", false, "A6172RenFasSec", GXutil.rtrim( A6172RenFasSec));
      httpContext.ajax_rsp_assign_attri("", false, "A6393RenFasMn", GXutil.rtrim( A6393RenFasMn));
      httpContext.ajax_rsp_assign_attri("", false, "A6394RenfasOP", GXutil.ltrim( localUtil.ntoc( A6394RenfasOP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6395RenHdMn", GXutil.rtrim( A6395RenHdMn));
      httpContext.ajax_rsp_assign_attri("", false, "A8472RenfasRb", GXutil.ltrim( localUtil.ntoc( A8472RenfasRb, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8490Renfasinc", GXutil.ltrim( localUtil.ntoc( A8490Renfasinc, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8491Renfasdti", localUtil.ttoc( A8491Renfasdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8492Renfasdtf", localUtil.ttoc( A8492Renfasdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8493Renfaskpr", GXutil.ltrim( localUtil.ntoc( A8493Renfaskpr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8494RenfasPpr", GXutil.ltrim( localUtil.ntoc( A8494RenfasPpr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8495Renfasagr", GXutil.rtrim( A8495Renfasagr));
      httpContext.ajax_rsp_assign_attri("", false, "A8496Renfasprp", GXutil.rtrim( A8496Renfasprp));
      httpContext.ajax_rsp_assign_attri("", false, "A8497Renfasfpl", localUtil.format(A8497Renfasfpl, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8498Renfasusu", GXutil.rtrim( A8498Renfasusu));
      httpContext.ajax_rsp_assign_attri("", false, "A8499Renquiul", GXutil.ltrim( localUtil.ntoc( A8499Renquiul, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8500Renfascr", GXutil.ltrim( localUtil.ntoc( A8500Renfascr, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8501Rentieaut", GXutil.ltrim( localUtil.ntoc( A8501Rentieaut, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8502Renfasnpl", GXutil.ltrim( localUtil.ntoc( A8502Renfasnpl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8503Renfastpp", GXutil.ltrim( localUtil.ntoc( A8503Renfastpp, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8504Renfasunpl", GXutil.ltrim( localUtil.ntoc( A8504Renfasunpl, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8505Renuord", GXutil.ltrim( localUtil.ntoc( A8505Renuord, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8595RenHdrO", GXutil.rtrim( A8595RenHdrO));
      httpContext.ajax_rsp_assign_attri("", false, "A8939Renfaspri2", GXutil.ltrim( localUtil.ntoc( A8939Renfaspri2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9856RenObsF", A9856RenObsF);
      httpContext.ajax_rsp_assign_attri("", false, "A10130RenObsB", A10130RenObsB);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1654RenTerCod", GXutil.rtrim( Z1654RenTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z308CodPro", GXutil.rtrim( Z308CodPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z654OrdLin", GXutil.ltrim( localUtil.ntoc( Z654OrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z816RenFasEst", GXutil.ltrim( localUtil.ntoc( Z816RenFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z818RenFecTeo", localUtil.format(Z818RenFecTeo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z817RenFecRea", localUtil.format(Z817RenFecRea, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3297RenFecRIni", localUtil.format(Z3297RenFecRIni, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z824RenTieTeo", GXutil.ltrim( localUtil.ntoc( Z824RenTieTeo, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z825RenUni", GXutil.ltrim( localUtil.ntoc( Z825RenUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z821RenLoc", GXutil.rtrim( Z821RenLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z820RenHorIni", GXutil.ltrim( localUtil.ntoc( Z820RenHorIni, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z819RenHorFin", GXutil.ltrim( localUtil.ntoc( Z819RenHorFin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z823RenTieRea", GXutil.ltrim( localUtil.ntoc( Z823RenTieRea, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z822RenMaqCod", GXutil.rtrim( Z822RenMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z815RenFasCon", GXutil.rtrim( Z815RenFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z814RenFacTin", GXutil.rtrim( Z814RenFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4593RenOrdLin", GXutil.ltrim( localUtil.ntoc( Z4593RenOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4734RenFasPri", GXutil.ltrim( localUtil.ntoc( Z4734RenFasPri, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4735RenFasKgm", GXutil.ltrim( localUtil.ntoc( Z4735RenFasKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4736RenFasMtr", GXutil.ltrim( localUtil.ntoc( Z4736RenFasMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4737RenFasBot", GXutil.rtrim( Z4737RenFasBot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4738RenNumBot", GXutil.ltrim( localUtil.ntoc( Z4738RenNumBot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4739RenFasFor", GXutil.rtrim( Z4739RenFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4740RenFasPzas", GXutil.ltrim( localUtil.ntoc( Z4740RenFasPzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4741RenFasCop", GXutil.rtrim( Z4741RenFasCop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4742RenBarUltL", GXutil.ltrim( localUtil.ntoc( Z4742RenBarUltL, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4743RenFasCara", GXutil.rtrim( Z4743RenFasCara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4904RenFasAcab", GXutil.rtrim( Z4904RenFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5370RenFasGral", GXutil.rtrim( Z5370RenFasGral));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5897RenMaqPlan", GXutil.rtrim( Z5897RenMaqPlan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5992RenFasKgT", GXutil.ltrim( localUtil.ntoc( Z5992RenFasKgT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5993RenFasMtT", GXutil.ltrim( localUtil.ntoc( Z5993RenFasMtT, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6013RenFasTip", GXutil.rtrim( Z6013RenFasTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6172RenFasSec", GXutil.rtrim( Z6172RenFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6393RenFasMn", GXutil.rtrim( Z6393RenFasMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6394RenfasOP", GXutil.ltrim( localUtil.ntoc( Z6394RenfasOP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6395RenHdMn", GXutil.rtrim( Z6395RenHdMn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8472RenfasRb", GXutil.ltrim( localUtil.ntoc( Z8472RenfasRb, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8490Renfasinc", GXutil.ltrim( localUtil.ntoc( Z8490Renfasinc, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8491Renfasdti", localUtil.ttoc( Z8491Renfasdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8492Renfasdtf", localUtil.ttoc( Z8492Renfasdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8493Renfaskpr", GXutil.ltrim( localUtil.ntoc( Z8493Renfaskpr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8494RenfasPpr", GXutil.ltrim( localUtil.ntoc( Z8494RenfasPpr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8495Renfasagr", GXutil.rtrim( Z8495Renfasagr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8496Renfasprp", GXutil.rtrim( Z8496Renfasprp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8497Renfasfpl", localUtil.format(Z8497Renfasfpl, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8498Renfasusu", GXutil.rtrim( Z8498Renfasusu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8499Renquiul", GXutil.ltrim( localUtil.ntoc( Z8499Renquiul, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8500Renfascr", GXutil.ltrim( localUtil.ntoc( Z8500Renfascr, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8501Rentieaut", GXutil.ltrim( localUtil.ntoc( Z8501Rentieaut, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8502Renfasnpl", GXutil.ltrim( localUtil.ntoc( Z8502Renfasnpl, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8503Renfastpp", GXutil.ltrim( localUtil.ntoc( Z8503Renfastpp, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8504Renfasunpl", GXutil.ltrim( localUtil.ntoc( Z8504Renfasunpl, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8505Renuord", GXutil.ltrim( localUtil.ntoc( Z8505Renuord, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8595RenHdrO", GXutil.rtrim( Z8595RenHdrO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8939Renfaspri2", GXutil.ltrim( localUtil.ntoc( Z8939Renfaspri2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9856RenObsF", Z9856RenObsF);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10130RenObsB", Z10130RenObsB);
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
      setEventMetadata("VALID_RENTERCOD","{handler:'valid_Rentercod',iparms:[]");
      setEventMetadata("VALID_RENTERCOD",",oparms:[]}");
      setEventMetadata("VALID_CODPRO","{handler:'valid_Codpro',iparms:[]");
      setEventMetadata("VALID_CODPRO",",oparms:[]}");
      setEventMetadata("VALID_ORDLIN","{handler:'valid_Ordlin',iparms:[{av:'A1654RenTerCod',fld:'RENTERCOD',pic:''},{av:'A308CodPro',fld:'CODPRO',pic:''},{av:'A654OrdLin',fld:'ORDLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ORDLIN",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A816RenFasEst',fld:'RENFASEST',pic:'9'},{av:'A818RenFecTeo',fld:'RENFECTEO',pic:''},{av:'A817RenFecRea',fld:'RENFECREA',pic:''},{av:'A3297RenFecRIni',fld:'RENFECRINI',pic:''},{av:'A824RenTieTeo',fld:'RENTIETEO',pic:'Z9.99'},{av:'A825RenUni',fld:'RENUNI',pic:'ZZZZZ9.99'},{av:'A821RenLoc',fld:'RENLOC',pic:''},{av:'A820RenHorIni',fld:'RENHORINI',pic:'ZZZ9'},{av:'A819RenHorFin',fld:'RENHORFIN',pic:'ZZZ9'},{av:'A823RenTieRea',fld:'RENTIEREA',pic:'Z9.99'},{av:'A822RenMaqCod',fld:'RENMAQCOD',pic:''},{av:'A815RenFasCon',fld:'RENFASCON',pic:'@!'},{av:'A814RenFacTin',fld:'RENFACTIN',pic:'@!'},{av:'A4593RenOrdLin',fld:'RENORDLIN',pic:'ZZZ9'},{av:'A4734RenFasPri',fld:'RENFASPRI',pic:'Z9'},{av:'A4735RenFasKgm',fld:'RENFASKGM',pic:'ZZZZZ9.99'},{av:'A4736RenFasMtr',fld:'RENFASMTR',pic:'ZZZZZ9.99'},{av:'A4737RenFasBot',fld:'RENFASBOT',pic:''},{av:'A4738RenNumBot',fld:'RENNUMBOT',pic:'ZZZZZ9'},{av:'A4739RenFasFor',fld:'RENFASFOR',pic:''},{av:'A4740RenFasPzas',fld:'RENFASPZAS',pic:'ZZZZZ9'},{av:'A4741RenFasCop',fld:'RENFASCOP',pic:''},{av:'A4742RenBarUltL',fld:'RENBARULTL',pic:'ZZZZZ9'},{av:'A4743RenFasCara',fld:'RENFASCARA',pic:''},{av:'A4904RenFasAcab',fld:'RENFASACAB',pic:'@!'},{av:'A5370RenFasGral',fld:'RENFASGRAL',pic:''},{av:'A5897RenMaqPlan',fld:'RENMAQPLAN',pic:''},{av:'A5992RenFasKgT',fld:'RENFASKGT',pic:'ZZZZZ9.99'},{av:'A5993RenFasMtT',fld:'RENFASMTT',pic:'ZZZZZ9.99'},{av:'A6013RenFasTip',fld:'RENFASTIP',pic:''},{av:'A6172RenFasSec',fld:'RENFASSEC',pic:''},{av:'A6393RenFasMn',fld:'RENFASMN',pic:''},{av:'A6394RenfasOP',fld:'RENFASOP',pic:'ZZZ9'},{av:'A6395RenHdMn',fld:'RENHDMN',pic:''},{av:'A8472RenfasRb',fld:'RENFASRB',pic:'ZZZ9.99'},{av:'A8490Renfasinc',fld:'RENFASINC',pic:'9'},{av:'A8491Renfasdti',fld:'RENFASDTI',pic:'99/99/99 99:99:99'},{av:'A8492Renfasdtf',fld:'RENFASDTF',pic:'99/99/99 99:99:99'},{av:'A8493Renfaskpr',fld:'RENFASKPR',pic:'ZZZZZ9.99'},{av:'A8494RenfasPpr',fld:'RENFASPPR',pic:'ZZZ9'},{av:'A8495Renfasagr',fld:'RENFASAGR',pic:''},{av:'A8496Renfasprp',fld:'RENFASPRP',pic:''},{av:'A8497Renfasfpl',fld:'RENFASFPL',pic:''},{av:'A8498Renfasusu',fld:'RENFASUSU',pic:'@!'},{av:'A8499Renquiul',fld:'RENQUIUL',pic:'ZZZ9'},{av:'A8500Renfascr',fld:'RENFASCR',pic:'ZZZZ9.99999'},{av:'A8501Rentieaut',fld:'RENTIEAUT',pic:'ZZZ9'},{av:'A8502Renfasnpl',fld:'RENFASNPL',pic:'9'},{av:'A8503Renfastpp',fld:'RENFASTPP',pic:'ZZZ9.99'},{av:'A8504Renfasunpl',fld:'RENFASUNPL',pic:'ZZZ9.99'},{av:'A8505Renuord',fld:'RENUORD',pic:'ZZZ9'},{av:'A8595RenHdrO',fld:'RENHDRO',pic:''},{av:'A8939Renfaspri2',fld:'RENFASPRI2',pic:'ZZ9'},{av:'A9856RenObsF',fld:'RENOBSF',pic:''},{av:'A10130RenObsB',fld:'RENOBSB',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z1654RenTerCod'},{av:'Z308CodPro'},{av:'Z654OrdLin'},{av:'Z457FasCod'},{av:'Z816RenFasEst'},{av:'Z818RenFecTeo'},{av:'Z817RenFecRea'},{av:'Z3297RenFecRIni'},{av:'Z824RenTieTeo'},{av:'Z825RenUni'},{av:'Z821RenLoc'},{av:'Z820RenHorIni'},{av:'Z819RenHorFin'},{av:'Z823RenTieRea'},{av:'Z822RenMaqCod'},{av:'Z815RenFasCon'},{av:'Z814RenFacTin'},{av:'Z4593RenOrdLin'},{av:'Z4734RenFasPri'},{av:'Z4735RenFasKgm'},{av:'Z4736RenFasMtr'},{av:'Z4737RenFasBot'},{av:'Z4738RenNumBot'},{av:'Z4739RenFasFor'},{av:'Z4740RenFasPzas'},{av:'Z4741RenFasCop'},{av:'Z4742RenBarUltL'},{av:'Z4743RenFasCara'},{av:'Z4904RenFasAcab'},{av:'Z5370RenFasGral'},{av:'Z5897RenMaqPlan'},{av:'Z5992RenFasKgT'},{av:'Z5993RenFasMtT'},{av:'Z6013RenFasTip'},{av:'Z6172RenFasSec'},{av:'Z6393RenFasMn'},{av:'Z6394RenfasOP'},{av:'Z6395RenHdMn'},{av:'Z8472RenfasRb'},{av:'Z8490Renfasinc'},{av:'Z8491Renfasdti'},{av:'Z8492Renfasdtf'},{av:'Z8493Renfaskpr'},{av:'Z8494RenfasPpr'},{av:'Z8495Renfasagr'},{av:'Z8496Renfasprp'},{av:'Z8497Renfasfpl'},{av:'Z8498Renfasusu'},{av:'Z8499Renquiul'},{av:'Z8500Renfascr'},{av:'Z8501Rentieaut'},{av:'Z8502Renfasnpl'},{av:'Z8503Renfastpp'},{av:'Z8504Renfasunpl'},{av:'Z8505Renuord'},{av:'Z8595RenHdrO'},{av:'Z8939Renfaspri2'},{av:'Z9856RenObsF'},{av:'Z10130RenObsB'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RENFASEST","{handler:'valid_Renfasest',iparms:[]");
      setEventMetadata("VALID_RENFASEST",",oparms:[]}");
      setEventMetadata("VALID_RENFASCON","{handler:'valid_Renfascon',iparms:[]");
      setEventMetadata("VALID_RENFASCON",",oparms:[]}");
      setEventMetadata("VALID_RENFACTIN","{handler:'valid_Renfactin',iparms:[]");
      setEventMetadata("VALID_RENFACTIN",",oparms:[]}");
      setEventMetadata("VALID_RENFASACAB","{handler:'valid_Renfasacab',iparms:[]");
      setEventMetadata("VALID_RENFASACAB",",oparms:[]}");
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
      Z1654RenTerCod = "" ;
      Z308CodPro = "" ;
      Z457FasCod = "" ;
      Z818RenFecTeo = GXutil.nullDate() ;
      Z817RenFecRea = GXutil.nullDate() ;
      Z3297RenFecRIni = GXutil.nullDate() ;
      Z824RenTieTeo = DecimalUtil.ZERO ;
      Z825RenUni = DecimalUtil.ZERO ;
      Z821RenLoc = "" ;
      Z823RenTieRea = DecimalUtil.ZERO ;
      Z822RenMaqCod = "" ;
      Z815RenFasCon = "" ;
      Z814RenFacTin = "" ;
      Z4735RenFasKgm = DecimalUtil.ZERO ;
      Z4736RenFasMtr = DecimalUtil.ZERO ;
      Z4737RenFasBot = "" ;
      Z4739RenFasFor = "" ;
      Z4741RenFasCop = "" ;
      Z4743RenFasCara = "" ;
      Z4904RenFasAcab = "" ;
      Z5370RenFasGral = "" ;
      Z5897RenMaqPlan = "" ;
      Z5992RenFasKgT = DecimalUtil.ZERO ;
      Z5993RenFasMtT = DecimalUtil.ZERO ;
      Z6013RenFasTip = "" ;
      Z6172RenFasSec = "" ;
      Z6393RenFasMn = "" ;
      Z6395RenHdMn = "" ;
      Z8472RenfasRb = DecimalUtil.ZERO ;
      Z8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
      Z8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
      Z8493Renfaskpr = DecimalUtil.ZERO ;
      Z8495Renfasagr = "" ;
      Z8496Renfasprp = "" ;
      Z8497Renfasfpl = GXutil.nullDate() ;
      Z8498Renfasusu = "" ;
      Z8500Renfascr = DecimalUtil.ZERO ;
      Z8503Renfastpp = DecimalUtil.ZERO ;
      Z8504Renfasunpl = DecimalUtil.ZERO ;
      Z8595RenHdrO = "" ;
      Z9856RenObsF = "" ;
      Z10130RenObsB = "" ;
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
      A1654RenTerCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A308CodPro = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A457FasCod = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A818RenFecTeo = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      A817RenFecRea = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A3297RenFecRIni = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A824RenTieTeo = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A825RenUni = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A821RenLoc = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A823RenTieRea = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A822RenMaqCod = "" ;
      lblTextblock16_Jsonclick = "" ;
      A815RenFasCon = "" ;
      lblTextblock17_Jsonclick = "" ;
      A814RenFacTin = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A4735RenFasKgm = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A4736RenFasMtr = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A4737RenFasBot = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A4739RenFasFor = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A4741RenFasCop = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      A4743RenFasCara = "" ;
      lblTextblock29_Jsonclick = "" ;
      A4904RenFasAcab = "" ;
      lblTextblock30_Jsonclick = "" ;
      A5370RenFasGral = "" ;
      lblTextblock31_Jsonclick = "" ;
      A5897RenMaqPlan = "" ;
      lblTextblock32_Jsonclick = "" ;
      A5992RenFasKgT = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A5993RenFasMtT = DecimalUtil.ZERO ;
      lblTextblock34_Jsonclick = "" ;
      A6013RenFasTip = "" ;
      lblTextblock35_Jsonclick = "" ;
      A6172RenFasSec = "" ;
      lblTextblock36_Jsonclick = "" ;
      A6393RenFasMn = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      A6395RenHdMn = "" ;
      lblTextblock39_Jsonclick = "" ;
      A8472RenfasRb = DecimalUtil.ZERO ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      A8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock42_Jsonclick = "" ;
      A8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock43_Jsonclick = "" ;
      A8493Renfaskpr = DecimalUtil.ZERO ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A8495Renfasagr = "" ;
      lblTextblock46_Jsonclick = "" ;
      A8496Renfasprp = "" ;
      lblTextblock47_Jsonclick = "" ;
      A8497Renfasfpl = GXutil.nullDate() ;
      lblTextblock48_Jsonclick = "" ;
      A8498Renfasusu = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      A8500Renfascr = DecimalUtil.ZERO ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      A8503Renfastpp = DecimalUtil.ZERO ;
      lblTextblock54_Jsonclick = "" ;
      A8504Renfasunpl = DecimalUtil.ZERO ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      A8595RenHdrO = "" ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      A9856RenObsF = "" ;
      lblTextblock59_Jsonclick = "" ;
      A10130RenObsB = "" ;
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
      T002B4_A1654RenTerCod = new String[] {""} ;
      T002B4_A308CodPro = new String[] {""} ;
      T002B4_A654OrdLin = new short[1] ;
      T002B4_A457FasCod = new String[] {""} ;
      T002B4_n457FasCod = new boolean[] {false} ;
      T002B4_A816RenFasEst = new byte[1] ;
      T002B4_n816RenFasEst = new boolean[] {false} ;
      T002B4_A818RenFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T002B4_n818RenFecTeo = new boolean[] {false} ;
      T002B4_A817RenFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T002B4_n817RenFecRea = new boolean[] {false} ;
      T002B4_A3297RenFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T002B4_n3297RenFecRIni = new boolean[] {false} ;
      T002B4_A824RenTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n824RenTieTeo = new boolean[] {false} ;
      T002B4_A825RenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n825RenUni = new boolean[] {false} ;
      T002B4_A821RenLoc = new String[] {""} ;
      T002B4_n821RenLoc = new boolean[] {false} ;
      T002B4_A820RenHorIni = new short[1] ;
      T002B4_n820RenHorIni = new boolean[] {false} ;
      T002B4_A819RenHorFin = new short[1] ;
      T002B4_n819RenHorFin = new boolean[] {false} ;
      T002B4_A823RenTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n823RenTieRea = new boolean[] {false} ;
      T002B4_A822RenMaqCod = new String[] {""} ;
      T002B4_n822RenMaqCod = new boolean[] {false} ;
      T002B4_A815RenFasCon = new String[] {""} ;
      T002B4_n815RenFasCon = new boolean[] {false} ;
      T002B4_A814RenFacTin = new String[] {""} ;
      T002B4_n814RenFacTin = new boolean[] {false} ;
      T002B4_A4593RenOrdLin = new short[1] ;
      T002B4_n4593RenOrdLin = new boolean[] {false} ;
      T002B4_A4734RenFasPri = new byte[1] ;
      T002B4_n4734RenFasPri = new boolean[] {false} ;
      T002B4_A4735RenFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n4735RenFasKgm = new boolean[] {false} ;
      T002B4_A4736RenFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n4736RenFasMtr = new boolean[] {false} ;
      T002B4_A4737RenFasBot = new String[] {""} ;
      T002B4_n4737RenFasBot = new boolean[] {false} ;
      T002B4_A4738RenNumBot = new int[1] ;
      T002B4_n4738RenNumBot = new boolean[] {false} ;
      T002B4_A4739RenFasFor = new String[] {""} ;
      T002B4_n4739RenFasFor = new boolean[] {false} ;
      T002B4_A4740RenFasPzas = new int[1] ;
      T002B4_n4740RenFasPzas = new boolean[] {false} ;
      T002B4_A4741RenFasCop = new String[] {""} ;
      T002B4_n4741RenFasCop = new boolean[] {false} ;
      T002B4_A4742RenBarUltL = new int[1] ;
      T002B4_n4742RenBarUltL = new boolean[] {false} ;
      T002B4_A4743RenFasCara = new String[] {""} ;
      T002B4_n4743RenFasCara = new boolean[] {false} ;
      T002B4_A4904RenFasAcab = new String[] {""} ;
      T002B4_n4904RenFasAcab = new boolean[] {false} ;
      T002B4_A5370RenFasGral = new String[] {""} ;
      T002B4_n5370RenFasGral = new boolean[] {false} ;
      T002B4_A5897RenMaqPlan = new String[] {""} ;
      T002B4_n5897RenMaqPlan = new boolean[] {false} ;
      T002B4_A5992RenFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n5992RenFasKgT = new boolean[] {false} ;
      T002B4_A5993RenFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n5993RenFasMtT = new boolean[] {false} ;
      T002B4_A6013RenFasTip = new String[] {""} ;
      T002B4_n6013RenFasTip = new boolean[] {false} ;
      T002B4_A6172RenFasSec = new String[] {""} ;
      T002B4_n6172RenFasSec = new boolean[] {false} ;
      T002B4_A6393RenFasMn = new String[] {""} ;
      T002B4_n6393RenFasMn = new boolean[] {false} ;
      T002B4_A6394RenfasOP = new short[1] ;
      T002B4_n6394RenfasOP = new boolean[] {false} ;
      T002B4_A6395RenHdMn = new String[] {""} ;
      T002B4_n6395RenHdMn = new boolean[] {false} ;
      T002B4_A8472RenfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n8472RenfasRb = new boolean[] {false} ;
      T002B4_A8490Renfasinc = new byte[1] ;
      T002B4_n8490Renfasinc = new boolean[] {false} ;
      T002B4_A8491Renfasdti = new java.util.Date[] {GXutil.nullDate()} ;
      T002B4_n8491Renfasdti = new boolean[] {false} ;
      T002B4_A8492Renfasdtf = new java.util.Date[] {GXutil.nullDate()} ;
      T002B4_n8492Renfasdtf = new boolean[] {false} ;
      T002B4_A8493Renfaskpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n8493Renfaskpr = new boolean[] {false} ;
      T002B4_A8494RenfasPpr = new short[1] ;
      T002B4_n8494RenfasPpr = new boolean[] {false} ;
      T002B4_A8495Renfasagr = new String[] {""} ;
      T002B4_n8495Renfasagr = new boolean[] {false} ;
      T002B4_A8496Renfasprp = new String[] {""} ;
      T002B4_n8496Renfasprp = new boolean[] {false} ;
      T002B4_A8497Renfasfpl = new java.util.Date[] {GXutil.nullDate()} ;
      T002B4_n8497Renfasfpl = new boolean[] {false} ;
      T002B4_A8498Renfasusu = new String[] {""} ;
      T002B4_n8498Renfasusu = new boolean[] {false} ;
      T002B4_A8499Renquiul = new short[1] ;
      T002B4_n8499Renquiul = new boolean[] {false} ;
      T002B4_A8500Renfascr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n8500Renfascr = new boolean[] {false} ;
      T002B4_A8501Rentieaut = new short[1] ;
      T002B4_n8501Rentieaut = new boolean[] {false} ;
      T002B4_A8502Renfasnpl = new byte[1] ;
      T002B4_n8502Renfasnpl = new boolean[] {false} ;
      T002B4_A8503Renfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n8503Renfastpp = new boolean[] {false} ;
      T002B4_A8504Renfasunpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B4_n8504Renfasunpl = new boolean[] {false} ;
      T002B4_A8505Renuord = new short[1] ;
      T002B4_n8505Renuord = new boolean[] {false} ;
      T002B4_A8595RenHdrO = new String[] {""} ;
      T002B4_n8595RenHdrO = new boolean[] {false} ;
      T002B4_A8939Renfaspri2 = new short[1] ;
      T002B4_n8939Renfaspri2 = new boolean[] {false} ;
      T002B4_A9856RenObsF = new String[] {""} ;
      T002B4_n9856RenObsF = new boolean[] {false} ;
      T002B4_A10130RenObsB = new String[] {""} ;
      T002B4_n10130RenObsB = new boolean[] {false} ;
      T002B5_A1654RenTerCod = new String[] {""} ;
      T002B5_A308CodPro = new String[] {""} ;
      T002B5_A654OrdLin = new short[1] ;
      T002B3_A1654RenTerCod = new String[] {""} ;
      T002B3_A308CodPro = new String[] {""} ;
      T002B3_A654OrdLin = new short[1] ;
      T002B3_A457FasCod = new String[] {""} ;
      T002B3_n457FasCod = new boolean[] {false} ;
      T002B3_A816RenFasEst = new byte[1] ;
      T002B3_n816RenFasEst = new boolean[] {false} ;
      T002B3_A818RenFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T002B3_n818RenFecTeo = new boolean[] {false} ;
      T002B3_A817RenFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T002B3_n817RenFecRea = new boolean[] {false} ;
      T002B3_A3297RenFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T002B3_n3297RenFecRIni = new boolean[] {false} ;
      T002B3_A824RenTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n824RenTieTeo = new boolean[] {false} ;
      T002B3_A825RenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n825RenUni = new boolean[] {false} ;
      T002B3_A821RenLoc = new String[] {""} ;
      T002B3_n821RenLoc = new boolean[] {false} ;
      T002B3_A820RenHorIni = new short[1] ;
      T002B3_n820RenHorIni = new boolean[] {false} ;
      T002B3_A819RenHorFin = new short[1] ;
      T002B3_n819RenHorFin = new boolean[] {false} ;
      T002B3_A823RenTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n823RenTieRea = new boolean[] {false} ;
      T002B3_A822RenMaqCod = new String[] {""} ;
      T002B3_n822RenMaqCod = new boolean[] {false} ;
      T002B3_A815RenFasCon = new String[] {""} ;
      T002B3_n815RenFasCon = new boolean[] {false} ;
      T002B3_A814RenFacTin = new String[] {""} ;
      T002B3_n814RenFacTin = new boolean[] {false} ;
      T002B3_A4593RenOrdLin = new short[1] ;
      T002B3_n4593RenOrdLin = new boolean[] {false} ;
      T002B3_A4734RenFasPri = new byte[1] ;
      T002B3_n4734RenFasPri = new boolean[] {false} ;
      T002B3_A4735RenFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n4735RenFasKgm = new boolean[] {false} ;
      T002B3_A4736RenFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n4736RenFasMtr = new boolean[] {false} ;
      T002B3_A4737RenFasBot = new String[] {""} ;
      T002B3_n4737RenFasBot = new boolean[] {false} ;
      T002B3_A4738RenNumBot = new int[1] ;
      T002B3_n4738RenNumBot = new boolean[] {false} ;
      T002B3_A4739RenFasFor = new String[] {""} ;
      T002B3_n4739RenFasFor = new boolean[] {false} ;
      T002B3_A4740RenFasPzas = new int[1] ;
      T002B3_n4740RenFasPzas = new boolean[] {false} ;
      T002B3_A4741RenFasCop = new String[] {""} ;
      T002B3_n4741RenFasCop = new boolean[] {false} ;
      T002B3_A4742RenBarUltL = new int[1] ;
      T002B3_n4742RenBarUltL = new boolean[] {false} ;
      T002B3_A4743RenFasCara = new String[] {""} ;
      T002B3_n4743RenFasCara = new boolean[] {false} ;
      T002B3_A4904RenFasAcab = new String[] {""} ;
      T002B3_n4904RenFasAcab = new boolean[] {false} ;
      T002B3_A5370RenFasGral = new String[] {""} ;
      T002B3_n5370RenFasGral = new boolean[] {false} ;
      T002B3_A5897RenMaqPlan = new String[] {""} ;
      T002B3_n5897RenMaqPlan = new boolean[] {false} ;
      T002B3_A5992RenFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n5992RenFasKgT = new boolean[] {false} ;
      T002B3_A5993RenFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n5993RenFasMtT = new boolean[] {false} ;
      T002B3_A6013RenFasTip = new String[] {""} ;
      T002B3_n6013RenFasTip = new boolean[] {false} ;
      T002B3_A6172RenFasSec = new String[] {""} ;
      T002B3_n6172RenFasSec = new boolean[] {false} ;
      T002B3_A6393RenFasMn = new String[] {""} ;
      T002B3_n6393RenFasMn = new boolean[] {false} ;
      T002B3_A6394RenfasOP = new short[1] ;
      T002B3_n6394RenfasOP = new boolean[] {false} ;
      T002B3_A6395RenHdMn = new String[] {""} ;
      T002B3_n6395RenHdMn = new boolean[] {false} ;
      T002B3_A8472RenfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n8472RenfasRb = new boolean[] {false} ;
      T002B3_A8490Renfasinc = new byte[1] ;
      T002B3_n8490Renfasinc = new boolean[] {false} ;
      T002B3_A8491Renfasdti = new java.util.Date[] {GXutil.nullDate()} ;
      T002B3_n8491Renfasdti = new boolean[] {false} ;
      T002B3_A8492Renfasdtf = new java.util.Date[] {GXutil.nullDate()} ;
      T002B3_n8492Renfasdtf = new boolean[] {false} ;
      T002B3_A8493Renfaskpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n8493Renfaskpr = new boolean[] {false} ;
      T002B3_A8494RenfasPpr = new short[1] ;
      T002B3_n8494RenfasPpr = new boolean[] {false} ;
      T002B3_A8495Renfasagr = new String[] {""} ;
      T002B3_n8495Renfasagr = new boolean[] {false} ;
      T002B3_A8496Renfasprp = new String[] {""} ;
      T002B3_n8496Renfasprp = new boolean[] {false} ;
      T002B3_A8497Renfasfpl = new java.util.Date[] {GXutil.nullDate()} ;
      T002B3_n8497Renfasfpl = new boolean[] {false} ;
      T002B3_A8498Renfasusu = new String[] {""} ;
      T002B3_n8498Renfasusu = new boolean[] {false} ;
      T002B3_A8499Renquiul = new short[1] ;
      T002B3_n8499Renquiul = new boolean[] {false} ;
      T002B3_A8500Renfascr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n8500Renfascr = new boolean[] {false} ;
      T002B3_A8501Rentieaut = new short[1] ;
      T002B3_n8501Rentieaut = new boolean[] {false} ;
      T002B3_A8502Renfasnpl = new byte[1] ;
      T002B3_n8502Renfasnpl = new boolean[] {false} ;
      T002B3_A8503Renfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n8503Renfastpp = new boolean[] {false} ;
      T002B3_A8504Renfasunpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B3_n8504Renfasunpl = new boolean[] {false} ;
      T002B3_A8505Renuord = new short[1] ;
      T002B3_n8505Renuord = new boolean[] {false} ;
      T002B3_A8595RenHdrO = new String[] {""} ;
      T002B3_n8595RenHdrO = new boolean[] {false} ;
      T002B3_A8939Renfaspri2 = new short[1] ;
      T002B3_n8939Renfaspri2 = new boolean[] {false} ;
      T002B3_A9856RenObsF = new String[] {""} ;
      T002B3_n9856RenObsF = new boolean[] {false} ;
      T002B3_A10130RenObsB = new String[] {""} ;
      T002B3_n10130RenObsB = new boolean[] {false} ;
      sMode227 = "" ;
      T002B6_A1654RenTerCod = new String[] {""} ;
      T002B6_A308CodPro = new String[] {""} ;
      T002B6_A654OrdLin = new short[1] ;
      T002B7_A1654RenTerCod = new String[] {""} ;
      T002B7_A308CodPro = new String[] {""} ;
      T002B7_A654OrdLin = new short[1] ;
      T002B2_A1654RenTerCod = new String[] {""} ;
      T002B2_A308CodPro = new String[] {""} ;
      T002B2_A654OrdLin = new short[1] ;
      T002B2_A457FasCod = new String[] {""} ;
      T002B2_n457FasCod = new boolean[] {false} ;
      T002B2_A816RenFasEst = new byte[1] ;
      T002B2_n816RenFasEst = new boolean[] {false} ;
      T002B2_A818RenFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      T002B2_n818RenFecTeo = new boolean[] {false} ;
      T002B2_A817RenFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      T002B2_n817RenFecRea = new boolean[] {false} ;
      T002B2_A3297RenFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      T002B2_n3297RenFecRIni = new boolean[] {false} ;
      T002B2_A824RenTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n824RenTieTeo = new boolean[] {false} ;
      T002B2_A825RenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n825RenUni = new boolean[] {false} ;
      T002B2_A821RenLoc = new String[] {""} ;
      T002B2_n821RenLoc = new boolean[] {false} ;
      T002B2_A820RenHorIni = new short[1] ;
      T002B2_n820RenHorIni = new boolean[] {false} ;
      T002B2_A819RenHorFin = new short[1] ;
      T002B2_n819RenHorFin = new boolean[] {false} ;
      T002B2_A823RenTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n823RenTieRea = new boolean[] {false} ;
      T002B2_A822RenMaqCod = new String[] {""} ;
      T002B2_n822RenMaqCod = new boolean[] {false} ;
      T002B2_A815RenFasCon = new String[] {""} ;
      T002B2_n815RenFasCon = new boolean[] {false} ;
      T002B2_A814RenFacTin = new String[] {""} ;
      T002B2_n814RenFacTin = new boolean[] {false} ;
      T002B2_A4593RenOrdLin = new short[1] ;
      T002B2_n4593RenOrdLin = new boolean[] {false} ;
      T002B2_A4734RenFasPri = new byte[1] ;
      T002B2_n4734RenFasPri = new boolean[] {false} ;
      T002B2_A4735RenFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n4735RenFasKgm = new boolean[] {false} ;
      T002B2_A4736RenFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n4736RenFasMtr = new boolean[] {false} ;
      T002B2_A4737RenFasBot = new String[] {""} ;
      T002B2_n4737RenFasBot = new boolean[] {false} ;
      T002B2_A4738RenNumBot = new int[1] ;
      T002B2_n4738RenNumBot = new boolean[] {false} ;
      T002B2_A4739RenFasFor = new String[] {""} ;
      T002B2_n4739RenFasFor = new boolean[] {false} ;
      T002B2_A4740RenFasPzas = new int[1] ;
      T002B2_n4740RenFasPzas = new boolean[] {false} ;
      T002B2_A4741RenFasCop = new String[] {""} ;
      T002B2_n4741RenFasCop = new boolean[] {false} ;
      T002B2_A4742RenBarUltL = new int[1] ;
      T002B2_n4742RenBarUltL = new boolean[] {false} ;
      T002B2_A4743RenFasCara = new String[] {""} ;
      T002B2_n4743RenFasCara = new boolean[] {false} ;
      T002B2_A4904RenFasAcab = new String[] {""} ;
      T002B2_n4904RenFasAcab = new boolean[] {false} ;
      T002B2_A5370RenFasGral = new String[] {""} ;
      T002B2_n5370RenFasGral = new boolean[] {false} ;
      T002B2_A5897RenMaqPlan = new String[] {""} ;
      T002B2_n5897RenMaqPlan = new boolean[] {false} ;
      T002B2_A5992RenFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n5992RenFasKgT = new boolean[] {false} ;
      T002B2_A5993RenFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n5993RenFasMtT = new boolean[] {false} ;
      T002B2_A6013RenFasTip = new String[] {""} ;
      T002B2_n6013RenFasTip = new boolean[] {false} ;
      T002B2_A6172RenFasSec = new String[] {""} ;
      T002B2_n6172RenFasSec = new boolean[] {false} ;
      T002B2_A6393RenFasMn = new String[] {""} ;
      T002B2_n6393RenFasMn = new boolean[] {false} ;
      T002B2_A6394RenfasOP = new short[1] ;
      T002B2_n6394RenfasOP = new boolean[] {false} ;
      T002B2_A6395RenHdMn = new String[] {""} ;
      T002B2_n6395RenHdMn = new boolean[] {false} ;
      T002B2_A8472RenfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n8472RenfasRb = new boolean[] {false} ;
      T002B2_A8490Renfasinc = new byte[1] ;
      T002B2_n8490Renfasinc = new boolean[] {false} ;
      T002B2_A8491Renfasdti = new java.util.Date[] {GXutil.nullDate()} ;
      T002B2_n8491Renfasdti = new boolean[] {false} ;
      T002B2_A8492Renfasdtf = new java.util.Date[] {GXutil.nullDate()} ;
      T002B2_n8492Renfasdtf = new boolean[] {false} ;
      T002B2_A8493Renfaskpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n8493Renfaskpr = new boolean[] {false} ;
      T002B2_A8494RenfasPpr = new short[1] ;
      T002B2_n8494RenfasPpr = new boolean[] {false} ;
      T002B2_A8495Renfasagr = new String[] {""} ;
      T002B2_n8495Renfasagr = new boolean[] {false} ;
      T002B2_A8496Renfasprp = new String[] {""} ;
      T002B2_n8496Renfasprp = new boolean[] {false} ;
      T002B2_A8497Renfasfpl = new java.util.Date[] {GXutil.nullDate()} ;
      T002B2_n8497Renfasfpl = new boolean[] {false} ;
      T002B2_A8498Renfasusu = new String[] {""} ;
      T002B2_n8498Renfasusu = new boolean[] {false} ;
      T002B2_A8499Renquiul = new short[1] ;
      T002B2_n8499Renquiul = new boolean[] {false} ;
      T002B2_A8500Renfascr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n8500Renfascr = new boolean[] {false} ;
      T002B2_A8501Rentieaut = new short[1] ;
      T002B2_n8501Rentieaut = new boolean[] {false} ;
      T002B2_A8502Renfasnpl = new byte[1] ;
      T002B2_n8502Renfasnpl = new boolean[] {false} ;
      T002B2_A8503Renfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n8503Renfastpp = new boolean[] {false} ;
      T002B2_A8504Renfasunpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002B2_n8504Renfasunpl = new boolean[] {false} ;
      T002B2_A8505Renuord = new short[1] ;
      T002B2_n8505Renuord = new boolean[] {false} ;
      T002B2_A8595RenHdrO = new String[] {""} ;
      T002B2_n8595RenHdrO = new boolean[] {false} ;
      T002B2_A8939Renfaspri2 = new short[1] ;
      T002B2_n8939Renfaspri2 = new boolean[] {false} ;
      T002B2_A9856RenObsF = new String[] {""} ;
      T002B2_n9856RenObsF = new boolean[] {false} ;
      T002B2_A10130RenObsB = new String[] {""} ;
      T002B2_n10130RenObsB = new boolean[] {false} ;
      T002B11_A1654RenTerCod = new String[] {""} ;
      T002B11_A308CodPro = new String[] {""} ;
      T002B11_A654OrdLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ1654RenTerCod = "" ;
      ZZ308CodPro = "" ;
      ZZ457FasCod = "" ;
      ZZ818RenFecTeo = GXutil.nullDate() ;
      ZZ817RenFecRea = GXutil.nullDate() ;
      ZZ3297RenFecRIni = GXutil.nullDate() ;
      ZZ824RenTieTeo = DecimalUtil.ZERO ;
      ZZ825RenUni = DecimalUtil.ZERO ;
      ZZ821RenLoc = "" ;
      ZZ823RenTieRea = DecimalUtil.ZERO ;
      ZZ822RenMaqCod = "" ;
      ZZ815RenFasCon = "" ;
      ZZ814RenFacTin = "" ;
      ZZ4735RenFasKgm = DecimalUtil.ZERO ;
      ZZ4736RenFasMtr = DecimalUtil.ZERO ;
      ZZ4737RenFasBot = "" ;
      ZZ4739RenFasFor = "" ;
      ZZ4741RenFasCop = "" ;
      ZZ4743RenFasCara = "" ;
      ZZ4904RenFasAcab = "" ;
      ZZ5370RenFasGral = "" ;
      ZZ5897RenMaqPlan = "" ;
      ZZ5992RenFasKgT = DecimalUtil.ZERO ;
      ZZ5993RenFasMtT = DecimalUtil.ZERO ;
      ZZ6013RenFasTip = "" ;
      ZZ6172RenFasSec = "" ;
      ZZ6393RenFasMn = "" ;
      ZZ6395RenHdMn = "" ;
      ZZ8472RenfasRb = DecimalUtil.ZERO ;
      ZZ8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
      ZZ8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
      ZZ8493Renfaskpr = DecimalUtil.ZERO ;
      ZZ8495Renfasagr = "" ;
      ZZ8496Renfasprp = "" ;
      ZZ8497Renfasfpl = GXutil.nullDate() ;
      ZZ8498Renfasusu = "" ;
      ZZ8500Renfascr = DecimalUtil.ZERO ;
      ZZ8503Renfastpp = DecimalUtil.ZERO ;
      ZZ8504Renfasunpl = DecimalUtil.ZERO ;
      ZZ8595RenHdrO = "" ;
      ZZ9856RenObsF = "" ;
      ZZ10130RenObsB = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trenfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trenfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trenfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trenfas__default(),
         new Object[] {
             new Object[] {
            T002B2_A1654RenTerCod, T002B2_A308CodPro, T002B2_A654OrdLin, T002B2_A457FasCod, T002B2_n457FasCod, T002B2_A816RenFasEst, T002B2_n816RenFasEst, T002B2_A818RenFecTeo, T002B2_n818RenFecTeo, T002B2_A817RenFecRea,
            T002B2_n817RenFecRea, T002B2_A3297RenFecRIni, T002B2_n3297RenFecRIni, T002B2_A824RenTieTeo, T002B2_n824RenTieTeo, T002B2_A825RenUni, T002B2_n825RenUni, T002B2_A821RenLoc, T002B2_n821RenLoc, T002B2_A820RenHorIni,
            T002B2_n820RenHorIni, T002B2_A819RenHorFin, T002B2_n819RenHorFin, T002B2_A823RenTieRea, T002B2_n823RenTieRea, T002B2_A822RenMaqCod, T002B2_n822RenMaqCod, T002B2_A815RenFasCon, T002B2_n815RenFasCon, T002B2_A814RenFacTin,
            T002B2_n814RenFacTin, T002B2_A4593RenOrdLin, T002B2_n4593RenOrdLin, T002B2_A4734RenFasPri, T002B2_n4734RenFasPri, T002B2_A4735RenFasKgm, T002B2_n4735RenFasKgm, T002B2_A4736RenFasMtr, T002B2_n4736RenFasMtr, T002B2_A4737RenFasBot,
            T002B2_n4737RenFasBot, T002B2_A4738RenNumBot, T002B2_n4738RenNumBot, T002B2_A4739RenFasFor, T002B2_n4739RenFasFor, T002B2_A4740RenFasPzas, T002B2_n4740RenFasPzas, T002B2_A4741RenFasCop, T002B2_n4741RenFasCop, T002B2_A4742RenBarUltL,
            T002B2_n4742RenBarUltL, T002B2_A4743RenFasCara, T002B2_n4743RenFasCara, T002B2_A4904RenFasAcab, T002B2_n4904RenFasAcab, T002B2_A5370RenFasGral, T002B2_n5370RenFasGral, T002B2_A5897RenMaqPlan, T002B2_n5897RenMaqPlan, T002B2_A5992RenFasKgT,
            T002B2_n5992RenFasKgT, T002B2_A5993RenFasMtT, T002B2_n5993RenFasMtT, T002B2_A6013RenFasTip, T002B2_n6013RenFasTip, T002B2_A6172RenFasSec, T002B2_n6172RenFasSec, T002B2_A6393RenFasMn, T002B2_n6393RenFasMn, T002B2_A6394RenfasOP,
            T002B2_n6394RenfasOP, T002B2_A6395RenHdMn, T002B2_n6395RenHdMn, T002B2_A8472RenfasRb, T002B2_n8472RenfasRb, T002B2_A8490Renfasinc, T002B2_n8490Renfasinc, T002B2_A8491Renfasdti, T002B2_n8491Renfasdti, T002B2_A8492Renfasdtf,
            T002B2_n8492Renfasdtf, T002B2_A8493Renfaskpr, T002B2_n8493Renfaskpr, T002B2_A8494RenfasPpr, T002B2_n8494RenfasPpr, T002B2_A8495Renfasagr, T002B2_n8495Renfasagr, T002B2_A8496Renfasprp, T002B2_n8496Renfasprp, T002B2_A8497Renfasfpl,
            T002B2_n8497Renfasfpl, T002B2_A8498Renfasusu, T002B2_n8498Renfasusu, T002B2_A8499Renquiul, T002B2_n8499Renquiul, T002B2_A8500Renfascr, T002B2_n8500Renfascr, T002B2_A8501Rentieaut, T002B2_n8501Rentieaut, T002B2_A8502Renfasnpl,
            T002B2_n8502Renfasnpl, T002B2_A8503Renfastpp, T002B2_n8503Renfastpp, T002B2_A8504Renfasunpl, T002B2_n8504Renfasunpl, T002B2_A8505Renuord, T002B2_n8505Renuord, T002B2_A8595RenHdrO, T002B2_n8595RenHdrO, T002B2_A8939Renfaspri2,
            T002B2_n8939Renfaspri2, T002B2_A9856RenObsF, T002B2_n9856RenObsF, T002B2_A10130RenObsB, T002B2_n10130RenObsB
            }
            , new Object[] {
            T002B3_A1654RenTerCod, T002B3_A308CodPro, T002B3_A654OrdLin, T002B3_A457FasCod, T002B3_n457FasCod, T002B3_A816RenFasEst, T002B3_n816RenFasEst, T002B3_A818RenFecTeo, T002B3_n818RenFecTeo, T002B3_A817RenFecRea,
            T002B3_n817RenFecRea, T002B3_A3297RenFecRIni, T002B3_n3297RenFecRIni, T002B3_A824RenTieTeo, T002B3_n824RenTieTeo, T002B3_A825RenUni, T002B3_n825RenUni, T002B3_A821RenLoc, T002B3_n821RenLoc, T002B3_A820RenHorIni,
            T002B3_n820RenHorIni, T002B3_A819RenHorFin, T002B3_n819RenHorFin, T002B3_A823RenTieRea, T002B3_n823RenTieRea, T002B3_A822RenMaqCod, T002B3_n822RenMaqCod, T002B3_A815RenFasCon, T002B3_n815RenFasCon, T002B3_A814RenFacTin,
            T002B3_n814RenFacTin, T002B3_A4593RenOrdLin, T002B3_n4593RenOrdLin, T002B3_A4734RenFasPri, T002B3_n4734RenFasPri, T002B3_A4735RenFasKgm, T002B3_n4735RenFasKgm, T002B3_A4736RenFasMtr, T002B3_n4736RenFasMtr, T002B3_A4737RenFasBot,
            T002B3_n4737RenFasBot, T002B3_A4738RenNumBot, T002B3_n4738RenNumBot, T002B3_A4739RenFasFor, T002B3_n4739RenFasFor, T002B3_A4740RenFasPzas, T002B3_n4740RenFasPzas, T002B3_A4741RenFasCop, T002B3_n4741RenFasCop, T002B3_A4742RenBarUltL,
            T002B3_n4742RenBarUltL, T002B3_A4743RenFasCara, T002B3_n4743RenFasCara, T002B3_A4904RenFasAcab, T002B3_n4904RenFasAcab, T002B3_A5370RenFasGral, T002B3_n5370RenFasGral, T002B3_A5897RenMaqPlan, T002B3_n5897RenMaqPlan, T002B3_A5992RenFasKgT,
            T002B3_n5992RenFasKgT, T002B3_A5993RenFasMtT, T002B3_n5993RenFasMtT, T002B3_A6013RenFasTip, T002B3_n6013RenFasTip, T002B3_A6172RenFasSec, T002B3_n6172RenFasSec, T002B3_A6393RenFasMn, T002B3_n6393RenFasMn, T002B3_A6394RenfasOP,
            T002B3_n6394RenfasOP, T002B3_A6395RenHdMn, T002B3_n6395RenHdMn, T002B3_A8472RenfasRb, T002B3_n8472RenfasRb, T002B3_A8490Renfasinc, T002B3_n8490Renfasinc, T002B3_A8491Renfasdti, T002B3_n8491Renfasdti, T002B3_A8492Renfasdtf,
            T002B3_n8492Renfasdtf, T002B3_A8493Renfaskpr, T002B3_n8493Renfaskpr, T002B3_A8494RenfasPpr, T002B3_n8494RenfasPpr, T002B3_A8495Renfasagr, T002B3_n8495Renfasagr, T002B3_A8496Renfasprp, T002B3_n8496Renfasprp, T002B3_A8497Renfasfpl,
            T002B3_n8497Renfasfpl, T002B3_A8498Renfasusu, T002B3_n8498Renfasusu, T002B3_A8499Renquiul, T002B3_n8499Renquiul, T002B3_A8500Renfascr, T002B3_n8500Renfascr, T002B3_A8501Rentieaut, T002B3_n8501Rentieaut, T002B3_A8502Renfasnpl,
            T002B3_n8502Renfasnpl, T002B3_A8503Renfastpp, T002B3_n8503Renfastpp, T002B3_A8504Renfasunpl, T002B3_n8504Renfasunpl, T002B3_A8505Renuord, T002B3_n8505Renuord, T002B3_A8595RenHdrO, T002B3_n8595RenHdrO, T002B3_A8939Renfaspri2,
            T002B3_n8939Renfaspri2, T002B3_A9856RenObsF, T002B3_n9856RenObsF, T002B3_A10130RenObsB, T002B3_n10130RenObsB
            }
            , new Object[] {
            T002B4_A1654RenTerCod, T002B4_A308CodPro, T002B4_A654OrdLin, T002B4_A457FasCod, T002B4_n457FasCod, T002B4_A816RenFasEst, T002B4_n816RenFasEst, T002B4_A818RenFecTeo, T002B4_n818RenFecTeo, T002B4_A817RenFecRea,
            T002B4_n817RenFecRea, T002B4_A3297RenFecRIni, T002B4_n3297RenFecRIni, T002B4_A824RenTieTeo, T002B4_n824RenTieTeo, T002B4_A825RenUni, T002B4_n825RenUni, T002B4_A821RenLoc, T002B4_n821RenLoc, T002B4_A820RenHorIni,
            T002B4_n820RenHorIni, T002B4_A819RenHorFin, T002B4_n819RenHorFin, T002B4_A823RenTieRea, T002B4_n823RenTieRea, T002B4_A822RenMaqCod, T002B4_n822RenMaqCod, T002B4_A815RenFasCon, T002B4_n815RenFasCon, T002B4_A814RenFacTin,
            T002B4_n814RenFacTin, T002B4_A4593RenOrdLin, T002B4_n4593RenOrdLin, T002B4_A4734RenFasPri, T002B4_n4734RenFasPri, T002B4_A4735RenFasKgm, T002B4_n4735RenFasKgm, T002B4_A4736RenFasMtr, T002B4_n4736RenFasMtr, T002B4_A4737RenFasBot,
            T002B4_n4737RenFasBot, T002B4_A4738RenNumBot, T002B4_n4738RenNumBot, T002B4_A4739RenFasFor, T002B4_n4739RenFasFor, T002B4_A4740RenFasPzas, T002B4_n4740RenFasPzas, T002B4_A4741RenFasCop, T002B4_n4741RenFasCop, T002B4_A4742RenBarUltL,
            T002B4_n4742RenBarUltL, T002B4_A4743RenFasCara, T002B4_n4743RenFasCara, T002B4_A4904RenFasAcab, T002B4_n4904RenFasAcab, T002B4_A5370RenFasGral, T002B4_n5370RenFasGral, T002B4_A5897RenMaqPlan, T002B4_n5897RenMaqPlan, T002B4_A5992RenFasKgT,
            T002B4_n5992RenFasKgT, T002B4_A5993RenFasMtT, T002B4_n5993RenFasMtT, T002B4_A6013RenFasTip, T002B4_n6013RenFasTip, T002B4_A6172RenFasSec, T002B4_n6172RenFasSec, T002B4_A6393RenFasMn, T002B4_n6393RenFasMn, T002B4_A6394RenfasOP,
            T002B4_n6394RenfasOP, T002B4_A6395RenHdMn, T002B4_n6395RenHdMn, T002B4_A8472RenfasRb, T002B4_n8472RenfasRb, T002B4_A8490Renfasinc, T002B4_n8490Renfasinc, T002B4_A8491Renfasdti, T002B4_n8491Renfasdti, T002B4_A8492Renfasdtf,
            T002B4_n8492Renfasdtf, T002B4_A8493Renfaskpr, T002B4_n8493Renfaskpr, T002B4_A8494RenfasPpr, T002B4_n8494RenfasPpr, T002B4_A8495Renfasagr, T002B4_n8495Renfasagr, T002B4_A8496Renfasprp, T002B4_n8496Renfasprp, T002B4_A8497Renfasfpl,
            T002B4_n8497Renfasfpl, T002B4_A8498Renfasusu, T002B4_n8498Renfasusu, T002B4_A8499Renquiul, T002B4_n8499Renquiul, T002B4_A8500Renfascr, T002B4_n8500Renfascr, T002B4_A8501Rentieaut, T002B4_n8501Rentieaut, T002B4_A8502Renfasnpl,
            T002B4_n8502Renfasnpl, T002B4_A8503Renfastpp, T002B4_n8503Renfastpp, T002B4_A8504Renfasunpl, T002B4_n8504Renfasunpl, T002B4_A8505Renuord, T002B4_n8505Renuord, T002B4_A8595RenHdrO, T002B4_n8595RenHdrO, T002B4_A8939Renfaspri2,
            T002B4_n8939Renfaspri2, T002B4_A9856RenObsF, T002B4_n9856RenObsF, T002B4_A10130RenObsB, T002B4_n10130RenObsB
            }
            , new Object[] {
            T002B5_A1654RenTerCod, T002B5_A308CodPro, T002B5_A654OrdLin
            }
            , new Object[] {
            T002B6_A1654RenTerCod, T002B6_A308CodPro, T002B6_A654OrdLin
            }
            , new Object[] {
            T002B7_A1654RenTerCod, T002B7_A308CodPro, T002B7_A654OrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002B11_A1654RenTerCod, T002B11_A308CodPro, T002B11_A654OrdLin
            }
         }
      );
   }

   private byte Z816RenFasEst ;
   private byte Z4734RenFasPri ;
   private byte Z8490Renfasinc ;
   private byte Z8502Renfasnpl ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A816RenFasEst ;
   private byte A4734RenFasPri ;
   private byte A8490Renfasinc ;
   private byte A8502Renfasnpl ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ816RenFasEst ;
   private byte ZZ4734RenFasPri ;
   private byte ZZ8490Renfasinc ;
   private byte ZZ8502Renfasnpl ;
   private short Z654OrdLin ;
   private short Z820RenHorIni ;
   private short Z819RenHorFin ;
   private short Z4593RenOrdLin ;
   private short Z6394RenfasOP ;
   private short Z8494RenfasPpr ;
   private short Z8499Renquiul ;
   private short Z8501Rentieaut ;
   private short Z8505Renuord ;
   private short Z8939Renfaspri2 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A654OrdLin ;
   private short A820RenHorIni ;
   private short A819RenHorFin ;
   private short A4593RenOrdLin ;
   private short A6394RenfasOP ;
   private short A8494RenfasPpr ;
   private short A8499Renquiul ;
   private short A8501Rentieaut ;
   private short A8505Renuord ;
   private short A8939Renfaspri2 ;
   private short RcdFound227 ;
   private short nIsDirty_227 ;
   private short ZZ654OrdLin ;
   private short ZZ820RenHorIni ;
   private short ZZ819RenHorFin ;
   private short ZZ4593RenOrdLin ;
   private short ZZ6394RenfasOP ;
   private short ZZ8494RenfasPpr ;
   private short ZZ8499Renquiul ;
   private short ZZ8501Rentieaut ;
   private short ZZ8505Renuord ;
   private short ZZ8939Renfaspri2 ;
   private int Z4738RenNumBot ;
   private int Z4740RenFasPzas ;
   private int Z4742RenBarUltL ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtRenTerCod_Enabled ;
   private int edtCodPro_Enabled ;
   private int edtOrdLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtRenFasEst_Enabled ;
   private int edtRenFecTeo_Enabled ;
   private int edtRenFecRea_Enabled ;
   private int edtRenFecRIni_Enabled ;
   private int edtRenTieTeo_Enabled ;
   private int edtRenUni_Enabled ;
   private int edtRenLoc_Enabled ;
   private int edtRenHorIni_Enabled ;
   private int edtRenHorFin_Enabled ;
   private int edtRenTieRea_Enabled ;
   private int edtRenMaqCod_Enabled ;
   private int edtRenFasCon_Enabled ;
   private int edtRenFacTin_Enabled ;
   private int edtRenOrdLin_Enabled ;
   private int edtRenFasPri_Enabled ;
   private int edtRenFasKgm_Enabled ;
   private int edtRenFasMtr_Enabled ;
   private int edtRenFasBot_Enabled ;
   private int A4738RenNumBot ;
   private int edtRenNumBot_Enabled ;
   private int edtRenFasFor_Enabled ;
   private int A4740RenFasPzas ;
   private int edtRenFasPzas_Enabled ;
   private int edtRenFasCop_Enabled ;
   private int A4742RenBarUltL ;
   private int edtRenBarUltL_Enabled ;
   private int edtRenFasCara_Enabled ;
   private int edtRenFasAcab_Enabled ;
   private int edtRenFasGral_Enabled ;
   private int edtRenMaqPlan_Enabled ;
   private int edtRenFasKgT_Enabled ;
   private int edtRenFasMtT_Enabled ;
   private int edtRenFasTip_Enabled ;
   private int edtRenFasSec_Enabled ;
   private int edtRenFasMn_Enabled ;
   private int edtRenfasOP_Enabled ;
   private int edtRenHdMn_Enabled ;
   private int edtRenfasRb_Enabled ;
   private int edtRenfasinc_Enabled ;
   private int edtRenfasdti_Enabled ;
   private int edtRenfasdtf_Enabled ;
   private int edtRenfaskpr_Enabled ;
   private int edtRenfasPpr_Enabled ;
   private int edtRenfasagr_Enabled ;
   private int edtRenfasprp_Enabled ;
   private int edtRenfasfpl_Enabled ;
   private int edtRenfasusu_Enabled ;
   private int edtRenquiul_Enabled ;
   private int edtRenfascr_Enabled ;
   private int edtRentieaut_Enabled ;
   private int edtRenfasnpl_Enabled ;
   private int edtRenfastpp_Enabled ;
   private int edtRenfasunpl_Enabled ;
   private int edtRenuord_Enabled ;
   private int edtRenHdrO_Enabled ;
   private int edtRenfaspri2_Enabled ;
   private int edtRenObsF_Enabled ;
   private int edtRenObsB_Enabled ;
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
   private int edtRenObsB_Backcolor ;
   private int edtRenObsF_Backcolor ;
   private int edtRenfaspri2_Backcolor ;
   private int edtRenHdrO_Backcolor ;
   private int edtRenuord_Backcolor ;
   private int edtRenfasunpl_Backcolor ;
   private int edtRenfastpp_Backcolor ;
   private int edtRenfasnpl_Backcolor ;
   private int edtRentieaut_Backcolor ;
   private int edtRenfascr_Backcolor ;
   private int edtRenquiul_Backcolor ;
   private int edtRenfasusu_Backcolor ;
   private int edtRenfasfpl_Backcolor ;
   private int edtRenfasprp_Backcolor ;
   private int edtRenfasagr_Backcolor ;
   private int edtRenfasPpr_Backcolor ;
   private int edtRenfaskpr_Backcolor ;
   private int edtRenfasdtf_Backcolor ;
   private int edtRenfasdti_Backcolor ;
   private int edtRenfasinc_Backcolor ;
   private int edtRenfasRb_Backcolor ;
   private int edtRenHdMn_Backcolor ;
   private int edtRenfasOP_Backcolor ;
   private int edtRenFasMn_Backcolor ;
   private int edtRenFasSec_Backcolor ;
   private int edtRenFasTip_Backcolor ;
   private int edtRenFasMtT_Backcolor ;
   private int edtRenFasKgT_Backcolor ;
   private int edtRenMaqPlan_Backcolor ;
   private int edtRenFasGral_Backcolor ;
   private int edtRenFasAcab_Backcolor ;
   private int edtRenFasCara_Backcolor ;
   private int edtRenBarUltL_Backcolor ;
   private int edtRenFasCop_Backcolor ;
   private int edtRenFasPzas_Backcolor ;
   private int edtRenFasFor_Backcolor ;
   private int edtRenNumBot_Backcolor ;
   private int edtRenFasBot_Backcolor ;
   private int edtRenFasMtr_Backcolor ;
   private int edtRenFasKgm_Backcolor ;
   private int edtRenFasPri_Backcolor ;
   private int edtRenOrdLin_Backcolor ;
   private int edtRenFacTin_Backcolor ;
   private int edtRenFasCon_Backcolor ;
   private int edtRenMaqCod_Backcolor ;
   private int edtRenTieRea_Backcolor ;
   private int edtRenHorFin_Backcolor ;
   private int edtRenHorIni_Backcolor ;
   private int edtRenLoc_Backcolor ;
   private int edtRenUni_Backcolor ;
   private int edtRenTieTeo_Backcolor ;
   private int edtRenFecRIni_Backcolor ;
   private int edtRenFecRea_Backcolor ;
   private int edtRenFecTeo_Backcolor ;
   private int edtRenFasEst_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtOrdLin_Backcolor ;
   private int edtCodPro_Backcolor ;
   private int edtRenTerCod_Backcolor ;
   private int ZZ4738RenNumBot ;
   private int ZZ4740RenFasPzas ;
   private int ZZ4742RenBarUltL ;
   private java.math.BigDecimal Z824RenTieTeo ;
   private java.math.BigDecimal Z825RenUni ;
   private java.math.BigDecimal Z823RenTieRea ;
   private java.math.BigDecimal Z4735RenFasKgm ;
   private java.math.BigDecimal Z4736RenFasMtr ;
   private java.math.BigDecimal Z5992RenFasKgT ;
   private java.math.BigDecimal Z5993RenFasMtT ;
   private java.math.BigDecimal Z8472RenfasRb ;
   private java.math.BigDecimal Z8493Renfaskpr ;
   private java.math.BigDecimal Z8500Renfascr ;
   private java.math.BigDecimal Z8503Renfastpp ;
   private java.math.BigDecimal Z8504Renfasunpl ;
   private java.math.BigDecimal A824RenTieTeo ;
   private java.math.BigDecimal A825RenUni ;
   private java.math.BigDecimal A823RenTieRea ;
   private java.math.BigDecimal A4735RenFasKgm ;
   private java.math.BigDecimal A4736RenFasMtr ;
   private java.math.BigDecimal A5992RenFasKgT ;
   private java.math.BigDecimal A5993RenFasMtT ;
   private java.math.BigDecimal A8472RenfasRb ;
   private java.math.BigDecimal A8493Renfaskpr ;
   private java.math.BigDecimal A8500Renfascr ;
   private java.math.BigDecimal A8503Renfastpp ;
   private java.math.BigDecimal A8504Renfasunpl ;
   private java.math.BigDecimal ZZ824RenTieTeo ;
   private java.math.BigDecimal ZZ825RenUni ;
   private java.math.BigDecimal ZZ823RenTieRea ;
   private java.math.BigDecimal ZZ4735RenFasKgm ;
   private java.math.BigDecimal ZZ4736RenFasMtr ;
   private java.math.BigDecimal ZZ5992RenFasKgT ;
   private java.math.BigDecimal ZZ5993RenFasMtT ;
   private java.math.BigDecimal ZZ8472RenfasRb ;
   private java.math.BigDecimal ZZ8493Renfaskpr ;
   private java.math.BigDecimal ZZ8500Renfascr ;
   private java.math.BigDecimal ZZ8503Renfastpp ;
   private java.math.BigDecimal ZZ8504Renfasunpl ;
   private String sPrefix ;
   private String Z1654RenTerCod ;
   private String Z308CodPro ;
   private String Z457FasCod ;
   private String Z821RenLoc ;
   private String Z822RenMaqCod ;
   private String Z815RenFasCon ;
   private String Z814RenFacTin ;
   private String Z4737RenFasBot ;
   private String Z4739RenFasFor ;
   private String Z4741RenFasCop ;
   private String Z4743RenFasCara ;
   private String Z4904RenFasAcab ;
   private String Z5370RenFasGral ;
   private String Z5897RenMaqPlan ;
   private String Z6013RenFasTip ;
   private String Z6172RenFasSec ;
   private String Z6393RenFasMn ;
   private String Z6395RenHdMn ;
   private String Z8495Renfasagr ;
   private String Z8496Renfasprp ;
   private String Z8498Renfasusu ;
   private String Z8595RenHdrO ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRenTerCod_Internalname ;
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
   private String A1654RenTerCod ;
   private String edtRenTerCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCodPro_Internalname ;
   private String A308CodPro ;
   private String edtCodPro_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtOrdLin_Internalname ;
   private String edtOrdLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRenFasEst_Internalname ;
   private String edtRenFasEst_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRenFecTeo_Internalname ;
   private String edtRenFecTeo_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRenFecRea_Internalname ;
   private String edtRenFecRea_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtRenFecRIni_Internalname ;
   private String edtRenFecRIni_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtRenTieTeo_Internalname ;
   private String edtRenTieTeo_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtRenUni_Internalname ;
   private String edtRenUni_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtRenLoc_Internalname ;
   private String A821RenLoc ;
   private String edtRenLoc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtRenHorIni_Internalname ;
   private String edtRenHorIni_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtRenHorFin_Internalname ;
   private String edtRenHorFin_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtRenTieRea_Internalname ;
   private String edtRenTieRea_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtRenMaqCod_Internalname ;
   private String A822RenMaqCod ;
   private String edtRenMaqCod_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtRenFasCon_Internalname ;
   private String A815RenFasCon ;
   private String edtRenFasCon_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtRenFacTin_Internalname ;
   private String A814RenFacTin ;
   private String edtRenFacTin_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtRenOrdLin_Internalname ;
   private String edtRenOrdLin_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtRenFasPri_Internalname ;
   private String edtRenFasPri_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtRenFasKgm_Internalname ;
   private String edtRenFasKgm_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtRenFasMtr_Internalname ;
   private String edtRenFasMtr_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtRenFasBot_Internalname ;
   private String A4737RenFasBot ;
   private String edtRenFasBot_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtRenNumBot_Internalname ;
   private String edtRenNumBot_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtRenFasFor_Internalname ;
   private String A4739RenFasFor ;
   private String edtRenFasFor_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtRenFasPzas_Internalname ;
   private String edtRenFasPzas_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtRenFasCop_Internalname ;
   private String A4741RenFasCop ;
   private String edtRenFasCop_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtRenBarUltL_Internalname ;
   private String edtRenBarUltL_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtRenFasCara_Internalname ;
   private String A4743RenFasCara ;
   private String edtRenFasCara_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtRenFasAcab_Internalname ;
   private String A4904RenFasAcab ;
   private String edtRenFasAcab_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtRenFasGral_Internalname ;
   private String A5370RenFasGral ;
   private String edtRenFasGral_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtRenMaqPlan_Internalname ;
   private String A5897RenMaqPlan ;
   private String edtRenMaqPlan_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtRenFasKgT_Internalname ;
   private String edtRenFasKgT_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtRenFasMtT_Internalname ;
   private String edtRenFasMtT_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtRenFasTip_Internalname ;
   private String A6013RenFasTip ;
   private String edtRenFasTip_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtRenFasSec_Internalname ;
   private String A6172RenFasSec ;
   private String edtRenFasSec_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtRenFasMn_Internalname ;
   private String A6393RenFasMn ;
   private String edtRenFasMn_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtRenfasOP_Internalname ;
   private String edtRenfasOP_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtRenHdMn_Internalname ;
   private String A6395RenHdMn ;
   private String edtRenHdMn_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtRenfasRb_Internalname ;
   private String edtRenfasRb_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtRenfasinc_Internalname ;
   private String edtRenfasinc_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtRenfasdti_Internalname ;
   private String edtRenfasdti_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtRenfasdtf_Internalname ;
   private String edtRenfasdtf_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtRenfaskpr_Internalname ;
   private String edtRenfaskpr_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtRenfasPpr_Internalname ;
   private String edtRenfasPpr_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtRenfasagr_Internalname ;
   private String A8495Renfasagr ;
   private String edtRenfasagr_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtRenfasprp_Internalname ;
   private String A8496Renfasprp ;
   private String edtRenfasprp_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtRenfasfpl_Internalname ;
   private String edtRenfasfpl_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtRenfasusu_Internalname ;
   private String A8498Renfasusu ;
   private String edtRenfasusu_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtRenquiul_Internalname ;
   private String edtRenquiul_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtRenfascr_Internalname ;
   private String edtRenfascr_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtRentieaut_Internalname ;
   private String edtRentieaut_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtRenfasnpl_Internalname ;
   private String edtRenfasnpl_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtRenfastpp_Internalname ;
   private String edtRenfastpp_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtRenfasunpl_Internalname ;
   private String edtRenfasunpl_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtRenuord_Internalname ;
   private String edtRenuord_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtRenHdrO_Internalname ;
   private String A8595RenHdrO ;
   private String edtRenHdrO_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtRenfaspri2_Internalname ;
   private String edtRenfaspri2_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtRenObsF_Internalname ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtRenObsB_Internalname ;
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
   private String sMode227 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ1654RenTerCod ;
   private String ZZ308CodPro ;
   private String ZZ457FasCod ;
   private String ZZ821RenLoc ;
   private String ZZ822RenMaqCod ;
   private String ZZ815RenFasCon ;
   private String ZZ814RenFacTin ;
   private String ZZ4737RenFasBot ;
   private String ZZ4739RenFasFor ;
   private String ZZ4741RenFasCop ;
   private String ZZ4743RenFasCara ;
   private String ZZ4904RenFasAcab ;
   private String ZZ5370RenFasGral ;
   private String ZZ5897RenMaqPlan ;
   private String ZZ6013RenFasTip ;
   private String ZZ6172RenFasSec ;
   private String ZZ6393RenFasMn ;
   private String ZZ6395RenHdMn ;
   private String ZZ8495Renfasagr ;
   private String ZZ8496Renfasprp ;
   private String ZZ8498Renfasusu ;
   private String ZZ8595RenHdrO ;
   private java.util.Date Z8491Renfasdti ;
   private java.util.Date Z8492Renfasdtf ;
   private java.util.Date A8491Renfasdti ;
   private java.util.Date A8492Renfasdtf ;
   private java.util.Date ZZ8491Renfasdti ;
   private java.util.Date ZZ8492Renfasdtf ;
   private java.util.Date Z818RenFecTeo ;
   private java.util.Date Z817RenFecRea ;
   private java.util.Date Z3297RenFecRIni ;
   private java.util.Date Z8497Renfasfpl ;
   private java.util.Date A818RenFecTeo ;
   private java.util.Date A817RenFecRea ;
   private java.util.Date A3297RenFecRIni ;
   private java.util.Date A8497Renfasfpl ;
   private java.util.Date ZZ818RenFecTeo ;
   private java.util.Date ZZ817RenFecRea ;
   private java.util.Date ZZ3297RenFecRIni ;
   private java.util.Date ZZ8497Renfasfpl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n457FasCod ;
   private boolean n816RenFasEst ;
   private boolean n818RenFecTeo ;
   private boolean n817RenFecRea ;
   private boolean n3297RenFecRIni ;
   private boolean n824RenTieTeo ;
   private boolean n825RenUni ;
   private boolean n821RenLoc ;
   private boolean n820RenHorIni ;
   private boolean n819RenHorFin ;
   private boolean n823RenTieRea ;
   private boolean n822RenMaqCod ;
   private boolean n815RenFasCon ;
   private boolean n814RenFacTin ;
   private boolean n4593RenOrdLin ;
   private boolean n4734RenFasPri ;
   private boolean n4735RenFasKgm ;
   private boolean n4736RenFasMtr ;
   private boolean n4737RenFasBot ;
   private boolean n4738RenNumBot ;
   private boolean n4739RenFasFor ;
   private boolean n4740RenFasPzas ;
   private boolean n4741RenFasCop ;
   private boolean n4742RenBarUltL ;
   private boolean n4743RenFasCara ;
   private boolean n4904RenFasAcab ;
   private boolean n5370RenFasGral ;
   private boolean n5897RenMaqPlan ;
   private boolean n5992RenFasKgT ;
   private boolean n5993RenFasMtT ;
   private boolean n6013RenFasTip ;
   private boolean n6172RenFasSec ;
   private boolean n6393RenFasMn ;
   private boolean n6394RenfasOP ;
   private boolean n6395RenHdMn ;
   private boolean n8472RenfasRb ;
   private boolean n8490Renfasinc ;
   private boolean n8491Renfasdti ;
   private boolean n8492Renfasdtf ;
   private boolean n8493Renfaskpr ;
   private boolean n8494RenfasPpr ;
   private boolean n8495Renfasagr ;
   private boolean n8496Renfasprp ;
   private boolean n8497Renfasfpl ;
   private boolean n8498Renfasusu ;
   private boolean n8499Renquiul ;
   private boolean n8500Renfascr ;
   private boolean n8501Rentieaut ;
   private boolean n8502Renfasnpl ;
   private boolean n8503Renfastpp ;
   private boolean n8504Renfasunpl ;
   private boolean n8505Renuord ;
   private boolean n8595RenHdrO ;
   private boolean n8939Renfaspri2 ;
   private boolean n9856RenObsF ;
   private boolean n10130RenObsB ;
   private boolean Gx_longc ;
   private String Z9856RenObsF ;
   private String Z10130RenObsB ;
   private String A9856RenObsF ;
   private String A10130RenObsB ;
   private String ZZ9856RenObsF ;
   private String ZZ10130RenObsB ;
   private IDataStoreProvider pr_default ;
   private String[] T002B4_A1654RenTerCod ;
   private String[] T002B4_A308CodPro ;
   private short[] T002B4_A654OrdLin ;
   private String[] T002B4_A457FasCod ;
   private boolean[] T002B4_n457FasCod ;
   private byte[] T002B4_A816RenFasEst ;
   private boolean[] T002B4_n816RenFasEst ;
   private java.util.Date[] T002B4_A818RenFecTeo ;
   private boolean[] T002B4_n818RenFecTeo ;
   private java.util.Date[] T002B4_A817RenFecRea ;
   private boolean[] T002B4_n817RenFecRea ;
   private java.util.Date[] T002B4_A3297RenFecRIni ;
   private boolean[] T002B4_n3297RenFecRIni ;
   private java.math.BigDecimal[] T002B4_A824RenTieTeo ;
   private boolean[] T002B4_n824RenTieTeo ;
   private java.math.BigDecimal[] T002B4_A825RenUni ;
   private boolean[] T002B4_n825RenUni ;
   private String[] T002B4_A821RenLoc ;
   private boolean[] T002B4_n821RenLoc ;
   private short[] T002B4_A820RenHorIni ;
   private boolean[] T002B4_n820RenHorIni ;
   private short[] T002B4_A819RenHorFin ;
   private boolean[] T002B4_n819RenHorFin ;
   private java.math.BigDecimal[] T002B4_A823RenTieRea ;
   private boolean[] T002B4_n823RenTieRea ;
   private String[] T002B4_A822RenMaqCod ;
   private boolean[] T002B4_n822RenMaqCod ;
   private String[] T002B4_A815RenFasCon ;
   private boolean[] T002B4_n815RenFasCon ;
   private String[] T002B4_A814RenFacTin ;
   private boolean[] T002B4_n814RenFacTin ;
   private short[] T002B4_A4593RenOrdLin ;
   private boolean[] T002B4_n4593RenOrdLin ;
   private byte[] T002B4_A4734RenFasPri ;
   private boolean[] T002B4_n4734RenFasPri ;
   private java.math.BigDecimal[] T002B4_A4735RenFasKgm ;
   private boolean[] T002B4_n4735RenFasKgm ;
   private java.math.BigDecimal[] T002B4_A4736RenFasMtr ;
   private boolean[] T002B4_n4736RenFasMtr ;
   private String[] T002B4_A4737RenFasBot ;
   private boolean[] T002B4_n4737RenFasBot ;
   private int[] T002B4_A4738RenNumBot ;
   private boolean[] T002B4_n4738RenNumBot ;
   private String[] T002B4_A4739RenFasFor ;
   private boolean[] T002B4_n4739RenFasFor ;
   private int[] T002B4_A4740RenFasPzas ;
   private boolean[] T002B4_n4740RenFasPzas ;
   private String[] T002B4_A4741RenFasCop ;
   private boolean[] T002B4_n4741RenFasCop ;
   private int[] T002B4_A4742RenBarUltL ;
   private boolean[] T002B4_n4742RenBarUltL ;
   private String[] T002B4_A4743RenFasCara ;
   private boolean[] T002B4_n4743RenFasCara ;
   private String[] T002B4_A4904RenFasAcab ;
   private boolean[] T002B4_n4904RenFasAcab ;
   private String[] T002B4_A5370RenFasGral ;
   private boolean[] T002B4_n5370RenFasGral ;
   private String[] T002B4_A5897RenMaqPlan ;
   private boolean[] T002B4_n5897RenMaqPlan ;
   private java.math.BigDecimal[] T002B4_A5992RenFasKgT ;
   private boolean[] T002B4_n5992RenFasKgT ;
   private java.math.BigDecimal[] T002B4_A5993RenFasMtT ;
   private boolean[] T002B4_n5993RenFasMtT ;
   private String[] T002B4_A6013RenFasTip ;
   private boolean[] T002B4_n6013RenFasTip ;
   private String[] T002B4_A6172RenFasSec ;
   private boolean[] T002B4_n6172RenFasSec ;
   private String[] T002B4_A6393RenFasMn ;
   private boolean[] T002B4_n6393RenFasMn ;
   private short[] T002B4_A6394RenfasOP ;
   private boolean[] T002B4_n6394RenfasOP ;
   private String[] T002B4_A6395RenHdMn ;
   private boolean[] T002B4_n6395RenHdMn ;
   private java.math.BigDecimal[] T002B4_A8472RenfasRb ;
   private boolean[] T002B4_n8472RenfasRb ;
   private byte[] T002B4_A8490Renfasinc ;
   private boolean[] T002B4_n8490Renfasinc ;
   private java.util.Date[] T002B4_A8491Renfasdti ;
   private boolean[] T002B4_n8491Renfasdti ;
   private java.util.Date[] T002B4_A8492Renfasdtf ;
   private boolean[] T002B4_n8492Renfasdtf ;
   private java.math.BigDecimal[] T002B4_A8493Renfaskpr ;
   private boolean[] T002B4_n8493Renfaskpr ;
   private short[] T002B4_A8494RenfasPpr ;
   private boolean[] T002B4_n8494RenfasPpr ;
   private String[] T002B4_A8495Renfasagr ;
   private boolean[] T002B4_n8495Renfasagr ;
   private String[] T002B4_A8496Renfasprp ;
   private boolean[] T002B4_n8496Renfasprp ;
   private java.util.Date[] T002B4_A8497Renfasfpl ;
   private boolean[] T002B4_n8497Renfasfpl ;
   private String[] T002B4_A8498Renfasusu ;
   private boolean[] T002B4_n8498Renfasusu ;
   private short[] T002B4_A8499Renquiul ;
   private boolean[] T002B4_n8499Renquiul ;
   private java.math.BigDecimal[] T002B4_A8500Renfascr ;
   private boolean[] T002B4_n8500Renfascr ;
   private short[] T002B4_A8501Rentieaut ;
   private boolean[] T002B4_n8501Rentieaut ;
   private byte[] T002B4_A8502Renfasnpl ;
   private boolean[] T002B4_n8502Renfasnpl ;
   private java.math.BigDecimal[] T002B4_A8503Renfastpp ;
   private boolean[] T002B4_n8503Renfastpp ;
   private java.math.BigDecimal[] T002B4_A8504Renfasunpl ;
   private boolean[] T002B4_n8504Renfasunpl ;
   private short[] T002B4_A8505Renuord ;
   private boolean[] T002B4_n8505Renuord ;
   private String[] T002B4_A8595RenHdrO ;
   private boolean[] T002B4_n8595RenHdrO ;
   private short[] T002B4_A8939Renfaspri2 ;
   private boolean[] T002B4_n8939Renfaspri2 ;
   private String[] T002B4_A9856RenObsF ;
   private boolean[] T002B4_n9856RenObsF ;
   private String[] T002B4_A10130RenObsB ;
   private boolean[] T002B4_n10130RenObsB ;
   private String[] T002B5_A1654RenTerCod ;
   private String[] T002B5_A308CodPro ;
   private short[] T002B5_A654OrdLin ;
   private String[] T002B3_A1654RenTerCod ;
   private String[] T002B3_A308CodPro ;
   private short[] T002B3_A654OrdLin ;
   private String[] T002B3_A457FasCod ;
   private boolean[] T002B3_n457FasCod ;
   private byte[] T002B3_A816RenFasEst ;
   private boolean[] T002B3_n816RenFasEst ;
   private java.util.Date[] T002B3_A818RenFecTeo ;
   private boolean[] T002B3_n818RenFecTeo ;
   private java.util.Date[] T002B3_A817RenFecRea ;
   private boolean[] T002B3_n817RenFecRea ;
   private java.util.Date[] T002B3_A3297RenFecRIni ;
   private boolean[] T002B3_n3297RenFecRIni ;
   private java.math.BigDecimal[] T002B3_A824RenTieTeo ;
   private boolean[] T002B3_n824RenTieTeo ;
   private java.math.BigDecimal[] T002B3_A825RenUni ;
   private boolean[] T002B3_n825RenUni ;
   private String[] T002B3_A821RenLoc ;
   private boolean[] T002B3_n821RenLoc ;
   private short[] T002B3_A820RenHorIni ;
   private boolean[] T002B3_n820RenHorIni ;
   private short[] T002B3_A819RenHorFin ;
   private boolean[] T002B3_n819RenHorFin ;
   private java.math.BigDecimal[] T002B3_A823RenTieRea ;
   private boolean[] T002B3_n823RenTieRea ;
   private String[] T002B3_A822RenMaqCod ;
   private boolean[] T002B3_n822RenMaqCod ;
   private String[] T002B3_A815RenFasCon ;
   private boolean[] T002B3_n815RenFasCon ;
   private String[] T002B3_A814RenFacTin ;
   private boolean[] T002B3_n814RenFacTin ;
   private short[] T002B3_A4593RenOrdLin ;
   private boolean[] T002B3_n4593RenOrdLin ;
   private byte[] T002B3_A4734RenFasPri ;
   private boolean[] T002B3_n4734RenFasPri ;
   private java.math.BigDecimal[] T002B3_A4735RenFasKgm ;
   private boolean[] T002B3_n4735RenFasKgm ;
   private java.math.BigDecimal[] T002B3_A4736RenFasMtr ;
   private boolean[] T002B3_n4736RenFasMtr ;
   private String[] T002B3_A4737RenFasBot ;
   private boolean[] T002B3_n4737RenFasBot ;
   private int[] T002B3_A4738RenNumBot ;
   private boolean[] T002B3_n4738RenNumBot ;
   private String[] T002B3_A4739RenFasFor ;
   private boolean[] T002B3_n4739RenFasFor ;
   private int[] T002B3_A4740RenFasPzas ;
   private boolean[] T002B3_n4740RenFasPzas ;
   private String[] T002B3_A4741RenFasCop ;
   private boolean[] T002B3_n4741RenFasCop ;
   private int[] T002B3_A4742RenBarUltL ;
   private boolean[] T002B3_n4742RenBarUltL ;
   private String[] T002B3_A4743RenFasCara ;
   private boolean[] T002B3_n4743RenFasCara ;
   private String[] T002B3_A4904RenFasAcab ;
   private boolean[] T002B3_n4904RenFasAcab ;
   private String[] T002B3_A5370RenFasGral ;
   private boolean[] T002B3_n5370RenFasGral ;
   private String[] T002B3_A5897RenMaqPlan ;
   private boolean[] T002B3_n5897RenMaqPlan ;
   private java.math.BigDecimal[] T002B3_A5992RenFasKgT ;
   private boolean[] T002B3_n5992RenFasKgT ;
   private java.math.BigDecimal[] T002B3_A5993RenFasMtT ;
   private boolean[] T002B3_n5993RenFasMtT ;
   private String[] T002B3_A6013RenFasTip ;
   private boolean[] T002B3_n6013RenFasTip ;
   private String[] T002B3_A6172RenFasSec ;
   private boolean[] T002B3_n6172RenFasSec ;
   private String[] T002B3_A6393RenFasMn ;
   private boolean[] T002B3_n6393RenFasMn ;
   private short[] T002B3_A6394RenfasOP ;
   private boolean[] T002B3_n6394RenfasOP ;
   private String[] T002B3_A6395RenHdMn ;
   private boolean[] T002B3_n6395RenHdMn ;
   private java.math.BigDecimal[] T002B3_A8472RenfasRb ;
   private boolean[] T002B3_n8472RenfasRb ;
   private byte[] T002B3_A8490Renfasinc ;
   private boolean[] T002B3_n8490Renfasinc ;
   private java.util.Date[] T002B3_A8491Renfasdti ;
   private boolean[] T002B3_n8491Renfasdti ;
   private java.util.Date[] T002B3_A8492Renfasdtf ;
   private boolean[] T002B3_n8492Renfasdtf ;
   private java.math.BigDecimal[] T002B3_A8493Renfaskpr ;
   private boolean[] T002B3_n8493Renfaskpr ;
   private short[] T002B3_A8494RenfasPpr ;
   private boolean[] T002B3_n8494RenfasPpr ;
   private String[] T002B3_A8495Renfasagr ;
   private boolean[] T002B3_n8495Renfasagr ;
   private String[] T002B3_A8496Renfasprp ;
   private boolean[] T002B3_n8496Renfasprp ;
   private java.util.Date[] T002B3_A8497Renfasfpl ;
   private boolean[] T002B3_n8497Renfasfpl ;
   private String[] T002B3_A8498Renfasusu ;
   private boolean[] T002B3_n8498Renfasusu ;
   private short[] T002B3_A8499Renquiul ;
   private boolean[] T002B3_n8499Renquiul ;
   private java.math.BigDecimal[] T002B3_A8500Renfascr ;
   private boolean[] T002B3_n8500Renfascr ;
   private short[] T002B3_A8501Rentieaut ;
   private boolean[] T002B3_n8501Rentieaut ;
   private byte[] T002B3_A8502Renfasnpl ;
   private boolean[] T002B3_n8502Renfasnpl ;
   private java.math.BigDecimal[] T002B3_A8503Renfastpp ;
   private boolean[] T002B3_n8503Renfastpp ;
   private java.math.BigDecimal[] T002B3_A8504Renfasunpl ;
   private boolean[] T002B3_n8504Renfasunpl ;
   private short[] T002B3_A8505Renuord ;
   private boolean[] T002B3_n8505Renuord ;
   private String[] T002B3_A8595RenHdrO ;
   private boolean[] T002B3_n8595RenHdrO ;
   private short[] T002B3_A8939Renfaspri2 ;
   private boolean[] T002B3_n8939Renfaspri2 ;
   private String[] T002B3_A9856RenObsF ;
   private boolean[] T002B3_n9856RenObsF ;
   private String[] T002B3_A10130RenObsB ;
   private boolean[] T002B3_n10130RenObsB ;
   private String[] T002B6_A1654RenTerCod ;
   private String[] T002B6_A308CodPro ;
   private short[] T002B6_A654OrdLin ;
   private String[] T002B7_A1654RenTerCod ;
   private String[] T002B7_A308CodPro ;
   private short[] T002B7_A654OrdLin ;
   private String[] T002B2_A1654RenTerCod ;
   private String[] T002B2_A308CodPro ;
   private short[] T002B2_A654OrdLin ;
   private String[] T002B2_A457FasCod ;
   private boolean[] T002B2_n457FasCod ;
   private byte[] T002B2_A816RenFasEst ;
   private boolean[] T002B2_n816RenFasEst ;
   private java.util.Date[] T002B2_A818RenFecTeo ;
   private boolean[] T002B2_n818RenFecTeo ;
   private java.util.Date[] T002B2_A817RenFecRea ;
   private boolean[] T002B2_n817RenFecRea ;
   private java.util.Date[] T002B2_A3297RenFecRIni ;
   private boolean[] T002B2_n3297RenFecRIni ;
   private java.math.BigDecimal[] T002B2_A824RenTieTeo ;
   private boolean[] T002B2_n824RenTieTeo ;
   private java.math.BigDecimal[] T002B2_A825RenUni ;
   private boolean[] T002B2_n825RenUni ;
   private String[] T002B2_A821RenLoc ;
   private boolean[] T002B2_n821RenLoc ;
   private short[] T002B2_A820RenHorIni ;
   private boolean[] T002B2_n820RenHorIni ;
   private short[] T002B2_A819RenHorFin ;
   private boolean[] T002B2_n819RenHorFin ;
   private java.math.BigDecimal[] T002B2_A823RenTieRea ;
   private boolean[] T002B2_n823RenTieRea ;
   private String[] T002B2_A822RenMaqCod ;
   private boolean[] T002B2_n822RenMaqCod ;
   private String[] T002B2_A815RenFasCon ;
   private boolean[] T002B2_n815RenFasCon ;
   private String[] T002B2_A814RenFacTin ;
   private boolean[] T002B2_n814RenFacTin ;
   private short[] T002B2_A4593RenOrdLin ;
   private boolean[] T002B2_n4593RenOrdLin ;
   private byte[] T002B2_A4734RenFasPri ;
   private boolean[] T002B2_n4734RenFasPri ;
   private java.math.BigDecimal[] T002B2_A4735RenFasKgm ;
   private boolean[] T002B2_n4735RenFasKgm ;
   private java.math.BigDecimal[] T002B2_A4736RenFasMtr ;
   private boolean[] T002B2_n4736RenFasMtr ;
   private String[] T002B2_A4737RenFasBot ;
   private boolean[] T002B2_n4737RenFasBot ;
   private int[] T002B2_A4738RenNumBot ;
   private boolean[] T002B2_n4738RenNumBot ;
   private String[] T002B2_A4739RenFasFor ;
   private boolean[] T002B2_n4739RenFasFor ;
   private int[] T002B2_A4740RenFasPzas ;
   private boolean[] T002B2_n4740RenFasPzas ;
   private String[] T002B2_A4741RenFasCop ;
   private boolean[] T002B2_n4741RenFasCop ;
   private int[] T002B2_A4742RenBarUltL ;
   private boolean[] T002B2_n4742RenBarUltL ;
   private String[] T002B2_A4743RenFasCara ;
   private boolean[] T002B2_n4743RenFasCara ;
   private String[] T002B2_A4904RenFasAcab ;
   private boolean[] T002B2_n4904RenFasAcab ;
   private String[] T002B2_A5370RenFasGral ;
   private boolean[] T002B2_n5370RenFasGral ;
   private String[] T002B2_A5897RenMaqPlan ;
   private boolean[] T002B2_n5897RenMaqPlan ;
   private java.math.BigDecimal[] T002B2_A5992RenFasKgT ;
   private boolean[] T002B2_n5992RenFasKgT ;
   private java.math.BigDecimal[] T002B2_A5993RenFasMtT ;
   private boolean[] T002B2_n5993RenFasMtT ;
   private String[] T002B2_A6013RenFasTip ;
   private boolean[] T002B2_n6013RenFasTip ;
   private String[] T002B2_A6172RenFasSec ;
   private boolean[] T002B2_n6172RenFasSec ;
   private String[] T002B2_A6393RenFasMn ;
   private boolean[] T002B2_n6393RenFasMn ;
   private short[] T002B2_A6394RenfasOP ;
   private boolean[] T002B2_n6394RenfasOP ;
   private String[] T002B2_A6395RenHdMn ;
   private boolean[] T002B2_n6395RenHdMn ;
   private java.math.BigDecimal[] T002B2_A8472RenfasRb ;
   private boolean[] T002B2_n8472RenfasRb ;
   private byte[] T002B2_A8490Renfasinc ;
   private boolean[] T002B2_n8490Renfasinc ;
   private java.util.Date[] T002B2_A8491Renfasdti ;
   private boolean[] T002B2_n8491Renfasdti ;
   private java.util.Date[] T002B2_A8492Renfasdtf ;
   private boolean[] T002B2_n8492Renfasdtf ;
   private java.math.BigDecimal[] T002B2_A8493Renfaskpr ;
   private boolean[] T002B2_n8493Renfaskpr ;
   private short[] T002B2_A8494RenfasPpr ;
   private boolean[] T002B2_n8494RenfasPpr ;
   private String[] T002B2_A8495Renfasagr ;
   private boolean[] T002B2_n8495Renfasagr ;
   private String[] T002B2_A8496Renfasprp ;
   private boolean[] T002B2_n8496Renfasprp ;
   private java.util.Date[] T002B2_A8497Renfasfpl ;
   private boolean[] T002B2_n8497Renfasfpl ;
   private String[] T002B2_A8498Renfasusu ;
   private boolean[] T002B2_n8498Renfasusu ;
   private short[] T002B2_A8499Renquiul ;
   private boolean[] T002B2_n8499Renquiul ;
   private java.math.BigDecimal[] T002B2_A8500Renfascr ;
   private boolean[] T002B2_n8500Renfascr ;
   private short[] T002B2_A8501Rentieaut ;
   private boolean[] T002B2_n8501Rentieaut ;
   private byte[] T002B2_A8502Renfasnpl ;
   private boolean[] T002B2_n8502Renfasnpl ;
   private java.math.BigDecimal[] T002B2_A8503Renfastpp ;
   private boolean[] T002B2_n8503Renfastpp ;
   private java.math.BigDecimal[] T002B2_A8504Renfasunpl ;
   private boolean[] T002B2_n8504Renfasunpl ;
   private short[] T002B2_A8505Renuord ;
   private boolean[] T002B2_n8505Renuord ;
   private String[] T002B2_A8595RenHdrO ;
   private boolean[] T002B2_n8595RenHdrO ;
   private short[] T002B2_A8939Renfaspri2 ;
   private boolean[] T002B2_n8939Renfaspri2 ;
   private String[] T002B2_A9856RenObsF ;
   private boolean[] T002B2_n9856RenObsF ;
   private String[] T002B2_A10130RenObsB ;
   private boolean[] T002B2_n10130RenObsB ;
   private String[] T002B11_A1654RenTerCod ;
   private String[] T002B11_A308CodPro ;
   private short[] T002B11_A654OrdLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trenfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trenfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trenfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trenfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002B2", "SELECT RenTerCod, CodPro, OrdLin, FasCod, RenFasEst, RenFecTeo, RenFecRea, RenFecRIni, RenTieTeo, RenUni, RenLoc, RenHorIni, RenHorFin, RenTieRea, RenMaqCod, RenFasCon, RenFacTin, RenOrdLin, RenFasPri, RenFasKgm, RenFasMtr, RenFasBot, RenNumBot, RenFasFor, RenFasPzas, RenFasCop, RenBarUltL, RenFasCara, RenFasAcab, RenFasGral, RenMaqPlan, RenFasKgT, RenFasMtT, RenFasTip, RenFasSec, RenFasMn, RenfasOP, RenHdMn, RenfasRb, Renfasinc, Renfasdti, Renfasdtf, Renfaskpr, RenfasPpr, Renfasagr, Renfasprp, Renfasfpl, Renfasusu, Renquiul, Renfascr, Rentieaut, Renfasnpl, Renfastpp, Renfasunpl, Renuord, RenHdrO, Renfaspri2, RenObsF, RenObsB FROM TXPRENFAS WHERE RenTerCod = ? AND CodPro = ? AND OrdLin = ?  FOR UPDATE OF FasCod, RenFasEst, RenFecTeo, RenFecRea, RenFecRIni, RenTieTeo, RenUni, RenLoc, RenHorIni, RenHorFin, RenTieRea, RenMaqCod, RenFasCon, RenFacTin, RenOrdLin, RenFasPri, RenFasKgm, RenFasMtr, RenFasBot, RenNumBot, RenFasFor, RenFasPzas, RenFasCop, RenBarUltL, RenFasCara, RenFasAcab, RenFasGral, RenMaqPlan, RenFasKgT, RenFasMtT, RenFasTip, RenFasSec, RenFasMn, RenfasOP, RenHdMn, RenfasRb, Renfasinc, Renfasdti, Renfasdtf, Renfaskpr, RenfasPpr, Renfasagr, Renfasprp, Renfasfpl, Renfasusu, Renquiul, Renfascr, Rentieaut, Renfasnpl, Renfastpp, Renfasunpl, Renuord, RenHdrO, Renfaspri2, RenObsF, RenObsB NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002B3", "SELECT RenTerCod, CodPro, OrdLin, FasCod, RenFasEst, RenFecTeo, RenFecRea, RenFecRIni, RenTieTeo, RenUni, RenLoc, RenHorIni, RenHorFin, RenTieRea, RenMaqCod, RenFasCon, RenFacTin, RenOrdLin, RenFasPri, RenFasKgm, RenFasMtr, RenFasBot, RenNumBot, RenFasFor, RenFasPzas, RenFasCop, RenBarUltL, RenFasCara, RenFasAcab, RenFasGral, RenMaqPlan, RenFasKgT, RenFasMtT, RenFasTip, RenFasSec, RenFasMn, RenfasOP, RenHdMn, RenfasRb, Renfasinc, Renfasdti, Renfasdtf, Renfaskpr, RenfasPpr, Renfasagr, Renfasprp, Renfasfpl, Renfasusu, Renquiul, Renfascr, Rentieaut, Renfasnpl, Renfastpp, Renfasunpl, Renuord, RenHdrO, Renfaspri2, RenObsF, RenObsB FROM TXPRENFAS WHERE RenTerCod = ? AND CodPro = ? AND OrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002B4", "SELECT /*+ FIRST_ROWS(100) */ TM1.RenTerCod, TM1.CodPro, TM1.OrdLin, TM1.FasCod, TM1.RenFasEst, TM1.RenFecTeo, TM1.RenFecRea, TM1.RenFecRIni, TM1.RenTieTeo, TM1.RenUni, TM1.RenLoc, TM1.RenHorIni, TM1.RenHorFin, TM1.RenTieRea, TM1.RenMaqCod, TM1.RenFasCon, TM1.RenFacTin, TM1.RenOrdLin, TM1.RenFasPri, TM1.RenFasKgm, TM1.RenFasMtr, TM1.RenFasBot, TM1.RenNumBot, TM1.RenFasFor, TM1.RenFasPzas, TM1.RenFasCop, TM1.RenBarUltL, TM1.RenFasCara, TM1.RenFasAcab, TM1.RenFasGral, TM1.RenMaqPlan, TM1.RenFasKgT, TM1.RenFasMtT, TM1.RenFasTip, TM1.RenFasSec, TM1.RenFasMn, TM1.RenfasOP, TM1.RenHdMn, TM1.RenfasRb, TM1.Renfasinc, TM1.Renfasdti, TM1.Renfasdtf, TM1.Renfaskpr, TM1.RenfasPpr, TM1.Renfasagr, TM1.Renfasprp, TM1.Renfasfpl, TM1.Renfasusu, TM1.Renquiul, TM1.Renfascr, TM1.Rentieaut, TM1.Renfasnpl, TM1.Renfastpp, TM1.Renfasunpl, TM1.Renuord, TM1.RenHdrO, TM1.Renfaspri2, TM1.RenObsF, TM1.RenObsB FROM TXPRENFAS TM1 WHERE TM1.RenTerCod = ? and TM1.CodPro = ? and TM1.OrdLin = ? ORDER BY TM1.RenTerCod, TM1.CodPro, TM1.OrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002B5", "SELECT /*+ FIRST_ROWS(1) */ RenTerCod, CodPro, OrdLin FROM TXPRENFAS WHERE RenTerCod = ? AND CodPro = ? AND OrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002B6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RenTerCod, CodPro, OrdLin FROM TXPRENFAS WHERE ( RenTerCod > ? or RenTerCod = ? and CodPro > ? or CodPro = ? and RenTerCod = ? and OrdLin > ?) ORDER BY RenTerCod, CodPro, OrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002B7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RenTerCod, CodPro, OrdLin FROM TXPRENFAS WHERE ( RenTerCod < ? or RenTerCod = ? and CodPro < ? or CodPro = ? and RenTerCod = ? and OrdLin < ?) ORDER BY RenTerCod DESC, CodPro DESC, OrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002B8", "INSERT INTO TXPRENFAS(RenTerCod, CodPro, OrdLin, FasCod, RenFasEst, RenFecTeo, RenFecRea, RenFecRIni, RenTieTeo, RenUni, RenLoc, RenHorIni, RenHorFin, RenTieRea, RenMaqCod, RenFasCon, RenFacTin, RenOrdLin, RenFasPri, RenFasKgm, RenFasMtr, RenFasBot, RenNumBot, RenFasFor, RenFasPzas, RenFasCop, RenBarUltL, RenFasCara, RenFasAcab, RenFasGral, RenMaqPlan, RenFasKgT, RenFasMtT, RenFasTip, RenFasSec, RenFasMn, RenfasOP, RenHdMn, RenfasRb, Renfasinc, Renfasdti, Renfasdtf, Renfaskpr, RenfasPpr, Renfasagr, Renfasprp, Renfasfpl, Renfasusu, Renquiul, Renfascr, Rentieaut, Renfasnpl, Renfastpp, Renfasunpl, Renuord, RenHdrO, Renfaspri2, RenObsF, RenObsB) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRENFAS")
         ,new UpdateCursor("T002B9", "UPDATE TXPRENFAS SET FasCod=?, RenFasEst=?, RenFecTeo=?, RenFecRea=?, RenFecRIni=?, RenTieTeo=?, RenUni=?, RenLoc=?, RenHorIni=?, RenHorFin=?, RenTieRea=?, RenMaqCod=?, RenFasCon=?, RenFacTin=?, RenOrdLin=?, RenFasPri=?, RenFasKgm=?, RenFasMtr=?, RenFasBot=?, RenNumBot=?, RenFasFor=?, RenFasPzas=?, RenFasCop=?, RenBarUltL=?, RenFasCara=?, RenFasAcab=?, RenFasGral=?, RenMaqPlan=?, RenFasKgT=?, RenFasMtT=?, RenFasTip=?, RenFasSec=?, RenFasMn=?, RenfasOP=?, RenHdMn=?, RenfasRb=?, Renfasinc=?, Renfasdti=?, Renfasdtf=?, Renfaskpr=?, RenfasPpr=?, Renfasagr=?, Renfasprp=?, Renfasfpl=?, Renfasusu=?, Renquiul=?, Renfascr=?, Rentieaut=?, Renfasnpl=?, Renfastpp=?, Renfasunpl=?, Renuord=?, RenHdrO=?, Renfaspri2=?, RenObsF=?, RenObsB=?  WHERE RenTerCod = ? AND CodPro = ? AND OrdLin = ?", GX_NOMASK, "TXPRENFAS")
         ,new UpdateCursor("T002B10", "DELETE FROM TXPRENFAS  WHERE RenTerCod = ? AND CodPro = ? AND OrdLin = ?", GX_NOMASK, "TXPRENFAS")
         ,new ForEachCursor("T002B11", "SELECT /*+ FIRST_ROWS(100) */ RenTerCod, CodPro, OrdLin FROM TXPRENFAS ORDER BY RenTerCod, CodPro, OrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 10);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((byte[]) buf[75])[0] = rslt.getByte(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[79])[0] = rslt.getGXDateTime(42);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(44);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[89])[0] = rslt.getGXDate(47);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(48, 8);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(49);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(50,5);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((short[]) buf[97])[0] = rslt.getShort(51);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(52);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(55);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(56, 11);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(57);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 10);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((byte[]) buf[75])[0] = rslt.getByte(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[79])[0] = rslt.getGXDateTime(42);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(44);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[89])[0] = rslt.getGXDate(47);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(48, 8);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(49);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(50,5);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((short[]) buf[97])[0] = rslt.getShort(51);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(52);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(55);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(56, 11);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(57);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 10);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((byte[]) buf[75])[0] = rslt.getByte(40);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[79])[0] = rslt.getGXDateTime(42);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(44);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[89])[0] = rslt.getGXDate(47);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(48, 8);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(49);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(50,5);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((short[]) buf[97])[0] = rslt.getShort(51);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(52);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((short[]) buf[105])[0] = rslt.getShort(55);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(56, 11);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((short[]) buf[109])[0] = rslt.getShort(57);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getVarchar(58);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getVarchar(59);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 6);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[46]).intValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[68], 10);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[72], 10);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(40, ((Number) parms[76]).byteValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(41, (java.util.Date)parms[78], false);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(42, (java.util.Date)parms[80], false);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[84]).shortValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[86], 1);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[88], 1);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DATE );
               }
               else
               {
                  stmt.setDate(47, (java.util.Date)parms[90]);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[92], 8);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[96], 5);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[98]).shortValue());
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(52, ((Number) parms[100]).byteValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[102], 2);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[106]).shortValue());
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[108], 11);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[110]).shortValue());
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(58, (String)parms[112], 3000);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[114], 3000);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
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
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 1);
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
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 1);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 6);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 2);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 10);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 10);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[73]).byteValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(38, (java.util.Date)parms[75], false);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(39, (java.util.Date)parms[77], false);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[81]).shortValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[85], 1);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DATE );
               }
               else
               {
                  stmt.setDate(44, (java.util.Date)parms[87]);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 8);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[93], 5);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(49, ((Number) parms[97]).byteValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 11);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(54, ((Number) parms[107]).shortValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[109], 3000);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(56, (String)parms[111], 3000);
               }
               stmt.setString(57, (String)parms[112], 10);
               stmt.setString(58, (String)parms[113], 8);
               stmt.setShort(59, ((Number) parms[114]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

