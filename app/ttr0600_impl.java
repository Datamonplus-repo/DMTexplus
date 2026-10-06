package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0600_impl extends GXDataArea
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
            A10301Cod_pais = (short)(GXutil.lval( httpContext.GetPar( "Cod_pais"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FORMATOS POR PAISES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFt_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttr0600_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0600_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0600_impl.class ));
   }

   public ttr0600_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0600.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo pais", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCod_pais_Internalname, GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCod_pais_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_pais_Jsonclick, 0, "", "", "", "", "", 1, edtCod_pais_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDsc_pais_Internalname, GXutil.rtrim( A10302Dsc_pais), GXutil.rtrim( localUtil.format( A10302Dsc_pais, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDsc_pais_Jsonclick, 0, "", "", "", "", "", 1, edtDsc_pais_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Formato", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_Cod_Internalname, GXutil.rtrim( A10323Ft_Cod), GXutil.rtrim( localUtil.format( A10323Ft_Cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_Cod_Jsonclick, 0, "", "", "", "", "", 1, edtFt_Cod_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Formato", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_dsc_Internalname, GXutil.rtrim( A10324Ft_dsc), GXutil.rtrim( localUtil.format( A10324Ft_dsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_dsc_Jsonclick, 0, "", "", "", "", "", 1, edtFt_dsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Item1", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it1_Internalname, GXutil.rtrim( A10325Ft_it1), GXutil.rtrim( localUtil.format( A10325Ft_it1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it1_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Item 2", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it2_Internalname, GXutil.rtrim( A10326Ft_it2), GXutil.rtrim( localUtil.format( A10326Ft_it2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it2_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Item 3", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it3_Internalname, GXutil.rtrim( A10327Ft_it3), GXutil.rtrim( localUtil.format( A10327Ft_it3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it3_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Item 4", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it4_Internalname, GXutil.rtrim( A10328Ft_it4), GXutil.rtrim( localUtil.format( A10328Ft_it4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it4_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it4_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Item 5", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it5_Internalname, GXutil.rtrim( A10329Ft_it5), GXutil.rtrim( localUtil.format( A10329Ft_it5, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it5_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it5_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Item 6", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it6_Internalname, GXutil.rtrim( A10330Ft_it6), GXutil.rtrim( localUtil.format( A10330Ft_it6, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it6_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it6_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Item7", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it7_Internalname, GXutil.rtrim( A10331Ft_it7), GXutil.rtrim( localUtil.format( A10331Ft_it7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it7_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it7_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Item 8", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it8_Internalname, GXutil.rtrim( A10332Ft_it8), GXutil.rtrim( localUtil.format( A10332Ft_it8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it8_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it8_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Item 9", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it9_Internalname, GXutil.rtrim( A10333Ft_it9), GXutil.rtrim( localUtil.format( A10333Ft_it9, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it9_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it9_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Item 10", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it10_Internalname, GXutil.rtrim( A10334Ft_it10), GXutil.rtrim( localUtil.format( A10334Ft_it10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it10_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it10_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Item 11", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it11_Internalname, GXutil.rtrim( A10335Ft_it11), GXutil.rtrim( localUtil.format( A10335Ft_it11, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it11_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it11_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Item 12", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it12_Internalname, GXutil.rtrim( A10336Ft_it12), GXutil.rtrim( localUtil.format( A10336Ft_it12, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it12_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it12_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Item 13", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it13_Internalname, GXutil.rtrim( A10337Ft_it13), GXutil.rtrim( localUtil.format( A10337Ft_it13, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it13_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it13_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Item 14", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it14_Internalname, GXutil.rtrim( A10338Ft_it14), GXutil.rtrim( localUtil.format( A10338Ft_it14, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it14_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it14_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Item 15", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it15_Internalname, GXutil.rtrim( A10339Ft_it15), GXutil.rtrim( localUtil.format( A10339Ft_it15, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it15_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it15_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Item 16", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it16_Internalname, GXutil.rtrim( A10340Ft_it16), GXutil.rtrim( localUtil.format( A10340Ft_it16, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it16_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it16_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Item 17", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it17_Internalname, GXutil.rtrim( A10341Ft_it17), GXutil.rtrim( localUtil.format( A10341Ft_it17, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it17_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it17_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Item 18", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it18_Internalname, GXutil.rtrim( A10342Ft_it18), GXutil.rtrim( localUtil.format( A10342Ft_it18, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it18_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it18_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Item 19", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it19_Internalname, GXutil.rtrim( A10343Ft_it19), GXutil.rtrim( localUtil.format( A10343Ft_it19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it19_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it19_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Item 20", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it20_Internalname, GXutil.rtrim( A10344Ft_it20), GXutil.rtrim( localUtil.format( A10344Ft_it20, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it20_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it20_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Item 21", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it21_Internalname, GXutil.rtrim( A10345Ft_it21), GXutil.rtrim( localUtil.format( A10345Ft_it21, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it21_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it21_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Item 22", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it22_Internalname, GXutil.rtrim( A10346Ft_it22), GXutil.rtrim( localUtil.format( A10346Ft_it22, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it22_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it22_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Item 23", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it23_Internalname, GXutil.rtrim( A10347Ft_it23), GXutil.rtrim( localUtil.format( A10347Ft_it23, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it23_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it23_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Item 24", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it24_Internalname, GXutil.rtrim( A10348Ft_it24), GXutil.rtrim( localUtil.format( A10348Ft_it24, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it24_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it24_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Item 25", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it25_Internalname, GXutil.rtrim( A10349Ft_it25), GXutil.rtrim( localUtil.format( A10349Ft_it25, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it25_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it25_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Item 26", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it26_Internalname, GXutil.rtrim( A10350Ft_it26), GXutil.rtrim( localUtil.format( A10350Ft_it26, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it26_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it26_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Item 27", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it27_Internalname, GXutil.rtrim( A10351Ft_it27), GXutil.rtrim( localUtil.format( A10351Ft_it27, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it27_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it27_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Item 28", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it28_Internalname, GXutil.rtrim( A10352Ft_it28), GXutil.rtrim( localUtil.format( A10352Ft_it28, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it28_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it28_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Item 29", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it29_Internalname, GXutil.rtrim( A10353Ft_it29), GXutil.rtrim( localUtil.format( A10353Ft_it29, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it29_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it29_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Item 30", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_it30_Internalname, GXutil.rtrim( A10354Ft_it30), GXutil.rtrim( localUtil.format( A10354Ft_it30, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_it30_Jsonclick, 0, "", "", "", "", "", 1, edtFt_it30_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0600.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0600.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0600.htm");
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
      e1117W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( "Z10301Cod_pais"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10323Ft_Cod = httpContext.cgiGet( "Z10323Ft_Cod") ;
            Z10324Ft_dsc = httpContext.cgiGet( "Z10324Ft_dsc") ;
            Z10325Ft_it1 = httpContext.cgiGet( "Z10325Ft_it1") ;
            Z10326Ft_it2 = httpContext.cgiGet( "Z10326Ft_it2") ;
            Z10327Ft_it3 = httpContext.cgiGet( "Z10327Ft_it3") ;
            Z10328Ft_it4 = httpContext.cgiGet( "Z10328Ft_it4") ;
            Z10329Ft_it5 = httpContext.cgiGet( "Z10329Ft_it5") ;
            Z10330Ft_it6 = httpContext.cgiGet( "Z10330Ft_it6") ;
            Z10331Ft_it7 = httpContext.cgiGet( "Z10331Ft_it7") ;
            Z10332Ft_it8 = httpContext.cgiGet( "Z10332Ft_it8") ;
            Z10333Ft_it9 = httpContext.cgiGet( "Z10333Ft_it9") ;
            Z10334Ft_it10 = httpContext.cgiGet( "Z10334Ft_it10") ;
            Z10335Ft_it11 = httpContext.cgiGet( "Z10335Ft_it11") ;
            Z10336Ft_it12 = httpContext.cgiGet( "Z10336Ft_it12") ;
            Z10337Ft_it13 = httpContext.cgiGet( "Z10337Ft_it13") ;
            Z10338Ft_it14 = httpContext.cgiGet( "Z10338Ft_it14") ;
            Z10339Ft_it15 = httpContext.cgiGet( "Z10339Ft_it15") ;
            Z10340Ft_it16 = httpContext.cgiGet( "Z10340Ft_it16") ;
            Z10341Ft_it17 = httpContext.cgiGet( "Z10341Ft_it17") ;
            Z10342Ft_it18 = httpContext.cgiGet( "Z10342Ft_it18") ;
            Z10343Ft_it19 = httpContext.cgiGet( "Z10343Ft_it19") ;
            Z10344Ft_it20 = httpContext.cgiGet( "Z10344Ft_it20") ;
            Z10345Ft_it21 = httpContext.cgiGet( "Z10345Ft_it21") ;
            Z10346Ft_it22 = httpContext.cgiGet( "Z10346Ft_it22") ;
            Z10347Ft_it23 = httpContext.cgiGet( "Z10347Ft_it23") ;
            Z10348Ft_it24 = httpContext.cgiGet( "Z10348Ft_it24") ;
            Z10349Ft_it25 = httpContext.cgiGet( "Z10349Ft_it25") ;
            Z10350Ft_it26 = httpContext.cgiGet( "Z10350Ft_it26") ;
            Z10351Ft_it27 = httpContext.cgiGet( "Z10351Ft_it27") ;
            Z10352Ft_it28 = httpContext.cgiGet( "Z10352Ft_it28") ;
            Z10353Ft_it29 = httpContext.cgiGet( "Z10353Ft_it29") ;
            Z10354Ft_it30 = httpContext.cgiGet( "Z10354Ft_it30") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
            A10302Dsc_pais = httpContext.cgiGet( edtDsc_pais_Internalname) ;
            n10302Dsc_pais = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
            A10323Ft_Cod = httpContext.cgiGet( edtFt_Cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
            A10324Ft_dsc = httpContext.cgiGet( edtFt_dsc_Internalname) ;
            n10324Ft_dsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10324Ft_dsc", A10324Ft_dsc);
            A10325Ft_it1 = httpContext.cgiGet( edtFt_it1_Internalname) ;
            n10325Ft_it1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10325Ft_it1", A10325Ft_it1);
            A10326Ft_it2 = httpContext.cgiGet( edtFt_it2_Internalname) ;
            n10326Ft_it2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10326Ft_it2", A10326Ft_it2);
            A10327Ft_it3 = httpContext.cgiGet( edtFt_it3_Internalname) ;
            n10327Ft_it3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10327Ft_it3", A10327Ft_it3);
            A10328Ft_it4 = httpContext.cgiGet( edtFt_it4_Internalname) ;
            n10328Ft_it4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10328Ft_it4", A10328Ft_it4);
            A10329Ft_it5 = httpContext.cgiGet( edtFt_it5_Internalname) ;
            n10329Ft_it5 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10329Ft_it5", A10329Ft_it5);
            A10330Ft_it6 = httpContext.cgiGet( edtFt_it6_Internalname) ;
            n10330Ft_it6 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10330Ft_it6", A10330Ft_it6);
            A10331Ft_it7 = httpContext.cgiGet( edtFt_it7_Internalname) ;
            n10331Ft_it7 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10331Ft_it7", A10331Ft_it7);
            A10332Ft_it8 = httpContext.cgiGet( edtFt_it8_Internalname) ;
            n10332Ft_it8 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10332Ft_it8", A10332Ft_it8);
            A10333Ft_it9 = httpContext.cgiGet( edtFt_it9_Internalname) ;
            n10333Ft_it9 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10333Ft_it9", A10333Ft_it9);
            A10334Ft_it10 = httpContext.cgiGet( edtFt_it10_Internalname) ;
            n10334Ft_it10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10334Ft_it10", A10334Ft_it10);
            A10335Ft_it11 = httpContext.cgiGet( edtFt_it11_Internalname) ;
            n10335Ft_it11 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10335Ft_it11", A10335Ft_it11);
            A10336Ft_it12 = httpContext.cgiGet( edtFt_it12_Internalname) ;
            n10336Ft_it12 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10336Ft_it12", A10336Ft_it12);
            A10337Ft_it13 = httpContext.cgiGet( edtFt_it13_Internalname) ;
            n10337Ft_it13 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10337Ft_it13", A10337Ft_it13);
            A10338Ft_it14 = httpContext.cgiGet( edtFt_it14_Internalname) ;
            n10338Ft_it14 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10338Ft_it14", A10338Ft_it14);
            A10339Ft_it15 = httpContext.cgiGet( edtFt_it15_Internalname) ;
            n10339Ft_it15 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10339Ft_it15", A10339Ft_it15);
            A10340Ft_it16 = httpContext.cgiGet( edtFt_it16_Internalname) ;
            n10340Ft_it16 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10340Ft_it16", A10340Ft_it16);
            A10341Ft_it17 = httpContext.cgiGet( edtFt_it17_Internalname) ;
            n10341Ft_it17 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10341Ft_it17", A10341Ft_it17);
            A10342Ft_it18 = httpContext.cgiGet( edtFt_it18_Internalname) ;
            n10342Ft_it18 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10342Ft_it18", A10342Ft_it18);
            A10343Ft_it19 = httpContext.cgiGet( edtFt_it19_Internalname) ;
            n10343Ft_it19 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10343Ft_it19", A10343Ft_it19);
            A10344Ft_it20 = httpContext.cgiGet( edtFt_it20_Internalname) ;
            n10344Ft_it20 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10344Ft_it20", A10344Ft_it20);
            A10345Ft_it21 = httpContext.cgiGet( edtFt_it21_Internalname) ;
            n10345Ft_it21 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10345Ft_it21", A10345Ft_it21);
            A10346Ft_it22 = httpContext.cgiGet( edtFt_it22_Internalname) ;
            n10346Ft_it22 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10346Ft_it22", A10346Ft_it22);
            A10347Ft_it23 = httpContext.cgiGet( edtFt_it23_Internalname) ;
            n10347Ft_it23 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10347Ft_it23", A10347Ft_it23);
            A10348Ft_it24 = httpContext.cgiGet( edtFt_it24_Internalname) ;
            n10348Ft_it24 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10348Ft_it24", A10348Ft_it24);
            A10349Ft_it25 = httpContext.cgiGet( edtFt_it25_Internalname) ;
            n10349Ft_it25 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10349Ft_it25", A10349Ft_it25);
            A10350Ft_it26 = httpContext.cgiGet( edtFt_it26_Internalname) ;
            n10350Ft_it26 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10350Ft_it26", A10350Ft_it26);
            A10351Ft_it27 = httpContext.cgiGet( edtFt_it27_Internalname) ;
            n10351Ft_it27 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10351Ft_it27", A10351Ft_it27);
            A10352Ft_it28 = httpContext.cgiGet( edtFt_it28_Internalname) ;
            n10352Ft_it28 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10352Ft_it28", A10352Ft_it28);
            A10353Ft_it29 = httpContext.cgiGet( edtFt_it29_Internalname) ;
            n10353Ft_it29 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10353Ft_it29", A10353Ft_it29);
            A10354Ft_it30 = httpContext.cgiGet( edtFt_it30_Internalname) ;
            n10354Ft_it30 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10354Ft_it30", A10354Ft_it30);
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
               A10301Cod_pais = (short)(GXutil.lval( httpContext.GetPar( "Cod_pais"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10301Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10301Cod_pais), 4, 0));
               A10323Ft_Cod = httpContext.GetPar( "Ft_Cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
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
                        e1117W2 ();
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
            initAll17W1402( ) ;
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
      disableAttributes17W1402( ) ;
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

   public void confirm_17W0( )
   {
      beforeValidate17W1402( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17W1402( ) ;
         }
         else
         {
            checkExtendedTable17W1402( ) ;
            if ( AnyError == 0 )
            {
               zm17W1402( 2) ;
               zm17W1402( 3) ;
            }
            closeExtendedTableCursors17W1402( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17W0( ) ;
      }
   }

   public void resetCaption17W0( )
   {
   }

   public void e1117W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0600_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttr0600_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0600_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Pais", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Formato", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr0600_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0600_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0600_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17W1402( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10324Ft_dsc = T017W3_A10324Ft_dsc[0] ;
            Z10325Ft_it1 = T017W3_A10325Ft_it1[0] ;
            Z10326Ft_it2 = T017W3_A10326Ft_it2[0] ;
            Z10327Ft_it3 = T017W3_A10327Ft_it3[0] ;
            Z10328Ft_it4 = T017W3_A10328Ft_it4[0] ;
            Z10329Ft_it5 = T017W3_A10329Ft_it5[0] ;
            Z10330Ft_it6 = T017W3_A10330Ft_it6[0] ;
            Z10331Ft_it7 = T017W3_A10331Ft_it7[0] ;
            Z10332Ft_it8 = T017W3_A10332Ft_it8[0] ;
            Z10333Ft_it9 = T017W3_A10333Ft_it9[0] ;
            Z10334Ft_it10 = T017W3_A10334Ft_it10[0] ;
            Z10335Ft_it11 = T017W3_A10335Ft_it11[0] ;
            Z10336Ft_it12 = T017W3_A10336Ft_it12[0] ;
            Z10337Ft_it13 = T017W3_A10337Ft_it13[0] ;
            Z10338Ft_it14 = T017W3_A10338Ft_it14[0] ;
            Z10339Ft_it15 = T017W3_A10339Ft_it15[0] ;
            Z10340Ft_it16 = T017W3_A10340Ft_it16[0] ;
            Z10341Ft_it17 = T017W3_A10341Ft_it17[0] ;
            Z10342Ft_it18 = T017W3_A10342Ft_it18[0] ;
            Z10343Ft_it19 = T017W3_A10343Ft_it19[0] ;
            Z10344Ft_it20 = T017W3_A10344Ft_it20[0] ;
            Z10345Ft_it21 = T017W3_A10345Ft_it21[0] ;
            Z10346Ft_it22 = T017W3_A10346Ft_it22[0] ;
            Z10347Ft_it23 = T017W3_A10347Ft_it23[0] ;
            Z10348Ft_it24 = T017W3_A10348Ft_it24[0] ;
            Z10349Ft_it25 = T017W3_A10349Ft_it25[0] ;
            Z10350Ft_it26 = T017W3_A10350Ft_it26[0] ;
            Z10351Ft_it27 = T017W3_A10351Ft_it27[0] ;
            Z10352Ft_it28 = T017W3_A10352Ft_it28[0] ;
            Z10353Ft_it29 = T017W3_A10353Ft_it29[0] ;
            Z10354Ft_it30 = T017W3_A10354Ft_it30[0] ;
         }
         else
         {
            Z10324Ft_dsc = A10324Ft_dsc ;
            Z10325Ft_it1 = A10325Ft_it1 ;
            Z10326Ft_it2 = A10326Ft_it2 ;
            Z10327Ft_it3 = A10327Ft_it3 ;
            Z10328Ft_it4 = A10328Ft_it4 ;
            Z10329Ft_it5 = A10329Ft_it5 ;
            Z10330Ft_it6 = A10330Ft_it6 ;
            Z10331Ft_it7 = A10331Ft_it7 ;
            Z10332Ft_it8 = A10332Ft_it8 ;
            Z10333Ft_it9 = A10333Ft_it9 ;
            Z10334Ft_it10 = A10334Ft_it10 ;
            Z10335Ft_it11 = A10335Ft_it11 ;
            Z10336Ft_it12 = A10336Ft_it12 ;
            Z10337Ft_it13 = A10337Ft_it13 ;
            Z10338Ft_it14 = A10338Ft_it14 ;
            Z10339Ft_it15 = A10339Ft_it15 ;
            Z10340Ft_it16 = A10340Ft_it16 ;
            Z10341Ft_it17 = A10341Ft_it17 ;
            Z10342Ft_it18 = A10342Ft_it18 ;
            Z10343Ft_it19 = A10343Ft_it19 ;
            Z10344Ft_it20 = A10344Ft_it20 ;
            Z10345Ft_it21 = A10345Ft_it21 ;
            Z10346Ft_it22 = A10346Ft_it22 ;
            Z10347Ft_it23 = A10347Ft_it23 ;
            Z10348Ft_it24 = A10348Ft_it24 ;
            Z10349Ft_it25 = A10349Ft_it25 ;
            Z10350Ft_it26 = A10350Ft_it26 ;
            Z10351Ft_it27 = A10351Ft_it27 ;
            Z10352Ft_it28 = A10352Ft_it28 ;
            Z10353Ft_it29 = A10353Ft_it29 ;
            Z10354Ft_it30 = A10354Ft_it30 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10323Ft_Cod = A10323Ft_Cod ;
         Z10324Ft_dsc = A10324Ft_dsc ;
         Z10325Ft_it1 = A10325Ft_it1 ;
         Z10326Ft_it2 = A10326Ft_it2 ;
         Z10327Ft_it3 = A10327Ft_it3 ;
         Z10328Ft_it4 = A10328Ft_it4 ;
         Z10329Ft_it5 = A10329Ft_it5 ;
         Z10330Ft_it6 = A10330Ft_it6 ;
         Z10331Ft_it7 = A10331Ft_it7 ;
         Z10332Ft_it8 = A10332Ft_it8 ;
         Z10333Ft_it9 = A10333Ft_it9 ;
         Z10334Ft_it10 = A10334Ft_it10 ;
         Z10335Ft_it11 = A10335Ft_it11 ;
         Z10336Ft_it12 = A10336Ft_it12 ;
         Z10337Ft_it13 = A10337Ft_it13 ;
         Z10338Ft_it14 = A10338Ft_it14 ;
         Z10339Ft_it15 = A10339Ft_it15 ;
         Z10340Ft_it16 = A10340Ft_it16 ;
         Z10341Ft_it17 = A10341Ft_it17 ;
         Z10342Ft_it18 = A10342Ft_it18 ;
         Z10343Ft_it19 = A10343Ft_it19 ;
         Z10344Ft_it20 = A10344Ft_it20 ;
         Z10345Ft_it21 = A10345Ft_it21 ;
         Z10346Ft_it22 = A10346Ft_it22 ;
         Z10347Ft_it23 = A10347Ft_it23 ;
         Z10348Ft_it24 = A10348Ft_it24 ;
         Z10349Ft_it25 = A10349Ft_it25 ;
         Z10350Ft_it26 = A10350Ft_it26 ;
         Z10351Ft_it27 = A10351Ft_it27 ;
         Z10352Ft_it28 = A10352Ft_it28 ;
         Z10353Ft_it29 = A10353Ft_it29 ;
         Z10354Ft_it30 = A10354Ft_it30 ;
         Z396EmprCod = A396EmprCod ;
         Z10301Cod_pais = A10301Cod_pais ;
         Z407EmprNom = A407EmprNom ;
         Z10302Dsc_pais = A10302Dsc_pais ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTR0600" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T017W4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017W4_A407EmprNom[0] ;
      n407EmprNom = T017W4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T017W5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0400", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_PAIS");
         AnyError = (short)(1) ;
      }
      A10302Dsc_pais = T017W5_A10302Dsc_pais[0] ;
      n10302Dsc_pais = T017W5_n10302Dsc_pais[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
      pr_default.close(3);
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

   public void load17W1402( )
   {
      /* Using cursor T017W6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais), A10323Ft_Cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1402 = (short)(1) ;
         A407EmprNom = T017W6_A407EmprNom[0] ;
         n407EmprNom = T017W6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10302Dsc_pais = T017W6_A10302Dsc_pais[0] ;
         n10302Dsc_pais = T017W6_n10302Dsc_pais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
         A10324Ft_dsc = T017W6_A10324Ft_dsc[0] ;
         n10324Ft_dsc = T017W6_n10324Ft_dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10324Ft_dsc", A10324Ft_dsc);
         A10325Ft_it1 = T017W6_A10325Ft_it1[0] ;
         n10325Ft_it1 = T017W6_n10325Ft_it1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10325Ft_it1", A10325Ft_it1);
         A10326Ft_it2 = T017W6_A10326Ft_it2[0] ;
         n10326Ft_it2 = T017W6_n10326Ft_it2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10326Ft_it2", A10326Ft_it2);
         A10327Ft_it3 = T017W6_A10327Ft_it3[0] ;
         n10327Ft_it3 = T017W6_n10327Ft_it3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10327Ft_it3", A10327Ft_it3);
         A10328Ft_it4 = T017W6_A10328Ft_it4[0] ;
         n10328Ft_it4 = T017W6_n10328Ft_it4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10328Ft_it4", A10328Ft_it4);
         A10329Ft_it5 = T017W6_A10329Ft_it5[0] ;
         n10329Ft_it5 = T017W6_n10329Ft_it5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10329Ft_it5", A10329Ft_it5);
         A10330Ft_it6 = T017W6_A10330Ft_it6[0] ;
         n10330Ft_it6 = T017W6_n10330Ft_it6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10330Ft_it6", A10330Ft_it6);
         A10331Ft_it7 = T017W6_A10331Ft_it7[0] ;
         n10331Ft_it7 = T017W6_n10331Ft_it7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10331Ft_it7", A10331Ft_it7);
         A10332Ft_it8 = T017W6_A10332Ft_it8[0] ;
         n10332Ft_it8 = T017W6_n10332Ft_it8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10332Ft_it8", A10332Ft_it8);
         A10333Ft_it9 = T017W6_A10333Ft_it9[0] ;
         n10333Ft_it9 = T017W6_n10333Ft_it9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10333Ft_it9", A10333Ft_it9);
         A10334Ft_it10 = T017W6_A10334Ft_it10[0] ;
         n10334Ft_it10 = T017W6_n10334Ft_it10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10334Ft_it10", A10334Ft_it10);
         A10335Ft_it11 = T017W6_A10335Ft_it11[0] ;
         n10335Ft_it11 = T017W6_n10335Ft_it11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10335Ft_it11", A10335Ft_it11);
         A10336Ft_it12 = T017W6_A10336Ft_it12[0] ;
         n10336Ft_it12 = T017W6_n10336Ft_it12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10336Ft_it12", A10336Ft_it12);
         A10337Ft_it13 = T017W6_A10337Ft_it13[0] ;
         n10337Ft_it13 = T017W6_n10337Ft_it13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10337Ft_it13", A10337Ft_it13);
         A10338Ft_it14 = T017W6_A10338Ft_it14[0] ;
         n10338Ft_it14 = T017W6_n10338Ft_it14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10338Ft_it14", A10338Ft_it14);
         A10339Ft_it15 = T017W6_A10339Ft_it15[0] ;
         n10339Ft_it15 = T017W6_n10339Ft_it15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10339Ft_it15", A10339Ft_it15);
         A10340Ft_it16 = T017W6_A10340Ft_it16[0] ;
         n10340Ft_it16 = T017W6_n10340Ft_it16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10340Ft_it16", A10340Ft_it16);
         A10341Ft_it17 = T017W6_A10341Ft_it17[0] ;
         n10341Ft_it17 = T017W6_n10341Ft_it17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10341Ft_it17", A10341Ft_it17);
         A10342Ft_it18 = T017W6_A10342Ft_it18[0] ;
         n10342Ft_it18 = T017W6_n10342Ft_it18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10342Ft_it18", A10342Ft_it18);
         A10343Ft_it19 = T017W6_A10343Ft_it19[0] ;
         n10343Ft_it19 = T017W6_n10343Ft_it19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10343Ft_it19", A10343Ft_it19);
         A10344Ft_it20 = T017W6_A10344Ft_it20[0] ;
         n10344Ft_it20 = T017W6_n10344Ft_it20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10344Ft_it20", A10344Ft_it20);
         A10345Ft_it21 = T017W6_A10345Ft_it21[0] ;
         n10345Ft_it21 = T017W6_n10345Ft_it21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10345Ft_it21", A10345Ft_it21);
         A10346Ft_it22 = T017W6_A10346Ft_it22[0] ;
         n10346Ft_it22 = T017W6_n10346Ft_it22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10346Ft_it22", A10346Ft_it22);
         A10347Ft_it23 = T017W6_A10347Ft_it23[0] ;
         n10347Ft_it23 = T017W6_n10347Ft_it23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10347Ft_it23", A10347Ft_it23);
         A10348Ft_it24 = T017W6_A10348Ft_it24[0] ;
         n10348Ft_it24 = T017W6_n10348Ft_it24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10348Ft_it24", A10348Ft_it24);
         A10349Ft_it25 = T017W6_A10349Ft_it25[0] ;
         n10349Ft_it25 = T017W6_n10349Ft_it25[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10349Ft_it25", A10349Ft_it25);
         A10350Ft_it26 = T017W6_A10350Ft_it26[0] ;
         n10350Ft_it26 = T017W6_n10350Ft_it26[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10350Ft_it26", A10350Ft_it26);
         A10351Ft_it27 = T017W6_A10351Ft_it27[0] ;
         n10351Ft_it27 = T017W6_n10351Ft_it27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10351Ft_it27", A10351Ft_it27);
         A10352Ft_it28 = T017W6_A10352Ft_it28[0] ;
         n10352Ft_it28 = T017W6_n10352Ft_it28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10352Ft_it28", A10352Ft_it28);
         A10353Ft_it29 = T017W6_A10353Ft_it29[0] ;
         n10353Ft_it29 = T017W6_n10353Ft_it29[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10353Ft_it29", A10353Ft_it29);
         A10354Ft_it30 = T017W6_A10354Ft_it30[0] ;
         n10354Ft_it30 = T017W6_n10354Ft_it30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10354Ft_it30", A10354Ft_it30);
         zm17W1402( -1) ;
      }
      pr_default.close(4);
      onLoadActions17W1402( ) ;
   }

   public void onLoadActions17W1402( )
   {
   }

   public void checkExtendedTable17W1402( )
   {
      nIsDirty_1402 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17W1402( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17W1402( )
   {
      /* Using cursor T017W7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais), A10323Ft_Cod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1402 = (short)(1) ;
      }
      else
      {
         RcdFound1402 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017W3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais), A10323Ft_Cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017W3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017W3_A10301Cod_pais[0] == A10301Cod_pais ) )
      {
         zm17W1402( 1) ;
         RcdFound1402 = (short)(1) ;
         A10323Ft_Cod = T017W3_A10323Ft_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
         A10324Ft_dsc = T017W3_A10324Ft_dsc[0] ;
         n10324Ft_dsc = T017W3_n10324Ft_dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10324Ft_dsc", A10324Ft_dsc);
         A10325Ft_it1 = T017W3_A10325Ft_it1[0] ;
         n10325Ft_it1 = T017W3_n10325Ft_it1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10325Ft_it1", A10325Ft_it1);
         A10326Ft_it2 = T017W3_A10326Ft_it2[0] ;
         n10326Ft_it2 = T017W3_n10326Ft_it2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10326Ft_it2", A10326Ft_it2);
         A10327Ft_it3 = T017W3_A10327Ft_it3[0] ;
         n10327Ft_it3 = T017W3_n10327Ft_it3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10327Ft_it3", A10327Ft_it3);
         A10328Ft_it4 = T017W3_A10328Ft_it4[0] ;
         n10328Ft_it4 = T017W3_n10328Ft_it4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10328Ft_it4", A10328Ft_it4);
         A10329Ft_it5 = T017W3_A10329Ft_it5[0] ;
         n10329Ft_it5 = T017W3_n10329Ft_it5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10329Ft_it5", A10329Ft_it5);
         A10330Ft_it6 = T017W3_A10330Ft_it6[0] ;
         n10330Ft_it6 = T017W3_n10330Ft_it6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10330Ft_it6", A10330Ft_it6);
         A10331Ft_it7 = T017W3_A10331Ft_it7[0] ;
         n10331Ft_it7 = T017W3_n10331Ft_it7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10331Ft_it7", A10331Ft_it7);
         A10332Ft_it8 = T017W3_A10332Ft_it8[0] ;
         n10332Ft_it8 = T017W3_n10332Ft_it8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10332Ft_it8", A10332Ft_it8);
         A10333Ft_it9 = T017W3_A10333Ft_it9[0] ;
         n10333Ft_it9 = T017W3_n10333Ft_it9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10333Ft_it9", A10333Ft_it9);
         A10334Ft_it10 = T017W3_A10334Ft_it10[0] ;
         n10334Ft_it10 = T017W3_n10334Ft_it10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10334Ft_it10", A10334Ft_it10);
         A10335Ft_it11 = T017W3_A10335Ft_it11[0] ;
         n10335Ft_it11 = T017W3_n10335Ft_it11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10335Ft_it11", A10335Ft_it11);
         A10336Ft_it12 = T017W3_A10336Ft_it12[0] ;
         n10336Ft_it12 = T017W3_n10336Ft_it12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10336Ft_it12", A10336Ft_it12);
         A10337Ft_it13 = T017W3_A10337Ft_it13[0] ;
         n10337Ft_it13 = T017W3_n10337Ft_it13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10337Ft_it13", A10337Ft_it13);
         A10338Ft_it14 = T017W3_A10338Ft_it14[0] ;
         n10338Ft_it14 = T017W3_n10338Ft_it14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10338Ft_it14", A10338Ft_it14);
         A10339Ft_it15 = T017W3_A10339Ft_it15[0] ;
         n10339Ft_it15 = T017W3_n10339Ft_it15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10339Ft_it15", A10339Ft_it15);
         A10340Ft_it16 = T017W3_A10340Ft_it16[0] ;
         n10340Ft_it16 = T017W3_n10340Ft_it16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10340Ft_it16", A10340Ft_it16);
         A10341Ft_it17 = T017W3_A10341Ft_it17[0] ;
         n10341Ft_it17 = T017W3_n10341Ft_it17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10341Ft_it17", A10341Ft_it17);
         A10342Ft_it18 = T017W3_A10342Ft_it18[0] ;
         n10342Ft_it18 = T017W3_n10342Ft_it18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10342Ft_it18", A10342Ft_it18);
         A10343Ft_it19 = T017W3_A10343Ft_it19[0] ;
         n10343Ft_it19 = T017W3_n10343Ft_it19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10343Ft_it19", A10343Ft_it19);
         A10344Ft_it20 = T017W3_A10344Ft_it20[0] ;
         n10344Ft_it20 = T017W3_n10344Ft_it20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10344Ft_it20", A10344Ft_it20);
         A10345Ft_it21 = T017W3_A10345Ft_it21[0] ;
         n10345Ft_it21 = T017W3_n10345Ft_it21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10345Ft_it21", A10345Ft_it21);
         A10346Ft_it22 = T017W3_A10346Ft_it22[0] ;
         n10346Ft_it22 = T017W3_n10346Ft_it22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10346Ft_it22", A10346Ft_it22);
         A10347Ft_it23 = T017W3_A10347Ft_it23[0] ;
         n10347Ft_it23 = T017W3_n10347Ft_it23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10347Ft_it23", A10347Ft_it23);
         A10348Ft_it24 = T017W3_A10348Ft_it24[0] ;
         n10348Ft_it24 = T017W3_n10348Ft_it24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10348Ft_it24", A10348Ft_it24);
         A10349Ft_it25 = T017W3_A10349Ft_it25[0] ;
         n10349Ft_it25 = T017W3_n10349Ft_it25[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10349Ft_it25", A10349Ft_it25);
         A10350Ft_it26 = T017W3_A10350Ft_it26[0] ;
         n10350Ft_it26 = T017W3_n10350Ft_it26[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10350Ft_it26", A10350Ft_it26);
         A10351Ft_it27 = T017W3_A10351Ft_it27[0] ;
         n10351Ft_it27 = T017W3_n10351Ft_it27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10351Ft_it27", A10351Ft_it27);
         A10352Ft_it28 = T017W3_A10352Ft_it28[0] ;
         n10352Ft_it28 = T017W3_n10352Ft_it28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10352Ft_it28", A10352Ft_it28);
         A10353Ft_it29 = T017W3_A10353Ft_it29[0] ;
         n10353Ft_it29 = T017W3_n10353Ft_it29[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10353Ft_it29", A10353Ft_it29);
         A10354Ft_it30 = T017W3_A10354Ft_it30[0] ;
         n10354Ft_it30 = T017W3_n10354Ft_it30[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10354Ft_it30", A10354Ft_it30);
         Z396EmprCod = A396EmprCod ;
         Z10301Cod_pais = A10301Cod_pais ;
         Z10323Ft_Cod = A10323Ft_Cod ;
         sMode1402 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17W1402( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1402 = (short)(0) ;
            initializeNonKey17W1402( ) ;
         }
         Gx_mode = sMode1402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1402 = (short)(0) ;
         initializeNonKey17W1402( ) ;
         sMode1402 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1402 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17W1402( ) ;
      if ( RcdFound1402 == 0 )
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
      RcdFound1402 = (short)(0) ;
      /* Using cursor T017W8 */
      pr_default.execute(6, new Object[] {A10323Ft_Cod, A396EmprCod, Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T017W8_A10323Ft_Cod[0], A10323Ft_Cod) < 0 ) ) && ( GXutil.strcmp(T017W8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017W8_A10301Cod_pais[0] == A10301Cod_pais ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T017W8_A10323Ft_Cod[0], A10323Ft_Cod) > 0 ) ) && ( GXutil.strcmp(T017W8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017W8_A10301Cod_pais[0] == A10301Cod_pais ) )
         {
            A10323Ft_Cod = T017W8_A10323Ft_Cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
            RcdFound1402 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1402 = (short)(0) ;
      /* Using cursor T017W9 */
      pr_default.execute(7, new Object[] {A10323Ft_Cod, A396EmprCod, Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T017W9_A10323Ft_Cod[0], A10323Ft_Cod) > 0 ) ) && ( GXutil.strcmp(T017W9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017W9_A10301Cod_pais[0] == A10301Cod_pais ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T017W9_A10323Ft_Cod[0], A10323Ft_Cod) < 0 ) ) && ( GXutil.strcmp(T017W9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017W9_A10301Cod_pais[0] == A10301Cod_pais ) )
         {
            A10323Ft_Cod = T017W9_A10323Ft_Cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
            RcdFound1402 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17W1402( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFt_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17W1402( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1402 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10301Cod_pais != Z10301Cod_pais ) || ( GXutil.strcmp(A10323Ft_Cod, Z10323Ft_Cod) != 0 ) )
            {
               A10323Ft_Cod = Z10323Ft_Cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFt_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17W1402( ) ;
               GX_FocusControl = edtFt_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10301Cod_pais != Z10301Cod_pais ) || ( GXutil.strcmp(A10323Ft_Cod, Z10323Ft_Cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFt_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17W1402( ) ;
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
                  GX_FocusControl = edtFt_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17W1402( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10301Cod_pais != Z10301Cod_pais ) || ( GXutil.strcmp(A10323Ft_Cod, Z10323Ft_Cod) != 0 ) )
      {
         A10323Ft_Cod = Z10323Ft_Cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFt_Cod_Internalname ;
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
      getKey17W1402( ) ;
      if ( RcdFound1402 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10301Cod_pais != Z10301Cod_pais ) || ( GXutil.strcmp(A10323Ft_Cod, Z10323Ft_Cod) != 0 ) )
         {
            A10323Ft_Cod = Z10323Ft_Cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10301Cod_pais != Z10301Cod_pais ) || ( GXutil.strcmp(A10323Ft_Cod, Z10323Ft_Cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0600");
      GX_FocusControl = edtFt_dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17W0( ) ;
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
      if ( RcdFound1402 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFt_dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17W1402( ) ;
      if ( RcdFound1402 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17W1402( ) ;
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
      if ( RcdFound1402 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_dsc_Internalname ;
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
      if ( RcdFound1402 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_dsc_Internalname ;
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
      scanStart17W1402( ) ;
      if ( RcdFound1402 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1402 != 0 )
         {
            scanNext17W1402( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_dsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17W1402( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17W1402( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais), A10323Ft_Cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0600"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10324Ft_dsc, T017W2_A10324Ft_dsc[0]) != 0 ) || ( GXutil.strcmp(Z10325Ft_it1, T017W2_A10325Ft_it1[0]) != 0 ) || ( GXutil.strcmp(Z10326Ft_it2, T017W2_A10326Ft_it2[0]) != 0 ) || ( GXutil.strcmp(Z10327Ft_it3, T017W2_A10327Ft_it3[0]) != 0 ) || ( GXutil.strcmp(Z10328Ft_it4, T017W2_A10328Ft_it4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10329Ft_it5, T017W2_A10329Ft_it5[0]) != 0 ) || ( GXutil.strcmp(Z10330Ft_it6, T017W2_A10330Ft_it6[0]) != 0 ) || ( GXutil.strcmp(Z10331Ft_it7, T017W2_A10331Ft_it7[0]) != 0 ) || ( GXutil.strcmp(Z10332Ft_it8, T017W2_A10332Ft_it8[0]) != 0 ) || ( GXutil.strcmp(Z10333Ft_it9, T017W2_A10333Ft_it9[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10334Ft_it10, T017W2_A10334Ft_it10[0]) != 0 ) || ( GXutil.strcmp(Z10335Ft_it11, T017W2_A10335Ft_it11[0]) != 0 ) || ( GXutil.strcmp(Z10336Ft_it12, T017W2_A10336Ft_it12[0]) != 0 ) || ( GXutil.strcmp(Z10337Ft_it13, T017W2_A10337Ft_it13[0]) != 0 ) || ( GXutil.strcmp(Z10338Ft_it14, T017W2_A10338Ft_it14[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10339Ft_it15, T017W2_A10339Ft_it15[0]) != 0 ) || ( GXutil.strcmp(Z10340Ft_it16, T017W2_A10340Ft_it16[0]) != 0 ) || ( GXutil.strcmp(Z10341Ft_it17, T017W2_A10341Ft_it17[0]) != 0 ) || ( GXutil.strcmp(Z10342Ft_it18, T017W2_A10342Ft_it18[0]) != 0 ) || ( GXutil.strcmp(Z10343Ft_it19, T017W2_A10343Ft_it19[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10344Ft_it20, T017W2_A10344Ft_it20[0]) != 0 ) || ( GXutil.strcmp(Z10345Ft_it21, T017W2_A10345Ft_it21[0]) != 0 ) || ( GXutil.strcmp(Z10346Ft_it22, T017W2_A10346Ft_it22[0]) != 0 ) || ( GXutil.strcmp(Z10347Ft_it23, T017W2_A10347Ft_it23[0]) != 0 ) || ( GXutil.strcmp(Z10348Ft_it24, T017W2_A10348Ft_it24[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10349Ft_it25, T017W2_A10349Ft_it25[0]) != 0 ) || ( GXutil.strcmp(Z10350Ft_it26, T017W2_A10350Ft_it26[0]) != 0 ) || ( GXutil.strcmp(Z10351Ft_it27, T017W2_A10351Ft_it27[0]) != 0 ) || ( GXutil.strcmp(Z10352Ft_it28, T017W2_A10352Ft_it28[0]) != 0 ) || ( GXutil.strcmp(Z10353Ft_it29, T017W2_A10353Ft_it29[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10354Ft_it30, T017W2_A10354Ft_it30[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10324Ft_dsc, T017W2_A10324Ft_dsc[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_dsc");
               GXutil.writeLogRaw("Old: ",Z10324Ft_dsc);
               GXutil.writeLogRaw("Current: ",T017W2_A10324Ft_dsc[0]);
            }
            if ( GXutil.strcmp(Z10325Ft_it1, T017W2_A10325Ft_it1[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it1");
               GXutil.writeLogRaw("Old: ",Z10325Ft_it1);
               GXutil.writeLogRaw("Current: ",T017W2_A10325Ft_it1[0]);
            }
            if ( GXutil.strcmp(Z10326Ft_it2, T017W2_A10326Ft_it2[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it2");
               GXutil.writeLogRaw("Old: ",Z10326Ft_it2);
               GXutil.writeLogRaw("Current: ",T017W2_A10326Ft_it2[0]);
            }
            if ( GXutil.strcmp(Z10327Ft_it3, T017W2_A10327Ft_it3[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it3");
               GXutil.writeLogRaw("Old: ",Z10327Ft_it3);
               GXutil.writeLogRaw("Current: ",T017W2_A10327Ft_it3[0]);
            }
            if ( GXutil.strcmp(Z10328Ft_it4, T017W2_A10328Ft_it4[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it4");
               GXutil.writeLogRaw("Old: ",Z10328Ft_it4);
               GXutil.writeLogRaw("Current: ",T017W2_A10328Ft_it4[0]);
            }
            if ( GXutil.strcmp(Z10329Ft_it5, T017W2_A10329Ft_it5[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it5");
               GXutil.writeLogRaw("Old: ",Z10329Ft_it5);
               GXutil.writeLogRaw("Current: ",T017W2_A10329Ft_it5[0]);
            }
            if ( GXutil.strcmp(Z10330Ft_it6, T017W2_A10330Ft_it6[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it6");
               GXutil.writeLogRaw("Old: ",Z10330Ft_it6);
               GXutil.writeLogRaw("Current: ",T017W2_A10330Ft_it6[0]);
            }
            if ( GXutil.strcmp(Z10331Ft_it7, T017W2_A10331Ft_it7[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it7");
               GXutil.writeLogRaw("Old: ",Z10331Ft_it7);
               GXutil.writeLogRaw("Current: ",T017W2_A10331Ft_it7[0]);
            }
            if ( GXutil.strcmp(Z10332Ft_it8, T017W2_A10332Ft_it8[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it8");
               GXutil.writeLogRaw("Old: ",Z10332Ft_it8);
               GXutil.writeLogRaw("Current: ",T017W2_A10332Ft_it8[0]);
            }
            if ( GXutil.strcmp(Z10333Ft_it9, T017W2_A10333Ft_it9[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it9");
               GXutil.writeLogRaw("Old: ",Z10333Ft_it9);
               GXutil.writeLogRaw("Current: ",T017W2_A10333Ft_it9[0]);
            }
            if ( GXutil.strcmp(Z10334Ft_it10, T017W2_A10334Ft_it10[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it10");
               GXutil.writeLogRaw("Old: ",Z10334Ft_it10);
               GXutil.writeLogRaw("Current: ",T017W2_A10334Ft_it10[0]);
            }
            if ( GXutil.strcmp(Z10335Ft_it11, T017W2_A10335Ft_it11[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it11");
               GXutil.writeLogRaw("Old: ",Z10335Ft_it11);
               GXutil.writeLogRaw("Current: ",T017W2_A10335Ft_it11[0]);
            }
            if ( GXutil.strcmp(Z10336Ft_it12, T017W2_A10336Ft_it12[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it12");
               GXutil.writeLogRaw("Old: ",Z10336Ft_it12);
               GXutil.writeLogRaw("Current: ",T017W2_A10336Ft_it12[0]);
            }
            if ( GXutil.strcmp(Z10337Ft_it13, T017W2_A10337Ft_it13[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it13");
               GXutil.writeLogRaw("Old: ",Z10337Ft_it13);
               GXutil.writeLogRaw("Current: ",T017W2_A10337Ft_it13[0]);
            }
            if ( GXutil.strcmp(Z10338Ft_it14, T017W2_A10338Ft_it14[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it14");
               GXutil.writeLogRaw("Old: ",Z10338Ft_it14);
               GXutil.writeLogRaw("Current: ",T017W2_A10338Ft_it14[0]);
            }
            if ( GXutil.strcmp(Z10339Ft_it15, T017W2_A10339Ft_it15[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it15");
               GXutil.writeLogRaw("Old: ",Z10339Ft_it15);
               GXutil.writeLogRaw("Current: ",T017W2_A10339Ft_it15[0]);
            }
            if ( GXutil.strcmp(Z10340Ft_it16, T017W2_A10340Ft_it16[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it16");
               GXutil.writeLogRaw("Old: ",Z10340Ft_it16);
               GXutil.writeLogRaw("Current: ",T017W2_A10340Ft_it16[0]);
            }
            if ( GXutil.strcmp(Z10341Ft_it17, T017W2_A10341Ft_it17[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it17");
               GXutil.writeLogRaw("Old: ",Z10341Ft_it17);
               GXutil.writeLogRaw("Current: ",T017W2_A10341Ft_it17[0]);
            }
            if ( GXutil.strcmp(Z10342Ft_it18, T017W2_A10342Ft_it18[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it18");
               GXutil.writeLogRaw("Old: ",Z10342Ft_it18);
               GXutil.writeLogRaw("Current: ",T017W2_A10342Ft_it18[0]);
            }
            if ( GXutil.strcmp(Z10343Ft_it19, T017W2_A10343Ft_it19[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it19");
               GXutil.writeLogRaw("Old: ",Z10343Ft_it19);
               GXutil.writeLogRaw("Current: ",T017W2_A10343Ft_it19[0]);
            }
            if ( GXutil.strcmp(Z10344Ft_it20, T017W2_A10344Ft_it20[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it20");
               GXutil.writeLogRaw("Old: ",Z10344Ft_it20);
               GXutil.writeLogRaw("Current: ",T017W2_A10344Ft_it20[0]);
            }
            if ( GXutil.strcmp(Z10345Ft_it21, T017W2_A10345Ft_it21[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it21");
               GXutil.writeLogRaw("Old: ",Z10345Ft_it21);
               GXutil.writeLogRaw("Current: ",T017W2_A10345Ft_it21[0]);
            }
            if ( GXutil.strcmp(Z10346Ft_it22, T017W2_A10346Ft_it22[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it22");
               GXutil.writeLogRaw("Old: ",Z10346Ft_it22);
               GXutil.writeLogRaw("Current: ",T017W2_A10346Ft_it22[0]);
            }
            if ( GXutil.strcmp(Z10347Ft_it23, T017W2_A10347Ft_it23[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it23");
               GXutil.writeLogRaw("Old: ",Z10347Ft_it23);
               GXutil.writeLogRaw("Current: ",T017W2_A10347Ft_it23[0]);
            }
            if ( GXutil.strcmp(Z10348Ft_it24, T017W2_A10348Ft_it24[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it24");
               GXutil.writeLogRaw("Old: ",Z10348Ft_it24);
               GXutil.writeLogRaw("Current: ",T017W2_A10348Ft_it24[0]);
            }
            if ( GXutil.strcmp(Z10349Ft_it25, T017W2_A10349Ft_it25[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it25");
               GXutil.writeLogRaw("Old: ",Z10349Ft_it25);
               GXutil.writeLogRaw("Current: ",T017W2_A10349Ft_it25[0]);
            }
            if ( GXutil.strcmp(Z10350Ft_it26, T017W2_A10350Ft_it26[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it26");
               GXutil.writeLogRaw("Old: ",Z10350Ft_it26);
               GXutil.writeLogRaw("Current: ",T017W2_A10350Ft_it26[0]);
            }
            if ( GXutil.strcmp(Z10351Ft_it27, T017W2_A10351Ft_it27[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it27");
               GXutil.writeLogRaw("Old: ",Z10351Ft_it27);
               GXutil.writeLogRaw("Current: ",T017W2_A10351Ft_it27[0]);
            }
            if ( GXutil.strcmp(Z10352Ft_it28, T017W2_A10352Ft_it28[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it28");
               GXutil.writeLogRaw("Old: ",Z10352Ft_it28);
               GXutil.writeLogRaw("Current: ",T017W2_A10352Ft_it28[0]);
            }
            if ( GXutil.strcmp(Z10353Ft_it29, T017W2_A10353Ft_it29[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it29");
               GXutil.writeLogRaw("Old: ",Z10353Ft_it29);
               GXutil.writeLogRaw("Current: ",T017W2_A10353Ft_it29[0]);
            }
            if ( GXutil.strcmp(Z10354Ft_it30, T017W2_A10354Ft_it30[0]) != 0 )
            {
               GXutil.writeLogln("ttr0600:[seudo value changed for attri]"+"Ft_it30");
               GXutil.writeLogRaw("Old: ",Z10354Ft_it30);
               GXutil.writeLogRaw("Current: ",T017W2_A10354Ft_it30[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0600"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17W1402( )
   {
      beforeValidate17W1402( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17W1402( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17W1402( 0) ;
         checkOptimisticConcurrency17W1402( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17W1402( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17W1402( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017W10 */
                  pr_default.execute(8, new Object[] {A10323Ft_Cod, Boolean.valueOf(n10324Ft_dsc), A10324Ft_dsc, Boolean.valueOf(n10325Ft_it1), A10325Ft_it1, Boolean.valueOf(n10326Ft_it2), A10326Ft_it2, Boolean.valueOf(n10327Ft_it3), A10327Ft_it3, Boolean.valueOf(n10328Ft_it4), A10328Ft_it4, Boolean.valueOf(n10329Ft_it5), A10329Ft_it5, Boolean.valueOf(n10330Ft_it6), A10330Ft_it6, Boolean.valueOf(n10331Ft_it7), A10331Ft_it7, Boolean.valueOf(n10332Ft_it8), A10332Ft_it8, Boolean.valueOf(n10333Ft_it9), A10333Ft_it9, Boolean.valueOf(n10334Ft_it10), A10334Ft_it10, Boolean.valueOf(n10335Ft_it11), A10335Ft_it11, Boolean.valueOf(n10336Ft_it12), A10336Ft_it12, Boolean.valueOf(n10337Ft_it13), A10337Ft_it13, Boolean.valueOf(n10338Ft_it14), A10338Ft_it14, Boolean.valueOf(n10339Ft_it15), A10339Ft_it15, Boolean.valueOf(n10340Ft_it16), A10340Ft_it16, Boolean.valueOf(n10341Ft_it17), A10341Ft_it17, Boolean.valueOf(n10342Ft_it18), A10342Ft_it18, Boolean.valueOf(n10343Ft_it19), A10343Ft_it19, Boolean.valueOf(n10344Ft_it20), A10344Ft_it20, Boolean.valueOf(n10345Ft_it21), A10345Ft_it21, Boolean.valueOf(n10346Ft_it22), A10346Ft_it22, Boolean.valueOf(n10347Ft_it23), A10347Ft_it23, Boolean.valueOf(n10348Ft_it24), A10348Ft_it24, Boolean.valueOf(n10349Ft_it25), A10349Ft_it25, Boolean.valueOf(n10350Ft_it26), A10350Ft_it26, Boolean.valueOf(n10351Ft_it27), A10351Ft_it27, Boolean.valueOf(n10352Ft_it28), A10352Ft_it28, Boolean.valueOf(n10353Ft_it29), A10353Ft_it29, Boolean.valueOf(n10354Ft_it30), A10354Ft_it30, A396EmprCod, Short.valueOf(A10301Cod_pais)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0600");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption17W0( ) ;
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
            load17W1402( ) ;
         }
         endLevel17W1402( ) ;
      }
      closeExtendedTableCursors17W1402( ) ;
   }

   public void update17W1402( )
   {
      beforeValidate17W1402( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17W1402( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17W1402( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17W1402( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17W1402( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017W11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n10324Ft_dsc), A10324Ft_dsc, Boolean.valueOf(n10325Ft_it1), A10325Ft_it1, Boolean.valueOf(n10326Ft_it2), A10326Ft_it2, Boolean.valueOf(n10327Ft_it3), A10327Ft_it3, Boolean.valueOf(n10328Ft_it4), A10328Ft_it4, Boolean.valueOf(n10329Ft_it5), A10329Ft_it5, Boolean.valueOf(n10330Ft_it6), A10330Ft_it6, Boolean.valueOf(n10331Ft_it7), A10331Ft_it7, Boolean.valueOf(n10332Ft_it8), A10332Ft_it8, Boolean.valueOf(n10333Ft_it9), A10333Ft_it9, Boolean.valueOf(n10334Ft_it10), A10334Ft_it10, Boolean.valueOf(n10335Ft_it11), A10335Ft_it11, Boolean.valueOf(n10336Ft_it12), A10336Ft_it12, Boolean.valueOf(n10337Ft_it13), A10337Ft_it13, Boolean.valueOf(n10338Ft_it14), A10338Ft_it14, Boolean.valueOf(n10339Ft_it15), A10339Ft_it15, Boolean.valueOf(n10340Ft_it16), A10340Ft_it16, Boolean.valueOf(n10341Ft_it17), A10341Ft_it17, Boolean.valueOf(n10342Ft_it18), A10342Ft_it18, Boolean.valueOf(n10343Ft_it19), A10343Ft_it19, Boolean.valueOf(n10344Ft_it20), A10344Ft_it20, Boolean.valueOf(n10345Ft_it21), A10345Ft_it21, Boolean.valueOf(n10346Ft_it22), A10346Ft_it22, Boolean.valueOf(n10347Ft_it23), A10347Ft_it23, Boolean.valueOf(n10348Ft_it24), A10348Ft_it24, Boolean.valueOf(n10349Ft_it25), A10349Ft_it25, Boolean.valueOf(n10350Ft_it26), A10350Ft_it26, Boolean.valueOf(n10351Ft_it27), A10351Ft_it27, Boolean.valueOf(n10352Ft_it28), A10352Ft_it28, Boolean.valueOf(n10353Ft_it29), A10353Ft_it29, Boolean.valueOf(n10354Ft_it30), A10354Ft_it30, A396EmprCod, Short.valueOf(A10301Cod_pais), A10323Ft_Cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0600");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0600"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17W1402( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17W0( ) ;
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
         endLevel17W1402( ) ;
      }
      closeExtendedTableCursors17W1402( ) ;
   }

   public void deferredUpdate17W1402( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17W1402( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17W1402( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17W1402( ) ;
         afterConfirm17W1402( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17W1402( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017W12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais), A10323Ft_Cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0600");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1402 == 0 )
                     {
                        initAll17W1402( ) ;
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
                     resetCaption17W0( ) ;
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
      sMode1402 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17W1402( ) ;
      Gx_mode = sMode1402 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17W1402( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17W1402( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17W1402( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0600");
         if ( AnyError == 0 )
         {
            confirmValues17W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0600");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17W1402( )
   {
      /* Scan By routine */
      /* Using cursor T017W13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais)});
      RcdFound1402 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1402 = (short)(1) ;
         A10323Ft_Cod = T017W13_A10323Ft_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17W1402( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1402 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1402 = (short)(1) ;
         A10323Ft_Cod = T017W13_A10323Ft_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
      }
   }

   public void scanEnd17W1402( )
   {
      pr_default.close(11);
   }

   public void afterConfirm17W1402( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17W1402( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17W1402( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17W1402( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17W1402( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17W1402( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17W1402( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCod_pais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_pais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_pais_Enabled), 5, 0), true);
      edtDsc_pais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDsc_pais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_pais_Enabled), 5, 0), true);
      edtFt_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_Cod_Enabled), 5, 0), true);
      edtFt_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_dsc_Enabled), 5, 0), true);
      edtFt_it1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it1_Enabled), 5, 0), true);
      edtFt_it2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it2_Enabled), 5, 0), true);
      edtFt_it3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it3_Enabled), 5, 0), true);
      edtFt_it4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it4_Enabled), 5, 0), true);
      edtFt_it5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it5_Enabled), 5, 0), true);
      edtFt_it6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it6_Enabled), 5, 0), true);
      edtFt_it7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it7_Enabled), 5, 0), true);
      edtFt_it8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it8_Enabled), 5, 0), true);
      edtFt_it9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it9_Enabled), 5, 0), true);
      edtFt_it10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it10_Enabled), 5, 0), true);
      edtFt_it11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it11_Enabled), 5, 0), true);
      edtFt_it12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it12_Enabled), 5, 0), true);
      edtFt_it13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it13_Enabled), 5, 0), true);
      edtFt_it14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it14_Enabled), 5, 0), true);
      edtFt_it15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it15_Enabled), 5, 0), true);
      edtFt_it16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it16_Enabled), 5, 0), true);
      edtFt_it17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it17_Enabled), 5, 0), true);
      edtFt_it18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it18_Enabled), 5, 0), true);
      edtFt_it19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it19_Enabled), 5, 0), true);
      edtFt_it20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it20_Enabled), 5, 0), true);
      edtFt_it21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it21_Enabled), 5, 0), true);
      edtFt_it22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it22_Enabled), 5, 0), true);
      edtFt_it23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it23_Enabled), 5, 0), true);
      edtFt_it24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it24_Enabled), 5, 0), true);
      edtFt_it25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it25_Enabled), 5, 0), true);
      edtFt_it26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it26_Enabled), 5, 0), true);
      edtFt_it27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it27_Enabled), 5, 0), true);
      edtFt_it28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it28_Enabled), 5, 0), true);
      edtFt_it29_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it29_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it29_Enabled), 5, 0), true);
      edtFt_it30_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_it30_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_it30_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17W1402( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17W0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0600", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10301Cod_pais,4,0))}, new String[] {"EmprCod","Cod_pais"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10301Cod_pais", GXutil.ltrim( localUtil.ntoc( Z10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10323Ft_Cod", GXutil.rtrim( Z10323Ft_Cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10324Ft_dsc", GXutil.rtrim( Z10324Ft_dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10325Ft_it1", GXutil.rtrim( Z10325Ft_it1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10326Ft_it2", GXutil.rtrim( Z10326Ft_it2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10327Ft_it3", GXutil.rtrim( Z10327Ft_it3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10328Ft_it4", GXutil.rtrim( Z10328Ft_it4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10329Ft_it5", GXutil.rtrim( Z10329Ft_it5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10330Ft_it6", GXutil.rtrim( Z10330Ft_it6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10331Ft_it7", GXutil.rtrim( Z10331Ft_it7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10332Ft_it8", GXutil.rtrim( Z10332Ft_it8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10333Ft_it9", GXutil.rtrim( Z10333Ft_it9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10334Ft_it10", GXutil.rtrim( Z10334Ft_it10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10335Ft_it11", GXutil.rtrim( Z10335Ft_it11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10336Ft_it12", GXutil.rtrim( Z10336Ft_it12));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10337Ft_it13", GXutil.rtrim( Z10337Ft_it13));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10338Ft_it14", GXutil.rtrim( Z10338Ft_it14));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10339Ft_it15", GXutil.rtrim( Z10339Ft_it15));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10340Ft_it16", GXutil.rtrim( Z10340Ft_it16));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10341Ft_it17", GXutil.rtrim( Z10341Ft_it17));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10342Ft_it18", GXutil.rtrim( Z10342Ft_it18));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10343Ft_it19", GXutil.rtrim( Z10343Ft_it19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10344Ft_it20", GXutil.rtrim( Z10344Ft_it20));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10345Ft_it21", GXutil.rtrim( Z10345Ft_it21));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10346Ft_it22", GXutil.rtrim( Z10346Ft_it22));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10347Ft_it23", GXutil.rtrim( Z10347Ft_it23));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10348Ft_it24", GXutil.rtrim( Z10348Ft_it24));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10349Ft_it25", GXutil.rtrim( Z10349Ft_it25));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10350Ft_it26", GXutil.rtrim( Z10350Ft_it26));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10351Ft_it27", GXutil.rtrim( Z10351Ft_it27));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10352Ft_it28", GXutil.rtrim( Z10352Ft_it28));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10353Ft_it29", GXutil.rtrim( Z10353Ft_it29));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10354Ft_it30", GXutil.rtrim( Z10354Ft_it30));
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
      return formatLink("app.ttr0600", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10301Cod_pais,4,0))}, new String[] {"EmprCod","Cod_pais"})  ;
   }

   public String getPgmname( )
   {
      return "TTR0600" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FORMATOS POR PAISES", "") ;
   }

   public void initializeNonKey17W1402( )
   {
      A10324Ft_dsc = "" ;
      n10324Ft_dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10324Ft_dsc", A10324Ft_dsc);
      A10325Ft_it1 = "" ;
      n10325Ft_it1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10325Ft_it1", A10325Ft_it1);
      A10326Ft_it2 = "" ;
      n10326Ft_it2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10326Ft_it2", A10326Ft_it2);
      A10327Ft_it3 = "" ;
      n10327Ft_it3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10327Ft_it3", A10327Ft_it3);
      A10328Ft_it4 = "" ;
      n10328Ft_it4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10328Ft_it4", A10328Ft_it4);
      A10329Ft_it5 = "" ;
      n10329Ft_it5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10329Ft_it5", A10329Ft_it5);
      A10330Ft_it6 = "" ;
      n10330Ft_it6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10330Ft_it6", A10330Ft_it6);
      A10331Ft_it7 = "" ;
      n10331Ft_it7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10331Ft_it7", A10331Ft_it7);
      A10332Ft_it8 = "" ;
      n10332Ft_it8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10332Ft_it8", A10332Ft_it8);
      A10333Ft_it9 = "" ;
      n10333Ft_it9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10333Ft_it9", A10333Ft_it9);
      A10334Ft_it10 = "" ;
      n10334Ft_it10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10334Ft_it10", A10334Ft_it10);
      A10335Ft_it11 = "" ;
      n10335Ft_it11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10335Ft_it11", A10335Ft_it11);
      A10336Ft_it12 = "" ;
      n10336Ft_it12 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10336Ft_it12", A10336Ft_it12);
      A10337Ft_it13 = "" ;
      n10337Ft_it13 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10337Ft_it13", A10337Ft_it13);
      A10338Ft_it14 = "" ;
      n10338Ft_it14 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10338Ft_it14", A10338Ft_it14);
      A10339Ft_it15 = "" ;
      n10339Ft_it15 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10339Ft_it15", A10339Ft_it15);
      A10340Ft_it16 = "" ;
      n10340Ft_it16 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10340Ft_it16", A10340Ft_it16);
      A10341Ft_it17 = "" ;
      n10341Ft_it17 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10341Ft_it17", A10341Ft_it17);
      A10342Ft_it18 = "" ;
      n10342Ft_it18 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10342Ft_it18", A10342Ft_it18);
      A10343Ft_it19 = "" ;
      n10343Ft_it19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10343Ft_it19", A10343Ft_it19);
      A10344Ft_it20 = "" ;
      n10344Ft_it20 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10344Ft_it20", A10344Ft_it20);
      A10345Ft_it21 = "" ;
      n10345Ft_it21 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10345Ft_it21", A10345Ft_it21);
      A10346Ft_it22 = "" ;
      n10346Ft_it22 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10346Ft_it22", A10346Ft_it22);
      A10347Ft_it23 = "" ;
      n10347Ft_it23 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10347Ft_it23", A10347Ft_it23);
      A10348Ft_it24 = "" ;
      n10348Ft_it24 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10348Ft_it24", A10348Ft_it24);
      A10349Ft_it25 = "" ;
      n10349Ft_it25 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10349Ft_it25", A10349Ft_it25);
      A10350Ft_it26 = "" ;
      n10350Ft_it26 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10350Ft_it26", A10350Ft_it26);
      A10351Ft_it27 = "" ;
      n10351Ft_it27 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10351Ft_it27", A10351Ft_it27);
      A10352Ft_it28 = "" ;
      n10352Ft_it28 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10352Ft_it28", A10352Ft_it28);
      A10353Ft_it29 = "" ;
      n10353Ft_it29 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10353Ft_it29", A10353Ft_it29);
      A10354Ft_it30 = "" ;
      n10354Ft_it30 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10354Ft_it30", A10354Ft_it30);
      Z10324Ft_dsc = "" ;
      Z10325Ft_it1 = "" ;
      Z10326Ft_it2 = "" ;
      Z10327Ft_it3 = "" ;
      Z10328Ft_it4 = "" ;
      Z10329Ft_it5 = "" ;
      Z10330Ft_it6 = "" ;
      Z10331Ft_it7 = "" ;
      Z10332Ft_it8 = "" ;
      Z10333Ft_it9 = "" ;
      Z10334Ft_it10 = "" ;
      Z10335Ft_it11 = "" ;
      Z10336Ft_it12 = "" ;
      Z10337Ft_it13 = "" ;
      Z10338Ft_it14 = "" ;
      Z10339Ft_it15 = "" ;
      Z10340Ft_it16 = "" ;
      Z10341Ft_it17 = "" ;
      Z10342Ft_it18 = "" ;
      Z10343Ft_it19 = "" ;
      Z10344Ft_it20 = "" ;
      Z10345Ft_it21 = "" ;
      Z10346Ft_it22 = "" ;
      Z10347Ft_it23 = "" ;
      Z10348Ft_it24 = "" ;
      Z10349Ft_it25 = "" ;
      Z10350Ft_it26 = "" ;
      Z10351Ft_it27 = "" ;
      Z10352Ft_it28 = "" ;
      Z10353Ft_it29 = "" ;
      Z10354Ft_it30 = "" ;
   }

   public void initAll17W1402( )
   {
      A10323Ft_Cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10323Ft_Cod", A10323Ft_Cod);
      initializeNonKey17W1402( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241552485", true, true);
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
      httpContext.AddJavascriptSource("ttr0600.js", "?20268241552485", false, true);
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
      edtCod_pais_Internalname = "COD_PAIS" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDsc_pais_Internalname = "DSC_PAIS" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtFt_Cod_Internalname = "FT_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtFt_dsc_Internalname = "FT_DSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFt_it1_Internalname = "FT_IT1" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFt_it2_Internalname = "FT_IT2" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFt_it3_Internalname = "FT_IT3" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFt_it4_Internalname = "FT_IT4" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFt_it5_Internalname = "FT_IT5" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtFt_it6_Internalname = "FT_IT6" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtFt_it7_Internalname = "FT_IT7" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtFt_it8_Internalname = "FT_IT8" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtFt_it9_Internalname = "FT_IT9" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtFt_it10_Internalname = "FT_IT10" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtFt_it11_Internalname = "FT_IT11" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtFt_it12_Internalname = "FT_IT12" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtFt_it13_Internalname = "FT_IT13" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtFt_it14_Internalname = "FT_IT14" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtFt_it15_Internalname = "FT_IT15" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtFt_it16_Internalname = "FT_IT16" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtFt_it17_Internalname = "FT_IT17" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtFt_it18_Internalname = "FT_IT18" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtFt_it19_Internalname = "FT_IT19" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtFt_it20_Internalname = "FT_IT20" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtFt_it21_Internalname = "FT_IT21" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtFt_it22_Internalname = "FT_IT22" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtFt_it23_Internalname = "FT_IT23" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtFt_it24_Internalname = "FT_IT24" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtFt_it25_Internalname = "FT_IT25" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtFt_it26_Internalname = "FT_IT26" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtFt_it27_Internalname = "FT_IT27" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtFt_it28_Internalname = "FT_IT28" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtFt_it29_Internalname = "FT_IT29" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtFt_it30_Internalname = "FT_IT30" ;
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
      Form.setCaption( httpContext.getMessage( "FORMATOS POR PAISES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFt_it30_Jsonclick = "" ;
      edtFt_it30_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it30_Enabled = 1 ;
      edtFt_it29_Jsonclick = "" ;
      edtFt_it29_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it29_Enabled = 1 ;
      edtFt_it28_Jsonclick = "" ;
      edtFt_it28_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it28_Enabled = 1 ;
      edtFt_it27_Jsonclick = "" ;
      edtFt_it27_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it27_Enabled = 1 ;
      edtFt_it26_Jsonclick = "" ;
      edtFt_it26_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it26_Enabled = 1 ;
      edtFt_it25_Jsonclick = "" ;
      edtFt_it25_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it25_Enabled = 1 ;
      edtFt_it24_Jsonclick = "" ;
      edtFt_it24_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it24_Enabled = 1 ;
      edtFt_it23_Jsonclick = "" ;
      edtFt_it23_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it23_Enabled = 1 ;
      edtFt_it22_Jsonclick = "" ;
      edtFt_it22_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it22_Enabled = 1 ;
      edtFt_it21_Jsonclick = "" ;
      edtFt_it21_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it21_Enabled = 1 ;
      edtFt_it20_Jsonclick = "" ;
      edtFt_it20_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it20_Enabled = 1 ;
      edtFt_it19_Jsonclick = "" ;
      edtFt_it19_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it19_Enabled = 1 ;
      edtFt_it18_Jsonclick = "" ;
      edtFt_it18_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it18_Enabled = 1 ;
      edtFt_it17_Jsonclick = "" ;
      edtFt_it17_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it17_Enabled = 1 ;
      edtFt_it16_Jsonclick = "" ;
      edtFt_it16_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it16_Enabled = 1 ;
      edtFt_it15_Jsonclick = "" ;
      edtFt_it15_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it15_Enabled = 1 ;
      edtFt_it14_Jsonclick = "" ;
      edtFt_it14_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it14_Enabled = 1 ;
      edtFt_it13_Jsonclick = "" ;
      edtFt_it13_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it13_Enabled = 1 ;
      edtFt_it12_Jsonclick = "" ;
      edtFt_it12_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it12_Enabled = 1 ;
      edtFt_it11_Jsonclick = "" ;
      edtFt_it11_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it11_Enabled = 1 ;
      edtFt_it10_Jsonclick = "" ;
      edtFt_it10_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it10_Enabled = 1 ;
      edtFt_it9_Jsonclick = "" ;
      edtFt_it9_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it9_Enabled = 1 ;
      edtFt_it8_Jsonclick = "" ;
      edtFt_it8_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it8_Enabled = 1 ;
      edtFt_it7_Jsonclick = "" ;
      edtFt_it7_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it7_Enabled = 1 ;
      edtFt_it6_Jsonclick = "" ;
      edtFt_it6_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it6_Enabled = 1 ;
      edtFt_it5_Jsonclick = "" ;
      edtFt_it5_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it5_Enabled = 1 ;
      edtFt_it4_Jsonclick = "" ;
      edtFt_it4_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it4_Enabled = 1 ;
      edtFt_it3_Jsonclick = "" ;
      edtFt_it3_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it3_Enabled = 1 ;
      edtFt_it2_Jsonclick = "" ;
      edtFt_it2_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it2_Enabled = 1 ;
      edtFt_it1_Jsonclick = "" ;
      edtFt_it1_Backcolor = (int)(0xFFFFFF) ;
      edtFt_it1_Enabled = 1 ;
      edtFt_dsc_Jsonclick = "" ;
      edtFt_dsc_Backcolor = (int)(0xFFFFFF) ;
      edtFt_dsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFt_Cod_Jsonclick = "" ;
      edtFt_Cod_Backcolor = (int)(0xFFFFFF) ;
      edtFt_Cod_Enabled = 1 ;
      edtDsc_pais_Jsonclick = "" ;
      edtDsc_pais_Backcolor = (int)(0xFFFFFF) ;
      edtDsc_pais_Enabled = 0 ;
      edtCod_pais_Jsonclick = "" ;
      edtCod_pais_Backcolor = (int)(0xFFFFFF) ;
      edtCod_pais_Enabled = 0 ;
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
      /* Using cursor T017W14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017W14_A407EmprNom[0] ;
      n407EmprNom = T017W14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      /* Using cursor T017W15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A10301Cod_pais)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0400", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_PAIS");
         AnyError = (short)(1) ;
      }
      A10302Dsc_pais = T017W15_A10302Dsc_pais[0] ;
      n10302Dsc_pais = T017W15_n10302Dsc_pais[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", A10302Dsc_pais);
      pr_default.close(13);
      GX_FocusControl = edtFt_dsc_Internalname ;
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

   public void valid_Ft_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10302Dsc_pais", GXutil.rtrim( A10302Dsc_pais));
      httpContext.ajax_rsp_assign_attri("", false, "A10324Ft_dsc", GXutil.rtrim( A10324Ft_dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10325Ft_it1", GXutil.rtrim( A10325Ft_it1));
      httpContext.ajax_rsp_assign_attri("", false, "A10326Ft_it2", GXutil.rtrim( A10326Ft_it2));
      httpContext.ajax_rsp_assign_attri("", false, "A10327Ft_it3", GXutil.rtrim( A10327Ft_it3));
      httpContext.ajax_rsp_assign_attri("", false, "A10328Ft_it4", GXutil.rtrim( A10328Ft_it4));
      httpContext.ajax_rsp_assign_attri("", false, "A10329Ft_it5", GXutil.rtrim( A10329Ft_it5));
      httpContext.ajax_rsp_assign_attri("", false, "A10330Ft_it6", GXutil.rtrim( A10330Ft_it6));
      httpContext.ajax_rsp_assign_attri("", false, "A10331Ft_it7", GXutil.rtrim( A10331Ft_it7));
      httpContext.ajax_rsp_assign_attri("", false, "A10332Ft_it8", GXutil.rtrim( A10332Ft_it8));
      httpContext.ajax_rsp_assign_attri("", false, "A10333Ft_it9", GXutil.rtrim( A10333Ft_it9));
      httpContext.ajax_rsp_assign_attri("", false, "A10334Ft_it10", GXutil.rtrim( A10334Ft_it10));
      httpContext.ajax_rsp_assign_attri("", false, "A10335Ft_it11", GXutil.rtrim( A10335Ft_it11));
      httpContext.ajax_rsp_assign_attri("", false, "A10336Ft_it12", GXutil.rtrim( A10336Ft_it12));
      httpContext.ajax_rsp_assign_attri("", false, "A10337Ft_it13", GXutil.rtrim( A10337Ft_it13));
      httpContext.ajax_rsp_assign_attri("", false, "A10338Ft_it14", GXutil.rtrim( A10338Ft_it14));
      httpContext.ajax_rsp_assign_attri("", false, "A10339Ft_it15", GXutil.rtrim( A10339Ft_it15));
      httpContext.ajax_rsp_assign_attri("", false, "A10340Ft_it16", GXutil.rtrim( A10340Ft_it16));
      httpContext.ajax_rsp_assign_attri("", false, "A10341Ft_it17", GXutil.rtrim( A10341Ft_it17));
      httpContext.ajax_rsp_assign_attri("", false, "A10342Ft_it18", GXutil.rtrim( A10342Ft_it18));
      httpContext.ajax_rsp_assign_attri("", false, "A10343Ft_it19", GXutil.rtrim( A10343Ft_it19));
      httpContext.ajax_rsp_assign_attri("", false, "A10344Ft_it20", GXutil.rtrim( A10344Ft_it20));
      httpContext.ajax_rsp_assign_attri("", false, "A10345Ft_it21", GXutil.rtrim( A10345Ft_it21));
      httpContext.ajax_rsp_assign_attri("", false, "A10346Ft_it22", GXutil.rtrim( A10346Ft_it22));
      httpContext.ajax_rsp_assign_attri("", false, "A10347Ft_it23", GXutil.rtrim( A10347Ft_it23));
      httpContext.ajax_rsp_assign_attri("", false, "A10348Ft_it24", GXutil.rtrim( A10348Ft_it24));
      httpContext.ajax_rsp_assign_attri("", false, "A10349Ft_it25", GXutil.rtrim( A10349Ft_it25));
      httpContext.ajax_rsp_assign_attri("", false, "A10350Ft_it26", GXutil.rtrim( A10350Ft_it26));
      httpContext.ajax_rsp_assign_attri("", false, "A10351Ft_it27", GXutil.rtrim( A10351Ft_it27));
      httpContext.ajax_rsp_assign_attri("", false, "A10352Ft_it28", GXutil.rtrim( A10352Ft_it28));
      httpContext.ajax_rsp_assign_attri("", false, "A10353Ft_it29", GXutil.rtrim( A10353Ft_it29));
      httpContext.ajax_rsp_assign_attri("", false, "A10354Ft_it30", GXutil.rtrim( A10354Ft_it30));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10301Cod_pais", GXutil.ltrim( localUtil.ntoc( Z10301Cod_pais, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10323Ft_Cod", GXutil.rtrim( Z10323Ft_Cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10302Dsc_pais", GXutil.rtrim( Z10302Dsc_pais));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10324Ft_dsc", GXutil.rtrim( Z10324Ft_dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10325Ft_it1", GXutil.rtrim( Z10325Ft_it1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10326Ft_it2", GXutil.rtrim( Z10326Ft_it2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10327Ft_it3", GXutil.rtrim( Z10327Ft_it3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10328Ft_it4", GXutil.rtrim( Z10328Ft_it4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10329Ft_it5", GXutil.rtrim( Z10329Ft_it5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10330Ft_it6", GXutil.rtrim( Z10330Ft_it6));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10331Ft_it7", GXutil.rtrim( Z10331Ft_it7));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10332Ft_it8", GXutil.rtrim( Z10332Ft_it8));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10333Ft_it9", GXutil.rtrim( Z10333Ft_it9));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10334Ft_it10", GXutil.rtrim( Z10334Ft_it10));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10335Ft_it11", GXutil.rtrim( Z10335Ft_it11));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10336Ft_it12", GXutil.rtrim( Z10336Ft_it12));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10337Ft_it13", GXutil.rtrim( Z10337Ft_it13));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10338Ft_it14", GXutil.rtrim( Z10338Ft_it14));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10339Ft_it15", GXutil.rtrim( Z10339Ft_it15));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10340Ft_it16", GXutil.rtrim( Z10340Ft_it16));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10341Ft_it17", GXutil.rtrim( Z10341Ft_it17));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10342Ft_it18", GXutil.rtrim( Z10342Ft_it18));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10343Ft_it19", GXutil.rtrim( Z10343Ft_it19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10344Ft_it20", GXutil.rtrim( Z10344Ft_it20));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10345Ft_it21", GXutil.rtrim( Z10345Ft_it21));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10346Ft_it22", GXutil.rtrim( Z10346Ft_it22));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10347Ft_it23", GXutil.rtrim( Z10347Ft_it23));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10348Ft_it24", GXutil.rtrim( Z10348Ft_it24));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10349Ft_it25", GXutil.rtrim( Z10349Ft_it25));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10350Ft_it26", GXutil.rtrim( Z10350Ft_it26));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10351Ft_it27", GXutil.rtrim( Z10351Ft_it27));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10352Ft_it28", GXutil.rtrim( Z10352Ft_it28));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10353Ft_it29", GXutil.rtrim( Z10353Ft_it29));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10354Ft_it30", GXutil.rtrim( Z10354Ft_it30));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_COD_PAIS","{handler:'valid_Cod_pais',iparms:[]");
      setEventMetadata("VALID_COD_PAIS",",oparms:[]}");
      setEventMetadata("VALID_FT_COD","{handler:'valid_Ft_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'},{av:'A10323Ft_Cod',fld:'FT_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FT_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10302Dsc_pais',fld:'DSC_PAIS',pic:''},{av:'A10324Ft_dsc',fld:'FT_DSC',pic:''},{av:'A10325Ft_it1',fld:'FT_IT1',pic:''},{av:'A10326Ft_it2',fld:'FT_IT2',pic:''},{av:'A10327Ft_it3',fld:'FT_IT3',pic:''},{av:'A10328Ft_it4',fld:'FT_IT4',pic:''},{av:'A10329Ft_it5',fld:'FT_IT5',pic:''},{av:'A10330Ft_it6',fld:'FT_IT6',pic:''},{av:'A10331Ft_it7',fld:'FT_IT7',pic:''},{av:'A10332Ft_it8',fld:'FT_IT8',pic:''},{av:'A10333Ft_it9',fld:'FT_IT9',pic:''},{av:'A10334Ft_it10',fld:'FT_IT10',pic:''},{av:'A10335Ft_it11',fld:'FT_IT11',pic:''},{av:'A10336Ft_it12',fld:'FT_IT12',pic:''},{av:'A10337Ft_it13',fld:'FT_IT13',pic:''},{av:'A10338Ft_it14',fld:'FT_IT14',pic:''},{av:'A10339Ft_it15',fld:'FT_IT15',pic:''},{av:'A10340Ft_it16',fld:'FT_IT16',pic:''},{av:'A10341Ft_it17',fld:'FT_IT17',pic:''},{av:'A10342Ft_it18',fld:'FT_IT18',pic:''},{av:'A10343Ft_it19',fld:'FT_IT19',pic:''},{av:'A10344Ft_it20',fld:'FT_IT20',pic:''},{av:'A10345Ft_it21',fld:'FT_IT21',pic:''},{av:'A10346Ft_it22',fld:'FT_IT22',pic:''},{av:'A10347Ft_it23',fld:'FT_IT23',pic:''},{av:'A10348Ft_it24',fld:'FT_IT24',pic:''},{av:'A10349Ft_it25',fld:'FT_IT25',pic:''},{av:'A10350Ft_it26',fld:'FT_IT26',pic:''},{av:'A10351Ft_it27',fld:'FT_IT27',pic:''},{av:'A10352Ft_it28',fld:'FT_IT28',pic:''},{av:'A10353Ft_it29',fld:'FT_IT29',pic:''},{av:'A10354Ft_it30',fld:'FT_IT30',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10301Cod_pais'},{av:'Z10323Ft_Cod'},{av:'Z407EmprNom'},{av:'Z10302Dsc_pais'},{av:'Z10324Ft_dsc'},{av:'Z10325Ft_it1'},{av:'Z10326Ft_it2'},{av:'Z10327Ft_it3'},{av:'Z10328Ft_it4'},{av:'Z10329Ft_it5'},{av:'Z10330Ft_it6'},{av:'Z10331Ft_it7'},{av:'Z10332Ft_it8'},{av:'Z10333Ft_it9'},{av:'Z10334Ft_it10'},{av:'Z10335Ft_it11'},{av:'Z10336Ft_it12'},{av:'Z10337Ft_it13'},{av:'Z10338Ft_it14'},{av:'Z10339Ft_it15'},{av:'Z10340Ft_it16'},{av:'Z10341Ft_it17'},{av:'Z10342Ft_it18'},{av:'Z10343Ft_it19'},{av:'Z10344Ft_it20'},{av:'Z10345Ft_it21'},{av:'Z10346Ft_it22'},{av:'Z10347Ft_it23'},{av:'Z10348Ft_it24'},{av:'Z10349Ft_it25'},{av:'Z10350Ft_it26'},{av:'Z10351Ft_it27'},{av:'Z10352Ft_it28'},{av:'Z10353Ft_it29'},{av:'Z10354Ft_it30'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(12);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z10323Ft_Cod = "" ;
      Z10324Ft_dsc = "" ;
      Z10325Ft_it1 = "" ;
      Z10326Ft_it2 = "" ;
      Z10327Ft_it3 = "" ;
      Z10328Ft_it4 = "" ;
      Z10329Ft_it5 = "" ;
      Z10330Ft_it6 = "" ;
      Z10331Ft_it7 = "" ;
      Z10332Ft_it8 = "" ;
      Z10333Ft_it9 = "" ;
      Z10334Ft_it10 = "" ;
      Z10335Ft_it11 = "" ;
      Z10336Ft_it12 = "" ;
      Z10337Ft_it13 = "" ;
      Z10338Ft_it14 = "" ;
      Z10339Ft_it15 = "" ;
      Z10340Ft_it16 = "" ;
      Z10341Ft_it17 = "" ;
      Z10342Ft_it18 = "" ;
      Z10343Ft_it19 = "" ;
      Z10344Ft_it20 = "" ;
      Z10345Ft_it21 = "" ;
      Z10346Ft_it22 = "" ;
      Z10347Ft_it23 = "" ;
      Z10348Ft_it24 = "" ;
      Z10349Ft_it25 = "" ;
      Z10350Ft_it26 = "" ;
      Z10351Ft_it27 = "" ;
      Z10352Ft_it28 = "" ;
      Z10353Ft_it29 = "" ;
      Z10354Ft_it30 = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      A10302Dsc_pais = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10323Ft_Cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10324Ft_dsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10325Ft_it1 = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10326Ft_it2 = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10327Ft_it3 = "" ;
      lblTextblock10_Jsonclick = "" ;
      A10328Ft_it4 = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10329Ft_it5 = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10330Ft_it6 = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10331Ft_it7 = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10332Ft_it8 = "" ;
      lblTextblock15_Jsonclick = "" ;
      A10333Ft_it9 = "" ;
      lblTextblock16_Jsonclick = "" ;
      A10334Ft_it10 = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10335Ft_it11 = "" ;
      lblTextblock18_Jsonclick = "" ;
      A10336Ft_it12 = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10337Ft_it13 = "" ;
      lblTextblock20_Jsonclick = "" ;
      A10338Ft_it14 = "" ;
      lblTextblock21_Jsonclick = "" ;
      A10339Ft_it15 = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10340Ft_it16 = "" ;
      lblTextblock23_Jsonclick = "" ;
      A10341Ft_it17 = "" ;
      lblTextblock24_Jsonclick = "" ;
      A10342Ft_it18 = "" ;
      lblTextblock25_Jsonclick = "" ;
      A10343Ft_it19 = "" ;
      lblTextblock26_Jsonclick = "" ;
      A10344Ft_it20 = "" ;
      lblTextblock27_Jsonclick = "" ;
      A10345Ft_it21 = "" ;
      lblTextblock28_Jsonclick = "" ;
      A10346Ft_it22 = "" ;
      lblTextblock29_Jsonclick = "" ;
      A10347Ft_it23 = "" ;
      lblTextblock30_Jsonclick = "" ;
      A10348Ft_it24 = "" ;
      lblTextblock31_Jsonclick = "" ;
      A10349Ft_it25 = "" ;
      lblTextblock32_Jsonclick = "" ;
      A10350Ft_it26 = "" ;
      lblTextblock33_Jsonclick = "" ;
      A10351Ft_it27 = "" ;
      lblTextblock34_Jsonclick = "" ;
      A10352Ft_it28 = "" ;
      lblTextblock35_Jsonclick = "" ;
      A10353Ft_it29 = "" ;
      lblTextblock36_Jsonclick = "" ;
      A10354Ft_it30 = "" ;
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
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z10302Dsc_pais = "" ;
      T017W4_A407EmprNom = new String[] {""} ;
      T017W4_n407EmprNom = new boolean[] {false} ;
      T017W5_A10302Dsc_pais = new String[] {""} ;
      T017W5_n10302Dsc_pais = new boolean[] {false} ;
      T017W6_A10323Ft_Cod = new String[] {""} ;
      T017W6_A407EmprNom = new String[] {""} ;
      T017W6_n407EmprNom = new boolean[] {false} ;
      T017W6_A10302Dsc_pais = new String[] {""} ;
      T017W6_n10302Dsc_pais = new boolean[] {false} ;
      T017W6_A10324Ft_dsc = new String[] {""} ;
      T017W6_n10324Ft_dsc = new boolean[] {false} ;
      T017W6_A10325Ft_it1 = new String[] {""} ;
      T017W6_n10325Ft_it1 = new boolean[] {false} ;
      T017W6_A10326Ft_it2 = new String[] {""} ;
      T017W6_n10326Ft_it2 = new boolean[] {false} ;
      T017W6_A10327Ft_it3 = new String[] {""} ;
      T017W6_n10327Ft_it3 = new boolean[] {false} ;
      T017W6_A10328Ft_it4 = new String[] {""} ;
      T017W6_n10328Ft_it4 = new boolean[] {false} ;
      T017W6_A10329Ft_it5 = new String[] {""} ;
      T017W6_n10329Ft_it5 = new boolean[] {false} ;
      T017W6_A10330Ft_it6 = new String[] {""} ;
      T017W6_n10330Ft_it6 = new boolean[] {false} ;
      T017W6_A10331Ft_it7 = new String[] {""} ;
      T017W6_n10331Ft_it7 = new boolean[] {false} ;
      T017W6_A10332Ft_it8 = new String[] {""} ;
      T017W6_n10332Ft_it8 = new boolean[] {false} ;
      T017W6_A10333Ft_it9 = new String[] {""} ;
      T017W6_n10333Ft_it9 = new boolean[] {false} ;
      T017W6_A10334Ft_it10 = new String[] {""} ;
      T017W6_n10334Ft_it10 = new boolean[] {false} ;
      T017W6_A10335Ft_it11 = new String[] {""} ;
      T017W6_n10335Ft_it11 = new boolean[] {false} ;
      T017W6_A10336Ft_it12 = new String[] {""} ;
      T017W6_n10336Ft_it12 = new boolean[] {false} ;
      T017W6_A10337Ft_it13 = new String[] {""} ;
      T017W6_n10337Ft_it13 = new boolean[] {false} ;
      T017W6_A10338Ft_it14 = new String[] {""} ;
      T017W6_n10338Ft_it14 = new boolean[] {false} ;
      T017W6_A10339Ft_it15 = new String[] {""} ;
      T017W6_n10339Ft_it15 = new boolean[] {false} ;
      T017W6_A10340Ft_it16 = new String[] {""} ;
      T017W6_n10340Ft_it16 = new boolean[] {false} ;
      T017W6_A10341Ft_it17 = new String[] {""} ;
      T017W6_n10341Ft_it17 = new boolean[] {false} ;
      T017W6_A10342Ft_it18 = new String[] {""} ;
      T017W6_n10342Ft_it18 = new boolean[] {false} ;
      T017W6_A10343Ft_it19 = new String[] {""} ;
      T017W6_n10343Ft_it19 = new boolean[] {false} ;
      T017W6_A10344Ft_it20 = new String[] {""} ;
      T017W6_n10344Ft_it20 = new boolean[] {false} ;
      T017W6_A10345Ft_it21 = new String[] {""} ;
      T017W6_n10345Ft_it21 = new boolean[] {false} ;
      T017W6_A10346Ft_it22 = new String[] {""} ;
      T017W6_n10346Ft_it22 = new boolean[] {false} ;
      T017W6_A10347Ft_it23 = new String[] {""} ;
      T017W6_n10347Ft_it23 = new boolean[] {false} ;
      T017W6_A10348Ft_it24 = new String[] {""} ;
      T017W6_n10348Ft_it24 = new boolean[] {false} ;
      T017W6_A10349Ft_it25 = new String[] {""} ;
      T017W6_n10349Ft_it25 = new boolean[] {false} ;
      T017W6_A10350Ft_it26 = new String[] {""} ;
      T017W6_n10350Ft_it26 = new boolean[] {false} ;
      T017W6_A10351Ft_it27 = new String[] {""} ;
      T017W6_n10351Ft_it27 = new boolean[] {false} ;
      T017W6_A10352Ft_it28 = new String[] {""} ;
      T017W6_n10352Ft_it28 = new boolean[] {false} ;
      T017W6_A10353Ft_it29 = new String[] {""} ;
      T017W6_n10353Ft_it29 = new boolean[] {false} ;
      T017W6_A10354Ft_it30 = new String[] {""} ;
      T017W6_n10354Ft_it30 = new boolean[] {false} ;
      T017W6_A396EmprCod = new String[] {""} ;
      T017W6_A10301Cod_pais = new short[1] ;
      T017W7_A396EmprCod = new String[] {""} ;
      T017W7_A10301Cod_pais = new short[1] ;
      T017W7_A10323Ft_Cod = new String[] {""} ;
      T017W3_A10323Ft_Cod = new String[] {""} ;
      T017W3_A10324Ft_dsc = new String[] {""} ;
      T017W3_n10324Ft_dsc = new boolean[] {false} ;
      T017W3_A10325Ft_it1 = new String[] {""} ;
      T017W3_n10325Ft_it1 = new boolean[] {false} ;
      T017W3_A10326Ft_it2 = new String[] {""} ;
      T017W3_n10326Ft_it2 = new boolean[] {false} ;
      T017W3_A10327Ft_it3 = new String[] {""} ;
      T017W3_n10327Ft_it3 = new boolean[] {false} ;
      T017W3_A10328Ft_it4 = new String[] {""} ;
      T017W3_n10328Ft_it4 = new boolean[] {false} ;
      T017W3_A10329Ft_it5 = new String[] {""} ;
      T017W3_n10329Ft_it5 = new boolean[] {false} ;
      T017W3_A10330Ft_it6 = new String[] {""} ;
      T017W3_n10330Ft_it6 = new boolean[] {false} ;
      T017W3_A10331Ft_it7 = new String[] {""} ;
      T017W3_n10331Ft_it7 = new boolean[] {false} ;
      T017W3_A10332Ft_it8 = new String[] {""} ;
      T017W3_n10332Ft_it8 = new boolean[] {false} ;
      T017W3_A10333Ft_it9 = new String[] {""} ;
      T017W3_n10333Ft_it9 = new boolean[] {false} ;
      T017W3_A10334Ft_it10 = new String[] {""} ;
      T017W3_n10334Ft_it10 = new boolean[] {false} ;
      T017W3_A10335Ft_it11 = new String[] {""} ;
      T017W3_n10335Ft_it11 = new boolean[] {false} ;
      T017W3_A10336Ft_it12 = new String[] {""} ;
      T017W3_n10336Ft_it12 = new boolean[] {false} ;
      T017W3_A10337Ft_it13 = new String[] {""} ;
      T017W3_n10337Ft_it13 = new boolean[] {false} ;
      T017W3_A10338Ft_it14 = new String[] {""} ;
      T017W3_n10338Ft_it14 = new boolean[] {false} ;
      T017W3_A10339Ft_it15 = new String[] {""} ;
      T017W3_n10339Ft_it15 = new boolean[] {false} ;
      T017W3_A10340Ft_it16 = new String[] {""} ;
      T017W3_n10340Ft_it16 = new boolean[] {false} ;
      T017W3_A10341Ft_it17 = new String[] {""} ;
      T017W3_n10341Ft_it17 = new boolean[] {false} ;
      T017W3_A10342Ft_it18 = new String[] {""} ;
      T017W3_n10342Ft_it18 = new boolean[] {false} ;
      T017W3_A10343Ft_it19 = new String[] {""} ;
      T017W3_n10343Ft_it19 = new boolean[] {false} ;
      T017W3_A10344Ft_it20 = new String[] {""} ;
      T017W3_n10344Ft_it20 = new boolean[] {false} ;
      T017W3_A10345Ft_it21 = new String[] {""} ;
      T017W3_n10345Ft_it21 = new boolean[] {false} ;
      T017W3_A10346Ft_it22 = new String[] {""} ;
      T017W3_n10346Ft_it22 = new boolean[] {false} ;
      T017W3_A10347Ft_it23 = new String[] {""} ;
      T017W3_n10347Ft_it23 = new boolean[] {false} ;
      T017W3_A10348Ft_it24 = new String[] {""} ;
      T017W3_n10348Ft_it24 = new boolean[] {false} ;
      T017W3_A10349Ft_it25 = new String[] {""} ;
      T017W3_n10349Ft_it25 = new boolean[] {false} ;
      T017W3_A10350Ft_it26 = new String[] {""} ;
      T017W3_n10350Ft_it26 = new boolean[] {false} ;
      T017W3_A10351Ft_it27 = new String[] {""} ;
      T017W3_n10351Ft_it27 = new boolean[] {false} ;
      T017W3_A10352Ft_it28 = new String[] {""} ;
      T017W3_n10352Ft_it28 = new boolean[] {false} ;
      T017W3_A10353Ft_it29 = new String[] {""} ;
      T017W3_n10353Ft_it29 = new boolean[] {false} ;
      T017W3_A10354Ft_it30 = new String[] {""} ;
      T017W3_n10354Ft_it30 = new boolean[] {false} ;
      T017W3_A396EmprCod = new String[] {""} ;
      T017W3_A10301Cod_pais = new short[1] ;
      sMode1402 = "" ;
      T017W8_A396EmprCod = new String[] {""} ;
      T017W8_A10301Cod_pais = new short[1] ;
      T017W8_A10323Ft_Cod = new String[] {""} ;
      T017W9_A396EmprCod = new String[] {""} ;
      T017W9_A10301Cod_pais = new short[1] ;
      T017W9_A10323Ft_Cod = new String[] {""} ;
      T017W2_A10323Ft_Cod = new String[] {""} ;
      T017W2_A10324Ft_dsc = new String[] {""} ;
      T017W2_n10324Ft_dsc = new boolean[] {false} ;
      T017W2_A10325Ft_it1 = new String[] {""} ;
      T017W2_n10325Ft_it1 = new boolean[] {false} ;
      T017W2_A10326Ft_it2 = new String[] {""} ;
      T017W2_n10326Ft_it2 = new boolean[] {false} ;
      T017W2_A10327Ft_it3 = new String[] {""} ;
      T017W2_n10327Ft_it3 = new boolean[] {false} ;
      T017W2_A10328Ft_it4 = new String[] {""} ;
      T017W2_n10328Ft_it4 = new boolean[] {false} ;
      T017W2_A10329Ft_it5 = new String[] {""} ;
      T017W2_n10329Ft_it5 = new boolean[] {false} ;
      T017W2_A10330Ft_it6 = new String[] {""} ;
      T017W2_n10330Ft_it6 = new boolean[] {false} ;
      T017W2_A10331Ft_it7 = new String[] {""} ;
      T017W2_n10331Ft_it7 = new boolean[] {false} ;
      T017W2_A10332Ft_it8 = new String[] {""} ;
      T017W2_n10332Ft_it8 = new boolean[] {false} ;
      T017W2_A10333Ft_it9 = new String[] {""} ;
      T017W2_n10333Ft_it9 = new boolean[] {false} ;
      T017W2_A10334Ft_it10 = new String[] {""} ;
      T017W2_n10334Ft_it10 = new boolean[] {false} ;
      T017W2_A10335Ft_it11 = new String[] {""} ;
      T017W2_n10335Ft_it11 = new boolean[] {false} ;
      T017W2_A10336Ft_it12 = new String[] {""} ;
      T017W2_n10336Ft_it12 = new boolean[] {false} ;
      T017W2_A10337Ft_it13 = new String[] {""} ;
      T017W2_n10337Ft_it13 = new boolean[] {false} ;
      T017W2_A10338Ft_it14 = new String[] {""} ;
      T017W2_n10338Ft_it14 = new boolean[] {false} ;
      T017W2_A10339Ft_it15 = new String[] {""} ;
      T017W2_n10339Ft_it15 = new boolean[] {false} ;
      T017W2_A10340Ft_it16 = new String[] {""} ;
      T017W2_n10340Ft_it16 = new boolean[] {false} ;
      T017W2_A10341Ft_it17 = new String[] {""} ;
      T017W2_n10341Ft_it17 = new boolean[] {false} ;
      T017W2_A10342Ft_it18 = new String[] {""} ;
      T017W2_n10342Ft_it18 = new boolean[] {false} ;
      T017W2_A10343Ft_it19 = new String[] {""} ;
      T017W2_n10343Ft_it19 = new boolean[] {false} ;
      T017W2_A10344Ft_it20 = new String[] {""} ;
      T017W2_n10344Ft_it20 = new boolean[] {false} ;
      T017W2_A10345Ft_it21 = new String[] {""} ;
      T017W2_n10345Ft_it21 = new boolean[] {false} ;
      T017W2_A10346Ft_it22 = new String[] {""} ;
      T017W2_n10346Ft_it22 = new boolean[] {false} ;
      T017W2_A10347Ft_it23 = new String[] {""} ;
      T017W2_n10347Ft_it23 = new boolean[] {false} ;
      T017W2_A10348Ft_it24 = new String[] {""} ;
      T017W2_n10348Ft_it24 = new boolean[] {false} ;
      T017W2_A10349Ft_it25 = new String[] {""} ;
      T017W2_n10349Ft_it25 = new boolean[] {false} ;
      T017W2_A10350Ft_it26 = new String[] {""} ;
      T017W2_n10350Ft_it26 = new boolean[] {false} ;
      T017W2_A10351Ft_it27 = new String[] {""} ;
      T017W2_n10351Ft_it27 = new boolean[] {false} ;
      T017W2_A10352Ft_it28 = new String[] {""} ;
      T017W2_n10352Ft_it28 = new boolean[] {false} ;
      T017W2_A10353Ft_it29 = new String[] {""} ;
      T017W2_n10353Ft_it29 = new boolean[] {false} ;
      T017W2_A10354Ft_it30 = new String[] {""} ;
      T017W2_n10354Ft_it30 = new boolean[] {false} ;
      T017W2_A396EmprCod = new String[] {""} ;
      T017W2_A10301Cod_pais = new short[1] ;
      T017W13_A396EmprCod = new String[] {""} ;
      T017W13_A10301Cod_pais = new short[1] ;
      T017W13_A10323Ft_Cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T017W14_A407EmprNom = new String[] {""} ;
      T017W14_n407EmprNom = new boolean[] {false} ;
      T017W15_A10302Dsc_pais = new String[] {""} ;
      T017W15_n10302Dsc_pais = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10323Ft_Cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ10302Dsc_pais = "" ;
      ZZ10324Ft_dsc = "" ;
      ZZ10325Ft_it1 = "" ;
      ZZ10326Ft_it2 = "" ;
      ZZ10327Ft_it3 = "" ;
      ZZ10328Ft_it4 = "" ;
      ZZ10329Ft_it5 = "" ;
      ZZ10330Ft_it6 = "" ;
      ZZ10331Ft_it7 = "" ;
      ZZ10332Ft_it8 = "" ;
      ZZ10333Ft_it9 = "" ;
      ZZ10334Ft_it10 = "" ;
      ZZ10335Ft_it11 = "" ;
      ZZ10336Ft_it12 = "" ;
      ZZ10337Ft_it13 = "" ;
      ZZ10338Ft_it14 = "" ;
      ZZ10339Ft_it15 = "" ;
      ZZ10340Ft_it16 = "" ;
      ZZ10341Ft_it17 = "" ;
      ZZ10342Ft_it18 = "" ;
      ZZ10343Ft_it19 = "" ;
      ZZ10344Ft_it20 = "" ;
      ZZ10345Ft_it21 = "" ;
      ZZ10346Ft_it22 = "" ;
      ZZ10347Ft_it23 = "" ;
      ZZ10348Ft_it24 = "" ;
      ZZ10349Ft_it25 = "" ;
      ZZ10350Ft_it26 = "" ;
      ZZ10351Ft_it27 = "" ;
      ZZ10352Ft_it28 = "" ;
      ZZ10353Ft_it29 = "" ;
      ZZ10354Ft_it30 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0600__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0600__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0600__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0600__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0600__default(),
         new Object[] {
             new Object[] {
            T017W2_A10323Ft_Cod, T017W2_A10324Ft_dsc, T017W2_n10324Ft_dsc, T017W2_A10325Ft_it1, T017W2_n10325Ft_it1, T017W2_A10326Ft_it2, T017W2_n10326Ft_it2, T017W2_A10327Ft_it3, T017W2_n10327Ft_it3, T017W2_A10328Ft_it4,
            T017W2_n10328Ft_it4, T017W2_A10329Ft_it5, T017W2_n10329Ft_it5, T017W2_A10330Ft_it6, T017W2_n10330Ft_it6, T017W2_A10331Ft_it7, T017W2_n10331Ft_it7, T017W2_A10332Ft_it8, T017W2_n10332Ft_it8, T017W2_A10333Ft_it9,
            T017W2_n10333Ft_it9, T017W2_A10334Ft_it10, T017W2_n10334Ft_it10, T017W2_A10335Ft_it11, T017W2_n10335Ft_it11, T017W2_A10336Ft_it12, T017W2_n10336Ft_it12, T017W2_A10337Ft_it13, T017W2_n10337Ft_it13, T017W2_A10338Ft_it14,
            T017W2_n10338Ft_it14, T017W2_A10339Ft_it15, T017W2_n10339Ft_it15, T017W2_A10340Ft_it16, T017W2_n10340Ft_it16, T017W2_A10341Ft_it17, T017W2_n10341Ft_it17, T017W2_A10342Ft_it18, T017W2_n10342Ft_it18, T017W2_A10343Ft_it19,
            T017W2_n10343Ft_it19, T017W2_A10344Ft_it20, T017W2_n10344Ft_it20, T017W2_A10345Ft_it21, T017W2_n10345Ft_it21, T017W2_A10346Ft_it22, T017W2_n10346Ft_it22, T017W2_A10347Ft_it23, T017W2_n10347Ft_it23, T017W2_A10348Ft_it24,
            T017W2_n10348Ft_it24, T017W2_A10349Ft_it25, T017W2_n10349Ft_it25, T017W2_A10350Ft_it26, T017W2_n10350Ft_it26, T017W2_A10351Ft_it27, T017W2_n10351Ft_it27, T017W2_A10352Ft_it28, T017W2_n10352Ft_it28, T017W2_A10353Ft_it29,
            T017W2_n10353Ft_it29, T017W2_A10354Ft_it30, T017W2_n10354Ft_it30, T017W2_A396EmprCod, T017W2_A10301Cod_pais
            }
            , new Object[] {
            T017W3_A10323Ft_Cod, T017W3_A10324Ft_dsc, T017W3_n10324Ft_dsc, T017W3_A10325Ft_it1, T017W3_n10325Ft_it1, T017W3_A10326Ft_it2, T017W3_n10326Ft_it2, T017W3_A10327Ft_it3, T017W3_n10327Ft_it3, T017W3_A10328Ft_it4,
            T017W3_n10328Ft_it4, T017W3_A10329Ft_it5, T017W3_n10329Ft_it5, T017W3_A10330Ft_it6, T017W3_n10330Ft_it6, T017W3_A10331Ft_it7, T017W3_n10331Ft_it7, T017W3_A10332Ft_it8, T017W3_n10332Ft_it8, T017W3_A10333Ft_it9,
            T017W3_n10333Ft_it9, T017W3_A10334Ft_it10, T017W3_n10334Ft_it10, T017W3_A10335Ft_it11, T017W3_n10335Ft_it11, T017W3_A10336Ft_it12, T017W3_n10336Ft_it12, T017W3_A10337Ft_it13, T017W3_n10337Ft_it13, T017W3_A10338Ft_it14,
            T017W3_n10338Ft_it14, T017W3_A10339Ft_it15, T017W3_n10339Ft_it15, T017W3_A10340Ft_it16, T017W3_n10340Ft_it16, T017W3_A10341Ft_it17, T017W3_n10341Ft_it17, T017W3_A10342Ft_it18, T017W3_n10342Ft_it18, T017W3_A10343Ft_it19,
            T017W3_n10343Ft_it19, T017W3_A10344Ft_it20, T017W3_n10344Ft_it20, T017W3_A10345Ft_it21, T017W3_n10345Ft_it21, T017W3_A10346Ft_it22, T017W3_n10346Ft_it22, T017W3_A10347Ft_it23, T017W3_n10347Ft_it23, T017W3_A10348Ft_it24,
            T017W3_n10348Ft_it24, T017W3_A10349Ft_it25, T017W3_n10349Ft_it25, T017W3_A10350Ft_it26, T017W3_n10350Ft_it26, T017W3_A10351Ft_it27, T017W3_n10351Ft_it27, T017W3_A10352Ft_it28, T017W3_n10352Ft_it28, T017W3_A10353Ft_it29,
            T017W3_n10353Ft_it29, T017W3_A10354Ft_it30, T017W3_n10354Ft_it30, T017W3_A396EmprCod, T017W3_A10301Cod_pais
            }
            , new Object[] {
            T017W4_A407EmprNom, T017W4_n407EmprNom
            }
            , new Object[] {
            T017W5_A10302Dsc_pais, T017W5_n10302Dsc_pais
            }
            , new Object[] {
            T017W6_A10323Ft_Cod, T017W6_A407EmprNom, T017W6_n407EmprNom, T017W6_A10302Dsc_pais, T017W6_n10302Dsc_pais, T017W6_A10324Ft_dsc, T017W6_n10324Ft_dsc, T017W6_A10325Ft_it1, T017W6_n10325Ft_it1, T017W6_A10326Ft_it2,
            T017W6_n10326Ft_it2, T017W6_A10327Ft_it3, T017W6_n10327Ft_it3, T017W6_A10328Ft_it4, T017W6_n10328Ft_it4, T017W6_A10329Ft_it5, T017W6_n10329Ft_it5, T017W6_A10330Ft_it6, T017W6_n10330Ft_it6, T017W6_A10331Ft_it7,
            T017W6_n10331Ft_it7, T017W6_A10332Ft_it8, T017W6_n10332Ft_it8, T017W6_A10333Ft_it9, T017W6_n10333Ft_it9, T017W6_A10334Ft_it10, T017W6_n10334Ft_it10, T017W6_A10335Ft_it11, T017W6_n10335Ft_it11, T017W6_A10336Ft_it12,
            T017W6_n10336Ft_it12, T017W6_A10337Ft_it13, T017W6_n10337Ft_it13, T017W6_A10338Ft_it14, T017W6_n10338Ft_it14, T017W6_A10339Ft_it15, T017W6_n10339Ft_it15, T017W6_A10340Ft_it16, T017W6_n10340Ft_it16, T017W6_A10341Ft_it17,
            T017W6_n10341Ft_it17, T017W6_A10342Ft_it18, T017W6_n10342Ft_it18, T017W6_A10343Ft_it19, T017W6_n10343Ft_it19, T017W6_A10344Ft_it20, T017W6_n10344Ft_it20, T017W6_A10345Ft_it21, T017W6_n10345Ft_it21, T017W6_A10346Ft_it22,
            T017W6_n10346Ft_it22, T017W6_A10347Ft_it23, T017W6_n10347Ft_it23, T017W6_A10348Ft_it24, T017W6_n10348Ft_it24, T017W6_A10349Ft_it25, T017W6_n10349Ft_it25, T017W6_A10350Ft_it26, T017W6_n10350Ft_it26, T017W6_A10351Ft_it27,
            T017W6_n10351Ft_it27, T017W6_A10352Ft_it28, T017W6_n10352Ft_it28, T017W6_A10353Ft_it29, T017W6_n10353Ft_it29, T017W6_A10354Ft_it30, T017W6_n10354Ft_it30, T017W6_A396EmprCod, T017W6_A10301Cod_pais
            }
            , new Object[] {
            T017W7_A396EmprCod, T017W7_A10301Cod_pais, T017W7_A10323Ft_Cod
            }
            , new Object[] {
            T017W8_A396EmprCod, T017W8_A10301Cod_pais, T017W8_A10323Ft_Cod
            }
            , new Object[] {
            T017W9_A396EmprCod, T017W9_A10301Cod_pais, T017W9_A10323Ft_Cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017W13_A396EmprCod, T017W13_A10301Cod_pais, T017W13_A10323Ft_Cod
            }
            , new Object[] {
            T017W14_A407EmprNom, T017W14_n407EmprNom
            }
            , new Object[] {
            T017W15_A10302Dsc_pais, T017W15_n10302Dsc_pais
            }
         }
      );
      Z10301Cod_pais = (short)(0) ;
      A10301Cod_pais = (short)(0) ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTR0600" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOA10301Cod_pais ;
   private short Z10301Cod_pais ;
   private short A10301Cod_pais ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1402 ;
   private short nIsDirty_1402 ;
   private short ZZ10301Cod_pais ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCod_pais_Enabled ;
   private int edtDsc_pais_Enabled ;
   private int edtFt_Cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFt_dsc_Enabled ;
   private int edtFt_it1_Enabled ;
   private int edtFt_it2_Enabled ;
   private int edtFt_it3_Enabled ;
   private int edtFt_it4_Enabled ;
   private int edtFt_it5_Enabled ;
   private int edtFt_it6_Enabled ;
   private int edtFt_it7_Enabled ;
   private int edtFt_it8_Enabled ;
   private int edtFt_it9_Enabled ;
   private int edtFt_it10_Enabled ;
   private int edtFt_it11_Enabled ;
   private int edtFt_it12_Enabled ;
   private int edtFt_it13_Enabled ;
   private int edtFt_it14_Enabled ;
   private int edtFt_it15_Enabled ;
   private int edtFt_it16_Enabled ;
   private int edtFt_it17_Enabled ;
   private int edtFt_it18_Enabled ;
   private int edtFt_it19_Enabled ;
   private int edtFt_it20_Enabled ;
   private int edtFt_it21_Enabled ;
   private int edtFt_it22_Enabled ;
   private int edtFt_it23_Enabled ;
   private int edtFt_it24_Enabled ;
   private int edtFt_it25_Enabled ;
   private int edtFt_it26_Enabled ;
   private int edtFt_it27_Enabled ;
   private int edtFt_it28_Enabled ;
   private int edtFt_it29_Enabled ;
   private int edtFt_it30_Enabled ;
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
   private int edtFt_it30_Backcolor ;
   private int edtFt_it29_Backcolor ;
   private int edtFt_it28_Backcolor ;
   private int edtFt_it27_Backcolor ;
   private int edtFt_it26_Backcolor ;
   private int edtFt_it25_Backcolor ;
   private int edtFt_it24_Backcolor ;
   private int edtFt_it23_Backcolor ;
   private int edtFt_it22_Backcolor ;
   private int edtFt_it21_Backcolor ;
   private int edtFt_it20_Backcolor ;
   private int edtFt_it19_Backcolor ;
   private int edtFt_it18_Backcolor ;
   private int edtFt_it17_Backcolor ;
   private int edtFt_it16_Backcolor ;
   private int edtFt_it15_Backcolor ;
   private int edtFt_it14_Backcolor ;
   private int edtFt_it13_Backcolor ;
   private int edtFt_it12_Backcolor ;
   private int edtFt_it11_Backcolor ;
   private int edtFt_it10_Backcolor ;
   private int edtFt_it9_Backcolor ;
   private int edtFt_it8_Backcolor ;
   private int edtFt_it7_Backcolor ;
   private int edtFt_it6_Backcolor ;
   private int edtFt_it5_Backcolor ;
   private int edtFt_it4_Backcolor ;
   private int edtFt_it3_Backcolor ;
   private int edtFt_it2_Backcolor ;
   private int edtFt_it1_Backcolor ;
   private int edtFt_dsc_Backcolor ;
   private int edtFt_Cod_Backcolor ;
   private int edtDsc_pais_Backcolor ;
   private int edtCod_pais_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z10323Ft_Cod ;
   private String Z10324Ft_dsc ;
   private String Z10325Ft_it1 ;
   private String Z10326Ft_it2 ;
   private String Z10327Ft_it3 ;
   private String Z10328Ft_it4 ;
   private String Z10329Ft_it5 ;
   private String Z10330Ft_it6 ;
   private String Z10331Ft_it7 ;
   private String Z10332Ft_it8 ;
   private String Z10333Ft_it9 ;
   private String Z10334Ft_it10 ;
   private String Z10335Ft_it11 ;
   private String Z10336Ft_it12 ;
   private String Z10337Ft_it13 ;
   private String Z10338Ft_it14 ;
   private String Z10339Ft_it15 ;
   private String Z10340Ft_it16 ;
   private String Z10341Ft_it17 ;
   private String Z10342Ft_it18 ;
   private String Z10343Ft_it19 ;
   private String Z10344Ft_it20 ;
   private String Z10345Ft_it21 ;
   private String Z10346Ft_it22 ;
   private String Z10347Ft_it23 ;
   private String Z10348Ft_it24 ;
   private String Z10349Ft_it25 ;
   private String Z10350Ft_it26 ;
   private String Z10351Ft_it27 ;
   private String Z10352Ft_it28 ;
   private String Z10353Ft_it29 ;
   private String Z10354Ft_it30 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFt_Cod_Internalname ;
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
   private String edtCod_pais_Internalname ;
   private String edtCod_pais_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDsc_pais_Internalname ;
   private String A10302Dsc_pais ;
   private String edtDsc_pais_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String A10323Ft_Cod ;
   private String edtFt_Cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtFt_dsc_Internalname ;
   private String A10324Ft_dsc ;
   private String edtFt_dsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFt_it1_Internalname ;
   private String A10325Ft_it1 ;
   private String edtFt_it1_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFt_it2_Internalname ;
   private String A10326Ft_it2 ;
   private String edtFt_it2_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFt_it3_Internalname ;
   private String A10327Ft_it3 ;
   private String edtFt_it3_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtFt_it4_Internalname ;
   private String A10328Ft_it4 ;
   private String edtFt_it4_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtFt_it5_Internalname ;
   private String A10329Ft_it5 ;
   private String edtFt_it5_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtFt_it6_Internalname ;
   private String A10330Ft_it6 ;
   private String edtFt_it6_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtFt_it7_Internalname ;
   private String A10331Ft_it7 ;
   private String edtFt_it7_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtFt_it8_Internalname ;
   private String A10332Ft_it8 ;
   private String edtFt_it8_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtFt_it9_Internalname ;
   private String A10333Ft_it9 ;
   private String edtFt_it9_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtFt_it10_Internalname ;
   private String A10334Ft_it10 ;
   private String edtFt_it10_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtFt_it11_Internalname ;
   private String A10335Ft_it11 ;
   private String edtFt_it11_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtFt_it12_Internalname ;
   private String A10336Ft_it12 ;
   private String edtFt_it12_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtFt_it13_Internalname ;
   private String A10337Ft_it13 ;
   private String edtFt_it13_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtFt_it14_Internalname ;
   private String A10338Ft_it14 ;
   private String edtFt_it14_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtFt_it15_Internalname ;
   private String A10339Ft_it15 ;
   private String edtFt_it15_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtFt_it16_Internalname ;
   private String A10340Ft_it16 ;
   private String edtFt_it16_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtFt_it17_Internalname ;
   private String A10341Ft_it17 ;
   private String edtFt_it17_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtFt_it18_Internalname ;
   private String A10342Ft_it18 ;
   private String edtFt_it18_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtFt_it19_Internalname ;
   private String A10343Ft_it19 ;
   private String edtFt_it19_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtFt_it20_Internalname ;
   private String A10344Ft_it20 ;
   private String edtFt_it20_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtFt_it21_Internalname ;
   private String A10345Ft_it21 ;
   private String edtFt_it21_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtFt_it22_Internalname ;
   private String A10346Ft_it22 ;
   private String edtFt_it22_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtFt_it23_Internalname ;
   private String A10347Ft_it23 ;
   private String edtFt_it23_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtFt_it24_Internalname ;
   private String A10348Ft_it24 ;
   private String edtFt_it24_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtFt_it25_Internalname ;
   private String A10349Ft_it25 ;
   private String edtFt_it25_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtFt_it26_Internalname ;
   private String A10350Ft_it26 ;
   private String edtFt_it26_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtFt_it27_Internalname ;
   private String A10351Ft_it27 ;
   private String edtFt_it27_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtFt_it28_Internalname ;
   private String A10352Ft_it28 ;
   private String edtFt_it28_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtFt_it29_Internalname ;
   private String A10353Ft_it29 ;
   private String edtFt_it29_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtFt_it30_Internalname ;
   private String A10354Ft_it30 ;
   private String edtFt_it30_Jsonclick ;
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
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z10302Dsc_pais ;
   private String sMode1402 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10323Ft_Cod ;
   private String ZZ407EmprNom ;
   private String ZZ10302Dsc_pais ;
   private String ZZ10324Ft_dsc ;
   private String ZZ10325Ft_it1 ;
   private String ZZ10326Ft_it2 ;
   private String ZZ10327Ft_it3 ;
   private String ZZ10328Ft_it4 ;
   private String ZZ10329Ft_it5 ;
   private String ZZ10330Ft_it6 ;
   private String ZZ10331Ft_it7 ;
   private String ZZ10332Ft_it8 ;
   private String ZZ10333Ft_it9 ;
   private String ZZ10334Ft_it10 ;
   private String ZZ10335Ft_it11 ;
   private String ZZ10336Ft_it12 ;
   private String ZZ10337Ft_it13 ;
   private String ZZ10338Ft_it14 ;
   private String ZZ10339Ft_it15 ;
   private String ZZ10340Ft_it16 ;
   private String ZZ10341Ft_it17 ;
   private String ZZ10342Ft_it18 ;
   private String ZZ10343Ft_it19 ;
   private String ZZ10344Ft_it20 ;
   private String ZZ10345Ft_it21 ;
   private String ZZ10346Ft_it22 ;
   private String ZZ10347Ft_it23 ;
   private String ZZ10348Ft_it24 ;
   private String ZZ10349Ft_it25 ;
   private String ZZ10350Ft_it26 ;
   private String ZZ10351Ft_it27 ;
   private String ZZ10352Ft_it28 ;
   private String ZZ10353Ft_it29 ;
   private String ZZ10354Ft_it30 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10302Dsc_pais ;
   private boolean n10324Ft_dsc ;
   private boolean n10325Ft_it1 ;
   private boolean n10326Ft_it2 ;
   private boolean n10327Ft_it3 ;
   private boolean n10328Ft_it4 ;
   private boolean n10329Ft_it5 ;
   private boolean n10330Ft_it6 ;
   private boolean n10331Ft_it7 ;
   private boolean n10332Ft_it8 ;
   private boolean n10333Ft_it9 ;
   private boolean n10334Ft_it10 ;
   private boolean n10335Ft_it11 ;
   private boolean n10336Ft_it12 ;
   private boolean n10337Ft_it13 ;
   private boolean n10338Ft_it14 ;
   private boolean n10339Ft_it15 ;
   private boolean n10340Ft_it16 ;
   private boolean n10341Ft_it17 ;
   private boolean n10342Ft_it18 ;
   private boolean n10343Ft_it19 ;
   private boolean n10344Ft_it20 ;
   private boolean n10345Ft_it21 ;
   private boolean n10346Ft_it22 ;
   private boolean n10347Ft_it23 ;
   private boolean n10348Ft_it24 ;
   private boolean n10349Ft_it25 ;
   private boolean n10350Ft_it26 ;
   private boolean n10351Ft_it27 ;
   private boolean n10352Ft_it28 ;
   private boolean n10353Ft_it29 ;
   private boolean n10354Ft_it30 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T017W4_A407EmprNom ;
   private boolean[] T017W4_n407EmprNom ;
   private String[] T017W5_A10302Dsc_pais ;
   private boolean[] T017W5_n10302Dsc_pais ;
   private String[] T017W6_A10323Ft_Cod ;
   private String[] T017W6_A407EmprNom ;
   private boolean[] T017W6_n407EmprNom ;
   private String[] T017W6_A10302Dsc_pais ;
   private boolean[] T017W6_n10302Dsc_pais ;
   private String[] T017W6_A10324Ft_dsc ;
   private boolean[] T017W6_n10324Ft_dsc ;
   private String[] T017W6_A10325Ft_it1 ;
   private boolean[] T017W6_n10325Ft_it1 ;
   private String[] T017W6_A10326Ft_it2 ;
   private boolean[] T017W6_n10326Ft_it2 ;
   private String[] T017W6_A10327Ft_it3 ;
   private boolean[] T017W6_n10327Ft_it3 ;
   private String[] T017W6_A10328Ft_it4 ;
   private boolean[] T017W6_n10328Ft_it4 ;
   private String[] T017W6_A10329Ft_it5 ;
   private boolean[] T017W6_n10329Ft_it5 ;
   private String[] T017W6_A10330Ft_it6 ;
   private boolean[] T017W6_n10330Ft_it6 ;
   private String[] T017W6_A10331Ft_it7 ;
   private boolean[] T017W6_n10331Ft_it7 ;
   private String[] T017W6_A10332Ft_it8 ;
   private boolean[] T017W6_n10332Ft_it8 ;
   private String[] T017W6_A10333Ft_it9 ;
   private boolean[] T017W6_n10333Ft_it9 ;
   private String[] T017W6_A10334Ft_it10 ;
   private boolean[] T017W6_n10334Ft_it10 ;
   private String[] T017W6_A10335Ft_it11 ;
   private boolean[] T017W6_n10335Ft_it11 ;
   private String[] T017W6_A10336Ft_it12 ;
   private boolean[] T017W6_n10336Ft_it12 ;
   private String[] T017W6_A10337Ft_it13 ;
   private boolean[] T017W6_n10337Ft_it13 ;
   private String[] T017W6_A10338Ft_it14 ;
   private boolean[] T017W6_n10338Ft_it14 ;
   private String[] T017W6_A10339Ft_it15 ;
   private boolean[] T017W6_n10339Ft_it15 ;
   private String[] T017W6_A10340Ft_it16 ;
   private boolean[] T017W6_n10340Ft_it16 ;
   private String[] T017W6_A10341Ft_it17 ;
   private boolean[] T017W6_n10341Ft_it17 ;
   private String[] T017W6_A10342Ft_it18 ;
   private boolean[] T017W6_n10342Ft_it18 ;
   private String[] T017W6_A10343Ft_it19 ;
   private boolean[] T017W6_n10343Ft_it19 ;
   private String[] T017W6_A10344Ft_it20 ;
   private boolean[] T017W6_n10344Ft_it20 ;
   private String[] T017W6_A10345Ft_it21 ;
   private boolean[] T017W6_n10345Ft_it21 ;
   private String[] T017W6_A10346Ft_it22 ;
   private boolean[] T017W6_n10346Ft_it22 ;
   private String[] T017W6_A10347Ft_it23 ;
   private boolean[] T017W6_n10347Ft_it23 ;
   private String[] T017W6_A10348Ft_it24 ;
   private boolean[] T017W6_n10348Ft_it24 ;
   private String[] T017W6_A10349Ft_it25 ;
   private boolean[] T017W6_n10349Ft_it25 ;
   private String[] T017W6_A10350Ft_it26 ;
   private boolean[] T017W6_n10350Ft_it26 ;
   private String[] T017W6_A10351Ft_it27 ;
   private boolean[] T017W6_n10351Ft_it27 ;
   private String[] T017W6_A10352Ft_it28 ;
   private boolean[] T017W6_n10352Ft_it28 ;
   private String[] T017W6_A10353Ft_it29 ;
   private boolean[] T017W6_n10353Ft_it29 ;
   private String[] T017W6_A10354Ft_it30 ;
   private boolean[] T017W6_n10354Ft_it30 ;
   private String[] T017W6_A396EmprCod ;
   private short[] T017W6_A10301Cod_pais ;
   private String[] T017W7_A396EmprCod ;
   private short[] T017W7_A10301Cod_pais ;
   private String[] T017W7_A10323Ft_Cod ;
   private String[] T017W3_A10323Ft_Cod ;
   private String[] T017W3_A10324Ft_dsc ;
   private boolean[] T017W3_n10324Ft_dsc ;
   private String[] T017W3_A10325Ft_it1 ;
   private boolean[] T017W3_n10325Ft_it1 ;
   private String[] T017W3_A10326Ft_it2 ;
   private boolean[] T017W3_n10326Ft_it2 ;
   private String[] T017W3_A10327Ft_it3 ;
   private boolean[] T017W3_n10327Ft_it3 ;
   private String[] T017W3_A10328Ft_it4 ;
   private boolean[] T017W3_n10328Ft_it4 ;
   private String[] T017W3_A10329Ft_it5 ;
   private boolean[] T017W3_n10329Ft_it5 ;
   private String[] T017W3_A10330Ft_it6 ;
   private boolean[] T017W3_n10330Ft_it6 ;
   private String[] T017W3_A10331Ft_it7 ;
   private boolean[] T017W3_n10331Ft_it7 ;
   private String[] T017W3_A10332Ft_it8 ;
   private boolean[] T017W3_n10332Ft_it8 ;
   private String[] T017W3_A10333Ft_it9 ;
   private boolean[] T017W3_n10333Ft_it9 ;
   private String[] T017W3_A10334Ft_it10 ;
   private boolean[] T017W3_n10334Ft_it10 ;
   private String[] T017W3_A10335Ft_it11 ;
   private boolean[] T017W3_n10335Ft_it11 ;
   private String[] T017W3_A10336Ft_it12 ;
   private boolean[] T017W3_n10336Ft_it12 ;
   private String[] T017W3_A10337Ft_it13 ;
   private boolean[] T017W3_n10337Ft_it13 ;
   private String[] T017W3_A10338Ft_it14 ;
   private boolean[] T017W3_n10338Ft_it14 ;
   private String[] T017W3_A10339Ft_it15 ;
   private boolean[] T017W3_n10339Ft_it15 ;
   private String[] T017W3_A10340Ft_it16 ;
   private boolean[] T017W3_n10340Ft_it16 ;
   private String[] T017W3_A10341Ft_it17 ;
   private boolean[] T017W3_n10341Ft_it17 ;
   private String[] T017W3_A10342Ft_it18 ;
   private boolean[] T017W3_n10342Ft_it18 ;
   private String[] T017W3_A10343Ft_it19 ;
   private boolean[] T017W3_n10343Ft_it19 ;
   private String[] T017W3_A10344Ft_it20 ;
   private boolean[] T017W3_n10344Ft_it20 ;
   private String[] T017W3_A10345Ft_it21 ;
   private boolean[] T017W3_n10345Ft_it21 ;
   private String[] T017W3_A10346Ft_it22 ;
   private boolean[] T017W3_n10346Ft_it22 ;
   private String[] T017W3_A10347Ft_it23 ;
   private boolean[] T017W3_n10347Ft_it23 ;
   private String[] T017W3_A10348Ft_it24 ;
   private boolean[] T017W3_n10348Ft_it24 ;
   private String[] T017W3_A10349Ft_it25 ;
   private boolean[] T017W3_n10349Ft_it25 ;
   private String[] T017W3_A10350Ft_it26 ;
   private boolean[] T017W3_n10350Ft_it26 ;
   private String[] T017W3_A10351Ft_it27 ;
   private boolean[] T017W3_n10351Ft_it27 ;
   private String[] T017W3_A10352Ft_it28 ;
   private boolean[] T017W3_n10352Ft_it28 ;
   private String[] T017W3_A10353Ft_it29 ;
   private boolean[] T017W3_n10353Ft_it29 ;
   private String[] T017W3_A10354Ft_it30 ;
   private boolean[] T017W3_n10354Ft_it30 ;
   private String[] T017W3_A396EmprCod ;
   private short[] T017W3_A10301Cod_pais ;
   private String[] T017W8_A396EmprCod ;
   private short[] T017W8_A10301Cod_pais ;
   private String[] T017W8_A10323Ft_Cod ;
   private String[] T017W9_A396EmprCod ;
   private short[] T017W9_A10301Cod_pais ;
   private String[] T017W9_A10323Ft_Cod ;
   private String[] T017W2_A10323Ft_Cod ;
   private String[] T017W2_A10324Ft_dsc ;
   private boolean[] T017W2_n10324Ft_dsc ;
   private String[] T017W2_A10325Ft_it1 ;
   private boolean[] T017W2_n10325Ft_it1 ;
   private String[] T017W2_A10326Ft_it2 ;
   private boolean[] T017W2_n10326Ft_it2 ;
   private String[] T017W2_A10327Ft_it3 ;
   private boolean[] T017W2_n10327Ft_it3 ;
   private String[] T017W2_A10328Ft_it4 ;
   private boolean[] T017W2_n10328Ft_it4 ;
   private String[] T017W2_A10329Ft_it5 ;
   private boolean[] T017W2_n10329Ft_it5 ;
   private String[] T017W2_A10330Ft_it6 ;
   private boolean[] T017W2_n10330Ft_it6 ;
   private String[] T017W2_A10331Ft_it7 ;
   private boolean[] T017W2_n10331Ft_it7 ;
   private String[] T017W2_A10332Ft_it8 ;
   private boolean[] T017W2_n10332Ft_it8 ;
   private String[] T017W2_A10333Ft_it9 ;
   private boolean[] T017W2_n10333Ft_it9 ;
   private String[] T017W2_A10334Ft_it10 ;
   private boolean[] T017W2_n10334Ft_it10 ;
   private String[] T017W2_A10335Ft_it11 ;
   private boolean[] T017W2_n10335Ft_it11 ;
   private String[] T017W2_A10336Ft_it12 ;
   private boolean[] T017W2_n10336Ft_it12 ;
   private String[] T017W2_A10337Ft_it13 ;
   private boolean[] T017W2_n10337Ft_it13 ;
   private String[] T017W2_A10338Ft_it14 ;
   private boolean[] T017W2_n10338Ft_it14 ;
   private String[] T017W2_A10339Ft_it15 ;
   private boolean[] T017W2_n10339Ft_it15 ;
   private String[] T017W2_A10340Ft_it16 ;
   private boolean[] T017W2_n10340Ft_it16 ;
   private String[] T017W2_A10341Ft_it17 ;
   private boolean[] T017W2_n10341Ft_it17 ;
   private String[] T017W2_A10342Ft_it18 ;
   private boolean[] T017W2_n10342Ft_it18 ;
   private String[] T017W2_A10343Ft_it19 ;
   private boolean[] T017W2_n10343Ft_it19 ;
   private String[] T017W2_A10344Ft_it20 ;
   private boolean[] T017W2_n10344Ft_it20 ;
   private String[] T017W2_A10345Ft_it21 ;
   private boolean[] T017W2_n10345Ft_it21 ;
   private String[] T017W2_A10346Ft_it22 ;
   private boolean[] T017W2_n10346Ft_it22 ;
   private String[] T017W2_A10347Ft_it23 ;
   private boolean[] T017W2_n10347Ft_it23 ;
   private String[] T017W2_A10348Ft_it24 ;
   private boolean[] T017W2_n10348Ft_it24 ;
   private String[] T017W2_A10349Ft_it25 ;
   private boolean[] T017W2_n10349Ft_it25 ;
   private String[] T017W2_A10350Ft_it26 ;
   private boolean[] T017W2_n10350Ft_it26 ;
   private String[] T017W2_A10351Ft_it27 ;
   private boolean[] T017W2_n10351Ft_it27 ;
   private String[] T017W2_A10352Ft_it28 ;
   private boolean[] T017W2_n10352Ft_it28 ;
   private String[] T017W2_A10353Ft_it29 ;
   private boolean[] T017W2_n10353Ft_it29 ;
   private String[] T017W2_A10354Ft_it30 ;
   private boolean[] T017W2_n10354Ft_it30 ;
   private String[] T017W2_A396EmprCod ;
   private short[] T017W2_A10301Cod_pais ;
   private String[] T017W13_A396EmprCod ;
   private short[] T017W13_A10301Cod_pais ;
   private String[] T017W13_A10323Ft_Cod ;
   private String[] T017W14_A407EmprNom ;
   private boolean[] T017W14_n407EmprNom ;
   private String[] T017W15_A10302Dsc_pais ;
   private boolean[] T017W15_n10302Dsc_pais ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0600__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0600__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0600__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0600__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0600__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017W2", "SELECT Ft_Cod, Ft_dsc, Ft_it1, Ft_it2, Ft_it3, Ft_it4, Ft_it5, Ft_it6, Ft_it7, Ft_it8, Ft_it9, Ft_it10, Ft_it11, Ft_it12, Ft_it13, Ft_it14, Ft_it15, Ft_it16, Ft_it17, Ft_it18, Ft_it19, Ft_it20, Ft_it21, Ft_it22, Ft_it23, Ft_it24, Ft_it25, Ft_it26, Ft_it27, Ft_it28, Ft_it29, Ft_it30, EmprCod, Cod_pais FROM TXPTR0600 WHERE EmprCod = ? AND Cod_pais = ? AND Ft_Cod = ?  FOR UPDATE OF Ft_dsc, Ft_it1, Ft_it2, Ft_it3, Ft_it4, Ft_it5, Ft_it6, Ft_it7, Ft_it8, Ft_it9, Ft_it10, Ft_it11, Ft_it12, Ft_it13, Ft_it14, Ft_it15, Ft_it16, Ft_it17, Ft_it18, Ft_it19, Ft_it20, Ft_it21, Ft_it22, Ft_it23, Ft_it24, Ft_it25, Ft_it26, Ft_it27, Ft_it28, Ft_it29, Ft_it30 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W3", "SELECT Ft_Cod, Ft_dsc, Ft_it1, Ft_it2, Ft_it3, Ft_it4, Ft_it5, Ft_it6, Ft_it7, Ft_it8, Ft_it9, Ft_it10, Ft_it11, Ft_it12, Ft_it13, Ft_it14, Ft_it15, Ft_it16, Ft_it17, Ft_it18, Ft_it19, Ft_it20, Ft_it21, Ft_it22, Ft_it23, Ft_it24, Ft_it25, Ft_it26, Ft_it27, Ft_it28, Ft_it29, Ft_it30, EmprCod, Cod_pais FROM TXPTR0600 WHERE EmprCod = ? AND Cod_pais = ? AND Ft_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W5", "SELECT Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? AND Cod_pais = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ft_Cod, T2.EmprNom, T3.Dsc_pais, TM1.Ft_dsc, TM1.Ft_it1, TM1.Ft_it2, TM1.Ft_it3, TM1.Ft_it4, TM1.Ft_it5, TM1.Ft_it6, TM1.Ft_it7, TM1.Ft_it8, TM1.Ft_it9, TM1.Ft_it10, TM1.Ft_it11, TM1.Ft_it12, TM1.Ft_it13, TM1.Ft_it14, TM1.Ft_it15, TM1.Ft_it16, TM1.Ft_it17, TM1.Ft_it18, TM1.Ft_it19, TM1.Ft_it20, TM1.Ft_it21, TM1.Ft_it22, TM1.Ft_it23, TM1.Ft_it24, TM1.Ft_it25, TM1.Ft_it26, TM1.Ft_it27, TM1.Ft_it28, TM1.Ft_it29, TM1.Ft_it30, TM1.EmprCod, TM1.Cod_pais FROM ((TXPTR0600 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTR0400 T3 ON T3.EmprCod = TM1.EmprCod AND T3.Cod_pais = TM1.Cod_pais) WHERE TM1.EmprCod = ? and TM1.Cod_pais = ? and TM1.Ft_Cod = ? ORDER BY TM1.EmprCod, TM1.Cod_pais, TM1.Ft_Cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Cod_pais, Ft_Cod FROM TXPTR0600 WHERE EmprCod = ? AND Cod_pais = ? AND Ft_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Cod_pais, Ft_Cod FROM TXPTR0600 WHERE ( Ft_Cod > ?) and EmprCod = ? and Cod_pais = ? ORDER BY EmprCod, Cod_pais, Ft_Cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017W9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Cod_pais, Ft_Cod FROM TXPTR0600 WHERE ( Ft_Cod < ?) and EmprCod = ? and Cod_pais = ? ORDER BY EmprCod DESC, Cod_pais DESC, Ft_Cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017W10", "INSERT INTO TXPTR0600(Ft_Cod, Ft_dsc, Ft_it1, Ft_it2, Ft_it3, Ft_it4, Ft_it5, Ft_it6, Ft_it7, Ft_it8, Ft_it9, Ft_it10, Ft_it11, Ft_it12, Ft_it13, Ft_it14, Ft_it15, Ft_it16, Ft_it17, Ft_it18, Ft_it19, Ft_it20, Ft_it21, Ft_it22, Ft_it23, Ft_it24, Ft_it25, Ft_it26, Ft_it27, Ft_it28, Ft_it29, Ft_it30, EmprCod, Cod_pais) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0600")
         ,new UpdateCursor("T017W11", "UPDATE TXPTR0600 SET Ft_dsc=?, Ft_it1=?, Ft_it2=?, Ft_it3=?, Ft_it4=?, Ft_it5=?, Ft_it6=?, Ft_it7=?, Ft_it8=?, Ft_it9=?, Ft_it10=?, Ft_it11=?, Ft_it12=?, Ft_it13=?, Ft_it14=?, Ft_it15=?, Ft_it16=?, Ft_it17=?, Ft_it18=?, Ft_it19=?, Ft_it20=?, Ft_it21=?, Ft_it22=?, Ft_it23=?, Ft_it24=?, Ft_it25=?, Ft_it26=?, Ft_it27=?, Ft_it28=?, Ft_it29=?, Ft_it30=?  WHERE EmprCod = ? AND Cod_pais = ? AND Ft_Cod = ?", GX_NOMASK, "TXPTR0600")
         ,new UpdateCursor("T017W12", "DELETE FROM TXPTR0600  WHERE EmprCod = ? AND Cod_pais = ? AND Ft_Cod = ?", GX_NOMASK, "TXPTR0600")
         ,new ForEachCursor("T017W13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Cod_pais, Ft_Cod FROM TXPTR0600 WHERE EmprCod = ? and Cod_pais = ? ORDER BY EmprCod, Cod_pais, Ft_Cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017W15", "SELECT Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? AND Cod_pais = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((short[]) buf[64])[0] = rslt.getShort(34);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 3);
               ((short[]) buf[64])[0] = rslt.getShort(34);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 3);
               ((short[]) buf[68])[0] = rslt.getShort(36);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 30);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 30);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 30);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 30);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 30);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 30);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 30);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 30);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 30);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 30);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 30);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 30);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 30);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 30);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 30);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 30);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 30);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 30);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 30);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 30);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 30);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 30);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 30);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 30);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 30);
               }
               stmt.setString(33, (String)parms[63], 3);
               stmt.setShort(34, ((Number) parms[64]).shortValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 30);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 30);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 30);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 30);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 30);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 30);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 30);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 30);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 30);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 30);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 30);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 30);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 30);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 30);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 30);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 30);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 30);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 30);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 30);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 30);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 30);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 30);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 30);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 30);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 30);
               }
               stmt.setString(32, (String)parms[62], 3);
               stmt.setShort(33, ((Number) parms[63]).shortValue());
               stmt.setString(34, (String)parms[64], 2);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

