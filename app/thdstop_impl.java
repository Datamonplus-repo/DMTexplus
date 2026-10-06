package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdstop_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = (int)(GXutil.lval( httpContext.GetPar( "Stp_hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = (byte)(GXutil.lval( httpContext.GetPar( "Stp_r"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = httpContext.GetPar( "Stp_p") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A10746Stp_hdr, A10747Stp_r, A10748Stp_p) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = (int)(GXutil.lval( httpContext.GetPar( "Stp_hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = (byte)(GXutil.lval( httpContext.GetPar( "Stp_r"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = httpContext.GetPar( "Stp_p") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A10746Stp_hdr, A10747Stp_r, A10748Stp_p) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "SUSPENSION HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public thdstop_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdstop_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdstop_impl.class ));
   }

   public thdstop_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THDSTOP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10746Stp_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10746Stp_hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10746Stp_hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_hdr_Jsonclick, 0, "", "", "", "", "", 1, edtStp_hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_r_Internalname, GXutil.ltrim( localUtil.ntoc( A10747Stp_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_r_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10747Stp_r), "9") : localUtil.format( DecimalUtil.doubleToDec(A10747Stp_r), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_r_Jsonclick, 0, "", "", "", "", "", 1, edtStp_r_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_p_Internalname, GXutil.rtrim( A10748Stp_p), GXutil.rtrim( localUtil.format( A10748Stp_p, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_p_Jsonclick, 0, "", "", "", "", "", 1, edtStp_p_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStp_ultL_Internalname, GXutil.ltrim( localUtil.ntoc( A10749Stp_ultL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtStp_ultL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10749Stp_ultL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10749Stp_ultL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStp_ultL_Jsonclick, 0, "", "", "", "", "", 1, edtStp_ultL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDSTOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1430 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1430 = (short)(1) ;
            scanStart1901430( ) ;
            while ( RcdFound1430 != 0 )
            {
               init_level_properties1430( ) ;
               getByPrimaryKey1901430( ) ;
               addRow1901430( ) ;
               scanNext1901430( ) ;
            }
            scanEnd1901430( ) ;
            nBlankRcdCount1430 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1901430( ) ;
         standaloneModal1901430( ) ;
         sMode1430 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1901430( ) ;
            edtavnRcdDeleted_1430_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1430_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1430_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1430_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_LIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_Dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_DIA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Dia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_Mot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_MOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_Mot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Mot_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_Term_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_TERM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Term_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_Usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_USU_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Usu_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_Est_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_EST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Est_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_DiaA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_DIAA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_DiaA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_DiaA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_MotA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_MOTA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_MotA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_MotA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_UsuAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_USUACT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_UsuAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_UsuAct_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtStp_TermAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_TERMAC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtStp_TermAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_TermAc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1430 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1901430( ) ;
            }
            sendRow1901430( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1430 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1430 = (short)(5) ;
         nRcdExists_1430 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1901430( ) ;
            while ( RcdFound1430 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501430( ) ;
               init_level_properties1430( ) ;
               standaloneNotModal1901430( ) ;
               getByPrimaryKey1901430( ) ;
               standaloneModal1901430( ) ;
               addRow1901430( ) ;
               scanNext1901430( ) ;
            }
            scanEnd1901430( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1430 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501430( ) ;
      initAll1901430( ) ;
      init_level_properties1430( ) ;
      nRcdExists_1430 = (short)(0) ;
      nIsMod_1430 = (short)(0) ;
      nRcdDeleted_1430 = (short)(0) ;
      nBlankRcdCount1430 = (short)(nBlankRcdUsr1430+nBlankRcdCount1430) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1430 > 0 )
      {
         standaloneNotModal1901430( ) ;
         standaloneModal1901430( ) ;
         addRow1901430( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtStp_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1430 = (short)(nBlankRcdCount1430-1) ;
      }
      Gx_mode = sMode1430 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDSTOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THDSTOP.htm");
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
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z10746Stp_hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z10746Stp_hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10747Stp_r = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10747Stp_r"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10748Stp_p = httpContext.cgiGet( "Z10748Stp_p") ;
         Z10749Stp_ultL = (short)(localUtil.ctol( httpContext.cgiGet( "Z10749Stp_ultL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13723StpHdr = httpContext.cgiGet( "STPHDR") ;
         A13727StpCliNom = httpContext.cgiGet( "STPCLINOM") ;
         n13727StpCliNom = false ;
         A13724StpBarser = httpContext.cgiGet( "STPBARSER") ;
         n13724StpBarser = false ;
         A13725StpBarserD = httpContext.cgiGet( "STPBARSERD") ;
         n13725StpBarserD = false ;
         A13726StpClicod = (int)(localUtil.ctol( httpContext.cgiGet( "STPCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13726StpClicod = false ;
         A13728StpColor = httpContext.cgiGet( "STPCOLOR") ;
         n13728StpColor = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_HDR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_hdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10746Stp_hdr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         }
         else
         {
            A10746Stp_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_R");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_r_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10747Stp_r = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         }
         else
         {
            A10747Stp_r = (byte)(localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         }
         A10748Stp_p = httpContext.cgiGet( edtStp_p_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_ultL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_ultL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STP_ULTL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtStp_ultL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10749Stp_ultL = (short)(0) ;
            n10749Stp_ultL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10749Stp_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10749Stp_ultL), 4, 0));
         }
         else
         {
            A10749Stp_ultL = (short)(localUtil.ctol( httpContext.cgiGet( edtStp_ultL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10749Stp_ultL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10749Stp_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10749Stp_ultL), 4, 0));
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
            A10746Stp_hdr = (int)(GXutil.lval( httpContext.GetPar( "Stp_hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = (byte)(GXutil.lval( httpContext.GetPar( "Stp_r"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = httpContext.GetPar( "Stp_p") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
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
            initAll1901429( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1430_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1430_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1901429( ) ;
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

   public void confirm_1900( )
   {
      beforeValidate1901429( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1901429( ) ;
         }
         else
         {
            checkExtendedTable1901429( ) ;
            if ( AnyError == 0 )
            {
               zm1901429( 3) ;
               zm1901429( 4) ;
               zm1901429( 5) ;
            }
            closeExtendedTableCursors1901429( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1429 = Gx_mode ;
         confirm_1901430( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1429 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1429 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1900( ) ;
      }
   }

   public void confirm_1901430( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1901430( ) ;
         if ( ( nRcdExists_1430 != 0 ) || ( nIsMod_1430 != 0 ) )
         {
            getKey1901430( ) ;
            if ( ( nRcdExists_1430 == 0 ) && ( nRcdDeleted_1430 == 0 ) )
            {
               if ( RcdFound1430 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1901430( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1901430( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1901430( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "STP_LIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtStp_Lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1430 != 0 )
               {
                  if ( nRcdDeleted_1430 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1901430( ) ;
                     load1901430( ) ;
                     beforeValidate1901430( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1901430( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1430 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1901430( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1901430( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1901430( ) ;
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
                  if ( nRcdDeleted_1430 == 0 )
                  {
                     GXCCtl = "STP_LIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtStp_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1430_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtStp_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtStp_Dia_Internalname, localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtStp_Mot_Internalname, A10752Stp_Mot) ;
         httpContext.changePostValue( edtStp_Term_Internalname, GXutil.rtrim( A10753Stp_Term)) ;
         httpContext.changePostValue( edtStp_Usu_Internalname, GXutil.rtrim( A10754Stp_Usu)) ;
         httpContext.changePostValue( edtStp_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtStp_DiaA_Internalname, localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtStp_MotA_Internalname, A10757Stp_MotA) ;
         httpContext.changePostValue( edtStp_UsuAct_Internalname, GXutil.rtrim( A11688Stp_UsuAct)) ;
         httpContext.changePostValue( edtStp_TermAc_Internalname, GXutil.rtrim( A11689Stp_TermAc)) ;
         httpContext.changePostValue( "ZT_"+"Z10750Stp_Lin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10751Stp_Dia_"+sGXsfl_50_idx, localUtil.ttoc( Z10751Stp_Dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10752Stp_Mot_"+sGXsfl_50_idx, Z10752Stp_Mot) ;
         httpContext.changePostValue( "ZT_"+"Z10753Stp_Term_"+sGXsfl_50_idx, GXutil.rtrim( Z10753Stp_Term)) ;
         httpContext.changePostValue( "ZT_"+"Z10754Stp_Usu_"+sGXsfl_50_idx, GXutil.rtrim( Z10754Stp_Usu)) ;
         httpContext.changePostValue( "ZT_"+"Z10755Stp_Est_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10756Stp_DiaA_"+sGXsfl_50_idx, localUtil.ttoc( Z10756Stp_DiaA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10757Stp_MotA_"+sGXsfl_50_idx, Z10757Stp_MotA) ;
         httpContext.changePostValue( "ZT_"+"Z11688Stp_UsuAct_"+sGXsfl_50_idx, GXutil.rtrim( Z11688Stp_UsuAct)) ;
         httpContext.changePostValue( "ZT_"+"Z11689Stp_TermAc_"+sGXsfl_50_idx, GXutil.rtrim( Z11689Stp_TermAc)) ;
         httpContext.changePostValue( "nRcdDeleted_1430_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1430_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1430_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1430 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1430_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1430_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_DIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_MOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Mot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_TERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Term_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_USU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_EST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Est_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_DIAA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_DiaA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_MOTA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_MotA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_USUACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_UsuAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_TERMAC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_TermAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1900( )
   {
   }

   public void zm1901429( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10749Stp_ultL = T01905_A10749Stp_ultL[0] ;
         }
         else
         {
            Z10749Stp_ultL = A10749Stp_ultL ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z10746Stp_hdr = A10746Stp_hdr ;
         Z10747Stp_r = A10747Stp_r ;
         Z10748Stp_p = A10748Stp_p ;
         Z10749Stp_ultL = A10749Stp_ultL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13724StpBarser = A13724StpBarser ;
         Z13725StpBarserD = A13725StpBarserD ;
         Z13726StpClicod = A13726StpClicod ;
         Z13728StpColor = A13728StpColor ;
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

   public void load1901429( )
   {
      /* Using cursor T019010 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1429 = (short)(1) ;
         A407EmprNom = T019010_A407EmprNom[0] ;
         n407EmprNom = T019010_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10749Stp_ultL = T019010_A10749Stp_ultL[0] ;
         n10749Stp_ultL = T019010_n10749Stp_ultL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10749Stp_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10749Stp_ultL), 4, 0));
         A13724StpBarser = T019010_A13724StpBarser[0] ;
         n13724StpBarser = T019010_n13724StpBarser[0] ;
         A13725StpBarserD = T019010_A13725StpBarserD[0] ;
         n13725StpBarserD = T019010_n13725StpBarserD[0] ;
         A13726StpClicod = T019010_A13726StpClicod[0] ;
         n13726StpClicod = T019010_n13726StpClicod[0] ;
         A13728StpColor = T019010_A13728StpColor[0] ;
         n13728StpColor = T019010_n13728StpColor[0] ;
         zm1901429( -2) ;
      }
      pr_default.close(7);
      onLoadActions1901429( ) ;
   }

   public void onLoadActions1901429( )
   {
      /* Using cursor T01908 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13727StpCliNom = T01908_A13727StpCliNom[0] ;
         n13727StpCliNom = T01908_n13727StpCliNom[0] ;
      }
      else
      {
         A13727StpCliNom = " " ;
         n13727StpCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", A13727StpCliNom);
      }
      pr_default.close(5);
      A13723StpHdr = GXutil.trim( GXutil.str( A10746Stp_hdr, 8, 0)) + "-" + GXutil.str( A10747Stp_r, 1, 0) + A10748Stp_p ;
      httpContext.ajax_rsp_assign_attri("", false, "A13723StpHdr", A13723StpHdr);
   }

   public void checkExtendedTable1901429( )
   {
      nIsDirty_1429 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01906 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01906_A407EmprNom[0] ;
      n407EmprNom = T01906_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01908 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13727StpCliNom = T01908_A13727StpCliNom[0] ;
         n13727StpCliNom = T01908_n13727StpCliNom[0] ;
      }
      else
      {
         nIsDirty_1429 = (short)(1) ;
         A13727StpCliNom = " " ;
         n13727StpCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", A13727StpCliNom);
      }
      pr_default.close(5);
      /* Using cursor T01909 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13724StpBarser = T01909_A13724StpBarser[0] ;
         n13724StpBarser = T01909_n13724StpBarser[0] ;
         A13725StpBarserD = T01909_A13725StpBarserD[0] ;
         n13725StpBarserD = T01909_n13725StpBarserD[0] ;
         A13726StpClicod = T01909_A13726StpClicod[0] ;
         n13726StpClicod = T01909_n13726StpClicod[0] ;
         A13728StpColor = T01909_A13728StpColor[0] ;
         n13728StpColor = T01909_n13728StpColor[0] ;
      }
      else
      {
         nIsDirty_1429 = (short)(1) ;
         A13728StpColor = " " ;
         n13728StpColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13728StpColor", A13728StpColor);
         nIsDirty_1429 = (short)(1) ;
         A13726StpClicod = 0 ;
         n13726StpClicod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13726StpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13726StpClicod), 6, 0));
         nIsDirty_1429 = (short)(1) ;
         A13725StpBarserD = " " ;
         n13725StpBarserD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13725StpBarserD", A13725StpBarserD);
         nIsDirty_1429 = (short)(1) ;
         A13724StpBarser = " " ;
         n13724StpBarser = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13724StpBarser", A13724StpBarser);
      }
      pr_default.close(6);
      nIsDirty_1429 = (short)(1) ;
      A13723StpHdr = GXutil.trim( GXutil.str( A10746Stp_hdr, 8, 0)) + "-" + GXutil.str( A10747Stp_r, 1, 0) + A10748Stp_p ;
      httpContext.ajax_rsp_assign_attri("", false, "A13723StpHdr", A13723StpHdr);
   }

   public void closeExtendedTableCursors1901429( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T019011 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T019011_A407EmprNom[0] ;
      n407EmprNom = T019011_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_4( String A396EmprCod ,
                         int A10746Stp_hdr ,
                         byte A10747Stp_r ,
                         String A10748Stp_p )
   {
      /* Using cursor T019013 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A13727StpCliNom = T019013_A13727StpCliNom[0] ;
         n13727StpCliNom = T019013_n13727StpCliNom[0] ;
      }
      else
      {
         A13727StpCliNom = " " ;
         n13727StpCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", A13727StpCliNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13727StpCliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_5( String A396EmprCod ,
                         int A10746Stp_hdr ,
                         byte A10747Stp_r ,
                         String A10748Stp_p )
   {
      /* Using cursor T019014 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A13724StpBarser = T019014_A13724StpBarser[0] ;
         n13724StpBarser = T019014_n13724StpBarser[0] ;
         A13725StpBarserD = T019014_A13725StpBarserD[0] ;
         n13725StpBarserD = T019014_n13725StpBarserD[0] ;
         A13726StpClicod = T019014_A13726StpClicod[0] ;
         n13726StpClicod = T019014_n13726StpClicod[0] ;
         A13728StpColor = T019014_A13728StpColor[0] ;
         n13728StpColor = T019014_n13728StpColor[0] ;
      }
      else
      {
         A13728StpColor = " " ;
         n13728StpColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13728StpColor", A13728StpColor);
         A13726StpClicod = 0 ;
         n13726StpClicod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13726StpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13726StpClicod), 6, 0));
         A13725StpBarserD = " " ;
         n13725StpBarserD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13725StpBarserD", A13725StpBarserD);
         A13724StpBarser = " " ;
         n13724StpBarser = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13724StpBarser", A13724StpBarser);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13724StpBarser))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13725StpBarserD))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13728StpColor))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1901429( )
   {
      /* Using cursor T019015 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1429 = (short)(1) ;
      }
      else
      {
         RcdFound1429 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01905 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1901429( 2) ;
         RcdFound1429 = (short)(1) ;
         A10746Stp_hdr = T01905_A10746Stp_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = T01905_A10747Stp_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = T01905_A10748Stp_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         A10749Stp_ultL = T01905_A10749Stp_ultL[0] ;
         n10749Stp_ultL = T01905_n10749Stp_ultL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10749Stp_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10749Stp_ultL), 4, 0));
         A396EmprCod = T01905_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z10746Stp_hdr = A10746Stp_hdr ;
         Z10747Stp_r = A10747Stp_r ;
         Z10748Stp_p = A10748Stp_p ;
         sMode1429 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1901429( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1429 = (short)(0) ;
            initializeNonKey1901429( ) ;
         }
         Gx_mode = sMode1429 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1429 = (short)(0) ;
         initializeNonKey1901429( ) ;
         sMode1429 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1429 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1901429( ) ;
      if ( RcdFound1429 == 0 )
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
      RcdFound1429 = (short)(0) ;
      /* Using cursor T019016 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Integer.valueOf(A10746Stp_hdr), A396EmprCod, Byte.valueOf(A10747Stp_r), Byte.valueOf(A10747Stp_r), Integer.valueOf(A10746Stp_hdr), A396EmprCod, A10748Stp_p});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019016_A10746Stp_hdr[0] < A10746Stp_hdr ) || ( T019016_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019016_A10747Stp_r[0] < A10747Stp_r ) || ( T019016_A10747Stp_r[0] == A10747Stp_r ) && ( T019016_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019016_A10748Stp_p[0], A10748Stp_p) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019016_A10746Stp_hdr[0] > A10746Stp_hdr ) || ( T019016_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019016_A10747Stp_r[0] > A10747Stp_r ) || ( T019016_A10747Stp_r[0] == A10747Stp_r ) && ( T019016_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019016_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019016_A10748Stp_p[0], A10748Stp_p) > 0 ) ) )
         {
            A396EmprCod = T019016_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10746Stp_hdr = T019016_A10746Stp_hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = T019016_A10747Stp_r[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = T019016_A10748Stp_p[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
            RcdFound1429 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1429 = (short)(0) ;
      /* Using cursor T019017 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Integer.valueOf(A10746Stp_hdr), A396EmprCod, Byte.valueOf(A10747Stp_r), Byte.valueOf(A10747Stp_r), Integer.valueOf(A10746Stp_hdr), A396EmprCod, A10748Stp_p});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019017_A10746Stp_hdr[0] > A10746Stp_hdr ) || ( T019017_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019017_A10747Stp_r[0] > A10747Stp_r ) || ( T019017_A10747Stp_r[0] == A10747Stp_r ) && ( T019017_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019017_A10748Stp_p[0], A10748Stp_p) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019017_A10746Stp_hdr[0] < A10746Stp_hdr ) || ( T019017_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) == 0 ) && ( T019017_A10747Stp_r[0] < A10747Stp_r ) || ( T019017_A10747Stp_r[0] == A10747Stp_r ) && ( T019017_A10746Stp_hdr[0] == A10746Stp_hdr ) && ( GXutil.strcmp(T019017_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T019017_A10748Stp_p[0], A10748Stp_p) < 0 ) ) )
         {
            A396EmprCod = T019017_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10746Stp_hdr = T019017_A10746Stp_hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = T019017_A10747Stp_r[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = T019017_A10748Stp_p[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
            RcdFound1429 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1901429( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1901429( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1429 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A10746Stp_hdr = Z10746Stp_hdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
               A10747Stp_r = Z10747Stp_r ;
               httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
               A10748Stp_p = Z10748Stp_p ;
               httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1901429( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1901429( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1901429( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = Z10746Stp_hdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = Z10747Stp_r ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = Z10748Stp_p ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1901429( ) ;
      if ( RcdFound1429 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10746Stp_hdr = Z10746Stp_hdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
            A10747Stp_r = Z10747Stp_r ;
            httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
            A10748Stp_p = Z10748Stp_p ;
            httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10746Stp_hdr != Z10746Stp_hdr ) || ( A10747Stp_r != Z10747Stp_r ) || ( GXutil.strcmp(A10748Stp_p, Z10748Stp_p) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thdstop");
      GX_FocusControl = edtStp_ultL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1900( ) ;
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
      if ( RcdFound1429 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtStp_ultL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1901429( ) ;
      if ( RcdFound1429 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_ultL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1901429( ) ;
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
      if ( RcdFound1429 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_ultL_Internalname ;
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
      if ( RcdFound1429 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_ultL_Internalname ;
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
      scanStart1901429( ) ;
      if ( RcdFound1429 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1429 != 0 )
         {
            scanNext1901429( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtStp_ultL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1901429( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1901429( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01904 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDSTOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10749Stp_ultL != T01904_A10749Stp_ultL[0] ) )
         {
            if ( Z10749Stp_ultL != T01904_A10749Stp_ultL[0] )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_ultL");
               GXutil.writeLogRaw("Old: ",Z10749Stp_ultL);
               GXutil.writeLogRaw("Current: ",T01904_A10749Stp_ultL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDSTOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1901429( )
   {
      beforeValidate1901429( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1901429( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1901429( 0) ;
         checkOptimisticConcurrency1901429( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1901429( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1901429( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019018 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Boolean.valueOf(n10749Stp_ultL), Short.valueOf(A10749Stp_ultL), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTOP");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1901429( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1900( ) ;
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
            load1901429( ) ;
         }
         endLevel1901429( ) ;
      }
      closeExtendedTableCursors1901429( ) ;
   }

   public void update1901429( )
   {
      beforeValidate1901429( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1901429( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1901429( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1901429( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1901429( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019019 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n10749Stp_ultL), Short.valueOf(A10749Stp_ultL), A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTOP");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDSTOP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1901429( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1901429( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1900( ) ;
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
         endLevel1901429( ) ;
      }
      closeExtendedTableCursors1901429( ) ;
   }

   public void deferredUpdate1901429( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1901429( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1901429( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1901429( ) ;
         afterConfirm1901429( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1901429( ) ;
            if ( AnyError == 0 )
            {
               scanStart1901430( ) ;
               while ( RcdFound1430 != 0 )
               {
                  getByPrimaryKey1901430( ) ;
                  delete1901430( ) ;
                  scanNext1901430( ) ;
               }
               scanEnd1901430( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019020 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTOP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1429 == 0 )
                        {
                           initAll1901429( ) ;
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
                        resetCaption1900( ) ;
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
      sMode1429 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1901429( ) ;
      Gx_mode = sMode1429 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1901429( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T019021 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T019021_A407EmprNom[0] ;
         n407EmprNom = T019021_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T019023 */
         pr_default.execute(18, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, A396EmprCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            A13727StpCliNom = T019023_A13727StpCliNom[0] ;
            n13727StpCliNom = T019023_n13727StpCliNom[0] ;
         }
         else
         {
            A13727StpCliNom = " " ;
            n13727StpCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", A13727StpCliNom);
         }
         pr_default.close(18);
         /* Using cursor T019024 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A13724StpBarser = T019024_A13724StpBarser[0] ;
            n13724StpBarser = T019024_n13724StpBarser[0] ;
            A13725StpBarserD = T019024_A13725StpBarserD[0] ;
            n13725StpBarserD = T019024_n13725StpBarserD[0] ;
            A13726StpClicod = T019024_A13726StpClicod[0] ;
            n13726StpClicod = T019024_n13726StpClicod[0] ;
            A13728StpColor = T019024_A13728StpColor[0] ;
            n13728StpColor = T019024_n13728StpColor[0] ;
         }
         else
         {
            A13728StpColor = " " ;
            n13728StpColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13728StpColor", A13728StpColor);
            A13726StpClicod = 0 ;
            n13726StpClicod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13726StpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13726StpClicod), 6, 0));
            A13725StpBarserD = " " ;
            n13725StpBarserD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13725StpBarserD", A13725StpBarserD);
            A13724StpBarser = " " ;
            n13724StpBarser = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13724StpBarser", A13724StpBarser);
         }
         pr_default.close(19);
         A13723StpHdr = GXutil.trim( GXutil.str( A10746Stp_hdr, 8, 0)) + "-" + GXutil.str( A10747Stp_r, 1, 0) + A10748Stp_p ;
         httpContext.ajax_rsp_assign_attri("", false, "A13723StpHdr", A13723StpHdr);
      }
   }

   public void processNestedLevel1901430( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1901430( ) ;
         if ( ( nRcdExists_1430 != 0 ) || ( nIsMod_1430 != 0 ) )
         {
            standaloneNotModal1901430( ) ;
            getKey1901430( ) ;
            if ( ( nRcdExists_1430 == 0 ) && ( nRcdDeleted_1430 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1901430( ) ;
            }
            else
            {
               if ( RcdFound1430 != 0 )
               {
                  if ( ( nRcdDeleted_1430 != 0 ) && ( nRcdExists_1430 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1901430( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1430 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1901430( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1430 == 0 )
                  {
                     GXCCtl = "STP_LIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtStp_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1430_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtStp_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtStp_Dia_Internalname, localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtStp_Mot_Internalname, A10752Stp_Mot) ;
         httpContext.changePostValue( edtStp_Term_Internalname, GXutil.rtrim( A10753Stp_Term)) ;
         httpContext.changePostValue( edtStp_Usu_Internalname, GXutil.rtrim( A10754Stp_Usu)) ;
         httpContext.changePostValue( edtStp_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtStp_DiaA_Internalname, localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtStp_MotA_Internalname, A10757Stp_MotA) ;
         httpContext.changePostValue( edtStp_UsuAct_Internalname, GXutil.rtrim( A11688Stp_UsuAct)) ;
         httpContext.changePostValue( edtStp_TermAc_Internalname, GXutil.rtrim( A11689Stp_TermAc)) ;
         httpContext.changePostValue( "ZT_"+"Z10750Stp_Lin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10751Stp_Dia_"+sGXsfl_50_idx, localUtil.ttoc( Z10751Stp_Dia, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10752Stp_Mot_"+sGXsfl_50_idx, Z10752Stp_Mot) ;
         httpContext.changePostValue( "ZT_"+"Z10753Stp_Term_"+sGXsfl_50_idx, GXutil.rtrim( Z10753Stp_Term)) ;
         httpContext.changePostValue( "ZT_"+"Z10754Stp_Usu_"+sGXsfl_50_idx, GXutil.rtrim( Z10754Stp_Usu)) ;
         httpContext.changePostValue( "ZT_"+"Z10755Stp_Est_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10756Stp_DiaA_"+sGXsfl_50_idx, localUtil.ttoc( Z10756Stp_DiaA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10757Stp_MotA_"+sGXsfl_50_idx, Z10757Stp_MotA) ;
         httpContext.changePostValue( "ZT_"+"Z11688Stp_UsuAct_"+sGXsfl_50_idx, GXutil.rtrim( Z11688Stp_UsuAct)) ;
         httpContext.changePostValue( "ZT_"+"Z11689Stp_TermAc_"+sGXsfl_50_idx, GXutil.rtrim( Z11689Stp_TermAc)) ;
         httpContext.changePostValue( "nRcdDeleted_1430_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1430_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1430_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1430 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1430_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1430_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_DIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Dia_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_MOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Mot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_TERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Term_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_USU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_EST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Est_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_DIAA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_DiaA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_MOTA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_MotA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_USUACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_UsuAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "STP_TERMAC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_TermAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1901430( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1430 = (short)(0) ;
      nIsMod_1430 = (short)(0) ;
      nRcdDeleted_1430 = (short)(0) ;
   }

   public void processLevel1901429( )
   {
      /* Save parent mode. */
      sMode1429 = Gx_mode ;
      processNestedLevel1901430( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1429 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1901429( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1901429( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdstop");
         if ( AnyError == 0 )
         {
            confirmValues1900( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdstop");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1901429( )
   {
      /* Using cursor T019025 */
      pr_default.execute(20);
      RcdFound1429 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1429 = (short)(1) ;
         A396EmprCod = T019025_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = T019025_A10746Stp_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = T019025_A10747Stp_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = T019025_A10748Stp_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1901429( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1429 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1429 = (short)(1) ;
         A396EmprCod = T019025_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10746Stp_hdr = T019025_A10746Stp_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
         A10747Stp_r = T019025_A10747Stp_r[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
         A10748Stp_p = T019025_A10748Stp_p[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
      }
   }

   public void scanEnd1901429( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1901429( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1901429( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1901429( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1901429( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1901429( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1901429( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1901429( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtStp_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_hdr_Enabled), 5, 0), true);
      edtStp_r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_r_Enabled), 5, 0), true);
      edtStp_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_p_Enabled), 5, 0), true);
      edtStp_ultL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_ultL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_ultL_Enabled), 5, 0), true);
   }

   public void zm1901430( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10751Stp_Dia = T01903_A10751Stp_Dia[0] ;
            Z10752Stp_Mot = T01903_A10752Stp_Mot[0] ;
            Z10753Stp_Term = T01903_A10753Stp_Term[0] ;
            Z10754Stp_Usu = T01903_A10754Stp_Usu[0] ;
            Z10755Stp_Est = T01903_A10755Stp_Est[0] ;
            Z10756Stp_DiaA = T01903_A10756Stp_DiaA[0] ;
            Z10757Stp_MotA = T01903_A10757Stp_MotA[0] ;
            Z11688Stp_UsuAct = T01903_A11688Stp_UsuAct[0] ;
            Z11689Stp_TermAc = T01903_A11689Stp_TermAc[0] ;
         }
         else
         {
            Z10751Stp_Dia = A10751Stp_Dia ;
            Z10752Stp_Mot = A10752Stp_Mot ;
            Z10753Stp_Term = A10753Stp_Term ;
            Z10754Stp_Usu = A10754Stp_Usu ;
            Z10755Stp_Est = A10755Stp_Est ;
            Z10756Stp_DiaA = A10756Stp_DiaA ;
            Z10757Stp_MotA = A10757Stp_MotA ;
            Z11688Stp_UsuAct = A11688Stp_UsuAct ;
            Z11689Stp_TermAc = A11689Stp_TermAc ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10746Stp_hdr = A10746Stp_hdr ;
         Z10747Stp_r = A10747Stp_r ;
         Z10748Stp_p = A10748Stp_p ;
         Z10750Stp_Lin = A10750Stp_Lin ;
         Z10751Stp_Dia = A10751Stp_Dia ;
         Z10752Stp_Mot = A10752Stp_Mot ;
         Z10753Stp_Term = A10753Stp_Term ;
         Z10754Stp_Usu = A10754Stp_Usu ;
         Z10755Stp_Est = A10755Stp_Est ;
         Z10756Stp_DiaA = A10756Stp_DiaA ;
         Z10757Stp_MotA = A10757Stp_MotA ;
         Z11688Stp_UsuAct = A11688Stp_UsuAct ;
         Z11689Stp_TermAc = A11689Stp_TermAc ;
      }
   }

   public void standaloneNotModal1901430( )
   {
   }

   public void standaloneModal1901430( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtStp_Lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtStp_Lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1901430( )
   {
      /* Using cursor T019026 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1430 = (short)(1) ;
         A10751Stp_Dia = T019026_A10751Stp_Dia[0] ;
         A10752Stp_Mot = T019026_A10752Stp_Mot[0] ;
         A10753Stp_Term = T019026_A10753Stp_Term[0] ;
         A10754Stp_Usu = T019026_A10754Stp_Usu[0] ;
         A10755Stp_Est = T019026_A10755Stp_Est[0] ;
         A10756Stp_DiaA = T019026_A10756Stp_DiaA[0] ;
         A10757Stp_MotA = T019026_A10757Stp_MotA[0] ;
         A11688Stp_UsuAct = T019026_A11688Stp_UsuAct[0] ;
         A11689Stp_TermAc = T019026_A11689Stp_TermAc[0] ;
         zm1901430( -6) ;
      }
      pr_default.close(21);
      onLoadActions1901430( ) ;
   }

   public void onLoadActions1901430( )
   {
   }

   public void checkExtendedTable1901430( )
   {
      nIsDirty_1430 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1901430( ) ;
   }

   public void closeExtendedTableCursors1901430( )
   {
   }

   public void enableDisable1901430( )
   {
   }

   public void getKey1901430( )
   {
      /* Using cursor T019027 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1430 = (short)(1) ;
      }
      else
      {
         RcdFound1430 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1901430( )
   {
      /* Using cursor T01903 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1901430( 6) ;
         RcdFound1430 = (short)(1) ;
         initializeNonKey1901430( ) ;
         A10750Stp_Lin = T01903_A10750Stp_Lin[0] ;
         A10751Stp_Dia = T01903_A10751Stp_Dia[0] ;
         A10752Stp_Mot = T01903_A10752Stp_Mot[0] ;
         A10753Stp_Term = T01903_A10753Stp_Term[0] ;
         A10754Stp_Usu = T01903_A10754Stp_Usu[0] ;
         A10755Stp_Est = T01903_A10755Stp_Est[0] ;
         A10756Stp_DiaA = T01903_A10756Stp_DiaA[0] ;
         A10757Stp_MotA = T01903_A10757Stp_MotA[0] ;
         A11688Stp_UsuAct = T01903_A11688Stp_UsuAct[0] ;
         A11689Stp_TermAc = T01903_A11689Stp_TermAc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10746Stp_hdr = A10746Stp_hdr ;
         Z10747Stp_r = A10747Stp_r ;
         Z10748Stp_p = A10748Stp_p ;
         Z10750Stp_Lin = A10750Stp_Lin ;
         sMode1430 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1901430( ) ;
         load1901430( ) ;
         Gx_mode = sMode1430 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1430 = (short)(0) ;
         initializeNonKey1901430( ) ;
         sMode1430 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1901430( ) ;
         Gx_mode = sMode1430 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1901430( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1901430( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01902 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDSTO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z10751Stp_Dia, T01902_A10751Stp_Dia[0]) ) || ( GXutil.strcmp(Z10752Stp_Mot, T01902_A10752Stp_Mot[0]) != 0 ) || ( GXutil.strcmp(Z10753Stp_Term, T01902_A10753Stp_Term[0]) != 0 ) || ( GXutil.strcmp(Z10754Stp_Usu, T01902_A10754Stp_Usu[0]) != 0 ) || ( Z10755Stp_Est != T01902_A10755Stp_Est[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10756Stp_DiaA, T01902_A10756Stp_DiaA[0]) ) || ( GXutil.strcmp(Z10757Stp_MotA, T01902_A10757Stp_MotA[0]) != 0 ) || ( GXutil.strcmp(Z11688Stp_UsuAct, T01902_A11688Stp_UsuAct[0]) != 0 ) || ( GXutil.strcmp(Z11689Stp_TermAc, T01902_A11689Stp_TermAc[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z10751Stp_Dia, T01902_A10751Stp_Dia[0]) ) )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_Dia");
               GXutil.writeLogRaw("Old: ",Z10751Stp_Dia);
               GXutil.writeLogRaw("Current: ",T01902_A10751Stp_Dia[0]);
            }
            if ( GXutil.strcmp(Z10752Stp_Mot, T01902_A10752Stp_Mot[0]) != 0 )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_Mot");
               GXutil.writeLogRaw("Old: ",Z10752Stp_Mot);
               GXutil.writeLogRaw("Current: ",T01902_A10752Stp_Mot[0]);
            }
            if ( GXutil.strcmp(Z10753Stp_Term, T01902_A10753Stp_Term[0]) != 0 )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_Term");
               GXutil.writeLogRaw("Old: ",Z10753Stp_Term);
               GXutil.writeLogRaw("Current: ",T01902_A10753Stp_Term[0]);
            }
            if ( GXutil.strcmp(Z10754Stp_Usu, T01902_A10754Stp_Usu[0]) != 0 )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_Usu");
               GXutil.writeLogRaw("Old: ",Z10754Stp_Usu);
               GXutil.writeLogRaw("Current: ",T01902_A10754Stp_Usu[0]);
            }
            if ( Z10755Stp_Est != T01902_A10755Stp_Est[0] )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_Est");
               GXutil.writeLogRaw("Old: ",Z10755Stp_Est);
               GXutil.writeLogRaw("Current: ",T01902_A10755Stp_Est[0]);
            }
            if ( !( GXutil.dateCompare(Z10756Stp_DiaA, T01902_A10756Stp_DiaA[0]) ) )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_DiaA");
               GXutil.writeLogRaw("Old: ",Z10756Stp_DiaA);
               GXutil.writeLogRaw("Current: ",T01902_A10756Stp_DiaA[0]);
            }
            if ( GXutil.strcmp(Z10757Stp_MotA, T01902_A10757Stp_MotA[0]) != 0 )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_MotA");
               GXutil.writeLogRaw("Old: ",Z10757Stp_MotA);
               GXutil.writeLogRaw("Current: ",T01902_A10757Stp_MotA[0]);
            }
            if ( GXutil.strcmp(Z11688Stp_UsuAct, T01902_A11688Stp_UsuAct[0]) != 0 )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_UsuAct");
               GXutil.writeLogRaw("Old: ",Z11688Stp_UsuAct);
               GXutil.writeLogRaw("Current: ",T01902_A11688Stp_UsuAct[0]);
            }
            if ( GXutil.strcmp(Z11689Stp_TermAc, T01902_A11689Stp_TermAc[0]) != 0 )
            {
               GXutil.writeLogln("thdstop:[seudo value changed for attri]"+"Stp_TermAc");
               GXutil.writeLogRaw("Old: ",Z11689Stp_TermAc);
               GXutil.writeLogRaw("Current: ",T01902_A11689Stp_TermAc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDSTO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1901430( )
   {
      beforeValidate1901430( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1901430( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1901430( 0) ;
         checkOptimisticConcurrency1901430( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1901430( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1901430( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019028 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin), A10751Stp_Dia, A10752Stp_Mot, A10753Stp_Term, A10754Stp_Usu, Byte.valueOf(A10755Stp_Est), A10756Stp_DiaA, A10757Stp_MotA, A11688Stp_UsuAct, A11689Stp_TermAc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
                  if ( (pr_default.getStatus(23) == 1) )
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
            load1901430( ) ;
         }
         endLevel1901430( ) ;
      }
      closeExtendedTableCursors1901430( ) ;
   }

   public void update1901430( )
   {
      beforeValidate1901430( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1901430( ) ;
      }
      if ( ( nIsMod_1430 != 0 ) || ( nIsDirty_1430 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1901430( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1901430( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1901430( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T019029 */
                     pr_default.execute(24, new Object[] {A10751Stp_Dia, A10752Stp_Mot, A10753Stp_Term, A10754Stp_Usu, Byte.valueOf(A10755Stp_Est), A10756Stp_DiaA, A10757Stp_MotA, A11688Stp_UsuAct, A11689Stp_TermAc, A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDSTO1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1901430( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1901430( ) ;
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
            endLevel1901430( ) ;
         }
      }
      closeExtendedTableCursors1901430( ) ;
   }

   public void deferredUpdate1901430( )
   {
   }

   public void delete1901430( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1901430( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1901430( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1901430( ) ;
         afterConfirm1901430( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1901430( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019030 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
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
      sMode1430 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1901430( ) ;
      Gx_mode = sMode1430 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1901430( )
   {
      standaloneModal1901430( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1901430( )
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

   public void scanStart1901430( )
   {
      /* Scan By routine */
      /* Using cursor T019031 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      RcdFound1430 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1430 = (short)(1) ;
         A10750Stp_Lin = T019031_A10750Stp_Lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1901430( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1430 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1430 = (short)(1) ;
         A10750Stp_Lin = T019031_A10750Stp_Lin[0] ;
      }
   }

   public void scanEnd1901430( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1901430( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1901430( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1901430( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1901430( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1901430( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1901430( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1901430( )
   {
      edtStp_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Dia_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_Mot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Mot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Mot_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_Term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Term_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_Usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Usu_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Est_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_DiaA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_DiaA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_DiaA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_MotA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_MotA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_MotA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_UsuAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_UsuAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_UsuAct_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtStp_TermAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_TermAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_TermAc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1901430( )
   {
   }

   public void send_integrity_lvl_hashes1901429( )
   {
   }

   public void subsflControlProps_501430( )
   {
      edtavnRcdDeleted_1430_Internalname = "vNRCDDELETED_1430_"+sGXsfl_50_idx ;
      edtStp_Lin_Internalname = "STP_LIN_"+sGXsfl_50_idx ;
      edtStp_Dia_Internalname = "STP_DIA_"+sGXsfl_50_idx ;
      edtStp_Mot_Internalname = "STP_MOT_"+sGXsfl_50_idx ;
      edtStp_Term_Internalname = "STP_TERM_"+sGXsfl_50_idx ;
      edtStp_Usu_Internalname = "STP_USU_"+sGXsfl_50_idx ;
      edtStp_Est_Internalname = "STP_EST_"+sGXsfl_50_idx ;
      edtStp_DiaA_Internalname = "STP_DIAA_"+sGXsfl_50_idx ;
      edtStp_MotA_Internalname = "STP_MOTA_"+sGXsfl_50_idx ;
      edtStp_UsuAct_Internalname = "STP_USUACT_"+sGXsfl_50_idx ;
      edtStp_TermAc_Internalname = "STP_TERMAC_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501430( )
   {
      edtavnRcdDeleted_1430_Internalname = "vNRCDDELETED_1430_"+sGXsfl_50_fel_idx ;
      edtStp_Lin_Internalname = "STP_LIN_"+sGXsfl_50_fel_idx ;
      edtStp_Dia_Internalname = "STP_DIA_"+sGXsfl_50_fel_idx ;
      edtStp_Mot_Internalname = "STP_MOT_"+sGXsfl_50_fel_idx ;
      edtStp_Term_Internalname = "STP_TERM_"+sGXsfl_50_fel_idx ;
      edtStp_Usu_Internalname = "STP_USU_"+sGXsfl_50_fel_idx ;
      edtStp_Est_Internalname = "STP_EST_"+sGXsfl_50_fel_idx ;
      edtStp_DiaA_Internalname = "STP_DIAA_"+sGXsfl_50_fel_idx ;
      edtStp_MotA_Internalname = "STP_MOTA_"+sGXsfl_50_fel_idx ;
      edtStp_UsuAct_Internalname = "STP_USUACT_"+sGXsfl_50_fel_idx ;
      edtStp_TermAc_Internalname = "STP_TERMAC_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1901430( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501430( ) ;
      sendRow1901430( ) ;
   }

   public void sendRow1901430( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1430_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1430_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1430), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1430), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1430_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1430_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10750Stp_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_Lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Dia_Internalname,localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10751Stp_Dia, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_Dia_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Mot_Internalname,A10752Stp_Mot,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Mot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_Mot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Term_Internalname,GXutil.rtrim( A10753Stp_Term),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Term_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_Term_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Usu_Internalname,GXutil.rtrim( A10754Stp_Usu),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Usu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_Usu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Est_Internalname,GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtStp_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10755Stp_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A10755Stp_Est), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Est_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_Est_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_DiaA_Internalname,localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10756Stp_DiaA, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_DiaA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_DiaA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_MotA_Internalname,A10757Stp_MotA,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_MotA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_MotA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_UsuAct_Internalname,GXutil.rtrim( A11688Stp_UsuAct),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_UsuAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_UsuAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1430_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_TermAc_Internalname,GXutil.rtrim( A11689Stp_TermAc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_TermAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtStp_TermAc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1901430( ) ;
      GXCCtl = "Z10750Stp_Lin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10751Stp_Dia_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10751Stp_Dia, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10752Stp_Mot_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10752Stp_Mot);
      GXCCtl = "Z10753Stp_Term_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10753Stp_Term));
      GXCCtl = "Z10754Stp_Usu_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10754Stp_Usu));
      GXCCtl = "Z10755Stp_Est_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10756Stp_DiaA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10756Stp_DiaA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10757Stp_MotA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10757Stp_MotA);
      GXCCtl = "Z11688Stp_UsuAct_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11688Stp_UsuAct));
      GXCCtl = "Z11689Stp_TermAc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11689Stp_TermAc));
      GXCCtl = "nRcdDeleted_1430_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1430_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1430_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1430, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1430_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1430_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_DIA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Dia_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_MOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Mot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_TERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Term_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_USU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_EST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Est_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_DIAA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_DiaA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_MOTA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_MotA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_USUACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_UsuAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STP_TERMAC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_TermAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1901430( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501430( ) ;
      edtavnRcdDeleted_1430_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1430_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_LIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_Dia_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_DIA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_Mot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_MOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_Term_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_TERM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_Usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_USU_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_Est_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_EST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_DiaA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_DIAA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_MotA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_MOTA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_UsuAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_USUACT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtStp_TermAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "STP_TERMAC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1430_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1430_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1430");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1430_Internalname ;
         wbErr = true ;
         nRcdDeleted_1430 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1430 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1430_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "STP_LIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtStp_Lin_Internalname ;
         wbErr = true ;
         A10750Stp_Lin = (short)(0) ;
      }
      else
      {
         A10750Stp_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtStp_Dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "STP_DIA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtStp_Dia_Internalname ;
         wbErr = true ;
         A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( edtStp_Dia_Internalname)) ;
      }
      A10752Stp_Mot = httpContext.cgiGet( edtStp_Mot_Internalname) ;
      A10753Stp_Term = httpContext.cgiGet( edtStp_Term_Internalname) ;
      A10754Stp_Usu = httpContext.cgiGet( edtStp_Usu_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtStp_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "STP_EST_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtStp_Est_Internalname ;
         wbErr = true ;
         A10755Stp_Est = (byte)(0) ;
      }
      else
      {
         A10755Stp_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtStp_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtStp_DiaA_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "STP_DIAA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtStp_DiaA_Internalname ;
         wbErr = true ;
         A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A10756Stp_DiaA = localUtil.ctot( httpContext.cgiGet( edtStp_DiaA_Internalname)) ;
      }
      A10757Stp_MotA = httpContext.cgiGet( edtStp_MotA_Internalname) ;
      A11688Stp_UsuAct = httpContext.cgiGet( edtStp_UsuAct_Internalname) ;
      A11689Stp_TermAc = httpContext.cgiGet( edtStp_TermAc_Internalname) ;
      GXCCtl = "Z10750Stp_Lin_" + sGXsfl_50_idx ;
      Z10750Stp_Lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10751Stp_Dia_" + sGXsfl_50_idx ;
      Z10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10752Stp_Mot_" + sGXsfl_50_idx ;
      Z10752Stp_Mot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10753Stp_Term_" + sGXsfl_50_idx ;
      Z10753Stp_Term = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10754Stp_Usu_" + sGXsfl_50_idx ;
      Z10754Stp_Usu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10755Stp_Est_" + sGXsfl_50_idx ;
      Z10755Stp_Est = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10756Stp_DiaA_" + sGXsfl_50_idx ;
      Z10756Stp_DiaA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10757Stp_MotA_" + sGXsfl_50_idx ;
      Z10757Stp_MotA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11688Stp_UsuAct_" + sGXsfl_50_idx ;
      Z11688Stp_UsuAct = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11689Stp_TermAc_" + sGXsfl_50_idx ;
      Z11689Stp_TermAc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1430_" + sGXsfl_50_idx ;
      nRcdDeleted_1430 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1430_" + sGXsfl_50_idx ;
      nRcdExists_1430 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1430_" + sGXsfl_50_idx ;
      nIsMod_1430 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtStp_Lin_Enabled = edtStp_Lin_Enabled ;
   }

   public void confirmValues1900( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501430( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501430( ) ;
         httpContext.changePostValue( "Z10750Stp_Lin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10750Stp_Lin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10750Stp_Lin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10751Stp_Dia_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10751Stp_Dia_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10751Stp_Dia_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10752Stp_Mot_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10752Stp_Mot_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10752Stp_Mot_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10753Stp_Term_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10753Stp_Term_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10753Stp_Term_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10754Stp_Usu_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10754Stp_Usu_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10754Stp_Usu_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10755Stp_Est_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10755Stp_Est_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10755Stp_Est_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10756Stp_DiaA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10756Stp_DiaA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10756Stp_DiaA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10757Stp_MotA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10757Stp_MotA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10757Stp_MotA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11688Stp_UsuAct_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11688Stp_UsuAct_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11688Stp_UsuAct_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11689Stp_TermAc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11689Stp_TermAc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11689Stp_TermAc_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thdstop", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10746Stp_hdr", GXutil.ltrim( localUtil.ntoc( Z10746Stp_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10747Stp_r", GXutil.ltrim( localUtil.ntoc( Z10747Stp_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10748Stp_p", GXutil.rtrim( Z10748Stp_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10749Stp_ultL", GXutil.ltrim( localUtil.ntoc( Z10749Stp_ultL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STPHDR", GXutil.rtrim( A13723StpHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "STPCLINOM", GXutil.rtrim( A13727StpCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "STPBARSER", GXutil.rtrim( A13724StpBarser));
      app.GxWebStd.gx_hidden_field( httpContext, "STPBARSERD", GXutil.rtrim( A13725StpBarserD));
      app.GxWebStd.gx_hidden_field( httpContext, "STPCLICOD", GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "STPCOLOR", GXutil.rtrim( A13728StpColor));
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
      return formatLink("app.thdstop", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THDSTOP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "SUSPENSION HDR", "") ;
   }

   public void initializeNonKey1901429( )
   {
      A13723StpHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13723StpHdr", A13723StpHdr);
      A13724StpBarser = "" ;
      n13724StpBarser = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13724StpBarser", A13724StpBarser);
      A13725StpBarserD = "" ;
      n13725StpBarserD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13725StpBarserD", A13725StpBarserD);
      A13726StpClicod = 0 ;
      n13726StpClicod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13726StpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13726StpClicod), 6, 0));
      A13727StpCliNom = "" ;
      n13727StpCliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", A13727StpCliNom);
      A13728StpColor = "" ;
      n13728StpColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13728StpColor", A13728StpColor);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A10749Stp_ultL = (short)(0) ;
      n10749Stp_ultL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10749Stp_ultL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10749Stp_ultL), 4, 0));
      Z10749Stp_ultL = (short)(0) ;
   }

   public void initAll1901429( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A10746Stp_hdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10746Stp_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10746Stp_hdr), 8, 0));
      A10747Stp_r = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10747Stp_r", GXutil.str( A10747Stp_r, 1, 0));
      A10748Stp_p = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10748Stp_p", A10748Stp_p);
      initializeNonKey1901429( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1901430( )
   {
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10753Stp_Term = "" ;
      A10754Stp_Usu = "" ;
      A10755Stp_Est = (byte)(0) ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      A11688Stp_UsuAct = "" ;
      A11689Stp_TermAc = "" ;
      Z10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      Z10752Stp_Mot = "" ;
      Z10753Stp_Term = "" ;
      Z10754Stp_Usu = "" ;
      Z10755Stp_Est = (byte)(0) ;
      Z10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      Z10757Stp_MotA = "" ;
      Z11688Stp_UsuAct = "" ;
      Z11689Stp_TermAc = "" ;
   }

   public void initAll1901430( )
   {
      A10750Stp_Lin = (short)(0) ;
      initializeNonKey1901430( ) ;
   }

   public void standaloneModalInsert1901430( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241562791", true, true);
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
      httpContext.AddJavascriptSource("thdstop.js", "?20268241562792", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1430( )
   {
      edtStp_Lin_Enabled = defedtStp_Lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1430, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1430_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Dia_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10752Stp_Mot);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Mot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10753Stp_Term));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Term_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10754Stp_Usu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_Est_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_DiaA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10757Stp_MotA);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_MotA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11688Stp_UsuAct));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_UsuAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11689Stp_TermAc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtStp_TermAc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtStp_hdr_Internalname = "STP_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtStp_r_Internalname = "STP_R" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtStp_p_Internalname = "STP_P" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtStp_ultL_Internalname = "STP_ULTL" ;
      edtavnRcdDeleted_1430_Internalname = "vNRCDDELETED_1430" ;
      edtStp_Lin_Internalname = "STP_LIN" ;
      edtStp_Dia_Internalname = "STP_DIA" ;
      edtStp_Mot_Internalname = "STP_MOT" ;
      edtStp_Term_Internalname = "STP_TERM" ;
      edtStp_Usu_Internalname = "STP_USU" ;
      edtStp_Est_Internalname = "STP_EST" ;
      edtStp_DiaA_Internalname = "STP_DIAA" ;
      edtStp_MotA_Internalname = "STP_MOTA" ;
      edtStp_UsuAct_Internalname = "STP_USUACT" ;
      edtStp_TermAc_Internalname = "STP_TERMAC" ;
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
      Form.setCaption( httpContext.getMessage( "SUSPENSION HDR", "") );
      edtStp_TermAc_Jsonclick = "" ;
      edtStp_UsuAct_Jsonclick = "" ;
      edtStp_MotA_Jsonclick = "" ;
      edtStp_DiaA_Jsonclick = "" ;
      edtStp_Est_Jsonclick = "" ;
      edtStp_Usu_Jsonclick = "" ;
      edtStp_Term_Jsonclick = "" ;
      edtStp_Mot_Jsonclick = "" ;
      edtStp_Dia_Jsonclick = "" ;
      edtStp_Lin_Jsonclick = "" ;
      edtavnRcdDeleted_1430_Jsonclick = "" ;
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
      edtStp_TermAc_Enabled = 1 ;
      edtStp_UsuAct_Enabled = 1 ;
      edtStp_MotA_Enabled = 1 ;
      edtStp_DiaA_Enabled = 1 ;
      edtStp_Est_Enabled = 1 ;
      edtStp_Usu_Enabled = 1 ;
      edtStp_Term_Enabled = 1 ;
      edtStp_Mot_Enabled = 1 ;
      edtStp_Dia_Enabled = 1 ;
      edtStp_Lin_Enabled = 1 ;
      edtavnRcdDeleted_1430_Enabled = 1 ;
      edtStp_ultL_Jsonclick = "" ;
      edtStp_ultL_Backcolor = (int)(0xFFFFFF) ;
      edtStp_ultL_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtStp_p_Jsonclick = "" ;
      edtStp_p_Backcolor = (int)(0xFFFFFF) ;
      edtStp_p_Enabled = 1 ;
      edtStp_r_Jsonclick = "" ;
      edtStp_r_Backcolor = (int)(0xFFFFFF) ;
      edtStp_r_Enabled = 1 ;
      edtStp_hdr_Jsonclick = "" ;
      edtStp_hdr_Backcolor = (int)(0xFFFFFF) ;
      edtStp_hdr_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_501430( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1901430( ) ;
         standaloneModal1901430( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1901430( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501430( ) ;
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
      /* Using cursor T019021 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T019021_A407EmprNom[0] ;
      n407EmprNom = T019021_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T019023 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A13727StpCliNom = T019023_A13727StpCliNom[0] ;
         n13727StpCliNom = T019023_n13727StpCliNom[0] ;
      }
      else
      {
         A13727StpCliNom = " " ;
         n13727StpCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", A13727StpCliNom);
      }
      pr_default.close(18);
      /* Using cursor T019024 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A13724StpBarser = T019024_A13724StpBarser[0] ;
         n13724StpBarser = T019024_n13724StpBarser[0] ;
         A13725StpBarserD = T019024_A13725StpBarserD[0] ;
         n13725StpBarserD = T019024_n13725StpBarserD[0] ;
         A13726StpClicod = T019024_A13726StpClicod[0] ;
         n13726StpClicod = T019024_n13726StpClicod[0] ;
         A13728StpColor = T019024_A13728StpColor[0] ;
         n13728StpColor = T019024_n13728StpColor[0] ;
      }
      else
      {
         A13728StpColor = " " ;
         n13728StpColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13728StpColor", A13728StpColor);
         A13726StpClicod = 0 ;
         n13726StpClicod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13726StpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13726StpClicod), 6, 0));
         A13725StpBarserD = " " ;
         n13725StpBarserD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13725StpBarserD", A13725StpBarserD);
         A13724StpBarser = " " ;
         n13724StpBarser = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13724StpBarser", A13724StpBarser);
      }
      pr_default.close(19);
      GX_FocusControl = edtStp_ultL_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T019021 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T019021_A407EmprNom[0] ;
      n407EmprNom = T019021_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Stp_p( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T019023 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A13727StpCliNom = T019023_A13727StpCliNom[0] ;
         n13727StpCliNom = T019023_n13727StpCliNom[0] ;
      }
      else
      {
         A13727StpCliNom = " " ;
         n13727StpCliNom = false ;
      }
      pr_default.close(18);
      /* Using cursor T019024 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A13724StpBarser = T019024_A13724StpBarser[0] ;
         n13724StpBarser = T019024_n13724StpBarser[0] ;
         A13725StpBarserD = T019024_A13725StpBarserD[0] ;
         n13725StpBarserD = T019024_n13725StpBarserD[0] ;
         A13726StpClicod = T019024_A13726StpClicod[0] ;
         n13726StpClicod = T019024_n13726StpClicod[0] ;
         A13728StpColor = T019024_A13728StpColor[0] ;
         n13728StpColor = T019024_n13728StpColor[0] ;
      }
      else
      {
         A13728StpColor = " " ;
         n13728StpColor = false ;
         A13726StpClicod = 0 ;
         n13726StpClicod = false ;
         A13725StpBarserD = " " ;
         n13725StpBarserD = false ;
         A13724StpBarser = " " ;
         n13724StpBarser = false ;
      }
      pr_default.close(19);
      A13723StpHdr = GXutil.trim( GXutil.str( A10746Stp_hdr, 8, 0)) + "-" + GXutil.str( A10747Stp_r, 1, 0) + A10748Stp_p ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10749Stp_ultL", GXutil.ltrim( localUtil.ntoc( A10749Stp_ultL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13727StpCliNom", GXutil.rtrim( A13727StpCliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13724StpBarser", GXutil.rtrim( A13724StpBarser));
      httpContext.ajax_rsp_assign_attri("", false, "A13725StpBarserD", GXutil.rtrim( A13725StpBarserD));
      httpContext.ajax_rsp_assign_attri("", false, "A13726StpClicod", GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13728StpColor", GXutil.rtrim( A13728StpColor));
      httpContext.ajax_rsp_assign_attri("", false, "A13723StpHdr", GXutil.rtrim( A13723StpHdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10746Stp_hdr", GXutil.ltrim( localUtil.ntoc( Z10746Stp_hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10747Stp_r", GXutil.ltrim( localUtil.ntoc( Z10747Stp_r, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10748Stp_p", GXutil.rtrim( Z10748Stp_p));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10749Stp_ultL", GXutil.ltrim( localUtil.ntoc( Z10749Stp_ultL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13727StpCliNom", GXutil.rtrim( Z13727StpCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13724StpBarser", GXutil.rtrim( Z13724StpBarser));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13725StpBarserD", GXutil.rtrim( Z13725StpBarserD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13726StpClicod", GXutil.ltrim( localUtil.ntoc( Z13726StpClicod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13728StpColor", GXutil.rtrim( Z13728StpColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13723StpHdr", GXutil.rtrim( Z13723StpHdr));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_STP_HDR","{handler:'valid_Stp_hdr',iparms:[]");
      setEventMetadata("VALID_STP_HDR",",oparms:[]}");
      setEventMetadata("VALID_STP_R","{handler:'valid_Stp_r',iparms:[]");
      setEventMetadata("VALID_STP_R",",oparms:[]}");
      setEventMetadata("VALID_STP_P","{handler:'valid_Stp_p',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10748Stp_p',fld:'STP_P',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_STP_P",",oparms:[{av:'A10749Stp_ultL',fld:'STP_ULTL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13727StpCliNom',fld:'STPCLINOM',pic:''},{av:'A13724StpBarser',fld:'STPBARSER',pic:''},{av:'A13725StpBarserD',fld:'STPBARSERD',pic:''},{av:'A13726StpClicod',fld:'STPCLICOD',pic:'ZZZZZ9'},{av:'A13728StpColor',fld:'STPCOLOR',pic:''},{av:'A13723StpHdr',fld:'STPHDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10746Stp_hdr'},{av:'Z10747Stp_r'},{av:'Z10748Stp_p'},{av:'Z10749Stp_ultL'},{av:'Z407EmprNom'},{av:'Z13727StpCliNom'},{av:'Z13724StpBarser'},{av:'Z13725StpBarserD'},{av:'Z13726StpClicod'},{av:'Z13728StpColor'},{av:'Z13723StpHdr'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_STP_LIN","{handler:'valid_Stp_lin',iparms:[]");
      setEventMetadata("VALID_STP_LIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Stp_termac',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(19);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10748Stp_p = "" ;
      Z10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      Z10752Stp_Mot = "" ;
      Z10753Stp_Term = "" ;
      Z10754Stp_Usu = "" ;
      Z10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      Z10757Stp_MotA = "" ;
      Z11688Stp_UsuAct = "" ;
      Z11689Stp_TermAc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10748Stp_p = "" ;
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1430 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1429 = "" ;
      GXCCtl = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10753Stp_Term = "" ;
      A10754Stp_Usu = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      A11688Stp_UsuAct = "" ;
      A11689Stp_TermAc = "" ;
      Z407EmprNom = "" ;
      Z13724StpBarser = "" ;
      Z13725StpBarserD = "" ;
      Z13728StpColor = "" ;
      T019010_A129BarCod = new int[1] ;
      T019010_A132BarCodReo = new byte[1] ;
      T019010_A130BarCodPar = new String[] {""} ;
      T019010_A10746Stp_hdr = new int[1] ;
      T019010_A10747Stp_r = new byte[1] ;
      T019010_A10748Stp_p = new String[] {""} ;
      T019010_A407EmprNom = new String[] {""} ;
      T019010_n407EmprNom = new boolean[] {false} ;
      T019010_A10749Stp_ultL = new short[1] ;
      T019010_n10749Stp_ultL = new boolean[] {false} ;
      T019010_A396EmprCod = new String[] {""} ;
      T019010_A13724StpBarser = new String[] {""} ;
      T019010_n13724StpBarser = new boolean[] {false} ;
      T019010_A13725StpBarserD = new String[] {""} ;
      T019010_n13725StpBarserD = new boolean[] {false} ;
      T019010_A13726StpClicod = new int[1] ;
      T019010_n13726StpClicod = new boolean[] {false} ;
      T019010_A13728StpColor = new String[] {""} ;
      T019010_n13728StpColor = new boolean[] {false} ;
      T01908_A13727StpCliNom = new String[] {""} ;
      T01908_n13727StpCliNom = new boolean[] {false} ;
      T01906_A407EmprNom = new String[] {""} ;
      T01906_n407EmprNom = new boolean[] {false} ;
      T01909_A13724StpBarser = new String[] {""} ;
      T01909_n13724StpBarser = new boolean[] {false} ;
      T01909_A13725StpBarserD = new String[] {""} ;
      T01909_n13725StpBarserD = new boolean[] {false} ;
      T01909_A13726StpClicod = new int[1] ;
      T01909_n13726StpClicod = new boolean[] {false} ;
      T01909_A13728StpColor = new String[] {""} ;
      T01909_n13728StpColor = new boolean[] {false} ;
      T019011_A407EmprNom = new String[] {""} ;
      T019011_n407EmprNom = new boolean[] {false} ;
      T019013_A13727StpCliNom = new String[] {""} ;
      T019013_n13727StpCliNom = new boolean[] {false} ;
      T019014_A13724StpBarser = new String[] {""} ;
      T019014_n13724StpBarser = new boolean[] {false} ;
      T019014_A13725StpBarserD = new String[] {""} ;
      T019014_n13725StpBarserD = new boolean[] {false} ;
      T019014_A13726StpClicod = new int[1] ;
      T019014_n13726StpClicod = new boolean[] {false} ;
      T019014_A13728StpColor = new String[] {""} ;
      T019014_n13728StpColor = new boolean[] {false} ;
      T019015_A396EmprCod = new String[] {""} ;
      T019015_A10746Stp_hdr = new int[1] ;
      T019015_A10747Stp_r = new byte[1] ;
      T019015_A10748Stp_p = new String[] {""} ;
      T01905_A10746Stp_hdr = new int[1] ;
      T01905_A10747Stp_r = new byte[1] ;
      T01905_A10748Stp_p = new String[] {""} ;
      T01905_A10749Stp_ultL = new short[1] ;
      T01905_n10749Stp_ultL = new boolean[] {false} ;
      T01905_A396EmprCod = new String[] {""} ;
      T019016_A396EmprCod = new String[] {""} ;
      T019016_A10746Stp_hdr = new int[1] ;
      T019016_A10747Stp_r = new byte[1] ;
      T019016_A10748Stp_p = new String[] {""} ;
      T019017_A396EmprCod = new String[] {""} ;
      T019017_A10746Stp_hdr = new int[1] ;
      T019017_A10747Stp_r = new byte[1] ;
      T019017_A10748Stp_p = new String[] {""} ;
      T01904_A10746Stp_hdr = new int[1] ;
      T01904_A10747Stp_r = new byte[1] ;
      T01904_A10748Stp_p = new String[] {""} ;
      T01904_A10749Stp_ultL = new short[1] ;
      T01904_n10749Stp_ultL = new boolean[] {false} ;
      T01904_A396EmprCod = new String[] {""} ;
      T019021_A407EmprNom = new String[] {""} ;
      T019021_n407EmprNom = new boolean[] {false} ;
      T019023_A13727StpCliNom = new String[] {""} ;
      T019023_n13727StpCliNom = new boolean[] {false} ;
      T019024_A13724StpBarser = new String[] {""} ;
      T019024_n13724StpBarser = new boolean[] {false} ;
      T019024_A13725StpBarserD = new String[] {""} ;
      T019024_n13725StpBarserD = new boolean[] {false} ;
      T019024_A13726StpClicod = new int[1] ;
      T019024_n13726StpClicod = new boolean[] {false} ;
      T019024_A13728StpColor = new String[] {""} ;
      T019024_n13728StpColor = new boolean[] {false} ;
      T019025_A396EmprCod = new String[] {""} ;
      T019025_A10746Stp_hdr = new int[1] ;
      T019025_A10747Stp_r = new byte[1] ;
      T019025_A10748Stp_p = new String[] {""} ;
      T019026_A396EmprCod = new String[] {""} ;
      T019026_A10746Stp_hdr = new int[1] ;
      T019026_A10747Stp_r = new byte[1] ;
      T019026_A10748Stp_p = new String[] {""} ;
      T019026_A10750Stp_Lin = new short[1] ;
      T019026_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T019026_A10752Stp_Mot = new String[] {""} ;
      T019026_A10753Stp_Term = new String[] {""} ;
      T019026_A10754Stp_Usu = new String[] {""} ;
      T019026_A10755Stp_Est = new byte[1] ;
      T019026_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T019026_A10757Stp_MotA = new String[] {""} ;
      T019026_A11688Stp_UsuAct = new String[] {""} ;
      T019026_A11689Stp_TermAc = new String[] {""} ;
      T019027_A396EmprCod = new String[] {""} ;
      T019027_A10746Stp_hdr = new int[1] ;
      T019027_A10747Stp_r = new byte[1] ;
      T019027_A10748Stp_p = new String[] {""} ;
      T019027_A10750Stp_Lin = new short[1] ;
      T01903_A396EmprCod = new String[] {""} ;
      T01903_A10746Stp_hdr = new int[1] ;
      T01903_A10747Stp_r = new byte[1] ;
      T01903_A10748Stp_p = new String[] {""} ;
      T01903_A10750Stp_Lin = new short[1] ;
      T01903_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01903_A10752Stp_Mot = new String[] {""} ;
      T01903_A10753Stp_Term = new String[] {""} ;
      T01903_A10754Stp_Usu = new String[] {""} ;
      T01903_A10755Stp_Est = new byte[1] ;
      T01903_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01903_A10757Stp_MotA = new String[] {""} ;
      T01903_A11688Stp_UsuAct = new String[] {""} ;
      T01903_A11689Stp_TermAc = new String[] {""} ;
      T01902_A396EmprCod = new String[] {""} ;
      T01902_A10746Stp_hdr = new int[1] ;
      T01902_A10747Stp_r = new byte[1] ;
      T01902_A10748Stp_p = new String[] {""} ;
      T01902_A10750Stp_Lin = new short[1] ;
      T01902_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01902_A10752Stp_Mot = new String[] {""} ;
      T01902_A10753Stp_Term = new String[] {""} ;
      T01902_A10754Stp_Usu = new String[] {""} ;
      T01902_A10755Stp_Est = new byte[1] ;
      T01902_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01902_A10757Stp_MotA = new String[] {""} ;
      T01902_A11688Stp_UsuAct = new String[] {""} ;
      T01902_A11689Stp_TermAc = new String[] {""} ;
      T019031_A396EmprCod = new String[] {""} ;
      T019031_A10746Stp_hdr = new int[1] ;
      T019031_A10747Stp_r = new byte[1] ;
      T019031_A10748Stp_p = new String[] {""} ;
      T019031_A10750Stp_Lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Z13727StpCliNom = "" ;
      Z13723StpHdr = "" ;
      ZZ396EmprCod = "" ;
      ZZ10748Stp_p = "" ;
      ZZ407EmprNom = "" ;
      ZZ13727StpCliNom = "" ;
      ZZ13724StpBarser = "" ;
      ZZ13725StpBarserD = "" ;
      ZZ13728StpColor = "" ;
      ZZ13723StpHdr = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdstop__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdstop__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdstop__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdstop__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdstop__default(),
         new Object[] {
             new Object[] {
            T01902_A396EmprCod, T01902_A10746Stp_hdr, T01902_A10747Stp_r, T01902_A10748Stp_p, T01902_A10750Stp_Lin, T01902_A10751Stp_Dia, T01902_A10752Stp_Mot, T01902_A10753Stp_Term, T01902_A10754Stp_Usu, T01902_A10755Stp_Est,
            T01902_A10756Stp_DiaA, T01902_A10757Stp_MotA, T01902_A11688Stp_UsuAct, T01902_A11689Stp_TermAc
            }
            , new Object[] {
            T01903_A396EmprCod, T01903_A10746Stp_hdr, T01903_A10747Stp_r, T01903_A10748Stp_p, T01903_A10750Stp_Lin, T01903_A10751Stp_Dia, T01903_A10752Stp_Mot, T01903_A10753Stp_Term, T01903_A10754Stp_Usu, T01903_A10755Stp_Est,
            T01903_A10756Stp_DiaA, T01903_A10757Stp_MotA, T01903_A11688Stp_UsuAct, T01903_A11689Stp_TermAc
            }
            , new Object[] {
            T01904_A10746Stp_hdr, T01904_A10747Stp_r, T01904_A10748Stp_p, T01904_A10749Stp_ultL, T01904_n10749Stp_ultL, T01904_A396EmprCod
            }
            , new Object[] {
            T01905_A10746Stp_hdr, T01905_A10747Stp_r, T01905_A10748Stp_p, T01905_A10749Stp_ultL, T01905_n10749Stp_ultL, T01905_A396EmprCod
            }
            , new Object[] {
            T01906_A407EmprNom, T01906_n407EmprNom
            }
            , new Object[] {
            T01908_A13727StpCliNom, T01908_n13727StpCliNom
            }
            , new Object[] {
            T01909_A13724StpBarser, T01909_n13724StpBarser, T01909_A13725StpBarserD, T01909_n13725StpBarserD, T01909_A13726StpClicod, T01909_n13726StpClicod, T01909_A13728StpColor, T01909_n13728StpColor
            }
            , new Object[] {
            T019010_A129BarCod, T019010_A132BarCodReo, T019010_A130BarCodPar, T019010_A10746Stp_hdr, T019010_A10747Stp_r, T019010_A10748Stp_p, T019010_A407EmprNom, T019010_n407EmprNom, T019010_A10749Stp_ultL, T019010_n10749Stp_ultL,
            T019010_A396EmprCod, T019010_A13724StpBarser, T019010_n13724StpBarser, T019010_A13725StpBarserD, T019010_n13725StpBarserD, T019010_A13726StpClicod, T019010_n13726StpClicod, T019010_A13728StpColor, T019010_n13728StpColor
            }
            , new Object[] {
            T019011_A407EmprNom, T019011_n407EmprNom
            }
            , new Object[] {
            T019013_A13727StpCliNom, T019013_n13727StpCliNom
            }
            , new Object[] {
            T019014_A13724StpBarser, T019014_n13724StpBarser, T019014_A13725StpBarserD, T019014_n13725StpBarserD, T019014_A13726StpClicod, T019014_n13726StpClicod, T019014_A13728StpColor, T019014_n13728StpColor
            }
            , new Object[] {
            T019015_A396EmprCod, T019015_A10746Stp_hdr, T019015_A10747Stp_r, T019015_A10748Stp_p
            }
            , new Object[] {
            T019016_A396EmprCod, T019016_A10746Stp_hdr, T019016_A10747Stp_r, T019016_A10748Stp_p
            }
            , new Object[] {
            T019017_A396EmprCod, T019017_A10746Stp_hdr, T019017_A10747Stp_r, T019017_A10748Stp_p
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019021_A407EmprNom, T019021_n407EmprNom
            }
            , new Object[] {
            T019023_A13727StpCliNom, T019023_n13727StpCliNom
            }
            , new Object[] {
            T019024_A13724StpBarser, T019024_n13724StpBarser, T019024_A13725StpBarserD, T019024_n13725StpBarserD, T019024_A13726StpClicod, T019024_n13726StpClicod, T019024_A13728StpColor, T019024_n13728StpColor
            }
            , new Object[] {
            T019025_A396EmprCod, T019025_A10746Stp_hdr, T019025_A10747Stp_r, T019025_A10748Stp_p
            }
            , new Object[] {
            T019026_A396EmprCod, T019026_A10746Stp_hdr, T019026_A10747Stp_r, T019026_A10748Stp_p, T019026_A10750Stp_Lin, T019026_A10751Stp_Dia, T019026_A10752Stp_Mot, T019026_A10753Stp_Term, T019026_A10754Stp_Usu, T019026_A10755Stp_Est,
            T019026_A10756Stp_DiaA, T019026_A10757Stp_MotA, T019026_A11688Stp_UsuAct, T019026_A11689Stp_TermAc
            }
            , new Object[] {
            T019027_A396EmprCod, T019027_A10746Stp_hdr, T019027_A10747Stp_r, T019027_A10748Stp_p, T019027_A10750Stp_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019031_A396EmprCod, T019031_A10746Stp_hdr, T019031_A10747Stp_r, T019031_A10748Stp_p, T019031_A10750Stp_Lin
            }
         }
      );
   }

   private byte Z10747Stp_r ;
   private byte Z10755Stp_Est ;
   private byte GxWebError ;
   private byte A10747Stp_r ;
   private byte nKeyPressed ;
   private byte A10755Stp_Est ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ10747Stp_r ;
   private short Z10749Stp_ultL ;
   private short Z10750Stp_Lin ;
   private short nRcdDeleted_1430 ;
   private short nRcdExists_1430 ;
   private short nIsMod_1430 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10749Stp_ultL ;
   private short nBlankRcdCount1430 ;
   private short RcdFound1430 ;
   private short nBlankRcdUsr1430 ;
   private short A10750Stp_Lin ;
   private short RcdFound1429 ;
   private short nIsDirty_1429 ;
   private short nIsDirty_1430 ;
   private short ZZ10749Stp_ultL ;
   private int Z10746Stp_hdr ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int A10746Stp_hdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtStp_hdr_Enabled ;
   private int edtStp_r_Enabled ;
   private int edtStp_p_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtStp_ultL_Enabled ;
   private int edtavnRcdDeleted_1430_Enabled ;
   private int edtStp_Lin_Enabled ;
   private int edtStp_Dia_Enabled ;
   private int edtStp_Mot_Enabled ;
   private int edtStp_Term_Enabled ;
   private int edtStp_Usu_Enabled ;
   private int edtStp_Est_Enabled ;
   private int edtStp_DiaA_Enabled ;
   private int edtStp_MotA_Enabled ;
   private int edtStp_UsuAct_Enabled ;
   private int edtStp_TermAc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A13726StpClicod ;
   private int GX_JID ;
   private int Z13726StpClicod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtStp_Lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtStp_ultL_Backcolor ;
   private int edtStp_p_Backcolor ;
   private int edtStp_r_Backcolor ;
   private int edtStp_hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10746Stp_hdr ;
   private int ZZ13726StpClicod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10748Stp_p ;
   private String Z10753Stp_Term ;
   private String Z10754Stp_Usu ;
   private String Z11688Stp_UsuAct ;
   private String Z11689Stp_TermAc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10748Stp_p ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtStp_hdr_Internalname ;
   private String edtStp_hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtStp_r_Internalname ;
   private String edtStp_r_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtStp_p_Internalname ;
   private String edtStp_p_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtStp_ultL_Internalname ;
   private String edtStp_ultL_Jsonclick ;
   private String sMode1430 ;
   private String edtavnRcdDeleted_1430_Internalname ;
   private String edtStp_Lin_Internalname ;
   private String edtStp_Dia_Internalname ;
   private String edtStp_Mot_Internalname ;
   private String edtStp_Term_Internalname ;
   private String edtStp_Usu_Internalname ;
   private String edtStp_Est_Internalname ;
   private String edtStp_DiaA_Internalname ;
   private String edtStp_MotA_Internalname ;
   private String edtStp_UsuAct_Internalname ;
   private String edtStp_TermAc_Internalname ;
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
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1429 ;
   private String GXCCtl ;
   private String A10753Stp_Term ;
   private String A10754Stp_Usu ;
   private String A11688Stp_UsuAct ;
   private String A11689Stp_TermAc ;
   private String Z407EmprNom ;
   private String Z13724StpBarser ;
   private String Z13725StpBarserD ;
   private String Z13728StpColor ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1430_Jsonclick ;
   private String edtStp_Lin_Jsonclick ;
   private String edtStp_Dia_Jsonclick ;
   private String edtStp_Mot_Jsonclick ;
   private String edtStp_Term_Jsonclick ;
   private String edtStp_Usu_Jsonclick ;
   private String edtStp_Est_Jsonclick ;
   private String edtStp_DiaA_Jsonclick ;
   private String edtStp_MotA_Jsonclick ;
   private String edtStp_UsuAct_Jsonclick ;
   private String edtStp_TermAc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String Z13727StpCliNom ;
   private String Z13723StpHdr ;
   private String ZZ396EmprCod ;
   private String ZZ10748Stp_p ;
   private String ZZ407EmprNom ;
   private String ZZ13727StpCliNom ;
   private String ZZ13724StpBarser ;
   private String ZZ13725StpBarserD ;
   private String ZZ13728StpColor ;
   private String ZZ13723StpHdr ;
   private java.util.Date Z10751Stp_Dia ;
   private java.util.Date Z10756Stp_DiaA ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n13727StpCliNom ;
   private boolean n13724StpBarser ;
   private boolean n13725StpBarserD ;
   private boolean n13726StpClicod ;
   private boolean n13728StpColor ;
   private boolean n407EmprNom ;
   private boolean n10749Stp_ultL ;
   private boolean Gx_longc ;
   private String Z10752Stp_Mot ;
   private String Z10757Stp_MotA ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T019010_A129BarCod ;
   private byte[] T019010_A132BarCodReo ;
   private String[] T019010_A130BarCodPar ;
   private int[] T019010_A10746Stp_hdr ;
   private byte[] T019010_A10747Stp_r ;
   private String[] T019010_A10748Stp_p ;
   private String[] T019010_A407EmprNom ;
   private boolean[] T019010_n407EmprNom ;
   private short[] T019010_A10749Stp_ultL ;
   private boolean[] T019010_n10749Stp_ultL ;
   private String[] T019010_A396EmprCod ;
   private String[] T019010_A13724StpBarser ;
   private boolean[] T019010_n13724StpBarser ;
   private String[] T019010_A13725StpBarserD ;
   private boolean[] T019010_n13725StpBarserD ;
   private int[] T019010_A13726StpClicod ;
   private boolean[] T019010_n13726StpClicod ;
   private String[] T019010_A13728StpColor ;
   private boolean[] T019010_n13728StpColor ;
   private String[] T01908_A13727StpCliNom ;
   private boolean[] T01908_n13727StpCliNom ;
   private String[] T01906_A407EmprNom ;
   private boolean[] T01906_n407EmprNom ;
   private String[] T01909_A13724StpBarser ;
   private boolean[] T01909_n13724StpBarser ;
   private String[] T01909_A13725StpBarserD ;
   private boolean[] T01909_n13725StpBarserD ;
   private int[] T01909_A13726StpClicod ;
   private boolean[] T01909_n13726StpClicod ;
   private String[] T01909_A13728StpColor ;
   private boolean[] T01909_n13728StpColor ;
   private String[] T019011_A407EmprNom ;
   private boolean[] T019011_n407EmprNom ;
   private String[] T019013_A13727StpCliNom ;
   private boolean[] T019013_n13727StpCliNom ;
   private String[] T019014_A13724StpBarser ;
   private boolean[] T019014_n13724StpBarser ;
   private String[] T019014_A13725StpBarserD ;
   private boolean[] T019014_n13725StpBarserD ;
   private int[] T019014_A13726StpClicod ;
   private boolean[] T019014_n13726StpClicod ;
   private String[] T019014_A13728StpColor ;
   private boolean[] T019014_n13728StpColor ;
   private String[] T019015_A396EmprCod ;
   private int[] T019015_A10746Stp_hdr ;
   private byte[] T019015_A10747Stp_r ;
   private String[] T019015_A10748Stp_p ;
   private int[] T01905_A10746Stp_hdr ;
   private byte[] T01905_A10747Stp_r ;
   private String[] T01905_A10748Stp_p ;
   private short[] T01905_A10749Stp_ultL ;
   private boolean[] T01905_n10749Stp_ultL ;
   private String[] T01905_A396EmprCod ;
   private String[] T019016_A396EmprCod ;
   private int[] T019016_A10746Stp_hdr ;
   private byte[] T019016_A10747Stp_r ;
   private String[] T019016_A10748Stp_p ;
   private String[] T019017_A396EmprCod ;
   private int[] T019017_A10746Stp_hdr ;
   private byte[] T019017_A10747Stp_r ;
   private String[] T019017_A10748Stp_p ;
   private int[] T01904_A10746Stp_hdr ;
   private byte[] T01904_A10747Stp_r ;
   private String[] T01904_A10748Stp_p ;
   private short[] T01904_A10749Stp_ultL ;
   private boolean[] T01904_n10749Stp_ultL ;
   private String[] T01904_A396EmprCod ;
   private String[] T019021_A407EmprNom ;
   private boolean[] T019021_n407EmprNom ;
   private String[] T019023_A13727StpCliNom ;
   private boolean[] T019023_n13727StpCliNom ;
   private String[] T019024_A13724StpBarser ;
   private boolean[] T019024_n13724StpBarser ;
   private String[] T019024_A13725StpBarserD ;
   private boolean[] T019024_n13725StpBarserD ;
   private int[] T019024_A13726StpClicod ;
   private boolean[] T019024_n13726StpClicod ;
   private String[] T019024_A13728StpColor ;
   private boolean[] T019024_n13728StpColor ;
   private String[] T019025_A396EmprCod ;
   private int[] T019025_A10746Stp_hdr ;
   private byte[] T019025_A10747Stp_r ;
   private String[] T019025_A10748Stp_p ;
   private String[] T019026_A396EmprCod ;
   private int[] T019026_A10746Stp_hdr ;
   private byte[] T019026_A10747Stp_r ;
   private String[] T019026_A10748Stp_p ;
   private short[] T019026_A10750Stp_Lin ;
   private java.util.Date[] T019026_A10751Stp_Dia ;
   private String[] T019026_A10752Stp_Mot ;
   private String[] T019026_A10753Stp_Term ;
   private String[] T019026_A10754Stp_Usu ;
   private byte[] T019026_A10755Stp_Est ;
   private java.util.Date[] T019026_A10756Stp_DiaA ;
   private String[] T019026_A10757Stp_MotA ;
   private String[] T019026_A11688Stp_UsuAct ;
   private String[] T019026_A11689Stp_TermAc ;
   private String[] T019027_A396EmprCod ;
   private int[] T019027_A10746Stp_hdr ;
   private byte[] T019027_A10747Stp_r ;
   private String[] T019027_A10748Stp_p ;
   private short[] T019027_A10750Stp_Lin ;
   private String[] T01903_A396EmprCod ;
   private int[] T01903_A10746Stp_hdr ;
   private byte[] T01903_A10747Stp_r ;
   private String[] T01903_A10748Stp_p ;
   private short[] T01903_A10750Stp_Lin ;
   private java.util.Date[] T01903_A10751Stp_Dia ;
   private String[] T01903_A10752Stp_Mot ;
   private String[] T01903_A10753Stp_Term ;
   private String[] T01903_A10754Stp_Usu ;
   private byte[] T01903_A10755Stp_Est ;
   private java.util.Date[] T01903_A10756Stp_DiaA ;
   private String[] T01903_A10757Stp_MotA ;
   private String[] T01903_A11688Stp_UsuAct ;
   private String[] T01903_A11689Stp_TermAc ;
   private String[] T01902_A396EmprCod ;
   private int[] T01902_A10746Stp_hdr ;
   private byte[] T01902_A10747Stp_r ;
   private String[] T01902_A10748Stp_p ;
   private short[] T01902_A10750Stp_Lin ;
   private java.util.Date[] T01902_A10751Stp_Dia ;
   private String[] T01902_A10752Stp_Mot ;
   private String[] T01902_A10753Stp_Term ;
   private String[] T01902_A10754Stp_Usu ;
   private byte[] T01902_A10755Stp_Est ;
   private java.util.Date[] T01902_A10756Stp_DiaA ;
   private String[] T01902_A10757Stp_MotA ;
   private String[] T01902_A11688Stp_UsuAct ;
   private String[] T01902_A11689Stp_TermAc ;
   private String[] T019031_A396EmprCod ;
   private int[] T019031_A10746Stp_hdr ;
   private byte[] T019031_A10747Stp_r ;
   private String[] T019031_A10748Stp_p ;
   private short[] T019031_A10750Stp_Lin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thdstop__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdstop__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdstop__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdstop__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdstop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01902", "SELECT EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc FROM TXPHDSTO1 WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ?  FOR UPDATE OF Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01903", "SELECT EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc FROM TXPHDSTO1 WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01904", "SELECT Stp_hdr, Stp_r, Stp_p, Stp_ultL, EmprCod FROM TXPHDSTOP WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ?  FOR UPDATE OF Stp_ultL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01905", "SELECT Stp_hdr, Stp_r, Stp_p, Stp_ultL, EmprCod FROM TXPHDSTOP WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01906", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01908", "SELECT COALESCE( T1.StpCliNom, ' ') AS StpCliNom FROM (SELECT MIN(T3.CliNom) AS StpCliNom, T2.EmprCod FROM (TXPBARCAD T2 LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T2.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) GROUP BY T2.EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01909", "SELECT COALESCE( BarSer, ' ') AS StpBarser, COALESCE( BarSerDsc, ' ') AS StpBarserD, COALESCE( CliCod, 0) AS StpClicod, COALESCE( BarColNom, ' ') AS StpColor FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019010", "SELECT /*+ FIRST_ROWS(100) */ T3.BarCod, T3.BarCodReo, T3.BarCodPar, TM1.Stp_hdr, TM1.Stp_r, TM1.Stp_p, T2.EmprNom, TM1.Stp_ultL, TM1.EmprCod, COALESCE( T3.BarSer, ' ') AS StpBarser, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.CliCod, 0) AS StpClicod, COALESCE( T3.BarColNom, ' ') AS StpColor FROM ((TXPHDSTOP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.Stp_hdr AND T3.BarCodReo = TM1.Stp_r AND T3.BarCodPar = TM1.Stp_p) WHERE TM1.EmprCod = ? and TM1.Stp_hdr = ? and TM1.Stp_r = ? and TM1.Stp_p = ? ORDER BY TM1.EmprCod, TM1.Stp_hdr, TM1.Stp_r, TM1.Stp_p ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019011", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019013", "SELECT COALESCE( T1.StpCliNom, ' ') AS StpCliNom FROM (SELECT MIN(T3.CliNom) AS StpCliNom, T2.EmprCod FROM (TXPBARCAD T2 LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T2.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) GROUP BY T2.EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019014", "SELECT COALESCE( BarSer, ' ') AS StpBarser, COALESCE( BarSerDsc, ' ') AS StpBarserD, COALESCE( CliCod, 0) AS StpClicod, COALESCE( BarColNom, ' ') AS StpColor FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019015", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Stp_hdr, Stp_r, Stp_p FROM TXPHDSTOP WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019016", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Stp_hdr, Stp_r, Stp_p FROM TXPHDSTOP WHERE ( EmprCod > ? or EmprCod = ? and Stp_hdr > ? or Stp_hdr = ? and EmprCod = ? and Stp_r > ? or Stp_r = ? and Stp_hdr = ? and EmprCod = ? and Stp_p > ?) ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019017", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Stp_hdr, Stp_r, Stp_p FROM TXPHDSTOP WHERE ( EmprCod < ? or EmprCod = ? and Stp_hdr < ? or Stp_hdr = ? and EmprCod = ? and Stp_r < ? or Stp_r = ? and Stp_hdr = ? and EmprCod = ? and Stp_p < ?) ORDER BY EmprCod DESC, Stp_hdr DESC, Stp_r DESC, Stp_p DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019018", "INSERT INTO TXPHDSTOP(Stp_hdr, Stp_r, Stp_p, Stp_ultL, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDSTOP")
         ,new UpdateCursor("T019019", "UPDATE TXPHDSTOP SET Stp_ultL=?  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ?", GX_NOMASK, "TXPHDSTOP")
         ,new UpdateCursor("T019020", "DELETE FROM TXPHDSTOP  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ?", GX_NOMASK, "TXPHDSTOP")
         ,new ForEachCursor("T019021", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019023", "SELECT COALESCE( T1.StpCliNom, ' ') AS StpCliNom FROM (SELECT MIN(T3.CliNom) AS StpCliNom, T2.EmprCod FROM (TXPBARCAD T2 LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T2.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) GROUP BY T2.EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019024", "SELECT COALESCE( BarSer, ' ') AS StpBarser, COALESCE( BarSerDsc, ' ') AS StpBarserD, COALESCE( CliCod, 0) AS StpClicod, COALESCE( BarColNom, ' ') AS StpColor FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019025", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Stp_hdr, Stp_r, Stp_p FROM TXPHDSTOP ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019026", "SELECT EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc FROM TXPHDSTO1 WHERE EmprCod = ? and Stp_hdr = ? and Stp_r = ? and Stp_p = ? and Stp_Lin = ? ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019027", "SELECT EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin FROM TXPHDSTO1 WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T019028", "INSERT INTO TXPHDSTO1(EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDSTO1")
         ,new UpdateCursor("T019029", "UPDATE TXPHDSTO1 SET Stp_Dia=?, Stp_Mot=?, Stp_Term=?, Stp_Usu=?, Stp_Est=?, Stp_DiaA=?, Stp_MotA=?, Stp_UsuAct=?, Stp_TermAc=?  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ?", GX_NOMASK, "TXPHDSTO1")
         ,new UpdateCursor("T019030", "DELETE FROM TXPHDSTO1  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ? AND Stp_Lin = ?", GX_NOMASK, "TXPHDSTO1")
         ,new ForEachCursor("T019031", "SELECT EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin FROM TXPHDSTO1 WHERE EmprCod = ? and Stp_hdr = ? and Stp_r = ? and Stp_p = ? ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 11 :
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
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
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
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setVarchar(7, (String)parms[6], 300, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setDateTime(11, (java.util.Date)parms[10], false);
               stmt.setVarchar(12, (String)parms[11], 300, false);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 10);
               return;
            case 24 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setVarchar(2, (String)parms[1], 300, false);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setVarchar(7, (String)parms[6], 300, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

