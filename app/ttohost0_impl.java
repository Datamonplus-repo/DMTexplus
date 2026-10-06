package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttohost0_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TOHOST0", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTh_Hdr_Internalname ;
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
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
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

   public ttohost0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttohost0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttohost0_impl.class ));
   }

   public ttohost0_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTOHOST0.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10891Th_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10891Th_Hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10891Th_Hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_r_Internalname, GXutil.ltrim( localUtil.ntoc( A10892Th_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_r_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10892Th_r), "9") : localUtil.format( DecimalUtil.doubleToDec(A10892Th_r), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_r_Jsonclick, 0, "", "", "", "", "", 1, edtTh_r_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_p_Internalname, GXutil.rtrim( A10893Th_p), GXutil.rtrim( localUtil.format( A10893Th_p, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_p_Jsonclick, 0, "", "", "", "", "", 1, edtTh_p_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Maq_Internalname, GXutil.rtrim( A10894Th_Maq), GXutil.rtrim( localUtil.format( A10894Th_Maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Maq_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Maq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Tipo_Internalname, GXutil.rtrim( A10895Th_Tipo), GXutil.rtrim( localUtil.format( A10895Th_Tipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Tipo_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Tipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha-Hora Inicio", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTh_FecI_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_FecI_Internalname, localUtil.ttoc( A10896Th_FecI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10896Th_FecI, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_FecI_Jsonclick, 0, "", "", "", "", "", 1, edtTh_FecI_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTh_FecI_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTh_FecI_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTOHOST0.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha-Hora Fin", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTh_FecF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_FecF_Internalname, localUtil.ttoc( A10897Th_FecF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10897Th_FecF, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_FecF_Jsonclick, 0, "", "", "", "", "", 1, edtTh_FecF_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTh_FecF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTh_FecF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTOHOST0.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10898Th_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_Kgs_Enabled!=0) ? localUtil.format( A10898Th_Kgs, "ZZZZZ9.99") : localUtil.format( A10898Th_Kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Kgs_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Tiempo Real", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Treal_Internalname, GXutil.ltrim( localUtil.ntoc( A10899Th_Treal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_Treal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10899Th_Treal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10899Th_Treal), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Treal_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Treal_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "N Anyadidas", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_NAny_Internalname, GXutil.ltrim( localUtil.ntoc( A10900Th_NAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_NAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10900Th_NAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10900Th_NAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_NAny_Jsonclick, 0, "", "", "", "", "", 1, edtTh_NAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Litros", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Lts_Internalname, GXutil.ltrim( localUtil.ntoc( A10901Th_Lts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_Lts_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10901Th_Lts), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10901Th_Lts), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Lts_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Lts_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_UltL_Internalname, GXutil.ltrim( localUtil.ntoc( A10902Th_UltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_UltL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10902Th_UltL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10902Th_UltL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_UltL_Jsonclick, 0, "", "", "", "", "", 1, edtTh_UltL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero Veces Enviada", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Num_Internalname, GXutil.ltrim( localUtil.ntoc( A10922Th_Num, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_Num_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10922Th_Num), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10922Th_Num), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Num_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Num_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tiempo Teorico", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Tteo_Internalname, GXutil.ltrim( localUtil.ntoc( A10923Th_Tteo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_Tteo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10923Th_Tteo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10923Th_Tteo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Tteo_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Tteo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOST0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1453 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1453 = (short)(1) ;
            scanStart19X1453( ) ;
            while ( RcdFound1453 != 0 )
            {
               init_level_properties1453( ) ;
               getByPrimaryKey19X1453( ) ;
               addRow19X1453( ) ;
               scanNext19X1453( ) ;
            }
            scanEnd19X1453( ) ;
            nBlankRcdCount1453 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal19X1453( ) ;
         standaloneModal19X1453( ) ;
         sMode1453 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow19X1453( ) ;
            edtavnRcdDeleted_1453_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1453_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1453_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1453_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_LINEA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Linea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_Prod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PROD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Prod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Prod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_FecP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_FECP_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_FecP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_FecP_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_CANT_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Cant_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_Exis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_EXIS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Exis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Exis_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_ProdAux_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PRODAUX_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_ProdAux_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_ProdAux_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_ProcF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PROCF_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_ProcF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_ProcF_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_ProcL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PROCL_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_ProcL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_ProcL_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtTh_HmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_HMC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_HmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_HmC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_1453 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal19X1453( ) ;
            }
            sendRow19X1453( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode1453 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1453 = (short)(5) ;
         nRcdExists_1453 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart19X1453( ) ;
            while ( RcdFound1453 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1001453( ) ;
               init_level_properties1453( ) ;
               standaloneNotModal19X1453( ) ;
               getByPrimaryKey19X1453( ) ;
               standaloneModal19X1453( ) ;
               addRow19X1453( ) ;
               scanNext19X1453( ) ;
            }
            scanEnd19X1453( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1453 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001453( ) ;
      initAll19X1453( ) ;
      init_level_properties1453( ) ;
      nRcdExists_1453 = (short)(0) ;
      nIsMod_1453 = (short)(0) ;
      nRcdDeleted_1453 = (short)(0) ;
      nBlankRcdCount1453 = (short)(nBlankRcdUsr1453+nBlankRcdCount1453) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1453 > 0 )
      {
         standaloneNotModal19X1453( ) ;
         standaloneModal19X1453( ) ;
         addRow19X1453( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTh_Linea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1453 = (short)(nBlankRcdCount1453-1) ;
      }
      Gx_mode = sMode1453 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOST0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTOHOST0.htm");
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
      e1119X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10891Th_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z10891Th_Hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10892Th_r = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10892Th_r"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10893Th_p = httpContext.cgiGet( "Z10893Th_p") ;
            Z10894Th_Maq = httpContext.cgiGet( "Z10894Th_Maq") ;
            Z10895Th_Tipo = httpContext.cgiGet( "Z10895Th_Tipo") ;
            Z10896Th_FecI = localUtil.ctot( httpContext.cgiGet( "Z10896Th_FecI"), 0) ;
            Z10897Th_FecF = localUtil.ctot( httpContext.cgiGet( "Z10897Th_FecF"), 0) ;
            Z10898Th_Kgs = localUtil.ctond( httpContext.cgiGet( "Z10898Th_Kgs")) ;
            Z10899Th_Treal = (short)(localUtil.ctol( httpContext.cgiGet( "Z10899Th_Treal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10900Th_NAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z10900Th_NAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10901Th_Lts = (int)(localUtil.ctol( httpContext.cgiGet( "Z10901Th_Lts"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10902Th_UltL = (short)(localUtil.ctol( httpContext.cgiGet( "Z10902Th_UltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10922Th_Num = (short)(localUtil.ctol( httpContext.cgiGet( "Z10922Th_Num"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10923Th_Tteo = (short)(localUtil.ctol( httpContext.cgiGet( "Z10923Th_Tteo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_HDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10891Th_Hdr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
            }
            else
            {
               A10891Th_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtTh_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_R");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_r_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10892Th_r = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
            }
            else
            {
               A10892Th_r = (byte)(localUtil.ctol( httpContext.cgiGet( edtTh_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
            }
            A10893Th_p = httpContext.cgiGet( edtTh_p_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
            A10894Th_Maq = httpContext.cgiGet( edtTh_Maq_Internalname) ;
            n10894Th_Maq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
            A10895Th_Tipo = httpContext.cgiGet( edtTh_Tipo_Internalname) ;
            n10895Th_Tipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10895Th_Tipo", A10895Th_Tipo);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTh_FecI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TH_FECI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_FecI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10896Th_FecI = GXutil.resetTime( GXutil.nullDate() );
               n10896Th_FecI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10896Th_FecI", localUtil.ttoc( A10896Th_FecI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10896Th_FecI = localUtil.ctot( httpContext.cgiGet( edtTh_FecI_Internalname)) ;
               n10896Th_FecI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10896Th_FecI", localUtil.ttoc( A10896Th_FecI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTh_FecF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TH_FECF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_FecF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10897Th_FecF = GXutil.resetTime( GXutil.nullDate() );
               n10897Th_FecF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10897Th_FecF", localUtil.ttoc( A10897Th_FecF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10897Th_FecF = localUtil.ctot( httpContext.cgiGet( edtTh_FecF_Internalname)) ;
               n10897Th_FecF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10897Th_FecF", localUtil.ttoc( A10897Th_FecF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTh_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTh_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_KGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10898Th_Kgs = DecimalUtil.ZERO ;
               n10898Th_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10898Th_Kgs", GXutil.ltrimstr( A10898Th_Kgs, 9, 2));
            }
            else
            {
               A10898Th_Kgs = localUtil.ctond( httpContext.cgiGet( edtTh_Kgs_Internalname)) ;
               n10898Th_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10898Th_Kgs", GXutil.ltrimstr( A10898Th_Kgs, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Treal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Treal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_TREAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_Treal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10899Th_Treal = (short)(0) ;
               n10899Th_Treal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10899Th_Treal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10899Th_Treal), 4, 0));
            }
            else
            {
               A10899Th_Treal = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_Treal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10899Th_Treal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10899Th_Treal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10899Th_Treal), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_NAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_NAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_NANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_NAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10900Th_NAny = (short)(0) ;
               n10900Th_NAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10900Th_NAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10900Th_NAny), 4, 0));
            }
            else
            {
               A10900Th_NAny = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_NAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10900Th_NAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10900Th_NAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10900Th_NAny), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Lts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Lts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_LTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_Lts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10901Th_Lts = 0 ;
               n10901Th_Lts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10901Th_Lts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10901Th_Lts), 5, 0));
            }
            else
            {
               A10901Th_Lts = (int)(localUtil.ctol( httpContext.cgiGet( edtTh_Lts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10901Th_Lts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10901Th_Lts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10901Th_Lts), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_UltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_UltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_ULTL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_UltL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10902Th_UltL = (short)(0) ;
               n10902Th_UltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10902Th_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10902Th_UltL), 4, 0));
            }
            else
            {
               A10902Th_UltL = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_UltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10902Th_UltL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10902Th_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10902Th_UltL), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_NUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_Num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10922Th_Num = (short)(0) ;
               n10922Th_Num = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10922Th_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10922Th_Num), 4, 0));
            }
            else
            {
               A10922Th_Num = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10922Th_Num = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10922Th_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10922Th_Num), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Tteo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Tteo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_TTEO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_Tteo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10923Th_Tteo = (short)(0) ;
               n10923Th_Tteo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10923Th_Tteo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10923Th_Tteo), 4, 0));
            }
            else
            {
               A10923Th_Tteo = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_Tteo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10923Th_Tteo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10923Th_Tteo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10923Th_Tteo), 4, 0));
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
               A10891Th_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Th_Hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
               A10892Th_r = (byte)(GXutil.lval( httpContext.GetPar( "Th_r"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
               A10893Th_p = httpContext.GetPar( "Th_p") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
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
                        e1119X2 ();
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
            initAll19X1452( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1453_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1453_Enabled), 5, 0), !bGXsfl_100_Refreshing);
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
      disableAttributes19X1452( ) ;
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

   public void confirm_19X0( )
   {
      beforeValidate19X1452( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls19X1452( ) ;
         }
         else
         {
            checkExtendedTable19X1452( ) ;
            if ( AnyError == 0 )
            {
               zm19X1452( 2) ;
            }
            closeExtendedTableCursors19X1452( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1452 = Gx_mode ;
         confirm_19X1453( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1452 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1452 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues19X0( ) ;
      }
   }

   public void confirm_19X1453( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow19X1453( ) ;
         if ( ( nRcdExists_1453 != 0 ) || ( nIsMod_1453 != 0 ) )
         {
            getKey19X1453( ) ;
            if ( ( nRcdExists_1453 == 0 ) && ( nRcdDeleted_1453 == 0 ) )
            {
               if ( RcdFound1453 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate19X1453( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable19X1453( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors19X1453( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TH_LINEA_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTh_Linea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1453 != 0 )
               {
                  if ( nRcdDeleted_1453 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey19X1453( ) ;
                     load19X1453( ) ;
                     beforeValidate19X1453( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls19X1453( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1453 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate19X1453( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable19X1453( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors19X1453( ) ;
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
                  if ( nRcdDeleted_1453 == 0 )
                  {
                     GXCCtl = "TH_LINEA_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTh_Linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1453_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10903Th_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Prod_Internalname, GXutil.rtrim( A10904Th_Prod)) ;
         httpContext.changePostValue( edtTh_FecP_Internalname, localUtil.ttoc( A10905Th_FecP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtTh_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10906Th_Cant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Exis_Internalname, GXutil.ltrim( localUtil.ntoc( A10907Th_Exis, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_ProdAux_Internalname, GXutil.rtrim( A10919Th_ProdAux)) ;
         httpContext.changePostValue( edtTh_ProcF_Internalname, GXutil.rtrim( A10920Th_ProcF)) ;
         httpContext.changePostValue( edtTh_ProcL_Internalname, GXutil.ltrim( localUtil.ntoc( A10921Th_ProcL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_HmC_Internalname, GXutil.rtrim( A11302Th_HmC)) ;
         httpContext.changePostValue( "ZT_"+"Z10903Th_Linea_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10903Th_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10904Th_Prod_"+sGXsfl_100_idx, GXutil.rtrim( Z10904Th_Prod)) ;
         httpContext.changePostValue( "ZT_"+"Z10905Th_FecP_"+sGXsfl_100_idx, localUtil.ttoc( Z10905Th_FecP, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10906Th_Cant_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10906Th_Cant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10907Th_Exis_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10907Th_Exis, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10919Th_ProdAux_"+sGXsfl_100_idx, GXutil.rtrim( Z10919Th_ProdAux)) ;
         httpContext.changePostValue( "ZT_"+"Z10920Th_ProcF_"+sGXsfl_100_idx, GXutil.rtrim( Z10920Th_ProcF)) ;
         httpContext.changePostValue( "ZT_"+"Z10921Th_ProcL_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10921Th_ProcL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11302Th_HmC_"+sGXsfl_100_idx, GXutil.rtrim( Z11302Th_HmC)) ;
         httpContext.changePostValue( "nRcdDeleted_1453_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1453_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1453_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1453 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1453_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1453_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_LINEA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PROD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Prod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_FECP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_FecP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_CANT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_EXIS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Exis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PRODAUX_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProdAux_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PROCF_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PROCL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_HMC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_HmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption19X0( )
   {
   }

   public void e1119X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttohost0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttohost0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttohost0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttohost0_impl.this.A396EmprCod = GXv_char2[0] ;
      ttohost0_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttohost0_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm19X1452( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10894Th_Maq = T019X5_A10894Th_Maq[0] ;
            Z10895Th_Tipo = T019X5_A10895Th_Tipo[0] ;
            Z10896Th_FecI = T019X5_A10896Th_FecI[0] ;
            Z10897Th_FecF = T019X5_A10897Th_FecF[0] ;
            Z10898Th_Kgs = T019X5_A10898Th_Kgs[0] ;
            Z10899Th_Treal = T019X5_A10899Th_Treal[0] ;
            Z10900Th_NAny = T019X5_A10900Th_NAny[0] ;
            Z10901Th_Lts = T019X5_A10901Th_Lts[0] ;
            Z10902Th_UltL = T019X5_A10902Th_UltL[0] ;
            Z10922Th_Num = T019X5_A10922Th_Num[0] ;
            Z10923Th_Tteo = T019X5_A10923Th_Tteo[0] ;
         }
         else
         {
            Z10894Th_Maq = A10894Th_Maq ;
            Z10895Th_Tipo = A10895Th_Tipo ;
            Z10896Th_FecI = A10896Th_FecI ;
            Z10897Th_FecF = A10897Th_FecF ;
            Z10898Th_Kgs = A10898Th_Kgs ;
            Z10899Th_Treal = A10899Th_Treal ;
            Z10900Th_NAny = A10900Th_NAny ;
            Z10901Th_Lts = A10901Th_Lts ;
            Z10902Th_UltL = A10902Th_UltL ;
            Z10922Th_Num = A10922Th_Num ;
            Z10923Th_Tteo = A10923Th_Tteo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10891Th_Hdr = A10891Th_Hdr ;
         Z10892Th_r = A10892Th_r ;
         Z10893Th_p = A10893Th_p ;
         Z10894Th_Maq = A10894Th_Maq ;
         Z10895Th_Tipo = A10895Th_Tipo ;
         Z10896Th_FecI = A10896Th_FecI ;
         Z10897Th_FecF = A10897Th_FecF ;
         Z10898Th_Kgs = A10898Th_Kgs ;
         Z10899Th_Treal = A10899Th_Treal ;
         Z10900Th_NAny = A10900Th_NAny ;
         Z10901Th_Lts = A10901Th_Lts ;
         Z10902Th_UltL = A10902Th_UltL ;
         Z10922Th_Num = A10922Th_Num ;
         Z10923Th_Tteo = A10923Th_Tteo ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTOHOST0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T019X6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019X6_A407EmprNom[0] ;
      n407EmprNom = T019X6_n407EmprNom[0] ;
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

   public void load19X1452( )
   {
      /* Using cursor T019X7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1452 = (short)(1) ;
         A407EmprNom = T019X7_A407EmprNom[0] ;
         n407EmprNom = T019X7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10894Th_Maq = T019X7_A10894Th_Maq[0] ;
         n10894Th_Maq = T019X7_n10894Th_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
         A10895Th_Tipo = T019X7_A10895Th_Tipo[0] ;
         n10895Th_Tipo = T019X7_n10895Th_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10895Th_Tipo", A10895Th_Tipo);
         A10896Th_FecI = T019X7_A10896Th_FecI[0] ;
         n10896Th_FecI = T019X7_n10896Th_FecI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10896Th_FecI", localUtil.ttoc( A10896Th_FecI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10897Th_FecF = T019X7_A10897Th_FecF[0] ;
         n10897Th_FecF = T019X7_n10897Th_FecF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10897Th_FecF", localUtil.ttoc( A10897Th_FecF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10898Th_Kgs = T019X7_A10898Th_Kgs[0] ;
         n10898Th_Kgs = T019X7_n10898Th_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10898Th_Kgs", GXutil.ltrimstr( A10898Th_Kgs, 9, 2));
         A10899Th_Treal = T019X7_A10899Th_Treal[0] ;
         n10899Th_Treal = T019X7_n10899Th_Treal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10899Th_Treal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10899Th_Treal), 4, 0));
         A10900Th_NAny = T019X7_A10900Th_NAny[0] ;
         n10900Th_NAny = T019X7_n10900Th_NAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10900Th_NAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10900Th_NAny), 4, 0));
         A10901Th_Lts = T019X7_A10901Th_Lts[0] ;
         n10901Th_Lts = T019X7_n10901Th_Lts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10901Th_Lts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10901Th_Lts), 5, 0));
         A10902Th_UltL = T019X7_A10902Th_UltL[0] ;
         n10902Th_UltL = T019X7_n10902Th_UltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10902Th_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10902Th_UltL), 4, 0));
         A10922Th_Num = T019X7_A10922Th_Num[0] ;
         n10922Th_Num = T019X7_n10922Th_Num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10922Th_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10922Th_Num), 4, 0));
         A10923Th_Tteo = T019X7_A10923Th_Tteo[0] ;
         n10923Th_Tteo = T019X7_n10923Th_Tteo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10923Th_Tteo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10923Th_Tteo), 4, 0));
         zm19X1452( -1) ;
      }
      pr_default.close(5);
      onLoadActions19X1452( ) ;
   }

   public void onLoadActions19X1452( )
   {
   }

   public void checkExtendedTable19X1452( )
   {
      nIsDirty_1452 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors19X1452( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey19X1452( )
   {
      /* Using cursor T019X8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1452 = (short)(1) ;
      }
      else
      {
         RcdFound1452 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T019X5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T019X5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19X1452( 1) ;
         RcdFound1452 = (short)(1) ;
         A10891Th_Hdr = T019X5_A10891Th_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
         A10892Th_r = T019X5_A10892Th_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
         A10893Th_p = T019X5_A10893Th_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
         A10894Th_Maq = T019X5_A10894Th_Maq[0] ;
         n10894Th_Maq = T019X5_n10894Th_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
         A10895Th_Tipo = T019X5_A10895Th_Tipo[0] ;
         n10895Th_Tipo = T019X5_n10895Th_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10895Th_Tipo", A10895Th_Tipo);
         A10896Th_FecI = T019X5_A10896Th_FecI[0] ;
         n10896Th_FecI = T019X5_n10896Th_FecI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10896Th_FecI", localUtil.ttoc( A10896Th_FecI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10897Th_FecF = T019X5_A10897Th_FecF[0] ;
         n10897Th_FecF = T019X5_n10897Th_FecF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10897Th_FecF", localUtil.ttoc( A10897Th_FecF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10898Th_Kgs = T019X5_A10898Th_Kgs[0] ;
         n10898Th_Kgs = T019X5_n10898Th_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10898Th_Kgs", GXutil.ltrimstr( A10898Th_Kgs, 9, 2));
         A10899Th_Treal = T019X5_A10899Th_Treal[0] ;
         n10899Th_Treal = T019X5_n10899Th_Treal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10899Th_Treal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10899Th_Treal), 4, 0));
         A10900Th_NAny = T019X5_A10900Th_NAny[0] ;
         n10900Th_NAny = T019X5_n10900Th_NAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10900Th_NAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10900Th_NAny), 4, 0));
         A10901Th_Lts = T019X5_A10901Th_Lts[0] ;
         n10901Th_Lts = T019X5_n10901Th_Lts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10901Th_Lts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10901Th_Lts), 5, 0));
         A10902Th_UltL = T019X5_A10902Th_UltL[0] ;
         n10902Th_UltL = T019X5_n10902Th_UltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10902Th_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10902Th_UltL), 4, 0));
         A10922Th_Num = T019X5_A10922Th_Num[0] ;
         n10922Th_Num = T019X5_n10922Th_Num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10922Th_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10922Th_Num), 4, 0));
         A10923Th_Tteo = T019X5_A10923Th_Tteo[0] ;
         n10923Th_Tteo = T019X5_n10923Th_Tteo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10923Th_Tteo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10923Th_Tteo), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z10891Th_Hdr = A10891Th_Hdr ;
         Z10892Th_r = A10892Th_r ;
         Z10893Th_p = A10893Th_p ;
         sMode1452 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load19X1452( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1452 = (short)(0) ;
            initializeNonKey19X1452( ) ;
         }
         Gx_mode = sMode1452 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1452 = (short)(0) ;
         initializeNonKey19X1452( ) ;
         sMode1452 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1452 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey19X1452( ) ;
      if ( RcdFound1452 == 0 )
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
      RcdFound1452 = (short)(0) ;
      /* Using cursor T019X9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A10891Th_Hdr), Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), Byte.valueOf(A10892Th_r), Integer.valueOf(A10891Th_Hdr), A10893Th_p, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T019X9_A10891Th_Hdr[0] < A10891Th_Hdr ) || ( T019X9_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( T019X9_A10892Th_r[0] < A10892Th_r ) || ( T019X9_A10892Th_r[0] == A10892Th_r ) && ( T019X9_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( GXutil.strcmp(T019X9_A10893Th_p[0], A10893Th_p) < 0 ) ) && ( GXutil.strcmp(T019X9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T019X9_A10891Th_Hdr[0] > A10891Th_Hdr ) || ( T019X9_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( T019X9_A10892Th_r[0] > A10892Th_r ) || ( T019X9_A10892Th_r[0] == A10892Th_r ) && ( T019X9_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( GXutil.strcmp(T019X9_A10893Th_p[0], A10893Th_p) > 0 ) ) && ( GXutil.strcmp(T019X9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10891Th_Hdr = T019X9_A10891Th_Hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
            A10892Th_r = T019X9_A10892Th_r[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
            A10893Th_p = T019X9_A10893Th_p[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
            RcdFound1452 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1452 = (short)(0) ;
      /* Using cursor T019X10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A10891Th_Hdr), Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), Byte.valueOf(A10892Th_r), Integer.valueOf(A10891Th_Hdr), A10893Th_p, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T019X10_A10891Th_Hdr[0] > A10891Th_Hdr ) || ( T019X10_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( T019X10_A10892Th_r[0] > A10892Th_r ) || ( T019X10_A10892Th_r[0] == A10892Th_r ) && ( T019X10_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( GXutil.strcmp(T019X10_A10893Th_p[0], A10893Th_p) > 0 ) ) && ( GXutil.strcmp(T019X10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T019X10_A10891Th_Hdr[0] < A10891Th_Hdr ) || ( T019X10_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( T019X10_A10892Th_r[0] < A10892Th_r ) || ( T019X10_A10892Th_r[0] == A10892Th_r ) && ( T019X10_A10891Th_Hdr[0] == A10891Th_Hdr ) && ( GXutil.strcmp(T019X10_A10893Th_p[0], A10893Th_p) < 0 ) ) && ( GXutil.strcmp(T019X10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10891Th_Hdr = T019X10_A10891Th_Hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
            A10892Th_r = T019X10_A10892Th_r[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
            A10893Th_p = T019X10_A10893Th_p[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
            RcdFound1452 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey19X1452( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTh_Hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert19X1452( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1452 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10891Th_Hdr != Z10891Th_Hdr ) || ( A10892Th_r != Z10892Th_r ) || ( GXutil.strcmp(A10893Th_p, Z10893Th_p) != 0 ) )
            {
               A10891Th_Hdr = Z10891Th_Hdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
               A10892Th_r = Z10892Th_r ;
               httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
               A10893Th_p = Z10893Th_p ;
               httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTh_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update19X1452( ) ;
               GX_FocusControl = edtTh_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10891Th_Hdr != Z10891Th_Hdr ) || ( A10892Th_r != Z10892Th_r ) || ( GXutil.strcmp(A10893Th_p, Z10893Th_p) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTh_Hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert19X1452( ) ;
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
                  GX_FocusControl = edtTh_Hdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert19X1452( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10891Th_Hdr != Z10891Th_Hdr ) || ( A10892Th_r != Z10892Th_r ) || ( GXutil.strcmp(A10893Th_p, Z10893Th_p) != 0 ) )
      {
         A10891Th_Hdr = Z10891Th_Hdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
         A10892Th_r = Z10892Th_r ;
         httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
         A10893Th_p = Z10893Th_p ;
         httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTh_Hdr_Internalname ;
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
      getKey19X1452( ) ;
      if ( RcdFound1452 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10891Th_Hdr != Z10891Th_Hdr ) || ( A10892Th_r != Z10892Th_r ) || ( GXutil.strcmp(A10893Th_p, Z10893Th_p) != 0 ) )
         {
            A10891Th_Hdr = Z10891Th_Hdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
            A10892Th_r = Z10892Th_r ;
            httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
            A10893Th_p = Z10893Th_p ;
            httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10891Th_Hdr != Z10891Th_Hdr ) || ( A10892Th_r != Z10892Th_r ) || ( GXutil.strcmp(A10893Th_p, Z10893Th_p) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttohost0");
      GX_FocusControl = edtTh_Maq_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_19X0( ) ;
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
      if ( RcdFound1452 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTh_Maq_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart19X1452( ) ;
      if ( RcdFound1452 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_Maq_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19X1452( ) ;
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
      if ( RcdFound1452 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_Maq_Internalname ;
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
      if ( RcdFound1452 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_Maq_Internalname ;
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
      scanStart19X1452( ) ;
      if ( RcdFound1452 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1452 != 0 )
         {
            scanNext19X1452( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_Maq_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19X1452( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency19X1452( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019X4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z10894Th_Maq, T019X4_A10894Th_Maq[0]) != 0 ) || ( GXutil.strcmp(Z10895Th_Tipo, T019X4_A10895Th_Tipo[0]) != 0 ) || !( GXutil.dateCompare(Z10896Th_FecI, T019X4_A10896Th_FecI[0]) ) || !( GXutil.dateCompare(Z10897Th_FecF, T019X4_A10897Th_FecF[0]) ) || ( DecimalUtil.compareTo(Z10898Th_Kgs, T019X4_A10898Th_Kgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10899Th_Treal != T019X4_A10899Th_Treal[0] ) || ( Z10900Th_NAny != T019X4_A10900Th_NAny[0] ) || ( Z10901Th_Lts != T019X4_A10901Th_Lts[0] ) || ( Z10902Th_UltL != T019X4_A10902Th_UltL[0] ) || ( Z10922Th_Num != T019X4_A10922Th_Num[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10923Th_Tteo != T019X4_A10923Th_Tteo[0] ) )
         {
            if ( GXutil.strcmp(Z10894Th_Maq, T019X4_A10894Th_Maq[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Maq");
               GXutil.writeLogRaw("Old: ",Z10894Th_Maq);
               GXutil.writeLogRaw("Current: ",T019X4_A10894Th_Maq[0]);
            }
            if ( GXutil.strcmp(Z10895Th_Tipo, T019X4_A10895Th_Tipo[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Tipo");
               GXutil.writeLogRaw("Old: ",Z10895Th_Tipo);
               GXutil.writeLogRaw("Current: ",T019X4_A10895Th_Tipo[0]);
            }
            if ( !( GXutil.dateCompare(Z10896Th_FecI, T019X4_A10896Th_FecI[0]) ) )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_FecI");
               GXutil.writeLogRaw("Old: ",Z10896Th_FecI);
               GXutil.writeLogRaw("Current: ",T019X4_A10896Th_FecI[0]);
            }
            if ( !( GXutil.dateCompare(Z10897Th_FecF, T019X4_A10897Th_FecF[0]) ) )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_FecF");
               GXutil.writeLogRaw("Old: ",Z10897Th_FecF);
               GXutil.writeLogRaw("Current: ",T019X4_A10897Th_FecF[0]);
            }
            if ( DecimalUtil.compareTo(Z10898Th_Kgs, T019X4_A10898Th_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Kgs");
               GXutil.writeLogRaw("Old: ",Z10898Th_Kgs);
               GXutil.writeLogRaw("Current: ",T019X4_A10898Th_Kgs[0]);
            }
            if ( Z10899Th_Treal != T019X4_A10899Th_Treal[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Treal");
               GXutil.writeLogRaw("Old: ",Z10899Th_Treal);
               GXutil.writeLogRaw("Current: ",T019X4_A10899Th_Treal[0]);
            }
            if ( Z10900Th_NAny != T019X4_A10900Th_NAny[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_NAny");
               GXutil.writeLogRaw("Old: ",Z10900Th_NAny);
               GXutil.writeLogRaw("Current: ",T019X4_A10900Th_NAny[0]);
            }
            if ( Z10901Th_Lts != T019X4_A10901Th_Lts[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Lts");
               GXutil.writeLogRaw("Old: ",Z10901Th_Lts);
               GXutil.writeLogRaw("Current: ",T019X4_A10901Th_Lts[0]);
            }
            if ( Z10902Th_UltL != T019X4_A10902Th_UltL[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_UltL");
               GXutil.writeLogRaw("Old: ",Z10902Th_UltL);
               GXutil.writeLogRaw("Current: ",T019X4_A10902Th_UltL[0]);
            }
            if ( Z10922Th_Num != T019X4_A10922Th_Num[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Num");
               GXutil.writeLogRaw("Old: ",Z10922Th_Num);
               GXutil.writeLogRaw("Current: ",T019X4_A10922Th_Num[0]);
            }
            if ( Z10923Th_Tteo != T019X4_A10923Th_Tteo[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Tteo");
               GXutil.writeLogRaw("Old: ",Z10923Th_Tteo);
               GXutil.writeLogRaw("Current: ",T019X4_A10923Th_Tteo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTOHOST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19X1452( )
   {
      beforeValidate19X1452( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19X1452( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19X1452( 0) ;
         checkOptimisticConcurrency19X1452( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19X1452( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19X1452( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019X11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Boolean.valueOf(n10894Th_Maq), A10894Th_Maq, Boolean.valueOf(n10895Th_Tipo), A10895Th_Tipo, Boolean.valueOf(n10896Th_FecI), A10896Th_FecI, Boolean.valueOf(n10897Th_FecF), A10897Th_FecF, Boolean.valueOf(n10898Th_Kgs), A10898Th_Kgs, Boolean.valueOf(n10899Th_Treal), Short.valueOf(A10899Th_Treal), Boolean.valueOf(n10900Th_NAny), Short.valueOf(A10900Th_NAny), Boolean.valueOf(n10901Th_Lts), Integer.valueOf(A10901Th_Lts), Boolean.valueOf(n10902Th_UltL), Short.valueOf(A10902Th_UltL), Boolean.valueOf(n10922Th_Num), Short.valueOf(A10922Th_Num), Boolean.valueOf(n10923Th_Tteo), Short.valueOf(A10923Th_Tteo), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOST");
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
                        processLevel19X1452( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption19X0( ) ;
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
            load19X1452( ) ;
         }
         endLevel19X1452( ) ;
      }
      closeExtendedTableCursors19X1452( ) ;
   }

   public void update19X1452( )
   {
      beforeValidate19X1452( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19X1452( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19X1452( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19X1452( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate19X1452( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019X12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n10894Th_Maq), A10894Th_Maq, Boolean.valueOf(n10895Th_Tipo), A10895Th_Tipo, Boolean.valueOf(n10896Th_FecI), A10896Th_FecI, Boolean.valueOf(n10897Th_FecF), A10897Th_FecF, Boolean.valueOf(n10898Th_Kgs), A10898Th_Kgs, Boolean.valueOf(n10899Th_Treal), Short.valueOf(A10899Th_Treal), Boolean.valueOf(n10900Th_NAny), Short.valueOf(A10900Th_NAny), Boolean.valueOf(n10901Th_Lts), Integer.valueOf(A10901Th_Lts), Boolean.valueOf(n10902Th_UltL), Short.valueOf(A10902Th_UltL), Boolean.valueOf(n10922Th_Num), Short.valueOf(A10922Th_Num), Boolean.valueOf(n10923Th_Tteo), Short.valueOf(A10923Th_Tteo), A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOST");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate19X1452( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel19X1452( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption19X0( ) ;
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
         endLevel19X1452( ) ;
      }
      closeExtendedTableCursors19X1452( ) ;
   }

   public void deferredUpdate19X1452( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19X1452( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19X1452( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19X1452( ) ;
         afterConfirm19X1452( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19X1452( ) ;
            if ( AnyError == 0 )
            {
               scanStart19X1453( ) ;
               while ( RcdFound1453 != 0 )
               {
                  getByPrimaryKey19X1453( ) ;
                  delete19X1453( ) ;
                  scanNext19X1453( ) ;
               }
               scanEnd19X1453( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019X13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOST");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1452 == 0 )
                        {
                           initAll19X1452( ) ;
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
                        resetCaption19X0( ) ;
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
      sMode1452 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19X1452( ) ;
      Gx_mode = sMode1452 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19X1452( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel19X1453( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow19X1453( ) ;
         if ( ( nRcdExists_1453 != 0 ) || ( nIsMod_1453 != 0 ) )
         {
            standaloneNotModal19X1453( ) ;
            getKey19X1453( ) ;
            if ( ( nRcdExists_1453 == 0 ) && ( nRcdDeleted_1453 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert19X1453( ) ;
            }
            else
            {
               if ( RcdFound1453 != 0 )
               {
                  if ( ( nRcdDeleted_1453 != 0 ) && ( nRcdExists_1453 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete19X1453( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1453 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update19X1453( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1453 == 0 )
                  {
                     GXCCtl = "TH_LINEA_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTh_Linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1453_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10903Th_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Prod_Internalname, GXutil.rtrim( A10904Th_Prod)) ;
         httpContext.changePostValue( edtTh_FecP_Internalname, localUtil.ttoc( A10905Th_FecP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtTh_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10906Th_Cant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Exis_Internalname, GXutil.ltrim( localUtil.ntoc( A10907Th_Exis, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_ProdAux_Internalname, GXutil.rtrim( A10919Th_ProdAux)) ;
         httpContext.changePostValue( edtTh_ProcF_Internalname, GXutil.rtrim( A10920Th_ProcF)) ;
         httpContext.changePostValue( edtTh_ProcL_Internalname, GXutil.ltrim( localUtil.ntoc( A10921Th_ProcL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_HmC_Internalname, GXutil.rtrim( A11302Th_HmC)) ;
         httpContext.changePostValue( "ZT_"+"Z10903Th_Linea_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10903Th_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10904Th_Prod_"+sGXsfl_100_idx, GXutil.rtrim( Z10904Th_Prod)) ;
         httpContext.changePostValue( "ZT_"+"Z10905Th_FecP_"+sGXsfl_100_idx, localUtil.ttoc( Z10905Th_FecP, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10906Th_Cant_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10906Th_Cant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10907Th_Exis_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10907Th_Exis, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10919Th_ProdAux_"+sGXsfl_100_idx, GXutil.rtrim( Z10919Th_ProdAux)) ;
         httpContext.changePostValue( "ZT_"+"Z10920Th_ProcF_"+sGXsfl_100_idx, GXutil.rtrim( Z10920Th_ProcF)) ;
         httpContext.changePostValue( "ZT_"+"Z10921Th_ProcL_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z10921Th_ProcL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11302Th_HmC_"+sGXsfl_100_idx, GXutil.rtrim( Z11302Th_HmC)) ;
         httpContext.changePostValue( "nRcdDeleted_1453_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1453_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1453_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1453 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1453_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1453_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_LINEA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PROD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Prod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_FECP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_FecP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_CANT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_EXIS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Exis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PRODAUX_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProdAux_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PROCF_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PROCL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_HMC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_HmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll19X1453( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1453 = (short)(0) ;
      nIsMod_1453 = (short)(0) ;
      nRcdDeleted_1453 = (short)(0) ;
   }

   public void processLevel19X1452( )
   {
      /* Save parent mode. */
      sMode1452 = Gx_mode ;
      processNestedLevel19X1453( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1452 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel19X1452( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete19X1452( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttohost0");
         if ( AnyError == 0 )
         {
            confirmValues19X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttohost0");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart19X1452( )
   {
      /* Scan By routine */
      /* Using cursor T019X14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound1452 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1452 = (short)(1) ;
         A10891Th_Hdr = T019X14_A10891Th_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
         A10892Th_r = T019X14_A10892Th_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
         A10893Th_p = T019X14_A10893Th_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19X1452( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1452 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1452 = (short)(1) ;
         A10891Th_Hdr = T019X14_A10891Th_Hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
         A10892Th_r = T019X14_A10892Th_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
         A10893Th_p = T019X14_A10893Th_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
      }
   }

   public void scanEnd19X1452( )
   {
      pr_default.close(12);
   }

   public void afterConfirm19X1452( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19X1452( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19X1452( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19X1452( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19X1452( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19X1452( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19X1452( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTh_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Hdr_Enabled), 5, 0), true);
      edtTh_r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_r_Enabled), 5, 0), true);
      edtTh_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_p_Enabled), 5, 0), true);
      edtTh_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Maq_Enabled), 5, 0), true);
      edtTh_Tipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Tipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Tipo_Enabled), 5, 0), true);
      edtTh_FecI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_FecI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_FecI_Enabled), 5, 0), true);
      edtTh_FecF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_FecF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_FecF_Enabled), 5, 0), true);
      edtTh_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Kgs_Enabled), 5, 0), true);
      edtTh_Treal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Treal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Treal_Enabled), 5, 0), true);
      edtTh_NAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_NAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_NAny_Enabled), 5, 0), true);
      edtTh_Lts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Lts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Lts_Enabled), 5, 0), true);
      edtTh_UltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_UltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_UltL_Enabled), 5, 0), true);
      edtTh_Num_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Num_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Num_Enabled), 5, 0), true);
      edtTh_Tteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Tteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Tteo_Enabled), 5, 0), true);
   }

   public void zm19X1453( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10904Th_Prod = T019X3_A10904Th_Prod[0] ;
            Z10905Th_FecP = T019X3_A10905Th_FecP[0] ;
            Z10906Th_Cant = T019X3_A10906Th_Cant[0] ;
            Z10907Th_Exis = T019X3_A10907Th_Exis[0] ;
            Z10919Th_ProdAux = T019X3_A10919Th_ProdAux[0] ;
            Z10920Th_ProcF = T019X3_A10920Th_ProcF[0] ;
            Z10921Th_ProcL = T019X3_A10921Th_ProcL[0] ;
            Z11302Th_HmC = T019X3_A11302Th_HmC[0] ;
         }
         else
         {
            Z10904Th_Prod = A10904Th_Prod ;
            Z10905Th_FecP = A10905Th_FecP ;
            Z10906Th_Cant = A10906Th_Cant ;
            Z10907Th_Exis = A10907Th_Exis ;
            Z10919Th_ProdAux = A10919Th_ProdAux ;
            Z10920Th_ProcF = A10920Th_ProcF ;
            Z10921Th_ProcL = A10921Th_ProcL ;
            Z11302Th_HmC = A11302Th_HmC ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10891Th_Hdr = A10891Th_Hdr ;
         Z10892Th_r = A10892Th_r ;
         Z10893Th_p = A10893Th_p ;
         Z10903Th_Linea = A10903Th_Linea ;
         Z10904Th_Prod = A10904Th_Prod ;
         Z10905Th_FecP = A10905Th_FecP ;
         Z10906Th_Cant = A10906Th_Cant ;
         Z10907Th_Exis = A10907Th_Exis ;
         Z10919Th_ProdAux = A10919Th_ProdAux ;
         Z10920Th_ProcF = A10920Th_ProcF ;
         Z10921Th_ProcL = A10921Th_ProcL ;
         Z11302Th_HmC = A11302Th_HmC ;
      }
   }

   public void standaloneNotModal19X1453( )
   {
   }

   public void standaloneModal19X1453( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTh_Linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTh_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Linea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtTh_Linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTh_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Linea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
   }

   public void load19X1453( )
   {
      /* Using cursor T019X15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1453 = (short)(1) ;
         A10904Th_Prod = T019X15_A10904Th_Prod[0] ;
         n10904Th_Prod = T019X15_n10904Th_Prod[0] ;
         A10905Th_FecP = T019X15_A10905Th_FecP[0] ;
         n10905Th_FecP = T019X15_n10905Th_FecP[0] ;
         A10906Th_Cant = T019X15_A10906Th_Cant[0] ;
         n10906Th_Cant = T019X15_n10906Th_Cant[0] ;
         A10907Th_Exis = T019X15_A10907Th_Exis[0] ;
         n10907Th_Exis = T019X15_n10907Th_Exis[0] ;
         A10919Th_ProdAux = T019X15_A10919Th_ProdAux[0] ;
         n10919Th_ProdAux = T019X15_n10919Th_ProdAux[0] ;
         A10920Th_ProcF = T019X15_A10920Th_ProcF[0] ;
         n10920Th_ProcF = T019X15_n10920Th_ProcF[0] ;
         A10921Th_ProcL = T019X15_A10921Th_ProcL[0] ;
         n10921Th_ProcL = T019X15_n10921Th_ProcL[0] ;
         A11302Th_HmC = T019X15_A11302Th_HmC[0] ;
         n11302Th_HmC = T019X15_n11302Th_HmC[0] ;
         zm19X1453( -3) ;
      }
      pr_default.close(13);
      onLoadActions19X1453( ) ;
   }

   public void onLoadActions19X1453( )
   {
   }

   public void checkExtendedTable19X1453( )
   {
      nIsDirty_1453 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal19X1453( ) ;
   }

   public void closeExtendedTableCursors19X1453( )
   {
   }

   public void enableDisable19X1453( )
   {
   }

   public void getKey19X1453( )
   {
      /* Using cursor T019X16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1453 = (short)(1) ;
      }
      else
      {
         RcdFound1453 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey19X1453( )
   {
      /* Using cursor T019X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T019X3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19X1453( 3) ;
         RcdFound1453 = (short)(1) ;
         initializeNonKey19X1453( ) ;
         A10903Th_Linea = T019X3_A10903Th_Linea[0] ;
         A10904Th_Prod = T019X3_A10904Th_Prod[0] ;
         n10904Th_Prod = T019X3_n10904Th_Prod[0] ;
         A10905Th_FecP = T019X3_A10905Th_FecP[0] ;
         n10905Th_FecP = T019X3_n10905Th_FecP[0] ;
         A10906Th_Cant = T019X3_A10906Th_Cant[0] ;
         n10906Th_Cant = T019X3_n10906Th_Cant[0] ;
         A10907Th_Exis = T019X3_A10907Th_Exis[0] ;
         n10907Th_Exis = T019X3_n10907Th_Exis[0] ;
         A10919Th_ProdAux = T019X3_A10919Th_ProdAux[0] ;
         n10919Th_ProdAux = T019X3_n10919Th_ProdAux[0] ;
         A10920Th_ProcF = T019X3_A10920Th_ProcF[0] ;
         n10920Th_ProcF = T019X3_n10920Th_ProcF[0] ;
         A10921Th_ProcL = T019X3_A10921Th_ProcL[0] ;
         n10921Th_ProcL = T019X3_n10921Th_ProcL[0] ;
         A11302Th_HmC = T019X3_A11302Th_HmC[0] ;
         n11302Th_HmC = T019X3_n11302Th_HmC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10891Th_Hdr = A10891Th_Hdr ;
         Z10892Th_r = A10892Th_r ;
         Z10893Th_p = A10893Th_p ;
         Z10903Th_Linea = A10903Th_Linea ;
         sMode1453 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal19X1453( ) ;
         load19X1453( ) ;
         Gx_mode = sMode1453 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1453 = (short)(0) ;
         initializeNonKey19X1453( ) ;
         sMode1453 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal19X1453( ) ;
         Gx_mode = sMode1453 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes19X1453( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency19X1453( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOS1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10904Th_Prod, T019X2_A10904Th_Prod[0]) != 0 ) || !( GXutil.dateCompare(Z10905Th_FecP, T019X2_A10905Th_FecP[0]) ) || ( DecimalUtil.compareTo(Z10906Th_Cant, T019X2_A10906Th_Cant[0]) != 0 ) || ( DecimalUtil.compareTo(Z10907Th_Exis, T019X2_A10907Th_Exis[0]) != 0 ) || ( GXutil.strcmp(Z10919Th_ProdAux, T019X2_A10919Th_ProdAux[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10920Th_ProcF, T019X2_A10920Th_ProcF[0]) != 0 ) || ( Z10921Th_ProcL != T019X2_A10921Th_ProcL[0] ) || ( GXutil.strcmp(Z11302Th_HmC, T019X2_A11302Th_HmC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10904Th_Prod, T019X2_A10904Th_Prod[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Prod");
               GXutil.writeLogRaw("Old: ",Z10904Th_Prod);
               GXutil.writeLogRaw("Current: ",T019X2_A10904Th_Prod[0]);
            }
            if ( !( GXutil.dateCompare(Z10905Th_FecP, T019X2_A10905Th_FecP[0]) ) )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_FecP");
               GXutil.writeLogRaw("Old: ",Z10905Th_FecP);
               GXutil.writeLogRaw("Current: ",T019X2_A10905Th_FecP[0]);
            }
            if ( DecimalUtil.compareTo(Z10906Th_Cant, T019X2_A10906Th_Cant[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Cant");
               GXutil.writeLogRaw("Old: ",Z10906Th_Cant);
               GXutil.writeLogRaw("Current: ",T019X2_A10906Th_Cant[0]);
            }
            if ( DecimalUtil.compareTo(Z10907Th_Exis, T019X2_A10907Th_Exis[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_Exis");
               GXutil.writeLogRaw("Old: ",Z10907Th_Exis);
               GXutil.writeLogRaw("Current: ",T019X2_A10907Th_Exis[0]);
            }
            if ( GXutil.strcmp(Z10919Th_ProdAux, T019X2_A10919Th_ProdAux[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_ProdAux");
               GXutil.writeLogRaw("Old: ",Z10919Th_ProdAux);
               GXutil.writeLogRaw("Current: ",T019X2_A10919Th_ProdAux[0]);
            }
            if ( GXutil.strcmp(Z10920Th_ProcF, T019X2_A10920Th_ProcF[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_ProcF");
               GXutil.writeLogRaw("Old: ",Z10920Th_ProcF);
               GXutil.writeLogRaw("Current: ",T019X2_A10920Th_ProcF[0]);
            }
            if ( Z10921Th_ProcL != T019X2_A10921Th_ProcL[0] )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_ProcL");
               GXutil.writeLogRaw("Old: ",Z10921Th_ProcL);
               GXutil.writeLogRaw("Current: ",T019X2_A10921Th_ProcL[0]);
            }
            if ( GXutil.strcmp(Z11302Th_HmC, T019X2_A11302Th_HmC[0]) != 0 )
            {
               GXutil.writeLogln("ttohost0:[seudo value changed for attri]"+"Th_HmC");
               GXutil.writeLogRaw("Old: ",Z11302Th_HmC);
               GXutil.writeLogRaw("Current: ",T019X2_A11302Th_HmC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTOHOS1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19X1453( )
   {
      beforeValidate19X1453( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19X1453( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19X1453( 0) ;
         checkOptimisticConcurrency19X1453( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19X1453( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19X1453( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019X17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea), Boolean.valueOf(n10904Th_Prod), A10904Th_Prod, Boolean.valueOf(n10905Th_FecP), A10905Th_FecP, Boolean.valueOf(n10906Th_Cant), A10906Th_Cant, Boolean.valueOf(n10907Th_Exis), A10907Th_Exis, Boolean.valueOf(n10919Th_ProdAux), A10919Th_ProdAux, Boolean.valueOf(n10920Th_ProcF), A10920Th_ProcF, Boolean.valueOf(n10921Th_ProcL), Short.valueOf(A10921Th_ProcL), Boolean.valueOf(n11302Th_HmC), A11302Th_HmC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS1");
                  if ( (pr_default.getStatus(15) == 1) )
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
            load19X1453( ) ;
         }
         endLevel19X1453( ) ;
      }
      closeExtendedTableCursors19X1453( ) ;
   }

   public void update19X1453( )
   {
      beforeValidate19X1453( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19X1453( ) ;
      }
      if ( ( nIsMod_1453 != 0 ) || ( nIsDirty_1453 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency19X1453( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm19X1453( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate19X1453( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T019X18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n10904Th_Prod), A10904Th_Prod, Boolean.valueOf(n10905Th_FecP), A10905Th_FecP, Boolean.valueOf(n10906Th_Cant), A10906Th_Cant, Boolean.valueOf(n10907Th_Exis), A10907Th_Exis, Boolean.valueOf(n10919Th_ProdAux), A10919Th_ProdAux, Boolean.valueOf(n10920Th_ProcF), A10920Th_ProcF, Boolean.valueOf(n10921Th_ProcL), Short.valueOf(A10921Th_ProcL), Boolean.valueOf(n11302Th_HmC), A11302Th_HmC, A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS1");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOS1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate19X1453( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey19X1453( ) ;
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
            endLevel19X1453( ) ;
         }
      }
      closeExtendedTableCursors19X1453( ) ;
   }

   public void deferredUpdate19X1453( )
   {
   }

   public void delete19X1453( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19X1453( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19X1453( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19X1453( ) ;
         afterConfirm19X1453( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19X1453( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019X19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p, Short.valueOf(A10903Th_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS1");
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
      sMode1453 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19X1453( ) ;
      Gx_mode = sMode1453 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19X1453( )
   {
      standaloneModal19X1453( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel19X1453( )
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

   public void scanStart19X1453( )
   {
      /* Scan By routine */
      /* Using cursor T019X20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A10891Th_Hdr), Byte.valueOf(A10892Th_r), A10893Th_p});
      RcdFound1453 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1453 = (short)(1) ;
         A10903Th_Linea = T019X20_A10903Th_Linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19X1453( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1453 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1453 = (short)(1) ;
         A10903Th_Linea = T019X20_A10903Th_Linea[0] ;
      }
   }

   public void scanEnd19X1453( )
   {
      pr_default.close(18);
   }

   public void afterConfirm19X1453( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19X1453( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19X1453( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19X1453( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19X1453( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19X1453( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19X1453( )
   {
      edtTh_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Linea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_Prod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Prod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Prod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_FecP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_FecP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_FecP_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Cant_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_Exis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Exis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Exis_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_ProdAux_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_ProdAux_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_ProdAux_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_ProcF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_ProcF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_ProcF_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_ProcL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_ProcL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_ProcL_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtTh_HmC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_HmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_HmC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void send_integrity_lvl_hashes19X1453( )
   {
   }

   public void send_integrity_lvl_hashes19X1452( )
   {
   }

   public void subsflControlProps_1001453( )
   {
      edtavnRcdDeleted_1453_Internalname = "vNRCDDELETED_1453_"+sGXsfl_100_idx ;
      edtTh_Linea_Internalname = "TH_LINEA_"+sGXsfl_100_idx ;
      edtTh_Prod_Internalname = "TH_PROD_"+sGXsfl_100_idx ;
      edtTh_FecP_Internalname = "TH_FECP_"+sGXsfl_100_idx ;
      edtTh_Cant_Internalname = "TH_CANT_"+sGXsfl_100_idx ;
      edtTh_Exis_Internalname = "TH_EXIS_"+sGXsfl_100_idx ;
      edtTh_ProdAux_Internalname = "TH_PRODAUX_"+sGXsfl_100_idx ;
      edtTh_ProcF_Internalname = "TH_PROCF_"+sGXsfl_100_idx ;
      edtTh_ProcL_Internalname = "TH_PROCL_"+sGXsfl_100_idx ;
      edtTh_HmC_Internalname = "TH_HMC_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_1001453( )
   {
      edtavnRcdDeleted_1453_Internalname = "vNRCDDELETED_1453_"+sGXsfl_100_fel_idx ;
      edtTh_Linea_Internalname = "TH_LINEA_"+sGXsfl_100_fel_idx ;
      edtTh_Prod_Internalname = "TH_PROD_"+sGXsfl_100_fel_idx ;
      edtTh_FecP_Internalname = "TH_FECP_"+sGXsfl_100_fel_idx ;
      edtTh_Cant_Internalname = "TH_CANT_"+sGXsfl_100_fel_idx ;
      edtTh_Exis_Internalname = "TH_EXIS_"+sGXsfl_100_fel_idx ;
      edtTh_ProdAux_Internalname = "TH_PRODAUX_"+sGXsfl_100_fel_idx ;
      edtTh_ProcF_Internalname = "TH_PROCF_"+sGXsfl_100_fel_idx ;
      edtTh_ProcL_Internalname = "TH_PROCL_"+sGXsfl_100_fel_idx ;
      edtTh_HmC_Internalname = "TH_HMC_"+sGXsfl_100_fel_idx ;
   }

   public void addRow19X1453( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001453( ) ;
      sendRow19X1453( ) ;
   }

   public void sendRow19X1453( )
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
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1453_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1453_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1453), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1453), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1453_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1453_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A10903Th_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10903Th_Linea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Linea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Prod_Internalname,GXutil.rtrim( A10904Th_Prod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Prod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Prod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_FecP_Internalname,localUtil.ttoc( A10905Th_FecP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10905Th_FecP, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_FecP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_FecP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A10906Th_Cant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTh_Cant_Enabled!=0) ? localUtil.format( A10906Th_Cant, "ZZZZZZ9.99") : localUtil.format( A10906Th_Cant, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Cant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Cant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Exis_Internalname,GXutil.ltrim( localUtil.ntoc( A10907Th_Exis, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTh_Exis_Enabled!=0) ? localUtil.format( A10907Th_Exis, "ZZZZZZ9.99") : localUtil.format( A10907Th_Exis, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Exis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Exis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_ProdAux_Internalname,GXutil.rtrim( A10919Th_ProdAux),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_ProdAux_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_ProdAux_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_ProcF_Internalname,GXutil.rtrim( A10920Th_ProcF),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_ProcF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_ProcF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_ProcL_Internalname,GXutil.ltrim( localUtil.ntoc( A10921Th_ProcL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTh_ProcL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10921Th_ProcL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10921Th_ProcL), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_ProcL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_ProcL_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1453_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_HmC_Internalname,GXutil.rtrim( A11302Th_HmC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_HmC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_HmC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes19X1453( ) ;
      GXCCtl = "Z10903Th_Linea_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10903Th_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10904Th_Prod_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10904Th_Prod));
      GXCCtl = "Z10905Th_FecP_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10905Th_FecP, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10906Th_Cant_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10906Th_Cant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10907Th_Exis_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10907Th_Exis, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10919Th_ProdAux_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10919Th_ProdAux));
      GXCCtl = "Z10920Th_ProcF_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10920Th_ProcF));
      GXCCtl = "Z10921Th_ProcL_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10921Th_ProcL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11302Th_HmC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11302Th_HmC));
      GXCCtl = "nRcdDeleted_1453_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1453_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1453_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1453, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1453_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1453_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_LINEA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_PROD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Prod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_FECP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_FecP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_CANT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_EXIS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Exis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_PRODAUX_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProdAux_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_PROCF_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_PROCL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_HMC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_HmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow19X1453( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001453( ) ;
      edtavnRcdDeleted_1453_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1453_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_LINEA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Prod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PROD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_FecP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_FECP_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_CANT_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Exis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_EXIS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_ProdAux_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PRODAUX_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_ProcF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PROCF_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_ProcL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PROCL_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_HmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_HMC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1453_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1453_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1453");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1453_Internalname ;
         wbErr = true ;
         nRcdDeleted_1453 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1453 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1453_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TH_LINEA_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_Linea_Internalname ;
         wbErr = true ;
         A10903Th_Linea = (short)(0) ;
      }
      else
      {
         A10903Th_Linea = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10904Th_Prod = httpContext.cgiGet( edtTh_Prod_Internalname) ;
      n10904Th_Prod = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtTh_FecP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "TH_FECP_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_FecP_Internalname ;
         wbErr = true ;
         A10905Th_FecP = GXutil.resetTime( GXutil.nullDate() );
         n10905Th_FecP = false ;
      }
      else
      {
         A10905Th_FecP = localUtil.ctot( httpContext.cgiGet( edtTh_FecP_Internalname)) ;
         n10905Th_FecP = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTh_Cant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTh_Cant_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "TH_CANT_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_Cant_Internalname ;
         wbErr = true ;
         A10906Th_Cant = DecimalUtil.ZERO ;
         n10906Th_Cant = false ;
      }
      else
      {
         A10906Th_Cant = localUtil.ctond( httpContext.cgiGet( edtTh_Cant_Internalname)) ;
         n10906Th_Cant = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTh_Exis_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTh_Exis_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "TH_EXIS_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_Exis_Internalname ;
         wbErr = true ;
         A10907Th_Exis = DecimalUtil.ZERO ;
         n10907Th_Exis = false ;
      }
      else
      {
         A10907Th_Exis = localUtil.ctond( httpContext.cgiGet( edtTh_Exis_Internalname)) ;
         n10907Th_Exis = false ;
      }
      A10919Th_ProdAux = httpContext.cgiGet( edtTh_ProdAux_Internalname) ;
      n10919Th_ProdAux = false ;
      A10920Th_ProcF = httpContext.cgiGet( edtTh_ProcF_Internalname) ;
      n10920Th_ProcF = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_ProcL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_ProcL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TH_PROCL_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_ProcL_Internalname ;
         wbErr = true ;
         A10921Th_ProcL = (short)(0) ;
         n10921Th_ProcL = false ;
      }
      else
      {
         A10921Th_ProcL = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_ProcL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10921Th_ProcL = false ;
      }
      A11302Th_HmC = httpContext.cgiGet( edtTh_HmC_Internalname) ;
      n11302Th_HmC = false ;
      GXCCtl = "Z10903Th_Linea_" + sGXsfl_100_idx ;
      Z10903Th_Linea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10904Th_Prod_" + sGXsfl_100_idx ;
      Z10904Th_Prod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10905Th_FecP_" + sGXsfl_100_idx ;
      Z10905Th_FecP = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10906Th_Cant_" + sGXsfl_100_idx ;
      Z10906Th_Cant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10907Th_Exis_" + sGXsfl_100_idx ;
      Z10907Th_Exis = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10919Th_ProdAux_" + sGXsfl_100_idx ;
      Z10919Th_ProdAux = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10920Th_ProcF_" + sGXsfl_100_idx ;
      Z10920Th_ProcF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10921Th_ProcL_" + sGXsfl_100_idx ;
      Z10921Th_ProcL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11302Th_HmC_" + sGXsfl_100_idx ;
      Z11302Th_HmC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1453_" + sGXsfl_100_idx ;
      nRcdDeleted_1453 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1453_" + sGXsfl_100_idx ;
      nRcdExists_1453 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1453_" + sGXsfl_100_idx ;
      nIsMod_1453 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTh_Linea_Enabled = edtTh_Linea_Enabled ;
   }

   public void confirmValues19X0( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001453( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001453( ) ;
         httpContext.changePostValue( "Z10903Th_Linea_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10903Th_Linea_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10903Th_Linea_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10904Th_Prod_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10904Th_Prod_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10904Th_Prod_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10905Th_FecP_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10905Th_FecP_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10905Th_FecP_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10906Th_Cant_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10906Th_Cant_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10906Th_Cant_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10907Th_Exis_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10907Th_Exis_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10907Th_Exis_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10919Th_ProdAux_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10919Th_ProdAux_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10919Th_ProdAux_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10920Th_ProcF_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10920Th_ProcF_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10920Th_ProcF_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z10921Th_ProcL_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z10921Th_ProcL_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10921Th_ProcL_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z11302Th_HmC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z11302Th_HmC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11302Th_HmC_"+sGXsfl_100_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttohost0", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10891Th_Hdr", GXutil.ltrim( localUtil.ntoc( Z10891Th_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10892Th_r", GXutil.ltrim( localUtil.ntoc( Z10892Th_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10893Th_p", GXutil.rtrim( Z10893Th_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10894Th_Maq", GXutil.rtrim( Z10894Th_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10895Th_Tipo", GXutil.rtrim( Z10895Th_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10896Th_FecI", localUtil.ttoc( Z10896Th_FecI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10897Th_FecF", localUtil.ttoc( Z10897Th_FecF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10898Th_Kgs", GXutil.ltrim( localUtil.ntoc( Z10898Th_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10899Th_Treal", GXutil.ltrim( localUtil.ntoc( Z10899Th_Treal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10900Th_NAny", GXutil.ltrim( localUtil.ntoc( Z10900Th_NAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10901Th_Lts", GXutil.ltrim( localUtil.ntoc( Z10901Th_Lts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10902Th_UltL", GXutil.ltrim( localUtil.ntoc( Z10902Th_UltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10922Th_Num", GXutil.ltrim( localUtil.ntoc( Z10922Th_Num, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10923Th_Tteo", GXutil.ltrim( localUtil.ntoc( Z10923Th_Tteo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttohost0", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTOHOST0" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TOHOST0", "") ;
   }

   public void initializeNonKey19X1452( )
   {
      A10894Th_Maq = "" ;
      n10894Th_Maq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
      A10895Th_Tipo = "" ;
      n10895Th_Tipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10895Th_Tipo", A10895Th_Tipo);
      A10896Th_FecI = GXutil.resetTime( GXutil.nullDate() );
      n10896Th_FecI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10896Th_FecI", localUtil.ttoc( A10896Th_FecI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10897Th_FecF = GXutil.resetTime( GXutil.nullDate() );
      n10897Th_FecF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10897Th_FecF", localUtil.ttoc( A10897Th_FecF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10898Th_Kgs = DecimalUtil.ZERO ;
      n10898Th_Kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10898Th_Kgs", GXutil.ltrimstr( A10898Th_Kgs, 9, 2));
      A10899Th_Treal = (short)(0) ;
      n10899Th_Treal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10899Th_Treal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10899Th_Treal), 4, 0));
      A10900Th_NAny = (short)(0) ;
      n10900Th_NAny = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10900Th_NAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10900Th_NAny), 4, 0));
      A10901Th_Lts = 0 ;
      n10901Th_Lts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10901Th_Lts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10901Th_Lts), 5, 0));
      A10902Th_UltL = (short)(0) ;
      n10902Th_UltL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10902Th_UltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10902Th_UltL), 4, 0));
      A10922Th_Num = (short)(0) ;
      n10922Th_Num = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10922Th_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10922Th_Num), 4, 0));
      A10923Th_Tteo = (short)(0) ;
      n10923Th_Tteo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10923Th_Tteo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10923Th_Tteo), 4, 0));
      Z10894Th_Maq = "" ;
      Z10895Th_Tipo = "" ;
      Z10896Th_FecI = GXutil.resetTime( GXutil.nullDate() );
      Z10897Th_FecF = GXutil.resetTime( GXutil.nullDate() );
      Z10898Th_Kgs = DecimalUtil.ZERO ;
      Z10899Th_Treal = (short)(0) ;
      Z10900Th_NAny = (short)(0) ;
      Z10901Th_Lts = 0 ;
      Z10902Th_UltL = (short)(0) ;
      Z10922Th_Num = (short)(0) ;
      Z10923Th_Tteo = (short)(0) ;
   }

   public void initAll19X1452( )
   {
      A10891Th_Hdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10891Th_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10891Th_Hdr), 8, 0));
      A10892Th_r = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10892Th_r", GXutil.str( A10892Th_r, 1, 0));
      A10893Th_p = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10893Th_p", A10893Th_p);
      initializeNonKey19X1452( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey19X1453( )
   {
      A10904Th_Prod = "" ;
      n10904Th_Prod = false ;
      A10905Th_FecP = GXutil.resetTime( GXutil.nullDate() );
      n10905Th_FecP = false ;
      A10906Th_Cant = DecimalUtil.ZERO ;
      n10906Th_Cant = false ;
      A10907Th_Exis = DecimalUtil.ZERO ;
      n10907Th_Exis = false ;
      A10919Th_ProdAux = "" ;
      n10919Th_ProdAux = false ;
      A10920Th_ProcF = "" ;
      n10920Th_ProcF = false ;
      A10921Th_ProcL = (short)(0) ;
      n10921Th_ProcL = false ;
      A11302Th_HmC = "" ;
      n11302Th_HmC = false ;
      Z10904Th_Prod = "" ;
      Z10905Th_FecP = GXutil.resetTime( GXutil.nullDate() );
      Z10906Th_Cant = DecimalUtil.ZERO ;
      Z10907Th_Exis = DecimalUtil.ZERO ;
      Z10919Th_ProdAux = "" ;
      Z10920Th_ProcF = "" ;
      Z10921Th_ProcL = (short)(0) ;
      Z11302Th_HmC = "" ;
   }

   public void initAll19X1453( )
   {
      A10903Th_Linea = (short)(0) ;
      initializeNonKey19X1453( ) ;
   }

   public void standaloneModalInsert19X1453( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156797", true, true);
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
      httpContext.AddJavascriptSource("ttohost0.js", "?2026824156798", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1453( )
   {
      edtTh_Linea_Enabled = defedtTh_Linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Linea_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void startgridcontrol100( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1453, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1453_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10903Th_Linea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10904Th_Prod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Prod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10905Th_FecP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_FecP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10906Th_Cant, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10907Th_Exis, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Exis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10919Th_ProdAux));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProdAux_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10920Th_ProcF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10921Th_ProcL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_ProcL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11302Th_HmC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_HmC_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTh_Hdr_Internalname = "TH_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTh_r_Internalname = "TH_R" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTh_p_Internalname = "TH_P" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTh_Maq_Internalname = "TH_MAQ" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTh_Tipo_Internalname = "TH_TIPO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTh_FecI_Internalname = "TH_FECI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTh_FecF_Internalname = "TH_FECF" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTh_Kgs_Internalname = "TH_KGS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTh_Treal_Internalname = "TH_TREAL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTh_NAny_Internalname = "TH_NANY" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTh_Lts_Internalname = "TH_LTS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTh_UltL_Internalname = "TH_ULTL" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtTh_Num_Internalname = "TH_NUM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtTh_Tteo_Internalname = "TH_TTEO" ;
      edtavnRcdDeleted_1453_Internalname = "vNRCDDELETED_1453" ;
      edtTh_Linea_Internalname = "TH_LINEA" ;
      edtTh_Prod_Internalname = "TH_PROD" ;
      edtTh_FecP_Internalname = "TH_FECP" ;
      edtTh_Cant_Internalname = "TH_CANT" ;
      edtTh_Exis_Internalname = "TH_EXIS" ;
      edtTh_ProdAux_Internalname = "TH_PRODAUX" ;
      edtTh_ProcF_Internalname = "TH_PROCF" ;
      edtTh_ProcL_Internalname = "TH_PROCL" ;
      edtTh_HmC_Internalname = "TH_HMC" ;
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
      Form.setCaption( httpContext.getMessage( "TOHOST0", "") );
      edtTh_HmC_Jsonclick = "" ;
      edtTh_ProcL_Jsonclick = "" ;
      edtTh_ProcF_Jsonclick = "" ;
      edtTh_ProdAux_Jsonclick = "" ;
      edtTh_Exis_Jsonclick = "" ;
      edtTh_Cant_Jsonclick = "" ;
      edtTh_FecP_Jsonclick = "" ;
      edtTh_Prod_Jsonclick = "" ;
      edtTh_Linea_Jsonclick = "" ;
      edtavnRcdDeleted_1453_Jsonclick = "" ;
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
      edtTh_HmC_Enabled = 1 ;
      edtTh_ProcL_Enabled = 1 ;
      edtTh_ProcF_Enabled = 1 ;
      edtTh_ProdAux_Enabled = 1 ;
      edtTh_Exis_Enabled = 1 ;
      edtTh_Cant_Enabled = 1 ;
      edtTh_FecP_Enabled = 1 ;
      edtTh_Prod_Enabled = 1 ;
      edtTh_Linea_Enabled = 1 ;
      edtavnRcdDeleted_1453_Enabled = 1 ;
      edtTh_Tteo_Jsonclick = "" ;
      edtTh_Tteo_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Tteo_Enabled = 1 ;
      edtTh_Num_Jsonclick = "" ;
      edtTh_Num_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Num_Enabled = 1 ;
      edtTh_UltL_Jsonclick = "" ;
      edtTh_UltL_Backcolor = (int)(0xFFFFFF) ;
      edtTh_UltL_Enabled = 1 ;
      edtTh_Lts_Jsonclick = "" ;
      edtTh_Lts_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Lts_Enabled = 1 ;
      edtTh_NAny_Jsonclick = "" ;
      edtTh_NAny_Backcolor = (int)(0xFFFFFF) ;
      edtTh_NAny_Enabled = 1 ;
      edtTh_Treal_Jsonclick = "" ;
      edtTh_Treal_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Treal_Enabled = 1 ;
      edtTh_Kgs_Jsonclick = "" ;
      edtTh_Kgs_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Kgs_Enabled = 1 ;
      edtTh_FecF_Jsonclick = "" ;
      edtTh_FecF_Backcolor = (int)(0xFFFFFF) ;
      edtTh_FecF_Enabled = 1 ;
      edtTh_FecI_Jsonclick = "" ;
      edtTh_FecI_Backcolor = (int)(0xFFFFFF) ;
      edtTh_FecI_Enabled = 1 ;
      edtTh_Tipo_Jsonclick = "" ;
      edtTh_Tipo_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Tipo_Enabled = 1 ;
      edtTh_Maq_Jsonclick = "" ;
      edtTh_Maq_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Maq_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTh_p_Jsonclick = "" ;
      edtTh_p_Backcolor = (int)(0xFFFFFF) ;
      edtTh_p_Enabled = 1 ;
      edtTh_r_Jsonclick = "" ;
      edtTh_r_Backcolor = (int)(0xFFFFFF) ;
      edtTh_r_Enabled = 1 ;
      edtTh_Hdr_Jsonclick = "" ;
      edtTh_Hdr_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Hdr_Enabled = 1 ;
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
      subsflControlProps_1001453( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal19X1453( ) ;
         standaloneModal19X1453( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow19X1453( ) ;
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001453( ) ;
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
      /* Using cursor T019X21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019X21_A407EmprNom[0] ;
      n407EmprNom = T019X21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      GX_FocusControl = edtTh_Maq_Internalname ;
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

   public void valid_Th_p( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", GXutil.rtrim( A10894Th_Maq));
      httpContext.ajax_rsp_assign_attri("", false, "A10895Th_Tipo", GXutil.rtrim( A10895Th_Tipo));
      httpContext.ajax_rsp_assign_attri("", false, "A10896Th_FecI", localUtil.ttoc( A10896Th_FecI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10897Th_FecF", localUtil.ttoc( A10897Th_FecF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10898Th_Kgs", GXutil.ltrim( localUtil.ntoc( A10898Th_Kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10899Th_Treal", GXutil.ltrim( localUtil.ntoc( A10899Th_Treal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10900Th_NAny", GXutil.ltrim( localUtil.ntoc( A10900Th_NAny, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10901Th_Lts", GXutil.ltrim( localUtil.ntoc( A10901Th_Lts, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10902Th_UltL", GXutil.ltrim( localUtil.ntoc( A10902Th_UltL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10922Th_Num", GXutil.ltrim( localUtil.ntoc( A10922Th_Num, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10923Th_Tteo", GXutil.ltrim( localUtil.ntoc( A10923Th_Tteo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10891Th_Hdr", GXutil.ltrim( localUtil.ntoc( Z10891Th_Hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10892Th_r", GXutil.ltrim( localUtil.ntoc( Z10892Th_r, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10893Th_p", GXutil.rtrim( Z10893Th_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10894Th_Maq", GXutil.rtrim( Z10894Th_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10895Th_Tipo", GXutil.rtrim( Z10895Th_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10896Th_FecI", localUtil.ttoc( Z10896Th_FecI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10897Th_FecF", localUtil.ttoc( Z10897Th_FecF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10898Th_Kgs", GXutil.ltrim( localUtil.ntoc( Z10898Th_Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10899Th_Treal", GXutil.ltrim( localUtil.ntoc( Z10899Th_Treal, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10900Th_NAny", GXutil.ltrim( localUtil.ntoc( Z10900Th_NAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10901Th_Lts", GXutil.ltrim( localUtil.ntoc( Z10901Th_Lts, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10902Th_UltL", GXutil.ltrim( localUtil.ntoc( Z10902Th_UltL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10922Th_Num", GXutil.ltrim( localUtil.ntoc( Z10922Th_Num, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10923Th_Tteo", GXutil.ltrim( localUtil.ntoc( Z10923Th_Tteo, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_TH_HDR","{handler:'valid_Th_hdr',iparms:[]");
      setEventMetadata("VALID_TH_HDR",",oparms:[]}");
      setEventMetadata("VALID_TH_R","{handler:'valid_Th_r',iparms:[]");
      setEventMetadata("VALID_TH_R",",oparms:[]}");
      setEventMetadata("VALID_TH_P","{handler:'valid_Th_p',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10891Th_Hdr',fld:'TH_HDR',pic:'ZZZZZZZ9'},{av:'A10892Th_r',fld:'TH_R',pic:'9'},{av:'A10893Th_p',fld:'TH_P',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TH_P",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10894Th_Maq',fld:'TH_MAQ',pic:''},{av:'A10895Th_Tipo',fld:'TH_TIPO',pic:''},{av:'A10896Th_FecI',fld:'TH_FECI',pic:'99/99/99 99:99'},{av:'A10897Th_FecF',fld:'TH_FECF',pic:'99/99/99 99:99'},{av:'A10898Th_Kgs',fld:'TH_KGS',pic:'ZZZZZ9.99'},{av:'A10899Th_Treal',fld:'TH_TREAL',pic:'ZZZ9'},{av:'A10900Th_NAny',fld:'TH_NANY',pic:'ZZZ9'},{av:'A10901Th_Lts',fld:'TH_LTS',pic:'ZZZZ9'},{av:'A10902Th_UltL',fld:'TH_ULTL',pic:'ZZZ9'},{av:'A10922Th_Num',fld:'TH_NUM',pic:'ZZZ9'},{av:'A10923Th_Tteo',fld:'TH_TTEO',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10891Th_Hdr'},{av:'Z10892Th_r'},{av:'Z10893Th_p'},{av:'Z407EmprNom'},{av:'Z10894Th_Maq'},{av:'Z10895Th_Tipo'},{av:'Z10896Th_FecI'},{av:'Z10897Th_FecF'},{av:'Z10898Th_Kgs'},{av:'Z10899Th_Treal'},{av:'Z10900Th_NAny'},{av:'Z10901Th_Lts'},{av:'Z10902Th_UltL'},{av:'Z10922Th_Num'},{av:'Z10923Th_Tteo'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TH_LINEA","{handler:'valid_Th_linea',iparms:[]");
      setEventMetadata("VALID_TH_LINEA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Th_hmc',iparms:[]");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10893Th_p = "" ;
      Z10894Th_Maq = "" ;
      Z10895Th_Tipo = "" ;
      Z10896Th_FecI = GXutil.resetTime( GXutil.nullDate() );
      Z10897Th_FecF = GXutil.resetTime( GXutil.nullDate() );
      Z10898Th_Kgs = DecimalUtil.ZERO ;
      Z10904Th_Prod = "" ;
      Z10905Th_FecP = GXutil.resetTime( GXutil.nullDate() );
      Z10906Th_Cant = DecimalUtil.ZERO ;
      Z10907Th_Exis = DecimalUtil.ZERO ;
      Z10919Th_ProdAux = "" ;
      Z10920Th_ProcF = "" ;
      Z11302Th_HmC = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10893Th_p = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10894Th_Maq = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10895Th_Tipo = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10896Th_FecI = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock9_Jsonclick = "" ;
      A10897Th_FecF = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock10_Jsonclick = "" ;
      A10898Th_Kgs = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1453 = "" ;
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
      sMode1452 = "" ;
      GXCCtl = "" ;
      A10904Th_Prod = "" ;
      A10905Th_FecP = GXutil.resetTime( GXutil.nullDate() );
      A10906Th_Cant = DecimalUtil.ZERO ;
      A10907Th_Exis = DecimalUtil.ZERO ;
      A10919Th_ProdAux = "" ;
      A10920Th_ProcF = "" ;
      A11302Th_HmC = "" ;
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
      T019X6_A407EmprNom = new String[] {""} ;
      T019X6_n407EmprNom = new boolean[] {false} ;
      T019X7_A10891Th_Hdr = new int[1] ;
      T019X7_A10892Th_r = new byte[1] ;
      T019X7_A10893Th_p = new String[] {""} ;
      T019X7_A407EmprNom = new String[] {""} ;
      T019X7_n407EmprNom = new boolean[] {false} ;
      T019X7_A10894Th_Maq = new String[] {""} ;
      T019X7_n10894Th_Maq = new boolean[] {false} ;
      T019X7_A10895Th_Tipo = new String[] {""} ;
      T019X7_n10895Th_Tipo = new boolean[] {false} ;
      T019X7_A10896Th_FecI = new java.util.Date[] {GXutil.nullDate()} ;
      T019X7_n10896Th_FecI = new boolean[] {false} ;
      T019X7_A10897Th_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      T019X7_n10897Th_FecF = new boolean[] {false} ;
      T019X7_A10898Th_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X7_n10898Th_Kgs = new boolean[] {false} ;
      T019X7_A10899Th_Treal = new short[1] ;
      T019X7_n10899Th_Treal = new boolean[] {false} ;
      T019X7_A10900Th_NAny = new short[1] ;
      T019X7_n10900Th_NAny = new boolean[] {false} ;
      T019X7_A10901Th_Lts = new int[1] ;
      T019X7_n10901Th_Lts = new boolean[] {false} ;
      T019X7_A10902Th_UltL = new short[1] ;
      T019X7_n10902Th_UltL = new boolean[] {false} ;
      T019X7_A10922Th_Num = new short[1] ;
      T019X7_n10922Th_Num = new boolean[] {false} ;
      T019X7_A10923Th_Tteo = new short[1] ;
      T019X7_n10923Th_Tteo = new boolean[] {false} ;
      T019X7_A396EmprCod = new String[] {""} ;
      T019X8_A396EmprCod = new String[] {""} ;
      T019X8_A10891Th_Hdr = new int[1] ;
      T019X8_A10892Th_r = new byte[1] ;
      T019X8_A10893Th_p = new String[] {""} ;
      T019X5_A10891Th_Hdr = new int[1] ;
      T019X5_A10892Th_r = new byte[1] ;
      T019X5_A10893Th_p = new String[] {""} ;
      T019X5_A10894Th_Maq = new String[] {""} ;
      T019X5_n10894Th_Maq = new boolean[] {false} ;
      T019X5_A10895Th_Tipo = new String[] {""} ;
      T019X5_n10895Th_Tipo = new boolean[] {false} ;
      T019X5_A10896Th_FecI = new java.util.Date[] {GXutil.nullDate()} ;
      T019X5_n10896Th_FecI = new boolean[] {false} ;
      T019X5_A10897Th_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      T019X5_n10897Th_FecF = new boolean[] {false} ;
      T019X5_A10898Th_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X5_n10898Th_Kgs = new boolean[] {false} ;
      T019X5_A10899Th_Treal = new short[1] ;
      T019X5_n10899Th_Treal = new boolean[] {false} ;
      T019X5_A10900Th_NAny = new short[1] ;
      T019X5_n10900Th_NAny = new boolean[] {false} ;
      T019X5_A10901Th_Lts = new int[1] ;
      T019X5_n10901Th_Lts = new boolean[] {false} ;
      T019X5_A10902Th_UltL = new short[1] ;
      T019X5_n10902Th_UltL = new boolean[] {false} ;
      T019X5_A10922Th_Num = new short[1] ;
      T019X5_n10922Th_Num = new boolean[] {false} ;
      T019X5_A10923Th_Tteo = new short[1] ;
      T019X5_n10923Th_Tteo = new boolean[] {false} ;
      T019X5_A396EmprCod = new String[] {""} ;
      T019X9_A396EmprCod = new String[] {""} ;
      T019X9_A10891Th_Hdr = new int[1] ;
      T019X9_A10892Th_r = new byte[1] ;
      T019X9_A10893Th_p = new String[] {""} ;
      T019X10_A396EmprCod = new String[] {""} ;
      T019X10_A10891Th_Hdr = new int[1] ;
      T019X10_A10892Th_r = new byte[1] ;
      T019X10_A10893Th_p = new String[] {""} ;
      T019X4_A10891Th_Hdr = new int[1] ;
      T019X4_A10892Th_r = new byte[1] ;
      T019X4_A10893Th_p = new String[] {""} ;
      T019X4_A10894Th_Maq = new String[] {""} ;
      T019X4_n10894Th_Maq = new boolean[] {false} ;
      T019X4_A10895Th_Tipo = new String[] {""} ;
      T019X4_n10895Th_Tipo = new boolean[] {false} ;
      T019X4_A10896Th_FecI = new java.util.Date[] {GXutil.nullDate()} ;
      T019X4_n10896Th_FecI = new boolean[] {false} ;
      T019X4_A10897Th_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      T019X4_n10897Th_FecF = new boolean[] {false} ;
      T019X4_A10898Th_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X4_n10898Th_Kgs = new boolean[] {false} ;
      T019X4_A10899Th_Treal = new short[1] ;
      T019X4_n10899Th_Treal = new boolean[] {false} ;
      T019X4_A10900Th_NAny = new short[1] ;
      T019X4_n10900Th_NAny = new boolean[] {false} ;
      T019X4_A10901Th_Lts = new int[1] ;
      T019X4_n10901Th_Lts = new boolean[] {false} ;
      T019X4_A10902Th_UltL = new short[1] ;
      T019X4_n10902Th_UltL = new boolean[] {false} ;
      T019X4_A10922Th_Num = new short[1] ;
      T019X4_n10922Th_Num = new boolean[] {false} ;
      T019X4_A10923Th_Tteo = new short[1] ;
      T019X4_n10923Th_Tteo = new boolean[] {false} ;
      T019X4_A396EmprCod = new String[] {""} ;
      T019X14_A396EmprCod = new String[] {""} ;
      T019X14_A10891Th_Hdr = new int[1] ;
      T019X14_A10892Th_r = new byte[1] ;
      T019X14_A10893Th_p = new String[] {""} ;
      T019X15_A396EmprCod = new String[] {""} ;
      T019X15_A10891Th_Hdr = new int[1] ;
      T019X15_A10892Th_r = new byte[1] ;
      T019X15_A10893Th_p = new String[] {""} ;
      T019X15_A10903Th_Linea = new short[1] ;
      T019X15_A10904Th_Prod = new String[] {""} ;
      T019X15_n10904Th_Prod = new boolean[] {false} ;
      T019X15_A10905Th_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      T019X15_n10905Th_FecP = new boolean[] {false} ;
      T019X15_A10906Th_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X15_n10906Th_Cant = new boolean[] {false} ;
      T019X15_A10907Th_Exis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X15_n10907Th_Exis = new boolean[] {false} ;
      T019X15_A10919Th_ProdAux = new String[] {""} ;
      T019X15_n10919Th_ProdAux = new boolean[] {false} ;
      T019X15_A10920Th_ProcF = new String[] {""} ;
      T019X15_n10920Th_ProcF = new boolean[] {false} ;
      T019X15_A10921Th_ProcL = new short[1] ;
      T019X15_n10921Th_ProcL = new boolean[] {false} ;
      T019X15_A11302Th_HmC = new String[] {""} ;
      T019X15_n11302Th_HmC = new boolean[] {false} ;
      T019X16_A396EmprCod = new String[] {""} ;
      T019X16_A10891Th_Hdr = new int[1] ;
      T019X16_A10892Th_r = new byte[1] ;
      T019X16_A10893Th_p = new String[] {""} ;
      T019X16_A10903Th_Linea = new short[1] ;
      T019X3_A396EmprCod = new String[] {""} ;
      T019X3_A10891Th_Hdr = new int[1] ;
      T019X3_A10892Th_r = new byte[1] ;
      T019X3_A10893Th_p = new String[] {""} ;
      T019X3_A10903Th_Linea = new short[1] ;
      T019X3_A10904Th_Prod = new String[] {""} ;
      T019X3_n10904Th_Prod = new boolean[] {false} ;
      T019X3_A10905Th_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      T019X3_n10905Th_FecP = new boolean[] {false} ;
      T019X3_A10906Th_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X3_n10906Th_Cant = new boolean[] {false} ;
      T019X3_A10907Th_Exis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X3_n10907Th_Exis = new boolean[] {false} ;
      T019X3_A10919Th_ProdAux = new String[] {""} ;
      T019X3_n10919Th_ProdAux = new boolean[] {false} ;
      T019X3_A10920Th_ProcF = new String[] {""} ;
      T019X3_n10920Th_ProcF = new boolean[] {false} ;
      T019X3_A10921Th_ProcL = new short[1] ;
      T019X3_n10921Th_ProcL = new boolean[] {false} ;
      T019X3_A11302Th_HmC = new String[] {""} ;
      T019X3_n11302Th_HmC = new boolean[] {false} ;
      T019X2_A396EmprCod = new String[] {""} ;
      T019X2_A10891Th_Hdr = new int[1] ;
      T019X2_A10892Th_r = new byte[1] ;
      T019X2_A10893Th_p = new String[] {""} ;
      T019X2_A10903Th_Linea = new short[1] ;
      T019X2_A10904Th_Prod = new String[] {""} ;
      T019X2_n10904Th_Prod = new boolean[] {false} ;
      T019X2_A10905Th_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      T019X2_n10905Th_FecP = new boolean[] {false} ;
      T019X2_A10906Th_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X2_n10906Th_Cant = new boolean[] {false} ;
      T019X2_A10907Th_Exis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019X2_n10907Th_Exis = new boolean[] {false} ;
      T019X2_A10919Th_ProdAux = new String[] {""} ;
      T019X2_n10919Th_ProdAux = new boolean[] {false} ;
      T019X2_A10920Th_ProcF = new String[] {""} ;
      T019X2_n10920Th_ProcF = new boolean[] {false} ;
      T019X2_A10921Th_ProcL = new short[1] ;
      T019X2_n10921Th_ProcL = new boolean[] {false} ;
      T019X2_A11302Th_HmC = new String[] {""} ;
      T019X2_n11302Th_HmC = new boolean[] {false} ;
      T019X20_A396EmprCod = new String[] {""} ;
      T019X20_A10891Th_Hdr = new int[1] ;
      T019X20_A10892Th_r = new byte[1] ;
      T019X20_A10893Th_p = new String[] {""} ;
      T019X20_A10903Th_Linea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T019X21_A407EmprNom = new String[] {""} ;
      T019X21_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10893Th_p = "" ;
      ZZ407EmprNom = "" ;
      ZZ10894Th_Maq = "" ;
      ZZ10895Th_Tipo = "" ;
      ZZ10896Th_FecI = GXutil.resetTime( GXutil.nullDate() );
      ZZ10897Th_FecF = GXutil.resetTime( GXutil.nullDate() );
      ZZ10898Th_Kgs = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttohost0__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttohost0__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttohost0__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttohost0__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttohost0__default(),
         new Object[] {
             new Object[] {
            T019X2_A396EmprCod, T019X2_A10891Th_Hdr, T019X2_A10892Th_r, T019X2_A10893Th_p, T019X2_A10903Th_Linea, T019X2_A10904Th_Prod, T019X2_n10904Th_Prod, T019X2_A10905Th_FecP, T019X2_n10905Th_FecP, T019X2_A10906Th_Cant,
            T019X2_n10906Th_Cant, T019X2_A10907Th_Exis, T019X2_n10907Th_Exis, T019X2_A10919Th_ProdAux, T019X2_n10919Th_ProdAux, T019X2_A10920Th_ProcF, T019X2_n10920Th_ProcF, T019X2_A10921Th_ProcL, T019X2_n10921Th_ProcL, T019X2_A11302Th_HmC,
            T019X2_n11302Th_HmC
            }
            , new Object[] {
            T019X3_A396EmprCod, T019X3_A10891Th_Hdr, T019X3_A10892Th_r, T019X3_A10893Th_p, T019X3_A10903Th_Linea, T019X3_A10904Th_Prod, T019X3_n10904Th_Prod, T019X3_A10905Th_FecP, T019X3_n10905Th_FecP, T019X3_A10906Th_Cant,
            T019X3_n10906Th_Cant, T019X3_A10907Th_Exis, T019X3_n10907Th_Exis, T019X3_A10919Th_ProdAux, T019X3_n10919Th_ProdAux, T019X3_A10920Th_ProcF, T019X3_n10920Th_ProcF, T019X3_A10921Th_ProcL, T019X3_n10921Th_ProcL, T019X3_A11302Th_HmC,
            T019X3_n11302Th_HmC
            }
            , new Object[] {
            T019X4_A10891Th_Hdr, T019X4_A10892Th_r, T019X4_A10893Th_p, T019X4_A10894Th_Maq, T019X4_n10894Th_Maq, T019X4_A10895Th_Tipo, T019X4_n10895Th_Tipo, T019X4_A10896Th_FecI, T019X4_n10896Th_FecI, T019X4_A10897Th_FecF,
            T019X4_n10897Th_FecF, T019X4_A10898Th_Kgs, T019X4_n10898Th_Kgs, T019X4_A10899Th_Treal, T019X4_n10899Th_Treal, T019X4_A10900Th_NAny, T019X4_n10900Th_NAny, T019X4_A10901Th_Lts, T019X4_n10901Th_Lts, T019X4_A10902Th_UltL,
            T019X4_n10902Th_UltL, T019X4_A10922Th_Num, T019X4_n10922Th_Num, T019X4_A10923Th_Tteo, T019X4_n10923Th_Tteo, T019X4_A396EmprCod
            }
            , new Object[] {
            T019X5_A10891Th_Hdr, T019X5_A10892Th_r, T019X5_A10893Th_p, T019X5_A10894Th_Maq, T019X5_n10894Th_Maq, T019X5_A10895Th_Tipo, T019X5_n10895Th_Tipo, T019X5_A10896Th_FecI, T019X5_n10896Th_FecI, T019X5_A10897Th_FecF,
            T019X5_n10897Th_FecF, T019X5_A10898Th_Kgs, T019X5_n10898Th_Kgs, T019X5_A10899Th_Treal, T019X5_n10899Th_Treal, T019X5_A10900Th_NAny, T019X5_n10900Th_NAny, T019X5_A10901Th_Lts, T019X5_n10901Th_Lts, T019X5_A10902Th_UltL,
            T019X5_n10902Th_UltL, T019X5_A10922Th_Num, T019X5_n10922Th_Num, T019X5_A10923Th_Tteo, T019X5_n10923Th_Tteo, T019X5_A396EmprCod
            }
            , new Object[] {
            T019X6_A407EmprNom, T019X6_n407EmprNom
            }
            , new Object[] {
            T019X7_A10891Th_Hdr, T019X7_A10892Th_r, T019X7_A10893Th_p, T019X7_A407EmprNom, T019X7_n407EmprNom, T019X7_A10894Th_Maq, T019X7_n10894Th_Maq, T019X7_A10895Th_Tipo, T019X7_n10895Th_Tipo, T019X7_A10896Th_FecI,
            T019X7_n10896Th_FecI, T019X7_A10897Th_FecF, T019X7_n10897Th_FecF, T019X7_A10898Th_Kgs, T019X7_n10898Th_Kgs, T019X7_A10899Th_Treal, T019X7_n10899Th_Treal, T019X7_A10900Th_NAny, T019X7_n10900Th_NAny, T019X7_A10901Th_Lts,
            T019X7_n10901Th_Lts, T019X7_A10902Th_UltL, T019X7_n10902Th_UltL, T019X7_A10922Th_Num, T019X7_n10922Th_Num, T019X7_A10923Th_Tteo, T019X7_n10923Th_Tteo, T019X7_A396EmprCod
            }
            , new Object[] {
            T019X8_A396EmprCod, T019X8_A10891Th_Hdr, T019X8_A10892Th_r, T019X8_A10893Th_p
            }
            , new Object[] {
            T019X9_A396EmprCod, T019X9_A10891Th_Hdr, T019X9_A10892Th_r, T019X9_A10893Th_p
            }
            , new Object[] {
            T019X10_A396EmprCod, T019X10_A10891Th_Hdr, T019X10_A10892Th_r, T019X10_A10893Th_p
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019X14_A396EmprCod, T019X14_A10891Th_Hdr, T019X14_A10892Th_r, T019X14_A10893Th_p
            }
            , new Object[] {
            T019X15_A396EmprCod, T019X15_A10891Th_Hdr, T019X15_A10892Th_r, T019X15_A10893Th_p, T019X15_A10903Th_Linea, T019X15_A10904Th_Prod, T019X15_n10904Th_Prod, T019X15_A10905Th_FecP, T019X15_n10905Th_FecP, T019X15_A10906Th_Cant,
            T019X15_n10906Th_Cant, T019X15_A10907Th_Exis, T019X15_n10907Th_Exis, T019X15_A10919Th_ProdAux, T019X15_n10919Th_ProdAux, T019X15_A10920Th_ProcF, T019X15_n10920Th_ProcF, T019X15_A10921Th_ProcL, T019X15_n10921Th_ProcL, T019X15_A11302Th_HmC,
            T019X15_n11302Th_HmC
            }
            , new Object[] {
            T019X16_A396EmprCod, T019X16_A10891Th_Hdr, T019X16_A10892Th_r, T019X16_A10893Th_p, T019X16_A10903Th_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019X20_A396EmprCod, T019X20_A10891Th_Hdr, T019X20_A10892Th_r, T019X20_A10893Th_p, T019X20_A10903Th_Linea
            }
            , new Object[] {
            T019X21_A407EmprNom, T019X21_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTOHOST0" ;
   }

   private byte Z10892Th_r ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10892Th_r ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ10892Th_r ;
   private short Z10899Th_Treal ;
   private short Z10900Th_NAny ;
   private short Z10902Th_UltL ;
   private short Z10922Th_Num ;
   private short Z10923Th_Tteo ;
   private short Z10903Th_Linea ;
   private short Z10921Th_ProcL ;
   private short nRcdDeleted_1453 ;
   private short nRcdExists_1453 ;
   private short nIsMod_1453 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10899Th_Treal ;
   private short A10900Th_NAny ;
   private short A10902Th_UltL ;
   private short A10922Th_Num ;
   private short A10923Th_Tteo ;
   private short nBlankRcdCount1453 ;
   private short RcdFound1453 ;
   private short nBlankRcdUsr1453 ;
   private short A10903Th_Linea ;
   private short A10921Th_ProcL ;
   private short RcdFound1452 ;
   private short nIsDirty_1452 ;
   private short nIsDirty_1453 ;
   private short ZZ10899Th_Treal ;
   private short ZZ10900Th_NAny ;
   private short ZZ10902Th_UltL ;
   private short ZZ10922Th_Num ;
   private short ZZ10923Th_Tteo ;
   private int Z10891Th_Hdr ;
   private int Z10901Th_Lts ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A10891Th_Hdr ;
   private int edtTh_Hdr_Enabled ;
   private int edtTh_r_Enabled ;
   private int edtTh_p_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTh_Maq_Enabled ;
   private int edtTh_Tipo_Enabled ;
   private int edtTh_FecI_Enabled ;
   private int edtTh_FecF_Enabled ;
   private int edtTh_Kgs_Enabled ;
   private int edtTh_Treal_Enabled ;
   private int edtTh_NAny_Enabled ;
   private int A10901Th_Lts ;
   private int edtTh_Lts_Enabled ;
   private int edtTh_UltL_Enabled ;
   private int edtTh_Num_Enabled ;
   private int edtTh_Tteo_Enabled ;
   private int edtavnRcdDeleted_1453_Enabled ;
   private int edtTh_Linea_Enabled ;
   private int edtTh_Prod_Enabled ;
   private int edtTh_FecP_Enabled ;
   private int edtTh_Cant_Enabled ;
   private int edtTh_Exis_Enabled ;
   private int edtTh_ProdAux_Enabled ;
   private int edtTh_ProcF_Enabled ;
   private int edtTh_ProcL_Enabled ;
   private int edtTh_HmC_Enabled ;
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
   private int defedtTh_Linea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTh_Tteo_Backcolor ;
   private int edtTh_Num_Backcolor ;
   private int edtTh_UltL_Backcolor ;
   private int edtTh_Lts_Backcolor ;
   private int edtTh_NAny_Backcolor ;
   private int edtTh_Treal_Backcolor ;
   private int edtTh_Kgs_Backcolor ;
   private int edtTh_FecF_Backcolor ;
   private int edtTh_FecI_Backcolor ;
   private int edtTh_Tipo_Backcolor ;
   private int edtTh_Maq_Backcolor ;
   private int edtTh_p_Backcolor ;
   private int edtTh_r_Backcolor ;
   private int edtTh_Hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10891Th_Hdr ;
   private int ZZ10901Th_Lts ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10898Th_Kgs ;
   private java.math.BigDecimal Z10906Th_Cant ;
   private java.math.BigDecimal Z10907Th_Exis ;
   private java.math.BigDecimal A10898Th_Kgs ;
   private java.math.BigDecimal A10906Th_Cant ;
   private java.math.BigDecimal A10907Th_Exis ;
   private java.math.BigDecimal ZZ10898Th_Kgs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10893Th_p ;
   private String Z10894Th_Maq ;
   private String Z10895Th_Tipo ;
   private String Z10904Th_Prod ;
   private String Z10919Th_ProdAux ;
   private String Z10920Th_ProcF ;
   private String Z11302Th_HmC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTh_Hdr_Internalname ;
   private String sGXsfl_100_idx="0001" ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTh_Hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTh_r_Internalname ;
   private String edtTh_r_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTh_p_Internalname ;
   private String A10893Th_p ;
   private String edtTh_p_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTh_Maq_Internalname ;
   private String A10894Th_Maq ;
   private String edtTh_Maq_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTh_Tipo_Internalname ;
   private String A10895Th_Tipo ;
   private String edtTh_Tipo_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTh_FecI_Internalname ;
   private String edtTh_FecI_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTh_FecF_Internalname ;
   private String edtTh_FecF_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTh_Kgs_Internalname ;
   private String edtTh_Kgs_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTh_Treal_Internalname ;
   private String edtTh_Treal_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTh_NAny_Internalname ;
   private String edtTh_NAny_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTh_Lts_Internalname ;
   private String edtTh_Lts_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTh_UltL_Internalname ;
   private String edtTh_UltL_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtTh_Num_Internalname ;
   private String edtTh_Num_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtTh_Tteo_Internalname ;
   private String edtTh_Tteo_Jsonclick ;
   private String sMode1453 ;
   private String edtavnRcdDeleted_1453_Internalname ;
   private String edtTh_Linea_Internalname ;
   private String edtTh_Prod_Internalname ;
   private String edtTh_FecP_Internalname ;
   private String edtTh_Cant_Internalname ;
   private String edtTh_Exis_Internalname ;
   private String edtTh_ProdAux_Internalname ;
   private String edtTh_ProcF_Internalname ;
   private String edtTh_ProcL_Internalname ;
   private String edtTh_HmC_Internalname ;
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
   private String sMode1452 ;
   private String GXCCtl ;
   private String A10904Th_Prod ;
   private String A10919Th_ProdAux ;
   private String A10920Th_ProcF ;
   private String A11302Th_HmC ;
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
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1453_Jsonclick ;
   private String edtTh_Linea_Jsonclick ;
   private String edtTh_Prod_Jsonclick ;
   private String edtTh_FecP_Jsonclick ;
   private String edtTh_Cant_Jsonclick ;
   private String edtTh_Exis_Jsonclick ;
   private String edtTh_ProdAux_Jsonclick ;
   private String edtTh_ProcF_Jsonclick ;
   private String edtTh_ProcL_Jsonclick ;
   private String edtTh_HmC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ10893Th_p ;
   private String ZZ407EmprNom ;
   private String ZZ10894Th_Maq ;
   private String ZZ10895Th_Tipo ;
   private java.util.Date Z10896Th_FecI ;
   private java.util.Date Z10897Th_FecF ;
   private java.util.Date Z10905Th_FecP ;
   private java.util.Date A10896Th_FecI ;
   private java.util.Date A10897Th_FecF ;
   private java.util.Date A10905Th_FecP ;
   private java.util.Date ZZ10896Th_FecI ;
   private java.util.Date ZZ10897Th_FecF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10894Th_Maq ;
   private boolean n10895Th_Tipo ;
   private boolean n10896Th_FecI ;
   private boolean n10897Th_FecF ;
   private boolean n10898Th_Kgs ;
   private boolean n10899Th_Treal ;
   private boolean n10900Th_NAny ;
   private boolean n10901Th_Lts ;
   private boolean n10902Th_UltL ;
   private boolean n10922Th_Num ;
   private boolean n10923Th_Tteo ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n10904Th_Prod ;
   private boolean n10905Th_FecP ;
   private boolean n10906Th_Cant ;
   private boolean n10907Th_Exis ;
   private boolean n10919Th_ProdAux ;
   private boolean n10920Th_ProcF ;
   private boolean n10921Th_ProcL ;
   private boolean n11302Th_HmC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T019X6_A407EmprNom ;
   private boolean[] T019X6_n407EmprNom ;
   private int[] T019X7_A10891Th_Hdr ;
   private byte[] T019X7_A10892Th_r ;
   private String[] T019X7_A10893Th_p ;
   private String[] T019X7_A407EmprNom ;
   private boolean[] T019X7_n407EmprNom ;
   private String[] T019X7_A10894Th_Maq ;
   private boolean[] T019X7_n10894Th_Maq ;
   private String[] T019X7_A10895Th_Tipo ;
   private boolean[] T019X7_n10895Th_Tipo ;
   private java.util.Date[] T019X7_A10896Th_FecI ;
   private boolean[] T019X7_n10896Th_FecI ;
   private java.util.Date[] T019X7_A10897Th_FecF ;
   private boolean[] T019X7_n10897Th_FecF ;
   private java.math.BigDecimal[] T019X7_A10898Th_Kgs ;
   private boolean[] T019X7_n10898Th_Kgs ;
   private short[] T019X7_A10899Th_Treal ;
   private boolean[] T019X7_n10899Th_Treal ;
   private short[] T019X7_A10900Th_NAny ;
   private boolean[] T019X7_n10900Th_NAny ;
   private int[] T019X7_A10901Th_Lts ;
   private boolean[] T019X7_n10901Th_Lts ;
   private short[] T019X7_A10902Th_UltL ;
   private boolean[] T019X7_n10902Th_UltL ;
   private short[] T019X7_A10922Th_Num ;
   private boolean[] T019X7_n10922Th_Num ;
   private short[] T019X7_A10923Th_Tteo ;
   private boolean[] T019X7_n10923Th_Tteo ;
   private String[] T019X7_A396EmprCod ;
   private String[] T019X8_A396EmprCod ;
   private int[] T019X8_A10891Th_Hdr ;
   private byte[] T019X8_A10892Th_r ;
   private String[] T019X8_A10893Th_p ;
   private int[] T019X5_A10891Th_Hdr ;
   private byte[] T019X5_A10892Th_r ;
   private String[] T019X5_A10893Th_p ;
   private String[] T019X5_A10894Th_Maq ;
   private boolean[] T019X5_n10894Th_Maq ;
   private String[] T019X5_A10895Th_Tipo ;
   private boolean[] T019X5_n10895Th_Tipo ;
   private java.util.Date[] T019X5_A10896Th_FecI ;
   private boolean[] T019X5_n10896Th_FecI ;
   private java.util.Date[] T019X5_A10897Th_FecF ;
   private boolean[] T019X5_n10897Th_FecF ;
   private java.math.BigDecimal[] T019X5_A10898Th_Kgs ;
   private boolean[] T019X5_n10898Th_Kgs ;
   private short[] T019X5_A10899Th_Treal ;
   private boolean[] T019X5_n10899Th_Treal ;
   private short[] T019X5_A10900Th_NAny ;
   private boolean[] T019X5_n10900Th_NAny ;
   private int[] T019X5_A10901Th_Lts ;
   private boolean[] T019X5_n10901Th_Lts ;
   private short[] T019X5_A10902Th_UltL ;
   private boolean[] T019X5_n10902Th_UltL ;
   private short[] T019X5_A10922Th_Num ;
   private boolean[] T019X5_n10922Th_Num ;
   private short[] T019X5_A10923Th_Tteo ;
   private boolean[] T019X5_n10923Th_Tteo ;
   private String[] T019X5_A396EmprCod ;
   private String[] T019X9_A396EmprCod ;
   private int[] T019X9_A10891Th_Hdr ;
   private byte[] T019X9_A10892Th_r ;
   private String[] T019X9_A10893Th_p ;
   private String[] T019X10_A396EmprCod ;
   private int[] T019X10_A10891Th_Hdr ;
   private byte[] T019X10_A10892Th_r ;
   private String[] T019X10_A10893Th_p ;
   private int[] T019X4_A10891Th_Hdr ;
   private byte[] T019X4_A10892Th_r ;
   private String[] T019X4_A10893Th_p ;
   private String[] T019X4_A10894Th_Maq ;
   private boolean[] T019X4_n10894Th_Maq ;
   private String[] T019X4_A10895Th_Tipo ;
   private boolean[] T019X4_n10895Th_Tipo ;
   private java.util.Date[] T019X4_A10896Th_FecI ;
   private boolean[] T019X4_n10896Th_FecI ;
   private java.util.Date[] T019X4_A10897Th_FecF ;
   private boolean[] T019X4_n10897Th_FecF ;
   private java.math.BigDecimal[] T019X4_A10898Th_Kgs ;
   private boolean[] T019X4_n10898Th_Kgs ;
   private short[] T019X4_A10899Th_Treal ;
   private boolean[] T019X4_n10899Th_Treal ;
   private short[] T019X4_A10900Th_NAny ;
   private boolean[] T019X4_n10900Th_NAny ;
   private int[] T019X4_A10901Th_Lts ;
   private boolean[] T019X4_n10901Th_Lts ;
   private short[] T019X4_A10902Th_UltL ;
   private boolean[] T019X4_n10902Th_UltL ;
   private short[] T019X4_A10922Th_Num ;
   private boolean[] T019X4_n10922Th_Num ;
   private short[] T019X4_A10923Th_Tteo ;
   private boolean[] T019X4_n10923Th_Tteo ;
   private String[] T019X4_A396EmprCod ;
   private String[] T019X14_A396EmprCod ;
   private int[] T019X14_A10891Th_Hdr ;
   private byte[] T019X14_A10892Th_r ;
   private String[] T019X14_A10893Th_p ;
   private String[] T019X15_A396EmprCod ;
   private int[] T019X15_A10891Th_Hdr ;
   private byte[] T019X15_A10892Th_r ;
   private String[] T019X15_A10893Th_p ;
   private short[] T019X15_A10903Th_Linea ;
   private String[] T019X15_A10904Th_Prod ;
   private boolean[] T019X15_n10904Th_Prod ;
   private java.util.Date[] T019X15_A10905Th_FecP ;
   private boolean[] T019X15_n10905Th_FecP ;
   private java.math.BigDecimal[] T019X15_A10906Th_Cant ;
   private boolean[] T019X15_n10906Th_Cant ;
   private java.math.BigDecimal[] T019X15_A10907Th_Exis ;
   private boolean[] T019X15_n10907Th_Exis ;
   private String[] T019X15_A10919Th_ProdAux ;
   private boolean[] T019X15_n10919Th_ProdAux ;
   private String[] T019X15_A10920Th_ProcF ;
   private boolean[] T019X15_n10920Th_ProcF ;
   private short[] T019X15_A10921Th_ProcL ;
   private boolean[] T019X15_n10921Th_ProcL ;
   private String[] T019X15_A11302Th_HmC ;
   private boolean[] T019X15_n11302Th_HmC ;
   private String[] T019X16_A396EmprCod ;
   private int[] T019X16_A10891Th_Hdr ;
   private byte[] T019X16_A10892Th_r ;
   private String[] T019X16_A10893Th_p ;
   private short[] T019X16_A10903Th_Linea ;
   private String[] T019X3_A396EmprCod ;
   private int[] T019X3_A10891Th_Hdr ;
   private byte[] T019X3_A10892Th_r ;
   private String[] T019X3_A10893Th_p ;
   private short[] T019X3_A10903Th_Linea ;
   private String[] T019X3_A10904Th_Prod ;
   private boolean[] T019X3_n10904Th_Prod ;
   private java.util.Date[] T019X3_A10905Th_FecP ;
   private boolean[] T019X3_n10905Th_FecP ;
   private java.math.BigDecimal[] T019X3_A10906Th_Cant ;
   private boolean[] T019X3_n10906Th_Cant ;
   private java.math.BigDecimal[] T019X3_A10907Th_Exis ;
   private boolean[] T019X3_n10907Th_Exis ;
   private String[] T019X3_A10919Th_ProdAux ;
   private boolean[] T019X3_n10919Th_ProdAux ;
   private String[] T019X3_A10920Th_ProcF ;
   private boolean[] T019X3_n10920Th_ProcF ;
   private short[] T019X3_A10921Th_ProcL ;
   private boolean[] T019X3_n10921Th_ProcL ;
   private String[] T019X3_A11302Th_HmC ;
   private boolean[] T019X3_n11302Th_HmC ;
   private String[] T019X2_A396EmprCod ;
   private int[] T019X2_A10891Th_Hdr ;
   private byte[] T019X2_A10892Th_r ;
   private String[] T019X2_A10893Th_p ;
   private short[] T019X2_A10903Th_Linea ;
   private String[] T019X2_A10904Th_Prod ;
   private boolean[] T019X2_n10904Th_Prod ;
   private java.util.Date[] T019X2_A10905Th_FecP ;
   private boolean[] T019X2_n10905Th_FecP ;
   private java.math.BigDecimal[] T019X2_A10906Th_Cant ;
   private boolean[] T019X2_n10906Th_Cant ;
   private java.math.BigDecimal[] T019X2_A10907Th_Exis ;
   private boolean[] T019X2_n10907Th_Exis ;
   private String[] T019X2_A10919Th_ProdAux ;
   private boolean[] T019X2_n10919Th_ProdAux ;
   private String[] T019X2_A10920Th_ProcF ;
   private boolean[] T019X2_n10920Th_ProcF ;
   private short[] T019X2_A10921Th_ProcL ;
   private boolean[] T019X2_n10921Th_ProcL ;
   private String[] T019X2_A11302Th_HmC ;
   private boolean[] T019X2_n11302Th_HmC ;
   private String[] T019X20_A396EmprCod ;
   private int[] T019X20_A10891Th_Hdr ;
   private byte[] T019X20_A10892Th_r ;
   private String[] T019X20_A10893Th_p ;
   private short[] T019X20_A10903Th_Linea ;
   private String[] T019X21_A407EmprNom ;
   private boolean[] T019X21_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttohost0__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohost0__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohost0__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohost0__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohost0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T019X2", "SELECT EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea, Th_Prod, Th_FecP, Th_Cant, Th_Exis, Th_ProdAux, Th_ProcF, Th_ProcL, Th_HmC FROM TXPTOHOS1 WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? AND Th_Linea = ?  FOR UPDATE OF Th_Prod, Th_FecP, Th_Cant, Th_Exis, Th_ProdAux, Th_ProcF, Th_ProcL, Th_HmC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X3", "SELECT EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea, Th_Prod, Th_FecP, Th_Cant, Th_Exis, Th_ProdAux, Th_ProcF, Th_ProcL, Th_HmC FROM TXPTOHOS1 WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? AND Th_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X4", "SELECT Th_Hdr, Th_r, Th_p, Th_Maq, Th_Tipo, Th_FecI, Th_FecF, Th_Kgs, Th_Treal, Th_NAny, Th_Lts, Th_UltL, Th_Num, Th_Tteo, EmprCod FROM TXPTOHOST WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ?  FOR UPDATE OF Th_Maq, Th_Tipo, Th_FecI, Th_FecF, Th_Kgs, Th_Treal, Th_NAny, Th_Lts, Th_UltL, Th_Num, Th_Tteo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X5", "SELECT Th_Hdr, Th_r, Th_p, Th_Maq, Th_Tipo, Th_FecI, Th_FecF, Th_Kgs, Th_Treal, Th_NAny, Th_Lts, Th_UltL, Th_Num, Th_Tteo, EmprCod FROM TXPTOHOST WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X7", "SELECT /*+ FIRST_ROWS(100) */ TM1.Th_Hdr, TM1.Th_r, TM1.Th_p, T2.EmprNom, TM1.Th_Maq, TM1.Th_Tipo, TM1.Th_FecI, TM1.Th_FecF, TM1.Th_Kgs, TM1.Th_Treal, TM1.Th_NAny, TM1.Th_Lts, TM1.Th_UltL, TM1.Th_Num, TM1.Th_Tteo, TM1.EmprCod FROM (TXPTOHOST TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Th_Hdr = ? and TM1.Th_r = ? and TM1.Th_p = ? ORDER BY TM1.EmprCod, TM1.Th_Hdr, TM1.Th_r, TM1.Th_p ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Th_Hdr, Th_r, Th_p FROM TXPTOHOST WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Th_Hdr, Th_r, Th_p FROM TXPTOHOST WHERE ( Th_Hdr > ? or Th_Hdr = ? and Th_r > ? or Th_r = ? and Th_Hdr = ? and Th_p > ?) and EmprCod = ? ORDER BY EmprCod, Th_Hdr, Th_r, Th_p) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019X10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Th_Hdr, Th_r, Th_p FROM TXPTOHOST WHERE ( Th_Hdr < ? or Th_Hdr = ? and Th_r < ? or Th_r = ? and Th_Hdr = ? and Th_p < ?) and EmprCod = ? ORDER BY EmprCod DESC, Th_Hdr DESC, Th_r DESC, Th_p DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019X11", "INSERT INTO TXPTOHOST(Th_Hdr, Th_r, Th_p, Th_Maq, Th_Tipo, Th_FecI, Th_FecF, Th_Kgs, Th_Treal, Th_NAny, Th_Lts, Th_UltL, Th_Num, Th_Tteo, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTOHOST")
         ,new UpdateCursor("T019X12", "UPDATE TXPTOHOST SET Th_Maq=?, Th_Tipo=?, Th_FecI=?, Th_FecF=?, Th_Kgs=?, Th_Treal=?, Th_NAny=?, Th_Lts=?, Th_UltL=?, Th_Num=?, Th_Tteo=?  WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ?", GX_NOMASK, "TXPTOHOST")
         ,new UpdateCursor("T019X13", "DELETE FROM TXPTOHOST  WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ?", GX_NOMASK, "TXPTOHOST")
         ,new ForEachCursor("T019X14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Th_Hdr, Th_r, Th_p FROM TXPTOHOST WHERE EmprCod = ? ORDER BY EmprCod, Th_Hdr, Th_r, Th_p ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X15", "SELECT EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea, Th_Prod, Th_FecP, Th_Cant, Th_Exis, Th_ProdAux, Th_ProcF, Th_ProcL, Th_HmC FROM TXPTOHOS1 WHERE EmprCod = ? and Th_Hdr = ? and Th_r = ? and Th_p = ? and Th_Linea = ? ORDER BY EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X16", "SELECT EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea FROM TXPTOHOS1 WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? AND Th_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T019X17", "INSERT INTO TXPTOHOS1(EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea, Th_Prod, Th_FecP, Th_Cant, Th_Exis, Th_ProdAux, Th_ProcF, Th_ProcL, Th_HmC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTOHOS1")
         ,new UpdateCursor("T019X18", "UPDATE TXPTOHOS1 SET Th_Prod=?, Th_FecP=?, Th_Cant=?, Th_Exis=?, Th_ProdAux=?, Th_ProcF=?, Th_ProcL=?, Th_HmC=?  WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? AND Th_Linea = ?", GX_NOMASK, "TXPTOHOS1")
         ,new UpdateCursor("T019X19", "DELETE FROM TXPTOHOS1  WHERE EmprCod = ? AND Th_Hdr = ? AND Th_r = ? AND Th_p = ? AND Th_Linea = ?", GX_NOMASK, "TXPTOHOS1")
         ,new ForEachCursor("T019X20", "SELECT EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea FROM TXPTOHOS1 WHERE EmprCod = ? and Th_Hdr = ? and Th_r = ? and Th_p = ? ORDER BY EmprCod, Th_Hdr, Th_r, Th_p, Th_Linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019X21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[18]).intValue());
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               stmt.setString(15, (String)parms[25], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setByte(14, ((Number) parms[24]).byteValue());
               stmt.setString(15, (String)parms[25], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 6);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 4);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
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
                  stmt.setString(8, (String)parms[15], 4);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setShort(13, ((Number) parms[20]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

