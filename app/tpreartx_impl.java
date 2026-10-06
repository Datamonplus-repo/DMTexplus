package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpreartx_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DISFASDTOL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadisfasdtol1AR39( A396EmprCod, A361DisCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DISFASPREL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadisfasprel1AR39( A396EmprCod, A361DisCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"DISFASPRMA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A335DisArtCod = httpContext.GetPar( "DisArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A362DisColNom = httpContext.GetPar( "DisColNom") ;
         n362DisColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A363DisColNum = (int)(GXutil.lval( httpContext.GetPar( "DisColNum"))) ;
         n363DisColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A390DisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "DisTipCol"))) ;
         n390DisTipCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A456FasActTin = httpContext.GetPar( "FasActTin") ;
         n456FasActTin = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asadisfasprma1AR39( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, A456FasActTin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"DISFASPRMI") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A335DisArtCod = httpContext.GetPar( "DisArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A362DisColNom = httpContext.GetPar( "DisColNom") ;
         n362DisColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A363DisColNum = (int)(GXutil.lval( httpContext.GetPar( "DisColNum"))) ;
         n363DisColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A390DisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "DisTipCol"))) ;
         n390DisTipCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A456FasActTin = httpContext.GetPar( "FasActTin") ;
         n456FasActTin = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asadisfasprmi1AR39( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, A456FasActTin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A457FasCod) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            AV16UsurCod = httpContext.GetPar( "UsurCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INSERTA FASE", ""), (short)(0)) ;
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

   public tpreartx_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpreartx_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpreartx_impl.class ));
   }

   public tpreartx_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPriCod = UIFactory.getCheckbox(this);
      cmbDisFasUni = new HTMLChoice();
      chkFasPreObl = UIFactory.getCheckbox(this);
      chkDisFasAut = UIFactory.getCheckbox(this);
      chkDisFasPrOk = UIFactory.getCheckbox(this);
      chkDisFasPrLs = UIFactory.getCheckbox(this);
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
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPREARTX.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtDisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Articulo Disposicion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Prioridad", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPriCod.getInternalname(), A757PriCod, "", "", 1, chkPriCod.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREARTX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREARTX.htm");
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
         nBlankRcdCount39 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_39 = (short)(1) ;
            scanStart1AR39( ) ;
            while ( RcdFound39 != 0 )
            {
               init_level_properties39( ) ;
               getByPrimaryKey1AR39( ) ;
               addRow1AR39( ) ;
               scanNext1AR39( ) ;
            }
            scanEnd1AR39( ) ;
            nBlankRcdCount39 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AR39( ) ;
         standaloneModal1AR39( ) ;
         sMode39 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1AR39( ) ;
            edtavnRcdDeleted_39_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_39_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_39_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_39_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPre_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            cmbDisFasUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASUNI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbDisFasUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisFasUni.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDto_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASREC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasRec_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            chkFasPreObl.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreObl.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
            chkDisFasAut.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASAUT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasAut.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasPrMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasPrMa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMa_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasPreL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPREL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPreL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPreL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDisFasDtoL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTOL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasDtoL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDtoL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            chkDisFasPrOk.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPROK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrOk.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
            chkDisFasPrLs.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRLS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrLs.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_39 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AR39( ) ;
            }
            sendRow1AR39( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount39 = (short)(5) ;
         nRcdExists_39 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AR39( ) ;
            while ( RcdFound39 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_8039( ) ;
               init_level_properties39( ) ;
               standaloneNotModal1AR39( ) ;
               getByPrimaryKey1AR39( ) ;
               standaloneModal1AR39( ) ;
               addRow1AR39( ) ;
               scanNext1AR39( ) ;
            }
            scanEnd1AR39( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode39 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_8039( ) ;
      initAll1AR39( ) ;
      init_level_properties39( ) ;
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
      nBlankRcdCount39 = (short)(nBlankRcdUsr39+nBlankRcdCount39) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount39 > 0 )
      {
         standaloneNotModal1AR39( ) ;
         standaloneModal1AR39( ) ;
         addRow1AR39( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisFasLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount39 = (short)(nBlankRcdCount39-1) ;
      }
      Gx_mode = sMode39 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREARTX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPREARTX.htm");
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
      e111AR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n390DisTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
            A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
            n362DisColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
            A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n363DisColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
            A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
            httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                        e111AR2 ();
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
            initAll1AR38( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_39_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_39_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes1AR38( ) ;
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

   public void confirm_1AR0( )
   {
      beforeValidate1AR38( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AR38( ) ;
         }
         else
         {
            checkExtendedTable1AR38( ) ;
            if ( AnyError == 0 )
            {
               zm1AR38( 9) ;
               zm1AR38( 10) ;
               zm1AR38( 11) ;
               zm1AR38( 12) ;
            }
            closeExtendedTableCursors1AR38( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode38 = Gx_mode ;
         confirm_1AR39( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode38 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AR0( ) ;
      }
   }

   public void confirm_1AR39( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1AR39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            getKey1AR39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AR39( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AR39( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1AR39( 14) ;
                     }
                     closeExtendedTableCursors1AR39( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISFASLIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisFasLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( nRcdDeleted_39 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AR39( ) ;
                     load1AR39( ) ;
                     beforeValidate1AR39( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AR39( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AR39( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AR39( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1AR39( 14) ;
                           }
                           closeExtendedTableCursors1AR39( ) ;
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
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_39_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtDisFasPre_Internalname, GXutil.ltrim( localUtil.ntoc( A7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbDisFasUni.getInternalname(), GXutil.rtrim( A7741DisFasUni)) ;
         httpContext.changePostValue( edtDisFasDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7742DisFasDto, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasRec_Internalname, GXutil.ltrim( localUtil.ntoc( A7743DisFasRec, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkFasPreObl.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisFasAut.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasPrMi_Internalname, GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasPrMa_Internalname, GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasPreL_Internalname, GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(7), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasDtoL_Internalname, GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisFasPrOk.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisFasPrLs.getInternalname(), GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7740DisFasPre_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7741DisFasUni_"+sGXsfl_80_idx, GXutil.rtrim( Z7741DisFasUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7742DisFasDto_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7742DisFasDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7743DisFasRec_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7743DisFasRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7747DisFasAut_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_80_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_39_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_39_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_39_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_39_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASREC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREOBL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASAUT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPREL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTOL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPROK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRLS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AR0( )
   {
   }

   public void e111AR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV57Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV58EmprNom ;
      GXv_char3[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char1, GXv_char2, GXv_char3) ;
      tpreartx_impl.this.A396EmprCod = GXv_char1[0] ;
      tpreartx_impl.this.AV58EmprNom = GXv_char2[0] ;
      tpreartx_impl.this.AV16UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV58EmprNom", AV58EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
   }

   public void zm1AR38( int GX_JID )
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
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z362DisColNom = A362DisColNom ;
         Z335DisArtCod = A335DisArtCod ;
         Z363DisColNum = A363DisColNum ;
         Z757PriCod = A757PriCod ;
         Z390DisTipCol = A390DisTipCol ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01AR7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AR7_A407EmprNom[0] ;
      n407EmprNom = T01AR7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01AR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A362DisColNom = T01AR8_A362DisColNom[0] ;
      n362DisColNom = T01AR8_n362DisColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      A335DisArtCod = T01AR8_A335DisArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A363DisColNum = T01AR8_A363DisColNum[0] ;
      n363DisColNum = T01AR8_n363DisColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      A757PriCod = T01AR8_A757PriCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      A390DisTipCol = T01AR8_A390DisTipCol[0] ;
      n390DisTipCol = T01AR8_n390DisTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A252CliCod = T01AR8_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(6);
      /* Using cursor T01AR10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AR10_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(8);
      /* Using cursor T01AR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01AR9_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(7);
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

   public void load1AR38( )
   {
      /* Using cursor T01AR11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A407EmprNom = T01AR11_A407EmprNom[0] ;
         n407EmprNom = T01AR11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T01AR11_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A362DisColNom = T01AR11_A362DisColNom[0] ;
         n362DisColNom = T01AR11_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A335DisArtCod = T01AR11_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A363DisColNum = T01AR11_A363DisColNum[0] ;
         n363DisColNum = T01AR11_n363DisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A757PriCod = T01AR11_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A279CliNom = T01AR11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A390DisTipCol = T01AR11_A390DisTipCol[0] ;
         n390DisTipCol = T01AR11_n390DisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A252CliCod = T01AR11_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1AR38( -8) ;
      }
      pr_default.close(9);
      onLoadActions1AR38( ) ;
   }

   public void onLoadActions1AR38( )
   {
   }

   public void checkExtendedTable1AR38( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1AR38( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1AR38( )
   {
      /* Using cursor T01AR12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01AR6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AR6_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AR6_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm1AR38( 8) ;
         RcdFound38 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AR38( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1AR38( ) ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1AR38( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1AR38( ) ;
      if ( RcdFound38 == 0 )
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
      RcdFound38 = (short)(0) ;
      /* Using cursor T01AR13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01AR13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AR13_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AR13_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01AR13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AR13_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AR13_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T01AR14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01AR14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AR14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AR14_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01AR14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AR14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AR14_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AR38( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1AR38( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound38 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1AR38( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1AR38( ) ;
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
                  insert1AR38( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
      getKey1AR38( ) ;
      if ( RcdFound38 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpreartx");
   }

   public void insert_check( )
   {
      confirm_1AR0( ) ;
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
      if ( RcdFound38 == 0 )
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
      scanStart1AR38( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AR38( ) ;
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
      if ( RcdFound38 == 0 )
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
      if ( RcdFound38 == 0 )
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
      scanStart1AR38( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound38 != 0 )
         {
            scanNext1AR38( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AR38( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AR38( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AR5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AR38( )
   {
      beforeValidate1AR38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AR38( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AR38( 0) ;
         checkOptimisticConcurrency1AR38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AR38( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AR38( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AR15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
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
                        processLevel1AR38( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AR0( ) ;
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
            load1AR38( ) ;
         }
         endLevel1AR38( ) ;
      }
      closeExtendedTableCursors1AR38( ) ;
   }

   public void update1AR38( )
   {
      beforeValidate1AR38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AR38( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AR38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AR38( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AR38( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISLIN */
                  deferredUpdate1AR38( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AR38( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AR0( ) ;
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
         endLevel1AR38( ) ;
      }
      closeExtendedTableCursors1AR38( ) ;
   }

   public void deferredUpdate1AR38( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AR38( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AR38( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AR38( ) ;
         afterConfirm1AR38( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AR38( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AR39( ) ;
               while ( RcdFound39 != 0 )
               {
                  getByPrimaryKey1AR39( ) ;
                  delete1AR39( ) ;
                  scanNext1AR39( ) ;
               }
               scanEnd1AR39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AR16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound38 == 0 )
                        {
                           initAll1AR38( ) ;
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
                        resetCaption1AR0( ) ;
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
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AR38( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AR38( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01AR17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1AR39( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1AR39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            standaloneNotModal1AR39( ) ;
            getKey1AR39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AR39( ) ;
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( ( nRcdDeleted_39 != 0 ) && ( nRcdExists_39 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AR39( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AR39( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_39_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtDisFasPre_Internalname, GXutil.ltrim( localUtil.ntoc( A7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbDisFasUni.getInternalname(), GXutil.rtrim( A7741DisFasUni)) ;
         httpContext.changePostValue( edtDisFasDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7742DisFasDto, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasRec_Internalname, GXutil.ltrim( localUtil.ntoc( A7743DisFasRec, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkFasPreObl.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisFasAut.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasPrMi_Internalname, GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasPrMa_Internalname, GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasPreL_Internalname, GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(7), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasDtoL_Internalname, GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisFasPrOk.getInternalname(), GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisFasPrLs.getInternalname(), GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7740DisFasPre_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7741DisFasUni_"+sGXsfl_80_idx, GXutil.rtrim( Z7741DisFasUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7742DisFasDto_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7742DisFasDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7743DisFasRec_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7743DisFasRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7747DisFasAut_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_80_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_39_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_39_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_39_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_39_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASREC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREOBL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASAUT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPREL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTOL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPROK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRLS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AR39( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
   }

   public void processLevel1AR38( )
   {
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      processNestedLevel1AR39( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AR38( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AR38( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpreartx");
         if ( AnyError == 0 )
         {
            confirmValues1AR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpreartx");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AR38( )
   {
      /* Scan By routine */
      /* Using cursor T01AR18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AR38( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
   }

   public void scanEnd1AR38( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1AR38( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AR38( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AR38( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AR38( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AR38( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AR38( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AR38( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtDisTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCol_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Enabled), 5, 0), true);
      chkPriCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "Enabled", GXutil.ltrimstr( chkPriCod.getEnabled(), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1AR39( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7740DisFasPre = T01AR3_A7740DisFasPre[0] ;
            Z7741DisFasUni = T01AR3_A7741DisFasUni[0] ;
            Z7742DisFasDto = T01AR3_A7742DisFasDto[0] ;
            Z7743DisFasRec = T01AR3_A7743DisFasRec[0] ;
            Z7747DisFasAut = T01AR3_A7747DisFasAut[0] ;
            Z457FasCod = T01AR3_A457FasCod[0] ;
         }
         else
         {
            Z7740DisFasPre = A7740DisFasPre ;
            Z7741DisFasUni = A7741DisFasUni ;
            Z7742DisFasDto = A7742DisFasDto ;
            Z7743DisFasRec = A7743DisFasRec ;
            Z7747DisFasAut = A7747DisFasAut ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z7740DisFasPre = A7740DisFasPre ;
         Z7741DisFasUni = A7741DisFasUni ;
         Z7742DisFasDto = A7742DisFasDto ;
         Z7743DisFasRec = A7743DisFasRec ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z7747DisFasAut = A7747DisFasAut ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z456FasActTin = A456FasActTin ;
      }
   }

   public void standaloneNotModal1AR39( )
   {
   }

   public void standaloneModal1AR39( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtDisFasLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1AR39( )
   {
      /* Using cursor T01AR19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A460FasDsc = T01AR19_A460FasDsc[0] ;
         A456FasActTin = T01AR19_A456FasActTin[0] ;
         n456FasActTin = T01AR19_n456FasActTin[0] ;
         A7740DisFasPre = T01AR19_A7740DisFasPre[0] ;
         n7740DisFasPre = T01AR19_n7740DisFasPre[0] ;
         A7741DisFasUni = T01AR19_A7741DisFasUni[0] ;
         n7741DisFasUni = T01AR19_n7741DisFasUni[0] ;
         A7742DisFasDto = T01AR19_A7742DisFasDto[0] ;
         n7742DisFasDto = T01AR19_n7742DisFasDto[0] ;
         A7743DisFasRec = T01AR19_A7743DisFasRec[0] ;
         n7743DisFasRec = T01AR19_n7743DisFasRec[0] ;
         A7744FasPreObl = T01AR19_A7744FasPreObl[0] ;
         n7744FasPreObl = T01AR19_n7744FasPreObl[0] ;
         A7747DisFasAut = T01AR19_A7747DisFasAut[0] ;
         n7747DisFasAut = T01AR19_n7747DisFasAut[0] ;
         A457FasCod = T01AR19_A457FasCod[0] ;
         zm1AR39( -13) ;
      }
      pr_default.close(17);
      onLoadActions1AR39( ) ;
   }

   public void onLoadActions1AR39( )
   {
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int5[0] = A361DisCod ;
      GXv_char2[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char1[0] = "D" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char2, GXv_int6, GXv_char1, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char3[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int5[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char2[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int4) ;
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int5[0] = A361DisCod ;
      GXv_char2[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char1[0] = "P" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char2, GXv_int6, GXv_char1, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char3[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int5[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char2[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int4) ;
      if ( A8509DisFasPreL.doubleValue() > 0 )
      {
         A8508DisFasPrLs = (byte)(1) ;
      }
      else
      {
         if ( A8509DisFasPreL.doubleValue() == 0 )
         {
            A8508DisFasPrLs = (byte)(0) ;
         }
         else
         {
            A8508DisFasPrLs = (byte)(0) ;
         }
      }
      GXt_decimal8 = A7746DisFasPrMa ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int5[0] = A252CliCod ;
      GXv_char2[0] = A335DisArtCod ;
      GXv_char1[0] = A362DisColNom ;
      GXv_int9[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char11[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char2, GXv_char1, GXv_int9, GXv_int10, GXv_char11, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char3[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int5[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char2[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char1[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int9[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char11[0] ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A7746DisFasPrMa = GXt_decimal8 ;
      GXt_decimal8 = A7745DisFasPrMi ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A7745DisFasPrMi = GXt_decimal8 ;
      if ( ( ( DecimalUtil.compareTo(A7740DisFasPre, A7745DisFasPrMi) < 0 ) && ( GXutil.strcmp(A456FasActTin, "S") == 0 ) ) && ( A7747DisFasAut == 0 ) && ( A8508DisFasPrLs == 0 ) )
      {
         A7748DisFasPrOk = (byte)(1) ;
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A7740DisFasPre, A7746DisFasPrMa) > 0 ) && ( GXutil.strcmp(A456FasActTin, "S") == 0 ) ) && ( A7747DisFasAut == 0 ) && ( A8508DisFasPrLs == 0 ) )
         {
            A7748DisFasPrOk = (byte)(1) ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A7740DisFasPre, A8509DisFasPreL) != 0 ) && ( A8508DisFasPrLs == 1 ) && ( A7747DisFasAut == 0 ) )
            {
               A7748DisFasPrOk = (byte)(1) ;
            }
            else
            {
               if ( ( ( A7744FasPreObl == 1 ) && ( A7740DisFasPre.doubleValue() == 0 ) ) && ( A7747DisFasAut == 0 ) )
               {
                  A7748DisFasPrOk = (byte)(1) ;
               }
               else
               {
                  A7748DisFasPrOk = (byte)(0) ;
               }
            }
         }
      }
   }

   public void checkExtendedTable1AR39( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AR39( ) ;
      /* Using cursor T01AR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01AR4_A460FasDsc[0] ;
      A456FasActTin = T01AR4_A456FasActTin[0] ;
      n456FasActTin = T01AR4_n456FasActTin[0] ;
      A7744FasPreObl = T01AR4_A7744FasPreObl[0] ;
      n7744FasPreObl = T01AR4_n7744FasPreObl[0] ;
      pr_default.close(2);
      nIsDirty_39 = (short)(1) ;
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char2[0] = "D" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int4) ;
      nIsDirty_39 = (short)(1) ;
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char2[0] = "P" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int4) ;
      if ( A8509DisFasPreL.doubleValue() > 0 )
      {
         nIsDirty_39 = (short)(1) ;
         A8508DisFasPrLs = (byte)(1) ;
      }
      else
      {
         if ( A8509DisFasPreL.doubleValue() == 0 )
         {
            nIsDirty_39 = (short)(1) ;
            A8508DisFasPrLs = (byte)(0) ;
         }
         else
         {
            nIsDirty_39 = (short)(1) ;
            A8508DisFasPrLs = (byte)(0) ;
         }
      }
      nIsDirty_39 = (short)(1) ;
      GXt_decimal8 = A7746DisFasPrMa ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A7746DisFasPrMa = GXt_decimal8 ;
      nIsDirty_39 = (short)(1) ;
      GXt_decimal8 = A7745DisFasPrMi ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A7745DisFasPrMi = GXt_decimal8 ;
      if ( ( ( DecimalUtil.compareTo(A7740DisFasPre, A7745DisFasPrMi) < 0 ) && ( GXutil.strcmp(A456FasActTin, "S") == 0 ) ) && ( A7747DisFasAut == 0 ) && ( A8508DisFasPrLs == 0 ) )
      {
         nIsDirty_39 = (short)(1) ;
         A7748DisFasPrOk = (byte)(1) ;
      }
      else
      {
         if ( ( ( DecimalUtil.compareTo(A7740DisFasPre, A7746DisFasPrMa) > 0 ) && ( GXutil.strcmp(A456FasActTin, "S") == 0 ) ) && ( A7747DisFasAut == 0 ) && ( A8508DisFasPrLs == 0 ) )
         {
            nIsDirty_39 = (short)(1) ;
            A7748DisFasPrOk = (byte)(1) ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo(A7740DisFasPre, A8509DisFasPreL) != 0 ) && ( A8508DisFasPrLs == 1 ) && ( A7747DisFasAut == 0 ) )
            {
               nIsDirty_39 = (short)(1) ;
               A7748DisFasPrOk = (byte)(1) ;
            }
            else
            {
               if ( ( ( A7744FasPreObl == 1 ) && ( A7740DisFasPre.doubleValue() == 0 ) ) && ( A7747DisFasAut == 0 ) )
               {
                  nIsDirty_39 = (short)(1) ;
                  A7748DisFasPrOk = (byte)(1) ;
               }
               else
               {
                  nIsDirty_39 = (short)(1) ;
                  A7748DisFasPrOk = (byte)(0) ;
               }
            }
         }
      }
      if ( ! ( ( GXutil.strcmp(A7741DisFasUni, "K") == 0 ) || ( GXutil.strcmp(A7741DisFasUni, "M") == 0 ) || ( GXutil.strcmp(A7741DisFasUni, "F") == 0 ) || ( GXutil.strcmp(A7741DisFasUni, "C") == 0 ) ) )
      {
         GXCCtl = "DISFASUNI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbDisFasUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AR39( )
   {
      pr_default.close(2);
   }

   public void enableDisable1AR39( )
   {
   }

   public void gxload_14( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01AR20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01AR20_A460FasDsc[0] ;
      A456FasActTin = T01AR20_A456FasActTin[0] ;
      n456FasActTin = T01AR20_n456FasActTin[0] ;
      A7744FasPreObl = T01AR20_A7744FasPreObl[0] ;
      n7744FasPreObl = T01AR20_n7744FasPreObl[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1AR39( )
   {
      /* Using cursor T01AR21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1AR39( )
   {
      /* Using cursor T01AR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01AR3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AR3_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01AR3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AR39( 13) ;
         RcdFound39 = (short)(1) ;
         initializeNonKey1AR39( ) ;
         A368DisFasLin = T01AR3_A368DisFasLin[0] ;
         A7740DisFasPre = T01AR3_A7740DisFasPre[0] ;
         n7740DisFasPre = T01AR3_n7740DisFasPre[0] ;
         A7741DisFasUni = T01AR3_A7741DisFasUni[0] ;
         n7741DisFasUni = T01AR3_n7741DisFasUni[0] ;
         A7742DisFasDto = T01AR3_A7742DisFasDto[0] ;
         n7742DisFasDto = T01AR3_n7742DisFasDto[0] ;
         A7743DisFasRec = T01AR3_A7743DisFasRec[0] ;
         n7743DisFasRec = T01AR3_n7743DisFasRec[0] ;
         A7747DisFasAut = T01AR3_A7747DisFasAut[0] ;
         n7747DisFasAut = T01AR3_n7747DisFasAut[0] ;
         A457FasCod = T01AR3_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AR39( ) ;
         load1AR39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1AR39( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AR39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AR39( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AR39( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7740DisFasPre, T01AR2_A7740DisFasPre[0]) != 0 ) || ( GXutil.strcmp(Z7741DisFasUni, T01AR2_A7741DisFasUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z7742DisFasDto, T01AR2_A7742DisFasDto[0]) != 0 ) || ( DecimalUtil.compareTo(Z7743DisFasRec, T01AR2_A7743DisFasRec[0]) != 0 ) || ( Z7747DisFasAut != T01AR2_A7747DisFasAut[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z457FasCod, T01AR2_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7740DisFasPre, T01AR2_A7740DisFasPre[0]) != 0 )
            {
               GXutil.writeLogln("tpreartx:[seudo value changed for attri]"+"DisFasPre");
               GXutil.writeLogRaw("Old: ",Z7740DisFasPre);
               GXutil.writeLogRaw("Current: ",T01AR2_A7740DisFasPre[0]);
            }
            if ( GXutil.strcmp(Z7741DisFasUni, T01AR2_A7741DisFasUni[0]) != 0 )
            {
               GXutil.writeLogln("tpreartx:[seudo value changed for attri]"+"DisFasUni");
               GXutil.writeLogRaw("Old: ",Z7741DisFasUni);
               GXutil.writeLogRaw("Current: ",T01AR2_A7741DisFasUni[0]);
            }
            if ( DecimalUtil.compareTo(Z7742DisFasDto, T01AR2_A7742DisFasDto[0]) != 0 )
            {
               GXutil.writeLogln("tpreartx:[seudo value changed for attri]"+"DisFasDto");
               GXutil.writeLogRaw("Old: ",Z7742DisFasDto);
               GXutil.writeLogRaw("Current: ",T01AR2_A7742DisFasDto[0]);
            }
            if ( DecimalUtil.compareTo(Z7743DisFasRec, T01AR2_A7743DisFasRec[0]) != 0 )
            {
               GXutil.writeLogln("tpreartx:[seudo value changed for attri]"+"DisFasRec");
               GXutil.writeLogRaw("Old: ",Z7743DisFasRec);
               GXutil.writeLogRaw("Current: ",T01AR2_A7743DisFasRec[0]);
            }
            if ( Z7747DisFasAut != T01AR2_A7747DisFasAut[0] )
            {
               GXutil.writeLogln("tpreartx:[seudo value changed for attri]"+"DisFasAut");
               GXutil.writeLogRaw("Old: ",Z7747DisFasAut);
               GXutil.writeLogRaw("Current: ",T01AR2_A7747DisFasAut[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01AR2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tpreartx:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01AR2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AR39( )
   {
      beforeValidate1AR39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AR39( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AR39( 0) ;
         checkOptimisticConcurrency1AR39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AR39( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AR39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AR22 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1AR39( ) ;
         }
         endLevel1AR39( ) ;
      }
      closeExtendedTableCursors1AR39( ) ;
   }

   public void update1AR39( )
   {
      beforeValidate1AR39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AR39( ) ;
      }
      if ( ( nIsMod_39 != 0 ) || ( nIsDirty_39 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AR39( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AR39( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AR39( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AR23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AR39( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AR39( ) ;
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
            endLevel1AR39( ) ;
         }
      }
      closeExtendedTableCursors1AR39( ) ;
   }

   public void deferredUpdate1AR39( )
   {
   }

   public void delete1AR39( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AR39( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AR39( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AR39( ) ;
         afterConfirm1AR39( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AR39( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AR24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AR39( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AR39( )
   {
      standaloneModal1AR39( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AR25 */
         pr_default.execute(23, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01AR25_A460FasDsc[0] ;
         A456FasActTin = T01AR25_A456FasActTin[0] ;
         n456FasActTin = T01AR25_n456FasActTin[0] ;
         A7744FasPreObl = T01AR25_A7744FasPreObl[0] ;
         n7744FasPreObl = T01AR25_n7744FasPreObl[0] ;
         pr_default.close(23);
         GXt_decimal8 = A7746DisFasPrMa ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char3[0] = A335DisArtCod ;
         GXv_char2[0] = A362DisColNom ;
         GXv_int5[0] = A363DisColNum ;
         GXv_int10[0] = A390DisTipCol ;
         GXv_char1[0] = A456FasActTin ;
         GXv_decimal12[0] = GXt_decimal8 ;
         new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
         tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
         tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
         tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
         tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
         tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
         tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
         tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A7746DisFasPrMa = GXt_decimal8 ;
         GXt_decimal8 = A7745DisFasPrMi ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char3[0] = A335DisArtCod ;
         GXv_char2[0] = A362DisColNom ;
         GXv_int5[0] = A363DisColNum ;
         GXv_int10[0] = A390DisTipCol ;
         GXv_char1[0] = A456FasActTin ;
         GXv_decimal12[0] = GXt_decimal8 ;
         new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
         tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
         tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
         tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
         tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
         tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
         tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
         tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A7745DisFasPrMi = GXt_decimal8 ;
         GXt_int4 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int6[0] = (short)(0) ;
         GXv_char2[0] = "D" ;
         GXv_int7[0] = GXt_int4 ;
         new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
         tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
         tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
         tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int4) ;
         GXt_int4 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A361DisCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int6[0] = (short)(0) ;
         GXv_char2[0] = "P" ;
         GXv_int7[0] = GXt_int4 ;
         new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
         tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
         tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
         tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int4) ;
         if ( A8509DisFasPreL.doubleValue() > 0 )
         {
            A8508DisFasPrLs = (byte)(1) ;
         }
         else
         {
            if ( A8509DisFasPreL.doubleValue() == 0 )
            {
               A8508DisFasPrLs = (byte)(0) ;
            }
            else
            {
               A8508DisFasPrLs = (byte)(0) ;
            }
         }
         if ( ( ( DecimalUtil.compareTo(A7740DisFasPre, A7745DisFasPrMi) < 0 ) && ( GXutil.strcmp(A456FasActTin, "S") == 0 ) ) && ( A7747DisFasAut == 0 ) && ( A8508DisFasPrLs == 0 ) )
         {
            A7748DisFasPrOk = (byte)(1) ;
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(A7740DisFasPre, A7746DisFasPrMa) > 0 ) && ( GXutil.strcmp(A456FasActTin, "S") == 0 ) ) && ( A7747DisFasAut == 0 ) && ( A8508DisFasPrLs == 0 ) )
            {
               A7748DisFasPrOk = (byte)(1) ;
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A7740DisFasPre, A8509DisFasPreL) != 0 ) && ( A8508DisFasPrLs == 1 ) && ( A7747DisFasAut == 0 ) )
               {
                  A7748DisFasPrOk = (byte)(1) ;
               }
               else
               {
                  if ( ( ( A7744FasPreObl == 1 ) && ( A7740DisFasPre.doubleValue() == 0 ) ) && ( A7747DisFasAut == 0 ) )
                  {
                     A7748DisFasPrOk = (byte)(1) ;
                  }
                  else
                  {
                     A7748DisFasPrOk = (byte)(0) ;
                  }
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01AR26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01AR27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01AR28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01AR29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01AR30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void endLevel1AR39( )
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

   public void scanStart1AR39( )
   {
      /* Scan By routine */
      /* Using cursor T01AR31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01AR31_A368DisFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AR39( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01AR31_A368DisFasLin[0] ;
      }
   }

   public void scanEnd1AR39( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1AR39( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AR39( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AR39( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AR39( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AR39( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AR39( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AR39( )
   {
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPre_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      cmbDisFasUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisFasUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisFasUni.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDto_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasRec_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      chkFasPreObl.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreObl.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
      chkDisFasAut.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasAut.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasPrMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasPrMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMa_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasPreL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPreL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPreL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDisFasDtoL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasDtoL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDtoL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      chkDisFasPrOk.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrOk.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
      chkDisFasPrLs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrLs.getEnabled(), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1AR39( )
   {
   }

   public void send_integrity_lvl_hashes1AR38( )
   {
   }

   public void subsflControlProps_8039( )
   {
      edtavnRcdDeleted_39_Internalname = "vNRCDDELETED_39_"+sGXsfl_80_idx ;
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_80_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_80_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_80_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_80_idx ;
      edtDisFasPre_Internalname = "DISFASPRE_"+sGXsfl_80_idx ;
      cmbDisFasUni.setInternalname( "DISFASUNI_"+sGXsfl_80_idx );
      edtDisFasDto_Internalname = "DISFASDTO_"+sGXsfl_80_idx ;
      edtDisFasRec_Internalname = "DISFASREC_"+sGXsfl_80_idx ;
      chkFasPreObl.setInternalname( "FASPREOBL_"+sGXsfl_80_idx );
      chkDisFasAut.setInternalname( "DISFASAUT_"+sGXsfl_80_idx );
      edtDisFasPrMi_Internalname = "DISFASPRMI_"+sGXsfl_80_idx ;
      edtDisFasPrMa_Internalname = "DISFASPRMA_"+sGXsfl_80_idx ;
      edtDisFasPreL_Internalname = "DISFASPREL_"+sGXsfl_80_idx ;
      edtDisFasDtoL_Internalname = "DISFASDTOL_"+sGXsfl_80_idx ;
      chkDisFasPrOk.setInternalname( "DISFASPROK_"+sGXsfl_80_idx );
      chkDisFasPrLs.setInternalname( "DISFASPRLS_"+sGXsfl_80_idx );
   }

   public void subsflControlProps_fel_8039( )
   {
      edtavnRcdDeleted_39_Internalname = "vNRCDDELETED_39_"+sGXsfl_80_fel_idx ;
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_80_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_80_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_80_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_80_fel_idx ;
      edtDisFasPre_Internalname = "DISFASPRE_"+sGXsfl_80_fel_idx ;
      cmbDisFasUni.setInternalname( "DISFASUNI_"+sGXsfl_80_fel_idx );
      edtDisFasDto_Internalname = "DISFASDTO_"+sGXsfl_80_fel_idx ;
      edtDisFasRec_Internalname = "DISFASREC_"+sGXsfl_80_fel_idx ;
      chkFasPreObl.setInternalname( "FASPREOBL_"+sGXsfl_80_fel_idx );
      chkDisFasAut.setInternalname( "DISFASAUT_"+sGXsfl_80_fel_idx );
      edtDisFasPrMi_Internalname = "DISFASPRMI_"+sGXsfl_80_fel_idx ;
      edtDisFasPrMa_Internalname = "DISFASPRMA_"+sGXsfl_80_fel_idx ;
      edtDisFasPreL_Internalname = "DISFASPREL_"+sGXsfl_80_fel_idx ;
      edtDisFasDtoL_Internalname = "DISFASDTOL_"+sGXsfl_80_fel_idx ;
      chkDisFasPrOk.setInternalname( "DISFASPROK_"+sGXsfl_80_fel_idx );
      chkDisFasPrLs.setInternalname( "DISFASPRLS_"+sGXsfl_80_fel_idx );
   }

   public void addRow1AR39( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_8039( ) ;
      sendRow1AR39( ) ;
   }

   public void sendRow1AR39( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_39_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_39_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_39), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_39), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_39_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_39_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPre_Internalname,GXutil.ltrim( localUtil.ntoc( A7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPre_Enabled!=0) ? localUtil.format( A7740DisFasPre, "ZZZZZZZ.99") : localUtil.format( A7740DisFasPre, "ZZZZZZZ.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      if ( ( cmbDisFasUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "DISFASUNI_" + sGXsfl_80_idx ;
         cmbDisFasUni.setName( GXCCtl );
         cmbDisFasUni.setWebtags( "" );
         cmbDisFasUni.addItem("K", httpContext.getMessage( "Kilo", ""), (short)(0));
         cmbDisFasUni.addItem("M", httpContext.getMessage( "Metro", ""), (short)(0));
         cmbDisFasUni.addItem("F", httpContext.getMessage( "Fijo", ""), (short)(0));
         cmbDisFasUni.addItem("C", httpContext.getMessage( "Color", ""), (short)(0));
         if ( cmbDisFasUni.getItemCount() > 0 )
         {
            A7741DisFasUni = cmbDisFasUni.getValidValue(A7741DisFasUni) ;
            n7741DisFasUni = false ;
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDisFasUni,cmbDisFasUni.getInternalname(),GXutil.rtrim( A7741DisFasUni),Integer.valueOf(1),cmbDisFasUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbDisFasUni.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbDisFasUni.setValue( GXutil.rtrim( A7741DisFasUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisFasUni.getInternalname(), "Values", cmbDisFasUni.ToJavascriptSource(), !bGXsfl_80_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasDto_Internalname,GXutil.ltrim( localUtil.ntoc( A7742DisFasDto, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasDto_Enabled!=0) ? localUtil.format( A7742DisFasDto, "ZZ9.99 %") : localUtil.format( A7742DisFasDto, "ZZ9.99 %"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasRec_Internalname,GXutil.ltrim( localUtil.ntoc( A7743DisFasRec, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasRec_Enabled!=0) ? localUtil.format( A7743DisFasRec, "ZZ9.99 %") : localUtil.format( A7743DisFasRec, "ZZ9.99 %"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "FASPREOBL_" + sGXsfl_80_idx ;
      chkFasPreObl.setName( GXCCtl );
      chkFasPreObl.setWebtags( "" );
      chkFasPreObl.setCaption( httpContext.getMessage( "Precio Obligatorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "TitleCaption", chkFasPreObl.getCaption(), !bGXsfl_80_Refreshing);
      chkFasPreObl.setCheckedValue( "0" );
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasPreObl.getInternalname(),GXutil.str( A7744FasPreObl, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkFasPreObl.getEnabled()),"1",httpContext.getMessage( "Precio Obligatorio", ""),StyleString,ClassString,"","",""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISFASAUT_" + sGXsfl_80_idx ;
      chkDisFasAut.setName( GXCCtl );
      chkDisFasAut.setWebtags( "" );
      chkDisFasAut.setCaption( httpContext.getMessage( "Aut.?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "TitleCaption", chkDisFasAut.getCaption(), !bGXsfl_80_Refreshing);
      chkDisFasAut.setCheckedValue( "0" );
      A7747DisFasAut = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7747DisFasAut = false ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFasAut.getInternalname(),GXutil.str( A7747DisFasAut, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkDisFasAut.getEnabled()),"1",httpContext.getMessage( "Aut.?", ""),StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(91, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPrMi_Internalname,GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPrMi_Enabled!=0) ? localUtil.format( A7745DisFasPrMi, "ZZZZZZ9.99") : localUtil.format( A7745DisFasPrMi, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPrMi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPrMi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPrMa_Internalname,GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPrMa_Enabled!=0) ? localUtil.format( A7746DisFasPrMa, "ZZZZZZ9.99") : localUtil.format( A7746DisFasPrMa, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPrMa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPrMa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPreL_Internalname,GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(7), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPreL_Enabled!=0) ? localUtil.format( A8509DisFasPreL, "ZZZ,ZZ9") : localUtil.format( A8509DisFasPreL, "ZZZ,ZZ9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPreL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPreL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasDtoL_Internalname,GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasDtoL_Enabled!=0) ? localUtil.format( A8510DisFasDtoL, "Z9.99 %") : localUtil.format( A8510DisFasDtoL, "Z9.99 %"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasDtoL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasDtoL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISFASPROK_" + sGXsfl_80_idx ;
      chkDisFasPrOk.setName( GXCCtl );
      chkDisFasPrOk.setWebtags( "" );
      chkDisFasPrOk.setCaption( httpContext.getMessage( "Precio Ok", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "TitleCaption", chkDisFasPrOk.getCaption(), !bGXsfl_80_Refreshing);
      chkDisFasPrOk.setCheckedValue( "1" );
      A7748DisFasPrOk = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), ".", "")), "0")==0) ? 0 : 1)) ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFasPrOk.getInternalname(),GXutil.str( A7748DisFasPrOk, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkDisFasPrOk.getEnabled()),"0",httpContext.getMessage( "Precio Ok", ""),StyleString,ClassString,"","",""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISFASPRLS_" + sGXsfl_80_idx ;
      chkDisFasPrLs.setName( GXCCtl );
      chkDisFasPrLs.setWebtags( "" );
      chkDisFasPrLs.setCaption( httpContext.getMessage( "Lst", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "TitleCaption", chkDisFasPrLs.getCaption(), !bGXsfl_80_Refreshing);
      chkDisFasPrLs.setCheckedValue( "0" );
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFasPrLs.getInternalname(),GXutil.str( A8508DisFasPrLs, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkDisFasPrLs.getEnabled()),"1",httpContext.getMessage( "Lst", ""),StyleString,ClassString,"","",""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AR39( ) ;
      GXCCtl = "Z368DisFasLin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7740DisFasPre_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7741DisFasUni_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7741DisFasUni));
      GXCCtl = "Z7742DisFasDto_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7742DisFasDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7743DisFasRec_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7743DisFasRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7747DisFasAut_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_39_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_39_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV16UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_39_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASUNI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASDTO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASREC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASAUT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRMI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRMA_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPREL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASDTOL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPROK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRLS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AR39( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_8039( ) ;
      edtavnRcdDeleted_39_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_39_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbDisFasUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASUNI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDisFasDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASREC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkFasPreObl.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisFasAut.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASAUT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDisFasPrMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasPrMa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMA_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasPreL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPREL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasDtoL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTOL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkDisFasPrOk.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPROK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisFasPrLs.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRLS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_39_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_39_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_39");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_39_Internalname ;
         wbErr = true ;
         nRcdDeleted_39 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_39 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_39_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISFASLIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasLin_Internalname ;
         wbErr = true ;
         A368DisFasLin = (short)(0) ;
      }
      else
      {
         A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisFasPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisFasPre_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "DISFASPRE_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasPre_Internalname ;
         wbErr = true ;
         A7740DisFasPre = DecimalUtil.ZERO ;
         n7740DisFasPre = false ;
      }
      else
      {
         A7740DisFasPre = localUtil.ctond( httpContext.cgiGet( edtDisFasPre_Internalname)) ;
         n7740DisFasPre = false ;
      }
      cmbDisFasUni.setName( cmbDisFasUni.getInternalname() );
      cmbDisFasUni.setValue( httpContext.cgiGet( cmbDisFasUni.getInternalname()) );
      A7741DisFasUni = httpContext.cgiGet( cmbDisFasUni.getInternalname()) ;
      n7741DisFasUni = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisFasDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisFasDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "DISFASDTO_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasDto_Internalname ;
         wbErr = true ;
         A7742DisFasDto = DecimalUtil.ZERO ;
         n7742DisFasDto = false ;
      }
      else
      {
         A7742DisFasDto = localUtil.ctond( httpContext.cgiGet( edtDisFasDto_Internalname)) ;
         n7742DisFasDto = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisFasRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisFasRec_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "DISFASREC_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasRec_Internalname ;
         wbErr = true ;
         A7743DisFasRec = DecimalUtil.ZERO ;
         n7743DisFasRec = false ;
      }
      else
      {
         A7743DisFasRec = localUtil.ctond( httpContext.cgiGet( edtDisFasRec_Internalname)) ;
         n7743DisFasRec = false ;
      }
      A7744FasPreObl = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreObl.getInternalname()), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkDisFasAut.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkDisFasAut.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
      {
         GXCCtl = "DISFASAUT_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisFasAut.getInternalname() ;
         wbErr = true ;
         A7747DisFasAut = (byte)(0) ;
         n7747DisFasAut = false ;
      }
      else
      {
         A7747DisFasAut = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisFasAut.getInternalname()), "1")==0) ? 1 : 0)) ;
         n7747DisFasAut = false ;
      }
      A7745DisFasPrMi = localUtil.ctond( httpContext.cgiGet( edtDisFasPrMi_Internalname)) ;
      A7746DisFasPrMa = localUtil.ctond( httpContext.cgiGet( edtDisFasPrMa_Internalname)) ;
      A8509DisFasPreL = localUtil.ctond( httpContext.cgiGet( edtDisFasPreL_Internalname)) ;
      A8510DisFasDtoL = localUtil.ctond( httpContext.cgiGet( edtDisFasDtoL_Internalname)) ;
      A7748DisFasPrOk = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisFasPrOk.getInternalname()), "0")==0) ? 0 : 1)) ;
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkDisFasPrLs.getInternalname()), "1")==0) ? 1 : 0)) ;
      GXCCtl = "Z368DisFasLin_" + sGXsfl_80_idx ;
      Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7740DisFasPre_" + sGXsfl_80_idx ;
      Z7740DisFasPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7741DisFasUni_" + sGXsfl_80_idx ;
      Z7741DisFasUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7742DisFasDto_" + sGXsfl_80_idx ;
      Z7742DisFasDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7743DisFasRec_" + sGXsfl_80_idx ;
      Z7743DisFasRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7747DisFasAut_" + sGXsfl_80_idx ;
      Z7747DisFasAut = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_80_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_80_idx ;
      nRcdDeleted_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_39_" + sGXsfl_80_idx ;
      nRcdExists_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_39_" + sGXsfl_80_idx ;
      nIsMod_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisFasLin_Enabled = edtDisFasLin_Enabled ;
   }

   public void confirmValues1AR0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_8039( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_8039( ) ;
         httpContext.changePostValue( "Z368DisFasLin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z368DisFasLin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7740DisFasPre_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7740DisFasPre_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7740DisFasPre_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7741DisFasUni_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7741DisFasUni_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7741DisFasUni_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7742DisFasDto_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7742DisFasDto_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7742DisFasDto_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7743DisFasRec_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7743DisFasRec_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7743DisFasRec_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z7747DisFasAut_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z7747DisFasAut_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7747DisFasAut_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_80_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpreartx", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(AV16UsurCod))}, new String[] {"EmprCod","DisCod","ProCod","UsurCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV16UsurCod));
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
      return formatLink("app.tpreartx", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(AV16UsurCod))}, new String[] {"EmprCod","DisCod","ProCod","UsurCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPREARTX" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INSERTA FASE", "") ;
   }

   public void initializeNonKey1AR38( )
   {
   }

   public void initAll1AR38( )
   {
      initializeNonKey1AR38( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AR39( )
   {
      A8508DisFasPrLs = (byte)(0) ;
      A7745DisFasPrMi = DecimalUtil.ZERO ;
      A7746DisFasPrMa = DecimalUtil.ZERO ;
      A7748DisFasPrOk = (byte)(0) ;
      A8509DisFasPreL = DecimalUtil.ZERO ;
      A8510DisFasDtoL = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A456FasActTin = "" ;
      n456FasActTin = false ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      n7740DisFasPre = false ;
      A7741DisFasUni = "" ;
      n7741DisFasUni = false ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      n7742DisFasDto = false ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      n7743DisFasRec = false ;
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      A7747DisFasAut = (byte)(0) ;
      n7747DisFasAut = false ;
      Z7740DisFasPre = DecimalUtil.ZERO ;
      Z7741DisFasUni = "" ;
      Z7742DisFasDto = DecimalUtil.ZERO ;
      Z7743DisFasRec = DecimalUtil.ZERO ;
      Z7747DisFasAut = (byte)(0) ;
      Z457FasCod = "" ;
   }

   public void initAll1AR39( )
   {
      A368DisFasLin = (short)(0) ;
      initializeNonKey1AR39( ) ;
   }

   public void standaloneModalInsert1AR39( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563567", true, true);
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
      httpContext.AddJavascriptSource("tpreartx.js", "?20268241563567", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties39( )
   {
      edtDisFasLin_Enabled = defedtDisFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7740DisFasPre, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7741DisFasUni));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7742DisFasDto, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7743DisFasRec, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(7), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProCod_Internalname = "PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDisTipCol_Internalname = "DISTIPCOL" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDisColNum_Internalname = "DISCOLNUM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      chkPriCod.setInternalname( "PRICOD" );
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtavnRcdDeleted_39_Internalname = "vNRCDDELETED_39" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtDisFasPre_Internalname = "DISFASPRE" ;
      cmbDisFasUni.setInternalname( "DISFASUNI" );
      edtDisFasDto_Internalname = "DISFASDTO" ;
      edtDisFasRec_Internalname = "DISFASREC" ;
      chkFasPreObl.setInternalname( "FASPREOBL" );
      chkDisFasAut.setInternalname( "DISFASAUT" );
      edtDisFasPrMi_Internalname = "DISFASPRMI" ;
      edtDisFasPrMa_Internalname = "DISFASPRMA" ;
      edtDisFasPreL_Internalname = "DISFASPREL" ;
      edtDisFasDtoL_Internalname = "DISFASDTOL" ;
      chkDisFasPrOk.setInternalname( "DISFASPROK" );
      chkDisFasPrLs.setInternalname( "DISFASPRLS" );
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
      Form.setCaption( httpContext.getMessage( "INSERTA FASE", "") );
      chkDisFasPrLs.setCaption( "" );
      chkDisFasPrOk.setCaption( "" );
      edtDisFasDtoL_Jsonclick = "" ;
      edtDisFasPreL_Jsonclick = "" ;
      edtDisFasPrMa_Jsonclick = "" ;
      edtDisFasPrMi_Jsonclick = "" ;
      chkDisFasAut.setCaption( "" );
      chkFasPreObl.setCaption( "" );
      edtDisFasRec_Jsonclick = "" ;
      edtDisFasDto_Jsonclick = "" ;
      cmbDisFasUni.setJsonclick( "" );
      edtDisFasPre_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtDisFasLin_Jsonclick = "" ;
      edtavnRcdDeleted_39_Jsonclick = "" ;
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
      chkDisFasPrLs.setEnabled( 0 );
      chkDisFasPrOk.setEnabled( 0 );
      edtDisFasDtoL_Enabled = 0 ;
      edtDisFasPreL_Enabled = 0 ;
      edtDisFasPrMa_Enabled = 0 ;
      edtDisFasPrMi_Enabled = 0 ;
      chkDisFasAut.setEnabled( 1 );
      chkFasPreObl.setEnabled( 0 );
      edtDisFasRec_Enabled = 1 ;
      edtDisFasDto_Enabled = 1 ;
      cmbDisFasUni.setEnabled( 1 );
      edtDisFasPre_Enabled = 1 ;
      edtFasActTin_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtDisFasLin_Enabled = 1 ;
      edtavnRcdDeleted_39_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      chkPriCod.setIBackground( (int)(0xFFFFFF) );
      chkPriCod.setEnabled( 0 );
      edtDisColNum_Jsonclick = "" ;
      edtDisColNum_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNum_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtCod_Enabled = 0 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNom_Enabled = 0 ;
      edtDisTipCol_Jsonclick = "" ;
      edtDisTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtDisTipCol_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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

   public void gx2asadisfasdtol1AR39( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A457FasCod )
   {
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char2[0] = "D" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int4) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asadisfasprel1AR39( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A457FasCod )
   {
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char2[0] = "P" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int4) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(4), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asadisfasprma1AR39( String A396EmprCod ,
                                      int A252CliCod ,
                                      String A335DisArtCod ,
                                      String A362DisColNom ,
                                      int A363DisColNum ,
                                      byte A390DisTipCol ,
                                      String A456FasActTin )
   {
      GXt_decimal8 = A7746DisFasPrMa ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A7746DisFasPrMa = GXt_decimal8 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asadisfasprmi1AR39( String A396EmprCod ,
                                      int A252CliCod ,
                                      String A335DisArtCod ,
                                      String A362DisColNom ,
                                      int A363DisColNum ,
                                      byte A390DisTipCol ,
                                      String A456FasActTin )
   {
      GXt_decimal8 = A7745DisFasPrMi ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A7745DisFasPrMi = GXt_decimal8 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_8039( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AR39( ) ;
         standaloneModal1AR39( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AR39( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_8039( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkPriCod.setName( "PRICOD" );
      chkPriCod.setWebtags( "" );
      chkPriCod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), true);
      chkPriCod.setCheckedValue( "0" );
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      GXCCtl = "DISFASUNI_" + sGXsfl_80_idx ;
      cmbDisFasUni.setName( GXCCtl );
      cmbDisFasUni.setWebtags( "" );
      cmbDisFasUni.addItem("K", httpContext.getMessage( "Kilo", ""), (short)(0));
      cmbDisFasUni.addItem("M", httpContext.getMessage( "Metro", ""), (short)(0));
      cmbDisFasUni.addItem("F", httpContext.getMessage( "Fijo", ""), (short)(0));
      cmbDisFasUni.addItem("C", httpContext.getMessage( "Color", ""), (short)(0));
      if ( cmbDisFasUni.getItemCount() > 0 )
      {
         A7741DisFasUni = cmbDisFasUni.getValidValue(A7741DisFasUni) ;
         n7741DisFasUni = false ;
      }
      GXCCtl = "FASPREOBL_" + sGXsfl_80_idx ;
      chkFasPreObl.setName( GXCCtl );
      chkFasPreObl.setWebtags( "" );
      chkFasPreObl.setCaption( httpContext.getMessage( "Precio Obligatorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "TitleCaption", chkFasPreObl.getCaption(), !bGXsfl_80_Refreshing);
      chkFasPreObl.setCheckedValue( "0" );
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      GXCCtl = "DISFASAUT_" + sGXsfl_80_idx ;
      chkDisFasAut.setName( GXCCtl );
      chkDisFasAut.setWebtags( "" );
      chkDisFasAut.setCaption( httpContext.getMessage( "Aut.?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "TitleCaption", chkDisFasAut.getCaption(), !bGXsfl_80_Refreshing);
      chkDisFasAut.setCheckedValue( "0" );
      A7747DisFasAut = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7747DisFasAut = false ;
      GXCCtl = "DISFASPROK_" + sGXsfl_80_idx ;
      chkDisFasPrOk.setName( GXCCtl );
      chkDisFasPrOk.setWebtags( "" );
      chkDisFasPrOk.setCaption( httpContext.getMessage( "Precio Ok", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "TitleCaption", chkDisFasPrOk.getCaption(), !bGXsfl_80_Refreshing);
      chkDisFasPrOk.setCheckedValue( "1" );
      A7748DisFasPrOk = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), ".", "")), "0")==0) ? 0 : 1)) ;
      GXCCtl = "DISFASPRLS_" + sGXsfl_80_idx ;
      chkDisFasPrLs.setName( GXCCtl );
      chkDisFasPrLs.setWebtags( "" );
      chkDisFasPrLs.setCaption( httpContext.getMessage( "Lst", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "TitleCaption", chkDisFasPrLs.getCaption(), !bGXsfl_80_Refreshing);
      chkDisFasPrLs.setCheckedValue( "0" );
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AR32 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AR32_A407EmprNom[0] ;
      n407EmprNom = T01AR32_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(30);
      /* Using cursor T01AR33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A362DisColNom = T01AR33_A362DisColNom[0] ;
      n362DisColNom = T01AR33_n362DisColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      A335DisArtCod = T01AR33_A335DisArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A363DisColNum = T01AR33_A363DisColNum[0] ;
      n363DisColNum = T01AR33_n363DisColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      A757PriCod = T01AR33_A757PriCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      A390DisTipCol = T01AR33_A390DisTipCol[0] ;
      n390DisTipCol = T01AR33_n390DisTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A252CliCod = T01AR33_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(31);
      /* Using cursor T01AR34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AR34_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(32);
      /* Using cursor T01AR35 */
      pr_default.execute(33, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01AR35_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(33);
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

   public void valid_Procod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", GXutil.rtrim( A362DisColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", GXutil.rtrim( A757PriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z390DisTipCol", GXutil.ltrim( localUtil.ntoc( Z390DisTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z363DisColNum", GXutil.ltrim( localUtil.ntoc( Z363DisColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n362DisColNom = false ;
      n363DisColNum = false ;
      n390DisTipCol = false ;
      n456FasActTin = false ;
      n7744FasPreObl = false ;
      /* Using cursor T01AR25 */
      pr_default.execute(23, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01AR25_A460FasDsc[0] ;
      A456FasActTin = T01AR25_A456FasActTin[0] ;
      n456FasActTin = T01AR25_n456FasActTin[0] ;
      A7744FasPreObl = T01AR25_A7744FasPreObl[0] ;
      n7744FasPreObl = T01AR25_n7744FasPreObl[0] ;
      pr_default.close(23);
      GXt_decimal8 = A7746DisFasPrMa ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      A456FasActTin = this.A456FasActTin ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      A7746DisFasPrMa = GXt_decimal8 ;
      GXt_decimal8 = A7745DisFasPrMi ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A335DisArtCod ;
      GXv_char2[0] = A362DisColNom ;
      GXv_int5[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_char2, GXv_int5, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreartx_impl.this.A335DisArtCod = GXv_char3[0] ;
      tpreartx_impl.this.A362DisColNom = GXv_char2[0] ;
      tpreartx_impl.this.A363DisColNum = GXv_int5[0] ;
      tpreartx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreartx_impl.this.A456FasActTin = GXv_char1[0] ;
      A456FasActTin = this.A456FasActTin ;
      tpreartx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      A7745DisFasPrMi = GXt_decimal8 ;
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char2[0] = "D" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int4) ;
      GXt_int4 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char3[0] = A457FasCod ;
      GXv_int6[0] = (short)(0) ;
      GXv_char2[0] = "P" ;
      GXv_int7[0] = GXt_int4 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char3, GXv_int6, GXv_char2, GXv_int7) ;
      tpreartx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreartx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreartx_impl.this.A457FasCod = GXv_char3[0] ;
      tpreartx_impl.this.GXt_int4 = GXv_int7[0] ;
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int4) ;
      if ( A8509DisFasPreL.doubleValue() > 0 )
      {
         A8508DisFasPrLs = (byte)(1) ;
      }
      else
      {
         if ( A8509DisFasPreL.doubleValue() == 0 )
         {
            A8508DisFasPrLs = (byte)(0) ;
         }
         else
         {
            A8508DisFasPrLs = (byte)(0) ;
         }
      }
      dynload_actions( ) ;
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7746DisFasPrMa", GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7745DisFasPrMi", GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8510DisFasDtoL", GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8509DisFasPreL", GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(4), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8508DisFasPrLs", GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV16UsurCod',fld:'vUSURCOD',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A363DisColNum',fld:'DISCOLNUM',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z758ProCod'},{av:'Z252CliCod'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z390DisTipCol'},{av:'Z362DisColNom'},{av:'Z335DisArtCod'},{av:'Z363DisColNum'},{av:'Z757PriCod'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISCOLNUM","{handler:'valid_Discolnum',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISCOLNUM",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A363DisColNum',fld:'DISCOLNUM',pic:'ZZZZZ9'},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A8509DisFasPreL',fld:'DISFASPREL',pic:'ZZZ,ZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A7746DisFasPrMa',fld:'DISFASPRMA',pic:'ZZZZZZ9.99'},{av:'A7745DisFasPrMi',fld:'DISFASPRMI',pic:'ZZZZZZ9.99'},{av:'A8510DisFasDtoL',fld:'DISFASDTOL',pic:'Z9.99 %'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A7746DisFasPrMa',fld:'DISFASPRMA',pic:'ZZZZZZ9.99'},{av:'A7745DisFasPrMi',fld:'DISFASPRMI',pic:'ZZZZZZ9.99'},{av:'A8510DisFasDtoL',fld:'DISFASDTOL',pic:'Z9.99 %'},{av:'A8509DisFasPreL',fld:'DISFASPREL',pic:'ZZZ,ZZ9'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_FASACTTIN","{handler:'valid_Fasacttin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_FASACTTIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASPRE","{handler:'valid_Disfaspre',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASPRE",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASUNI","{handler:'valid_Disfasuni',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASUNI",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_FASPREOBL","{handler:'valid_Faspreobl',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_FASPREOBL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASAUT","{handler:'valid_Disfasaut',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASAUT",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASPRMI","{handler:'valid_Disfasprmi',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASPRMI",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASPRMA","{handler:'valid_Disfasprma',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASPRMA",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASPREL","{handler:'valid_Disfasprel',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASPREL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISFASPRLS","{handler:'valid_Disfasprls',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]");
      setEventMetadata("VALID_DISFASPRLS",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'}]}");
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
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(33);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      wcpOAV16UsurCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z7740DisFasPre = DecimalUtil.ZERO ;
      Z7741DisFasUni = "" ;
      Z7742DisFasDto = DecimalUtil.ZERO ;
      Z7743DisFasRec = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      A456FasActTin = "" ;
      A758ProCod = "" ;
      AV16UsurCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_mode = "" ;
      A757PriCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A279CliNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode39 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode38 = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      A7745DisFasPrMi = DecimalUtil.ZERO ;
      A7746DisFasPrMa = DecimalUtil.ZERO ;
      A8509DisFasPreL = DecimalUtil.ZERO ;
      A8510DisFasDtoL = DecimalUtil.ZERO ;
      AV57Station = "" ;
      AV58EmprNom = "" ;
      Z407EmprNom = "" ;
      Z362DisColNom = "" ;
      Z335DisArtCod = "" ;
      Z757PriCod = "" ;
      Z279CliNom = "" ;
      Z759ProDsc = "" ;
      T01AR7_A407EmprNom = new String[] {""} ;
      T01AR7_n407EmprNom = new boolean[] {false} ;
      T01AR8_A362DisColNom = new String[] {""} ;
      T01AR8_n362DisColNom = new boolean[] {false} ;
      T01AR8_A335DisArtCod = new String[] {""} ;
      T01AR8_A363DisColNum = new int[1] ;
      T01AR8_n363DisColNum = new boolean[] {false} ;
      T01AR8_A757PriCod = new String[] {""} ;
      T01AR8_A390DisTipCol = new byte[1] ;
      T01AR8_n390DisTipCol = new boolean[] {false} ;
      T01AR8_A252CliCod = new int[1] ;
      T01AR10_A279CliNom = new String[] {""} ;
      T01AR9_A759ProDsc = new String[] {""} ;
      T01AR11_A407EmprNom = new String[] {""} ;
      T01AR11_n407EmprNom = new boolean[] {false} ;
      T01AR11_A759ProDsc = new String[] {""} ;
      T01AR11_A362DisColNom = new String[] {""} ;
      T01AR11_n362DisColNom = new boolean[] {false} ;
      T01AR11_A335DisArtCod = new String[] {""} ;
      T01AR11_A363DisColNum = new int[1] ;
      T01AR11_n363DisColNum = new boolean[] {false} ;
      T01AR11_A757PriCod = new String[] {""} ;
      T01AR11_A279CliNom = new String[] {""} ;
      T01AR11_A396EmprCod = new String[] {""} ;
      T01AR11_A361DisCod = new int[1] ;
      T01AR11_A758ProCod = new String[] {""} ;
      T01AR11_A390DisTipCol = new byte[1] ;
      T01AR11_n390DisTipCol = new boolean[] {false} ;
      T01AR11_A252CliCod = new int[1] ;
      T01AR12_A396EmprCod = new String[] {""} ;
      T01AR12_A361DisCod = new int[1] ;
      T01AR12_A758ProCod = new String[] {""} ;
      T01AR6_A396EmprCod = new String[] {""} ;
      T01AR6_A361DisCod = new int[1] ;
      T01AR6_A758ProCod = new String[] {""} ;
      T01AR13_A396EmprCod = new String[] {""} ;
      T01AR13_A361DisCod = new int[1] ;
      T01AR13_A758ProCod = new String[] {""} ;
      T01AR14_A396EmprCod = new String[] {""} ;
      T01AR14_A361DisCod = new int[1] ;
      T01AR14_A758ProCod = new String[] {""} ;
      T01AR5_A396EmprCod = new String[] {""} ;
      T01AR5_A361DisCod = new int[1] ;
      T01AR5_A758ProCod = new String[] {""} ;
      T01AR17_A396EmprCod = new String[] {""} ;
      T01AR17_A361DisCod = new int[1] ;
      T01AR17_A758ProCod = new String[] {""} ;
      T01AR17_A368DisFasLin = new short[1] ;
      T01AR17_A1664ParFasCod = new short[1] ;
      T01AR18_A396EmprCod = new String[] {""} ;
      T01AR18_A361DisCod = new int[1] ;
      T01AR18_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z456FasActTin = "" ;
      T01AR19_A361DisCod = new int[1] ;
      T01AR19_A758ProCod = new String[] {""} ;
      T01AR19_A368DisFasLin = new short[1] ;
      T01AR19_A460FasDsc = new String[] {""} ;
      T01AR19_A456FasActTin = new String[] {""} ;
      T01AR19_n456FasActTin = new boolean[] {false} ;
      T01AR19_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR19_n7740DisFasPre = new boolean[] {false} ;
      T01AR19_A7741DisFasUni = new String[] {""} ;
      T01AR19_n7741DisFasUni = new boolean[] {false} ;
      T01AR19_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR19_n7742DisFasDto = new boolean[] {false} ;
      T01AR19_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR19_n7743DisFasRec = new boolean[] {false} ;
      T01AR19_A7744FasPreObl = new byte[1] ;
      T01AR19_n7744FasPreObl = new boolean[] {false} ;
      T01AR19_A7747DisFasAut = new byte[1] ;
      T01AR19_n7747DisFasAut = new boolean[] {false} ;
      T01AR19_A396EmprCod = new String[] {""} ;
      T01AR19_A457FasCod = new String[] {""} ;
      T01AR4_A460FasDsc = new String[] {""} ;
      T01AR4_A456FasActTin = new String[] {""} ;
      T01AR4_n456FasActTin = new boolean[] {false} ;
      T01AR4_A7744FasPreObl = new byte[1] ;
      T01AR4_n7744FasPreObl = new boolean[] {false} ;
      T01AR20_A460FasDsc = new String[] {""} ;
      T01AR20_A456FasActTin = new String[] {""} ;
      T01AR20_n456FasActTin = new boolean[] {false} ;
      T01AR20_A7744FasPreObl = new byte[1] ;
      T01AR20_n7744FasPreObl = new boolean[] {false} ;
      T01AR21_A396EmprCod = new String[] {""} ;
      T01AR21_A361DisCod = new int[1] ;
      T01AR21_A758ProCod = new String[] {""} ;
      T01AR21_A368DisFasLin = new short[1] ;
      T01AR3_A361DisCod = new int[1] ;
      T01AR3_A758ProCod = new String[] {""} ;
      T01AR3_A368DisFasLin = new short[1] ;
      T01AR3_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR3_n7740DisFasPre = new boolean[] {false} ;
      T01AR3_A7741DisFasUni = new String[] {""} ;
      T01AR3_n7741DisFasUni = new boolean[] {false} ;
      T01AR3_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR3_n7742DisFasDto = new boolean[] {false} ;
      T01AR3_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR3_n7743DisFasRec = new boolean[] {false} ;
      T01AR3_A7747DisFasAut = new byte[1] ;
      T01AR3_n7747DisFasAut = new boolean[] {false} ;
      T01AR3_A396EmprCod = new String[] {""} ;
      T01AR3_A457FasCod = new String[] {""} ;
      T01AR3_A7744FasPreObl = new byte[1] ;
      T01AR3_n7744FasPreObl = new boolean[] {false} ;
      T01AR2_A361DisCod = new int[1] ;
      T01AR2_A758ProCod = new String[] {""} ;
      T01AR2_A368DisFasLin = new short[1] ;
      T01AR2_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR2_n7740DisFasPre = new boolean[] {false} ;
      T01AR2_A7741DisFasUni = new String[] {""} ;
      T01AR2_n7741DisFasUni = new boolean[] {false} ;
      T01AR2_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR2_n7742DisFasDto = new boolean[] {false} ;
      T01AR2_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AR2_n7743DisFasRec = new boolean[] {false} ;
      T01AR2_A7747DisFasAut = new byte[1] ;
      T01AR2_n7747DisFasAut = new boolean[] {false} ;
      T01AR2_A396EmprCod = new String[] {""} ;
      T01AR2_A457FasCod = new String[] {""} ;
      T01AR2_A7744FasPreObl = new byte[1] ;
      T01AR2_n7744FasPreObl = new boolean[] {false} ;
      T01AR25_A460FasDsc = new String[] {""} ;
      T01AR25_A456FasActTin = new String[] {""} ;
      T01AR25_n456FasActTin = new boolean[] {false} ;
      T01AR25_A7744FasPreObl = new byte[1] ;
      T01AR25_n7744FasPreObl = new boolean[] {false} ;
      T01AR26_A396EmprCod = new String[] {""} ;
      T01AR26_A361DisCod = new int[1] ;
      T01AR26_A758ProCod = new String[] {""} ;
      T01AR26_A368DisFasLin = new short[1] ;
      T01AR26_A7919Dta_Ordl = new short[1] ;
      T01AR27_A396EmprCod = new String[] {""} ;
      T01AR27_A361DisCod = new int[1] ;
      T01AR27_A758ProCod = new String[] {""} ;
      T01AR27_A368DisFasLin = new short[1] ;
      T01AR27_A7727ArtAdiCod = new short[1] ;
      T01AR28_A396EmprCod = new String[] {""} ;
      T01AR28_A361DisCod = new int[1] ;
      T01AR28_A758ProCod = new String[] {""} ;
      T01AR28_A368DisFasLin = new short[1] ;
      T01AR28_A5377DisQuiLin = new short[1] ;
      T01AR29_A396EmprCod = new String[] {""} ;
      T01AR29_A361DisCod = new int[1] ;
      T01AR29_A758ProCod = new String[] {""} ;
      T01AR29_A368DisFasLin = new short[1] ;
      T01AR29_A5035A_Discod = new int[1] ;
      T01AR29_A5038A_DProcod = new String[] {""} ;
      T01AR29_A5039A_DOrdlin = new short[1] ;
      T01AR30_A396EmprCod = new String[] {""} ;
      T01AR30_A361DisCod = new int[1] ;
      T01AR30_A758ProCod = new String[] {""} ;
      T01AR30_A368DisFasLin = new short[1] ;
      T01AR30_A1664ParFasCod = new short[1] ;
      T01AR31_A396EmprCod = new String[] {""} ;
      T01AR31_A361DisCod = new int[1] ;
      T01AR31_A758ProCod = new String[] {""} ;
      T01AR31_A368DisFasLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AR32_A407EmprNom = new String[] {""} ;
      T01AR32_n407EmprNom = new boolean[] {false} ;
      T01AR33_A362DisColNom = new String[] {""} ;
      T01AR33_n362DisColNom = new boolean[] {false} ;
      T01AR33_A335DisArtCod = new String[] {""} ;
      T01AR33_A363DisColNum = new int[1] ;
      T01AR33_n363DisColNum = new boolean[] {false} ;
      T01AR33_A757PriCod = new String[] {""} ;
      T01AR33_A390DisTipCol = new byte[1] ;
      T01AR33_n390DisTipCol = new boolean[] {false} ;
      T01AR33_A252CliCod = new int[1] ;
      T01AR34_A279CliNom = new String[] {""} ;
      T01AR35_A759ProDsc = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZZ362DisColNom = "" ;
      ZZ335DisArtCod = "" ;
      ZZ757PriCod = "" ;
      ZZ279CliNom = "" ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new long[1] ;
      Z7746DisFasPrMa = DecimalUtil.ZERO ;
      Z7745DisFasPrMi = DecimalUtil.ZERO ;
      Z8510DisFasDtoL = DecimalUtil.ZERO ;
      Z8509DisFasPreL = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpreartx__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpreartx__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpreartx__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpreartx__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpreartx__default(),
         new Object[] {
             new Object[] {
            T01AR2_A361DisCod, T01AR2_A758ProCod, T01AR2_A368DisFasLin, T01AR2_A7740DisFasPre, T01AR2_n7740DisFasPre, T01AR2_A7741DisFasUni, T01AR2_n7741DisFasUni, T01AR2_A7742DisFasDto, T01AR2_n7742DisFasDto, T01AR2_A7743DisFasRec,
            T01AR2_n7743DisFasRec, T01AR2_A7747DisFasAut, T01AR2_n7747DisFasAut, T01AR2_A396EmprCod, T01AR2_A457FasCod, T01AR2_A7744FasPreObl, T01AR2_n7744FasPreObl
            }
            , new Object[] {
            T01AR3_A361DisCod, T01AR3_A758ProCod, T01AR3_A368DisFasLin, T01AR3_A7740DisFasPre, T01AR3_n7740DisFasPre, T01AR3_A7741DisFasUni, T01AR3_n7741DisFasUni, T01AR3_A7742DisFasDto, T01AR3_n7742DisFasDto, T01AR3_A7743DisFasRec,
            T01AR3_n7743DisFasRec, T01AR3_A7747DisFasAut, T01AR3_n7747DisFasAut, T01AR3_A396EmprCod, T01AR3_A457FasCod, T01AR3_A7744FasPreObl, T01AR3_n7744FasPreObl
            }
            , new Object[] {
            T01AR4_A460FasDsc, T01AR4_A456FasActTin, T01AR4_n456FasActTin, T01AR4_A7744FasPreObl, T01AR4_n7744FasPreObl
            }
            , new Object[] {
            T01AR5_A396EmprCod, T01AR5_A361DisCod, T01AR5_A758ProCod
            }
            , new Object[] {
            T01AR6_A396EmprCod, T01AR6_A361DisCod, T01AR6_A758ProCod
            }
            , new Object[] {
            T01AR7_A407EmprNom, T01AR7_n407EmprNom
            }
            , new Object[] {
            T01AR8_A362DisColNom, T01AR8_n362DisColNom, T01AR8_A335DisArtCod, T01AR8_A363DisColNum, T01AR8_n363DisColNum, T01AR8_A757PriCod, T01AR8_A390DisTipCol, T01AR8_n390DisTipCol, T01AR8_A252CliCod
            }
            , new Object[] {
            T01AR9_A759ProDsc
            }
            , new Object[] {
            T01AR10_A279CliNom
            }
            , new Object[] {
            T01AR11_A407EmprNom, T01AR11_n407EmprNom, T01AR11_A759ProDsc, T01AR11_A362DisColNom, T01AR11_n362DisColNom, T01AR11_A335DisArtCod, T01AR11_A363DisColNum, T01AR11_n363DisColNum, T01AR11_A757PriCod, T01AR11_A279CliNom,
            T01AR11_A396EmprCod, T01AR11_A361DisCod, T01AR11_A758ProCod, T01AR11_A390DisTipCol, T01AR11_n390DisTipCol, T01AR11_A252CliCod
            }
            , new Object[] {
            T01AR12_A396EmprCod, T01AR12_A361DisCod, T01AR12_A758ProCod
            }
            , new Object[] {
            T01AR13_A396EmprCod, T01AR13_A361DisCod, T01AR13_A758ProCod
            }
            , new Object[] {
            T01AR14_A396EmprCod, T01AR14_A361DisCod, T01AR14_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AR17_A396EmprCod, T01AR17_A361DisCod, T01AR17_A758ProCod, T01AR17_A368DisFasLin, T01AR17_A1664ParFasCod
            }
            , new Object[] {
            T01AR18_A396EmprCod, T01AR18_A361DisCod, T01AR18_A758ProCod
            }
            , new Object[] {
            T01AR19_A361DisCod, T01AR19_A758ProCod, T01AR19_A368DisFasLin, T01AR19_A460FasDsc, T01AR19_A456FasActTin, T01AR19_n456FasActTin, T01AR19_A7740DisFasPre, T01AR19_n7740DisFasPre, T01AR19_A7741DisFasUni, T01AR19_n7741DisFasUni,
            T01AR19_A7742DisFasDto, T01AR19_n7742DisFasDto, T01AR19_A7743DisFasRec, T01AR19_n7743DisFasRec, T01AR19_A7744FasPreObl, T01AR19_n7744FasPreObl, T01AR19_A7747DisFasAut, T01AR19_n7747DisFasAut, T01AR19_A396EmprCod, T01AR19_A457FasCod
            }
            , new Object[] {
            T01AR20_A460FasDsc, T01AR20_A456FasActTin, T01AR20_n456FasActTin, T01AR20_A7744FasPreObl, T01AR20_n7744FasPreObl
            }
            , new Object[] {
            T01AR21_A396EmprCod, T01AR21_A361DisCod, T01AR21_A758ProCod, T01AR21_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AR25_A460FasDsc, T01AR25_A456FasActTin, T01AR25_n456FasActTin, T01AR25_A7744FasPreObl, T01AR25_n7744FasPreObl
            }
            , new Object[] {
            T01AR26_A396EmprCod, T01AR26_A361DisCod, T01AR26_A758ProCod, T01AR26_A368DisFasLin, T01AR26_A7919Dta_Ordl
            }
            , new Object[] {
            T01AR27_A396EmprCod, T01AR27_A361DisCod, T01AR27_A758ProCod, T01AR27_A368DisFasLin, T01AR27_A7727ArtAdiCod
            }
            , new Object[] {
            T01AR28_A396EmprCod, T01AR28_A361DisCod, T01AR28_A758ProCod, T01AR28_A368DisFasLin, T01AR28_A5377DisQuiLin
            }
            , new Object[] {
            T01AR29_A396EmprCod, T01AR29_A361DisCod, T01AR29_A758ProCod, T01AR29_A368DisFasLin, T01AR29_A5035A_Discod, T01AR29_A5038A_DProcod, T01AR29_A5039A_DOrdlin
            }
            , new Object[] {
            T01AR30_A396EmprCod, T01AR30_A361DisCod, T01AR30_A758ProCod, T01AR30_A368DisFasLin, T01AR30_A1664ParFasCod
            }
            , new Object[] {
            T01AR31_A396EmprCod, T01AR31_A361DisCod, T01AR31_A758ProCod, T01AR31_A368DisFasLin
            }
            , new Object[] {
            T01AR32_A407EmprNom, T01AR32_n407EmprNom
            }
            , new Object[] {
            T01AR33_A362DisColNom, T01AR33_n362DisColNom, T01AR33_A335DisArtCod, T01AR33_A363DisColNum, T01AR33_n363DisColNum, T01AR33_A757PriCod, T01AR33_A390DisTipCol, T01AR33_n390DisTipCol, T01AR33_A252CliCod
            }
            , new Object[] {
            T01AR34_A279CliNom
            }
            , new Object[] {
            T01AR35_A759ProDsc
            }
         }
      );
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z7747DisFasAut ;
   private byte GxWebError ;
   private byte A390DisTipCol ;
   private byte nKeyPressed ;
   private byte A7744FasPreObl ;
   private byte A7747DisFasAut ;
   private byte A7748DisFasPrOk ;
   private byte A8508DisFasPrLs ;
   private byte Z390DisTipCol ;
   private byte Gx_BScreen ;
   private byte Z7744FasPreObl ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ390DisTipCol ;
   private byte GXv_int10[] ;
   private byte Z8508DisFasPrLs ;
   private short Z368DisFasLin ;
   private short nRcdDeleted_39 ;
   private short nRcdExists_39 ;
   private short nIsMod_39 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount39 ;
   private short RcdFound39 ;
   private short nBlankRcdUsr39 ;
   private short A368DisFasLin ;
   private short RcdFound38 ;
   private short nIsDirty_38 ;
   private short nIsDirty_39 ;
   private short GXv_int6[] ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtProCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtDisTipCol_Enabled ;
   private int edtDisColNom_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisColNum_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtavnRcdDeleted_39_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtDisFasPre_Enabled ;
   private int edtDisFasDto_Enabled ;
   private int edtDisFasRec_Enabled ;
   private int edtDisFasPrMi_Enabled ;
   private int edtDisFasPrMa_Enabled ;
   private int edtDisFasPreL_Enabled ;
   private int edtDisFasDtoL_Enabled ;
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
   private int Z363DisColNum ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtDisFasLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliNom_Backcolor ;
   private int edtDisColNum_Backcolor ;
   private int edtDisArtCod_Backcolor ;
   private int edtDisColNom_Backcolor ;
   private int edtDisTipCol_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ363DisColNum ;
   private int GXv_int5[] ;
   private int GXv_int9[] ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXt_int4 ;
   private long GXv_int7[] ;
   private java.math.BigDecimal Z7740DisFasPre ;
   private java.math.BigDecimal Z7742DisFasDto ;
   private java.math.BigDecimal Z7743DisFasRec ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7743DisFasRec ;
   private java.math.BigDecimal A7745DisFasPrMi ;
   private java.math.BigDecimal A7746DisFasPrMa ;
   private java.math.BigDecimal A8509DisFasPreL ;
   private java.math.BigDecimal A8510DisFasDtoL ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal Z7746DisFasPrMa ;
   private java.math.BigDecimal Z7745DisFasPrMi ;
   private java.math.BigDecimal Z8510DisFasDtoL ;
   private java.math.BigDecimal Z8509DisFasPreL ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String wcpOAV16UsurCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z7741DisFasUni ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String A456FasActTin ;
   private String A758ProCod ;
   private String AV16UsurCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_80_idx="0001" ;
   private String Gx_mode ;
   private String A757PriCod ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDisTipCol_Internalname ;
   private String edtDisTipCol_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDisColNom_Internalname ;
   private String edtDisColNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDisArtCod_Internalname ;
   private String edtDisArtCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDisColNum_Internalname ;
   private String edtDisColNum_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sMode39 ;
   private String edtavnRcdDeleted_39_Internalname ;
   private String edtDisFasLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtFasActTin_Internalname ;
   private String edtDisFasPre_Internalname ;
   private String edtDisFasDto_Internalname ;
   private String edtDisFasRec_Internalname ;
   private String edtDisFasPrMi_Internalname ;
   private String edtDisFasPrMa_Internalname ;
   private String edtDisFasPreL_Internalname ;
   private String edtDisFasDtoL_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode38 ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A7741DisFasUni ;
   private String AV57Station ;
   private String AV58EmprNom ;
   private String Z407EmprNom ;
   private String Z362DisColNom ;
   private String Z335DisArtCod ;
   private String Z757PriCod ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z456FasActTin ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_39_Jsonclick ;
   private String edtDisFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtDisFasPre_Jsonclick ;
   private String edtDisFasDto_Jsonclick ;
   private String edtDisFasRec_Jsonclick ;
   private String edtDisFasPrMi_Jsonclick ;
   private String edtDisFasPrMa_Jsonclick ;
   private String edtDisFasPreL_Jsonclick ;
   private String edtDisFasDtoL_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZZ362DisColNom ;
   private String ZZ335DisArtCod ;
   private String ZZ757PriCod ;
   private String ZZ279CliNom ;
   private String GXv_char1[] ;
   private String GXv_char11[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n456FasActTin ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n7740DisFasPre ;
   private boolean n7741DisFasUni ;
   private boolean n7742DisFasDto ;
   private boolean n7743DisFasRec ;
   private boolean n7744FasPreObl ;
   private boolean n7747DisFasAut ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkPriCod ;
   private HTMLChoice cmbDisFasUni ;
   private ICheckbox chkFasPreObl ;
   private ICheckbox chkDisFasAut ;
   private ICheckbox chkDisFasPrOk ;
   private ICheckbox chkDisFasPrLs ;
   private IDataStoreProvider pr_default ;
   private String[] T01AR7_A407EmprNom ;
   private boolean[] T01AR7_n407EmprNom ;
   private String[] T01AR8_A362DisColNom ;
   private boolean[] T01AR8_n362DisColNom ;
   private String[] T01AR8_A335DisArtCod ;
   private int[] T01AR8_A363DisColNum ;
   private boolean[] T01AR8_n363DisColNum ;
   private String[] T01AR8_A757PriCod ;
   private byte[] T01AR8_A390DisTipCol ;
   private boolean[] T01AR8_n390DisTipCol ;
   private int[] T01AR8_A252CliCod ;
   private String[] T01AR10_A279CliNom ;
   private String[] T01AR9_A759ProDsc ;
   private String[] T01AR11_A407EmprNom ;
   private boolean[] T01AR11_n407EmprNom ;
   private String[] T01AR11_A759ProDsc ;
   private String[] T01AR11_A362DisColNom ;
   private boolean[] T01AR11_n362DisColNom ;
   private String[] T01AR11_A335DisArtCod ;
   private int[] T01AR11_A363DisColNum ;
   private boolean[] T01AR11_n363DisColNum ;
   private String[] T01AR11_A757PriCod ;
   private String[] T01AR11_A279CliNom ;
   private String[] T01AR11_A396EmprCod ;
   private int[] T01AR11_A361DisCod ;
   private String[] T01AR11_A758ProCod ;
   private byte[] T01AR11_A390DisTipCol ;
   private boolean[] T01AR11_n390DisTipCol ;
   private int[] T01AR11_A252CliCod ;
   private String[] T01AR12_A396EmprCod ;
   private int[] T01AR12_A361DisCod ;
   private String[] T01AR12_A758ProCod ;
   private String[] T01AR6_A396EmprCod ;
   private int[] T01AR6_A361DisCod ;
   private String[] T01AR6_A758ProCod ;
   private String[] T01AR13_A396EmprCod ;
   private int[] T01AR13_A361DisCod ;
   private String[] T01AR13_A758ProCod ;
   private String[] T01AR14_A396EmprCod ;
   private int[] T01AR14_A361DisCod ;
   private String[] T01AR14_A758ProCod ;
   private String[] T01AR5_A396EmprCod ;
   private int[] T01AR5_A361DisCod ;
   private String[] T01AR5_A758ProCod ;
   private String[] T01AR17_A396EmprCod ;
   private int[] T01AR17_A361DisCod ;
   private String[] T01AR17_A758ProCod ;
   private short[] T01AR17_A368DisFasLin ;
   private short[] T01AR17_A1664ParFasCod ;
   private String[] T01AR18_A396EmprCod ;
   private int[] T01AR18_A361DisCod ;
   private String[] T01AR18_A758ProCod ;
   private int[] T01AR19_A361DisCod ;
   private String[] T01AR19_A758ProCod ;
   private short[] T01AR19_A368DisFasLin ;
   private String[] T01AR19_A460FasDsc ;
   private String[] T01AR19_A456FasActTin ;
   private boolean[] T01AR19_n456FasActTin ;
   private java.math.BigDecimal[] T01AR19_A7740DisFasPre ;
   private boolean[] T01AR19_n7740DisFasPre ;
   private String[] T01AR19_A7741DisFasUni ;
   private boolean[] T01AR19_n7741DisFasUni ;
   private java.math.BigDecimal[] T01AR19_A7742DisFasDto ;
   private boolean[] T01AR19_n7742DisFasDto ;
   private java.math.BigDecimal[] T01AR19_A7743DisFasRec ;
   private boolean[] T01AR19_n7743DisFasRec ;
   private byte[] T01AR19_A7744FasPreObl ;
   private boolean[] T01AR19_n7744FasPreObl ;
   private byte[] T01AR19_A7747DisFasAut ;
   private boolean[] T01AR19_n7747DisFasAut ;
   private String[] T01AR19_A396EmprCod ;
   private String[] T01AR19_A457FasCod ;
   private String[] T01AR4_A460FasDsc ;
   private String[] T01AR4_A456FasActTin ;
   private boolean[] T01AR4_n456FasActTin ;
   private byte[] T01AR4_A7744FasPreObl ;
   private boolean[] T01AR4_n7744FasPreObl ;
   private String[] T01AR20_A460FasDsc ;
   private String[] T01AR20_A456FasActTin ;
   private boolean[] T01AR20_n456FasActTin ;
   private byte[] T01AR20_A7744FasPreObl ;
   private boolean[] T01AR20_n7744FasPreObl ;
   private String[] T01AR21_A396EmprCod ;
   private int[] T01AR21_A361DisCod ;
   private String[] T01AR21_A758ProCod ;
   private short[] T01AR21_A368DisFasLin ;
   private int[] T01AR3_A361DisCod ;
   private String[] T01AR3_A758ProCod ;
   private short[] T01AR3_A368DisFasLin ;
   private java.math.BigDecimal[] T01AR3_A7740DisFasPre ;
   private boolean[] T01AR3_n7740DisFasPre ;
   private String[] T01AR3_A7741DisFasUni ;
   private boolean[] T01AR3_n7741DisFasUni ;
   private java.math.BigDecimal[] T01AR3_A7742DisFasDto ;
   private boolean[] T01AR3_n7742DisFasDto ;
   private java.math.BigDecimal[] T01AR3_A7743DisFasRec ;
   private boolean[] T01AR3_n7743DisFasRec ;
   private byte[] T01AR3_A7747DisFasAut ;
   private boolean[] T01AR3_n7747DisFasAut ;
   private String[] T01AR3_A396EmprCod ;
   private String[] T01AR3_A457FasCod ;
   private byte[] T01AR3_A7744FasPreObl ;
   private boolean[] T01AR3_n7744FasPreObl ;
   private int[] T01AR2_A361DisCod ;
   private String[] T01AR2_A758ProCod ;
   private short[] T01AR2_A368DisFasLin ;
   private java.math.BigDecimal[] T01AR2_A7740DisFasPre ;
   private boolean[] T01AR2_n7740DisFasPre ;
   private String[] T01AR2_A7741DisFasUni ;
   private boolean[] T01AR2_n7741DisFasUni ;
   private java.math.BigDecimal[] T01AR2_A7742DisFasDto ;
   private boolean[] T01AR2_n7742DisFasDto ;
   private java.math.BigDecimal[] T01AR2_A7743DisFasRec ;
   private boolean[] T01AR2_n7743DisFasRec ;
   private byte[] T01AR2_A7747DisFasAut ;
   private boolean[] T01AR2_n7747DisFasAut ;
   private String[] T01AR2_A396EmprCod ;
   private String[] T01AR2_A457FasCod ;
   private byte[] T01AR2_A7744FasPreObl ;
   private boolean[] T01AR2_n7744FasPreObl ;
   private String[] T01AR25_A460FasDsc ;
   private String[] T01AR25_A456FasActTin ;
   private boolean[] T01AR25_n456FasActTin ;
   private byte[] T01AR25_A7744FasPreObl ;
   private boolean[] T01AR25_n7744FasPreObl ;
   private String[] T01AR26_A396EmprCod ;
   private int[] T01AR26_A361DisCod ;
   private String[] T01AR26_A758ProCod ;
   private short[] T01AR26_A368DisFasLin ;
   private short[] T01AR26_A7919Dta_Ordl ;
   private String[] T01AR27_A396EmprCod ;
   private int[] T01AR27_A361DisCod ;
   private String[] T01AR27_A758ProCod ;
   private short[] T01AR27_A368DisFasLin ;
   private short[] T01AR27_A7727ArtAdiCod ;
   private String[] T01AR28_A396EmprCod ;
   private int[] T01AR28_A361DisCod ;
   private String[] T01AR28_A758ProCod ;
   private short[] T01AR28_A368DisFasLin ;
   private short[] T01AR28_A5377DisQuiLin ;
   private String[] T01AR29_A396EmprCod ;
   private int[] T01AR29_A361DisCod ;
   private String[] T01AR29_A758ProCod ;
   private short[] T01AR29_A368DisFasLin ;
   private int[] T01AR29_A5035A_Discod ;
   private String[] T01AR29_A5038A_DProcod ;
   private short[] T01AR29_A5039A_DOrdlin ;
   private String[] T01AR30_A396EmprCod ;
   private int[] T01AR30_A361DisCod ;
   private String[] T01AR30_A758ProCod ;
   private short[] T01AR30_A368DisFasLin ;
   private short[] T01AR30_A1664ParFasCod ;
   private String[] T01AR31_A396EmprCod ;
   private int[] T01AR31_A361DisCod ;
   private String[] T01AR31_A758ProCod ;
   private short[] T01AR31_A368DisFasLin ;
   private String[] T01AR32_A407EmprNom ;
   private boolean[] T01AR32_n407EmprNom ;
   private String[] T01AR33_A362DisColNom ;
   private boolean[] T01AR33_n362DisColNom ;
   private String[] T01AR33_A335DisArtCod ;
   private int[] T01AR33_A363DisColNum ;
   private boolean[] T01AR33_n363DisColNum ;
   private String[] T01AR33_A757PriCod ;
   private byte[] T01AR33_A390DisTipCol ;
   private boolean[] T01AR33_n390DisTipCol ;
   private int[] T01AR33_A252CliCod ;
   private String[] T01AR34_A279CliNom ;
   private String[] T01AR35_A759ProDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpreartx__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreartx__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreartx__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreartx__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreartx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AR2", "SELECT DisCod, ProCod, DisFasLin, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR3", "SELECT DisCod, ProCod, DisFasLin, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR4", "SELECT FasDsc, FasActTin, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR5", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR6", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR8", "SELECT DisColNom, DisArtCod, DisColNum, PriCod, DisTipCol, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR9", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR10", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR11", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, T5.ProDsc, T3.DisColNom, T3.DisArtCod, T3.DisColNum, T3.PriCod, T4.CliNom, TM1.EmprCod, TM1.DisCod, TM1.ProCod, T3.DisTipCol, T3.CliCod FROM ((((TXPDISLIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AR15", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("T01AR16", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01AR17", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR19", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T2.FasActTin, T1.DisFasPre, T1.DisFasUni, T1.DisFasDto, T1.DisFasRec, T1.FasPreObl, T1.DisFasAut, T1.EmprCod, T1.FasCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR20", "SELECT FasDsc, FasActTin, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR21", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AR22", "INSERT INTO TXPDISFAS(FasPreObl, DisCod, ProCod, DisFasLin, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, EmprCod, FasCod, FasApr, DisMaqPru, DisQuiUl, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01AR23", "UPDATE TXPDISFAS SET FasPreObl=?, DisFasPre=?, DisFasUni=?, DisFasDto=?, DisFasRec=?, DisFasAut=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01AR24", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01AR25", "SELECT FasDsc, FasActTin, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR26", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR27", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR28", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR29", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR30", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AR31", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR32", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR33", "SELECT DisColNom, DisArtCod, DisColNum, PriCod, DisTipCol, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR34", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AR35", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 8);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((String[]) buf[14])[0] = rslt.getString(10, 8);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               ((String[]) buf[19])[0] = rslt.getString(13, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 33 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[14]).byteValue());
               }
               stmt.setString(10, (String)parms[15], 3);
               stmt.setString(11, (String)parms[16], 8);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               stmt.setString(7, (String)parms[12], 8);
               stmt.setString(8, (String)parms[13], 3);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setString(10, (String)parms[15], 8);
               stmt.setShort(11, ((Number) parms[16]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

