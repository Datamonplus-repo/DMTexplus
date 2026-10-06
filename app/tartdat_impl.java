package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tartdat_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A8165Art_Dsc = httpContext.GetPar( "Art_Dsc") ;
         n8165Art_Dsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
         AV33Msg_e = httpContext.GetPar( "Msg_e") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_e", AV33Msg_e);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_11211( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod, A8165Art_Dsc, AV33Msg_e) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV59Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV34Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
         AV35Texto_ii = httpContext.GetPar( "Texto_ii") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_11211( A396EmprCod, AV59Pgmname, AV8UsurCod, AV12Station, AV34Texto_i, AV35Texto_ii) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DATOS ARTICULOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtArt_GrmA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tartdat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tartdat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tartdat_impl.class ));
   }

   public tartdat_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTDAT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Serie Anulada", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAnu_Internalname, GXutil.rtrim( A3682ArtAnu), GXutil.rtrim( localUtil.format( A3682ArtAnu, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAnu_Jsonclick, 0, "", "", "", "", "", 1, edtArtAnu_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Grm2 Acabado", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_GrmA_Internalname, GXutil.ltrim( localUtil.ntoc( A8065Art_GrmA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_GrmA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8065Art_GrmA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8065Art_GrmA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_GrmA_Jsonclick, 0, "", "", "", "", "", 1, edtArt_GrmA_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_AncA_Internalname, GXutil.ltrim( localUtil.ntoc( A8066Art_AncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_AncA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8066Art_AncA), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8066Art_AncA), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_AncA_Jsonclick, 0, "", "", "", "", "", 1, edtArt_AncA_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Merma", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Merma_Internalname, GXutil.ltrim( localUtil.ntoc( A8067Art_Merma, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_Merma_Enabled!=0) ? localUtil.format( A8067Art_Merma, "Z9.99") : localUtil.format( A8067Art_Merma, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Merma_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Merma_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Pml Acabado", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_PmlA_Internalname, GXutil.ltrim( localUtil.ntoc( A8068Art_PmlA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_PmlA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8068Art_PmlA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8068Art_PmlA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_PmlA_Jsonclick, 0, "", "", "", "", "", 1, edtArt_PmlA_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Encog Ancho", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Eanc_Internalname, GXutil.ltrim( localUtil.ntoc( A8069Art_Eanc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_Eanc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8069Art_Eanc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8069Art_Eanc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Eanc_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Eanc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Encog Largo", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Elar_Internalname, GXutil.ltrim( localUtil.ntoc( A8070Art_Elar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_Elar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8070Art_Elar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8070Art_Elar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Elar_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Elar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cortar Orillos", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Enc_Internalname, GXutil.rtrim( A8071Art_Enc), GXutil.rtrim( localUtil.format( A8071Art_Enc, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Enc_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Enc_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Cortar Orillos", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Cor_Internalname, GXutil.rtrim( A8072Art_Cor), GXutil.rtrim( localUtil.format( A8072Art_Cor, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Cor_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Cor_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Rdo", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Rdo_Internalname, GXutil.ltrim( localUtil.ntoc( A8073Art_Rdo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_Rdo_Enabled!=0) ? localUtil.format( A8073Art_Rdo, "ZZ9.99") : localUtil.format( A8073Art_Rdo, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Rdo_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Rdo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Rdo Calculado", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Rdpc_Internalname, GXutil.ltrim( localUtil.ntoc( A8074Art_Rdpc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_Rdpc_Enabled!=0) ? localUtil.format( A8074Art_Rdpc, "ZZ9.99") : localUtil.format( A8074Art_Rdpc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Rdpc_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Rdpc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Factor Abs", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Fabs_Internalname, GXutil.ltrim( localUtil.ntoc( A8075Art_Fabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_Fabs_Enabled!=0) ? localUtil.format( A8075Art_Fabs, "ZZ9.99") : localUtil.format( A8075Art_Fabs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Fabs_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Fabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Ancho Antes Acabado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_AncB_Internalname, GXutil.ltrim( localUtil.ntoc( A8076Art_AncB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_AncB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8076Art_AncB), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8076Art_AncB), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_AncB_Jsonclick, 0, "", "", "", "", "", 1, edtArt_AncB_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Grm2 Antes Acabado", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_GrmB_Internalname, GXutil.ltrim( localUtil.ntoc( A8077Art_GrmB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_GrmB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8077Art_GrmB), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8077Art_GrmB), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_GrmB_Jsonclick, 0, "", "", "", "", "", 1, edtArt_GrmB_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Grm2 Crudo", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_GrmC_Internalname, GXutil.ltrim( localUtil.ntoc( A8078Art_GrmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_GrmC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8078Art_GrmC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8078Art_GrmC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_GrmC_Jsonclick, 0, "", "", "", "", "", 1, edtArt_GrmC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_AncC_Internalname, GXutil.ltrim( localUtil.ntoc( A8079Art_AncC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_AncC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8079Art_AncC), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8079Art_AncC), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_AncC_Jsonclick, 0, "", "", "", "", "", 1, edtArt_AncC_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Pml Crudo", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_PmlC_Internalname, GXutil.ltrim( localUtil.ntoc( A8080Art_PmlC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_PmlC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8080Art_PmlC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8080Art_PmlC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_PmlC_Jsonclick, 0, "", "", "", "", "", 1, edtArt_PmlC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Grm2 Prefijado-Secado", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_GrmP_Internalname, GXutil.ltrim( localUtil.ntoc( A8081Art_GrmP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_GrmP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8081Art_GrmP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8081Art_GrmP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_GrmP_Jsonclick, 0, "", "", "", "", "", 1, edtArt_GrmP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Pml Prefijado-Secado", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_PmlP_Internalname, GXutil.ltrim( localUtil.ntoc( A8082Art_PmlP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_PmlP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8082Art_PmlP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8082Art_PmlP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_PmlP_Jsonclick, 0, "", "", "", "", "", 1, edtArt_PmlP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Ancho Prefijado-Secado", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_AncP_Internalname, GXutil.ltrim( localUtil.ntoc( A8083Art_AncP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_AncP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8083Art_AncP), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8083Art_AncP), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_AncP_Jsonclick, 0, "", "", "", "", "", 1, edtArt_AncP_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Rdo Prefijado-Secado", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_RdoP_Internalname, GXutil.ltrim( localUtil.ntoc( A8084Art_RdoP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt_RdoP_Enabled!=0) ? localUtil.format( A8084Art_RdoP, "ZZ9.99") : localUtil.format( A8084Art_RdoP, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_RdoP_Jsonclick, 0, "", "", "", "", "", 1, edtArt_RdoP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Desceripcion II", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Dsc_Internalname, GXutil.rtrim( A8165Art_Dsc), GXutil.rtrim( localUtil.format( A8165Art_Dsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Dsc_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Dsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Und_Internalname, GXutil.rtrim( A8166Art_Und), GXutil.rtrim( localUtil.format( A8166Art_Und, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Und_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Und_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Art Obs", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtArt_Obs_Internalname, A8955Art_Obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", (short)(0), 1, edtArt_Obs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "800", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "ETS Salida", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_ets_Internalname, GXutil.rtrim( A9628Art_ets), GXutil.rtrim( localUtil.format( A9628Art_ets, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_ets_Jsonclick, 0, "", "", "", "", "", 1, edtArt_ets_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "ELS Salida", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_els_Internalname, GXutil.rtrim( A9629Art_els), GXutil.rtrim( localUtil.format( A9629Art_els, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_els_Jsonclick, 0, "", "", "", "", "", 1, edtArt_els_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Aceptada", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProSta_Internalname, GXutil.ltrim( localUtil.ntoc( A12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProSta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12141ProSta), "9") : localUtil.format( DecimalUtil.doubleToDec(A12141ProSta), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProSta_Jsonclick, 0, "", "", "", "", "", 1, edtProSta_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Tipo Muestras,Verificacion, etc", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTDAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt_Tipo_Internalname, GXutil.rtrim( A12752Art_Tipo), GXutil.rtrim( localUtil.format( A12752Art_Tipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt_Tipo_Jsonclick, 0, "", "", "", "", "", 1, edtArt_Tipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTDAT.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTDAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TARTDAT.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z8074Art_Rdpc = localUtil.ctond( httpContext.cgiGet( "Z8074Art_Rdpc")) ;
         Z8065Art_GrmA = (short)(localUtil.ctol( httpContext.cgiGet( "Z8065Art_GrmA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8066Art_AncA = (short)(localUtil.ctol( httpContext.cgiGet( "Z8066Art_AncA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8067Art_Merma = localUtil.ctond( httpContext.cgiGet( "Z8067Art_Merma")) ;
         Z8068Art_PmlA = (short)(localUtil.ctol( httpContext.cgiGet( "Z8068Art_PmlA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8069Art_Eanc = (short)(localUtil.ctol( httpContext.cgiGet( "Z8069Art_Eanc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8070Art_Elar = (short)(localUtil.ctol( httpContext.cgiGet( "Z8070Art_Elar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8071Art_Enc = httpContext.cgiGet( "Z8071Art_Enc") ;
         Z8072Art_Cor = httpContext.cgiGet( "Z8072Art_Cor") ;
         Z8073Art_Rdo = localUtil.ctond( httpContext.cgiGet( "Z8073Art_Rdo")) ;
         Z8075Art_Fabs = localUtil.ctond( httpContext.cgiGet( "Z8075Art_Fabs")) ;
         Z8076Art_AncB = (short)(localUtil.ctol( httpContext.cgiGet( "Z8076Art_AncB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8077Art_GrmB = (short)(localUtil.ctol( httpContext.cgiGet( "Z8077Art_GrmB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8078Art_GrmC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8078Art_GrmC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8079Art_AncC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8079Art_AncC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8080Art_PmlC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8080Art_PmlC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8081Art_GrmP = (short)(localUtil.ctol( httpContext.cgiGet( "Z8081Art_GrmP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8082Art_PmlP = (short)(localUtil.ctol( httpContext.cgiGet( "Z8082Art_PmlP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8083Art_AncP = (short)(localUtil.ctol( httpContext.cgiGet( "Z8083Art_AncP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8084Art_RdoP = localUtil.ctond( httpContext.cgiGet( "Z8084Art_RdoP")) ;
         Z8165Art_Dsc = httpContext.cgiGet( "Z8165Art_Dsc") ;
         Z8166Art_Und = httpContext.cgiGet( "Z8166Art_Und") ;
         Z8955Art_Obs = httpContext.cgiGet( "Z8955Art_Obs") ;
         Z9628Art_ets = httpContext.cgiGet( "Z9628Art_ets") ;
         Z9629Art_els = httpContext.cgiGet( "Z9629Art_els") ;
         Z12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12141ProSta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12752Art_Tipo = httpContext.cgiGet( "Z12752Art_Tipo") ;
         O8078Art_GrmC = (short)(localUtil.ctol( httpContext.cgiGet( "O8078Art_GrmC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O9629Art_els = httpContext.cgiGet( "O9629Art_els") ;
         O9628Art_ets = httpContext.cgiGet( "O9628Art_ets") ;
         O8084Art_RdoP = localUtil.ctond( httpContext.cgiGet( "O8084Art_RdoP")) ;
         O8083Art_AncP = (short)(localUtil.ctol( httpContext.cgiGet( "O8083Art_AncP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8082Art_PmlP = (short)(localUtil.ctol( httpContext.cgiGet( "O8082Art_PmlP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8081Art_GrmP = (short)(localUtil.ctol( httpContext.cgiGet( "O8081Art_GrmP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8080Art_PmlC = (short)(localUtil.ctol( httpContext.cgiGet( "O8080Art_PmlC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8079Art_AncC = (short)(localUtil.ctol( httpContext.cgiGet( "O8079Art_AncC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8077Art_GrmB = (short)(localUtil.ctol( httpContext.cgiGet( "O8077Art_GrmB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8076Art_AncB = (short)(localUtil.ctol( httpContext.cgiGet( "O8076Art_AncB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8075Art_Fabs = localUtil.ctond( httpContext.cgiGet( "O8075Art_Fabs")) ;
         O8074Art_Rdpc = localUtil.ctond( httpContext.cgiGet( "O8074Art_Rdpc")) ;
         O8073Art_Rdo = localUtil.ctond( httpContext.cgiGet( "O8073Art_Rdo")) ;
         O8072Art_Cor = httpContext.cgiGet( "O8072Art_Cor") ;
         O8071Art_Enc = httpContext.cgiGet( "O8071Art_Enc") ;
         O8070Art_Elar = (short)(localUtil.ctol( httpContext.cgiGet( "O8070Art_Elar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8069Art_Eanc = (short)(localUtil.ctol( httpContext.cgiGet( "O8069Art_Eanc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8068Art_PmlA = (short)(localUtil.ctol( httpContext.cgiGet( "O8068Art_PmlA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8067Art_Merma = localUtil.ctond( httpContext.cgiGet( "O8067Art_Merma")) ;
         O8066Art_AncA = (short)(localUtil.ctol( httpContext.cgiGet( "O8066Art_AncA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8065Art_GrmA = (short)(localUtil.ctol( httpContext.cgiGet( "O8065Art_GrmA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         AV32Modif = httpContext.cgiGet( "vMODIF") ;
         AV36Art_GrmA = (short)(localUtil.ctol( httpContext.cgiGet( "vART_GRMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37Art_AncA = (short)(localUtil.ctol( httpContext.cgiGet( "vART_ANCA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38Art_Merma = localUtil.ctond( httpContext.cgiGet( "vART_MERMA")) ;
         AV39Art_PmlA = (short)(localUtil.ctol( httpContext.cgiGet( "vART_PMLA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40Art_Eanc = (short)(localUtil.ctol( httpContext.cgiGet( "vART_EANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41Art_Elar = (short)(localUtil.ctol( httpContext.cgiGet( "vART_ELAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42Art_Enc = httpContext.cgiGet( "vART_ENC") ;
         AV43Art_Cor = httpContext.cgiGet( "vART_COR") ;
         AV44Art_Rdo = localUtil.ctond( httpContext.cgiGet( "vART_RDO")) ;
         AV45Art_Rdpc = localUtil.ctond( httpContext.cgiGet( "vART_RDPC")) ;
         AV46Art_Fabs = localUtil.ctond( httpContext.cgiGet( "vART_FABS")) ;
         AV47Art_AncB = (short)(localUtil.ctol( httpContext.cgiGet( "vART_ANCB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48Art_GrmB = (short)(localUtil.ctol( httpContext.cgiGet( "vART_GRMB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV49Art_GrmC = (short)(localUtil.ctol( httpContext.cgiGet( "vART_GRMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50Art_Ancc = (short)(localUtil.ctol( httpContext.cgiGet( "vART_ANCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51Art_PmlC = (short)(localUtil.ctol( httpContext.cgiGet( "vART_PMLC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52Art_GrmP = (short)(localUtil.ctol( httpContext.cgiGet( "vART_GRMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53Art_Pmlp = (short)(localUtil.ctol( httpContext.cgiGet( "vART_PMLP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54Art_ancP = (short)(localUtil.ctol( httpContext.cgiGet( "vART_ANCP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV55Art_rdop = localUtil.ctond( httpContext.cgiGet( "vART_RDOP")) ;
         AV56Art_ets = httpContext.cgiGet( "vART_ETS") ;
         AV57Art_els = httpContext.cgiGet( "vART_ELS") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
         AV35Texto_ii = httpContext.cgiGet( "vTEXTO_II") ;
         AV33Msg_e = httpContext.cgiGet( "vMSG_E") ;
         AV12Station = httpContext.cgiGet( "vSTATION") ;
         AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV59Pgmname = httpContext.cgiGet( "vPGMNAME") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A3682ArtAnu = GXutil.upper( httpContext.cgiGet( edtArtAnu_Internalname)) ;
         n3682ArtAnu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3682ArtAnu", A3682ArtAnu);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_GRMA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_GrmA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8065Art_GrmA = (short)(0) ;
            n8065Art_GrmA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
         }
         else
         {
            A8065Art_GrmA = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_GrmA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8065Art_GrmA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_ANCA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_AncA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8066Art_AncA = (short)(0) ;
            n8066Art_AncA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
         }
         else
         {
            A8066Art_AncA = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_AncA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8066Art_AncA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArt_Merma_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArt_Merma_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_MERMA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_Merma_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8067Art_Merma = DecimalUtil.ZERO ;
            n8067Art_Merma = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
         }
         else
         {
            A8067Art_Merma = localUtil.ctond( httpContext.cgiGet( edtArt_Merma_Internalname)) ;
            n8067Art_Merma = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_PmlA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_PmlA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_PMLA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_PmlA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8068Art_PmlA = (short)(0) ;
            n8068Art_PmlA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
         }
         else
         {
            A8068Art_PmlA = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_PmlA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8068Art_PmlA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_Eanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_Eanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_EANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_Eanc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8069Art_Eanc = (short)(0) ;
            n8069Art_Eanc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
         }
         else
         {
            A8069Art_Eanc = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_Eanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8069Art_Eanc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_Elar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_Elar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_ELAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_Elar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8070Art_Elar = (short)(0) ;
            n8070Art_Elar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
         }
         else
         {
            A8070Art_Elar = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_Elar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8070Art_Elar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
         }
         A8071Art_Enc = GXutil.upper( httpContext.cgiGet( edtArt_Enc_Internalname)) ;
         n8071Art_Enc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", A8071Art_Enc);
         A8072Art_Cor = GXutil.upper( httpContext.cgiGet( edtArt_Cor_Internalname)) ;
         n8072Art_Cor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", A8072Art_Cor);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArt_Rdo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArt_Rdo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_RDO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_Rdo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8073Art_Rdo = DecimalUtil.ZERO ;
            n8073Art_Rdo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
         }
         else
         {
            A8073Art_Rdo = localUtil.ctond( httpContext.cgiGet( edtArt_Rdo_Internalname)) ;
            n8073Art_Rdo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArt_Rdpc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArt_Rdpc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_RDPC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_Rdpc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8074Art_Rdpc = DecimalUtil.ZERO ;
            n8074Art_Rdpc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
         }
         else
         {
            A8074Art_Rdpc = localUtil.ctond( httpContext.cgiGet( edtArt_Rdpc_Internalname)) ;
            n8074Art_Rdpc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArt_Fabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArt_Fabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_FABS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_Fabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8075Art_Fabs = DecimalUtil.ZERO ;
            n8075Art_Fabs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
         }
         else
         {
            A8075Art_Fabs = localUtil.ctond( httpContext.cgiGet( edtArt_Fabs_Internalname)) ;
            n8075Art_Fabs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_ANCB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_AncB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8076Art_AncB = (short)(0) ;
            n8076Art_AncB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
         }
         else
         {
            A8076Art_AncB = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_AncB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8076Art_AncB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_GRMB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_GrmB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8077Art_GrmB = (short)(0) ;
            n8077Art_GrmB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
         }
         else
         {
            A8077Art_GrmB = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_GrmB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8077Art_GrmB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_GRMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_GrmC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8078Art_GrmC = (short)(0) ;
            n8078Art_GrmC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
         }
         else
         {
            A8078Art_GrmC = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_GrmC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8078Art_GrmC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_ANCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_AncC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8079Art_AncC = (short)(0) ;
            n8079Art_AncC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
         }
         else
         {
            A8079Art_AncC = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_AncC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8079Art_AncC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_PmlC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_PmlC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_PMLC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_PmlC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8080Art_PmlC = (short)(0) ;
            n8080Art_PmlC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
         }
         else
         {
            A8080Art_PmlC = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_PmlC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8080Art_PmlC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_GrmP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_GRMP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_GrmP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8081Art_GrmP = (short)(0) ;
            n8081Art_GrmP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
         }
         else
         {
            A8081Art_GrmP = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_GrmP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8081Art_GrmP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_PmlP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_PmlP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_PMLP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_PmlP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8082Art_PmlP = (short)(0) ;
            n8082Art_PmlP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
         }
         else
         {
            A8082Art_PmlP = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_PmlP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8082Art_PmlP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArt_AncP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_ANCP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_AncP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8083Art_AncP = (short)(0) ;
            n8083Art_AncP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
         }
         else
         {
            A8083Art_AncP = (short)(localUtil.ctol( httpContext.cgiGet( edtArt_AncP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8083Art_AncP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArt_RdoP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArt_RdoP_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART_RDOP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt_RdoP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8084Art_RdoP = DecimalUtil.ZERO ;
            n8084Art_RdoP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
         }
         else
         {
            A8084Art_RdoP = localUtil.ctond( httpContext.cgiGet( edtArt_RdoP_Internalname)) ;
            n8084Art_RdoP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
         }
         A8165Art_Dsc = httpContext.cgiGet( edtArt_Dsc_Internalname) ;
         n8165Art_Dsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
         A8166Art_Und = GXutil.upper( httpContext.cgiGet( edtArt_Und_Internalname)) ;
         n8166Art_Und = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", A8166Art_Und);
         A8955Art_Obs = httpContext.cgiGet( edtArt_Obs_Internalname) ;
         n8955Art_Obs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8955Art_Obs", A8955Art_Obs);
         A9628Art_ets = httpContext.cgiGet( edtArt_ets_Internalname) ;
         n9628Art_ets = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", A9628Art_ets);
         A9629Art_els = httpContext.cgiGet( edtArt_els_Internalname) ;
         n9629Art_els = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", A9629Art_els);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROSTA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProSta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12141ProSta = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
         }
         else
         {
            A12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( edtProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
         }
         A12752Art_Tipo = httpContext.cgiGet( edtArt_Tipo_Internalname) ;
         n12752Art_Tipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12752Art_Tipo", A12752Art_Tipo);
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            getEqualNoModal( ) ;
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
            initAll11211( ) ;
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
      disableAttributes11211( ) ;
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

   public void confirm_1120( )
   {
      beforeValidate11211( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls11211( ) ;
         }
         else
         {
            checkExtendedTable11211( ) ;
            if ( AnyError == 0 )
            {
               zm11211( 37) ;
               zm11211( 38) ;
               zm11211( 39) ;
               zm11211( 40) ;
            }
            closeExtendedTableCursors11211( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1120( ) ;
      }
   }

   public void resetCaption1120( )
   {
   }

   public void zm11211( int GX_JID )
   {
      if ( ( GX_JID == 36 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8074Art_Rdpc = T01123_A8074Art_Rdpc[0] ;
            Z8065Art_GrmA = T01123_A8065Art_GrmA[0] ;
            Z8066Art_AncA = T01123_A8066Art_AncA[0] ;
            Z8067Art_Merma = T01123_A8067Art_Merma[0] ;
            Z8068Art_PmlA = T01123_A8068Art_PmlA[0] ;
            Z8069Art_Eanc = T01123_A8069Art_Eanc[0] ;
            Z8070Art_Elar = T01123_A8070Art_Elar[0] ;
            Z8071Art_Enc = T01123_A8071Art_Enc[0] ;
            Z8072Art_Cor = T01123_A8072Art_Cor[0] ;
            Z8073Art_Rdo = T01123_A8073Art_Rdo[0] ;
            Z8075Art_Fabs = T01123_A8075Art_Fabs[0] ;
            Z8076Art_AncB = T01123_A8076Art_AncB[0] ;
            Z8077Art_GrmB = T01123_A8077Art_GrmB[0] ;
            Z8078Art_GrmC = T01123_A8078Art_GrmC[0] ;
            Z8079Art_AncC = T01123_A8079Art_AncC[0] ;
            Z8080Art_PmlC = T01123_A8080Art_PmlC[0] ;
            Z8081Art_GrmP = T01123_A8081Art_GrmP[0] ;
            Z8082Art_PmlP = T01123_A8082Art_PmlP[0] ;
            Z8083Art_AncP = T01123_A8083Art_AncP[0] ;
            Z8084Art_RdoP = T01123_A8084Art_RdoP[0] ;
            Z8165Art_Dsc = T01123_A8165Art_Dsc[0] ;
            Z8166Art_Und = T01123_A8166Art_Und[0] ;
            Z8955Art_Obs = T01123_A8955Art_Obs[0] ;
            Z9628Art_ets = T01123_A9628Art_ets[0] ;
            Z9629Art_els = T01123_A9629Art_els[0] ;
            Z12141ProSta = T01123_A12141ProSta[0] ;
            Z12752Art_Tipo = T01123_A12752Art_Tipo[0] ;
         }
         else
         {
            Z8074Art_Rdpc = A8074Art_Rdpc ;
            Z8065Art_GrmA = A8065Art_GrmA ;
            Z8066Art_AncA = A8066Art_AncA ;
            Z8067Art_Merma = A8067Art_Merma ;
            Z8068Art_PmlA = A8068Art_PmlA ;
            Z8069Art_Eanc = A8069Art_Eanc ;
            Z8070Art_Elar = A8070Art_Elar ;
            Z8071Art_Enc = A8071Art_Enc ;
            Z8072Art_Cor = A8072Art_Cor ;
            Z8073Art_Rdo = A8073Art_Rdo ;
            Z8075Art_Fabs = A8075Art_Fabs ;
            Z8076Art_AncB = A8076Art_AncB ;
            Z8077Art_GrmB = A8077Art_GrmB ;
            Z8078Art_GrmC = A8078Art_GrmC ;
            Z8079Art_AncC = A8079Art_AncC ;
            Z8080Art_PmlC = A8080Art_PmlC ;
            Z8081Art_GrmP = A8081Art_GrmP ;
            Z8082Art_PmlP = A8082Art_PmlP ;
            Z8083Art_AncP = A8083Art_AncP ;
            Z8084Art_RdoP = A8084Art_RdoP ;
            Z8165Art_Dsc = A8165Art_Dsc ;
            Z8166Art_Und = A8166Art_Und ;
            Z8955Art_Obs = A8955Art_Obs ;
            Z9628Art_ets = A9628Art_ets ;
            Z9629Art_els = A9629Art_els ;
            Z12141ProSta = A12141ProSta ;
            Z12752Art_Tipo = A12752Art_Tipo ;
         }
      }
      if ( GX_JID == -36 )
      {
         Z8074Art_Rdpc = A8074Art_Rdpc ;
         Z8065Art_GrmA = A8065Art_GrmA ;
         Z8066Art_AncA = A8066Art_AncA ;
         Z8067Art_Merma = A8067Art_Merma ;
         Z8068Art_PmlA = A8068Art_PmlA ;
         Z8069Art_Eanc = A8069Art_Eanc ;
         Z8070Art_Elar = A8070Art_Elar ;
         Z8071Art_Enc = A8071Art_Enc ;
         Z8072Art_Cor = A8072Art_Cor ;
         Z8073Art_Rdo = A8073Art_Rdo ;
         Z8075Art_Fabs = A8075Art_Fabs ;
         Z8076Art_AncB = A8076Art_AncB ;
         Z8077Art_GrmB = A8077Art_GrmB ;
         Z8078Art_GrmC = A8078Art_GrmC ;
         Z8079Art_AncC = A8079Art_AncC ;
         Z8080Art_PmlC = A8080Art_PmlC ;
         Z8081Art_GrmP = A8081Art_GrmP ;
         Z8082Art_PmlP = A8082Art_PmlP ;
         Z8083Art_AncP = A8083Art_AncP ;
         Z8084Art_RdoP = A8084Art_RdoP ;
         Z8165Art_Dsc = A8165Art_Dsc ;
         Z8166Art_Und = A8166Art_Und ;
         Z8955Art_Obs = A8955Art_Obs ;
         Z9628Art_ets = A9628Art_ets ;
         Z9629Art_els = A9629Art_els ;
         Z12141ProSta = A12141ProSta ;
         Z12752Art_Tipo = A12752Art_Tipo ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z3682ArtAnu = A3682ArtAnu ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV59Pgmname = "TARTDAT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01124 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01124_A407EmprNom[0] ;
      n407EmprNom = T01124_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01125 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01125_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01126 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T01126_A69ArtDsc[0] ;
      n69ArtDsc = T01126_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A3682ArtAnu = T01126_A3682ArtAnu[0] ;
      n3682ArtAnu = T01126_n3682ArtAnu[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3682ArtAnu", A3682ArtAnu);
      pr_default.close(4);
      /* Using cursor T01127 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01127_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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
      if ( isIns( )  && (GXutil.strcmp("", A8166Art_Und)==0) && ( Gx_BScreen == 0 ) )
      {
         A8166Art_Und = "*" ;
         n8166Art_Und = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", A8166Art_Und);
      }
      if ( isIns( )  && (GXutil.strcmp("", A8165Art_Dsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A8165Art_Dsc = A69ArtDsc ;
         n8165Art_Dsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load11211( )
   {
      /* Using cursor T01128 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A8074Art_Rdpc = T01128_A8074Art_Rdpc[0] ;
         n8074Art_Rdpc = T01128_n8074Art_Rdpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
         A279CliNom = T01128_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T01128_A407EmprNom[0] ;
         n407EmprNom = T01128_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A69ArtDsc = T01128_A69ArtDsc[0] ;
         n69ArtDsc = T01128_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A3682ArtAnu = T01128_A3682ArtAnu[0] ;
         n3682ArtAnu = T01128_n3682ArtAnu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3682ArtAnu", A3682ArtAnu);
         A759ProDsc = T01128_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A8065Art_GrmA = T01128_A8065Art_GrmA[0] ;
         n8065Art_GrmA = T01128_n8065Art_GrmA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
         A8066Art_AncA = T01128_A8066Art_AncA[0] ;
         n8066Art_AncA = T01128_n8066Art_AncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
         A8067Art_Merma = T01128_A8067Art_Merma[0] ;
         n8067Art_Merma = T01128_n8067Art_Merma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
         A8068Art_PmlA = T01128_A8068Art_PmlA[0] ;
         n8068Art_PmlA = T01128_n8068Art_PmlA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
         A8069Art_Eanc = T01128_A8069Art_Eanc[0] ;
         n8069Art_Eanc = T01128_n8069Art_Eanc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
         A8070Art_Elar = T01128_A8070Art_Elar[0] ;
         n8070Art_Elar = T01128_n8070Art_Elar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
         A8071Art_Enc = T01128_A8071Art_Enc[0] ;
         n8071Art_Enc = T01128_n8071Art_Enc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", A8071Art_Enc);
         A8072Art_Cor = T01128_A8072Art_Cor[0] ;
         n8072Art_Cor = T01128_n8072Art_Cor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", A8072Art_Cor);
         A8073Art_Rdo = T01128_A8073Art_Rdo[0] ;
         n8073Art_Rdo = T01128_n8073Art_Rdo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
         A8075Art_Fabs = T01128_A8075Art_Fabs[0] ;
         n8075Art_Fabs = T01128_n8075Art_Fabs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
         A8076Art_AncB = T01128_A8076Art_AncB[0] ;
         n8076Art_AncB = T01128_n8076Art_AncB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
         A8077Art_GrmB = T01128_A8077Art_GrmB[0] ;
         n8077Art_GrmB = T01128_n8077Art_GrmB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
         A8078Art_GrmC = T01128_A8078Art_GrmC[0] ;
         n8078Art_GrmC = T01128_n8078Art_GrmC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
         A8079Art_AncC = T01128_A8079Art_AncC[0] ;
         n8079Art_AncC = T01128_n8079Art_AncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
         A8080Art_PmlC = T01128_A8080Art_PmlC[0] ;
         n8080Art_PmlC = T01128_n8080Art_PmlC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
         A8081Art_GrmP = T01128_A8081Art_GrmP[0] ;
         n8081Art_GrmP = T01128_n8081Art_GrmP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
         A8082Art_PmlP = T01128_A8082Art_PmlP[0] ;
         n8082Art_PmlP = T01128_n8082Art_PmlP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
         A8083Art_AncP = T01128_A8083Art_AncP[0] ;
         n8083Art_AncP = T01128_n8083Art_AncP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
         A8084Art_RdoP = T01128_A8084Art_RdoP[0] ;
         n8084Art_RdoP = T01128_n8084Art_RdoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
         A8165Art_Dsc = T01128_A8165Art_Dsc[0] ;
         n8165Art_Dsc = T01128_n8165Art_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
         A8166Art_Und = T01128_A8166Art_Und[0] ;
         n8166Art_Und = T01128_n8166Art_Und[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", A8166Art_Und);
         A8955Art_Obs = T01128_A8955Art_Obs[0] ;
         n8955Art_Obs = T01128_n8955Art_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8955Art_Obs", A8955Art_Obs);
         A9628Art_ets = T01128_A9628Art_ets[0] ;
         n9628Art_ets = T01128_n9628Art_ets[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", A9628Art_ets);
         A9629Art_els = T01128_A9629Art_els[0] ;
         n9629Art_els = T01128_n9629Art_els[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", A9629Art_els);
         A12141ProSta = T01128_A12141ProSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
         A12752Art_Tipo = T01128_A12752Art_Tipo[0] ;
         n12752Art_Tipo = T01128_n12752Art_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12752Art_Tipo", A12752Art_Tipo);
         zm11211( -36) ;
      }
      pr_default.close(6);
      onLoadActions11211( ) ;
   }

   public void onLoadActions11211( )
   {
      AV36Art_GrmA = O8065Art_GrmA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Art_GrmA), 4, 0));
      AV37Art_AncA = O8066Art_AncA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Art_AncA), 3, 0));
      AV38Art_Merma = O8067Art_Merma ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Art_Merma", GXutil.ltrimstr( AV38Art_Merma, 5, 2));
      if ( ( A8068Art_PmlA > 0 ) && true /* After */ )
      {
         A8074Art_Rdpc = DecimalUtil.doubleToDec(1000/ (double) (A8068Art_PmlA)) ;
         n8074Art_Rdpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
      }
      AV39Art_PmlA = O8068Art_PmlA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Art_PmlA), 4, 0));
      AV40Art_Eanc = O8069Art_Eanc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Art_Eanc), 4, 0));
      AV41Art_Elar = O8070Art_Elar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Art_Elar), 4, 0));
      AV42Art_Enc = O8071Art_Enc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Art_Enc", AV42Art_Enc);
      AV43Art_Cor = O8072Art_Cor ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Art_Cor", AV43Art_Cor);
      AV44Art_Rdo = O8073Art_Rdo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Art_Rdo", GXutil.ltrimstr( AV44Art_Rdo, 6, 2));
      AV45Art_Rdpc = O8074Art_Rdpc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Art_Rdpc", GXutil.ltrimstr( AV45Art_Rdpc, 6, 2));
      AV46Art_Fabs = O8075Art_Fabs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Art_Fabs", GXutil.ltrimstr( AV46Art_Fabs, 6, 2));
      AV47Art_AncB = O8076Art_AncB ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Art_AncB), 4, 0));
      AV48Art_GrmB = O8077Art_GrmB ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Art_GrmB), 4, 0));
      AV34Texto_i = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Grm2A=", ""), "") + GXutil.str( A8065Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2A=", ""), "") + GXutil.str( AV36Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "AnchoA", ""), "") + GXutil.str( A8066Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "oldAnchoA=", ""), "") + GXutil.str( AV37Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "Merma=", ""), "") + GXutil.str( A8067Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "OldMerma=", ""), "") + GXutil.str( AV38Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "PmlA=", ""), "") + GXutil.str( A8068Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlA=", ""), "") + GXutil.str( AV39Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncAnc=", ""), "") + GXutil.str( A8069Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncAnc=", ""), "") + GXutil.str( AV40Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncLar=", ""), "") + GXutil.str( A8070Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncLar=", ""), "") + GXutil.str( AV41Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Enc=", ""), "") + A8071Art_Enc + httpContext.getMessage( httpContext.getMessage( "OldArt_Enc=", ""), "") + AV42Art_Enc + httpContext.getMessage( httpContext.getMessage( "Art_Cor=", ""), "") + A8072Art_Cor + httpContext.getMessage( httpContext.getMessage( "OldArt_Cor=", ""), "") + AV43Art_Cor + httpContext.getMessage( httpContext.getMessage( "Art_Rdo=", ""), "") + GXutil.str( A8073Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldArt_Rdo=", ""), "") + GXutil.str( AV44Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "RdoCalc=", ""), "") + GXutil.str( A8074Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoCalc=", ""), "") + GXutil.str( AV45Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Fac Abs=", ""), "") + GXutil.str( A8075Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldFac Abs=", ""), "") + GXutil.str( AV46Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Art_AncB=", ""), "") + GXutil.str( A8076Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_AncB=", ""), "") + GXutil.str( AV47Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2AAC=", ""), "") + GXutil.str( A8077Art_GrmB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2AAC=", ""), "") + GXutil.str( AV48Art_GrmB, 4, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
      AV49Art_GrmC = O8078Art_GrmC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Art_GrmC), 4, 0));
      AV50Art_Ancc = O8079Art_AncC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Art_Ancc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Art_Ancc), 3, 0));
      AV51Art_PmlC = O8080Art_PmlC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Art_PmlC), 4, 0));
      AV52Art_GrmP = O8081Art_GrmP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Art_GrmP), 4, 0));
      AV53Art_Pmlp = O8082Art_PmlP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Art_Pmlp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Art_Pmlp), 4, 0));
      AV54Art_ancP = O8083Art_AncP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Art_ancP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Art_ancP), 3, 0));
      AV55Art_rdop = O8084Art_RdoP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Art_rdop", GXutil.ltrimstr( AV55Art_rdop, 6, 2));
      AV56Art_ets = O9628Art_ets ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Art_ets", AV56Art_ets);
      AV57Art_els = O9629Art_els ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Art_els", AV57Art_els);
      AV35Texto_ii = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Art_GrmC=", ""), "") + GXutil.str( A8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_GrmC=", ""), "") + GXutil.str( O8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Ancc=", ""), "") + GXutil.str( A8079Art_AncC, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_ancc=", ""), "") + GXutil.str( AV50Art_Ancc, 3, 0) + httpContext.getMessage( httpContext.getMessage( "PmlAAC=", ""), "") + GXutil.str( A8080Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlAAC=", ""), "") + GXutil.str( AV51Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2P=", ""), "") + GXutil.str( A8081Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2P=", ""), "") + GXutil.str( AV52Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Pmlp=", ""), "") + GXutil.str( A8082Art_PmlP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_Pmlp=", ""), "") + GXutil.str( AV53Art_Pmlp, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Ancho P=", ""), "") + GXutil.str( A8083Art_AncP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldAncho P=", ""), "") + GXutil.str( AV54Art_ancP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "RdoP=", ""), "") + GXutil.str( A8084Art_RdoP, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoP=", ""), "") + GXutil.str( AV55Art_rdop, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Ets=", ""), "") + A9628Art_ets + httpContext.getMessage( httpContext.getMessage( "OldEts=", ""), "") + AV56Art_ets + httpContext.getMessage( httpContext.getMessage( "Els=", ""), "") + A9629Art_els + httpContext.getMessage( httpContext.getMessage( "OldEls=", ""), "") + AV57Art_els ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
   }

   public void checkExtendedTable11211( )
   {
      nIsDirty_11 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV36Art_GrmA = O8065Art_GrmA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Art_GrmA), 4, 0));
      AV37Art_AncA = O8066Art_AncA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Art_AncA), 3, 0));
      AV38Art_Merma = O8067Art_Merma ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Art_Merma", GXutil.ltrimstr( AV38Art_Merma, 5, 2));
      if ( ( A8068Art_PmlA > 0 ) && true /* After */ )
      {
         nIsDirty_11 = (short)(1) ;
         A8074Art_Rdpc = DecimalUtil.doubleToDec(1000/ (double) (A8068Art_PmlA)) ;
         n8074Art_Rdpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
      }
      AV39Art_PmlA = O8068Art_PmlA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Art_PmlA), 4, 0));
      AV40Art_Eanc = O8069Art_Eanc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Art_Eanc), 4, 0));
      AV41Art_Elar = O8070Art_Elar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Art_Elar), 4, 0));
      if ( ! ( ( GXutil.strcmp(A8071Art_Enc, "S") == 0 ) || ( GXutil.strcmp(A8071Art_Enc, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ART_ENC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArt_Enc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV42Art_Enc = O8071Art_Enc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Art_Enc", AV42Art_Enc);
      if ( ! ( ( GXutil.strcmp(A8072Art_Cor, "S") == 0 ) || ( GXutil.strcmp(A8072Art_Cor, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ART_COR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArt_Cor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV43Art_Cor = O8072Art_Cor ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Art_Cor", AV43Art_Cor);
      AV44Art_Rdo = O8073Art_Rdo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Art_Rdo", GXutil.ltrimstr( AV44Art_Rdo, 6, 2));
      AV45Art_Rdpc = O8074Art_Rdpc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Art_Rdpc", GXutil.ltrimstr( AV45Art_Rdpc, 6, 2));
      AV46Art_Fabs = O8075Art_Fabs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Art_Fabs", GXutil.ltrimstr( AV46Art_Fabs, 6, 2));
      AV47Art_AncB = O8076Art_AncB ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Art_AncB), 4, 0));
      AV48Art_GrmB = O8077Art_GrmB ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Art_GrmB), 4, 0));
      AV34Texto_i = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Grm2A=", ""), "") + GXutil.str( A8065Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2A=", ""), "") + GXutil.str( AV36Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "AnchoA", ""), "") + GXutil.str( A8066Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "oldAnchoA=", ""), "") + GXutil.str( AV37Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "Merma=", ""), "") + GXutil.str( A8067Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "OldMerma=", ""), "") + GXutil.str( AV38Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "PmlA=", ""), "") + GXutil.str( A8068Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlA=", ""), "") + GXutil.str( AV39Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncAnc=", ""), "") + GXutil.str( A8069Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncAnc=", ""), "") + GXutil.str( AV40Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncLar=", ""), "") + GXutil.str( A8070Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncLar=", ""), "") + GXutil.str( AV41Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Enc=", ""), "") + A8071Art_Enc + httpContext.getMessage( httpContext.getMessage( "OldArt_Enc=", ""), "") + AV42Art_Enc + httpContext.getMessage( httpContext.getMessage( "Art_Cor=", ""), "") + A8072Art_Cor + httpContext.getMessage( httpContext.getMessage( "OldArt_Cor=", ""), "") + AV43Art_Cor + httpContext.getMessage( httpContext.getMessage( "Art_Rdo=", ""), "") + GXutil.str( A8073Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldArt_Rdo=", ""), "") + GXutil.str( AV44Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "RdoCalc=", ""), "") + GXutil.str( A8074Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoCalc=", ""), "") + GXutil.str( AV45Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Fac Abs=", ""), "") + GXutil.str( A8075Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldFac Abs=", ""), "") + GXutil.str( AV46Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Art_AncB=", ""), "") + GXutil.str( A8076Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_AncB=", ""), "") + GXutil.str( AV47Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2AAC=", ""), "") + GXutil.str( A8077Art_GrmB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2AAC=", ""), "") + GXutil.str( AV48Art_GrmB, 4, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
      AV49Art_GrmC = O8078Art_GrmC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Art_GrmC), 4, 0));
      AV50Art_Ancc = O8079Art_AncC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Art_Ancc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Art_Ancc), 3, 0));
      AV51Art_PmlC = O8080Art_PmlC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Art_PmlC), 4, 0));
      AV52Art_GrmP = O8081Art_GrmP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Art_GrmP), 4, 0));
      AV53Art_Pmlp = O8082Art_PmlP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Art_Pmlp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Art_Pmlp), 4, 0));
      AV54Art_ancP = O8083Art_AncP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Art_ancP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Art_ancP), 3, 0));
      AV55Art_rdop = O8084Art_RdoP ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Art_rdop", GXutil.ltrimstr( AV55Art_rdop, 6, 2));
      if ( GXutil.strcmp(A8165Art_Dsc, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Descripcion Articulo OBLIGATORIA", ""), 0, "ART_DSC");
      }
      AV56Art_ets = O9628Art_ets ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Art_ets", AV56Art_ets);
      AV57Art_els = O9629Art_els ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Art_els", AV57Art_els);
      AV35Texto_ii = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Art_GrmC=", ""), "") + GXutil.str( A8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_GrmC=", ""), "") + GXutil.str( O8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Ancc=", ""), "") + GXutil.str( A8079Art_AncC, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_ancc=", ""), "") + GXutil.str( AV50Art_Ancc, 3, 0) + httpContext.getMessage( httpContext.getMessage( "PmlAAC=", ""), "") + GXutil.str( A8080Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlAAC=", ""), "") + GXutil.str( AV51Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2P=", ""), "") + GXutil.str( A8081Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2P=", ""), "") + GXutil.str( AV52Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Pmlp=", ""), "") + GXutil.str( A8082Art_PmlP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_Pmlp=", ""), "") + GXutil.str( AV53Art_Pmlp, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Ancho P=", ""), "") + GXutil.str( A8083Art_AncP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldAncho P=", ""), "") + GXutil.str( AV54Art_ancP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "RdoP=", ""), "") + GXutil.str( A8084Art_RdoP, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoP=", ""), "") + GXutil.str( AV55Art_rdop, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Ets=", ""), "") + A9628Art_ets + httpContext.getMessage( httpContext.getMessage( "OldEts=", ""), "") + AV56Art_ets + httpContext.getMessage( httpContext.getMessage( "Els=", ""), "") + A9629Art_els + httpContext.getMessage( httpContext.getMessage( "OldEls=", ""), "") + AV57Art_els ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
   }

   public void closeExtendedTableCursors11211( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey11211( )
   {
      /* Using cursor T01129 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01123 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01123_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01123_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01123_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01123_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm11211( 36) ;
         RcdFound11 = (short)(1) ;
         A8074Art_Rdpc = T01123_A8074Art_Rdpc[0] ;
         n8074Art_Rdpc = T01123_n8074Art_Rdpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
         A8065Art_GrmA = T01123_A8065Art_GrmA[0] ;
         n8065Art_GrmA = T01123_n8065Art_GrmA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
         A8066Art_AncA = T01123_A8066Art_AncA[0] ;
         n8066Art_AncA = T01123_n8066Art_AncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
         A8067Art_Merma = T01123_A8067Art_Merma[0] ;
         n8067Art_Merma = T01123_n8067Art_Merma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
         A8068Art_PmlA = T01123_A8068Art_PmlA[0] ;
         n8068Art_PmlA = T01123_n8068Art_PmlA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
         A8069Art_Eanc = T01123_A8069Art_Eanc[0] ;
         n8069Art_Eanc = T01123_n8069Art_Eanc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
         A8070Art_Elar = T01123_A8070Art_Elar[0] ;
         n8070Art_Elar = T01123_n8070Art_Elar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
         A8071Art_Enc = T01123_A8071Art_Enc[0] ;
         n8071Art_Enc = T01123_n8071Art_Enc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", A8071Art_Enc);
         A8072Art_Cor = T01123_A8072Art_Cor[0] ;
         n8072Art_Cor = T01123_n8072Art_Cor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", A8072Art_Cor);
         A8073Art_Rdo = T01123_A8073Art_Rdo[0] ;
         n8073Art_Rdo = T01123_n8073Art_Rdo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
         A8075Art_Fabs = T01123_A8075Art_Fabs[0] ;
         n8075Art_Fabs = T01123_n8075Art_Fabs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
         A8076Art_AncB = T01123_A8076Art_AncB[0] ;
         n8076Art_AncB = T01123_n8076Art_AncB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
         A8077Art_GrmB = T01123_A8077Art_GrmB[0] ;
         n8077Art_GrmB = T01123_n8077Art_GrmB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
         A8078Art_GrmC = T01123_A8078Art_GrmC[0] ;
         n8078Art_GrmC = T01123_n8078Art_GrmC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
         A8079Art_AncC = T01123_A8079Art_AncC[0] ;
         n8079Art_AncC = T01123_n8079Art_AncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
         A8080Art_PmlC = T01123_A8080Art_PmlC[0] ;
         n8080Art_PmlC = T01123_n8080Art_PmlC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
         A8081Art_GrmP = T01123_A8081Art_GrmP[0] ;
         n8081Art_GrmP = T01123_n8081Art_GrmP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
         A8082Art_PmlP = T01123_A8082Art_PmlP[0] ;
         n8082Art_PmlP = T01123_n8082Art_PmlP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
         A8083Art_AncP = T01123_A8083Art_AncP[0] ;
         n8083Art_AncP = T01123_n8083Art_AncP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
         A8084Art_RdoP = T01123_A8084Art_RdoP[0] ;
         n8084Art_RdoP = T01123_n8084Art_RdoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
         A8165Art_Dsc = T01123_A8165Art_Dsc[0] ;
         n8165Art_Dsc = T01123_n8165Art_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
         A8166Art_Und = T01123_A8166Art_Und[0] ;
         n8166Art_Und = T01123_n8166Art_Und[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", A8166Art_Und);
         A8955Art_Obs = T01123_A8955Art_Obs[0] ;
         n8955Art_Obs = T01123_n8955Art_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8955Art_Obs", A8955Art_Obs);
         A9628Art_ets = T01123_A9628Art_ets[0] ;
         n9628Art_ets = T01123_n9628Art_ets[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", A9628Art_ets);
         A9629Art_els = T01123_A9629Art_els[0] ;
         n9629Art_els = T01123_n9629Art_els[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", A9629Art_els);
         A12141ProSta = T01123_A12141ProSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
         A12752Art_Tipo = T01123_A12752Art_Tipo[0] ;
         n12752Art_Tipo = T01123_n12752Art_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12752Art_Tipo", A12752Art_Tipo);
         O8078Art_GrmC = A8078Art_GrmC ;
         n8078Art_GrmC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
         O9629Art_els = A9629Art_els ;
         n9629Art_els = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", A9629Art_els);
         O9628Art_ets = A9628Art_ets ;
         n9628Art_ets = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", A9628Art_ets);
         O8084Art_RdoP = A8084Art_RdoP ;
         n8084Art_RdoP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
         O8083Art_AncP = A8083Art_AncP ;
         n8083Art_AncP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
         O8082Art_PmlP = A8082Art_PmlP ;
         n8082Art_PmlP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
         O8081Art_GrmP = A8081Art_GrmP ;
         n8081Art_GrmP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
         O8080Art_PmlC = A8080Art_PmlC ;
         n8080Art_PmlC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
         O8079Art_AncC = A8079Art_AncC ;
         n8079Art_AncC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
         O8077Art_GrmB = A8077Art_GrmB ;
         n8077Art_GrmB = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
         O8076Art_AncB = A8076Art_AncB ;
         n8076Art_AncB = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
         O8075Art_Fabs = A8075Art_Fabs ;
         n8075Art_Fabs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
         O8074Art_Rdpc = A8074Art_Rdpc ;
         n8074Art_Rdpc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
         O8073Art_Rdo = A8073Art_Rdo ;
         n8073Art_Rdo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
         O8072Art_Cor = A8072Art_Cor ;
         n8072Art_Cor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", A8072Art_Cor);
         O8071Art_Enc = A8071Art_Enc ;
         n8071Art_Enc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", A8071Art_Enc);
         O8070Art_Elar = A8070Art_Elar ;
         n8070Art_Elar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
         O8069Art_Eanc = A8069Art_Eanc ;
         n8069Art_Eanc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
         O8068Art_PmlA = A8068Art_PmlA ;
         n8068Art_PmlA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
         O8067Art_Merma = A8067Art_Merma ;
         n8067Art_Merma = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
         O8066Art_AncA = A8066Art_AncA ;
         n8066Art_AncA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
         O8065Art_GrmA = A8065Art_GrmA ;
         n8065Art_GrmA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load11211( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey11211( ) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey11211( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey11211( ) ;
      if ( RcdFound11 == 0 )
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
      RcdFound11 = (short)(0) ;
      /* Using cursor T011210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T011210_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011210_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T011210_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T011210_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T011210_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011210_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T011210_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T011210_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T011211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T011211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011211_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T011211_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T011211_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T011211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011211_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T011211_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T011211_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey11211( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtArt_GrmA_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert11211( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtArt_GrmA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update11211( ) ;
               GX_FocusControl = edtArt_GrmA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtArt_GrmA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert11211( ) ;
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
                  GX_FocusControl = edtArt_GrmA_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert11211( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtArt_GrmA_Internalname ;
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
      getKey11211( ) ;
      if ( RcdFound11 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
         {
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tartdat");
      GX_FocusControl = edtArt_GrmA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1120( ) ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtArt_GrmA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart11211( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArt_GrmA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd11211( ) ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArt_GrmA_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArt_GrmA_Internalname ;
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
      scanStart11211( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound11 != 0 )
         {
            scanNext11211( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArt_GrmA_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd11211( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency11211( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01122 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8074Art_Rdpc, T01122_A8074Art_Rdpc[0]) != 0 ) || ( Z8065Art_GrmA != T01122_A8065Art_GrmA[0] ) || ( Z8066Art_AncA != T01122_A8066Art_AncA[0] ) || ( DecimalUtil.compareTo(Z8067Art_Merma, T01122_A8067Art_Merma[0]) != 0 ) || ( Z8068Art_PmlA != T01122_A8068Art_PmlA[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8069Art_Eanc != T01122_A8069Art_Eanc[0] ) || ( Z8070Art_Elar != T01122_A8070Art_Elar[0] ) || ( GXutil.strcmp(Z8071Art_Enc, T01122_A8071Art_Enc[0]) != 0 ) || ( GXutil.strcmp(Z8072Art_Cor, T01122_A8072Art_Cor[0]) != 0 ) || ( DecimalUtil.compareTo(Z8073Art_Rdo, T01122_A8073Art_Rdo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8075Art_Fabs, T01122_A8075Art_Fabs[0]) != 0 ) || ( Z8076Art_AncB != T01122_A8076Art_AncB[0] ) || ( Z8077Art_GrmB != T01122_A8077Art_GrmB[0] ) || ( Z8078Art_GrmC != T01122_A8078Art_GrmC[0] ) || ( Z8079Art_AncC != T01122_A8079Art_AncC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8080Art_PmlC != T01122_A8080Art_PmlC[0] ) || ( Z8081Art_GrmP != T01122_A8081Art_GrmP[0] ) || ( Z8082Art_PmlP != T01122_A8082Art_PmlP[0] ) || ( Z8083Art_AncP != T01122_A8083Art_AncP[0] ) || ( DecimalUtil.compareTo(Z8084Art_RdoP, T01122_A8084Art_RdoP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8165Art_Dsc, T01122_A8165Art_Dsc[0]) != 0 ) || ( GXutil.strcmp(Z8166Art_Und, T01122_A8166Art_Und[0]) != 0 ) || ( GXutil.strcmp(Z8955Art_Obs, T01122_A8955Art_Obs[0]) != 0 ) || ( GXutil.strcmp(Z9628Art_ets, T01122_A9628Art_ets[0]) != 0 ) || ( GXutil.strcmp(Z9629Art_els, T01122_A9629Art_els[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12141ProSta != T01122_A12141ProSta[0] ) || ( GXutil.strcmp(Z12752Art_Tipo, T01122_A12752Art_Tipo[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8074Art_Rdpc, T01122_A8074Art_Rdpc[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Rdpc");
               GXutil.writeLogRaw("Old: ",Z8074Art_Rdpc);
               GXutil.writeLogRaw("Current: ",T01122_A8074Art_Rdpc[0]);
            }
            if ( Z8065Art_GrmA != T01122_A8065Art_GrmA[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_GrmA");
               GXutil.writeLogRaw("Old: ",Z8065Art_GrmA);
               GXutil.writeLogRaw("Current: ",T01122_A8065Art_GrmA[0]);
            }
            if ( Z8066Art_AncA != T01122_A8066Art_AncA[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_AncA");
               GXutil.writeLogRaw("Old: ",Z8066Art_AncA);
               GXutil.writeLogRaw("Current: ",T01122_A8066Art_AncA[0]);
            }
            if ( DecimalUtil.compareTo(Z8067Art_Merma, T01122_A8067Art_Merma[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Merma");
               GXutil.writeLogRaw("Old: ",Z8067Art_Merma);
               GXutil.writeLogRaw("Current: ",T01122_A8067Art_Merma[0]);
            }
            if ( Z8068Art_PmlA != T01122_A8068Art_PmlA[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_PmlA");
               GXutil.writeLogRaw("Old: ",Z8068Art_PmlA);
               GXutil.writeLogRaw("Current: ",T01122_A8068Art_PmlA[0]);
            }
            if ( Z8069Art_Eanc != T01122_A8069Art_Eanc[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Eanc");
               GXutil.writeLogRaw("Old: ",Z8069Art_Eanc);
               GXutil.writeLogRaw("Current: ",T01122_A8069Art_Eanc[0]);
            }
            if ( Z8070Art_Elar != T01122_A8070Art_Elar[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Elar");
               GXutil.writeLogRaw("Old: ",Z8070Art_Elar);
               GXutil.writeLogRaw("Current: ",T01122_A8070Art_Elar[0]);
            }
            if ( GXutil.strcmp(Z8071Art_Enc, T01122_A8071Art_Enc[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Enc");
               GXutil.writeLogRaw("Old: ",Z8071Art_Enc);
               GXutil.writeLogRaw("Current: ",T01122_A8071Art_Enc[0]);
            }
            if ( GXutil.strcmp(Z8072Art_Cor, T01122_A8072Art_Cor[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Cor");
               GXutil.writeLogRaw("Old: ",Z8072Art_Cor);
               GXutil.writeLogRaw("Current: ",T01122_A8072Art_Cor[0]);
            }
            if ( DecimalUtil.compareTo(Z8073Art_Rdo, T01122_A8073Art_Rdo[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Rdo");
               GXutil.writeLogRaw("Old: ",Z8073Art_Rdo);
               GXutil.writeLogRaw("Current: ",T01122_A8073Art_Rdo[0]);
            }
            if ( DecimalUtil.compareTo(Z8075Art_Fabs, T01122_A8075Art_Fabs[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Fabs");
               GXutil.writeLogRaw("Old: ",Z8075Art_Fabs);
               GXutil.writeLogRaw("Current: ",T01122_A8075Art_Fabs[0]);
            }
            if ( Z8076Art_AncB != T01122_A8076Art_AncB[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_AncB");
               GXutil.writeLogRaw("Old: ",Z8076Art_AncB);
               GXutil.writeLogRaw("Current: ",T01122_A8076Art_AncB[0]);
            }
            if ( Z8077Art_GrmB != T01122_A8077Art_GrmB[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_GrmB");
               GXutil.writeLogRaw("Old: ",Z8077Art_GrmB);
               GXutil.writeLogRaw("Current: ",T01122_A8077Art_GrmB[0]);
            }
            if ( Z8078Art_GrmC != T01122_A8078Art_GrmC[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_GrmC");
               GXutil.writeLogRaw("Old: ",Z8078Art_GrmC);
               GXutil.writeLogRaw("Current: ",T01122_A8078Art_GrmC[0]);
            }
            if ( Z8079Art_AncC != T01122_A8079Art_AncC[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_AncC");
               GXutil.writeLogRaw("Old: ",Z8079Art_AncC);
               GXutil.writeLogRaw("Current: ",T01122_A8079Art_AncC[0]);
            }
            if ( Z8080Art_PmlC != T01122_A8080Art_PmlC[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_PmlC");
               GXutil.writeLogRaw("Old: ",Z8080Art_PmlC);
               GXutil.writeLogRaw("Current: ",T01122_A8080Art_PmlC[0]);
            }
            if ( Z8081Art_GrmP != T01122_A8081Art_GrmP[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_GrmP");
               GXutil.writeLogRaw("Old: ",Z8081Art_GrmP);
               GXutil.writeLogRaw("Current: ",T01122_A8081Art_GrmP[0]);
            }
            if ( Z8082Art_PmlP != T01122_A8082Art_PmlP[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_PmlP");
               GXutil.writeLogRaw("Old: ",Z8082Art_PmlP);
               GXutil.writeLogRaw("Current: ",T01122_A8082Art_PmlP[0]);
            }
            if ( Z8083Art_AncP != T01122_A8083Art_AncP[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_AncP");
               GXutil.writeLogRaw("Old: ",Z8083Art_AncP);
               GXutil.writeLogRaw("Current: ",T01122_A8083Art_AncP[0]);
            }
            if ( DecimalUtil.compareTo(Z8084Art_RdoP, T01122_A8084Art_RdoP[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_RdoP");
               GXutil.writeLogRaw("Old: ",Z8084Art_RdoP);
               GXutil.writeLogRaw("Current: ",T01122_A8084Art_RdoP[0]);
            }
            if ( GXutil.strcmp(Z8165Art_Dsc, T01122_A8165Art_Dsc[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Dsc");
               GXutil.writeLogRaw("Old: ",Z8165Art_Dsc);
               GXutil.writeLogRaw("Current: ",T01122_A8165Art_Dsc[0]);
            }
            if ( GXutil.strcmp(Z8166Art_Und, T01122_A8166Art_Und[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Und");
               GXutil.writeLogRaw("Old: ",Z8166Art_Und);
               GXutil.writeLogRaw("Current: ",T01122_A8166Art_Und[0]);
            }
            if ( GXutil.strcmp(Z8955Art_Obs, T01122_A8955Art_Obs[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Obs");
               GXutil.writeLogRaw("Old: ",Z8955Art_Obs);
               GXutil.writeLogRaw("Current: ",T01122_A8955Art_Obs[0]);
            }
            if ( GXutil.strcmp(Z9628Art_ets, T01122_A9628Art_ets[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_ets");
               GXutil.writeLogRaw("Old: ",Z9628Art_ets);
               GXutil.writeLogRaw("Current: ",T01122_A9628Art_ets[0]);
            }
            if ( GXutil.strcmp(Z9629Art_els, T01122_A9629Art_els[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_els");
               GXutil.writeLogRaw("Old: ",Z9629Art_els);
               GXutil.writeLogRaw("Current: ",T01122_A9629Art_els[0]);
            }
            if ( Z12141ProSta != T01122_A12141ProSta[0] )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"ProSta");
               GXutil.writeLogRaw("Old: ",Z12141ProSta);
               GXutil.writeLogRaw("Current: ",T01122_A12141ProSta[0]);
            }
            if ( GXutil.strcmp(Z12752Art_Tipo, T01122_A12752Art_Tipo[0]) != 0 )
            {
               GXutil.writeLogln("tartdat:[seudo value changed for attri]"+"Art_Tipo");
               GXutil.writeLogRaw("Old: ",Z12752Art_Tipo);
               GXutil.writeLogRaw("Current: ",T01122_A12752Art_Tipo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11211( )
   {
      beforeValidate11211( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11211( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11211( 0) ;
         checkOptimisticConcurrency11211( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11211( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11211( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011212 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8165Art_Dsc), A8165Art_Dsc, Boolean.valueOf(n8166Art_Und), A8166Art_Und, Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, Boolean.valueOf(n9628Art_ets), A9628Art_ets, Boolean.valueOf(n9629Art_els), A9629Art_els, Byte.valueOf(A12141ProSta), Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1120( ) ;
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
            load11211( ) ;
         }
         endLevel11211( ) ;
      }
      closeExtendedTableCursors11211( ) ;
   }

   public void update11211( )
   {
      beforeValidate11211( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11211( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11211( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11211( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate11211( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011213 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8165Art_Dsc), A8165Art_Dsc, Boolean.valueOf(n8166Art_Und), A8166Art_Und, Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, Boolean.valueOf(n9628Art_ets), A9628Art_ets, Boolean.valueOf(n9629Art_els), A9629Art_els, Byte.valueOf(A12141ProSta), Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate11211( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        AV32Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1120( ) ;
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
         endLevel11211( ) ;
      }
      closeExtendedTableCursors11211( ) ;
   }

   public void deferredUpdate11211( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11211( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11211( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11211( ) ;
         afterConfirm11211( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11211( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011214 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound11 == 0 )
                     {
                        initAll11211( ) ;
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
                     resetCaption1120( ) ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel11211( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11211( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV36Art_GrmA = O8065Art_GrmA ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Art_GrmA), 4, 0));
         AV37Art_AncA = O8066Art_AncA ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Art_AncA), 3, 0));
         AV38Art_Merma = O8067Art_Merma ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Art_Merma", GXutil.ltrimstr( AV38Art_Merma, 5, 2));
         AV39Art_PmlA = O8068Art_PmlA ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Art_PmlA), 4, 0));
         AV40Art_Eanc = O8069Art_Eanc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Art_Eanc), 4, 0));
         AV41Art_Elar = O8070Art_Elar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Art_Elar), 4, 0));
         AV42Art_Enc = O8071Art_Enc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Art_Enc", AV42Art_Enc);
         AV43Art_Cor = O8072Art_Cor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Art_Cor", AV43Art_Cor);
         AV44Art_Rdo = O8073Art_Rdo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Art_Rdo", GXutil.ltrimstr( AV44Art_Rdo, 6, 2));
         AV45Art_Rdpc = O8074Art_Rdpc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Art_Rdpc", GXutil.ltrimstr( AV45Art_Rdpc, 6, 2));
         AV46Art_Fabs = O8075Art_Fabs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Art_Fabs", GXutil.ltrimstr( AV46Art_Fabs, 6, 2));
         AV47Art_AncB = O8076Art_AncB ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Art_AncB), 4, 0));
         AV48Art_GrmB = O8077Art_GrmB ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Art_GrmB), 4, 0));
         AV34Texto_i = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Grm2A=", ""), "") + GXutil.str( A8065Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2A=", ""), "") + GXutil.str( AV36Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "AnchoA", ""), "") + GXutil.str( A8066Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "oldAnchoA=", ""), "") + GXutil.str( AV37Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "Merma=", ""), "") + GXutil.str( A8067Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "OldMerma=", ""), "") + GXutil.str( AV38Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "PmlA=", ""), "") + GXutil.str( A8068Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlA=", ""), "") + GXutil.str( AV39Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncAnc=", ""), "") + GXutil.str( A8069Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncAnc=", ""), "") + GXutil.str( AV40Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncLar=", ""), "") + GXutil.str( A8070Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncLar=", ""), "") + GXutil.str( AV41Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Enc=", ""), "") + A8071Art_Enc + httpContext.getMessage( httpContext.getMessage( "OldArt_Enc=", ""), "") + AV42Art_Enc + httpContext.getMessage( httpContext.getMessage( "Art_Cor=", ""), "") + A8072Art_Cor + httpContext.getMessage( httpContext.getMessage( "OldArt_Cor=", ""), "") + AV43Art_Cor + httpContext.getMessage( httpContext.getMessage( "Art_Rdo=", ""), "") + GXutil.str( A8073Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldArt_Rdo=", ""), "") + GXutil.str( AV44Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "RdoCalc=", ""), "") + GXutil.str( A8074Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoCalc=", ""), "") + GXutil.str( AV45Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Fac Abs=", ""), "") + GXutil.str( A8075Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldFac Abs=", ""), "") + GXutil.str( AV46Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Art_AncB=", ""), "") + GXutil.str( A8076Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_AncB=", ""), "") + GXutil.str( AV47Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2AAC=", ""), "") + GXutil.str( A8077Art_GrmB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2AAC=", ""), "") + GXutil.str( AV48Art_GrmB, 4, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
         AV49Art_GrmC = O8078Art_GrmC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Art_GrmC), 4, 0));
         AV50Art_Ancc = O8079Art_AncC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Art_Ancc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Art_Ancc), 3, 0));
         AV51Art_PmlC = O8080Art_PmlC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Art_PmlC), 4, 0));
         AV52Art_GrmP = O8081Art_GrmP ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Art_GrmP), 4, 0));
         AV53Art_Pmlp = O8082Art_PmlP ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Art_Pmlp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Art_Pmlp), 4, 0));
         AV54Art_ancP = O8083Art_AncP ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Art_ancP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Art_ancP), 3, 0));
         AV55Art_rdop = O8084Art_RdoP ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Art_rdop", GXutil.ltrimstr( AV55Art_rdop, 6, 2));
         AV56Art_ets = O9628Art_ets ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Art_ets", AV56Art_ets);
         AV57Art_els = O9629Art_els ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Art_els", AV57Art_els);
         AV35Texto_ii = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Art_GrmC=", ""), "") + GXutil.str( A8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_GrmC=", ""), "") + GXutil.str( O8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Ancc=", ""), "") + GXutil.str( A8079Art_AncC, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_ancc=", ""), "") + GXutil.str( AV50Art_Ancc, 3, 0) + httpContext.getMessage( httpContext.getMessage( "PmlAAC=", ""), "") + GXutil.str( A8080Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlAAC=", ""), "") + GXutil.str( AV51Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2P=", ""), "") + GXutil.str( A8081Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2P=", ""), "") + GXutil.str( AV52Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Pmlp=", ""), "") + GXutil.str( A8082Art_PmlP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_Pmlp=", ""), "") + GXutil.str( AV53Art_Pmlp, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Ancho P=", ""), "") + GXutil.str( A8083Art_AncP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldAncho P=", ""), "") + GXutil.str( AV54Art_ancP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "RdoP=", ""), "") + GXutil.str( A8084Art_RdoP, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoP=", ""), "") + GXutil.str( AV55Art_rdop, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Ets=", ""), "") + A9628Art_ets + httpContext.getMessage( httpContext.getMessage( "OldEts=", ""), "") + AV56Art_ets + httpContext.getMessage( httpContext.getMessage( "Els=", ""), "") + A9629Art_els + httpContext.getMessage( httpContext.getMessage( "OldEls=", ""), "") + AV57Art_els ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
      }
   }

   public void endLevel11211( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete11211( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tartdat");
         if ( AnyError == 0 )
         {
            confirmValues1120( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = AV59Pgmname ;
            GXv_char3[0] = AV8UsurCod ;
            GXv_char4[0] = AV12Station ;
            GXv_char5[0] = AV34Texto_i ;
            GXv_char6[0] = AV35Texto_ii ;
            new app.ppartda(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
            tartdat_impl.this.A396EmprCod = GXv_char1[0] ;
            tartdat_impl.this.AV59Pgmname = GXv_char2[0] ;
            tartdat_impl.this.AV8UsurCod = GXv_char3[0] ;
            tartdat_impl.this.AV12Station = GXv_char4[0] ;
            tartdat_impl.this.AV34Texto_i = GXv_char5[0] ;
            tartdat_impl.this.AV35Texto_ii = GXv_char6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
            httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
            httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tartdat");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart11211( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A65ArtCod = A65ArtCod ;
      this.A758ProCod = A758ProCod ;
      /* Scan By routine */
      /* Using cursor T011215 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11211( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
   }

   public void scanEnd11211( )
   {
      pr_default.close(13);
   }

   public void afterConfirm11211( )
   {
      /* After Confirm Rules */
      if ( true /* After */ )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char5[0] = A65ArtCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A8165Art_Dsc ;
         GXv_char2[0] = AV33Msg_e ;
         new app.pdescart(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         tartdat_impl.this.A396EmprCod = GXv_char6[0] ;
         tartdat_impl.this.A252CliCod = GXv_int7[0] ;
         tartdat_impl.this.A65ArtCod = GXv_char5[0] ;
         tartdat_impl.this.A758ProCod = GXv_char4[0] ;
         tartdat_impl.this.A8165Art_Dsc = GXv_char3[0] ;
         tartdat_impl.this.AV33Msg_e = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_e", AV33Msg_e);
      }
      if ( ( GXutil.strcmp(AV33Msg_e, " ") != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV33Msg_e, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert11211( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11211( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11211( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11211( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11211( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11211( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtArtAnu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAnu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAnu_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtArt_GrmA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_GrmA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_GrmA_Enabled), 5, 0), true);
      edtArt_AncA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_AncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_AncA_Enabled), 5, 0), true);
      edtArt_Merma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Merma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Merma_Enabled), 5, 0), true);
      edtArt_PmlA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_PmlA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_PmlA_Enabled), 5, 0), true);
      edtArt_Eanc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Eanc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Eanc_Enabled), 5, 0), true);
      edtArt_Elar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Elar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Elar_Enabled), 5, 0), true);
      edtArt_Enc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Enc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Enc_Enabled), 5, 0), true);
      edtArt_Cor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Cor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Cor_Enabled), 5, 0), true);
      edtArt_Rdo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Rdo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Rdo_Enabled), 5, 0), true);
      edtArt_Rdpc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Rdpc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Rdpc_Enabled), 5, 0), true);
      edtArt_Fabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Fabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Fabs_Enabled), 5, 0), true);
      edtArt_AncB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_AncB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_AncB_Enabled), 5, 0), true);
      edtArt_GrmB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_GrmB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_GrmB_Enabled), 5, 0), true);
      edtArt_GrmC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_GrmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_GrmC_Enabled), 5, 0), true);
      edtArt_AncC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_AncC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_AncC_Enabled), 5, 0), true);
      edtArt_PmlC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_PmlC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_PmlC_Enabled), 5, 0), true);
      edtArt_GrmP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_GrmP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_GrmP_Enabled), 5, 0), true);
      edtArt_PmlP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_PmlP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_PmlP_Enabled), 5, 0), true);
      edtArt_AncP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_AncP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_AncP_Enabled), 5, 0), true);
      edtArt_RdoP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_RdoP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_RdoP_Enabled), 5, 0), true);
      edtArt_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Dsc_Enabled), 5, 0), true);
      edtArt_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Und_Enabled), 5, 0), true);
      edtArt_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Obs_Enabled), 5, 0), true);
      edtArt_ets_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_ets_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_ets_Enabled), 5, 0), true);
      edtArt_els_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_els_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_els_Enabled), 5, 0), true);
      edtProSta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProSta_Enabled), 5, 0), true);
      edtArt_Tipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt_Tipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt_Tipo_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes11211( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1120( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tartdat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod))}, new String[] {"EmprCod","CliCod","ArtCod","ProCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8074Art_Rdpc", GXutil.ltrim( localUtil.ntoc( Z8074Art_Rdpc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8065Art_GrmA", GXutil.ltrim( localUtil.ntoc( Z8065Art_GrmA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8066Art_AncA", GXutil.ltrim( localUtil.ntoc( Z8066Art_AncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8067Art_Merma", GXutil.ltrim( localUtil.ntoc( Z8067Art_Merma, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8068Art_PmlA", GXutil.ltrim( localUtil.ntoc( Z8068Art_PmlA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8069Art_Eanc", GXutil.ltrim( localUtil.ntoc( Z8069Art_Eanc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8070Art_Elar", GXutil.ltrim( localUtil.ntoc( Z8070Art_Elar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8071Art_Enc", GXutil.rtrim( Z8071Art_Enc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8072Art_Cor", GXutil.rtrim( Z8072Art_Cor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8073Art_Rdo", GXutil.ltrim( localUtil.ntoc( Z8073Art_Rdo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8075Art_Fabs", GXutil.ltrim( localUtil.ntoc( Z8075Art_Fabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8076Art_AncB", GXutil.ltrim( localUtil.ntoc( Z8076Art_AncB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8077Art_GrmB", GXutil.ltrim( localUtil.ntoc( Z8077Art_GrmB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8078Art_GrmC", GXutil.ltrim( localUtil.ntoc( Z8078Art_GrmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8079Art_AncC", GXutil.ltrim( localUtil.ntoc( Z8079Art_AncC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8080Art_PmlC", GXutil.ltrim( localUtil.ntoc( Z8080Art_PmlC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8081Art_GrmP", GXutil.ltrim( localUtil.ntoc( Z8081Art_GrmP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8082Art_PmlP", GXutil.ltrim( localUtil.ntoc( Z8082Art_PmlP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8083Art_AncP", GXutil.ltrim( localUtil.ntoc( Z8083Art_AncP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8084Art_RdoP", GXutil.ltrim( localUtil.ntoc( Z8084Art_RdoP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8165Art_Dsc", GXutil.rtrim( Z8165Art_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8166Art_Und", GXutil.rtrim( Z8166Art_Und));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8955Art_Obs", Z8955Art_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9628Art_ets", GXutil.rtrim( Z9628Art_ets));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9629Art_els", GXutil.rtrim( Z9629Art_els));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12141ProSta", GXutil.ltrim( localUtil.ntoc( Z12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12752Art_Tipo", GXutil.rtrim( Z12752Art_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "O8078Art_GrmC", GXutil.ltrim( localUtil.ntoc( O8078Art_GrmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9629Art_els", GXutil.rtrim( O9629Art_els));
      app.GxWebStd.gx_hidden_field( httpContext, "O9628Art_ets", GXutil.rtrim( O9628Art_ets));
      app.GxWebStd.gx_hidden_field( httpContext, "O8084Art_RdoP", GXutil.ltrim( localUtil.ntoc( O8084Art_RdoP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8083Art_AncP", GXutil.ltrim( localUtil.ntoc( O8083Art_AncP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8082Art_PmlP", GXutil.ltrim( localUtil.ntoc( O8082Art_PmlP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8081Art_GrmP", GXutil.ltrim( localUtil.ntoc( O8081Art_GrmP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8080Art_PmlC", GXutil.ltrim( localUtil.ntoc( O8080Art_PmlC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8079Art_AncC", GXutil.ltrim( localUtil.ntoc( O8079Art_AncC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8077Art_GrmB", GXutil.ltrim( localUtil.ntoc( O8077Art_GrmB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8076Art_AncB", GXutil.ltrim( localUtil.ntoc( O8076Art_AncB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8075Art_Fabs", GXutil.ltrim( localUtil.ntoc( O8075Art_Fabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8074Art_Rdpc", GXutil.ltrim( localUtil.ntoc( O8074Art_Rdpc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8073Art_Rdo", GXutil.ltrim( localUtil.ntoc( O8073Art_Rdo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8072Art_Cor", GXutil.rtrim( O8072Art_Cor));
      app.GxWebStd.gx_hidden_field( httpContext, "O8071Art_Enc", GXutil.rtrim( O8071Art_Enc));
      app.GxWebStd.gx_hidden_field( httpContext, "O8070Art_Elar", GXutil.ltrim( localUtil.ntoc( O8070Art_Elar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8069Art_Eanc", GXutil.ltrim( localUtil.ntoc( O8069Art_Eanc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8068Art_PmlA", GXutil.ltrim( localUtil.ntoc( O8068Art_PmlA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8067Art_Merma", GXutil.ltrim( localUtil.ntoc( O8067Art_Merma, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8066Art_AncA", GXutil.ltrim( localUtil.ntoc( O8066Art_AncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8065Art_GrmA", GXutil.ltrim( localUtil.ntoc( O8065Art_GrmA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV32Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_GRMA", GXutil.ltrim( localUtil.ntoc( AV36Art_GrmA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ANCA", GXutil.ltrim( localUtil.ntoc( AV37Art_AncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_MERMA", GXutil.ltrim( localUtil.ntoc( AV38Art_Merma, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_PMLA", GXutil.ltrim( localUtil.ntoc( AV39Art_PmlA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_EANC", GXutil.ltrim( localUtil.ntoc( AV40Art_Eanc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ELAR", GXutil.ltrim( localUtil.ntoc( AV41Art_Elar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ENC", GXutil.rtrim( AV42Art_Enc));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_COR", GXutil.rtrim( AV43Art_Cor));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_RDO", GXutil.ltrim( localUtil.ntoc( AV44Art_Rdo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_RDPC", GXutil.ltrim( localUtil.ntoc( AV45Art_Rdpc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_FABS", GXutil.ltrim( localUtil.ntoc( AV46Art_Fabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ANCB", GXutil.ltrim( localUtil.ntoc( AV47Art_AncB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_GRMB", GXutil.ltrim( localUtil.ntoc( AV48Art_GrmB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_GRMC", GXutil.ltrim( localUtil.ntoc( AV49Art_GrmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ANCC", GXutil.ltrim( localUtil.ntoc( AV50Art_Ancc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_PMLC", GXutil.ltrim( localUtil.ntoc( AV51Art_PmlC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_GRMP", GXutil.ltrim( localUtil.ntoc( AV52Art_GrmP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_PMLP", GXutil.ltrim( localUtil.ntoc( AV53Art_Pmlp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ANCP", GXutil.ltrim( localUtil.ntoc( AV54Art_ancP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_RDOP", GXutil.ltrim( localUtil.ntoc( AV55Art_rdop, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ETS", GXutil.rtrim( AV56Art_ets));
      app.GxWebStd.gx_hidden_field( httpContext, "vART_ELS", GXutil.rtrim( AV57Art_els));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV34Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_II", AV35Texto_ii);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_E", GXutil.rtrim( AV33Msg_e));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV59Pgmname));
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
      return formatLink("app.tartdat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod))}, new String[] {"EmprCod","CliCod","ArtCod","ProCod"})  ;
   }

   public String getPgmname( )
   {
      return "TARTDAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DATOS ARTICULOS", "") ;
   }

   public void initializeNonKey11211( )
   {
      A8074Art_Rdpc = DecimalUtil.ZERO ;
      n8074Art_Rdpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
      AV32Modif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      AV33Msg_e = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_e", AV33Msg_e);
      AV36Art_GrmA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Art_GrmA), 4, 0));
      AV37Art_AncA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Art_AncA), 3, 0));
      AV38Art_Merma = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Art_Merma", GXutil.ltrimstr( AV38Art_Merma, 5, 2));
      AV39Art_PmlA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Art_PmlA), 4, 0));
      AV40Art_Eanc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Art_Eanc), 4, 0));
      AV41Art_Elar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Art_Elar), 4, 0));
      AV42Art_Enc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Art_Enc", AV42Art_Enc);
      AV43Art_Cor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Art_Cor", AV43Art_Cor);
      AV44Art_Rdo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Art_Rdo", GXutil.ltrimstr( AV44Art_Rdo, 6, 2));
      AV45Art_Rdpc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Art_Rdpc", GXutil.ltrimstr( AV45Art_Rdpc, 6, 2));
      AV46Art_Fabs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Art_Fabs", GXutil.ltrimstr( AV46Art_Fabs, 6, 2));
      AV47Art_AncB = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Art_AncB), 4, 0));
      AV48Art_GrmB = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Art_GrmB), 4, 0));
      AV49Art_GrmC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Art_GrmC), 4, 0));
      AV50Art_Ancc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Art_Ancc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Art_Ancc), 3, 0));
      AV51Art_PmlC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Art_PmlC), 4, 0));
      AV52Art_GrmP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Art_GrmP), 4, 0));
      AV53Art_Pmlp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Art_Pmlp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Art_Pmlp), 4, 0));
      AV54Art_ancP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Art_ancP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Art_ancP), 3, 0));
      AV55Art_rdop = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Art_rdop", GXutil.ltrimstr( AV55Art_rdop, 6, 2));
      AV56Art_ets = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Art_ets", AV56Art_ets);
      AV57Art_els = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Art_els", AV57Art_els);
      A8065Art_GrmA = (short)(0) ;
      n8065Art_GrmA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
      A8066Art_AncA = (short)(0) ;
      n8066Art_AncA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
      A8067Art_Merma = DecimalUtil.ZERO ;
      n8067Art_Merma = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
      A8068Art_PmlA = (short)(0) ;
      n8068Art_PmlA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
      A8069Art_Eanc = (short)(0) ;
      n8069Art_Eanc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
      A8070Art_Elar = (short)(0) ;
      n8070Art_Elar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
      A8071Art_Enc = "" ;
      n8071Art_Enc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", A8071Art_Enc);
      A8072Art_Cor = "" ;
      n8072Art_Cor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", A8072Art_Cor);
      A8073Art_Rdo = DecimalUtil.ZERO ;
      n8073Art_Rdo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
      A8075Art_Fabs = DecimalUtil.ZERO ;
      n8075Art_Fabs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
      A8076Art_AncB = (short)(0) ;
      n8076Art_AncB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
      A8077Art_GrmB = (short)(0) ;
      n8077Art_GrmB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
      A8078Art_GrmC = (short)(0) ;
      n8078Art_GrmC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
      A8079Art_AncC = (short)(0) ;
      n8079Art_AncC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
      A8080Art_PmlC = (short)(0) ;
      n8080Art_PmlC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
      A8081Art_GrmP = (short)(0) ;
      n8081Art_GrmP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
      A8082Art_PmlP = (short)(0) ;
      n8082Art_PmlP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
      A8083Art_AncP = (short)(0) ;
      n8083Art_AncP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
      A8084Art_RdoP = DecimalUtil.ZERO ;
      n8084Art_RdoP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
      A8955Art_Obs = "" ;
      n8955Art_Obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8955Art_Obs", A8955Art_Obs);
      A9628Art_ets = "" ;
      n9628Art_ets = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", A9628Art_ets);
      A9629Art_els = "" ;
      n9629Art_els = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", A9629Art_els);
      A12141ProSta = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
      A12752Art_Tipo = "" ;
      n12752Art_Tipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12752Art_Tipo", A12752Art_Tipo);
      AV34Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
      AV35Texto_ii = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
      AV12Station = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      AV8UsurCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      A8165Art_Dsc = "" ;
      n8165Art_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
      A8166Art_Und = "*" ;
      n8166Art_Und = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", A8166Art_Und);
      O8078Art_GrmC = A8078Art_GrmC ;
      n8078Art_GrmC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8078Art_GrmC), 4, 0));
      O9629Art_els = A9629Art_els ;
      n9629Art_els = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", A9629Art_els);
      O9628Art_ets = A9628Art_ets ;
      n9628Art_ets = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", A9628Art_ets);
      O8084Art_RdoP = A8084Art_RdoP ;
      n8084Art_RdoP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrimstr( A8084Art_RdoP, 6, 2));
      O8083Art_AncP = A8083Art_AncP ;
      n8083Art_AncP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8083Art_AncP), 3, 0));
      O8082Art_PmlP = A8082Art_PmlP ;
      n8082Art_PmlP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8082Art_PmlP), 4, 0));
      O8081Art_GrmP = A8081Art_GrmP ;
      n8081Art_GrmP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8081Art_GrmP), 4, 0));
      O8080Art_PmlC = A8080Art_PmlC ;
      n8080Art_PmlC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8080Art_PmlC), 4, 0));
      O8079Art_AncC = A8079Art_AncC ;
      n8079Art_AncC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8079Art_AncC), 3, 0));
      O8077Art_GrmB = A8077Art_GrmB ;
      n8077Art_GrmB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8077Art_GrmB), 4, 0));
      O8076Art_AncB = A8076Art_AncB ;
      n8076Art_AncB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8076Art_AncB), 4, 0));
      O8075Art_Fabs = A8075Art_Fabs ;
      n8075Art_Fabs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrimstr( A8075Art_Fabs, 6, 2));
      O8074Art_Rdpc = A8074Art_Rdpc ;
      n8074Art_Rdpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrimstr( A8074Art_Rdpc, 6, 2));
      O8073Art_Rdo = A8073Art_Rdo ;
      n8073Art_Rdo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrimstr( A8073Art_Rdo, 6, 2));
      O8072Art_Cor = A8072Art_Cor ;
      n8072Art_Cor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", A8072Art_Cor);
      O8071Art_Enc = A8071Art_Enc ;
      n8071Art_Enc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", A8071Art_Enc);
      O8070Art_Elar = A8070Art_Elar ;
      n8070Art_Elar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8070Art_Elar), 4, 0));
      O8069Art_Eanc = A8069Art_Eanc ;
      n8069Art_Eanc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8069Art_Eanc), 4, 0));
      O8068Art_PmlA = A8068Art_PmlA ;
      n8068Art_PmlA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8068Art_PmlA), 4, 0));
      O8067Art_Merma = A8067Art_Merma ;
      n8067Art_Merma = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrimstr( A8067Art_Merma, 5, 2));
      O8066Art_AncA = A8066Art_AncA ;
      n8066Art_AncA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8066Art_AncA), 3, 0));
      O8065Art_GrmA = A8065Art_GrmA ;
      n8065Art_GrmA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8065Art_GrmA), 4, 0));
      Z8074Art_Rdpc = DecimalUtil.ZERO ;
      Z8065Art_GrmA = (short)(0) ;
      Z8066Art_AncA = (short)(0) ;
      Z8067Art_Merma = DecimalUtil.ZERO ;
      Z8068Art_PmlA = (short)(0) ;
      Z8069Art_Eanc = (short)(0) ;
      Z8070Art_Elar = (short)(0) ;
      Z8071Art_Enc = "" ;
      Z8072Art_Cor = "" ;
      Z8073Art_Rdo = DecimalUtil.ZERO ;
      Z8075Art_Fabs = DecimalUtil.ZERO ;
      Z8076Art_AncB = (short)(0) ;
      Z8077Art_GrmB = (short)(0) ;
      Z8078Art_GrmC = (short)(0) ;
      Z8079Art_AncC = (short)(0) ;
      Z8080Art_PmlC = (short)(0) ;
      Z8081Art_GrmP = (short)(0) ;
      Z8082Art_PmlP = (short)(0) ;
      Z8083Art_AncP = (short)(0) ;
      Z8084Art_RdoP = DecimalUtil.ZERO ;
      Z8165Art_Dsc = "" ;
      Z8166Art_Und = "" ;
      Z8955Art_Obs = "" ;
      Z9628Art_ets = "" ;
      Z9629Art_els = "" ;
      Z12141ProSta = (byte)(0) ;
      Z12752Art_Tipo = "" ;
   }

   public void initAll11211( )
   {
      initializeNonKey11211( ) ;
   }

   public void standaloneModalInsert( )
   {
      A8166Art_Und = i8166Art_Und ;
      n8166Art_Und = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", A8166Art_Und);
      A8165Art_Dsc = i8165Art_Dsc ;
      n8165Art_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241534243", true, true);
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
      httpContext.AddJavascriptSource("tartdat.js", "?20268241534243", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtArtAnu_Internalname = "ARTANU" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProCod_Internalname = "PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtArt_GrmA_Internalname = "ART_GRMA" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtArt_AncA_Internalname = "ART_ANCA" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtArt_Merma_Internalname = "ART_MERMA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtArt_PmlA_Internalname = "ART_PMLA" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtArt_Eanc_Internalname = "ART_EANC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtArt_Elar_Internalname = "ART_ELAR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtArt_Enc_Internalname = "ART_ENC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtArt_Cor_Internalname = "ART_COR" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtArt_Rdo_Internalname = "ART_RDO" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtArt_Rdpc_Internalname = "ART_RDPC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtArt_Fabs_Internalname = "ART_FABS" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtArt_AncB_Internalname = "ART_ANCB" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtArt_GrmB_Internalname = "ART_GRMB" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtArt_GrmC_Internalname = "ART_GRMC" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtArt_AncC_Internalname = "ART_ANCC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtArt_PmlC_Internalname = "ART_PMLC" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtArt_GrmP_Internalname = "ART_GRMP" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtArt_PmlP_Internalname = "ART_PMLP" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtArt_AncP_Internalname = "ART_ANCP" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtArt_RdoP_Internalname = "ART_RDOP" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtArt_Dsc_Internalname = "ART_DSC" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtArt_Und_Internalname = "ART_UND" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtArt_Obs_Internalname = "ART_OBS" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtArt_ets_Internalname = "ART_ETS" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtArt_els_Internalname = "ART_ELS" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtProSta_Internalname = "PROSTA" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtArt_Tipo_Internalname = "ART_TIPO" ;
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
      Form.setCaption( httpContext.getMessage( "DATOS ARTICULOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtArt_Tipo_Jsonclick = "" ;
      edtArt_Tipo_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Tipo_Enabled = 1 ;
      edtProSta_Jsonclick = "" ;
      edtProSta_Backcolor = (int)(0xFFFFFF) ;
      edtProSta_Enabled = 1 ;
      edtArt_els_Jsonclick = "" ;
      edtArt_els_Backcolor = (int)(0xFFFFFF) ;
      edtArt_els_Enabled = 1 ;
      edtArt_ets_Jsonclick = "" ;
      edtArt_ets_Backcolor = (int)(0xFFFFFF) ;
      edtArt_ets_Enabled = 1 ;
      edtArt_Obs_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Obs_Enabled = 1 ;
      edtArt_Und_Jsonclick = "" ;
      edtArt_Und_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Und_Enabled = 1 ;
      edtArt_Dsc_Jsonclick = "" ;
      edtArt_Dsc_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Dsc_Enabled = 1 ;
      edtArt_RdoP_Jsonclick = "" ;
      edtArt_RdoP_Backcolor = (int)(0xFFFFFF) ;
      edtArt_RdoP_Enabled = 1 ;
      edtArt_AncP_Jsonclick = "" ;
      edtArt_AncP_Backcolor = (int)(0xFFFFFF) ;
      edtArt_AncP_Enabled = 1 ;
      edtArt_PmlP_Jsonclick = "" ;
      edtArt_PmlP_Backcolor = (int)(0xFFFFFF) ;
      edtArt_PmlP_Enabled = 1 ;
      edtArt_GrmP_Jsonclick = "" ;
      edtArt_GrmP_Backcolor = (int)(0xFFFFFF) ;
      edtArt_GrmP_Enabled = 1 ;
      edtArt_PmlC_Jsonclick = "" ;
      edtArt_PmlC_Backcolor = (int)(0xFFFFFF) ;
      edtArt_PmlC_Enabled = 1 ;
      edtArt_AncC_Jsonclick = "" ;
      edtArt_AncC_Backcolor = (int)(0xFFFFFF) ;
      edtArt_AncC_Enabled = 1 ;
      edtArt_GrmC_Jsonclick = "" ;
      edtArt_GrmC_Backcolor = (int)(0xFFFFFF) ;
      edtArt_GrmC_Enabled = 1 ;
      edtArt_GrmB_Jsonclick = "" ;
      edtArt_GrmB_Backcolor = (int)(0xFFFFFF) ;
      edtArt_GrmB_Enabled = 1 ;
      edtArt_AncB_Jsonclick = "" ;
      edtArt_AncB_Backcolor = (int)(0xFFFFFF) ;
      edtArt_AncB_Enabled = 1 ;
      edtArt_Fabs_Jsonclick = "" ;
      edtArt_Fabs_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Fabs_Enabled = 1 ;
      edtArt_Rdpc_Jsonclick = "" ;
      edtArt_Rdpc_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Rdpc_Enabled = 1 ;
      edtArt_Rdo_Jsonclick = "" ;
      edtArt_Rdo_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Rdo_Enabled = 1 ;
      edtArt_Cor_Jsonclick = "" ;
      edtArt_Cor_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Cor_Enabled = 1 ;
      edtArt_Enc_Jsonclick = "" ;
      edtArt_Enc_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Enc_Enabled = 1 ;
      edtArt_Elar_Jsonclick = "" ;
      edtArt_Elar_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Elar_Enabled = 1 ;
      edtArt_Eanc_Jsonclick = "" ;
      edtArt_Eanc_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Eanc_Enabled = 1 ;
      edtArt_PmlA_Jsonclick = "" ;
      edtArt_PmlA_Backcolor = (int)(0xFFFFFF) ;
      edtArt_PmlA_Enabled = 1 ;
      edtArt_Merma_Jsonclick = "" ;
      edtArt_Merma_Backcolor = (int)(0xFFFFFF) ;
      edtArt_Merma_Enabled = 1 ;
      edtArt_AncA_Jsonclick = "" ;
      edtArt_AncA_Backcolor = (int)(0xFFFFFF) ;
      edtArt_AncA_Enabled = 1 ;
      edtArt_GrmA_Jsonclick = "" ;
      edtArt_GrmA_Backcolor = (int)(0xFFFFFF) ;
      edtArt_GrmA_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtArtAnu_Jsonclick = "" ;
      edtArtAnu_Backcolor = (int)(0xFFFFFF) ;
      edtArtAnu_Enabled = 0 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void xc_33_11211( String A396EmprCod ,
                            int A252CliCod ,
                            String A65ArtCod ,
                            String A758ProCod ,
                            String A8165Art_Dsc ,
                            String AV33Msg_e )
   {
      if ( true /* After */ )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char5[0] = A65ArtCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A8165Art_Dsc ;
         GXv_char2[0] = AV33Msg_e ;
         new app.pdescart(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char6[0] ;
         A252CliCod = GXv_int7[0] ;
         A65ArtCod = GXv_char5[0] ;
         A758ProCod = GXv_char4[0] ;
         A8165Art_Dsc = GXv_char3[0] ;
         AV33Msg_e = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", A8165Art_Dsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_e", AV33Msg_e);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8165Art_Dsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33Msg_e))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_35_11211( String A396EmprCod ,
                            String AV59Pgmname ,
                            String AV8UsurCod ,
                            String AV12Station ,
                            String AV34Texto_i ,
                            String AV35Texto_ii )
   {
      if ( true /* After */ )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = AV59Pgmname ;
         GXv_char4[0] = AV8UsurCod ;
         GXv_char3[0] = AV12Station ;
         GXv_char2[0] = AV34Texto_i ;
         GXv_char1[0] = AV35Texto_ii ;
         new app.ppartda(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2, GXv_char1) ;
         A396EmprCod = GXv_char6[0] ;
         AV59Pgmname = GXv_char5[0] ;
         AV8UsurCod = GXv_char4[0] ;
         AV12Station = GXv_char3[0] ;
         AV34Texto_i = GXv_char2[0] ;
         AV35Texto_ii = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV59Pgmname))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV8UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV12Station))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV34Texto_i)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV35Texto_ii)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T011216 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T011216_A407EmprNom[0] ;
      n407EmprNom = T011216_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T011217 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T011217_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(15);
      /* Using cursor T011218 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T011218_A69ArtDsc[0] ;
      n69ArtDsc = T011218_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A3682ArtAnu = T011218_A3682ArtAnu[0] ;
      n3682ArtAnu = T011218_n3682ArtAnu[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3682ArtAnu", A3682ArtAnu);
      pr_default.close(16);
      /* Using cursor T011219 */
      pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T011219_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(17);
      GX_FocusControl = edtArt_GrmA_Internalname ;
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

   public void valid_Procod( )
   {
      n69ArtDsc = false ;
      n8166Art_Und = false ;
      n8165Art_Dsc = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A3682ArtAnu", GXutil.rtrim( A3682ArtAnu));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A8065Art_GrmA", GXutil.ltrim( localUtil.ntoc( A8065Art_GrmA, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8066Art_AncA", GXutil.ltrim( localUtil.ntoc( A8066Art_AncA, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8067Art_Merma", GXutil.ltrim( localUtil.ntoc( A8067Art_Merma, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8068Art_PmlA", GXutil.ltrim( localUtil.ntoc( A8068Art_PmlA, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8069Art_Eanc", GXutil.ltrim( localUtil.ntoc( A8069Art_Eanc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8070Art_Elar", GXutil.ltrim( localUtil.ntoc( A8070Art_Elar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8071Art_Enc", GXutil.rtrim( A8071Art_Enc));
      httpContext.ajax_rsp_assign_attri("", false, "A8072Art_Cor", GXutil.rtrim( A8072Art_Cor));
      httpContext.ajax_rsp_assign_attri("", false, "A8073Art_Rdo", GXutil.ltrim( localUtil.ntoc( A8073Art_Rdo, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8075Art_Fabs", GXutil.ltrim( localUtil.ntoc( A8075Art_Fabs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8076Art_AncB", GXutil.ltrim( localUtil.ntoc( A8076Art_AncB, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8077Art_GrmB", GXutil.ltrim( localUtil.ntoc( A8077Art_GrmB, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8078Art_GrmC", GXutil.ltrim( localUtil.ntoc( A8078Art_GrmC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8079Art_AncC", GXutil.ltrim( localUtil.ntoc( A8079Art_AncC, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8080Art_PmlC", GXutil.ltrim( localUtil.ntoc( A8080Art_PmlC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8081Art_GrmP", GXutil.ltrim( localUtil.ntoc( A8081Art_GrmP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8082Art_PmlP", GXutil.ltrim( localUtil.ntoc( A8082Art_PmlP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8083Art_AncP", GXutil.ltrim( localUtil.ntoc( A8083Art_AncP, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8084Art_RdoP", GXutil.ltrim( localUtil.ntoc( A8084Art_RdoP, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8165Art_Dsc", GXutil.rtrim( A8165Art_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A8166Art_Und", GXutil.rtrim( A8166Art_Und));
      httpContext.ajax_rsp_assign_attri("", false, "A8955Art_Obs", A8955Art_Obs);
      httpContext.ajax_rsp_assign_attri("", false, "A9628Art_ets", GXutil.rtrim( A9628Art_ets));
      httpContext.ajax_rsp_assign_attri("", false, "A9629Art_els", GXutil.rtrim( A9629Art_els));
      httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.ltrim( localUtil.ntoc( A12141ProSta, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12752Art_Tipo", GXutil.rtrim( A12752Art_Tipo));
      httpContext.ajax_rsp_assign_attri("", false, "AV36Art_GrmA", GXutil.ltrim( localUtil.ntoc( AV36Art_GrmA, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37Art_AncA", GXutil.ltrim( localUtil.ntoc( AV37Art_AncA, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV38Art_Merma", GXutil.ltrim( localUtil.ntoc( AV38Art_Merma, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrim( localUtil.ntoc( A8074Art_Rdpc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Art_PmlA", GXutil.ltrim( localUtil.ntoc( AV39Art_PmlA, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Art_Eanc", GXutil.ltrim( localUtil.ntoc( AV40Art_Eanc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV41Art_Elar", GXutil.ltrim( localUtil.ntoc( AV41Art_Elar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42Art_Enc", GXutil.rtrim( AV42Art_Enc));
      httpContext.ajax_rsp_assign_attri("", false, "AV43Art_Cor", GXutil.rtrim( AV43Art_Cor));
      httpContext.ajax_rsp_assign_attri("", false, "AV44Art_Rdo", GXutil.ltrim( localUtil.ntoc( AV44Art_Rdo, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV45Art_Rdpc", GXutil.ltrim( localUtil.ntoc( AV45Art_Rdpc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46Art_Fabs", GXutil.ltrim( localUtil.ntoc( AV46Art_Fabs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV47Art_AncB", GXutil.ltrim( localUtil.ntoc( AV47Art_AncB, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV48Art_GrmB", GXutil.ltrim( localUtil.ntoc( AV48Art_GrmB, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
      httpContext.ajax_rsp_assign_attri("", false, "AV49Art_GrmC", GXutil.ltrim( localUtil.ntoc( AV49Art_GrmC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Art_Ancc", GXutil.ltrim( localUtil.ntoc( AV50Art_Ancc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV51Art_PmlC", GXutil.ltrim( localUtil.ntoc( AV51Art_PmlC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV52Art_GrmP", GXutil.ltrim( localUtil.ntoc( AV52Art_GrmP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV53Art_Pmlp", GXutil.ltrim( localUtil.ntoc( AV53Art_Pmlp, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV54Art_ancP", GXutil.ltrim( localUtil.ntoc( AV54Art_ancP, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV55Art_rdop", GXutil.ltrim( localUtil.ntoc( AV55Art_rdop, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV56Art_ets", GXutil.rtrim( AV56Art_ets));
      httpContext.ajax_rsp_assign_attri("", false, "AV57Art_els", GXutil.rtrim( AV57Art_els));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3682ArtAnu", GXutil.rtrim( Z3682ArtAnu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8065Art_GrmA", GXutil.ltrim( localUtil.ntoc( Z8065Art_GrmA, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8066Art_AncA", GXutil.ltrim( localUtil.ntoc( Z8066Art_AncA, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8067Art_Merma", GXutil.ltrim( localUtil.ntoc( Z8067Art_Merma, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8068Art_PmlA", GXutil.ltrim( localUtil.ntoc( Z8068Art_PmlA, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8069Art_Eanc", GXutil.ltrim( localUtil.ntoc( Z8069Art_Eanc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8070Art_Elar", GXutil.ltrim( localUtil.ntoc( Z8070Art_Elar, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8071Art_Enc", GXutil.rtrim( Z8071Art_Enc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8072Art_Cor", GXutil.rtrim( Z8072Art_Cor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8073Art_Rdo", GXutil.ltrim( localUtil.ntoc( Z8073Art_Rdo, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8075Art_Fabs", GXutil.ltrim( localUtil.ntoc( Z8075Art_Fabs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8076Art_AncB", GXutil.ltrim( localUtil.ntoc( Z8076Art_AncB, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8077Art_GrmB", GXutil.ltrim( localUtil.ntoc( Z8077Art_GrmB, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8078Art_GrmC", GXutil.ltrim( localUtil.ntoc( Z8078Art_GrmC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8079Art_AncC", GXutil.ltrim( localUtil.ntoc( Z8079Art_AncC, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8080Art_PmlC", GXutil.ltrim( localUtil.ntoc( Z8080Art_PmlC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8081Art_GrmP", GXutil.ltrim( localUtil.ntoc( Z8081Art_GrmP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8082Art_PmlP", GXutil.ltrim( localUtil.ntoc( Z8082Art_PmlP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8083Art_AncP", GXutil.ltrim( localUtil.ntoc( Z8083Art_AncP, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8084Art_RdoP", GXutil.ltrim( localUtil.ntoc( Z8084Art_RdoP, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8165Art_Dsc", GXutil.rtrim( Z8165Art_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8166Art_Und", GXutil.rtrim( Z8166Art_Und));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8955Art_Obs", Z8955Art_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9628Art_ets", GXutil.rtrim( Z9628Art_ets));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9629Art_els", GXutil.rtrim( Z9629Art_els));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12141ProSta", GXutil.ltrim( localUtil.ntoc( Z12141ProSta, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12752Art_Tipo", GXutil.rtrim( Z12752Art_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV36Art_GrmA", GXutil.ltrim( localUtil.ntoc( ZV36Art_GrmA, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV37Art_AncA", GXutil.ltrim( localUtil.ntoc( ZV37Art_AncA, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV38Art_Merma", GXutil.ltrim( localUtil.ntoc( ZV38Art_Merma, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8074Art_Rdpc", GXutil.ltrim( localUtil.ntoc( Z8074Art_Rdpc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV39Art_PmlA", GXutil.ltrim( localUtil.ntoc( ZV39Art_PmlA, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV40Art_Eanc", GXutil.ltrim( localUtil.ntoc( ZV40Art_Eanc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV41Art_Elar", GXutil.ltrim( localUtil.ntoc( ZV41Art_Elar, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV42Art_Enc", GXutil.rtrim( ZV42Art_Enc));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV43Art_Cor", GXutil.rtrim( ZV43Art_Cor));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV44Art_Rdo", GXutil.ltrim( localUtil.ntoc( ZV44Art_Rdo, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV45Art_Rdpc", GXutil.ltrim( localUtil.ntoc( ZV45Art_Rdpc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV46Art_Fabs", GXutil.ltrim( localUtil.ntoc( ZV46Art_Fabs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV47Art_AncB", GXutil.ltrim( localUtil.ntoc( ZV47Art_AncB, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV48Art_GrmB", GXutil.ltrim( localUtil.ntoc( ZV48Art_GrmB, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV34Texto_i", ZV34Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "ZV49Art_GrmC", GXutil.ltrim( localUtil.ntoc( ZV49Art_GrmC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV50Art_Ancc", GXutil.ltrim( localUtil.ntoc( ZV50Art_Ancc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV51Art_PmlC", GXutil.ltrim( localUtil.ntoc( ZV51Art_PmlC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV52Art_GrmP", GXutil.ltrim( localUtil.ntoc( ZV52Art_GrmP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV53Art_Pmlp", GXutil.ltrim( localUtil.ntoc( ZV53Art_Pmlp, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV54Art_ancP", GXutil.ltrim( localUtil.ntoc( ZV54Art_ancP, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV55Art_rdop", GXutil.ltrim( localUtil.ntoc( ZV55Art_rdop, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV56Art_ets", GXutil.rtrim( ZV56Art_ets));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV57Art_els", GXutil.rtrim( ZV57Art_els));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV35Texto_ii", ZV35Texto_ii);
      httpContext.ajax_rsp_assign_attri("", false, "O8078Art_GrmC", GXutil.ltrim( localUtil.ntoc( O8078Art_GrmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9629Art_els", GXutil.rtrim( O9629Art_els));
      httpContext.ajax_rsp_assign_attri("", false, "O9628Art_ets", GXutil.rtrim( O9628Art_ets));
      httpContext.ajax_rsp_assign_attri("", false, "O8084Art_RdoP", GXutil.ltrim( localUtil.ntoc( O8084Art_RdoP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8083Art_AncP", GXutil.ltrim( localUtil.ntoc( O8083Art_AncP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8082Art_PmlP", GXutil.ltrim( localUtil.ntoc( O8082Art_PmlP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8081Art_GrmP", GXutil.ltrim( localUtil.ntoc( O8081Art_GrmP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8080Art_PmlC", GXutil.ltrim( localUtil.ntoc( O8080Art_PmlC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8079Art_AncC", GXutil.ltrim( localUtil.ntoc( O8079Art_AncC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8077Art_GrmB", GXutil.ltrim( localUtil.ntoc( O8077Art_GrmB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8076Art_AncB", GXutil.ltrim( localUtil.ntoc( O8076Art_AncB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8075Art_Fabs", GXutil.ltrim( localUtil.ntoc( O8075Art_Fabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8074Art_Rdpc", GXutil.ltrim( localUtil.ntoc( O8074Art_Rdpc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8073Art_Rdo", GXutil.ltrim( localUtil.ntoc( O8073Art_Rdo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8072Art_Cor", GXutil.rtrim( O8072Art_Cor));
      httpContext.ajax_rsp_assign_attri("", false, "O8071Art_Enc", GXutil.rtrim( O8071Art_Enc));
      httpContext.ajax_rsp_assign_attri("", false, "O8070Art_Elar", GXutil.ltrim( localUtil.ntoc( O8070Art_Elar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8069Art_Eanc", GXutil.ltrim( localUtil.ntoc( O8069Art_Eanc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8068Art_PmlA", GXutil.ltrim( localUtil.ntoc( O8068Art_PmlA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8067Art_Merma", GXutil.ltrim( localUtil.ntoc( O8067Art_Merma, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8066Art_AncA", GXutil.ltrim( localUtil.ntoc( O8066Art_AncA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8065Art_GrmA", GXutil.ltrim( localUtil.ntoc( O8065Art_GrmA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Art_grma( )
   {
      n8065Art_GrmA = false ;
      AV36Art_GrmA = O8065Art_GrmA ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36Art_GrmA", GXutil.ltrim( localUtil.ntoc( AV36Art_GrmA, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_anca( )
   {
      n8066Art_AncA = false ;
      AV37Art_AncA = O8066Art_AncA ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV37Art_AncA", GXutil.ltrim( localUtil.ntoc( AV37Art_AncA, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Art_merma( )
   {
      n8067Art_Merma = false ;
      AV38Art_Merma = O8067Art_Merma ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV38Art_Merma", GXutil.ltrim( localUtil.ntoc( AV38Art_Merma, (byte)(5), (byte)(2), ".", "")));
   }

   public void valid_Art_pmla( )
   {
      n8068Art_PmlA = false ;
      n8074Art_Rdpc = false ;
      if ( ( A8068Art_PmlA > 0 ) && true /* After */ )
      {
         A8074Art_Rdpc = DecimalUtil.doubleToDec(1000/ (double) (A8068Art_PmlA)) ;
         n8074Art_Rdpc = false ;
      }
      AV39Art_PmlA = O8068Art_PmlA ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8074Art_Rdpc", GXutil.ltrim( localUtil.ntoc( A8074Art_Rdpc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Art_PmlA", GXutil.ltrim( localUtil.ntoc( AV39Art_PmlA, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_eanc( )
   {
      n8069Art_Eanc = false ;
      AV40Art_Eanc = O8069Art_Eanc ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV40Art_Eanc", GXutil.ltrim( localUtil.ntoc( AV40Art_Eanc, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_elar( )
   {
      n8070Art_Elar = false ;
      AV41Art_Elar = O8070Art_Elar ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV41Art_Elar", GXutil.ltrim( localUtil.ntoc( AV41Art_Elar, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_enc( )
   {
      n8071Art_Enc = false ;
      if ( ! ( ( GXutil.strcmp(A8071Art_Enc, "S") == 0 ) || ( GXutil.strcmp(A8071Art_Enc, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ART_ENC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArt_Enc_Internalname ;
      }
      AV42Art_Enc = O8071Art_Enc ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV42Art_Enc", GXutil.rtrim( AV42Art_Enc));
   }

   public void valid_Art_cor( )
   {
      n8072Art_Cor = false ;
      if ( ! ( ( GXutil.strcmp(A8072Art_Cor, "S") == 0 ) || ( GXutil.strcmp(A8072Art_Cor, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ART_COR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArt_Cor_Internalname ;
      }
      AV43Art_Cor = O8072Art_Cor ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV43Art_Cor", GXutil.rtrim( AV43Art_Cor));
   }

   public void valid_Art_rdo( )
   {
      n8073Art_Rdo = false ;
      AV44Art_Rdo = O8073Art_Rdo ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV44Art_Rdo", GXutil.ltrim( localUtil.ntoc( AV44Art_Rdo, (byte)(6), (byte)(2), ".", "")));
   }

   public void valid_Art_rdpc( )
   {
      n8074Art_Rdpc = false ;
      AV45Art_Rdpc = O8074Art_Rdpc ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV45Art_Rdpc", GXutil.ltrim( localUtil.ntoc( AV45Art_Rdpc, (byte)(6), (byte)(2), ".", "")));
   }

   public void valid_Art_fabs( )
   {
      n8075Art_Fabs = false ;
      AV46Art_Fabs = O8075Art_Fabs ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV46Art_Fabs", GXutil.ltrim( localUtil.ntoc( AV46Art_Fabs, (byte)(6), (byte)(2), ".", "")));
   }

   public void valid_Art_ancb( )
   {
      n8076Art_AncB = false ;
      AV47Art_AncB = O8076Art_AncB ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV47Art_AncB", GXutil.ltrim( localUtil.ntoc( AV47Art_AncB, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_grmb( )
   {
      n8077Art_GrmB = false ;
      n8065Art_GrmA = false ;
      n8066Art_AncA = false ;
      n8067Art_Merma = false ;
      n8068Art_PmlA = false ;
      n8069Art_Eanc = false ;
      n8070Art_Elar = false ;
      n8071Art_Enc = false ;
      n8072Art_Cor = false ;
      n8073Art_Rdo = false ;
      n8074Art_Rdpc = false ;
      n8075Art_Fabs = false ;
      n8076Art_AncB = false ;
      AV48Art_GrmB = O8077Art_GrmB ;
      AV34Texto_i = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Grm2A=", ""), "") + GXutil.str( A8065Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2A=", ""), "") + GXutil.str( AV36Art_GrmA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "AnchoA", ""), "") + GXutil.str( A8066Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "oldAnchoA=", ""), "") + GXutil.str( AV37Art_AncA, 3, 0) + httpContext.getMessage( httpContext.getMessage( "Merma=", ""), "") + GXutil.str( A8067Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "OldMerma=", ""), "") + GXutil.str( AV38Art_Merma, 5, 2) + httpContext.getMessage( httpContext.getMessage( "PmlA=", ""), "") + GXutil.str( A8068Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlA=", ""), "") + GXutil.str( AV39Art_PmlA, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncAnc=", ""), "") + GXutil.str( A8069Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncAnc=", ""), "") + GXutil.str( AV40Art_Eanc, 4, 0) + httpContext.getMessage( httpContext.getMessage( "EncLar=", ""), "") + GXutil.str( A8070Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldEncLar=", ""), "") + GXutil.str( AV41Art_Elar, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Enc=", ""), "") + A8071Art_Enc + httpContext.getMessage( httpContext.getMessage( "OldArt_Enc=", ""), "") + AV42Art_Enc + httpContext.getMessage( httpContext.getMessage( "Art_Cor=", ""), "") + A8072Art_Cor + httpContext.getMessage( httpContext.getMessage( "OldArt_Cor=", ""), "") + AV43Art_Cor + httpContext.getMessage( httpContext.getMessage( "Art_Rdo=", ""), "") + GXutil.str( A8073Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldArt_Rdo=", ""), "") + GXutil.str( AV44Art_Rdo, 6, 2) + httpContext.getMessage( httpContext.getMessage( "RdoCalc=", ""), "") + GXutil.str( A8074Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoCalc=", ""), "") + GXutil.str( AV45Art_Rdpc, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Fac Abs=", ""), "") + GXutil.str( A8075Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldFac Abs=", ""), "") + GXutil.str( AV46Art_Fabs, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Art_AncB=", ""), "") + GXutil.str( A8076Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_AncB=", ""), "") + GXutil.str( AV47Art_AncB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2AAC=", ""), "") + GXutil.str( A8077Art_GrmB, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2AAC=", ""), "") + GXutil.str( AV48Art_GrmB, 4, 0) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV48Art_GrmB", GXutil.ltrim( localUtil.ntoc( AV48Art_GrmB, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Texto_i", AV34Texto_i);
   }

   public void valid_Art_grmc( )
   {
      n8078Art_GrmC = false ;
      AV49Art_GrmC = O8078Art_GrmC ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV49Art_GrmC", GXutil.ltrim( localUtil.ntoc( AV49Art_GrmC, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_ancc( )
   {
      n8079Art_AncC = false ;
      AV50Art_Ancc = O8079Art_AncC ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV50Art_Ancc", GXutil.ltrim( localUtil.ntoc( AV50Art_Ancc, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Art_pmlc( )
   {
      n8080Art_PmlC = false ;
      AV51Art_PmlC = O8080Art_PmlC ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV51Art_PmlC", GXutil.ltrim( localUtil.ntoc( AV51Art_PmlC, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_grmp( )
   {
      n8081Art_GrmP = false ;
      AV52Art_GrmP = O8081Art_GrmP ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV52Art_GrmP", GXutil.ltrim( localUtil.ntoc( AV52Art_GrmP, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_pmlp( )
   {
      n8082Art_PmlP = false ;
      AV53Art_Pmlp = O8082Art_PmlP ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV53Art_Pmlp", GXutil.ltrim( localUtil.ntoc( AV53Art_Pmlp, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Art_ancp( )
   {
      n8083Art_AncP = false ;
      AV54Art_ancP = O8083Art_AncP ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV54Art_ancP", GXutil.ltrim( localUtil.ntoc( AV54Art_ancP, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Art_rdop( )
   {
      n8084Art_RdoP = false ;
      AV55Art_rdop = O8084Art_RdoP ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV55Art_rdop", GXutil.ltrim( localUtil.ntoc( AV55Art_rdop, (byte)(6), (byte)(2), ".", "")));
   }

   public void valid_Art_ets( )
   {
      n9628Art_ets = false ;
      AV56Art_ets = O9628Art_ets ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV56Art_ets", GXutil.rtrim( AV56Art_ets));
   }

   public void valid_Art_els( )
   {
      n9629Art_els = false ;
      n8078Art_GrmC = false ;
      n8079Art_AncC = false ;
      n8080Art_PmlC = false ;
      n8081Art_GrmP = false ;
      n8082Art_PmlP = false ;
      n8083Art_AncP = false ;
      n8084Art_RdoP = false ;
      n9628Art_ets = false ;
      AV57Art_els = O9629Art_els ;
      AV35Texto_ii = httpContext.getMessage( httpContext.getMessage( "Cliente=", ""), "") + GXutil.str( A252CliCod, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + A65ArtCod + httpContext.getMessage( httpContext.getMessage( " Proceso=", ""), "") + A758ProCod + httpContext.getMessage( httpContext.getMessage( "Art_GrmC=", ""), "") + GXutil.str( A8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_GrmC=", ""), "") + GXutil.str( O8078Art_GrmC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Ancc=", ""), "") + GXutil.str( A8079Art_AncC, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_ancc=", ""), "") + GXutil.str( AV50Art_Ancc, 3, 0) + httpContext.getMessage( httpContext.getMessage( "PmlAAC=", ""), "") + GXutil.str( A8080Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldPmlAAC=", ""), "") + GXutil.str( AV51Art_PmlC, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Grm2P=", ""), "") + GXutil.str( A8081Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldGrm2P=", ""), "") + GXutil.str( AV52Art_GrmP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Art_Pmlp=", ""), "") + GXutil.str( A8082Art_PmlP, 4, 0) + httpContext.getMessage( httpContext.getMessage( "OldArt_Pmlp=", ""), "") + GXutil.str( AV53Art_Pmlp, 4, 0) + httpContext.getMessage( httpContext.getMessage( "Ancho P=", ""), "") + GXutil.str( A8083Art_AncP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "OldAncho P=", ""), "") + GXutil.str( AV54Art_ancP, 3, 0) + httpContext.getMessage( httpContext.getMessage( "RdoP=", ""), "") + GXutil.str( A8084Art_RdoP, 6, 2) + httpContext.getMessage( httpContext.getMessage( "OldRdoP=", ""), "") + GXutil.str( AV55Art_rdop, 6, 2) + httpContext.getMessage( httpContext.getMessage( "Ets=", ""), "") + A9628Art_ets + httpContext.getMessage( httpContext.getMessage( "OldEts=", ""), "") + AV56Art_ets + httpContext.getMessage( httpContext.getMessage( "Els=", ""), "") + A9629Art_els + httpContext.getMessage( httpContext.getMessage( "OldEls=", ""), "") + AV57Art_els ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV57Art_els", GXutil.rtrim( AV57Art_els));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_ii", AV35Texto_ii);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ARTDSC","{handler:'valid_Artdsc',iparms:[]");
      setEventMetadata("VALID_ARTDSC",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A8166Art_Und',fld:'ART_UND',pic:'@!'},{av:'A8165Art_Dsc',fld:'ART_DSC',pic:''},{av:'AV36Art_GrmA',fld:'vART_GRMA',pic:'ZZZ9'},{av:'AV37Art_AncA',fld:'vART_ANCA',pic:'ZZ9'},{av:'AV38Art_Merma',fld:'vART_MERMA',pic:'Z9.99'},{av:'AV39Art_PmlA',fld:'vART_PMLA',pic:'ZZZ9'},{av:'AV40Art_Eanc',fld:'vART_EANC',pic:'ZZZ9'},{av:'AV41Art_Elar',fld:'vART_ELAR',pic:'ZZZ9'},{av:'AV42Art_Enc',fld:'vART_ENC',pic:'@!'},{av:'AV43Art_Cor',fld:'vART_COR',pic:'@!'},{av:'AV44Art_Rdo',fld:'vART_RDO',pic:'ZZ9.99'},{av:'AV45Art_Rdpc',fld:'vART_RDPC',pic:'ZZ9.99'},{av:'AV46Art_Fabs',fld:'vART_FABS',pic:'ZZ9.99'},{av:'AV47Art_AncB',fld:'vART_ANCB',pic:'ZZZ9'},{av:'AV48Art_GrmB',fld:'vART_GRMB',pic:'ZZZ9'},{av:'AV34Texto_i',fld:'vTEXTO_I',pic:''},{av:'AV49Art_GrmC',fld:'vART_GRMC',pic:'ZZZ9'},{av:'AV50Art_Ancc',fld:'vART_ANCC',pic:'ZZ9'},{av:'AV51Art_PmlC',fld:'vART_PMLC',pic:'ZZZ9'},{av:'AV52Art_GrmP',fld:'vART_GRMP',pic:'ZZZ9'},{av:'AV53Art_Pmlp',fld:'vART_PMLP',pic:'ZZZ9'},{av:'AV54Art_ancP',fld:'vART_ANCP',pic:'ZZ9'},{av:'AV55Art_rdop',fld:'vART_RDOP',pic:'ZZ9.99'},{av:'AV56Art_ets',fld:'vART_ETS',pic:''},{av:'AV57Art_els',fld:'vART_ELS',pic:''},{av:'AV35Texto_ii',fld:'vTEXTO_II',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A3682ArtAnu',fld:'ARTANU',pic:'@!'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A8065Art_GrmA',fld:'ART_GRMA',pic:'ZZZ9'},{av:'A8066Art_AncA',fld:'ART_ANCA',pic:'ZZ9'},{av:'A8067Art_Merma',fld:'ART_MERMA',pic:'Z9.99'},{av:'A8068Art_PmlA',fld:'ART_PMLA',pic:'ZZZ9'},{av:'A8069Art_Eanc',fld:'ART_EANC',pic:'ZZZ9'},{av:'A8070Art_Elar',fld:'ART_ELAR',pic:'ZZZ9'},{av:'A8071Art_Enc',fld:'ART_ENC',pic:'@!'},{av:'A8072Art_Cor',fld:'ART_COR',pic:'@!'},{av:'A8073Art_Rdo',fld:'ART_RDO',pic:'ZZ9.99'},{av:'A8075Art_Fabs',fld:'ART_FABS',pic:'ZZ9.99'},{av:'A8076Art_AncB',fld:'ART_ANCB',pic:'ZZZ9'},{av:'A8077Art_GrmB',fld:'ART_GRMB',pic:'ZZZ9'},{av:'A8078Art_GrmC',fld:'ART_GRMC',pic:'ZZZ9'},{av:'A8079Art_AncC',fld:'ART_ANCC',pic:'ZZ9'},{av:'A8080Art_PmlC',fld:'ART_PMLC',pic:'ZZZ9'},{av:'A8081Art_GrmP',fld:'ART_GRMP',pic:'ZZZ9'},{av:'A8082Art_PmlP',fld:'ART_PMLP',pic:'ZZZ9'},{av:'A8083Art_AncP',fld:'ART_ANCP',pic:'ZZ9'},{av:'A8084Art_RdoP',fld:'ART_RDOP',pic:'ZZ9.99'},{av:'A8165Art_Dsc',fld:'ART_DSC',pic:''},{av:'A8166Art_Und',fld:'ART_UND',pic:'@!'},{av:'A8955Art_Obs',fld:'ART_OBS',pic:''},{av:'A9628Art_ets',fld:'ART_ETS',pic:''},{av:'A9629Art_els',fld:'ART_ELS',pic:''},{av:'A12141ProSta',fld:'PROSTA',pic:'9'},{av:'A12752Art_Tipo',fld:'ART_TIPO',pic:''},{av:'AV36Art_GrmA',fld:'vART_GRMA',pic:'ZZZ9'},{av:'AV37Art_AncA',fld:'vART_ANCA',pic:'ZZ9'},{av:'AV38Art_Merma',fld:'vART_MERMA',pic:'Z9.99'},{av:'A8074Art_Rdpc',fld:'ART_RDPC',pic:'ZZ9.99'},{av:'AV39Art_PmlA',fld:'vART_PMLA',pic:'ZZZ9'},{av:'AV40Art_Eanc',fld:'vART_EANC',pic:'ZZZ9'},{av:'AV41Art_Elar',fld:'vART_ELAR',pic:'ZZZ9'},{av:'AV42Art_Enc',fld:'vART_ENC',pic:'@!'},{av:'AV43Art_Cor',fld:'vART_COR',pic:'@!'},{av:'AV44Art_Rdo',fld:'vART_RDO',pic:'ZZ9.99'},{av:'AV45Art_Rdpc',fld:'vART_RDPC',pic:'ZZ9.99'},{av:'AV46Art_Fabs',fld:'vART_FABS',pic:'ZZ9.99'},{av:'AV47Art_AncB',fld:'vART_ANCB',pic:'ZZZ9'},{av:'AV48Art_GrmB',fld:'vART_GRMB',pic:'ZZZ9'},{av:'AV34Texto_i',fld:'vTEXTO_I',pic:''},{av:'AV49Art_GrmC',fld:'vART_GRMC',pic:'ZZZ9'},{av:'AV50Art_Ancc',fld:'vART_ANCC',pic:'ZZ9'},{av:'AV51Art_PmlC',fld:'vART_PMLC',pic:'ZZZ9'},{av:'AV52Art_GrmP',fld:'vART_GRMP',pic:'ZZZ9'},{av:'AV53Art_Pmlp',fld:'vART_PMLP',pic:'ZZZ9'},{av:'AV54Art_ancP',fld:'vART_ANCP',pic:'ZZ9'},{av:'AV55Art_rdop',fld:'vART_RDOP',pic:'ZZ9.99'},{av:'AV56Art_ets',fld:'vART_ETS',pic:''},{av:'AV57Art_els',fld:'vART_ELS',pic:''},{av:'AV35Texto_ii',fld:'vTEXTO_II',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z758ProCod'},{av:'Z279CliNom'},{av:'Z407EmprNom'},{av:'Z69ArtDsc'},{av:'Z3682ArtAnu'},{av:'Z759ProDsc'},{av:'Z8065Art_GrmA'},{av:'Z8066Art_AncA'},{av:'Z8067Art_Merma'},{av:'Z8068Art_PmlA'},{av:'Z8069Art_Eanc'},{av:'Z8070Art_Elar'},{av:'Z8071Art_Enc'},{av:'Z8072Art_Cor'},{av:'Z8073Art_Rdo'},{av:'Z8075Art_Fabs'},{av:'Z8076Art_AncB'},{av:'Z8077Art_GrmB'},{av:'Z8078Art_GrmC'},{av:'Z8079Art_AncC'},{av:'Z8080Art_PmlC'},{av:'Z8081Art_GrmP'},{av:'Z8082Art_PmlP'},{av:'Z8083Art_AncP'},{av:'Z8084Art_RdoP'},{av:'Z8165Art_Dsc'},{av:'Z8166Art_Und'},{av:'Z8955Art_Obs'},{av:'Z9628Art_ets'},{av:'Z9629Art_els'},{av:'Z12141ProSta'},{av:'Z12752Art_Tipo'},{av:'ZV36Art_GrmA'},{av:'ZV37Art_AncA'},{av:'ZV38Art_Merma'},{av:'Z8074Art_Rdpc'},{av:'ZV39Art_PmlA'},{av:'ZV40Art_Eanc'},{av:'ZV41Art_Elar'},{av:'ZV42Art_Enc'},{av:'ZV43Art_Cor'},{av:'ZV44Art_Rdo'},{av:'ZV45Art_Rdpc'},{av:'ZV46Art_Fabs'},{av:'ZV47Art_AncB'},{av:'ZV48Art_GrmB'},{av:'ZV34Texto_i'},{av:'ZV49Art_GrmC'},{av:'ZV50Art_Ancc'},{av:'ZV51Art_PmlC'},{av:'ZV52Art_GrmP'},{av:'ZV53Art_Pmlp'},{av:'ZV54Art_ancP'},{av:'ZV55Art_rdop'},{av:'ZV56Art_ets'},{av:'ZV57Art_els'},{av:'ZV35Texto_ii'},{av:'O8078Art_GrmC'},{av:'O9629Art_els'},{av:'O9628Art_ets'},{av:'O8084Art_RdoP'},{av:'O8083Art_AncP'},{av:'O8082Art_PmlP'},{av:'O8081Art_GrmP'},{av:'O8080Art_PmlC'},{av:'O8079Art_AncC'},{av:'O8077Art_GrmB'},{av:'O8076Art_AncB'},{av:'O8075Art_Fabs'},{av:'O8074Art_Rdpc'},{av:'O8073Art_Rdo'},{av:'O8072Art_Cor'},{av:'O8071Art_Enc'},{av:'O8070Art_Elar'},{av:'O8069Art_Eanc'},{av:'O8068Art_PmlA'},{av:'O8067Art_Merma'},{av:'O8066Art_AncA'},{av:'O8065Art_GrmA'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ART_GRMA","{handler:'valid_Art_grma',iparms:[{av:'O8065Art_GrmA'},{av:'A8065Art_GrmA',fld:'ART_GRMA',pic:'ZZZ9'},{av:'AV36Art_GrmA',fld:'vART_GRMA',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_GRMA",",oparms:[{av:'AV36Art_GrmA',fld:'vART_GRMA',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_ANCA","{handler:'valid_Art_anca',iparms:[{av:'O8066Art_AncA'},{av:'A8066Art_AncA',fld:'ART_ANCA',pic:'ZZ9'},{av:'AV37Art_AncA',fld:'vART_ANCA',pic:'ZZ9'}]");
      setEventMetadata("VALID_ART_ANCA",",oparms:[{av:'AV37Art_AncA',fld:'vART_ANCA',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ART_MERMA","{handler:'valid_Art_merma',iparms:[{av:'O8067Art_Merma'},{av:'A8067Art_Merma',fld:'ART_MERMA',pic:'Z9.99'},{av:'AV38Art_Merma',fld:'vART_MERMA',pic:'Z9.99'}]");
      setEventMetadata("VALID_ART_MERMA",",oparms:[{av:'AV38Art_Merma',fld:'vART_MERMA',pic:'Z9.99'}]}");
      setEventMetadata("VALID_ART_PMLA","{handler:'valid_Art_pmla',iparms:[{av:'O8068Art_PmlA'},{av:'A8068Art_PmlA',fld:'ART_PMLA',pic:'ZZZ9'},{av:'A8074Art_Rdpc',fld:'ART_RDPC',pic:'ZZ9.99'},{av:'AV39Art_PmlA',fld:'vART_PMLA',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_PMLA",",oparms:[{av:'A8074Art_Rdpc',fld:'ART_RDPC',pic:'ZZ9.99'},{av:'AV39Art_PmlA',fld:'vART_PMLA',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_EANC","{handler:'valid_Art_eanc',iparms:[{av:'O8069Art_Eanc'},{av:'A8069Art_Eanc',fld:'ART_EANC',pic:'ZZZ9'},{av:'AV40Art_Eanc',fld:'vART_EANC',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_EANC",",oparms:[{av:'AV40Art_Eanc',fld:'vART_EANC',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_ELAR","{handler:'valid_Art_elar',iparms:[{av:'O8070Art_Elar'},{av:'A8070Art_Elar',fld:'ART_ELAR',pic:'ZZZ9'},{av:'AV41Art_Elar',fld:'vART_ELAR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_ELAR",",oparms:[{av:'AV41Art_Elar',fld:'vART_ELAR',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_ENC","{handler:'valid_Art_enc',iparms:[{av:'O8071Art_Enc'},{av:'A8071Art_Enc',fld:'ART_ENC',pic:'@!'},{av:'AV42Art_Enc',fld:'vART_ENC',pic:'@!'}]");
      setEventMetadata("VALID_ART_ENC",",oparms:[{av:'AV42Art_Enc',fld:'vART_ENC',pic:'@!'}]}");
      setEventMetadata("VALID_ART_COR","{handler:'valid_Art_cor',iparms:[{av:'O8072Art_Cor'},{av:'A8072Art_Cor',fld:'ART_COR',pic:'@!'},{av:'AV43Art_Cor',fld:'vART_COR',pic:'@!'}]");
      setEventMetadata("VALID_ART_COR",",oparms:[{av:'AV43Art_Cor',fld:'vART_COR',pic:'@!'}]}");
      setEventMetadata("VALID_ART_RDO","{handler:'valid_Art_rdo',iparms:[{av:'O8073Art_Rdo'},{av:'A8073Art_Rdo',fld:'ART_RDO',pic:'ZZ9.99'},{av:'AV44Art_Rdo',fld:'vART_RDO',pic:'ZZ9.99'}]");
      setEventMetadata("VALID_ART_RDO",",oparms:[{av:'AV44Art_Rdo',fld:'vART_RDO',pic:'ZZ9.99'}]}");
      setEventMetadata("VALID_ART_RDPC","{handler:'valid_Art_rdpc',iparms:[{av:'O8074Art_Rdpc'},{av:'A8074Art_Rdpc',fld:'ART_RDPC',pic:'ZZ9.99'},{av:'AV45Art_Rdpc',fld:'vART_RDPC',pic:'ZZ9.99'}]");
      setEventMetadata("VALID_ART_RDPC",",oparms:[{av:'AV45Art_Rdpc',fld:'vART_RDPC',pic:'ZZ9.99'}]}");
      setEventMetadata("VALID_ART_FABS","{handler:'valid_Art_fabs',iparms:[{av:'O8075Art_Fabs'},{av:'A8075Art_Fabs',fld:'ART_FABS',pic:'ZZ9.99'},{av:'AV46Art_Fabs',fld:'vART_FABS',pic:'ZZ9.99'}]");
      setEventMetadata("VALID_ART_FABS",",oparms:[{av:'AV46Art_Fabs',fld:'vART_FABS',pic:'ZZ9.99'}]}");
      setEventMetadata("VALID_ART_ANCB","{handler:'valid_Art_ancb',iparms:[{av:'O8076Art_AncB'},{av:'A8076Art_AncB',fld:'ART_ANCB',pic:'ZZZ9'},{av:'AV47Art_AncB',fld:'vART_ANCB',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_ANCB",",oparms:[{av:'AV47Art_AncB',fld:'vART_ANCB',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_GRMB","{handler:'valid_Art_grmb',iparms:[{av:'O8077Art_GrmB'},{av:'A8077Art_GrmB',fld:'ART_GRMB',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A8065Art_GrmA',fld:'ART_GRMA',pic:'ZZZ9'},{av:'AV36Art_GrmA',fld:'vART_GRMA',pic:'ZZZ9'},{av:'A8066Art_AncA',fld:'ART_ANCA',pic:'ZZ9'},{av:'AV37Art_AncA',fld:'vART_ANCA',pic:'ZZ9'},{av:'A8067Art_Merma',fld:'ART_MERMA',pic:'Z9.99'},{av:'AV38Art_Merma',fld:'vART_MERMA',pic:'Z9.99'},{av:'A8068Art_PmlA',fld:'ART_PMLA',pic:'ZZZ9'},{av:'AV39Art_PmlA',fld:'vART_PMLA',pic:'ZZZ9'},{av:'A8069Art_Eanc',fld:'ART_EANC',pic:'ZZZ9'},{av:'AV40Art_Eanc',fld:'vART_EANC',pic:'ZZZ9'},{av:'A8070Art_Elar',fld:'ART_ELAR',pic:'ZZZ9'},{av:'AV41Art_Elar',fld:'vART_ELAR',pic:'ZZZ9'},{av:'A8071Art_Enc',fld:'ART_ENC',pic:'@!'},{av:'AV42Art_Enc',fld:'vART_ENC',pic:'@!'},{av:'A8072Art_Cor',fld:'ART_COR',pic:'@!'},{av:'AV43Art_Cor',fld:'vART_COR',pic:'@!'},{av:'A8073Art_Rdo',fld:'ART_RDO',pic:'ZZ9.99'},{av:'AV44Art_Rdo',fld:'vART_RDO',pic:'ZZ9.99'},{av:'A8074Art_Rdpc',fld:'ART_RDPC',pic:'ZZ9.99'},{av:'AV45Art_Rdpc',fld:'vART_RDPC',pic:'ZZ9.99'},{av:'A8075Art_Fabs',fld:'ART_FABS',pic:'ZZ9.99'},{av:'AV46Art_Fabs',fld:'vART_FABS',pic:'ZZ9.99'},{av:'A8076Art_AncB',fld:'ART_ANCB',pic:'ZZZ9'},{av:'AV47Art_AncB',fld:'vART_ANCB',pic:'ZZZ9'},{av:'AV48Art_GrmB',fld:'vART_GRMB',pic:'ZZZ9'},{av:'AV34Texto_i',fld:'vTEXTO_I',pic:''}]");
      setEventMetadata("VALID_ART_GRMB",",oparms:[{av:'AV48Art_GrmB',fld:'vART_GRMB',pic:'ZZZ9'},{av:'AV34Texto_i',fld:'vTEXTO_I',pic:''}]}");
      setEventMetadata("VALID_ART_GRMC","{handler:'valid_Art_grmc',iparms:[{av:'O8078Art_GrmC'},{av:'A8078Art_GrmC',fld:'ART_GRMC',pic:'ZZZ9'},{av:'AV49Art_GrmC',fld:'vART_GRMC',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_GRMC",",oparms:[{av:'AV49Art_GrmC',fld:'vART_GRMC',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_ANCC","{handler:'valid_Art_ancc',iparms:[{av:'O8079Art_AncC'},{av:'A8079Art_AncC',fld:'ART_ANCC',pic:'ZZ9'},{av:'AV50Art_Ancc',fld:'vART_ANCC',pic:'ZZ9'}]");
      setEventMetadata("VALID_ART_ANCC",",oparms:[{av:'AV50Art_Ancc',fld:'vART_ANCC',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ART_PMLC","{handler:'valid_Art_pmlc',iparms:[{av:'O8080Art_PmlC'},{av:'A8080Art_PmlC',fld:'ART_PMLC',pic:'ZZZ9'},{av:'AV51Art_PmlC',fld:'vART_PMLC',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_PMLC",",oparms:[{av:'AV51Art_PmlC',fld:'vART_PMLC',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_GRMP","{handler:'valid_Art_grmp',iparms:[{av:'O8081Art_GrmP'},{av:'A8081Art_GrmP',fld:'ART_GRMP',pic:'ZZZ9'},{av:'AV52Art_GrmP',fld:'vART_GRMP',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_GRMP",",oparms:[{av:'AV52Art_GrmP',fld:'vART_GRMP',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_PMLP","{handler:'valid_Art_pmlp',iparms:[{av:'O8082Art_PmlP'},{av:'A8082Art_PmlP',fld:'ART_PMLP',pic:'ZZZ9'},{av:'AV53Art_Pmlp',fld:'vART_PMLP',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ART_PMLP",",oparms:[{av:'AV53Art_Pmlp',fld:'vART_PMLP',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ART_ANCP","{handler:'valid_Art_ancp',iparms:[{av:'O8083Art_AncP'},{av:'A8083Art_AncP',fld:'ART_ANCP',pic:'ZZ9'},{av:'AV54Art_ancP',fld:'vART_ANCP',pic:'ZZ9'}]");
      setEventMetadata("VALID_ART_ANCP",",oparms:[{av:'AV54Art_ancP',fld:'vART_ANCP',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ART_RDOP","{handler:'valid_Art_rdop',iparms:[{av:'O8084Art_RdoP'},{av:'A8084Art_RdoP',fld:'ART_RDOP',pic:'ZZ9.99'},{av:'AV55Art_rdop',fld:'vART_RDOP',pic:'ZZ9.99'}]");
      setEventMetadata("VALID_ART_RDOP",",oparms:[{av:'AV55Art_rdop',fld:'vART_RDOP',pic:'ZZ9.99'}]}");
      setEventMetadata("VALID_ART_DSC","{handler:'valid_Art_dsc',iparms:[]");
      setEventMetadata("VALID_ART_DSC",",oparms:[]}");
      setEventMetadata("VALID_ART_ETS","{handler:'valid_Art_ets',iparms:[{av:'O9628Art_ets'},{av:'A9628Art_ets',fld:'ART_ETS',pic:''},{av:'AV56Art_ets',fld:'vART_ETS',pic:''}]");
      setEventMetadata("VALID_ART_ETS",",oparms:[{av:'AV56Art_ets',fld:'vART_ETS',pic:''}]}");
      setEventMetadata("VALID_ART_ELS","{handler:'valid_Art_els',iparms:[{av:'O8078Art_GrmC'},{av:'O9629Art_els'},{av:'A9629Art_els',fld:'ART_ELS',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A8078Art_GrmC',fld:'ART_GRMC',pic:'ZZZ9'},{av:'A8079Art_AncC',fld:'ART_ANCC',pic:'ZZ9'},{av:'AV50Art_Ancc',fld:'vART_ANCC',pic:'ZZ9'},{av:'A8080Art_PmlC',fld:'ART_PMLC',pic:'ZZZ9'},{av:'AV51Art_PmlC',fld:'vART_PMLC',pic:'ZZZ9'},{av:'A8081Art_GrmP',fld:'ART_GRMP',pic:'ZZZ9'},{av:'AV52Art_GrmP',fld:'vART_GRMP',pic:'ZZZ9'},{av:'A8082Art_PmlP',fld:'ART_PMLP',pic:'ZZZ9'},{av:'AV53Art_Pmlp',fld:'vART_PMLP',pic:'ZZZ9'},{av:'A8083Art_AncP',fld:'ART_ANCP',pic:'ZZ9'},{av:'AV54Art_ancP',fld:'vART_ANCP',pic:'ZZ9'},{av:'A8084Art_RdoP',fld:'ART_RDOP',pic:'ZZ9.99'},{av:'AV55Art_rdop',fld:'vART_RDOP',pic:'ZZ9.99'},{av:'A9628Art_ets',fld:'ART_ETS',pic:''},{av:'AV56Art_ets',fld:'vART_ETS',pic:''},{av:'AV57Art_els',fld:'vART_ELS',pic:''},{av:'AV35Texto_ii',fld:'vTEXTO_II',pic:''}]");
      setEventMetadata("VALID_ART_ELS",",oparms:[{av:'AV57Art_els',fld:'vART_ELS',pic:''},{av:'AV35Texto_ii',fld:'vTEXTO_II',pic:''}]}");
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
      pr_default.close(16);
      pr_default.close(15);
      pr_default.close(14);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z8074Art_Rdpc = DecimalUtil.ZERO ;
      Z8067Art_Merma = DecimalUtil.ZERO ;
      Z8071Art_Enc = "" ;
      Z8072Art_Cor = "" ;
      Z8073Art_Rdo = DecimalUtil.ZERO ;
      Z8075Art_Fabs = DecimalUtil.ZERO ;
      Z8084Art_RdoP = DecimalUtil.ZERO ;
      Z8165Art_Dsc = "" ;
      Z8166Art_Und = "" ;
      Z8955Art_Obs = "" ;
      Z9628Art_ets = "" ;
      Z9629Art_els = "" ;
      Z12752Art_Tipo = "" ;
      O9629Art_els = "" ;
      O9628Art_ets = "" ;
      O8084Art_RdoP = DecimalUtil.ZERO ;
      O8075Art_Fabs = DecimalUtil.ZERO ;
      O8074Art_Rdpc = DecimalUtil.ZERO ;
      O8073Art_Rdo = DecimalUtil.ZERO ;
      O8072Art_Cor = "" ;
      O8071Art_Enc = "" ;
      O8067Art_Merma = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A8165Art_Dsc = "" ;
      AV33Msg_e = "" ;
      AV59Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV34Texto_i = "" ;
      AV35Texto_ii = "" ;
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A3682ArtAnu = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A8067Art_Merma = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A8071Art_Enc = "" ;
      lblTextblock17_Jsonclick = "" ;
      A8072Art_Cor = "" ;
      lblTextblock18_Jsonclick = "" ;
      A8073Art_Rdo = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A8074Art_Rdpc = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A8075Art_Fabs = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A8084Art_RdoP = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A8166Art_Und = "" ;
      lblTextblock32_Jsonclick = "" ;
      A8955Art_Obs = "" ;
      lblTextblock33_Jsonclick = "" ;
      A9628Art_ets = "" ;
      lblTextblock34_Jsonclick = "" ;
      A9629Art_els = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A12752Art_Tipo = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Modif = "" ;
      AV38Art_Merma = DecimalUtil.ZERO ;
      AV42Art_Enc = "" ;
      AV43Art_Cor = "" ;
      AV44Art_Rdo = DecimalUtil.ZERO ;
      AV45Art_Rdpc = DecimalUtil.ZERO ;
      AV46Art_Fabs = DecimalUtil.ZERO ;
      AV55Art_rdop = DecimalUtil.ZERO ;
      AV56Art_ets = "" ;
      AV57Art_els = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z3682ArtAnu = "" ;
      Z759ProDsc = "" ;
      T01124_A407EmprNom = new String[] {""} ;
      T01124_n407EmprNom = new boolean[] {false} ;
      T01125_A279CliNom = new String[] {""} ;
      T01126_A69ArtDsc = new String[] {""} ;
      T01126_n69ArtDsc = new boolean[] {false} ;
      T01126_A3682ArtAnu = new String[] {""} ;
      T01126_n3682ArtAnu = new boolean[] {false} ;
      T01127_A759ProDsc = new String[] {""} ;
      T01128_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01128_n8074Art_Rdpc = new boolean[] {false} ;
      T01128_A279CliNom = new String[] {""} ;
      T01128_A407EmprNom = new String[] {""} ;
      T01128_n407EmprNom = new boolean[] {false} ;
      T01128_A69ArtDsc = new String[] {""} ;
      T01128_n69ArtDsc = new boolean[] {false} ;
      T01128_A3682ArtAnu = new String[] {""} ;
      T01128_n3682ArtAnu = new boolean[] {false} ;
      T01128_A759ProDsc = new String[] {""} ;
      T01128_A8065Art_GrmA = new short[1] ;
      T01128_n8065Art_GrmA = new boolean[] {false} ;
      T01128_A8066Art_AncA = new short[1] ;
      T01128_n8066Art_AncA = new boolean[] {false} ;
      T01128_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01128_n8067Art_Merma = new boolean[] {false} ;
      T01128_A8068Art_PmlA = new short[1] ;
      T01128_n8068Art_PmlA = new boolean[] {false} ;
      T01128_A8069Art_Eanc = new short[1] ;
      T01128_n8069Art_Eanc = new boolean[] {false} ;
      T01128_A8070Art_Elar = new short[1] ;
      T01128_n8070Art_Elar = new boolean[] {false} ;
      T01128_A8071Art_Enc = new String[] {""} ;
      T01128_n8071Art_Enc = new boolean[] {false} ;
      T01128_A8072Art_Cor = new String[] {""} ;
      T01128_n8072Art_Cor = new boolean[] {false} ;
      T01128_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01128_n8073Art_Rdo = new boolean[] {false} ;
      T01128_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01128_n8075Art_Fabs = new boolean[] {false} ;
      T01128_A8076Art_AncB = new short[1] ;
      T01128_n8076Art_AncB = new boolean[] {false} ;
      T01128_A8077Art_GrmB = new short[1] ;
      T01128_n8077Art_GrmB = new boolean[] {false} ;
      T01128_A8078Art_GrmC = new short[1] ;
      T01128_n8078Art_GrmC = new boolean[] {false} ;
      T01128_A8079Art_AncC = new short[1] ;
      T01128_n8079Art_AncC = new boolean[] {false} ;
      T01128_A8080Art_PmlC = new short[1] ;
      T01128_n8080Art_PmlC = new boolean[] {false} ;
      T01128_A8081Art_GrmP = new short[1] ;
      T01128_n8081Art_GrmP = new boolean[] {false} ;
      T01128_A8082Art_PmlP = new short[1] ;
      T01128_n8082Art_PmlP = new boolean[] {false} ;
      T01128_A8083Art_AncP = new short[1] ;
      T01128_n8083Art_AncP = new boolean[] {false} ;
      T01128_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01128_n8084Art_RdoP = new boolean[] {false} ;
      T01128_A8165Art_Dsc = new String[] {""} ;
      T01128_n8165Art_Dsc = new boolean[] {false} ;
      T01128_A8166Art_Und = new String[] {""} ;
      T01128_n8166Art_Und = new boolean[] {false} ;
      T01128_A8955Art_Obs = new String[] {""} ;
      T01128_n8955Art_Obs = new boolean[] {false} ;
      T01128_A9628Art_ets = new String[] {""} ;
      T01128_n9628Art_ets = new boolean[] {false} ;
      T01128_A9629Art_els = new String[] {""} ;
      T01128_n9629Art_els = new boolean[] {false} ;
      T01128_A12141ProSta = new byte[1] ;
      T01128_A12752Art_Tipo = new String[] {""} ;
      T01128_n12752Art_Tipo = new boolean[] {false} ;
      T01128_A396EmprCod = new String[] {""} ;
      T01128_A252CliCod = new int[1] ;
      T01128_A65ArtCod = new String[] {""} ;
      T01128_A758ProCod = new String[] {""} ;
      T01129_A396EmprCod = new String[] {""} ;
      T01129_A252CliCod = new int[1] ;
      T01129_A65ArtCod = new String[] {""} ;
      T01129_A758ProCod = new String[] {""} ;
      T01123_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01123_n8074Art_Rdpc = new boolean[] {false} ;
      T01123_A8065Art_GrmA = new short[1] ;
      T01123_n8065Art_GrmA = new boolean[] {false} ;
      T01123_A8066Art_AncA = new short[1] ;
      T01123_n8066Art_AncA = new boolean[] {false} ;
      T01123_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01123_n8067Art_Merma = new boolean[] {false} ;
      T01123_A8068Art_PmlA = new short[1] ;
      T01123_n8068Art_PmlA = new boolean[] {false} ;
      T01123_A8069Art_Eanc = new short[1] ;
      T01123_n8069Art_Eanc = new boolean[] {false} ;
      T01123_A8070Art_Elar = new short[1] ;
      T01123_n8070Art_Elar = new boolean[] {false} ;
      T01123_A8071Art_Enc = new String[] {""} ;
      T01123_n8071Art_Enc = new boolean[] {false} ;
      T01123_A8072Art_Cor = new String[] {""} ;
      T01123_n8072Art_Cor = new boolean[] {false} ;
      T01123_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01123_n8073Art_Rdo = new boolean[] {false} ;
      T01123_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01123_n8075Art_Fabs = new boolean[] {false} ;
      T01123_A8076Art_AncB = new short[1] ;
      T01123_n8076Art_AncB = new boolean[] {false} ;
      T01123_A8077Art_GrmB = new short[1] ;
      T01123_n8077Art_GrmB = new boolean[] {false} ;
      T01123_A8078Art_GrmC = new short[1] ;
      T01123_n8078Art_GrmC = new boolean[] {false} ;
      T01123_A8079Art_AncC = new short[1] ;
      T01123_n8079Art_AncC = new boolean[] {false} ;
      T01123_A8080Art_PmlC = new short[1] ;
      T01123_n8080Art_PmlC = new boolean[] {false} ;
      T01123_A8081Art_GrmP = new short[1] ;
      T01123_n8081Art_GrmP = new boolean[] {false} ;
      T01123_A8082Art_PmlP = new short[1] ;
      T01123_n8082Art_PmlP = new boolean[] {false} ;
      T01123_A8083Art_AncP = new short[1] ;
      T01123_n8083Art_AncP = new boolean[] {false} ;
      T01123_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01123_n8084Art_RdoP = new boolean[] {false} ;
      T01123_A8165Art_Dsc = new String[] {""} ;
      T01123_n8165Art_Dsc = new boolean[] {false} ;
      T01123_A8166Art_Und = new String[] {""} ;
      T01123_n8166Art_Und = new boolean[] {false} ;
      T01123_A8955Art_Obs = new String[] {""} ;
      T01123_n8955Art_Obs = new boolean[] {false} ;
      T01123_A9628Art_ets = new String[] {""} ;
      T01123_n9628Art_ets = new boolean[] {false} ;
      T01123_A9629Art_els = new String[] {""} ;
      T01123_n9629Art_els = new boolean[] {false} ;
      T01123_A12141ProSta = new byte[1] ;
      T01123_A12752Art_Tipo = new String[] {""} ;
      T01123_n12752Art_Tipo = new boolean[] {false} ;
      T01123_A396EmprCod = new String[] {""} ;
      T01123_A252CliCod = new int[1] ;
      T01123_A65ArtCod = new String[] {""} ;
      T01123_A758ProCod = new String[] {""} ;
      sMode11 = "" ;
      T011210_A396EmprCod = new String[] {""} ;
      T011210_A252CliCod = new int[1] ;
      T011210_A65ArtCod = new String[] {""} ;
      T011210_A758ProCod = new String[] {""} ;
      T011211_A396EmprCod = new String[] {""} ;
      T011211_A252CliCod = new int[1] ;
      T011211_A65ArtCod = new String[] {""} ;
      T011211_A758ProCod = new String[] {""} ;
      T01122_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01122_n8074Art_Rdpc = new boolean[] {false} ;
      T01122_A8065Art_GrmA = new short[1] ;
      T01122_n8065Art_GrmA = new boolean[] {false} ;
      T01122_A8066Art_AncA = new short[1] ;
      T01122_n8066Art_AncA = new boolean[] {false} ;
      T01122_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01122_n8067Art_Merma = new boolean[] {false} ;
      T01122_A8068Art_PmlA = new short[1] ;
      T01122_n8068Art_PmlA = new boolean[] {false} ;
      T01122_A8069Art_Eanc = new short[1] ;
      T01122_n8069Art_Eanc = new boolean[] {false} ;
      T01122_A8070Art_Elar = new short[1] ;
      T01122_n8070Art_Elar = new boolean[] {false} ;
      T01122_A8071Art_Enc = new String[] {""} ;
      T01122_n8071Art_Enc = new boolean[] {false} ;
      T01122_A8072Art_Cor = new String[] {""} ;
      T01122_n8072Art_Cor = new boolean[] {false} ;
      T01122_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01122_n8073Art_Rdo = new boolean[] {false} ;
      T01122_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01122_n8075Art_Fabs = new boolean[] {false} ;
      T01122_A8076Art_AncB = new short[1] ;
      T01122_n8076Art_AncB = new boolean[] {false} ;
      T01122_A8077Art_GrmB = new short[1] ;
      T01122_n8077Art_GrmB = new boolean[] {false} ;
      T01122_A8078Art_GrmC = new short[1] ;
      T01122_n8078Art_GrmC = new boolean[] {false} ;
      T01122_A8079Art_AncC = new short[1] ;
      T01122_n8079Art_AncC = new boolean[] {false} ;
      T01122_A8080Art_PmlC = new short[1] ;
      T01122_n8080Art_PmlC = new boolean[] {false} ;
      T01122_A8081Art_GrmP = new short[1] ;
      T01122_n8081Art_GrmP = new boolean[] {false} ;
      T01122_A8082Art_PmlP = new short[1] ;
      T01122_n8082Art_PmlP = new boolean[] {false} ;
      T01122_A8083Art_AncP = new short[1] ;
      T01122_n8083Art_AncP = new boolean[] {false} ;
      T01122_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01122_n8084Art_RdoP = new boolean[] {false} ;
      T01122_A8165Art_Dsc = new String[] {""} ;
      T01122_n8165Art_Dsc = new boolean[] {false} ;
      T01122_A8166Art_Und = new String[] {""} ;
      T01122_n8166Art_Und = new boolean[] {false} ;
      T01122_A8955Art_Obs = new String[] {""} ;
      T01122_n8955Art_Obs = new boolean[] {false} ;
      T01122_A9628Art_ets = new String[] {""} ;
      T01122_n9628Art_ets = new boolean[] {false} ;
      T01122_A9629Art_els = new String[] {""} ;
      T01122_n9629Art_els = new boolean[] {false} ;
      T01122_A12141ProSta = new byte[1] ;
      T01122_A12752Art_Tipo = new String[] {""} ;
      T01122_n12752Art_Tipo = new boolean[] {false} ;
      T01122_A396EmprCod = new String[] {""} ;
      T01122_A252CliCod = new int[1] ;
      T01122_A65ArtCod = new String[] {""} ;
      T01122_A758ProCod = new String[] {""} ;
      T011215_A396EmprCod = new String[] {""} ;
      T011215_A252CliCod = new int[1] ;
      T011215_A65ArtCod = new String[] {""} ;
      T011215_A758ProCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8166Art_Und = "" ;
      i8165Art_Dsc = "" ;
      GXv_int7 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      T011216_A407EmprNom = new String[] {""} ;
      T011216_n407EmprNom = new boolean[] {false} ;
      T011217_A279CliNom = new String[] {""} ;
      T011218_A69ArtDsc = new String[] {""} ;
      T011218_n69ArtDsc = new boolean[] {false} ;
      T011218_A3682ArtAnu = new String[] {""} ;
      T011218_n3682ArtAnu = new boolean[] {false} ;
      T011219_A759ProDsc = new String[] {""} ;
      ZV38Art_Merma = DecimalUtil.ZERO ;
      ZV42Art_Enc = "" ;
      ZV43Art_Cor = "" ;
      ZV44Art_Rdo = DecimalUtil.ZERO ;
      ZV45Art_Rdpc = DecimalUtil.ZERO ;
      ZV46Art_Fabs = DecimalUtil.ZERO ;
      ZV34Texto_i = "" ;
      ZV55Art_rdop = DecimalUtil.ZERO ;
      ZV56Art_ets = "" ;
      ZV57Art_els = "" ;
      ZV35Texto_ii = "" ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ758ProCod = "" ;
      ZZ279CliNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ3682ArtAnu = "" ;
      ZZ759ProDsc = "" ;
      ZZ8067Art_Merma = DecimalUtil.ZERO ;
      ZZ8071Art_Enc = "" ;
      ZZ8072Art_Cor = "" ;
      ZZ8073Art_Rdo = DecimalUtil.ZERO ;
      ZZ8075Art_Fabs = DecimalUtil.ZERO ;
      ZZ8084Art_RdoP = DecimalUtil.ZERO ;
      ZZ8165Art_Dsc = "" ;
      ZZ8166Art_Und = "" ;
      ZZ8955Art_Obs = "" ;
      ZZ9628Art_ets = "" ;
      ZZ9629Art_els = "" ;
      ZZ12752Art_Tipo = "" ;
      ZZV38Art_Merma = DecimalUtil.ZERO ;
      ZZ8074Art_Rdpc = DecimalUtil.ZERO ;
      ZZV42Art_Enc = "" ;
      ZZV43Art_Cor = "" ;
      ZZV44Art_Rdo = DecimalUtil.ZERO ;
      ZZV45Art_Rdpc = DecimalUtil.ZERO ;
      ZZV46Art_Fabs = DecimalUtil.ZERO ;
      ZZV34Texto_i = "" ;
      ZZV55Art_rdop = DecimalUtil.ZERO ;
      ZZV56Art_ets = "" ;
      ZZV57Art_els = "" ;
      ZZV35Texto_ii = "" ;
      ZO9629Art_els = "" ;
      ZO9628Art_ets = "" ;
      ZO8084Art_RdoP = DecimalUtil.ZERO ;
      ZO8075Art_Fabs = DecimalUtil.ZERO ;
      ZO8074Art_Rdpc = DecimalUtil.ZERO ;
      ZO8073Art_Rdo = DecimalUtil.ZERO ;
      ZO8072Art_Cor = "" ;
      ZO8071Art_Enc = "" ;
      ZO8067Art_Merma = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tartdat__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tartdat__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tartdat__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tartdat__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tartdat__default(),
         new Object[] {
             new Object[] {
            T01122_A8074Art_Rdpc, T01122_n8074Art_Rdpc, T01122_A8065Art_GrmA, T01122_n8065Art_GrmA, T01122_A8066Art_AncA, T01122_n8066Art_AncA, T01122_A8067Art_Merma, T01122_n8067Art_Merma, T01122_A8068Art_PmlA, T01122_n8068Art_PmlA,
            T01122_A8069Art_Eanc, T01122_n8069Art_Eanc, T01122_A8070Art_Elar, T01122_n8070Art_Elar, T01122_A8071Art_Enc, T01122_n8071Art_Enc, T01122_A8072Art_Cor, T01122_n8072Art_Cor, T01122_A8073Art_Rdo, T01122_n8073Art_Rdo,
            T01122_A8075Art_Fabs, T01122_n8075Art_Fabs, T01122_A8076Art_AncB, T01122_n8076Art_AncB, T01122_A8077Art_GrmB, T01122_n8077Art_GrmB, T01122_A8078Art_GrmC, T01122_n8078Art_GrmC, T01122_A8079Art_AncC, T01122_n8079Art_AncC,
            T01122_A8080Art_PmlC, T01122_n8080Art_PmlC, T01122_A8081Art_GrmP, T01122_n8081Art_GrmP, T01122_A8082Art_PmlP, T01122_n8082Art_PmlP, T01122_A8083Art_AncP, T01122_n8083Art_AncP, T01122_A8084Art_RdoP, T01122_n8084Art_RdoP,
            T01122_A8165Art_Dsc, T01122_n8165Art_Dsc, T01122_A8166Art_Und, T01122_n8166Art_Und, T01122_A8955Art_Obs, T01122_n8955Art_Obs, T01122_A9628Art_ets, T01122_n9628Art_ets, T01122_A9629Art_els, T01122_n9629Art_els,
            T01122_A12141ProSta, T01122_A12752Art_Tipo, T01122_n12752Art_Tipo, T01122_A396EmprCod, T01122_A252CliCod, T01122_A65ArtCod, T01122_A758ProCod
            }
            , new Object[] {
            T01123_A8074Art_Rdpc, T01123_n8074Art_Rdpc, T01123_A8065Art_GrmA, T01123_n8065Art_GrmA, T01123_A8066Art_AncA, T01123_n8066Art_AncA, T01123_A8067Art_Merma, T01123_n8067Art_Merma, T01123_A8068Art_PmlA, T01123_n8068Art_PmlA,
            T01123_A8069Art_Eanc, T01123_n8069Art_Eanc, T01123_A8070Art_Elar, T01123_n8070Art_Elar, T01123_A8071Art_Enc, T01123_n8071Art_Enc, T01123_A8072Art_Cor, T01123_n8072Art_Cor, T01123_A8073Art_Rdo, T01123_n8073Art_Rdo,
            T01123_A8075Art_Fabs, T01123_n8075Art_Fabs, T01123_A8076Art_AncB, T01123_n8076Art_AncB, T01123_A8077Art_GrmB, T01123_n8077Art_GrmB, T01123_A8078Art_GrmC, T01123_n8078Art_GrmC, T01123_A8079Art_AncC, T01123_n8079Art_AncC,
            T01123_A8080Art_PmlC, T01123_n8080Art_PmlC, T01123_A8081Art_GrmP, T01123_n8081Art_GrmP, T01123_A8082Art_PmlP, T01123_n8082Art_PmlP, T01123_A8083Art_AncP, T01123_n8083Art_AncP, T01123_A8084Art_RdoP, T01123_n8084Art_RdoP,
            T01123_A8165Art_Dsc, T01123_n8165Art_Dsc, T01123_A8166Art_Und, T01123_n8166Art_Und, T01123_A8955Art_Obs, T01123_n8955Art_Obs, T01123_A9628Art_ets, T01123_n9628Art_ets, T01123_A9629Art_els, T01123_n9629Art_els,
            T01123_A12141ProSta, T01123_A12752Art_Tipo, T01123_n12752Art_Tipo, T01123_A396EmprCod, T01123_A252CliCod, T01123_A65ArtCod, T01123_A758ProCod
            }
            , new Object[] {
            T01124_A407EmprNom, T01124_n407EmprNom
            }
            , new Object[] {
            T01125_A279CliNom
            }
            , new Object[] {
            T01126_A69ArtDsc, T01126_n69ArtDsc, T01126_A3682ArtAnu, T01126_n3682ArtAnu
            }
            , new Object[] {
            T01127_A759ProDsc
            }
            , new Object[] {
            T01128_A8074Art_Rdpc, T01128_n8074Art_Rdpc, T01128_A279CliNom, T01128_A407EmprNom, T01128_n407EmprNom, T01128_A69ArtDsc, T01128_n69ArtDsc, T01128_A3682ArtAnu, T01128_n3682ArtAnu, T01128_A759ProDsc,
            T01128_A8065Art_GrmA, T01128_n8065Art_GrmA, T01128_A8066Art_AncA, T01128_n8066Art_AncA, T01128_A8067Art_Merma, T01128_n8067Art_Merma, T01128_A8068Art_PmlA, T01128_n8068Art_PmlA, T01128_A8069Art_Eanc, T01128_n8069Art_Eanc,
            T01128_A8070Art_Elar, T01128_n8070Art_Elar, T01128_A8071Art_Enc, T01128_n8071Art_Enc, T01128_A8072Art_Cor, T01128_n8072Art_Cor, T01128_A8073Art_Rdo, T01128_n8073Art_Rdo, T01128_A8075Art_Fabs, T01128_n8075Art_Fabs,
            T01128_A8076Art_AncB, T01128_n8076Art_AncB, T01128_A8077Art_GrmB, T01128_n8077Art_GrmB, T01128_A8078Art_GrmC, T01128_n8078Art_GrmC, T01128_A8079Art_AncC, T01128_n8079Art_AncC, T01128_A8080Art_PmlC, T01128_n8080Art_PmlC,
            T01128_A8081Art_GrmP, T01128_n8081Art_GrmP, T01128_A8082Art_PmlP, T01128_n8082Art_PmlP, T01128_A8083Art_AncP, T01128_n8083Art_AncP, T01128_A8084Art_RdoP, T01128_n8084Art_RdoP, T01128_A8165Art_Dsc, T01128_n8165Art_Dsc,
            T01128_A8166Art_Und, T01128_n8166Art_Und, T01128_A8955Art_Obs, T01128_n8955Art_Obs, T01128_A9628Art_ets, T01128_n9628Art_ets, T01128_A9629Art_els, T01128_n9629Art_els, T01128_A12141ProSta, T01128_A12752Art_Tipo,
            T01128_n12752Art_Tipo, T01128_A396EmprCod, T01128_A252CliCod, T01128_A65ArtCod, T01128_A758ProCod
            }
            , new Object[] {
            T01129_A396EmprCod, T01129_A252CliCod, T01129_A65ArtCod, T01129_A758ProCod
            }
            , new Object[] {
            T011210_A396EmprCod, T011210_A252CliCod, T011210_A65ArtCod, T011210_A758ProCod
            }
            , new Object[] {
            T011211_A396EmprCod, T011211_A252CliCod, T011211_A65ArtCod, T011211_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011215_A396EmprCod, T011215_A252CliCod, T011215_A65ArtCod, T011215_A758ProCod
            }
            , new Object[] {
            T011216_A407EmprNom, T011216_n407EmprNom
            }
            , new Object[] {
            T011217_A279CliNom
            }
            , new Object[] {
            T011218_A69ArtDsc, T011218_n69ArtDsc, T011218_A3682ArtAnu, T011218_n3682ArtAnu
            }
            , new Object[] {
            T011219_A759ProDsc
            }
         }
      );
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV59Pgmname = "TARTDAT" ;
      Z8165Art_Dsc = "" ;
      n8165Art_Dsc = false ;
      i8165Art_Dsc = "" ;
      n8165Art_Dsc = false ;
      A8165Art_Dsc = "" ;
      n8165Art_Dsc = false ;
      Z8166Art_Und = "*" ;
      n8166Art_Und = false ;
      A8166Art_Und = "*" ;
      n8166Art_Und = false ;
      i8166Art_Und = "*" ;
      n8166Art_Und = false ;
   }

   private byte Z12141ProSta ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12141ProSta ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12141ProSta ;
   private short Z8065Art_GrmA ;
   private short Z8066Art_AncA ;
   private short Z8068Art_PmlA ;
   private short Z8069Art_Eanc ;
   private short Z8070Art_Elar ;
   private short Z8076Art_AncB ;
   private short Z8077Art_GrmB ;
   private short Z8078Art_GrmC ;
   private short Z8079Art_AncC ;
   private short Z8080Art_PmlC ;
   private short Z8081Art_GrmP ;
   private short Z8082Art_PmlP ;
   private short Z8083Art_AncP ;
   private short O8078Art_GrmC ;
   private short O8083Art_AncP ;
   private short O8082Art_PmlP ;
   private short O8081Art_GrmP ;
   private short O8080Art_PmlC ;
   private short O8079Art_AncC ;
   private short O8077Art_GrmB ;
   private short O8076Art_AncB ;
   private short O8070Art_Elar ;
   private short O8069Art_Eanc ;
   private short O8068Art_PmlA ;
   private short O8066Art_AncA ;
   private short O8065Art_GrmA ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8065Art_GrmA ;
   private short A8066Art_AncA ;
   private short A8068Art_PmlA ;
   private short A8069Art_Eanc ;
   private short A8070Art_Elar ;
   private short A8076Art_AncB ;
   private short A8077Art_GrmB ;
   private short A8078Art_GrmC ;
   private short A8079Art_AncC ;
   private short A8080Art_PmlC ;
   private short A8081Art_GrmP ;
   private short A8082Art_PmlP ;
   private short A8083Art_AncP ;
   private short AV36Art_GrmA ;
   private short AV37Art_AncA ;
   private short AV39Art_PmlA ;
   private short AV40Art_Eanc ;
   private short AV41Art_Elar ;
   private short AV47Art_AncB ;
   private short AV48Art_GrmB ;
   private short AV49Art_GrmC ;
   private short AV50Art_Ancc ;
   private short AV51Art_PmlC ;
   private short AV52Art_GrmP ;
   private short AV53Art_Pmlp ;
   private short AV54Art_ancP ;
   private short RcdFound11 ;
   private short nIsDirty_11 ;
   private short ZV36Art_GrmA ;
   private short ZV37Art_AncA ;
   private short ZV39Art_PmlA ;
   private short ZV40Art_Eanc ;
   private short ZV41Art_Elar ;
   private short ZV47Art_AncB ;
   private short ZV48Art_GrmB ;
   private short ZV49Art_GrmC ;
   private short ZV50Art_Ancc ;
   private short ZV51Art_PmlC ;
   private short ZV52Art_GrmP ;
   private short ZV53Art_Pmlp ;
   private short ZV54Art_ancP ;
   private short ZZ8065Art_GrmA ;
   private short ZZ8066Art_AncA ;
   private short ZZ8068Art_PmlA ;
   private short ZZ8069Art_Eanc ;
   private short ZZ8070Art_Elar ;
   private short ZZ8076Art_AncB ;
   private short ZZ8077Art_GrmB ;
   private short ZZ8078Art_GrmC ;
   private short ZZ8079Art_AncC ;
   private short ZZ8080Art_PmlC ;
   private short ZZ8081Art_GrmP ;
   private short ZZ8082Art_PmlP ;
   private short ZZ8083Art_AncP ;
   private short ZZV36Art_GrmA ;
   private short ZZV37Art_AncA ;
   private short ZZV39Art_PmlA ;
   private short ZZV40Art_Eanc ;
   private short ZZV41Art_Elar ;
   private short ZZV47Art_AncB ;
   private short ZZV48Art_GrmB ;
   private short ZZV49Art_GrmC ;
   private short ZZV50Art_Ancc ;
   private short ZZV51Art_PmlC ;
   private short ZZV52Art_GrmP ;
   private short ZZV53Art_Pmlp ;
   private short ZZV54Art_ancP ;
   private short ZO8078Art_GrmC ;
   private short ZO8083Art_AncP ;
   private short ZO8082Art_PmlP ;
   private short ZO8081Art_GrmP ;
   private short ZO8080Art_PmlC ;
   private short ZO8079Art_AncC ;
   private short ZO8077Art_GrmB ;
   private short ZO8076Art_AncB ;
   private short ZO8070Art_Elar ;
   private short ZO8069Art_Eanc ;
   private short ZO8068Art_PmlA ;
   private short ZO8066Art_AncA ;
   private short ZO8065Art_GrmA ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtArtAnu_Enabled ;
   private int edtProCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtArt_GrmA_Enabled ;
   private int edtArt_AncA_Enabled ;
   private int edtArt_Merma_Enabled ;
   private int edtArt_PmlA_Enabled ;
   private int edtArt_Eanc_Enabled ;
   private int edtArt_Elar_Enabled ;
   private int edtArt_Enc_Enabled ;
   private int edtArt_Cor_Enabled ;
   private int edtArt_Rdo_Enabled ;
   private int edtArt_Rdpc_Enabled ;
   private int edtArt_Fabs_Enabled ;
   private int edtArt_AncB_Enabled ;
   private int edtArt_GrmB_Enabled ;
   private int edtArt_GrmC_Enabled ;
   private int edtArt_AncC_Enabled ;
   private int edtArt_PmlC_Enabled ;
   private int edtArt_GrmP_Enabled ;
   private int edtArt_PmlP_Enabled ;
   private int edtArt_AncP_Enabled ;
   private int edtArt_RdoP_Enabled ;
   private int edtArt_Dsc_Enabled ;
   private int edtArt_Und_Enabled ;
   private int edtArt_Obs_Enabled ;
   private int edtArt_ets_Enabled ;
   private int edtArt_els_Enabled ;
   private int edtProSta_Enabled ;
   private int edtArt_Tipo_Enabled ;
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
   private int edtArt_Tipo_Backcolor ;
   private int edtProSta_Backcolor ;
   private int edtArt_els_Backcolor ;
   private int edtArt_ets_Backcolor ;
   private int edtArt_Obs_Backcolor ;
   private int edtArt_Und_Backcolor ;
   private int edtArt_Dsc_Backcolor ;
   private int edtArt_RdoP_Backcolor ;
   private int edtArt_AncP_Backcolor ;
   private int edtArt_PmlP_Backcolor ;
   private int edtArt_GrmP_Backcolor ;
   private int edtArt_PmlC_Backcolor ;
   private int edtArt_AncC_Backcolor ;
   private int edtArt_GrmC_Backcolor ;
   private int edtArt_GrmB_Backcolor ;
   private int edtArt_AncB_Backcolor ;
   private int edtArt_Fabs_Backcolor ;
   private int edtArt_Rdpc_Backcolor ;
   private int edtArt_Rdo_Backcolor ;
   private int edtArt_Cor_Backcolor ;
   private int edtArt_Enc_Backcolor ;
   private int edtArt_Elar_Backcolor ;
   private int edtArt_Eanc_Backcolor ;
   private int edtArt_PmlA_Backcolor ;
   private int edtArt_Merma_Backcolor ;
   private int edtArt_AncA_Backcolor ;
   private int edtArt_GrmA_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtArtAnu_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int7[] ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z8074Art_Rdpc ;
   private java.math.BigDecimal Z8067Art_Merma ;
   private java.math.BigDecimal Z8073Art_Rdo ;
   private java.math.BigDecimal Z8075Art_Fabs ;
   private java.math.BigDecimal Z8084Art_RdoP ;
   private java.math.BigDecimal O8084Art_RdoP ;
   private java.math.BigDecimal O8075Art_Fabs ;
   private java.math.BigDecimal O8074Art_Rdpc ;
   private java.math.BigDecimal O8073Art_Rdo ;
   private java.math.BigDecimal O8067Art_Merma ;
   private java.math.BigDecimal A8067Art_Merma ;
   private java.math.BigDecimal A8073Art_Rdo ;
   private java.math.BigDecimal A8074Art_Rdpc ;
   private java.math.BigDecimal A8075Art_Fabs ;
   private java.math.BigDecimal A8084Art_RdoP ;
   private java.math.BigDecimal AV38Art_Merma ;
   private java.math.BigDecimal AV44Art_Rdo ;
   private java.math.BigDecimal AV45Art_Rdpc ;
   private java.math.BigDecimal AV46Art_Fabs ;
   private java.math.BigDecimal AV55Art_rdop ;
   private java.math.BigDecimal ZV38Art_Merma ;
   private java.math.BigDecimal ZV44Art_Rdo ;
   private java.math.BigDecimal ZV45Art_Rdpc ;
   private java.math.BigDecimal ZV46Art_Fabs ;
   private java.math.BigDecimal ZV55Art_rdop ;
   private java.math.BigDecimal ZZ8067Art_Merma ;
   private java.math.BigDecimal ZZ8073Art_Rdo ;
   private java.math.BigDecimal ZZ8075Art_Fabs ;
   private java.math.BigDecimal ZZ8084Art_RdoP ;
   private java.math.BigDecimal ZZV38Art_Merma ;
   private java.math.BigDecimal ZZ8074Art_Rdpc ;
   private java.math.BigDecimal ZZV44Art_Rdo ;
   private java.math.BigDecimal ZZV45Art_Rdpc ;
   private java.math.BigDecimal ZZV46Art_Fabs ;
   private java.math.BigDecimal ZZV55Art_rdop ;
   private java.math.BigDecimal ZO8084Art_RdoP ;
   private java.math.BigDecimal ZO8075Art_Fabs ;
   private java.math.BigDecimal ZO8074Art_Rdpc ;
   private java.math.BigDecimal ZO8073Art_Rdo ;
   private java.math.BigDecimal ZO8067Art_Merma ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z8071Art_Enc ;
   private String Z8072Art_Cor ;
   private String Z8165Art_Dsc ;
   private String Z8166Art_Und ;
   private String Z9628Art_ets ;
   private String Z9629Art_els ;
   private String Z12752Art_Tipo ;
   private String O9629Art_els ;
   private String O9628Art_ets ;
   private String O8072Art_Cor ;
   private String O8071Art_Enc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A8165Art_Dsc ;
   private String AV33Msg_e ;
   private String AV59Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtArt_GrmA_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtArtAnu_Internalname ;
   private String A3682ArtAnu ;
   private String edtArtAnu_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtArt_GrmA_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtArt_AncA_Internalname ;
   private String edtArt_AncA_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtArt_Merma_Internalname ;
   private String edtArt_Merma_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtArt_PmlA_Internalname ;
   private String edtArt_PmlA_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtArt_Eanc_Internalname ;
   private String edtArt_Eanc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtArt_Elar_Internalname ;
   private String edtArt_Elar_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtArt_Enc_Internalname ;
   private String A8071Art_Enc ;
   private String edtArt_Enc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtArt_Cor_Internalname ;
   private String A8072Art_Cor ;
   private String edtArt_Cor_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtArt_Rdo_Internalname ;
   private String edtArt_Rdo_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtArt_Rdpc_Internalname ;
   private String edtArt_Rdpc_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtArt_Fabs_Internalname ;
   private String edtArt_Fabs_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtArt_AncB_Internalname ;
   private String edtArt_AncB_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtArt_GrmB_Internalname ;
   private String edtArt_GrmB_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtArt_GrmC_Internalname ;
   private String edtArt_GrmC_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtArt_AncC_Internalname ;
   private String edtArt_AncC_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtArt_PmlC_Internalname ;
   private String edtArt_PmlC_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtArt_GrmP_Internalname ;
   private String edtArt_GrmP_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtArt_PmlP_Internalname ;
   private String edtArt_PmlP_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtArt_AncP_Internalname ;
   private String edtArt_AncP_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtArt_RdoP_Internalname ;
   private String edtArt_RdoP_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtArt_Dsc_Internalname ;
   private String edtArt_Dsc_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtArt_Und_Internalname ;
   private String A8166Art_Und ;
   private String edtArt_Und_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtArt_Obs_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtArt_ets_Internalname ;
   private String A9628Art_ets ;
   private String edtArt_ets_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtArt_els_Internalname ;
   private String A9629Art_els ;
   private String edtArt_els_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtProSta_Internalname ;
   private String edtProSta_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtArt_Tipo_Internalname ;
   private String A12752Art_Tipo ;
   private String edtArt_Tipo_Jsonclick ;
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
   private String AV32Modif ;
   private String AV42Art_Enc ;
   private String AV43Art_Cor ;
   private String AV56Art_ets ;
   private String AV57Art_els ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z3682ArtAnu ;
   private String Z759ProDsc ;
   private String sMode11 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i8166Art_Und ;
   private String i8165Art_Dsc ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String ZV42Art_Enc ;
   private String ZV43Art_Cor ;
   private String ZV56Art_ets ;
   private String ZV57Art_els ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ758ProCod ;
   private String ZZ279CliNom ;
   private String ZZ407EmprNom ;
   private String ZZ69ArtDsc ;
   private String ZZ3682ArtAnu ;
   private String ZZ759ProDsc ;
   private String ZZ8071Art_Enc ;
   private String ZZ8072Art_Cor ;
   private String ZZ8165Art_Dsc ;
   private String ZZ8166Art_Und ;
   private String ZZ9628Art_ets ;
   private String ZZ9629Art_els ;
   private String ZZ12752Art_Tipo ;
   private String ZZV42Art_Enc ;
   private String ZZV43Art_Cor ;
   private String ZZV56Art_ets ;
   private String ZZV57Art_els ;
   private String ZO9629Art_els ;
   private String ZO9628Art_ets ;
   private String ZO8072Art_Cor ;
   private String ZO8071Art_Enc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8165Art_Dsc ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n3682ArtAnu ;
   private boolean n8065Art_GrmA ;
   private boolean n8066Art_AncA ;
   private boolean n8067Art_Merma ;
   private boolean n8068Art_PmlA ;
   private boolean n8069Art_Eanc ;
   private boolean n8070Art_Elar ;
   private boolean n8071Art_Enc ;
   private boolean n8072Art_Cor ;
   private boolean n8073Art_Rdo ;
   private boolean n8074Art_Rdpc ;
   private boolean n8075Art_Fabs ;
   private boolean n8076Art_AncB ;
   private boolean n8077Art_GrmB ;
   private boolean n8078Art_GrmC ;
   private boolean n8079Art_AncC ;
   private boolean n8080Art_PmlC ;
   private boolean n8081Art_GrmP ;
   private boolean n8082Art_PmlP ;
   private boolean n8083Art_AncP ;
   private boolean n8084Art_RdoP ;
   private boolean n8166Art_Und ;
   private boolean n8955Art_Obs ;
   private boolean n9628Art_ets ;
   private boolean n9629Art_els ;
   private boolean n12752Art_Tipo ;
   private boolean Gx_longc ;
   private String AV34Texto_i ;
   private String AV35Texto_ii ;
   private String ZV34Texto_i ;
   private String ZV35Texto_ii ;
   private String ZZV34Texto_i ;
   private String ZZV35Texto_ii ;
   private String Z8955Art_Obs ;
   private String A8955Art_Obs ;
   private String ZZ8955Art_Obs ;
   private IDataStoreProvider pr_default ;
   private String[] T01124_A407EmprNom ;
   private boolean[] T01124_n407EmprNom ;
   private String[] T01125_A279CliNom ;
   private String[] T01126_A69ArtDsc ;
   private boolean[] T01126_n69ArtDsc ;
   private String[] T01126_A3682ArtAnu ;
   private boolean[] T01126_n3682ArtAnu ;
   private String[] T01127_A759ProDsc ;
   private java.math.BigDecimal[] T01128_A8074Art_Rdpc ;
   private boolean[] T01128_n8074Art_Rdpc ;
   private String[] T01128_A279CliNom ;
   private String[] T01128_A407EmprNom ;
   private boolean[] T01128_n407EmprNom ;
   private String[] T01128_A69ArtDsc ;
   private boolean[] T01128_n69ArtDsc ;
   private String[] T01128_A3682ArtAnu ;
   private boolean[] T01128_n3682ArtAnu ;
   private String[] T01128_A759ProDsc ;
   private short[] T01128_A8065Art_GrmA ;
   private boolean[] T01128_n8065Art_GrmA ;
   private short[] T01128_A8066Art_AncA ;
   private boolean[] T01128_n8066Art_AncA ;
   private java.math.BigDecimal[] T01128_A8067Art_Merma ;
   private boolean[] T01128_n8067Art_Merma ;
   private short[] T01128_A8068Art_PmlA ;
   private boolean[] T01128_n8068Art_PmlA ;
   private short[] T01128_A8069Art_Eanc ;
   private boolean[] T01128_n8069Art_Eanc ;
   private short[] T01128_A8070Art_Elar ;
   private boolean[] T01128_n8070Art_Elar ;
   private String[] T01128_A8071Art_Enc ;
   private boolean[] T01128_n8071Art_Enc ;
   private String[] T01128_A8072Art_Cor ;
   private boolean[] T01128_n8072Art_Cor ;
   private java.math.BigDecimal[] T01128_A8073Art_Rdo ;
   private boolean[] T01128_n8073Art_Rdo ;
   private java.math.BigDecimal[] T01128_A8075Art_Fabs ;
   private boolean[] T01128_n8075Art_Fabs ;
   private short[] T01128_A8076Art_AncB ;
   private boolean[] T01128_n8076Art_AncB ;
   private short[] T01128_A8077Art_GrmB ;
   private boolean[] T01128_n8077Art_GrmB ;
   private short[] T01128_A8078Art_GrmC ;
   private boolean[] T01128_n8078Art_GrmC ;
   private short[] T01128_A8079Art_AncC ;
   private boolean[] T01128_n8079Art_AncC ;
   private short[] T01128_A8080Art_PmlC ;
   private boolean[] T01128_n8080Art_PmlC ;
   private short[] T01128_A8081Art_GrmP ;
   private boolean[] T01128_n8081Art_GrmP ;
   private short[] T01128_A8082Art_PmlP ;
   private boolean[] T01128_n8082Art_PmlP ;
   private short[] T01128_A8083Art_AncP ;
   private boolean[] T01128_n8083Art_AncP ;
   private java.math.BigDecimal[] T01128_A8084Art_RdoP ;
   private boolean[] T01128_n8084Art_RdoP ;
   private String[] T01128_A8165Art_Dsc ;
   private boolean[] T01128_n8165Art_Dsc ;
   private String[] T01128_A8166Art_Und ;
   private boolean[] T01128_n8166Art_Und ;
   private String[] T01128_A8955Art_Obs ;
   private boolean[] T01128_n8955Art_Obs ;
   private String[] T01128_A9628Art_ets ;
   private boolean[] T01128_n9628Art_ets ;
   private String[] T01128_A9629Art_els ;
   private boolean[] T01128_n9629Art_els ;
   private byte[] T01128_A12141ProSta ;
   private String[] T01128_A12752Art_Tipo ;
   private boolean[] T01128_n12752Art_Tipo ;
   private String[] T01128_A396EmprCod ;
   private int[] T01128_A252CliCod ;
   private String[] T01128_A65ArtCod ;
   private String[] T01128_A758ProCod ;
   private String[] T01129_A396EmprCod ;
   private int[] T01129_A252CliCod ;
   private String[] T01129_A65ArtCod ;
   private String[] T01129_A758ProCod ;
   private java.math.BigDecimal[] T01123_A8074Art_Rdpc ;
   private boolean[] T01123_n8074Art_Rdpc ;
   private short[] T01123_A8065Art_GrmA ;
   private boolean[] T01123_n8065Art_GrmA ;
   private short[] T01123_A8066Art_AncA ;
   private boolean[] T01123_n8066Art_AncA ;
   private java.math.BigDecimal[] T01123_A8067Art_Merma ;
   private boolean[] T01123_n8067Art_Merma ;
   private short[] T01123_A8068Art_PmlA ;
   private boolean[] T01123_n8068Art_PmlA ;
   private short[] T01123_A8069Art_Eanc ;
   private boolean[] T01123_n8069Art_Eanc ;
   private short[] T01123_A8070Art_Elar ;
   private boolean[] T01123_n8070Art_Elar ;
   private String[] T01123_A8071Art_Enc ;
   private boolean[] T01123_n8071Art_Enc ;
   private String[] T01123_A8072Art_Cor ;
   private boolean[] T01123_n8072Art_Cor ;
   private java.math.BigDecimal[] T01123_A8073Art_Rdo ;
   private boolean[] T01123_n8073Art_Rdo ;
   private java.math.BigDecimal[] T01123_A8075Art_Fabs ;
   private boolean[] T01123_n8075Art_Fabs ;
   private short[] T01123_A8076Art_AncB ;
   private boolean[] T01123_n8076Art_AncB ;
   private short[] T01123_A8077Art_GrmB ;
   private boolean[] T01123_n8077Art_GrmB ;
   private short[] T01123_A8078Art_GrmC ;
   private boolean[] T01123_n8078Art_GrmC ;
   private short[] T01123_A8079Art_AncC ;
   private boolean[] T01123_n8079Art_AncC ;
   private short[] T01123_A8080Art_PmlC ;
   private boolean[] T01123_n8080Art_PmlC ;
   private short[] T01123_A8081Art_GrmP ;
   private boolean[] T01123_n8081Art_GrmP ;
   private short[] T01123_A8082Art_PmlP ;
   private boolean[] T01123_n8082Art_PmlP ;
   private short[] T01123_A8083Art_AncP ;
   private boolean[] T01123_n8083Art_AncP ;
   private java.math.BigDecimal[] T01123_A8084Art_RdoP ;
   private boolean[] T01123_n8084Art_RdoP ;
   private String[] T01123_A8165Art_Dsc ;
   private boolean[] T01123_n8165Art_Dsc ;
   private String[] T01123_A8166Art_Und ;
   private boolean[] T01123_n8166Art_Und ;
   private String[] T01123_A8955Art_Obs ;
   private boolean[] T01123_n8955Art_Obs ;
   private String[] T01123_A9628Art_ets ;
   private boolean[] T01123_n9628Art_ets ;
   private String[] T01123_A9629Art_els ;
   private boolean[] T01123_n9629Art_els ;
   private byte[] T01123_A12141ProSta ;
   private String[] T01123_A12752Art_Tipo ;
   private boolean[] T01123_n12752Art_Tipo ;
   private String[] T01123_A396EmprCod ;
   private int[] T01123_A252CliCod ;
   private String[] T01123_A65ArtCod ;
   private String[] T01123_A758ProCod ;
   private String[] T011210_A396EmprCod ;
   private int[] T011210_A252CliCod ;
   private String[] T011210_A65ArtCod ;
   private String[] T011210_A758ProCod ;
   private String[] T011211_A396EmprCod ;
   private int[] T011211_A252CliCod ;
   private String[] T011211_A65ArtCod ;
   private String[] T011211_A758ProCod ;
   private java.math.BigDecimal[] T01122_A8074Art_Rdpc ;
   private boolean[] T01122_n8074Art_Rdpc ;
   private short[] T01122_A8065Art_GrmA ;
   private boolean[] T01122_n8065Art_GrmA ;
   private short[] T01122_A8066Art_AncA ;
   private boolean[] T01122_n8066Art_AncA ;
   private java.math.BigDecimal[] T01122_A8067Art_Merma ;
   private boolean[] T01122_n8067Art_Merma ;
   private short[] T01122_A8068Art_PmlA ;
   private boolean[] T01122_n8068Art_PmlA ;
   private short[] T01122_A8069Art_Eanc ;
   private boolean[] T01122_n8069Art_Eanc ;
   private short[] T01122_A8070Art_Elar ;
   private boolean[] T01122_n8070Art_Elar ;
   private String[] T01122_A8071Art_Enc ;
   private boolean[] T01122_n8071Art_Enc ;
   private String[] T01122_A8072Art_Cor ;
   private boolean[] T01122_n8072Art_Cor ;
   private java.math.BigDecimal[] T01122_A8073Art_Rdo ;
   private boolean[] T01122_n8073Art_Rdo ;
   private java.math.BigDecimal[] T01122_A8075Art_Fabs ;
   private boolean[] T01122_n8075Art_Fabs ;
   private short[] T01122_A8076Art_AncB ;
   private boolean[] T01122_n8076Art_AncB ;
   private short[] T01122_A8077Art_GrmB ;
   private boolean[] T01122_n8077Art_GrmB ;
   private short[] T01122_A8078Art_GrmC ;
   private boolean[] T01122_n8078Art_GrmC ;
   private short[] T01122_A8079Art_AncC ;
   private boolean[] T01122_n8079Art_AncC ;
   private short[] T01122_A8080Art_PmlC ;
   private boolean[] T01122_n8080Art_PmlC ;
   private short[] T01122_A8081Art_GrmP ;
   private boolean[] T01122_n8081Art_GrmP ;
   private short[] T01122_A8082Art_PmlP ;
   private boolean[] T01122_n8082Art_PmlP ;
   private short[] T01122_A8083Art_AncP ;
   private boolean[] T01122_n8083Art_AncP ;
   private java.math.BigDecimal[] T01122_A8084Art_RdoP ;
   private boolean[] T01122_n8084Art_RdoP ;
   private String[] T01122_A8165Art_Dsc ;
   private boolean[] T01122_n8165Art_Dsc ;
   private String[] T01122_A8166Art_Und ;
   private boolean[] T01122_n8166Art_Und ;
   private String[] T01122_A8955Art_Obs ;
   private boolean[] T01122_n8955Art_Obs ;
   private String[] T01122_A9628Art_ets ;
   private boolean[] T01122_n9628Art_ets ;
   private String[] T01122_A9629Art_els ;
   private boolean[] T01122_n9629Art_els ;
   private byte[] T01122_A12141ProSta ;
   private String[] T01122_A12752Art_Tipo ;
   private boolean[] T01122_n12752Art_Tipo ;
   private String[] T01122_A396EmprCod ;
   private int[] T01122_A252CliCod ;
   private String[] T01122_A65ArtCod ;
   private String[] T01122_A758ProCod ;
   private String[] T011215_A396EmprCod ;
   private int[] T011215_A252CliCod ;
   private String[] T011215_A65ArtCod ;
   private String[] T011215_A758ProCod ;
   private String[] T011216_A407EmprNom ;
   private boolean[] T011216_n407EmprNom ;
   private String[] T011217_A279CliNom ;
   private String[] T011218_A69ArtDsc ;
   private boolean[] T011218_n69ArtDsc ;
   private String[] T011218_A3682ArtAnu ;
   private boolean[] T011218_n3682ArtAnu ;
   private String[] T011219_A759ProDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tartdat__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartdat__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartdat__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartdat__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartdat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01122", "SELECT Art_Rdpc, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, ProSta, Art_Tipo, EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?  FOR UPDATE OF Art_Rdpc, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, ProSta, Art_Tipo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01123", "SELECT Art_Rdpc, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, ProSta, Art_Tipo, EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01124", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01125", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01126", "SELECT ArtDsc, ArtAnu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01127", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01128", "SELECT /*+ FIRST_ROWS(1) */ TM1.Art_Rdpc, T3.CliNom, T2.EmprNom, T4.ArtDsc, T4.ArtAnu, T5.ProDsc, TM1.Art_GrmA, TM1.Art_AncA, TM1.Art_Merma, TM1.Art_PmlA, TM1.Art_Eanc, TM1.Art_Elar, TM1.Art_Enc, TM1.Art_Cor, TM1.Art_Rdo, TM1.Art_Fabs, TM1.Art_AncB, TM1.Art_GrmB, TM1.Art_GrmC, TM1.Art_AncC, TM1.Art_PmlC, TM1.Art_GrmP, TM1.Art_PmlP, TM1.Art_AncP, TM1.Art_RdoP, TM1.Art_Dsc, TM1.Art_Und, TM1.Art_Obs, TM1.Art_ets, TM1.Art_els, TM1.ProSta, TM1.Art_Tipo, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod FROM ((((TXPARTLIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01129", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011210", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011211", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011212", "INSERT INTO TXPARTLIN(Art_Rdpc, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, ProSta, Art_Tipo, EmprCod, CliCod, ArtCod, ProCod, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProStFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T011213", "UPDATE TXPARTLIN SET Art_Rdpc=?, Art_GrmA=?, Art_AncA=?, Art_Merma=?, Art_PmlA=?, Art_Eanc=?, Art_Elar=?, Art_Enc=?, Art_Cor=?, Art_Rdo=?, Art_Fabs=?, Art_AncB=?, Art_GrmB=?, Art_GrmC=?, Art_AncC=?, Art_PmlC=?, Art_GrmP=?, Art_PmlP=?, Art_AncP=?, Art_RdoP=?, Art_Dsc=?, Art_Und=?, Art_Obs=?, Art_ets=?, Art_els=?, ProSta=?, Art_Tipo=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T011214", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new ForEachCursor("T011215", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011216", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011217", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011218", "SELECT ArtDsc, ArtAnu FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011219", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(15);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(17);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(18);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(19);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(26);
               ((String[]) buf[51])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((String[]) buf[55])[0] = rslt.getString(30, 16);
               ((String[]) buf[56])[0] = rslt.getString(31, 8);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(15);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(17);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(18);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(19);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(26);
               ((String[]) buf[51])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               ((int[]) buf[54])[0] = rslt.getInt(29);
               ((String[]) buf[55])[0] = rslt.getString(30, 16);
               ((String[]) buf[56])[0] = rslt.getString(31, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 10);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((byte[]) buf[58])[0] = rslt.getByte(31);
               ((String[]) buf[59])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 3);
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((String[]) buf[63])[0] = rslt.getString(35, 16);
               ((String[]) buf[64])[0] = rslt.getString(36, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
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
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 26);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 800);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 10);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 10);
               }
               stmt.setByte(26, ((Number) parms[50]).byteValue());
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 1);
               }
               stmt.setString(28, (String)parms[53], 3);
               stmt.setInt(29, ((Number) parms[54]).intValue());
               stmt.setString(30, (String)parms[55], 16);
               stmt.setString(31, (String)parms[56], 8);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
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
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 26);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 800);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 10);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 10);
               }
               stmt.setByte(26, ((Number) parms[50]).byteValue());
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 1);
               }
               stmt.setString(28, (String)parms[53], 3);
               stmt.setInt(29, ((Number) parms[54]).intValue());
               stmt.setString(30, (String)parms[55], 16);
               stmt.setString(31, (String)parms[56], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

