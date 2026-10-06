package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinccar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4032CCOpeCod = (int)(GXutil.lval( httpContext.GetPar( "CCOpeCod"))) ;
         n4032CCOpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         AV45OpeNom = httpContext.GetPar( "OpeNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45OpeNom", AV45OpeNom);
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_3_101619( A396EmprCod, A4032CCOpeCod, AV45OpeNom, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV47ForTonal = httpContext.GetPar( "ForTonal") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ForTonal", AV47ForTonal);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_101619( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV47ForTonal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4035CCVal = httpContext.GetPar( "CCVal") ;
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         AV31Ok = (byte)(GXutil.lval( httpContext.GetPar( "Ok"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Ok", GXutil.str( AV31Ok, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_101620( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, A4031CCTCod, A4035CCVal, A4034CCTLin, AV31Ok) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV59Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV29Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
         AV58Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Inc_obs", AV58Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A4035CCVal = httpContext.GetPar( "CCVal") ;
         AV57OldCcVal = httpContext.GetPar( "OldCcVal") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57OldCcVal", AV57OldCcVal);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_101620( A396EmprCod, AV59Pgmname, AV8UsurCod, AV29Station, AV58Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A4035CCVal, AV57OldCcVal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"CCTVALD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asacctvald101620( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            AV35BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarKgm", GXutil.ltrimstr( AV35BarKgm, 9, 2));
            AV36BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarMtr", GXutil.ltrimstr( AV36BarMtr, 9, 2));
            AV37BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarPie), 6, 0));
            AV43DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43DisCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA CONTROLES CALIDAD", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCOpeCod_Internalname ;
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
      nRC_GXsfl_220 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_220"))) ;
      nGXsfl_220_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_220_idx"))) ;
      sGXsfl_220_idx = httpContext.GetPar( "sGXsfl_220_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tinccar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tinccar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinccar_impl.class ));
   }

   public tinccar_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e111012 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TInCCar.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", edtProCod_Visible, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", edtBarOrdLin_Visible, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFch_Internalname, localUtil.format(A4033CCFch, "99/99/99"), localUtil.format( A4033CCFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFch_Jsonclick, 0, "", "", "", "", "", 1, edtCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TInCCar.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Disparador", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcDisp_Internalname, GXutil.rtrim( A4405CcDisp), GXutil.rtrim( localUtil.format( A4405CcDisp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcDisp_Jsonclick, 0, "", "", "", "", "", 1, edtCcDisp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Obs", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCcObs_Internalname, A3281CcObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtCcObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", edtFasCod_Visible, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", edtFasDsc_Visible, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", edtProDsc_Visible, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Descripción del Test", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca_Jsonclick, 0, "", "", "", "", "", 1, edtBarGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Gramaje Acabado 2", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca2_Jsonclick, 0, "", "", "", "", "", 1, edtBarGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncAnh_Enabled!=0) ? localUtil.format( A1224BarEncAnh, "999.99") : localUtil.format( A1224BarEncAnh, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncAnh_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncCom_Enabled!=0) ? localUtil.format( A1223BarEncCom, "999.99") : localUtil.format( A1223BarEncCom, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCom_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Rendimiento en Acabado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarRdoA_Enabled!=0) ? localUtil.format( A1911BarRdoA, "ZZ9.99") : localUtil.format( A1911BarRdoA, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRdoA_Jsonclick, 0, "", "", "", "", "", 1, edtBarRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ancho Acabado 1", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca1_Jsonclick, 0, "", "", "", "", "", 1, edtBarAncAca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ancho Acabado 2", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca2_Jsonclick, 0, "", "", "", "", "", 1, edtBarAncAca2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Fecha Disposicion Cliente", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtBarFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecCli_Internalname, localUtil.format(A155BarFecCli, "99/99/99"), localUtil.format( A155BarFecCli, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TInCCar.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Coste Produccion", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosPro_Internalname, GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosPro_Enabled!=0) ? localUtil.format( A141BarCosPro, "ZZZZZZ9.99") : localUtil.format( A141BarCosPro, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosPro_Jsonclick, 0, "", "", "", "", "", 1, edtBarCosPro_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Coste Añadidas", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosAny_Internalname, GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosAny_Enabled!=0) ? localUtil.format( A140BarCosAny, "ZZZZZZ9.99") : localUtil.format( A140BarCosAny, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosAny_Jsonclick, 0, "", "", "", "", "", 1, edtBarCosAny_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Fecha Utilzacion", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCFchUti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFchUti_Internalname, localUtil.format(A7691CCFchUti, "99/99/99"), localUtil.format( A7691CCFchUti, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFchUti_Jsonclick, 0, "", "", "", "", "", 1, edtCCFchUti_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFchUti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFchUti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TInCCar.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Observaciones en Grm2", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarObsGrm_Internalname, GXutil.rtrim( A5351BarObsGrm), GXutil.rtrim( localUtil.format( A5351BarObsGrm, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarObsGrm_Jsonclick, 0, "", "", "", "", "", 1, edtBarObsGrm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Observaciones en Ancho Final", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarObsAnc_Internalname, GXutil.rtrim( A5352BarObsAnc), GXutil.rtrim( localUtil.format( A5352BarObsAnc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarObsAnc_Jsonclick, 0, "", "", "", "", "", 1, edtBarObsAnc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Ultimo Test", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcUltn_Internalname, GXutil.ltrim( localUtil.ntoc( A11293CcUltn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcUltn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11293CcUltn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11293CcUltn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcUltn_Jsonclick, 0, "", "", "", "", "", 1, edtCcUltn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'OBSERVACIONES\\'."+"'", "", "TextBlock", 5, "", 1, 1, 0, (short)(0), "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCCobs2_Internalname, A11628CCobs2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", (short)(0), 1, edtCCobs2_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TInCCar.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol220( ) ;
      nGXsfl_220_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount620 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_620 = (short)(1) ;
            scanStart101620( ) ;
            while ( RcdFound620 != 0 )
            {
               init_level_properties620( ) ;
               getByPrimaryKey101620( ) ;
               addRow101620( ) ;
               scanNext101620( ) ;
            }
            scanEnd101620( ) ;
            nBlankRcdCount620 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal101620( ) ;
         standaloneModal101620( ) ;
         sMode620 = Gx_mode ;
         while ( nGXsfl_220_idx < nRC_GXsfl_220 )
         {
            bGXsfl_220_Refreshing = true ;
            readRow101620( ) ;
            edtavnRcdDeleted_620_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_620_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_620_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_620_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtCCTValD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            if ( ( nRcdExists_620 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal101620( ) ;
            }
            sendRow101620( ) ;
            bGXsfl_220_Refreshing = false ;
         }
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount620 = (short)(5) ;
         nRcdExists_620 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart101620( ) ;
            while ( RcdFound620 != 0 )
            {
               sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_220620( ) ;
               init_level_properties620( ) ;
               standaloneNotModal101620( ) ;
               getByPrimaryKey101620( ) ;
               standaloneModal101620( ) ;
               addRow101620( ) ;
               scanNext101620( ) ;
            }
            scanEnd101620( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode620 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_220620( ) ;
      initAll101620( ) ;
      init_level_properties620( ) ;
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
      nBlankRcdCount620 = (short)(nBlankRcdUsr620+nBlankRcdCount620) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount620 > 0 )
      {
         standaloneNotModal101620( ) ;
         standaloneModal101620( ) ;
         addRow101620( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCVal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount620 = (short)(nBlankRcdCount620-1) ;
      }
      Gx_mode = sMode620 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TInCCar.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TInCCar.htm");
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
      e121012 ();
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
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7691CCFchUti = localUtil.ctod( httpContext.cgiGet( "Z7691CCFchUti"), 0) ;
            Z4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4032CCOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4033CCFch = localUtil.ctod( httpContext.cgiGet( "Z4033CCFch"), 0) ;
            Z4405CcDisp = httpContext.cgiGet( "Z4405CcDisp") ;
            Z3281CcObs = httpContext.cgiGet( "Z3281CcObs") ;
            Z11293CcUltn = (short)(localUtil.ctol( httpContext.cgiGet( "Z11293CcUltn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11628CCobs2 = httpContext.cgiGet( "Z11628CCobs2") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_220 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_220"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45OpeNom = httpContext.cgiGet( "vOPENOM") ;
            AV47ForTonal = httpContext.cgiGet( "vFORTONAL") ;
            AV59Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV57OldCcVal = httpContext.cgiGet( "vOLDCCVAL") ;
            AV58Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV31Ok = (byte)(localUtil.ctol( httpContext.cgiGet( "vOK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV29Station = httpContext.cgiGet( "vSTATION") ;
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
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4032CCOpeCod = 0 ;
               n4032CCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            }
            else
            {
               A4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4032CCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtCCFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4033CCFch = GXutil.nullDate() ;
               n4033CCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            }
            else
            {
               A4033CCFch = localUtil.ctod( httpContext.cgiGet( edtCCFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4033CCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
            }
            A4405CcDisp = httpContext.cgiGet( edtCcDisp_Internalname) ;
            n4405CcDisp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
            A3281CcObs = httpContext.cgiGet( edtCcObs_Internalname) ;
            n3281CcObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
            A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
            A3137BarGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
            A1224BarEncAnh = localUtil.ctond( httpContext.cgiGet( edtBarEncAnh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
            A1223BarEncCom = localUtil.ctond( httpContext.cgiGet( edtBarEncCom_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
            A1911BarRdoA = localUtil.ctond( httpContext.cgiGet( edtBarRdoA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
            A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
            A126BarAncAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A155BarFecCli = localUtil.ctod( httpContext.cgiGet( edtBarFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
            A141BarCosPro = localUtil.ctond( httpContext.cgiGet( edtBarCosPro_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
            A140BarCosAny = localUtil.ctond( httpContext.cgiGet( edtBarCosAny_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            if ( localUtil.vcdate( httpContext.cgiGet( edtCCFchUti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCFCHUTI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCFchUti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7691CCFchUti = GXutil.nullDate() ;
               n7691CCFchUti = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
            }
            else
            {
               A7691CCFchUti = localUtil.ctod( httpContext.cgiGet( edtCCFchUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n7691CCFchUti = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A5351BarObsGrm = httpContext.cgiGet( edtBarObsGrm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
            A5352BarObsAnc = httpContext.cgiGet( edtBarObsAnc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCULTN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCcUltn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11293CcUltn = (short)(0) ;
               n11293CcUltn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
            }
            else
            {
               A11293CcUltn = (short)(localUtil.ctol( httpContext.cgiGet( edtCcUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11293CcUltn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
            }
            A11628CCobs2 = httpContext.cgiGet( edtCCobs2_Internalname) ;
            n11628CCobs2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11628CCobs2", A11628CCobs2);
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
                     if ( GXutil.strcmp(sEvt, "'OBSERVACIONES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Observaciones' */
                        e131012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e121012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver' */
                        e141012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'NOVO CONTROLO?'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Novo Controlo?' */
                        e151012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER CONTROLES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver Controles' */
                        e161012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111012 ();
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
            initAll101619( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_620_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_620_Enabled), 5, 0), !bGXsfl_220_Refreshing);
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
      disableAttributes101619( ) ;
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

   public void confirm_1010( )
   {
      beforeValidate101619( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls101619( ) ;
         }
         else
         {
            checkExtendedTable101619( ) ;
            if ( AnyError == 0 )
            {
               zm101619( 16) ;
               zm101619( 17) ;
               zm101619( 18) ;
               zm101619( 19) ;
               zm101619( 20) ;
               zm101619( 21) ;
               zm101619( 22) ;
            }
            closeExtendedTableCursors101619( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode619 = Gx_mode ;
         confirm_101620( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode619 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1010( ) ;
      }
   }

   public void confirm_101620( )
   {
      nGXsfl_220_idx = 0 ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         readRow101620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            getKey101620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               if ( RcdFound620 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate101620( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable101620( ) ;
                     if ( AnyError == 0 )
                     {
                        zm101620( 24) ;
                     }
                     closeExtendedTableCursors101620( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
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
               if ( RcdFound620 != 0 )
               {
                  if ( nRcdDeleted_620 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey101620( ) ;
                     load101620( ) ;
                     beforeValidate101620( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls101620( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate101620( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable101620( ) ;
                           if ( AnyError == 0 )
                           {
                              zm101620( 24) ;
                           }
                           closeExtendedTableCursors101620( ) ;
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
                  if ( nRcdDeleted_620 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_620_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCTValD_Internalname, A5627CCTValD) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_220_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "T4035CCVal_"+sGXsfl_220_idx, GXutil.rtrim( O4035CCVal)) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_620_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1010( )
   {
   }

   public void e121012( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV30EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char1, GXv_char2, GXv_char3) ;
      tinccar_impl.this.A396EmprCod = GXv_char1[0] ;
      tinccar_impl.this.AV30EmprNom = GXv_char2[0] ;
      tinccar_impl.this.AV8UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprNom", AV30EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char4 = AV7Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV7Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char4 = AV9LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV9LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char4 = AV10Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV59Pgmname, (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV10Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char4 = AV22Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV22Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char4 = AV23Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char4 = AV24Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char4 = AV25Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV25Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      GXt_char4 = AV26Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN136_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV26Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char4 = AV27Lit8 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV27Lit8 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit8", AV27Lit8);
      GXt_char4 = AV28Lit9 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV28Lit9 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit9", AV28Lit9);
      GXt_char4 = AV11Lit10 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1102_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV11Lit10 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lit10", AV11Lit10);
      GXt_char4 = AV12Lit11 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV12Lit11 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lit11", AV12Lit11);
      GXt_char4 = AV13Lit12 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN461_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV13Lit12 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit12", AV13Lit12);
      GXt_char4 = AV16Lit15 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT12_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV16Lit15 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit15", AV16Lit15);
      GXt_char4 = AV18Lit17 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN263", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV18Lit17 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit17", AV18Lit17);
      GXt_char4 = AV33Lit40 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT12_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV33Lit40 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit40", AV33Lit40);
      GXt_char4 = AV34Lit41 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT13_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV34Lit41 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit41", AV34Lit41);
      GXt_char4 = AV19Lit18 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN436_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit18 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit18", AV19Lit18);
      GXt_char4 = AV38Lit45 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV38Lit45 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit45", AV38Lit45);
      GXt_char4 = AV14Lit13 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV14Lit13 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit13", AV14Lit13);
      GXt_char4 = AV15Lit14 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV15Lit14 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit14", AV15Lit14);
      GXt_char4 = AV17Lit16 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV17Lit16 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit16", AV17Lit16);
      GXt_char4 = AV41Lit47 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT12_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV41Lit47 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit47", AV41Lit47);
      GXt_char4 = AV42Lit48 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT13_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV42Lit48 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit48", AV42Lit48);
      GXt_char4 = AV39Lit63 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2003_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV39Lit63 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit63", AV39Lit63);
      GXt_char4 = AV40Lit30 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1024_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV40Lit30 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit30", AV40Lit30);
      GXt_char4 = AV44Lit80 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1045_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV44Lit80 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lit80", AV44Lit80);
      GXt_char4 = AV46Lit73 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV46Lit73 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Lit73", AV46Lit73);
      GXt_char4 = AV48Lit81 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT558_", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV48Lit81 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lit81", AV48Lit81);
      GXt_char4 = AV49Lit82 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV49Lit82 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lit82", AV49Lit82);
      edtProCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Visible), 5, 0), true);
      edtProDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Visible), 5, 0), true);
      edtBarOrdLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), true);
      edtFasCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), true);
      edtFasDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), true);
      GXt_char4 = AV53Lit400 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "INCCAR0000", ""), (byte)(99), GXv_char3) ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      AV53Lit400 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Lit400", AV53Lit400);
   }

   public void e141012( )
   {
      /* 'Ver' Routine */
      returnInSub = false ;
      GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
      GXv_char2[0] = httpContext.getMessage( "Original", "") ;
      new app.rhdrcarv(remoteHandle, context).execute( "", A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV54ImpCod, GXv_char3, GXv_char2) ;
   }

   public void e131012( )
   {
      /* 'Observaciones' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e151012( )
   {
      /* 'Novo Controlo?' Routine */
      returnInSub = false ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_char1[0] = A758ProCod ;
      GXv_int7[0] = A194BarOrdLin ;
      GXv_int8[0] = A4031CCTCod ;
      GXv_int9[0] = AV50Nt ;
      GXv_int10[0] = AV51Nval ;
      new app.pccnval(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_char1, GXv_int7, GXv_int8, GXv_int9, GXv_int10) ;
      tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
      tinccar_impl.this.A129BarCod = GXv_int5[0] ;
      tinccar_impl.this.A132BarCodReo = GXv_int6[0] ;
      tinccar_impl.this.A130BarCodPar = GXv_char2[0] ;
      tinccar_impl.this.A758ProCod = GXv_char1[0] ;
      tinccar_impl.this.A194BarOrdLin = GXv_int7[0] ;
      tinccar_impl.this.A4031CCTCod = GXv_int8[0] ;
      tinccar_impl.this.AV50Nt = GXv_int9[0] ;
      tinccar_impl.this.AV51Nval = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Nt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Nt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV51Nval", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Nval), 6, 0));
      if ( ( AV50Nt > 0 ) && ( AV51Nval == 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Atençao.Este código, não tem qualquer valor acrescentado", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Não é possível criar um novo controle ¡¡¡", "") + GXutil.chr( (short)(13)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         GX_FocusControl = edtCcObs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         Gx_msg = httpContext.getMessage( "Quer criar um novo controle?", "") ;
         GXutil.Confirmed = true;
         if ( GXutil.Confirmed )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int10[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_char1[0] = A758ProCod ;
            GXv_int7[0] = A194BarOrdLin ;
            GXv_int9[0] = A4031CCTCod ;
            new app.pccn(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_int6, GXv_char2, GXv_char1, GXv_int7, GXv_int9, AV55Tab_lin, AV56Tab_val) ;
            tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
            tinccar_impl.this.A129BarCod = GXv_int10[0] ;
            tinccar_impl.this.A132BarCodReo = GXv_int6[0] ;
            tinccar_impl.this.A130BarCodPar = GXv_char2[0] ;
            tinccar_impl.this.A758ProCod = GXv_char1[0] ;
            tinccar_impl.this.A194BarOrdLin = GXv_int7[0] ;
            tinccar_impl.this.A4031CCTCod = GXv_int9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            GX_FocusControl = edtCcObs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e161012( )
   {
      /* 'Ver Controles' Routine */
      returnInSub = false ;
      if ( A11293CcUltn > 0 )
      {
      }
      /*  Sending Event outputs  */
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111012 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111012( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_char1[0] = A758ProCod ;
      GXv_int7[0] = A194BarOrdLin ;
      GXv_int9[0] = A4031CCTCod ;
      new app.plock35(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_int6, GXv_char2, GXv_char1, GXv_int7, GXv_int9) ;
      tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
      tinccar_impl.this.A129BarCod = GXv_int10[0] ;
      tinccar_impl.this.A132BarCodReo = GXv_int6[0] ;
      tinccar_impl.this.A130BarCodPar = GXv_char2[0] ;
      tinccar_impl.this.A758ProCod = GXv_char1[0] ;
      tinccar_impl.this.A194BarOrdLin = GXv_int7[0] ;
      tinccar_impl.this.A4031CCTCod = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A758ProCod,Short.valueOf(A194BarOrdLin),Integer.valueOf(A4031CCTCod),AV35BarKgm,AV36BarMtr,Integer.valueOf(AV37BarPie),Integer.valueOf(AV43DisCod)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A194BarOrdLin","A4031CCTCod","AV35BarKgm","AV36BarMtr","AV37BarPie","AV43DisCod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm101619( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7691CCFchUti = T01016_A7691CCFchUti[0] ;
            Z4032CCOpeCod = T01016_A4032CCOpeCod[0] ;
            Z4033CCFch = T01016_A4033CCFch[0] ;
            Z4405CcDisp = T01016_A4405CcDisp[0] ;
            Z3281CcObs = T01016_A3281CcObs[0] ;
            Z11293CcUltn = T01016_A11293CcUltn[0] ;
            Z11628CCobs2 = T01016_A11628CCobs2[0] ;
         }
         else
         {
            Z7691CCFchUti = A7691CCFchUti ;
            Z4032CCOpeCod = A4032CCOpeCod ;
            Z4033CCFch = A4033CCFch ;
            Z4405CcDisp = A4405CcDisp ;
            Z3281CcObs = A3281CcObs ;
            Z11293CcUltn = A11293CcUltn ;
            Z11628CCobs2 = A11628CCobs2 ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z7691CCFchUti = A7691CCFchUti ;
         Z4032CCOpeCod = A4032CCOpeCod ;
         Z4033CCFch = A4033CCFch ;
         Z4405CcDisp = A4405CcDisp ;
         Z3281CcObs = A3281CcObs ;
         Z11293CcUltn = A11293CcUltn ;
         Z11628CCobs2 = A11628CCobs2 ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z407EmprNom = A407EmprNom ;
         Z1909BarGraAca = A1909BarGraAca ;
         Z3137BarGraAca2 = A3137BarGraAca2 ;
         Z1224BarEncAnh = A1224BarEncAnh ;
         Z1223BarEncCom = A1223BarEncCom ;
         Z1911BarRdoA = A1911BarRdoA ;
         Z125BarAncAca1 = A125BarAncAca1 ;
         Z126BarAncAca2 = A126BarAncAca2 ;
         Z143BarDisNum = A143BarDisNum ;
         Z155BarFecCli = A155BarFecCli ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z1235BarNumCli = A1235BarNumCli ;
         Z141BarCosPro = A141BarCosPro ;
         Z140BarCosAny = A140BarCosAny ;
         Z212BarSer = A212BarSer ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z5351BarObsGrm = A5351BarObsGrm ;
         Z5352BarObsAnc = A5352BarObsAnc ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z759ProDsc = A759ProDsc ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z4036CCTDsc = A4036CCTDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV59Pgmname = "TInCCar" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      /* Using cursor T01017 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01017_A407EmprNom[0] ;
      n407EmprNom = T01017_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01018 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1909BarGraAca = T01018_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = T01018_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = T01018_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = T01018_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = T01018_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = T01018_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = T01018_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A143BarDisNum = T01018_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A155BarFecCli = T01018_A155BarFecCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      A135BarColNom = T01018_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01018_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = T01018_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T01018_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A141BarCosPro = T01018_A141BarCosPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
      A140BarCosAny = T01018_A140BarCosAny[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
      A212BarSer = T01018_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A4812BarEncCli = T01018_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A5351BarObsGrm = T01018_A5351BarObsGrm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
      A5352BarObsAnc = T01018_A5352BarObsAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
      A252CliCod = T01018_A252CliCod[0] ;
      n252CliCod = T01018_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(6);
      /* Using cursor T010113 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T010113_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(11);
      if ( true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int10[0] = A4032CCOpeCod ;
         GXv_char2[0] = AV45OpeNom ;
         new app.pnrcope(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_char2) ;
         tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
         tinccar_impl.this.A4032CCOpeCod = GXv_int10[0] ;
         tinccar_impl.this.AV45OpeNom = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45OpeNom", AV45OpeNom);
      }
      if ( true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char1[0] = AV47ForTonal ;
         new app.pbuscar(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_int6, GXv_char2, GXv_char1) ;
         tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
         tinccar_impl.this.A129BarCod = GXv_int10[0] ;
         tinccar_impl.this.A132BarCodReo = GXv_int6[0] ;
         tinccar_impl.this.A130BarCodPar = GXv_char2[0] ;
         tinccar_impl.this.AV47ForTonal = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV47ForTonal", AV47ForTonal);
      }
      /* Using cursor T01019 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T01019_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(7);
      /* Using cursor T010110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      A457FasCod = T010110_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      pr_default.close(8);
      /* Using cursor T010112 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T010112_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(10);
      /* Using cursor T010111 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A4036CCTDsc = T010111_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(9);
   }

   public void standaloneModal( )
   {
      A7691CCFchUti = GXutil.today( ) ;
      n7691CCFchUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
      if ( isDlt( )  && true /* Level */ )
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

   public void load101619( )
   {
      /* Using cursor T010114 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A7691CCFchUti = T010114_A7691CCFchUti[0] ;
         n7691CCFchUti = T010114_n7691CCFchUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
         A407EmprNom = T010114_A407EmprNom[0] ;
         n407EmprNom = T010114_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4032CCOpeCod = T010114_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T010114_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T010114_A4033CCFch[0] ;
         n4033CCFch = T010114_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T010114_A4405CcDisp[0] ;
         n4405CcDisp = T010114_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T010114_A3281CcObs[0] ;
         n3281CcObs = T010114_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A460FasDsc = T010114_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A759ProDsc = T010114_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4036CCTDsc = T010114_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A1909BarGraAca = T010114_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A3137BarGraAca2 = T010114_A3137BarGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A1224BarEncAnh = T010114_A1224BarEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A1223BarEncCom = T010114_A1223BarEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1911BarRdoA = T010114_A1911BarRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A125BarAncAca1 = T010114_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A126BarAncAca2 = T010114_A126BarAncAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A143BarDisNum = T010114_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A155BarFecCli = T010114_A155BarFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
         A135BarColNom = T010114_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T010114_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A1234BarNomCli = T010114_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A1235BarNumCli = T010114_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A141BarCosPro = T010114_A141BarCosPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
         A140BarCosAny = T010114_A140BarCosAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
         A212BarSer = T010114_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A4812BarEncCli = T010114_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A279CliNom = T010114_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5351BarObsGrm = T010114_A5351BarObsGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
         A5352BarObsAnc = T010114_A5352BarObsAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
         A11293CcUltn = T010114_A11293CcUltn[0] ;
         n11293CcUltn = T010114_n11293CcUltn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
         A11628CCobs2 = T010114_A11628CCobs2[0] ;
         n11628CCobs2 = T010114_n11628CCobs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11628CCobs2", A11628CCobs2);
         A457FasCod = T010114_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A252CliCod = T010114_A252CliCod[0] ;
         n252CliCod = T010114_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm101619( -15) ;
      }
      pr_default.close(12);
      onLoadActions101619( ) ;
   }

   public void onLoadActions101619( )
   {
   }

   public void checkExtendedTable101619( )
   {
      nIsDirty_619 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors101619( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey101619( )
   {
      /* Using cursor T010115 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      else
      {
         RcdFound619 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01016 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01016_A129BarCod[0] == A129BarCod ) && ( T01016_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01016_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01016_A758ProCod[0], A758ProCod) == 0 ) && ( T01016_A194BarOrdLin[0] == A194BarOrdLin ) && ( T01016_A4031CCTCod[0] == A4031CCTCod ) )
      {
         zm101619( 15) ;
         RcdFound619 = (short)(1) ;
         A7691CCFchUti = T01016_A7691CCFchUti[0] ;
         n7691CCFchUti = T01016_n7691CCFchUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
         A4032CCOpeCod = T01016_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T01016_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T01016_A4033CCFch[0] ;
         n4033CCFch = T01016_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T01016_A4405CcDisp[0] ;
         n4405CcDisp = T01016_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T01016_A3281CcObs[0] ;
         n3281CcObs = T01016_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A11293CcUltn = T01016_A11293CcUltn[0] ;
         n11293CcUltn = T01016_n11293CcUltn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
         A11628CCobs2 = T01016_A11628CCobs2[0] ;
         n11628CCobs2 = T01016_n11628CCobs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11628CCobs2", A11628CCobs2);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load101619( ) ;
         if ( AnyError == 1 )
         {
            RcdFound619 = (short)(0) ;
            initializeNonKey101619( ) ;
         }
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound619 = (short)(0) ;
         initializeNonKey101619( ) ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey101619( ) ;
      if ( RcdFound619 == 0 )
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
      RcdFound619 = (short)(0) ;
      /* Using cursor T010116 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T010116_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010116_A129BarCod[0] == A129BarCod ) && ( T010116_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010116_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010116_A758ProCod[0], A758ProCod) == 0 ) && ( T010116_A194BarOrdLin[0] == A194BarOrdLin ) && ( T010116_A4031CCTCod[0] == A4031CCTCod ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T010116_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010116_A129BarCod[0] == A129BarCod ) && ( T010116_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010116_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010116_A758ProCod[0], A758ProCod) == 0 ) && ( T010116_A194BarOrdLin[0] == A194BarOrdLin ) && ( T010116_A4031CCTCod[0] == A4031CCTCod ) )
         {
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound619 = (short)(0) ;
      /* Using cursor T010117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T010117_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010117_A129BarCod[0] == A129BarCod ) && ( T010117_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010117_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010117_A758ProCod[0], A758ProCod) == 0 ) && ( T010117_A194BarOrdLin[0] == A194BarOrdLin ) && ( T010117_A4031CCTCod[0] == A4031CCTCod ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T010117_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010117_A129BarCod[0] == A129BarCod ) && ( T010117_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T010117_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T010117_A758ProCod[0], A758ProCod) == 0 ) && ( T010117_A194BarOrdLin[0] == A194BarOrdLin ) && ( T010117_A4031CCTCod[0] == A4031CCTCod ) )
         {
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey101619( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert101619( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound619 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update101619( ) ;
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert101619( ) ;
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
                  GX_FocusControl = edtCCOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert101619( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
         GX_FocusControl = edtCCOpeCod_Internalname ;
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
      getKey101619( ) ;
      if ( RcdFound619 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tinccar");
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1010( ) ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart101619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd101619( ) ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      scanStart101619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound619 != 0 )
         {
            scanNext101619( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd101619( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency101619( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01015 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z7691CCFchUti), GXutil.resetTime(T01015_A7691CCFchUti[0])) ) || ( Z4032CCOpeCod != T01015_A4032CCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01015_A4033CCFch[0])) ) || ( GXutil.strcmp(Z4405CcDisp, T01015_A4405CcDisp[0]) != 0 ) || ( GXutil.strcmp(Z3281CcObs, T01015_A3281CcObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11293CcUltn != T01015_A11293CcUltn[0] ) || ( GXutil.strcmp(Z11628CCobs2, T01015_A11628CCobs2[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7691CCFchUti), GXutil.resetTime(T01015_A7691CCFchUti[0])) ) )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CCFchUti");
               GXutil.writeLogRaw("Old: ",Z7691CCFchUti);
               GXutil.writeLogRaw("Current: ",T01015_A7691CCFchUti[0]);
            }
            if ( Z4032CCOpeCod != T01015_A4032CCOpeCod[0] )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CCOpeCod");
               GXutil.writeLogRaw("Old: ",Z4032CCOpeCod);
               GXutil.writeLogRaw("Current: ",T01015_A4032CCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T01015_A4033CCFch[0])) ) )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CCFch");
               GXutil.writeLogRaw("Old: ",Z4033CCFch);
               GXutil.writeLogRaw("Current: ",T01015_A4033CCFch[0]);
            }
            if ( GXutil.strcmp(Z4405CcDisp, T01015_A4405CcDisp[0]) != 0 )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CcDisp");
               GXutil.writeLogRaw("Old: ",Z4405CcDisp);
               GXutil.writeLogRaw("Current: ",T01015_A4405CcDisp[0]);
            }
            if ( GXutil.strcmp(Z3281CcObs, T01015_A3281CcObs[0]) != 0 )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CcObs");
               GXutil.writeLogRaw("Old: ",Z3281CcObs);
               GXutil.writeLogRaw("Current: ",T01015_A3281CcObs[0]);
            }
            if ( Z11293CcUltn != T01015_A11293CcUltn[0] )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CcUltn");
               GXutil.writeLogRaw("Old: ",Z11293CcUltn);
               GXutil.writeLogRaw("Current: ",T01015_A11293CcUltn[0]);
            }
            if ( GXutil.strcmp(Z11628CCobs2, T01015_A11628CCobs2[0]) != 0 )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CCobs2");
               GXutil.writeLogRaw("Old: ",Z11628CCobs2);
               GXutil.writeLogRaw("Current: ",T01015_A11628CCobs2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert101619( )
   {
      beforeValidate101619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable101619( ) ;
      }
      if ( AnyError == 0 )
      {
         zm101619( 0) ;
         checkOptimisticConcurrency101619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm101619( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert101619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010118 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n7691CCFchUti), A7691CCFchUti, Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), Boolean.valueOf(n11628CCobs2), A11628CCobs2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
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
                        processLevel101619( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1010( ) ;
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
            load101619( ) ;
         }
         endLevel101619( ) ;
      }
      closeExtendedTableCursors101619( ) ;
   }

   public void update101619( )
   {
      beforeValidate101619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable101619( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency101619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm101619( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate101619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010119 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n7691CCFchUti), A7691CCFchUti, Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), Boolean.valueOf(n11628CCobs2), A11628CCobs2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate101619( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel101619( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1010( ) ;
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
         endLevel101619( ) ;
      }
      closeExtendedTableCursors101619( ) ;
   }

   public void deferredUpdate101619( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate101619( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency101619( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls101619( ) ;
         afterConfirm101619( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete101619( ) ;
            if ( AnyError == 0 )
            {
               scanStart101620( ) ;
               while ( RcdFound620 != 0 )
               {
                  getByPrimaryKey101620( ) ;
                  delete101620( ) ;
                  scanNext101620( ) ;
               }
               scanEnd101620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010120 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound619 == 0 )
                        {
                           initAll101619( ) ;
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
                        resetCaption1010( ) ;
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
      sMode619 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel101619( ) ;
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls101619( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T010121 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Nveces Test", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel101620( )
   {
      nGXsfl_220_idx = 0 ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         readRow101620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            standaloneNotModal101620( ) ;
            getKey101620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert101620( ) ;
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( ( nRcdDeleted_620 != 0 ) && ( nRcdExists_620 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete101620( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update101620( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_620 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_620_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCTValD_Internalname, A5627CCTValD) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_220_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "T4035CCVal_"+sGXsfl_220_idx, GXutil.rtrim( O4035CCVal)) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_620_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll101620( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
   }

   public void processLevel101619( )
   {
      /* Save parent mode. */
      sMode619 = Gx_mode ;
      processNestedLevel101620( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel101619( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete101619( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tinccar");
         if ( AnyError == 0 )
         {
            confirmValues1010( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tinccar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart101619( )
   {
      /* Scan By routine */
      /* Using cursor T010122 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext101619( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
   }

   public void scanEnd101619( )
   {
      pr_default.close(20);
   }

   public void afterConfirm101619( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert101619( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate101619( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete101619( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete101619( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate101619( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes101619( )
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
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOpeCod_Enabled), 5, 0), true);
      edtCCFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFch_Enabled), 5, 0), true);
      edtCcDisp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcDisp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcDisp_Enabled), 5, 0), true);
      edtCcObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcObs_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      edtBarGraAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca2_Enabled), 5, 0), true);
      edtBarEncAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncAnh_Enabled), 5, 0), true);
      edtBarEncCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCom_Enabled), 5, 0), true);
      edtBarRdoA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRdoA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRdoA_Enabled), 5, 0), true);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarAncAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca2_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtBarFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), true);
      edtBarCosPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPro_Enabled), 5, 0), true);
      edtBarCosAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAny_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), true);
      edtCCFchUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFchUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFchUti_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarObsGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarObsGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsGrm_Enabled), 5, 0), true);
      edtBarObsAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarObsAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsAnc_Enabled), 5, 0), true);
      edtCcUltn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcUltn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcUltn_Enabled), 5, 0), true);
      edtCCobs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCobs2_Enabled), 5, 0), true);
   }

   public void zm101620( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4035CCVal = T01013_A4035CCVal[0] ;
         }
         else
         {
            Z4035CCVal = A4035CCVal ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4035CCVal = A4035CCVal ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z758ProCod = A758ProCod ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
      }
   }

   public void standaloneNotModal101620( )
   {
      edtCCTValD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void standaloneModal101620( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void load101620( )
   {
      /* Using cursor T010123 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4043CCTLinDsc = T010123_A4043CCTLinDsc[0] ;
         A4035CCVal = T010123_A4035CCVal[0] ;
         zm101620( -23) ;
      }
      pr_default.close(21);
      onLoadActions101620( ) ;
   }

   public void onLoadActions101620( )
   {
      GXt_char4 = A5627CCTValD ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int7[0] = A4034CCTLin ;
      GXv_char2[0] = GXt_char4 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_int7, GXv_char2) ;
      tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
      tinccar_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccar_impl.this.A4034CCTLin = GXv_int7[0] ;
      tinccar_impl.this.GXt_char4 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char4 ;
      AV57OldCcVal = O4035CCVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57OldCcVal", AV57OldCcVal);
   }

   public void checkExtendedTable101620( )
   {
      nIsDirty_620 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal101620( ) ;
      /* Using cursor T01014 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T01014_A4043CCTLinDsc[0] ;
      pr_default.close(2);
      nIsDirty_620 = (short)(1) ;
      GXt_char4 = A5627CCTValD ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int7[0] = A4034CCTLin ;
      GXv_char2[0] = GXt_char4 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_int7, GXv_char2) ;
      tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
      tinccar_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccar_impl.this.A4034CCTLin = GXv_int7[0] ;
      tinccar_impl.this.GXt_char4 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char4 ;
      AV57OldCcVal = O4035CCVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57OldCcVal", AV57OldCcVal);
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char1[0] = A758ProCod ;
         GXv_int7[0] = A194BarOrdLin ;
         GXv_int9[0] = A4031CCTCod ;
         GXv_char11[0] = A4035CCVal ;
         GXv_int12[0] = A4034CCTLin ;
         GXv_int13[0] = AV31Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char3, GXv_int10, GXv_int6, GXv_char2, GXv_char1, GXv_int7, GXv_int9, GXv_char11, GXv_int12, GXv_int13) ;
         tinccar_impl.this.A396EmprCod = GXv_char3[0] ;
         tinccar_impl.this.A129BarCod = GXv_int10[0] ;
         tinccar_impl.this.A132BarCodReo = GXv_int6[0] ;
         tinccar_impl.this.A130BarCodPar = GXv_char2[0] ;
         tinccar_impl.this.A758ProCod = GXv_char1[0] ;
         tinccar_impl.this.A194BarOrdLin = GXv_int7[0] ;
         tinccar_impl.this.A4031CCTCod = GXv_int9[0] ;
         tinccar_impl.this.A4035CCVal = GXv_char11[0] ;
         tinccar_impl.this.A4034CCTLin = GXv_int12[0] ;
         tinccar_impl.this.AV31Ok = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31Ok", GXutil.str( AV31Ok, 1, 0));
      }
      if ( ( AV31Ok == 0 ) && true /* Level */ && true /* After */ )
      {
         GXCCtl = "CCVAL_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato Valor Incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCVal_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors101620( )
   {
      pr_default.close(2);
   }

   public void enableDisable101620( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          int A4031CCTCod ,
                          short A4034CCTLin )
   {
      /* Using cursor T010124 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T010124_A4043CCTLinDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4043CCTLinDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey101620( )
   {
      /* Using cursor T010125 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound620 = (short)(1) ;
      }
      else
      {
         RcdFound620 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey101620( )
   {
      /* Using cursor T01013 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01013_A129BarCod[0] == A129BarCod ) && ( T01013_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01013_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01013_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T01013_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01013_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01013_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm101620( 23) ;
         RcdFound620 = (short)(1) ;
         initializeNonKey101620( ) ;
         A4035CCVal = T01013_A4035CCVal[0] ;
         A4034CCTLin = T01013_A4034CCTLin[0] ;
         O4035CCVal = A4035CCVal ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal101620( ) ;
         load101620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound620 = (short)(0) ;
         initializeNonKey101620( ) ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal101620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes101620( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency101620( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01012 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4035CCVal, T01012_A4035CCVal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4035CCVal, T01012_A4035CCVal[0]) != 0 )
            {
               GXutil.writeLogln("tinccar:[seudo value changed for attri]"+"CCVal");
               GXutil.writeLogRaw("Old: ",Z4035CCVal);
               GXutil.writeLogRaw("Current: ",T01012_A4035CCVal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert101620( )
   {
      beforeValidate101620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable101620( ) ;
      }
      if ( AnyError == 0 )
      {
         zm101620( 0) ;
         checkOptimisticConcurrency101620( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm101620( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert101620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010126 */
                  pr_default.execute(24, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A4035CCVal, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load101620( ) ;
         }
         endLevel101620( ) ;
      }
      closeExtendedTableCursors101620( ) ;
   }

   public void update101620( )
   {
      beforeValidate101620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable101620( ) ;
      }
      if ( ( nIsMod_620 != 0 ) || ( nIsDirty_620 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency101620( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm101620( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate101620( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010127 */
                     pr_default.execute(25, new Object[] {A4035CCVal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate101620( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && ( GXutil.strcmp(A4035CCVal, AV57OldCcVal) != 0 ) )
                        {
                           AV58Inc_obs = httpContext.getMessage( httpContext.getMessage( "Ingreso Datos. Orden= ", ""), "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Fase= ", ""), "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + httpContext.getMessage( httpContext.getMessage( " Linea= ", ""), "") + GXutil.str( A4034CCTLin, 4, 0) + httpContext.getMessage( httpContext.getMessage( " Descripcion= ", ""), "") + GXutil.trim( A4043CCTLinDsc) + httpContext.getMessage( httpContext.getMessage( " Valor Inicial= ", ""), "") + GXutil.trim( AV57OldCcVal) + httpContext.getMessage( httpContext.getMessage( " -> Valor Final= ", ""), "") + GXutil.trim( A4035CCVal) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV58Inc_obs", AV58Inc_obs);
                        }
                        if ( true /* After */ && ( GXutil.strcmp(A4035CCVal, AV57OldCcVal) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV59Pgmname, AV8UsurCod, AV29Station, AV58Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey101620( ) ;
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
            endLevel101620( ) ;
         }
      }
      closeExtendedTableCursors101620( ) ;
   }

   public void deferredUpdate101620( )
   {
   }

   public void delete101620( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate101620( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency101620( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls101620( ) ;
         afterConfirm101620( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete101620( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010128 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
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
      sMode620 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel101620( ) ;
      Gx_mode = sMode620 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls101620( )
   {
      standaloneModal101620( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T010129 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4043CCTLinDsc = T010129_A4043CCTLinDsc[0] ;
         pr_default.close(27);
         GXt_char4 = A5627CCTValD ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A4031CCTCod ;
         GXv_int12[0] = A4034CCTLin ;
         GXv_char3[0] = GXt_char4 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int12, GXv_char3) ;
         tinccar_impl.this.A396EmprCod = GXv_char11[0] ;
         tinccar_impl.this.A4031CCTCod = GXv_int10[0] ;
         tinccar_impl.this.A4034CCTLin = GXv_int12[0] ;
         tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A5627CCTValD = GXt_char4 ;
         AV57OldCcVal = O4035CCVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57OldCcVal", AV57OldCcVal);
      }
   }

   public void endLevel101620( )
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

   public void scanStart101620( )
   {
      /* Scan By routine */
      /* Using cursor T010130 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T010130_A4034CCTLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext101620( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T010130_A4034CCTLin[0] ;
      }
   }

   public void scanEnd101620( )
   {
      pr_default.close(28);
   }

   public void afterConfirm101620( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert101620( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate101620( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete101620( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete101620( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate101620( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes101620( )
   {
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtCCVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtCCTValD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void send_integrity_lvl_hashes101620( )
   {
   }

   public void send_integrity_lvl_hashes101619( )
   {
   }

   public void subsflControlProps_220620( )
   {
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620_"+sGXsfl_220_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_220_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_220_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_220_idx ;
      edtCCTValD_Internalname = "CCTVALD_"+sGXsfl_220_idx ;
   }

   public void subsflControlProps_fel_220620( )
   {
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620_"+sGXsfl_220_fel_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_220_fel_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_220_fel_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_220_fel_idx ;
      edtCCTValD_Internalname = "CCTVALD_"+sGXsfl_220_fel_idx ;
   }

   public void addRow101620( )
   {
      nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220620( ) ;
      sendRow101620( ) ;
   }

   public void sendRow101620( )
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
         if ( ((int)((nGXsfl_220_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_620_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_620_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_620), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_620), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_620_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_620_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCCTLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLinDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVal_Internalname,GXutil.rtrim( A4035CCVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,224);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValD_Internalname,A5627CCTValD,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTValD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes101620( ) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4035CCVal_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4035CCVal));
      GXCCtl = "O4035CCVal_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O4035CCVal));
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_620_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_620_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vIMPCOD_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV54ImpCod));
      GXCCtl = "vDISCOD_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV43DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vNT_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV50Nt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vNVAL_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV51Nval, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTAB_LIN_" + sGXsfl_220_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV55Tab_lin);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV55Tab_lin);
      }
      GXCCtl = "vTAB_VAL_" + sGXsfl_220_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV56Tab_val);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV56Tab_val);
      }
      GXCCtl = "vBARKGM_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV35BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARMTR_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV36BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARPIE_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV37BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_620_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVAL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALD_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow101620( )
   {
      nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220620( ) ;
      edtavnRcdDeleted_620_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_620_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTValD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALD_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_620");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_620_Internalname ;
         wbErr = true ;
         nRcdDeleted_620 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
      A4035CCVal = httpContext.cgiGet( edtCCVal_Internalname) ;
      A5627CCTValD = httpContext.cgiGet( edtCCTValD_Internalname) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_220_idx ;
      Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4035CCVal_" + sGXsfl_220_idx ;
      Z4035CCVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O4035CCVal_" + sGXsfl_220_idx ;
      O4035CCVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_220_idx ;
      nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_620_" + sGXsfl_220_idx ;
      nRcdExists_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_620_" + sGXsfl_220_idx ;
      nIsMod_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTValD_Enabled = edtCCTValD_Enabled ;
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
   }

   public void confirmValues1010( )
   {
      nGXsfl_220_idx = 0 ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220620( ) ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
         sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_220620( ) ;
         httpContext.changePostValue( "Z4034CCTLin_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z4034CCTLin_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z4035CCVal_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z4035CCVal_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_220_idx) ;
      }
      httpContext.changePostValue( "O4035CCVal", httpContext.cgiGet( "T4035CCVal")) ;
      httpContext.deletePostValue( "T4035CCVal") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tinccar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV35BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV36BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarPie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43DisCod,8,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod","BarKgm","BarMtr","BarPie","DisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7691CCFchUti", localUtil.dtoc( Z7691CCFchUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.dtoc( Z4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11293CcUltn", GXutil.ltrim( localUtil.ntoc( Z11293CcUltn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11628CCobs2", Z11628CCobs2);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_220", GXutil.ltrim( localUtil.ntoc( nGXsfl_220_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV54ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV43DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNT", GXutil.ltrim( localUtil.ntoc( AV50Nt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNVAL", GXutil.ltrim( localUtil.ntoc( AV51Nval, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_LIN", AV55Tab_lin);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_LIN", AV55Tab_lin);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_VAL", AV56Tab_val);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_VAL", AV56Tab_val);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV35BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV36BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIE", GXutil.ltrim( localUtil.ntoc( AV37BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV45OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORTONAL", GXutil.rtrim( AV47ForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV59Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCCVAL", GXutil.rtrim( AV57OldCcVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV58Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.ltrim( localUtil.ntoc( AV31Ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV29Station));
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
      return formatLink("app.tinccar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV35BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV36BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarPie,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43DisCod,8,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod","BarKgm","BarMtr","BarPie","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TInCCar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA CONTROLES CALIDAD", "") ;
   }

   public void initializeNonKey101619( )
   {
      A7691CCFchUti = GXutil.nullDate() ;
      n7691CCFchUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
      A4032CCOpeCod = 0 ;
      n4032CCOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
      A4033CCFch = GXutil.nullDate() ;
      n4033CCFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      A4405CcDisp = "" ;
      n4405CcDisp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
      A3281CcObs = "" ;
      n3281CcObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      A11293CcUltn = (short)(0) ;
      n11293CcUltn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11293CcUltn), 4, 0));
      A11628CCobs2 = "" ;
      n11628CCobs2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11628CCobs2", A11628CCobs2);
      Z7691CCFchUti = GXutil.nullDate() ;
      Z4032CCOpeCod = 0 ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z11293CcUltn = (short)(0) ;
      Z11628CCobs2 = "" ;
   }

   public void initAll101619( )
   {
      initializeNonKey101619( ) ;
   }

   public void standaloneModalInsert( )
   {
      A7691CCFchUti = i7691CCFchUti ;
      n7691CCFchUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
   }

   public void initializeNonKey101620( )
   {
      AV31Ok = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Ok", GXutil.str( AV31Ok, 1, 0));
      AV57OldCcVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57OldCcVal", AV57OldCcVal);
      A5627CCTValD = "" ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      AV58Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Inc_obs", AV58Inc_obs);
      O4035CCVal = A4035CCVal ;
      Z4035CCVal = "" ;
   }

   public void initAll101620( )
   {
      A4034CCTLin = (short)(0) ;
      initializeNonKey101620( ) ;
   }

   public void standaloneModalInsert101620( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533479", true, true);
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
      httpContext.AddJavascriptSource("tinccar.js", "?20268241533480", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties620( )
   {
      edtCCTValD_Enabled = defedtCCTValD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void startgridcontrol220( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4035CCVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A5627CCTValD);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCCOpeCod_Internalname = "CCOPECOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCCFch_Internalname = "CCFCH" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCcDisp_Internalname = "CCDISP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCcObs_Internalname = "CCOBS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarGraAca_Internalname = "BARGRAACA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarGraAca2_Internalname = "BARGRAACA2" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarEncAnh_Internalname = "BARENCANH" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarEncCom_Internalname = "BARENCCOM" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarRdoA_Internalname = "BARRDOA" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarAncAca2_Internalname = "BARANCACA2" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarFecCli_Internalname = "BARFECCLI" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBarCosPro_Internalname = "BARCOSPRO" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarCosAny_Internalname = "BARCOSANY" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtCCFchUti_Internalname = "CCFCHUTI" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtBarObsGrm_Internalname = "BAROBSGRM" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtBarObsAnc_Internalname = "BAROBSANC" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtCcUltn_Internalname = "CCULTN" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtCCobs2_Internalname = "CCOBS2" ;
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCVal_Internalname = "CCVAL" ;
      edtCCTValD_Internalname = "CCTVALD" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADA CONTROLES CALIDAD", "") );
      edtCCTValD_Jsonclick = "" ;
      edtCCVal_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      edtavnRcdDeleted_620_Jsonclick = "" ;
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
      edtCCTValD_Enabled = 0 ;
      edtCCVal_Enabled = 1 ;
      edtCCTLinDsc_Enabled = 0 ;
      edtCCTLin_Enabled = 0 ;
      edtavnRcdDeleted_620_Enabled = 1 ;
      edtCCobs2_Backcolor = (int)(0xFFFFFF) ;
      edtCCobs2_Enabled = 1 ;
      edtCcUltn_Jsonclick = "" ;
      edtCcUltn_Backcolor = (int)(0xFFFFFF) ;
      edtCcUltn_Enabled = 1 ;
      edtBarObsAnc_Jsonclick = "" ;
      edtBarObsAnc_Backcolor = (int)(0xFFFFFF) ;
      edtBarObsAnc_Enabled = 0 ;
      edtBarObsGrm_Jsonclick = "" ;
      edtBarObsGrm_Backcolor = (int)(0xFFFFFF) ;
      edtBarObsGrm_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtCCFchUti_Jsonclick = "" ;
      edtCCFchUti_Backcolor = (int)(0xFFFFFF) ;
      edtCCFchUti_Enabled = 1 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncCli_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtBarCosAny_Jsonclick = "" ;
      edtBarCosAny_Backcolor = (int)(0xFFFFFF) ;
      edtBarCosAny_Enabled = 0 ;
      edtBarCosPro_Jsonclick = "" ;
      edtBarCosPro_Backcolor = (int)(0xFFFFFF) ;
      edtBarCosPro_Enabled = 0 ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumCli_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNomCli_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecCli_Enabled = 0 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarDisNum_Enabled = 0 ;
      edtBarAncAca2_Jsonclick = "" ;
      edtBarAncAca2_Backcolor = (int)(0xFFFFFF) ;
      edtBarAncAca2_Enabled = 0 ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarAncAca1_Backcolor = (int)(0xFFFFFF) ;
      edtBarAncAca1_Enabled = 0 ;
      edtBarRdoA_Jsonclick = "" ;
      edtBarRdoA_Backcolor = (int)(0xFFFFFF) ;
      edtBarRdoA_Enabled = 0 ;
      edtBarEncCom_Jsonclick = "" ;
      edtBarEncCom_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncCom_Enabled = 0 ;
      edtBarEncAnh_Jsonclick = "" ;
      edtBarEncAnh_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncAnh_Enabled = 0 ;
      edtBarGraAca2_Jsonclick = "" ;
      edtBarGraAca2_Backcolor = (int)(0xFFFFFF) ;
      edtBarGraAca2_Enabled = 0 ;
      edtBarGraAca_Jsonclick = "" ;
      edtBarGraAca_Backcolor = (int)(0xFFFFFF) ;
      edtBarGraAca_Enabled = 0 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCCTDsc_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtProDsc_Visible = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasDsc_Visible = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      edtFasCod_Visible = 1 ;
      edtCcObs_Backcolor = (int)(0xFFFFFF) ;
      edtCcObs_Enabled = 1 ;
      edtCcDisp_Jsonclick = "" ;
      edtCcDisp_Backcolor = (int)(0xFFFFFF) ;
      edtCcDisp_Enabled = 1 ;
      edtCCFch_Jsonclick = "" ;
      edtCCFch_Backcolor = (int)(0xFFFFFF) ;
      edtCCFch_Enabled = 1 ;
      edtCCOpeCod_Jsonclick = "" ;
      edtCCOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCOpeCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCTCod_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 0 ;
      edtBarOrdLin_Visible = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtProCod_Visible = 1 ;
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

   public void gx5asacctvald101620( String A396EmprCod ,
                                    int A4031CCTCod ,
                                    short A4034CCTLin )
   {
      GXt_char4 = A5627CCTValD ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int12[0] = A4034CCTLin ;
      GXv_char3[0] = GXt_char4 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int12, GXv_char3) ;
      tinccar_impl.this.A396EmprCod = GXv_char11[0] ;
      tinccar_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccar_impl.this.A4034CCTLin = GXv_int12[0] ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char4 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A5627CCTValD)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_3_101619( String A396EmprCod ,
                            int A4032CCOpeCod ,
                            String AV45OpeNom ,
                            String A130BarCodPar )
   {
      if ( true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A4032CCOpeCod ;
         GXv_char3[0] = AV45OpeNom ;
         new app.pnrcope(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char3) ;
         A396EmprCod = GXv_char11[0] ;
         A4032CCOpeCod = GXv_int10[0] ;
         AV45OpeNom = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45OpeNom", AV45OpeNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV45OpeNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_4_101619( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String AV47ForTonal )
   {
      if ( true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int13[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV47ForTonal ;
         new app.pbuscar(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int13, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char11[0] ;
         A129BarCod = GXv_int10[0] ;
         A132BarCodReo = GXv_int13[0] ;
         A130BarCodPar = GXv_char3[0] ;
         AV47ForTonal = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV47ForTonal", AV47ForTonal);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV47ForTonal))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_101620( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A758ProCod ,
                             short A194BarOrdLin ,
                             int A4031CCTCod ,
                             String A4035CCVal ,
                             short A4034CCTLin ,
                             byte AV31Ok )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int13[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A758ProCod ;
         GXv_int12[0] = A194BarOrdLin ;
         GXv_int9[0] = A4031CCTCod ;
         GXv_char1[0] = A4035CCVal ;
         GXv_int7[0] = A4034CCTLin ;
         GXv_int6[0] = AV31Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int13, GXv_char3, GXv_char2, GXv_int12, GXv_int9, GXv_char1, GXv_int7, GXv_int6) ;
         A396EmprCod = GXv_char11[0] ;
         A129BarCod = GXv_int10[0] ;
         A132BarCodReo = GXv_int13[0] ;
         A130BarCodPar = GXv_char3[0] ;
         A758ProCod = GXv_char2[0] ;
         A194BarOrdLin = GXv_int12[0] ;
         A4031CCTCod = GXv_int9[0] ;
         A4035CCVal = GXv_char1[0] ;
         A4034CCTLin = GXv_int7[0] ;
         AV31Ok = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31Ok", GXutil.str( AV31Ok, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4035CCVal))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV31Ok, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_14_101620( String A396EmprCod ,
                             String AV59Pgmname ,
                             String AV8UsurCod ,
                             String AV29Station ,
                             String AV58Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A4035CCVal ,
                             String AV57OldCcVal )
   {
      if ( true /* After */ && ( GXutil.strcmp(A4035CCVal, AV57OldCcVal) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV59Pgmname, AV8UsurCod, AV29Station, AV58Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      subsflControlProps_220620( ) ;
      while ( nGXsfl_220_idx <= nRC_GXsfl_220 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal101620( ) ;
         standaloneModal101620( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow101620( ) ;
         nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
         sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_220620( ) ;
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
      /* Using cursor T010131 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010131_A407EmprNom[0] ;
      n407EmprNom = T010131_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(29);
      /* Using cursor T010132 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1909BarGraAca = T010132_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = T010132_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = T010132_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = T010132_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = T010132_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = T010132_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = T010132_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A143BarDisNum = T010132_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A155BarFecCli = T010132_A155BarFecCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      A135BarColNom = T010132_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T010132_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = T010132_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T010132_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A141BarCosPro = T010132_A141BarCosPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrimstr( A141BarCosPro, 10, 2));
      A140BarCosAny = T010132_A140BarCosAny[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrimstr( A140BarCosAny, 10, 2));
      A212BarSer = T010132_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A4812BarEncCli = T010132_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A5351BarObsGrm = T010132_A5351BarObsGrm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", A5351BarObsGrm);
      A5352BarObsAnc = T010132_A5352BarObsAnc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", A5352BarObsAnc);
      A252CliCod = T010132_A252CliCod[0] ;
      n252CliCod = T010132_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(30);
      /* Using cursor T010133 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T010133_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(31);
      /* Using cursor T010134 */
      pr_default.execute(32, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T010134_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(32);
      /* Using cursor T010135 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      A457FasCod = T010135_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      pr_default.close(33);
      /* Using cursor T010136 */
      pr_default.execute(34, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T010136_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(34);
      /* Using cursor T010137 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A4036CCTDsc = T010137_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(35);
      GX_FocusControl = edtCCOpeCod_Internalname ;
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

   public void valid_Cctcod( )
   {
      n252CliCod = false ;
      n7691CCFchUti = false ;
      n4032CCOpeCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7691CCFchUti", localUtil.format(A7691CCFchUti, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", GXutil.rtrim( A4405CcDisp));
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A141BarCosPro", GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A140BarCosAny", GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", GXutil.rtrim( A4812BarEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5351BarObsGrm", GXutil.rtrim( A5351BarObsGrm));
      httpContext.ajax_rsp_assign_attri("", false, "A5352BarObsAnc", GXutil.rtrim( A5352BarObsAnc));
      httpContext.ajax_rsp_assign_attri("", false, "A11293CcUltn", GXutil.ltrim( localUtil.ntoc( A11293CcUltn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11628CCobs2", A11628CCobs2);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7691CCFchUti", localUtil.format(Z7691CCFchUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.format(Z4033CCFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1909BarGraAca", GXutil.ltrim( localUtil.ntoc( Z1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( Z3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( Z1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1223BarEncCom", GXutil.ltrim( localUtil.ntoc( Z1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1911BarRdoA", GXutil.ltrim( localUtil.ntoc( Z1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z125BarAncAca1", GXutil.ltrim( localUtil.ntoc( Z125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z126BarAncAca2", GXutil.ltrim( localUtil.ntoc( Z126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z155BarFecCli", localUtil.format(Z155BarFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1235BarNumCli", GXutil.ltrim( localUtil.ntoc( Z1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z141BarCosPro", GXutil.ltrim( localUtil.ntoc( Z141BarCosPro, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z140BarCosAny", GXutil.ltrim( localUtil.ntoc( Z140BarCosAny, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4812BarEncCli", GXutil.rtrim( Z4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5351BarObsGrm", GXutil.rtrim( Z5351BarObsGrm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5352BarObsAnc", GXutil.rtrim( Z5352BarObsAnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11293CcUltn", GXutil.ltrim( localUtil.ntoc( Z11293CcUltn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11628CCobs2", Z11628CCobs2);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cctlin( )
   {
      /* Using cursor T010129 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
      }
      A4043CCTLinDsc = T010129_A4043CCTLinDsc[0] ;
      pr_default.close(27);
      GXt_char4 = A5627CCTValD ;
      GXv_char11[0] = A396EmprCod ;
      GXv_int10[0] = A4031CCTCod ;
      GXv_int12[0] = A4034CCTLin ;
      GXv_char3[0] = GXt_char4 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int12, GXv_char3) ;
      tinccar_impl.this.A396EmprCod = GXv_char11[0] ;
      tinccar_impl.this.A4031CCTCod = GXv_int10[0] ;
      tinccar_impl.this.A4034CCTLin = GXv_int12[0] ;
      tinccar_impl.this.GXt_char4 = GXv_char3[0] ;
      A5627CCTValD = GXt_char4 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5627CCTValD", A5627CCTValD);
   }

   public void valid_Ccval( )
   {
      AV57OldCcVal = O4035CCVal ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A129BarCod ;
         GXv_int13[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A758ProCod ;
         GXv_int12[0] = A194BarOrdLin ;
         GXv_int9[0] = A4031CCTCod ;
         GXv_char1[0] = A4035CCVal ;
         GXv_int7[0] = A4034CCTLin ;
         GXv_int6[0] = AV31Ok ;
         new app.controlcalidadhtd.pincc(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int13, GXv_char3, GXv_char2, GXv_int12, GXv_int9, GXv_char1, GXv_int7, GXv_int6) ;
         tinccar_impl.this.A396EmprCod = GXv_char11[0] ;
         A396EmprCod = this.A396EmprCod ;
         tinccar_impl.this.A129BarCod = GXv_int10[0] ;
         A129BarCod = this.A129BarCod ;
         tinccar_impl.this.A132BarCodReo = GXv_int13[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tinccar_impl.this.A130BarCodPar = GXv_char3[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tinccar_impl.this.A758ProCod = GXv_char2[0] ;
         A758ProCod = this.A758ProCod ;
         tinccar_impl.this.A194BarOrdLin = GXv_int12[0] ;
         A194BarOrdLin = this.A194BarOrdLin ;
         tinccar_impl.this.A4031CCTCod = GXv_int9[0] ;
         A4031CCTCod = this.A4031CCTCod ;
         tinccar_impl.this.A4035CCVal = GXv_char1[0] ;
         A4035CCVal = this.A4035CCVal ;
         tinccar_impl.this.A4034CCTLin = GXv_int7[0] ;
         A4034CCTLin = this.A4034CCTLin ;
         tinccar_impl.this.AV31Ok = GXv_int6[0] ;
         AV31Ok = this.AV31Ok ;
      }
      if ( ( AV31Ok == 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato Valor Incorrecto", ""), 1, "CCVAL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCVal_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV57OldCcVal", GXutil.rtrim( AV57OldCcVal));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4035CCVal", GXutil.rtrim( A4035CCVal));
      httpContext.ajax_rsp_assign_attri("", false, "A4034CCTLin", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Ok", GXutil.ltrim( localUtil.ntoc( AV31Ok, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV35BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV36BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV37BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV43DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'VER'","{handler:'e141012',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("'VER'",",oparms:[]}");
      setEventMetadata("'OBSERVACIONES'","{handler:'e131012',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV43DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'OBSERVACIONES'",",oparms:[{av:'AV43DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'NOVO CONTROLO?'","{handler:'e151012',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV50Nt',fld:'vNT',pic:'ZZZZZ9'},{av:'AV51Nval',fld:'vNVAL',pic:'ZZZZZ9'},{av:'AV55Tab_lin',fld:'vTAB_LIN',pic:'ZZZ9'},{av:'AV56Tab_val',fld:'vTAB_VAL',pic:''}]");
      setEventMetadata("'NOVO CONTROLO?'",",oparms:[{av:'AV51Nval',fld:'vNVAL',pic:'ZZZZZ9'},{av:'AV50Nt',fld:'vNT',pic:'ZZZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV56Tab_val',fld:'vTAB_VAL',pic:''},{av:'AV55Tab_lin',fld:'vTAB_LIN',pic:'ZZZ9'}]}");
      setEventMetadata("'VER CONTROLES'","{handler:'e161012',iparms:[{av:'A11293CcUltn',fld:'CCULTN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'VER CONTROLES'",",oparms:[{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("EXIT","{handler:'e111012',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'AV54ImpCod',fld:'vIMPCOD',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV29Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A7691CCFchUti',fld:'CCFCHUTI',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'AV45OpeNom',fld:'vOPENOM',pic:''},{av:'AV47ForTonal',fld:'vFORTONAL',pic:''}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A7691CCFchUti',fld:'CCFCHUTI',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A4405CcDisp',fld:'CCDISP',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A3137BarGraAca2',fld:'BARGRAACA2',pic:'ZZZ9'},{av:'A1224BarEncAnh',fld:'BARENCANH',pic:'999.99'},{av:'A1223BarEncCom',fld:'BARENCCOM',pic:'999.99'},{av:'A1911BarRdoA',fld:'BARRDOA',pic:'ZZ9.99'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A126BarAncAca2',fld:'BARANCACA2',pic:'ZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5351BarObsGrm',fld:'BAROBSGRM',pic:''},{av:'A5352BarObsAnc',fld:'BAROBSANC',pic:''},{av:'A11293CcUltn',fld:'CCULTN',pic:'ZZZ9'},{av:'A11628CCobs2',fld:'CCOBS2',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4031CCTCod'},{av:'Z7691CCFchUti'},{av:'Z407EmprNom'},{av:'Z4032CCOpeCod'},{av:'Z4033CCFch'},{av:'Z4405CcDisp'},{av:'Z3281CcObs'},{av:'Z457FasCod'},{av:'Z460FasDsc'},{av:'Z759ProDsc'},{av:'Z4036CCTDsc'},{av:'Z1909BarGraAca'},{av:'Z3137BarGraAca2'},{av:'Z1224BarEncAnh'},{av:'Z1223BarEncCom'},{av:'Z1911BarRdoA'},{av:'Z125BarAncAca1'},{av:'Z126BarAncAca2'},{av:'Z143BarDisNum'},{av:'Z155BarFecCli'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z1234BarNomCli'},{av:'Z1235BarNumCli'},{av:'Z141BarCosPro'},{av:'Z140BarCosAny'},{av:'Z212BarSer'},{av:'Z4812BarEncCli'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z5351BarObsGrm'},{av:'Z5352BarObsAnc'},{av:'Z11293CcUltn'},{av:'Z11628CCobs2'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_FASDSC","{handler:'valid_Fasdsc',iparms:[]");
      setEventMetadata("VALID_FASDSC",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A5627CCTValD',fld:'CCTVALD',pic:''}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A5627CCTValD',fld:'CCTVALD',pic:''}]}");
      setEventMetadata("VALID_CCTLINDSC","{handler:'valid_Cctlindsc',iparms:[]");
      setEventMetadata("VALID_CCTLINDSC",",oparms:[]}");
      setEventMetadata("VALID_CCVAL","{handler:'valid_Ccval',iparms:[{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'O4035CCVal'},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'AV57OldCcVal',fld:'vOLDCCVAL',pic:''},{av:'AV31Ok',fld:'vOK',pic:'9'}]");
      setEventMetadata("VALID_CCVAL",",oparms:[{av:'AV57OldCcVal',fld:'vOLDCCVAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4035CCVal',fld:'CCVAL',pic:''},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV31Ok',fld:'vOK',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Cctvald',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(33);
      pr_default.close(30);
      pr_default.close(29);
      pr_default.close(32);
      pr_default.close(35);
      pr_default.close(34);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      wcpOAV35BarKgm = DecimalUtil.ZERO ;
      wcpOAV36BarMtr = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z7691CCFchUti = GXutil.nullDate() ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z11628CCobs2 = "" ;
      Z4035CCVal = "" ;
      O4035CCVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV45OpeNom = "" ;
      A130BarCodPar = "" ;
      AV47ForTonal = "" ;
      A758ProCod = "" ;
      A4035CCVal = "" ;
      AV59Pgmname = "" ;
      AV8UsurCod = "" ;
      AV29Station = "" ;
      AV58Inc_obs = "" ;
      AV57OldCcVal = "" ;
      AV35BarKgm = DecimalUtil.ZERO ;
      AV36BarMtr = DecimalUtil.ZERO ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4033CCFch = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A4405CcDisp = "" ;
      lblTextblock12_Jsonclick = "" ;
      A3281CcObs = "" ;
      lblTextblock13_Jsonclick = "" ;
      A457FasCod = "" ;
      lblTextblock14_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock15_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4036CCTDsc = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A143BarDisNum = "" ;
      lblTextblock25_Jsonclick = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      lblTextblock26_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      A1234BarNomCli = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      lblTextblock31_Jsonclick = "" ;
      A140BarCosAny = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock33_Jsonclick = "" ;
      A4812BarEncCli = "" ;
      lblTextblock34_Jsonclick = "" ;
      A7691CCFchUti = GXutil.nullDate() ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock37_Jsonclick = "" ;
      A5351BarObsGrm = "" ;
      lblTextblock38_Jsonclick = "" ;
      A5352BarObsAnc = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      A11628CCobs2 = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode620 = "" ;
      Gx_mode = "" ;
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
      sMode619 = "" ;
      A4043CCTLinDsc = "" ;
      A5627CCTValD = "" ;
      T4035CCVal = "" ;
      AV30EmprNom = "" ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV10Lit1 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV11Lit10 = "" ;
      AV12Lit11 = "" ;
      AV13Lit12 = "" ;
      AV16Lit15 = "" ;
      AV18Lit17 = "" ;
      AV33Lit40 = "" ;
      AV34Lit41 = "" ;
      AV19Lit18 = "" ;
      AV38Lit45 = "" ;
      AV14Lit13 = "" ;
      AV15Lit14 = "" ;
      AV17Lit16 = "" ;
      AV41Lit47 = "" ;
      AV42Lit48 = "" ;
      AV39Lit63 = "" ;
      AV40Lit30 = "" ;
      AV44Lit80 = "" ;
      AV46Lit73 = "" ;
      AV48Lit81 = "" ;
      AV49Lit82 = "" ;
      AV53Lit400 = "" ;
      AV54ImpCod = "" ;
      GXv_int5 = new int[1] ;
      GXv_int8 = new int[1] ;
      Gx_msg = "" ;
      AV55Tab_lin = new short[100] ;
      AV56Tab_val = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV56Tab_val[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      Z407EmprNom = "" ;
      Z1224BarEncAnh = DecimalUtil.ZERO ;
      Z1223BarEncCom = DecimalUtil.ZERO ;
      Z1911BarRdoA = DecimalUtil.ZERO ;
      Z143BarDisNum = "" ;
      Z155BarFecCli = GXutil.nullDate() ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      Z141BarCosPro = DecimalUtil.ZERO ;
      Z140BarCosAny = DecimalUtil.ZERO ;
      Z212BarSer = "" ;
      Z4812BarEncCli = "" ;
      Z5351BarObsGrm = "" ;
      Z5352BarObsAnc = "" ;
      Z279CliNom = "" ;
      Z759ProDsc = "" ;
      Z457FasCod = "" ;
      Z460FasDsc = "" ;
      Z4036CCTDsc = "" ;
      T01017_A407EmprNom = new String[] {""} ;
      T01017_n407EmprNom = new boolean[] {false} ;
      T01018_A1909BarGraAca = new short[1] ;
      T01018_A3137BarGraAca2 = new short[1] ;
      T01018_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01018_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01018_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01018_A125BarAncAca1 = new short[1] ;
      T01018_A126BarAncAca2 = new short[1] ;
      T01018_A143BarDisNum = new String[] {""} ;
      T01018_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01018_A135BarColNom = new String[] {""} ;
      T01018_A136BarColNum = new int[1] ;
      T01018_A1234BarNomCli = new String[] {""} ;
      T01018_A1235BarNumCli = new int[1] ;
      T01018_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01018_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01018_A212BarSer = new String[] {""} ;
      T01018_A4812BarEncCli = new String[] {""} ;
      T01018_A5351BarObsGrm = new String[] {""} ;
      T01018_A5352BarObsAnc = new String[] {""} ;
      T01018_A252CliCod = new int[1] ;
      T01018_n252CliCod = new boolean[] {false} ;
      T010113_A279CliNom = new String[] {""} ;
      T01019_A759ProDsc = new String[] {""} ;
      T010110_A457FasCod = new String[] {""} ;
      T010112_A460FasDsc = new String[] {""} ;
      T010111_A4036CCTDsc = new String[] {""} ;
      T010114_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T010114_n7691CCFchUti = new boolean[] {false} ;
      T010114_A407EmprNom = new String[] {""} ;
      T010114_n407EmprNom = new boolean[] {false} ;
      T010114_A4032CCOpeCod = new int[1] ;
      T010114_n4032CCOpeCod = new boolean[] {false} ;
      T010114_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T010114_n4033CCFch = new boolean[] {false} ;
      T010114_A4405CcDisp = new String[] {""} ;
      T010114_n4405CcDisp = new boolean[] {false} ;
      T010114_A3281CcObs = new String[] {""} ;
      T010114_n3281CcObs = new boolean[] {false} ;
      T010114_A460FasDsc = new String[] {""} ;
      T010114_A759ProDsc = new String[] {""} ;
      T010114_A4036CCTDsc = new String[] {""} ;
      T010114_A1909BarGraAca = new short[1] ;
      T010114_A3137BarGraAca2 = new short[1] ;
      T010114_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010114_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010114_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010114_A125BarAncAca1 = new short[1] ;
      T010114_A126BarAncAca2 = new short[1] ;
      T010114_A143BarDisNum = new String[] {""} ;
      T010114_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T010114_A135BarColNom = new String[] {""} ;
      T010114_A136BarColNum = new int[1] ;
      T010114_A1234BarNomCli = new String[] {""} ;
      T010114_A1235BarNumCli = new int[1] ;
      T010114_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010114_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010114_A212BarSer = new String[] {""} ;
      T010114_A4812BarEncCli = new String[] {""} ;
      T010114_A279CliNom = new String[] {""} ;
      T010114_A5351BarObsGrm = new String[] {""} ;
      T010114_A5352BarObsAnc = new String[] {""} ;
      T010114_A11293CcUltn = new short[1] ;
      T010114_n11293CcUltn = new boolean[] {false} ;
      T010114_A11628CCobs2 = new String[] {""} ;
      T010114_n11628CCobs2 = new boolean[] {false} ;
      T010114_A396EmprCod = new String[] {""} ;
      T010114_A129BarCod = new int[1] ;
      T010114_A132BarCodReo = new byte[1] ;
      T010114_A130BarCodPar = new String[] {""} ;
      T010114_A758ProCod = new String[] {""} ;
      T010114_A194BarOrdLin = new short[1] ;
      T010114_A4031CCTCod = new int[1] ;
      T010114_A457FasCod = new String[] {""} ;
      T010114_A252CliCod = new int[1] ;
      T010114_n252CliCod = new boolean[] {false} ;
      T010115_A396EmprCod = new String[] {""} ;
      T010115_A129BarCod = new int[1] ;
      T010115_A132BarCodReo = new byte[1] ;
      T010115_A130BarCodPar = new String[] {""} ;
      T010115_A758ProCod = new String[] {""} ;
      T010115_A194BarOrdLin = new short[1] ;
      T010115_A4031CCTCod = new int[1] ;
      T01016_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T01016_n7691CCFchUti = new boolean[] {false} ;
      T01016_A4032CCOpeCod = new int[1] ;
      T01016_n4032CCOpeCod = new boolean[] {false} ;
      T01016_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01016_n4033CCFch = new boolean[] {false} ;
      T01016_A4405CcDisp = new String[] {""} ;
      T01016_n4405CcDisp = new boolean[] {false} ;
      T01016_A3281CcObs = new String[] {""} ;
      T01016_n3281CcObs = new boolean[] {false} ;
      T01016_A11293CcUltn = new short[1] ;
      T01016_n11293CcUltn = new boolean[] {false} ;
      T01016_A11628CCobs2 = new String[] {""} ;
      T01016_n11628CCobs2 = new boolean[] {false} ;
      T01016_A396EmprCod = new String[] {""} ;
      T01016_A129BarCod = new int[1] ;
      T01016_A132BarCodReo = new byte[1] ;
      T01016_A130BarCodPar = new String[] {""} ;
      T01016_A758ProCod = new String[] {""} ;
      T01016_A194BarOrdLin = new short[1] ;
      T01016_A4031CCTCod = new int[1] ;
      T010116_A396EmprCod = new String[] {""} ;
      T010116_A129BarCod = new int[1] ;
      T010116_A132BarCodReo = new byte[1] ;
      T010116_A130BarCodPar = new String[] {""} ;
      T010116_A758ProCod = new String[] {""} ;
      T010116_A194BarOrdLin = new short[1] ;
      T010116_A4031CCTCod = new int[1] ;
      T010117_A396EmprCod = new String[] {""} ;
      T010117_A129BarCod = new int[1] ;
      T010117_A132BarCodReo = new byte[1] ;
      T010117_A130BarCodPar = new String[] {""} ;
      T010117_A758ProCod = new String[] {""} ;
      T010117_A194BarOrdLin = new short[1] ;
      T010117_A4031CCTCod = new int[1] ;
      T01015_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T01015_n7691CCFchUti = new boolean[] {false} ;
      T01015_A4032CCOpeCod = new int[1] ;
      T01015_n4032CCOpeCod = new boolean[] {false} ;
      T01015_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01015_n4033CCFch = new boolean[] {false} ;
      T01015_A4405CcDisp = new String[] {""} ;
      T01015_n4405CcDisp = new boolean[] {false} ;
      T01015_A3281CcObs = new String[] {""} ;
      T01015_n3281CcObs = new boolean[] {false} ;
      T01015_A11293CcUltn = new short[1] ;
      T01015_n11293CcUltn = new boolean[] {false} ;
      T01015_A11628CCobs2 = new String[] {""} ;
      T01015_n11628CCobs2 = new boolean[] {false} ;
      T01015_A396EmprCod = new String[] {""} ;
      T01015_A129BarCod = new int[1] ;
      T01015_A132BarCodReo = new byte[1] ;
      T01015_A130BarCodPar = new String[] {""} ;
      T01015_A758ProCod = new String[] {""} ;
      T01015_A194BarOrdLin = new short[1] ;
      T01015_A4031CCTCod = new int[1] ;
      T010121_A396EmprCod = new String[] {""} ;
      T010121_A129BarCod = new int[1] ;
      T010121_A132BarCodReo = new byte[1] ;
      T010121_A130BarCodPar = new String[] {""} ;
      T010121_A758ProCod = new String[] {""} ;
      T010121_A194BarOrdLin = new short[1] ;
      T010121_A4031CCTCod = new int[1] ;
      T010121_A11294CcLn = new short[1] ;
      T010122_A396EmprCod = new String[] {""} ;
      T010122_A129BarCod = new int[1] ;
      T010122_A132BarCodReo = new byte[1] ;
      T010122_A130BarCodPar = new String[] {""} ;
      T010122_A758ProCod = new String[] {""} ;
      T010122_A194BarOrdLin = new short[1] ;
      T010122_A4031CCTCod = new int[1] ;
      Z4043CCTLinDsc = "" ;
      T010123_A129BarCod = new int[1] ;
      T010123_A132BarCodReo = new byte[1] ;
      T010123_A130BarCodPar = new String[] {""} ;
      T010123_A194BarOrdLin = new short[1] ;
      T010123_A4043CCTLinDsc = new String[] {""} ;
      T010123_A4035CCVal = new String[] {""} ;
      T010123_A396EmprCod = new String[] {""} ;
      T010123_A4031CCTCod = new int[1] ;
      T010123_A4034CCTLin = new short[1] ;
      T010123_A758ProCod = new String[] {""} ;
      T01014_A4043CCTLinDsc = new String[] {""} ;
      GXCCtl = "" ;
      T010124_A4043CCTLinDsc = new String[] {""} ;
      T010125_A396EmprCod = new String[] {""} ;
      T010125_A129BarCod = new int[1] ;
      T010125_A132BarCodReo = new byte[1] ;
      T010125_A130BarCodPar = new String[] {""} ;
      T010125_A758ProCod = new String[] {""} ;
      T010125_A194BarOrdLin = new short[1] ;
      T010125_A4031CCTCod = new int[1] ;
      T010125_A4034CCTLin = new short[1] ;
      T01013_A129BarCod = new int[1] ;
      T01013_A132BarCodReo = new byte[1] ;
      T01013_A130BarCodPar = new String[] {""} ;
      T01013_A194BarOrdLin = new short[1] ;
      T01013_A4035CCVal = new String[] {""} ;
      T01013_A396EmprCod = new String[] {""} ;
      T01013_A4031CCTCod = new int[1] ;
      T01013_A4034CCTLin = new short[1] ;
      T01013_A758ProCod = new String[] {""} ;
      T01012_A129BarCod = new int[1] ;
      T01012_A132BarCodReo = new byte[1] ;
      T01012_A130BarCodPar = new String[] {""} ;
      T01012_A194BarOrdLin = new short[1] ;
      T01012_A4035CCVal = new String[] {""} ;
      T01012_A396EmprCod = new String[] {""} ;
      T01012_A4031CCTCod = new int[1] ;
      T01012_A4034CCTLin = new short[1] ;
      T01012_A758ProCod = new String[] {""} ;
      T010129_A4043CCTLinDsc = new String[] {""} ;
      T010130_A396EmprCod = new String[] {""} ;
      T010130_A129BarCod = new int[1] ;
      T010130_A132BarCodReo = new byte[1] ;
      T010130_A130BarCodPar = new String[] {""} ;
      T010130_A758ProCod = new String[] {""} ;
      T010130_A194BarOrdLin = new short[1] ;
      T010130_A4031CCTCod = new int[1] ;
      T010130_A4034CCTLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i7691CCFchUti = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T010131_A407EmprNom = new String[] {""} ;
      T010131_n407EmprNom = new boolean[] {false} ;
      T010132_A1909BarGraAca = new short[1] ;
      T010132_A3137BarGraAca2 = new short[1] ;
      T010132_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010132_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010132_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010132_A125BarAncAca1 = new short[1] ;
      T010132_A126BarAncAca2 = new short[1] ;
      T010132_A143BarDisNum = new String[] {""} ;
      T010132_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T010132_A135BarColNom = new String[] {""} ;
      T010132_A136BarColNum = new int[1] ;
      T010132_A1234BarNomCli = new String[] {""} ;
      T010132_A1235BarNumCli = new int[1] ;
      T010132_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010132_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010132_A212BarSer = new String[] {""} ;
      T010132_A4812BarEncCli = new String[] {""} ;
      T010132_A5351BarObsGrm = new String[] {""} ;
      T010132_A5352BarObsAnc = new String[] {""} ;
      T010132_A252CliCod = new int[1] ;
      T010132_n252CliCod = new boolean[] {false} ;
      T010133_A279CliNom = new String[] {""} ;
      T010134_A759ProDsc = new String[] {""} ;
      T010135_A457FasCod = new String[] {""} ;
      T010136_A460FasDsc = new String[] {""} ;
      T010137_A4036CCTDsc = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ7691CCFchUti = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ4033CCFch = GXutil.nullDate() ;
      ZZ4405CcDisp = "" ;
      ZZ3281CcObs = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      ZZ759ProDsc = "" ;
      ZZ4036CCTDsc = "" ;
      ZZ1224BarEncAnh = DecimalUtil.ZERO ;
      ZZ1223BarEncCom = DecimalUtil.ZERO ;
      ZZ1911BarRdoA = DecimalUtil.ZERO ;
      ZZ143BarDisNum = "" ;
      ZZ155BarFecCli = GXutil.nullDate() ;
      ZZ135BarColNom = "" ;
      ZZ1234BarNomCli = "" ;
      ZZ141BarCosPro = DecimalUtil.ZERO ;
      ZZ140BarCosAny = DecimalUtil.ZERO ;
      ZZ212BarSer = "" ;
      ZZ4812BarEncCli = "" ;
      ZZ279CliNom = "" ;
      ZZ5351BarObsGrm = "" ;
      ZZ5352BarObsAnc = "" ;
      ZZ11628CCobs2 = "" ;
      GXt_char4 = "" ;
      Z5627CCTValD = "" ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_int9 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int6 = new byte[1] ;
      ZV57OldCcVal = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tinccar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tinccar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tinccar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tinccar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tinccar__default(),
         new Object[] {
             new Object[] {
            T01012_A129BarCod, T01012_A132BarCodReo, T01012_A130BarCodPar, T01012_A194BarOrdLin, T01012_A4035CCVal, T01012_A396EmprCod, T01012_A4031CCTCod, T01012_A4034CCTLin, T01012_A758ProCod
            }
            , new Object[] {
            T01013_A129BarCod, T01013_A132BarCodReo, T01013_A130BarCodPar, T01013_A194BarOrdLin, T01013_A4035CCVal, T01013_A396EmprCod, T01013_A4031CCTCod, T01013_A4034CCTLin, T01013_A758ProCod
            }
            , new Object[] {
            T01014_A4043CCTLinDsc
            }
            , new Object[] {
            T01015_A7691CCFchUti, T01015_n7691CCFchUti, T01015_A4032CCOpeCod, T01015_n4032CCOpeCod, T01015_A4033CCFch, T01015_n4033CCFch, T01015_A4405CcDisp, T01015_n4405CcDisp, T01015_A3281CcObs, T01015_n3281CcObs,
            T01015_A11293CcUltn, T01015_n11293CcUltn, T01015_A11628CCobs2, T01015_n11628CCobs2, T01015_A396EmprCod, T01015_A129BarCod, T01015_A132BarCodReo, T01015_A130BarCodPar, T01015_A758ProCod, T01015_A194BarOrdLin,
            T01015_A4031CCTCod
            }
            , new Object[] {
            T01016_A7691CCFchUti, T01016_n7691CCFchUti, T01016_A4032CCOpeCod, T01016_n4032CCOpeCod, T01016_A4033CCFch, T01016_n4033CCFch, T01016_A4405CcDisp, T01016_n4405CcDisp, T01016_A3281CcObs, T01016_n3281CcObs,
            T01016_A11293CcUltn, T01016_n11293CcUltn, T01016_A11628CCobs2, T01016_n11628CCobs2, T01016_A396EmprCod, T01016_A129BarCod, T01016_A132BarCodReo, T01016_A130BarCodPar, T01016_A758ProCod, T01016_A194BarOrdLin,
            T01016_A4031CCTCod
            }
            , new Object[] {
            T01017_A407EmprNom, T01017_n407EmprNom
            }
            , new Object[] {
            T01018_A1909BarGraAca, T01018_A3137BarGraAca2, T01018_A1224BarEncAnh, T01018_A1223BarEncCom, T01018_A1911BarRdoA, T01018_A125BarAncAca1, T01018_A126BarAncAca2, T01018_A143BarDisNum, T01018_A155BarFecCli, T01018_A135BarColNom,
            T01018_A136BarColNum, T01018_A1234BarNomCli, T01018_A1235BarNumCli, T01018_A141BarCosPro, T01018_A140BarCosAny, T01018_A212BarSer, T01018_A4812BarEncCli, T01018_A5351BarObsGrm, T01018_A5352BarObsAnc, T01018_A252CliCod,
            T01018_n252CliCod
            }
            , new Object[] {
            T01019_A759ProDsc
            }
            , new Object[] {
            T010110_A457FasCod
            }
            , new Object[] {
            T010111_A4036CCTDsc
            }
            , new Object[] {
            T010112_A460FasDsc
            }
            , new Object[] {
            T010113_A279CliNom
            }
            , new Object[] {
            T010114_A7691CCFchUti, T010114_n7691CCFchUti, T010114_A407EmprNom, T010114_n407EmprNom, T010114_A4032CCOpeCod, T010114_n4032CCOpeCod, T010114_A4033CCFch, T010114_n4033CCFch, T010114_A4405CcDisp, T010114_n4405CcDisp,
            T010114_A3281CcObs, T010114_n3281CcObs, T010114_A460FasDsc, T010114_A759ProDsc, T010114_A4036CCTDsc, T010114_A1909BarGraAca, T010114_A3137BarGraAca2, T010114_A1224BarEncAnh, T010114_A1223BarEncCom, T010114_A1911BarRdoA,
            T010114_A125BarAncAca1, T010114_A126BarAncAca2, T010114_A143BarDisNum, T010114_A155BarFecCli, T010114_A135BarColNom, T010114_A136BarColNum, T010114_A1234BarNomCli, T010114_A1235BarNumCli, T010114_A141BarCosPro, T010114_A140BarCosAny,
            T010114_A212BarSer, T010114_A4812BarEncCli, T010114_A279CliNom, T010114_A5351BarObsGrm, T010114_A5352BarObsAnc, T010114_A11293CcUltn, T010114_n11293CcUltn, T010114_A11628CCobs2, T010114_n11628CCobs2, T010114_A396EmprCod,
            T010114_A129BarCod, T010114_A132BarCodReo, T010114_A130BarCodPar, T010114_A758ProCod, T010114_A194BarOrdLin, T010114_A4031CCTCod, T010114_A457FasCod, T010114_A252CliCod, T010114_n252CliCod
            }
            , new Object[] {
            T010115_A396EmprCod, T010115_A129BarCod, T010115_A132BarCodReo, T010115_A130BarCodPar, T010115_A758ProCod, T010115_A194BarOrdLin, T010115_A4031CCTCod
            }
            , new Object[] {
            T010116_A396EmprCod, T010116_A129BarCod, T010116_A132BarCodReo, T010116_A130BarCodPar, T010116_A758ProCod, T010116_A194BarOrdLin, T010116_A4031CCTCod
            }
            , new Object[] {
            T010117_A396EmprCod, T010117_A129BarCod, T010117_A132BarCodReo, T010117_A130BarCodPar, T010117_A758ProCod, T010117_A194BarOrdLin, T010117_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010121_A396EmprCod, T010121_A129BarCod, T010121_A132BarCodReo, T010121_A130BarCodPar, T010121_A758ProCod, T010121_A194BarOrdLin, T010121_A4031CCTCod, T010121_A11294CcLn
            }
            , new Object[] {
            T010122_A396EmprCod, T010122_A129BarCod, T010122_A132BarCodReo, T010122_A130BarCodPar, T010122_A758ProCod, T010122_A194BarOrdLin, T010122_A4031CCTCod
            }
            , new Object[] {
            T010123_A129BarCod, T010123_A132BarCodReo, T010123_A130BarCodPar, T010123_A194BarOrdLin, T010123_A4043CCTLinDsc, T010123_A4035CCVal, T010123_A396EmprCod, T010123_A4031CCTCod, T010123_A4034CCTLin, T010123_A758ProCod
            }
            , new Object[] {
            T010124_A4043CCTLinDsc
            }
            , new Object[] {
            T010125_A396EmprCod, T010125_A129BarCod, T010125_A132BarCodReo, T010125_A130BarCodPar, T010125_A758ProCod, T010125_A194BarOrdLin, T010125_A4031CCTCod, T010125_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010129_A4043CCTLinDsc
            }
            , new Object[] {
            T010130_A396EmprCod, T010130_A129BarCod, T010130_A132BarCodReo, T010130_A130BarCodPar, T010130_A758ProCod, T010130_A194BarOrdLin, T010130_A4031CCTCod, T010130_A4034CCTLin
            }
            , new Object[] {
            T010131_A407EmprNom, T010131_n407EmprNom
            }
            , new Object[] {
            T010132_A1909BarGraAca, T010132_A3137BarGraAca2, T010132_A1224BarEncAnh, T010132_A1223BarEncCom, T010132_A1911BarRdoA, T010132_A125BarAncAca1, T010132_A126BarAncAca2, T010132_A143BarDisNum, T010132_A155BarFecCli, T010132_A135BarColNom,
            T010132_A136BarColNum, T010132_A1234BarNomCli, T010132_A1235BarNumCli, T010132_A141BarCosPro, T010132_A140BarCosAny, T010132_A212BarSer, T010132_A4812BarEncCli, T010132_A5351BarObsGrm, T010132_A5352BarObsAnc, T010132_A252CliCod,
            T010132_n252CliCod
            }
            , new Object[] {
            T010133_A279CliNom
            }
            , new Object[] {
            T010134_A759ProDsc
            }
            , new Object[] {
            T010135_A457FasCod
            }
            , new Object[] {
            T010136_A460FasDsc
            }
            , new Object[] {
            T010137_A4036CCTDsc
            }
         }
      );
      Z4031CCTCod = 0 ;
      A4031CCTCod = 0 ;
      Z194BarOrdLin = (short)(0) ;
      A194BarOrdLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV59Pgmname = "TInCCar" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV31Ok ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte GXv_int13[] ;
   private byte GXv_int6[] ;
   private byte ZV31Ok ;
   private short wcpOA194BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z11293CcUltn ;
   private short Z4034CCTLin ;
   private short nRcdDeleted_620 ;
   private short nRcdExists_620 ;
   private short nIsMod_620 ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A11293CcUltn ;
   private short nBlankRcdCount620 ;
   private short RcdFound620 ;
   private short nBlankRcdUsr620 ;
   private short AV55Tab_lin[] ;
   private short Z1909BarGraAca ;
   private short Z3137BarGraAca2 ;
   private short Z125BarAncAca1 ;
   private short Z126BarAncAca2 ;
   private short RcdFound619 ;
   private short nIsDirty_619 ;
   private short nIsDirty_620 ;
   private short ZZ194BarOrdLin ;
   private short ZZ1909BarGraAca ;
   private short ZZ3137BarGraAca2 ;
   private short ZZ125BarAncAca1 ;
   private short ZZ126BarAncAca2 ;
   private short ZZ11293CcUltn ;
   private short GXv_int12[] ;
   private short GXv_int7[] ;
   private int wcpOA129BarCod ;
   private int wcpOA4031CCTCod ;
   private int wcpOAV37BarPie ;
   private int wcpOAV43DisCod ;
   private int Z129BarCod ;
   private int Z4031CCTCod ;
   private int Z4032CCOpeCod ;
   private int nRC_GXsfl_220 ;
   private int nGXsfl_220_idx=1 ;
   private int A4032CCOpeCod ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private int AV37BarPie ;
   private int AV43DisCod ;
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
   private int edtProCod_Visible ;
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtBarOrdLin_Visible ;
   private int edtCCTCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCCOpeCod_Enabled ;
   private int edtCCFch_Enabled ;
   private int edtCcDisp_Enabled ;
   private int edtCcObs_Enabled ;
   private int edtFasCod_Visible ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Visible ;
   private int edtFasDsc_Enabled ;
   private int edtProDsc_Visible ;
   private int edtProDsc_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtBarGraAca_Enabled ;
   private int edtBarGraAca2_Enabled ;
   private int edtBarEncAnh_Enabled ;
   private int edtBarEncCom_Enabled ;
   private int edtBarRdoA_Enabled ;
   private int edtBarAncAca1_Enabled ;
   private int edtBarAncAca2_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtBarFecCli_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int A1235BarNumCli ;
   private int edtBarNumCli_Enabled ;
   private int edtBarCosPro_Enabled ;
   private int edtBarCosAny_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtCCFchUti_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarObsGrm_Enabled ;
   private int edtBarObsAnc_Enabled ;
   private int edtCcUltn_Enabled ;
   private int edtCCobs2_Enabled ;
   private int edtavnRcdDeleted_620_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCVal_Enabled ;
   private int edtCCTValD_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private int AV50Nt ;
   private int AV51Nval ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z1235BarNumCli ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCCTValD_Enabled ;
   private int defedtCCTLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCCobs2_Backcolor ;
   private int edtCcUltn_Backcolor ;
   private int edtBarObsAnc_Backcolor ;
   private int edtBarObsGrm_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtCCFchUti_Backcolor ;
   private int edtBarEncCli_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtBarCosAny_Backcolor ;
   private int edtBarCosPro_Backcolor ;
   private int edtBarNumCli_Backcolor ;
   private int edtBarNomCli_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarFecCli_Backcolor ;
   private int edtBarDisNum_Backcolor ;
   private int edtBarAncAca2_Backcolor ;
   private int edtBarAncAca1_Backcolor ;
   private int edtBarRdoA_Backcolor ;
   private int edtBarEncCom_Backcolor ;
   private int edtBarEncAnh_Backcolor ;
   private int edtBarGraAca2_Backcolor ;
   private int edtBarGraAca_Backcolor ;
   private int edtCCTDsc_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtCcObs_Backcolor ;
   private int edtCcDisp_Backcolor ;
   private int edtCCFch_Backcolor ;
   private int edtCCOpeCod_Backcolor ;
   private int edtCCTCod_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4031CCTCod ;
   private int ZZ4032CCOpeCod ;
   private int ZZ136BarColNum ;
   private int ZZ1235BarNumCli ;
   private int ZZ252CliCod ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int GX_I ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV35BarKgm ;
   private java.math.BigDecimal wcpOAV36BarMtr ;
   private java.math.BigDecimal AV35BarKgm ;
   private java.math.BigDecimal AV36BarMtr ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal Z1224BarEncAnh ;
   private java.math.BigDecimal Z1223BarEncCom ;
   private java.math.BigDecimal Z1911BarRdoA ;
   private java.math.BigDecimal Z141BarCosPro ;
   private java.math.BigDecimal Z140BarCosAny ;
   private java.math.BigDecimal ZZ1224BarEncAnh ;
   private java.math.BigDecimal ZZ1223BarEncCom ;
   private java.math.BigDecimal ZZ1911BarRdoA ;
   private java.math.BigDecimal ZZ141BarCosPro ;
   private java.math.BigDecimal ZZ140BarCosAny ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z4405CcDisp ;
   private String Z4035CCVal ;
   private String O4035CCVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV45OpeNom ;
   private String A130BarCodPar ;
   private String AV47ForTonal ;
   private String A758ProCod ;
   private String A4035CCVal ;
   private String AV59Pgmname ;
   private String AV8UsurCod ;
   private String AV29Station ;
   private String AV57OldCcVal ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCOpeCod_Internalname ;
   private String sGXsfl_220_idx="0001" ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCCOpeCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCCFch_Internalname ;
   private String edtCCFch_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCcDisp_Internalname ;
   private String A4405CcDisp ;
   private String edtCcDisp_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCcObs_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarGraAca_Internalname ;
   private String edtBarGraAca_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarGraAca2_Internalname ;
   private String edtBarGraAca2_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarEncAnh_Internalname ;
   private String edtBarEncAnh_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarEncCom_Internalname ;
   private String edtBarEncCom_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarRdoA_Internalname ;
   private String edtBarRdoA_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarAncAca1_Internalname ;
   private String edtBarAncAca1_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarAncAca2_Internalname ;
   private String edtBarAncAca2_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecCli_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNumCli_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBarCosPro_Internalname ;
   private String edtBarCosPro_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarCosAny_Internalname ;
   private String edtBarCosAny_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBarEncCli_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtCCFchUti_Internalname ;
   private String edtCCFchUti_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtBarObsGrm_Internalname ;
   private String A5351BarObsGrm ;
   private String edtBarObsGrm_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtBarObsAnc_Internalname ;
   private String A5352BarObsAnc ;
   private String edtBarObsAnc_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtCcUltn_Internalname ;
   private String edtCcUltn_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtCCobs2_Internalname ;
   private String sMode620 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_620_Internalname ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLinDsc_Internalname ;
   private String edtCCVal_Internalname ;
   private String edtCCTValD_Internalname ;
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
   private String sMode619 ;
   private String A4043CCTLinDsc ;
   private String T4035CCVal ;
   private String AV30EmprNom ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV10Lit1 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV11Lit10 ;
   private String AV12Lit11 ;
   private String AV13Lit12 ;
   private String AV16Lit15 ;
   private String AV18Lit17 ;
   private String AV33Lit40 ;
   private String AV34Lit41 ;
   private String AV19Lit18 ;
   private String AV38Lit45 ;
   private String AV14Lit13 ;
   private String AV15Lit14 ;
   private String AV17Lit16 ;
   private String AV41Lit47 ;
   private String AV42Lit48 ;
   private String AV39Lit63 ;
   private String AV40Lit30 ;
   private String AV44Lit80 ;
   private String AV46Lit73 ;
   private String AV48Lit81 ;
   private String AV49Lit82 ;
   private String AV53Lit400 ;
   private String AV54ImpCod ;
   private String Gx_msg ;
   private String AV56Tab_val[] ;
   private String Z407EmprNom ;
   private String Z143BarDisNum ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String Z212BarSer ;
   private String Z4812BarEncCli ;
   private String Z5351BarObsGrm ;
   private String Z5352BarObsAnc ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z457FasCod ;
   private String Z460FasDsc ;
   private String Z4036CCTDsc ;
   private String Z4043CCTLinDsc ;
   private String GXCCtl ;
   private String sGXsfl_220_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_620_Jsonclick ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCVal_Jsonclick ;
   private String edtCCTValD_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ4405CcDisp ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private String ZZ759ProDsc ;
   private String ZZ4036CCTDsc ;
   private String ZZ143BarDisNum ;
   private String ZZ135BarColNom ;
   private String ZZ1234BarNomCli ;
   private String ZZ212BarSer ;
   private String ZZ4812BarEncCli ;
   private String ZZ279CliNom ;
   private String ZZ5351BarObsGrm ;
   private String ZZ5352BarObsAnc ;
   private String GXt_char4 ;
   private String GXv_char11[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String ZV57OldCcVal ;
   private java.util.Date Z7691CCFchUti ;
   private java.util.Date Z4033CCFch ;
   private java.util.Date A4033CCFch ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A7691CCFchUti ;
   private java.util.Date Z155BarFecCli ;
   private java.util.Date i7691CCFchUti ;
   private java.util.Date ZZ7691CCFchUti ;
   private java.util.Date ZZ4033CCFch ;
   private java.util.Date ZZ155BarFecCli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4032CCOpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_220_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4033CCFch ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean n7691CCFchUti ;
   private boolean n252CliCod ;
   private boolean n11293CcUltn ;
   private boolean n11628CCobs2 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z3281CcObs ;
   private String Z11628CCobs2 ;
   private String AV58Inc_obs ;
   private String A3281CcObs ;
   private String A11628CCobs2 ;
   private String A5627CCTValD ;
   private String ZZ3281CcObs ;
   private String ZZ11628CCobs2 ;
   private String Z5627CCTValD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01017_A407EmprNom ;
   private boolean[] T01017_n407EmprNom ;
   private short[] T01018_A1909BarGraAca ;
   private short[] T01018_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T01018_A1224BarEncAnh ;
   private java.math.BigDecimal[] T01018_A1223BarEncCom ;
   private java.math.BigDecimal[] T01018_A1911BarRdoA ;
   private short[] T01018_A125BarAncAca1 ;
   private short[] T01018_A126BarAncAca2 ;
   private String[] T01018_A143BarDisNum ;
   private java.util.Date[] T01018_A155BarFecCli ;
   private String[] T01018_A135BarColNom ;
   private int[] T01018_A136BarColNum ;
   private String[] T01018_A1234BarNomCli ;
   private int[] T01018_A1235BarNumCli ;
   private java.math.BigDecimal[] T01018_A141BarCosPro ;
   private java.math.BigDecimal[] T01018_A140BarCosAny ;
   private String[] T01018_A212BarSer ;
   private String[] T01018_A4812BarEncCli ;
   private String[] T01018_A5351BarObsGrm ;
   private String[] T01018_A5352BarObsAnc ;
   private int[] T01018_A252CliCod ;
   private boolean[] T01018_n252CliCod ;
   private String[] T010113_A279CliNom ;
   private String[] T01019_A759ProDsc ;
   private String[] T010110_A457FasCod ;
   private String[] T010112_A460FasDsc ;
   private String[] T010111_A4036CCTDsc ;
   private java.util.Date[] T010114_A7691CCFchUti ;
   private boolean[] T010114_n7691CCFchUti ;
   private String[] T010114_A407EmprNom ;
   private boolean[] T010114_n407EmprNom ;
   private int[] T010114_A4032CCOpeCod ;
   private boolean[] T010114_n4032CCOpeCod ;
   private java.util.Date[] T010114_A4033CCFch ;
   private boolean[] T010114_n4033CCFch ;
   private String[] T010114_A4405CcDisp ;
   private boolean[] T010114_n4405CcDisp ;
   private String[] T010114_A3281CcObs ;
   private boolean[] T010114_n3281CcObs ;
   private String[] T010114_A460FasDsc ;
   private String[] T010114_A759ProDsc ;
   private String[] T010114_A4036CCTDsc ;
   private short[] T010114_A1909BarGraAca ;
   private short[] T010114_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T010114_A1224BarEncAnh ;
   private java.math.BigDecimal[] T010114_A1223BarEncCom ;
   private java.math.BigDecimal[] T010114_A1911BarRdoA ;
   private short[] T010114_A125BarAncAca1 ;
   private short[] T010114_A126BarAncAca2 ;
   private String[] T010114_A143BarDisNum ;
   private java.util.Date[] T010114_A155BarFecCli ;
   private String[] T010114_A135BarColNom ;
   private int[] T010114_A136BarColNum ;
   private String[] T010114_A1234BarNomCli ;
   private int[] T010114_A1235BarNumCli ;
   private java.math.BigDecimal[] T010114_A141BarCosPro ;
   private java.math.BigDecimal[] T010114_A140BarCosAny ;
   private String[] T010114_A212BarSer ;
   private String[] T010114_A4812BarEncCli ;
   private String[] T010114_A279CliNom ;
   private String[] T010114_A5351BarObsGrm ;
   private String[] T010114_A5352BarObsAnc ;
   private short[] T010114_A11293CcUltn ;
   private boolean[] T010114_n11293CcUltn ;
   private String[] T010114_A11628CCobs2 ;
   private boolean[] T010114_n11628CCobs2 ;
   private String[] T010114_A396EmprCod ;
   private int[] T010114_A129BarCod ;
   private byte[] T010114_A132BarCodReo ;
   private String[] T010114_A130BarCodPar ;
   private String[] T010114_A758ProCod ;
   private short[] T010114_A194BarOrdLin ;
   private int[] T010114_A4031CCTCod ;
   private String[] T010114_A457FasCod ;
   private int[] T010114_A252CliCod ;
   private boolean[] T010114_n252CliCod ;
   private String[] T010115_A396EmprCod ;
   private int[] T010115_A129BarCod ;
   private byte[] T010115_A132BarCodReo ;
   private String[] T010115_A130BarCodPar ;
   private String[] T010115_A758ProCod ;
   private short[] T010115_A194BarOrdLin ;
   private int[] T010115_A4031CCTCod ;
   private java.util.Date[] T01016_A7691CCFchUti ;
   private boolean[] T01016_n7691CCFchUti ;
   private int[] T01016_A4032CCOpeCod ;
   private boolean[] T01016_n4032CCOpeCod ;
   private java.util.Date[] T01016_A4033CCFch ;
   private boolean[] T01016_n4033CCFch ;
   private String[] T01016_A4405CcDisp ;
   private boolean[] T01016_n4405CcDisp ;
   private String[] T01016_A3281CcObs ;
   private boolean[] T01016_n3281CcObs ;
   private short[] T01016_A11293CcUltn ;
   private boolean[] T01016_n11293CcUltn ;
   private String[] T01016_A11628CCobs2 ;
   private boolean[] T01016_n11628CCobs2 ;
   private String[] T01016_A396EmprCod ;
   private int[] T01016_A129BarCod ;
   private byte[] T01016_A132BarCodReo ;
   private String[] T01016_A130BarCodPar ;
   private String[] T01016_A758ProCod ;
   private short[] T01016_A194BarOrdLin ;
   private int[] T01016_A4031CCTCod ;
   private String[] T010116_A396EmprCod ;
   private int[] T010116_A129BarCod ;
   private byte[] T010116_A132BarCodReo ;
   private String[] T010116_A130BarCodPar ;
   private String[] T010116_A758ProCod ;
   private short[] T010116_A194BarOrdLin ;
   private int[] T010116_A4031CCTCod ;
   private String[] T010117_A396EmprCod ;
   private int[] T010117_A129BarCod ;
   private byte[] T010117_A132BarCodReo ;
   private String[] T010117_A130BarCodPar ;
   private String[] T010117_A758ProCod ;
   private short[] T010117_A194BarOrdLin ;
   private int[] T010117_A4031CCTCod ;
   private java.util.Date[] T01015_A7691CCFchUti ;
   private boolean[] T01015_n7691CCFchUti ;
   private int[] T01015_A4032CCOpeCod ;
   private boolean[] T01015_n4032CCOpeCod ;
   private java.util.Date[] T01015_A4033CCFch ;
   private boolean[] T01015_n4033CCFch ;
   private String[] T01015_A4405CcDisp ;
   private boolean[] T01015_n4405CcDisp ;
   private String[] T01015_A3281CcObs ;
   private boolean[] T01015_n3281CcObs ;
   private short[] T01015_A11293CcUltn ;
   private boolean[] T01015_n11293CcUltn ;
   private String[] T01015_A11628CCobs2 ;
   private boolean[] T01015_n11628CCobs2 ;
   private String[] T01015_A396EmprCod ;
   private int[] T01015_A129BarCod ;
   private byte[] T01015_A132BarCodReo ;
   private String[] T01015_A130BarCodPar ;
   private String[] T01015_A758ProCod ;
   private short[] T01015_A194BarOrdLin ;
   private int[] T01015_A4031CCTCod ;
   private String[] T010121_A396EmprCod ;
   private int[] T010121_A129BarCod ;
   private byte[] T010121_A132BarCodReo ;
   private String[] T010121_A130BarCodPar ;
   private String[] T010121_A758ProCod ;
   private short[] T010121_A194BarOrdLin ;
   private int[] T010121_A4031CCTCod ;
   private short[] T010121_A11294CcLn ;
   private String[] T010122_A396EmprCod ;
   private int[] T010122_A129BarCod ;
   private byte[] T010122_A132BarCodReo ;
   private String[] T010122_A130BarCodPar ;
   private String[] T010122_A758ProCod ;
   private short[] T010122_A194BarOrdLin ;
   private int[] T010122_A4031CCTCod ;
   private int[] T010123_A129BarCod ;
   private byte[] T010123_A132BarCodReo ;
   private String[] T010123_A130BarCodPar ;
   private short[] T010123_A194BarOrdLin ;
   private String[] T010123_A4043CCTLinDsc ;
   private String[] T010123_A4035CCVal ;
   private String[] T010123_A396EmprCod ;
   private int[] T010123_A4031CCTCod ;
   private short[] T010123_A4034CCTLin ;
   private String[] T010123_A758ProCod ;
   private String[] T01014_A4043CCTLinDsc ;
   private String[] T010124_A4043CCTLinDsc ;
   private String[] T010125_A396EmprCod ;
   private int[] T010125_A129BarCod ;
   private byte[] T010125_A132BarCodReo ;
   private String[] T010125_A130BarCodPar ;
   private String[] T010125_A758ProCod ;
   private short[] T010125_A194BarOrdLin ;
   private int[] T010125_A4031CCTCod ;
   private short[] T010125_A4034CCTLin ;
   private int[] T01013_A129BarCod ;
   private byte[] T01013_A132BarCodReo ;
   private String[] T01013_A130BarCodPar ;
   private short[] T01013_A194BarOrdLin ;
   private String[] T01013_A4035CCVal ;
   private String[] T01013_A396EmprCod ;
   private int[] T01013_A4031CCTCod ;
   private short[] T01013_A4034CCTLin ;
   private String[] T01013_A758ProCod ;
   private int[] T01012_A129BarCod ;
   private byte[] T01012_A132BarCodReo ;
   private String[] T01012_A130BarCodPar ;
   private short[] T01012_A194BarOrdLin ;
   private String[] T01012_A4035CCVal ;
   private String[] T01012_A396EmprCod ;
   private int[] T01012_A4031CCTCod ;
   private short[] T01012_A4034CCTLin ;
   private String[] T01012_A758ProCod ;
   private String[] T010129_A4043CCTLinDsc ;
   private String[] T010130_A396EmprCod ;
   private int[] T010130_A129BarCod ;
   private byte[] T010130_A132BarCodReo ;
   private String[] T010130_A130BarCodPar ;
   private String[] T010130_A758ProCod ;
   private short[] T010130_A194BarOrdLin ;
   private int[] T010130_A4031CCTCod ;
   private short[] T010130_A4034CCTLin ;
   private String[] T010131_A407EmprNom ;
   private boolean[] T010131_n407EmprNom ;
   private short[] T010132_A1909BarGraAca ;
   private short[] T010132_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T010132_A1224BarEncAnh ;
   private java.math.BigDecimal[] T010132_A1223BarEncCom ;
   private java.math.BigDecimal[] T010132_A1911BarRdoA ;
   private short[] T010132_A125BarAncAca1 ;
   private short[] T010132_A126BarAncAca2 ;
   private String[] T010132_A143BarDisNum ;
   private java.util.Date[] T010132_A155BarFecCli ;
   private String[] T010132_A135BarColNom ;
   private int[] T010132_A136BarColNum ;
   private String[] T010132_A1234BarNomCli ;
   private int[] T010132_A1235BarNumCli ;
   private java.math.BigDecimal[] T010132_A141BarCosPro ;
   private java.math.BigDecimal[] T010132_A140BarCosAny ;
   private String[] T010132_A212BarSer ;
   private String[] T010132_A4812BarEncCli ;
   private String[] T010132_A5351BarObsGrm ;
   private String[] T010132_A5352BarObsAnc ;
   private int[] T010132_A252CliCod ;
   private boolean[] T010132_n252CliCod ;
   private String[] T010133_A279CliNom ;
   private String[] T010134_A759ProDsc ;
   private String[] T010135_A457FasCod ;
   private String[] T010136_A460FasDsc ;
   private String[] T010137_A4036CCTDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tinccar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinccar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01012", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01013", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01014", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01015", "SELECT CCFchUti, CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, CCobs2, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCFchUti, CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, CCobs2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01016", "SELECT CCFchUti, CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, CCobs2, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01017", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01018", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarDisNum, BarFecCli, BarColNom, BarColNum, BarNomCli, BarNumCli, BarCosPro, BarCosAny, BarSer, BarEncCli, BarObsGrm, BarObsAnc, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01019", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010110", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010111", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010112", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010113", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010114", "SELECT /*+ FIRST_ROWS(1) */ TM1.CCFchUti, T2.EmprNom, TM1.CCOpeCod, TM1.CCFch, TM1.CcDisp, TM1.CcObs, T7.FasDsc, T5.ProDsc, T8.CCTDsc, T3.BarGraAca, T3.BarGraAca2, T3.BarEncAnh, T3.BarEncCom, T3.BarRdoA, T3.BarAncAca1, T3.BarAncAca2, T3.BarDisNum, T3.BarFecCli, T3.BarColNom, T3.BarColNum, T3.BarNomCli, T3.BarNumCli, T3.BarCosPro, T3.BarCosAny, T3.BarSer, T3.BarEncCli, T4.CliNom, T3.BarObsGrm, T3.BarObsAnc, TM1.CcUltn, TM1.CCobs2, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod, T6.FasCod, T3.CliCod FROM (((((((TXPCC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) INNER JOIN TXPBARFAS T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar AND T6.ProCod = TM1.ProCod AND T6.BarOrdLin = TM1.BarOrdLin) LEFT JOIN TXPFASPRO T7 ON T7.EmprCod = TM1.EmprCod AND T7.FasCod = T6.FasCod) INNER JOIN TXPCCDef T8 ON T8.EmprCod = TM1.EmprCod AND T8.CCTCod = TM1.CCTCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010115", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010116", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010117", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010118", "INSERT INTO TXPCC(CCFchUti, CCOpeCod, CCFch, CcDisp, CcObs, CcUltn, CCobs2, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCOk, CCOkFch, CCOkUsu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T010119", "UPDATE TXPCC SET CCFchUti=?, CCOpeCod=?, CCFch=?, CcDisp=?, CcObs=?, CcUltn=?, CCobs2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T010120", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new ForEachCursor("T010121", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010122", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010123", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T2.CCTLinDsc, T1.CCVal, T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.ProCod FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010124", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010125", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010126", "INSERT INTO TXPCC1(BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, EmprCod, CCTCod, CCTLin, ProCod, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T010127", "UPDATE TXPCC1 SET CCVal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T010128", "DELETE FROM TXPCC1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new ForEachCursor("T010129", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010130", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010131", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010132", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarDisNum, BarFecCli, BarColNom, BarColNum, BarNomCli, BarNumCli, BarCosPro, BarCosAny, BarSer, BarEncCli, BarObsGrm, BarObsAnc, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010133", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010134", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010135", "SELECT FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010136", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010137", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 3);
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((String[]) buf[18])[0] = rslt.getString(12, 8);
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 3);
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((String[]) buf[18])[0] = rslt.getString(12, 8);
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((String[]) buf[17])[0] = rslt.getString(18, 20);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 28);
               ((String[]) buf[13])[0] = rslt.getString(8, 40);
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[20])[0] = rslt.getShort(15);
               ((short[]) buf[21])[0] = rslt.getShort(16);
               ((String[]) buf[22])[0] = rslt.getString(17, 8);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 13);
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 13);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[30])[0] = rslt.getString(25, 16);
               ((String[]) buf[31])[0] = rslt.getString(26, 20);
               ((String[]) buf[32])[0] = rslt.getString(27, 30);
               ((String[]) buf[33])[0] = rslt.getString(28, 20);
               ((String[]) buf[34])[0] = rslt.getString(29, 20);
               ((short[]) buf[35])[0] = rslt.getShort(30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 3);
               ((int[]) buf[40])[0] = rslt.getInt(33);
               ((byte[]) buf[41])[0] = rslt.getByte(34);
               ((String[]) buf[42])[0] = rslt.getString(35, 1);
               ((String[]) buf[43])[0] = rslt.getString(36, 8);
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((int[]) buf[45])[0] = rslt.getInt(38);
               ((String[]) buf[46])[0] = rslt.getString(39, 8);
               ((int[]) buf[47])[0] = rslt.getInt(40);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((String[]) buf[17])[0] = rslt.getString(18, 20);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 16 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 400);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 300);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setByte(10, ((Number) parms[16]).byteValue());
               stmt.setString(11, (String)parms[17], 1);
               stmt.setString(12, (String)parms[18], 8);
               stmt.setShort(13, ((Number) parms[19]).shortValue());
               stmt.setInt(14, ((Number) parms[20]).intValue());
               return;
            case 17 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 400);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 300);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setByte(10, ((Number) parms[16]).byteValue());
               stmt.setString(11, (String)parms[17], 1);
               stmt.setString(12, (String)parms[18], 8);
               stmt.setShort(13, ((Number) parms[19]).shortValue());
               stmt.setInt(14, ((Number) parms[20]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 31 :
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
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

