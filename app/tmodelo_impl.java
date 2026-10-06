package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmodelo_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4594AccCod = (short)(GXutil.lval( httpContext.GetPar( "AccCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A4594AccCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Modelos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMdlCod_Internalname ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      edtProCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Title", edtProCod_Title, !bGXsfl_60_Refreshing);
      edtProDsc2_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Title", edtProDsc2_Title, !bGXsfl_60_Refreshing);
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
      edtAccCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Title", edtAccCod_Title, !bGXsfl_68_Refreshing);
      edtAccDsc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccDsc_Internalname, "Title", edtAccDsc_Title, !bGXsfl_68_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tmodelo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmodelo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmodelo_impl.class ));
   }

   public tmodelo_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TModelo.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Modelo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMdlCod_Internalname, GXutil.rtrim( A4658MdlCod), GXutil.rtrim( localUtil.format( A4658MdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMdlCod_Jsonclick, 0, "", "", "", "", "", 1, edtMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Desc. Modelo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMdlDsc_Internalname, GXutil.rtrim( A4659MdlDsc), GXutil.rtrim( localUtil.format( A4659MdlDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMdlDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMdlDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModelo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount697 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_697 = (short)(1) ;
            scanStartM5697( ) ;
            while ( RcdFound697 != 0 )
            {
               init_level_properties697( ) ;
               getByPrimaryKeyM5697( ) ;
               addRowM5697( ) ;
               scanNextM5697( ) ;
            }
            scanEndM5697( ) ;
            nBlankRcdCount697 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalM5697( ) ;
         standaloneModalM5697( ) ;
         sMode697 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRowM5697( ) ;
            edtavnRcdDeleted_697_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_697_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_697_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_697_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtProCod_Title = httpContext.cgiGet( "PROCOD_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Title", edtProCod_Title, !bGXsfl_60_Refreshing);
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtProDsc2_Title = httpContext.cgiGet( "PRODSC2_"+sGXsfl_60_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Title", edtProDsc2_Title, !bGXsfl_60_Refreshing);
            edtProDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC2_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc2_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_697 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalM5697( ) ;
            }
            sendRowM5697( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode697 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount697 = (short)(5) ;
         nRcdExists_697 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartM5697( ) ;
            while ( RcdFound697 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60697( ) ;
               init_level_properties697( ) ;
               standaloneNotModalM5697( ) ;
               getByPrimaryKeyM5697( ) ;
               standaloneModalM5697( ) ;
               addRowM5697( ) ;
               scanNextM5697( ) ;
            }
            scanEndM5697( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode697 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60697( ) ;
      initAllM5697( ) ;
      init_level_properties697( ) ;
      nRcdExists_697 = (short)(0) ;
      nIsMod_697 = (short)(0) ;
      nRcdDeleted_697 = (short)(0) ;
      nBlankRcdCount697 = (short)(nBlankRcdUsr697+nBlankRcdCount697) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount697 > 0 )
      {
         standaloneNotModalM5697( ) ;
         standaloneModalM5697( ) ;
         addRowM5697( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount697 = (short)(nBlankRcdCount697-1) ;
      }
      Gx_mode = sMode697 ;
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
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol68( ) ;
      nGXsfl_68_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount698 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_698 = (short)(1) ;
            scanStartM5698( ) ;
            while ( RcdFound698 != 0 )
            {
               init_level_properties698( ) ;
               getByPrimaryKeyM5698( ) ;
               addRowM5698( ) ;
               scanNextM5698( ) ;
            }
            scanEndM5698( ) ;
            nBlankRcdCount698 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalM5698( ) ;
         standaloneModalM5698( ) ;
         sMode698 = Gx_mode ;
         while ( nGXsfl_68_idx < nRC_GXsfl_68 )
         {
            bGXsfl_68_Refreshing = true ;
            readRowM5698( ) ;
            edtavnRcdDeleted_698_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_698_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_698_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_698_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAccCod_Title = httpContext.cgiGet( "ACCCOD_"+sGXsfl_68_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Title", edtAccCod_Title, !bGXsfl_68_Refreshing);
            edtAccCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACCCOD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtAccDsc_Title = httpContext.cgiGet( "ACCDSC_"+sGXsfl_68_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAccDsc_Internalname, "Title", edtAccDsc_Title, !bGXsfl_68_Refreshing);
            edtAccDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACCDSC_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAccDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccDsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            if ( ( nRcdExists_698 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalM5698( ) ;
            }
            sendRowM5698( ) ;
            bGXsfl_68_Refreshing = false ;
         }
         Gx_mode = sMode698 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount698 = (short)(5) ;
         nRcdExists_698 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartM5698( ) ;
            while ( RcdFound698 != 0 )
            {
               sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_68698( ) ;
               init_level_properties698( ) ;
               standaloneNotModalM5698( ) ;
               getByPrimaryKeyM5698( ) ;
               standaloneModalM5698( ) ;
               addRowM5698( ) ;
               scanNextM5698( ) ;
            }
            scanEndM5698( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode698 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_68698( ) ;
      initAllM5698( ) ;
      init_level_properties698( ) ;
      nRcdExists_698 = (short)(0) ;
      nIsMod_698 = (short)(0) ;
      nRcdDeleted_698 = (short)(0) ;
      nBlankRcdCount698 = (short)(nBlankRcdUsr698+nBlankRcdCount698) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount698 > 0 )
      {
         standaloneNotModalM5698( ) ;
         standaloneModalM5698( ) ;
         addRowM5698( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAccCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount698 = (short)(nBlankRcdCount698-1) ;
      }
      Gx_mode = sMode698 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModelo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TModelo.htm");
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
      e11M52 ();
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
            Z4658MdlCod = httpContext.cgiGet( "Z4658MdlCod") ;
            Z4659MdlDsc = httpContext.cgiGet( "Z4659MdlDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Lit6 = httpContext.cgiGet( "vLIT6") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A4658MdlCod = httpContext.cgiGet( edtMdlCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
            A4659MdlDsc = httpContext.cgiGet( edtMdlDsc_Internalname) ;
            n4659MdlDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4659MdlDsc", A4659MdlDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A4658MdlCod = httpContext.GetPar( "MdlCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
               getEqualNoModal( ) ;
               if ( (GXutil.strcmp("", A4658MdlCod)==0) )
               {
                  A4658MdlCod = GXutil.space( (short)(13)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
               }
               else
               {
                  if ( isIns( )  && (GXutil.strcmp("", A4658MdlCod)==0) && ( Gx_BScreen == 0 ) )
                  {
                     A4658MdlCod = A65ArtCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
                  }
               }
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
                        e11M52 ();
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
            initAllM5696( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_697_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_697_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_698_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_698_Enabled), 5, 0), !bGXsfl_68_Refreshing);
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
      disableAttributesM5696( ) ;
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

   public void confirm_M50( )
   {
      beforeValidateM5696( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsM5696( ) ;
         }
         else
         {
            checkExtendedTableM5696( ) ;
            if ( AnyError == 0 )
            {
               zmM5696( 5) ;
               zmM5696( 6) ;
               zmM5696( 7) ;
            }
            closeExtendedTableCursorsM5696( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode696 = Gx_mode ;
         confirm_M5697( ) ;
         if ( AnyError == 0 )
         {
            confirm_M5698( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode696 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode696 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesM50( ) ;
      }
   }

   public void confirm_M5698( )
   {
      nGXsfl_68_idx = 0 ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         readRowM5698( ) ;
         if ( ( nRcdExists_698 != 0 ) || ( nIsMod_698 != 0 ) )
         {
            getKeyM5698( ) ;
            if ( ( nRcdExists_698 == 0 ) && ( nRcdDeleted_698 == 0 ) )
            {
               if ( RcdFound698 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateM5698( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableM5698( ) ;
                     if ( AnyError == 0 )
                     {
                        zmM5698( 11) ;
                     }
                     closeExtendedTableCursorsM5698( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ACCCOD_" + sGXsfl_68_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAccCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound698 != 0 )
               {
                  if ( nRcdDeleted_698 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyM5698( ) ;
                     loadM5698( ) ;
                     beforeValidateM5698( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsM5698( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_698 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateM5698( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableM5698( ) ;
                           if ( AnyError == 0 )
                           {
                              zmM5698( 11) ;
                           }
                           closeExtendedTableCursorsM5698( ) ;
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
                  if ( nRcdDeleted_698 == 0 )
                  {
                     GXCCtl = "ACCCOD_" + sGXsfl_68_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAccCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_698_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAccCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4594AccCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAccDsc_Internalname, GXutil.rtrim( A4595AccDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4594AccCod_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4594AccCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_698_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_698_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_698_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_698 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_698_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_698_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACCCOD_"+sGXsfl_68_idx+"Title", GXutil.rtrim( edtAccCod_Title)) ;
            httpContext.changePostValue( "ACCCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAccCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACCDSC_"+sGXsfl_68_idx+"Title", GXutil.rtrim( edtAccDsc_Title)) ;
            httpContext.changePostValue( "ACCDSC_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAccDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_M5697( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowM5697( ) ;
         if ( ( nRcdExists_697 != 0 ) || ( nIsMod_697 != 0 ) )
         {
            getKeyM5697( ) ;
            if ( ( nRcdExists_697 == 0 ) && ( nRcdDeleted_697 == 0 ) )
            {
               if ( RcdFound697 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateM5697( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableM5697( ) ;
                     if ( AnyError == 0 )
                     {
                        zmM5697( 9) ;
                     }
                     closeExtendedTableCursorsM5697( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound697 != 0 )
               {
                  if ( nRcdDeleted_697 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyM5697( ) ;
                     loadM5697( ) ;
                     beforeValidateM5697( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsM5697( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_697 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateM5697( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableM5697( ) ;
                           if ( AnyError == 0 )
                           {
                              zmM5697( 9) ;
                           }
                           closeExtendedTableCursorsM5697( ) ;
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
                  if ( nRcdDeleted_697 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_697_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtProDsc2_Internalname, GXutil.rtrim( A4628ProDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_60_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_697_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_697_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_697_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_697 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_697_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_697_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProCod_Title)) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC2_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProDsc2_Title)) ;
            httpContext.changePostValue( "PRODSC2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionM50( )
   {
   }

   public void e11M52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1356_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1256_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT15_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN135", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT24_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT24_", ""), (byte)(99), GXv_char2) ;
      tmodelo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmodelo_impl.this.A396EmprCod = GXv_char2[0] ;
      tmodelo_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmodelo_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      edtProCod_Title = AV19Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Title", edtProCod_Title, !bGXsfl_60_Refreshing);
      edtProDsc2_Title = AV20Lit8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Title", edtProDsc2_Title, !bGXsfl_60_Refreshing);
      edtAccCod_Title = AV13Lit9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Title", edtAccCod_Title, !bGXsfl_68_Refreshing);
      edtAccDsc_Title = AV21Lit10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccDsc_Internalname, "Title", edtAccDsc_Title, !bGXsfl_68_Refreshing);
   }

   public void zmM5696( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4659MdlDsc = T00M59_A4659MdlDsc[0] ;
         }
         else
         {
            Z4659MdlDsc = A4659MdlDsc ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z4658MdlCod = A4658MdlCod ;
         Z4659MdlDsc = A4659MdlDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TModelo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T00M510 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00M510_A407EmprNom[0] ;
      n407EmprNom = T00M510_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T00M511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00M511_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(9);
      /* Using cursor T00M512 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T00M512_A69ArtDsc[0] ;
      n69ArtDsc = T00M512_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(10);
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

   public void loadM5696( )
   {
      /* Using cursor T00M513 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound696 = (short)(1) ;
         A4659MdlDsc = T00M513_A4659MdlDsc[0] ;
         n4659MdlDsc = T00M513_n4659MdlDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4659MdlDsc", A4659MdlDsc);
         A407EmprNom = T00M513_A407EmprNom[0] ;
         n407EmprNom = T00M513_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00M513_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T00M513_A69ArtDsc[0] ;
         n69ArtDsc = T00M513_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         zmM5696( -4) ;
      }
      pr_default.close(11);
      onLoadActionsM5696( ) ;
   }

   public void onLoadActionsM5696( )
   {
      if ( (GXutil.strcmp("", A4658MdlCod)==0) )
      {
         A4658MdlCod = GXutil.space( (short)(13)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A4658MdlCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A4658MdlCod = A65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
         }
      }
   }

   public void checkExtendedTableM5696( )
   {
      nIsDirty_696 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A4658MdlCod)==0) )
      {
         nIsDirty_696 = (short)(1) ;
         A4658MdlCod = GXutil.space( (short)(13)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A4658MdlCod)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_696 = (short)(1) ;
            A4658MdlCod = A65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
         }
      }
   }

   public void closeExtendedTableCursorsM5696( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyM5696( )
   {
      /* Using cursor T00M514 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound696 = (short)(1) ;
      }
      else
      {
         RcdFound696 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00M59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00M59_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M59_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M59_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zmM5696( 4) ;
         RcdFound696 = (short)(1) ;
         A4658MdlCod = T00M59_A4658MdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
         A4659MdlDsc = T00M59_A4659MdlDsc[0] ;
         n4659MdlDsc = T00M59_n4659MdlDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4659MdlDsc", A4659MdlDsc);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4658MdlCod = A4658MdlCod ;
         sMode696 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadM5696( ) ;
         if ( AnyError == 1 )
         {
            RcdFound696 = (short)(0) ;
            initializeNonKeyM5696( ) ;
         }
         Gx_mode = sMode696 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound696 = (short)(0) ;
         initializeNonKeyM5696( ) ;
         sMode696 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode696 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKeyM5696( ) ;
      if ( RcdFound696 == 0 )
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
      RcdFound696 = (short)(0) ;
      /* Using cursor T00M515 */
      pr_default.execute(13, new Object[] {A4658MdlCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00M515_A4658MdlCod[0], A4658MdlCod) < 0 ) ) && ( GXutil.strcmp(T00M515_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M515_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M515_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00M515_A4658MdlCod[0], A4658MdlCod) > 0 ) ) && ( GXutil.strcmp(T00M515_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M515_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M515_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            A4658MdlCod = T00M515_A4658MdlCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
            RcdFound696 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound696 = (short)(0) ;
      /* Using cursor T00M516 */
      pr_default.execute(14, new Object[] {A4658MdlCod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00M516_A4658MdlCod[0], A4658MdlCod) > 0 ) ) && ( GXutil.strcmp(T00M516_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M516_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M516_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00M516_A4658MdlCod[0], A4658MdlCod) < 0 ) ) && ( GXutil.strcmp(T00M516_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M516_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M516_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            A4658MdlCod = T00M516_A4658MdlCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
            RcdFound696 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyM5696( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMdlCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertM5696( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound696 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4658MdlCod, Z4658MdlCod) != 0 ) )
            {
               A4658MdlCod = Z4658MdlCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMdlCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateM5696( ) ;
               GX_FocusControl = edtMdlCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4658MdlCod, Z4658MdlCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMdlCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertM5696( ) ;
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
                  GX_FocusControl = edtMdlCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertM5696( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4658MdlCod, Z4658MdlCod) != 0 ) )
      {
         A4658MdlCod = Z4658MdlCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMdlCod_Internalname ;
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
      getKeyM5696( ) ;
      if ( RcdFound696 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4658MdlCod, Z4658MdlCod) != 0 ) )
         {
            A4658MdlCod = Z4658MdlCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4658MdlCod, Z4658MdlCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmodelo");
      GX_FocusControl = edtMdlDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_M50( ) ;
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
      if ( RcdFound696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMdlDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartM5696( ) ;
      if ( RcdFound696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMdlDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndM5696( ) ;
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
      if ( RcdFound696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMdlDsc_Internalname ;
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
      if ( RcdFound696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMdlDsc_Internalname ;
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
      scanStartM5696( ) ;
      if ( RcdFound696 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound696 != 0 )
         {
            scanNextM5696( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMdlDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndM5696( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyM5696( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00M58 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPModels"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z4659MdlDsc, T00M58_A4659MdlDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4659MdlDsc, T00M58_A4659MdlDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmodelo:[seudo value changed for attri]"+"MdlDsc");
               GXutil.writeLogRaw("Old: ",Z4659MdlDsc);
               GXutil.writeLogRaw("Current: ",T00M58_A4659MdlDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPModels"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertM5696( )
   {
      beforeValidateM5696( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM5696( ) ;
      }
      if ( AnyError == 0 )
      {
         zmM5696( 0) ;
         checkOptimisticConcurrencyM5696( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM5696( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertM5696( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M517 */
                  pr_default.execute(15, new Object[] {A4658MdlCod, Boolean.valueOf(n4659MdlDsc), A4659MdlDsc, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevelM5696( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionM50( ) ;
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
            loadM5696( ) ;
         }
         endLevelM5696( ) ;
      }
      closeExtendedTableCursorsM5696( ) ;
   }

   public void updateM5696( )
   {
      beforeValidateM5696( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM5696( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM5696( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM5696( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateM5696( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M518 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n4659MdlDsc), A4659MdlDsc, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPModels"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateM5696( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelM5696( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionM50( ) ;
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
         endLevelM5696( ) ;
      }
      closeExtendedTableCursorsM5696( ) ;
   }

   public void deferredUpdateM5696( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateM5696( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM5696( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsM5696( ) ;
         afterConfirmM5696( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteM5696( ) ;
            if ( AnyError == 0 )
            {
               scanStartM5698( ) ;
               while ( RcdFound698 != 0 )
               {
                  getByPrimaryKeyM5698( ) ;
                  deleteM5698( ) ;
                  scanNextM5698( ) ;
               }
               scanEndM5698( ) ;
               scanStartM5697( ) ;
               while ( RcdFound697 != 0 )
               {
                  getByPrimaryKeyM5697( ) ;
                  deleteM5697( ) ;
                  scanNextM5697( ) ;
               }
               scanEndM5697( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M519 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound696 == 0 )
                        {
                           initAllM5696( ) ;
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
                        resetCaptionM50( ) ;
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
      sMode696 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelM5696( ) ;
      Gx_mode = sMode696 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsM5696( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00M520 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de Formulac. por Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevelM5697( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowM5697( ) ;
         if ( ( nRcdExists_697 != 0 ) || ( nIsMod_697 != 0 ) )
         {
            standaloneNotModalM5697( ) ;
            getKeyM5697( ) ;
            if ( ( nRcdExists_697 == 0 ) && ( nRcdDeleted_697 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertM5697( ) ;
            }
            else
            {
               if ( RcdFound697 != 0 )
               {
                  if ( ( nRcdDeleted_697 != 0 ) && ( nRcdExists_697 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteM5697( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_697 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateM5697( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_697 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_697_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtProDsc2_Internalname, GXutil.rtrim( A4628ProDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_60_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_697_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_697_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_697_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_697 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_697_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_697_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProCod_Title)) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC2_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProDsc2_Title)) ;
            httpContext.changePostValue( "PRODSC2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllM5697( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_697 = (short)(0) ;
      nIsMod_697 = (short)(0) ;
      nRcdDeleted_697 = (short)(0) ;
   }

   public void processNestedLevelM5698( )
   {
      nGXsfl_68_idx = 0 ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         readRowM5698( ) ;
         if ( ( nRcdExists_698 != 0 ) || ( nIsMod_698 != 0 ) )
         {
            standaloneNotModalM5698( ) ;
            getKeyM5698( ) ;
            if ( ( nRcdExists_698 == 0 ) && ( nRcdDeleted_698 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertM5698( ) ;
            }
            else
            {
               if ( RcdFound698 != 0 )
               {
                  if ( ( nRcdDeleted_698 != 0 ) && ( nRcdExists_698 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteM5698( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_698 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateM5698( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_698 == 0 )
                  {
                     GXCCtl = "ACCCOD_" + sGXsfl_68_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAccCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_698_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAccCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4594AccCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAccDsc_Internalname, GXutil.rtrim( A4595AccDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4594AccCod_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4594AccCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_698_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_698_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_698_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_698 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_698_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_698_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACCCOD_"+sGXsfl_68_idx+"Title", GXutil.rtrim( edtAccCod_Title)) ;
            httpContext.changePostValue( "ACCCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAccCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACCDSC_"+sGXsfl_68_idx+"Title", GXutil.rtrim( edtAccDsc_Title)) ;
            httpContext.changePostValue( "ACCDSC_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAccDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllM5698( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_698 = (short)(0) ;
      nIsMod_698 = (short)(0) ;
      nRcdDeleted_698 = (short)(0) ;
   }

   public void processLevelM5696( )
   {
      /* Save parent mode. */
      sMode696 = Gx_mode ;
      processNestedLevelM5697( ) ;
      processNestedLevelM5698( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode696 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelM5696( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteM5696( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmodelo");
         if ( AnyError == 0 )
         {
            confirmValuesM50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmodelo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartM5696( )
   {
      /* Scan By routine */
      /* Using cursor T00M521 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      RcdFound696 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound696 = (short)(1) ;
         A4658MdlCod = T00M521_A4658MdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextM5696( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound696 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound696 = (short)(1) ;
         A4658MdlCod = T00M521_A4658MdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
      }
   }

   public void scanEndM5696( )
   {
      pr_default.close(19);
   }

   public void afterConfirmM5696( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertM5696( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateM5696( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteM5696( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteM5696( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateM5696( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesM5696( )
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
      edtMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMdlCod_Enabled), 5, 0), true);
      edtMdlDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMdlDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMdlDsc_Enabled), 5, 0), true);
   }

   public void zmM5697( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -8 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4658MdlCod = A4658MdlCod ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z4628ProDsc2 = A4628ProDsc2 ;
      }
   }

   public void standaloneNotModalM5697( )
   {
   }

   public void standaloneModalM5697( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void loadM5697( )
   {
      /* Using cursor T00M522 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound697 = (short)(1) ;
         A759ProDsc = T00M522_A759ProDsc[0] ;
         A4628ProDsc2 = T00M522_A4628ProDsc2[0] ;
         zmM5697( -8) ;
      }
      pr_default.close(20);
      onLoadActionsM5697( ) ;
   }

   public void onLoadActionsM5697( )
   {
   }

   public void checkExtendedTableM5697( )
   {
      nIsDirty_697 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalM5697( ) ;
      /* Using cursor T00M57 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00M57_A759ProDsc[0] ;
      A4628ProDsc2 = T00M57_A4628ProDsc2[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsM5697( )
   {
      pr_default.close(5);
   }

   public void enableDisableM5697( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A758ProCod )
   {
      /* Using cursor T00M523 */
      pr_default.execute(21, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00M523_A759ProDsc[0] ;
      A4628ProDsc2 = T00M523_A4628ProDsc2[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4628ProDsc2))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKeyM5697( )
   {
      /* Using cursor T00M524 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound697 = (short)(1) ;
      }
      else
      {
         RcdFound697 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKeyM5697( )
   {
      /* Using cursor T00M56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
      if ( (pr_default.getStatus(4) != 101) && ( T00M56_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M56_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00M56_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmM5697( 8) ;
         RcdFound697 = (short)(1) ;
         initializeNonKeyM5697( ) ;
         A758ProCod = T00M56_A758ProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4658MdlCod = A4658MdlCod ;
         Z758ProCod = A758ProCod ;
         sMode697 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalM5697( ) ;
         loadM5697( ) ;
         Gx_mode = sMode697 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound697 = (short)(0) ;
         initializeNonKeyM5697( ) ;
         sMode697 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalM5697( ) ;
         Gx_mode = sMode697 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesM5697( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrencyM5697( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00M55 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPModPro"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPModPro"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertM5697( )
   {
      beforeValidateM5697( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM5697( ) ;
      }
      if ( AnyError == 0 )
      {
         zmM5697( 0) ;
         checkOptimisticConcurrencyM5697( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM5697( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertM5697( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M525 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModPro");
                  if ( (pr_default.getStatus(23) == 1) )
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
            loadM5697( ) ;
         }
         endLevelM5697( ) ;
      }
      closeExtendedTableCursorsM5697( ) ;
   }

   public void updateM5697( )
   {
      beforeValidateM5697( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM5697( ) ;
      }
      if ( ( nIsMod_697 != 0 ) || ( nIsDirty_697 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyM5697( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmM5697( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateM5697( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPModPro */
                     deferredUpdateM5697( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyM5697( ) ;
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
            endLevelM5697( ) ;
         }
      }
      closeExtendedTableCursorsM5697( ) ;
   }

   public void deferredUpdateM5697( )
   {
   }

   public void deleteM5697( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateM5697( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM5697( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsM5697( ) ;
         afterConfirmM5697( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteM5697( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00M526 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModPro");
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
      sMode697 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelM5697( ) ;
      Gx_mode = sMode697 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsM5697( )
   {
      standaloneModalM5697( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00M527 */
         pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T00M527_A759ProDsc[0] ;
         A4628ProDsc2 = T00M527_A4628ProDsc2[0] ;
         pr_default.close(25);
      }
   }

   public void endLevelM5697( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartM5697( )
   {
      /* Scan By routine */
      /* Using cursor T00M528 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
      RcdFound697 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound697 = (short)(1) ;
         A758ProCod = T00M528_A758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextM5697( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound697 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound697 = (short)(1) ;
         A758ProCod = T00M528_A758ProCod[0] ;
      }
   }

   public void scanEndM5697( )
   {
      pr_default.close(26);
   }

   public void afterConfirmM5697( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertM5697( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateM5697( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteM5697( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteM5697( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateM5697( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesM5697( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc2_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashesM5697( )
   {
   }

   public void zmM5698( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4658MdlCod = A4658MdlCod ;
         Z396EmprCod = A396EmprCod ;
         Z4594AccCod = A4594AccCod ;
         Z4595AccDsc = A4595AccDsc ;
      }
   }

   public void standaloneNotModalM5698( )
   {
   }

   public void standaloneModalM5698( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAccCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      }
      else
      {
         edtAccCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      }
   }

   public void loadM5698( )
   {
      /* Using cursor T00M529 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Short.valueOf(A4594AccCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound698 = (short)(1) ;
         A4595AccDsc = T00M529_A4595AccDsc[0] ;
         n4595AccDsc = T00M529_n4595AccDsc[0] ;
         zmM5698( -10) ;
      }
      pr_default.close(27);
      onLoadActionsM5698( ) ;
   }

   public void onLoadActionsM5698( )
   {
   }

   public void checkExtendedTableM5698( )
   {
      nIsDirty_698 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalM5698( ) ;
      /* Using cursor T00M54 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A4594AccCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ACCCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Accesorios", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAccCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4595AccDsc = T00M54_A4595AccDsc[0] ;
      n4595AccDsc = T00M54_n4595AccDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsM5698( )
   {
      pr_default.close(2);
   }

   public void enableDisableM5698( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          short A4594AccCod )
   {
      /* Using cursor T00M530 */
      pr_default.execute(28, new Object[] {A396EmprCod, Short.valueOf(A4594AccCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "ACCCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Accesorios", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAccCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4595AccDsc = T00M530_A4595AccDsc[0] ;
      n4595AccDsc = T00M530_n4595AccDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4595AccDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void getKeyM5698( )
   {
      /* Using cursor T00M531 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Short.valueOf(A4594AccCod)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound698 = (short)(1) ;
      }
      else
      {
         RcdFound698 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKeyM5698( )
   {
      /* Using cursor T00M53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Short.valueOf(A4594AccCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T00M53_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00M53_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T00M53_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmM5698( 10) ;
         RcdFound698 = (short)(1) ;
         initializeNonKeyM5698( ) ;
         A4594AccCod = T00M53_A4594AccCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4658MdlCod = A4658MdlCod ;
         Z4594AccCod = A4594AccCod ;
         sMode698 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalM5698( ) ;
         loadM5698( ) ;
         Gx_mode = sMode698 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound698 = (short)(0) ;
         initializeNonKeyM5698( ) ;
         sMode698 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalM5698( ) ;
         Gx_mode = sMode698 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesM5698( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyM5698( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00M52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Short.valueOf(A4594AccCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPModAcc"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPModAcc"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertM5698( )
   {
      beforeValidateM5698( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM5698( ) ;
      }
      if ( AnyError == 0 )
      {
         zmM5698( 0) ;
         checkOptimisticConcurrencyM5698( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM5698( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertM5698( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M532 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A396EmprCod, Short.valueOf(A4594AccCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModAcc");
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
            loadM5698( ) ;
         }
         endLevelM5698( ) ;
      }
      closeExtendedTableCursorsM5698( ) ;
   }

   public void updateM5698( )
   {
      beforeValidateM5698( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM5698( ) ;
      }
      if ( ( nIsMod_698 != 0 ) || ( nIsDirty_698 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyM5698( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmM5698( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateM5698( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPModAcc */
                     deferredUpdateM5698( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyM5698( ) ;
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
            endLevelM5698( ) ;
         }
      }
      closeExtendedTableCursorsM5698( ) ;
   }

   public void deferredUpdateM5698( )
   {
   }

   public void deleteM5698( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateM5698( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM5698( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsM5698( ) ;
         afterConfirmM5698( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteM5698( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00M533 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Short.valueOf(A4594AccCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModAcc");
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
      sMode698 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelM5698( ) ;
      Gx_mode = sMode698 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsM5698( )
   {
      standaloneModalM5698( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00M534 */
         pr_default.execute(32, new Object[] {A396EmprCod, Short.valueOf(A4594AccCod)});
         A4595AccDsc = T00M534_A4595AccDsc[0] ;
         n4595AccDsc = T00M534_n4595AccDsc[0] ;
         pr_default.close(32);
      }
   }

   public void endLevelM5698( )
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

   public void scanStartM5698( )
   {
      /* Scan By routine */
      /* Using cursor T00M535 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
      RcdFound698 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound698 = (short)(1) ;
         A4594AccCod = T00M535_A4594AccCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextM5698( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound698 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound698 = (short)(1) ;
         A4594AccCod = T00M535_A4594AccCod[0] ;
      }
   }

   public void scanEndM5698( )
   {
      pr_default.close(33);
   }

   public void afterConfirmM5698( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertM5698( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateM5698( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteM5698( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteM5698( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateM5698( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesM5698( )
   {
      edtAccCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtAccDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccDsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void send_integrity_lvl_hashesM5698( )
   {
   }

   public void send_integrity_lvl_hashesM5696( )
   {
   }

   public void subsflControlProps_60697( )
   {
      edtavnRcdDeleted_697_Internalname = "vNRCDDELETED_697_"+sGXsfl_60_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_60_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_60_idx ;
      edtProDsc2_Internalname = "PRODSC2_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60697( )
   {
      edtavnRcdDeleted_697_Internalname = "vNRCDDELETED_697_"+sGXsfl_60_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_60_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_60_fel_idx ;
      edtProDsc2_Internalname = "PRODSC2_"+sGXsfl_60_fel_idx ;
   }

   public void addRowM5697( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60697( ) ;
      sendRowM5697( ) ;
   }

   public void sendRowM5697( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_697_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_697_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_697_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_697), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_697), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_697_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_697_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_697_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc2_Internalname,GXutil.rtrim( A4628ProDsc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProDsc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesM5697( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "nRcdDeleted_697_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_697_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_697_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_697, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_697_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_697_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC2_"+sGXsfl_60_idx+"Title", GXutil.rtrim( edtProDsc2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC2_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowM5697( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60697( ) ;
      edtavnRcdDeleted_697_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_697_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProCod_Title = httpContext.cgiGet( "PROCOD_"+sGXsfl_60_idx+"Title") ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc2_Title = httpContext.cgiGet( "PRODSC2_"+sGXsfl_60_idx+"Title") ;
      edtProDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC2_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_697_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_697_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_697");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_697_Internalname ;
         wbErr = true ;
         nRcdDeleted_697 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_697 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_697_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      A4628ProDsc2 = httpContext.cgiGet( edtProDsc2_Internalname) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_60_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_697_" + sGXsfl_60_idx ;
      nRcdDeleted_697 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_697_" + sGXsfl_60_idx ;
      nRcdExists_697 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_697_" + sGXsfl_60_idx ;
      nIsMod_697 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_68698( )
   {
      edtavnRcdDeleted_698_Internalname = "vNRCDDELETED_698_"+sGXsfl_68_idx ;
      edtAccCod_Internalname = "ACCCOD_"+sGXsfl_68_idx ;
      edtAccDsc_Internalname = "ACCDSC_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_68698( )
   {
      edtavnRcdDeleted_698_Internalname = "vNRCDDELETED_698_"+sGXsfl_68_fel_idx ;
      edtAccCod_Internalname = "ACCCOD_"+sGXsfl_68_fel_idx ;
      edtAccDsc_Internalname = "ACCDSC_"+sGXsfl_68_fel_idx ;
   }

   public void addRowM5698( )
   {
      nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_68698( ) ;
      sendRowM5698( ) ;
   }

   public void sendRowM5698( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_698_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_698_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_698_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_698), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_698), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_698_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_698_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_698_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAccCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4594AccCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4594AccCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAccCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAccCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAccDsc_Internalname,GXutil.rtrim( A4595AccDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAccDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAccDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesM5698( ) ;
      GXCCtl = "Z4594AccCod_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4594AccCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_698_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_698_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_698_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_698, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_698_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_698_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACCCOD_"+sGXsfl_68_idx+"Title", GXutil.rtrim( edtAccCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ACCCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAccCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACCDSC_"+sGXsfl_68_idx+"Title", GXutil.rtrim( edtAccDsc_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ACCDSC_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAccDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowM5698( )
   {
      nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_68698( ) ;
      edtavnRcdDeleted_698_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_698_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAccCod_Title = httpContext.cgiGet( "ACCCOD_"+sGXsfl_68_idx+"Title") ;
      edtAccCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACCCOD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAccDsc_Title = httpContext.cgiGet( "ACCDSC_"+sGXsfl_68_idx+"Title") ;
      edtAccDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACCDSC_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_698_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_698_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_698");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_698_Internalname ;
         wbErr = true ;
         nRcdDeleted_698 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_698 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_698_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAccCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAccCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ACCCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAccCod_Internalname ;
         wbErr = true ;
         A4594AccCod = (short)(0) ;
      }
      else
      {
         A4594AccCod = (short)(localUtil.ctol( httpContext.cgiGet( edtAccCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4595AccDsc = httpContext.cgiGet( edtAccDsc_Internalname) ;
      n4595AccDsc = false ;
      GXCCtl = "Z4594AccCod_" + sGXsfl_68_idx ;
      Z4594AccCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_698_" + sGXsfl_68_idx ;
      nRcdDeleted_698 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_698_" + sGXsfl_68_idx ;
      nRcdExists_698 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_698_" + sGXsfl_68_idx ;
      nIsMod_698 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAccCod_Enabled = edtAccCod_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValuesM50( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60697( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60697( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_60_idx) ;
      }
      nGXsfl_68_idx = 0 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_68698( ) ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_68698( ) ;
         httpContext.changePostValue( "Z4594AccCod_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4594AccCod_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4594AccCod_"+sGXsfl_68_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmodelo", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4658MdlCod", GXutil.rtrim( Z4658MdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4659MdlDsc", GXutil.rtrim( Z4659MdlDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nGXsfl_68_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT6", GXutil.rtrim( AV18Lit6));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.tmodelo", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TModelo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Modelos", "") ;
   }

   public void initializeNonKeyM5696( )
   {
      A4659MdlDsc = "" ;
      n4659MdlDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4659MdlDsc", A4659MdlDsc);
      Z4659MdlDsc = "" ;
   }

   public void initAllM5696( )
   {
      A4658MdlCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", A4658MdlCod);
      initializeNonKeyM5696( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyM5697( )
   {
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
   }

   public void initAllM5697( )
   {
      A758ProCod = "" ;
      initializeNonKeyM5697( ) ;
   }

   public void standaloneModalInsertM5697( )
   {
   }

   public void initializeNonKeyM5698( )
   {
      A4595AccDsc = "" ;
      n4595AccDsc = false ;
   }

   public void initAllM5698( )
   {
      A4594AccCod = (short)(0) ;
      initializeNonKeyM5698( ) ;
   }

   public void standaloneModalInsertM5698( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824152189", true, true);
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
      httpContext.AddJavascriptSource("tmodelo.js", "?2026824152189", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties697( )
   {
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void init_level_properties698( )
   {
      edtAccCod_Enabled = defedtAccCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAccCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAccCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_697, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_697_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtProCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4628ProDsc2));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtProDsc2_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol68( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_698, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_698_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4594AccCod, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtAccCod_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAccCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A4595AccDsc));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtAccDsc_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAccDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMdlCod_Internalname = "MDLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMdlDsc_Internalname = "MDLDSC" ;
      edtavnRcdDeleted_697_Internalname = "vNRCDDELETED_697" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProDsc2_Internalname = "PRODSC2" ;
      edtavnRcdDeleted_698_Internalname = "vNRCDDELETED_698" ;
      edtAccCod_Internalname = "ACCCOD" ;
      edtAccDsc_Internalname = "ACCDSC" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Modelos", "") );
      edtAccDsc_Jsonclick = "" ;
      edtAccCod_Jsonclick = "" ;
      edtavnRcdDeleted_698_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtProDsc2_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtavnRcdDeleted_697_Jsonclick = "" ;
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
      edtAccDsc_Enabled = 0 ;
      edtAccCod_Enabled = 1 ;
      edtavnRcdDeleted_698_Enabled = 1 ;
      edtProDsc2_Enabled = 0 ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtavnRcdDeleted_697_Enabled = 1 ;
      edtMdlDsc_Jsonclick = "" ;
      edtMdlDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMdlDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMdlCod_Jsonclick = "" ;
      edtMdlCod_Backcolor = (int)(0xFFFFFF) ;
      edtMdlCod_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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
      edtAccDsc_Title = httpContext.getMessage( "Desc. Accesorio", "") ;
      edtAccCod_Title = httpContext.getMessage( "Accesorio", "") ;
      edtProDsc2_Title = httpContext.getMessage( "Descripcion II", "") ;
      edtProCod_Title = httpContext.getMessage( "Codigo Proceso", "") ;
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
      subsflControlProps_60697( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalM5697( ) ;
         standaloneModalM5697( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowM5697( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60697( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_68698( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalM5698( ) ;
         standaloneModalM5698( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowM5698( ) ;
         nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_68698( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T00M536 */
      pr_default.execute(34, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00M536_A407EmprNom[0] ;
      n407EmprNom = T00M536_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(34);
      /* Using cursor T00M537 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00M537_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(35);
      /* Using cursor T00M538 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      A69ArtDsc = T00M538_A69ArtDsc[0] ;
      n69ArtDsc = T00M538_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(36);
      GX_FocusControl = edtMdlDsc_Internalname ;
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

   public void valid_Mdlcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( (GXutil.strcmp("", A4658MdlCod)==0) )
      {
         A4658MdlCod = GXutil.space( (short)(13)) ;
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A4658MdlCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A4658MdlCod = A65ArtCod ;
         }
      }
      if ( (GXutil.strcmp("", A4658MdlCod)==0) )
      {
         A4659MdlDsc = AV18Lit6 ;
         n4659MdlDsc = false ;
      }
      if ( (GXutil.strcmp("", A4658MdlCod)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Modelo NULO", ""), 1, "MDLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMdlCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4659MdlDsc", GXutil.rtrim( A4659MdlDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4658MdlCod", GXutil.rtrim( A4658MdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4659MdlDsc", GXutil.rtrim( Z4659MdlDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4658MdlCod", GXutil.rtrim( Z4658MdlCod));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Procod( )
   {
      /* Using cursor T00M527 */
      pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00M527_A759ProDsc[0] ;
      A4628ProDsc2 = T00M527_A4628ProDsc2[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", GXutil.rtrim( A4628ProDsc2));
   }

   public void valid_Acccod( )
   {
      n4595AccDsc = false ;
      /* Using cursor T00M534 */
      pr_default.execute(32, new Object[] {A396EmprCod, Short.valueOf(A4594AccCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Accesorios", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ACCCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAccCod_Internalname ;
      }
      A4595AccDsc = T00M534_A4595AccDsc[0] ;
      n4595AccDsc = T00M534_n4595AccDsc[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4595AccDsc", GXutil.rtrim( A4595AccDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_MDLCOD","{handler:'valid_Mdlcod',iparms:[{av:'edtAccDsc_Title',ctrl:'ACCDSC',prop:'Title'},{av:'edtAccCod_Title',ctrl:'ACCCOD',prop:'Title'},{av:'edtProDsc2_Title',ctrl:'PRODSC2',prop:'Title'},{av:'edtProCod_Title',ctrl:'PROCOD',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4658MdlCod',fld:'MDLCOD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV18Lit6',fld:'vLIT6',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MDLCOD",",oparms:[{av:'A4659MdlDsc',fld:'MDLDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A4658MdlCod',fld:'MDLCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4659MdlDsc'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z4658MdlCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A4628ProDsc2',fld:'PRODSC2',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A4628ProDsc2',fld:'PRODSC2',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Prodsc2',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_ACCCOD","{handler:'valid_Acccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4594AccCod',fld:'ACCCOD',pic:'ZZZ9'},{av:'A4595AccDsc',fld:'ACCDSC',pic:''}]");
      setEventMetadata("VALID_ACCCOD",",oparms:[{av:'A4595AccDsc',fld:'ACCDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Accdsc',iparms:[]");
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
      pr_default.close(32);
      pr_default.close(25);
      pr_default.close(36);
      pr_default.close(35);
      pr_default.close(34);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4658MdlCod = "" ;
      Z4659MdlDsc = "" ;
      Z758ProCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
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
      A4658MdlCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A4659MdlDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode697 = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode698 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV18Lit6 = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode696 = "" ;
      GXCCtl = "" ;
      A4595AccDsc = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV13Lit9 = "" ;
      AV21Lit10 = "" ;
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
      T00M510_A407EmprNom = new String[] {""} ;
      T00M510_n407EmprNom = new boolean[] {false} ;
      T00M511_A279CliNom = new String[] {""} ;
      T00M512_A69ArtDsc = new String[] {""} ;
      T00M512_n69ArtDsc = new boolean[] {false} ;
      T00M513_A4658MdlCod = new String[] {""} ;
      T00M513_A4659MdlDsc = new String[] {""} ;
      T00M513_n4659MdlDsc = new boolean[] {false} ;
      T00M513_A407EmprNom = new String[] {""} ;
      T00M513_n407EmprNom = new boolean[] {false} ;
      T00M513_A279CliNom = new String[] {""} ;
      T00M513_A69ArtDsc = new String[] {""} ;
      T00M513_n69ArtDsc = new boolean[] {false} ;
      T00M513_A396EmprCod = new String[] {""} ;
      T00M513_A252CliCod = new int[1] ;
      T00M513_A65ArtCod = new String[] {""} ;
      T00M514_A396EmprCod = new String[] {""} ;
      T00M514_A252CliCod = new int[1] ;
      T00M514_A65ArtCod = new String[] {""} ;
      T00M514_A4658MdlCod = new String[] {""} ;
      T00M59_A4658MdlCod = new String[] {""} ;
      T00M59_A4659MdlDsc = new String[] {""} ;
      T00M59_n4659MdlDsc = new boolean[] {false} ;
      T00M59_A396EmprCod = new String[] {""} ;
      T00M59_A252CliCod = new int[1] ;
      T00M59_A65ArtCod = new String[] {""} ;
      T00M515_A396EmprCod = new String[] {""} ;
      T00M515_A252CliCod = new int[1] ;
      T00M515_A65ArtCod = new String[] {""} ;
      T00M515_A4658MdlCod = new String[] {""} ;
      T00M516_A396EmprCod = new String[] {""} ;
      T00M516_A252CliCod = new int[1] ;
      T00M516_A65ArtCod = new String[] {""} ;
      T00M516_A4658MdlCod = new String[] {""} ;
      T00M58_A4658MdlCod = new String[] {""} ;
      T00M58_A4659MdlDsc = new String[] {""} ;
      T00M58_n4659MdlDsc = new boolean[] {false} ;
      T00M58_A396EmprCod = new String[] {""} ;
      T00M58_A252CliCod = new int[1] ;
      T00M58_A65ArtCod = new String[] {""} ;
      T00M520_A396EmprCod = new String[] {""} ;
      T00M520_A252CliCod = new int[1] ;
      T00M520_A65ArtCod = new String[] {""} ;
      T00M520_A4658MdlCod = new String[] {""} ;
      T00M520_A457FasCod = new String[] {""} ;
      T00M521_A396EmprCod = new String[] {""} ;
      T00M521_A252CliCod = new int[1] ;
      T00M521_A65ArtCod = new String[] {""} ;
      T00M521_A4658MdlCod = new String[] {""} ;
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      T00M522_A252CliCod = new int[1] ;
      T00M522_A65ArtCod = new String[] {""} ;
      T00M522_A4658MdlCod = new String[] {""} ;
      T00M522_A759ProDsc = new String[] {""} ;
      T00M522_A4628ProDsc2 = new String[] {""} ;
      T00M522_A396EmprCod = new String[] {""} ;
      T00M522_A758ProCod = new String[] {""} ;
      T00M57_A759ProDsc = new String[] {""} ;
      T00M57_A4628ProDsc2 = new String[] {""} ;
      T00M523_A759ProDsc = new String[] {""} ;
      T00M523_A4628ProDsc2 = new String[] {""} ;
      T00M524_A396EmprCod = new String[] {""} ;
      T00M524_A252CliCod = new int[1] ;
      T00M524_A65ArtCod = new String[] {""} ;
      T00M524_A4658MdlCod = new String[] {""} ;
      T00M524_A758ProCod = new String[] {""} ;
      T00M56_A252CliCod = new int[1] ;
      T00M56_A65ArtCod = new String[] {""} ;
      T00M56_A4658MdlCod = new String[] {""} ;
      T00M56_A396EmprCod = new String[] {""} ;
      T00M56_A758ProCod = new String[] {""} ;
      T00M55_A252CliCod = new int[1] ;
      T00M55_A65ArtCod = new String[] {""} ;
      T00M55_A4658MdlCod = new String[] {""} ;
      T00M55_A396EmprCod = new String[] {""} ;
      T00M55_A758ProCod = new String[] {""} ;
      T00M527_A759ProDsc = new String[] {""} ;
      T00M527_A4628ProDsc2 = new String[] {""} ;
      T00M528_A396EmprCod = new String[] {""} ;
      T00M528_A252CliCod = new int[1] ;
      T00M528_A65ArtCod = new String[] {""} ;
      T00M528_A4658MdlCod = new String[] {""} ;
      T00M528_A758ProCod = new String[] {""} ;
      Z4595AccDsc = "" ;
      T00M529_A252CliCod = new int[1] ;
      T00M529_A65ArtCod = new String[] {""} ;
      T00M529_A4658MdlCod = new String[] {""} ;
      T00M529_A4595AccDsc = new String[] {""} ;
      T00M529_n4595AccDsc = new boolean[] {false} ;
      T00M529_A396EmprCod = new String[] {""} ;
      T00M529_A4594AccCod = new short[1] ;
      T00M54_A4595AccDsc = new String[] {""} ;
      T00M54_n4595AccDsc = new boolean[] {false} ;
      T00M530_A4595AccDsc = new String[] {""} ;
      T00M530_n4595AccDsc = new boolean[] {false} ;
      T00M531_A396EmprCod = new String[] {""} ;
      T00M531_A252CliCod = new int[1] ;
      T00M531_A65ArtCod = new String[] {""} ;
      T00M531_A4658MdlCod = new String[] {""} ;
      T00M531_A4594AccCod = new short[1] ;
      T00M53_A252CliCod = new int[1] ;
      T00M53_A65ArtCod = new String[] {""} ;
      T00M53_A4658MdlCod = new String[] {""} ;
      T00M53_A396EmprCod = new String[] {""} ;
      T00M53_A4594AccCod = new short[1] ;
      T00M52_A252CliCod = new int[1] ;
      T00M52_A65ArtCod = new String[] {""} ;
      T00M52_A4658MdlCod = new String[] {""} ;
      T00M52_A396EmprCod = new String[] {""} ;
      T00M52_A4594AccCod = new short[1] ;
      T00M534_A4595AccDsc = new String[] {""} ;
      T00M534_n4595AccDsc = new boolean[] {false} ;
      T00M535_A396EmprCod = new String[] {""} ;
      T00M535_A252CliCod = new int[1] ;
      T00M535_A65ArtCod = new String[] {""} ;
      T00M535_A4658MdlCod = new String[] {""} ;
      T00M535_A4594AccCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T00M536_A407EmprNom = new String[] {""} ;
      T00M536_n407EmprNom = new boolean[] {false} ;
      T00M537_A279CliNom = new String[] {""} ;
      T00M538_A69ArtDsc = new String[] {""} ;
      T00M538_n69ArtDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ4659MdlDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ4658MdlCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmodelo__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmodelo__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmodelo__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmodelo__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmodelo__default(),
         new Object[] {
             new Object[] {
            T00M52_A252CliCod, T00M52_A65ArtCod, T00M52_A4658MdlCod, T00M52_A396EmprCod, T00M52_A4594AccCod
            }
            , new Object[] {
            T00M53_A252CliCod, T00M53_A65ArtCod, T00M53_A4658MdlCod, T00M53_A396EmprCod, T00M53_A4594AccCod
            }
            , new Object[] {
            T00M54_A4595AccDsc, T00M54_n4595AccDsc
            }
            , new Object[] {
            T00M55_A252CliCod, T00M55_A65ArtCod, T00M55_A4658MdlCod, T00M55_A396EmprCod, T00M55_A758ProCod
            }
            , new Object[] {
            T00M56_A252CliCod, T00M56_A65ArtCod, T00M56_A4658MdlCod, T00M56_A396EmprCod, T00M56_A758ProCod
            }
            , new Object[] {
            T00M57_A759ProDsc, T00M57_A4628ProDsc2
            }
            , new Object[] {
            T00M58_A4658MdlCod, T00M58_A4659MdlDsc, T00M58_n4659MdlDsc, T00M58_A396EmprCod, T00M58_A252CliCod, T00M58_A65ArtCod
            }
            , new Object[] {
            T00M59_A4658MdlCod, T00M59_A4659MdlDsc, T00M59_n4659MdlDsc, T00M59_A396EmprCod, T00M59_A252CliCod, T00M59_A65ArtCod
            }
            , new Object[] {
            T00M510_A407EmprNom, T00M510_n407EmprNom
            }
            , new Object[] {
            T00M511_A279CliNom
            }
            , new Object[] {
            T00M512_A69ArtDsc, T00M512_n69ArtDsc
            }
            , new Object[] {
            T00M513_A4658MdlCod, T00M513_A4659MdlDsc, T00M513_n4659MdlDsc, T00M513_A407EmprNom, T00M513_n407EmprNom, T00M513_A279CliNom, T00M513_A69ArtDsc, T00M513_n69ArtDsc, T00M513_A396EmprCod, T00M513_A252CliCod,
            T00M513_A65ArtCod
            }
            , new Object[] {
            T00M514_A396EmprCod, T00M514_A252CliCod, T00M514_A65ArtCod, T00M514_A4658MdlCod
            }
            , new Object[] {
            T00M515_A396EmprCod, T00M515_A252CliCod, T00M515_A65ArtCod, T00M515_A4658MdlCod
            }
            , new Object[] {
            T00M516_A396EmprCod, T00M516_A252CliCod, T00M516_A65ArtCod, T00M516_A4658MdlCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00M520_A396EmprCod, T00M520_A252CliCod, T00M520_A65ArtCod, T00M520_A4658MdlCod, T00M520_A457FasCod
            }
            , new Object[] {
            T00M521_A396EmprCod, T00M521_A252CliCod, T00M521_A65ArtCod, T00M521_A4658MdlCod
            }
            , new Object[] {
            T00M522_A252CliCod, T00M522_A65ArtCod, T00M522_A4658MdlCod, T00M522_A759ProDsc, T00M522_A4628ProDsc2, T00M522_A396EmprCod, T00M522_A758ProCod
            }
            , new Object[] {
            T00M523_A759ProDsc, T00M523_A4628ProDsc2
            }
            , new Object[] {
            T00M524_A396EmprCod, T00M524_A252CliCod, T00M524_A65ArtCod, T00M524_A4658MdlCod, T00M524_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00M527_A759ProDsc, T00M527_A4628ProDsc2
            }
            , new Object[] {
            T00M528_A396EmprCod, T00M528_A252CliCod, T00M528_A65ArtCod, T00M528_A4658MdlCod, T00M528_A758ProCod
            }
            , new Object[] {
            T00M529_A252CliCod, T00M529_A65ArtCod, T00M529_A4658MdlCod, T00M529_A4595AccDsc, T00M529_n4595AccDsc, T00M529_A396EmprCod, T00M529_A4594AccCod
            }
            , new Object[] {
            T00M530_A4595AccDsc, T00M530_n4595AccDsc
            }
            , new Object[] {
            T00M531_A396EmprCod, T00M531_A252CliCod, T00M531_A65ArtCod, T00M531_A4658MdlCod, T00M531_A4594AccCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00M534_A4595AccDsc, T00M534_n4595AccDsc
            }
            , new Object[] {
            T00M535_A396EmprCod, T00M535_A252CliCod, T00M535_A65ArtCod, T00M535_A4658MdlCod, T00M535_A4594AccCod
            }
            , new Object[] {
            T00M536_A407EmprNom, T00M536_n407EmprNom
            }
            , new Object[] {
            T00M537_A279CliNom
            }
            , new Object[] {
            T00M538_A69ArtDsc, T00M538_n69ArtDsc
            }
         }
      );
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TModelo" ;
      Z4658MdlCod = "" ;
      A4658MdlCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short nRcdDeleted_697 ;
   private short nRcdExists_697 ;
   private short nIsMod_697 ;
   private short Z4594AccCod ;
   private short nRcdDeleted_698 ;
   private short nRcdExists_698 ;
   private short nIsMod_698 ;
   private short A4594AccCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount697 ;
   private short RcdFound697 ;
   private short nBlankRcdUsr697 ;
   private short nBlankRcdCount698 ;
   private short RcdFound698 ;
   private short nBlankRcdUsr698 ;
   private short RcdFound696 ;
   private short nIsDirty_696 ;
   private short nIsDirty_697 ;
   private short nIsDirty_698 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int nRC_GXsfl_68 ;
   private int nGXsfl_68_idx=1 ;
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
   private int edtMdlCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMdlDsc_Enabled ;
   private int edtavnRcdDeleted_697_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProDsc2_Enabled ;
   private int fRowAdded ;
   private int edtavnRcdDeleted_698_Enabled ;
   private int edtAccCod_Enabled ;
   private int edtAccDsc_Enabled ;
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
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtAccCod_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtMdlDsc_Backcolor ;
   private int edtMdlCod_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4658MdlCod ;
   private String Z4659MdlDsc ;
   private String Z758ProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMdlCod_Internalname ;
   private String sGXsfl_60_idx="0001" ;
   private String edtProCod_Title ;
   private String edtProCod_Internalname ;
   private String edtProDsc2_Title ;
   private String edtProDsc2_Internalname ;
   private String Gx_mode ;
   private String sGXsfl_68_idx="0001" ;
   private String edtAccCod_Title ;
   private String edtAccCod_Internalname ;
   private String edtAccDsc_Title ;
   private String edtAccDsc_Internalname ;
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
   private String edtCliCod_Internalname ;
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
   private String A4658MdlCod ;
   private String edtMdlCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMdlDsc_Internalname ;
   private String A4659MdlDsc ;
   private String edtMdlDsc_Jsonclick ;
   private String sMode697 ;
   private String edtavnRcdDeleted_697_Internalname ;
   private String edtProDsc_Internalname ;
   private String subGrid1_Internalname ;
   private String sMode698 ;
   private String edtavnRcdDeleted_698_Internalname ;
   private String subGrid2_Internalname ;
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
   private String AV18Lit6 ;
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode696 ;
   private String GXCCtl ;
   private String A4595AccDsc ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV13Lit9 ;
   private String AV21Lit10 ;
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
   private String Z759ProDsc ;
   private String Z4628ProDsc2 ;
   private String Z4595AccDsc ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_697_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtProDsc2_Jsonclick ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_698_Jsonclick ;
   private String edtAccCod_Jsonclick ;
   private String edtAccDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4659MdlDsc ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ4658MdlCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n4659MdlDsc ;
   private boolean returnInSub ;
   private boolean n4595AccDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00M510_A407EmprNom ;
   private boolean[] T00M510_n407EmprNom ;
   private String[] T00M511_A279CliNom ;
   private String[] T00M512_A69ArtDsc ;
   private boolean[] T00M512_n69ArtDsc ;
   private String[] T00M513_A4658MdlCod ;
   private String[] T00M513_A4659MdlDsc ;
   private boolean[] T00M513_n4659MdlDsc ;
   private String[] T00M513_A407EmprNom ;
   private boolean[] T00M513_n407EmprNom ;
   private String[] T00M513_A279CliNom ;
   private String[] T00M513_A69ArtDsc ;
   private boolean[] T00M513_n69ArtDsc ;
   private String[] T00M513_A396EmprCod ;
   private int[] T00M513_A252CliCod ;
   private String[] T00M513_A65ArtCod ;
   private String[] T00M514_A396EmprCod ;
   private int[] T00M514_A252CliCod ;
   private String[] T00M514_A65ArtCod ;
   private String[] T00M514_A4658MdlCod ;
   private String[] T00M59_A4658MdlCod ;
   private String[] T00M59_A4659MdlDsc ;
   private boolean[] T00M59_n4659MdlDsc ;
   private String[] T00M59_A396EmprCod ;
   private int[] T00M59_A252CliCod ;
   private String[] T00M59_A65ArtCod ;
   private String[] T00M515_A396EmprCod ;
   private int[] T00M515_A252CliCod ;
   private String[] T00M515_A65ArtCod ;
   private String[] T00M515_A4658MdlCod ;
   private String[] T00M516_A396EmprCod ;
   private int[] T00M516_A252CliCod ;
   private String[] T00M516_A65ArtCod ;
   private String[] T00M516_A4658MdlCod ;
   private String[] T00M58_A4658MdlCod ;
   private String[] T00M58_A4659MdlDsc ;
   private boolean[] T00M58_n4659MdlDsc ;
   private String[] T00M58_A396EmprCod ;
   private int[] T00M58_A252CliCod ;
   private String[] T00M58_A65ArtCod ;
   private String[] T00M520_A396EmprCod ;
   private int[] T00M520_A252CliCod ;
   private String[] T00M520_A65ArtCod ;
   private String[] T00M520_A4658MdlCod ;
   private String[] T00M520_A457FasCod ;
   private String[] T00M521_A396EmprCod ;
   private int[] T00M521_A252CliCod ;
   private String[] T00M521_A65ArtCod ;
   private String[] T00M521_A4658MdlCod ;
   private int[] T00M522_A252CliCod ;
   private String[] T00M522_A65ArtCod ;
   private String[] T00M522_A4658MdlCod ;
   private String[] T00M522_A759ProDsc ;
   private String[] T00M522_A4628ProDsc2 ;
   private String[] T00M522_A396EmprCod ;
   private String[] T00M522_A758ProCod ;
   private String[] T00M57_A759ProDsc ;
   private String[] T00M57_A4628ProDsc2 ;
   private String[] T00M523_A759ProDsc ;
   private String[] T00M523_A4628ProDsc2 ;
   private String[] T00M524_A396EmprCod ;
   private int[] T00M524_A252CliCod ;
   private String[] T00M524_A65ArtCod ;
   private String[] T00M524_A4658MdlCod ;
   private String[] T00M524_A758ProCod ;
   private int[] T00M56_A252CliCod ;
   private String[] T00M56_A65ArtCod ;
   private String[] T00M56_A4658MdlCod ;
   private String[] T00M56_A396EmprCod ;
   private String[] T00M56_A758ProCod ;
   private int[] T00M55_A252CliCod ;
   private String[] T00M55_A65ArtCod ;
   private String[] T00M55_A4658MdlCod ;
   private String[] T00M55_A396EmprCod ;
   private String[] T00M55_A758ProCod ;
   private String[] T00M527_A759ProDsc ;
   private String[] T00M527_A4628ProDsc2 ;
   private String[] T00M528_A396EmprCod ;
   private int[] T00M528_A252CliCod ;
   private String[] T00M528_A65ArtCod ;
   private String[] T00M528_A4658MdlCod ;
   private String[] T00M528_A758ProCod ;
   private int[] T00M529_A252CliCod ;
   private String[] T00M529_A65ArtCod ;
   private String[] T00M529_A4658MdlCod ;
   private String[] T00M529_A4595AccDsc ;
   private boolean[] T00M529_n4595AccDsc ;
   private String[] T00M529_A396EmprCod ;
   private short[] T00M529_A4594AccCod ;
   private String[] T00M54_A4595AccDsc ;
   private boolean[] T00M54_n4595AccDsc ;
   private String[] T00M530_A4595AccDsc ;
   private boolean[] T00M530_n4595AccDsc ;
   private String[] T00M531_A396EmprCod ;
   private int[] T00M531_A252CliCod ;
   private String[] T00M531_A65ArtCod ;
   private String[] T00M531_A4658MdlCod ;
   private short[] T00M531_A4594AccCod ;
   private int[] T00M53_A252CliCod ;
   private String[] T00M53_A65ArtCod ;
   private String[] T00M53_A4658MdlCod ;
   private String[] T00M53_A396EmprCod ;
   private short[] T00M53_A4594AccCod ;
   private int[] T00M52_A252CliCod ;
   private String[] T00M52_A65ArtCod ;
   private String[] T00M52_A4658MdlCod ;
   private String[] T00M52_A396EmprCod ;
   private short[] T00M52_A4594AccCod ;
   private String[] T00M534_A4595AccDsc ;
   private boolean[] T00M534_n4595AccDsc ;
   private String[] T00M535_A396EmprCod ;
   private int[] T00M535_A252CliCod ;
   private String[] T00M535_A65ArtCod ;
   private String[] T00M535_A4658MdlCod ;
   private short[] T00M535_A4594AccCod ;
   private String[] T00M536_A407EmprNom ;
   private boolean[] T00M536_n407EmprNom ;
   private String[] T00M537_A279CliNom ;
   private String[] T00M538_A69ArtDsc ;
   private boolean[] T00M538_n69ArtDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmodelo__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodelo__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodelo__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodelo__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodelo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00M52", "SELECT CliCod, ArtCod, MdlCod, EmprCod, AccCod FROM TXPModAcc WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND AccCod = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M53", "SELECT CliCod, ArtCod, MdlCod, EmprCod, AccCod FROM TXPModAcc WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND AccCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M54", "SELECT AccDsc FROM TXPAcceso WHERE EmprCod = ? AND AccCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M55", "SELECT CliCod, ArtCod, MdlCod, EmprCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND ProCod = ?  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M56", "SELECT CliCod, ArtCod, MdlCod, EmprCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M57", "SELECT ProDsc, ProDsc2 FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M58", "SELECT MdlCod, MdlDsc, EmprCod, CliCod, ArtCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ?  FOR UPDATE OF MdlDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M59", "SELECT MdlCod, MdlDsc, EmprCod, CliCod, ArtCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M510", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M511", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M512", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M513", "SELECT /*+ FIRST_ROWS(100) */ TM1.MdlCod, TM1.MdlDsc, T2.EmprNom, T3.CliNom, T4.ArtDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM (((TXPModels TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.MdlCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.MdlCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M514", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M515", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE ( MdlCod > ?) and EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M516", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE ( MdlCod < ?) and EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, MdlCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00M517", "INSERT INTO TXPModels(MdlCod, MdlDsc, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPModels")
         ,new UpdateCursor("T00M518", "UPDATE TXPModels SET MdlDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ?", GX_NOMASK, "TXPModels")
         ,new UpdateCursor("T00M519", "DELETE FROM TXPModels  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ?", GX_NOMASK, "TXPModels")
         ,new ForEachCursor("T00M520", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod FROM TXPCForFa WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M521", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M522", "SELECT T1.CliCod, T1.ArtCod, T1.MdlCod, T2.ProDsc, T2.ProDsc2, T1.EmprCod, T1.ProCod FROM (TXPModPro T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.MdlCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.MdlCod, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M523", "SELECT ProDsc, ProDsc2 FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M524", "SELECT EmprCod, CliCod, ArtCod, MdlCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00M525", "INSERT INTO TXPModPro(CliCod, ArtCod, MdlCod, EmprCod, ProCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPModPro")
         ,new UpdateCursor("T00M526", "DELETE FROM TXPModPro  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND ProCod = ?", GX_NOMASK, "TXPModPro")
         ,new ForEachCursor("T00M527", "SELECT ProDsc, ProDsc2 FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M528", "SELECT EmprCod, CliCod, ArtCod, MdlCod, ProCod FROM TXPModPro WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and MdlCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod, ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M529", "SELECT T1.CliCod, T1.ArtCod, T1.MdlCod, T2.AccDsc, T1.EmprCod, T1.AccCod FROM (TXPModAcc T1 INNER JOIN TXPAcceso T2 ON T2.EmprCod = T1.EmprCod AND T2.AccCod = T1.AccCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.MdlCod = ? and T1.AccCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.MdlCod, T1.AccCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M530", "SELECT AccDsc FROM TXPAcceso WHERE EmprCod = ? AND AccCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M531", "SELECT EmprCod, CliCod, ArtCod, MdlCod, AccCod FROM TXPModAcc WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND AccCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00M532", "INSERT INTO TXPModAcc(CliCod, ArtCod, MdlCod, EmprCod, AccCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPModAcc")
         ,new UpdateCursor("T00M533", "DELETE FROM TXPModAcc  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? AND AccCod = ?", GX_NOMASK, "TXPModAcc")
         ,new ForEachCursor("T00M534", "SELECT AccDsc FROM TXPAcceso WHERE EmprCod = ? AND AccCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M535", "SELECT EmprCod, CliCod, ArtCod, MdlCod, AccCod FROM TXPModAcc WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and MdlCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod, AccCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M536", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M537", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M538", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 13);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 40);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

