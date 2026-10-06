package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thprecl_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PRECIOS COLOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
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

   public thprecl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thprecl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thprecl_impl.class ));
   }

   public thprecl_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THPRECL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_Forser_Internalname, GXutil.rtrim( A11071H_Forser), GXutil.rtrim( localUtil.format( A11071H_Forser, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_Forser_Jsonclick, 0, "", "", "", "", "", 1, edtH_Forser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_ForserD_Internalname, GXutil.rtrim( A11072H_ForserD), GXutil.rtrim( localUtil.format( A11072H_ForserD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_ForserD_Jsonclick, 0, "", "", "", "", "", 1, edtH_ForserD_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_ForcolNm_Internalname, GXutil.rtrim( A11073H_ForcolNm), GXutil.rtrim( localUtil.format( A11073H_ForcolNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_ForcolNm_Jsonclick, 0, "", "", "", "", "", 1, edtH_ForcolNm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_ForcolNn_Internalname, GXutil.ltrim( localUtil.ntoc( A11074H_ForcolNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_ForcolNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11074H_ForcolNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11074H_ForcolNn), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_ForcolNn_Jsonclick, 0, "", "", "", "", "", 1, edtH_ForcolNn_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_Tipcolco_Internalname, GXutil.ltrim( localUtil.ntoc( A11075H_Tipcolco, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_Tipcolco_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11075H_Tipcolco), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11075H_Tipcolco), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_Tipcolco_Jsonclick, 0, "", "", "", "", "", 1, edtH_Tipcolco_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Dia Modificacion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtH_DiaC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_DiaC_Internalname, localUtil.format(A11076H_DiaC, "99/99/99"), localUtil.format( A11076H_DiaC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_DiaC_Jsonclick, 0, "", "", "", "", "", 1, edtH_DiaC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPRECL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtH_DiaC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtH_DiaC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THPRECL.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ultimo mov del dia", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_UltDC_Internalname, GXutil.ltrim( localUtil.ntoc( A11077H_UltDC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_UltDC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11077H_UltDC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11077H_UltDC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_UltDC_Jsonclick, 0, "", "", "", "", "", 1, edtH_UltDC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPRECL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1478 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1478 = (short)(1) ;
            scanStart1AM1478( ) ;
            while ( RcdFound1478 != 0 )
            {
               init_level_properties1478( ) ;
               getByPrimaryKey1AM1478( ) ;
               addRow1AM1478( ) ;
               scanNext1AM1478( ) ;
            }
            scanEnd1AM1478( ) ;
            nBlankRcdCount1478 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AM1478( ) ;
         standaloneModal1AM1478( ) ;
         sMode1478 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1AM1478( ) ;
            edtavnRcdDeleted_1478_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1478_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1478_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1478_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_LinC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_LinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LinC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_PkC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_PkC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PkC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_PmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PMC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_PmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PmC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_TmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TMC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_TmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_TmC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_UsC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_USC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_UsC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UsC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_HhC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_HHC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_HhC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_HhC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtH_obsC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_OBSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_obsC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_obsC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_1478 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AM1478( ) ;
            }
            sendRow1AM1478( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode1478 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1478 = (short)(5) ;
         nRcdExists_1478 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AM1478( ) ;
            while ( RcdFound1478 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_751478( ) ;
               init_level_properties1478( ) ;
               standaloneNotModal1AM1478( ) ;
               getByPrimaryKey1AM1478( ) ;
               standaloneModal1AM1478( ) ;
               addRow1AM1478( ) ;
               scanNext1AM1478( ) ;
            }
            scanEnd1AM1478( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1478 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_751478( ) ;
      initAll1AM1478( ) ;
      init_level_properties1478( ) ;
      nRcdExists_1478 = (short)(0) ;
      nIsMod_1478 = (short)(0) ;
      nRcdDeleted_1478 = (short)(0) ;
      nBlankRcdCount1478 = (short)(nBlankRcdUsr1478+nBlankRcdCount1478) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1478 > 0 )
      {
         standaloneNotModal1AM1478( ) ;
         standaloneModal1AM1478( ) ;
         addRow1AM1478( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtH_LinC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1478 = (short)(nBlankRcdCount1478-1) ;
      }
      Gx_mode = sMode1478 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPRECL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THPRECL.htm");
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
      e111AM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11071H_Forser = httpContext.cgiGet( "Z11071H_Forser") ;
            Z11073H_ForcolNm = httpContext.cgiGet( "Z11073H_ForcolNm") ;
            Z11074H_ForcolNn = (int)(localUtil.ctol( httpContext.cgiGet( "Z11074H_ForcolNn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11075H_Tipcolco = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11075H_Tipcolco"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11076H_DiaC = localUtil.ctod( httpContext.cgiGet( "Z11076H_DiaC"), 0) ;
            Z11072H_ForserD = httpContext.cgiGet( "Z11072H_ForserD") ;
            Z11077H_UltDC = (int)(localUtil.ctol( httpContext.cgiGet( "Z11077H_UltDC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A11071H_Forser = httpContext.cgiGet( edtH_Forser_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
            A11072H_ForserD = httpContext.cgiGet( edtH_ForserD_Internalname) ;
            n11072H_ForserD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11072H_ForserD", A11072H_ForserD);
            A11073H_ForcolNm = httpContext.cgiGet( edtH_ForcolNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_ForcolNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_ForcolNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_FORCOLNN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_ForcolNn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11074H_ForcolNn = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
            }
            else
            {
               A11074H_ForcolNn = (int)(localUtil.ctol( httpContext.cgiGet( edtH_ForcolNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_Tipcolco_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_Tipcolco_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_TIPCOLCO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_Tipcolco_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11075H_Tipcolco = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
            }
            else
            {
               A11075H_Tipcolco = (byte)(localUtil.ctol( httpContext.cgiGet( edtH_Tipcolco_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtH_DiaC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "H_DIAC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_DiaC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11076H_DiaC = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
            }
            else
            {
               A11076H_DiaC = localUtil.ctod( httpContext.cgiGet( edtH_DiaC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltDC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltDC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_ULTDC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_UltDC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11077H_UltDC = 0 ;
               n11077H_UltDC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11077H_UltDC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11077H_UltDC), 6, 0));
            }
            else
            {
               A11077H_UltDC = (int)(localUtil.ctol( httpContext.cgiGet( edtH_UltDC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11077H_UltDC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11077H_UltDC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11077H_UltDC), 6, 0));
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A11071H_Forser = httpContext.GetPar( "H_Forser") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
               A11073H_ForcolNm = httpContext.GetPar( "H_ForcolNm") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
               A11074H_ForcolNn = (int)(GXutil.lval( httpContext.GetPar( "H_ForcolNn"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
               A11075H_Tipcolco = (byte)(GXutil.lval( httpContext.GetPar( "H_Tipcolco"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
               A11076H_DiaC = localUtil.parseDateParm( httpContext.GetPar( "H_DiaC")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
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
                        e111AM2 ();
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
            initAll1AM1477( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1478_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1478_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1AM1477( ) ;
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

   public void confirm_1AM0( )
   {
      beforeValidate1AM1477( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AM1477( ) ;
         }
         else
         {
            checkExtendedTable1AM1477( ) ;
            if ( AnyError == 0 )
            {
               zm1AM1477( 2) ;
               zm1AM1477( 3) ;
            }
            closeExtendedTableCursors1AM1477( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1477 = Gx_mode ;
         confirm_1AM1478( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1477 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AM0( ) ;
      }
   }

   public void confirm_1AM1478( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1AM1478( ) ;
         if ( ( nRcdExists_1478 != 0 ) || ( nIsMod_1478 != 0 ) )
         {
            getKey1AM1478( ) ;
            if ( ( nRcdExists_1478 == 0 ) && ( nRcdDeleted_1478 == 0 ) )
            {
               if ( RcdFound1478 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AM1478( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AM1478( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1AM1478( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "H_LINC_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtH_LinC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1478 != 0 )
               {
                  if ( nRcdDeleted_1478 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AM1478( ) ;
                     load1AM1478( ) ;
                     beforeValidate1AM1478( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AM1478( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1478 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AM1478( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AM1478( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1AM1478( ) ;
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
                  if ( nRcdDeleted_1478 == 0 )
                  {
                     GXCCtl = "H_LINC_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_LinC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1478_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_LinC_Internalname, GXutil.ltrim( localUtil.ntoc( A11078H_LinC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PkC_Internalname, GXutil.ltrim( localUtil.ntoc( A11079H_PkC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PmC_Internalname, GXutil.ltrim( localUtil.ntoc( A11080H_PmC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_TmC_Internalname, GXutil.rtrim( A11081H_TmC)) ;
         httpContext.changePostValue( edtH_UsC_Internalname, GXutil.rtrim( A11082H_UsC)) ;
         httpContext.changePostValue( edtH_HhC_Internalname, localUtil.ttoc( A11083H_HhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtH_obsC_Internalname, A11102H_obsC) ;
         httpContext.changePostValue( "ZT_"+"Z11078H_LinC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11078H_LinC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11079H_PkC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11079H_PkC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11080H_PmC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11080H_PmC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11081H_TmC_"+sGXsfl_75_idx, GXutil.rtrim( Z11081H_TmC)) ;
         httpContext.changePostValue( "ZT_"+"Z11082H_UsC_"+sGXsfl_75_idx, GXutil.rtrim( Z11082H_UsC)) ;
         httpContext.changePostValue( "ZT_"+"Z11083H_HhC_"+sGXsfl_75_idx, localUtil.ttoc( Z11083H_HhC, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11102H_obsC_"+sGXsfl_75_idx, Z11102H_obsC) ;
         httpContext.changePostValue( "nRcdDeleted_1478_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1478_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1478_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1478 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1478_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1478_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LinC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_USC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_HHC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_OBSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AM0( )
   {
   }

   public void e111AM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thprecl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thprecl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thprecl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thprecl_impl.this.A396EmprCod = GXv_char2[0] ;
      thprecl_impl.this.AV11EmprNom = GXv_char3[0] ;
      thprecl_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1AM1477( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11072H_ForserD = T01AM5_A11072H_ForserD[0] ;
            Z11077H_UltDC = T01AM5_A11077H_UltDC[0] ;
         }
         else
         {
            Z11072H_ForserD = A11072H_ForserD ;
            Z11077H_UltDC = A11077H_UltDC ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11071H_Forser = A11071H_Forser ;
         Z11073H_ForcolNm = A11073H_ForcolNm ;
         Z11074H_ForcolNn = A11074H_ForcolNn ;
         Z11075H_Tipcolco = A11075H_Tipcolco ;
         Z11076H_DiaC = A11076H_DiaC ;
         Z11072H_ForserD = A11072H_ForserD ;
         Z11077H_UltDC = A11077H_UltDC ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THPRECL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01AM6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AM6_A407EmprNom[0] ;
      n407EmprNom = T01AM6_n407EmprNom[0] ;
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

   public void load1AM1477( )
   {
      /* Using cursor T01AM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1477 = (short)(1) ;
         A407EmprNom = T01AM8_A407EmprNom[0] ;
         n407EmprNom = T01AM8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AM8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A11072H_ForserD = T01AM8_A11072H_ForserD[0] ;
         n11072H_ForserD = T01AM8_n11072H_ForserD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11072H_ForserD", A11072H_ForserD);
         A11077H_UltDC = T01AM8_A11077H_UltDC[0] ;
         n11077H_UltDC = T01AM8_n11077H_UltDC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11077H_UltDC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11077H_UltDC), 6, 0));
         zm1AM1477( -1) ;
      }
      pr_default.close(6);
      onLoadActions1AM1477( ) ;
   }

   public void onLoadActions1AM1477( )
   {
   }

   public void checkExtendedTable1AM1477( )
   {
      nIsDirty_1477 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01AM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AM7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1AM1477( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01AM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AM9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1AM1477( )
   {
      /* Using cursor T01AM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1477 = (short)(1) ;
      }
      else
      {
         RcdFound1477 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01AM5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AM1477( 1) ;
         RcdFound1477 = (short)(1) ;
         A11071H_Forser = T01AM5_A11071H_Forser[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
         A11073H_ForcolNm = T01AM5_A11073H_ForcolNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
         A11074H_ForcolNn = T01AM5_A11074H_ForcolNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
         A11075H_Tipcolco = T01AM5_A11075H_Tipcolco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
         A11076H_DiaC = T01AM5_A11076H_DiaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
         A11072H_ForserD = T01AM5_A11072H_ForserD[0] ;
         n11072H_ForserD = T01AM5_n11072H_ForserD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11072H_ForserD", A11072H_ForserD);
         A11077H_UltDC = T01AM5_A11077H_UltDC[0] ;
         n11077H_UltDC = T01AM5_n11077H_UltDC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11077H_UltDC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11077H_UltDC), 6, 0));
         A252CliCod = T01AM5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z11071H_Forser = A11071H_Forser ;
         Z11073H_ForcolNm = A11073H_ForcolNm ;
         Z11074H_ForcolNn = A11074H_ForcolNn ;
         Z11075H_Tipcolco = A11075H_Tipcolco ;
         Z11076H_DiaC = A11076H_DiaC ;
         sMode1477 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AM1477( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1477 = (short)(0) ;
            initializeNonKey1AM1477( ) ;
         }
         Gx_mode = sMode1477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1477 = (short)(0) ;
         initializeNonKey1AM1477( ) ;
         sMode1477 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1AM1477( ) ;
      if ( RcdFound1477 == 0 )
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
      RcdFound1477 = (short)(0) ;
      /* Using cursor T01AM11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A11071H_Forser, A11071H_Forser, Integer.valueOf(A252CliCod), A11073H_ForcolNm, A11073H_ForcolNm, A11071H_Forser, Integer.valueOf(A252CliCod), Integer.valueOf(A11074H_ForcolNn), Integer.valueOf(A11074H_ForcolNn), A11073H_ForcolNm, A11071H_Forser, Integer.valueOf(A252CliCod), Byte.valueOf(A11075H_Tipcolco), Byte.valueOf(A11075H_Tipcolco), Integer.valueOf(A11074H_ForcolNn), A11073H_ForcolNm, A11071H_Forser, Integer.valueOf(A252CliCod), A11076H_DiaC, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01AM11_A252CliCod[0] < A252CliCod ) || ( T01AM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) < 0 ) || ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) < 0 ) || ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && ( T01AM11_A11074H_ForcolNn[0] < A11074H_ForcolNn ) || ( T01AM11_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && ( T01AM11_A11075H_Tipcolco[0] < A11075H_Tipcolco ) || ( T01AM11_A11075H_Tipcolco[0] == A11075H_Tipcolco ) && ( T01AM11_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AM11_A11076H_DiaC[0]).before( GXutil.resetTime( A11076H_DiaC )) ) && ( GXutil.strcmp(T01AM11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01AM11_A252CliCod[0] > A252CliCod ) || ( T01AM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) > 0 ) || ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) > 0 ) || ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && ( T01AM11_A11074H_ForcolNn[0] > A11074H_ForcolNn ) || ( T01AM11_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && ( T01AM11_A11075H_Tipcolco[0] > A11075H_Tipcolco ) || ( T01AM11_A11075H_Tipcolco[0] == A11075H_Tipcolco ) && ( T01AM11_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM11_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM11_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM11_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AM11_A11076H_DiaC[0]).after( GXutil.resetTime( A11076H_DiaC )) ) && ( GXutil.strcmp(T01AM11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AM11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A11071H_Forser = T01AM11_A11071H_Forser[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
            A11073H_ForcolNm = T01AM11_A11073H_ForcolNm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
            A11074H_ForcolNn = T01AM11_A11074H_ForcolNn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
            A11075H_Tipcolco = T01AM11_A11075H_Tipcolco[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
            A11076H_DiaC = T01AM11_A11076H_DiaC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
            RcdFound1477 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1477 = (short)(0) ;
      /* Using cursor T01AM12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A11071H_Forser, A11071H_Forser, Integer.valueOf(A252CliCod), A11073H_ForcolNm, A11073H_ForcolNm, A11071H_Forser, Integer.valueOf(A252CliCod), Integer.valueOf(A11074H_ForcolNn), Integer.valueOf(A11074H_ForcolNn), A11073H_ForcolNm, A11071H_Forser, Integer.valueOf(A252CliCod), Byte.valueOf(A11075H_Tipcolco), Byte.valueOf(A11075H_Tipcolco), Integer.valueOf(A11074H_ForcolNn), A11073H_ForcolNm, A11071H_Forser, Integer.valueOf(A252CliCod), A11076H_DiaC, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01AM12_A252CliCod[0] > A252CliCod ) || ( T01AM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) > 0 ) || ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) > 0 ) || ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && ( T01AM12_A11074H_ForcolNn[0] > A11074H_ForcolNn ) || ( T01AM12_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && ( T01AM12_A11075H_Tipcolco[0] > A11075H_Tipcolco ) || ( T01AM12_A11075H_Tipcolco[0] == A11075H_Tipcolco ) && ( T01AM12_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AM12_A11076H_DiaC[0]).after( GXutil.resetTime( A11076H_DiaC )) ) && ( GXutil.strcmp(T01AM12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01AM12_A252CliCod[0] < A252CliCod ) || ( T01AM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) < 0 ) || ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) < 0 ) || ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && ( T01AM12_A11074H_ForcolNn[0] < A11074H_ForcolNn ) || ( T01AM12_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && ( T01AM12_A11075H_Tipcolco[0] < A11075H_Tipcolco ) || ( T01AM12_A11075H_Tipcolco[0] == A11075H_Tipcolco ) && ( T01AM12_A11074H_ForcolNn[0] == A11074H_ForcolNn ) && ( GXutil.strcmp(T01AM12_A11073H_ForcolNm[0], A11073H_ForcolNm) == 0 ) && ( GXutil.strcmp(T01AM12_A11071H_Forser[0], A11071H_Forser) == 0 ) && ( T01AM12_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AM12_A11076H_DiaC[0]).before( GXutil.resetTime( A11076H_DiaC )) ) && ( GXutil.strcmp(T01AM12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AM12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A11071H_Forser = T01AM12_A11071H_Forser[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
            A11073H_ForcolNm = T01AM12_A11073H_ForcolNm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
            A11074H_ForcolNn = T01AM12_A11074H_ForcolNn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
            A11075H_Tipcolco = T01AM12_A11075H_Tipcolco[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
            A11076H_DiaC = T01AM12_A11076H_DiaC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
            RcdFound1477 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AM1477( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AM1477( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1477 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A11071H_Forser, Z11071H_Forser) != 0 ) || ( GXutil.strcmp(A11073H_ForcolNm, Z11073H_ForcolNm) != 0 ) || ( A11074H_ForcolNn != Z11074H_ForcolNn ) || ( A11075H_Tipcolco != Z11075H_Tipcolco ) || !( GXutil.dateCompare(GXutil.resetTime(A11076H_DiaC), GXutil.resetTime(Z11076H_DiaC)) ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A11071H_Forser = Z11071H_Forser ;
               httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
               A11073H_ForcolNm = Z11073H_ForcolNm ;
               httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
               A11074H_ForcolNn = Z11074H_ForcolNn ;
               httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
               A11075H_Tipcolco = Z11075H_Tipcolco ;
               httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
               A11076H_DiaC = Z11076H_DiaC ;
               httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1AM1477( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A11071H_Forser, Z11071H_Forser) != 0 ) || ( GXutil.strcmp(A11073H_ForcolNm, Z11073H_ForcolNm) != 0 ) || ( A11074H_ForcolNn != Z11074H_ForcolNn ) || ( A11075H_Tipcolco != Z11075H_Tipcolco ) || !( GXutil.dateCompare(GXutil.resetTime(A11076H_DiaC), GXutil.resetTime(Z11076H_DiaC)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AM1477( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AM1477( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A11071H_Forser, Z11071H_Forser) != 0 ) || ( GXutil.strcmp(A11073H_ForcolNm, Z11073H_ForcolNm) != 0 ) || ( A11074H_ForcolNn != Z11074H_ForcolNn ) || ( A11075H_Tipcolco != Z11075H_Tipcolco ) || !( GXutil.dateCompare(GXutil.resetTime(A11076H_DiaC), GXutil.resetTime(Z11076H_DiaC)) ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11071H_Forser = Z11071H_Forser ;
         httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
         A11073H_ForcolNm = Z11073H_ForcolNm ;
         httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
         A11074H_ForcolNn = Z11074H_ForcolNn ;
         httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
         A11075H_Tipcolco = Z11075H_Tipcolco ;
         httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
         A11076H_DiaC = Z11076H_DiaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey1AM1477( ) ;
      if ( RcdFound1477 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A11071H_Forser, Z11071H_Forser) != 0 ) || ( GXutil.strcmp(A11073H_ForcolNm, Z11073H_ForcolNm) != 0 ) || ( A11074H_ForcolNn != Z11074H_ForcolNn ) || ( A11075H_Tipcolco != Z11075H_Tipcolco ) || !( GXutil.dateCompare(GXutil.resetTime(A11076H_DiaC), GXutil.resetTime(Z11076H_DiaC)) ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A11071H_Forser = Z11071H_Forser ;
            httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
            A11073H_ForcolNm = Z11073H_ForcolNm ;
            httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
            A11074H_ForcolNn = Z11074H_ForcolNn ;
            httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
            A11075H_Tipcolco = Z11075H_Tipcolco ;
            httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
            A11076H_DiaC = Z11076H_DiaC ;
            httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A11071H_Forser, Z11071H_Forser) != 0 ) || ( GXutil.strcmp(A11073H_ForcolNm, Z11073H_ForcolNm) != 0 ) || ( A11074H_ForcolNn != Z11074H_ForcolNn ) || ( A11075H_Tipcolco != Z11075H_Tipcolco ) || !( GXutil.dateCompare(GXutil.resetTime(A11076H_DiaC), GXutil.resetTime(Z11076H_DiaC)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thprecl");
      GX_FocusControl = edtH_ForserD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AM0( ) ;
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
      if ( RcdFound1477 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtH_ForserD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AM1477( ) ;
      if ( RcdFound1477 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_ForserD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AM1477( ) ;
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
      if ( RcdFound1477 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_ForserD_Internalname ;
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
      if ( RcdFound1477 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_ForserD_Internalname ;
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
      scanStart1AM1477( ) ;
      if ( RcdFound1477 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1477 != 0 )
         {
            scanNext1AM1477( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_ForserD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AM1477( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AM1477( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPRECL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z11072H_ForserD, T01AM4_A11072H_ForserD[0]) != 0 ) || ( Z11077H_UltDC != T01AM4_A11077H_UltDC[0] ) )
         {
            if ( GXutil.strcmp(Z11072H_ForserD, T01AM4_A11072H_ForserD[0]) != 0 )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_ForserD");
               GXutil.writeLogRaw("Old: ",Z11072H_ForserD);
               GXutil.writeLogRaw("Current: ",T01AM4_A11072H_ForserD[0]);
            }
            if ( Z11077H_UltDC != T01AM4_A11077H_UltDC[0] )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_UltDC");
               GXutil.writeLogRaw("Old: ",Z11077H_UltDC);
               GXutil.writeLogRaw("Current: ",T01AM4_A11077H_UltDC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPRECL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AM1477( )
   {
      beforeValidate1AM1477( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AM1477( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AM1477( 0) ;
         checkOptimisticConcurrency1AM1477( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AM1477( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AM1477( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AM13 */
                  pr_default.execute(11, new Object[] {A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Boolean.valueOf(n11072H_ForserD), A11072H_ForserD, Boolean.valueOf(n11077H_UltDC), Integer.valueOf(A11077H_UltDC), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPRECL");
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
                        processLevel1AM1477( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AM0( ) ;
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
            load1AM1477( ) ;
         }
         endLevel1AM1477( ) ;
      }
      closeExtendedTableCursors1AM1477( ) ;
   }

   public void update1AM1477( )
   {
      beforeValidate1AM1477( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AM1477( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AM1477( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AM1477( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AM1477( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AM14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n11072H_ForserD), A11072H_ForserD, Boolean.valueOf(n11077H_UltDC), Integer.valueOf(A11077H_UltDC), A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPRECL");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPRECL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AM1477( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AM1477( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AM0( ) ;
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
         endLevel1AM1477( ) ;
      }
      closeExtendedTableCursors1AM1477( ) ;
   }

   public void deferredUpdate1AM1477( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AM1477( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AM1477( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AM1477( ) ;
         afterConfirm1AM1477( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AM1477( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AM1478( ) ;
               while ( RcdFound1478 != 0 )
               {
                  getByPrimaryKey1AM1478( ) ;
                  delete1AM1478( ) ;
                  scanNext1AM1478( ) ;
               }
               scanEnd1AM1478( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AM15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPRECL");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1477 == 0 )
                        {
                           initAll1AM1477( ) ;
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
                        resetCaption1AM0( ) ;
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
      sMode1477 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AM1477( ) ;
      Gx_mode = sMode1477 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AM1477( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01AM16_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1AM1478( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1AM1478( ) ;
         if ( ( nRcdExists_1478 != 0 ) || ( nIsMod_1478 != 0 ) )
         {
            standaloneNotModal1AM1478( ) ;
            getKey1AM1478( ) ;
            if ( ( nRcdExists_1478 == 0 ) && ( nRcdDeleted_1478 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AM1478( ) ;
            }
            else
            {
               if ( RcdFound1478 != 0 )
               {
                  if ( ( nRcdDeleted_1478 != 0 ) && ( nRcdExists_1478 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AM1478( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1478 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AM1478( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1478 == 0 )
                  {
                     GXCCtl = "H_LINC_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_LinC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1478_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_LinC_Internalname, GXutil.ltrim( localUtil.ntoc( A11078H_LinC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PkC_Internalname, GXutil.ltrim( localUtil.ntoc( A11079H_PkC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_PmC_Internalname, GXutil.ltrim( localUtil.ntoc( A11080H_PmC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_TmC_Internalname, GXutil.rtrim( A11081H_TmC)) ;
         httpContext.changePostValue( edtH_UsC_Internalname, GXutil.rtrim( A11082H_UsC)) ;
         httpContext.changePostValue( edtH_HhC_Internalname, localUtil.ttoc( A11083H_HhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtH_obsC_Internalname, A11102H_obsC) ;
         httpContext.changePostValue( "ZT_"+"Z11078H_LinC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11078H_LinC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11079H_PkC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11079H_PkC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11080H_PmC_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z11080H_PmC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11081H_TmC_"+sGXsfl_75_idx, GXutil.rtrim( Z11081H_TmC)) ;
         httpContext.changePostValue( "ZT_"+"Z11082H_UsC_"+sGXsfl_75_idx, GXutil.rtrim( Z11082H_UsC)) ;
         httpContext.changePostValue( "ZT_"+"Z11083H_HhC_"+sGXsfl_75_idx, localUtil.ttoc( Z11083H_HhC, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11102H_obsC_"+sGXsfl_75_idx, Z11102H_obsC) ;
         httpContext.changePostValue( "nRcdDeleted_1478_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1478_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1478_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1478 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1478_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1478_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LinC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_USC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_HHC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_OBSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AM1478( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1478 = (short)(0) ;
      nIsMod_1478 = (short)(0) ;
      nRcdDeleted_1478 = (short)(0) ;
   }

   public void processLevel1AM1477( )
   {
      /* Save parent mode. */
      sMode1477 = Gx_mode ;
      processNestedLevel1AM1478( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1477 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AM1477( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AM1477( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thprecl");
         if ( AnyError == 0 )
         {
            confirmValues1AM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thprecl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AM1477( )
   {
      /* Scan By routine */
      /* Using cursor T01AM17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound1477 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1477 = (short)(1) ;
         A252CliCod = T01AM17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11071H_Forser = T01AM17_A11071H_Forser[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
         A11073H_ForcolNm = T01AM17_A11073H_ForcolNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
         A11074H_ForcolNn = T01AM17_A11074H_ForcolNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
         A11075H_Tipcolco = T01AM17_A11075H_Tipcolco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
         A11076H_DiaC = T01AM17_A11076H_DiaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AM1477( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1477 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1477 = (short)(1) ;
         A252CliCod = T01AM17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11071H_Forser = T01AM17_A11071H_Forser[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
         A11073H_ForcolNm = T01AM17_A11073H_ForcolNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
         A11074H_ForcolNn = T01AM17_A11074H_ForcolNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
         A11075H_Tipcolco = T01AM17_A11075H_Tipcolco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
         A11076H_DiaC = T01AM17_A11076H_DiaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
      }
   }

   public void scanEnd1AM1477( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1AM1477( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AM1477( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AM1477( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AM1477( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AM1477( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AM1477( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AM1477( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtH_Forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_Forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_Forser_Enabled), 5, 0), true);
      edtH_ForserD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_ForserD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ForserD_Enabled), 5, 0), true);
      edtH_ForcolNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_ForcolNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ForcolNm_Enabled), 5, 0), true);
      edtH_ForcolNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_ForcolNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ForcolNn_Enabled), 5, 0), true);
      edtH_Tipcolco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_Tipcolco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_Tipcolco_Enabled), 5, 0), true);
      edtH_DiaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_DiaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_DiaC_Enabled), 5, 0), true);
      edtH_UltDC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UltDC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UltDC_Enabled), 5, 0), true);
   }

   public void zm1AM1478( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11079H_PkC = T01AM3_A11079H_PkC[0] ;
            Z11080H_PmC = T01AM3_A11080H_PmC[0] ;
            Z11081H_TmC = T01AM3_A11081H_TmC[0] ;
            Z11082H_UsC = T01AM3_A11082H_UsC[0] ;
            Z11083H_HhC = T01AM3_A11083H_HhC[0] ;
            Z11102H_obsC = T01AM3_A11102H_obsC[0] ;
         }
         else
         {
            Z11079H_PkC = A11079H_PkC ;
            Z11080H_PmC = A11080H_PmC ;
            Z11081H_TmC = A11081H_TmC ;
            Z11082H_UsC = A11082H_UsC ;
            Z11083H_HhC = A11083H_HhC ;
            Z11102H_obsC = A11102H_obsC ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z252CliCod = A252CliCod ;
         Z11071H_Forser = A11071H_Forser ;
         Z11073H_ForcolNm = A11073H_ForcolNm ;
         Z11074H_ForcolNn = A11074H_ForcolNn ;
         Z11075H_Tipcolco = A11075H_Tipcolco ;
         Z11076H_DiaC = A11076H_DiaC ;
         Z11078H_LinC = A11078H_LinC ;
         Z11079H_PkC = A11079H_PkC ;
         Z11080H_PmC = A11080H_PmC ;
         Z11081H_TmC = A11081H_TmC ;
         Z11082H_UsC = A11082H_UsC ;
         Z11083H_HhC = A11083H_HhC ;
         Z11102H_obsC = A11102H_obsC ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1AM1478( )
   {
   }

   public void standaloneModal1AM1478( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_LinC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_LinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LinC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtH_LinC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_LinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LinC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1AM1478( )
   {
      /* Using cursor T01AM18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1478 = (short)(1) ;
         A11079H_PkC = T01AM18_A11079H_PkC[0] ;
         n11079H_PkC = T01AM18_n11079H_PkC[0] ;
         A11080H_PmC = T01AM18_A11080H_PmC[0] ;
         n11080H_PmC = T01AM18_n11080H_PmC[0] ;
         A11081H_TmC = T01AM18_A11081H_TmC[0] ;
         n11081H_TmC = T01AM18_n11081H_TmC[0] ;
         A11082H_UsC = T01AM18_A11082H_UsC[0] ;
         n11082H_UsC = T01AM18_n11082H_UsC[0] ;
         A11083H_HhC = T01AM18_A11083H_HhC[0] ;
         n11083H_HhC = T01AM18_n11083H_HhC[0] ;
         A11102H_obsC = T01AM18_A11102H_obsC[0] ;
         n11102H_obsC = T01AM18_n11102H_obsC[0] ;
         zm1AM1478( -4) ;
      }
      pr_default.close(16);
      onLoadActions1AM1478( ) ;
   }

   public void onLoadActions1AM1478( )
   {
   }

   public void checkExtendedTable1AM1478( )
   {
      nIsDirty_1478 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AM1478( ) ;
   }

   public void closeExtendedTableCursors1AM1478( )
   {
   }

   public void enableDisable1AM1478( )
   {
   }

   public void getKey1AM1478( )
   {
      /* Using cursor T01AM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1478 = (short)(1) ;
      }
      else
      {
         RcdFound1478 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1AM1478( )
   {
      /* Using cursor T01AM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AM1478( 4) ;
         RcdFound1478 = (short)(1) ;
         initializeNonKey1AM1478( ) ;
         A11078H_LinC = T01AM3_A11078H_LinC[0] ;
         A11079H_PkC = T01AM3_A11079H_PkC[0] ;
         n11079H_PkC = T01AM3_n11079H_PkC[0] ;
         A11080H_PmC = T01AM3_A11080H_PmC[0] ;
         n11080H_PmC = T01AM3_n11080H_PmC[0] ;
         A11081H_TmC = T01AM3_A11081H_TmC[0] ;
         n11081H_TmC = T01AM3_n11081H_TmC[0] ;
         A11082H_UsC = T01AM3_A11082H_UsC[0] ;
         n11082H_UsC = T01AM3_n11082H_UsC[0] ;
         A11083H_HhC = T01AM3_A11083H_HhC[0] ;
         n11083H_HhC = T01AM3_n11083H_HhC[0] ;
         A11102H_obsC = T01AM3_A11102H_obsC[0] ;
         n11102H_obsC = T01AM3_n11102H_obsC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z11071H_Forser = A11071H_Forser ;
         Z11073H_ForcolNm = A11073H_ForcolNm ;
         Z11074H_ForcolNn = A11074H_ForcolNn ;
         Z11075H_Tipcolco = A11075H_Tipcolco ;
         Z11076H_DiaC = A11076H_DiaC ;
         Z11078H_LinC = A11078H_LinC ;
         sMode1478 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AM1478( ) ;
         load1AM1478( ) ;
         Gx_mode = sMode1478 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1478 = (short)(0) ;
         initializeNonKey1AM1478( ) ;
         sMode1478 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AM1478( ) ;
         Gx_mode = sMode1478 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AM1478( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AM1478( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11079H_PkC, T01AM2_A11079H_PkC[0]) != 0 ) || ( DecimalUtil.compareTo(Z11080H_PmC, T01AM2_A11080H_PmC[0]) != 0 ) || ( GXutil.strcmp(Z11081H_TmC, T01AM2_A11081H_TmC[0]) != 0 ) || ( GXutil.strcmp(Z11082H_UsC, T01AM2_A11082H_UsC[0]) != 0 ) || !( GXutil.dateCompare(Z11083H_HhC, T01AM2_A11083H_HhC[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11102H_obsC, T01AM2_A11102H_obsC[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11079H_PkC, T01AM2_A11079H_PkC[0]) != 0 )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_PkC");
               GXutil.writeLogRaw("Old: ",Z11079H_PkC);
               GXutil.writeLogRaw("Current: ",T01AM2_A11079H_PkC[0]);
            }
            if ( DecimalUtil.compareTo(Z11080H_PmC, T01AM2_A11080H_PmC[0]) != 0 )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_PmC");
               GXutil.writeLogRaw("Old: ",Z11080H_PmC);
               GXutil.writeLogRaw("Current: ",T01AM2_A11080H_PmC[0]);
            }
            if ( GXutil.strcmp(Z11081H_TmC, T01AM2_A11081H_TmC[0]) != 0 )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_TmC");
               GXutil.writeLogRaw("Old: ",Z11081H_TmC);
               GXutil.writeLogRaw("Current: ",T01AM2_A11081H_TmC[0]);
            }
            if ( GXutil.strcmp(Z11082H_UsC, T01AM2_A11082H_UsC[0]) != 0 )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_UsC");
               GXutil.writeLogRaw("Old: ",Z11082H_UsC);
               GXutil.writeLogRaw("Current: ",T01AM2_A11082H_UsC[0]);
            }
            if ( !( GXutil.dateCompare(Z11083H_HhC, T01AM2_A11083H_HhC[0]) ) )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_HhC");
               GXutil.writeLogRaw("Old: ",Z11083H_HhC);
               GXutil.writeLogRaw("Current: ",T01AM2_A11083H_HhC[0]);
            }
            if ( GXutil.strcmp(Z11102H_obsC, T01AM2_A11102H_obsC[0]) != 0 )
            {
               GXutil.writeLogln("thprecl:[seudo value changed for attri]"+"H_obsC");
               GXutil.writeLogRaw("Old: ",Z11102H_obsC);
               GXutil.writeLogRaw("Current: ",T01AM2_A11102H_obsC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AM1478( )
   {
      beforeValidate1AM1478( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AM1478( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AM1478( 0) ;
         checkOptimisticConcurrency1AM1478( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AM1478( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AM1478( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AM20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC), Boolean.valueOf(n11079H_PkC), A11079H_PkC, Boolean.valueOf(n11080H_PmC), A11080H_PmC, Boolean.valueOf(n11081H_TmC), A11081H_TmC, Boolean.valueOf(n11082H_UsC), A11082H_UsC, Boolean.valueOf(n11083H_HhC), A11083H_HhC, Boolean.valueOf(n11102H_obsC), A11102H_obsC, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREC1");
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
            load1AM1478( ) ;
         }
         endLevel1AM1478( ) ;
      }
      closeExtendedTableCursors1AM1478( ) ;
   }

   public void update1AM1478( )
   {
      beforeValidate1AM1478( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AM1478( ) ;
      }
      if ( ( nIsMod_1478 != 0 ) || ( nIsDirty_1478 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AM1478( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AM1478( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AM1478( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AM21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n11079H_PkC), A11079H_PkC, Boolean.valueOf(n11080H_PmC), A11080H_PmC, Boolean.valueOf(n11081H_TmC), A11081H_TmC, Boolean.valueOf(n11082H_UsC), A11082H_UsC, Boolean.valueOf(n11083H_HhC), A11083H_HhC, Boolean.valueOf(n11102H_obsC), A11102H_obsC, A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREC1");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AM1478( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AM1478( ) ;
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
            endLevel1AM1478( ) ;
         }
      }
      closeExtendedTableCursors1AM1478( ) ;
   }

   public void deferredUpdate1AM1478( )
   {
   }

   public void delete1AM1478( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AM1478( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AM1478( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AM1478( ) ;
         afterConfirm1AM1478( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AM1478( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AM22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC, Integer.valueOf(A11078H_LinC)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREC1");
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
      sMode1478 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AM1478( ) ;
      Gx_mode = sMode1478 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AM1478( )
   {
      standaloneModal1AM1478( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1AM1478( )
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

   public void scanStart1AM1478( )
   {
      /* Scan By routine */
      /* Using cursor T01AM23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11071H_Forser, A11073H_ForcolNm, Integer.valueOf(A11074H_ForcolNn), Byte.valueOf(A11075H_Tipcolco), A11076H_DiaC});
      RcdFound1478 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1478 = (short)(1) ;
         A11078H_LinC = T01AM23_A11078H_LinC[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AM1478( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1478 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1478 = (short)(1) ;
         A11078H_LinC = T01AM23_A11078H_LinC[0] ;
      }
   }

   public void scanEnd1AM1478( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1AM1478( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AM1478( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AM1478( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AM1478( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AM1478( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AM1478( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AM1478( )
   {
      edtH_LinC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_LinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LinC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtH_PkC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_PkC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PkC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtH_PmC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_PmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PmC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtH_TmC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_TmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_TmC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtH_UsC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UsC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UsC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtH_HhC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_HhC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_HhC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtH_obsC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_obsC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_obsC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1AM1478( )
   {
   }

   public void send_integrity_lvl_hashes1AM1477( )
   {
   }

   public void subsflControlProps_751478( )
   {
      edtavnRcdDeleted_1478_Internalname = "vNRCDDELETED_1478_"+sGXsfl_75_idx ;
      edtH_LinC_Internalname = "H_LINC_"+sGXsfl_75_idx ;
      edtH_PkC_Internalname = "H_PKC_"+sGXsfl_75_idx ;
      edtH_PmC_Internalname = "H_PMC_"+sGXsfl_75_idx ;
      edtH_TmC_Internalname = "H_TMC_"+sGXsfl_75_idx ;
      edtH_UsC_Internalname = "H_USC_"+sGXsfl_75_idx ;
      edtH_HhC_Internalname = "H_HHC_"+sGXsfl_75_idx ;
      edtH_obsC_Internalname = "H_OBSC_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_751478( )
   {
      edtavnRcdDeleted_1478_Internalname = "vNRCDDELETED_1478_"+sGXsfl_75_fel_idx ;
      edtH_LinC_Internalname = "H_LINC_"+sGXsfl_75_fel_idx ;
      edtH_PkC_Internalname = "H_PKC_"+sGXsfl_75_fel_idx ;
      edtH_PmC_Internalname = "H_PMC_"+sGXsfl_75_fel_idx ;
      edtH_TmC_Internalname = "H_TMC_"+sGXsfl_75_fel_idx ;
      edtH_UsC_Internalname = "H_USC_"+sGXsfl_75_fel_idx ;
      edtH_HhC_Internalname = "H_HHC_"+sGXsfl_75_fel_idx ;
      edtH_obsC_Internalname = "H_OBSC_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1AM1478( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751478( ) ;
      sendRow1AM1478( ) ;
   }

   public void sendRow1AM1478( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1478_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1478_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1478), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1478), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1478_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1478_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_LinC_Internalname,GXutil.ltrim( localUtil.ntoc( A11078H_LinC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11078H_LinC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_LinC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_LinC_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_PkC_Internalname,GXutil.ltrim( localUtil.ntoc( A11079H_PkC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_PkC_Enabled!=0) ? localUtil.format( A11079H_PkC, "ZZZZZ9.99999") : localUtil.format( A11079H_PkC, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_PkC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_PkC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_PmC_Internalname,GXutil.ltrim( localUtil.ntoc( A11080H_PmC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_PmC_Enabled!=0) ? localUtil.format( A11080H_PmC, "ZZZZZ9.99999") : localUtil.format( A11080H_PmC, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_PmC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_PmC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_TmC_Internalname,GXutil.rtrim( A11081H_TmC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_TmC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_TmC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_UsC_Internalname,GXutil.rtrim( A11082H_UsC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_UsC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_UsC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_HhC_Internalname,localUtil.ttoc( A11083H_HhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11083H_HhC, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_HhC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_HhC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1478_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_obsC_Internalname,A11102H_obsC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_obsC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_obsC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AM1478( ) ;
      GXCCtl = "Z11078H_LinC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11078H_LinC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11079H_PkC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11079H_PkC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11080H_PmC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11080H_PmC, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11081H_TmC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11081H_TmC));
      GXCCtl = "Z11082H_UsC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11082H_UsC));
      GXCCtl = "Z11083H_HhC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z11083H_HhC, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z11102H_obsC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11102H_obsC);
      GXCCtl = "nRcdDeleted_1478_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1478_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1478_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1478, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1478_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1478_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_LINC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LinC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PKC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_TMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_USC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_HHC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_OBSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsC_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AM1478( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751478( ) ;
      edtavnRcdDeleted_1478_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1478_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_LinC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_PkC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_PmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PMC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_TmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TMC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_UsC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_USC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_HhC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_HHC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_obsC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_OBSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1478_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1478_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1478");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1478_Internalname ;
         wbErr = true ;
         nRcdDeleted_1478 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1478 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1478_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_LinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_LinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "H_LINC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_LinC_Internalname ;
         wbErr = true ;
         A11078H_LinC = 0 ;
      }
      else
      {
         A11078H_LinC = (int)(localUtil.ctol( httpContext.cgiGet( edtH_LinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_PkC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_PkC_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PKC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_PkC_Internalname ;
         wbErr = true ;
         A11079H_PkC = DecimalUtil.ZERO ;
         n11079H_PkC = false ;
      }
      else
      {
         A11079H_PkC = localUtil.ctond( httpContext.cgiGet( edtH_PkC_Internalname)) ;
         n11079H_PkC = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_PmC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_PmC_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PMC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_PmC_Internalname ;
         wbErr = true ;
         A11080H_PmC = DecimalUtil.ZERO ;
         n11080H_PmC = false ;
      }
      else
      {
         A11080H_PmC = localUtil.ctond( httpContext.cgiGet( edtH_PmC_Internalname)) ;
         n11080H_PmC = false ;
      }
      A11081H_TmC = httpContext.cgiGet( edtH_TmC_Internalname) ;
      n11081H_TmC = false ;
      A11082H_UsC = httpContext.cgiGet( edtH_UsC_Internalname) ;
      n11082H_UsC = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtH_HhC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "H_HHC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_HhC_Internalname ;
         wbErr = true ;
         A11083H_HhC = GXutil.resetTime( GXutil.nullDate() );
         n11083H_HhC = false ;
      }
      else
      {
         A11083H_HhC = localUtil.ctot( httpContext.cgiGet( edtH_HhC_Internalname)) ;
         n11083H_HhC = false ;
      }
      A11102H_obsC = httpContext.cgiGet( edtH_obsC_Internalname) ;
      n11102H_obsC = false ;
      GXCCtl = "Z11078H_LinC_" + sGXsfl_75_idx ;
      Z11078H_LinC = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11079H_PkC_" + sGXsfl_75_idx ;
      Z11079H_PkC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11080H_PmC_" + sGXsfl_75_idx ;
      Z11080H_PmC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11081H_TmC_" + sGXsfl_75_idx ;
      Z11081H_TmC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11082H_UsC_" + sGXsfl_75_idx ;
      Z11082H_UsC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11083H_HhC_" + sGXsfl_75_idx ;
      Z11083H_HhC = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11102H_obsC_" + sGXsfl_75_idx ;
      Z11102H_obsC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1478_" + sGXsfl_75_idx ;
      nRcdDeleted_1478 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1478_" + sGXsfl_75_idx ;
      nRcdExists_1478 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1478_" + sGXsfl_75_idx ;
      nIsMod_1478 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtH_LinC_Enabled = edtH_LinC_Enabled ;
   }

   public void confirmValues1AM0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751478( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751478( ) ;
         httpContext.changePostValue( "Z11078H_LinC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11078H_LinC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11078H_LinC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11079H_PkC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11079H_PkC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11079H_PkC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11080H_PmC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11080H_PmC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11080H_PmC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11081H_TmC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11081H_TmC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11081H_TmC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11082H_UsC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11082H_UsC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11082H_UsC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11083H_HhC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11083H_HhC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11083H_HhC_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z11102H_obsC_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z11102H_obsC_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11102H_obsC_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thprecl", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11071H_Forser", GXutil.rtrim( Z11071H_Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11073H_ForcolNm", GXutil.rtrim( Z11073H_ForcolNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11074H_ForcolNn", GXutil.ltrim( localUtil.ntoc( Z11074H_ForcolNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11075H_Tipcolco", GXutil.ltrim( localUtil.ntoc( Z11075H_Tipcolco, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11076H_DiaC", localUtil.dtoc( Z11076H_DiaC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11072H_ForserD", GXutil.rtrim( Z11072H_ForserD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11077H_UltDC", GXutil.ltrim( localUtil.ntoc( Z11077H_UltDC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thprecl", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THPRECL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PRECIOS COLOR", "") ;
   }

   public void initializeNonKey1AM1477( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A11072H_ForserD = "" ;
      n11072H_ForserD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11072H_ForserD", A11072H_ForserD);
      A11077H_UltDC = 0 ;
      n11077H_UltDC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11077H_UltDC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11077H_UltDC), 6, 0));
      Z11072H_ForserD = "" ;
      Z11077H_UltDC = 0 ;
   }

   public void initAll1AM1477( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A11071H_Forser = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11071H_Forser", A11071H_Forser);
      A11073H_ForcolNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11073H_ForcolNm", A11073H_ForcolNm);
      A11074H_ForcolNn = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11074H_ForcolNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11074H_ForcolNn), 6, 0));
      A11075H_Tipcolco = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11075H_Tipcolco", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11075H_Tipcolco), 2, 0));
      A11076H_DiaC = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11076H_DiaC", localUtil.format(A11076H_DiaC, "99/99/99"));
      initializeNonKey1AM1477( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AM1478( )
   {
      A11079H_PkC = DecimalUtil.ZERO ;
      n11079H_PkC = false ;
      A11080H_PmC = DecimalUtil.ZERO ;
      n11080H_PmC = false ;
      A11081H_TmC = "" ;
      n11081H_TmC = false ;
      A11082H_UsC = "" ;
      n11082H_UsC = false ;
      A11083H_HhC = GXutil.resetTime( GXutil.nullDate() );
      n11083H_HhC = false ;
      A11102H_obsC = "" ;
      n11102H_obsC = false ;
      Z11079H_PkC = DecimalUtil.ZERO ;
      Z11080H_PmC = DecimalUtil.ZERO ;
      Z11081H_TmC = "" ;
      Z11082H_UsC = "" ;
      Z11083H_HhC = GXutil.resetTime( GXutil.nullDate() );
      Z11102H_obsC = "" ;
   }

   public void initAll1AM1478( )
   {
      A11078H_LinC = 0 ;
      initializeNonKey1AM1478( ) ;
   }

   public void standaloneModalInsert1AM1478( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241562462", true, true);
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
      httpContext.AddJavascriptSource("thprecl.js", "?20268241562462", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1478( )
   {
      edtH_LinC_Enabled = defedtH_LinC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_LinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LinC_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1478, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1478_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11078H_LinC, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LinC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11079H_PkC, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PkC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11080H_PmC, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11081H_TmC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_TmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11082H_UsC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A11083H_HhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11102H_obsC);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsC_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtH_Forser_Internalname = "H_FORSER" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtH_ForserD_Internalname = "H_FORSERD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtH_ForcolNm_Internalname = "H_FORCOLNM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtH_ForcolNn_Internalname = "H_FORCOLNN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtH_Tipcolco_Internalname = "H_TIPCOLCO" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtH_DiaC_Internalname = "H_DIAC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtH_UltDC_Internalname = "H_ULTDC" ;
      edtavnRcdDeleted_1478_Internalname = "vNRCDDELETED_1478" ;
      edtH_LinC_Internalname = "H_LINC" ;
      edtH_PkC_Internalname = "H_PKC" ;
      edtH_PmC_Internalname = "H_PMC" ;
      edtH_TmC_Internalname = "H_TMC" ;
      edtH_UsC_Internalname = "H_USC" ;
      edtH_HhC_Internalname = "H_HHC" ;
      edtH_obsC_Internalname = "H_OBSC" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PRECIOS COLOR", "") );
      edtH_obsC_Jsonclick = "" ;
      edtH_HhC_Jsonclick = "" ;
      edtH_UsC_Jsonclick = "" ;
      edtH_TmC_Jsonclick = "" ;
      edtH_PmC_Jsonclick = "" ;
      edtH_PkC_Jsonclick = "" ;
      edtH_LinC_Jsonclick = "" ;
      edtavnRcdDeleted_1478_Jsonclick = "" ;
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
      edtH_obsC_Enabled = 1 ;
      edtH_HhC_Enabled = 1 ;
      edtH_UsC_Enabled = 1 ;
      edtH_TmC_Enabled = 1 ;
      edtH_PmC_Enabled = 1 ;
      edtH_PkC_Enabled = 1 ;
      edtH_LinC_Enabled = 1 ;
      edtavnRcdDeleted_1478_Enabled = 1 ;
      edtH_UltDC_Jsonclick = "" ;
      edtH_UltDC_Backcolor = (int)(0xFFFFFF) ;
      edtH_UltDC_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtH_DiaC_Jsonclick = "" ;
      edtH_DiaC_Backcolor = (int)(0xFFFFFF) ;
      edtH_DiaC_Enabled = 1 ;
      edtH_Tipcolco_Jsonclick = "" ;
      edtH_Tipcolco_Backcolor = (int)(0xFFFFFF) ;
      edtH_Tipcolco_Enabled = 1 ;
      edtH_ForcolNn_Jsonclick = "" ;
      edtH_ForcolNn_Backcolor = (int)(0xFFFFFF) ;
      edtH_ForcolNn_Enabled = 1 ;
      edtH_ForcolNm_Jsonclick = "" ;
      edtH_ForcolNm_Backcolor = (int)(0xFFFFFF) ;
      edtH_ForcolNm_Enabled = 1 ;
      edtH_ForserD_Jsonclick = "" ;
      edtH_ForserD_Backcolor = (int)(0xFFFFFF) ;
      edtH_ForserD_Enabled = 1 ;
      edtH_Forser_Jsonclick = "" ;
      edtH_Forser_Backcolor = (int)(0xFFFFFF) ;
      edtH_Forser_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      subsflControlProps_751478( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AM1478( ) ;
         standaloneModal1AM1478( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AM1478( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751478( ) ;
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
      /* Using cursor T01AM24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AM24_A407EmprNom[0] ;
      n407EmprNom = T01AM24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T01AM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AM16_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(14);
      GX_FocusControl = edtH_ForserD_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01AM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01AM16_A279CliNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_H_diac( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11072H_ForserD", GXutil.rtrim( A11072H_ForserD));
      httpContext.ajax_rsp_assign_attri("", false, "A11077H_UltDC", GXutil.ltrim( localUtil.ntoc( A11077H_UltDC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11071H_Forser", GXutil.rtrim( Z11071H_Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11073H_ForcolNm", GXutil.rtrim( Z11073H_ForcolNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11074H_ForcolNn", GXutil.ltrim( localUtil.ntoc( Z11074H_ForcolNn, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11075H_Tipcolco", GXutil.ltrim( localUtil.ntoc( Z11075H_Tipcolco, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11076H_DiaC", localUtil.format(Z11076H_DiaC, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11072H_ForserD", GXutil.rtrim( Z11072H_ForserD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11077H_UltDC", GXutil.ltrim( localUtil.ntoc( Z11077H_UltDC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_H_FORSER","{handler:'valid_H_forser',iparms:[]");
      setEventMetadata("VALID_H_FORSER",",oparms:[]}");
      setEventMetadata("VALID_H_FORCOLNM","{handler:'valid_H_forcolnm',iparms:[]");
      setEventMetadata("VALID_H_FORCOLNM",",oparms:[]}");
      setEventMetadata("VALID_H_FORCOLNN","{handler:'valid_H_forcolnn',iparms:[]");
      setEventMetadata("VALID_H_FORCOLNN",",oparms:[]}");
      setEventMetadata("VALID_H_TIPCOLCO","{handler:'valid_H_tipcolco',iparms:[]");
      setEventMetadata("VALID_H_TIPCOLCO",",oparms:[]}");
      setEventMetadata("VALID_H_DIAC","{handler:'valid_H_diac',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A11071H_Forser',fld:'H_FORSER',pic:''},{av:'A11073H_ForcolNm',fld:'H_FORCOLNM',pic:''},{av:'A11074H_ForcolNn',fld:'H_FORCOLNN',pic:'ZZZZZ9'},{av:'A11075H_Tipcolco',fld:'H_TIPCOLCO',pic:'Z9'},{av:'A11076H_DiaC',fld:'H_DIAC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_H_DIAC",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11072H_ForserD',fld:'H_FORSERD',pic:''},{av:'A11077H_UltDC',fld:'H_ULTDC',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z11071H_Forser'},{av:'Z11073H_ForcolNm'},{av:'Z11074H_ForcolNn'},{av:'Z11075H_Tipcolco'},{av:'Z11076H_DiaC'},{av:'Z407EmprNom'},{av:'Z11072H_ForserD'},{av:'Z11077H_UltDC'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_H_LINC","{handler:'valid_H_linc',iparms:[]");
      setEventMetadata("VALID_H_LINC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_H_obsc',iparms:[]");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11071H_Forser = "" ;
      Z11073H_ForcolNm = "" ;
      Z11076H_DiaC = GXutil.nullDate() ;
      Z11072H_ForserD = "" ;
      Z11079H_PkC = DecimalUtil.ZERO ;
      Z11080H_PmC = DecimalUtil.ZERO ;
      Z11081H_TmC = "" ;
      Z11082H_UsC = "" ;
      Z11083H_HhC = GXutil.resetTime( GXutil.nullDate() );
      Z11102H_obsC = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A11071H_Forser = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11072H_ForserD = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11073H_ForcolNm = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A11076H_DiaC = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1478 = "" ;
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
      sMode1477 = "" ;
      GXCCtl = "" ;
      A11079H_PkC = DecimalUtil.ZERO ;
      A11080H_PmC = DecimalUtil.ZERO ;
      A11081H_TmC = "" ;
      A11082H_UsC = "" ;
      A11083H_HhC = GXutil.resetTime( GXutil.nullDate() );
      A11102H_obsC = "" ;
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
      Z279CliNom = "" ;
      T01AM6_A407EmprNom = new String[] {""} ;
      T01AM6_n407EmprNom = new boolean[] {false} ;
      T01AM8_A11071H_Forser = new String[] {""} ;
      T01AM8_A11073H_ForcolNm = new String[] {""} ;
      T01AM8_A11074H_ForcolNn = new int[1] ;
      T01AM8_A11075H_Tipcolco = new byte[1] ;
      T01AM8_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM8_A407EmprNom = new String[] {""} ;
      T01AM8_n407EmprNom = new boolean[] {false} ;
      T01AM8_A279CliNom = new String[] {""} ;
      T01AM8_A11072H_ForserD = new String[] {""} ;
      T01AM8_n11072H_ForserD = new boolean[] {false} ;
      T01AM8_A11077H_UltDC = new int[1] ;
      T01AM8_n11077H_UltDC = new boolean[] {false} ;
      T01AM8_A396EmprCod = new String[] {""} ;
      T01AM8_A252CliCod = new int[1] ;
      T01AM7_A279CliNom = new String[] {""} ;
      T01AM9_A279CliNom = new String[] {""} ;
      T01AM10_A396EmprCod = new String[] {""} ;
      T01AM10_A252CliCod = new int[1] ;
      T01AM10_A11071H_Forser = new String[] {""} ;
      T01AM10_A11073H_ForcolNm = new String[] {""} ;
      T01AM10_A11074H_ForcolNn = new int[1] ;
      T01AM10_A11075H_Tipcolco = new byte[1] ;
      T01AM10_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM5_A11071H_Forser = new String[] {""} ;
      T01AM5_A11073H_ForcolNm = new String[] {""} ;
      T01AM5_A11074H_ForcolNn = new int[1] ;
      T01AM5_A11075H_Tipcolco = new byte[1] ;
      T01AM5_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM5_A11072H_ForserD = new String[] {""} ;
      T01AM5_n11072H_ForserD = new boolean[] {false} ;
      T01AM5_A11077H_UltDC = new int[1] ;
      T01AM5_n11077H_UltDC = new boolean[] {false} ;
      T01AM5_A396EmprCod = new String[] {""} ;
      T01AM5_A252CliCod = new int[1] ;
      T01AM11_A396EmprCod = new String[] {""} ;
      T01AM11_A252CliCod = new int[1] ;
      T01AM11_A11071H_Forser = new String[] {""} ;
      T01AM11_A11073H_ForcolNm = new String[] {""} ;
      T01AM11_A11074H_ForcolNn = new int[1] ;
      T01AM11_A11075H_Tipcolco = new byte[1] ;
      T01AM11_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM12_A396EmprCod = new String[] {""} ;
      T01AM12_A252CliCod = new int[1] ;
      T01AM12_A11071H_Forser = new String[] {""} ;
      T01AM12_A11073H_ForcolNm = new String[] {""} ;
      T01AM12_A11074H_ForcolNn = new int[1] ;
      T01AM12_A11075H_Tipcolco = new byte[1] ;
      T01AM12_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM4_A11071H_Forser = new String[] {""} ;
      T01AM4_A11073H_ForcolNm = new String[] {""} ;
      T01AM4_A11074H_ForcolNn = new int[1] ;
      T01AM4_A11075H_Tipcolco = new byte[1] ;
      T01AM4_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM4_A11072H_ForserD = new String[] {""} ;
      T01AM4_n11072H_ForserD = new boolean[] {false} ;
      T01AM4_A11077H_UltDC = new int[1] ;
      T01AM4_n11077H_UltDC = new boolean[] {false} ;
      T01AM4_A396EmprCod = new String[] {""} ;
      T01AM4_A252CliCod = new int[1] ;
      T01AM16_A279CliNom = new String[] {""} ;
      T01AM17_A396EmprCod = new String[] {""} ;
      T01AM17_A252CliCod = new int[1] ;
      T01AM17_A11071H_Forser = new String[] {""} ;
      T01AM17_A11073H_ForcolNm = new String[] {""} ;
      T01AM17_A11074H_ForcolNn = new int[1] ;
      T01AM17_A11075H_Tipcolco = new byte[1] ;
      T01AM17_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM18_A252CliCod = new int[1] ;
      T01AM18_A11071H_Forser = new String[] {""} ;
      T01AM18_A11073H_ForcolNm = new String[] {""} ;
      T01AM18_A11074H_ForcolNn = new int[1] ;
      T01AM18_A11075H_Tipcolco = new byte[1] ;
      T01AM18_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM18_A11078H_LinC = new int[1] ;
      T01AM18_A11079H_PkC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AM18_n11079H_PkC = new boolean[] {false} ;
      T01AM18_A11080H_PmC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AM18_n11080H_PmC = new boolean[] {false} ;
      T01AM18_A11081H_TmC = new String[] {""} ;
      T01AM18_n11081H_TmC = new boolean[] {false} ;
      T01AM18_A11082H_UsC = new String[] {""} ;
      T01AM18_n11082H_UsC = new boolean[] {false} ;
      T01AM18_A11083H_HhC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM18_n11083H_HhC = new boolean[] {false} ;
      T01AM18_A11102H_obsC = new String[] {""} ;
      T01AM18_n11102H_obsC = new boolean[] {false} ;
      T01AM18_A396EmprCod = new String[] {""} ;
      T01AM19_A396EmprCod = new String[] {""} ;
      T01AM19_A252CliCod = new int[1] ;
      T01AM19_A11071H_Forser = new String[] {""} ;
      T01AM19_A11073H_ForcolNm = new String[] {""} ;
      T01AM19_A11074H_ForcolNn = new int[1] ;
      T01AM19_A11075H_Tipcolco = new byte[1] ;
      T01AM19_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM19_A11078H_LinC = new int[1] ;
      T01AM3_A252CliCod = new int[1] ;
      T01AM3_A11071H_Forser = new String[] {""} ;
      T01AM3_A11073H_ForcolNm = new String[] {""} ;
      T01AM3_A11074H_ForcolNn = new int[1] ;
      T01AM3_A11075H_Tipcolco = new byte[1] ;
      T01AM3_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM3_A11078H_LinC = new int[1] ;
      T01AM3_A11079H_PkC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AM3_n11079H_PkC = new boolean[] {false} ;
      T01AM3_A11080H_PmC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AM3_n11080H_PmC = new boolean[] {false} ;
      T01AM3_A11081H_TmC = new String[] {""} ;
      T01AM3_n11081H_TmC = new boolean[] {false} ;
      T01AM3_A11082H_UsC = new String[] {""} ;
      T01AM3_n11082H_UsC = new boolean[] {false} ;
      T01AM3_A11083H_HhC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM3_n11083H_HhC = new boolean[] {false} ;
      T01AM3_A11102H_obsC = new String[] {""} ;
      T01AM3_n11102H_obsC = new boolean[] {false} ;
      T01AM3_A396EmprCod = new String[] {""} ;
      T01AM2_A252CliCod = new int[1] ;
      T01AM2_A11071H_Forser = new String[] {""} ;
      T01AM2_A11073H_ForcolNm = new String[] {""} ;
      T01AM2_A11074H_ForcolNn = new int[1] ;
      T01AM2_A11075H_Tipcolco = new byte[1] ;
      T01AM2_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM2_A11078H_LinC = new int[1] ;
      T01AM2_A11079H_PkC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AM2_n11079H_PkC = new boolean[] {false} ;
      T01AM2_A11080H_PmC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AM2_n11080H_PmC = new boolean[] {false} ;
      T01AM2_A11081H_TmC = new String[] {""} ;
      T01AM2_n11081H_TmC = new boolean[] {false} ;
      T01AM2_A11082H_UsC = new String[] {""} ;
      T01AM2_n11082H_UsC = new boolean[] {false} ;
      T01AM2_A11083H_HhC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM2_n11083H_HhC = new boolean[] {false} ;
      T01AM2_A11102H_obsC = new String[] {""} ;
      T01AM2_n11102H_obsC = new boolean[] {false} ;
      T01AM2_A396EmprCod = new String[] {""} ;
      T01AM23_A396EmprCod = new String[] {""} ;
      T01AM23_A252CliCod = new int[1] ;
      T01AM23_A11071H_Forser = new String[] {""} ;
      T01AM23_A11073H_ForcolNm = new String[] {""} ;
      T01AM23_A11074H_ForcolNn = new int[1] ;
      T01AM23_A11075H_Tipcolco = new byte[1] ;
      T01AM23_A11076H_DiaC = new java.util.Date[] {GXutil.nullDate()} ;
      T01AM23_A11078H_LinC = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AM24_A407EmprNom = new String[] {""} ;
      T01AM24_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11071H_Forser = "" ;
      ZZ11073H_ForcolNm = "" ;
      ZZ11076H_DiaC = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ11072H_ForserD = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thprecl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thprecl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thprecl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thprecl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thprecl__default(),
         new Object[] {
             new Object[] {
            T01AM2_A252CliCod, T01AM2_A11071H_Forser, T01AM2_A11073H_ForcolNm, T01AM2_A11074H_ForcolNn, T01AM2_A11075H_Tipcolco, T01AM2_A11076H_DiaC, T01AM2_A11078H_LinC, T01AM2_A11079H_PkC, T01AM2_n11079H_PkC, T01AM2_A11080H_PmC,
            T01AM2_n11080H_PmC, T01AM2_A11081H_TmC, T01AM2_n11081H_TmC, T01AM2_A11082H_UsC, T01AM2_n11082H_UsC, T01AM2_A11083H_HhC, T01AM2_n11083H_HhC, T01AM2_A11102H_obsC, T01AM2_n11102H_obsC, T01AM2_A396EmprCod
            }
            , new Object[] {
            T01AM3_A252CliCod, T01AM3_A11071H_Forser, T01AM3_A11073H_ForcolNm, T01AM3_A11074H_ForcolNn, T01AM3_A11075H_Tipcolco, T01AM3_A11076H_DiaC, T01AM3_A11078H_LinC, T01AM3_A11079H_PkC, T01AM3_n11079H_PkC, T01AM3_A11080H_PmC,
            T01AM3_n11080H_PmC, T01AM3_A11081H_TmC, T01AM3_n11081H_TmC, T01AM3_A11082H_UsC, T01AM3_n11082H_UsC, T01AM3_A11083H_HhC, T01AM3_n11083H_HhC, T01AM3_A11102H_obsC, T01AM3_n11102H_obsC, T01AM3_A396EmprCod
            }
            , new Object[] {
            T01AM4_A11071H_Forser, T01AM4_A11073H_ForcolNm, T01AM4_A11074H_ForcolNn, T01AM4_A11075H_Tipcolco, T01AM4_A11076H_DiaC, T01AM4_A11072H_ForserD, T01AM4_n11072H_ForserD, T01AM4_A11077H_UltDC, T01AM4_n11077H_UltDC, T01AM4_A396EmprCod,
            T01AM4_A252CliCod
            }
            , new Object[] {
            T01AM5_A11071H_Forser, T01AM5_A11073H_ForcolNm, T01AM5_A11074H_ForcolNn, T01AM5_A11075H_Tipcolco, T01AM5_A11076H_DiaC, T01AM5_A11072H_ForserD, T01AM5_n11072H_ForserD, T01AM5_A11077H_UltDC, T01AM5_n11077H_UltDC, T01AM5_A396EmprCod,
            T01AM5_A252CliCod
            }
            , new Object[] {
            T01AM6_A407EmprNom, T01AM6_n407EmprNom
            }
            , new Object[] {
            T01AM7_A279CliNom
            }
            , new Object[] {
            T01AM8_A11071H_Forser, T01AM8_A11073H_ForcolNm, T01AM8_A11074H_ForcolNn, T01AM8_A11075H_Tipcolco, T01AM8_A11076H_DiaC, T01AM8_A407EmprNom, T01AM8_n407EmprNom, T01AM8_A279CliNom, T01AM8_A11072H_ForserD, T01AM8_n11072H_ForserD,
            T01AM8_A11077H_UltDC, T01AM8_n11077H_UltDC, T01AM8_A396EmprCod, T01AM8_A252CliCod
            }
            , new Object[] {
            T01AM9_A279CliNom
            }
            , new Object[] {
            T01AM10_A396EmprCod, T01AM10_A252CliCod, T01AM10_A11071H_Forser, T01AM10_A11073H_ForcolNm, T01AM10_A11074H_ForcolNn, T01AM10_A11075H_Tipcolco, T01AM10_A11076H_DiaC
            }
            , new Object[] {
            T01AM11_A396EmprCod, T01AM11_A252CliCod, T01AM11_A11071H_Forser, T01AM11_A11073H_ForcolNm, T01AM11_A11074H_ForcolNn, T01AM11_A11075H_Tipcolco, T01AM11_A11076H_DiaC
            }
            , new Object[] {
            T01AM12_A396EmprCod, T01AM12_A252CliCod, T01AM12_A11071H_Forser, T01AM12_A11073H_ForcolNm, T01AM12_A11074H_ForcolNn, T01AM12_A11075H_Tipcolco, T01AM12_A11076H_DiaC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AM16_A279CliNom
            }
            , new Object[] {
            T01AM17_A396EmprCod, T01AM17_A252CliCod, T01AM17_A11071H_Forser, T01AM17_A11073H_ForcolNm, T01AM17_A11074H_ForcolNn, T01AM17_A11075H_Tipcolco, T01AM17_A11076H_DiaC
            }
            , new Object[] {
            T01AM18_A252CliCod, T01AM18_A11071H_Forser, T01AM18_A11073H_ForcolNm, T01AM18_A11074H_ForcolNn, T01AM18_A11075H_Tipcolco, T01AM18_A11076H_DiaC, T01AM18_A11078H_LinC, T01AM18_A11079H_PkC, T01AM18_n11079H_PkC, T01AM18_A11080H_PmC,
            T01AM18_n11080H_PmC, T01AM18_A11081H_TmC, T01AM18_n11081H_TmC, T01AM18_A11082H_UsC, T01AM18_n11082H_UsC, T01AM18_A11083H_HhC, T01AM18_n11083H_HhC, T01AM18_A11102H_obsC, T01AM18_n11102H_obsC, T01AM18_A396EmprCod
            }
            , new Object[] {
            T01AM19_A396EmprCod, T01AM19_A252CliCod, T01AM19_A11071H_Forser, T01AM19_A11073H_ForcolNm, T01AM19_A11074H_ForcolNn, T01AM19_A11075H_Tipcolco, T01AM19_A11076H_DiaC, T01AM19_A11078H_LinC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AM23_A396EmprCod, T01AM23_A252CliCod, T01AM23_A11071H_Forser, T01AM23_A11073H_ForcolNm, T01AM23_A11074H_ForcolNn, T01AM23_A11075H_Tipcolco, T01AM23_A11076H_DiaC, T01AM23_A11078H_LinC
            }
            , new Object[] {
            T01AM24_A407EmprNom, T01AM24_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THPRECL" ;
   }

   private byte Z11075H_Tipcolco ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11075H_Tipcolco ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ11075H_Tipcolco ;
   private short nRcdDeleted_1478 ;
   private short nRcdExists_1478 ;
   private short nIsMod_1478 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1478 ;
   private short RcdFound1478 ;
   private short nBlankRcdUsr1478 ;
   private short RcdFound1477 ;
   private short nIsDirty_1477 ;
   private short nIsDirty_1478 ;
   private int Z252CliCod ;
   private int Z11074H_ForcolNn ;
   private int Z11077H_UltDC ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z11078H_LinC ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtH_Forser_Enabled ;
   private int edtH_ForserD_Enabled ;
   private int edtH_ForcolNm_Enabled ;
   private int A11074H_ForcolNn ;
   private int edtH_ForcolNn_Enabled ;
   private int edtH_Tipcolco_Enabled ;
   private int edtH_DiaC_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A11077H_UltDC ;
   private int edtH_UltDC_Enabled ;
   private int edtavnRcdDeleted_1478_Enabled ;
   private int edtH_LinC_Enabled ;
   private int edtH_PkC_Enabled ;
   private int edtH_PmC_Enabled ;
   private int edtH_TmC_Enabled ;
   private int edtH_UsC_Enabled ;
   private int edtH_HhC_Enabled ;
   private int edtH_obsC_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A11078H_LinC ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtH_LinC_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtH_UltDC_Backcolor ;
   private int edtH_DiaC_Backcolor ;
   private int edtH_Tipcolco_Backcolor ;
   private int edtH_ForcolNn_Backcolor ;
   private int edtH_ForcolNm_Backcolor ;
   private int edtH_ForserD_Backcolor ;
   private int edtH_Forser_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ11074H_ForcolNn ;
   private int ZZ11077H_UltDC ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11079H_PkC ;
   private java.math.BigDecimal Z11080H_PmC ;
   private java.math.BigDecimal A11079H_PkC ;
   private java.math.BigDecimal A11080H_PmC ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11071H_Forser ;
   private String Z11073H_ForcolNm ;
   private String Z11072H_ForserD ;
   private String Z11081H_TmC ;
   private String Z11082H_UsC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtH_Forser_Internalname ;
   private String A11071H_Forser ;
   private String edtH_Forser_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtH_ForserD_Internalname ;
   private String A11072H_ForserD ;
   private String edtH_ForserD_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtH_ForcolNm_Internalname ;
   private String A11073H_ForcolNm ;
   private String edtH_ForcolNm_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtH_ForcolNn_Internalname ;
   private String edtH_ForcolNn_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtH_Tipcolco_Internalname ;
   private String edtH_Tipcolco_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtH_DiaC_Internalname ;
   private String edtH_DiaC_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtH_UltDC_Internalname ;
   private String edtH_UltDC_Jsonclick ;
   private String sMode1478 ;
   private String edtavnRcdDeleted_1478_Internalname ;
   private String edtH_LinC_Internalname ;
   private String edtH_PkC_Internalname ;
   private String edtH_PmC_Internalname ;
   private String edtH_TmC_Internalname ;
   private String edtH_UsC_Internalname ;
   private String edtH_HhC_Internalname ;
   private String edtH_obsC_Internalname ;
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
   private String sMode1477 ;
   private String GXCCtl ;
   private String A11081H_TmC ;
   private String A11082H_UsC ;
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
   private String Z279CliNom ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1478_Jsonclick ;
   private String edtH_LinC_Jsonclick ;
   private String edtH_PkC_Jsonclick ;
   private String edtH_PmC_Jsonclick ;
   private String edtH_TmC_Jsonclick ;
   private String edtH_UsC_Jsonclick ;
   private String edtH_HhC_Jsonclick ;
   private String edtH_obsC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ11071H_Forser ;
   private String ZZ11073H_ForcolNm ;
   private String ZZ407EmprNom ;
   private String ZZ11072H_ForserD ;
   private String ZZ279CliNom ;
   private java.util.Date Z11083H_HhC ;
   private java.util.Date A11083H_HhC ;
   private java.util.Date Z11076H_DiaC ;
   private java.util.Date A11076H_DiaC ;
   private java.util.Date ZZ11076H_DiaC ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11072H_ForserD ;
   private boolean n11077H_UltDC ;
   private boolean returnInSub ;
   private boolean n11079H_PkC ;
   private boolean n11080H_PmC ;
   private boolean n11081H_TmC ;
   private boolean n11082H_UsC ;
   private boolean n11083H_HhC ;
   private boolean n11102H_obsC ;
   private boolean Gx_longc ;
   private String Z11102H_obsC ;
   private String A11102H_obsC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01AM6_A407EmprNom ;
   private boolean[] T01AM6_n407EmprNom ;
   private String[] T01AM8_A11071H_Forser ;
   private String[] T01AM8_A11073H_ForcolNm ;
   private int[] T01AM8_A11074H_ForcolNn ;
   private byte[] T01AM8_A11075H_Tipcolco ;
   private java.util.Date[] T01AM8_A11076H_DiaC ;
   private String[] T01AM8_A407EmprNom ;
   private boolean[] T01AM8_n407EmprNom ;
   private String[] T01AM8_A279CliNom ;
   private String[] T01AM8_A11072H_ForserD ;
   private boolean[] T01AM8_n11072H_ForserD ;
   private int[] T01AM8_A11077H_UltDC ;
   private boolean[] T01AM8_n11077H_UltDC ;
   private String[] T01AM8_A396EmprCod ;
   private int[] T01AM8_A252CliCod ;
   private String[] T01AM7_A279CliNom ;
   private String[] T01AM9_A279CliNom ;
   private String[] T01AM10_A396EmprCod ;
   private int[] T01AM10_A252CliCod ;
   private String[] T01AM10_A11071H_Forser ;
   private String[] T01AM10_A11073H_ForcolNm ;
   private int[] T01AM10_A11074H_ForcolNn ;
   private byte[] T01AM10_A11075H_Tipcolco ;
   private java.util.Date[] T01AM10_A11076H_DiaC ;
   private String[] T01AM5_A11071H_Forser ;
   private String[] T01AM5_A11073H_ForcolNm ;
   private int[] T01AM5_A11074H_ForcolNn ;
   private byte[] T01AM5_A11075H_Tipcolco ;
   private java.util.Date[] T01AM5_A11076H_DiaC ;
   private String[] T01AM5_A11072H_ForserD ;
   private boolean[] T01AM5_n11072H_ForserD ;
   private int[] T01AM5_A11077H_UltDC ;
   private boolean[] T01AM5_n11077H_UltDC ;
   private String[] T01AM5_A396EmprCod ;
   private int[] T01AM5_A252CliCod ;
   private String[] T01AM11_A396EmprCod ;
   private int[] T01AM11_A252CliCod ;
   private String[] T01AM11_A11071H_Forser ;
   private String[] T01AM11_A11073H_ForcolNm ;
   private int[] T01AM11_A11074H_ForcolNn ;
   private byte[] T01AM11_A11075H_Tipcolco ;
   private java.util.Date[] T01AM11_A11076H_DiaC ;
   private String[] T01AM12_A396EmprCod ;
   private int[] T01AM12_A252CliCod ;
   private String[] T01AM12_A11071H_Forser ;
   private String[] T01AM12_A11073H_ForcolNm ;
   private int[] T01AM12_A11074H_ForcolNn ;
   private byte[] T01AM12_A11075H_Tipcolco ;
   private java.util.Date[] T01AM12_A11076H_DiaC ;
   private String[] T01AM4_A11071H_Forser ;
   private String[] T01AM4_A11073H_ForcolNm ;
   private int[] T01AM4_A11074H_ForcolNn ;
   private byte[] T01AM4_A11075H_Tipcolco ;
   private java.util.Date[] T01AM4_A11076H_DiaC ;
   private String[] T01AM4_A11072H_ForserD ;
   private boolean[] T01AM4_n11072H_ForserD ;
   private int[] T01AM4_A11077H_UltDC ;
   private boolean[] T01AM4_n11077H_UltDC ;
   private String[] T01AM4_A396EmprCod ;
   private int[] T01AM4_A252CliCod ;
   private String[] T01AM16_A279CliNom ;
   private String[] T01AM17_A396EmprCod ;
   private int[] T01AM17_A252CliCod ;
   private String[] T01AM17_A11071H_Forser ;
   private String[] T01AM17_A11073H_ForcolNm ;
   private int[] T01AM17_A11074H_ForcolNn ;
   private byte[] T01AM17_A11075H_Tipcolco ;
   private java.util.Date[] T01AM17_A11076H_DiaC ;
   private int[] T01AM18_A252CliCod ;
   private String[] T01AM18_A11071H_Forser ;
   private String[] T01AM18_A11073H_ForcolNm ;
   private int[] T01AM18_A11074H_ForcolNn ;
   private byte[] T01AM18_A11075H_Tipcolco ;
   private java.util.Date[] T01AM18_A11076H_DiaC ;
   private int[] T01AM18_A11078H_LinC ;
   private java.math.BigDecimal[] T01AM18_A11079H_PkC ;
   private boolean[] T01AM18_n11079H_PkC ;
   private java.math.BigDecimal[] T01AM18_A11080H_PmC ;
   private boolean[] T01AM18_n11080H_PmC ;
   private String[] T01AM18_A11081H_TmC ;
   private boolean[] T01AM18_n11081H_TmC ;
   private String[] T01AM18_A11082H_UsC ;
   private boolean[] T01AM18_n11082H_UsC ;
   private java.util.Date[] T01AM18_A11083H_HhC ;
   private boolean[] T01AM18_n11083H_HhC ;
   private String[] T01AM18_A11102H_obsC ;
   private boolean[] T01AM18_n11102H_obsC ;
   private String[] T01AM18_A396EmprCod ;
   private String[] T01AM19_A396EmprCod ;
   private int[] T01AM19_A252CliCod ;
   private String[] T01AM19_A11071H_Forser ;
   private String[] T01AM19_A11073H_ForcolNm ;
   private int[] T01AM19_A11074H_ForcolNn ;
   private byte[] T01AM19_A11075H_Tipcolco ;
   private java.util.Date[] T01AM19_A11076H_DiaC ;
   private int[] T01AM19_A11078H_LinC ;
   private int[] T01AM3_A252CliCod ;
   private String[] T01AM3_A11071H_Forser ;
   private String[] T01AM3_A11073H_ForcolNm ;
   private int[] T01AM3_A11074H_ForcolNn ;
   private byte[] T01AM3_A11075H_Tipcolco ;
   private java.util.Date[] T01AM3_A11076H_DiaC ;
   private int[] T01AM3_A11078H_LinC ;
   private java.math.BigDecimal[] T01AM3_A11079H_PkC ;
   private boolean[] T01AM3_n11079H_PkC ;
   private java.math.BigDecimal[] T01AM3_A11080H_PmC ;
   private boolean[] T01AM3_n11080H_PmC ;
   private String[] T01AM3_A11081H_TmC ;
   private boolean[] T01AM3_n11081H_TmC ;
   private String[] T01AM3_A11082H_UsC ;
   private boolean[] T01AM3_n11082H_UsC ;
   private java.util.Date[] T01AM3_A11083H_HhC ;
   private boolean[] T01AM3_n11083H_HhC ;
   private String[] T01AM3_A11102H_obsC ;
   private boolean[] T01AM3_n11102H_obsC ;
   private String[] T01AM3_A396EmprCod ;
   private int[] T01AM2_A252CliCod ;
   private String[] T01AM2_A11071H_Forser ;
   private String[] T01AM2_A11073H_ForcolNm ;
   private int[] T01AM2_A11074H_ForcolNn ;
   private byte[] T01AM2_A11075H_Tipcolco ;
   private java.util.Date[] T01AM2_A11076H_DiaC ;
   private int[] T01AM2_A11078H_LinC ;
   private java.math.BigDecimal[] T01AM2_A11079H_PkC ;
   private boolean[] T01AM2_n11079H_PkC ;
   private java.math.BigDecimal[] T01AM2_A11080H_PmC ;
   private boolean[] T01AM2_n11080H_PmC ;
   private String[] T01AM2_A11081H_TmC ;
   private boolean[] T01AM2_n11081H_TmC ;
   private String[] T01AM2_A11082H_UsC ;
   private boolean[] T01AM2_n11082H_UsC ;
   private java.util.Date[] T01AM2_A11083H_HhC ;
   private boolean[] T01AM2_n11083H_HhC ;
   private String[] T01AM2_A11102H_obsC ;
   private boolean[] T01AM2_n11102H_obsC ;
   private String[] T01AM2_A396EmprCod ;
   private String[] T01AM23_A396EmprCod ;
   private int[] T01AM23_A252CliCod ;
   private String[] T01AM23_A11071H_Forser ;
   private String[] T01AM23_A11073H_ForcolNm ;
   private int[] T01AM23_A11074H_ForcolNn ;
   private byte[] T01AM23_A11075H_Tipcolco ;
   private java.util.Date[] T01AM23_A11076H_DiaC ;
   private int[] T01AM23_A11078H_LinC ;
   private String[] T01AM24_A407EmprNom ;
   private boolean[] T01AM24_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thprecl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thprecl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thprecl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thprecl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thprecl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AM2", "SELECT CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC, H_PkC, H_PmC, H_TmC, H_UsC, H_HhC, H_obsC, EmprCod FROM TXPHPREC1 WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? AND H_LinC = ?  FOR UPDATE OF H_PkC, H_PmC, H_TmC, H_UsC, H_HhC, H_obsC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM3", "SELECT CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC, H_PkC, H_PmC, H_TmC, H_UsC, H_HhC, H_obsC, EmprCod FROM TXPHPREC1 WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? AND H_LinC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM4", "SELECT H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_ForserD, H_UltDC, EmprCod, CliCod FROM TXPHPRECL WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ?  FOR UPDATE OF H_ForserD, H_UltDC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM5", "SELECT H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_ForserD, H_UltDC, EmprCod, CliCod FROM TXPHPRECL WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM8", "SELECT /*+ FIRST_ROWS(100) */ TM1.H_Forser, TM1.H_ForcolNm, TM1.H_ForcolNn, TM1.H_Tipcolco, TM1.H_DiaC, T2.EmprNom, T3.CliNom, TM1.H_ForserD, TM1.H_UltDC, TM1.EmprCod, TM1.CliCod FROM ((TXPHPRECL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.H_Forser = ? and TM1.H_ForcolNm = ? and TM1.H_ForcolNn = ? and TM1.H_Tipcolco = ? and TM1.H_DiaC = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.H_Forser, TM1.H_ForcolNm, TM1.H_ForcolNn, TM1.H_Tipcolco, TM1.H_DiaC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC FROM TXPHPRECL WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC FROM TXPHPRECL WHERE ( CliCod > ? or CliCod = ? and H_Forser > ? or H_Forser = ? and CliCod = ? and H_ForcolNm > ? or H_ForcolNm = ? and H_Forser = ? and CliCod = ? and H_ForcolNn > ? or H_ForcolNn = ? and H_ForcolNm = ? and H_Forser = ? and CliCod = ? and H_Tipcolco > ? or H_Tipcolco = ? and H_ForcolNn = ? and H_ForcolNm = ? and H_Forser = ? and CliCod = ? and H_DiaC > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC FROM TXPHPRECL WHERE ( CliCod < ? or CliCod = ? and H_Forser < ? or H_Forser = ? and CliCod = ? and H_ForcolNm < ? or H_ForcolNm = ? and H_Forser = ? and CliCod = ? and H_ForcolNn < ? or H_ForcolNn = ? and H_ForcolNm = ? and H_Forser = ? and CliCod = ? and H_Tipcolco < ? or H_Tipcolco = ? and H_ForcolNn = ? and H_ForcolNm = ? and H_Forser = ? and CliCod = ? and H_DiaC < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, H_Forser DESC, H_ForcolNm DESC, H_ForcolNn DESC, H_Tipcolco DESC, H_DiaC DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AM13", "INSERT INTO TXPHPRECL(H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_ForserD, H_UltDC, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPRECL")
         ,new UpdateCursor("T01AM14", "UPDATE TXPHPRECL SET H_ForserD=?, H_UltDC=?  WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ?", GX_NOMASK, "TXPHPRECL")
         ,new UpdateCursor("T01AM15", "DELETE FROM TXPHPRECL  WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ?", GX_NOMASK, "TXPHPRECL")
         ,new ForEachCursor("T01AM16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC FROM TXPHPRECL WHERE EmprCod = ? ORDER BY EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM18", "SELECT CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC, H_PkC, H_PmC, H_TmC, H_UsC, H_HhC, H_obsC, EmprCod FROM TXPHPREC1 WHERE EmprCod = ? and CliCod = ? and H_Forser = ? and H_ForcolNm = ? and H_ForcolNn = ? and H_Tipcolco = ? and H_DiaC = ? and H_LinC = ? ORDER BY EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM19", "SELECT EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC FROM TXPHPREC1 WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? AND H_LinC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AM20", "INSERT INTO TXPHPREC1(CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC, H_PkC, H_PmC, H_TmC, H_UsC, H_HhC, H_obsC, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPREC1")
         ,new UpdateCursor("T01AM21", "UPDATE TXPHPREC1 SET H_PkC=?, H_PmC=?, H_TmC=?, H_UsC=?, H_HhC=?, H_obsC=?  WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? AND H_LinC = ?", GX_NOMASK, "TXPHPREC1")
         ,new UpdateCursor("T01AM22", "DELETE FROM TXPHPREC1  WHERE EmprCod = ? AND CliCod = ? AND H_Forser = ? AND H_ForcolNm = ? AND H_ForcolNn = ? AND H_Tipcolco = ? AND H_DiaC = ? AND H_LinC = ?", GX_NOMASK, "TXPHPREC1")
         ,new ForEachCursor("T01AM23", "SELECT EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC FROM TXPHPREC1 WHERE EmprCod = ? and CliCod = ? and H_Forser = ? and H_ForcolNm = ? and H_ForcolNn = ? and H_Tipcolco = ? and H_DiaC = ? ORDER BY EmprCod, CliCod, H_Forser, H_ForcolNm, H_ForcolNn, H_Tipcolco, H_DiaC, H_LinC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AM24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 22 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 13);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 13);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setDate(21, (java.util.Date)parms[20]);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 13);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 13);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setDate(21, (java.util.Date)parms[20]);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 26);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               stmt.setString(8, (String)parms[9], 3);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 13);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setDate(9, (java.util.Date)parms[10]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[18], 200);
               }
               stmt.setString(14, (String)parms[19], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 16);
               stmt.setString(10, (String)parms[15], 13);
               stmt.setInt(11, ((Number) parms[16]).intValue());
               stmt.setByte(12, ((Number) parms[17]).byteValue());
               stmt.setDate(13, (java.util.Date)parms[18]);
               stmt.setInt(14, ((Number) parms[19]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

