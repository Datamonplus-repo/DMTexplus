package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcil000_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1O51836( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13397CILClicod = (int)(GXutil.lval( httpContext.GetPar( "CILClicod"))) ;
         n13397CILClicod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13397CILClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13397CILClicod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_1O51836( A396EmprCod, A13397CILClicod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13411CILLDESId = (int)(GXutil.lval( httpContext.GetPar( "CILLDESId"))) ;
         n13411CILLDESId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         AV35msg_err = httpContext.GetPar( "msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35msg_err", AV35msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_1O51836( A396EmprCod, A13411CILLDESId, AV35msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13411CILLDESId = (int)(GXutil.lval( httpContext.GetPar( "CILLDESId"))) ;
         n13411CILLDESId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         A13400CILGrabCod = (short)(GXutil.lval( httpContext.GetPar( "CILGrabCod"))) ;
         n13400CILGrabCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
         A13391CILDIbCli = httpContext.GetPar( "CILDIbCli") ;
         n13391CILDIbCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
         A13392CILDibInt = (int)(GXutil.lval( httpContext.GetPar( "CILDibInt"))) ;
         n13392CILDibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
         A13393CILRef = httpContext.GetPar( "CILRef") ;
         n13393CILRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
         AV35msg_err = httpContext.GetPar( "msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35msg_err", AV35msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_1O51836( A396EmprCod, A13411CILLDESId, A13400CILGrabCod, A13391CILDIbCli, A13392CILDibInt, A13393CILRef, AV35msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13388CILOGId = GXutil.lval( httpContext.GetPar( "CILOGId")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
         A13411CILLDESId = (int)(GXutil.lval( httpContext.GetPar( "CILLDESId"))) ;
         n13411CILLDESId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_1O51836( A396EmprCod, A13388CILOGId, A13411CILLDESId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13400CILGrabCod = (short)(GXutil.lval( httpContext.GetPar( "CILGrabCod"))) ;
         n13400CILGrabCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A13400CILGrabCod) ;
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
            AV34CILOGId = GXutil.lval( httpContext.GetPar( "CILOGId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CILOGId), 10, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Orden de GRabacion CILINDROS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCILOGId_Internalname ;
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
      nRC_GXsfl_115 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_115"))) ;
      nGXsfl_115_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_115_idx"))) ;
      sGXsfl_115_idx = httpContext.GetPar( "sGXsfl_115_idx") ;
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

   public tcil000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcil000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcil000_impl.class ));
   }

   public tcil000_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCILTipMaq = new HTMLChoice();
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
      if ( cmbCILTipMaq.getItemCount() > 0 )
      {
         A13410CILTipMaq = cmbCILTipMaq.getValidValue(A13410CILTipMaq) ;
         n13410CILTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13410CILTipMaq", A13410CILTipMaq);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCILTipMaq.setValue( GXutil.rtrim( A13410CILTipMaq) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCILTipMaq.getInternalname(), "Values", cmbCILTipMaq.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCIL000.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Orden de Grabacion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILOGId_Internalname, GXutil.ltrim( localUtil.ntoc( A13388CILOGId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13388CILOGId), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILOGId_Jsonclick, 0, "", "", "", "", "", 1, edtCILOGId_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCILFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILFecha_Internalname, localUtil.format(A13389CILFecha, "99/99/99"), localUtil.format( A13389CILFecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILFecha_Jsonclick, 0, "", "", "", "", "", 1, edtCILFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCILFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCILFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCIL000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCILFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILFecEnt_Internalname, localUtil.format(A13390CILFecEnt, "99/99/99"), localUtil.format( A13390CILFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtCILFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCILFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCILFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCIL000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Dibujo Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILDIbCli_Internalname, GXutil.rtrim( A13391CILDIbCli), GXutil.rtrim( localUtil.format( A13391CILDIbCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILDIbCli_Jsonclick, 0, "", "", "", "", "", 1, edtCILDIbCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A13392CILDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13392CILDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13392CILDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtCILDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Referencia Grabador", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILRef_Internalname, GXutil.rtrim( A13393CILRef), GXutil.rtrim( localUtil.format( A13393CILRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILRef_Jsonclick, 0, "", "", "", "", "", 1, edtCILRef_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Rapport", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILRap_Internalname, GXutil.ltrim( localUtil.ntoc( A13394CILRap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILRap_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13394CILRap), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13394CILRap), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILRap_Jsonclick, 0, "", "", "", "", "", 1, edtCILRap_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cargo a", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILCargo_Internalname, GXutil.ltrim( localUtil.ntoc( A13395CILCargo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILCargo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13395CILCargo), "9") : localUtil.format( DecimalUtil.doubleToDec(A13395CILCargo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILCargo_Jsonclick, 0, "", "", "", "", "", 1, edtCILCargo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCILObs_Internalname, A13396CILObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtCILObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILClicod_Internalname, GXutil.ltrim( localUtil.ntoc( A13397CILClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13397CILClicod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILClicod_Jsonclick, 0, "", "", "", "", "", 1, edtCILClicod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILCliNom_Internalname, GXutil.rtrim( A13398CILCliNom), GXutil.rtrim( localUtil.format( A13398CILCliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCILCliNom_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13399CILEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13399CILEstado), "9") : localUtil.format( DecimalUtil.doubleToDec(A13399CILEstado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILEstado_Jsonclick, 0, "", "", "", "", "", 1, edtCILEstado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Grabador", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILGrabCod_Internalname, GXutil.ltrim( localUtil.ntoc( A13400CILGrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILGrabCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13400CILGrabCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13400CILGrabCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILGrabCod_Jsonclick, 0, "", "", "", "", "", 1, edtCILGrabCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "CILGrab Nom", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILGrabNom_Internalname, GXutil.rtrim( A13409CILGrabNom), GXutil.rtrim( localUtil.format( A13409CILGrabNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILGrabNom_Jsonclick, 0, "", "", "", "", "", 1, edtCILGrabNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "N Colores", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A13402CILNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13402CILNumCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13402CILNumCol), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtCILNumCol_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo Maquina", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCILTipMaq, cmbCILTipMaq.getInternalname(), GXutil.rtrim( A13410CILTipMaq), 1, cmbCILTipMaq.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCILTipMaq.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "", true, (byte)(0), "HLP_TCIL000.htm");
      cmbCILTipMaq.setValue( GXutil.rtrim( A13410CILTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCILTipMaq.getInternalname(), "Values", cmbCILTipMaq.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "N LAB DIP", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCILLDESId_Internalname, GXutil.ltrim( localUtil.ntoc( A13411CILLDESId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCILLDESId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13411CILLDESId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13411CILLDESId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCILLDESId_Jsonclick, 0, "", "", "", "", "", 1, edtCILLDESId_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCIL000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol115( ) ;
      nGXsfl_115_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1837 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1837 = (short)(1) ;
            scanStart1O51837( ) ;
            while ( RcdFound1837 != 0 )
            {
               init_level_properties1837( ) ;
               getByPrimaryKey1O51837( ) ;
               addRow1O51837( ) ;
               scanNext1O51837( ) ;
            }
            scanEnd1O51837( ) ;
            nBlankRcdCount1837 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1O51837( ) ;
         standaloneModal1O51837( ) ;
         sMode1837 = Gx_mode ;
         while ( nGXsfl_115_idx < nRC_GXsfl_115 )
         {
            bGXsfl_115_Refreshing = true ;
            readRow1O51837( ) ;
            edtavnRcdDeleted_1837_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1837_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1837_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1837_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtCILId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILID_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILId_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtCILColor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILCOLOR_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILColor_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtCILMalla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILMALLA_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILMalla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILMalla_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtCILMedida_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILMEDIDA_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILMedida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILMedida_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtCILCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILCOB_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCob_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtCILPrecio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILPRECIO_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILPrecio_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            if ( ( nRcdExists_1837 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1O51837( ) ;
            }
            sendRow1O51837( ) ;
            bGXsfl_115_Refreshing = false ;
         }
         Gx_mode = sMode1837 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1837 = (short)(5) ;
         nRcdExists_1837 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1O51837( ) ;
            while ( RcdFound1837 != 0 )
            {
               sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1151837( ) ;
               init_level_properties1837( ) ;
               standaloneNotModal1O51837( ) ;
               getByPrimaryKey1O51837( ) ;
               standaloneModal1O51837( ) ;
               addRow1O51837( ) ;
               scanNext1O51837( ) ;
            }
            scanEnd1O51837( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1837 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1151837( ) ;
         initAll1O51837( ) ;
         init_level_properties1837( ) ;
         nRcdExists_1837 = (short)(0) ;
         nIsMod_1837 = (short)(0) ;
         nRcdDeleted_1837 = (short)(0) ;
         nBlankRcdCount1837 = (short)(nBlankRcdUsr1837+nBlankRcdCount1837) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1837 > 0 )
         {
            standaloneNotModal1O51837( ) ;
            standaloneModal1O51837( ) ;
            addRow1O51837( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCILId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1837 = (short)(nBlankRcdCount1837-1) ;
         }
         Gx_mode = sMode1837 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCIL000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCIL000.htm");
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
      e111O52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13388CILOGId = localUtil.ctol( httpContext.cgiGet( "Z13388CILOGId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z13398CILCliNom = httpContext.cgiGet( "Z13398CILCliNom") ;
            Z13389CILFecha = localUtil.ctod( httpContext.cgiGet( "Z13389CILFecha"), 0) ;
            Z13390CILFecEnt = localUtil.ctod( httpContext.cgiGet( "Z13390CILFecEnt"), 0) ;
            Z13391CILDIbCli = httpContext.cgiGet( "Z13391CILDIbCli") ;
            Z13392CILDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z13392CILDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13393CILRef = httpContext.cgiGet( "Z13393CILRef") ;
            Z13394CILRap = (short)(localUtil.ctol( httpContext.cgiGet( "Z13394CILRap"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13395CILCargo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13395CILCargo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13396CILObs = httpContext.cgiGet( "Z13396CILObs") ;
            Z13397CILClicod = (int)(localUtil.ctol( httpContext.cgiGet( "Z13397CILClicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13399CILEstado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13399CILEstado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13402CILNumCol = (short)(localUtil.ctol( httpContext.cgiGet( "Z13402CILNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13410CILTipMaq = httpContext.cgiGet( "Z13410CILTipMaq") ;
            Z13411CILLDESId = (int)(localUtil.ctol( httpContext.cgiGet( "Z13411CILLDESId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13400CILGrabCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z13400CILGrabCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_115 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34CILOGId = localUtil.ctol( httpContext.cgiGet( "vCILOGID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILOGId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILOGId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILOGID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILOGId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13388CILOGId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
            }
            else
            {
               A13388CILOGId = localUtil.ctol( httpContext.cgiGet( edtCILOGId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCILFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CILFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13389CILFecha = GXutil.nullDate() ;
               n13389CILFecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
            }
            else
            {
               A13389CILFecha = localUtil.ctod( httpContext.cgiGet( edtCILFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13389CILFecha = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCILFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CILFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13390CILFecEnt = GXutil.nullDate() ;
               n13390CILFecEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13390CILFecEnt", localUtil.format(A13390CILFecEnt, "99/99/99"));
            }
            else
            {
               A13390CILFecEnt = localUtil.ctod( httpContext.cgiGet( edtCILFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13390CILFecEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13390CILFecEnt", localUtil.format(A13390CILFecEnt, "99/99/99"));
            }
            A13391CILDIbCli = httpContext.cgiGet( edtCILDIbCli_Internalname) ;
            n13391CILDIbCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILDIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13392CILDibInt = 0 ;
               n13392CILDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
            }
            else
            {
               A13392CILDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtCILDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13392CILDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
            }
            A13393CILRef = httpContext.cgiGet( edtCILRef_Internalname) ;
            n13393CILRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILRap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILRap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILRAP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILRap_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13394CILRap = (short)(0) ;
               n13394CILRap = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13394CILRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13394CILRap), 4, 0));
            }
            else
            {
               A13394CILRap = (short)(localUtil.ctol( httpContext.cgiGet( edtCILRap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13394CILRap = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13394CILRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13394CILRap), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILCargo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILCargo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILCARGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILCargo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13395CILCargo = (byte)(0) ;
               n13395CILCargo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13395CILCargo", GXutil.str( A13395CILCargo, 1, 0));
            }
            else
            {
               A13395CILCargo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCILCargo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13395CILCargo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13395CILCargo", GXutil.str( A13395CILCargo, 1, 0));
            }
            A13396CILObs = httpContext.cgiGet( edtCILObs_Internalname) ;
            n13396CILObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13396CILObs", A13396CILObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILClicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13397CILClicod = 0 ;
               n13397CILClicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13397CILClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13397CILClicod), 6, 0));
            }
            else
            {
               A13397CILClicod = (int)(localUtil.ctol( httpContext.cgiGet( edtCILClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13397CILClicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13397CILClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13397CILClicod), 6, 0));
            }
            A13398CILCliNom = httpContext.cgiGet( edtCILCliNom_Internalname) ;
            n13398CILCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", A13398CILCliNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILEstado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13399CILEstado = (byte)(0) ;
               n13399CILEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
            }
            else
            {
               A13399CILEstado = (byte)(localUtil.ctol( httpContext.cgiGet( edtCILEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13399CILEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILGRABCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILGrabCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13400CILGrabCod = (short)(0) ;
               n13400CILGrabCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
            }
            else
            {
               A13400CILGrabCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCILGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13400CILGrabCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
            }
            A13409CILGrabNom = httpContext.cgiGet( edtCILGrabNom_Internalname) ;
            n13409CILGrabNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", A13409CILGrabNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13402CILNumCol = (short)(0) ;
               n13402CILNumCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13402CILNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13402CILNumCol), 4, 0));
            }
            else
            {
               A13402CILNumCol = (short)(localUtil.ctol( httpContext.cgiGet( edtCILNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13402CILNumCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13402CILNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13402CILNumCol), 4, 0));
            }
            cmbCILTipMaq.setName( cmbCILTipMaq.getInternalname() );
            cmbCILTipMaq.setValue( httpContext.cgiGet( cmbCILTipMaq.getInternalname()) );
            A13410CILTipMaq = httpContext.cgiGet( cmbCILTipMaq.getInternalname()) ;
            n13410CILTipMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13410CILTipMaq", A13410CILTipMaq);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCILLDESId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCILLDESId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CILLDESID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCILLDESId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13411CILLDESId = 0 ;
               n13411CILLDESId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
            }
            else
            {
               A13411CILLDESId = (int)(localUtil.ctol( httpContext.cgiGet( edtCILLDESId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13411CILLDESId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCIL000");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A13388CILOGId != Z13388CILOGId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcil000:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A13388CILOGId = GXutil.lval( httpContext.GetPar( "CILOGId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
               getEqualNoModal( ) ;
               if ( ! isIns( )  )
               {
                  A13388CILOGId = AV34CILOGId ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
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
                  sMode1836 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! isIns( )  )
                  {
                     A13388CILOGId = AV34CILOGId ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
                  }
                  Gx_mode = sMode1836 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1836 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1O50( ) ;
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
                        e111O52 ();
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
            initAll1O51836( ) ;
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
         disableAttributes1O51836( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1837_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1837_Enabled), 5, 0), !bGXsfl_115_Refreshing);
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

   public void confirm_1O50( )
   {
      beforeValidate1O51836( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1O51836( ) ;
         }
         else
         {
            checkExtendedTable1O51836( ) ;
            if ( AnyError == 0 )
            {
               zm1O51836( 18) ;
               zm1O51836( 19) ;
            }
            closeExtendedTableCursors1O51836( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1836 = Gx_mode ;
         confirm_1O51837( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1836 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1O50( ) ;
      }
   }

   public void confirm_1O51837( )
   {
      nGXsfl_115_idx = 0 ;
      while ( nGXsfl_115_idx < nRC_GXsfl_115 )
      {
         readRow1O51837( ) ;
         if ( ( nRcdExists_1837 != 0 ) || ( nIsMod_1837 != 0 ) )
         {
            getKey1O51837( ) ;
            if ( ( nRcdExists_1837 == 0 ) && ( nRcdDeleted_1837 == 0 ) )
            {
               if ( RcdFound1837 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1O51837( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1O51837( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1O51837( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CILID_" + sGXsfl_115_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCILId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1837 != 0 )
               {
                  if ( nRcdDeleted_1837 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1O51837( ) ;
                     load1O51837( ) ;
                     beforeValidate1O51837( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1O51837( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1837 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1O51837( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1O51837( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1O51837( ) ;
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
                  if ( nRcdDeleted_1837 == 0 )
                  {
                     GXCCtl = "CILID_" + sGXsfl_115_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCILId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1837_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCILId_Internalname, GXutil.rtrim( A13403CILId)) ;
         httpContext.changePostValue( edtCILColor_Internalname, GXutil.rtrim( A13404CILColor)) ;
         httpContext.changePostValue( edtCILMalla_Internalname, GXutil.rtrim( A13405CILMalla)) ;
         httpContext.changePostValue( edtCILMedida_Internalname, GXutil.rtrim( A13406CILMedida)) ;
         httpContext.changePostValue( edtCILCob_Internalname, GXutil.ltrim( localUtil.ntoc( A13407CILCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCILPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13408CILPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13403CILId_"+sGXsfl_115_idx, GXutil.rtrim( Z13403CILId)) ;
         httpContext.changePostValue( "ZT_"+"Z13404CILColor_"+sGXsfl_115_idx, GXutil.rtrim( Z13404CILColor)) ;
         httpContext.changePostValue( "ZT_"+"Z13405CILMalla_"+sGXsfl_115_idx, GXutil.rtrim( Z13405CILMalla)) ;
         httpContext.changePostValue( "ZT_"+"Z13406CILMedida_"+sGXsfl_115_idx, GXutil.rtrim( Z13406CILMedida)) ;
         httpContext.changePostValue( "ZT_"+"Z13407CILCob_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( Z13407CILCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13408CILPrecio_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( Z13408CILPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1837_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1837_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1837_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1837 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1837_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1837_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILID_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILCOLOR_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILColor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILMALLA_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMalla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILMEDIDA_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMedida_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILCOB_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILPRECIO_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILPrecio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1O50( )
   {
   }

   public void e111O52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcil000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tcil000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcil000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcil000_impl.this.A396EmprCod = GXv_char2[0] ;
      tcil000_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcil000_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33ExisteCont ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIL000", ""), GXv_int6) ;
      tcil000_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33ExisteCont = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ExisteCont", GXutil.str( AV33ExisteCont, 1, 0));
      if ( AV33ExisteCont == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta contador CIL000, N de Orden Grabacion", ""));
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,Long.valueOf(AV34CILOGId),Gx_mode});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV34CILOGId","Gx_mode"});
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

   public void zm1O51836( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13398CILCliNom = T01O55_A13398CILCliNom[0] ;
            Z13389CILFecha = T01O55_A13389CILFecha[0] ;
            Z13390CILFecEnt = T01O55_A13390CILFecEnt[0] ;
            Z13391CILDIbCli = T01O55_A13391CILDIbCli[0] ;
            Z13392CILDibInt = T01O55_A13392CILDibInt[0] ;
            Z13393CILRef = T01O55_A13393CILRef[0] ;
            Z13394CILRap = T01O55_A13394CILRap[0] ;
            Z13395CILCargo = T01O55_A13395CILCargo[0] ;
            Z13396CILObs = T01O55_A13396CILObs[0] ;
            Z13397CILClicod = T01O55_A13397CILClicod[0] ;
            Z13399CILEstado = T01O55_A13399CILEstado[0] ;
            Z13402CILNumCol = T01O55_A13402CILNumCol[0] ;
            Z13410CILTipMaq = T01O55_A13410CILTipMaq[0] ;
            Z13411CILLDESId = T01O55_A13411CILLDESId[0] ;
            Z13400CILGrabCod = T01O55_A13400CILGrabCod[0] ;
         }
         else
         {
            Z13398CILCliNom = A13398CILCliNom ;
            Z13389CILFecha = A13389CILFecha ;
            Z13390CILFecEnt = A13390CILFecEnt ;
            Z13391CILDIbCli = A13391CILDIbCli ;
            Z13392CILDibInt = A13392CILDibInt ;
            Z13393CILRef = A13393CILRef ;
            Z13394CILRap = A13394CILRap ;
            Z13395CILCargo = A13395CILCargo ;
            Z13396CILObs = A13396CILObs ;
            Z13397CILClicod = A13397CILClicod ;
            Z13399CILEstado = A13399CILEstado ;
            Z13402CILNumCol = A13402CILNumCol ;
            Z13410CILTipMaq = A13410CILTipMaq ;
            Z13411CILLDESId = A13411CILLDESId ;
            Z13400CILGrabCod = A13400CILGrabCod ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z13388CILOGId = A13388CILOGId ;
         Z13398CILCliNom = A13398CILCliNom ;
         Z13389CILFecha = A13389CILFecha ;
         Z13390CILFecEnt = A13390CILFecEnt ;
         Z13391CILDIbCli = A13391CILDIbCli ;
         Z13392CILDibInt = A13392CILDibInt ;
         Z13393CILRef = A13393CILRef ;
         Z13394CILRap = A13394CILRap ;
         Z13395CILCargo = A13395CILCargo ;
         Z13396CILObs = A13396CILObs ;
         Z13397CILClicod = A13397CILClicod ;
         Z13399CILEstado = A13399CILEstado ;
         Z13402CILNumCol = A13402CILNumCol ;
         Z13410CILTipMaq = A13410CILTipMaq ;
         Z13411CILLDESId = A13411CILLDESId ;
         Z396EmprCod = A396EmprCod ;
         Z13400CILGrabCod = A13400CILGrabCod ;
         Z407EmprNom = A407EmprNom ;
         Z13409CILGrabNom = A13409CILGrabNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV37Pgmname = "TCIL000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCILCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01O56 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O56_A407EmprNom[0] ;
      n407EmprNom = T01O56_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtCILOGId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILOGId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILOGId_Enabled), 5, 0), true);
      }
      else
      {
         edtCILOGId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILOGId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILOGId_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtCILOGId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILOGId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILOGId_Enabled), 5, 0), true);
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
         A13388CILOGId = AV34CILOGId ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13389CILFecha)) && ( Gx_BScreen == 0 ) )
      {
         A13389CILFecha = GXutil.today( ) ;
         n13389CILFecha = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
      }
      if ( isIns( )  && (0==A13399CILEstado) && ( Gx_BScreen == 0 ) )
      {
         A13399CILEstado = (byte)(0) ;
         n13399CILEstado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
      }
   }

   public void load1O51836( )
   {
      /* Using cursor T01O58 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1836 = (short)(1) ;
         A13398CILCliNom = T01O58_A13398CILCliNom[0] ;
         n13398CILCliNom = T01O58_n13398CILCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", A13398CILCliNom);
         A407EmprNom = T01O58_A407EmprNom[0] ;
         n407EmprNom = T01O58_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13389CILFecha = T01O58_A13389CILFecha[0] ;
         n13389CILFecha = T01O58_n13389CILFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
         A13390CILFecEnt = T01O58_A13390CILFecEnt[0] ;
         n13390CILFecEnt = T01O58_n13390CILFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13390CILFecEnt", localUtil.format(A13390CILFecEnt, "99/99/99"));
         A13391CILDIbCli = T01O58_A13391CILDIbCli[0] ;
         n13391CILDIbCli = T01O58_n13391CILDIbCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
         A13392CILDibInt = T01O58_A13392CILDibInt[0] ;
         n13392CILDibInt = T01O58_n13392CILDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
         A13393CILRef = T01O58_A13393CILRef[0] ;
         n13393CILRef = T01O58_n13393CILRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
         A13394CILRap = T01O58_A13394CILRap[0] ;
         n13394CILRap = T01O58_n13394CILRap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13394CILRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13394CILRap), 4, 0));
         A13395CILCargo = T01O58_A13395CILCargo[0] ;
         n13395CILCargo = T01O58_n13395CILCargo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13395CILCargo", GXutil.str( A13395CILCargo, 1, 0));
         A13396CILObs = T01O58_A13396CILObs[0] ;
         n13396CILObs = T01O58_n13396CILObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13396CILObs", A13396CILObs);
         A13397CILClicod = T01O58_A13397CILClicod[0] ;
         n13397CILClicod = T01O58_n13397CILClicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13397CILClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13397CILClicod), 6, 0));
         A13399CILEstado = T01O58_A13399CILEstado[0] ;
         n13399CILEstado = T01O58_n13399CILEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
         A13409CILGrabNom = T01O58_A13409CILGrabNom[0] ;
         n13409CILGrabNom = T01O58_n13409CILGrabNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", A13409CILGrabNom);
         A13402CILNumCol = T01O58_A13402CILNumCol[0] ;
         n13402CILNumCol = T01O58_n13402CILNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13402CILNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13402CILNumCol), 4, 0));
         A13410CILTipMaq = T01O58_A13410CILTipMaq[0] ;
         n13410CILTipMaq = T01O58_n13410CILTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13410CILTipMaq", A13410CILTipMaq);
         A13411CILLDESId = T01O58_A13411CILLDESId[0] ;
         n13411CILLDESId = T01O58_n13411CILLDESId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         A13400CILGrabCod = T01O58_A13400CILGrabCod[0] ;
         n13400CILGrabCod = T01O58_n13400CILGrabCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
         zm1O51836( -17) ;
      }
      pr_default.close(6);
      onLoadActions1O51836( ) ;
   }

   public void onLoadActions1O51836( )
   {
      if ( true )
      {
         edtCILCliNom_Enabled = ((A13395CILCargo==0) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
      }
      else
      {
         edtCILCliNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
      }
      edtCILClicod_Enabled = ((A13395CILCargo==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILClicod_Enabled), 5, 0), true);
   }

   public void checkExtendedTable1O51836( )
   {
      nIsDirty_1836 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01O57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n13400CILGrabCod), Short.valueOf(A13400CILGrabCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grabador", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CILGRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILGrabCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13409CILGrabNom = T01O57_A13409CILGrabNom[0] ;
      n13409CILGrabNom = T01O57_n13409CILGrabNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", A13409CILGrabNom);
      pr_default.close(5);
      if ( A13397CILClicod > 0 )
      {
         GXv_char4[0] = A13398CILCliNom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A13397CILClicod, GXv_char4) ;
         tcil000_impl.this.A13398CILCliNom = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", A13398CILCliNom);
      }
      if ( true )
      {
         edtCILCliNom_Enabled = ((A13395CILCargo==0) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
      }
      else
      {
         edtCILCliNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
      }
      edtCILClicod_Enabled = ((A13395CILCargo==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILClicod_Enabled), 5, 0), true);
      if ( ( GXutil.strcmp(A13398CILCliNom, httpContext.getMessage( "Error", "")) == 0 ) && ( A13397CILClicod > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Inexistente", ""), 1, "CILCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILClicod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A13411CILLDESId > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A13411CILLDESId ;
         GXv_char3[0] = AV35msg_err ;
         new app.pexlabdip(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
         tcil000_impl.this.A396EmprCod = GXv_char4[0] ;
         tcil000_impl.this.A13411CILLDESId = GXv_int7[0] ;
         tcil000_impl.this.AV35msg_err = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35msg_err", AV35msg_err);
      }
      if ( ( A13411CILLDESId > 0 ) && true /* After */ && (GXutil.strcmp("", AV35msg_err)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A13411CILLDESId ;
         GXv_int8[0] = A13400CILGrabCod ;
         GXv_char3[0] = A13391CILDIbCli ;
         GXv_int9[0] = A13392CILDibInt ;
         GXv_char2[0] = A13393CILRef ;
         new app.pdatlabdip(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int9, GXv_char2) ;
         tcil000_impl.this.A396EmprCod = GXv_char4[0] ;
         tcil000_impl.this.A13411CILLDESId = GXv_int7[0] ;
         tcil000_impl.this.A13400CILGrabCod = GXv_int8[0] ;
         tcil000_impl.this.A13391CILDIbCli = GXv_char3[0] ;
         tcil000_impl.this.A13392CILDibInt = GXv_int9[0] ;
         tcil000_impl.this.A13393CILRef = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
         httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
      }
      if ( ( A13411CILLDESId > 0 ) && true /* After */ && ( GXutil.strcmp(AV35msg_err, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV35msg_err, 1, "CILLDESID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILLDESId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1O51836( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          short A13400CILGrabCod )
   {
      /* Using cursor T01O59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n13400CILGrabCod), Short.valueOf(A13400CILGrabCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grabador", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CILGRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILGrabCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13409CILGrabNom = T01O59_A13409CILGrabNom[0] ;
      n13409CILGrabNom = T01O59_n13409CILGrabNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", A13409CILGrabNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13409CILGrabNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1O51836( )
   {
      /* Using cursor T01O510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1836 = (short)(1) ;
      }
      else
      {
         RcdFound1836 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01O55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01O55_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O51836( 17) ;
         RcdFound1836 = (short)(1) ;
         A13388CILOGId = T01O55_A13388CILOGId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
         A13398CILCliNom = T01O55_A13398CILCliNom[0] ;
         n13398CILCliNom = T01O55_n13398CILCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", A13398CILCliNom);
         A13389CILFecha = T01O55_A13389CILFecha[0] ;
         n13389CILFecha = T01O55_n13389CILFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
         A13390CILFecEnt = T01O55_A13390CILFecEnt[0] ;
         n13390CILFecEnt = T01O55_n13390CILFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13390CILFecEnt", localUtil.format(A13390CILFecEnt, "99/99/99"));
         A13391CILDIbCli = T01O55_A13391CILDIbCli[0] ;
         n13391CILDIbCli = T01O55_n13391CILDIbCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
         A13392CILDibInt = T01O55_A13392CILDibInt[0] ;
         n13392CILDibInt = T01O55_n13392CILDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
         A13393CILRef = T01O55_A13393CILRef[0] ;
         n13393CILRef = T01O55_n13393CILRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
         A13394CILRap = T01O55_A13394CILRap[0] ;
         n13394CILRap = T01O55_n13394CILRap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13394CILRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13394CILRap), 4, 0));
         A13395CILCargo = T01O55_A13395CILCargo[0] ;
         n13395CILCargo = T01O55_n13395CILCargo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13395CILCargo", GXutil.str( A13395CILCargo, 1, 0));
         A13396CILObs = T01O55_A13396CILObs[0] ;
         n13396CILObs = T01O55_n13396CILObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13396CILObs", A13396CILObs);
         A13397CILClicod = T01O55_A13397CILClicod[0] ;
         n13397CILClicod = T01O55_n13397CILClicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13397CILClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13397CILClicod), 6, 0));
         A13399CILEstado = T01O55_A13399CILEstado[0] ;
         n13399CILEstado = T01O55_n13399CILEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
         A13402CILNumCol = T01O55_A13402CILNumCol[0] ;
         n13402CILNumCol = T01O55_n13402CILNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13402CILNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13402CILNumCol), 4, 0));
         A13410CILTipMaq = T01O55_A13410CILTipMaq[0] ;
         n13410CILTipMaq = T01O55_n13410CILTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13410CILTipMaq", A13410CILTipMaq);
         A13411CILLDESId = T01O55_A13411CILLDESId[0] ;
         n13411CILLDESId = T01O55_n13411CILLDESId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         A13400CILGrabCod = T01O55_A13400CILGrabCod[0] ;
         n13400CILGrabCod = T01O55_n13400CILGrabCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13388CILOGId = A13388CILOGId ;
         sMode1836 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1O51836( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1836 = (short)(0) ;
            initializeNonKey1O51836( ) ;
         }
         Gx_mode = sMode1836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1836 = (short)(0) ;
         initializeNonKey1O51836( ) ;
         sMode1836 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1O51836( ) ;
      if ( RcdFound1836 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1836 = (short)(0) ;
      /* Using cursor T01O511 */
      pr_default.execute(9, new Object[] {Long.valueOf(A13388CILOGId), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01O511_A13388CILOGId[0] < A13388CILOGId ) ) && ( GXutil.strcmp(T01O511_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01O511_A13388CILOGId[0] > A13388CILOGId ) ) && ( GXutil.strcmp(T01O511_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13388CILOGId = T01O511_A13388CILOGId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
            RcdFound1836 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1836 = (short)(0) ;
      /* Using cursor T01O512 */
      pr_default.execute(10, new Object[] {Long.valueOf(A13388CILOGId), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01O512_A13388CILOGId[0] > A13388CILOGId ) ) && ( GXutil.strcmp(T01O512_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01O512_A13388CILOGId[0] < A13388CILOGId ) ) && ( GXutil.strcmp(T01O512_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13388CILOGId = T01O512_A13388CILOGId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
            RcdFound1836 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1O51836( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCILOGId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1O51836( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1836 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13388CILOGId != Z13388CILOGId ) )
            {
               A13388CILOGId = Z13388CILOGId ;
               httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCILOGId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1O51836( ) ;
               GX_FocusControl = edtCILOGId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13388CILOGId != Z13388CILOGId ) )
            {
               /* Insert record */
               GX_FocusControl = edtCILOGId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1O51836( ) ;
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
                  GX_FocusControl = edtCILOGId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1O51836( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13388CILOGId != Z13388CILOGId ) )
      {
         A13388CILOGId = Z13388CILOGId ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCILOGId_Internalname ;
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
      getKey1O51836( ) ;
      if ( RcdFound1836 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13388CILOGId != Z13388CILOGId ) )
         {
            A13388CILOGId = Z13388CILOGId ;
            httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13388CILOGId != Z13388CILOGId ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcil000");
      GX_FocusControl = edtCILFecha_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1O50( ) ;
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

   public void checkOptimisticConcurrency1O51836( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCIL000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z13398CILCliNom, T01O54_A13398CILCliNom[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13389CILFecha), GXutil.resetTime(T01O54_A13389CILFecha[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z13390CILFecEnt), GXutil.resetTime(T01O54_A13390CILFecEnt[0])) ) || ( GXutil.strcmp(Z13391CILDIbCli, T01O54_A13391CILDIbCli[0]) != 0 ) || ( Z13392CILDibInt != T01O54_A13392CILDibInt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13393CILRef, T01O54_A13393CILRef[0]) != 0 ) || ( Z13394CILRap != T01O54_A13394CILRap[0] ) || ( Z13395CILCargo != T01O54_A13395CILCargo[0] ) || ( GXutil.strcmp(Z13396CILObs, T01O54_A13396CILObs[0]) != 0 ) || ( Z13397CILClicod != T01O54_A13397CILClicod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13399CILEstado != T01O54_A13399CILEstado[0] ) || ( Z13402CILNumCol != T01O54_A13402CILNumCol[0] ) || ( GXutil.strcmp(Z13410CILTipMaq, T01O54_A13410CILTipMaq[0]) != 0 ) || ( Z13411CILLDESId != T01O54_A13411CILLDESId[0] ) || ( Z13400CILGrabCod != T01O54_A13400CILGrabCod[0] ) )
         {
            if ( GXutil.strcmp(Z13398CILCliNom, T01O54_A13398CILCliNom[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILCliNom");
               GXutil.writeLogRaw("Old: ",Z13398CILCliNom);
               GXutil.writeLogRaw("Current: ",T01O54_A13398CILCliNom[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13389CILFecha), GXutil.resetTime(T01O54_A13389CILFecha[0])) ) )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILFecha");
               GXutil.writeLogRaw("Old: ",Z13389CILFecha);
               GXutil.writeLogRaw("Current: ",T01O54_A13389CILFecha[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13390CILFecEnt), GXutil.resetTime(T01O54_A13390CILFecEnt[0])) ) )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILFecEnt");
               GXutil.writeLogRaw("Old: ",Z13390CILFecEnt);
               GXutil.writeLogRaw("Current: ",T01O54_A13390CILFecEnt[0]);
            }
            if ( GXutil.strcmp(Z13391CILDIbCli, T01O54_A13391CILDIbCli[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILDIbCli");
               GXutil.writeLogRaw("Old: ",Z13391CILDIbCli);
               GXutil.writeLogRaw("Current: ",T01O54_A13391CILDIbCli[0]);
            }
            if ( Z13392CILDibInt != T01O54_A13392CILDibInt[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILDibInt");
               GXutil.writeLogRaw("Old: ",Z13392CILDibInt);
               GXutil.writeLogRaw("Current: ",T01O54_A13392CILDibInt[0]);
            }
            if ( GXutil.strcmp(Z13393CILRef, T01O54_A13393CILRef[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILRef");
               GXutil.writeLogRaw("Old: ",Z13393CILRef);
               GXutil.writeLogRaw("Current: ",T01O54_A13393CILRef[0]);
            }
            if ( Z13394CILRap != T01O54_A13394CILRap[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILRap");
               GXutil.writeLogRaw("Old: ",Z13394CILRap);
               GXutil.writeLogRaw("Current: ",T01O54_A13394CILRap[0]);
            }
            if ( Z13395CILCargo != T01O54_A13395CILCargo[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILCargo");
               GXutil.writeLogRaw("Old: ",Z13395CILCargo);
               GXutil.writeLogRaw("Current: ",T01O54_A13395CILCargo[0]);
            }
            if ( GXutil.strcmp(Z13396CILObs, T01O54_A13396CILObs[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILObs");
               GXutil.writeLogRaw("Old: ",Z13396CILObs);
               GXutil.writeLogRaw("Current: ",T01O54_A13396CILObs[0]);
            }
            if ( Z13397CILClicod != T01O54_A13397CILClicod[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILClicod");
               GXutil.writeLogRaw("Old: ",Z13397CILClicod);
               GXutil.writeLogRaw("Current: ",T01O54_A13397CILClicod[0]);
            }
            if ( Z13399CILEstado != T01O54_A13399CILEstado[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILEstado");
               GXutil.writeLogRaw("Old: ",Z13399CILEstado);
               GXutil.writeLogRaw("Current: ",T01O54_A13399CILEstado[0]);
            }
            if ( Z13402CILNumCol != T01O54_A13402CILNumCol[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILNumCol");
               GXutil.writeLogRaw("Old: ",Z13402CILNumCol);
               GXutil.writeLogRaw("Current: ",T01O54_A13402CILNumCol[0]);
            }
            if ( GXutil.strcmp(Z13410CILTipMaq, T01O54_A13410CILTipMaq[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILTipMaq");
               GXutil.writeLogRaw("Old: ",Z13410CILTipMaq);
               GXutil.writeLogRaw("Current: ",T01O54_A13410CILTipMaq[0]);
            }
            if ( Z13411CILLDESId != T01O54_A13411CILLDESId[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILLDESId");
               GXutil.writeLogRaw("Old: ",Z13411CILLDESId);
               GXutil.writeLogRaw("Current: ",T01O54_A13411CILLDESId[0]);
            }
            if ( Z13400CILGrabCod != T01O54_A13400CILGrabCod[0] )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILGrabCod");
               GXutil.writeLogRaw("Old: ",Z13400CILGrabCod);
               GXutil.writeLogRaw("Current: ",T01O54_A13400CILGrabCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCIL000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O51836( )
   {
      beforeValidate1O51836( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O51836( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O51836( 0) ;
         checkOptimisticConcurrency1O51836( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O51836( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O51836( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O513 */
                  pr_default.execute(11, new Object[] {Long.valueOf(A13388CILOGId), Boolean.valueOf(n13398CILCliNom), A13398CILCliNom, Boolean.valueOf(n13389CILFecha), A13389CILFecha, Boolean.valueOf(n13390CILFecEnt), A13390CILFecEnt, Boolean.valueOf(n13391CILDIbCli), A13391CILDIbCli, Boolean.valueOf(n13392CILDibInt), Integer.valueOf(A13392CILDibInt), Boolean.valueOf(n13393CILRef), A13393CILRef, Boolean.valueOf(n13394CILRap), Short.valueOf(A13394CILRap), Boolean.valueOf(n13395CILCargo), Byte.valueOf(A13395CILCargo), Boolean.valueOf(n13396CILObs), A13396CILObs, Boolean.valueOf(n13397CILClicod), Integer.valueOf(A13397CILClicod), Boolean.valueOf(n13399CILEstado), Byte.valueOf(A13399CILEstado), Boolean.valueOf(n13402CILNumCol), Short.valueOf(A13402CILNumCol), Boolean.valueOf(n13410CILTipMaq), A13410CILTipMaq, Boolean.valueOf(n13411CILLDESId), Integer.valueOf(A13411CILLDESId), A396EmprCod, Boolean.valueOf(n13400CILGrabCod), Short.valueOf(A13400CILGrabCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL000");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A13388CILOGId ;
                        GXv_int9[0] = A13411CILLDESId ;
                        new app.ppeqlabdip(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9) ;
                        tcil000_impl.this.A396EmprCod = GXv_char4[0] ;
                        tcil000_impl.this.A13388CILOGId = GXv_int10[0] ;
                        tcil000_impl.this.A13411CILLDESId = GXv_int9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O51836( ) ;
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
            load1O51836( ) ;
         }
         endLevel1O51836( ) ;
      }
      closeExtendedTableCursors1O51836( ) ;
   }

   public void update1O51836( )
   {
      beforeValidate1O51836( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O51836( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O51836( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O51836( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1O51836( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O514 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n13398CILCliNom), A13398CILCliNom, Boolean.valueOf(n13389CILFecha), A13389CILFecha, Boolean.valueOf(n13390CILFecEnt), A13390CILFecEnt, Boolean.valueOf(n13391CILDIbCli), A13391CILDIbCli, Boolean.valueOf(n13392CILDibInt), Integer.valueOf(A13392CILDibInt), Boolean.valueOf(n13393CILRef), A13393CILRef, Boolean.valueOf(n13394CILRap), Short.valueOf(A13394CILRap), Boolean.valueOf(n13395CILCargo), Byte.valueOf(A13395CILCargo), Boolean.valueOf(n13396CILObs), A13396CILObs, Boolean.valueOf(n13397CILClicod), Integer.valueOf(A13397CILClicod), Boolean.valueOf(n13399CILEstado), Byte.valueOf(A13399CILEstado), Boolean.valueOf(n13402CILNumCol), Short.valueOf(A13402CILNumCol), Boolean.valueOf(n13410CILTipMaq), A13410CILTipMaq, Boolean.valueOf(n13411CILLDESId), Integer.valueOf(A13411CILLDESId), Boolean.valueOf(n13400CILGrabCod), Short.valueOf(A13400CILGrabCod), A396EmprCod, Long.valueOf(A13388CILOGId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL000");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCIL000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1O51836( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O51836( ) ;
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
         endLevel1O51836( ) ;
      }
      closeExtendedTableCursors1O51836( ) ;
   }

   public void deferredUpdate1O51836( )
   {
   }

   public void delete( )
   {
      beforeValidate1O51836( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O51836( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O51836( ) ;
         afterConfirm1O51836( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O51836( ) ;
            if ( AnyError == 0 )
            {
               scanStart1O51837( ) ;
               while ( RcdFound1837 != 0 )
               {
                  getByPrimaryKey1O51837( ) ;
                  delete1O51837( ) ;
                  scanNext1O51837( ) ;
               }
               scanEnd1O51837( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O515 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL000");
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
      sMode1836 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O51836( ) ;
      Gx_mode = sMode1836 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O51836( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true )
         {
            edtCILCliNom_Enabled = ((A13395CILCargo==0) ? 0 : 1) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
         }
         else
         {
            edtCILCliNom_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
         }
         edtCILClicod_Enabled = ((A13395CILCargo==0) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILClicod_Enabled), 5, 0), true);
         /* Using cursor T01O516 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n13400CILGrabCod), Short.valueOf(A13400CILGrabCod)});
         A13409CILGrabNom = T01O516_A13409CILGrabNom[0] ;
         n13409CILGrabNom = T01O516_n13409CILGrabNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", A13409CILGrabNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1O51837( )
   {
      nGXsfl_115_idx = 0 ;
      while ( nGXsfl_115_idx < nRC_GXsfl_115 )
      {
         readRow1O51837( ) ;
         if ( ( nRcdExists_1837 != 0 ) || ( nIsMod_1837 != 0 ) )
         {
            standaloneNotModal1O51837( ) ;
            getKey1O51837( ) ;
            if ( ( nRcdExists_1837 == 0 ) && ( nRcdDeleted_1837 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1O51837( ) ;
            }
            else
            {
               if ( RcdFound1837 != 0 )
               {
                  if ( ( nRcdDeleted_1837 != 0 ) && ( nRcdExists_1837 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1O51837( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1837 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1O51837( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1837 == 0 )
                  {
                     GXCCtl = "CILID_" + sGXsfl_115_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCILId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1837_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCILId_Internalname, GXutil.rtrim( A13403CILId)) ;
         httpContext.changePostValue( edtCILColor_Internalname, GXutil.rtrim( A13404CILColor)) ;
         httpContext.changePostValue( edtCILMalla_Internalname, GXutil.rtrim( A13405CILMalla)) ;
         httpContext.changePostValue( edtCILMedida_Internalname, GXutil.rtrim( A13406CILMedida)) ;
         httpContext.changePostValue( edtCILCob_Internalname, GXutil.ltrim( localUtil.ntoc( A13407CILCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCILPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13408CILPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13403CILId_"+sGXsfl_115_idx, GXutil.rtrim( Z13403CILId)) ;
         httpContext.changePostValue( "ZT_"+"Z13404CILColor_"+sGXsfl_115_idx, GXutil.rtrim( Z13404CILColor)) ;
         httpContext.changePostValue( "ZT_"+"Z13405CILMalla_"+sGXsfl_115_idx, GXutil.rtrim( Z13405CILMalla)) ;
         httpContext.changePostValue( "ZT_"+"Z13406CILMedida_"+sGXsfl_115_idx, GXutil.rtrim( Z13406CILMedida)) ;
         httpContext.changePostValue( "ZT_"+"Z13407CILCob_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( Z13407CILCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13408CILPrecio_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( Z13408CILPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1837_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1837_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1837_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1837 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1837_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1837_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILID_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILCOLOR_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILColor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILMALLA_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMalla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILMEDIDA_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMedida_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILCOB_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CILPRECIO_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILPrecio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1O51837( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1837 = (short)(0) ;
      nIsMod_1837 = (short)(0) ;
      nRcdDeleted_1837 = (short)(0) ;
   }

   public void processLevel1O51836( )
   {
      /* Save parent mode. */
      sMode1836 = Gx_mode ;
      processNestedLevel1O51837( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1836 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1O51836( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1O51836( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcil000");
         if ( AnyError == 0 )
         {
            confirmValues1O50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcil000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1O51836( )
   {
      /* Scan By routine */
      /* Using cursor T01O517 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound1836 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1836 = (short)(1) ;
         A13388CILOGId = T01O517_A13388CILOGId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O51836( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1836 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1836 = (short)(1) ;
         A13388CILOGId = T01O517_A13388CILOGId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
      }
   }

   public void scanEnd1O51836( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1O51836( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A13391CILDIbCli)==0) && (0==A13392CILDibInt) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Es obligatorio un valor en Dibujo Cliente o Interno", ""), 1, "CILDIBCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILDIbCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( isIns( )  && (0==A13388CILOGId) && true /* Level */ && true /* After */ )
      {
         GXv_int9[0] = (int)(A13388CILOGId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIL000", ""), GXv_int9) ;
         tcil000_impl.this.A13388CILOGId = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
      }
   }

   public void beforeInsert1O51836( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O51836( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O51836( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O51836( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O51836( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O51836( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCILOGId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILOGId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILOGId_Enabled), 5, 0), true);
      edtCILFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILFecha_Enabled), 5, 0), true);
      edtCILFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILFecEnt_Enabled), 5, 0), true);
      edtCILDIbCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILDIbCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILDIbCli_Enabled), 5, 0), true);
      edtCILDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILDibInt_Enabled), 5, 0), true);
      edtCILRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILRef_Enabled), 5, 0), true);
      edtCILRap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILRap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILRap_Enabled), 5, 0), true);
      edtCILCargo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILCargo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCargo_Enabled), 5, 0), true);
      edtCILObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILObs_Enabled), 5, 0), true);
      edtCILClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILClicod_Enabled), 5, 0), true);
      edtCILCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCliNom_Enabled), 5, 0), true);
      edtCILEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILEstado_Enabled), 5, 0), true);
      edtCILGrabCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILGrabCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILGrabCod_Enabled), 5, 0), true);
      edtCILGrabNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILGrabNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILGrabNom_Enabled), 5, 0), true);
      edtCILNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILNumCol_Enabled), 5, 0), true);
      cmbCILTipMaq.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCILTipMaq.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCILTipMaq.getEnabled(), 5, 0), true);
      edtCILLDESId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILLDESId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILLDESId_Enabled), 5, 0), true);
   }

   public void zm1O51837( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13404CILColor = T01O53_A13404CILColor[0] ;
            Z13405CILMalla = T01O53_A13405CILMalla[0] ;
            Z13406CILMedida = T01O53_A13406CILMedida[0] ;
            Z13407CILCob = T01O53_A13407CILCob[0] ;
            Z13408CILPrecio = T01O53_A13408CILPrecio[0] ;
         }
         else
         {
            Z13404CILColor = A13404CILColor ;
            Z13405CILMalla = A13405CILMalla ;
            Z13406CILMedida = A13406CILMedida ;
            Z13407CILCob = A13407CILCob ;
            Z13408CILPrecio = A13408CILPrecio ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13388CILOGId = A13388CILOGId ;
         Z13403CILId = A13403CILId ;
         Z13404CILColor = A13404CILColor ;
         Z13405CILMalla = A13405CILMalla ;
         Z13406CILMedida = A13406CILMedida ;
         Z13407CILCob = A13407CILCob ;
         Z13408CILPrecio = A13408CILPrecio ;
      }
   }

   public void standaloneNotModal1O51837( )
   {
   }

   public void standaloneModal1O51837( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCILId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILId_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      }
      else
      {
         edtCILId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCILId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILId_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      }
   }

   public void load1O51837( )
   {
      /* Using cursor T01O518 */
      pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1837 = (short)(1) ;
         A13404CILColor = T01O518_A13404CILColor[0] ;
         n13404CILColor = T01O518_n13404CILColor[0] ;
         A13405CILMalla = T01O518_A13405CILMalla[0] ;
         n13405CILMalla = T01O518_n13405CILMalla[0] ;
         A13406CILMedida = T01O518_A13406CILMedida[0] ;
         n13406CILMedida = T01O518_n13406CILMedida[0] ;
         A13407CILCob = T01O518_A13407CILCob[0] ;
         n13407CILCob = T01O518_n13407CILCob[0] ;
         A13408CILPrecio = T01O518_A13408CILPrecio[0] ;
         n13408CILPrecio = T01O518_n13408CILPrecio[0] ;
         zm1O51837( -20) ;
      }
      pr_default.close(16);
      onLoadActions1O51837( ) ;
   }

   public void onLoadActions1O51837( )
   {
   }

   public void checkExtendedTable1O51837( )
   {
      nIsDirty_1837 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1O51837( ) ;
      if ( true /* Level */ && (GXutil.strcmp("", A13403CILId)==0) )
      {
         GXCCtl = "CILID_" + sGXsfl_115_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1O51837( )
   {
   }

   public void enableDisable1O51837( )
   {
   }

   public void getKey1O51837( )
   {
      /* Using cursor T01O519 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1837 = (short)(1) ;
      }
      else
      {
         RcdFound1837 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1O51837( )
   {
      /* Using cursor T01O53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01O53_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O51837( 20) ;
         RcdFound1837 = (short)(1) ;
         initializeNonKey1O51837( ) ;
         A13403CILId = T01O53_A13403CILId[0] ;
         A13404CILColor = T01O53_A13404CILColor[0] ;
         n13404CILColor = T01O53_n13404CILColor[0] ;
         A13405CILMalla = T01O53_A13405CILMalla[0] ;
         n13405CILMalla = T01O53_n13405CILMalla[0] ;
         A13406CILMedida = T01O53_A13406CILMedida[0] ;
         n13406CILMedida = T01O53_n13406CILMedida[0] ;
         A13407CILCob = T01O53_A13407CILCob[0] ;
         n13407CILCob = T01O53_n13407CILCob[0] ;
         A13408CILPrecio = T01O53_A13408CILPrecio[0] ;
         n13408CILPrecio = T01O53_n13408CILPrecio[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13388CILOGId = A13388CILOGId ;
         Z13403CILId = A13403CILId ;
         sMode1837 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1O51837( ) ;
         Gx_mode = sMode1837 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1837 = (short)(0) ;
         initializeNonKey1O51837( ) ;
         sMode1837 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O51837( ) ;
         Gx_mode = sMode1837 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1O51837( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1O51837( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCIL001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13404CILColor, T01O52_A13404CILColor[0]) != 0 ) || ( GXutil.strcmp(Z13405CILMalla, T01O52_A13405CILMalla[0]) != 0 ) || ( GXutil.strcmp(Z13406CILMedida, T01O52_A13406CILMedida[0]) != 0 ) || ( DecimalUtil.compareTo(Z13407CILCob, T01O52_A13407CILCob[0]) != 0 ) || ( DecimalUtil.compareTo(Z13408CILPrecio, T01O52_A13408CILPrecio[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13404CILColor, T01O52_A13404CILColor[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILColor");
               GXutil.writeLogRaw("Old: ",Z13404CILColor);
               GXutil.writeLogRaw("Current: ",T01O52_A13404CILColor[0]);
            }
            if ( GXutil.strcmp(Z13405CILMalla, T01O52_A13405CILMalla[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILMalla");
               GXutil.writeLogRaw("Old: ",Z13405CILMalla);
               GXutil.writeLogRaw("Current: ",T01O52_A13405CILMalla[0]);
            }
            if ( GXutil.strcmp(Z13406CILMedida, T01O52_A13406CILMedida[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILMedida");
               GXutil.writeLogRaw("Old: ",Z13406CILMedida);
               GXutil.writeLogRaw("Current: ",T01O52_A13406CILMedida[0]);
            }
            if ( DecimalUtil.compareTo(Z13407CILCob, T01O52_A13407CILCob[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILCob");
               GXutil.writeLogRaw("Old: ",Z13407CILCob);
               GXutil.writeLogRaw("Current: ",T01O52_A13407CILCob[0]);
            }
            if ( DecimalUtil.compareTo(Z13408CILPrecio, T01O52_A13408CILPrecio[0]) != 0 )
            {
               GXutil.writeLogln("tcil000:[seudo value changed for attri]"+"CILPrecio");
               GXutil.writeLogRaw("Old: ",Z13408CILPrecio);
               GXutil.writeLogRaw("Current: ",T01O52_A13408CILPrecio[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCIL001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O51837( )
   {
      beforeValidate1O51837( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O51837( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O51837( 0) ;
         checkOptimisticConcurrency1O51837( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O51837( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O51837( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O520 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId, Boolean.valueOf(n13404CILColor), A13404CILColor, Boolean.valueOf(n13405CILMalla), A13405CILMalla, Boolean.valueOf(n13406CILMedida), A13406CILMedida, Boolean.valueOf(n13407CILCob), A13407CILCob, Boolean.valueOf(n13408CILPrecio), A13408CILPrecio});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL001");
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
            load1O51837( ) ;
         }
         endLevel1O51837( ) ;
      }
      closeExtendedTableCursors1O51837( ) ;
   }

   public void update1O51837( )
   {
      beforeValidate1O51837( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O51837( ) ;
      }
      if ( ( nIsMod_1837 != 0 ) || ( nIsDirty_1837 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1O51837( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1O51837( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1O51837( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01O521 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n13404CILColor), A13404CILColor, Boolean.valueOf(n13405CILMalla), A13405CILMalla, Boolean.valueOf(n13406CILMedida), A13406CILMedida, Boolean.valueOf(n13407CILCob), A13407CILCob, Boolean.valueOf(n13408CILPrecio), A13408CILPrecio, A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL001");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCIL001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1O51837( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1O51837( ) ;
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
            endLevel1O51837( ) ;
         }
      }
      closeExtendedTableCursors1O51837( ) ;
   }

   public void deferredUpdate1O51837( )
   {
   }

   public void delete1O51837( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O51837( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O51837( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O51837( ) ;
         afterConfirm1O51837( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O51837( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01O522 */
               pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL001");
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
      sMode1837 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O51837( ) ;
      Gx_mode = sMode1837 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O51837( )
   {
      standaloneModal1O51837( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1O51837( )
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

   public void scanStart1O51837( )
   {
      /* Scan By routine */
      /* Using cursor T01O523 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId)});
      RcdFound1837 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1837 = (short)(1) ;
         A13403CILId = T01O523_A13403CILId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O51837( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1837 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1837 = (short)(1) ;
         A13403CILId = T01O523_A13403CILId[0] ;
      }
   }

   public void scanEnd1O51837( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1O51837( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O51837( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O51837( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O51837( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O51837( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O51837( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O51837( )
   {
      edtCILId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILId_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      edtCILColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILColor_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      edtCILMalla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILMalla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILMalla_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      edtCILMedida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILMedida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILMedida_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      edtCILCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILCob_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      edtCILPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILPrecio_Enabled), 5, 0), !bGXsfl_115_Refreshing);
   }

   public void send_integrity_lvl_hashes1O51837( )
   {
   }

   public void send_integrity_lvl_hashes1O51836( )
   {
   }

   public void subsflControlProps_1151837( )
   {
      edtavnRcdDeleted_1837_Internalname = "vNRCDDELETED_1837_"+sGXsfl_115_idx ;
      edtCILId_Internalname = "CILID_"+sGXsfl_115_idx ;
      edtCILColor_Internalname = "CILCOLOR_"+sGXsfl_115_idx ;
      edtCILMalla_Internalname = "CILMALLA_"+sGXsfl_115_idx ;
      edtCILMedida_Internalname = "CILMEDIDA_"+sGXsfl_115_idx ;
      edtCILCob_Internalname = "CILCOB_"+sGXsfl_115_idx ;
      edtCILPrecio_Internalname = "CILPRECIO_"+sGXsfl_115_idx ;
   }

   public void subsflControlProps_fel_1151837( )
   {
      edtavnRcdDeleted_1837_Internalname = "vNRCDDELETED_1837_"+sGXsfl_115_fel_idx ;
      edtCILId_Internalname = "CILID_"+sGXsfl_115_fel_idx ;
      edtCILColor_Internalname = "CILCOLOR_"+sGXsfl_115_fel_idx ;
      edtCILMalla_Internalname = "CILMALLA_"+sGXsfl_115_fel_idx ;
      edtCILMedida_Internalname = "CILMEDIDA_"+sGXsfl_115_fel_idx ;
      edtCILCob_Internalname = "CILCOB_"+sGXsfl_115_fel_idx ;
      edtCILPrecio_Internalname = "CILPRECIO_"+sGXsfl_115_fel_idx ;
   }

   public void addRow1O51837( )
   {
      nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1151837( ) ;
      sendRow1O51837( ) ;
   }

   public void sendRow1O51837( )
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
         if ( ((int)((nGXsfl_115_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1837_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1837_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1837), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1837), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1837_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1837_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCILId_Internalname,GXutil.rtrim( A13403CILId),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCILId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCILId_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCILColor_Internalname,GXutil.rtrim( A13404CILColor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCILColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCILColor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCILMalla_Internalname,GXutil.rtrim( A13405CILMalla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCILMalla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCILMalla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCILMedida_Internalname,GXutil.rtrim( A13406CILMedida),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCILMedida_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCILMedida_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCILCob_Internalname,GXutil.ltrim( localUtil.ntoc( A13407CILCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCILCob_Enabled!=0) ? localUtil.format( A13407CILCob, "ZZ9.99") : localUtil.format( A13407CILCob, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,121);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCILCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCILCob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1837_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCILPrecio_Internalname,GXutil.ltrim( localUtil.ntoc( A13408CILPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCILPrecio_Enabled!=0) ? localUtil.format( A13408CILPrecio, "ZZZZZZ9.999") : localUtil.format( A13408CILPrecio, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCILPrecio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCILPrecio_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1O51837( ) ;
      GXCCtl = "Z13403CILId_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13403CILId));
      GXCCtl = "Z13404CILColor_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13404CILColor));
      GXCCtl = "Z13405CILMalla_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13405CILMalla));
      GXCCtl = "Z13406CILMedida_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13406CILMedida));
      GXCCtl = "Z13407CILCob_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13407CILCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13408CILPrecio_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13408CILPrecio, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1837_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1837_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1837_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1837, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCILOGID_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34CILOGId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1837_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1837_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CILID_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CILCOLOR_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILColor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CILMALLA_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMalla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CILMEDIDA_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMedida_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CILCOB_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CILPRECIO_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCILPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1O51837( )
   {
      nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1151837( ) ;
      edtavnRcdDeleted_1837_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1837_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCILId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILID_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCILColor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILCOLOR_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCILMalla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILMALLA_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCILMedida_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILMEDIDA_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCILCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILCOB_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCILPrecio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CILPRECIO_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1837_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1837_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1837");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1837_Internalname ;
         wbErr = true ;
         nRcdDeleted_1837 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1837 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1837_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13403CILId = httpContext.cgiGet( edtCILId_Internalname) ;
      A13404CILColor = httpContext.cgiGet( edtCILColor_Internalname) ;
      n13404CILColor = false ;
      A13405CILMalla = httpContext.cgiGet( edtCILMalla_Internalname) ;
      n13405CILMalla = false ;
      A13406CILMedida = httpContext.cgiGet( edtCILMedida_Internalname) ;
      n13406CILMedida = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCILCob_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCILCob_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "CILCOB_" + sGXsfl_115_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILCob_Internalname ;
         wbErr = true ;
         A13407CILCob = DecimalUtil.ZERO ;
         n13407CILCob = false ;
      }
      else
      {
         A13407CILCob = localUtil.ctond( httpContext.cgiGet( edtCILCob_Internalname)) ;
         n13407CILCob = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCILPrecio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCILPrecio_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "CILPRECIO_" + sGXsfl_115_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILPrecio_Internalname ;
         wbErr = true ;
         A13408CILPrecio = DecimalUtil.ZERO ;
         n13408CILPrecio = false ;
      }
      else
      {
         A13408CILPrecio = localUtil.ctond( httpContext.cgiGet( edtCILPrecio_Internalname)) ;
         n13408CILPrecio = false ;
      }
      GXCCtl = "Z13403CILId_" + sGXsfl_115_idx ;
      Z13403CILId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13404CILColor_" + sGXsfl_115_idx ;
      Z13404CILColor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13405CILMalla_" + sGXsfl_115_idx ;
      Z13405CILMalla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13406CILMedida_" + sGXsfl_115_idx ;
      Z13406CILMedida = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13407CILCob_" + sGXsfl_115_idx ;
      Z13407CILCob = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13408CILPrecio_" + sGXsfl_115_idx ;
      Z13408CILPrecio = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1837_" + sGXsfl_115_idx ;
      nRcdDeleted_1837 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1837_" + sGXsfl_115_idx ;
      nRcdExists_1837 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1837_" + sGXsfl_115_idx ;
      nIsMod_1837 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCILId_Enabled = edtCILId_Enabled ;
   }

   public void confirmValues1O50( )
   {
      nGXsfl_115_idx = 0 ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1151837( ) ;
      while ( nGXsfl_115_idx < nRC_GXsfl_115 )
      {
         nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1151837( ) ;
         httpContext.changePostValue( "Z13403CILId_"+sGXsfl_115_idx, httpContext.cgiGet( "ZT_"+"Z13403CILId_"+sGXsfl_115_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13403CILId_"+sGXsfl_115_idx) ;
         httpContext.changePostValue( "Z13404CILColor_"+sGXsfl_115_idx, httpContext.cgiGet( "ZT_"+"Z13404CILColor_"+sGXsfl_115_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13404CILColor_"+sGXsfl_115_idx) ;
         httpContext.changePostValue( "Z13405CILMalla_"+sGXsfl_115_idx, httpContext.cgiGet( "ZT_"+"Z13405CILMalla_"+sGXsfl_115_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13405CILMalla_"+sGXsfl_115_idx) ;
         httpContext.changePostValue( "Z13406CILMedida_"+sGXsfl_115_idx, httpContext.cgiGet( "ZT_"+"Z13406CILMedida_"+sGXsfl_115_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13406CILMedida_"+sGXsfl_115_idx) ;
         httpContext.changePostValue( "Z13407CILCob_"+sGXsfl_115_idx, httpContext.cgiGet( "ZT_"+"Z13407CILCob_"+sGXsfl_115_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13407CILCob_"+sGXsfl_115_idx) ;
         httpContext.changePostValue( "Z13408CILPrecio_"+sGXsfl_115_idx, httpContext.cgiGet( "ZT_"+"Z13408CILPrecio_"+sGXsfl_115_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13408CILPrecio_"+sGXsfl_115_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcil000", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34CILOGId,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","CILOGId","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCIL000");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcil000:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13388CILOGId", GXutil.ltrim( localUtil.ntoc( Z13388CILOGId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13398CILCliNom", GXutil.rtrim( Z13398CILCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13389CILFecha", localUtil.dtoc( Z13389CILFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13390CILFecEnt", localUtil.dtoc( Z13390CILFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13391CILDIbCli", GXutil.rtrim( Z13391CILDIbCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13392CILDibInt", GXutil.ltrim( localUtil.ntoc( Z13392CILDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13393CILRef", GXutil.rtrim( Z13393CILRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13394CILRap", GXutil.ltrim( localUtil.ntoc( Z13394CILRap, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13395CILCargo", GXutil.ltrim( localUtil.ntoc( Z13395CILCargo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13396CILObs", Z13396CILObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13397CILClicod", GXutil.ltrim( localUtil.ntoc( Z13397CILClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13399CILEstado", GXutil.ltrim( localUtil.ntoc( Z13399CILEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13402CILNumCol", GXutil.ltrim( localUtil.ntoc( Z13402CILNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13410CILTipMaq", GXutil.rtrim( Z13410CILTipMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13411CILLDESId", GXutil.ltrim( localUtil.ntoc( Z13411CILLDESId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13400CILGrabCod", GXutil.ltrim( localUtil.ntoc( Z13400CILGrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_115", GXutil.ltrim( localUtil.ntoc( nGXsfl_115_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vCILOGID", GXutil.ltrim( localUtil.ntoc( AV34CILOGId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV35msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
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
      return formatLink("app.tcil000", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34CILOGId,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","CILOGId","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TCIL000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Orden de GRabacion CILINDROS", "") ;
   }

   public void initializeNonKey1O51836( )
   {
      A13398CILCliNom = "" ;
      n13398CILCliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", A13398CILCliNom);
      AV35msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35msg_err", AV35msg_err);
      A13390CILFecEnt = GXutil.nullDate() ;
      n13390CILFecEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13390CILFecEnt", localUtil.format(A13390CILFecEnt, "99/99/99"));
      A13391CILDIbCli = "" ;
      n13391CILDIbCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
      A13392CILDibInt = 0 ;
      n13392CILDibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
      A13393CILRef = "" ;
      n13393CILRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
      A13394CILRap = (short)(0) ;
      n13394CILRap = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13394CILRap", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13394CILRap), 4, 0));
      A13395CILCargo = (byte)(0) ;
      n13395CILCargo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13395CILCargo", GXutil.str( A13395CILCargo, 1, 0));
      A13396CILObs = "" ;
      n13396CILObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13396CILObs", A13396CILObs);
      A13397CILClicod = 0 ;
      n13397CILClicod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13397CILClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13397CILClicod), 6, 0));
      A13400CILGrabCod = (short)(0) ;
      n13400CILGrabCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
      A13409CILGrabNom = "" ;
      n13409CILGrabNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", A13409CILGrabNom);
      A13402CILNumCol = (short)(0) ;
      n13402CILNumCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13402CILNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13402CILNumCol), 4, 0));
      A13410CILTipMaq = "" ;
      n13410CILTipMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13410CILTipMaq", A13410CILTipMaq);
      A13411CILLDESId = 0 ;
      n13411CILLDESId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
      A13389CILFecha = GXutil.today( ) ;
      n13389CILFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
      A13399CILEstado = (byte)(0) ;
      n13399CILEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
      Z13398CILCliNom = "" ;
      Z13389CILFecha = GXutil.nullDate() ;
      Z13390CILFecEnt = GXutil.nullDate() ;
      Z13391CILDIbCli = "" ;
      Z13392CILDibInt = 0 ;
      Z13393CILRef = "" ;
      Z13394CILRap = (short)(0) ;
      Z13395CILCargo = (byte)(0) ;
      Z13396CILObs = "" ;
      Z13397CILClicod = 0 ;
      Z13399CILEstado = (byte)(0) ;
      Z13402CILNumCol = (short)(0) ;
      Z13410CILTipMaq = "" ;
      Z13411CILLDESId = 0 ;
      Z13400CILGrabCod = (short)(0) ;
   }

   public void initAll1O51836( )
   {
      A13388CILOGId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
      initializeNonKey1O51836( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13389CILFecha = i13389CILFecha ;
      n13389CILFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13389CILFecha", localUtil.format(A13389CILFecha, "99/99/99"));
      A13399CILEstado = i13399CILEstado ;
      n13399CILEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13399CILEstado", GXutil.str( A13399CILEstado, 1, 0));
   }

   public void initializeNonKey1O51837( )
   {
      A13404CILColor = "" ;
      n13404CILColor = false ;
      A13405CILMalla = "" ;
      n13405CILMalla = false ;
      A13406CILMedida = "" ;
      n13406CILMedida = false ;
      A13407CILCob = DecimalUtil.ZERO ;
      n13407CILCob = false ;
      A13408CILPrecio = DecimalUtil.ZERO ;
      n13408CILPrecio = false ;
      Z13404CILColor = "" ;
      Z13405CILMalla = "" ;
      Z13406CILMedida = "" ;
      Z13407CILCob = DecimalUtil.ZERO ;
      Z13408CILPrecio = DecimalUtil.ZERO ;
   }

   public void initAll1O51837( )
   {
      A13403CILId = "" ;
      initializeNonKey1O51837( ) ;
   }

   public void standaloneModalInsert1O51837( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415103414", true, true);
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
      httpContext.AddJavascriptSource("tcil000.js", "?202682415103414", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1837( )
   {
      edtCILId_Enabled = defedtCILId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCILId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCILId_Enabled), 5, 0), !bGXsfl_115_Refreshing);
   }

   public void startgridcontrol115( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1837, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1837_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13403CILId));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCILId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13404CILColor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCILColor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13405CILMalla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMalla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13406CILMedida));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCILMedida_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13407CILCob, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCILCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13408CILPrecio, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCILPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCILOGId_Internalname = "CILOGID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCILFecha_Internalname = "CILFECHA" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCILFecEnt_Internalname = "CILFECENT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCILDIbCli_Internalname = "CILDIBCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCILDibInt_Internalname = "CILDIBINT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCILRef_Internalname = "CILREF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCILRap_Internalname = "CILRAP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCILCargo_Internalname = "CILCARGO" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCILObs_Internalname = "CILOBS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCILClicod_Internalname = "CILCLICOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtCILCliNom_Internalname = "CILCLINOM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCILEstado_Internalname = "CILESTADO" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtCILGrabCod_Internalname = "CILGRABCOD" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtCILGrabNom_Internalname = "CILGRABNOM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtCILNumCol_Internalname = "CILNUMCOL" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      cmbCILTipMaq.setInternalname( "CILTIPMAQ" );
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtCILLDESId_Internalname = "CILLDESID" ;
      edtavnRcdDeleted_1837_Internalname = "vNRCDDELETED_1837" ;
      edtCILId_Internalname = "CILID" ;
      edtCILColor_Internalname = "CILCOLOR" ;
      edtCILMalla_Internalname = "CILMALLA" ;
      edtCILMedida_Internalname = "CILMEDIDA" ;
      edtCILCob_Internalname = "CILCOB" ;
      edtCILPrecio_Internalname = "CILPRECIO" ;
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
      Form.setCaption( httpContext.getMessage( "Orden de GRabacion CILINDROS", "") );
      edtCILPrecio_Jsonclick = "" ;
      edtCILCob_Jsonclick = "" ;
      edtCILMedida_Jsonclick = "" ;
      edtCILMalla_Jsonclick = "" ;
      edtCILColor_Jsonclick = "" ;
      edtCILId_Jsonclick = "" ;
      edtavnRcdDeleted_1837_Jsonclick = "" ;
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
      edtCILPrecio_Enabled = 1 ;
      edtCILCob_Enabled = 1 ;
      edtCILMedida_Enabled = 1 ;
      edtCILMalla_Enabled = 1 ;
      edtCILColor_Enabled = 1 ;
      edtCILId_Enabled = 1 ;
      edtavnRcdDeleted_1837_Enabled = 1 ;
      edtCILLDESId_Jsonclick = "" ;
      edtCILLDESId_Backcolor = (int)(0xFFFFFF) ;
      edtCILLDESId_Enabled = 1 ;
      cmbCILTipMaq.setJsonclick( "" );
      cmbCILTipMaq.setEnabled( 1 );
      cmbCILTipMaq.setIBackground( (int)(0xFFFFFF) );
      edtCILNumCol_Jsonclick = "" ;
      edtCILNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtCILNumCol_Enabled = 1 ;
      edtCILGrabNom_Jsonclick = "" ;
      edtCILGrabNom_Backcolor = (int)(0xFFFFFF) ;
      edtCILGrabNom_Enabled = 0 ;
      edtCILGrabCod_Jsonclick = "" ;
      edtCILGrabCod_Backcolor = (int)(0xFFFFFF) ;
      edtCILGrabCod_Enabled = 1 ;
      edtCILEstado_Jsonclick = "" ;
      edtCILEstado_Backcolor = (int)(0xFFFFFF) ;
      edtCILEstado_Enabled = 1 ;
      edtCILCliNom_Jsonclick = "" ;
      edtCILCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCILCliNom_Enabled = 0 ;
      edtCILClicod_Jsonclick = "" ;
      edtCILClicod_Backcolor = (int)(0xFFFFFF) ;
      edtCILClicod_Enabled = 1 ;
      edtCILObs_Backcolor = (int)(0xFFFFFF) ;
      edtCILObs_Enabled = 1 ;
      edtCILCargo_Jsonclick = "" ;
      edtCILCargo_Backcolor = (int)(0xFFFFFF) ;
      edtCILCargo_Enabled = 1 ;
      edtCILRap_Jsonclick = "" ;
      edtCILRap_Backcolor = (int)(0xFFFFFF) ;
      edtCILRap_Enabled = 1 ;
      edtCILRef_Jsonclick = "" ;
      edtCILRef_Backcolor = (int)(0xFFFFFF) ;
      edtCILRef_Enabled = 1 ;
      edtCILDibInt_Jsonclick = "" ;
      edtCILDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtCILDibInt_Enabled = 1 ;
      edtCILDIbCli_Jsonclick = "" ;
      edtCILDIbCli_Backcolor = (int)(0xFFFFFF) ;
      edtCILDIbCli_Enabled = 1 ;
      edtCILFecEnt_Jsonclick = "" ;
      edtCILFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtCILFecEnt_Enabled = 1 ;
      edtCILFecha_Jsonclick = "" ;
      edtCILFecha_Backcolor = (int)(0xFFFFFF) ;
      edtCILFecha_Enabled = 1 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtCILOGId_Jsonclick = "" ;
      edtCILOGId_Backcolor = (int)(0xFFFFFF) ;
      edtCILOGId_Enabled = 1 ;
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

   public void xc_8_1O51836( )
   {
      if ( isIns( )  && (0==A13388CILOGId) && true /* Level */ && true /* After */ )
      {
         GXv_int9[0] = (int)(A13388CILOGId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CIL000", ""), GXv_int9) ;
         A13388CILOGId = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
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

   public void xc_9_1O51836( String A396EmprCod ,
                             int A13397CILClicod )
   {
      if ( A13397CILClicod > 0 )
      {
         GXv_char4[0] = A13398CILCliNom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A13397CILClicod, GXv_char4) ;
         A13398CILCliNom = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", A13398CILCliNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13398CILCliNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_1O51836( String A396EmprCod ,
                              int A13411CILLDESId ,
                              String AV35msg_err )
   {
      if ( ( A13411CILLDESId > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A13411CILLDESId ;
         GXv_char3[0] = AV35msg_err ;
         new app.pexlabdip(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A13411CILLDESId = GXv_int9[0] ;
         AV35msg_err = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35msg_err", AV35msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13411CILLDESId, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV35msg_err))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_11_1O51836( String A396EmprCod ,
                              int A13411CILLDESId ,
                              short A13400CILGrabCod ,
                              String A13391CILDIbCli ,
                              int A13392CILDibInt ,
                              String A13393CILRef ,
                              String AV35msg_err )
   {
      if ( ( A13411CILLDESId > 0 ) && true /* After */ && (GXutil.strcmp("", AV35msg_err)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A13411CILLDESId ;
         GXv_int8[0] = A13400CILGrabCod ;
         GXv_char3[0] = A13391CILDIbCli ;
         GXv_int7[0] = A13392CILDibInt ;
         GXv_char2[0] = A13393CILRef ;
         new app.pdatlabdip(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int7, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A13411CILLDESId = GXv_int9[0] ;
         A13400CILGrabCod = GXv_int8[0] ;
         A13391CILDIbCli = GXv_char3[0] ;
         A13392CILDibInt = GXv_int7[0] ;
         A13393CILRef = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13400CILGrabCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", A13391CILDIbCli);
         httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13392CILDibInt), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", A13393CILRef);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13411CILLDESId, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13400CILGrabCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13391CILDIbCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13392CILDibInt, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13393CILRef))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_1O51836( String A396EmprCod ,
                              long A13388CILOGId ,
                              int A13411CILLDESId )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A13388CILOGId ;
         GXv_int9[0] = A13411CILLDESId ;
         new app.ppeqlabdip(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int9) ;
         A396EmprCod = GXv_char4[0] ;
         A13388CILOGId = GXv_int10[0] ;
         A13411CILLDESId = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13388CILOGId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13388CILOGId), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13411CILLDESId), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13388CILOGId, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13411CILLDESId, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_1151837( ) ;
      while ( nGXsfl_115_idx <= nRC_GXsfl_115 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1O51837( ) ;
         standaloneModal1O51837( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1O51837( ) ;
         nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1151837( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbCILTipMaq.setName( "CILTIPMAQ" );
      cmbCILTipMaq.setWebtags( "" );
      cmbCILTipMaq.addItem("R", httpContext.getMessage( "R", ""), (short)(0));
      cmbCILTipMaq.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      cmbCILTipMaq.addItem("D", httpContext.getMessage( "D", ""), (short)(0));
      if ( cmbCILTipMaq.getItemCount() > 0 )
      {
         A13410CILTipMaq = cmbCILTipMaq.getValidValue(A13410CILTipMaq) ;
         n13410CILTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13410CILTipMaq", A13410CILTipMaq);
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

   public void valid_Cilclicod( )
   {
      n13397CILClicod = false ;
      n13398CILCliNom = false ;
      if ( A13397CILClicod > 0 )
      {
         GXv_char4[0] = A13398CILCliNom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A13397CILClicod, GXv_char4) ;
         tcil000_impl.this.A13398CILCliNom = GXv_char4[0] ;
         A13398CILCliNom = this.A13398CILCliNom ;
      }
      if ( ( GXutil.strcmp(A13398CILCliNom, httpContext.getMessage( "Error", "")) == 0 ) && ( A13397CILClicod > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Inexistente", ""), 1, "CILCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILClicod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13398CILCliNom", GXutil.rtrim( A13398CILCliNom));
   }

   public void valid_Cilgrabcod( )
   {
      n13400CILGrabCod = false ;
      n13409CILGrabNom = false ;
      /* Using cursor T01O516 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n13400CILGrabCod), Short.valueOf(A13400CILGrabCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grabador", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CILGRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILGrabCod_Internalname ;
      }
      A13409CILGrabNom = T01O516_A13409CILGrabNom[0] ;
      n13409CILGrabNom = T01O516_n13409CILGrabNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13409CILGrabNom", GXutil.rtrim( A13409CILGrabNom));
   }

   public void valid_Cilldesid( )
   {
      n13393CILRef = false ;
      n13392CILDibInt = false ;
      n13391CILDIbCli = false ;
      n13400CILGrabCod = false ;
      n13411CILLDESId = false ;
      if ( ( A13411CILLDESId > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A13411CILLDESId ;
         GXv_char3[0] = AV35msg_err ;
         new app.pexlabdip(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
         tcil000_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcil000_impl.this.A13411CILLDESId = GXv_int9[0] ;
         A13411CILLDESId = this.A13411CILLDESId ;
         tcil000_impl.this.AV35msg_err = GXv_char3[0] ;
         AV35msg_err = this.AV35msg_err ;
      }
      if ( ( A13411CILLDESId > 0 ) && true /* After */ && (GXutil.strcmp("", AV35msg_err)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A13411CILLDESId ;
         GXv_int8[0] = A13400CILGrabCod ;
         GXv_char3[0] = A13391CILDIbCli ;
         GXv_int7[0] = A13392CILDibInt ;
         GXv_char2[0] = A13393CILRef ;
         new app.pdatlabdip(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int7, GXv_char2) ;
         tcil000_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcil000_impl.this.A13411CILLDESId = GXv_int9[0] ;
         A13411CILLDESId = this.A13411CILLDESId ;
         tcil000_impl.this.A13400CILGrabCod = GXv_int8[0] ;
         A13400CILGrabCod = this.A13400CILGrabCod ;
         tcil000_impl.this.A13391CILDIbCli = GXv_char3[0] ;
         A13391CILDIbCli = this.A13391CILDIbCli ;
         tcil000_impl.this.A13392CILDibInt = GXv_int7[0] ;
         A13392CILDibInt = this.A13392CILDibInt ;
         tcil000_impl.this.A13393CILRef = GXv_char2[0] ;
         A13393CILRef = this.A13393CILRef ;
      }
      if ( ( A13411CILLDESId > 0 ) && true /* After */ && ( GXutil.strcmp(AV35msg_err, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV35msg_err, 1, "CILLDESID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILLDESId_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35msg_err", GXutil.rtrim( AV35msg_err));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13411CILLDESId", GXutil.ltrim( localUtil.ntoc( A13411CILLDESId, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13400CILGrabCod", GXutil.ltrim( localUtil.ntoc( A13400CILGrabCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13391CILDIbCli", GXutil.rtrim( A13391CILDIbCli));
      httpContext.ajax_rsp_assign_attri("", false, "A13392CILDibInt", GXutil.ltrim( localUtil.ntoc( A13392CILDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13393CILRef", GXutil.rtrim( A13393CILRef));
   }

   public void valid_Cilid( )
   {
      if ( true /* Level */ && (GXutil.strcmp("", A13403CILId)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, "CILID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCILId_Internalname ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV34CILOGId',fld:'vCILOGID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CILOGID","{handler:'valid_Cilogid',iparms:[]");
      setEventMetadata("VALID_CILOGID",",oparms:[]}");
      setEventMetadata("VALID_CILDIBCLI","{handler:'valid_Cildibcli',iparms:[]");
      setEventMetadata("VALID_CILDIBCLI",",oparms:[]}");
      setEventMetadata("VALID_CILDIBINT","{handler:'valid_Cildibint',iparms:[]");
      setEventMetadata("VALID_CILDIBINT",",oparms:[]}");
      setEventMetadata("VALID_CILCARGO","{handler:'valid_Cilcargo',iparms:[]");
      setEventMetadata("VALID_CILCARGO",",oparms:[]}");
      setEventMetadata("VALID_CILCLICOD","{handler:'valid_Cilclicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13397CILClicod',fld:'CILCLICOD',pic:'ZZZZZ9'},{av:'A13398CILCliNom',fld:'CILCLINOM',pic:''}]");
      setEventMetadata("VALID_CILCLICOD",",oparms:[{av:'A13398CILCliNom',fld:'CILCLINOM',pic:''}]}");
      setEventMetadata("VALID_CILCLINOM","{handler:'valid_Cilclinom',iparms:[]");
      setEventMetadata("VALID_CILCLINOM",",oparms:[]}");
      setEventMetadata("VALID_CILGRABCOD","{handler:'valid_Cilgrabcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13400CILGrabCod',fld:'CILGRABCOD',pic:'ZZZ9'},{av:'A13409CILGrabNom',fld:'CILGRABNOM',pic:''}]");
      setEventMetadata("VALID_CILGRABCOD",",oparms:[{av:'A13409CILGrabNom',fld:'CILGRABNOM',pic:''}]}");
      setEventMetadata("VALID_CILLDESID","{handler:'valid_Cilldesid',iparms:[{av:'A13393CILRef',fld:'CILREF',pic:''},{av:'A13392CILDibInt',fld:'CILDIBINT',pic:'ZZZZZZZ9'},{av:'A13391CILDIbCli',fld:'CILDIBCLI',pic:''},{av:'A13400CILGrabCod',fld:'CILGRABCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13411CILLDESId',fld:'CILLDESID',pic:'ZZZZZZZ9'},{av:'AV35msg_err',fld:'vMSG_ERR',pic:''}]");
      setEventMetadata("VALID_CILLDESID",",oparms:[{av:'AV35msg_err',fld:'vMSG_ERR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13411CILLDESId',fld:'CILLDESID',pic:'ZZZZZZZ9'},{av:'A13400CILGrabCod',fld:'CILGRABCOD',pic:'ZZZ9'},{av:'A13391CILDIbCli',fld:'CILDIBCLI',pic:''},{av:'A13392CILDibInt',fld:'CILDIBINT',pic:'ZZZZZZZ9'},{av:'A13393CILRef',fld:'CILREF',pic:''}]}");
      setEventMetadata("VALID_CILID","{handler:'valid_Cilid',iparms:[{av:'A13403CILId',fld:'CILID',pic:''}]");
      setEventMetadata("VALID_CILID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cilprecio',iparms:[]");
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
      Z13398CILCliNom = "" ;
      Z13389CILFecha = GXutil.nullDate() ;
      Z13390CILFecEnt = GXutil.nullDate() ;
      Z13391CILDIbCli = "" ;
      Z13393CILRef = "" ;
      Z13396CILObs = "" ;
      Z13410CILTipMaq = "" ;
      Z13403CILId = "" ;
      Z13404CILColor = "" ;
      Z13405CILMalla = "" ;
      Z13406CILMedida = "" ;
      Z13407CILCob = DecimalUtil.ZERO ;
      Z13408CILPrecio = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV35msg_err = "" ;
      A13391CILDIbCli = "" ;
      A13393CILRef = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13410CILTipMaq = "" ;
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
      A13389CILFecha = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      A13390CILFecEnt = GXutil.nullDate() ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13396CILObs = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A13398CILCliNom = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A13409CILGrabNom = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1837 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1836 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A13403CILId = "" ;
      A13404CILColor = "" ;
      A13405CILMalla = "" ;
      A13406CILMedida = "" ;
      A13407CILCob = DecimalUtil.ZERO ;
      A13408CILPrecio = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      Z407EmprNom = "" ;
      Z13409CILGrabNom = "" ;
      T01O56_A407EmprNom = new String[] {""} ;
      T01O56_n407EmprNom = new boolean[] {false} ;
      T01O58_A13388CILOGId = new long[1] ;
      T01O58_A13398CILCliNom = new String[] {""} ;
      T01O58_n13398CILCliNom = new boolean[] {false} ;
      T01O58_A407EmprNom = new String[] {""} ;
      T01O58_n407EmprNom = new boolean[] {false} ;
      T01O58_A13389CILFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01O58_n13389CILFecha = new boolean[] {false} ;
      T01O58_A13390CILFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01O58_n13390CILFecEnt = new boolean[] {false} ;
      T01O58_A13391CILDIbCli = new String[] {""} ;
      T01O58_n13391CILDIbCli = new boolean[] {false} ;
      T01O58_A13392CILDibInt = new int[1] ;
      T01O58_n13392CILDibInt = new boolean[] {false} ;
      T01O58_A13393CILRef = new String[] {""} ;
      T01O58_n13393CILRef = new boolean[] {false} ;
      T01O58_A13394CILRap = new short[1] ;
      T01O58_n13394CILRap = new boolean[] {false} ;
      T01O58_A13395CILCargo = new byte[1] ;
      T01O58_n13395CILCargo = new boolean[] {false} ;
      T01O58_A13396CILObs = new String[] {""} ;
      T01O58_n13396CILObs = new boolean[] {false} ;
      T01O58_A13397CILClicod = new int[1] ;
      T01O58_n13397CILClicod = new boolean[] {false} ;
      T01O58_A13399CILEstado = new byte[1] ;
      T01O58_n13399CILEstado = new boolean[] {false} ;
      T01O58_A13409CILGrabNom = new String[] {""} ;
      T01O58_n13409CILGrabNom = new boolean[] {false} ;
      T01O58_A13402CILNumCol = new short[1] ;
      T01O58_n13402CILNumCol = new boolean[] {false} ;
      T01O58_A13410CILTipMaq = new String[] {""} ;
      T01O58_n13410CILTipMaq = new boolean[] {false} ;
      T01O58_A13411CILLDESId = new int[1] ;
      T01O58_n13411CILLDESId = new boolean[] {false} ;
      T01O58_A396EmprCod = new String[] {""} ;
      T01O58_A13400CILGrabCod = new short[1] ;
      T01O58_n13400CILGrabCod = new boolean[] {false} ;
      T01O57_A13409CILGrabNom = new String[] {""} ;
      T01O57_n13409CILGrabNom = new boolean[] {false} ;
      T01O59_A13409CILGrabNom = new String[] {""} ;
      T01O59_n13409CILGrabNom = new boolean[] {false} ;
      T01O510_A396EmprCod = new String[] {""} ;
      T01O510_A13388CILOGId = new long[1] ;
      T01O55_A13388CILOGId = new long[1] ;
      T01O55_A13398CILCliNom = new String[] {""} ;
      T01O55_n13398CILCliNom = new boolean[] {false} ;
      T01O55_A13389CILFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01O55_n13389CILFecha = new boolean[] {false} ;
      T01O55_A13390CILFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01O55_n13390CILFecEnt = new boolean[] {false} ;
      T01O55_A13391CILDIbCli = new String[] {""} ;
      T01O55_n13391CILDIbCli = new boolean[] {false} ;
      T01O55_A13392CILDibInt = new int[1] ;
      T01O55_n13392CILDibInt = new boolean[] {false} ;
      T01O55_A13393CILRef = new String[] {""} ;
      T01O55_n13393CILRef = new boolean[] {false} ;
      T01O55_A13394CILRap = new short[1] ;
      T01O55_n13394CILRap = new boolean[] {false} ;
      T01O55_A13395CILCargo = new byte[1] ;
      T01O55_n13395CILCargo = new boolean[] {false} ;
      T01O55_A13396CILObs = new String[] {""} ;
      T01O55_n13396CILObs = new boolean[] {false} ;
      T01O55_A13397CILClicod = new int[1] ;
      T01O55_n13397CILClicod = new boolean[] {false} ;
      T01O55_A13399CILEstado = new byte[1] ;
      T01O55_n13399CILEstado = new boolean[] {false} ;
      T01O55_A13402CILNumCol = new short[1] ;
      T01O55_n13402CILNumCol = new boolean[] {false} ;
      T01O55_A13410CILTipMaq = new String[] {""} ;
      T01O55_n13410CILTipMaq = new boolean[] {false} ;
      T01O55_A13411CILLDESId = new int[1] ;
      T01O55_n13411CILLDESId = new boolean[] {false} ;
      T01O55_A396EmprCod = new String[] {""} ;
      T01O55_A13400CILGrabCod = new short[1] ;
      T01O55_n13400CILGrabCod = new boolean[] {false} ;
      T01O511_A396EmprCod = new String[] {""} ;
      T01O511_A13388CILOGId = new long[1] ;
      T01O512_A396EmprCod = new String[] {""} ;
      T01O512_A13388CILOGId = new long[1] ;
      T01O54_A13388CILOGId = new long[1] ;
      T01O54_A13398CILCliNom = new String[] {""} ;
      T01O54_n13398CILCliNom = new boolean[] {false} ;
      T01O54_A13389CILFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01O54_n13389CILFecha = new boolean[] {false} ;
      T01O54_A13390CILFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01O54_n13390CILFecEnt = new boolean[] {false} ;
      T01O54_A13391CILDIbCli = new String[] {""} ;
      T01O54_n13391CILDIbCli = new boolean[] {false} ;
      T01O54_A13392CILDibInt = new int[1] ;
      T01O54_n13392CILDibInt = new boolean[] {false} ;
      T01O54_A13393CILRef = new String[] {""} ;
      T01O54_n13393CILRef = new boolean[] {false} ;
      T01O54_A13394CILRap = new short[1] ;
      T01O54_n13394CILRap = new boolean[] {false} ;
      T01O54_A13395CILCargo = new byte[1] ;
      T01O54_n13395CILCargo = new boolean[] {false} ;
      T01O54_A13396CILObs = new String[] {""} ;
      T01O54_n13396CILObs = new boolean[] {false} ;
      T01O54_A13397CILClicod = new int[1] ;
      T01O54_n13397CILClicod = new boolean[] {false} ;
      T01O54_A13399CILEstado = new byte[1] ;
      T01O54_n13399CILEstado = new boolean[] {false} ;
      T01O54_A13402CILNumCol = new short[1] ;
      T01O54_n13402CILNumCol = new boolean[] {false} ;
      T01O54_A13410CILTipMaq = new String[] {""} ;
      T01O54_n13410CILTipMaq = new boolean[] {false} ;
      T01O54_A13411CILLDESId = new int[1] ;
      T01O54_n13411CILLDESId = new boolean[] {false} ;
      T01O54_A396EmprCod = new String[] {""} ;
      T01O54_A13400CILGrabCod = new short[1] ;
      T01O54_n13400CILGrabCod = new boolean[] {false} ;
      T01O516_A13409CILGrabNom = new String[] {""} ;
      T01O516_n13409CILGrabNom = new boolean[] {false} ;
      T01O517_A396EmprCod = new String[] {""} ;
      T01O517_A13388CILOGId = new long[1] ;
      T01O518_A396EmprCod = new String[] {""} ;
      T01O518_A13388CILOGId = new long[1] ;
      T01O518_A13403CILId = new String[] {""} ;
      T01O518_A13404CILColor = new String[] {""} ;
      T01O518_n13404CILColor = new boolean[] {false} ;
      T01O518_A13405CILMalla = new String[] {""} ;
      T01O518_n13405CILMalla = new boolean[] {false} ;
      T01O518_A13406CILMedida = new String[] {""} ;
      T01O518_n13406CILMedida = new boolean[] {false} ;
      T01O518_A13407CILCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O518_n13407CILCob = new boolean[] {false} ;
      T01O518_A13408CILPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O518_n13408CILPrecio = new boolean[] {false} ;
      T01O519_A396EmprCod = new String[] {""} ;
      T01O519_A13388CILOGId = new long[1] ;
      T01O519_A13403CILId = new String[] {""} ;
      T01O53_A396EmprCod = new String[] {""} ;
      T01O53_A13388CILOGId = new long[1] ;
      T01O53_A13403CILId = new String[] {""} ;
      T01O53_A13404CILColor = new String[] {""} ;
      T01O53_n13404CILColor = new boolean[] {false} ;
      T01O53_A13405CILMalla = new String[] {""} ;
      T01O53_n13405CILMalla = new boolean[] {false} ;
      T01O53_A13406CILMedida = new String[] {""} ;
      T01O53_n13406CILMedida = new boolean[] {false} ;
      T01O53_A13407CILCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O53_n13407CILCob = new boolean[] {false} ;
      T01O53_A13408CILPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O53_n13408CILPrecio = new boolean[] {false} ;
      T01O52_A396EmprCod = new String[] {""} ;
      T01O52_A13388CILOGId = new long[1] ;
      T01O52_A13403CILId = new String[] {""} ;
      T01O52_A13404CILColor = new String[] {""} ;
      T01O52_n13404CILColor = new boolean[] {false} ;
      T01O52_A13405CILMalla = new String[] {""} ;
      T01O52_n13405CILMalla = new boolean[] {false} ;
      T01O52_A13406CILMedida = new String[] {""} ;
      T01O52_n13406CILMedida = new boolean[] {false} ;
      T01O52_A13407CILCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O52_n13407CILCob = new boolean[] {false} ;
      T01O52_A13408CILPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O52_n13408CILPrecio = new boolean[] {false} ;
      T01O523_A396EmprCod = new String[] {""} ;
      T01O523_A13388CILOGId = new long[1] ;
      T01O523_A13403CILId = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13389CILFecha = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int10 = new long[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      ZV35msg_err = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcil000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcil000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcil000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcil000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcil000__default(),
         new Object[] {
             new Object[] {
            T01O52_A396EmprCod, T01O52_A13388CILOGId, T01O52_A13403CILId, T01O52_A13404CILColor, T01O52_n13404CILColor, T01O52_A13405CILMalla, T01O52_n13405CILMalla, T01O52_A13406CILMedida, T01O52_n13406CILMedida, T01O52_A13407CILCob,
            T01O52_n13407CILCob, T01O52_A13408CILPrecio, T01O52_n13408CILPrecio
            }
            , new Object[] {
            T01O53_A396EmprCod, T01O53_A13388CILOGId, T01O53_A13403CILId, T01O53_A13404CILColor, T01O53_n13404CILColor, T01O53_A13405CILMalla, T01O53_n13405CILMalla, T01O53_A13406CILMedida, T01O53_n13406CILMedida, T01O53_A13407CILCob,
            T01O53_n13407CILCob, T01O53_A13408CILPrecio, T01O53_n13408CILPrecio
            }
            , new Object[] {
            T01O54_A13388CILOGId, T01O54_A13398CILCliNom, T01O54_n13398CILCliNom, T01O54_A13389CILFecha, T01O54_n13389CILFecha, T01O54_A13390CILFecEnt, T01O54_n13390CILFecEnt, T01O54_A13391CILDIbCli, T01O54_n13391CILDIbCli, T01O54_A13392CILDibInt,
            T01O54_n13392CILDibInt, T01O54_A13393CILRef, T01O54_n13393CILRef, T01O54_A13394CILRap, T01O54_n13394CILRap, T01O54_A13395CILCargo, T01O54_n13395CILCargo, T01O54_A13396CILObs, T01O54_n13396CILObs, T01O54_A13397CILClicod,
            T01O54_n13397CILClicod, T01O54_A13399CILEstado, T01O54_n13399CILEstado, T01O54_A13402CILNumCol, T01O54_n13402CILNumCol, T01O54_A13410CILTipMaq, T01O54_n13410CILTipMaq, T01O54_A13411CILLDESId, T01O54_n13411CILLDESId, T01O54_A396EmprCod,
            T01O54_A13400CILGrabCod, T01O54_n13400CILGrabCod
            }
            , new Object[] {
            T01O55_A13388CILOGId, T01O55_A13398CILCliNom, T01O55_n13398CILCliNom, T01O55_A13389CILFecha, T01O55_n13389CILFecha, T01O55_A13390CILFecEnt, T01O55_n13390CILFecEnt, T01O55_A13391CILDIbCli, T01O55_n13391CILDIbCli, T01O55_A13392CILDibInt,
            T01O55_n13392CILDibInt, T01O55_A13393CILRef, T01O55_n13393CILRef, T01O55_A13394CILRap, T01O55_n13394CILRap, T01O55_A13395CILCargo, T01O55_n13395CILCargo, T01O55_A13396CILObs, T01O55_n13396CILObs, T01O55_A13397CILClicod,
            T01O55_n13397CILClicod, T01O55_A13399CILEstado, T01O55_n13399CILEstado, T01O55_A13402CILNumCol, T01O55_n13402CILNumCol, T01O55_A13410CILTipMaq, T01O55_n13410CILTipMaq, T01O55_A13411CILLDESId, T01O55_n13411CILLDESId, T01O55_A396EmprCod,
            T01O55_A13400CILGrabCod, T01O55_n13400CILGrabCod
            }
            , new Object[] {
            T01O56_A407EmprNom, T01O56_n407EmprNom
            }
            , new Object[] {
            T01O57_A13409CILGrabNom, T01O57_n13409CILGrabNom
            }
            , new Object[] {
            T01O58_A13388CILOGId, T01O58_A13398CILCliNom, T01O58_n13398CILCliNom, T01O58_A407EmprNom, T01O58_n407EmprNom, T01O58_A13389CILFecha, T01O58_n13389CILFecha, T01O58_A13390CILFecEnt, T01O58_n13390CILFecEnt, T01O58_A13391CILDIbCli,
            T01O58_n13391CILDIbCli, T01O58_A13392CILDibInt, T01O58_n13392CILDibInt, T01O58_A13393CILRef, T01O58_n13393CILRef, T01O58_A13394CILRap, T01O58_n13394CILRap, T01O58_A13395CILCargo, T01O58_n13395CILCargo, T01O58_A13396CILObs,
            T01O58_n13396CILObs, T01O58_A13397CILClicod, T01O58_n13397CILClicod, T01O58_A13399CILEstado, T01O58_n13399CILEstado, T01O58_A13409CILGrabNom, T01O58_n13409CILGrabNom, T01O58_A13402CILNumCol, T01O58_n13402CILNumCol, T01O58_A13410CILTipMaq,
            T01O58_n13410CILTipMaq, T01O58_A13411CILLDESId, T01O58_n13411CILLDESId, T01O58_A396EmprCod, T01O58_A13400CILGrabCod, T01O58_n13400CILGrabCod
            }
            , new Object[] {
            T01O59_A13409CILGrabNom, T01O59_n13409CILGrabNom
            }
            , new Object[] {
            T01O510_A396EmprCod, T01O510_A13388CILOGId
            }
            , new Object[] {
            T01O511_A396EmprCod, T01O511_A13388CILOGId
            }
            , new Object[] {
            T01O512_A396EmprCod, T01O512_A13388CILOGId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O516_A13409CILGrabNom, T01O516_n13409CILGrabNom
            }
            , new Object[] {
            T01O517_A396EmprCod, T01O517_A13388CILOGId
            }
            , new Object[] {
            T01O518_A396EmprCod, T01O518_A13388CILOGId, T01O518_A13403CILId, T01O518_A13404CILColor, T01O518_n13404CILColor, T01O518_A13405CILMalla, T01O518_n13405CILMalla, T01O518_A13406CILMedida, T01O518_n13406CILMedida, T01O518_A13407CILCob,
            T01O518_n13407CILCob, T01O518_A13408CILPrecio, T01O518_n13408CILPrecio
            }
            , new Object[] {
            T01O519_A396EmprCod, T01O519_A13388CILOGId, T01O519_A13403CILId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O523_A396EmprCod, T01O523_A13388CILOGId, T01O523_A13403CILId
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TCIL000" ;
      Z13399CILEstado = (byte)(0) ;
      n13399CILEstado = false ;
      A13399CILEstado = (byte)(0) ;
      n13399CILEstado = false ;
      i13399CILEstado = (byte)(0) ;
      n13399CILEstado = false ;
      Z13389CILFecha = GXutil.today( ) ;
      n13389CILFecha = false ;
      A13389CILFecha = GXutil.today( ) ;
      n13389CILFecha = false ;
      i13389CILFecha = GXutil.today( ) ;
      n13389CILFecha = false ;
   }

   private byte Z13395CILCargo ;
   private byte Z13399CILEstado ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13395CILCargo ;
   private byte A13399CILEstado ;
   private byte Gx_BScreen ;
   private byte AV33ExisteCont ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i13399CILEstado ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z13394CILRap ;
   private short Z13402CILNumCol ;
   private short Z13400CILGrabCod ;
   private short nRcdDeleted_1837 ;
   private short nRcdExists_1837 ;
   private short nIsMod_1837 ;
   private short A13400CILGrabCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13394CILRap ;
   private short A13402CILNumCol ;
   private short nBlankRcdCount1837 ;
   private short RcdFound1837 ;
   private short nBlankRcdUsr1837 ;
   private short RcdFound1836 ;
   private short nIsDirty_1836 ;
   private short nIsDirty_1837 ;
   private short GXv_int8[] ;
   private int Z13392CILDibInt ;
   private int Z13397CILClicod ;
   private int Z13411CILLDESId ;
   private int nRC_GXsfl_115 ;
   private int nGXsfl_115_idx=1 ;
   private int A13397CILClicod ;
   private int A13411CILLDESId ;
   private int A13392CILDibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCILOGId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCILFecha_Enabled ;
   private int edtCILFecEnt_Enabled ;
   private int edtCILDIbCli_Enabled ;
   private int edtCILDibInt_Enabled ;
   private int edtCILRef_Enabled ;
   private int edtCILRap_Enabled ;
   private int edtCILCargo_Enabled ;
   private int edtCILObs_Enabled ;
   private int edtCILClicod_Enabled ;
   private int edtCILCliNom_Enabled ;
   private int edtCILEstado_Enabled ;
   private int edtCILGrabCod_Enabled ;
   private int edtCILGrabNom_Enabled ;
   private int edtCILNumCol_Enabled ;
   private int edtCILLDESId_Enabled ;
   private int edtavnRcdDeleted_1837_Enabled ;
   private int edtCILId_Enabled ;
   private int edtCILColor_Enabled ;
   private int edtCILMalla_Enabled ;
   private int edtCILMedida_Enabled ;
   private int edtCILCob_Enabled ;
   private int edtCILPrecio_Enabled ;
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
   private int defedtCILId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCILLDESId_Backcolor ;
   private int edtCILNumCol_Backcolor ;
   private int edtCILGrabNom_Backcolor ;
   private int edtCILGrabCod_Backcolor ;
   private int edtCILEstado_Backcolor ;
   private int edtCILCliNom_Backcolor ;
   private int edtCILClicod_Backcolor ;
   private int edtCILObs_Backcolor ;
   private int edtCILCargo_Backcolor ;
   private int edtCILRap_Backcolor ;
   private int edtCILRef_Backcolor ;
   private int edtCILDibInt_Backcolor ;
   private int edtCILDIbCli_Backcolor ;
   private int edtCILFecEnt_Backcolor ;
   private int edtCILFecha_Backcolor ;
   private int edtCILOGId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private long wcpOAV34CILOGId ;
   private long Z13388CILOGId ;
   private long A13388CILOGId ;
   private long AV34CILOGId ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXv_int10[] ;
   private java.math.BigDecimal Z13407CILCob ;
   private java.math.BigDecimal Z13408CILPrecio ;
   private java.math.BigDecimal A13407CILCob ;
   private java.math.BigDecimal A13408CILPrecio ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z13398CILCliNom ;
   private String Z13391CILDIbCli ;
   private String Z13393CILRef ;
   private String Z13410CILTipMaq ;
   private String Z13403CILId ;
   private String Z13404CILColor ;
   private String Z13405CILMalla ;
   private String Z13406CILMedida ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV35msg_err ;
   private String A13391CILDIbCli ;
   private String A13393CILRef ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCILOGId_Internalname ;
   private String sGXsfl_115_idx="0001" ;
   private String A13410CILTipMaq ;
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
   private String edtCILOGId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCILFecha_Internalname ;
   private String edtCILFecha_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCILFecEnt_Internalname ;
   private String edtCILFecEnt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCILDIbCli_Internalname ;
   private String edtCILDIbCli_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCILDibInt_Internalname ;
   private String edtCILDibInt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCILRef_Internalname ;
   private String edtCILRef_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCILRap_Internalname ;
   private String edtCILRap_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCILCargo_Internalname ;
   private String edtCILCargo_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCILObs_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCILClicod_Internalname ;
   private String edtCILClicod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtCILCliNom_Internalname ;
   private String A13398CILCliNom ;
   private String edtCILCliNom_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtCILEstado_Internalname ;
   private String edtCILEstado_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtCILGrabCod_Internalname ;
   private String edtCILGrabCod_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtCILGrabNom_Internalname ;
   private String A13409CILGrabNom ;
   private String edtCILGrabNom_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtCILNumCol_Internalname ;
   private String edtCILNumCol_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtCILLDESId_Internalname ;
   private String edtCILLDESId_Jsonclick ;
   private String sMode1837 ;
   private String edtavnRcdDeleted_1837_Internalname ;
   private String edtCILId_Internalname ;
   private String edtCILColor_Internalname ;
   private String edtCILMalla_Internalname ;
   private String edtCILMedida_Internalname ;
   private String edtCILCob_Internalname ;
   private String edtCILPrecio_Internalname ;
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
   private String AV37Pgmname ;
   private String hsh ;
   private String sMode1836 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A13403CILId ;
   private String A13404CILColor ;
   private String A13405CILMalla ;
   private String A13406CILMedida ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z13409CILGrabNom ;
   private String sGXsfl_115_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1837_Jsonclick ;
   private String edtCILId_Jsonclick ;
   private String edtCILColor_Jsonclick ;
   private String edtCILMalla_Jsonclick ;
   private String edtCILMedida_Jsonclick ;
   private String edtCILCob_Jsonclick ;
   private String edtCILPrecio_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV35msg_err ;
   private java.util.Date Z13389CILFecha ;
   private java.util.Date Z13390CILFecEnt ;
   private java.util.Date A13389CILFecha ;
   private java.util.Date A13390CILFecEnt ;
   private java.util.Date i13389CILFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13397CILClicod ;
   private boolean n13411CILLDESId ;
   private boolean n13400CILGrabCod ;
   private boolean n13391CILDIbCli ;
   private boolean n13392CILDibInt ;
   private boolean n13393CILRef ;
   private boolean wbErr ;
   private boolean n13410CILTipMaq ;
   private boolean bGXsfl_115_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13389CILFecha ;
   private boolean n13390CILFecEnt ;
   private boolean n13394CILRap ;
   private boolean n13395CILCargo ;
   private boolean n13396CILObs ;
   private boolean n13398CILCliNom ;
   private boolean n13399CILEstado ;
   private boolean n13409CILGrabNom ;
   private boolean n13402CILNumCol ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n13404CILColor ;
   private boolean n13405CILMalla ;
   private boolean n13406CILMedida ;
   private boolean n13407CILCob ;
   private boolean n13408CILPrecio ;
   private String Z13396CILObs ;
   private String A13396CILObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCILTipMaq ;
   private IDataStoreProvider pr_default ;
   private String[] T01O56_A407EmprNom ;
   private boolean[] T01O56_n407EmprNom ;
   private long[] T01O58_A13388CILOGId ;
   private String[] T01O58_A13398CILCliNom ;
   private boolean[] T01O58_n13398CILCliNom ;
   private String[] T01O58_A407EmprNom ;
   private boolean[] T01O58_n407EmprNom ;
   private java.util.Date[] T01O58_A13389CILFecha ;
   private boolean[] T01O58_n13389CILFecha ;
   private java.util.Date[] T01O58_A13390CILFecEnt ;
   private boolean[] T01O58_n13390CILFecEnt ;
   private String[] T01O58_A13391CILDIbCli ;
   private boolean[] T01O58_n13391CILDIbCli ;
   private int[] T01O58_A13392CILDibInt ;
   private boolean[] T01O58_n13392CILDibInt ;
   private String[] T01O58_A13393CILRef ;
   private boolean[] T01O58_n13393CILRef ;
   private short[] T01O58_A13394CILRap ;
   private boolean[] T01O58_n13394CILRap ;
   private byte[] T01O58_A13395CILCargo ;
   private boolean[] T01O58_n13395CILCargo ;
   private String[] T01O58_A13396CILObs ;
   private boolean[] T01O58_n13396CILObs ;
   private int[] T01O58_A13397CILClicod ;
   private boolean[] T01O58_n13397CILClicod ;
   private byte[] T01O58_A13399CILEstado ;
   private boolean[] T01O58_n13399CILEstado ;
   private String[] T01O58_A13409CILGrabNom ;
   private boolean[] T01O58_n13409CILGrabNom ;
   private short[] T01O58_A13402CILNumCol ;
   private boolean[] T01O58_n13402CILNumCol ;
   private String[] T01O58_A13410CILTipMaq ;
   private boolean[] T01O58_n13410CILTipMaq ;
   private int[] T01O58_A13411CILLDESId ;
   private boolean[] T01O58_n13411CILLDESId ;
   private String[] T01O58_A396EmprCod ;
   private short[] T01O58_A13400CILGrabCod ;
   private boolean[] T01O58_n13400CILGrabCod ;
   private String[] T01O57_A13409CILGrabNom ;
   private boolean[] T01O57_n13409CILGrabNom ;
   private String[] T01O59_A13409CILGrabNom ;
   private boolean[] T01O59_n13409CILGrabNom ;
   private String[] T01O510_A396EmprCod ;
   private long[] T01O510_A13388CILOGId ;
   private long[] T01O55_A13388CILOGId ;
   private String[] T01O55_A13398CILCliNom ;
   private boolean[] T01O55_n13398CILCliNom ;
   private java.util.Date[] T01O55_A13389CILFecha ;
   private boolean[] T01O55_n13389CILFecha ;
   private java.util.Date[] T01O55_A13390CILFecEnt ;
   private boolean[] T01O55_n13390CILFecEnt ;
   private String[] T01O55_A13391CILDIbCli ;
   private boolean[] T01O55_n13391CILDIbCli ;
   private int[] T01O55_A13392CILDibInt ;
   private boolean[] T01O55_n13392CILDibInt ;
   private String[] T01O55_A13393CILRef ;
   private boolean[] T01O55_n13393CILRef ;
   private short[] T01O55_A13394CILRap ;
   private boolean[] T01O55_n13394CILRap ;
   private byte[] T01O55_A13395CILCargo ;
   private boolean[] T01O55_n13395CILCargo ;
   private String[] T01O55_A13396CILObs ;
   private boolean[] T01O55_n13396CILObs ;
   private int[] T01O55_A13397CILClicod ;
   private boolean[] T01O55_n13397CILClicod ;
   private byte[] T01O55_A13399CILEstado ;
   private boolean[] T01O55_n13399CILEstado ;
   private short[] T01O55_A13402CILNumCol ;
   private boolean[] T01O55_n13402CILNumCol ;
   private String[] T01O55_A13410CILTipMaq ;
   private boolean[] T01O55_n13410CILTipMaq ;
   private int[] T01O55_A13411CILLDESId ;
   private boolean[] T01O55_n13411CILLDESId ;
   private String[] T01O55_A396EmprCod ;
   private short[] T01O55_A13400CILGrabCod ;
   private boolean[] T01O55_n13400CILGrabCod ;
   private String[] T01O511_A396EmprCod ;
   private long[] T01O511_A13388CILOGId ;
   private String[] T01O512_A396EmprCod ;
   private long[] T01O512_A13388CILOGId ;
   private long[] T01O54_A13388CILOGId ;
   private String[] T01O54_A13398CILCliNom ;
   private boolean[] T01O54_n13398CILCliNom ;
   private java.util.Date[] T01O54_A13389CILFecha ;
   private boolean[] T01O54_n13389CILFecha ;
   private java.util.Date[] T01O54_A13390CILFecEnt ;
   private boolean[] T01O54_n13390CILFecEnt ;
   private String[] T01O54_A13391CILDIbCli ;
   private boolean[] T01O54_n13391CILDIbCli ;
   private int[] T01O54_A13392CILDibInt ;
   private boolean[] T01O54_n13392CILDibInt ;
   private String[] T01O54_A13393CILRef ;
   private boolean[] T01O54_n13393CILRef ;
   private short[] T01O54_A13394CILRap ;
   private boolean[] T01O54_n13394CILRap ;
   private byte[] T01O54_A13395CILCargo ;
   private boolean[] T01O54_n13395CILCargo ;
   private String[] T01O54_A13396CILObs ;
   private boolean[] T01O54_n13396CILObs ;
   private int[] T01O54_A13397CILClicod ;
   private boolean[] T01O54_n13397CILClicod ;
   private byte[] T01O54_A13399CILEstado ;
   private boolean[] T01O54_n13399CILEstado ;
   private short[] T01O54_A13402CILNumCol ;
   private boolean[] T01O54_n13402CILNumCol ;
   private String[] T01O54_A13410CILTipMaq ;
   private boolean[] T01O54_n13410CILTipMaq ;
   private int[] T01O54_A13411CILLDESId ;
   private boolean[] T01O54_n13411CILLDESId ;
   private String[] T01O54_A396EmprCod ;
   private short[] T01O54_A13400CILGrabCod ;
   private boolean[] T01O54_n13400CILGrabCod ;
   private String[] T01O516_A13409CILGrabNom ;
   private boolean[] T01O516_n13409CILGrabNom ;
   private String[] T01O517_A396EmprCod ;
   private long[] T01O517_A13388CILOGId ;
   private String[] T01O518_A396EmprCod ;
   private long[] T01O518_A13388CILOGId ;
   private String[] T01O518_A13403CILId ;
   private String[] T01O518_A13404CILColor ;
   private boolean[] T01O518_n13404CILColor ;
   private String[] T01O518_A13405CILMalla ;
   private boolean[] T01O518_n13405CILMalla ;
   private String[] T01O518_A13406CILMedida ;
   private boolean[] T01O518_n13406CILMedida ;
   private java.math.BigDecimal[] T01O518_A13407CILCob ;
   private boolean[] T01O518_n13407CILCob ;
   private java.math.BigDecimal[] T01O518_A13408CILPrecio ;
   private boolean[] T01O518_n13408CILPrecio ;
   private String[] T01O519_A396EmprCod ;
   private long[] T01O519_A13388CILOGId ;
   private String[] T01O519_A13403CILId ;
   private String[] T01O53_A396EmprCod ;
   private long[] T01O53_A13388CILOGId ;
   private String[] T01O53_A13403CILId ;
   private String[] T01O53_A13404CILColor ;
   private boolean[] T01O53_n13404CILColor ;
   private String[] T01O53_A13405CILMalla ;
   private boolean[] T01O53_n13405CILMalla ;
   private String[] T01O53_A13406CILMedida ;
   private boolean[] T01O53_n13406CILMedida ;
   private java.math.BigDecimal[] T01O53_A13407CILCob ;
   private boolean[] T01O53_n13407CILCob ;
   private java.math.BigDecimal[] T01O53_A13408CILPrecio ;
   private boolean[] T01O53_n13408CILPrecio ;
   private String[] T01O52_A396EmprCod ;
   private long[] T01O52_A13388CILOGId ;
   private String[] T01O52_A13403CILId ;
   private String[] T01O52_A13404CILColor ;
   private boolean[] T01O52_n13404CILColor ;
   private String[] T01O52_A13405CILMalla ;
   private boolean[] T01O52_n13405CILMalla ;
   private String[] T01O52_A13406CILMedida ;
   private boolean[] T01O52_n13406CILMedida ;
   private java.math.BigDecimal[] T01O52_A13407CILCob ;
   private boolean[] T01O52_n13407CILCob ;
   private java.math.BigDecimal[] T01O52_A13408CILPrecio ;
   private boolean[] T01O52_n13408CILPrecio ;
   private String[] T01O523_A396EmprCod ;
   private long[] T01O523_A13388CILOGId ;
   private String[] T01O523_A13403CILId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcil000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcil000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcil000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcil000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcil000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01O52", "SELECT EmprCod, CILOGId, CILId, CILColor, CILMalla, CILMedida, CILCob, CILPrecio FROM TXPCIL001 WHERE EmprCod = ? AND CILOGId = ? AND CILId = ?  FOR UPDATE OF CILColor, CILMalla, CILMedida, CILCob, CILPrecio NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O53", "SELECT EmprCod, CILOGId, CILId, CILColor, CILMalla, CILMedida, CILCob, CILPrecio FROM TXPCIL001 WHERE EmprCod = ? AND CILOGId = ? AND CILId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O54", "SELECT CILOGId, CILCliNom, CILFecha, CILFecEnt, CILDIbCli, CILDibInt, CILRef, CILRap, CILCargo, CILObs, CILClicod, CILEstado, CILNumCol, CILTipMaq, CILLDESId, EmprCod, CILGrabCod FROM TXPCIL000 WHERE EmprCod = ? AND CILOGId = ?  FOR UPDATE OF CILCliNom, CILFecha, CILFecEnt, CILDIbCli, CILDibInt, CILRef, CILRap, CILCargo, CILObs, CILClicod, CILEstado, CILNumCol, CILTipMaq, CILLDESId, CILGrabCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O55", "SELECT CILOGId, CILCliNom, CILFecha, CILFecEnt, CILDIbCli, CILDibInt, CILRef, CILRap, CILCargo, CILObs, CILClicod, CILEstado, CILNumCol, CILTipMaq, CILLDESId, EmprCod, CILGrabCod FROM TXPCIL000 WHERE EmprCod = ? AND CILOGId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O56", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O57", "SELECT GrabNom AS CILGrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O58", "SELECT /*+ FIRST_ROWS(100) */ TM1.CILOGId, TM1.CILCliNom, T2.EmprNom, TM1.CILFecha, TM1.CILFecEnt, TM1.CILDIbCli, TM1.CILDibInt, TM1.CILRef, TM1.CILRap, TM1.CILCargo, TM1.CILObs, TM1.CILClicod, TM1.CILEstado, T3.GrabNom AS CILGrabNom, TM1.CILNumCol, TM1.CILTipMaq, TM1.CILLDESId, TM1.EmprCod, TM1.CILGrabCod AS CILGrabCod FROM ((TXPCIL000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPGRABAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.GrabCod = TM1.CILGrabCod) WHERE TM1.EmprCod = ? and TM1.CILOGId = ? ORDER BY TM1.EmprCod, TM1.CILOGId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O59", "SELECT GrabNom AS CILGrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O510", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CILOGId FROM TXPCIL000 WHERE EmprCod = ? AND CILOGId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O511", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CILOGId FROM TXPCIL000 WHERE ( CILOGId > ?) and EmprCod = ? ORDER BY EmprCod, CILOGId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CILOGId FROM TXPCIL000 WHERE ( CILOGId < ?) and EmprCod = ? ORDER BY EmprCod DESC, CILOGId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01O513", "INSERT INTO TXPCIL000(CILOGId, CILCliNom, CILFecha, CILFecEnt, CILDIbCli, CILDibInt, CILRef, CILRap, CILCargo, CILObs, CILClicod, CILEstado, CILNumCol, CILTipMaq, CILLDESId, EmprCod, CILGrabCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCIL000")
         ,new UpdateCursor("T01O514", "UPDATE TXPCIL000 SET CILCliNom=?, CILFecha=?, CILFecEnt=?, CILDIbCli=?, CILDibInt=?, CILRef=?, CILRap=?, CILCargo=?, CILObs=?, CILClicod=?, CILEstado=?, CILNumCol=?, CILTipMaq=?, CILLDESId=?, CILGrabCod=?  WHERE EmprCod = ? AND CILOGId = ?", GX_NOMASK, "TXPCIL000")
         ,new UpdateCursor("T01O515", "DELETE FROM TXPCIL000  WHERE EmprCod = ? AND CILOGId = ?", GX_NOMASK, "TXPCIL000")
         ,new ForEachCursor("T01O516", "SELECT GrabNom AS CILGrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O517", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CILOGId FROM TXPCIL000 WHERE EmprCod = ? ORDER BY EmprCod, CILOGId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O518", "SELECT EmprCod, CILOGId, CILId, CILColor, CILMalla, CILMedida, CILCob, CILPrecio FROM TXPCIL001 WHERE EmprCod = ? and CILOGId = ? and CILId = ? ORDER BY EmprCod, CILOGId, CILId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O519", "SELECT EmprCod, CILOGId, CILId FROM TXPCIL001 WHERE EmprCod = ? AND CILOGId = ? AND CILId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O520", "INSERT INTO TXPCIL001(EmprCod, CILOGId, CILId, CILColor, CILMalla, CILMedida, CILCob, CILPrecio) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCIL001")
         ,new UpdateCursor("T01O521", "UPDATE TXPCIL001 SET CILColor=?, CILMalla=?, CILMedida=?, CILCob=?, CILPrecio=?  WHERE EmprCod = ? AND CILOGId = ? AND CILId = ?", GX_NOMASK, "TXPCIL001")
         ,new UpdateCursor("T01O522", "DELETE FROM TXPCIL001  WHERE EmprCod = ? AND CILOGId = ? AND CILId = ?", GX_NOMASK, "TXPCIL001")
         ,new ForEachCursor("T01O523", "SELECT EmprCod, CILOGId, CILId FROM TXPCIL001 WHERE EmprCod = ? and CILOGId = ? ORDER BY EmprCod, CILOGId, CILId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
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
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 3);
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
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
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
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
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 21 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
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
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 200);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               stmt.setString(16, (String)parms[29], 3);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[31]).shortValue());
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
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               stmt.setString(16, (String)parms[30], 3);
               stmt.setLong(17, ((Number) parms[31]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 3);
               }
               return;
            case 19 :
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
               stmt.setLong(7, ((Number) parms[11]).longValue());
               stmt.setString(8, (String)parms[12], 12);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

