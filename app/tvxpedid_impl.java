package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxpedid_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A6826VXCliCod = (int)(GXutil.lval( httpContext.GetPar( "VXCliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A6826VXCliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla VERTEX.PEDID y PEDLIN", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxPedTip_Internalname ;
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

   public tvxpedid_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxpedid_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxpedid_impl.class ));
   }

   public tvxpedid_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxPedid.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Tipo Pedido", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPedTip_Internalname, GXutil.rtrim( A14118VxPedTip), GXutil.rtrim( localUtil.format( A14118VxPedTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPedTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxPedTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Pedido", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14119VxPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14119VxPedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14119VxPedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPedCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxPedCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nº Oficial Pedido", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPedNuOf_Internalname, GXutil.ltrim( localUtil.ntoc( A14138VxPedNuOf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxPedNuOf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14138VxPedNuOf), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14138VxPedNuOf), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPedNuOf_Jsonclick, 0, "", "", "", "", "", 1, edtVxPedNuOf_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nº Pedido Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPedCliPe_Internalname, GXutil.rtrim( A14145VxPedCliPe), GXutil.rtrim( localUtil.format( A14145VxPedCliPe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPedCliPe_Jsonclick, 0, "", "", "", "", "", 1, edtVxPedCliPe_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha de Entrega", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVxPedFecEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPedFecEn_Internalname, localUtil.format(A14146VxPedFecEn, "99/99/99"), localUtil.format( A14146VxPedFecEn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPedFecEn_Jsonclick, 0, "", "", "", "", "", 1, edtVxPedFecEn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxPedid.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVxPedFecEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVxPedFecEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVxPedid.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código de Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6826VXCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVXCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6826VXCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6826VXCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtVXCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Observaciones del Pedido", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtVxPedObs_Internalname, A14134VxPedObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", (short)(0), 1, edtVxPedObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cliente Destino", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxPedid.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxPedCliDe_Internalname, GXutil.ltrim( localUtil.ntoc( A14147VxPedCliDe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxPedCliDe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14147VxPedCliDe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14147VxPedCliDe), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxPedCliDe_Jsonclick, 0, "", "", "", "", "", 1, edtVxPedCliDe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxPedid.htm");
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
         nBlankRcdCount1892 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1892 = (short)(1) ;
            scanStart1T91892( ) ;
            while ( RcdFound1892 != 0 )
            {
               init_level_properties1892( ) ;
               getByPrimaryKey1T91892( ) ;
               addRow1T91892( ) ;
               scanNext1T91892( ) ;
            }
            scanEnd1T91892( ) ;
            nBlankRcdCount1892 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1T91892( ) ;
         standaloneModal1T91892( ) ;
         sMode1892 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1T91892( ) ;
            edtavnRcdDeleted_1892_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1892_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1892_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1892_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtVxPedLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxPedLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtVxPedLPUP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLPUP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxPedLPUP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLPUP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtVxPedLPUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLPUL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxPedLPUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLPUL_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtVxPedLClcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLCLCC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxPedLClcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLClcc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtVxPedLCERP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLCERP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxPedLCERP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLCERP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1892 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1T91892( ) ;
            }
            sendRow1T91892( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1892 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1892 = (short)(5) ;
         nRcdExists_1892 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1T91892( ) ;
            while ( RcdFound1892 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601892( ) ;
               init_level_properties1892( ) ;
               standaloneNotModal1T91892( ) ;
               getByPrimaryKey1T91892( ) ;
               standaloneModal1T91892( ) ;
               addRow1T91892( ) ;
               scanNext1T91892( ) ;
            }
            scanEnd1T91892( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1892 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601892( ) ;
      initAll1T91892( ) ;
      init_level_properties1892( ) ;
      nRcdExists_1892 = (short)(0) ;
      nIsMod_1892 = (short)(0) ;
      nRcdDeleted_1892 = (short)(0) ;
      nBlankRcdCount1892 = (short)(nBlankRcdUsr1892+nBlankRcdCount1892) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1892 > 0 )
      {
         standaloneNotModal1T91892( ) ;
         standaloneModal1T91892( ) ;
         addRow1T91892( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVxPedLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1892 = (short)(nBlankRcdCount1892-1) ;
      }
      Gx_mode = sMode1892 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxPedid.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxPedid.htm");
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
         Z14118VxPedTip = httpContext.cgiGet( "Z14118VxPedTip") ;
         Z14119VxPedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14119VxPedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14138VxPedNuOf = (int)(localUtil.ctol( httpContext.cgiGet( "Z14138VxPedNuOf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14145VxPedCliPe = httpContext.cgiGet( "Z14145VxPedCliPe") ;
         Z14146VxPedFecEn = localUtil.ctod( httpContext.cgiGet( "Z14146VxPedFecEn"), 0) ;
         Z14134VxPedObs = httpContext.cgiGet( "Z14134VxPedObs") ;
         Z14147VxPedCliDe = (int)(localUtil.ctol( httpContext.cgiGet( "Z14147VxPedCliDe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6826VXCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z6826VXCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A14118VxPedTip = httpContext.cgiGet( edtVxPedTip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXPEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14119VxPedCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
         }
         else
         {
            A14119VxPedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedNuOf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedNuOf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXPEDNUOF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxPedNuOf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14138VxPedNuOf = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14138VxPedNuOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14138VxPedNuOf), 8, 0));
         }
         else
         {
            A14138VxPedNuOf = (int)(localUtil.ctol( httpContext.cgiGet( edtVxPedNuOf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14138VxPedNuOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14138VxPedNuOf), 8, 0));
         }
         A14145VxPedCliPe = httpContext.cgiGet( edtVxPedCliPe_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14145VxPedCliPe", A14145VxPedCliPe);
         if ( localUtil.vcdate( httpContext.cgiGet( edtVxPedFecEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VXPEDFECEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxPedFecEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14146VxPedFecEn = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A14146VxPedFecEn", localUtil.format(A14146VxPedFecEn, "99/99/99"));
         }
         else
         {
            A14146VxPedFecEn = localUtil.ctod( httpContext.cgiGet( edtVxPedFecEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14146VxPedFecEn", localUtil.format(A14146VxPedFecEn, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVXCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6826VXCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         }
         else
         {
            A6826VXCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         }
         A14134VxPedObs = httpContext.cgiGet( edtVxPedObs_Internalname) ;
         n14134VxPedObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14134VxPedObs", A14134VxPedObs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXPEDCLIDE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxPedCliDe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14147VxPedCliDe = 0 ;
            n14147VxPedCliDe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14147VxPedCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14147VxPedCliDe), 6, 0));
         }
         else
         {
            A14147VxPedCliDe = (int)(localUtil.ctol( httpContext.cgiGet( edtVxPedCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14147VxPedCliDe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14147VxPedCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14147VxPedCliDe), 6, 0));
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
            A14118VxPedTip = httpContext.GetPar( "VxPedTip") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
            A14119VxPedCod = (int)(GXutil.lval( httpContext.GetPar( "VxPedCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
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
            initAll1T91891( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1892_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1892_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1T91891( ) ;
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

   public void confirm_1T90( )
   {
      beforeValidate1T91891( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T91891( ) ;
         }
         else
         {
            checkExtendedTable1T91891( ) ;
            if ( AnyError == 0 )
            {
               zm1T91891( 2) ;
            }
            closeExtendedTableCursors1T91891( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1891 = Gx_mode ;
         confirm_1T91892( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1891 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1891 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1T90( ) ;
      }
   }

   public void confirm_1T91892( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1T91892( ) ;
         if ( ( nRcdExists_1892 != 0 ) || ( nIsMod_1892 != 0 ) )
         {
            getKey1T91892( ) ;
            if ( ( nRcdExists_1892 == 0 ) && ( nRcdDeleted_1892 == 0 ) )
            {
               if ( RcdFound1892 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1T91892( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1T91892( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1T91892( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VXPEDLIN_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxPedLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1892 != 0 )
               {
                  if ( nRcdDeleted_1892 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1T91892( ) ;
                     load1T91892( ) ;
                     beforeValidate1T91892( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1T91892( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1892 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1T91892( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1T91892( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1T91892( ) ;
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
                  if ( nRcdDeleted_1892 == 0 )
                  {
                     GXCCtl = "VXPEDLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxPedLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1892_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14120VxPedLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLPUP_Internalname, GXutil.ltrim( localUtil.ntoc( A14148VxPedLPUP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLPUL_Internalname, GXutil.ltrim( localUtil.ntoc( A14149VxPedLPUL, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLClcc_Internalname, GXutil.ltrim( localUtil.ntoc( A14150VxPedLClcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLCERP_Internalname, GXutil.ltrim( localUtil.ntoc( A14151VxPedLCERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14120VxPedLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14120VxPedLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14148VxPedLPUP_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14148VxPedLPUP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14149VxPedLPUL_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14149VxPedLPUL, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14150VxPedLClcc_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14150VxPedLClcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14151VxPedLCERP_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14151VxPedLCERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1892_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1892_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1892_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1892 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1892_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1892_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLPUP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLPUL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLCLCC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLClcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLCERP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLCERP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1T90( )
   {
   }

   public void zm1T91891( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14138VxPedNuOf = T01T95_A14138VxPedNuOf[0] ;
            Z14145VxPedCliPe = T01T95_A14145VxPedCliPe[0] ;
            Z14146VxPedFecEn = T01T95_A14146VxPedFecEn[0] ;
            Z14134VxPedObs = T01T95_A14134VxPedObs[0] ;
            Z14147VxPedCliDe = T01T95_A14147VxPedCliDe[0] ;
            Z6826VXCliCod = T01T95_A6826VXCliCod[0] ;
         }
         else
         {
            Z14138VxPedNuOf = A14138VxPedNuOf ;
            Z14145VxPedCliPe = A14145VxPedCliPe ;
            Z14146VxPedFecEn = A14146VxPedFecEn ;
            Z14134VxPedObs = A14134VxPedObs ;
            Z14147VxPedCliDe = A14147VxPedCliDe ;
            Z6826VXCliCod = A6826VXCliCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14118VxPedTip = A14118VxPedTip ;
         Z14119VxPedCod = A14119VxPedCod ;
         Z14138VxPedNuOf = A14138VxPedNuOf ;
         Z14145VxPedCliPe = A14145VxPedCliPe ;
         Z14146VxPedFecEn = A14146VxPedFecEn ;
         Z14134VxPedObs = A14134VxPedObs ;
         Z14147VxPedCliDe = A14147VxPedCliDe ;
         Z6826VXCliCod = A6826VXCliCod ;
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

   public void load1T91891( )
   {
      /* Using cursor T01T97 */
      pr_vertex.execute(2, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
      if ( (pr_vertex.getStatus(2) != 101) )
      {
         RcdFound1891 = (short)(1) ;
         A14138VxPedNuOf = T01T97_A14138VxPedNuOf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14138VxPedNuOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14138VxPedNuOf), 8, 0));
         A14145VxPedCliPe = T01T97_A14145VxPedCliPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14145VxPedCliPe", A14145VxPedCliPe);
         A14146VxPedFecEn = T01T97_A14146VxPedFecEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14146VxPedFecEn", localUtil.format(A14146VxPedFecEn, "99/99/99"));
         A14134VxPedObs = T01T97_A14134VxPedObs[0] ;
         n14134VxPedObs = T01T97_n14134VxPedObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14134VxPedObs", A14134VxPedObs);
         A14147VxPedCliDe = T01T97_A14147VxPedCliDe[0] ;
         n14147VxPedCliDe = T01T97_n14147VxPedCliDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14147VxPedCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14147VxPedCliDe), 6, 0));
         A6826VXCliCod = T01T97_A6826VXCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         zm1T91891( -1) ;
      }
      pr_vertex.close(2);
      onLoadActions1T91891( ) ;
   }

   public void onLoadActions1T91891( )
   {
   }

   public void checkExtendedTable1T91891( )
   {
      nIsDirty_1891 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01T96 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A6826VXCliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VXCLien", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVXCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1T91891( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A6826VXCliCod )
   {
      /* Using cursor T01T98 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A6826VXCliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VXCLien", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVXCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1T91891( )
   {
      /* Using cursor T01T99 */
      pr_vertex.execute(3, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
      if ( (pr_vertex.getStatus(3) != 101) )
      {
         RcdFound1891 = (short)(1) ;
      }
      else
      {
         RcdFound1891 = (short)(0) ;
      }
      pr_vertex.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T95 */
      pr_vertex.execute(1, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
      if ( (pr_vertex.getStatus(1) != 101) )
      {
         zm1T91891( 1) ;
         RcdFound1891 = (short)(1) ;
         A14118VxPedTip = T01T95_A14118VxPedTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
         A14119VxPedCod = T01T95_A14119VxPedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
         A14138VxPedNuOf = T01T95_A14138VxPedNuOf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14138VxPedNuOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14138VxPedNuOf), 8, 0));
         A14145VxPedCliPe = T01T95_A14145VxPedCliPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14145VxPedCliPe", A14145VxPedCliPe);
         A14146VxPedFecEn = T01T95_A14146VxPedFecEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14146VxPedFecEn", localUtil.format(A14146VxPedFecEn, "99/99/99"));
         A14134VxPedObs = T01T95_A14134VxPedObs[0] ;
         n14134VxPedObs = T01T95_n14134VxPedObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14134VxPedObs", A14134VxPedObs);
         A14147VxPedCliDe = T01T95_A14147VxPedCliDe[0] ;
         n14147VxPedCliDe = T01T95_n14147VxPedCliDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14147VxPedCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14147VxPedCliDe), 6, 0));
         A6826VXCliCod = T01T95_A6826VXCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
         Z14118VxPedTip = A14118VxPedTip ;
         Z14119VxPedCod = A14119VxPedCod ;
         sMode1891 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1T91891( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1891 = (short)(0) ;
            initializeNonKey1T91891( ) ;
         }
         Gx_mode = sMode1891 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1891 = (short)(0) ;
         initializeNonKey1T91891( ) ;
         sMode1891 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1891 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_vertex.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1T91891( ) ;
      if ( RcdFound1891 == 0 )
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
      RcdFound1891 = (short)(0) ;
      /* Using cursor T01T910 */
      pr_vertex.execute(4, new Object[] {A14118VxPedTip, A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
      if ( (pr_vertex.getStatus(4) != 101) )
      {
         while ( (pr_vertex.getStatus(4) != 101) && ( ( GXutil.strcmp(T01T910_A14118VxPedTip[0], A14118VxPedTip) < 0 ) || ( GXutil.strcmp(T01T910_A14118VxPedTip[0], A14118VxPedTip) == 0 ) && ( T01T910_A14119VxPedCod[0] < A14119VxPedCod ) ) )
         {
            pr_vertex.readNext(4);
         }
         if ( (pr_vertex.getStatus(4) != 101) && ( ( GXutil.strcmp(T01T910_A14118VxPedTip[0], A14118VxPedTip) > 0 ) || ( GXutil.strcmp(T01T910_A14118VxPedTip[0], A14118VxPedTip) == 0 ) && ( T01T910_A14119VxPedCod[0] > A14119VxPedCod ) ) )
         {
            A14118VxPedTip = T01T910_A14118VxPedTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
            A14119VxPedCod = T01T910_A14119VxPedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
            RcdFound1891 = (short)(1) ;
         }
      }
      pr_vertex.close(4);
   }

   public void move_previous( )
   {
      RcdFound1891 = (short)(0) ;
      /* Using cursor T01T911 */
      pr_vertex.execute(5, new Object[] {A14118VxPedTip, A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
      if ( (pr_vertex.getStatus(5) != 101) )
      {
         while ( (pr_vertex.getStatus(5) != 101) && ( ( GXutil.strcmp(T01T911_A14118VxPedTip[0], A14118VxPedTip) > 0 ) || ( GXutil.strcmp(T01T911_A14118VxPedTip[0], A14118VxPedTip) == 0 ) && ( T01T911_A14119VxPedCod[0] > A14119VxPedCod ) ) )
         {
            pr_vertex.readNext(5);
         }
         if ( (pr_vertex.getStatus(5) != 101) && ( ( GXutil.strcmp(T01T911_A14118VxPedTip[0], A14118VxPedTip) < 0 ) || ( GXutil.strcmp(T01T911_A14118VxPedTip[0], A14118VxPedTip) == 0 ) && ( T01T911_A14119VxPedCod[0] < A14119VxPedCod ) ) )
         {
            A14118VxPedTip = T01T911_A14118VxPedTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
            A14119VxPedCod = T01T911_A14119VxPedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
            RcdFound1891 = (short)(1) ;
         }
      }
      pr_vertex.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T91891( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxPedTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T91891( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1891 == 1 )
         {
            if ( ( GXutil.strcmp(A14118VxPedTip, Z14118VxPedTip) != 0 ) || ( A14119VxPedCod != Z14119VxPedCod ) )
            {
               A14118VxPedTip = Z14118VxPedTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
               A14119VxPedCod = Z14119VxPedCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXPEDTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxPedTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxPedTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1T91891( ) ;
               GX_FocusControl = edtVxPedTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A14118VxPedTip, Z14118VxPedTip) != 0 ) || ( A14119VxPedCod != Z14119VxPedCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxPedTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T91891( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXPEDTIP");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxPedTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxPedTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T91891( ) ;
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
      if ( ( GXutil.strcmp(A14118VxPedTip, Z14118VxPedTip) != 0 ) || ( A14119VxPedCod != Z14119VxPedCod ) )
      {
         A14118VxPedTip = Z14118VxPedTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
         A14119VxPedCod = Z14119VxPedCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXPEDTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxPedTip_Internalname ;
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
      getKey1T91891( ) ;
      if ( RcdFound1891 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXPEDTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxPedTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A14118VxPedTip, Z14118VxPedTip) != 0 ) || ( A14119VxPedCod != Z14119VxPedCod ) )
         {
            A14118VxPedTip = Z14118VxPedTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
            A14119VxPedCod = Z14119VxPedCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXPEDTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxPedTip_Internalname ;
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
         if ( ( GXutil.strcmp(A14118VxPedTip, Z14118VxPedTip) != 0 ) || ( A14119VxPedCod != Z14119VxPedCod ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXPEDTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxPedTip_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxpedid");
      GX_FocusControl = edtVxPedNuOf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1T90( ) ;
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
      if ( RcdFound1891 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXPEDTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxPedNuOf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1T91891( ) ;
      if ( RcdFound1891 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxPedNuOf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1T91891( ) ;
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
      if ( RcdFound1891 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxPedNuOf_Internalname ;
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
      if ( RcdFound1891 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxPedNuOf_Internalname ;
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
      scanStart1T91891( ) ;
      if ( RcdFound1891 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1891 != 0 )
         {
            scanNext1T91891( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxPedNuOf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1T91891( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1T91891( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T94 */
         pr_vertex.execute(0, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
         if ( (pr_vertex.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"PEDID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_vertex.getStatus(0) == 101) || ( Z14138VxPedNuOf != T01T94_A14138VxPedNuOf[0] ) || ( GXutil.strcmp(Z14145VxPedCliPe, T01T94_A14145VxPedCliPe[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z14146VxPedFecEn), GXutil.resetTime(T01T94_A14146VxPedFecEn[0])) ) || ( GXutil.strcmp(Z14134VxPedObs, T01T94_A14134VxPedObs[0]) != 0 ) || ( Z14147VxPedCliDe != T01T94_A14147VxPedCliDe[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6826VXCliCod != T01T94_A6826VXCliCod[0] ) )
         {
            if ( Z14138VxPedNuOf != T01T94_A14138VxPedNuOf[0] )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedNuOf");
               GXutil.writeLogRaw("Old: ",Z14138VxPedNuOf);
               GXutil.writeLogRaw("Current: ",T01T94_A14138VxPedNuOf[0]);
            }
            if ( GXutil.strcmp(Z14145VxPedCliPe, T01T94_A14145VxPedCliPe[0]) != 0 )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedCliPe");
               GXutil.writeLogRaw("Old: ",Z14145VxPedCliPe);
               GXutil.writeLogRaw("Current: ",T01T94_A14145VxPedCliPe[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14146VxPedFecEn), GXutil.resetTime(T01T94_A14146VxPedFecEn[0])) ) )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedFecEn");
               GXutil.writeLogRaw("Old: ",Z14146VxPedFecEn);
               GXutil.writeLogRaw("Current: ",T01T94_A14146VxPedFecEn[0]);
            }
            if ( GXutil.strcmp(Z14134VxPedObs, T01T94_A14134VxPedObs[0]) != 0 )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedObs");
               GXutil.writeLogRaw("Old: ",Z14134VxPedObs);
               GXutil.writeLogRaw("Current: ",T01T94_A14134VxPedObs[0]);
            }
            if ( Z14147VxPedCliDe != T01T94_A14147VxPedCliDe[0] )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedCliDe");
               GXutil.writeLogRaw("Old: ",Z14147VxPedCliDe);
               GXutil.writeLogRaw("Current: ",T01T94_A14147VxPedCliDe[0]);
            }
            if ( Z6826VXCliCod != T01T94_A6826VXCliCod[0] )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VXCliCod");
               GXutil.writeLogRaw("Old: ",Z6826VXCliCod);
               GXutil.writeLogRaw("Current: ",T01T94_A6826VXCliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"PEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T91891( )
   {
      beforeValidate1T91891( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T91891( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T91891( 0) ;
         checkOptimisticConcurrency1T91891( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T91891( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T91891( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T912 */
                  pr_vertex.execute(6, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Integer.valueOf(A14138VxPedNuOf), A14145VxPedCliPe, A14146VxPedFecEn, Boolean.valueOf(n14134VxPedObs), A14134VxPedObs, Boolean.valueOf(n14147VxPedCliDe), Integer.valueOf(A14147VxPedCliDe), Integer.valueOf(A6826VXCliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("PEDID");
                  if ( (pr_vertex.getStatus(6) == 1) )
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
                        processLevel1T91891( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1T90( ) ;
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
            load1T91891( ) ;
         }
         endLevel1T91891( ) ;
      }
      closeExtendedTableCursors1T91891( ) ;
   }

   public void update1T91891( )
   {
      beforeValidate1T91891( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T91891( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T91891( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T91891( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T91891( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T913 */
                  pr_vertex.execute(7, new Object[] {Integer.valueOf(A14138VxPedNuOf), A14145VxPedCliPe, A14146VxPedFecEn, Boolean.valueOf(n14134VxPedObs), A14134VxPedObs, Boolean.valueOf(n14147VxPedCliDe), Integer.valueOf(A14147VxPedCliDe), Integer.valueOf(A6826VXCliCod), A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("PEDID");
                  if ( (pr_vertex.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"PEDID"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T91891( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1T91891( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1T90( ) ;
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
         endLevel1T91891( ) ;
      }
      closeExtendedTableCursors1T91891( ) ;
   }

   public void deferredUpdate1T91891( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1T91891( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T91891( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T91891( ) ;
         afterConfirm1T91891( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T91891( ) ;
            if ( AnyError == 0 )
            {
               scanStart1T91892( ) ;
               while ( RcdFound1892 != 0 )
               {
                  getByPrimaryKey1T91892( ) ;
                  delete1T91892( ) ;
                  scanNext1T91892( ) ;
               }
               scanEnd1T91892( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T914 */
                  pr_vertex.execute(8, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("PEDID");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1891 == 0 )
                        {
                           initAll1T91891( ) ;
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
                        resetCaption1T90( ) ;
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
      sMode1891 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T91891( ) ;
      Gx_mode = sMode1891 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T91891( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1T91892( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1T91892( ) ;
         if ( ( nRcdExists_1892 != 0 ) || ( nIsMod_1892 != 0 ) )
         {
            standaloneNotModal1T91892( ) ;
            getKey1T91892( ) ;
            if ( ( nRcdExists_1892 == 0 ) && ( nRcdDeleted_1892 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1T91892( ) ;
            }
            else
            {
               if ( RcdFound1892 != 0 )
               {
                  if ( ( nRcdDeleted_1892 != 0 ) && ( nRcdExists_1892 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1T91892( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1892 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1T91892( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1892 == 0 )
                  {
                     GXCCtl = "VXPEDLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxPedLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1892_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14120VxPedLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLPUP_Internalname, GXutil.ltrim( localUtil.ntoc( A14148VxPedLPUP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLPUL_Internalname, GXutil.ltrim( localUtil.ntoc( A14149VxPedLPUL, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLClcc_Internalname, GXutil.ltrim( localUtil.ntoc( A14150VxPedLClcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxPedLCERP_Internalname, GXutil.ltrim( localUtil.ntoc( A14151VxPedLCERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14120VxPedLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14120VxPedLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14148VxPedLPUP_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14148VxPedLPUP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14149VxPedLPUL_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14149VxPedLPUL, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14150VxPedLClcc_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14150VxPedLClcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14151VxPedLCERP_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z14151VxPedLCERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1892_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1892_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1892_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1892 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1892_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1892_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLPUP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLPUL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLCLCC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLClcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXPEDLCERP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLCERP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1T91892( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1892 = (short)(0) ;
      nIsMod_1892 = (short)(0) ;
      nRcdDeleted_1892 = (short)(0) ;
   }

   public void processLevel1T91891( )
   {
      /* Save parent mode. */
      sMode1891 = Gx_mode ;
      processNestedLevel1T91892( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1891 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1T91891( )
   {
      if ( ! isIns( ) )
      {
         pr_vertex.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1T91891( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxpedid");
         if ( AnyError == 0 )
         {
            confirmValues1T90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxpedid");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T91891( )
   {
      /* Using cursor T01T915 */
      pr_vertex.execute(9);
      RcdFound1891 = (short)(0) ;
      if ( (pr_vertex.getStatus(9) != 101) )
      {
         RcdFound1891 = (short)(1) ;
         A14118VxPedTip = T01T915_A14118VxPedTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
         A14119VxPedCod = T01T915_A14119VxPedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T91891( )
   {
      /* Scan next routine */
      pr_vertex.readNext(9);
      RcdFound1891 = (short)(0) ;
      if ( (pr_vertex.getStatus(9) != 101) )
      {
         RcdFound1891 = (short)(1) ;
         A14118VxPedTip = T01T915_A14118VxPedTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
         A14119VxPedCod = T01T915_A14119VxPedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
      }
   }

   public void scanEnd1T91891( )
   {
      pr_vertex.close(9);
   }

   public void afterConfirm1T91891( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T91891( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T91891( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T91891( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T91891( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T91891( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T91891( )
   {
      edtVxPedTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedTip_Enabled), 5, 0), true);
      edtVxPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedCod_Enabled), 5, 0), true);
      edtVxPedNuOf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedNuOf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedNuOf_Enabled), 5, 0), true);
      edtVxPedCliPe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedCliPe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedCliPe_Enabled), 5, 0), true);
      edtVxPedFecEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedFecEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedFecEn_Enabled), 5, 0), true);
      edtVXCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXCliCod_Enabled), 5, 0), true);
      edtVxPedObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedObs_Enabled), 5, 0), true);
      edtVxPedCliDe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedCliDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedCliDe_Enabled), 5, 0), true);
   }

   public void zm1T91892( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14148VxPedLPUP = T01T93_A14148VxPedLPUP[0] ;
            Z14149VxPedLPUL = T01T93_A14149VxPedLPUL[0] ;
            Z14150VxPedLClcc = T01T93_A14150VxPedLClcc[0] ;
            Z14151VxPedLCERP = T01T93_A14151VxPedLCERP[0] ;
         }
         else
         {
            Z14148VxPedLPUP = A14148VxPedLPUP ;
            Z14149VxPedLPUL = A14149VxPedLPUL ;
            Z14150VxPedLClcc = A14150VxPedLClcc ;
            Z14151VxPedLCERP = A14151VxPedLCERP ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z14118VxPedTip = A14118VxPedTip ;
         Z14119VxPedCod = A14119VxPedCod ;
         Z14120VxPedLin = A14120VxPedLin ;
         Z14148VxPedLPUP = A14148VxPedLPUP ;
         Z14149VxPedLPUL = A14149VxPedLPUL ;
         Z14150VxPedLClcc = A14150VxPedLClcc ;
         Z14151VxPedLCERP = A14151VxPedLCERP ;
      }
   }

   public void standaloneNotModal1T91892( )
   {
   }

   public void standaloneModal1T91892( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVxPedLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxPedLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtVxPedLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxPedLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1T91892( )
   {
      /* Using cursor T01T916 */
      pr_default.execute(4, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1892 = (short)(1) ;
         A14148VxPedLPUP = T01T916_A14148VxPedLPUP[0] ;
         n14148VxPedLPUP = T01T916_n14148VxPedLPUP[0] ;
         A14149VxPedLPUL = T01T916_A14149VxPedLPUL[0] ;
         n14149VxPedLPUL = T01T916_n14149VxPedLPUL[0] ;
         A14150VxPedLClcc = T01T916_A14150VxPedLClcc[0] ;
         n14150VxPedLClcc = T01T916_n14150VxPedLClcc[0] ;
         A14151VxPedLCERP = T01T916_A14151VxPedLCERP[0] ;
         n14151VxPedLCERP = T01T916_n14151VxPedLCERP[0] ;
         zm1T91892( -3) ;
      }
      pr_default.close(4);
      onLoadActions1T91892( ) ;
   }

   public void onLoadActions1T91892( )
   {
   }

   public void checkExtendedTable1T91892( )
   {
      nIsDirty_1892 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1T91892( ) ;
   }

   public void closeExtendedTableCursors1T91892( )
   {
   }

   public void enableDisable1T91892( )
   {
   }

   public void getKey1T91892( )
   {
      /* Using cursor T01T917 */
      pr_default.execute(5, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1892 = (short)(1) ;
      }
      else
      {
         RcdFound1892 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey1T91892( )
   {
      /* Using cursor T01T93 */
      pr_default.execute(1, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1T91892( 3) ;
         RcdFound1892 = (short)(1) ;
         initializeNonKey1T91892( ) ;
         A14120VxPedLin = T01T93_A14120VxPedLin[0] ;
         A14148VxPedLPUP = T01T93_A14148VxPedLPUP[0] ;
         n14148VxPedLPUP = T01T93_n14148VxPedLPUP[0] ;
         A14149VxPedLPUL = T01T93_A14149VxPedLPUL[0] ;
         n14149VxPedLPUL = T01T93_n14149VxPedLPUL[0] ;
         A14150VxPedLClcc = T01T93_A14150VxPedLClcc[0] ;
         n14150VxPedLClcc = T01T93_n14150VxPedLClcc[0] ;
         A14151VxPedLCERP = T01T93_A14151VxPedLCERP[0] ;
         n14151VxPedLCERP = T01T93_n14151VxPedLCERP[0] ;
         Z14118VxPedTip = A14118VxPedTip ;
         Z14119VxPedCod = A14119VxPedCod ;
         Z14120VxPedLin = A14120VxPedLin ;
         sMode1892 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1T91892( ) ;
         load1T91892( ) ;
         Gx_mode = sMode1892 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1892 = (short)(0) ;
         initializeNonKey1T91892( ) ;
         sMode1892 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1T91892( ) ;
         Gx_mode = sMode1892 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1T91892( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1T91892( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T92 */
         pr_default.execute(0, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VxPedLin"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z14148VxPedLPUP, T01T92_A14148VxPedLPUP[0]) != 0 ) || ( DecimalUtil.compareTo(Z14149VxPedLPUL, T01T92_A14149VxPedLPUL[0]) != 0 ) || ( Z14150VxPedLClcc != T01T92_A14150VxPedLClcc[0] ) || ( Z14151VxPedLCERP != T01T92_A14151VxPedLCERP[0] ) )
         {
            if ( DecimalUtil.compareTo(Z14148VxPedLPUP, T01T92_A14148VxPedLPUP[0]) != 0 )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedLPUP");
               GXutil.writeLogRaw("Old: ",Z14148VxPedLPUP);
               GXutil.writeLogRaw("Current: ",T01T92_A14148VxPedLPUP[0]);
            }
            if ( DecimalUtil.compareTo(Z14149VxPedLPUL, T01T92_A14149VxPedLPUL[0]) != 0 )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedLPUL");
               GXutil.writeLogRaw("Old: ",Z14149VxPedLPUL);
               GXutil.writeLogRaw("Current: ",T01T92_A14149VxPedLPUL[0]);
            }
            if ( Z14150VxPedLClcc != T01T92_A14150VxPedLClcc[0] )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedLClcc");
               GXutil.writeLogRaw("Old: ",Z14150VxPedLClcc);
               GXutil.writeLogRaw("Current: ",T01T92_A14150VxPedLClcc[0]);
            }
            if ( Z14151VxPedLCERP != T01T92_A14151VxPedLCERP[0] )
            {
               GXutil.writeLogln("tvxpedid:[seudo value changed for attri]"+"VxPedLCERP");
               GXutil.writeLogRaw("Old: ",Z14151VxPedLCERP);
               GXutil.writeLogRaw("Current: ",T01T92_A14151VxPedLCERP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VxPedLin"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T91892( )
   {
      beforeValidate1T91892( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T91892( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T91892( 0) ;
         checkOptimisticConcurrency1T91892( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T91892( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T91892( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T918 */
                  pr_default.execute(6, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin), Boolean.valueOf(n14148VxPedLPUP), A14148VxPedLPUP, Boolean.valueOf(n14149VxPedLPUL), A14149VxPedLPUL, Boolean.valueOf(n14150VxPedLClcc), Short.valueOf(A14150VxPedLClcc), Boolean.valueOf(n14151VxPedLCERP), Long.valueOf(A14151VxPedLCERP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VxPedLin");
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
            load1T91892( ) ;
         }
         endLevel1T91892( ) ;
      }
      closeExtendedTableCursors1T91892( ) ;
   }

   public void update1T91892( )
   {
      beforeValidate1T91892( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T91892( ) ;
      }
      if ( ( nIsMod_1892 != 0 ) || ( nIsDirty_1892 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1T91892( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1T91892( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1T91892( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01T919 */
                     pr_default.execute(7, new Object[] {Boolean.valueOf(n14148VxPedLPUP), A14148VxPedLPUP, Boolean.valueOf(n14149VxPedLPUL), A14149VxPedLPUL, Boolean.valueOf(n14150VxPedLClcc), Short.valueOf(A14150VxPedLClcc), Boolean.valueOf(n14151VxPedLCERP), Long.valueOf(A14151VxPedLCERP), A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("VxPedLin");
                     if ( (pr_default.getStatus(7) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VxPedLin"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1T91892( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1T91892( ) ;
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
            endLevel1T91892( ) ;
         }
      }
      closeExtendedTableCursors1T91892( ) ;
   }

   public void deferredUpdate1T91892( )
   {
   }

   public void delete1T91892( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1T91892( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T91892( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T91892( ) ;
         afterConfirm1T91892( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T91892( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T920 */
               pr_default.execute(8, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod), Short.valueOf(A14120VxPedLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VxPedLin");
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
      sMode1892 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T91892( ) ;
      Gx_mode = sMode1892 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T91892( )
   {
      standaloneModal1T91892( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1T91892( )
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

   public void scanStart1T91892( )
   {
      /* Scan By routine */
      /* Using cursor T01T921 */
      pr_default.execute(9, new Object[] {A14118VxPedTip, Integer.valueOf(A14119VxPedCod)});
      RcdFound1892 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1892 = (short)(1) ;
         A14120VxPedLin = T01T921_A14120VxPedLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T91892( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1892 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1892 = (short)(1) ;
         A14120VxPedLin = T01T921_A14120VxPedLin[0] ;
      }
   }

   public void scanEnd1T91892( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1T91892( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T91892( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T91892( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T91892( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T91892( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T91892( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T91892( )
   {
      edtVxPedLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtVxPedLPUP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedLPUP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLPUP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtVxPedLPUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedLPUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLPUL_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtVxPedLClcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedLClcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLClcc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtVxPedLCERP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedLCERP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLCERP_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1T91892( )
   {
   }

   public void send_integrity_lvl_hashes1T91891( )
   {
   }

   public void subsflControlProps_601892( )
   {
      edtavnRcdDeleted_1892_Internalname = "vNRCDDELETED_1892_"+sGXsfl_60_idx ;
      edtVxPedLin_Internalname = "VXPEDLIN_"+sGXsfl_60_idx ;
      edtVxPedLPUP_Internalname = "VXPEDLPUP_"+sGXsfl_60_idx ;
      edtVxPedLPUL_Internalname = "VXPEDLPUL_"+sGXsfl_60_idx ;
      edtVxPedLClcc_Internalname = "VXPEDLCLCC_"+sGXsfl_60_idx ;
      edtVxPedLCERP_Internalname = "VXPEDLCERP_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601892( )
   {
      edtavnRcdDeleted_1892_Internalname = "vNRCDDELETED_1892_"+sGXsfl_60_fel_idx ;
      edtVxPedLin_Internalname = "VXPEDLIN_"+sGXsfl_60_fel_idx ;
      edtVxPedLPUP_Internalname = "VXPEDLPUP_"+sGXsfl_60_fel_idx ;
      edtVxPedLPUL_Internalname = "VXPEDLPUL_"+sGXsfl_60_fel_idx ;
      edtVxPedLClcc_Internalname = "VXPEDLCLCC_"+sGXsfl_60_fel_idx ;
      edtVxPedLCERP_Internalname = "VXPEDLCERP_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1T91892( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601892( ) ;
      sendRow1T91892( ) ;
   }

   public void sendRow1T91892( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1892_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1892_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1892_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1892), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1892), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1892_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1892_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1892_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxPedLin_Internalname,GXutil.ltrim( localUtil.ntoc( A14120VxPedLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14120VxPedLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxPedLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxPedLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1892_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxPedLPUP_Internalname,GXutil.ltrim( localUtil.ntoc( A14148VxPedLPUP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxPedLPUP_Enabled!=0) ? localUtil.format( A14148VxPedLPUP, "ZZZZZ9.99") : localUtil.format( A14148VxPedLPUP, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxPedLPUP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxPedLPUP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1892_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxPedLPUL_Internalname,GXutil.ltrim( localUtil.ntoc( A14149VxPedLPUL, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxPedLPUL_Enabled!=0) ? localUtil.format( A14149VxPedLPUL, "ZZZZZ9.99") : localUtil.format( A14149VxPedLPUL, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxPedLPUL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxPedLPUL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1892_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxPedLClcc_Internalname,GXutil.ltrim( localUtil.ntoc( A14150VxPedLClcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxPedLClcc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14150VxPedLClcc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14150VxPedLClcc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxPedLClcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxPedLClcc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1892_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxPedLCERP_Internalname,GXutil.ltrim( localUtil.ntoc( A14151VxPedLCERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxPedLCERP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14151VxPedLCERP), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14151VxPedLCERP), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxPedLCERP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxPedLCERP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1T91892( ) ;
      GXCCtl = "Z14120VxPedLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14120VxPedLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14148VxPedLPUP_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14148VxPedLPUP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14149VxPedLPUL_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14149VxPedLPUL, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14150VxPedLClcc_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14150VxPedLClcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14151VxPedLCERP_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14151VxPedLCERP, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1892_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1892_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1892_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1892, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1892_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1892_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXPEDLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXPEDLPUP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXPEDLPUL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXPEDLCLCC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLClcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXPEDLCERP_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLCERP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1T91892( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601892( ) ;
      edtavnRcdDeleted_1892_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1892_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxPedLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxPedLPUP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLPUP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxPedLPUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLPUL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxPedLClcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLCLCC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxPedLCERP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXPEDLCERP_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1892_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1892_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1892");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1892_Internalname ;
         wbErr = true ;
         nRcdDeleted_1892 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1892 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1892_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "VXPEDLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedLin_Internalname ;
         wbErr = true ;
         A14120VxPedLin = (short)(0) ;
      }
      else
      {
         A14120VxPedLin = (short)(localUtil.ctol( httpContext.cgiGet( edtVxPedLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxPedLPUP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxPedLPUP_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "VXPEDLPUP_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedLPUP_Internalname ;
         wbErr = true ;
         A14148VxPedLPUP = DecimalUtil.ZERO ;
         n14148VxPedLPUP = false ;
      }
      else
      {
         A14148VxPedLPUP = localUtil.ctond( httpContext.cgiGet( edtVxPedLPUP_Internalname)) ;
         n14148VxPedLPUP = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxPedLPUL_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxPedLPUL_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "VXPEDLPUL_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedLPUL_Internalname ;
         wbErr = true ;
         A14149VxPedLPUL = DecimalUtil.ZERO ;
         n14149VxPedLPUL = false ;
      }
      else
      {
         A14149VxPedLPUL = localUtil.ctond( httpContext.cgiGet( edtVxPedLPUL_Internalname)) ;
         n14149VxPedLPUL = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedLClcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedLClcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VXPEDLCLCC_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedLClcc_Internalname ;
         wbErr = true ;
         A14150VxPedLClcc = (short)(0) ;
         n14150VxPedLClcc = false ;
      }
      else
      {
         A14150VxPedLClcc = (short)(localUtil.ctol( httpContext.cgiGet( edtVxPedLClcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14150VxPedLClcc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedLCERP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxPedLCERP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
      {
         GXCCtl = "VXPEDLCERP_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxPedLCERP_Internalname ;
         wbErr = true ;
         A14151VxPedLCERP = 0 ;
         n14151VxPedLCERP = false ;
      }
      else
      {
         A14151VxPedLCERP = localUtil.ctol( httpContext.cgiGet( edtVxPedLCERP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14151VxPedLCERP = false ;
      }
      GXCCtl = "Z14120VxPedLin_" + sGXsfl_60_idx ;
      Z14120VxPedLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14148VxPedLPUP_" + sGXsfl_60_idx ;
      Z14148VxPedLPUP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14149VxPedLPUL_" + sGXsfl_60_idx ;
      Z14149VxPedLPUL = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14150VxPedLClcc_" + sGXsfl_60_idx ;
      Z14150VxPedLClcc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14151VxPedLCERP_" + sGXsfl_60_idx ;
      Z14151VxPedLCERP = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "nRcdDeleted_1892_" + sGXsfl_60_idx ;
      nRcdDeleted_1892 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1892_" + sGXsfl_60_idx ;
      nRcdExists_1892 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1892_" + sGXsfl_60_idx ;
      nIsMod_1892 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVxPedLin_Enabled = edtVxPedLin_Enabled ;
   }

   public void confirmValues1T90( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601892( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601892( ) ;
         httpContext.changePostValue( "Z14120VxPedLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z14120VxPedLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14120VxPedLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z14148VxPedLPUP_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z14148VxPedLPUP_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14148VxPedLPUP_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z14149VxPedLPUL_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z14149VxPedLPUL_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14149VxPedLPUL_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z14150VxPedLClcc_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z14150VxPedLClcc_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14150VxPedLClcc_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z14151VxPedLCERP_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z14151VxPedLCERP_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14151VxPedLCERP_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxpedid", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14118VxPedTip", GXutil.rtrim( Z14118VxPedTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14119VxPedCod", GXutil.ltrim( localUtil.ntoc( Z14119VxPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14138VxPedNuOf", GXutil.ltrim( localUtil.ntoc( Z14138VxPedNuOf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14145VxPedCliPe", GXutil.rtrim( Z14145VxPedCliPe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14146VxPedFecEn", localUtil.dtoc( Z14146VxPedFecEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14134VxPedObs", Z14134VxPedObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14147VxPedCliDe", GXutil.ltrim( localUtil.ntoc( Z14147VxPedCliDe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6826VXCliCod", GXutil.ltrim( localUtil.ntoc( Z6826VXCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxpedid", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxPedid" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla VERTEX.PEDID y PEDLIN", "") ;
   }

   public void initializeNonKey1T91891( )
   {
      A14138VxPedNuOf = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14138VxPedNuOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14138VxPedNuOf), 8, 0));
      A14145VxPedCliPe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14145VxPedCliPe", A14145VxPedCliPe);
      A14146VxPedFecEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14146VxPedFecEn", localUtil.format(A14146VxPedFecEn, "99/99/99"));
      A6826VXCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6826VXCliCod), 6, 0));
      A14134VxPedObs = "" ;
      n14134VxPedObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14134VxPedObs", A14134VxPedObs);
      A14147VxPedCliDe = 0 ;
      n14147VxPedCliDe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14147VxPedCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14147VxPedCliDe), 6, 0));
      Z14138VxPedNuOf = 0 ;
      Z14145VxPedCliPe = "" ;
      Z14146VxPedFecEn = GXutil.nullDate() ;
      Z14134VxPedObs = "" ;
      Z14147VxPedCliDe = 0 ;
      Z6826VXCliCod = 0 ;
   }

   public void initAll1T91891( )
   {
      A14118VxPedTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14118VxPedTip", A14118VxPedTip);
      A14119VxPedCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14119VxPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14119VxPedCod), 8, 0));
      initializeNonKey1T91891( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1T91892( )
   {
      A14148VxPedLPUP = DecimalUtil.ZERO ;
      n14148VxPedLPUP = false ;
      A14149VxPedLPUL = DecimalUtil.ZERO ;
      n14149VxPedLPUL = false ;
      A14150VxPedLClcc = (short)(0) ;
      n14150VxPedLClcc = false ;
      A14151VxPedLCERP = 0 ;
      n14151VxPedLCERP = false ;
      Z14148VxPedLPUP = DecimalUtil.ZERO ;
      Z14149VxPedLPUL = DecimalUtil.ZERO ;
      Z14150VxPedLClcc = (short)(0) ;
      Z14151VxPedLCERP = 0 ;
   }

   public void initAll1T91892( )
   {
      A14120VxPedLin = (short)(0) ;
      initializeNonKey1T91892( ) ;
   }

   public void standaloneModalInsert1T91892( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612519102522", true, true);
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
      httpContext.AddJavascriptSource("tvxpedid.js", "?202612519102523", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1892( )
   {
      edtVxPedLin_Enabled = defedtVxPedLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxPedLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxPedLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1892, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1892_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14120VxPedLin, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14148VxPedLPUP, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14149VxPedLPUL, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLPUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14150VxPedLClcc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLClcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14151VxPedLCERP, (byte)(12), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxPedLCERP_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVxPedTip_Internalname = "VXPEDTIP" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxPedCod_Internalname = "VXPEDCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxPedNuOf_Internalname = "VXPEDNUOF" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxPedCliPe_Internalname = "VXPEDCLIPE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxPedFecEn_Internalname = "VXPEDFECEN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVXCliCod_Internalname = "VXCLICOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxPedObs_Internalname = "VXPEDOBS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxPedCliDe_Internalname = "VXPEDCLIDE" ;
      edtavnRcdDeleted_1892_Internalname = "vNRCDDELETED_1892" ;
      edtVxPedLin_Internalname = "VXPEDLIN" ;
      edtVxPedLPUP_Internalname = "VXPEDLPUP" ;
      edtVxPedLPUL_Internalname = "VXPEDLPUL" ;
      edtVxPedLClcc_Internalname = "VXPEDLCLCC" ;
      edtVxPedLCERP_Internalname = "VXPEDLCERP" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla VERTEX.PEDID y PEDLIN", "") );
      edtVxPedLCERP_Jsonclick = "" ;
      edtVxPedLClcc_Jsonclick = "" ;
      edtVxPedLPUL_Jsonclick = "" ;
      edtVxPedLPUP_Jsonclick = "" ;
      edtVxPedLin_Jsonclick = "" ;
      edtavnRcdDeleted_1892_Jsonclick = "" ;
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
      edtVxPedLCERP_Enabled = 1 ;
      edtVxPedLClcc_Enabled = 1 ;
      edtVxPedLPUL_Enabled = 1 ;
      edtVxPedLPUP_Enabled = 1 ;
      edtVxPedLin_Enabled = 1 ;
      edtavnRcdDeleted_1892_Enabled = 1 ;
      edtVxPedCliDe_Jsonclick = "" ;
      edtVxPedCliDe_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedCliDe_Enabled = 1 ;
      edtVxPedObs_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedObs_Enabled = 1 ;
      edtVXCliCod_Jsonclick = "" ;
      edtVXCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtVXCliCod_Enabled = 1 ;
      edtVxPedFecEn_Jsonclick = "" ;
      edtVxPedFecEn_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedFecEn_Enabled = 1 ;
      edtVxPedCliPe_Jsonclick = "" ;
      edtVxPedCliPe_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedCliPe_Enabled = 1 ;
      edtVxPedNuOf_Jsonclick = "" ;
      edtVxPedNuOf_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedNuOf_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxPedCod_Jsonclick = "" ;
      edtVxPedCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedCod_Enabled = 1 ;
      edtVxPedTip_Jsonclick = "" ;
      edtVxPedTip_Backcolor = (int)(0xFFFFFF) ;
      edtVxPedTip_Enabled = 1 ;
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
      subsflControlProps_601892( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1T91892( ) ;
         standaloneModal1T91892( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1T91892( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601892( ) ;
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
      GX_FocusControl = edtVxPedNuOf_Internalname ;
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

   public void valid_Vxpedcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14138VxPedNuOf", GXutil.ltrim( localUtil.ntoc( A14138VxPedNuOf, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14145VxPedCliPe", GXutil.rtrim( A14145VxPedCliPe));
      httpContext.ajax_rsp_assign_attri("", false, "A14146VxPedFecEn", localUtil.format(A14146VxPedFecEn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6826VXCliCod", GXutil.ltrim( localUtil.ntoc( A6826VXCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14134VxPedObs", A14134VxPedObs);
      httpContext.ajax_rsp_assign_attri("", false, "A14147VxPedCliDe", GXutil.ltrim( localUtil.ntoc( A14147VxPedCliDe, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14118VxPedTip", GXutil.rtrim( Z14118VxPedTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14119VxPedCod", GXutil.ltrim( localUtil.ntoc( Z14119VxPedCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14138VxPedNuOf", GXutil.ltrim( localUtil.ntoc( Z14138VxPedNuOf, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14145VxPedCliPe", GXutil.rtrim( Z14145VxPedCliPe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14146VxPedFecEn", localUtil.format(Z14146VxPedFecEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6826VXCliCod", GXutil.ltrim( localUtil.ntoc( Z6826VXCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14134VxPedObs", Z14134VxPedObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14147VxPedCliDe", GXutil.ltrim( localUtil.ntoc( Z14147VxPedCliDe, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Vxclicod( )
   {
      /* Using cursor T01T922 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A6826VXCliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "VXCLien", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVXCliCod_Internalname ;
      }
      pr_default.close(10);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_VXPEDTIP","{handler:'valid_Vxpedtip',iparms:[]");
      setEventMetadata("VALID_VXPEDTIP",",oparms:[]}");
      setEventMetadata("VALID_VXPEDCOD","{handler:'valid_Vxpedcod',iparms:[{av:'A14118VxPedTip',fld:'VXPEDTIP',pic:''},{av:'A14119VxPedCod',fld:'VXPEDCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXPEDCOD",",oparms:[{av:'A14138VxPedNuOf',fld:'VXPEDNUOF',pic:'ZZZZZZZ9'},{av:'A14145VxPedCliPe',fld:'VXPEDCLIPE',pic:''},{av:'A14146VxPedFecEn',fld:'VXPEDFECEN',pic:''},{av:'A6826VXCliCod',fld:'VXCLICOD',pic:'ZZZZZ9'},{av:'A14134VxPedObs',fld:'VXPEDOBS',pic:''},{av:'A14147VxPedCliDe',fld:'VXPEDCLIDE',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14118VxPedTip'},{av:'Z14119VxPedCod'},{av:'Z14138VxPedNuOf'},{av:'Z14145VxPedCliPe'},{av:'Z14146VxPedFecEn'},{av:'Z6826VXCliCod'},{av:'Z14134VxPedObs'},{av:'Z14147VxPedCliDe'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXCLICOD","{handler:'valid_Vxclicod',iparms:[{av:'A6826VXCliCod',fld:'VXCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_VXCLICOD",",oparms:[]}");
      setEventMetadata("VALID_VXPEDLIN","{handler:'valid_Vxpedlin',iparms:[]");
      setEventMetadata("VALID_VXPEDLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Vxpedlcerp',iparms:[]");
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
      pr_default.close(10);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14118VxPedTip = "" ;
      Z14145VxPedCliPe = "" ;
      Z14146VxPedFecEn = GXutil.nullDate() ;
      Z14134VxPedObs = "" ;
      Z14148VxPedLPUP = DecimalUtil.ZERO ;
      Z14149VxPedLPUL = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A14118VxPedTip = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A14145VxPedCliPe = "" ;
      lblTextblock5_Jsonclick = "" ;
      A14146VxPedFecEn = GXutil.nullDate() ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A14134VxPedObs = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1892 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1891 = "" ;
      GXCCtl = "" ;
      A14148VxPedLPUP = DecimalUtil.ZERO ;
      A14149VxPedLPUL = DecimalUtil.ZERO ;
      T01T97_A14118VxPedTip = new String[] {""} ;
      T01T97_A14119VxPedCod = new int[1] ;
      T01T97_A14138VxPedNuOf = new int[1] ;
      T01T97_A14145VxPedCliPe = new String[] {""} ;
      T01T97_A14146VxPedFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01T97_A14134VxPedObs = new String[] {""} ;
      T01T97_n14134VxPedObs = new boolean[] {false} ;
      T01T97_A14147VxPedCliDe = new int[1] ;
      T01T97_n14147VxPedCliDe = new boolean[] {false} ;
      T01T97_A6826VXCliCod = new int[1] ;
      T01T96_A6826VXCliCod = new int[1] ;
      T01T98_A6826VXCliCod = new int[1] ;
      T01T99_A14118VxPedTip = new String[] {""} ;
      T01T99_A14119VxPedCod = new int[1] ;
      T01T95_A14118VxPedTip = new String[] {""} ;
      T01T95_A14119VxPedCod = new int[1] ;
      T01T95_A14138VxPedNuOf = new int[1] ;
      T01T95_A14145VxPedCliPe = new String[] {""} ;
      T01T95_A14146VxPedFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01T95_A14134VxPedObs = new String[] {""} ;
      T01T95_n14134VxPedObs = new boolean[] {false} ;
      T01T95_A14147VxPedCliDe = new int[1] ;
      T01T95_n14147VxPedCliDe = new boolean[] {false} ;
      T01T95_A6826VXCliCod = new int[1] ;
      T01T910_A14118VxPedTip = new String[] {""} ;
      T01T910_A14119VxPedCod = new int[1] ;
      T01T911_A14118VxPedTip = new String[] {""} ;
      T01T911_A14119VxPedCod = new int[1] ;
      T01T94_A14118VxPedTip = new String[] {""} ;
      T01T94_A14119VxPedCod = new int[1] ;
      T01T94_A14138VxPedNuOf = new int[1] ;
      T01T94_A14145VxPedCliPe = new String[] {""} ;
      T01T94_A14146VxPedFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01T94_A14134VxPedObs = new String[] {""} ;
      T01T94_n14134VxPedObs = new boolean[] {false} ;
      T01T94_A14147VxPedCliDe = new int[1] ;
      T01T94_n14147VxPedCliDe = new boolean[] {false} ;
      T01T94_A6826VXCliCod = new int[1] ;
      T01T915_A14118VxPedTip = new String[] {""} ;
      T01T915_A14119VxPedCod = new int[1] ;
      T01T916_A14118VxPedTip = new String[] {""} ;
      T01T916_A14119VxPedCod = new int[1] ;
      T01T916_A14120VxPedLin = new short[1] ;
      T01T916_A14148VxPedLPUP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T916_n14148VxPedLPUP = new boolean[] {false} ;
      T01T916_A14149VxPedLPUL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T916_n14149VxPedLPUL = new boolean[] {false} ;
      T01T916_A14150VxPedLClcc = new short[1] ;
      T01T916_n14150VxPedLClcc = new boolean[] {false} ;
      T01T916_A14151VxPedLCERP = new long[1] ;
      T01T916_n14151VxPedLCERP = new boolean[] {false} ;
      T01T917_A14118VxPedTip = new String[] {""} ;
      T01T917_A14119VxPedCod = new int[1] ;
      T01T917_A14120VxPedLin = new short[1] ;
      T01T93_A14118VxPedTip = new String[] {""} ;
      T01T93_A14119VxPedCod = new int[1] ;
      T01T93_A14120VxPedLin = new short[1] ;
      T01T93_A14148VxPedLPUP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T93_n14148VxPedLPUP = new boolean[] {false} ;
      T01T93_A14149VxPedLPUL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T93_n14149VxPedLPUL = new boolean[] {false} ;
      T01T93_A14150VxPedLClcc = new short[1] ;
      T01T93_n14150VxPedLClcc = new boolean[] {false} ;
      T01T93_A14151VxPedLCERP = new long[1] ;
      T01T93_n14151VxPedLCERP = new boolean[] {false} ;
      T01T92_A14118VxPedTip = new String[] {""} ;
      T01T92_A14119VxPedCod = new int[1] ;
      T01T92_A14120VxPedLin = new short[1] ;
      T01T92_A14148VxPedLPUP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T92_n14148VxPedLPUP = new boolean[] {false} ;
      T01T92_A14149VxPedLPUL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T92_n14149VxPedLPUL = new boolean[] {false} ;
      T01T92_A14150VxPedLClcc = new short[1] ;
      T01T92_n14150VxPedLClcc = new boolean[] {false} ;
      T01T92_A14151VxPedLCERP = new long[1] ;
      T01T92_n14151VxPedLCERP = new boolean[] {false} ;
      T01T921_A14118VxPedTip = new String[] {""} ;
      T01T921_A14119VxPedCod = new int[1] ;
      T01T921_A14120VxPedLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ14118VxPedTip = "" ;
      ZZ14145VxPedCliPe = "" ;
      ZZ14146VxPedFecEn = GXutil.nullDate() ;
      ZZ14134VxPedObs = "" ;
      T01T922_A6826VXCliCod = new int[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxpedid__vertex(),
         new Object[] {
             new Object[] {
            T01T94_A14118VxPedTip, T01T94_A14119VxPedCod, T01T94_A14138VxPedNuOf, T01T94_A14145VxPedCliPe, T01T94_A14146VxPedFecEn, T01T94_A14134VxPedObs, T01T94_n14134VxPedObs, T01T94_A14147VxPedCliDe, T01T94_n14147VxPedCliDe, T01T94_A6826VXCliCod
            }
            , new Object[] {
            T01T95_A14118VxPedTip, T01T95_A14119VxPedCod, T01T95_A14138VxPedNuOf, T01T95_A14145VxPedCliPe, T01T95_A14146VxPedFecEn, T01T95_A14134VxPedObs, T01T95_n14134VxPedObs, T01T95_A14147VxPedCliDe, T01T95_n14147VxPedCliDe, T01T95_A6826VXCliCod
            }
            , new Object[] {
            T01T97_A14118VxPedTip, T01T97_A14119VxPedCod, T01T97_A14138VxPedNuOf, T01T97_A14145VxPedCliPe, T01T97_A14146VxPedFecEn, T01T97_A14134VxPedObs, T01T97_n14134VxPedObs, T01T97_A14147VxPedCliDe, T01T97_n14147VxPedCliDe, T01T97_A6826VXCliCod
            }
            , new Object[] {
            T01T99_A14118VxPedTip, T01T99_A14119VxPedCod
            }
            , new Object[] {
            T01T910_A14118VxPedTip, T01T910_A14119VxPedCod
            }
            , new Object[] {
            T01T911_A14118VxPedTip, T01T911_A14119VxPedCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T915_A14118VxPedTip, T01T915_A14119VxPedCod
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxpedid__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxpedid__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxpedid__default(),
         new Object[] {
             new Object[] {
            T01T92_A14118VxPedTip, T01T92_A14119VxPedCod, T01T92_A14120VxPedLin, T01T92_A14148VxPedLPUP, T01T92_n14148VxPedLPUP, T01T92_A14149VxPedLPUL, T01T92_n14149VxPedLPUL, T01T92_A14150VxPedLClcc, T01T92_n14150VxPedLClcc, T01T92_A14151VxPedLCERP,
            T01T92_n14151VxPedLCERP
            }
            , new Object[] {
            T01T93_A14118VxPedTip, T01T93_A14119VxPedCod, T01T93_A14120VxPedLin, T01T93_A14148VxPedLPUP, T01T93_n14148VxPedLPUP, T01T93_A14149VxPedLPUL, T01T93_n14149VxPedLPUL, T01T93_A14150VxPedLClcc, T01T93_n14150VxPedLClcc, T01T93_A14151VxPedLCERP,
            T01T93_n14151VxPedLCERP
            }
            , new Object[] {
            T01T96_A6826VXCliCod
            }
            , new Object[] {
            T01T98_A6826VXCliCod
            }
            , new Object[] {
            T01T916_A14118VxPedTip, T01T916_A14119VxPedCod, T01T916_A14120VxPedLin, T01T916_A14148VxPedLPUP, T01T916_n14148VxPedLPUP, T01T916_A14149VxPedLPUL, T01T916_n14149VxPedLPUL, T01T916_A14150VxPedLClcc, T01T916_n14150VxPedLClcc, T01T916_A14151VxPedLCERP,
            T01T916_n14151VxPedLCERP
            }
            , new Object[] {
            T01T917_A14118VxPedTip, T01T917_A14119VxPedCod, T01T917_A14120VxPedLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T921_A14118VxPedTip, T01T921_A14119VxPedCod, T01T921_A14120VxPedLin
            }
            , new Object[] {
            T01T922_A6826VXCliCod
            }
         }
      );
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
   private short Z14120VxPedLin ;
   private short Z14150VxPedLClcc ;
   private short nRcdDeleted_1892 ;
   private short nRcdExists_1892 ;
   private short nIsMod_1892 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1892 ;
   private short RcdFound1892 ;
   private short nBlankRcdUsr1892 ;
   private short A14120VxPedLin ;
   private short A14150VxPedLClcc ;
   private short RcdFound1891 ;
   private short nIsDirty_1891 ;
   private short nIsDirty_1892 ;
   private int Z14119VxPedCod ;
   private int Z14138VxPedNuOf ;
   private int Z14147VxPedCliDe ;
   private int Z6826VXCliCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A6826VXCliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxPedTip_Enabled ;
   private int A14119VxPedCod ;
   private int edtVxPedCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A14138VxPedNuOf ;
   private int edtVxPedNuOf_Enabled ;
   private int edtVxPedCliPe_Enabled ;
   private int edtVxPedFecEn_Enabled ;
   private int edtVXCliCod_Enabled ;
   private int edtVxPedObs_Enabled ;
   private int A14147VxPedCliDe ;
   private int edtVxPedCliDe_Enabled ;
   private int edtavnRcdDeleted_1892_Enabled ;
   private int edtVxPedLin_Enabled ;
   private int edtVxPedLPUP_Enabled ;
   private int edtVxPedLPUL_Enabled ;
   private int edtVxPedLClcc_Enabled ;
   private int edtVxPedLCERP_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtVxPedLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVxPedCliDe_Backcolor ;
   private int edtVxPedObs_Backcolor ;
   private int edtVXCliCod_Backcolor ;
   private int edtVxPedFecEn_Backcolor ;
   private int edtVxPedCliPe_Backcolor ;
   private int edtVxPedNuOf_Backcolor ;
   private int edtVxPedCod_Backcolor ;
   private int edtVxPedTip_Backcolor ;
   private int ZZ14119VxPedCod ;
   private int ZZ14138VxPedNuOf ;
   private int ZZ6826VXCliCod ;
   private int ZZ14147VxPedCliDe ;
   private long Z14151VxPedLCERP ;
   private long GRID1_nFirstRecordOnPage ;
   private long A14151VxPedLCERP ;
   private java.math.BigDecimal Z14148VxPedLPUP ;
   private java.math.BigDecimal Z14149VxPedLPUL ;
   private java.math.BigDecimal A14148VxPedLPUP ;
   private java.math.BigDecimal A14149VxPedLPUL ;
   private String sPrefix ;
   private String Z14118VxPedTip ;
   private String Z14145VxPedCliPe ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxPedTip_Internalname ;
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
   private String A14118VxPedTip ;
   private String edtVxPedTip_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxPedCod_Internalname ;
   private String edtVxPedCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxPedNuOf_Internalname ;
   private String edtVxPedNuOf_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxPedCliPe_Internalname ;
   private String A14145VxPedCliPe ;
   private String edtVxPedCliPe_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxPedFecEn_Internalname ;
   private String edtVxPedFecEn_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVXCliCod_Internalname ;
   private String edtVXCliCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxPedObs_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxPedCliDe_Internalname ;
   private String edtVxPedCliDe_Jsonclick ;
   private String sMode1892 ;
   private String edtavnRcdDeleted_1892_Internalname ;
   private String edtVxPedLin_Internalname ;
   private String edtVxPedLPUP_Internalname ;
   private String edtVxPedLPUL_Internalname ;
   private String edtVxPedLClcc_Internalname ;
   private String edtVxPedLCERP_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1891 ;
   private String GXCCtl ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1892_Jsonclick ;
   private String edtVxPedLin_Jsonclick ;
   private String edtVxPedLPUP_Jsonclick ;
   private String edtVxPedLPUL_Jsonclick ;
   private String edtVxPedLClcc_Jsonclick ;
   private String edtVxPedLCERP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ14118VxPedTip ;
   private String ZZ14145VxPedCliPe ;
   private java.util.Date Z14146VxPedFecEn ;
   private java.util.Date A14146VxPedFecEn ;
   private java.util.Date ZZ14146VxPedFecEn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n14134VxPedObs ;
   private boolean n14147VxPedCliDe ;
   private boolean Gx_longc ;
   private boolean n14148VxPedLPUP ;
   private boolean n14149VxPedLPUL ;
   private boolean n14150VxPedLClcc ;
   private boolean n14151VxPedLCERP ;
   private String Z14134VxPedObs ;
   private String A14134VxPedObs ;
   private String ZZ14134VxPedObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_vertex ;
   private String[] T01T97_A14118VxPedTip ;
   private int[] T01T97_A14119VxPedCod ;
   private int[] T01T97_A14138VxPedNuOf ;
   private String[] T01T97_A14145VxPedCliPe ;
   private java.util.Date[] T01T97_A14146VxPedFecEn ;
   private String[] T01T97_A14134VxPedObs ;
   private boolean[] T01T97_n14134VxPedObs ;
   private int[] T01T97_A14147VxPedCliDe ;
   private boolean[] T01T97_n14147VxPedCliDe ;
   private int[] T01T97_A6826VXCliCod ;
   private IDataStoreProvider pr_default ;
   private int[] T01T96_A6826VXCliCod ;
   private int[] T01T98_A6826VXCliCod ;
   private String[] T01T99_A14118VxPedTip ;
   private int[] T01T99_A14119VxPedCod ;
   private String[] T01T95_A14118VxPedTip ;
   private int[] T01T95_A14119VxPedCod ;
   private int[] T01T95_A14138VxPedNuOf ;
   private String[] T01T95_A14145VxPedCliPe ;
   private java.util.Date[] T01T95_A14146VxPedFecEn ;
   private String[] T01T95_A14134VxPedObs ;
   private boolean[] T01T95_n14134VxPedObs ;
   private int[] T01T95_A14147VxPedCliDe ;
   private boolean[] T01T95_n14147VxPedCliDe ;
   private int[] T01T95_A6826VXCliCod ;
   private String[] T01T910_A14118VxPedTip ;
   private int[] T01T910_A14119VxPedCod ;
   private String[] T01T911_A14118VxPedTip ;
   private int[] T01T911_A14119VxPedCod ;
   private String[] T01T94_A14118VxPedTip ;
   private int[] T01T94_A14119VxPedCod ;
   private int[] T01T94_A14138VxPedNuOf ;
   private String[] T01T94_A14145VxPedCliPe ;
   private java.util.Date[] T01T94_A14146VxPedFecEn ;
   private String[] T01T94_A14134VxPedObs ;
   private boolean[] T01T94_n14134VxPedObs ;
   private int[] T01T94_A14147VxPedCliDe ;
   private boolean[] T01T94_n14147VxPedCliDe ;
   private int[] T01T94_A6826VXCliCod ;
   private String[] T01T915_A14118VxPedTip ;
   private int[] T01T915_A14119VxPedCod ;
   private String[] T01T916_A14118VxPedTip ;
   private int[] T01T916_A14119VxPedCod ;
   private short[] T01T916_A14120VxPedLin ;
   private java.math.BigDecimal[] T01T916_A14148VxPedLPUP ;
   private boolean[] T01T916_n14148VxPedLPUP ;
   private java.math.BigDecimal[] T01T916_A14149VxPedLPUL ;
   private boolean[] T01T916_n14149VxPedLPUL ;
   private short[] T01T916_A14150VxPedLClcc ;
   private boolean[] T01T916_n14150VxPedLClcc ;
   private long[] T01T916_A14151VxPedLCERP ;
   private boolean[] T01T916_n14151VxPedLCERP ;
   private String[] T01T917_A14118VxPedTip ;
   private int[] T01T917_A14119VxPedCod ;
   private short[] T01T917_A14120VxPedLin ;
   private String[] T01T93_A14118VxPedTip ;
   private int[] T01T93_A14119VxPedCod ;
   private short[] T01T93_A14120VxPedLin ;
   private java.math.BigDecimal[] T01T93_A14148VxPedLPUP ;
   private boolean[] T01T93_n14148VxPedLPUP ;
   private java.math.BigDecimal[] T01T93_A14149VxPedLPUL ;
   private boolean[] T01T93_n14149VxPedLPUL ;
   private short[] T01T93_A14150VxPedLClcc ;
   private boolean[] T01T93_n14150VxPedLClcc ;
   private long[] T01T93_A14151VxPedLCERP ;
   private boolean[] T01T93_n14151VxPedLCERP ;
   private String[] T01T92_A14118VxPedTip ;
   private int[] T01T92_A14119VxPedCod ;
   private short[] T01T92_A14120VxPedLin ;
   private java.math.BigDecimal[] T01T92_A14148VxPedLPUP ;
   private boolean[] T01T92_n14148VxPedLPUP ;
   private java.math.BigDecimal[] T01T92_A14149VxPedLPUL ;
   private boolean[] T01T92_n14149VxPedLPUL ;
   private short[] T01T92_A14150VxPedLClcc ;
   private boolean[] T01T92_n14150VxPedLClcc ;
   private long[] T01T92_A14151VxPedLCERP ;
   private boolean[] T01T92_n14151VxPedLCERP ;
   private String[] T01T921_A14118VxPedTip ;
   private int[] T01T921_A14119VxPedCod ;
   private short[] T01T921_A14120VxPedLin ;
   private int[] T01T922_A6826VXCliCod ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxpedid__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T94", "SELECT PedTip, PedCod, PedNuOf, PedCliPed, PedFecEn, PedObs, pedCliCDes, CliCod AS VXCliCod FROM PEDID WHERE PedTip = ? AND PedCod = ?  FOR UPDATE OF PedNuOf, PedCliPed, PedFecEn, PedObs, pedCliCDes, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T95", "SELECT PedTip, PedCod, PedNuOf, PedCliPed, PedFecEn, PedObs, pedCliCDes, CliCod AS VXCliCod FROM PEDID WHERE PedTip = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T97", "SELECT /*+ FIRST_ROWS(100) */ TM1.PedTip, TM1.PedCod, TM1.PedNuOf, TM1.PedCliPed, TM1.PedFecEn, TM1.PedObs, TM1.pedCliCDes, TM1.CliCod AS VXCliCod FROM PEDID TM1 WHERE TM1.PedTip = ? and TM1.PedCod = ? ORDER BY TM1.PedTip, TM1.PedCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T99", "SELECT /*+ FIRST_ROWS(1) */ PedTip, PedCod FROM PEDID WHERE PedTip = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T910", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PedTip, PedCod FROM PEDID WHERE ( PedTip > ? or PedTip = ? and PedCod > ?) ORDER BY PedTip, PedCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T911", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PedTip, PedCod FROM PEDID WHERE ( PedTip < ? or PedTip = ? and PedCod < ?) ORDER BY PedTip DESC, PedCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01T912", "INSERT INTO PEDID(PedTip, PedCod, PedNuOf, PedCliPed, PedFecEn, PedObs, pedCliCDes, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "PEDID")
         ,new UpdateCursor("T01T913", "UPDATE PEDID SET PedNuOf=?, PedCliPed=?, PedFecEn=?, PedObs=?, pedCliCDes=?, CliCod=?  WHERE PedTip = ? AND PedCod = ?", GX_NOMASK, "PEDID")
         ,new UpdateCursor("T01T914", "DELETE FROM PEDID  WHERE PedTip = ? AND PedCod = ?", GX_NOMASK, "PEDID")
         ,new ForEachCursor("T01T915", "SELECT /*+ FIRST_ROWS(100) */ PedTip, PedCod FROM PEDID ORDER BY PedTip, PedCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setDate(5, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[6], 200);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               stmt.setInt(8, ((Number) parms[9]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setDate(3, (java.util.Date)parms[2]);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 200);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setInt(8, ((Number) parms[9]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class tvxpedid__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxpedid__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxpedid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T92", "SELECT VxPedTip, VxPedCod, VxPedLin, VxPedLPUP, VxPedLPUL, VxPedLClcc, VxPedLCERP FROM VxPedLin WHERE VxPedTip = ? AND VxPedCod = ? AND VxPedLin = ?  FOR UPDATE OF VxPedLPUP, VxPedLPUL, VxPedLClcc, VxPedLCERP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T93", "SELECT VxPedTip, VxPedCod, VxPedLin, VxPedLPUP, VxPedLPUL, VxPedLClcc, VxPedLCERP FROM VxPedLin WHERE VxPedTip = ? AND VxPedCod = ? AND VxPedLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T96", "SELECT CliCod AS VXCliCod FROM VTXCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T98", "SELECT CliCod AS VXCliCod FROM VTXCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T916", "SELECT VxPedTip, VxPedCod, VxPedLin, VxPedLPUP, VxPedLPUL, VxPedLClcc, VxPedLCERP FROM VxPedLin WHERE VxPedTip = ? and VxPedCod = ? and VxPedLin = ? ORDER BY VxPedTip, VxPedCod, VxPedLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T917", "SELECT VxPedTip, VxPedCod, VxPedLin FROM VxPedLin WHERE VxPedTip = ? AND VxPedCod = ? AND VxPedLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T918", "INSERT INTO VxPedLin(VxPedTip, VxPedCod, VxPedLin, VxPedLPUP, VxPedLPUL, VxPedLClcc, VxPedLCERP) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VxPedLin")
         ,new UpdateCursor("T01T919", "UPDATE VxPedLin SET VxPedLPUP=?, VxPedLPUL=?, VxPedLClcc=?, VxPedLCERP=?  WHERE VxPedTip = ? AND VxPedCod = ? AND VxPedLin = ?", GX_NOMASK, "VxPedLin")
         ,new UpdateCursor("T01T920", "DELETE FROM VxPedLin  WHERE VxPedTip = ? AND VxPedCod = ? AND VxPedLin = ?", GX_NOMASK, "VxPedLin")
         ,new ForEachCursor("T01T921", "SELECT VxPedTip, VxPedCod, VxPedLin FROM VxPedLin WHERE VxPedTip = ? and VxPedCod = ? ORDER BY VxPedTip, VxPedCod, VxPedLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T922", "SELECT CliCod AS VXCliCod FROM VTXCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[10]).longValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               stmt.setString(5, (String)parms[8], 1);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

