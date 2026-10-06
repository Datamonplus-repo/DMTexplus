package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlreest_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A4075recestncol = (byte)(GXutil.lval( httpContext.GetPar( "recestncol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
         A4076recestnpro = (byte)(GXutil.lval( httpContext.GetPar( "recestnpro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A4075recestncol, A4076recestnpro) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "receta estampacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tlreest_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlreest_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlreest_impl.class ));
   }

   public tlreest_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Tlreest.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "recestncol", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestncol_Internalname, GXutil.ltrim( localUtil.ntoc( A4075recestncol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtrecestncol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4075recestncol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4075recestncol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestncol_Jsonclick, 0, "", "", "", "", "", 1, edtrecestncol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "recestnpro", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestnpro_Internalname, GXutil.ltrim( localUtil.ntoc( A4076recestnpro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtrecestnpro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4076recestnpro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4076recestnpro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestnpro_Jsonclick, 0, "", "", "", "", "", 1, edtrecestnpro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "recestlin", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestlin_Internalname, GXutil.ltrim( localUtil.ntoc( A4108recestlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtrecestlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4108recestlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4108recestlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestlin_Jsonclick, 0, "", "", "", "", "", 1, edtrecestlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "recestprdnum", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestprdn_Internalname, GXutil.rtrim( A4109recestprdn), GXutil.rtrim( localUtil.format( A4109recestprdn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestprdn_Jsonclick, 0, "", "", "", "", "", 1, edtrecestprdn_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "recestprddsc", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestprdd_Internalname, GXutil.rtrim( A4110recestprdd), GXutil.rtrim( localUtil.format( A4110recestprdd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestprdd_Jsonclick, 0, "", "", "", "", "", 1, edtrecestprdd_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "", "", "", "", "", 1, edtForPrdUMe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "recestfaccon", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestfacc_Internalname, GXutil.ltrim( localUtil.ntoc( A4111recestfacc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtrecestfacc_Enabled!=0) ? localUtil.format( A4111recestfacc, "ZZZZ9.99999") : localUtil.format( A4111recestfacc, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestfacc_Jsonclick, 0, "", "", "", "", "", 1, edtrecestfacc_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "recestcant", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestcant_Internalname, GXutil.ltrim( localUtil.ntoc( A4112recestcant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtrecestcant_Enabled!=0) ? localUtil.format( A4112recestcant, "ZZZZZZ9.999") : localUtil.format( A4112recestcant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestcant_Jsonclick, 0, "", "", "", "", "", 1, edtrecestcant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "recestcanf", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtrecestcanf_Internalname, GXutil.ltrim( localUtil.ntoc( A4113recestcanf, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtrecestcanf_Enabled!=0) ? localUtil.format( A4113recestcanf, "ZZZZZZ9.999") : localUtil.format( A4113recestcanf, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtrecestcanf_Jsonclick, 0, "", "", "", "", "", 1, edtrecestcanf_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tlreest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tlreest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_Tlreest.htm");
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
      e111G22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z4075recestncol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4075recestncol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4076recestnpro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4076recestnpro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4108recestlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4108recestlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4109recestprdn = httpContext.cgiGet( "Z4109recestprdn") ;
            Z4110recestprdd = httpContext.cgiGet( "Z4110recestprdd") ;
            Z4111recestfacc = localUtil.ctond( httpContext.cgiGet( "Z4111recestfacc")) ;
            Z4112recestcant = localUtil.ctond( httpContext.cgiGet( "Z4112recestcant")) ;
            Z4113recestcanf = localUtil.ctond( httpContext.cgiGet( "Z4113recestcanf")) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtrecestncol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtrecestncol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTNCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtrecestncol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4075recestncol = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
            }
            else
            {
               A4075recestncol = (byte)(localUtil.ctol( httpContext.cgiGet( edtrecestncol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtrecestnpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtrecestnpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTNPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtrecestnpro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4076recestnpro = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
            }
            else
            {
               A4076recestnpro = (byte)(localUtil.ctol( httpContext.cgiGet( edtrecestnpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtrecestlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtrecestlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtrecestlin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4108recestlin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
            }
            else
            {
               A4108recestlin = (short)(localUtil.ctol( httpContext.cgiGet( edtrecestlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
            }
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A4109recestprdn = httpContext.cgiGet( edtrecestprdn_Internalname) ;
            n4109recestprdn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4109recestprdn", A4109recestprdn);
            A4110recestprdd = httpContext.cgiGet( edtrecestprdd_Internalname) ;
            n4110recestprdd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4110recestprdd", A4110recestprdd);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A490ForPrdUMe = (byte)(0) ;
               n490ForPrdUMe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            }
            else
            {
               A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n490ForPrdUMe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtrecestfacc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtrecestfacc_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTFACC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtrecestfacc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4111recestfacc = DecimalUtil.ZERO ;
               n4111recestfacc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4111recestfacc", GXutil.ltrimstr( A4111recestfacc, 11, 5));
            }
            else
            {
               A4111recestfacc = localUtil.ctond( httpContext.cgiGet( edtrecestfacc_Internalname)) ;
               n4111recestfacc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4111recestfacc", GXutil.ltrimstr( A4111recestfacc, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtrecestcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtrecestcant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTCANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtrecestcant_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4112recestcant = DecimalUtil.ZERO ;
               n4112recestcant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4112recestcant", GXutil.ltrimstr( A4112recestcant, 11, 3));
            }
            else
            {
               A4112recestcant = localUtil.ctond( httpContext.cgiGet( edtrecestcant_Internalname)) ;
               n4112recestcant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4112recestcant", GXutil.ltrimstr( A4112recestcant, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtrecestcanf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtrecestcanf_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTCANF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtrecestcanf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4113recestcanf = DecimalUtil.ZERO ;
               n4113recestcanf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4113recestcanf", GXutil.ltrimstr( A4113recestcanf, 11, 3));
            }
            else
            {
               A4113recestcanf = localUtil.ctond( httpContext.cgiGet( edtrecestcanf_Internalname)) ;
               n4113recestcanf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4113recestcanf", GXutil.ltrimstr( A4113recestcanf, 11, 3));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A4075recestncol = (byte)(GXutil.lval( httpContext.GetPar( "recestncol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
               A4076recestnpro = (byte)(GXutil.lval( httpContext.GetPar( "recestnpro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
               A4108recestlin = (short)(GXutil.lval( httpContext.GetPar( "recestlin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
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
                        e111G22 ();
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
            initAll1G21594( ) ;
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
      disableAttributes1G21594( ) ;
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

   public void confirm_1G20( )
   {
      beforeValidate1G21594( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G21594( ) ;
         }
         else
         {
            checkExtendedTable1G21594( ) ;
            if ( AnyError == 0 )
            {
               zm1G21594( 3) ;
               zm1G21594( 4) ;
               zm1G21594( 5) ;
               zm1G21594( 6) ;
            }
            closeExtendedTableCursors1G21594( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1G20( ) ;
      }
   }

   public void resetCaption1G20( )
   {
   }

   public void e111G22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tlreest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tlreest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tlreest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlreest_impl.this.A396EmprCod = GXv_char2[0] ;
      tlreest_impl.this.AV11EmprNom = GXv_char3[0] ;
      tlreest_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1G21594( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4109recestprdn = T01G23_A4109recestprdn[0] ;
            Z4110recestprdd = T01G23_A4110recestprdd[0] ;
            Z4111recestfacc = T01G23_A4111recestfacc[0] ;
            Z4112recestcant = T01G23_A4112recestcant[0] ;
            Z4113recestcanf = T01G23_A4113recestcanf[0] ;
            Z719PrdNum = T01G23_A719PrdNum[0] ;
            Z490ForPrdUMe = T01G23_A490ForPrdUMe[0] ;
         }
         else
         {
            Z4109recestprdn = A4109recestprdn ;
            Z4110recestprdd = A4110recestprdd ;
            Z4111recestfacc = A4111recestfacc ;
            Z4112recestcant = A4112recestcant ;
            Z4113recestcanf = A4113recestcanf ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4108recestlin = A4108recestlin ;
         Z4109recestprdn = A4109recestprdn ;
         Z4110recestprdd = A4110recestprdd ;
         Z4111recestfacc = A4111recestfacc ;
         Z4112recestcant = A4112recestcant ;
         Z4113recestcanf = A4113recestcanf ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z4075recestncol = A4075recestncol ;
         Z4076recestnpro = A4076recestnpro ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "Tlreest" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01G24 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G24_A407EmprNom[0] ;
      n407EmprNom = T01G24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load1G21594( )
   {
      /* Using cursor T01G28 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro), Short.valueOf(A4108recestlin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1594 = (short)(1) ;
         A4109recestprdn = T01G28_A4109recestprdn[0] ;
         n4109recestprdn = T01G28_n4109recestprdn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4109recestprdn", A4109recestprdn);
         A4110recestprdd = T01G28_A4110recestprdd[0] ;
         n4110recestprdd = T01G28_n4110recestprdd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4110recestprdd", A4110recestprdd);
         A4111recestfacc = T01G28_A4111recestfacc[0] ;
         n4111recestfacc = T01G28_n4111recestfacc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4111recestfacc", GXutil.ltrimstr( A4111recestfacc, 11, 5));
         A4112recestcant = T01G28_A4112recestcant[0] ;
         n4112recestcant = T01G28_n4112recestcant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4112recestcant", GXutil.ltrimstr( A4112recestcant, 11, 3));
         A4113recestcanf = T01G28_A4113recestcanf[0] ;
         n4113recestcanf = T01G28_n4113recestcanf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4113recestcanf", GXutil.ltrimstr( A4113recestcanf, 11, 3));
         A407EmprNom = T01G28_A407EmprNom[0] ;
         n407EmprNom = T01G28_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A719PrdNum = T01G28_A719PrdNum[0] ;
         n719PrdNum = T01G28_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01G28_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01G28_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         zm1G21594( -2) ;
      }
      pr_default.close(6);
      onLoadActions1G21594( ) ;
   }

   public void onLoadActions1G21594( )
   {
   }

   public void checkExtendedTable1G21594( )
   {
      nIsDirty_1594 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01G25 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01G26 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T01G27 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "creest", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECESTNPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1G21594( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01G29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_5( String A396EmprCod ,
                         byte A490ForPrdUMe )
   {
      /* Using cursor T01G210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_6( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         byte A4075recestncol ,
                         byte A4076recestnpro )
   {
      /* Using cursor T01G211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "creest", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECESTNPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1G21594( )
   {
      /* Using cursor T01G212 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro), Short.valueOf(A4108recestlin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1594 = (short)(1) ;
      }
      else
      {
         RcdFound1594 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01G23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro), Short.valueOf(A4108recestlin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01G23_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G21594( 2) ;
         RcdFound1594 = (short)(1) ;
         A4108recestlin = T01G23_A4108recestlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
         A4109recestprdn = T01G23_A4109recestprdn[0] ;
         n4109recestprdn = T01G23_n4109recestprdn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4109recestprdn", A4109recestprdn);
         A4110recestprdd = T01G23_A4110recestprdd[0] ;
         n4110recestprdd = T01G23_n4110recestprdd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4110recestprdd", A4110recestprdd);
         A4111recestfacc = T01G23_A4111recestfacc[0] ;
         n4111recestfacc = T01G23_n4111recestfacc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4111recestfacc", GXutil.ltrimstr( A4111recestfacc, 11, 5));
         A4112recestcant = T01G23_A4112recestcant[0] ;
         n4112recestcant = T01G23_n4112recestcant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4112recestcant", GXutil.ltrimstr( A4112recestcant, 11, 3));
         A4113recestcanf = T01G23_A4113recestcanf[0] ;
         n4113recestcanf = T01G23_n4113recestcanf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4113recestcanf", GXutil.ltrimstr( A4113recestcanf, 11, 3));
         A129BarCod = T01G23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01G23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01G23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A719PrdNum = T01G23_A719PrdNum[0] ;
         n719PrdNum = T01G23_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01G23_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01G23_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A4075recestncol = T01G23_A4075recestncol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
         A4076recestnpro = T01G23_A4076recestnpro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z4075recestncol = A4075recestncol ;
         Z4076recestnpro = A4076recestnpro ;
         Z4108recestlin = A4108recestlin ;
         sMode1594 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G21594( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1594 = (short)(0) ;
            initializeNonKey1G21594( ) ;
         }
         Gx_mode = sMode1594 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1594 = (short)(0) ;
         initializeNonKey1G21594( ) ;
         sMode1594 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1594 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1G21594( ) ;
      if ( RcdFound1594 == 0 )
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
      RcdFound1594 = (short)(0) ;
      /* Using cursor T01G213 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A4075recestncol), Byte.valueOf(A4075recestncol), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A4076recestnpro), Byte.valueOf(A4076recestnpro), Byte.valueOf(A4075recestncol), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A4108recestlin), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01G213_A129BarCod[0] < A129BarCod ) || ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A132BarCodReo[0] < A132BarCodReo ) || ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A4075recestncol[0] < A4075recestncol ) || ( T01G213_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A4076recestnpro[0] < A4076recestnpro ) || ( T01G213_A4076recestnpro[0] == A4076recestnpro ) && ( T01G213_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A4108recestlin[0] < A4108recestlin ) ) && ( GXutil.strcmp(T01G213_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01G213_A129BarCod[0] > A129BarCod ) || ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A132BarCodReo[0] > A132BarCodReo ) || ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A4075recestncol[0] > A4075recestncol ) || ( T01G213_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A4076recestnpro[0] > A4076recestnpro ) || ( T01G213_A4076recestnpro[0] == A4076recestnpro ) && ( T01G213_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G213_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G213_A132BarCodReo[0] == A132BarCodReo ) && ( T01G213_A129BarCod[0] == A129BarCod ) && ( T01G213_A4108recestlin[0] > A4108recestlin ) ) && ( GXutil.strcmp(T01G213_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01G213_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01G213_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01G213_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A4075recestncol = T01G213_A4075recestncol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
            A4076recestnpro = T01G213_A4076recestnpro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
            A4108recestlin = T01G213_A4108recestlin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
            RcdFound1594 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1594 = (short)(0) ;
      /* Using cursor T01G214 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A4075recestncol), Byte.valueOf(A4075recestncol), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A4076recestnpro), Byte.valueOf(A4076recestnpro), Byte.valueOf(A4075recestncol), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A4108recestlin), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01G214_A129BarCod[0] > A129BarCod ) || ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A132BarCodReo[0] > A132BarCodReo ) || ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A4075recestncol[0] > A4075recestncol ) || ( T01G214_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A4076recestnpro[0] > A4076recestnpro ) || ( T01G214_A4076recestnpro[0] == A4076recestnpro ) && ( T01G214_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A4108recestlin[0] > A4108recestlin ) ) && ( GXutil.strcmp(T01G214_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01G214_A129BarCod[0] < A129BarCod ) || ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A132BarCodReo[0] < A132BarCodReo ) || ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A4075recestncol[0] < A4075recestncol ) || ( T01G214_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A4076recestnpro[0] < A4076recestnpro ) || ( T01G214_A4076recestnpro[0] == A4076recestnpro ) && ( T01G214_A4075recestncol[0] == A4075recestncol ) && ( GXutil.strcmp(T01G214_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01G214_A132BarCodReo[0] == A132BarCodReo ) && ( T01G214_A129BarCod[0] == A129BarCod ) && ( T01G214_A4108recestlin[0] < A4108recestlin ) ) && ( GXutil.strcmp(T01G214_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01G214_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01G214_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01G214_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A4075recestncol = T01G214_A4075recestncol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
            A4076recestnpro = T01G214_A4076recestnpro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
            A4108recestlin = T01G214_A4108recestlin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
            RcdFound1594 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G21594( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G21594( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1594 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A4075recestncol != Z4075recestncol ) || ( A4076recestnpro != Z4076recestnpro ) || ( A4108recestlin != Z4108recestlin ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A4075recestncol = Z4075recestncol ;
               httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
               A4076recestnpro = Z4076recestnpro ;
               httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
               A4108recestlin = Z4108recestlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1G21594( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A4075recestncol != Z4075recestncol ) || ( A4076recestnpro != Z4076recestnpro ) || ( A4108recestlin != Z4108recestlin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G21594( ) ;
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
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1G21594( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A4075recestncol != Z4075recestncol ) || ( A4076recestnpro != Z4076recestnpro ) || ( A4108recestlin != Z4108recestlin ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A4075recestncol = Z4075recestncol ;
         httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
         A4076recestnpro = Z4076recestnpro ;
         httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
         A4108recestlin = Z4108recestlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKey1G21594( ) ;
      if ( RcdFound1594 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A4075recestncol != Z4075recestncol ) || ( A4076recestnpro != Z4076recestnpro ) || ( A4108recestlin != Z4108recestlin ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A4075recestncol = Z4075recestncol ;
            httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
            A4076recestnpro = Z4076recestnpro ;
            httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
            A4108recestlin = Z4108recestlin ;
            httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A4075recestncol != Z4075recestncol ) || ( A4076recestnpro != Z4076recestnpro ) || ( A4108recestlin != Z4108recestlin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tlreest");
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1G20( ) ;
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
      if ( RcdFound1594 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1G21594( ) ;
      if ( RcdFound1594 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G21594( ) ;
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
      if ( RcdFound1594 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
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
      if ( RcdFound1594 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
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
      scanStart1G21594( ) ;
      if ( RcdFound1594 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1594 != 0 )
         {
            scanNext1G21594( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G21594( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G21594( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro), Short.valueOf(A4108recestlin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPlreest"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4109recestprdn, T01G22_A4109recestprdn[0]) != 0 ) || ( GXutil.strcmp(Z4110recestprdd, T01G22_A4110recestprdd[0]) != 0 ) || ( DecimalUtil.compareTo(Z4111recestfacc, T01G22_A4111recestfacc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4112recestcant, T01G22_A4112recestcant[0]) != 0 ) || ( DecimalUtil.compareTo(Z4113recestcanf, T01G22_A4113recestcanf[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z719PrdNum, T01G22_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01G22_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z4109recestprdn, T01G22_A4109recestprdn[0]) != 0 )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"recestprdn");
               GXutil.writeLogRaw("Old: ",Z4109recestprdn);
               GXutil.writeLogRaw("Current: ",T01G22_A4109recestprdn[0]);
            }
            if ( GXutil.strcmp(Z4110recestprdd, T01G22_A4110recestprdd[0]) != 0 )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"recestprdd");
               GXutil.writeLogRaw("Old: ",Z4110recestprdd);
               GXutil.writeLogRaw("Current: ",T01G22_A4110recestprdd[0]);
            }
            if ( DecimalUtil.compareTo(Z4111recestfacc, T01G22_A4111recestfacc[0]) != 0 )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"recestfacc");
               GXutil.writeLogRaw("Old: ",Z4111recestfacc);
               GXutil.writeLogRaw("Current: ",T01G22_A4111recestfacc[0]);
            }
            if ( DecimalUtil.compareTo(Z4112recestcant, T01G22_A4112recestcant[0]) != 0 )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"recestcant");
               GXutil.writeLogRaw("Old: ",Z4112recestcant);
               GXutil.writeLogRaw("Current: ",T01G22_A4112recestcant[0]);
            }
            if ( DecimalUtil.compareTo(Z4113recestcanf, T01G22_A4113recestcanf[0]) != 0 )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"recestcanf");
               GXutil.writeLogRaw("Old: ",Z4113recestcanf);
               GXutil.writeLogRaw("Current: ",T01G22_A4113recestcanf[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01G22_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01G22_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01G22_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("tlreest:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01G22_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPlreest"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G21594( )
   {
      beforeValidate1G21594( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G21594( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G21594( 0) ;
         checkOptimisticConcurrency1G21594( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G21594( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G21594( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G215 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A4108recestlin), Boolean.valueOf(n4109recestprdn), A4109recestprdn, Boolean.valueOf(n4110recestprdd), A4110recestprdd, Boolean.valueOf(n4111recestfacc), A4111recestfacc, Boolean.valueOf(n4112recestcant), A4112recestcant, Boolean.valueOf(n4113recestcanf), A4113recestcanf, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPlreest");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        resetCaption1G20( ) ;
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
            load1G21594( ) ;
         }
         endLevel1G21594( ) ;
      }
      closeExtendedTableCursors1G21594( ) ;
   }

   public void update1G21594( )
   {
      beforeValidate1G21594( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G21594( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G21594( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G21594( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G21594( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G216 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n4109recestprdn), A4109recestprdn, Boolean.valueOf(n4110recestprdd), A4110recestprdd, Boolean.valueOf(n4111recestfacc), A4111recestfacc, Boolean.valueOf(n4112recestcant), A4112recestcant, Boolean.valueOf(n4113recestcanf), A4113recestcanf, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro), Short.valueOf(A4108recestlin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPlreest");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPlreest"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G21594( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1G20( ) ;
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
         endLevel1G21594( ) ;
      }
      closeExtendedTableCursors1G21594( ) ;
   }

   public void deferredUpdate1G21594( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G21594( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G21594( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G21594( ) ;
         afterConfirm1G21594( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G21594( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01G217 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro), Short.valueOf(A4108recestlin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPlreest");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1594 == 0 )
                     {
                        initAll1G21594( ) ;
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
                     resetCaption1G20( ) ;
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
      sMode1594 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G21594( ) ;
      Gx_mode = sMode1594 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G21594( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G21594( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1G21594( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlreest");
         if ( AnyError == 0 )
         {
            confirmValues1G20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlreest");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G21594( )
   {
      /* Scan By routine */
      /* Using cursor T01G218 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1594 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1594 = (short)(1) ;
         A129BarCod = T01G218_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01G218_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01G218_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A4075recestncol = T01G218_A4075recestncol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
         A4076recestnpro = T01G218_A4076recestnpro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
         A4108recestlin = T01G218_A4108recestlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G21594( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1594 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1594 = (short)(1) ;
         A129BarCod = T01G218_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01G218_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01G218_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A4075recestncol = T01G218_A4075recestncol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
         A4076recestnpro = T01G218_A4076recestnpro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
         A4108recestlin = T01G218_A4108recestlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
      }
   }

   public void scanEnd1G21594( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1G21594( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G21594( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G21594( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G21594( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G21594( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G21594( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G21594( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtrecestncol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestncol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestncol_Enabled), 5, 0), true);
      edtrecestnpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestnpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestnpro_Enabled), 5, 0), true);
      edtrecestlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestlin_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtrecestprdn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestprdn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestprdn_Enabled), 5, 0), true);
      edtrecestprdd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestprdd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestprdd_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtrecestfacc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestfacc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestfacc_Enabled), 5, 0), true);
      edtrecestcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestcant_Enabled), 5, 0), true);
      edtrecestcanf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtrecestcanf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtrecestcanf_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1G21594( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1G20( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tlreest", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4075recestncol", GXutil.ltrim( localUtil.ntoc( Z4075recestncol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4076recestnpro", GXutil.ltrim( localUtil.ntoc( Z4076recestnpro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4108recestlin", GXutil.ltrim( localUtil.ntoc( Z4108recestlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4109recestprdn", GXutil.rtrim( Z4109recestprdn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4110recestprdd", GXutil.rtrim( Z4110recestprdd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4111recestfacc", GXutil.ltrim( localUtil.ntoc( Z4111recestfacc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4112recestcant", GXutil.ltrim( localUtil.ntoc( Z4112recestcant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4113recestcanf", GXutil.ltrim( localUtil.ntoc( Z4113recestcanf, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tlreest", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Tlreest" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "receta estampacion", "") ;
   }

   public void initializeNonKey1G21594( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A4109recestprdn = "" ;
      n4109recestprdn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4109recestprdn", A4109recestprdn);
      A4110recestprdd = "" ;
      n4110recestprdd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4110recestprdd", A4110recestprdd);
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A4111recestfacc = DecimalUtil.ZERO ;
      n4111recestfacc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4111recestfacc", GXutil.ltrimstr( A4111recestfacc, 11, 5));
      A4112recestcant = DecimalUtil.ZERO ;
      n4112recestcant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4112recestcant", GXutil.ltrimstr( A4112recestcant, 11, 3));
      A4113recestcanf = DecimalUtil.ZERO ;
      n4113recestcanf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4113recestcanf", GXutil.ltrimstr( A4113recestcanf, 11, 3));
      Z4109recestprdn = "" ;
      Z4110recestprdd = "" ;
      Z4111recestfacc = DecimalUtil.ZERO ;
      Z4112recestcant = DecimalUtil.ZERO ;
      Z4113recestcanf = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1G21594( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A4075recestncol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4075recestncol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4075recestncol), 2, 0));
      A4076recestnpro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4076recestnpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4076recestnpro), 2, 0));
      A4108recestlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4108recestlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4108recestlin), 4, 0));
      initializeNonKey1G21594( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241574039", true, true);
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
      httpContext.AddJavascriptSource("tlreest.js", "?20268241574040", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtrecestncol_Internalname = "RECESTNCOL" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtrecestnpro_Internalname = "RECESTNPRO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtrecestlin_Internalname = "RECESTLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtrecestprdn_Internalname = "RECESTPRDN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtrecestprdd_Internalname = "RECESTPRDD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtrecestfacc_Internalname = "RECESTFACC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtrecestcant_Internalname = "RECESTCANT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtrecestcanf_Internalname = "RECESTCANF" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "receta estampacion", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtrecestcanf_Jsonclick = "" ;
      edtrecestcanf_Backcolor = (int)(0xFFFFFF) ;
      edtrecestcanf_Enabled = 1 ;
      edtrecestcant_Jsonclick = "" ;
      edtrecestcant_Backcolor = (int)(0xFFFFFF) ;
      edtrecestcant_Enabled = 1 ;
      edtrecestfacc_Jsonclick = "" ;
      edtrecestfacc_Backcolor = (int)(0xFFFFFF) ;
      edtrecestfacc_Enabled = 1 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Backcolor = (int)(0xFFFFFF) ;
      edtForPrdUMe_Enabled = 1 ;
      edtrecestprdd_Jsonclick = "" ;
      edtrecestprdd_Backcolor = (int)(0xFFFFFF) ;
      edtrecestprdd_Enabled = 1 ;
      edtrecestprdn_Jsonclick = "" ;
      edtrecestprdn_Backcolor = (int)(0xFFFFFF) ;
      edtrecestprdn_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtrecestlin_Jsonclick = "" ;
      edtrecestlin_Backcolor = (int)(0xFFFFFF) ;
      edtrecestlin_Enabled = 1 ;
      edtrecestnpro_Jsonclick = "" ;
      edtrecestnpro_Backcolor = (int)(0xFFFFFF) ;
      edtrecestnpro_Enabled = 1 ;
      edtrecestncol_Jsonclick = "" ;
      edtrecestncol_Backcolor = (int)(0xFFFFFF) ;
      edtrecestncol_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01G219 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G219_A407EmprNom[0] ;
      n407EmprNom = T01G219_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T01G220 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "creest", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECESTNPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(18);
      GX_FocusControl = edtPrdNum_Internalname ;
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

   public void valid_Recestnpro( )
   {
      /* Using cursor T01G220 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A4075recestncol), Byte.valueOf(A4076recestnpro)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "creest", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECESTNPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Recestlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A4109recestprdn", GXutil.rtrim( A4109recestprdn));
      httpContext.ajax_rsp_assign_attri("", false, "A4110recestprdd", GXutil.rtrim( A4110recestprdd));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4111recestfacc", GXutil.ltrim( localUtil.ntoc( A4111recestfacc, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4112recestcant", GXutil.ltrim( localUtil.ntoc( A4112recestcant, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4113recestcanf", GXutil.ltrim( localUtil.ntoc( A4113recestcanf, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4075recestncol", GXutil.ltrim( localUtil.ntoc( Z4075recestncol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4076recestnpro", GXutil.ltrim( localUtil.ntoc( Z4076recestnpro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4108recestlin", GXutil.ltrim( localUtil.ntoc( Z4108recestlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4109recestprdn", GXutil.rtrim( Z4109recestprdn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4110recestprdd", GXutil.rtrim( Z4110recestprdd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4111recestfacc", GXutil.ltrim( localUtil.ntoc( Z4111recestfacc, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4112recestcant", GXutil.ltrim( localUtil.ntoc( Z4112recestcant, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4113recestcanf", GXutil.ltrim( localUtil.ntoc( Z4113recestcanf, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01G221 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      /* Using cursor T01G222 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      pr_default.close(20);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECESTNCOL","{handler:'valid_Recestncol',iparms:[]");
      setEventMetadata("VALID_RECESTNCOL",",oparms:[]}");
      setEventMetadata("VALID_RECESTNPRO","{handler:'valid_Recestnpro',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4075recestncol',fld:'RECESTNCOL',pic:'Z9'},{av:'A4076recestnpro',fld:'RECESTNPRO',pic:'Z9'}]");
      setEventMetadata("VALID_RECESTNPRO",",oparms:[]}");
      setEventMetadata("VALID_RECESTLIN","{handler:'valid_Recestlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4075recestncol',fld:'RECESTNCOL',pic:'Z9'},{av:'A4076recestnpro',fld:'RECESTNPRO',pic:'Z9'},{av:'A4108recestlin',fld:'RECESTLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECESTLIN",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4109recestprdn',fld:'RECESTPRDN',pic:''},{av:'A4110recestprdd',fld:'RECESTPRDD',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A4111recestfacc',fld:'RECESTFACC',pic:'ZZZZ9.99999'},{av:'A4112recestcant',fld:'RECESTCANT',pic:'ZZZZZZ9.999'},{av:'A4113recestcanf',fld:'RECESTCANF',pic:'ZZZZZZ9.999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z4075recestncol'},{av:'Z4076recestnpro'},{av:'Z4108recestlin'},{av:'Z719PrdNum'},{av:'Z4109recestprdn'},{av:'Z4110recestprdd'},{av:'Z490ForPrdUMe'},{av:'Z4111recestfacc'},{av:'Z4112recestcant'},{av:'Z4113recestcanf'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
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
      pr_default.close(20);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z4109recestprdn = "" ;
      Z4110recestprdd = "" ;
      Z4111recestfacc = DecimalUtil.ZERO ;
      Z4112recestcant = DecimalUtil.ZERO ;
      Z4113recestcanf = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A130BarCodPar = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A4109recestprdn = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4110recestprdd = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4111recestfacc = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A4112recestcant = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A4113recestcanf = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A407EmprNom = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      T01G24_A407EmprNom = new String[] {""} ;
      T01G24_n407EmprNom = new boolean[] {false} ;
      T01G28_A4108recestlin = new short[1] ;
      T01G28_A4109recestprdn = new String[] {""} ;
      T01G28_n4109recestprdn = new boolean[] {false} ;
      T01G28_A4110recestprdd = new String[] {""} ;
      T01G28_n4110recestprdd = new boolean[] {false} ;
      T01G28_A4111recestfacc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G28_n4111recestfacc = new boolean[] {false} ;
      T01G28_A4112recestcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G28_n4112recestcant = new boolean[] {false} ;
      T01G28_A4113recestcanf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G28_n4113recestcanf = new boolean[] {false} ;
      T01G28_A407EmprNom = new String[] {""} ;
      T01G28_n407EmprNom = new boolean[] {false} ;
      T01G28_A396EmprCod = new String[] {""} ;
      T01G28_A129BarCod = new int[1] ;
      T01G28_A132BarCodReo = new byte[1] ;
      T01G28_A130BarCodPar = new String[] {""} ;
      T01G28_A719PrdNum = new String[] {""} ;
      T01G28_n719PrdNum = new boolean[] {false} ;
      T01G28_A490ForPrdUMe = new byte[1] ;
      T01G28_n490ForPrdUMe = new boolean[] {false} ;
      T01G28_A4075recestncol = new byte[1] ;
      T01G28_A4076recestnpro = new byte[1] ;
      T01G25_A396EmprCod = new String[] {""} ;
      T01G26_A396EmprCod = new String[] {""} ;
      T01G27_A396EmprCod = new String[] {""} ;
      T01G29_A396EmprCod = new String[] {""} ;
      T01G210_A396EmprCod = new String[] {""} ;
      T01G211_A396EmprCod = new String[] {""} ;
      T01G212_A396EmprCod = new String[] {""} ;
      T01G212_A129BarCod = new int[1] ;
      T01G212_A132BarCodReo = new byte[1] ;
      T01G212_A130BarCodPar = new String[] {""} ;
      T01G212_A4075recestncol = new byte[1] ;
      T01G212_A4076recestnpro = new byte[1] ;
      T01G212_A4108recestlin = new short[1] ;
      T01G23_A4108recestlin = new short[1] ;
      T01G23_A4109recestprdn = new String[] {""} ;
      T01G23_n4109recestprdn = new boolean[] {false} ;
      T01G23_A4110recestprdd = new String[] {""} ;
      T01G23_n4110recestprdd = new boolean[] {false} ;
      T01G23_A4111recestfacc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G23_n4111recestfacc = new boolean[] {false} ;
      T01G23_A4112recestcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G23_n4112recestcant = new boolean[] {false} ;
      T01G23_A4113recestcanf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G23_n4113recestcanf = new boolean[] {false} ;
      T01G23_A396EmprCod = new String[] {""} ;
      T01G23_A129BarCod = new int[1] ;
      T01G23_A132BarCodReo = new byte[1] ;
      T01G23_A130BarCodPar = new String[] {""} ;
      T01G23_A719PrdNum = new String[] {""} ;
      T01G23_n719PrdNum = new boolean[] {false} ;
      T01G23_A490ForPrdUMe = new byte[1] ;
      T01G23_n490ForPrdUMe = new boolean[] {false} ;
      T01G23_A4075recestncol = new byte[1] ;
      T01G23_A4076recestnpro = new byte[1] ;
      sMode1594 = "" ;
      T01G213_A396EmprCod = new String[] {""} ;
      T01G213_A129BarCod = new int[1] ;
      T01G213_A132BarCodReo = new byte[1] ;
      T01G213_A130BarCodPar = new String[] {""} ;
      T01G213_A4075recestncol = new byte[1] ;
      T01G213_A4076recestnpro = new byte[1] ;
      T01G213_A4108recestlin = new short[1] ;
      T01G214_A396EmprCod = new String[] {""} ;
      T01G214_A129BarCod = new int[1] ;
      T01G214_A132BarCodReo = new byte[1] ;
      T01G214_A130BarCodPar = new String[] {""} ;
      T01G214_A4075recestncol = new byte[1] ;
      T01G214_A4076recestnpro = new byte[1] ;
      T01G214_A4108recestlin = new short[1] ;
      T01G22_A4108recestlin = new short[1] ;
      T01G22_A4109recestprdn = new String[] {""} ;
      T01G22_n4109recestprdn = new boolean[] {false} ;
      T01G22_A4110recestprdd = new String[] {""} ;
      T01G22_n4110recestprdd = new boolean[] {false} ;
      T01G22_A4111recestfacc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G22_n4111recestfacc = new boolean[] {false} ;
      T01G22_A4112recestcant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G22_n4112recestcant = new boolean[] {false} ;
      T01G22_A4113recestcanf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G22_n4113recestcanf = new boolean[] {false} ;
      T01G22_A396EmprCod = new String[] {""} ;
      T01G22_A129BarCod = new int[1] ;
      T01G22_A132BarCodReo = new byte[1] ;
      T01G22_A130BarCodPar = new String[] {""} ;
      T01G22_A719PrdNum = new String[] {""} ;
      T01G22_n719PrdNum = new boolean[] {false} ;
      T01G22_A490ForPrdUMe = new byte[1] ;
      T01G22_n490ForPrdUMe = new boolean[] {false} ;
      T01G22_A4075recestncol = new byte[1] ;
      T01G22_A4076recestnpro = new byte[1] ;
      T01G218_A396EmprCod = new String[] {""} ;
      T01G218_A129BarCod = new int[1] ;
      T01G218_A132BarCodReo = new byte[1] ;
      T01G218_A130BarCodPar = new String[] {""} ;
      T01G218_A4075recestncol = new byte[1] ;
      T01G218_A4076recestnpro = new byte[1] ;
      T01G218_A4108recestlin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01G219_A407EmprNom = new String[] {""} ;
      T01G219_n407EmprNom = new boolean[] {false} ;
      T01G220_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ719PrdNum = "" ;
      ZZ4109recestprdn = "" ;
      ZZ4110recestprdd = "" ;
      ZZ4111recestfacc = DecimalUtil.ZERO ;
      ZZ4112recestcant = DecimalUtil.ZERO ;
      ZZ4113recestcanf = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      T01G221_A396EmprCod = new String[] {""} ;
      T01G222_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tlreest__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlreest__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlreest__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlreest__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlreest__default(),
         new Object[] {
             new Object[] {
            T01G22_A4108recestlin, T01G22_A4109recestprdn, T01G22_n4109recestprdn, T01G22_A4110recestprdd, T01G22_n4110recestprdd, T01G22_A4111recestfacc, T01G22_n4111recestfacc, T01G22_A4112recestcant, T01G22_n4112recestcant, T01G22_A4113recestcanf,
            T01G22_n4113recestcanf, T01G22_A396EmprCod, T01G22_A129BarCod, T01G22_A132BarCodReo, T01G22_A130BarCodPar, T01G22_A719PrdNum, T01G22_n719PrdNum, T01G22_A490ForPrdUMe, T01G22_n490ForPrdUMe, T01G22_A4075recestncol,
            T01G22_A4076recestnpro
            }
            , new Object[] {
            T01G23_A4108recestlin, T01G23_A4109recestprdn, T01G23_n4109recestprdn, T01G23_A4110recestprdd, T01G23_n4110recestprdd, T01G23_A4111recestfacc, T01G23_n4111recestfacc, T01G23_A4112recestcant, T01G23_n4112recestcant, T01G23_A4113recestcanf,
            T01G23_n4113recestcanf, T01G23_A396EmprCod, T01G23_A129BarCod, T01G23_A132BarCodReo, T01G23_A130BarCodPar, T01G23_A719PrdNum, T01G23_n719PrdNum, T01G23_A490ForPrdUMe, T01G23_n490ForPrdUMe, T01G23_A4075recestncol,
            T01G23_A4076recestnpro
            }
            , new Object[] {
            T01G24_A407EmprNom, T01G24_n407EmprNom
            }
            , new Object[] {
            T01G25_A396EmprCod
            }
            , new Object[] {
            T01G26_A396EmprCod
            }
            , new Object[] {
            T01G27_A396EmprCod
            }
            , new Object[] {
            T01G28_A4108recestlin, T01G28_A4109recestprdn, T01G28_n4109recestprdn, T01G28_A4110recestprdd, T01G28_n4110recestprdd, T01G28_A4111recestfacc, T01G28_n4111recestfacc, T01G28_A4112recestcant, T01G28_n4112recestcant, T01G28_A4113recestcanf,
            T01G28_n4113recestcanf, T01G28_A407EmprNom, T01G28_n407EmprNom, T01G28_A396EmprCod, T01G28_A129BarCod, T01G28_A132BarCodReo, T01G28_A130BarCodPar, T01G28_A719PrdNum, T01G28_n719PrdNum, T01G28_A490ForPrdUMe,
            T01G28_n490ForPrdUMe, T01G28_A4075recestncol, T01G28_A4076recestnpro
            }
            , new Object[] {
            T01G29_A396EmprCod
            }
            , new Object[] {
            T01G210_A396EmprCod
            }
            , new Object[] {
            T01G211_A396EmprCod
            }
            , new Object[] {
            T01G212_A396EmprCod, T01G212_A129BarCod, T01G212_A132BarCodReo, T01G212_A130BarCodPar, T01G212_A4075recestncol, T01G212_A4076recestnpro, T01G212_A4108recestlin
            }
            , new Object[] {
            T01G213_A396EmprCod, T01G213_A129BarCod, T01G213_A132BarCodReo, T01G213_A130BarCodPar, T01G213_A4075recestncol, T01G213_A4076recestnpro, T01G213_A4108recestlin
            }
            , new Object[] {
            T01G214_A396EmprCod, T01G214_A129BarCod, T01G214_A132BarCodReo, T01G214_A130BarCodPar, T01G214_A4075recestncol, T01G214_A4076recestnpro, T01G214_A4108recestlin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G218_A396EmprCod, T01G218_A129BarCod, T01G218_A132BarCodReo, T01G218_A130BarCodPar, T01G218_A4075recestncol, T01G218_A4076recestnpro, T01G218_A4108recestlin
            }
            , new Object[] {
            T01G219_A407EmprNom, T01G219_n407EmprNom
            }
            , new Object[] {
            T01G220_A396EmprCod
            }
            , new Object[] {
            T01G221_A396EmprCod
            }
            , new Object[] {
            T01G222_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "Tlreest" ;
   }

   private byte Z132BarCodReo ;
   private byte Z4075recestncol ;
   private byte Z4076recestnpro ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte A4075recestncol ;
   private byte A4076recestnpro ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ4075recestncol ;
   private byte ZZ4076recestnpro ;
   private byte ZZ490ForPrdUMe ;
   private short Z4108recestlin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4108recestlin ;
   private short RcdFound1594 ;
   private short nIsDirty_1594 ;
   private short ZZ4108recestlin ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtrecestncol_Enabled ;
   private int edtrecestnpro_Enabled ;
   private int edtrecestlin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtrecestprdn_Enabled ;
   private int edtrecestprdd_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtrecestfacc_Enabled ;
   private int edtrecestcant_Enabled ;
   private int edtrecestcanf_Enabled ;
   private int edtEmprNom_Enabled ;
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
   private int edtEmprNom_Backcolor ;
   private int edtrecestcanf_Backcolor ;
   private int edtrecestcant_Backcolor ;
   private int edtrecestfacc_Backcolor ;
   private int edtForPrdUMe_Backcolor ;
   private int edtrecestprdd_Backcolor ;
   private int edtrecestprdn_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtrecestlin_Backcolor ;
   private int edtrecestnpro_Backcolor ;
   private int edtrecestncol_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private java.math.BigDecimal Z4111recestfacc ;
   private java.math.BigDecimal Z4112recestcant ;
   private java.math.BigDecimal Z4113recestcanf ;
   private java.math.BigDecimal A4111recestfacc ;
   private java.math.BigDecimal A4112recestcant ;
   private java.math.BigDecimal A4113recestcanf ;
   private java.math.BigDecimal ZZ4111recestfacc ;
   private java.math.BigDecimal ZZ4112recestcant ;
   private java.math.BigDecimal ZZ4113recestcanf ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z4109recestprdn ;
   private String Z4110recestprdd ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
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
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtrecestncol_Internalname ;
   private String edtrecestncol_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtrecestnpro_Internalname ;
   private String edtrecestnpro_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtrecestlin_Internalname ;
   private String edtrecestlin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtrecestprdn_Internalname ;
   private String A4109recestprdn ;
   private String edtrecestprdn_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtrecestprdd_Internalname ;
   private String A4110recestprdd ;
   private String edtrecestprdd_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtrecestfacc_Internalname ;
   private String edtrecestfacc_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtrecestcant_Internalname ;
   private String edtrecestcant_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtrecestcanf_Internalname ;
   private String edtrecestcanf_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private String sMode1594 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ719PrdNum ;
   private String ZZ4109recestprdn ;
   private String ZZ4110recestprdd ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean wbErr ;
   private boolean n4109recestprdn ;
   private boolean n4110recestprdd ;
   private boolean n4111recestfacc ;
   private boolean n4112recestcant ;
   private boolean n4113recestcanf ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01G24_A407EmprNom ;
   private boolean[] T01G24_n407EmprNom ;
   private short[] T01G28_A4108recestlin ;
   private String[] T01G28_A4109recestprdn ;
   private boolean[] T01G28_n4109recestprdn ;
   private String[] T01G28_A4110recestprdd ;
   private boolean[] T01G28_n4110recestprdd ;
   private java.math.BigDecimal[] T01G28_A4111recestfacc ;
   private boolean[] T01G28_n4111recestfacc ;
   private java.math.BigDecimal[] T01G28_A4112recestcant ;
   private boolean[] T01G28_n4112recestcant ;
   private java.math.BigDecimal[] T01G28_A4113recestcanf ;
   private boolean[] T01G28_n4113recestcanf ;
   private String[] T01G28_A407EmprNom ;
   private boolean[] T01G28_n407EmprNom ;
   private String[] T01G28_A396EmprCod ;
   private int[] T01G28_A129BarCod ;
   private byte[] T01G28_A132BarCodReo ;
   private String[] T01G28_A130BarCodPar ;
   private String[] T01G28_A719PrdNum ;
   private boolean[] T01G28_n719PrdNum ;
   private byte[] T01G28_A490ForPrdUMe ;
   private boolean[] T01G28_n490ForPrdUMe ;
   private byte[] T01G28_A4075recestncol ;
   private byte[] T01G28_A4076recestnpro ;
   private String[] T01G25_A396EmprCod ;
   private String[] T01G26_A396EmprCod ;
   private String[] T01G27_A396EmprCod ;
   private String[] T01G29_A396EmprCod ;
   private String[] T01G210_A396EmprCod ;
   private String[] T01G211_A396EmprCod ;
   private String[] T01G212_A396EmprCod ;
   private int[] T01G212_A129BarCod ;
   private byte[] T01G212_A132BarCodReo ;
   private String[] T01G212_A130BarCodPar ;
   private byte[] T01G212_A4075recestncol ;
   private byte[] T01G212_A4076recestnpro ;
   private short[] T01G212_A4108recestlin ;
   private short[] T01G23_A4108recestlin ;
   private String[] T01G23_A4109recestprdn ;
   private boolean[] T01G23_n4109recestprdn ;
   private String[] T01G23_A4110recestprdd ;
   private boolean[] T01G23_n4110recestprdd ;
   private java.math.BigDecimal[] T01G23_A4111recestfacc ;
   private boolean[] T01G23_n4111recestfacc ;
   private java.math.BigDecimal[] T01G23_A4112recestcant ;
   private boolean[] T01G23_n4112recestcant ;
   private java.math.BigDecimal[] T01G23_A4113recestcanf ;
   private boolean[] T01G23_n4113recestcanf ;
   private String[] T01G23_A396EmprCod ;
   private int[] T01G23_A129BarCod ;
   private byte[] T01G23_A132BarCodReo ;
   private String[] T01G23_A130BarCodPar ;
   private String[] T01G23_A719PrdNum ;
   private boolean[] T01G23_n719PrdNum ;
   private byte[] T01G23_A490ForPrdUMe ;
   private boolean[] T01G23_n490ForPrdUMe ;
   private byte[] T01G23_A4075recestncol ;
   private byte[] T01G23_A4076recestnpro ;
   private String[] T01G213_A396EmprCod ;
   private int[] T01G213_A129BarCod ;
   private byte[] T01G213_A132BarCodReo ;
   private String[] T01G213_A130BarCodPar ;
   private byte[] T01G213_A4075recestncol ;
   private byte[] T01G213_A4076recestnpro ;
   private short[] T01G213_A4108recestlin ;
   private String[] T01G214_A396EmprCod ;
   private int[] T01G214_A129BarCod ;
   private byte[] T01G214_A132BarCodReo ;
   private String[] T01G214_A130BarCodPar ;
   private byte[] T01G214_A4075recestncol ;
   private byte[] T01G214_A4076recestnpro ;
   private short[] T01G214_A4108recestlin ;
   private short[] T01G22_A4108recestlin ;
   private String[] T01G22_A4109recestprdn ;
   private boolean[] T01G22_n4109recestprdn ;
   private String[] T01G22_A4110recestprdd ;
   private boolean[] T01G22_n4110recestprdd ;
   private java.math.BigDecimal[] T01G22_A4111recestfacc ;
   private boolean[] T01G22_n4111recestfacc ;
   private java.math.BigDecimal[] T01G22_A4112recestcant ;
   private boolean[] T01G22_n4112recestcant ;
   private java.math.BigDecimal[] T01G22_A4113recestcanf ;
   private boolean[] T01G22_n4113recestcanf ;
   private String[] T01G22_A396EmprCod ;
   private int[] T01G22_A129BarCod ;
   private byte[] T01G22_A132BarCodReo ;
   private String[] T01G22_A130BarCodPar ;
   private String[] T01G22_A719PrdNum ;
   private boolean[] T01G22_n719PrdNum ;
   private byte[] T01G22_A490ForPrdUMe ;
   private boolean[] T01G22_n490ForPrdUMe ;
   private byte[] T01G22_A4075recestncol ;
   private byte[] T01G22_A4076recestnpro ;
   private String[] T01G218_A396EmprCod ;
   private int[] T01G218_A129BarCod ;
   private byte[] T01G218_A132BarCodReo ;
   private String[] T01G218_A130BarCodPar ;
   private byte[] T01G218_A4075recestncol ;
   private byte[] T01G218_A4076recestnpro ;
   private short[] T01G218_A4108recestlin ;
   private String[] T01G219_A407EmprNom ;
   private boolean[] T01G219_n407EmprNom ;
   private String[] T01G220_A396EmprCod ;
   private String[] T01G221_A396EmprCod ;
   private String[] T01G222_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlreest__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlreest__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlreest__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlreest__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlreest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01G22", "SELECT recestlin, recestprdn, recestprdd, recestfacc, recestcant, recestcanf, EmprCod, BarCod, BarCodReo, BarCodPar, PrdNum, ForPrdUMe, recestncol, recestnpro FROM TXPlreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? AND recestlin = ?  FOR UPDATE OF recestprdn, recestprdd, recestfacc, recestcant, recestcanf, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G23", "SELECT recestlin, recestprdn, recestprdd, recestfacc, recestcant, recestcanf, EmprCod, BarCod, BarCodReo, BarCodPar, PrdNum, ForPrdUMe, recestncol, recestnpro FROM TXPlreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? AND recestlin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G25", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G26", "SELECT EmprCod FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G27", "SELECT EmprCod FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G28", "SELECT /*+ FIRST_ROWS(100) */ TM1.recestlin, TM1.recestprdn, TM1.recestprdd, TM1.recestfacc, TM1.recestcant, TM1.recestcanf, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.PrdNum, TM1.ForPrdUMe, TM1.recestncol, TM1.recestnpro FROM (TXPlreest TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.recestncol = ? and TM1.recestnpro = ? and TM1.recestlin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.recestncol, TM1.recestnpro, TM1.recestlin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G29", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G210", "SELECT EmprCod FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G211", "SELECT EmprCod FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G212", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? AND recestlin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G213", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and recestncol > ? or recestncol = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and recestnpro > ? or recestnpro = ? and recestncol = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and recestlin > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G214", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and recestncol < ? or recestncol = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and recestnpro < ? or recestnpro = ? and recestncol = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and recestlin < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, recestncol DESC, recestnpro DESC, recestlin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G215", "INSERT INTO TXPlreest(recestlin, recestprdn, recestprdd, recestfacc, recestcant, recestcanf, EmprCod, BarCod, BarCodReo, BarCodPar, PrdNum, ForPrdUMe, recestncol, recestnpro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPlreest")
         ,new UpdateCursor("T01G216", "UPDATE TXPlreest SET recestprdn=?, recestprdd=?, recestfacc=?, recestcant=?, recestcanf=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? AND recestlin = ?", GX_NOMASK, "TXPlreest")
         ,new UpdateCursor("T01G217", "DELETE FROM TXPlreest  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? AND recestlin = ?", GX_NOMASK, "TXPlreest")
         ,new ForEachCursor("T01G218", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G219", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G220", "SELECT EmprCod FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND recestncol = ? AND recestnpro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G221", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G222", "SELECT EmprCod FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((String[]) buf[17])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 26);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 3);
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setInt(8, ((Number) parms[12]).intValue());
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               stmt.setString(10, (String)parms[14], 1);
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
                  stmt.setByte(12, ((Number) parms[18]).byteValue());
               }
               stmt.setByte(13, ((Number) parms[19]).byteValue());
               stmt.setByte(14, ((Number) parms[20]).byteValue());
               return;
            case 14 :
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
                  stmt.setString(2, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 3);
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
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setByte(10, ((Number) parms[16]).byteValue());
               stmt.setString(11, (String)parms[17], 1);
               stmt.setByte(12, ((Number) parms[18]).byteValue());
               stmt.setByte(13, ((Number) parms[19]).byteValue());
               stmt.setShort(14, ((Number) parms[20]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
   }

}

