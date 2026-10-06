package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpeq000_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_1NX1829( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13367PEQClicod = (int)(GXutil.lval( httpContext.GetPar( "PEQClicod"))) ;
         n13367PEQClicod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13367PEQClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13367PEQClicod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_1NX1829( A396EmprCod, A13367PEQClicod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13372PEQGrabCod = (short)(GXutil.lval( httpContext.GetPar( "PEQGrabCod"))) ;
         n13372PEQGrabCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13372PEQGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13372PEQGrabCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A13372PEQGrabCod) ;
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
            AV33PEQId = GXutil.lval( httpContext.GetPar( "PEQId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33PEQId), 10, 0));
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Orden Grabacion PEQUES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPEQId_Internalname ;
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
      nRC_GXsfl_110 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_110"))) ;
      nGXsfl_110_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_110_idx"))) ;
      sGXsfl_110_idx = httpContext.GetPar( "sGXsfl_110_idx") ;
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

   public tpeq000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpeq000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpeq000_impl.class ));
   }

   public tpeq000_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbPEQCargo = new HTMLChoice();
      cmbPEQTipo = new HTMLChoice();
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
      if ( cmbPEQCargo.getItemCount() > 0 )
      {
         A13357PEQCargo = (byte)(GXutil.lval( cmbPEQCargo.getValidValue(GXutil.trim( GXutil.str( A13357PEQCargo, 1, 0))))) ;
         n13357PEQCargo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13357PEQCargo", GXutil.str( A13357PEQCargo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPEQCargo.setValue( GXutil.trim( GXutil.str( A13357PEQCargo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPEQCargo.getInternalname(), "Values", cmbPEQCargo.ToJavascriptSource(), true);
      }
      if ( cmbPEQTipo.getItemCount() > 0 )
      {
         A13360PEQTipo = (byte)(GXutil.lval( cmbPEQTipo.getValidValue(GXutil.trim( GXutil.str( A13360PEQTipo, 2, 0))))) ;
         n13360PEQTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPEQTipo.setValue( GXutil.trim( GXutil.str( A13360PEQTipo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPEQTipo.getInternalname(), "Values", cmbPEQTipo.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPEQ000.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Orden Grabacion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQId_Internalname, GXutil.ltrim( localUtil.ntoc( A13350PEQId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13350PEQId), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQId_Jsonclick, 0, "", "", "", "", "", 1, edtPEQId_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPEQFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQFecha_Internalname, localUtil.format(A13351PEQFecha, "99/99/99"), localUtil.format( A13351PEQFecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQFecha_Jsonclick, 0, "", "", "", "", "", 1, edtPEQFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPEQFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPEQFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEQ000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPEQFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQFecEnt_Internalname, localUtil.format(A13352PEQFecEnt, "99/99/99"), localUtil.format( A13352PEQFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtPEQFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPEQFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPEQFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEQ000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Dibujo Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQDibCli_Internalname, GXutil.rtrim( A13353PEQDibCli), GXutil.rtrim( localUtil.format( A13353PEQDibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtPEQDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A13354PEQDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEQDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13354PEQDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13354PEQDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtPEQDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Referencia Grabador", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQRef_Internalname, GXutil.rtrim( A13355PEQRef), GXutil.rtrim( localUtil.format( A13355PEQRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQRef_Jsonclick, 0, "", "", "", "", "", 1, edtPEQRef_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Rapport", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQRap_Internalname, GXutil.ltrim( localUtil.ntoc( A13356PEQRap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEQRap_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13356PEQRap), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13356PEQRap), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQRap_Jsonclick, 0, "", "", "", "", "", 1, edtPEQRap_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cargo a", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPEQCargo, cmbPEQCargo.getInternalname(), GXutil.trim( GXutil.str( A13357PEQCargo, 1, 0)), 1, cmbPEQCargo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbPEQCargo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, (byte)(0), "HLP_TPEQ000.htm");
      cmbPEQCargo.setValue( GXutil.trim( GXutil.str( A13357PEQCargo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPEQCargo.getInternalname(), "Values", cmbPEQCargo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPEQObs_Internalname, A13358PEQObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtPEQObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQClicod_Internalname, GXutil.ltrim( localUtil.ntoc( A13367PEQClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13367PEQClicod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQClicod_Jsonclick, 0, "", "", "", "", "", 1, edtPEQClicod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQCliNom_Internalname, GXutil.rtrim( A13368PEQCliNom), GXutil.rtrim( localUtil.format( A13368PEQCliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtPEQCliNom_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13359PEQEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEQEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13359PEQEstado), "9") : localUtil.format( DecimalUtil.doubleToDec(A13359PEQEstado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQEstado_Jsonclick, 0, "", "", "", "", "", 1, edtPEQEstado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Tipo, 1=Peques 2=Rotura Regrabacion", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPEQTipo, cmbPEQTipo.getInternalname(), GXutil.trim( GXutil.str( A13360PEQTipo, 2, 0)), 1, cmbPEQTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbPEQTipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_TPEQ000.htm");
      cmbPEQTipo.setValue( GXutil.trim( GXutil.str( A13360PEQTipo, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPEQTipo.getInternalname(), "Values", cmbPEQTipo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Grabador", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQGrabCod_Internalname, GXutil.ltrim( localUtil.ntoc( A13372PEQGrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEQGrabCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13372PEQGrabCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13372PEQGrabCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQGrabCod_Jsonclick, 0, "", "", "", "", "", 1, edtPEQGrabCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQGrabNom_Internalname, GXutil.rtrim( A13373PEQGrabNom), GXutil.rtrim( localUtil.format( A13373PEQGrabNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQGrabNom_Jsonclick, 0, "", "", "", "", "", 1, edtPEQGrabNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Numero Colores", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEQNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A13374PEQNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEQNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13374PEQNumCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13374PEQNumCol), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEQNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtPEQNumCol_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEQ000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol110( ) ;
      nGXsfl_110_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1830 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1830 = (short)(1) ;
            scanStart1NX1830( ) ;
            while ( RcdFound1830 != 0 )
            {
               init_level_properties1830( ) ;
               getByPrimaryKey1NX1830( ) ;
               addRow1NX1830( ) ;
               scanNext1NX1830( ) ;
            }
            scanEnd1NX1830( ) ;
            nBlankRcdCount1830 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NX1830( ) ;
         standaloneModal1NX1830( ) ;
         sMode1830 = Gx_mode ;
         while ( nGXsfl_110_idx < nRC_GXsfl_110 )
         {
            bGXsfl_110_Refreshing = true ;
            readRow1NX1830( ) ;
            edtavnRcdDeleted_1830_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1830_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1830_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1830_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtPEQUEId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQUEID_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEQUEId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQUEId_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtPEQColor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQCOLOR_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEQColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQColor_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtPEQMalha_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQMALHA_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEQMalha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQMalha_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtPEQMedida_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQMEDIDA_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEQMedida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQMedida_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtPEQCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQCOB_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEQCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQCob_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            edtPEQPrecio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQPRECIO_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPEQPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQPrecio_Enabled), 5, 0), !bGXsfl_110_Refreshing);
            if ( ( nRcdExists_1830 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NX1830( ) ;
            }
            sendRow1NX1830( ) ;
            bGXsfl_110_Refreshing = false ;
         }
         Gx_mode = sMode1830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1830 = (short)(5) ;
         nRcdExists_1830 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NX1830( ) ;
            while ( RcdFound1830 != 0 )
            {
               sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1101830( ) ;
               init_level_properties1830( ) ;
               standaloneNotModal1NX1830( ) ;
               getByPrimaryKey1NX1830( ) ;
               standaloneModal1NX1830( ) ;
               addRow1NX1830( ) ;
               scanNext1NX1830( ) ;
            }
            scanEnd1NX1830( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1830 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1101830( ) ;
         initAll1NX1830( ) ;
         init_level_properties1830( ) ;
         nRcdExists_1830 = (short)(0) ;
         nIsMod_1830 = (short)(0) ;
         nRcdDeleted_1830 = (short)(0) ;
         nBlankRcdCount1830 = (short)(nBlankRcdUsr1830+nBlankRcdCount1830) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1830 > 0 )
         {
            standaloneNotModal1NX1830( ) ;
            standaloneModal1NX1830( ) ;
            addRow1NX1830( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPEQUEId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1830 = (short)(nBlankRcdCount1830-1) ;
         }
         Gx_mode = sMode1830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEQ000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPEQ000.htm");
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
      e111NX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13350PEQId = localUtil.ctol( httpContext.cgiGet( "Z13350PEQId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z13368PEQCliNom = httpContext.cgiGet( "Z13368PEQCliNom") ;
            Z13351PEQFecha = localUtil.ctod( httpContext.cgiGet( "Z13351PEQFecha"), 0) ;
            Z13352PEQFecEnt = localUtil.ctod( httpContext.cgiGet( "Z13352PEQFecEnt"), 0) ;
            Z13353PEQDibCli = httpContext.cgiGet( "Z13353PEQDibCli") ;
            Z13354PEQDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z13354PEQDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13355PEQRef = httpContext.cgiGet( "Z13355PEQRef") ;
            Z13356PEQRap = (short)(localUtil.ctol( httpContext.cgiGet( "Z13356PEQRap"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13357PEQCargo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13357PEQCargo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13358PEQObs = httpContext.cgiGet( "Z13358PEQObs") ;
            Z13367PEQClicod = (int)(localUtil.ctol( httpContext.cgiGet( "Z13367PEQClicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13359PEQEstado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13359PEQEstado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13360PEQTipo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13360PEQTipo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13374PEQNumCol = (short)(localUtil.ctol( httpContext.cgiGet( "Z13374PEQNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13372PEQGrabCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z13372PEQGrabCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_110 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_110"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33PEQId = localUtil.ctol( httpContext.cgiGet( "vPEQID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13350PEQId = 0 ;
               n13350PEQId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
            }
            else
            {
               A13350PEQId = localUtil.ctol( httpContext.cgiGet( edtPEQId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n13350PEQId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPEQFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEQFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13351PEQFecha = GXutil.nullDate() ;
               n13351PEQFecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
            }
            else
            {
               A13351PEQFecha = localUtil.ctod( httpContext.cgiGet( edtPEQFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13351PEQFecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPEQFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEQFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13352PEQFecEnt = GXutil.nullDate() ;
               n13352PEQFecEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13352PEQFecEnt", localUtil.format(A13352PEQFecEnt, "99/99/99"));
            }
            else
            {
               A13352PEQFecEnt = localUtil.ctod( httpContext.cgiGet( edtPEQFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13352PEQFecEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13352PEQFecEnt", localUtil.format(A13352PEQFecEnt, "99/99/99"));
            }
            A13353PEQDibCli = httpContext.cgiGet( edtPEQDibCli_Internalname) ;
            n13353PEQDibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13353PEQDibCli", A13353PEQDibCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQDIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13354PEQDibInt = 0 ;
               n13354PEQDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13354PEQDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13354PEQDibInt), 8, 0));
            }
            else
            {
               A13354PEQDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtPEQDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13354PEQDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13354PEQDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13354PEQDibInt), 8, 0));
            }
            A13355PEQRef = httpContext.cgiGet( edtPEQRef_Internalname) ;
            n13355PEQRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13355PEQRef", A13355PEQRef);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQRap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQRap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQRAP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQRap_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13356PEQRap = (short)(0) ;
               n13356PEQRap = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13356PEQRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13356PEQRap), 4, 0));
            }
            else
            {
               A13356PEQRap = (short)(localUtil.ctol( httpContext.cgiGet( edtPEQRap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13356PEQRap = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13356PEQRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13356PEQRap), 4, 0));
            }
            cmbPEQCargo.setName( cmbPEQCargo.getInternalname() );
            cmbPEQCargo.setValue( httpContext.cgiGet( cmbPEQCargo.getInternalname()) );
            A13357PEQCargo = (byte)(GXutil.lval( httpContext.cgiGet( cmbPEQCargo.getInternalname()))) ;
            n13357PEQCargo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13357PEQCargo", GXutil.str( A13357PEQCargo, 1, 0));
            A13358PEQObs = httpContext.cgiGet( edtPEQObs_Internalname) ;
            n13358PEQObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13358PEQObs", A13358PEQObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQClicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13367PEQClicod = 0 ;
               n13367PEQClicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13367PEQClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13367PEQClicod), 6, 0));
            }
            else
            {
               A13367PEQClicod = (int)(localUtil.ctol( httpContext.cgiGet( edtPEQClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13367PEQClicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13367PEQClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13367PEQClicod), 6, 0));
            }
            A13368PEQCliNom = httpContext.cgiGet( edtPEQCliNom_Internalname) ;
            n13368PEQCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", A13368PEQCliNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQEstado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13359PEQEstado = (byte)(0) ;
               n13359PEQEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
            }
            else
            {
               A13359PEQEstado = (byte)(localUtil.ctol( httpContext.cgiGet( edtPEQEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13359PEQEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
            }
            cmbPEQTipo.setName( cmbPEQTipo.getInternalname() );
            cmbPEQTipo.setValue( httpContext.cgiGet( cmbPEQTipo.getInternalname()) );
            A13360PEQTipo = (byte)(GXutil.lval( httpContext.cgiGet( cmbPEQTipo.getInternalname()))) ;
            n13360PEQTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQGRABCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQGrabCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13372PEQGrabCod = (short)(0) ;
               n13372PEQGrabCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13372PEQGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13372PEQGrabCod), 4, 0));
            }
            else
            {
               A13372PEQGrabCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPEQGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13372PEQGrabCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13372PEQGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13372PEQGrabCod), 4, 0));
            }
            A13373PEQGrabNom = httpContext.cgiGet( edtPEQGrabNom_Internalname) ;
            n13373PEQGrabNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", A13373PEQGrabNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEQNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEQNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEQNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEQNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13374PEQNumCol = (short)(0) ;
               n13374PEQNumCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13374PEQNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13374PEQNumCol), 4, 0));
            }
            else
            {
               A13374PEQNumCol = (short)(localUtil.ctol( httpContext.cgiGet( edtPEQNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13374PEQNumCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13374PEQNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13374PEQNumCol), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPEQ000");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A13350PEQId != Z13350PEQId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpeq000:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A13350PEQId = GXutil.lval( httpContext.GetPar( "PEQId")) ;
               n13350PEQId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
               getEqualNoModal( ) ;
               if ( ! isIns( )  )
               {
                  A13350PEQId = AV33PEQId ;
                  n13350PEQId = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode1829 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! isIns( )  )
                  {
                     A13350PEQId = AV33PEQId ;
                     n13350PEQId = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
                  }
                  Gx_mode = sMode1829 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1829 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1NX0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                        e111NX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAll1NX1829( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1NX1829( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1830_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1830_Enabled), 5, 0), !bGXsfl_110_Refreshing);
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

   public void confirm_1NX0( )
   {
      beforeValidate1NX1829( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NX1829( ) ;
         }
         else
         {
            checkExtendedTable1NX1829( ) ;
            if ( AnyError == 0 )
            {
               zm1NX1829( 15) ;
               zm1NX1829( 16) ;
            }
            closeExtendedTableCursors1NX1829( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1829 = Gx_mode ;
         confirm_1NX1830( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1829 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1829 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1NX0( ) ;
      }
   }

   public void confirm_1NX1830( )
   {
      nGXsfl_110_idx = 0 ;
      while ( nGXsfl_110_idx < nRC_GXsfl_110 )
      {
         readRow1NX1830( ) ;
         if ( ( nRcdExists_1830 != 0 ) || ( nIsMod_1830 != 0 ) )
         {
            getKey1NX1830( ) ;
            if ( ( nRcdExists_1830 == 0 ) && ( nRcdDeleted_1830 == 0 ) )
            {
               if ( RcdFound1830 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NX1830( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NX1830( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1NX1830( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PEQUEID_" + sGXsfl_110_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPEQUEId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1830 != 0 )
               {
                  if ( nRcdDeleted_1830 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NX1830( ) ;
                     load1NX1830( ) ;
                     beforeValidate1NX1830( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NX1830( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1830 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NX1830( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NX1830( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1NX1830( ) ;
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
                  if ( nRcdDeleted_1830 == 0 )
                  {
                     GXCCtl = "PEQUEID_" + sGXsfl_110_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPEQUEId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1830_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEQUEId_Internalname, GXutil.rtrim( A13366PEQUEId)) ;
         httpContext.changePostValue( edtPEQColor_Internalname, GXutil.rtrim( A13361PEQColor)) ;
         httpContext.changePostValue( edtPEQMalha_Internalname, GXutil.rtrim( A13362PEQMalha)) ;
         httpContext.changePostValue( edtPEQMedida_Internalname, GXutil.rtrim( A13363PEQMedida)) ;
         httpContext.changePostValue( edtPEQCob_Internalname, GXutil.ltrim( localUtil.ntoc( A13364PEQCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEQPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13365PEQPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13366PEQUEId_"+sGXsfl_110_idx, GXutil.rtrim( Z13366PEQUEId)) ;
         httpContext.changePostValue( "ZT_"+"Z13361PEQColor_"+sGXsfl_110_idx, GXutil.rtrim( Z13361PEQColor)) ;
         httpContext.changePostValue( "ZT_"+"Z13362PEQMalha_"+sGXsfl_110_idx, GXutil.rtrim( Z13362PEQMalha)) ;
         httpContext.changePostValue( "ZT_"+"Z13363PEQMedida_"+sGXsfl_110_idx, GXutil.rtrim( Z13363PEQMedida)) ;
         httpContext.changePostValue( "ZT_"+"Z13364PEQCob_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( Z13364PEQCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13365PEQPrecio_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( Z13365PEQPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1830_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1830_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1830_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1830 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1830_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1830_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQUEID_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQUEId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQCOLOR_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQColor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQMALHA_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMalha_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQMEDIDA_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMedida_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQCOB_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQPRECIO_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQPrecio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NX0( )
   {
   }

   public void e111NX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpeq000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tpeq000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpeq000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpeq000_impl.this.A396EmprCod = GXv_char2[0] ;
      tpeq000_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpeq000_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV34ExisteCont ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEQ000", ""), GXv_int6) ;
      tpeq000_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34ExisteCont = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ExisteCont", GXutil.str( AV34ExisteCont, 1, 0));
      if ( AV34ExisteCont == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta contador PEQ000, N de Orden Grabacion", ""));
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,Long.valueOf(AV33PEQId),Gx_mode});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV33PEQId","Gx_mode"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void zm1NX1829( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13368PEQCliNom = T01NX5_A13368PEQCliNom[0] ;
            Z13351PEQFecha = T01NX5_A13351PEQFecha[0] ;
            Z13352PEQFecEnt = T01NX5_A13352PEQFecEnt[0] ;
            Z13353PEQDibCli = T01NX5_A13353PEQDibCli[0] ;
            Z13354PEQDibInt = T01NX5_A13354PEQDibInt[0] ;
            Z13355PEQRef = T01NX5_A13355PEQRef[0] ;
            Z13356PEQRap = T01NX5_A13356PEQRap[0] ;
            Z13357PEQCargo = T01NX5_A13357PEQCargo[0] ;
            Z13358PEQObs = T01NX5_A13358PEQObs[0] ;
            Z13367PEQClicod = T01NX5_A13367PEQClicod[0] ;
            Z13359PEQEstado = T01NX5_A13359PEQEstado[0] ;
            Z13360PEQTipo = T01NX5_A13360PEQTipo[0] ;
            Z13374PEQNumCol = T01NX5_A13374PEQNumCol[0] ;
            Z13372PEQGrabCod = T01NX5_A13372PEQGrabCod[0] ;
         }
         else
         {
            Z13368PEQCliNom = A13368PEQCliNom ;
            Z13351PEQFecha = A13351PEQFecha ;
            Z13352PEQFecEnt = A13352PEQFecEnt ;
            Z13353PEQDibCli = A13353PEQDibCli ;
            Z13354PEQDibInt = A13354PEQDibInt ;
            Z13355PEQRef = A13355PEQRef ;
            Z13356PEQRap = A13356PEQRap ;
            Z13357PEQCargo = A13357PEQCargo ;
            Z13358PEQObs = A13358PEQObs ;
            Z13367PEQClicod = A13367PEQClicod ;
            Z13359PEQEstado = A13359PEQEstado ;
            Z13360PEQTipo = A13360PEQTipo ;
            Z13374PEQNumCol = A13374PEQNumCol ;
            Z13372PEQGrabCod = A13372PEQGrabCod ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z13350PEQId = A13350PEQId ;
         Z13368PEQCliNom = A13368PEQCliNom ;
         Z13351PEQFecha = A13351PEQFecha ;
         Z13352PEQFecEnt = A13352PEQFecEnt ;
         Z13353PEQDibCli = A13353PEQDibCli ;
         Z13354PEQDibInt = A13354PEQDibInt ;
         Z13355PEQRef = A13355PEQRef ;
         Z13356PEQRap = A13356PEQRap ;
         Z13357PEQCargo = A13357PEQCargo ;
         Z13358PEQObs = A13358PEQObs ;
         Z13367PEQClicod = A13367PEQClicod ;
         Z13359PEQEstado = A13359PEQEstado ;
         Z13360PEQTipo = A13360PEQTipo ;
         Z13374PEQNumCol = A13374PEQNumCol ;
         Z396EmprCod = A396EmprCod ;
         Z13372PEQGrabCod = A13372PEQGrabCod ;
         Z407EmprNom = A407EmprNom ;
         Z13373PEQGrabNom = A13373PEQGrabNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TPEQ000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01NX6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NX6_A407EmprNom[0] ;
      n407EmprNom = T01NX6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtPEQId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQId_Enabled), 5, 0), true);
      }
      else
      {
         edtPEQId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQId_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtPEQId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQId_Enabled), 5, 0), true);
      }
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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
      if ( ! isIns( )  )
      {
         A13350PEQId = AV33PEQId ;
         n13350PEQId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13351PEQFecha)) && ( Gx_BScreen == 0 ) )
      {
         A13351PEQFecha = GXutil.today( ) ;
         n13351PEQFecha = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
      }
      if ( isIns( )  && (0==A13359PEQEstado) && ( Gx_BScreen == 0 ) )
      {
         A13359PEQEstado = (byte)(0) ;
         n13359PEQEstado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
      }
      if ( isIns( )  && (0==A13360PEQTipo) && ( Gx_BScreen == 0 ) )
      {
         A13360PEQTipo = (byte)(1) ;
         n13360PEQTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
      }
   }

   public void load1NX1829( )
   {
      /* Using cursor T01NX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1829 = (short)(1) ;
         A13368PEQCliNom = T01NX8_A13368PEQCliNom[0] ;
         n13368PEQCliNom = T01NX8_n13368PEQCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", A13368PEQCliNom);
         A407EmprNom = T01NX8_A407EmprNom[0] ;
         n407EmprNom = T01NX8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13351PEQFecha = T01NX8_A13351PEQFecha[0] ;
         n13351PEQFecha = T01NX8_n13351PEQFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
         A13352PEQFecEnt = T01NX8_A13352PEQFecEnt[0] ;
         n13352PEQFecEnt = T01NX8_n13352PEQFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13352PEQFecEnt", localUtil.format(A13352PEQFecEnt, "99/99/99"));
         A13353PEQDibCli = T01NX8_A13353PEQDibCli[0] ;
         n13353PEQDibCli = T01NX8_n13353PEQDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13353PEQDibCli", A13353PEQDibCli);
         A13354PEQDibInt = T01NX8_A13354PEQDibInt[0] ;
         n13354PEQDibInt = T01NX8_n13354PEQDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13354PEQDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13354PEQDibInt), 8, 0));
         A13355PEQRef = T01NX8_A13355PEQRef[0] ;
         n13355PEQRef = T01NX8_n13355PEQRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13355PEQRef", A13355PEQRef);
         A13356PEQRap = T01NX8_A13356PEQRap[0] ;
         n13356PEQRap = T01NX8_n13356PEQRap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13356PEQRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13356PEQRap), 4, 0));
         A13357PEQCargo = T01NX8_A13357PEQCargo[0] ;
         n13357PEQCargo = T01NX8_n13357PEQCargo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13357PEQCargo", GXutil.str( A13357PEQCargo, 1, 0));
         A13358PEQObs = T01NX8_A13358PEQObs[0] ;
         n13358PEQObs = T01NX8_n13358PEQObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13358PEQObs", A13358PEQObs);
         A13367PEQClicod = T01NX8_A13367PEQClicod[0] ;
         n13367PEQClicod = T01NX8_n13367PEQClicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13367PEQClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13367PEQClicod), 6, 0));
         A13359PEQEstado = T01NX8_A13359PEQEstado[0] ;
         n13359PEQEstado = T01NX8_n13359PEQEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
         A13360PEQTipo = T01NX8_A13360PEQTipo[0] ;
         n13360PEQTipo = T01NX8_n13360PEQTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
         A13373PEQGrabNom = T01NX8_A13373PEQGrabNom[0] ;
         n13373PEQGrabNom = T01NX8_n13373PEQGrabNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", A13373PEQGrabNom);
         A13374PEQNumCol = T01NX8_A13374PEQNumCol[0] ;
         n13374PEQNumCol = T01NX8_n13374PEQNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13374PEQNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13374PEQNumCol), 4, 0));
         A13372PEQGrabCod = T01NX8_A13372PEQGrabCod[0] ;
         n13372PEQGrabCod = T01NX8_n13372PEQGrabCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13372PEQGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13372PEQGrabCod), 4, 0));
         zm1NX1829( -14) ;
      }
      pr_default.close(6);
      onLoadActions1NX1829( ) ;
   }

   public void onLoadActions1NX1829( )
   {
      edtPEQClicod_Enabled = ((A13357PEQCargo==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQClicod_Enabled), 5, 0), true);
      edtPEQCliNom_Enabled = ((A13357PEQCargo==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQCliNom_Enabled), 5, 0), true);
   }

   public void checkExtendedTable1NX1829( )
   {
      nIsDirty_1829 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01NX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n13372PEQGrabCod), Short.valueOf(A13372PEQGrabCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grabador", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEQGRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQGrabCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13373PEQGrabNom = T01NX7_A13373PEQGrabNom[0] ;
      n13373PEQGrabNom = T01NX7_n13373PEQGrabNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", A13373PEQGrabNom);
      pr_default.close(5);
      if ( A13367PEQClicod > 0 )
      {
         GXv_char4[0] = A13368PEQCliNom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A13367PEQClicod, GXv_char4) ;
         tpeq000_impl.this.A13368PEQCliNom = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", A13368PEQCliNom);
      }
      edtPEQClicod_Enabled = ((A13357PEQCargo==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQClicod_Enabled), 5, 0), true);
      edtPEQCliNom_Enabled = ((A13357PEQCargo==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQCliNom_Enabled), 5, 0), true);
      if ( ( GXutil.strcmp(A13368PEQCliNom, httpContext.getMessage( "Error", "")) == 0 ) && ( A13367PEQClicod > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Inexistente", ""), 1, "PEQCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQClicod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1NX1829( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          short A13372PEQGrabCod )
   {
      /* Using cursor T01NX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n13372PEQGrabCod), Short.valueOf(A13372PEQGrabCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grabador", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEQGRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQGrabCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13373PEQGrabNom = T01NX9_A13373PEQGrabNom[0] ;
      n13373PEQGrabNom = T01NX9_n13373PEQGrabNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", A13373PEQGrabNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13373PEQGrabNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1NX1829( )
   {
      /* Using cursor T01NX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1829 = (short)(1) ;
      }
      else
      {
         RcdFound1829 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01NX5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NX1829( 14) ;
         RcdFound1829 = (short)(1) ;
         A13350PEQId = T01NX5_A13350PEQId[0] ;
         n13350PEQId = T01NX5_n13350PEQId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
         A13368PEQCliNom = T01NX5_A13368PEQCliNom[0] ;
         n13368PEQCliNom = T01NX5_n13368PEQCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", A13368PEQCliNom);
         A13351PEQFecha = T01NX5_A13351PEQFecha[0] ;
         n13351PEQFecha = T01NX5_n13351PEQFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
         A13352PEQFecEnt = T01NX5_A13352PEQFecEnt[0] ;
         n13352PEQFecEnt = T01NX5_n13352PEQFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13352PEQFecEnt", localUtil.format(A13352PEQFecEnt, "99/99/99"));
         A13353PEQDibCli = T01NX5_A13353PEQDibCli[0] ;
         n13353PEQDibCli = T01NX5_n13353PEQDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13353PEQDibCli", A13353PEQDibCli);
         A13354PEQDibInt = T01NX5_A13354PEQDibInt[0] ;
         n13354PEQDibInt = T01NX5_n13354PEQDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13354PEQDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13354PEQDibInt), 8, 0));
         A13355PEQRef = T01NX5_A13355PEQRef[0] ;
         n13355PEQRef = T01NX5_n13355PEQRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13355PEQRef", A13355PEQRef);
         A13356PEQRap = T01NX5_A13356PEQRap[0] ;
         n13356PEQRap = T01NX5_n13356PEQRap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13356PEQRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13356PEQRap), 4, 0));
         A13357PEQCargo = T01NX5_A13357PEQCargo[0] ;
         n13357PEQCargo = T01NX5_n13357PEQCargo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13357PEQCargo", GXutil.str( A13357PEQCargo, 1, 0));
         A13358PEQObs = T01NX5_A13358PEQObs[0] ;
         n13358PEQObs = T01NX5_n13358PEQObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13358PEQObs", A13358PEQObs);
         A13367PEQClicod = T01NX5_A13367PEQClicod[0] ;
         n13367PEQClicod = T01NX5_n13367PEQClicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13367PEQClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13367PEQClicod), 6, 0));
         A13359PEQEstado = T01NX5_A13359PEQEstado[0] ;
         n13359PEQEstado = T01NX5_n13359PEQEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
         A13360PEQTipo = T01NX5_A13360PEQTipo[0] ;
         n13360PEQTipo = T01NX5_n13360PEQTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
         A13374PEQNumCol = T01NX5_A13374PEQNumCol[0] ;
         n13374PEQNumCol = T01NX5_n13374PEQNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13374PEQNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13374PEQNumCol), 4, 0));
         A13372PEQGrabCod = T01NX5_A13372PEQGrabCod[0] ;
         n13372PEQGrabCod = T01NX5_n13372PEQGrabCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13372PEQGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13372PEQGrabCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13350PEQId = A13350PEQId ;
         sMode1829 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NX1829( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1829 = (short)(0) ;
            initializeNonKey1NX1829( ) ;
         }
         Gx_mode = sMode1829 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1829 = (short)(0) ;
         initializeNonKey1NX1829( ) ;
         sMode1829 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1829 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1NX1829( ) ;
      if ( RcdFound1829 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1829 = (short)(0) ;
      /* Using cursor T01NX11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01NX11_A13350PEQId[0] < A13350PEQId ) ) && ( GXutil.strcmp(T01NX11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01NX11_A13350PEQId[0] > A13350PEQId ) ) && ( GXutil.strcmp(T01NX11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13350PEQId = T01NX11_A13350PEQId[0] ;
            n13350PEQId = T01NX11_n13350PEQId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
            RcdFound1829 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1829 = (short)(0) ;
      /* Using cursor T01NX12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01NX12_A13350PEQId[0] > A13350PEQId ) ) && ( GXutil.strcmp(T01NX12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01NX12_A13350PEQId[0] < A13350PEQId ) ) && ( GXutil.strcmp(T01NX12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13350PEQId = T01NX12_A13350PEQId[0] ;
            n13350PEQId = T01NX12_n13350PEQId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
            RcdFound1829 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NX1829( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPEQId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NX1829( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1829 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13350PEQId != Z13350PEQId ) )
            {
               A13350PEQId = Z13350PEQId ;
               n13350PEQId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPEQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1NX1829( ) ;
               GX_FocusControl = edtPEQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13350PEQId != Z13350PEQId ) )
            {
               /* Insert record */
               GX_FocusControl = edtPEQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NX1829( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtPEQId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NX1829( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13350PEQId != Z13350PEQId ) )
      {
         A13350PEQId = Z13350PEQId ;
         n13350PEQId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPEQId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1NX1829( ) ;
      if ( RcdFound1829 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13350PEQId != Z13350PEQId ) )
         {
            A13350PEQId = Z13350PEQId ;
            n13350PEQId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13350PEQId != Z13350PEQId ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpeq000");
      GX_FocusControl = edtPEQFecha_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1NX0( ) ;
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

   public void checkOptimisticConcurrency1NX1829( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NX4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEQ000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z13368PEQCliNom, T01NX4_A13368PEQCliNom[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13351PEQFecha), GXutil.resetTime(T01NX4_A13351PEQFecha[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z13352PEQFecEnt), GXutil.resetTime(T01NX4_A13352PEQFecEnt[0])) ) || ( GXutil.strcmp(Z13353PEQDibCli, T01NX4_A13353PEQDibCli[0]) != 0 ) || ( Z13354PEQDibInt != T01NX4_A13354PEQDibInt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13355PEQRef, T01NX4_A13355PEQRef[0]) != 0 ) || ( Z13356PEQRap != T01NX4_A13356PEQRap[0] ) || ( Z13357PEQCargo != T01NX4_A13357PEQCargo[0] ) || ( GXutil.strcmp(Z13358PEQObs, T01NX4_A13358PEQObs[0]) != 0 ) || ( Z13367PEQClicod != T01NX4_A13367PEQClicod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13359PEQEstado != T01NX4_A13359PEQEstado[0] ) || ( Z13360PEQTipo != T01NX4_A13360PEQTipo[0] ) || ( Z13374PEQNumCol != T01NX4_A13374PEQNumCol[0] ) || ( Z13372PEQGrabCod != T01NX4_A13372PEQGrabCod[0] ) )
         {
            if ( GXutil.strcmp(Z13368PEQCliNom, T01NX4_A13368PEQCliNom[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQCliNom");
               GXutil.writeLogRaw("Old: ",Z13368PEQCliNom);
               GXutil.writeLogRaw("Current: ",T01NX4_A13368PEQCliNom[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13351PEQFecha), GXutil.resetTime(T01NX4_A13351PEQFecha[0])) ) )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQFecha");
               GXutil.writeLogRaw("Old: ",Z13351PEQFecha);
               GXutil.writeLogRaw("Current: ",T01NX4_A13351PEQFecha[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13352PEQFecEnt), GXutil.resetTime(T01NX4_A13352PEQFecEnt[0])) ) )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQFecEnt");
               GXutil.writeLogRaw("Old: ",Z13352PEQFecEnt);
               GXutil.writeLogRaw("Current: ",T01NX4_A13352PEQFecEnt[0]);
            }
            if ( GXutil.strcmp(Z13353PEQDibCli, T01NX4_A13353PEQDibCli[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQDibCli");
               GXutil.writeLogRaw("Old: ",Z13353PEQDibCli);
               GXutil.writeLogRaw("Current: ",T01NX4_A13353PEQDibCli[0]);
            }
            if ( Z13354PEQDibInt != T01NX4_A13354PEQDibInt[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQDibInt");
               GXutil.writeLogRaw("Old: ",Z13354PEQDibInt);
               GXutil.writeLogRaw("Current: ",T01NX4_A13354PEQDibInt[0]);
            }
            if ( GXutil.strcmp(Z13355PEQRef, T01NX4_A13355PEQRef[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQRef");
               GXutil.writeLogRaw("Old: ",Z13355PEQRef);
               GXutil.writeLogRaw("Current: ",T01NX4_A13355PEQRef[0]);
            }
            if ( Z13356PEQRap != T01NX4_A13356PEQRap[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQRap");
               GXutil.writeLogRaw("Old: ",Z13356PEQRap);
               GXutil.writeLogRaw("Current: ",T01NX4_A13356PEQRap[0]);
            }
            if ( Z13357PEQCargo != T01NX4_A13357PEQCargo[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQCargo");
               GXutil.writeLogRaw("Old: ",Z13357PEQCargo);
               GXutil.writeLogRaw("Current: ",T01NX4_A13357PEQCargo[0]);
            }
            if ( GXutil.strcmp(Z13358PEQObs, T01NX4_A13358PEQObs[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQObs");
               GXutil.writeLogRaw("Old: ",Z13358PEQObs);
               GXutil.writeLogRaw("Current: ",T01NX4_A13358PEQObs[0]);
            }
            if ( Z13367PEQClicod != T01NX4_A13367PEQClicod[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQClicod");
               GXutil.writeLogRaw("Old: ",Z13367PEQClicod);
               GXutil.writeLogRaw("Current: ",T01NX4_A13367PEQClicod[0]);
            }
            if ( Z13359PEQEstado != T01NX4_A13359PEQEstado[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQEstado");
               GXutil.writeLogRaw("Old: ",Z13359PEQEstado);
               GXutil.writeLogRaw("Current: ",T01NX4_A13359PEQEstado[0]);
            }
            if ( Z13360PEQTipo != T01NX4_A13360PEQTipo[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQTipo");
               GXutil.writeLogRaw("Old: ",Z13360PEQTipo);
               GXutil.writeLogRaw("Current: ",T01NX4_A13360PEQTipo[0]);
            }
            if ( Z13374PEQNumCol != T01NX4_A13374PEQNumCol[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQNumCol");
               GXutil.writeLogRaw("Old: ",Z13374PEQNumCol);
               GXutil.writeLogRaw("Current: ",T01NX4_A13374PEQNumCol[0]);
            }
            if ( Z13372PEQGrabCod != T01NX4_A13372PEQGrabCod[0] )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQGrabCod");
               GXutil.writeLogRaw("Old: ",Z13372PEQGrabCod);
               GXutil.writeLogRaw("Current: ",T01NX4_A13372PEQGrabCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEQ000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NX1829( )
   {
      beforeValidate1NX1829( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NX1829( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NX1829( 0) ;
         checkOptimisticConcurrency1NX1829( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NX1829( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NX1829( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NX13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), Boolean.valueOf(n13368PEQCliNom), A13368PEQCliNom, Boolean.valueOf(n13351PEQFecha), A13351PEQFecha, Boolean.valueOf(n13352PEQFecEnt), A13352PEQFecEnt, Boolean.valueOf(n13353PEQDibCli), A13353PEQDibCli, Boolean.valueOf(n13354PEQDibInt), Integer.valueOf(A13354PEQDibInt), Boolean.valueOf(n13355PEQRef), A13355PEQRef, Boolean.valueOf(n13356PEQRap), Short.valueOf(A13356PEQRap), Boolean.valueOf(n13357PEQCargo), Byte.valueOf(A13357PEQCargo), Boolean.valueOf(n13358PEQObs), A13358PEQObs, Boolean.valueOf(n13367PEQClicod), Integer.valueOf(A13367PEQClicod), Boolean.valueOf(n13359PEQEstado), Byte.valueOf(A13359PEQEstado), Boolean.valueOf(n13360PEQTipo), Byte.valueOf(A13360PEQTipo), Boolean.valueOf(n13374PEQNumCol), Short.valueOf(A13374PEQNumCol), A396EmprCod, Boolean.valueOf(n13372PEQGrabCod), Short.valueOf(A13372PEQGrabCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEQ000");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1NX1829( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load1NX1829( ) ;
         }
         endLevel1NX1829( ) ;
      }
      closeExtendedTableCursors1NX1829( ) ;
   }

   public void update1NX1829( )
   {
      beforeValidate1NX1829( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NX1829( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NX1829( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NX1829( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NX1829( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NX14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n13368PEQCliNom), A13368PEQCliNom, Boolean.valueOf(n13351PEQFecha), A13351PEQFecha, Boolean.valueOf(n13352PEQFecEnt), A13352PEQFecEnt, Boolean.valueOf(n13353PEQDibCli), A13353PEQDibCli, Boolean.valueOf(n13354PEQDibInt), Integer.valueOf(A13354PEQDibInt), Boolean.valueOf(n13355PEQRef), A13355PEQRef, Boolean.valueOf(n13356PEQRap), Short.valueOf(A13356PEQRap), Boolean.valueOf(n13357PEQCargo), Byte.valueOf(A13357PEQCargo), Boolean.valueOf(n13358PEQObs), A13358PEQObs, Boolean.valueOf(n13367PEQClicod), Integer.valueOf(A13367PEQClicod), Boolean.valueOf(n13359PEQEstado), Byte.valueOf(A13359PEQEstado), Boolean.valueOf(n13360PEQTipo), Byte.valueOf(A13360PEQTipo), Boolean.valueOf(n13374PEQNumCol), Short.valueOf(A13374PEQNumCol), Boolean.valueOf(n13372PEQGrabCod), Short.valueOf(A13372PEQGrabCod), A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEQ000");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEQ000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NX1829( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NX1829( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel1NX1829( ) ;
      }
      closeExtendedTableCursors1NX1829( ) ;
   }

   public void deferredUpdate1NX1829( )
   {
   }

   public void delete( )
   {
      beforeValidate1NX1829( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NX1829( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NX1829( ) ;
         afterConfirm1NX1829( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NX1829( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NX1830( ) ;
               while ( RcdFound1830 != 0 )
               {
                  getByPrimaryKey1NX1830( ) ;
                  delete1NX1830( ) ;
                  scanNext1NX1830( ) ;
               }
               scanEnd1NX1830( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NX15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEQ000");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode1829 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NX1829( ) ;
      Gx_mode = sMode1829 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NX1829( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         edtPEQClicod_Enabled = ((A13357PEQCargo==0) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQClicod_Enabled), 5, 0), true);
         edtPEQCliNom_Enabled = ((A13357PEQCargo==0) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQCliNom_Enabled), 5, 0), true);
         /* Using cursor T01NX16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n13372PEQGrabCod), Short.valueOf(A13372PEQGrabCod)});
         A13373PEQGrabNom = T01NX16_A13373PEQGrabNom[0] ;
         n13373PEQGrabNom = T01NX16_n13373PEQGrabNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", A13373PEQGrabNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01NX17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lab DIP Estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1NX1830( )
   {
      nGXsfl_110_idx = 0 ;
      while ( nGXsfl_110_idx < nRC_GXsfl_110 )
      {
         readRow1NX1830( ) ;
         if ( ( nRcdExists_1830 != 0 ) || ( nIsMod_1830 != 0 ) )
         {
            standaloneNotModal1NX1830( ) ;
            getKey1NX1830( ) ;
            if ( ( nRcdExists_1830 == 0 ) && ( nRcdDeleted_1830 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NX1830( ) ;
            }
            else
            {
               if ( RcdFound1830 != 0 )
               {
                  if ( ( nRcdDeleted_1830 != 0 ) && ( nRcdExists_1830 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NX1830( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1830 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NX1830( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1830 == 0 )
                  {
                     GXCCtl = "PEQUEID_" + sGXsfl_110_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPEQUEId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1830_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEQUEId_Internalname, GXutil.rtrim( A13366PEQUEId)) ;
         httpContext.changePostValue( edtPEQColor_Internalname, GXutil.rtrim( A13361PEQColor)) ;
         httpContext.changePostValue( edtPEQMalha_Internalname, GXutil.rtrim( A13362PEQMalha)) ;
         httpContext.changePostValue( edtPEQMedida_Internalname, GXutil.rtrim( A13363PEQMedida)) ;
         httpContext.changePostValue( edtPEQCob_Internalname, GXutil.ltrim( localUtil.ntoc( A13364PEQCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPEQPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13365PEQPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13366PEQUEId_"+sGXsfl_110_idx, GXutil.rtrim( Z13366PEQUEId)) ;
         httpContext.changePostValue( "ZT_"+"Z13361PEQColor_"+sGXsfl_110_idx, GXutil.rtrim( Z13361PEQColor)) ;
         httpContext.changePostValue( "ZT_"+"Z13362PEQMalha_"+sGXsfl_110_idx, GXutil.rtrim( Z13362PEQMalha)) ;
         httpContext.changePostValue( "ZT_"+"Z13363PEQMedida_"+sGXsfl_110_idx, GXutil.rtrim( Z13363PEQMedida)) ;
         httpContext.changePostValue( "ZT_"+"Z13364PEQCob_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( Z13364PEQCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13365PEQPrecio_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( Z13365PEQPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1830_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1830_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1830_"+sGXsfl_110_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1830 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1830_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1830_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQUEID_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQUEId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQCOLOR_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQColor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQMALHA_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMalha_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQMEDIDA_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMedida_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQCOB_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEQPRECIO_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQPrecio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NX1830( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1830 = (short)(0) ;
      nIsMod_1830 = (short)(0) ;
      nRcdDeleted_1830 = (short)(0) ;
   }

   public void processLevel1NX1829( )
   {
      /* Save parent mode. */
      sMode1829 = Gx_mode ;
      processNestedLevel1NX1830( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1829 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NX1829( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NX1829( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpeq000");
         if ( AnyError == 0 )
         {
            confirmValues1NX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpeq000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NX1829( )
   {
      /* Scan By routine */
      /* Using cursor T01NX18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1829 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1829 = (short)(1) ;
         A13350PEQId = T01NX18_A13350PEQId[0] ;
         n13350PEQId = T01NX18_n13350PEQId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NX1829( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1829 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1829 = (short)(1) ;
         A13350PEQId = T01NX18_A13350PEQId[0] ;
         n13350PEQId = T01NX18_n13350PEQId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
      }
   }

   public void scanEnd1NX1829( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1NX1829( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A13353PEQDibCli)==0) && (0==A13354PEQDibInt) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Es obligatorio un valor en Dibujo Cliente o Interno", ""), 1, "PEQDIBCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( isIns( )  && (0==A13350PEQId) && true /* Level */ && true /* After */ )
      {
         GXv_int7[0] = (int)(A13350PEQId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEQ000", ""), GXv_int7) ;
         tpeq000_impl.this.A13350PEQId = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
      }
   }

   public void beforeInsert1NX1829( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NX1829( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NX1829( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NX1829( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NX1829( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NX1829( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPEQId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQId_Enabled), 5, 0), true);
      edtPEQFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQFecha_Enabled), 5, 0), true);
      edtPEQFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQFecEnt_Enabled), 5, 0), true);
      edtPEQDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQDibCli_Enabled), 5, 0), true);
      edtPEQDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQDibInt_Enabled), 5, 0), true);
      edtPEQRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQRef_Enabled), 5, 0), true);
      edtPEQRap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQRap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQRap_Enabled), 5, 0), true);
      cmbPEQCargo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPEQCargo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPEQCargo.getEnabled(), 5, 0), true);
      edtPEQObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQObs_Enabled), 5, 0), true);
      edtPEQClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQClicod_Enabled), 5, 0), true);
      edtPEQCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQCliNom_Enabled), 5, 0), true);
      edtPEQEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQEstado_Enabled), 5, 0), true);
      cmbPEQTipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPEQTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPEQTipo.getEnabled(), 5, 0), true);
      edtPEQGrabCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQGrabCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQGrabCod_Enabled), 5, 0), true);
      edtPEQGrabNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQGrabNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQGrabNom_Enabled), 5, 0), true);
      edtPEQNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQNumCol_Enabled), 5, 0), true);
   }

   public void zm1NX1830( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13361PEQColor = T01NX3_A13361PEQColor[0] ;
            Z13362PEQMalha = T01NX3_A13362PEQMalha[0] ;
            Z13363PEQMedida = T01NX3_A13363PEQMedida[0] ;
            Z13364PEQCob = T01NX3_A13364PEQCob[0] ;
            Z13365PEQPrecio = T01NX3_A13365PEQPrecio[0] ;
         }
         else
         {
            Z13361PEQColor = A13361PEQColor ;
            Z13362PEQMalha = A13362PEQMalha ;
            Z13363PEQMedida = A13363PEQMedida ;
            Z13364PEQCob = A13364PEQCob ;
            Z13365PEQPrecio = A13365PEQPrecio ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13350PEQId = A13350PEQId ;
         Z13366PEQUEId = A13366PEQUEId ;
         Z13361PEQColor = A13361PEQColor ;
         Z13362PEQMalha = A13362PEQMalha ;
         Z13363PEQMedida = A13363PEQMedida ;
         Z13364PEQCob = A13364PEQCob ;
         Z13365PEQPrecio = A13365PEQPrecio ;
      }
   }

   public void standaloneNotModal1NX1830( )
   {
   }

   public void standaloneModal1NX1830( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPEQUEId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQUEId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQUEId_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      }
      else
      {
         edtPEQUEId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPEQUEId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQUEId_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      }
   }

   public void load1NX1830( )
   {
      /* Using cursor T01NX19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1830 = (short)(1) ;
         A13361PEQColor = T01NX19_A13361PEQColor[0] ;
         n13361PEQColor = T01NX19_n13361PEQColor[0] ;
         A13362PEQMalha = T01NX19_A13362PEQMalha[0] ;
         n13362PEQMalha = T01NX19_n13362PEQMalha[0] ;
         A13363PEQMedida = T01NX19_A13363PEQMedida[0] ;
         n13363PEQMedida = T01NX19_n13363PEQMedida[0] ;
         A13364PEQCob = T01NX19_A13364PEQCob[0] ;
         n13364PEQCob = T01NX19_n13364PEQCob[0] ;
         A13365PEQPrecio = T01NX19_A13365PEQPrecio[0] ;
         n13365PEQPrecio = T01NX19_n13365PEQPrecio[0] ;
         zm1NX1830( -17) ;
      }
      pr_default.close(17);
      onLoadActions1NX1830( ) ;
   }

   public void onLoadActions1NX1830( )
   {
   }

   public void checkExtendedTable1NX1830( )
   {
      nIsDirty_1830 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1NX1830( ) ;
      if ( true /* Level */ && (GXutil.strcmp("", A13366PEQUEId)==0) )
      {
         GXCCtl = "PEQUEID_" + sGXsfl_110_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQUEId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1NX1830( )
   {
   }

   public void enableDisable1NX1830( )
   {
   }

   public void getKey1NX1830( )
   {
      /* Using cursor T01NX20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1830 = (short)(1) ;
      }
      else
      {
         RcdFound1830 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1NX1830( )
   {
      /* Using cursor T01NX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01NX3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NX1830( 17) ;
         RcdFound1830 = (short)(1) ;
         initializeNonKey1NX1830( ) ;
         A13366PEQUEId = T01NX3_A13366PEQUEId[0] ;
         A13361PEQColor = T01NX3_A13361PEQColor[0] ;
         n13361PEQColor = T01NX3_n13361PEQColor[0] ;
         A13362PEQMalha = T01NX3_A13362PEQMalha[0] ;
         n13362PEQMalha = T01NX3_n13362PEQMalha[0] ;
         A13363PEQMedida = T01NX3_A13363PEQMedida[0] ;
         n13363PEQMedida = T01NX3_n13363PEQMedida[0] ;
         A13364PEQCob = T01NX3_A13364PEQCob[0] ;
         n13364PEQCob = T01NX3_n13364PEQCob[0] ;
         A13365PEQPrecio = T01NX3_A13365PEQPrecio[0] ;
         n13365PEQPrecio = T01NX3_n13365PEQPrecio[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13350PEQId = A13350PEQId ;
         Z13366PEQUEId = A13366PEQUEId ;
         sMode1830 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1NX1830( ) ;
         Gx_mode = sMode1830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1830 = (short)(0) ;
         initializeNonKey1NX1830( ) ;
         sMode1830 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NX1830( ) ;
         Gx_mode = sMode1830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NX1830( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NX1830( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEQ001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13361PEQColor, T01NX2_A13361PEQColor[0]) != 0 ) || ( GXutil.strcmp(Z13362PEQMalha, T01NX2_A13362PEQMalha[0]) != 0 ) || ( GXutil.strcmp(Z13363PEQMedida, T01NX2_A13363PEQMedida[0]) != 0 ) || ( DecimalUtil.compareTo(Z13364PEQCob, T01NX2_A13364PEQCob[0]) != 0 ) || ( DecimalUtil.compareTo(Z13365PEQPrecio, T01NX2_A13365PEQPrecio[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13361PEQColor, T01NX2_A13361PEQColor[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQColor");
               GXutil.writeLogRaw("Old: ",Z13361PEQColor);
               GXutil.writeLogRaw("Current: ",T01NX2_A13361PEQColor[0]);
            }
            if ( GXutil.strcmp(Z13362PEQMalha, T01NX2_A13362PEQMalha[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQMalha");
               GXutil.writeLogRaw("Old: ",Z13362PEQMalha);
               GXutil.writeLogRaw("Current: ",T01NX2_A13362PEQMalha[0]);
            }
            if ( GXutil.strcmp(Z13363PEQMedida, T01NX2_A13363PEQMedida[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQMedida");
               GXutil.writeLogRaw("Old: ",Z13363PEQMedida);
               GXutil.writeLogRaw("Current: ",T01NX2_A13363PEQMedida[0]);
            }
            if ( DecimalUtil.compareTo(Z13364PEQCob, T01NX2_A13364PEQCob[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQCob");
               GXutil.writeLogRaw("Old: ",Z13364PEQCob);
               GXutil.writeLogRaw("Current: ",T01NX2_A13364PEQCob[0]);
            }
            if ( DecimalUtil.compareTo(Z13365PEQPrecio, T01NX2_A13365PEQPrecio[0]) != 0 )
            {
               GXutil.writeLogln("tpeq000:[seudo value changed for attri]"+"PEQPrecio");
               GXutil.writeLogRaw("Old: ",Z13365PEQPrecio);
               GXutil.writeLogRaw("Current: ",T01NX2_A13365PEQPrecio[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEQ001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NX1830( )
   {
      beforeValidate1NX1830( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NX1830( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NX1830( 0) ;
         checkOptimisticConcurrency1NX1830( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NX1830( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NX1830( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NX21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId, Boolean.valueOf(n13361PEQColor), A13361PEQColor, Boolean.valueOf(n13362PEQMalha), A13362PEQMalha, Boolean.valueOf(n13363PEQMedida), A13363PEQMedida, Boolean.valueOf(n13364PEQCob), A13364PEQCob, Boolean.valueOf(n13365PEQPrecio), A13365PEQPrecio});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEQ001");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load1NX1830( ) ;
         }
         endLevel1NX1830( ) ;
      }
      closeExtendedTableCursors1NX1830( ) ;
   }

   public void update1NX1830( )
   {
      beforeValidate1NX1830( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NX1830( ) ;
      }
      if ( ( nIsMod_1830 != 0 ) || ( nIsDirty_1830 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NX1830( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NX1830( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NX1830( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NX22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n13361PEQColor), A13361PEQColor, Boolean.valueOf(n13362PEQMalha), A13362PEQMalha, Boolean.valueOf(n13363PEQMedida), A13363PEQMedida, Boolean.valueOf(n13364PEQCob), A13364PEQCob, Boolean.valueOf(n13365PEQPrecio), A13365PEQPrecio, A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEQ001");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEQ001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NX1830( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NX1830( ) ;
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
            endLevel1NX1830( ) ;
         }
      }
      closeExtendedTableCursors1NX1830( ) ;
   }

   public void deferredUpdate1NX1830( )
   {
   }

   public void delete1NX1830( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NX1830( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NX1830( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NX1830( ) ;
         afterConfirm1NX1830( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NX1830( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NX23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId), A13366PEQUEId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEQ001");
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
      sMode1830 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NX1830( ) ;
      Gx_mode = sMode1830 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NX1830( )
   {
      standaloneModal1NX1830( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1NX1830( )
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

   public void scanStart1NX1830( )
   {
      /* Scan By routine */
      /* Using cursor T01NX24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n13350PEQId), Long.valueOf(A13350PEQId)});
      RcdFound1830 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1830 = (short)(1) ;
         A13366PEQUEId = T01NX24_A13366PEQUEId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NX1830( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1830 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1830 = (short)(1) ;
         A13366PEQUEId = T01NX24_A13366PEQUEId[0] ;
      }
   }

   public void scanEnd1NX1830( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1NX1830( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NX1830( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NX1830( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NX1830( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NX1830( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NX1830( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NX1830( )
   {
      edtPEQUEId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQUEId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQUEId_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      edtPEQColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQColor_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      edtPEQMalha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQMalha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQMalha_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      edtPEQMedida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQMedida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQMedida_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      edtPEQCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQCob_Enabled), 5, 0), !bGXsfl_110_Refreshing);
      edtPEQPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQPrecio_Enabled), 5, 0), !bGXsfl_110_Refreshing);
   }

   public void send_integrity_lvl_hashes1NX1830( )
   {
   }

   public void send_integrity_lvl_hashes1NX1829( )
   {
   }

   public void subsflControlProps_1101830( )
   {
      edtavnRcdDeleted_1830_Internalname = "vNRCDDELETED_1830_"+sGXsfl_110_idx ;
      edtPEQUEId_Internalname = "PEQUEID_"+sGXsfl_110_idx ;
      edtPEQColor_Internalname = "PEQCOLOR_"+sGXsfl_110_idx ;
      edtPEQMalha_Internalname = "PEQMALHA_"+sGXsfl_110_idx ;
      edtPEQMedida_Internalname = "PEQMEDIDA_"+sGXsfl_110_idx ;
      edtPEQCob_Internalname = "PEQCOB_"+sGXsfl_110_idx ;
      edtPEQPrecio_Internalname = "PEQPRECIO_"+sGXsfl_110_idx ;
   }

   public void subsflControlProps_fel_1101830( )
   {
      edtavnRcdDeleted_1830_Internalname = "vNRCDDELETED_1830_"+sGXsfl_110_fel_idx ;
      edtPEQUEId_Internalname = "PEQUEID_"+sGXsfl_110_fel_idx ;
      edtPEQColor_Internalname = "PEQCOLOR_"+sGXsfl_110_fel_idx ;
      edtPEQMalha_Internalname = "PEQMALHA_"+sGXsfl_110_fel_idx ;
      edtPEQMedida_Internalname = "PEQMEDIDA_"+sGXsfl_110_fel_idx ;
      edtPEQCob_Internalname = "PEQCOB_"+sGXsfl_110_fel_idx ;
      edtPEQPrecio_Internalname = "PEQPRECIO_"+sGXsfl_110_fel_idx ;
   }

   public void addRow1NX1830( )
   {
      nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101830( ) ;
      sendRow1NX1830( ) ;
   }

   public void sendRow1NX1830( )
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
         if ( ((int)((nGXsfl_110_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1830_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1830_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1830), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1830), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1830_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1830_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEQUEId_Internalname,GXutil.rtrim( A13366PEQUEId),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEQUEId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEQUEId_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEQColor_Internalname,GXutil.rtrim( A13361PEQColor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEQColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEQColor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEQMalha_Internalname,GXutil.rtrim( A13362PEQMalha),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEQMalha_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEQMalha_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEQMedida_Internalname,GXutil.rtrim( A13363PEQMedida),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEQMedida_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEQMedida_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEQCob_Internalname,GXutil.ltrim( localUtil.ntoc( A13364PEQCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPEQCob_Enabled!=0) ? localUtil.format( A13364PEQCob, "ZZ9.99") : localUtil.format( A13364PEQCob, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEQCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEQCob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1830_" + sGXsfl_110_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_110_idx + "',110)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPEQPrecio_Internalname,GXutil.ltrim( localUtil.ntoc( A13365PEQPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPEQPrecio_Enabled!=0) ? localUtil.format( A13365PEQPrecio, "ZZZZZZ9.999") : localUtil.format( A13365PEQPrecio, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPEQPrecio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPEQPrecio_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1NX1830( ) ;
      GXCCtl = "Z13366PEQUEId_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13366PEQUEId));
      GXCCtl = "Z13361PEQColor_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13361PEQColor));
      GXCCtl = "Z13362PEQMalha_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13362PEQMalha));
      GXCCtl = "Z13363PEQMedida_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13363PEQMedida));
      GXCCtl = "Z13364PEQCob_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13364PEQCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13365PEQPrecio_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13365PEQPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1830_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1830_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1830_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1830, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPEQID_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33PEQId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_110_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1830_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1830_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEQUEID_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQUEId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEQCOLOR_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQColor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEQMALHA_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMalha_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEQMEDIDA_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMedida_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEQCOB_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEQPRECIO_"+sGXsfl_110_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1NX1830( )
   {
      nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101830( ) ;
      edtavnRcdDeleted_1830_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1830_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEQUEId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQUEID_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEQColor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQCOLOR_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEQMalha_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQMALHA_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEQMedida_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQMEDIDA_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEQCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQCOB_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPEQPrecio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEQPRECIO_"+sGXsfl_110_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1830_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1830_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1830");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1830_Internalname ;
         wbErr = true ;
         nRcdDeleted_1830 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1830 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1830_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13366PEQUEId = httpContext.cgiGet( edtPEQUEId_Internalname) ;
      A13361PEQColor = httpContext.cgiGet( edtPEQColor_Internalname) ;
      n13361PEQColor = false ;
      A13362PEQMalha = httpContext.cgiGet( edtPEQMalha_Internalname) ;
      n13362PEQMalha = false ;
      A13363PEQMedida = httpContext.cgiGet( edtPEQMedida_Internalname) ;
      n13363PEQMedida = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEQCob_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEQCob_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PEQCOB_" + sGXsfl_110_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQCob_Internalname ;
         wbErr = true ;
         A13364PEQCob = DecimalUtil.ZERO ;
         n13364PEQCob = false ;
      }
      else
      {
         A13364PEQCob = localUtil.ctond( httpContext.cgiGet( edtPEQCob_Internalname)) ;
         n13364PEQCob = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEQPrecio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEQPrecio_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "PEQPRECIO_" + sGXsfl_110_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQPrecio_Internalname ;
         wbErr = true ;
         A13365PEQPrecio = DecimalUtil.ZERO ;
         n13365PEQPrecio = false ;
      }
      else
      {
         A13365PEQPrecio = localUtil.ctond( httpContext.cgiGet( edtPEQPrecio_Internalname)) ;
         n13365PEQPrecio = false ;
      }
      GXCCtl = "Z13366PEQUEId_" + sGXsfl_110_idx ;
      Z13366PEQUEId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13361PEQColor_" + sGXsfl_110_idx ;
      Z13361PEQColor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13362PEQMalha_" + sGXsfl_110_idx ;
      Z13362PEQMalha = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13363PEQMedida_" + sGXsfl_110_idx ;
      Z13363PEQMedida = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13364PEQCob_" + sGXsfl_110_idx ;
      Z13364PEQCob = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13365PEQPrecio_" + sGXsfl_110_idx ;
      Z13365PEQPrecio = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1830_" + sGXsfl_110_idx ;
      nRcdDeleted_1830 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1830_" + sGXsfl_110_idx ;
      nRcdExists_1830 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1830_" + sGXsfl_110_idx ;
      nIsMod_1830 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPEQUEId_Enabled = edtPEQUEId_Enabled ;
   }

   public void confirmValues1NX0( )
   {
      nGXsfl_110_idx = 0 ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1101830( ) ;
      while ( nGXsfl_110_idx < nRC_GXsfl_110 )
      {
         nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1101830( ) ;
         httpContext.changePostValue( "Z13366PEQUEId_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z13366PEQUEId_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13366PEQUEId_"+sGXsfl_110_idx) ;
         httpContext.changePostValue( "Z13361PEQColor_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z13361PEQColor_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13361PEQColor_"+sGXsfl_110_idx) ;
         httpContext.changePostValue( "Z13362PEQMalha_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z13362PEQMalha_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13362PEQMalha_"+sGXsfl_110_idx) ;
         httpContext.changePostValue( "Z13363PEQMedida_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z13363PEQMedida_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13363PEQMedida_"+sGXsfl_110_idx) ;
         httpContext.changePostValue( "Z13364PEQCob_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z13364PEQCob_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13364PEQCob_"+sGXsfl_110_idx) ;
         httpContext.changePostValue( "Z13365PEQPrecio_"+sGXsfl_110_idx, httpContext.cgiGet( "ZT_"+"Z13365PEQPrecio_"+sGXsfl_110_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13365PEQPrecio_"+sGXsfl_110_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpeq000", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33PEQId,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","PEQId","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPEQ000");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpeq000:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13350PEQId", GXutil.ltrim( localUtil.ntoc( Z13350PEQId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13368PEQCliNom", GXutil.rtrim( Z13368PEQCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13351PEQFecha", localUtil.dtoc( Z13351PEQFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13352PEQFecEnt", localUtil.dtoc( Z13352PEQFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13353PEQDibCli", GXutil.rtrim( Z13353PEQDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13354PEQDibInt", GXutil.ltrim( localUtil.ntoc( Z13354PEQDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13355PEQRef", GXutil.rtrim( Z13355PEQRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13356PEQRap", GXutil.ltrim( localUtil.ntoc( Z13356PEQRap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13357PEQCargo", GXutil.ltrim( localUtil.ntoc( Z13357PEQCargo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13358PEQObs", Z13358PEQObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13367PEQClicod", GXutil.ltrim( localUtil.ntoc( Z13367PEQClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13359PEQEstado", GXutil.ltrim( localUtil.ntoc( Z13359PEQEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13360PEQTipo", GXutil.ltrim( localUtil.ntoc( Z13360PEQTipo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13374PEQNumCol", GXutil.ltrim( localUtil.ntoc( Z13374PEQNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13372PEQGrabCod", GXutil.ltrim( localUtil.ntoc( Z13372PEQGrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_110", GXutil.ltrim( localUtil.ntoc( nGXsfl_110_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEQID", GXutil.ltrim( localUtil.ntoc( AV33PEQId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.tpeq000", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33PEQId,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","PEQId","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TPEQ000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Orden Grabacion PEQUES", "") ;
   }

   public void initializeNonKey1NX1829( )
   {
      A13368PEQCliNom = "" ;
      n13368PEQCliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", A13368PEQCliNom);
      A13352PEQFecEnt = GXutil.nullDate() ;
      n13352PEQFecEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13352PEQFecEnt", localUtil.format(A13352PEQFecEnt, "99/99/99"));
      A13353PEQDibCli = "" ;
      n13353PEQDibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13353PEQDibCli", A13353PEQDibCli);
      A13354PEQDibInt = 0 ;
      n13354PEQDibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13354PEQDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13354PEQDibInt), 8, 0));
      A13355PEQRef = "" ;
      n13355PEQRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13355PEQRef", A13355PEQRef);
      A13356PEQRap = (short)(0) ;
      n13356PEQRap = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13356PEQRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13356PEQRap), 4, 0));
      A13357PEQCargo = (byte)(0) ;
      n13357PEQCargo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13357PEQCargo", GXutil.str( A13357PEQCargo, 1, 0));
      A13358PEQObs = "" ;
      n13358PEQObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13358PEQObs", A13358PEQObs);
      A13367PEQClicod = 0 ;
      n13367PEQClicod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13367PEQClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13367PEQClicod), 6, 0));
      A13372PEQGrabCod = (short)(0) ;
      n13372PEQGrabCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13372PEQGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13372PEQGrabCod), 4, 0));
      A13373PEQGrabNom = "" ;
      n13373PEQGrabNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", A13373PEQGrabNom);
      A13374PEQNumCol = (short)(0) ;
      n13374PEQNumCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13374PEQNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13374PEQNumCol), 4, 0));
      A13351PEQFecha = GXutil.today( ) ;
      n13351PEQFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
      A13359PEQEstado = (byte)(0) ;
      n13359PEQEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
      A13360PEQTipo = (byte)(1) ;
      n13360PEQTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
      Z13368PEQCliNom = "" ;
      Z13351PEQFecha = GXutil.nullDate() ;
      Z13352PEQFecEnt = GXutil.nullDate() ;
      Z13353PEQDibCli = "" ;
      Z13354PEQDibInt = 0 ;
      Z13355PEQRef = "" ;
      Z13356PEQRap = (short)(0) ;
      Z13357PEQCargo = (byte)(0) ;
      Z13358PEQObs = "" ;
      Z13367PEQClicod = 0 ;
      Z13359PEQEstado = (byte)(0) ;
      Z13360PEQTipo = (byte)(0) ;
      Z13374PEQNumCol = (short)(0) ;
      Z13372PEQGrabCod = (short)(0) ;
   }

   public void initAll1NX1829( )
   {
      A13350PEQId = 0 ;
      n13350PEQId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
      initializeNonKey1NX1829( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13351PEQFecha = i13351PEQFecha ;
      n13351PEQFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13351PEQFecha", localUtil.format(A13351PEQFecha, "99/99/99"));
      A13359PEQEstado = i13359PEQEstado ;
      n13359PEQEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13359PEQEstado", GXutil.str( A13359PEQEstado, 1, 0));
      A13360PEQTipo = i13360PEQTipo ;
      n13360PEQTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
   }

   public void initializeNonKey1NX1830( )
   {
      A13361PEQColor = "" ;
      n13361PEQColor = false ;
      A13362PEQMalha = "" ;
      n13362PEQMalha = false ;
      A13363PEQMedida = "" ;
      n13363PEQMedida = false ;
      A13364PEQCob = DecimalUtil.ZERO ;
      n13364PEQCob = false ;
      A13365PEQPrecio = DecimalUtil.ZERO ;
      n13365PEQPrecio = false ;
      Z13361PEQColor = "" ;
      Z13362PEQMalha = "" ;
      Z13363PEQMedida = "" ;
      Z13364PEQCob = DecimalUtil.ZERO ;
      Z13365PEQPrecio = DecimalUtil.ZERO ;
   }

   public void initAll1NX1830( )
   {
      A13366PEQUEId = "" ;
      initializeNonKey1NX1830( ) ;
   }

   public void standaloneModalInsert1NX1830( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415102947", true, true);
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
      httpContext.AddJavascriptSource("tpeq000.js", "?202682415102947", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1830( )
   {
      edtPEQUEId_Enabled = defedtPEQUEId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEQUEId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEQUEId_Enabled), 5, 0), !bGXsfl_110_Refreshing);
   }

   public void startgridcontrol110( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1830, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1830_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13366PEQUEId));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQUEId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13361PEQColor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQColor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13362PEQMalha));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMalha_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13363PEQMedida));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQMedida_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13364PEQCob, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13365PEQPrecio, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPEQPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPEQId_Internalname = "PEQID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPEQFecha_Internalname = "PEQFECHA" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPEQFecEnt_Internalname = "PEQFECENT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPEQDibCli_Internalname = "PEQDIBCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPEQDibInt_Internalname = "PEQDIBINT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPEQRef_Internalname = "PEQREF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPEQRap_Internalname = "PEQRAP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      cmbPEQCargo.setInternalname( "PEQCARGO" );
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPEQObs_Internalname = "PEQOBS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPEQClicod_Internalname = "PEQCLICOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPEQCliNom_Internalname = "PEQCLINOM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPEQEstado_Internalname = "PEQESTADO" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      cmbPEQTipo.setInternalname( "PEQTIPO" );
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPEQGrabCod_Internalname = "PEQGRABCOD" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPEQGrabNom_Internalname = "PEQGRABNOM" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPEQNumCol_Internalname = "PEQNUMCOL" ;
      edtavnRcdDeleted_1830_Internalname = "vNRCDDELETED_1830" ;
      edtPEQUEId_Internalname = "PEQUEID" ;
      edtPEQColor_Internalname = "PEQCOLOR" ;
      edtPEQMalha_Internalname = "PEQMALHA" ;
      edtPEQMedida_Internalname = "PEQMEDIDA" ;
      edtPEQCob_Internalname = "PEQCOB" ;
      edtPEQPrecio_Internalname = "PEQPRECIO" ;
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
      Form.setCaption( httpContext.getMessage( "Orden Grabacion PEQUES", "") );
      edtPEQPrecio_Jsonclick = "" ;
      edtPEQCob_Jsonclick = "" ;
      edtPEQMedida_Jsonclick = "" ;
      edtPEQMalha_Jsonclick = "" ;
      edtPEQColor_Jsonclick = "" ;
      edtPEQUEId_Jsonclick = "" ;
      edtavnRcdDeleted_1830_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPEQPrecio_Enabled = 1 ;
      edtPEQCob_Enabled = 1 ;
      edtPEQMedida_Enabled = 1 ;
      edtPEQMalha_Enabled = 1 ;
      edtPEQColor_Enabled = 1 ;
      edtPEQUEId_Enabled = 1 ;
      edtavnRcdDeleted_1830_Enabled = 1 ;
      edtPEQNumCol_Jsonclick = "" ;
      edtPEQNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtPEQNumCol_Enabled = 1 ;
      edtPEQGrabNom_Jsonclick = "" ;
      edtPEQGrabNom_Backcolor = (int)(0xFFFFFF) ;
      edtPEQGrabNom_Enabled = 0 ;
      edtPEQGrabCod_Jsonclick = "" ;
      edtPEQGrabCod_Backcolor = (int)(0xFFFFFF) ;
      edtPEQGrabCod_Enabled = 1 ;
      cmbPEQTipo.setJsonclick( "" );
      cmbPEQTipo.setEnabled( 1 );
      cmbPEQTipo.setIBackground( (int)(0xFFFFFF) );
      edtPEQEstado_Jsonclick = "" ;
      edtPEQEstado_Backcolor = (int)(0xFFFFFF) ;
      edtPEQEstado_Enabled = 1 ;
      edtPEQCliNom_Jsonclick = "" ;
      edtPEQCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtPEQCliNom_Enabled = 1 ;
      edtPEQClicod_Jsonclick = "" ;
      edtPEQClicod_Backcolor = (int)(0xFFFFFF) ;
      edtPEQClicod_Enabled = 1 ;
      edtPEQObs_Backcolor = (int)(0xFFFFFF) ;
      edtPEQObs_Enabled = 1 ;
      cmbPEQCargo.setJsonclick( "" );
      cmbPEQCargo.setEnabled( 1 );
      cmbPEQCargo.setIBackground( (int)(0xFFFFFF) );
      edtPEQRap_Jsonclick = "" ;
      edtPEQRap_Backcolor = (int)(0xFFFFFF) ;
      edtPEQRap_Enabled = 1 ;
      edtPEQRef_Jsonclick = "" ;
      edtPEQRef_Backcolor = (int)(0xFFFFFF) ;
      edtPEQRef_Enabled = 1 ;
      edtPEQDibInt_Jsonclick = "" ;
      edtPEQDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtPEQDibInt_Enabled = 1 ;
      edtPEQDibCli_Jsonclick = "" ;
      edtPEQDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtPEQDibCli_Enabled = 1 ;
      edtPEQFecEnt_Jsonclick = "" ;
      edtPEQFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtPEQFecEnt_Enabled = 1 ;
      edtPEQFecha_Jsonclick = "" ;
      edtPEQFecha_Backcolor = (int)(0xFFFFFF) ;
      edtPEQFecha_Enabled = 1 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtPEQId_Jsonclick = "" ;
      edtPEQId_Backcolor = (int)(0xFFFFFF) ;
      edtPEQId_Enabled = 1 ;
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

   public void xc_9_1NX1829( )
   {
      if ( isIns( )  && (0==A13350PEQId) && true /* Level */ && true /* After */ )
      {
         GXv_int7[0] = (int)(A13350PEQId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEQ000", ""), GXv_int7) ;
         A13350PEQId = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13350PEQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13350PEQId), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_1NX1829( String A396EmprCod ,
                              int A13367PEQClicod )
   {
      if ( A13367PEQClicod > 0 )
      {
         GXv_char4[0] = A13368PEQCliNom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A13367PEQClicod, GXv_char4) ;
         A13368PEQCliNom = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", A13368PEQCliNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13368PEQCliNom))+"\"") ;
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
      subsflControlProps_1101830( ) ;
      while ( nGXsfl_110_idx <= nRC_GXsfl_110 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NX1830( ) ;
         standaloneModal1NX1830( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NX1830( ) ;
         nGXsfl_110_idx = (int)(nGXsfl_110_idx+1) ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1101830( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbPEQCargo.setName( "PEQCARGO" );
      cmbPEQCargo.setWebtags( "" );
      cmbPEQCargo.addItem("0", httpContext.getMessage( "Empresa", ""), (short)(0));
      cmbPEQCargo.addItem("1", httpContext.getMessage( "Cliente", ""), (short)(0));
      if ( cmbPEQCargo.getItemCount() > 0 )
      {
         A13357PEQCargo = (byte)(GXutil.lval( cmbPEQCargo.getValidValue(GXutil.trim( GXutil.str( A13357PEQCargo, 1, 0))))) ;
         n13357PEQCargo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13357PEQCargo", GXutil.str( A13357PEQCargo, 1, 0));
      }
      cmbPEQTipo.setName( "PEQTIPO" );
      cmbPEQTipo.setWebtags( "" );
      cmbPEQTipo.addItem("1", httpContext.getMessage( "Peques", ""), (short)(0));
      cmbPEQTipo.addItem("2", httpContext.getMessage( "Rotura, Regrabacion", ""), (short)(0));
      if ( cmbPEQTipo.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A13360PEQTipo) )
         {
            A13360PEQTipo = (byte)(1) ;
            n13360PEQTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13360PEQTipo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13360PEQTipo), 2, 0));
         }
      }
      /* End function init_web_controls */
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

   public void valid_Peqclicod( )
   {
      n13367PEQClicod = false ;
      n13368PEQCliNom = false ;
      if ( A13367PEQClicod > 0 )
      {
         GXv_char4[0] = A13368PEQCliNom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A13367PEQClicod, GXv_char4) ;
         tpeq000_impl.this.A13368PEQCliNom = GXv_char4[0] ;
         A13368PEQCliNom = this.A13368PEQCliNom ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13368PEQCliNom", GXutil.rtrim( A13368PEQCliNom));
   }

   public void valid_Peqgrabcod( )
   {
      n13372PEQGrabCod = false ;
      n13373PEQGrabNom = false ;
      /* Using cursor T01NX16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n13372PEQGrabCod), Short.valueOf(A13372PEQGrabCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grabador", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEQGRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQGrabCod_Internalname ;
      }
      A13373PEQGrabNom = T01NX16_A13373PEQGrabNom[0] ;
      n13373PEQGrabNom = T01NX16_n13373PEQGrabNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13373PEQGrabNom", GXutil.rtrim( A13373PEQGrabNom));
   }

   public void valid_Pequeid( )
   {
      if ( true /* Level */ && (GXutil.strcmp("", A13366PEQUEId)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, "PEQUEID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPEQUEId_Internalname ;
      }
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33PEQId',fld:'vPEQID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PEQID","{handler:'valid_Peqid',iparms:[]");
      setEventMetadata("VALID_PEQID",",oparms:[]}");
      setEventMetadata("VALID_PEQDIBCLI","{handler:'valid_Peqdibcli',iparms:[]");
      setEventMetadata("VALID_PEQDIBCLI",",oparms:[]}");
      setEventMetadata("VALID_PEQDIBINT","{handler:'valid_Peqdibint',iparms:[]");
      setEventMetadata("VALID_PEQDIBINT",",oparms:[]}");
      setEventMetadata("VALID_PEQCARGO","{handler:'valid_Peqcargo',iparms:[]");
      setEventMetadata("VALID_PEQCARGO",",oparms:[]}");
      setEventMetadata("VALID_PEQCLICOD","{handler:'valid_Peqclicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13367PEQClicod',fld:'PEQCLICOD',pic:'ZZZZZ9'},{av:'A13368PEQCliNom',fld:'PEQCLINOM',pic:''}]");
      setEventMetadata("VALID_PEQCLICOD",",oparms:[{av:'A13368PEQCliNom',fld:'PEQCLINOM',pic:''}]}");
      setEventMetadata("VALID_PEQCLINOM","{handler:'valid_Peqclinom',iparms:[]");
      setEventMetadata("VALID_PEQCLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEQGRABCOD","{handler:'valid_Peqgrabcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13372PEQGrabCod',fld:'PEQGRABCOD',pic:'ZZZ9'},{av:'A13373PEQGrabNom',fld:'PEQGRABNOM',pic:''}]");
      setEventMetadata("VALID_PEQGRABCOD",",oparms:[{av:'A13373PEQGrabNom',fld:'PEQGRABNOM',pic:''}]}");
      setEventMetadata("VALID_PEQUEID","{handler:'valid_Pequeid',iparms:[{av:'A13366PEQUEId',fld:'PEQUEID',pic:''}]");
      setEventMetadata("VALID_PEQUEID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Peqprecio',iparms:[]");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z13368PEQCliNom = "" ;
      Z13351PEQFecha = GXutil.nullDate() ;
      Z13352PEQFecEnt = GXutil.nullDate() ;
      Z13353PEQDibCli = "" ;
      Z13355PEQRef = "" ;
      Z13358PEQObs = "" ;
      Z13366PEQUEId = "" ;
      Z13361PEQColor = "" ;
      Z13362PEQMalha = "" ;
      Z13363PEQMedida = "" ;
      Z13364PEQCob = DecimalUtil.ZERO ;
      Z13365PEQPrecio = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
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
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A13351PEQFecha = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      A13352PEQFecEnt = GXutil.nullDate() ;
      lblTextblock6_Jsonclick = "" ;
      A13353PEQDibCli = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A13355PEQRef = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13358PEQObs = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A13368PEQCliNom = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A13373PEQGrabNom = "" ;
      lblTextblock18_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1830 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1829 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A13366PEQUEId = "" ;
      A13361PEQColor = "" ;
      A13362PEQMalha = "" ;
      A13363PEQMedida = "" ;
      A13364PEQCob = DecimalUtil.ZERO ;
      A13365PEQPrecio = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      Z407EmprNom = "" ;
      Z13373PEQGrabNom = "" ;
      T01NX6_A407EmprNom = new String[] {""} ;
      T01NX6_n407EmprNom = new boolean[] {false} ;
      T01NX8_A13350PEQId = new long[1] ;
      T01NX8_n13350PEQId = new boolean[] {false} ;
      T01NX8_A13368PEQCliNom = new String[] {""} ;
      T01NX8_n13368PEQCliNom = new boolean[] {false} ;
      T01NX8_A407EmprNom = new String[] {""} ;
      T01NX8_n407EmprNom = new boolean[] {false} ;
      T01NX8_A13351PEQFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01NX8_n13351PEQFecha = new boolean[] {false} ;
      T01NX8_A13352PEQFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01NX8_n13352PEQFecEnt = new boolean[] {false} ;
      T01NX8_A13353PEQDibCli = new String[] {""} ;
      T01NX8_n13353PEQDibCli = new boolean[] {false} ;
      T01NX8_A13354PEQDibInt = new int[1] ;
      T01NX8_n13354PEQDibInt = new boolean[] {false} ;
      T01NX8_A13355PEQRef = new String[] {""} ;
      T01NX8_n13355PEQRef = new boolean[] {false} ;
      T01NX8_A13356PEQRap = new short[1] ;
      T01NX8_n13356PEQRap = new boolean[] {false} ;
      T01NX8_A13357PEQCargo = new byte[1] ;
      T01NX8_n13357PEQCargo = new boolean[] {false} ;
      T01NX8_A13358PEQObs = new String[] {""} ;
      T01NX8_n13358PEQObs = new boolean[] {false} ;
      T01NX8_A13367PEQClicod = new int[1] ;
      T01NX8_n13367PEQClicod = new boolean[] {false} ;
      T01NX8_A13359PEQEstado = new byte[1] ;
      T01NX8_n13359PEQEstado = new boolean[] {false} ;
      T01NX8_A13360PEQTipo = new byte[1] ;
      T01NX8_n13360PEQTipo = new boolean[] {false} ;
      T01NX8_A13373PEQGrabNom = new String[] {""} ;
      T01NX8_n13373PEQGrabNom = new boolean[] {false} ;
      T01NX8_A13374PEQNumCol = new short[1] ;
      T01NX8_n13374PEQNumCol = new boolean[] {false} ;
      T01NX8_A396EmprCod = new String[] {""} ;
      T01NX8_A13372PEQGrabCod = new short[1] ;
      T01NX8_n13372PEQGrabCod = new boolean[] {false} ;
      T01NX7_A13373PEQGrabNom = new String[] {""} ;
      T01NX7_n13373PEQGrabNom = new boolean[] {false} ;
      T01NX9_A13373PEQGrabNom = new String[] {""} ;
      T01NX9_n13373PEQGrabNom = new boolean[] {false} ;
      T01NX10_A396EmprCod = new String[] {""} ;
      T01NX10_A13350PEQId = new long[1] ;
      T01NX10_n13350PEQId = new boolean[] {false} ;
      T01NX5_A13350PEQId = new long[1] ;
      T01NX5_n13350PEQId = new boolean[] {false} ;
      T01NX5_A13368PEQCliNom = new String[] {""} ;
      T01NX5_n13368PEQCliNom = new boolean[] {false} ;
      T01NX5_A13351PEQFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01NX5_n13351PEQFecha = new boolean[] {false} ;
      T01NX5_A13352PEQFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01NX5_n13352PEQFecEnt = new boolean[] {false} ;
      T01NX5_A13353PEQDibCli = new String[] {""} ;
      T01NX5_n13353PEQDibCli = new boolean[] {false} ;
      T01NX5_A13354PEQDibInt = new int[1] ;
      T01NX5_n13354PEQDibInt = new boolean[] {false} ;
      T01NX5_A13355PEQRef = new String[] {""} ;
      T01NX5_n13355PEQRef = new boolean[] {false} ;
      T01NX5_A13356PEQRap = new short[1] ;
      T01NX5_n13356PEQRap = new boolean[] {false} ;
      T01NX5_A13357PEQCargo = new byte[1] ;
      T01NX5_n13357PEQCargo = new boolean[] {false} ;
      T01NX5_A13358PEQObs = new String[] {""} ;
      T01NX5_n13358PEQObs = new boolean[] {false} ;
      T01NX5_A13367PEQClicod = new int[1] ;
      T01NX5_n13367PEQClicod = new boolean[] {false} ;
      T01NX5_A13359PEQEstado = new byte[1] ;
      T01NX5_n13359PEQEstado = new boolean[] {false} ;
      T01NX5_A13360PEQTipo = new byte[1] ;
      T01NX5_n13360PEQTipo = new boolean[] {false} ;
      T01NX5_A13374PEQNumCol = new short[1] ;
      T01NX5_n13374PEQNumCol = new boolean[] {false} ;
      T01NX5_A396EmprCod = new String[] {""} ;
      T01NX5_A13372PEQGrabCod = new short[1] ;
      T01NX5_n13372PEQGrabCod = new boolean[] {false} ;
      T01NX11_A396EmprCod = new String[] {""} ;
      T01NX11_A13350PEQId = new long[1] ;
      T01NX11_n13350PEQId = new boolean[] {false} ;
      T01NX12_A396EmprCod = new String[] {""} ;
      T01NX12_A13350PEQId = new long[1] ;
      T01NX12_n13350PEQId = new boolean[] {false} ;
      T01NX4_A13350PEQId = new long[1] ;
      T01NX4_n13350PEQId = new boolean[] {false} ;
      T01NX4_A13368PEQCliNom = new String[] {""} ;
      T01NX4_n13368PEQCliNom = new boolean[] {false} ;
      T01NX4_A13351PEQFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01NX4_n13351PEQFecha = new boolean[] {false} ;
      T01NX4_A13352PEQFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01NX4_n13352PEQFecEnt = new boolean[] {false} ;
      T01NX4_A13353PEQDibCli = new String[] {""} ;
      T01NX4_n13353PEQDibCli = new boolean[] {false} ;
      T01NX4_A13354PEQDibInt = new int[1] ;
      T01NX4_n13354PEQDibInt = new boolean[] {false} ;
      T01NX4_A13355PEQRef = new String[] {""} ;
      T01NX4_n13355PEQRef = new boolean[] {false} ;
      T01NX4_A13356PEQRap = new short[1] ;
      T01NX4_n13356PEQRap = new boolean[] {false} ;
      T01NX4_A13357PEQCargo = new byte[1] ;
      T01NX4_n13357PEQCargo = new boolean[] {false} ;
      T01NX4_A13358PEQObs = new String[] {""} ;
      T01NX4_n13358PEQObs = new boolean[] {false} ;
      T01NX4_A13367PEQClicod = new int[1] ;
      T01NX4_n13367PEQClicod = new boolean[] {false} ;
      T01NX4_A13359PEQEstado = new byte[1] ;
      T01NX4_n13359PEQEstado = new boolean[] {false} ;
      T01NX4_A13360PEQTipo = new byte[1] ;
      T01NX4_n13360PEQTipo = new boolean[] {false} ;
      T01NX4_A13374PEQNumCol = new short[1] ;
      T01NX4_n13374PEQNumCol = new boolean[] {false} ;
      T01NX4_A396EmprCod = new String[] {""} ;
      T01NX4_A13372PEQGrabCod = new short[1] ;
      T01NX4_n13372PEQGrabCod = new boolean[] {false} ;
      T01NX16_A13373PEQGrabNom = new String[] {""} ;
      T01NX16_n13373PEQGrabNom = new boolean[] {false} ;
      T01NX17_A396EmprCod = new String[] {""} ;
      T01NX17_A13324LDESID = new int[1] ;
      T01NX18_A396EmprCod = new String[] {""} ;
      T01NX18_A13350PEQId = new long[1] ;
      T01NX18_n13350PEQId = new boolean[] {false} ;
      T01NX19_A396EmprCod = new String[] {""} ;
      T01NX19_A13350PEQId = new long[1] ;
      T01NX19_n13350PEQId = new boolean[] {false} ;
      T01NX19_A13366PEQUEId = new String[] {""} ;
      T01NX19_A13361PEQColor = new String[] {""} ;
      T01NX19_n13361PEQColor = new boolean[] {false} ;
      T01NX19_A13362PEQMalha = new String[] {""} ;
      T01NX19_n13362PEQMalha = new boolean[] {false} ;
      T01NX19_A13363PEQMedida = new String[] {""} ;
      T01NX19_n13363PEQMedida = new boolean[] {false} ;
      T01NX19_A13364PEQCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NX19_n13364PEQCob = new boolean[] {false} ;
      T01NX19_A13365PEQPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NX19_n13365PEQPrecio = new boolean[] {false} ;
      T01NX20_A396EmprCod = new String[] {""} ;
      T01NX20_A13350PEQId = new long[1] ;
      T01NX20_n13350PEQId = new boolean[] {false} ;
      T01NX20_A13366PEQUEId = new String[] {""} ;
      T01NX3_A396EmprCod = new String[] {""} ;
      T01NX3_A13350PEQId = new long[1] ;
      T01NX3_n13350PEQId = new boolean[] {false} ;
      T01NX3_A13366PEQUEId = new String[] {""} ;
      T01NX3_A13361PEQColor = new String[] {""} ;
      T01NX3_n13361PEQColor = new boolean[] {false} ;
      T01NX3_A13362PEQMalha = new String[] {""} ;
      T01NX3_n13362PEQMalha = new boolean[] {false} ;
      T01NX3_A13363PEQMedida = new String[] {""} ;
      T01NX3_n13363PEQMedida = new boolean[] {false} ;
      T01NX3_A13364PEQCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NX3_n13364PEQCob = new boolean[] {false} ;
      T01NX3_A13365PEQPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NX3_n13365PEQPrecio = new boolean[] {false} ;
      T01NX2_A396EmprCod = new String[] {""} ;
      T01NX2_A13350PEQId = new long[1] ;
      T01NX2_n13350PEQId = new boolean[] {false} ;
      T01NX2_A13366PEQUEId = new String[] {""} ;
      T01NX2_A13361PEQColor = new String[] {""} ;
      T01NX2_n13361PEQColor = new boolean[] {false} ;
      T01NX2_A13362PEQMalha = new String[] {""} ;
      T01NX2_n13362PEQMalha = new boolean[] {false} ;
      T01NX2_A13363PEQMedida = new String[] {""} ;
      T01NX2_n13363PEQMedida = new boolean[] {false} ;
      T01NX2_A13364PEQCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NX2_n13364PEQCob = new boolean[] {false} ;
      T01NX2_A13365PEQPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NX2_n13365PEQPrecio = new boolean[] {false} ;
      T01NX24_A396EmprCod = new String[] {""} ;
      T01NX24_A13350PEQId = new long[1] ;
      T01NX24_n13350PEQId = new boolean[] {false} ;
      T01NX24_A13366PEQUEId = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13351PEQFecha = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int7 = new int[1] ;
      GXv_char4 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpeq000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpeq000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpeq000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpeq000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpeq000__default(),
         new Object[] {
             new Object[] {
            T01NX2_A396EmprCod, T01NX2_A13350PEQId, T01NX2_A13366PEQUEId, T01NX2_A13361PEQColor, T01NX2_n13361PEQColor, T01NX2_A13362PEQMalha, T01NX2_n13362PEQMalha, T01NX2_A13363PEQMedida, T01NX2_n13363PEQMedida, T01NX2_A13364PEQCob,
            T01NX2_n13364PEQCob, T01NX2_A13365PEQPrecio, T01NX2_n13365PEQPrecio
            }
            , new Object[] {
            T01NX3_A396EmprCod, T01NX3_A13350PEQId, T01NX3_A13366PEQUEId, T01NX3_A13361PEQColor, T01NX3_n13361PEQColor, T01NX3_A13362PEQMalha, T01NX3_n13362PEQMalha, T01NX3_A13363PEQMedida, T01NX3_n13363PEQMedida, T01NX3_A13364PEQCob,
            T01NX3_n13364PEQCob, T01NX3_A13365PEQPrecio, T01NX3_n13365PEQPrecio
            }
            , new Object[] {
            T01NX4_A13350PEQId, T01NX4_A13368PEQCliNom, T01NX4_n13368PEQCliNom, T01NX4_A13351PEQFecha, T01NX4_n13351PEQFecha, T01NX4_A13352PEQFecEnt, T01NX4_n13352PEQFecEnt, T01NX4_A13353PEQDibCli, T01NX4_n13353PEQDibCli, T01NX4_A13354PEQDibInt,
            T01NX4_n13354PEQDibInt, T01NX4_A13355PEQRef, T01NX4_n13355PEQRef, T01NX4_A13356PEQRap, T01NX4_n13356PEQRap, T01NX4_A13357PEQCargo, T01NX4_n13357PEQCargo, T01NX4_A13358PEQObs, T01NX4_n13358PEQObs, T01NX4_A13367PEQClicod,
            T01NX4_n13367PEQClicod, T01NX4_A13359PEQEstado, T01NX4_n13359PEQEstado, T01NX4_A13360PEQTipo, T01NX4_n13360PEQTipo, T01NX4_A13374PEQNumCol, T01NX4_n13374PEQNumCol, T01NX4_A396EmprCod, T01NX4_A13372PEQGrabCod, T01NX4_n13372PEQGrabCod
            }
            , new Object[] {
            T01NX5_A13350PEQId, T01NX5_A13368PEQCliNom, T01NX5_n13368PEQCliNom, T01NX5_A13351PEQFecha, T01NX5_n13351PEQFecha, T01NX5_A13352PEQFecEnt, T01NX5_n13352PEQFecEnt, T01NX5_A13353PEQDibCli, T01NX5_n13353PEQDibCli, T01NX5_A13354PEQDibInt,
            T01NX5_n13354PEQDibInt, T01NX5_A13355PEQRef, T01NX5_n13355PEQRef, T01NX5_A13356PEQRap, T01NX5_n13356PEQRap, T01NX5_A13357PEQCargo, T01NX5_n13357PEQCargo, T01NX5_A13358PEQObs, T01NX5_n13358PEQObs, T01NX5_A13367PEQClicod,
            T01NX5_n13367PEQClicod, T01NX5_A13359PEQEstado, T01NX5_n13359PEQEstado, T01NX5_A13360PEQTipo, T01NX5_n13360PEQTipo, T01NX5_A13374PEQNumCol, T01NX5_n13374PEQNumCol, T01NX5_A396EmprCod, T01NX5_A13372PEQGrabCod, T01NX5_n13372PEQGrabCod
            }
            , new Object[] {
            T01NX6_A407EmprNom, T01NX6_n407EmprNom
            }
            , new Object[] {
            T01NX7_A13373PEQGrabNom, T01NX7_n13373PEQGrabNom
            }
            , new Object[] {
            T01NX8_A13350PEQId, T01NX8_A13368PEQCliNom, T01NX8_n13368PEQCliNom, T01NX8_A407EmprNom, T01NX8_n407EmprNom, T01NX8_A13351PEQFecha, T01NX8_n13351PEQFecha, T01NX8_A13352PEQFecEnt, T01NX8_n13352PEQFecEnt, T01NX8_A13353PEQDibCli,
            T01NX8_n13353PEQDibCli, T01NX8_A13354PEQDibInt, T01NX8_n13354PEQDibInt, T01NX8_A13355PEQRef, T01NX8_n13355PEQRef, T01NX8_A13356PEQRap, T01NX8_n13356PEQRap, T01NX8_A13357PEQCargo, T01NX8_n13357PEQCargo, T01NX8_A13358PEQObs,
            T01NX8_n13358PEQObs, T01NX8_A13367PEQClicod, T01NX8_n13367PEQClicod, T01NX8_A13359PEQEstado, T01NX8_n13359PEQEstado, T01NX8_A13360PEQTipo, T01NX8_n13360PEQTipo, T01NX8_A13373PEQGrabNom, T01NX8_n13373PEQGrabNom, T01NX8_A13374PEQNumCol,
            T01NX8_n13374PEQNumCol, T01NX8_A396EmprCod, T01NX8_A13372PEQGrabCod, T01NX8_n13372PEQGrabCod
            }
            , new Object[] {
            T01NX9_A13373PEQGrabNom, T01NX9_n13373PEQGrabNom
            }
            , new Object[] {
            T01NX10_A396EmprCod, T01NX10_A13350PEQId
            }
            , new Object[] {
            T01NX11_A396EmprCod, T01NX11_A13350PEQId
            }
            , new Object[] {
            T01NX12_A396EmprCod, T01NX12_A13350PEQId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NX16_A13373PEQGrabNom, T01NX16_n13373PEQGrabNom
            }
            , new Object[] {
            T01NX17_A396EmprCod, T01NX17_A13324LDESID
            }
            , new Object[] {
            T01NX18_A396EmprCod, T01NX18_A13350PEQId
            }
            , new Object[] {
            T01NX19_A396EmprCod, T01NX19_A13350PEQId, T01NX19_A13366PEQUEId, T01NX19_A13361PEQColor, T01NX19_n13361PEQColor, T01NX19_A13362PEQMalha, T01NX19_n13362PEQMalha, T01NX19_A13363PEQMedida, T01NX19_n13363PEQMedida, T01NX19_A13364PEQCob,
            T01NX19_n13364PEQCob, T01NX19_A13365PEQPrecio, T01NX19_n13365PEQPrecio
            }
            , new Object[] {
            T01NX20_A396EmprCod, T01NX20_A13350PEQId, T01NX20_A13366PEQUEId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NX24_A396EmprCod, T01NX24_A13350PEQId, T01NX24_A13366PEQUEId
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TPEQ000" ;
      Z13360PEQTipo = (byte)(1) ;
      n13360PEQTipo = false ;
      A13360PEQTipo = (byte)(1) ;
      n13360PEQTipo = false ;
      i13360PEQTipo = (byte)(1) ;
      n13360PEQTipo = false ;
      Z13359PEQEstado = (byte)(0) ;
      n13359PEQEstado = false ;
      A13359PEQEstado = (byte)(0) ;
      n13359PEQEstado = false ;
      i13359PEQEstado = (byte)(0) ;
      n13359PEQEstado = false ;
      Z13351PEQFecha = GXutil.today( ) ;
      n13351PEQFecha = false ;
      A13351PEQFecha = GXutil.today( ) ;
      n13351PEQFecha = false ;
      i13351PEQFecha = GXutil.today( ) ;
      n13351PEQFecha = false ;
   }

   private byte Z13357PEQCargo ;
   private byte Z13359PEQEstado ;
   private byte Z13360PEQTipo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13357PEQCargo ;
   private byte A13360PEQTipo ;
   private byte A13359PEQEstado ;
   private byte Gx_BScreen ;
   private byte AV34ExisteCont ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i13359PEQEstado ;
   private byte i13360PEQTipo ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z13356PEQRap ;
   private short Z13374PEQNumCol ;
   private short Z13372PEQGrabCod ;
   private short nRcdDeleted_1830 ;
   private short nRcdExists_1830 ;
   private short nIsMod_1830 ;
   private short A13372PEQGrabCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13356PEQRap ;
   private short A13374PEQNumCol ;
   private short nBlankRcdCount1830 ;
   private short RcdFound1830 ;
   private short nBlankRcdUsr1830 ;
   private short RcdFound1829 ;
   private short nIsDirty_1829 ;
   private short nIsDirty_1830 ;
   private int Z13354PEQDibInt ;
   private int Z13367PEQClicod ;
   private int nRC_GXsfl_110 ;
   private int nGXsfl_110_idx=1 ;
   private int A13367PEQClicod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPEQId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPEQFecha_Enabled ;
   private int edtPEQFecEnt_Enabled ;
   private int edtPEQDibCli_Enabled ;
   private int A13354PEQDibInt ;
   private int edtPEQDibInt_Enabled ;
   private int edtPEQRef_Enabled ;
   private int edtPEQRap_Enabled ;
   private int edtPEQObs_Enabled ;
   private int edtPEQClicod_Enabled ;
   private int edtPEQCliNom_Enabled ;
   private int edtPEQEstado_Enabled ;
   private int edtPEQGrabCod_Enabled ;
   private int edtPEQGrabNom_Enabled ;
   private int edtPEQNumCol_Enabled ;
   private int edtavnRcdDeleted_1830_Enabled ;
   private int edtPEQUEId_Enabled ;
   private int edtPEQColor_Enabled ;
   private int edtPEQMalha_Enabled ;
   private int edtPEQMedida_Enabled ;
   private int edtPEQCob_Enabled ;
   private int edtPEQPrecio_Enabled ;
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
   private int defedtPEQUEId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPEQNumCol_Backcolor ;
   private int edtPEQGrabNom_Backcolor ;
   private int edtPEQGrabCod_Backcolor ;
   private int edtPEQEstado_Backcolor ;
   private int edtPEQCliNom_Backcolor ;
   private int edtPEQClicod_Backcolor ;
   private int edtPEQObs_Backcolor ;
   private int edtPEQRap_Backcolor ;
   private int edtPEQRef_Backcolor ;
   private int edtPEQDibInt_Backcolor ;
   private int edtPEQDibCli_Backcolor ;
   private int edtPEQFecEnt_Backcolor ;
   private int edtPEQFecha_Backcolor ;
   private int edtPEQId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int7[] ;
   private long wcpOAV33PEQId ;
   private long Z13350PEQId ;
   private long AV33PEQId ;
   private long A13350PEQId ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13364PEQCob ;
   private java.math.BigDecimal Z13365PEQPrecio ;
   private java.math.BigDecimal A13364PEQCob ;
   private java.math.BigDecimal A13365PEQPrecio ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z13368PEQCliNom ;
   private String Z13353PEQDibCli ;
   private String Z13355PEQRef ;
   private String Z13366PEQUEId ;
   private String Z13361PEQColor ;
   private String Z13362PEQMalha ;
   private String Z13363PEQMedida ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPEQId_Internalname ;
   private String sGXsfl_110_idx="0001" ;
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
   private String edtPEQId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPEQFecha_Internalname ;
   private String edtPEQFecha_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPEQFecEnt_Internalname ;
   private String edtPEQFecEnt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPEQDibCli_Internalname ;
   private String A13353PEQDibCli ;
   private String edtPEQDibCli_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPEQDibInt_Internalname ;
   private String edtPEQDibInt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPEQRef_Internalname ;
   private String A13355PEQRef ;
   private String edtPEQRef_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPEQRap_Internalname ;
   private String edtPEQRap_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPEQObs_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPEQClicod_Internalname ;
   private String edtPEQClicod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPEQCliNom_Internalname ;
   private String A13368PEQCliNom ;
   private String edtPEQCliNom_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPEQEstado_Internalname ;
   private String edtPEQEstado_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPEQGrabCod_Internalname ;
   private String edtPEQGrabCod_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPEQGrabNom_Internalname ;
   private String A13373PEQGrabNom ;
   private String edtPEQGrabNom_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPEQNumCol_Internalname ;
   private String edtPEQNumCol_Jsonclick ;
   private String sMode1830 ;
   private String edtavnRcdDeleted_1830_Internalname ;
   private String edtPEQUEId_Internalname ;
   private String edtPEQColor_Internalname ;
   private String edtPEQMalha_Internalname ;
   private String edtPEQMedida_Internalname ;
   private String edtPEQCob_Internalname ;
   private String edtPEQPrecio_Internalname ;
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
   private String hsh ;
   private String sMode1829 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A13366PEQUEId ;
   private String A13361PEQColor ;
   private String A13362PEQMalha ;
   private String A13363PEQMedida ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z13373PEQGrabNom ;
   private String sGXsfl_110_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1830_Jsonclick ;
   private String edtPEQUEId_Jsonclick ;
   private String edtPEQColor_Jsonclick ;
   private String edtPEQMalha_Jsonclick ;
   private String edtPEQMedida_Jsonclick ;
   private String edtPEQCob_Jsonclick ;
   private String edtPEQPrecio_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private java.util.Date Z13351PEQFecha ;
   private java.util.Date Z13352PEQFecEnt ;
   private java.util.Date A13351PEQFecha ;
   private java.util.Date A13352PEQFecEnt ;
   private java.util.Date i13351PEQFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13367PEQClicod ;
   private boolean n13372PEQGrabCod ;
   private boolean wbErr ;
   private boolean n13357PEQCargo ;
   private boolean n13360PEQTipo ;
   private boolean bGXsfl_110_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13350PEQId ;
   private boolean n13351PEQFecha ;
   private boolean n13352PEQFecEnt ;
   private boolean n13353PEQDibCli ;
   private boolean n13354PEQDibInt ;
   private boolean n13355PEQRef ;
   private boolean n13356PEQRap ;
   private boolean n13358PEQObs ;
   private boolean n13368PEQCliNom ;
   private boolean n13359PEQEstado ;
   private boolean n13373PEQGrabNom ;
   private boolean n13374PEQNumCol ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n13361PEQColor ;
   private boolean n13362PEQMalha ;
   private boolean n13363PEQMedida ;
   private boolean n13364PEQCob ;
   private boolean n13365PEQPrecio ;
   private String Z13358PEQObs ;
   private String A13358PEQObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPEQCargo ;
   private HTMLChoice cmbPEQTipo ;
   private IDataStoreProvider pr_default ;
   private String[] T01NX6_A407EmprNom ;
   private boolean[] T01NX6_n407EmprNom ;
   private long[] T01NX8_A13350PEQId ;
   private boolean[] T01NX8_n13350PEQId ;
   private String[] T01NX8_A13368PEQCliNom ;
   private boolean[] T01NX8_n13368PEQCliNom ;
   private String[] T01NX8_A407EmprNom ;
   private boolean[] T01NX8_n407EmprNom ;
   private java.util.Date[] T01NX8_A13351PEQFecha ;
   private boolean[] T01NX8_n13351PEQFecha ;
   private java.util.Date[] T01NX8_A13352PEQFecEnt ;
   private boolean[] T01NX8_n13352PEQFecEnt ;
   private String[] T01NX8_A13353PEQDibCli ;
   private boolean[] T01NX8_n13353PEQDibCli ;
   private int[] T01NX8_A13354PEQDibInt ;
   private boolean[] T01NX8_n13354PEQDibInt ;
   private String[] T01NX8_A13355PEQRef ;
   private boolean[] T01NX8_n13355PEQRef ;
   private short[] T01NX8_A13356PEQRap ;
   private boolean[] T01NX8_n13356PEQRap ;
   private byte[] T01NX8_A13357PEQCargo ;
   private boolean[] T01NX8_n13357PEQCargo ;
   private String[] T01NX8_A13358PEQObs ;
   private boolean[] T01NX8_n13358PEQObs ;
   private int[] T01NX8_A13367PEQClicod ;
   private boolean[] T01NX8_n13367PEQClicod ;
   private byte[] T01NX8_A13359PEQEstado ;
   private boolean[] T01NX8_n13359PEQEstado ;
   private byte[] T01NX8_A13360PEQTipo ;
   private boolean[] T01NX8_n13360PEQTipo ;
   private String[] T01NX8_A13373PEQGrabNom ;
   private boolean[] T01NX8_n13373PEQGrabNom ;
   private short[] T01NX8_A13374PEQNumCol ;
   private boolean[] T01NX8_n13374PEQNumCol ;
   private String[] T01NX8_A396EmprCod ;
   private short[] T01NX8_A13372PEQGrabCod ;
   private boolean[] T01NX8_n13372PEQGrabCod ;
   private String[] T01NX7_A13373PEQGrabNom ;
   private boolean[] T01NX7_n13373PEQGrabNom ;
   private String[] T01NX9_A13373PEQGrabNom ;
   private boolean[] T01NX9_n13373PEQGrabNom ;
   private String[] T01NX10_A396EmprCod ;
   private long[] T01NX10_A13350PEQId ;
   private boolean[] T01NX10_n13350PEQId ;
   private long[] T01NX5_A13350PEQId ;
   private boolean[] T01NX5_n13350PEQId ;
   private String[] T01NX5_A13368PEQCliNom ;
   private boolean[] T01NX5_n13368PEQCliNom ;
   private java.util.Date[] T01NX5_A13351PEQFecha ;
   private boolean[] T01NX5_n13351PEQFecha ;
   private java.util.Date[] T01NX5_A13352PEQFecEnt ;
   private boolean[] T01NX5_n13352PEQFecEnt ;
   private String[] T01NX5_A13353PEQDibCli ;
   private boolean[] T01NX5_n13353PEQDibCli ;
   private int[] T01NX5_A13354PEQDibInt ;
   private boolean[] T01NX5_n13354PEQDibInt ;
   private String[] T01NX5_A13355PEQRef ;
   private boolean[] T01NX5_n13355PEQRef ;
   private short[] T01NX5_A13356PEQRap ;
   private boolean[] T01NX5_n13356PEQRap ;
   private byte[] T01NX5_A13357PEQCargo ;
   private boolean[] T01NX5_n13357PEQCargo ;
   private String[] T01NX5_A13358PEQObs ;
   private boolean[] T01NX5_n13358PEQObs ;
   private int[] T01NX5_A13367PEQClicod ;
   private boolean[] T01NX5_n13367PEQClicod ;
   private byte[] T01NX5_A13359PEQEstado ;
   private boolean[] T01NX5_n13359PEQEstado ;
   private byte[] T01NX5_A13360PEQTipo ;
   private boolean[] T01NX5_n13360PEQTipo ;
   private short[] T01NX5_A13374PEQNumCol ;
   private boolean[] T01NX5_n13374PEQNumCol ;
   private String[] T01NX5_A396EmprCod ;
   private short[] T01NX5_A13372PEQGrabCod ;
   private boolean[] T01NX5_n13372PEQGrabCod ;
   private String[] T01NX11_A396EmprCod ;
   private long[] T01NX11_A13350PEQId ;
   private boolean[] T01NX11_n13350PEQId ;
   private String[] T01NX12_A396EmprCod ;
   private long[] T01NX12_A13350PEQId ;
   private boolean[] T01NX12_n13350PEQId ;
   private long[] T01NX4_A13350PEQId ;
   private boolean[] T01NX4_n13350PEQId ;
   private String[] T01NX4_A13368PEQCliNom ;
   private boolean[] T01NX4_n13368PEQCliNom ;
   private java.util.Date[] T01NX4_A13351PEQFecha ;
   private boolean[] T01NX4_n13351PEQFecha ;
   private java.util.Date[] T01NX4_A13352PEQFecEnt ;
   private boolean[] T01NX4_n13352PEQFecEnt ;
   private String[] T01NX4_A13353PEQDibCli ;
   private boolean[] T01NX4_n13353PEQDibCli ;
   private int[] T01NX4_A13354PEQDibInt ;
   private boolean[] T01NX4_n13354PEQDibInt ;
   private String[] T01NX4_A13355PEQRef ;
   private boolean[] T01NX4_n13355PEQRef ;
   private short[] T01NX4_A13356PEQRap ;
   private boolean[] T01NX4_n13356PEQRap ;
   private byte[] T01NX4_A13357PEQCargo ;
   private boolean[] T01NX4_n13357PEQCargo ;
   private String[] T01NX4_A13358PEQObs ;
   private boolean[] T01NX4_n13358PEQObs ;
   private int[] T01NX4_A13367PEQClicod ;
   private boolean[] T01NX4_n13367PEQClicod ;
   private byte[] T01NX4_A13359PEQEstado ;
   private boolean[] T01NX4_n13359PEQEstado ;
   private byte[] T01NX4_A13360PEQTipo ;
   private boolean[] T01NX4_n13360PEQTipo ;
   private short[] T01NX4_A13374PEQNumCol ;
   private boolean[] T01NX4_n13374PEQNumCol ;
   private String[] T01NX4_A396EmprCod ;
   private short[] T01NX4_A13372PEQGrabCod ;
   private boolean[] T01NX4_n13372PEQGrabCod ;
   private String[] T01NX16_A13373PEQGrabNom ;
   private boolean[] T01NX16_n13373PEQGrabNom ;
   private String[] T01NX17_A396EmprCod ;
   private int[] T01NX17_A13324LDESID ;
   private String[] T01NX18_A396EmprCod ;
   private long[] T01NX18_A13350PEQId ;
   private boolean[] T01NX18_n13350PEQId ;
   private String[] T01NX19_A396EmprCod ;
   private long[] T01NX19_A13350PEQId ;
   private boolean[] T01NX19_n13350PEQId ;
   private String[] T01NX19_A13366PEQUEId ;
   private String[] T01NX19_A13361PEQColor ;
   private boolean[] T01NX19_n13361PEQColor ;
   private String[] T01NX19_A13362PEQMalha ;
   private boolean[] T01NX19_n13362PEQMalha ;
   private String[] T01NX19_A13363PEQMedida ;
   private boolean[] T01NX19_n13363PEQMedida ;
   private java.math.BigDecimal[] T01NX19_A13364PEQCob ;
   private boolean[] T01NX19_n13364PEQCob ;
   private java.math.BigDecimal[] T01NX19_A13365PEQPrecio ;
   private boolean[] T01NX19_n13365PEQPrecio ;
   private String[] T01NX20_A396EmprCod ;
   private long[] T01NX20_A13350PEQId ;
   private boolean[] T01NX20_n13350PEQId ;
   private String[] T01NX20_A13366PEQUEId ;
   private String[] T01NX3_A396EmprCod ;
   private long[] T01NX3_A13350PEQId ;
   private boolean[] T01NX3_n13350PEQId ;
   private String[] T01NX3_A13366PEQUEId ;
   private String[] T01NX3_A13361PEQColor ;
   private boolean[] T01NX3_n13361PEQColor ;
   private String[] T01NX3_A13362PEQMalha ;
   private boolean[] T01NX3_n13362PEQMalha ;
   private String[] T01NX3_A13363PEQMedida ;
   private boolean[] T01NX3_n13363PEQMedida ;
   private java.math.BigDecimal[] T01NX3_A13364PEQCob ;
   private boolean[] T01NX3_n13364PEQCob ;
   private java.math.BigDecimal[] T01NX3_A13365PEQPrecio ;
   private boolean[] T01NX3_n13365PEQPrecio ;
   private String[] T01NX2_A396EmprCod ;
   private long[] T01NX2_A13350PEQId ;
   private boolean[] T01NX2_n13350PEQId ;
   private String[] T01NX2_A13366PEQUEId ;
   private String[] T01NX2_A13361PEQColor ;
   private boolean[] T01NX2_n13361PEQColor ;
   private String[] T01NX2_A13362PEQMalha ;
   private boolean[] T01NX2_n13362PEQMalha ;
   private String[] T01NX2_A13363PEQMedida ;
   private boolean[] T01NX2_n13363PEQMedida ;
   private java.math.BigDecimal[] T01NX2_A13364PEQCob ;
   private boolean[] T01NX2_n13364PEQCob ;
   private java.math.BigDecimal[] T01NX2_A13365PEQPrecio ;
   private boolean[] T01NX2_n13365PEQPrecio ;
   private String[] T01NX24_A396EmprCod ;
   private long[] T01NX24_A13350PEQId ;
   private boolean[] T01NX24_n13350PEQId ;
   private String[] T01NX24_A13366PEQUEId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpeq000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeq000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeq000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeq000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpeq000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NX2", "SELECT EmprCod, PEQId, PEQUEId, PEQColor, PEQMalha, PEQMedida, PEQCob, PEQPrecio FROM TXPPEQ001 WHERE EmprCod = ? AND PEQId = ? AND PEQUEId = ?  FOR UPDATE OF PEQColor, PEQMalha, PEQMedida, PEQCob, PEQPrecio NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX3", "SELECT EmprCod, PEQId, PEQUEId, PEQColor, PEQMalha, PEQMedida, PEQCob, PEQPrecio FROM TXPPEQ001 WHERE EmprCod = ? AND PEQId = ? AND PEQUEId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX4", "SELECT PEQId, PEQCliNom, PEQFecha, PEQFecEnt, PEQDibCli, PEQDibInt, PEQRef, PEQRap, PEQCargo, PEQObs, PEQClicod, PEQEstado, PEQTipo, PEQNumCol, EmprCod, PEQGrabCod FROM TXPPEQ000 WHERE EmprCod = ? AND PEQId = ?  FOR UPDATE OF PEQCliNom, PEQFecha, PEQFecEnt, PEQDibCli, PEQDibInt, PEQRef, PEQRap, PEQCargo, PEQObs, PEQClicod, PEQEstado, PEQTipo, PEQNumCol, PEQGrabCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX5", "SELECT PEQId, PEQCliNom, PEQFecha, PEQFecEnt, PEQDibCli, PEQDibInt, PEQRef, PEQRap, PEQCargo, PEQObs, PEQClicod, PEQEstado, PEQTipo, PEQNumCol, EmprCod, PEQGrabCod FROM TXPPEQ000 WHERE EmprCod = ? AND PEQId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX7", "SELECT GrabNom AS PEQGrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PEQId, TM1.PEQCliNom, T2.EmprNom, TM1.PEQFecha, TM1.PEQFecEnt, TM1.PEQDibCli, TM1.PEQDibInt, TM1.PEQRef, TM1.PEQRap, TM1.PEQCargo, TM1.PEQObs, TM1.PEQClicod, TM1.PEQEstado, TM1.PEQTipo, T3.GrabNom AS PEQGrabNom, TM1.PEQNumCol, TM1.EmprCod, TM1.PEQGrabCod AS PEQGrabCod FROM ((TXPPEQ000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPGRABAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.GrabCod = TM1.PEQGrabCod) WHERE TM1.EmprCod = ? and TM1.PEQId = ? ORDER BY TM1.EmprCod, TM1.PEQId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX9", "SELECT GrabNom AS PEQGrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PEQId FROM TXPPEQ000 WHERE EmprCod = ? AND PEQId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PEQId FROM TXPPEQ000 WHERE ( PEQId > ?) and EmprCod = ? ORDER BY EmprCod, PEQId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NX12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PEQId FROM TXPPEQ000 WHERE ( PEQId < ?) and EmprCod = ? ORDER BY EmprCod DESC, PEQId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NX13", "INSERT INTO TXPPEQ000(PEQId, PEQCliNom, PEQFecha, PEQFecEnt, PEQDibCli, PEQDibInt, PEQRef, PEQRap, PEQCargo, PEQObs, PEQClicod, PEQEstado, PEQTipo, PEQNumCol, EmprCod, PEQGrabCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEQ000")
         ,new UpdateCursor("T01NX14", "UPDATE TXPPEQ000 SET PEQCliNom=?, PEQFecha=?, PEQFecEnt=?, PEQDibCli=?, PEQDibInt=?, PEQRef=?, PEQRap=?, PEQCargo=?, PEQObs=?, PEQClicod=?, PEQEstado=?, PEQTipo=?, PEQNumCol=?, PEQGrabCod=?  WHERE EmprCod = ? AND PEQId = ?", GX_NOMASK, "TXPPEQ000")
         ,new UpdateCursor("T01NX15", "DELETE FROM TXPPEQ000  WHERE EmprCod = ? AND PEQId = ?", GX_NOMASK, "TXPPEQ000")
         ,new ForEachCursor("T01NX16", "SELECT GrabNom AS PEQGrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX17", "SELECT * FROM (SELECT EmprCod, LDESID FROM TXPLDES00 WHERE EmprCod = ? AND PEQId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NX18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PEQId FROM TXPPEQ000 WHERE EmprCod = ? ORDER BY EmprCod, PEQId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX19", "SELECT EmprCod, PEQId, PEQUEId, PEQColor, PEQMalha, PEQMedida, PEQCob, PEQPrecio FROM TXPPEQ001 WHERE EmprCod = ? and PEQId = ? and PEQUEId = ? ORDER BY EmprCod, PEQId, PEQUEId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NX20", "SELECT EmprCod, PEQId, PEQUEId FROM TXPPEQ001 WHERE EmprCod = ? AND PEQId = ? AND PEQUEId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NX21", "INSERT INTO TXPPEQ001(EmprCod, PEQId, PEQUEId, PEQColor, PEQMalha, PEQMedida, PEQCob, PEQPrecio) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEQ001")
         ,new UpdateCursor("T01NX22", "UPDATE TXPPEQ001 SET PEQColor=?, PEQMalha=?, PEQMedida=?, PEQCob=?, PEQPrecio=?  WHERE EmprCod = ? AND PEQId = ? AND PEQUEId = ?", GX_NOMASK, "TXPPEQ001")
         ,new UpdateCursor("T01NX23", "DELETE FROM TXPPEQ001  WHERE EmprCod = ? AND PEQId = ? AND PEQUEId = ?", GX_NOMASK, "TXPPEQ001")
         ,new ForEachCursor("T01NX24", "SELECT EmprCod, PEQId, PEQUEId FROM TXPPEQ001 WHERE EmprCod = ? and PEQId = ? ORDER BY EmprCod, PEQId, PEQUEId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 200);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               stmt.setString(15, (String)parms[28], 3);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
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
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               stmt.setString(15, (String)parms[28], 3);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(16, ((Number) parms[30]).longValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 12);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 12);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 3);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 3);
               }
               stmt.setString(6, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[12]).longValue());
               }
               stmt.setString(8, (String)parms[13], 12);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 12);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               return;
      }
   }

}

