package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpreatx_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"DISFASDTOL") == 0 )
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
         gx4asadisfasdtol1AS39( A396EmprCod, A361DisCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"DISFASPREL") == 0 )
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
         gx5asadisfasprel1AS39( A396EmprCod, A361DisCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"DISFASPRMA") == 0 )
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
         gx7asadisfasprma1AS39( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, A456FasActTin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"DISFASPRMI") == 0 )
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
         gx8asadisfasprmi1AS39( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, A456FasActTin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
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
         gxload_12( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A390DisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "DisTipCol"))) ;
         n390DisTipCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A390DisTipCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
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
         gxload_17( A396EmprCod, A457FasCod) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PREATX", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = chkPriCod.getInternalname() ;
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
      nRC_GXsfl_115 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_115"))) ;
      nGXsfl_115_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_115_idx"))) ;
      sGXsfl_115_idx = httpContext.GetPar( "sGXsfl_115_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
      nRC_GXsfl_132 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_132"))) ;
      nGXsfl_132_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_132_idx"))) ;
      sGXsfl_132_idx = httpContext.GetPar( "sGXsfl_132_idx") ;
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

   public tpreatx_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpreatx_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpreatx_impl.class ));
   }

   public tpreatx_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPriCod = UIFactory.getCheckbox(this);
      chkDisDes = UIFactory.getCheckbox(this);
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
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPREATX.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Prioridad", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPriCod.getInternalname(), A757PriCod, "", "", 1, chkPriCod.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(36, this, '1', '0',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,36);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Disposicion Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Disposicion Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecCli_Internalname, localUtil.format(A370DisFecCli, "99/99/99"), localUtil.format( A370DisFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtDisFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPREATX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Articulo Disposicion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Disposicion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPREATX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecEnt_Internalname, localUtil.format(A371DisFecEnt, "99/99/99"), localUtil.format( A371DisFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPREATX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtDisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Desglose", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", "", 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(91, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Numero Piezas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumUni_Enabled!=0) ? localUtil.format( A375DisNumUni, "ZZZZZ9.99") : localUtil.format( A375DisNumUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumUni_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPREATX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol115( ) ;
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      nGXsfl_115_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount38 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_38 = (short)(1) ;
            scanStart1AS38( ) ;
            while ( RcdFound38 != 0 )
            {
               init_level_properties38( ) ;
               getByPrimaryKey1AS38( ) ;
               addRow1AS38( ) ;
               scanNext1AS38( ) ;
            }
            scanEnd1AS38( ) ;
            nBlankRcdCount38 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AS38( ) ;
         standaloneModal1AS38( ) ;
         sMode38 = Gx_mode ;
         while ( nGXsfl_115_idx < nRC_GXsfl_115 )
         {
            bGXsfl_115_Refreshing = true ;
            readRow1AS38( ) ;
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_115_Refreshing);
            if ( ( nRcdExists_38 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AS38( ) ;
            }
            sendRow1AS38( ) ;
            bGXsfl_115_Refreshing = false ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount38 = (short)(5) ;
         nRcdExists_38 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AS38( ) ;
            while ( RcdFound38 != 0 )
            {
               sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_11538( ) ;
               init_level_properties38( ) ;
               standaloneNotModal1AS38( ) ;
               getByPrimaryKey1AS38( ) ;
               standaloneModal1AS38( ) ;
               addRow1AS38( ) ;
               scanNext1AS38( ) ;
            }
            scanEnd1AS38( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode38 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_11538( ) ;
      initAll1AS38( ) ;
      init_level_properties38( ) ;
      nRcdExists_38 = (short)(0) ;
      nIsMod_38 = (short)(0) ;
      nRcdDeleted_38 = (short)(0) ;
      nBlankRcdCount38 = (short)(nBlankRcdUsr38+nBlankRcdCount38) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount38 > 0 )
      {
         standaloneNotModal1AS38( ) ;
         standaloneModal1AS38( ) ;
         addRow1AS38( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
         }
         nBlankRcdCount38 = (short)(nBlankRcdCount38-1) ;
      }
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREATX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPREATX.htm");
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
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z757PriCod = httpContext.cgiGet( "Z757PriCod") ;
         Z360DisCliNum = httpContext.cgiGet( "Z360DisCliNum") ;
         Z370DisFecCli = localUtil.ctod( httpContext.cgiGet( "Z370DisFecCli"), 0) ;
         Z335DisArtCod = httpContext.cgiGet( "Z335DisArtCod") ;
         Z369DisFec = localUtil.ctod( httpContext.cgiGet( "Z369DisFec"), 0) ;
         Z371DisFecEnt = localUtil.ctod( httpContext.cgiGet( "Z371DisFecEnt"), 0) ;
         Z362DisColNom = httpContext.cgiGet( "Z362DisColNom") ;
         Z363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z363DisColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z365DisDes = httpContext.cgiGet( "Z365DisDes") ;
         Z374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z374DisNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z375DisNumUni = localUtil.ctond( httpContext.cgiGet( "Z375DisNumUni")) ;
         Z392DisUniMed = httpContext.cgiGet( "Z392DisUniMed") ;
         Z337DisArtDsc = httpContext.cgiGet( "Z337DisArtDsc") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z390DisTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_115 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDisFecCli_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DISFECCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisFecCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A370DisFecCli = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         }
         else
         {
            A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         }
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
         A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtDisFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DISFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A369DisFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         }
         else
         {
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDisFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DISFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A371DisFecEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         }
         else
         {
            A371DisFecEnt = localUtil.ctod( httpContext.cgiGet( edtDisFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         }
         A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
         n362DisColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A363DisColNum = 0 ;
            n363DisColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         }
         else
         {
            A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n363DisColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A390DisTipCol = (byte)(0) ;
            n390DisTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         }
         else
         {
            A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n390DisTipCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         }
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A374DisNumPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         }
         else
         {
            A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMUNI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A375DisNumUni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         }
         else
         {
            A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         }
         A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
            initAll1AS34( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_39_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_39_Enabled), 5, 0), !bGXsfl_132_Refreshing);
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
      disableAttributes1AS34( ) ;
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

   public void confirm_1AS0( )
   {
      beforeValidate1AS34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AS34( ) ;
         }
         else
         {
            checkExtendedTable1AS34( ) ;
            if ( AnyError == 0 )
            {
               zm1AS34( 11) ;
               zm1AS34( 12) ;
               zm1AS34( 13) ;
            }
            closeExtendedTableCursors1AS34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1AS38( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AS0( ) ;
      }
   }

   public void confirm_1AS39( )
   {
      nGXsfl_132_idx = 0 ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         readRow1AS39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            getKey1AS39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AS39( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AS39( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1AS39( 17) ;
                     }
                     closeExtendedTableCursors1AS39( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISFASLIN_" + sGXsfl_132_idx ;
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
                     getByPrimaryKey1AS39( ) ;
                     load1AS39( ) ;
                     beforeValidate1AS39( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AS39( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AS39( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AS39( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1AS39( 17) ;
                           }
                           closeExtendedTableCursors1AS39( ) ;
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
                     GXCCtl = "DISFASLIN_" + sGXsfl_132_idx ;
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
         httpContext.changePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7740DisFasPre_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7741DisFasUni_"+sGXsfl_132_idx, GXutil.rtrim( Z7741DisFasUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7742DisFasDto_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7742DisFasDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7743DisFasRec_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7743DisFasRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7747DisFasAut_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_132_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_39_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_39_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_39_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_39_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRE_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASUNI_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASREC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREOBL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASAUT_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMI_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMA_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPREL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTOL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPROK_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRLS_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1AS38( )
   {
      nGXsfl_115_idx = 0 ;
      while ( nGXsfl_115_idx < nRC_GXsfl_115 )
      {
         readRow1AS38( ) ;
         if ( ( nRcdExists_38 != 0 ) || ( nIsMod_38 != 0 ) )
         {
            getKey1AS38( ) ;
            if ( ( nRcdExists_38 == 0 ) && ( nRcdDeleted_38 == 0 ) )
            {
               if ( RcdFound38 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AS38( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AS38( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1AS38( 15) ;
                     }
                     closeExtendedTableCursors1AS38( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode38 = Gx_mode ;
                        confirm_1AS39( ) ;
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
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound38 != 0 )
               {
                  if ( nRcdDeleted_38 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AS38( ) ;
                     load1AS38( ) ;
                     beforeValidate1AS38( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AS38( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_38 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AS38( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AS38( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1AS38( 15) ;
                           }
                           closeExtendedTableCursors1AS38( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode38 = Gx_mode ;
                              confirm_1AS39( ) ;
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
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_38 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( "nRC_GXsfl_132_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_132, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_38_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_38_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_38_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_38 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AS0( )
   {
   }

   public void zm1AS34( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z757PriCod = T01AS9_A757PriCod[0] ;
            Z360DisCliNum = T01AS9_A360DisCliNum[0] ;
            Z370DisFecCli = T01AS9_A370DisFecCli[0] ;
            Z335DisArtCod = T01AS9_A335DisArtCod[0] ;
            Z369DisFec = T01AS9_A369DisFec[0] ;
            Z371DisFecEnt = T01AS9_A371DisFecEnt[0] ;
            Z362DisColNom = T01AS9_A362DisColNom[0] ;
            Z363DisColNum = T01AS9_A363DisColNum[0] ;
            Z365DisDes = T01AS9_A365DisDes[0] ;
            Z374DisNumPie = T01AS9_A374DisNumPie[0] ;
            Z375DisNumUni = T01AS9_A375DisNumUni[0] ;
            Z392DisUniMed = T01AS9_A392DisUniMed[0] ;
            Z337DisArtDsc = T01AS9_A337DisArtDsc[0] ;
            Z252CliCod = T01AS9_A252CliCod[0] ;
            Z390DisTipCol = T01AS9_A390DisTipCol[0] ;
         }
         else
         {
            Z757PriCod = A757PriCod ;
            Z360DisCliNum = A360DisCliNum ;
            Z370DisFecCli = A370DisFecCli ;
            Z335DisArtCod = A335DisArtCod ;
            Z369DisFec = A369DisFec ;
            Z371DisFecEnt = A371DisFecEnt ;
            Z362DisColNom = A362DisColNom ;
            Z363DisColNum = A363DisColNum ;
            Z365DisDes = A365DisDes ;
            Z374DisNumPie = A374DisNumPie ;
            Z375DisNumUni = A375DisNumUni ;
            Z392DisUniMed = A392DisUniMed ;
            Z337DisArtDsc = A337DisArtDsc ;
            Z252CliCod = A252CliCod ;
            Z390DisTipCol = A390DisTipCol ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z361DisCod = A361DisCod ;
         Z757PriCod = A757PriCod ;
         Z360DisCliNum = A360DisCliNum ;
         Z370DisFecCli = A370DisFecCli ;
         Z335DisArtCod = A335DisArtCod ;
         Z369DisFec = A369DisFec ;
         Z371DisFecEnt = A371DisFecEnt ;
         Z362DisColNom = A362DisColNom ;
         Z363DisColNum = A363DisColNum ;
         Z365DisDes = A365DisDes ;
         Z374DisNumPie = A374DisNumPie ;
         Z375DisNumUni = A375DisNumUni ;
         Z392DisUniMed = A392DisUniMed ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z390DisTipCol = A390DisTipCol ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01AS10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AS10_A407EmprNom[0] ;
      n407EmprNom = T01AS10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
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

   public void load1AS34( )
   {
      /* Using cursor T01AS13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01AS13_A407EmprNom[0] ;
         n407EmprNom = T01AS13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A757PriCod = T01AS13_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A360DisCliNum = T01AS13_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = T01AS13_A370DisFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A279CliNom = T01AS13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T01AS13_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = T01AS13_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = T01AS13_A371DisFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A362DisColNom = T01AS13_A362DisColNom[0] ;
         n362DisColNom = T01AS13_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A363DisColNum = T01AS13_A363DisColNum[0] ;
         n363DisColNum = T01AS13_n363DisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A365DisDes = T01AS13_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = T01AS13_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = T01AS13_A375DisNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = T01AS13_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A337DisArtDsc = T01AS13_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A252CliCod = T01AS13_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A390DisTipCol = T01AS13_A390DisTipCol[0] ;
         n390DisTipCol = T01AS13_n390DisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         zm1AS34( -10) ;
      }
      pr_default.close(11);
      onLoadActions1AS34( ) ;
   }

   public void onLoadActions1AS34( )
   {
   }

   public void checkExtendedTable1AS34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01AS11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AS11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(9);
      /* Using cursor T01AS12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(10);
      if ( ! ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) || ( GXutil.strcmp(A757PriCod, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = chkPriCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISDES");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisDes.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AS34( )
   {
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01AS14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AS14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_13( String A396EmprCod ,
                          byte A390DisTipCol )
   {
      /* Using cursor T01AS15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1AS34( )
   {
      /* Using cursor T01AS16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AS9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) && ( T01AS9_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AS9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AS34( 10) ;
         RcdFound34 = (short)(1) ;
         A757PriCod = T01AS9_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A360DisCliNum = T01AS9_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = T01AS9_A370DisFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A335DisArtCod = T01AS9_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = T01AS9_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = T01AS9_A371DisFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A362DisColNom = T01AS9_A362DisColNom[0] ;
         n362DisColNom = T01AS9_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A363DisColNum = T01AS9_A363DisColNum[0] ;
         n363DisColNum = T01AS9_n363DisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A365DisDes = T01AS9_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = T01AS9_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = T01AS9_A375DisNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = T01AS9_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A337DisArtDsc = T01AS9_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A252CliCod = T01AS9_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A390DisTipCol = T01AS9_A390DisTipCol[0] ;
         n390DisTipCol = T01AS9_n390DisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AS34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1AS34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1AS34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1AS34( ) ;
      if ( RcdFound34 == 0 )
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
      RcdFound34 = (short)(0) ;
      /* Using cursor T01AS17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01AS17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AS17_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01AS17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AS17_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01AS18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T01AS18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AS18_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T01AS18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AS18_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AS34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = chkPriCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AS34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
               GX_FocusControl = chkPriCod.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1AS34( ) ;
               GX_FocusControl = chkPriCod.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = chkPriCod.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AS34( ) ;
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
                  GX_FocusControl = chkPriCod.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AS34( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         GX_FocusControl = chkPriCod.getInternalname() ;
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
      getKey1AS34( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpreatx");
      GX_FocusControl = chkPriCod.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AS0( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = chkPriCod.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AS34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkPriCod.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AS34( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkPriCod.getInternalname() ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkPriCod.getInternalname() ;
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
      scanStart1AS34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1AS34( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkPriCod.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AS34( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AS34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AS8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z757PriCod, T01AS8_A757PriCod[0]) != 0 ) || ( GXutil.strcmp(Z360DisCliNum, T01AS8_A360DisCliNum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(T01AS8_A370DisFecCli[0])) ) || ( GXutil.strcmp(Z335DisArtCod, T01AS8_A335DisArtCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(T01AS8_A369DisFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(T01AS8_A371DisFecEnt[0])) ) || ( GXutil.strcmp(Z362DisColNom, T01AS8_A362DisColNom[0]) != 0 ) || ( Z363DisColNum != T01AS8_A363DisColNum[0] ) || ( GXutil.strcmp(Z365DisDes, T01AS8_A365DisDes[0]) != 0 ) || ( Z374DisNumPie != T01AS8_A374DisNumPie[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z375DisNumUni, T01AS8_A375DisNumUni[0]) != 0 ) || ( GXutil.strcmp(Z392DisUniMed, T01AS8_A392DisUniMed[0]) != 0 ) || ( GXutil.strcmp(Z337DisArtDsc, T01AS8_A337DisArtDsc[0]) != 0 ) || ( Z252CliCod != T01AS8_A252CliCod[0] ) || ( Z390DisTipCol != T01AS8_A390DisTipCol[0] ) )
         {
            if ( GXutil.strcmp(Z757PriCod, T01AS8_A757PriCod[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"PriCod");
               GXutil.writeLogRaw("Old: ",Z757PriCod);
               GXutil.writeLogRaw("Current: ",T01AS8_A757PriCod[0]);
            }
            if ( GXutil.strcmp(Z360DisCliNum, T01AS8_A360DisCliNum[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisCliNum");
               GXutil.writeLogRaw("Old: ",Z360DisCliNum);
               GXutil.writeLogRaw("Current: ",T01AS8_A360DisCliNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(T01AS8_A370DisFecCli[0])) ) )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFecCli");
               GXutil.writeLogRaw("Old: ",Z370DisFecCli);
               GXutil.writeLogRaw("Current: ",T01AS8_A370DisFecCli[0]);
            }
            if ( GXutil.strcmp(Z335DisArtCod, T01AS8_A335DisArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisArtCod");
               GXutil.writeLogRaw("Old: ",Z335DisArtCod);
               GXutil.writeLogRaw("Current: ",T01AS8_A335DisArtCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(T01AS8_A369DisFec[0])) ) )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFec");
               GXutil.writeLogRaw("Old: ",Z369DisFec);
               GXutil.writeLogRaw("Current: ",T01AS8_A369DisFec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(T01AS8_A371DisFecEnt[0])) ) )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFecEnt");
               GXutil.writeLogRaw("Old: ",Z371DisFecEnt);
               GXutil.writeLogRaw("Current: ",T01AS8_A371DisFecEnt[0]);
            }
            if ( GXutil.strcmp(Z362DisColNom, T01AS8_A362DisColNom[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisColNom");
               GXutil.writeLogRaw("Old: ",Z362DisColNom);
               GXutil.writeLogRaw("Current: ",T01AS8_A362DisColNom[0]);
            }
            if ( Z363DisColNum != T01AS8_A363DisColNum[0] )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisColNum");
               GXutil.writeLogRaw("Old: ",Z363DisColNum);
               GXutil.writeLogRaw("Current: ",T01AS8_A363DisColNum[0]);
            }
            if ( GXutil.strcmp(Z365DisDes, T01AS8_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T01AS8_A365DisDes[0]);
            }
            if ( Z374DisNumPie != T01AS8_A374DisNumPie[0] )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisNumPie");
               GXutil.writeLogRaw("Old: ",Z374DisNumPie);
               GXutil.writeLogRaw("Current: ",T01AS8_A374DisNumPie[0]);
            }
            if ( DecimalUtil.compareTo(Z375DisNumUni, T01AS8_A375DisNumUni[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisNumUni");
               GXutil.writeLogRaw("Old: ",Z375DisNumUni);
               GXutil.writeLogRaw("Current: ",T01AS8_A375DisNumUni[0]);
            }
            if ( GXutil.strcmp(Z392DisUniMed, T01AS8_A392DisUniMed[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisUniMed");
               GXutil.writeLogRaw("Old: ",Z392DisUniMed);
               GXutil.writeLogRaw("Current: ",T01AS8_A392DisUniMed[0]);
            }
            if ( GXutil.strcmp(Z337DisArtDsc, T01AS8_A337DisArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisArtDsc");
               GXutil.writeLogRaw("Old: ",Z337DisArtDsc);
               GXutil.writeLogRaw("Current: ",T01AS8_A337DisArtDsc[0]);
            }
            if ( Z252CliCod != T01AS8_A252CliCod[0] )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01AS8_A252CliCod[0]);
            }
            if ( Z390DisTipCol != T01AS8_A390DisTipCol[0] )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisTipCol");
               GXutil.writeLogRaw("Old: ",Z390DisTipCol);
               GXutil.writeLogRaw("Current: ",T01AS8_A390DisTipCol[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AS34( )
   {
      beforeValidate1AS34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AS34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AS34( 0) ;
         checkOptimisticConcurrency1AS34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AS34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AS34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AS19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A361DisCod), A757PriCod, A360DisCliNum, A370DisFecCli, A335DisArtCod, A369DisFec, A371DisFecEnt, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), A365DisDes, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, A337DisArtDsc, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevel1AS34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AS0( ) ;
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
            load1AS34( ) ;
         }
         endLevel1AS34( ) ;
      }
      closeExtendedTableCursors1AS34( ) ;
   }

   public void update1AS34( )
   {
      beforeValidate1AS34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AS34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AS34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AS34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AS34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AS20 */
                  pr_default.execute(18, new Object[] {A757PriCod, A360DisCliNum, A370DisFecCli, A335DisArtCod, A369DisFec, A371DisFecEnt, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), A365DisDes, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, A337DisArtDsc, Integer.valueOf(A252CliCod), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AS34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                     tpreatx_impl.this.A396EmprCod = GXv_char1[0] ;
                     tpreatx_impl.this.A361DisCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AS34( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AS0( ) ;
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
         endLevel1AS34( ) ;
      }
      closeExtendedTableCursors1AS34( ) ;
   }

   public void deferredUpdate1AS34( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AS34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AS34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AS34( ) ;
         afterConfirm1AS34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AS34( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AS21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound34 == 0 )
                     {
                        initAll1AS34( ) ;
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
                     resetCaption1AS0( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AS34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AS34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AS22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01AS22_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01AS23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01AS24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01AS25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01AS26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01AS27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01AS28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01AS29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01AS30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01AS31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01AS32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01AS33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01AS34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
      }
   }

   public void processNestedLevel1AS38( )
   {
      nGXsfl_115_idx = 0 ;
      while ( nGXsfl_115_idx < nRC_GXsfl_115 )
      {
         readRow1AS38( ) ;
         if ( ( nRcdExists_38 != 0 ) || ( nIsMod_38 != 0 ) )
         {
            standaloneNotModal1AS38( ) ;
            getKey1AS38( ) ;
            if ( ( nRcdExists_38 == 0 ) && ( nRcdDeleted_38 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AS38( ) ;
            }
            else
            {
               if ( RcdFound38 != 0 )
               {
                  if ( ( nRcdDeleted_38 != 0 ) && ( nRcdExists_38 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AS38( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_38 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AS38( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_38 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( "nRC_GXsfl_132_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_132, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_38_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_38_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_38_"+sGXsfl_115_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_38 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AS38( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_38 = (short)(0) ;
      nIsMod_38 = (short)(0) ;
      nRcdDeleted_38 = (short)(0) ;
   }

   public void processLevel1AS34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1AS38( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AS34( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AS34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpreatx");
         if ( AnyError == 0 )
         {
            confirmValues1AS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpreatx");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AS34( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A361DisCod = A361DisCod ;
      this.A758ProCod = A758ProCod ;
      /* Scan By routine */
      /* Using cursor T01AS35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AS34( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd1AS34( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1AS34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AS34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AS34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AS34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AS34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AS34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AS34( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      chkPriCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "Enabled", GXutil.ltrimstr( chkPriCod.getEnabled(), 5, 0), true);
      edtDisCliNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Enabled), 5, 0), true);
      edtDisFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtDisFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecEnt_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDisColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Enabled), 5, 0), true);
      edtDisTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCol_Enabled), 5, 0), true);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtDisNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_115_Refreshing);
   }

   public void zm1AS38( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -14 )
      {
         Z361DisCod = A361DisCod ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal1AS38( )
   {
      /* Using cursor T01AS7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_115_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01AS7_A759ProDsc[0] ;
      pr_default.close(5);
   }

   public void standaloneModal1AS38( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_115_Refreshing);
      }
   }

   public void load1AS38( )
   {
      /* Using cursor T01AS36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A759ProDsc = T01AS36_A759ProDsc[0] ;
         zm1AS38( -14) ;
      }
      pr_default.close(34);
      onLoadActions1AS38( ) ;
   }

   public void onLoadActions1AS38( )
   {
   }

   public void checkExtendedTable1AS38( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AS38( ) ;
   }

   public void closeExtendedTableCursors1AS38( )
   {
   }

   public void enableDisable1AS38( )
   {
   }

   public void getKey1AS38( )
   {
      /* Using cursor T01AS37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(35);
   }

   public void getByPrimaryKey1AS38( )
   {
      /* Using cursor T01AS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(4) != 101) && ( T01AS6_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AS6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01AS6_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm1AS38( 14) ;
         RcdFound38 = (short)(1) ;
         initializeNonKey1AS38( ) ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AS38( ) ;
         load1AS38( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1AS38( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AS38( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AS38( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1AS38( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AS5 */
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

   public void insert1AS38( )
   {
      beforeValidate1AS38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AS38( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AS38( 0) ;
         checkOptimisticConcurrency1AS38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AS38( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AS38( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AS38 */
                  pr_default.execute(36, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( (pr_default.getStatus(36) == 1) )
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
                        processLevel1AS38( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1AS38( ) ;
         }
         endLevel1AS38( ) ;
      }
      closeExtendedTableCursors1AS38( ) ;
   }

   public void update1AS38( )
   {
      beforeValidate1AS38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AS38( ) ;
      }
      if ( ( nIsMod_38 != 0 ) || ( nIsDirty_38 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AS38( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AS38( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AS38( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPDISLIN */
                     deferredUpdate1AS38( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char1[0] = A396EmprCod ;
                        GXv_int2[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                        tpreatx_impl.this.A396EmprCod = GXv_char1[0] ;
                        tpreatx_impl.this.A361DisCod = GXv_int2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1AS38( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1AS38( ) ;
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
            endLevel1AS38( ) ;
         }
      }
      closeExtendedTableCursors1AS38( ) ;
   }

   public void deferredUpdate1AS38( )
   {
   }

   public void delete1AS38( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AS38( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AS38( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AS38( ) ;
         afterConfirm1AS38( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AS38( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AS39( ) ;
               while ( RcdFound39 != 0 )
               {
                  getByPrimaryKey1AS39( ) ;
                  delete1AS39( ) ;
                  scanNext1AS39( ) ;
               }
               scanEnd1AS39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AS39 */
                  pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
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
      }
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AS38( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AS38( )
   {
      standaloneModal1AS38( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01AS40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void processNestedLevel1AS39( )
   {
      nGXsfl_132_idx = 0 ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         readRow1AS39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            standaloneNotModal1AS39( ) ;
            getKey1AS39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AS39( ) ;
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( ( nRcdDeleted_39 != 0 ) && ( nRcdExists_39 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AS39( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AS39( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_132_idx ;
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
         httpContext.changePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7740DisFasPre_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7741DisFasUni_"+sGXsfl_132_idx, GXutil.rtrim( Z7741DisFasUni)) ;
         httpContext.changePostValue( "ZT_"+"Z7742DisFasDto_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7742DisFasDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7743DisFasRec_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7743DisFasRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7747DisFasAut_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_132_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_39_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_39_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_39_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_39_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRE_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASUNI_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASREC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREOBL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASAUT_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMI_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRMA_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPREL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASDTOL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPROK_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASPRLS_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AS39( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
   }

   public void processLevel1AS38( )
   {
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      processNestedLevel1AS39( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AS38( )
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

   public void scanStart1AS38( )
   {
      /* Scan By routine */
      /* Using cursor T01AS41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AS38( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
   }

   public void scanEnd1AS38( )
   {
      pr_default.close(39);
   }

   public void afterConfirm1AS38( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AS38( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AS38( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AS38( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AS38( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AS38( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AS38( )
   {
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_115_Refreshing);
   }

   public void zm1AS39( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7740DisFasPre = T01AS3_A7740DisFasPre[0] ;
            Z7741DisFasUni = T01AS3_A7741DisFasUni[0] ;
            Z7742DisFasDto = T01AS3_A7742DisFasDto[0] ;
            Z7743DisFasRec = T01AS3_A7743DisFasRec[0] ;
            Z7747DisFasAut = T01AS3_A7747DisFasAut[0] ;
            Z457FasCod = T01AS3_A457FasCod[0] ;
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
      if ( GX_JID == -16 )
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

   public void standaloneNotModal1AS39( )
   {
   }

   public void standaloneModal1AS39( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
      else
      {
         edtDisFasLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
   }

   public void load1AS39( )
   {
      /* Using cursor T01AS42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A460FasDsc = T01AS42_A460FasDsc[0] ;
         A456FasActTin = T01AS42_A456FasActTin[0] ;
         n456FasActTin = T01AS42_n456FasActTin[0] ;
         A7740DisFasPre = T01AS42_A7740DisFasPre[0] ;
         n7740DisFasPre = T01AS42_n7740DisFasPre[0] ;
         A7741DisFasUni = T01AS42_A7741DisFasUni[0] ;
         n7741DisFasUni = T01AS42_n7741DisFasUni[0] ;
         A7742DisFasDto = T01AS42_A7742DisFasDto[0] ;
         n7742DisFasDto = T01AS42_n7742DisFasDto[0] ;
         A7743DisFasRec = T01AS42_A7743DisFasRec[0] ;
         n7743DisFasRec = T01AS42_n7743DisFasRec[0] ;
         A7744FasPreObl = T01AS42_A7744FasPreObl[0] ;
         n7744FasPreObl = T01AS42_n7744FasPreObl[0] ;
         A7747DisFasAut = T01AS42_A7747DisFasAut[0] ;
         n7747DisFasAut = T01AS42_n7747DisFasAut[0] ;
         A457FasCod = T01AS42_A457FasCod[0] ;
         zm1AS39( -16) ;
      }
      pr_default.close(40);
      onLoadActions1AS39( ) ;
   }

   public void onLoadActions1AS39( )
   {
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = A361DisCod ;
      GXv_char4[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char6[0] = "D" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char1[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int2[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char4[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int3) ;
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int2[0] = A361DisCod ;
      GXv_char4[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char1[0] = "P" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char4, GXv_int5, GXv_char1, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char6[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int2[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char4[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int3) ;
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
      GXv_char6[0] = A396EmprCod ;
      GXv_int2[0] = A252CliCod ;
      GXv_char4[0] = A335DisArtCod ;
      GXv_char1[0] = A362DisColNom ;
      GXv_int9[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char11[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char4, GXv_char1, GXv_int9, GXv_int10, GXv_char11, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char6[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int2[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char4[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char1[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int9[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char11[0] ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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

   public void checkExtendedTable1AS39( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AS39( ) ;
      /* Using cursor T01AS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01AS4_A460FasDsc[0] ;
      A456FasActTin = T01AS4_A456FasActTin[0] ;
      n456FasActTin = T01AS4_n456FasActTin[0] ;
      A7744FasPreObl = T01AS4_A7744FasPreObl[0] ;
      n7744FasPreObl = T01AS4_n7744FasPreObl[0] ;
      pr_default.close(2);
      nIsDirty_39 = (short)(1) ;
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char6[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char4[0] = "D" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int3) ;
      nIsDirty_39 = (short)(1) ;
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char6[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char4[0] = "P" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int3) ;
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
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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
         GXCCtl = "DISFASUNI_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbDisFasUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AS39( )
   {
      pr_default.close(2);
   }

   public void enableDisable1AS39( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01AS43 */
      pr_default.execute(41, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(41) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01AS43_A460FasDsc[0] ;
      A456FasActTin = T01AS43_A456FasActTin[0] ;
      n456FasActTin = T01AS43_n456FasActTin[0] ;
      A7744FasPreObl = T01AS43_A7744FasPreObl[0] ;
      n7744FasPreObl = T01AS43_n7744FasPreObl[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(41) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(41);
   }

   public void getKey1AS39( )
   {
      /* Using cursor T01AS44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKey1AS39( )
   {
      /* Using cursor T01AS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01AS3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01AS3_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01AS3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AS39( 16) ;
         RcdFound39 = (short)(1) ;
         initializeNonKey1AS39( ) ;
         A368DisFasLin = T01AS3_A368DisFasLin[0] ;
         A7740DisFasPre = T01AS3_A7740DisFasPre[0] ;
         n7740DisFasPre = T01AS3_n7740DisFasPre[0] ;
         A7741DisFasUni = T01AS3_A7741DisFasUni[0] ;
         n7741DisFasUni = T01AS3_n7741DisFasUni[0] ;
         A7742DisFasDto = T01AS3_A7742DisFasDto[0] ;
         n7742DisFasDto = T01AS3_n7742DisFasDto[0] ;
         A7743DisFasRec = T01AS3_A7743DisFasRec[0] ;
         n7743DisFasRec = T01AS3_n7743DisFasRec[0] ;
         A7747DisFasAut = T01AS3_A7747DisFasAut[0] ;
         n7747DisFasAut = T01AS3_n7747DisFasAut[0] ;
         A457FasCod = T01AS3_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AS39( ) ;
         load1AS39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1AS39( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AS39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AS39( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AS39( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7740DisFasPre, T01AS2_A7740DisFasPre[0]) != 0 ) || ( GXutil.strcmp(Z7741DisFasUni, T01AS2_A7741DisFasUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z7742DisFasDto, T01AS2_A7742DisFasDto[0]) != 0 ) || ( DecimalUtil.compareTo(Z7743DisFasRec, T01AS2_A7743DisFasRec[0]) != 0 ) || ( Z7747DisFasAut != T01AS2_A7747DisFasAut[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z457FasCod, T01AS2_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7740DisFasPre, T01AS2_A7740DisFasPre[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFasPre");
               GXutil.writeLogRaw("Old: ",Z7740DisFasPre);
               GXutil.writeLogRaw("Current: ",T01AS2_A7740DisFasPre[0]);
            }
            if ( GXutil.strcmp(Z7741DisFasUni, T01AS2_A7741DisFasUni[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFasUni");
               GXutil.writeLogRaw("Old: ",Z7741DisFasUni);
               GXutil.writeLogRaw("Current: ",T01AS2_A7741DisFasUni[0]);
            }
            if ( DecimalUtil.compareTo(Z7742DisFasDto, T01AS2_A7742DisFasDto[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFasDto");
               GXutil.writeLogRaw("Old: ",Z7742DisFasDto);
               GXutil.writeLogRaw("Current: ",T01AS2_A7742DisFasDto[0]);
            }
            if ( DecimalUtil.compareTo(Z7743DisFasRec, T01AS2_A7743DisFasRec[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFasRec");
               GXutil.writeLogRaw("Old: ",Z7743DisFasRec);
               GXutil.writeLogRaw("Current: ",T01AS2_A7743DisFasRec[0]);
            }
            if ( Z7747DisFasAut != T01AS2_A7747DisFasAut[0] )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"DisFasAut");
               GXutil.writeLogRaw("Old: ",Z7747DisFasAut);
               GXutil.writeLogRaw("Current: ",T01AS2_A7747DisFasAut[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01AS2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tpreatx:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01AS2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AS39( )
   {
      beforeValidate1AS39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AS39( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AS39( 0) ;
         checkOptimisticConcurrency1AS39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AS39( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AS39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AS45 */
                  pr_default.execute(43, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(43) == 1) )
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
            load1AS39( ) ;
         }
         endLevel1AS39( ) ;
      }
      closeExtendedTableCursors1AS39( ) ;
   }

   public void update1AS39( )
   {
      beforeValidate1AS39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AS39( ) ;
      }
      if ( ( nIsMod_39 != 0 ) || ( nIsDirty_39 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AS39( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AS39( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AS39( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AS46 */
                     pr_default.execute(44, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AS39( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char11[0] = A396EmprCod ;
                        GXv_int9[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char11, GXv_int9) ;
                        tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
                        tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AS39( ) ;
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
            endLevel1AS39( ) ;
         }
      }
      closeExtendedTableCursors1AS39( ) ;
   }

   public void deferredUpdate1AS39( )
   {
   }

   public void delete1AS39( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AS39( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AS39( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AS39( ) ;
         afterConfirm1AS39( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AS39( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AS47 */
               pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
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
      endLevel1AS39( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AS39( )
   {
      standaloneModal1AS39( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AS48 */
         pr_default.execute(46, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01AS48_A460FasDsc[0] ;
         A456FasActTin = T01AS48_A456FasActTin[0] ;
         n456FasActTin = T01AS48_n456FasActTin[0] ;
         A7744FasPreObl = T01AS48_A7744FasPreObl[0] ;
         n7744FasPreObl = T01AS48_n7744FasPreObl[0] ;
         pr_default.close(46);
         GXt_decimal8 = A7746DisFasPrMa ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char6[0] = A335DisArtCod ;
         GXv_char4[0] = A362DisColNom ;
         GXv_int2[0] = A363DisColNum ;
         GXv_int10[0] = A390DisTipCol ;
         GXv_char1[0] = A456FasActTin ;
         GXv_decimal12[0] = GXt_decimal8 ;
         new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
         tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
         tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
         tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
         tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
         tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
         tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
         tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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
         GXv_char6[0] = A335DisArtCod ;
         GXv_char4[0] = A362DisColNom ;
         GXv_int2[0] = A363DisColNum ;
         GXv_int10[0] = A390DisTipCol ;
         GXv_char1[0] = A456FasActTin ;
         GXv_decimal12[0] = GXt_decimal8 ;
         new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
         tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
         tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
         tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
         tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
         tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
         tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
         tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A7745DisFasPrMi = GXt_decimal8 ;
         GXt_int3 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A361DisCod ;
         GXv_char6[0] = A457FasCod ;
         GXv_int5[0] = (short)(0) ;
         GXv_char4[0] = "D" ;
         GXv_int7[0] = GXt_int3 ;
         new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
         tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
         tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
         tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int3) ;
         GXt_int3 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A361DisCod ;
         GXv_char6[0] = A457FasCod ;
         GXv_int5[0] = (short)(0) ;
         GXv_char4[0] = "P" ;
         GXv_int7[0] = GXt_int3 ;
         new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
         tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
         tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
         tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
         tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int3) ;
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
         /* Using cursor T01AS49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01AS50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01AS51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01AS52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01AS53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
      }
   }

   public void endLevel1AS39( )
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

   public void scanStart1AS39( )
   {
      /* Scan By routine */
      /* Using cursor T01AS54 */
      pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01AS54_A368DisFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AS39( )
   {
      /* Scan next routine */
      pr_default.readNext(52);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01AS54_A368DisFasLin[0] ;
      }
   }

   public void scanEnd1AS39( )
   {
      pr_default.close(52);
   }

   public void afterConfirm1AS39( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AS39( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AS39( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AS39( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AS39( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AS39( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AS39( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDisColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Enabled), 5, 0), true);
      edtDisTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCol_Enabled), 5, 0), true);
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPre_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      cmbDisFasUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisFasUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisFasUni.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDto_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasRec_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      chkFasPreObl.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreObl.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
      chkDisFasAut.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasAut.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasPrMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMi_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasPrMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMa_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasPreL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasPreL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPreL_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtDisFasDtoL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasDtoL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDtoL_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      chkDisFasPrOk.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrOk.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
      chkDisFasPrLs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrLs.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
   }

   public void send_integrity_lvl_hashes1AS39( )
   {
   }

   public void send_integrity_lvl_hashes1AS38( )
   {
   }

   public void send_integrity_lvl_hashes1AS34( )
   {
   }

   public void subsflControlProps_11538( )
   {
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_115_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_115_idx ;
      lblTextblock21_Internalname = "TEXTBLOCK21_"+sGXsfl_115_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_115_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_115_idx ;
   }

   public void subsflControlProps_fel_11538( )
   {
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_115_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_115_fel_idx ;
      lblTextblock21_Internalname = "TEXTBLOCK21_"+sGXsfl_115_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_115_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_115_fel_idx ;
   }

   public void addRow1AS38( )
   {
      nRC_GXsfl_132 = 0 ;
      nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_11538( ) ;
      sendRow1AS38( ) ;
   }

   public void sendRow1AS38( )
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
         if ( ((int)((nGXsfl_115_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_115_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_115_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_115_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock20_Internalname,httpContext.getMessage( "Codigo Proceso", ""),"","",lblTextblock20_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_115_idx + "',115)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock21_Internalname,httpContext.getMessage( "Descripcion Proceso", ""),"","",lblTextblock21_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol132( ) ;
      nGXsfl_132_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount39 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_39 = (short)(1) ;
            scanStart1AS39( ) ;
            while ( RcdFound39 != 0 )
            {
               init_level_properties39( ) ;
               getByPrimaryKey1AS39( ) ;
               addRow1AS39( ) ;
               scanNext1AS39( ) ;
            }
            scanEnd1AS39( ) ;
            nBlankRcdCount39 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AS39( ) ;
         standaloneModal1AS39( ) ;
         sMode39 = Gx_mode ;
         while ( nGXsfl_132_idx < nRC_GXsfl_132 )
         {
            bGXsfl_132_Refreshing = true ;
            readRow1AS39( ) ;
            edtavnRcdDeleted_39_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_39_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_39_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_39_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRE_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPre_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            cmbDisFasUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASUNI_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbDisFasUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisFasUni.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTO_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDto_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASREC_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasRec_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            chkFasPreObl.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreObl.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
            chkDisFasAut.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASAUT_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasAut.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasPrMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMI_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMi_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasPrMa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMA_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPrMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPrMa_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasPreL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPREL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasPreL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasPreL_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtDisFasDtoL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTOL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasDtoL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasDtoL_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            chkDisFasPrOk.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPROK_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrOk.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
            chkDisFasPrLs.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRLS_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFasPrLs.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
            if ( ( nRcdExists_39 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AS39( ) ;
            }
            sendRow1AS39( ) ;
            bGXsfl_132_Refreshing = false ;
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
            scanStart1AS39( ) ;
            while ( RcdFound39 != 0 )
            {
               sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx+1), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
               subsflControlProps_13239( ) ;
               init_level_properties39( ) ;
               standaloneNotModal1AS39( ) ;
               getByPrimaryKey1AS39( ) ;
               standaloneModal1AS39( ) ;
               addRow1AS39( ) ;
               scanNext1AS39( ) ;
            }
            scanEnd1AS39( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode39 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx+1), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
      subsflControlProps_13239( ) ;
      initAll1AS39( ) ;
      init_level_properties39( ) ;
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 115 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_115_idx, ".")) == 0 ) )
      {
         nBlankRcdCount39 = (short)(nBlankRcdUsr39+nBlankRcdCount39) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount39 > 0 )
      {
         standaloneNotModal1AS39( ) ;
         standaloneModal1AS39( ) ;
         addRow1AS39( ) ;
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
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_115_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_115_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_115_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AS38( ) ;
      GXCCtl = "nRC_GXsfl_132_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_132_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_38_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_38_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_38_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_115_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV16UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_115_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_115_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AS38( )
   {
      nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_11538( ) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_115_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      GXCCtl = "nRC_GXsfl_132_" + sGXsfl_115_idx ;
      nRC_GXsfl_132 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_38_" + sGXsfl_115_idx ;
      nRcdDeleted_38 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_38_" + sGXsfl_115_idx ;
      nRcdExists_38 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_38_" + sGXsfl_115_idx ;
      nIsMod_38 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_132_" + sGXsfl_115_idx ;
      nRC_GXsfl_132 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_13239( )
   {
      edtavnRcdDeleted_39_Internalname = "vNRCDDELETED_39_"+sGXsfl_132_idx ;
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_132_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_132_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_132_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_132_idx ;
      edtDisFasPre_Internalname = "DISFASPRE_"+sGXsfl_132_idx ;
      cmbDisFasUni.setInternalname( "DISFASUNI_"+sGXsfl_132_idx );
      edtDisFasDto_Internalname = "DISFASDTO_"+sGXsfl_132_idx ;
      edtDisFasRec_Internalname = "DISFASREC_"+sGXsfl_132_idx ;
      chkFasPreObl.setInternalname( "FASPREOBL_"+sGXsfl_132_idx );
      chkDisFasAut.setInternalname( "DISFASAUT_"+sGXsfl_132_idx );
      edtDisFasPrMi_Internalname = "DISFASPRMI_"+sGXsfl_132_idx ;
      edtDisFasPrMa_Internalname = "DISFASPRMA_"+sGXsfl_132_idx ;
      edtDisFasPreL_Internalname = "DISFASPREL_"+sGXsfl_132_idx ;
      edtDisFasDtoL_Internalname = "DISFASDTOL_"+sGXsfl_132_idx ;
      chkDisFasPrOk.setInternalname( "DISFASPROK_"+sGXsfl_132_idx );
      chkDisFasPrLs.setInternalname( "DISFASPRLS_"+sGXsfl_132_idx );
   }

   public void subsflControlProps_fel_13239( )
   {
      edtavnRcdDeleted_39_Internalname = "vNRCDDELETED_39_"+sGXsfl_132_fel_idx ;
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_132_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_132_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_132_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_132_fel_idx ;
      edtDisFasPre_Internalname = "DISFASPRE_"+sGXsfl_132_fel_idx ;
      cmbDisFasUni.setInternalname( "DISFASUNI_"+sGXsfl_132_fel_idx );
      edtDisFasDto_Internalname = "DISFASDTO_"+sGXsfl_132_fel_idx ;
      edtDisFasRec_Internalname = "DISFASREC_"+sGXsfl_132_fel_idx ;
      chkFasPreObl.setInternalname( "FASPREOBL_"+sGXsfl_132_fel_idx );
      chkDisFasAut.setInternalname( "DISFASAUT_"+sGXsfl_132_fel_idx );
      edtDisFasPrMi_Internalname = "DISFASPRMI_"+sGXsfl_132_fel_idx ;
      edtDisFasPrMa_Internalname = "DISFASPRMA_"+sGXsfl_132_fel_idx ;
      edtDisFasPreL_Internalname = "DISFASPREL_"+sGXsfl_132_fel_idx ;
      edtDisFasDtoL_Internalname = "DISFASDTOL_"+sGXsfl_132_fel_idx ;
      chkDisFasPrOk.setInternalname( "DISFASPROK_"+sGXsfl_132_fel_idx );
      chkDisFasPrLs.setInternalname( "DISFASPRLS_"+sGXsfl_132_fel_idx );
   }

   public void addRow1AS39( )
   {
      nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
      subsflControlProps_13239( ) ;
      sendRow1AS39( ) ;
   }

   public void sendRow1AS39( )
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
         if ( ((int)((nGXsfl_132_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_39_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_39_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_39), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_39), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_39_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_39_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPre_Internalname,GXutil.ltrim( localUtil.ntoc( A7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPre_Enabled!=0) ? localUtil.format( A7740DisFasPre, "ZZZZZZZ.99") : localUtil.format( A7740DisFasPre, "ZZZZZZZ.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      if ( ( cmbDisFasUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "DISFASUNI_" + sGXsfl_132_idx ;
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
      Grid2Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDisFasUni,cmbDisFasUni.getInternalname(),GXutil.rtrim( A7741DisFasUni),Integer.valueOf(1),cmbDisFasUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbDisFasUni.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbDisFasUni.setValue( GXutil.rtrim( A7741DisFasUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisFasUni.getInternalname(), "Values", cmbDisFasUni.ToJavascriptSource(), !bGXsfl_132_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasDto_Internalname,GXutil.ltrim( localUtil.ntoc( A7742DisFasDto, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasDto_Enabled!=0) ? localUtil.format( A7742DisFasDto, "ZZ9.99 %") : localUtil.format( A7742DisFasDto, "ZZ9.99 %"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,140);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasRec_Internalname,GXutil.ltrim( localUtil.ntoc( A7743DisFasRec, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasRec_Enabled!=0) ? localUtil.format( A7743DisFasRec, "ZZ9.99 %") : localUtil.format( A7743DisFasRec, "ZZ9.99 %"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "FASPREOBL_" + sGXsfl_132_idx ;
      chkFasPreObl.setName( GXCCtl );
      chkFasPreObl.setWebtags( "" );
      chkFasPreObl.setCaption( httpContext.getMessage( "Precio Obligatorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "TitleCaption", chkFasPreObl.getCaption(), !bGXsfl_132_Refreshing);
      chkFasPreObl.setCheckedValue( "0" );
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasPreObl.getInternalname(),GXutil.str( A7744FasPreObl, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkFasPreObl.getEnabled()),"1",httpContext.getMessage( "Precio Obligatorio", ""),StyleString,ClassString,"","",""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_38_" + sGXsfl_115_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISFASAUT_" + sGXsfl_132_idx ;
      chkDisFasAut.setName( GXCCtl );
      chkDisFasAut.setWebtags( "" );
      chkDisFasAut.setCaption( httpContext.getMessage( "Aut.?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "TitleCaption", chkDisFasAut.getCaption(), !bGXsfl_132_Refreshing);
      chkDisFasAut.setCheckedValue( "0" );
      A7747DisFasAut = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7747DisFasAut = false ;
      Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFasAut.getInternalname(),GXutil.str( A7747DisFasAut, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkDisFasAut.getEnabled()),"1",httpContext.getMessage( "Aut.?", ""),StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(143, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPrMi_Internalname,GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPrMi_Enabled!=0) ? localUtil.format( A7745DisFasPrMi, "ZZZZZZ9.99") : localUtil.format( A7745DisFasPrMi, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPrMi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPrMi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPrMa_Internalname,GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPrMa_Enabled!=0) ? localUtil.format( A7746DisFasPrMa, "ZZZZZZ9.99") : localUtil.format( A7746DisFasPrMa, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPrMa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPrMa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasPreL_Internalname,GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(7), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasPreL_Enabled!=0) ? localUtil.format( A8509DisFasPreL, "ZZZ,ZZ9") : localUtil.format( A8509DisFasPreL, "ZZZ,ZZ9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasPreL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasPreL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasDtoL_Internalname,GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisFasDtoL_Enabled!=0) ? localUtil.format( A8510DisFasDtoL, "Z9.99 %") : localUtil.format( A8510DisFasDtoL, "Z9.99 %"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasDtoL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasDtoL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISFASPROK_" + sGXsfl_132_idx ;
      chkDisFasPrOk.setName( GXCCtl );
      chkDisFasPrOk.setWebtags( "" );
      chkDisFasPrOk.setCaption( httpContext.getMessage( "Precio Ok", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "TitleCaption", chkDisFasPrOk.getCaption(), !bGXsfl_132_Refreshing);
      chkDisFasPrOk.setCheckedValue( "1" );
      A7748DisFasPrOk = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), ".", "")), "0")==0) ? 0 : 1)) ;
      Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFasPrOk.getInternalname(),GXutil.str( A7748DisFasPrOk, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkDisFasPrOk.getEnabled()),"0",httpContext.getMessage( "Precio Ok", ""),StyleString,ClassString,"","",""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISFASPRLS_" + sGXsfl_132_idx ;
      chkDisFasPrLs.setName( GXCCtl );
      chkDisFasPrLs.setWebtags( "" );
      chkDisFasPrLs.setCaption( httpContext.getMessage( "Lst", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "TitleCaption", chkDisFasPrLs.getCaption(), !bGXsfl_132_Refreshing);
      chkDisFasPrLs.setCheckedValue( "0" );
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisFasPrLs.getInternalname(),GXutil.str( A8508DisFasPrLs, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkDisFasPrLs.getEnabled()),"1",httpContext.getMessage( "Lst", ""),StyleString,ClassString,"","",""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1AS39( ) ;
      GXCCtl = "Z368DisFasLin_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7740DisFasPre_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7740DisFasPre, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7741DisFasUni_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7741DisFasUni));
      GXCCtl = "Z7742DisFasDto_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7742DisFasDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7743DisFasRec_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7743DisFasRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7747DisFasAut_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7747DisFasAut, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_39_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_39_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV16UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_39_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASLIN_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRE_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASUNI_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASDTO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASREC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASAUT_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRMI_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRMA_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPREL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASDTOL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPROK_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASPRLS_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1AS39( )
   {
      nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
      subsflControlProps_13239( ) ;
      edtavnRcdDeleted_39_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_39_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRE_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbDisFasUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASUNI_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDisFasDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTO_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASREC_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkFasPreObl.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisFasAut.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASAUT_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDisFasPrMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMI_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasPrMa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRMA_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasPreL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPREL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasDtoL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASDTOL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkDisFasPrOk.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPROK_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkDisFasPrLs.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISFASPRLS_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
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
         GXCCtl = "DISFASLIN_" + sGXsfl_132_idx ;
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
         GXCCtl = "DISFASPRE_" + sGXsfl_132_idx ;
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
         GXCCtl = "DISFASDTO_" + sGXsfl_132_idx ;
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
         GXCCtl = "DISFASREC_" + sGXsfl_132_idx ;
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
         GXCCtl = "DISFASAUT_" + sGXsfl_132_idx ;
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
      GXCCtl = "Z368DisFasLin_" + sGXsfl_132_idx ;
      Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7740DisFasPre_" + sGXsfl_132_idx ;
      Z7740DisFasPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7741DisFasUni_" + sGXsfl_132_idx ;
      Z7741DisFasUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7742DisFasDto_" + sGXsfl_132_idx ;
      Z7742DisFasDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7743DisFasRec_" + sGXsfl_132_idx ;
      Z7743DisFasRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7747DisFasAut_" + sGXsfl_132_idx ;
      Z7747DisFasAut = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_132_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_132_idx ;
      nRcdDeleted_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_39_" + sGXsfl_132_idx ;
      nRcdExists_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_39_" + sGXsfl_132_idx ;
      nIsMod_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisFasLin_Enabled = edtDisFasLin_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValues1AS0( )
   {
      nGXsfl_115_idx = 0 ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_11538( ) ;
      while ( nGXsfl_115_idx < nRC_GXsfl_115 )
      {
         nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_11538( ) ;
      }
      nGXsfl_132_idx = 0 ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
      subsflControlProps_13239( ) ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
         subsflControlProps_13239( ) ;
         httpContext.changePostValue( "Z368DisFasLin_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z368DisFasLin_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z7740DisFasPre_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z7740DisFasPre_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7740DisFasPre_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z7741DisFasUni_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z7741DisFasUni_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7741DisFasUni_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z7742DisFasDto_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z7742DisFasDto_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7742DisFasDto_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z7743DisFasRec_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z7743DisFasRec_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7743DisFasRec_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z7747DisFasAut_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z7747DisFasAut_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7747DisFasAut_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_132_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpreatx", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(AV16UsurCod))}, new String[] {"EmprCod","DisCod","ProCod","UsurCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z360DisCliNum", GXutil.rtrim( Z360DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z370DisFecCli", localUtil.dtoc( Z370DisFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z369DisFec", localUtil.dtoc( Z369DisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z371DisFecEnt", localUtil.dtoc( Z371DisFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z363DisColNum", GXutil.ltrim( localUtil.ntoc( Z363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z375DisNumUni", GXutil.ltrim( localUtil.ntoc( Z375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z337DisArtDsc", GXutil.rtrim( Z337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z390DisTipCol", GXutil.ltrim( localUtil.ntoc( Z390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_115", GXutil.ltrim( localUtil.ntoc( nGXsfl_115_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpreatx", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(AV16UsurCod))}, new String[] {"EmprCod","DisCod","ProCod","UsurCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPREATX" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PREATX", "") ;
   }

   public void initializeNonKey1AS34( )
   {
      A757PriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      A360DisCliNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
      A370DisFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A369DisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A371DisFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
      A362DisColNom = "" ;
      n362DisColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      A363DisColNum = 0 ;
      n363DisColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      A390DisTipCol = (byte)(0) ;
      n390DisTipCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A374DisNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
      A375DisNumUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A337DisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      Z757PriCod = "" ;
      Z360DisCliNum = "" ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z362DisColNom = "" ;
      Z363DisColNum = 0 ;
      Z365DisDes = "" ;
      Z374DisNumPie = (short)(0) ;
      Z375DisNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z337DisArtDsc = "" ;
      Z252CliCod = 0 ;
      Z390DisTipCol = (byte)(0) ;
   }

   public void initAll1AS34( )
   {
      initializeNonKey1AS34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AS38( )
   {
   }

   public void initAll1AS38( )
   {
      initializeNonKey1AS38( ) ;
   }

   public void standaloneModalInsert1AS38( )
   {
   }

   public void initializeNonKey1AS39( )
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

   public void initAll1AS39( )
   {
      A368DisFasLin = (short)(0) ;
      initializeNonKey1AS39( ) ;
   }

   public void standaloneModalInsert1AS39( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564279", true, true);
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
      httpContext.AddJavascriptSource("tpreatx.js", "?20268241564279", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties38( )
   {
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_115_Refreshing);
   }

   public void init_level_properties39( )
   {
      edtDisFasLin_Enabled = defedtDisFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_132_Refreshing);
   }

   public void startgridcontrol115( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock20_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock21_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol132( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_39_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7740DisFasPre, (byte)(10), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A7741DisFasUni));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisFasUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7742DisFasDto, (byte)(8), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7743DisFasRec, (byte)(8), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreObl.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasAut.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7745DisFasPrMi, (byte)(10), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7746DisFasPrMa, (byte)(10), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPrMa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8509DisFasPreL, (byte)(7), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasPreL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8510DisFasDtoL, (byte)(7), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasDtoL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrOk.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisFasPrLs.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      chkPriCod.setInternalname( "PRICOD" );
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisCliNum_Internalname = "DISCLINUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisFecCli_Internalname = "DISFECCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDisFec_Internalname = "DISFEC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDisFecEnt_Internalname = "DISFECENT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDisColNum_Internalname = "DISCOLNUM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDisTipCol_Internalname = "DISTIPCOL" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      chkDisDes.setInternalname( "DISDES" );
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDisNumUni_Internalname = "DISNUMUNI" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtProDsc_Internalname = "PRODSC" ;
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
      tblTable3_Internalname = "TABLE3" ;
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
      lblTextblock21_Caption = httpContext.getMessage( "Descripcion Proceso", "") ;
      lblTextblock20_Caption = httpContext.getMessage( "Codigo Proceso", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PREATX", "") );
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
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
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
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtDsc_Enabled = 1 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtDisUniMed_Enabled = 1 ;
      edtDisNumUni_Jsonclick = "" ;
      edtDisNumUni_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumUni_Enabled = 1 ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumPie_Enabled = 1 ;
      chkDisDes.setIBackground( (int)(0xFFFFFF) );
      chkDisDes.setEnabled( 1 );
      edtDisTipCol_Jsonclick = "" ;
      edtDisTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtDisTipCol_Enabled = 1 ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNum_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNum_Enabled = 1 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNom_Enabled = 1 ;
      edtDisFecEnt_Jsonclick = "" ;
      edtDisFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDisFecEnt_Enabled = 1 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Backcolor = (int)(0xFFFFFF) ;
      edtDisFec_Enabled = 1 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtDisFecCli_Jsonclick = "" ;
      edtDisFecCli_Backcolor = (int)(0xFFFFFF) ;
      edtDisFecCli_Enabled = 1 ;
      edtDisCliNum_Jsonclick = "" ;
      edtDisCliNum_Backcolor = (int)(0xFFFFFF) ;
      edtDisCliNum_Enabled = 1 ;
      chkPriCod.setIBackground( (int)(0xFFFFFF) );
      chkPriCod.setEnabled( 1 );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gx4asadisfasdtol1AS39( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A457FasCod )
   {
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char6[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char4[0] = "D" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int3) ;
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

   public void gx5asadisfasprel1AS39( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A457FasCod )
   {
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char6[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char4[0] = "P" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int3) ;
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

   public void gx7asadisfasprma1AS39( String A396EmprCod ,
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
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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

   public void gx8asadisfasprmi1AS39( String A396EmprCod ,
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
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
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
      subsflControlProps_11538( ) ;
      while ( nGXsfl_115_idx <= nRC_GXsfl_115 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AS38( ) ;
         standaloneModal1AS38( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AS38( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_115_idx = (int)(nGXsfl_115_idx+1) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_11538( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_13239( ) ;
      while ( nGXsfl_132_idx <= nRC_GXsfl_132 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AS38( ) ;
         standaloneModal1AS38( ) ;
         standaloneNotModal1AS39( ) ;
         standaloneModal1AS39( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AS39( ) ;
         nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_115_idx ;
         subsflControlProps_13239( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      GXCCtl = "DISFASUNI_" + sGXsfl_132_idx ;
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
      GXCCtl = "FASPREOBL_" + sGXsfl_132_idx ;
      chkFasPreObl.setName( GXCCtl );
      chkFasPreObl.setWebtags( "" );
      chkFasPreObl.setCaption( httpContext.getMessage( "Precio Obligatorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreObl.getInternalname(), "TitleCaption", chkFasPreObl.getCaption(), !bGXsfl_132_Refreshing);
      chkFasPreObl.setCheckedValue( "0" );
      A7744FasPreObl = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7744FasPreObl = false ;
      GXCCtl = "DISFASAUT_" + sGXsfl_132_idx ;
      chkDisFasAut.setName( GXCCtl );
      chkDisFasAut.setWebtags( "" );
      chkDisFasAut.setCaption( httpContext.getMessage( "Aut.?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasAut.getInternalname(), "TitleCaption", chkDisFasAut.getCaption(), !bGXsfl_132_Refreshing);
      chkDisFasAut.setCheckedValue( "0" );
      A7747DisFasAut = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7747DisFasAut, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7747DisFasAut = false ;
      GXCCtl = "DISFASPROK_" + sGXsfl_132_idx ;
      chkDisFasPrOk.setName( GXCCtl );
      chkDisFasPrOk.setWebtags( "" );
      chkDisFasPrOk.setCaption( httpContext.getMessage( "Precio Ok", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrOk.getInternalname(), "TitleCaption", chkDisFasPrOk.getCaption(), !bGXsfl_132_Refreshing);
      chkDisFasPrOk.setCheckedValue( "1" );
      A7748DisFasPrOk = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7748DisFasPrOk, (byte)(1), (byte)(0), ".", "")), "0")==0) ? 0 : 1)) ;
      GXCCtl = "DISFASPRLS_" + sGXsfl_132_idx ;
      chkDisFasPrLs.setName( GXCCtl );
      chkDisFasPrLs.setWebtags( "" );
      chkDisFasPrLs.setCaption( httpContext.getMessage( "Lst", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFasPrLs.getInternalname(), "TitleCaption", chkDisFasPrLs.getCaption(), !bGXsfl_132_Refreshing);
      chkDisFasPrLs.setCheckedValue( "0" );
      A8508DisFasPrLs = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8508DisFasPrLs, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AS55 */
      pr_default.execute(53, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AS55_A407EmprNom[0] ;
      n407EmprNom = T01AS55_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(53);
      GX_FocusControl = chkPriCod.getInternalname() ;
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

   public void valid_Discod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", GXutil.rtrim( A757PriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", GXutil.rtrim( A360DisCliNum));
      httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", GXutil.rtrim( A362DisColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z360DisCliNum", GXutil.rtrim( Z360DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z370DisFecCli", localUtil.format(Z370DisFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z369DisFec", localUtil.format(Z369DisFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z371DisFecEnt", localUtil.format(Z371DisFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z363DisColNum", GXutil.ltrim( localUtil.ntoc( Z363DisColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z390DisTipCol", GXutil.ltrim( localUtil.ntoc( Z390DisTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z375DisNumUni", GXutil.ltrim( localUtil.ntoc( Z375DisNumUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z337DisArtDsc", GXutil.rtrim( Z337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01AS22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01AS22_A279CliNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Distipcol( )
   {
      n390DisTipCol = false ;
      /* Using cursor T01AS56 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisTipCol_Internalname ;
         }
      }
      pr_default.close(54);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Fascod( )
   {
      n362DisColNom = false ;
      n363DisColNum = false ;
      n390DisTipCol = false ;
      n456FasActTin = false ;
      n7744FasPreObl = false ;
      /* Using cursor T01AS48 */
      pr_default.execute(46, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01AS48_A460FasDsc[0] ;
      A456FasActTin = T01AS48_A456FasActTin[0] ;
      n456FasActTin = T01AS48_n456FasActTin[0] ;
      A7744FasPreObl = T01AS48_A7744FasPreObl[0] ;
      n7744FasPreObl = T01AS48_n7744FasPreObl[0] ;
      pr_default.close(46);
      GXt_decimal8 = A7746DisFasPrMa ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmax(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      A456FasActTin = this.A456FasActTin ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      A7746DisFasPrMa = GXt_decimal8 ;
      GXt_decimal8 = A7745DisFasPrMi ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char6[0] = A335DisArtCod ;
      GXv_char4[0] = A362DisColNom ;
      GXv_int2[0] = A363DisColNum ;
      GXv_int10[0] = A390DisTipCol ;
      GXv_char1[0] = A456FasActTin ;
      GXv_decimal12[0] = GXt_decimal8 ;
      new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int2, GXv_int10, GXv_char1, GXv_decimal12) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A252CliCod = GXv_int9[0] ;
      tpreatx_impl.this.A335DisArtCod = GXv_char6[0] ;
      tpreatx_impl.this.A362DisColNom = GXv_char4[0] ;
      tpreatx_impl.this.A363DisColNum = GXv_int2[0] ;
      tpreatx_impl.this.A390DisTipCol = GXv_int10[0] ;
      tpreatx_impl.this.A456FasActTin = GXv_char1[0] ;
      A456FasActTin = this.A456FasActTin ;
      tpreatx_impl.this.GXt_decimal8 = GXv_decimal12[0] ;
      A7745DisFasPrMi = GXt_decimal8 ;
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8510DisFasDtoL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char6[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char4[0] = "D" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      A8510DisFasDtoL = DecimalUtil.doubleToDec(GXt_int3) ;
      GXt_int3 = (long)(DecimalUtil.decToDouble(A8509DisFasPreL)) ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int9[0] = A361DisCod ;
      GXv_char6[0] = A457FasCod ;
      GXv_int5[0] = (short)(0) ;
      GXv_char4[0] = "P" ;
      GXv_int7[0] = GXt_int3 ;
      new app.partpre(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_int5, GXv_char4, GXv_int7) ;
      tpreatx_impl.this.A396EmprCod = GXv_char11[0] ;
      tpreatx_impl.this.A361DisCod = GXv_int9[0] ;
      tpreatx_impl.this.A457FasCod = GXv_char6[0] ;
      tpreatx_impl.this.GXt_int3 = GXv_int7[0] ;
      A8509DisFasPreL = DecimalUtil.doubleToDec(GXt_int3) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV16UsurCod',fld:'vUSURCOD',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'A370DisFecCli',fld:'DISFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A371DisFecEnt',fld:'DISFECENT',pic:''},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A363DisColNum',fld:'DISCOLNUM',pic:'ZZZZZ9'},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A375DisNumUni',fld:'DISNUMUNI',pic:'ZZZZZ9.99'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z757PriCod'},{av:'Z360DisCliNum'},{av:'Z370DisFecCli'},{av:'Z252CliCod'},{av:'Z335DisArtCod'},{av:'Z369DisFec'},{av:'Z371DisFecEnt'},{av:'Z362DisColNom'},{av:'Z363DisColNum'},{av:'Z390DisTipCol'},{av:'Z365DisDes'},{av:'Z374DisNumPie'},{av:'Z375DisNumUni'},{av:'Z392DisUniMed'},{av:'Z337DisArtDsc'},{av:'Z758ProCod'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_PRICOD","{handler:'valid_Pricod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_PRICOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOLNUM","{handler:'valid_Discolnum',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOLNUM",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISDES",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Prodsc',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A363DisColNum',fld:'DISCOLNUM',pic:'ZZZZZ9'},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A8509DisFasPreL',fld:'DISFASPREL',pic:'ZZZ,ZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A7746DisFasPrMa',fld:'DISFASPRMA',pic:'ZZZZZZ9.99'},{av:'A7745DisFasPrMi',fld:'DISFASPRMI',pic:'ZZZZZZ9.99'},{av:'A8510DisFasDtoL',fld:'DISFASDTOL',pic:'Z9.99 %'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A7746DisFasPrMa',fld:'DISFASPRMA',pic:'ZZZZZZ9.99'},{av:'A7745DisFasPrMi',fld:'DISFASPRMI',pic:'ZZZZZZ9.99'},{av:'A8510DisFasDtoL',fld:'DISFASDTOL',pic:'Z9.99 %'},{av:'A8509DisFasPreL',fld:'DISFASPREL',pic:'ZZZ,ZZ9'},{av:'A8508DisFasPrLs',fld:'DISFASPRLS',pic:'9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_FASACTTIN","{handler:'valid_Fasacttin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_FASACTTIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASPRE","{handler:'valid_Disfaspre',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASPRE",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASUNI","{handler:'valid_Disfasuni',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASUNI",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_FASPREOBL","{handler:'valid_Faspreobl',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_FASPREOBL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASAUT","{handler:'valid_Disfasaut',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASAUT",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASPRMI","{handler:'valid_Disfasprmi',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASPRMI",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASPRMA","{handler:'valid_Disfasprma',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASPRMA",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASPREL","{handler:'valid_Disfasprel',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASPREL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISFASPRLS","{handler:'valid_Disfasprls',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISFASPRLS",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
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
      pr_default.close(46);
      pr_default.close(20);
      pr_default.close(53);
      pr_default.close(54);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
      wcpOAV16UsurCod = "" ;
      Z396EmprCod = "" ;
      Z757PriCod = "" ;
      Z360DisCliNum = "" ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z362DisColNom = "" ;
      Z365DisDes = "" ;
      Z375DisNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z337DisArtDsc = "" ;
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
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A757PriCod = "" ;
      A365DisDes = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A360DisCliNum = "" ;
      lblTextblock6_Jsonclick = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A369DisFec = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A392DisUniMed = "" ;
      lblTextblock19_Jsonclick = "" ;
      A337DisArtDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode38 = "" ;
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
      sMode34 = "" ;
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
      A759ProDsc = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01AS10_A407EmprNom = new String[] {""} ;
      T01AS10_n407EmprNom = new boolean[] {false} ;
      T01AS13_A361DisCod = new int[1] ;
      T01AS13_A407EmprNom = new String[] {""} ;
      T01AS13_n407EmprNom = new boolean[] {false} ;
      T01AS13_A757PriCod = new String[] {""} ;
      T01AS13_A360DisCliNum = new String[] {""} ;
      T01AS13_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS13_A279CliNom = new String[] {""} ;
      T01AS13_A335DisArtCod = new String[] {""} ;
      T01AS13_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS13_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS13_A362DisColNom = new String[] {""} ;
      T01AS13_n362DisColNom = new boolean[] {false} ;
      T01AS13_A363DisColNum = new int[1] ;
      T01AS13_n363DisColNum = new boolean[] {false} ;
      T01AS13_A365DisDes = new String[] {""} ;
      T01AS13_A374DisNumPie = new short[1] ;
      T01AS13_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS13_A392DisUniMed = new String[] {""} ;
      T01AS13_A337DisArtDsc = new String[] {""} ;
      T01AS13_A396EmprCod = new String[] {""} ;
      T01AS13_A252CliCod = new int[1] ;
      T01AS13_A390DisTipCol = new byte[1] ;
      T01AS13_n390DisTipCol = new boolean[] {false} ;
      T01AS11_A279CliNom = new String[] {""} ;
      T01AS12_A396EmprCod = new String[] {""} ;
      T01AS14_A279CliNom = new String[] {""} ;
      T01AS15_A396EmprCod = new String[] {""} ;
      T01AS16_A396EmprCod = new String[] {""} ;
      T01AS16_A361DisCod = new int[1] ;
      T01AS9_A361DisCod = new int[1] ;
      T01AS9_A757PriCod = new String[] {""} ;
      T01AS9_A360DisCliNum = new String[] {""} ;
      T01AS9_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS9_A335DisArtCod = new String[] {""} ;
      T01AS9_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS9_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS9_A362DisColNom = new String[] {""} ;
      T01AS9_n362DisColNom = new boolean[] {false} ;
      T01AS9_A363DisColNum = new int[1] ;
      T01AS9_n363DisColNum = new boolean[] {false} ;
      T01AS9_A365DisDes = new String[] {""} ;
      T01AS9_A374DisNumPie = new short[1] ;
      T01AS9_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS9_A392DisUniMed = new String[] {""} ;
      T01AS9_A337DisArtDsc = new String[] {""} ;
      T01AS9_A396EmprCod = new String[] {""} ;
      T01AS9_A252CliCod = new int[1] ;
      T01AS9_A390DisTipCol = new byte[1] ;
      T01AS9_n390DisTipCol = new boolean[] {false} ;
      T01AS17_A396EmprCod = new String[] {""} ;
      T01AS17_A361DisCod = new int[1] ;
      T01AS18_A396EmprCod = new String[] {""} ;
      T01AS18_A361DisCod = new int[1] ;
      T01AS8_A361DisCod = new int[1] ;
      T01AS8_A757PriCod = new String[] {""} ;
      T01AS8_A360DisCliNum = new String[] {""} ;
      T01AS8_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS8_A335DisArtCod = new String[] {""} ;
      T01AS8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS8_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01AS8_A362DisColNom = new String[] {""} ;
      T01AS8_n362DisColNom = new boolean[] {false} ;
      T01AS8_A363DisColNum = new int[1] ;
      T01AS8_n363DisColNum = new boolean[] {false} ;
      T01AS8_A365DisDes = new String[] {""} ;
      T01AS8_A374DisNumPie = new short[1] ;
      T01AS8_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS8_A392DisUniMed = new String[] {""} ;
      T01AS8_A337DisArtDsc = new String[] {""} ;
      T01AS8_A396EmprCod = new String[] {""} ;
      T01AS8_A252CliCod = new int[1] ;
      T01AS8_A390DisTipCol = new byte[1] ;
      T01AS8_n390DisTipCol = new boolean[] {false} ;
      T01AS22_A279CliNom = new String[] {""} ;
      T01AS23_A396EmprCod = new String[] {""} ;
      T01AS23_A361DisCod = new int[1] ;
      T01AS23_A13376DisTraID = new String[] {""} ;
      T01AS24_A396EmprCod = new String[] {""} ;
      T01AS24_A361DisCod = new int[1] ;
      T01AS24_A13213DisNormID = new String[] {""} ;
      T01AS25_A396EmprCod = new String[] {""} ;
      T01AS25_A361DisCod = new int[1] ;
      T01AS25_A13081DisDGLin = new byte[1] ;
      T01AS25_A13082DisDGDibCl = new String[] {""} ;
      T01AS25_A13083DisDGDibIn = new int[1] ;
      T01AS25_A13084DisDGComb = new String[] {""} ;
      T01AS25_A13085DisDGFondo = new String[] {""} ;
      T01AS26_A396EmprCod = new String[] {""} ;
      T01AS26_A361DisCod = new int[1] ;
      T01AS26_A7068DisNotLin = new byte[1] ;
      T01AS27_A396EmprCod = new String[] {""} ;
      T01AS27_A361DisCod = new int[1] ;
      T01AS27_A10197ProEspCod = new String[] {""} ;
      T01AS28_A396EmprCod = new String[] {""} ;
      T01AS28_A361DisCod = new int[1] ;
      T01AS28_A4594AccCod = new short[1] ;
      T01AS29_A396EmprCod = new String[] {""} ;
      T01AS29_A361DisCod = new int[1] ;
      T01AS29_A2524DisComLin = new byte[1] ;
      T01AS29_A1056DisComCod = new String[] {""} ;
      T01AS29_A1032FonCod = new String[] {""} ;
      T01AS30_A396EmprCod = new String[] {""} ;
      T01AS30_A361DisCod = new int[1] ;
      T01AS30_A3398DisRefBarC = new int[1] ;
      T01AS30_A3399DisRefBCRe = new byte[1] ;
      T01AS30_A3400DisRefBCPa = new String[] {""} ;
      T01AS30_A3607DisRefBPie = new String[] {""} ;
      T01AS31_A396EmprCod = new String[] {""} ;
      T01AS31_A361DisCod = new int[1] ;
      T01AS31_A376DisObsLin = new byte[1] ;
      T01AS32_A396EmprCod = new String[] {""} ;
      T01AS32_A361DisCod = new int[1] ;
      T01AS32_A758ProCod = new String[] {""} ;
      T01AS33_A396EmprCod = new String[] {""} ;
      T01AS33_A361DisCod = new int[1] ;
      T01AS33_A833TipDefCod = new short[1] ;
      T01AS34_A396EmprCod = new String[] {""} ;
      T01AS34_A361DisCod = new int[1] ;
      T01AS34_A44AlbRecCod = new int[1] ;
      T01AS35_A396EmprCod = new String[] {""} ;
      T01AS35_A361DisCod = new int[1] ;
      Z758ProCod = "" ;
      Z759ProDsc = "" ;
      T01AS7_A759ProDsc = new String[] {""} ;
      T01AS36_A361DisCod = new int[1] ;
      T01AS36_A759ProDsc = new String[] {""} ;
      T01AS36_A396EmprCod = new String[] {""} ;
      T01AS36_A758ProCod = new String[] {""} ;
      T01AS37_A396EmprCod = new String[] {""} ;
      T01AS37_A361DisCod = new int[1] ;
      T01AS37_A758ProCod = new String[] {""} ;
      T01AS6_A361DisCod = new int[1] ;
      T01AS6_A396EmprCod = new String[] {""} ;
      T01AS6_A758ProCod = new String[] {""} ;
      T01AS5_A361DisCod = new int[1] ;
      T01AS5_A396EmprCod = new String[] {""} ;
      T01AS5_A758ProCod = new String[] {""} ;
      T01AS40_A396EmprCod = new String[] {""} ;
      T01AS40_A361DisCod = new int[1] ;
      T01AS40_A758ProCod = new String[] {""} ;
      T01AS40_A368DisFasLin = new short[1] ;
      T01AS40_A1664ParFasCod = new short[1] ;
      T01AS41_A396EmprCod = new String[] {""} ;
      T01AS41_A361DisCod = new int[1] ;
      T01AS41_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z456FasActTin = "" ;
      T01AS42_A361DisCod = new int[1] ;
      T01AS42_A758ProCod = new String[] {""} ;
      T01AS42_A368DisFasLin = new short[1] ;
      T01AS42_A460FasDsc = new String[] {""} ;
      T01AS42_A456FasActTin = new String[] {""} ;
      T01AS42_n456FasActTin = new boolean[] {false} ;
      T01AS42_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS42_n7740DisFasPre = new boolean[] {false} ;
      T01AS42_A7741DisFasUni = new String[] {""} ;
      T01AS42_n7741DisFasUni = new boolean[] {false} ;
      T01AS42_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS42_n7742DisFasDto = new boolean[] {false} ;
      T01AS42_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS42_n7743DisFasRec = new boolean[] {false} ;
      T01AS42_A7744FasPreObl = new byte[1] ;
      T01AS42_n7744FasPreObl = new boolean[] {false} ;
      T01AS42_A7747DisFasAut = new byte[1] ;
      T01AS42_n7747DisFasAut = new boolean[] {false} ;
      T01AS42_A396EmprCod = new String[] {""} ;
      T01AS42_A457FasCod = new String[] {""} ;
      T01AS4_A460FasDsc = new String[] {""} ;
      T01AS4_A456FasActTin = new String[] {""} ;
      T01AS4_n456FasActTin = new boolean[] {false} ;
      T01AS4_A7744FasPreObl = new byte[1] ;
      T01AS4_n7744FasPreObl = new boolean[] {false} ;
      T01AS43_A460FasDsc = new String[] {""} ;
      T01AS43_A456FasActTin = new String[] {""} ;
      T01AS43_n456FasActTin = new boolean[] {false} ;
      T01AS43_A7744FasPreObl = new byte[1] ;
      T01AS43_n7744FasPreObl = new boolean[] {false} ;
      T01AS44_A396EmprCod = new String[] {""} ;
      T01AS44_A361DisCod = new int[1] ;
      T01AS44_A758ProCod = new String[] {""} ;
      T01AS44_A368DisFasLin = new short[1] ;
      T01AS3_A361DisCod = new int[1] ;
      T01AS3_A758ProCod = new String[] {""} ;
      T01AS3_A368DisFasLin = new short[1] ;
      T01AS3_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS3_n7740DisFasPre = new boolean[] {false} ;
      T01AS3_A7741DisFasUni = new String[] {""} ;
      T01AS3_n7741DisFasUni = new boolean[] {false} ;
      T01AS3_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS3_n7742DisFasDto = new boolean[] {false} ;
      T01AS3_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS3_n7743DisFasRec = new boolean[] {false} ;
      T01AS3_A7747DisFasAut = new byte[1] ;
      T01AS3_n7747DisFasAut = new boolean[] {false} ;
      T01AS3_A396EmprCod = new String[] {""} ;
      T01AS3_A457FasCod = new String[] {""} ;
      T01AS3_A7744FasPreObl = new byte[1] ;
      T01AS3_n7744FasPreObl = new boolean[] {false} ;
      sMode39 = "" ;
      T01AS2_A361DisCod = new int[1] ;
      T01AS2_A758ProCod = new String[] {""} ;
      T01AS2_A368DisFasLin = new short[1] ;
      T01AS2_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS2_n7740DisFasPre = new boolean[] {false} ;
      T01AS2_A7741DisFasUni = new String[] {""} ;
      T01AS2_n7741DisFasUni = new boolean[] {false} ;
      T01AS2_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS2_n7742DisFasDto = new boolean[] {false} ;
      T01AS2_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AS2_n7743DisFasRec = new boolean[] {false} ;
      T01AS2_A7747DisFasAut = new byte[1] ;
      T01AS2_n7747DisFasAut = new boolean[] {false} ;
      T01AS2_A396EmprCod = new String[] {""} ;
      T01AS2_A457FasCod = new String[] {""} ;
      T01AS2_A7744FasPreObl = new byte[1] ;
      T01AS2_n7744FasPreObl = new boolean[] {false} ;
      T01AS48_A460FasDsc = new String[] {""} ;
      T01AS48_A456FasActTin = new String[] {""} ;
      T01AS48_n456FasActTin = new boolean[] {false} ;
      T01AS48_A7744FasPreObl = new byte[1] ;
      T01AS48_n7744FasPreObl = new boolean[] {false} ;
      T01AS49_A396EmprCod = new String[] {""} ;
      T01AS49_A361DisCod = new int[1] ;
      T01AS49_A758ProCod = new String[] {""} ;
      T01AS49_A368DisFasLin = new short[1] ;
      T01AS49_A7919Dta_Ordl = new short[1] ;
      T01AS50_A396EmprCod = new String[] {""} ;
      T01AS50_A361DisCod = new int[1] ;
      T01AS50_A758ProCod = new String[] {""} ;
      T01AS50_A368DisFasLin = new short[1] ;
      T01AS50_A7727ArtAdiCod = new short[1] ;
      T01AS51_A396EmprCod = new String[] {""} ;
      T01AS51_A361DisCod = new int[1] ;
      T01AS51_A758ProCod = new String[] {""} ;
      T01AS51_A368DisFasLin = new short[1] ;
      T01AS51_A5377DisQuiLin = new short[1] ;
      T01AS52_A396EmprCod = new String[] {""} ;
      T01AS52_A361DisCod = new int[1] ;
      T01AS52_A758ProCod = new String[] {""} ;
      T01AS52_A368DisFasLin = new short[1] ;
      T01AS52_A5035A_Discod = new int[1] ;
      T01AS52_A5038A_DProcod = new String[] {""} ;
      T01AS52_A5039A_DOrdlin = new short[1] ;
      T01AS53_A396EmprCod = new String[] {""} ;
      T01AS53_A361DisCod = new int[1] ;
      T01AS53_A758ProCod = new String[] {""} ;
      T01AS53_A368DisFasLin = new short[1] ;
      T01AS53_A1664ParFasCod = new short[1] ;
      T01AS54_A396EmprCod = new String[] {""} ;
      T01AS54_A361DisCod = new int[1] ;
      T01AS54_A758ProCod = new String[] {""} ;
      T01AS54_A368DisFasLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock20_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock21_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01AS55_A407EmprNom = new String[] {""} ;
      T01AS55_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ757PriCod = "" ;
      ZZ360DisCliNum = "" ;
      ZZ370DisFecCli = GXutil.nullDate() ;
      ZZ335DisArtCod = "" ;
      ZZ369DisFec = GXutil.nullDate() ;
      ZZ371DisFecEnt = GXutil.nullDate() ;
      ZZ362DisColNom = "" ;
      ZZ365DisDes = "" ;
      ZZ375DisNumUni = DecimalUtil.ZERO ;
      ZZ392DisUniMed = "" ;
      ZZ337DisArtDsc = "" ;
      ZZ758ProCod = "" ;
      ZZ279CliNom = "" ;
      T01AS56_A396EmprCod = new String[] {""} ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_int2 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new long[1] ;
      Z7746DisFasPrMa = DecimalUtil.ZERO ;
      Z7745DisFasPrMi = DecimalUtil.ZERO ;
      Z8510DisFasDtoL = DecimalUtil.ZERO ;
      Z8509DisFasPreL = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpreatx__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpreatx__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpreatx__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpreatx__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpreatx__default(),
         new Object[] {
             new Object[] {
            T01AS2_A361DisCod, T01AS2_A758ProCod, T01AS2_A368DisFasLin, T01AS2_A7740DisFasPre, T01AS2_n7740DisFasPre, T01AS2_A7741DisFasUni, T01AS2_n7741DisFasUni, T01AS2_A7742DisFasDto, T01AS2_n7742DisFasDto, T01AS2_A7743DisFasRec,
            T01AS2_n7743DisFasRec, T01AS2_A7747DisFasAut, T01AS2_n7747DisFasAut, T01AS2_A396EmprCod, T01AS2_A457FasCod, T01AS2_A7744FasPreObl, T01AS2_n7744FasPreObl
            }
            , new Object[] {
            T01AS3_A361DisCod, T01AS3_A758ProCod, T01AS3_A368DisFasLin, T01AS3_A7740DisFasPre, T01AS3_n7740DisFasPre, T01AS3_A7741DisFasUni, T01AS3_n7741DisFasUni, T01AS3_A7742DisFasDto, T01AS3_n7742DisFasDto, T01AS3_A7743DisFasRec,
            T01AS3_n7743DisFasRec, T01AS3_A7747DisFasAut, T01AS3_n7747DisFasAut, T01AS3_A396EmprCod, T01AS3_A457FasCod, T01AS3_A7744FasPreObl, T01AS3_n7744FasPreObl
            }
            , new Object[] {
            T01AS4_A460FasDsc, T01AS4_A456FasActTin, T01AS4_n456FasActTin, T01AS4_A7744FasPreObl, T01AS4_n7744FasPreObl
            }
            , new Object[] {
            T01AS5_A361DisCod, T01AS5_A396EmprCod, T01AS5_A758ProCod
            }
            , new Object[] {
            T01AS6_A361DisCod, T01AS6_A396EmprCod, T01AS6_A758ProCod
            }
            , new Object[] {
            T01AS7_A759ProDsc
            }
            , new Object[] {
            T01AS8_A361DisCod, T01AS8_A757PriCod, T01AS8_A360DisCliNum, T01AS8_A370DisFecCli, T01AS8_A335DisArtCod, T01AS8_A369DisFec, T01AS8_A371DisFecEnt, T01AS8_A362DisColNom, T01AS8_n362DisColNom, T01AS8_A363DisColNum,
            T01AS8_n363DisColNum, T01AS8_A365DisDes, T01AS8_A374DisNumPie, T01AS8_A375DisNumUni, T01AS8_A392DisUniMed, T01AS8_A337DisArtDsc, T01AS8_A396EmprCod, T01AS8_A252CliCod, T01AS8_A390DisTipCol, T01AS8_n390DisTipCol
            }
            , new Object[] {
            T01AS9_A361DisCod, T01AS9_A757PriCod, T01AS9_A360DisCliNum, T01AS9_A370DisFecCli, T01AS9_A335DisArtCod, T01AS9_A369DisFec, T01AS9_A371DisFecEnt, T01AS9_A362DisColNom, T01AS9_n362DisColNom, T01AS9_A363DisColNum,
            T01AS9_n363DisColNum, T01AS9_A365DisDes, T01AS9_A374DisNumPie, T01AS9_A375DisNumUni, T01AS9_A392DisUniMed, T01AS9_A337DisArtDsc, T01AS9_A396EmprCod, T01AS9_A252CliCod, T01AS9_A390DisTipCol, T01AS9_n390DisTipCol
            }
            , new Object[] {
            T01AS10_A407EmprNom, T01AS10_n407EmprNom
            }
            , new Object[] {
            T01AS11_A279CliNom
            }
            , new Object[] {
            T01AS12_A396EmprCod
            }
            , new Object[] {
            T01AS13_A361DisCod, T01AS13_A407EmprNom, T01AS13_n407EmprNom, T01AS13_A757PriCod, T01AS13_A360DisCliNum, T01AS13_A370DisFecCli, T01AS13_A279CliNom, T01AS13_A335DisArtCod, T01AS13_A369DisFec, T01AS13_A371DisFecEnt,
            T01AS13_A362DisColNom, T01AS13_n362DisColNom, T01AS13_A363DisColNum, T01AS13_n363DisColNum, T01AS13_A365DisDes, T01AS13_A374DisNumPie, T01AS13_A375DisNumUni, T01AS13_A392DisUniMed, T01AS13_A337DisArtDsc, T01AS13_A396EmprCod,
            T01AS13_A252CliCod, T01AS13_A390DisTipCol, T01AS13_n390DisTipCol
            }
            , new Object[] {
            T01AS14_A279CliNom
            }
            , new Object[] {
            T01AS15_A396EmprCod
            }
            , new Object[] {
            T01AS16_A396EmprCod, T01AS16_A361DisCod
            }
            , new Object[] {
            T01AS17_A396EmprCod, T01AS17_A361DisCod
            }
            , new Object[] {
            T01AS18_A396EmprCod, T01AS18_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AS22_A279CliNom
            }
            , new Object[] {
            T01AS23_A396EmprCod, T01AS23_A361DisCod, T01AS23_A13376DisTraID
            }
            , new Object[] {
            T01AS24_A396EmprCod, T01AS24_A361DisCod, T01AS24_A13213DisNormID
            }
            , new Object[] {
            T01AS25_A396EmprCod, T01AS25_A361DisCod, T01AS25_A13081DisDGLin, T01AS25_A13082DisDGDibCl, T01AS25_A13083DisDGDibIn, T01AS25_A13084DisDGComb, T01AS25_A13085DisDGFondo
            }
            , new Object[] {
            T01AS26_A396EmprCod, T01AS26_A361DisCod, T01AS26_A7068DisNotLin
            }
            , new Object[] {
            T01AS27_A396EmprCod, T01AS27_A361DisCod, T01AS27_A10197ProEspCod
            }
            , new Object[] {
            T01AS28_A396EmprCod, T01AS28_A361DisCod, T01AS28_A4594AccCod
            }
            , new Object[] {
            T01AS29_A396EmprCod, T01AS29_A361DisCod, T01AS29_A2524DisComLin, T01AS29_A1056DisComCod, T01AS29_A1032FonCod
            }
            , new Object[] {
            T01AS30_A396EmprCod, T01AS30_A361DisCod, T01AS30_A3398DisRefBarC, T01AS30_A3399DisRefBCRe, T01AS30_A3400DisRefBCPa, T01AS30_A3607DisRefBPie
            }
            , new Object[] {
            T01AS31_A396EmprCod, T01AS31_A361DisCod, T01AS31_A376DisObsLin
            }
            , new Object[] {
            T01AS32_A396EmprCod, T01AS32_A361DisCod, T01AS32_A758ProCod
            }
            , new Object[] {
            T01AS33_A396EmprCod, T01AS33_A361DisCod, T01AS33_A833TipDefCod
            }
            , new Object[] {
            T01AS34_A396EmprCod, T01AS34_A361DisCod, T01AS34_A44AlbRecCod
            }
            , new Object[] {
            T01AS35_A396EmprCod, T01AS35_A361DisCod
            }
            , new Object[] {
            T01AS36_A361DisCod, T01AS36_A759ProDsc, T01AS36_A396EmprCod, T01AS36_A758ProCod
            }
            , new Object[] {
            T01AS37_A396EmprCod, T01AS37_A361DisCod, T01AS37_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AS40_A396EmprCod, T01AS40_A361DisCod, T01AS40_A758ProCod, T01AS40_A368DisFasLin, T01AS40_A1664ParFasCod
            }
            , new Object[] {
            T01AS41_A396EmprCod, T01AS41_A361DisCod, T01AS41_A758ProCod
            }
            , new Object[] {
            T01AS42_A361DisCod, T01AS42_A758ProCod, T01AS42_A368DisFasLin, T01AS42_A460FasDsc, T01AS42_A456FasActTin, T01AS42_n456FasActTin, T01AS42_A7740DisFasPre, T01AS42_n7740DisFasPre, T01AS42_A7741DisFasUni, T01AS42_n7741DisFasUni,
            T01AS42_A7742DisFasDto, T01AS42_n7742DisFasDto, T01AS42_A7743DisFasRec, T01AS42_n7743DisFasRec, T01AS42_A7744FasPreObl, T01AS42_n7744FasPreObl, T01AS42_A7747DisFasAut, T01AS42_n7747DisFasAut, T01AS42_A396EmprCod, T01AS42_A457FasCod
            }
            , new Object[] {
            T01AS43_A460FasDsc, T01AS43_A456FasActTin, T01AS43_n456FasActTin, T01AS43_A7744FasPreObl, T01AS43_n7744FasPreObl
            }
            , new Object[] {
            T01AS44_A396EmprCod, T01AS44_A361DisCod, T01AS44_A758ProCod, T01AS44_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AS48_A460FasDsc, T01AS48_A456FasActTin, T01AS48_n456FasActTin, T01AS48_A7744FasPreObl, T01AS48_n7744FasPreObl
            }
            , new Object[] {
            T01AS49_A396EmprCod, T01AS49_A361DisCod, T01AS49_A758ProCod, T01AS49_A368DisFasLin, T01AS49_A7919Dta_Ordl
            }
            , new Object[] {
            T01AS50_A396EmprCod, T01AS50_A361DisCod, T01AS50_A758ProCod, T01AS50_A368DisFasLin, T01AS50_A7727ArtAdiCod
            }
            , new Object[] {
            T01AS51_A396EmprCod, T01AS51_A361DisCod, T01AS51_A758ProCod, T01AS51_A368DisFasLin, T01AS51_A5377DisQuiLin
            }
            , new Object[] {
            T01AS52_A396EmprCod, T01AS52_A361DisCod, T01AS52_A758ProCod, T01AS52_A368DisFasLin, T01AS52_A5035A_Discod, T01AS52_A5038A_DProcod, T01AS52_A5039A_DOrdlin
            }
            , new Object[] {
            T01AS53_A396EmprCod, T01AS53_A361DisCod, T01AS53_A758ProCod, T01AS53_A368DisFasLin, T01AS53_A1664ParFasCod
            }
            , new Object[] {
            T01AS54_A396EmprCod, T01AS54_A361DisCod, T01AS54_A758ProCod, T01AS54_A368DisFasLin
            }
            , new Object[] {
            T01AS55_A407EmprNom, T01AS55_n407EmprNom
            }
            , new Object[] {
            T01AS56_A396EmprCod
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

   private byte Z390DisTipCol ;
   private byte Z7747DisFasAut ;
   private byte GxWebError ;
   private byte A390DisTipCol ;
   private byte nKeyPressed ;
   private byte A7744FasPreObl ;
   private byte A7747DisFasAut ;
   private byte A7748DisFasPrOk ;
   private byte A8508DisFasPrLs ;
   private byte Gx_BScreen ;
   private byte Z7744FasPreObl ;
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
   private byte ZZ390DisTipCol ;
   private byte GXv_int10[] ;
   private byte Z8508DisFasPrLs ;
   private short Z374DisNumPie ;
   private short nRcdDeleted_38 ;
   private short nRcdExists_38 ;
   private short nIsMod_38 ;
   private short Z368DisFasLin ;
   private short nRcdDeleted_39 ;
   private short nRcdExists_39 ;
   private short nIsMod_39 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A374DisNumPie ;
   private short nBlankRcdCount38 ;
   private short RcdFound38 ;
   private short nBlankRcdUsr38 ;
   private short RcdFound39 ;
   private short A368DisFasLin ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_38 ;
   private short nIsDirty_39 ;
   private short nBlankRcdCount39 ;
   private short nBlankRcdUsr39 ;
   private short subGrid1_Borderwidth ;
   private short ZZ374DisNumPie ;
   private short GXv_int5[] ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int Z363DisColNum ;
   private int Z252CliCod ;
   private int nRC_GXsfl_115 ;
   private int nGXsfl_115_idx=1 ;
   private int nRC_GXsfl_132 ;
   private int nGXsfl_132_idx=1 ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCliNum_Enabled ;
   private int edtDisFecCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtDisFecEnt_Enabled ;
   private int edtDisColNom_Enabled ;
   private int edtDisColNum_Enabled ;
   private int edtDisTipCol_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisNumUni_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
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
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtDisFasLin_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtDisArtDsc_Backcolor ;
   private int edtDisUniMed_Backcolor ;
   private int edtDisNumUni_Backcolor ;
   private int edtDisNumPie_Backcolor ;
   private int edtDisTipCol_Backcolor ;
   private int edtDisColNum_Backcolor ;
   private int edtDisColNom_Backcolor ;
   private int edtDisFecEnt_Backcolor ;
   private int edtDisFec_Backcolor ;
   private int edtDisArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDisFecCli_Backcolor ;
   private int edtDisCliNum_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ363DisColNum ;
   private int GXv_int2[] ;
   private int GXv_int9[] ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private long GXt_int3 ;
   private long GXv_int7[] ;
   private java.math.BigDecimal Z375DisNumUni ;
   private java.math.BigDecimal Z7740DisFasPre ;
   private java.math.BigDecimal Z7742DisFasDto ;
   private java.math.BigDecimal Z7743DisFasRec ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7743DisFasRec ;
   private java.math.BigDecimal A7745DisFasPrMi ;
   private java.math.BigDecimal A7746DisFasPrMa ;
   private java.math.BigDecimal A8509DisFasPreL ;
   private java.math.BigDecimal A8510DisFasDtoL ;
   private java.math.BigDecimal ZZ375DisNumUni ;
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
   private String Z757PriCod ;
   private String Z360DisCliNum ;
   private String Z335DisArtCod ;
   private String Z362DisColNom ;
   private String Z365DisDes ;
   private String Z392DisUniMed ;
   private String Z337DisArtDsc ;
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
   private String GX_FocusControl ;
   private String sGXsfl_115_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_132_idx="0001" ;
   private String A757PriCod ;
   private String A365DisDes ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisCliNum_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisFecCli_Internalname ;
   private String edtDisFecCli_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDisArtCod_Internalname ;
   private String edtDisArtCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDisFecEnt_Internalname ;
   private String edtDisFecEnt_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDisColNom_Internalname ;
   private String edtDisColNom_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDisColNum_Internalname ;
   private String edtDisColNum_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDisTipCol_Internalname ;
   private String edtDisTipCol_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumUni_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String sMode38 ;
   private String edtProCod_Internalname ;
   private String edtProDsc_Internalname ;
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
   private String edtavnRcdDeleted_39_Internalname ;
   private String sMode34 ;
   private String GXCCtl ;
   private String edtDisFasLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasActTin_Internalname ;
   private String edtDisFasPre_Internalname ;
   private String A7741DisFasUni ;
   private String edtDisFasDto_Internalname ;
   private String edtDisFasRec_Internalname ;
   private String edtDisFasPrMi_Internalname ;
   private String edtDisFasPrMa_Internalname ;
   private String edtDisFasPreL_Internalname ;
   private String edtDisFasDtoL_Internalname ;
   private String A759ProDsc ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z758ProCod ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z456FasActTin ;
   private String sMode39 ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock21_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_115_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock21_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String sGXsfl_132_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
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
   private String lblTextblock20_Caption ;
   private String lblTextblock21_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ757PriCod ;
   private String ZZ360DisCliNum ;
   private String ZZ335DisArtCod ;
   private String ZZ362DisColNom ;
   private String ZZ365DisDes ;
   private String ZZ392DisUniMed ;
   private String ZZ337DisArtDsc ;
   private String ZZ758ProCod ;
   private String ZZ279CliNom ;
   private String GXv_char1[] ;
   private String GXv_char11[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private java.util.Date Z370DisFecCli ;
   private java.util.Date Z369DisFec ;
   private java.util.Date Z371DisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date ZZ370DisFecCli ;
   private java.util.Date ZZ369DisFec ;
   private java.util.Date ZZ371DisFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n456FasActTin ;
   private boolean wbErr ;
   private boolean bGXsfl_115_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_132_Refreshing=false ;
   private boolean Gx_longc ;
   private boolean n7740DisFasPre ;
   private boolean n7741DisFasUni ;
   private boolean n7742DisFasDto ;
   private boolean n7743DisFasRec ;
   private boolean n7744FasPreObl ;
   private boolean n7747DisFasAut ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private ICheckbox chkPriCod ;
   private ICheckbox chkDisDes ;
   private HTMLChoice cmbDisFasUni ;
   private ICheckbox chkFasPreObl ;
   private ICheckbox chkDisFasAut ;
   private ICheckbox chkDisFasPrOk ;
   private ICheckbox chkDisFasPrLs ;
   private IDataStoreProvider pr_default ;
   private String[] T01AS10_A407EmprNom ;
   private boolean[] T01AS10_n407EmprNom ;
   private int[] T01AS13_A361DisCod ;
   private String[] T01AS13_A407EmprNom ;
   private boolean[] T01AS13_n407EmprNom ;
   private String[] T01AS13_A757PriCod ;
   private String[] T01AS13_A360DisCliNum ;
   private java.util.Date[] T01AS13_A370DisFecCli ;
   private String[] T01AS13_A279CliNom ;
   private String[] T01AS13_A335DisArtCod ;
   private java.util.Date[] T01AS13_A369DisFec ;
   private java.util.Date[] T01AS13_A371DisFecEnt ;
   private String[] T01AS13_A362DisColNom ;
   private boolean[] T01AS13_n362DisColNom ;
   private int[] T01AS13_A363DisColNum ;
   private boolean[] T01AS13_n363DisColNum ;
   private String[] T01AS13_A365DisDes ;
   private short[] T01AS13_A374DisNumPie ;
   private java.math.BigDecimal[] T01AS13_A375DisNumUni ;
   private String[] T01AS13_A392DisUniMed ;
   private String[] T01AS13_A337DisArtDsc ;
   private String[] T01AS13_A396EmprCod ;
   private int[] T01AS13_A252CliCod ;
   private byte[] T01AS13_A390DisTipCol ;
   private boolean[] T01AS13_n390DisTipCol ;
   private String[] T01AS11_A279CliNom ;
   private String[] T01AS12_A396EmprCod ;
   private String[] T01AS14_A279CliNom ;
   private String[] T01AS15_A396EmprCod ;
   private String[] T01AS16_A396EmprCod ;
   private int[] T01AS16_A361DisCod ;
   private int[] T01AS9_A361DisCod ;
   private String[] T01AS9_A757PriCod ;
   private String[] T01AS9_A360DisCliNum ;
   private java.util.Date[] T01AS9_A370DisFecCli ;
   private String[] T01AS9_A335DisArtCod ;
   private java.util.Date[] T01AS9_A369DisFec ;
   private java.util.Date[] T01AS9_A371DisFecEnt ;
   private String[] T01AS9_A362DisColNom ;
   private boolean[] T01AS9_n362DisColNom ;
   private int[] T01AS9_A363DisColNum ;
   private boolean[] T01AS9_n363DisColNum ;
   private String[] T01AS9_A365DisDes ;
   private short[] T01AS9_A374DisNumPie ;
   private java.math.BigDecimal[] T01AS9_A375DisNumUni ;
   private String[] T01AS9_A392DisUniMed ;
   private String[] T01AS9_A337DisArtDsc ;
   private String[] T01AS9_A396EmprCod ;
   private int[] T01AS9_A252CliCod ;
   private byte[] T01AS9_A390DisTipCol ;
   private boolean[] T01AS9_n390DisTipCol ;
   private String[] T01AS17_A396EmprCod ;
   private int[] T01AS17_A361DisCod ;
   private String[] T01AS18_A396EmprCod ;
   private int[] T01AS18_A361DisCod ;
   private int[] T01AS8_A361DisCod ;
   private String[] T01AS8_A757PriCod ;
   private String[] T01AS8_A360DisCliNum ;
   private java.util.Date[] T01AS8_A370DisFecCli ;
   private String[] T01AS8_A335DisArtCod ;
   private java.util.Date[] T01AS8_A369DisFec ;
   private java.util.Date[] T01AS8_A371DisFecEnt ;
   private String[] T01AS8_A362DisColNom ;
   private boolean[] T01AS8_n362DisColNom ;
   private int[] T01AS8_A363DisColNum ;
   private boolean[] T01AS8_n363DisColNum ;
   private String[] T01AS8_A365DisDes ;
   private short[] T01AS8_A374DisNumPie ;
   private java.math.BigDecimal[] T01AS8_A375DisNumUni ;
   private String[] T01AS8_A392DisUniMed ;
   private String[] T01AS8_A337DisArtDsc ;
   private String[] T01AS8_A396EmprCod ;
   private int[] T01AS8_A252CliCod ;
   private byte[] T01AS8_A390DisTipCol ;
   private boolean[] T01AS8_n390DisTipCol ;
   private String[] T01AS22_A279CliNom ;
   private String[] T01AS23_A396EmprCod ;
   private int[] T01AS23_A361DisCod ;
   private String[] T01AS23_A13376DisTraID ;
   private String[] T01AS24_A396EmprCod ;
   private int[] T01AS24_A361DisCod ;
   private String[] T01AS24_A13213DisNormID ;
   private String[] T01AS25_A396EmprCod ;
   private int[] T01AS25_A361DisCod ;
   private byte[] T01AS25_A13081DisDGLin ;
   private String[] T01AS25_A13082DisDGDibCl ;
   private int[] T01AS25_A13083DisDGDibIn ;
   private String[] T01AS25_A13084DisDGComb ;
   private String[] T01AS25_A13085DisDGFondo ;
   private String[] T01AS26_A396EmprCod ;
   private int[] T01AS26_A361DisCod ;
   private byte[] T01AS26_A7068DisNotLin ;
   private String[] T01AS27_A396EmprCod ;
   private int[] T01AS27_A361DisCod ;
   private String[] T01AS27_A10197ProEspCod ;
   private String[] T01AS28_A396EmprCod ;
   private int[] T01AS28_A361DisCod ;
   private short[] T01AS28_A4594AccCod ;
   private String[] T01AS29_A396EmprCod ;
   private int[] T01AS29_A361DisCod ;
   private byte[] T01AS29_A2524DisComLin ;
   private String[] T01AS29_A1056DisComCod ;
   private String[] T01AS29_A1032FonCod ;
   private String[] T01AS30_A396EmprCod ;
   private int[] T01AS30_A361DisCod ;
   private int[] T01AS30_A3398DisRefBarC ;
   private byte[] T01AS30_A3399DisRefBCRe ;
   private String[] T01AS30_A3400DisRefBCPa ;
   private String[] T01AS30_A3607DisRefBPie ;
   private String[] T01AS31_A396EmprCod ;
   private int[] T01AS31_A361DisCod ;
   private byte[] T01AS31_A376DisObsLin ;
   private String[] T01AS32_A396EmprCod ;
   private int[] T01AS32_A361DisCod ;
   private String[] T01AS32_A758ProCod ;
   private String[] T01AS33_A396EmprCod ;
   private int[] T01AS33_A361DisCod ;
   private short[] T01AS33_A833TipDefCod ;
   private String[] T01AS34_A396EmprCod ;
   private int[] T01AS34_A361DisCod ;
   private int[] T01AS34_A44AlbRecCod ;
   private String[] T01AS35_A396EmprCod ;
   private int[] T01AS35_A361DisCod ;
   private String[] T01AS7_A759ProDsc ;
   private int[] T01AS36_A361DisCod ;
   private String[] T01AS36_A759ProDsc ;
   private String[] T01AS36_A396EmprCod ;
   private String[] T01AS36_A758ProCod ;
   private String[] T01AS37_A396EmprCod ;
   private int[] T01AS37_A361DisCod ;
   private String[] T01AS37_A758ProCod ;
   private int[] T01AS6_A361DisCod ;
   private String[] T01AS6_A396EmprCod ;
   private String[] T01AS6_A758ProCod ;
   private int[] T01AS5_A361DisCod ;
   private String[] T01AS5_A396EmprCod ;
   private String[] T01AS5_A758ProCod ;
   private String[] T01AS40_A396EmprCod ;
   private int[] T01AS40_A361DisCod ;
   private String[] T01AS40_A758ProCod ;
   private short[] T01AS40_A368DisFasLin ;
   private short[] T01AS40_A1664ParFasCod ;
   private String[] T01AS41_A396EmprCod ;
   private int[] T01AS41_A361DisCod ;
   private String[] T01AS41_A758ProCod ;
   private int[] T01AS42_A361DisCod ;
   private String[] T01AS42_A758ProCod ;
   private short[] T01AS42_A368DisFasLin ;
   private String[] T01AS42_A460FasDsc ;
   private String[] T01AS42_A456FasActTin ;
   private boolean[] T01AS42_n456FasActTin ;
   private java.math.BigDecimal[] T01AS42_A7740DisFasPre ;
   private boolean[] T01AS42_n7740DisFasPre ;
   private String[] T01AS42_A7741DisFasUni ;
   private boolean[] T01AS42_n7741DisFasUni ;
   private java.math.BigDecimal[] T01AS42_A7742DisFasDto ;
   private boolean[] T01AS42_n7742DisFasDto ;
   private java.math.BigDecimal[] T01AS42_A7743DisFasRec ;
   private boolean[] T01AS42_n7743DisFasRec ;
   private byte[] T01AS42_A7744FasPreObl ;
   private boolean[] T01AS42_n7744FasPreObl ;
   private byte[] T01AS42_A7747DisFasAut ;
   private boolean[] T01AS42_n7747DisFasAut ;
   private String[] T01AS42_A396EmprCod ;
   private String[] T01AS42_A457FasCod ;
   private String[] T01AS4_A460FasDsc ;
   private String[] T01AS4_A456FasActTin ;
   private boolean[] T01AS4_n456FasActTin ;
   private byte[] T01AS4_A7744FasPreObl ;
   private boolean[] T01AS4_n7744FasPreObl ;
   private String[] T01AS43_A460FasDsc ;
   private String[] T01AS43_A456FasActTin ;
   private boolean[] T01AS43_n456FasActTin ;
   private byte[] T01AS43_A7744FasPreObl ;
   private boolean[] T01AS43_n7744FasPreObl ;
   private String[] T01AS44_A396EmprCod ;
   private int[] T01AS44_A361DisCod ;
   private String[] T01AS44_A758ProCod ;
   private short[] T01AS44_A368DisFasLin ;
   private int[] T01AS3_A361DisCod ;
   private String[] T01AS3_A758ProCod ;
   private short[] T01AS3_A368DisFasLin ;
   private java.math.BigDecimal[] T01AS3_A7740DisFasPre ;
   private boolean[] T01AS3_n7740DisFasPre ;
   private String[] T01AS3_A7741DisFasUni ;
   private boolean[] T01AS3_n7741DisFasUni ;
   private java.math.BigDecimal[] T01AS3_A7742DisFasDto ;
   private boolean[] T01AS3_n7742DisFasDto ;
   private java.math.BigDecimal[] T01AS3_A7743DisFasRec ;
   private boolean[] T01AS3_n7743DisFasRec ;
   private byte[] T01AS3_A7747DisFasAut ;
   private boolean[] T01AS3_n7747DisFasAut ;
   private String[] T01AS3_A396EmprCod ;
   private String[] T01AS3_A457FasCod ;
   private byte[] T01AS3_A7744FasPreObl ;
   private boolean[] T01AS3_n7744FasPreObl ;
   private int[] T01AS2_A361DisCod ;
   private String[] T01AS2_A758ProCod ;
   private short[] T01AS2_A368DisFasLin ;
   private java.math.BigDecimal[] T01AS2_A7740DisFasPre ;
   private boolean[] T01AS2_n7740DisFasPre ;
   private String[] T01AS2_A7741DisFasUni ;
   private boolean[] T01AS2_n7741DisFasUni ;
   private java.math.BigDecimal[] T01AS2_A7742DisFasDto ;
   private boolean[] T01AS2_n7742DisFasDto ;
   private java.math.BigDecimal[] T01AS2_A7743DisFasRec ;
   private boolean[] T01AS2_n7743DisFasRec ;
   private byte[] T01AS2_A7747DisFasAut ;
   private boolean[] T01AS2_n7747DisFasAut ;
   private String[] T01AS2_A396EmprCod ;
   private String[] T01AS2_A457FasCod ;
   private byte[] T01AS2_A7744FasPreObl ;
   private boolean[] T01AS2_n7744FasPreObl ;
   private String[] T01AS48_A460FasDsc ;
   private String[] T01AS48_A456FasActTin ;
   private boolean[] T01AS48_n456FasActTin ;
   private byte[] T01AS48_A7744FasPreObl ;
   private boolean[] T01AS48_n7744FasPreObl ;
   private String[] T01AS49_A396EmprCod ;
   private int[] T01AS49_A361DisCod ;
   private String[] T01AS49_A758ProCod ;
   private short[] T01AS49_A368DisFasLin ;
   private short[] T01AS49_A7919Dta_Ordl ;
   private String[] T01AS50_A396EmprCod ;
   private int[] T01AS50_A361DisCod ;
   private String[] T01AS50_A758ProCod ;
   private short[] T01AS50_A368DisFasLin ;
   private short[] T01AS50_A7727ArtAdiCod ;
   private String[] T01AS51_A396EmprCod ;
   private int[] T01AS51_A361DisCod ;
   private String[] T01AS51_A758ProCod ;
   private short[] T01AS51_A368DisFasLin ;
   private short[] T01AS51_A5377DisQuiLin ;
   private String[] T01AS52_A396EmprCod ;
   private int[] T01AS52_A361DisCod ;
   private String[] T01AS52_A758ProCod ;
   private short[] T01AS52_A368DisFasLin ;
   private int[] T01AS52_A5035A_Discod ;
   private String[] T01AS52_A5038A_DProcod ;
   private short[] T01AS52_A5039A_DOrdlin ;
   private String[] T01AS53_A396EmprCod ;
   private int[] T01AS53_A361DisCod ;
   private String[] T01AS53_A758ProCod ;
   private short[] T01AS53_A368DisFasLin ;
   private short[] T01AS53_A1664ParFasCod ;
   private String[] T01AS54_A396EmprCod ;
   private int[] T01AS54_A361DisCod ;
   private String[] T01AS54_A758ProCod ;
   private short[] T01AS54_A368DisFasLin ;
   private String[] T01AS55_A407EmprNom ;
   private boolean[] T01AS55_n407EmprNom ;
   private String[] T01AS56_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpreatx__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreatx__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreatx__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreatx__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpreatx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AS2", "SELECT DisCod, ProCod, DisFasLin, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS3", "SELECT DisCod, ProCod, DisFasLin, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS4", "SELECT FasDsc, FasActTin, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS5", "SELECT DisCod, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF DisCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS6", "SELECT DisCod, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS7", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS8", "SELECT DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisColNom, DisColNum, DisDes, DisNumPie, DisNumUni, DisUniMed, DisArtDsc, EmprCod, CliCod, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisColNom, DisColNum, DisDes, DisNumPie, DisNumUni, DisUniMed, DisArtDsc, CliCod, DisTipCol NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS9", "SELECT DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisColNom, DisColNum, DisDes, DisNumPie, DisNumUni, DisUniMed, DisArtDsc, EmprCod, CliCod, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS12", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS13", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.PriCod, TM1.DisCliNum, TM1.DisFecCli, T3.CliNom, TM1.DisArtCod, TM1.DisFec, TM1.DisFecEnt, TM1.DisColNom, TM1.DisColNum, TM1.DisDes, TM1.DisNumPie, TM1.DisNumUni, TM1.DisUniMed, TM1.DisArtDsc, TM1.EmprCod, TM1.CliCod, TM1.DisTipCol AS DisTipCol FROM ((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS15", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AS19", "INSERT INTO TXPDISPOS(DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisColNom, DisColNum, DisDes, DisNumPie, DisNumUni, DisUniMed, DisArtDsc, EmprCod, CliCod, DisTipCol, DisArtPes, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01AS20", "UPDATE TXPDISPOS SET PriCod=?, DisCliNum=?, DisFecCli=?, DisArtCod=?, DisFec=?, DisFecEnt=?, DisColNom=?, DisColNum=?, DisDes=?, DisNumPie=?, DisNumUni=?, DisUniMed=?, DisArtDsc=?, CliCod=?, DisTipCol=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01AS21", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01AS22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS23", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS24", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS25", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS26", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS27", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS28", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS29", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS30", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS31", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS32", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS33", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS34", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS35", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS36", "SELECT T1.DisCod, T2.ProDsc, T1.EmprCod, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS37", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AS38", "INSERT INTO TXPDISLIN(DisCod, EmprCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("T01AS39", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01AS40", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS41", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS42", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T2.FasActTin, T1.DisFasPre, T1.DisFasUni, T1.DisFasDto, T1.DisFasRec, T1.FasPreObl, T1.DisFasAut, T1.EmprCod, T1.FasCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS43", "SELECT FasDsc, FasActTin, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS44", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AS45", "INSERT INTO TXPDISFAS(FasPreObl, DisCod, ProCod, DisFasLin, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, EmprCod, FasCod, FasApr, DisMaqPru, DisQuiUl, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01AS46", "UPDATE TXPDISFAS SET FasPreObl=?, DisFasPre=?, DisFasUni=?, DisFasDto=?, DisFasRec=?, DisFasAut=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01AS47", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01AS48", "SELECT FasDsc, FasActTin, FasPreObl FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS49", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS50", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS51", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS52", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS53", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AS54", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS55", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AS56", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 26);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 40 :
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
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               stmt.setString(10, (String)parms[11], 1);
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               stmt.setString(13, (String)parms[14], 1);
               stmt.setString(14, (String)parms[15], 26);
               stmt.setString(15, (String)parms[16], 3);
               stmt.setInt(16, ((Number) parms[17]).intValue());
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[19]).byteValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               stmt.setString(9, (String)parms[10], 1);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(12, (String)parms[13], 1);
               stmt.setString(13, (String)parms[14], 26);
               stmt.setInt(14, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[17]).byteValue());
               }
               stmt.setString(16, (String)parms[18], 3);
               stmt.setInt(17, ((Number) parms[19]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 36 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 43 :
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
            case 44 :
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
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
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

