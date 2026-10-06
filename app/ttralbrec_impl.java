package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttralbrec_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6263AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A6263AlbRTartC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4792AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "AlmCod"))) ;
         n4792AlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A4792AlmCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALBREC", ""), (short)(0)) ;
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

   public ttralbrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttralbrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttralbrec_impl.class ));
   }

   public ttralbrec_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      chkAlbRRep = UIFactory.getCheckbox(this);
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      A5745AlbRRep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrALBREC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, (byte)(0), "HLP_TTrALBREC.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrALBREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, (byte)(0), "HLP_TTrALBREC.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Piezas Rebajadas", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieReb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieReb_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Unidades Rebajadas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniReb_Internalname, GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniReb_Enabled!=0) ? localUtil.format( A59AlbRUniReb, "ZZZZZ9.99") : localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniReb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Fecha Ultima Utilizacion", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrALBREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Estado (0=No Cumpl. 1=Cumpl.)", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "", true, (byte)(0), "HLP_TTrALBREC.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Codigo Tipo Entrada", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipEntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Numero de Etiquetas", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Destino Empesa", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Código de Procedencia", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Ultima Linea de Observaciones", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1301AlbRUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1301AlbRUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUlin_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Peso Medio p/Pza.", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPmPPza_Internalname, GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPmPPza_Enabled!=0) ? localUtil.format( A4290AlbPmPPza, "Z9.999") : localUtil.format( A4290AlbPmPPza, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPmPPza_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPmPPza_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Gramage en Crudo", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Ancho en Crudo", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Peso Metro Lineal", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Precio", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A5743AlbRPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPre_Enabled!=0) ? localUtil.format( A5743AlbRPre, "ZZZZZ9.99") : localUtil.format( A5743AlbRPre, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPre_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Ajuste", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAju_Internalname, GXutil.ltrim( localUtil.ntoc( A5744AlbRAju, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAju_Enabled!=0) ? localUtil.format( A5744AlbRAju, "ZZZZ9.99") : localUtil.format( A5744AlbRAju, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAju_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRAju_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkAlbRRep.getInternalname(), GXutil.str( A5745AlbRRep, 1, 0), "", "", 1, chkAlbRRep.getEnabled(), "1", httpContext.getMessage( "Mostrar en Reportes", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(180, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,180);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "AlbREnt2", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUsu_Internalname, GXutil.rtrim( A6178AlbrUsu), GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUsu_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Hora entrada", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbrHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrHor_Internalname, localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6179AlbrHor, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrHor_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbrHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbrHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrALBREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,200);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Nota Fiscal?", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrNF_Internalname, GXutil.rtrim( A6182AlbrNF), GXutil.rtrim( localUtil.format( A6182AlbrNF, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,210);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrNF_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrNF_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Fecha emision NF", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbrFeNf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrFeNf_Internalname, localUtil.format(A6183AlbrFeNf, "99/99/99"), localUtil.format( A6183AlbrFeNf, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrFeNf_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrFeNf_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbrFeNf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbrFeNf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrALBREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Codigo Fiscal de Operacion", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 220,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrCfop_Internalname, GXutil.rtrim( A6184AlbrCfop), GXutil.rtrim( localUtil.format( A6184AlbrCfop, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,220);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrCfop_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrCfop_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Disp. Cliente", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDisCli_Internalname, GXutil.rtrim( A3359AlbRDisCli), GXutil.rtrim( localUtil.format( A3359AlbRDisCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDisCli_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRDisCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartC_Internalname, GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRTartC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,230);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRTartC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartD_Internalname, GXutil.rtrim( A6264AlbRTartD), GXutil.rtrim( localUtil.format( A6264AlbRTartD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartD_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRTartD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Albaran Impreso ?", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRImp_Internalname, GXutil.rtrim( A3360AlbRImp), GXutil.rtrim( localUtil.format( A3360AlbRImp, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,240);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRImp_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRImp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Telar", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 250,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTelar_Internalname, GXutil.rtrim( A6464AlbRTelar), GXutil.rtrim( localUtil.format( A6464AlbRTelar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,250);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTelar_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRTelar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Longitud Hilo en 50 agujas", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 255,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLu_Internalname, GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRLu_Enabled!=0) ? localUtil.format( A6465AlbRLu, "ZZ9.99") : localUtil.format( A6465AlbRLu, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,255);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLu_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRLu_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Modelo", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 260,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod), GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,260);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRMdlCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Tara", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 265,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTara_Internalname, GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRTara_Enabled!=0) ? localUtil.format( A6470AlbRTara, "ZZ9.99") : localUtil.format( A6470AlbRTara, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,265);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTara_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRTara_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Unidades Bruto", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniB_Internalname, GXutil.ltrim( localUtil.ntoc( A6471AlbRUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniB_Enabled!=0) ? localUtil.format( A6471AlbRUniB, "ZZZZZ9.99") : localUtil.format( A6471AlbRUniB, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,270);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniB_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniB_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Documento Proveedor", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 275,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDocPrv_Internalname, GXutil.rtrim( A6488AlbDocPrv), GXutil.rtrim( localUtil.format( A6488AlbDocPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,275);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDocPrv_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDocPrv_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Unidades Clientes", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 280,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6523AlbRUdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUdas_Enabled!=0) ? localUtil.format( A6523AlbRUdas, "ZZZZZ9.99") : localUtil.format( A6523AlbRUdas, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,280);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUdas_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUdas_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Código del Almacen", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 285,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlmCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4792AlmCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A4792AlmCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,285);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlmCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Color Texfina", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 290,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColor_Internalname, GXutil.rtrim( A8023AlbColor), GXutil.rtrim( localUtil.format( A8023AlbColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,290);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColor_Jsonclick, 0, "", "", "", "", "", 1, edtAlbColor_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Op Texfina", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 295,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOpsT_Internalname, GXutil.rtrim( A8024AlbOpsT), GXutil.rtrim( localUtil.format( A8024AlbOpsT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,295);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOpsT_Jsonclick, 0, "", "", "", "", "", 1, edtAlbOpsT_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Op Cliente", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 300,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOpsC_Internalname, GXutil.rtrim( A8025AlbOpsC), GXutil.rtrim( localUtil.format( A8025AlbOpsC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,300);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOpsC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbOpsC_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Orden Compra", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 305,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOC_Internalname, GXutil.rtrim( A8026AlbOC), GXutil.rtrim( localUtil.format( A8026AlbOC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,305);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbOC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "HDR Inicial", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 310,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdri_Internalname, GXutil.rtrim( A8027AlbHdri), GXutil.rtrim( localUtil.format( A8027AlbHdri, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,310);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdri_Jsonclick, 0, "", "", "", "", "", 1, edtAlbHdri_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Nº Bultos", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 315,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumB_Internalname, GXutil.rtrim( A8028AlbNumB), GXutil.rtrim( localUtil.format( A8028AlbNumB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,315);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumB_Jsonclick, 0, "", "", "", "", "", 1, edtAlbNumB_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Nº Marcado", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 320,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumM_Internalname, GXutil.rtrim( A8029AlbNumM), GXutil.rtrim( localUtil.format( A8029AlbNumM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,320);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumM_Jsonclick, 0, "", "", "", "", "", 1, edtAlbNumM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Ancho Cliente", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 325,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbAncC_Internalname, GXutil.ltrim( localUtil.ntoc( A8030AlbAncC, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbAncC_Enabled!=0) ? localUtil.format( A8030AlbAncC, "Z9.99") : localUtil.format( A8030AlbAncC, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,325);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbAncC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbAncC_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Densidad Cliente", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 330,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDndC_Internalname, GXutil.ltrim( localUtil.ntoc( A8031AlbDndC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDndC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8031AlbDndC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8031AlbDndC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,330);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDndC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDndC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 335,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbAncCr_Internalname, GXutil.ltrim( localUtil.ntoc( A8032AlbAncCr, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbAncCr_Enabled!=0) ? localUtil.format( A8032AlbAncCr, "Z9.99") : localUtil.format( A8032AlbAncCr, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,335);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbAncCr_Jsonclick, 0, "", "", "", "", "", 1, edtAlbAncCr_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Densidad Crudo", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 340,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDndCr_Internalname, GXutil.ltrim( localUtil.ntoc( A8033AlbDndCr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDndCr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8033AlbDndCr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8033AlbDndCr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,340);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDndCr_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDndCr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Galga", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 345,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGalga_Internalname, GXutil.ltrim( localUtil.ntoc( A8034AlbGalga, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGalga_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8034AlbGalga), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8034AlbGalga), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,345);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGalga_Jsonclick, 0, "", "", "", "", "", 1, edtAlbGalga_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Maquina Tejido", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 350,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMaqTej_Internalname, GXutil.rtrim( A8035AlbMaqTej), GXutil.rtrim( localUtil.format( A8035AlbMaqTej, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,350);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMaqTej_Jsonclick, 0, "", "", "", "", "", 1, edtAlbMaqTej_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Diametro", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 355,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDmt_Internalname, GXutil.ltrim( localUtil.ntoc( A8036AlbDmt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDmt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8036AlbDmt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8036AlbDmt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,355);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDmt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDmt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Partida Cliente", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 360,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPdaC_Internalname, GXutil.rtrim( A9793AlbPdaC), GXutil.rtrim( localUtil.format( A9793AlbPdaC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,360);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPdaC_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPdaC_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Orden Servicio Tejido", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 365,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOStj_Internalname, GXutil.rtrim( A9794AlbOStj), GXutil.rtrim( localUtil.format( A9794AlbOStj, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,365);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOStj_Jsonclick, 0, "", "", "", "", "", 1, edtAlbOStj_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Status Lote Entrada", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 370,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbStLot_Internalname, GXutil.ltrim( localUtil.ntoc( A317AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbStLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A317AlbStLot), "9") : localUtil.format( DecimalUtil.doubleToDec(A317AlbStLot), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,370);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbStLot_Jsonclick, 0, "", "", "", "", "", 1, edtAlbStLot_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "Turno", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 375,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTurno_Internalname, GXutil.ltrim( localUtil.ntoc( A10358AlbTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10358AlbTurno), "9") : localUtil.format( DecimalUtil.doubleToDec(A10358AlbTurno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,375);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTurno_Jsonclick, 0, "", "", "", "", "", 1, edtAlbTurno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "CliEst", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEst_Internalname, GXutil.rtrim( A8723CliEst), GXutil.rtrim( localUtil.format( A8723CliEst, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEst_Jsonclick, 0, "", "", "", "", "", 1, edtCliEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrALBREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 383,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 384,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 385,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrALBREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 387,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrALBREC.htm");
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
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
         Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
         Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
         Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
         Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
         Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
         Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
         Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
         Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
         Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
         Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
         Z1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
         Z4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( "Z4290AlbPmPPza")) ;
         Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z4922AlbPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5743AlbRPre = localUtil.ctond( httpContext.cgiGet( "Z5743AlbRPre")) ;
         Z5744AlbRAju = localUtil.ctond( httpContext.cgiGet( "Z5744AlbRAju")) ;
         Z5745AlbRRep = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5745AlbRRep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
         Z6178AlbrUsu = httpContext.cgiGet( "Z6178AlbrUsu") ;
         Z6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z6179AlbrHor"), 0)) ;
         Z6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( "Z6180AlbrUniC")) ;
         Z6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6181AlbrPieC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6182AlbrNF = httpContext.cgiGet( "Z6182AlbrNF") ;
         Z6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( "Z6183AlbrFeNf"), 0) ;
         Z6184AlbrCfop = httpContext.cgiGet( "Z6184AlbrCfop") ;
         Z3359AlbRDisCli = httpContext.cgiGet( "Z3359AlbRDisCli") ;
         Z3360AlbRImp = httpContext.cgiGet( "Z3360AlbRImp") ;
         Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
         Z6464AlbRTelar = httpContext.cgiGet( "Z6464AlbRTelar") ;
         Z6465AlbRLu = localUtil.ctond( httpContext.cgiGet( "Z6465AlbRLu")) ;
         Z4602AlbRMdlCod = httpContext.cgiGet( "Z4602AlbRMdlCod") ;
         Z6470AlbRTara = localUtil.ctond( httpContext.cgiGet( "Z6470AlbRTara")) ;
         Z6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( "Z6471AlbRUniB")) ;
         Z6488AlbDocPrv = httpContext.cgiGet( "Z6488AlbDocPrv") ;
         Z6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( "Z6523AlbRUdas")) ;
         Z8023AlbColor = httpContext.cgiGet( "Z8023AlbColor") ;
         Z8024AlbOpsT = httpContext.cgiGet( "Z8024AlbOpsT") ;
         Z8025AlbOpsC = httpContext.cgiGet( "Z8025AlbOpsC") ;
         Z8026AlbOC = httpContext.cgiGet( "Z8026AlbOC") ;
         Z8027AlbHdri = httpContext.cgiGet( "Z8027AlbHdri") ;
         Z8028AlbNumB = httpContext.cgiGet( "Z8028AlbNumB") ;
         Z8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
         Z8030AlbAncC = localUtil.ctond( httpContext.cgiGet( "Z8030AlbAncC")) ;
         Z8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8031AlbDndC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( "Z8032AlbAncCr")) ;
         Z8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( "Z8033AlbDndCr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( "Z8034AlbGalga"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8035AlbMaqTej = httpContext.cgiGet( "Z8035AlbMaqTej") ;
         Z8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( "Z8036AlbDmt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9793AlbPdaC = httpContext.cgiGet( "Z9793AlbPdaC") ;
         Z9794AlbOStj = httpContext.cgiGet( "Z9794AlbOStj") ;
         Z317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( "Z317AlbStLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10358AlbTurno = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10358AlbTurno"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( "Z6263AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4792AlmCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A44AlbRecCod = 0 ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         else
         {
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A52AlbRPieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         else
         {
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRFen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A49AlbRFen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         else
         {
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A58AlbRUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         else
         {
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A54AlbRPieUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A53AlbRPieReb = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         else
         {
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A60AlbRUniUti = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A59AlbRUniReb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         else
         {
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFecUlt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFECULT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRFecUlt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A48AlbRFecUlt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         }
         else
         {
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         }
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMETI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbNumEti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1222AlbNumEti = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         else
         {
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1301AlbRUlin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         }
         else
         {
            A1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         }
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPMPPZA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbPmPPza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4290AlbPmPPza = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         }
         else
         {
            A4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRGRM2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRGrm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4920AlbRGrm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         }
         else
         {
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4921AlbRAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         }
         else
         {
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbPml_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4922AlbPml = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         }
         else
         {
            A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRPre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5743AlbRPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         }
         else
         {
            A5743AlbRPre = localUtil.ctond( httpContext.cgiGet( edtAlbRPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRAju_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRAju_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRAJU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRAju_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5744AlbRAju = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         }
         else
         {
            A5744AlbRAju = localUtil.ctond( httpContext.cgiGet( edtAlbRAju_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkAlbRRep.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkAlbRRep.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRREP");
            AnyError = (short)(1) ;
            GX_FocusControl = chkAlbRRep.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5745AlbRRep = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         }
         else
         {
            A5745AlbRRep = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkAlbRRep.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         }
         A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A6178AlbrUsu = httpContext.cgiGet( edtAlbrUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbrHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "ALBRHOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrHor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtAlbrHor_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrUniC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6180AlbrUniC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         }
         else
         {
            A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrPieC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6181AlbrPieC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         }
         else
         {
            A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         }
         A6182AlbrNF = GXutil.upper( httpContext.cgiGet( edtAlbrNF_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbrFeNf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFENF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrFeNf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6183AlbrFeNf = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         }
         else
         {
            A6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( edtAlbrFeNf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         }
         A6184AlbrCfop = httpContext.cgiGet( edtAlbrCfop_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
         A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRTartC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6263AlbRTartC = (short)(0) ;
            n6263AlbRTartC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         }
         else
         {
            A6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6263AlbRTartC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         }
         A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
         n6264AlbRTartD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         A3360AlbRImp = GXutil.upper( httpContext.cgiGet( edtAlbRImp_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
         A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRLU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRLu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6465AlbRLu = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         }
         else
         {
            A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         }
         A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRTARA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRTara_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6470AlbRTara = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         }
         else
         {
            A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniB_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6471AlbRUniB = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         }
         else
         {
            A6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( edtAlbRUniB_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         }
         A6488AlbDocPrv = httpContext.cgiGet( edtAlbDocPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUdas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUdas_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUDAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUdas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6523AlbRUdas = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         }
         else
         {
            A6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( edtAlbRUdas_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4792AlmCod = (byte)(0) ;
            n4792AlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         }
         else
         {
            A4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4792AlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         }
         A8023AlbColor = httpContext.cgiGet( edtAlbColor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
         A8024AlbOpsT = httpContext.cgiGet( edtAlbOpsT_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
         A8025AlbOpsC = httpContext.cgiGet( edtAlbOpsC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
         A8026AlbOC = httpContext.cgiGet( edtAlbOC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
         A8027AlbHdri = httpContext.cgiGet( edtAlbHdri_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
         A8028AlbNumB = httpContext.cgiGet( edtAlbNumB_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbAncC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbAncC_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBANCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbAncC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8030AlbAncC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         }
         else
         {
            A8030AlbAncC = localUtil.ctond( httpContext.cgiGet( edtAlbAncC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDNDC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDndC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8031AlbDndC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         }
         else
         {
            A8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDndC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbAncCr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbAncCr_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBANCCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbAncCr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8032AlbAncCr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         }
         else
         {
            A8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( edtAlbAncCr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndCr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndCr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDNDCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDndCr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8033AlbDndCr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         }
         else
         {
            A8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDndCr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbGalga_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbGalga_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBGALGA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbGalga_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8034AlbGalga = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         }
         else
         {
            A8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbGalga_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         }
         A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDMT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDmt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8036AlbDmt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         }
         else
         {
            A8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         }
         A9793AlbPdaC = httpContext.cgiGet( edtAlbPdaC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
         A9794AlbOStj = httpContext.cgiGet( edtAlbOStj_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbStLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbStLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBSTLOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbStLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A317AlbStLot = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         }
         else
         {
            A317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbStLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTURNO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbTurno_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10358AlbTurno = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         }
         else
         {
            A10358AlbTurno = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         }
         A8723CliEst = httpContext.cgiGet( edtCliEst_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
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
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
            initAll1HV7( ) ;
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
      disableAttributes1HV7( ) ;
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

   public void confirm_1HV0( )
   {
      beforeValidate1HV7( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HV7( ) ;
         }
         else
         {
            checkExtendedTable1HV7( ) ;
            if ( AnyError == 0 )
            {
               zm1HV7( 8) ;
               zm1HV7( 9) ;
               zm1HV7( 10) ;
               zm1HV7( 11) ;
               zm1HV7( 12) ;
               zm1HV7( 13) ;
            }
            closeExtendedTableCursors1HV7( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HV0( ) ;
      }
   }

   public void resetCaption1HV0( )
   {
   }

   public void zm1HV7( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z45AlbRef = T01HV3_A45AlbRef[0] ;
            Z46AlbREnt = T01HV3_A46AlbREnt[0] ;
            Z52AlbRPieEnt = T01HV3_A52AlbRPieEnt[0] ;
            Z56AlbRUni = T01HV3_A56AlbRUni[0] ;
            Z50AlbRLoc = T01HV3_A50AlbRLoc[0] ;
            Z49AlbRFen = T01HV3_A49AlbRFen[0] ;
            Z58AlbRUniEnt = T01HV3_A58AlbRUniEnt[0] ;
            Z55AlbRReo = T01HV3_A55AlbRReo[0] ;
            Z54AlbRPieUti = T01HV3_A54AlbRPieUti[0] ;
            Z53AlbRPieReb = T01HV3_A53AlbRPieReb[0] ;
            Z60AlbRUniUti = T01HV3_A60AlbRUniUti[0] ;
            Z59AlbRUniReb = T01HV3_A59AlbRUniReb[0] ;
            Z48AlbRFecUlt = T01HV3_A48AlbRFecUlt[0] ;
            Z47AlbREst = T01HV3_A47AlbREst[0] ;
            Z1222AlbNumEti = T01HV3_A1222AlbNumEti[0] ;
            Z1291AlbRDes = T01HV3_A1291AlbRDes[0] ;
            Z1301AlbRUlin = T01HV3_A1301AlbRUlin[0] ;
            Z3613AlbRefDsc = T01HV3_A3613AlbRefDsc[0] ;
            Z4290AlbPmPPza = T01HV3_A4290AlbPmPPza[0] ;
            Z4920AlbRGrm2 = T01HV3_A4920AlbRGrm2[0] ;
            Z4921AlbRAnc = T01HV3_A4921AlbRAnc[0] ;
            Z4922AlbPml = T01HV3_A4922AlbPml[0] ;
            Z5743AlbRPre = T01HV3_A5743AlbRPre[0] ;
            Z5744AlbRAju = T01HV3_A5744AlbRAju[0] ;
            Z5745AlbRRep = T01HV3_A5745AlbRRep[0] ;
            Z5806AlbREnt2 = T01HV3_A5806AlbREnt2[0] ;
            Z6178AlbrUsu = T01HV3_A6178AlbrUsu[0] ;
            Z6179AlbrHor = T01HV3_A6179AlbrHor[0] ;
            Z6180AlbrUniC = T01HV3_A6180AlbrUniC[0] ;
            Z6181AlbrPieC = T01HV3_A6181AlbrPieC[0] ;
            Z6182AlbrNF = T01HV3_A6182AlbrNF[0] ;
            Z6183AlbrFeNf = T01HV3_A6183AlbrFeNf[0] ;
            Z6184AlbrCfop = T01HV3_A6184AlbrCfop[0] ;
            Z3359AlbRDisCli = T01HV3_A3359AlbRDisCli[0] ;
            Z3360AlbRImp = T01HV3_A3360AlbRImp[0] ;
            Z6463AlbRLote = T01HV3_A6463AlbRLote[0] ;
            Z6464AlbRTelar = T01HV3_A6464AlbRTelar[0] ;
            Z6465AlbRLu = T01HV3_A6465AlbRLu[0] ;
            Z4602AlbRMdlCod = T01HV3_A4602AlbRMdlCod[0] ;
            Z6470AlbRTara = T01HV3_A6470AlbRTara[0] ;
            Z6471AlbRUniB = T01HV3_A6471AlbRUniB[0] ;
            Z6488AlbDocPrv = T01HV3_A6488AlbDocPrv[0] ;
            Z6523AlbRUdas = T01HV3_A6523AlbRUdas[0] ;
            Z8023AlbColor = T01HV3_A8023AlbColor[0] ;
            Z8024AlbOpsT = T01HV3_A8024AlbOpsT[0] ;
            Z8025AlbOpsC = T01HV3_A8025AlbOpsC[0] ;
            Z8026AlbOC = T01HV3_A8026AlbOC[0] ;
            Z8027AlbHdri = T01HV3_A8027AlbHdri[0] ;
            Z8028AlbNumB = T01HV3_A8028AlbNumB[0] ;
            Z8029AlbNumM = T01HV3_A8029AlbNumM[0] ;
            Z8030AlbAncC = T01HV3_A8030AlbAncC[0] ;
            Z8031AlbDndC = T01HV3_A8031AlbDndC[0] ;
            Z8032AlbAncCr = T01HV3_A8032AlbAncCr[0] ;
            Z8033AlbDndCr = T01HV3_A8033AlbDndCr[0] ;
            Z8034AlbGalga = T01HV3_A8034AlbGalga[0] ;
            Z8035AlbMaqTej = T01HV3_A8035AlbMaqTej[0] ;
            Z8036AlbDmt = T01HV3_A8036AlbDmt[0] ;
            Z9793AlbPdaC = T01HV3_A9793AlbPdaC[0] ;
            Z9794AlbOStj = T01HV3_A9794AlbOStj[0] ;
            Z317AlbStLot = T01HV3_A317AlbStLot[0] ;
            Z10358AlbTurno = T01HV3_A10358AlbTurno[0] ;
            Z252CliCod = T01HV3_A252CliCod[0] ;
            Z6263AlbRTartC = T01HV3_A6263AlbRTartC[0] ;
            Z840TrnCod = T01HV3_A840TrnCod[0] ;
            Z970ProceCod = T01HV3_A970ProceCod[0] ;
            Z1211TipEntCod = T01HV3_A1211TipEntCod[0] ;
            Z4792AlmCod = T01HV3_A4792AlmCod[0] ;
         }
         else
         {
            Z45AlbRef = A45AlbRef ;
            Z46AlbREnt = A46AlbREnt ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z56AlbRUni = A56AlbRUni ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z49AlbRFen = A49AlbRFen ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z55AlbRReo = A55AlbRReo ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z47AlbREst = A47AlbREst ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z1301AlbRUlin = A1301AlbRUlin ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z4290AlbPmPPza = A4290AlbPmPPza ;
            Z4920AlbRGrm2 = A4920AlbRGrm2 ;
            Z4921AlbRAnc = A4921AlbRAnc ;
            Z4922AlbPml = A4922AlbPml ;
            Z5743AlbRPre = A5743AlbRPre ;
            Z5744AlbRAju = A5744AlbRAju ;
            Z5745AlbRRep = A5745AlbRRep ;
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z6178AlbrUsu = A6178AlbrUsu ;
            Z6179AlbrHor = A6179AlbrHor ;
            Z6180AlbrUniC = A6180AlbrUniC ;
            Z6181AlbrPieC = A6181AlbrPieC ;
            Z6182AlbrNF = A6182AlbrNF ;
            Z6183AlbrFeNf = A6183AlbrFeNf ;
            Z6184AlbrCfop = A6184AlbrCfop ;
            Z3359AlbRDisCli = A3359AlbRDisCli ;
            Z3360AlbRImp = A3360AlbRImp ;
            Z6463AlbRLote = A6463AlbRLote ;
            Z6464AlbRTelar = A6464AlbRTelar ;
            Z6465AlbRLu = A6465AlbRLu ;
            Z4602AlbRMdlCod = A4602AlbRMdlCod ;
            Z6470AlbRTara = A6470AlbRTara ;
            Z6471AlbRUniB = A6471AlbRUniB ;
            Z6488AlbDocPrv = A6488AlbDocPrv ;
            Z6523AlbRUdas = A6523AlbRUdas ;
            Z8023AlbColor = A8023AlbColor ;
            Z8024AlbOpsT = A8024AlbOpsT ;
            Z8025AlbOpsC = A8025AlbOpsC ;
            Z8026AlbOC = A8026AlbOC ;
            Z8027AlbHdri = A8027AlbHdri ;
            Z8028AlbNumB = A8028AlbNumB ;
            Z8029AlbNumM = A8029AlbNumM ;
            Z8030AlbAncC = A8030AlbAncC ;
            Z8031AlbDndC = A8031AlbDndC ;
            Z8032AlbAncCr = A8032AlbAncCr ;
            Z8033AlbDndCr = A8033AlbDndCr ;
            Z8034AlbGalga = A8034AlbGalga ;
            Z8035AlbMaqTej = A8035AlbMaqTej ;
            Z8036AlbDmt = A8036AlbDmt ;
            Z9793AlbPdaC = A9793AlbPdaC ;
            Z9794AlbOStj = A9794AlbOStj ;
            Z317AlbStLot = A317AlbStLot ;
            Z10358AlbTurno = A10358AlbTurno ;
            Z252CliCod = A252CliCod ;
            Z6263AlbRTartC = A6263AlbRTartC ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
            Z4792AlmCod = A4792AlmCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z45AlbRef = A45AlbRef ;
         Z46AlbREnt = A46AlbREnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z49AlbRFen = A49AlbRFen ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z55AlbRReo = A55AlbRReo ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z47AlbREst = A47AlbREst ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z1301AlbRUlin = A1301AlbRUlin ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z4290AlbPmPPza = A4290AlbPmPPza ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z5743AlbRPre = A5743AlbRPre ;
         Z5744AlbRAju = A5744AlbRAju ;
         Z5745AlbRRep = A5745AlbRRep ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z6178AlbrUsu = A6178AlbrUsu ;
         Z6179AlbrHor = A6179AlbrHor ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z6182AlbrNF = A6182AlbrNF ;
         Z6183AlbrFeNf = A6183AlbrFeNf ;
         Z6184AlbrCfop = A6184AlbrCfop ;
         Z3359AlbRDisCli = A3359AlbRDisCli ;
         Z3360AlbRImp = A3360AlbRImp ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z6464AlbRTelar = A6464AlbRTelar ;
         Z6465AlbRLu = A6465AlbRLu ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z6470AlbRTara = A6470AlbRTara ;
         Z6471AlbRUniB = A6471AlbRUniB ;
         Z6488AlbDocPrv = A6488AlbDocPrv ;
         Z6523AlbRUdas = A6523AlbRUdas ;
         Z8023AlbColor = A8023AlbColor ;
         Z8024AlbOpsT = A8024AlbOpsT ;
         Z8025AlbOpsC = A8025AlbOpsC ;
         Z8026AlbOC = A8026AlbOC ;
         Z8027AlbHdri = A8027AlbHdri ;
         Z8028AlbNumB = A8028AlbNumB ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z8030AlbAncC = A8030AlbAncC ;
         Z8031AlbDndC = A8031AlbDndC ;
         Z8032AlbAncCr = A8032AlbAncCr ;
         Z8033AlbDndCr = A8033AlbDndCr ;
         Z8034AlbGalga = A8034AlbGalga ;
         Z8035AlbMaqTej = A8035AlbMaqTej ;
         Z8036AlbDmt = A8036AlbDmt ;
         Z9793AlbPdaC = A9793AlbPdaC ;
         Z9794AlbOStj = A9794AlbOStj ;
         Z317AlbStLot = A317AlbStLot ;
         Z10358AlbTurno = A10358AlbTurno ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z6263AlbRTartC = A6263AlbRTartC ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z4792AlmCod = A4792AlmCod ;
         Z8723CliEst = A8723CliEst ;
         Z6264AlbRTartD = A6264AlbRTartD ;
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

   public void load1HV7( )
   {
      /* Using cursor T01HV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A45AlbRef = T01HV10_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A46AlbREnt = T01HV10_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A52AlbRPieEnt = T01HV10_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01HV10_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T01HV10_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T01HV10_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A58AlbRUniEnt = T01HV10_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A55AlbRReo = T01HV10_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = T01HV10_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A53AlbRPieReb = T01HV10_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A60AlbRUniUti = T01HV10_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A59AlbRUniReb = T01HV10_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T01HV10_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A47AlbREst = T01HV10_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A1222AlbNumEti = T01HV10_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T01HV10_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A1301AlbRUlin = T01HV10_A1301AlbRUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A3613AlbRefDsc = T01HV10_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A4290AlbPmPPza = T01HV10_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4920AlbRGrm2 = T01HV10_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01HV10_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01HV10_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A5743AlbRPre = T01HV10_A5743AlbRPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         A5744AlbRAju = T01HV10_A5744AlbRAju[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         A5745AlbRRep = T01HV10_A5745AlbRRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         A5806AlbREnt2 = T01HV10_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A6178AlbrUsu = T01HV10_A6178AlbrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         A6179AlbrHor = T01HV10_A6179AlbrHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6180AlbrUniC = T01HV10_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01HV10_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A6182AlbrNF = T01HV10_A6182AlbrNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A6183AlbrFeNf = T01HV10_A6183AlbrFeNf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         A6184AlbrCfop = T01HV10_A6184AlbrCfop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
         A3359AlbRDisCli = T01HV10_A3359AlbRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A6264AlbRTartD = T01HV10_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01HV10_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         A3360AlbRImp = T01HV10_A3360AlbRImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
         A6463AlbRLote = T01HV10_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A6464AlbRTelar = T01HV10_A6464AlbRTelar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         A6465AlbRLu = T01HV10_A6465AlbRLu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A4602AlbRMdlCod = T01HV10_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A6470AlbRTara = T01HV10_A6470AlbRTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         A6471AlbRUniB = T01HV10_A6471AlbRUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         A6488AlbDocPrv = T01HV10_A6488AlbDocPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
         A6523AlbRUdas = T01HV10_A6523AlbRUdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         A8023AlbColor = T01HV10_A8023AlbColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
         A8024AlbOpsT = T01HV10_A8024AlbOpsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
         A8025AlbOpsC = T01HV10_A8025AlbOpsC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
         A8026AlbOC = T01HV10_A8026AlbOC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
         A8027AlbHdri = T01HV10_A8027AlbHdri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
         A8028AlbNumB = T01HV10_A8028AlbNumB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A8029AlbNumM = T01HV10_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A8030AlbAncC = T01HV10_A8030AlbAncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         A8031AlbDndC = T01HV10_A8031AlbDndC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         A8032AlbAncCr = T01HV10_A8032AlbAncCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         A8033AlbDndCr = T01HV10_A8033AlbDndCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         A8034AlbGalga = T01HV10_A8034AlbGalga[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         A8035AlbMaqTej = T01HV10_A8035AlbMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A8036AlbDmt = T01HV10_A8036AlbDmt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         A9793AlbPdaC = T01HV10_A9793AlbPdaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
         A9794AlbOStj = T01HV10_A9794AlbOStj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
         A317AlbStLot = T01HV10_A317AlbStLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         A10358AlbTurno = T01HV10_A10358AlbTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         A8723CliEst = T01HV10_A8723CliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         A252CliCod = T01HV10_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6263AlbRTartC = T01HV10_A6263AlbRTartC[0] ;
         n6263AlbRTartC = T01HV10_n6263AlbRTartC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A840TrnCod = T01HV10_A840TrnCod[0] ;
         n840TrnCod = T01HV10_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01HV10_A970ProceCod[0] ;
         n970ProceCod = T01HV10_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01HV10_A1211TipEntCod[0] ;
         n1211TipEntCod = T01HV10_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A4792AlmCod = T01HV10_A4792AlmCod[0] ;
         n4792AlmCod = T01HV10_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         zm1HV7( -7) ;
      }
      pr_default.close(8);
      onLoadActions1HV7( ) ;
   }

   public void onLoadActions1HV7( )
   {
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
   }

   public void checkExtendedTable1HV7( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01HV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8723CliEst = T01HV4_A8723CliEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      pr_default.close(2);
      /* Using cursor T01HV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6264AlbRTartD = T01HV5_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01HV5_n6264AlbRTartD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      pr_default.close(3);
      /* Using cursor T01HV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(4);
      /* Using cursor T01HV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(5);
      /* Using cursor T01HV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(6);
      /* Using cursor T01HV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(7);
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3360AlbRImp, "S") == 0 ) || ( GXutil.strcmp(A3360AlbRImp, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Albaran Impreso ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRIMP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRImp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1HV7( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01HV11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8723CliEst = T01HV11_A8723CliEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8723CliEst))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_9( String A396EmprCod ,
                         short A6263AlbRTartC )
   {
      /* Using cursor T01HV12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6264AlbRTartD = T01HV12_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01HV12_n6264AlbRTartD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6264AlbRTartD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_10( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01HV13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_11( String A396EmprCod ,
                          short A970ProceCod )
   {
      /* Using cursor T01HV14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_12( String A396EmprCod ,
                          short A1211TipEntCod )
   {
      /* Using cursor T01HV15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_13( String A396EmprCod ,
                          byte A4792AlmCod )
   {
      /* Using cursor T01HV16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1HV7( )
   {
      /* Using cursor T01HV17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HV7( 7) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01HV3_A44AlbRecCod[0] ;
         n44AlbRecCod = T01HV3_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A45AlbRef = T01HV3_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A46AlbREnt = T01HV3_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A52AlbRPieEnt = T01HV3_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01HV3_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T01HV3_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T01HV3_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A58AlbRUniEnt = T01HV3_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A55AlbRReo = T01HV3_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = T01HV3_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A53AlbRPieReb = T01HV3_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A60AlbRUniUti = T01HV3_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A59AlbRUniReb = T01HV3_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T01HV3_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A47AlbREst = T01HV3_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A1222AlbNumEti = T01HV3_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T01HV3_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A1301AlbRUlin = T01HV3_A1301AlbRUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A3613AlbRefDsc = T01HV3_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A4290AlbPmPPza = T01HV3_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4920AlbRGrm2 = T01HV3_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01HV3_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01HV3_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A5743AlbRPre = T01HV3_A5743AlbRPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         A5744AlbRAju = T01HV3_A5744AlbRAju[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         A5745AlbRRep = T01HV3_A5745AlbRRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         A5806AlbREnt2 = T01HV3_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A6178AlbrUsu = T01HV3_A6178AlbrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         A6179AlbrHor = T01HV3_A6179AlbrHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6180AlbrUniC = T01HV3_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01HV3_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A6182AlbrNF = T01HV3_A6182AlbrNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A6183AlbrFeNf = T01HV3_A6183AlbrFeNf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         A6184AlbrCfop = T01HV3_A6184AlbrCfop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
         A3359AlbRDisCli = T01HV3_A3359AlbRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A3360AlbRImp = T01HV3_A3360AlbRImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
         A6463AlbRLote = T01HV3_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A6464AlbRTelar = T01HV3_A6464AlbRTelar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         A6465AlbRLu = T01HV3_A6465AlbRLu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A4602AlbRMdlCod = T01HV3_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A6470AlbRTara = T01HV3_A6470AlbRTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         A6471AlbRUniB = T01HV3_A6471AlbRUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         A6488AlbDocPrv = T01HV3_A6488AlbDocPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
         A6523AlbRUdas = T01HV3_A6523AlbRUdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         A8023AlbColor = T01HV3_A8023AlbColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
         A8024AlbOpsT = T01HV3_A8024AlbOpsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
         A8025AlbOpsC = T01HV3_A8025AlbOpsC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
         A8026AlbOC = T01HV3_A8026AlbOC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
         A8027AlbHdri = T01HV3_A8027AlbHdri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
         A8028AlbNumB = T01HV3_A8028AlbNumB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A8029AlbNumM = T01HV3_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A8030AlbAncC = T01HV3_A8030AlbAncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         A8031AlbDndC = T01HV3_A8031AlbDndC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         A8032AlbAncCr = T01HV3_A8032AlbAncCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         A8033AlbDndCr = T01HV3_A8033AlbDndCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         A8034AlbGalga = T01HV3_A8034AlbGalga[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         A8035AlbMaqTej = T01HV3_A8035AlbMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A8036AlbDmt = T01HV3_A8036AlbDmt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         A9793AlbPdaC = T01HV3_A9793AlbPdaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
         A9794AlbOStj = T01HV3_A9794AlbOStj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
         A317AlbStLot = T01HV3_A317AlbStLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         A10358AlbTurno = T01HV3_A10358AlbTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         A396EmprCod = T01HV3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01HV3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6263AlbRTartC = T01HV3_A6263AlbRTartC[0] ;
         n6263AlbRTartC = T01HV3_n6263AlbRTartC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A840TrnCod = T01HV3_A840TrnCod[0] ;
         n840TrnCod = T01HV3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01HV3_A970ProceCod[0] ;
         n970ProceCod = T01HV3_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01HV3_A1211TipEntCod[0] ;
         n1211TipEntCod = T01HV3_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A4792AlmCod = T01HV3_A4792AlmCod[0] ;
         n4792AlmCod = T01HV3_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HV7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1HV7( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1HV7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HV7( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T01HV18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01HV18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HV18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HV18_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01HV18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HV18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HV18_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            A396EmprCod = T01HV18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01HV18_A44AlbRecCod[0] ;
            n44AlbRecCod = T01HV18_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01HV19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01HV19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HV19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HV19_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01HV19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HV19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HV19_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            A396EmprCod = T01HV19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01HV19_A44AlbRecCod[0] ;
            n44AlbRecCod = T01HV19_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HV7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HV7( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
               update1HV7( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HV7( ) ;
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
                  insert1HV7( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      getKey1HV7( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = Z44AlbRecCod ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttralbrec");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1HV0( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HV7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HV7( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      scanStart1HV7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNext1HV7( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HV7( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HV7( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z45AlbRef, T01HV2_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z46AlbREnt, T01HV2_A46AlbREnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01HV2_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z56AlbRUni, T01HV2_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z50AlbRLoc, T01HV2_A50AlbRLoc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01HV2_A49AlbRFen[0])) ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01HV2_A58AlbRUniEnt[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T01HV2_A55AlbRReo[0]) != 0 ) || ( Z54AlbRPieUti != T01HV2_A54AlbRPieUti[0] ) || ( Z53AlbRPieReb != T01HV2_A53AlbRPieReb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01HV2_A60AlbRUniUti[0]) != 0 ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T01HV2_A59AlbRUniReb[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01HV2_A48AlbRFecUlt[0])) ) || ( Z47AlbREst != T01HV2_A47AlbREst[0] ) || ( Z1222AlbNumEti != T01HV2_A1222AlbNumEti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1291AlbRDes, T01HV2_A1291AlbRDes[0]) != 0 ) || ( Z1301AlbRUlin != T01HV2_A1301AlbRUlin[0] ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01HV2_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4290AlbPmPPza, T01HV2_A4290AlbPmPPza[0]) != 0 ) || ( Z4920AlbRGrm2 != T01HV2_A4920AlbRGrm2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4921AlbRAnc != T01HV2_A4921AlbRAnc[0] ) || ( Z4922AlbPml != T01HV2_A4922AlbPml[0] ) || ( DecimalUtil.compareTo(Z5743AlbRPre, T01HV2_A5743AlbRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z5744AlbRAju, T01HV2_A5744AlbRAju[0]) != 0 ) || ( Z5745AlbRRep != T01HV2_A5745AlbRRep[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5806AlbREnt2, T01HV2_A5806AlbREnt2[0]) != 0 ) || ( GXutil.strcmp(Z6178AlbrUsu, T01HV2_A6178AlbrUsu[0]) != 0 ) || !( GXutil.dateCompare(Z6179AlbrHor, T01HV2_A6179AlbrHor[0]) ) || ( DecimalUtil.compareTo(Z6180AlbrUniC, T01HV2_A6180AlbrUniC[0]) != 0 ) || ( Z6181AlbrPieC != T01HV2_A6181AlbrPieC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6182AlbrNF, T01HV2_A6182AlbrNF[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(T01HV2_A6183AlbrFeNf[0])) ) || ( GXutil.strcmp(Z6184AlbrCfop, T01HV2_A6184AlbrCfop[0]) != 0 ) || ( GXutil.strcmp(Z3359AlbRDisCli, T01HV2_A3359AlbRDisCli[0]) != 0 ) || ( GXutil.strcmp(Z3360AlbRImp, T01HV2_A3360AlbRImp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6463AlbRLote, T01HV2_A6463AlbRLote[0]) != 0 ) || ( GXutil.strcmp(Z6464AlbRTelar, T01HV2_A6464AlbRTelar[0]) != 0 ) || ( DecimalUtil.compareTo(Z6465AlbRLu, T01HV2_A6465AlbRLu[0]) != 0 ) || ( GXutil.strcmp(Z4602AlbRMdlCod, T01HV2_A4602AlbRMdlCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z6470AlbRTara, T01HV2_A6470AlbRTara[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6471AlbRUniB, T01HV2_A6471AlbRUniB[0]) != 0 ) || ( GXutil.strcmp(Z6488AlbDocPrv, T01HV2_A6488AlbDocPrv[0]) != 0 ) || ( DecimalUtil.compareTo(Z6523AlbRUdas, T01HV2_A6523AlbRUdas[0]) != 0 ) || ( GXutil.strcmp(Z8023AlbColor, T01HV2_A8023AlbColor[0]) != 0 ) || ( GXutil.strcmp(Z8024AlbOpsT, T01HV2_A8024AlbOpsT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8025AlbOpsC, T01HV2_A8025AlbOpsC[0]) != 0 ) || ( GXutil.strcmp(Z8026AlbOC, T01HV2_A8026AlbOC[0]) != 0 ) || ( GXutil.strcmp(Z8027AlbHdri, T01HV2_A8027AlbHdri[0]) != 0 ) || ( GXutil.strcmp(Z8028AlbNumB, T01HV2_A8028AlbNumB[0]) != 0 ) || ( GXutil.strcmp(Z8029AlbNumM, T01HV2_A8029AlbNumM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8030AlbAncC, T01HV2_A8030AlbAncC[0]) != 0 ) || ( Z8031AlbDndC != T01HV2_A8031AlbDndC[0] ) || ( DecimalUtil.compareTo(Z8032AlbAncCr, T01HV2_A8032AlbAncCr[0]) != 0 ) || ( Z8033AlbDndCr != T01HV2_A8033AlbDndCr[0] ) || ( Z8034AlbGalga != T01HV2_A8034AlbGalga[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8035AlbMaqTej, T01HV2_A8035AlbMaqTej[0]) != 0 ) || ( Z8036AlbDmt != T01HV2_A8036AlbDmt[0] ) || ( GXutil.strcmp(Z9793AlbPdaC, T01HV2_A9793AlbPdaC[0]) != 0 ) || ( GXutil.strcmp(Z9794AlbOStj, T01HV2_A9794AlbOStj[0]) != 0 ) || ( Z317AlbStLot != T01HV2_A317AlbStLot[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10358AlbTurno != T01HV2_A10358AlbTurno[0] ) || ( Z252CliCod != T01HV2_A252CliCod[0] ) || ( Z6263AlbRTartC != T01HV2_A6263AlbRTartC[0] ) || ( Z840TrnCod != T01HV2_A840TrnCod[0] ) || ( Z970ProceCod != T01HV2_A970ProceCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1211TipEntCod != T01HV2_A1211TipEntCod[0] ) || ( Z4792AlmCod != T01HV2_A4792AlmCod[0] ) )
         {
            if ( GXutil.strcmp(Z45AlbRef, T01HV2_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01HV2_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T01HV2_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T01HV2_A46AlbREnt[0]);
            }
            if ( Z52AlbRPieEnt != T01HV2_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01HV2_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01HV2_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01HV2_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T01HV2_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T01HV2_A50AlbRLoc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01HV2_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T01HV2_A49AlbRFen[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01HV2_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01HV2_A58AlbRUniEnt[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01HV2_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01HV2_A55AlbRReo[0]);
            }
            if ( Z54AlbRPieUti != T01HV2_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01HV2_A54AlbRPieUti[0]);
            }
            if ( Z53AlbRPieReb != T01HV2_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T01HV2_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01HV2_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01HV2_A60AlbRUniUti[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T01HV2_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T01HV2_A59AlbRUniReb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01HV2_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T01HV2_A48AlbRFecUlt[0]);
            }
            if ( Z47AlbREst != T01HV2_A47AlbREst[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01HV2_A47AlbREst[0]);
            }
            if ( Z1222AlbNumEti != T01HV2_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T01HV2_A1222AlbNumEti[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T01HV2_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T01HV2_A1291AlbRDes[0]);
            }
            if ( Z1301AlbRUlin != T01HV2_A1301AlbRUlin[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUlin");
               GXutil.writeLogRaw("Old: ",Z1301AlbRUlin);
               GXutil.writeLogRaw("Current: ",T01HV2_A1301AlbRUlin[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01HV2_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01HV2_A3613AlbRefDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z4290AlbPmPPza, T01HV2_A4290AlbPmPPza[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbPmPPza");
               GXutil.writeLogRaw("Old: ",Z4290AlbPmPPza);
               GXutil.writeLogRaw("Current: ",T01HV2_A4290AlbPmPPza[0]);
            }
            if ( Z4920AlbRGrm2 != T01HV2_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01HV2_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01HV2_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01HV2_A4921AlbRAnc[0]);
            }
            if ( Z4922AlbPml != T01HV2_A4922AlbPml[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbPml");
               GXutil.writeLogRaw("Old: ",Z4922AlbPml);
               GXutil.writeLogRaw("Current: ",T01HV2_A4922AlbPml[0]);
            }
            if ( DecimalUtil.compareTo(Z5743AlbRPre, T01HV2_A5743AlbRPre[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRPre");
               GXutil.writeLogRaw("Old: ",Z5743AlbRPre);
               GXutil.writeLogRaw("Current: ",T01HV2_A5743AlbRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z5744AlbRAju, T01HV2_A5744AlbRAju[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRAju");
               GXutil.writeLogRaw("Old: ",Z5744AlbRAju);
               GXutil.writeLogRaw("Current: ",T01HV2_A5744AlbRAju[0]);
            }
            if ( Z5745AlbRRep != T01HV2_A5745AlbRRep[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRRep");
               GXutil.writeLogRaw("Old: ",Z5745AlbRRep);
               GXutil.writeLogRaw("Current: ",T01HV2_A5745AlbRRep[0]);
            }
            if ( GXutil.strcmp(Z5806AlbREnt2, T01HV2_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T01HV2_A5806AlbREnt2[0]);
            }
            if ( GXutil.strcmp(Z6178AlbrUsu, T01HV2_A6178AlbrUsu[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrUsu");
               GXutil.writeLogRaw("Old: ",Z6178AlbrUsu);
               GXutil.writeLogRaw("Current: ",T01HV2_A6178AlbrUsu[0]);
            }
            if ( !( GXutil.dateCompare(Z6179AlbrHor, T01HV2_A6179AlbrHor[0]) ) )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrHor");
               GXutil.writeLogRaw("Old: ",Z6179AlbrHor);
               GXutil.writeLogRaw("Current: ",T01HV2_A6179AlbrHor[0]);
            }
            if ( DecimalUtil.compareTo(Z6180AlbrUniC, T01HV2_A6180AlbrUniC[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrUniC");
               GXutil.writeLogRaw("Old: ",Z6180AlbrUniC);
               GXutil.writeLogRaw("Current: ",T01HV2_A6180AlbrUniC[0]);
            }
            if ( Z6181AlbrPieC != T01HV2_A6181AlbrPieC[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrPieC");
               GXutil.writeLogRaw("Old: ",Z6181AlbrPieC);
               GXutil.writeLogRaw("Current: ",T01HV2_A6181AlbrPieC[0]);
            }
            if ( GXutil.strcmp(Z6182AlbrNF, T01HV2_A6182AlbrNF[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrNF");
               GXutil.writeLogRaw("Old: ",Z6182AlbrNF);
               GXutil.writeLogRaw("Current: ",T01HV2_A6182AlbrNF[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(T01HV2_A6183AlbrFeNf[0])) ) )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrFeNf");
               GXutil.writeLogRaw("Old: ",Z6183AlbrFeNf);
               GXutil.writeLogRaw("Current: ",T01HV2_A6183AlbrFeNf[0]);
            }
            if ( GXutil.strcmp(Z6184AlbrCfop, T01HV2_A6184AlbrCfop[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbrCfop");
               GXutil.writeLogRaw("Old: ",Z6184AlbrCfop);
               GXutil.writeLogRaw("Current: ",T01HV2_A6184AlbrCfop[0]);
            }
            if ( GXutil.strcmp(Z3359AlbRDisCli, T01HV2_A3359AlbRDisCli[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRDisCli");
               GXutil.writeLogRaw("Old: ",Z3359AlbRDisCli);
               GXutil.writeLogRaw("Current: ",T01HV2_A3359AlbRDisCli[0]);
            }
            if ( GXutil.strcmp(Z3360AlbRImp, T01HV2_A3360AlbRImp[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRImp");
               GXutil.writeLogRaw("Old: ",Z3360AlbRImp);
               GXutil.writeLogRaw("Current: ",T01HV2_A3360AlbRImp[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01HV2_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01HV2_A6463AlbRLote[0]);
            }
            if ( GXutil.strcmp(Z6464AlbRTelar, T01HV2_A6464AlbRTelar[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRTelar");
               GXutil.writeLogRaw("Old: ",Z6464AlbRTelar);
               GXutil.writeLogRaw("Current: ",T01HV2_A6464AlbRTelar[0]);
            }
            if ( DecimalUtil.compareTo(Z6465AlbRLu, T01HV2_A6465AlbRLu[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRLu");
               GXutil.writeLogRaw("Old: ",Z6465AlbRLu);
               GXutil.writeLogRaw("Current: ",T01HV2_A6465AlbRLu[0]);
            }
            if ( GXutil.strcmp(Z4602AlbRMdlCod, T01HV2_A4602AlbRMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRMdlCod");
               GXutil.writeLogRaw("Old: ",Z4602AlbRMdlCod);
               GXutil.writeLogRaw("Current: ",T01HV2_A4602AlbRMdlCod[0]);
            }
            if ( DecimalUtil.compareTo(Z6470AlbRTara, T01HV2_A6470AlbRTara[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRTara");
               GXutil.writeLogRaw("Old: ",Z6470AlbRTara);
               GXutil.writeLogRaw("Current: ",T01HV2_A6470AlbRTara[0]);
            }
            if ( DecimalUtil.compareTo(Z6471AlbRUniB, T01HV2_A6471AlbRUniB[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUniB");
               GXutil.writeLogRaw("Old: ",Z6471AlbRUniB);
               GXutil.writeLogRaw("Current: ",T01HV2_A6471AlbRUniB[0]);
            }
            if ( GXutil.strcmp(Z6488AlbDocPrv, T01HV2_A6488AlbDocPrv[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbDocPrv");
               GXutil.writeLogRaw("Old: ",Z6488AlbDocPrv);
               GXutil.writeLogRaw("Current: ",T01HV2_A6488AlbDocPrv[0]);
            }
            if ( DecimalUtil.compareTo(Z6523AlbRUdas, T01HV2_A6523AlbRUdas[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRUdas");
               GXutil.writeLogRaw("Old: ",Z6523AlbRUdas);
               GXutil.writeLogRaw("Current: ",T01HV2_A6523AlbRUdas[0]);
            }
            if ( GXutil.strcmp(Z8023AlbColor, T01HV2_A8023AlbColor[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbColor");
               GXutil.writeLogRaw("Old: ",Z8023AlbColor);
               GXutil.writeLogRaw("Current: ",T01HV2_A8023AlbColor[0]);
            }
            if ( GXutil.strcmp(Z8024AlbOpsT, T01HV2_A8024AlbOpsT[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbOpsT");
               GXutil.writeLogRaw("Old: ",Z8024AlbOpsT);
               GXutil.writeLogRaw("Current: ",T01HV2_A8024AlbOpsT[0]);
            }
            if ( GXutil.strcmp(Z8025AlbOpsC, T01HV2_A8025AlbOpsC[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbOpsC");
               GXutil.writeLogRaw("Old: ",Z8025AlbOpsC);
               GXutil.writeLogRaw("Current: ",T01HV2_A8025AlbOpsC[0]);
            }
            if ( GXutil.strcmp(Z8026AlbOC, T01HV2_A8026AlbOC[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbOC");
               GXutil.writeLogRaw("Old: ",Z8026AlbOC);
               GXutil.writeLogRaw("Current: ",T01HV2_A8026AlbOC[0]);
            }
            if ( GXutil.strcmp(Z8027AlbHdri, T01HV2_A8027AlbHdri[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbHdri");
               GXutil.writeLogRaw("Old: ",Z8027AlbHdri);
               GXutil.writeLogRaw("Current: ",T01HV2_A8027AlbHdri[0]);
            }
            if ( GXutil.strcmp(Z8028AlbNumB, T01HV2_A8028AlbNumB[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbNumB");
               GXutil.writeLogRaw("Old: ",Z8028AlbNumB);
               GXutil.writeLogRaw("Current: ",T01HV2_A8028AlbNumB[0]);
            }
            if ( GXutil.strcmp(Z8029AlbNumM, T01HV2_A8029AlbNumM[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbNumM");
               GXutil.writeLogRaw("Old: ",Z8029AlbNumM);
               GXutil.writeLogRaw("Current: ",T01HV2_A8029AlbNumM[0]);
            }
            if ( DecimalUtil.compareTo(Z8030AlbAncC, T01HV2_A8030AlbAncC[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbAncC");
               GXutil.writeLogRaw("Old: ",Z8030AlbAncC);
               GXutil.writeLogRaw("Current: ",T01HV2_A8030AlbAncC[0]);
            }
            if ( Z8031AlbDndC != T01HV2_A8031AlbDndC[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbDndC");
               GXutil.writeLogRaw("Old: ",Z8031AlbDndC);
               GXutil.writeLogRaw("Current: ",T01HV2_A8031AlbDndC[0]);
            }
            if ( DecimalUtil.compareTo(Z8032AlbAncCr, T01HV2_A8032AlbAncCr[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbAncCr");
               GXutil.writeLogRaw("Old: ",Z8032AlbAncCr);
               GXutil.writeLogRaw("Current: ",T01HV2_A8032AlbAncCr[0]);
            }
            if ( Z8033AlbDndCr != T01HV2_A8033AlbDndCr[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbDndCr");
               GXutil.writeLogRaw("Old: ",Z8033AlbDndCr);
               GXutil.writeLogRaw("Current: ",T01HV2_A8033AlbDndCr[0]);
            }
            if ( Z8034AlbGalga != T01HV2_A8034AlbGalga[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbGalga");
               GXutil.writeLogRaw("Old: ",Z8034AlbGalga);
               GXutil.writeLogRaw("Current: ",T01HV2_A8034AlbGalga[0]);
            }
            if ( GXutil.strcmp(Z8035AlbMaqTej, T01HV2_A8035AlbMaqTej[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbMaqTej");
               GXutil.writeLogRaw("Old: ",Z8035AlbMaqTej);
               GXutil.writeLogRaw("Current: ",T01HV2_A8035AlbMaqTej[0]);
            }
            if ( Z8036AlbDmt != T01HV2_A8036AlbDmt[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbDmt");
               GXutil.writeLogRaw("Old: ",Z8036AlbDmt);
               GXutil.writeLogRaw("Current: ",T01HV2_A8036AlbDmt[0]);
            }
            if ( GXutil.strcmp(Z9793AlbPdaC, T01HV2_A9793AlbPdaC[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbPdaC");
               GXutil.writeLogRaw("Old: ",Z9793AlbPdaC);
               GXutil.writeLogRaw("Current: ",T01HV2_A9793AlbPdaC[0]);
            }
            if ( GXutil.strcmp(Z9794AlbOStj, T01HV2_A9794AlbOStj[0]) != 0 )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbOStj");
               GXutil.writeLogRaw("Old: ",Z9794AlbOStj);
               GXutil.writeLogRaw("Current: ",T01HV2_A9794AlbOStj[0]);
            }
            if ( Z317AlbStLot != T01HV2_A317AlbStLot[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbStLot");
               GXutil.writeLogRaw("Old: ",Z317AlbStLot);
               GXutil.writeLogRaw("Current: ",T01HV2_A317AlbStLot[0]);
            }
            if ( Z10358AlbTurno != T01HV2_A10358AlbTurno[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbTurno");
               GXutil.writeLogRaw("Old: ",Z10358AlbTurno);
               GXutil.writeLogRaw("Current: ",T01HV2_A10358AlbTurno[0]);
            }
            if ( Z252CliCod != T01HV2_A252CliCod[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01HV2_A252CliCod[0]);
            }
            if ( Z6263AlbRTartC != T01HV2_A6263AlbRTartC[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlbRTartC");
               GXutil.writeLogRaw("Old: ",Z6263AlbRTartC);
               GXutil.writeLogRaw("Current: ",T01HV2_A6263AlbRTartC[0]);
            }
            if ( Z840TrnCod != T01HV2_A840TrnCod[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01HV2_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T01HV2_A970ProceCod[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T01HV2_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T01HV2_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T01HV2_A1211TipEntCod[0]);
            }
            if ( Z4792AlmCod != T01HV2_A4792AlmCod[0] )
            {
               GXutil.writeLogln("ttralbrec:[seudo value changed for attri]"+"AlmCod");
               GXutil.writeLogRaw("Old: ",Z4792AlmCod);
               GXutil.writeLogRaw("Current: ",T01HV2_A4792AlmCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HV7( )
   {
      beforeValidate1HV7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HV7( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HV7( 0) ;
         checkOptimisticConcurrency1HV7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HV7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HV7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HV20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A45AlbRef, A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A3613AlbRefDsc, A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A5806AlbREnt2, A6178AlbrUsu, A6179AlbrHor, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6463AlbRLote, A6464AlbRTelar, A6465AlbRLu, A4602AlbRMdlCod, A6470AlbRTara, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8028AlbNumB, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8034AlbGalga), A8035AlbMaqTej, Short.valueOf(A8036AlbDmt), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A317AlbStLot), Byte.valueOf(A10358AlbTurno), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        resetCaption1HV0( ) ;
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
            load1HV7( ) ;
         }
         endLevel1HV7( ) ;
      }
      closeExtendedTableCursors1HV7( ) ;
   }

   public void update1HV7( )
   {
      beforeValidate1HV7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HV7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HV7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HV7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HV7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HV21 */
                  pr_default.execute(19, new Object[] {A45AlbRef, A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A3613AlbRefDsc, A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A5806AlbREnt2, A6178AlbrUsu, A6179AlbrHor, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6463AlbRLote, A6464AlbRTelar, A6465AlbRLu, A4602AlbRMdlCod, A6470AlbRTara, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8028AlbNumB, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8034AlbGalga), A8035AlbMaqTej, Short.valueOf(A8036AlbDmt), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A317AlbStLot), Byte.valueOf(A10358AlbTurno), Integer.valueOf(A252CliCod), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HV7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                     ttralbrec_impl.this.A396EmprCod = GXv_char1[0] ;
                     ttralbrec_impl.this.A44AlbRecCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HV0( ) ;
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
         endLevel1HV7( ) ;
      }
      closeExtendedTableCursors1HV7( ) ;
   }

   public void deferredUpdate1HV7( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HV7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HV7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HV7( ) ;
         afterConfirm1HV7( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HV7( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HV22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound7 == 0 )
                     {
                        initAll1HV7( ) ;
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
                     resetCaption1HV0( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HV7( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HV7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01HV23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A8723CliEst = T01HV23_A8723CliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         pr_default.close(21);
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         /* Using cursor T01HV24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
         A6264AlbRTartD = T01HV24_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01HV24_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         pr_default.close(22);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HV25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01HV26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01HV27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01HV28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01HV29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01HV30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01HV31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01HV32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01HV33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01HV34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01HV35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01HV36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01HV37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01HV38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01HV39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void endLevel1HV7( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HV7( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttralbrec");
         if ( AnyError == 0 )
         {
            confirmValues1HV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttralbrec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HV7( )
   {
      /* Using cursor T01HV40 */
      pr_default.execute(38);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T01HV40_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01HV40_A44AlbRecCod[0] ;
         n44AlbRecCod = T01HV40_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HV7( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T01HV40_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01HV40_A44AlbRecCod[0] ;
         n44AlbRecCod = T01HV40_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1HV7( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1HV7( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HV7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HV7( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HV7( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HV7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HV7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HV7( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniReb_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtAlbNumEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPre_Enabled), 5, 0), true);
      edtAlbRAju_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAju_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAju_Enabled), 5, 0), true);
      chkAlbRRep.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkAlbRRep.getInternalname(), "Enabled", GXutil.ltrimstr( chkAlbRRep.getEnabled(), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUsu_Enabled), 5, 0), true);
      edtAlbrHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrHor_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbrNF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrNF_Enabled), 5, 0), true);
      edtAlbrFeNf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrFeNf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrFeNf_Enabled), 5, 0), true);
      edtAlbrCfop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrCfop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrCfop_Enabled), 5, 0), true);
      edtAlbRDisCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDisCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDisCli_Enabled), 5, 0), true);
      edtAlbRTartC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartC_Enabled), 5, 0), true);
      edtAlbRTartD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartD_Enabled), 5, 0), true);
      edtAlbRImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRImp_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRTelar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTelar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTelar_Enabled), 5, 0), true);
      edtAlbRLu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLu_Enabled), 5, 0), true);
      edtAlbRMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Enabled), 5, 0), true);
      edtAlbRTara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTara_Enabled), 5, 0), true);
      edtAlbRUniB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniB_Enabled), 5, 0), true);
      edtAlbDocPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDocPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDocPrv_Enabled), 5, 0), true);
      edtAlbRUdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUdas_Enabled), 5, 0), true);
      edtAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmCod_Enabled), 5, 0), true);
      edtAlbColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColor_Enabled), 5, 0), true);
      edtAlbOpsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOpsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOpsT_Enabled), 5, 0), true);
      edtAlbOpsC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOpsC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOpsC_Enabled), 5, 0), true);
      edtAlbOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOC_Enabled), 5, 0), true);
      edtAlbHdri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdri_Enabled), 5, 0), true);
      edtAlbNumB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumB_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtAlbAncC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbAncC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbAncC_Enabled), 5, 0), true);
      edtAlbDndC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDndC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDndC_Enabled), 5, 0), true);
      edtAlbAncCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbAncCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbAncCr_Enabled), 5, 0), true);
      edtAlbDndCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDndCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDndCr_Enabled), 5, 0), true);
      edtAlbGalga_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGalga_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGalga_Enabled), 5, 0), true);
      edtAlbMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMaqTej_Enabled), 5, 0), true);
      edtAlbDmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDmt_Enabled), 5, 0), true);
      edtAlbPdaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdaC_Enabled), 5, 0), true);
      edtAlbOStj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOStj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOStj_Enabled), 5, 0), true);
      edtAlbStLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbStLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbStLot_Enabled), 5, 0), true);
      edtAlbTurno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTurno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTurno_Enabled), 5, 0), true);
      edtCliEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEst_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HV7( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HV0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttralbrec", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5743AlbRPre", GXutil.ltrim( localUtil.ntoc( Z5743AlbRPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5744AlbRAju", GXutil.ltrim( localUtil.ntoc( Z5744AlbRAju, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5745AlbRRep", GXutil.ltrim( localUtil.ntoc( Z5745AlbRRep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6178AlbrUsu", GXutil.rtrim( Z6178AlbrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6179AlbrHor", localUtil.ttoc( Z6179AlbrHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6183AlbrFeNf", localUtil.dtoc( Z6183AlbrFeNf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6184AlbrCfop", GXutil.rtrim( Z6184AlbrCfop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3360AlbRImp", GXutil.rtrim( Z3360AlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6464AlbRTelar", GXutil.rtrim( Z6464AlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6465AlbRLu", GXutil.ltrim( localUtil.ntoc( Z6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6470AlbRTara", GXutil.ltrim( localUtil.ntoc( Z6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( Z6471AlbRUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6488AlbDocPrv", GXutil.rtrim( Z6488AlbDocPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( Z6523AlbRUdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8023AlbColor", GXutil.rtrim( Z8023AlbColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8024AlbOpsT", GXutil.rtrim( Z8024AlbOpsT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8025AlbOpsC", GXutil.rtrim( Z8025AlbOpsC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8026AlbOC", GXutil.rtrim( Z8026AlbOC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8027AlbHdri", GXutil.rtrim( Z8027AlbHdri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8028AlbNumB", GXutil.rtrim( Z8028AlbNumB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8030AlbAncC", GXutil.ltrim( localUtil.ntoc( Z8030AlbAncC, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8031AlbDndC", GXutil.ltrim( localUtil.ntoc( Z8031AlbDndC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( Z8032AlbAncCr, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( Z8033AlbDndCr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8034AlbGalga", GXutil.ltrim( localUtil.ntoc( Z8034AlbGalga, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8035AlbMaqTej", GXutil.rtrim( Z8035AlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8036AlbDmt", GXutil.ltrim( localUtil.ntoc( Z8036AlbDmt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9793AlbPdaC", GXutil.rtrim( Z9793AlbPdaC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9794AlbOStj", GXutil.rtrim( Z9794AlbOStj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z317AlbStLot", GXutil.ltrim( localUtil.ntoc( Z317AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10358AlbTurno", GXutil.ltrim( localUtil.ntoc( Z10358AlbTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( Z6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4792AlmCod", GXutil.ltrim( localUtil.ntoc( Z4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttralbrec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrALBREC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALBREC", "") ;
   }

   public void initializeNonKey1HV7( )
   {
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A50AlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A49AlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A55AlbRReo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A48AlbRFecUlt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A1301AlbRUlin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A4922AlbPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
      A5743AlbRPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
      A5744AlbRAju = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
      A5745AlbRRep = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A6178AlbrUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6180AlbrUniC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      A6181AlbrPieC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      A6182AlbrNF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      A6183AlbrFeNf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      A6184AlbrCfop = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
      A3359AlbRDisCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
      A6263AlbRTartC = (short)(0) ;
      n6263AlbRTartC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      A6264AlbRTartD = "" ;
      n6264AlbRTartD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      A3360AlbRImp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      A6463AlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A6464AlbRTelar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      A6465AlbRLu = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      A4602AlbRMdlCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A6470AlbRTara = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      A6471AlbRUniB = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      A6488AlbDocPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
      A6523AlbRUdas = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
      A4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
      A8023AlbColor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
      A8024AlbOpsT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
      A8025AlbOpsC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
      A8026AlbOC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
      A8027AlbHdri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
      A8028AlbNumB = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
      A8029AlbNumM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
      A8030AlbAncC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
      A8031AlbDndC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
      A8032AlbAncCr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
      A8033AlbDndCr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
      A8034AlbGalga = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
      A8035AlbMaqTej = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
      A8036AlbDmt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
      A9793AlbPdaC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
      A9794AlbOStj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
      A317AlbStLot = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
      A10358AlbTurno = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
      A8723CliEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z55AlbRReo = "" ;
      Z54AlbRPieUti = 0 ;
      Z53AlbRPieReb = 0 ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z47AlbREst = (byte)(0) ;
      Z1222AlbNumEti = (short)(0) ;
      Z1291AlbRDes = "" ;
      Z1301AlbRUlin = (byte)(0) ;
      Z3613AlbRefDsc = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z5745AlbRRep = (byte)(0) ;
      Z5806AlbREnt2 = "" ;
      Z6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8028AlbNumB = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8031AlbDndC = (short)(0) ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z8033AlbDndCr = (short)(0) ;
      Z8034AlbGalga = (short)(0) ;
      Z8035AlbMaqTej = "" ;
      Z8036AlbDmt = (short)(0) ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      Z317AlbStLot = (byte)(0) ;
      Z10358AlbTurno = (byte)(0) ;
      Z252CliCod = 0 ;
      Z6263AlbRTartC = (short)(0) ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
      Z4792AlmCod = (byte)(0) ;
   }

   public void initAll1HV7( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1HV7( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016325959", true, true);
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
      httpContext.AddJavascriptSource("ttralbrec.js", "?202661016325960", false, true);
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAlbRef_Internalname = "ALBREF" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtAlbRPieReb_Internalname = "ALBRPIEREB" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAlbRUniReb_Internalname = "ALBRUNIREB" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtAlbNumEti_Internalname = "ALBNUMETI" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtProceCod_Internalname = "PROCECOD" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtAlbRUlin_Internalname = "ALBRULIN" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtAlbPmPPza_Internalname = "ALBPMPPZA" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtAlbPml_Internalname = "ALBPML" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtAlbRPre_Internalname = "ALBRPRE" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtAlbRAju_Internalname = "ALBRAJU" ;
      chkAlbRRep.setInternalname( "ALBRREP" );
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtAlbrUsu_Internalname = "ALBRUSU" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtAlbrHor_Internalname = "ALBRHOR" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtAlbrUniC_Internalname = "ALBRUNIC" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtAlbrPieC_Internalname = "ALBRPIEC" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtAlbrNF_Internalname = "ALBRNF" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtAlbrFeNf_Internalname = "ALBRFENF" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtAlbrCfop_Internalname = "ALBRCFOP" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtAlbRDisCli_Internalname = "ALBRDISCLI" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtAlbRTartC_Internalname = "ALBRTARTC" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtAlbRTartD_Internalname = "ALBRTARTD" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtAlbRImp_Internalname = "ALBRIMP" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtAlbRTelar_Internalname = "ALBRTELAR" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtAlbRLu_Internalname = "ALBRLU" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtAlbRTara_Internalname = "ALBRTARA" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtAlbRUniB_Internalname = "ALBRUNIB" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtAlbDocPrv_Internalname = "ALBDOCPRV" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtAlbRUdas_Internalname = "ALBRUDAS" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtAlmCod_Internalname = "ALMCOD" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtAlbColor_Internalname = "ALBCOLOR" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtAlbOpsT_Internalname = "ALBOPST" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtAlbOpsC_Internalname = "ALBOPSC" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtAlbOC_Internalname = "ALBOC" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtAlbHdri_Internalname = "ALBHDRI" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtAlbNumB_Internalname = "ALBNUMB" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtAlbNumM_Internalname = "ALBNUMM" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtAlbAncC_Internalname = "ALBANCC" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtAlbDndC_Internalname = "ALBDNDC" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtAlbAncCr_Internalname = "ALBANCCR" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtAlbDndCr_Internalname = "ALBDNDCR" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtAlbGalga_Internalname = "ALBGALGA" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtAlbMaqTej_Internalname = "ALBMAQTEJ" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtAlbDmt_Internalname = "ALBDMT" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtAlbPdaC_Internalname = "ALBPDAC" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtAlbOStj_Internalname = "ALBOSTJ" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtAlbStLot_Internalname = "ALBSTLOT" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtAlbTurno_Internalname = "ALBTURNO" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtCliEst_Internalname = "CLIEST" ;
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
      Form.setCaption( httpContext.getMessage( "ALBREC", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCliEst_Jsonclick = "" ;
      edtCliEst_Backcolor = (int)(0xFFFFFF) ;
      edtCliEst_Enabled = 0 ;
      edtAlbTurno_Jsonclick = "" ;
      edtAlbTurno_Backcolor = (int)(0xFFFFFF) ;
      edtAlbTurno_Enabled = 1 ;
      edtAlbStLot_Jsonclick = "" ;
      edtAlbStLot_Backcolor = (int)(0xFFFFFF) ;
      edtAlbStLot_Enabled = 1 ;
      edtAlbOStj_Jsonclick = "" ;
      edtAlbOStj_Backcolor = (int)(0xFFFFFF) ;
      edtAlbOStj_Enabled = 1 ;
      edtAlbPdaC_Jsonclick = "" ;
      edtAlbPdaC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPdaC_Enabled = 1 ;
      edtAlbDmt_Jsonclick = "" ;
      edtAlbDmt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDmt_Enabled = 1 ;
      edtAlbMaqTej_Jsonclick = "" ;
      edtAlbMaqTej_Backcolor = (int)(0xFFFFFF) ;
      edtAlbMaqTej_Enabled = 1 ;
      edtAlbGalga_Jsonclick = "" ;
      edtAlbGalga_Backcolor = (int)(0xFFFFFF) ;
      edtAlbGalga_Enabled = 1 ;
      edtAlbDndCr_Jsonclick = "" ;
      edtAlbDndCr_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDndCr_Enabled = 1 ;
      edtAlbAncCr_Jsonclick = "" ;
      edtAlbAncCr_Backcolor = (int)(0xFFFFFF) ;
      edtAlbAncCr_Enabled = 1 ;
      edtAlbDndC_Jsonclick = "" ;
      edtAlbDndC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDndC_Enabled = 1 ;
      edtAlbAncC_Jsonclick = "" ;
      edtAlbAncC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbAncC_Enabled = 1 ;
      edtAlbNumM_Jsonclick = "" ;
      edtAlbNumM_Backcolor = (int)(0xFFFFFF) ;
      edtAlbNumM_Enabled = 1 ;
      edtAlbNumB_Jsonclick = "" ;
      edtAlbNumB_Backcolor = (int)(0xFFFFFF) ;
      edtAlbNumB_Enabled = 1 ;
      edtAlbHdri_Jsonclick = "" ;
      edtAlbHdri_Backcolor = (int)(0xFFFFFF) ;
      edtAlbHdri_Enabled = 1 ;
      edtAlbOC_Jsonclick = "" ;
      edtAlbOC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbOC_Enabled = 1 ;
      edtAlbOpsC_Jsonclick = "" ;
      edtAlbOpsC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbOpsC_Enabled = 1 ;
      edtAlbOpsT_Jsonclick = "" ;
      edtAlbOpsT_Backcolor = (int)(0xFFFFFF) ;
      edtAlbOpsT_Enabled = 1 ;
      edtAlbColor_Jsonclick = "" ;
      edtAlbColor_Backcolor = (int)(0xFFFFFF) ;
      edtAlbColor_Enabled = 1 ;
      edtAlmCod_Jsonclick = "" ;
      edtAlmCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlmCod_Enabled = 1 ;
      edtAlbRUdas_Jsonclick = "" ;
      edtAlbRUdas_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUdas_Enabled = 1 ;
      edtAlbDocPrv_Jsonclick = "" ;
      edtAlbDocPrv_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDocPrv_Enabled = 1 ;
      edtAlbRUniB_Jsonclick = "" ;
      edtAlbRUniB_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniB_Enabled = 1 ;
      edtAlbRTara_Jsonclick = "" ;
      edtAlbRTara_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRTara_Enabled = 1 ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRMdlCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRMdlCod_Enabled = 1 ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRLu_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRLu_Enabled = 1 ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRTelar_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRTelar_Enabled = 1 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRLote_Enabled = 1 ;
      edtAlbRImp_Jsonclick = "" ;
      edtAlbRImp_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRImp_Enabled = 1 ;
      edtAlbRTartD_Jsonclick = "" ;
      edtAlbRTartD_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRTartD_Enabled = 0 ;
      edtAlbRTartC_Jsonclick = "" ;
      edtAlbRTartC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRTartC_Enabled = 1 ;
      edtAlbRDisCli_Jsonclick = "" ;
      edtAlbRDisCli_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRDisCli_Enabled = 1 ;
      edtAlbrCfop_Jsonclick = "" ;
      edtAlbrCfop_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrCfop_Enabled = 1 ;
      edtAlbrFeNf_Jsonclick = "" ;
      edtAlbrFeNf_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrFeNf_Enabled = 1 ;
      edtAlbrNF_Jsonclick = "" ;
      edtAlbrNF_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrNF_Enabled = 1 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrPieC_Enabled = 1 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrUniC_Enabled = 1 ;
      edtAlbrHor_Jsonclick = "" ;
      edtAlbrHor_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrHor_Enabled = 1 ;
      edtAlbrUsu_Jsonclick = "" ;
      edtAlbrUsu_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrUsu_Enabled = 1 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Backcolor = (int)(0xFFFFFF) ;
      edtAlbREnt2_Enabled = 1 ;
      chkAlbRRep.setIBackground( (int)(0xFFFFFF) );
      chkAlbRRep.setEnabled( 1 );
      edtAlbRAju_Jsonclick = "" ;
      edtAlbRAju_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRAju_Enabled = 1 ;
      edtAlbRPre_Jsonclick = "" ;
      edtAlbRPre_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPre_Enabled = 1 ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPml_Enabled = 1 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRAnc_Enabled = 1 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRGrm2_Enabled = 1 ;
      edtAlbPmPPza_Jsonclick = "" ;
      edtAlbPmPPza_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPmPPza_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRefDsc_Enabled = 1 ;
      edtAlbRUlin_Jsonclick = "" ;
      edtAlbRUlin_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUlin_Enabled = 1 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtProceCod_Enabled = 1 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRDes_Enabled = 1 ;
      edtAlbNumEti_Jsonclick = "" ;
      edtAlbNumEti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbNumEti_Enabled = 1 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntCod_Enabled = 1 ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 1 );
      cmbAlbREst.setIBackground( (int)(0xFFFFFF) );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFecUlt_Enabled = 1 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniReb_Jsonclick = "" ;
      edtAlbRUniReb_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniReb_Enabled = 1 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniUti_Enabled = 1 ;
      edtAlbRPieReb_Jsonclick = "" ;
      edtAlbRPieReb_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieReb_Enabled = 1 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieUti_Enabled = 1 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      cmbAlbRReo.setIBackground( (int)(0xFFFFFF) );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFen_Enabled = 1 ;
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRLoc_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      cmbAlbRUni.setIBackground( (int)(0xFFFFFF) );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieEnt_Enabled = 1 ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbREnt_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRef_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      chkAlbRRep.setName( "ALBRREP" );
      chkAlbRRep.setWebtags( "" );
      chkAlbRRep.setCaption( httpContext.getMessage( "Mostrar en Reportes", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkAlbRRep.getInternalname(), "TitleCaption", chkAlbRRep.getCaption(), true);
      chkAlbRRep.setCheckedValue( "0" );
      A5745AlbRRep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtCliCod_Internalname ;
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

   public void valid_Albreccod( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n44AlbRecCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      A5745AlbRRep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrim( localUtil.ntoc( A5743AlbRPre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrim( localUtil.ntoc( A5744AlbRAju, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", GXutil.rtrim( A5806AlbREnt2));
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", GXutil.rtrim( A6178AlbrUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", GXutil.rtrim( A6182AlbrNF));
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", GXutil.rtrim( A6184AlbrCfop));
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", GXutil.rtrim( A3359AlbRDisCli));
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", GXutil.rtrim( A3360AlbRImp));
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", GXutil.rtrim( A6464AlbRTelar));
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( A6471AlbRUniB, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", GXutil.rtrim( A6488AlbDocPrv));
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( A6523AlbRUdas, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", GXutil.rtrim( A8023AlbColor));
      httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", GXutil.rtrim( A8024AlbOpsT));
      httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", GXutil.rtrim( A8025AlbOpsC));
      httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", GXutil.rtrim( A8026AlbOC));
      httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", GXutil.rtrim( A8027AlbHdri));
      httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", GXutil.rtrim( A8028AlbNumB));
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", GXutil.rtrim( A8029AlbNumM));
      httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrim( localUtil.ntoc( A8030AlbAncC, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrim( localUtil.ntoc( A8031AlbDndC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( A8032AlbAncCr, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( A8033AlbDndCr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrim( localUtil.ntoc( A8034AlbGalga, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", GXutil.rtrim( A8035AlbMaqTej));
      httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrim( localUtil.ntoc( A8036AlbDmt, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", GXutil.rtrim( A9793AlbPdaC));
      httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", GXutil.rtrim( A9794AlbOStj));
      httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.ltrim( localUtil.ntoc( A317AlbStLot, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.ltrim( localUtil.ntoc( A10358AlbTurno, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", GXutil.rtrim( A8723CliEst));
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.format(Z49AlbRFen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.format(Z48AlbRFecUlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5743AlbRPre", GXutil.ltrim( localUtil.ntoc( Z5743AlbRPre, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5744AlbRAju", GXutil.ltrim( localUtil.ntoc( Z5744AlbRAju, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5745AlbRRep", GXutil.ltrim( localUtil.ntoc( Z5745AlbRRep, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6178AlbrUsu", GXutil.rtrim( Z6178AlbrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6179AlbrHor", localUtil.ttoc( Z6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6183AlbrFeNf", localUtil.format(Z6183AlbrFeNf, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6184AlbrCfop", GXutil.rtrim( Z6184AlbrCfop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( Z6263AlbRTartC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3360AlbRImp", GXutil.rtrim( Z3360AlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6464AlbRTelar", GXutil.rtrim( Z6464AlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6465AlbRLu", GXutil.ltrim( localUtil.ntoc( Z6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6470AlbRTara", GXutil.ltrim( localUtil.ntoc( Z6470AlbRTara, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( Z6471AlbRUniB, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6488AlbDocPrv", GXutil.rtrim( Z6488AlbDocPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( Z6523AlbRUdas, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4792AlmCod", GXutil.ltrim( localUtil.ntoc( Z4792AlmCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8023AlbColor", GXutil.rtrim( Z8023AlbColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8024AlbOpsT", GXutil.rtrim( Z8024AlbOpsT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8025AlbOpsC", GXutil.rtrim( Z8025AlbOpsC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8026AlbOC", GXutil.rtrim( Z8026AlbOC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8027AlbHdri", GXutil.rtrim( Z8027AlbHdri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8028AlbNumB", GXutil.rtrim( Z8028AlbNumB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8030AlbAncC", GXutil.ltrim( localUtil.ntoc( Z8030AlbAncC, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8031AlbDndC", GXutil.ltrim( localUtil.ntoc( Z8031AlbDndC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( Z8032AlbAncCr, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( Z8033AlbDndCr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8034AlbGalga", GXutil.ltrim( localUtil.ntoc( Z8034AlbGalga, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8035AlbMaqTej", GXutil.rtrim( Z8035AlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8036AlbDmt", GXutil.ltrim( localUtil.ntoc( Z8036AlbDmt, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9793AlbPdaC", GXutil.rtrim( Z9793AlbPdaC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9794AlbOStj", GXutil.rtrim( Z9794AlbOStj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z317AlbStLot", GXutil.ltrim( localUtil.ntoc( Z317AlbStLot, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10358AlbTurno", GXutil.ltrim( localUtil.ntoc( Z10358AlbTurno, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8723CliEst", GXutil.rtrim( Z8723CliEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6264AlbRTartD", GXutil.rtrim( Z6264AlbRTartD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01HV23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A8723CliEst = T01HV23_A8723CliEst[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", GXutil.rtrim( A8723CliEst));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      /* Using cursor T01HV41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(39);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Tipentcod( )
   {
      n1211TipEntCod = false ;
      /* Using cursor T01HV42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(40) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(40);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      /* Using cursor T01HV43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(41);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albrtartc( )
   {
      n6263AlbRTartC = false ;
      n6264AlbRTartD = false ;
      /* Using cursor T01HV24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A6264AlbRTartD = T01HV24_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01HV24_n6264AlbRTartD[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
   }

   public void valid_Almcod( )
   {
      n4792AlmCod = false ;
      /* Using cursor T01HV44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(42);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A1301AlbRUlin',fld:'ALBRULIN',pic:'Z9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A4290AlbPmPPza',fld:'ALBPMPPZA',pic:'Z9.999'},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A4922AlbPml',fld:'ALBPML',pic:'ZZZ9'},{av:'A5743AlbRPre',fld:'ALBRPRE',pic:'ZZZZZ9.99'},{av:'A5744AlbRAju',fld:'ALBRAJU',pic:'ZZZZ9.99'},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''},{av:'A6178AlbrUsu',fld:'ALBRUSU',pic:''},{av:'A6179AlbrHor',fld:'ALBRHOR',pic:'99:99:99'},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'},{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'},{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'A6183AlbrFeNf',fld:'ALBRFENF',pic:''},{av:'A6184AlbrCfop',fld:'ALBRCFOP',pic:''},{av:'A3359AlbRDisCli',fld:'ALBRDISCLI',pic:''},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A3360AlbRImp',fld:'ALBRIMP',pic:'@!'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A6470AlbRTara',fld:'ALBRTARA',pic:'ZZ9.99'},{av:'A6471AlbRUniB',fld:'ALBRUNIB',pic:'ZZZZZ9.99'},{av:'A6488AlbDocPrv',fld:'ALBDOCPRV',pic:''},{av:'A6523AlbRUdas',fld:'ALBRUDAS',pic:'ZZZZZ9.99'},{av:'A4792AlmCod',fld:'ALMCOD',pic:'9'},{av:'A8023AlbColor',fld:'ALBCOLOR',pic:''},{av:'A8024AlbOpsT',fld:'ALBOPST',pic:''},{av:'A8025AlbOpsC',fld:'ALBOPSC',pic:''},{av:'A8026AlbOC',fld:'ALBOC',pic:''},{av:'A8027AlbHdri',fld:'ALBHDRI',pic:''},{av:'A8028AlbNumB',fld:'ALBNUMB',pic:''},{av:'A8029AlbNumM',fld:'ALBNUMM',pic:''},{av:'A8030AlbAncC',fld:'ALBANCC',pic:'Z9.99'},{av:'A8031AlbDndC',fld:'ALBDNDC',pic:'ZZZ9'},{av:'A8032AlbAncCr',fld:'ALBANCCR',pic:'Z9.99'},{av:'A8033AlbDndCr',fld:'ALBDNDCR',pic:'ZZZ9'},{av:'A8034AlbGalga',fld:'ALBGALGA',pic:'ZZ9'},{av:'A8035AlbMaqTej',fld:'ALBMAQTEJ',pic:''},{av:'A8036AlbDmt',fld:'ALBDMT',pic:'ZZ9'},{av:'A9793AlbPdaC',fld:'ALBPDAC',pic:''},{av:'A9794AlbOStj',fld:'ALBOSTJ',pic:''},{av:'A317AlbStLot',fld:'ALBSTLOT',pic:'9'},{av:'A10358AlbTurno',fld:'ALBTURNO',pic:'9'},{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z252CliCod'},{av:'Z45AlbRef'},{av:'Z840TrnCod'},{av:'Z46AlbREnt'},{av:'Z52AlbRPieEnt'},{av:'Z56AlbRUni'},{av:'Z50AlbRLoc'},{av:'Z49AlbRFen'},{av:'Z58AlbRUniEnt'},{av:'Z55AlbRReo'},{av:'Z54AlbRPieUti'},{av:'Z53AlbRPieReb'},{av:'Z60AlbRUniUti'},{av:'Z59AlbRUniReb'},{av:'Z48AlbRFecUlt'},{av:'Z47AlbREst'},{av:'Z1211TipEntCod'},{av:'Z1222AlbNumEti'},{av:'Z1291AlbRDes'},{av:'Z970ProceCod'},{av:'Z1301AlbRUlin'},{av:'Z3613AlbRefDsc'},{av:'Z4290AlbPmPPza'},{av:'Z4920AlbRGrm2'},{av:'Z4921AlbRAnc'},{av:'Z4922AlbPml'},{av:'Z5743AlbRPre'},{av:'Z5744AlbRAju'},{av:'Z5745AlbRRep'},{av:'Z5806AlbREnt2'},{av:'Z6178AlbrUsu'},{av:'Z6179AlbrHor'},{av:'Z6180AlbrUniC'},{av:'Z6181AlbrPieC'},{av:'Z6182AlbrNF'},{av:'Z6183AlbrFeNf'},{av:'Z6184AlbrCfop'},{av:'Z3359AlbRDisCli'},{av:'Z6263AlbRTartC'},{av:'Z3360AlbRImp'},{av:'Z6463AlbRLote'},{av:'Z6464AlbRTelar'},{av:'Z6465AlbRLu'},{av:'Z4602AlbRMdlCod'},{av:'Z6470AlbRTara'},{av:'Z6471AlbRUniB'},{av:'Z6488AlbDocPrv'},{av:'Z6523AlbRUdas'},{av:'Z4792AlmCod'},{av:'Z8023AlbColor'},{av:'Z8024AlbOpsT'},{av:'Z8025AlbOpsC'},{av:'Z8026AlbOC'},{av:'Z8027AlbHdri'},{av:'Z8028AlbNumB'},{av:'Z8029AlbNumM'},{av:'Z8030AlbAncC'},{av:'Z8031AlbDndC'},{av:'Z8032AlbAncCr'},{av:'Z8033AlbDndCr'},{av:'Z8034AlbGalga'},{av:'Z8035AlbMaqTej'},{av:'Z8036AlbDmt'},{av:'Z9793AlbPdaC'},{av:'Z9794AlbOStj'},{av:'Z317AlbStLot'},{av:'Z10358AlbTurno'},{av:'Z8723CliEst'},{av:'Z6264AlbRTartD'},{av:'Z51AlbRPieDis'},{av:'Z57AlbRUniDis'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRREO",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRTARTC","{handler:'valid_Albrtartc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRTARTC",",oparms:[{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRIMP","{handler:'valid_Albrimp',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRIMP",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALMCOD","{handler:'valid_Almcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4792AlmCod',fld:'ALMCOD',pic:'9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALMCOD",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
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
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(39);
      pr_default.close(41);
      pr_default.close(40);
      pr_default.close(42);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z55AlbRReo = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1291AlbRDes = "" ;
      Z3613AlbRefDsc = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z5806AlbREnt2 = "" ;
      Z6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8028AlbNumB = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z8035AlbMaqTej = "" ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A45AlbRef = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A46AlbREnt = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A50AlbRLoc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A1291AlbRDes = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A3613AlbRefDsc = "" ;
      lblTextblock27_Jsonclick = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A5743AlbRPre = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A5744AlbRAju = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A5806AlbREnt2 = "" ;
      lblTextblock34_Jsonclick = "" ;
      A6178AlbrUsu = "" ;
      lblTextblock35_Jsonclick = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock36_Jsonclick = "" ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      A6182AlbrNF = "" ;
      lblTextblock39_Jsonclick = "" ;
      A6183AlbrFeNf = GXutil.nullDate() ;
      lblTextblock40_Jsonclick = "" ;
      A6184AlbrCfop = "" ;
      lblTextblock41_Jsonclick = "" ;
      A3359AlbRDisCli = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      A6264AlbRTartD = "" ;
      lblTextblock44_Jsonclick = "" ;
      A3360AlbRImp = "" ;
      lblTextblock45_Jsonclick = "" ;
      A6463AlbRLote = "" ;
      lblTextblock46_Jsonclick = "" ;
      A6464AlbRTelar = "" ;
      lblTextblock47_Jsonclick = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      lblTextblock48_Jsonclick = "" ;
      A4602AlbRMdlCod = "" ;
      lblTextblock49_Jsonclick = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      lblTextblock50_Jsonclick = "" ;
      A6471AlbRUniB = DecimalUtil.ZERO ;
      lblTextblock51_Jsonclick = "" ;
      A6488AlbDocPrv = "" ;
      lblTextblock52_Jsonclick = "" ;
      A6523AlbRUdas = DecimalUtil.ZERO ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      A8023AlbColor = "" ;
      lblTextblock55_Jsonclick = "" ;
      A8024AlbOpsT = "" ;
      lblTextblock56_Jsonclick = "" ;
      A8025AlbOpsC = "" ;
      lblTextblock57_Jsonclick = "" ;
      A8026AlbOC = "" ;
      lblTextblock58_Jsonclick = "" ;
      A8027AlbHdri = "" ;
      lblTextblock59_Jsonclick = "" ;
      A8028AlbNumB = "" ;
      lblTextblock60_Jsonclick = "" ;
      A8029AlbNumM = "" ;
      lblTextblock61_Jsonclick = "" ;
      A8030AlbAncC = DecimalUtil.ZERO ;
      lblTextblock62_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      A8032AlbAncCr = DecimalUtil.ZERO ;
      lblTextblock64_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      A8035AlbMaqTej = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      A9793AlbPdaC = "" ;
      lblTextblock69_Jsonclick = "" ;
      A9794AlbOStj = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      A8723CliEst = "" ;
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
      Z8723CliEst = "" ;
      Z6264AlbRTartD = "" ;
      T01HV10_A44AlbRecCod = new int[1] ;
      T01HV10_n44AlbRecCod = new boolean[] {false} ;
      T01HV10_A45AlbRef = new String[] {""} ;
      T01HV10_A46AlbREnt = new String[] {""} ;
      T01HV10_A52AlbRPieEnt = new int[1] ;
      T01HV10_A56AlbRUni = new String[] {""} ;
      T01HV10_A50AlbRLoc = new String[] {""} ;
      T01HV10_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV10_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A55AlbRReo = new String[] {""} ;
      T01HV10_A54AlbRPieUti = new int[1] ;
      T01HV10_A53AlbRPieReb = new int[1] ;
      T01HV10_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV10_A47AlbREst = new byte[1] ;
      T01HV10_A1222AlbNumEti = new short[1] ;
      T01HV10_A1291AlbRDes = new String[] {""} ;
      T01HV10_A1301AlbRUlin = new byte[1] ;
      T01HV10_A3613AlbRefDsc = new String[] {""} ;
      T01HV10_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A4920AlbRGrm2 = new short[1] ;
      T01HV10_A4921AlbRAnc = new short[1] ;
      T01HV10_A4922AlbPml = new short[1] ;
      T01HV10_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A5745AlbRRep = new byte[1] ;
      T01HV10_A5806AlbREnt2 = new String[] {""} ;
      T01HV10_A6178AlbrUsu = new String[] {""} ;
      T01HV10_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV10_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A6181AlbrPieC = new int[1] ;
      T01HV10_A6182AlbrNF = new String[] {""} ;
      T01HV10_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV10_A6184AlbrCfop = new String[] {""} ;
      T01HV10_A3359AlbRDisCli = new String[] {""} ;
      T01HV10_A6264AlbRTartD = new String[] {""} ;
      T01HV10_n6264AlbRTartD = new boolean[] {false} ;
      T01HV10_A3360AlbRImp = new String[] {""} ;
      T01HV10_A6463AlbRLote = new String[] {""} ;
      T01HV10_A6464AlbRTelar = new String[] {""} ;
      T01HV10_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A4602AlbRMdlCod = new String[] {""} ;
      T01HV10_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A6488AlbDocPrv = new String[] {""} ;
      T01HV10_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A8023AlbColor = new String[] {""} ;
      T01HV10_A8024AlbOpsT = new String[] {""} ;
      T01HV10_A8025AlbOpsC = new String[] {""} ;
      T01HV10_A8026AlbOC = new String[] {""} ;
      T01HV10_A8027AlbHdri = new String[] {""} ;
      T01HV10_A8028AlbNumB = new String[] {""} ;
      T01HV10_A8029AlbNumM = new String[] {""} ;
      T01HV10_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A8031AlbDndC = new short[1] ;
      T01HV10_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV10_A8033AlbDndCr = new short[1] ;
      T01HV10_A8034AlbGalga = new short[1] ;
      T01HV10_A8035AlbMaqTej = new String[] {""} ;
      T01HV10_A8036AlbDmt = new short[1] ;
      T01HV10_A9793AlbPdaC = new String[] {""} ;
      T01HV10_A9794AlbOStj = new String[] {""} ;
      T01HV10_A317AlbStLot = new byte[1] ;
      T01HV10_A10358AlbTurno = new byte[1] ;
      T01HV10_A8723CliEst = new String[] {""} ;
      T01HV10_A396EmprCod = new String[] {""} ;
      T01HV10_A252CliCod = new int[1] ;
      T01HV10_A6263AlbRTartC = new short[1] ;
      T01HV10_n6263AlbRTartC = new boolean[] {false} ;
      T01HV10_A840TrnCod = new short[1] ;
      T01HV10_n840TrnCod = new boolean[] {false} ;
      T01HV10_A970ProceCod = new short[1] ;
      T01HV10_n970ProceCod = new boolean[] {false} ;
      T01HV10_A1211TipEntCod = new short[1] ;
      T01HV10_n1211TipEntCod = new boolean[] {false} ;
      T01HV10_A4792AlmCod = new byte[1] ;
      T01HV10_n4792AlmCod = new boolean[] {false} ;
      T01HV4_A8723CliEst = new String[] {""} ;
      T01HV5_A6264AlbRTartD = new String[] {""} ;
      T01HV5_n6264AlbRTartD = new boolean[] {false} ;
      T01HV6_A396EmprCod = new String[] {""} ;
      T01HV7_A396EmprCod = new String[] {""} ;
      T01HV8_A396EmprCod = new String[] {""} ;
      T01HV9_A396EmprCod = new String[] {""} ;
      T01HV11_A8723CliEst = new String[] {""} ;
      T01HV12_A6264AlbRTartD = new String[] {""} ;
      T01HV12_n6264AlbRTartD = new boolean[] {false} ;
      T01HV13_A396EmprCod = new String[] {""} ;
      T01HV14_A396EmprCod = new String[] {""} ;
      T01HV15_A396EmprCod = new String[] {""} ;
      T01HV16_A396EmprCod = new String[] {""} ;
      T01HV17_A396EmprCod = new String[] {""} ;
      T01HV17_A44AlbRecCod = new int[1] ;
      T01HV17_n44AlbRecCod = new boolean[] {false} ;
      T01HV3_A44AlbRecCod = new int[1] ;
      T01HV3_n44AlbRecCod = new boolean[] {false} ;
      T01HV3_A45AlbRef = new String[] {""} ;
      T01HV3_A46AlbREnt = new String[] {""} ;
      T01HV3_A52AlbRPieEnt = new int[1] ;
      T01HV3_A56AlbRUni = new String[] {""} ;
      T01HV3_A50AlbRLoc = new String[] {""} ;
      T01HV3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A55AlbRReo = new String[] {""} ;
      T01HV3_A54AlbRPieUti = new int[1] ;
      T01HV3_A53AlbRPieReb = new int[1] ;
      T01HV3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV3_A47AlbREst = new byte[1] ;
      T01HV3_A1222AlbNumEti = new short[1] ;
      T01HV3_A1291AlbRDes = new String[] {""} ;
      T01HV3_A1301AlbRUlin = new byte[1] ;
      T01HV3_A3613AlbRefDsc = new String[] {""} ;
      T01HV3_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A4920AlbRGrm2 = new short[1] ;
      T01HV3_A4921AlbRAnc = new short[1] ;
      T01HV3_A4922AlbPml = new short[1] ;
      T01HV3_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A5745AlbRRep = new byte[1] ;
      T01HV3_A5806AlbREnt2 = new String[] {""} ;
      T01HV3_A6178AlbrUsu = new String[] {""} ;
      T01HV3_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV3_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A6181AlbrPieC = new int[1] ;
      T01HV3_A6182AlbrNF = new String[] {""} ;
      T01HV3_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV3_A6184AlbrCfop = new String[] {""} ;
      T01HV3_A3359AlbRDisCli = new String[] {""} ;
      T01HV3_A3360AlbRImp = new String[] {""} ;
      T01HV3_A6463AlbRLote = new String[] {""} ;
      T01HV3_A6464AlbRTelar = new String[] {""} ;
      T01HV3_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A4602AlbRMdlCod = new String[] {""} ;
      T01HV3_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A6488AlbDocPrv = new String[] {""} ;
      T01HV3_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A8023AlbColor = new String[] {""} ;
      T01HV3_A8024AlbOpsT = new String[] {""} ;
      T01HV3_A8025AlbOpsC = new String[] {""} ;
      T01HV3_A8026AlbOC = new String[] {""} ;
      T01HV3_A8027AlbHdri = new String[] {""} ;
      T01HV3_A8028AlbNumB = new String[] {""} ;
      T01HV3_A8029AlbNumM = new String[] {""} ;
      T01HV3_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A8031AlbDndC = new short[1] ;
      T01HV3_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV3_A8033AlbDndCr = new short[1] ;
      T01HV3_A8034AlbGalga = new short[1] ;
      T01HV3_A8035AlbMaqTej = new String[] {""} ;
      T01HV3_A8036AlbDmt = new short[1] ;
      T01HV3_A9793AlbPdaC = new String[] {""} ;
      T01HV3_A9794AlbOStj = new String[] {""} ;
      T01HV3_A317AlbStLot = new byte[1] ;
      T01HV3_A10358AlbTurno = new byte[1] ;
      T01HV3_A396EmprCod = new String[] {""} ;
      T01HV3_A252CliCod = new int[1] ;
      T01HV3_A6263AlbRTartC = new short[1] ;
      T01HV3_n6263AlbRTartC = new boolean[] {false} ;
      T01HV3_A840TrnCod = new short[1] ;
      T01HV3_n840TrnCod = new boolean[] {false} ;
      T01HV3_A970ProceCod = new short[1] ;
      T01HV3_n970ProceCod = new boolean[] {false} ;
      T01HV3_A1211TipEntCod = new short[1] ;
      T01HV3_n1211TipEntCod = new boolean[] {false} ;
      T01HV3_A4792AlmCod = new byte[1] ;
      T01HV3_n4792AlmCod = new boolean[] {false} ;
      sMode7 = "" ;
      T01HV18_A396EmprCod = new String[] {""} ;
      T01HV18_A44AlbRecCod = new int[1] ;
      T01HV18_n44AlbRecCod = new boolean[] {false} ;
      T01HV19_A396EmprCod = new String[] {""} ;
      T01HV19_A44AlbRecCod = new int[1] ;
      T01HV19_n44AlbRecCod = new boolean[] {false} ;
      T01HV2_A44AlbRecCod = new int[1] ;
      T01HV2_n44AlbRecCod = new boolean[] {false} ;
      T01HV2_A45AlbRef = new String[] {""} ;
      T01HV2_A46AlbREnt = new String[] {""} ;
      T01HV2_A52AlbRPieEnt = new int[1] ;
      T01HV2_A56AlbRUni = new String[] {""} ;
      T01HV2_A50AlbRLoc = new String[] {""} ;
      T01HV2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A55AlbRReo = new String[] {""} ;
      T01HV2_A54AlbRPieUti = new int[1] ;
      T01HV2_A53AlbRPieReb = new int[1] ;
      T01HV2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV2_A47AlbREst = new byte[1] ;
      T01HV2_A1222AlbNumEti = new short[1] ;
      T01HV2_A1291AlbRDes = new String[] {""} ;
      T01HV2_A1301AlbRUlin = new byte[1] ;
      T01HV2_A3613AlbRefDsc = new String[] {""} ;
      T01HV2_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A4920AlbRGrm2 = new short[1] ;
      T01HV2_A4921AlbRAnc = new short[1] ;
      T01HV2_A4922AlbPml = new short[1] ;
      T01HV2_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A5745AlbRRep = new byte[1] ;
      T01HV2_A5806AlbREnt2 = new String[] {""} ;
      T01HV2_A6178AlbrUsu = new String[] {""} ;
      T01HV2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV2_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A6181AlbrPieC = new int[1] ;
      T01HV2_A6182AlbrNF = new String[] {""} ;
      T01HV2_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01HV2_A6184AlbrCfop = new String[] {""} ;
      T01HV2_A3359AlbRDisCli = new String[] {""} ;
      T01HV2_A3360AlbRImp = new String[] {""} ;
      T01HV2_A6463AlbRLote = new String[] {""} ;
      T01HV2_A6464AlbRTelar = new String[] {""} ;
      T01HV2_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A4602AlbRMdlCod = new String[] {""} ;
      T01HV2_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A6488AlbDocPrv = new String[] {""} ;
      T01HV2_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A8023AlbColor = new String[] {""} ;
      T01HV2_A8024AlbOpsT = new String[] {""} ;
      T01HV2_A8025AlbOpsC = new String[] {""} ;
      T01HV2_A8026AlbOC = new String[] {""} ;
      T01HV2_A8027AlbHdri = new String[] {""} ;
      T01HV2_A8028AlbNumB = new String[] {""} ;
      T01HV2_A8029AlbNumM = new String[] {""} ;
      T01HV2_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A8031AlbDndC = new short[1] ;
      T01HV2_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HV2_A8033AlbDndCr = new short[1] ;
      T01HV2_A8034AlbGalga = new short[1] ;
      T01HV2_A8035AlbMaqTej = new String[] {""} ;
      T01HV2_A8036AlbDmt = new short[1] ;
      T01HV2_A9793AlbPdaC = new String[] {""} ;
      T01HV2_A9794AlbOStj = new String[] {""} ;
      T01HV2_A317AlbStLot = new byte[1] ;
      T01HV2_A10358AlbTurno = new byte[1] ;
      T01HV2_A396EmprCod = new String[] {""} ;
      T01HV2_A252CliCod = new int[1] ;
      T01HV2_A6263AlbRTartC = new short[1] ;
      T01HV2_n6263AlbRTartC = new boolean[] {false} ;
      T01HV2_A840TrnCod = new short[1] ;
      T01HV2_n840TrnCod = new boolean[] {false} ;
      T01HV2_A970ProceCod = new short[1] ;
      T01HV2_n970ProceCod = new boolean[] {false} ;
      T01HV2_A1211TipEntCod = new short[1] ;
      T01HV2_n1211TipEntCod = new boolean[] {false} ;
      T01HV2_A4792AlmCod = new byte[1] ;
      T01HV2_n4792AlmCod = new boolean[] {false} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      T01HV23_A8723CliEst = new String[] {""} ;
      T01HV24_A6264AlbRTartD = new String[] {""} ;
      T01HV24_n6264AlbRTartD = new boolean[] {false} ;
      T01HV25_A396EmprCod = new String[] {""} ;
      T01HV25_A13026PedDGId = new int[1] ;
      T01HV25_A44AlbRecCod = new int[1] ;
      T01HV25_n44AlbRecCod = new boolean[] {false} ;
      T01HV26_A396EmprCod = new String[] {""} ;
      T01HV26_A11669DevCruId = new int[1] ;
      T01HV26_A44AlbRecCod = new int[1] ;
      T01HV26_n44AlbRecCod = new boolean[] {false} ;
      T01HV27_A396EmprCod = new String[] {""} ;
      T01HV27_A44AlbRecCod = new int[1] ;
      T01HV27_n44AlbRecCod = new boolean[] {false} ;
      T01HV27_A9743Emp_CUb = new String[] {""} ;
      T01HV27_A5860Emp_Anp = new short[1] ;
      T01HV28_A396EmprCod = new String[] {""} ;
      T01HV28_A44AlbRecCod = new int[1] ;
      T01HV28_n44AlbRecCod = new boolean[] {false} ;
      T01HV28_A7130MatC_Pz = new String[] {""} ;
      T01HV29_A396EmprCod = new String[] {""} ;
      T01HV29_A44AlbRecCod = new int[1] ;
      T01HV29_n44AlbRecCod = new boolean[] {false} ;
      T01HV29_A7132MatC_Talla = new String[] {""} ;
      T01HV30_A396EmprCod = new String[] {""} ;
      T01HV30_A44AlbRecCod = new int[1] ;
      T01HV30_n44AlbRecCod = new boolean[] {false} ;
      T01HV30_A7115MatC_Lin = new short[1] ;
      T01HV31_A396EmprCod = new String[] {""} ;
      T01HV31_A30AlbProCod = new long[1] ;
      T01HV31_A129BarCod = new int[1] ;
      T01HV31_A132BarCodReo = new byte[1] ;
      T01HV31_A130BarCodPar = new String[] {""} ;
      T01HV31_A6622AlbHdRLn = new short[1] ;
      T01HV32_A396EmprCod = new String[] {""} ;
      T01HV32_A6235DevEmpCod = new int[1] ;
      T01HV32_A6243DevNumLin = new byte[1] ;
      T01HV33_A396EmprCod = new String[] {""} ;
      T01HV33_A44AlbRecCod = new int[1] ;
      T01HV33_n44AlbRecCod = new boolean[] {false} ;
      T01HV33_A4596AlbRDefCod = new short[1] ;
      T01HV34_A396EmprCod = new String[] {""} ;
      T01HV34_A44AlbRecCod = new int[1] ;
      T01HV34_n44AlbRecCod = new boolean[] {false} ;
      T01HV34_A2159AlbRecPie = new String[] {""} ;
      T01HV35_A396EmprCod = new String[] {""} ;
      T01HV35_A44AlbRecCod = new int[1] ;
      T01HV35_n44AlbRecCod = new boolean[] {false} ;
      T01HV35_A2165HisEmpLin = new short[1] ;
      T01HV36_A396EmprCod = new String[] {""} ;
      T01HV36_A44AlbRecCod = new int[1] ;
      T01HV36_n44AlbRecCod = new boolean[] {false} ;
      T01HV36_A1299AlbRLin = new byte[1] ;
      T01HV37_A396EmprCod = new String[] {""} ;
      T01HV37_A361DisCod = new int[1] ;
      T01HV37_A44AlbRecCod = new int[1] ;
      T01HV37_n44AlbRecCod = new boolean[] {false} ;
      T01HV38_A396EmprCod = new String[] {""} ;
      T01HV38_A323DevGenCod = new int[1] ;
      T01HV39_A396EmprCod = new String[] {""} ;
      T01HV39_A129BarCod = new int[1] ;
      T01HV39_A132BarCodReo = new byte[1] ;
      T01HV39_A130BarCodPar = new String[] {""} ;
      T01HV39_A200BarPieCod = new String[] {""} ;
      T01HV40_A396EmprCod = new String[] {""} ;
      T01HV40_A44AlbRecCod = new int[1] ;
      T01HV40_n44AlbRecCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ45AlbRef = "" ;
      ZZ46AlbREnt = "" ;
      ZZ56AlbRUni = "" ;
      ZZ50AlbRLoc = "" ;
      ZZ49AlbRFen = GXutil.nullDate() ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ55AlbRReo = "" ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ59AlbRUniReb = DecimalUtil.ZERO ;
      ZZ48AlbRFecUlt = GXutil.nullDate() ;
      ZZ1291AlbRDes = "" ;
      ZZ3613AlbRefDsc = "" ;
      ZZ4290AlbPmPPza = DecimalUtil.ZERO ;
      ZZ5743AlbRPre = DecimalUtil.ZERO ;
      ZZ5744AlbRAju = DecimalUtil.ZERO ;
      ZZ5806AlbREnt2 = "" ;
      ZZ6178AlbrUsu = "" ;
      ZZ6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      ZZ6180AlbrUniC = DecimalUtil.ZERO ;
      ZZ6182AlbrNF = "" ;
      ZZ6183AlbrFeNf = GXutil.nullDate() ;
      ZZ6184AlbrCfop = "" ;
      ZZ3359AlbRDisCli = "" ;
      ZZ3360AlbRImp = "" ;
      ZZ6463AlbRLote = "" ;
      ZZ6464AlbRTelar = "" ;
      ZZ6465AlbRLu = DecimalUtil.ZERO ;
      ZZ4602AlbRMdlCod = "" ;
      ZZ6470AlbRTara = DecimalUtil.ZERO ;
      ZZ6471AlbRUniB = DecimalUtil.ZERO ;
      ZZ6488AlbDocPrv = "" ;
      ZZ6523AlbRUdas = DecimalUtil.ZERO ;
      ZZ8023AlbColor = "" ;
      ZZ8024AlbOpsT = "" ;
      ZZ8025AlbOpsC = "" ;
      ZZ8026AlbOC = "" ;
      ZZ8027AlbHdri = "" ;
      ZZ8028AlbNumB = "" ;
      ZZ8029AlbNumM = "" ;
      ZZ8030AlbAncC = DecimalUtil.ZERO ;
      ZZ8032AlbAncCr = DecimalUtil.ZERO ;
      ZZ8035AlbMaqTej = "" ;
      ZZ9793AlbPdaC = "" ;
      ZZ9794AlbOStj = "" ;
      ZZ8723CliEst = "" ;
      ZZ6264AlbRTartD = "" ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      T01HV41_A396EmprCod = new String[] {""} ;
      T01HV42_A396EmprCod = new String[] {""} ;
      T01HV43_A396EmprCod = new String[] {""} ;
      T01HV44_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttralbrec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttralbrec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttralbrec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttralbrec__default(),
         new Object[] {
             new Object[] {
            T01HV2_A44AlbRecCod, T01HV2_A45AlbRef, T01HV2_A46AlbREnt, T01HV2_A52AlbRPieEnt, T01HV2_A56AlbRUni, T01HV2_A50AlbRLoc, T01HV2_A49AlbRFen, T01HV2_A58AlbRUniEnt, T01HV2_A55AlbRReo, T01HV2_A54AlbRPieUti,
            T01HV2_A53AlbRPieReb, T01HV2_A60AlbRUniUti, T01HV2_A59AlbRUniReb, T01HV2_A48AlbRFecUlt, T01HV2_A47AlbREst, T01HV2_A1222AlbNumEti, T01HV2_A1291AlbRDes, T01HV2_A1301AlbRUlin, T01HV2_A3613AlbRefDsc, T01HV2_A4290AlbPmPPza,
            T01HV2_A4920AlbRGrm2, T01HV2_A4921AlbRAnc, T01HV2_A4922AlbPml, T01HV2_A5743AlbRPre, T01HV2_A5744AlbRAju, T01HV2_A5745AlbRRep, T01HV2_A5806AlbREnt2, T01HV2_A6178AlbrUsu, T01HV2_A6179AlbrHor, T01HV2_A6180AlbrUniC,
            T01HV2_A6181AlbrPieC, T01HV2_A6182AlbrNF, T01HV2_A6183AlbrFeNf, T01HV2_A6184AlbrCfop, T01HV2_A3359AlbRDisCli, T01HV2_A3360AlbRImp, T01HV2_A6463AlbRLote, T01HV2_A6464AlbRTelar, T01HV2_A6465AlbRLu, T01HV2_A4602AlbRMdlCod,
            T01HV2_A6470AlbRTara, T01HV2_A6471AlbRUniB, T01HV2_A6488AlbDocPrv, T01HV2_A6523AlbRUdas, T01HV2_A8023AlbColor, T01HV2_A8024AlbOpsT, T01HV2_A8025AlbOpsC, T01HV2_A8026AlbOC, T01HV2_A8027AlbHdri, T01HV2_A8028AlbNumB,
            T01HV2_A8029AlbNumM, T01HV2_A8030AlbAncC, T01HV2_A8031AlbDndC, T01HV2_A8032AlbAncCr, T01HV2_A8033AlbDndCr, T01HV2_A8034AlbGalga, T01HV2_A8035AlbMaqTej, T01HV2_A8036AlbDmt, T01HV2_A9793AlbPdaC, T01HV2_A9794AlbOStj,
            T01HV2_A317AlbStLot, T01HV2_A10358AlbTurno, T01HV2_A396EmprCod, T01HV2_A252CliCod, T01HV2_A6263AlbRTartC, T01HV2_n6263AlbRTartC, T01HV2_A840TrnCod, T01HV2_n840TrnCod, T01HV2_A970ProceCod, T01HV2_n970ProceCod,
            T01HV2_A1211TipEntCod, T01HV2_n1211TipEntCod, T01HV2_A4792AlmCod, T01HV2_n4792AlmCod
            }
            , new Object[] {
            T01HV3_A44AlbRecCod, T01HV3_A45AlbRef, T01HV3_A46AlbREnt, T01HV3_A52AlbRPieEnt, T01HV3_A56AlbRUni, T01HV3_A50AlbRLoc, T01HV3_A49AlbRFen, T01HV3_A58AlbRUniEnt, T01HV3_A55AlbRReo, T01HV3_A54AlbRPieUti,
            T01HV3_A53AlbRPieReb, T01HV3_A60AlbRUniUti, T01HV3_A59AlbRUniReb, T01HV3_A48AlbRFecUlt, T01HV3_A47AlbREst, T01HV3_A1222AlbNumEti, T01HV3_A1291AlbRDes, T01HV3_A1301AlbRUlin, T01HV3_A3613AlbRefDsc, T01HV3_A4290AlbPmPPza,
            T01HV3_A4920AlbRGrm2, T01HV3_A4921AlbRAnc, T01HV3_A4922AlbPml, T01HV3_A5743AlbRPre, T01HV3_A5744AlbRAju, T01HV3_A5745AlbRRep, T01HV3_A5806AlbREnt2, T01HV3_A6178AlbrUsu, T01HV3_A6179AlbrHor, T01HV3_A6180AlbrUniC,
            T01HV3_A6181AlbrPieC, T01HV3_A6182AlbrNF, T01HV3_A6183AlbrFeNf, T01HV3_A6184AlbrCfop, T01HV3_A3359AlbRDisCli, T01HV3_A3360AlbRImp, T01HV3_A6463AlbRLote, T01HV3_A6464AlbRTelar, T01HV3_A6465AlbRLu, T01HV3_A4602AlbRMdlCod,
            T01HV3_A6470AlbRTara, T01HV3_A6471AlbRUniB, T01HV3_A6488AlbDocPrv, T01HV3_A6523AlbRUdas, T01HV3_A8023AlbColor, T01HV3_A8024AlbOpsT, T01HV3_A8025AlbOpsC, T01HV3_A8026AlbOC, T01HV3_A8027AlbHdri, T01HV3_A8028AlbNumB,
            T01HV3_A8029AlbNumM, T01HV3_A8030AlbAncC, T01HV3_A8031AlbDndC, T01HV3_A8032AlbAncCr, T01HV3_A8033AlbDndCr, T01HV3_A8034AlbGalga, T01HV3_A8035AlbMaqTej, T01HV3_A8036AlbDmt, T01HV3_A9793AlbPdaC, T01HV3_A9794AlbOStj,
            T01HV3_A317AlbStLot, T01HV3_A10358AlbTurno, T01HV3_A396EmprCod, T01HV3_A252CliCod, T01HV3_A6263AlbRTartC, T01HV3_n6263AlbRTartC, T01HV3_A840TrnCod, T01HV3_n840TrnCod, T01HV3_A970ProceCod, T01HV3_n970ProceCod,
            T01HV3_A1211TipEntCod, T01HV3_n1211TipEntCod, T01HV3_A4792AlmCod, T01HV3_n4792AlmCod
            }
            , new Object[] {
            T01HV4_A8723CliEst
            }
            , new Object[] {
            T01HV5_A6264AlbRTartD, T01HV5_n6264AlbRTartD
            }
            , new Object[] {
            T01HV6_A396EmprCod
            }
            , new Object[] {
            T01HV7_A396EmprCod
            }
            , new Object[] {
            T01HV8_A396EmprCod
            }
            , new Object[] {
            T01HV9_A396EmprCod
            }
            , new Object[] {
            T01HV10_A44AlbRecCod, T01HV10_A45AlbRef, T01HV10_A46AlbREnt, T01HV10_A52AlbRPieEnt, T01HV10_A56AlbRUni, T01HV10_A50AlbRLoc, T01HV10_A49AlbRFen, T01HV10_A58AlbRUniEnt, T01HV10_A55AlbRReo, T01HV10_A54AlbRPieUti,
            T01HV10_A53AlbRPieReb, T01HV10_A60AlbRUniUti, T01HV10_A59AlbRUniReb, T01HV10_A48AlbRFecUlt, T01HV10_A47AlbREst, T01HV10_A1222AlbNumEti, T01HV10_A1291AlbRDes, T01HV10_A1301AlbRUlin, T01HV10_A3613AlbRefDsc, T01HV10_A4290AlbPmPPza,
            T01HV10_A4920AlbRGrm2, T01HV10_A4921AlbRAnc, T01HV10_A4922AlbPml, T01HV10_A5743AlbRPre, T01HV10_A5744AlbRAju, T01HV10_A5745AlbRRep, T01HV10_A5806AlbREnt2, T01HV10_A6178AlbrUsu, T01HV10_A6179AlbrHor, T01HV10_A6180AlbrUniC,
            T01HV10_A6181AlbrPieC, T01HV10_A6182AlbrNF, T01HV10_A6183AlbrFeNf, T01HV10_A6184AlbrCfop, T01HV10_A3359AlbRDisCli, T01HV10_A6264AlbRTartD, T01HV10_n6264AlbRTartD, T01HV10_A3360AlbRImp, T01HV10_A6463AlbRLote, T01HV10_A6464AlbRTelar,
            T01HV10_A6465AlbRLu, T01HV10_A4602AlbRMdlCod, T01HV10_A6470AlbRTara, T01HV10_A6471AlbRUniB, T01HV10_A6488AlbDocPrv, T01HV10_A6523AlbRUdas, T01HV10_A8023AlbColor, T01HV10_A8024AlbOpsT, T01HV10_A8025AlbOpsC, T01HV10_A8026AlbOC,
            T01HV10_A8027AlbHdri, T01HV10_A8028AlbNumB, T01HV10_A8029AlbNumM, T01HV10_A8030AlbAncC, T01HV10_A8031AlbDndC, T01HV10_A8032AlbAncCr, T01HV10_A8033AlbDndCr, T01HV10_A8034AlbGalga, T01HV10_A8035AlbMaqTej, T01HV10_A8036AlbDmt,
            T01HV10_A9793AlbPdaC, T01HV10_A9794AlbOStj, T01HV10_A317AlbStLot, T01HV10_A10358AlbTurno, T01HV10_A8723CliEst, T01HV10_A396EmprCod, T01HV10_A252CliCod, T01HV10_A6263AlbRTartC, T01HV10_n6263AlbRTartC, T01HV10_A840TrnCod,
            T01HV10_n840TrnCod, T01HV10_A970ProceCod, T01HV10_n970ProceCod, T01HV10_A1211TipEntCod, T01HV10_n1211TipEntCod, T01HV10_A4792AlmCod, T01HV10_n4792AlmCod
            }
            , new Object[] {
            T01HV11_A8723CliEst
            }
            , new Object[] {
            T01HV12_A6264AlbRTartD, T01HV12_n6264AlbRTartD
            }
            , new Object[] {
            T01HV13_A396EmprCod
            }
            , new Object[] {
            T01HV14_A396EmprCod
            }
            , new Object[] {
            T01HV15_A396EmprCod
            }
            , new Object[] {
            T01HV16_A396EmprCod
            }
            , new Object[] {
            T01HV17_A396EmprCod, T01HV17_A44AlbRecCod
            }
            , new Object[] {
            T01HV18_A396EmprCod, T01HV18_A44AlbRecCod
            }
            , new Object[] {
            T01HV19_A396EmprCod, T01HV19_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HV23_A8723CliEst
            }
            , new Object[] {
            T01HV24_A6264AlbRTartD, T01HV24_n6264AlbRTartD
            }
            , new Object[] {
            T01HV25_A396EmprCod, T01HV25_A13026PedDGId, T01HV25_A44AlbRecCod
            }
            , new Object[] {
            T01HV26_A396EmprCod, T01HV26_A11669DevCruId, T01HV26_A44AlbRecCod
            }
            , new Object[] {
            T01HV27_A396EmprCod, T01HV27_A44AlbRecCod, T01HV27_A9743Emp_CUb, T01HV27_A5860Emp_Anp
            }
            , new Object[] {
            T01HV28_A396EmprCod, T01HV28_A44AlbRecCod, T01HV28_A7130MatC_Pz
            }
            , new Object[] {
            T01HV29_A396EmprCod, T01HV29_A44AlbRecCod, T01HV29_A7132MatC_Talla
            }
            , new Object[] {
            T01HV30_A396EmprCod, T01HV30_A44AlbRecCod, T01HV30_A7115MatC_Lin
            }
            , new Object[] {
            T01HV31_A396EmprCod, T01HV31_A30AlbProCod, T01HV31_A129BarCod, T01HV31_A132BarCodReo, T01HV31_A130BarCodPar, T01HV31_A6622AlbHdRLn
            }
            , new Object[] {
            T01HV32_A396EmprCod, T01HV32_A6235DevEmpCod, T01HV32_A6243DevNumLin
            }
            , new Object[] {
            T01HV33_A396EmprCod, T01HV33_A44AlbRecCod, T01HV33_A4596AlbRDefCod
            }
            , new Object[] {
            T01HV34_A396EmprCod, T01HV34_A44AlbRecCod, T01HV34_A2159AlbRecPie
            }
            , new Object[] {
            T01HV35_A396EmprCod, T01HV35_A44AlbRecCod, T01HV35_A2165HisEmpLin
            }
            , new Object[] {
            T01HV36_A396EmprCod, T01HV36_A44AlbRecCod, T01HV36_A1299AlbRLin
            }
            , new Object[] {
            T01HV37_A396EmprCod, T01HV37_A361DisCod, T01HV37_A44AlbRecCod
            }
            , new Object[] {
            T01HV38_A396EmprCod, T01HV38_A323DevGenCod
            }
            , new Object[] {
            T01HV39_A396EmprCod, T01HV39_A129BarCod, T01HV39_A132BarCodReo, T01HV39_A130BarCodPar, T01HV39_A200BarPieCod
            }
            , new Object[] {
            T01HV40_A396EmprCod, T01HV40_A44AlbRecCod
            }
            , new Object[] {
            T01HV41_A396EmprCod
            }
            , new Object[] {
            T01HV42_A396EmprCod
            }
            , new Object[] {
            T01HV43_A396EmprCod
            }
            , new Object[] {
            T01HV44_A396EmprCod
            }
         }
      );
   }

   private byte Z47AlbREst ;
   private byte Z1301AlbRUlin ;
   private byte Z5745AlbRRep ;
   private byte Z317AlbStLot ;
   private byte Z10358AlbTurno ;
   private byte Z4792AlmCod ;
   private byte GxWebError ;
   private byte A4792AlmCod ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte A5745AlbRRep ;
   private byte A1301AlbRUlin ;
   private byte A317AlbStLot ;
   private byte A10358AlbTurno ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ47AlbREst ;
   private byte ZZ1301AlbRUlin ;
   private byte ZZ5745AlbRRep ;
   private byte ZZ4792AlmCod ;
   private byte ZZ317AlbStLot ;
   private byte ZZ10358AlbTurno ;
   private short Z1222AlbNumEti ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short Z8031AlbDndC ;
   private short Z8033AlbDndCr ;
   private short Z8034AlbGalga ;
   private short Z8036AlbDmt ;
   private short Z6263AlbRTartC ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1222AlbNumEti ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4922AlbPml ;
   private short A8031AlbDndC ;
   private short A8033AlbDndCr ;
   private short A8034AlbGalga ;
   private short A8036AlbDmt ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short ZZ840TrnCod ;
   private short ZZ1211TipEntCod ;
   private short ZZ1222AlbNumEti ;
   private short ZZ970ProceCod ;
   private short ZZ4920AlbRGrm2 ;
   private short ZZ4921AlbRAnc ;
   private short ZZ4922AlbPml ;
   private short ZZ6263AlbRTartC ;
   private short ZZ8031AlbDndC ;
   private short ZZ8033AlbDndCr ;
   private short ZZ8034AlbGalga ;
   private short ZZ8036AlbDmt ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z53AlbRPieReb ;
   private int Z6181AlbrPieC ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A44AlbRecCod ;
   private int edtAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A53AlbRPieReb ;
   private int edtAlbRPieReb_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniReb_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtAlbNumEti_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtAlbRUlin_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbPmPPza_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtAlbRPre_Enabled ;
   private int edtAlbRAju_Enabled ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbrUsu_Enabled ;
   private int edtAlbrHor_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbrNF_Enabled ;
   private int edtAlbrFeNf_Enabled ;
   private int edtAlbrCfop_Enabled ;
   private int edtAlbRDisCli_Enabled ;
   private int edtAlbRTartC_Enabled ;
   private int edtAlbRTartD_Enabled ;
   private int edtAlbRImp_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRTelar_Enabled ;
   private int edtAlbRLu_Enabled ;
   private int edtAlbRMdlCod_Enabled ;
   private int edtAlbRTara_Enabled ;
   private int edtAlbRUniB_Enabled ;
   private int edtAlbDocPrv_Enabled ;
   private int edtAlbRUdas_Enabled ;
   private int edtAlmCod_Enabled ;
   private int edtAlbColor_Enabled ;
   private int edtAlbOpsT_Enabled ;
   private int edtAlbOpsC_Enabled ;
   private int edtAlbOC_Enabled ;
   private int edtAlbHdri_Enabled ;
   private int edtAlbNumB_Enabled ;
   private int edtAlbNumM_Enabled ;
   private int edtAlbAncC_Enabled ;
   private int edtAlbDndC_Enabled ;
   private int edtAlbAncCr_Enabled ;
   private int edtAlbDndCr_Enabled ;
   private int edtAlbGalga_Enabled ;
   private int edtAlbMaqTej_Enabled ;
   private int edtAlbDmt_Enabled ;
   private int edtAlbPdaC_Enabled ;
   private int edtAlbOStj_Enabled ;
   private int edtAlbStLot_Enabled ;
   private int edtAlbTurno_Enabled ;
   private int edtCliEst_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int GXv_int2[] ;
   private int idxLst ;
   private int edtCliEst_Backcolor ;
   private int edtAlbTurno_Backcolor ;
   private int edtAlbStLot_Backcolor ;
   private int edtAlbOStj_Backcolor ;
   private int edtAlbPdaC_Backcolor ;
   private int edtAlbDmt_Backcolor ;
   private int edtAlbMaqTej_Backcolor ;
   private int edtAlbGalga_Backcolor ;
   private int edtAlbDndCr_Backcolor ;
   private int edtAlbAncCr_Backcolor ;
   private int edtAlbDndC_Backcolor ;
   private int edtAlbAncC_Backcolor ;
   private int edtAlbNumM_Backcolor ;
   private int edtAlbNumB_Backcolor ;
   private int edtAlbHdri_Backcolor ;
   private int edtAlbOC_Backcolor ;
   private int edtAlbOpsC_Backcolor ;
   private int edtAlbOpsT_Backcolor ;
   private int edtAlbColor_Backcolor ;
   private int edtAlmCod_Backcolor ;
   private int edtAlbRUdas_Backcolor ;
   private int edtAlbDocPrv_Backcolor ;
   private int edtAlbRUniB_Backcolor ;
   private int edtAlbRTara_Backcolor ;
   private int edtAlbRMdlCod_Backcolor ;
   private int edtAlbRLu_Backcolor ;
   private int edtAlbRTelar_Backcolor ;
   private int edtAlbRLote_Backcolor ;
   private int edtAlbRImp_Backcolor ;
   private int edtAlbRTartD_Backcolor ;
   private int edtAlbRTartC_Backcolor ;
   private int edtAlbRDisCli_Backcolor ;
   private int edtAlbrCfop_Backcolor ;
   private int edtAlbrFeNf_Backcolor ;
   private int edtAlbrNF_Backcolor ;
   private int edtAlbrPieC_Backcolor ;
   private int edtAlbrUniC_Backcolor ;
   private int edtAlbrHor_Backcolor ;
   private int edtAlbrUsu_Backcolor ;
   private int edtAlbREnt2_Backcolor ;
   private int edtAlbRAju_Backcolor ;
   private int edtAlbRPre_Backcolor ;
   private int edtAlbPml_Backcolor ;
   private int edtAlbRAnc_Backcolor ;
   private int edtAlbRGrm2_Backcolor ;
   private int edtAlbPmPPza_Backcolor ;
   private int edtAlbRefDsc_Backcolor ;
   private int edtAlbRUlin_Backcolor ;
   private int edtProceCod_Backcolor ;
   private int edtAlbRDes_Backcolor ;
   private int edtAlbNumEti_Backcolor ;
   private int edtTipEntCod_Backcolor ;
   private int edtAlbRFecUlt_Backcolor ;
   private int edtAlbRUniDis_Backcolor ;
   private int edtAlbRPieDis_Backcolor ;
   private int edtAlbRUniReb_Backcolor ;
   private int edtAlbRUniUti_Backcolor ;
   private int edtAlbRPieReb_Backcolor ;
   private int edtAlbRPieUti_Backcolor ;
   private int edtAlbRUniEnt_Backcolor ;
   private int edtAlbRFen_Backcolor ;
   private int edtAlbRLoc_Backcolor ;
   private int edtAlbRPieEnt_Backcolor ;
   private int edtAlbREnt_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtAlbRef_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z51AlbRPieDis ;
   private int ZZ44AlbRecCod ;
   private int ZZ252CliCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ54AlbRPieUti ;
   private int ZZ53AlbRPieReb ;
   private int ZZ6181AlbrPieC ;
   private int ZZ51AlbRPieDis ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal Z4290AlbPmPPza ;
   private java.math.BigDecimal Z5743AlbRPre ;
   private java.math.BigDecimal Z5744AlbRAju ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal Z6465AlbRLu ;
   private java.math.BigDecimal Z6470AlbRTara ;
   private java.math.BigDecimal Z6471AlbRUniB ;
   private java.math.BigDecimal Z6523AlbRUdas ;
   private java.math.BigDecimal Z8030AlbAncC ;
   private java.math.BigDecimal Z8032AlbAncCr ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A5743AlbRPre ;
   private java.math.BigDecimal A5744AlbRAju ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal A6471AlbRUniB ;
   private java.math.BigDecimal A6523AlbRUdas ;
   private java.math.BigDecimal A8030AlbAncC ;
   private java.math.BigDecimal A8032AlbAncCr ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ59AlbRUniReb ;
   private java.math.BigDecimal ZZ4290AlbPmPPza ;
   private java.math.BigDecimal ZZ5743AlbRPre ;
   private java.math.BigDecimal ZZ5744AlbRAju ;
   private java.math.BigDecimal ZZ6180AlbrUniC ;
   private java.math.BigDecimal ZZ6465AlbRLu ;
   private java.math.BigDecimal ZZ6470AlbRTara ;
   private java.math.BigDecimal ZZ6471AlbRUniB ;
   private java.math.BigDecimal ZZ6523AlbRUdas ;
   private java.math.BigDecimal ZZ8030AlbAncC ;
   private java.math.BigDecimal ZZ8032AlbAncCr ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z46AlbREnt ;
   private String Z56AlbRUni ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z1291AlbRDes ;
   private String Z3613AlbRefDsc ;
   private String Z5806AlbREnt2 ;
   private String Z6178AlbrUsu ;
   private String Z6182AlbrNF ;
   private String Z6184AlbrCfop ;
   private String Z3359AlbRDisCli ;
   private String Z3360AlbRImp ;
   private String Z6463AlbRLote ;
   private String Z6464AlbRTelar ;
   private String Z4602AlbRMdlCod ;
   private String Z6488AlbDocPrv ;
   private String Z8023AlbColor ;
   private String Z8024AlbOpsT ;
   private String Z8025AlbOpsC ;
   private String Z8026AlbOC ;
   private String Z8027AlbHdri ;
   private String Z8028AlbNumB ;
   private String Z8029AlbNumM ;
   private String Z8035AlbMaqTej ;
   private String Z9793AlbPdaC ;
   private String Z9794AlbOStj ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtAlbRPieReb_Internalname ;
   private String edtAlbRPieReb_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAlbRUniReb_Internalname ;
   private String edtAlbRUniReb_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtAlbNumEti_Internalname ;
   private String edtAlbNumEti_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtAlbRUlin_Internalname ;
   private String edtAlbRUlin_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtAlbPmPPza_Internalname ;
   private String edtAlbPmPPza_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtAlbRPre_Internalname ;
   private String edtAlbRPre_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtAlbRAju_Internalname ;
   private String edtAlbRAju_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtAlbrUsu_Internalname ;
   private String A6178AlbrUsu ;
   private String edtAlbrUsu_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtAlbrHor_Internalname ;
   private String edtAlbrHor_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtAlbrNF_Internalname ;
   private String A6182AlbrNF ;
   private String edtAlbrNF_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtAlbrFeNf_Internalname ;
   private String edtAlbrFeNf_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtAlbrCfop_Internalname ;
   private String A6184AlbrCfop ;
   private String edtAlbrCfop_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtAlbRDisCli_Internalname ;
   private String A3359AlbRDisCli ;
   private String edtAlbRDisCli_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtAlbRTartC_Internalname ;
   private String edtAlbRTartC_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtAlbRTartD_Internalname ;
   private String A6264AlbRTartD ;
   private String edtAlbRTartD_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtAlbRImp_Internalname ;
   private String A3360AlbRImp ;
   private String edtAlbRImp_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtAlbRTelar_Internalname ;
   private String A6464AlbRTelar ;
   private String edtAlbRTelar_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtAlbRLu_Internalname ;
   private String edtAlbRLu_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtAlbRMdlCod_Internalname ;
   private String A4602AlbRMdlCod ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtAlbRTara_Internalname ;
   private String edtAlbRTara_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtAlbRUniB_Internalname ;
   private String edtAlbRUniB_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtAlbDocPrv_Internalname ;
   private String A6488AlbDocPrv ;
   private String edtAlbDocPrv_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtAlbRUdas_Internalname ;
   private String edtAlbRUdas_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtAlmCod_Internalname ;
   private String edtAlmCod_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtAlbColor_Internalname ;
   private String A8023AlbColor ;
   private String edtAlbColor_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtAlbOpsT_Internalname ;
   private String A8024AlbOpsT ;
   private String edtAlbOpsT_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtAlbOpsC_Internalname ;
   private String A8025AlbOpsC ;
   private String edtAlbOpsC_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtAlbOC_Internalname ;
   private String A8026AlbOC ;
   private String edtAlbOC_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtAlbHdri_Internalname ;
   private String A8027AlbHdri ;
   private String edtAlbHdri_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtAlbNumB_Internalname ;
   private String A8028AlbNumB ;
   private String edtAlbNumB_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtAlbNumM_Internalname ;
   private String A8029AlbNumM ;
   private String edtAlbNumM_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtAlbAncC_Internalname ;
   private String edtAlbAncC_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtAlbDndC_Internalname ;
   private String edtAlbDndC_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtAlbAncCr_Internalname ;
   private String edtAlbAncCr_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtAlbDndCr_Internalname ;
   private String edtAlbDndCr_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtAlbGalga_Internalname ;
   private String edtAlbGalga_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtAlbMaqTej_Internalname ;
   private String A8035AlbMaqTej ;
   private String edtAlbMaqTej_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtAlbDmt_Internalname ;
   private String edtAlbDmt_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtAlbPdaC_Internalname ;
   private String A9793AlbPdaC ;
   private String edtAlbPdaC_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtAlbOStj_Internalname ;
   private String A9794AlbOStj ;
   private String edtAlbOStj_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtAlbStLot_Internalname ;
   private String edtAlbStLot_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtAlbTurno_Internalname ;
   private String edtAlbTurno_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtCliEst_Internalname ;
   private String A8723CliEst ;
   private String edtCliEst_Jsonclick ;
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
   private String Z8723CliEst ;
   private String Z6264AlbRTartD ;
   private String sMode7 ;
   private String GXv_char1[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ45AlbRef ;
   private String ZZ46AlbREnt ;
   private String ZZ56AlbRUni ;
   private String ZZ50AlbRLoc ;
   private String ZZ55AlbRReo ;
   private String ZZ1291AlbRDes ;
   private String ZZ3613AlbRefDsc ;
   private String ZZ5806AlbREnt2 ;
   private String ZZ6178AlbrUsu ;
   private String ZZ6182AlbrNF ;
   private String ZZ6184AlbrCfop ;
   private String ZZ3359AlbRDisCli ;
   private String ZZ3360AlbRImp ;
   private String ZZ6463AlbRLote ;
   private String ZZ6464AlbRTelar ;
   private String ZZ4602AlbRMdlCod ;
   private String ZZ6488AlbDocPrv ;
   private String ZZ8023AlbColor ;
   private String ZZ8024AlbOpsT ;
   private String ZZ8025AlbOpsC ;
   private String ZZ8026AlbOC ;
   private String ZZ8027AlbHdri ;
   private String ZZ8028AlbNumB ;
   private String ZZ8029AlbNumM ;
   private String ZZ8035AlbMaqTej ;
   private String ZZ9793AlbPdaC ;
   private String ZZ9794AlbOStj ;
   private String ZZ8723CliEst ;
   private String ZZ6264AlbRTartD ;
   private java.util.Date Z6179AlbrHor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date ZZ6179AlbrHor ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date Z6183AlbrFeNf ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A6183AlbrFeNf ;
   private java.util.Date ZZ49AlbRFen ;
   private java.util.Date ZZ48AlbRFecUlt ;
   private java.util.Date ZZ6183AlbrFeNf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n4792AlmCod ;
   private boolean wbErr ;
   private boolean n44AlbRecCod ;
   private boolean n6264AlbRTartD ;
   private boolean Gx_longc ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbREst ;
   private ICheckbox chkAlbRRep ;
   private IDataStoreProvider pr_default ;
   private int[] T01HV10_A44AlbRecCod ;
   private boolean[] T01HV10_n44AlbRecCod ;
   private String[] T01HV10_A45AlbRef ;
   private String[] T01HV10_A46AlbREnt ;
   private int[] T01HV10_A52AlbRPieEnt ;
   private String[] T01HV10_A56AlbRUni ;
   private String[] T01HV10_A50AlbRLoc ;
   private java.util.Date[] T01HV10_A49AlbRFen ;
   private java.math.BigDecimal[] T01HV10_A58AlbRUniEnt ;
   private String[] T01HV10_A55AlbRReo ;
   private int[] T01HV10_A54AlbRPieUti ;
   private int[] T01HV10_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01HV10_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01HV10_A59AlbRUniReb ;
   private java.util.Date[] T01HV10_A48AlbRFecUlt ;
   private byte[] T01HV10_A47AlbREst ;
   private short[] T01HV10_A1222AlbNumEti ;
   private String[] T01HV10_A1291AlbRDes ;
   private byte[] T01HV10_A1301AlbRUlin ;
   private String[] T01HV10_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01HV10_A4290AlbPmPPza ;
   private short[] T01HV10_A4920AlbRGrm2 ;
   private short[] T01HV10_A4921AlbRAnc ;
   private short[] T01HV10_A4922AlbPml ;
   private java.math.BigDecimal[] T01HV10_A5743AlbRPre ;
   private java.math.BigDecimal[] T01HV10_A5744AlbRAju ;
   private byte[] T01HV10_A5745AlbRRep ;
   private String[] T01HV10_A5806AlbREnt2 ;
   private String[] T01HV10_A6178AlbrUsu ;
   private java.util.Date[] T01HV10_A6179AlbrHor ;
   private java.math.BigDecimal[] T01HV10_A6180AlbrUniC ;
   private int[] T01HV10_A6181AlbrPieC ;
   private String[] T01HV10_A6182AlbrNF ;
   private java.util.Date[] T01HV10_A6183AlbrFeNf ;
   private String[] T01HV10_A6184AlbrCfop ;
   private String[] T01HV10_A3359AlbRDisCli ;
   private String[] T01HV10_A6264AlbRTartD ;
   private boolean[] T01HV10_n6264AlbRTartD ;
   private String[] T01HV10_A3360AlbRImp ;
   private String[] T01HV10_A6463AlbRLote ;
   private String[] T01HV10_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01HV10_A6465AlbRLu ;
   private String[] T01HV10_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01HV10_A6470AlbRTara ;
   private java.math.BigDecimal[] T01HV10_A6471AlbRUniB ;
   private String[] T01HV10_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01HV10_A6523AlbRUdas ;
   private String[] T01HV10_A8023AlbColor ;
   private String[] T01HV10_A8024AlbOpsT ;
   private String[] T01HV10_A8025AlbOpsC ;
   private String[] T01HV10_A8026AlbOC ;
   private String[] T01HV10_A8027AlbHdri ;
   private String[] T01HV10_A8028AlbNumB ;
   private String[] T01HV10_A8029AlbNumM ;
   private java.math.BigDecimal[] T01HV10_A8030AlbAncC ;
   private short[] T01HV10_A8031AlbDndC ;
   private java.math.BigDecimal[] T01HV10_A8032AlbAncCr ;
   private short[] T01HV10_A8033AlbDndCr ;
   private short[] T01HV10_A8034AlbGalga ;
   private String[] T01HV10_A8035AlbMaqTej ;
   private short[] T01HV10_A8036AlbDmt ;
   private String[] T01HV10_A9793AlbPdaC ;
   private String[] T01HV10_A9794AlbOStj ;
   private byte[] T01HV10_A317AlbStLot ;
   private byte[] T01HV10_A10358AlbTurno ;
   private String[] T01HV10_A8723CliEst ;
   private String[] T01HV10_A396EmprCod ;
   private int[] T01HV10_A252CliCod ;
   private short[] T01HV10_A6263AlbRTartC ;
   private boolean[] T01HV10_n6263AlbRTartC ;
   private short[] T01HV10_A840TrnCod ;
   private boolean[] T01HV10_n840TrnCod ;
   private short[] T01HV10_A970ProceCod ;
   private boolean[] T01HV10_n970ProceCod ;
   private short[] T01HV10_A1211TipEntCod ;
   private boolean[] T01HV10_n1211TipEntCod ;
   private byte[] T01HV10_A4792AlmCod ;
   private boolean[] T01HV10_n4792AlmCod ;
   private String[] T01HV4_A8723CliEst ;
   private String[] T01HV5_A6264AlbRTartD ;
   private boolean[] T01HV5_n6264AlbRTartD ;
   private String[] T01HV6_A396EmprCod ;
   private String[] T01HV7_A396EmprCod ;
   private String[] T01HV8_A396EmprCod ;
   private String[] T01HV9_A396EmprCod ;
   private String[] T01HV11_A8723CliEst ;
   private String[] T01HV12_A6264AlbRTartD ;
   private boolean[] T01HV12_n6264AlbRTartD ;
   private String[] T01HV13_A396EmprCod ;
   private String[] T01HV14_A396EmprCod ;
   private String[] T01HV15_A396EmprCod ;
   private String[] T01HV16_A396EmprCod ;
   private String[] T01HV17_A396EmprCod ;
   private int[] T01HV17_A44AlbRecCod ;
   private boolean[] T01HV17_n44AlbRecCod ;
   private int[] T01HV3_A44AlbRecCod ;
   private boolean[] T01HV3_n44AlbRecCod ;
   private String[] T01HV3_A45AlbRef ;
   private String[] T01HV3_A46AlbREnt ;
   private int[] T01HV3_A52AlbRPieEnt ;
   private String[] T01HV3_A56AlbRUni ;
   private String[] T01HV3_A50AlbRLoc ;
   private java.util.Date[] T01HV3_A49AlbRFen ;
   private java.math.BigDecimal[] T01HV3_A58AlbRUniEnt ;
   private String[] T01HV3_A55AlbRReo ;
   private int[] T01HV3_A54AlbRPieUti ;
   private int[] T01HV3_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01HV3_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01HV3_A59AlbRUniReb ;
   private java.util.Date[] T01HV3_A48AlbRFecUlt ;
   private byte[] T01HV3_A47AlbREst ;
   private short[] T01HV3_A1222AlbNumEti ;
   private String[] T01HV3_A1291AlbRDes ;
   private byte[] T01HV3_A1301AlbRUlin ;
   private String[] T01HV3_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01HV3_A4290AlbPmPPza ;
   private short[] T01HV3_A4920AlbRGrm2 ;
   private short[] T01HV3_A4921AlbRAnc ;
   private short[] T01HV3_A4922AlbPml ;
   private java.math.BigDecimal[] T01HV3_A5743AlbRPre ;
   private java.math.BigDecimal[] T01HV3_A5744AlbRAju ;
   private byte[] T01HV3_A5745AlbRRep ;
   private String[] T01HV3_A5806AlbREnt2 ;
   private String[] T01HV3_A6178AlbrUsu ;
   private java.util.Date[] T01HV3_A6179AlbrHor ;
   private java.math.BigDecimal[] T01HV3_A6180AlbrUniC ;
   private int[] T01HV3_A6181AlbrPieC ;
   private String[] T01HV3_A6182AlbrNF ;
   private java.util.Date[] T01HV3_A6183AlbrFeNf ;
   private String[] T01HV3_A6184AlbrCfop ;
   private String[] T01HV3_A3359AlbRDisCli ;
   private String[] T01HV3_A3360AlbRImp ;
   private String[] T01HV3_A6463AlbRLote ;
   private String[] T01HV3_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01HV3_A6465AlbRLu ;
   private String[] T01HV3_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01HV3_A6470AlbRTara ;
   private java.math.BigDecimal[] T01HV3_A6471AlbRUniB ;
   private String[] T01HV3_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01HV3_A6523AlbRUdas ;
   private String[] T01HV3_A8023AlbColor ;
   private String[] T01HV3_A8024AlbOpsT ;
   private String[] T01HV3_A8025AlbOpsC ;
   private String[] T01HV3_A8026AlbOC ;
   private String[] T01HV3_A8027AlbHdri ;
   private String[] T01HV3_A8028AlbNumB ;
   private String[] T01HV3_A8029AlbNumM ;
   private java.math.BigDecimal[] T01HV3_A8030AlbAncC ;
   private short[] T01HV3_A8031AlbDndC ;
   private java.math.BigDecimal[] T01HV3_A8032AlbAncCr ;
   private short[] T01HV3_A8033AlbDndCr ;
   private short[] T01HV3_A8034AlbGalga ;
   private String[] T01HV3_A8035AlbMaqTej ;
   private short[] T01HV3_A8036AlbDmt ;
   private String[] T01HV3_A9793AlbPdaC ;
   private String[] T01HV3_A9794AlbOStj ;
   private byte[] T01HV3_A317AlbStLot ;
   private byte[] T01HV3_A10358AlbTurno ;
   private String[] T01HV3_A396EmprCod ;
   private int[] T01HV3_A252CliCod ;
   private short[] T01HV3_A6263AlbRTartC ;
   private boolean[] T01HV3_n6263AlbRTartC ;
   private short[] T01HV3_A840TrnCod ;
   private boolean[] T01HV3_n840TrnCod ;
   private short[] T01HV3_A970ProceCod ;
   private boolean[] T01HV3_n970ProceCod ;
   private short[] T01HV3_A1211TipEntCod ;
   private boolean[] T01HV3_n1211TipEntCod ;
   private byte[] T01HV3_A4792AlmCod ;
   private boolean[] T01HV3_n4792AlmCod ;
   private String[] T01HV18_A396EmprCod ;
   private int[] T01HV18_A44AlbRecCod ;
   private boolean[] T01HV18_n44AlbRecCod ;
   private String[] T01HV19_A396EmprCod ;
   private int[] T01HV19_A44AlbRecCod ;
   private boolean[] T01HV19_n44AlbRecCod ;
   private int[] T01HV2_A44AlbRecCod ;
   private boolean[] T01HV2_n44AlbRecCod ;
   private String[] T01HV2_A45AlbRef ;
   private String[] T01HV2_A46AlbREnt ;
   private int[] T01HV2_A52AlbRPieEnt ;
   private String[] T01HV2_A56AlbRUni ;
   private String[] T01HV2_A50AlbRLoc ;
   private java.util.Date[] T01HV2_A49AlbRFen ;
   private java.math.BigDecimal[] T01HV2_A58AlbRUniEnt ;
   private String[] T01HV2_A55AlbRReo ;
   private int[] T01HV2_A54AlbRPieUti ;
   private int[] T01HV2_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01HV2_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01HV2_A59AlbRUniReb ;
   private java.util.Date[] T01HV2_A48AlbRFecUlt ;
   private byte[] T01HV2_A47AlbREst ;
   private short[] T01HV2_A1222AlbNumEti ;
   private String[] T01HV2_A1291AlbRDes ;
   private byte[] T01HV2_A1301AlbRUlin ;
   private String[] T01HV2_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01HV2_A4290AlbPmPPza ;
   private short[] T01HV2_A4920AlbRGrm2 ;
   private short[] T01HV2_A4921AlbRAnc ;
   private short[] T01HV2_A4922AlbPml ;
   private java.math.BigDecimal[] T01HV2_A5743AlbRPre ;
   private java.math.BigDecimal[] T01HV2_A5744AlbRAju ;
   private byte[] T01HV2_A5745AlbRRep ;
   private String[] T01HV2_A5806AlbREnt2 ;
   private String[] T01HV2_A6178AlbrUsu ;
   private java.util.Date[] T01HV2_A6179AlbrHor ;
   private java.math.BigDecimal[] T01HV2_A6180AlbrUniC ;
   private int[] T01HV2_A6181AlbrPieC ;
   private String[] T01HV2_A6182AlbrNF ;
   private java.util.Date[] T01HV2_A6183AlbrFeNf ;
   private String[] T01HV2_A6184AlbrCfop ;
   private String[] T01HV2_A3359AlbRDisCli ;
   private String[] T01HV2_A3360AlbRImp ;
   private String[] T01HV2_A6463AlbRLote ;
   private String[] T01HV2_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01HV2_A6465AlbRLu ;
   private String[] T01HV2_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01HV2_A6470AlbRTara ;
   private java.math.BigDecimal[] T01HV2_A6471AlbRUniB ;
   private String[] T01HV2_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01HV2_A6523AlbRUdas ;
   private String[] T01HV2_A8023AlbColor ;
   private String[] T01HV2_A8024AlbOpsT ;
   private String[] T01HV2_A8025AlbOpsC ;
   private String[] T01HV2_A8026AlbOC ;
   private String[] T01HV2_A8027AlbHdri ;
   private String[] T01HV2_A8028AlbNumB ;
   private String[] T01HV2_A8029AlbNumM ;
   private java.math.BigDecimal[] T01HV2_A8030AlbAncC ;
   private short[] T01HV2_A8031AlbDndC ;
   private java.math.BigDecimal[] T01HV2_A8032AlbAncCr ;
   private short[] T01HV2_A8033AlbDndCr ;
   private short[] T01HV2_A8034AlbGalga ;
   private String[] T01HV2_A8035AlbMaqTej ;
   private short[] T01HV2_A8036AlbDmt ;
   private String[] T01HV2_A9793AlbPdaC ;
   private String[] T01HV2_A9794AlbOStj ;
   private byte[] T01HV2_A317AlbStLot ;
   private byte[] T01HV2_A10358AlbTurno ;
   private String[] T01HV2_A396EmprCod ;
   private int[] T01HV2_A252CliCod ;
   private short[] T01HV2_A6263AlbRTartC ;
   private boolean[] T01HV2_n6263AlbRTartC ;
   private short[] T01HV2_A840TrnCod ;
   private boolean[] T01HV2_n840TrnCod ;
   private short[] T01HV2_A970ProceCod ;
   private boolean[] T01HV2_n970ProceCod ;
   private short[] T01HV2_A1211TipEntCod ;
   private boolean[] T01HV2_n1211TipEntCod ;
   private byte[] T01HV2_A4792AlmCod ;
   private boolean[] T01HV2_n4792AlmCod ;
   private String[] T01HV23_A8723CliEst ;
   private String[] T01HV24_A6264AlbRTartD ;
   private boolean[] T01HV24_n6264AlbRTartD ;
   private String[] T01HV25_A396EmprCod ;
   private int[] T01HV25_A13026PedDGId ;
   private int[] T01HV25_A44AlbRecCod ;
   private boolean[] T01HV25_n44AlbRecCod ;
   private String[] T01HV26_A396EmprCod ;
   private int[] T01HV26_A11669DevCruId ;
   private int[] T01HV26_A44AlbRecCod ;
   private boolean[] T01HV26_n44AlbRecCod ;
   private String[] T01HV27_A396EmprCod ;
   private int[] T01HV27_A44AlbRecCod ;
   private boolean[] T01HV27_n44AlbRecCod ;
   private String[] T01HV27_A9743Emp_CUb ;
   private short[] T01HV27_A5860Emp_Anp ;
   private String[] T01HV28_A396EmprCod ;
   private int[] T01HV28_A44AlbRecCod ;
   private boolean[] T01HV28_n44AlbRecCod ;
   private String[] T01HV28_A7130MatC_Pz ;
   private String[] T01HV29_A396EmprCod ;
   private int[] T01HV29_A44AlbRecCod ;
   private boolean[] T01HV29_n44AlbRecCod ;
   private String[] T01HV29_A7132MatC_Talla ;
   private String[] T01HV30_A396EmprCod ;
   private int[] T01HV30_A44AlbRecCod ;
   private boolean[] T01HV30_n44AlbRecCod ;
   private short[] T01HV30_A7115MatC_Lin ;
   private String[] T01HV31_A396EmprCod ;
   private long[] T01HV31_A30AlbProCod ;
   private int[] T01HV31_A129BarCod ;
   private byte[] T01HV31_A132BarCodReo ;
   private String[] T01HV31_A130BarCodPar ;
   private short[] T01HV31_A6622AlbHdRLn ;
   private String[] T01HV32_A396EmprCod ;
   private int[] T01HV32_A6235DevEmpCod ;
   private byte[] T01HV32_A6243DevNumLin ;
   private String[] T01HV33_A396EmprCod ;
   private int[] T01HV33_A44AlbRecCod ;
   private boolean[] T01HV33_n44AlbRecCod ;
   private short[] T01HV33_A4596AlbRDefCod ;
   private String[] T01HV34_A396EmprCod ;
   private int[] T01HV34_A44AlbRecCod ;
   private boolean[] T01HV34_n44AlbRecCod ;
   private String[] T01HV34_A2159AlbRecPie ;
   private String[] T01HV35_A396EmprCod ;
   private int[] T01HV35_A44AlbRecCod ;
   private boolean[] T01HV35_n44AlbRecCod ;
   private short[] T01HV35_A2165HisEmpLin ;
   private String[] T01HV36_A396EmprCod ;
   private int[] T01HV36_A44AlbRecCod ;
   private boolean[] T01HV36_n44AlbRecCod ;
   private byte[] T01HV36_A1299AlbRLin ;
   private String[] T01HV37_A396EmprCod ;
   private int[] T01HV37_A361DisCod ;
   private int[] T01HV37_A44AlbRecCod ;
   private boolean[] T01HV37_n44AlbRecCod ;
   private String[] T01HV38_A396EmprCod ;
   private int[] T01HV38_A323DevGenCod ;
   private String[] T01HV39_A396EmprCod ;
   private int[] T01HV39_A129BarCod ;
   private byte[] T01HV39_A132BarCodReo ;
   private String[] T01HV39_A130BarCodPar ;
   private String[] T01HV39_A200BarPieCod ;
   private String[] T01HV40_A396EmprCod ;
   private int[] T01HV40_A44AlbRecCod ;
   private boolean[] T01HV40_n44AlbRecCod ;
   private String[] T01HV41_A396EmprCod ;
   private String[] T01HV42_A396EmprCod ;
   private String[] T01HV43_A396EmprCod ;
   private String[] T01HV44_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttralbrec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttralbrec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttralbrec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttralbrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HV2", "SELECT AlbRecCod, AlbRef, AlbREnt, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRef, AlbREnt, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV3", "SELECT AlbRecCod, AlbRef, AlbREnt, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV4", "SELECT CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV5", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV6", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV7", "SELECT EmprCod FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV8", "SELECT EmprCod FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV9", "SELECT EmprCod FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV10", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbRecCod, TM1.AlbRef, TM1.AlbREnt, TM1.AlbRPieEnt, TM1.AlbRUni, TM1.AlbRLoc, TM1.AlbRFen, TM1.AlbRUniEnt, TM1.AlbRReo, TM1.AlbRPieUti, TM1.AlbRPieReb, TM1.AlbRUniUti, TM1.AlbRUniReb, TM1.AlbRFecUlt, TM1.AlbREst, TM1.AlbNumEti, TM1.AlbRDes, TM1.AlbRUlin, TM1.AlbRefDsc, TM1.AlbPmPPza, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRPre, TM1.AlbRAju, TM1.AlbRRep, TM1.AlbREnt2, TM1.AlbrUsu, TM1.AlbrHor, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbrNF, TM1.AlbrFeNf, TM1.AlbrCfop, TM1.AlbRDisCli, T3.TipArtDsc AS AlbRTartD, TM1.AlbRImp, TM1.AlbRLote, TM1.AlbRTelar, TM1.AlbRLu, TM1.AlbRMdlCod, TM1.AlbRTara, TM1.AlbRUniB, TM1.AlbDocPrv, TM1.AlbRUdas, TM1.AlbColor, TM1.AlbOpsT, TM1.AlbOpsC, TM1.AlbOC, TM1.AlbHdri, TM1.AlbNumB, TM1.AlbNumM, TM1.AlbAncC, TM1.AlbDndC, TM1.AlbAncCr, TM1.AlbDndCr, TM1.AlbGalga, TM1.AlbMaqTej, TM1.AlbDmt, TM1.AlbPdaC, TM1.AlbOStj, TM1.AlbStLot, TM1.AlbTurno, T2.CliEst, TM1.EmprCod, TM1.CliCod, TM1.AlbRTartC AS AlbRTartC, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, TM1.AlmCod FROM ((TXPALBREC TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipArtCod = TM1.AlbRTartC) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV11", "SELECT CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV12", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV13", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV14", "SELECT EmprCod FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV15", "SELECT EmprCod FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV16", "SELECT EmprCod FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ?) ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ?) ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HV20", "INSERT INTO TXPALBREC(AlbRecCod, AlbRef, AlbREnt, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, EmprCod, CliCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod, HisEmpULin, AlbRTam, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, MatC_ULin, AlbRecSec, Bod_UltPz, Emp_Item1, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01HV21", "UPDATE TXPALBREC SET AlbRef=?, AlbREnt=?, AlbRPieEnt=?, AlbRUni=?, AlbRLoc=?, AlbRFen=?, AlbRUniEnt=?, AlbRReo=?, AlbRPieUti=?, AlbRPieReb=?, AlbRUniUti=?, AlbRUniReb=?, AlbRFecUlt=?, AlbREst=?, AlbNumEti=?, AlbRDes=?, AlbRUlin=?, AlbRefDsc=?, AlbPmPPza=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRPre=?, AlbRAju=?, AlbRRep=?, AlbREnt2=?, AlbrUsu=?, AlbrHor=?, AlbrUniC=?, AlbrPieC=?, AlbrNF=?, AlbrFeNf=?, AlbrCfop=?, AlbRDisCli=?, AlbRImp=?, AlbRLote=?, AlbRTelar=?, AlbRLu=?, AlbRMdlCod=?, AlbRTara=?, AlbRUniB=?, AlbDocPrv=?, AlbRUdas=?, AlbColor=?, AlbOpsT=?, AlbOpsC=?, AlbOC=?, AlbHdri=?, AlbNumB=?, AlbNumM=?, AlbAncC=?, AlbDndC=?, AlbAncCr=?, AlbDndCr=?, AlbGalga=?, AlbMaqTej=?, AlbDmt=?, AlbPdaC=?, AlbOStj=?, AlbStLot=?, AlbTurno=?, CliCod=?, AlbRTartC=?, TrnCod=?, ProceCod=?, TipEntCod=?, AlmCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01HV22", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01HV23", "SELECT CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV24", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV25", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV26", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV27", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV28", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV29", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV30", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV31", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV32", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV33", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV34", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV35", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV36", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV37", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV38", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HV40", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV41", "SELECT EmprCod FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV42", "SELECT EmprCod FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV43", "SELECT EmprCod FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HV44", "SELECT EmprCod FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,3);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 20);
               ((String[]) buf[27])[0] = rslt.getString(28, 10);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,2);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 5);
               ((String[]) buf[34])[0] = rslt.getString(35, 20);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               ((String[]) buf[36])[0] = rslt.getString(37, 20);
               ((String[]) buf[37])[0] = rslt.getString(38, 20);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,2);
               ((String[]) buf[39])[0] = rslt.getString(40, 13);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[42])[0] = rslt.getString(43, 10);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 40);
               ((String[]) buf[45])[0] = rslt.getString(46, 30);
               ((String[]) buf[46])[0] = rslt.getString(47, 30);
               ((String[]) buf[47])[0] = rslt.getString(48, 12);
               ((String[]) buf[48])[0] = rslt.getString(49, 20);
               ((String[]) buf[49])[0] = rslt.getString(50, 20);
               ((String[]) buf[50])[0] = rslt.getString(51, 10);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(52,2);
               ((short[]) buf[52])[0] = rslt.getShort(53);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[54])[0] = rslt.getShort(55);
               ((short[]) buf[55])[0] = rslt.getShort(56);
               ((String[]) buf[56])[0] = rslt.getString(57, 12);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((String[]) buf[58])[0] = rslt.getString(59, 20);
               ((String[]) buf[59])[0] = rslt.getString(60, 20);
               ((byte[]) buf[60])[0] = rslt.getByte(61);
               ((byte[]) buf[61])[0] = rslt.getByte(62);
               ((String[]) buf[62])[0] = rslt.getString(63, 3);
               ((int[]) buf[63])[0] = rslt.getInt(64);
               ((short[]) buf[64])[0] = rslt.getShort(65);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(66);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(67);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(68);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(69);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,3);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 20);
               ((String[]) buf[27])[0] = rslt.getString(28, 10);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,2);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 5);
               ((String[]) buf[34])[0] = rslt.getString(35, 20);
               ((String[]) buf[35])[0] = rslt.getString(36, 1);
               ((String[]) buf[36])[0] = rslt.getString(37, 20);
               ((String[]) buf[37])[0] = rslt.getString(38, 20);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,2);
               ((String[]) buf[39])[0] = rslt.getString(40, 13);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[42])[0] = rslt.getString(43, 10);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 40);
               ((String[]) buf[45])[0] = rslt.getString(46, 30);
               ((String[]) buf[46])[0] = rslt.getString(47, 30);
               ((String[]) buf[47])[0] = rslt.getString(48, 12);
               ((String[]) buf[48])[0] = rslt.getString(49, 20);
               ((String[]) buf[49])[0] = rslt.getString(50, 20);
               ((String[]) buf[50])[0] = rslt.getString(51, 10);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(52,2);
               ((short[]) buf[52])[0] = rslt.getShort(53);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[54])[0] = rslt.getShort(55);
               ((short[]) buf[55])[0] = rslt.getShort(56);
               ((String[]) buf[56])[0] = rslt.getString(57, 12);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((String[]) buf[58])[0] = rslt.getString(59, 20);
               ((String[]) buf[59])[0] = rslt.getString(60, 20);
               ((byte[]) buf[60])[0] = rslt.getByte(61);
               ((byte[]) buf[61])[0] = rslt.getByte(62);
               ((String[]) buf[62])[0] = rslt.getString(63, 3);
               ((int[]) buf[63])[0] = rslt.getInt(64);
               ((short[]) buf[64])[0] = rslt.getShort(65);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(66);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(67);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(68);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(69);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,3);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 20);
               ((String[]) buf[27])[0] = rslt.getString(28, 10);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,2);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 5);
               ((String[]) buf[34])[0] = rslt.getString(35, 20);
               ((String[]) buf[35])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(37, 1);
               ((String[]) buf[38])[0] = rslt.getString(38, 20);
               ((String[]) buf[39])[0] = rslt.getString(39, 20);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(40,2);
               ((String[]) buf[41])[0] = rslt.getString(41, 13);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(43,2);
               ((String[]) buf[44])[0] = rslt.getString(44, 10);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(45,2);
               ((String[]) buf[46])[0] = rslt.getString(46, 40);
               ((String[]) buf[47])[0] = rslt.getString(47, 30);
               ((String[]) buf[48])[0] = rslt.getString(48, 30);
               ((String[]) buf[49])[0] = rslt.getString(49, 12);
               ((String[]) buf[50])[0] = rslt.getString(50, 20);
               ((String[]) buf[51])[0] = rslt.getString(51, 20);
               ((String[]) buf[52])[0] = rslt.getString(52, 10);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(53,2);
               ((short[]) buf[54])[0] = rslt.getShort(54);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(55,2);
               ((short[]) buf[56])[0] = rslt.getShort(56);
               ((short[]) buf[57])[0] = rslt.getShort(57);
               ((String[]) buf[58])[0] = rslt.getString(58, 12);
               ((short[]) buf[59])[0] = rslt.getShort(59);
               ((String[]) buf[60])[0] = rslt.getString(60, 20);
               ((String[]) buf[61])[0] = rslt.getString(61, 20);
               ((byte[]) buf[62])[0] = rslt.getByte(62);
               ((byte[]) buf[63])[0] = rslt.getByte(63);
               ((String[]) buf[64])[0] = rslt.getString(64, 1);
               ((String[]) buf[65])[0] = rslt.getString(65, 3);
               ((int[]) buf[66])[0] = rslt.getInt(66);
               ((short[]) buf[67])[0] = rslt.getShort(67);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(68);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(69);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(70);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((byte[]) buf[75])[0] = rslt.getByte(71);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
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
            case 4 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
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
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 16);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 10);
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(9, (String)parms[9], 2);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[13], 2);
               stmt.setDate(14, (java.util.Date)parms[14]);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setString(17, (String)parms[17], 20);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setString(19, (String)parms[19], 26);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 3);
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setShort(22, ((Number) parms[22]).shortValue());
               stmt.setShort(23, ((Number) parms[23]).shortValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 5);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[25], 2);
               stmt.setByte(26, ((Number) parms[26]).byteValue());
               stmt.setString(27, (String)parms[27], 20);
               stmt.setString(28, (String)parms[28], 10);
               stmt.setDateTime(29, (java.util.Date)parms[29], true);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[30], 2);
               stmt.setInt(31, ((Number) parms[31]).intValue());
               stmt.setString(32, (String)parms[32], 1);
               stmt.setDate(33, (java.util.Date)parms[33]);
               stmt.setString(34, (String)parms[34], 5);
               stmt.setString(35, (String)parms[35], 20);
               stmt.setString(36, (String)parms[36], 1);
               stmt.setString(37, (String)parms[37], 20);
               stmt.setString(38, (String)parms[38], 20);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[39], 2);
               stmt.setString(40, (String)parms[40], 13);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 2);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[42], 2);
               stmt.setString(43, (String)parms[43], 10);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[44], 2);
               stmt.setString(45, (String)parms[45], 40);
               stmt.setString(46, (String)parms[46], 30);
               stmt.setString(47, (String)parms[47], 30);
               stmt.setString(48, (String)parms[48], 12);
               stmt.setString(49, (String)parms[49], 20);
               stmt.setString(50, (String)parms[50], 20);
               stmt.setString(51, (String)parms[51], 10);
               stmt.setBigDecimal(52, (java.math.BigDecimal)parms[52], 2);
               stmt.setShort(53, ((Number) parms[53]).shortValue());
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[54], 2);
               stmt.setShort(55, ((Number) parms[55]).shortValue());
               stmt.setShort(56, ((Number) parms[56]).shortValue());
               stmt.setString(57, (String)parms[57], 12);
               stmt.setShort(58, ((Number) parms[58]).shortValue());
               stmt.setString(59, (String)parms[59], 20);
               stmt.setString(60, (String)parms[60], 20);
               stmt.setByte(61, ((Number) parms[61]).byteValue());
               stmt.setByte(62, ((Number) parms[62]).byteValue());
               stmt.setString(63, (String)parms[63], 3);
               stmt.setInt(64, ((Number) parms[64]).intValue());
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(69, ((Number) parms[74]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 2);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 20);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 26);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 5);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 20);
               stmt.setString(27, (String)parms[26], 10);
               stmt.setDateTime(28, (java.util.Date)parms[27], true);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setString(31, (String)parms[30], 1);
               stmt.setDate(32, (java.util.Date)parms[31]);
               stmt.setString(33, (String)parms[32], 5);
               stmt.setString(34, (String)parms[33], 20);
               stmt.setString(35, (String)parms[34], 1);
               stmt.setString(36, (String)parms[35], 20);
               stmt.setString(37, (String)parms[36], 20);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[37], 2);
               stmt.setString(39, (String)parms[38], 13);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 2);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[40], 2);
               stmt.setString(42, (String)parms[41], 10);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[42], 2);
               stmt.setString(44, (String)parms[43], 40);
               stmt.setString(45, (String)parms[44], 30);
               stmt.setString(46, (String)parms[45], 30);
               stmt.setString(47, (String)parms[46], 12);
               stmt.setString(48, (String)parms[47], 20);
               stmt.setString(49, (String)parms[48], 20);
               stmt.setString(50, (String)parms[49], 10);
               stmt.setBigDecimal(51, (java.math.BigDecimal)parms[50], 2);
               stmt.setShort(52, ((Number) parms[51]).shortValue());
               stmt.setBigDecimal(53, (java.math.BigDecimal)parms[52], 2);
               stmt.setShort(54, ((Number) parms[53]).shortValue());
               stmt.setShort(55, ((Number) parms[54]).shortValue());
               stmt.setString(56, (String)parms[55], 12);
               stmt.setShort(57, ((Number) parms[56]).shortValue());
               stmt.setString(58, (String)parms[57], 20);
               stmt.setString(59, (String)parms[58], 20);
               stmt.setByte(60, ((Number) parms[59]).byteValue());
               stmt.setByte(61, ((Number) parms[60]).byteValue());
               stmt.setInt(62, ((Number) parms[61]).intValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(67, ((Number) parms[71]).byteValue());
               }
               stmt.setString(68, (String)parms[72], 3);
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(69, ((Number) parms[74]).intValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
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
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
   }

}

