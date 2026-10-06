package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thpreit_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A831TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A583IntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, A583IntCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PRECIOS INTENSIDAD", ""), (short)(0)) ;
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
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

   public thpreit_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thpreit_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thpreit_impl.class ));
   }

   public thpreit_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THPREIT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Dia Modificacion", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtH_DiaI_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_DiaI_Internalname, localUtil.format(A11092H_DiaI, "99/99/99"), localUtil.format( A11092H_DiaI, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_DiaI_Jsonclick, 0, "", "", "", "", "", 1, edtH_DiaI_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtH_DiaI_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtH_DiaI_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THPREIT.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultimo movimiento", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_UltLi_Internalname, GXutil.ltrim( localUtil.ntoc( A11093H_UltLi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_UltLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11093H_UltLi), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11093H_UltLi), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_UltLi_Jsonclick, 0, "", "", "", "", "", 1, edtH_UltLi_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1482 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1482 = (short)(1) ;
            scanStart1AO1482( ) ;
            while ( RcdFound1482 != 0 )
            {
               init_level_properties1482( ) ;
               getByPrimaryKey1AO1482( ) ;
               addRow1AO1482( ) ;
               scanNext1AO1482( ) ;
            }
            scanEnd1AO1482( ) ;
            nBlankRcdCount1482 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AO1482( ) ;
         standaloneModal1AO1482( ) ;
         sMode1482 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1AO1482( ) ;
            edtavnRcdDeleted_1482_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1482_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1482_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1482_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_linI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_linI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_Pki_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_Pki_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_Pki_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_Pmi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PMI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_Pmi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_Pmi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_tmI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TMI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_tmI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_tmI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_UsI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_USI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_UsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UsI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_HhI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_HHI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_HhI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_HhI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_obsi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_OBSI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_obsi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_obsi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1482 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AO1482( ) ;
            }
            sendRow1AO1482( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1482 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1482 = (short)(5) ;
         nRcdExists_1482 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AO1482( ) ;
            while ( RcdFound1482 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801482( ) ;
               init_level_properties1482( ) ;
               standaloneNotModal1AO1482( ) ;
               getByPrimaryKey1AO1482( ) ;
               standaloneModal1AO1482( ) ;
               addRow1AO1482( ) ;
               scanNext1AO1482( ) ;
            }
            scanEnd1AO1482( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1482 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801482( ) ;
      initAll1AO1482( ) ;
      init_level_properties1482( ) ;
      nRcdExists_1482 = (short)(0) ;
      nIsMod_1482 = (short)(0) ;
      nRcdDeleted_1482 = (short)(0) ;
      nBlankRcdCount1482 = (short)(nBlankRcdUsr1482+nBlankRcdCount1482) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1482 > 0 )
      {
         standaloneNotModal1AO1482( ) ;
         standaloneModal1AO1482( ) ;
         addRow1AO1482( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtH_linI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1482 = (short)(nBlankRcdCount1482-1) ;
      }
      Gx_mode = sMode1482 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THPREIT.htm");
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
      e111AO2 ();
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
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11092H_DiaI = localUtil.ctod( httpContext.cgiGet( "Z11092H_DiaI"), 0) ;
            Z11093H_UltLi = (int)(localUtil.ctol( httpContext.cgiGet( "Z11093H_UltLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TipColCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            else
            {
               A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A583IntCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            else
            {
               A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtH_DiaI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "H_DIAI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_DiaI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11092H_DiaI = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            }
            else
            {
               A11092H_DiaI = localUtil.ctod( httpContext.cgiGet( edtH_DiaI_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_ULTLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_UltLi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11093H_UltLi = 0 ;
               n11093H_UltLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11093H_UltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11093H_UltLi), 6, 0));
            }
            else
            {
               A11093H_UltLi = (int)(localUtil.ctol( httpContext.cgiGet( edtH_UltLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11093H_UltLi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11093H_UltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11093H_UltLi), 6, 0));
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
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               A11092H_DiaI = localUtil.parseDateParm( httpContext.GetPar( "H_DiaI")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
                        e111AO2 ();
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
            initAll1AO1481( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1482_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1482_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes1AO1481( ) ;
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

   public void confirm_1AO0( )
   {
      beforeValidate1AO1481( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AO1481( ) ;
         }
         else
         {
            checkExtendedTable1AO1481( ) ;
            if ( AnyError == 0 )
            {
               zm1AO1481( 2) ;
               zm1AO1481( 3) ;
               zm1AO1481( 4) ;
               zm1AO1481( 5) ;
               zm1AO1481( 6) ;
               zm1AO1481( 7) ;
            }
            closeExtendedTableCursors1AO1481( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1481 = Gx_mode ;
         confirm_1AO1482( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1481 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1481 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AO0( ) ;
      }
   }

   public void confirm_1AO1482( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1AO1482( ) ;
         if ( ( nRcdExists_1482 != 0 ) || ( nIsMod_1482 != 0 ) )
         {
            getKey1AO1482( ) ;
            if ( ( nRcdExists_1482 == 0 ) && ( nRcdDeleted_1482 == 0 ) )
            {
               if ( RcdFound1482 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AO1482( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AO1482( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1AO1482( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "H_LINI_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtH_linI_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1482 != 0 )
               {
                  if ( nRcdDeleted_1482 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AO1482( ) ;
                     load1AO1482( ) ;
                     beforeValidate1AO1482( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AO1482( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1482 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AO1482( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AO1482( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1AO1482( ) ;
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
                  if ( nRcdDeleted_1482 == 0 )
                  {
                     GXCCtl = "H_LINI_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_linI_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1482_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_linI_Internalname, GXutil.ltrim( localUtil.ntoc( A11094H_linI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_Pki_Internalname, GXutil.ltrim( localUtil.ntoc( A11095H_Pki, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_Pmi_Internalname, GXutil.ltrim( localUtil.ntoc( A11096H_Pmi, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_tmI_Internalname, GXutil.rtrim( A11097H_tmI)) ;
         httpContext.changePostValue( edtH_UsI_Internalname, GXutil.rtrim( A11098H_UsI)) ;
         httpContext.changePostValue( edtH_HhI_Internalname, localUtil.ttoc( A11099H_HhI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtH_obsi_Internalname, A11100H_obsi) ;
         httpContext.changePostValue( "ZT_"+"Z11094H_linI_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11094H_linI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11095H_Pki_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11095H_Pki, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11096H_Pmi_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11096H_Pmi, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11097H_tmI_"+sGXsfl_80_idx, GXutil.rtrim( Z11097H_tmI)) ;
         httpContext.changePostValue( "ZT_"+"Z11098H_UsI_"+sGXsfl_80_idx, GXutil.rtrim( Z11098H_UsI)) ;
         httpContext.changePostValue( "ZT_"+"Z11099H_HhI_"+sGXsfl_80_idx, localUtil.ttoc( Z11099H_HhI, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11100H_obsi_"+sGXsfl_80_idx, Z11100H_obsi) ;
         httpContext.changePostValue( "nRcdDeleted_1482_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1482_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1482_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1482 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1482_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1482_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pki_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pmi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tmI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_USI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_HHI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_OBSI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AO0( )
   {
   }

   public void e111AO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thpreit_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thpreit_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thpreit_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thpreit_impl.this.A396EmprCod = GXv_char2[0] ;
      thpreit_impl.this.AV11EmprNom = GXv_char3[0] ;
      thpreit_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1AO1481( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11093H_UltLi = T01AO5_A11093H_UltLi[0] ;
         }
         else
         {
            Z11093H_UltLi = A11093H_UltLi ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11092H_DiaI = A11092H_DiaI ;
         Z11093H_UltLi = A11093H_UltLi ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z583IntCod = A583IntCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z832TipColDsc = A832TipColDsc ;
         Z584IntDsc = A584IntDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THPREIT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01AO6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AO6_A407EmprNom[0] ;
      n407EmprNom = T01AO6_n407EmprNom[0] ;
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

   public void load1AO1481( )
   {
      /* Using cursor T01AO12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1481 = (short)(1) ;
         A407EmprNom = T01AO12_A407EmprNom[0] ;
         n407EmprNom = T01AO12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AO12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01AO12_A69ArtDsc[0] ;
         n69ArtDsc = T01AO12_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A832TipColDsc = T01AO12_A832TipColDsc[0] ;
         n832TipColDsc = T01AO12_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A584IntDsc = T01AO12_A584IntDsc[0] ;
         n584IntDsc = T01AO12_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A11093H_UltLi = T01AO12_A11093H_UltLi[0] ;
         n11093H_UltLi = T01AO12_n11093H_UltLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11093H_UltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11093H_UltLi), 6, 0));
         zm1AO1481( -1) ;
      }
      pr_default.close(10);
      onLoadActions1AO1481( ) ;
   }

   public void onLoadActions1AO1481( )
   {
   }

   public void checkExtendedTable1AO1481( )
   {
      nIsDirty_1481 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01AO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AO7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01AO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AO8_A69ArtDsc[0] ;
      n69ArtDsc = T01AO8_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
      /* Using cursor T01AO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T01AO10_A832TipColDsc[0] ;
      n832TipColDsc = T01AO10_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(8);
      /* Using cursor T01AO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01AO9_A584IntDsc[0] ;
      n584IntDsc = T01AO9_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(7);
      /* Using cursor T01AO11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1AO1481( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01AO13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AO13_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01AO14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AO14_A69ArtDsc[0] ;
      n69ArtDsc = T01AO14_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_6( String A396EmprCod ,
                         byte A831TipColCod )
   {
      /* Using cursor T01AO15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T01AO15_A832TipColDsc[0] ;
      n832TipColDsc = T01AO15_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A832TipColDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_5( String A396EmprCod ,
                         byte A583IntCod )
   {
      /* Using cursor T01AO16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01AO16_A584IntDsc[0] ;
      n584IntDsc = T01AO16_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_7( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod ,
                         byte A831TipColCod ,
                         byte A583IntCod )
   {
      /* Using cursor T01AO17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1AO1481( )
   {
      /* Using cursor T01AO18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1481 = (short)(1) ;
      }
      else
      {
         RcdFound1481 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01AO5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AO1481( 1) ;
         RcdFound1481 = (short)(1) ;
         A11092H_DiaI = T01AO5_A11092H_DiaI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
         A11093H_UltLi = T01AO5_A11093H_UltLi[0] ;
         n11093H_UltLi = T01AO5_n11093H_UltLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11093H_UltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11093H_UltLi), 6, 0));
         A252CliCod = T01AO5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AO5_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A583IntCod = T01AO5_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A831TipColCod = T01AO5_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z583IntCod = A583IntCod ;
         Z11092H_DiaI = A11092H_DiaI ;
         sMode1481 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AO1481( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1481 = (short)(0) ;
            initializeNonKey1AO1481( ) ;
         }
         Gx_mode = sMode1481 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1481 = (short)(0) ;
         initializeNonKey1AO1481( ) ;
         sMode1481 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1481 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1AO1481( ) ;
      if ( RcdFound1481 == 0 )
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
      RcdFound1481 = (short)(0) ;
      /* Using cursor T01AO19 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A583IntCod), Byte.valueOf(A583IntCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), A11092H_DiaI, A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T01AO19_A252CliCod[0] < A252CliCod ) || ( T01AO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO19_A252CliCod[0] == A252CliCod ) && ( T01AO19_A831TipColCod[0] < A831TipColCod ) || ( T01AO19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO19_A252CliCod[0] == A252CliCod ) && ( T01AO19_A583IntCod[0] < A583IntCod ) || ( T01AO19_A583IntCod[0] == A583IntCod ) && ( T01AO19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO19_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AO19_A11092H_DiaI[0]).before( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AO19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T01AO19_A252CliCod[0] > A252CliCod ) || ( T01AO19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO19_A252CliCod[0] == A252CliCod ) && ( T01AO19_A831TipColCod[0] > A831TipColCod ) || ( T01AO19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO19_A252CliCod[0] == A252CliCod ) && ( T01AO19_A583IntCod[0] > A583IntCod ) || ( T01AO19_A583IntCod[0] == A583IntCod ) && ( T01AO19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO19_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AO19_A11092H_DiaI[0]).after( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AO19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AO19_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01AO19_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A831TipColCod = T01AO19_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A583IntCod = T01AO19_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A11092H_DiaI = T01AO19_A11092H_DiaI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            RcdFound1481 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound1481 = (short)(0) ;
      /* Using cursor T01AO20 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A583IntCod), Byte.valueOf(A583IntCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), A11092H_DiaI, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01AO20_A252CliCod[0] > A252CliCod ) || ( T01AO20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO20_A252CliCod[0] == A252CliCod ) && ( T01AO20_A831TipColCod[0] > A831TipColCod ) || ( T01AO20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO20_A252CliCod[0] == A252CliCod ) && ( T01AO20_A583IntCod[0] > A583IntCod ) || ( T01AO20_A583IntCod[0] == A583IntCod ) && ( T01AO20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO20_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AO20_A11092H_DiaI[0]).after( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AO20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01AO20_A252CliCod[0] < A252CliCod ) || ( T01AO20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO20_A252CliCod[0] == A252CliCod ) && ( T01AO20_A831TipColCod[0] < A831TipColCod ) || ( T01AO20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO20_A252CliCod[0] == A252CliCod ) && ( T01AO20_A583IntCod[0] < A583IntCod ) || ( T01AO20_A583IntCod[0] == A583IntCod ) && ( T01AO20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AO20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AO20_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AO20_A11092H_DiaI[0]).before( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AO20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AO20_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01AO20_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A831TipColCod = T01AO20_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A583IntCod = T01AO20_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A11092H_DiaI = T01AO20_A11092H_DiaI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            RcdFound1481 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AO1481( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AO1481( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1481 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A831TipColCod = Z831TipColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A583IntCod = Z583IntCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               A11092H_DiaI = Z11092H_DiaI ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
               update1AO1481( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AO1481( ) ;
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
                  insert1AO1481( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = Z831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = Z583IntCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A11092H_DiaI = Z11092H_DiaI ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
      getKey1AO1481( ) ;
      if ( RcdFound1481 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A831TipColCod = Z831TipColCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A583IntCod = Z583IntCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A11092H_DiaI = Z11092H_DiaI ;
            httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thpreit");
      GX_FocusControl = edtH_UltLi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AO0( ) ;
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
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtH_UltLi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AO1481( ) ;
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AO1481( ) ;
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
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLi_Internalname ;
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
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLi_Internalname ;
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
      scanStart1AO1481( ) ;
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1481 != 0 )
         {
            scanNext1AO1481( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AO1481( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AO1481( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREIT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11093H_UltLi != T01AO4_A11093H_UltLi[0] ) )
         {
            if ( Z11093H_UltLi != T01AO4_A11093H_UltLi[0] )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_UltLi");
               GXutil.writeLogRaw("Old: ",Z11093H_UltLi);
               GXutil.writeLogRaw("Current: ",T01AO4_A11093H_UltLi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREIT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AO1481( )
   {
      beforeValidate1AO1481( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AO1481( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AO1481( 0) ;
         checkOptimisticConcurrency1AO1481( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AO1481( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AO1481( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AO21 */
                  pr_default.execute(19, new Object[] {A11092H_DiaI, Boolean.valueOf(n11093H_UltLi), Integer.valueOf(A11093H_UltLi), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
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
                        processLevel1AO1481( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AO0( ) ;
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
            load1AO1481( ) ;
         }
         endLevel1AO1481( ) ;
      }
      closeExtendedTableCursors1AO1481( ) ;
   }

   public void update1AO1481( )
   {
      beforeValidate1AO1481( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AO1481( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AO1481( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AO1481( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AO1481( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AO22 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n11093H_UltLi), Integer.valueOf(A11093H_UltLi), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREIT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AO1481( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AO1481( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AO0( ) ;
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
         endLevel1AO1481( ) ;
      }
      closeExtendedTableCursors1AO1481( ) ;
   }

   public void deferredUpdate1AO1481( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AO1481( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AO1481( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AO1481( ) ;
         afterConfirm1AO1481( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AO1481( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AO1482( ) ;
               while ( RcdFound1482 != 0 )
               {
                  getByPrimaryKey1AO1482( ) ;
                  delete1AO1482( ) ;
                  scanNext1AO1482( ) ;
               }
               scanEnd1AO1482( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AO23 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1481 == 0 )
                        {
                           initAll1AO1481( ) ;
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
                        resetCaption1AO0( ) ;
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
      sMode1481 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AO1481( ) ;
      Gx_mode = sMode1481 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AO1481( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AO24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01AO24_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(22);
         /* Using cursor T01AO25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01AO25_A69ArtDsc[0] ;
         n69ArtDsc = T01AO25_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(23);
         /* Using cursor T01AO26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
         A832TipColDsc = T01AO26_A832TipColDsc[0] ;
         n832TipColDsc = T01AO26_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         pr_default.close(24);
         /* Using cursor T01AO27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
         A584IntDsc = T01AO27_A584IntDsc[0] ;
         n584IntDsc = T01AO27_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         pr_default.close(25);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01AO28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel1AO1482( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1AO1482( ) ;
         if ( ( nRcdExists_1482 != 0 ) || ( nIsMod_1482 != 0 ) )
         {
            standaloneNotModal1AO1482( ) ;
            getKey1AO1482( ) ;
            if ( ( nRcdExists_1482 == 0 ) && ( nRcdDeleted_1482 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AO1482( ) ;
            }
            else
            {
               if ( RcdFound1482 != 0 )
               {
                  if ( ( nRcdDeleted_1482 != 0 ) && ( nRcdExists_1482 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AO1482( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1482 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AO1482( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1482 == 0 )
                  {
                     GXCCtl = "H_LINI_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_linI_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1482_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_linI_Internalname, GXutil.ltrim( localUtil.ntoc( A11094H_linI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_Pki_Internalname, GXutil.ltrim( localUtil.ntoc( A11095H_Pki, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_Pmi_Internalname, GXutil.ltrim( localUtil.ntoc( A11096H_Pmi, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_tmI_Internalname, GXutil.rtrim( A11097H_tmI)) ;
         httpContext.changePostValue( edtH_UsI_Internalname, GXutil.rtrim( A11098H_UsI)) ;
         httpContext.changePostValue( edtH_HhI_Internalname, localUtil.ttoc( A11099H_HhI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtH_obsi_Internalname, A11100H_obsi) ;
         httpContext.changePostValue( "ZT_"+"Z11094H_linI_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11094H_linI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11095H_Pki_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11095H_Pki, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11096H_Pmi_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11096H_Pmi, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11097H_tmI_"+sGXsfl_80_idx, GXutil.rtrim( Z11097H_tmI)) ;
         httpContext.changePostValue( "ZT_"+"Z11098H_UsI_"+sGXsfl_80_idx, GXutil.rtrim( Z11098H_UsI)) ;
         httpContext.changePostValue( "ZT_"+"Z11099H_HhI_"+sGXsfl_80_idx, localUtil.ttoc( Z11099H_HhI, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11100H_obsi_"+sGXsfl_80_idx, Z11100H_obsi) ;
         httpContext.changePostValue( "nRcdDeleted_1482_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1482_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1482_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1482 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1482_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1482_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pki_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pmi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tmI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_USI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_HHI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_OBSI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AO1482( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1482 = (short)(0) ;
      nIsMod_1482 = (short)(0) ;
      nRcdDeleted_1482 = (short)(0) ;
   }

   public void processLevel1AO1481( )
   {
      /* Save parent mode. */
      sMode1481 = Gx_mode ;
      processNestedLevel1AO1482( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1481 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AO1481( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AO1481( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thpreit");
         if ( AnyError == 0 )
         {
            confirmValues1AO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thpreit");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AO1481( )
   {
      /* Scan By routine */
      /* Using cursor T01AO29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      RcdFound1481 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1481 = (short)(1) ;
         A252CliCod = T01AO29_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AO29_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = T01AO29_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = T01AO29_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A11092H_DiaI = T01AO29_A11092H_DiaI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AO1481( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1481 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1481 = (short)(1) ;
         A252CliCod = T01AO29_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AO29_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = T01AO29_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = T01AO29_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A11092H_DiaI = T01AO29_A11092H_DiaI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
      }
   }

   public void scanEnd1AO1481( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1AO1481( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AO1481( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AO1481( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AO1481( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AO1481( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AO1481( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AO1481( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
      edtH_DiaI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_DiaI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_DiaI_Enabled), 5, 0), true);
      edtH_UltLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UltLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UltLi_Enabled), 5, 0), true);
   }

   public void zm1AO1482( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11095H_Pki = T01AO3_A11095H_Pki[0] ;
            Z11096H_Pmi = T01AO3_A11096H_Pmi[0] ;
            Z11097H_tmI = T01AO3_A11097H_tmI[0] ;
            Z11098H_UsI = T01AO3_A11098H_UsI[0] ;
            Z11099H_HhI = T01AO3_A11099H_HhI[0] ;
            Z11100H_obsi = T01AO3_A11100H_obsi[0] ;
         }
         else
         {
            Z11095H_Pki = A11095H_Pki ;
            Z11096H_Pmi = A11096H_Pmi ;
            Z11097H_tmI = A11097H_tmI ;
            Z11098H_UsI = A11098H_UsI ;
            Z11099H_HhI = A11099H_HhI ;
            Z11100H_obsi = A11100H_obsi ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z11092H_DiaI = A11092H_DiaI ;
         Z11094H_linI = A11094H_linI ;
         Z11095H_Pki = A11095H_Pki ;
         Z11096H_Pmi = A11096H_Pmi ;
         Z11097H_tmI = A11097H_tmI ;
         Z11098H_UsI = A11098H_UsI ;
         Z11099H_HhI = A11099H_HhI ;
         Z11100H_obsi = A11100H_obsi ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
      }
   }

   public void standaloneNotModal1AO1482( )
   {
   }

   public void standaloneModal1AO1482( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_linI_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_linI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtH_linI_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_linI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1AO1482( )
   {
      /* Using cursor T01AO30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11094H_linI)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1482 = (short)(1) ;
         A11095H_Pki = T01AO30_A11095H_Pki[0] ;
         n11095H_Pki = T01AO30_n11095H_Pki[0] ;
         A11096H_Pmi = T01AO30_A11096H_Pmi[0] ;
         n11096H_Pmi = T01AO30_n11096H_Pmi[0] ;
         A11097H_tmI = T01AO30_A11097H_tmI[0] ;
         n11097H_tmI = T01AO30_n11097H_tmI[0] ;
         A11098H_UsI = T01AO30_A11098H_UsI[0] ;
         n11098H_UsI = T01AO30_n11098H_UsI[0] ;
         A11099H_HhI = T01AO30_A11099H_HhI[0] ;
         n11099H_HhI = T01AO30_n11099H_HhI[0] ;
         A11100H_obsi = T01AO30_A11100H_obsi[0] ;
         n11100H_obsi = T01AO30_n11100H_obsi[0] ;
         zm1AO1482( -8) ;
      }
      pr_default.close(28);
      onLoadActions1AO1482( ) ;
   }

   public void onLoadActions1AO1482( )
   {
   }

   public void checkExtendedTable1AO1482( )
   {
      nIsDirty_1482 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AO1482( ) ;
   }

   public void closeExtendedTableCursors1AO1482( )
   {
   }

   public void enableDisable1AO1482( )
   {
   }

   public void getKey1AO1482( )
   {
      /* Using cursor T01AO31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11094H_linI)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1482 = (short)(1) ;
      }
      else
      {
         RcdFound1482 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1AO1482( )
   {
      /* Using cursor T01AO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11094H_linI)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AO1482( 8) ;
         RcdFound1482 = (short)(1) ;
         initializeNonKey1AO1482( ) ;
         A11094H_linI = T01AO3_A11094H_linI[0] ;
         A11095H_Pki = T01AO3_A11095H_Pki[0] ;
         n11095H_Pki = T01AO3_n11095H_Pki[0] ;
         A11096H_Pmi = T01AO3_A11096H_Pmi[0] ;
         n11096H_Pmi = T01AO3_n11096H_Pmi[0] ;
         A11097H_tmI = T01AO3_A11097H_tmI[0] ;
         n11097H_tmI = T01AO3_n11097H_tmI[0] ;
         A11098H_UsI = T01AO3_A11098H_UsI[0] ;
         n11098H_UsI = T01AO3_n11098H_UsI[0] ;
         A11099H_HhI = T01AO3_A11099H_HhI[0] ;
         n11099H_HhI = T01AO3_n11099H_HhI[0] ;
         A11100H_obsi = T01AO3_A11100H_obsi[0] ;
         n11100H_obsi = T01AO3_n11100H_obsi[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z583IntCod = A583IntCod ;
         Z11092H_DiaI = A11092H_DiaI ;
         Z11094H_linI = A11094H_linI ;
         sMode1482 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AO1482( ) ;
         load1AO1482( ) ;
         Gx_mode = sMode1482 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1482 = (short)(0) ;
         initializeNonKey1AO1482( ) ;
         sMode1482 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AO1482( ) ;
         Gx_mode = sMode1482 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AO1482( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AO1482( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11094H_linI)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREI1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11095H_Pki, T01AO2_A11095H_Pki[0]) != 0 ) || ( DecimalUtil.compareTo(Z11096H_Pmi, T01AO2_A11096H_Pmi[0]) != 0 ) || ( GXutil.strcmp(Z11097H_tmI, T01AO2_A11097H_tmI[0]) != 0 ) || ( GXutil.strcmp(Z11098H_UsI, T01AO2_A11098H_UsI[0]) != 0 ) || !( GXutil.dateCompare(Z11099H_HhI, T01AO2_A11099H_HhI[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11100H_obsi, T01AO2_A11100H_obsi[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11095H_Pki, T01AO2_A11095H_Pki[0]) != 0 )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_Pki");
               GXutil.writeLogRaw("Old: ",Z11095H_Pki);
               GXutil.writeLogRaw("Current: ",T01AO2_A11095H_Pki[0]);
            }
            if ( DecimalUtil.compareTo(Z11096H_Pmi, T01AO2_A11096H_Pmi[0]) != 0 )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_Pmi");
               GXutil.writeLogRaw("Old: ",Z11096H_Pmi);
               GXutil.writeLogRaw("Current: ",T01AO2_A11096H_Pmi[0]);
            }
            if ( GXutil.strcmp(Z11097H_tmI, T01AO2_A11097H_tmI[0]) != 0 )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_tmI");
               GXutil.writeLogRaw("Old: ",Z11097H_tmI);
               GXutil.writeLogRaw("Current: ",T01AO2_A11097H_tmI[0]);
            }
            if ( GXutil.strcmp(Z11098H_UsI, T01AO2_A11098H_UsI[0]) != 0 )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_UsI");
               GXutil.writeLogRaw("Old: ",Z11098H_UsI);
               GXutil.writeLogRaw("Current: ",T01AO2_A11098H_UsI[0]);
            }
            if ( !( GXutil.dateCompare(Z11099H_HhI, T01AO2_A11099H_HhI[0]) ) )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_HhI");
               GXutil.writeLogRaw("Old: ",Z11099H_HhI);
               GXutil.writeLogRaw("Current: ",T01AO2_A11099H_HhI[0]);
            }
            if ( GXutil.strcmp(Z11100H_obsi, T01AO2_A11100H_obsi[0]) != 0 )
            {
               GXutil.writeLogln("thpreit:[seudo value changed for attri]"+"H_obsi");
               GXutil.writeLogRaw("Old: ",Z11100H_obsi);
               GXutil.writeLogRaw("Current: ",T01AO2_A11100H_obsi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREI1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AO1482( )
   {
      beforeValidate1AO1482( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AO1482( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AO1482( 0) ;
         checkOptimisticConcurrency1AO1482( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AO1482( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AO1482( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AO32 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), A11092H_DiaI, Integer.valueOf(A11094H_linI), Boolean.valueOf(n11095H_Pki), A11095H_Pki, Boolean.valueOf(n11096H_Pmi), A11096H_Pmi, Boolean.valueOf(n11097H_tmI), A11097H_tmI, Boolean.valueOf(n11098H_UsI), A11098H_UsI, Boolean.valueOf(n11099H_HhI), A11099H_HhI, Boolean.valueOf(n11100H_obsi), A11100H_obsi, A396EmprCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREI1");
                  if ( (pr_default.getStatus(30) == 1) )
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
            load1AO1482( ) ;
         }
         endLevel1AO1482( ) ;
      }
      closeExtendedTableCursors1AO1482( ) ;
   }

   public void update1AO1482( )
   {
      beforeValidate1AO1482( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AO1482( ) ;
      }
      if ( ( nIsMod_1482 != 0 ) || ( nIsDirty_1482 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AO1482( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AO1482( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AO1482( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AO33 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n11095H_Pki), A11095H_Pki, Boolean.valueOf(n11096H_Pmi), A11096H_Pmi, Boolean.valueOf(n11097H_tmI), A11097H_tmI, Boolean.valueOf(n11098H_UsI), A11098H_UsI, Boolean.valueOf(n11099H_HhI), A11099H_HhI, Boolean.valueOf(n11100H_obsi), A11100H_obsi, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11094H_linI)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREI1");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREI1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AO1482( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AO1482( ) ;
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
            endLevel1AO1482( ) ;
         }
      }
      closeExtendedTableCursors1AO1482( ) ;
   }

   public void deferredUpdate1AO1482( )
   {
   }

   public void delete1AO1482( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AO1482( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AO1482( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AO1482( ) ;
         afterConfirm1AO1482( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AO1482( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AO34 */
               pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11094H_linI)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREI1");
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
      sMode1482 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AO1482( ) ;
      Gx_mode = sMode1482 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AO1482( )
   {
      standaloneModal1AO1482( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1AO1482( )
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

   public void scanStart1AO1482( )
   {
      /* Scan By routine */
      /* Using cursor T01AO35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      RcdFound1482 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1482 = (short)(1) ;
         A11094H_linI = T01AO35_A11094H_linI[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AO1482( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1482 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1482 = (short)(1) ;
         A11094H_linI = T01AO35_A11094H_linI[0] ;
      }
   }

   public void scanEnd1AO1482( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1AO1482( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AO1482( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AO1482( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AO1482( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AO1482( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AO1482( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AO1482( )
   {
      edtH_linI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_linI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_Pki_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_Pki_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_Pki_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_Pmi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_Pmi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_Pmi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_tmI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_tmI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_tmI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_UsI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UsI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_HhI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_HhI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_HhI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_obsi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_obsi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_obsi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1AO1482( )
   {
   }

   public void send_integrity_lvl_hashes1AO1481( )
   {
   }

   public void subsflControlProps_801482( )
   {
      edtavnRcdDeleted_1482_Internalname = "vNRCDDELETED_1482_"+sGXsfl_80_idx ;
      edtH_linI_Internalname = "H_LINI_"+sGXsfl_80_idx ;
      edtH_Pki_Internalname = "H_PKI_"+sGXsfl_80_idx ;
      edtH_Pmi_Internalname = "H_PMI_"+sGXsfl_80_idx ;
      edtH_tmI_Internalname = "H_TMI_"+sGXsfl_80_idx ;
      edtH_UsI_Internalname = "H_USI_"+sGXsfl_80_idx ;
      edtH_HhI_Internalname = "H_HHI_"+sGXsfl_80_idx ;
      edtH_obsi_Internalname = "H_OBSI_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801482( )
   {
      edtavnRcdDeleted_1482_Internalname = "vNRCDDELETED_1482_"+sGXsfl_80_fel_idx ;
      edtH_linI_Internalname = "H_LINI_"+sGXsfl_80_fel_idx ;
      edtH_Pki_Internalname = "H_PKI_"+sGXsfl_80_fel_idx ;
      edtH_Pmi_Internalname = "H_PMI_"+sGXsfl_80_fel_idx ;
      edtH_tmI_Internalname = "H_TMI_"+sGXsfl_80_fel_idx ;
      edtH_UsI_Internalname = "H_USI_"+sGXsfl_80_fel_idx ;
      edtH_HhI_Internalname = "H_HHI_"+sGXsfl_80_fel_idx ;
      edtH_obsi_Internalname = "H_OBSI_"+sGXsfl_80_fel_idx ;
   }

   public void addRow1AO1482( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801482( ) ;
      sendRow1AO1482( ) ;
   }

   public void sendRow1AO1482( )
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
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1482_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1482_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1482), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1482), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1482_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1482_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_linI_Internalname,GXutil.ltrim( localUtil.ntoc( A11094H_linI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11094H_linI), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_linI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_linI_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_Pki_Internalname,GXutil.ltrim( localUtil.ntoc( A11095H_Pki, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_Pki_Enabled!=0) ? localUtil.format( A11095H_Pki, "ZZZZZ9.99999") : localUtil.format( A11095H_Pki, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_Pki_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_Pki_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_Pmi_Internalname,GXutil.ltrim( localUtil.ntoc( A11096H_Pmi, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_Pmi_Enabled!=0) ? localUtil.format( A11096H_Pmi, "ZZZZZ9.99999") : localUtil.format( A11096H_Pmi, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_Pmi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_Pmi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_tmI_Internalname,GXutil.rtrim( A11097H_tmI),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_tmI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_tmI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_UsI_Internalname,GXutil.rtrim( A11098H_UsI),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_UsI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_UsI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_HhI_Internalname,localUtil.ttoc( A11099H_HhI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11099H_HhI, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_HhI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_HhI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1482_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_obsi_Internalname,A11100H_obsi,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_obsi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_obsi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AO1482( ) ;
      GXCCtl = "Z11094H_linI_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11094H_linI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11095H_Pki_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11095H_Pki, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11096H_Pmi_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11096H_Pmi, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11097H_tmI_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11097H_tmI));
      GXCCtl = "Z11098H_UsI_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11098H_UsI));
      GXCCtl = "Z11099H_HhI_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z11099H_HhI, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z11100H_obsi_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11100H_obsi);
      GXCCtl = "nRcdDeleted_1482_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1482_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1482_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1482, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1482_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1482_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_LINI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PKI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pki_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pmi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_TMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tmI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_USI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_HHI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_OBSI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsi_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AO1482( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801482( ) ;
      edtavnRcdDeleted_1482_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1482_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_linI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_Pki_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_Pmi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PMI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_tmI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TMI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_UsI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_USI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_HhI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_HHI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_obsi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_OBSI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1482_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1482_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1482");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1482_Internalname ;
         wbErr = true ;
         nRcdDeleted_1482 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1482 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1482_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_linI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_linI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "H_LINI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_linI_Internalname ;
         wbErr = true ;
         A11094H_linI = 0 ;
      }
      else
      {
         A11094H_linI = (int)(localUtil.ctol( httpContext.cgiGet( edtH_linI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_Pki_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_Pki_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PKI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_Pki_Internalname ;
         wbErr = true ;
         A11095H_Pki = DecimalUtil.ZERO ;
         n11095H_Pki = false ;
      }
      else
      {
         A11095H_Pki = localUtil.ctond( httpContext.cgiGet( edtH_Pki_Internalname)) ;
         n11095H_Pki = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_Pmi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_Pmi_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PMI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_Pmi_Internalname ;
         wbErr = true ;
         A11096H_Pmi = DecimalUtil.ZERO ;
         n11096H_Pmi = false ;
      }
      else
      {
         A11096H_Pmi = localUtil.ctond( httpContext.cgiGet( edtH_Pmi_Internalname)) ;
         n11096H_Pmi = false ;
      }
      A11097H_tmI = httpContext.cgiGet( edtH_tmI_Internalname) ;
      n11097H_tmI = false ;
      A11098H_UsI = httpContext.cgiGet( edtH_UsI_Internalname) ;
      n11098H_UsI = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtH_HhI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "H_HHI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_HhI_Internalname ;
         wbErr = true ;
         A11099H_HhI = GXutil.resetTime( GXutil.nullDate() );
         n11099H_HhI = false ;
      }
      else
      {
         A11099H_HhI = localUtil.ctot( httpContext.cgiGet( edtH_HhI_Internalname)) ;
         n11099H_HhI = false ;
      }
      A11100H_obsi = httpContext.cgiGet( edtH_obsi_Internalname) ;
      n11100H_obsi = false ;
      GXCCtl = "Z11094H_linI_" + sGXsfl_80_idx ;
      Z11094H_linI = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11095H_Pki_" + sGXsfl_80_idx ;
      Z11095H_Pki = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11096H_Pmi_" + sGXsfl_80_idx ;
      Z11096H_Pmi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11097H_tmI_" + sGXsfl_80_idx ;
      Z11097H_tmI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11098H_UsI_" + sGXsfl_80_idx ;
      Z11098H_UsI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11099H_HhI_" + sGXsfl_80_idx ;
      Z11099H_HhI = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11100H_obsi_" + sGXsfl_80_idx ;
      Z11100H_obsi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1482_" + sGXsfl_80_idx ;
      nRcdDeleted_1482 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1482_" + sGXsfl_80_idx ;
      nRcdExists_1482 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1482_" + sGXsfl_80_idx ;
      nIsMod_1482 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtH_linI_Enabled = edtH_linI_Enabled ;
   }

   public void confirmValues1AO0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801482( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801482( ) ;
         httpContext.changePostValue( "Z11094H_linI_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11094H_linI_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11094H_linI_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11095H_Pki_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11095H_Pki_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11095H_Pki_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11096H_Pmi_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11096H_Pmi_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11096H_Pmi_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11097H_tmI_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11097H_tmI_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11097H_tmI_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11098H_UsI_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11098H_UsI_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11098H_UsI_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11099H_HhI_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11099H_HhI_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11099H_HhI_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11100H_obsi_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11100H_obsi_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11100H_obsi_"+sGXsfl_80_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thpreit", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11092H_DiaI", localUtil.dtoc( Z11092H_DiaI, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11093H_UltLi", GXutil.ltrim( localUtil.ntoc( Z11093H_UltLi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thpreit", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THPREIT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PRECIOS INTENSIDAD", "") ;
   }

   public void initializeNonKey1AO1481( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A832TipColDsc = "" ;
      n832TipColDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      A584IntDsc = "" ;
      n584IntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      A11093H_UltLi = 0 ;
      n11093H_UltLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11093H_UltLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11093H_UltLi), 6, 0));
      Z11093H_UltLi = 0 ;
   }

   public void initAll1AO1481( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A831TipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      A583IntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      A11092H_DiaI = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
      initializeNonKey1AO1481( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AO1482( )
   {
      A11095H_Pki = DecimalUtil.ZERO ;
      n11095H_Pki = false ;
      A11096H_Pmi = DecimalUtil.ZERO ;
      n11096H_Pmi = false ;
      A11097H_tmI = "" ;
      n11097H_tmI = false ;
      A11098H_UsI = "" ;
      n11098H_UsI = false ;
      A11099H_HhI = GXutil.resetTime( GXutil.nullDate() );
      n11099H_HhI = false ;
      A11100H_obsi = "" ;
      n11100H_obsi = false ;
      Z11095H_Pki = DecimalUtil.ZERO ;
      Z11096H_Pmi = DecimalUtil.ZERO ;
      Z11097H_tmI = "" ;
      Z11098H_UsI = "" ;
      Z11099H_HhI = GXutil.resetTime( GXutil.nullDate() );
      Z11100H_obsi = "" ;
   }

   public void initAll1AO1482( )
   {
      A11094H_linI = 0 ;
      initializeNonKey1AO1482( ) ;
   }

   public void standaloneModalInsert1AO1482( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563226", true, true);
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
      httpContext.AddJavascriptSource("thpreit.js", "?20268241563226", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1482( )
   {
      edtH_linI_Enabled = defedtH_linI_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_linI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linI_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1482, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1482_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11094H_linI, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11095H_Pki, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pki_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11096H_Pmi, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_Pmi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11097H_tmI));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tmI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11098H_UsI));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_UsI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A11099H_HhI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_HhI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11100H_obsi);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_obsi_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtIntCod_Internalname = "INTCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtIntDsc_Internalname = "INTDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtH_DiaI_Internalname = "H_DIAI" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtH_UltLi_Internalname = "H_ULTLI" ;
      edtavnRcdDeleted_1482_Internalname = "vNRCDDELETED_1482" ;
      edtH_linI_Internalname = "H_LINI" ;
      edtH_Pki_Internalname = "H_PKI" ;
      edtH_Pmi_Internalname = "H_PMI" ;
      edtH_tmI_Internalname = "H_TMI" ;
      edtH_UsI_Internalname = "H_USI" ;
      edtH_HhI_Internalname = "H_HHI" ;
      edtH_obsi_Internalname = "H_OBSI" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PRECIOS INTENSIDAD", "") );
      edtH_obsi_Jsonclick = "" ;
      edtH_HhI_Jsonclick = "" ;
      edtH_UsI_Jsonclick = "" ;
      edtH_tmI_Jsonclick = "" ;
      edtH_Pmi_Jsonclick = "" ;
      edtH_Pki_Jsonclick = "" ;
      edtH_linI_Jsonclick = "" ;
      edtavnRcdDeleted_1482_Jsonclick = "" ;
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
      edtH_obsi_Enabled = 1 ;
      edtH_HhI_Enabled = 1 ;
      edtH_UsI_Enabled = 1 ;
      edtH_tmI_Enabled = 1 ;
      edtH_Pmi_Enabled = 1 ;
      edtH_Pki_Enabled = 1 ;
      edtH_linI_Enabled = 1 ;
      edtavnRcdDeleted_1482_Enabled = 1 ;
      edtH_UltLi_Jsonclick = "" ;
      edtH_UltLi_Backcolor = (int)(0xFFFFFF) ;
      edtH_UltLi_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtH_DiaI_Jsonclick = "" ;
      edtH_DiaI_Backcolor = (int)(0xFFFFFF) ;
      edtH_DiaI_Enabled = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIntDsc_Enabled = 0 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtIntCod_Enabled = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
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
      subsflControlProps_801482( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AO1482( ) ;
         standaloneModal1AO1482( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AO1482( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801482( ) ;
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
      /* Using cursor T01AO36 */
      pr_default.execute(34, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AO36_A407EmprNom[0] ;
      n407EmprNom = T01AO36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(34);
      /* Using cursor T01AO24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AO24_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(22);
      /* Using cursor T01AO25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AO25_A69ArtDsc[0] ;
      n69ArtDsc = T01AO25_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(23);
      /* Using cursor T01AO26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T01AO26_A832TipColDsc[0] ;
      n832TipColDsc = T01AO26_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(24);
      /* Using cursor T01AO27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01AO27_A584IntDsc[0] ;
      n584IntDsc = T01AO27_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(25);
      /* Using cursor T01AO37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(35);
      GX_FocusControl = edtH_UltLi_Internalname ;
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
      /* Using cursor T01AO24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01AO24_A279CliNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01AO25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01AO25_A69ArtDsc[0] ;
      n69ArtDsc = T01AO25_n69ArtDsc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Tipcolcod( )
   {
      n832TipColDsc = false ;
      /* Using cursor T01AO26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
      }
      A832TipColDsc = T01AO26_A832TipColDsc[0] ;
      n832TipColDsc = T01AO26_n832TipColDsc[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
   }

   public void valid_Intcod( )
   {
      n584IntDsc = false ;
      /* Using cursor T01AO27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
      }
      A584IntDsc = T01AO27_A584IntDsc[0] ;
      n584IntDsc = T01AO27_n584IntDsc[0] ;
      pr_default.close(25);
      /* Using cursor T01AO37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(35);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
   }

   public void valid_H_diai( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11093H_UltLi", GXutil.ltrim( localUtil.ntoc( A11093H_UltLi, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11092H_DiaI", localUtil.format(Z11092H_DiaI, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11093H_UltLi", GXutil.ltrim( localUtil.ntoc( Z11093H_UltLi, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
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
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''}]}");
      setEventMetadata("VALID_H_DIAI","{handler:'valid_H_diai',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A11092H_DiaI',fld:'H_DIAI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_H_DIAI",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11093H_UltLi',fld:'H_ULTLI',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z831TipColCod'},{av:'Z583IntCod'},{av:'Z11092H_DiaI'},{av:'Z407EmprNom'},{av:'Z11093H_UltLi'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z832TipColDsc'},{av:'Z584IntDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_H_LINI","{handler:'valid_H_lini',iparms:[]");
      setEventMetadata("VALID_H_LINI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_H_obsi',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(22);
      pr_default.close(34);
      pr_default.close(25);
      pr_default.close(35);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z11092H_DiaI = GXutil.nullDate() ;
      Z11095H_Pki = DecimalUtil.ZERO ;
      Z11096H_Pmi = DecimalUtil.ZERO ;
      Z11097H_tmI = "" ;
      Z11098H_UsI = "" ;
      Z11099H_HhI = GXutil.resetTime( GXutil.nullDate() );
      Z11100H_obsi = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A584IntDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11092H_DiaI = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1482 = "" ;
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
      sMode1481 = "" ;
      GXCCtl = "" ;
      A11095H_Pki = DecimalUtil.ZERO ;
      A11096H_Pmi = DecimalUtil.ZERO ;
      A11097H_tmI = "" ;
      A11098H_UsI = "" ;
      A11099H_HhI = GXutil.resetTime( GXutil.nullDate() );
      A11100H_obsi = "" ;
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
      Z69ArtDsc = "" ;
      Z832TipColDsc = "" ;
      Z584IntDsc = "" ;
      T01AO6_A407EmprNom = new String[] {""} ;
      T01AO6_n407EmprNom = new boolean[] {false} ;
      T01AO12_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO12_A407EmprNom = new String[] {""} ;
      T01AO12_n407EmprNom = new boolean[] {false} ;
      T01AO12_A279CliNom = new String[] {""} ;
      T01AO12_A69ArtDsc = new String[] {""} ;
      T01AO12_n69ArtDsc = new boolean[] {false} ;
      T01AO12_A832TipColDsc = new String[] {""} ;
      T01AO12_n832TipColDsc = new boolean[] {false} ;
      T01AO12_A584IntDsc = new String[] {""} ;
      T01AO12_n584IntDsc = new boolean[] {false} ;
      T01AO12_A11093H_UltLi = new int[1] ;
      T01AO12_n11093H_UltLi = new boolean[] {false} ;
      T01AO12_A396EmprCod = new String[] {""} ;
      T01AO12_A252CliCod = new int[1] ;
      T01AO12_A65ArtCod = new String[] {""} ;
      T01AO12_A583IntCod = new byte[1] ;
      T01AO12_A831TipColCod = new byte[1] ;
      T01AO7_A279CliNom = new String[] {""} ;
      T01AO8_A69ArtDsc = new String[] {""} ;
      T01AO8_n69ArtDsc = new boolean[] {false} ;
      T01AO10_A832TipColDsc = new String[] {""} ;
      T01AO10_n832TipColDsc = new boolean[] {false} ;
      T01AO9_A584IntDsc = new String[] {""} ;
      T01AO9_n584IntDsc = new boolean[] {false} ;
      T01AO11_A396EmprCod = new String[] {""} ;
      T01AO13_A279CliNom = new String[] {""} ;
      T01AO14_A69ArtDsc = new String[] {""} ;
      T01AO14_n69ArtDsc = new boolean[] {false} ;
      T01AO15_A832TipColDsc = new String[] {""} ;
      T01AO15_n832TipColDsc = new boolean[] {false} ;
      T01AO16_A584IntDsc = new String[] {""} ;
      T01AO16_n584IntDsc = new boolean[] {false} ;
      T01AO17_A396EmprCod = new String[] {""} ;
      T01AO18_A396EmprCod = new String[] {""} ;
      T01AO18_A252CliCod = new int[1] ;
      T01AO18_A65ArtCod = new String[] {""} ;
      T01AO18_A831TipColCod = new byte[1] ;
      T01AO18_A583IntCod = new byte[1] ;
      T01AO18_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO5_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO5_A11093H_UltLi = new int[1] ;
      T01AO5_n11093H_UltLi = new boolean[] {false} ;
      T01AO5_A396EmprCod = new String[] {""} ;
      T01AO5_A252CliCod = new int[1] ;
      T01AO5_A65ArtCod = new String[] {""} ;
      T01AO5_A583IntCod = new byte[1] ;
      T01AO5_A831TipColCod = new byte[1] ;
      T01AO19_A396EmprCod = new String[] {""} ;
      T01AO19_A252CliCod = new int[1] ;
      T01AO19_A65ArtCod = new String[] {""} ;
      T01AO19_A831TipColCod = new byte[1] ;
      T01AO19_A583IntCod = new byte[1] ;
      T01AO19_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO20_A396EmprCod = new String[] {""} ;
      T01AO20_A252CliCod = new int[1] ;
      T01AO20_A65ArtCod = new String[] {""} ;
      T01AO20_A831TipColCod = new byte[1] ;
      T01AO20_A583IntCod = new byte[1] ;
      T01AO20_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO4_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO4_A11093H_UltLi = new int[1] ;
      T01AO4_n11093H_UltLi = new boolean[] {false} ;
      T01AO4_A396EmprCod = new String[] {""} ;
      T01AO4_A252CliCod = new int[1] ;
      T01AO4_A65ArtCod = new String[] {""} ;
      T01AO4_A583IntCod = new byte[1] ;
      T01AO4_A831TipColCod = new byte[1] ;
      T01AO24_A279CliNom = new String[] {""} ;
      T01AO25_A69ArtDsc = new String[] {""} ;
      T01AO25_n69ArtDsc = new boolean[] {false} ;
      T01AO26_A832TipColDsc = new String[] {""} ;
      T01AO26_n832TipColDsc = new boolean[] {false} ;
      T01AO27_A584IntDsc = new String[] {""} ;
      T01AO27_n584IntDsc = new boolean[] {false} ;
      T01AO28_A396EmprCod = new String[] {""} ;
      T01AO28_A252CliCod = new int[1] ;
      T01AO28_A65ArtCod = new String[] {""} ;
      T01AO28_A831TipColCod = new byte[1] ;
      T01AO28_A583IntCod = new byte[1] ;
      T01AO28_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO28_A11187H_linIe = new int[1] ;
      T01AO28_A11188H_unde = new String[] {""} ;
      T01AO28_A11189H_line = new short[1] ;
      T01AO29_A396EmprCod = new String[] {""} ;
      T01AO29_A252CliCod = new int[1] ;
      T01AO29_A65ArtCod = new String[] {""} ;
      T01AO29_A831TipColCod = new byte[1] ;
      T01AO29_A583IntCod = new byte[1] ;
      T01AO29_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO30_A252CliCod = new int[1] ;
      T01AO30_A65ArtCod = new String[] {""} ;
      T01AO30_A831TipColCod = new byte[1] ;
      T01AO30_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO30_A11094H_linI = new int[1] ;
      T01AO30_A11095H_Pki = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AO30_n11095H_Pki = new boolean[] {false} ;
      T01AO30_A11096H_Pmi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AO30_n11096H_Pmi = new boolean[] {false} ;
      T01AO30_A11097H_tmI = new String[] {""} ;
      T01AO30_n11097H_tmI = new boolean[] {false} ;
      T01AO30_A11098H_UsI = new String[] {""} ;
      T01AO30_n11098H_UsI = new boolean[] {false} ;
      T01AO30_A11099H_HhI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO30_n11099H_HhI = new boolean[] {false} ;
      T01AO30_A11100H_obsi = new String[] {""} ;
      T01AO30_n11100H_obsi = new boolean[] {false} ;
      T01AO30_A396EmprCod = new String[] {""} ;
      T01AO30_A583IntCod = new byte[1] ;
      T01AO31_A396EmprCod = new String[] {""} ;
      T01AO31_A252CliCod = new int[1] ;
      T01AO31_A65ArtCod = new String[] {""} ;
      T01AO31_A831TipColCod = new byte[1] ;
      T01AO31_A583IntCod = new byte[1] ;
      T01AO31_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO31_A11094H_linI = new int[1] ;
      T01AO3_A252CliCod = new int[1] ;
      T01AO3_A65ArtCod = new String[] {""} ;
      T01AO3_A831TipColCod = new byte[1] ;
      T01AO3_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO3_A11094H_linI = new int[1] ;
      T01AO3_A11095H_Pki = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AO3_n11095H_Pki = new boolean[] {false} ;
      T01AO3_A11096H_Pmi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AO3_n11096H_Pmi = new boolean[] {false} ;
      T01AO3_A11097H_tmI = new String[] {""} ;
      T01AO3_n11097H_tmI = new boolean[] {false} ;
      T01AO3_A11098H_UsI = new String[] {""} ;
      T01AO3_n11098H_UsI = new boolean[] {false} ;
      T01AO3_A11099H_HhI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO3_n11099H_HhI = new boolean[] {false} ;
      T01AO3_A11100H_obsi = new String[] {""} ;
      T01AO3_n11100H_obsi = new boolean[] {false} ;
      T01AO3_A396EmprCod = new String[] {""} ;
      T01AO3_A583IntCod = new byte[1] ;
      T01AO2_A252CliCod = new int[1] ;
      T01AO2_A65ArtCod = new String[] {""} ;
      T01AO2_A831TipColCod = new byte[1] ;
      T01AO2_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO2_A11094H_linI = new int[1] ;
      T01AO2_A11095H_Pki = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AO2_n11095H_Pki = new boolean[] {false} ;
      T01AO2_A11096H_Pmi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AO2_n11096H_Pmi = new boolean[] {false} ;
      T01AO2_A11097H_tmI = new String[] {""} ;
      T01AO2_n11097H_tmI = new boolean[] {false} ;
      T01AO2_A11098H_UsI = new String[] {""} ;
      T01AO2_n11098H_UsI = new boolean[] {false} ;
      T01AO2_A11099H_HhI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO2_n11099H_HhI = new boolean[] {false} ;
      T01AO2_A11100H_obsi = new String[] {""} ;
      T01AO2_n11100H_obsi = new boolean[] {false} ;
      T01AO2_A396EmprCod = new String[] {""} ;
      T01AO2_A583IntCod = new byte[1] ;
      T01AO35_A396EmprCod = new String[] {""} ;
      T01AO35_A252CliCod = new int[1] ;
      T01AO35_A65ArtCod = new String[] {""} ;
      T01AO35_A831TipColCod = new byte[1] ;
      T01AO35_A583IntCod = new byte[1] ;
      T01AO35_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AO35_A11094H_linI = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AO36_A407EmprNom = new String[] {""} ;
      T01AO36_n407EmprNom = new boolean[] {false} ;
      T01AO37_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ11092H_DiaI = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ832TipColDsc = "" ;
      ZZ584IntDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thpreit__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thpreit__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thpreit__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thpreit__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thpreit__default(),
         new Object[] {
             new Object[] {
            T01AO2_A252CliCod, T01AO2_A65ArtCod, T01AO2_A831TipColCod, T01AO2_A11092H_DiaI, T01AO2_A11094H_linI, T01AO2_A11095H_Pki, T01AO2_n11095H_Pki, T01AO2_A11096H_Pmi, T01AO2_n11096H_Pmi, T01AO2_A11097H_tmI,
            T01AO2_n11097H_tmI, T01AO2_A11098H_UsI, T01AO2_n11098H_UsI, T01AO2_A11099H_HhI, T01AO2_n11099H_HhI, T01AO2_A11100H_obsi, T01AO2_n11100H_obsi, T01AO2_A396EmprCod, T01AO2_A583IntCod
            }
            , new Object[] {
            T01AO3_A252CliCod, T01AO3_A65ArtCod, T01AO3_A831TipColCod, T01AO3_A11092H_DiaI, T01AO3_A11094H_linI, T01AO3_A11095H_Pki, T01AO3_n11095H_Pki, T01AO3_A11096H_Pmi, T01AO3_n11096H_Pmi, T01AO3_A11097H_tmI,
            T01AO3_n11097H_tmI, T01AO3_A11098H_UsI, T01AO3_n11098H_UsI, T01AO3_A11099H_HhI, T01AO3_n11099H_HhI, T01AO3_A11100H_obsi, T01AO3_n11100H_obsi, T01AO3_A396EmprCod, T01AO3_A583IntCod
            }
            , new Object[] {
            T01AO4_A11092H_DiaI, T01AO4_A11093H_UltLi, T01AO4_n11093H_UltLi, T01AO4_A396EmprCod, T01AO4_A252CliCod, T01AO4_A65ArtCod, T01AO4_A583IntCod, T01AO4_A831TipColCod
            }
            , new Object[] {
            T01AO5_A11092H_DiaI, T01AO5_A11093H_UltLi, T01AO5_n11093H_UltLi, T01AO5_A396EmprCod, T01AO5_A252CliCod, T01AO5_A65ArtCod, T01AO5_A583IntCod, T01AO5_A831TipColCod
            }
            , new Object[] {
            T01AO6_A407EmprNom, T01AO6_n407EmprNom
            }
            , new Object[] {
            T01AO7_A279CliNom
            }
            , new Object[] {
            T01AO8_A69ArtDsc, T01AO8_n69ArtDsc
            }
            , new Object[] {
            T01AO9_A584IntDsc, T01AO9_n584IntDsc
            }
            , new Object[] {
            T01AO10_A832TipColDsc, T01AO10_n832TipColDsc
            }
            , new Object[] {
            T01AO11_A396EmprCod
            }
            , new Object[] {
            T01AO12_A11092H_DiaI, T01AO12_A407EmprNom, T01AO12_n407EmprNom, T01AO12_A279CliNom, T01AO12_A69ArtDsc, T01AO12_n69ArtDsc, T01AO12_A832TipColDsc, T01AO12_n832TipColDsc, T01AO12_A584IntDsc, T01AO12_n584IntDsc,
            T01AO12_A11093H_UltLi, T01AO12_n11093H_UltLi, T01AO12_A396EmprCod, T01AO12_A252CliCod, T01AO12_A65ArtCod, T01AO12_A583IntCod, T01AO12_A831TipColCod
            }
            , new Object[] {
            T01AO13_A279CliNom
            }
            , new Object[] {
            T01AO14_A69ArtDsc, T01AO14_n69ArtDsc
            }
            , new Object[] {
            T01AO15_A832TipColDsc, T01AO15_n832TipColDsc
            }
            , new Object[] {
            T01AO16_A584IntDsc, T01AO16_n584IntDsc
            }
            , new Object[] {
            T01AO17_A396EmprCod
            }
            , new Object[] {
            T01AO18_A396EmprCod, T01AO18_A252CliCod, T01AO18_A65ArtCod, T01AO18_A831TipColCod, T01AO18_A583IntCod, T01AO18_A11092H_DiaI
            }
            , new Object[] {
            T01AO19_A396EmprCod, T01AO19_A252CliCod, T01AO19_A65ArtCod, T01AO19_A831TipColCod, T01AO19_A583IntCod, T01AO19_A11092H_DiaI
            }
            , new Object[] {
            T01AO20_A396EmprCod, T01AO20_A252CliCod, T01AO20_A65ArtCod, T01AO20_A831TipColCod, T01AO20_A583IntCod, T01AO20_A11092H_DiaI
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AO24_A279CliNom
            }
            , new Object[] {
            T01AO25_A69ArtDsc, T01AO25_n69ArtDsc
            }
            , new Object[] {
            T01AO26_A832TipColDsc, T01AO26_n832TipColDsc
            }
            , new Object[] {
            T01AO27_A584IntDsc, T01AO27_n584IntDsc
            }
            , new Object[] {
            T01AO28_A396EmprCod, T01AO28_A252CliCod, T01AO28_A65ArtCod, T01AO28_A831TipColCod, T01AO28_A583IntCod, T01AO28_A11092H_DiaI, T01AO28_A11187H_linIe, T01AO28_A11188H_unde, T01AO28_A11189H_line
            }
            , new Object[] {
            T01AO29_A396EmprCod, T01AO29_A252CliCod, T01AO29_A65ArtCod, T01AO29_A831TipColCod, T01AO29_A583IntCod, T01AO29_A11092H_DiaI
            }
            , new Object[] {
            T01AO30_A252CliCod, T01AO30_A65ArtCod, T01AO30_A831TipColCod, T01AO30_A11092H_DiaI, T01AO30_A11094H_linI, T01AO30_A11095H_Pki, T01AO30_n11095H_Pki, T01AO30_A11096H_Pmi, T01AO30_n11096H_Pmi, T01AO30_A11097H_tmI,
            T01AO30_n11097H_tmI, T01AO30_A11098H_UsI, T01AO30_n11098H_UsI, T01AO30_A11099H_HhI, T01AO30_n11099H_HhI, T01AO30_A11100H_obsi, T01AO30_n11100H_obsi, T01AO30_A396EmprCod, T01AO30_A583IntCod
            }
            , new Object[] {
            T01AO31_A396EmprCod, T01AO31_A252CliCod, T01AO31_A65ArtCod, T01AO31_A831TipColCod, T01AO31_A583IntCod, T01AO31_A11092H_DiaI, T01AO31_A11094H_linI
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AO35_A396EmprCod, T01AO35_A252CliCod, T01AO35_A65ArtCod, T01AO35_A831TipColCod, T01AO35_A583IntCod, T01AO35_A11092H_DiaI, T01AO35_A11094H_linI
            }
            , new Object[] {
            T01AO36_A407EmprNom, T01AO36_n407EmprNom
            }
            , new Object[] {
            T01AO37_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THPREIT" ;
   }

   private byte Z831TipColCod ;
   private byte Z583IntCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private byte ZZ583IntCod ;
   private short nRcdDeleted_1482 ;
   private short nRcdExists_1482 ;
   private short nIsMod_1482 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1482 ;
   private short RcdFound1482 ;
   private short nBlankRcdUsr1482 ;
   private short RcdFound1481 ;
   private short nIsDirty_1481 ;
   private short nIsDirty_1482 ;
   private int Z252CliCod ;
   private int Z11093H_UltLi ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z11094H_linI ;
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
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtH_DiaI_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A11093H_UltLi ;
   private int edtH_UltLi_Enabled ;
   private int edtavnRcdDeleted_1482_Enabled ;
   private int edtH_linI_Enabled ;
   private int edtH_Pki_Enabled ;
   private int edtH_Pmi_Enabled ;
   private int edtH_tmI_Enabled ;
   private int edtH_UsI_Enabled ;
   private int edtH_HhI_Enabled ;
   private int edtH_obsi_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A11094H_linI ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtH_linI_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtH_UltLi_Backcolor ;
   private int edtH_DiaI_Backcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ11093H_UltLi ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11095H_Pki ;
   private java.math.BigDecimal Z11096H_Pmi ;
   private java.math.BigDecimal A11095H_Pki ;
   private java.math.BigDecimal A11096H_Pmi ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z11097H_tmI ;
   private String Z11098H_UsI ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtH_DiaI_Internalname ;
   private String edtH_DiaI_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtH_UltLi_Internalname ;
   private String edtH_UltLi_Jsonclick ;
   private String sMode1482 ;
   private String edtavnRcdDeleted_1482_Internalname ;
   private String edtH_linI_Internalname ;
   private String edtH_Pki_Internalname ;
   private String edtH_Pmi_Internalname ;
   private String edtH_tmI_Internalname ;
   private String edtH_UsI_Internalname ;
   private String edtH_HhI_Internalname ;
   private String edtH_obsi_Internalname ;
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
   private String sMode1481 ;
   private String GXCCtl ;
   private String A11097H_tmI ;
   private String A11098H_UsI ;
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
   private String Z69ArtDsc ;
   private String Z832TipColDsc ;
   private String Z584IntDsc ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1482_Jsonclick ;
   private String edtH_linI_Jsonclick ;
   private String edtH_Pki_Jsonclick ;
   private String edtH_Pmi_Jsonclick ;
   private String edtH_tmI_Jsonclick ;
   private String edtH_UsI_Jsonclick ;
   private String edtH_HhI_Jsonclick ;
   private String edtH_obsi_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ832TipColDsc ;
   private String ZZ584IntDsc ;
   private java.util.Date Z11099H_HhI ;
   private java.util.Date A11099H_HhI ;
   private java.util.Date Z11092H_DiaI ;
   private java.util.Date A11092H_DiaI ;
   private java.util.Date ZZ11092H_DiaI ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n11093H_UltLi ;
   private boolean returnInSub ;
   private boolean n11095H_Pki ;
   private boolean n11096H_Pmi ;
   private boolean n11097H_tmI ;
   private boolean n11098H_UsI ;
   private boolean n11099H_HhI ;
   private boolean n11100H_obsi ;
   private boolean Gx_longc ;
   private String Z11100H_obsi ;
   private String A11100H_obsi ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01AO6_A407EmprNom ;
   private boolean[] T01AO6_n407EmprNom ;
   private java.util.Date[] T01AO12_A11092H_DiaI ;
   private String[] T01AO12_A407EmprNom ;
   private boolean[] T01AO12_n407EmprNom ;
   private String[] T01AO12_A279CliNom ;
   private String[] T01AO12_A69ArtDsc ;
   private boolean[] T01AO12_n69ArtDsc ;
   private String[] T01AO12_A832TipColDsc ;
   private boolean[] T01AO12_n832TipColDsc ;
   private String[] T01AO12_A584IntDsc ;
   private boolean[] T01AO12_n584IntDsc ;
   private int[] T01AO12_A11093H_UltLi ;
   private boolean[] T01AO12_n11093H_UltLi ;
   private String[] T01AO12_A396EmprCod ;
   private int[] T01AO12_A252CliCod ;
   private String[] T01AO12_A65ArtCod ;
   private byte[] T01AO12_A583IntCod ;
   private byte[] T01AO12_A831TipColCod ;
   private String[] T01AO7_A279CliNom ;
   private String[] T01AO8_A69ArtDsc ;
   private boolean[] T01AO8_n69ArtDsc ;
   private String[] T01AO10_A832TipColDsc ;
   private boolean[] T01AO10_n832TipColDsc ;
   private String[] T01AO9_A584IntDsc ;
   private boolean[] T01AO9_n584IntDsc ;
   private String[] T01AO11_A396EmprCod ;
   private String[] T01AO13_A279CliNom ;
   private String[] T01AO14_A69ArtDsc ;
   private boolean[] T01AO14_n69ArtDsc ;
   private String[] T01AO15_A832TipColDsc ;
   private boolean[] T01AO15_n832TipColDsc ;
   private String[] T01AO16_A584IntDsc ;
   private boolean[] T01AO16_n584IntDsc ;
   private String[] T01AO17_A396EmprCod ;
   private String[] T01AO18_A396EmprCod ;
   private int[] T01AO18_A252CliCod ;
   private String[] T01AO18_A65ArtCod ;
   private byte[] T01AO18_A831TipColCod ;
   private byte[] T01AO18_A583IntCod ;
   private java.util.Date[] T01AO18_A11092H_DiaI ;
   private java.util.Date[] T01AO5_A11092H_DiaI ;
   private int[] T01AO5_A11093H_UltLi ;
   private boolean[] T01AO5_n11093H_UltLi ;
   private String[] T01AO5_A396EmprCod ;
   private int[] T01AO5_A252CliCod ;
   private String[] T01AO5_A65ArtCod ;
   private byte[] T01AO5_A583IntCod ;
   private byte[] T01AO5_A831TipColCod ;
   private String[] T01AO19_A396EmprCod ;
   private int[] T01AO19_A252CliCod ;
   private String[] T01AO19_A65ArtCod ;
   private byte[] T01AO19_A831TipColCod ;
   private byte[] T01AO19_A583IntCod ;
   private java.util.Date[] T01AO19_A11092H_DiaI ;
   private String[] T01AO20_A396EmprCod ;
   private int[] T01AO20_A252CliCod ;
   private String[] T01AO20_A65ArtCod ;
   private byte[] T01AO20_A831TipColCod ;
   private byte[] T01AO20_A583IntCod ;
   private java.util.Date[] T01AO20_A11092H_DiaI ;
   private java.util.Date[] T01AO4_A11092H_DiaI ;
   private int[] T01AO4_A11093H_UltLi ;
   private boolean[] T01AO4_n11093H_UltLi ;
   private String[] T01AO4_A396EmprCod ;
   private int[] T01AO4_A252CliCod ;
   private String[] T01AO4_A65ArtCod ;
   private byte[] T01AO4_A583IntCod ;
   private byte[] T01AO4_A831TipColCod ;
   private String[] T01AO24_A279CliNom ;
   private String[] T01AO25_A69ArtDsc ;
   private boolean[] T01AO25_n69ArtDsc ;
   private String[] T01AO26_A832TipColDsc ;
   private boolean[] T01AO26_n832TipColDsc ;
   private String[] T01AO27_A584IntDsc ;
   private boolean[] T01AO27_n584IntDsc ;
   private String[] T01AO28_A396EmprCod ;
   private int[] T01AO28_A252CliCod ;
   private String[] T01AO28_A65ArtCod ;
   private byte[] T01AO28_A831TipColCod ;
   private byte[] T01AO28_A583IntCod ;
   private java.util.Date[] T01AO28_A11092H_DiaI ;
   private int[] T01AO28_A11187H_linIe ;
   private String[] T01AO28_A11188H_unde ;
   private short[] T01AO28_A11189H_line ;
   private String[] T01AO29_A396EmprCod ;
   private int[] T01AO29_A252CliCod ;
   private String[] T01AO29_A65ArtCod ;
   private byte[] T01AO29_A831TipColCod ;
   private byte[] T01AO29_A583IntCod ;
   private java.util.Date[] T01AO29_A11092H_DiaI ;
   private int[] T01AO30_A252CliCod ;
   private String[] T01AO30_A65ArtCod ;
   private byte[] T01AO30_A831TipColCod ;
   private java.util.Date[] T01AO30_A11092H_DiaI ;
   private int[] T01AO30_A11094H_linI ;
   private java.math.BigDecimal[] T01AO30_A11095H_Pki ;
   private boolean[] T01AO30_n11095H_Pki ;
   private java.math.BigDecimal[] T01AO30_A11096H_Pmi ;
   private boolean[] T01AO30_n11096H_Pmi ;
   private String[] T01AO30_A11097H_tmI ;
   private boolean[] T01AO30_n11097H_tmI ;
   private String[] T01AO30_A11098H_UsI ;
   private boolean[] T01AO30_n11098H_UsI ;
   private java.util.Date[] T01AO30_A11099H_HhI ;
   private boolean[] T01AO30_n11099H_HhI ;
   private String[] T01AO30_A11100H_obsi ;
   private boolean[] T01AO30_n11100H_obsi ;
   private String[] T01AO30_A396EmprCod ;
   private byte[] T01AO30_A583IntCod ;
   private String[] T01AO31_A396EmprCod ;
   private int[] T01AO31_A252CliCod ;
   private String[] T01AO31_A65ArtCod ;
   private byte[] T01AO31_A831TipColCod ;
   private byte[] T01AO31_A583IntCod ;
   private java.util.Date[] T01AO31_A11092H_DiaI ;
   private int[] T01AO31_A11094H_linI ;
   private int[] T01AO3_A252CliCod ;
   private String[] T01AO3_A65ArtCod ;
   private byte[] T01AO3_A831TipColCod ;
   private java.util.Date[] T01AO3_A11092H_DiaI ;
   private int[] T01AO3_A11094H_linI ;
   private java.math.BigDecimal[] T01AO3_A11095H_Pki ;
   private boolean[] T01AO3_n11095H_Pki ;
   private java.math.BigDecimal[] T01AO3_A11096H_Pmi ;
   private boolean[] T01AO3_n11096H_Pmi ;
   private String[] T01AO3_A11097H_tmI ;
   private boolean[] T01AO3_n11097H_tmI ;
   private String[] T01AO3_A11098H_UsI ;
   private boolean[] T01AO3_n11098H_UsI ;
   private java.util.Date[] T01AO3_A11099H_HhI ;
   private boolean[] T01AO3_n11099H_HhI ;
   private String[] T01AO3_A11100H_obsi ;
   private boolean[] T01AO3_n11100H_obsi ;
   private String[] T01AO3_A396EmprCod ;
   private byte[] T01AO3_A583IntCod ;
   private int[] T01AO2_A252CliCod ;
   private String[] T01AO2_A65ArtCod ;
   private byte[] T01AO2_A831TipColCod ;
   private java.util.Date[] T01AO2_A11092H_DiaI ;
   private int[] T01AO2_A11094H_linI ;
   private java.math.BigDecimal[] T01AO2_A11095H_Pki ;
   private boolean[] T01AO2_n11095H_Pki ;
   private java.math.BigDecimal[] T01AO2_A11096H_Pmi ;
   private boolean[] T01AO2_n11096H_Pmi ;
   private String[] T01AO2_A11097H_tmI ;
   private boolean[] T01AO2_n11097H_tmI ;
   private String[] T01AO2_A11098H_UsI ;
   private boolean[] T01AO2_n11098H_UsI ;
   private java.util.Date[] T01AO2_A11099H_HhI ;
   private boolean[] T01AO2_n11099H_HhI ;
   private String[] T01AO2_A11100H_obsi ;
   private boolean[] T01AO2_n11100H_obsi ;
   private String[] T01AO2_A396EmprCod ;
   private byte[] T01AO2_A583IntCod ;
   private String[] T01AO35_A396EmprCod ;
   private int[] T01AO35_A252CliCod ;
   private String[] T01AO35_A65ArtCod ;
   private byte[] T01AO35_A831TipColCod ;
   private byte[] T01AO35_A583IntCod ;
   private java.util.Date[] T01AO35_A11092H_DiaI ;
   private int[] T01AO35_A11094H_linI ;
   private String[] T01AO36_A407EmprNom ;
   private boolean[] T01AO36_n407EmprNom ;
   private String[] T01AO37_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thpreit__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreit__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreit__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreit__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AO2", "SELECT CliCod, ArtCod, TipColCod, H_DiaI, H_linI, H_Pki, H_Pmi, H_tmI, H_UsI, H_HhI, H_obsi, EmprCod, IntCod FROM TXPHPREI1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linI = ?  FOR UPDATE OF H_Pki, H_Pmi, H_tmI, H_UsI, H_HhI, H_obsi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO3", "SELECT CliCod, ArtCod, TipColCod, H_DiaI, H_linI, H_Pki, H_Pmi, H_tmI, H_UsI, H_HhI, H_obsi, EmprCod, IntCod FROM TXPHPREI1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO4", "SELECT H_DiaI, H_UltLi, EmprCod, CliCod, ArtCod, IntCod, TipColCod FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?  FOR UPDATE OF H_UltLi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO5", "SELECT H_DiaI, H_UltLi, EmprCod, CliCod, ArtCod, IntCod, TipColCod FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO8", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO9", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO10", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO11", "SELECT EmprCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO12", "SELECT /*+ FIRST_ROWS(100) */ TM1.H_DiaI, T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.TipColDsc, T6.IntDsc, TM1.H_UltLi, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.IntCod, TM1.TipColCod FROM (((((TXPHPREIT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipColCod = TM1.TipColCod) INNER JOIN TXPINTENS T6 ON T6.EmprCod = TM1.EmprCod AND T6.IntCod = TM1.IntCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.TipColCod = ? and TM1.IntCod = ? and TM1.H_DiaI = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.TipColCod, TM1.IntCod, TM1.H_DiaI ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO14", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO15", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO16", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO17", "SELECT EmprCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO18", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and TipColCod > ? or TipColCod = ? and ArtCod = ? and CliCod = ? and IntCod > ? or IntCod = ? and TipColCod = ? and ArtCod = ? and CliCod = ? and H_DiaI > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AO20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and TipColCod < ? or TipColCod = ? and ArtCod = ? and CliCod = ? and IntCod < ? or IntCod = ? and TipColCod = ? and ArtCod = ? and CliCod = ? and H_DiaI < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, TipColCod DESC, IntCod DESC, H_DiaI DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AO21", "INSERT INTO TXPHPREIT(H_DiaI, H_UltLi, EmprCod, CliCod, ArtCod, IntCod, TipColCod, H_UltLe) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPHPREIT")
         ,new UpdateCursor("T01AO22", "UPDATE TXPHPREIT SET H_UltLi=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?", GX_NOMASK, "TXPHPREIT")
         ,new UpdateCursor("T01AO23", "DELETE FROM TXPHPREIT  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?", GX_NOMASK, "TXPHPREIT")
         ,new ForEachCursor("T01AO24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO25", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO26", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO27", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linIe, H_unde, H_line FROM TXPHPREIe WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AO29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO30", "SELECT CliCod, ArtCod, TipColCod, H_DiaI, H_linI, H_Pki, H_Pmi, H_tmI, H_UsI, H_HhI, H_obsi, EmprCod, IntCod FROM TXPHPREI1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and H_DiaI = ? and H_linI = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linI ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO31", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linI FROM TXPHPREI1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AO32", "INSERT INTO TXPHPREI1(CliCod, ArtCod, TipColCod, H_DiaI, H_linI, H_Pki, H_Pmi, H_tmI, H_UsI, H_HhI, H_obsi, EmprCod, IntCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPREI1")
         ,new UpdateCursor("T01AO33", "UPDATE TXPHPREI1 SET H_Pki=?, H_Pmi=?, H_tmI=?, H_UsI=?, H_HhI=?, H_obsi=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linI = ?", GX_NOMASK, "TXPHPREI1")
         ,new UpdateCursor("T01AO34", "DELETE FROM TXPHPREI1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linI = ?", GX_NOMASK, "TXPHPREI1")
         ,new ForEachCursor("T01AO35", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linI FROM TXPHPREI1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and H_DiaI = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linI ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AO37", "SELECT EmprCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 19 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
            case 20 :
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
               stmt.setString(4, (String)parms[4], 16);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[7]);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[16], 200);
               }
               stmt.setString(12, (String)parms[17], 3);
               stmt.setByte(13, ((Number) parms[18]).byteValue());
               return;
            case 31 :
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
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               stmt.setDate(12, (java.util.Date)parms[17]);
               stmt.setInt(13, ((Number) parms[18]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

