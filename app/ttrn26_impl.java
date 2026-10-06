package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn26_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1MH531( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV39Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
         AV33Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1MH531( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A3858BarTroCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV39Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
         AV33Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1MH531( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A3858BarTroCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV39Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
         AV33Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1MH531( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A3858BarTroCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4991BarTroOpeC = (int)(GXutil.lval( httpContext.GetPar( "BarTroOpeC"))) ;
         n4991BarTroOpeC = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A4991BarTroOpeC) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Piezas-Trozos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      A197BarPConTro = (short)(GXutil.lval( httpContext.GetPar( "BarPConTro"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public ttrn26_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn26_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn26_impl.class ));
   }

   public ttrn26_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn26.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Trozos Pieza", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn26.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPConTro_Jsonclick, 0, "", "", "", "", "", 1, edtBarPConTro_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn26.htm");
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
         nBlankRcdCount531 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_531 = (short)(1) ;
            scanStart1MH531( ) ;
            while ( RcdFound531 != 0 )
            {
               init_level_properties531( ) ;
               getByPrimaryKey1MH531( ) ;
               addRow1MH531( ) ;
               scanNext1MH531( ) ;
            }
            scanEnd1MH531( ) ;
            nBlankRcdCount531 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B197BarPConTro = A197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         standaloneNotModal1MH531( ) ;
         standaloneModal1MH531( ) ;
         sMode531 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1MH531( ) ;
            edtavnRcdDeleted_531_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_531_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_531_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_531_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROFEC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroFec_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROMET_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroMet_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROKIL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroKil_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROANC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroAnc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroCarr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROCARR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroCarr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCarr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroOpeC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOPEC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroOpeC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroOpeC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOBS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroObs_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarTroOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTroOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroOb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_531 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1MH531( ) ;
            }
            sendRow1MH531( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A197BarPConTro = B197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount531 = (short)(5) ;
         nRcdExists_531 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1MH531( ) ;
            while ( RcdFound531 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_55531( ) ;
               init_level_properties531( ) ;
               standaloneNotModal1MH531( ) ;
               getByPrimaryKey1MH531( ) ;
               standaloneModal1MH531( ) ;
               addRow1MH531( ) ;
               scanNext1MH531( ) ;
            }
            scanEnd1MH531( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode531 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_55531( ) ;
      initAll1MH531( ) ;
      init_level_properties531( ) ;
      B197BarPConTro = A197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      nRcdExists_531 = (short)(0) ;
      nIsMod_531 = (short)(0) ;
      nRcdDeleted_531 = (short)(0) ;
      nBlankRcdCount531 = (short)(nBlankRcdUsr531+nBlankRcdCount531) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount531 > 0 )
      {
         standaloneNotModal1MH531( ) ;
         standaloneModal1MH531( ) ;
         addRow1MH531( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarTroCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount531 = (short)(nBlankRcdCount531-1) ;
      }
      Gx_mode = sMode531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A197BarPConTro = B197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn26.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn26.htm");
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
      e111MH2 ();
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
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "Z197BarPConTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "O197BarPConTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34oldMts = localUtil.ctond( httpContext.cgiGet( "vOLDMTS")) ;
            AV35oldKgs = localUtil.ctond( httpContext.cgiGet( "vOLDKGS")) ;
            AV36oldAnc = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37oldNcarro = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDNCARRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn26");
            forbiddenHiddens.add("AlbRecCod", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn26:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
                        e111MH2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121MH2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'MODIFICAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Modificar' */
                        e131MH2 ();
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
         /* Execute user event: After Trn */
         e121MH2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1MH18( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_531_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_531_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1MH18( ) ;
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

   public void confirm_1MH0( )
   {
      beforeValidate1MH18( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1MH18( ) ;
         }
         else
         {
            checkExtendedTable1MH18( ) ;
            if ( AnyError == 0 )
            {
               zm1MH18( 19) ;
               zm1MH18( 20) ;
            }
            closeExtendedTableCursors1MH18( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode18 = Gx_mode ;
         confirm_1MH531( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode18 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1MH0( ) ;
      }
   }

   public void confirm_1MH531( )
   {
      s197BarPConTro = O197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1MH531( ) ;
         if ( ( nRcdExists_531 != 0 ) || ( nIsMod_531 != 0 ) )
         {
            getKey1MH531( ) ;
            if ( ( nRcdExists_531 == 0 ) && ( nRcdDeleted_531 == 0 ) )
            {
               if ( RcdFound531 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1MH531( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1MH531( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1MH531( 22) ;
                     }
                     closeExtendedTableCursors1MH531( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O197BarPConTro = A197BarPConTro ;
                     httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
                  }
               }
               else
               {
                  GXCCtl = "BARTROCOD_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarTroCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound531 != 0 )
               {
                  if ( nRcdDeleted_531 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1MH531( ) ;
                     load1MH531( ) ;
                     beforeValidate1MH531( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1MH531( ) ;
                        O197BarPConTro = A197BarPConTro ;
                        httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_531 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1MH531( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1MH531( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1MH531( 22) ;
                           }
                           closeExtendedTableCursors1MH531( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O197BarPConTro = A197BarPConTro ;
                           httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_531 == 0 )
                  {
                     GXCCtl = "BARTROCOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarTroCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_531_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroFec_Internalname, localUtil.format(A3859BarTroFec, "99/99/99")) ;
         httpContext.changePostValue( edtBarTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroCarr_Internalname, GXutil.ltrim( localUtil.ntoc( A12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroOpeC_Internalname, GXutil.ltrim( localUtil.ntoc( A4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroObs_Internalname, A5623BarTroObs) ;
         httpContext.changePostValue( edtBarTroOb_Internalname, GXutil.rtrim( A13231BarTroOb)) ;
         httpContext.changePostValue( "ZT_"+"Z3858BarTroCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3859BarTroFec_"+sGXsfl_55_idx, localUtil.dtoc( Z3859BarTroFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3860BarTroMet_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6556BarTroKil_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3861BarTroAnc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12840BarTroCarr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13231BarTroOb_"+sGXsfl_55_idx, GXutil.rtrim( Z13231BarTroOb)) ;
         httpContext.changePostValue( "ZT_"+"Z4991BarTroOpeC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12840BarTroCarr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3861BarTroAnc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6556BarTroKil_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3860BarTroMet_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_531_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_531_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_531_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_531 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_531_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_531_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROFEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROMET_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROKIL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROANC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROCARR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCarr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROOPEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOpeC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROOBS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROOB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O197BarPConTro = s197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1MH0( )
   {
   }

   public void e111MH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn26_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV39Pgmname, (byte)(99), GXv_char2) ;
      ttrn26_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn26_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn26_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn26_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn26_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
   }

   public void e121MH2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A200BarPieCod ;
      GXv_char7[0] = AV8UsurCod ;
      GXv_char8[0] = AV12Station ;
      new app.pprc177(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char7, GXv_char8) ;
      ttrn26_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrn26_impl.this.A129BarCod = GXv_int5[0] ;
      ttrn26_impl.this.A132BarCodReo = GXv_int6[0] ;
      ttrn26_impl.this.A130BarCodPar = GXv_char3[0] ;
      ttrn26_impl.this.A200BarPieCod = GXv_char2[0] ;
      ttrn26_impl.this.AV8UsurCod = GXv_char7[0] ;
      ttrn26_impl.this.AV12Station = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      /*  Sending Event outputs  */
   }

   public void e131MH2( )
   {
      /* 'Modificar' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) && ( A3858BarTroCod > 0 ) )
      {
         callWebObject(formatLink("app.tpztrd0", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", "")))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","barpiecod","bartrocod","Fascod","Mode"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm1MH18( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z197BarPConTro = T01MH6_A197BarPConTro[0] ;
            Z44AlbRecCod = T01MH6_A44AlbRecCod[0] ;
         }
         else
         {
            Z197BarPConTro = A197BarPConTro ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z200BarPieCod = A200BarPieCod ;
         Z197BarPConTro = A197BarPConTro ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
      AV39Pgmname = "TTrn26" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Pgmname", AV39Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
      /* Using cursor T01MH7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MH7_A407EmprNom[0] ;
      n407EmprNom = T01MH7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01MH8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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

   public void load1MH18( )
   {
      /* Using cursor T01MH9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A407EmprNom = T01MH9_A407EmprNom[0] ;
         n407EmprNom = T01MH9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A197BarPConTro = T01MH9_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A44AlbRecCod = T01MH9_A44AlbRecCod[0] ;
         zm1MH18( -18) ;
      }
      pr_default.close(7);
      onLoadActions1MH18( ) ;
   }

   public void onLoadActions1MH18( )
   {
   }

   public void checkExtendedTable1MH18( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1MH18( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1MH18( )
   {
      /* Using cursor T01MH10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01MH6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01MH6_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( GXutil.strcmp(T01MH6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MH6_A129BarCod[0] == A129BarCod ) && ( T01MH6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MH6_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1MH18( 18) ;
         RcdFound18 = (short)(1) ;
         A197BarPConTro = T01MH6_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A44AlbRecCod = T01MH6_A44AlbRecCod[0] ;
         O197BarPConTro = A197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1MH18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey1MH18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey1MH18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1MH18( ) ;
      if ( RcdFound18 == 0 )
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
      RcdFound18 = (short)(0) ;
      /* Using cursor T01MH11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MH11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MH11_A129BarCod[0] == A129BarCod ) && ( T01MH11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MH11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MH11_A200BarPieCod[0], A200BarPieCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01MH11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MH11_A129BarCod[0] == A129BarCod ) && ( T01MH11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MH11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MH11_A200BarPieCod[0], A200BarPieCod) == 0 ) )
         {
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T01MH12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01MH12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MH12_A129BarCod[0] == A129BarCod ) && ( T01MH12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MH12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MH12_A200BarPieCod[0], A200BarPieCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01MH12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MH12_A129BarCod[0] == A129BarCod ) && ( T01MH12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MH12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MH12_A200BarPieCod[0], A200BarPieCod) == 0 ) )
         {
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1MH18( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A197BarPConTro = O197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         insert1MH18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A197BarPConTro = O197BarPConTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A197BarPConTro = O197BarPConTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
               update1MH18( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A197BarPConTro = O197BarPConTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
               insert1MH18( ) ;
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
                  A197BarPConTro = O197BarPConTro ;
                  httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
                  insert1MH18( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A197BarPConTro = O197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKey1MH18( ) ;
      if ( RcdFound18 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn26");
   }

   public void insert_check( )
   {
      confirm_1MH0( ) ;
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
      if ( RcdFound18 == 0 )
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
      scanStart1MH18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1MH18( ) ;
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
      if ( RcdFound18 == 0 )
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
      if ( RcdFound18 == 0 )
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
      scanStart1MH18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound18 != 0 )
         {
            scanNext1MH18( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1MH18( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1MH18( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MH5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z197BarPConTro != T01MH5_A197BarPConTro[0] ) || ( Z44AlbRecCod != T01MH5_A44AlbRecCod[0] ) )
         {
            if ( Z197BarPConTro != T01MH5_A197BarPConTro[0] )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T01MH5_A197BarPConTro[0]);
            }
            if ( Z44AlbRecCod != T01MH5_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01MH5_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MH18( )
   {
      beforeValidate1MH18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MH18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MH18( 0) ;
         checkOptimisticConcurrency1MH18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MH18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MH18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MH13 */
                  pr_default.execute(11, new Object[] {A200BarPieCod, Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
                        processLevel1MH18( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1MH0( ) ;
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
            load1MH18( ) ;
         }
         endLevel1MH18( ) ;
      }
      closeExtendedTableCursors1MH18( ) ;
   }

   public void update1MH18( )
   {
      beforeValidate1MH18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MH18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MH18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MH18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1MH18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MH14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A197BarPConTro), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1MH18( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1MH18( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1MH0( ) ;
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
         endLevel1MH18( ) ;
      }
      closeExtendedTableCursors1MH18( ) ;
   }

   public void deferredUpdate1MH18( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MH18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MH18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MH18( ) ;
         afterConfirm1MH18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MH18( ) ;
            if ( AnyError == 0 )
            {
               A197BarPConTro = O197BarPConTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
               scanStart1MH531( ) ;
               while ( RcdFound531 != 0 )
               {
                  getByPrimaryKey1MH531( ) ;
                  delete1MH531( ) ;
                  scanNext1MH531( ) ;
                  O197BarPConTro = A197BarPConTro ;
                  httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
               }
               scanEnd1MH531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MH15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound18 == 0 )
                        {
                           initAll1MH18( ) ;
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
                        resetCaption1MH0( ) ;
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MH18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MH18( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01MH16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01MH17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarTrDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01MH18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void processNestedLevel1MH531( )
   {
      s197BarPConTro = O197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1MH531( ) ;
         if ( ( nRcdExists_531 != 0 ) || ( nIsMod_531 != 0 ) )
         {
            standaloneNotModal1MH531( ) ;
            getKey1MH531( ) ;
            if ( ( nRcdExists_531 == 0 ) && ( nRcdDeleted_531 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1MH531( ) ;
            }
            else
            {
               if ( RcdFound531 != 0 )
               {
                  if ( ( nRcdDeleted_531 != 0 ) && ( nRcdExists_531 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1MH531( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_531 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1MH531( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_531 == 0 )
                  {
                     GXCCtl = "BARTROCOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarTroCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O197BarPConTro = A197BarPConTro ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_531_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroFec_Internalname, localUtil.format(A3859BarTroFec, "99/99/99")) ;
         httpContext.changePostValue( edtBarTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroCarr_Internalname, GXutil.ltrim( localUtil.ntoc( A12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroOpeC_Internalname, GXutil.ltrim( localUtil.ntoc( A4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTroObs_Internalname, A5623BarTroObs) ;
         httpContext.changePostValue( edtBarTroOb_Internalname, GXutil.rtrim( A13231BarTroOb)) ;
         httpContext.changePostValue( "ZT_"+"Z3858BarTroCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3859BarTroFec_"+sGXsfl_55_idx, localUtil.dtoc( Z3859BarTroFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3860BarTroMet_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6556BarTroKil_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3861BarTroAnc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12840BarTroCarr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13231BarTroOb_"+sGXsfl_55_idx, GXutil.rtrim( Z13231BarTroOb)) ;
         httpContext.changePostValue( "ZT_"+"Z4991BarTroOpeC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12840BarTroCarr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3861BarTroAnc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6556BarTroKil_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3860BarTroMet_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( O3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_531_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_531_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_531_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_531 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_531_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_531_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROFEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROMET_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROKIL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROANC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROCARR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCarr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROOPEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOpeC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROOBS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTROOB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1MH531( ) ;
      if ( AnyError != 0 )
      {
         O197BarPConTro = s197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      }
      nRcdExists_531 = (short)(0) ;
      nIsMod_531 = (short)(0) ;
      nRcdDeleted_531 = (short)(0) ;
   }

   public void processLevel1MH18( )
   {
      /* Save parent mode. */
      sMode18 = Gx_mode ;
      processNestedLevel1MH531( ) ;
      if ( AnyError != 0 )
      {
         O197BarPConTro = s197BarPConTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01MH19 */
      pr_default.execute(17, new Object[] {Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
   }

   public void endLevel1MH18( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1MH18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn26");
         if ( AnyError == 0 )
         {
            confirmValues1MH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn26");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1MH18( )
   {
      /* Scan By routine */
      /* Using cursor T01MH20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MH18( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
   }

   public void scanEnd1MH18( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1MH18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MH18( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MH18( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MH18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MH18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MH18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MH18( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
   }

   public void zm1MH531( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3859BarTroFec = T01MH3_A3859BarTroFec[0] ;
            Z3860BarTroMet = T01MH3_A3860BarTroMet[0] ;
            Z6556BarTroKil = T01MH3_A6556BarTroKil[0] ;
            Z3861BarTroAnc = T01MH3_A3861BarTroAnc[0] ;
            Z12840BarTroCarr = T01MH3_A12840BarTroCarr[0] ;
            Z13231BarTroOb = T01MH3_A13231BarTroOb[0] ;
            Z4991BarTroOpeC = T01MH3_A4991BarTroOpeC[0] ;
         }
         else
         {
            Z3859BarTroFec = A3859BarTroFec ;
            Z3860BarTroMet = A3860BarTroMet ;
            Z6556BarTroKil = A6556BarTroKil ;
            Z3861BarTroAnc = A3861BarTroAnc ;
            Z12840BarTroCarr = A12840BarTroCarr ;
            Z13231BarTroOb = A13231BarTroOb ;
            Z4991BarTroOpeC = A4991BarTroOpeC ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         Z3859BarTroFec = A3859BarTroFec ;
         Z3860BarTroMet = A3860BarTroMet ;
         Z6556BarTroKil = A6556BarTroKil ;
         Z3861BarTroAnc = A3861BarTroAnc ;
         Z12840BarTroCarr = A12840BarTroCarr ;
         Z5623BarTroObs = A5623BarTroObs ;
         Z13231BarTroOb = A13231BarTroOb ;
         Z396EmprCod = A396EmprCod ;
         Z4991BarTroOpeC = A4991BarTroOpeC ;
      }
   }

   public void standaloneNotModal1MH531( )
   {
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
   }

   public void standaloneModal1MH531( )
   {
      if ( isIns( )  )
      {
         A197BarPConTro = (short)(O197BarPConTro+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3858BarTroCod = A197BarPConTro ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3859BarTroFec)) && ( Gx_BScreen == 0 ) )
      {
         A3859BarTroFec = GXutil.today( ) ;
         n3859BarTroFec = false ;
      }
      if ( isIns( )  && (0==A4991BarTroOpeC) && ( Gx_BScreen == 0 ) )
      {
         A4991BarTroOpeC = 999999 ;
         n4991BarTroOpeC = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarTroCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtBarTroCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1MH531( )
   {
      /* Using cursor T01MH21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A5623BarTroObs = T01MH21_A5623BarTroObs[0] ;
         n5623BarTroObs = T01MH21_n5623BarTroObs[0] ;
         A3859BarTroFec = T01MH21_A3859BarTroFec[0] ;
         n3859BarTroFec = T01MH21_n3859BarTroFec[0] ;
         A3860BarTroMet = T01MH21_A3860BarTroMet[0] ;
         n3860BarTroMet = T01MH21_n3860BarTroMet[0] ;
         A6556BarTroKil = T01MH21_A6556BarTroKil[0] ;
         n6556BarTroKil = T01MH21_n6556BarTroKil[0] ;
         A3861BarTroAnc = T01MH21_A3861BarTroAnc[0] ;
         n3861BarTroAnc = T01MH21_n3861BarTroAnc[0] ;
         A12840BarTroCarr = T01MH21_A12840BarTroCarr[0] ;
         n12840BarTroCarr = T01MH21_n12840BarTroCarr[0] ;
         A13231BarTroOb = T01MH21_A13231BarTroOb[0] ;
         n13231BarTroOb = T01MH21_n13231BarTroOb[0] ;
         A4991BarTroOpeC = T01MH21_A4991BarTroOpeC[0] ;
         n4991BarTroOpeC = T01MH21_n4991BarTroOpeC[0] ;
         zm1MH531( -21) ;
      }
      pr_default.close(19);
      onLoadActions1MH531( ) ;
   }

   public void onLoadActions1MH531( )
   {
      AV34oldMts = O3860BarTroMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldMts", GXutil.ltrimstr( AV34oldMts, 9, 2));
      AV35oldKgs = O6556BarTroKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldKgs", GXutil.ltrimstr( AV35oldKgs, 9, 2));
      AV36oldAnc = O3861BarTroAnc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36oldAnc), 4, 0));
      AV37oldNcarro = O12840BarTroCarr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldNcarro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37oldNcarro), 4, 0));
   }

   public void checkExtendedTable1MH531( )
   {
      nIsDirty_531 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1MH531( ) ;
      /* Using cursor T01MH4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARTROOPEC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Ope BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroOpeC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      AV34oldMts = O3860BarTroMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldMts", GXutil.ltrimstr( AV34oldMts, 9, 2));
      AV35oldKgs = O6556BarTroKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldKgs", GXutil.ltrimstr( AV35oldKgs, 9, 2));
      AV36oldAnc = O3861BarTroAnc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36oldAnc), 4, 0));
      AV37oldNcarro = O12840BarTroCarr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldNcarro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37oldNcarro), 4, 0));
   }

   public void closeExtendedTableCursors1MH531( )
   {
      pr_default.close(2);
   }

   public void enableDisable1MH531( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          int A4991BarTroOpeC )
   {
      /* Using cursor T01MH22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "BARTROOPEC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Ope BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroOpeC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1MH531( )
   {
      /* Using cursor T01MH23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
      else
      {
         RcdFound531 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1MH531( )
   {
      /* Using cursor T01MH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T01MH3_A129BarCod[0] == A129BarCod ) && ( T01MH3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MH3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MH3_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( GXutil.strcmp(T01MH3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MH531( 21) ;
         RcdFound531 = (short)(1) ;
         initializeNonKey1MH531( ) ;
         A5623BarTroObs = T01MH3_A5623BarTroObs[0] ;
         n5623BarTroObs = T01MH3_n5623BarTroObs[0] ;
         A3858BarTroCod = T01MH3_A3858BarTroCod[0] ;
         A3859BarTroFec = T01MH3_A3859BarTroFec[0] ;
         n3859BarTroFec = T01MH3_n3859BarTroFec[0] ;
         A3860BarTroMet = T01MH3_A3860BarTroMet[0] ;
         n3860BarTroMet = T01MH3_n3860BarTroMet[0] ;
         A6556BarTroKil = T01MH3_A6556BarTroKil[0] ;
         n6556BarTroKil = T01MH3_n6556BarTroKil[0] ;
         A3861BarTroAnc = T01MH3_A3861BarTroAnc[0] ;
         n3861BarTroAnc = T01MH3_n3861BarTroAnc[0] ;
         A12840BarTroCarr = T01MH3_A12840BarTroCarr[0] ;
         n12840BarTroCarr = T01MH3_n12840BarTroCarr[0] ;
         A13231BarTroOb = T01MH3_A13231BarTroOb[0] ;
         n13231BarTroOb = T01MH3_n13231BarTroOb[0] ;
         A4991BarTroOpeC = T01MH3_A4991BarTroOpeC[0] ;
         n4991BarTroOpeC = T01MH3_n4991BarTroOpeC[0] ;
         O12840BarTroCarr = A12840BarTroCarr ;
         n12840BarTroCarr = false ;
         O3861BarTroAnc = A3861BarTroAnc ;
         n3861BarTroAnc = false ;
         O6556BarTroKil = A6556BarTroKil ;
         n6556BarTroKil = false ;
         O3860BarTroMet = A3860BarTroMet ;
         n3860BarTroMet = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MH531( ) ;
         load1MH531( ) ;
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound531 = (short)(0) ;
         initializeNonKey1MH531( ) ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MH531( ) ;
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1MH531( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1MH531( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z3859BarTroFec), GXutil.resetTime(T01MH2_A3859BarTroFec[0])) ) || ( DecimalUtil.compareTo(Z3860BarTroMet, T01MH2_A3860BarTroMet[0]) != 0 ) || ( DecimalUtil.compareTo(Z6556BarTroKil, T01MH2_A6556BarTroKil[0]) != 0 ) || ( Z3861BarTroAnc != T01MH2_A3861BarTroAnc[0] ) || ( Z12840BarTroCarr != T01MH2_A12840BarTroCarr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13231BarTroOb, T01MH2_A13231BarTroOb[0]) != 0 ) || ( Z4991BarTroOpeC != T01MH2_A4991BarTroOpeC[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3859BarTroFec), GXutil.resetTime(T01MH2_A3859BarTroFec[0])) ) )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroFec");
               GXutil.writeLogRaw("Old: ",Z3859BarTroFec);
               GXutil.writeLogRaw("Current: ",T01MH2_A3859BarTroFec[0]);
            }
            if ( DecimalUtil.compareTo(Z3860BarTroMet, T01MH2_A3860BarTroMet[0]) != 0 )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroMet");
               GXutil.writeLogRaw("Old: ",Z3860BarTroMet);
               GXutil.writeLogRaw("Current: ",T01MH2_A3860BarTroMet[0]);
            }
            if ( DecimalUtil.compareTo(Z6556BarTroKil, T01MH2_A6556BarTroKil[0]) != 0 )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroKil");
               GXutil.writeLogRaw("Old: ",Z6556BarTroKil);
               GXutil.writeLogRaw("Current: ",T01MH2_A6556BarTroKil[0]);
            }
            if ( Z3861BarTroAnc != T01MH2_A3861BarTroAnc[0] )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroAnc");
               GXutil.writeLogRaw("Old: ",Z3861BarTroAnc);
               GXutil.writeLogRaw("Current: ",T01MH2_A3861BarTroAnc[0]);
            }
            if ( Z12840BarTroCarr != T01MH2_A12840BarTroCarr[0] )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroCarr");
               GXutil.writeLogRaw("Old: ",Z12840BarTroCarr);
               GXutil.writeLogRaw("Current: ",T01MH2_A12840BarTroCarr[0]);
            }
            if ( GXutil.strcmp(Z13231BarTroOb, T01MH2_A13231BarTroOb[0]) != 0 )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroOb");
               GXutil.writeLogRaw("Old: ",Z13231BarTroOb);
               GXutil.writeLogRaw("Current: ",T01MH2_A13231BarTroOb[0]);
            }
            if ( Z4991BarTroOpeC != T01MH2_A4991BarTroOpeC[0] )
            {
               GXutil.writeLogln("ttrn26:[seudo value changed for attri]"+"BarTroOpeC");
               GXutil.writeLogRaw("Old: ",Z4991BarTroOpeC);
               GXutil.writeLogRaw("Current: ",T01MH2_A4991BarTroOpeC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARTRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MH531( )
   {
      beforeValidate1MH531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MH531( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MH531( 0) ;
         checkOptimisticConcurrency1MH531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MH531( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MH531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MH24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod), Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n6556BarTroKil), A6556BarTroKil, Boolean.valueOf(n3861BarTroAnc), Short.valueOf(A3861BarTroAnc), Boolean.valueOf(n12840BarTroCarr), Short.valueOf(A12840BarTroCarr), Boolean.valueOf(n5623BarTroObs), A5623BarTroObs, Boolean.valueOf(n13231BarTroOb), A13231BarTroOb, A396EmprCod, Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                  if ( (pr_default.getStatus(22) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.tpztrd0", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", "")))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","barpiecod","bartrocod","Fascod","Mode"})  ;
                     }
                     if ( true /* Level */ && true /* After */ )
                     {
                        AV33Inc_obs = httpContext.getMessage( httpContext.getMessage( "Linea Creada, ", ""), "") + GXutil.str( A3858BarTroCod, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Mts ", ""), "") + GXutil.str( A3860BarTroMet, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Kgs", ""), "") + GXutil.str( A6556BarTroKil, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Ancho", ""), "") + GXutil.str( A3861BarTroAnc, 4, 0) + httpContext.getMessage( httpContext.getMessage( " N Carro", ""), "") + GXutil.str( A12840BarTroCarr, 4, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
                     }
                     if ( true /* Level */ && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
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
            load1MH531( ) ;
         }
         endLevel1MH531( ) ;
      }
      closeExtendedTableCursors1MH531( ) ;
   }

   public void update1MH531( )
   {
      beforeValidate1MH531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MH531( ) ;
      }
      if ( ( nIsMod_531 != 0 ) || ( nIsDirty_531 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1MH531( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1MH531( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1MH531( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01MH25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n6556BarTroKil), A6556BarTroKil, Boolean.valueOf(n3861BarTroAnc), Short.valueOf(A3861BarTroAnc), Boolean.valueOf(n12840BarTroCarr), Short.valueOf(A12840BarTroCarr), Boolean.valueOf(n5623BarTroObs), A5623BarTroObs, Boolean.valueOf(n13231BarTroOb), A13231BarTroOb, Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1MH531( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* Level */ && true /* After */ )
                        {
                           AV33Inc_obs = httpContext.getMessage( httpContext.getMessage( "Linea Modificada, ", ""), "") + GXutil.str( A3858BarTroCod, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Mts ", ""), "") + GXutil.str( AV34oldMts, 9, 2) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + GXutil.str( A3860BarTroMet, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Kgs", ""), "") + GXutil.str( AV35oldKgs, 9, 2) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + GXutil.str( A6556BarTroKil, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Ancho", ""), "") + GXutil.str( AV36oldAnc, 4, 0) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + GXutil.str( A3861BarTroAnc, 4, 0) + httpContext.getMessage( httpContext.getMessage( " N Carro", ""), "") + GXutil.str( AV37oldNcarro, 4, 0) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + GXutil.str( A12840BarTroCarr, 4, 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
                        }
                        if ( true /* Level */ && true /* After */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1MH531( ) ;
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
            endLevel1MH531( ) ;
         }
      }
      closeExtendedTableCursors1MH531( ) ;
   }

   public void deferredUpdate1MH531( )
   {
   }

   public void delete1MH531( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MH531( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MH531( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MH531( ) ;
         afterConfirm1MH531( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MH531( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01MH26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* Level */ && true /* After */ )
                  {
                     AV33Inc_obs = httpContext.getMessage( httpContext.getMessage( "Linea Eliminada ", ""), "") + GXutil.str( A3858BarTroCod, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Mts ", ""), "") + GXutil.str( A3860BarTroMet, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Kgs", ""), "") + GXutil.str( A6556BarTroKil, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Ancho", ""), "") + GXutil.str( A3861BarTroAnc, 4, 0) + httpContext.getMessage( httpContext.getMessage( " N Carro", ""), "") + GXutil.str( A12840BarTroCarr, 4, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
                  }
                  if ( true /* Level */ && true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  }
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
      sMode531 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MH531( ) ;
      Gx_mode = sMode531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MH531( )
   {
      standaloneModal1MH531( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV34oldMts = O3860BarTroMet ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34oldMts", GXutil.ltrimstr( AV34oldMts, 9, 2));
         AV35oldKgs = O6556BarTroKil ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35oldKgs", GXutil.ltrimstr( AV35oldKgs, 9, 2));
         AV36oldAnc = O3861BarTroAnc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36oldAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36oldAnc), 4, 0));
         AV37oldNcarro = O12840BarTroCarr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37oldNcarro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37oldNcarro), 4, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01MH27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01MH28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarTrDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void endLevel1MH531( )
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

   public void scanStart1MH531( )
   {
      /* Scan By routine */
      /* Using cursor T01MH29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A3858BarTroCod = T01MH29_A3858BarTroCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MH531( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A3858BarTroCod = T01MH29_A3858BarTroCod[0] ;
      }
   }

   public void scanEnd1MH531( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1MH531( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MH531( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MH531( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MH531( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MH531( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MH531( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MH531( )
   {
      edtBarTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroFec_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroMet_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroKil_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroAnc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroCarr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCarr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCarr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroOpeC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroOpeC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroOpeC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroObs_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarTroOb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroOb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1MH531( )
   {
   }

   public void send_integrity_lvl_hashes1MH18( )
   {
   }

   public void subsflControlProps_55531( )
   {
      edtavnRcdDeleted_531_Internalname = "vNRCDDELETED_531_"+sGXsfl_55_idx ;
      edtBarTroCod_Internalname = "BARTROCOD_"+sGXsfl_55_idx ;
      edtBarTroFec_Internalname = "BARTROFEC_"+sGXsfl_55_idx ;
      edtBarTroMet_Internalname = "BARTROMET_"+sGXsfl_55_idx ;
      edtBarTroKil_Internalname = "BARTROKIL_"+sGXsfl_55_idx ;
      edtBarTroAnc_Internalname = "BARTROANC_"+sGXsfl_55_idx ;
      edtBarTroCarr_Internalname = "BARTROCARR_"+sGXsfl_55_idx ;
      edtBarTroOpeC_Internalname = "BARTROOPEC_"+sGXsfl_55_idx ;
      edtBarTroObs_Internalname = "BARTROOBS_"+sGXsfl_55_idx ;
      edtBarTroOb_Internalname = "BARTROOB_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_55531( )
   {
      edtavnRcdDeleted_531_Internalname = "vNRCDDELETED_531_"+sGXsfl_55_fel_idx ;
      edtBarTroCod_Internalname = "BARTROCOD_"+sGXsfl_55_fel_idx ;
      edtBarTroFec_Internalname = "BARTROFEC_"+sGXsfl_55_fel_idx ;
      edtBarTroMet_Internalname = "BARTROMET_"+sGXsfl_55_fel_idx ;
      edtBarTroKil_Internalname = "BARTROKIL_"+sGXsfl_55_fel_idx ;
      edtBarTroAnc_Internalname = "BARTROANC_"+sGXsfl_55_fel_idx ;
      edtBarTroCarr_Internalname = "BARTROCARR_"+sGXsfl_55_fel_idx ;
      edtBarTroOpeC_Internalname = "BARTROOPEC_"+sGXsfl_55_fel_idx ;
      edtBarTroObs_Internalname = "BARTROOBS_"+sGXsfl_55_fel_idx ;
      edtBarTroOb_Internalname = "BARTROOB_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1MH531( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55531( ) ;
      sendRow1MH531( ) ;
   }

   public void sendRow1MH531( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_531_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_531_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_531), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_531), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_531_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_531_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroFec_Internalname,localUtil.format(A3859BarTroFec, "99/99/99"),localUtil.format( A3859BarTroFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroMet_Internalname,GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroMet_Enabled!=0) ? localUtil.format( A3860BarTroMet, "ZZZZZ9.99") : localUtil.format( A3860BarTroMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroKil_Internalname,GXutil.ltrim( localUtil.ntoc( A6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroKil_Enabled!=0) ? localUtil.format( A6556BarTroKil, "ZZZZZ9.99") : localUtil.format( A6556BarTroKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3861BarTroAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3861BarTroAnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroCarr_Internalname,GXutil.ltrim( localUtil.ntoc( A12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroCarr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12840BarTroCarr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12840BarTroCarr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroCarr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroCarr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroOpeC_Internalname,GXutil.ltrim( localUtil.ntoc( A4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTroOpeC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4991BarTroOpeC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4991BarTroOpeC), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroOpeC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroOpeC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroObs_Internalname,A5623BarTroObs,A5623BarTroObs,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_531_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTroOb_Internalname,GXutil.rtrim( A13231BarTroOb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTroOb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTroOb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1MH531( ) ;
      GXCCtl = "Z3858BarTroCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3859BarTroFec_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3859BarTroFec, 0, "/"));
      GXCCtl = "Z3860BarTroMet_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6556BarTroKil_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3861BarTroAnc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12840BarTroCarr_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13231BarTroOb_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13231BarTroOb));
      GXCCtl = "Z4991BarTroOpeC_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4991BarTroOpeC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12840BarTroCarr_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12840BarTroCarr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3861BarTroAnc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3861BarTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6556BarTroKil_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3860BarTroMet_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_531_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_531_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_531_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_531, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Station));
      GXCCtl = "vMODE_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_531_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_531_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROFEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROMET_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROKIL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROANC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROCARR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCarr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROOPEC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOpeC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROOBS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROOB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1MH531( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55531( ) ;
      edtavnRcdDeleted_531_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_531_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROFEC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROMET_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROKIL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROANC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroCarr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROCARR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroOpeC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOPEC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOBS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTroOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTROOB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_531_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_531_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_531");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_531_Internalname ;
         wbErr = true ;
         nRcdDeleted_531 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_531 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_531_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARTROCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroCod_Internalname ;
         wbErr = true ;
         A3858BarTroCod = (short)(0) ;
      }
      else
      {
         A3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarTroFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARTROFEC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroFec_Internalname ;
         wbErr = true ;
         A3859BarTroFec = GXutil.nullDate() ;
         n3859BarTroFec = false ;
      }
      else
      {
         A3859BarTroFec = localUtil.ctod( httpContext.cgiGet( edtBarTroFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n3859BarTroFec = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARTROMET_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroMet_Internalname ;
         wbErr = true ;
         A3860BarTroMet = DecimalUtil.ZERO ;
         n3860BarTroMet = false ;
      }
      else
      {
         A3860BarTroMet = localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)) ;
         n3860BarTroMet = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARTROKIL_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroKil_Internalname ;
         wbErr = true ;
         A6556BarTroKil = DecimalUtil.ZERO ;
         n6556BarTroKil = false ;
      }
      else
      {
         A6556BarTroKil = localUtil.ctond( httpContext.cgiGet( edtBarTroKil_Internalname)) ;
         n6556BarTroKil = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARTROANC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroAnc_Internalname ;
         wbErr = true ;
         A3861BarTroAnc = (short)(0) ;
         n3861BarTroAnc = false ;
      }
      else
      {
         A3861BarTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3861BarTroAnc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroCarr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroCarr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARTROCARR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroCarr_Internalname ;
         wbErr = true ;
         A12840BarTroCarr = (short)(0) ;
         n12840BarTroCarr = false ;
      }
      else
      {
         A12840BarTroCarr = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroCarr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12840BarTroCarr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroOpeC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroOpeC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARTROOPEC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroOpeC_Internalname ;
         wbErr = true ;
         A4991BarTroOpeC = 0 ;
         n4991BarTroOpeC = false ;
      }
      else
      {
         A4991BarTroOpeC = (int)(localUtil.ctol( httpContext.cgiGet( edtBarTroOpeC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4991BarTroOpeC = false ;
      }
      A5623BarTroObs = httpContext.cgiGet( edtBarTroObs_Internalname) ;
      n5623BarTroObs = false ;
      A13231BarTroOb = httpContext.cgiGet( edtBarTroOb_Internalname) ;
      n13231BarTroOb = false ;
      GXCCtl = "Z3858BarTroCod_" + sGXsfl_55_idx ;
      Z3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3859BarTroFec_" + sGXsfl_55_idx ;
      Z3859BarTroFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3860BarTroMet_" + sGXsfl_55_idx ;
      Z3860BarTroMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6556BarTroKil_" + sGXsfl_55_idx ;
      Z6556BarTroKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3861BarTroAnc_" + sGXsfl_55_idx ;
      Z3861BarTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12840BarTroCarr_" + sGXsfl_55_idx ;
      Z12840BarTroCarr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13231BarTroOb_" + sGXsfl_55_idx ;
      Z13231BarTroOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4991BarTroOpeC_" + sGXsfl_55_idx ;
      Z4991BarTroOpeC = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O12840BarTroCarr_" + sGXsfl_55_idx ;
      O12840BarTroCarr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O3861BarTroAnc_" + sGXsfl_55_idx ;
      O3861BarTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6556BarTroKil_" + sGXsfl_55_idx ;
      O6556BarTroKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O3860BarTroMet_" + sGXsfl_55_idx ;
      O3860BarTroMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_531_" + sGXsfl_55_idx ;
      nRcdDeleted_531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_531_" + sGXsfl_55_idx ;
      nRcdExists_531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_531_" + sGXsfl_55_idx ;
      nIsMod_531 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarTroCod_Enabled = edtBarTroCod_Enabled ;
   }

   public void confirmValues1MH0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55531( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55531( ) ;
         httpContext.changePostValue( "Z3858BarTroCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3858BarTroCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3858BarTroCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z3859BarTroFec_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3859BarTroFec_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3859BarTroFec_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z3860BarTroMet_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3860BarTroMet_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3860BarTroMet_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z6556BarTroKil_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z6556BarTroKil_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6556BarTroKil_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z3861BarTroAnc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z3861BarTroAnc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3861BarTroAnc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12840BarTroCarr_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12840BarTroCarr_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12840BarTroCarr_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13231BarTroOb_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13231BarTroOb_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13231BarTroOb_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z4991BarTroOpeC_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z4991BarTroOpeC_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4991BarTroOpeC_"+sGXsfl_55_idx) ;
      }
      httpContext.changePostValue( "O12840BarTroCarr", httpContext.cgiGet( "T12840BarTroCarr")) ;
      httpContext.deletePostValue( "T12840BarTroCarr") ;
      httpContext.changePostValue( "O3861BarTroAnc", httpContext.cgiGet( "T3861BarTroAnc")) ;
      httpContext.deletePostValue( "T3861BarTroAnc") ;
      httpContext.changePostValue( "O6556BarTroKil", httpContext.cgiGet( "T6556BarTroKil")) ;
      httpContext.deletePostValue( "T6556BarTroKil") ;
      httpContext.changePostValue( "O3860BarTroMet", httpContext.cgiGet( "T3860BarTroMet")) ;
      httpContext.deletePostValue( "T3860BarTroMet") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn26", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn26");
      forbiddenHiddens.add("AlbRecCod", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn26:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O197BarPConTro", GXutil.ltrim( localUtil.ntoc( O197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV39Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMTS", GXutil.ltrim( localUtil.ntoc( AV34oldMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDKGS", GXutil.ltrim( localUtil.ntoc( AV35oldKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDANC", GXutil.ltrim( localUtil.ntoc( AV36oldAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDNCARRO", GXutil.ltrim( localUtil.ntoc( AV37oldNcarro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV33Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
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
      return formatLink("app.ttrn26", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn26" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Piezas-Trozos", "") ;
   }

   public void initializeNonKey1MH18( )
   {
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A197BarPConTro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      O197BarPConTro = A197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      Z197BarPConTro = (short)(0) ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1MH18( )
   {
      initializeNonKey1MH18( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1MH531( )
   {
      AV34oldMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldMts", GXutil.ltrimstr( AV34oldMts, 9, 2));
      AV35oldKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldKgs", GXutil.ltrimstr( AV35oldKgs, 9, 2));
      AV36oldAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36oldAnc), 4, 0));
      AV37oldNcarro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldNcarro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37oldNcarro), 4, 0));
      AV33Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_obs", AV33Inc_obs);
      A3860BarTroMet = DecimalUtil.ZERO ;
      n3860BarTroMet = false ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      n6556BarTroKil = false ;
      A3861BarTroAnc = (short)(0) ;
      n3861BarTroAnc = false ;
      A12840BarTroCarr = (short)(0) ;
      n12840BarTroCarr = false ;
      A5623BarTroObs = "" ;
      n5623BarTroObs = false ;
      A13231BarTroOb = "" ;
      n13231BarTroOb = false ;
      A3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      A4991BarTroOpeC = 999999 ;
      n4991BarTroOpeC = false ;
      O12840BarTroCarr = A12840BarTroCarr ;
      n12840BarTroCarr = false ;
      O3861BarTroAnc = A3861BarTroAnc ;
      n3861BarTroAnc = false ;
      O6556BarTroKil = A6556BarTroKil ;
      n6556BarTroKil = false ;
      O3860BarTroMet = A3860BarTroMet ;
      n3860BarTroMet = false ;
      Z3859BarTroFec = GXutil.nullDate() ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z6556BarTroKil = DecimalUtil.ZERO ;
      Z3861BarTroAnc = (short)(0) ;
      Z12840BarTroCarr = (short)(0) ;
      Z13231BarTroOb = "" ;
      Z4991BarTroOpeC = 0 ;
   }

   public void initAll1MH531( )
   {
      A3858BarTroCod = (short)(0) ;
      initializeNonKey1MH531( ) ;
   }

   public void standaloneModalInsert1MH531( )
   {
      A197BarPConTro = i197BarPConTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A3859BarTroFec = i3859BarTroFec ;
      n3859BarTroFec = false ;
      A4991BarTroOpeC = i4991BarTroOpeC ;
      n4991BarTroOpeC = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241595576", true, true);
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
      httpContext.AddJavascriptSource("ttrn26.js", "?20268241595576", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties531( )
   {
      edtBarTroCod_Enabled = defedtBarTroCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_531, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_531_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A3859BarTroFec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6556BarTroKil, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3861BarTroAnc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12840BarTroCarr, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroCarr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4991BarTroOpeC, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOpeC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A5623BarTroObs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13231BarTroOb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTroOb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      edtavnRcdDeleted_531_Internalname = "vNRCDDELETED_531" ;
      edtBarTroCod_Internalname = "BARTROCOD" ;
      edtBarTroFec_Internalname = "BARTROFEC" ;
      edtBarTroMet_Internalname = "BARTROMET" ;
      edtBarTroKil_Internalname = "BARTROKIL" ;
      edtBarTroAnc_Internalname = "BARTROANC" ;
      edtBarTroCarr_Internalname = "BARTROCARR" ;
      edtBarTroOpeC_Internalname = "BARTROOPEC" ;
      edtBarTroObs_Internalname = "BARTROOBS" ;
      edtBarTroOb_Internalname = "BARTROOB" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Piezas-Trozos", "") );
      edtBarTroOb_Jsonclick = "" ;
      edtBarTroObs_Jsonclick = "" ;
      edtBarTroOpeC_Jsonclick = "" ;
      edtBarTroCarr_Jsonclick = "" ;
      edtBarTroAnc_Jsonclick = "" ;
      edtBarTroKil_Jsonclick = "" ;
      edtBarTroMet_Jsonclick = "" ;
      edtBarTroFec_Jsonclick = "" ;
      edtBarTroCod_Jsonclick = "" ;
      edtavnRcdDeleted_531_Jsonclick = "" ;
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
      edtBarTroOb_Enabled = 1 ;
      edtBarTroObs_Enabled = 1 ;
      edtBarTroOpeC_Enabled = 1 ;
      edtBarTroCarr_Enabled = 1 ;
      edtBarTroAnc_Enabled = 1 ;
      edtBarTroKil_Enabled = 1 ;
      edtBarTroMet_Enabled = 1 ;
      edtBarTroFec_Enabled = 1 ;
      edtBarTroCod_Enabled = 1 ;
      edtavnRcdDeleted_531_Enabled = 1 ;
      edtBarPConTro_Jsonclick = "" ;
      edtBarPConTro_Backcolor = (int)(0xFFFFFF) ;
      edtBarPConTro_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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

   public void xc_14_1MH531( )
   {
      if ( true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.tpztrd0", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(GXutil.ltrimstr(A3858BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", "")))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","barpiecod","bartrocod","Fascod","Mode"})  ;
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

   public void xc_15_1MH531( String A396EmprCod ,
                             String AV39Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV33Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A3858BarTroCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_16_1MH531( String A396EmprCod ,
                             String AV39Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV33Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A3858BarTroCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_17_1MH531( String A396EmprCod ,
                             String AV39Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV33Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A3858BarTroCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV8UsurCod, AV12Station, AV33Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_55531( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1MH531( ) ;
         standaloneModal1MH531( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1MH531( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55531( ) ;
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
      /* Using cursor T01MH30 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MH30_A407EmprNom[0] ;
      n407EmprNom = T01MH30_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(28);
      /* Using cursor T01MH31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(29);
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

   public void valid_Barpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O197BarPConTro", GXutil.ltrim( localUtil.ntoc( O197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bartromet( )
   {
      n3860BarTroMet = false ;
      AV34oldMts = O3860BarTroMet ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV34oldMts", GXutil.ltrim( localUtil.ntoc( AV34oldMts, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Bartrokil( )
   {
      n6556BarTroKil = false ;
      AV35oldKgs = O6556BarTroKil ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35oldKgs", GXutil.ltrim( localUtil.ntoc( AV35oldKgs, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Bartroanc( )
   {
      n3861BarTroAnc = false ;
      AV36oldAnc = O3861BarTroAnc ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36oldAnc", GXutil.ltrim( localUtil.ntoc( AV36oldAnc, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Bartrocarr( )
   {
      n12840BarTroCarr = false ;
      AV37oldNcarro = O12840BarTroCarr ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldNcarro", GXutil.ltrim( localUtil.ntoc( AV37oldNcarro, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Bartroopec( )
   {
      n4991BarTroOpeC = false ;
      /* Using cursor T01MH32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n4991BarTroOpeC), Integer.valueOf(A4991BarTroOpeC)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Ope BarTro", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTROOPEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTroOpeC_Internalname ;
      }
      pr_default.close(30);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121MH2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'MODIFICAR'","{handler:'e131MH2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''}]");
      setEventMetadata("'MODIFICAR'",",oparms:[{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z44AlbRecCod'},{av:'Z407EmprNom'},{av:'Z197BarPConTro'},{av:'O197BarPConTro'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARPCONTRO","{handler:'valid_Barpcontro',iparms:[]");
      setEventMetadata("VALID_BARPCONTRO",",oparms:[]}");
      setEventMetadata("VALID_BARTROCOD","{handler:'valid_Bartrocod',iparms:[]");
      setEventMetadata("VALID_BARTROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARTROMET","{handler:'valid_Bartromet',iparms:[{av:'O3860BarTroMet'},{av:'A3860BarTroMet',fld:'BARTROMET',pic:'ZZZZZ9.99'},{av:'AV34oldMts',fld:'vOLDMTS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARTROMET",",oparms:[{av:'AV34oldMts',fld:'vOLDMTS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARTROKIL","{handler:'valid_Bartrokil',iparms:[{av:'O6556BarTroKil'},{av:'A6556BarTroKil',fld:'BARTROKIL',pic:'ZZZZZ9.99'},{av:'AV35oldKgs',fld:'vOLDKGS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARTROKIL",",oparms:[{av:'AV35oldKgs',fld:'vOLDKGS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARTROANC","{handler:'valid_Bartroanc',iparms:[{av:'O3861BarTroAnc'},{av:'A3861BarTroAnc',fld:'BARTROANC',pic:'ZZZ9'},{av:'AV36oldAnc',fld:'vOLDANC',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARTROANC",",oparms:[{av:'AV36oldAnc',fld:'vOLDANC',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_BARTROCARR","{handler:'valid_Bartrocarr',iparms:[{av:'O12840BarTroCarr'},{av:'A12840BarTroCarr',fld:'BARTROCARR',pic:'ZZZ9'},{av:'AV37oldNcarro',fld:'vOLDNCARRO',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARTROCARR",",oparms:[{av:'AV37oldNcarro',fld:'vOLDNCARRO',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_BARTROOPEC","{handler:'valid_Bartroopec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4991BarTroOpeC',fld:'BARTROOPEC',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARTROOPEC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bartroob',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(29);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA200BarPieCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z3859BarTroFec = GXutil.nullDate() ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z6556BarTroKil = DecimalUtil.ZERO ;
      Z13231BarTroOb = "" ;
      O6556BarTroKil = DecimalUtil.ZERO ;
      O3860BarTroMet = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV39Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV33Inc_obs = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode531 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34oldMts = DecimalUtil.ZERO ;
      AV35oldKgs = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode18 = "" ;
      GXCCtl = "" ;
      A3859BarTroFec = GXutil.nullDate() ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      A5623BarTroObs = "" ;
      A13231BarTroOb = "" ;
      T6556BarTroKil = DecimalUtil.ZERO ;
      T3860BarTroMet = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      Z407EmprNom = "" ;
      T01MH7_A407EmprNom = new String[] {""} ;
      T01MH7_n407EmprNom = new boolean[] {false} ;
      T01MH8_A396EmprCod = new String[] {""} ;
      T01MH9_A200BarPieCod = new String[] {""} ;
      T01MH9_A407EmprNom = new String[] {""} ;
      T01MH9_n407EmprNom = new boolean[] {false} ;
      T01MH9_A197BarPConTro = new short[1] ;
      T01MH9_A396EmprCod = new String[] {""} ;
      T01MH9_A44AlbRecCod = new int[1] ;
      T01MH9_A129BarCod = new int[1] ;
      T01MH9_A132BarCodReo = new byte[1] ;
      T01MH9_A130BarCodPar = new String[] {""} ;
      T01MH10_A396EmprCod = new String[] {""} ;
      T01MH10_A129BarCod = new int[1] ;
      T01MH10_A132BarCodReo = new byte[1] ;
      T01MH10_A130BarCodPar = new String[] {""} ;
      T01MH10_A200BarPieCod = new String[] {""} ;
      T01MH6_A200BarPieCod = new String[] {""} ;
      T01MH6_A197BarPConTro = new short[1] ;
      T01MH6_A396EmprCod = new String[] {""} ;
      T01MH6_A44AlbRecCod = new int[1] ;
      T01MH6_A129BarCod = new int[1] ;
      T01MH6_A132BarCodReo = new byte[1] ;
      T01MH6_A130BarCodPar = new String[] {""} ;
      T01MH11_A396EmprCod = new String[] {""} ;
      T01MH11_A129BarCod = new int[1] ;
      T01MH11_A132BarCodReo = new byte[1] ;
      T01MH11_A130BarCodPar = new String[] {""} ;
      T01MH11_A200BarPieCod = new String[] {""} ;
      T01MH12_A396EmprCod = new String[] {""} ;
      T01MH12_A129BarCod = new int[1] ;
      T01MH12_A132BarCodReo = new byte[1] ;
      T01MH12_A130BarCodPar = new String[] {""} ;
      T01MH12_A200BarPieCod = new String[] {""} ;
      T01MH5_A200BarPieCod = new String[] {""} ;
      T01MH5_A197BarPConTro = new short[1] ;
      T01MH5_A396EmprCod = new String[] {""} ;
      T01MH5_A44AlbRecCod = new int[1] ;
      T01MH5_A129BarCod = new int[1] ;
      T01MH5_A132BarCodReo = new byte[1] ;
      T01MH5_A130BarCodPar = new String[] {""} ;
      T01MH16_A396EmprCod = new String[] {""} ;
      T01MH16_A129BarCod = new int[1] ;
      T01MH16_A132BarCodReo = new byte[1] ;
      T01MH16_A130BarCodPar = new String[] {""} ;
      T01MH16_A200BarPieCod = new String[] {""} ;
      T01MH16_A12913BarPieLDf = new short[1] ;
      T01MH17_A396EmprCod = new String[] {""} ;
      T01MH17_A129BarCod = new int[1] ;
      T01MH17_A132BarCodReo = new byte[1] ;
      T01MH17_A130BarCodPar = new String[] {""} ;
      T01MH17_A200BarPieCod = new String[] {""} ;
      T01MH17_A3858BarTroCod = new short[1] ;
      T01MH17_A4993BarTroDef = new short[1] ;
      T01MH18_A396EmprCod = new String[] {""} ;
      T01MH18_A30AlbProCod = new long[1] ;
      T01MH18_A129BarCod = new int[1] ;
      T01MH18_A132BarCodReo = new byte[1] ;
      T01MH18_A130BarCodPar = new String[] {""} ;
      T01MH18_A200BarPieCod = new String[] {""} ;
      T01MH20_A396EmprCod = new String[] {""} ;
      T01MH20_A129BarCod = new int[1] ;
      T01MH20_A132BarCodReo = new byte[1] ;
      T01MH20_A130BarCodPar = new String[] {""} ;
      T01MH20_A200BarPieCod = new String[] {""} ;
      Z5623BarTroObs = "" ;
      T01MH21_A5623BarTroObs = new String[] {""} ;
      T01MH21_n5623BarTroObs = new boolean[] {false} ;
      T01MH21_A129BarCod = new int[1] ;
      T01MH21_A132BarCodReo = new byte[1] ;
      T01MH21_A130BarCodPar = new String[] {""} ;
      T01MH21_A200BarPieCod = new String[] {""} ;
      T01MH21_A3858BarTroCod = new short[1] ;
      T01MH21_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01MH21_n3859BarTroFec = new boolean[] {false} ;
      T01MH21_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MH21_n3860BarTroMet = new boolean[] {false} ;
      T01MH21_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MH21_n6556BarTroKil = new boolean[] {false} ;
      T01MH21_A3861BarTroAnc = new short[1] ;
      T01MH21_n3861BarTroAnc = new boolean[] {false} ;
      T01MH21_A12840BarTroCarr = new short[1] ;
      T01MH21_n12840BarTroCarr = new boolean[] {false} ;
      T01MH21_A13231BarTroOb = new String[] {""} ;
      T01MH21_n13231BarTroOb = new boolean[] {false} ;
      T01MH21_A396EmprCod = new String[] {""} ;
      T01MH21_A4991BarTroOpeC = new int[1] ;
      T01MH21_n4991BarTroOpeC = new boolean[] {false} ;
      T01MH4_A396EmprCod = new String[] {""} ;
      T01MH22_A396EmprCod = new String[] {""} ;
      T01MH23_A396EmprCod = new String[] {""} ;
      T01MH23_A129BarCod = new int[1] ;
      T01MH23_A132BarCodReo = new byte[1] ;
      T01MH23_A130BarCodPar = new String[] {""} ;
      T01MH23_A200BarPieCod = new String[] {""} ;
      T01MH23_A3858BarTroCod = new short[1] ;
      T01MH3_A5623BarTroObs = new String[] {""} ;
      T01MH3_n5623BarTroObs = new boolean[] {false} ;
      T01MH3_A129BarCod = new int[1] ;
      T01MH3_A132BarCodReo = new byte[1] ;
      T01MH3_A130BarCodPar = new String[] {""} ;
      T01MH3_A200BarPieCod = new String[] {""} ;
      T01MH3_A3858BarTroCod = new short[1] ;
      T01MH3_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01MH3_n3859BarTroFec = new boolean[] {false} ;
      T01MH3_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MH3_n3860BarTroMet = new boolean[] {false} ;
      T01MH3_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MH3_n6556BarTroKil = new boolean[] {false} ;
      T01MH3_A3861BarTroAnc = new short[1] ;
      T01MH3_n3861BarTroAnc = new boolean[] {false} ;
      T01MH3_A12840BarTroCarr = new short[1] ;
      T01MH3_n12840BarTroCarr = new boolean[] {false} ;
      T01MH3_A13231BarTroOb = new String[] {""} ;
      T01MH3_n13231BarTroOb = new boolean[] {false} ;
      T01MH3_A396EmprCod = new String[] {""} ;
      T01MH3_A4991BarTroOpeC = new int[1] ;
      T01MH3_n4991BarTroOpeC = new boolean[] {false} ;
      T01MH2_A5623BarTroObs = new String[] {""} ;
      T01MH2_n5623BarTroObs = new boolean[] {false} ;
      T01MH2_A129BarCod = new int[1] ;
      T01MH2_A132BarCodReo = new byte[1] ;
      T01MH2_A130BarCodPar = new String[] {""} ;
      T01MH2_A200BarPieCod = new String[] {""} ;
      T01MH2_A3858BarTroCod = new short[1] ;
      T01MH2_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01MH2_n3859BarTroFec = new boolean[] {false} ;
      T01MH2_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MH2_n3860BarTroMet = new boolean[] {false} ;
      T01MH2_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MH2_n6556BarTroKil = new boolean[] {false} ;
      T01MH2_A3861BarTroAnc = new short[1] ;
      T01MH2_n3861BarTroAnc = new boolean[] {false} ;
      T01MH2_A12840BarTroCarr = new short[1] ;
      T01MH2_n12840BarTroCarr = new boolean[] {false} ;
      T01MH2_A13231BarTroOb = new String[] {""} ;
      T01MH2_n13231BarTroOb = new boolean[] {false} ;
      T01MH2_A396EmprCod = new String[] {""} ;
      T01MH2_A4991BarTroOpeC = new int[1] ;
      T01MH2_n4991BarTroOpeC = new boolean[] {false} ;
      T01MH27_A396EmprCod = new String[] {""} ;
      T01MH27_A129BarCod = new int[1] ;
      T01MH27_A132BarCodReo = new byte[1] ;
      T01MH27_A130BarCodPar = new String[] {""} ;
      T01MH27_A200BarPieCod = new String[] {""} ;
      T01MH27_A3858BarTroCod = new short[1] ;
      T01MH27_A12649TRDefcod = new short[1] ;
      T01MH27_A12650TRFasCod = new String[] {""} ;
      T01MH28_A396EmprCod = new String[] {""} ;
      T01MH28_A129BarCod = new int[1] ;
      T01MH28_A132BarCodReo = new byte[1] ;
      T01MH28_A130BarCodPar = new String[] {""} ;
      T01MH28_A200BarPieCod = new String[] {""} ;
      T01MH28_A3858BarTroCod = new short[1] ;
      T01MH28_A4993BarTroDef = new short[1] ;
      T01MH29_A396EmprCod = new String[] {""} ;
      T01MH29_A129BarCod = new int[1] ;
      T01MH29_A132BarCodReo = new byte[1] ;
      T01MH29_A130BarCodPar = new String[] {""} ;
      T01MH29_A200BarPieCod = new String[] {""} ;
      T01MH29_A3858BarTroCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i3859BarTroFec = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01MH30_A407EmprNom = new String[] {""} ;
      T01MH30_n407EmprNom = new boolean[] {false} ;
      T01MH31_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ407EmprNom = "" ;
      ZV34oldMts = DecimalUtil.ZERO ;
      ZV35oldKgs = DecimalUtil.ZERO ;
      T01MH32_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn26__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn26__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn26__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn26__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn26__default(),
         new Object[] {
             new Object[] {
            T01MH2_A5623BarTroObs, T01MH2_n5623BarTroObs, T01MH2_A129BarCod, T01MH2_A132BarCodReo, T01MH2_A130BarCodPar, T01MH2_A200BarPieCod, T01MH2_A3858BarTroCod, T01MH2_A3859BarTroFec, T01MH2_n3859BarTroFec, T01MH2_A3860BarTroMet,
            T01MH2_n3860BarTroMet, T01MH2_A6556BarTroKil, T01MH2_n6556BarTroKil, T01MH2_A3861BarTroAnc, T01MH2_n3861BarTroAnc, T01MH2_A12840BarTroCarr, T01MH2_n12840BarTroCarr, T01MH2_A13231BarTroOb, T01MH2_n13231BarTroOb, T01MH2_A396EmprCod,
            T01MH2_A4991BarTroOpeC, T01MH2_n4991BarTroOpeC
            }
            , new Object[] {
            T01MH3_A5623BarTroObs, T01MH3_n5623BarTroObs, T01MH3_A129BarCod, T01MH3_A132BarCodReo, T01MH3_A130BarCodPar, T01MH3_A200BarPieCod, T01MH3_A3858BarTroCod, T01MH3_A3859BarTroFec, T01MH3_n3859BarTroFec, T01MH3_A3860BarTroMet,
            T01MH3_n3860BarTroMet, T01MH3_A6556BarTroKil, T01MH3_n6556BarTroKil, T01MH3_A3861BarTroAnc, T01MH3_n3861BarTroAnc, T01MH3_A12840BarTroCarr, T01MH3_n12840BarTroCarr, T01MH3_A13231BarTroOb, T01MH3_n13231BarTroOb, T01MH3_A396EmprCod,
            T01MH3_A4991BarTroOpeC, T01MH3_n4991BarTroOpeC
            }
            , new Object[] {
            T01MH4_A396EmprCod
            }
            , new Object[] {
            T01MH5_A200BarPieCod, T01MH5_A197BarPConTro, T01MH5_A396EmprCod, T01MH5_A44AlbRecCod, T01MH5_A129BarCod, T01MH5_A132BarCodReo, T01MH5_A130BarCodPar
            }
            , new Object[] {
            T01MH6_A200BarPieCod, T01MH6_A197BarPConTro, T01MH6_A396EmprCod, T01MH6_A44AlbRecCod, T01MH6_A129BarCod, T01MH6_A132BarCodReo, T01MH6_A130BarCodPar
            }
            , new Object[] {
            T01MH7_A407EmprNom, T01MH7_n407EmprNom
            }
            , new Object[] {
            T01MH8_A396EmprCod
            }
            , new Object[] {
            T01MH9_A200BarPieCod, T01MH9_A407EmprNom, T01MH9_n407EmprNom, T01MH9_A197BarPConTro, T01MH9_A396EmprCod, T01MH9_A44AlbRecCod, T01MH9_A129BarCod, T01MH9_A132BarCodReo, T01MH9_A130BarCodPar
            }
            , new Object[] {
            T01MH10_A396EmprCod, T01MH10_A129BarCod, T01MH10_A132BarCodReo, T01MH10_A130BarCodPar, T01MH10_A200BarPieCod
            }
            , new Object[] {
            T01MH11_A396EmprCod, T01MH11_A129BarCod, T01MH11_A132BarCodReo, T01MH11_A130BarCodPar, T01MH11_A200BarPieCod
            }
            , new Object[] {
            T01MH12_A396EmprCod, T01MH12_A129BarCod, T01MH12_A132BarCodReo, T01MH12_A130BarCodPar, T01MH12_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MH16_A396EmprCod, T01MH16_A129BarCod, T01MH16_A132BarCodReo, T01MH16_A130BarCodPar, T01MH16_A200BarPieCod, T01MH16_A12913BarPieLDf
            }
            , new Object[] {
            T01MH17_A396EmprCod, T01MH17_A129BarCod, T01MH17_A132BarCodReo, T01MH17_A130BarCodPar, T01MH17_A200BarPieCod, T01MH17_A3858BarTroCod, T01MH17_A4993BarTroDef
            }
            , new Object[] {
            T01MH18_A396EmprCod, T01MH18_A30AlbProCod, T01MH18_A129BarCod, T01MH18_A132BarCodReo, T01MH18_A130BarCodPar, T01MH18_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01MH20_A396EmprCod, T01MH20_A129BarCod, T01MH20_A132BarCodReo, T01MH20_A130BarCodPar, T01MH20_A200BarPieCod
            }
            , new Object[] {
            T01MH21_A5623BarTroObs, T01MH21_n5623BarTroObs, T01MH21_A129BarCod, T01MH21_A132BarCodReo, T01MH21_A130BarCodPar, T01MH21_A200BarPieCod, T01MH21_A3858BarTroCod, T01MH21_A3859BarTroFec, T01MH21_n3859BarTroFec, T01MH21_A3860BarTroMet,
            T01MH21_n3860BarTroMet, T01MH21_A6556BarTroKil, T01MH21_n6556BarTroKil, T01MH21_A3861BarTroAnc, T01MH21_n3861BarTroAnc, T01MH21_A12840BarTroCarr, T01MH21_n12840BarTroCarr, T01MH21_A13231BarTroOb, T01MH21_n13231BarTroOb, T01MH21_A396EmprCod,
            T01MH21_A4991BarTroOpeC, T01MH21_n4991BarTroOpeC
            }
            , new Object[] {
            T01MH22_A396EmprCod
            }
            , new Object[] {
            T01MH23_A396EmprCod, T01MH23_A129BarCod, T01MH23_A132BarCodReo, T01MH23_A130BarCodPar, T01MH23_A200BarPieCod, T01MH23_A3858BarTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MH27_A396EmprCod, T01MH27_A129BarCod, T01MH27_A132BarCodReo, T01MH27_A130BarCodPar, T01MH27_A200BarPieCod, T01MH27_A3858BarTroCod, T01MH27_A12649TRDefcod, T01MH27_A12650TRFasCod
            }
            , new Object[] {
            T01MH28_A396EmprCod, T01MH28_A129BarCod, T01MH28_A132BarCodReo, T01MH28_A130BarCodPar, T01MH28_A200BarPieCod, T01MH28_A3858BarTroCod, T01MH28_A4993BarTroDef
            }
            , new Object[] {
            T01MH29_A396EmprCod, T01MH29_A129BarCod, T01MH29_A132BarCodReo, T01MH29_A130BarCodPar, T01MH29_A200BarPieCod, T01MH29_A3858BarTroCod
            }
            , new Object[] {
            T01MH30_A407EmprNom, T01MH30_n407EmprNom
            }
            , new Object[] {
            T01MH31_A396EmprCod
            }
            , new Object[] {
            T01MH32_A396EmprCod
            }
         }
      );
      Z200BarPieCod = "" ;
      A200BarPieCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z4991BarTroOpeC = 999999 ;
      n4991BarTroOpeC = false ;
      i4991BarTroOpeC = 999999 ;
      n4991BarTroOpeC = false ;
      A4991BarTroOpeC = 999999 ;
      n4991BarTroOpeC = false ;
      Z3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      A3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      i3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      AV39Pgmname = "TTrn26" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z197BarPConTro ;
   private short O197BarPConTro ;
   private short Z3858BarTroCod ;
   private short Z3861BarTroAnc ;
   private short Z12840BarTroCarr ;
   private short O12840BarTroCarr ;
   private short O3861BarTroAnc ;
   private short nRcdDeleted_531 ;
   private short nRcdExists_531 ;
   private short nIsMod_531 ;
   private short A3858BarTroCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A197BarPConTro ;
   private short nBlankRcdCount531 ;
   private short RcdFound531 ;
   private short B197BarPConTro ;
   private short nBlankRcdUsr531 ;
   private short AV36oldAnc ;
   private short AV37oldNcarro ;
   private short s197BarPConTro ;
   private short A3861BarTroAnc ;
   private short A12840BarTroCarr ;
   private short T12840BarTroCarr ;
   private short T3861BarTroAnc ;
   private short RcdFound18 ;
   private short nIsDirty_18 ;
   private short nIsDirty_531 ;
   private short i197BarPConTro ;
   private short ZZ197BarPConTro ;
   private short ZO197BarPConTro ;
   private short ZV36oldAnc ;
   private short ZV37oldNcarro ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z44AlbRecCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z4991BarTroOpeC ;
   private int A129BarCod ;
   private int A4991BarTroOpeC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int edtavnRcdDeleted_531_Enabled ;
   private int edtBarTroCod_Enabled ;
   private int edtBarTroFec_Enabled ;
   private int edtBarTroMet_Enabled ;
   private int edtBarTroKil_Enabled ;
   private int edtBarTroAnc_Enabled ;
   private int edtBarTroCarr_Enabled ;
   private int edtBarTroOpeC_Enabled ;
   private int edtBarTroObs_Enabled ;
   private int edtBarTroOb_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A44AlbRecCod ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarTroCod_Enabled ;
   private int i4991BarTroOpeC ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarPConTro_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ44AlbRecCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3860BarTroMet ;
   private java.math.BigDecimal Z6556BarTroKil ;
   private java.math.BigDecimal O6556BarTroKil ;
   private java.math.BigDecimal O3860BarTroMet ;
   private java.math.BigDecimal AV34oldMts ;
   private java.math.BigDecimal AV35oldKgs ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A6556BarTroKil ;
   private java.math.BigDecimal T6556BarTroKil ;
   private java.math.BigDecimal T3860BarTroMet ;
   private java.math.BigDecimal ZV34oldMts ;
   private java.math.BigDecimal ZV35oldKgs ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA200BarPieCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z13231BarTroOb ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV39Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarPieCod_Internalname ;
   private String edtBarPieCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarPConTro_Internalname ;
   private String edtBarPConTro_Jsonclick ;
   private String sMode531 ;
   private String edtavnRcdDeleted_531_Internalname ;
   private String edtBarTroCod_Internalname ;
   private String edtBarTroFec_Internalname ;
   private String edtBarTroMet_Internalname ;
   private String edtBarTroKil_Internalname ;
   private String edtBarTroAnc_Internalname ;
   private String edtBarTroCarr_Internalname ;
   private String edtBarTroOpeC_Internalname ;
   private String edtBarTroObs_Internalname ;
   private String edtBarTroOb_Internalname ;
   private String GX_FocusControl ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode18 ;
   private String GXCCtl ;
   private String A13231BarTroOb ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String Z407EmprNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_531_Jsonclick ;
   private String edtBarTroCod_Jsonclick ;
   private String edtBarTroFec_Jsonclick ;
   private String edtBarTroMet_Jsonclick ;
   private String edtBarTroKil_Jsonclick ;
   private String edtBarTroAnc_Jsonclick ;
   private String edtBarTroCarr_Jsonclick ;
   private String edtBarTroOpeC_Jsonclick ;
   private String edtBarTroObs_Jsonclick ;
   private String edtBarTroOb_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z3859BarTroFec ;
   private java.util.Date A3859BarTroFec ;
   private java.util.Date i3859BarTroFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4991BarTroOpeC ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3859BarTroFec ;
   private boolean n5623BarTroObs ;
   private boolean n3860BarTroMet ;
   private boolean n6556BarTroKil ;
   private boolean n3861BarTroAnc ;
   private boolean n12840BarTroCarr ;
   private boolean n13231BarTroOb ;
   private boolean Gx_longc ;
   private String A5623BarTroObs ;
   private String Z5623BarTroObs ;
   private String AV33Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01MH7_A407EmprNom ;
   private boolean[] T01MH7_n407EmprNom ;
   private String[] T01MH8_A396EmprCod ;
   private String[] T01MH9_A200BarPieCod ;
   private String[] T01MH9_A407EmprNom ;
   private boolean[] T01MH9_n407EmprNom ;
   private short[] T01MH9_A197BarPConTro ;
   private String[] T01MH9_A396EmprCod ;
   private int[] T01MH9_A44AlbRecCod ;
   private int[] T01MH9_A129BarCod ;
   private byte[] T01MH9_A132BarCodReo ;
   private String[] T01MH9_A130BarCodPar ;
   private String[] T01MH10_A396EmprCod ;
   private int[] T01MH10_A129BarCod ;
   private byte[] T01MH10_A132BarCodReo ;
   private String[] T01MH10_A130BarCodPar ;
   private String[] T01MH10_A200BarPieCod ;
   private String[] T01MH6_A200BarPieCod ;
   private short[] T01MH6_A197BarPConTro ;
   private String[] T01MH6_A396EmprCod ;
   private int[] T01MH6_A44AlbRecCod ;
   private int[] T01MH6_A129BarCod ;
   private byte[] T01MH6_A132BarCodReo ;
   private String[] T01MH6_A130BarCodPar ;
   private String[] T01MH11_A396EmprCod ;
   private int[] T01MH11_A129BarCod ;
   private byte[] T01MH11_A132BarCodReo ;
   private String[] T01MH11_A130BarCodPar ;
   private String[] T01MH11_A200BarPieCod ;
   private String[] T01MH12_A396EmprCod ;
   private int[] T01MH12_A129BarCod ;
   private byte[] T01MH12_A132BarCodReo ;
   private String[] T01MH12_A130BarCodPar ;
   private String[] T01MH12_A200BarPieCod ;
   private String[] T01MH5_A200BarPieCod ;
   private short[] T01MH5_A197BarPConTro ;
   private String[] T01MH5_A396EmprCod ;
   private int[] T01MH5_A44AlbRecCod ;
   private int[] T01MH5_A129BarCod ;
   private byte[] T01MH5_A132BarCodReo ;
   private String[] T01MH5_A130BarCodPar ;
   private String[] T01MH16_A396EmprCod ;
   private int[] T01MH16_A129BarCod ;
   private byte[] T01MH16_A132BarCodReo ;
   private String[] T01MH16_A130BarCodPar ;
   private String[] T01MH16_A200BarPieCod ;
   private short[] T01MH16_A12913BarPieLDf ;
   private String[] T01MH17_A396EmprCod ;
   private int[] T01MH17_A129BarCod ;
   private byte[] T01MH17_A132BarCodReo ;
   private String[] T01MH17_A130BarCodPar ;
   private String[] T01MH17_A200BarPieCod ;
   private short[] T01MH17_A3858BarTroCod ;
   private short[] T01MH17_A4993BarTroDef ;
   private String[] T01MH18_A396EmprCod ;
   private long[] T01MH18_A30AlbProCod ;
   private int[] T01MH18_A129BarCod ;
   private byte[] T01MH18_A132BarCodReo ;
   private String[] T01MH18_A130BarCodPar ;
   private String[] T01MH18_A200BarPieCod ;
   private String[] T01MH20_A396EmprCod ;
   private int[] T01MH20_A129BarCod ;
   private byte[] T01MH20_A132BarCodReo ;
   private String[] T01MH20_A130BarCodPar ;
   private String[] T01MH20_A200BarPieCod ;
   private String[] T01MH21_A5623BarTroObs ;
   private boolean[] T01MH21_n5623BarTroObs ;
   private int[] T01MH21_A129BarCod ;
   private byte[] T01MH21_A132BarCodReo ;
   private String[] T01MH21_A130BarCodPar ;
   private String[] T01MH21_A200BarPieCod ;
   private short[] T01MH21_A3858BarTroCod ;
   private java.util.Date[] T01MH21_A3859BarTroFec ;
   private boolean[] T01MH21_n3859BarTroFec ;
   private java.math.BigDecimal[] T01MH21_A3860BarTroMet ;
   private boolean[] T01MH21_n3860BarTroMet ;
   private java.math.BigDecimal[] T01MH21_A6556BarTroKil ;
   private boolean[] T01MH21_n6556BarTroKil ;
   private short[] T01MH21_A3861BarTroAnc ;
   private boolean[] T01MH21_n3861BarTroAnc ;
   private short[] T01MH21_A12840BarTroCarr ;
   private boolean[] T01MH21_n12840BarTroCarr ;
   private String[] T01MH21_A13231BarTroOb ;
   private boolean[] T01MH21_n13231BarTroOb ;
   private String[] T01MH21_A396EmprCod ;
   private int[] T01MH21_A4991BarTroOpeC ;
   private boolean[] T01MH21_n4991BarTroOpeC ;
   private String[] T01MH4_A396EmprCod ;
   private String[] T01MH22_A396EmprCod ;
   private String[] T01MH23_A396EmprCod ;
   private int[] T01MH23_A129BarCod ;
   private byte[] T01MH23_A132BarCodReo ;
   private String[] T01MH23_A130BarCodPar ;
   private String[] T01MH23_A200BarPieCod ;
   private short[] T01MH23_A3858BarTroCod ;
   private String[] T01MH3_A5623BarTroObs ;
   private boolean[] T01MH3_n5623BarTroObs ;
   private int[] T01MH3_A129BarCod ;
   private byte[] T01MH3_A132BarCodReo ;
   private String[] T01MH3_A130BarCodPar ;
   private String[] T01MH3_A200BarPieCod ;
   private short[] T01MH3_A3858BarTroCod ;
   private java.util.Date[] T01MH3_A3859BarTroFec ;
   private boolean[] T01MH3_n3859BarTroFec ;
   private java.math.BigDecimal[] T01MH3_A3860BarTroMet ;
   private boolean[] T01MH3_n3860BarTroMet ;
   private java.math.BigDecimal[] T01MH3_A6556BarTroKil ;
   private boolean[] T01MH3_n6556BarTroKil ;
   private short[] T01MH3_A3861BarTroAnc ;
   private boolean[] T01MH3_n3861BarTroAnc ;
   private short[] T01MH3_A12840BarTroCarr ;
   private boolean[] T01MH3_n12840BarTroCarr ;
   private String[] T01MH3_A13231BarTroOb ;
   private boolean[] T01MH3_n13231BarTroOb ;
   private String[] T01MH3_A396EmprCod ;
   private int[] T01MH3_A4991BarTroOpeC ;
   private boolean[] T01MH3_n4991BarTroOpeC ;
   private String[] T01MH2_A5623BarTroObs ;
   private boolean[] T01MH2_n5623BarTroObs ;
   private int[] T01MH2_A129BarCod ;
   private byte[] T01MH2_A132BarCodReo ;
   private String[] T01MH2_A130BarCodPar ;
   private String[] T01MH2_A200BarPieCod ;
   private short[] T01MH2_A3858BarTroCod ;
   private java.util.Date[] T01MH2_A3859BarTroFec ;
   private boolean[] T01MH2_n3859BarTroFec ;
   private java.math.BigDecimal[] T01MH2_A3860BarTroMet ;
   private boolean[] T01MH2_n3860BarTroMet ;
   private java.math.BigDecimal[] T01MH2_A6556BarTroKil ;
   private boolean[] T01MH2_n6556BarTroKil ;
   private short[] T01MH2_A3861BarTroAnc ;
   private boolean[] T01MH2_n3861BarTroAnc ;
   private short[] T01MH2_A12840BarTroCarr ;
   private boolean[] T01MH2_n12840BarTroCarr ;
   private String[] T01MH2_A13231BarTroOb ;
   private boolean[] T01MH2_n13231BarTroOb ;
   private String[] T01MH2_A396EmprCod ;
   private int[] T01MH2_A4991BarTroOpeC ;
   private boolean[] T01MH2_n4991BarTroOpeC ;
   private String[] T01MH27_A396EmprCod ;
   private int[] T01MH27_A129BarCod ;
   private byte[] T01MH27_A132BarCodReo ;
   private String[] T01MH27_A130BarCodPar ;
   private String[] T01MH27_A200BarPieCod ;
   private short[] T01MH27_A3858BarTroCod ;
   private short[] T01MH27_A12649TRDefcod ;
   private String[] T01MH27_A12650TRFasCod ;
   private String[] T01MH28_A396EmprCod ;
   private int[] T01MH28_A129BarCod ;
   private byte[] T01MH28_A132BarCodReo ;
   private String[] T01MH28_A130BarCodPar ;
   private String[] T01MH28_A200BarPieCod ;
   private short[] T01MH28_A3858BarTroCod ;
   private short[] T01MH28_A4993BarTroDef ;
   private String[] T01MH29_A396EmprCod ;
   private int[] T01MH29_A129BarCod ;
   private byte[] T01MH29_A132BarCodReo ;
   private String[] T01MH29_A130BarCodPar ;
   private String[] T01MH29_A200BarPieCod ;
   private short[] T01MH29_A3858BarTroCod ;
   private String[] T01MH30_A407EmprNom ;
   private boolean[] T01MH30_n407EmprNom ;
   private String[] T01MH31_A396EmprCod ;
   private String[] T01MH32_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn26__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn26__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn26__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn26__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn26__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01MH2", "SELECT BarTroObs, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroFec, BarTroMet, BarTroKil, BarTroAnc, BarTroCarr, BarTroOb, EmprCod, BarTroOpeC FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?  FOR UPDATE OF BarTroFec, BarTroMet, BarTroKil, BarTroAnc, BarTroCarr, BarTroObs, BarTroOb, BarTroOpeC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH3", "SELECT BarTroObs, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroFec, BarTroMet, BarTroKil, BarTroAnc, BarTroCarr, BarTroOb, EmprCod, BarTroOpeC FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH4", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH5", "SELECT BarPieCod, BarPConTro, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPConTro, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH6", "SELECT BarPieCod, BarPConTro, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH9", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarPieCod, T2.EmprNom, TM1.BarPConTro, TM1.EmprCod, TM1.AlbRecCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPBARPIE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MH13", "INSERT INTO TXPBARPIE(BarPieCod, BarPConTro, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01MH14", "UPDATE TXPBARPIE SET BarPConTro=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01MH15", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01MH16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH17", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH18", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MH19", "UPDATE TXPBARPIE SET BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01MH20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH21", "SELECT BarTroObs, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroFec, BarTroMet, BarTroKil, BarTroAnc, BarTroCarr, BarTroOb, EmprCod, BarTroOpeC FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH22", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH23", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01MH24", "INSERT INTO TXPBARTRO(BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroFec, BarTroMet, BarTroKil, BarTroAnc, BarTroCarr, BarTroObs, BarTroOb, EmprCod, BarTroOpeC, BarTroIden, AlbTar, BarTroFinP, BarTroEst, BarTroCal, BarTroUltD, BarTroJau, BarTroHor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T01MH25", "UPDATE TXPBARTRO SET BarTroFec=?, BarTroMet=?, BarTroKil=?, BarTroAnc=?, BarTroCarr=?, BarTroObs=?, BarTroOb=?, BarTroOpeC=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T01MH26", "DELETE FROM TXPBARTRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new ForEachCursor("T01MH27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, TRDefcod, TRFasCod FROM TXPPZTRD0 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MH29", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH30", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH31", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MH32", "SELECT EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 9);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 9);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 9);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
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
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 9);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(11, (String)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 100);
               }
               stmt.setString(13, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[21]).intValue());
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
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
                  stmt.setNull( 6 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(6, (String)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 100);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setString(13, (String)parms[20], 9);
               stmt.setShort(14, ((Number) parms[21]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

