package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplnmaq_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A602MaqCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PLNMAQ", ""), (short)(0)) ;
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

   public tplnmaq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplnmaq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplnmaq_impl.class ));
   }

   public tplnmaq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPLNMAQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "HDR", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A13193MaqHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13193MaqHdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13193MaqHdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHdr_Jsonclick, 0, "", "", "", "", "", 1, edtMaqHdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHdrR_Internalname, GXutil.ltrim( localUtil.ntoc( A13194MaqHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqHdrR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13194MaqHdrR), "9") : localUtil.format( DecimalUtil.doubleToDec(A13194MaqHdrR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHdrR_Jsonclick, 0, "", "", "", "", "", 1, edtMaqHdrR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqHdrP_Internalname, GXutil.rtrim( A13195MaqHdrP), GXutil.rtrim( localUtil.format( A13195MaqHdrP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqHdrP_Jsonclick, 0, "", "", "", "", "", 1, edtMaqHdrP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "ReclinMaq", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqRecLinM_Internalname, GXutil.ltrim( localUtil.ntoc( A13196MaqRecLinM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqRecLinM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13196MaqRecLinM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13196MaqRecLinM), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqRecLinM_Jsonclick, 0, "", "", "", "", "", 1, edtMaqRecLinM_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "PP", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPP_Internalname, GXutil.ltrim( localUtil.ntoc( A13197MaqPP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqPP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13197MaqPP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13197MaqPP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPP_Jsonclick, 0, "", "", "", "", "", 1, edtMaqPP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "PP2", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPP2_Internalname, GXutil.ltrim( localUtil.ntoc( A13199MaqPP2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqPP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13199MaqPP2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13199MaqPP2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPP2_Jsonclick, 0, "", "", "", "", "", 1, edtMaqPP2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Texto", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTexto_Internalname, GXutil.rtrim( A13198MaqTexto), GXutil.rtrim( localUtil.format( A13198MaqTexto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTexto_Jsonclick, 0, "", "", "", "", "", 1, edtMaqTexto_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Maqcod_RecMaq", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqRecMaq_Internalname, GXutil.rtrim( A13200MaqRecMaq), GXutil.rtrim( localUtil.format( A13200MaqRecMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqRecMaq_Jsonclick, 0, "", "", "", "", "", 1, edtMaqRecMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLNMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLNMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPLNMAQ.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z13193MaqHdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z13193MaqHdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13194MaqHdrR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13194MaqHdrR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13195MaqHdrP = httpContext.cgiGet( "Z13195MaqHdrP") ;
         Z13196MaqRecLinM = (short)(localUtil.ctol( httpContext.cgiGet( "Z13196MaqRecLinM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13197MaqPP = (short)(localUtil.ctol( httpContext.cgiGet( "Z13197MaqPP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13199MaqPP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13199MaqPP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13198MaqTexto = httpContext.cgiGet( "Z13198MaqTexto") ;
         Z13200MaqRecMaq = httpContext.cgiGet( "Z13200MaqRecMaq") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQHDR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqHdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13193MaqHdr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
         }
         else
         {
            A13193MaqHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQHDRR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqHdrR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13194MaqHdrR = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
         }
         else
         {
            A13194MaqHdrR = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
         }
         A13195MaqHdrP = httpContext.cgiGet( edtMaqHdrP_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqRecLinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqRecLinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQRECLINM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqRecLinM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13196MaqRecLinM = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
         }
         else
         {
            A13196MaqRecLinM = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqRecLinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqPP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqPP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQPP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqPP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13197MaqPP = (short)(0) ;
            n13197MaqPP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13197MaqPP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13197MaqPP), 4, 0));
         }
         else
         {
            A13197MaqPP = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13197MaqPP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13197MaqPP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13197MaqPP), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqPP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqPP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQPP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqPP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13199MaqPP2 = (short)(0) ;
            n13199MaqPP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13199MaqPP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13199MaqPP2), 4, 0));
         }
         else
         {
            A13199MaqPP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13199MaqPP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13199MaqPP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13199MaqPP2), 4, 0));
         }
         A13198MaqTexto = httpContext.cgiGet( edtMaqTexto_Internalname) ;
         n13198MaqTexto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13198MaqTexto", A13198MaqTexto);
         A13200MaqRecMaq = httpContext.cgiGet( edtMaqRecMaq_Internalname) ;
         n13200MaqRecMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13200MaqRecMaq", A13200MaqRecMaq);
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A13193MaqHdr = (int)(GXutil.lval( httpContext.GetPar( "MaqHdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
            A13194MaqHdrR = (byte)(GXutil.lval( httpContext.GetPar( "MaqHdrR"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
            A13195MaqHdrP = httpContext.GetPar( "MaqHdrP") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
            A13196MaqRecLinM = (short)(GXutil.lval( httpContext.GetPar( "MaqRecLinM"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
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
            initAll1N81809( ) ;
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
      disableAttributes1N81809( ) ;
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

   public void confirm_1N80( )
   {
      beforeValidate1N81809( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1N81809( ) ;
         }
         else
         {
            checkExtendedTable1N81809( ) ;
            if ( AnyError == 0 )
            {
               zm1N81809( 2) ;
               zm1N81809( 3) ;
            }
            closeExtendedTableCursors1N81809( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1N80( ) ;
      }
   }

   public void resetCaption1N80( )
   {
   }

   public void zm1N81809( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13197MaqPP = T01N83_A13197MaqPP[0] ;
            Z13199MaqPP2 = T01N83_A13199MaqPP2[0] ;
            Z13198MaqTexto = T01N83_A13198MaqTexto[0] ;
            Z13200MaqRecMaq = T01N83_A13200MaqRecMaq[0] ;
         }
         else
         {
            Z13197MaqPP = A13197MaqPP ;
            Z13199MaqPP2 = A13199MaqPP2 ;
            Z13198MaqTexto = A13198MaqTexto ;
            Z13200MaqRecMaq = A13200MaqRecMaq ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13193MaqHdr = A13193MaqHdr ;
         Z13194MaqHdrR = A13194MaqHdrR ;
         Z13195MaqHdrP = A13195MaqHdrP ;
         Z13196MaqRecLinM = A13196MaqRecLinM ;
         Z13197MaqPP = A13197MaqPP ;
         Z13199MaqPP2 = A13199MaqPP2 ;
         Z13198MaqTexto = A13198MaqTexto ;
         Z13200MaqRecMaq = A13200MaqRecMaq ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void load1N81809( )
   {
      /* Using cursor T01N86 */
      pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1809 = (short)(1) ;
         A407EmprNom = T01N86_A407EmprNom[0] ;
         n407EmprNom = T01N86_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13197MaqPP = T01N86_A13197MaqPP[0] ;
         n13197MaqPP = T01N86_n13197MaqPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13197MaqPP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13197MaqPP), 4, 0));
         A13199MaqPP2 = T01N86_A13199MaqPP2[0] ;
         n13199MaqPP2 = T01N86_n13199MaqPP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13199MaqPP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13199MaqPP2), 4, 0));
         A13198MaqTexto = T01N86_A13198MaqTexto[0] ;
         n13198MaqTexto = T01N86_n13198MaqTexto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13198MaqTexto", A13198MaqTexto);
         A13200MaqRecMaq = T01N86_A13200MaqRecMaq[0] ;
         n13200MaqRecMaq = T01N86_n13200MaqRecMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13200MaqRecMaq", A13200MaqRecMaq);
         zm1N81809( -1) ;
      }
      pr_default.close(4);
      onLoadActions1N81809( ) ;
   }

   public void onLoadActions1N81809( )
   {
   }

   public void checkExtendedTable1N81809( )
   {
      nIsDirty_1809 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01N84 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01N84_A407EmprNom[0] ;
      n407EmprNom = T01N84_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01N85 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1N81809( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01N87 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01N87_A407EmprNom[0] ;
      n407EmprNom = T01N87_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T01N88 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1N81809( )
   {
      /* Using cursor T01N89 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1809 = (short)(1) ;
      }
      else
      {
         RcdFound1809 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01N83 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1N81809( 1) ;
         RcdFound1809 = (short)(1) ;
         A13193MaqHdr = T01N83_A13193MaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
         A13194MaqHdrR = T01N83_A13194MaqHdrR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
         A13195MaqHdrP = T01N83_A13195MaqHdrP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
         A13196MaqRecLinM = T01N83_A13196MaqRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
         A13197MaqPP = T01N83_A13197MaqPP[0] ;
         n13197MaqPP = T01N83_n13197MaqPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13197MaqPP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13197MaqPP), 4, 0));
         A13199MaqPP2 = T01N83_A13199MaqPP2[0] ;
         n13199MaqPP2 = T01N83_n13199MaqPP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13199MaqPP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13199MaqPP2), 4, 0));
         A13198MaqTexto = T01N83_A13198MaqTexto[0] ;
         n13198MaqTexto = T01N83_n13198MaqTexto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13198MaqTexto", A13198MaqTexto);
         A13200MaqRecMaq = T01N83_A13200MaqRecMaq[0] ;
         n13200MaqRecMaq = T01N83_n13200MaqRecMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13200MaqRecMaq", A13200MaqRecMaq);
         A396EmprCod = T01N83_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01N83_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z13193MaqHdr = A13193MaqHdr ;
         Z13194MaqHdrR = A13194MaqHdrR ;
         Z13195MaqHdrP = A13195MaqHdrP ;
         Z13196MaqRecLinM = A13196MaqRecLinM ;
         sMode1809 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N81809( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1809 = (short)(0) ;
            initializeNonKey1N81809( ) ;
         }
         Gx_mode = sMode1809 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1809 = (short)(0) ;
         initializeNonKey1N81809( ) ;
         sMode1809 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1809 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1N81809( ) ;
      if ( RcdFound1809 == 0 )
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
      RcdFound1809 = (short)(0) ;
      /* Using cursor T01N810 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, Integer.valueOf(A13193MaqHdr), Integer.valueOf(A13193MaqHdr), A602MaqCod, A396EmprCod, Byte.valueOf(A13194MaqHdrR), Byte.valueOf(A13194MaqHdrR), Integer.valueOf(A13193MaqHdr), A602MaqCod, A396EmprCod, A13195MaqHdrP, A13195MaqHdrP, Byte.valueOf(A13194MaqHdrR), Integer.valueOf(A13193MaqHdr), A602MaqCod, A396EmprCod, Short.valueOf(A13196MaqRecLinM)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N810_A13193MaqHdr[0] < A13193MaqHdr ) || ( T01N810_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N810_A13194MaqHdrR[0] < A13194MaqHdrR ) || ( T01N810_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N810_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N810_A13195MaqHdrP[0], A13195MaqHdrP) < 0 ) || ( GXutil.strcmp(T01N810_A13195MaqHdrP[0], A13195MaqHdrP) == 0 ) && ( T01N810_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N810_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N810_A13196MaqRecLinM[0] < A13196MaqRecLinM ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N810_A13193MaqHdr[0] > A13193MaqHdr ) || ( T01N810_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N810_A13194MaqHdrR[0] > A13194MaqHdrR ) || ( T01N810_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N810_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N810_A13195MaqHdrP[0], A13195MaqHdrP) > 0 ) || ( GXutil.strcmp(T01N810_A13195MaqHdrP[0], A13195MaqHdrP) == 0 ) && ( T01N810_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N810_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N810_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N810_A13196MaqRecLinM[0] > A13196MaqRecLinM ) ) )
         {
            A396EmprCod = T01N810_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01N810_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A13193MaqHdr = T01N810_A13193MaqHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
            A13194MaqHdrR = T01N810_A13194MaqHdrR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
            A13195MaqHdrP = T01N810_A13195MaqHdrP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
            A13196MaqRecLinM = T01N810_A13196MaqRecLinM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
            RcdFound1809 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1809 = (short)(0) ;
      /* Using cursor T01N811 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, Integer.valueOf(A13193MaqHdr), Integer.valueOf(A13193MaqHdr), A602MaqCod, A396EmprCod, Byte.valueOf(A13194MaqHdrR), Byte.valueOf(A13194MaqHdrR), Integer.valueOf(A13193MaqHdr), A602MaqCod, A396EmprCod, A13195MaqHdrP, A13195MaqHdrP, Byte.valueOf(A13194MaqHdrR), Integer.valueOf(A13193MaqHdr), A602MaqCod, A396EmprCod, Short.valueOf(A13196MaqRecLinM)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N811_A13193MaqHdr[0] > A13193MaqHdr ) || ( T01N811_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N811_A13194MaqHdrR[0] > A13194MaqHdrR ) || ( T01N811_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N811_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N811_A13195MaqHdrP[0], A13195MaqHdrP) > 0 ) || ( GXutil.strcmp(T01N811_A13195MaqHdrP[0], A13195MaqHdrP) == 0 ) && ( T01N811_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N811_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N811_A13196MaqRecLinM[0] > A13196MaqRecLinM ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N811_A13193MaqHdr[0] < A13193MaqHdr ) || ( T01N811_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N811_A13194MaqHdrR[0] < A13194MaqHdrR ) || ( T01N811_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N811_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01N811_A13195MaqHdrP[0], A13195MaqHdrP) < 0 ) || ( GXutil.strcmp(T01N811_A13195MaqHdrP[0], A13195MaqHdrP) == 0 ) && ( T01N811_A13194MaqHdrR[0] == A13194MaqHdrR ) && ( T01N811_A13193MaqHdr[0] == A13193MaqHdr ) && ( GXutil.strcmp(T01N811_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01N811_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01N811_A13196MaqRecLinM[0] < A13196MaqRecLinM ) ) )
         {
            A396EmprCod = T01N811_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01N811_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A13193MaqHdr = T01N811_A13193MaqHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
            A13194MaqHdrR = T01N811_A13194MaqHdrR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
            A13195MaqHdrP = T01N811_A13195MaqHdrP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
            A13196MaqRecLinM = T01N811_A13196MaqRecLinM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
            RcdFound1809 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N81809( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1N81809( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1809 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A13193MaqHdr != Z13193MaqHdr ) || ( A13194MaqHdrR != Z13194MaqHdrR ) || ( GXutil.strcmp(A13195MaqHdrP, Z13195MaqHdrP) != 0 ) || ( A13196MaqRecLinM != Z13196MaqRecLinM ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A13193MaqHdr = Z13193MaqHdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
               A13194MaqHdrR = Z13194MaqHdrR ;
               httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
               A13195MaqHdrP = Z13195MaqHdrP ;
               httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
               A13196MaqRecLinM = Z13196MaqRecLinM ;
               httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
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
               update1N81809( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A13193MaqHdr != Z13193MaqHdr ) || ( A13194MaqHdrR != Z13194MaqHdrR ) || ( GXutil.strcmp(A13195MaqHdrP, Z13195MaqHdrP) != 0 ) || ( A13196MaqRecLinM != Z13196MaqRecLinM ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1N81809( ) ;
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
                  insert1N81809( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A13193MaqHdr != Z13193MaqHdr ) || ( A13194MaqHdrR != Z13194MaqHdrR ) || ( GXutil.strcmp(A13195MaqHdrP, Z13195MaqHdrP) != 0 ) || ( A13196MaqRecLinM != Z13196MaqRecLinM ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A13193MaqHdr = Z13193MaqHdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
         A13194MaqHdrR = Z13194MaqHdrR ;
         httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
         A13195MaqHdrP = Z13195MaqHdrP ;
         httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
         A13196MaqRecLinM = Z13196MaqRecLinM ;
         httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
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
      getKey1N81809( ) ;
      if ( RcdFound1809 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A13193MaqHdr != Z13193MaqHdr ) || ( A13194MaqHdrR != Z13194MaqHdrR ) || ( GXutil.strcmp(A13195MaqHdrP, Z13195MaqHdrP) != 0 ) || ( A13196MaqRecLinM != Z13196MaqRecLinM ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A13193MaqHdr = Z13193MaqHdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
            A13194MaqHdrR = Z13194MaqHdrR ;
            httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
            A13195MaqHdrP = Z13195MaqHdrP ;
            httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
            A13196MaqRecLinM = Z13196MaqRecLinM ;
            httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A13193MaqHdr != Z13193MaqHdr ) || ( A13194MaqHdrR != Z13194MaqHdrR ) || ( GXutil.strcmp(A13195MaqHdrP, Z13195MaqHdrP) != 0 ) || ( A13196MaqRecLinM != Z13196MaqRecLinM ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplnmaq");
      GX_FocusControl = edtMaqPP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1N80( ) ;
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
      if ( RcdFound1809 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqPP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1N81809( ) ;
      if ( RcdFound1809 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqPP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N81809( ) ;
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
      if ( RcdFound1809 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqPP_Internalname ;
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
      if ( RcdFound1809 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqPP_Internalname ;
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
      scanStart1N81809( ) ;
      if ( RcdFound1809 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1809 != 0 )
         {
            scanNext1N81809( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqPP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N81809( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N81809( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N82 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLNMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z13197MaqPP != T01N82_A13197MaqPP[0] ) || ( Z13199MaqPP2 != T01N82_A13199MaqPP2[0] ) || ( GXutil.strcmp(Z13198MaqTexto, T01N82_A13198MaqTexto[0]) != 0 ) || ( GXutil.strcmp(Z13200MaqRecMaq, T01N82_A13200MaqRecMaq[0]) != 0 ) )
         {
            if ( Z13197MaqPP != T01N82_A13197MaqPP[0] )
            {
               GXutil.writeLogln("tplnmaq:[seudo value changed for attri]"+"MaqPP");
               GXutil.writeLogRaw("Old: ",Z13197MaqPP);
               GXutil.writeLogRaw("Current: ",T01N82_A13197MaqPP[0]);
            }
            if ( Z13199MaqPP2 != T01N82_A13199MaqPP2[0] )
            {
               GXutil.writeLogln("tplnmaq:[seudo value changed for attri]"+"MaqPP2");
               GXutil.writeLogRaw("Old: ",Z13199MaqPP2);
               GXutil.writeLogRaw("Current: ",T01N82_A13199MaqPP2[0]);
            }
            if ( GXutil.strcmp(Z13198MaqTexto, T01N82_A13198MaqTexto[0]) != 0 )
            {
               GXutil.writeLogln("tplnmaq:[seudo value changed for attri]"+"MaqTexto");
               GXutil.writeLogRaw("Old: ",Z13198MaqTexto);
               GXutil.writeLogRaw("Current: ",T01N82_A13198MaqTexto[0]);
            }
            if ( GXutil.strcmp(Z13200MaqRecMaq, T01N82_A13200MaqRecMaq[0]) != 0 )
            {
               GXutil.writeLogln("tplnmaq:[seudo value changed for attri]"+"MaqRecMaq");
               GXutil.writeLogRaw("Old: ",Z13200MaqRecMaq);
               GXutil.writeLogRaw("Current: ",T01N82_A13200MaqRecMaq[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPLNMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N81809( )
   {
      beforeValidate1N81809( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N81809( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N81809( 0) ;
         checkOptimisticConcurrency1N81809( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N81809( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N81809( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N812 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM), Boolean.valueOf(n13197MaqPP), Short.valueOf(A13197MaqPP), Boolean.valueOf(n13199MaqPP2), Short.valueOf(A13199MaqPP2), Boolean.valueOf(n13198MaqTexto), A13198MaqTexto, Boolean.valueOf(n13200MaqRecMaq), A13200MaqRecMaq, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNMAQ");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption1N80( ) ;
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
            load1N81809( ) ;
         }
         endLevel1N81809( ) ;
      }
      closeExtendedTableCursors1N81809( ) ;
   }

   public void update1N81809( )
   {
      beforeValidate1N81809( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N81809( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N81809( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N81809( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N81809( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N813 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n13197MaqPP), Short.valueOf(A13197MaqPP), Boolean.valueOf(n13199MaqPP2), Short.valueOf(A13199MaqPP2), Boolean.valueOf(n13198MaqTexto), A13198MaqTexto, Boolean.valueOf(n13200MaqRecMaq), A13200MaqRecMaq, A396EmprCod, A602MaqCod, Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNMAQ");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLNMAQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N81809( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1N80( ) ;
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
         endLevel1N81809( ) ;
      }
      closeExtendedTableCursors1N81809( ) ;
   }

   public void deferredUpdate1N81809( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N81809( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N81809( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N81809( ) ;
         afterConfirm1N81809( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N81809( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01N814 */
               pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod, Integer.valueOf(A13193MaqHdr), Byte.valueOf(A13194MaqHdrR), A13195MaqHdrP, Short.valueOf(A13196MaqRecLinM)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLNMAQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1809 == 0 )
                     {
                        initAll1N81809( ) ;
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
                     resetCaption1N80( ) ;
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
      sMode1809 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N81809( ) ;
      Gx_mode = sMode1809 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N81809( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01N815 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01N815_A407EmprNom[0] ;
         n407EmprNom = T01N815_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
   }

   public void endLevel1N81809( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1N81809( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplnmaq");
         if ( AnyError == 0 )
         {
            confirmValues1N80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplnmaq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N81809( )
   {
      /* Using cursor T01N816 */
      pr_default.execute(14);
      RcdFound1809 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1809 = (short)(1) ;
         A396EmprCod = T01N816_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01N816_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A13193MaqHdr = T01N816_A13193MaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
         A13194MaqHdrR = T01N816_A13194MaqHdrR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
         A13195MaqHdrP = T01N816_A13195MaqHdrP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
         A13196MaqRecLinM = T01N816_A13196MaqRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N81809( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1809 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1809 = (short)(1) ;
         A396EmprCod = T01N816_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01N816_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A13193MaqHdr = T01N816_A13193MaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
         A13194MaqHdrR = T01N816_A13194MaqHdrR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
         A13195MaqHdrP = T01N816_A13195MaqHdrP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
         A13196MaqRecLinM = T01N816_A13196MaqRecLinM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
      }
   }

   public void scanEnd1N81809( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1N81809( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N81809( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N81809( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N81809( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N81809( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N81809( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N81809( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHdr_Enabled), 5, 0), true);
      edtMaqHdrR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHdrR_Enabled), 5, 0), true);
      edtMaqHdrP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqHdrP_Enabled), 5, 0), true);
      edtMaqRecLinM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqRecLinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqRecLinM_Enabled), 5, 0), true);
      edtMaqPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqPP_Enabled), 5, 0), true);
      edtMaqPP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqPP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqPP2_Enabled), 5, 0), true);
      edtMaqTexto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTexto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTexto_Enabled), 5, 0), true);
      edtMaqRecMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqRecMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqRecMaq_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1N81809( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1N80( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplnmaq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13193MaqHdr", GXutil.ltrim( localUtil.ntoc( Z13193MaqHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13194MaqHdrR", GXutil.ltrim( localUtil.ntoc( Z13194MaqHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13195MaqHdrP", GXutil.rtrim( Z13195MaqHdrP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13196MaqRecLinM", GXutil.ltrim( localUtil.ntoc( Z13196MaqRecLinM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13197MaqPP", GXutil.ltrim( localUtil.ntoc( Z13197MaqPP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13199MaqPP2", GXutil.ltrim( localUtil.ntoc( Z13199MaqPP2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13198MaqTexto", GXutil.rtrim( Z13198MaqTexto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13200MaqRecMaq", GXutil.rtrim( Z13200MaqRecMaq));
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
      return formatLink("app.tplnmaq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPLNMAQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PLNMAQ", "") ;
   }

   public void initializeNonKey1N81809( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A13197MaqPP = (short)(0) ;
      n13197MaqPP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13197MaqPP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13197MaqPP), 4, 0));
      A13199MaqPP2 = (short)(0) ;
      n13199MaqPP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13199MaqPP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13199MaqPP2), 4, 0));
      A13198MaqTexto = "" ;
      n13198MaqTexto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13198MaqTexto", A13198MaqTexto);
      A13200MaqRecMaq = "" ;
      n13200MaqRecMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13200MaqRecMaq", A13200MaqRecMaq);
      Z13197MaqPP = (short)(0) ;
      Z13199MaqPP2 = (short)(0) ;
      Z13198MaqTexto = "" ;
      Z13200MaqRecMaq = "" ;
   }

   public void initAll1N81809( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A13193MaqHdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13193MaqHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13193MaqHdr), 8, 0));
      A13194MaqHdrR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13194MaqHdrR", GXutil.str( A13194MaqHdrR, 1, 0));
      A13195MaqHdrP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13195MaqHdrP", A13195MaqHdrP);
      A13196MaqRecLinM = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13196MaqRecLinM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13196MaqRecLinM), 4, 0));
      initializeNonKey1N81809( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824151060", true, true);
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
      httpContext.AddJavascriptSource("tplnmaq.js", "?2026824151061", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqHdr_Internalname = "MAQHDR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqHdrR_Internalname = "MAQHDRR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMaqHdrP_Internalname = "MAQHDRP" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMaqRecLinM_Internalname = "MAQRECLINM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMaqPP_Internalname = "MAQPP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMaqPP2_Internalname = "MAQPP2" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMaqTexto_Internalname = "MAQTEXTO" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMaqRecMaq_Internalname = "MAQRECMAQ" ;
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
      Form.setCaption( httpContext.getMessage( "PLNMAQ", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMaqRecMaq_Jsonclick = "" ;
      edtMaqRecMaq_Backcolor = (int)(0xFFFFFF) ;
      edtMaqRecMaq_Enabled = 1 ;
      edtMaqTexto_Jsonclick = "" ;
      edtMaqTexto_Backcolor = (int)(0xFFFFFF) ;
      edtMaqTexto_Enabled = 1 ;
      edtMaqPP2_Jsonclick = "" ;
      edtMaqPP2_Backcolor = (int)(0xFFFFFF) ;
      edtMaqPP2_Enabled = 1 ;
      edtMaqPP_Jsonclick = "" ;
      edtMaqPP_Backcolor = (int)(0xFFFFFF) ;
      edtMaqPP_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqRecLinM_Jsonclick = "" ;
      edtMaqRecLinM_Backcolor = (int)(0xFFFFFF) ;
      edtMaqRecLinM_Enabled = 1 ;
      edtMaqHdrP_Jsonclick = "" ;
      edtMaqHdrP_Backcolor = (int)(0xFFFFFF) ;
      edtMaqHdrP_Enabled = 1 ;
      edtMaqHdrR_Jsonclick = "" ;
      edtMaqHdrR_Backcolor = (int)(0xFFFFFF) ;
      edtMaqHdrR_Enabled = 1 ;
      edtMaqHdr_Jsonclick = "" ;
      edtMaqHdr_Backcolor = (int)(0xFFFFFF) ;
      edtMaqHdr_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01N815 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01N815_A407EmprNom[0] ;
      n407EmprNom = T01N815_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01N817 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtMaqPP_Internalname ;
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
      /* Using cursor T01N815 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01N815_A407EmprNom[0] ;
      n407EmprNom = T01N815_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Maqcod( )
   {
      /* Using cursor T01N817 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Maqreclinm( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13197MaqPP", GXutil.ltrim( localUtil.ntoc( A13197MaqPP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13199MaqPP2", GXutil.ltrim( localUtil.ntoc( A13199MaqPP2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13198MaqTexto", GXutil.rtrim( A13198MaqTexto));
      httpContext.ajax_rsp_assign_attri("", false, "A13200MaqRecMaq", GXutil.rtrim( A13200MaqRecMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13193MaqHdr", GXutil.ltrim( localUtil.ntoc( Z13193MaqHdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13194MaqHdrR", GXutil.ltrim( localUtil.ntoc( Z13194MaqHdrR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13195MaqHdrP", GXutil.rtrim( Z13195MaqHdrP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13196MaqRecLinM", GXutil.ltrim( localUtil.ntoc( Z13196MaqRecLinM, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13197MaqPP", GXutil.ltrim( localUtil.ntoc( Z13197MaqPP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13199MaqPP2", GXutil.ltrim( localUtil.ntoc( Z13199MaqPP2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13198MaqTexto", GXutil.rtrim( Z13198MaqTexto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13200MaqRecMaq", GXutil.rtrim( Z13200MaqRecMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQHDR","{handler:'valid_Maqhdr',iparms:[]");
      setEventMetadata("VALID_MAQHDR",",oparms:[]}");
      setEventMetadata("VALID_MAQHDRR","{handler:'valid_Maqhdrr',iparms:[]");
      setEventMetadata("VALID_MAQHDRR",",oparms:[]}");
      setEventMetadata("VALID_MAQHDRP","{handler:'valid_Maqhdrp',iparms:[]");
      setEventMetadata("VALID_MAQHDRP",",oparms:[]}");
      setEventMetadata("VALID_MAQRECLINM","{handler:'valid_Maqreclinm',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A13193MaqHdr',fld:'MAQHDR',pic:'ZZZZZZZ9'},{av:'A13194MaqHdrR',fld:'MAQHDRR',pic:'9'},{av:'A13195MaqHdrP',fld:'MAQHDRP',pic:''},{av:'A13196MaqRecLinM',fld:'MAQRECLINM',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQRECLINM",",oparms:[{av:'A13197MaqPP',fld:'MAQPP',pic:'ZZZ9'},{av:'A13199MaqPP2',fld:'MAQPP2',pic:'ZZZ9'},{av:'A13198MaqTexto',fld:'MAQTEXTO',pic:''},{av:'A13200MaqRecMaq',fld:'MAQRECMAQ',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z13193MaqHdr'},{av:'Z13194MaqHdrR'},{av:'Z13195MaqHdrP'},{av:'Z13196MaqRecLinM'},{av:'Z13197MaqPP'},{av:'Z13199MaqPP2'},{av:'Z13198MaqTexto'},{av:'Z13200MaqRecMaq'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(13);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z13195MaqHdrP = "" ;
      Z13198MaqTexto = "" ;
      Z13200MaqRecMaq = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A13195MaqHdrP = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A13198MaqTexto = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13200MaqRecMaq = "" ;
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
      Z407EmprNom = "" ;
      T01N86_A13193MaqHdr = new int[1] ;
      T01N86_A13194MaqHdrR = new byte[1] ;
      T01N86_A13195MaqHdrP = new String[] {""} ;
      T01N86_A13196MaqRecLinM = new short[1] ;
      T01N86_A407EmprNom = new String[] {""} ;
      T01N86_n407EmprNom = new boolean[] {false} ;
      T01N86_A13197MaqPP = new short[1] ;
      T01N86_n13197MaqPP = new boolean[] {false} ;
      T01N86_A13199MaqPP2 = new short[1] ;
      T01N86_n13199MaqPP2 = new boolean[] {false} ;
      T01N86_A13198MaqTexto = new String[] {""} ;
      T01N86_n13198MaqTexto = new boolean[] {false} ;
      T01N86_A13200MaqRecMaq = new String[] {""} ;
      T01N86_n13200MaqRecMaq = new boolean[] {false} ;
      T01N86_A396EmprCod = new String[] {""} ;
      T01N86_A602MaqCod = new String[] {""} ;
      T01N84_A407EmprNom = new String[] {""} ;
      T01N84_n407EmprNom = new boolean[] {false} ;
      T01N85_A396EmprCod = new String[] {""} ;
      T01N87_A407EmprNom = new String[] {""} ;
      T01N87_n407EmprNom = new boolean[] {false} ;
      T01N88_A396EmprCod = new String[] {""} ;
      T01N89_A396EmprCod = new String[] {""} ;
      T01N89_A602MaqCod = new String[] {""} ;
      T01N89_A13193MaqHdr = new int[1] ;
      T01N89_A13194MaqHdrR = new byte[1] ;
      T01N89_A13195MaqHdrP = new String[] {""} ;
      T01N89_A13196MaqRecLinM = new short[1] ;
      T01N83_A13193MaqHdr = new int[1] ;
      T01N83_A13194MaqHdrR = new byte[1] ;
      T01N83_A13195MaqHdrP = new String[] {""} ;
      T01N83_A13196MaqRecLinM = new short[1] ;
      T01N83_A13197MaqPP = new short[1] ;
      T01N83_n13197MaqPP = new boolean[] {false} ;
      T01N83_A13199MaqPP2 = new short[1] ;
      T01N83_n13199MaqPP2 = new boolean[] {false} ;
      T01N83_A13198MaqTexto = new String[] {""} ;
      T01N83_n13198MaqTexto = new boolean[] {false} ;
      T01N83_A13200MaqRecMaq = new String[] {""} ;
      T01N83_n13200MaqRecMaq = new boolean[] {false} ;
      T01N83_A396EmprCod = new String[] {""} ;
      T01N83_A602MaqCod = new String[] {""} ;
      sMode1809 = "" ;
      T01N810_A396EmprCod = new String[] {""} ;
      T01N810_A602MaqCod = new String[] {""} ;
      T01N810_A13193MaqHdr = new int[1] ;
      T01N810_A13194MaqHdrR = new byte[1] ;
      T01N810_A13195MaqHdrP = new String[] {""} ;
      T01N810_A13196MaqRecLinM = new short[1] ;
      T01N811_A396EmprCod = new String[] {""} ;
      T01N811_A602MaqCod = new String[] {""} ;
      T01N811_A13193MaqHdr = new int[1] ;
      T01N811_A13194MaqHdrR = new byte[1] ;
      T01N811_A13195MaqHdrP = new String[] {""} ;
      T01N811_A13196MaqRecLinM = new short[1] ;
      T01N82_A13193MaqHdr = new int[1] ;
      T01N82_A13194MaqHdrR = new byte[1] ;
      T01N82_A13195MaqHdrP = new String[] {""} ;
      T01N82_A13196MaqRecLinM = new short[1] ;
      T01N82_A13197MaqPP = new short[1] ;
      T01N82_n13197MaqPP = new boolean[] {false} ;
      T01N82_A13199MaqPP2 = new short[1] ;
      T01N82_n13199MaqPP2 = new boolean[] {false} ;
      T01N82_A13198MaqTexto = new String[] {""} ;
      T01N82_n13198MaqTexto = new boolean[] {false} ;
      T01N82_A13200MaqRecMaq = new String[] {""} ;
      T01N82_n13200MaqRecMaq = new boolean[] {false} ;
      T01N82_A396EmprCod = new String[] {""} ;
      T01N82_A602MaqCod = new String[] {""} ;
      T01N815_A407EmprNom = new String[] {""} ;
      T01N815_n407EmprNom = new boolean[] {false} ;
      T01N816_A396EmprCod = new String[] {""} ;
      T01N816_A602MaqCod = new String[] {""} ;
      T01N816_A13193MaqHdr = new int[1] ;
      T01N816_A13194MaqHdrR = new byte[1] ;
      T01N816_A13195MaqHdrP = new String[] {""} ;
      T01N816_A13196MaqRecLinM = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01N817_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ13195MaqHdrP = "" ;
      ZZ13198MaqTexto = "" ;
      ZZ13200MaqRecMaq = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplnmaq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplnmaq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplnmaq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplnmaq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplnmaq__default(),
         new Object[] {
             new Object[] {
            T01N82_A13193MaqHdr, T01N82_A13194MaqHdrR, T01N82_A13195MaqHdrP, T01N82_A13196MaqRecLinM, T01N82_A13197MaqPP, T01N82_n13197MaqPP, T01N82_A13199MaqPP2, T01N82_n13199MaqPP2, T01N82_A13198MaqTexto, T01N82_n13198MaqTexto,
            T01N82_A13200MaqRecMaq, T01N82_n13200MaqRecMaq, T01N82_A396EmprCod, T01N82_A602MaqCod
            }
            , new Object[] {
            T01N83_A13193MaqHdr, T01N83_A13194MaqHdrR, T01N83_A13195MaqHdrP, T01N83_A13196MaqRecLinM, T01N83_A13197MaqPP, T01N83_n13197MaqPP, T01N83_A13199MaqPP2, T01N83_n13199MaqPP2, T01N83_A13198MaqTexto, T01N83_n13198MaqTexto,
            T01N83_A13200MaqRecMaq, T01N83_n13200MaqRecMaq, T01N83_A396EmprCod, T01N83_A602MaqCod
            }
            , new Object[] {
            T01N84_A407EmprNom, T01N84_n407EmprNom
            }
            , new Object[] {
            T01N85_A396EmprCod
            }
            , new Object[] {
            T01N86_A13193MaqHdr, T01N86_A13194MaqHdrR, T01N86_A13195MaqHdrP, T01N86_A13196MaqRecLinM, T01N86_A407EmprNom, T01N86_n407EmprNom, T01N86_A13197MaqPP, T01N86_n13197MaqPP, T01N86_A13199MaqPP2, T01N86_n13199MaqPP2,
            T01N86_A13198MaqTexto, T01N86_n13198MaqTexto, T01N86_A13200MaqRecMaq, T01N86_n13200MaqRecMaq, T01N86_A396EmprCod, T01N86_A602MaqCod
            }
            , new Object[] {
            T01N87_A407EmprNom, T01N87_n407EmprNom
            }
            , new Object[] {
            T01N88_A396EmprCod
            }
            , new Object[] {
            T01N89_A396EmprCod, T01N89_A602MaqCod, T01N89_A13193MaqHdr, T01N89_A13194MaqHdrR, T01N89_A13195MaqHdrP, T01N89_A13196MaqRecLinM
            }
            , new Object[] {
            T01N810_A396EmprCod, T01N810_A602MaqCod, T01N810_A13193MaqHdr, T01N810_A13194MaqHdrR, T01N810_A13195MaqHdrP, T01N810_A13196MaqRecLinM
            }
            , new Object[] {
            T01N811_A396EmprCod, T01N811_A602MaqCod, T01N811_A13193MaqHdr, T01N811_A13194MaqHdrR, T01N811_A13195MaqHdrP, T01N811_A13196MaqRecLinM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N815_A407EmprNom, T01N815_n407EmprNom
            }
            , new Object[] {
            T01N816_A396EmprCod, T01N816_A602MaqCod, T01N816_A13193MaqHdr, T01N816_A13194MaqHdrR, T01N816_A13195MaqHdrP, T01N816_A13196MaqRecLinM
            }
            , new Object[] {
            T01N817_A396EmprCod
            }
         }
      );
   }

   private byte Z13194MaqHdrR ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13194MaqHdrR ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ13194MaqHdrR ;
   private short Z13196MaqRecLinM ;
   private short Z13197MaqPP ;
   private short Z13199MaqPP2 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13196MaqRecLinM ;
   private short A13197MaqPP ;
   private short A13199MaqPP2 ;
   private short RcdFound1809 ;
   private short nIsDirty_1809 ;
   private short ZZ13196MaqRecLinM ;
   private short ZZ13197MaqPP ;
   private short ZZ13199MaqPP2 ;
   private int Z13193MaqHdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int A13193MaqHdr ;
   private int edtMaqHdr_Enabled ;
   private int edtMaqHdrR_Enabled ;
   private int edtMaqHdrP_Enabled ;
   private int edtMaqRecLinM_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqPP_Enabled ;
   private int edtMaqPP2_Enabled ;
   private int edtMaqTexto_Enabled ;
   private int edtMaqRecMaq_Enabled ;
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
   private int edtMaqRecMaq_Backcolor ;
   private int edtMaqTexto_Backcolor ;
   private int edtMaqPP2_Backcolor ;
   private int edtMaqPP_Backcolor ;
   private int edtMaqRecLinM_Backcolor ;
   private int edtMaqHdrP_Backcolor ;
   private int edtMaqHdrR_Backcolor ;
   private int edtMaqHdr_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13193MaqHdr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z13195MaqHdrP ;
   private String Z13198MaqTexto ;
   private String Z13200MaqRecMaq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqHdr_Internalname ;
   private String edtMaqHdr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqHdrR_Internalname ;
   private String edtMaqHdrR_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMaqHdrP_Internalname ;
   private String A13195MaqHdrP ;
   private String edtMaqHdrP_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMaqRecLinM_Internalname ;
   private String edtMaqRecLinM_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMaqPP_Internalname ;
   private String edtMaqPP_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMaqPP2_Internalname ;
   private String edtMaqPP2_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMaqTexto_Internalname ;
   private String A13198MaqTexto ;
   private String edtMaqTexto_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMaqRecMaq_Internalname ;
   private String A13200MaqRecMaq ;
   private String edtMaqRecMaq_Jsonclick ;
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
   private String Z407EmprNom ;
   private String sMode1809 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ13195MaqHdrP ;
   private String ZZ13198MaqTexto ;
   private String ZZ13200MaqRecMaq ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n13197MaqPP ;
   private boolean n13199MaqPP2 ;
   private boolean n13198MaqTexto ;
   private boolean n13200MaqRecMaq ;
   private IDataStoreProvider pr_default ;
   private int[] T01N86_A13193MaqHdr ;
   private byte[] T01N86_A13194MaqHdrR ;
   private String[] T01N86_A13195MaqHdrP ;
   private short[] T01N86_A13196MaqRecLinM ;
   private String[] T01N86_A407EmprNom ;
   private boolean[] T01N86_n407EmprNom ;
   private short[] T01N86_A13197MaqPP ;
   private boolean[] T01N86_n13197MaqPP ;
   private short[] T01N86_A13199MaqPP2 ;
   private boolean[] T01N86_n13199MaqPP2 ;
   private String[] T01N86_A13198MaqTexto ;
   private boolean[] T01N86_n13198MaqTexto ;
   private String[] T01N86_A13200MaqRecMaq ;
   private boolean[] T01N86_n13200MaqRecMaq ;
   private String[] T01N86_A396EmprCod ;
   private String[] T01N86_A602MaqCod ;
   private String[] T01N84_A407EmprNom ;
   private boolean[] T01N84_n407EmprNom ;
   private String[] T01N85_A396EmprCod ;
   private String[] T01N87_A407EmprNom ;
   private boolean[] T01N87_n407EmprNom ;
   private String[] T01N88_A396EmprCod ;
   private String[] T01N89_A396EmprCod ;
   private String[] T01N89_A602MaqCod ;
   private int[] T01N89_A13193MaqHdr ;
   private byte[] T01N89_A13194MaqHdrR ;
   private String[] T01N89_A13195MaqHdrP ;
   private short[] T01N89_A13196MaqRecLinM ;
   private int[] T01N83_A13193MaqHdr ;
   private byte[] T01N83_A13194MaqHdrR ;
   private String[] T01N83_A13195MaqHdrP ;
   private short[] T01N83_A13196MaqRecLinM ;
   private short[] T01N83_A13197MaqPP ;
   private boolean[] T01N83_n13197MaqPP ;
   private short[] T01N83_A13199MaqPP2 ;
   private boolean[] T01N83_n13199MaqPP2 ;
   private String[] T01N83_A13198MaqTexto ;
   private boolean[] T01N83_n13198MaqTexto ;
   private String[] T01N83_A13200MaqRecMaq ;
   private boolean[] T01N83_n13200MaqRecMaq ;
   private String[] T01N83_A396EmprCod ;
   private String[] T01N83_A602MaqCod ;
   private String[] T01N810_A396EmprCod ;
   private String[] T01N810_A602MaqCod ;
   private int[] T01N810_A13193MaqHdr ;
   private byte[] T01N810_A13194MaqHdrR ;
   private String[] T01N810_A13195MaqHdrP ;
   private short[] T01N810_A13196MaqRecLinM ;
   private String[] T01N811_A396EmprCod ;
   private String[] T01N811_A602MaqCod ;
   private int[] T01N811_A13193MaqHdr ;
   private byte[] T01N811_A13194MaqHdrR ;
   private String[] T01N811_A13195MaqHdrP ;
   private short[] T01N811_A13196MaqRecLinM ;
   private int[] T01N82_A13193MaqHdr ;
   private byte[] T01N82_A13194MaqHdrR ;
   private String[] T01N82_A13195MaqHdrP ;
   private short[] T01N82_A13196MaqRecLinM ;
   private short[] T01N82_A13197MaqPP ;
   private boolean[] T01N82_n13197MaqPP ;
   private short[] T01N82_A13199MaqPP2 ;
   private boolean[] T01N82_n13199MaqPP2 ;
   private String[] T01N82_A13198MaqTexto ;
   private boolean[] T01N82_n13198MaqTexto ;
   private String[] T01N82_A13200MaqRecMaq ;
   private boolean[] T01N82_n13200MaqRecMaq ;
   private String[] T01N82_A396EmprCod ;
   private String[] T01N82_A602MaqCod ;
   private String[] T01N815_A407EmprNom ;
   private boolean[] T01N815_n407EmprNom ;
   private String[] T01N816_A396EmprCod ;
   private String[] T01N816_A602MaqCod ;
   private int[] T01N816_A13193MaqHdr ;
   private byte[] T01N816_A13194MaqHdrR ;
   private String[] T01N816_A13195MaqHdrP ;
   private short[] T01N816_A13196MaqRecLinM ;
   private String[] T01N817_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplnmaq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnmaq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnmaq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnmaq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplnmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01N82", "SELECT MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM, MaqPP, MaqPP2, MaqTexto, MaqRecMaq, EmprCod, MaqCod FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ? AND MaqHdr = ? AND MaqHdrR = ? AND MaqHdrP = ? AND MaqRecLinM = ?  FOR UPDATE OF MaqPP, MaqPP2, MaqTexto, MaqRecMaq NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N83", "SELECT MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM, MaqPP, MaqPP2, MaqTexto, MaqRecMaq, EmprCod, MaqCod FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ? AND MaqHdr = ? AND MaqHdrR = ? AND MaqHdrP = ? AND MaqRecLinM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N84", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N85", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N86", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqHdr, TM1.MaqHdrR, TM1.MaqHdrP, TM1.MaqRecLinM, T2.EmprNom, TM1.MaqPP, TM1.MaqPP2, TM1.MaqTexto, TM1.MaqRecMaq, TM1.EmprCod, TM1.MaqCod FROM (TXPPLNMAQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqHdr = ? and TM1.MaqHdrR = ? and TM1.MaqHdrP = ? and TM1.MaqRecLinM = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqHdr, TM1.MaqHdrR, TM1.MaqHdrP, TM1.MaqRecLinM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N87", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N88", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N89", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ? AND MaqHdr = ? AND MaqHdrR = ? AND MaqHdrP = ? AND MaqRecLinM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N810", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and MaqHdr > ? or MaqHdr = ? and MaqCod = ? and EmprCod = ? and MaqHdrR > ? or MaqHdrR = ? and MaqHdr = ? and MaqCod = ? and EmprCod = ? and MaqHdrP > ? or MaqHdrP = ? and MaqHdrR = ? and MaqHdr = ? and MaqCod = ? and EmprCod = ? and MaqRecLinM > ?) ORDER BY EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N811", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and MaqHdr < ? or MaqHdr = ? and MaqCod = ? and EmprCod = ? and MaqHdrR < ? or MaqHdrR = ? and MaqHdr = ? and MaqCod = ? and EmprCod = ? and MaqHdrP < ? or MaqHdrP = ? and MaqHdrR = ? and MaqHdr = ? and MaqCod = ? and EmprCod = ? and MaqRecLinM < ?) ORDER BY EmprCod DESC, MaqCod DESC, MaqHdr DESC, MaqHdrR DESC, MaqHdrP DESC, MaqRecLinM DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N812", "INSERT INTO TXPPLNMAQ(MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM, MaqPP, MaqPP2, MaqTexto, MaqRecMaq, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPLNMAQ")
         ,new UpdateCursor("T01N813", "UPDATE TXPPLNMAQ SET MaqPP=?, MaqPP2=?, MaqTexto=?, MaqRecMaq=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqHdr = ? AND MaqHdrR = ? AND MaqHdrP = ? AND MaqRecLinM = ?", GX_NOMASK, "TXPPLNMAQ")
         ,new UpdateCursor("T01N814", "DELETE FROM TXPPLNMAQ  WHERE EmprCod = ? AND MaqCod = ? AND MaqHdr = ? AND MaqHdrR = ? AND MaqHdrP = ? AND MaqRecLinM = ?", GX_NOMASK, "TXPPLNMAQ")
         ,new ForEachCursor("T01N815", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N816", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ ORDER BY EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N817", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 6);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 6);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 100);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 6);
               }
               stmt.setString(9, (String)parms[12], 3);
               stmt.setString(10, (String)parms[13], 6);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 6);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 1);
               stmt.setShort(10, ((Number) parms[13]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

