package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdeftip_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A4413CatDefCod = (short)(GXutil.lval( httpContext.GetPar( "CatDefCod"))) ;
         n4413CatDefCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4413CatDefCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A4413CatDefCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TIPOS DEFECTOS, MX", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdeftip_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdeftip_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdeftip_impl.class ));
   }

   public tdeftip_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e11NK2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDEFTIP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Defecto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDefCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipDefCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc), GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipDefDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Puntaje del Defecto", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefPnt_Internalname, GXutil.ltrim( localUtil.ntoc( A4401TipDefPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDefPnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4401TipDefPnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4401TipDefPnt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefPnt_Jsonclick, 0, "", "", "", "", "", 1, edtTipDefPnt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Categoría de Defecto", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCatDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4413CatDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCatDefCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4413CatDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4413CatDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCatDefCod_Jsonclick, 0, "", "", "", "", "", 1, edtCatDefCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripción Categoría", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCatDefDsc_Internalname, GXutil.rtrim( A4414CatDefDsc), GXutil.rtrim( localUtil.format( A4414CatDefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCatDefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCatDefDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nro de Orden", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4429TipDefOrd, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDefOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4429TipDefOrd), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4429TipDefOrd), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefOrd_Jsonclick, 0, "", "", "", "", "", 1, edtTipDefOrd_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEFTIP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEFTIP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDEFTIP.htm");
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
      e12NK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z833TipDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z834TipDefDsc = httpContext.cgiGet( "Z834TipDefDsc") ;
            Z4401TipDefPnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4401TipDefPnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4429TipDefOrd = localUtil.ctol( httpContext.cgiGet( "Z4429TipDefOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z4413CatDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z4413CatDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDEFCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A833TipDefCod = (short)(0) ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            }
            else
            {
               A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            }
            A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
            n834TipDefDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDEFPNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefPnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4401TipDefPnt = (short)(0) ;
               n4401TipDefPnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4401TipDefPnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4401TipDefPnt), 4, 0));
            }
            else
            {
               A4401TipDefPnt = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4401TipDefPnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4401TipDefPnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4401TipDefPnt), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCatDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCatDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CATDEFCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCatDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4413CatDefCod = (short)(0) ;
               n4413CatDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4413CatDefCod), 4, 0));
            }
            else
            {
               A4413CatDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCatDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4413CatDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4413CatDefCod), 4, 0));
            }
            A4414CatDefDsc = httpContext.cgiGet( edtCatDefDsc_Internalname) ;
            n4414CatDefDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", A4414CatDefDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDEFORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4429TipDefOrd = 0 ;
               n4429TipDefOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4429TipDefOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4429TipDefOrd), 10, 0));
            }
            else
            {
               A4429TipDefOrd = localUtil.ctol( httpContext.cgiGet( edtTipDefOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n4429TipDefOrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4429TipDefOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4429TipDefOrd), 10, 0));
            }
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
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
               A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
                        e12NK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e11NK2 ();
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
            initAllNK102( ) ;
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
      disableAttributesNK102( ) ;
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

   public void confirm_NK0( )
   {
      beforeValidateNK102( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsNK102( ) ;
         }
         else
         {
            checkExtendedTableNK102( ) ;
            if ( AnyError == 0 )
            {
               zmNK102( 4) ;
               zmNK102( 5) ;
            }
            closeExtendedTableCursorsNK102( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesNK0( ) ;
      }
   }

   public void resetCaptionNK0( )
   {
   }

   public void e12NK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tdeftip_impl.this.A396EmprCod = GXv_char1[0] ;
      tdeftip_impl.this.AV16EmprNom = GXv_char2[0] ;
      tdeftip_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV27FlagJBMar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FlagJBMar", GXutil.str( AV27FlagJBMar, 1, 0));
      GXv_int4[0] = AV27FlagJBMar ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int4) ;
      tdeftip_impl.this.AV27FlagJBMar = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FlagJBMar", GXutil.str( AV27FlagJBMar, 1, 0));
      GXt_char5 = AV19Lit0 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tdeftip_impl.this.GXt_char5 = GXv_char3[0] ;
      AV19Lit0 = GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char5 = AV20Lit1 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1224_", ""), (byte)(99), GXv_char3) ;
      tdeftip_impl.this.GXt_char5 = GXv_char3[0] ;
      AV20Lit1 = GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit1", AV20Lit1);
      GXt_char5 = AV21Lit2 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char3) ;
      tdeftip_impl.this.GXt_char5 = GXv_char3[0] ;
      AV21Lit2 = GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit2", AV21Lit2);
      GXt_char5 = AV22Lit3 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN682_", ""), (byte)(99), GXv_char3) ;
      tdeftip_impl.this.GXt_char5 = GXv_char3[0] ;
      AV22Lit3 = GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      AV24Lit4 = httpContext.getMessage( "Puntaje", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      AV25Lit5 = httpContext.getMessage( "Categoría", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      AV26Lit6 = httpContext.getMessage( "Orden", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char5 = AV23LitFe ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tdeftip_impl.this.GXt_char5 = GXv_char3[0] ;
      AV23LitFe = GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23LitFe", AV23LitFe);
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e11NK2 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e11NK2( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int6[0] = A833TipDefCod ;
      new app.plock20(remoteHandle, context).execute( GXv_char3, GXv_int6) ;
      tdeftip_impl.this.A396EmprCod = GXv_char3[0] ;
      tdeftip_impl.this.A833TipDefCod = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      /*  Sending Event outputs  */
   }

   public void zmNK102( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z834TipDefDsc = T00NK3_A834TipDefDsc[0] ;
            Z4401TipDefPnt = T00NK3_A4401TipDefPnt[0] ;
            Z4429TipDefOrd = T00NK3_A4429TipDefOrd[0] ;
            Z4413CatDefCod = T00NK3_A4413CatDefCod[0] ;
         }
         else
         {
            Z834TipDefDsc = A834TipDefDsc ;
            Z4401TipDefPnt = A4401TipDefPnt ;
            Z4429TipDefOrd = A4429TipDefOrd ;
            Z4413CatDefCod = A4413CatDefCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z833TipDefCod = A833TipDefCod ;
         Z834TipDefDsc = A834TipDefDsc ;
         Z4401TipDefPnt = A4401TipDefPnt ;
         Z4429TipDefOrd = A4429TipDefOrd ;
         Z396EmprCod = A396EmprCod ;
         Z4413CatDefCod = A4413CatDefCod ;
         Z407EmprNom = A407EmprNom ;
         Z4414CatDefDsc = A4414CatDefDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T00NK4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00NK4_A407EmprNom[0] ;
      n407EmprNom = T00NK4_n407EmprNom[0] ;
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

   public void loadNK102( )
   {
      /* Using cursor T00NK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound102 = (short)(1) ;
         A407EmprNom = T00NK6_A407EmprNom[0] ;
         n407EmprNom = T00NK6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A834TipDefDsc = T00NK6_A834TipDefDsc[0] ;
         n834TipDefDsc = T00NK6_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         A4401TipDefPnt = T00NK6_A4401TipDefPnt[0] ;
         n4401TipDefPnt = T00NK6_n4401TipDefPnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4401TipDefPnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4401TipDefPnt), 4, 0));
         A4414CatDefDsc = T00NK6_A4414CatDefDsc[0] ;
         n4414CatDefDsc = T00NK6_n4414CatDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", A4414CatDefDsc);
         A4429TipDefOrd = T00NK6_A4429TipDefOrd[0] ;
         n4429TipDefOrd = T00NK6_n4429TipDefOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4429TipDefOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4429TipDefOrd), 10, 0));
         A4413CatDefCod = T00NK6_A4413CatDefCod[0] ;
         n4413CatDefCod = T00NK6_n4413CatDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4413CatDefCod), 4, 0));
         zmNK102( -3) ;
      }
      pr_default.close(4);
      onLoadActionsNK102( ) ;
   }

   public void onLoadActionsNK102( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTableNK102( )
   {
      nIsDirty_102 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T00NK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n4413CatDefCod), Short.valueOf(A4413CatDefCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4413CatDefCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CatDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDEFCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDefCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4414CatDefDsc = T00NK5_A4414CatDefDsc[0] ;
      n4414CatDefDsc = T00NK5_n4414CatDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", A4414CatDefDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursorsNK102( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         short A4413CatDefCod )
   {
      /* Using cursor T00NK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n4413CatDefCod), Short.valueOf(A4413CatDefCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4413CatDefCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CatDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDEFCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDefCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4414CatDefDsc = T00NK7_A4414CatDefDsc[0] ;
      n4414CatDefDsc = T00NK7_n4414CatDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", A4414CatDefDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4414CatDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKeyNK102( )
   {
      /* Using cursor T00NK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound102 = (short)(1) ;
      }
      else
      {
         RcdFound102 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00NK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00NK3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmNK102( 3) ;
         RcdFound102 = (short)(1) ;
         A833TipDefCod = T00NK3_A833TipDefCod[0] ;
         n833TipDefCod = T00NK3_n833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         A834TipDefDsc = T00NK3_A834TipDefDsc[0] ;
         n834TipDefDsc = T00NK3_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         A4401TipDefPnt = T00NK3_A4401TipDefPnt[0] ;
         n4401TipDefPnt = T00NK3_n4401TipDefPnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4401TipDefPnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4401TipDefPnt), 4, 0));
         A4429TipDefOrd = T00NK3_A4429TipDefOrd[0] ;
         n4429TipDefOrd = T00NK3_n4429TipDefOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4429TipDefOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4429TipDefOrd), 10, 0));
         A4413CatDefCod = T00NK3_A4413CatDefCod[0] ;
         n4413CatDefCod = T00NK3_n4413CatDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4413CatDefCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z833TipDefCod = A833TipDefCod ;
         sMode102 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadNK102( ) ;
         if ( AnyError == 1 )
         {
            RcdFound102 = (short)(0) ;
            initializeNonKeyNK102( ) ;
         }
         Gx_mode = sMode102 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound102 = (short)(0) ;
         initializeNonKeyNK102( ) ;
         sMode102 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode102 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyNK102( ) ;
      if ( RcdFound102 == 0 )
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
      RcdFound102 = (short)(0) ;
      /* Using cursor T00NK9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00NK9_A833TipDefCod[0] < A833TipDefCod ) ) && ( GXutil.strcmp(T00NK9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00NK9_A833TipDefCod[0] > A833TipDefCod ) ) && ( GXutil.strcmp(T00NK9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A833TipDefCod = T00NK9_A833TipDefCod[0] ;
            n833TipDefCod = T00NK9_n833TipDefCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            RcdFound102 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound102 = (short)(0) ;
      /* Using cursor T00NK10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T00NK10_A833TipDefCod[0] > A833TipDefCod ) ) && ( GXutil.strcmp(T00NK10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T00NK10_A833TipDefCod[0] < A833TipDefCod ) ) && ( GXutil.strcmp(T00NK10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A833TipDefCod = T00NK10_A833TipDefCod[0] ;
            n833TipDefCod = T00NK10_n833TipDefCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            RcdFound102 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyNK102( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertNK102( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound102 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
            {
               A833TipDefCod = Z833TipDefCod ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateNK102( ) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertNK102( ) ;
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
                  GX_FocusControl = edtTipDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertNK102( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
      {
         A833TipDefCod = Z833TipDefCod ;
         n833TipDefCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
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
      getKeyNK102( ) ;
      if ( RcdFound102 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
         {
            A833TipDefCod = Z833TipDefCod ;
            n833TipDefCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A833TipDefCod != Z833TipDefCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdeftip");
      GX_FocusControl = edtTipDefDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_NK0( ) ;
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
      if ( RcdFound102 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTipDefDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartNK102( ) ;
      if ( RcdFound102 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipDefDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndNK102( ) ;
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
      if ( RcdFound102 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipDefDsc_Internalname ;
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
      if ( RcdFound102 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipDefDsc_Internalname ;
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
      scanStartNK102( ) ;
      if ( RcdFound102 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound102 != 0 )
         {
            scanNextNK102( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipDefDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndNK102( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyNK102( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00NK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPDEF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z834TipDefDsc, T00NK2_A834TipDefDsc[0]) != 0 ) || ( Z4401TipDefPnt != T00NK2_A4401TipDefPnt[0] ) || ( Z4429TipDefOrd != T00NK2_A4429TipDefOrd[0] ) || ( Z4413CatDefCod != T00NK2_A4413CatDefCod[0] ) )
         {
            if ( GXutil.strcmp(Z834TipDefDsc, T00NK2_A834TipDefDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdeftip:[seudo value changed for attri]"+"TipDefDsc");
               GXutil.writeLogRaw("Old: ",Z834TipDefDsc);
               GXutil.writeLogRaw("Current: ",T00NK2_A834TipDefDsc[0]);
            }
            if ( Z4401TipDefPnt != T00NK2_A4401TipDefPnt[0] )
            {
               GXutil.writeLogln("tdeftip:[seudo value changed for attri]"+"TipDefPnt");
               GXutil.writeLogRaw("Old: ",Z4401TipDefPnt);
               GXutil.writeLogRaw("Current: ",T00NK2_A4401TipDefPnt[0]);
            }
            if ( Z4429TipDefOrd != T00NK2_A4429TipDefOrd[0] )
            {
               GXutil.writeLogln("tdeftip:[seudo value changed for attri]"+"TipDefOrd");
               GXutil.writeLogRaw("Old: ",Z4429TipDefOrd);
               GXutil.writeLogRaw("Current: ",T00NK2_A4429TipDefOrd[0]);
            }
            if ( Z4413CatDefCod != T00NK2_A4413CatDefCod[0] )
            {
               GXutil.writeLogln("tdeftip:[seudo value changed for attri]"+"CatDefCod");
               GXutil.writeLogRaw("Old: ",Z4413CatDefCod);
               GXutil.writeLogRaw("Current: ",T00NK2_A4413CatDefCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPDEF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertNK102( )
   {
      beforeValidateNK102( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNK102( ) ;
      }
      if ( AnyError == 0 )
      {
         zmNK102( 0) ;
         checkOptimisticConcurrencyNK102( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNK102( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertNK102( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NK11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n834TipDefDsc), A834TipDefDsc, Boolean.valueOf(n4401TipDefPnt), Short.valueOf(A4401TipDefPnt), Boolean.valueOf(n4429TipDefOrd), Long.valueOf(A4429TipDefOrd), A396EmprCod, Boolean.valueOf(n4413CatDefCod), Short.valueOf(A4413CatDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDEF");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionNK0( ) ;
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
            loadNK102( ) ;
         }
         endLevelNK102( ) ;
      }
      closeExtendedTableCursorsNK102( ) ;
   }

   public void updateNK102( )
   {
      beforeValidateNK102( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNK102( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNK102( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNK102( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateNK102( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NK12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n834TipDefDsc), A834TipDefDsc, Boolean.valueOf(n4401TipDefPnt), Short.valueOf(A4401TipDefPnt), Boolean.valueOf(n4429TipDefOrd), Long.valueOf(A4429TipDefOrd), Boolean.valueOf(n4413CatDefCod), Short.valueOf(A4413CatDefCod), A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDEF");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPDEF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateNK102( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionNK0( ) ;
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
         endLevelNK102( ) ;
      }
      closeExtendedTableCursorsNK102( ) ;
   }

   public void deferredUpdateNK102( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateNK102( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNK102( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsNK102( ) ;
         afterConfirmNK102( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteNK102( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00NK13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPDEF");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound102 == 0 )
                     {
                        initAllNK102( ) ;
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
                     resetCaptionNK0( ) ;
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
      sMode102 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelNK102( ) ;
      Gx_mode = sMode102 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsNK102( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T00NK14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n4413CatDefCod), Short.valueOf(A4413CatDefCod)});
         A4414CatDefDsc = T00NK14_A4414CatDefDsc[0] ;
         n4414CatDefDsc = T00NK14_n4414CatDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", A4414CatDefDsc);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00NK15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00NK16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00NK17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00NK18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00NK19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INOTBd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00NK20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NOTRE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00NK21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00NK22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarTrDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00NK23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISRE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00NK24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00NK25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00NK26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00NK27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void endLevelNK102( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteNK102( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdeftip");
         if ( AnyError == 0 )
         {
            confirmValuesNK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdeftip");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartNK102( )
   {
      /* Scan By routine */
      /* Using cursor T00NK28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      RcdFound102 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound102 = (short)(1) ;
         A833TipDefCod = T00NK28_A833TipDefCod[0] ;
         n833TipDefCod = T00NK28_n833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextNK102( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound102 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound102 = (short)(1) ;
         A833TipDefCod = T00NK28_A833TipDefCod[0] ;
         n833TipDefCod = T00NK28_n833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
   }

   public void scanEndNK102( )
   {
      pr_default.close(26);
   }

   public void afterConfirmNK102( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertNK102( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateNK102( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteNK102( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteNK102( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateNK102( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesNK102( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), true);
      edtTipDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), true);
      edtTipDefPnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefPnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefPnt_Enabled), 5, 0), true);
      edtCatDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDefCod_Enabled), 5, 0), true);
      edtCatDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDefDsc_Enabled), 5, 0), true);
      edtTipDefOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefOrd_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesNK102( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesNK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdeftip", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z833TipDefCod", GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z834TipDefDsc", GXutil.rtrim( Z834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4401TipDefPnt", GXutil.ltrim( localUtil.ntoc( Z4401TipDefPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4429TipDefOrd", GXutil.ltrim( localUtil.ntoc( Z4429TipDefOrd, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4413CatDefCod", GXutil.ltrim( localUtil.ntoc( Z4413CatDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.tdeftip", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDEFTIP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TIPOS DEFECTOS, MX", "") ;
   }

   public void initializeNonKeyNK102( )
   {
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      A4401TipDefPnt = (short)(0) ;
      n4401TipDefPnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4401TipDefPnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4401TipDefPnt), 4, 0));
      A4413CatDefCod = (short)(0) ;
      n4413CatDefCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4413CatDefCod), 4, 0));
      A4414CatDefDsc = "" ;
      n4414CatDefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", A4414CatDefDsc);
      A4429TipDefOrd = 0 ;
      n4429TipDefOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4429TipDefOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4429TipDefOrd), 10, 0));
      Z834TipDefDsc = "" ;
      Z4401TipDefPnt = (short)(0) ;
      Z4429TipDefOrd = 0 ;
      Z4413CatDefCod = (short)(0) ;
   }

   public void initAllNK102( )
   {
      A833TipDefCod = (short)(0) ;
      n833TipDefCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      initializeNonKeyNK102( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241522612", true, true);
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
      httpContext.AddJavascriptSource("tdeftip.js", "?20268241522612", false, true);
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
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTipDefPnt_Internalname = "TIPDEFPNT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCatDefCod_Internalname = "CATDEFCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCatDefDsc_Internalname = "CATDEFDSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTipDefOrd_Internalname = "TIPDEFORD" ;
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
      Form.setCaption( httpContext.getMessage( "TIPOS DEFECTOS, MX", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTipDefOrd_Jsonclick = "" ;
      edtTipDefOrd_Backcolor = (int)(0xFFFFFF) ;
      edtTipDefOrd_Enabled = 1 ;
      edtCatDefDsc_Jsonclick = "" ;
      edtCatDefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCatDefDsc_Enabled = 0 ;
      edtCatDefCod_Jsonclick = "" ;
      edtCatDefCod_Backcolor = (int)(0xFFFFFF) ;
      edtCatDefCod_Enabled = 1 ;
      edtTipDefPnt_Jsonclick = "" ;
      edtTipDefPnt_Backcolor = (int)(0xFFFFFF) ;
      edtTipDefPnt_Enabled = 1 ;
      edtTipDefDsc_Jsonclick = "" ;
      edtTipDefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipDefDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipDefCod_Jsonclick = "" ;
      edtTipDefCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipDefCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00NK29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00NK29_A407EmprNom[0] ;
      n407EmprNom = T00NK29_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(27);
      GX_FocusControl = edtTipDefDsc_Internalname ;
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

   public void valid_Tipdefcod( )
   {
      n833TipDefCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4401TipDefPnt", GXutil.ltrim( localUtil.ntoc( A4401TipDefPnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4413CatDefCod", GXutil.ltrim( localUtil.ntoc( A4413CatDefCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4429TipDefOrd", GXutil.ltrim( localUtil.ntoc( A4429TipDefOrd, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", GXutil.rtrim( A4414CatDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z833TipDefCod", GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z834TipDefDsc", GXutil.rtrim( Z834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4401TipDefPnt", GXutil.ltrim( localUtil.ntoc( Z4401TipDefPnt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4413CatDefCod", GXutil.ltrim( localUtil.ntoc( Z4413CatDefCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4429TipDefOrd", GXutil.ltrim( localUtil.ntoc( Z4429TipDefOrd, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4414CatDefDsc", GXutil.rtrim( Z4414CatDefDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Catdefcod( )
   {
      n4413CatDefCod = false ;
      n4414CatDefDsc = false ;
      /* Using cursor T00NK14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n4413CatDefCod), Short.valueOf(A4413CatDefCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4413CatDefCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CatDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDEFCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDefCod_Internalname ;
         }
      }
      A4414CatDefDsc = T00NK14_A4414CatDefDsc[0] ;
      n4414CatDefDsc = T00NK14_n4414CatDefDsc[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4414CatDefDsc", GXutil.rtrim( A4414CatDefDsc));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e11NK2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A4401TipDefPnt',fld:'TIPDEFPNT',pic:'ZZZ9'},{av:'A4413CatDefCod',fld:'CATDEFCOD',pic:'ZZZ9'},{av:'A4429TipDefOrd',fld:'TIPDEFORD',pic:'ZZZZZZZZZ9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A4414CatDefDsc',fld:'CATDEFDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z833TipDefCod'},{av:'Z407EmprNom'},{av:'Z834TipDefDsc'},{av:'Z4401TipDefPnt'},{av:'Z4413CatDefCod'},{av:'Z4429TipDefOrd'},{av:'ZV17UsurCod'},{av:'Z4414CatDefDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CATDEFCOD","{handler:'valid_Catdefcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4413CatDefCod',fld:'CATDEFCOD',pic:'ZZZ9'},{av:'A4414CatDefDsc',fld:'CATDEFDSC',pic:''}]");
      setEventMetadata("VALID_CATDEFCOD",",oparms:[{av:'A4414CatDefDsc',fld:'CATDEFDSC',pic:''}]}");
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
      pr_default.close(27);
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z834TipDefDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A834TipDefDsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4414CatDefDsc = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV17UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV23LitFe = "" ;
      GXt_char5 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new short[1] ;
      Z407EmprNom = "" ;
      Z4414CatDefDsc = "" ;
      T00NK4_A407EmprNom = new String[] {""} ;
      T00NK4_n407EmprNom = new boolean[] {false} ;
      T00NK6_A833TipDefCod = new short[1] ;
      T00NK6_n833TipDefCod = new boolean[] {false} ;
      T00NK6_A407EmprNom = new String[] {""} ;
      T00NK6_n407EmprNom = new boolean[] {false} ;
      T00NK6_A834TipDefDsc = new String[] {""} ;
      T00NK6_n834TipDefDsc = new boolean[] {false} ;
      T00NK6_A4401TipDefPnt = new short[1] ;
      T00NK6_n4401TipDefPnt = new boolean[] {false} ;
      T00NK6_A4414CatDefDsc = new String[] {""} ;
      T00NK6_n4414CatDefDsc = new boolean[] {false} ;
      T00NK6_A4429TipDefOrd = new long[1] ;
      T00NK6_n4429TipDefOrd = new boolean[] {false} ;
      T00NK6_A396EmprCod = new String[] {""} ;
      T00NK6_A4413CatDefCod = new short[1] ;
      T00NK6_n4413CatDefCod = new boolean[] {false} ;
      T00NK5_A4414CatDefDsc = new String[] {""} ;
      T00NK5_n4414CatDefDsc = new boolean[] {false} ;
      T00NK7_A4414CatDefDsc = new String[] {""} ;
      T00NK7_n4414CatDefDsc = new boolean[] {false} ;
      T00NK8_A396EmprCod = new String[] {""} ;
      T00NK8_A833TipDefCod = new short[1] ;
      T00NK8_n833TipDefCod = new boolean[] {false} ;
      T00NK3_A833TipDefCod = new short[1] ;
      T00NK3_n833TipDefCod = new boolean[] {false} ;
      T00NK3_A834TipDefDsc = new String[] {""} ;
      T00NK3_n834TipDefDsc = new boolean[] {false} ;
      T00NK3_A4401TipDefPnt = new short[1] ;
      T00NK3_n4401TipDefPnt = new boolean[] {false} ;
      T00NK3_A4429TipDefOrd = new long[1] ;
      T00NK3_n4429TipDefOrd = new boolean[] {false} ;
      T00NK3_A396EmprCod = new String[] {""} ;
      T00NK3_A4413CatDefCod = new short[1] ;
      T00NK3_n4413CatDefCod = new boolean[] {false} ;
      sMode102 = "" ;
      T00NK9_A396EmprCod = new String[] {""} ;
      T00NK9_A833TipDefCod = new short[1] ;
      T00NK9_n833TipDefCod = new boolean[] {false} ;
      T00NK10_A396EmprCod = new String[] {""} ;
      T00NK10_A833TipDefCod = new short[1] ;
      T00NK10_n833TipDefCod = new boolean[] {false} ;
      T00NK2_A833TipDefCod = new short[1] ;
      T00NK2_n833TipDefCod = new boolean[] {false} ;
      T00NK2_A834TipDefDsc = new String[] {""} ;
      T00NK2_n834TipDefDsc = new boolean[] {false} ;
      T00NK2_A4401TipDefPnt = new short[1] ;
      T00NK2_n4401TipDefPnt = new boolean[] {false} ;
      T00NK2_A4429TipDefOrd = new long[1] ;
      T00NK2_n4429TipDefOrd = new boolean[] {false} ;
      T00NK2_A396EmprCod = new String[] {""} ;
      T00NK2_A4413CatDefCod = new short[1] ;
      T00NK2_n4413CatDefCod = new boolean[] {false} ;
      T00NK14_A4414CatDefDsc = new String[] {""} ;
      T00NK14_n4414CatDefDsc = new boolean[] {false} ;
      T00NK15_A396EmprCod = new String[] {""} ;
      T00NK15_A13137NCHdr = new int[1] ;
      T00NK15_A13138NCHdrr = new byte[1] ;
      T00NK15_A13139NCHdrp = new String[] {""} ;
      T00NK16_A396EmprCod = new String[] {""} ;
      T00NK16_A2809MetTerCod = new String[] {""} ;
      T00NK16_A129BarCod = new int[1] ;
      T00NK16_A132BarCodReo = new byte[1] ;
      T00NK16_A130BarCodPar = new String[] {""} ;
      T00NK16_A2813MetPieCod = new String[] {""} ;
      T00NK16_A12995MetPieDfLi = new short[1] ;
      T00NK17_A396EmprCod = new String[] {""} ;
      T00NK17_A129BarCod = new int[1] ;
      T00NK17_A132BarCodReo = new byte[1] ;
      T00NK17_A130BarCodPar = new String[] {""} ;
      T00NK17_A200BarPieCod = new String[] {""} ;
      T00NK17_A3858BarTroCod = new short[1] ;
      T00NK17_A12649TRDefcod = new short[1] ;
      T00NK17_A12650TRFasCod = new String[] {""} ;
      T00NK18_A396EmprCod = new String[] {""} ;
      T00NK18_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00NK18_A10717RcNcLin = new int[1] ;
      T00NK19_A396EmprCod = new String[] {""} ;
      T00NK19_A8735Be_hdr = new int[1] ;
      T00NK19_A8736Be_hdrr = new byte[1] ;
      T00NK19_A8737Be_hdrp = new String[] {""} ;
      T00NK19_A8740Be_Pza = new String[] {""} ;
      T00NK19_A833TipDefCod = new short[1] ;
      T00NK19_n833TipDefCod = new boolean[] {false} ;
      T00NK20_A396EmprCod = new String[] {""} ;
      T00NK20_A5198Nr_codigo = new int[1] ;
      T00NK20_A833TipDefCod = new short[1] ;
      T00NK20_n833TipDefCod = new boolean[] {false} ;
      T00NK21_A396EmprCod = new String[] {""} ;
      T00NK21_A5059Hl_hdr = new int[1] ;
      T00NK21_A5060Hl_hdrr = new byte[1] ;
      T00NK21_A5061Hl_hdrp = new String[] {""} ;
      T00NK22_A396EmprCod = new String[] {""} ;
      T00NK22_A129BarCod = new int[1] ;
      T00NK22_A132BarCodReo = new byte[1] ;
      T00NK22_A130BarCodPar = new String[] {""} ;
      T00NK22_A200BarPieCod = new String[] {""} ;
      T00NK22_A3858BarTroCod = new short[1] ;
      T00NK22_A4993BarTroDef = new short[1] ;
      T00NK23_A396EmprCod = new String[] {""} ;
      T00NK23_A4661HisLavCod = new int[1] ;
      T00NK23_A4662HisLavReo = new byte[1] ;
      T00NK23_A4663HisLavPar = new String[] {""} ;
      T00NK23_A4664HisLavNpd = new int[1] ;
      T00NK23_A4665HisLavOrd = new short[1] ;
      T00NK23_A4667HisLavCon = new int[1] ;
      T00NK24_A396EmprCod = new String[] {""} ;
      T00NK24_A44AlbRecCod = new int[1] ;
      T00NK24_A4596AlbRDefCod = new short[1] ;
      T00NK25_A396EmprCod = new String[] {""} ;
      T00NK25_A44AlbRecCod = new int[1] ;
      T00NK25_A2159AlbRecPie = new String[] {""} ;
      T00NK25_A4395AlRDefCod = new short[1] ;
      T00NK25_A4412AlRFasCod = new String[] {""} ;
      T00NK26_A396EmprCod = new String[] {""} ;
      T00NK26_A539HisBarCod = new int[1] ;
      T00NK26_A545HisCodReo = new byte[1] ;
      T00NK26_A544HisCodPar = new String[] {""} ;
      T00NK26_A833TipDefCod = new short[1] ;
      T00NK26_n833TipDefCod = new boolean[] {false} ;
      T00NK27_A396EmprCod = new String[] {""} ;
      T00NK27_A361DisCod = new int[1] ;
      T00NK27_A833TipDefCod = new short[1] ;
      T00NK27_n833TipDefCod = new boolean[] {false} ;
      T00NK28_A396EmprCod = new String[] {""} ;
      T00NK28_A833TipDefCod = new short[1] ;
      T00NK28_n833TipDefCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00NK29_A407EmprNom = new String[] {""} ;
      T00NK29_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ834TipDefDsc = "" ;
      ZZV17UsurCod = "" ;
      ZZ4414CatDefDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdeftip__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdeftip__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdeftip__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdeftip__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdeftip__default(),
         new Object[] {
             new Object[] {
            T00NK2_A833TipDefCod, T00NK2_A834TipDefDsc, T00NK2_n834TipDefDsc, T00NK2_A4401TipDefPnt, T00NK2_n4401TipDefPnt, T00NK2_A4429TipDefOrd, T00NK2_n4429TipDefOrd, T00NK2_A396EmprCod, T00NK2_A4413CatDefCod, T00NK2_n4413CatDefCod
            }
            , new Object[] {
            T00NK3_A833TipDefCod, T00NK3_A834TipDefDsc, T00NK3_n834TipDefDsc, T00NK3_A4401TipDefPnt, T00NK3_n4401TipDefPnt, T00NK3_A4429TipDefOrd, T00NK3_n4429TipDefOrd, T00NK3_A396EmprCod, T00NK3_A4413CatDefCod, T00NK3_n4413CatDefCod
            }
            , new Object[] {
            T00NK4_A407EmprNom, T00NK4_n407EmprNom
            }
            , new Object[] {
            T00NK5_A4414CatDefDsc, T00NK5_n4414CatDefDsc
            }
            , new Object[] {
            T00NK6_A833TipDefCod, T00NK6_A407EmprNom, T00NK6_n407EmprNom, T00NK6_A834TipDefDsc, T00NK6_n834TipDefDsc, T00NK6_A4401TipDefPnt, T00NK6_n4401TipDefPnt, T00NK6_A4414CatDefDsc, T00NK6_n4414CatDefDsc, T00NK6_A4429TipDefOrd,
            T00NK6_n4429TipDefOrd, T00NK6_A396EmprCod, T00NK6_A4413CatDefCod, T00NK6_n4413CatDefCod
            }
            , new Object[] {
            T00NK7_A4414CatDefDsc, T00NK7_n4414CatDefDsc
            }
            , new Object[] {
            T00NK8_A396EmprCod, T00NK8_A833TipDefCod
            }
            , new Object[] {
            T00NK9_A396EmprCod, T00NK9_A833TipDefCod
            }
            , new Object[] {
            T00NK10_A396EmprCod, T00NK10_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00NK14_A4414CatDefDsc, T00NK14_n4414CatDefDsc
            }
            , new Object[] {
            T00NK15_A396EmprCod, T00NK15_A13137NCHdr, T00NK15_A13138NCHdrr, T00NK15_A13139NCHdrp
            }
            , new Object[] {
            T00NK16_A396EmprCod, T00NK16_A2809MetTerCod, T00NK16_A129BarCod, T00NK16_A132BarCodReo, T00NK16_A130BarCodPar, T00NK16_A2813MetPieCod, T00NK16_A12995MetPieDfLi
            }
            , new Object[] {
            T00NK17_A396EmprCod, T00NK17_A129BarCod, T00NK17_A132BarCodReo, T00NK17_A130BarCodPar, T00NK17_A200BarPieCod, T00NK17_A3858BarTroCod, T00NK17_A12649TRDefcod, T00NK17_A12650TRFasCod
            }
            , new Object[] {
            T00NK18_A396EmprCod, T00NK18_A10715RcNcFec, T00NK18_A10717RcNcLin
            }
            , new Object[] {
            T00NK19_A396EmprCod, T00NK19_A8735Be_hdr, T00NK19_A8736Be_hdrr, T00NK19_A8737Be_hdrp, T00NK19_A8740Be_Pza, T00NK19_A833TipDefCod
            }
            , new Object[] {
            T00NK20_A396EmprCod, T00NK20_A5198Nr_codigo, T00NK20_A833TipDefCod
            }
            , new Object[] {
            T00NK21_A396EmprCod, T00NK21_A5059Hl_hdr, T00NK21_A5060Hl_hdrr, T00NK21_A5061Hl_hdrp
            }
            , new Object[] {
            T00NK22_A396EmprCod, T00NK22_A129BarCod, T00NK22_A132BarCodReo, T00NK22_A130BarCodPar, T00NK22_A200BarPieCod, T00NK22_A3858BarTroCod, T00NK22_A4993BarTroDef
            }
            , new Object[] {
            T00NK23_A396EmprCod, T00NK23_A4661HisLavCod, T00NK23_A4662HisLavReo, T00NK23_A4663HisLavPar, T00NK23_A4664HisLavNpd, T00NK23_A4665HisLavOrd, T00NK23_A4667HisLavCon
            }
            , new Object[] {
            T00NK24_A396EmprCod, T00NK24_A44AlbRecCod, T00NK24_A4596AlbRDefCod
            }
            , new Object[] {
            T00NK25_A396EmprCod, T00NK25_A44AlbRecCod, T00NK25_A2159AlbRecPie, T00NK25_A4395AlRDefCod, T00NK25_A4412AlRFasCod
            }
            , new Object[] {
            T00NK26_A396EmprCod, T00NK26_A539HisBarCod, T00NK26_A545HisCodReo, T00NK26_A544HisCodPar, T00NK26_A833TipDefCod
            }
            , new Object[] {
            T00NK27_A396EmprCod, T00NK27_A361DisCod, T00NK27_A833TipDefCod
            }
            , new Object[] {
            T00NK28_A396EmprCod, T00NK28_A833TipDefCod
            }
            , new Object[] {
            T00NK29_A407EmprNom, T00NK29_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte AV27FlagJBMar ;
   private byte GXv_int4[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z833TipDefCod ;
   private short Z4401TipDefPnt ;
   private short Z4413CatDefCod ;
   private short A4413CatDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A833TipDefCod ;
   private short A4401TipDefPnt ;
   private short GXv_int6[] ;
   private short RcdFound102 ;
   private short nIsDirty_102 ;
   private short ZZ833TipDefCod ;
   private short ZZ4401TipDefPnt ;
   private short ZZ4413CatDefCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTipDefCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTipDefDsc_Enabled ;
   private int edtTipDefPnt_Enabled ;
   private int edtCatDefCod_Enabled ;
   private int edtCatDefDsc_Enabled ;
   private int edtTipDefOrd_Enabled ;
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
   private int edtTipDefOrd_Backcolor ;
   private int edtCatDefDsc_Backcolor ;
   private int edtCatDefCod_Backcolor ;
   private int edtTipDefPnt_Backcolor ;
   private int edtTipDefDsc_Backcolor ;
   private int edtTipDefCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long Z4429TipDefOrd ;
   private long A4429TipDefOrd ;
   private long ZZ4429TipDefOrd ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z834TipDefDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipDefCod_Internalname ;
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
   private String edtTipDefCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTipDefDsc_Internalname ;
   private String A834TipDefDsc ;
   private String edtTipDefDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTipDefPnt_Internalname ;
   private String edtTipDefPnt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCatDefCod_Internalname ;
   private String edtCatDefCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCatDefDsc_Internalname ;
   private String A4414CatDefDsc ;
   private String edtCatDefDsc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTipDefOrd_Internalname ;
   private String edtTipDefOrd_Jsonclick ;
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
   private String AV17UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV23LitFe ;
   private String GXt_char5 ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z4414CatDefDsc ;
   private String sMode102 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ834TipDefDsc ;
   private String ZZV17UsurCod ;
   private String ZZ4414CatDefDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4413CatDefCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n4401TipDefPnt ;
   private boolean n4414CatDefDsc ;
   private boolean n4429TipDefOrd ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T00NK4_A407EmprNom ;
   private boolean[] T00NK4_n407EmprNom ;
   private short[] T00NK6_A833TipDefCod ;
   private boolean[] T00NK6_n833TipDefCod ;
   private String[] T00NK6_A407EmprNom ;
   private boolean[] T00NK6_n407EmprNom ;
   private String[] T00NK6_A834TipDefDsc ;
   private boolean[] T00NK6_n834TipDefDsc ;
   private short[] T00NK6_A4401TipDefPnt ;
   private boolean[] T00NK6_n4401TipDefPnt ;
   private String[] T00NK6_A4414CatDefDsc ;
   private boolean[] T00NK6_n4414CatDefDsc ;
   private long[] T00NK6_A4429TipDefOrd ;
   private boolean[] T00NK6_n4429TipDefOrd ;
   private String[] T00NK6_A396EmprCod ;
   private short[] T00NK6_A4413CatDefCod ;
   private boolean[] T00NK6_n4413CatDefCod ;
   private String[] T00NK5_A4414CatDefDsc ;
   private boolean[] T00NK5_n4414CatDefDsc ;
   private String[] T00NK7_A4414CatDefDsc ;
   private boolean[] T00NK7_n4414CatDefDsc ;
   private String[] T00NK8_A396EmprCod ;
   private short[] T00NK8_A833TipDefCod ;
   private boolean[] T00NK8_n833TipDefCod ;
   private short[] T00NK3_A833TipDefCod ;
   private boolean[] T00NK3_n833TipDefCod ;
   private String[] T00NK3_A834TipDefDsc ;
   private boolean[] T00NK3_n834TipDefDsc ;
   private short[] T00NK3_A4401TipDefPnt ;
   private boolean[] T00NK3_n4401TipDefPnt ;
   private long[] T00NK3_A4429TipDefOrd ;
   private boolean[] T00NK3_n4429TipDefOrd ;
   private String[] T00NK3_A396EmprCod ;
   private short[] T00NK3_A4413CatDefCod ;
   private boolean[] T00NK3_n4413CatDefCod ;
   private String[] T00NK9_A396EmprCod ;
   private short[] T00NK9_A833TipDefCod ;
   private boolean[] T00NK9_n833TipDefCod ;
   private String[] T00NK10_A396EmprCod ;
   private short[] T00NK10_A833TipDefCod ;
   private boolean[] T00NK10_n833TipDefCod ;
   private short[] T00NK2_A833TipDefCod ;
   private boolean[] T00NK2_n833TipDefCod ;
   private String[] T00NK2_A834TipDefDsc ;
   private boolean[] T00NK2_n834TipDefDsc ;
   private short[] T00NK2_A4401TipDefPnt ;
   private boolean[] T00NK2_n4401TipDefPnt ;
   private long[] T00NK2_A4429TipDefOrd ;
   private boolean[] T00NK2_n4429TipDefOrd ;
   private String[] T00NK2_A396EmprCod ;
   private short[] T00NK2_A4413CatDefCod ;
   private boolean[] T00NK2_n4413CatDefCod ;
   private String[] T00NK14_A4414CatDefDsc ;
   private boolean[] T00NK14_n4414CatDefDsc ;
   private String[] T00NK15_A396EmprCod ;
   private int[] T00NK15_A13137NCHdr ;
   private byte[] T00NK15_A13138NCHdrr ;
   private String[] T00NK15_A13139NCHdrp ;
   private String[] T00NK16_A396EmprCod ;
   private String[] T00NK16_A2809MetTerCod ;
   private int[] T00NK16_A129BarCod ;
   private byte[] T00NK16_A132BarCodReo ;
   private String[] T00NK16_A130BarCodPar ;
   private String[] T00NK16_A2813MetPieCod ;
   private short[] T00NK16_A12995MetPieDfLi ;
   private String[] T00NK17_A396EmprCod ;
   private int[] T00NK17_A129BarCod ;
   private byte[] T00NK17_A132BarCodReo ;
   private String[] T00NK17_A130BarCodPar ;
   private String[] T00NK17_A200BarPieCod ;
   private short[] T00NK17_A3858BarTroCod ;
   private short[] T00NK17_A12649TRDefcod ;
   private String[] T00NK17_A12650TRFasCod ;
   private String[] T00NK18_A396EmprCod ;
   private java.util.Date[] T00NK18_A10715RcNcFec ;
   private int[] T00NK18_A10717RcNcLin ;
   private String[] T00NK19_A396EmprCod ;
   private int[] T00NK19_A8735Be_hdr ;
   private byte[] T00NK19_A8736Be_hdrr ;
   private String[] T00NK19_A8737Be_hdrp ;
   private String[] T00NK19_A8740Be_Pza ;
   private short[] T00NK19_A833TipDefCod ;
   private boolean[] T00NK19_n833TipDefCod ;
   private String[] T00NK20_A396EmprCod ;
   private int[] T00NK20_A5198Nr_codigo ;
   private short[] T00NK20_A833TipDefCod ;
   private boolean[] T00NK20_n833TipDefCod ;
   private String[] T00NK21_A396EmprCod ;
   private int[] T00NK21_A5059Hl_hdr ;
   private byte[] T00NK21_A5060Hl_hdrr ;
   private String[] T00NK21_A5061Hl_hdrp ;
   private String[] T00NK22_A396EmprCod ;
   private int[] T00NK22_A129BarCod ;
   private byte[] T00NK22_A132BarCodReo ;
   private String[] T00NK22_A130BarCodPar ;
   private String[] T00NK22_A200BarPieCod ;
   private short[] T00NK22_A3858BarTroCod ;
   private short[] T00NK22_A4993BarTroDef ;
   private String[] T00NK23_A396EmprCod ;
   private int[] T00NK23_A4661HisLavCod ;
   private byte[] T00NK23_A4662HisLavReo ;
   private String[] T00NK23_A4663HisLavPar ;
   private int[] T00NK23_A4664HisLavNpd ;
   private short[] T00NK23_A4665HisLavOrd ;
   private int[] T00NK23_A4667HisLavCon ;
   private String[] T00NK24_A396EmprCod ;
   private int[] T00NK24_A44AlbRecCod ;
   private short[] T00NK24_A4596AlbRDefCod ;
   private String[] T00NK25_A396EmprCod ;
   private int[] T00NK25_A44AlbRecCod ;
   private String[] T00NK25_A2159AlbRecPie ;
   private short[] T00NK25_A4395AlRDefCod ;
   private String[] T00NK25_A4412AlRFasCod ;
   private String[] T00NK26_A396EmprCod ;
   private int[] T00NK26_A539HisBarCod ;
   private byte[] T00NK26_A545HisCodReo ;
   private String[] T00NK26_A544HisCodPar ;
   private short[] T00NK26_A833TipDefCod ;
   private boolean[] T00NK26_n833TipDefCod ;
   private String[] T00NK27_A396EmprCod ;
   private int[] T00NK27_A361DisCod ;
   private short[] T00NK27_A833TipDefCod ;
   private boolean[] T00NK27_n833TipDefCod ;
   private String[] T00NK28_A396EmprCod ;
   private short[] T00NK28_A833TipDefCod ;
   private boolean[] T00NK28_n833TipDefCod ;
   private String[] T00NK29_A407EmprNom ;
   private boolean[] T00NK29_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdeftip__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdeftip__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdeftip__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdeftip__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdeftip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00NK2", "SELECT TipDefCod, TipDefDsc, TipDefPnt, TipDefOrd, EmprCod, CatDefCod FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ?  FOR UPDATE OF TipDefDsc, TipDefPnt, TipDefOrd, CatDefCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK3", "SELECT TipDefCod, TipDefDsc, TipDefPnt, TipDefOrd, EmprCod, CatDefCod FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK5", "SELECT CatDefDsc FROM TXPCatDef WHERE EmprCod = ? AND CatDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK6", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipDefCod, T2.EmprNom, TM1.TipDefDsc, TM1.TipDefPnt, T3.CatDefDsc, TM1.TipDefOrd, TM1.EmprCod, TM1.CatDefCod FROM ((TXPTIPDEF TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCatDef T3 ON T3.EmprCod = TM1.EmprCod AND T3.CatDefCod = TM1.CatDefCod) WHERE TM1.EmprCod = ? and TM1.TipDefCod = ? ORDER BY TM1.EmprCod, TM1.TipDefCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK7", "SELECT CatDefDsc FROM TXPCatDef WHERE EmprCod = ? AND CatDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipDefCod FROM TXPTIPDEF WHERE ( TipDefCod > ?) and EmprCod = ? ORDER BY EmprCod, TipDefCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipDefCod FROM TXPTIPDEF WHERE ( TipDefCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipDefCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00NK11", "INSERT INTO TXPTIPDEF(TipDefCod, TipDefDsc, TipDefPnt, TipDefOrd, EmprCod, CatDefCod, TipDefDs2, MaqDef, TipDefTp, TipDefAb, TipDefAct, TipDefMedH, TipDefLong, TipDefPtos) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0)", GX_NOMASK, "TXPTIPDEF")
         ,new UpdateCursor("T00NK12", "UPDATE TXPTIPDEF SET TipDefDsc=?, TipDefPnt=?, TipDefOrd=?, CatDefCod=?  WHERE EmprCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPTIPDEF")
         ,new UpdateCursor("T00NK13", "DELETE FROM TXPTIPDEF  WHERE EmprCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPTIPDEF")
         ,new ForEachCursor("T00NK14", "SELECT CatDefDsc FROM TXPCatDef WHERE EmprCod = ? AND CatDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK15", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK16", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetPieDfID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK17", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, TRDefcod, TRFasCod FROM TXPPZTRD0 WHERE EmprCod = ? AND TRDefcod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK18", "SELECT * FROM (SELECT EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK19", "SELECT * FROM (SELECT EmprCod, Be_hdr, Be_hdrr, Be_hdrp, Be_Pza, TipDefCod FROM TXPINOTBd WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK20", "SELECT * FROM (SELECT EmprCod, Nr_codigo, TipDefCod FROM TXPNOTRE1 WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK21", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? AND BarTroDefC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK23", "SELECT * FROM (SELECT EmprCod, HisLavCod, HisLavReo, HisLavPar, HisLavNpd, HisLavOrd, HisLavCon FROM TXPHISRE1 WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK24", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK25", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlRDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK26", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK27", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NK28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ? ORDER BY EmprCod, TipDefCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NK29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 27 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 9 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
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
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               return;
            case 10 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[5]).longValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 16 :
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
            case 17 :
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
            case 18 :
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
            case 19 :
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
            case 20 :
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
            case 21 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

