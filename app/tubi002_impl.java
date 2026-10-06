package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tubi002_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10155Lb_NUbi = httpContext.GetPar( "Lb_NUbi") ;
         AV33Emp_dUb = httpContext.GetPar( "Emp_dUb") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Emp_dUb", AV33Emp_dUb);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_18T1374( A396EmprCod, A10155Lb_NUbi, AV33Emp_dUb) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A9611Lb_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Lb_Hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9611Lb_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9611Lb_Hdr), 8, 0));
            A9612Lb_Hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Lb_Hdrr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9612Lb_Hdrr", GXutil.str( A9612Lb_Hdrr, 1, 0));
            A9613Lb_Hdrp = httpContext.GetPar( "Lb_Hdrp") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9613Lb_Hdrp", A9613Lb_Hdrp);
            AV32BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarPie), 6, 0));
            AV35Totp = (int)(GXutil.lval( httpContext.GetPar( "Totp"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Totp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Totp), 6, 0));
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "UBICACION HDR FINALIZADA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_UsuIn_Internalname ;
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
      nRC_GXsfl_165 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_165"))) ;
      nGXsfl_165_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_165_idx"))) ;
      sGXsfl_165_idx = httpContext.GetPar( "sGXsfl_165_idx") ;
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

   public tubi002_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tubi002_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tubi002_impl.class ));
   }

   public tubi002_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TUBI002.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A9611Lb_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9611Lb_Hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9611Lb_Hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A9612Lb_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_Hdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9612Lb_Hdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A9612Lb_Hdrr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Hdrr_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Hdrr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Hdrp_Internalname, GXutil.rtrim( A9613Lb_Hdrp), GXutil.rtrim( localUtil.format( A9613Lb_Hdrp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Hdrp_Jsonclick, 0, "", "", "", "", "", 1, edtLb_Hdrp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Usuario Envia a Lab", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UsuIn_Internalname, GXutil.rtrim( A9614Lb_UsuIn), GXutil.rtrim( localUtil.format( A9614Lb_UsuIn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UsuIn_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UsuIn_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha Usuario Envia a Lab", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecIn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecIn_Internalname, localUtil.format(A9615Lb_FecIn, "99/99/99"), localUtil.format( A9615Lb_FecIn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecIn_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecIn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecIn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecIn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Usuario Salida Lab", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UsuOut_Internalname, GXutil.rtrim( A9616Lb_UsuOut), GXutil.rtrim( localUtil.format( A9616Lb_UsuOut, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UsuOut_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UsuOut_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Salida de Lab", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecOut_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecOut_Internalname, localUtil.format(A9617Lb_FecOut, "99/99/99"), localUtil.format( A9617Lb_FecOut, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecOut_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecOut_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecOut_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecOut_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Entrada(1) o Salida(2)", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_inout_Internalname, GXutil.ltrim( localUtil.ntoc( A9618Lb_inout, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_inout_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9618Lb_inout), "9") : localUtil.format( DecimalUtil.doubleToDec(A9618Lb_inout), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_inout_Jsonclick, 0, "", "", "", "", "", 1, edtLb_inout_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Comp Tin", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecTin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecTin_Internalname, localUtil.format(A9623Lb_FecTin, "99/99/99"), localUtil.format( A9623Lb_FecTin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecTin_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecTin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecTin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecTin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Usuario Com Fec Tin", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UsuTin_Internalname, GXutil.rtrim( A9624Lb_UsuTin), GXutil.rtrim( localUtil.format( A9624Lb_UsuTin, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UsuTin_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UsuTin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Lb obsin", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_obsin_Internalname, A9625Lb_obsin, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", (short)(0), 1, edtLb_obsin_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Fecha Pre Acabado Fin", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecPAc_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecPAc_Internalname, localUtil.format(A9702Lb_FecPAc, "99/99/99"), localUtil.format( A9702Lb_FecPAc, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecPAc_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecPAc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecPAc_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecPAc_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha Acabado Fin", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_FecAcF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_FecAcF_Internalname, localUtil.format(A9703Lb_FecAcF, "99/99/99"), localUtil.format( A9703Lb_FecAcF, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_FecAcF_Jsonclick, 0, "", "", "", "", "", 1, edtLb_FecAcF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_FecAcF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_FecAcF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Obs Out LAB", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_obsout_Internalname, A9709Lb_obsout, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", (short)(0), 1, edtLb_obsout_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Obs problemas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLb_obsprb_Internalname, A9721Lb_obsprb, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", (short)(0), 1, edtLb_obsprb_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "obs control en HDR", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtEx_Obs_Internalname, A9857Ex_Obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", (short)(0), 1, edtEx_Obs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Tiempo I/E", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSedo1_Internalname, GXutil.ltrim( localUtil.ntoc( A10105Sedo1, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSedo1_Enabled!=0) ? localUtil.format( A10105Sedo1, "Z9.9") : localUtil.format( A10105Sedo1, "Z9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSedo1_Jsonclick, 0, "", "", "", "", "", 1, edtSedo1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Tiempo E/I", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSedo2_Internalname, GXutil.ltrim( localUtil.ntoc( A10106Sedo2, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSedo2_Enabled!=0) ? localUtil.format( A10106Sedo2, "Z9.9") : localUtil.format( A10106Sedo2, "Z9.9"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'1');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSedo2_Jsonclick, 0, "", "", "", "", "", 1, edtSedo2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Velocida Bomba", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSedo3_Internalname, GXutil.ltrim( localUtil.ntoc( A10107Sedo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSedo3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10107Sedo3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10107Sedo3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSedo3_Jsonclick, 0, "", "", "", "", "", 1, edtSedo3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Presion diferencial", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSedo4_Internalname, GXutil.ltrim( localUtil.ntoc( A10108Sedo4, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSedo4_Enabled!=0) ? localUtil.format( A10108Sedo4, "9.99") : localUtil.format( A10108Sedo4, "9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSedo4_Jsonclick, 0, "", "", "", "", "", 1, edtSedo4_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Cant de Capas", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSedo5_Internalname, GXutil.ltrim( localUtil.ntoc( A10109Sedo5, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSedo5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10109Sedo5), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10109Sedo5), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSedo5_Jsonclick, 0, "", "", "", "", "", 1, edtSedo5_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Altura de las Bobinas", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSedo6_Internalname, GXutil.ltrim( localUtil.ntoc( A10110Sedo6, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSedo6_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10110Sedo6), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10110Sedo6), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSedo6_Jsonclick, 0, "", "", "", "", "", 1, edtSedo6_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Hora In", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HhIn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HhIn_Internalname, localUtil.ttoc( A10152Lb_HhIn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10152Lb_HhIn, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HhIn_Jsonclick, 0, "", "", "", "", "", 1, edtLb_HhIn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HhIn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HhIn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Hora Out", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HhOut_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HhOut_Internalname, localUtil.ttoc( A10138Lb_HhOut, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10138Lb_HhOut, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HhOut_Jsonclick, 0, "", "", "", "", "", 1, edtLb_HhOut_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HhOut_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HhOut_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Hora Tin", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLb_HhTin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_HhTin_Internalname, localUtil.ttoc( A10153Lb_HhTin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10153Lb_HhTin, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_HhTin_Jsonclick, 0, "", "", "", "", "", 1, edtLb_HhTin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLb_HhTin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLb_HhTin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TUBI002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Piezas Ubicadas Hdr", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UbPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10148Lb_UbPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_UbPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10148Lb_UbPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10148Lb_UbPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UbPzs_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UbPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Codigo Ubicacion", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UbUb_Internalname, GXutil.rtrim( A10135Lb_UbUb), GXutil.rtrim( localUtil.format( A10135Lb_UbUb, "!!!/!!!!!!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UbUb_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UbUb_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBI002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol165( ) ;
      nGXsfl_165_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1374 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1374 = (short)(1) ;
            scanStart18T1374( ) ;
            while ( RcdFound1374 != 0 )
            {
               init_level_properties1374( ) ;
               getByPrimaryKey18T1374( ) ;
               addRow18T1374( ) ;
               scanNext18T1374( ) ;
            }
            scanEnd18T1374( ) ;
            nBlankRcdCount1374 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal18T1374( ) ;
         standaloneModal18T1374( ) ;
         sMode1374 = Gx_mode ;
         while ( nGXsfl_165_idx < nRC_GXsfl_165 )
         {
            bGXsfl_165_Refreshing = true ;
            readRow18T1374( ) ;
            edtavnRcdDeleted_1374_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1374_"+sGXsfl_165_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1374_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1374_Enabled), 5, 0), !bGXsfl_165_Refreshing);
            edtLb_NUbi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_NUBI_"+sGXsfl_165_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_NUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NUbi_Enabled), 5, 0), !bGXsfl_165_Refreshing);
            edtLb_NPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_NPZS_"+sGXsfl_165_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_NPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NPzs_Enabled), 5, 0), !bGXsfl_165_Refreshing);
            if ( ( nRcdExists_1374 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18T1374( ) ;
            }
            sendRow18T1374( ) ;
            bGXsfl_165_Refreshing = false ;
         }
         Gx_mode = sMode1374 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1374 = (short)(5) ;
         nRcdExists_1374 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18T1374( ) ;
            while ( RcdFound1374 != 0 )
            {
               sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1651374( ) ;
               init_level_properties1374( ) ;
               standaloneNotModal18T1374( ) ;
               getByPrimaryKey18T1374( ) ;
               standaloneModal18T1374( ) ;
               addRow18T1374( ) ;
               scanNext18T1374( ) ;
            }
            scanEnd18T1374( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1374 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1651374( ) ;
      initAll18T1374( ) ;
      init_level_properties1374( ) ;
      nRcdExists_1374 = (short)(0) ;
      nIsMod_1374 = (short)(0) ;
      nRcdDeleted_1374 = (short)(0) ;
      nBlankRcdCount1374 = (short)(nBlankRcdUsr1374+nBlankRcdCount1374) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1374 > 0 )
      {
         standaloneNotModal18T1374( ) ;
         standaloneModal18T1374( ) ;
         addRow18T1374( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLb_NUbi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1374 = (short)(nBlankRcdCount1374-1) ;
      }
      Gx_mode = sMode1374 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBI002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TUBI002.htm");
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
      e1118T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9611Lb_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z9611Lb_Hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9612Lb_Hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9612Lb_Hdrr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9613Lb_Hdrp = httpContext.cgiGet( "Z9613Lb_Hdrp") ;
            Z9614Lb_UsuIn = httpContext.cgiGet( "Z9614Lb_UsuIn") ;
            Z9615Lb_FecIn = localUtil.ctod( httpContext.cgiGet( "Z9615Lb_FecIn"), 0) ;
            Z9616Lb_UsuOut = httpContext.cgiGet( "Z9616Lb_UsuOut") ;
            Z9617Lb_FecOut = localUtil.ctod( httpContext.cgiGet( "Z9617Lb_FecOut"), 0) ;
            Z9618Lb_inout = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9618Lb_inout"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9623Lb_FecTin = localUtil.ctod( httpContext.cgiGet( "Z9623Lb_FecTin"), 0) ;
            Z9624Lb_UsuTin = httpContext.cgiGet( "Z9624Lb_UsuTin") ;
            Z9625Lb_obsin = httpContext.cgiGet( "Z9625Lb_obsin") ;
            Z9702Lb_FecPAc = localUtil.ctod( httpContext.cgiGet( "Z9702Lb_FecPAc"), 0) ;
            Z9703Lb_FecAcF = localUtil.ctod( httpContext.cgiGet( "Z9703Lb_FecAcF"), 0) ;
            Z9709Lb_obsout = httpContext.cgiGet( "Z9709Lb_obsout") ;
            Z9721Lb_obsprb = httpContext.cgiGet( "Z9721Lb_obsprb") ;
            Z9857Ex_Obs = httpContext.cgiGet( "Z9857Ex_Obs") ;
            Z10105Sedo1 = localUtil.ctond( httpContext.cgiGet( "Z10105Sedo1")) ;
            Z10106Sedo2 = localUtil.ctond( httpContext.cgiGet( "Z10106Sedo2")) ;
            Z10107Sedo3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z10107Sedo3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10108Sedo4 = localUtil.ctond( httpContext.cgiGet( "Z10108Sedo4")) ;
            Z10109Sedo5 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10109Sedo5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10110Sedo6 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10110Sedo6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10152Lb_HhIn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z10152Lb_HhIn"), 0)) ;
            Z10138Lb_HhOut = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z10138Lb_HhOut"), 0)) ;
            Z10153Lb_HhTin = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z10153Lb_HhTin"), 0)) ;
            Z10148Lb_UbPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z10148Lb_UbPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10135Lb_UbUb = httpContext.cgiGet( "Z10135Lb_UbUb") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_165 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_165"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV34Tot_pz = (int)(localUtil.ctol( httpContext.cgiGet( "vTOT_PZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Emp_dUb = httpContext.cgiGet( "vEMP_DUB") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9611Lb_Hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9611Lb_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9611Lb_Hdr), 8, 0));
            A9612Lb_Hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_Hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9612Lb_Hdrr", GXutil.str( A9612Lb_Hdrr, 1, 0));
            A9613Lb_Hdrp = httpContext.cgiGet( edtLb_Hdrp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9613Lb_Hdrp", A9613Lb_Hdrp);
            A9614Lb_UsuIn = httpContext.cgiGet( edtLb_UsuIn_Internalname) ;
            n9614Lb_UsuIn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9614Lb_UsuIn", A9614Lb_UsuIn);
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecIn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecIn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9615Lb_FecIn = GXutil.nullDate() ;
               n9615Lb_FecIn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9615Lb_FecIn", localUtil.format(A9615Lb_FecIn, "99/99/99"));
            }
            else
            {
               A9615Lb_FecIn = localUtil.ctod( httpContext.cgiGet( edtLb_FecIn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9615Lb_FecIn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9615Lb_FecIn", localUtil.format(A9615Lb_FecIn, "99/99/99"));
            }
            A9616Lb_UsuOut = httpContext.cgiGet( edtLb_UsuOut_Internalname) ;
            n9616Lb_UsuOut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9616Lb_UsuOut", A9616Lb_UsuOut);
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecOut_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECOUT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecOut_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9617Lb_FecOut = GXutil.nullDate() ;
               n9617Lb_FecOut = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9617Lb_FecOut", localUtil.format(A9617Lb_FecOut, "99/99/99"));
            }
            else
            {
               A9617Lb_FecOut = localUtil.ctod( httpContext.cgiGet( edtLb_FecOut_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9617Lb_FecOut = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9617Lb_FecOut", localUtil.format(A9617Lb_FecOut, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_inout_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_inout_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_INOUT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_inout_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9618Lb_inout = (byte)(0) ;
               n9618Lb_inout = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9618Lb_inout", GXutil.str( A9618Lb_inout, 1, 0));
            }
            else
            {
               A9618Lb_inout = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_inout_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9618Lb_inout = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9618Lb_inout", GXutil.str( A9618Lb_inout, 1, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecTin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECTIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecTin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9623Lb_FecTin = GXutil.nullDate() ;
               n9623Lb_FecTin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9623Lb_FecTin", localUtil.format(A9623Lb_FecTin, "99/99/99"));
            }
            else
            {
               A9623Lb_FecTin = localUtil.ctod( httpContext.cgiGet( edtLb_FecTin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9623Lb_FecTin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9623Lb_FecTin", localUtil.format(A9623Lb_FecTin, "99/99/99"));
            }
            A9624Lb_UsuTin = GXutil.upper( httpContext.cgiGet( edtLb_UsuTin_Internalname)) ;
            n9624Lb_UsuTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9624Lb_UsuTin", A9624Lb_UsuTin);
            A9625Lb_obsin = httpContext.cgiGet( edtLb_obsin_Internalname) ;
            n9625Lb_obsin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9625Lb_obsin", A9625Lb_obsin);
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecPAc_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECPAC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecPAc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9702Lb_FecPAc = GXutil.nullDate() ;
               n9702Lb_FecPAc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9702Lb_FecPAc", localUtil.format(A9702Lb_FecPAc, "99/99/99"));
            }
            else
            {
               A9702Lb_FecPAc = localUtil.ctod( httpContext.cgiGet( edtLb_FecPAc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9702Lb_FecPAc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9702Lb_FecPAc", localUtil.format(A9702Lb_FecPAc, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_FecAcF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LB_FECACF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_FecAcF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9703Lb_FecAcF = GXutil.nullDate() ;
               n9703Lb_FecAcF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9703Lb_FecAcF", localUtil.format(A9703Lb_FecAcF, "99/99/99"));
            }
            else
            {
               A9703Lb_FecAcF = localUtil.ctod( httpContext.cgiGet( edtLb_FecAcF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9703Lb_FecAcF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9703Lb_FecAcF", localUtil.format(A9703Lb_FecAcF, "99/99/99"));
            }
            A9709Lb_obsout = httpContext.cgiGet( edtLb_obsout_Internalname) ;
            n9709Lb_obsout = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9709Lb_obsout", A9709Lb_obsout);
            A9721Lb_obsprb = httpContext.cgiGet( edtLb_obsprb_Internalname) ;
            n9721Lb_obsprb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9721Lb_obsprb", A9721Lb_obsprb);
            A9857Ex_Obs = httpContext.cgiGet( edtEx_Obs_Internalname) ;
            n9857Ex_Obs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9857Ex_Obs", A9857Ex_Obs);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSedo1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSedo1_Internalname)), DecimalUtil.stringToDec("99.9")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SEDO1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSedo1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10105Sedo1 = DecimalUtil.ZERO ;
               n10105Sedo1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10105Sedo1", GXutil.ltrimstr( A10105Sedo1, 4, 1));
            }
            else
            {
               A10105Sedo1 = localUtil.ctond( httpContext.cgiGet( edtSedo1_Internalname)) ;
               n10105Sedo1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10105Sedo1", GXutil.ltrimstr( A10105Sedo1, 4, 1));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSedo2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSedo2_Internalname)), DecimalUtil.stringToDec("99.9")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SEDO2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSedo2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10106Sedo2 = DecimalUtil.ZERO ;
               n10106Sedo2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10106Sedo2", GXutil.ltrimstr( A10106Sedo2, 4, 1));
            }
            else
            {
               A10106Sedo2 = localUtil.ctond( httpContext.cgiGet( edtSedo2_Internalname)) ;
               n10106Sedo2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10106Sedo2", GXutil.ltrimstr( A10106Sedo2, 4, 1));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSedo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSedo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SEDO3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSedo3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10107Sedo3 = (short)(0) ;
               n10107Sedo3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10107Sedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10107Sedo3), 3, 0));
            }
            else
            {
               A10107Sedo3 = (short)(localUtil.ctol( httpContext.cgiGet( edtSedo3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10107Sedo3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10107Sedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10107Sedo3), 3, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSedo4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSedo4_Internalname)), DecimalUtil.stringToDec("9.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SEDO4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSedo4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10108Sedo4 = DecimalUtil.ZERO ;
               n10108Sedo4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10108Sedo4", GXutil.ltrimstr( A10108Sedo4, 4, 2));
            }
            else
            {
               A10108Sedo4 = localUtil.ctond( httpContext.cgiGet( edtSedo4_Internalname)) ;
               n10108Sedo4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10108Sedo4", GXutil.ltrimstr( A10108Sedo4, 4, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSedo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSedo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SEDO5");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSedo5_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10109Sedo5 = (byte)(0) ;
               n10109Sedo5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10109Sedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10109Sedo5), 2, 0));
            }
            else
            {
               A10109Sedo5 = (byte)(localUtil.ctol( httpContext.cgiGet( edtSedo5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10109Sedo5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10109Sedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10109Sedo5), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSedo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSedo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SEDO6");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSedo6_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10110Sedo6 = (byte)(0) ;
               n10110Sedo6 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10110Sedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10110Sedo6), 2, 0));
            }
            else
            {
               A10110Sedo6 = (byte)(localUtil.ctol( httpContext.cgiGet( edtSedo6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10110Sedo6 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10110Sedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10110Sedo6), 2, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HhIn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HHIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_HhIn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
               n10152Lb_HhIn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10152Lb_HhIn", localUtil.ttoc( A10152Lb_HhIn, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10152Lb_HhIn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HhIn_Internalname))) ;
               n10152Lb_HhIn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10152Lb_HhIn", localUtil.ttoc( A10152Lb_HhIn, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HhOut_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HHOUT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_HhOut_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
               n10138Lb_HhOut = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10138Lb_HhOut", localUtil.ttoc( A10138Lb_HhOut, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10138Lb_HhOut = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HhOut_Internalname))) ;
               n10138Lb_HhOut = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10138Lb_HhOut", localUtil.ttoc( A10138Lb_HhOut, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtLb_HhTin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "LB_HHTIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_HhTin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
               n10153Lb_HhTin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10153Lb_HhTin", localUtil.ttoc( A10153Lb_HhTin, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10153Lb_HhTin = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HhTin_Internalname))) ;
               n10153Lb_HhTin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10153Lb_HhTin", localUtil.ttoc( A10153Lb_HhTin, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UbPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UbPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_UBPZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_UbPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10148Lb_UbPzs = 0 ;
               n10148Lb_UbPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10148Lb_UbPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10148Lb_UbPzs), 6, 0));
            }
            else
            {
               A10148Lb_UbPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_UbPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10148Lb_UbPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10148Lb_UbPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10148Lb_UbPzs), 6, 0));
            }
            A10135Lb_UbUb = httpContext.cgiGet( edtLb_UbUb_Internalname) ;
            n10135Lb_UbUb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10135Lb_UbUb", A10135Lb_UbUb);
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
               A9611Lb_Hdr = (int)(GXutil.lval( httpContext.GetPar( "Lb_Hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9611Lb_Hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9611Lb_Hdr), 8, 0));
               A9612Lb_Hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Lb_Hdrr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9612Lb_Hdrr", GXutil.str( A9612Lb_Hdrr, 1, 0));
               A9613Lb_Hdrp = httpContext.GetPar( "Lb_Hdrp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9613Lb_Hdrp", A9613Lb_Hdrp);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
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
                        e1118T2 ();
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
            initAll18T1373( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1374_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1374_Enabled), 5, 0), !bGXsfl_165_Refreshing);
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
      disableAttributes18T1373( ) ;
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

   public void confirm_18T0( )
   {
      beforeValidate18T1373( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18T1373( ) ;
         }
         else
         {
            checkExtendedTable18T1373( ) ;
            if ( AnyError == 0 )
            {
               zm18T1373( 7) ;
            }
            closeExtendedTableCursors18T1373( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1373 = Gx_mode ;
         confirm_18T1374( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1373 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1373 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues18T0( ) ;
      }
   }

   public void confirm_18T1374( )
   {
      sV34Tot_pz = OV34Tot_pz ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
      nGXsfl_165_idx = 0 ;
      while ( nGXsfl_165_idx < nRC_GXsfl_165 )
      {
         readRow18T1374( ) ;
         if ( ( nRcdExists_1374 != 0 ) || ( nIsMod_1374 != 0 ) )
         {
            getKey18T1374( ) ;
            if ( ( nRcdExists_1374 == 0 ) && ( nRcdDeleted_1374 == 0 ) )
            {
               if ( RcdFound1374 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18T1374( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18T1374( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors18T1374( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     OV34Tot_pz = AV34Tot_pz ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "LB_NUBI_" + sGXsfl_165_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_NUbi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1374 != 0 )
               {
                  if ( nRcdDeleted_1374 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18T1374( ) ;
                     load18T1374( ) ;
                     beforeValidate18T1374( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18T1374( ) ;
                        OV34Tot_pz = AV34Tot_pz ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1374 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18T1374( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18T1374( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors18T1374( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           OV34Tot_pz = AV34Tot_pz ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1374 == 0 )
                  {
                     GXCCtl = "LB_NUBI_" + sGXsfl_165_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_NUbi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1374_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_NUbi_Internalname, GXutil.rtrim( A10155Lb_NUbi)) ;
         httpContext.changePostValue( edtLb_NPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10155Lb_NUbi_"+sGXsfl_165_idx, GXutil.rtrim( Z10155Lb_NUbi)) ;
         httpContext.changePostValue( "ZT_"+"Z10156Lb_NPzs_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( Z10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10156Lb_NPzs_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( O10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1374_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1374_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1374_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1374 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1374_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1374_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_NUBI_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NUbi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_NPZS_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      OV34Tot_pz = sV34Tot_pz ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18T0( )
   {
   }

   public void e1118T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tubi002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tubi002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tubi002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV15Lit3 = httpContext.getMessage( "Total Piezas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tubi002_impl.this.A396EmprCod = GXv_char2[0] ;
      tubi002_impl.this.AV11EmprNom = GXv_char3[0] ;
      tubi002_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV34Tot_pz = AV35Totp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
   }

   public void zm18T1373( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9614Lb_UsuIn = T018T5_A9614Lb_UsuIn[0] ;
            Z9615Lb_FecIn = T018T5_A9615Lb_FecIn[0] ;
            Z9616Lb_UsuOut = T018T5_A9616Lb_UsuOut[0] ;
            Z9617Lb_FecOut = T018T5_A9617Lb_FecOut[0] ;
            Z9618Lb_inout = T018T5_A9618Lb_inout[0] ;
            Z9623Lb_FecTin = T018T5_A9623Lb_FecTin[0] ;
            Z9624Lb_UsuTin = T018T5_A9624Lb_UsuTin[0] ;
            Z9625Lb_obsin = T018T5_A9625Lb_obsin[0] ;
            Z9702Lb_FecPAc = T018T5_A9702Lb_FecPAc[0] ;
            Z9703Lb_FecAcF = T018T5_A9703Lb_FecAcF[0] ;
            Z9709Lb_obsout = T018T5_A9709Lb_obsout[0] ;
            Z9721Lb_obsprb = T018T5_A9721Lb_obsprb[0] ;
            Z9857Ex_Obs = T018T5_A9857Ex_Obs[0] ;
            Z10105Sedo1 = T018T5_A10105Sedo1[0] ;
            Z10106Sedo2 = T018T5_A10106Sedo2[0] ;
            Z10107Sedo3 = T018T5_A10107Sedo3[0] ;
            Z10108Sedo4 = T018T5_A10108Sedo4[0] ;
            Z10109Sedo5 = T018T5_A10109Sedo5[0] ;
            Z10110Sedo6 = T018T5_A10110Sedo6[0] ;
            Z10152Lb_HhIn = T018T5_A10152Lb_HhIn[0] ;
            Z10138Lb_HhOut = T018T5_A10138Lb_HhOut[0] ;
            Z10153Lb_HhTin = T018T5_A10153Lb_HhTin[0] ;
            Z10148Lb_UbPzs = T018T5_A10148Lb_UbPzs[0] ;
            Z10135Lb_UbUb = T018T5_A10135Lb_UbUb[0] ;
         }
         else
         {
            Z9614Lb_UsuIn = A9614Lb_UsuIn ;
            Z9615Lb_FecIn = A9615Lb_FecIn ;
            Z9616Lb_UsuOut = A9616Lb_UsuOut ;
            Z9617Lb_FecOut = A9617Lb_FecOut ;
            Z9618Lb_inout = A9618Lb_inout ;
            Z9623Lb_FecTin = A9623Lb_FecTin ;
            Z9624Lb_UsuTin = A9624Lb_UsuTin ;
            Z9625Lb_obsin = A9625Lb_obsin ;
            Z9702Lb_FecPAc = A9702Lb_FecPAc ;
            Z9703Lb_FecAcF = A9703Lb_FecAcF ;
            Z9709Lb_obsout = A9709Lb_obsout ;
            Z9721Lb_obsprb = A9721Lb_obsprb ;
            Z9857Ex_Obs = A9857Ex_Obs ;
            Z10105Sedo1 = A10105Sedo1 ;
            Z10106Sedo2 = A10106Sedo2 ;
            Z10107Sedo3 = A10107Sedo3 ;
            Z10108Sedo4 = A10108Sedo4 ;
            Z10109Sedo5 = A10109Sedo5 ;
            Z10110Sedo6 = A10110Sedo6 ;
            Z10152Lb_HhIn = A10152Lb_HhIn ;
            Z10138Lb_HhOut = A10138Lb_HhOut ;
            Z10153Lb_HhTin = A10153Lb_HhTin ;
            Z10148Lb_UbPzs = A10148Lb_UbPzs ;
            Z10135Lb_UbUb = A10135Lb_UbUb ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z9611Lb_Hdr = A9611Lb_Hdr ;
         Z9612Lb_Hdrr = A9612Lb_Hdrr ;
         Z9613Lb_Hdrp = A9613Lb_Hdrp ;
         Z9614Lb_UsuIn = A9614Lb_UsuIn ;
         Z9615Lb_FecIn = A9615Lb_FecIn ;
         Z9616Lb_UsuOut = A9616Lb_UsuOut ;
         Z9617Lb_FecOut = A9617Lb_FecOut ;
         Z9618Lb_inout = A9618Lb_inout ;
         Z9623Lb_FecTin = A9623Lb_FecTin ;
         Z9624Lb_UsuTin = A9624Lb_UsuTin ;
         Z9625Lb_obsin = A9625Lb_obsin ;
         Z9702Lb_FecPAc = A9702Lb_FecPAc ;
         Z9703Lb_FecAcF = A9703Lb_FecAcF ;
         Z9709Lb_obsout = A9709Lb_obsout ;
         Z9721Lb_obsprb = A9721Lb_obsprb ;
         Z9857Ex_Obs = A9857Ex_Obs ;
         Z10105Sedo1 = A10105Sedo1 ;
         Z10106Sedo2 = A10106Sedo2 ;
         Z10107Sedo3 = A10107Sedo3 ;
         Z10108Sedo4 = A10108Sedo4 ;
         Z10109Sedo5 = A10109Sedo5 ;
         Z10110Sedo6 = A10110Sedo6 ;
         Z10152Lb_HhIn = A10152Lb_HhIn ;
         Z10138Lb_HhOut = A10138Lb_HhOut ;
         Z10153Lb_HhTin = A10153Lb_HhTin ;
         Z10148Lb_UbPzs = A10148Lb_UbPzs ;
         Z10135Lb_UbUb = A10135Lb_UbUb ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TUBI002" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T018T6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018T6_A407EmprNom[0] ;
      n407EmprNom = T018T6_n407EmprNom[0] ;
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

   public void load18T1373( )
   {
      /* Using cursor T018T7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1373 = (short)(1) ;
         A407EmprNom = T018T7_A407EmprNom[0] ;
         n407EmprNom = T018T7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9614Lb_UsuIn = T018T7_A9614Lb_UsuIn[0] ;
         n9614Lb_UsuIn = T018T7_n9614Lb_UsuIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9614Lb_UsuIn", A9614Lb_UsuIn);
         A9615Lb_FecIn = T018T7_A9615Lb_FecIn[0] ;
         n9615Lb_FecIn = T018T7_n9615Lb_FecIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9615Lb_FecIn", localUtil.format(A9615Lb_FecIn, "99/99/99"));
         A9616Lb_UsuOut = T018T7_A9616Lb_UsuOut[0] ;
         n9616Lb_UsuOut = T018T7_n9616Lb_UsuOut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9616Lb_UsuOut", A9616Lb_UsuOut);
         A9617Lb_FecOut = T018T7_A9617Lb_FecOut[0] ;
         n9617Lb_FecOut = T018T7_n9617Lb_FecOut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9617Lb_FecOut", localUtil.format(A9617Lb_FecOut, "99/99/99"));
         A9618Lb_inout = T018T7_A9618Lb_inout[0] ;
         n9618Lb_inout = T018T7_n9618Lb_inout[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9618Lb_inout", GXutil.str( A9618Lb_inout, 1, 0));
         A9623Lb_FecTin = T018T7_A9623Lb_FecTin[0] ;
         n9623Lb_FecTin = T018T7_n9623Lb_FecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9623Lb_FecTin", localUtil.format(A9623Lb_FecTin, "99/99/99"));
         A9624Lb_UsuTin = T018T7_A9624Lb_UsuTin[0] ;
         n9624Lb_UsuTin = T018T7_n9624Lb_UsuTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9624Lb_UsuTin", A9624Lb_UsuTin);
         A9625Lb_obsin = T018T7_A9625Lb_obsin[0] ;
         n9625Lb_obsin = T018T7_n9625Lb_obsin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9625Lb_obsin", A9625Lb_obsin);
         A9702Lb_FecPAc = T018T7_A9702Lb_FecPAc[0] ;
         n9702Lb_FecPAc = T018T7_n9702Lb_FecPAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9702Lb_FecPAc", localUtil.format(A9702Lb_FecPAc, "99/99/99"));
         A9703Lb_FecAcF = T018T7_A9703Lb_FecAcF[0] ;
         n9703Lb_FecAcF = T018T7_n9703Lb_FecAcF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9703Lb_FecAcF", localUtil.format(A9703Lb_FecAcF, "99/99/99"));
         A9709Lb_obsout = T018T7_A9709Lb_obsout[0] ;
         n9709Lb_obsout = T018T7_n9709Lb_obsout[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9709Lb_obsout", A9709Lb_obsout);
         A9721Lb_obsprb = T018T7_A9721Lb_obsprb[0] ;
         n9721Lb_obsprb = T018T7_n9721Lb_obsprb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9721Lb_obsprb", A9721Lb_obsprb);
         A9857Ex_Obs = T018T7_A9857Ex_Obs[0] ;
         n9857Ex_Obs = T018T7_n9857Ex_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9857Ex_Obs", A9857Ex_Obs);
         A10105Sedo1 = T018T7_A10105Sedo1[0] ;
         n10105Sedo1 = T018T7_n10105Sedo1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10105Sedo1", GXutil.ltrimstr( A10105Sedo1, 4, 1));
         A10106Sedo2 = T018T7_A10106Sedo2[0] ;
         n10106Sedo2 = T018T7_n10106Sedo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10106Sedo2", GXutil.ltrimstr( A10106Sedo2, 4, 1));
         A10107Sedo3 = T018T7_A10107Sedo3[0] ;
         n10107Sedo3 = T018T7_n10107Sedo3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10107Sedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10107Sedo3), 3, 0));
         A10108Sedo4 = T018T7_A10108Sedo4[0] ;
         n10108Sedo4 = T018T7_n10108Sedo4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10108Sedo4", GXutil.ltrimstr( A10108Sedo4, 4, 2));
         A10109Sedo5 = T018T7_A10109Sedo5[0] ;
         n10109Sedo5 = T018T7_n10109Sedo5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10109Sedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10109Sedo5), 2, 0));
         A10110Sedo6 = T018T7_A10110Sedo6[0] ;
         n10110Sedo6 = T018T7_n10110Sedo6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10110Sedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10110Sedo6), 2, 0));
         A10152Lb_HhIn = T018T7_A10152Lb_HhIn[0] ;
         n10152Lb_HhIn = T018T7_n10152Lb_HhIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10152Lb_HhIn", localUtil.ttoc( A10152Lb_HhIn, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10138Lb_HhOut = T018T7_A10138Lb_HhOut[0] ;
         n10138Lb_HhOut = T018T7_n10138Lb_HhOut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10138Lb_HhOut", localUtil.ttoc( A10138Lb_HhOut, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10153Lb_HhTin = T018T7_A10153Lb_HhTin[0] ;
         n10153Lb_HhTin = T018T7_n10153Lb_HhTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10153Lb_HhTin", localUtil.ttoc( A10153Lb_HhTin, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10148Lb_UbPzs = T018T7_A10148Lb_UbPzs[0] ;
         n10148Lb_UbPzs = T018T7_n10148Lb_UbPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10148Lb_UbPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10148Lb_UbPzs), 6, 0));
         A10135Lb_UbUb = T018T7_A10135Lb_UbUb[0] ;
         n10135Lb_UbUb = T018T7_n10135Lb_UbUb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10135Lb_UbUb", A10135Lb_UbUb);
         zm18T1373( -6) ;
      }
      pr_default.close(5);
      onLoadActions18T1373( ) ;
   }

   public void onLoadActions18T1373( )
   {
   }

   public void checkExtendedTable18T1373( )
   {
      nIsDirty_1373 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors18T1373( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey18T1373( )
   {
      /* Using cursor T018T8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1373 = (short)(1) ;
      }
      else
      {
         RcdFound1373 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018T5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      if ( (pr_default.getStatus(3) != 101) && ( T018T5_A9611Lb_Hdr[0] == A9611Lb_Hdr ) && ( T018T5_A9612Lb_Hdrr[0] == A9612Lb_Hdrr ) && ( GXutil.strcmp(T018T5_A9613Lb_Hdrp[0], A9613Lb_Hdrp) == 0 ) && ( GXutil.strcmp(T018T5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18T1373( 6) ;
         RcdFound1373 = (short)(1) ;
         A9614Lb_UsuIn = T018T5_A9614Lb_UsuIn[0] ;
         n9614Lb_UsuIn = T018T5_n9614Lb_UsuIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9614Lb_UsuIn", A9614Lb_UsuIn);
         A9615Lb_FecIn = T018T5_A9615Lb_FecIn[0] ;
         n9615Lb_FecIn = T018T5_n9615Lb_FecIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9615Lb_FecIn", localUtil.format(A9615Lb_FecIn, "99/99/99"));
         A9616Lb_UsuOut = T018T5_A9616Lb_UsuOut[0] ;
         n9616Lb_UsuOut = T018T5_n9616Lb_UsuOut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9616Lb_UsuOut", A9616Lb_UsuOut);
         A9617Lb_FecOut = T018T5_A9617Lb_FecOut[0] ;
         n9617Lb_FecOut = T018T5_n9617Lb_FecOut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9617Lb_FecOut", localUtil.format(A9617Lb_FecOut, "99/99/99"));
         A9618Lb_inout = T018T5_A9618Lb_inout[0] ;
         n9618Lb_inout = T018T5_n9618Lb_inout[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9618Lb_inout", GXutil.str( A9618Lb_inout, 1, 0));
         A9623Lb_FecTin = T018T5_A9623Lb_FecTin[0] ;
         n9623Lb_FecTin = T018T5_n9623Lb_FecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9623Lb_FecTin", localUtil.format(A9623Lb_FecTin, "99/99/99"));
         A9624Lb_UsuTin = T018T5_A9624Lb_UsuTin[0] ;
         n9624Lb_UsuTin = T018T5_n9624Lb_UsuTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9624Lb_UsuTin", A9624Lb_UsuTin);
         A9625Lb_obsin = T018T5_A9625Lb_obsin[0] ;
         n9625Lb_obsin = T018T5_n9625Lb_obsin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9625Lb_obsin", A9625Lb_obsin);
         A9702Lb_FecPAc = T018T5_A9702Lb_FecPAc[0] ;
         n9702Lb_FecPAc = T018T5_n9702Lb_FecPAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9702Lb_FecPAc", localUtil.format(A9702Lb_FecPAc, "99/99/99"));
         A9703Lb_FecAcF = T018T5_A9703Lb_FecAcF[0] ;
         n9703Lb_FecAcF = T018T5_n9703Lb_FecAcF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9703Lb_FecAcF", localUtil.format(A9703Lb_FecAcF, "99/99/99"));
         A9709Lb_obsout = T018T5_A9709Lb_obsout[0] ;
         n9709Lb_obsout = T018T5_n9709Lb_obsout[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9709Lb_obsout", A9709Lb_obsout);
         A9721Lb_obsprb = T018T5_A9721Lb_obsprb[0] ;
         n9721Lb_obsprb = T018T5_n9721Lb_obsprb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9721Lb_obsprb", A9721Lb_obsprb);
         A9857Ex_Obs = T018T5_A9857Ex_Obs[0] ;
         n9857Ex_Obs = T018T5_n9857Ex_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9857Ex_Obs", A9857Ex_Obs);
         A10105Sedo1 = T018T5_A10105Sedo1[0] ;
         n10105Sedo1 = T018T5_n10105Sedo1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10105Sedo1", GXutil.ltrimstr( A10105Sedo1, 4, 1));
         A10106Sedo2 = T018T5_A10106Sedo2[0] ;
         n10106Sedo2 = T018T5_n10106Sedo2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10106Sedo2", GXutil.ltrimstr( A10106Sedo2, 4, 1));
         A10107Sedo3 = T018T5_A10107Sedo3[0] ;
         n10107Sedo3 = T018T5_n10107Sedo3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10107Sedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10107Sedo3), 3, 0));
         A10108Sedo4 = T018T5_A10108Sedo4[0] ;
         n10108Sedo4 = T018T5_n10108Sedo4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10108Sedo4", GXutil.ltrimstr( A10108Sedo4, 4, 2));
         A10109Sedo5 = T018T5_A10109Sedo5[0] ;
         n10109Sedo5 = T018T5_n10109Sedo5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10109Sedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10109Sedo5), 2, 0));
         A10110Sedo6 = T018T5_A10110Sedo6[0] ;
         n10110Sedo6 = T018T5_n10110Sedo6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10110Sedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10110Sedo6), 2, 0));
         A10152Lb_HhIn = T018T5_A10152Lb_HhIn[0] ;
         n10152Lb_HhIn = T018T5_n10152Lb_HhIn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10152Lb_HhIn", localUtil.ttoc( A10152Lb_HhIn, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10138Lb_HhOut = T018T5_A10138Lb_HhOut[0] ;
         n10138Lb_HhOut = T018T5_n10138Lb_HhOut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10138Lb_HhOut", localUtil.ttoc( A10138Lb_HhOut, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10153Lb_HhTin = T018T5_A10153Lb_HhTin[0] ;
         n10153Lb_HhTin = T018T5_n10153Lb_HhTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10153Lb_HhTin", localUtil.ttoc( A10153Lb_HhTin, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10148Lb_UbPzs = T018T5_A10148Lb_UbPzs[0] ;
         n10148Lb_UbPzs = T018T5_n10148Lb_UbPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10148Lb_UbPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10148Lb_UbPzs), 6, 0));
         A10135Lb_UbUb = T018T5_A10135Lb_UbUb[0] ;
         n10135Lb_UbUb = T018T5_n10135Lb_UbUb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10135Lb_UbUb", A10135Lb_UbUb);
         Z396EmprCod = A396EmprCod ;
         Z9611Lb_Hdr = A9611Lb_Hdr ;
         Z9612Lb_Hdrr = A9612Lb_Hdrr ;
         Z9613Lb_Hdrp = A9613Lb_Hdrp ;
         sMode1373 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18T1373( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1373 = (short)(0) ;
            initializeNonKey18T1373( ) ;
         }
         Gx_mode = sMode1373 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1373 = (short)(0) ;
         initializeNonKey18T1373( ) ;
         sMode1373 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1373 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey18T1373( ) ;
      if ( RcdFound1373 == 0 )
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
      RcdFound1373 = (short)(0) ;
      /* Using cursor T018T9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T018T9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018T9_A9611Lb_Hdr[0] == A9611Lb_Hdr ) && ( T018T9_A9612Lb_Hdrr[0] == A9612Lb_Hdrr ) && ( GXutil.strcmp(T018T9_A9613Lb_Hdrp[0], A9613Lb_Hdrp) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T018T9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018T9_A9611Lb_Hdr[0] == A9611Lb_Hdr ) && ( T018T9_A9612Lb_Hdrr[0] == A9612Lb_Hdrr ) && ( GXutil.strcmp(T018T9_A9613Lb_Hdrp[0], A9613Lb_Hdrp) == 0 ) )
         {
            RcdFound1373 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1373 = (short)(0) ;
      /* Using cursor T018T10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T018T10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018T10_A9611Lb_Hdr[0] == A9611Lb_Hdr ) && ( T018T10_A9612Lb_Hdrr[0] == A9612Lb_Hdrr ) && ( GXutil.strcmp(T018T10_A9613Lb_Hdrp[0], A9613Lb_Hdrp) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T018T10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018T10_A9611Lb_Hdr[0] == A9611Lb_Hdr ) && ( T018T10_A9612Lb_Hdrr[0] == A9612Lb_Hdrr ) && ( GXutil.strcmp(T018T10_A9613Lb_Hdrp[0], A9613Lb_Hdrp) == 0 ) )
         {
            RcdFound1373 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18T1373( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         AV34Tot_pz = OV34Tot_pz ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
         GX_FocusControl = edtLb_UsuIn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18T1373( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1373 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9611Lb_Hdr != Z9611Lb_Hdr ) || ( A9612Lb_Hdrr != Z9612Lb_Hdrr ) || ( GXutil.strcmp(A9613Lb_Hdrp, Z9613Lb_Hdrp) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               AV34Tot_pz = OV34Tot_pz ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_UsuIn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               AV34Tot_pz = OV34Tot_pz ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
               update18T1373( ) ;
               GX_FocusControl = edtLb_UsuIn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9611Lb_Hdr != Z9611Lb_Hdr ) || ( A9612Lb_Hdrr != Z9612Lb_Hdrr ) || ( GXutil.strcmp(A9613Lb_Hdrp, Z9613Lb_Hdrp) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               AV34Tot_pz = OV34Tot_pz ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
               GX_FocusControl = edtLb_UsuIn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18T1373( ) ;
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
                  AV34Tot_pz = OV34Tot_pz ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                  GX_FocusControl = edtLb_UsuIn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18T1373( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9611Lb_Hdr != Z9611Lb_Hdr ) || ( A9612Lb_Hdrr != Z9612Lb_Hdrr ) || ( GXutil.strcmp(A9613Lb_Hdrp, Z9613Lb_Hdrp) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV34Tot_pz = OV34Tot_pz ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_UsuIn_Internalname ;
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
      getKey18T1373( ) ;
      if ( RcdFound1373 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9611Lb_Hdr != Z9611Lb_Hdr ) || ( A9612Lb_Hdrr != Z9612Lb_Hdrr ) || ( GXutil.strcmp(A9613Lb_Hdrp, Z9613Lb_Hdrp) != 0 ) )
         {
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9611Lb_Hdr != Z9611Lb_Hdr ) || ( A9612Lb_Hdrr != Z9612Lb_Hdrr ) || ( GXutil.strcmp(A9613Lb_Hdrp, Z9613Lb_Hdrp) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tubi002");
      GX_FocusControl = edtLb_UsuIn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_18T0( ) ;
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
      if ( RcdFound1373 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtLb_UsuIn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18T1373( ) ;
      if ( RcdFound1373 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UsuIn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18T1373( ) ;
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
      if ( RcdFound1373 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UsuIn_Internalname ;
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
      if ( RcdFound1373 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UsuIn_Internalname ;
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
      scanStart18T1373( ) ;
      if ( RcdFound1373 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1373 != 0 )
         {
            scanNext18T1373( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UsuIn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18T1373( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18T1373( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRINO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z9614Lb_UsuIn, T018T4_A9614Lb_UsuIn[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9615Lb_FecIn), GXutil.resetTime(T018T4_A9615Lb_FecIn[0])) ) || ( GXutil.strcmp(Z9616Lb_UsuOut, T018T4_A9616Lb_UsuOut[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9617Lb_FecOut), GXutil.resetTime(T018T4_A9617Lb_FecOut[0])) ) || ( Z9618Lb_inout != T018T4_A9618Lb_inout[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z9623Lb_FecTin), GXutil.resetTime(T018T4_A9623Lb_FecTin[0])) ) || ( GXutil.strcmp(Z9624Lb_UsuTin, T018T4_A9624Lb_UsuTin[0]) != 0 ) || ( GXutil.strcmp(Z9625Lb_obsin, T018T4_A9625Lb_obsin[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9702Lb_FecPAc), GXutil.resetTime(T018T4_A9702Lb_FecPAc[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z9703Lb_FecAcF), GXutil.resetTime(T018T4_A9703Lb_FecAcF[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9709Lb_obsout, T018T4_A9709Lb_obsout[0]) != 0 ) || ( GXutil.strcmp(Z9721Lb_obsprb, T018T4_A9721Lb_obsprb[0]) != 0 ) || ( GXutil.strcmp(Z9857Ex_Obs, T018T4_A9857Ex_Obs[0]) != 0 ) || ( DecimalUtil.compareTo(Z10105Sedo1, T018T4_A10105Sedo1[0]) != 0 ) || ( DecimalUtil.compareTo(Z10106Sedo2, T018T4_A10106Sedo2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10107Sedo3 != T018T4_A10107Sedo3[0] ) || ( DecimalUtil.compareTo(Z10108Sedo4, T018T4_A10108Sedo4[0]) != 0 ) || ( Z10109Sedo5 != T018T4_A10109Sedo5[0] ) || ( Z10110Sedo6 != T018T4_A10110Sedo6[0] ) || !( GXutil.dateCompare(Z10152Lb_HhIn, T018T4_A10152Lb_HhIn[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10138Lb_HhOut, T018T4_A10138Lb_HhOut[0]) ) || !( GXutil.dateCompare(Z10153Lb_HhTin, T018T4_A10153Lb_HhTin[0]) ) || ( Z10148Lb_UbPzs != T018T4_A10148Lb_UbPzs[0] ) || ( GXutil.strcmp(Z10135Lb_UbUb, T018T4_A10135Lb_UbUb[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9614Lb_UsuIn, T018T4_A9614Lb_UsuIn[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_UsuIn");
               GXutil.writeLogRaw("Old: ",Z9614Lb_UsuIn);
               GXutil.writeLogRaw("Current: ",T018T4_A9614Lb_UsuIn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9615Lb_FecIn), GXutil.resetTime(T018T4_A9615Lb_FecIn[0])) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_FecIn");
               GXutil.writeLogRaw("Old: ",Z9615Lb_FecIn);
               GXutil.writeLogRaw("Current: ",T018T4_A9615Lb_FecIn[0]);
            }
            if ( GXutil.strcmp(Z9616Lb_UsuOut, T018T4_A9616Lb_UsuOut[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_UsuOut");
               GXutil.writeLogRaw("Old: ",Z9616Lb_UsuOut);
               GXutil.writeLogRaw("Current: ",T018T4_A9616Lb_UsuOut[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9617Lb_FecOut), GXutil.resetTime(T018T4_A9617Lb_FecOut[0])) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_FecOut");
               GXutil.writeLogRaw("Old: ",Z9617Lb_FecOut);
               GXutil.writeLogRaw("Current: ",T018T4_A9617Lb_FecOut[0]);
            }
            if ( Z9618Lb_inout != T018T4_A9618Lb_inout[0] )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_inout");
               GXutil.writeLogRaw("Old: ",Z9618Lb_inout);
               GXutil.writeLogRaw("Current: ",T018T4_A9618Lb_inout[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9623Lb_FecTin), GXutil.resetTime(T018T4_A9623Lb_FecTin[0])) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_FecTin");
               GXutil.writeLogRaw("Old: ",Z9623Lb_FecTin);
               GXutil.writeLogRaw("Current: ",T018T4_A9623Lb_FecTin[0]);
            }
            if ( GXutil.strcmp(Z9624Lb_UsuTin, T018T4_A9624Lb_UsuTin[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_UsuTin");
               GXutil.writeLogRaw("Old: ",Z9624Lb_UsuTin);
               GXutil.writeLogRaw("Current: ",T018T4_A9624Lb_UsuTin[0]);
            }
            if ( GXutil.strcmp(Z9625Lb_obsin, T018T4_A9625Lb_obsin[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_obsin");
               GXutil.writeLogRaw("Old: ",Z9625Lb_obsin);
               GXutil.writeLogRaw("Current: ",T018T4_A9625Lb_obsin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9702Lb_FecPAc), GXutil.resetTime(T018T4_A9702Lb_FecPAc[0])) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_FecPAc");
               GXutil.writeLogRaw("Old: ",Z9702Lb_FecPAc);
               GXutil.writeLogRaw("Current: ",T018T4_A9702Lb_FecPAc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9703Lb_FecAcF), GXutil.resetTime(T018T4_A9703Lb_FecAcF[0])) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_FecAcF");
               GXutil.writeLogRaw("Old: ",Z9703Lb_FecAcF);
               GXutil.writeLogRaw("Current: ",T018T4_A9703Lb_FecAcF[0]);
            }
            if ( GXutil.strcmp(Z9709Lb_obsout, T018T4_A9709Lb_obsout[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_obsout");
               GXutil.writeLogRaw("Old: ",Z9709Lb_obsout);
               GXutil.writeLogRaw("Current: ",T018T4_A9709Lb_obsout[0]);
            }
            if ( GXutil.strcmp(Z9721Lb_obsprb, T018T4_A9721Lb_obsprb[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_obsprb");
               GXutil.writeLogRaw("Old: ",Z9721Lb_obsprb);
               GXutil.writeLogRaw("Current: ",T018T4_A9721Lb_obsprb[0]);
            }
            if ( GXutil.strcmp(Z9857Ex_Obs, T018T4_A9857Ex_Obs[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Ex_Obs");
               GXutil.writeLogRaw("Old: ",Z9857Ex_Obs);
               GXutil.writeLogRaw("Current: ",T018T4_A9857Ex_Obs[0]);
            }
            if ( DecimalUtil.compareTo(Z10105Sedo1, T018T4_A10105Sedo1[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Sedo1");
               GXutil.writeLogRaw("Old: ",Z10105Sedo1);
               GXutil.writeLogRaw("Current: ",T018T4_A10105Sedo1[0]);
            }
            if ( DecimalUtil.compareTo(Z10106Sedo2, T018T4_A10106Sedo2[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Sedo2");
               GXutil.writeLogRaw("Old: ",Z10106Sedo2);
               GXutil.writeLogRaw("Current: ",T018T4_A10106Sedo2[0]);
            }
            if ( Z10107Sedo3 != T018T4_A10107Sedo3[0] )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Sedo3");
               GXutil.writeLogRaw("Old: ",Z10107Sedo3);
               GXutil.writeLogRaw("Current: ",T018T4_A10107Sedo3[0]);
            }
            if ( DecimalUtil.compareTo(Z10108Sedo4, T018T4_A10108Sedo4[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Sedo4");
               GXutil.writeLogRaw("Old: ",Z10108Sedo4);
               GXutil.writeLogRaw("Current: ",T018T4_A10108Sedo4[0]);
            }
            if ( Z10109Sedo5 != T018T4_A10109Sedo5[0] )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Sedo5");
               GXutil.writeLogRaw("Old: ",Z10109Sedo5);
               GXutil.writeLogRaw("Current: ",T018T4_A10109Sedo5[0]);
            }
            if ( Z10110Sedo6 != T018T4_A10110Sedo6[0] )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Sedo6");
               GXutil.writeLogRaw("Old: ",Z10110Sedo6);
               GXutil.writeLogRaw("Current: ",T018T4_A10110Sedo6[0]);
            }
            if ( !( GXutil.dateCompare(Z10152Lb_HhIn, T018T4_A10152Lb_HhIn[0]) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_HhIn");
               GXutil.writeLogRaw("Old: ",Z10152Lb_HhIn);
               GXutil.writeLogRaw("Current: ",T018T4_A10152Lb_HhIn[0]);
            }
            if ( !( GXutil.dateCompare(Z10138Lb_HhOut, T018T4_A10138Lb_HhOut[0]) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_HhOut");
               GXutil.writeLogRaw("Old: ",Z10138Lb_HhOut);
               GXutil.writeLogRaw("Current: ",T018T4_A10138Lb_HhOut[0]);
            }
            if ( !( GXutil.dateCompare(Z10153Lb_HhTin, T018T4_A10153Lb_HhTin[0]) ) )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_HhTin");
               GXutil.writeLogRaw("Old: ",Z10153Lb_HhTin);
               GXutil.writeLogRaw("Current: ",T018T4_A10153Lb_HhTin[0]);
            }
            if ( Z10148Lb_UbPzs != T018T4_A10148Lb_UbPzs[0] )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_UbPzs");
               GXutil.writeLogRaw("Old: ",Z10148Lb_UbPzs);
               GXutil.writeLogRaw("Current: ",T018T4_A10148Lb_UbPzs[0]);
            }
            if ( GXutil.strcmp(Z10135Lb_UbUb, T018T4_A10135Lb_UbUb[0]) != 0 )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_UbUb");
               GXutil.writeLogRaw("Old: ",Z10135Lb_UbUb);
               GXutil.writeLogRaw("Current: ",T018T4_A10135Lb_UbUb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRINO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18T1373( )
   {
      beforeValidate18T1373( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18T1373( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18T1373( 0) ;
         checkOptimisticConcurrency18T1373( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18T1373( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18T1373( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018T11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, Boolean.valueOf(n9614Lb_UsuIn), A9614Lb_UsuIn, Boolean.valueOf(n9615Lb_FecIn), A9615Lb_FecIn, Boolean.valueOf(n9616Lb_UsuOut), A9616Lb_UsuOut, Boolean.valueOf(n9617Lb_FecOut), A9617Lb_FecOut, Boolean.valueOf(n9618Lb_inout), Byte.valueOf(A9618Lb_inout), Boolean.valueOf(n9623Lb_FecTin), A9623Lb_FecTin, Boolean.valueOf(n9624Lb_UsuTin), A9624Lb_UsuTin, Boolean.valueOf(n9625Lb_obsin), A9625Lb_obsin, Boolean.valueOf(n9702Lb_FecPAc), A9702Lb_FecPAc, Boolean.valueOf(n9703Lb_FecAcF), A9703Lb_FecAcF, Boolean.valueOf(n9709Lb_obsout), A9709Lb_obsout, Boolean.valueOf(n9721Lb_obsprb), A9721Lb_obsprb, Boolean.valueOf(n9857Ex_Obs), A9857Ex_Obs, Boolean.valueOf(n10105Sedo1), A10105Sedo1, Boolean.valueOf(n10106Sedo2), A10106Sedo2, Boolean.valueOf(n10107Sedo3), Short.valueOf(A10107Sedo3), Boolean.valueOf(n10108Sedo4), A10108Sedo4, Boolean.valueOf(n10109Sedo5), Byte.valueOf(A10109Sedo5), Boolean.valueOf(n10110Sedo6), Byte.valueOf(A10110Sedo6), Boolean.valueOf(n10152Lb_HhIn), A10152Lb_HhIn, Boolean.valueOf(n10138Lb_HhOut), A10138Lb_HhOut, Boolean.valueOf(n10153Lb_HhTin), A10153Lb_HhTin, Boolean.valueOf(n10148Lb_UbPzs), Integer.valueOf(A10148Lb_UbPzs), Boolean.valueOf(n10135Lb_UbUb), A10135Lb_UbUb, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
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
                        processLevel18T1373( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18T0( ) ;
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
            load18T1373( ) ;
         }
         endLevel18T1373( ) ;
      }
      closeExtendedTableCursors18T1373( ) ;
   }

   public void update18T1373( )
   {
      beforeValidate18T1373( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18T1373( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18T1373( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18T1373( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18T1373( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018T12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n9614Lb_UsuIn), A9614Lb_UsuIn, Boolean.valueOf(n9615Lb_FecIn), A9615Lb_FecIn, Boolean.valueOf(n9616Lb_UsuOut), A9616Lb_UsuOut, Boolean.valueOf(n9617Lb_FecOut), A9617Lb_FecOut, Boolean.valueOf(n9618Lb_inout), Byte.valueOf(A9618Lb_inout), Boolean.valueOf(n9623Lb_FecTin), A9623Lb_FecTin, Boolean.valueOf(n9624Lb_UsuTin), A9624Lb_UsuTin, Boolean.valueOf(n9625Lb_obsin), A9625Lb_obsin, Boolean.valueOf(n9702Lb_FecPAc), A9702Lb_FecPAc, Boolean.valueOf(n9703Lb_FecAcF), A9703Lb_FecAcF, Boolean.valueOf(n9709Lb_obsout), A9709Lb_obsout, Boolean.valueOf(n9721Lb_obsprb), A9721Lb_obsprb, Boolean.valueOf(n9857Ex_Obs), A9857Ex_Obs, Boolean.valueOf(n10105Sedo1), A10105Sedo1, Boolean.valueOf(n10106Sedo2), A10106Sedo2, Boolean.valueOf(n10107Sedo3), Short.valueOf(A10107Sedo3), Boolean.valueOf(n10108Sedo4), A10108Sedo4, Boolean.valueOf(n10109Sedo5), Byte.valueOf(A10109Sedo5), Boolean.valueOf(n10110Sedo6), Byte.valueOf(A10110Sedo6), Boolean.valueOf(n10152Lb_HhIn), A10152Lb_HhIn, Boolean.valueOf(n10138Lb_HhOut), A10138Lb_HhOut, Boolean.valueOf(n10153Lb_HhTin), A10153Lb_HhTin, Boolean.valueOf(n10148Lb_UbPzs), Integer.valueOf(A10148Lb_UbPzs), Boolean.valueOf(n10135Lb_UbUb), A10135Lb_UbUb, A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRINO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate18T1373( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18T1373( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18T0( ) ;
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
         endLevel18T1373( ) ;
      }
      closeExtendedTableCursors18T1373( ) ;
   }

   public void deferredUpdate18T1373( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18T1373( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18T1373( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18T1373( ) ;
         afterConfirm18T1373( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18T1373( ) ;
            if ( AnyError == 0 )
            {
               AV34Tot_pz = OV34Tot_pz ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
               scanStart18T1374( ) ;
               while ( RcdFound1374 != 0 )
               {
                  getByPrimaryKey18T1374( ) ;
                  delete18T1374( ) ;
                  scanNext18T1374( ) ;
                  OV34Tot_pz = AV34Tot_pz ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
               }
               scanEnd18T1374( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018T13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1373 == 0 )
                        {
                           initAll18T1373( ) ;
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
                        resetCaption18T0( ) ;
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
      sMode1373 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18T1373( ) ;
      Gx_mode = sMode1373 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18T1373( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel18T1374( )
   {
      sV34Tot_pz = OV34Tot_pz ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
      nGXsfl_165_idx = 0 ;
      while ( nGXsfl_165_idx < nRC_GXsfl_165 )
      {
         readRow18T1374( ) ;
         if ( ( nRcdExists_1374 != 0 ) || ( nIsMod_1374 != 0 ) )
         {
            standaloneNotModal18T1374( ) ;
            getKey18T1374( ) ;
            if ( ( nRcdExists_1374 == 0 ) && ( nRcdDeleted_1374 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18T1374( ) ;
            }
            else
            {
               if ( RcdFound1374 != 0 )
               {
                  if ( ( nRcdDeleted_1374 != 0 ) && ( nRcdExists_1374 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18T1374( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1374 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18T1374( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1374 == 0 )
                  {
                     GXCCtl = "LB_NUBI_" + sGXsfl_165_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_NUbi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            OV34Tot_pz = AV34Tot_pz ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1374_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_NUbi_Internalname, GXutil.rtrim( A10155Lb_NUbi)) ;
         httpContext.changePostValue( edtLb_NPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10155Lb_NUbi_"+sGXsfl_165_idx, GXutil.rtrim( Z10155Lb_NUbi)) ;
         httpContext.changePostValue( "ZT_"+"Z10156Lb_NPzs_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( Z10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T10156Lb_NPzs_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( O10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1374_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1374_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1374_"+sGXsfl_165_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1374 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1374_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1374_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_NUBI_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NUbi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_NPZS_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18T1374( ) ;
      if ( AnyError != 0 )
      {
         OV34Tot_pz = sV34Tot_pz ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
      }
      nRcdExists_1374 = (short)(0) ;
      nIsMod_1374 = (short)(0) ;
      nRcdDeleted_1374 = (short)(0) ;
   }

   public void processLevel18T1373( )
   {
      /* Save parent mode. */
      sMode1373 = Gx_mode ;
      processNestedLevel18T1374( ) ;
      if ( AnyError != 0 )
      {
         OV34Tot_pz = sV34Tot_pz ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1373 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel18T1373( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18T1373( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tubi002");
         if ( AnyError == 0 )
         {
            confirmValues18T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tubi002");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18T1373( )
   {
      /* Scan By routine */
      /* Using cursor T018T14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      RcdFound1373 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1373 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18T1373( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1373 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1373 = (short)(1) ;
      }
   }

   public void scanEnd18T1373( )
   {
      pr_default.close(12);
   }

   public void afterConfirm18T1373( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18T1373( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18T1373( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18T1373( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18T1373( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18T1373( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18T1373( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLb_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Hdr_Enabled), 5, 0), true);
      edtLb_Hdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Hdrr_Enabled), 5, 0), true);
      edtLb_Hdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Hdrp_Enabled), 5, 0), true);
      edtLb_UsuIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UsuIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UsuIn_Enabled), 5, 0), true);
      edtLb_FecIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecIn_Enabled), 5, 0), true);
      edtLb_UsuOut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UsuOut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UsuOut_Enabled), 5, 0), true);
      edtLb_FecOut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecOut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecOut_Enabled), 5, 0), true);
      edtLb_inout_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_inout_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_inout_Enabled), 5, 0), true);
      edtLb_FecTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecTin_Enabled), 5, 0), true);
      edtLb_UsuTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UsuTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UsuTin_Enabled), 5, 0), true);
      edtLb_obsin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_obsin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_obsin_Enabled), 5, 0), true);
      edtLb_FecPAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecPAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecPAc_Enabled), 5, 0), true);
      edtLb_FecAcF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FecAcF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecAcF_Enabled), 5, 0), true);
      edtLb_obsout_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_obsout_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_obsout_Enabled), 5, 0), true);
      edtLb_obsprb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_obsprb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_obsprb_Enabled), 5, 0), true);
      edtEx_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEx_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEx_Obs_Enabled), 5, 0), true);
      edtSedo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSedo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSedo1_Enabled), 5, 0), true);
      edtSedo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSedo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSedo2_Enabled), 5, 0), true);
      edtSedo3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSedo3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSedo3_Enabled), 5, 0), true);
      edtSedo4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSedo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSedo4_Enabled), 5, 0), true);
      edtSedo5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSedo5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSedo5_Enabled), 5, 0), true);
      edtSedo6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSedo6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSedo6_Enabled), 5, 0), true);
      edtLb_HhIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HhIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HhIn_Enabled), 5, 0), true);
      edtLb_HhOut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HhOut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HhOut_Enabled), 5, 0), true);
      edtLb_HhTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HhTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HhTin_Enabled), 5, 0), true);
      edtLb_UbPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UbPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UbPzs_Enabled), 5, 0), true);
      edtLb_UbUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UbUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UbUb_Enabled), 5, 0), true);
   }

   public void zm18T1374( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10156Lb_NPzs = T018T3_A10156Lb_NPzs[0] ;
         }
         else
         {
            Z10156Lb_NPzs = A10156Lb_NPzs ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z396EmprCod = A396EmprCod ;
         Z9611Lb_Hdr = A9611Lb_Hdr ;
         Z9612Lb_Hdrr = A9612Lb_Hdrr ;
         Z9613Lb_Hdrp = A9613Lb_Hdrp ;
         Z10155Lb_NUbi = A10155Lb_NUbi ;
         Z10156Lb_NPzs = A10156Lb_NPzs ;
      }
   }

   public void standaloneNotModal18T1374( )
   {
   }

   public void standaloneModal18T1374( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_NUbi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_NUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NUbi_Enabled), 5, 0), !bGXsfl_165_Refreshing);
      }
      else
      {
         edtLb_NUbi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_NUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NUbi_Enabled), 5, 0), !bGXsfl_165_Refreshing);
      }
   }

   public void load18T1374( )
   {
      /* Using cursor T018T15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1374 = (short)(1) ;
         A10156Lb_NPzs = T018T15_A10156Lb_NPzs[0] ;
         n10156Lb_NPzs = T018T15_n10156Lb_NPzs[0] ;
         zm18T1374( -8) ;
      }
      pr_default.close(13);
      onLoadActions18T1374( ) ;
   }

   public void onLoadActions18T1374( )
   {
   }

   public void checkExtendedTable18T1374( )
   {
      nIsDirty_1374 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal18T1374( ) ;
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A10155Lb_NUbi ;
         GXv_char2[0] = AV33Emp_dUb ;
         new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tubi002_impl.this.A396EmprCod = GXv_char4[0] ;
         tubi002_impl.this.A10155Lb_NUbi = GXv_char3[0] ;
         tubi002_impl.this.AV33Emp_dUb = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Emp_dUb", AV33Emp_dUb);
      }
      if ( ( GXutil.strcmp(AV33Emp_dUb, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A10155Lb_NUbi, " ") != 0 ) )
      {
         GXCCtl = "LB_NUBI_" + sGXsfl_165_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe esta UBICACION¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_NUbi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors18T1374( )
   {
   }

   public void enableDisable18T1374( )
   {
   }

   public void getKey18T1374( )
   {
      /* Using cursor T018T16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1374 = (short)(1) ;
      }
      else
      {
         RcdFound1374 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey18T1374( )
   {
      /* Using cursor T018T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T018T3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018T3_A9611Lb_Hdr[0] == A9611Lb_Hdr ) && ( T018T3_A9612Lb_Hdrr[0] == A9612Lb_Hdrr ) && ( GXutil.strcmp(T018T3_A9613Lb_Hdrp[0], A9613Lb_Hdrp) == 0 ) )
      {
         zm18T1374( 8) ;
         RcdFound1374 = (short)(1) ;
         initializeNonKey18T1374( ) ;
         A10155Lb_NUbi = T018T3_A10155Lb_NUbi[0] ;
         A10156Lb_NPzs = T018T3_A10156Lb_NPzs[0] ;
         n10156Lb_NPzs = T018T3_n10156Lb_NPzs[0] ;
         O10156Lb_NPzs = A10156Lb_NPzs ;
         n10156Lb_NPzs = false ;
         Z396EmprCod = A396EmprCod ;
         Z9611Lb_Hdr = A9611Lb_Hdr ;
         Z9612Lb_Hdrr = A9612Lb_Hdrr ;
         Z9613Lb_Hdrp = A9613Lb_Hdrp ;
         Z10155Lb_NUbi = A10155Lb_NUbi ;
         sMode1374 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18T1374( ) ;
         load18T1374( ) ;
         Gx_mode = sMode1374 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1374 = (short)(0) ;
         initializeNonKey18T1374( ) ;
         sMode1374 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18T1374( ) ;
         Gx_mode = sMode1374 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18T1374( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18T1374( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018T2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRIN1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z10156Lb_NPzs != T018T2_A10156Lb_NPzs[0] ) )
         {
            if ( Z10156Lb_NPzs != T018T2_A10156Lb_NPzs[0] )
            {
               GXutil.writeLogln("tubi002:[seudo value changed for attri]"+"Lb_NPzs");
               GXutil.writeLogRaw("Old: ",Z10156Lb_NPzs);
               GXutil.writeLogRaw("Current: ",T018T2_A10156Lb_NPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRIN1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18T1374( )
   {
      beforeValidate18T1374( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18T1374( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18T1374( 0) ;
         checkOptimisticConcurrency18T1374( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18T1374( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18T1374( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018T17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi, Boolean.valueOf(n10156Lb_NPzs), Integer.valueOf(A10156Lb_NPzs)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRIN1");
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        AV34Tot_pz = (int)(AV34Tot_pz+A10156Lb_NPzs) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                     }
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
            load18T1374( ) ;
         }
         endLevel18T1374( ) ;
      }
      closeExtendedTableCursors18T1374( ) ;
   }

   public void update18T1374( )
   {
      beforeValidate18T1374( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18T1374( ) ;
      }
      if ( ( nIsMod_1374 != 0 ) || ( nIsDirty_1374 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18T1374( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18T1374( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18T1374( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018T18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n10156Lb_NPzs), Integer.valueOf(A10156Lb_NPzs), A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRIN1");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRIN1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18T1374( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ )
                        {
                           AV34Tot_pz = (int)(AV34Tot_pz+(A10156Lb_NPzs-O10156Lb_NPzs)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18T1374( ) ;
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
            endLevel18T1374( ) ;
         }
      }
      closeExtendedTableCursors18T1374( ) ;
   }

   public void deferredUpdate18T1374( )
   {
   }

   public void delete18T1374( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18T1374( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18T1374( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18T1374( ) ;
         afterConfirm18T1374( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18T1374( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018T19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, A10155Lb_NUbi});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRIN1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     AV34Tot_pz = (int)(AV34Tot_pz-A10156Lb_NPzs) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV34Tot_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Tot_pz), 6, 0));
                  }
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
      sMode1374 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18T1374( ) ;
      Gx_mode = sMode1374 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18T1374( )
   {
      standaloneModal18T1374( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel18T1374( )
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

   public void scanStart18T1374( )
   {
      /* Scan By routine */
      /* Using cursor T018T20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      RcdFound1374 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1374 = (short)(1) ;
         A10155Lb_NUbi = T018T20_A10155Lb_NUbi[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18T1374( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1374 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1374 = (short)(1) ;
         A10155Lb_NUbi = T018T20_A10155Lb_NUbi[0] ;
      }
   }

   public void scanEnd18T1374( )
   {
      pr_default.close(18);
   }

   public void afterConfirm18T1374( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18T1374( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18T1374( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18T1374( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18T1374( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18T1374( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18T1374( )
   {
      edtLb_NUbi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NUbi_Enabled), 5, 0), !bGXsfl_165_Refreshing);
      edtLb_NPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NPzs_Enabled), 5, 0), !bGXsfl_165_Refreshing);
   }

   public void send_integrity_lvl_hashes18T1374( )
   {
   }

   public void send_integrity_lvl_hashes18T1373( )
   {
   }

   public void subsflControlProps_1651374( )
   {
      edtavnRcdDeleted_1374_Internalname = "vNRCDDELETED_1374_"+sGXsfl_165_idx ;
      edtLb_NUbi_Internalname = "LB_NUBI_"+sGXsfl_165_idx ;
      edtLb_NPzs_Internalname = "LB_NPZS_"+sGXsfl_165_idx ;
   }

   public void subsflControlProps_fel_1651374( )
   {
      edtavnRcdDeleted_1374_Internalname = "vNRCDDELETED_1374_"+sGXsfl_165_fel_idx ;
      edtLb_NUbi_Internalname = "LB_NUBI_"+sGXsfl_165_fel_idx ;
      edtLb_NPzs_Internalname = "LB_NPZS_"+sGXsfl_165_fel_idx ;
   }

   public void addRow18T1374( )
   {
      nGXsfl_165_idx = (int)(nGXsfl_165_idx+1) ;
      sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1651374( ) ;
      sendRow18T1374( ) ;
   }

   public void sendRow18T1374( )
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
         if ( ((int)((nGXsfl_165_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1374_" + sGXsfl_165_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_165_idx + "',165)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1374_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1374_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1374), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1374), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1374_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1374_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(165),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1374_" + sGXsfl_165_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 167,'',false,'" + sGXsfl_165_idx + "',165)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_NUbi_Internalname,GXutil.rtrim( A10155Lb_NUbi),GXutil.rtrim( localUtil.format( A10155Lb_NUbi, "!!!/!!!!!!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,167);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_NUbi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_NUbi_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(165),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1374_" + sGXsfl_165_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_165_idx + "',165)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_NPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_NPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10156Lb_NPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10156Lb_NPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_NPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_NPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(165),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18T1374( ) ;
      GXCCtl = "Z10155Lb_NUbi_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10155Lb_NUbi));
      GXCCtl = "Z10156Lb_NPzs_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O10156Lb_NPzs_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O10156Lb_NPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1374_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1374_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1374_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1374, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARPIE_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTOTP_" + sGXsfl_165_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV35Totp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1374_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1374_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_NUBI_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NUbi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_NPZS_"+sGXsfl_165_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18T1374( )
   {
      nGXsfl_165_idx = (int)(nGXsfl_165_idx+1) ;
      sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1651374( ) ;
      edtavnRcdDeleted_1374_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1374_"+sGXsfl_165_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_NUbi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_NUBI_"+sGXsfl_165_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_NPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_NPZS_"+sGXsfl_165_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1374_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1374_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1374");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1374_Internalname ;
         wbErr = true ;
         nRcdDeleted_1374 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1374 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1374_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10155Lb_NUbi = httpContext.cgiGet( edtLb_NUbi_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "LB_NPZS_" + sGXsfl_165_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_NPzs_Internalname ;
         wbErr = true ;
         A10156Lb_NPzs = 0 ;
         n10156Lb_NPzs = false ;
      }
      else
      {
         A10156Lb_NPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10156Lb_NPzs = false ;
      }
      GXCCtl = "Z10155Lb_NUbi_" + sGXsfl_165_idx ;
      Z10155Lb_NUbi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10156Lb_NPzs_" + sGXsfl_165_idx ;
      Z10156Lb_NPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O10156Lb_NPzs_" + sGXsfl_165_idx ;
      O10156Lb_NPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1374_" + sGXsfl_165_idx ;
      nRcdDeleted_1374 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1374_" + sGXsfl_165_idx ;
      nRcdExists_1374 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1374_" + sGXsfl_165_idx ;
      nIsMod_1374 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_NUbi_Enabled = edtLb_NUbi_Enabled ;
   }

   public void confirmValues18T0( )
   {
      nGXsfl_165_idx = 0 ;
      sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1651374( ) ;
      while ( nGXsfl_165_idx < nRC_GXsfl_165 )
      {
         nGXsfl_165_idx = (int)(nGXsfl_165_idx+1) ;
         sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1651374( ) ;
         httpContext.changePostValue( "Z10155Lb_NUbi_"+sGXsfl_165_idx, httpContext.cgiGet( "ZT_"+"Z10155Lb_NUbi_"+sGXsfl_165_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10155Lb_NUbi_"+sGXsfl_165_idx) ;
         httpContext.changePostValue( "Z10156Lb_NPzs_"+sGXsfl_165_idx, httpContext.cgiGet( "ZT_"+"Z10156Lb_NPzs_"+sGXsfl_165_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10156Lb_NPzs_"+sGXsfl_165_idx) ;
      }
      httpContext.changePostValue( "O10156Lb_NPzs", httpContext.cgiGet( "T10156Lb_NPzs")) ;
      httpContext.deletePostValue( "T10156Lb_NPzs") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tubi002", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9611Lb_Hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A9612Lb_Hdrr,1,0)),GXutil.URLEncode(GXutil.rtrim(A9613Lb_Hdrp)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarPie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Totp,6,0))}, new String[] {"EmprCod","Lb_Hdr","Lb_Hdrr","Lb_Hdrp","BarPie","Totp"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9611Lb_Hdr", GXutil.ltrim( localUtil.ntoc( Z9611Lb_Hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9612Lb_Hdrr", GXutil.ltrim( localUtil.ntoc( Z9612Lb_Hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9613Lb_Hdrp", GXutil.rtrim( Z9613Lb_Hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9614Lb_UsuIn", GXutil.rtrim( Z9614Lb_UsuIn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9615Lb_FecIn", localUtil.dtoc( Z9615Lb_FecIn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9616Lb_UsuOut", GXutil.rtrim( Z9616Lb_UsuOut));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9617Lb_FecOut", localUtil.dtoc( Z9617Lb_FecOut, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9618Lb_inout", GXutil.ltrim( localUtil.ntoc( Z9618Lb_inout, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9623Lb_FecTin", localUtil.dtoc( Z9623Lb_FecTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9624Lb_UsuTin", GXutil.rtrim( Z9624Lb_UsuTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9625Lb_obsin", Z9625Lb_obsin);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9702Lb_FecPAc", localUtil.dtoc( Z9702Lb_FecPAc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9703Lb_FecAcF", localUtil.dtoc( Z9703Lb_FecAcF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9709Lb_obsout", Z9709Lb_obsout);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9721Lb_obsprb", Z9721Lb_obsprb);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9857Ex_Obs", Z9857Ex_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10105Sedo1", GXutil.ltrim( localUtil.ntoc( Z10105Sedo1, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10106Sedo2", GXutil.ltrim( localUtil.ntoc( Z10106Sedo2, (byte)(4), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10107Sedo3", GXutil.ltrim( localUtil.ntoc( Z10107Sedo3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10108Sedo4", GXutil.ltrim( localUtil.ntoc( Z10108Sedo4, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10109Sedo5", GXutil.ltrim( localUtil.ntoc( Z10109Sedo5, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10110Sedo6", GXutil.ltrim( localUtil.ntoc( Z10110Sedo6, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10152Lb_HhIn", localUtil.ttoc( Z10152Lb_HhIn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10138Lb_HhOut", localUtil.ttoc( Z10138Lb_HhOut, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10153Lb_HhTin", localUtil.ttoc( Z10153Lb_HhTin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10148Lb_UbPzs", GXutil.ltrim( localUtil.ntoc( Z10148Lb_UbPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10135Lb_UbUb", GXutil.rtrim( Z10135Lb_UbUb));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_165", GXutil.ltrim( localUtil.ntoc( nGXsfl_165_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIE", GXutil.ltrim( localUtil.ntoc( AV32BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTP", GXutil.ltrim( localUtil.ntoc( AV35Totp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_PZ", GXutil.ltrim( localUtil.ntoc( AV34Tot_pz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMP_DUB", GXutil.rtrim( AV33Emp_dUb));
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
      return formatLink("app.tubi002", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9611Lb_Hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A9612Lb_Hdrr,1,0)),GXutil.URLEncode(GXutil.rtrim(A9613Lb_Hdrp)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarPie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Totp,6,0))}, new String[] {"EmprCod","Lb_Hdr","Lb_Hdrr","Lb_Hdrp","BarPie","Totp"})  ;
   }

   public String getPgmname( )
   {
      return "TUBI002" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "UBICACION HDR FINALIZADA", "") ;
   }

   public void initializeNonKey18T1373( )
   {
      A9614Lb_UsuIn = "" ;
      n9614Lb_UsuIn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9614Lb_UsuIn", A9614Lb_UsuIn);
      A9615Lb_FecIn = GXutil.nullDate() ;
      n9615Lb_FecIn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9615Lb_FecIn", localUtil.format(A9615Lb_FecIn, "99/99/99"));
      A9616Lb_UsuOut = "" ;
      n9616Lb_UsuOut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9616Lb_UsuOut", A9616Lb_UsuOut);
      A9617Lb_FecOut = GXutil.nullDate() ;
      n9617Lb_FecOut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9617Lb_FecOut", localUtil.format(A9617Lb_FecOut, "99/99/99"));
      A9618Lb_inout = (byte)(0) ;
      n9618Lb_inout = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9618Lb_inout", GXutil.str( A9618Lb_inout, 1, 0));
      A9623Lb_FecTin = GXutil.nullDate() ;
      n9623Lb_FecTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9623Lb_FecTin", localUtil.format(A9623Lb_FecTin, "99/99/99"));
      A9624Lb_UsuTin = "" ;
      n9624Lb_UsuTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9624Lb_UsuTin", A9624Lb_UsuTin);
      A9625Lb_obsin = "" ;
      n9625Lb_obsin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9625Lb_obsin", A9625Lb_obsin);
      A9702Lb_FecPAc = GXutil.nullDate() ;
      n9702Lb_FecPAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9702Lb_FecPAc", localUtil.format(A9702Lb_FecPAc, "99/99/99"));
      A9703Lb_FecAcF = GXutil.nullDate() ;
      n9703Lb_FecAcF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9703Lb_FecAcF", localUtil.format(A9703Lb_FecAcF, "99/99/99"));
      A9709Lb_obsout = "" ;
      n9709Lb_obsout = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9709Lb_obsout", A9709Lb_obsout);
      A9721Lb_obsprb = "" ;
      n9721Lb_obsprb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9721Lb_obsprb", A9721Lb_obsprb);
      A9857Ex_Obs = "" ;
      n9857Ex_Obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9857Ex_Obs", A9857Ex_Obs);
      A10105Sedo1 = DecimalUtil.ZERO ;
      n10105Sedo1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10105Sedo1", GXutil.ltrimstr( A10105Sedo1, 4, 1));
      A10106Sedo2 = DecimalUtil.ZERO ;
      n10106Sedo2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10106Sedo2", GXutil.ltrimstr( A10106Sedo2, 4, 1));
      A10107Sedo3 = (short)(0) ;
      n10107Sedo3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10107Sedo3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10107Sedo3), 3, 0));
      A10108Sedo4 = DecimalUtil.ZERO ;
      n10108Sedo4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10108Sedo4", GXutil.ltrimstr( A10108Sedo4, 4, 2));
      A10109Sedo5 = (byte)(0) ;
      n10109Sedo5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10109Sedo5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10109Sedo5), 2, 0));
      A10110Sedo6 = (byte)(0) ;
      n10110Sedo6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10110Sedo6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10110Sedo6), 2, 0));
      A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      n10152Lb_HhIn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10152Lb_HhIn", localUtil.ttoc( A10152Lb_HhIn, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      n10138Lb_HhOut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10138Lb_HhOut", localUtil.ttoc( A10138Lb_HhOut, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      n10153Lb_HhTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10153Lb_HhTin", localUtil.ttoc( A10153Lb_HhTin, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10148Lb_UbPzs = 0 ;
      n10148Lb_UbPzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10148Lb_UbPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10148Lb_UbPzs), 6, 0));
      A10135Lb_UbUb = "" ;
      n10135Lb_UbUb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10135Lb_UbUb", A10135Lb_UbUb);
      Z9614Lb_UsuIn = "" ;
      Z9615Lb_FecIn = GXutil.nullDate() ;
      Z9616Lb_UsuOut = "" ;
      Z9617Lb_FecOut = GXutil.nullDate() ;
      Z9618Lb_inout = (byte)(0) ;
      Z9623Lb_FecTin = GXutil.nullDate() ;
      Z9624Lb_UsuTin = "" ;
      Z9625Lb_obsin = "" ;
      Z9702Lb_FecPAc = GXutil.nullDate() ;
      Z9703Lb_FecAcF = GXutil.nullDate() ;
      Z9709Lb_obsout = "" ;
      Z9721Lb_obsprb = "" ;
      Z9857Ex_Obs = "" ;
      Z10105Sedo1 = DecimalUtil.ZERO ;
      Z10106Sedo2 = DecimalUtil.ZERO ;
      Z10107Sedo3 = (short)(0) ;
      Z10108Sedo4 = DecimalUtil.ZERO ;
      Z10109Sedo5 = (byte)(0) ;
      Z10110Sedo6 = (byte)(0) ;
      Z10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      Z10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      Z10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      Z10148Lb_UbPzs = 0 ;
      Z10135Lb_UbUb = "" ;
   }

   public void initAll18T1373( )
   {
      initializeNonKey18T1373( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18T1374( )
   {
      AV33Emp_dUb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Emp_dUb", AV33Emp_dUb);
      A10156Lb_NPzs = 0 ;
      n10156Lb_NPzs = false ;
      O10156Lb_NPzs = A10156Lb_NPzs ;
      n10156Lb_NPzs = false ;
      Z10156Lb_NPzs = 0 ;
   }

   public void initAll18T1374( )
   {
      A10155Lb_NUbi = "" ;
      initializeNonKey18T1374( ) ;
   }

   public void standaloneModalInsert18T1374( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555471", true, true);
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
      httpContext.AddJavascriptSource("tubi002.js", "?20268241555471", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1374( )
   {
      edtLb_NUbi_Enabled = defedtLb_NUbi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NUbi_Enabled), 5, 0), !bGXsfl_165_Refreshing);
   }

   public void startgridcontrol165( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1374, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1374_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10155Lb_NUbi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NUbi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10156Lb_NPzs, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_NPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtLb_Hdr_Internalname = "LB_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtLb_Hdrr_Internalname = "LB_HDRR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtLb_Hdrp_Internalname = "LB_HDRP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtLb_UsuIn_Internalname = "LB_USUIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtLb_FecIn_Internalname = "LB_FECIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtLb_UsuOut_Internalname = "LB_USUOUT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtLb_FecOut_Internalname = "LB_FECOUT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtLb_inout_Internalname = "LB_INOUT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtLb_FecTin_Internalname = "LB_FECTIN" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtLb_UsuTin_Internalname = "LB_USUTIN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtLb_obsin_Internalname = "LB_OBSIN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtLb_FecPAc_Internalname = "LB_FECPAC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtLb_FecAcF_Internalname = "LB_FECACF" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtLb_obsout_Internalname = "LB_OBSOUT" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtLb_obsprb_Internalname = "LB_OBSPRB" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtEx_Obs_Internalname = "EX_OBS" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtSedo1_Internalname = "SEDO1" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtSedo2_Internalname = "SEDO2" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtSedo3_Internalname = "SEDO3" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtSedo4_Internalname = "SEDO4" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtSedo5_Internalname = "SEDO5" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtSedo6_Internalname = "SEDO6" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtLb_HhIn_Internalname = "LB_HHIN" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtLb_HhOut_Internalname = "LB_HHOUT" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtLb_HhTin_Internalname = "LB_HHTIN" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtLb_UbPzs_Internalname = "LB_UBPZS" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtLb_UbUb_Internalname = "LB_UBUB" ;
      edtavnRcdDeleted_1374_Internalname = "vNRCDDELETED_1374" ;
      edtLb_NUbi_Internalname = "LB_NUBI" ;
      edtLb_NPzs_Internalname = "LB_NPZS" ;
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
      Form.setCaption( httpContext.getMessage( "UBICACION HDR FINALIZADA", "") );
      edtLb_NPzs_Jsonclick = "" ;
      edtLb_NUbi_Jsonclick = "" ;
      edtavnRcdDeleted_1374_Jsonclick = "" ;
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
      edtLb_NPzs_Enabled = 1 ;
      edtLb_NUbi_Enabled = 1 ;
      edtavnRcdDeleted_1374_Enabled = 1 ;
      edtLb_UbUb_Jsonclick = "" ;
      edtLb_UbUb_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UbUb_Enabled = 1 ;
      edtLb_UbPzs_Jsonclick = "" ;
      edtLb_UbPzs_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UbPzs_Enabled = 1 ;
      edtLb_HhTin_Jsonclick = "" ;
      edtLb_HhTin_Backcolor = (int)(0xFFFFFF) ;
      edtLb_HhTin_Enabled = 1 ;
      edtLb_HhOut_Jsonclick = "" ;
      edtLb_HhOut_Backcolor = (int)(0xFFFFFF) ;
      edtLb_HhOut_Enabled = 1 ;
      edtLb_HhIn_Jsonclick = "" ;
      edtLb_HhIn_Backcolor = (int)(0xFFFFFF) ;
      edtLb_HhIn_Enabled = 1 ;
      edtSedo6_Jsonclick = "" ;
      edtSedo6_Backcolor = (int)(0xFFFFFF) ;
      edtSedo6_Enabled = 1 ;
      edtSedo5_Jsonclick = "" ;
      edtSedo5_Backcolor = (int)(0xFFFFFF) ;
      edtSedo5_Enabled = 1 ;
      edtSedo4_Jsonclick = "" ;
      edtSedo4_Backcolor = (int)(0xFFFFFF) ;
      edtSedo4_Enabled = 1 ;
      edtSedo3_Jsonclick = "" ;
      edtSedo3_Backcolor = (int)(0xFFFFFF) ;
      edtSedo3_Enabled = 1 ;
      edtSedo2_Jsonclick = "" ;
      edtSedo2_Backcolor = (int)(0xFFFFFF) ;
      edtSedo2_Enabled = 1 ;
      edtSedo1_Jsonclick = "" ;
      edtSedo1_Backcolor = (int)(0xFFFFFF) ;
      edtSedo1_Enabled = 1 ;
      edtEx_Obs_Backcolor = (int)(0xFFFFFF) ;
      edtEx_Obs_Enabled = 1 ;
      edtLb_obsprb_Backcolor = (int)(0xFFFFFF) ;
      edtLb_obsprb_Enabled = 1 ;
      edtLb_obsout_Backcolor = (int)(0xFFFFFF) ;
      edtLb_obsout_Enabled = 1 ;
      edtLb_FecAcF_Jsonclick = "" ;
      edtLb_FecAcF_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecAcF_Enabled = 1 ;
      edtLb_FecPAc_Jsonclick = "" ;
      edtLb_FecPAc_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecPAc_Enabled = 1 ;
      edtLb_obsin_Backcolor = (int)(0xFFFFFF) ;
      edtLb_obsin_Enabled = 1 ;
      edtLb_UsuTin_Jsonclick = "" ;
      edtLb_UsuTin_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UsuTin_Enabled = 1 ;
      edtLb_FecTin_Jsonclick = "" ;
      edtLb_FecTin_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecTin_Enabled = 1 ;
      edtLb_inout_Jsonclick = "" ;
      edtLb_inout_Backcolor = (int)(0xFFFFFF) ;
      edtLb_inout_Enabled = 1 ;
      edtLb_FecOut_Jsonclick = "" ;
      edtLb_FecOut_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecOut_Enabled = 1 ;
      edtLb_UsuOut_Jsonclick = "" ;
      edtLb_UsuOut_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UsuOut_Enabled = 1 ;
      edtLb_FecIn_Jsonclick = "" ;
      edtLb_FecIn_Backcolor = (int)(0xFFFFFF) ;
      edtLb_FecIn_Enabled = 1 ;
      edtLb_UsuIn_Jsonclick = "" ;
      edtLb_UsuIn_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UsuIn_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLb_Hdrp_Jsonclick = "" ;
      edtLb_Hdrp_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Hdrp_Enabled = 0 ;
      edtLb_Hdrr_Jsonclick = "" ;
      edtLb_Hdrr_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Hdrr_Enabled = 0 ;
      edtLb_Hdr_Jsonclick = "" ;
      edtLb_Hdr_Backcolor = (int)(0xFFFFFF) ;
      edtLb_Hdr_Enabled = 0 ;
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

   public void xc_4_18T1374( String A396EmprCod ,
                             String A10155Lb_NUbi ,
                             String AV33Emp_dUb )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A10155Lb_NUbi ;
         GXv_char2[0] = AV33Emp_dUb ;
         new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A10155Lb_NUbi = GXv_char3[0] ;
         AV33Emp_dUb = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Emp_dUb", AV33Emp_dUb);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10155Lb_NUbi))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33Emp_dUb))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1651374( ) ;
      while ( nGXsfl_165_idx <= nRC_GXsfl_165 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18T1374( ) ;
         standaloneModal18T1374( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18T1374( ) ;
         nGXsfl_165_idx = (int)(nGXsfl_165_idx+1) ;
         sGXsfl_165_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_165_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1651374( ) ;
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
      /* Using cursor T018T21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018T21_A407EmprNom[0] ;
      n407EmprNom = T018T21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      GX_FocusControl = edtLb_UsuIn_Internalname ;
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

   public void valid_Lb_hdrp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9614Lb_UsuIn", GXutil.rtrim( A9614Lb_UsuIn));
      httpContext.ajax_rsp_assign_attri("", false, "A9615Lb_FecIn", localUtil.format(A9615Lb_FecIn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9616Lb_UsuOut", GXutil.rtrim( A9616Lb_UsuOut));
      httpContext.ajax_rsp_assign_attri("", false, "A9617Lb_FecOut", localUtil.format(A9617Lb_FecOut, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9618Lb_inout", GXutil.ltrim( localUtil.ntoc( A9618Lb_inout, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9623Lb_FecTin", localUtil.format(A9623Lb_FecTin, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9624Lb_UsuTin", GXutil.rtrim( A9624Lb_UsuTin));
      httpContext.ajax_rsp_assign_attri("", false, "A9625Lb_obsin", A9625Lb_obsin);
      httpContext.ajax_rsp_assign_attri("", false, "A9702Lb_FecPAc", localUtil.format(A9702Lb_FecPAc, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9703Lb_FecAcF", localUtil.format(A9703Lb_FecAcF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9709Lb_obsout", A9709Lb_obsout);
      httpContext.ajax_rsp_assign_attri("", false, "A9721Lb_obsprb", A9721Lb_obsprb);
      httpContext.ajax_rsp_assign_attri("", false, "A9857Ex_Obs", A9857Ex_Obs);
      httpContext.ajax_rsp_assign_attri("", false, "A10105Sedo1", GXutil.ltrim( localUtil.ntoc( A10105Sedo1, (byte)(4), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10106Sedo2", GXutil.ltrim( localUtil.ntoc( A10106Sedo2, (byte)(4), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10107Sedo3", GXutil.ltrim( localUtil.ntoc( A10107Sedo3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10108Sedo4", GXutil.ltrim( localUtil.ntoc( A10108Sedo4, (byte)(4), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10109Sedo5", GXutil.ltrim( localUtil.ntoc( A10109Sedo5, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10110Sedo6", GXutil.ltrim( localUtil.ntoc( A10110Sedo6, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10152Lb_HhIn", localUtil.ttoc( A10152Lb_HhIn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10138Lb_HhOut", localUtil.ttoc( A10138Lb_HhOut, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10153Lb_HhTin", localUtil.ttoc( A10153Lb_HhTin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10148Lb_UbPzs", GXutil.ltrim( localUtil.ntoc( A10148Lb_UbPzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10135Lb_UbUb", GXutil.rtrim( A10135Lb_UbUb));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9611Lb_Hdr", GXutil.ltrim( localUtil.ntoc( Z9611Lb_Hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9612Lb_Hdrr", GXutil.ltrim( localUtil.ntoc( Z9612Lb_Hdrr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9613Lb_Hdrp", GXutil.rtrim( Z9613Lb_Hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9614Lb_UsuIn", GXutil.rtrim( Z9614Lb_UsuIn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9615Lb_FecIn", localUtil.format(Z9615Lb_FecIn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9616Lb_UsuOut", GXutil.rtrim( Z9616Lb_UsuOut));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9617Lb_FecOut", localUtil.format(Z9617Lb_FecOut, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9618Lb_inout", GXutil.ltrim( localUtil.ntoc( Z9618Lb_inout, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9623Lb_FecTin", localUtil.format(Z9623Lb_FecTin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9624Lb_UsuTin", GXutil.rtrim( Z9624Lb_UsuTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9625Lb_obsin", Z9625Lb_obsin);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9702Lb_FecPAc", localUtil.format(Z9702Lb_FecPAc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9703Lb_FecAcF", localUtil.format(Z9703Lb_FecAcF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9709Lb_obsout", Z9709Lb_obsout);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9721Lb_obsprb", Z9721Lb_obsprb);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9857Ex_Obs", Z9857Ex_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10105Sedo1", GXutil.ltrim( localUtil.ntoc( Z10105Sedo1, (byte)(4), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10106Sedo2", GXutil.ltrim( localUtil.ntoc( Z10106Sedo2, (byte)(4), (byte)(1), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10107Sedo3", GXutil.ltrim( localUtil.ntoc( Z10107Sedo3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10108Sedo4", GXutil.ltrim( localUtil.ntoc( Z10108Sedo4, (byte)(4), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10109Sedo5", GXutil.ltrim( localUtil.ntoc( Z10109Sedo5, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10110Sedo6", GXutil.ltrim( localUtil.ntoc( Z10110Sedo6, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10152Lb_HhIn", localUtil.ttoc( Z10152Lb_HhIn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10138Lb_HhOut", localUtil.ttoc( Z10138Lb_HhOut, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10153Lb_HhTin", localUtil.ttoc( Z10153Lb_HhTin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10148Lb_UbPzs", GXutil.ltrim( localUtil.ntoc( Z10148Lb_UbPzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10135Lb_UbUb", GXutil.rtrim( Z10135Lb_UbUb));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Lb_nubi( )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A10155Lb_NUbi ;
         GXv_char2[0] = AV33Emp_dUb ;
         new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tubi002_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tubi002_impl.this.A10155Lb_NUbi = GXv_char3[0] ;
         A10155Lb_NUbi = this.A10155Lb_NUbi ;
         tubi002_impl.this.AV33Emp_dUb = GXv_char2[0] ;
         AV33Emp_dUb = this.AV33Emp_dUb ;
      }
      if ( ( GXutil.strcmp(AV33Emp_dUb, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A10155Lb_NUbi, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe esta UBICACION¡¡¡", ""), 1, "LB_NUBI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_NUbi_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A10155Lb_NUbi", GXutil.rtrim( A10155Lb_NUbi));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Emp_dUb", GXutil.rtrim( AV33Emp_dUb));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9611Lb_Hdr',fld:'LB_HDR',pic:'ZZZZZZZ9'},{av:'A9612Lb_Hdrr',fld:'LB_HDRR',pic:'9'},{av:'A9613Lb_Hdrp',fld:'LB_HDRP',pic:''},{av:'AV32BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV35Totp',fld:'vTOTP',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LB_HDR","{handler:'valid_Lb_hdr',iparms:[]");
      setEventMetadata("VALID_LB_HDR",",oparms:[]}");
      setEventMetadata("VALID_LB_HDRR","{handler:'valid_Lb_hdrr',iparms:[]");
      setEventMetadata("VALID_LB_HDRR",",oparms:[]}");
      setEventMetadata("VALID_LB_HDRP","{handler:'valid_Lb_hdrp',iparms:[{av:'AV34Tot_pz',fld:'vTOT_PZ',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9611Lb_Hdr',fld:'LB_HDR',pic:'ZZZZZZZ9'},{av:'A9612Lb_Hdrr',fld:'LB_HDRR',pic:'9'},{av:'A9613Lb_Hdrp',fld:'LB_HDRP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LB_HDRP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9614Lb_UsuIn',fld:'LB_USUIN',pic:''},{av:'A9615Lb_FecIn',fld:'LB_FECIN',pic:''},{av:'A9616Lb_UsuOut',fld:'LB_USUOUT',pic:''},{av:'A9617Lb_FecOut',fld:'LB_FECOUT',pic:''},{av:'A9618Lb_inout',fld:'LB_INOUT',pic:'9'},{av:'A9623Lb_FecTin',fld:'LB_FECTIN',pic:''},{av:'A9624Lb_UsuTin',fld:'LB_USUTIN',pic:'@!'},{av:'A9625Lb_obsin',fld:'LB_OBSIN',pic:''},{av:'A9702Lb_FecPAc',fld:'LB_FECPAC',pic:''},{av:'A9703Lb_FecAcF',fld:'LB_FECACF',pic:''},{av:'A9709Lb_obsout',fld:'LB_OBSOUT',pic:''},{av:'A9721Lb_obsprb',fld:'LB_OBSPRB',pic:''},{av:'A9857Ex_Obs',fld:'EX_OBS',pic:''},{av:'A10105Sedo1',fld:'SEDO1',pic:'Z9.9'},{av:'A10106Sedo2',fld:'SEDO2',pic:'Z9.9'},{av:'A10107Sedo3',fld:'SEDO3',pic:'ZZ9'},{av:'A10108Sedo4',fld:'SEDO4',pic:'9.99'},{av:'A10109Sedo5',fld:'SEDO5',pic:'Z9'},{av:'A10110Sedo6',fld:'SEDO6',pic:'Z9'},{av:'A10152Lb_HhIn',fld:'LB_HHIN',pic:'99:99:99'},{av:'A10138Lb_HhOut',fld:'LB_HHOUT',pic:'99:99:99'},{av:'A10153Lb_HhTin',fld:'LB_HHTIN',pic:'99:99:99'},{av:'A10148Lb_UbPzs',fld:'LB_UBPZS',pic:'ZZZZZ9'},{av:'A10135Lb_UbUb',fld:'LB_UBUB',pic:'!!!/!!!!!!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9611Lb_Hdr'},{av:'Z9612Lb_Hdrr'},{av:'Z9613Lb_Hdrp'},{av:'Z407EmprNom'},{av:'Z9614Lb_UsuIn'},{av:'Z9615Lb_FecIn'},{av:'Z9616Lb_UsuOut'},{av:'Z9617Lb_FecOut'},{av:'Z9618Lb_inout'},{av:'Z9623Lb_FecTin'},{av:'Z9624Lb_UsuTin'},{av:'Z9625Lb_obsin'},{av:'Z9702Lb_FecPAc'},{av:'Z9703Lb_FecAcF'},{av:'Z9709Lb_obsout'},{av:'Z9721Lb_obsprb'},{av:'Z9857Ex_Obs'},{av:'Z10105Sedo1'},{av:'Z10106Sedo2'},{av:'Z10107Sedo3'},{av:'Z10108Sedo4'},{av:'Z10109Sedo5'},{av:'Z10110Sedo6'},{av:'Z10152Lb_HhIn'},{av:'Z10138Lb_HhOut'},{av:'Z10153Lb_HhTin'},{av:'Z10148Lb_UbPzs'},{av:'Z10135Lb_UbUb'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LB_NUBI","{handler:'valid_Lb_nubi',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10155Lb_NUbi',fld:'LB_NUBI',pic:'!!!/!!!!!!'},{av:'AV33Emp_dUb',fld:'vEMP_DUB',pic:''}]");
      setEventMetadata("VALID_LB_NUBI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10155Lb_NUbi',fld:'LB_NUBI',pic:'!!!/!!!!!!'},{av:'AV33Emp_dUb',fld:'vEMP_DUB',pic:''}]}");
      setEventMetadata("VALID_LB_NPZS","{handler:'valid_Lb_npzs',iparms:[]");
      setEventMetadata("VALID_LB_NPZS",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOA9613Lb_Hdrp = "" ;
      Z396EmprCod = "" ;
      Z9613Lb_Hdrp = "" ;
      Z9614Lb_UsuIn = "" ;
      Z9615Lb_FecIn = GXutil.nullDate() ;
      Z9616Lb_UsuOut = "" ;
      Z9617Lb_FecOut = GXutil.nullDate() ;
      Z9623Lb_FecTin = GXutil.nullDate() ;
      Z9624Lb_UsuTin = "" ;
      Z9625Lb_obsin = "" ;
      Z9702Lb_FecPAc = GXutil.nullDate() ;
      Z9703Lb_FecAcF = GXutil.nullDate() ;
      Z9709Lb_obsout = "" ;
      Z9721Lb_obsprb = "" ;
      Z9857Ex_Obs = "" ;
      Z10105Sedo1 = DecimalUtil.ZERO ;
      Z10106Sedo2 = DecimalUtil.ZERO ;
      Z10108Sedo4 = DecimalUtil.ZERO ;
      Z10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      Z10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      Z10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      Z10135Lb_UbUb = "" ;
      Z10155Lb_NUbi = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10155Lb_NUbi = "" ;
      AV33Emp_dUb = "" ;
      A9613Lb_Hdrp = "" ;
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
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9614Lb_UsuIn = "" ;
      lblTextblock7_Jsonclick = "" ;
      A9615Lb_FecIn = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A9616Lb_UsuOut = "" ;
      lblTextblock9_Jsonclick = "" ;
      A9617Lb_FecOut = GXutil.nullDate() ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A9623Lb_FecTin = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A9624Lb_UsuTin = "" ;
      lblTextblock13_Jsonclick = "" ;
      A9625Lb_obsin = "" ;
      lblTextblock14_Jsonclick = "" ;
      A9702Lb_FecPAc = GXutil.nullDate() ;
      lblTextblock15_Jsonclick = "" ;
      A9703Lb_FecAcF = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      A9709Lb_obsout = "" ;
      lblTextblock17_Jsonclick = "" ;
      A9721Lb_obsprb = "" ;
      lblTextblock18_Jsonclick = "" ;
      A9857Ex_Obs = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10105Sedo1 = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A10106Sedo2 = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10108Sedo4 = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock26_Jsonclick = "" ;
      A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock27_Jsonclick = "" ;
      A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A10135Lb_UbUb = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1374 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1373 = "" ;
      GXCCtl = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV15Lit3 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T018T6_A407EmprNom = new String[] {""} ;
      T018T6_n407EmprNom = new boolean[] {false} ;
      T018T7_A9611Lb_Hdr = new int[1] ;
      T018T7_A9612Lb_Hdrr = new byte[1] ;
      T018T7_A9613Lb_Hdrp = new String[] {""} ;
      T018T7_A407EmprNom = new String[] {""} ;
      T018T7_n407EmprNom = new boolean[] {false} ;
      T018T7_A9614Lb_UsuIn = new String[] {""} ;
      T018T7_n9614Lb_UsuIn = new boolean[] {false} ;
      T018T7_A9615Lb_FecIn = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n9615Lb_FecIn = new boolean[] {false} ;
      T018T7_A9616Lb_UsuOut = new String[] {""} ;
      T018T7_n9616Lb_UsuOut = new boolean[] {false} ;
      T018T7_A9617Lb_FecOut = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n9617Lb_FecOut = new boolean[] {false} ;
      T018T7_A9618Lb_inout = new byte[1] ;
      T018T7_n9618Lb_inout = new boolean[] {false} ;
      T018T7_A9623Lb_FecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n9623Lb_FecTin = new boolean[] {false} ;
      T018T7_A9624Lb_UsuTin = new String[] {""} ;
      T018T7_n9624Lb_UsuTin = new boolean[] {false} ;
      T018T7_A9625Lb_obsin = new String[] {""} ;
      T018T7_n9625Lb_obsin = new boolean[] {false} ;
      T018T7_A9702Lb_FecPAc = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n9702Lb_FecPAc = new boolean[] {false} ;
      T018T7_A9703Lb_FecAcF = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n9703Lb_FecAcF = new boolean[] {false} ;
      T018T7_A9709Lb_obsout = new String[] {""} ;
      T018T7_n9709Lb_obsout = new boolean[] {false} ;
      T018T7_A9721Lb_obsprb = new String[] {""} ;
      T018T7_n9721Lb_obsprb = new boolean[] {false} ;
      T018T7_A9857Ex_Obs = new String[] {""} ;
      T018T7_n9857Ex_Obs = new boolean[] {false} ;
      T018T7_A10105Sedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T7_n10105Sedo1 = new boolean[] {false} ;
      T018T7_A10106Sedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T7_n10106Sedo2 = new boolean[] {false} ;
      T018T7_A10107Sedo3 = new short[1] ;
      T018T7_n10107Sedo3 = new boolean[] {false} ;
      T018T7_A10108Sedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T7_n10108Sedo4 = new boolean[] {false} ;
      T018T7_A10109Sedo5 = new byte[1] ;
      T018T7_n10109Sedo5 = new boolean[] {false} ;
      T018T7_A10110Sedo6 = new byte[1] ;
      T018T7_n10110Sedo6 = new boolean[] {false} ;
      T018T7_A10152Lb_HhIn = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n10152Lb_HhIn = new boolean[] {false} ;
      T018T7_A10138Lb_HhOut = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n10138Lb_HhOut = new boolean[] {false} ;
      T018T7_A10153Lb_HhTin = new java.util.Date[] {GXutil.nullDate()} ;
      T018T7_n10153Lb_HhTin = new boolean[] {false} ;
      T018T7_A10148Lb_UbPzs = new int[1] ;
      T018T7_n10148Lb_UbPzs = new boolean[] {false} ;
      T018T7_A10135Lb_UbUb = new String[] {""} ;
      T018T7_n10135Lb_UbUb = new boolean[] {false} ;
      T018T7_A396EmprCod = new String[] {""} ;
      T018T8_A396EmprCod = new String[] {""} ;
      T018T8_A9611Lb_Hdr = new int[1] ;
      T018T8_A9612Lb_Hdrr = new byte[1] ;
      T018T8_A9613Lb_Hdrp = new String[] {""} ;
      T018T5_A9611Lb_Hdr = new int[1] ;
      T018T5_A9612Lb_Hdrr = new byte[1] ;
      T018T5_A9613Lb_Hdrp = new String[] {""} ;
      T018T5_A9614Lb_UsuIn = new String[] {""} ;
      T018T5_n9614Lb_UsuIn = new boolean[] {false} ;
      T018T5_A9615Lb_FecIn = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n9615Lb_FecIn = new boolean[] {false} ;
      T018T5_A9616Lb_UsuOut = new String[] {""} ;
      T018T5_n9616Lb_UsuOut = new boolean[] {false} ;
      T018T5_A9617Lb_FecOut = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n9617Lb_FecOut = new boolean[] {false} ;
      T018T5_A9618Lb_inout = new byte[1] ;
      T018T5_n9618Lb_inout = new boolean[] {false} ;
      T018T5_A9623Lb_FecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n9623Lb_FecTin = new boolean[] {false} ;
      T018T5_A9624Lb_UsuTin = new String[] {""} ;
      T018T5_n9624Lb_UsuTin = new boolean[] {false} ;
      T018T5_A9625Lb_obsin = new String[] {""} ;
      T018T5_n9625Lb_obsin = new boolean[] {false} ;
      T018T5_A9702Lb_FecPAc = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n9702Lb_FecPAc = new boolean[] {false} ;
      T018T5_A9703Lb_FecAcF = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n9703Lb_FecAcF = new boolean[] {false} ;
      T018T5_A9709Lb_obsout = new String[] {""} ;
      T018T5_n9709Lb_obsout = new boolean[] {false} ;
      T018T5_A9721Lb_obsprb = new String[] {""} ;
      T018T5_n9721Lb_obsprb = new boolean[] {false} ;
      T018T5_A9857Ex_Obs = new String[] {""} ;
      T018T5_n9857Ex_Obs = new boolean[] {false} ;
      T018T5_A10105Sedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T5_n10105Sedo1 = new boolean[] {false} ;
      T018T5_A10106Sedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T5_n10106Sedo2 = new boolean[] {false} ;
      T018T5_A10107Sedo3 = new short[1] ;
      T018T5_n10107Sedo3 = new boolean[] {false} ;
      T018T5_A10108Sedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T5_n10108Sedo4 = new boolean[] {false} ;
      T018T5_A10109Sedo5 = new byte[1] ;
      T018T5_n10109Sedo5 = new boolean[] {false} ;
      T018T5_A10110Sedo6 = new byte[1] ;
      T018T5_n10110Sedo6 = new boolean[] {false} ;
      T018T5_A10152Lb_HhIn = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n10152Lb_HhIn = new boolean[] {false} ;
      T018T5_A10138Lb_HhOut = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n10138Lb_HhOut = new boolean[] {false} ;
      T018T5_A10153Lb_HhTin = new java.util.Date[] {GXutil.nullDate()} ;
      T018T5_n10153Lb_HhTin = new boolean[] {false} ;
      T018T5_A10148Lb_UbPzs = new int[1] ;
      T018T5_n10148Lb_UbPzs = new boolean[] {false} ;
      T018T5_A10135Lb_UbUb = new String[] {""} ;
      T018T5_n10135Lb_UbUb = new boolean[] {false} ;
      T018T5_A396EmprCod = new String[] {""} ;
      T018T9_A396EmprCod = new String[] {""} ;
      T018T9_A9611Lb_Hdr = new int[1] ;
      T018T9_A9612Lb_Hdrr = new byte[1] ;
      T018T9_A9613Lb_Hdrp = new String[] {""} ;
      T018T10_A396EmprCod = new String[] {""} ;
      T018T10_A9611Lb_Hdr = new int[1] ;
      T018T10_A9612Lb_Hdrr = new byte[1] ;
      T018T10_A9613Lb_Hdrp = new String[] {""} ;
      T018T4_A9611Lb_Hdr = new int[1] ;
      T018T4_A9612Lb_Hdrr = new byte[1] ;
      T018T4_A9613Lb_Hdrp = new String[] {""} ;
      T018T4_A9614Lb_UsuIn = new String[] {""} ;
      T018T4_n9614Lb_UsuIn = new boolean[] {false} ;
      T018T4_A9615Lb_FecIn = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n9615Lb_FecIn = new boolean[] {false} ;
      T018T4_A9616Lb_UsuOut = new String[] {""} ;
      T018T4_n9616Lb_UsuOut = new boolean[] {false} ;
      T018T4_A9617Lb_FecOut = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n9617Lb_FecOut = new boolean[] {false} ;
      T018T4_A9618Lb_inout = new byte[1] ;
      T018T4_n9618Lb_inout = new boolean[] {false} ;
      T018T4_A9623Lb_FecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n9623Lb_FecTin = new boolean[] {false} ;
      T018T4_A9624Lb_UsuTin = new String[] {""} ;
      T018T4_n9624Lb_UsuTin = new boolean[] {false} ;
      T018T4_A9625Lb_obsin = new String[] {""} ;
      T018T4_n9625Lb_obsin = new boolean[] {false} ;
      T018T4_A9702Lb_FecPAc = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n9702Lb_FecPAc = new boolean[] {false} ;
      T018T4_A9703Lb_FecAcF = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n9703Lb_FecAcF = new boolean[] {false} ;
      T018T4_A9709Lb_obsout = new String[] {""} ;
      T018T4_n9709Lb_obsout = new boolean[] {false} ;
      T018T4_A9721Lb_obsprb = new String[] {""} ;
      T018T4_n9721Lb_obsprb = new boolean[] {false} ;
      T018T4_A9857Ex_Obs = new String[] {""} ;
      T018T4_n9857Ex_Obs = new boolean[] {false} ;
      T018T4_A10105Sedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T4_n10105Sedo1 = new boolean[] {false} ;
      T018T4_A10106Sedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T4_n10106Sedo2 = new boolean[] {false} ;
      T018T4_A10107Sedo3 = new short[1] ;
      T018T4_n10107Sedo3 = new boolean[] {false} ;
      T018T4_A10108Sedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018T4_n10108Sedo4 = new boolean[] {false} ;
      T018T4_A10109Sedo5 = new byte[1] ;
      T018T4_n10109Sedo5 = new boolean[] {false} ;
      T018T4_A10110Sedo6 = new byte[1] ;
      T018T4_n10110Sedo6 = new boolean[] {false} ;
      T018T4_A10152Lb_HhIn = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n10152Lb_HhIn = new boolean[] {false} ;
      T018T4_A10138Lb_HhOut = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n10138Lb_HhOut = new boolean[] {false} ;
      T018T4_A10153Lb_HhTin = new java.util.Date[] {GXutil.nullDate()} ;
      T018T4_n10153Lb_HhTin = new boolean[] {false} ;
      T018T4_A10148Lb_UbPzs = new int[1] ;
      T018T4_n10148Lb_UbPzs = new boolean[] {false} ;
      T018T4_A10135Lb_UbUb = new String[] {""} ;
      T018T4_n10135Lb_UbUb = new boolean[] {false} ;
      T018T4_A396EmprCod = new String[] {""} ;
      T018T14_A396EmprCod = new String[] {""} ;
      T018T14_A9611Lb_Hdr = new int[1] ;
      T018T14_A9612Lb_Hdrr = new byte[1] ;
      T018T14_A9613Lb_Hdrp = new String[] {""} ;
      T018T15_A396EmprCod = new String[] {""} ;
      T018T15_A9611Lb_Hdr = new int[1] ;
      T018T15_A9612Lb_Hdrr = new byte[1] ;
      T018T15_A9613Lb_Hdrp = new String[] {""} ;
      T018T15_A10155Lb_NUbi = new String[] {""} ;
      T018T15_A10156Lb_NPzs = new int[1] ;
      T018T15_n10156Lb_NPzs = new boolean[] {false} ;
      T018T16_A396EmprCod = new String[] {""} ;
      T018T16_A9611Lb_Hdr = new int[1] ;
      T018T16_A9612Lb_Hdrr = new byte[1] ;
      T018T16_A9613Lb_Hdrp = new String[] {""} ;
      T018T16_A10155Lb_NUbi = new String[] {""} ;
      T018T3_A396EmprCod = new String[] {""} ;
      T018T3_A9611Lb_Hdr = new int[1] ;
      T018T3_A9612Lb_Hdrr = new byte[1] ;
      T018T3_A9613Lb_Hdrp = new String[] {""} ;
      T018T3_A10155Lb_NUbi = new String[] {""} ;
      T018T3_A10156Lb_NPzs = new int[1] ;
      T018T3_n10156Lb_NPzs = new boolean[] {false} ;
      T018T2_A396EmprCod = new String[] {""} ;
      T018T2_A9611Lb_Hdr = new int[1] ;
      T018T2_A9612Lb_Hdrr = new byte[1] ;
      T018T2_A9613Lb_Hdrp = new String[] {""} ;
      T018T2_A10155Lb_NUbi = new String[] {""} ;
      T018T2_A10156Lb_NPzs = new int[1] ;
      T018T2_n10156Lb_NPzs = new boolean[] {false} ;
      T018T20_A396EmprCod = new String[] {""} ;
      T018T20_A9611Lb_Hdr = new int[1] ;
      T018T20_A9612Lb_Hdrr = new byte[1] ;
      T018T20_A9613Lb_Hdrp = new String[] {""} ;
      T018T20_A10155Lb_NUbi = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018T21_A407EmprNom = new String[] {""} ;
      T018T21_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9613Lb_Hdrp = "" ;
      ZZ407EmprNom = "" ;
      ZZ9614Lb_UsuIn = "" ;
      ZZ9615Lb_FecIn = GXutil.nullDate() ;
      ZZ9616Lb_UsuOut = "" ;
      ZZ9617Lb_FecOut = GXutil.nullDate() ;
      ZZ9623Lb_FecTin = GXutil.nullDate() ;
      ZZ9624Lb_UsuTin = "" ;
      ZZ9625Lb_obsin = "" ;
      ZZ9702Lb_FecPAc = GXutil.nullDate() ;
      ZZ9703Lb_FecAcF = GXutil.nullDate() ;
      ZZ9709Lb_obsout = "" ;
      ZZ9721Lb_obsprb = "" ;
      ZZ9857Ex_Obs = "" ;
      ZZ10105Sedo1 = DecimalUtil.ZERO ;
      ZZ10106Sedo2 = DecimalUtil.ZERO ;
      ZZ10108Sedo4 = DecimalUtil.ZERO ;
      ZZ10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      ZZ10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      ZZ10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      ZZ10135Lb_UbUb = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV33Emp_dUb = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tubi002__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tubi002__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tubi002__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tubi002__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tubi002__default(),
         new Object[] {
             new Object[] {
            T018T2_A396EmprCod, T018T2_A9611Lb_Hdr, T018T2_A9612Lb_Hdrr, T018T2_A9613Lb_Hdrp, T018T2_A10155Lb_NUbi, T018T2_A10156Lb_NPzs, T018T2_n10156Lb_NPzs
            }
            , new Object[] {
            T018T3_A396EmprCod, T018T3_A9611Lb_Hdr, T018T3_A9612Lb_Hdrr, T018T3_A9613Lb_Hdrp, T018T3_A10155Lb_NUbi, T018T3_A10156Lb_NPzs, T018T3_n10156Lb_NPzs
            }
            , new Object[] {
            T018T4_A9611Lb_Hdr, T018T4_A9612Lb_Hdrr, T018T4_A9613Lb_Hdrp, T018T4_A9614Lb_UsuIn, T018T4_n9614Lb_UsuIn, T018T4_A9615Lb_FecIn, T018T4_n9615Lb_FecIn, T018T4_A9616Lb_UsuOut, T018T4_n9616Lb_UsuOut, T018T4_A9617Lb_FecOut,
            T018T4_n9617Lb_FecOut, T018T4_A9618Lb_inout, T018T4_n9618Lb_inout, T018T4_A9623Lb_FecTin, T018T4_n9623Lb_FecTin, T018T4_A9624Lb_UsuTin, T018T4_n9624Lb_UsuTin, T018T4_A9625Lb_obsin, T018T4_n9625Lb_obsin, T018T4_A9702Lb_FecPAc,
            T018T4_n9702Lb_FecPAc, T018T4_A9703Lb_FecAcF, T018T4_n9703Lb_FecAcF, T018T4_A9709Lb_obsout, T018T4_n9709Lb_obsout, T018T4_A9721Lb_obsprb, T018T4_n9721Lb_obsprb, T018T4_A9857Ex_Obs, T018T4_n9857Ex_Obs, T018T4_A10105Sedo1,
            T018T4_n10105Sedo1, T018T4_A10106Sedo2, T018T4_n10106Sedo2, T018T4_A10107Sedo3, T018T4_n10107Sedo3, T018T4_A10108Sedo4, T018T4_n10108Sedo4, T018T4_A10109Sedo5, T018T4_n10109Sedo5, T018T4_A10110Sedo6,
            T018T4_n10110Sedo6, T018T4_A10152Lb_HhIn, T018T4_n10152Lb_HhIn, T018T4_A10138Lb_HhOut, T018T4_n10138Lb_HhOut, T018T4_A10153Lb_HhTin, T018T4_n10153Lb_HhTin, T018T4_A10148Lb_UbPzs, T018T4_n10148Lb_UbPzs, T018T4_A10135Lb_UbUb,
            T018T4_n10135Lb_UbUb, T018T4_A396EmprCod
            }
            , new Object[] {
            T018T5_A9611Lb_Hdr, T018T5_A9612Lb_Hdrr, T018T5_A9613Lb_Hdrp, T018T5_A9614Lb_UsuIn, T018T5_n9614Lb_UsuIn, T018T5_A9615Lb_FecIn, T018T5_n9615Lb_FecIn, T018T5_A9616Lb_UsuOut, T018T5_n9616Lb_UsuOut, T018T5_A9617Lb_FecOut,
            T018T5_n9617Lb_FecOut, T018T5_A9618Lb_inout, T018T5_n9618Lb_inout, T018T5_A9623Lb_FecTin, T018T5_n9623Lb_FecTin, T018T5_A9624Lb_UsuTin, T018T5_n9624Lb_UsuTin, T018T5_A9625Lb_obsin, T018T5_n9625Lb_obsin, T018T5_A9702Lb_FecPAc,
            T018T5_n9702Lb_FecPAc, T018T5_A9703Lb_FecAcF, T018T5_n9703Lb_FecAcF, T018T5_A9709Lb_obsout, T018T5_n9709Lb_obsout, T018T5_A9721Lb_obsprb, T018T5_n9721Lb_obsprb, T018T5_A9857Ex_Obs, T018T5_n9857Ex_Obs, T018T5_A10105Sedo1,
            T018T5_n10105Sedo1, T018T5_A10106Sedo2, T018T5_n10106Sedo2, T018T5_A10107Sedo3, T018T5_n10107Sedo3, T018T5_A10108Sedo4, T018T5_n10108Sedo4, T018T5_A10109Sedo5, T018T5_n10109Sedo5, T018T5_A10110Sedo6,
            T018T5_n10110Sedo6, T018T5_A10152Lb_HhIn, T018T5_n10152Lb_HhIn, T018T5_A10138Lb_HhOut, T018T5_n10138Lb_HhOut, T018T5_A10153Lb_HhTin, T018T5_n10153Lb_HhTin, T018T5_A10148Lb_UbPzs, T018T5_n10148Lb_UbPzs, T018T5_A10135Lb_UbUb,
            T018T5_n10135Lb_UbUb, T018T5_A396EmprCod
            }
            , new Object[] {
            T018T6_A407EmprNom, T018T6_n407EmprNom
            }
            , new Object[] {
            T018T7_A9611Lb_Hdr, T018T7_A9612Lb_Hdrr, T018T7_A9613Lb_Hdrp, T018T7_A407EmprNom, T018T7_n407EmprNom, T018T7_A9614Lb_UsuIn, T018T7_n9614Lb_UsuIn, T018T7_A9615Lb_FecIn, T018T7_n9615Lb_FecIn, T018T7_A9616Lb_UsuOut,
            T018T7_n9616Lb_UsuOut, T018T7_A9617Lb_FecOut, T018T7_n9617Lb_FecOut, T018T7_A9618Lb_inout, T018T7_n9618Lb_inout, T018T7_A9623Lb_FecTin, T018T7_n9623Lb_FecTin, T018T7_A9624Lb_UsuTin, T018T7_n9624Lb_UsuTin, T018T7_A9625Lb_obsin,
            T018T7_n9625Lb_obsin, T018T7_A9702Lb_FecPAc, T018T7_n9702Lb_FecPAc, T018T7_A9703Lb_FecAcF, T018T7_n9703Lb_FecAcF, T018T7_A9709Lb_obsout, T018T7_n9709Lb_obsout, T018T7_A9721Lb_obsprb, T018T7_n9721Lb_obsprb, T018T7_A9857Ex_Obs,
            T018T7_n9857Ex_Obs, T018T7_A10105Sedo1, T018T7_n10105Sedo1, T018T7_A10106Sedo2, T018T7_n10106Sedo2, T018T7_A10107Sedo3, T018T7_n10107Sedo3, T018T7_A10108Sedo4, T018T7_n10108Sedo4, T018T7_A10109Sedo5,
            T018T7_n10109Sedo5, T018T7_A10110Sedo6, T018T7_n10110Sedo6, T018T7_A10152Lb_HhIn, T018T7_n10152Lb_HhIn, T018T7_A10138Lb_HhOut, T018T7_n10138Lb_HhOut, T018T7_A10153Lb_HhTin, T018T7_n10153Lb_HhTin, T018T7_A10148Lb_UbPzs,
            T018T7_n10148Lb_UbPzs, T018T7_A10135Lb_UbUb, T018T7_n10135Lb_UbUb, T018T7_A396EmprCod
            }
            , new Object[] {
            T018T8_A396EmprCod, T018T8_A9611Lb_Hdr, T018T8_A9612Lb_Hdrr, T018T8_A9613Lb_Hdrp
            }
            , new Object[] {
            T018T9_A396EmprCod, T018T9_A9611Lb_Hdr, T018T9_A9612Lb_Hdrr, T018T9_A9613Lb_Hdrp
            }
            , new Object[] {
            T018T10_A396EmprCod, T018T10_A9611Lb_Hdr, T018T10_A9612Lb_Hdrr, T018T10_A9613Lb_Hdrp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018T14_A396EmprCod, T018T14_A9611Lb_Hdr, T018T14_A9612Lb_Hdrr, T018T14_A9613Lb_Hdrp
            }
            , new Object[] {
            T018T15_A396EmprCod, T018T15_A9611Lb_Hdr, T018T15_A9612Lb_Hdrr, T018T15_A9613Lb_Hdrp, T018T15_A10155Lb_NUbi, T018T15_A10156Lb_NPzs, T018T15_n10156Lb_NPzs
            }
            , new Object[] {
            T018T16_A396EmprCod, T018T16_A9611Lb_Hdr, T018T16_A9612Lb_Hdrr, T018T16_A9613Lb_Hdrp, T018T16_A10155Lb_NUbi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018T20_A396EmprCod, T018T20_A9611Lb_Hdr, T018T20_A9612Lb_Hdrr, T018T20_A9613Lb_Hdrp, T018T20_A10155Lb_NUbi
            }
            , new Object[] {
            T018T21_A407EmprNom, T018T21_n407EmprNom
            }
         }
      );
      Z9613Lb_Hdrp = "" ;
      A9613Lb_Hdrp = "" ;
      Z9612Lb_Hdrr = (byte)(0) ;
      A9612Lb_Hdrr = (byte)(0) ;
      Z9611Lb_Hdr = 0 ;
      A9611Lb_Hdr = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TUBI002" ;
   }

   private byte wcpOA9612Lb_Hdrr ;
   private byte Z9612Lb_Hdrr ;
   private byte Z9618Lb_inout ;
   private byte Z10109Sedo5 ;
   private byte Z10110Sedo6 ;
   private byte GxWebError ;
   private byte A9612Lb_Hdrr ;
   private byte nKeyPressed ;
   private byte A9618Lb_inout ;
   private byte A10109Sedo5 ;
   private byte A10110Sedo6 ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ9612Lb_Hdrr ;
   private byte ZZ9618Lb_inout ;
   private byte ZZ10109Sedo5 ;
   private byte ZZ10110Sedo6 ;
   private short Z10107Sedo3 ;
   private short nRcdDeleted_1374 ;
   private short nRcdExists_1374 ;
   private short nIsMod_1374 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10107Sedo3 ;
   private short nBlankRcdCount1374 ;
   private short RcdFound1374 ;
   private short nBlankRcdUsr1374 ;
   private short RcdFound1373 ;
   private short nIsDirty_1373 ;
   private short nIsDirty_1374 ;
   private short ZZ10107Sedo3 ;
   private int wcpOA9611Lb_Hdr ;
   private int wcpOAV32BarPie ;
   private int wcpOAV35Totp ;
   private int Z9611Lb_Hdr ;
   private int Z10148Lb_UbPzs ;
   private int nRC_GXsfl_165 ;
   private int nGXsfl_165_idx=1 ;
   private int Z10156Lb_NPzs ;
   private int O10156Lb_NPzs ;
   private int A9611Lb_Hdr ;
   private int AV32BarPie ;
   private int AV35Totp ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtLb_Hdr_Enabled ;
   private int edtLb_Hdrr_Enabled ;
   private int edtLb_Hdrp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtLb_UsuIn_Enabled ;
   private int edtLb_FecIn_Enabled ;
   private int edtLb_UsuOut_Enabled ;
   private int edtLb_FecOut_Enabled ;
   private int edtLb_inout_Enabled ;
   private int edtLb_FecTin_Enabled ;
   private int edtLb_UsuTin_Enabled ;
   private int edtLb_obsin_Enabled ;
   private int edtLb_FecPAc_Enabled ;
   private int edtLb_FecAcF_Enabled ;
   private int edtLb_obsout_Enabled ;
   private int edtLb_obsprb_Enabled ;
   private int edtEx_Obs_Enabled ;
   private int edtSedo1_Enabled ;
   private int edtSedo2_Enabled ;
   private int edtSedo3_Enabled ;
   private int edtSedo4_Enabled ;
   private int edtSedo5_Enabled ;
   private int edtSedo6_Enabled ;
   private int edtLb_HhIn_Enabled ;
   private int edtLb_HhOut_Enabled ;
   private int edtLb_HhTin_Enabled ;
   private int A10148Lb_UbPzs ;
   private int edtLb_UbPzs_Enabled ;
   private int edtLb_UbUb_Enabled ;
   private int edtavnRcdDeleted_1374_Enabled ;
   private int edtLb_NUbi_Enabled ;
   private int edtLb_NPzs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV34Tot_pz ;
   private int sV34Tot_pz ;
   private int OV34Tot_pz ;
   private int A10156Lb_NPzs ;
   private int T10156Lb_NPzs ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtLb_NUbi_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtLb_UbUb_Backcolor ;
   private int edtLb_UbPzs_Backcolor ;
   private int edtLb_HhTin_Backcolor ;
   private int edtLb_HhOut_Backcolor ;
   private int edtLb_HhIn_Backcolor ;
   private int edtSedo6_Backcolor ;
   private int edtSedo5_Backcolor ;
   private int edtSedo4_Backcolor ;
   private int edtSedo3_Backcolor ;
   private int edtSedo2_Backcolor ;
   private int edtSedo1_Backcolor ;
   private int edtEx_Obs_Backcolor ;
   private int edtLb_obsprb_Backcolor ;
   private int edtLb_obsout_Backcolor ;
   private int edtLb_FecAcF_Backcolor ;
   private int edtLb_FecPAc_Backcolor ;
   private int edtLb_obsin_Backcolor ;
   private int edtLb_UsuTin_Backcolor ;
   private int edtLb_FecTin_Backcolor ;
   private int edtLb_inout_Backcolor ;
   private int edtLb_FecOut_Backcolor ;
   private int edtLb_UsuOut_Backcolor ;
   private int edtLb_FecIn_Backcolor ;
   private int edtLb_UsuIn_Backcolor ;
   private int edtLb_Hdrp_Backcolor ;
   private int edtLb_Hdrr_Backcolor ;
   private int edtLb_Hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ9611Lb_Hdr ;
   private int ZZ10148Lb_UbPzs ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10105Sedo1 ;
   private java.math.BigDecimal Z10106Sedo2 ;
   private java.math.BigDecimal Z10108Sedo4 ;
   private java.math.BigDecimal A10105Sedo1 ;
   private java.math.BigDecimal A10106Sedo2 ;
   private java.math.BigDecimal A10108Sedo4 ;
   private java.math.BigDecimal ZZ10105Sedo1 ;
   private java.math.BigDecimal ZZ10106Sedo2 ;
   private java.math.BigDecimal ZZ10108Sedo4 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA9613Lb_Hdrp ;
   private String Z396EmprCod ;
   private String Z9613Lb_Hdrp ;
   private String Z9614Lb_UsuIn ;
   private String Z9616Lb_UsuOut ;
   private String Z9624Lb_UsuTin ;
   private String Z10135Lb_UbUb ;
   private String Z10155Lb_NUbi ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10155Lb_NUbi ;
   private String AV33Emp_dUb ;
   private String A9613Lb_Hdrp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_UsuIn_Internalname ;
   private String sGXsfl_165_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtLb_Hdr_Internalname ;
   private String edtLb_Hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtLb_Hdrr_Internalname ;
   private String edtLb_Hdrr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtLb_Hdrp_Internalname ;
   private String edtLb_Hdrp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String A9614Lb_UsuIn ;
   private String edtLb_UsuIn_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtLb_FecIn_Internalname ;
   private String edtLb_FecIn_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtLb_UsuOut_Internalname ;
   private String A9616Lb_UsuOut ;
   private String edtLb_UsuOut_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtLb_FecOut_Internalname ;
   private String edtLb_FecOut_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtLb_inout_Internalname ;
   private String edtLb_inout_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtLb_FecTin_Internalname ;
   private String edtLb_FecTin_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtLb_UsuTin_Internalname ;
   private String A9624Lb_UsuTin ;
   private String edtLb_UsuTin_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtLb_obsin_Internalname ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtLb_FecPAc_Internalname ;
   private String edtLb_FecPAc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtLb_FecAcF_Internalname ;
   private String edtLb_FecAcF_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtLb_obsout_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtLb_obsprb_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtEx_Obs_Internalname ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtSedo1_Internalname ;
   private String edtSedo1_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtSedo2_Internalname ;
   private String edtSedo2_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtSedo3_Internalname ;
   private String edtSedo3_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtSedo4_Internalname ;
   private String edtSedo4_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtSedo5_Internalname ;
   private String edtSedo5_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtSedo6_Internalname ;
   private String edtSedo6_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtLb_HhIn_Internalname ;
   private String edtLb_HhIn_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtLb_HhOut_Internalname ;
   private String edtLb_HhOut_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtLb_HhTin_Internalname ;
   private String edtLb_HhTin_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtLb_UbPzs_Internalname ;
   private String edtLb_UbPzs_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtLb_UbUb_Internalname ;
   private String A10135Lb_UbUb ;
   private String edtLb_UbUb_Jsonclick ;
   private String sMode1374 ;
   private String edtavnRcdDeleted_1374_Internalname ;
   private String edtLb_NUbi_Internalname ;
   private String edtLb_NPzs_Internalname ;
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
   private String AV36Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1373 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV15Lit3 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String sGXsfl_165_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1374_Jsonclick ;
   private String edtLb_NUbi_Jsonclick ;
   private String edtLb_NPzs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ9613Lb_Hdrp ;
   private String ZZ407EmprNom ;
   private String ZZ9614Lb_UsuIn ;
   private String ZZ9616Lb_UsuOut ;
   private String ZZ9624Lb_UsuTin ;
   private String ZZ10135Lb_UbUb ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV33Emp_dUb ;
   private java.util.Date Z10152Lb_HhIn ;
   private java.util.Date Z10138Lb_HhOut ;
   private java.util.Date Z10153Lb_HhTin ;
   private java.util.Date A10152Lb_HhIn ;
   private java.util.Date A10138Lb_HhOut ;
   private java.util.Date A10153Lb_HhTin ;
   private java.util.Date ZZ10152Lb_HhIn ;
   private java.util.Date ZZ10138Lb_HhOut ;
   private java.util.Date ZZ10153Lb_HhTin ;
   private java.util.Date Z9615Lb_FecIn ;
   private java.util.Date Z9617Lb_FecOut ;
   private java.util.Date Z9623Lb_FecTin ;
   private java.util.Date Z9702Lb_FecPAc ;
   private java.util.Date Z9703Lb_FecAcF ;
   private java.util.Date A9615Lb_FecIn ;
   private java.util.Date A9617Lb_FecOut ;
   private java.util.Date A9623Lb_FecTin ;
   private java.util.Date A9702Lb_FecPAc ;
   private java.util.Date A9703Lb_FecAcF ;
   private java.util.Date ZZ9615Lb_FecIn ;
   private java.util.Date ZZ9617Lb_FecOut ;
   private java.util.Date ZZ9623Lb_FecTin ;
   private java.util.Date ZZ9702Lb_FecPAc ;
   private java.util.Date ZZ9703Lb_FecAcF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_165_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9614Lb_UsuIn ;
   private boolean n9615Lb_FecIn ;
   private boolean n9616Lb_UsuOut ;
   private boolean n9617Lb_FecOut ;
   private boolean n9618Lb_inout ;
   private boolean n9623Lb_FecTin ;
   private boolean n9624Lb_UsuTin ;
   private boolean n9625Lb_obsin ;
   private boolean n9702Lb_FecPAc ;
   private boolean n9703Lb_FecAcF ;
   private boolean n9709Lb_obsout ;
   private boolean n9721Lb_obsprb ;
   private boolean n9857Ex_Obs ;
   private boolean n10105Sedo1 ;
   private boolean n10106Sedo2 ;
   private boolean n10107Sedo3 ;
   private boolean n10108Sedo4 ;
   private boolean n10109Sedo5 ;
   private boolean n10110Sedo6 ;
   private boolean n10152Lb_HhIn ;
   private boolean n10138Lb_HhOut ;
   private boolean n10153Lb_HhTin ;
   private boolean n10148Lb_UbPzs ;
   private boolean n10135Lb_UbUb ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n10156Lb_NPzs ;
   private String Z9625Lb_obsin ;
   private String Z9709Lb_obsout ;
   private String Z9721Lb_obsprb ;
   private String Z9857Ex_Obs ;
   private String A9625Lb_obsin ;
   private String A9709Lb_obsout ;
   private String A9721Lb_obsprb ;
   private String A9857Ex_Obs ;
   private String ZZ9625Lb_obsin ;
   private String ZZ9709Lb_obsout ;
   private String ZZ9721Lb_obsprb ;
   private String ZZ9857Ex_Obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018T6_A407EmprNom ;
   private boolean[] T018T6_n407EmprNom ;
   private int[] T018T7_A9611Lb_Hdr ;
   private byte[] T018T7_A9612Lb_Hdrr ;
   private String[] T018T7_A9613Lb_Hdrp ;
   private String[] T018T7_A407EmprNom ;
   private boolean[] T018T7_n407EmprNom ;
   private String[] T018T7_A9614Lb_UsuIn ;
   private boolean[] T018T7_n9614Lb_UsuIn ;
   private java.util.Date[] T018T7_A9615Lb_FecIn ;
   private boolean[] T018T7_n9615Lb_FecIn ;
   private String[] T018T7_A9616Lb_UsuOut ;
   private boolean[] T018T7_n9616Lb_UsuOut ;
   private java.util.Date[] T018T7_A9617Lb_FecOut ;
   private boolean[] T018T7_n9617Lb_FecOut ;
   private byte[] T018T7_A9618Lb_inout ;
   private boolean[] T018T7_n9618Lb_inout ;
   private java.util.Date[] T018T7_A9623Lb_FecTin ;
   private boolean[] T018T7_n9623Lb_FecTin ;
   private String[] T018T7_A9624Lb_UsuTin ;
   private boolean[] T018T7_n9624Lb_UsuTin ;
   private String[] T018T7_A9625Lb_obsin ;
   private boolean[] T018T7_n9625Lb_obsin ;
   private java.util.Date[] T018T7_A9702Lb_FecPAc ;
   private boolean[] T018T7_n9702Lb_FecPAc ;
   private java.util.Date[] T018T7_A9703Lb_FecAcF ;
   private boolean[] T018T7_n9703Lb_FecAcF ;
   private String[] T018T7_A9709Lb_obsout ;
   private boolean[] T018T7_n9709Lb_obsout ;
   private String[] T018T7_A9721Lb_obsprb ;
   private boolean[] T018T7_n9721Lb_obsprb ;
   private String[] T018T7_A9857Ex_Obs ;
   private boolean[] T018T7_n9857Ex_Obs ;
   private java.math.BigDecimal[] T018T7_A10105Sedo1 ;
   private boolean[] T018T7_n10105Sedo1 ;
   private java.math.BigDecimal[] T018T7_A10106Sedo2 ;
   private boolean[] T018T7_n10106Sedo2 ;
   private short[] T018T7_A10107Sedo3 ;
   private boolean[] T018T7_n10107Sedo3 ;
   private java.math.BigDecimal[] T018T7_A10108Sedo4 ;
   private boolean[] T018T7_n10108Sedo4 ;
   private byte[] T018T7_A10109Sedo5 ;
   private boolean[] T018T7_n10109Sedo5 ;
   private byte[] T018T7_A10110Sedo6 ;
   private boolean[] T018T7_n10110Sedo6 ;
   private java.util.Date[] T018T7_A10152Lb_HhIn ;
   private boolean[] T018T7_n10152Lb_HhIn ;
   private java.util.Date[] T018T7_A10138Lb_HhOut ;
   private boolean[] T018T7_n10138Lb_HhOut ;
   private java.util.Date[] T018T7_A10153Lb_HhTin ;
   private boolean[] T018T7_n10153Lb_HhTin ;
   private int[] T018T7_A10148Lb_UbPzs ;
   private boolean[] T018T7_n10148Lb_UbPzs ;
   private String[] T018T7_A10135Lb_UbUb ;
   private boolean[] T018T7_n10135Lb_UbUb ;
   private String[] T018T7_A396EmprCod ;
   private String[] T018T8_A396EmprCod ;
   private int[] T018T8_A9611Lb_Hdr ;
   private byte[] T018T8_A9612Lb_Hdrr ;
   private String[] T018T8_A9613Lb_Hdrp ;
   private int[] T018T5_A9611Lb_Hdr ;
   private byte[] T018T5_A9612Lb_Hdrr ;
   private String[] T018T5_A9613Lb_Hdrp ;
   private String[] T018T5_A9614Lb_UsuIn ;
   private boolean[] T018T5_n9614Lb_UsuIn ;
   private java.util.Date[] T018T5_A9615Lb_FecIn ;
   private boolean[] T018T5_n9615Lb_FecIn ;
   private String[] T018T5_A9616Lb_UsuOut ;
   private boolean[] T018T5_n9616Lb_UsuOut ;
   private java.util.Date[] T018T5_A9617Lb_FecOut ;
   private boolean[] T018T5_n9617Lb_FecOut ;
   private byte[] T018T5_A9618Lb_inout ;
   private boolean[] T018T5_n9618Lb_inout ;
   private java.util.Date[] T018T5_A9623Lb_FecTin ;
   private boolean[] T018T5_n9623Lb_FecTin ;
   private String[] T018T5_A9624Lb_UsuTin ;
   private boolean[] T018T5_n9624Lb_UsuTin ;
   private String[] T018T5_A9625Lb_obsin ;
   private boolean[] T018T5_n9625Lb_obsin ;
   private java.util.Date[] T018T5_A9702Lb_FecPAc ;
   private boolean[] T018T5_n9702Lb_FecPAc ;
   private java.util.Date[] T018T5_A9703Lb_FecAcF ;
   private boolean[] T018T5_n9703Lb_FecAcF ;
   private String[] T018T5_A9709Lb_obsout ;
   private boolean[] T018T5_n9709Lb_obsout ;
   private String[] T018T5_A9721Lb_obsprb ;
   private boolean[] T018T5_n9721Lb_obsprb ;
   private String[] T018T5_A9857Ex_Obs ;
   private boolean[] T018T5_n9857Ex_Obs ;
   private java.math.BigDecimal[] T018T5_A10105Sedo1 ;
   private boolean[] T018T5_n10105Sedo1 ;
   private java.math.BigDecimal[] T018T5_A10106Sedo2 ;
   private boolean[] T018T5_n10106Sedo2 ;
   private short[] T018T5_A10107Sedo3 ;
   private boolean[] T018T5_n10107Sedo3 ;
   private java.math.BigDecimal[] T018T5_A10108Sedo4 ;
   private boolean[] T018T5_n10108Sedo4 ;
   private byte[] T018T5_A10109Sedo5 ;
   private boolean[] T018T5_n10109Sedo5 ;
   private byte[] T018T5_A10110Sedo6 ;
   private boolean[] T018T5_n10110Sedo6 ;
   private java.util.Date[] T018T5_A10152Lb_HhIn ;
   private boolean[] T018T5_n10152Lb_HhIn ;
   private java.util.Date[] T018T5_A10138Lb_HhOut ;
   private boolean[] T018T5_n10138Lb_HhOut ;
   private java.util.Date[] T018T5_A10153Lb_HhTin ;
   private boolean[] T018T5_n10153Lb_HhTin ;
   private int[] T018T5_A10148Lb_UbPzs ;
   private boolean[] T018T5_n10148Lb_UbPzs ;
   private String[] T018T5_A10135Lb_UbUb ;
   private boolean[] T018T5_n10135Lb_UbUb ;
   private String[] T018T5_A396EmprCod ;
   private String[] T018T9_A396EmprCod ;
   private int[] T018T9_A9611Lb_Hdr ;
   private byte[] T018T9_A9612Lb_Hdrr ;
   private String[] T018T9_A9613Lb_Hdrp ;
   private String[] T018T10_A396EmprCod ;
   private int[] T018T10_A9611Lb_Hdr ;
   private byte[] T018T10_A9612Lb_Hdrr ;
   private String[] T018T10_A9613Lb_Hdrp ;
   private int[] T018T4_A9611Lb_Hdr ;
   private byte[] T018T4_A9612Lb_Hdrr ;
   private String[] T018T4_A9613Lb_Hdrp ;
   private String[] T018T4_A9614Lb_UsuIn ;
   private boolean[] T018T4_n9614Lb_UsuIn ;
   private java.util.Date[] T018T4_A9615Lb_FecIn ;
   private boolean[] T018T4_n9615Lb_FecIn ;
   private String[] T018T4_A9616Lb_UsuOut ;
   private boolean[] T018T4_n9616Lb_UsuOut ;
   private java.util.Date[] T018T4_A9617Lb_FecOut ;
   private boolean[] T018T4_n9617Lb_FecOut ;
   private byte[] T018T4_A9618Lb_inout ;
   private boolean[] T018T4_n9618Lb_inout ;
   private java.util.Date[] T018T4_A9623Lb_FecTin ;
   private boolean[] T018T4_n9623Lb_FecTin ;
   private String[] T018T4_A9624Lb_UsuTin ;
   private boolean[] T018T4_n9624Lb_UsuTin ;
   private String[] T018T4_A9625Lb_obsin ;
   private boolean[] T018T4_n9625Lb_obsin ;
   private java.util.Date[] T018T4_A9702Lb_FecPAc ;
   private boolean[] T018T4_n9702Lb_FecPAc ;
   private java.util.Date[] T018T4_A9703Lb_FecAcF ;
   private boolean[] T018T4_n9703Lb_FecAcF ;
   private String[] T018T4_A9709Lb_obsout ;
   private boolean[] T018T4_n9709Lb_obsout ;
   private String[] T018T4_A9721Lb_obsprb ;
   private boolean[] T018T4_n9721Lb_obsprb ;
   private String[] T018T4_A9857Ex_Obs ;
   private boolean[] T018T4_n9857Ex_Obs ;
   private java.math.BigDecimal[] T018T4_A10105Sedo1 ;
   private boolean[] T018T4_n10105Sedo1 ;
   private java.math.BigDecimal[] T018T4_A10106Sedo2 ;
   private boolean[] T018T4_n10106Sedo2 ;
   private short[] T018T4_A10107Sedo3 ;
   private boolean[] T018T4_n10107Sedo3 ;
   private java.math.BigDecimal[] T018T4_A10108Sedo4 ;
   private boolean[] T018T4_n10108Sedo4 ;
   private byte[] T018T4_A10109Sedo5 ;
   private boolean[] T018T4_n10109Sedo5 ;
   private byte[] T018T4_A10110Sedo6 ;
   private boolean[] T018T4_n10110Sedo6 ;
   private java.util.Date[] T018T4_A10152Lb_HhIn ;
   private boolean[] T018T4_n10152Lb_HhIn ;
   private java.util.Date[] T018T4_A10138Lb_HhOut ;
   private boolean[] T018T4_n10138Lb_HhOut ;
   private java.util.Date[] T018T4_A10153Lb_HhTin ;
   private boolean[] T018T4_n10153Lb_HhTin ;
   private int[] T018T4_A10148Lb_UbPzs ;
   private boolean[] T018T4_n10148Lb_UbPzs ;
   private String[] T018T4_A10135Lb_UbUb ;
   private boolean[] T018T4_n10135Lb_UbUb ;
   private String[] T018T4_A396EmprCod ;
   private String[] T018T14_A396EmprCod ;
   private int[] T018T14_A9611Lb_Hdr ;
   private byte[] T018T14_A9612Lb_Hdrr ;
   private String[] T018T14_A9613Lb_Hdrp ;
   private String[] T018T15_A396EmprCod ;
   private int[] T018T15_A9611Lb_Hdr ;
   private byte[] T018T15_A9612Lb_Hdrr ;
   private String[] T018T15_A9613Lb_Hdrp ;
   private String[] T018T15_A10155Lb_NUbi ;
   private int[] T018T15_A10156Lb_NPzs ;
   private boolean[] T018T15_n10156Lb_NPzs ;
   private String[] T018T16_A396EmprCod ;
   private int[] T018T16_A9611Lb_Hdr ;
   private byte[] T018T16_A9612Lb_Hdrr ;
   private String[] T018T16_A9613Lb_Hdrp ;
   private String[] T018T16_A10155Lb_NUbi ;
   private String[] T018T3_A396EmprCod ;
   private int[] T018T3_A9611Lb_Hdr ;
   private byte[] T018T3_A9612Lb_Hdrr ;
   private String[] T018T3_A9613Lb_Hdrp ;
   private String[] T018T3_A10155Lb_NUbi ;
   private int[] T018T3_A10156Lb_NPzs ;
   private boolean[] T018T3_n10156Lb_NPzs ;
   private String[] T018T2_A396EmprCod ;
   private int[] T018T2_A9611Lb_Hdr ;
   private byte[] T018T2_A9612Lb_Hdrr ;
   private String[] T018T2_A9613Lb_Hdrp ;
   private String[] T018T2_A10155Lb_NUbi ;
   private int[] T018T2_A10156Lb_NPzs ;
   private boolean[] T018T2_n10156Lb_NPzs ;
   private String[] T018T20_A396EmprCod ;
   private int[] T018T20_A9611Lb_Hdr ;
   private byte[] T018T20_A9612Lb_Hdrr ;
   private String[] T018T20_A9613Lb_Hdrp ;
   private String[] T018T20_A10155Lb_NUbi ;
   private String[] T018T21_A407EmprNom ;
   private boolean[] T018T21_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tubi002__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubi002__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubi002__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubi002__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubi002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018T2", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi, Lb_NPzs FROM TXPHDRIN1 WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? AND Lb_NUbi = ?  FOR UPDATE OF Lb_NPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018T3", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi, Lb_NPzs FROM TXPHDRIN1 WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? AND Lb_NUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018T4", "SELECT Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb, EmprCod FROM TXPHDRINO WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ?  FOR UPDATE OF Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T5", "SELECT Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb, EmprCod FROM TXPHDRINO WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T7", "SELECT /*+ FIRST_ROWS(1) */ TM1.Lb_Hdr, TM1.Lb_Hdrr, TM1.Lb_Hdrp, T2.EmprNom, TM1.Lb_UsuIn, TM1.Lb_FecIn, TM1.Lb_UsuOut, TM1.Lb_FecOut, TM1.Lb_inout, TM1.Lb_FecTin, TM1.Lb_UsuTin, TM1.Lb_obsin, TM1.Lb_FecPAc, TM1.Lb_FecAcF, TM1.Lb_obsout, TM1.Lb_obsprb, TM1.Ex_Obs, TM1.Sedo1, TM1.Sedo2, TM1.Sedo3, TM1.Sedo4, TM1.Sedo5, TM1.Sedo6, TM1.Lb_HhIn, TM1.Lb_HhOut, TM1.Lb_HhTin, TM1.Lb_UbPzs, TM1.Lb_UbUb, TM1.EmprCod FROM (TXPHDRINO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Lb_Hdr = ? and TM1.Lb_Hdrr = ? and TM1.Lb_Hdrp = ? ORDER BY TM1.EmprCod, TM1.Lb_Hdr, TM1.Lb_Hdrr, TM1.Lb_Hdrp ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp FROM TXPHDRINO WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod DESC, Lb_Hdr DESC, Lb_Hdrr DESC, Lb_Hdrp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018T11", "INSERT INTO TXPHDRINO(Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb, EmprCod, Lb_IDMP, Lb_IDMO, Lb_IDMS, Lb_IDMF, Lb_IDMFC, Sedo7, Sedo8, Sedo9, Sedo10, Sedo11, Lb_FecVTf, Lb_FecFev, Lb_FecAcb, Lb_FecTef, Lb_FecSf, Lb_FecRm, Lb_FecCd, Lb_FecEm, Sedo12, Sedo13, Sedo14, BCSd001, BCSd002, BCSd003, BCSd004, BCSd005, BCSd006, BCSd007, BCSd008, BCSd009) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPHDRINO")
         ,new UpdateCursor("T018T12", "UPDATE TXPHDRINO SET Lb_UsuIn=?, Lb_FecIn=?, Lb_UsuOut=?, Lb_FecOut=?, Lb_inout=?, Lb_FecTin=?, Lb_UsuTin=?, Lb_obsin=?, Lb_FecPAc=?, Lb_FecAcF=?, Lb_obsout=?, Lb_obsprb=?, Ex_Obs=?, Sedo1=?, Sedo2=?, Sedo3=?, Sedo4=?, Sedo5=?, Sedo6=?, Lb_HhIn=?, Lb_HhOut=?, Lb_HhTin=?, Lb_UbPzs=?, Lb_UbUb=?  WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ?", GX_NOMASK, "TXPHDRINO")
         ,new UpdateCursor("T018T13", "DELETE FROM TXPHDRINO  WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ?", GX_NOMASK, "TXPHDRINO")
         ,new ForEachCursor("T018T14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018T15", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi, Lb_NPzs FROM TXPHDRIN1 WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? and Lb_NUbi = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018T16", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi FROM TXPHDRIN1 WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? AND Lb_NUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018T17", "INSERT INTO TXPHDRIN1(EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi, Lb_NPzs) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRIN1")
         ,new UpdateCursor("T018T18", "UPDATE TXPHDRIN1 SET Lb_NPzs=?  WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? AND Lb_NUbi = ?", GX_NOMASK, "TXPHDRIN1")
         ,new UpdateCursor("T018T19", "DELETE FROM TXPHDRIN1  WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ? AND Lb_NUbi = ?", GX_NOMASK, "TXPHDRIN1")
         ,new ForEachCursor("T018T20", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi FROM TXPHDRIN1 WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_NUbi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018T21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = GXutil.resetDate(rslt.getGXDateTime(23));
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = GXutil.resetDate(rslt.getGXDateTime(25));
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = GXutil.resetDate(rslt.getGXDateTime(23));
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = GXutil.resetDate(rslt.getGXDateTime(25));
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 3);
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
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(19,1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = GXutil.resetDate(rslt.getGXDateTime(25));
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = GXutil.resetDate(rslt.getGXDateTime(26));
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 3);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setString(4, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 10);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 200);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 200);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 200);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 300);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
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
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[42], true);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[44], true);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[46], true);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[48]).intValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[50], 10);
               }
               stmt.setString(28, (String)parms[51], 3);
               return;
            case 10 :
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
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 200);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 300);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 1);
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
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], true);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[41], true);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], true);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[45]).intValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 10);
               }
               stmt.setString(25, (String)parms[48], 3);
               stmt.setInt(26, ((Number) parms[49]).intValue());
               stmt.setByte(27, ((Number) parms[50]).byteValue());
               stmt.setString(28, (String)parms[51], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
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

