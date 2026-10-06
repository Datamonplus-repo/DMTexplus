package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tppgcol_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A10579Pg_ColNom = httpContext.GetPar( "Pg_ColNom") ;
         A10580Pg_ColNum = (int)(GXutil.lval( httpContext.GetPar( "Pg_ColNum"))) ;
         A10581Pg_Tc = (short)(GXutil.lval( httpContext.GetPar( "Pg_Tc"))) ;
         AV32OkColor = (byte)(GXutil.lval( httpContext.GetPar( "OkColor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OkColor", GXutil.str( AV32OkColor, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_18Q1423( A396EmprCod, A252CliCod, A65ArtCod, A10579Pg_ColNom, A10580Pg_ColNum, A10581Pg_Tc, AV32OkColor) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"PG_PRODSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10577Pg_Procod = httpContext.GetPar( "Pg_Procod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asapg_prodsc18Q1422( A396EmprCod, A10577Pg_Procod) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            AV33Pg_ColNom = httpContext.GetPar( "Pg_ColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pg_ColNom", AV33Pg_ColNom);
            AV34Pg_ColNum = (int)(GXutil.lval( httpContext.GetPar( "Pg_ColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pg_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Pg_ColNum), 6, 0));
            AV35Pg_Tc = (short)(GXutil.lval( httpContext.GetPar( "Pg_Tc"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Pg_Tc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Pg_Tc), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO GLOBAL COLOR PARM", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPg_Procod_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      AV33Pg_ColNom = httpContext.GetPar( "Pg_ColNom") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV34Pg_ColNum = (int)(GXutil.lval( httpContext.GetPar( "Pg_ColNum"))) ;
      AV35Pg_Tc = (short)(GXutil.lval( httpContext.GetPar( "Pg_Tc"))) ;
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

   public tppgcol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tppgcol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tppgcol_impl.class ));
   }

   public tppgcol_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpPGCOL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPg_Procod_Internalname, GXutil.rtrim( A10577Pg_Procod), GXutil.rtrim( localUtil.format( A10577Pg_Procod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPg_Procod_Jsonclick, 0, "", "", "", "", "", 1, edtPg_Procod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPg_ProDsc_Internalname, GXutil.rtrim( A10578Pg_ProDsc), GXutil.rtrim( localUtil.format( A10578Pg_ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPg_ProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPg_ProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPGCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1423 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1423 = (short)(1) ;
            scanStart18Q1423( ) ;
            while ( RcdFound1423 != 0 )
            {
               init_level_properties1423( ) ;
               getByPrimaryKey18Q1423( ) ;
               addRow18Q1423( ) ;
               scanNext18Q1423( ) ;
            }
            scanEnd18Q1423( ) ;
            nBlankRcdCount1423 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal18Q1423( ) ;
         standaloneModal18Q1423( ) ;
         sMode1423 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow18Q1423( ) ;
            edtavnRcdDeleted_1423_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1423_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1423_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1423_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPg_ColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_COLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPg_ColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_COLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPg_Tc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_TC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPg_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Tc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPg_Pk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_PK_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPg_Pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Pk_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPg_Pm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_PM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPg_Pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Pm_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1423 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18Q1423( ) ;
            }
            sendRow18Q1423( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1423 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1423 = (short)(5) ;
         nRcdExists_1423 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18Q1423( ) ;
            while ( RcdFound1423 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551423( ) ;
               init_level_properties1423( ) ;
               standaloneNotModal18Q1423( ) ;
               getByPrimaryKey18Q1423( ) ;
               standaloneModal18Q1423( ) ;
               addRow18Q1423( ) ;
               scanNext18Q1423( ) ;
            }
            scanEnd18Q1423( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1423 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551423( ) ;
      initAll18Q1423( ) ;
      init_level_properties1423( ) ;
      nRcdExists_1423 = (short)(0) ;
      nIsMod_1423 = (short)(0) ;
      nRcdDeleted_1423 = (short)(0) ;
      nBlankRcdCount1423 = (short)(nBlankRcdUsr1423+nBlankRcdCount1423) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1423 > 0 )
      {
         standaloneNotModal18Q1423( ) ;
         standaloneModal18Q1423( ) ;
         addRow18Q1423( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPg_ColNom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1423 = (short)(nBlankRcdCount1423-1) ;
      }
      Gx_mode = sMode1423 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPGCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpPGCOL.htm");
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
      e1118Q2 ();
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
            Z10577Pg_Procod = httpContext.cgiGet( "Z10577Pg_Procod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pg_ColNom = httpContext.cgiGet( "vPG_COLNOM") ;
            AV34Pg_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( "vPG_COLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pg_Tc = (short)(localUtil.ctol( httpContext.cgiGet( "vPG_TC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32OkColor = (byte)(localUtil.ctol( httpContext.cgiGet( "vOKCOLOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A10577Pg_Procod = httpContext.cgiGet( edtPg_Procod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
            A10578Pg_ProDsc = httpContext.cgiGet( edtPg_ProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", A10578Pg_ProDsc);
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
               A10577Pg_Procod = httpContext.GetPar( "Pg_Procod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
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
                        e1118Q2 ();
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
            initAll18Q1422( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1423_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1423_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes18Q1422( ) ;
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

   public void confirm_18Q0( )
   {
      beforeValidate18Q1422( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18Q1422( ) ;
         }
         else
         {
            checkExtendedTable18Q1422( ) ;
            if ( AnyError == 0 )
            {
               zm18Q1422( 9) ;
               zm18Q1422( 10) ;
               zm18Q1422( 11) ;
            }
            closeExtendedTableCursors18Q1422( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1422 = Gx_mode ;
         confirm_18Q1423( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1422 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1422 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues18Q0( ) ;
      }
   }

   public void confirm_18Q1423( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow18Q1423( ) ;
         if ( ( nRcdExists_1423 != 0 ) || ( nIsMod_1423 != 0 ) )
         {
            getKey18Q1423( ) ;
            if ( ( nRcdExists_1423 == 0 ) && ( nRcdDeleted_1423 == 0 ) )
            {
               if ( RcdFound1423 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18Q1423( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18Q1423( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors18Q1423( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PG_COLNOM_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPg_ColNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1423 != 0 )
               {
                  if ( nRcdDeleted_1423 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18Q1423( ) ;
                     load18Q1423( ) ;
                     beforeValidate18Q1423( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18Q1423( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1423 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18Q1423( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18Q1423( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors18Q1423( ) ;
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
                  if ( nRcdDeleted_1423 == 0 )
                  {
                     GXCCtl = "PG_COLNOM_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPg_ColNom_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1423_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_ColNom_Internalname, GXutil.rtrim( A10579Pg_ColNom)) ;
         httpContext.changePostValue( edtPg_ColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A10580Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_Tc_Internalname, GXutil.ltrim( localUtil.ntoc( A10581Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_Pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10582Pg_Pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_Pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10583Pg_Pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10579Pg_ColNom_"+sGXsfl_55_idx, GXutil.rtrim( Z10579Pg_ColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z10580Pg_ColNum_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10580Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10581Pg_Tc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10581Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10582Pg_Pk_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10582Pg_Pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10583Pg_Pm_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10583Pg_Pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1423_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1423_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1423_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1423 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1423_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1423_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_COLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_COLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_TC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Tc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_PK_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_PM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18Q0( )
   {
   }

   public void e1118Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Artigo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Processo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tppgcol_impl.this.A396EmprCod = GXv_char2[0] ;
      tppgcol_impl.this.AV11EmprNom = GXv_char3[0] ;
      tppgcol_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm18Q1422( int GX_JID )
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
         Z10577Pg_Procod = A10577Pg_Procod ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV37Pgmname = "TpPGCOL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T018Q6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018Q6_A407EmprNom[0] ;
      n407EmprNom = T018Q6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T018Q7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T018Q7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T018Q8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
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

   public void load18Q1422( )
   {
      /* Using cursor T018Q9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1422 = (short)(1) ;
         A407EmprNom = T018Q9_A407EmprNom[0] ;
         n407EmprNom = T018Q9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T018Q9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm18Q1422( -8) ;
      }
      pr_default.close(7);
      onLoadActions18Q1422( ) ;
   }

   public void onLoadActions18Q1422( )
   {
      GXt_char1 = A10578Pg_ProDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A10577Pg_Procod ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tppgcol_impl.this.A396EmprCod = GXv_char4[0] ;
      tppgcol_impl.this.A10577Pg_Procod = GXv_char3[0] ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
      A10578Pg_ProDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", A10578Pg_ProDsc);
   }

   public void checkExtendedTable18Q1422( )
   {
      nIsDirty_1422 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_1422 = (short)(1) ;
      GXt_char1 = A10578Pg_ProDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A10577Pg_Procod ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tppgcol_impl.this.A396EmprCod = GXv_char4[0] ;
      tppgcol_impl.this.A10577Pg_Procod = GXv_char3[0] ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
      A10578Pg_ProDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", A10578Pg_ProDsc);
      if ( ( GXutil.strcmp(A10578Pg_ProDsc, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe PROCESSO de PRODUCCION¡¡¡", ""), 1, "PG_PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPg_Procod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors18Q1422( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey18Q1422( )
   {
      /* Using cursor T018Q10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1422 = (short)(1) ;
      }
      else
      {
         RcdFound1422 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018Q5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T018Q5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018Q5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018Q5_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zm18Q1422( 8) ;
         RcdFound1422 = (short)(1) ;
         A10577Pg_Procod = T018Q5_A10577Pg_Procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10577Pg_Procod = A10577Pg_Procod ;
         sMode1422 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18Q1422( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1422 = (short)(0) ;
            initializeNonKey18Q1422( ) ;
         }
         Gx_mode = sMode1422 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1422 = (short)(0) ;
         initializeNonKey18Q1422( ) ;
         sMode1422 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1422 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey18Q1422( ) ;
      if ( RcdFound1422 == 0 )
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
      RcdFound1422 = (short)(0) ;
      /* Using cursor T018Q11 */
      pr_default.execute(9, new Object[] {A10577Pg_Procod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T018Q11_A10577Pg_Procod[0], A10577Pg_Procod) < 0 ) ) && ( GXutil.strcmp(T018Q11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018Q11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018Q11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T018Q11_A10577Pg_Procod[0], A10577Pg_Procod) > 0 ) ) && ( GXutil.strcmp(T018Q11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018Q11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018Q11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            A10577Pg_Procod = T018Q11_A10577Pg_Procod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
            RcdFound1422 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1422 = (short)(0) ;
      /* Using cursor T018Q12 */
      pr_default.execute(10, new Object[] {A10577Pg_Procod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T018Q12_A10577Pg_Procod[0], A10577Pg_Procod) > 0 ) ) && ( GXutil.strcmp(T018Q12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018Q12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018Q12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T018Q12_A10577Pg_Procod[0], A10577Pg_Procod) < 0 ) ) && ( GXutil.strcmp(T018Q12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018Q12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018Q12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            A10577Pg_Procod = T018Q12_A10577Pg_Procod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
            RcdFound1422 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18Q1422( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPg_Procod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18Q1422( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1422 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10577Pg_Procod, Z10577Pg_Procod) != 0 ) )
            {
               A10577Pg_Procod = Z10577Pg_Procod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPg_Procod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update18Q1422( ) ;
               GX_FocusControl = edtPg_Procod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10577Pg_Procod, Z10577Pg_Procod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPg_Procod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18Q1422( ) ;
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
                  GX_FocusControl = edtPg_Procod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18Q1422( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10577Pg_Procod, Z10577Pg_Procod) != 0 ) )
      {
         A10577Pg_Procod = Z10577Pg_Procod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPg_Procod_Internalname ;
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
      getKey18Q1422( ) ;
      if ( RcdFound1422 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10577Pg_Procod, Z10577Pg_Procod) != 0 ) )
         {
            A10577Pg_Procod = Z10577Pg_Procod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A10577Pg_Procod, Z10577Pg_Procod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tppgcol");
   }

   public void insert_check( )
   {
      confirm_18Q0( ) ;
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
      if ( RcdFound1422 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18Q1422( ) ;
      if ( RcdFound1422 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18Q1422( ) ;
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
      if ( RcdFound1422 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound1422 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18Q1422( ) ;
      if ( RcdFound1422 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1422 != 0 )
         {
            scanNext18Q1422( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18Q1422( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18Q1422( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018Q4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPGCOLO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPGCOLO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18Q1422( )
   {
      beforeValidate18Q1422( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18Q1422( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18Q1422( 0) ;
         checkOptimisticConcurrency18Q1422( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18Q1422( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18Q1422( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018Q13 */
                  pr_default.execute(11, new Object[] {A10577Pg_Procod, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPGCOLO");
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
                        processLevel18Q1422( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18Q0( ) ;
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
            load18Q1422( ) ;
         }
         endLevel18Q1422( ) ;
      }
      closeExtendedTableCursors18Q1422( ) ;
   }

   public void update18Q1422( )
   {
      beforeValidate18Q1422( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18Q1422( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18Q1422( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18Q1422( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18Q1422( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPPGCOLO */
                  deferredUpdate18Q1422( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18Q1422( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18Q0( ) ;
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
         endLevel18Q1422( ) ;
      }
      closeExtendedTableCursors18Q1422( ) ;
   }

   public void deferredUpdate18Q1422( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18Q1422( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18Q1422( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18Q1422( ) ;
         afterConfirm18Q1422( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18Q1422( ) ;
            if ( AnyError == 0 )
            {
               scanStart18Q1423( ) ;
               while ( RcdFound1423 != 0 )
               {
                  getByPrimaryKey18Q1423( ) ;
                  delete18Q1423( ) ;
                  scanNext18Q1423( ) ;
               }
               scanEnd18Q1423( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018Q14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPGCOLO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1422 == 0 )
                        {
                           initAll18Q1422( ) ;
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
                        resetCaption18Q0( ) ;
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
      sMode1422 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18Q1422( ) ;
      Gx_mode = sMode1422 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18Q1422( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A10578Pg_ProDsc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A10577Pg_Procod ;
         GXv_char2[0] = GXt_char1 ;
         new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tppgcol_impl.this.A396EmprCod = GXv_char4[0] ;
         tppgcol_impl.this.A10577Pg_Procod = GXv_char3[0] ;
         tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
         A10578Pg_ProDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", A10578Pg_ProDsc);
      }
   }

   public void processNestedLevel18Q1423( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow18Q1423( ) ;
         if ( ( nRcdExists_1423 != 0 ) || ( nIsMod_1423 != 0 ) )
         {
            standaloneNotModal18Q1423( ) ;
            getKey18Q1423( ) ;
            if ( ( nRcdExists_1423 == 0 ) && ( nRcdDeleted_1423 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18Q1423( ) ;
            }
            else
            {
               if ( RcdFound1423 != 0 )
               {
                  if ( ( nRcdDeleted_1423 != 0 ) && ( nRcdExists_1423 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18Q1423( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1423 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18Q1423( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1423 == 0 )
                  {
                     GXCCtl = "PG_COLNOM_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPg_ColNom_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1423_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_ColNom_Internalname, GXutil.rtrim( A10579Pg_ColNom)) ;
         httpContext.changePostValue( edtPg_ColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A10580Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_Tc_Internalname, GXutil.ltrim( localUtil.ntoc( A10581Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_Pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10582Pg_Pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPg_Pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10583Pg_Pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10579Pg_ColNom_"+sGXsfl_55_idx, GXutil.rtrim( Z10579Pg_ColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z10580Pg_ColNum_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10580Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10581Pg_Tc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10581Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10582Pg_Pk_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10582Pg_Pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10583Pg_Pm_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10583Pg_Pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1423_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1423_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1423_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1423 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1423_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1423_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_COLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_COLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_TC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Tc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_PK_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PG_PM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18Q1423( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1423 = (short)(0) ;
      nIsMod_1423 = (short)(0) ;
      nRcdDeleted_1423 = (short)(0) ;
   }

   public void processLevel18Q1422( )
   {
      /* Save parent mode. */
      sMode1422 = Gx_mode ;
      processNestedLevel18Q1423( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1422 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel18Q1422( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18Q1422( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tppgcol");
         if ( AnyError == 0 )
         {
            confirmValues18Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tppgcol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18Q1422( )
   {
      /* Scan By routine */
      /* Using cursor T018Q15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      RcdFound1422 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1422 = (short)(1) ;
         A10577Pg_Procod = T018Q15_A10577Pg_Procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18Q1422( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1422 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1422 = (short)(1) ;
         A10577Pg_Procod = T018Q15_A10577Pg_Procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
      }
   }

   public void scanEnd18Q1422( )
   {
      pr_default.close(13);
   }

   public void afterConfirm18Q1422( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18Q1422( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18Q1422( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18Q1422( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18Q1422( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18Q1422( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18Q1422( )
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
      edtPg_Procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_Procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Procod_Enabled), 5, 0), true);
      edtPg_ProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_ProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ProDsc_Enabled), 5, 0), true);
   }

   public void zm18Q1423( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10582Pg_Pk = T018Q3_A10582Pg_Pk[0] ;
            Z10583Pg_Pm = T018Q3_A10583Pg_Pm[0] ;
         }
         else
         {
            Z10582Pg_Pk = A10582Pg_Pk ;
            Z10583Pg_Pm = A10583Pg_Pm ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10577Pg_Procod = A10577Pg_Procod ;
         Z10579Pg_ColNom = A10579Pg_ColNom ;
         Z10580Pg_ColNum = A10580Pg_ColNum ;
         Z10581Pg_Tc = A10581Pg_Tc ;
         Z10582Pg_Pk = A10582Pg_Pk ;
         Z10583Pg_Pm = A10583Pg_Pm ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal18Q1423( )
   {
   }

   public void standaloneModal18Q1423( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A10579Pg_ColNom)==0) && ( Gx_BScreen == 0 ) )
      {
         A10579Pg_ColNom = AV33Pg_ColNom ;
      }
      if ( isIns( )  && (0==A10580Pg_ColNum) && ( Gx_BScreen == 0 ) )
      {
         A10580Pg_ColNum = AV34Pg_ColNum ;
      }
      if ( isIns( )  && (0==A10581Pg_Tc) && ( Gx_BScreen == 0 ) )
      {
         A10581Pg_Tc = AV35Pg_Tc ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPg_ColNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtPg_ColNom_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPg_ColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtPg_ColNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPg_Tc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPg_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Tc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtPg_Tc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPg_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Tc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load18Q1423( )
   {
      /* Using cursor T018Q16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1423 = (short)(1) ;
         A10582Pg_Pk = T018Q16_A10582Pg_Pk[0] ;
         n10582Pg_Pk = T018Q16_n10582Pg_Pk[0] ;
         A10583Pg_Pm = T018Q16_A10583Pg_Pm[0] ;
         n10583Pg_Pm = T018Q16_n10583Pg_Pm[0] ;
         zm18Q1423( -12) ;
      }
      pr_default.close(14);
      onLoadActions18Q1423( ) ;
   }

   public void onLoadActions18Q1423( )
   {
   }

   public void checkExtendedTable18Q1423( )
   {
      nIsDirty_1423 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal18Q1423( ) ;
   }

   public void closeExtendedTableCursors18Q1423( )
   {
   }

   public void enableDisable18Q1423( )
   {
   }

   public void getKey18Q1423( )
   {
      /* Using cursor T018Q17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1423 = (short)(1) ;
      }
      else
      {
         RcdFound1423 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey18Q1423( )
   {
      /* Using cursor T018Q3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc)});
      if ( (pr_default.getStatus(1) != 101) && ( T018Q3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018Q3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T018Q3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18Q1423( 12) ;
         RcdFound1423 = (short)(1) ;
         initializeNonKey18Q1423( ) ;
         A10579Pg_ColNom = T018Q3_A10579Pg_ColNom[0] ;
         A10580Pg_ColNum = T018Q3_A10580Pg_ColNum[0] ;
         A10581Pg_Tc = T018Q3_A10581Pg_Tc[0] ;
         A10582Pg_Pk = T018Q3_A10582Pg_Pk[0] ;
         n10582Pg_Pk = T018Q3_n10582Pg_Pk[0] ;
         A10583Pg_Pm = T018Q3_A10583Pg_Pm[0] ;
         n10583Pg_Pm = T018Q3_n10583Pg_Pm[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10577Pg_Procod = A10577Pg_Procod ;
         Z10579Pg_ColNom = A10579Pg_ColNom ;
         Z10580Pg_ColNum = A10580Pg_ColNum ;
         Z10581Pg_Tc = A10581Pg_Tc ;
         sMode1423 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18Q1423( ) ;
         load18Q1423( ) ;
         Gx_mode = sMode1423 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1423 = (short)(0) ;
         initializeNonKey18Q1423( ) ;
         sMode1423 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18Q1423( ) ;
         Gx_mode = sMode1423 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18Q1423( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18Q1423( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018Q2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPGCOL1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10582Pg_Pk, T018Q2_A10582Pg_Pk[0]) != 0 ) || ( DecimalUtil.compareTo(Z10583Pg_Pm, T018Q2_A10583Pg_Pm[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10582Pg_Pk, T018Q2_A10582Pg_Pk[0]) != 0 )
            {
               GXutil.writeLogln("tppgcol:[seudo value changed for attri]"+"Pg_Pk");
               GXutil.writeLogRaw("Old: ",Z10582Pg_Pk);
               GXutil.writeLogRaw("Current: ",T018Q2_A10582Pg_Pk[0]);
            }
            if ( DecimalUtil.compareTo(Z10583Pg_Pm, T018Q2_A10583Pg_Pm[0]) != 0 )
            {
               GXutil.writeLogln("tppgcol:[seudo value changed for attri]"+"Pg_Pm");
               GXutil.writeLogRaw("Old: ",Z10583Pg_Pm);
               GXutil.writeLogRaw("Current: ",T018Q2_A10583Pg_Pm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPGCOL1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18Q1423( )
   {
      beforeValidate18Q1423( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18Q1423( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18Q1423( 0) ;
         checkOptimisticConcurrency18Q1423( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18Q1423( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18Q1423( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018Q18 */
                  pr_default.execute(16, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc), Boolean.valueOf(n10582Pg_Pk), A10582Pg_Pk, Boolean.valueOf(n10583Pg_Pm), A10583Pg_Pm, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPGCOL1");
                  if ( (pr_default.getStatus(16) == 1) )
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
            load18Q1423( ) ;
         }
         endLevel18Q1423( ) ;
      }
      closeExtendedTableCursors18Q1423( ) ;
   }

   public void update18Q1423( )
   {
      beforeValidate18Q1423( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18Q1423( ) ;
      }
      if ( ( nIsMod_1423 != 0 ) || ( nIsDirty_1423 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18Q1423( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18Q1423( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18Q1423( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018Q19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n10582Pg_Pk), A10582Pg_Pk, Boolean.valueOf(n10583Pg_Pm), A10583Pg_Pm, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPGCOL1");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPGCOL1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18Q1423( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18Q1423( ) ;
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
            endLevel18Q1423( ) ;
         }
      }
      closeExtendedTableCursors18Q1423( ) ;
   }

   public void deferredUpdate18Q1423( )
   {
   }

   public void delete18Q1423( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18Q1423( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18Q1423( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18Q1423( ) ;
         afterConfirm18Q1423( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18Q1423( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018Q20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod, A10579Pg_ColNom, Integer.valueOf(A10580Pg_ColNum), Short.valueOf(A10581Pg_Tc)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPGCOL1");
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
      sMode1423 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18Q1423( ) ;
      Gx_mode = sMode1423 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18Q1423( )
   {
      standaloneModal18Q1423( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel18Q1423( )
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

   public void scanStart18Q1423( )
   {
      /* Scan By routine */
      /* Using cursor T018Q21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10577Pg_Procod});
      RcdFound1423 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1423 = (short)(1) ;
         A10579Pg_ColNom = T018Q21_A10579Pg_ColNom[0] ;
         A10580Pg_ColNum = T018Q21_A10580Pg_ColNum[0] ;
         A10581Pg_Tc = T018Q21_A10581Pg_Tc[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18Q1423( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1423 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1423 = (short)(1) ;
         A10579Pg_ColNom = T018Q21_A10579Pg_ColNom[0] ;
         A10580Pg_ColNum = T018Q21_A10580Pg_ColNum[0] ;
         A10581Pg_Tc = T018Q21_A10581Pg_Tc[0] ;
      }
   }

   public void scanEnd18Q1423( )
   {
      pr_default.close(19);
   }

   public void afterConfirm18Q1423( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A10579Pg_ColNom ;
         GXv_int6[0] = A10580Pg_ColNum ;
         GXv_int7[0] = (byte)(A10581Pg_Tc) ;
         GXv_int8[0] = AV32OkColor ;
         new app.pexicol(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_int7, GXv_int8) ;
         tppgcol_impl.this.A396EmprCod = GXv_char4[0] ;
         tppgcol_impl.this.A252CliCod = GXv_int5[0] ;
         tppgcol_impl.this.A65ArtCod = GXv_char3[0] ;
         tppgcol_impl.this.A10579Pg_ColNom = GXv_char2[0] ;
         tppgcol_impl.this.A10580Pg_ColNum = GXv_int6[0] ;
         tppgcol_impl.this.A10581Pg_Tc = GXv_int7[0] ;
         tppgcol_impl.this.AV32OkColor = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32OkColor", GXutil.str( AV32OkColor, 1, 0));
      }
      if ( ( AV32OkColor == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe Cor ¡¡¡", ""), 0, "");
      }
   }

   public void beforeInsert18Q1423( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18Q1423( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18Q1423( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18Q1423( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18Q1423( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18Q1423( )
   {
      edtPg_ColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPg_ColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPg_Tc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Tc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPg_Pk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_Pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Pk_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPg_Pm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_Pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Pm_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes18Q1423( )
   {
   }

   public void send_integrity_lvl_hashes18Q1422( )
   {
   }

   public void subsflControlProps_551423( )
   {
      edtavnRcdDeleted_1423_Internalname = "vNRCDDELETED_1423_"+sGXsfl_55_idx ;
      edtPg_ColNom_Internalname = "PG_COLNOM_"+sGXsfl_55_idx ;
      edtPg_ColNum_Internalname = "PG_COLNUM_"+sGXsfl_55_idx ;
      edtPg_Tc_Internalname = "PG_TC_"+sGXsfl_55_idx ;
      edtPg_Pk_Internalname = "PG_PK_"+sGXsfl_55_idx ;
      edtPg_Pm_Internalname = "PG_PM_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551423( )
   {
      edtavnRcdDeleted_1423_Internalname = "vNRCDDELETED_1423_"+sGXsfl_55_fel_idx ;
      edtPg_ColNom_Internalname = "PG_COLNOM_"+sGXsfl_55_fel_idx ;
      edtPg_ColNum_Internalname = "PG_COLNUM_"+sGXsfl_55_fel_idx ;
      edtPg_Tc_Internalname = "PG_TC_"+sGXsfl_55_fel_idx ;
      edtPg_Pk_Internalname = "PG_PK_"+sGXsfl_55_fel_idx ;
      edtPg_Pm_Internalname = "PG_PM_"+sGXsfl_55_fel_idx ;
   }

   public void addRow18Q1423( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551423( ) ;
      sendRow18Q1423( ) ;
   }

   public void sendRow18Q1423( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1423_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1423_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1423_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1423), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1423), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1423_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1423_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1423_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPg_ColNom_Internalname,GXutil.rtrim( A10579Pg_ColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPg_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPg_ColNom_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1423_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPg_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A10580Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10580Pg_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPg_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPg_ColNum_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1423_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPg_Tc_Internalname,GXutil.ltrim( localUtil.ntoc( A10581Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10581Pg_Tc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPg_Tc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPg_Tc_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1423_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPg_Pk_Internalname,GXutil.ltrim( localUtil.ntoc( A10582Pg_Pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPg_Pk_Enabled!=0) ? localUtil.format( A10582Pg_Pk, "ZZZZZ9.99999") : localUtil.format( A10582Pg_Pk, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPg_Pk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPg_Pk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1423_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPg_Pm_Internalname,GXutil.ltrim( localUtil.ntoc( A10583Pg_Pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPg_Pm_Enabled!=0) ? localUtil.format( A10583Pg_Pm, "ZZZZZ9.99999") : localUtil.format( A10583Pg_Pm, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPg_Pm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPg_Pm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18Q1423( ) ;
      GXCCtl = "Z10579Pg_ColNom_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10579Pg_ColNom));
      GXCCtl = "Z10580Pg_ColNum_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10580Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10581Pg_Tc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10581Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10582Pg_Pk_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10582Pg_Pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10583Pg_Pm_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10583Pg_Pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1423_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1423_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1423_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1423, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPG_COLNOM_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33Pg_ColNom));
      GXCCtl = "vPG_COLNUM_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPG_TC_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV35Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1423_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1423_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PG_COLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PG_COLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PG_TC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Tc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PG_PK_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pk_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PG_PM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pm_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18Q1423( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551423( ) ;
      edtavnRcdDeleted_1423_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1423_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPg_ColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_COLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPg_ColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_COLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPg_Tc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_TC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPg_Pk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_PK_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPg_Pm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PG_PM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1423_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1423_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1423");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1423_Internalname ;
         wbErr = true ;
         nRcdDeleted_1423 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1423 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1423_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10579Pg_ColNom = httpContext.cgiGet( edtPg_ColNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPg_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPg_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PG_COLNUM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPg_ColNum_Internalname ;
         wbErr = true ;
         A10580Pg_ColNum = 0 ;
      }
      else
      {
         A10580Pg_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPg_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPg_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPg_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PG_TC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPg_Tc_Internalname ;
         wbErr = true ;
         A10581Pg_Tc = (short)(0) ;
      }
      else
      {
         A10581Pg_Tc = (short)(localUtil.ctol( httpContext.cgiGet( edtPg_Tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPg_Pk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPg_Pk_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PG_PK_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPg_Pk_Internalname ;
         wbErr = true ;
         A10582Pg_Pk = DecimalUtil.ZERO ;
         n10582Pg_Pk = false ;
      }
      else
      {
         A10582Pg_Pk = localUtil.ctond( httpContext.cgiGet( edtPg_Pk_Internalname)) ;
         n10582Pg_Pk = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPg_Pm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPg_Pm_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PG_PM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPg_Pm_Internalname ;
         wbErr = true ;
         A10583Pg_Pm = DecimalUtil.ZERO ;
         n10583Pg_Pm = false ;
      }
      else
      {
         A10583Pg_Pm = localUtil.ctond( httpContext.cgiGet( edtPg_Pm_Internalname)) ;
         n10583Pg_Pm = false ;
      }
      GXCCtl = "Z10579Pg_ColNom_" + sGXsfl_55_idx ;
      Z10579Pg_ColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10580Pg_ColNum_" + sGXsfl_55_idx ;
      Z10580Pg_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10581Pg_Tc_" + sGXsfl_55_idx ;
      Z10581Pg_Tc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10582Pg_Pk_" + sGXsfl_55_idx ;
      Z10582Pg_Pk = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10583Pg_Pm_" + sGXsfl_55_idx ;
      Z10583Pg_Pm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1423_" + sGXsfl_55_idx ;
      nRcdDeleted_1423 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1423_" + sGXsfl_55_idx ;
      nRcdExists_1423 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1423_" + sGXsfl_55_idx ;
      nIsMod_1423 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPg_Tc_Enabled = edtPg_Tc_Enabled ;
      defedtPg_ColNum_Enabled = edtPg_ColNum_Enabled ;
      defedtPg_ColNom_Enabled = edtPg_ColNom_Enabled ;
   }

   public void confirmValues18Q0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551423( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551423( ) ;
         httpContext.changePostValue( "Z10579Pg_ColNom_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10579Pg_ColNom_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10579Pg_ColNom_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10580Pg_ColNum_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10580Pg_ColNum_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10580Pg_ColNum_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10581Pg_Tc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10581Pg_Tc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10581Pg_Tc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10582Pg_Pk_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10582Pg_Pk_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10582Pg_Pk_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10583Pg_Pm_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10583Pg_Pm_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10583Pg_Pm_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tppgcol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV33Pg_ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV34Pg_ColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Pg_Tc,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","Pg_ColNom","Pg_ColNum","Pg_Tc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10577Pg_Procod", GXutil.rtrim( Z10577Pg_Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPG_COLNOM", GXutil.rtrim( AV33Pg_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPG_COLNUM", GXutil.ltrim( localUtil.ntoc( AV34Pg_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPG_TC", GXutil.ltrim( localUtil.ntoc( AV35Pg_Tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKCOLOR", GXutil.ltrim( localUtil.ntoc( AV32OkColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tppgcol", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV33Pg_ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV34Pg_ColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Pg_Tc,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","Pg_ColNom","Pg_ColNum","Pg_Tc"})  ;
   }

   public String getPgmname( )
   {
      return "TpPGCOL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO GLOBAL COLOR PARM", "") ;
   }

   public void initializeNonKey18Q1422( )
   {
      A10578Pg_ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", A10578Pg_ProDsc);
   }

   public void initAll18Q1422( )
   {
      A10577Pg_Procod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
      initializeNonKey18Q1422( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18Q1423( )
   {
      AV32OkColor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OkColor", GXutil.str( AV32OkColor, 1, 0));
      A10582Pg_Pk = DecimalUtil.ZERO ;
      n10582Pg_Pk = false ;
      A10583Pg_Pm = DecimalUtil.ZERO ;
      n10583Pg_Pm = false ;
      Z10582Pg_Pk = DecimalUtil.ZERO ;
      Z10583Pg_Pm = DecimalUtil.ZERO ;
   }

   public void initAll18Q1423( )
   {
      A10579Pg_ColNom = AV33Pg_ColNom ;
      A10580Pg_ColNum = AV34Pg_ColNum ;
      A10581Pg_Tc = AV35Pg_Tc ;
      initializeNonKey18Q1423( ) ;
   }

   public void standaloneModalInsert18Q1423( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555515", true, true);
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
      httpContext.AddJavascriptSource("tppgcol.js", "?20268241555515", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1423( )
   {
      edtPg_Tc_Enabled = defedtPg_Tc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_Tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_Tc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPg_ColNum_Enabled = defedtPg_ColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPg_ColNom_Enabled = defedtPg_ColNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPg_ColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPg_ColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1423, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1423_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10579Pg_ColNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10580Pg_ColNum, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_ColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10581Pg_Tc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Tc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10582Pg_Pk, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pk_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10583Pg_Pm, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPg_Pm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPg_Procod_Internalname = "PG_PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPg_ProDsc_Internalname = "PG_PRODSC" ;
      edtavnRcdDeleted_1423_Internalname = "vNRCDDELETED_1423" ;
      edtPg_ColNom_Internalname = "PG_COLNOM" ;
      edtPg_ColNum_Internalname = "PG_COLNUM" ;
      edtPg_Tc_Internalname = "PG_TC" ;
      edtPg_Pk_Internalname = "PG_PK" ;
      edtPg_Pm_Internalname = "PG_PM" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO GLOBAL COLOR PARM", "") );
      edtPg_Pm_Jsonclick = "" ;
      edtPg_Pk_Jsonclick = "" ;
      edtPg_Tc_Jsonclick = "" ;
      edtPg_ColNum_Jsonclick = "" ;
      edtPg_ColNom_Jsonclick = "" ;
      edtavnRcdDeleted_1423_Jsonclick = "" ;
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
      edtPg_Pm_Enabled = 1 ;
      edtPg_Pk_Enabled = 1 ;
      edtPg_Tc_Enabled = 1 ;
      edtPg_ColNum_Enabled = 1 ;
      edtPg_ColNom_Enabled = 1 ;
      edtavnRcdDeleted_1423_Enabled = 1 ;
      edtPg_ProDsc_Jsonclick = "" ;
      edtPg_ProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPg_ProDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPg_Procod_Jsonclick = "" ;
      edtPg_Procod_Backcolor = (int)(0xFFFFFF) ;
      edtPg_Procod_Enabled = 1 ;
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

   public void gx1asapg_prodsc18Q1422( String A396EmprCod ,
                                       String A10577Pg_Procod )
   {
      GXt_char1 = A10578Pg_ProDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A10577Pg_Procod ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tppgcol_impl.this.A396EmprCod = GXv_char4[0] ;
      tppgcol_impl.this.A10577Pg_Procod = GXv_char3[0] ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A10577Pg_Procod", A10577Pg_Procod);
      A10578Pg_ProDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", A10578Pg_ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10578Pg_ProDsc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_6_18Q1423( String A396EmprCod ,
                             int A252CliCod ,
                             String A65ArtCod ,
                             String A10579Pg_ColNom ,
                             int A10580Pg_ColNum ,
                             short A10581Pg_Tc ,
                             byte AV32OkColor )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A10579Pg_ColNom ;
         GXv_int5[0] = A10580Pg_ColNum ;
         GXv_int8[0] = (byte)(A10581Pg_Tc) ;
         GXv_int7[0] = AV32OkColor ;
         new app.pexicol(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int8, GXv_int7) ;
         A396EmprCod = GXv_char4[0] ;
         A252CliCod = GXv_int6[0] ;
         A65ArtCod = GXv_char3[0] ;
         A10579Pg_ColNom = GXv_char2[0] ;
         A10580Pg_ColNum = GXv_int5[0] ;
         A10581Pg_Tc = GXv_int8[0] ;
         AV32OkColor = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32OkColor", GXutil.str( AV32OkColor, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10579Pg_ColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10580Pg_ColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10581Pg_Tc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32OkColor, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_551423( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18Q1423( ) ;
         standaloneModal18Q1423( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18Q1423( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551423( ) ;
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
      /* Using cursor T018Q22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018Q22_A407EmprNom[0] ;
      n407EmprNom = T018Q22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T018Q23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T018Q23_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(21);
      /* Using cursor T018Q24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(22);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Pg_procod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_char1 = A10578Pg_ProDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A10577Pg_Procod ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tppgcol_impl.this.A396EmprCod = GXv_char4[0] ;
      tppgcol_impl.this.A10577Pg_Procod = GXv_char3[0] ;
      tppgcol_impl.this.GXt_char1 = GXv_char2[0] ;
      A10578Pg_ProDsc = GXt_char1 ;
      if ( ( GXutil.strcmp(A10578Pg_ProDsc, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe PROCESSO de PRODUCCION¡¡¡", ""), 1, "PG_PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPg_Procod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10578Pg_ProDsc", GXutil.rtrim( A10578Pg_ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10577Pg_Procod", GXutil.rtrim( Z10577Pg_Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10578Pg_ProDsc", GXutil.rtrim( Z10578Pg_ProDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV33Pg_ColNom',fld:'vPG_COLNOM',pic:''},{av:'AV34Pg_ColNum',fld:'vPG_COLNUM',pic:'ZZZZZ9'},{av:'AV35Pg_Tc',fld:'vPG_TC',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_PG_PROCOD","{handler:'valid_Pg_procod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV35Pg_Tc',fld:'vPG_TC',pic:'ZZZ9'},{av:'AV34Pg_ColNum',fld:'vPG_COLNUM',pic:'ZZZZZ9'},{av:'AV33Pg_ColNom',fld:'vPG_COLNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A10577Pg_Procod',fld:'PG_PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PG_PROCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10578Pg_ProDsc',fld:'PG_PRODSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z10577Pg_Procod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z10578Pg_ProDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PG_COLNOM","{handler:'valid_Pg_colnom',iparms:[]");
      setEventMetadata("VALID_PG_COLNOM",",oparms:[]}");
      setEventMetadata("VALID_PG_COLNUM","{handler:'valid_Pg_colnum',iparms:[]");
      setEventMetadata("VALID_PG_COLNUM",",oparms:[]}");
      setEventMetadata("VALID_PG_TC","{handler:'valid_Pg_tc',iparms:[]");
      setEventMetadata("VALID_PG_TC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pg_pm',iparms:[]");
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
      pr_default.close(22);
      pr_default.close(21);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOAV33Pg_ColNom = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z10577Pg_Procod = "" ;
      Z10579Pg_ColNom = "" ;
      Z10582Pg_Pk = DecimalUtil.ZERO ;
      Z10583Pg_Pm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A10579Pg_ColNom = "" ;
      A10577Pg_Procod = "" ;
      AV33Pg_ColNom = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10578Pg_ProDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1423 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1422 = "" ;
      GXCCtl = "" ;
      A10582Pg_Pk = DecimalUtil.ZERO ;
      A10583Pg_Pm = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T018Q6_A407EmprNom = new String[] {""} ;
      T018Q6_n407EmprNom = new boolean[] {false} ;
      T018Q7_A279CliNom = new String[] {""} ;
      T018Q8_A396EmprCod = new String[] {""} ;
      T018Q9_A10577Pg_Procod = new String[] {""} ;
      T018Q9_A407EmprNom = new String[] {""} ;
      T018Q9_n407EmprNom = new boolean[] {false} ;
      T018Q9_A279CliNom = new String[] {""} ;
      T018Q9_A396EmprCod = new String[] {""} ;
      T018Q9_A252CliCod = new int[1] ;
      T018Q9_A65ArtCod = new String[] {""} ;
      T018Q10_A396EmprCod = new String[] {""} ;
      T018Q10_A252CliCod = new int[1] ;
      T018Q10_A65ArtCod = new String[] {""} ;
      T018Q10_A10577Pg_Procod = new String[] {""} ;
      T018Q5_A10577Pg_Procod = new String[] {""} ;
      T018Q5_A396EmprCod = new String[] {""} ;
      T018Q5_A252CliCod = new int[1] ;
      T018Q5_A65ArtCod = new String[] {""} ;
      T018Q11_A396EmprCod = new String[] {""} ;
      T018Q11_A252CliCod = new int[1] ;
      T018Q11_A65ArtCod = new String[] {""} ;
      T018Q11_A10577Pg_Procod = new String[] {""} ;
      T018Q12_A396EmprCod = new String[] {""} ;
      T018Q12_A252CliCod = new int[1] ;
      T018Q12_A65ArtCod = new String[] {""} ;
      T018Q12_A10577Pg_Procod = new String[] {""} ;
      T018Q4_A10577Pg_Procod = new String[] {""} ;
      T018Q4_A396EmprCod = new String[] {""} ;
      T018Q4_A252CliCod = new int[1] ;
      T018Q4_A65ArtCod = new String[] {""} ;
      T018Q15_A396EmprCod = new String[] {""} ;
      T018Q15_A252CliCod = new int[1] ;
      T018Q15_A65ArtCod = new String[] {""} ;
      T018Q15_A10577Pg_Procod = new String[] {""} ;
      T018Q16_A252CliCod = new int[1] ;
      T018Q16_A65ArtCod = new String[] {""} ;
      T018Q16_A10577Pg_Procod = new String[] {""} ;
      T018Q16_A10579Pg_ColNom = new String[] {""} ;
      T018Q16_A10580Pg_ColNum = new int[1] ;
      T018Q16_A10581Pg_Tc = new short[1] ;
      T018Q16_A10582Pg_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Q16_n10582Pg_Pk = new boolean[] {false} ;
      T018Q16_A10583Pg_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Q16_n10583Pg_Pm = new boolean[] {false} ;
      T018Q16_A396EmprCod = new String[] {""} ;
      T018Q17_A396EmprCod = new String[] {""} ;
      T018Q17_A252CliCod = new int[1] ;
      T018Q17_A65ArtCod = new String[] {""} ;
      T018Q17_A10577Pg_Procod = new String[] {""} ;
      T018Q17_A10579Pg_ColNom = new String[] {""} ;
      T018Q17_A10580Pg_ColNum = new int[1] ;
      T018Q17_A10581Pg_Tc = new short[1] ;
      T018Q3_A252CliCod = new int[1] ;
      T018Q3_A65ArtCod = new String[] {""} ;
      T018Q3_A10577Pg_Procod = new String[] {""} ;
      T018Q3_A10579Pg_ColNom = new String[] {""} ;
      T018Q3_A10580Pg_ColNum = new int[1] ;
      T018Q3_A10581Pg_Tc = new short[1] ;
      T018Q3_A10582Pg_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Q3_n10582Pg_Pk = new boolean[] {false} ;
      T018Q3_A10583Pg_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Q3_n10583Pg_Pm = new boolean[] {false} ;
      T018Q3_A396EmprCod = new String[] {""} ;
      T018Q2_A252CliCod = new int[1] ;
      T018Q2_A65ArtCod = new String[] {""} ;
      T018Q2_A10577Pg_Procod = new String[] {""} ;
      T018Q2_A10579Pg_ColNom = new String[] {""} ;
      T018Q2_A10580Pg_ColNum = new int[1] ;
      T018Q2_A10581Pg_Tc = new short[1] ;
      T018Q2_A10582Pg_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Q2_n10582Pg_Pk = new boolean[] {false} ;
      T018Q2_A10583Pg_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018Q2_n10583Pg_Pm = new boolean[] {false} ;
      T018Q2_A396EmprCod = new String[] {""} ;
      T018Q21_A396EmprCod = new String[] {""} ;
      T018Q21_A252CliCod = new int[1] ;
      T018Q21_A65ArtCod = new String[] {""} ;
      T018Q21_A10577Pg_Procod = new String[] {""} ;
      T018Q21_A10579Pg_ColNom = new String[] {""} ;
      T018Q21_A10580Pg_ColNum = new int[1] ;
      T018Q21_A10581Pg_Tc = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      T018Q22_A407EmprNom = new String[] {""} ;
      T018Q22_n407EmprNom = new boolean[] {false} ;
      T018Q23_A279CliNom = new String[] {""} ;
      T018Q24_A396EmprCod = new String[] {""} ;
      Z10578Pg_ProDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ10577Pg_Procod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ10578Pg_ProDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tppgcol__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tppgcol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tppgcol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tppgcol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tppgcol__default(),
         new Object[] {
             new Object[] {
            T018Q2_A252CliCod, T018Q2_A65ArtCod, T018Q2_A10577Pg_Procod, T018Q2_A10579Pg_ColNom, T018Q2_A10580Pg_ColNum, T018Q2_A10581Pg_Tc, T018Q2_A10582Pg_Pk, T018Q2_n10582Pg_Pk, T018Q2_A10583Pg_Pm, T018Q2_n10583Pg_Pm,
            T018Q2_A396EmprCod
            }
            , new Object[] {
            T018Q3_A252CliCod, T018Q3_A65ArtCod, T018Q3_A10577Pg_Procod, T018Q3_A10579Pg_ColNom, T018Q3_A10580Pg_ColNum, T018Q3_A10581Pg_Tc, T018Q3_A10582Pg_Pk, T018Q3_n10582Pg_Pk, T018Q3_A10583Pg_Pm, T018Q3_n10583Pg_Pm,
            T018Q3_A396EmprCod
            }
            , new Object[] {
            T018Q4_A10577Pg_Procod, T018Q4_A396EmprCod, T018Q4_A252CliCod, T018Q4_A65ArtCod
            }
            , new Object[] {
            T018Q5_A10577Pg_Procod, T018Q5_A396EmprCod, T018Q5_A252CliCod, T018Q5_A65ArtCod
            }
            , new Object[] {
            T018Q6_A407EmprNom, T018Q6_n407EmprNom
            }
            , new Object[] {
            T018Q7_A279CliNom
            }
            , new Object[] {
            T018Q8_A396EmprCod
            }
            , new Object[] {
            T018Q9_A10577Pg_Procod, T018Q9_A407EmprNom, T018Q9_n407EmprNom, T018Q9_A279CliNom, T018Q9_A396EmprCod, T018Q9_A252CliCod, T018Q9_A65ArtCod
            }
            , new Object[] {
            T018Q10_A396EmprCod, T018Q10_A252CliCod, T018Q10_A65ArtCod, T018Q10_A10577Pg_Procod
            }
            , new Object[] {
            T018Q11_A396EmprCod, T018Q11_A252CliCod, T018Q11_A65ArtCod, T018Q11_A10577Pg_Procod
            }
            , new Object[] {
            T018Q12_A396EmprCod, T018Q12_A252CliCod, T018Q12_A65ArtCod, T018Q12_A10577Pg_Procod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018Q15_A396EmprCod, T018Q15_A252CliCod, T018Q15_A65ArtCod, T018Q15_A10577Pg_Procod
            }
            , new Object[] {
            T018Q16_A252CliCod, T018Q16_A65ArtCod, T018Q16_A10577Pg_Procod, T018Q16_A10579Pg_ColNom, T018Q16_A10580Pg_ColNum, T018Q16_A10581Pg_Tc, T018Q16_A10582Pg_Pk, T018Q16_n10582Pg_Pk, T018Q16_A10583Pg_Pm, T018Q16_n10583Pg_Pm,
            T018Q16_A396EmprCod
            }
            , new Object[] {
            T018Q17_A396EmprCod, T018Q17_A252CliCod, T018Q17_A65ArtCod, T018Q17_A10577Pg_Procod, T018Q17_A10579Pg_ColNom, T018Q17_A10580Pg_ColNum, T018Q17_A10581Pg_Tc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018Q21_A396EmprCod, T018Q21_A252CliCod, T018Q21_A65ArtCod, T018Q21_A10577Pg_Procod, T018Q21_A10579Pg_ColNom, T018Q21_A10580Pg_ColNum, T018Q21_A10581Pg_Tc
            }
            , new Object[] {
            T018Q22_A407EmprNom, T018Q22_n407EmprNom
            }
            , new Object[] {
            T018Q23_A279CliNom
            }
            , new Object[] {
            T018Q24_A396EmprCod
            }
         }
      );
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TpPGCOL" ;
      Z10581Pg_Tc = (short)(0) ;
      A10581Pg_Tc = (short)(0) ;
      Z10580Pg_ColNum = 0 ;
      A10580Pg_ColNum = 0 ;
      Z10579Pg_ColNom = "" ;
      A10579Pg_ColNom = "" ;
   }

   private byte GxWebError ;
   private byte AV32OkColor ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int8[] ;
   private byte GXv_int7[] ;
   private short wcpOAV35Pg_Tc ;
   private short Z10581Pg_Tc ;
   private short nRcdDeleted_1423 ;
   private short nRcdExists_1423 ;
   private short nIsMod_1423 ;
   private short A10581Pg_Tc ;
   private short AV35Pg_Tc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1423 ;
   private short RcdFound1423 ;
   private short nBlankRcdUsr1423 ;
   private short RcdFound1422 ;
   private short nIsDirty_1422 ;
   private short nIsDirty_1423 ;
   private int wcpOA252CliCod ;
   private int wcpOAV34Pg_ColNum ;
   private int Z252CliCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z10580Pg_ColNum ;
   private int A252CliCod ;
   private int A10580Pg_ColNum ;
   private int AV34Pg_ColNum ;
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
   private int edtPg_Procod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPg_ProDsc_Enabled ;
   private int edtavnRcdDeleted_1423_Enabled ;
   private int edtPg_ColNom_Enabled ;
   private int edtPg_ColNum_Enabled ;
   private int edtPg_Tc_Enabled ;
   private int edtPg_Pk_Enabled ;
   private int edtPg_Pm_Enabled ;
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
   private int defedtPg_Tc_Enabled ;
   private int defedtPg_ColNum_Enabled ;
   private int defedtPg_ColNom_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPg_ProDsc_Backcolor ;
   private int edtPg_Procod_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10582Pg_Pk ;
   private java.math.BigDecimal Z10583Pg_Pm ;
   private java.math.BigDecimal A10582Pg_Pk ;
   private java.math.BigDecimal A10583Pg_Pm ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOAV33Pg_ColNom ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z10577Pg_Procod ;
   private String Z10579Pg_ColNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A10579Pg_ColNom ;
   private String A10577Pg_Procod ;
   private String AV33Pg_ColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPg_Procod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtPg_Procod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPg_ProDsc_Internalname ;
   private String A10578Pg_ProDsc ;
   private String edtPg_ProDsc_Jsonclick ;
   private String sMode1423 ;
   private String edtavnRcdDeleted_1423_Internalname ;
   private String edtPg_ColNom_Internalname ;
   private String edtPg_ColNum_Internalname ;
   private String edtPg_Tc_Internalname ;
   private String edtPg_Pk_Internalname ;
   private String edtPg_Pm_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1422 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1423_Jsonclick ;
   private String edtPg_ColNom_Jsonclick ;
   private String edtPg_ColNum_Jsonclick ;
   private String edtPg_Tc_Jsonclick ;
   private String edtPg_Pk_Jsonclick ;
   private String edtPg_Pm_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String Z10578Pg_ProDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ10577Pg_Procod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ10578Pg_ProDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10582Pg_Pk ;
   private boolean n10583Pg_Pm ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018Q6_A407EmprNom ;
   private boolean[] T018Q6_n407EmprNom ;
   private String[] T018Q7_A279CliNom ;
   private String[] T018Q8_A396EmprCod ;
   private String[] T018Q9_A10577Pg_Procod ;
   private String[] T018Q9_A407EmprNom ;
   private boolean[] T018Q9_n407EmprNom ;
   private String[] T018Q9_A279CliNom ;
   private String[] T018Q9_A396EmprCod ;
   private int[] T018Q9_A252CliCod ;
   private String[] T018Q9_A65ArtCod ;
   private String[] T018Q10_A396EmprCod ;
   private int[] T018Q10_A252CliCod ;
   private String[] T018Q10_A65ArtCod ;
   private String[] T018Q10_A10577Pg_Procod ;
   private String[] T018Q5_A10577Pg_Procod ;
   private String[] T018Q5_A396EmprCod ;
   private int[] T018Q5_A252CliCod ;
   private String[] T018Q5_A65ArtCod ;
   private String[] T018Q11_A396EmprCod ;
   private int[] T018Q11_A252CliCod ;
   private String[] T018Q11_A65ArtCod ;
   private String[] T018Q11_A10577Pg_Procod ;
   private String[] T018Q12_A396EmprCod ;
   private int[] T018Q12_A252CliCod ;
   private String[] T018Q12_A65ArtCod ;
   private String[] T018Q12_A10577Pg_Procod ;
   private String[] T018Q4_A10577Pg_Procod ;
   private String[] T018Q4_A396EmprCod ;
   private int[] T018Q4_A252CliCod ;
   private String[] T018Q4_A65ArtCod ;
   private String[] T018Q15_A396EmprCod ;
   private int[] T018Q15_A252CliCod ;
   private String[] T018Q15_A65ArtCod ;
   private String[] T018Q15_A10577Pg_Procod ;
   private int[] T018Q16_A252CliCod ;
   private String[] T018Q16_A65ArtCod ;
   private String[] T018Q16_A10577Pg_Procod ;
   private String[] T018Q16_A10579Pg_ColNom ;
   private int[] T018Q16_A10580Pg_ColNum ;
   private short[] T018Q16_A10581Pg_Tc ;
   private java.math.BigDecimal[] T018Q16_A10582Pg_Pk ;
   private boolean[] T018Q16_n10582Pg_Pk ;
   private java.math.BigDecimal[] T018Q16_A10583Pg_Pm ;
   private boolean[] T018Q16_n10583Pg_Pm ;
   private String[] T018Q16_A396EmprCod ;
   private String[] T018Q17_A396EmprCod ;
   private int[] T018Q17_A252CliCod ;
   private String[] T018Q17_A65ArtCod ;
   private String[] T018Q17_A10577Pg_Procod ;
   private String[] T018Q17_A10579Pg_ColNom ;
   private int[] T018Q17_A10580Pg_ColNum ;
   private short[] T018Q17_A10581Pg_Tc ;
   private int[] T018Q3_A252CliCod ;
   private String[] T018Q3_A65ArtCod ;
   private String[] T018Q3_A10577Pg_Procod ;
   private String[] T018Q3_A10579Pg_ColNom ;
   private int[] T018Q3_A10580Pg_ColNum ;
   private short[] T018Q3_A10581Pg_Tc ;
   private java.math.BigDecimal[] T018Q3_A10582Pg_Pk ;
   private boolean[] T018Q3_n10582Pg_Pk ;
   private java.math.BigDecimal[] T018Q3_A10583Pg_Pm ;
   private boolean[] T018Q3_n10583Pg_Pm ;
   private String[] T018Q3_A396EmprCod ;
   private int[] T018Q2_A252CliCod ;
   private String[] T018Q2_A65ArtCod ;
   private String[] T018Q2_A10577Pg_Procod ;
   private String[] T018Q2_A10579Pg_ColNom ;
   private int[] T018Q2_A10580Pg_ColNum ;
   private short[] T018Q2_A10581Pg_Tc ;
   private java.math.BigDecimal[] T018Q2_A10582Pg_Pk ;
   private boolean[] T018Q2_n10582Pg_Pk ;
   private java.math.BigDecimal[] T018Q2_A10583Pg_Pm ;
   private boolean[] T018Q2_n10583Pg_Pm ;
   private String[] T018Q2_A396EmprCod ;
   private String[] T018Q21_A396EmprCod ;
   private int[] T018Q21_A252CliCod ;
   private String[] T018Q21_A65ArtCod ;
   private String[] T018Q21_A10577Pg_Procod ;
   private String[] T018Q21_A10579Pg_ColNom ;
   private int[] T018Q21_A10580Pg_ColNum ;
   private short[] T018Q21_A10581Pg_Tc ;
   private String[] T018Q22_A407EmprNom ;
   private boolean[] T018Q22_n407EmprNom ;
   private String[] T018Q23_A279CliNom ;
   private String[] T018Q24_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tppgcol__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tppgcol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tppgcol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tppgcol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tppgcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018Q2", "SELECT CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc, Pg_Pk, Pg_Pm, EmprCod FROM TXPPGCOL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? AND Pg_ColNom = ? AND Pg_ColNum = ? AND Pg_Tc = ?  FOR UPDATE OF Pg_Pk, Pg_Pm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q3", "SELECT CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc, Pg_Pk, Pg_Pm, EmprCod FROM TXPPGCOL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? AND Pg_ColNom = ? AND Pg_ColNum = ? AND Pg_Tc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q4", "SELECT Pg_Procod, EmprCod, CliCod, ArtCod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ?  FOR UPDATE OF Pg_Procod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q5", "SELECT Pg_Procod, EmprCod, CliCod, ArtCod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q8", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q9", "SELECT /*+ FIRST_ROWS(100) */ TM1.Pg_Procod, T2.EmprNom, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM ((TXPPGCOLO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.Pg_Procod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.Pg_Procod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE ( Pg_Procod > ?) and EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Pg_Procod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018Q12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE ( Pg_Procod < ?) and EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, Pg_Procod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018Q13", "INSERT INTO TXPPGCOLO(Pg_Procod, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPGCOLO")
         ,new UpdateCursor("T018Q14", "DELETE FROM TXPPGCOLO  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ?", GX_NOMASK, "TXPPGCOLO")
         ,new ForEachCursor("T018Q15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Pg_Procod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q16", "SELECT CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc, Pg_Pk, Pg_Pm, EmprCod FROM TXPPGCOL1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Pg_Procod = ? and Pg_ColNom = ? and Pg_ColNum = ? and Pg_Tc = ? ORDER BY EmprCod, CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q17", "SELECT EmprCod, CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc FROM TXPPGCOL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? AND Pg_ColNom = ? AND Pg_ColNum = ? AND Pg_Tc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018Q18", "INSERT INTO TXPPGCOL1(CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc, Pg_Pk, Pg_Pm, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPGCOL1")
         ,new UpdateCursor("T018Q19", "UPDATE TXPPGCOL1 SET Pg_Pk=?, Pg_Pm=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? AND Pg_ColNom = ? AND Pg_ColNum = ? AND Pg_Tc = ?", GX_NOMASK, "TXPPGCOL1")
         ,new UpdateCursor("T018Q20", "DELETE FROM TXPPGCOL1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Pg_Procod = ? AND Pg_ColNom = ? AND Pg_ColNum = ? AND Pg_Tc = ?", GX_NOMASK, "TXPPGCOL1")
         ,new ForEachCursor("T018Q21", "SELECT EmprCod, CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc FROM TXPPGCOL1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Pg_Procod = ? ORDER BY EmprCod, CliCod, ArtCod, Pg_Procod, Pg_ColNom, Pg_ColNum, Pg_Tc ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q23", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018Q24", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
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
            case 10 :
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 22 :
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               }
               stmt.setString(9, (String)parms[10], 3);
               return;
            case 17 :
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 8);
               stmt.setString(7, (String)parms[8], 13);
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

