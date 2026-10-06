package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trespar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV13ResCod = httpContext.GetPar( "ResCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
         A10457ResParCod = httpContext.GetPar( "ResParCod") ;
         A10458ResParKgm = CommonUtil.decimalVal( httpContext.GetPar( "ResParKgm"), ".") ;
         n10458ResParKgm = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1881408( A396EmprCod, AV13ResCod, A10457ResParCod, A10458ResParKgm) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV13ResCod = httpContext.GetPar( "ResCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
         A10457ResParCod = httpContext.GetPar( "ResParCod") ;
         A10458ResParKgm = CommonUtil.decimalVal( httpContext.GetPar( "ResParKgm"), ".") ;
         n10458ResParKgm = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1881408( A396EmprCod, AV13ResCod, A10457ResParCod, A10458ResParKgm) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10440ResCliCod = (int)(GXutil.lval( httpContext.GetPar( "ResCliCod"))) ;
         n10440ResCliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A10440ResCliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10446ResTipCol = (byte)(GXutil.lval( httpContext.GetPar( "ResTipCol"))) ;
         n10446ResTipCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A10446ResTipCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10448ResMatCod = (short)(GXutil.lval( httpContext.GetPar( "ResMatCod"))) ;
         n10448ResMatCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A10448ResMatCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10450ResIntCod = (byte)(GXutil.lval( httpContext.GetPar( "ResIntCod"))) ;
         n10450ResIntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A10450ResIntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A10444ResColNom = httpContext.GetPar( "ResColNom") ;
         n10444ResColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
         A10440ResCliCod = (int)(GXutil.lval( httpContext.GetPar( "ResCliCod"))) ;
         n10440ResCliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A10444ResColNom, A10440ResCliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10440ResCliCod = (int)(GXutil.lval( httpContext.GetPar( "ResCliCod"))) ;
         n10440ResCliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
         A10442ResArtCod = httpContext.GetPar( "ResArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A10440ResCliCod, A10442ResArtCod) ;
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
            A10433ResCod = (int)(GXutil.lval( httpContext.GetPar( "ResCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10433ResCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10433ResCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Particiones de la Reserva", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtResNum_Internalname ;
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
      nRC_GXsfl_149 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_149"))) ;
      nGXsfl_149_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_149_idx"))) ;
      sGXsfl_149_idx = httpContext.GetPar( "sGXsfl_149_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A10456ResPar = (byte)(GXutil.lval( httpContext.GetPar( "ResPar"))) ;
      n10456ResPar = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public trespar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trespar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trespar_impl.class ));
   }

   public trespar_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbResTpo = new HTMLChoice();
      cmbResEst = new HTMLChoice();
      cmbResUni = new HTMLChoice();
      chkResPar = UIFactory.getCheckbox(this);
      chkResAgr = UIFactory.getCheckbox(this);
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
      if ( cmbResTpo.getItemCount() > 0 )
      {
         A10434ResTpo = cmbResTpo.getValidValue(A10434ResTpo) ;
         n10434ResTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Values", cmbResTpo.ToJavascriptSource(), true);
      }
      if ( cmbResEst.getItemCount() > 0 )
      {
         A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValidValue(GXutil.trim( GXutil.str( A10435ResEst, 1, 0))))) ;
         n10435ResEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Values", cmbResEst.ToJavascriptSource(), true);
      }
      if ( cmbResUni.getItemCount() > 0 )
      {
         A10455ResUni = cmbResUni.getValidValue(A10455ResUni) ;
         n10455ResUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Values", cmbResUni.ToJavascriptSource(), true);
      }
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TResPar.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Reserva", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10433ResCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10433ResCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10433ResCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResCod_Jsonclick, 0, "", "", "", "", "", 1, edtResCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbResTpo, cmbResTpo.getInternalname(), GXutil.rtrim( A10434ResTpo), 1, cmbResTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbResTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TResPar.htm");
      cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Values", cmbResTpo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbResEst, cmbResEst.getInternalname(), GXutil.trim( GXutil.str( A10435ResEst, 1, 0)), 1, cmbResEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbResEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TResPar.htm");
      cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Values", cmbResEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Externo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResNum_Internalname, GXutil.rtrim( A10436ResNum), GXutil.rtrim( localUtil.format( A10436ResNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResNum_Jsonclick, 0, "", "", "", "", "", 1, edtResNum_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha de la Reserva", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtResFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResFch_Internalname, localUtil.format(A10437ResFch, "99/99/99"), localUtil.format( A10437ResFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResFch_Jsonclick, 0, "", "", "", "", "", 1, edtResFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtResFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtResFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TResPar.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Compromiso de la Reserva", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtResFchCmp_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResFchCmp_Internalname, localUtil.format(A10438ResFchCmp, "99/99/99"), localUtil.format( A10438ResFchCmp, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResFchCmp_Jsonclick, 0, "", "", "", "", "", 1, edtResFchCmp_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtResFchCmp_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtResFchCmp_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TResPar.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Mínima", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtResFchMin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResFchMin_Internalname, localUtil.ttoc( A10439ResFchMin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10439ResFchMin, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResFchMin_Jsonclick, 0, "", "", "", "", "", 1, edtResFchMin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtResFchMin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtResFchMin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TResPar.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10440ResCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10440ResCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10440ResCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtResCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResCliNom_Internalname, GXutil.rtrim( A10441ResCliNom), GXutil.rtrim( localUtil.format( A10441ResCliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtResCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResArtCod_Internalname, GXutil.rtrim( A10442ResArtCod), GXutil.rtrim( localUtil.format( A10442ResArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtResArtCod_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Desc Artículo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResArtDsc_Internalname, GXutil.rtrim( A10443ResArtDsc), GXutil.rtrim( localUtil.format( A10443ResArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtResArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResColNom_Internalname, GXutil.rtrim( A10444ResColNom), GXutil.rtrim( localUtil.format( A10444ResColNom, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResColNom_Jsonclick, 0, "", "", "", "", "", 1, edtResColNom_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero de Color", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A10445ResColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10445ResColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10445ResColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResColNum_Jsonclick, 0, "", "", "", "", "", 1, edtResColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tipo de Colorante", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A10446ResTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10446ResTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10446ResTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtResTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Tipo de Colorante", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResTipColD_Internalname, GXutil.rtrim( A10447ResTipColD), GXutil.rtrim( localUtil.format( A10447ResTipColD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResTipColD_Jsonclick, 0, "", "", "", "", "", 1, edtResTipColD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Matiz", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResMatCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10448ResMatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResMatCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10448ResMatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10448ResMatCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResMatCod_Jsonclick, 0, "", "", "", "", "", 1, edtResMatCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Desc Matiz", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResMatDsc_Internalname, GXutil.rtrim( A10449ResMatDsc), GXutil.rtrim( localUtil.format( A10449ResMatDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResMatDsc_Jsonclick, 0, "", "", "", "", "", 1, edtResMatDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Intensidad", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtResIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10450ResIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10450ResIntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10450ResIntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtResIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Desc Intensidad", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResIntDsc_Internalname, GXutil.rtrim( A10451ResIntDsc), GXutil.rtrim( localUtil.format( A10451ResIntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtResIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10452ResKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResKgm_Enabled!=0) ? localUtil.format( A10452ResKgm, "ZZZZZ9.99") : localUtil.format( A10452ResKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResKgm_Jsonclick, 0, "", "", "", "", "", 1, edtResKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10453ResMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResMtr_Enabled!=0) ? localUtil.format( A10453ResMtr, "ZZZZZ9.99") : localUtil.format( A10453ResMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResMtr_Jsonclick, 0, "", "", "", "", "", 1, edtResMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtResPie_Internalname, GXutil.ltrim( localUtil.ntoc( A10454ResPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtResPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10454ResPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10454ResPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtResPie_Jsonclick, 0, "", "", "", "", "", 1, edtResPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TResPar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbResUni, cmbResUni.getInternalname(), GXutil.rtrim( A10455ResUni), 1, cmbResUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbResUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TResPar.htm");
      cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Values", cmbResUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkResPar.getInternalname(), GXutil.str( A10456ResPar, 1, 0), "", "", 1, chkResPar.getEnabled(), "1", httpContext.getMessage( "Particionada?", ""), StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol149( ) ;
      nGXsfl_149_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1408 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1408 = (short)(1) ;
            scanStart1881408( ) ;
            while ( RcdFound1408 != 0 )
            {
               init_level_properties1408( ) ;
               getByPrimaryKey1881408( ) ;
               addRow1881408( ) ;
               scanNext1881408( ) ;
            }
            scanEnd1881408( ) ;
            nBlankRcdCount1408 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1881408( ) ;
         standaloneModal1881408( ) ;
         sMode1408 = Gx_mode ;
         while ( nGXsfl_149_idx < nRC_GXsfl_149 )
         {
            bGXsfl_149_Refreshing = true ;
            readRow1881408( ) ;
            edtavnRcdDeleted_1408_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1408_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1408_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1408_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            edtResParCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARCOD_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            edtResParKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARKGM_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            edtResParMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARMTR_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            edtResParPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARPIE_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            chkResAgr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "RESAGR_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkResAgr.getInternalname(), "Enabled", GXutil.ltrimstr( chkResAgr.getEnabled(), 5, 0), !bGXsfl_149_Refreshing);
            edtResAgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESAGRCOD_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResAgrCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            edtResAgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESAGRPAR_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtResAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResAgrPar_Enabled), 5, 0), !bGXsfl_149_Refreshing);
            if ( ( nRcdExists_1408 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1881408( ) ;
            }
            sendRow1881408( ) ;
            bGXsfl_149_Refreshing = false ;
         }
         Gx_mode = sMode1408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1408 = (short)(5) ;
         nRcdExists_1408 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1881408( ) ;
            while ( RcdFound1408 != 0 )
            {
               sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1491408( ) ;
               init_level_properties1408( ) ;
               standaloneNotModal1881408( ) ;
               getByPrimaryKey1881408( ) ;
               standaloneModal1881408( ) ;
               addRow1881408( ) ;
               scanNext1881408( ) ;
            }
            scanEnd1881408( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1408 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1491408( ) ;
      initAll1881408( ) ;
      init_level_properties1408( ) ;
      nRcdExists_1408 = (short)(0) ;
      nIsMod_1408 = (short)(0) ;
      nRcdDeleted_1408 = (short)(0) ;
      nBlankRcdCount1408 = (short)(nBlankRcdUsr1408+nBlankRcdCount1408) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1408 > 0 )
      {
         standaloneNotModal1881408( ) ;
         standaloneModal1881408( ) ;
         addRow1881408( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtResParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1408 = (short)(nBlankRcdCount1408-1) ;
      }
      Gx_mode = sMode1408 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TResPar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TResPar.htm");
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
      e111882 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10433ResCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10433ResCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10434ResTpo = httpContext.cgiGet( "Z10434ResTpo") ;
            Z10435ResEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10435ResEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10436ResNum = httpContext.cgiGet( "Z10436ResNum") ;
            Z10437ResFch = localUtil.ctod( httpContext.cgiGet( "Z10437ResFch"), 0) ;
            Z10438ResFchCmp = localUtil.ctod( httpContext.cgiGet( "Z10438ResFchCmp"), 0) ;
            Z10439ResFchMin = localUtil.ctot( httpContext.cgiGet( "Z10439ResFchMin"), 0) ;
            Z10445ResColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z10445ResColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10446ResTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10446ResTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10448ResMatCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z10448ResMatCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10450ResIntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10450ResIntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10452ResKgm = localUtil.ctond( httpContext.cgiGet( "Z10452ResKgm")) ;
            Z10453ResMtr = localUtil.ctond( httpContext.cgiGet( "Z10453ResMtr")) ;
            Z10454ResPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z10454ResPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10455ResUni = httpContext.cgiGet( "Z10455ResUni") ;
            Z10456ResPar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10456ResPar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10444ResColNom = httpContext.cgiGet( "Z10444ResColNom") ;
            Z10440ResCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10440ResCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_149 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_149"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13ResCod = httpContext.cgiGet( "vRESCOD") ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10433ResCod = (int)(localUtil.ctol( httpContext.cgiGet( edtResCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10433ResCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10433ResCod), 8, 0));
            cmbResTpo.setName( cmbResTpo.getInternalname() );
            cmbResTpo.setValue( httpContext.cgiGet( cmbResTpo.getInternalname()) );
            A10434ResTpo = httpContext.cgiGet( cmbResTpo.getInternalname()) ;
            n10434ResTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
            cmbResEst.setName( cmbResEst.getInternalname() );
            cmbResEst.setValue( httpContext.cgiGet( cmbResEst.getInternalname()) );
            A10435ResEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbResEst.getInternalname()))) ;
            n10435ResEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
            A10436ResNum = httpContext.cgiGet( edtResNum_Internalname) ;
            n10436ResNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
            if ( localUtil.vcdate( httpContext.cgiGet( edtResFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RESFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10437ResFch = GXutil.nullDate() ;
               n10437ResFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
            }
            else
            {
               A10437ResFch = localUtil.ctod( httpContext.cgiGet( edtResFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10437ResFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtResFchCmp_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RESFCHCMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResFchCmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10438ResFchCmp = GXutil.nullDate() ;
               n10438ResFchCmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
            }
            else
            {
               A10438ResFchCmp = localUtil.ctod( httpContext.cgiGet( edtResFchCmp_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10438ResFchCmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
            }
            A10439ResFchMin = localUtil.ctot( httpContext.cgiGet( edtResFchMin_Internalname)) ;
            n10439ResFchMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10440ResCliCod = 0 ;
               n10440ResCliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
            }
            else
            {
               A10440ResCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtResCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10440ResCliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
            }
            A10441ResCliNom = httpContext.cgiGet( edtResCliNom_Internalname) ;
            n10441ResCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
            A10442ResArtCod = httpContext.cgiGet( edtResArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
            A10443ResArtDsc = httpContext.cgiGet( edtResArtDsc_Internalname) ;
            n10443ResArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
            A10444ResColNom = GXutil.upper( httpContext.cgiGet( edtResColNom_Internalname)) ;
            n10444ResColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10445ResColNum = 0 ;
               n10445ResColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
            }
            else
            {
               A10445ResColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtResColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10445ResColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESTIPCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResTipCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10446ResTipCol = (byte)(0) ;
               n10446ResTipCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
            }
            else
            {
               A10446ResTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtResTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10446ResTipCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
            }
            A10447ResTipColD = httpContext.cgiGet( edtResTipColD_Internalname) ;
            n10447ResTipColD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESMATCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResMatCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10448ResMatCod = (short)(0) ;
               n10448ResMatCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
            }
            else
            {
               A10448ResMatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtResMatCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10448ResMatCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
            }
            A10449ResMatDsc = httpContext.cgiGet( edtResMatDsc_Internalname) ;
            n10449ResMatDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RESINTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtResIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10450ResIntCod = (byte)(0) ;
               n10450ResIntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
            }
            else
            {
               A10450ResIntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtResIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10450ResIntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
            }
            A10451ResIntDsc = httpContext.cgiGet( edtResIntDsc_Internalname) ;
            n10451ResIntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
            A10452ResKgm = localUtil.ctond( httpContext.cgiGet( edtResKgm_Internalname)) ;
            n10452ResKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
            A10453ResMtr = localUtil.ctond( httpContext.cgiGet( edtResMtr_Internalname)) ;
            n10453ResMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
            A10454ResPie = (int)(localUtil.ctol( httpContext.cgiGet( edtResPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10454ResPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
            cmbResUni.setName( cmbResUni.getInternalname() );
            cmbResUni.setValue( httpContext.cgiGet( cmbResUni.getInternalname()) );
            A10455ResUni = httpContext.cgiGet( cmbResUni.getInternalname()) ;
            n10455ResUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
            A10456ResPar = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkResPar.getInternalname()), "1")==0) ? 1 : 0)) ;
            n10456ResPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TResPar");
            A10434ResTpo = httpContext.cgiGet( cmbResTpo.getInternalname()) ;
            n10434ResTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
            forbiddenHiddens.add("ResTpo", GXutil.rtrim( localUtil.format( A10434ResTpo, "")));
            A10435ResEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbResEst.getInternalname()))) ;
            n10435ResEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
            forbiddenHiddens.add("ResEst", localUtil.format( DecimalUtil.doubleToDec(A10435ResEst), "9"));
            A10439ResFchMin = localUtil.ctot( httpContext.cgiGet( edtResFchMin_Internalname)) ;
            n10439ResFchMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("ResFchMin", localUtil.format( A10439ResFchMin, "99/99/99 99:99"));
            A10452ResKgm = localUtil.ctond( httpContext.cgiGet( edtResKgm_Internalname)) ;
            n10452ResKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
            forbiddenHiddens.add("ResKgm", localUtil.format( A10452ResKgm, "ZZZZZ9.99"));
            A10453ResMtr = localUtil.ctond( httpContext.cgiGet( edtResMtr_Internalname)) ;
            n10453ResMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
            forbiddenHiddens.add("ResMtr", localUtil.format( A10453ResMtr, "ZZZZZ9.99"));
            A10454ResPie = (int)(localUtil.ctol( httpContext.cgiGet( edtResPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10454ResPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
            forbiddenHiddens.add("ResPie", localUtil.format( DecimalUtil.doubleToDec(A10454ResPie), "ZZZZZ9"));
            A10455ResUni = httpContext.cgiGet( cmbResUni.getInternalname()) ;
            n10455ResUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
            forbiddenHiddens.add("ResUni", GXutil.rtrim( localUtil.format( A10455ResUni, "")));
            A10456ResPar = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkResPar.getInternalname()), "1")==0) ? 1 : 0)) ;
            n10456ResPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
            forbiddenHiddens.add("ResPar", localUtil.format( DecimalUtil.doubleToDec(A10456ResPar), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trespar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A10433ResCod = (int)(GXutil.lval( httpContext.GetPar( "ResCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10433ResCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10433ResCod), 8, 0));
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
                        e111882 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'AGRUPACIONES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Agrupaciones' */
                        e121882 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'FASES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Fases' */
                        e131882 ();
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
            initAll1881410( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1408_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1408_Enabled), 5, 0), !bGXsfl_149_Refreshing);
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
      disableAttributes1881410( ) ;
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

   public void confirm_1880( )
   {
      beforeValidate1881410( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1881410( ) ;
         }
         else
         {
            checkExtendedTable1881410( ) ;
            if ( AnyError == 0 )
            {
               zm1881410( 22) ;
               zm1881410( 23) ;
               zm1881410( 24) ;
               zm1881410( 25) ;
               zm1881410( 26) ;
               zm1881410( 27) ;
               zm1881410( 28) ;
            }
            closeExtendedTableCursors1881410( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1410 = Gx_mode ;
         confirm_1881408( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1410 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1880( ) ;
      }
   }

   public void confirm_1881408( )
   {
      nGXsfl_149_idx = 0 ;
      while ( nGXsfl_149_idx < nRC_GXsfl_149 )
      {
         readRow1881408( ) ;
         if ( ( nRcdExists_1408 != 0 ) || ( nIsMod_1408 != 0 ) )
         {
            getKey1881408( ) ;
            if ( ( nRcdExists_1408 == 0 ) && ( nRcdDeleted_1408 == 0 ) )
            {
               if ( RcdFound1408 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1881408( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1881408( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1881408( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RESPARCOD_" + sGXsfl_149_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtResParCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1408 != 0 )
               {
                  if ( nRcdDeleted_1408 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1881408( ) ;
                     load1881408( ) ;
                     beforeValidate1881408( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1881408( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1408 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1881408( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1881408( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1881408( ) ;
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
                  if ( nRcdDeleted_1408 == 0 )
                  {
                     GXCCtl = "RESPARCOD_" + sGXsfl_149_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtResParCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1408_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResParCod_Internalname, GXutil.rtrim( A10457ResParCod)) ;
         httpContext.changePostValue( edtResParKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResParMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResParPie_Internalname, GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkResAgr.getInternalname(), GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResAgrPar_Internalname, GXutil.rtrim( A10463ResAgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z10457ResParCod_"+sGXsfl_149_idx, GXutil.rtrim( Z10457ResParCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10458ResParKgm_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10459ResParMtr_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10460ResParPie_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10461ResAgr_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10461ResAgr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10462ResAgrCod_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10463ResAgrPar_"+sGXsfl_149_idx, GXutil.rtrim( Z10463ResAgrPar)) ;
         httpContext.changePostValue( "nRcdDeleted_1408_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1408_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1408_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N10457ResParCod_"+sGXsfl_149_idx, GXutil.rtrim( A10457ResParCod)) ;
         httpContext.changePostValue( "N10458ResParKgm_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N10459ResParMtr_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N10460ResParPie_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1408 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1408_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1408_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARCOD_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARKGM_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARMTR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARPIE_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESAGR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkResAgr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESAGRCOD_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESAGRPAR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1880( )
   {
   }

   public void e111882( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trespar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV14Pgmname, (byte)(99), GXv_char2) ;
      trespar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trespar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trespar_impl.this.A396EmprCod = GXv_char2[0] ;
      trespar_impl.this.AV11EmprNom = GXv_char3[0] ;
      trespar_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121882( )
   {
      /* 'Agrupaciones' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e131882( )
   {
      /* 'Fases' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tresfas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10433ResCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A10457ResParCod))}, new String[] {"EmprCod","ResCod","ResParCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void zm1881410( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10434ResTpo = T01885_A10434ResTpo[0] ;
            Z10435ResEst = T01885_A10435ResEst[0] ;
            Z10436ResNum = T01885_A10436ResNum[0] ;
            Z10437ResFch = T01885_A10437ResFch[0] ;
            Z10438ResFchCmp = T01885_A10438ResFchCmp[0] ;
            Z10439ResFchMin = T01885_A10439ResFchMin[0] ;
            Z10445ResColNum = T01885_A10445ResColNum[0] ;
            Z10446ResTipCol = T01885_A10446ResTipCol[0] ;
            Z10448ResMatCod = T01885_A10448ResMatCod[0] ;
            Z10450ResIntCod = T01885_A10450ResIntCod[0] ;
            Z10452ResKgm = T01885_A10452ResKgm[0] ;
            Z10453ResMtr = T01885_A10453ResMtr[0] ;
            Z10454ResPie = T01885_A10454ResPie[0] ;
            Z10455ResUni = T01885_A10455ResUni[0] ;
            Z10456ResPar = T01885_A10456ResPar[0] ;
            Z10444ResColNom = T01885_A10444ResColNom[0] ;
            Z10440ResCliCod = T01885_A10440ResCliCod[0] ;
         }
         else
         {
            Z10434ResTpo = A10434ResTpo ;
            Z10435ResEst = A10435ResEst ;
            Z10436ResNum = A10436ResNum ;
            Z10437ResFch = A10437ResFch ;
            Z10438ResFchCmp = A10438ResFchCmp ;
            Z10439ResFchMin = A10439ResFchMin ;
            Z10445ResColNum = A10445ResColNum ;
            Z10446ResTipCol = A10446ResTipCol ;
            Z10448ResMatCod = A10448ResMatCod ;
            Z10450ResIntCod = A10450ResIntCod ;
            Z10452ResKgm = A10452ResKgm ;
            Z10453ResMtr = A10453ResMtr ;
            Z10454ResPie = A10454ResPie ;
            Z10455ResUni = A10455ResUni ;
            Z10456ResPar = A10456ResPar ;
            Z10444ResColNom = A10444ResColNom ;
            Z10440ResCliCod = A10440ResCliCod ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z10433ResCod = A10433ResCod ;
         Z10434ResTpo = A10434ResTpo ;
         Z10435ResEst = A10435ResEst ;
         Z10436ResNum = A10436ResNum ;
         Z10437ResFch = A10437ResFch ;
         Z10438ResFchCmp = A10438ResFchCmp ;
         Z10439ResFchMin = A10439ResFchMin ;
         Z10445ResColNum = A10445ResColNum ;
         Z10446ResTipCol = A10446ResTipCol ;
         Z10448ResMatCod = A10448ResMatCod ;
         Z10450ResIntCod = A10450ResIntCod ;
         Z10452ResKgm = A10452ResKgm ;
         Z10453ResMtr = A10453ResMtr ;
         Z10454ResPie = A10454ResPie ;
         Z10455ResUni = A10455ResUni ;
         Z10456ResPar = A10456ResPar ;
         Z10444ResColNom = A10444ResColNom ;
         Z10440ResCliCod = A10440ResCliCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z10441ResCliNom = A10441ResCliNom ;
         Z10442ResArtCod = A10442ResArtCod ;
         Z10443ResArtDsc = A10443ResArtDsc ;
         Z10447ResTipColD = A10447ResTipColD ;
         Z10449ResMatDsc = A10449ResMatDsc ;
         Z10451ResIntDsc = A10451ResIntDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResTpo.getEnabled(), 5, 0), true);
      cmbResEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResEst.getEnabled(), 5, 0), true);
      edtResFchMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchMin_Enabled), 5, 0), true);
      cmbResUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResUni.getEnabled(), 5, 0), true);
      edtResKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResKgm_Enabled), 5, 0), true);
      edtResMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMtr_Enabled), 5, 0), true);
      edtResPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResPie_Enabled), 5, 0), true);
      chkResPar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "Enabled", GXutil.ltrimstr( chkResPar.getEnabled(), 5, 0), true);
      AV14Pgmname = "TResPar" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      cmbResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResTpo.getEnabled(), 5, 0), true);
      cmbResEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResEst.getEnabled(), 5, 0), true);
      edtResFchMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchMin_Enabled), 5, 0), true);
      cmbResUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResUni.getEnabled(), 5, 0), true);
      edtResKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResKgm_Enabled), 5, 0), true);
      edtResMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMtr_Enabled), 5, 0), true);
      edtResPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResPie_Enabled), 5, 0), true);
      chkResPar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "Enabled", GXutil.ltrimstr( chkResPar.getEnabled(), 5, 0), true);
      /* Using cursor T01887 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01887_A407EmprNom[0] ;
      n407EmprNom = T01887_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      AV13ResCod = GXutil.str( A10433ResCod, 10, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
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

   public void load1881410( )
   {
      /* Using cursor T018813 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1410 = (short)(1) ;
         A407EmprNom = T018813_A407EmprNom[0] ;
         n407EmprNom = T018813_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10434ResTpo = T018813_A10434ResTpo[0] ;
         n10434ResTpo = T018813_n10434ResTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
         A10435ResEst = T018813_A10435ResEst[0] ;
         n10435ResEst = T018813_n10435ResEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
         A10436ResNum = T018813_A10436ResNum[0] ;
         n10436ResNum = T018813_n10436ResNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
         A10437ResFch = T018813_A10437ResFch[0] ;
         n10437ResFch = T018813_n10437ResFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
         A10438ResFchCmp = T018813_A10438ResFchCmp[0] ;
         n10438ResFchCmp = T018813_n10438ResFchCmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
         A10439ResFchMin = T018813_A10439ResFchMin[0] ;
         n10439ResFchMin = T018813_n10439ResFchMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10442ResArtCod = T018813_A10442ResArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
         A10445ResColNum = T018813_A10445ResColNum[0] ;
         n10445ResColNum = T018813_n10445ResColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
         A10446ResTipCol = T018813_A10446ResTipCol[0] ;
         n10446ResTipCol = T018813_n10446ResTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
         A10448ResMatCod = T018813_A10448ResMatCod[0] ;
         n10448ResMatCod = T018813_n10448ResMatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
         A10450ResIntCod = T018813_A10450ResIntCod[0] ;
         n10450ResIntCod = T018813_n10450ResIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
         A10452ResKgm = T018813_A10452ResKgm[0] ;
         n10452ResKgm = T018813_n10452ResKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
         A10453ResMtr = T018813_A10453ResMtr[0] ;
         n10453ResMtr = T018813_n10453ResMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
         A10454ResPie = T018813_A10454ResPie[0] ;
         n10454ResPie = T018813_n10454ResPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
         A10455ResUni = T018813_A10455ResUni[0] ;
         n10455ResUni = T018813_n10455ResUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
         A10456ResPar = T018813_A10456ResPar[0] ;
         n10456ResPar = T018813_n10456ResPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
         A10444ResColNom = T018813_A10444ResColNom[0] ;
         n10444ResColNom = T018813_n10444ResColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
         A10440ResCliCod = T018813_A10440ResCliCod[0] ;
         n10440ResCliCod = T018813_n10440ResCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
         A10441ResCliNom = T018813_A10441ResCliNom[0] ;
         n10441ResCliNom = T018813_n10441ResCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
         A10443ResArtDsc = T018813_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T018813_n10443ResArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
         A10447ResTipColD = T018813_A10447ResTipColD[0] ;
         n10447ResTipColD = T018813_n10447ResTipColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
         A10449ResMatDsc = T018813_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018813_n10449ResMatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
         A10451ResIntDsc = T018813_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018813_n10451ResIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
         zm1881410( -21) ;
      }
      pr_default.close(11);
      onLoadActions1881410( ) ;
   }

   public void onLoadActions1881410( )
   {
   }

   public void checkExtendedTable1881410( )
   {
      nIsDirty_1410 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01888 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A10441ResCliNom = T01888_A10441ResCliNom[0] ;
         n10441ResCliNom = T01888_n10441ResCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      else
      {
         nIsDirty_1410 = (short)(1) ;
         A10441ResCliNom = "" ;
         n10441ResCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      pr_default.close(6);
      /* Using cursor T018810 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A10447ResTipColD = T018810_A10447ResTipColD[0] ;
         n10447ResTipColD = T018810_n10447ResTipColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      else
      {
         nIsDirty_1410 = (short)(1) ;
         A10447ResTipColD = "" ;
         n10447ResTipColD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      pr_default.close(8);
      /* Using cursor T018811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A10449ResMatDsc = T018811_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018811_n10449ResMatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      else
      {
         nIsDirty_1410 = (short)(1) ;
         A10449ResMatDsc = "" ;
         n10449ResMatDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      pr_default.close(9);
      /* Using cursor T018812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A10451ResIntDsc = T018812_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018812_n10451ResIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      else
      {
         nIsDirty_1410 = (short)(1) ;
         A10451ResIntDsc = "" ;
         n10451ResIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      pr_default.close(10);
      /* Using cursor T01886 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EstTinCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtResColNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10442ResArtCod = T01886_A10442ResArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
      pr_default.close(4);
      /* Using cursor T01889 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A10443ResArtDsc = T01889_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T01889_n10443ResArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      else
      {
         nIsDirty_1410 = (short)(1) ;
         A10443ResArtDsc = "" ;
         n10443ResArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1881410( )
   {
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(4);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          int A10440ResCliCod )
   {
      /* Using cursor T018814 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A10441ResCliNom = T018814_A10441ResCliNom[0] ;
         n10441ResCliNom = T018814_n10441ResCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      else
      {
         A10441ResCliNom = "" ;
         n10441ResCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10441ResCliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_26( String A396EmprCod ,
                          byte A10446ResTipCol )
   {
      /* Using cursor T018815 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A10447ResTipColD = T018815_A10447ResTipColD[0] ;
         n10447ResTipColD = T018815_n10447ResTipColD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      else
      {
         A10447ResTipColD = "" ;
         n10447ResTipColD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10447ResTipColD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_27( String A396EmprCod ,
                          short A10448ResMatCod )
   {
      /* Using cursor T018816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A10449ResMatDsc = T018816_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018816_n10449ResMatDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      else
      {
         A10449ResMatDsc = "" ;
         n10449ResMatDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10449ResMatDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_28( String A396EmprCod ,
                          byte A10450ResIntCod )
   {
      /* Using cursor T018817 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A10451ResIntDsc = T018817_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018817_n10451ResIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      else
      {
         A10451ResIntDsc = "" ;
         n10451ResIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10451ResIntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_22( String A10444ResColNom ,
                          int A10440ResCliCod )
   {
      /* Using cursor T018818 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EstTinCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtResColNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10442ResArtCod = T018818_A10442ResArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10442ResArtCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_25( String A396EmprCod ,
                          int A10440ResCliCod ,
                          String A10442ResArtCod )
   {
      /* Using cursor T018819 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A10443ResArtDsc = T018819_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T018819_n10443ResArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      else
      {
         A10443ResArtDsc = "" ;
         n10443ResArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10443ResArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1881410( )
   {
      /* Using cursor T018820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1410 = (short)(1) ;
      }
      else
      {
         RcdFound1410 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01885 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01885_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T01885_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1881410( 21) ;
         RcdFound1410 = (short)(1) ;
         A10434ResTpo = T01885_A10434ResTpo[0] ;
         n10434ResTpo = T01885_n10434ResTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
         A10435ResEst = T01885_A10435ResEst[0] ;
         n10435ResEst = T01885_n10435ResEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
         A10436ResNum = T01885_A10436ResNum[0] ;
         n10436ResNum = T01885_n10436ResNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
         A10437ResFch = T01885_A10437ResFch[0] ;
         n10437ResFch = T01885_n10437ResFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
         A10438ResFchCmp = T01885_A10438ResFchCmp[0] ;
         n10438ResFchCmp = T01885_n10438ResFchCmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
         A10439ResFchMin = T01885_A10439ResFchMin[0] ;
         n10439ResFchMin = T01885_n10439ResFchMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10445ResColNum = T01885_A10445ResColNum[0] ;
         n10445ResColNum = T01885_n10445ResColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
         A10446ResTipCol = T01885_A10446ResTipCol[0] ;
         n10446ResTipCol = T01885_n10446ResTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
         A10448ResMatCod = T01885_A10448ResMatCod[0] ;
         n10448ResMatCod = T01885_n10448ResMatCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
         A10450ResIntCod = T01885_A10450ResIntCod[0] ;
         n10450ResIntCod = T01885_n10450ResIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
         A10452ResKgm = T01885_A10452ResKgm[0] ;
         n10452ResKgm = T01885_n10452ResKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
         A10453ResMtr = T01885_A10453ResMtr[0] ;
         n10453ResMtr = T01885_n10453ResMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
         A10454ResPie = T01885_A10454ResPie[0] ;
         n10454ResPie = T01885_n10454ResPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
         A10455ResUni = T01885_A10455ResUni[0] ;
         n10455ResUni = T01885_n10455ResUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
         A10456ResPar = T01885_A10456ResPar[0] ;
         n10456ResPar = T01885_n10456ResPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
         A10444ResColNom = T01885_A10444ResColNom[0] ;
         n10444ResColNom = T01885_n10444ResColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
         A10440ResCliCod = T01885_A10440ResCliCod[0] ;
         n10440ResCliCod = T01885_n10440ResCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z10433ResCod = A10433ResCod ;
         sMode1410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1881410( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1410 = (short)(0) ;
            initializeNonKey1881410( ) ;
         }
         Gx_mode = sMode1410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1410 = (short)(0) ;
         initializeNonKey1881410( ) ;
         sMode1410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1881410( ) ;
      if ( RcdFound1410 == 0 )
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
      RcdFound1410 = (short)(0) ;
      /* Using cursor T018821 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( GXutil.strcmp(T018821_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018821_A10433ResCod[0] == A10433ResCod ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( GXutil.strcmp(T018821_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018821_A10433ResCod[0] == A10433ResCod ) )
         {
            RcdFound1410 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound1410 = (short)(0) ;
      /* Using cursor T018822 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( GXutil.strcmp(T018822_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018822_A10433ResCod[0] == A10433ResCod ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( GXutil.strcmp(T018822_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018822_A10433ResCod[0] == A10433ResCod ) )
         {
            RcdFound1410 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1881410( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtResNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1881410( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1410 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) )
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
               GX_FocusControl = edtResNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1881410( ) ;
               GX_FocusControl = edtResNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtResNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1881410( ) ;
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
                  GX_FocusControl = edtResNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1881410( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) )
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
         GX_FocusControl = edtResNum_Internalname ;
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
      getKey1881410( ) ;
      if ( RcdFound1410 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10433ResCod != Z10433ResCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trespar");
      GX_FocusControl = edtResNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1880( ) ;
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
      if ( RcdFound1410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtResNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1881410( ) ;
      if ( RcdFound1410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1881410( ) ;
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
      if ( RcdFound1410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResNum_Internalname ;
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
      if ( RcdFound1410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResNum_Internalname ;
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
      scanStart1881410( ) ;
      if ( RcdFound1410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1410 != 0 )
         {
            scanNext1881410( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtResNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1881410( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1881410( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01884 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResFil"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z10434ResTpo, T01884_A10434ResTpo[0]) != 0 ) || ( Z10435ResEst != T01884_A10435ResEst[0] ) || ( GXutil.strcmp(Z10436ResNum, T01884_A10436ResNum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10437ResFch), GXutil.resetTime(T01884_A10437ResFch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z10438ResFchCmp), GXutil.resetTime(T01884_A10438ResFchCmp[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10439ResFchMin, T01884_A10439ResFchMin[0]) ) || ( Z10445ResColNum != T01884_A10445ResColNum[0] ) || ( Z10446ResTipCol != T01884_A10446ResTipCol[0] ) || ( Z10448ResMatCod != T01884_A10448ResMatCod[0] ) || ( Z10450ResIntCod != T01884_A10450ResIntCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10452ResKgm, T01884_A10452ResKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z10453ResMtr, T01884_A10453ResMtr[0]) != 0 ) || ( Z10454ResPie != T01884_A10454ResPie[0] ) || ( GXutil.strcmp(Z10455ResUni, T01884_A10455ResUni[0]) != 0 ) || ( Z10456ResPar != T01884_A10456ResPar[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10444ResColNom, T01884_A10444ResColNom[0]) != 0 ) || ( Z10440ResCliCod != T01884_A10440ResCliCod[0] ) )
         {
            if ( GXutil.strcmp(Z10434ResTpo, T01884_A10434ResTpo[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResTpo");
               GXutil.writeLogRaw("Old: ",Z10434ResTpo);
               GXutil.writeLogRaw("Current: ",T01884_A10434ResTpo[0]);
            }
            if ( Z10435ResEst != T01884_A10435ResEst[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResEst");
               GXutil.writeLogRaw("Old: ",Z10435ResEst);
               GXutil.writeLogRaw("Current: ",T01884_A10435ResEst[0]);
            }
            if ( GXutil.strcmp(Z10436ResNum, T01884_A10436ResNum[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResNum");
               GXutil.writeLogRaw("Old: ",Z10436ResNum);
               GXutil.writeLogRaw("Current: ",T01884_A10436ResNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10437ResFch), GXutil.resetTime(T01884_A10437ResFch[0])) ) )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResFch");
               GXutil.writeLogRaw("Old: ",Z10437ResFch);
               GXutil.writeLogRaw("Current: ",T01884_A10437ResFch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10438ResFchCmp), GXutil.resetTime(T01884_A10438ResFchCmp[0])) ) )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResFchCmp");
               GXutil.writeLogRaw("Old: ",Z10438ResFchCmp);
               GXutil.writeLogRaw("Current: ",T01884_A10438ResFchCmp[0]);
            }
            if ( !( GXutil.dateCompare(Z10439ResFchMin, T01884_A10439ResFchMin[0]) ) )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResFchMin");
               GXutil.writeLogRaw("Old: ",Z10439ResFchMin);
               GXutil.writeLogRaw("Current: ",T01884_A10439ResFchMin[0]);
            }
            if ( Z10445ResColNum != T01884_A10445ResColNum[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResColNum");
               GXutil.writeLogRaw("Old: ",Z10445ResColNum);
               GXutil.writeLogRaw("Current: ",T01884_A10445ResColNum[0]);
            }
            if ( Z10446ResTipCol != T01884_A10446ResTipCol[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResTipCol");
               GXutil.writeLogRaw("Old: ",Z10446ResTipCol);
               GXutil.writeLogRaw("Current: ",T01884_A10446ResTipCol[0]);
            }
            if ( Z10448ResMatCod != T01884_A10448ResMatCod[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResMatCod");
               GXutil.writeLogRaw("Old: ",Z10448ResMatCod);
               GXutil.writeLogRaw("Current: ",T01884_A10448ResMatCod[0]);
            }
            if ( Z10450ResIntCod != T01884_A10450ResIntCod[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResIntCod");
               GXutil.writeLogRaw("Old: ",Z10450ResIntCod);
               GXutil.writeLogRaw("Current: ",T01884_A10450ResIntCod[0]);
            }
            if ( DecimalUtil.compareTo(Z10452ResKgm, T01884_A10452ResKgm[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResKgm");
               GXutil.writeLogRaw("Old: ",Z10452ResKgm);
               GXutil.writeLogRaw("Current: ",T01884_A10452ResKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z10453ResMtr, T01884_A10453ResMtr[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResMtr");
               GXutil.writeLogRaw("Old: ",Z10453ResMtr);
               GXutil.writeLogRaw("Current: ",T01884_A10453ResMtr[0]);
            }
            if ( Z10454ResPie != T01884_A10454ResPie[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResPie");
               GXutil.writeLogRaw("Old: ",Z10454ResPie);
               GXutil.writeLogRaw("Current: ",T01884_A10454ResPie[0]);
            }
            if ( GXutil.strcmp(Z10455ResUni, T01884_A10455ResUni[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResUni");
               GXutil.writeLogRaw("Old: ",Z10455ResUni);
               GXutil.writeLogRaw("Current: ",T01884_A10455ResUni[0]);
            }
            if ( Z10456ResPar != T01884_A10456ResPar[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResPar");
               GXutil.writeLogRaw("Old: ",Z10456ResPar);
               GXutil.writeLogRaw("Current: ",T01884_A10456ResPar[0]);
            }
            if ( GXutil.strcmp(Z10444ResColNom, T01884_A10444ResColNom[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResColNom");
               GXutil.writeLogRaw("Old: ",Z10444ResColNom);
               GXutil.writeLogRaw("Current: ",T01884_A10444ResColNom[0]);
            }
            if ( Z10440ResCliCod != T01884_A10440ResCliCod[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResCliCod");
               GXutil.writeLogRaw("Old: ",Z10440ResCliCod);
               GXutil.writeLogRaw("Current: ",T01884_A10440ResCliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPResFil"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1881410( )
   {
      beforeValidate1881410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1881410( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1881410( 0) ;
         checkOptimisticConcurrency1881410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1881410( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1881410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018823 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A10433ResCod), Boolean.valueOf(n10434ResTpo), A10434ResTpo, Boolean.valueOf(n10435ResEst), Byte.valueOf(A10435ResEst), Boolean.valueOf(n10436ResNum), A10436ResNum, Boolean.valueOf(n10437ResFch), A10437ResFch, Boolean.valueOf(n10438ResFchCmp), A10438ResFchCmp, Boolean.valueOf(n10439ResFchMin), A10439ResFchMin, Boolean.valueOf(n10445ResColNum), Integer.valueOf(A10445ResColNum), Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol), Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod), Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod), Boolean.valueOf(n10452ResKgm), A10452ResKgm, Boolean.valueOf(n10453ResMtr), A10453ResMtr, Boolean.valueOf(n10454ResPie), Integer.valueOf(A10454ResPie), Boolean.valueOf(n10455ResUni), A10455ResUni, Boolean.valueOf(n10456ResPar), Byte.valueOf(A10456ResPar), Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFil");
                  if ( (pr_default.getStatus(21) == 1) )
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
                        processLevel1881410( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1880( ) ;
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
            load1881410( ) ;
         }
         endLevel1881410( ) ;
      }
      closeExtendedTableCursors1881410( ) ;
   }

   public void update1881410( )
   {
      beforeValidate1881410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1881410( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1881410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1881410( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1881410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018824 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n10434ResTpo), A10434ResTpo, Boolean.valueOf(n10435ResEst), Byte.valueOf(A10435ResEst), Boolean.valueOf(n10436ResNum), A10436ResNum, Boolean.valueOf(n10437ResFch), A10437ResFch, Boolean.valueOf(n10438ResFchCmp), A10438ResFchCmp, Boolean.valueOf(n10439ResFchMin), A10439ResFchMin, Boolean.valueOf(n10445ResColNum), Integer.valueOf(A10445ResColNum), Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol), Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod), Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod), Boolean.valueOf(n10452ResKgm), A10452ResKgm, Boolean.valueOf(n10453ResMtr), A10453ResMtr, Boolean.valueOf(n10454ResPie), Integer.valueOf(A10454ResPie), Boolean.valueOf(n10455ResUni), A10455ResUni, Boolean.valueOf(n10456ResPar), Byte.valueOf(A10456ResPar), Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A396EmprCod, Integer.valueOf(A10433ResCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFil");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResFil"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1881410( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1881410( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1880( ) ;
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
         endLevel1881410( ) ;
      }
      closeExtendedTableCursors1881410( ) ;
   }

   public void deferredUpdate1881410( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1881410( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1881410( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1881410( ) ;
         afterConfirm1881410( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1881410( ) ;
            if ( AnyError == 0 )
            {
               scanStart1881408( ) ;
               while ( RcdFound1408 != 0 )
               {
                  getByPrimaryKey1881408( ) ;
                  delete1881408( ) ;
                  scanNext1881408( ) ;
               }
               scanEnd1881408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018825 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFil");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1410 == 0 )
                        {
                           initAll1881410( ) ;
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
                        resetCaption1880( ) ;
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
      sMode1410 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1881410( ) ;
      Gx_mode = sMode1410 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1881410( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T018826 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A10441ResCliNom = T018826_A10441ResCliNom[0] ;
            n10441ResCliNom = T018826_n10441ResCliNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
         }
         else
         {
            A10441ResCliNom = "" ;
            n10441ResCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
         }
         pr_default.close(24);
         /* Using cursor T018827 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
         A10442ResArtCod = T018827_A10442ResArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
         pr_default.close(25);
         /* Using cursor T018828 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A10443ResArtDsc = T018828_A10443ResArtDsc[0] ;
            n10443ResArtDsc = T018828_n10443ResArtDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
         }
         else
         {
            A10443ResArtDsc = "" ;
            n10443ResArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
         }
         pr_default.close(26);
         /* Using cursor T018829 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A10447ResTipColD = T018829_A10447ResTipColD[0] ;
            n10447ResTipColD = T018829_n10447ResTipColD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
         }
         else
         {
            A10447ResTipColD = "" ;
            n10447ResTipColD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
         }
         pr_default.close(27);
         /* Using cursor T018830 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A10449ResMatDsc = T018830_A10449ResMatDsc[0] ;
            n10449ResMatDsc = T018830_n10449ResMatDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
         }
         else
         {
            A10449ResMatDsc = "" ;
            n10449ResMatDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
         }
         pr_default.close(28);
         /* Using cursor T018831 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A10451ResIntDsc = T018831_A10451ResIntDsc[0] ;
            n10451ResIntDsc = T018831_n10451ResIntDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
         }
         else
         {
            A10451ResIntDsc = "" ;
            n10451ResIntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
         }
         pr_default.close(29);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T018832 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ResFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void processNestedLevel1881408( )
   {
      nGXsfl_149_idx = 0 ;
      while ( nGXsfl_149_idx < nRC_GXsfl_149 )
      {
         readRow1881408( ) ;
         if ( ( nRcdExists_1408 != 0 ) || ( nIsMod_1408 != 0 ) )
         {
            standaloneNotModal1881408( ) ;
            getKey1881408( ) ;
            if ( ( nRcdExists_1408 == 0 ) && ( nRcdDeleted_1408 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1881408( ) ;
            }
            else
            {
               if ( RcdFound1408 != 0 )
               {
                  if ( ( nRcdDeleted_1408 != 0 ) && ( nRcdExists_1408 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1881408( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1408 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1881408( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1408 == 0 )
                  {
                     GXCCtl = "RESPARCOD_" + sGXsfl_149_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtResParCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1408_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResParCod_Internalname, GXutil.rtrim( A10457ResParCod)) ;
         httpContext.changePostValue( edtResParKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResParMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResParPie_Internalname, GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkResAgr.getInternalname(), GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtResAgrPar_Internalname, GXutil.rtrim( A10463ResAgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z10457ResParCod_"+sGXsfl_149_idx, GXutil.rtrim( Z10457ResParCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10458ResParKgm_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10459ResParMtr_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10460ResParPie_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10461ResAgr_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10461ResAgr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10462ResAgrCod_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( Z10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10463ResAgrPar_"+sGXsfl_149_idx, GXutil.rtrim( Z10463ResAgrPar)) ;
         httpContext.changePostValue( "nRcdDeleted_1408_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1408_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1408_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N10457ResParCod_"+sGXsfl_149_idx, GXutil.rtrim( A10457ResParCod)) ;
         httpContext.changePostValue( "N10458ResParKgm_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N10459ResParMtr_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N10460ResParPie_"+sGXsfl_149_idx, GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1408 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1408_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1408_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARCOD_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARKGM_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARMTR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESPARPIE_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESAGR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkResAgr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESAGRCOD_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RESAGRPAR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1881408( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1408 = (short)(0) ;
      nIsMod_1408 = (short)(0) ;
      nRcdDeleted_1408 = (short)(0) ;
   }

   public void processLevel1881410( )
   {
      /* Save parent mode. */
      sMode1410 = Gx_mode ;
      processNestedLevel1881408( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1410 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1881410( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1881410( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trespar");
         if ( AnyError == 0 )
         {
            confirmValues1880( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trespar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1881410( )
   {
      /* Scan By routine */
      /* Using cursor T018833 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      RcdFound1410 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1410 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1881410( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1410 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1410 = (short)(1) ;
      }
   }

   public void scanEnd1881410( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1881410( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1881410( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1881410( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1881410( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1881410( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1881410( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1881410( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtResCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResCod_Enabled), 5, 0), true);
      cmbResTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResTpo.getEnabled(), 5, 0), true);
      cmbResEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResEst.getEnabled(), 5, 0), true);
      edtResNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResNum_Enabled), 5, 0), true);
      edtResFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFch_Enabled), 5, 0), true);
      edtResFchCmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchCmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchCmp_Enabled), 5, 0), true);
      edtResFchMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResFchMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResFchMin_Enabled), 5, 0), true);
      edtResCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResCliCod_Enabled), 5, 0), true);
      edtResCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResCliNom_Enabled), 5, 0), true);
      edtResArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResArtCod_Enabled), 5, 0), true);
      edtResArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResArtDsc_Enabled), 5, 0), true);
      edtResColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResColNom_Enabled), 5, 0), true);
      edtResColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResColNum_Enabled), 5, 0), true);
      edtResTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResTipCol_Enabled), 5, 0), true);
      edtResTipColD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResTipColD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResTipColD_Enabled), 5, 0), true);
      edtResMatCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMatCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMatCod_Enabled), 5, 0), true);
      edtResMatDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMatDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMatDsc_Enabled), 5, 0), true);
      edtResIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResIntCod_Enabled), 5, 0), true);
      edtResIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResIntDsc_Enabled), 5, 0), true);
      edtResKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResKgm_Enabled), 5, 0), true);
      edtResMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResMtr_Enabled), 5, 0), true);
      edtResPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResPie_Enabled), 5, 0), true);
      cmbResUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbResUni.getEnabled(), 5, 0), true);
      chkResPar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "Enabled", GXutil.ltrimstr( chkResPar.getEnabled(), 5, 0), true);
   }

   public void zm1881408( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10458ResParKgm = T01883_A10458ResParKgm[0] ;
            Z10459ResParMtr = T01883_A10459ResParMtr[0] ;
            Z10460ResParPie = T01883_A10460ResParPie[0] ;
            Z10461ResAgr = T01883_A10461ResAgr[0] ;
            Z10462ResAgrCod = T01883_A10462ResAgrCod[0] ;
            Z10463ResAgrPar = T01883_A10463ResAgrPar[0] ;
         }
         else
         {
            Z10458ResParKgm = A10458ResParKgm ;
            Z10459ResParMtr = A10459ResParMtr ;
            Z10460ResParPie = A10460ResParPie ;
            Z10461ResAgr = A10461ResAgr ;
            Z10462ResAgrCod = A10462ResAgrCod ;
            Z10463ResAgrPar = A10463ResAgrPar ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z10433ResCod = A10433ResCod ;
         Z10457ResParCod = A10457ResParCod ;
         Z10458ResParKgm = A10458ResParKgm ;
         Z10459ResParMtr = A10459ResParMtr ;
         Z10460ResParPie = A10460ResParPie ;
         Z10461ResAgr = A10461ResAgr ;
         Z10462ResAgrCod = A10462ResAgrCod ;
         Z10463ResAgrPar = A10463ResAgrPar ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1881408( )
   {
      if ( A10456ResPar == 0 )
      {
         edtResParCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      else
      {
         edtResParCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      if ( A10456ResPar == 0 )
      {
         edtResParKgm_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      else
      {
         edtResParKgm_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      if ( A10456ResPar == 0 )
      {
         edtResParMtr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      else
      {
         edtResParMtr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      if ( A10456ResPar == 0 )
      {
         edtResParPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      else
      {
         edtResParPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
      if ( A10456ResPar == 0 )
      {
         A10457ResParCod = " " ;
      }
   }

   public void standaloneModal1881408( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtResParCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      }
   }

   public void load1881408( )
   {
      /* Using cursor T018834 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1408 = (short)(1) ;
         A10458ResParKgm = T018834_A10458ResParKgm[0] ;
         n10458ResParKgm = T018834_n10458ResParKgm[0] ;
         A10459ResParMtr = T018834_A10459ResParMtr[0] ;
         n10459ResParMtr = T018834_n10459ResParMtr[0] ;
         A10460ResParPie = T018834_A10460ResParPie[0] ;
         n10460ResParPie = T018834_n10460ResParPie[0] ;
         A10461ResAgr = T018834_A10461ResAgr[0] ;
         n10461ResAgr = T018834_n10461ResAgr[0] ;
         A10462ResAgrCod = T018834_A10462ResAgrCod[0] ;
         n10462ResAgrCod = T018834_n10462ResAgrCod[0] ;
         A10463ResAgrPar = T018834_A10463ResAgrPar[0] ;
         n10463ResAgrPar = T018834_n10463ResAgrPar[0] ;
         zm1881408( -29) ;
      }
      pr_default.close(32);
      onLoadActions1881408( ) ;
   }

   public void onLoadActions1881408( )
   {
   }

   public void checkExtendedTable1881408( )
   {
      nIsDirty_1408 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1881408( ) ;
   }

   public void closeExtendedTableCursors1881408( )
   {
   }

   public void enableDisable1881408( )
   {
   }

   public void getKey1881408( )
   {
      /* Using cursor T018835 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1408 = (short)(1) ;
      }
      else
      {
         RcdFound1408 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey1881408( )
   {
      /* Using cursor T01883 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01883_A10433ResCod[0] == A10433ResCod ) && ( GXutil.strcmp(T01883_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1881408( 29) ;
         RcdFound1408 = (short)(1) ;
         initializeNonKey1881408( ) ;
         A10457ResParCod = T01883_A10457ResParCod[0] ;
         A10458ResParKgm = T01883_A10458ResParKgm[0] ;
         n10458ResParKgm = T01883_n10458ResParKgm[0] ;
         A10459ResParMtr = T01883_A10459ResParMtr[0] ;
         n10459ResParMtr = T01883_n10459ResParMtr[0] ;
         A10460ResParPie = T01883_A10460ResParPie[0] ;
         n10460ResParPie = T01883_n10460ResParPie[0] ;
         A10461ResAgr = T01883_A10461ResAgr[0] ;
         n10461ResAgr = T01883_n10461ResAgr[0] ;
         A10462ResAgrCod = T01883_A10462ResAgrCod[0] ;
         n10462ResAgrCod = T01883_n10462ResAgrCod[0] ;
         A10463ResAgrPar = T01883_A10463ResAgrPar[0] ;
         n10463ResAgrPar = T01883_n10463ResAgrPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10433ResCod = A10433ResCod ;
         Z10457ResParCod = A10457ResParCod ;
         sMode1408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1881408( ) ;
         load1881408( ) ;
         Gx_mode = sMode1408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1408 = (short)(0) ;
         initializeNonKey1881408( ) ;
         sMode1408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1881408( ) ;
         Gx_mode = sMode1408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1881408( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1881408( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01882 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResPar"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10458ResParKgm, T01882_A10458ResParKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z10459ResParMtr, T01882_A10459ResParMtr[0]) != 0 ) || ( Z10460ResParPie != T01882_A10460ResParPie[0] ) || ( Z10461ResAgr != T01882_A10461ResAgr[0] ) || ( Z10462ResAgrCod != T01882_A10462ResAgrCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10463ResAgrPar, T01882_A10463ResAgrPar[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10458ResParKgm, T01882_A10458ResParKgm[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResParKgm");
               GXutil.writeLogRaw("Old: ",Z10458ResParKgm);
               GXutil.writeLogRaw("Current: ",T01882_A10458ResParKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z10459ResParMtr, T01882_A10459ResParMtr[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResParMtr");
               GXutil.writeLogRaw("Old: ",Z10459ResParMtr);
               GXutil.writeLogRaw("Current: ",T01882_A10459ResParMtr[0]);
            }
            if ( Z10460ResParPie != T01882_A10460ResParPie[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResParPie");
               GXutil.writeLogRaw("Old: ",Z10460ResParPie);
               GXutil.writeLogRaw("Current: ",T01882_A10460ResParPie[0]);
            }
            if ( Z10461ResAgr != T01882_A10461ResAgr[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResAgr");
               GXutil.writeLogRaw("Old: ",Z10461ResAgr);
               GXutil.writeLogRaw("Current: ",T01882_A10461ResAgr[0]);
            }
            if ( Z10462ResAgrCod != T01882_A10462ResAgrCod[0] )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResAgrCod");
               GXutil.writeLogRaw("Old: ",Z10462ResAgrCod);
               GXutil.writeLogRaw("Current: ",T01882_A10462ResAgrCod[0]);
            }
            if ( GXutil.strcmp(Z10463ResAgrPar, T01882_A10463ResAgrPar[0]) != 0 )
            {
               GXutil.writeLogln("trespar:[seudo value changed for attri]"+"ResAgrPar");
               GXutil.writeLogRaw("Old: ",Z10463ResAgrPar);
               GXutil.writeLogRaw("Current: ",T01882_A10463ResAgrPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPResPar"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1881408( )
   {
      beforeValidate1881408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1881408( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1881408( 0) ;
         checkOptimisticConcurrency1881408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1881408( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1881408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018836 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A10433ResCod), A10457ResParCod, Boolean.valueOf(n10458ResParKgm), A10458ResParKgm, Boolean.valueOf(n10459ResParMtr), A10459ResParMtr, Boolean.valueOf(n10460ResParPie), Integer.valueOf(A10460ResParPie), Boolean.valueOf(n10461ResAgr), Byte.valueOf(A10461ResAgr), Boolean.valueOf(n10462ResAgrCod), Integer.valueOf(A10462ResAgrCod), Boolean.valueOf(n10463ResAgrPar), A10463ResAgrPar, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
                  if ( (pr_default.getStatus(34) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = AV13ResCod ;
                        GXv_char2[0] = A10457ResParCod ;
                        GXv_int5[0] = (byte)(0) ;
                        new app.pmodton(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
                        trespar_impl.this.A396EmprCod = GXv_char4[0] ;
                        trespar_impl.this.AV13ResCod = GXv_char3[0] ;
                        trespar_impl.this.A10457ResParCod = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
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
            load1881408( ) ;
         }
         endLevel1881408( ) ;
      }
      closeExtendedTableCursors1881408( ) ;
   }

   public void update1881408( )
   {
      beforeValidate1881408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1881408( ) ;
      }
      if ( ( nIsMod_1408 != 0 ) || ( nIsDirty_1408 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1881408( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1881408( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1881408( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018837 */
                     pr_default.execute(35, new Object[] {Boolean.valueOf(n10458ResParKgm), A10458ResParKgm, Boolean.valueOf(n10459ResParMtr), A10459ResParMtr, Boolean.valueOf(n10460ResParPie), Integer.valueOf(A10460ResParPie), Boolean.valueOf(n10461ResAgr), Byte.valueOf(A10461ResAgr), Boolean.valueOf(n10462ResAgrCod), Integer.valueOf(A10462ResAgrCod), Boolean.valueOf(n10463ResAgrPar), A10463ResAgrPar, A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPResPar"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1881408( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && true /* Level */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_char3[0] = AV13ResCod ;
                           GXv_char2[0] = A10457ResParCod ;
                           GXv_int5[0] = (byte)(0) ;
                           new app.pmodton(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
                           trespar_impl.this.A396EmprCod = GXv_char4[0] ;
                           trespar_impl.this.AV13ResCod = GXv_char3[0] ;
                           trespar_impl.this.A10457ResParCod = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1881408( ) ;
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
            endLevel1881408( ) ;
         }
      }
      closeExtendedTableCursors1881408( ) ;
   }

   public void deferredUpdate1881408( )
   {
   }

   public void delete1881408( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1881408( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1881408( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1881408( ) ;
         afterConfirm1881408( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1881408( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018838 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
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
      sMode1408 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1881408( ) ;
      Gx_mode = sMode1408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1881408( )
   {
      standaloneModal1881408( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T018839 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ResFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void endLevel1881408( )
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

   public void scanStart1881408( )
   {
      /* Scan By routine */
      /* Using cursor T018840 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
      RcdFound1408 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1408 = (short)(1) ;
         A10457ResParCod = T018840_A10457ResParCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1881408( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound1408 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1408 = (short)(1) ;
         A10457ResParCod = T018840_A10457ResParCod[0] ;
      }
   }

   public void scanEnd1881408( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1881408( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1881408( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1881408( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1881408( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1881408( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1881408( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1881408( )
   {
      edtResParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      chkResAgr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkResAgr.getInternalname(), "Enabled", GXutil.ltrimstr( chkResAgr.getEnabled(), 5, 0), !bGXsfl_149_Refreshing);
      edtResAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResAgrCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtResAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResAgrPar_Enabled), 5, 0), !bGXsfl_149_Refreshing);
   }

   public void send_integrity_lvl_hashes1881408( )
   {
   }

   public void send_integrity_lvl_hashes1881410( )
   {
   }

   public void subsflControlProps_1491408( )
   {
      edtavnRcdDeleted_1408_Internalname = "vNRCDDELETED_1408_"+sGXsfl_149_idx ;
      edtResParCod_Internalname = "RESPARCOD_"+sGXsfl_149_idx ;
      edtResParKgm_Internalname = "RESPARKGM_"+sGXsfl_149_idx ;
      edtResParMtr_Internalname = "RESPARMTR_"+sGXsfl_149_idx ;
      edtResParPie_Internalname = "RESPARPIE_"+sGXsfl_149_idx ;
      chkResAgr.setInternalname( "RESAGR_"+sGXsfl_149_idx );
      edtResAgrCod_Internalname = "RESAGRCOD_"+sGXsfl_149_idx ;
      edtResAgrPar_Internalname = "RESAGRPAR_"+sGXsfl_149_idx ;
   }

   public void subsflControlProps_fel_1491408( )
   {
      edtavnRcdDeleted_1408_Internalname = "vNRCDDELETED_1408_"+sGXsfl_149_fel_idx ;
      edtResParCod_Internalname = "RESPARCOD_"+sGXsfl_149_fel_idx ;
      edtResParKgm_Internalname = "RESPARKGM_"+sGXsfl_149_fel_idx ;
      edtResParMtr_Internalname = "RESPARMTR_"+sGXsfl_149_fel_idx ;
      edtResParPie_Internalname = "RESPARPIE_"+sGXsfl_149_fel_idx ;
      chkResAgr.setInternalname( "RESAGR_"+sGXsfl_149_fel_idx );
      edtResAgrCod_Internalname = "RESAGRCOD_"+sGXsfl_149_fel_idx ;
      edtResAgrPar_Internalname = "RESAGRPAR_"+sGXsfl_149_fel_idx ;
   }

   public void addRow1881408( )
   {
      nGXsfl_149_idx = (int)(nGXsfl_149_idx+1) ;
      sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1491408( ) ;
      sendRow1881408( ) ;
   }

   public void sendRow1881408( )
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
         if ( ((int)((nGXsfl_149_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1408_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1408_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1408), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1408), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1408_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1408_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResParCod_Internalname,GXutil.rtrim( A10457ResParCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResParCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResParKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A10458ResParKgm, "ZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,152);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResParKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResParKgm_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 153,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResParMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A10459ResParMtr, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,153);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResParMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResParMtr_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResParPie_Internalname,GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10460ResParPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResParPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResParPie_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "RESAGR_" + sGXsfl_149_idx ;
      chkResAgr.setName( GXCCtl );
      chkResAgr.setWebtags( "" );
      chkResAgr.setCaption( httpContext.getMessage( "Agrupada?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkResAgr.getInternalname(), "TitleCaption", chkResAgr.getCaption(), !bGXsfl_149_Refreshing);
      chkResAgr.setCheckedValue( "0" );
      A10461ResAgr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10461ResAgr = false ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkResAgr.getInternalname(),GXutil.str( A10461ResAgr, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkResAgr.getEnabled()),"1",httpContext.getMessage( "Agrupada?", ""),StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(155, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 156,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtResAgrCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10462ResAgrCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10462ResAgrCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResAgrCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1408_" + sGXsfl_149_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_149_idx + "',149)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtResAgrPar_Internalname,GXutil.rtrim( A10463ResAgrPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtResAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtResAgrPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(149),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1881408( ) ;
      GXCCtl = "Z10457ResParCod_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10457ResParCod));
      GXCCtl = "Z10458ResParKgm_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10459ResParMtr_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10460ResParPie_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10461ResAgr_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10461ResAgr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10462ResAgrCod_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10462ResAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10463ResAgrPar_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10463ResAgrPar));
      GXCCtl = "nRcdDeleted_1408_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1408_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1408_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1408, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N10457ResParCod_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A10457ResParCod));
      GXCCtl = "N10458ResParKgm_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N10459ResParMtr_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N10460ResParPie_" + sGXsfl_149_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1408_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1408_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESPARCOD_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESPARKGM_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESPARMTR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESPARPIE_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResParPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESAGR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkResAgr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESAGRCOD_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RESAGRPAR_"+sGXsfl_149_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1881408( )
   {
      nGXsfl_149_idx = (int)(nGXsfl_149_idx+1) ;
      sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1491408( ) ;
      edtavnRcdDeleted_1408_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1408_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResParCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARCOD_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResParKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARKGM_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResParMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARMTR_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResParPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESPARPIE_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkResAgr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "RESAGR_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtResAgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESAGRCOD_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtResAgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RESAGRPAR_"+sGXsfl_149_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1408_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1408_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1408");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1408_Internalname ;
         wbErr = true ;
         nRcdDeleted_1408 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1408 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1408_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10457ResParCod = httpContext.cgiGet( edtResParCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtResParKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtResParKgm_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
      {
         GXCCtl = "RESPARKGM_" + sGXsfl_149_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResParKgm_Internalname ;
         wbErr = true ;
         A10458ResParKgm = DecimalUtil.ZERO ;
         n10458ResParKgm = false ;
      }
      else
      {
         A10458ResParKgm = localUtil.ctond( httpContext.cgiGet( edtResParKgm_Internalname)) ;
         n10458ResParKgm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtResParMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtResParMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "RESPARMTR_" + sGXsfl_149_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResParMtr_Internalname ;
         wbErr = true ;
         A10459ResParMtr = DecimalUtil.ZERO ;
         n10459ResParMtr = false ;
      }
      else
      {
         A10459ResParMtr = localUtil.ctond( httpContext.cgiGet( edtResParMtr_Internalname)) ;
         n10459ResParMtr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResParPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResParPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "RESPARPIE_" + sGXsfl_149_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResParPie_Internalname ;
         wbErr = true ;
         A10460ResParPie = 0 ;
         n10460ResParPie = false ;
      }
      else
      {
         A10460ResParPie = (int)(localUtil.ctol( httpContext.cgiGet( edtResParPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10460ResParPie = false ;
      }
      if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkResAgr.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkResAgr.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
      {
         GXCCtl = "RESAGR_" + sGXsfl_149_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkResAgr.getInternalname() ;
         wbErr = true ;
         A10461ResAgr = (byte)(0) ;
         n10461ResAgr = false ;
      }
      else
      {
         A10461ResAgr = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkResAgr.getInternalname()), "1")==0) ? 1 : 0)) ;
         n10461ResAgr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtResAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtResAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RESAGRCOD_" + sGXsfl_149_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtResAgrCod_Internalname ;
         wbErr = true ;
         A10462ResAgrCod = 0 ;
         n10462ResAgrCod = false ;
      }
      else
      {
         A10462ResAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtResAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10462ResAgrCod = false ;
      }
      A10463ResAgrPar = httpContext.cgiGet( edtResAgrPar_Internalname) ;
      n10463ResAgrPar = false ;
      GXCCtl = "Z10457ResParCod_" + sGXsfl_149_idx ;
      Z10457ResParCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10458ResParKgm_" + sGXsfl_149_idx ;
      Z10458ResParKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10459ResParMtr_" + sGXsfl_149_idx ;
      Z10459ResParMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10460ResParPie_" + sGXsfl_149_idx ;
      Z10460ResParPie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10461ResAgr_" + sGXsfl_149_idx ;
      Z10461ResAgr = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10462ResAgrCod_" + sGXsfl_149_idx ;
      Z10462ResAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10463ResAgrPar_" + sGXsfl_149_idx ;
      Z10463ResAgrPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1408_" + sGXsfl_149_idx ;
      nRcdDeleted_1408 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1408_" + sGXsfl_149_idx ;
      nRcdExists_1408 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1408_" + sGXsfl_149_idx ;
      nIsMod_1408 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N10457ResParCod_" + sGXsfl_149_idx ;
      N10457ResParCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N10458ResParKgm_" + sGXsfl_149_idx ;
      N10458ResParKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N10459ResParMtr_" + sGXsfl_149_idx ;
      N10459ResParMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N10460ResParPie_" + sGXsfl_149_idx ;
      N10460ResParPie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtResParPie_Enabled = edtResParPie_Enabled ;
      defedtResParMtr_Enabled = edtResParMtr_Enabled ;
      defedtResParKgm_Enabled = edtResParKgm_Enabled ;
      defedtResParCod_Enabled = edtResParCod_Enabled ;
      defedtResParCod_Enabled = edtResParCod_Enabled ;
   }

   public void confirmValues1880( )
   {
      nGXsfl_149_idx = 0 ;
      sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1491408( ) ;
      while ( nGXsfl_149_idx < nRC_GXsfl_149 )
      {
         nGXsfl_149_idx = (int)(nGXsfl_149_idx+1) ;
         sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1491408( ) ;
         httpContext.changePostValue( "Z10457ResParCod_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10457ResParCod_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10457ResParCod_"+sGXsfl_149_idx) ;
         httpContext.changePostValue( "Z10458ResParKgm_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10458ResParKgm_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10458ResParKgm_"+sGXsfl_149_idx) ;
         httpContext.changePostValue( "Z10459ResParMtr_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10459ResParMtr_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10459ResParMtr_"+sGXsfl_149_idx) ;
         httpContext.changePostValue( "Z10460ResParPie_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10460ResParPie_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10460ResParPie_"+sGXsfl_149_idx) ;
         httpContext.changePostValue( "Z10461ResAgr_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10461ResAgr_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10461ResAgr_"+sGXsfl_149_idx) ;
         httpContext.changePostValue( "Z10462ResAgrCod_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10462ResAgrCod_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10462ResAgrCod_"+sGXsfl_149_idx) ;
         httpContext.changePostValue( "Z10463ResAgrPar_"+sGXsfl_149_idx, httpContext.cgiGet( "ZT_"+"Z10463ResAgrPar_"+sGXsfl_149_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10463ResAgrPar_"+sGXsfl_149_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trespar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10433ResCod,8,0))}, new String[] {"EmprCod","ResCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TResPar");
      forbiddenHiddens.add("ResTpo", GXutil.rtrim( localUtil.format( A10434ResTpo, "")));
      forbiddenHiddens.add("ResEst", localUtil.format( DecimalUtil.doubleToDec(A10435ResEst), "9"));
      forbiddenHiddens.add("ResFchMin", localUtil.format( A10439ResFchMin, "99/99/99 99:99"));
      forbiddenHiddens.add("ResKgm", localUtil.format( A10452ResKgm, "ZZZZZ9.99"));
      forbiddenHiddens.add("ResMtr", localUtil.format( A10453ResMtr, "ZZZZZ9.99"));
      forbiddenHiddens.add("ResPie", localUtil.format( DecimalUtil.doubleToDec(A10454ResPie), "ZZZZZ9"));
      forbiddenHiddens.add("ResUni", GXutil.rtrim( localUtil.format( A10455ResUni, "")));
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      forbiddenHiddens.add("ResPar", localUtil.format( DecimalUtil.doubleToDec(A10456ResPar), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trespar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10433ResCod", GXutil.ltrim( localUtil.ntoc( Z10433ResCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10434ResTpo", GXutil.rtrim( Z10434ResTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10435ResEst", GXutil.ltrim( localUtil.ntoc( Z10435ResEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10436ResNum", GXutil.rtrim( Z10436ResNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10437ResFch", localUtil.dtoc( Z10437ResFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10438ResFchCmp", localUtil.dtoc( Z10438ResFchCmp, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10439ResFchMin", localUtil.ttoc( Z10439ResFchMin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10445ResColNum", GXutil.ltrim( localUtil.ntoc( Z10445ResColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10446ResTipCol", GXutil.ltrim( localUtil.ntoc( Z10446ResTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10448ResMatCod", GXutil.ltrim( localUtil.ntoc( Z10448ResMatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10450ResIntCod", GXutil.ltrim( localUtil.ntoc( Z10450ResIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10452ResKgm", GXutil.ltrim( localUtil.ntoc( Z10452ResKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10453ResMtr", GXutil.ltrim( localUtil.ntoc( Z10453ResMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10454ResPie", GXutil.ltrim( localUtil.ntoc( Z10454ResPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10455ResUni", GXutil.rtrim( Z10455ResUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10456ResPar", GXutil.ltrim( localUtil.ntoc( Z10456ResPar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10444ResColNom", GXutil.rtrim( Z10444ResColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10440ResCliCod", GXutil.ltrim( localUtil.ntoc( Z10440ResCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_149", GXutil.ltrim( localUtil.ntoc( nGXsfl_149_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRESCOD", GXutil.rtrim( AV13ResCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
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
      return formatLink("app.trespar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10433ResCod,8,0))}, new String[] {"EmprCod","ResCod"})  ;
   }

   public String getPgmname( )
   {
      return "TResPar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Particiones de la Reserva", "") ;
   }

   public void initializeNonKey1881410( )
   {
      A10441ResCliNom = "" ;
      n10441ResCliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", A10441ResCliNom);
      A10443ResArtDsc = "" ;
      n10443ResArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", A10443ResArtDsc);
      A10447ResTipColD = "" ;
      n10447ResTipColD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", A10447ResTipColD);
      A10449ResMatDsc = "" ;
      n10449ResMatDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", A10449ResMatDsc);
      A10451ResIntDsc = "" ;
      n10451ResIntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", A10451ResIntDsc);
      A10434ResTpo = "" ;
      n10434ResTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      A10435ResEst = (byte)(0) ;
      n10435ResEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      A10436ResNum = "" ;
      n10436ResNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", A10436ResNum);
      A10437ResFch = GXutil.nullDate() ;
      n10437ResFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
      A10438ResFchCmp = GXutil.nullDate() ;
      n10438ResFchCmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
      A10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      n10439ResFchMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10440ResCliCod = 0 ;
      n10440ResCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10440ResCliCod), 6, 0));
      A10442ResArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", A10442ResArtCod);
      A10444ResColNom = "" ;
      n10444ResColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", A10444ResColNom);
      A10445ResColNum = 0 ;
      n10445ResColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10445ResColNum), 6, 0));
      A10446ResTipCol = (byte)(0) ;
      n10446ResTipCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10446ResTipCol), 2, 0));
      A10448ResMatCod = (short)(0) ;
      n10448ResMatCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10448ResMatCod), 3, 0));
      A10450ResIntCod = (byte)(0) ;
      n10450ResIntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10450ResIntCod), 2, 0));
      A10452ResKgm = DecimalUtil.ZERO ;
      n10452ResKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrimstr( A10452ResKgm, 9, 2));
      A10453ResMtr = DecimalUtil.ZERO ;
      n10453ResMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrimstr( A10453ResMtr, 9, 2));
      A10454ResPie = 0 ;
      n10454ResPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10454ResPie), 6, 0));
      A10455ResUni = "" ;
      n10455ResUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      A10456ResPar = (byte)(0) ;
      n10456ResPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      Z10434ResTpo = "" ;
      Z10435ResEst = (byte)(0) ;
      Z10436ResNum = "" ;
      Z10437ResFch = GXutil.nullDate() ;
      Z10438ResFchCmp = GXutil.nullDate() ;
      Z10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      Z10445ResColNum = 0 ;
      Z10446ResTipCol = (byte)(0) ;
      Z10448ResMatCod = (short)(0) ;
      Z10450ResIntCod = (byte)(0) ;
      Z10452ResKgm = DecimalUtil.ZERO ;
      Z10453ResMtr = DecimalUtil.ZERO ;
      Z10454ResPie = 0 ;
      Z10455ResUni = "" ;
      Z10456ResPar = (byte)(0) ;
      Z10444ResColNom = "" ;
      Z10440ResCliCod = 0 ;
   }

   public void initAll1881410( )
   {
      initializeNonKey1881410( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1881408( )
   {
      A10458ResParKgm = DecimalUtil.ZERO ;
      n10458ResParKgm = false ;
      A10459ResParMtr = DecimalUtil.ZERO ;
      n10459ResParMtr = false ;
      A10460ResParPie = 0 ;
      n10460ResParPie = false ;
      A10461ResAgr = (byte)(0) ;
      n10461ResAgr = false ;
      A10462ResAgrCod = 0 ;
      n10462ResAgrCod = false ;
      A10463ResAgrPar = "" ;
      n10463ResAgrPar = false ;
      Z10458ResParKgm = DecimalUtil.ZERO ;
      Z10459ResParMtr = DecimalUtil.ZERO ;
      Z10460ResParPie = 0 ;
      Z10461ResAgr = (byte)(0) ;
      Z10462ResAgrCod = 0 ;
      Z10463ResAgrPar = "" ;
   }

   public void initAll1881408( )
   {
      A10457ResParCod = "" ;
      initializeNonKey1881408( ) ;
   }

   public void standaloneModalInsert1881408( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156263", true, true);
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
      httpContext.AddJavascriptSource("trespar.js", "?2026824156263", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1408( )
   {
      edtResParPie_Enabled = defedtResParPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParPie_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParMtr_Enabled = defedtResParMtr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParMtr_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParKgm_Enabled = defedtResParKgm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParKgm_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParCod_Enabled = defedtResParCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
      edtResParCod_Enabled = defedtResParCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtResParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtResParCod_Enabled), 5, 0), !bGXsfl_149_Refreshing);
   }

   public void startgridcontrol149( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1408, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1408_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10457ResParCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResParCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10458ResParKgm, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResParKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10459ResParMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResParMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10460ResParPie, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResParPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkResAgr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10462ResAgrCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10463ResAgrPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtResAgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtResCod_Internalname = "RESCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      cmbResTpo.setInternalname( "RESTPO" );
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      cmbResEst.setInternalname( "RESEST" );
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtResNum_Internalname = "RESNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtResFch_Internalname = "RESFCH" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtResFchCmp_Internalname = "RESFCHCMP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtResFchMin_Internalname = "RESFCHMIN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtResCliCod_Internalname = "RESCLICOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtResCliNom_Internalname = "RESCLINOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtResArtCod_Internalname = "RESARTCOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtResArtDsc_Internalname = "RESARTDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtResColNom_Internalname = "RESCOLNOM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtResColNum_Internalname = "RESCOLNUM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtResTipCol_Internalname = "RESTIPCOL" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtResTipColD_Internalname = "RESTIPCOLD" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtResMatCod_Internalname = "RESMATCOD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtResMatDsc_Internalname = "RESMATDSC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtResIntCod_Internalname = "RESINTCOD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtResIntDsc_Internalname = "RESINTDSC" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtResKgm_Internalname = "RESKGM" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtResMtr_Internalname = "RESMTR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtResPie_Internalname = "RESPIE" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      cmbResUni.setInternalname( "RESUNI" );
      chkResPar.setInternalname( "RESPAR" );
      edtavnRcdDeleted_1408_Internalname = "vNRCDDELETED_1408" ;
      edtResParCod_Internalname = "RESPARCOD" ;
      edtResParKgm_Internalname = "RESPARKGM" ;
      edtResParMtr_Internalname = "RESPARMTR" ;
      edtResParPie_Internalname = "RESPARPIE" ;
      chkResAgr.setInternalname( "RESAGR" );
      edtResAgrCod_Internalname = "RESAGRCOD" ;
      edtResAgrPar_Internalname = "RESAGRPAR" ;
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
      Form.setCaption( httpContext.getMessage( "Particiones de la Reserva", "") );
      edtResAgrPar_Jsonclick = "" ;
      edtResAgrCod_Jsonclick = "" ;
      chkResAgr.setCaption( "" );
      edtResParPie_Jsonclick = "" ;
      edtResParMtr_Jsonclick = "" ;
      edtResParKgm_Jsonclick = "" ;
      edtResParCod_Jsonclick = "" ;
      edtavnRcdDeleted_1408_Jsonclick = "" ;
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
      edtResAgrPar_Enabled = 1 ;
      edtResAgrCod_Enabled = 1 ;
      chkResAgr.setEnabled( 1 );
      edtResParPie_Enabled = 1 ;
      edtResParMtr_Enabled = 1 ;
      edtResParKgm_Enabled = 1 ;
      edtResParCod_Enabled = 1 ;
      edtavnRcdDeleted_1408_Enabled = 1 ;
      chkResPar.setIBackground( (int)(0xFFFFFF) );
      chkResPar.setEnabled( 0 );
      cmbResUni.setJsonclick( "" );
      cmbResUni.setEnabled( 0 );
      cmbResUni.setIBackground( (int)(0xFFFFFF) );
      edtResPie_Jsonclick = "" ;
      edtResPie_Backcolor = (int)(0xFFFFFF) ;
      edtResPie_Enabled = 0 ;
      edtResMtr_Jsonclick = "" ;
      edtResMtr_Backcolor = (int)(0xFFFFFF) ;
      edtResMtr_Enabled = 0 ;
      edtResKgm_Jsonclick = "" ;
      edtResKgm_Backcolor = (int)(0xFFFFFF) ;
      edtResKgm_Enabled = 0 ;
      edtResIntDsc_Jsonclick = "" ;
      edtResIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtResIntDsc_Enabled = 0 ;
      edtResIntCod_Jsonclick = "" ;
      edtResIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtResIntCod_Enabled = 1 ;
      edtResMatDsc_Jsonclick = "" ;
      edtResMatDsc_Backcolor = (int)(0xFFFFFF) ;
      edtResMatDsc_Enabled = 0 ;
      edtResMatCod_Jsonclick = "" ;
      edtResMatCod_Backcolor = (int)(0xFFFFFF) ;
      edtResMatCod_Enabled = 1 ;
      edtResTipColD_Jsonclick = "" ;
      edtResTipColD_Backcolor = (int)(0xFFFFFF) ;
      edtResTipColD_Enabled = 0 ;
      edtResTipCol_Jsonclick = "" ;
      edtResTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtResTipCol_Enabled = 1 ;
      edtResColNum_Jsonclick = "" ;
      edtResColNum_Backcolor = (int)(0xFFFFFF) ;
      edtResColNum_Enabled = 1 ;
      edtResColNom_Jsonclick = "" ;
      edtResColNom_Backcolor = (int)(0xFFFFFF) ;
      edtResColNom_Enabled = 1 ;
      edtResArtDsc_Jsonclick = "" ;
      edtResArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtResArtDsc_Enabled = 0 ;
      edtResArtCod_Jsonclick = "" ;
      edtResArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtResArtCod_Enabled = 0 ;
      edtResCliNom_Jsonclick = "" ;
      edtResCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtResCliNom_Enabled = 0 ;
      edtResCliCod_Jsonclick = "" ;
      edtResCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtResCliCod_Enabled = 1 ;
      edtResFchMin_Jsonclick = "" ;
      edtResFchMin_Backcolor = (int)(0xFFFFFF) ;
      edtResFchMin_Enabled = 0 ;
      edtResFchCmp_Jsonclick = "" ;
      edtResFchCmp_Backcolor = (int)(0xFFFFFF) ;
      edtResFchCmp_Enabled = 1 ;
      edtResFch_Jsonclick = "" ;
      edtResFch_Backcolor = (int)(0xFFFFFF) ;
      edtResFch_Enabled = 1 ;
      edtResNum_Jsonclick = "" ;
      edtResNum_Backcolor = (int)(0xFFFFFF) ;
      edtResNum_Enabled = 1 ;
      cmbResEst.setJsonclick( "" );
      cmbResEst.setEnabled( 0 );
      cmbResEst.setIBackground( (int)(0xFFFFFF) );
      cmbResTpo.setJsonclick( "" );
      cmbResTpo.setEnabled( 0 );
      cmbResTpo.setIBackground( (int)(0xFFFFFF) );
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtResCod_Jsonclick = "" ;
      edtResCod_Backcolor = (int)(0xFFFFFF) ;
      edtResCod_Enabled = 0 ;
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

   public void xc_15_1881408( String A396EmprCod ,
                              String AV13ResCod ,
                              String A10457ResParCod ,
                              java.math.BigDecimal A10458ResParKgm )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV13ResCod ;
         GXv_char2[0] = A10457ResParCod ;
         GXv_int5[0] = (byte)(0) ;
         new app.pmodton(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         AV13ResCod = GXv_char3[0] ;
         A10457ResParCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV13ResCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10457ResParCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_16_1881408( String A396EmprCod ,
                              String AV13ResCod ,
                              String A10457ResParCod ,
                              java.math.BigDecimal A10458ResParKgm )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV13ResCod ;
         GXv_char2[0] = A10457ResParCod ;
         GXv_int5[0] = (byte)(0) ;
         new app.pmodton(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         AV13ResCod = GXv_char3[0] ;
         A10457ResParCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV13ResCod", AV13ResCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV13ResCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10457ResParCod))+"\"") ;
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
      subsflControlProps_1491408( ) ;
      while ( nGXsfl_149_idx <= nRC_GXsfl_149 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1881408( ) ;
         standaloneModal1881408( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1881408( ) ;
         nGXsfl_149_idx = (int)(nGXsfl_149_idx+1) ;
         sGXsfl_149_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_149_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1491408( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbResTpo.setName( "RESTPO" );
      cmbResTpo.setWebtags( "" );
      cmbResTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbResTpo.addItem("P", httpContext.getMessage( "Pronostico", ""), (short)(0));
      if ( cmbResTpo.getItemCount() > 0 )
      {
         A10434ResTpo = cmbResTpo.getValidValue(A10434ResTpo) ;
         n10434ResTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", A10434ResTpo);
      }
      cmbResEst.setName( "RESEST" );
      cmbResEst.setWebtags( "" );
      cmbResEst.addItem("1", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbResEst.addItem("2", httpContext.getMessage( "Confirmada", ""), (short)(0));
      cmbResEst.addItem("3", httpContext.getMessage( "Cancelada", ""), (short)(0));
      cmbResEst.addItem("4", httpContext.getMessage( "Generada", ""), (short)(0));
      if ( cmbResEst.getItemCount() > 0 )
      {
         A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValidValue(GXutil.trim( GXutil.str( A10435ResEst, 1, 0))))) ;
         n10435ResEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.str( A10435ResEst, 1, 0));
      }
      cmbResUni.setName( "RESUNI" );
      cmbResUni.setWebtags( "" );
      cmbResUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      cmbResUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      if ( cmbResUni.getItemCount() > 0 )
      {
         A10455ResUni = cmbResUni.getValidValue(A10455ResUni) ;
         n10455ResUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", A10455ResUni);
      }
      chkResPar.setName( "RESPAR" );
      chkResPar.setWebtags( "" );
      chkResPar.setCaption( httpContext.getMessage( "Particionada?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkResPar.getInternalname(), "TitleCaption", chkResPar.getCaption(), true);
      chkResPar.setCheckedValue( "0" );
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.str( A10456ResPar, 1, 0));
      GXCCtl = "RESAGR_" + sGXsfl_149_idx ;
      chkResAgr.setName( GXCCtl );
      chkResAgr.setWebtags( "" );
      chkResAgr.setCaption( httpContext.getMessage( "Agrupada?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkResAgr.getInternalname(), "TitleCaption", chkResAgr.getCaption(), !bGXsfl_149_Refreshing);
      chkResAgr.setCheckedValue( "0" );
      A10461ResAgr = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10461ResAgr, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10461ResAgr = false ;
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T018841 */
      pr_default.execute(39, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018841_A407EmprNom[0] ;
      n407EmprNom = T018841_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(39);
      GX_FocusControl = edtResNum_Internalname ;
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

   public void valid_Rescod( )
   {
      n10454ResPie = false ;
      n10453ResMtr = false ;
      n10452ResKgm = false ;
      n10439ResFchMin = false ;
      n10456ResPar = false ;
      n10455ResUni = false ;
      A10455ResUni = cmbResUni.getValue() ;
      n10455ResUni = false ;
      cmbResUni.setValue( A10455ResUni );
      n10435ResEst = false ;
      A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValue())) ;
      n10435ResEst = false ;
      cmbResEst.setValue( GXutil.str( A10435ResEst, 1, 0) );
      n10434ResTpo = false ;
      A10434ResTpo = cmbResTpo.getValue() ;
      n10434ResTpo = false ;
      cmbResTpo.setValue( A10434ResTpo );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbResTpo.getItemCount() > 0 )
      {
         A10434ResTpo = cmbResTpo.getValidValue(A10434ResTpo) ;
         n10434ResTpo = false ;
         cmbResTpo.setValue( A10434ResTpo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
      }
      if ( cmbResEst.getItemCount() > 0 )
      {
         A10435ResEst = (byte)(GXutil.lval( cmbResEst.getValidValue(GXutil.trim( GXutil.str( A10435ResEst, 1, 0))))) ;
         n10435ResEst = false ;
         cmbResEst.setValue( GXutil.str( A10435ResEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
      }
      if ( cmbResUni.getItemCount() > 0 )
      {
         A10455ResUni = cmbResUni.getValidValue(A10455ResUni) ;
         n10455ResUni = false ;
         cmbResUni.setValue( A10455ResUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
      }
      A10456ResPar = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10456ResPar = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10434ResTpo", GXutil.rtrim( A10434ResTpo));
      cmbResTpo.setValue( GXutil.rtrim( A10434ResTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResTpo.getInternalname(), "Values", cmbResTpo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10435ResEst", GXutil.ltrim( localUtil.ntoc( A10435ResEst, (byte)(1), (byte)(0), ".", "")));
      cmbResEst.setValue( GXutil.trim( GXutil.str( A10435ResEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResEst.getInternalname(), "Values", cmbResEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10436ResNum", GXutil.rtrim( A10436ResNum));
      httpContext.ajax_rsp_assign_attri("", false, "A10437ResFch", localUtil.format(A10437ResFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10438ResFchCmp", localUtil.format(A10438ResFchCmp, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10439ResFchMin", localUtil.ttoc( A10439ResFchMin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10440ResCliCod", GXutil.ltrim( localUtil.ntoc( A10440ResCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10444ResColNom", GXutil.rtrim( A10444ResColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10445ResColNum", GXutil.ltrim( localUtil.ntoc( A10445ResColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10446ResTipCol", GXutil.ltrim( localUtil.ntoc( A10446ResTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10448ResMatCod", GXutil.ltrim( localUtil.ntoc( A10448ResMatCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10450ResIntCod", GXutil.ltrim( localUtil.ntoc( A10450ResIntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10452ResKgm", GXutil.ltrim( localUtil.ntoc( A10452ResKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10453ResMtr", GXutil.ltrim( localUtil.ntoc( A10453ResMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10454ResPie", GXutil.ltrim( localUtil.ntoc( A10454ResPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10455ResUni", GXutil.rtrim( A10455ResUni));
      cmbResUni.setValue( GXutil.rtrim( A10455ResUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbResUni.getInternalname(), "Values", cmbResUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10456ResPar", GXutil.ltrim( localUtil.ntoc( A10456ResPar, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", GXutil.rtrim( A10441ResCliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", GXutil.rtrim( A10447ResTipColD));
      httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", GXutil.rtrim( A10449ResMatDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", GXutil.rtrim( A10451ResIntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", GXutil.rtrim( A10442ResArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", GXutil.rtrim( A10443ResArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10433ResCod", GXutil.ltrim( localUtil.ntoc( Z10433ResCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10434ResTpo", GXutil.rtrim( Z10434ResTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10435ResEst", GXutil.ltrim( localUtil.ntoc( Z10435ResEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10436ResNum", GXutil.rtrim( Z10436ResNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10437ResFch", localUtil.format(Z10437ResFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10438ResFchCmp", localUtil.format(Z10438ResFchCmp, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10439ResFchMin", localUtil.ttoc( Z10439ResFchMin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10440ResCliCod", GXutil.ltrim( localUtil.ntoc( Z10440ResCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10444ResColNom", GXutil.rtrim( Z10444ResColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10445ResColNum", GXutil.ltrim( localUtil.ntoc( Z10445ResColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10446ResTipCol", GXutil.ltrim( localUtil.ntoc( Z10446ResTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10448ResMatCod", GXutil.ltrim( localUtil.ntoc( Z10448ResMatCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10450ResIntCod", GXutil.ltrim( localUtil.ntoc( Z10450ResIntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10452ResKgm", GXutil.ltrim( localUtil.ntoc( Z10452ResKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10453ResMtr", GXutil.ltrim( localUtil.ntoc( Z10453ResMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10454ResPie", GXutil.ltrim( localUtil.ntoc( Z10454ResPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10455ResUni", GXutil.rtrim( Z10455ResUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10456ResPar", GXutil.ltrim( localUtil.ntoc( Z10456ResPar, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10441ResCliNom", GXutil.rtrim( Z10441ResCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10447ResTipColD", GXutil.rtrim( Z10447ResTipColD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10449ResMatDsc", GXutil.rtrim( Z10449ResMatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10451ResIntDsc", GXutil.rtrim( Z10451ResIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10442ResArtCod", GXutil.rtrim( Z10442ResArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10443ResArtDsc", GXutil.rtrim( Z10443ResArtDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Resclicod( )
   {
      n10440ResCliCod = false ;
      n10441ResCliNom = false ;
      /* Using cursor T018826 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A10441ResCliNom = T018826_A10441ResCliNom[0] ;
         n10441ResCliNom = T018826_n10441ResCliNom[0] ;
      }
      else
      {
         A10441ResCliNom = "" ;
         n10441ResCliNom = false ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10441ResCliNom", GXutil.rtrim( A10441ResCliNom));
   }

   public void valid_Resartcod( )
   {
      n10440ResCliCod = false ;
      n10443ResArtDsc = false ;
      /* Using cursor T018828 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A10443ResArtDsc = T018828_A10443ResArtDsc[0] ;
         n10443ResArtDsc = T018828_n10443ResArtDsc[0] ;
      }
      else
      {
         A10443ResArtDsc = "" ;
         n10443ResArtDsc = false ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10443ResArtDsc", GXutil.rtrim( A10443ResArtDsc));
   }

   public void valid_Rescolnom( )
   {
      n10444ResColNom = false ;
      n10440ResCliCod = false ;
      /* Using cursor T018827 */
      pr_default.execute(25, new Object[] {Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EstTinCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RESCLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtResColNom_Internalname ;
      }
      A10442ResArtCod = T018827_A10442ResArtCod[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10442ResArtCod", GXutil.rtrim( A10442ResArtCod));
   }

   public void valid_Restipcol( )
   {
      n10446ResTipCol = false ;
      n10447ResTipColD = false ;
      /* Using cursor T018829 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A10447ResTipColD = T018829_A10447ResTipColD[0] ;
         n10447ResTipColD = T018829_n10447ResTipColD[0] ;
      }
      else
      {
         A10447ResTipColD = "" ;
         n10447ResTipColD = false ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10447ResTipColD", GXutil.rtrim( A10447ResTipColD));
   }

   public void valid_Resmatcod( )
   {
      n10448ResMatCod = false ;
      n10449ResMatDsc = false ;
      /* Using cursor T018830 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n10448ResMatCod), Short.valueOf(A10448ResMatCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A10449ResMatDsc = T018830_A10449ResMatDsc[0] ;
         n10449ResMatDsc = T018830_n10449ResMatDsc[0] ;
      }
      else
      {
         A10449ResMatDsc = "" ;
         n10449ResMatDsc = false ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10449ResMatDsc", GXutil.rtrim( A10449ResMatDsc));
   }

   public void valid_Resintcod( )
   {
      n10450ResIntCod = false ;
      n10451ResIntDsc = false ;
      /* Using cursor T018831 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n10450ResIntCod), Byte.valueOf(A10450ResIntCod)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A10451ResIntDsc = T018831_A10451ResIntDsc[0] ;
         n10451ResIntDsc = T018831_n10451ResIntDsc[0] ;
      }
      else
      {
         A10451ResIntDsc = "" ;
         n10451ResIntDsc = false ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10451ResIntDsc", GXutil.rtrim( A10451ResIntDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbResTpo'},{av:'A10434ResTpo',fld:'RESTPO',pic:''},{av:'cmbResEst'},{av:'A10435ResEst',fld:'RESEST',pic:'9'},{av:'A10439ResFchMin',fld:'RESFCHMIN',pic:'99/99/99 99:99'},{av:'A10452ResKgm',fld:'RESKGM',pic:'ZZZZZ9.99'},{av:'A10453ResMtr',fld:'RESMTR',pic:'ZZZZZ9.99'},{av:'A10454ResPie',fld:'RESPIE',pic:'ZZZZZ9'},{av:'cmbResUni'},{av:'A10455ResUni',fld:'RESUNI',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("'AGRUPACIONES'","{handler:'e121882',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A10457ResParCod',fld:'RESPARCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("'AGRUPACIONES'",",oparms:[{av:'A10457ResParCod',fld:'RESPARCOD',pic:''},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("'FASES'","{handler:'e131882',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A10457ResParCod',fld:'RESPARCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("'FASES'",",oparms:[{av:'A10457ResParCod',fld:'RESPARCOD',pic:''},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESCOD","{handler:'valid_Rescod',iparms:[{av:'A10454ResPie',fld:'RESPIE',pic:'ZZZZZ9'},{av:'A10453ResMtr',fld:'RESMTR',pic:'ZZZZZ9.99'},{av:'A10452ResKgm',fld:'RESKGM',pic:'ZZZZZ9.99'},{av:'A10439ResFchMin',fld:'RESFCHMIN',pic:'99/99/99 99:99'},{av:'cmbResUni'},{av:'A10455ResUni',fld:'RESUNI',pic:''},{av:'cmbResEst'},{av:'A10435ResEst',fld:'RESEST',pic:'9'},{av:'cmbResTpo'},{av:'A10434ResTpo',fld:'RESTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10433ResCod',fld:'RESCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV13ResCod',fld:'vRESCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'cmbResTpo'},{av:'A10434ResTpo',fld:'RESTPO',pic:''},{av:'cmbResEst'},{av:'A10435ResEst',fld:'RESEST',pic:'9'},{av:'A10436ResNum',fld:'RESNUM',pic:''},{av:'A10437ResFch',fld:'RESFCH',pic:''},{av:'A10438ResFchCmp',fld:'RESFCHCMP',pic:''},{av:'A10439ResFchMin',fld:'RESFCHMIN',pic:'99/99/99 99:99'},{av:'A10440ResCliCod',fld:'RESCLICOD',pic:'ZZZZZ9'},{av:'A10444ResColNom',fld:'RESCOLNOM',pic:'@!'},{av:'A10445ResColNum',fld:'RESCOLNUM',pic:'ZZZZZ9'},{av:'A10446ResTipCol',fld:'RESTIPCOL',pic:'Z9'},{av:'A10448ResMatCod',fld:'RESMATCOD',pic:'ZZ9'},{av:'A10450ResIntCod',fld:'RESINTCOD',pic:'Z9'},{av:'A10452ResKgm',fld:'RESKGM',pic:'ZZZZZ9.99'},{av:'A10453ResMtr',fld:'RESMTR',pic:'ZZZZZ9.99'},{av:'A10454ResPie',fld:'RESPIE',pic:'ZZZZZ9'},{av:'cmbResUni'},{av:'A10455ResUni',fld:'RESUNI',pic:''},{av:'A10441ResCliNom',fld:'RESCLINOM',pic:''},{av:'A10447ResTipColD',fld:'RESTIPCOLD',pic:''},{av:'A10449ResMatDsc',fld:'RESMATDSC',pic:''},{av:'A10451ResIntDsc',fld:'RESINTDSC',pic:''},{av:'A10442ResArtCod',fld:'RESARTCOD',pic:''},{av:'A10443ResArtDsc',fld:'RESARTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10433ResCod'},{av:'Z407EmprNom'},{av:'Z10434ResTpo'},{av:'Z10435ResEst'},{av:'Z10436ResNum'},{av:'Z10437ResFch'},{av:'Z10438ResFchCmp'},{av:'Z10439ResFchMin'},{av:'Z10440ResCliCod'},{av:'Z10444ResColNom'},{av:'Z10445ResColNum'},{av:'Z10446ResTipCol'},{av:'Z10448ResMatCod'},{av:'Z10450ResIntCod'},{av:'Z10452ResKgm'},{av:'Z10453ResMtr'},{av:'Z10454ResPie'},{av:'Z10455ResUni'},{av:'Z10456ResPar'},{av:'Z10441ResCliNom'},{av:'Z10447ResTipColD'},{av:'Z10449ResMatDsc'},{av:'Z10451ResIntDsc'},{av:'Z10442ResArtCod'},{av:'Z10443ResArtDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESCLICOD","{handler:'valid_Resclicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10440ResCliCod',fld:'RESCLICOD',pic:'ZZZZZ9'},{av:'A10441ResCliNom',fld:'RESCLINOM',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESCLICOD",",oparms:[{av:'A10441ResCliNom',fld:'RESCLINOM',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESARTCOD","{handler:'valid_Resartcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10440ResCliCod',fld:'RESCLICOD',pic:'ZZZZZ9'},{av:'A10442ResArtCod',fld:'RESARTCOD',pic:''},{av:'A10443ResArtDsc',fld:'RESARTDSC',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESARTCOD",",oparms:[{av:'A10443ResArtDsc',fld:'RESARTDSC',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESCOLNOM","{handler:'valid_Rescolnom',iparms:[{av:'A10444ResColNom',fld:'RESCOLNOM',pic:'@!'},{av:'A10440ResCliCod',fld:'RESCLICOD',pic:'ZZZZZ9'},{av:'A10442ResArtCod',fld:'RESARTCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESCOLNOM",",oparms:[{av:'A10442ResArtCod',fld:'RESARTCOD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESTIPCOL","{handler:'valid_Restipcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10446ResTipCol',fld:'RESTIPCOL',pic:'Z9'},{av:'A10447ResTipColD',fld:'RESTIPCOLD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESTIPCOL",",oparms:[{av:'A10447ResTipColD',fld:'RESTIPCOLD',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESMATCOD","{handler:'valid_Resmatcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10448ResMatCod',fld:'RESMATCOD',pic:'ZZ9'},{av:'A10449ResMatDsc',fld:'RESMATDSC',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESMATCOD",",oparms:[{av:'A10449ResMatDsc',fld:'RESMATDSC',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESINTCOD","{handler:'valid_Resintcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10450ResIntCod',fld:'RESINTCOD',pic:'Z9'},{av:'A10451ResIntDsc',fld:'RESINTDSC',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESINTCOD",",oparms:[{av:'A10451ResIntDsc',fld:'RESINTDSC',pic:''},{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESPAR","{handler:'valid_Respar',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESPAR",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("VALID_RESPARCOD","{handler:'valid_Resparcod',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("VALID_RESPARCOD",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Resagrpar',iparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]");
      setEventMetadata("NULL",",oparms:[{av:'A10456ResPar',fld:'RESPAR',pic:'9'}]}");
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
      pr_default.close(25);
      pr_default.close(39);
      pr_default.close(24);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z10434ResTpo = "" ;
      Z10436ResNum = "" ;
      Z10437ResFch = GXutil.nullDate() ;
      Z10438ResFchCmp = GXutil.nullDate() ;
      Z10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      Z10452ResKgm = DecimalUtil.ZERO ;
      Z10453ResMtr = DecimalUtil.ZERO ;
      Z10455ResUni = "" ;
      Z10444ResColNom = "" ;
      Z10457ResParCod = "" ;
      Z10458ResParKgm = DecimalUtil.ZERO ;
      Z10459ResParMtr = DecimalUtil.ZERO ;
      Z10463ResAgrPar = "" ;
      N10457ResParCod = "" ;
      N10458ResParKgm = DecimalUtil.ZERO ;
      N10459ResParMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV13ResCod = "" ;
      A10457ResParCod = "" ;
      A10458ResParKgm = DecimalUtil.ZERO ;
      A10444ResColNom = "" ;
      A10442ResArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A10434ResTpo = "" ;
      A10455ResUni = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10436ResNum = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10437ResFch = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A10438ResFchCmp = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10441ResCliNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10443ResArtDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10447ResTipColD = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10449ResMatDsc = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A10451ResIntDsc = "" ;
      lblTextblock22_Jsonclick = "" ;
      A10452ResKgm = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A10453ResMtr = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1408 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV14Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1410 = "" ;
      GXCCtl = "" ;
      A10459ResParMtr = DecimalUtil.ZERO ;
      A10463ResAgrPar = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z10441ResCliNom = "" ;
      Z10442ResArtCod = "" ;
      Z10443ResArtDsc = "" ;
      Z10447ResTipColD = "" ;
      Z10449ResMatDsc = "" ;
      Z10451ResIntDsc = "" ;
      T01887_A407EmprNom = new String[] {""} ;
      T01887_n407EmprNom = new boolean[] {false} ;
      T018813_A583IntCod = new byte[1] ;
      T018813_A626MatCod = new short[1] ;
      T018813_A831TipColCod = new byte[1] ;
      T018813_A65ArtCod = new String[] {""} ;
      T018813_A252CliCod = new int[1] ;
      T018813_A10433ResCod = new int[1] ;
      T018813_A407EmprNom = new String[] {""} ;
      T018813_n407EmprNom = new boolean[] {false} ;
      T018813_A10434ResTpo = new String[] {""} ;
      T018813_n10434ResTpo = new boolean[] {false} ;
      T018813_A10435ResEst = new byte[1] ;
      T018813_n10435ResEst = new boolean[] {false} ;
      T018813_A10436ResNum = new String[] {""} ;
      T018813_n10436ResNum = new boolean[] {false} ;
      T018813_A10437ResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T018813_n10437ResFch = new boolean[] {false} ;
      T018813_A10438ResFchCmp = new java.util.Date[] {GXutil.nullDate()} ;
      T018813_n10438ResFchCmp = new boolean[] {false} ;
      T018813_A10439ResFchMin = new java.util.Date[] {GXutil.nullDate()} ;
      T018813_n10439ResFchMin = new boolean[] {false} ;
      T018813_A10442ResArtCod = new String[] {""} ;
      T018813_A10445ResColNum = new int[1] ;
      T018813_n10445ResColNum = new boolean[] {false} ;
      T018813_A10446ResTipCol = new byte[1] ;
      T018813_n10446ResTipCol = new boolean[] {false} ;
      T018813_A10448ResMatCod = new short[1] ;
      T018813_n10448ResMatCod = new boolean[] {false} ;
      T018813_A10450ResIntCod = new byte[1] ;
      T018813_n10450ResIntCod = new boolean[] {false} ;
      T018813_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018813_n10452ResKgm = new boolean[] {false} ;
      T018813_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018813_n10453ResMtr = new boolean[] {false} ;
      T018813_A10454ResPie = new int[1] ;
      T018813_n10454ResPie = new boolean[] {false} ;
      T018813_A10455ResUni = new String[] {""} ;
      T018813_n10455ResUni = new boolean[] {false} ;
      T018813_A10456ResPar = new byte[1] ;
      T018813_n10456ResPar = new boolean[] {false} ;
      T018813_A10444ResColNom = new String[] {""} ;
      T018813_n10444ResColNom = new boolean[] {false} ;
      T018813_A10440ResCliCod = new int[1] ;
      T018813_n10440ResCliCod = new boolean[] {false} ;
      T018813_A396EmprCod = new String[] {""} ;
      T018813_A10441ResCliNom = new String[] {""} ;
      T018813_n10441ResCliNom = new boolean[] {false} ;
      T018813_A10443ResArtDsc = new String[] {""} ;
      T018813_n10443ResArtDsc = new boolean[] {false} ;
      T018813_A10447ResTipColD = new String[] {""} ;
      T018813_n10447ResTipColD = new boolean[] {false} ;
      T018813_A10449ResMatDsc = new String[] {""} ;
      T018813_n10449ResMatDsc = new boolean[] {false} ;
      T018813_A10451ResIntDsc = new String[] {""} ;
      T018813_n10451ResIntDsc = new boolean[] {false} ;
      T01888_A10441ResCliNom = new String[] {""} ;
      T01888_n10441ResCliNom = new boolean[] {false} ;
      T018810_A10447ResTipColD = new String[] {""} ;
      T018810_n10447ResTipColD = new boolean[] {false} ;
      T018811_A10449ResMatDsc = new String[] {""} ;
      T018811_n10449ResMatDsc = new boolean[] {false} ;
      T018812_A10451ResIntDsc = new String[] {""} ;
      T018812_n10451ResIntDsc = new boolean[] {false} ;
      T01886_A10442ResArtCod = new String[] {""} ;
      T01889_A10443ResArtDsc = new String[] {""} ;
      T01889_n10443ResArtDsc = new boolean[] {false} ;
      T018814_A10441ResCliNom = new String[] {""} ;
      T018814_n10441ResCliNom = new boolean[] {false} ;
      T018815_A10447ResTipColD = new String[] {""} ;
      T018815_n10447ResTipColD = new boolean[] {false} ;
      T018816_A10449ResMatDsc = new String[] {""} ;
      T018816_n10449ResMatDsc = new boolean[] {false} ;
      T018817_A10451ResIntDsc = new String[] {""} ;
      T018817_n10451ResIntDsc = new boolean[] {false} ;
      T018818_A10442ResArtCod = new String[] {""} ;
      T018819_A10443ResArtDsc = new String[] {""} ;
      T018819_n10443ResArtDsc = new boolean[] {false} ;
      T018820_A396EmprCod = new String[] {""} ;
      T018820_A10433ResCod = new int[1] ;
      T01885_A10433ResCod = new int[1] ;
      T01885_A10434ResTpo = new String[] {""} ;
      T01885_n10434ResTpo = new boolean[] {false} ;
      T01885_A10435ResEst = new byte[1] ;
      T01885_n10435ResEst = new boolean[] {false} ;
      T01885_A10436ResNum = new String[] {""} ;
      T01885_n10436ResNum = new boolean[] {false} ;
      T01885_A10437ResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01885_n10437ResFch = new boolean[] {false} ;
      T01885_A10438ResFchCmp = new java.util.Date[] {GXutil.nullDate()} ;
      T01885_n10438ResFchCmp = new boolean[] {false} ;
      T01885_A10439ResFchMin = new java.util.Date[] {GXutil.nullDate()} ;
      T01885_n10439ResFchMin = new boolean[] {false} ;
      T01885_A10445ResColNum = new int[1] ;
      T01885_n10445ResColNum = new boolean[] {false} ;
      T01885_A10446ResTipCol = new byte[1] ;
      T01885_n10446ResTipCol = new boolean[] {false} ;
      T01885_A10448ResMatCod = new short[1] ;
      T01885_n10448ResMatCod = new boolean[] {false} ;
      T01885_A10450ResIntCod = new byte[1] ;
      T01885_n10450ResIntCod = new boolean[] {false} ;
      T01885_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01885_n10452ResKgm = new boolean[] {false} ;
      T01885_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01885_n10453ResMtr = new boolean[] {false} ;
      T01885_A10454ResPie = new int[1] ;
      T01885_n10454ResPie = new boolean[] {false} ;
      T01885_A10455ResUni = new String[] {""} ;
      T01885_n10455ResUni = new boolean[] {false} ;
      T01885_A10456ResPar = new byte[1] ;
      T01885_n10456ResPar = new boolean[] {false} ;
      T01885_A10444ResColNom = new String[] {""} ;
      T01885_n10444ResColNom = new boolean[] {false} ;
      T01885_A10440ResCliCod = new int[1] ;
      T01885_n10440ResCliCod = new boolean[] {false} ;
      T01885_A396EmprCod = new String[] {""} ;
      T018821_A396EmprCod = new String[] {""} ;
      T018821_A10433ResCod = new int[1] ;
      T018822_A396EmprCod = new String[] {""} ;
      T018822_A10433ResCod = new int[1] ;
      T01884_A10433ResCod = new int[1] ;
      T01884_A10434ResTpo = new String[] {""} ;
      T01884_n10434ResTpo = new boolean[] {false} ;
      T01884_A10435ResEst = new byte[1] ;
      T01884_n10435ResEst = new boolean[] {false} ;
      T01884_A10436ResNum = new String[] {""} ;
      T01884_n10436ResNum = new boolean[] {false} ;
      T01884_A10437ResFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01884_n10437ResFch = new boolean[] {false} ;
      T01884_A10438ResFchCmp = new java.util.Date[] {GXutil.nullDate()} ;
      T01884_n10438ResFchCmp = new boolean[] {false} ;
      T01884_A10439ResFchMin = new java.util.Date[] {GXutil.nullDate()} ;
      T01884_n10439ResFchMin = new boolean[] {false} ;
      T01884_A10445ResColNum = new int[1] ;
      T01884_n10445ResColNum = new boolean[] {false} ;
      T01884_A10446ResTipCol = new byte[1] ;
      T01884_n10446ResTipCol = new boolean[] {false} ;
      T01884_A10448ResMatCod = new short[1] ;
      T01884_n10448ResMatCod = new boolean[] {false} ;
      T01884_A10450ResIntCod = new byte[1] ;
      T01884_n10450ResIntCod = new boolean[] {false} ;
      T01884_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01884_n10452ResKgm = new boolean[] {false} ;
      T01884_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01884_n10453ResMtr = new boolean[] {false} ;
      T01884_A10454ResPie = new int[1] ;
      T01884_n10454ResPie = new boolean[] {false} ;
      T01884_A10455ResUni = new String[] {""} ;
      T01884_n10455ResUni = new boolean[] {false} ;
      T01884_A10456ResPar = new byte[1] ;
      T01884_n10456ResPar = new boolean[] {false} ;
      T01884_A10444ResColNom = new String[] {""} ;
      T01884_n10444ResColNom = new boolean[] {false} ;
      T01884_A10440ResCliCod = new int[1] ;
      T01884_n10440ResCliCod = new boolean[] {false} ;
      T01884_A396EmprCod = new String[] {""} ;
      T018826_A10441ResCliNom = new String[] {""} ;
      T018826_n10441ResCliNom = new boolean[] {false} ;
      T018827_A10442ResArtCod = new String[] {""} ;
      T018828_A10443ResArtDsc = new String[] {""} ;
      T018828_n10443ResArtDsc = new boolean[] {false} ;
      T018829_A10447ResTipColD = new String[] {""} ;
      T018829_n10447ResTipColD = new boolean[] {false} ;
      T018830_A10449ResMatDsc = new String[] {""} ;
      T018830_n10449ResMatDsc = new boolean[] {false} ;
      T018831_A10451ResIntDsc = new String[] {""} ;
      T018831_n10451ResIntDsc = new boolean[] {false} ;
      T018832_A396EmprCod = new String[] {""} ;
      T018832_A10433ResCod = new int[1] ;
      T018832_A10457ResParCod = new String[] {""} ;
      T018832_A10464ResLin = new int[1] ;
      T018833_A396EmprCod = new String[] {""} ;
      T018833_A10433ResCod = new int[1] ;
      T018834_A10433ResCod = new int[1] ;
      T018834_A10457ResParCod = new String[] {""} ;
      T018834_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018834_n10458ResParKgm = new boolean[] {false} ;
      T018834_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018834_n10459ResParMtr = new boolean[] {false} ;
      T018834_A10460ResParPie = new int[1] ;
      T018834_n10460ResParPie = new boolean[] {false} ;
      T018834_A10461ResAgr = new byte[1] ;
      T018834_n10461ResAgr = new boolean[] {false} ;
      T018834_A10462ResAgrCod = new int[1] ;
      T018834_n10462ResAgrCod = new boolean[] {false} ;
      T018834_A10463ResAgrPar = new String[] {""} ;
      T018834_n10463ResAgrPar = new boolean[] {false} ;
      T018834_A396EmprCod = new String[] {""} ;
      T018835_A396EmprCod = new String[] {""} ;
      T018835_A10433ResCod = new int[1] ;
      T018835_A10457ResParCod = new String[] {""} ;
      T01883_A10433ResCod = new int[1] ;
      T01883_A10457ResParCod = new String[] {""} ;
      T01883_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01883_n10458ResParKgm = new boolean[] {false} ;
      T01883_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01883_n10459ResParMtr = new boolean[] {false} ;
      T01883_A10460ResParPie = new int[1] ;
      T01883_n10460ResParPie = new boolean[] {false} ;
      T01883_A10461ResAgr = new byte[1] ;
      T01883_n10461ResAgr = new boolean[] {false} ;
      T01883_A10462ResAgrCod = new int[1] ;
      T01883_n10462ResAgrCod = new boolean[] {false} ;
      T01883_A10463ResAgrPar = new String[] {""} ;
      T01883_n10463ResAgrPar = new boolean[] {false} ;
      T01883_A396EmprCod = new String[] {""} ;
      T01882_A10433ResCod = new int[1] ;
      T01882_A10457ResParCod = new String[] {""} ;
      T01882_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01882_n10458ResParKgm = new boolean[] {false} ;
      T01882_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01882_n10459ResParMtr = new boolean[] {false} ;
      T01882_A10460ResParPie = new int[1] ;
      T01882_n10460ResParPie = new boolean[] {false} ;
      T01882_A10461ResAgr = new byte[1] ;
      T01882_n10461ResAgr = new boolean[] {false} ;
      T01882_A10462ResAgrCod = new int[1] ;
      T01882_n10462ResAgrCod = new boolean[] {false} ;
      T01882_A10463ResAgrPar = new String[] {""} ;
      T01882_n10463ResAgrPar = new boolean[] {false} ;
      T01882_A396EmprCod = new String[] {""} ;
      T018839_A396EmprCod = new String[] {""} ;
      T018839_A10433ResCod = new int[1] ;
      T018839_A10457ResParCod = new String[] {""} ;
      T018839_A10464ResLin = new int[1] ;
      T018840_A396EmprCod = new String[] {""} ;
      T018840_A10433ResCod = new int[1] ;
      T018840_A10457ResParCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new byte[1] ;
      T018841_A407EmprNom = new String[] {""} ;
      T018841_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ10434ResTpo = "" ;
      ZZ10436ResNum = "" ;
      ZZ10437ResFch = GXutil.nullDate() ;
      ZZ10438ResFchCmp = GXutil.nullDate() ;
      ZZ10439ResFchMin = GXutil.resetTime( GXutil.nullDate() );
      ZZ10444ResColNom = "" ;
      ZZ10452ResKgm = DecimalUtil.ZERO ;
      ZZ10453ResMtr = DecimalUtil.ZERO ;
      ZZ10455ResUni = "" ;
      ZZ10441ResCliNom = "" ;
      ZZ10447ResTipColD = "" ;
      ZZ10449ResMatDsc = "" ;
      ZZ10451ResIntDsc = "" ;
      ZZ10442ResArtCod = "" ;
      ZZ10443ResArtDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trespar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trespar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trespar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trespar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trespar__default(),
         new Object[] {
             new Object[] {
            T01882_A10433ResCod, T01882_A10457ResParCod, T01882_A10458ResParKgm, T01882_n10458ResParKgm, T01882_A10459ResParMtr, T01882_n10459ResParMtr, T01882_A10460ResParPie, T01882_n10460ResParPie, T01882_A10461ResAgr, T01882_n10461ResAgr,
            T01882_A10462ResAgrCod, T01882_n10462ResAgrCod, T01882_A10463ResAgrPar, T01882_n10463ResAgrPar, T01882_A396EmprCod
            }
            , new Object[] {
            T01883_A10433ResCod, T01883_A10457ResParCod, T01883_A10458ResParKgm, T01883_n10458ResParKgm, T01883_A10459ResParMtr, T01883_n10459ResParMtr, T01883_A10460ResParPie, T01883_n10460ResParPie, T01883_A10461ResAgr, T01883_n10461ResAgr,
            T01883_A10462ResAgrCod, T01883_n10462ResAgrCod, T01883_A10463ResAgrPar, T01883_n10463ResAgrPar, T01883_A396EmprCod
            }
            , new Object[] {
            T01884_A10433ResCod, T01884_A10434ResTpo, T01884_n10434ResTpo, T01884_A10435ResEst, T01884_n10435ResEst, T01884_A10436ResNum, T01884_n10436ResNum, T01884_A10437ResFch, T01884_n10437ResFch, T01884_A10438ResFchCmp,
            T01884_n10438ResFchCmp, T01884_A10439ResFchMin, T01884_n10439ResFchMin, T01884_A10445ResColNum, T01884_n10445ResColNum, T01884_A10446ResTipCol, T01884_n10446ResTipCol, T01884_A10448ResMatCod, T01884_n10448ResMatCod, T01884_A10450ResIntCod,
            T01884_n10450ResIntCod, T01884_A10452ResKgm, T01884_n10452ResKgm, T01884_A10453ResMtr, T01884_n10453ResMtr, T01884_A10454ResPie, T01884_n10454ResPie, T01884_A10455ResUni, T01884_n10455ResUni, T01884_A10456ResPar,
            T01884_n10456ResPar, T01884_A10444ResColNom, T01884_n10444ResColNom, T01884_A10440ResCliCod, T01884_n10440ResCliCod, T01884_A396EmprCod
            }
            , new Object[] {
            T01885_A10433ResCod, T01885_A10434ResTpo, T01885_n10434ResTpo, T01885_A10435ResEst, T01885_n10435ResEst, T01885_A10436ResNum, T01885_n10436ResNum, T01885_A10437ResFch, T01885_n10437ResFch, T01885_A10438ResFchCmp,
            T01885_n10438ResFchCmp, T01885_A10439ResFchMin, T01885_n10439ResFchMin, T01885_A10445ResColNum, T01885_n10445ResColNum, T01885_A10446ResTipCol, T01885_n10446ResTipCol, T01885_A10448ResMatCod, T01885_n10448ResMatCod, T01885_A10450ResIntCod,
            T01885_n10450ResIntCod, T01885_A10452ResKgm, T01885_n10452ResKgm, T01885_A10453ResMtr, T01885_n10453ResMtr, T01885_A10454ResPie, T01885_n10454ResPie, T01885_A10455ResUni, T01885_n10455ResUni, T01885_A10456ResPar,
            T01885_n10456ResPar, T01885_A10444ResColNom, T01885_n10444ResColNom, T01885_A10440ResCliCod, T01885_n10440ResCliCod, T01885_A396EmprCod
            }
            , new Object[] {
            T01886_A10442ResArtCod
            }
            , new Object[] {
            T01887_A407EmprNom, T01887_n407EmprNom
            }
            , new Object[] {
            T01888_A10441ResCliNom, T01888_n10441ResCliNom
            }
            , new Object[] {
            T01889_A10443ResArtDsc, T01889_n10443ResArtDsc
            }
            , new Object[] {
            T018810_A10447ResTipColD, T018810_n10447ResTipColD
            }
            , new Object[] {
            T018811_A10449ResMatDsc, T018811_n10449ResMatDsc
            }
            , new Object[] {
            T018812_A10451ResIntDsc, T018812_n10451ResIntDsc
            }
            , new Object[] {
            T018813_A583IntCod, T018813_A626MatCod, T018813_A831TipColCod, T018813_A65ArtCod, T018813_A252CliCod, T018813_A10433ResCod, T018813_A407EmprNom, T018813_n407EmprNom, T018813_A10434ResTpo, T018813_n10434ResTpo,
            T018813_A10435ResEst, T018813_n10435ResEst, T018813_A10436ResNum, T018813_n10436ResNum, T018813_A10437ResFch, T018813_n10437ResFch, T018813_A10438ResFchCmp, T018813_n10438ResFchCmp, T018813_A10439ResFchMin, T018813_n10439ResFchMin,
            T018813_A10442ResArtCod, T018813_A10445ResColNum, T018813_n10445ResColNum, T018813_A10446ResTipCol, T018813_n10446ResTipCol, T018813_A10448ResMatCod, T018813_n10448ResMatCod, T018813_A10450ResIntCod, T018813_n10450ResIntCod, T018813_A10452ResKgm,
            T018813_n10452ResKgm, T018813_A10453ResMtr, T018813_n10453ResMtr, T018813_A10454ResPie, T018813_n10454ResPie, T018813_A10455ResUni, T018813_n10455ResUni, T018813_A10456ResPar, T018813_n10456ResPar, T018813_A10444ResColNom,
            T018813_n10444ResColNom, T018813_A10440ResCliCod, T018813_n10440ResCliCod, T018813_A396EmprCod, T018813_A10441ResCliNom, T018813_n10441ResCliNom, T018813_A10443ResArtDsc, T018813_n10443ResArtDsc, T018813_A10447ResTipColD, T018813_n10447ResTipColD,
            T018813_A10449ResMatDsc, T018813_n10449ResMatDsc, T018813_A10451ResIntDsc, T018813_n10451ResIntDsc
            }
            , new Object[] {
            T018814_A10441ResCliNom, T018814_n10441ResCliNom
            }
            , new Object[] {
            T018815_A10447ResTipColD, T018815_n10447ResTipColD
            }
            , new Object[] {
            T018816_A10449ResMatDsc, T018816_n10449ResMatDsc
            }
            , new Object[] {
            T018817_A10451ResIntDsc, T018817_n10451ResIntDsc
            }
            , new Object[] {
            T018818_A10442ResArtCod
            }
            , new Object[] {
            T018819_A10443ResArtDsc, T018819_n10443ResArtDsc
            }
            , new Object[] {
            T018820_A396EmprCod, T018820_A10433ResCod
            }
            , new Object[] {
            T018821_A396EmprCod, T018821_A10433ResCod
            }
            , new Object[] {
            T018822_A396EmprCod, T018822_A10433ResCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018826_A10441ResCliNom, T018826_n10441ResCliNom
            }
            , new Object[] {
            T018827_A10442ResArtCod
            }
            , new Object[] {
            T018828_A10443ResArtDsc, T018828_n10443ResArtDsc
            }
            , new Object[] {
            T018829_A10447ResTipColD, T018829_n10447ResTipColD
            }
            , new Object[] {
            T018830_A10449ResMatDsc, T018830_n10449ResMatDsc
            }
            , new Object[] {
            T018831_A10451ResIntDsc, T018831_n10451ResIntDsc
            }
            , new Object[] {
            T018832_A396EmprCod, T018832_A10433ResCod, T018832_A10457ResParCod, T018832_A10464ResLin
            }
            , new Object[] {
            T018833_A396EmprCod, T018833_A10433ResCod
            }
            , new Object[] {
            T018834_A10433ResCod, T018834_A10457ResParCod, T018834_A10458ResParKgm, T018834_n10458ResParKgm, T018834_A10459ResParMtr, T018834_n10459ResParMtr, T018834_A10460ResParPie, T018834_n10460ResParPie, T018834_A10461ResAgr, T018834_n10461ResAgr,
            T018834_A10462ResAgrCod, T018834_n10462ResAgrCod, T018834_A10463ResAgrPar, T018834_n10463ResAgrPar, T018834_A396EmprCod
            }
            , new Object[] {
            T018835_A396EmprCod, T018835_A10433ResCod, T018835_A10457ResParCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018839_A396EmprCod, T018839_A10433ResCod, T018839_A10457ResParCod, T018839_A10464ResLin
            }
            , new Object[] {
            T018840_A396EmprCod, T018840_A10433ResCod, T018840_A10457ResParCod
            }
            , new Object[] {
            T018841_A407EmprNom, T018841_n407EmprNom
            }
         }
      );
      Z10433ResCod = 0 ;
      A10433ResCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV14Pgmname = "TResPar" ;
   }

   private byte Z10435ResEst ;
   private byte Z10446ResTipCol ;
   private byte Z10450ResIntCod ;
   private byte Z10456ResPar ;
   private byte Z10461ResAgr ;
   private byte GxWebError ;
   private byte A10446ResTipCol ;
   private byte A10450ResIntCod ;
   private byte nKeyPressed ;
   private byte A10456ResPar ;
   private byte A10435ResEst ;
   private byte A10461ResAgr ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int5[] ;
   private byte ZZ10435ResEst ;
   private byte ZZ10446ResTipCol ;
   private byte ZZ10450ResIntCod ;
   private byte ZZ10456ResPar ;
   private short Z10448ResMatCod ;
   private short nRcdDeleted_1408 ;
   private short nRcdExists_1408 ;
   private short nIsMod_1408 ;
   private short A10448ResMatCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1408 ;
   private short RcdFound1408 ;
   private short nBlankRcdUsr1408 ;
   private short RcdFound1410 ;
   private short nIsDirty_1410 ;
   private short nIsDirty_1408 ;
   private short ZZ10448ResMatCod ;
   private int wcpOA10433ResCod ;
   private int Z10433ResCod ;
   private int Z10445ResColNum ;
   private int Z10454ResPie ;
   private int Z10440ResCliCod ;
   private int nRC_GXsfl_149 ;
   private int nGXsfl_149_idx=1 ;
   private int Z10460ResParPie ;
   private int Z10462ResAgrCod ;
   private int N10460ResParPie ;
   private int A10440ResCliCod ;
   private int A10433ResCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtResCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtResNum_Enabled ;
   private int edtResFch_Enabled ;
   private int edtResFchCmp_Enabled ;
   private int edtResFchMin_Enabled ;
   private int edtResCliCod_Enabled ;
   private int edtResCliNom_Enabled ;
   private int edtResArtCod_Enabled ;
   private int edtResArtDsc_Enabled ;
   private int edtResColNom_Enabled ;
   private int A10445ResColNum ;
   private int edtResColNum_Enabled ;
   private int edtResTipCol_Enabled ;
   private int edtResTipColD_Enabled ;
   private int edtResMatCod_Enabled ;
   private int edtResMatDsc_Enabled ;
   private int edtResIntCod_Enabled ;
   private int edtResIntDsc_Enabled ;
   private int edtResKgm_Enabled ;
   private int edtResMtr_Enabled ;
   private int A10454ResPie ;
   private int edtResPie_Enabled ;
   private int edtavnRcdDeleted_1408_Enabled ;
   private int edtResParCod_Enabled ;
   private int edtResParKgm_Enabled ;
   private int edtResParMtr_Enabled ;
   private int edtResParPie_Enabled ;
   private int edtResAgrCod_Enabled ;
   private int edtResAgrPar_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10460ResParPie ;
   private int A10462ResAgrCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtResParPie_Enabled ;
   private int defedtResParMtr_Enabled ;
   private int defedtResParKgm_Enabled ;
   private int defedtResParCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtResPie_Backcolor ;
   private int edtResMtr_Backcolor ;
   private int edtResKgm_Backcolor ;
   private int edtResIntDsc_Backcolor ;
   private int edtResIntCod_Backcolor ;
   private int edtResMatDsc_Backcolor ;
   private int edtResMatCod_Backcolor ;
   private int edtResTipColD_Backcolor ;
   private int edtResTipCol_Backcolor ;
   private int edtResColNum_Backcolor ;
   private int edtResColNom_Backcolor ;
   private int edtResArtDsc_Backcolor ;
   private int edtResArtCod_Backcolor ;
   private int edtResCliNom_Backcolor ;
   private int edtResCliCod_Backcolor ;
   private int edtResFchMin_Backcolor ;
   private int edtResFchCmp_Backcolor ;
   private int edtResFch_Backcolor ;
   private int edtResNum_Backcolor ;
   private int edtResCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10433ResCod ;
   private int ZZ10440ResCliCod ;
   private int ZZ10445ResColNum ;
   private int ZZ10454ResPie ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10452ResKgm ;
   private java.math.BigDecimal Z10453ResMtr ;
   private java.math.BigDecimal Z10458ResParKgm ;
   private java.math.BigDecimal Z10459ResParMtr ;
   private java.math.BigDecimal N10458ResParKgm ;
   private java.math.BigDecimal N10459ResParMtr ;
   private java.math.BigDecimal A10458ResParKgm ;
   private java.math.BigDecimal A10452ResKgm ;
   private java.math.BigDecimal A10453ResMtr ;
   private java.math.BigDecimal A10459ResParMtr ;
   private java.math.BigDecimal ZZ10452ResKgm ;
   private java.math.BigDecimal ZZ10453ResMtr ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z10434ResTpo ;
   private String Z10436ResNum ;
   private String Z10455ResUni ;
   private String Z10444ResColNom ;
   private String Z10457ResParCod ;
   private String Z10463ResAgrPar ;
   private String N10457ResParCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV13ResCod ;
   private String A10457ResParCod ;
   private String A10444ResColNom ;
   private String A10442ResArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtResNum_Internalname ;
   private String sGXsfl_149_idx="0001" ;
   private String Gx_mode ;
   private String A10434ResTpo ;
   private String A10455ResUni ;
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
   private String edtResCod_Internalname ;
   private String edtResCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String A10436ResNum ;
   private String edtResNum_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtResFch_Internalname ;
   private String edtResFch_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtResFchCmp_Internalname ;
   private String edtResFchCmp_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtResFchMin_Internalname ;
   private String edtResFchMin_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtResCliCod_Internalname ;
   private String edtResCliCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtResCliNom_Internalname ;
   private String A10441ResCliNom ;
   private String edtResCliNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtResArtCod_Internalname ;
   private String edtResArtCod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtResArtDsc_Internalname ;
   private String A10443ResArtDsc ;
   private String edtResArtDsc_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtResColNom_Internalname ;
   private String edtResColNom_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtResColNum_Internalname ;
   private String edtResColNum_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtResTipCol_Internalname ;
   private String edtResTipCol_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtResTipColD_Internalname ;
   private String A10447ResTipColD ;
   private String edtResTipColD_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtResMatCod_Internalname ;
   private String edtResMatCod_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtResMatDsc_Internalname ;
   private String A10449ResMatDsc ;
   private String edtResMatDsc_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtResIntCod_Internalname ;
   private String edtResIntCod_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtResIntDsc_Internalname ;
   private String A10451ResIntDsc ;
   private String edtResIntDsc_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtResKgm_Internalname ;
   private String edtResKgm_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtResMtr_Internalname ;
   private String edtResMtr_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtResPie_Internalname ;
   private String edtResPie_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String sMode1408 ;
   private String edtavnRcdDeleted_1408_Internalname ;
   private String edtResParCod_Internalname ;
   private String edtResParKgm_Internalname ;
   private String edtResParMtr_Internalname ;
   private String edtResParPie_Internalname ;
   private String edtResAgrCod_Internalname ;
   private String edtResAgrPar_Internalname ;
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
   private String AV14Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1410 ;
   private String GXCCtl ;
   private String A10463ResAgrPar ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z10441ResCliNom ;
   private String Z10442ResArtCod ;
   private String Z10443ResArtDsc ;
   private String Z10447ResTipColD ;
   private String Z10449ResMatDsc ;
   private String Z10451ResIntDsc ;
   private String sGXsfl_149_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1408_Jsonclick ;
   private String edtResParCod_Jsonclick ;
   private String edtResParKgm_Jsonclick ;
   private String edtResParMtr_Jsonclick ;
   private String edtResParPie_Jsonclick ;
   private String edtResAgrCod_Jsonclick ;
   private String edtResAgrPar_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ10434ResTpo ;
   private String ZZ10436ResNum ;
   private String ZZ10444ResColNom ;
   private String ZZ10455ResUni ;
   private String ZZ10441ResCliNom ;
   private String ZZ10447ResTipColD ;
   private String ZZ10449ResMatDsc ;
   private String ZZ10451ResIntDsc ;
   private String ZZ10442ResArtCod ;
   private String ZZ10443ResArtDsc ;
   private java.util.Date Z10439ResFchMin ;
   private java.util.Date A10439ResFchMin ;
   private java.util.Date ZZ10439ResFchMin ;
   private java.util.Date Z10437ResFch ;
   private java.util.Date Z10438ResFchCmp ;
   private java.util.Date A10437ResFch ;
   private java.util.Date A10438ResFchCmp ;
   private java.util.Date ZZ10437ResFch ;
   private java.util.Date ZZ10438ResFchCmp ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10458ResParKgm ;
   private boolean n10440ResCliCod ;
   private boolean n10446ResTipCol ;
   private boolean n10448ResMatCod ;
   private boolean n10450ResIntCod ;
   private boolean n10444ResColNom ;
   private boolean wbErr ;
   private boolean n10456ResPar ;
   private boolean n10434ResTpo ;
   private boolean n10435ResEst ;
   private boolean n10455ResUni ;
   private boolean bGXsfl_149_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10436ResNum ;
   private boolean n10437ResFch ;
   private boolean n10438ResFchCmp ;
   private boolean n10439ResFchMin ;
   private boolean n10441ResCliNom ;
   private boolean n10443ResArtDsc ;
   private boolean n10445ResColNum ;
   private boolean n10447ResTipColD ;
   private boolean n10449ResMatDsc ;
   private boolean n10451ResIntDsc ;
   private boolean n10452ResKgm ;
   private boolean n10453ResMtr ;
   private boolean n10454ResPie ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n10459ResParMtr ;
   private boolean n10460ResParPie ;
   private boolean n10461ResAgr ;
   private boolean n10462ResAgrCod ;
   private boolean n10463ResAgrPar ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbResTpo ;
   private HTMLChoice cmbResEst ;
   private HTMLChoice cmbResUni ;
   private ICheckbox chkResPar ;
   private ICheckbox chkResAgr ;
   private IDataStoreProvider pr_default ;
   private String[] T01887_A407EmprNom ;
   private boolean[] T01887_n407EmprNom ;
   private byte[] T018813_A583IntCod ;
   private short[] T018813_A626MatCod ;
   private byte[] T018813_A831TipColCod ;
   private String[] T018813_A65ArtCod ;
   private int[] T018813_A252CliCod ;
   private int[] T018813_A10433ResCod ;
   private String[] T018813_A407EmprNom ;
   private boolean[] T018813_n407EmprNom ;
   private String[] T018813_A10434ResTpo ;
   private boolean[] T018813_n10434ResTpo ;
   private byte[] T018813_A10435ResEst ;
   private boolean[] T018813_n10435ResEst ;
   private String[] T018813_A10436ResNum ;
   private boolean[] T018813_n10436ResNum ;
   private java.util.Date[] T018813_A10437ResFch ;
   private boolean[] T018813_n10437ResFch ;
   private java.util.Date[] T018813_A10438ResFchCmp ;
   private boolean[] T018813_n10438ResFchCmp ;
   private java.util.Date[] T018813_A10439ResFchMin ;
   private boolean[] T018813_n10439ResFchMin ;
   private String[] T018813_A10442ResArtCod ;
   private int[] T018813_A10445ResColNum ;
   private boolean[] T018813_n10445ResColNum ;
   private byte[] T018813_A10446ResTipCol ;
   private boolean[] T018813_n10446ResTipCol ;
   private short[] T018813_A10448ResMatCod ;
   private boolean[] T018813_n10448ResMatCod ;
   private byte[] T018813_A10450ResIntCod ;
   private boolean[] T018813_n10450ResIntCod ;
   private java.math.BigDecimal[] T018813_A10452ResKgm ;
   private boolean[] T018813_n10452ResKgm ;
   private java.math.BigDecimal[] T018813_A10453ResMtr ;
   private boolean[] T018813_n10453ResMtr ;
   private int[] T018813_A10454ResPie ;
   private boolean[] T018813_n10454ResPie ;
   private String[] T018813_A10455ResUni ;
   private boolean[] T018813_n10455ResUni ;
   private byte[] T018813_A10456ResPar ;
   private boolean[] T018813_n10456ResPar ;
   private String[] T018813_A10444ResColNom ;
   private boolean[] T018813_n10444ResColNom ;
   private int[] T018813_A10440ResCliCod ;
   private boolean[] T018813_n10440ResCliCod ;
   private String[] T018813_A396EmprCod ;
   private String[] T018813_A10441ResCliNom ;
   private boolean[] T018813_n10441ResCliNom ;
   private String[] T018813_A10443ResArtDsc ;
   private boolean[] T018813_n10443ResArtDsc ;
   private String[] T018813_A10447ResTipColD ;
   private boolean[] T018813_n10447ResTipColD ;
   private String[] T018813_A10449ResMatDsc ;
   private boolean[] T018813_n10449ResMatDsc ;
   private String[] T018813_A10451ResIntDsc ;
   private boolean[] T018813_n10451ResIntDsc ;
   private String[] T01888_A10441ResCliNom ;
   private boolean[] T01888_n10441ResCliNom ;
   private String[] T018810_A10447ResTipColD ;
   private boolean[] T018810_n10447ResTipColD ;
   private String[] T018811_A10449ResMatDsc ;
   private boolean[] T018811_n10449ResMatDsc ;
   private String[] T018812_A10451ResIntDsc ;
   private boolean[] T018812_n10451ResIntDsc ;
   private String[] T01886_A10442ResArtCod ;
   private String[] T01889_A10443ResArtDsc ;
   private boolean[] T01889_n10443ResArtDsc ;
   private String[] T018814_A10441ResCliNom ;
   private boolean[] T018814_n10441ResCliNom ;
   private String[] T018815_A10447ResTipColD ;
   private boolean[] T018815_n10447ResTipColD ;
   private String[] T018816_A10449ResMatDsc ;
   private boolean[] T018816_n10449ResMatDsc ;
   private String[] T018817_A10451ResIntDsc ;
   private boolean[] T018817_n10451ResIntDsc ;
   private String[] T018818_A10442ResArtCod ;
   private String[] T018819_A10443ResArtDsc ;
   private boolean[] T018819_n10443ResArtDsc ;
   private String[] T018820_A396EmprCod ;
   private int[] T018820_A10433ResCod ;
   private int[] T01885_A10433ResCod ;
   private String[] T01885_A10434ResTpo ;
   private boolean[] T01885_n10434ResTpo ;
   private byte[] T01885_A10435ResEst ;
   private boolean[] T01885_n10435ResEst ;
   private String[] T01885_A10436ResNum ;
   private boolean[] T01885_n10436ResNum ;
   private java.util.Date[] T01885_A10437ResFch ;
   private boolean[] T01885_n10437ResFch ;
   private java.util.Date[] T01885_A10438ResFchCmp ;
   private boolean[] T01885_n10438ResFchCmp ;
   private java.util.Date[] T01885_A10439ResFchMin ;
   private boolean[] T01885_n10439ResFchMin ;
   private int[] T01885_A10445ResColNum ;
   private boolean[] T01885_n10445ResColNum ;
   private byte[] T01885_A10446ResTipCol ;
   private boolean[] T01885_n10446ResTipCol ;
   private short[] T01885_A10448ResMatCod ;
   private boolean[] T01885_n10448ResMatCod ;
   private byte[] T01885_A10450ResIntCod ;
   private boolean[] T01885_n10450ResIntCod ;
   private java.math.BigDecimal[] T01885_A10452ResKgm ;
   private boolean[] T01885_n10452ResKgm ;
   private java.math.BigDecimal[] T01885_A10453ResMtr ;
   private boolean[] T01885_n10453ResMtr ;
   private int[] T01885_A10454ResPie ;
   private boolean[] T01885_n10454ResPie ;
   private String[] T01885_A10455ResUni ;
   private boolean[] T01885_n10455ResUni ;
   private byte[] T01885_A10456ResPar ;
   private boolean[] T01885_n10456ResPar ;
   private String[] T01885_A10444ResColNom ;
   private boolean[] T01885_n10444ResColNom ;
   private int[] T01885_A10440ResCliCod ;
   private boolean[] T01885_n10440ResCliCod ;
   private String[] T01885_A396EmprCod ;
   private String[] T018821_A396EmprCod ;
   private int[] T018821_A10433ResCod ;
   private String[] T018822_A396EmprCod ;
   private int[] T018822_A10433ResCod ;
   private int[] T01884_A10433ResCod ;
   private String[] T01884_A10434ResTpo ;
   private boolean[] T01884_n10434ResTpo ;
   private byte[] T01884_A10435ResEst ;
   private boolean[] T01884_n10435ResEst ;
   private String[] T01884_A10436ResNum ;
   private boolean[] T01884_n10436ResNum ;
   private java.util.Date[] T01884_A10437ResFch ;
   private boolean[] T01884_n10437ResFch ;
   private java.util.Date[] T01884_A10438ResFchCmp ;
   private boolean[] T01884_n10438ResFchCmp ;
   private java.util.Date[] T01884_A10439ResFchMin ;
   private boolean[] T01884_n10439ResFchMin ;
   private int[] T01884_A10445ResColNum ;
   private boolean[] T01884_n10445ResColNum ;
   private byte[] T01884_A10446ResTipCol ;
   private boolean[] T01884_n10446ResTipCol ;
   private short[] T01884_A10448ResMatCod ;
   private boolean[] T01884_n10448ResMatCod ;
   private byte[] T01884_A10450ResIntCod ;
   private boolean[] T01884_n10450ResIntCod ;
   private java.math.BigDecimal[] T01884_A10452ResKgm ;
   private boolean[] T01884_n10452ResKgm ;
   private java.math.BigDecimal[] T01884_A10453ResMtr ;
   private boolean[] T01884_n10453ResMtr ;
   private int[] T01884_A10454ResPie ;
   private boolean[] T01884_n10454ResPie ;
   private String[] T01884_A10455ResUni ;
   private boolean[] T01884_n10455ResUni ;
   private byte[] T01884_A10456ResPar ;
   private boolean[] T01884_n10456ResPar ;
   private String[] T01884_A10444ResColNom ;
   private boolean[] T01884_n10444ResColNom ;
   private int[] T01884_A10440ResCliCod ;
   private boolean[] T01884_n10440ResCliCod ;
   private String[] T01884_A396EmprCod ;
   private String[] T018826_A10441ResCliNom ;
   private boolean[] T018826_n10441ResCliNom ;
   private String[] T018827_A10442ResArtCod ;
   private String[] T018828_A10443ResArtDsc ;
   private boolean[] T018828_n10443ResArtDsc ;
   private String[] T018829_A10447ResTipColD ;
   private boolean[] T018829_n10447ResTipColD ;
   private String[] T018830_A10449ResMatDsc ;
   private boolean[] T018830_n10449ResMatDsc ;
   private String[] T018831_A10451ResIntDsc ;
   private boolean[] T018831_n10451ResIntDsc ;
   private String[] T018832_A396EmprCod ;
   private int[] T018832_A10433ResCod ;
   private String[] T018832_A10457ResParCod ;
   private int[] T018832_A10464ResLin ;
   private String[] T018833_A396EmprCod ;
   private int[] T018833_A10433ResCod ;
   private int[] T018834_A10433ResCod ;
   private String[] T018834_A10457ResParCod ;
   private java.math.BigDecimal[] T018834_A10458ResParKgm ;
   private boolean[] T018834_n10458ResParKgm ;
   private java.math.BigDecimal[] T018834_A10459ResParMtr ;
   private boolean[] T018834_n10459ResParMtr ;
   private int[] T018834_A10460ResParPie ;
   private boolean[] T018834_n10460ResParPie ;
   private byte[] T018834_A10461ResAgr ;
   private boolean[] T018834_n10461ResAgr ;
   private int[] T018834_A10462ResAgrCod ;
   private boolean[] T018834_n10462ResAgrCod ;
   private String[] T018834_A10463ResAgrPar ;
   private boolean[] T018834_n10463ResAgrPar ;
   private String[] T018834_A396EmprCod ;
   private String[] T018835_A396EmprCod ;
   private int[] T018835_A10433ResCod ;
   private String[] T018835_A10457ResParCod ;
   private int[] T01883_A10433ResCod ;
   private String[] T01883_A10457ResParCod ;
   private java.math.BigDecimal[] T01883_A10458ResParKgm ;
   private boolean[] T01883_n10458ResParKgm ;
   private java.math.BigDecimal[] T01883_A10459ResParMtr ;
   private boolean[] T01883_n10459ResParMtr ;
   private int[] T01883_A10460ResParPie ;
   private boolean[] T01883_n10460ResParPie ;
   private byte[] T01883_A10461ResAgr ;
   private boolean[] T01883_n10461ResAgr ;
   private int[] T01883_A10462ResAgrCod ;
   private boolean[] T01883_n10462ResAgrCod ;
   private String[] T01883_A10463ResAgrPar ;
   private boolean[] T01883_n10463ResAgrPar ;
   private String[] T01883_A396EmprCod ;
   private int[] T01882_A10433ResCod ;
   private String[] T01882_A10457ResParCod ;
   private java.math.BigDecimal[] T01882_A10458ResParKgm ;
   private boolean[] T01882_n10458ResParKgm ;
   private java.math.BigDecimal[] T01882_A10459ResParMtr ;
   private boolean[] T01882_n10459ResParMtr ;
   private int[] T01882_A10460ResParPie ;
   private boolean[] T01882_n10460ResParPie ;
   private byte[] T01882_A10461ResAgr ;
   private boolean[] T01882_n10461ResAgr ;
   private int[] T01882_A10462ResAgrCod ;
   private boolean[] T01882_n10462ResAgrCod ;
   private String[] T01882_A10463ResAgrPar ;
   private boolean[] T01882_n10463ResAgrPar ;
   private String[] T01882_A396EmprCod ;
   private String[] T018839_A396EmprCod ;
   private int[] T018839_A10433ResCod ;
   private String[] T018839_A10457ResParCod ;
   private int[] T018839_A10464ResLin ;
   private String[] T018840_A396EmprCod ;
   private int[] T018840_A10433ResCod ;
   private String[] T018840_A10457ResParCod ;
   private String[] T018841_A407EmprNom ;
   private boolean[] T018841_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trespar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trespar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trespar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trespar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trespar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01882", "SELECT ResCod, ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod FROM TXPResPar WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?  FOR UPDATE OF ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01883", "SELECT ResCod, ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod FROM TXPResPar WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01884", "SELECT ResCod, ResTpo, ResEst, ResNum, ResFch, ResFchCmp, ResFchMin, ResColNum, ResTipCol, ResMatCod, ResIntCod, ResKgm, ResMtr, ResPie, ResUni, ResPar, ResColNom, ResCliCod, EmprCod FROM TXPResFil WHERE EmprCod = ? AND ResCod = ?  FOR UPDATE OF ResTpo, ResEst, ResNum, ResFch, ResFchCmp, ResFchMin, ResColNum, ResTipCol, ResMatCod, ResIntCod, ResKgm, ResMtr, ResPie, ResUni, ResPar, ResColNom, ResCliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01885", "SELECT ResCod, ResTpo, ResEst, ResNum, ResFch, ResFchCmp, ResFchMin, ResColNum, ResTipCol, ResMatCod, ResIntCod, ResKgm, ResMtr, ResPie, ResUni, ResPar, ResColNom, ResCliCod, EmprCod FROM TXPResFil WHERE EmprCod = ? AND ResCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01886", "SELECT CliNom AS ResArtCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01887", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01888", "SELECT COALESCE( CliNom, '') AS ResCliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01889", "SELECT COALESCE( ArtDsc, '') AS ResArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018810", "SELECT COALESCE( TipColDsc, '') AS ResTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018811", "SELECT COALESCE( MatDsc, '') AS ResMatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018812", "SELECT COALESCE( IntDsc, '') AS ResIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018813", "SELECT /*+ FIRST_ROWS(1) */ T8.IntCod, T7.MatCod, T6.TipColCod, T5.ArtCod, T3.CliCod, TM1.ResCod, T2.EmprNom, TM1.ResTpo, TM1.ResEst, TM1.ResNum, TM1.ResFch, TM1.ResFchCmp, TM1.ResFchMin, T4.CliNom AS ResArtCod, TM1.ResColNum, TM1.ResTipCol, TM1.ResMatCod, TM1.ResIntCod, TM1.ResKgm, TM1.ResMtr, TM1.ResPie, TM1.ResUni, TM1.ResPar, TM1.ResColNom AS ResColNom, TM1.ResCliCod AS ResCliCod, TM1.EmprCod, COALESCE( T3.CliNom, '') AS ResCliNom, COALESCE( T5.ArtDsc, '') AS ResArtDsc, COALESCE( T6.TipColDsc, '') AS ResTipColD, COALESCE( T7.MatDsc, '') AS ResMatDsc, COALESCE( T8.IntDsc, '') AS ResIntDsc FROM (((((((TXPResFil TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.ResCliCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.ResColNom AND T4.CliCod = TM1.ResCliCod) LEFT JOIN TXPARTICU T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.ResCliCod AND T5.ArtCod = T4.CliNom) LEFT JOIN TXPTIPCOL T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipColCod = TM1.ResTipCol) LEFT JOIN TXPMATICE T7 ON T7.EmprCod = TM1.EmprCod AND T7.MatCod = TM1.ResMatCod) LEFT JOIN TXPINTENS T8 ON T8.EmprCod = TM1.EmprCod AND T8.IntCod = TM1.ResIntCod) WHERE TM1.EmprCod = ? and TM1.ResCod = ? ORDER BY TM1.EmprCod, TM1.ResCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018814", "SELECT COALESCE( CliNom, '') AS ResCliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018815", "SELECT COALESCE( TipColDsc, '') AS ResTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018816", "SELECT COALESCE( MatDsc, '') AS ResMatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018817", "SELECT COALESCE( IntDsc, '') AS ResIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018818", "SELECT CliNom AS ResArtCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018819", "SELECT COALESCE( ArtDsc, '') AS ResArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018820", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ResCod FROM TXPResFil WHERE EmprCod = ? AND ResCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018821", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ResCod FROM TXPResFil WHERE EmprCod = ? and ResCod = ? ORDER BY EmprCod, ResCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018822", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ResCod FROM TXPResFil WHERE EmprCod = ? and ResCod = ? ORDER BY EmprCod DESC, ResCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018823", "INSERT INTO TXPResFil(ResCod, ResTpo, ResEst, ResNum, ResFch, ResFchCmp, ResFchMin, ResColNum, ResTipCol, ResMatCod, ResIntCod, ResKgm, ResMtr, ResPie, ResUni, ResPar, ResColNom, ResCliCod, EmprCod, ResDisCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPResFil")
         ,new UpdateCursor("T018824", "UPDATE TXPResFil SET ResTpo=?, ResEst=?, ResNum=?, ResFch=?, ResFchCmp=?, ResFchMin=?, ResColNum=?, ResTipCol=?, ResMatCod=?, ResIntCod=?, ResKgm=?, ResMtr=?, ResPie=?, ResUni=?, ResPar=?, ResColNom=?, ResCliCod=?  WHERE EmprCod = ? AND ResCod = ?", GX_NOMASK, "TXPResFil")
         ,new UpdateCursor("T018825", "DELETE FROM TXPResFil  WHERE EmprCod = ? AND ResCod = ?", GX_NOMASK, "TXPResFil")
         ,new ForEachCursor("T018826", "SELECT COALESCE( CliNom, '') AS ResCliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018827", "SELECT CliNom AS ResArtCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018828", "SELECT COALESCE( ArtDsc, '') AS ResArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018829", "SELECT COALESCE( TipColDsc, '') AS ResTipColD FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018830", "SELECT COALESCE( MatDsc, '') AS ResMatDsc FROM TXPMATICE WHERE EmprCod = ? AND MatCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018831", "SELECT COALESCE( IntDsc, '') AS ResIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018832", "SELECT * FROM (SELECT EmprCod, ResCod, ResParCod, ResLin FROM TXPResFas WHERE EmprCod = ? AND ResCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018833", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ResCod FROM TXPResFil WHERE EmprCod = ? and ResCod = ? ORDER BY EmprCod, ResCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018834", "SELECT ResCod, ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? and ResParCod = ? ORDER BY EmprCod, ResCod, ResParCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018835", "SELECT EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018836", "INSERT INTO TXPResPar(ResCod, ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPResPar")
         ,new UpdateCursor("T018837", "UPDATE TXPResPar SET ResParKgm=?, ResParMtr=?, ResParPie=?, ResAgr=?, ResAgrCod=?, ResAgrPar=?  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?", GX_NOMASK, "TXPResPar")
         ,new UpdateCursor("T018838", "DELETE FROM TXPResPar  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?", GX_NOMASK, "TXPResPar")
         ,new ForEachCursor("T018839", "SELECT * FROM (SELECT EmprCod, ResCod, ResParCod, ResLin FROM TXPResFas WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018840", "SELECT EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? ORDER BY EmprCod, ResCod, ResParCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018841", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 30);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(23);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(25);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(26, 3);
               ((String[]) buf[44])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 39 :
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 30);
               return;
            case 8 :
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
            case 9 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 30);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 3);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[34]).intValue());
               }
               stmt.setString(19, (String)parms[35], 3);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
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
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 3);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[33]).intValue());
               }
               stmt.setString(18, (String)parms[34], 3);
               stmt.setInt(19, ((Number) parms[35]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
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
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 30);
               return;
            case 27 :
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
            case 28 :
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
            case 29 :
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 1);
               }
               stmt.setString(9, (String)parms[14], 3);
               return;
            case 35 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

